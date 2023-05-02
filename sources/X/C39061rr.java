package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1rr  reason: invalid class name and case insensitive filesystem */
public class C39061rr extends C16740tZ implements C16850tk, C39071rs, C30081bi {
    public int A00;
    public long A01;

    public C39061rr(C28381Vw r2, long j2) {
        super(r2, (byte) 51, j2);
    }

    public C39061rr(C28381Vw r9, C39061rr r10, long j2) {
        super(r10, r9, j2, true);
        this.A00 = r10.A00;
        this.A01 = r10.A01;
    }

    public C39061rr(C58452tW r5, C28381Vw r6, long j2) {
        super(r6, (byte) 51, j2);
        AnonymousClass432 A002 = AnonymousClass432.A00(r5.A01);
        this.A00 = (A002 == null ? AnonymousClass432.A03 : A002).value;
        if ((r5.A00 & 2) == 2) {
            this.A01 = r5.A02 * 1000;
        }
    }

    public void A5j(AnonymousClass21Q r9, AnonymousClass1GC r10) {
        C33221iE r7 = r9.A04;
        C58452tW r0 = ((C33211iD) r7.A00).A0W;
        if (r0 == null) {
            r0 = C58452tW.A03;
        }
        C28581Wr A0U = r0.A0U();
        AnonymousClass432 A002 = AnonymousClass432.A00(this.A00);
        A0U.A03();
        C58452tW r1 = (C58452tW) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = A002.value;
        long j2 = this.A01;
        if (j2 > 0) {
            A0U.A03();
            C58452tW r12 = (C58452tW) A0U.A00;
            r12.A00 |= 2;
            r12.A02 = j2 / 1000;
        }
        r7.A03();
        C33211iD r13 = (C33211iD) r7.A00;
        r13.A0W = (C58452tW) A0U.A02();
        r13.A01 |= 4;
    }

    public C16740tZ A6M(C28381Vw r4) {
        return new C39061rr(r4, this, this.A0I);
    }

    public List AGD() {
        C35081lL[] r3 = new C35081lL[2];
        r3[0] = new C35081lL("type", "invite");
        int i2 = this.A00;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : "UPI" : "NOVI" : "FBPAY";
        AnonymousClass00B.A06(str);
        r3[1] = new C35081lL("service", str);
        return Collections.singletonList(new C28371Vv("pay", r3));
    }
}
