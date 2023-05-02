package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;

/* renamed from: X.56c  reason: invalid class name and case insensitive filesystem */
public final class C1046056c implements Runnable, SurfaceTexture.OnFrameAvailableListener {
    public static final int[] A06 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public C1046056c(Handler handler) {
        this.A04 = handler;
    }

    public void A00() {
        this.A04.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.A00;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.A02;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.A02;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.A03;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            EGLContext eGLContext = this.A01;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.A02, eGLContext);
            }
            if (AnonymousClass3C1.A01 >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.A02;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.A02);
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
        }
    }

    public void A01(int i2) {
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.A02 = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, A06, 0, eGLConfigArr, 0, 1, iArr2, 0);
                if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    Object[] objArr = new Object[3];
                    objArr[0] = Boolean.valueOf(eglChooseConfig);
                    AnonymousClass000.A1M(objArr, iArr2[0], 1);
                    objArr[2] = eGLConfigArr[0];
                    throw new AnonymousClass5AZ(AnonymousClass3K4.A0b("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.A02, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eglCreateContext != null) {
                    this.A01 = eglCreateContext;
                    EGLDisplay eGLDisplay = this.A02;
                    if (i2 == 1) {
                        eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                    } else {
                        eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                        if (eglCreatePbufferSurface == null) {
                            throw new AnonymousClass5AZ("eglCreatePbufferSurface failed");
                        }
                    }
                    if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                        this.A03 = eglCreatePbufferSurface;
                        int[] iArr3 = this.A05;
                        GLES20.glGenTextures(1, iArr3, 0);
                        while (true) {
                            int glGetError = GLES20.glGetError();
                            if (glGetError != 0) {
                                Log.e("GlUtil", AnonymousClass000.A0h(GLU.gluErrorString(glGetError), AnonymousClass000.A0r("glError ")));
                            } else {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
                                this.A00 = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                return;
                            }
                        }
                    } else {
                        throw new AnonymousClass5AZ("eglMakeCurrent failed");
                    }
                } else {
                    throw new AnonymousClass5AZ("eglCreateContext failed");
                }
            } else {
                throw new AnonymousClass5AZ("eglInitialize failed");
            }
        } else {
            throw new AnonymousClass5AZ("eglGetDisplay failed");
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    public void run() {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
