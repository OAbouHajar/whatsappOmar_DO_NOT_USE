package X;

import java.util.UUID;

/* renamed from: X.1Ks  reason: invalid class name and case insensitive filesystem */
public class C25681Ks {
    public Integer A00;
    public String A01;
    public final C16040sK A02;
    public final AnonymousClass01V A03;
    public final C16260sj A04;
    public final C16490t9 A05;

    public C25681Ks(C16040sK r1, AnonymousClass01V r2, C16260sj r3, C16490t9 r4) {
        this.A02 = r1;
        this.A05 = r4;
        this.A03 = r2;
        this.A04 = r3;
    }

    public void A00() {
        if (!this.A02.A0G() && this.A01 != null) {
            C74993rR r1 = new C74993rR();
            A01(r1);
            r1.A00 = 3;
            this.A05.A06(r1);
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A01(C74993rR r3) {
        r3.A03 = this.A01;
        r3.A01 = this.A00;
        Integer A002 = AnonymousClass46T.A00(this.A03, this.A04);
        if (A002 != null) {
            r3.A02 = Long.valueOf(A002.longValue());
        }
    }

    public void A02(boolean z2, int i2) {
        if (!this.A02.A0G()) {
            this.A01 = UUID.randomUUID().toString();
            this.A00 = Integer.valueOf(i2);
            C74993rR r1 = new C74993rR();
            A01(r1);
            int i3 = 2;
            if (z2) {
                i3 = 1;
            }
            r1.A00 = Integer.valueOf(i3);
            this.A05.A06(r1);
        }
    }
}
