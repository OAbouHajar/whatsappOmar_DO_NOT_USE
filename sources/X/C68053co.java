package X;

import java.io.Serializable;

/* renamed from: X.3co  reason: invalid class name and case insensitive filesystem */
public final class C68053co extends AnonymousClass57I implements Serializable {
    public static final C68053co INSTANCE = new C68053co();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public AnonymousClass57I reverse() {
        return AnonymousClass57I.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
