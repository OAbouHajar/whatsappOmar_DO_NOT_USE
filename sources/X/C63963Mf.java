package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.3Mf  reason: invalid class name and case insensitive filesystem */
public class C63963Mf extends ScaleGestureDetector {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PhotoView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63963Mf(Context context, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, PhotoView photoView, int i2) {
        super(context, onScaleGestureListener);
        this.A01 = photoView;
        this.A00 = i2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getPointerCount() > 1) {
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                f3 += motionEvent.getX(i2);
                f4 += motionEvent.getY(i2);
            }
            float f5 = (float) pointerCount;
            float f6 = f3 / f5;
            float f7 = f4 / f5;
            float f8 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                f2 += AnonymousClass3K4.A01(motionEvent.getX(i3), f6);
                f8 += AnonymousClass3K4.A01(motionEvent.getY(i3), f7);
            }
            if (((float) Math.hypot((double) ((f2 / f5) * 2.0f), (double) ((f8 / f5) * 2.0f))) <= ((float) this.A00)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
