// @SOURCE:W:/Pre School/conf/routes
// @HASH:6b2299ceb371fe6af73a67092040de0f7b4bfd0a
// @DATE:Sun Dec 28 16:26:18 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:16
package com.feth.play.module.pa.controllers {

// @LINE:17
// @LINE:16
class ReverseAuthenticate {
    

// @LINE:16
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:17
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                
    
}
                          
}
                  

// @LINE:144
// @LINE:123
// @LINE:111
// @LINE:103
// @LINE:100
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:65
package controllers.content {

// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:65
class ReverseShortNote {
    

// @LINE:79
def flag(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shortnote/flag")
}
                                                

// @LINE:73
def getEditHistory(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/shortnote/edithistory" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:75
def getPostsByChapter(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/shortnote/chapter" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:77
def doUpvote(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/shortnote/upvote")
}
                                                

// @LINE:76
def feedShortNode(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/shortnote/feed")
}
                                                

// @LINE:65
def shortNote(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shortnote/add")
}
                                                

// @LINE:69
def infoShortNote(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shortnote" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:72
def doedit_shortnote(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shortnote/doedit")
}
                                                

// @LINE:80
def report(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shortnote/report")
}
                                                

// @LINE:74
def getPostsByTag(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/shortnote/tag" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:68
def returnShortNotesByUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/shortnote/list/user")
}
                                                

// @LINE:78
def doDownvote(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/shortnote/downvote")
}
                                                

// @LINE:67
def returnShortNotes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/shortnote/list")
}
                                                
    
}
                          

// @LINE:103
// @LINE:100
class ReverseSubject {
    

// @LINE:103
def returnSubject(subject:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "branch/" + implicitly[PathBindable[String]].unbind("subject", dynamicString(subject)))
}
                                                

// @LINE:100
def returnSubjects(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/subject/list")
}
                                                
    
}
                          

// @LINE:144
class ReverseTag {
    

// @LINE:144
def returnTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/tag/list")
}
                                                
    
}
                          

// @LINE:123
class ReverseConcept {
    

// @LINE:123
def returnAllConcepts(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/concept/list")
}
                                                
    
}
                          

// @LINE:111
class ReverseChapter {
    

// @LINE:111
def returnChapters(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/chapter/list")
}
                                                
    
}
                          
}
                  

// @LINE:159
// @LINE:157
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:157
class ReverseAssets {
    

// @LINE:157
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:49
// @LINE:48
class ReverseUserController {
    

// @LINE:49
def getUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/users")
}
                                                

// @LINE:48
def getAllUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/users/all")
}
                                                
    
}
                          

// @LINE:159
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:46
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def doSignup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:46
def signupAdmin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signupadmin")
}
                                                

// @LINE:81
def upload(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "file/upload")
}
                                                

// @LINE:83
def getCurrentUserImagesAsJson(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/user/images")
}
                                                

// @LINE:11
def profile(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "profile/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                

// @LINE:93
def concept(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "discover/concept" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:84
def updateImage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/user/image/update")
}
                                                

// @LINE:94
def tag(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "discover/tag" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:62
def newShortNote(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shortnote/new")
}
                                                

// @LINE:70
def moderateShortNote(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shortnote/mod" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:58
def followTag(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/user/tag/follow")
}
                                                

// @LINE:60
def isfollowingTag(username:String, tagslug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/user/tag/isfollowing" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)), Some(implicitly[QueryStringBindable[String]].unbind("tagslug", tagslug)))))
}
                                                

// @LINE:10
def user_account(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "account")
}
                                                

// @LINE:8
def jsRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascript/routes.js")
}
                                                

// @LINE:19
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:57
def isfollowing(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/user/isfollowing" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)))))
}
                                                

// @LINE:14
def doLogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:55
def followUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/user/follow")
}
                                                

// @LINE:56
def unfollowUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/user/unfollow")
}
                                                

// @LINE:63
def settings(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "settings")
}
                                                

// @LINE:50
def getUserActivity(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/activity/user")
}
                                                

// @LINE:82
def getImage(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/image" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:61
def reader(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reader")
}
                                                

// @LINE:87
def notfound(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "404")
}
                                                

// @LINE:71
def editShortnote(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shortnote/edit" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:90
def discover(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "discover")
}
                                                

// @LINE:66
def recentTenShortNotes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/shortnote/recent")
}
                                                

// @LINE:7
def home(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "home")
}
                                                

// @LINE:86
def getShortNote(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "note" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:92
def chapter(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "discover/chapter" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:91
def subject(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "discover/subject" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:97
def tags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tags")
}
                                                

// @LINE:59
def unfollowTag(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/user/tag/unfollow")
}
                                                

// @LINE:13
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:159
def testwebSocket(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "testws")
}
                                                
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
class ReverseSignup {
    

// @LINE:26
def exists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                                                

// @LINE:25
def verify(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:22
def unverified(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                                                

// @LINE:23
def oAuthDenied(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                                                

// @LINE:28
def resetPassword(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:29
def doResetPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
}
                                                

// @LINE:45
def doForgotPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
}
                                                

// @LINE:44
def forgotPassword(email:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                
    
}
                          

// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
class ReverseAccount {
    

// @LINE:41
def askMerge(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:42
def doMerge(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:34
def verifyEmail(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
}
                                                

// @LINE:38
def askLink(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:39
def doLink(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:31
def changePassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                

// @LINE:36
def link(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
}
                                                

// @LINE:32
def doChangePassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                
    
}
                          
}
                  

// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
package controllers.Information {

// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseNotification {
    

// @LINE:53
def setNotification(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/notification/set")
}
                                                

// @LINE:54
def updatesPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "updates")
}
                                                

// @LINE:52
def seeNotification(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/notification/see")
}
                                                

// @LINE:51
def getNotification(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/notification/user")
}
                                                
    
}
                          
}
                  

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
package controllers.Forum {

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
class ReverseForum {
    

// @LINE:131
def addForumThread(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forum/add")
}
                                                

// @LINE:141
def saveAnswer(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forum/answer/save")
}
                                                

// @LINE:142
def editAnswerThread(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forum/answer/edit" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:130
def ForumPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forum")
}
                                                

// @LINE:139
def saveEditedForumThread(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forum/thread/doedit")
}
                                                

// @LINE:135
def getApiForumAnswerLike(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/forum/answer/like" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:137
def getApiForumAnswerLikedByUser(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/forum/answer/userlike" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:134
def getApiForumThreadLike(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/forum/thread/like" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:136
def getApiForumThreadLikedByUser(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/forum/thread/userlike" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:132
def getForumThread(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forum/thread" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:140
def saveQuestion(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forum/thread/save")
}
                                                

// @LINE:143
def saveEditedAnswer(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "forum/answer/doedit")
}
                                                

// @LINE:138
def editForumThread(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "forum/thread/edit" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:133
def getApiForumThread(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/forum/thread" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                
    
}
                          
}
                  

// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:121
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:105
// @LINE:104
// @LINE:102
// @LINE:101
// @LINE:98
package controllers.Admin {

// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:121
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:105
// @LINE:104
// @LINE:102
// @LINE:101
// @LINE:98
class ReverseAdminApplication {
    

// @LINE:152
def getAdminData(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "data")
}
                                                

// @LINE:124
def infoConc(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "concept" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:121
def newConcept(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "concept/new")
}
                                                

// @LINE:109
def infoChap(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chapter" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:118
def chapterMoveUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "chapter/moveup")
}
                                                

// @LINE:125
def add_concept(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "concept/add")
}
                                                

// @LINE:146
def editTag(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/edit" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:145
def newTag(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/new")
}
                                                

// @LINE:119
def chapterMoveDown(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "chapter/movedown")
}
                                                

// @LINE:126
def doedit_concept(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "concept/doedit")
}
                                                

// @LINE:116
def getCategoriesFromSubject(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "chapter/list/subject")
}
                                                

// @LINE:105
def doedit_subject(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "subject/doedit")
}
                                                

// @LINE:127
def conceptMoveUp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "concept/moveup")
}
                                                

// @LINE:153
def getUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "m/users")
}
                                                

// @LINE:154
def changeUserRole(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/m/users/change/role")
}
                                                

// @LINE:110
def editChapter(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chapter/edit" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:98
def newSubject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "subject/new")
}
                                                

// @LINE:101
def editSubject(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "subject/edit" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:114
def add_chapter(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "chapter/add")
}
                                                

// @LINE:115
def getChaptersFromSubjectAsList(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chapter/list/subject" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:147
def infoTag(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:113
def newChapter(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chapter/new")
}
                                                

// @LINE:104
def add_subject(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "subject/add")
}
                                                

// @LINE:148
def add_tag(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tag/add")
}
                                                

// @LINE:128
def conceptMoveDown(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "concept/movedown")
}
                                                

// @LINE:149
def doedit_tag(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tag/doedit")
}
                                                

// @LINE:122
def editConcept(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "concept/edit" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:102
def infoSub(slug:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "subject" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("slug", slug)))))
}
                                                

// @LINE:117
def doedit_chapter(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "chapter/doedit")
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:16
package com.feth.play.module.pa.controllers.javascript {

// @LINE:17
// @LINE:16
class ReverseAuthenticate {
    

// @LINE:16
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:17
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        
    
}
              
}
        

// @LINE:144
// @LINE:123
// @LINE:111
// @LINE:103
// @LINE:100
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:65
package controllers.content.javascript {

// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:65
class ReverseShortNote {
    

// @LINE:79
def flag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.flag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shortnote/flag"})
      }
   """
)
                        

// @LINE:73
def getEditHistory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.getEditHistory",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/edithistory" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:75
def getPostsByChapter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.getPostsByChapter",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/chapter" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:77
def doUpvote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.doUpvote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/upvote"})
      }
   """
)
                        

// @LINE:76
def feedShortNode : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.feedShortNode",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/feed"})
      }
   """
)
                        

// @LINE:65
def shortNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.shortNote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shortnote/add"})
      }
   """
)
                        

// @LINE:69
def infoShortNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.infoShortNote",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shortnote" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:72
def doedit_shortnote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.doedit_shortnote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shortnote/doedit"})
      }
   """
)
                        

// @LINE:80
def report : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.report",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shortnote/report"})
      }
   """
)
                        

// @LINE:74
def getPostsByTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.getPostsByTag",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/tag" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:68
def returnShortNotesByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.returnShortNotesByUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/list/user"})
      }
   """
)
                        

// @LINE:78
def doDownvote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.doDownvote",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/downvote"})
      }
   """
)
                        

// @LINE:67
def returnShortNotes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.ShortNote.returnShortNotes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/list"})
      }
   """
)
                        
    
}
              

// @LINE:103
// @LINE:100
class ReverseSubject {
    

// @LINE:103
def returnSubject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.Subject.returnSubject",
   """
      function(subject) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "branch/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("subject", encodeURIComponent(subject))})
      }
   """
)
                        

// @LINE:100
def returnSubjects : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.Subject.returnSubjects",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/subject/list"})
      }
   """
)
                        
    
}
              

// @LINE:144
class ReverseTag {
    

// @LINE:144
def returnTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.Tag.returnTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/tag/list"})
      }
   """
)
                        
    
}
              

// @LINE:123
class ReverseConcept {
    

// @LINE:123
def returnAllConcepts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.Concept.returnAllConcepts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/concept/list"})
      }
   """
)
                        
    
}
              

// @LINE:111
class ReverseChapter {
    

// @LINE:111
def returnChapters : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.content.Chapter.returnChapters",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/chapter/list"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:159
// @LINE:157
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:157
class ReverseAssets {
    

// @LINE:157
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:49
// @LINE:48
class ReverseUserController {
    

// @LINE:49
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
      }
   """
)
                        

// @LINE:48
def getAllUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UserController.getAllUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users/all"})
      }
   """
)
                        
    
}
              

// @LINE:159
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:46
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def doSignup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doSignup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:46
def signupAdmin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signupAdmin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signupadmin"})
      }
   """
)
                        

// @LINE:81
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "file/upload"})
      }
   """
)
                        

// @LINE:83
def getCurrentUserImagesAsJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getCurrentUserImagesAsJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/images"})
      }
   """
)
                        

// @LINE:11
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        

// @LINE:93
def concept : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.concept",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discover/concept" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:84
def updateImage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateImage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/image/update"})
      }
   """
)
                        

// @LINE:94
def tag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tag",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discover/tag" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:62
def newShortNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newShortNote",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shortnote/new"})
      }
   """
)
                        

// @LINE:70
def moderateShortNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.moderateShortNote",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shortnote/mod" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:58
def followTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.followTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/tag/follow"})
      }
   """
)
                        

// @LINE:60
def isfollowingTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.isfollowingTag",
   """
      function(username,tagslug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/tag/isfollowing" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("tagslug", tagslug)])})
      }
   """
)
                        

// @LINE:10
def user_account : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.user_account",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account"})
      }
   """
)
                        

// @LINE:8
def jsRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascript/routes.js"})
      }
   """
)
                        

// @LINE:19
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:57
def isfollowing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.isfollowing",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/isfollowing" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username)])})
      }
   """
)
                        

// @LINE:14
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:55
def followUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.followUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/follow"})
      }
   """
)
                        

// @LINE:56
def unfollowUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.unfollowUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/unfollow"})
      }
   """
)
                        

// @LINE:63
def settings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.settings",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
      }
   """
)
                        

// @LINE:50
def getUserActivity : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUserActivity",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/activity/user"})
      }
   """
)
                        

// @LINE:82
def getImage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getImage",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/image" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:61
def reader : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.reader",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reader"})
      }
   """
)
                        

// @LINE:87
def notfound : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.notfound",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "404"})
      }
   """
)
                        

// @LINE:71
def editShortnote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editShortnote",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shortnote/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:90
def discover : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.discover",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discover"})
      }
   """
)
                        

// @LINE:66
def recentTenShortNotes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.recentTenShortNotes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/shortnote/recent"})
      }
   """
)
                        

// @LINE:7
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
      }
   """
)
                        

// @LINE:86
def getShortNote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getShortNote",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "note" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:92
def chapter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.chapter",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discover/chapter" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:91
def subject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.subject",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discover/subject" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:97
def tags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tags"})
      }
   """
)
                        

// @LINE:59
def unfollowTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.unfollowTag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/tag/unfollow"})
      }
   """
)
                        

// @LINE:13
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:159
def testwebSocket : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.testwebSocket",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testws"})
      }
   """
)
                        
    
}
              

// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
class ReverseSignup {
    

// @LINE:26
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:25
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:22
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:23
def oAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:28
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:29
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
      }
   """
)
                        

// @LINE:45
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
      }
   """
)
                        

// @LINE:44
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                        
    
}
              

// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
class ReverseAccount {
    

// @LINE:41
def askMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askMerge",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:42
def doMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doMerge",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:34
def verifyEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.verifyEmail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
      }
   """
)
                        

// @LINE:38
def askLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:39
def doLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doLink",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:31
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.changePassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

// @LINE:36
def link : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.link",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
      }
   """
)
                        

// @LINE:32
def doChangePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doChangePassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
package controllers.Information.javascript {

// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseNotification {
    

// @LINE:53
def setNotification : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Information.Notification.setNotification",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/notification/set"})
      }
   """
)
                        

// @LINE:54
def updatesPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Information.Notification.updatesPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updates"})
      }
   """
)
                        

// @LINE:52
def seeNotification : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Information.Notification.seeNotification",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/notification/see"})
      }
   """
)
                        

// @LINE:51
def getNotification : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Information.Notification.getNotification",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/notification/user"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
package controllers.Forum.javascript {

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
class ReverseForum {
    

// @LINE:131
def addForumThread : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.addForumThread",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum/add"})
      }
   """
)
                        

// @LINE:141
def saveAnswer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.saveAnswer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forum/answer/save"})
      }
   """
)
                        

// @LINE:142
def editAnswerThread : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.editAnswerThread",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum/answer/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:130
def ForumPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.ForumPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum"})
      }
   """
)
                        

// @LINE:139
def saveEditedForumThread : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.saveEditedForumThread",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forum/thread/doedit"})
      }
   """
)
                        

// @LINE:135
def getApiForumAnswerLike : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.getApiForumAnswerLike",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/forum/answer/like" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:137
def getApiForumAnswerLikedByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.getApiForumAnswerLikedByUser",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/forum/answer/userlike" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:134
def getApiForumThreadLike : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.getApiForumThreadLike",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/forum/thread/like" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:136
def getApiForumThreadLikedByUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.getApiForumThreadLikedByUser",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/forum/thread/userlike" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:132
def getForumThread : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.getForumThread",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum/thread" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:140
def saveQuestion : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.saveQuestion",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forum/thread/save"})
      }
   """
)
                        

// @LINE:143
def saveEditedAnswer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.saveEditedAnswer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forum/answer/doedit"})
      }
   """
)
                        

// @LINE:138
def editForumThread : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.editForumThread",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forum/thread/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:133
def getApiForumThread : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Forum.Forum.getApiForumThread",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/forum/thread" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        
    
}
              
}
        

// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:121
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:105
// @LINE:104
// @LINE:102
// @LINE:101
// @LINE:98
package controllers.Admin.javascript {

// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:121
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:105
// @LINE:104
// @LINE:102
// @LINE:101
// @LINE:98
class ReverseAdminApplication {
    

// @LINE:152
def getAdminData : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.getAdminData",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "data"})
      }
   """
)
                        

// @LINE:124
def infoConc : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.infoConc",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "concept" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:121
def newConcept : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.newConcept",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "concept/new"})
      }
   """
)
                        

// @LINE:109
def infoChap : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.infoChap",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:118
def chapterMoveUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.chapterMoveUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter/moveup"})
      }
   """
)
                        

// @LINE:125
def add_concept : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.add_concept",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "concept/add"})
      }
   """
)
                        

// @LINE:146
def editTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.editTag",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:145
def newTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.newTag",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/new"})
      }
   """
)
                        

// @LINE:119
def chapterMoveDown : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.chapterMoveDown",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter/movedown"})
      }
   """
)
                        

// @LINE:126
def doedit_concept : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.doedit_concept",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "concept/doedit"})
      }
   """
)
                        

// @LINE:116
def getCategoriesFromSubject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.getCategoriesFromSubject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter/list/subject"})
      }
   """
)
                        

// @LINE:105
def doedit_subject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.doedit_subject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/doedit"})
      }
   """
)
                        

// @LINE:127
def conceptMoveUp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.conceptMoveUp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "concept/moveup"})
      }
   """
)
                        

// @LINE:153
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.getUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "m/users"})
      }
   """
)
                        

// @LINE:154
def changeUserRole : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.changeUserRole",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/m/users/change/role"})
      }
   """
)
                        

// @LINE:110
def editChapter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.editChapter",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:98
def newSubject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.newSubject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/new"})
      }
   """
)
                        

// @LINE:101
def editSubject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.editSubject",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:114
def add_chapter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.add_chapter",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter/add"})
      }
   """
)
                        

// @LINE:115
def getChaptersFromSubjectAsList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.getChaptersFromSubjectAsList",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter/list/subject" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:147
def infoTag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.infoTag",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:113
def newChapter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.newChapter",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter/new"})
      }
   """
)
                        

// @LINE:104
def add_subject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.add_subject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/add"})
      }
   """
)
                        

// @LINE:148
def add_tag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.add_tag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/add"})
      }
   """
)
                        

// @LINE:128
def conceptMoveDown : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.conceptMoveDown",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "concept/movedown"})
      }
   """
)
                        

// @LINE:149
def doedit_tag : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.doedit_tag",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/doedit"})
      }
   """
)
                        

// @LINE:122
def editConcept : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.editConcept",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "concept/edit" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:102
def infoSub : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.infoSub",
   """
      function(slug) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("slug", slug)])})
      }
   """
)
                        

// @LINE:117
def doedit_chapter : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.AdminApplication.doedit_chapter",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chapter/doedit"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:16
package com.feth.play.module.pa.controllers.ref {


// @LINE:17
// @LINE:16
class ReverseAuthenticate {
    

// @LINE:16
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:17
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:144
// @LINE:123
// @LINE:111
// @LINE:103
// @LINE:100
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:65
package controllers.content.ref {


// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:69
// @LINE:68
// @LINE:67
// @LINE:65
class ReverseShortNote {
    

// @LINE:79
def flag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.flag(), HandlerDef(this, "controllers.content.ShortNote", "flag", Seq(), "POST", """""", _prefix + """shortnote/flag""")
)
                      

// @LINE:73
def getEditHistory(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.getEditHistory(id), HandlerDef(this, "controllers.content.ShortNote", "getEditHistory", Seq(classOf[Long]), "GET", """""", _prefix + """api/shortnote/edithistory""")
)
                      

// @LINE:75
def getPostsByChapter(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.getPostsByChapter(slug), HandlerDef(this, "controllers.content.ShortNote", "getPostsByChapter", Seq(classOf[String]), "GET", """""", _prefix + """api/shortnote/chapter""")
)
                      

// @LINE:77
def doUpvote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.doUpvote(), HandlerDef(this, "controllers.content.ShortNote", "doUpvote", Seq(), "POST", """""", _prefix + """api/shortnote/upvote""")
)
                      

// @LINE:76
def feedShortNode(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.feedShortNode(), HandlerDef(this, "controllers.content.ShortNote", "feedShortNode", Seq(), "GET", """""", _prefix + """api/shortnote/feed""")
)
                      

// @LINE:65
def shortNote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.shortNote(), HandlerDef(this, "controllers.content.ShortNote", "shortNote", Seq(), "POST", """""", _prefix + """shortnote/add""")
)
                      

// @LINE:69
def infoShortNote(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.infoShortNote(slug), HandlerDef(this, "controllers.content.ShortNote", "infoShortNote", Seq(classOf[String]), "GET", """""", _prefix + """shortnote""")
)
                      

// @LINE:72
def doedit_shortnote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.doedit_shortnote(), HandlerDef(this, "controllers.content.ShortNote", "doedit_shortnote", Seq(), "POST", """""", _prefix + """shortnote/doedit""")
)
                      

// @LINE:80
def report(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.report(), HandlerDef(this, "controllers.content.ShortNote", "report", Seq(), "POST", """""", _prefix + """shortnote/report""")
)
                      

// @LINE:74
def getPostsByTag(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.getPostsByTag(slug), HandlerDef(this, "controllers.content.ShortNote", "getPostsByTag", Seq(classOf[String]), "GET", """""", _prefix + """api/shortnote/tag""")
)
                      

// @LINE:68
def returnShortNotesByUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.returnShortNotesByUser(), HandlerDef(this, "controllers.content.ShortNote", "returnShortNotesByUser", Seq(), "GET", """""", _prefix + """api/shortnote/list/user""")
)
                      

// @LINE:78
def doDownvote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.doDownvote(), HandlerDef(this, "controllers.content.ShortNote", "doDownvote", Seq(), "POST", """""", _prefix + """api/shortnote/downvote""")
)
                      

// @LINE:67
def returnShortNotes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.ShortNote.returnShortNotes(), HandlerDef(this, "controllers.content.ShortNote", "returnShortNotes", Seq(), "GET", """""", _prefix + """api/shortnote/list""")
)
                      
    
}
                          

// @LINE:103
// @LINE:100
class ReverseSubject {
    

// @LINE:103
def returnSubject(subject:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.Subject.returnSubject(subject), HandlerDef(this, "controllers.content.Subject", "returnSubject", Seq(classOf[String]), "GET", """""", _prefix + """branch/$subject<[^/]+>""")
)
                      

// @LINE:100
def returnSubjects(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.Subject.returnSubjects(), HandlerDef(this, "controllers.content.Subject", "returnSubjects", Seq(), "GET", """""", _prefix + """api/subject/list""")
)
                      
    
}
                          

// @LINE:144
class ReverseTag {
    

// @LINE:144
def returnTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.Tag.returnTags(), HandlerDef(this, "controllers.content.Tag", "returnTags", Seq(), "GET", """""", _prefix + """api/tag/list""")
)
                      
    
}
                          

// @LINE:123
class ReverseConcept {
    

// @LINE:123
def returnAllConcepts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.Concept.returnAllConcepts(), HandlerDef(this, "controllers.content.Concept", "returnAllConcepts", Seq(), "GET", """""", _prefix + """api/concept/list""")
)
                      
    
}
                          

// @LINE:111
class ReverseChapter {
    

// @LINE:111
def returnChapters(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.content.Chapter.returnChapters(), HandlerDef(this, "controllers.content.Chapter", "returnChapters", Seq(), "GET", """""", _prefix + """api/chapter/list""")
)
                      
    
}
                          
}
        

// @LINE:159
// @LINE:157
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:157
class ReverseAssets {
    

// @LINE:157
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:49
// @LINE:48
class ReverseUserController {
    

// @LINE:49
def getUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.getUsers(), HandlerDef(this, "controllers.UserController", "getUsers", Seq(), "GET", """""", _prefix + """api/users""")
)
                      

// @LINE:48
def getAllUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UserController.getAllUsers(), HandlerDef(this, "controllers.UserController", "getAllUsers", Seq(), "GET", """""", _prefix + """api/users/all""")
)
                      
    
}
                          

// @LINE:159
// @LINE:97
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:87
// @LINE:86
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:71
// @LINE:70
// @LINE:66
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:50
// @LINE:46
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def doSignup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doSignup(), HandlerDef(this, "controllers.Application", "doSignup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:46
def signupAdmin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signupAdmin(), HandlerDef(this, "controllers.Application", "signupAdmin", Seq(), "GET", """""", _prefix + """signupadmin""")
)
                      

// @LINE:81
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.upload(), HandlerDef(this, "controllers.Application", "upload", Seq(), "POST", """""", _prefix + """file/upload""")
)
                      

// @LINE:83
def getCurrentUserImagesAsJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getCurrentUserImagesAsJson(), HandlerDef(this, "controllers.Application", "getCurrentUserImagesAsJson", Seq(), "GET", """""", _prefix + """api/user/images""")
)
                      

// @LINE:11
def profile(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(username), HandlerDef(this, "controllers.Application", "profile", Seq(classOf[String]), "GET", """""", _prefix + """profile/$username<[^/]+>""")
)
                      

// @LINE:93
def concept(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.concept(slug), HandlerDef(this, "controllers.Application", "concept", Seq(classOf[String]), "GET", """""", _prefix + """discover/concept""")
)
                      

// @LINE:84
def updateImage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateImage(), HandlerDef(this, "controllers.Application", "updateImage", Seq(), "POST", """""", _prefix + """api/user/image/update""")
)
                      

// @LINE:94
def tag(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tag(slug), HandlerDef(this, "controllers.Application", "tag", Seq(classOf[String]), "GET", """""", _prefix + """discover/tag""")
)
                      

// @LINE:62
def newShortNote(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newShortNote(), HandlerDef(this, "controllers.Application", "newShortNote", Seq(), "GET", """""", _prefix + """shortnote/new""")
)
                      

// @LINE:70
def moderateShortNote(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.moderateShortNote(slug), HandlerDef(this, "controllers.Application", "moderateShortNote", Seq(classOf[String]), "GET", """""", _prefix + """shortnote/mod""")
)
                      

// @LINE:58
def followTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.followTag(), HandlerDef(this, "controllers.Application", "followTag", Seq(), "POST", """""", _prefix + """api/user/tag/follow""")
)
                      

// @LINE:60
def isfollowingTag(username:String, tagslug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.isfollowingTag(username, tagslug), HandlerDef(this, "controllers.Application", "isfollowingTag", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """api/user/tag/isfollowing""")
)
                      

// @LINE:10
def user_account(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.user_account(), HandlerDef(this, "controllers.Application", "user_account", Seq(), "GET", """""", _prefix + """account""")
)
                      

// @LINE:8
def jsRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsRoutes(), HandlerDef(this, "controllers.Application", "jsRoutes", Seq(), "GET", """""", _prefix + """assets/javascript/routes.js""")
)
                      

// @LINE:19
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:57
def isfollowing(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.isfollowing(username), HandlerDef(this, "controllers.Application", "isfollowing", Seq(classOf[String]), "GET", """""", _prefix + """api/user/isfollowing""")
)
                      

// @LINE:14
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doLogin(), HandlerDef(this, "controllers.Application", "doLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:55
def followUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.followUser(), HandlerDef(this, "controllers.Application", "followUser", Seq(), "POST", """""", _prefix + """api/user/follow""")
)
                      

// @LINE:56
def unfollowUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.unfollowUser(), HandlerDef(this, "controllers.Application", "unfollowUser", Seq(), "POST", """""", _prefix + """api/user/unfollow""")
)
                      

// @LINE:63
def settings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.settings(), HandlerDef(this, "controllers.Application", "settings", Seq(), "GET", """""", _prefix + """settings""")
)
                      

// @LINE:50
def getUserActivity(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getUserActivity(), HandlerDef(this, "controllers.Application", "getUserActivity", Seq(), "GET", """""", _prefix + """api/activity/user""")
)
                      

// @LINE:82
def getImage(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getImage(id), HandlerDef(this, "controllers.Application", "getImage", Seq(classOf[Long]), "GET", """""", _prefix + """api/image""")
)
                      

// @LINE:61
def reader(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.reader(), HandlerDef(this, "controllers.Application", "reader", Seq(), "GET", """""", _prefix + """reader""")
)
                      

// @LINE:87
def notfound(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.notfound(), HandlerDef(this, "controllers.Application", "notfound", Seq(), "GET", """""", _prefix + """404""")
)
                      

// @LINE:71
def editShortnote(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editShortnote(slug), HandlerDef(this, "controllers.Application", "editShortnote", Seq(classOf[String]), "GET", """""", _prefix + """shortnote/edit""")
)
                      

// @LINE:90
def discover(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.discover(), HandlerDef(this, "controllers.Application", "discover", Seq(), "GET", """Page""", _prefix + """discover""")
)
                      

// @LINE:66
def recentTenShortNotes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.recentTenShortNotes(), HandlerDef(this, "controllers.Application", "recentTenShortNotes", Seq(), "GET", """""", _prefix + """api/shortnote/recent""")
)
                      

// @LINE:7
def home(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Seq(), "GET", """""", _prefix + """home""")
)
                      

// @LINE:86
def getShortNote(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getShortNote(slug), HandlerDef(this, "controllers.Application", "getShortNote", Seq(classOf[String]), "GET", """""", _prefix + """note""")
)
                      

// @LINE:92
def chapter(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.chapter(slug), HandlerDef(this, "controllers.Application", "chapter", Seq(classOf[String]), "GET", """""", _prefix + """discover/chapter""")
)
                      

// @LINE:91
def subject(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.subject(slug), HandlerDef(this, "controllers.Application", "subject", Seq(classOf[String]), "GET", """""", _prefix + """discover/subject""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:97
def tags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tags(), HandlerDef(this, "controllers.Application", "tags", Seq(), "GET", """""", _prefix + """tags""")
)
                      

// @LINE:59
def unfollowTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.unfollowTag(), HandlerDef(this, "controllers.Application", "unfollowTag", Seq(), "POST", """""", _prefix + """api/user/tag/unfollow""")
)
                      

// @LINE:13
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:159
def testwebSocket(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.testwebSocket(), HandlerDef(this, "controllers.Application", "testwebSocket", Seq(), "GET", """GET         /tested                                controllers.TestSocket.hello""", _prefix + """testws""")
)
                      
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
class ReverseSignup {
    

// @LINE:26
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this, "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:25
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:22
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this, "controllers.Signup", "unverified", Seq(), "GET", """""", _prefix + """accounts/unverified""")
)
                      

// @LINE:23
def oAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:28
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:29
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this, "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """accounts/password/reset""")
)
                      

// @LINE:45
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this, "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/password/forgot""")
)
                      

// @LINE:44
def forgotPassword(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]), "GET", """""", _prefix + """login/password/forgot""")
)
                      
    
}
                          

// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
class ReverseAccount {
    

// @LINE:41
def askMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askMerge(), HandlerDef(this, "controllers.Account", "askMerge", Seq(), "GET", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:42
def doMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doMerge(), HandlerDef(this, "controllers.Account", "doMerge", Seq(), "POST", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:34
def verifyEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.verifyEmail(), HandlerDef(this, "controllers.Account", "verifyEmail", Seq(), "GET", """""", _prefix + """accounts/verify""")
)
                      

// @LINE:38
def askLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askLink(), HandlerDef(this, "controllers.Account", "askLink", Seq(), "GET", """""", _prefix + """accounts/link""")
)
                      

// @LINE:39
def doLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doLink(), HandlerDef(this, "controllers.Account", "doLink", Seq(), "POST", """""", _prefix + """accounts/link""")
)
                      

// @LINE:31
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.changePassword(), HandlerDef(this, "controllers.Account", "changePassword", Seq(), "GET", """""", _prefix + """accounts/password/change""")
)
                      

// @LINE:36
def link(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.link(), HandlerDef(this, "controllers.Account", "link", Seq(), "GET", """""", _prefix + """accounts/add""")
)
                      

// @LINE:32
def doChangePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doChangePassword(), HandlerDef(this, "controllers.Account", "doChangePassword", Seq(), "POST", """""", _prefix + """accounts/password/change""")
)
                      
    
}
                          
}
        

// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
package controllers.Information.ref {


// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseNotification {
    

// @LINE:53
def setNotification(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Information.Notification.setNotification(), HandlerDef(this, "controllers.Information.Notification", "setNotification", Seq(), "GET", """""", _prefix + """api/notification/set""")
)
                      

// @LINE:54
def updatesPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Information.Notification.updatesPage(), HandlerDef(this, "controllers.Information.Notification", "updatesPage", Seq(), "GET", """""", _prefix + """updates""")
)
                      

// @LINE:52
def seeNotification(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Information.Notification.seeNotification(), HandlerDef(this, "controllers.Information.Notification", "seeNotification", Seq(), "POST", """""", _prefix + """api/notification/see""")
)
                      

// @LINE:51
def getNotification(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Information.Notification.getNotification(), HandlerDef(this, "controllers.Information.Notification", "getNotification", Seq(), "GET", """""", _prefix + """api/notification/user""")
)
                      
    
}
                          
}
        

// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
package controllers.Forum.ref {


// @LINE:143
// @LINE:142
// @LINE:141
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:133
// @LINE:132
// @LINE:131
// @LINE:130
class ReverseForum {
    

// @LINE:131
def addForumThread(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.addForumThread(), HandlerDef(this, "controllers.Forum.Forum", "addForumThread", Seq(), "GET", """""", _prefix + """forum/add""")
)
                      

// @LINE:141
def saveAnswer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.saveAnswer(), HandlerDef(this, "controllers.Forum.Forum", "saveAnswer", Seq(), "POST", """""", _prefix + """forum/answer/save""")
)
                      

// @LINE:142
def editAnswerThread(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.editAnswerThread(slug), HandlerDef(this, "controllers.Forum.Forum", "editAnswerThread", Seq(classOf[String]), "GET", """""", _prefix + """forum/answer/edit""")
)
                      

// @LINE:130
def ForumPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.ForumPage(), HandlerDef(this, "controllers.Forum.Forum", "ForumPage", Seq(), "GET", """""", _prefix + """forum""")
)
                      

// @LINE:139
def saveEditedForumThread(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.saveEditedForumThread(), HandlerDef(this, "controllers.Forum.Forum", "saveEditedForumThread", Seq(), "POST", """""", _prefix + """forum/thread/doedit""")
)
                      

// @LINE:135
def getApiForumAnswerLike(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.getApiForumAnswerLike(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumAnswerLike", Seq(classOf[String]), "GET", """""", _prefix + """api/forum/answer/like""")
)
                      

// @LINE:137
def getApiForumAnswerLikedByUser(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.getApiForumAnswerLikedByUser(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumAnswerLikedByUser", Seq(classOf[String]), "GET", """""", _prefix + """api/forum/answer/userlike""")
)
                      

// @LINE:134
def getApiForumThreadLike(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.getApiForumThreadLike(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumThreadLike", Seq(classOf[String]), "GET", """""", _prefix + """api/forum/thread/like""")
)
                      

// @LINE:136
def getApiForumThreadLikedByUser(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.getApiForumThreadLikedByUser(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumThreadLikedByUser", Seq(classOf[String]), "GET", """""", _prefix + """api/forum/thread/userlike""")
)
                      

// @LINE:132
def getForumThread(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.getForumThread(slug), HandlerDef(this, "controllers.Forum.Forum", "getForumThread", Seq(classOf[String]), "GET", """""", _prefix + """forum/thread""")
)
                      

// @LINE:140
def saveQuestion(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.saveQuestion(), HandlerDef(this, "controllers.Forum.Forum", "saveQuestion", Seq(), "POST", """""", _prefix + """forum/thread/save""")
)
                      

// @LINE:143
def saveEditedAnswer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.saveEditedAnswer(), HandlerDef(this, "controllers.Forum.Forum", "saveEditedAnswer", Seq(), "POST", """""", _prefix + """forum/answer/doedit""")
)
                      

// @LINE:138
def editForumThread(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.editForumThread(slug), HandlerDef(this, "controllers.Forum.Forum", "editForumThread", Seq(classOf[String]), "GET", """""", _prefix + """forum/thread/edit""")
)
                      

// @LINE:133
def getApiForumThread(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Forum.Forum.getApiForumThread(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumThread", Seq(classOf[String]), "GET", """""", _prefix + """api/forum/thread""")
)
                      
    
}
                          
}
        

// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:121
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:105
// @LINE:104
// @LINE:102
// @LINE:101
// @LINE:98
package controllers.Admin.ref {


// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:121
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:110
// @LINE:109
// @LINE:105
// @LINE:104
// @LINE:102
// @LINE:101
// @LINE:98
class ReverseAdminApplication {
    

// @LINE:152
def getAdminData(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.getAdminData(), HandlerDef(this, "controllers.Admin.AdminApplication", "getAdminData", Seq(), "GET", """""", _prefix + """data""")
)
                      

// @LINE:124
def infoConc(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.infoConc(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "infoConc", Seq(classOf[String]), "GET", """""", _prefix + """concept""")
)
                      

// @LINE:121
def newConcept(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.newConcept(), HandlerDef(this, "controllers.Admin.AdminApplication", "newConcept", Seq(), "GET", """""", _prefix + """concept/new""")
)
                      

// @LINE:109
def infoChap(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.infoChap(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "infoChap", Seq(classOf[String]), "GET", """""", _prefix + """chapter""")
)
                      

// @LINE:118
def chapterMoveUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.chapterMoveUp(), HandlerDef(this, "controllers.Admin.AdminApplication", "chapterMoveUp", Seq(), "POST", """""", _prefix + """chapter/moveup""")
)
                      

// @LINE:125
def add_concept(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.add_concept(), HandlerDef(this, "controllers.Admin.AdminApplication", "add_concept", Seq(), "POST", """""", _prefix + """concept/add""")
)
                      

// @LINE:146
def editTag(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.editTag(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "editTag", Seq(classOf[String]), "GET", """""", _prefix + """tag/edit""")
)
                      

// @LINE:145
def newTag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.newTag(), HandlerDef(this, "controllers.Admin.AdminApplication", "newTag", Seq(), "GET", """""", _prefix + """tag/new""")
)
                      

// @LINE:119
def chapterMoveDown(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.chapterMoveDown(), HandlerDef(this, "controllers.Admin.AdminApplication", "chapterMoveDown", Seq(), "POST", """""", _prefix + """chapter/movedown""")
)
                      

// @LINE:126
def doedit_concept(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.doedit_concept(), HandlerDef(this, "controllers.Admin.AdminApplication", "doedit_concept", Seq(), "POST", """""", _prefix + """concept/doedit""")
)
                      

// @LINE:116
def getCategoriesFromSubject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.getCategoriesFromSubject(), HandlerDef(this, "controllers.Admin.AdminApplication", "getCategoriesFromSubject", Seq(), "POST", """""", _prefix + """chapter/list/subject""")
)
                      

// @LINE:105
def doedit_subject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.doedit_subject(), HandlerDef(this, "controllers.Admin.AdminApplication", "doedit_subject", Seq(), "POST", """""", _prefix + """subject/doedit""")
)
                      

// @LINE:127
def conceptMoveUp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.conceptMoveUp(), HandlerDef(this, "controllers.Admin.AdminApplication", "conceptMoveUp", Seq(), "POST", """""", _prefix + """concept/moveup""")
)
                      

// @LINE:153
def getUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.getUsers(), HandlerDef(this, "controllers.Admin.AdminApplication", "getUsers", Seq(), "GET", """""", _prefix + """m/users""")
)
                      

// @LINE:154
def changeUserRole(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.changeUserRole(), HandlerDef(this, "controllers.Admin.AdminApplication", "changeUserRole", Seq(), "POST", """""", _prefix + """api/m/users/change/role""")
)
                      

// @LINE:110
def editChapter(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.editChapter(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "editChapter", Seq(classOf[String]), "GET", """""", _prefix + """chapter/edit""")
)
                      

// @LINE:98
def newSubject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.newSubject(), HandlerDef(this, "controllers.Admin.AdminApplication", "newSubject", Seq(), "GET", """""", _prefix + """subject/new""")
)
                      

// @LINE:101
def editSubject(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.editSubject(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "editSubject", Seq(classOf[String]), "GET", """""", _prefix + """subject/edit""")
)
                      

// @LINE:114
def add_chapter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.add_chapter(), HandlerDef(this, "controllers.Admin.AdminApplication", "add_chapter", Seq(), "POST", """""", _prefix + """chapter/add""")
)
                      

// @LINE:115
def getChaptersFromSubjectAsList(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.getChaptersFromSubjectAsList(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "getChaptersFromSubjectAsList", Seq(classOf[String]), "GET", """""", _prefix + """chapter/list/subject""")
)
                      

// @LINE:147
def infoTag(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.infoTag(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "infoTag", Seq(classOf[String]), "GET", """""", _prefix + """tag""")
)
                      

// @LINE:113
def newChapter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.newChapter(), HandlerDef(this, "controllers.Admin.AdminApplication", "newChapter", Seq(), "GET", """""", _prefix + """chapter/new""")
)
                      

// @LINE:104
def add_subject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.add_subject(), HandlerDef(this, "controllers.Admin.AdminApplication", "add_subject", Seq(), "POST", """""", _prefix + """subject/add""")
)
                      

// @LINE:148
def add_tag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.add_tag(), HandlerDef(this, "controllers.Admin.AdminApplication", "add_tag", Seq(), "POST", """""", _prefix + """tag/add""")
)
                      

// @LINE:128
def conceptMoveDown(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.conceptMoveDown(), HandlerDef(this, "controllers.Admin.AdminApplication", "conceptMoveDown", Seq(), "POST", """""", _prefix + """concept/movedown""")
)
                      

// @LINE:149
def doedit_tag(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.doedit_tag(), HandlerDef(this, "controllers.Admin.AdminApplication", "doedit_tag", Seq(), "POST", """""", _prefix + """tag/doedit""")
)
                      

// @LINE:122
def editConcept(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.editConcept(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "editConcept", Seq(classOf[String]), "GET", """""", _prefix + """concept/edit""")
)
                      

// @LINE:102
def infoSub(slug:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.infoSub(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "infoSub", Seq(classOf[String]), "GET", """""", _prefix + """subject""")
)
                      

// @LINE:117
def doedit_chapter(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.AdminApplication.doedit_chapter(), HandlerDef(this, "controllers.Admin.AdminApplication", "doedit_chapter", Seq(), "POST", """""", _prefix + """chapter/doedit""")
)
                      
    
}
                          
}
        
    