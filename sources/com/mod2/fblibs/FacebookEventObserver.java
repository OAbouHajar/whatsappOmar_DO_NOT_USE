package com.mod2.fblibs;

import android.app.Activity;
import android.widget.Toast;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class FacebookEventObserver {
    private AuthListener authListener = new AuthListener() {
        public void onAuthFail(String str) {
            FacebookEventObserver.this.showToastOnUIThread("Error was occurred during Facebook authentication");
        }

        public void onAuthSucceed() {
            FacebookEventObserver.this.showToastOnUIThread("Facebook authentication is successful");
        }
    };
    private Reference context = new WeakReference((Object) null);
    private LogoutListener logoutListener = new LogoutListener() {
        public void onLogoutComplete() {
            FacebookEventObserver.this.showToastOnUIThread("You are logged out");
        }
    };
    private PostListener postListener = new PostListener() {
        public void onPostPublished() {
            FacebookEventObserver.this.showToastOnUIThread("Posted to Facebook successfully");
        }

        public void onPostPublishingFailed() {
            FacebookEventObserver.this.showToastOnUIThread("Post publishing was failed");
        }
    };

    public static FacebookEventObserver newInstance() {
        return new FacebookEventObserver();
    }

    /* access modifiers changed from: private */
    public void showToastOnUIThread(final String str) {
        final Activity activity = (Activity) this.context.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    Toast.makeText(activity, str, 0).show();
                }
            });
        }
    }

    public void registerListeners(Activity activity) {
        this.context = new WeakReference(activity);
        FacebookEvents.addAuthListener(this.authListener);
        FacebookEvents.addPostListener(this.postListener);
        FacebookEvents.addLogoutListener(this.logoutListener);
    }

    public void unregisterListeners() {
        this.context.clear();
        FacebookEvents.removeAuthListener(this.authListener);
        FacebookEvents.removePostListener(this.postListener);
        FacebookEvents.removeLogoutListener(this.logoutListener);
    }
}
