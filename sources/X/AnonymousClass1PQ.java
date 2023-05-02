package X;

import com.facebook.redex.IDxPCallbackShape34S0300000_2_I0;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1PQ  reason: invalid class name */
public class AnonymousClass1PQ {
    public final C17150uc A00;
    public final C14710pd A01;

    public AnonymousClass1PQ(C17150uc r1, C14710pd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(C108545Ok r4, UserJid userJid) {
        C14710pd r2 = this.A01;
        C16620tM r1 = C16620tM.A02;
        if (r2.A0E(r1, 1678) && r2.A0E(r1, 1096)) {
            C17150uc r22 = this.A00;
            if (r22.A09()) {
                r22.A03(new IDxPCallbackShape34S0300000_2_I0(this, userJid, r4, 1), userJid);
            }
        }
    }
}
