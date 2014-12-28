$(window).load(function(){
    searchUpdates();
    var timeInt=4000;
   setInterval(searchUpdates,timeInt);
});



var searchUpdates=function(){

    var notification;
    var makeUnseenNotificationsSeen=function(){
        $.ajax({
            url : "api/notification/set",
            type: "GET",
            success: function(data, textStatus, jqXHR)
            {
                $(".notificationUpdatesHolder i.fa-bell").removeClass("fa-bell").addClass("fa-bell-o");
                $(".notification-list .updateItem").each(function(){
                    $(this).removeClass("notSeen").add("seen");
                })
                $("#notificationIcon").closest("a").find("span.fa-stack-1x").remove();;

            },
            error: function (jqXHR, textStatus, errorThrown)
            {
                console.log(textStatus);
            }

        });
    }

    $('#notificationUpdatesHolder').on('hidden.bs.dropdown', function () {
        makeUnseenNotificationsSeen();
    });

    var newUpdates=function(){
        for(n in notification_infos){
            if(!notification_infos[n].isSeen){
                return true;
            }
        }
        return false;
    }


    $.ajax({
        url : "/api/notification/user",
        type: "GET",
        success: function(data, textStatus, jqXHR)
        {
            appendUpdateItems=function(){
                if($(".notification-list .updateItem").length>15){
                    $(".notification-list .updateItem.seen").remove();
                }
                var count=0;
                for(n in data){
                    if(data[n].isSeen){

                    }else{
                        count=count+1
                        if($('.notification-list #ni'+data[n].id).closest(".notification-list").length>0){

                        }else{
                            var url=getComputerUrl(data[n]);

                              $('.notification-list').prepend(
                                    $('<li>').attr('class','updateItem notSeen').attr('id','ni'+data[n].id).append(
                                        $('<a>').attr('href',url).append(
                                            transformVerbIntoStatement(data[n],data[n].acted,data[n].verb)
                                        )));
                        }
                    }
                }
                if($("#notificationLink .fa-stack-1x").length>0){
                    if(parseInt($("#notificationLink .fa-stack-1x").html())!=count){
                        $("#notificationLink .fa-stack-1x").html(count);
                    }
                }else{
                    $("#notificationLink .fa-stack").append($('<span>').attr('class','fa-stack-1x').html(count));
                }


            }
            appendUpdateItemsOld=function(){

                for(n in data){
                        if($('.notification-list #ni'+data[n].id).closest(".notification-list").length>0){

                        }else{
                            var url=getComputerUrl(data[n]);
                            $('.notification-list').prepend(
                                $('<li>').attr('class','updateItem seen').attr('id','ni'+data[n].id).append(
                                    $('<a>').attr('href',url).append(
                                        transformVerbIntoStatement(data[n],data[n].acted,data[n].verb)
                                    )));
                        }

                }

            }
            notification_infos=data;
            if(newUpdates()){

                    appendUpdateItems();

            }else{
                //doNothing
                if($(".notification-list .updateItem").length<15){
                    appendUpdateItemsOld();
                }
            }






        },
        error: function (jqXHR, textStatus, errorThrown)
        {
            console.log(textStatus);
        }
    });
}

var transformVerbIntoStatement=function(data,acted,verb){
        console.log(data);
        var str= acted.name+ " "+ verb +" your "+data.notificationObject.objectType ;
        return str.charAt(0).toUpperCase()+str.slice(1);



}
var getComputerUrl=function(a){
    var url="";
    console.log(a);
    if(a.notificationObject.objectType=="shortNote"){
        url="/note?slug"+a.notificationObject.identifier;
    }else if(a.notificationObject.objectType=="forumAnswer"){
        url="/forum/thread?slug="+a.notificationObject.meta.metaStr;

    }else{
        url="/home";
    }
    return url;
}
