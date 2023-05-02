package org.chromium.net;

public abstract class UploadDataSink {
    public abstract void onReadError(Exception exc);

    public abstract void onReadSucceeded(boolean z2);

    public abstract void onRewindError(Exception exc);

    public abstract void onRewindSucceeded();
}
