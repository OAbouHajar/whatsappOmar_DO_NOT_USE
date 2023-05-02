package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1bh  reason: invalid class name and case insensitive filesystem */
public class C30071bh extends C16740tZ implements C16850tk, C30081bi {
    public int A00;
    public long A01;
    public C16050sL A02;
    public UserJid A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;

    public C30071bh(C28381Vw r2, long j2) {
        super(r2, (byte) 24, j2);
    }

    public C30071bh(C28381Vw r9, C30071bh r10, long j2) {
        super(r10, r9, j2, true);
        this.A03 = r10.A03;
        this.A02 = r10.A02;
        this.A05 = r10.A05;
        this.A01 = r10.A01;
        this.A06 = r10.A06;
        this.A07 = r10.A07;
        this.A00 = r10.A00;
        this.A04 = r10.A04;
    }

    public void A5j(AnonymousClass21Q r7, AnonymousClass1GC r8) {
        C33221iE r4 = r7.A04;
        C58902uL r0 = ((C33211iD) r4.A00).A0L;
        if (r0 == null) {
            r0 = C58902uL.A09;
        }
        C28581Wr A0U = r0.A0U();
        if (this.A02 != null) {
            String str = this.A06;
            if (str != null) {
                A0U.A03();
                C58902uL r1 = (C58902uL) A0U.A00;
                r1.A00 |= 2;
                r1.A08 = str;
            } else {
                Log.e("FMessageGroupInvite/buildE2eMessage missing invite hash");
            }
            long j2 = (!r7.A09 || !this.A07) ? this.A01 : 0;
            A0U.A03();
            C58902uL r5 = (C58902uL) A0U.A00;
            r5.A00 |= 4;
            r5.A02 = j2;
            String str2 = this.A05;
            if (str2 != null) {
                A0U.A03();
                C58902uL r12 = (C58902uL) A0U.A00;
                r12.A00 |= 8;
                r12.A07 = str2;
            }
            String rawString = this.A02.getRawString();
            A0U.A03();
            C58902uL r13 = (C58902uL) A0U.A00;
            r13.A00 |= 1;
            r13.A06 = rawString;
            if (!TextUtils.isEmpty(this.A04)) {
                String str3 = this.A04;
                A0U.A03();
                C58902uL r14 = (C58902uL) A0U.A00;
                r14.A00 |= 32;
                r14.A05 = str3;
            }
            C16870tm A0F = A0F();
            if (!(A0F == null || A0F.A07() == null)) {
                byte[] A072 = A0F.A07();
                C28631Ww A012 = C28631Ww.A01(A072, 0, A072.length);
                A0U.A03();
                C58902uL r15 = (C58902uL) A0U.A00;
                r15.A00 |= 16;
                r15.A03 = A012;
            }
            AnonymousClass1WV r2 = r7.A05;
            byte[] bArr = r7.A0A;
            if (C41071vB.A0O(r2, this, bArr)) {
                AnonymousClass21S A002 = r8.A00(r2, this, bArr, r7.A07);
                A0U.A03();
                C58902uL r16 = (C58902uL) A0U.A00;
                r16.A04 = A002;
                r16.A00 |= 64;
            }
            r4.A03();
            C33211iD r22 = (C33211iD) r4.A00;
            r22.A0L = (C58902uL) A0U.A02();
            r22.A00 |= 4194304;
            return;
        }
        Log.w("FMessageGroupInvite/buildE2eMessage failed to build e2e message");
    }

    public C16740tZ A6M(C28381Vw r4) {
        return new C30071bh(r4, this, this.A0I);
    }
}
