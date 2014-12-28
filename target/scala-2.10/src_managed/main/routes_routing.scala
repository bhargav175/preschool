// @SOURCE:W:/Pre School/conf/routes
// @HASH:6b2299ceb371fe6af73a67092040de0f7b4bfd0a
// @DATE:Sun Dec 28 16:26:18 IST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_home1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("home"))))
        

// @LINE:8
private[this] lazy val controllers_Application_jsRoutes2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascript/routes.js"))))
        

// @LINE:10
private[this] lazy val controllers_Application_user_account3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account"))))
        

// @LINE:11
private[this] lazy val controllers_Application_profile4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("profile/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:13
private[this] lazy val controllers_Application_login5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:14
private[this] lazy val controllers_Application_doLogin6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:16
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:17
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Application_signup9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:20
private[this] lazy val controllers_Application_doSignup10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:22
private[this] lazy val controllers_Signup_unverified11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unverified"))))
        

// @LINE:23
private[this] lazy val controllers_Signup_oAuthDenied12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
        

// @LINE:25
private[this] lazy val controllers_Signup_verify13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Signup_exists14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/exists"))))
        

// @LINE:28
private[this] lazy val controllers_Signup_resetPassword15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Signup_doResetPassword16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset"))))
        

// @LINE:31
private[this] lazy val controllers_Account_changePassword17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
        

// @LINE:32
private[this] lazy val controllers_Account_doChangePassword18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
        

// @LINE:34
private[this] lazy val controllers_Account_verifyEmail19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify"))))
        

// @LINE:36
private[this] lazy val controllers_Account_link20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/add"))))
        

// @LINE:38
private[this] lazy val controllers_Account_askLink21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
        

// @LINE:39
private[this] lazy val controllers_Account_doLink22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
        

// @LINE:41
private[this] lazy val controllers_Account_askMerge23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
        

// @LINE:42
private[this] lazy val controllers_Account_doMerge24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
        

// @LINE:44
private[this] lazy val controllers_Signup_forgotPassword25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
        

// @LINE:45
private[this] lazy val controllers_Signup_doForgotPassword26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
        

// @LINE:46
private[this] lazy val controllers_Application_signupAdmin27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signupadmin"))))
        

// @LINE:48
private[this] lazy val controllers_UserController_getAllUsers28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users/all"))))
        

// @LINE:49
private[this] lazy val controllers_UserController_getUsers29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/users"))))
        

// @LINE:50
private[this] lazy val controllers_Application_getUserActivity30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/activity/user"))))
        

// @LINE:51
private[this] lazy val controllers_Information_Notification_getNotification31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/notification/user"))))
        

// @LINE:52
private[this] lazy val controllers_Information_Notification_seeNotification32 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/notification/see"))))
        

// @LINE:53
private[this] lazy val controllers_Information_Notification_setNotification33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/notification/set"))))
        

// @LINE:54
private[this] lazy val controllers_Information_Notification_updatesPage34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updates"))))
        

// @LINE:55
private[this] lazy val controllers_Application_followUser35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user/follow"))))
        

// @LINE:56
private[this] lazy val controllers_Application_unfollowUser36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user/unfollow"))))
        

// @LINE:57
private[this] lazy val controllers_Application_isfollowing37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user/isfollowing"))))
        

// @LINE:58
private[this] lazy val controllers_Application_followTag38 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user/tag/follow"))))
        

// @LINE:59
private[this] lazy val controllers_Application_unfollowTag39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user/tag/unfollow"))))
        

// @LINE:60
private[this] lazy val controllers_Application_isfollowingTag40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user/tag/isfollowing"))))
        

// @LINE:61
private[this] lazy val controllers_Application_reader41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reader"))))
        

// @LINE:62
private[this] lazy val controllers_Application_newShortNote42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shortnote/new"))))
        

// @LINE:63
private[this] lazy val controllers_Application_settings43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings"))))
        

// @LINE:65
private[this] lazy val controllers_content_ShortNote_shortNote44 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shortnote/add"))))
        

// @LINE:66
private[this] lazy val controllers_Application_recentTenShortNotes45 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/recent"))))
        

// @LINE:67
private[this] lazy val controllers_content_ShortNote_returnShortNotes46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/list"))))
        

// @LINE:68
private[this] lazy val controllers_content_ShortNote_returnShortNotesByUser47 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/list/user"))))
        

// @LINE:69
private[this] lazy val controllers_content_ShortNote_infoShortNote48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shortnote"))))
        

// @LINE:70
private[this] lazy val controllers_Application_moderateShortNote49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shortnote/mod"))))
        

// @LINE:71
private[this] lazy val controllers_Application_editShortnote50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shortnote/edit"))))
        

// @LINE:72
private[this] lazy val controllers_content_ShortNote_doedit_shortnote51 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shortnote/doedit"))))
        

// @LINE:73
private[this] lazy val controllers_content_ShortNote_getEditHistory52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/edithistory"))))
        

// @LINE:74
private[this] lazy val controllers_content_ShortNote_getPostsByTag53 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/tag"))))
        

// @LINE:75
private[this] lazy val controllers_content_ShortNote_getPostsByChapter54 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/chapter"))))
        

// @LINE:76
private[this] lazy val controllers_content_ShortNote_feedShortNode55 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/feed"))))
        

// @LINE:77
private[this] lazy val controllers_content_ShortNote_doUpvote56 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/upvote"))))
        

// @LINE:78
private[this] lazy val controllers_content_ShortNote_doDownvote57 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/shortnote/downvote"))))
        

// @LINE:79
private[this] lazy val controllers_content_ShortNote_flag58 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shortnote/flag"))))
        

// @LINE:80
private[this] lazy val controllers_content_ShortNote_report59 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shortnote/report"))))
        

// @LINE:81
private[this] lazy val controllers_Application_upload60 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("file/upload"))))
        

// @LINE:82
private[this] lazy val controllers_Application_getImage61 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/image"))))
        

// @LINE:83
private[this] lazy val controllers_Application_getCurrentUserImagesAsJson62 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user/images"))))
        

// @LINE:84
private[this] lazy val controllers_Application_updateImage63 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/user/image/update"))))
        

// @LINE:86
private[this] lazy val controllers_Application_getShortNote64 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("note"))))
        

// @LINE:87
private[this] lazy val controllers_Application_notfound65 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("404"))))
        

// @LINE:90
private[this] lazy val controllers_Application_discover66 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discover"))))
        

// @LINE:91
private[this] lazy val controllers_Application_subject67 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discover/subject"))))
        

// @LINE:92
private[this] lazy val controllers_Application_chapter68 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discover/chapter"))))
        

// @LINE:93
private[this] lazy val controllers_Application_concept69 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discover/concept"))))
        

// @LINE:94
private[this] lazy val controllers_Application_tag70 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("discover/tag"))))
        

// @LINE:97
private[this] lazy val controllers_Application_tags71 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tags"))))
        

// @LINE:98
private[this] lazy val controllers_Admin_AdminApplication_newSubject72 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/new"))))
        

// @LINE:100
private[this] lazy val controllers_content_Subject_returnSubjects73 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/subject/list"))))
        

// @LINE:101
private[this] lazy val controllers_Admin_AdminApplication_editSubject74 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/edit"))))
        

// @LINE:102
private[this] lazy val controllers_Admin_AdminApplication_infoSub75 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject"))))
        

// @LINE:103
private[this] lazy val controllers_content_Subject_returnSubject76 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("branch/"),DynamicPart("subject", """[^/]+""",true))))
        

// @LINE:104
private[this] lazy val controllers_Admin_AdminApplication_add_subject77 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/add"))))
        

// @LINE:105
private[this] lazy val controllers_Admin_AdminApplication_doedit_subject78 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("subject/doedit"))))
        

// @LINE:109
private[this] lazy val controllers_Admin_AdminApplication_infoChap79 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter"))))
        

// @LINE:110
private[this] lazy val controllers_Admin_AdminApplication_editChapter80 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter/edit"))))
        

// @LINE:111
private[this] lazy val controllers_content_Chapter_returnChapters81 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/chapter/list"))))
        

// @LINE:113
private[this] lazy val controllers_Admin_AdminApplication_newChapter82 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter/new"))))
        

// @LINE:114
private[this] lazy val controllers_Admin_AdminApplication_add_chapter83 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter/add"))))
        

// @LINE:115
private[this] lazy val controllers_Admin_AdminApplication_getChaptersFromSubjectAsList84 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter/list/subject"))))
        

// @LINE:116
private[this] lazy val controllers_Admin_AdminApplication_getCategoriesFromSubject85 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter/list/subject"))))
        

// @LINE:117
private[this] lazy val controllers_Admin_AdminApplication_doedit_chapter86 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter/doedit"))))
        

// @LINE:118
private[this] lazy val controllers_Admin_AdminApplication_chapterMoveUp87 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter/moveup"))))
        

// @LINE:119
private[this] lazy val controllers_Admin_AdminApplication_chapterMoveDown88 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chapter/movedown"))))
        

// @LINE:121
private[this] lazy val controllers_Admin_AdminApplication_newConcept89 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("concept/new"))))
        

// @LINE:122
private[this] lazy val controllers_Admin_AdminApplication_editConcept90 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("concept/edit"))))
        

// @LINE:123
private[this] lazy val controllers_content_Concept_returnAllConcepts91 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/concept/list"))))
        

// @LINE:124
private[this] lazy val controllers_Admin_AdminApplication_infoConc92 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("concept"))))
        

// @LINE:125
private[this] lazy val controllers_Admin_AdminApplication_add_concept93 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("concept/add"))))
        

// @LINE:126
private[this] lazy val controllers_Admin_AdminApplication_doedit_concept94 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("concept/doedit"))))
        

// @LINE:127
private[this] lazy val controllers_Admin_AdminApplication_conceptMoveUp95 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("concept/moveup"))))
        

// @LINE:128
private[this] lazy val controllers_Admin_AdminApplication_conceptMoveDown96 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("concept/movedown"))))
        

// @LINE:130
private[this] lazy val controllers_Forum_Forum_ForumPage97 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum"))))
        

// @LINE:131
private[this] lazy val controllers_Forum_Forum_addForumThread98 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum/add"))))
        

// @LINE:132
private[this] lazy val controllers_Forum_Forum_getForumThread99 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum/thread"))))
        

// @LINE:133
private[this] lazy val controllers_Forum_Forum_getApiForumThread100 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/forum/thread"))))
        

// @LINE:134
private[this] lazy val controllers_Forum_Forum_getApiForumThreadLike101 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/forum/thread/like"))))
        

// @LINE:135
private[this] lazy val controllers_Forum_Forum_getApiForumAnswerLike102 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/forum/answer/like"))))
        

// @LINE:136
private[this] lazy val controllers_Forum_Forum_getApiForumThreadLikedByUser103 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/forum/thread/userlike"))))
        

// @LINE:137
private[this] lazy val controllers_Forum_Forum_getApiForumAnswerLikedByUser104 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/forum/answer/userlike"))))
        

// @LINE:138
private[this] lazy val controllers_Forum_Forum_editForumThread105 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum/thread/edit"))))
        

// @LINE:139
private[this] lazy val controllers_Forum_Forum_saveEditedForumThread106 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum/thread/doedit"))))
        

// @LINE:140
private[this] lazy val controllers_Forum_Forum_saveQuestion107 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum/thread/save"))))
        

// @LINE:141
private[this] lazy val controllers_Forum_Forum_saveAnswer108 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum/answer/save"))))
        

// @LINE:142
private[this] lazy val controllers_Forum_Forum_editAnswerThread109 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum/answer/edit"))))
        

// @LINE:143
private[this] lazy val controllers_Forum_Forum_saveEditedAnswer110 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("forum/answer/doedit"))))
        

// @LINE:144
private[this] lazy val controllers_content_Tag_returnTags111 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/tag/list"))))
        

// @LINE:145
private[this] lazy val controllers_Admin_AdminApplication_newTag112 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/new"))))
        

// @LINE:146
private[this] lazy val controllers_Admin_AdminApplication_editTag113 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/edit"))))
        

// @LINE:147
private[this] lazy val controllers_Admin_AdminApplication_infoTag114 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag"))))
        

// @LINE:148
private[this] lazy val controllers_Admin_AdminApplication_add_tag115 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/add"))))
        

// @LINE:149
private[this] lazy val controllers_Admin_AdminApplication_doedit_tag116 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tag/doedit"))))
        

// @LINE:152
private[this] lazy val controllers_Admin_AdminApplication_getAdminData117 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("data"))))
        

// @LINE:153
private[this] lazy val controllers_Admin_AdminApplication_getUsers118 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("m/users"))))
        

// @LINE:154
private[this] lazy val controllers_Admin_AdminApplication_changeUserRole119 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/m/users/change/role"))))
        

// @LINE:157
private[this] lazy val controllers_Assets_at120 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:159
private[this] lazy val controllers_Application_testwebSocket121 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("testws"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """home""","""controllers.Application.home"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""","""controllers.Application.jsRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account""","""controllers.Application.user_account"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """profile/$username<[^/]+>""","""controllers.Application.profile(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.doLogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""com.feth.play.module.pa.controllers.Authenticate.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.doSignup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Signup.oAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset""","""controllers.Signup.doResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.changePassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.doChangePassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify""","""controllers.Account.verifyEmail"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/add""","""controllers.Account.link"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.askLink"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.doLink"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.askMerge"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.doMerge"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.forgotPassword(email:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.doForgotPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signupadmin""","""controllers.Application.signupAdmin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users/all""","""controllers.UserController.getAllUsers"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/users""","""controllers.UserController.getUsers"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/activity/user""","""controllers.Application.getUserActivity"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/notification/user""","""controllers.Information.Notification.getNotification"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/notification/see""","""controllers.Information.Notification.seeNotification"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/notification/set""","""controllers.Information.Notification.setNotification"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updates""","""controllers.Information.Notification.updatesPage"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user/follow""","""controllers.Application.followUser"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user/unfollow""","""controllers.Application.unfollowUser"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user/isfollowing""","""controllers.Application.isfollowing(username:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user/tag/follow""","""controllers.Application.followTag"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user/tag/unfollow""","""controllers.Application.unfollowTag"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user/tag/isfollowing""","""controllers.Application.isfollowingTag(username:String, tagslug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reader""","""controllers.Application.reader"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shortnote/new""","""controllers.Application.newShortNote"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings""","""controllers.Application.settings"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shortnote/add""","""controllers.content.ShortNote.shortNote"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/recent""","""controllers.Application.recentTenShortNotes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/list""","""controllers.content.ShortNote.returnShortNotes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/list/user""","""controllers.content.ShortNote.returnShortNotesByUser"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shortnote""","""controllers.content.ShortNote.infoShortNote(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shortnote/mod""","""controllers.Application.moderateShortNote(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shortnote/edit""","""controllers.Application.editShortnote(slug:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shortnote/doedit""","""controllers.content.ShortNote.doedit_shortnote"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/edithistory""","""controllers.content.ShortNote.getEditHistory(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/tag""","""controllers.content.ShortNote.getPostsByTag(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/chapter""","""controllers.content.ShortNote.getPostsByChapter(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/feed""","""controllers.content.ShortNote.feedShortNode"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/upvote""","""controllers.content.ShortNote.doUpvote"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/shortnote/downvote""","""controllers.content.ShortNote.doDownvote"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shortnote/flag""","""controllers.content.ShortNote.flag"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shortnote/report""","""controllers.content.ShortNote.report"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """file/upload""","""controllers.Application.upload"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/image""","""controllers.Application.getImage(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user/images""","""controllers.Application.getCurrentUserImagesAsJson"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/user/image/update""","""controllers.Application.updateImage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """note""","""controllers.Application.getShortNote(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """404""","""controllers.Application.notfound"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discover""","""controllers.Application.discover"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discover/subject""","""controllers.Application.subject(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discover/chapter""","""controllers.Application.chapter(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discover/concept""","""controllers.Application.concept(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """discover/tag""","""controllers.Application.tag(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tags""","""controllers.Application.tags"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/new""","""controllers.Admin.AdminApplication.newSubject"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/subject/list""","""controllers.content.Subject.returnSubjects"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/edit""","""controllers.Admin.AdminApplication.editSubject(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject""","""controllers.Admin.AdminApplication.infoSub(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """branch/$subject<[^/]+>""","""controllers.content.Subject.returnSubject(subject:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/add""","""controllers.Admin.AdminApplication.add_subject"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """subject/doedit""","""controllers.Admin.AdminApplication.doedit_subject"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter""","""controllers.Admin.AdminApplication.infoChap(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter/edit""","""controllers.Admin.AdminApplication.editChapter(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/chapter/list""","""controllers.content.Chapter.returnChapters"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter/new""","""controllers.Admin.AdminApplication.newChapter"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter/add""","""controllers.Admin.AdminApplication.add_chapter"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter/list/subject""","""controllers.Admin.AdminApplication.getChaptersFromSubjectAsList(slug:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter/list/subject""","""controllers.Admin.AdminApplication.getCategoriesFromSubject"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter/doedit""","""controllers.Admin.AdminApplication.doedit_chapter"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter/moveup""","""controllers.Admin.AdminApplication.chapterMoveUp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chapter/movedown""","""controllers.Admin.AdminApplication.chapterMoveDown"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """concept/new""","""controllers.Admin.AdminApplication.newConcept"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """concept/edit""","""controllers.Admin.AdminApplication.editConcept(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/concept/list""","""controllers.content.Concept.returnAllConcepts"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """concept""","""controllers.Admin.AdminApplication.infoConc(slug:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """concept/add""","""controllers.Admin.AdminApplication.add_concept"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """concept/doedit""","""controllers.Admin.AdminApplication.doedit_concept"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """concept/moveup""","""controllers.Admin.AdminApplication.conceptMoveUp"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """concept/movedown""","""controllers.Admin.AdminApplication.conceptMoveDown"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum""","""controllers.Forum.Forum.ForumPage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum/add""","""controllers.Forum.Forum.addForumThread"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum/thread""","""controllers.Forum.Forum.getForumThread(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/forum/thread""","""controllers.Forum.Forum.getApiForumThread(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/forum/thread/like""","""controllers.Forum.Forum.getApiForumThreadLike(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/forum/answer/like""","""controllers.Forum.Forum.getApiForumAnswerLike(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/forum/thread/userlike""","""controllers.Forum.Forum.getApiForumThreadLikedByUser(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/forum/answer/userlike""","""controllers.Forum.Forum.getApiForumAnswerLikedByUser(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum/thread/edit""","""controllers.Forum.Forum.editForumThread(slug:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum/thread/doedit""","""controllers.Forum.Forum.saveEditedForumThread"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum/thread/save""","""controllers.Forum.Forum.saveQuestion"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum/answer/save""","""controllers.Forum.Forum.saveAnswer"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum/answer/edit""","""controllers.Forum.Forum.editAnswerThread(slug:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """forum/answer/doedit""","""controllers.Forum.Forum.saveEditedAnswer"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/tag/list""","""controllers.content.Tag.returnTags"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/new""","""controllers.Admin.AdminApplication.newTag"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/edit""","""controllers.Admin.AdminApplication.editTag(slug:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag""","""controllers.Admin.AdminApplication.infoTag(slug:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/add""","""controllers.Admin.AdminApplication.add_tag"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tag/doedit""","""controllers.Admin.AdminApplication.doedit_tag"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """data""","""controllers.Admin.AdminApplication.getAdminData"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """m/users""","""controllers.Admin.AdminApplication.getUsers"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/m/users/change/role""","""controllers.Admin.AdminApplication.changeUserRole"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """testws""","""controllers.Application.testwebSocket""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_home1(params) => {
   call { 
        invokeHandler(controllers.Application.home, HandlerDef(this, "controllers.Application", "home", Nil,"GET", """""", Routes.prefix + """home"""))
   }
}
        

// @LINE:8
case controllers_Application_jsRoutes2(params) => {
   call { 
        invokeHandler(controllers.Application.jsRoutes, HandlerDef(this, "controllers.Application", "jsRoutes", Nil,"GET", """""", Routes.prefix + """assets/javascript/routes.js"""))
   }
}
        

// @LINE:10
case controllers_Application_user_account3(params) => {
   call { 
        invokeHandler(controllers.Application.user_account, HandlerDef(this, "controllers.Application", "user_account", Nil,"GET", """""", Routes.prefix + """account"""))
   }
}
        

// @LINE:11
case controllers_Application_profile4(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Application.profile(username), HandlerDef(this, "controllers.Application", "profile", Seq(classOf[String]),"GET", """""", Routes.prefix + """profile/$username<[^/]+>"""))
   }
}
        

// @LINE:13
case controllers_Application_login5(params) => {
   call { 
        invokeHandler(controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:14
case controllers_Application_doLogin6(params) => {
   call { 
        invokeHandler(controllers.Application.doLogin, HandlerDef(this, "controllers.Application", "doLogin", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:16
case com_feth_play_module_pa_controllers_Authenticate_logout7(params) => {
   call { 
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.logout, HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:17
case com_feth_play_module_pa_controllers_Authenticate_authenticate8(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Application_signup9(params) => {
   call { 
        invokeHandler(controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:20
case controllers_Application_doSignup10(params) => {
   call { 
        invokeHandler(controllers.Application.doSignup, HandlerDef(this, "controllers.Application", "doSignup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:22
case controllers_Signup_unverified11(params) => {
   call { 
        invokeHandler(controllers.Signup.unverified, HandlerDef(this, "controllers.Signup", "unverified", Nil,"GET", """""", Routes.prefix + """accounts/unverified"""))
   }
}
        

// @LINE:23
case controllers_Signup_oAuthDenied12(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
   }
}
        

// @LINE:25
case controllers_Signup_verify13(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/verify/$token<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Signup_exists14(params) => {
   call { 
        invokeHandler(controllers.Signup.exists, HandlerDef(this, "controllers.Signup", "exists", Nil,"GET", """""", Routes.prefix + """accounts/exists"""))
   }
}
        

// @LINE:28
case controllers_Signup_resetPassword15(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/password/reset/$token<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Signup_doResetPassword16(params) => {
   call { 
        invokeHandler(controllers.Signup.doResetPassword, HandlerDef(this, "controllers.Signup", "doResetPassword", Nil,"POST", """""", Routes.prefix + """accounts/password/reset"""))
   }
}
        

// @LINE:31
case controllers_Account_changePassword17(params) => {
   call { 
        invokeHandler(controllers.Account.changePassword, HandlerDef(this, "controllers.Account", "changePassword", Nil,"GET", """""", Routes.prefix + """accounts/password/change"""))
   }
}
        

// @LINE:32
case controllers_Account_doChangePassword18(params) => {
   call { 
        invokeHandler(controllers.Account.doChangePassword, HandlerDef(this, "controllers.Account", "doChangePassword", Nil,"POST", """""", Routes.prefix + """accounts/password/change"""))
   }
}
        

// @LINE:34
case controllers_Account_verifyEmail19(params) => {
   call { 
        invokeHandler(controllers.Account.verifyEmail, HandlerDef(this, "controllers.Account", "verifyEmail", Nil,"GET", """""", Routes.prefix + """accounts/verify"""))
   }
}
        

// @LINE:36
case controllers_Account_link20(params) => {
   call { 
        invokeHandler(controllers.Account.link, HandlerDef(this, "controllers.Account", "link", Nil,"GET", """""", Routes.prefix + """accounts/add"""))
   }
}
        

// @LINE:38
case controllers_Account_askLink21(params) => {
   call { 
        invokeHandler(controllers.Account.askLink, HandlerDef(this, "controllers.Account", "askLink", Nil,"GET", """""", Routes.prefix + """accounts/link"""))
   }
}
        

// @LINE:39
case controllers_Account_doLink22(params) => {
   call { 
        invokeHandler(controllers.Account.doLink, HandlerDef(this, "controllers.Account", "doLink", Nil,"POST", """""", Routes.prefix + """accounts/link"""))
   }
}
        

// @LINE:41
case controllers_Account_askMerge23(params) => {
   call { 
        invokeHandler(controllers.Account.askMerge, HandlerDef(this, "controllers.Account", "askMerge", Nil,"GET", """""", Routes.prefix + """accounts/merge"""))
   }
}
        

// @LINE:42
case controllers_Account_doMerge24(params) => {
   call { 
        invokeHandler(controllers.Account.doMerge, HandlerDef(this, "controllers.Account", "doMerge", Nil,"POST", """""", Routes.prefix + """accounts/merge"""))
   }
}
        

// @LINE:44
case controllers_Signup_forgotPassword25(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """login/password/forgot"""))
   }
}
        

// @LINE:45
case controllers_Signup_doForgotPassword26(params) => {
   call { 
        invokeHandler(controllers.Signup.doForgotPassword, HandlerDef(this, "controllers.Signup", "doForgotPassword", Nil,"POST", """""", Routes.prefix + """login/password/forgot"""))
   }
}
        

// @LINE:46
case controllers_Application_signupAdmin27(params) => {
   call { 
        invokeHandler(controllers.Application.signupAdmin, HandlerDef(this, "controllers.Application", "signupAdmin", Nil,"GET", """""", Routes.prefix + """signupadmin"""))
   }
}
        

// @LINE:48
case controllers_UserController_getAllUsers28(params) => {
   call { 
        invokeHandler(controllers.UserController.getAllUsers, HandlerDef(this, "controllers.UserController", "getAllUsers", Nil,"GET", """""", Routes.prefix + """api/users/all"""))
   }
}
        

// @LINE:49
case controllers_UserController_getUsers29(params) => {
   call { 
        invokeHandler(controllers.UserController.getUsers, HandlerDef(this, "controllers.UserController", "getUsers", Nil,"GET", """""", Routes.prefix + """api/users"""))
   }
}
        

// @LINE:50
case controllers_Application_getUserActivity30(params) => {
   call { 
        invokeHandler(controllers.Application.getUserActivity, HandlerDef(this, "controllers.Application", "getUserActivity", Nil,"GET", """""", Routes.prefix + """api/activity/user"""))
   }
}
        

// @LINE:51
case controllers_Information_Notification_getNotification31(params) => {
   call { 
        invokeHandler(controllers.Information.Notification.getNotification, HandlerDef(this, "controllers.Information.Notification", "getNotification", Nil,"GET", """""", Routes.prefix + """api/notification/user"""))
   }
}
        

// @LINE:52
case controllers_Information_Notification_seeNotification32(params) => {
   call { 
        invokeHandler(controllers.Information.Notification.seeNotification, HandlerDef(this, "controllers.Information.Notification", "seeNotification", Nil,"POST", """""", Routes.prefix + """api/notification/see"""))
   }
}
        

// @LINE:53
case controllers_Information_Notification_setNotification33(params) => {
   call { 
        invokeHandler(controllers.Information.Notification.setNotification, HandlerDef(this, "controllers.Information.Notification", "setNotification", Nil,"GET", """""", Routes.prefix + """api/notification/set"""))
   }
}
        

// @LINE:54
case controllers_Information_Notification_updatesPage34(params) => {
   call { 
        invokeHandler(controllers.Information.Notification.updatesPage, HandlerDef(this, "controllers.Information.Notification", "updatesPage", Nil,"GET", """""", Routes.prefix + """updates"""))
   }
}
        

// @LINE:55
case controllers_Application_followUser35(params) => {
   call { 
        invokeHandler(controllers.Application.followUser, HandlerDef(this, "controllers.Application", "followUser", Nil,"POST", """""", Routes.prefix + """api/user/follow"""))
   }
}
        

// @LINE:56
case controllers_Application_unfollowUser36(params) => {
   call { 
        invokeHandler(controllers.Application.unfollowUser, HandlerDef(this, "controllers.Application", "unfollowUser", Nil,"POST", """""", Routes.prefix + """api/user/unfollow"""))
   }
}
        

// @LINE:57
case controllers_Application_isfollowing37(params) => {
   call(params.fromQuery[String]("username", None)) { (username) =>
        invokeHandler(controllers.Application.isfollowing(username), HandlerDef(this, "controllers.Application", "isfollowing", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/user/isfollowing"""))
   }
}
        

// @LINE:58
case controllers_Application_followTag38(params) => {
   call { 
        invokeHandler(controllers.Application.followTag, HandlerDef(this, "controllers.Application", "followTag", Nil,"POST", """""", Routes.prefix + """api/user/tag/follow"""))
   }
}
        

// @LINE:59
case controllers_Application_unfollowTag39(params) => {
   call { 
        invokeHandler(controllers.Application.unfollowTag, HandlerDef(this, "controllers.Application", "unfollowTag", Nil,"POST", """""", Routes.prefix + """api/user/tag/unfollow"""))
   }
}
        

// @LINE:60
case controllers_Application_isfollowingTag40(params) => {
   call(params.fromQuery[String]("username", None), params.fromQuery[String]("tagslug", None)) { (username, tagslug) =>
        invokeHandler(controllers.Application.isfollowingTag(username, tagslug), HandlerDef(this, "controllers.Application", "isfollowingTag", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """api/user/tag/isfollowing"""))
   }
}
        

// @LINE:61
case controllers_Application_reader41(params) => {
   call { 
        invokeHandler(controllers.Application.reader, HandlerDef(this, "controllers.Application", "reader", Nil,"GET", """""", Routes.prefix + """reader"""))
   }
}
        

// @LINE:62
case controllers_Application_newShortNote42(params) => {
   call { 
        invokeHandler(controllers.Application.newShortNote, HandlerDef(this, "controllers.Application", "newShortNote", Nil,"GET", """""", Routes.prefix + """shortnote/new"""))
   }
}
        

// @LINE:63
case controllers_Application_settings43(params) => {
   call { 
        invokeHandler(controllers.Application.settings, HandlerDef(this, "controllers.Application", "settings", Nil,"GET", """""", Routes.prefix + """settings"""))
   }
}
        

// @LINE:65
case controllers_content_ShortNote_shortNote44(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.shortNote, HandlerDef(this, "controllers.content.ShortNote", "shortNote", Nil,"POST", """""", Routes.prefix + """shortnote/add"""))
   }
}
        

// @LINE:66
case controllers_Application_recentTenShortNotes45(params) => {
   call { 
        invokeHandler(controllers.Application.recentTenShortNotes, HandlerDef(this, "controllers.Application", "recentTenShortNotes", Nil,"GET", """""", Routes.prefix + """api/shortnote/recent"""))
   }
}
        

// @LINE:67
case controllers_content_ShortNote_returnShortNotes46(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.returnShortNotes, HandlerDef(this, "controllers.content.ShortNote", "returnShortNotes", Nil,"GET", """""", Routes.prefix + """api/shortnote/list"""))
   }
}
        

// @LINE:68
case controllers_content_ShortNote_returnShortNotesByUser47(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.returnShortNotesByUser, HandlerDef(this, "controllers.content.ShortNote", "returnShortNotesByUser", Nil,"GET", """""", Routes.prefix + """api/shortnote/list/user"""))
   }
}
        

// @LINE:69
case controllers_content_ShortNote_infoShortNote48(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.content.ShortNote.infoShortNote(slug), HandlerDef(this, "controllers.content.ShortNote", "infoShortNote", Seq(classOf[String]),"GET", """""", Routes.prefix + """shortnote"""))
   }
}
        

// @LINE:70
case controllers_Application_moderateShortNote49(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Application.moderateShortNote(slug), HandlerDef(this, "controllers.Application", "moderateShortNote", Seq(classOf[String]),"GET", """""", Routes.prefix + """shortnote/mod"""))
   }
}
        

// @LINE:71
case controllers_Application_editShortnote50(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Application.editShortnote(slug), HandlerDef(this, "controllers.Application", "editShortnote", Seq(classOf[String]),"GET", """""", Routes.prefix + """shortnote/edit"""))
   }
}
        

// @LINE:72
case controllers_content_ShortNote_doedit_shortnote51(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.doedit_shortnote, HandlerDef(this, "controllers.content.ShortNote", "doedit_shortnote", Nil,"POST", """""", Routes.prefix + """shortnote/doedit"""))
   }
}
        

// @LINE:73
case controllers_content_ShortNote_getEditHistory52(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.content.ShortNote.getEditHistory(id), HandlerDef(this, "controllers.content.ShortNote", "getEditHistory", Seq(classOf[Long]),"GET", """""", Routes.prefix + """api/shortnote/edithistory"""))
   }
}
        

// @LINE:74
case controllers_content_ShortNote_getPostsByTag53(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.content.ShortNote.getPostsByTag(slug), HandlerDef(this, "controllers.content.ShortNote", "getPostsByTag", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/shortnote/tag"""))
   }
}
        

// @LINE:75
case controllers_content_ShortNote_getPostsByChapter54(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.content.ShortNote.getPostsByChapter(slug), HandlerDef(this, "controllers.content.ShortNote", "getPostsByChapter", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/shortnote/chapter"""))
   }
}
        

// @LINE:76
case controllers_content_ShortNote_feedShortNode55(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.feedShortNode, HandlerDef(this, "controllers.content.ShortNote", "feedShortNode", Nil,"GET", """""", Routes.prefix + """api/shortnote/feed"""))
   }
}
        

// @LINE:77
case controllers_content_ShortNote_doUpvote56(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.doUpvote, HandlerDef(this, "controllers.content.ShortNote", "doUpvote", Nil,"POST", """""", Routes.prefix + """api/shortnote/upvote"""))
   }
}
        

// @LINE:78
case controllers_content_ShortNote_doDownvote57(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.doDownvote, HandlerDef(this, "controllers.content.ShortNote", "doDownvote", Nil,"POST", """""", Routes.prefix + """api/shortnote/downvote"""))
   }
}
        

// @LINE:79
case controllers_content_ShortNote_flag58(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.flag, HandlerDef(this, "controllers.content.ShortNote", "flag", Nil,"POST", """""", Routes.prefix + """shortnote/flag"""))
   }
}
        

// @LINE:80
case controllers_content_ShortNote_report59(params) => {
   call { 
        invokeHandler(controllers.content.ShortNote.report, HandlerDef(this, "controllers.content.ShortNote", "report", Nil,"POST", """""", Routes.prefix + """shortnote/report"""))
   }
}
        

// @LINE:81
case controllers_Application_upload60(params) => {
   call { 
        invokeHandler(controllers.Application.upload, HandlerDef(this, "controllers.Application", "upload", Nil,"POST", """""", Routes.prefix + """file/upload"""))
   }
}
        

// @LINE:82
case controllers_Application_getImage61(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.getImage(id), HandlerDef(this, "controllers.Application", "getImage", Seq(classOf[Long]),"GET", """""", Routes.prefix + """api/image"""))
   }
}
        

// @LINE:83
case controllers_Application_getCurrentUserImagesAsJson62(params) => {
   call { 
        invokeHandler(controllers.Application.getCurrentUserImagesAsJson, HandlerDef(this, "controllers.Application", "getCurrentUserImagesAsJson", Nil,"GET", """""", Routes.prefix + """api/user/images"""))
   }
}
        

// @LINE:84
case controllers_Application_updateImage63(params) => {
   call { 
        invokeHandler(controllers.Application.updateImage, HandlerDef(this, "controllers.Application", "updateImage", Nil,"POST", """""", Routes.prefix + """api/user/image/update"""))
   }
}
        

// @LINE:86
case controllers_Application_getShortNote64(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Application.getShortNote(slug), HandlerDef(this, "controllers.Application", "getShortNote", Seq(classOf[String]),"GET", """""", Routes.prefix + """note"""))
   }
}
        

// @LINE:87
case controllers_Application_notfound65(params) => {
   call { 
        invokeHandler(controllers.Application.notfound, HandlerDef(this, "controllers.Application", "notfound", Nil,"GET", """""", Routes.prefix + """404"""))
   }
}
        

// @LINE:90
case controllers_Application_discover66(params) => {
   call { 
        invokeHandler(controllers.Application.discover, HandlerDef(this, "controllers.Application", "discover", Nil,"GET", """Page""", Routes.prefix + """discover"""))
   }
}
        

// @LINE:91
case controllers_Application_subject67(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Application.subject(slug), HandlerDef(this, "controllers.Application", "subject", Seq(classOf[String]),"GET", """""", Routes.prefix + """discover/subject"""))
   }
}
        

// @LINE:92
case controllers_Application_chapter68(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Application.chapter(slug), HandlerDef(this, "controllers.Application", "chapter", Seq(classOf[String]),"GET", """""", Routes.prefix + """discover/chapter"""))
   }
}
        

// @LINE:93
case controllers_Application_concept69(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Application.concept(slug), HandlerDef(this, "controllers.Application", "concept", Seq(classOf[String]),"GET", """""", Routes.prefix + """discover/concept"""))
   }
}
        

// @LINE:94
case controllers_Application_tag70(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Application.tag(slug), HandlerDef(this, "controllers.Application", "tag", Seq(classOf[String]),"GET", """""", Routes.prefix + """discover/tag"""))
   }
}
        

// @LINE:97
case controllers_Application_tags71(params) => {
   call { 
        invokeHandler(controllers.Application.tags, HandlerDef(this, "controllers.Application", "tags", Nil,"GET", """""", Routes.prefix + """tags"""))
   }
}
        

// @LINE:98
case controllers_Admin_AdminApplication_newSubject72(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.newSubject, HandlerDef(this, "controllers.Admin.AdminApplication", "newSubject", Nil,"GET", """""", Routes.prefix + """subject/new"""))
   }
}
        

// @LINE:100
case controllers_content_Subject_returnSubjects73(params) => {
   call { 
        invokeHandler(controllers.content.Subject.returnSubjects, HandlerDef(this, "controllers.content.Subject", "returnSubjects", Nil,"GET", """""", Routes.prefix + """api/subject/list"""))
   }
}
        

// @LINE:101
case controllers_Admin_AdminApplication_editSubject74(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.editSubject(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "editSubject", Seq(classOf[String]),"GET", """""", Routes.prefix + """subject/edit"""))
   }
}
        

// @LINE:102
case controllers_Admin_AdminApplication_infoSub75(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.infoSub(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "infoSub", Seq(classOf[String]),"GET", """""", Routes.prefix + """subject"""))
   }
}
        

// @LINE:103
case controllers_content_Subject_returnSubject76(params) => {
   call(params.fromPath[String]("subject", None)) { (subject) =>
        invokeHandler(controllers.content.Subject.returnSubject(subject), HandlerDef(this, "controllers.content.Subject", "returnSubject", Seq(classOf[String]),"GET", """""", Routes.prefix + """branch/$subject<[^/]+>"""))
   }
}
        

// @LINE:104
case controllers_Admin_AdminApplication_add_subject77(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.add_subject, HandlerDef(this, "controllers.Admin.AdminApplication", "add_subject", Nil,"POST", """""", Routes.prefix + """subject/add"""))
   }
}
        

// @LINE:105
case controllers_Admin_AdminApplication_doedit_subject78(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.doedit_subject, HandlerDef(this, "controllers.Admin.AdminApplication", "doedit_subject", Nil,"POST", """""", Routes.prefix + """subject/doedit"""))
   }
}
        

// @LINE:109
case controllers_Admin_AdminApplication_infoChap79(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.infoChap(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "infoChap", Seq(classOf[String]),"GET", """""", Routes.prefix + """chapter"""))
   }
}
        

// @LINE:110
case controllers_Admin_AdminApplication_editChapter80(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.editChapter(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "editChapter", Seq(classOf[String]),"GET", """""", Routes.prefix + """chapter/edit"""))
   }
}
        

// @LINE:111
case controllers_content_Chapter_returnChapters81(params) => {
   call { 
        invokeHandler(controllers.content.Chapter.returnChapters, HandlerDef(this, "controllers.content.Chapter", "returnChapters", Nil,"GET", """""", Routes.prefix + """api/chapter/list"""))
   }
}
        

// @LINE:113
case controllers_Admin_AdminApplication_newChapter82(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.newChapter, HandlerDef(this, "controllers.Admin.AdminApplication", "newChapter", Nil,"GET", """""", Routes.prefix + """chapter/new"""))
   }
}
        

// @LINE:114
case controllers_Admin_AdminApplication_add_chapter83(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.add_chapter, HandlerDef(this, "controllers.Admin.AdminApplication", "add_chapter", Nil,"POST", """""", Routes.prefix + """chapter/add"""))
   }
}
        

// @LINE:115
case controllers_Admin_AdminApplication_getChaptersFromSubjectAsList84(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.getChaptersFromSubjectAsList(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "getChaptersFromSubjectAsList", Seq(classOf[String]),"GET", """""", Routes.prefix + """chapter/list/subject"""))
   }
}
        

// @LINE:116
case controllers_Admin_AdminApplication_getCategoriesFromSubject85(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.getCategoriesFromSubject, HandlerDef(this, "controllers.Admin.AdminApplication", "getCategoriesFromSubject", Nil,"POST", """""", Routes.prefix + """chapter/list/subject"""))
   }
}
        

// @LINE:117
case controllers_Admin_AdminApplication_doedit_chapter86(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.doedit_chapter, HandlerDef(this, "controllers.Admin.AdminApplication", "doedit_chapter", Nil,"POST", """""", Routes.prefix + """chapter/doedit"""))
   }
}
        

// @LINE:118
case controllers_Admin_AdminApplication_chapterMoveUp87(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.chapterMoveUp, HandlerDef(this, "controllers.Admin.AdminApplication", "chapterMoveUp", Nil,"POST", """""", Routes.prefix + """chapter/moveup"""))
   }
}
        

// @LINE:119
case controllers_Admin_AdminApplication_chapterMoveDown88(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.chapterMoveDown, HandlerDef(this, "controllers.Admin.AdminApplication", "chapterMoveDown", Nil,"POST", """""", Routes.prefix + """chapter/movedown"""))
   }
}
        

// @LINE:121
case controllers_Admin_AdminApplication_newConcept89(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.newConcept, HandlerDef(this, "controllers.Admin.AdminApplication", "newConcept", Nil,"GET", """""", Routes.prefix + """concept/new"""))
   }
}
        

// @LINE:122
case controllers_Admin_AdminApplication_editConcept90(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.editConcept(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "editConcept", Seq(classOf[String]),"GET", """""", Routes.prefix + """concept/edit"""))
   }
}
        

// @LINE:123
case controllers_content_Concept_returnAllConcepts91(params) => {
   call { 
        invokeHandler(controllers.content.Concept.returnAllConcepts, HandlerDef(this, "controllers.content.Concept", "returnAllConcepts", Nil,"GET", """""", Routes.prefix + """api/concept/list"""))
   }
}
        

// @LINE:124
case controllers_Admin_AdminApplication_infoConc92(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.infoConc(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "infoConc", Seq(classOf[String]),"GET", """""", Routes.prefix + """concept"""))
   }
}
        

// @LINE:125
case controllers_Admin_AdminApplication_add_concept93(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.add_concept, HandlerDef(this, "controllers.Admin.AdminApplication", "add_concept", Nil,"POST", """""", Routes.prefix + """concept/add"""))
   }
}
        

// @LINE:126
case controllers_Admin_AdminApplication_doedit_concept94(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.doedit_concept, HandlerDef(this, "controllers.Admin.AdminApplication", "doedit_concept", Nil,"POST", """""", Routes.prefix + """concept/doedit"""))
   }
}
        

// @LINE:127
case controllers_Admin_AdminApplication_conceptMoveUp95(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.conceptMoveUp, HandlerDef(this, "controllers.Admin.AdminApplication", "conceptMoveUp", Nil,"POST", """""", Routes.prefix + """concept/moveup"""))
   }
}
        

// @LINE:128
case controllers_Admin_AdminApplication_conceptMoveDown96(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.conceptMoveDown, HandlerDef(this, "controllers.Admin.AdminApplication", "conceptMoveDown", Nil,"POST", """""", Routes.prefix + """concept/movedown"""))
   }
}
        

// @LINE:130
case controllers_Forum_Forum_ForumPage97(params) => {
   call { 
        invokeHandler(controllers.Forum.Forum.ForumPage, HandlerDef(this, "controllers.Forum.Forum", "ForumPage", Nil,"GET", """""", Routes.prefix + """forum"""))
   }
}
        

// @LINE:131
case controllers_Forum_Forum_addForumThread98(params) => {
   call { 
        invokeHandler(controllers.Forum.Forum.addForumThread, HandlerDef(this, "controllers.Forum.Forum", "addForumThread", Nil,"GET", """""", Routes.prefix + """forum/add"""))
   }
}
        

// @LINE:132
case controllers_Forum_Forum_getForumThread99(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Forum.Forum.getForumThread(slug), HandlerDef(this, "controllers.Forum.Forum", "getForumThread", Seq(classOf[String]),"GET", """""", Routes.prefix + """forum/thread"""))
   }
}
        

// @LINE:133
case controllers_Forum_Forum_getApiForumThread100(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Forum.Forum.getApiForumThread(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumThread", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/forum/thread"""))
   }
}
        

// @LINE:134
case controllers_Forum_Forum_getApiForumThreadLike101(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Forum.Forum.getApiForumThreadLike(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumThreadLike", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/forum/thread/like"""))
   }
}
        

// @LINE:135
case controllers_Forum_Forum_getApiForumAnswerLike102(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Forum.Forum.getApiForumAnswerLike(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumAnswerLike", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/forum/answer/like"""))
   }
}
        

// @LINE:136
case controllers_Forum_Forum_getApiForumThreadLikedByUser103(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Forum.Forum.getApiForumThreadLikedByUser(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumThreadLikedByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/forum/thread/userlike"""))
   }
}
        

// @LINE:137
case controllers_Forum_Forum_getApiForumAnswerLikedByUser104(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Forum.Forum.getApiForumAnswerLikedByUser(slug), HandlerDef(this, "controllers.Forum.Forum", "getApiForumAnswerLikedByUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/forum/answer/userlike"""))
   }
}
        

// @LINE:138
case controllers_Forum_Forum_editForumThread105(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Forum.Forum.editForumThread(slug), HandlerDef(this, "controllers.Forum.Forum", "editForumThread", Seq(classOf[String]),"GET", """""", Routes.prefix + """forum/thread/edit"""))
   }
}
        

// @LINE:139
case controllers_Forum_Forum_saveEditedForumThread106(params) => {
   call { 
        invokeHandler(controllers.Forum.Forum.saveEditedForumThread, HandlerDef(this, "controllers.Forum.Forum", "saveEditedForumThread", Nil,"POST", """""", Routes.prefix + """forum/thread/doedit"""))
   }
}
        

// @LINE:140
case controllers_Forum_Forum_saveQuestion107(params) => {
   call { 
        invokeHandler(controllers.Forum.Forum.saveQuestion, HandlerDef(this, "controllers.Forum.Forum", "saveQuestion", Nil,"POST", """""", Routes.prefix + """forum/thread/save"""))
   }
}
        

// @LINE:141
case controllers_Forum_Forum_saveAnswer108(params) => {
   call { 
        invokeHandler(controllers.Forum.Forum.saveAnswer, HandlerDef(this, "controllers.Forum.Forum", "saveAnswer", Nil,"POST", """""", Routes.prefix + """forum/answer/save"""))
   }
}
        

// @LINE:142
case controllers_Forum_Forum_editAnswerThread109(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Forum.Forum.editAnswerThread(slug), HandlerDef(this, "controllers.Forum.Forum", "editAnswerThread", Seq(classOf[String]),"GET", """""", Routes.prefix + """forum/answer/edit"""))
   }
}
        

// @LINE:143
case controllers_Forum_Forum_saveEditedAnswer110(params) => {
   call { 
        invokeHandler(controllers.Forum.Forum.saveEditedAnswer, HandlerDef(this, "controllers.Forum.Forum", "saveEditedAnswer", Nil,"POST", """""", Routes.prefix + """forum/answer/doedit"""))
   }
}
        

// @LINE:144
case controllers_content_Tag_returnTags111(params) => {
   call { 
        invokeHandler(controllers.content.Tag.returnTags, HandlerDef(this, "controllers.content.Tag", "returnTags", Nil,"GET", """""", Routes.prefix + """api/tag/list"""))
   }
}
        

// @LINE:145
case controllers_Admin_AdminApplication_newTag112(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.newTag, HandlerDef(this, "controllers.Admin.AdminApplication", "newTag", Nil,"GET", """""", Routes.prefix + """tag/new"""))
   }
}
        

// @LINE:146
case controllers_Admin_AdminApplication_editTag113(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.editTag(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "editTag", Seq(classOf[String]),"GET", """""", Routes.prefix + """tag/edit"""))
   }
}
        

// @LINE:147
case controllers_Admin_AdminApplication_infoTag114(params) => {
   call(params.fromQuery[String]("slug", None)) { (slug) =>
        invokeHandler(controllers.Admin.AdminApplication.infoTag(slug), HandlerDef(this, "controllers.Admin.AdminApplication", "infoTag", Seq(classOf[String]),"GET", """""", Routes.prefix + """tag"""))
   }
}
        

// @LINE:148
case controllers_Admin_AdminApplication_add_tag115(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.add_tag, HandlerDef(this, "controllers.Admin.AdminApplication", "add_tag", Nil,"POST", """""", Routes.prefix + """tag/add"""))
   }
}
        

// @LINE:149
case controllers_Admin_AdminApplication_doedit_tag116(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.doedit_tag, HandlerDef(this, "controllers.Admin.AdminApplication", "doedit_tag", Nil,"POST", """""", Routes.prefix + """tag/doedit"""))
   }
}
        

// @LINE:152
case controllers_Admin_AdminApplication_getAdminData117(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.getAdminData, HandlerDef(this, "controllers.Admin.AdminApplication", "getAdminData", Nil,"GET", """""", Routes.prefix + """data"""))
   }
}
        

// @LINE:153
case controllers_Admin_AdminApplication_getUsers118(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.getUsers, HandlerDef(this, "controllers.Admin.AdminApplication", "getUsers", Nil,"GET", """""", Routes.prefix + """m/users"""))
   }
}
        

// @LINE:154
case controllers_Admin_AdminApplication_changeUserRole119(params) => {
   call { 
        invokeHandler(controllers.Admin.AdminApplication.changeUserRole, HandlerDef(this, "controllers.Admin.AdminApplication", "changeUserRole", Nil,"POST", """""", Routes.prefix + """api/m/users/change/role"""))
   }
}
        

// @LINE:157
case controllers_Assets_at120(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:159
case controllers_Application_testwebSocket121(params) => {
   call { 
        invokeHandler(controllers.Application.testwebSocket, HandlerDef(this, "controllers.Application", "testwebSocket", Nil,"GET", """GET         /tested                                controllers.TestSocket.hello""", Routes.prefix + """testws"""))
   }
}
        
}

}
     