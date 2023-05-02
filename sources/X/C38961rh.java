package X;

import android.support.v4.view.GravityCompat;
import android.text.TextUtils;

/* renamed from: X.1rh  reason: invalid class name and case insensitive filesystem */
public class C38961rh extends C30581cc implements C16850tk, C16860tl, C30081bi {
    public int A00;
    public String A01;

    public C38961rh(C28381Vw r2, long j2) {
        super(r2, (byte) 32, j2);
    }

    public C38961rh(C28381Vw r8, C38961rh r9, long j2) {
        super(r8, r9, j2, true);
        this.A01 = r9.A01;
    }

    public void A5j(AnonymousClass21Q r6, AnonymousClass1GC r7) {
        C33221iE r4 = r6.A04;
        C58772u5 r0 = ((C33211iD) r4.A00).A0j;
        if (r0 == null) {
            r0 = C58772u5.A05;
        }
        C28581Wr A0U = r0.A0U();
        String A0I = A0I();
        A0U.A03();
        C58772u5 r1 = (C58772u5) A0U.A00;
        r1.A00 |= 2;
        r1.A03 = A0I;
        if (!TextUtils.isEmpty(this.A01)) {
            String str = this.A01;
            A0U.A03();
            C58772u5 r12 = (C58772u5) A0U.A00;
            r12.A00 |= 1;
            r12.A04 = str;
        }
        int i2 = this.A00;
        A0U.A03();
        C58772u5 r13 = (C58772u5) A0U.A00;
        r13.A00 |= 8;
        r13.A01 = i2;
        AnonymousClass21S A002 = r7.A00(r6.A05, this, r6.A0A, r6.A07);
        A0U.A03();
        C58772u5 r14 = (C58772u5) A0U.A00;
        r14.A02 = A002;
        r14.A00 |= 4;
        r4.A03();
        C33211iD r2 = (C33211iD) r4.A00;
        r2.A0j = (C58772u5) A0U.A02();
        r2.A00 |= GravityCompat.RELATIVE_LAYOUT_DIRECTION;
    }

    public /* bridge */ /* synthetic */ C16740tZ A6L(C28381Vw r2, long j2) {
        return A12(r2, j2);
    }
}
