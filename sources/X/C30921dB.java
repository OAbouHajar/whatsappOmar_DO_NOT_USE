package X;

import android.text.TextUtils;
import com.mod.bomfab.R$styleable;

/* renamed from: X.1dB  reason: invalid class name and case insensitive filesystem */
public class C30921dB {
    public static boolean A00(byte b2) {
        return b2 == 42 || b2 == 43;
    }

    public static boolean A01(C16040sK r3, C16740tZ r4) {
        C28381Vw r2 = r4.A11;
        return r2.A02 && r4.A0C != 6 && r3.A0I(r2.A00);
    }

    public static boolean A02(C16740tZ r3) {
        int i2;
        if (r3 == null) {
            return true;
        }
        if (!A03(r3) || ((i2 = r3.A07) != 0 && (i2 & 1) == 1 && r3.A0W == null)) {
            return false;
        }
        C16740tZ A0D = r3.A0D();
        return A0D == null || A03(A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r0 = ((X.C16730tY) r2).A12();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C16740tZ r2) {
        /*
            X.0tm r0 = r2.A0F()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            X.0tm r0 = r2.A0F()
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            boolean r0 = r2 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0024
            X.0tY r2 = (X.C16730tY) r2
            X.1y4 r0 = r2.A12()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0011
        L_0x0024:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30921dB.A03(X.0tZ):boolean");
    }

    public static boolean A04(C16740tZ r1) {
        if (!(r1 instanceof C30581cc)) {
            return false;
        }
        C30581cc r12 = (C30581cc) r1;
        return !TextUtils.isEmpty(r12.A06) || !TextUtils.isEmpty(r12.A04);
    }

    public static boolean A05(C16740tZ r6) {
        if (1531267200000L <= r6.A0I && r6.A10(1)) {
            if (!C42551xz.A04(r6)) {
                byte b2 = r6.A10;
                if (b2 != 0) {
                    if (!(b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5 || b2 == 9 || b2 == 23 || b2 == 32 || b2 == 37 || b2 == 52 || b2 == 55 || b2 == 57 || b2 == 13 || b2 == 14 || b2 == 62 || b2 == 63)) {
                        switch (b2) {
                            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                            case 30:
                                break;
                        }
                    }
                } else if (r6.A0L == null) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
