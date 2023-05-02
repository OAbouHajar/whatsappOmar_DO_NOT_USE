package X;

/* renamed from: X.4pr  reason: invalid class name and case insensitive filesystem */
public final class C97354pr implements C109525Sm {
    public boolean A00;
    public final C109525Sm A01;
    public final /* synthetic */ AnonymousClass3E1 A02;

    public C97354pr(AnonymousClass3E1 r1, C109525Sm r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public boolean AJY() {
        return !this.A02.A00() && this.A01.AJY();
    }

    public void ALU() {
        this.A01.ALU();
    }

    public int AbT(AnonymousClass4G5 r11, AnonymousClass3UX r12, boolean z2) {
        AnonymousClass3E1 r1 = this.A02;
        if (r1.A00()) {
            return -3;
        }
        if (this.A00) {
            r12.flags = 4;
            return -4;
        }
        int AbT = this.A01.AbT(r11, r12, z2);
        if (AbT == -5) {
            C32491gT r5 = r11.A00;
            int i2 = r5.A07;
            if (!(i2 == 0 && r5.A08 == 0)) {
                int i3 = 0;
                if (r1.A00 == Long.MIN_VALUE) {
                    i3 = r5.A08;
                }
                C32471gR r13 = new C32471gR(r5);
                r13.A05 = i2;
                r13.A06 = i3;
                r11.A00 = new C32491gT(r13);
            }
            return -5;
        }
        long j2 = r1.A00;
        if (j2 == Long.MIN_VALUE || (AbT != -4 ? !(AbT == -3 && r1.AAG() == Long.MIN_VALUE && !r12.A03) : r12.A00 < j2)) {
            return AbT;
        }
        r12.clear();
        r12.flags = 4;
        this.A00 = true;
        return -4;
    }

    public int Afw(long j2) {
        if (this.A02.A00()) {
            return -3;
        }
        return this.A01.Afw(j2);
    }
}
