package X;

import com.facebook.redex.IDxRCallbackShape229S0100000_1_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0wn  reason: invalid class name and case insensitive filesystem */
public class C18500wn {
    public final C16300so A00;
    public final C17190ug A01;
    public final AnonymousClass01D A02;

    public C18500wn(C16300so r1, C17190ug r2, AnonymousClass01D r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00() {
        Log.i("BroadcastXmppMethods/sendGetBroadcastLists");
        C17190ug r5 = this.A01;
        String A022 = r5.A02();
        r5.A0A(new IDxRCallbackShape229S0100000_1_I0(this, 0), new C28371Vv(new C28371Vv("lists", (C35081lL[]) null), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:b"), new C35081lL("type", "get"), new C35081lL((Jid) C34791ks.A00, "to")}), A022, 59, 32000);
    }
}
