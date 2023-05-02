package X;

import java.io.Closeable;

/* renamed from: X.1vO  reason: invalid class name and case insensitive filesystem */
public final class C41191vO {
    public static final void A00(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C813647w.A00(th, th2);
        }
    }
}
