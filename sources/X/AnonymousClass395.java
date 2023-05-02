package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.395  reason: invalid class name */
public class AnonymousClass395 {
    public final /* synthetic */ C84714Lp A00;
    public final /* synthetic */ AnonymousClass1KA A01;

    public AnonymousClass395(C84714Lp r1, AnonymousClass1KA r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(int i2) {
        C84714Lp r2 = this.A00;
        AnonymousClass1KA r6 = r2.A00;
        r6.A00 = false;
        if (i2 == 404) {
            r6.A0B.A0F(r2.A01, false);
        }
        C18640x1 r4 = r6.A0B;
        UserJid userJid = r2.A01;
        r4.A0A(new AnonymousClass2GC(new AnonymousClass2GH((String) null, false), AnonymousClass000.A0u()), userJid, true);
        r6.A03.A09(new C71413kL(userJid));
    }

    public void A01(AnonymousClass2GC r7, AnonymousClass4O7 r8) {
        boolean z2;
        C84714Lp r3 = this.A00;
        AnonymousClass1KA r2 = r3.A00;
        r2.A00 = false;
        String str = r8.A05;
        if (str == null) {
            z2 = false;
        } else if (str.equals(r3.A02)) {
            z2 = true;
        } else {
            return;
        }
        C18640x1 r0 = r2.A0B;
        UserJid userJid = r3.A01;
        r0.A0A(r7, userJid, z2);
        boolean z3 = r3.A03;
        if (!z3 || !r7.A01.isEmpty()) {
            r2.A03.A09(new C71423kM(new AnonymousClass4K7(r7.A01, z3, false), userJid));
        } else {
            r2.A03.A09(new C71413kL(userJid));
        }
    }
}
