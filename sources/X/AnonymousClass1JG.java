package X;

import java.util.Map;

/* renamed from: X.1JG  reason: invalid class name */
public final class AnonymousClass1JG extends AnonymousClass1IV implements C20240zj, AnonymousClass1IE, AnonymousClass1IS, AnonymousClass1IX {
    public String A00;
    public final C20220zh A01;
    public final C20230zi A02;
    public final C20170zc A03;
    public final /* synthetic */ AnonymousClass1IR A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1JG(AnonymousClass1IP r2, AnonymousClass1IT r3, AnonymousClass1IR r4, C20220zh r5, C20230zi r6, C20210zg r7, C20170zc r8) {
        super(r2, r3, r7);
        C18450wi.A0H(r2, 4);
        C18450wi.A0H(r7, 6);
        C18450wi.A0H(r3, 7);
        this.A03 = r8;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r4;
    }

    public static final Map A00(Map map) {
        C25401Jq[] r3 = new C25401Jq[2];
        r3[0] = new C25401Jq("should_load_bloks_through_cdn", Boolean.TRUE);
        Object obj = map.get("static_url");
        if (obj != null) {
            r3[1] = new C25401Jq("static_url", obj);
            return C25411Jr.A05(r3);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public boolean A4S(String str) {
        return this.A04.A4S(str);
    }

    public void A5f() {
        this.A02.A5f();
    }

    public void A93(Map map) {
        this.A01.A01(map);
    }

    public AnonymousClass01A ADp(String str, String str2, Map map, Map map2, int i2) {
        return this.A02.ADp(str, str2, map, map2, i2);
    }

    public void AHH(String str, String str2) {
        this.A04.AHH(str, str2);
    }

    public void AHI(String str, Map map) {
        this.A04.AHI(str, map);
    }

    public void AZt(String str, String str2, String str3, String str4, String str5, Map map, Map map2, int i2) {
        this.A02.AZt(str, str2, str3, str4, str5, map, map2, i2);
    }

    public void Aa0(AnonymousClass41K r11, String str, String str2, String str3, String str4, String str5, Map map, Map map2, int i2) {
        this.A02.Aa0(r11, str, str2, str3, str4, str5, map, map2, i2);
    }

    public void Aak(AnonymousClass4Ro r4, Map map, int i2) {
        C18450wi.A0H(map, 0);
        C20170zc r2 = this.A03;
        Object obj = map.get("app_id");
        if (obj != null) {
            r2.A02(r4, (String) obj, A00(map), i2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
