package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1JL  reason: invalid class name */
public final class AnonymousClass1JL extends AnonymousClass1IC implements AnonymousClass1IE, AnonymousClass1IG {
    public AnonymousClass39C A00;
    public String A01;
    public final C14870pt A02;
    public final C16980tz A03;
    public final C18290wS A04;
    public final C16320sq A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1JL(C14870pt r2, C16980tz r3, C18290wS r4, C20210zg r5, C16320sq r6) {
        super(r5);
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        C18450wi.A0H(r6, 3);
        C18450wi.A0H(r4, 4);
        C18450wi.A0H(r5, 5);
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r6;
        this.A04 = r4;
    }

    public void A59(String str) {
        C18450wi.A0H(str, 0);
        this.A01 = str;
    }

    public void A93(Map map) {
        AnonymousClass39C r1 = this.A00;
        if (r1 == null) {
            Log.e("FcsNativeFlowNpciCommonLibraryResource/finish: callback is null");
            return;
        }
        r1.A01(map);
        this.A00 = null;
    }
}
