package X;

import java.io.Closeable;
import java.net.HttpURLConnection;

/* renamed from: X.0ep  reason: invalid class name and case insensitive filesystem */
public class C09050ep implements Closeable {
    public final HttpURLConnection A00;

    public C09050ep(HttpURLConnection httpURLConnection) {
        this.A00 = httpURLConnection;
    }

    public void close() {
        this.A00.disconnect();
    }
}
