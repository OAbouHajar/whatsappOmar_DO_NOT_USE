package X;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.5Ks  reason: invalid class name */
public final class AnonymousClass5Ks extends C90194dg {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03 = EGL10.EGL_NO_SURFACE;
    public final EGL10 A04;

    public AnonymousClass5Ks(int[] iArr) {
        String str;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.A04 = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            str = "Unable to get EGL10 display";
        } else if (egl10.eglInitialize(eglGetDisplay, new int[2])) {
            this.A02 = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (this.A04.eglChooseConfig(eglGetDisplay, iArr, eGLConfigArr, 1, new int[1])) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.A00 = eGLConfig;
                EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                EGLContext eglCreateContext = this.A04.eglCreateContext(this.A02, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
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
            str = "Unable to initialize EGL10";
        }
        throw AnonymousClass000.A0a(str);
    }

    public final void A0D() {
        if (this.A02 == EGL10.EGL_NO_DISPLAY || this.A01 == EGL10.EGL_NO_CONTEXT || this.A00 == null) {
            throw AnonymousClass000.A0a("This object has been released");
        }
    }

    public final void A0E(Object obj) {
        String str;
        if ((obj instanceof SurfaceHolder) || (obj instanceof SurfaceTexture)) {
            A0D();
            if (this.A03 == EGL10.EGL_NO_SURFACE) {
                EGLSurface eglCreateWindowSurface = this.A04.eglCreateWindowSurface(this.A02, this.A00, obj, new int[]{12344});
                this.A03 = eglCreateWindowSurface;
                if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
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
        throw AnonymousClass000.A0V("Input must be either a SurfaceHolder or SurfaceTexture");
    }
}
