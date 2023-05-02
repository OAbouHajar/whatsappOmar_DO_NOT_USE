package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.0eq  reason: invalid class name and case insensitive filesystem */
public final class C09060eq implements Closeable {
    public final long[] A00;
    public final InputStream[] A01;
    public final /* synthetic */ C09100eu A02;

    public C09060eq(C09100eu r1, long[] jArr, InputStream[] inputStreamArr) {
        this.A02 = r1;
        this.A01 = inputStreamArr;
        this.A00 = jArr;
    }

    public void close() {
        for (InputStream A012 : this.A01) {
            C09100eu.A01(A012);
        }
    }
}
