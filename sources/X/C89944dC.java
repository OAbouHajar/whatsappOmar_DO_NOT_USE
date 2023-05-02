package X;

import android.util.Log;

/* renamed from: X.4dC  reason: invalid class name and case insensitive filesystem */
public final class C89944dC {
    public final float A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C89944dC(Integer num, String str, float f2, int i2, boolean z2, boolean z3) {
        this.A03 = str;
        this.A01 = i2;
        this.A02 = num;
        this.A00 = f2;
        this.A04 = z2;
        this.A05 = z3;
    }

    public static int A00(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w("SsaStyle", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Ignoring unknown alignment: ")));
        return -1;
    }

    public static boolean A01(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e2) {
            StringBuilder A0r = AnonymousClass000.A0r("Failed to parse bold/italic: '");
            A0r.append(str);
            C89504cL.A02("SsaStyle", AnonymousClass000.A0h("'", A0r), e2);
            return false;
        }
    }
}
