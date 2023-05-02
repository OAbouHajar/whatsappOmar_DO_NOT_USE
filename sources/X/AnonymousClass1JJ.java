package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1JJ  reason: invalid class name */
public final class AnonymousClass1JJ extends AnonymousClass1IC implements AnonymousClass1IE, AnonymousClass1IG {
    public AnonymousClass39C A00;
    public String A01;
    public final C16980tz A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1JJ(C16980tz r2, C20210zg r3) {
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
        String str;
        String str2;
        String str3;
        AnonymousClass39C r4 = this.A00;
        if (r4 == null) {
            Log.e("native_upi_consumer_onboarding/finish: callback is null");
            return;
        }
        if (map == null) {
            str = C796140n.ERROR.key;
            str2 = C796140n.ERROR_NAME.key;
            str3 = "null_result";
        } else if (C18450wi.A0R(map.get("onboarding_status"), "success")) {
            r4.A01(map);
            this.A00 = null;
        } else {
            str = C796140n.ERROR.key;
            str2 = C796140n.ERROR_NAME.key;
            str3 = "onboarding_cancelled";
        }
        r4.A00(C25421Js.A09(new C25401Jq(str, C25421Js.A09(new C25401Jq(str2, str3)))));
        this.A00 = null;
    }
}
