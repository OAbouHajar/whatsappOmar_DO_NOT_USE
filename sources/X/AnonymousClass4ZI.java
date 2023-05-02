package X;

/* renamed from: X.4ZI  reason: invalid class name */
public final class AnonymousClass4ZI {
    public final String A00;

    public AnonymousClass4ZI(String str) {
        this.A00 = str;
    }

    public static AnonymousClass4ZI A00(C90504eH r5) {
        String str;
        int A01 = C90504eH.A01(r5, 2);
        int i2 = A01 >> 1;
        int A0C = ((r5.A0C() >> 3) & 31) | ((A01 & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else if (i2 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder A0q = AnonymousClass000.A0q(str);
        String str2 = ".0";
        A0q.append(str2);
        A0q.append(i2);
        if (A0C >= 10) {
            str2 = ".";
        }
        return new AnonymousClass4ZI(C13680ns.A0i(str2, A0q, A0C));
    }
}
