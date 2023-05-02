package X;

import java.util.Map;

/* renamed from: X.4TZ  reason: invalid class name */
public final class AnonymousClass4TZ {
    public final C20180zd A00;
    public final String A01;

    public AnonymousClass4TZ(C20180zd r1, String str) {
        C18450wi.A0J(r1, str);
        this.A00 = r1;
        this.A01 = str;
    }

    public final void A00(C797241a r3, String str, String str2, Map map) {
        C18450wi.A0H(r3, 0);
        C18450wi.A0H(str2, 2);
        this.A00.A02(this.A01).A01(new C1036852i(r3, str2, str, map));
    }

    public final void A01(Map map, String str, String str2) {
        this.A00.A02(this.A01).A01(new C1207462v(map != null ? C61893Av.A01((Integer) map.get(C796140n.ERROR_CODE.key), C13690nt.A0e(C796140n.ERROR_MESSAGE.key, map), (Map) map.get(C796140n.ERROR_PARAMS.key)) : null, str, str2));
    }
}
