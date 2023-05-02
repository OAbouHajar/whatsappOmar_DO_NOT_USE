package X;

import java.util.Map;

/* renamed from: X.1vj  reason: invalid class name and case insensitive filesystem */
public class C41401vj {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04 = Long.MAX_VALUE;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09 = Long.MAX_VALUE;
    public Map A0A;
    public Map A0B;
    public boolean A0C;
    public boolean A0D;
    public final C16570tH A0E;
    public final C16300so A0F;
    public final C16440t3 A0G;
    public final C16490t9 A0H;
    public final AnonymousClass2H7 A0I;
    public final C28361Vu A0J;

    public C41401vj(C16570tH r3, C16300so r4, C16440t3 r5, C16490t9 r6, AnonymousClass2H7 r7, C28361Vu r8, Map map, Map map2) {
        this.A0G = r5;
        this.A0F = r4;
        this.A0H = r6;
        this.A0E = r3;
        this.A0I = r7;
        this.A0B = map;
        this.A0A = map2;
        this.A0J = r8;
    }

    public void A00(boolean z2) {
        if (!this.A0D) {
            this.A0D = true;
            if (this.A05 + this.A07 + this.A06 != 0) {
                C75903su r6 = new C75903su();
                long j2 = this.A08;
                long j3 = this.A00;
                r6.A0A = Long.valueOf(j2 - j3);
                r6.A06 = Long.valueOf(this.A04 - j3);
                r6.A0B = Long.valueOf(this.A0G.A00() - this.A00);
                int i2 = 2;
                if (z2) {
                    i2 = 1;
                }
                r6.A02 = Integer.valueOf(i2);
                r6.A01 = Boolean.valueOf(this.A0E.A00);
                r6.A00 = Boolean.valueOf(!this.A0C);
                r6.A03 = Long.valueOf(this.A01);
                r6.A08 = Long.valueOf(this.A05);
                r6.A05 = Long.valueOf(this.A03);
                r6.A0C = Long.valueOf(this.A07);
                r6.A04 = Long.valueOf(this.A02);
                r6.A09 = Long.valueOf(this.A06);
                long j4 = this.A09;
                if (j4 != Long.MAX_VALUE) {
                    r6.A07 = Long.valueOf((this.A00 - j4) / 86400000);
                }
                this.A0H.A06(r6);
            }
        }
    }
}
