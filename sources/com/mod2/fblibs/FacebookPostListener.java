package com.mod2.fblibs;

import com.mod2.fblibs.AsyncFacebookRunner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

class FacebookPostListener implements AsyncFacebookRunner.RequestListener {
    public void onComplete(String str, Object obj) {
        FacebookEvents.onPostPublished();
    }

    public void onFacebookError(FacebookError facebookError, Object obj) {
        FacebookEvents.onPostPublishingFailed();
    }

    public void onFileNotFoundException(FileNotFoundException fileNotFoundException, Object obj) {
        FacebookEvents.onPostPublishingFailed();
    }

    public void onIOException(IOException iOException, Object obj) {
        FacebookEvents.onPostPublishingFailed();
    }

    public void onMalformedURLException(MalformedURLException malformedURLException, Object obj) {
        FacebookEvents.onPostPublishingFailed();
    }
}
