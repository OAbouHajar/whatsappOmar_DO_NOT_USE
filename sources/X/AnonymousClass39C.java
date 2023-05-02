package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.39C  reason: invalid class name */
public final class AnonymousClass39C {
    public final /* synthetic */ AnonymousClass1VZ A00;
    public final /* synthetic */ C77633w6 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    public AnonymousClass39C(AnonymousClass1VZ r1, C77633w6 r2, String str, String str2, Map map) {
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r2;
        this.A04 = map;
    }

    public void A00(Map map) {
        String str;
        AnonymousClass1VZ r4 = this.A00;
        AnonymousClass4TZ r3 = r4.A02;
        if (r3 == null) {
            throw C18450wi.A03("fcsLoadingEventManager");
        }
        r3.A00(C797241a.ON_FAILURE, this.A02, this.A03, map);
        AnonymousClass1VZ.A00(r4, "actionPerformed");
        r4.A06("action_performed", "submit");
        C77633w6 r5 = this.A01;
        String str2 = r5.A00;
        AnonymousClass4ZL r2 = r5.A00;
        if (r2 != null && map != null) {
            C796140n r1 = C796140n.ERROR;
            if (map.get(r1.key) != null) {
                Object obj = map.get(r1.key);
                if (obj != null) {
                    Object obj2 = ((Map) obj).get(C796140n.ERROR_NAME.key);
                    if (obj2 != null) {
                        C88604an A012 = C89844d1.A01(r2.A00);
                        Object A013 = A012.A01("$.length()", new AnonymousClass5OQ[0]);
                        C18450wi.A0B(A013);
                        int A0D = AnonymousClass000.A0D(A013);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= A0D) {
                                break;
                            }
                            int i3 = i2 + 1;
                            StringBuilder A0r = AnonymousClass000.A0r("$.[");
                            A0r.append(i2);
                            List list = (List) A012.A01(AnonymousClass000.A0h("].error_equals", A0r), new AnonymousClass5OQ[0]);
                            if (list.contains(obj2) || list.isEmpty()) {
                                StringBuilder A0q = AnonymousClass000.A0q("$.[");
                                A0q.append(i2);
                                String str3 = (String) A012.A01(AnonymousClass000.A0h("].next", A0q), new AnonymousClass5OQ[0]);
                            } else {
                                i2 = i3;
                            }
                        }
                        StringBuilder A0q2 = AnonymousClass000.A0q("$.[");
                        A0q2.append(i2);
                        String str32 = (String) A012.A01(AnonymousClass000.A0h("].next", A0q2), new AnonymousClass5OQ[0]);
                        if (str32 != null) {
                            str2 = str32;
                        }
                    } else {
                        str = "null cannot be cast to non-null type kotlin.String";
                    }
                } else {
                    str = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>";
                }
                throw AnonymousClass000.A0W(str);
            }
        }
        Map map2 = this.A04;
        if (map2 == null) {
            map2 = AnonymousClass1Z8.A00;
        }
        Map map3 = (Map) C89584cU.A01(map2, r5.A04);
        String str4 = r5.A03;
        if (map == null) {
            map = AnonymousClass1Z8.A00;
        }
        AnonymousClass1VZ.A01(r4, str2, C89584cU.A02(str4, map3, (Map) C89584cU.A01(map, r5.A06)), 3);
    }

    public void A01(Map map) {
        AnonymousClass1VZ r5 = this.A00;
        AnonymousClass4TZ r3 = r5.A02;
        if (r3 == null) {
            throw C18450wi.A03("fcsLoadingEventManager");
        }
        r3.A00(C797241a.ON_COMPLETION, this.A02, this.A03, map);
        AnonymousClass1VZ.A00(r5, "actionPerformed");
        r5.A06("action_performed", "submit");
        C77633w6 r4 = this.A01;
        String str = r4.A00;
        Map map2 = this.A04;
        if (map2 == null) {
            map2 = AnonymousClass1Z8.A00;
        }
        Map map3 = (Map) C89584cU.A01(map2, r4.A04);
        String str2 = r4.A03;
        if (map == null) {
            map = AnonymousClass1Z8.A00;
        }
        AnonymousClass1VZ.A01(r5, str, C89584cU.A02(str2, map3, (Map) C89584cU.A01(map, r4.A06)), 2);
    }
}
