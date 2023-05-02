package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.1x3  reason: invalid class name and case insensitive filesystem */
public final class C42011x3 implements Closeable {
    public final InputStream[] A00;
    public final /* synthetic */ C42001x2 A01;

    public C42011x3(C42001x2 r1, InputStream[] inputStreamArr) {
        this.A01 = r1;
        this.A00 = inputStreamArr;
    }

    public void close() {
        for (InputStream A03 : this.A00) {
            C42001x2.A03(A03);
        }
    }
}
