package X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0hI  reason: invalid class name and case insensitive filesystem */
public class C10540hI implements Runnable {
    public int A00;
    public int A01;
    public Interpolator A02;
    public OverScroller A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public final /* synthetic */ RecyclerView A06;

    public C10540hI(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        Interpolator interpolator = RecyclerView.A1B;
        this.A02 = interpolator;
        this.A03 = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public void A00() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        RecyclerView recyclerView = this.A06;
        recyclerView.removeCallbacks(this);
        recyclerView.postOnAnimation(this);
    }

    public void A01(Interpolator interpolator, int i2, int i3, int i4) {
        if (this.A02 != interpolator) {
            this.A02 = interpolator;
            this.A03 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A01 = 0;
        this.A00 = 0;
        this.A03.startScroll(0, 0, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.A03.computeScrollOffset();
        }
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0180, code lost:
        if (r2 != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x019b, code lost:
        if (r2 > 0) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01a3, code lost:
        if (r9 <= 0) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        if (r1 == 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (r21.getFinalX() != 0) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0109, code lost:
        if (r3 != r5) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r11 = r22
            androidx.recyclerview.widget.RecyclerView r10 = r11.A06
            X.02W r0 = r10.A0S
            if (r0 != 0) goto L_0x0011
            r10.removeCallbacks(r11)
            android.widget.OverScroller r0 = r11.A03
            r0.abortAnimation()
        L_0x0010:
            return
        L_0x0011:
            r0 = 0
            r11.A05 = r0
            r1 = 1
            r11.A04 = r1
            r10.A0H()
            android.widget.OverScroller r0 = r11.A03
            r21 = r0
            X.02W r0 = r10.A0S
            X.0Rq r12 = r0.A06
            boolean r0 = r21.computeScrollOffset()
            r9 = 0
            if (r0 == 0) goto L_0x013e
            int[] r2 = r10.A18
            int r8 = r21.getCurrX()
            int r7 = r21.getCurrY()
            int r0 = r11.A00
            int r6 = r8 - r0
            int r0 = r11.A01
            int r5 = r7 - r0
            r11.A00 = r8
            r11.A01 = r7
            r15 = 0
            r20 = 1
            r4 = 1
            r18 = 1
            r13 = r10
            r14 = r2
            r16 = r6
            r17 = r5
            boolean r0 = r13.A0y(r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x0057
            r0 = r2[r9]
            int r6 = r6 - r0
            r0 = r2[r1]
            int r5 = r5 - r0
        L_0x0057:
            X.01X r0 = r10.A0N
            if (r0 == 0) goto L_0x01b9
            int[] r0 = r10.A1A
            r10.A0g(r6, r0, r5)
            r13 = r0[r9]
            r3 = r0[r1]
            int r9 = r6 - r13
            int r2 = r5 - r3
            if (r12 == 0) goto L_0x007d
            boolean r0 = r12.A04
            if (r0 != 0) goto L_0x007d
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x007d
            X.0Ri r0 = r10.A0y
            int r1 = r0.A00()
            if (r1 != 0) goto L_0x01a8
            r12.A01()
        L_0x007d:
            java.util.ArrayList r0 = r10.A13
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0088
            r10.invalidate()
        L_0x0088:
            int r1 = r10.getOverScrollMode()
            r0 = 2
            if (r1 == r0) goto L_0x0092
            r10.A0b(r6, r5)
        L_0x0092:
            r18 = r9
            r19 = r2
            r16 = r13
            r17 = r3
            r14 = r10
            boolean r1 = r14.A0x(r15, r16, r17, r18, r19, r20)
            if (r1 != 0) goto L_0x00ee
            if (r9 != 0) goto L_0x00a5
            if (r2 == 0) goto L_0x00ee
        L_0x00a5:
            float r1 = r21.getCurrVelocity()
            int r14 = (int) r1
            if (r9 == r8) goto L_0x01a5
            if (r9 >= 0) goto L_0x01a2
            int r1 = -r14
        L_0x00af:
            if (r2 == r7) goto L_0x019f
            if (r2 >= 0) goto L_0x019b
            int r14 = -r14
        L_0x00b4:
            int r15 = r10.getOverScrollMode()
            if (r15 == r0) goto L_0x00d7
            if (r1 >= 0) goto L_0x018f
            r10.A0K()
            android.widget.EdgeEffect r15 = r10.A0F
            int r0 = -r1
            r15.onAbsorb(r0)
        L_0x00c5:
            if (r14 >= 0) goto L_0x0183
            r10.A0M()
            android.widget.EdgeEffect r15 = r10.A0H
            int r0 = -r14
            r15.onAbsorb(r0)
        L_0x00d0:
            if (r1 != 0) goto L_0x00d4
            if (r14 == 0) goto L_0x00d9
        L_0x00d4:
            r10.postInvalidateOnAnimation()
        L_0x00d7:
            if (r1 != 0) goto L_0x00e1
        L_0x00d9:
            if (r9 == r8) goto L_0x00e1
            int r0 = r21.getFinalX()
            if (r0 != 0) goto L_0x00ee
        L_0x00e1:
            if (r14 != 0) goto L_0x00eb
            if (r2 == r7) goto L_0x00eb
            int r0 = r21.getFinalY()
            if (r0 != 0) goto L_0x00ee
        L_0x00eb:
            r21.abortAnimation()
        L_0x00ee:
            if (r13 != 0) goto L_0x00f2
            if (r3 == 0) goto L_0x00f5
        L_0x00f2:
            r10.A0d(r13, r3)
        L_0x00f5:
            boolean r0 = r10.awakenScrollBars()
            if (r0 != 0) goto L_0x00fe
            r10.invalidate()
        L_0x00fe:
            if (r5 == 0) goto L_0x010b
            X.02W r0 = r10.A0S
            boolean r0 = r0.A14()
            if (r0 == 0) goto L_0x010b
            r2 = 1
            if (r3 == r5) goto L_0x010c
        L_0x010b:
            r2 = 0
        L_0x010c:
            if (r6 == 0) goto L_0x017d
            X.02W r0 = r10.A0S
            boolean r0 = r0.A13()
            if (r0 == 0) goto L_0x017f
            if (r13 != r6) goto L_0x017f
        L_0x0118:
            r1 = 1
        L_0x0119:
            boolean r0 = r21.isFinished()
            if (r0 != 0) goto L_0x0127
            if (r1 != 0) goto L_0x015a
            boolean r0 = r10.A0v()
            if (r0 != 0) goto L_0x015a
        L_0x0127:
            r3 = 0
            r10.setScrollState(r3)
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1D
            if (r0 == 0) goto L_0x013b
            X.0cF r2 = r10.A0L
            int[] r1 = r2.A03
            if (r1 == 0) goto L_0x0139
            r0 = -1
            java.util.Arrays.fill(r1, r0)
        L_0x0139:
            r2.A00 = r3
        L_0x013b:
            r10.AgM(r4)
        L_0x013e:
            if (r12 == 0) goto L_0x014f
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x0148
            r0 = 0
            r12.A02(r0, r0)
        L_0x0148:
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x014f
            r12.A01()
        L_0x014f:
            r0 = 0
            r11.A04 = r0
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x0010
            r11.A00()
            return
        L_0x015a:
            r11.A00()
            X.0hQ r7 = r10.A0M
            if (r7 == 0) goto L_0x013e
            boolean r0 = r10.A0j
            if (r0 == 0) goto L_0x0176
            long r0 = r7.A01
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0176
            long r0 = r10.getNanoTime()
            r7.A01 = r0
            r10.post(r7)
        L_0x0176:
            X.0cF r0 = r10.A0L
            r0.A01 = r6
            r0.A02 = r5
            goto L_0x013e
        L_0x017d:
            if (r5 == 0) goto L_0x0118
        L_0x017f:
            r1 = 0
            if (r2 == 0) goto L_0x0119
            goto L_0x0118
        L_0x0183:
            if (r14 <= 0) goto L_0x00d0
            r10.A0J()
            android.widget.EdgeEffect r0 = r10.A0E
            r0.onAbsorb(r14)
            goto L_0x00d0
        L_0x018f:
            if (r1 <= 0) goto L_0x00c5
            r10.A0L()
            android.widget.EdgeEffect r0 = r10.A0G
            r0.onAbsorb(r1)
            goto L_0x00c5
        L_0x019b:
            if (r2 <= 0) goto L_0x019f
            goto L_0x00b4
        L_0x019f:
            r14 = 0
            goto L_0x00b4
        L_0x01a2:
            r1 = r14
            if (r9 > 0) goto L_0x00af
        L_0x01a5:
            r1 = 0
            goto L_0x00af
        L_0x01a8:
            int r0 = r12.A00
            if (r0 < r1) goto L_0x01b0
            int r1 = r1 - r20
            r12.A00 = r1
        L_0x01b0:
            int r1 = r6 - r9
            int r0 = r5 - r2
            r12.A02(r1, r0)
            goto L_0x007d
        L_0x01b9:
            r3 = 0
            r13 = 0
            r2 = 0
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10540hI.run():void");
    }
}
