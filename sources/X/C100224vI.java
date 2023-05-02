package X;

import com.facebook.redex.IDxCHandlerShape102S0200000_2_I1;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;

/* renamed from: X.4vI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100224vI implements AnonymousClass23B {
    public final /* synthetic */ AnonymousClass4H0 A00;
    public final /* synthetic */ AnonymousClass4D7 A01;
    public final /* synthetic */ UserJid A02;

    public /* synthetic */ C100224vI(AnonymousClass4H0 r1, AnonymousClass4D7 r2, UserJid userJid) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = userJid;
    }

    public final void ANn(C35611mD r11) {
        AnonymousClass4D7 r1 = this.A01;
        UserJid userJid = this.A02;
        if (r11 != null && r11.A0K) {
            C57242qY r3 = r1.A00;
            HashSet A0o = C13680ns.A0o();
            String str = r3.A0F.A00;
            AnonymousClass1KA r2 = r3.A0G;
            int i2 = r3.A03;
            r2.A02(new IDxCHandlerShape102S0200000_2_I1(r3, 0, userJid), new C86124Rh(userJid, str, A0o, i2, i2));
        }
    }
}
