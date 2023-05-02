package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.3D0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3D0 implements View.OnTouchListener {
    public final /* synthetic */ PointF A00;
    public final /* synthetic */ C41811wh A01;
    public final /* synthetic */ AtomicLong A02;

    public /* synthetic */ AnonymousClass3D0(PointF pointF, C41811wh r2, AtomicLong atomicLong) {
        this.A01 = r2;
        this.A00 = pointF;
        this.A02 = atomicLong;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C41811wh r4 = this.A01;
        PointF pointF = this.A00;
        AtomicLong atomicLong = this.A02;
        if (r4.A00.A0B != 4) {
            return false;
        }
        r4.A09();
        if (motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (r4.A09() instanceof C606734v) {
                    C606734v r8 = (C606734v) r4.A09();
                    boolean A0O = r8.A0O(motionEvent.getX(), motionEvent.getY(), false);
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    Rect A0J = AnonymousClass000.A0J();
                    View view2 = r8.A05;
                    if (view2 != null) {
                        view2.getGlobalVisibleRect(A0J);
                    }
                    if (A0J.contains((int) x2, (int) y2)) {
                        return false;
                    }
                    if (A0O) {
                        return true;
                    }
                }
                pointF.set(motionEvent.getX(), motionEvent.getY());
                atomicLong.set(SystemClock.elapsedRealtime());
                r4.A0C();
                Handler handler = r4.A08;
                Runnable runnable = r4.A0Z;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 500);
            } else if (action == 1) {
                if (r4.A09() instanceof C606734v) {
                    C606734v r6 = (C606734v) r4.A09();
                    boolean A0O2 = r6.A0O(motionEvent.getX(), motionEvent.getY(), true);
                    float x3 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    Rect A0J2 = AnonymousClass000.A0J();
                    View view3 = r6.A05;
                    if (view3 != null) {
                        view3.getGlobalVisibleRect(A0J2);
                    }
                    boolean contains = A0J2.contains((int) x3, (int) y3);
                    if (A0O2 || contains) {
                        return true;
                    }
                }
                pointF.set(motionEvent.getX(), motionEvent.getY());
                r4.A0D();
                view.performClick();
            }
        }
        if (motionEvent.getAction() != 3) {
            return false;
        }
        r4.A0D();
        r4.A0G();
        return false;
    }
}
