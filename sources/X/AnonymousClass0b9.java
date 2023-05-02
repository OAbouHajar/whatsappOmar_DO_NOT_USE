package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.0b9  reason: invalid class name */
public class AnonymousClass0b9 implements C13020lL {
    public static final int A0L = ViewConfiguration.getDoubleTapTimeout();
    public static final int A0M = ViewConfiguration.getTapTimeout();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public GestureDetector.OnDoubleTapListener A08;
    public MotionEvent A09;
    public MotionEvent A0A;
    public VelocityTracker A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Handler A0J = new AnonymousClass0BI(this);
    public final GestureDetector.OnGestureListener A0K;

    public AnonymousClass0b9(Context context, GestureDetector.OnGestureListener onGestureListener) {
        String str;
        this.A0K = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.A08 = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
        if (context == null) {
            str = "Context must not be null";
        } else if (onGestureListener != null) {
            this.A0H = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.A06 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.A05 = viewConfiguration.getScaledMaximumFlingVelocity();
            this.A07 = scaledTouchSlop * scaledTouchSlop;
            this.A04 = scaledDoubleTapSlop * scaledDoubleTapSlop;
            return;
        } else {
            str = "OnGestureListener must not be null";
        }
        throw AnonymousClass000.A0T(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AYw(android.view.MotionEvent r15) {
        /*
            r14 = this;
            int r1 = r15.getAction()
            android.view.VelocityTracker r0 = r14.A0B
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r14.A0B = r0
        L_0x000e:
            r0.addMovement(r15)
            r10 = r1 & 255(0xff, float:3.57E-43)
            r1 = 6
            r7 = 1
            r4 = 0
            if (r10 != r1) goto L_0x0036
            r9 = 1
            int r8 = r15.getActionIndex()
        L_0x001d:
            int r5 = r15.getPointerCount()
            r11 = 0
            r6 = 0
            r3 = 0
            r2 = 0
        L_0x0025:
            if (r6 >= r5) goto L_0x0039
            if (r8 == r6) goto L_0x0033
            float r0 = r15.getX(r6)
            float r3 = r3 + r0
            float r0 = r15.getY(r6)
            float r2 = r2 + r0
        L_0x0033:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x0036:
            r9 = 0
            r8 = -1
            goto L_0x001d
        L_0x0039:
            r0 = r5
            if (r9 == 0) goto L_0x003e
            int r0 = r5 + -1
        L_0x003e:
            float r0 = (float) r0
            float r3 = r3 / r0
            float r2 = r2 / r0
            r6 = 2
            r9 = 3
            if (r10 == 0) goto L_0x01c2
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r10 == r7) goto L_0x013f
            if (r10 == r6) goto L_0x00d5
            if (r10 == r9) goto L_0x009b
            r0 = 5
            if (r10 == r0) goto L_0x00b3
            if (r10 != r1) goto L_0x0097
            r14.A02 = r3
            r14.A00 = r3
            r14.A03 = r2
            r14.A01 = r2
            android.view.VelocityTracker r1 = r14.A0B
            int r0 = r14.A05
            float r0 = (float) r0
            r1.computeCurrentVelocity(r8, r0)
            int r8 = r15.getActionIndex()
            int r1 = r15.getPointerId(r8)
            android.view.VelocityTracker r0 = r14.A0B
            float r7 = r0.getXVelocity(r1)
            android.view.VelocityTracker r0 = r14.A0B
            float r6 = r0.getYVelocity(r1)
            r3 = 0
        L_0x0077:
            if (r3 >= r5) goto L_0x0097
            if (r3 == r8) goto L_0x0098
            int r2 = r15.getPointerId(r3)
            android.view.VelocityTracker r0 = r14.A0B
            float r1 = r0.getXVelocity(r2)
            float r1 = r1 * r7
            android.view.VelocityTracker r0 = r14.A0B
            float r0 = r0.getYVelocity(r2)
            float r0 = r0 * r6
            float r1 = r1 + r0
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0098
            android.view.VelocityTracker r0 = r14.A0B
            r0.clear()
        L_0x0097:
            return r4
        L_0x0098:
            int r3 = r3 + 1
            goto L_0x0077
        L_0x009b:
            android.os.Handler r0 = r14.A0J
            r0.removeMessages(r7)
            r0.removeMessages(r6)
            r0.removeMessages(r9)
            android.view.VelocityTracker r0 = r14.A0B
            r0.recycle()
            r0 = 0
            r14.A0B = r0
            r14.A0G = r4
            r14.A0I = r4
            goto L_0x00c8
        L_0x00b3:
            r14.A02 = r3
            r14.A00 = r3
            r14.A03 = r2
            r14.A01 = r2
            android.os.Handler r0 = r14.A0J
            r0.removeMessages(r7)
            r0.removeMessages(r6)
            r0.removeMessages(r9)
            r14.A0G = r4
        L_0x00c8:
            r14.A0D = r4
            r14.A0C = r4
            r14.A0E = r4
            boolean r0 = r14.A0F
            if (r0 == 0) goto L_0x0097
            r14.A0F = r4
            return r4
        L_0x00d5:
            boolean r0 = r14.A0F
            if (r0 != 0) goto L_0x0097
            float r8 = r14.A02
            float r8 = r8 - r3
            float r5 = r14.A03
            float r5 = r5 - r2
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x00eb
            android.view.GestureDetector$OnDoubleTapListener r0 = r14.A08
            boolean r0 = r0.onDoubleTapEvent(r15)
            r4 = r4 | r0
            return r4
        L_0x00eb:
            boolean r0 = r14.A0D
            if (r0 == 0) goto L_0x0120
            float r0 = r14.A00
            float r0 = r3 - r0
            int r11 = (int) r0
            float r0 = r14.A01
            float r0 = r2 - r0
            int r0 = (int) r0
            int r11 = r11 * r11
            int r0 = r0 * r0
            int r11 = r11 + r0
            int r10 = r14.A07
            if (r11 <= r10) goto L_0x011e
            android.view.GestureDetector$OnGestureListener r1 = r14.A0K
            android.view.MotionEvent r0 = r14.A09
            boolean r1 = r1.onScroll(r0, r15, r8, r5)
            r14.A02 = r3
            r14.A03 = r2
            r14.A0D = r4
            android.os.Handler r0 = r14.A0J
            r0.removeMessages(r9)
            r0.removeMessages(r7)
            r0.removeMessages(r6)
        L_0x0119:
            if (r11 <= r10) goto L_0x016e
            r14.A0C = r4
            return r1
        L_0x011e:
            r1 = 0
            goto L_0x0119
        L_0x0120:
            float r0 = java.lang.Math.abs(r8)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0132
            float r0 = java.lang.Math.abs(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
        L_0x0132:
            android.view.GestureDetector$OnGestureListener r1 = r14.A0K
            android.view.MotionEvent r0 = r14.A09
            boolean r4 = r1.onScroll(r0, r15, r8, r5)
            r14.A02 = r3
            r14.A03 = r2
            return r4
        L_0x013f:
            r14.A0I = r4
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r15)
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x016f
            android.view.GestureDetector$OnDoubleTapListener r0 = r14.A08
            boolean r1 = r0.onDoubleTapEvent(r15)
        L_0x014f:
            android.view.MotionEvent r0 = r14.A0A
            if (r0 == 0) goto L_0x0156
            r0.recycle()
        L_0x0156:
            r14.A0A = r5
            android.view.VelocityTracker r0 = r14.A0B
            if (r0 == 0) goto L_0x0162
            r0.recycle()
            r0 = 0
            r14.A0B = r0
        L_0x0162:
            r14.A0G = r4
            r14.A0E = r4
            android.os.Handler r0 = r14.A0J
            r0.removeMessages(r7)
            r0.removeMessages(r6)
        L_0x016e:
            return r1
        L_0x016f:
            boolean r0 = r14.A0F
            if (r0 == 0) goto L_0x017c
            android.os.Handler r0 = r14.A0J
            r0.removeMessages(r9)
            r14.A0F = r4
        L_0x017a:
            r1 = 0
            goto L_0x014f
        L_0x017c:
            boolean r0 = r14.A0D
            if (r0 == 0) goto L_0x0192
            android.view.GestureDetector$OnGestureListener r0 = r14.A0K
            boolean r1 = r0.onSingleTapUp(r15)
            boolean r0 = r14.A0E
            if (r0 == 0) goto L_0x014f
            android.view.GestureDetector$OnDoubleTapListener r0 = r14.A08
            if (r0 == 0) goto L_0x014f
            r0.onSingleTapConfirmed(r15)
            goto L_0x014f
        L_0x0192:
            android.view.VelocityTracker r2 = r14.A0B
            int r1 = r15.getPointerId(r4)
            int r0 = r14.A05
            float r0 = (float) r0
            r2.computeCurrentVelocity(r8, r0)
            float r8 = r2.getYVelocity(r1)
            float r3 = r2.getXVelocity(r1)
            float r2 = java.lang.Math.abs(r8)
            int r0 = r14.A06
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01b9
            float r0 = java.lang.Math.abs(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x017a
        L_0x01b9:
            android.view.GestureDetector$OnGestureListener r1 = r14.A0K
            android.view.MotionEvent r0 = r14.A09
            boolean r1 = r1.onFling(r0, r15, r3, r8)
            goto L_0x014f
        L_0x01c2:
            android.view.GestureDetector$OnDoubleTapListener r8 = r14.A08
            if (r8 == 0) goto L_0x0272
            android.os.Handler r5 = r14.A0J
            boolean r0 = r5.hasMessages(r9)
            if (r0 == 0) goto L_0x01d1
            r5.removeMessages(r9)
        L_0x01d1:
            android.view.MotionEvent r11 = r14.A09
            if (r11 == 0) goto L_0x026c
            android.view.MotionEvent r1 = r14.A0A
            if (r1 == 0) goto L_0x026c
            if (r0 == 0) goto L_0x026c
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x026c
            long r12 = r15.getEventTime()
            long r0 = r1.getEventTime()
            long r12 = r12 - r0
            int r0 = A0L
            long r0 = (long) r0
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x026c
            float r0 = r11.getX()
            int r10 = (int) r0
            float r0 = r15.getX()
            int r0 = (int) r0
            int r10 = r10 - r0
            float r0 = r11.getY()
            int r1 = (int) r0
            float r0 = r15.getY()
            int r0 = (int) r0
            int r1 = r1 - r0
            int r10 = r10 * r10
            int r1 = r1 * r1
            int r10 = r10 + r1
            int r0 = r14.A04
            if (r10 >= r0) goto L_0x026c
            r14.A0G = r7
            android.view.MotionEvent r0 = r14.A09
            boolean r1 = r8.onDoubleTap(r0)
            boolean r0 = r8.onDoubleTapEvent(r15)
            r1 = r1 | r0
        L_0x0219:
            r14.A02 = r3
            r14.A00 = r3
            r14.A03 = r2
            r14.A01 = r2
            android.view.MotionEvent r0 = r14.A09
            if (r0 == 0) goto L_0x0228
            r0.recycle()
        L_0x0228:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r15)
            r14.A09 = r0
            r14.A0D = r7
            r14.A0C = r7
            r14.A0I = r7
            r14.A0F = r4
            r14.A0E = r4
            boolean r0 = r14.A0H
            if (r0 == 0) goto L_0x0254
            android.os.Handler r8 = r14.A0J
            r8.removeMessages(r6)
            android.view.MotionEvent r0 = r14.A09
            long r4 = r0.getDownTime()
            int r0 = A0M
            long r2 = (long) r0
            long r4 = r4 + r2
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r0
            long r4 = r4 + r2
            r8.sendEmptyMessageAtTime(r6, r4)
        L_0x0254:
            android.os.Handler r6 = r14.A0J
            android.view.MotionEvent r0 = r14.A09
            long r2 = r0.getDownTime()
            int r0 = A0M
            long r4 = (long) r0
            long r2 = r2 + r4
            r6.sendEmptyMessageAtTime(r7, r2)
            android.view.GestureDetector$OnGestureListener r0 = r14.A0K
            boolean r0 = r0.onDown(r15)
            r4 = r1 | r0
            return r4
        L_0x026c:
            int r0 = A0L
            long r0 = (long) r0
            r5.sendEmptyMessageDelayed(r9, r0)
        L_0x0272:
            r1 = 0
            goto L_0x0219
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0b9.AYw(android.view.MotionEvent):boolean");
    }

    public void Ae4(boolean z2) {
        this.A0H = z2;
    }
}
