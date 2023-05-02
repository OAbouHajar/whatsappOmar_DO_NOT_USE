package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.3Ma  reason: invalid class name */
public class AnonymousClass3Ma extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C57592rQ A00;
    public final /* synthetic */ AnonymousClass4D6 A01;

    public AnonymousClass3Ma(C57592rQ r1, AnonymousClass4D6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean onDown(MotionEvent motionEvent) {
        AnonymousClass4D6 r0 = this.A01;
        if (r0 == null) {
            return false;
        }
        r0.A00.A3A(true);
        return true;
    }
}
