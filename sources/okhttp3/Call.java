package okhttp3;

/* compiled from: XFMFile */
public interface Call extends Cloneable {

    /* compiled from: XFMFile */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
