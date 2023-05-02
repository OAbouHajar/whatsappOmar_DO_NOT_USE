package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0pj  reason: invalid class name and case insensitive filesystem */
public class C14770pj {
    public long A00 = (System.currentTimeMillis() - 200);
    public Handler A01;
    public C45992Bx A02;
    public boolean A03;
    public final C16300so A04;
    public final AnonymousClass15Q A05;
    public final C16040sK A06;
    public final C15900s5 A07;
    public final C16000sG A08;
    public final C16080sP A09;
    public final AnonymousClass01V A0A;
    public final C16440t3 A0B;
    public final C16980tz A0C;
    public final C19380yL A0D;
    public final C15860rz A0E;
    public final AnonymousClass013 A0F;
    public final C15810rt A0G;
    public final C16460t6 A0H;
    public final C216314v A0I;
    public final C19780yz A0J;
    public final AnonymousClass15G A0K;
    public final C16500tA A0L;
    public final C14710pd A0M;
    public final C20260zl A0N;
    public final C45932Br A0O = new C45932Br(this);
    public final C218415q A0P;
    public final C218515r A0Q;
    public final C19320yF A0R;
    public final C16220sf A0S;
    public final C16320sq A0T;
    public final Map A0U = new HashMap();
    public volatile long A0V;

    public C14770pj(C16300so r5, AnonymousClass15Q r6, C16040sK r7, C15900s5 r8, C16000sG r9, C16080sP r10, AnonymousClass01V r11, C16440t3 r12, C16980tz r13, C19380yL r14, C15860rz r15, AnonymousClass013 r16, C15810rt r17, C16460t6 r18, C216314v r19, C19780yz r20, AnonymousClass15G r21, C16500tA r22, C14710pd r23, C20260zl r24, C218415q r25, C218515r r26, C19320yF r27, C16220sf r28, C16320sq r29) {
        this.A0C = r13;
        this.A0B = r12;
        this.A0M = r23;
        this.A0I = r19;
        this.A04 = r5;
        this.A06 = r7;
        this.A0T = r29;
        this.A0G = r17;
        this.A07 = r8;
        this.A0N = r24;
        this.A08 = r9;
        this.A0A = r11;
        this.A09 = r10;
        this.A0F = r16;
        this.A0H = r18;
        this.A0J = r20;
        this.A0S = r28;
        this.A0P = r25;
        this.A0R = r27;
        AnonymousClass15G r1 = r21;
        this.A0K = r1;
        this.A0L = r22;
        this.A0E = r15;
        this.A0Q = r26;
        this.A0D = r14;
        this.A05 = r6;
        r1.A0L = new C45942Bs(this);
    }

    public static final void A00(List list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(((C37871ps) it.next()).A00.A11.A01);
                sb.append(' ');
            }
            sb.toString();
        }
    }

    public synchronized Handler A01() {
        Handler handler;
        handler = this.A01;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("Notifications", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A01 = handler;
        }
        return handler;
    }

    public C37871ps A02(C16740tZ r12) {
        C16300so r1 = this.A04;
        C16040sK r2 = this.A06;
        C15900s5 r3 = this.A07;
        C16000sG r4 = this.A08;
        AnonymousClass01V r6 = this.A0A;
        return new C37871ps(r1, r2, r3, r4, this.A09, r6, this.A0F, this.A0L, this.A0P, r12);
    }

    public C37871ps A03(AnonymousClass23Z r13) {
        C16980tz r7 = this.A0C;
        C16300so r1 = this.A04;
        C16040sK r2 = this.A06;
        C15900s5 r3 = this.A07;
        C16000sG r4 = this.A08;
        AnonymousClass01V r6 = this.A0A;
        return new C45962Bu(r1, r2, r3, r4, this.A09, r6, r7, this.A0F, this.A0L, this.A0P, r13);
    }

    public C37871ps A04(C441623a r13) {
        C16980tz r7 = this.A0C;
        C16300so r1 = this.A04;
        C16040sK r2 = this.A06;
        C15900s5 r3 = this.A07;
        C16000sG r4 = this.A08;
        AnonymousClass01V r6 = this.A0A;
        return new C45982Bw(r1, r2, r3, r4, this.A09, r6, r7, this.A0F, this.A0L, this.A0P, r13);
    }

    public final C45992Bx A05(C15830rv r100, C16740tZ r101, int i2, boolean z2, boolean z3, boolean z4, boolean z5) {
        C16150sX r0 = this.A05.A00.A01;
        Context context = r0.AS2.A00;
        C16340ss.A01(context);
        C16440t3 r43 = (C16440t3) r0.AP2.get();
        C14710pd r42 = (C14710pd) r0.A05.get();
        C14870pt r41 = (C14870pt) r0.AB3.get();
        C16040sK r40 = (C16040sK) r0.ADr.get();
        C15810rt r39 = (C15810rt) r0.A43.get();
        AnonymousClass17V r38 = (AnonymousClass17V) r0.AFA.get();
        C216014s r37 = (C216014s) r0.AMr.get();
        C20260zl A1H = r0.A1H();
        C17200uh r36 = (C17200uh) r0.A52.get();
        C17650vQ A0J2 = C16150sX.A0J(r0);
        AnonymousClass18Z r35 = (AnonymousClass18Z) r0.ARC.get();
        AnonymousClass15P r34 = (AnonymousClass15P) r0.A0b.get();
        C17160ud r33 = (C17160ud) r0.A4t.get();
        C16000sG r32 = (C16000sG) r0.A4x.get();
        AnonymousClass17U r31 = (AnonymousClass17U) r0.AGc.get();
        AnonymousClass01V r30 = (AnonymousClass01V) r0.AOi.get();
        C16080sP r29 = (C16080sP) r0.AQ9.get();
        AnonymousClass013 r28 = (AnonymousClass013) r0.AR8.get();
        AnonymousClass18Y r27 = (AnonymousClass18Y) r0.AMV.get();
        AnonymousClass15O r26 = (AnonymousClass15O) r0.A0k.get();
        AnonymousClass01Y r25 = (AnonymousClass01Y) r0.A1w.get();
        C17240ul r24 = (C17240ul) r0.ABK.get();
        AnonymousClass15I r23 = (AnonymousClass15I) r0.A3r.get();
        C16220sf r22 = (C16220sf) r0.A3y.get();
        C223017k r21 = (C223017k) r0.ABT.get();
        C218415q r20 = (C218415q) r0.AGN.get();
        C19740yv r19 = (C19740yv) r0.AQi.get();
        AnonymousClass15N r18 = (AnonymousClass15N) r0.APw.get();
        C18040w3 r17 = (C18040w3) r0.AR0.get();
        C14770pj r16 = (C14770pj) r0.AF9.get();
        C16080sP r59 = r29;
        C17200uh r60 = r36;
        C15800rs r61 = (C15800rs) r0.A5c.get();
        AnonymousClass15I r62 = r23;
        C19610yi r63 = (C19610yi) r0.AEq.get();
        AnonymousClass17V r64 = r38;
        AnonymousClass01V r65 = r30;
        C16440t3 r66 = r43;
        C19380yL r67 = (C19380yL) r0.AQd.get();
        C16260sj r68 = (C16260sj) r0.AQe.get();
        C15860rz r69 = (C15860rz) r0.AQh.get();
        AnonymousClass013 r70 = r28;
        C15810rt r71 = r39;
        C16070sO r72 = (C16070sO) r0.ABY.get();
        AnonymousClass15N r73 = r18;
        C14710pd r74 = r42;
        C221016q r76 = (C221016q) r0.AQw.get();
        C18040w3 r77 = r17;
        C17240ul r78 = r24;
        C14770pj r80 = r16;
        C216714z r81 = (C216714z) r0.AF8.get();
        C218415q r82 = r20;
        AnonymousClass150 r83 = (AnonymousClass150) r0.AIw.get();
        AnonymousClass18Y r84 = r27;
        AnonymousClass17U r85 = r31;
        return new C45992Bx(context, (C16570tH) r0.A0e.get(), (AnonymousClass12E) r0.A5Y.get(), r41, r40, r19, r35, r34, r25, (C216514x) r0.ALV.get(), A0J2, r33, r32, (C17030uP) r0.APp.get(), r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, A1H, r76, r77, r78, r100, r80, r81, r82, r83, r84, r85, r101, (C15960sC) r0.AKz.get(), (C19490yW) r0.ALQ.get(), r22, r37, (AnonymousClass135) r0.AP7.get(), r26, r21, i2, z2, z3, z4, z5);
    }

    public List A06(C15830rv r6, int i2) {
        int A002 = this.A0G.A00(r6);
        ArrayList arrayList = new ArrayList();
        if (A002 > i2) {
            arrayList.addAll(this.A0J.A03(r6, Math.min(A002, 7)));
        }
        int i3 = 0;
        while (i3 < arrayList.size() && ((C16740tZ) arrayList.get(i3)).A0C <= 13) {
            i3++;
        }
        int size = arrayList.size();
        List<C16740tZ> list = arrayList;
        if (i3 < size) {
            list = arrayList.subList(0, i3);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C16740tZ A022 : list) {
            arrayList2.add(A02(A022));
        }
        List<C441623a> emptyList = Collections.emptyList();
        if (!this.A0S.A07(r6.getRawString()).A02().A0F) {
            emptyList = this.A0K.A07(r6);
        }
        for (C441623a A042 : emptyList) {
            arrayList2.add(A04(A042));
        }
        for (AnonymousClass23Z A032 : this.A0K.A06(r6)) {
            arrayList2.add(A03(A032));
        }
        Collections.sort(arrayList2, new C46002By(true));
        return arrayList2;
    }

    public void A07() {
        C19320yF r1 = this.A0R;
        synchronized (r1) {
            r1.A01 = null;
            r1.A00 = null;
        }
    }

    public void A08() {
        A0C((C16740tZ) null, true, true, false, false, false);
    }

    public void A09(C15830rv r4) {
        A01().post(new RunnableRunnableShape9S0200000_I0_7(this, 8, r4));
        A07();
    }

    public void A0A(C15830rv r4, C16740tZ r5) {
        A01().post(new RunnableRunnableShape1S0300000_I0_1(this, r5, r4, 30));
    }

    public void A0B(C16740tZ r8, boolean z2, boolean z3) {
        A0C(r8, z2, this.A03, false, false, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r21 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r0 != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.C16740tZ r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r20 = this;
            r8 = r21
            if (r21 == 0) goto L_0x000f
            X.1Vw r0 = r8.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            r6 = r20
            r11 = r23
            r12 = r24
            if (r22 != 0) goto L_0x003e
            if (r21 == 0) goto L_0x003e
            X.0yF r14 = r6.A0R
            X.2Br r2 = r6.A0O
            monitor-enter(r14)
            boolean r0 = r14.A03     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0038
            X.1Vw r1 = r8.A11     // Catch:{ all -> 0x003b }
            X.0t3 r0 = r14.A05     // Catch:{ all -> 0x003b }
            long r16 = r0.A00()     // Catch:{ all -> 0x003b }
            X.2Bt r13 = new X.2Bt     // Catch:{ all -> 0x003b }
            r15 = r1
            r18 = r11
            r19 = r12
            r13.<init>(r14, r15, r16, r18, r19)     // Catch:{ all -> 0x003b }
            r14.A01 = r13     // Catch:{ all -> 0x003b }
            r14.A00 = r2     // Catch:{ all -> 0x003b }
        L_0x0038:
            boolean r0 = r14.A03     // Catch:{ all -> 0x003b }
            goto L_0x0093
        L_0x003b:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x003e:
            r0 = 0
            if (r21 != 0) goto L_0x0094
        L_0x0041:
            r7 = 0
            if (r22 != 0) goto L_0x0047
            r10 = 0
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r10 = 1
        L_0x0048:
            r9 = 0
            r13 = r26
            X.2Bx r2 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            X.2Bx r0 = r6.A02
            if (r0 == 0) goto L_0x0062
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0062
            android.os.Handler r1 = r6.A01()
            X.2Bx r0 = r6.A02
            r1.removeCallbacks(r0)
        L_0x0062:
            r6.A02 = r2
            if (r25 == 0) goto L_0x0089
            long r4 = android.os.SystemClock.uptimeMillis()
            long r0 = r6.A0V
            long r4 = r4 - r0
            r2 = 4000(0xfa0, double:1.9763E-320)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            java.lang.String r0 = "messagenotification/posting delayed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r6.A01()
            X.2Bx r0 = r6.A02
            long r2 = r2 - r4
            r1.postDelayed(r0, r2)
        L_0x0082:
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.A0V = r0
            return
        L_0x0089:
            android.os.Handler r1 = r6.A01()
            X.2Bx r0 = r6.A02
            r1.post(r0)
            goto L_0x0082
        L_0x0093:
            monitor-exit(r14)
        L_0x0094:
            X.C38621r6.A0J(r8)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14770pj.A0C(X.0tZ, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0D(C28381Vw r9, boolean z2, boolean z3) {
        if (r9 != null) {
            C16740tZ A032 = this.A0H.A0K.A03(r9);
            if (A032 != null) {
                C38621r6.A0J(A032);
                A0C(A032, false, z2, z3, false, true);
                return;
            }
            Log.i("messagenotification/refreshStatusBarNotificationIfMessageExists/no-message");
            return;
        }
        Log.e("messagenotification/refreshStatusBarNotificationIfMessageExists/no-messag-key");
    }

    public void A0E(boolean z2) {
        A01().post(new RunnableRunnableShape0S0110000_I0(this, 20, z2));
        A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r0 == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(X.C37871ps r6) {
        /*
            r5 = this;
            r3 = 0
            if (r6 == 0) goto L_0x0087
            X.0tZ r2 = r6.A00
            byte r1 = r2.A10
            r0 = 36
            if (r1 == r0) goto L_0x0087
            X.0zl r1 = r5.A0N
            X.1Vw r0 = r2.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C40561uK.A01(r1, r0)
            if (r0 != 0) goto L_0x0087
            X.1Vw r0 = r2.A11
            X.0rv r3 = r0.A00
            X.AnonymousClass00B.A06(r6)
            X.0tZ r4 = r6.A00
            java.util.List r1 = r4.A0q
            r2 = 1
            if (r1 == 0) goto L_0x0033
            X.0sK r0 = r5.A06
            r0.A0B()
            X.1ZT r0 = r0.A05
            boolean r0 = r1.contains(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            X.0tZ r0 = r4.A0D()
            if (r0 == 0) goto L_0x0085
            X.0rv r0 = r0.A0B()
            if (r0 != 0) goto L_0x0085
        L_0x0040:
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x0083
            if (r2 != 0) goto L_0x004e
            if (r1 == 0) goto L_0x0083
        L_0x004e:
            X.0sf r1 = r5.A0S
            X.0rv r0 = r4.A0B()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            X.1WS r0 = r1.A07(r0)
            boolean r2 = r0.A0A()
        L_0x0063:
            if (r3 == 0) goto L_0x006e
            X.0rt r0 = r5.A0G
            boolean r0 = r0.A0G(r3)
            if (r0 == 0) goto L_0x006e
        L_0x006d:
            return r2
        L_0x006e:
            X.0sf r1 = r5.A0S
            X.AnonymousClass00B.A06(r3)
            java.lang.String r0 = r3.getRawString()
            X.1WS r0 = r1.A07(r0)
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x006d
            r2 = 1
            return r2
        L_0x0083:
            r2 = 0
            goto L_0x0063
        L_0x0085:
            r2 = 0
            goto L_0x0040
        L_0x0087:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14770pj.A0F(X.1ps):boolean");
    }
}
