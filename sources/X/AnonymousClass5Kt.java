package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;

/* renamed from: X.5Kt  reason: invalid class name */
public final class AnonymousClass5Kt extends C90194dg {
    public static final int A04 = Build.VERSION.SDK_INT;
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03 = EGL14.EGL_NO_SURFACE;

    public AnonymousClass5Kt(AnonymousClass5Kr r11, int[] iArr) {
        String str;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                this.A02 = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(eglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.A00 = eGLConfig;
                    EGLDisplay eGLDisplay = this.A02;
                    if (r11 != null) {
                        throw AnonymousClass000.A0W("egl14Context");
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        this.A01 = eglCreateContext;
                        return;
                    } else {
                        AnonymousClass4YC.A00("eglCreateContext");
                        str = "Failed to create EGL context";
                    }
                } else {
                    AnonymousClass4YC.A00("eglChooseConfig");
                    str = "Unable to find any matching EGL config";
                }
            } else {
                AnonymousClass4YC.A00("eglInitialize");
                str = "Unable to initialize EGL14";
            }
        } else {
            str = "Unable to get EGL14 display";
        }
        throw AnonymousClass000.A0a(str);
    }

    public static boolean A02() {
        return A04 >= 18;
    }

    public int A03() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.A02, this.A03, 12374, iArr, 0);
        return iArr[0];
    }

    public int A04() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.A02, this.A03, 12375, iArr, 0);
        return iArr[0];
    }

    public void A05() {
        EGLDisplay eGLDisplay = this.A02;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            AnonymousClass4YC.A00("detachCurrent");
            throw AnonymousClass000.A0a("eglMakeCurrent failed");
        }
    }

    public void A06() {
        String str;
        A0D();
        EGLSurface eGLSurface = this.A03;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            str = "No EGLSurface - can't make current";
        } else if (!EGL14.eglMakeCurrent(this.A02, eGLSurface, eGLSurface, this.A01)) {
            AnonymousClass4YC.A00("makeCurrent");
            str = "eglMakeCurrent failed";
        } else {
            return;
        }
        throw AnonymousClass000.A0a(str);
    }

    public void A07() {
        A0D();
        A08();
        A05();
        EGL14.eglDestroyContext(this.A02, this.A01);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.A02);
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A00 = null;
    }

    public void A08() {
        EGLSurface eGLSurface = this.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.A02, eGLSurface);
            this.A03 = EGL14.EGL_NO_SURFACE;
        }
    }

    public void A09(SurfaceTexture surfaceTexture) {
        A0F(surfaceTexture);
    }

    public void A0A(Surface surface) {
        A0F(surface);
    }

    public boolean A0B() {
        return C13680ns.A1a(this.A03, EGL14.EGL_NO_SURFACE);
    }

    public boolean A0C() {
        A0D();
        EGLSurface eGLSurface = this.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            return EGL14.eglSwapBuffers(this.A02, eGLSurface);
        }
        throw AnonymousClass000.A0a("No EGLSurface - can't swap buffers");
    }

    public final void A0D() {
        if (this.A02 == EGL14.EGL_NO_DISPLAY || this.A01 == EGL14.EGL_NO_CONTEXT || this.A00 == null) {
            throw AnonymousClass000.A0a("This object has been released");
        }
    }

    public void A0E(long j2) {
        A0D();
        EGLSurface eGLSurface = this.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGLExt.eglPresentationTimeANDROID(this.A02, eGLSurface, j2);
            EGL14.eglSwapBuffers(this.A02, this.A03);
            return;
        }
        throw AnonymousClass000.A0a("No EGLSurface - can't swap buffers");
    }

    public final void A0F(Object obj) {
        String str;
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            A0D();
            if (this.A03 == EGL14.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.A02, this.A00, obj, new int[]{12344}, 0);
                this.A03 = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    AnonymousClass4YC.A00("eglCreateWindowSurface");
                    str = "Failed to create window surface";
                } else {
                    return;
                }
            } else {
                str = "Already has an EGLSurface";
            }
            throw AnonymousClass000.A0a(str);
        }
        throw AnonymousClass000.A0V("Input must be either a Surface or SurfaceTexture");
    }
}
