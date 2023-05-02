package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3DU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DU implements AnonymousClass025 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42481xs A01;
    public final /* synthetic */ C34861kz A02;
    public final /* synthetic */ C451027b A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ AnonymousClass3DU(C42481xs r1, C34861kz r2, C451027b r3, Collection collection, List list, int i2, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i2;
        this.A04 = collection;
        this.A05 = list;
        this.A03 = r3;
        this.A06 = z2;
    }

    public final Object apply(Object obj) {
        boolean z2;
        C42481xs r5 = this.A01;
        C34861kz r10 = this.A02;
        int i2 = this.A00;
        Collection collection = this.A04;
        List list = this.A05;
        C451027b r6 = this.A03;
        boolean z3 = this.A06;
        String str = (String) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass287 A012 = r5.A0A.A01("sync/sync_delta/", list, Collections.emptyList());
        if (A012 == null) {
            r6.A09 = 2L;
        } else {
            ArrayList A0u = AnonymousClass000.A0u();
            HashSet A0o = C13680ns.A0o();
            HashSet A0o2 = C13680ns.A0o();
            Iterator it = A012.A01.iterator();
            while (true) {
                z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                C16010sH A0U = C13680ns.A0U(it);
                if (!AnonymousClass288.A03(A0U, true)) {
                    C38531qw r14 = new C38531qw(A0U);
                    C19810z2 r15 = r5.A0G;
                    boolean A08 = r5.A0J.A08();
                    r14.A09 = true;
                    r14.A0I = true;
                    r14.A0G = r5.A0L.A05();
                    r14.A08 = true;
                    Map map = r5.A0M;
                    UserJid userJid = r14.A0K;
                    C38531qw.A00(r5, r14, userJid, map);
                    r14.A0B = true;
                    r14.A0F = A08;
                    r14.A00 = C16010sH.A00(r14.A0J, r10);
                    r14.A0C = true;
                    r14.A0E = z3;
                    r14.A01 = C19810z2.A00(r14, r15, userJid);
                    if (A08) {
                        C18290wS.A00(r5, r14, userJid);
                    }
                    C38531qw.A01(r14, A0u);
                }
            }
            List list2 = A012.A00;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C34751ko r0 = C13680ns.A0U(it2).A0D;
                AnonymousClass00B.A06(r0);
                A0o.add(r0.A01);
            }
            Set A0A = r5.A0C.A0A();
            Iterator it3 = A012.A04.iterator();
            while (it3.hasNext()) {
                C16010sH A0U2 = C13680ns.A0U(it3);
                if (!AnonymousClass288.A03(A0U2, z2)) {
                    C34751ko r02 = A0U2.A0D;
                    AnonymousClass00B.A06(r02);
                    if (!A0o.contains(r02.A01)) {
                        C38531qw r03 = new C38531qw(A0U2);
                        r03.A09 = z2;
                        r03.A0A = z2;
                        C38531qw.A01(r03, A0u);
                        if (A0U2.A0H() || A0A.contains(C16010sH.A03(A0U2))) {
                            C38531qw r13 = new C38531qw(A0U2);
                            r13.A0I = z2;
                            r13.A0G = r5.A0L.A05();
                            r13.A08 = z2;
                            r13.A0D = z2;
                            r13.A0H = z2;
                            Map map2 = r5.A0M;
                            UserJid userJid2 = r13.A0K;
                            C38531qw.A00(r5, r13, userJid2, map2);
                            A0o2.add(userJid2);
                            C38531qw.A01(r13, A0u);
                        }
                        z2 = true;
                    }
                }
            }
            if (collection != null) {
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    C16010sH A0U3 = C13680ns.A0U(it4);
                    if (!A0o2.contains(C16010sH.A03(A0U3)) && !AnonymousClass288.A04(A0U3.A0E)) {
                        C19810z2 r1 = r5.A0G;
                        boolean A082 = r5.A0J.A08();
                        C38531qw r12 = new C38531qw(A0U3);
                        r12.A0I = true;
                        r12.A0G = r5.A0L.A05();
                        r12.A08 = true;
                        r12.A0D = true;
                        r12.A0H = true;
                        r12.A0B = true;
                        r12.A00 = C16010sH.A00(A0U3, r10);
                        r12.A0F = A082;
                        r12.A0C = true;
                        r12.A0E = z3;
                        Map map3 = r5.A0M;
                        UserJid userJid3 = r12.A0K;
                        C38531qw.A00(r5, r12, userJid3, map3);
                        r12.A01 = C19810z2.A00(r12, r1, userJid3);
                        if (A082) {
                            C18290wS.A00(r5, r12, userJid3);
                        }
                        C38531qw.A01(r12, A0u);
                    }
                }
            }
            A0u.size();
            r6.A0F = C13690nt.A0W(A0u.size());
            HashSet hashSet = new HashSet(A0u.size());
            if (A0u.isEmpty()) {
                return r5.A04(list2, A012.A03, A012.A06) ? AnonymousClass284.A07 : AnonymousClass284.A08;
            }
            Iterator it5 = A0u.iterator();
            while (it5.hasNext()) {
                UserJid userJid4 = ((C451427f) it5.next()).A06;
                if (userJid4 != null) {
                    hashSet.add(userJid4);
                }
            }
            if (r5.A03(r6, str, AnonymousClass283.A03(r10, r5.A01(), "sync_sid_delta", A0u, i2))) {
                r5.A02((Collection) null, list2, r5.A0P);
                boolean A042 = r5.A04(list2, A012.A03, A012.A06);
                AnonymousClass167.A00(r5, r6, A0u, elapsedRealtime);
                int i3 = 3;
                if (A042) {
                    i3 = 2;
                }
                return new AnonymousClass284(hashSet, i3);
            }
        }
        return AnonymousClass284.A03;
    }
}
