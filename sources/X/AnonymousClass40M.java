package X;

import java.io.IOException;

/* renamed from: X.40M  reason: invalid class name */
public class AnonymousClass40M extends IOException {
    public AnonymousClass40M() {
    }

    public AnonymousClass40M(String str) {
        super(str);
    }

    public AnonymousClass40M(String str, Throwable th) {
        super(str, th);
    }

    public static AnonymousClass40M A00(String str) {
        return new AnonymousClass40M(str);
    }
}
