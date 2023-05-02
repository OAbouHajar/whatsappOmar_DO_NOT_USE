package okhttp3.internal.http2;

import e.j;
import java.util.List;
import okio.BufferedSource;

/* compiled from: XFMFile */
public interface PushObserver {
    public static final PushObserver CANCEL = new j();

    boolean onData(int i2, BufferedSource bufferedSource, int i3, boolean z2);

    boolean onHeaders(int i2, List<Header> list, boolean z2);

    boolean onRequest(int i2, List<Header> list);

    void onReset(int i2, ErrorCode errorCode);
}
