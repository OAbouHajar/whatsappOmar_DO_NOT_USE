package X;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.09P  reason: invalid class name */
public final class AnonymousClass09P {
    public final C13020lL A00;

    public AnonymousClass09P(Context context, GestureDetector.OnGestureListener onGestureListener) {
        if (Build.VERSION.SDK_INT > 17) {
            this.A00 = new AnonymousClass0b8(context, onGestureListener);
        } else {
            this.A00 = new AnonymousClass0b9(context, onGestureListener);
        }
    }

    public boolean A00(MotionEvent motionEvent) {
        return this.A00.AYw(motionEvent);
    }
}
