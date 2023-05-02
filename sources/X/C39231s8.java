package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1s8  reason: invalid class name and case insensitive filesystem */
public final class C39231s8 extends C16740tZ implements C30081bi, C39131ry {
    public int A00;
    public long A01;
    public DeviceJid A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39231s8(C28381Vw r2, long j2) {
        super(r2, (byte) 77, j2);
        C18450wi.A0H(r2, 1);
    }

    public void A0S(int i2) {
        if (i2 != 512) {
            super.A0S(i2);
        }
    }

    public void A5j(AnonymousClass21Q r7, AnonymousClass1GC r8) {
        C18450wi.A0H(r7, 1);
        C33221iE r5 = r7.A04;
        C53002eo r0 = ((C33211iD) r5.A00).A0b;
        if (r0 == null) {
            r0 = C53002eo.A0F;
        }
        C69613fK r4 = (C69613fK) r0.A0U();
        C33231iF r02 = ((C53002eo) r4.A00).A0E;
        if (r02 == null) {
            r02 = C33231iF.A05;
        }
        C33241iG r2 = (C33241iG) r02.A0U();
        C28381Vw r1 = this.A11;
        r2.A07(C16030sJ.A03(r1.A00));
        r2.A08(r1.A02);
        r4.A06(r2);
        int i2 = this.A00;
        r4.A03();
        C53002eo r12 = (C53002eo) r4.A00;
        r12.A00 |= 4;
        r12.A01 = i2;
        long j2 = this.A01;
        r4.A03();
        C53002eo r13 = (C53002eo) r4.A00;
        r13.A00 |= 8;
        r13.A03 = j2;
        r4.A05(AnonymousClass43A.A05);
        r5.A09(r4);
    }
}
