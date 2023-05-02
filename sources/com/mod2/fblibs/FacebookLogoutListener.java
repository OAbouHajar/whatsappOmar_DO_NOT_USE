package com.mod2.fblibs;

import com.mod2.fblibs.AsyncFacebookRunner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

class FacebookLogoutListener implements AsyncFacebookRunner.RequestListener {
    public void onComplete(String str, Object obj) {
        FacebookEvents.onLogoutComplete();
    }

    public void onFacebookError(FacebookError facebookError, Object obj) {
    }

    public void onFileNotFoundException(FileNotFoundException fileNotFoundException, Object obj) {
    }

    public void onIOException(IOException iOException, Object obj) {
    }

    public void onMalformedURLException(MalformedURLException malformedURLException, Object obj) {
    }
}
