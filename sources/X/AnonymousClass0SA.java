package X;

import java.util.Arrays;

/* renamed from: X.0SA  reason: invalid class name */
public class AnonymousClass0SA {
    public static int A0C = 1;
    public float A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public C03800Jx A06;
    public boolean A07;
    public boolean A08 = false;
    public float[] A09 = new float[9];
    public float[] A0A = new float[9];
    public C07210an[] A0B = new C07210an[16];

    public AnonymousClass0SA(C03800Jx r4) {
        this.A06 = r4;
    }

    public void A00() {
        this.A06 = C03800Jx.UNKNOWN;
        this.A04 = 0;
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = 0.0f;
        this.A08 = false;
        int i2 = this.A03;
        for (int i3 = 0; i3 < i2; i3++) {
            this.A0B[i3] = null;
        }
        this.A03 = 0;
        this.A05 = 0;
        this.A07 = false;
        Arrays.fill(this.A09, 0.0f);
    }

    public void A01(float f2) {
        this.A00 = f2;
        this.A08 = true;
        int i2 = this.A03;
        for (int i3 = 0; i3 < i2; i3++) {
            C07210an r3 = this.A0B[i3];
            C13390lx r2 = r3.A01;
            r3.A00 += r2.A9S(this) * f2;
            r2.Abq(this, false);
        }
        this.A03 = 0;
    }

    public final void A02(C07210an r4) {
        int i2 = 0;
        while (true) {
            int i3 = this.A03;
            if (i2 >= i3) {
                C07210an[] r1 = this.A0B;
                int length = r1.length;
                if (i3 >= length) {
                    r1 = (C07210an[]) Arrays.copyOf(r1, length << 1);
                    this.A0B = r1;
                }
                int i4 = this.A03;
                r1[i4] = r4;
                this.A03 = i4 + 1;
                return;
            } else if (this.A0B[i2] != r4) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void A03(C07210an r6) {
        int i2 = this.A03;
        int i3 = 0;
        while (i3 < i2) {
            C07210an[] r2 = this.A0B;
            if (r2[i3] != r6) {
                i3++;
            } else {
                while (true) {
                    int i4 = i2 - 1;
                    if (i3 < i4) {
                        int i5 = i3 + 1;
                        r2[i3] = r2[i5];
                        i3 = i5;
                    } else {
                        this.A03 = i4;
                        return;
                    }
                }
            }
        }
    }

    public final void A04(C07210an r5) {
        int i2 = this.A03;
        for (int i3 = 0; i3 < i2; i3++) {
            this.A0B[i3].A02(r5, false);
        }
        this.A03 = 0;
    }

    public String toString() {
        return AnonymousClass000.A0l(AnonymousClass000.A0q(""), this.A02);
    }
}
