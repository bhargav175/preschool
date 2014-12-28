var adminData=angular.module("adminData",['ngSanitize','restangular','ui.bootstrap','adminDashboard']);




adminData.controller('dataController',['$scope','adminDashboardService',
function($scope,adminDashboardService){
    $scope.init=function(){

        $scope.showAddSubjectForm=false;
        $scope.showAddChapterForm=false;
        $scope.showAddConceptForm=false;
        $scope.showAddTagForm=false;
        $scope.tagChapter='';
        $scope.chaptersWithTag=[];

        $scope.allShortNotesFunction=function(){

            adminDashboardService.allShortNotes().then(function(response){
               $scope.shortNotesList=response;
            });

        }
        $scope.allSubjectsFunction=function(){
            adminDashboardService.allSubjects().then(function(response){
               $scope.subjectsList=response.subjects;
                $scope.subjectSlugs=[];
                for(var i=0;i<$scope.subjectsList.length;i++){
                    $scope.subjectSlugs.push($scope.subjectsList[i].slug);
                }

                $scope.chapterSubject = $scope.subjectsList[0];
                console.log(response);
            });
        }
        $scope.allUsersFunction=function(){
            adminDashboardService.allUsers().then(function(response){
                $scope.usersList=response.users;

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
//                console.log($scope.chapterSlugs);
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
        $scope.allUsersFunction();
        $scope.allShortNotesFunction();

        $scope.chapterMoveUp=function($event){
            console.log($event.target)
            var id=$($event.target).closest("tr").attr('id').substring(2);
            adminDashboardService.chapterMoveUp(id).then(function(resp){
                resp=$.parseJSON(resp);
                if(resp=="Success"){
                    location.reload();

                }
                else{
                    alert(resp);
                }
            });
        }

        $scope.chapterMoveDown=function($event){
            console.log($event.target)
            var id=$($event.target).closest("tr").attr('id').substring(2);
            adminDashboardService.chapterMoveDown(id).then(function(resp){
                resp=$.parseJSON(resp);
                if(resp=="Success"){
                                     location.reload();

                }
                else{
                    alert(resp);
                }
            });
        }

        $scope.conceptMoveUp=function($event){
            console.log($event.target)
            var id=$($event.target).closest("tr").attr('id').substring(2);
            adminDashboardService.conceptMoveUp(id).then(function(resp){
                resp=$.parseJSON(resp);
                if(resp=="Success"){
                    location.reload();

                }
                else{
                    alert(resp);
                }
            });
        }

        $scope.conceptMoveDown=function($event){
            console.log($event.target)
            var id=$($event.target).closest("tr").attr('id').substring(2);
            adminDashboardService.conceptMoveDown(id).then(function(resp){
                resp=$.parseJSON(resp);
                if(resp=="Success"){
                    location.reload();

                }
                else{
                    alert(resp);
                }
            });
        }

    }

    $scope.flagAs=function($event,string){
        console.log($event.target)
        var id=$($event.target).closest("tr").attr('id').substring(2);
        adminDashboardService.flagAs(id,string).then(function(resp){
            console.log(resp);
            location.reload();
        });
    }



    $scope.addChap=function(){
        $scope.chapterText= $.trim($("#add-chapter-form .editor").text());
        $scope.chapterHtml=$.trim($("#add-chapter-form .editor").html());
        adminDashboardService.addChapter($scope.chapterName,$scope.chapterSlug,$scope.chapterText,$scope.chapterHtml,$scope.chapterSubject,$scope.chapterParentChapter).then(function(response){
            console.log(response);
            location.reload();
        });
    }
    $scope.addCon=function(){
        $scope.conceptText= $.trim($("#add-concept-form .editor").text());
        $scope.conceptHtml=$.trim($("#add-concept-form .editor").html());
        adminDashboardService.addConcept($scope.conceptName,$scope.conceptSlug,$scope.conceptChapter,$scope.conceptText,$scope.conceptHtml).then(function(response){
            console.log(response);
            location.reload();
        });
    }

    $scope.addSub=function(){
        $scope.subjectText= $.trim($("#add-subject-form .editor").text());
        $scope.subjectHtml=$.trim($("#add-subject-form .editor").html());
        adminDashboardService.addSubject($scope.subjectName,$scope.subjectSlug,$scope.subjectText,$scope.subjectHtml).then(function(response){

            console.log(response);
            location.reload();
        });
    }

    $scope.addTag=function(){
        $scope.tagText= $.trim($("#add-tag-form .editor").text());
        $scope.tagHtml=$.trim($("#add-tag-form .editor").html());
        adminDashboardService.addTag($scope.tagName,$scope.tagSlug,$scope.tagText,$scope.tagHtml,$scope.chaptersWithTag).then(function(response){

            console.log(response);
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
                console.log(response.chapters);
            })
    }
    $("body").on("click",".tag-chapter-btn",function(){
        $(this).remove();
        $scope.removeChapterFromTag(parseInt($(this).attr('id').substring(16)));
    });
//    $scope.$watch(function() {
//            return $location.path();
//        },
//        function(a){
//            console.log($rp);
//            console.log('url has changed: ' + a);
//          // window.location.pathname=a;
//            //window.location.reload();
//        });

}]);



adminData.controller('userController',['$scope','adminDashboardService',
    function($scope,adminDashboardService){

        $scope.changeRoles = function(){
            var role = prompt("Please enter role", "moderator");
            if (role != null) {
                console.log(role);
                if($scope.checkedUsers.length>0 && (role=="moderator" || role=="admin"|| role=="writer"|| role=="organization"||role=="teacher"||role=="student")){
                    adminDashboardService.changeRole($scope.checkedUsers,role).then(function(data){
                        console.log(data);
                        $scope.init();
                    });
                }else{
                    alert("please enter one of these -- moderator,admin,writer,organization,teacher,student ");
                }
            }else{
            }
        }

        $scope.init=function() {

            $scope.usersSelected = false;
            $scope.checkedUsers=[];

            $("body").on("change",".user-checkbox",function() {
                var elem = $(this).data("user-id");
                if(this.checked) {
                    $scope.checkedUsers.push($scope.usersList[elem].id);
                }else{
                    $scope.checkedUsers.splice( $scope.checkedUsers.indexOf($scope.usersList[elem].id),1);
                }
                console.log($scope.checkedUsers);
                $scope.usersSelected=($scope.checkedUsers.length>0);
                $scope.$apply();
                console.log($scope.usersSelected);
            });

               $scope.allUsersFunction();
        }
        $scope.allUsersFunction = function () {
            adminDashboardService.allUsers().then(function (response) {
                $scope.usersList = response.users;

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