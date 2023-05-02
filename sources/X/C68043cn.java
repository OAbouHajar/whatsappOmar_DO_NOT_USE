package X;

import java.io.Serializable;

/* renamed from: X.3cn  reason: invalid class name and case insensitive filesystem */
public final class C68043cn extends AnonymousClass57I implements Serializable {
    public static final C68043cn INSTANCE = new C68043cn();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public AnonymousClass57I reverse() {
        return C68053co.INSTANCE;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
