package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.0fF  reason: invalid class name and case insensitive filesystem */
public class C09280fF implements Runnable {
    public final /* synthetic */ C06970Yq A00;

    public C09280fF(C06970Yq r1) {
        this.A00 = r1;
    }

    public void run() {
        C06970Yq r3 = this.A00;
        r3.A01();
        View view = r3.A07;
        if (view.isEnabled() && !view.isLongClickable() && r3.A03()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            r3.A03 = true;
        }
    }
}
