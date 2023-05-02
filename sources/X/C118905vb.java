package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.5vb  reason: invalid class name and case insensitive filesystem */
public class C118905vb {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public int A04;
    public int A05 = 0;
    public int A06;
    public int A07;
    public int A08;
    public Context A09;
    public GestureDetector A0A;
    public VelocityTracker A0B = null;
    public C114815oe A0C = C114815oe.VERTICAL;
    public C1219767u A0D = null;
    public AnonymousClass68G A0E = null;
    public C114865oj A0F = C114865oj.AT_REST;
    public AnonymousClass68H A0G = null;
    public C114895om A0H = null;
    public boolean A0I;

    public C118905vb(Context context) {
        this.A0A = new GestureDetector(context, new C119565yg(this));
        this.A09 = context;
    }

    public void A00() {
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0F = C114865oj.CANCELED;
        VelocityTracker velocityTracker = this.A0B;
        this.A0B = null;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    public final void A01() {
        if (!this.A0I) {
            Context context = this.A09;
            if (context != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                this.A04 = scaledPagingTouchSlop;
                this.A08 = scaledTouchSlop;
                this.A07 = scaledMinimumFlingVelocity;
                this.A06 = scaledMaximumFlingVelocity;
                this.A0I = true;
                this.A0I = true;
                this.A09 = null;
                return;
            }
            throw AnonymousClass000.A0V("Init Context must not be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r0 != r5) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0131, code lost:
        if (r1 != r0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0133, code lost:
        r12.A0E.AQ9(r6, r4, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.view.MotionEvent r13) {
        /*
            r12 = this;
            X.68G r0 = r12.A0E
            r5 = 0
            if (r0 == 0) goto L_0x00fd
            int r0 = r12.A05
            if (r0 <= 0) goto L_0x00fd
            int r1 = r13.getAction()
            float r4 = r13.getX()
            float r3 = r13.getY()
            r0 = 1
            if (r1 == 0) goto L_0x00d5
            if (r1 == r0) goto L_0x00a1
            r0 = 2
            if (r1 == r0) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x00a1
        L_0x0020:
            X.5oj r1 = r12.A0F
            X.5oj r0 = X.C114865oj.DRAGGING
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
        L_0x0028:
            return r0
        L_0x0029:
            X.5oj r1 = r12.A0F
            X.5oj r0 = X.C114865oj.CANCELED
            if (r1 == r0) goto L_0x0020
            X.5oj r5 = X.C114865oj.DRAGGING
            if (r1 == r5) goto L_0x0020
            r12.A01()
            int r10 = r12.A04
            r12.A01()
            int r11 = r12.A08
            float r0 = r12.A00
            float r0 = r4 - r0
            int r7 = (int) r0
            float r0 = r12.A01
            float r0 = r3 - r0
            int r9 = (int) r0
            int r8 = java.lang.Math.abs(r7)
            int r6 = java.lang.Math.abs(r9)
            float r1 = r12.A02
            float r0 = (float) r7
            float r1 = r1 + r0
            r12.A02 = r1
            float r1 = r12.A03
            float r0 = (float) r9
            float r1 = r1 + r0
            r12.A03 = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r6 <= r11) goto L_0x008a
            X.5oe r1 = r12.A0C
            X.5oe r0 = X.C114815oe.VERTICAL
            if (r1 == r0) goto L_0x006c
            float r1 = (float) r6
            float r1 = r1 * r2
            float r0 = (float) r8
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008a
        L_0x006c:
            if (r9 >= 0) goto L_0x0085
            X.5om r6 = X.C114895om.A04
        L_0x0070:
            int r1 = r12.A05
            int r0 = r6.flag
            r1 = r1 & r0
            if (r1 != r0) goto L_0x009d
            r12.A00 = r4
            r12.A01 = r3
            r12.A0H = r6
            X.5oj r0 = r12.A0F
            r12.A0F = r5
            if (r0 == r5) goto L_0x0020
            goto L_0x0133
        L_0x0085:
            if (r9 <= 0) goto L_0x009d
            X.5om r6 = X.C114895om.A01
            goto L_0x0070
        L_0x008a:
            if (r8 <= r10) goto L_0x0020
            float r1 = (float) r8
            float r1 = r1 * r2
            float r0 = (float) r6
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            if (r7 >= 0) goto L_0x0098
            X.5om r6 = X.C114895om.A02
            goto L_0x0070
        L_0x0098:
            if (r7 <= 0) goto L_0x009d
            X.5om r6 = X.C114895om.A03
            goto L_0x0070
        L_0x009d:
            r12.A00()
            goto L_0x0020
        L_0x00a1:
            X.68H r0 = r12.A0G
            if (r0 == 0) goto L_0x0020
            X.5oj r1 = r12.A0F
            X.5oj r0 = X.C114865oj.CANCELED
            if (r1 == r0) goto L_0x0020
            X.5oj r0 = X.C114865oj.DRAGGING
            if (r1 == r0) goto L_0x0020
            r12.A01()
            int r1 = r12.A08
            float r0 = r12.A02
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            float r0 = r12.A03
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            X.68H r0 = r12.A0G
            boolean r0 = r0.AYm(r4, r3)
            if (r0 != 0) goto L_0x0028
            r12.A00()
            return r0
        L_0x00d5:
            X.5oj r0 = X.C114865oj.DECIDING
            r12.A0F = r0
            r0 = 0
            r12.A02 = r0
            r12.A03 = r0
            X.67u r2 = r12.A0D
            if (r2 == 0) goto L_0x00fe
            com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r2 = (com.obwhatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r2
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 >> 1
            float r0 = (float) r0
            float r0 = r3 - r0
            float r1 = java.lang.Math.abs(r0)
            int r0 = r2.A04
            int r0 = r0 << 1
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fe
            r12.A00()
        L_0x00fd:
            return r5
        L_0x00fe:
            r12.A00 = r4
            r12.A01 = r3
            X.67u r0 = r12.A0D
            if (r0 == 0) goto L_0x0020
            X.5om r6 = r12.A0H
            if (r6 != 0) goto L_0x0125
            X.5om r6 = X.C114895om.A03
            int r2 = r12.A05
            int r1 = r6.flag
            r0 = r2 & r1
            if (r0 == r1) goto L_0x0125
            X.5om r6 = X.C114895om.A01
            int r1 = r6.flag
            r0 = r2 & r1
            if (r0 == r1) goto L_0x0125
            X.5om r6 = X.C114895om.A04
            int r0 = r6.flag
            r2 = r2 & r0
            if (r2 == r0) goto L_0x0125
            X.5om r6 = X.C114895om.A02
        L_0x0125:
            r12.A00 = r4
            r12.A01 = r3
            r12.A0H = r6
            X.5oj r1 = r12.A0F
            X.5oj r0 = X.C114865oj.DRAGGING
            r12.A0F = r0
            if (r1 == r0) goto L_0x0020
        L_0x0133:
            X.68G r0 = r12.A0E
            r0.AQ9(r6, r4, r3)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118905vb.A02(android.view.MotionEvent):boolean");
    }
}
