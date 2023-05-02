package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.4dg  reason: invalid class name and case insensitive filesystem */
public abstract class C90194dg {
    public static final int[] A00 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] A01 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] A02 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    public static C90194dg A00(int[] iArr) {
        return AnonymousClass5Kt.A02() ? new AnonymousClass5Kt((AnonymousClass5Kr) null, iArr) : new AnonymousClass5Ks(iArr);
    }

    public static short A01(C90194dg r1) {
        return r1.A0C() ? (short) 0 : -3;
    }

    public int A03() {
        AnonymousClass5Ks r1 = (AnonymousClass5Ks) this;
        int[] iArr = new int[1];
        r1.A04.eglQuerySurface(r1.A02, r1.A03, 12374, iArr);
        return iArr[0];
    }

    public int A04() {
        AnonymousClass5Ks r1 = (AnonymousClass5Ks) this;
        int[] iArr = new int[1];
        r1.A04.eglQuerySurface(r1.A02, r1.A03, 12375, iArr);
        return iArr[0];
    }

    public void A05() {
        AnonymousClass5Ks r0 = (AnonymousClass5Ks) this;
        EGL10 egl10 = r0.A04;
        EGLDisplay eGLDisplay = r0.A02;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            AnonymousClass4YC.A00("detachCurrent");
            throw AnonymousClass000.A0a("eglMakeCurrent failed");
        }
    }

    public void A06() {
        String str;
        AnonymousClass5Ks r4 = (AnonymousClass5Ks) this;
        r4.A0D();
        EGLSurface eGLSurface = r4.A03;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            str = "No EGLSurface - can't make current";
        } else if (!r4.A04.eglMakeCurrent(r4.A02, eGLSurface, eGLSurface, r4.A01)) {
            AnonymousClass4YC.A00("makeCurrent");
            str = "eglMakeCurrent failed";
        } else {
            return;
        }
        throw AnonymousClass000.A0a(str);
    }

    public void A07() {
        AnonymousClass5Ks r3 = (AnonymousClass5Ks) this;
        r3.A0D();
        r3.A08();
        r3.A05();
        EGL10 egl10 = r3.A04;
        egl10.eglDestroyContext(r3.A02, r3.A01);
        egl10.eglTerminate(r3.A02);
        r3.A01 = EGL10.EGL_NO_CONTEXT;
        r3.A02 = EGL10.EGL_NO_DISPLAY;
        r3.A00 = null;
    }

    public void A08() {
        AnonymousClass5Ks r3 = (AnonymousClass5Ks) this;
        EGLSurface eGLSurface = r3.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            r3.A04.eglDestroySurface(r3.A02, eGLSurface);
            r3.A03 = EGL10.EGL_NO_SURFACE;
        }
    }

    public void A09(SurfaceTexture surfaceTexture) {
        ((AnonymousClass5Ks) this).A0E(surfaceTexture);
    }

    public void A0A(Surface surface) {
        AnonymousClass5Ks r1 = (AnonymousClass5Ks) this;
        r1.A0E(new C93914jy(surface, r1));
    }

    public boolean A0B() {
        return C13680ns.A1a(((AnonymousClass5Ks) this).A03, EGL10.EGL_NO_SURFACE);
    }

    public boolean A0C() {
        AnonymousClass5Ks r3 = (AnonymousClass5Ks) this;
        r3.A0D();
        EGLSurface eGLSurface = r3.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            return r3.A04.eglSwapBuffers(r3.A02, eGLSurface);
        }
        throw AnonymousClass000.A0a("No EGLSurface - can't swap buffers");
    }
}
