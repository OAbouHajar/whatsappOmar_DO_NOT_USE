package X;

import com.facebook.redex.IDxPCallbackShape34S0300000_2_I0;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0x8  reason: invalid class name and case insensitive filesystem */
public class C18710x8 {
    public final C17150uc A00;

    public C18710x8(C17150uc r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass26L r3, C35611mD r4, UserJid userJid) {
        if (r4 == null || !r4.A0K) {
            r3.A03();
            return;
        }
        String str = r4.A09;
        if (str != null) {
            this.A00.A07(userJid, str);
        }
        this.A00.A07.A02(r3, userJid, false);
    }

    public void A01(AnonymousClass26L r4, UserJid userJid) {
        C17150uc r2 = this.A00;
        AnonymousClass16N r1 = r2.A07;
        if (r1.A01(userJid) == null || r1.A06(userJid)) {
            r2.A03(new IDxPCallbackShape34S0300000_2_I0(this, r4, userJid, 0), userJid);
        } else {
            r4.A03();
        }
    }
}
