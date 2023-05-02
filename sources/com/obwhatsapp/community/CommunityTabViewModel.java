package com.obwhatsapp.community;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass11A;
import X.AnonymousClass159;
import X.AnonymousClass18R;
import X.AnonymousClass1VD;
import X.AnonymousClass1WA;
import X.AnonymousClass2AP;
import X.AnonymousClass2OJ;
import X.AnonymousClass4UJ;
import X.AnonymousClass570;
import X.AnonymousClass57H;
import X.C003401n;
import X.C14710pd;
import X.C14870pt;
import X.C15810rt;
import X.C15830rv;
import X.C15840rx;
import X.C16040sK;
import X.C16050sL;
import X.C16320sq;
import X.C16740tZ;
import X.C17140ub;
import X.C17230uk;
import X.C18940xV;
import X.C19150xq;
import X.C19780yz;
import X.C217415g;
import X.C217915l;
import X.C30801cy;
import X.C30961dF;
import X.C33481ie;
import X.C33501ig;
import X.C39461sW;
import X.C45882Bm;
import X.C73633oZ;
import com.facebook.redex.RunnableRunnableShape0S0800000_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.obwhatsapp.group.IDxGObserverShape83S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommunityTabViewModel extends C003401n implements AnonymousClass2AP {
    public final C16040sK A00;
    public final C17230uk A01;
    public final C33481ie A02 = new IDxCObserverShape68S0100000_2_I0(this, 9);
    public final C17140ub A03;
    public final C30961dF A04 = new C73633oZ(this);
    public final AnonymousClass159 A05;
    public final C15810rt A06;
    public final C33501ig A07 = new IDxCObserverShape72S0100000_2_I0(this, 6);
    public final AnonymousClass11A A08;
    public final C19780yz A09;
    public final C18940xV A0A = new IDxMObserverShape74S0100000_2_I0(this, 2);
    public final C19150xq A0B;
    public final C14710pd A0C;
    public final AnonymousClass1VD A0D = new IDxPObserverShape81S0100000_2_I0(this, 7);
    public final AnonymousClass18R A0E;
    public final C45882Bm A0F = new IDxGObserverShape83S0100000_2_I0(this, 1);
    public final C217415g A0G;
    public final C217915l A0H;
    public final AnonymousClass2OJ A0I;
    public final AnonymousClass2OJ A0J;
    public final AnonymousClass1WA A0K;
    public final C30801cy A0L = new C30801cy();
    public final Comparator A0M;
    public final Comparator A0N;
    public final Map A0O = new LinkedHashMap();
    public final Map A0P = new HashMap();
    public final Set A0Q = new HashSet();

    public CommunityTabViewModel(C14870pt r16, C16040sK r17, C17230uk r18, C17140ub r19, AnonymousClass159 r20, AnonymousClass013 r21, C15810rt r22, AnonymousClass11A r23, C19780yz r24, C19150xq r25, C14710pd r26, AnonymousClass18R r27, C217415g r28, C217915l r29, C16320sq r30) {
        this.A0C = r26;
        this.A00 = r17;
        C15810rt r4 = r22;
        this.A06 = r4;
        AnonymousClass1WA r3 = new AnonymousClass1WA(r30, false);
        this.A0K = r3;
        C17140ub r11 = r19;
        this.A03 = r11;
        this.A09 = r24;
        C19150xq r8 = r25;
        this.A0B = r8;
        this.A0H = r29;
        AnonymousClass159 r13 = r20;
        this.A05 = r13;
        this.A01 = r18;
        C217415g r10 = r28;
        this.A0G = r10;
        AnonymousClass11A r12 = r23;
        this.A08 = r12;
        AnonymousClass18R r7 = r27;
        this.A0E = r7;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass4UJ((C15830rv) null, (Object) null, 10));
        this.A0J = new AnonymousClass2OJ(new ArrayList(arrayList));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AnonymousClass4UJ((C15830rv) null, (Object) null, 10));
        this.A0I = new AnonymousClass2OJ(new ArrayList(arrayList2));
        this.A0N = new AnonymousClass57H(r4);
        this.A0M = new AnonymousClass570(r21);
        r3.execute(new RunnableRunnableShape0S0800000_I0(r16, r7, r8, this, r10, r11, r12, r13, 1));
    }

    public static /* synthetic */ boolean A01(CommunityTabViewModel communityTabViewModel, C15830rv r5) {
        if (!(r5 instanceof C16050sL)) {
            return false;
        }
        Map map = communityTabViewModel.A0O;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry key : map.entrySet()) {
            C15840rx r2 = (C15840rx) key.getKey();
            C15830rv A052 = r2.A05();
            if ((A052 instanceof C16050sL) && r5.equals(A052)) {
                communityTabViewModel.A05(r2);
                return true;
            }
        }
        return false;
    }

    public void A04() {
        this.A08.A03(this.A07);
        this.A05.A03(this.A04);
        this.A0G.A03(this.A0F);
        this.A0B.A03(this.A0A);
        this.A0E.A03(this.A0D);
        this.A03.A03(this.A02);
    }

    public final List A05(C15840rx r5) {
        List<C15840rx> list = (List) this.A0O.remove(r5);
        if (list != null) {
            for (C15840rx A052 : list) {
                this.A0P.remove(GroupJid.of(A052.A05()));
            }
        }
        return list;
    }

    public final List A06(C15840rx r6, Map map) {
        C17230uk r2 = this.A01;
        List<C39461sW> A002 = r2.A03.A00(C16050sL.A03(r6.A05()));
        if (!A002.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C39461sW r1 : A002) {
                C15810rt r0 = this.A06;
                GroupJid groupJid = r1.A02;
                C15840rx A062 = r0.A06(groupJid);
                if (A062 != null) {
                    map.put(groupJid, r6);
                    arrayList.add(A062);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r4.isEmpty() != false) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1 A[LOOP:1: B:29:0x00a8->B:33:0x00b1, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(boolean r14) {
        /*
            r13 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Map r9 = r13.A0O
            java.util.Set r0 = r9.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Comparator r0 = r13.A0M
            java.util.Collections.sort(r1, r0)
            java.util.Iterator r12 = r1.iterator()
        L_0x0019:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r8 = r12.next()
            X.0rx r8 = (X.C15840rx) r8
            java.lang.Object r7 = r9.get(r8)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0033
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x003c
        L_0x0033:
            java.util.Set r0 = r13.A0Q
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x003c
            goto L_0x0019
        L_0x003c:
            java.util.Set r0 = r13.A0Q
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x005d
            r0 = 1
            X.4I0 r3 = new X.4I0
            r3.<init>(r8, r0)
            X.0rv r2 = r8.A05()
            r1 = 8
            X.4UJ r0 = new X.4UJ
            r0.<init>(r2, r3, r1)
            java.util.List r6 = java.util.Collections.singletonList(r0)
        L_0x0059:
            r4.addAll(r6)
            goto L_0x0019
        L_0x005d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = 0
            X.4I0 r3 = new X.4I0
            r3.<init>(r8, r5)
            X.0rv r2 = r8.A05()
            r1 = 8
            X.4UJ r0 = new X.4UJ
            r0.<init>(r2, r3, r1)
            r6.add(r0)
            X.0yz r1 = r13.A09
            X.0rv r0 = r8.A05()
            X.0tZ r10 = r1.A00(r0)
            if (r10 == 0) goto L_0x0092
            X.0sK r0 = r13.A00
            boolean r0 = X.C38621r6.A0U(r0, r10)
            if (r0 == 0) goto L_0x0092
            monitor-enter(r8)
            long r2 = r8.A0I     // Catch:{ all -> 0x00e2 }
            monitor-exit(r8)
            monitor-enter(r8)
            long r0 = r8.A0H     // Catch:{ all -> 0x00e2 }
            goto L_0x0094
        L_0x0092:
            r10 = 0
            goto L_0x00a8
        L_0x0094:
            monitor-exit(r8)
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0092
            r2 = 13
            X.0rv r1 = r10.A0B()
            X.4UJ r0 = new X.4UJ
            r0.<init>(r1, r10, r2)
            r6.add(r0)
            r10 = 1
        L_0x00a8:
            int r0 = r7.size()
            if (r5 >= r0) goto L_0x00d2
            r0 = 3
            if (r10 >= r0) goto L_0x00d2
            java.lang.Object r1 = r7.get(r5)
            X.0rx r1 = (X.C15840rx) r1
            r3 = 4
            X.0rv r0 = r1.A05()
            X.2Wo r2 = new X.2Wo
            r2.<init>(r0)
            X.0rv r1 = r1.A05()
            X.4UJ r0 = new X.4UJ
            r0.<init>(r1, r2, r3)
            r6.add(r0)
            int r10 = r10 + 1
            int r5 = r5 + 1
            goto L_0x00a8
        L_0x00d2:
            r2 = 9
            X.0rv r1 = r8.A05()
            X.4UJ r0 = new X.4UJ
            r0.<init>(r1, r8, r2)
            r6.add(r0)
            goto L_0x0059
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x00e5:
            int r0 = r4.size()
            r3 = 0
            if (r0 == 0) goto L_0x0108
            X.0pd r2 = r13.A0C
            r1 = 1173(0x495, float:1.644E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0102
            r2 = 0
            r1 = 7
            X.4UJ r0 = new X.4UJ
            r0.<init>(r3, r3, r1)
            r4.add(r2, r0)
        L_0x0102:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0117
        L_0x0108:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = 10
            X.4UJ r0 = new X.4UJ
            r0.<init>(r3, r3, r1)
            r4.add(r0)
        L_0x0117:
            X.2OJ r0 = r13.A0J
            r0.A09(r4)
            if (r14 == 0) goto L_0x0123
            X.2OJ r0 = r13.A0I
            r0.A09(r4)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.community.CommunityTabViewModel.A07(boolean):void");
    }

    public void AM5(C16740tZ r3) {
        String str;
        if (r3 == null) {
            str = "CommunityTabViewModel/onActivityRowTapped from a null message";
        } else {
            GroupJid of = GroupJid.of(r3.A11.A00);
            if (of == null) {
                str = "CommunityTabViewModel/null parent for activity row";
            } else {
                this.A0L.A09(of);
                return;
            }
        }
        AnonymousClass00B.A08(str);
    }
}
