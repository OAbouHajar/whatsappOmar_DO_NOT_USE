package X;

/* renamed from: X.05f  reason: invalid class name and case insensitive filesystem */
public enum C011005f {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public boolean A00(C011005f r3) {
        return compareTo(r3) >= 0;
    }
}
