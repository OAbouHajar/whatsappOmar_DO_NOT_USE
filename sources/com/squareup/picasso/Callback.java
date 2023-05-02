package com.squareup.picasso;

/* compiled from: XFMFile */
public interface Callback {

    /* compiled from: XFMFile */
    public class EmptyCallback implements Callback {
        public void onError(Exception exc) {
        }

        public void onSuccess() {
        }
    }

    void onError(Exception exc);

    void onSuccess();
}
