package X;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import com.facebook.redex.IDxEventShape165S0100000_2_I1;
import com.facebook.redex.IDxEventShape26S0300000_2_I1;
import com.facebook.redex.IDxEventShape51S0200000_2_I1;
import com.facebook.redex.IDxSupplierShape48S0000000_2_I1;
import com.google.android.exoplayer2.Timeline;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4nz  reason: invalid class name and case insensitive filesystem */
public class C96224nz implements AnonymousClass5TQ, AnonymousClass5TI, AnonymousClass5TJ, C30241c0, AnonymousClass5LE, AnonymousClass5LW {
    public AnonymousClass2PT A00;
    public C87304Wf A01;
    public boolean A02;
    public final SparseArray A03;
    public final AnonymousClass4XE A04;
    public final C89324by A05;
    public final AnonymousClass3AT A06;
    public final AnonymousClass5TU A07;

    public C96224nz(AnonymousClass5TU r7) {
        AnonymousClass5TU r2 = r7;
        this.A07 = r7;
        Looper myLooper = Looper.myLooper();
        this.A01 = new C87304Wf(myLooper == null ? Looper.getMainLooper() : myLooper, r2, new C97734qT(), new IDxSupplierShape48S0000000_2_I1(1), new CopyOnWriteArraySet());
        AnonymousClass4XE r1 = new AnonymousClass4XE();
        this.A04 = r1;
        this.A05 = new C89324by();
        this.A06 = new AnonymousClass3AT(r1);
        this.A03 = new SparseArray();
    }

    public static AnonymousClass4VC A00(C96224nz r1) {
        return r1.A03(r1.A06.A02);
    }

    public static AnonymousClass4VC A01(C96224nz r1) {
        return r1.A03(r1.A06.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r8 != r1.A00.ABW()) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4VC A02(com.google.android.exoplayer2.Timeline r19, X.C30271c3 r20, int r21) {
        /*
            r18 = this;
            r4 = r19
            r6 = r20
            int r0 = r4.A01()
            boolean r3 = X.AnonymousClass000.A1P(r0)
            if (r3 == 0) goto L_0x000f
            r6 = 0
        L_0x000f:
            long r10 = android.os.SystemClock.elapsedRealtime()
            r1 = r18
            X.2PT r0 = r1.A00
            com.google.android.exoplayer2.Timeline r0 = r0.ABV()
            boolean r0 = r4.equals(r0)
            r8 = r21
            if (r0 == 0) goto L_0x002c
            X.2PT r0 = r1.A00
            int r0 = r0.ABW()
            r2 = 1
            if (r8 == r0) goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            r12 = 0
            if (r6 == 0) goto L_0x0075
            boolean r0 = r6.A00()
            if (r0 == 0) goto L_0x0075
            if (r2 == 0) goto L_0x0053
            X.2PT r0 = r1.A00
            int r2 = r0.ABI()
            int r0 = r6.A00
            if (r2 != r0) goto L_0x0053
            X.2PT r0 = r1.A00
            int r2 = r0.ABJ()
            int r0 = r6.A01
            if (r2 != r0) goto L_0x0053
            X.2PT r0 = r1.A00
            long r12 = r0.ABQ()
        L_0x0053:
            X.3AT r0 = r1.A06
            X.1c3 r7 = r0.A00
            X.2PT r0 = r1.A00
            com.google.android.exoplayer2.Timeline r5 = r0.ABV()
            X.2PT r0 = r1.A00
            int r9 = r0.ABW()
            X.2PT r0 = r1.A00
            long r14 = r0.ABQ()
            X.2PT r0 = r1.A00
            long r16 = r0.AGb()
            X.4VC r3 = new X.4VC
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r14, r16)
            return r3
        L_0x0075:
            if (r2 == 0) goto L_0x007e
            X.2PT r0 = r1.A00
            long r12 = r0.AAw()
            goto L_0x0053
        L_0x007e:
            if (r3 != 0) goto L_0x0053
            X.4by r0 = r1.A05
            r4.A0A(r0, r8, r12)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96224nz.A02(com.google.android.exoplayer2.Timeline, X.1c3, int):X.4VC");
    }

    public final AnonymousClass4VC A03(C30271c3 r5) {
        Timeline timeline;
        if (r5 == null || (timeline = (Timeline) this.A06.A04.get(r5)) == null) {
            int ABW = this.A00.ABW();
            Timeline ABV = this.A00.ABV();
            if (ABW >= ABV.A01()) {
                ABV = Timeline.A00;
            }
            return A02(ABV, (C30271c3) null, ABW);
        }
        return A02(timeline, r5, AnonymousClass4XE.A00(this.A04, timeline, r5.A04));
    }

    public final AnonymousClass4VC A04(C30271c3 r3, int i2) {
        if (r3 != null) {
            return this.A06.A04.get(r3) != null ? A03(r3) : A02(Timeline.A00, r3, i2);
        }
        Timeline ABV = this.A00.ABV();
        if (i2 >= ABV.A01()) {
            ABV = Timeline.A00;
        }
        return A02(ABV, (C30271c3) null, i2);
    }

    public final void A05(AnonymousClass4VC r2, C108365Nr r3, int i2) {
        this.A03.put(i2, r2);
        C87304Wf r0 = this.A01;
        r0.A02(r3, i2);
        r0.A00();
    }

    public final void AMk(String str, long j2, long j3) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape165S0100000_2_I1(A002, 22), 1009);
    }

    public final void AMl(String str) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape165S0100000_2_I1(A002, 19), 1013);
    }

    public final void AMm(C85484Oq r4) {
        AnonymousClass4VC A032 = A03(this.A06.A01);
        A05(A032, new IDxEventShape51S0200000_2_I1(r4, 8, A032), 1014);
    }

    public final void AMn(C85484Oq r4) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape51S0200000_2_I1(r4, 7, A002), 1008);
    }

    public final void AMo(C32491gT r4, C86944Ut r5) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape26S0300000_2_I1(r4, A002, r5, 1), 1010);
    }

    public final void AMq(long j2) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape165S0100000_2_I1(A002, 17), 1011);
    }

    public final void AMr(Exception exc) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape51S0200000_2_I1(exc, 12, A002), 1018);
    }

    public final void AMs(int i2, long j2, long j3) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape165S0100000_2_I1(A002, 16), 1012);
    }

    public final void AQ7(C30261c2 r4, C30271c3 r5, int i2) {
        AnonymousClass4VC A042 = A04(r5, i2);
        A05(A042, new IDxEventShape51S0200000_2_I1(r4, 11, A042), 1004);
    }

    public final void AQC(int i2, long j2) {
        AnonymousClass4VC A032 = A03(this.A06.A01);
        A05(A032, new IDxEventShape165S0100000_2_I1(A032, 14), 1023);
    }

    public /* synthetic */ void AQo(boolean z2) {
    }

    public final void ASO(boolean z2) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape165S0100000_2_I1(A012, 23), 4);
    }

    public void ASP(boolean z2) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape165S0100000_2_I1(A012, 25), 8);
    }

    public final void ASk(C30251c1 r4, C30261c2 r5, C30271c3 r6, int i2) {
        AnonymousClass4VC A042 = A04(r6, i2);
        A05(A042, new IDxEventShape26S0300000_2_I1(r4, A042, r5, 3), 1002);
    }

    public final void ASl(C30251c1 r4, C30261c2 r5, C30271c3 r6, int i2) {
        AnonymousClass4VC A042 = A04(r6, i2);
        A05(A042, new IDxEventShape26S0300000_2_I1(r4, A042, r5, 2), 1001);
    }

    public final void ASo(C30251c1 r4, C30261c2 r5, C30271c3 r6, IOException iOException, int i2, boolean z2) {
        AnonymousClass4VC A042 = A04(r6, i2);
        A05(A042, new C97724qS(A042, r4, r5, iOException), 1003);
    }

    public final void ASu(C30251c1 r4, C30261c2 r5, C30271c3 r6, int i2) {
        AnonymousClass4VC A042 = A04(r6, i2);
        A05(A042, new IDxEventShape26S0300000_2_I1(r4, A042, r5, 4), 1000);
    }

    public final void ATO(C86924Ur r4, int i2) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape51S0200000_2_I1(r4, 3, A012), 1);
    }

    public final void AUm(boolean z2, int i2) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape165S0100000_2_I1(A012, 27), 6);
    }

    public final void AUo(C89214bm r4) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape51S0200000_2_I1(r4, 4, A012), 13);
    }

    public final void AUq(int i2) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape165S0100000_2_I1(A012, 11), 5);
    }

    public final void AUr(int i2) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape165S0100000_2_I1(A012, 29), 7);
    }

    public final void AUs(C804643y r5) {
        C30281c4 r1 = r5.mediaPeriodId;
        AnonymousClass4VC A032 = A03(r1 != null ? new C30271c3(r1) : this.A06.A00);
        A05(A032, new IDxEventShape51S0200000_2_I1(r5, 2, A032), 11);
    }

    public final void AUt(boolean z2, int i2) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape165S0100000_2_I1(A012, 26), -1);
    }

    public final void AUy(int i2) {
        if (i2 == 1) {
            this.A02 = false;
        }
        AnonymousClass3AT r4 = this.A06;
        AnonymousClass2PT r3 = this.A00;
        C34641kb r2 = r4.A03;
        C30271c3 A002 = AnonymousClass3AT.A00(r3, r4.A05, r4.A01, r2);
        r4.A00 = A002;
        AnonymousClass4VC A032 = A03(A002);
        A05(A032, new IDxEventShape165S0100000_2_I1(A032, 12), 12);
    }

    public final void AW5(Surface surface) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape51S0200000_2_I1(surface, 1, A002), 1027);
    }

    public final void AWt() {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape165S0100000_2_I1(A012, 28), -1);
    }

    public final void AXJ(boolean z2) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape165S0100000_2_I1(A002, 24), 1017);
    }

    public final void AXd(List list) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape51S0200000_2_I1(list, 13, A012), 3);
    }

    public final void AYr(Timeline timeline, int i2) {
        AnonymousClass3AT r4 = this.A06;
        AnonymousClass2PT r3 = this.A00;
        C34641kb r2 = r4.A03;
        r4.A00 = AnonymousClass3AT.A00(r3, r4.A05, r4.A01, r2);
        r4.A01(r3.ABV());
        AnonymousClass4VC A032 = A03(r4.A00);
        A05(A032, new IDxEventShape165S0100000_2_I1(A032, 10), 0);
    }

    public /* synthetic */ void AYs(Timeline timeline, Object obj, int i2) {
    }

    public final void AZ8(C93604jT r4, AnonymousClass4TI r5) {
        AnonymousClass4VC A012 = A01(this);
        A05(A012, new IDxEventShape26S0300000_2_I1(r4, A012, r5, 5), 2);
    }

    public final void AZY(String str, long j2, long j3) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape165S0100000_2_I1(A002, 21), 1021);
    }

    public final void AZZ(String str) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape165S0100000_2_I1(A002, 20), 1024);
    }

    public final void AZa(C85484Oq r4) {
        AnonymousClass4VC A032 = A03(this.A06.A01);
        A05(A032, new IDxEventShape51S0200000_2_I1(r4, 6, A032), 1025);
    }

    public final void AZb(C85484Oq r4) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape51S0200000_2_I1(r4, 9, A002), 1020);
    }

    public final void AZc(long j2, int i2) {
        AnonymousClass4VC A032 = A03(this.A06.A01);
        A05(A032, new IDxEventShape165S0100000_2_I1(A032, 18), 1026);
    }

    public final void AZd(C32491gT r4, C86944Ut r5) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape26S0300000_2_I1(r4, A002, r5, 0), 1022);
    }

    public final void AZe(float f2, int i2, int i3, int i4) {
        AnonymousClass4VC A002 = A00(this);
        A05(A002, new IDxEventShape165S0100000_2_I1(A002, 13), 1028);
    }
}
