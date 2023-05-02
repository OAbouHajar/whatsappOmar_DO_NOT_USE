package X;

import java.io.Serializable;

/* renamed from: X.58r  reason: invalid class name and case insensitive filesystem */
public final class C1052258r implements AnonymousClass1UM, Serializable {
    public static final C1052258r A00 = new C1052258r();
    public static final long serialVersionUID = 0;

    private final Object readResolve() {
        return A00;
    }

    public Object fold(Object obj, AnonymousClass1UJ r2) {
        return obj;
    }

    public AnonymousClass1UL get(AnonymousClass5NJ r2) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public AnonymousClass1UM minusKey(AnonymousClass5NJ r1) {
        return this;
    }

    public AnonymousClass1UM plus(AnonymousClass1UM r2) {
        C18450wi.A0H(r2, 0);
        return r2;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
