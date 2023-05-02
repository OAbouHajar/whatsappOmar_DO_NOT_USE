package X;

import com.obwhatsapp.yo.yo;

/* renamed from: X.1tU  reason: invalid class name and case insensitive filesystem */
public class C40051tU implements C40061tV {
    public static final int A05 = Math.max(64, Math.min((int) ((AnonymousClass01S.A00 / 16) / 16384), 512));
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;

    public C40051tU(int i2, int i3) {
        this.A04 = i2 != 1 ? i2 * 3072 : i3;
        this.A03 = A05 * i2;
    }

    public int AD8() {
        return this.A02;
    }

    public boolean AYa(int i2, boolean z2) {
        int i3 = this.A04;
        if (i3 != 0) {
            int i4 = this.A00 + 1;
            this.A00 = i4;
            int i5 = this.A01 + (z2 ? 1 : 0);
            this.A01 = i5;
            if (i4 > i3 || i5 > this.A03) {
                this.A02 = yo.readmore(i2);
                return false;
            }
        }
        return true;
    }
}
