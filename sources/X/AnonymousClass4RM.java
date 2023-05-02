package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4RM  reason: invalid class name */
public final class AnonymousClass4RM {
    public int A00 = -1;
    public boolean A01;
    public final C87284Wd A02 = new C87284Wd();
    public final C90504eH A03 = new C90504eH(new byte[65025], 0);

    public boolean A00(C55142iu r10) {
        C87284Wd r6;
        int i2;
        int i3;
        C90524eJ.A04(AnonymousClass000.A1V(r10));
        if (this.A01) {
            this.A01 = false;
            this.A03.A0Q(0);
        }
        while (!this.A01) {
            int i4 = this.A00;
            if (i4 < 0) {
                C87284Wd r62 = this.A02;
                if (!r62.A00(r10, -1) || !r62.A01(r10, true)) {
                    return false;
                }
                int i5 = r62.A01;
                if ((r62.A03 & 1) == 1 && this.A03.A00 == 0) {
                    int i6 = 0;
                    i4 = 0;
                    do {
                        int i7 = i4;
                        if (i4 >= r62.A02) {
                            break;
                        }
                        i4++;
                        i3 = r62.A06[i7];
                        i6 += i3;
                    } while (i3 == 255);
                    i5 += i6;
                } else {
                    i4 = 0;
                }
                r10.Afx(i5);
                this.A00 = i4;
            }
            int i8 = 0;
            int i9 = 0;
            do {
                int i10 = i9;
                int i11 = i4 + i9;
                r6 = this.A02;
                if (i11 >= r6.A02) {
                    break;
                }
                i9++;
                i2 = r6.A06[i10 + i4];
                i8 += i2;
            } while (i2 == 255);
            int i12 = i4 + i9;
            if (i8 > 0) {
                C90504eH r2 = this.A03;
                r2.A0P(r2.A00 + i8);
                r10.readFully(r2.A02, r2.A00, i8);
                r2.A0R(r2.A00 + i8);
                this.A01 = AnonymousClass3K2.A1X(r6.A06[i12 - 1], MotionEventCompat.ACTION_MASK);
            }
            if (i12 == r6.A02) {
                i12 = -1;
            }
            this.A00 = i12;
        }
        return true;
    }
}
