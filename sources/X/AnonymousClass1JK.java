package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1JK  reason: invalid class name */
public final class AnonymousClass1JK extends AnonymousClass1IC implements AnonymousClass1IE, AnonymousClass1IG {
    public AnonymousClass39C A00;
    public String A01;
    public final C16980tz A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1JK(C16980tz r2, C20210zg r3) {
        super(r3);
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
        this.A02 = r2;
    }

    public void A59(String str) {
        C18450wi.A0H(str, 0);
        this.A01 = str;
    }

    public void A93(Map map) {
        AnonymousClass39C r1 = this.A00;
        if (r1 == null) {
            Log.e("native_upi_add_payment_method/finish: callback is null");
            return;
        }
        r1.A01(map);
        this.A00 = null;
    }
}
