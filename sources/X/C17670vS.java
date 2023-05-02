package X;

/* renamed from: X.0vS  reason: invalid class name and case insensitive filesystem */
public class C17670vS {
    public C29411aa A00;
    public C53992gd A01;
    public C29451ae A02;
    public C29451ae A03;
    public C29441ad A04;
    public final C15900s5 A05;
    public final C16980tz A06;
    public final C14710pd A07;
    public final C219716d A08;
    public final C219616c A09;
    public final C220216i A0A;
    public final C220116h A0B;
    public final C220016g A0C;
    public final C219416a A0D;
    public final C219516b A0E;
    public final C219916f A0F;
    public final AnonymousClass16Y A0G;

    public C17670vS(C15900s5 r1, C16980tz r2, C14710pd r3, C219716d r4, C219616c r5, C220216i r6, C220116h r7, C220016g r8, C219416a r9, C219516b r10, C219916f r11, AnonymousClass16Y r12) {
        this.A07 = r3;
        this.A06 = r2;
        this.A05 = r1;
        this.A0B = r7;
        this.A0F = r11;
        this.A08 = r4;
        this.A0C = r8;
        this.A09 = r5;
        this.A0E = r10;
        this.A0A = r6;
        this.A0D = r9;
        this.A0G = r12;
    }

    public synchronized C29411aa A00() {
        C29411aa r2;
        r2 = this.A00;
        if (r2 == null) {
            r2 = new C29411aa(this.A06.A00, this.A08);
            this.A00 = r2;
        }
        return r2;
    }

    public synchronized C29451ae A01(boolean z2) {
        C29451ae r0;
        if (z2) {
            r0 = this.A03;
            if (r0 == null) {
                C14710pd r2 = this.A07;
                C15900s5 r1 = this.A05;
                C220116h r5 = this.A0B;
                C219916f r9 = this.A0F;
                C220016g r6 = this.A0C;
                r0 = new C29461af(r1, r2, this.A09, this.A0A, r5, r6, this.A0D, this.A0E, r9, this.A0G);
                this.A03 = r0;
            }
        } else {
            r0 = this.A02;
            if (r0 == null) {
                C14710pd r22 = this.A07;
                C15900s5 r12 = this.A05;
                C220116h r52 = this.A0B;
                C219916f r92 = this.A0F;
                C220016g r62 = this.A0C;
                r0 = new C29471ag(r12, r22, this.A09, this.A0A, r52, r62, this.A0D, this.A0E, r92, this.A0G);
                this.A02 = r0;
            }
        }
        return r0;
    }

    public synchronized C29441ad A02() {
        C29441ad r2;
        r2 = this.A04;
        if (r2 == null) {
            r2 = new C29441ad(this.A06.A00, this.A08);
            this.A04 = r2;
        }
        return r2;
    }
}
