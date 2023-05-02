package X;

import java.io.Serializable;

/* renamed from: X.1vP  reason: invalid class name and case insensitive filesystem */
public abstract class C41201vP implements Serializable {
    public static final Throwable A00(Object obj) {
        if (obj instanceof C41211vQ) {
            return ((C41211vQ) obj).exception;
        }
        return null;
    }

    public static final boolean A01(Object obj) {
        return obj instanceof C41211vQ;
    }
}
