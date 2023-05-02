package X;

/* renamed from: X.1jp  reason: invalid class name and case insensitive filesystem */
public class C34181jp {
    public static final int A00(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
