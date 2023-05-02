package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.0b8  reason: invalid class name */
public class AnonymousClass0b8 implements C13020lL {
    public final GestureDetector A00;

    public AnonymousClass0b8(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.A00 = new GestureDetector(context, onGestureListener, (Handler) null);
    }

    public boolean AYw(MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }

    public void Ae4(boolean z2) {
        this.A00.setIsLongpressEnabled(z2);
    }
}
