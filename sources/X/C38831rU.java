package X;

/* renamed from: X.1rU  reason: invalid class name and case insensitive filesystem */
public abstract class C38831rU extends C16740tZ implements C16850tk, C30081bi {
    public long A00;
    public String A01;

    public C38831rU(C28381Vw r3, byte b2, int i2, long j2) {
        super(r3, b2, j2);
        this.A01 = i2;
        this.A00 = j2;
        synchronized (this.A12) {
            this.A02 = 0;
        }
    }

    public C38831rU(C28381Vw r9, C38831rU r10, long j2) {
        super(r10, r9, j2, true);
        this.A01 = r10.A01;
        this.A00 = r10.A00;
    }

    public void A12(C33241iG r3) {
        C28381Vw r1 = this.A11;
        r3.A07(C16030sJ.A03(r1.A00));
        r3.A08(r1.A02);
        String str = this.A01;
        if (str == null) {
            str = r1.A01;
        }
        r3.A05(str);
    }

    public void A5j(AnonymousClass21Q r4, AnonymousClass1GC r5) {
        C33221iE r2 = r4.A04;
        C53002eo r0 = ((C33211iD) r2.A00).A0b;
        if (r0 == null) {
            r0 = C53002eo.A0F;
        }
        C69613fK r1 = (C69613fK) r0.A0U();
        C33231iF r02 = ((C53002eo) r1.A00).A0E;
        if (r02 == null) {
            r02 = C33231iF.A05;
        }
        C33241iG r03 = (C33241iG) r02.A0U();
        A12(r03);
        r1.A06(r03);
        r1.A05(AnonymousClass43A.A0C);
        r2.A09(r1);
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r5) {
        if (this instanceof C38821rT) {
            return new C38821rT(r5, this, this.A0I);
        }
        C39161s1 r3 = (C39161s1) this;
        return new C39161s1(r5, r3, r3.A0I);
    }
}
