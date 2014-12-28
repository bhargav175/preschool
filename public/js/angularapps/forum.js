var forum=angular.module("forum",['ngSanitize','restangular','ui.bootstrap','userProfile']);

forum.factory('forumService',['Restangular',
    function(Restangular){

        return {
            getThreadBySlug:function(slug){
                console.log(slug);
                return Restangular.one('api/forum/thread').get({"slug":slug});
            },
            getForumThreadLikes:function(slug){
                return Restangular.one('api/forum/thread/like').get({"slug":slug});
            },
            isForumThreadLikedByUser:function(slug){
                return Restangular.one('api/forum/thread/userlike').get({"slug":slug});
            },
            getForumAnswerLikes:function(slug){
                return Restangular.one('api/forum/answer/like').get({"slug":slug});
            },
            isForumAnswerLikedByUser:function(slug){
                return Restangular.one('api/forum/answer/userlike').get({"slug":slug});
            }

        }}]);

forum.controller('addAnswerController',['$scope',
    function ($scope) {

        $scope.init=function(){
            $scope.addAnswerForm=false;

        }
        $scope.toggleAddAnswerForm=function(){
            if($scope.addAnswerForm==true){
                $scope.addAnswerForm=false;
            }else{
                $scope.addAnswerForm=true;
            };
        }
    }
]);

forum.controller('addThreadController',['$scope','$q','userProfileService',
    function($scope,$q,userProfileService){

        $scope.init=function(){
            $scope.test="test";
            $scope.allTagsFunction().then(function(){
                console.log($scope.tagsList);
                $scope.tagsWithThread=[];

            });
            $scope.threadTag='';

        }

        $scope.allTagsFunction = function () {
            var defer = $q.defer();

            userProfileService.allTags().then(function (response) {

                $scope.tagsList = response.tags;
                console.log($scope.tagsList);

                defer.resolve(['Done']);

            });

            return defer.promise;
        }


        $scope.addTagToThread=function(a){
            for(var i=0; i<$scope.tagsWithThread.length;i++){
                if($scope.tagsWithThread[i].slug== a.slug){
                    return;
                }
            }
            $scope.tagsWithThread.push(a);

            $("#addQuestionForm .tags-well").append('<div class="btn-group"> <button class="btn btn-primary btn-lg close thread-tag-btn" id="tagWithThreadId' + parseInt(a.id) + '" type="button" style="padding:0 15px"> ' + a.slug + '<span><i class="fa fa-times"></i></span> </button></div>');
            $("#addQuestionForm #hidden-tags").append('<input type="hidden" value="'+a.slug+'" name="tags['+($scope.tagsWithThread.length-1)+']">');
            $scope.clearThreadTagInput();

        }

        $scope.removeTagFromThread = function (id) {
            for (var i = 0; i < $scope.tagsWithThread.length; i++) {
                if (parseInt($scope.tagsWithThread[i].id) == parseInt(id)) {
                    $scope.tagsWithThread.splice(i, 1);
                    $scope.clearThreadTagInput();
                }
            }
        }

        $("body").on("click", ".thread-tag-btn", function () {
            $(this).remove();
            $scope.removeTagFromThread(parseInt($(this).attr('id').substring(15)));
        });

        $scope.clearThreadTagInput = function () {
            $scope.threadTag = "";
            $("#thread-tag-input").val("");
        }
    }]);
forum.config(['$locationProvider', function ($locationProvider) {
        $locationProvider.html5Mode(false);
    }]).run(function ($rootScope, $location) {

});


forum.controller('likeThreadController',['$scope','$q','userProfileService','forumService',
    function($scope,$q,userProfileService,forumService){
        $scope.doLikeThread=function(){
            forumService.getForumThreadLikes($("#forumThreadSlug").val()).then(function(resp){
                $scope.forumThreadLikes=resp.forumThreadLikes;
                $scope.isLiked=resp.isLiked;
                $(".forumThreadLikesCount .badge").html($scope.forumThreadLikes.length);
            });

        }
        forumService.isForumThreadLikedByUser($("#forumThreadSlug").val()).then(function(resp){
            $scope.isLiked=resp;
        });

    }]);

forum.controller('likeAnswerController',['$scope','$q','userProfileService','forumService',
    function($scope,$q,userProfileService,forumService){

        $scope.doLikeAnswer=function(e){
            $scope.a=$(e.target).closest(".forumAnswerListItem");
        forumService.getForumAnswerLikes($scope.a.find(".answerSlug").val()).then(function(resp){

            $(e.target).closest(".forumAnswerListItem").find(".forumAnswerLikesCount .badge").html(resp.forumAnswerLikes.length);
            if(resp.isLiked==true){
                $(e.target).closest(".forumAnswerListItem").find(".notLiked").hide();
                $(e.target).closest(".forumAnswerListItem").find(".liked").show();
            }else{
                $(e.target).closest(".forumAnswerListItem").find(".notLiked").show();

                $(e.target).closest(".forumAnswerListItem").find(".liked").hide();
            }

        });



    }
        angular.forEach(angular.element(".forumAnswerListItem"), function(value, key){
            var a = angular.element(value);
            forumService.isForumAnswerLikedByUser($(a).find(".answerSlug").val()).then(function(resp){
                resp=$.parseJSON(resp);
                if(resp){
                    console.log(1);
                    $(a).find(".notLiked").hide();
                    $(a).find(".liked").show();
                }else{
                    console.log(0);
                    $(a).find(".notLiked").show();

                    $(a).find(".liked").hide();
                }

            });
        });
        $scope.eachAnswerInitFunction=function(event){
            console.log(event.target);

        }
    }]);
forum.controller('editThreadController',['$scope','$q','userProfileService','forumService',
    function($scope,$q,userProfileService,forumService){
        $scope.threadSlug=$("#forumThreadSlug").val();
        $scope.init=function(){

            $scope.test="test";
            $scope.allTagsFunction().then(function(){
                console.log($scope.tagsList);
                forumService.getThreadBySlug($scope.threadSlug).then(function(resp){
                    $scope.thread=resp;
                    $scope.tagsWithThread=[];
                    $scope.tempTagsWithThread=$scope.thread.threadTags;
                    for(var i=0;i<$scope.tempTagsWithThread.length;i++){
                        $scope.addTagToThread($scope.tempTagsWithThread[i]);
                    }
                });

            });
            $scope.threadTag='';

        }

        $scope.allTagsFunction = function () {
            var defer = $q.defer();

            userProfileService.allTags().then(function (response) {

                $scope.tagsList = response.tags;
                console.log($scope.tagsList);

                defer.resolve(['Done']);

            });

            return defer.promise;
        }


        $scope.addTagToThread=function(a){
            for(var i=0; i<$scope.tagsWithThread.length;i++){
                if($scope.tagsWithThread[i].slug== a.slug){
                    return;
                }
            }
            $scope.tagsWithThread.push(a);

            $("#editQuestionForm .tags-well").append('<div class="btn-group"> <button class="btn btn-primary btn-lg close thread-tag-btn" id="tagWithThreadId' + parseInt(a.id) + '" type="button" style="padding:0 15px"> ' + a.slug + '<span><i class="fa fa-times"></i></span> </button></div>');
            $("#editQuestionForm #hidden-tags").append('<input type="hidden" id="ht'+ a.id+'" value="'+a.slug+'" name="tags['+($scope.tagsWithThread.length-1)+']">');
            $scope.clearThreadTagInput();

        }

        $scope.removeTagFromThread = function (id) {
            for (var i = 0; i < $scope.tagsWithThread.length; i++) {
                if (parseInt($scope.tagsWithThread[i].id) == parseInt(id)) {
                    $scope.tagsWithThread.splice(i, 1);
                    $("#editQuestionForm #hidden-tags #ht"+id).remove();
                    $scope.clearThreadTagInput();
                }
            }
        }

        $("body").on("click", ".thread-tag-btn", function () {
            $(this).remove();
            $scope.removeTagFromThread(parseInt($(this).attr('id').substring(15)));
        });

        $scope.clearThreadTagInput = function () {
            $scope.threadTag = "";
            $("#thread-tag-input").val("");
        }
    }]);

var stripTags=function(s){
    if(s){
        return s.replace(/(<([^>]+)>)/ig,"");
    }else{
        return s;
    }

}