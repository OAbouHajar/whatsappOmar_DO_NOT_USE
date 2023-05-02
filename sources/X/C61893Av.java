package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Av  reason: invalid class name and case insensitive filesystem */
public final class C61893Av {
    public static final Map A00(AnonymousClass4UO r6) {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put(C796140n.SUCCESS_FLAG.key, Boolean.TRUE);
        C86614Tm r1 = r6.A01.A04;
        if (r1 != null) {
            String str = C796140n.SCREEN_DATA.key;
            Object A01 = C89844d1.A01(r1.A01.A01).A01("$", new AnonymousClass5OQ[0]);
            C18450wi.A0B(A01);
            A0x.put(str, A01);
        }
        return A0x;
    }

    public static final Map A01(Integer num, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C796140n.SUCCESS_FLAG.key, Boolean.FALSE);
        if (num != null) {
            C25401Jq[] r2 = new C25401Jq[2];
            C25401Jq.A00(C796140n.ERROR_CODE.key, num, r2, 0);
            C25401Jq.A00(C796140n.ERROR_MESSAGE.key, str, r2, 1);
            Map A06 = C25411Jr.A06(r2);
            if (map != null) {
                A06.put(C796140n.ERROR_PARAMS.key, map);
            }
            linkedHashMap.put(C796140n.ERROR.key, A06);
        }
        return linkedHashMap;
    }

    public static final void A02(C17950vu r7, AnonymousClass4UO r8) {
        AnonymousClass4V2 r5 = r8.A01;
        C86624Tn r0 = r5.A05;
        if (r0 != null) {
            AnonymousClass4UP r2 = r0.A01;
            List list = r2.A02;
            if (!list.isEmpty()) {
                r7.A06(r5);
                AnonymousClass1VZ r6 = r7.A00;
                if (r6 != null) {
                    String str = r2.A01;
                    C18450wi.A0B(str);
                    int size = list.size();
                    r6.A06 = str;
                    if (r6.A03 != null) {
                        C20210zg r4 = r6.A0E;
                        r4.A02.A03(r6.A00, "queueStates");
                        r4.A01(r6.A00, "num_states_queued", (long) size);
                        r4.A02(r6.A00, "session_id", r6.A0N);
                    }
                }
            }
        }
        C86594Tk r02 = r5.A02;
        if (r02 != null) {
            for (C86564Th r22 : r02.A01.A01) {
                C18450wi.A09(r22);
                ((AnonymousClass1I9) r7.A0E.get()).A00(r22, r7.hashCode());
            }
        }
    }
}
