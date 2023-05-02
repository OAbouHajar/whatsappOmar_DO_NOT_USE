package X;

/* renamed from: X.4Xf  reason: invalid class name */
public final class AnonymousClass4Xf {
    public static boolean A00(C90504eH r3, int i2, boolean z2) {
        String str;
        int A00 = C90504eH.A00(r3);
        if (A00 < 7) {
            if (!z2) {
                str = C13680ns.A0c(A00, "too short header: ");
            }
            return false;
        } else if (r3.A0C() != i2) {
            if (!z2) {
                str = AnonymousClass000.A0h(Integer.toHexString(i2), AnonymousClass000.A0r("expected header type "));
            }
            return false;
        } else if (r3.A0C() == 118 && r3.A0C() == 111 && r3.A0C() == 114 && r3.A0C() == 98 && r3.A0C() == 105 && r3.A0C() == 115) {
            return true;
        } else {
            if (!z2) {
                str = "expected characters 'vorbis'";
            }
            return false;
        }
        throw AnonymousClass40M.A00(str);
    }
}
