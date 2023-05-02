package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.0Yn  reason: invalid class name and case insensitive filesystem */
public class C06940Yn implements View.OnTouchListener {
    public float A00 = Float.MAX_VALUE;
    public float A01 = Float.MAX_VALUE;
    public boolean A02 = false;
    public final GestureDetector A03;
    public final ScaleGestureDetector A04;
    public final C05080Pe A05;
    public final C02340Bf A06;

    public C06940Yn(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, C05080Pe r4, C02340Bf r5) {
        this.A06 = r5;
        this.A03 = gestureDetector;
        this.A04 = scaleGestureDetector;
        this.A05 = r4;
    }

    public final boolean A00(MotionEvent motionEvent) {
        int i2;
        if (!(this.A00 == Float.MAX_VALUE || this.A01 == Float.MAX_VALUE)) {
            if (motionEvent.getPointerCount() <= 1 || this.A06.A01(44) == null) {
                C02340Bf r4 = this.A06;
                if ((r4.A02 || !r4.A01) && r4.A01(48) != null) {
                    return true;
                }
                if (Math.abs(motionEvent.getY() - this.A01) > Math.abs(motionEvent.getX() - this.A00)) {
                    if (r4.A01(38) == null) {
                        i2 = 42;
                    }
                } else if (r4.A01(40) == null) {
                    i2 = 41;
                }
                if (r4.A01(i2) != null) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r1 != 3) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r1 != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            android.view.ScaleGestureDetector r0 = r5.A04
            r0.onTouchEvent(r7)
            android.view.ViewParent r3 = r6.getParent()
            boolean r0 = r0.isInProgress()
            r2 = 1
            if (r0 == 0) goto L_0x0079
            X.0Bf r1 = r5.A06
            r0 = 44
            X.0q1 r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0021
            r3.requestDisallowInterceptTouchEvent(r2)
            r5.A02 = r2
        L_0x0021:
            r4 = 1
        L_0x0022:
            int r1 = r7.getActionMasked()
            if (r3 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            if (r1 == r2) goto L_0x004a
            r0 = 2
            if (r1 == r0) goto L_0x0039
            r0 = 3
            if (r1 == r0) goto L_0x0052
        L_0x0032:
            r2 = r4
        L_0x0033:
            X.0Bf r1 = r5.A06
            r0 = 0
            r1.A01 = r0
            return r2
        L_0x0039:
            boolean r1 = r5.A00(r7)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0071
            if (r1 != 0) goto L_0x0032
            r0 = 0
            r3.requestDisallowInterceptTouchEvent(r0)
            r5.A02 = r0
            goto L_0x0032
        L_0x004a:
            X.0Bf r1 = r5.A06
            r0 = 0
            r1.A02 = r0
            r1.A02(r7)
        L_0x0052:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x005c
            r0 = 0
            r3.requestDisallowInterceptTouchEvent(r0)
            r5.A02 = r0
        L_0x005c:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r5.A01 = r0
            r5.A00 = r0
            goto L_0x0033
        L_0x0064:
            float r0 = r7.getX()
            r5.A00 = r0
            float r0 = r7.getY()
            r5.A01 = r0
            goto L_0x0073
        L_0x0071:
            if (r1 == 0) goto L_0x0032
        L_0x0073:
            r3.requestDisallowInterceptTouchEvent(r2)
            r5.A02 = r2
            goto L_0x0032
        L_0x0079:
            android.view.GestureDetector r0 = r5.A03
            boolean r4 = r0.onTouchEvent(r7)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06940Yn.A01(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C05080Pe r0 = this.A05;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        View view2 = r0.A01;
        obtain.transform(view2.getMatrix());
        obtain.offsetLocation((float) view2.getLeft(), (float) view2.getTop());
        try {
            return A01(view, obtain);
        } finally {
            obtain.recycle();
        }
    }
}
