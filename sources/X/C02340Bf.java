package X;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Map;

/* renamed from: X.0Bf  reason: invalid class name and case insensitive filesystem */
public class C02340Bf extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public PointF A00;
    public boolean A01;
    public boolean A02;
    public final View A03;
    public final C05080Pe A04;
    public final C14990q7 A05;
    public final C31201dg A06;
    public final C31201dg A07;
    public final Map A08 = new AnonymousClass00N(2);

    public C02340Bf(View view, C05080Pe r4, C14990q7 r5, C31201dg r6, C31201dg r7) {
        this.A05 = r5;
        this.A07 = r6;
        this.A06 = r7;
        this.A03 = view;
        this.A04 = r4;
    }

    public static Float A00(View view, float f2) {
        return Float.valueOf((f2 * 100.0f) / ((float) view.getHeight()));
    }

    public C14930q1 A01(int i2) {
        Map map = this.A08;
        Integer valueOf = Integer.valueOf(i2);
        if (map.containsKey(valueOf)) {
            return (C14930q1) map.get(valueOf);
        }
        C14930q1 A0H = this.A07.A0H(i2);
        map.put(valueOf, A0H);
        return A0H;
    }

    public void A02(MotionEvent motionEvent) {
        C14930q1 A012 = A01(50);
        if (A012 != null) {
            PointF A002 = this.A04.A00(new PointF(motionEvent.getX(), motionEvent.getY()));
            C31201dg r5 = this.A07;
            C14940q2 r7 = new C14940q2();
            r7.A02(this.A06, 0);
            C14990q7 r4 = this.A05;
            r7.A02(r4, 1);
            View view = this.A03;
            r7.A02(Float.valueOf((A002.x * 100.0f) / ((float) view.getWidth())), 2);
            r7.A02(A00(view, A002.y), 3);
            C29701b3.A01(r4, r5, r7.A01(), A012);
        }
    }

    public final boolean A03() {
        return (A01(36) == null && A01(45) == null) ? false : true;
    }

    public final boolean A04() {
        C14930q1 A012 = A01(43);
        if (A012 == null) {
            return false;
        }
        C31201dg r3 = this.A07;
        C14940q2 r2 = new C14940q2();
        r2.A02(this.A06, 0);
        C14990q7 r1 = this.A05;
        r2.A02(r1, 1);
        C29701b3.A01(r1, r3, r2.A01(), A012);
        return true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C14930q1 A012 = A01(45);
        if (A012 == null) {
            A012 = A01(36);
        }
        if (A012 == null) {
            return false;
        }
        PointF A002 = this.A04.A00(new PointF(motionEvent.getX(), motionEvent.getY()));
        C31201dg r6 = this.A07;
        C14940q2 r8 = new C14940q2();
        r8.A02(this.A06, 0);
        C14990q7 r5 = this.A05;
        r8.A02(r5, 1);
        View view = this.A03;
        r8.A02(Float.valueOf((A002.x * 100.0f) / ((float) view.getWidth())), 2);
        r8.A02(A00(view, A002.y), 3);
        C29701b3.A01(r5, r6, r8.A01(), A012);
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        C14930q1 A012 = A01(49);
        if (A012 != null) {
            PointF A002 = this.A04.A00(new PointF(motionEvent.getX(), motionEvent.getY()));
            C31201dg r5 = this.A07;
            C14940q2 r8 = new C14940q2();
            r8.A02(this.A06, 0);
            C14990q7 r4 = this.A05;
            r8.A02(r4, 1);
            View view = this.A03;
            r8.A02(Float.valueOf((A002.x * 100.0f) / ((float) view.getWidth())), 2);
            r8.A02(A00(view, A002.y), 3);
            C29701b3.A01(r4, r5, r8.A01(), A012);
        }
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        int i2;
        if (!(motionEvent == null || motionEvent2 == null)) {
            float x2 = motionEvent2.getX() - motionEvent.getX();
            float y2 = motionEvent2.getY() - motionEvent.getY();
            if (AnonymousClass000.A1Q((Math.abs(y2) > Math.abs(x2) ? 1 : (Math.abs(y2) == Math.abs(x2) ? 0 : -1)))) {
                i2 = 42;
                if (y2 > 0.0f) {
                    i2 = 38;
                }
            } else {
                i2 = 40;
                if (x2 > 0.0f) {
                    i2 = 41;
                }
            }
            C14930q1 A012 = A01(i2);
            if (A012 != null) {
                C31201dg r4 = this.A07;
                C14940q2 r3 = new C14940q2();
                r3.A02(this.A06, 0);
                C14990q7 r2 = this.A05;
                r3.A02(r2, 1);
                C29701b3.A01(r2, r4, r3.A01(), A012);
                return true;
            }
        }
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        C14930q1 A012 = A01(35);
        if (A012 != null) {
            C31201dg r3 = this.A07;
            C14940q2 r2 = new C14940q2();
            r2.A02(this.A06, 0);
            C14990q7 r1 = this.A05;
            r2.A02(r1, 1);
            C29701b3.A01(r1, r3, r2.A01(), A012);
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C14930q1 A012;
        if (this.A00 == null || (A012 = A01(44)) == null) {
            return false;
        }
        C31201dg r5 = this.A07;
        C14940q2 r7 = new C14940q2();
        r7.A02(this.A06, 0);
        C14990q7 r4 = this.A05;
        r7.A02(r4, 1);
        r7.A02(Float.valueOf(scaleGestureDetector.getScaleFactor()), 2);
        View view = this.A03;
        r7.A02(Float.valueOf((this.A00.x * 100.0f) / ((float) view.getWidth())), 3);
        r7.A02(A00(view, this.A00.y), 4);
        C29701b3.A01(r4, r5, r7.A01(), A012);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = this.A04.A00(new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = null;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        C14930q1 A012 = A01(48);
        if (A012 != null) {
            C31201dg r6 = this.A07;
            C14940q2 r8 = new C14940q2();
            r8.A02(this.A06, 0);
            C14990q7 r5 = this.A05;
            r8.A02(r5, 1);
            View view = this.A03;
            r8.A02(Float.valueOf((f2 * 100.0f) / ((float) view.getWidth())), 2);
            r8.A02(A00(view, f3), 3);
            Object A013 = C29701b3.A01(r5, r6, r8.A01(), A012);
            if (!(A013 instanceof Boolean)) {
                C29691b2.A00("BloksFoaExtensionsGestureListener", "onScroll return value should return boolean (true if handled)");
            } else {
                boolean A1X = AnonymousClass000.A1X(A013);
                if (A1X) {
                    this.A02 = true;
                }
                this.A01 = true;
                return A1X;
            }
        }
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return A03() && A04();
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return !A03() && A04();
    }
}
