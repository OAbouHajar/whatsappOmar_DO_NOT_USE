package X;

import java.util.Arrays;

/* renamed from: X.4bI  reason: invalid class name and case insensitive filesystem */
public class C88914bI {
    public int A00;
    public final int A01;
    public final C90934f6 A02;

    public C88914bI(C90934f6 r3, int i2) {
        int i3;
        this.A02 = r3;
        this.A00 = i2;
        if (i2 > 0) {
            i3 = (r3.A01 - 1) - (i2 - 1);
        } else {
            i3 = -1;
        }
        this.A01 = i3;
    }

    public static boolean A00(double d2) {
        return AnonymousClass000.A1P(((d2 < 0.0d ? Math.ceil(d2) : Math.floor(d2)) > d2 ? 1 : ((d2 < 0.0d ? Math.ceil(d2) : Math.floor(d2)) == d2 ? 0 : -1)));
    }

    public final Object A01(int i2) {
        int i3 = this.A00;
        boolean z2 = true;
        if (AnonymousClass3K2.A1X(i3, -1)) {
            if (i2 >= i3) {
                z2 = false;
            }
            C807445h.A00("invalid instr stack argument", z2);
            return this.A02.A05[this.A01 + i2];
        }
        throw AnonymousClass000.A0V("InstrStackArgs is not initialized");
    }

    public final void A02(Object obj) {
        int i2 = this.A00;
        if (AnonymousClass3K2.A1X(i2, -1)) {
            C90934f6 r3 = this.A02;
            int i3 = r3.A01 - i2;
            r3.A01 = i3;
            Arrays.fill(r3.A05, i3, i2 + i3, (Object) null);
            r3.A0U(obj);
            this.A00 = -1;
            return;
        }
        throw AnonymousClass000.A0V("InstrStackArgs is not initialized");
    }
}
