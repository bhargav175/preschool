var siteContent=angular.module("siteContent",['ngSanitize','restangular','ui.bootstrap']);


siteContent.factory('siteContentService',['Restangular',
    function(Restangular){

        return {
            getAllSubjects:function(){
                return Restangular.one('api/subject/list').get();
            },
            getSubjectInfo:function(slug){
                return Restangular.one('subject').get({"slug":slug});
            }
            ,
            getAllChaptersInSubject:function(subject){
                var resp= Restangular.one('chapter/list/subject').customPOST(subject, '', {}, {ContentType: 'application/json'});

                return resp;
            }
            ,
            getAllChapters:function(){
                return Restangular.one('api/chapter/list').get();
            },
            getAllConcepts:function(){
                return Restangular.one('api/concept/list').get();
            },
            getAllTags:function(){
                return Restangular.one('api/tag/list').get();
            },
            followTag:function(tagslug){
                var k=Restangular.one('api/user/tag/follow').customPOST({
                    "tagslug":tagslug
                },'',{},{ContentType:'application/json'});
                return k;
            },
            unfollowTag:function(tagslug){
                var k=Restangular.one('api/user/tag/unfollow').customPOST({
                    "tagslug":tagslug
                },'',{},{ContentType:'application/json'});
                return k;
            }, isfollowing:function(username,tagslug){
                var resp=Restangular.one('api/user/tag/isfollowing').get({"username":username,"tagslug":tagslug});
                return resp;
            }
        }

        }
    ]);

siteContent.controller('siteContentController',['$scope','siteContentService',
    function ($scope, siteContentService) {

            siteContentService.getAllSubjects().then(function(response){
               $scope.subjects=response.subjects;
            });



    }



    ]
        );

siteContent.controller('subjectContentController',['$scope','siteContentService',
    function ($scope, siteContentService) {

        siteContentService.getAllSubjects().then(function(response){
            $scope.subjects=response.subjects;
        });



    }


]
);

siteContent.controller('tagContentController',['$scope','siteContentService',
    function ($scope, siteContentService) {

        siteContentService.getAllSubjects().then(function(response){
            $scope.subjects=response.subjects;
        });


        $scope.username=$("#user-name").text();
        $scope.tagslug=$("#tag-slug-name").text();
        $scope.username=$scope.username.replace(/\s/g, "");
        siteContentService.isfollowing($scope.username,$scope.tagslug).then(function(resp){
            $scope.following=resp;
        });


        $scope.followTag=function(){
            siteContentService.followTag($scope.tagslug).then(function(resp){

                if(resp=="success"){
                    $scope.following=true;

                }
            });
        }
        $scope.unfollowTag=function(){
            siteContentService.unfollowTag($scope.tagslug).then(function(resp){
                if(resp=="success"){
                    $scope.following=false;

                }
            });
        }



    }



]
);var stripTags=function(s){
    if(s){
        return s.replace(/(<([^>]+)>)/ig,"");
    }else{
        return s;
    }

}