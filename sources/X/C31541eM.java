package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.1eM  reason: invalid class name and case insensitive filesystem */
public class C31541eM implements Closeable {
    public final C31531eL A00;
    public final InputStream A01;

    public C31541eM(C31531eL r1, InputStream inputStream) {
        this.A00 = r1;
        this.A01 = inputStream;
    }

    public void close() {
        this.A01.close();
    }
}
