package X;

/* renamed from: X.1cL  reason: invalid class name and case insensitive filesystem */
public final class C30431cL extends C28581Wr implements C28561Wp {
    public C30431cL() {
        super(C30441cM.A0l);
    }

    public void A05() {
        A03();
        C30441cM r1 = (C30441cM) this.A00;
        r1.A01 &= -17;
        r1.A0Y = C30441cM.A0l.A0Y;
    }

    public void A06(long j2) {
        A03();
        C30441cM r1 = (C30441cM) this.A00;
        r1.A01 |= 4;
        r1.A0A = j2;
    }

    public void A07(C442723l r3) {
        A03();
        C30441cM r1 = (C30441cM) this.A00;
        r1.A01 |= 16384;
        r1.A06 = r3.value;
    }

    public void A08(String str) {
        A03();
        C30441cM r2 = (C30441cM) this.A00;
        AnonymousClass1XE r1 = r2.A0G;
        if (!((AnonymousClass1XF) r1).A00) {
            r1 = C28541Wm.A0G(r1);
            r2.A0G = r1;
        }
        r1.add(str);
    }

    public void A09(String str) {
        A03();
        C30441cM r1 = (C30441cM) this.A00;
        r1.A01 |= 16;
        r1.A0Y = str;
    }
}
