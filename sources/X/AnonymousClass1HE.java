package X;

import com.facebook.redex.IDxExecutorShape280S0100000_2_I0;
import com.facebook.redex.IDxNConsumerShape39S0200000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.1HE  reason: invalid class name */
public class AnonymousClass1HE {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C18020w1 A03;
    public final C23461Cb A04;
    public final C16440t3 A05;
    public final C16460t6 A06;
    public final C19150xq A07;
    public final AnonymousClass16V A08;
    public final C19410yO A09;
    public final C18030w2 A0A;
    public final C14710pd A0B;
    public final C16490t9 A0C;
    public final C18220wL A0D;
    public final C27711Sv A0E;
    public final C215914r A0F;
    public final AnonymousClass1RN A0G;
    public final C215614o A0H;
    public final AnonymousClass1QT A0I;
    public final C27411Rq A0J;
    public final C27721Sw A0K;
    public final AnonymousClass1HO A0L;
    public final AnonymousClass125 A0M;
    public final C222617g A0N;
    public final C16320sq A0O;
    public final C28831Xx A0P;
    public final Object A0Q = new Object();
    public final WeakHashMap A0R = new WeakHashMap();
    public final Executor A0S;

    public AnonymousClass1HE(C16300so r6, C14870pt r7, C16040sK r8, C18020w1 r9, C23461Cb r10, C16440t3 r11, C16460t6 r12, C19150xq r13, AnonymousClass16V r14, C19410yO r15, C18030w2 r16, C14710pd r17, C16490t9 r18, C18220wL r19, C27711Sv r20, C215914r r21, AnonymousClass1RN r22, C215614o r23, AnonymousClass1QT r24, C27411Rq r25, C27721Sw r26, AnonymousClass1HO r27, AnonymousClass125 r28, C222617g r29, C16320sq r30) {
        this.A05 = r11;
        C14710pd r4 = r17;
        this.A0B = r4;
        this.A01 = r7;
        this.A00 = r6;
        this.A02 = r8;
        C16320sq r3 = r30;
        this.A0O = r3;
        this.A0C = r18;
        this.A0H = r23;
        this.A0A = r16;
        this.A03 = r9;
        this.A0I = r24;
        this.A0N = r29;
        this.A0D = r19;
        this.A0M = r28;
        this.A06 = r12;
        this.A0J = r25;
        this.A07 = r13;
        this.A0G = r22;
        this.A0F = r21;
        this.A08 = r14;
        this.A0L = r27;
        this.A04 = r10;
        this.A09 = r15;
        this.A0E = r20;
        this.A0K = r26;
        this.A0S = new IDxExecutorShape280S0100000_2_I0(r7, 3);
        C16620tM r1 = C16620tM.A02;
        this.A0P = r4.A03(r1, 776) > 0 ? new C28831Xx(r3, r4.A03(r1, 776), false) : null;
    }

    public final C43241zg A00(C16730tY r7) {
        synchronized (this.A0Q) {
            for (Map.Entry entry : this.A0R.entrySet()) {
                C43241zg r0 = (C43241zg) entry.getKey();
                C28381Vw r2 = r7.A11;
                if (r2 != null) {
                    Iterator it = r0.A01.iterator();
                    while (it.hasNext()) {
                        if (r2.equals(((C16730tY) it.next()).A11)) {
                            C43241zg r02 = (C43241zg) entry.getKey();
                            return r02;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    public AnonymousClass1XP A01(C16730tY r4) {
        AnonymousClass1XP r0;
        C43241zg A002 = A00(r4);
        synchronized (this.A0Q) {
            r0 = (AnonymousClass1XP) this.A0R.get(A002);
        }
        return r0;
    }

    public final void A02(C43241zg r3, AnonymousClass1XP r4) {
        synchronized (this.A0Q) {
            if (r4 == null) {
                this.A0R.remove(r3);
            } else {
                this.A0R.put(r3, r4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        if (r12.A0M.A08(r2) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0194, code lost:
        if ((r12.A05.A00() - r7) <= (((long) r3) * 60000)) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ea A[EDGE_INSN: B:66:0x00ea->B:47:0x00ea ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C43241zg r17, X.AnonymousClass1XP r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r11 = r17
            r11.A01()
            r12 = r16
            r13 = r18
            r12.A02(r11, r13)
            X.1qS r0 = r13.A00()
            X.1XK r6 = r0.A05
            java.lang.String r0 = "mms"
            r13.A0U = r0
            X.210 r0 = r13.A01()
            int r5 = r0.A01
            java.util.concurrent.CopyOnWriteArrayList r8 = r11.A01
            java.util.Iterator r2 = r8.iterator()
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r2.next()
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r1 = r0.A00
            boolean r0 = X.C16030sJ.A0O(r1)
            if (r0 != 0) goto L_0x003e
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x0022
        L_0x003e:
            r7 = 1
            if (r5 == 0) goto L_0x004d
            r0 = 4
            if (r5 == r0) goto L_0x004d
            r0 = 9
            if (r5 == r0) goto L_0x004d
            if (r5 == r7) goto L_0x004d
            r0 = 2
            if (r5 != r0) goto L_0x00ea
        L_0x004d:
            X.1XK r0 = X.AnonymousClass1XK.A08
            if (r6 == r0) goto L_0x0059
            X.1XK r0 = X.AnonymousClass1XK.A0B
            if (r6 == r0) goto L_0x0059
            X.1XK r0 = X.AnonymousClass1XK.A0X
            if (r6 != r0) goto L_0x00ea
        L_0x0059:
            X.0pd r4 = r12.A0B
            X.0tM r3 = X.C16620tM.A01
            r0 = 1539(0x603, float:2.157E-42)
            boolean r0 = r4.A0E(r3, r0)
            if (r0 == 0) goto L_0x00ea
            java.util.List r1 = java.util.Collections.unmodifiableList(r8)
            int r0 = r1.size()
            r2 = 0
            if (r0 != r7) goto L_0x0082
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r1 = r0.A00
            boolean r0 = X.C16030sJ.A0O(r1)
            if (r0 == 0) goto L_0x0082
            r2 = r1
        L_0x0082:
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            int r0 = r0.size()
            r1 = 0
            if (r0 > r7) goto L_0x008e
            r7 = 0
        L_0x008e:
            java.util.Iterator r8 = r8.iterator()
        L_0x0092:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r0 = r8.next()
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x0092
            r0 = 1
        L_0x00a9:
            if (r7 == 0) goto L_0x01a5
            r10 = 1
        L_0x00ac:
            byte r0 = r6.A00
            int r9 = X.C42141xI.A00(r0, r5, r1)
            if (r2 == 0) goto L_0x00ea
            r0 = 2419(0x973, float:3.39E-42)
            int r3 = r4.A03(r3, r0)
            if (r3 > 0) goto L_0x0171
            X.125 r0 = r12.A0M
            boolean r0 = r0.A08(r2)
            if (r0 != 0) goto L_0x0196
        L_0x00c4:
            X.0t9 r5 = r12.A0C
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r0 = 22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.21I r1 = new X.21I
            r1.<init>()
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0G = r0
            r1.A0H = r4
            r1.A0I = r2
            r1.A0E = r3
            r5.A06(r1)
        L_0x00ea:
            r0 = 5
            com.facebook.redex.IDxNConsumerShape17S0300000_2_I0 r1 = new com.facebook.redex.IDxNConsumerShape17S0300000_2_I0
            r1.<init>(r11, r12, r13, r0)
            java.util.concurrent.Executor r3 = r12.A0S
            X.1XS r0 = r13.A09
            r0.A03(r1, r3)
            r2 = 4
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r4 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0
            r4.<init>(r11, r2, r12)
            X.1XS r1 = r13.A07
            r0 = 0
            r1.A03(r4, r0)
            r4 = 2
            com.facebook.redex.IDxNConsumerShape15S0300000_1_I0 r1 = new com.facebook.redex.IDxNConsumerShape15S0300000_1_I0
            r1.<init>(r11, r12, r13, r4)
            r5 = 0
            X.1XS r0 = r13.A08
            r0.A03(r1, r5)
            r0 = 0
            com.facebook.redex.IDxNConsumerShape1S0302000_2_I0 r1 = new com.facebook.redex.IDxNConsumerShape1S0302000_2_I0
            r1.<init>(r11, r12, r13, r0)
            X.1XS r0 = r13.A0C
            r0.A03(r1, r3)
            com.facebook.redex.IDxNConsumerShape17S0300000_2_I0 r1 = new com.facebook.redex.IDxNConsumerShape17S0300000_2_I0
            r1.<init>(r11, r12, r13, r4)
            X.1XS r0 = r13.A0B
            r0.A03(r1, r3)
            r0 = 3
            com.facebook.redex.IDxNConsumerShape17S0300000_2_I0 r1 = new com.facebook.redex.IDxNConsumerShape17S0300000_2_I0
            r1.<init>(r11, r12, r13, r0)
            X.1XS r0 = r13.A0D
            r0.A03(r1, r5)
            com.facebook.redex.IDxNConsumerShape17S0300000_2_I0 r1 = new com.facebook.redex.IDxNConsumerShape17S0300000_2_I0
            r1.<init>(r11, r12, r13, r2)
            X.1XS r0 = r13.A0F
            r0.A03(r1, r3)
            r4 = 1
            com.facebook.redex.IDxNConsumerShape1S0302000_2_I0 r1 = new com.facebook.redex.IDxNConsumerShape1S0302000_2_I0
            r1.<init>(r11, r12, r13, r4)
            X.1XS r0 = r13.A0G
            r0.A03(r1, r3)
            X.2Ji r2 = new X.2Ji
            r2.<init>(r11, r12, r13, r6)
            java.lang.String r1 = r13.A0U
            java.lang.String r0 = "express"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0158
            X.1XS r0 = r13.A06
            r0.A03(r2, r5)
        L_0x0158:
            com.facebook.redex.IDxNConsumerShape17S0300000_2_I0 r1 = new com.facebook.redex.IDxNConsumerShape17S0300000_2_I0
            r1.<init>(r11, r12, r13, r4)
            X.1XS r0 = r13.A05
            r0.A03(r1, r5)
            X.2Jj r10 = new X.2Jj
            r14 = r19
            r15 = r20
            r10.<init>(r11, r12, r13, r14, r15)
            X.1XS r0 = r13.A0A
            r0.A03(r10, r3)
            return
        L_0x0171:
            r0 = 5
            if (r3 >= r0) goto L_0x0196
            X.125 r0 = r12.A0M
            long r7 = r0.A01(r2)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c4
            r1 = 1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0196
            X.0t3 r0 = r12.A05
            long r4 = r0.A00()
            long r4 = r4 - r7
            long r2 = (long) r3
            r0 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00c4
        L_0x0196:
            java.lang.String r0 = "express"
            r13.A0U = r0
            X.1zh r1 = r13.A0K
            X.AnonymousClass00B.A06(r1)
            r0 = 4
            r1.A04(r0)
            goto L_0x00ea
        L_0x01a5:
            r10 = 2
            if (r0 == 0) goto L_0x00ac
            r10 = 3
            goto L_0x00ac
        L_0x01ab:
            r0 = 0
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HE.A03(X.1zg, X.1XP, boolean, boolean):void");
    }

    public void A04(C16740tZ r4, boolean z2) {
        if (!(r4 instanceof C16730tY)) {
            StringBuilder sb = new StringBuilder("mediajobmanager/cancelmessage; attempt to cancel non-media message: ");
            sb.append(r4.A11);
            Log.e(sb.toString());
        } else if (C42881yp.A02(r4.A0C, 2)) {
            StringBuilder sb2 = new StringBuilder("mediajobmanager/cancelmessage; attempt to cancel uploaded message: ");
            sb2.append(r4.A11);
            Log.e(sb2.toString());
            if (z2) {
                this.A01.A09(R.string.str08e6, 0);
            }
        } else {
            StringBuilder sb3 = new StringBuilder("mediajobmanager/cancelmessage: ");
            sb3.append(r4.A11);
            Log.e(sb3.toString());
            this.A0L.A01(r4);
            AnonymousClass2CQ r2 = new AnonymousClass2CQ(this, Collections.singletonList(r4));
            this.A0O.Acl(r2);
            r2.A01(new IDxNConsumerShape39S0200000_2_I0(r4, 5, this), this.A0S);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r1 == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.C16730tY r6) {
        /*
            r5 = this;
            X.0ta r0 = r6.A02
            r4 = 1
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x000a
            return r4
        L_0x000a:
            X.1XP r3 = r5.A01(r6)
            if (r3 == 0) goto L_0x0043
            X.0wL r0 = r5.A0D
            X.1Rp r2 = r0.A0B
            X.210 r0 = r3.A01()
            X.1XK r1 = r0.A05
            X.1Ra r0 = r2.A05
            X.1zt r0 = r0.A00(r1)
            java.lang.Runnable r2 = r0.A00(r3)
            X.1zx r2 = (X.C43411zx) r2
            if (r2 == 0) goto L_0x0043
            monitor-enter(r2)
            X.1zu r1 = r2.A00     // Catch:{ all -> 0x0040 }
            monitor-enter(r1)     // Catch:{ all -> 0x0040 }
            X.1zm r0 = r1.A00     // Catch:{ all -> 0x003d }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0038
            boolean r1 = r0.AHe()     // Catch:{ all -> 0x0040 }
            r0 = 1
            if (r1 != 0) goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0043
            return r4
        L_0x003d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0043:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HE.A05(X.0tY):boolean");
    }

    public boolean A06(C16730tY r4) {
        boolean containsKey;
        AnonymousClass1XP A012 = A01(r4);
        if (A012 != null) {
            C27411Rq r2 = this.A0D.A0E;
            synchronized (r2) {
                containsKey = r2.A01.containsKey(A012);
            }
            return containsKey;
        }
    }
}
