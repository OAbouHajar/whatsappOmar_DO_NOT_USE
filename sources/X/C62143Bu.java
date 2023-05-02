package X;

import com.AssemMods.translator.Language;

/* renamed from: X.3Bu  reason: invalid class name and case insensitive filesystem */
public class C62143Bu {
    public static final C005902n A00 = new C005902n();

    public static float A00(C31201dg r1, float f2, int i2, boolean z2) {
        String A0J = r1.A0J(i2);
        if (A0J == null || (z2 && A0J.equals(Language.AUTO_DETECT))) {
            return Float.NaN;
        }
        try {
            return A0J.endsWith("%") ? C62163Bx.A00(A0J) * 0.01f * f2 : C62163Bx.A01(A0J);
        } catch (AnonymousClass40K e2) {
            C29691b2.A01("BloksFlexLayoutProvider", "Error parsing size dimension value", e2);
            return Float.NaN;
        }
    }

    public static float A01(C31201dg r2, int i2) {
        String A0J = r2.A0J(i2);
        if (A0J == null) {
            return Float.NaN;
        }
        try {
            return C62163Bx.A01(A0J);
        } catch (AnonymousClass40K e2) {
            C29691b2.A01("BloksFlexLayoutProvider", "Error parsing padding value", e2);
            return Float.NaN;
        }
    }

    public static C31201dg A02(C31201dg r2) {
        if (r2 == null || r2.A0G(132) == null || r2.A0G(132).A01 != 13368) {
            return null;
        }
        return r2.A0G(132);
    }

    public static void A03(C03840Kb r5, AnonymousClass0W8 r6, String str) {
        float A01;
        float[] fArr;
        int i2;
        try {
            if (str.endsWith("%")) {
                A01 = C62163Bx.A00(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    AnonymousClass0W8.A00(r6, 3);
                    fArr = r6.A01;
                    int i3 = r6.A00;
                    int i4 = i3 + 1;
                    r6.A00 = i4;
                    fArr[i3] = (float) 8;
                    i2 = i4 + 1;
                    r6.A00 = i2;
                    fArr[i4] = (float) r5.mIntValue;
                } else {
                    return;
                }
            } else {
                A01 = C62163Bx.A01(str);
                if (Float.compare(A01, Float.NaN) != 0) {
                    AnonymousClass0W8.A00(r6, 3);
                    fArr = r6.A01;
                    int i5 = r6.A00;
                    int i6 = i5 + 1;
                    r6.A00 = i6;
                    fArr[i5] = (float) 7;
                    i2 = i6 + 1;
                    r6.A00 = i2;
                    fArr[i6] = (float) r5.mIntValue;
                } else {
                    return;
                }
            }
            r6.A00 = i2 + 1;
            fArr[i2] = A01;
        } catch (AnonymousClass40K e2) {
            C29691b2.A01("BloksFlexLayoutProvider", "Error parsing padding value", e2);
        }
    }

    public static void A04(C03840Kb r5, C005902n r6, String str) {
        float A01;
        float[] fArr;
        int i2;
        try {
            if (str.endsWith("%")) {
                A01 = C62163Bx.A00(str);
                if (!C005902n.A01(A01)) {
                    C005902n.A00(r6, 3);
                    fArr = r6.A01;
                    int i3 = r6.A00;
                    int i4 = i3 + 1;
                    r6.A00 = i4;
                    fArr[i3] = (float) 25;
                    i2 = i4 + 1;
                    r6.A00 = i2;
                    fArr[i4] = (float) r5.mIntValue;
                } else {
                    return;
                }
            } else if (str.equals(Language.AUTO_DETECT)) {
                float[] A1Y = C13690nt.A1Y(r6);
                int i5 = r6.A00;
                int i6 = i5 + 1;
                r6.A00 = i6;
                A1Y[i5] = (float) 26;
                r6.A00 = i6 + 1;
                A1Y[i6] = (float) r5.mIntValue;
                return;
            } else {
                A01 = C62163Bx.A01(str);
                if (!C005902n.A01(A01)) {
                    C005902n.A00(r6, 3);
                    fArr = r6.A01;
                    int i7 = r6.A00;
                    int i8 = i7 + 1;
                    r6.A00 = i8;
                    fArr[i7] = (float) 24;
                    i2 = i8 + 1;
                    r6.A00 = i2;
                    fArr[i8] = (float) r5.mIntValue;
                } else {
                    return;
                }
            }
            r6.A00 = i2 + 1;
            fArr[i2] = A01;
        } catch (AnonymousClass40K e2) {
            C29691b2.A01("BloksFlexLayoutProvider", "Error parsing margin value", e2);
        }
    }

    public static void A05(C03840Kb r5, C005902n r6, String str) {
        float A01;
        float[] fArr;
        int i2;
        try {
            if (str.endsWith("%")) {
                A01 = C62163Bx.A00(str);
                if (!C005902n.A01(A01)) {
                    C005902n.A00(r6, 3);
                    fArr = r6.A01;
                    int i3 = r6.A00;
                    int i4 = i3 + 1;
                    r6.A00 = i4;
                    fArr[i3] = (float) 28;
                    i2 = i4 + 1;
                    r6.A00 = i2;
                    fArr[i4] = (float) r5.mIntValue;
                } else {
                    return;
                }
            } else {
                A01 = C62163Bx.A01(str);
                if (!C005902n.A01(A01)) {
                    C005902n.A00(r6, 3);
                    fArr = r6.A01;
                    int i5 = r6.A00;
                    int i6 = i5 + 1;
                    r6.A00 = i6;
                    fArr[i5] = (float) 27;
                    i2 = i6 + 1;
                    r6.A00 = i2;
                    fArr[i6] = (float) r5.mIntValue;
                } else {
                    return;
                }
            }
            r6.A00 = i2 + 1;
            fArr[i2] = A01;
        } catch (AnonymousClass40K e2) {
            C29691b2.A01("BloksFlexLayoutProvider", "Error parsing position value", e2);
        }
    }
}
