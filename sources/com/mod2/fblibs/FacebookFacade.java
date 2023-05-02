package com.mod2.fblibs;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookFacade {
    public static final String[] FACEBOOK_PERMISSIONS = {"publish_stream"};
    private AsyncFacebookRunner asyncFacebook = new AsyncFacebookRunner(this.facebook);
    /* access modifiers changed from: private */
    public Activity context;
    /* access modifiers changed from: private */
    public Facebook facebook;

    protected static class RequestParameter {
        public static final String ACTIONS = "actions";
        public static final String CAPTION = "caption";
        public static final String DESCRIPTION = "description";
        public static final String LINK = "link";
        public static final String MESSAGE = "message";
        public static final String NAME = "name";
        public static final String PICTURE = "picture";

        protected RequestParameter() {
        }
    }

    public FacebookFacade(Activity activity, String str) {
        this.context = activity;
        this.facebook = new Facebook(str);
        FacebookSessionStore.restore(this.facebook, activity);
    }

    private String buildActionsString(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put(RequestParameter.NAME, (String) entry.getKey());
                jSONObject.put(RequestParameter.LINK, (String) entry.getValue());
            } catch (JSONException e2) {
            }
        }
        return jSONObject.toString();
    }

    public void authorize() {
        authorize((AuthListener) null);
    }

    public void authorize(final AuthListener authListener) {
        this.facebook.authorize(this.context, FACEBOOK_PERMISSIONS, new FacebookAuthListener() {
            public void onComplete(Bundle bundle) {
                FacebookSessionStore.save(FacebookFacade.this.facebook, FacebookFacade.this.context);
                if (authListener != null) {
                    authListener.onAuthSucceed();
                }
                super.onComplete(bundle);
            }

            public void onError(DialogError dialogError) {
                if (authListener != null) {
                    authListener.onAuthFail(dialogError.getMessage());
                }
                super.onError(dialogError);
            }

            public void onFacebookError(FacebookError facebookError) {
                if (authListener != null) {
                    authListener.onAuthFail(facebookError.getMessage());
                }
                super.onFacebookError(facebookError);
            }
        });
    }

    public boolean isAuthorized() {
        return this.facebook.isSessionValid();
    }

    public void logout() {
        this.asyncFacebook.logout(this.context, new FacebookLogoutListener() {
            public void onComplete(String str, Object obj) {
                super.onComplete(str, obj);
                FacebookSessionStore.clear(FacebookFacade.this.context);
            }
        });
    }

    public void publishImage(byte[] bArr, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("method", "photos.upload");
        bundle.putString(RequestParameter.CAPTION, str);
        bundle.putByteArray(RequestParameter.PICTURE, bArr);
        this.asyncFacebook.request((String) null, bundle, "POST", new FacebookPostListener(), (Object) null);
    }

    public void publishMessage(String str) {
        publishMessage(str, (String) null, (String) null, (String) null);
    }

    public void publishMessage(String str, String str2, String str3, String str4) {
        publishMessage(str, str2, str3, str4, (String) null);
    }

    public void publishMessage(String str, String str2, String str3, String str4, String str5) {
        publishMessage(str, str2, str3, str4, str5, (Map) null);
    }

    public void publishMessage(String str, String str2, String str3, String str4, String str5, Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        if (str2 != null) {
            bundle.putString(RequestParameter.LINK, str2);
        }
        if (str3 != null) {
            bundle.putString(RequestParameter.NAME, str3);
        }
        if (str4 != null) {
            bundle.putString(RequestParameter.DESCRIPTION, str4);
        }
        if (str5 != null) {
            bundle.putString(RequestParameter.PICTURE, str5);
        }
        if (map != null) {
            bundle.putString(RequestParameter.ACTIONS, buildActionsString(map));
        }
        this.asyncFacebook.request("me/feed", bundle, "POST", new FacebookPostListener(), (Object) null);
    }
}
