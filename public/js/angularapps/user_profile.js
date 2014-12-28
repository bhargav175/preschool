var userProfile=angular.module("userProfile",['ngSanitize','restangular','ui.bootstrap','angularFileUpload']);

userProfile.factory('userProfileService',['Restangular',
    function(Restangular){

        return {
            allNotes:function(){
               return Restangular.one('api/shortnote/list/user').get();
            },
            saveNote:function(title,text,html,tags,fid){
                var tagIds=[];
                for(var i=0;i<tags.length;i++){
                    tagIds.push(tags[i].id);
                }
                var k= Restangular.one('shortnote/add').customPOST({
                    "title":title,
                    "text":text,
                    "html":html,
                    "tags":tagIds,
                    "featuredImage":fid
                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            saveEditedNote:function(id,title,text,html,tags,updatedTime,fid){
                var tagIds=[];
                for(var i=0;i<tags.length;i++){
                    tagIds.push(tags[i].id);
                }
                var k= Restangular.one('shortnote/doedit').customPOST({
                    "id":id,
                    "title":title,
                    "text":text,
                    "html":html,
                    "tags":tagIds,
                    "updatedTime":updatedTime,
                    "featuredImage":fid
                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            getShortNote:function(slug){
              return Restangular.one('shortnote').get({"slug":slug});
            },
            allTags:function(){
                var resp= Restangular.one('api/tag/list').get();

                return resp;
            }
            ,
            userActivities:function(){
                var resp=Restangular.one('api/activity/user').get();
                return resp;
            },
            getImage:function(id){
                var resp=Restangular.one('api/image').get({"id":id});
                return resp;
            },
            getCurrentUserImages:function(){
                var resp=Restangular.one('api/user/images').get();
                return resp;
            },
            updateImage:function(id,alt,caption,description,title){
              var k= Restangular.one('api/user/image/update').customPOST({
                    "id":id,
                    "title":title,
                    "alt":alt,
                    "caption":caption,
                    "description":description

                }, '', {}, {ContentType: 'application/json'});
                return k;

            },
            followUser:function(username){
                var k=Restangular.one('api/user/follow').customPOST({
                    "username":username
                },'',{},{ContentType:'application/json'});
                return k;
            },
            unfollowUser:function(username){
            var k=Restangular.one('api/user/unfollow').customPOST({
                "username":username
            },'',{},{ContentType:'application/json'});
            return k;
        }, isfollowing:function(username){
                var resp=Restangular.one('api/user/isfollowing').get({"username":username});
                return resp;
            }
        }

}]);

userProfile.controller('shortNotesController',['$scope','userProfileService',
    function ($scope, userProfileService) {

        userProfileService.allNotes().then(function(response){
            $scope.shortNotes=response;
            var limit=20;

            for(var i=0;i<$scope.shortNotes.length;i++)
            {
                if(String($scope.shortNotes[i].html).length>limit){
                    var ellipsis="...";
                    $scope.shortNotes[i]=String($scope.shortNotes[i].html).substr(0,limit).concat(ellipsis);
                }

            }
        });




    }


]);


userProfile.controller('saveShortNoteController',['$scope','$q','userProfileService',
    function ($scope,$q, userProfileService) {

        $scope.init=function(){

            $scope.allTagsFunction().then(function(){
                $scope.tagsWithNote = [];

            });
            $scope.noteTag='';

        }

        $scope.allTagsFunction = function () {
            var defer = $q.defer();

            userProfileService.allTags().then(function (response) {

                $scope.tagsList = response.tags;

                defer.resolve(['Done']);

            });

            return defer.promise;
        }
        $scope.addNote=function(){
            $("#submitButton").addClass("disabled");
            tinyMCE.triggerSave();
//            $scope.noteText = $.trim($("#add-note-form .editor").val().text());
            $scope.noteHtml = $.trim($("#add-note-form .editor").val());
            $scope.noteText=$("<div/>").html($scope.noteHtml).text();
            if($("#featuredImage").find("img").length>0){
                $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
            }
            else{
                $scope.fId=undefined;
            }

            if(!$scope.tagsWithNote){
                $scope.tagsWithNote=[];
            }
            userProfileService.saveNote($scope.noteTitle,$scope.noteText,$scope.noteHtml,$scope.tagsWithNote,$scope.fId).then(function(response){
                $("#submitButton").removeClass("disabled");
                document.location.href='/home';
                //location.reload();
            });

        }

        $scope.addTagToNote=function(a){
            for(var i=0; i<$scope.tagsWithNote.length;i++){
                if($scope.tagsWithNote[i].slug== a.slug){
                    return;
                }
            }
            $scope.tagsWithNote.push(a);

            $("#add-note-form .tags-well").append('<div class="btn-group"> <button class="btn btn-primary btn-lg close note-tag-btn" id="tagWithNoteId' + parseInt(a.id) + '" type="button" style="padding:0 15px"> ' + a.slug + '<span><i class="fa fa-times"></i></span> </button></div>');
            $scope.clearNoteTagInput();

        }


        $scope.removeTagFromNote = function (id) {
            for (var i = 0; i < $scope.tagsWithNote.length; i++) {
                if (parseInt($scope.tagsWithNote[i].id) == parseInt(id)) {
                    $scope.tagsWithNote.splice(i, 1);
                    $scope.clearNoteTagInput();
                }
            }
        }

        $("body").on("click", ".note-tag-btn", function () {
            $(this).remove();
            $scope.removeTagFromNote(parseInt($(this).attr('id').substring(13)));
        });
        $scope.clearNoteTagInput = function () {
            $scope.noteTag = "";
            $("#note-tag-input").val("");
        }

    }


]);



userProfile.controller('editShortNoteController',['$scope','$sce','$q','userProfileService',
    function ($scope,$sce,$q, userProfileService) {

        $scope.init=function(){
            $scope.slug = $("#nslug").val();
            userProfileService.getShortNote($scope.slug).then(function(response){
                $scope.note=response.shortnotes[0];
                $scope.noteTitle=$scope.note.title;
//                $scope.noteHtml=$sce.trustAsHtml($scope.note.html);
                $scope.noteId=$scope.note.id;
                $scope.noteUpdatedTime=$scope.note.updatedTime;
                if($scope.note.featuredImage!=null){
                    $scope.featuredImageId=$scope.note.featuredImage.id;
                    $("#featuredImage").html("<img id='fi"+ $scope.featuredImageId +"' src='"+"/assets/"+$scope.note.featuredImage.path.substring(7)+"' >");

                }

                $scope.allTagsFunction().then(function(){
                    $scope.tagsWithNote = [];
                    for(var i=0; i<$scope.tagsList.length;i++){
                        for(var j=0; j<$scope.note.tags.length;j++){
                            if($scope.tagsList[i].slug==$scope.note.tags[j].slug){
                                $scope.addTagToNote($scope.tagsList[i]);
                            }
                        }

                    }

                });
                var noteHtml=$scope.noteHtml;


                $scope.noteTag='';
            });



        }

        $scope.allTagsFunction = function () {
            var defer = $q.defer();

            userProfileService.allTags().then(function (response) {

                $scope.tagsList = response.tags;

                defer.resolve(['Done']);

            });

            return defer.promise;
        }
        $scope.addNote=function(){
            tinyMCE.triggerSave();
            $scope.noteHtml = $.trim($("#add-note-form .editor").val());
            $scope.noteText=$("<div/>").html($scope.noteHtml).text();
            if(!$scope.tagsWithNote){
                $scope.tagsWithNote=[];
            }

            if($("#featuredImage").find("img").length>0){
                $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
            }
            else{
                $scope.fId=undefined;
            }
            userProfileService.saveEditedNote($scope.noteId,$scope.noteTitle,$scope.noteText,$scope.noteHtml,$scope.tagsWithNote,$scope.noteUpdatedTime,$scope.fId).then(function(response){
               location.reload();
            });

        }

        $scope.addTagToNote=function(a){
            for(var i=0; i<$scope.tagsWithNote.length;i++){
                if($scope.tagsWithNote[i].slug== a.slug){
                    return;
                }
            }
            $scope.tagsWithNote.push(a);

            $("#add-note-form .tags-well").append('<div class="btn-group"> <button class="btn btn-primary btn-lg close note-tag-btn" id="tagWithNoteId' + parseInt(a.id) + '" type="button" style="padding:0 15px"> ' + a.slug + '<span><i class="fa fa-times"></i></span> </button></div>');
            $scope.clearNoteTagInput();

        }


        $scope.removeTagFromNote = function (id) {
            for (var i = 0; i < $scope.tagsWithNote.length; i++) {
                if (parseInt($scope.tagsWithNote[i].id) == parseInt(id)) {
                    $scope.tagsWithNote.splice(i, 1);
                    $scope.clearNoteTagInput();
                }
            }
        }

        $("body").on("click", ".note-tag-btn", function () {
            $(this).remove();
            $scope.removeTagFromNote(parseInt($(this).attr('id').substring(13)));
        });
        $scope.clearNoteTagInput = function () {
            $scope.noteTag = "";
            $("#note-tag-input").val("");
        }

    }


])




userProfile.controller('imageLoadController',['$scope','$fileUploader','userProfileService', function ($scope, $fileUploader,userProfileService) {
    'use strict';

    // create a uploader with options
    var uploader = $scope.uploader = $fileUploader.create({
        scope: $scope,                          // to automatically update the html. Default: $rootScope
        url: '/file/upload ',
        formData: [
            { key: 'value' }
        ],
        filters: [
            function (item) {
                                       // first user filter
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





userProfile.controller('featuredImageController',['$scope','$fileUploader','userProfileService', function ($scope, $fileUploader,userProfileService) {
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


userProfile.controller('userProfilePageController',['$scope','userProfileService', function ($scope,userProfileService) {
       $scope.username=$("#profile-user-name").text();
        userProfileService.isfollowing($scope.username).then(function(resp){
            $scope.following=resp;
        });


    $scope.followUser=function(){
            userProfileService.followUser($scope.username).then(function(resp){

                if(resp=="success"){
                    $scope.following=true;

                }
            });
        }
        $scope.unfollowUser=function(){
            userProfileService.unfollowUser($scope.username).then(function(resp){
                if(resp=="success"){
                    $scope.following=false;

                }
            });
        }

}]);

var stripTags=function(s){
    if(s){
        return s.replace(/(<([^>]+)>)/ig,"");
    }else{
        return s;
    }

}