package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: X.3Me  reason: invalid class name and case insensitive filesystem */
public class C63953Me extends ScaleGestureDetector {
    public float A00;

    public C63953Me(Context context, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener) {
        super(context, onScaleGestureListener);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float y2;
        if (motionEvent.getPointerCount() == 2) {
            float x2 = motionEvent.getX(0) - motionEvent.getX(1);
            if (x2 == 0.0f) {
                y2 = Float.MAX_VALUE;
                this.A00 = Float.MAX_VALUE;
            } else {
                y2 = (motionEvent.getY(0) - motionEvent.getY(1)) / x2;
            }
            this.A00 = y2;
        }
        return super.onTouchEvent(motionEvent);
    }
}
