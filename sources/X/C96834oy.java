package X;

import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4oy  reason: invalid class name and case insensitive filesystem */
public final class C96834oy implements AnonymousClass5SL {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C90504eH A04;

    public C96834oy(C65413Ur r3) {
        C90504eH r1 = r3.A00;
        this.A04 = r1;
        this.A02 = C90504eH.A02(r1, 12) & MotionEventCompat.ACTION_MASK;
        this.A03 = r1.A0E();
    }

    public int ACK() {
        return -1;
    }

    public int AFg() {
        return this.A03;
    }

    public int AbW() {
        int i2 = this.A02;
        if (i2 == 8) {
            return this.A04.A0C();
        }
        if (i2 == 16) {
            return this.A04.A0F();
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        if (i3 % 2 != 0) {
            return this.A00 & 15;
        }
        int A0C = this.A04.A0C();
        this.A00 = A0C;
        return (A0C & 240) >> 4;
    }
}
