package X;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: X.0ew  reason: invalid class name and case insensitive filesystem */
public final class C09120ew implements Closeable, AnonymousClass1UB {
    public final AnonymousClass1UM A00;

    public C09120ew(AnonymousClass1UM r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass1UM AB0() {
        return this.A00;
    }

    public void close() {
        C06300Ve.A00((CancellationException) null, AB0());
    }
}
