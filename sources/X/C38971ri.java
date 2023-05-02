package X;

/* renamed from: X.1ri  reason: invalid class name and case insensitive filesystem */
public class C38971ri extends C16740tZ implements C30081bi {
    public int A00;

    public C38971ri(C28381Vw r2, long j2) {
        super(r2, (byte) 36, j2);
    }

    public void A0S(int i2) {
        if (i2 != 512) {
            super.A0S(i2);
        }
    }

    public void A5j(AnonymousClass21Q r6, AnonymousClass1GC r7) {
        C33221iE r4 = r6.A04;
        C53002eo r0 = ((C33211iD) r4.A00).A0b;
        if (r0 == null) {
            r0 = C53002eo.A0F;
        }
        C69613fK r3 = (C69613fK) r0.A0U();
        C33231iF r02 = ((C53002eo) r3.A00).A0E;
        if (r02 == null) {
            r02 = C33231iF.A05;
        }
        C33241iG r2 = (C33241iG) r02.A0U();
        C28381Vw r1 = this.A11;
        r2.A07(C16030sJ.A03(r1.A00));
        r2.A08(r1.A02);
        r3.A06(r2);
        int i2 = this.A00;
        r3.A03();
        C53002eo r12 = (C53002eo) r3.A00;
        r12.A00 |= 4;
        r12.A01 = i2;
        r3.A05(AnonymousClass43A.A04);
        r4.A09(r3);
    }
}
