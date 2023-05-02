package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.4kc  reason: invalid class name and case insensitive filesystem */
public class C94254kc implements View.OnTouchListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public C94254kc(float f2, float f3, float f4, float f5) {
        StringBuilder A0r = AnonymousClass000.A0r("ReducedAreaOnTouchListener/ignored_ratio -- left: ");
        A0r.append(f2);
        A0r.append(", right: ");
        A0r.append(f4);
        A0r.append(", top: ");
        A0r.append(f3);
        A0r.append(", bottom: ");
        A0r.append(f5);
        C13680ns.A1V(A0r);
        if (f2 < 0.0f || f2 > 1.0f || f4 < 0.0f || f4 > 1.0f || f3 < 0.0f || f3 > 1.0f || f5 < 0.0f || f5 > 1.0f) {
            throw AnonymousClass000.A0a("invalid input parameters");
        }
        this.A01 = f2;
        this.A02 = f4;
        this.A03 = f3;
        this.A00 = f5;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
            StringBuilder A0r = AnonymousClass000.A0r("ReducedAreaOnTouchListener/onTouch ");
            A0r.append(motionEvent);
            A0r.append(", view width:");
            A0r.append(width);
            A0r.append(", view height:");
            A0r.append(height);
            A0r.append(", pointer count: ");
            A0r.append(motionEvent.getPointerCount());
            C13680ns.A1V(A0r);
        }
        if (motionEvent.getAction() != 0) {
            return false;
        }
        float f2 = (float) width;
        if (motionEvent.getX() >= this.A01 * f2) {
            float f3 = (float) height;
            if (motionEvent.getY() >= this.A03 * f3 && motionEvent.getX() <= (1.0f - this.A02) * f2 && motionEvent.getY() <= (1.0f - this.A00) * f3) {
                return false;
            }
        }
        Log.i("ReducedAreaOnTouchListener/ignore this touch event");
        return true;
    }
}
