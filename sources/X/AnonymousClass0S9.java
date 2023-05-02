package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* renamed from: X.0S9  reason: invalid class name */
public class AnonymousClass0S9 {
    public EGLSurface A00 = EGL14.EGL_NO_SURFACE;
    public Surface A01;
    public AnonymousClass0WP A02;
    public boolean A03;

    public AnonymousClass0S9(AnonymousClass0WP r2) {
        this.A02 = r2;
    }

    public int A00() {
        return this.A02.A01(this.A00, 12374);
    }

    public int A01() {
        return this.A02.A01(this.A00, 12375);
    }

    public void A02() {
        this.A02.A04(this.A00);
    }

    public void A03() {
        this.A02.A05(this.A00);
        this.A00 = EGL14.EGL_NO_SURFACE;
    }

    public void A04() {
        if (!this.A02.A06(this.A00)) {
            Log.d("Grafika", "WARNING: swapBuffers() failed");
        }
    }

    public void A05(Object obj) {
        if (this.A00 == EGL14.EGL_NO_SURFACE) {
            this.A00 = this.A02.A02(obj);
            return;
        }
        throw AnonymousClass000.A0V("surface already created");
    }
}
