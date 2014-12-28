var adminDashboard=angular.module("adminDashboard",['ngSanitize','restangular','ui.bootstrap','userProfile','angularFileUpload']);

adminDashboard.factory('adminDashboardService',['Restangular',
    function(Restangular){

        return {
            allSubjects:function(){
                var resp= Restangular.one('api/subject/list').get();

                return resp;
            },
            allChapters:function(){
                var resp= Restangular.one('api/chapter/list').get();

                return resp;
            },
            allConcepts:function(){
                var resp= Restangular.one('api/concept/list').get();

                return resp;
            },
            allTags:function(){
                var resp= Restangular.one('api/tag/list').get();

                return resp;
            },
            allUsers:function(){
                var resp= Restangular.one('api/users').get();

                return resp;
            },
            allShortNotes:function(){
                var resp= Restangular.one('api/shortnote/list').get();

                return resp;

            }
            ,allChaptersInSubject:function(subject){
                var resp= Restangular.one('chapter/list/subject').customPOST(subject, '', {}, {ContentType: 'application/json'});

                return resp;
            },
            addSubject:function(subjectName,subjectSlug,subjectText,subjectHtml,featuredImage,videoUrl){
                var k= Restangular.one('subject/add').customPOST({
                    "name":stripTags(subjectName),
                    "slug":stripTags(subjectSlug),
                    "description":subjectText,
                    "descriptionHtml":subjectHtml,
                    "featuredImage":featuredImage,
                    "videoUrl":videoUrl
                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            addChapter:function(chapterName,chapterSlug,chapterText,chapterHtml,chapterSubject,featuredImage){
                var k= Restangular.one('chapter/add').customPOST({
                    "name":stripTags(chapterName),
                    "slug":stripTags(chapterSlug),
                    "description":chapterText,
                    "descriptionHtml":chapterHtml,
                    "subject":chapterSubject.id,
                    "featuredImage":featuredImage
                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            addConcept:function(conceptName,conceptSlug,conceptChapter,conceptText,conceptHtml,featuredImage){
                var k= Restangular.one('concept/add').customPOST({
                    "name":stripTags(conceptName),
                    "slug":stripTags(conceptSlug),
                    "chapter":conceptChapter.id,
                    "description":conceptText,
                    "descriptionHtml":conceptHtml,
                    "featuredImage":featuredImage
                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            addTag:function(tagName,tagSlug,tagText,tagHtml,tagChapter,featuredImage){
                var tagChapterIds=[];
                for(var i=0;i<tagChapter.length;i++){
                    tagChapterIds.push(tagChapter[i].id);
                }
                var k= Restangular.one('tag/add').customPOST({
                    "name":stripTags(tagName),
                    "slug":stripTags(tagSlug),
                    "description":tagText,
                    "descriptionHtml":tagHtml,
                    "chapters":tagChapterIds,
                    "featuredImage":featuredImage

                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            getTag:function(slug){
                return Restangular.one('tag').get({"slug":slug});
            },
            getSubject:function(slug){
                return Restangular.one('subject').get({"slug":slug});
            },
            getChapter:function(slug){
                return Restangular.one('chapter').get({"slug":slug});
            },
            getConcept:function(slug){
                return Restangular.one('concept').get({"slug":slug});
            },
            chapterMoveUp:function(id){
                var k= Restangular.one('chapter/moveup').customPOST({
                    "id":id

                    }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            chapterMoveDown:function(id){
                var k= Restangular.one('chapter/movedown').customPOST({
                    "id":id

                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            conceptMoveUp:function(id){
                var k= Restangular.one('concept/moveup').customPOST({
                    "id":id

                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            conceptMoveDown:function(id){
                var k= Restangular.one('concept/movedown').customPOST({
                    "id":id

                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            flagAs:function(id,string){
                var k= Restangular.one('shortnote/flag').customPOST({
                    "id":id,
                    "flag":string

                }, '', {}, {ContentType: 'application/json'});
                return k;
            },changeRole:function(checkedUsers,role){
                var k= Restangular.one('api/m/users/change/role').customPOST({
                    "users":checkedUsers,
                    "role":stripTags(role)
                    }, '', {}, {ContentType: 'application/json'});
                return k;
            }


        }

    }]);


adminDashboard.controller('subjectController',['$scope','adminDashboardService',
function($scope,adminDashboardService){
    $scope.init=function(){
        $scope.showAddSubjectForm=false;
        $scope.showAddChapterForm=false;
        $scope.showAddConceptForm=false;
        $scope.showAddTagForm=false;
        $scope.tagChapter='';
        $scope.chaptersWithTag=[];


        $scope.allSubjectsFunction=function(){
            adminDashboardService.allSubjects().then(function(response){
               $scope.subjectsList=response.subjects;
                $scope.subjectSlugs=[];
                for(var i=0;i<$scope.subjectsList.length;i++){
                    $scope.subjectSlugs.push($scope.subjectsList[i].slug);
                }

                $scope.chapterSubject = $scope.subjectsList[0];
            });
        }

        $scope.allChaptersFunction=function(){
            adminDashboardService.allChapters().then(function(response){
                $scope.chaptersList=response.chapters;
                $scope.chapterSlugs=[];
                for(var i=0;i<$scope.chaptersList.length;i++){
                    $scope.chapterSlugs.push($scope.chaptersList[i].slug);
                }
                $scope.conceptChapter = $scope.chaptersList[0];
            });
        }
        $scope.allConceptsFunction=function(){
            adminDashboardService.allConcepts().then(function(response){
                $scope.conceptsList=response.concepts;
                $scope.conceptSlugs=[];
                for(var i=0;i<$scope.conceptsList.length;i++){
                    $scope.conceptSlugs.push($scope.conceptsList[i].slug);
                }
            });
        }
        $scope.allTagsFunction=function(){
            adminDashboardService.allTags().then(function(response){
                $scope.tagsList=response.tags;
                $scope.tagSlugs=[];
                for(var i=0;i<$scope.tagsList.length;i++){
                    $scope.tagSlugs.push($scope.tagsList[i].slug);
                }
            });
        }


        $scope.$watch('chapterSubject',function(){
            if($scope.chapterSubject){
                $scope.getChaptersFromSubject($scope.chapterSubject);
            }

        });
        $scope.allSubjectsFunction();
        $scope.allChaptersFunction();
        $scope.allConceptsFunction();
        $scope.allTagsFunction();

    }



    $scope.addChap=function(){

        tinyMCE.triggerSave();
        $scope.chapterHtml = $.trim($("#add-chapter-form  .editor").val());
        $scope.chapterText=$("<div/>").html($scope.chapterHtml).text();
        if($("#featuredImage").find("img").length>0){
            $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
        }
        else{
            $scope.fId=undefined;
        }
        adminDashboardService.addChapter($scope.chapterName,$scope.chapterSlug,$scope.chapterText,$scope.chapterHtml,$scope.chapterSubject,$scope.fId).then(function(response){
            location.reload();
        });
    }
    $scope.addCon=function(){
        tinyMCE.triggerSave();
        $scope.conceptHtml= $.trim($("#add-concept-form .editor").val());
        $scope.conceptText=$("<div/>").html($scope.conceptHtml).text();
        if($("#featuredImage").find("img").length>0){
            $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
        }
        else{
            $scope.fId=undefined;
        }
        adminDashboardService.addConcept($scope.conceptName,$scope.conceptSlug,$scope.conceptChapter,$scope.conceptText,$scope.conceptHtml,$scope.fId).then(function(response){
            location.reload();
        });
    }

    $scope.addSub=function(){

        tinyMCE.triggerSave();
        $scope.subjectHtml = $.trim($("#add-subject-form .editor").val());
        $scope.subjectText=$("<div/>").html($scope.noteHtml).text();
        if($("#featuredImage").find("img").length>0){
            $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
        }
        else{
            $scope.fId=undefined;
        }


        adminDashboardService.addSubject($scope.subjectName,$scope.subjectSlug,$scope.subjectText,$scope.subjectHtml,$scope.fId,$scope.videoUrl).then(function(response){
            location.reload();
        });
    }

    $scope.addTag=function(){
        tinyMCE.triggerSave();
        $scope.tagHtml = $.trim($("#add-tag-form .editor").val());
        $scope.tagText=$("<div/>").html($scope.tagHtml).text();
        if($("#featuredImage").find("img").length>0){
            $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
        }
        else{
            $scope.fId=undefined;
        }
        adminDashboardService.addTag($scope.tagName,$scope.tagSlug,$scope.tagText,$scope.tagHtml,$scope.chaptersWithTag,$scope.fId).then(function(response){
            location.reload();
        });
    }
    $scope.addChapterToTag=function(a){
        if($scope.chaptersWithTag.indexOf(a)<0){
            $scope.chaptersWithTag.push(a);
            $("#add-tag-form .chapters-well").append('<div class="btn-group"> <button class="btn btn-primary btn-lg close tag-chapter-btn" id="tagWithChapterId'+ parseInt(a.id)+'" type="button" style="padding:0 15px"> '+ a.slug+'<span><i class="fa fa-times"></i></span> </button></div>');
            $scope.clearTagChapterInput();
        }
    }
    $scope.clearTagChapterInput=function(){
        $("#tag-chapter-input").val("");
    }


    $scope.removeChapterFromTag=function(id){
            for(var i =0; i<$scope.chaptersWithTag.length;i++){
                if(parseInt($scope.chaptersWithTag[i].id)==parseInt(id)){
                   $scope.chaptersWithTag.splice(i,1);
                    $scope.clearTagChapterInput();
                }
            }
    }
    $scope.getChaptersFromSubject=function(subject){
            adminDashboardService.allChaptersInSubject(subject).then(function(response){
                $scope.chaptersInSub=response.chapters;
            })
    }
    $("body").on("click",".tag-chapter-btn",function(){
        $(this).remove();
        $scope.removeChapterFromTag(parseInt($(this).attr('id').substring(16)));
    });
}]);

adminDashboard.directive('duplicate',function(){
    return {
        restrict: 'A',
        require: 'ngModel',
        link: function (scope, elm, attrs, ctrl) {
            ctrl.$parsers.unshift(function (viewValue) {

                var duplicate = scope[attrs.duplicate];
                if (duplicate.indexOf(viewValue) > -1) {
                    ctrl.$setValidity('duplicate', false);
                    return undefined;
                } else {
                    ctrl.$setValidity('duplicate', true);
                    return viewValue;
                }
            });
        }
    };
});




adminDashboard.controller('imageLoadController',['$scope','$fileUploader','userProfileService', function ($scope, $fileUploader,userProfileService) {
    'use strict';

    // create a uploader with options
    var uploader = $scope.uploader = $fileUploader.create({
        scope: $scope,                          // to automatically update the html. Default: $rootScope
        url: '/file/upload ',
        formData: [
            { key: 'value' }
        ],
        filters: [
            function (item) {                    // first user filter
                if(item.type=="image/jpeg" || item.type=="image/png"){
                    return true;
                }

                else{
                    return false;
                }
            }
        ],
        alias:"picture",
        autoUpload:true
    });


    // FAQ #1
//    var item = {
//        file: {
//            name: 'Previously uploaded file',
//            size: 1e6
//        },
//        progress: 100,
//        isUploaded: true,
//        isSuccess: true
//    };
//    item.remove = function() {
//        uploader.removeFromQueue(this);
//    };
//    uploader.queue.push(item);
    uploader.progress = 0;


    // ADDING FILTERS

    uploader.filters.push(function (item) { // second user filter
        return true;
    });

    // REGISTER HANDLERS

    uploader.bind('afteraddingfile', function (event, item) {
    });

    uploader.bind('whenaddingfilefailed', function (event, item) {
    });

    uploader.bind('afteraddingall', function (event, items) {
        $scope.uploadInProgress=true;

    });

    uploader.bind('beforeupload', function (event, item) {
    });

    uploader.bind('progress', function (event, item, progress) {
    });

    uploader.bind('progressAll', function (event, item, progress) {
    });

    uploader.bind('success', function (event, xhr, item, response) {

    });

    uploader.bind('cancel', function (event, xhr, item) {
    });

    uploader.bind('error', function (event, xhr, item, response) {
    });

    uploader.bind('complete', function (event, xhr, item, response) {
    });

    uploader.bind('progressall', function (event, progress) {
    });

    uploader.bind('completeall', function (event, items) {
        //uploader.clearQueue();
        $scope.selectImagesInit();
    });

    $scope.selectImagesInit=function(){
        userProfileService.getCurrentUserImages().then(function(resp){
            $scope.userImages=resp;
            $scope.selectedImagesCount=0;
            $scope.selectedImages=[];
            $scope.image=null;
            $scope.uploadInProgress=false;
            $(".img-container").each(function(){
                if($(this).hasClass("selected")){
                    $(this).removeClass("selected");
                }
                if($(this).hasClass("details")){
                    $(this).removeClass("details");
                }
            })
        });


    }

    $scope.selectImage=function($event){
        var curr=$($event.target).closest(".img-container");
        if(curr.hasClass("selected")){
            curr.removeClass("selected");
        }else{
            curr.addClass("selected");

        }
        curr.siblings(".details").each(function(){
            $(this).removeClass("details");
        });
        curr.siblings(".selected").each(function(){
            $(this).removeClass("selected");
        });

        curr.addClass("details");
        var id=curr.find("img").attr('id').substring(3);
        if($scope.userImages){
            for(var i=0;i<$scope.userImages.length;i++){
                if($scope.userImages[i].id==id){
                    $scope.imageOptions=[];
                    $scope.data={};
                    $scope.image=$scope.userImages[i];
                    $scope.imageName=$scope.image.fileName;
                    $scope.imageSrc="/assets/"+$scope.image.path.substring(7);
                    $scope.imageAlt=$scope.image.alt;
                    $scope.image.imageData= {
                        "myOptions": [
                            {
                                "id": 1,
                                "label": "Thumbnail 150 x150"
                            },
                            {
                                "id": 2,
                                "label": "Medium 300 x 240"
                            },
                            {
                                "id": 3,
                                "label": "Full size "+$scope.image.height+" x " +$scope.image.width
                            }]
                    }

// Get stream in the object called data
                    $scope.imageOptions = $scope.image.imageData.myOptions;
                    $scope.data.imageOption=$scope.imageOptions[0];
                    $scope.image.imageOption=$scope.data.imageOption;
                    $scope.userImages[i].imageOption=$scope.data.imageOption;

                }
            }

        }
        $scope.$watch('data.imageOption',function(){
            var id=$(".img-container.details").find("img").attr('id').substring(3);
            for(var i=0;i<$scope.userImages.length;i++){
                if($scope.userImages[i].id==id){
                    $scope.userImages[i].imageOption=$scope.data.imageOption;
                    $scope.image.imageOption=$scope.data.imageOption;

                }
            }
        });



        $scope.selectedImagesCount=$(".img-container.selected").length;

    }


    $scope.updateImage=function(){
        var id=$(".img-container.details").find("img").attr('id').substring(3);
        $scope.image.alt=stripTags($scope.image.alt);
        $scope.image.caption=stripTags($scope.image.caption);
        $scope.image.description=stripTags($scope.image.description);
        $scope.image.title=stripTags($scope.image.title);

        userProfileService.updateImage(id,$scope.image.alt,$scope.image.caption,$scope.image.description,$scope.image.title).then(function(resp){
        });

    }

    $scope.addSelectedImagesToPost=function(){

        $(".img-container.selected").each(function () {
            var id = $(this).find("img").attr('id').substring(3);
            for (var i = 0; i < $scope.userImages.length; i++) {
                if ($scope.userImages[i].id == id) {
                    $scope.selectedImages.push($scope.userImages[i]);
                    break;
                }
            }
        });
        // get editor instance
        var ed = tinyMCE.get('textmax');
        for (var i = 0; i < $scope.selectedImages.length; i++) {
            var range = ed.selection.getRng();
            var newNode = ed.getDoc().createElement("img");
            newNode.src = "/assets/" + $scope.selectedImages[i].path.substring(7);
            if ($scope.selectedImages[i].imageOption.id == 1) {
                newNode.height = "150";
                newNode.width = "150";
            }
            else if ($scope.selectedImages[i].imageOption.id == 2) {
                newNode.height = "240";
                newNode.width = "300";
            }
            else {
                newNode.height = $scope.selectedImages[i].height;

                newNode.width = $scope.selectedImages[i].width;
            }
            newNode.title=$scope.selectedImages[i].title;
            newNode.alt=$scope.selectedImages[i].alt;
            newNode.caption=$scope.selectedImages[i].caption;
            newNode.description=$scope.selectedImages[i].description;

            range.insertNode(newNode);
            $scope.selectImagesInit();
        }


    }


}]);





adminDashboard.controller('featuredImageController',['$scope','$fileUploader','userProfileService', function ($scope, $fileUploader,userProfileService) {
    'use strict';

    // create a uploader with options
    var uploader = $scope.uploader = $fileUploader.create({
        scope: $scope,                          // to automatically update the html. Default: $rootScope
        url: '/file/upload ',
        formData: [
            { key: 'value' }
        ],
        filters: [
            function (item) {                    // first user filter
                if(item.type=="image/jpeg" || item.type=="image/png"){
                    return true;
                }

                else{
                    return false;
                }
            }
        ],
        alias:"picture",
        autoUpload:true
    });


    // FAQ #1
//    var item = {
//        file: {
//            name: 'Previously uploaded file',
//            size: 1e6
//        },
//        progress: 100,
//        isUploaded: true,
//        isSuccess: true
//    };
//    item.remove = function() {
//        uploader.removeFromQueue(this);
//    };
//    uploader.queue.push(item);
    uploader.progress = 0;


    // ADDING FILTERS

    uploader.filters.push(function (item) { // second user filter
        return true;
    });

    // REGISTER HANDLERS

    uploader.bind('afteraddingfile', function (event, item) {
    });

    uploader.bind('whenaddingfilefailed', function (event, item) {
    });

    uploader.bind('afteraddingall', function (event, items) {
        $scope.uploadInProgress=true;

    });

    uploader.bind('beforeupload', function (event, item) {
    });

    uploader.bind('progress', function (event, item, progress) {
    });

    uploader.bind('progressAll', function (event, item, progress) {
    });

    uploader.bind('success', function (event, xhr, item, response) {

    });

    uploader.bind('cancel', function (event, xhr, item) {
    });

    uploader.bind('error', function (event, xhr, item, response) {
    });

    uploader.bind('complete', function (event, xhr, item, response) {
    });

    uploader.bind('progressall', function (event, progress) {
    });

    uploader.bind('completeall', function (event, items) {
//        uploader.clearQueue();
        $scope.selectImagesInit();
    });

    $scope.selectImagesInit=function(){
        userProfileService.getCurrentUserImages().then(function(resp){
            $scope.userImages=resp;
            $scope.selectedImagesCount=0;
            $scope.selectedImages=[];
            $scope.image=null;
            $scope.uploadInProgress=false;

            $(".img-container").each(function(){
                if($(this).hasClass("selected")){
                    $(this).removeClass("selected");
                }
                if($(this).hasClass("details")){
                    $(this).removeClass("details");
                }
            })
        });


    }

    $scope.selectImage=function($event){
        var curr=$($event.target).closest(".img-container");
        if(curr.hasClass("selected")){
            curr.removeClass("selected");
        }else{
            curr.addClass("selected");

        }
        curr.siblings(".details").each(function(){
            $(this).removeClass("details");
        });
        curr.siblings(".selected").each(function(){
            $(this).removeClass("selected");
        });

        curr.addClass("details");
        var id=curr.find("img").attr('id').substring(3);
        if($scope.userImages){
            for(var i=0;i<$scope.userImages.length;i++){
                if($scope.userImages[i].id==id){
                    $scope.imageOptions=[];
                    $scope.data={};
                    $scope.image=$scope.userImages[i];
                    $scope.imageName=$scope.image.fileName;
                    $scope.imageSrc="/assets/"+$scope.image.path.substring(7);
                    $scope.imageAlt=$scope.image.alt;
                    $scope.image.imageData= {
                        "myOptions": [
                            {
                                "id": 1,
                                "label": "Thumbnail 150 x150"
                            },
                            {
                                "id": 2,
                                "label": "Medium 300 x 240"
                            },
                            {
                                "id": 3,
                                "label": "Full size "+$scope.image.height+" x " +$scope.image.width
                            }]
                    }

// Get stream in the object called data
                    $scope.imageOptions = $scope.image.imageData.myOptions;
                    $scope.data.imageOption=$scope.imageOptions[0];
                    $scope.image.imageOption=$scope.data.imageOption;
                    $scope.userImages[i].imageOption=$scope.data.imageOption;

                }
            }

        }
        $scope.$watch('data.imageOption',function(){
            var id=$(".img-container.details").find("img").attr('id').substring(3);
            for(var i=0;i<$scope.userImages.length;i++){
                if($scope.userImages[i].id==id){
                    $scope.userImages[i].imageOption=$scope.data.imageOption;
                    $scope.image.imageOption=$scope.data.imageOption;

                }
            }
        });



        $scope.selectedImagesCount=$(".img-container.selected").length;

    }


    $scope.updateImage=function(){
        var id=$(".img-container.details").find("img").attr('id').substring(3);
        $scope.image.alt=stripTags($scope.image.alt);
        $scope.image.caption=stripTags($scope.image.caption);
        $scope.image.description=stripTags($scope.image.description);
        $scope.image.title=stripTags($scope.image.title);
        userProfileService.updateImage(id,$scope.image.alt,$scope.image.caption,$scope.image.description,$scope.image.title).then(function(resp){
        });

    }

    $scope.setFeaturedImage=function(){

        $(".img-container.selected").each(function () {
            var id = $(this).find("img").attr('id').substring(3);
            for (var i = 0; i < $scope.userImages.length; i++) {
                if ($scope.userImages[i].id == id) {
                    $scope.selectedImages.push($scope.userImages[i]);
                    break;
                }
            }
        });
        var id=$(".img-container.details").find("img").attr('id').substring(3);
        $scope.featuredImageId=id;
        var src=$(".img-container.details").find("img").prop('src');
        $("#featuredImage").html("<img id='fi"+ id +"' src='"+src+"' >");

        $scope.selectImagesInit();

    }
    $scope.removeFeaturedImage=function(){
        $("#featuredImage").html("");
        $scope.featuredImageId=null;
        $scope.selectImagesInit();
    }

}]);

var stripTags=function(s){
    if(s){
        return s.replace(/(<([^>]+)>)/ig,"");
    }else{
        return s;
    }

}