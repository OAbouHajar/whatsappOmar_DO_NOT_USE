package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2Ba  reason: invalid class name */
public class AnonymousClass2Ba implements C19550yc {
    public final int A00;
    public final C16300so A01;
    public final C17240ul A02;
    public final C17190ug A03;

    public AnonymousClass2Ba(C16300so r1, C17240ul r2, C17190ug r3, int i2) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i2;
    }

    public final void A00(C19550yc r16) {
        Log.i("GroupRequestProtocolHelper/sendGetGroups/get-groups");
        C17190ug r8 = this.A03;
        String A022 = r8.A02();
        ArrayList arrayList = new ArrayList();
        int i2 = this.A00;
        if ((i2 & 1) != 0) {
            arrayList.add(new C28371Vv("participants", (C35081lL[]) null));
        }
        if ((i2 & 2) != 0) {
            arrayList.add(new C28371Vv(FacebookFacade.RequestParameter.DESCRIPTION, (C35081lL[]) null));
        }
        C28371Vv r5 = new C28371Vv("participating", (C35081lL[]) null, (C28371Vv[]) arrayList.toArray(new C28371Vv[0]));
        C19550yc r9 = r16;
        r8.A0B(r9, new C28371Vv("iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "get"), new C35081lL((Jid) C34961l9.A00, "to")}, new C28371Vv[]{r5}), A022, 19, 0);
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("GroupRequestProtocolHelper/onDeliveryFailure/iqId=");
        sb.append(str);
        Log.e(sb.toString());
        this.A02.A0C(this.A00);
    }

    public void AQe(C28371Vv r3, String str) {
        StringBuilder sb = new StringBuilder("GroupRequestProtocolHelper/onError/iqId=");
        sb.append(str);
        Log.e(sb.toString());
        this.A02.A0C(this.A00);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void AYG(X.C28371Vv r42, java.lang.String r43) {
        /*
            r41 = this;
            r6 = r41
            X.0ul r12 = r6.A02
            r0 = 0
            r12.A14 = r0
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.lang.String r8 = "groups"
            r0 = r42
            X.1Vv r1 = r0.A0J(r8)
            if (r1 == 0) goto L_0x011b
            java.lang.String r0 = "group"
            java.util.List r0 = r1.A0O(r0)     // Catch:{ 1W4 -> 0x0216 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 1W4 -> 0x0216 }
        L_0x0020:
            boolean r0 = r11.hasNext()     // Catch:{ 1W4 -> 0x0216 }
            if (r0 == 0) goto L_0x011b
            java.lang.Object r0 = r11.next()     // Catch:{ 1W4 -> 0x0216 }
            X.1Vv r0 = (X.C28371Vv) r0     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r1 = "id"
            r3 = 0
            java.lang.String r1 = r0.A0N(r1, r3)     // Catch:{ 1W4 -> 0x0216 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ 1W4 -> 0x0216 }
            X.0sL r13 = X.C16030sJ.A01(r1)     // Catch:{ 1W4 -> 0x0216 }
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "creator"
            X.0so r5 = r6.A01     // Catch:{ 1W4 -> 0x0216 }
            com.whatsapp.jid.Jid r15 = r0.A0F(r5, r2, r1)     // Catch:{ 1W4 -> 0x0216 }
            com.whatsapp.jid.UserJid r15 = (com.whatsapp.jid.UserJid) r15     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r1 = "creation"
            java.lang.String r7 = r0.A0N(r1, r3)     // Catch:{ 1W4 -> 0x0216 }
            r1 = 0
            long r26 = X.C29501aj.A01(r7, r1)     // Catch:{ 1W4 -> 0x0216 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r26 = r26 * r9
            java.lang.String r7 = "subject"
            java.lang.String r19 = r0.A0N(r7, r3)     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r7 = "s_t"
            java.lang.String r7 = r0.A0N(r7, r3)     // Catch:{ 1W4 -> 0x0216 }
            long r28 = X.C29501aj.A01(r7, r1)     // Catch:{ 1W4 -> 0x0216 }
            long r28 = r28 * r9
            java.lang.String r7 = "type"
            java.lang.String r20 = r0.A0N(r7, r3)     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r7 = "locked"
            X.1Vv r7 = r0.A0J(r7)     // Catch:{ 1W4 -> 0x0216 }
            r35 = 0
            if (r7 == 0) goto L_0x007d
            r35 = 1
        L_0x007d:
            java.lang.String r7 = "announcement"
            X.1Vv r7 = r0.A0J(r7)     // Catch:{ 1W4 -> 0x0216 }
            r36 = 0
            if (r7 == 0) goto L_0x0089
            r36 = 1
        L_0x0089:
            java.lang.String r7 = "incognito"
            X.1Vv r7 = r0.A0J(r7)     // Catch:{ 1W4 -> 0x0216 }
            r39 = 0
            if (r7 == 0) goto L_0x0095
            r39 = 1
        L_0x0095:
            java.lang.String r7 = "no_frequently_forwarded"
            X.1Vv r7 = r0.A0J(r7)     // Catch:{ 1W4 -> 0x0216 }
            r37 = 0
            if (r7 == 0) goto L_0x00a1
            r37 = 1
        L_0x00a1:
            java.lang.String r7 = "suspended"
            X.1Vv r7 = r0.A0J(r7)     // Catch:{ 1W4 -> 0x0216 }
            r38 = 0
            if (r7 == 0) goto L_0x00ae
            r38 = 1
        L_0x00ae:
            java.lang.String r7 = "support"
            X.1Vv r7 = r0.A0J(r7)     // Catch:{ 1W4 -> 0x0216 }
            r34 = 0
            if (r7 == 0) goto L_0x00bb
            r34 = 1
        L_0x00bb:
            java.lang.String r7 = "p_v_id"
            long r30 = r0.A0D(r7, r1)     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r7 = "a_v_id"
            long r32 = r0.A0D(r7, r1)     // Catch:{ 1W4 -> 0x0216 }
            int r1 = r6.A00     // Catch:{ 1W4 -> 0x0216 }
            r2 = r1 & 1
            if (r2 == 0) goto L_0x0118
            java.util.Map r21 = X.C53262fQ.A06(r5, r0)     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r2 = "size"
            java.lang.String r3 = r0.A0N(r2, r3)     // Catch:{ 1W4 -> 0x0216 }
            int r2 = r21.size()     // Catch:{ 1W4 -> 0x0216 }
            int r2 = X.C29501aj.A00(r3, r2)     // Catch:{ 1W4 -> 0x0216 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ 1W4 -> 0x0216 }
        L_0x00e4:
            X.1cF r16 = X.C30371cF.A04     // Catch:{ 1W4 -> 0x0216 }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x00f4
            java.lang.String r1 = "description"
            X.1Vv r1 = r0.A0J(r1)     // Catch:{ 1W4 -> 0x0216 }
            X.1cF r16 = X.C53262fQ.A04(r5, r0, r1)     // Catch:{ 1W4 -> 0x0216 }
        L_0x00f4:
            int r22 = X.C53262fQ.A01(r0)     // Catch:{ 1W4 -> 0x0216 }
            X.1jl r17 = X.C53262fQ.A05(r0)     // Catch:{ 1W4 -> 0x0216 }
            int r24 = X.C53262fQ.A02(r0)     // Catch:{ 1W4 -> 0x0216 }
            X.0sL r14 = X.C53262fQ.A03(r5, r0)     // Catch:{ 1W4 -> 0x0216 }
            boolean r40 = X.C53262fQ.A08(r0)     // Catch:{ 1W4 -> 0x0216 }
            int r25 = X.C53262fQ.A00(r0)     // Catch:{ 1W4 -> 0x0216 }
            r23 = 3
            r18 = r3
            r12.A0P(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ 1W4 -> 0x0216 }
            r4.add(r13)     // Catch:{ 1W4 -> 0x0216 }
            goto L_0x0020
        L_0x0118:
            r21 = r3
            goto L_0x00e4
        L_0x011b:
            int r5 = r6.A00     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r0 = "groupmgr/onGroupSyncSucceeded/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x0216 }
            r1.<init>(r0)     // Catch:{ 1W4 -> 0x0216 }
            r1.append(r5)     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ 1W4 -> 0x0216 }
            r1.append(r4)     // Catch:{ 1W4 -> 0x0216 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1W4 -> 0x0216 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x0216 }
            X.0sK r0 = r12.A08     // Catch:{ 1W4 -> 0x0216 }
            r0.A0B()     // Catch:{ 1W4 -> 0x0216 }
            X.1ZT r7 = r0.A05     // Catch:{ 1W4 -> 0x0216 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ 1W4 -> 0x0216 }
            X.1ZX r2 = r0.A03()     // Catch:{ 1W4 -> 0x0216 }
            X.0rs r0 = r12.A0K     // Catch:{ 1W4 -> 0x0216 }
            java.util.List r0 = r0.A05()     // Catch:{ 1W4 -> 0x0216 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 1W4 -> 0x0216 }
            r3.<init>()     // Catch:{ 1W4 -> 0x0216 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ 1W4 -> 0x0216 }
        L_0x0153:
            boolean r0 = r9.hasNext()     // Catch:{ 1W4 -> 0x0216 }
            if (r0 == 0) goto L_0x018b
            java.lang.Object r1 = r9.next()     // Catch:{ 1W4 -> 0x0216 }
            X.0rv r1 = (X.C15830rv) r1     // Catch:{ 1W4 -> 0x0216 }
            boolean r0 = r1 instanceof X.C16050sL     // Catch:{ 1W4 -> 0x0216 }
            if (r0 == 0) goto L_0x0153
            X.0sL r1 = (X.C16050sL) r1     // Catch:{ 1W4 -> 0x0216 }
            boolean r0 = r4.contains(r1)     // Catch:{ 1W4 -> 0x0216 }
            if (r0 != 0) goto L_0x0153
            X.0sO r0 = r12.A0a     // Catch:{ 1W4 -> 0x0216 }
            X.0us r0 = r0.A07     // Catch:{ 1W4 -> 0x0216 }
            X.1cE r0 = r0.A04(r1)     // Catch:{ 1W4 -> 0x0216 }
            r0.A06(r7)     // Catch:{ 1W4 -> 0x0216 }
            if (r2 == 0) goto L_0x017b
            r0.A06(r2)     // Catch:{ 1W4 -> 0x0216 }
        L_0x017b:
            r3.add(r1)     // Catch:{ 1W4 -> 0x0216 }
            X.0yQ r0 = r12.A0p     // Catch:{ 1W4 -> 0x0216 }
            r0.A0R(r1)     // Catch:{ 1W4 -> 0x0216 }
            java.util.List r0 = java.util.Collections.singletonList(r7)     // Catch:{ 1W4 -> 0x0216 }
            r12.A0J(r1, r0)     // Catch:{ 1W4 -> 0x0216 }
            goto L_0x0153
        L_0x018b:
            X.126 r2 = r12.A0Q     // Catch:{ 1W4 -> 0x0216 }
            r0 = 16
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r1 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ 1W4 -> 0x0216 }
            r1.<init>(r12, r3, r7, r0)     // Catch:{ 1W4 -> 0x0216 }
            r0 = 47
            r2.A01(r1, r0)     // Catch:{ 1W4 -> 0x0216 }
            r7 = 0
            r3 = 3
            if (r5 != r3) goto L_0x019e
            goto L_0x01a3
        L_0x019e:
            r0 = r5 & 1
            if (r0 == 0) goto L_0x01cf
            goto L_0x01b2
        L_0x01a3:
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A05     // Catch:{ 1W4 -> 0x0216 }
            r0 = 1
            boolean r0 = r1.compareAndSet(r0, r7)     // Catch:{ 1W4 -> 0x0216 }
            if (r0 == 0) goto L_0x01b2
            X.124 r1 = r12.A0s     // Catch:{ 1W4 -> 0x0216 }
            r0 = 0
            r1.A04(r8, r0)     // Catch:{ 1W4 -> 0x0216 }
        L_0x01b2:
            X.0pd r2 = r12.A0f     // Catch:{ 1W4 -> 0x0216 }
            r1 = 1728(0x6c0, float:2.421E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ 1W4 -> 0x0216 }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ 1W4 -> 0x0216 }
            if (r0 == 0) goto L_0x01c3
            X.18V r0 = r12.A0X     // Catch:{ 1W4 -> 0x0216 }
            r0.A00(r4)     // Catch:{ 1W4 -> 0x0216 }
        L_0x01c3:
            X.0pt r2 = r12.A07     // Catch:{ 1W4 -> 0x0216 }
            r1 = 42
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ 1W4 -> 0x0216 }
            r0.<init>(r12, r1, r4)     // Catch:{ 1W4 -> 0x0216 }
            r2.A0K(r0)     // Catch:{ 1W4 -> 0x0216 }
        L_0x01cf:
            monitor-enter(r12)     // Catch:{ 1W4 -> 0x0216 }
            if (r5 != r3) goto L_0x01d4
            r12.A13 = r7     // Catch:{ all -> 0x0213 }
        L_0x01d4:
            X.0rz r3 = r12.A0N     // Catch:{ all -> 0x0211 }
            java.lang.Integer r0 = r3.A0L()     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x0203
            java.lang.Integer r2 = r12.A03     // Catch:{ all -> 0x0211 }
            if (r2 == 0) goto L_0x01f0
            int r0 = r0.intValue()     // Catch:{ all -> 0x0211 }
            r1 = r5 ^ -1
            r1 = r1 & r0
            int r0 = r2.intValue()     // Catch:{ all -> 0x0211 }
            r1 = r1 | r0
            r3.A0i(r1)     // Catch:{ all -> 0x0211 }
            goto L_0x0203
        L_0x01f0:
            android.content.SharedPreferences$Editor r1 = r3.A0K()     // Catch:{ all -> 0x0211 }
            java.lang.String r0 = "need_to_get_groups"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)     // Catch:{ all -> 0x0211 }
            java.lang.String r0 = "get_groups_params"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x0211 }
            r0.apply()     // Catch:{ all -> 0x0211 }
        L_0x0203:
            java.lang.Integer r1 = r12.A03     // Catch:{ all -> 0x0213 }
            r0 = 0
            if (r1 != 0) goto L_0x020c
            r12.A02 = r0     // Catch:{ all -> 0x0213 }
        L_0x020a:
            monitor-exit(r12)     // Catch:{ all -> 0x0213 }
            goto L_0x0210
        L_0x020c:
            r12.A0X(r0)     // Catch:{ all -> 0x0211 }
            goto L_0x020a
        L_0x0210:
            return
        L_0x0211:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0213 }
        L_0x0213:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0213 }
            throw r0     // Catch:{ 1W4 -> 0x0216 }
        L_0x0216:
            r1 = move-exception
            java.lang.String r0 = "GroupRequestProtocolHelper/error/groupInitFailed"
            com.whatsapp.util.Log.e(r0, r1)
            X.0so r3 = r6.A01
            r2 = 1
            java.lang.String r1 = "GroupRequestProtocolHelper/handleInvalidJidReceived"
            java.lang.String r0 = "invalid-jid-received"
            r3.AcB(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Ba.AYG(X.1Vv, java.lang.String):void");
    }
}
