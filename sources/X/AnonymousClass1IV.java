package X;

import java.util.Map;

/* renamed from: X.1IV  reason: invalid class name */
public abstract class AnonymousClass1IV extends AnonymousClass1IW {
    public AnonymousClass4TZ A00;
    public final AnonymousClass1IT A01;

    public AnonymousClass1IV(AnonymousClass1IP r1, AnonymousClass1IT r2, C20210zg r3) {
        super(r1, r3);
        this.A01 = r2;
    }

    public final void A05(Map map) {
        C796140n r1 = C796140n.ERROR;
        if (map.get(r1.key) != null) {
            AnonymousClass4TZ r3 = this.A00;
            if (r3 != null) {
                Object obj = map.get("app_id");
                r3.A01((Map) map.get(r1.key), "onLoadingFailure", obj instanceof String ? (String) obj : null);
                return;
            }
            C18450wi.A0O("fcsLoadingEventManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public void A59(String str) {
        C18450wi.A0H(str, 0);
        super.A59(str);
        this.A00 = new AnonymousClass4TZ((C20180zd) this.A01.A00.A01.APJ.get(), str);
    }
}
