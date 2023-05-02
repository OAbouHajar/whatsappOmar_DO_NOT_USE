package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.1JI  reason: invalid class name */
public final class AnonymousClass1JI extends AnonymousClass1IC implements AnonymousClass1IE, AnonymousClass1IG {
    public AnonymousClass39C A00;
    public String A01;
    public final C20180zd A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1JI(C20210zg r2, C20180zd r3) {
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
        Object obj = map == null ? null : map.get("result_code");
        if (obj != null) {
            AnonymousClass39C r3 = this.A00;
            if (r3 == null) {
                C18450wi.A0O("resourceResultCallback");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                r3.A01(C25421Js.A09(new C25401Jq("result", obj.equals(-1) ? "SUCCESS" : "DISMISSED")));
            }
        } else {
            Log.e("NativeP2mLiteHppCheckoutResource/finish: resultCode can't be null");
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
