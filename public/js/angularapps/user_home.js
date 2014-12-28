var userHome=angular.module("userHome",['ngSanitize','restangular','ui.bootstrap']);


userHome.factory('userHomeService',['Restangular',
    function(Restangular){

        return {
            feedShortNotes:function(){
                return Restangular.one('api/shortnote/feed').get();
            },
            doUpvotePost:function(id){
                return Restangular.one('api/shortnote/upvote').customPOST({
                    "id":id


                }, '', {}, {ContentType: 'application/json'});
            },
            doDownvotePost:function(id){
                return Restangular.one('api/shortnote/downvote').customPOST({
                    "id":id


                }, '', {}, {ContentType: 'application/json'});
            },
            reportPost:function(id,flagtype){
                return Restangular.one('shortnote/report').customPOST({
                    "id":id,
                    "reportType":flagtype


                }, '', {}, {ContentType: 'application/json'});
            }

        }

        }
    ]);


userHome.controller('reportSubmitController',['$scope','userHomeService',
function($scope,userHomeService){
        $scope.submit=function($event){
            $event.preventDefault();
            userHomeService.reportPost($event.currentTarget[0].value,$event.currentTarget[1].value).then(function(resp){
                alert(resp);
                location.reload();
            });

        }


}]);

userHome.controller('shortNoteFeedController',['$scope','userHomeService',
    function ($scope, userHomeService) {
        $scope.votePoll=true;
        $scope.doUpvote=function(e){
            if($scope.votePoll==true){
                $scope.votePoll=false;

                var id=$(e.target).closest(".shortNote").attr('id').substr(9);
                userHomeService.doUpvotePost(id).then(function(response){
                    var upvotes= parseInt($(".upvote-badge").text());
                    var downvotes= parseInt($(".downvote-badge").text());
                    if(response=="success"){
                        $(".upvote-button").addClass("btn-success");
                        $(".downvote-button").removeClass("btn-default");
                        $(".upvote-button").addClass("disabled");

                        upvotes=upvotes+1;
                    }
                    else if(response=="changed"){
                        $(".downvote-button").removeClass("btn-success");
                        $(".upvote-button").removeClass("disabled");
                        $(".downvote-button").removeClass("disabled");
                        downvotes=downvotes-1;

                    }
                    else{
                        Apprise(response);
                    }

                    $(".upvote-badge").text(upvotes);
                    $(".downvote-badge").text(downvotes);
                    $scope.votePoll=true;
                });
            }

        }
        $scope.doDownvote=function(e){
            if($scope.votePoll==true){
                $scope.votePoll=false;
                var id=$(e.target).closest(".shortNote").attr('id').substr(9);
                userHomeService.doDownvotePost(id).then(function(response){
                    var upvotes= parseInt($(".upvote-badge").text());
                    var downvotes= parseInt($(".downvote-badge").text());
                    if(response=="success"){
                        $(".downvote-button").addClass("btn-success");
                        $(".downvote-button").addClass("disabled");

                        $(".upvote-button").removeClass("btn-success");
                        downvotes=downvotes+1;


                    }
                    else if(response=="changed"){

                        $(".upvote-button").removeClass("btn-success");
                        $(".upvote-button").removeClass("disabled");
                        $(".downvote-button").removeClass("disabled");


                        upvotes=upvotes-1;

                    }
                    else{
//                        alert(response);
                        Apprise(response);
                    }
                    $(".upvote-badge").text(upvotes);
                    $(".downvote-badge").text(downvotes);
                    $scope.votePoll=true;;

                });
            }

        }
        $scope.feed={};
        $scope.feed.data="test";


//        var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket;
//        // Create a new WebSocket.
//           var socket = new WS('ws://localhost:9000/api/shortnote/feed');
//
//            // Handle any errors that occur.
//            socket.onerror = function(error) {
//                console.log('WebSocket Error: ' + error);
//                console.log(error);
//            };
//
//
//
//
//            // Handle messages sent by the server.
//            socket.onmessage = function(event) {
//
//
//                $scope.$apply(function(){
//                    $scope.feed.data= $.parseJSON(event.data);
//                });
//
//
//            };
//
//
//            // Show a disconnected message when the WebSocket is closed.
//            socket.onclose = function(event) {
////            socketStatus.innerHTML = 'Disconnected from WebSocket.';
////            socketStatus.className = 'closed';
//            };





    }


    ]
        );


var stripTags=function(s){
    if(s){
        return s.replace(/(<([^>]+)>)/ig,"");
    }else{
        return s;
    }

}