package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.3GI  reason: invalid class name */
public final class AnonymousClass3GI implements AnonymousClass5S1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5Q8 A01;
    public final /* synthetic */ AnonymousClass5Q9 A02;
    public final /* synthetic */ C17950vu A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public AnonymousClass3GI(AnonymousClass5Q8 r1, AnonymousClass5Q9 r2, C17950vu r3, String str, Map map, int i2) {
        this.A03 = r3;
        this.A00 = i2;
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = map;
        this.A04 = str;
    }

    public static void A00(C18390wc r1, AnonymousClass01D r2, String str) {
        r1.add((Object) new AnonymousClass4RI(r2, str));
    }

    public void AQy(AnonymousClass4W3 r9) {
        C18450wi.A0H(r9, 0);
        C17950vu r7 = this.A03;
        int i2 = this.A00;
        long j2 = r9.A00;
        C17940vt r5 = r7.A09;
        C31081dR r2 = r5.A02;
        r2.A03(i2, "iqResponse");
        r5.A01(i2, "error_code", j2);
        r5.A02(i2, "session_id", r7.A0D.A00());
        r2.A05(i2, 467);
        C17850vk r22 = r7.A0C;
        String str = r7.A0F;
        synchronized (r22) {
            r22.A00.remove(str);
        }
        AnonymousClass5Q9 r23 = this.A02;
        if (r23 != null) {
            r23.ARR(C25421Js.A09(new C25401Jq(C795940l.A00.key, r9)));
        }
    }

    public void AQz(AnonymousClass4UO r33) {
        Boolean bool;
        C17950vu r10 = this.A03;
        int i2 = this.A00;
        C17940vt r0 = r10.A09;
        C17940vt r31 = r0;
        C31081dR r8 = r0.A02;
        r8.A03(i2, "iqResponse");
        AnonymousClass5Q8 r12 = this.A01;
        AnonymousClass5Q9 r15 = this.A02;
        Map map = this.A05;
        AnonymousClass4V2 r30 = r33.A01;
        C18450wi.A0B(r30);
        String str = this.A04;
        C17920vr r1 = r10.A04;
        String A042 = r10.A04();
        C17820vh r29 = r10.A0D;
        String A002 = r29.A00();
        String str2 = r10.A0F;
        C17830vi r23 = r10.A0A;
        C16150sX r7 = r1.A00.A01;
        C14870pt A022 = C16150sX.A02(r7);
        C17840vj r6 = (C17840vj) r7.AIc.get();
        C20180zd r5 = (C20180zd) r7.APJ.get();
        C18390wc builderWithExpectedSize = C17380uz.builderWithExpectedSize(16);
        AnonymousClass01J r16 = r7.AI3;
        AnonymousClass01D A003 = C17270uo.A00(r7.AAD);
        C30681cm A012 = ((AnonymousClass174) r16.get()).A01();
        C30681cm r3 = C30681cm.A0E;
        Set singleton = A012 == r3 ? Collections.singleton(new AnonymousClass4RI(A003, "native_flow_npci_common_library")) : Collections.emptySet();
        C16340ss.A01(singleton);
        builderWithExpectedSize.addAll(singleton);
        Set singleton2 = ((AnonymousClass174) r16.get()).A01() == r3 ? Collections.singleton(new AnonymousClass4RI(C17270uo.A00(r7.AAE), "native_upi_add_payment_method")) : Collections.emptySet();
        C16340ss.A01(singleton2);
        builderWithExpectedSize.addAll(singleton2);
        Set singleton3 = ((AnonymousClass174) r16.get()).A01() == r3 ? Collections.singleton(new AnonymousClass4RI(C17270uo.A00(r7.AAF), "native_upi_consumer_onboarding")) : Collections.emptySet();
        C16340ss.A01(singleton3);
        builderWithExpectedSize.addAll(singleton3);
        AnonymousClass01D A004 = C17270uo.A00(r7.AG9);
        C18450wi.A0H(A004, 0);
        A00(builderWithExpectedSize, A004, "native_p2m_lite_hpp_checkout");
        AnonymousClass01D A005 = C17270uo.A00(r7.AG8);
        C18450wi.A0H(A005, 0);
        A00(builderWithExpectedSize, A005, "native_p2m_lite_compliance");
        AnonymousClass01D A006 = C17270uo.A00(r7.AAH);
        C18450wi.A0H(A006, 0);
        A00(builderWithExpectedSize, A006, "open_bloks_screen_static");
        AnonymousClass01D A007 = C17270uo.A00(r7.AA5);
        C18450wi.A0H(A007, 0);
        A00(builderWithExpectedSize, A007, "open_bloks_screen");
        AnonymousClass01D A008 = C17270uo.A00(r7.AAB);
        C18450wi.A0H(A008, 0);
        A00(builderWithExpectedSize, A008, "open_bloks_screen_graphql");
        AnonymousClass01D A009 = C17270uo.A00(r7.AA4);
        C30681cm A013 = ((AnonymousClass174) r16.get()).A01();
        C30681cm r2 = C30681cm.A0D;
        Set singleton4 = A013 == r2 ? Collections.singleton(new AnonymousClass4RI(A009, "br_verify_card_deeplink")) : Collections.emptySet();
        C16340ss.A01(singleton4);
        builderWithExpectedSize.addAll(singleton4);
        Set singleton5 = ((AnonymousClass174) r16.get()).A01() == r2 ? Collections.singleton(new AnonymousClass4RI(C17270uo.A00(r7.AAG), "payment_encrypt_with_public_key")) : Collections.emptySet();
        C16340ss.A01(singleton5);
        builderWithExpectedSize.addAll(singleton5);
        Set singleton6 = ((AnonymousClass174) r16.get()).A01() == r2 ? Collections.singleton(new AnonymousClass4RI(C17270uo.A00(r7.AA6), "br_verify_card_check_if_app_exists")) : Collections.emptySet();
        C16340ss.A01(singleton6);
        builderWithExpectedSize.addAll(singleton6);
        AnonymousClass01D A0010 = C17270uo.A00(r7.AAJ);
        C18450wi.A0H(A0010, 0);
        A00(builderWithExpectedSize, A0010, "send_fds_iq");
        AnonymousClass01D A0011 = C17270uo.A00(r7.AA7);
        C18450wi.A0H(A0011, 0);
        A00(builderWithExpectedSize, A0011, "client_dasl_query");
        AnonymousClass01D A0012 = C17270uo.A00(r7.AAA);
        C18450wi.A0H(A0012, 0);
        A00(builderWithExpectedSize, A0012, "dismiss_bottom_sheet");
        AnonymousClass01D A0013 = C17270uo.A00(r7.AAC);
        C18450wi.A0H(A0013, 0);
        A00(builderWithExpectedSize, A0013, "native_flow_call_manager");
        AnonymousClass01D A0014 = C17270uo.A00(r7.AA3);
        C18450wi.A0H(A0014, 0);
        A00(builderWithExpectedSize, A0014, "abprop_fetch");
        C17380uz<AnonymousClass4RI> build = builderWithExpectedSize.build();
        C18450wi.A0H(build, 0);
        C1203861l r13 = new C1203861l();
        for (AnonymousClass4RI r22 : build) {
            C18450wi.A0H(r22, 0);
            r13.A00.put(r22.A02, r22);
        }
        AnonymousClass1VZ r162 = new AnonymousClass1VZ((C16570tH) r7.A0e.get(), (AnonymousClass1IT) r7.A9J.get(), (AnonymousClass1IA) r7.A9L.get(), A022, r6, (C20210zg) r7.AIe.get(), r23, r13, r5, A042, A002, str2);
        r10.A00 = r162;
        if (r12 != null) {
            r12.ARP(r162.A0M);
        }
        AnonymousClass4V2 r14 = r30;
        r10.A06(r14);
        C86624Tn r17 = r14.A05;
        if (r17 != null) {
            AnonymousClass4UP r132 = r17.A01;
            String str3 = r132.A01;
            C18450wi.A0B(str3);
            C796040m r72 = C796040m.REFERRAL;
            Map A09 = C25421Js.A09(new C25401Jq(r72.key, str));
            if (map == null) {
                map = AnonymousClass1Z8.A00;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A09);
            linkedHashMap.putAll(map);
            AnonymousClass4IQ r4 = new AnonymousClass4IQ(r15, r10);
            r162.A09.A02(r162.A08);
            r162.A04 = r4;
            Object obj = linkedHashMap.get("isModalOnScreen");
            boolean booleanValue = (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) ? false : bool.booleanValue();
            AnonymousClass1IA r18 = r162.A0B;
            String str4 = r162.A0M;
            C82864El r142 = r162.A0F;
            C16150sX r19 = r18.A00.A01;
            r162.A01 = new AnonymousClass3BM((C17840vj) r19.AIc.get(), r142, new AnonymousClass4W2(), (C20180zd) r19.APJ.get(), str4, booleanValue);
            r162.A02 = new AnonymousClass4TZ((C20180zd) r162.A0A.A00.A01.APJ.get(), str4);
            String str5 = r162.A0K;
            String str6 = r162.A0N;
            Object obj2 = linkedHashMap.get(r72.key);
            JSONObject A0J = C13700nu.A0J();
            A0J.put("config", str5);
            A0J.put("isStartingState", true);
            A0J.put("sessionId", str6);
            A0J.put("referral", obj2);
            r162.A07(str3, linkedHashMap, (Map) null, false);
            long size = (long) r132.A02.size();
            r8.A03(i2, "initializeStateMachine");
            C17940vt r02 = r31;
            r02.A01(i2, "num_states", size);
            r02.A02(i2, "session_id", r29.A00());
        }
        C86594Tk r03 = r30.A02;
        if (r03 != null) {
            for (C86564Th r24 : r03.A01.A01) {
                C18450wi.A09(r24);
                ((AnonymousClass1I9) r10.A0E.get()).A00(r24, r10.hashCode());
            }
        }
        r8.A05(i2, 467);
        C86604Tl r04 = r30.A03;
        if (r04 != null) {
            for (AnonymousClass4UN r05 : r04.A01.A01) {
                C18450wi.A09(r05);
                C17950vu.A02(r10, r05);
            }
        }
    }
}
