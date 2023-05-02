package X;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.facebook.redex.IDxEventShape165S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.google.android.exoplayer2.Timeline;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.3UF  reason: invalid class name */
public final class AnonymousClass3UF extends AnonymousClass2PS implements AnonymousClass2PU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C90184df A05;
    public C88884bF A06;
    public AnonymousClass5TE A07;
    public boolean A08;
    public final Looper A09;
    public final AnonymousClass5L5 A0A;
    public final C97274pg A0B;
    public final AnonymousClass4XE A0C;
    public final C96224nz A0D;
    public final AnonymousClass5LL A0E;
    public final AnonymousClass4GL A0F;
    public final AnonymousClass4LY A0G;
    public final AnonymousClass5LX A0H;
    public final AnonymousClass5TU A0I;
    public final C107695La A0J;
    public final C87304Wf A0K;
    public final List A0L;
    public final boolean A0M = true;
    public final AnonymousClass5UO[] A0N;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00c9, code lost:
        if (r8.A06.A03.isEmpty() != false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3UF(android.os.Looper r25, X.AnonymousClass5L6 r26, X.AnonymousClass5L7 r27, X.AnonymousClass2PT r28, X.C88884bF r29, X.C96224nz r30, X.AnonymousClass5LL r31, X.AnonymousClass4GL r32, X.AnonymousClass5LX r33, X.AnonymousClass5TU r34, X.AnonymousClass5UO[] r35) {
        /*
            r24 = this;
            r2 = 1
            r12 = 0
            r3 = r24
            r3.<init>()
            java.lang.String r0 = "Init "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.AnonymousClass000.A1G(r3, r1)
            java.lang.String r0 = " ["
            r1.append(r0)
            java.lang.String r0 = "ExoPlayerLib/2.13.3"
            r1.append(r0)
            java.lang.String r0 = "] ["
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass3C1.A03
            r1.append(r0)
            java.lang.String r0 = "]"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "ExoPlayerImpl"
            android.util.Log.i(r0, r1)
            r4 = r35
            int r11 = r4.length
            boolean r0 = X.AnonymousClass000.A1Q(r11)
            X.C90524eJ.A04(r0)
            r3.A0N = r4
            r7 = r32
            r3.A0F = r7
            r0 = r31
            r3.A0E = r0
            r6 = r33
            r3.A0H = r6
            r8 = r30
            r3.A0D = r8
            r3.A0M = r2
            r9 = r29
            r3.A06 = r9
            r13 = r25
            r3.A09 = r13
            r5 = r34
            r3.A0I = r5
            com.facebook.redex.IDxSupplierShape48S0000000_2_I1 r10 = new com.facebook.redex.IDxSupplierShape48S0000000_2_I1
            r10.<init>(r12)
            X.4qU r1 = new X.4qU
            r2 = r28
            r1.<init>(r2)
            java.util.concurrent.CopyOnWriteArraySet r19 = new java.util.concurrent.CopyOnWriteArraySet
            r19.<init>()
            X.4Wf r0 = new X.4Wf
            r14 = r0
            r15 = r13
            r16 = r5
            r17 = r1
            r18 = r10
            r14.<init>(r15, r16, r17, r18, r19)
            r3.A0K = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r3.A0L = r0
            java.util.Random r10 = new java.util.Random
            r10.<init>()
            int[] r1 = new int[r12]
            X.4pt r0 = new X.4pt
            r0.<init>(r10, r1)
            r3.A07 = r0
            X.4bE[] r1 = new X.C88874bE[r11]
            X.5UR[] r0 = new X.AnonymousClass5UR[r11]
            r11 = 0
            X.4LY r10 = new X.4LY
            r10.<init>(r11, r1, r0)
            r3.A0G = r10
            X.4XE r0 = new X.4XE
            r0.<init>()
            r3.A0C = r0
            r0 = -1
            r3.A00 = r0
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r13, r11)
            X.4qO r0 = new X.4qO
            r0.<init>(r1)
            r3.A0J = r0
            X.4nt r14 = new X.4nt
            r14.<init>(r3)
            r3.A0A = r14
            X.4df r0 = X.C90184df.A00(r10)
            r3.A05 = r0
            X.2PT r0 = r8.A00
            if (r0 == 0) goto L_0x00cb
            X.3AT r0 = r8.A06
            X.1kb r0 = r0.A03
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00cc
        L_0x00cb:
            r0 = 1
        L_0x00cc:
            X.C90524eJ.A04(r0)
            r8.A00 = r2
            X.4Wf r0 = r8.A01
            X.4qV r12 = new X.4qV
            r12.<init>(r2, r8)
            java.util.concurrent.CopyOnWriteArraySet r11 = r0.A07
            X.5TU r2 = r0.A01
            X.5OI r1 = r0.A04
            X.4Wf r0 = new X.4Wf
            r15 = r0
            r16 = r13
            r17 = r2
            r18 = r12
            r19 = r1
            r20 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            r8.A01 = r0
            r3.A4a(r8)
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r13)
            r0 = r6
            X.3E2 r0 = (X.AnonymousClass3E2) r0
            X.4Pt r0 = r0.A09
            r0.A00(r8)
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A00
            X.4Je r0 = new X.4Je
            r0.<init>(r2, r8)
            r1.add(r0)
            X.4pg r12 = new X.4pg
            r15 = r26
            r16 = r27
            r23 = r4
            r21 = r6
            r22 = r5
            r19 = r7
            r20 = r10
            r18 = r8
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.A0B = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UF.<init>(android.os.Looper, X.5L6, X.5L7, X.2PT, X.4bF, X.4nz, X.5LL, X.4GL, X.5LX, X.5TU, X.5UO[]):void");
    }

    public static void A00(C87304Wf r1, Object obj, int i2, int i3) {
        r1.A02(new IDxEventShape165S0100000_2_I1(obj, i2), i3);
    }

    public final int A01() {
        C90184df r1 = this.A05;
        Timeline timeline = r1.A05;
        if (AnonymousClass000.A1P(timeline.A01())) {
            return this.A00;
        }
        return AnonymousClass4XE.A00(this.A0C, timeline, r1.A07.A04);
    }

    public final Pair A02(Timeline timeline, int i2, long j2) {
        Timeline timeline2 = timeline;
        int i3 = i2;
        if (AnonymousClass000.A1P(timeline.A01())) {
            this.A00 = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.A04 = j2;
            return null;
        }
        if (i2 == -1 || i2 >= timeline.A01()) {
            i3 = timeline.A05(false);
            timeline.A0A(this.A00, i3, 0);
            j2 = 0;
        }
        return timeline2.A07(this.A0C, this.A00, i3, C90604eR.A01(j2), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r24 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C90184df A03(android.util.Pair r24, X.C90184df r25, com.google.android.exoplayer2.Timeline r26) {
        /*
            r23 = this;
            r5 = r26
            int r0 = r5.A01()
            boolean r1 = X.AnonymousClass000.A1P(r0)
            r3 = r24
            if (r1 != 0) goto L_0x0011
            r0 = 0
            if (r24 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.C90524eJ.A03(r0)
            r0 = r25
            com.google.android.exoplayer2.Timeline r7 = r0.A05
            X.4df r12 = r0.A05(r5)
            r2 = r23
            if (r1 == 0) goto L_0x0042
            X.1c3 r13 = X.C90184df.A0I
            long r0 = r2.A04
            long r17 = X.C90604eR.A01(r0)
            r21 = 0
            X.4jT r14 = X.C93604jT.A03
            X.4LY r15 = r2.A0G
            X.1kb r16 = X.C34641kb.of()
            r19 = r17
            X.4df r0 = r12.A07(r13, r14, r15, r16, r17, r19, r21)
            X.4df r2 = r0.A06(r13)
            long r0 = r2.A0G
            r2.A0F = r0
            return r2
        L_0x0042:
            X.1c3 r8 = r12.A07
            java.lang.Object r6 = r8.A04
            java.lang.Object r0 = r3.first
            boolean r0 = r6.equals(r0)
            r11 = r0 ^ 1
            if (r11 == 0) goto L_0x00f1
            java.lang.Object r0 = r3.first
            X.1c3 r13 = new X.1c3
            r13.<init>((java.lang.Object) r0)
        L_0x0057:
            java.lang.Object r0 = r3.second
            long r0 = X.C13700nu.A01(r0)
            long r3 = r2.AAw()
            long r9 = X.C90604eR.A01(r3)
            int r3 = r7.A01()
            boolean r3 = X.AnonymousClass000.A1P(r3)
            if (r3 != 0) goto L_0x0078
            X.4XE r3 = r2.A0C
            X.4XE r3 = r7.A09(r3, r6)
            long r3 = r3.A02
            long r9 = r9 - r3
        L_0x0078:
            if (r11 != 0) goto L_0x00d2
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x00d2
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x00f4
            X.1c3 r0 = r12.A06
            java.lang.Object r0 = r0.A04
            int r1 = r5.A04(r0)
            r0 = -1
            if (r1 == r0) goto L_0x009e
            X.4XE r3 = r2.A0C
            r0 = 0
            X.4XE r0 = r5.A08(r3, r1, r0)
            int r1 = r0.A00
            java.lang.Object r0 = r13.A04
            int r0 = X.AnonymousClass4XE.A00(r3, r5, r0)
            if (r1 == r0) goto L_0x00ce
        L_0x009e:
            java.lang.Object r0 = r13.A04
            X.4XE r1 = r2.A0C
            r5.A09(r1, r0)
            boolean r0 = r13.A00()
            if (r0 == 0) goto L_0x00cf
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00b0:
            long r2 = r12.A0G
            long r6 = r12.A0G
            long r4 = r12.A0G
            long r21 = r0 - r4
            X.4jT r14 = r12.A08
            X.4LY r15 = r12.A09
            java.util.List r4 = r12.A0A
        L_0x00be:
            r19 = r6
            r16 = r4
            r17 = r2
            X.4df r2 = r12.A07(r13, r14, r15, r16, r17, r19, r21)
            X.4df r12 = r2.A06(r13)
            r12.A0F = r0
        L_0x00ce:
            return r12
        L_0x00cf:
            long r0 = r1.A01
            goto L_0x00b0
        L_0x00d2:
            boolean r3 = r13.A00()
            r3 = r3 ^ 1
            X.C90524eJ.A04(r3)
            if (r11 == 0) goto L_0x00ea
            X.4jT r14 = X.C93604jT.A03
            X.4LY r15 = r2.A0G
            X.1kb r4 = X.C34641kb.of()
        L_0x00e5:
            r21 = 0
            r6 = r0
            r2 = r0
            goto L_0x00be
        L_0x00ea:
            X.4jT r14 = r12.A08
            X.4LY r15 = r12.A09
            java.util.List r4 = r12.A0A
            goto L_0x00e5
        L_0x00f1:
            r13 = r8
            goto L_0x0057
        L_0x00f4:
            boolean r2 = r13.A00()
            r2 = r2 ^ 1
            X.C90524eJ.A04(r2)
            r4 = 0
            long r2 = r12.A0H
            long r6 = r0 - r9
            long r2 = r2 - r6
            long r16 = java.lang.Math.max(r4, r2)
            long r3 = r12.A0F
            X.1c3 r2 = r12.A06
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0114
            long r3 = r0 + r16
        L_0x0114:
            X.4jT r6 = r12.A08
            X.4LY r5 = r12.A09
            java.util.List r2 = r12.A0A
            r14 = r0
            r7 = r12
            r8 = r13
            r9 = r6
            r10 = r5
            r11 = r2
            r12 = r0
            X.4df r12 = r7.A07(r8, r9, r10, r11, r12, r14, r16)
            r12.A0F = r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UF.A03(android.util.Pair, X.4df, com.google.android.exoplayer2.Timeline):X.4df");
    }

    public void A04(int i2, int i3, boolean z2) {
        C90184df r1 = this.A05;
        if (r1.A0D != z2 || r1.A01 != i2) {
            this.A02++;
            C90184df A022 = r1.A02(i2, z2);
            ((C97684qO) this.A0B.A0Y).A00.obtainMessage(1, z2 ? 1 : 0, i2).sendToTarget();
            A06(A022, 4, 0, i3, false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r6 > r3.size()) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C804643y r26, boolean r27) {
        /*
            r25 = this;
            r2 = r25
            if (r27 == 0) goto L_0x0036
            java.util.List r3 = r2.A0L
            int r6 = r3.size()
            r5 = 0
            if (r6 < r5) goto L_0x0014
            int r1 = r3.size()
            r0 = 1
            if (r6 <= r1) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            X.C90524eJ.A03(r0)
            int r16 = r2.ABW()
            X.4df r0 = r2.A05
            com.google.android.exoplayer2.Timeline r0 = r0.A05
            r17 = r0
            int r12 = r3.size()
            int r0 = r2.A02
            int r0 = r0 + 1
            r2.A02 = r0
            int r0 = r6 + -1
        L_0x002e:
            if (r0 < r5) goto L_0x0047
            r3.remove(r0)
            int r0 = r0 + -1
            goto L_0x002e
        L_0x0036:
            X.4df r1 = r2.A05
            X.1c3 r0 = r1.A07
            X.4df r3 = r1.A06(r0)
            long r0 = r3.A0G
            r3.A0F = r0
            r0 = 0
            r3.A0H = r0
            goto L_0x00b3
        L_0x0047:
            X.5TE r0 = r2.A07
            X.5TE r0 = r0.A6K(r5, r6)
            r2.A07 = r0
            X.3UE r4 = new X.3UE
            r4.<init>(r0, r3)
            X.4df r11 = r2.A05
            long r0 = r2.AAw()
            int r3 = r17.A01()
            boolean r7 = X.AnonymousClass000.A1P(r3)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = -1
            if (r7 != 0) goto L_0x0123
            int r7 = r4.A01()
            boolean r7 = X.AnonymousClass000.A1P(r7)
            if (r7 == 0) goto L_0x00df
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0079:
            android.util.Pair r15 = r2.A02(r4, r3, r0)
        L_0x007d:
            X.4df r4 = r2.A03(r15, r11, r4)
            int r1 = r4.A00
            r3 = 4
            r0 = 1
            if (r1 == r0) goto L_0x009b
            if (r1 == r3) goto L_0x009b
            if (r5 >= r6) goto L_0x009b
            if (r6 != r12) goto L_0x009b
            com.google.android.exoplayer2.Timeline r0 = r4.A05
            int r1 = r0.A01()
            r0 = r16
            if (r0 < r1) goto L_0x009b
            X.4df r4 = r4.A01(r3)
        L_0x009b:
            X.4pg r0 = r2.A0B
            X.5TE r3 = r2.A07
            X.5La r0 = r0.A0Y
            r1 = 20
            X.4qO r0 = (X.C97684qO) r0
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = r0.obtainMessage(r1, r5, r6, r3)
            r0.sendToTarget()
            r0 = 0
            X.4df r3 = r4.A03(r0)
        L_0x00b3:
            r0 = 1
            X.4df r3 = r3.A01(r0)
            r0 = r26
            if (r26 == 0) goto L_0x00c0
            X.4df r3 = r3.A03(r0)
        L_0x00c0:
            int r0 = r2.A02
            int r0 = r0 + 1
            r2.A02 = r0
            X.4pg r0 = r2.A0B
            X.5La r0 = r0.A0Y
            r1 = 6
            X.4qO r0 = (X.C97684qO) r0
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.sendToTarget()
            r5 = 0
            r4 = 4
            r7 = 0
            r8 = 0
            r6 = 1
            r2.A06(r3, r4, r5, r6, r7, r8)
            return
        L_0x00df:
            int r20 = r2.ABW()
            X.4by r10 = r2.A00
            X.4XE r7 = r2.A0C
            long r21 = X.C90604eR.A01(r0)
            r0 = 0
            r23 = 0
            r18 = r7
            r19 = r10
            android.util.Pair r15 = r17.A07(r18, r19, r20, r21, r23)
            java.lang.Object r13 = r15.first
            int r14 = r4.A04(r13)
            if (r14 != r3) goto L_0x007d
            r22 = 0
            r23 = 0
            r21 = r13
            r19 = r17
            r20 = r4
            r17 = r7
            r18 = r10
            java.lang.Object r13 = X.C97274pg.A01(r17, r18, r19, r20, r21, r22, r23)
            if (r13 == 0) goto L_0x011d
            r4.A09(r7, r13)
            int r3 = r7.A00
            r4.A0A(r10, r3, r0)
            goto L_0x0079
        L_0x011d:
            android.util.Pair r15 = r2.A02(r4, r3, r8)
            goto L_0x007d
        L_0x0123:
            int r3 = r2.A01()
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UF.A05(X.43y, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        if (r5 != 0) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0125, code lost:
        if (r4 != 0) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C90184df r18, int r19, int r20, int r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r11 = r17
            X.4df r10 = r11.A05
            r13 = r18
            r11.A05 = r13
            com.google.android.exoplayer2.Timeline r9 = r10.A05
            com.google.android.exoplayer2.Timeline r8 = r13.A05
            boolean r0 = r9.equals(r8)
            r7 = 1
            r16 = r0 ^ 1
            int r0 = r8.A01()
            boolean r6 = X.AnonymousClass000.A1P(r0)
            r0 = -1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r12 = r19
            if (r6 == 0) goto L_0x0171
            int r0 = r9.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0171
        L_0x002e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r14)
        L_0x0035:
            java.lang.Object r0 = r2.first
            boolean r3 = X.AnonymousClass000.A1X(r0)
            java.lang.Object r0 = r2.second
            int r4 = X.AnonymousClass000.A0D(r0)
            boolean r0 = r9.equals(r8)
            if (r0 != 0) goto L_0x0054
            X.4Wf r2 = r11.A0K
            r1 = 0
            com.facebook.redex.IDxEventShape18S0101000_2_I1 r0 = new com.facebook.redex.IDxEventShape18S0101000_2_I1
            r5 = r20
            r0.<init>(r13, r5, r1)
            r2.A02(r0, r1)
        L_0x0054:
            if (r22 == 0) goto L_0x0062
            X.4Wf r2 = r11.A0K
            r1 = 12
            X.4qR r0 = new X.4qR
            r0.<init>(r12)
            r2.A02(r0, r1)
        L_0x0062:
            if (r3 == 0) goto L_0x0083
            if (r6 != 0) goto L_0x016e
            X.1c3 r0 = r13.A07
            java.lang.Object r1 = r0.A04
            X.4XE r0 = r11.A0C
            int r1 = X.AnonymousClass4XE.A00(r0, r8, r1)
            X.4by r0 = r11.A00
            X.4by r0 = X.AnonymousClass3K4.A0O(r0, r8, r1)
            X.4Ur r3 = r0.A07
        L_0x0078:
            X.4Wf r2 = r11.A0K
            r1 = 2
            com.facebook.redex.IDxEventShape18S0101000_2_I1 r0 = new com.facebook.redex.IDxEventShape18S0101000_2_I1
            r0.<init>(r3, r4, r1)
            r2.A02(r0, r7)
        L_0x0083:
            X.43y r1 = r10.A03
            X.43y r0 = r13.A03
            if (r1 == r0) goto L_0x0094
            if (r0 == 0) goto L_0x0094
            X.4Wf r2 = r11.A0K
            r1 = 11
            r0 = 9
            A00(r2, r13, r0, r1)
        L_0x0094:
            X.4LY r0 = r10.A09
            X.4LY r2 = r13.A09
            if (r0 == r2) goto L_0x00b7
            X.4GL r1 = r11.A0F
            java.lang.Object r0 = r2.A01
            X.3Vj r1 = (X.C65593Vj) r1
            X.4S2 r0 = (X.AnonymousClass4S2) r0
            r1.A00 = r0
            X.5UR[] r0 = r2.A03
            X.4TI r4 = new X.4TI
            r4.<init>(r0)
            X.4Wf r3 = r11.A0K
            r2 = 2
            r1 = 0
            com.facebook.redex.IDxEventShape51S0200000_2_I1 r0 = new com.facebook.redex.IDxEventShape51S0200000_2_I1
            r0.<init>(r4, r1, r13)
            r3.A02(r0, r2)
        L_0x00b7:
            java.util.List r1 = r10.A0A
            java.util.List r0 = r13.A0A
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c8
            X.4Wf r2 = r11.A0K
            r1 = 3
            r0 = 7
            A00(r2, r13, r0, r1)
        L_0x00c8:
            boolean r1 = r10.A0B
            boolean r0 = r13.A0B
            if (r1 == r0) goto L_0x00d9
            X.4Wf r2 = r11.A0K
            r1 = 4
            com.facebook.redex.IDxEventShape165S0100000_2_I1 r0 = new com.facebook.redex.IDxEventShape165S0100000_2_I1
            r0.<init>(r13, r1)
            r2.A02(r0, r1)
        L_0x00d9:
            int r9 = r10.A00
            int r8 = r13.A00
            r2 = -1
            if (r9 != r8) goto L_0x00e6
            boolean r1 = r10.A0D
            boolean r0 = r13.A0D
            if (r1 == r0) goto L_0x00ec
        L_0x00e6:
            X.4Wf r1 = r11.A0K
            r0 = 0
            A00(r1, r13, r0, r2)
        L_0x00ec:
            if (r9 == r8) goto L_0x00f6
            X.4Wf r3 = r11.A0K
            r1 = 5
            r0 = 8
            A00(r3, r13, r0, r1)
        L_0x00f6:
            boolean r7 = r10.A0D
            boolean r6 = r13.A0D
            if (r7 == r6) goto L_0x010a
            X.4Wf r4 = r11.A0K
            r3 = 6
            r1 = 1
            com.facebook.redex.IDxEventShape18S0101000_2_I1 r0 = new com.facebook.redex.IDxEventShape18S0101000_2_I1
            r5 = r21
            r0.<init>(r13, r5, r1)
            r4.A02(r0, r3)
        L_0x010a:
            int r5 = r10.A01
            int r4 = r13.A01
            if (r5 == r4) goto L_0x0117
            X.4Wf r3 = r11.A0K
            r1 = 7
            r0 = 1
            A00(r3, r13, r0, r1)
        L_0x0117:
            r0 = 3
            if (r9 != r0) goto L_0x011f
            if (r7 == 0) goto L_0x011f
            r1 = 1
            if (r5 == 0) goto L_0x0120
        L_0x011f:
            r1 = 0
        L_0x0120:
            if (r8 != r0) goto L_0x0127
            if (r6 == 0) goto L_0x0127
            r0 = 1
            if (r4 == 0) goto L_0x0128
        L_0x0127:
            r0 = 0
        L_0x0128:
            if (r1 == r0) goto L_0x0132
            X.4Wf r3 = r11.A0K
            r1 = 8
            r0 = 6
            A00(r3, r13, r0, r1)
        L_0x0132:
            X.4bm r1 = r10.A04
            X.4bm r0 = r13.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0144
            X.4Wf r3 = r11.A0K
            r1 = 13
            r0 = 3
            A00(r3, r13, r0, r1)
        L_0x0144:
            if (r23 == 0) goto L_0x0150
            X.4Wf r1 = r11.A0K
            X.4qQ r0 = new X.4qQ
            r0.<init>()
            r1.A02(r0, r2)
        L_0x0150:
            boolean r1 = r10.A0C
            boolean r0 = r13.A0C
            if (r1 == r0) goto L_0x015c
            X.4Wf r1 = r11.A0K
            r0 = 5
            A00(r1, r13, r0, r2)
        L_0x015c:
            boolean r1 = r10.A0E
            boolean r0 = r13.A0E
            if (r1 == r0) goto L_0x0168
            X.4Wf r1 = r11.A0K
            r0 = 2
            A00(r1, r13, r0, r2)
        L_0x0168:
            X.4Wf r0 = r11.A0K
            r0.A00()
            return
        L_0x016e:
            r3 = 0
            goto L_0x0078
        L_0x0171:
            int r0 = r9.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r15 = 3
            if (r6 != r0) goto L_0x01ab
            X.1c3 r0 = r10.A07
            java.lang.Object r1 = r0.A04
            X.4XE r0 = r11.A0C
            int r1 = X.AnonymousClass4XE.A00(r0, r9, r1)
            X.4by r5 = r11.A00
            r2 = 0
            X.4by r1 = r9.A0A(r5, r1, r2)
            java.lang.Object r4 = r1.A09
            X.1c3 r1 = r13.A07
            java.lang.Object r1 = r1.A04
            int r0 = X.AnonymousClass4XE.A00(r0, r8, r1)
            X.4by r0 = r8.A0A(r5, r0, r2)
            java.lang.Object r0 = r0.A09
            int r2 = r5.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x01c3
            if (r22 == 0) goto L_0x01bc
            if (r19 != 0) goto L_0x01b8
            r15 = 1
        L_0x01ab:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
        L_0x01b1:
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            goto L_0x0035
        L_0x01b8:
            if (r12 != r7) goto L_0x01bc
            r15 = 2
            goto L_0x01ab
        L_0x01bc:
            if (r16 != 0) goto L_0x01ab
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        L_0x01c3:
            if (r22 == 0) goto L_0x002e
            if (r19 != 0) goto L_0x002e
            int r0 = r8.A04(r1)
            if (r0 != r2) goto L_0x002e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Integer r0 = X.C13680ns.A0X()
            goto L_0x01b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UF.A06(X.4df, int, int, int, boolean, boolean):void");
    }

    public void A4a(AnonymousClass5TQ r4) {
        C87304Wf r1 = this.A0K;
        if (!r1.A00) {
            r1.A07.add(new AnonymousClass0QU(r1.A04, r4));
        }
    }

    public long AAF() {
        long j2;
        if (AJS()) {
            C90184df r0 = this.A05;
            if (!r0.A06.equals(r0.A07)) {
                return ABq();
            }
            j2 = this.A05.A0F;
        } else {
            C90184df r6 = this.A05;
            Timeline timeline = r6.A05;
            if (AnonymousClass000.A1P(timeline.A01())) {
                return this.A04;
            }
            if (r6.A06.A03 != r6.A07.A03) {
                j2 = AnonymousClass3K4.A0O(this.A00, timeline, ABW()).A02;
            } else {
                long j3 = r6.A0F;
                C90184df r7 = this.A05;
                C30271c3 r62 = r7.A06;
                if (r62.A00()) {
                    AnonymousClass4XE A092 = r7.A05.A09(this.A0C, r62.A04);
                    r7 = this.A05;
                    r62 = r7.A06;
                    j3 = A092.A03.A01[r62.A00];
                    if (j3 == Long.MIN_VALUE) {
                        j3 = A092.A01;
                    }
                }
                long A022 = C90604eR.A02(j3);
                Timeline timeline2 = r7.A05;
                Object obj = r62.A04;
                AnonymousClass4XE r02 = this.A0C;
                timeline2.A09(r02, obj);
                return A022 + C90604eR.A02(r02.A02);
            }
        }
        return C90604eR.A02(j2);
    }

    public long AAw() {
        if (!AJS()) {
            return ABQ();
        }
        C90184df r0 = this.A05;
        Timeline timeline = r0.A05;
        Object obj = r0.A07.A04;
        AnonymousClass4XE r6 = this.A0C;
        timeline.A09(r6, obj);
        C90184df r3 = this.A05;
        long j2 = r3.A02;
        if (j2 != -9223372036854775807L) {
            return C90604eR.A02(r6.A02) + C90604eR.A02(j2);
        }
        r3.A05.A0A(this.A00, ABW(), 0);
        return 0;
    }

    public int ABI() {
        if (AJS()) {
            return this.A05.A07.A00;
        }
        return -1;
    }

    public int ABJ() {
        if (AJS()) {
            return this.A05.A07.A01;
        }
        return -1;
    }

    public int ABP() {
        C90184df r2 = this.A05;
        Timeline timeline = r2.A05;
        if (AnonymousClass000.A1P(timeline.A01())) {
            return 0;
        }
        return timeline.A04(r2.A07.A04);
    }

    public long ABQ() {
        C90184df r1 = this.A05;
        if (AnonymousClass000.A1P(r1.A05.A01())) {
            return this.A04;
        }
        C30271c3 r5 = r1.A07;
        boolean A002 = r5.A00();
        long A022 = C90604eR.A02(r1.A0G);
        if (A002) {
            return A022;
        }
        Timeline timeline = this.A05.A05;
        Object obj = r5.A04;
        AnonymousClass4XE r0 = this.A0C;
        timeline.A09(r0, obj);
        return A022 + C90604eR.A02(r0.A02);
    }

    public Timeline ABV() {
        return this.A05.A05;
    }

    public int ABW() {
        int A012 = A01();
        if (A012 == -1) {
            return 0;
        }
        return A012;
    }

    public long ABq() {
        long j2;
        if (AJS()) {
            C90184df r1 = this.A05;
            C30271c3 r0 = r1.A07;
            r1.A05.A09(this.A0C, r0.A04);
            j2 = -9223372036854775807L;
        } else {
            Timeline timeline = this.A05.A05;
            if (AnonymousClass000.A1P(timeline.A01())) {
                return -9223372036854775807L;
            }
            j2 = AnonymousClass3K4.A0O(this.A00, timeline, ABW()).A02;
        }
        return C90604eR.A02(j2);
    }

    public boolean AF3() {
        return this.A05.A0D;
    }

    public int AF5() {
        return this.A05.A00;
    }

    public long AGb() {
        return C90604eR.A02(this.A05.A0H);
    }

    public boolean AJS() {
        return this.A05.A07.A00();
    }

    public void Aby(AnonymousClass5TQ r8) {
        C87304Wf r6 = this.A0K;
        CopyOnWriteArraySet copyOnWriteArraySet = r6.A07;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            AnonymousClass0QU r3 = (AnonymousClass0QU) it.next();
            Object obj = r3.A03;
            if (obj.equals(r8)) {
                C108375Ns r1 = r6.A03;
                r3.A02 = true;
                if (r3.A01) {
                    r1.AIY(r3.A00, obj);
                }
                copyOnWriteArraySet.remove(r3);
            }
        }
    }

    public void AdE(int i2, long j2) {
        C90184df r4 = this.A05;
        Timeline timeline = r4.A05;
        long j3 = j2;
        if (i2 < 0 || (!AnonymousClass000.A1P(timeline.A01()) && i2 >= timeline.A01())) {
            throw new AnonymousClass448(timeline, i2, j3);
        }
        int i3 = 1;
        this.A02++;
        if (AJS()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            AnonymousClass4V3 r42 = new AnonymousClass4V3(this.A05);
            r42.A00(1);
            AnonymousClass3UF r3 = ((C96164nt) this.A0A).A00;
            ((C97684qO) r3.A0J).A00.post(new RunnableRunnableShape12S0200000_I1(r3, 4, r42));
            return;
        }
        if (r4.A00 != 1) {
            i3 = 2;
        }
        C90184df A032 = A03(A02(timeline, i2, j3), r4.A01(i3), timeline);
        C97684qO.A00(this.A0B.A0Y, 3, new AnonymousClass4JQ(timeline, i2, C90604eR.A01(j3)));
        A06(A032, 1, 0, 1, true, true);
    }

    public void AeK(boolean z2) {
        A04(0, 1, z2);
    }
}
