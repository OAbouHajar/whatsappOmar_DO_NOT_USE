package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5n5  reason: invalid class name and case insensitive filesystem */
public class C114075n5 extends C110685ef {
    public final C16000sG A00;
    public final AnonymousClass013 A01;
    public final C221116r A02;
    public final C218315p A03;

    public C114075n5(C15900s5 r9, C16000sG r10, C16440t3 r11, AnonymousClass013 r12, C16460t6 r13, C221116r r14, C14710pd r15, C1222969a r16, C218315p r17, C222617g r18) {
        super(r9, r11, r13, r15, r16, r18);
        this.A02 = r14;
        this.A03 = r17;
        this.A00 = r10;
        this.A01 = r12;
    }

    public String A07(String str, String str2) {
        AnonymousClass00B.A06(str);
        return super.A07(str, str2);
    }

    public void A0A(String str) {
        String str2;
        super.A0A(str);
        AnonymousClass1Vt A0M = this.A02.A0M((String) null, str);
        if (A0M != null) {
            C116785rw r6 = new C116785rw(5);
            UserJid userJid = A0M.A0D;
            if (userJid == null || (str2 = this.A00.A0A(userJid).A0B()) == null) {
                str2 = "";
            }
            r6.A00 = new C117275sj(str2, C218315p.A07(this.A01, A0M.A00(), A0M.A08, true), this.A03.A0K(A0M), C218315p.A01(A0M));
            this.A01.A09(r6);
            C117275sj r3 = r6.A00;
            AnonymousClass2St r2 = this.A06;
            r2.A01("transaction_status", AnonymousClass1W1.A04(A0M.A03, A0M.A02));
            r2.A01("transaction_status_name", r3.A03);
            r2.A01("merchant_name", r3.A01);
        }
    }
}
