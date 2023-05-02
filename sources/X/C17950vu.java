package X;

import com.obwhatsapp.payments.phoenix.flowdecisionservice.IDxRCallbackShape3S0400000_2_I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: X.0vu  reason: invalid class name and case insensitive filesystem */
public final class C17950vu {
    public AnonymousClass1VZ A00;
    public Integer A01;
    public String A02;
    public final C16300so A03;
    public final C17920vr A04;
    public final C14870pt A05;
    public final C17190ug A06;
    public final C17840vj A07;
    public final C17900vp A08;
    public final C17940vt A09;
    public final C17830vi A0A;
    public final C17890vo A0B;
    public final C17850vk A0C;
    public final C17820vh A0D;
    public final AnonymousClass01D A0E;
    public final String A0F;
    public final Map A0G = new LinkedHashMap();
    public final Map A0H;
    public final Map A0I = new LinkedHashMap();

    public C17950vu(C16300so r2, C17920vr r3, C14870pt r4, C17190ug r5, C17840vj r6, C17900vp r7, C17940vt r8, C17830vi r9, C17890vo r10, C17850vk r11, C17820vh r12, AnonymousClass01D r13, Map map) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r5, 3);
        C18450wi.A0H(r6, 6);
        C18450wi.A0H(r11, 7);
        C18450wi.A0H(r7, 9);
        C18450wi.A0H(r3, 10);
        C18450wi.A0H(r13, 11);
        C18450wi.A0H(map, 12);
        C18450wi.A0H(r8, 13);
        this.A05 = r4;
        this.A03 = r2;
        this.A06 = r5;
        this.A0D = r12;
        this.A0A = r9;
        this.A07 = r6;
        this.A0C = r11;
        this.A0B = r10;
        this.A08 = r7;
        this.A04 = r3;
        this.A0E = r13;
        this.A0H = map;
        this.A09 = r8;
        String obj = UUID.randomUUID().toString();
        C18450wi.A0B(obj);
        this.A0F = obj;
    }

    public static final Map A00(String str) {
        if (str == null) {
            return null;
        }
        return (Map) C89844d1.A01(str).A01("$", new AnonymousClass5OQ[0]);
    }

    public static /* synthetic */ void A01(AnonymousClass5Q8 r13, AnonymousClass5Q9 r14, C17950vu r15, AnonymousClass4W4 r16, Integer num, String str, Map map, int i2) {
        Integer num2 = num;
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        AnonymousClass4W4 r5 = r16;
        C17950vu r9 = r15;
        r15.A02 = r5.A00;
        r15.A01 = num2;
        int hashCode = r15.hashCode();
        String A042 = r15.A04();
        C17940vt r6 = r15.A09;
        r6.A00(hashCode, A042);
        r6.A02(hashCode, "config_name", r15.A04());
        C17820vh r7 = r15.A0D;
        r7.A00 = null;
        String A043 = r15.A04();
        String A002 = r7.A00();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config", A043);
        jSONObject.put("isStartingState", true);
        jSONObject.put("sessionId", A002);
        String str2 = str;
        jSONObject.put("referral", str2);
        r15.A0G.put(C796040m.SESSION_ID.key, r7.A00());
        r7.A00();
        r15.A04();
        C17850vk r2 = r15.A0C;
        String str3 = r15.A0F;
        synchronized (r2) {
            r2.A00.put(str3, r15);
        }
        AnonymousClass418 r3 = AnonymousClass418.GET;
        r6.A02.A03(hashCode, "iqRequest");
        r6.A02(hashCode, "iq_type", "GET");
        r6.A02(hashCode, "session_id", r7.A00());
        r15.A05(new AnonymousClass3GI(r13, r14, r9, str2, map, hashCode), r3, r5);
    }

    public static final /* synthetic */ void A02(C17950vu r1, AnonymousClass4UN r2) {
        AnonymousClass5QA r12 = (AnonymousClass5QA) r1.A0I.get(r2.A01);
        if (r12 != null) {
            C28371Vv r0 = r2.A00;
            C18450wi.A0B(r0);
            r12.Aas(r0);
        }
    }

    public final C83034Fc A03() {
        String obj = new JSONObject(C25411Jr.A05(new C25401Jq("session-id", this.A0D.A00()), new C25401Jq("bloks-versioning-id", "046877784a36a1a3e5fbca72104f0172b903681b904c7b907b2e2fab4cad66cf"), new C25401Jq("phoenix-versioning-id", "abef88a72df58eb6b36c95c3f10650c0ba0469cfed3235920a6bcefd9c32f3bf"))).toString();
        C18450wi.A0B(obj);
        return new C83034Fc(new C83014Fa(obj));
    }

    public final String A04() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        C18450wi.A0O("config");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final void A05(AnonymousClass5S1 r19, AnonymousClass418 r20, AnonymousClass4W4 r21) {
        String str;
        String str2;
        AnonymousClass418 r6 = r20;
        C18450wi.A0H(r6, 1);
        AnonymousClass4W4 r8 = r21;
        int hashCode = r8.hashCode();
        String A042 = A04();
        C17900vp r5 = this.A08;
        r5.A00(hashCode, A042);
        r5.A02(hashCode, "config_name", A04());
        C17190ug r11 = this.A06;
        String A022 = r11.A02();
        C18450wi.A0B(A022);
        int hashCode2 = r8.hashCode();
        String name = r6.name();
        r5.A02.A03(hashCode2, "iqRequest");
        if (name != null) {
            r5.A02(hashCode2, "iq_type", name);
        }
        r5.A02(hashCode2, "session_id", this.A0D.A00());
        int ordinal = r6.ordinal();
        AnonymousClass5S1 r62 = r19;
        switch (ordinal) {
            case 0:
                Map map = r8.A02;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    str = new JSONObject(linkedHashMap).toString();
                } else {
                    str = null;
                }
                String str3 = r8.A00;
                C83024Fb r9 = new C83024Fb(new AnonymousClass4R1(new AnonymousClass4FZ(r8.A01, str), A03(), str3), new AnonymousClass2BJ(A022));
                r11.A0A(new IDxRCallbackShape3S0400000_2_I0(r62, this, r8, r9, 0), r9.A00, A022, 302, 32000);
                return;
            case 1:
                Map map2 = r8.A02;
                if (map2 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : map2.entrySet()) {
                        if (entry2.getValue() != null) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    str2 = new JSONObject(linkedHashMap2).toString();
                } else {
                    str2 = null;
                }
                String str4 = r8.A00;
                C83044Fd r92 = new C83044Fd(new AnonymousClass4R1(new AnonymousClass4FZ(r8.A01, str2), A03(), str4), new C51812cK(A022));
                r11.A0A(new IDxRCallbackShape3S0400000_2_I0(r62, this, r8, r92, 1), r92.A00, A022, 303, 32000);
                return;
            default:
                return;
        }
    }

    public final void A06(AnonymousClass4V2 r20) {
        Object r9;
        C86624Tn r0 = r20.A05;
        if (r0 != null) {
            List list = r0.A01.A02;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass5NA r3 = ((C86644Tp) it.next()).A01;
                C18450wi.A0B(r3);
                AnonymousClass4ZL r10 = null;
                if (r3 instanceof C1038953d) {
                    C1038953d r32 = (C1038953d) r3;
                    AnonymousClass4V4 r6 = r32.A01;
                    String str = r6.A03;
                    String str2 = r32.A03;
                    Map A002 = A00(r6.A02);
                    Map A003 = A00(r32.A05);
                    Map A042 = A003 == null ? null : C25411Jr.A04(A003, new C25401Jq(C796040m.ADDITIONAL_PARAMS.key, this.A0G));
                    Map A004 = A00(r6.A06);
                    String str3 = r6.A05;
                    if (str3 == null) {
                        str3 = "$";
                    } else if (str3.equals("")) {
                        str3 = null;
                    }
                    String str4 = r6.A04;
                    String str5 = r32.A04;
                    if (str5 == null) {
                        str5 = "replace";
                    }
                    String str6 = r32.A02;
                    if (str6 != null) {
                        r10 = new AnonymousClass4ZL(str6);
                    }
                    C18450wi.A0B(str);
                    C18450wi.A0B(str2);
                    r9 = new C77633w6(r10, str, str2, str3, str4, str5, A002, A042, A004);
                } else if (r3 instanceof C1038853c) {
                    C1038853c r33 = (C1038853c) r3;
                    String str7 = r33.A01.A03;
                    C18450wi.A0B(str7);
                    String str8 = r33.A02;
                    C18450wi.A0B(str8);
                    List<C86544Tf> list2 = r33.A03;
                    ArrayList arrayList2 = new ArrayList(AnonymousClass1J9.A0M(list2, 10));
                    for (C86544Tf r1 : list2) {
                        arrayList2.add(r1.A01);
                    }
                    ArrayList arrayList3 = new ArrayList(AnonymousClass1J9.A0M(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String str9 = ((C86534Te) it2.next()).A01;
                        C18450wi.A0B(str9);
                        arrayList3.add(str9);
                    }
                    r9 = new C77613w4(str7, str8, arrayList3);
                } else if (r3 instanceof C1038653a) {
                    String str10 = ((C1038653a) r3).A01.A03;
                    C18450wi.A0B(str10);
                    r9 = new C77603w3(str10);
                } else if (r3 instanceof C1038753b) {
                    C1038753b r34 = (C1038753b) r3;
                    AnonymousClass4V4 r2 = r34.A01;
                    String str11 = r2.A03;
                    C18450wi.A0B(str11);
                    Map A005 = A00(r2.A02);
                    Map A006 = A00(r34.A02);
                    String str12 = r2.A05;
                    if (str12 == null) {
                        str12 = "$";
                    } else if (str12.equals("")) {
                        str12 = null;
                    }
                    r9 = new C77623w5(str11, str12, r2.A04, A005, A006);
                }
                arrayList.add(r9);
            }
            int A072 = C25421Js.A07(AnonymousClass1J9.A0M(arrayList, 10));
            if (A072 < 16) {
                A072 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A072);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                linkedHashMap.put(((C86034Qy) next).A01, next);
            }
            this.A0A.A00.putAll(linkedHashMap);
            for (Map.Entry value : linkedHashMap.entrySet()) {
                C18450wi.A0H(value.getValue(), 0);
            }
        }
    }
}
