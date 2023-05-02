package com.mod2.fblibs;

import android.content.Context;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public class AsyncFacebookRunner {
    Facebook fb;

    public interface RequestListener {
        void onComplete(String str, Object obj);

        void onFacebookError(FacebookError facebookError, Object obj);

        void onFileNotFoundException(FileNotFoundException fileNotFoundException, Object obj);

        void onIOException(IOException iOException, Object obj);

        void onMalformedURLException(MalformedURLException malformedURLException, Object obj);
    }

    public AsyncFacebookRunner(Facebook facebook) {
        this.fb = facebook;
    }

    public void logout(Context context, RequestListener requestListener) {
        logout(context, requestListener, (Object) null);
    }

    public void logout(final Context context, final RequestListener requestListener, final Object obj) {
        new Thread() {
            public void run() {
                try {
                    String logout = AsyncFacebookRunner.this.fb.logout(context);
                    if (logout.length() == 0 || logout.equals("false")) {
                        requestListener.onFacebookError(new FacebookError("auth.expireSession failed"), obj);
                    } else {
                        requestListener.onComplete(logout, obj);
                    }
                } catch (FileNotFoundException e2) {
                    requestListener.onFileNotFoundException(e2, obj);
                } catch (MalformedURLException e3) {
                    requestListener.onMalformedURLException(e3, obj);
                } catch (IOException e4) {
                    requestListener.onIOException(e4, obj);
                }
            }
        }.start();
    }

    public void request(Bundle bundle, RequestListener requestListener) {
        request((String) null, bundle, "GET", requestListener, (Object) null);
    }

    public void request(Bundle bundle, RequestListener requestListener, Object obj) {
        request((String) null, bundle, "GET", requestListener, obj);
    }

    public void request(String str, Bundle bundle, RequestListener requestListener) {
        request(str, bundle, "GET", requestListener, (Object) null);
    }

    public void request(String str, Bundle bundle, RequestListener requestListener, Object obj) {
        request(str, bundle, "GET", requestListener, obj);
    }

    public void request(String str, Bundle bundle, String str2, RequestListener requestListener, Object obj) {
        final String str3 = str;
        final Bundle bundle2 = bundle;
        final String str4 = str2;
        final RequestListener requestListener2 = requestListener;
        final Object obj2 = obj;
        new Thread() {
            public void run() {
                try {
                    requestListener2.onComplete(AsyncFacebookRunner.this.fb.request(str3, bundle2, str4), obj2);
                } catch (FileNotFoundException e2) {
                    requestListener2.onFileNotFoundException(e2, obj2);
                } catch (MalformedURLException e3) {
                    requestListener2.onMalformedURLException(e3, obj2);
                } catch (IOException e4) {
                    requestListener2.onIOException(e4, obj2);
                }
            }
        }.start();
    }

    public void request(String str, RequestListener requestListener) {
        request(str, new Bundle(), "GET", requestListener, (Object) null);
    }

    public void request(String str, RequestListener requestListener, Object obj) {
        request(str, new Bundle(), "GET", requestListener, obj);
    }
}
