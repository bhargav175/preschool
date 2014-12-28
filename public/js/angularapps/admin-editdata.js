var adminEditData = angular.module("adminEditData", ['ngSanitize', 'restangular','ui.bootstrap', 'adminDashboard']);
adminEditData.factory('adminEditDataService', ['Restangular',
    function (Restangular) {
        return {
            editTag: function (id, name, slug, description, descriptionHtml, chapters,fid) {
                var tagChapterIds=[];
                for(var i=0;i<chapters.length;i++){
                    tagChapterIds.push(chapters[i].id);
                }
                var k = Restangular.one('tag/doedit').customPOST({
                    "id": id,
                    "name": stripTags(name),
                    "slug": stripTags(slug),
                    "description": description,
                    "descriptionHtml": descriptionHtml,
                    "chapters": tagChapterIds,
                    "featuredImage":fid

                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            editSubject: function (id, name, slug, description, descriptionHtml, fid,videoUrl) {
                var k = Restangular.one('subject/doedit').customPOST({
                    "id": id,
                    "name": stripTags(name),
                    "slug": stripTags(slug),
                    "description": description,
                    "descriptionHtml": descriptionHtml,
                    "featuredImage":fid,
                    "videoUrl":videoUrl
                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            editChapter: function (id, name, slug, description, descriptionHtml, subject,fid) {

                if(!subject){
                    subject=undefined;
                }else{
                    subject=subject.id;
                }
                var k = Restangular.one('chapter/doedit').customPOST({
                    "id": id,
                    "name": stripTags(name),
                    "slug": stripTags(slug),
                    "description": description,
                    "descriptionHtml": descriptionHtml,
                    "subject":subject,
                    "featuredImage":fid
                }, '', {}, {ContentType: 'application/json'});
                return k;
            },
            editConcept: function (id, name, slug, description, descriptionHtml,chapter,fid) {
                if(!chapter){
                    chapter=undefined;
                }
                else{
                  chapter=chapter.id;
                }

                var k = Restangular.one('concept/doedit').customPOST({
                    "id": id,
                    "name": stripTags(name),
                    "slug": stripTags(slug),
                    "description": description,
                    "descriptionHtml": descriptionHtml,
                    "chapter":chapter,
                    "featuredImage":fid
                }, '', {}, {ContentType: 'application/json'});
                return k;
            }
        }
    }]);


adminEditData.controller('editTagController', ['$q', '$scope', '$sce', 'adminDashboardService', 'adminEditDataService',
    function ($q, $scope, $sce, adminDashboardService, adminEditDataService) {

        $scope.tagInit = function () {

            $scope.slug = $("#nslug").val();
            $scope.allTagsFunction().then(function () {
                if ($scope.tagSlugs.indexOf($scope.slug > -1)) {
                    $scope.tagSlugs.splice($scope.tagSlugs.indexOf($scope.slug), 1)
                }

            });
            adminDashboardService.getTag($scope.slug).then(function (response) {
                $scope.tag = response.tags[0];
                $scope.tagId = $scope.tag.id;
                $scope.tagName = $scope.tag.name;
                $scope.tagSlug = $scope.tag.slug;
                $scope.tagHtml = $sce.trustAsHtml($scope.tag.descriptionHtml);
                $scope.chaptersWithTag = [];
                for (var i = 0; i < $scope.tag.chapters.length; i++) {

                    $scope.addChapterToTag($scope.tag.chapters[i]);
                }
                if($scope.tag.featuredImage){
                    $scope.featuredImageId=$scope.tag.featuredImage.id;
                    $("#featuredImage").html("<img id='fi"+ $scope.featuredImageId +"' src='"+"/assets/"+$scope.tag.featuredImage.path.substring(7)+"' >");

                }

            });


            $scope.allChaptersFunction();
        }
        $scope.allChaptersFunction = function () {
            adminDashboardService.allChapters().then(function (response) {
                $scope.chaptersList = response.chapters;
                $scope.chapterSlugs = [];
                for (var i = 0; i < $scope.chaptersList.length; i++) {
                    $scope.chapterSlugs.push($scope.chaptersList[i].slug);
                }
                $scope.conceptChapter = $scope.chaptersList[0];
            });
        }

        $scope.addChapterToTag = function (a) {
            if ($scope.chaptersWithTag.indexOf(a) < 0) {
                for (var i = 0; i < $scope.chaptersWithTag.length; i++) {
                    if ($scope.chaptersWithTag[i].slug == a.slug) {
                        $scope.clearTagChapterInput();
                        return;
                    }
                }
                $scope.chaptersWithTag.push(a);
                $("#add-tag-form .chapters-well").append('<div class="btn-group"> <button class="btn btn-primary btn-lg close tag-chapter-btn" id="tagWithChapterId' + parseInt(a.id) + '" type="button" style="padding:0 15px"> ' + a.slug + '<span><i class="fa fa-times"></i></span> </button></div>');
                $scope.clearTagChapterInput();
            }
        }
        $scope.clearTagChapterInput = function () {
            $scope.tagChapter = "";
            $("#tag-chapter-input").val("");
        }


        $scope.removeChapterFromTag = function (id) {
            for (var i = 0; i < $scope.chaptersWithTag.length; i++) {
                if (parseInt($scope.chaptersWithTag[i].id) == parseInt(id)) {
                    $scope.chaptersWithTag.splice(i, 1);
                    $scope.clearTagChapterInput();
                }
            }
        }

        $("body").on("click", ".tag-chapter-btn", function () {
            $(this).remove();
            $scope.removeChapterFromTag(parseInt($(this).attr('id').substring(16)));
        });

        $scope.allTagsFunction = function () {
            var defer = $q.defer();

            adminDashboardService.allTags().then(function (response) {

                $scope.tagsList = response.tags;
                $scope.tagSlugs = [];
                for (var i = 0; i < $scope.tagsList.length; i++) {
                    $scope.tagSlugs.push($scope.tagsList[i].slug);
                }
                defer.resolve(['Done']);

            });

            return defer.promise;
        }

        $scope.editTag = function () {
            tinyMCE.triggerSave();
            $scope.tagHtml = $.trim($("#add-tag-form .editor").val());
            $scope.tagText=$("<div/>").html($scope.tagHtml).text();
            if($("#featuredImage").find("img").length>0){
                $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
            }
            else{
                $scope.fId=undefined;
            }
            adminEditDataService.editTag($scope.tagId, $scope.tagName, $scope.tagSlug, $scope.tagText, $scope.tagHtml, $scope.chaptersWithTag,$scope.fId).then(function (response) {

                Apprise(response);
            });
        }


    }]);





//Controller for Subject




adminEditData.controller('editSubjectController', ['$q', '$scope', '$sce', 'adminDashboardService', 'adminEditDataService',
    function ($q, $scope, $sce,  adminDashboardService, adminEditDataService) {

        $scope.subjectInit = function () {

            $scope.slug = $("#nslug").val();
            $scope.allSubjectsFunction().then(function () {
                if ($scope.subjectSlugs.indexOf($scope.slug > -1)) {
                    $scope.subjectSlugs.splice($scope.subjectSlugs.indexOf($scope.slug), 1)
                }

            });
            adminDashboardService.getSubject($scope.slug).then(function (response) {
                $scope.subject = response.subjects[0];
                $scope.subjectId = $scope.subject.id;
                $scope.subjectName = $scope.subject.name;
                $scope.subjectSlug = $scope.subject.slug;
                $scope.subjectHtml = $sce.trustAsHtml($scope.subject.descriptionHtml);
                $scope.videoUrl =$scope.subject.videoUrl;
                if($scope.subject.featuredImage){
                    $scope.featuredImageId=$scope.subject.featuredImage.id;
                    $("#featuredImage").html("<img id='fi"+ $scope.featuredImageId +"' src='"+"/assets/"+$scope.subject.featuredImage.path.substring(7)+"' >");

                }


            });


        }




        $scope.allSubjectsFunction = function () {
            var defer = $q.defer();

            adminDashboardService.allSubjects().then(function (response) {

                $scope.subjectsList = response.subjects;
                $scope.subjectSlugs = [];
                for (var i = 0; i < $scope.subjectsList.length; i++) {
                    $scope.subjectSlugs.push($scope.subjectsList[i].slug);
                }
                defer.resolve(['Done']);

            });

            return defer.promise;
        }

        $scope.editSubject = function () {
            tinyMCE.triggerSave();
            $scope.subjectHtml = $.trim($("#add-subject-form .editor").val());
            $scope.subjectText=$("<div/>").html($scope.subjectHtml).text();
            if($("#featuredImage").find("img").length>0){
                $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
            }
            else{
                $scope.fId=undefined;
            }
            adminEditDataService.editSubject($scope.subjectId, $scope.subjectName, $scope.subjectSlug, $scope.subjectText, $scope.subjectHtml,$scope.fId,$scope.videoUrl).then(function (response) {
                Apprise(response);
            });
        }


    }]);


//Controller for Chapter




adminEditData.controller('editChapterController', ['$q', '$scope', '$sce','adminDashboardService', 'adminEditDataService',
    function ($q, $scope, $sce, adminDashboardService, adminEditDataService) {

        $scope.chapterInit = function () {

            $scope.slug = $("#nslug").val();

            $scope.allChaptersFunction().then(function () {
                if ($scope.chapterSlugs.indexOf($scope.slug > -1)) {
                    $scope.chapterSlugs.splice($scope.chapterSlugs.indexOf($scope.slug), 1)
                }

            });
            adminDashboardService.getChapter($scope.slug).then(function (response) {
                $scope.chapter = response.chapters[0];
                $scope.chapterId = $scope.chapter.id;
                $scope.chapterName = $scope.chapter.name;
                $scope.chapterSlug = $scope.chapter.slug;
                $scope.chapterSubjectSlug=$scope.chapter.subject.slug;

                $scope.allSubjectsFunction().then(function(){

                    for(var i=0;i<$scope.subjectsList.length;i++){
                        if($scope.subjectsList[i].slug==$scope.chapterSubjectSlug){
                            $scope.chapterSubject=$scope.subjectsList[i];
                            break;
                        }
                    }
                });
                $scope.getChaptersFromSubject=function(subject){
                    var defer = $q.defer();

                    adminDashboardService.allChaptersInSubject(subject).then(function(response){
                        $scope.chaptersInSub=response.chapters;
                        defer.resolve(['Done']);

                    });
                    return defer.promise;

                }

                $scope.getChaptersFromSubject($scope.chapter.subject).then(function(msg){
                });


                $scope.chapterHtml = $sce.trustAsHtml($scope.chapter.descriptionHtml);
                if($scope.chapter.featuredImage){
                    $scope.featuredImageId=$scope.chapter.featuredImage.id;
                    $("#featuredImage").html("<img id='fi"+ $scope.featuredImageId +"' src='"+"/assets/"+$scope.chapter.featuredImage.path.substring(7)+"' >");

                }


            });


        }
        $scope.allSubjectsFunction = function () {
            var defer = $q.defer();

            adminDashboardService.allSubjects().then(function (response) {

                $scope.subjectsList = response.subjects;
                $scope.subjectSlugs = [];
                for (var i = 0; i < $scope.subjectsList.length; i++) {
                    $scope.subjectSlugs.push($scope.subjectsList[i].slug);
                }
                defer.resolve(['Done']);

            });

            return defer.promise;
        }



        $scope.allChaptersFunction = function () {
            var defer = $q.defer();

            adminDashboardService.allChapters().then(function (response) {

                $scope.chaptersList = response.chapters;
                $scope.chapterSlugs = [];
                for (var i = 0; i < $scope.chaptersList.length; i++) {
                    $scope.chapterSlugs.push($scope.chaptersList[i].slug);
                }
                defer.resolve(['Done']);

            });

            return defer.promise;
        }


        $scope.editChapter = function () {
            tinyMCE.triggerSave();
            $scope.chapterHtml = $.trim($("#add-chapter-form .editor").val());
            $scope.chapterText=$("<div/>").html($scope.chapterHtml).text();
            if($("#featuredImage").find("img").length>0){
                $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
            }
            else{
                $scope.fId=undefined;
            }

            adminEditDataService.editChapter($scope.chapterId, $scope.chapterName, $scope.chapterSlug, $scope.chapterText, $scope.chapterHtml,$scope.chapterSubject,$scope.fId).then(function (response) {

                Apprise(response);
            });
        }





    }]);
//Controller for Concept



adminEditData.controller('editConceptController', ['$q', '$scope', '$sce', 'adminDashboardService', 'adminEditDataService',
    function ($q, $scope, $sce,  adminDashboardService, adminEditDataService) {

        $scope.conceptInit = function () {

            $scope.slug = $("#nslug").val();            adminDashboardService.getConcept($scope.slug).then(function (response) {
                $scope.concept = response.concepts[0];
                $scope.conceptId = $scope.concept.id;
                $scope.conceptName = $scope.concept.name;
                $scope.conceptSlug = $scope.concept.slug;
                $scope.conceptHtml = $sce.trustAsHtml($scope.concept.descriptionHtml);

                if($scope.concept.featuredImage){
                    $scope.featuredImageId=$scope.concept.featuredImage.id;
                    $("#featuredImage").html("<img id='fi"+ $scope.featuredImageId +"' src='"+"/assets/"+$scope.concept.featuredImage.path.substring(7)+"' >");

                }


            });
            $scope.allConceptsFunction().then(function () {
                if ($scope.conceptSlugs.indexOf($scope.slug > -1)) {
                    $scope.conceptSlugs.splice($scope.conceptSlugs.indexOf($scope.slug), 1)
                }
                $scope.allChaptersFunction().then(function(){
                    if($scope.concept.chapter){
                        for(var i=0;i<$scope.chaptersList.length;i++){
                            if($scope.chaptersList[i].slug==$scope.concept.chapter.slug){
                                $scope.conceptChapter=$scope.chaptersList[i];
                            }
                        }
                    }
                });

            });



        }
        $scope.allChaptersFunction = function () {
            var defer = $q.defer();

            adminDashboardService.allChapters().then(function (response) {

                $scope.chaptersList = response.chapters;

                defer.resolve(['Done']);

            });


            return defer.promise;
        }

        $scope.allConceptsFunction=function(){
            var defer = $q.defer();

            adminDashboardService.allConcepts().then(function (response) {

                $scope.conceptsList = response.concepts;
                $scope.conceptSlugs = [];
                for (var i = 0; i < $scope.conceptsList.length; i++) {
                    $scope.conceptSlugs.push($scope.conceptsList[i].slug);
                }
                defer.resolve(['Done']);

            });

            return defer.promise;
        }





        $scope.editConcept = function () {
            tinyMCE.triggerSave();
            $scope.conceptHtml = $.trim($("#add-concept-form .editor").val());
            $scope.conceptText=$("<div/>").html($scope.conceptHtml).text();
            if($("#featuredImage").find("img").length>0){
                $scope.fId=parseInt($("#featuredImage").find("img").attr('id').substring(2));
            }
            else{
                $scope.fId=undefined;
            }
            adminEditDataService.editConcept($scope.conceptId, $scope.conceptName, $scope.conceptSlug, $scope.conceptText, $scope.conceptHtml,$scope.conceptChapter,$scope.fId).then(function (response) {

                Apprise(response);
            });
        }





    }]);

adminEditData.controller('adminEditShortNoteController', ['$q', '$scope', '$sce', 'adminDashboardService', 'adminEditDataService',
function($q, $scope, $sce, adminDashboardService, adminEditDataService){

    $scope.editNote=function(){

    }

}]);
var stripTags=function(s){
    if(s){
        return s.replace(/(<([^>]+)>)/ig,"");
    }else{
        return s;
    }

}