package com.mod2.fblibs;

import android.os.Bundle;
import com.mod2.fblibs.Facebook;

class FacebookAuthListener implements Facebook.DialogListener {
    public void onCancel() {
    }

    public void onComplete(Bundle bundle) {
        FacebookEvents.onLoginSuccess();
    }

    public void onError(DialogError dialogError) {
        FacebookEvents.onLoginError(dialogError.getMessage());
    }

    public void onFacebookError(FacebookError facebookError) {
        FacebookEvents.onLoginError(facebookError.getMessage());
    }
}
