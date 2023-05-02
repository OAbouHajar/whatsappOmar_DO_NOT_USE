package X;

import java.util.Map;

/* renamed from: X.1IY  reason: invalid class name */
public final class AnonymousClass1IY extends AnonymousClass1IV implements C20240zj, AnonymousClass1IE, AnonymousClass1IS, AnonymousClass1IX {
    public String A00;
    public final C20220zh A01;
    public final C20230zi A02;
    public final C20170zc A03;
    public final /* synthetic */ AnonymousClass1IR A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1IY(AnonymousClass1IP r2, AnonymousClass1IT r3, AnonymousClass1IR r4, C20220zh r5, C20230zi r6, C20210zg r7, C20170zc r8) {
        super(r2, r3, r7);
        C18450wi.A0H(r2, 4);
        C18450wi.A0H(r7, 6);
        C18450wi.A0H(r3, 7);
        this.A03 = r8;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r1 = (java.util.Map) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A00(java.util.Map r8) {
        /*
            java.lang.String r0 = "fetch_channel"
            java.lang.Object r1 = r8.get(r0)
            if (r1 == 0) goto L_0x006b
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toUpperCase(r0)
            X.C18450wi.A0B(r0)
            X.429 r0 = X.AnonymousClass429.valueOf(r0)
            int r0 = r0.ordinal()
            r7 = 1
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0036;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x0025:
            java.lang.String r0 = "bloks_server_params"
            java.lang.Object r1 = r8.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0033
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0062
        L_0x0033:
            X.1Z8 r1 = X.AnonymousClass1Z8.A00
            return r1
        L_0x0036:
            r1 = 2
            java.lang.String r0 = "fetch_channel_params"
            java.lang.Object r0 = r8.get(r0)
            if (r0 == 0) goto L_0x0063
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r6 = "static_url"
            java.lang.Object r5 = r0.get(r6)
            X.1Jq[] r4 = new X.C25401Jq[r1]
            r3 = 0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r1 = "should_load_bloks_through_cdn"
            X.1Jq r0 = new X.1Jq
            r0.<init>(r1, r2)
            r4[r3] = r0
            X.1Jq r0 = new X.1Jq
            r0.<init>(r6, r5)
            r4[r7] = r0
            java.util.Map r1 = X.C25411Jr.A05(r4)
        L_0x0062:
            return r1
        L_0x0063:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x006b:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IY.A00(java.util.Map):java.util.Map");
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
