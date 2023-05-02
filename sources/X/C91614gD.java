package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.4gD  reason: invalid class name and case insensitive filesystem */
public class C91614gD implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public Surface A01;
    public C89054bW A02;
    public EGL10 A03;
    public EGLContext A04;
    public EGLDisplay A05;
    public EGLSurface A06;
    public boolean A07;
    public final Object A08 = C13690nt.A0Y();

    public C91614gD() {
        A02();
    }

    public C91614gD(int i2, int i3) {
        String str;
        if (i2 <= 0 || i3 <= 0) {
            throw AnonymousClass3K3.A0f();
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.A03 = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.A05 = eglGetDisplay;
        if (this.A03.eglInitialize(eglGetDisplay, (int[]) null)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (this.A03.eglChooseConfig(this.A05, new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                this.A04 = this.A03.eglCreateContext(this.A05, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                A01();
                if (this.A04 != null) {
                    this.A06 = this.A03.eglCreatePbufferSurface(this.A05, eGLConfigArr[0], new int[]{12375, i2, 12374, i3, 12344});
                    A01();
                    if (this.A06 != null) {
                        A00();
                        A02();
                        return;
                    }
                    str = "surface was null";
                } else {
                    str = "null context";
                }
            } else {
                str = "unable to find RGB888+pbuffer egl config";
            }
        } else {
            str = "unable to initialize EGL10";
        }
        throw AnonymousClass000.A0a(str);
    }

    public void A00() {
        String str;
        EGL10 egl10 = this.A03;
        if (egl10 != null) {
            A01();
            EGLDisplay eGLDisplay = this.A05;
            EGLSurface eGLSurface = this.A06;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A04)) {
                str = "eglMakeCurrent failed";
            } else {
                return;
            }
        } else {
            str = "not configured for makeCurrent";
        }
        throw AnonymousClass000.A0a(str);
    }

    public final void A01() {
        boolean z2 = false;
        while (this.A03.eglGetError() != 12288) {
            z2 = true;
        }
        if (z2) {
            throw AnonymousClass000.A0a("EGL error encountered (see log)");
        }
    }

    public final void A02() {
        String str;
        C89054bW r6 = new C89054bW();
        this.A02 = r6;
        int glCreateShader = GLES20.glCreateShader(35633);
        C89054bW.A00(C13680ns.A0c(35633, "glCreateShader type="));
        GLES20.glShaderSource(glCreateShader, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        int i2 = 0;
        if (glCreateShader != 0) {
            int glCreateShader2 = GLES20.glCreateShader(35632);
            C89054bW.A00(C13680ns.A0c(35632, "glCreateShader type="));
            GLES20.glShaderSource(glCreateShader2, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            GLES20.glCompileShader(glCreateShader2);
            int[] iArr2 = new int[1];
            GLES20.glGetShaderiv(glCreateShader2, 35713, iArr2, 0);
            if (iArr2[0] == 0) {
                GLES20.glDeleteShader(glCreateShader2);
            } else if (glCreateShader2 != 0) {
                int glCreateProgram = GLES20.glCreateProgram();
                C89054bW.A00("glCreateProgram");
                GLES20.glAttachShader(glCreateProgram, glCreateShader);
                C89054bW.A00("glAttachShader");
                GLES20.glAttachShader(glCreateProgram, glCreateShader2);
                C89054bW.A00("glAttachShader");
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr3 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr3, 0);
                if (iArr3[0] != 1) {
                    GLES20.glDeleteProgram(glCreateProgram);
                } else {
                    i2 = glCreateProgram;
                }
            }
        }
        r6.A02 = i2;
        if (i2 != 0) {
            r6.A00 = GLES20.glGetAttribLocation(i2, "aPosition");
            C89054bW.A00("glGetAttribLocation aPosition");
            if (r6.A00 != -1) {
                r6.A01 = GLES20.glGetAttribLocation(r6.A02, "aTextureCoord");
                C89054bW.A00("glGetAttribLocation aTextureCoord");
                if (r6.A01 != -1) {
                    r6.A04 = GLES20.glGetUniformLocation(r6.A02, "uMVPMatrix");
                    C89054bW.A00("glGetUniformLocation uMVPMatrix");
                    if (r6.A04 != -1) {
                        r6.A05 = GLES20.glGetUniformLocation(r6.A02, "uSTMatrix");
                        C89054bW.A00("glGetUniformLocation uSTMatrix");
                        if (r6.A05 != -1) {
                            int[] iArr4 = new int[1];
                            GLES20.glGenTextures(1, iArr4, 0);
                            int i3 = iArr4[0];
                            r6.A03 = i3;
                            GLES20.glBindTexture(36197, i3);
                            C89054bW.A00("glBindTexture textureID");
                            GLES20.glTexParameterf(36197, 10241, 9729.0f);
                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            C89054bW.A00("glTexParameter");
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.A02.A03);
                            this.A00 = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            this.A01 = new Surface(this.A00);
                            return;
                        }
                        str = "Could not get attrib location for uSTMatrix";
                    } else {
                        str = "Could not get attrib location for uMVPMatrix";
                    }
                } else {
                    str = "Could not get attrib location for aTextureCoord";
                }
            } else {
                str = "Could not get attrib location for aPosition";
            }
        } else {
            str = "failed creating program";
        }
        throw AnonymousClass000.A0a(str);
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A08;
        synchronized (obj) {
            if (!this.A07) {
                this.A07 = true;
                obj.notifyAll();
            } else {
                throw AnonymousClass000.A0a("frameAvailable already set, frame could be dropped");
            }
        }
    }
}
