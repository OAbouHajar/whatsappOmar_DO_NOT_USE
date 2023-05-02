package X;

/* renamed from: X.03t  reason: invalid class name and case insensitive filesystem */
public class C008203t extends C440822r {
    public static final C441022t A00(int i2, int i3) {
        return A01(i2, i3);
    }

    public static final C441022t A01(int i2, int i3) {
        return new C441022t(i2, i3, -1);
    }

    public static final C440922s A02() {
        return C440922s.A00;
    }

    public static final C440922s A03(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? A02() : new C440922s(i2, i3 - 1);
    }
}
