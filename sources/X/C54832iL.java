package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.2iL  reason: invalid class name and case insensitive filesystem */
public class C54832iL extends GestureDetector.SimpleOnGestureListener {
    public final C54822iK A00;

    public C54832iL(C54822iK r1) {
        this.A00 = r1;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (Math.abs(f2) <= Math.abs(f3)) {
            return true;
        }
        this.A00.A00.A00(f2);
        return true;
    }
}
