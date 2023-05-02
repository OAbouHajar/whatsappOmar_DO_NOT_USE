package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.4aK  reason: invalid class name and case insensitive filesystem */
public class C88334aK {
    public AnonymousClass3CW A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final PointF A04 = new PointF();
    public final PointF A05 = new PointF();
    public final PointF A06 = new PointF();

    public C88334aK(Context context, AnonymousClass3CW r3) {
        this.A00 = r3;
        this.A03 = ViewConfiguration.get(context).getScaledPagingTouchSlop() >> 2;
    }

    public static final void A00(PointF pointF, MotionEvent motionEvent) {
        pointF.set(0.0f, 0.0f);
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointF.x += motionEvent.getX(i2);
            pointF.y += motionEvent.getY(i2);
        }
        float f2 = (float) pointerCount;
        pointF.x /= f2;
        pointF.y /= f2;
    }
}
