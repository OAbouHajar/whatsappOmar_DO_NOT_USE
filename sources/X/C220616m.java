package X;

import com.facebook.redex.IDxRCallbackShape231S0100000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.16m  reason: invalid class name and case insensitive filesystem */
public class C220616m {
    public final AnonymousClass027 A00;
    public final C14870pt A01;
    public final C18260wP A02;
    public final C16440t3 A03;
    public final C18600wx A04;
    public final C16490t9 A05;
    public final C17190ug A06;

    public C220616m(C14870pt r2, C18260wP r3, C16440t3 r4, C18600wx r5, C16490t9 r6, C17190ug r7) {
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r5.A00;
    }

    public void A00() {
        Log.i("DisappearingModeManager/getDisappearingModeSetting");
        C17190ug r4 = this.A06;
        String A022 = r4.A02();
        r4.A0G(new IDxRCallbackShape231S0100000_2_I0(this, 0), new C28371Vv("iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("xmlns", "disappearing_mode"), new C35081lL("type", "get")}), A022, 296, 20000);
    }
}
