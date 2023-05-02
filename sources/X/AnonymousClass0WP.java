package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;
import android.view.Surface;

/* renamed from: X.0WP  reason: invalid class name */
public final class AnonymousClass0WP {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;

    public AnonymousClass0WP() {
        this((EGLContext) null, 0);
    }

    public AnonymousClass0WP(EGLContext eGLContext, int i2) {
        String str;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.A02 = eGLDisplay;
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext2;
        this.A00 = null;
        if (eGLDisplay == eGLDisplay) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A02 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLContext eGLContext3 = this.A01;
                    if (eGLContext3 == EGL14.EGL_NO_CONTEXT) {
                        int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
                        iArr2[10] = 12610;
                        iArr2[11] = 1;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (!EGL14.eglChooseConfig(this.A02, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            StringBuilder A0r = AnonymousClass000.A0r("unable to find RGB8888 / ");
                            A0r.append(2);
                            Log.w("Grafika", AnonymousClass000.A0h(" EGLConfig", A0r));
                        } else {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            if (eGLConfig != null) {
                                eGLContext3 = EGL14.eglCreateContext(this.A02, eGLConfig, eGLContext2, new int[]{12440, 2, 12344}, 0);
                                A00("eglCreateContext");
                                this.A00 = eGLConfig;
                                this.A01 = eGLContext3;
                            }
                        }
                        str = "Unable to find a suitable EGLConfig";
                    }
                    int[] iArr3 = new int[1];
                    EGL14.eglQueryContext(this.A02, eGLContext3, 12440, iArr3, 0);
                    Log.d("Grafika", AnonymousClass000.A0l(AnonymousClass000.A0r("EGLContext created, client version "), iArr3[0]));
                    return;
                }
                this.A02 = null;
                str = "unable to initialize EGL14";
            } else {
                str = "unable to get EGL14 display";
            }
        } else {
            str = "EGL already set up";
        }
        throw AnonymousClass000.A0a(str);
    }

    public static final void A00(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(": EGL error: 0x");
            throw AnonymousClass000.A0a(AnonymousClass000.A0h(Integer.toHexString(eglGetError), A0q));
        }
    }

    public int A01(EGLSurface eGLSurface, int i2) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.A02, eGLSurface, i2, iArr, 0);
        return iArr[0];
    }

    public EGLSurface A02(Object obj) {
        String str;
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.A02, this.A00, obj, new int[]{12344}, 0);
            A00("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            str = "surface was null";
        } else {
            str = AnonymousClass000.A0g("invalid surface: ", obj);
        }
        throw AnonymousClass000.A0a(str);
    }

    public void A03() {
        EGLDisplay eGLDisplay = this.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.A02, this.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A02);
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
    }

    public void A04(EGLSurface eGLSurface) {
        if (this.A02 == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.A02, eGLSurface, eGLSurface, this.A01)) {
            throw AnonymousClass000.A0a("eglMakeCurrent failed");
        }
    }

    public void A05(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.A02, eGLSurface);
    }

    public boolean A06(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.A02, eGLSurface);
    }

    public void finalize() {
        try {
            if (this.A02 != EGL14.EGL_NO_DISPLAY) {
                Log.w("Grafika", "WARNING: EglCore was not explicitly released -- state may be leaked");
                A03();
            }
        } finally {
            super.finalize();
        }
    }
}
