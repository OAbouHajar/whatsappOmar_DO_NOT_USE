package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1JH  reason: invalid class name */
public final class AnonymousClass1JH extends AnonymousClass1IC implements AnonymousClass1IE, AnonymousClass1IG {
    public AnonymousClass39C A00;
    public String A01;
    public final C20180zd A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1JH(C20210zg r2, C20180zd r3) {
        super(r2);
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A02 = r3;
    }

    public void A59(String str) {
        C18450wi.A0H(str, 0);
        this.A01 = str;
    }

    public void A93(Map map) {
        Object obj = map == null ? null : map.get("account_compliance_status");
        Object obj2 = map == null ? null : map.get("last_screen");
        if (obj != null) {
            AnonymousClass39C r3 = this.A00;
            if (r3 == null) {
                C18450wi.A0O("resourceResultCallback");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                r3.A01(C25411Jr.A05(new C25401Jq("account_compliance_status", obj), new C25401Jq("last_screen", obj2)));
            }
        } else {
            Log.e("NativeP2mLiteDoComplianceResource/finish: resultComplianceStatus can't be null");
            AnonymousClass39C r0 = this.A00;
            if (r0 == null) {
                C18450wi.A0O("resourceResultCallback");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                r0.A00((Map) null);
            }
        }
    }
}
