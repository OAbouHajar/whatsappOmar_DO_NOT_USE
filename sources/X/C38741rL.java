package X;

import android.text.TextUtils;

/* renamed from: X.1rL  reason: invalid class name and case insensitive filesystem */
public class C38741rL extends C16740tZ implements C16850tk, C16860tl, C30081bi {
    public String A00;
    public String A01;
    public C39691su A02;

    public C38741rL(C28381Vw r2, long j2) {
        super(r2, (byte) 4, j2);
        this.A02 = 0;
    }

    public C38741rL(C28381Vw r8, C38741rL r9, long j2, boolean z2) {
        super(r9, r8, j2, z2);
        this.A02 = 0;
        this.A00 = r9.A00;
        this.A01 = r9.A12();
    }

    public void A0k(String str) {
        synchronized (this.A12) {
            super.A0k(str);
            this.A01 = str;
        }
    }

    public String A12() {
        String str;
        synchronized (this.A12) {
            str = this.A01;
        }
        return str;
    }

    public void A13(String str) {
        synchronized (this.A12) {
            this.A01 = str;
            this.A02 = null;
            super.A0k(str);
        }
    }

    public void A5j(AnonymousClass21Q r6, AnonymousClass1GC r7) {
        C33221iE r4 = r6.A04;
        C58592tk r0 = ((C33211iD) r4.A00).A08;
        if (r0 == null) {
            r0 = C58592tk.A04;
        }
        C28581Wr A0U = r0.A0U();
        if (!TextUtils.isEmpty(this.A00)) {
            String str = this.A00;
            A0U.A03();
            C58592tk r1 = (C58592tk) A0U.A00;
            r1.A00 |= 1;
            r1.A02 = str;
        }
        String A12 = A12();
        if (!TextUtils.isEmpty(A12)) {
            A0U.A03();
            C58592tk r12 = (C58592tk) A0U.A00;
            r12.A00 |= 2;
            r12.A03 = A12;
        }
        AnonymousClass1WV r2 = r6.A05;
        byte[] bArr = r6.A0A;
        if (C41071vB.A0O(r2, this, bArr)) {
            AnonymousClass21S A002 = r7.A00(r2, this, bArr, r6.A07);
            A0U.A03();
            C58592tk r13 = (C58592tk) A0U.A00;
            r13.A01 = A002;
            r13.A00 |= 4;
        }
        r4.A03();
        C33211iD r14 = (C33211iD) r4.A00;
        r14.A08 = (C58592tk) A0U.A02();
        r14.A00 |= 8;
    }

    public /* bridge */ /* synthetic */ C16740tZ A6L(C28381Vw r7, long j2) {
        return new C38741rL(r7, this, j2, false);
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r7) {
        return new C38741rL(r7, this, this.A0I, true);
    }
}
