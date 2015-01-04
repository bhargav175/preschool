import java.util.Arrays;

import models.SecurityRole;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.PlayAuthenticate.Resolver;
import com.feth.play.module.pa.exceptions.AccessDeniedException;
import com.feth.play.module.pa.exceptions.AuthException;

import controllers.routes;

import models.UserPermission;
import play.Application;
import play.GlobalSettings;
import play.libs.F;
import play.libs.F.*;
import play.mvc.*;
import views.html.notFoundPage;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.internalServerError;
import static play.mvc.Results.notFound;

public class Global extends GlobalSettings {


    public F.Promise<SimpleResult> onHandlerNotFound(Http.RequestHeader request) {
        return Promise.<SimpleResult>pure(notFound(
                notFoundPage.render(request.uri())
        ));
    }
    public F.Promise<SimpleResult> onBadRequest(Http.RequestHeader request, String error) {
        return Promise.<SimpleResult>pure(badRequest("Don't try to hack the URI!"));
    }

//    public F.Promise<SimpleResult> onError(Http.RequestHeader request, Throwable t) {
//        return Promise.<SimpleResult>pure(internalServerError(
//                views.html.errorPage.render(t.toString())
//        ));
//    }

	public void onStart(Application app) {
		PlayAuthenticate.setResolver(new Resolver() {

			@Override
			public Call login() {
				// Your login page
				return routes.Application.login();
			}



            @Override
			public Call afterAuth() {
				// The user will be redirected to this page after authentication
				// if no original URL was saved
				return routes.Application.index();
			}

			@Override
			public Call afterLogout() {
				return routes.Application.index();
			}

			@Override
			public Call auth(final String provider) {
				// You can provide your own authentication implementation,
				// however the default should be sufficient for most cases
				return com.feth.play.module.pa.controllers.routes.Authenticate
						.authenticate(provider);
			}

			@Override
			public Call askMerge() {
				return routes.Account.askMerge();
			}

			@Override
			public Call askLink() {
				return routes.Account.askLink();
			}

			@Override
			public Call onException(final AuthException e) {
				if (e instanceof AccessDeniedException) {
					return routes.Signup
							.oAuthDenied(((AccessDeniedException) e)
									.getProviderKey());
				}

				// more custom problem handling here...
				return super.onException(e);
			}
		});

		initialData();
	}

	private void initialData() {
		if (SecurityRole.find.findRowCount() == 0) {
			for (final String roleName : Arrays
					.asList(SecurityRole.ADMIN_ROLE, SecurityRole.TEACHER_ROLE, SecurityRole.PARENT_ROLE,SecurityRole.USER_ROLE)) {
				final SecurityRole role = new SecurityRole();
				role.roleName = roleName;
				role.save();
			}
		}
//        if (UserPermission.find.findRowCount() == 0) {
//            for (final String permissionName : Arrays
//                    .asList(
//							UserPermission.PERMISSION_CRU_ADMINS,
//							UserPermission.PERMISSION_CRU_MODERATORS,
//							UserPermission.PERMISSION_CRU_CONTENT_WRITER,
//							UserPermission.PERMISSION_CRU_ORGANIZATION,
//							UserPermission.PERMISSION_CRU_TEACHER,
//							UserPermission.PERMISSION_CRU_STUDENT,
//							UserPermission.PERMISSION_LOGIN,
//							UserPermission.PERMISSION_D_ADMIN,
//							UserPermission.PERMISSION_D_MODERATOR,
//							UserPermission.PERMISSION_D_CONTENT_WRITER,
//							UserPermission.PERMISSION_D_ORGANIZATION,
//							UserPermission.PERMISSION_D_TEACHER,
//							UserPermission.PERMISSION_D_STUDENT,
//							UserPermission.PERMISSION_BLOCK_ADMIN,
//							UserPermission.PERMISSION_BLOCK_MODERATOR,
//							UserPermission.PERMISSION_BLOCK_CONTENT_WRITER,
//							UserPermission.PERMISSION_BLOCK_ORGANIZATION,
//							UserPermission.PERMISSION_BLOCK_TEACHER,
//							UserPermission.PERMISSION_BLOCK_STUDENT,
//							UserPermission.PERMISSION_CRU_CONTENT,
//							UserPermission.PERMISSION_D_CONTENT,
//							UserPermission.PERMISSION_CRU_TAG,
//							UserPermission.PERMISSION_D_TAG,
//							UserPermission.PERMISSION_CRU_POST,
//							UserPermission.PERMISSION_D_POST,
//							UserPermission.PERMISSION_EDIT_POST,
//							UserPermission.PERMISSION_CRU_FORUM_QUESTION,
//							UserPermission.PERMISSION_FLAG_FORUM_QUESTION,
//							UserPermission.PERMISSION_D_FORUM_QUESTION,
//							UserPermission.PERMISSION_CRU_FORUM_ANSWER,
//							UserPermission.PERMISSION_FLAG_FORUM_ANSWER,
//							UserPermission.PERMISSION_D_FORUM_ANSWER,
//							UserPermission.PERMISSION_CRU_QUIZ,
//							UserPermission.PERMISSION_D_QUIZ,
//							UserPermission.PERMISSION_ASSIGN_ROLES,
//							UserPermission.PERMISSION_VIEW_CONTENT,
//							UserPermission.PERMISSION_UPVOTE_NOTES,
//							UserPermission.PERMISSION_DOWNVOTE_NOTES,
//							UserPermission.PERMISSION_UPVOTE_FORUM_QUESTION,
//							UserPermission.PERMISSION_DOWNVOTE_FORUM_QUESTION,
//							UserPermission.PERMISSION_UPVOTE_FORUM_ANSWER,
//							UserPermission.PERMISSION_DOWNVOTE_FORUM_ANSWER
//
//					)) {
//                final UserPermission userPermission = new UserPermission();
//                userPermission.value = permissionName;
//                userPermission.save();
//            }
        }
	}
