package X;

import com.facebook.redex.IDxCEventShape0S1301000_2_I1;
import com.facebook.redex.IDxCEventShape180S0100000_2_I1;
import java.util.Map;

/* renamed from: X.39U  reason: invalid class name */
public final class AnonymousClass39U {
    public final C20240zj A00;
    public final C52372dh A01;
    public final String A02;

    public AnonymousClass39U(C20240zj r2, C20180zd r3, String str) {
        C18450wi.A0H(r3, 1);
        this.A02 = str;
        this.A00 = r2;
        this.A01 = r3.A02(str);
    }

    public final void A00(AnonymousClass01A r3, String str) {
        this.A01.A01(new C1207062r(r3, str));
    }

    public final void A01(AnonymousClass38L r21, String str, Map map, Map map2, int i2, boolean z2) {
        Class<C1206262j> cls = C1206262j.class;
        Map map3 = map;
        Object obj = map3.get("app_id");
        if (obj != null) {
            this.A01.A01(new C1036652g((String) obj));
        }
        AnonymousClass38L r0 = r21;
        String str2 = str;
        Map map4 = map2;
        int i3 = i2;
        if (r0.A02 == AnonymousClass41L.MODAL) {
            if (!z2) {
                C52372dh r2 = this.A01;
                r2.A00(new IDxCEventShape0S1301000_2_I1(this, str2, map3, map4, i3, 1), cls, this);
                r2.A00(new IDxCEventShape180S0100000_2_I1(this, 2), C1206162i.class, this);
                this.A00.Aa0(r0.A01, r0.A04, r0.A00, r0.A03.name(), str2, this.A02, map3, map4, i3);
                r2.A01(new C1036552f());
                return;
            }
        } else if (!z2) {
            this.A01.A00(new IDxCEventShape0S1301000_2_I1(this, str2, map3, map4, i3, 0), cls, this);
            this.A00.AZt(r0.A04, r0.A00, r0.A03.name(), str2, this.A02, map3, map4, i3);
            return;
        }
        A00(this.A00.ADp(str2, this.A02, map3, map4, i3), str2);
        this.A01.A01(new C1207162s(r0.A04, r0.A03.name()));
    }
}
