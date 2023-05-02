package X;

import com.facebook.redex.IDxCEventShape179S0100000_2_I0;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0zh  reason: invalid class name and case insensitive filesystem */
public final class C20220zh {
    public AnonymousClass39C A00;
    public final C20190ze A01;
    public final C20200zf A02;
    public final C20210zg A03;
    public final C20180zd A04;

    public C20220zh(C20190ze r2, C20200zf r3, C20210zg r4, C20180zd r5) {
        C18450wi.A0H(r5, 1);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r4, 4);
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static /* synthetic */ void A00(C20220zh r8, C1206762o r9) {
        int i2;
        String str;
        Long l2;
        C18450wi.A0H(r9, 1);
        Map map = r9.A00;
        String str2 = (String) map.get("event");
        String str3 = (String) map.get("size");
        String str4 = (String) map.get("fdsInstanceKey");
        if (str4 != null && str2 != null) {
            switch (str2.hashCode()) {
                case -1161549703:
                    if (str2.equals("startPrefetch")) {
                        C20200zf r3 = r8.A02;
                        r3.A00(Integer.parseInt(str4), "prefetchPerfTracker");
                        r3.A02.A03(Integer.parseInt(str4), "start");
                        int parseInt = Integer.parseInt(str4);
                        Object obj = map.get("app_id");
                        if (obj != null) {
                            r3.A02(parseInt, "app_id", (String) obj);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    return;
                case -1145605794:
                    if (str2.equals("bloksCacheHit")) {
                        i2 = Integer.parseInt(str4);
                        C18450wi.A0F(str3);
                        l2 = Long.valueOf(Long.parseLong(str3));
                        str = "blok_cache_size";
                        break;
                    } else {
                        return;
                    }
                case -55045288:
                    if (str2.equals("prefetchResponse")) {
                        C20200zf r4 = r8.A02;
                        int parseInt2 = Integer.parseInt(str4);
                        C31081dR r32 = r4.A02;
                        r32.A03(parseInt2, "prefetchResponse");
                        if (map.get("error_code") != null) {
                            int parseInt3 = Integer.parseInt(str4);
                            Object obj2 = map.get("error_code");
                            if (obj2 != null) {
                                r4.A02(parseInt3, "error_code", (String) obj2);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                        r32.A05(Integer.parseInt(str4), 467);
                        return;
                    }
                    return;
                case 332886870:
                    if (str2.equals("openScreen")) {
                        r8.A03.A02.A03(Integer.parseInt(str4), str2);
                        return;
                    }
                    return;
                case 1415672482:
                    if (str2.equals("bloksPayloadResponse")) {
                        i2 = Integer.parseInt(str4);
                        C18450wi.A0F(str3);
                        l2 = Long.valueOf(Long.parseLong(str3));
                        str = "blok_payload_size";
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            C20210zg r2 = r8.A03;
            r2.A02.A03(i2, str2);
            r2.A01(i2, str, l2.longValue());
        }
    }

    public final void A01(Map map) {
        this.A04.A00().A02(C1206762o.class, this);
        AnonymousClass39C r2 = this.A00;
        if (r2 == null) {
            return;
        }
        if (map == null || !C18450wi.A0R(map.get(C796140n.SUCCESS_FLAG.key), "false")) {
            Log.w("Finishing Bloks resource with success");
            r2.A01(map);
            return;
        }
        Log.w("Finishing Bloks resource with failure");
        r2.A00(map);
    }

    public final boolean A02(AnonymousClass39C r8, String str, Map map, C25401Jq r11, int i2) {
        this.A00 = r8;
        if (map.get("app_id") == null) {
            Log.w("No parameters or no app_id");
            r8.A00((Map) null);
            return false;
        }
        this.A04.A00().A00(new IDxCEventShape179S0100000_2_I0(this, 0), C1206762o.class, this);
        Object obj = map.get("app_id");
        if (obj != null) {
            String str2 = (String) obj;
            C18450wi.A0F(str2);
            C20210zg r1 = this.A03;
            r1.A02.A03(i2, "requestBloksScreen");
            if (str2 != null) {
                r1.A02(i2, "app_id", str2);
            }
            Object obj2 = map.get("data");
            if (obj2 != null) {
                if (obj2 instanceof Map) {
                    Map map2 = (Map) obj2;
                    Object obj3 = map.get(C796040m.ADDITIONAL_PARAMS.key);
                    if (obj3 != null) {
                        Map map3 = (Map) obj3;
                        C18450wi.A0H(map2, 0);
                        C18450wi.A0H(map3, 1);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.putAll(map3);
                        obj2 = linkedHashMap;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    }
                }
                C20190ze r6 = this.A01;
                r6.Aay(AnonymousClass225.DATA, (String) r11.first, (String) r11.second, (Map) obj2);
                r6.Aay(AnonymousClass225.CONTEXT, (String) r11.first, (String) r11.second, C25421Js.A09(new C25401Jq("job_id", str)));
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
