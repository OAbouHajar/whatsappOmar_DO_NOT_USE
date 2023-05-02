package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.5yF  reason: invalid class name */
public class AnonymousClass5yF implements SurfaceTexture.OnFrameAvailableListener {
    public static final FloatBuffer A0S;
    public static final FloatBuffer A0T;
    public static final float[] A0U;
    public static final float[] A0V;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public SurfaceTexture A0A;
    public SurfaceTexture A0B;
    public EGLConfig A0C;
    public EGLContext A0D;
    public EGLDisplay A0E;
    public EGLSurface A0F;
    public boolean A0G;
    public final Object A0H;
    public final Object A0I;
    public final float[] A0J;
    public final float[] A0K;
    public final float[] A0L;
    public final float[] A0M;
    public final int[] A0N = new int[2];
    public volatile int A0O;
    public volatile int A0P;
    public volatile EGLSurface A0Q;
    public volatile EGLSurface A0R;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0U = fArr;
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        A0V = fArr2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        A0T = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        A0S = asFloatBuffer2;
    }

    public AnonymousClass5yF() {
        String str;
        EGLConfig eGLConfig;
        int A002;
        float[] fArr = new float[16];
        this.A0L = fArr;
        float[] fArr2 = new float[16];
        this.A0M = fArr2;
        float[] fArr3 = new float[16];
        this.A0J = fArr3;
        float[] fArr4 = new float[16];
        this.A0K = fArr4;
        this.A03 = -1;
        this.A0Q = EGL14.EGL_NO_SURFACE;
        this.A0R = EGL14.EGL_NO_SURFACE;
        this.A0H = C13690nt.A0Y();
        this.A0I = C13690nt.A0Y();
        this.A09 = 0;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        Matrix.setIdentityM(fArr4, 0);
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A0E = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(this.A0E, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0) || (eGLConfig = eGLConfigArr[0]) == null) {
                    str = "Unable to find a suitable EGLConfig";
                } else {
                    this.A0C = eGLConfig;
                    this.A0D = EGL14.eglCreateContext(this.A0E, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    int eglGetError = EGL14.eglGetError();
                    if (eglGetError != 12288 || this.A0D == null) {
                        str = AnonymousClass000.A0h(Integer.toHexString(eglGetError), AnonymousClass000.A0r("eglCreateContext: EGL error: 0x"));
                    } else {
                        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.A0E, this.A0C, new int[]{12375, 1, 12374, 1, 12344}, 0);
                        this.A0F = eglCreatePbufferSurface;
                        if (eglCreatePbufferSurface == null || EGL14.eglGetError() != 12288) {
                            this.A0F = EGL14.EGL_NO_SURFACE;
                        }
                        EGLDisplay eGLDisplay = this.A0E;
                        EGLSurface eGLSurface = this.A0F;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A0D);
                        int A003 = A00(35633, "precision mediump float;\nuniform mat4 uSurfaceTransformMatrix;\nuniform mat4 uSceneTransformMatrix;\nuniform mat4 uVideoTransformMatrix;\n\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uSceneTransformMatrix * aPosition;\n  vTextureCoord = (uSurfaceTransformMatrix * uVideoTransformMatrix * aTextureCoord).xy;\n}\n");
                        if (A003 != 0 && (A002 = A00(35632, "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\n\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) != 0) {
                            this.A02 = GLES20.glCreateProgram();
                            A02("glCreateProgram");
                            if (this.A02 == 0) {
                                Log.e("GLSurfacePipe", "Could not create program");
                            }
                            GLES20.glAttachShader(this.A02, A003);
                            A02("glAttachShader");
                            GLES20.glAttachShader(this.A02, A002);
                            A02("glAttachShader");
                            GLES20.glLinkProgram(this.A02);
                            int[] iArr2 = new int[1];
                            GLES20.glGetProgramiv(this.A02, 35714, iArr2, 0);
                            if (iArr2[0] != 1) {
                                Log.e("GLSurfacePipe", "Could not link program: ");
                                Log.e("GLSurfacePipe", GLES20.glGetProgramInfoLog(this.A02));
                                GLES20.glDeleteProgram(this.A02);
                                this.A02 = 0;
                                return;
                            }
                            int glGetAttribLocation = GLES20.glGetAttribLocation(this.A02, "aPosition");
                            this.A04 = glGetAttribLocation;
                            A01(glGetAttribLocation, "aPosition");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A02, "aTextureCoord");
                            this.A05 = glGetAttribLocation2;
                            A01(glGetAttribLocation2, "aTextureCoord");
                            int glGetUniformLocation = GLES20.glGetUniformLocation(this.A02, "uSurfaceTransformMatrix");
                            this.A07 = glGetUniformLocation;
                            A01(glGetUniformLocation, "uSurfaceTransformMatrix");
                            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A02, "uVideoTransformMatrix");
                            this.A08 = glGetUniformLocation2;
                            A01(glGetUniformLocation2, "uVideoTransformMatrix");
                            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A02, "uSceneTransformMatrix");
                            this.A06 = glGetUniformLocation3;
                            A01(glGetUniformLocation3, "uSceneTransformMatrix");
                            return;
                        }
                        return;
                    }
                }
            } else {
                this.A0E = EGL14.EGL_NO_DISPLAY;
                str = "unable to initialize EGL14";
            }
        } else {
            str = "unable to get EGL14 display";
        }
        throw AnonymousClass000.A0a(str);
    }

    public static int A00(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        A02(C13680ns.A0c(i2, "glCreateShader type="));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Could not compile shader ");
        A0r.append(i2);
        Log.e("GLSurfacePipe", AnonymousClass000.A0h(":", A0r));
        Log.e("GLSurfacePipe", AnonymousClass000.A0h(GLES20.glGetShaderInfoLog(glCreateShader), AnonymousClass000.A0r(" ")));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A01(int i2, String str) {
        if (i2 < 0) {
            StringBuilder A0r = AnonymousClass000.A0r("Unable to locate '");
            A0r.append(str);
            throw AnonymousClass000.A0a(AnonymousClass000.A0h("' in program", A0r));
        }
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(": glError 0x");
            String A0h = AnonymousClass000.A0h(Integer.toHexString(glGetError), A0q);
            Log.e("GLSurfacePipe", A0h);
            throw AnonymousClass000.A0a(A0h);
        }
    }

    public SurfaceTexture A03(int i2, int i3) {
        SurfaceTexture surfaceTexture = this.A0A;
        if (surfaceTexture != null && this.A01 == i2 && this.A00 == i3) {
            return surfaceTexture;
        }
        this.A01 = i2;
        this.A00 = i3;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            this.A0A.release();
            this.A0A = null;
        }
        int i4 = this.A03;
        if (i4 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i4}, 0);
            this.A03 = -1;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        A02("glGenTextures");
        int i5 = iArr[0];
        this.A03 = i5;
        GLES20.glBindTexture(36197, i5);
        A02(AnonymousClass000.A0l(AnonymousClass000.A0r("glBindTexture "), this.A03));
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        A02("glTexParameter");
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.A03);
        this.A0A = surfaceTexture2;
        surfaceTexture2.setOnFrameAvailableListener(this);
        return this.A0A;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r9 = this;
            android.opengl.EGLDisplay r1 = r9.A0E
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r5 = -1
            r4 = 0
            r3 = 0
            if (r1 == r0) goto L_0x00b3
            java.lang.Object r7 = r9.A0H
            monitor-enter(r7)
            android.opengl.EGLSurface r1 = r9.A0Q     // Catch:{ all -> 0x007b }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007b }
            r6 = 1
            if (r1 == r0) goto L_0x005f
            android.opengl.EGLDisplay r8 = r9.A0E     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLSurface r2 = r9.A0Q     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLSurface r1 = r9.A0Q     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLContext r0 = r9.A0D     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGL14.eglMakeCurrent(r8, r2, r1, r0)     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLDisplay r2 = r9.A0E     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLSurface r1 = r9.A0Q     // Catch:{ RuntimeException -> 0x004b }
            r0 = 12375(0x3057, float:1.7341E-41)
            int[] r8 = r9.A0N     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGL14.eglQuerySurface(r2, r1, r0, r8, r3)     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLDisplay r2 = r9.A0E     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLSurface r1 = r9.A0Q     // Catch:{ RuntimeException -> 0x004b }
            r0 = 12374(0x3056, float:1.734E-41)
            android.opengl.EGL14.eglQuerySurface(r2, r1, r0, r8, r6)     // Catch:{ RuntimeException -> 0x004b }
            r1 = r8[r3]     // Catch:{ RuntimeException -> 0x004b }
            r0 = r8[r6]     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.GLES20.glViewport(r3, r3, r1, r0)     // Catch:{ RuntimeException -> 0x004b }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)     // Catch:{ RuntimeException -> 0x004b }
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLDisplay r1 = r9.A0E     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGLSurface r0 = r9.A0Q     // Catch:{ RuntimeException -> 0x004b }
            android.opengl.EGL14.eglSwapBuffers(r1, r0)     // Catch:{ RuntimeException -> 0x004b }
        L_0x004b:
            android.opengl.EGLDisplay r2 = r9.A0E     // Catch:{ all -> 0x007b }
            android.opengl.EGLSurface r1 = r9.A0F     // Catch:{ all -> 0x007b }
            android.opengl.EGLContext r0 = r9.A0D     // Catch:{ all -> 0x007b }
            android.opengl.EGL14.eglMakeCurrent(r2, r1, r1, r0)     // Catch:{ all -> 0x007b }
            android.opengl.EGLDisplay r1 = r9.A0E     // Catch:{ all -> 0x007b }
            android.opengl.EGLSurface r0 = r9.A0Q     // Catch:{ all -> 0x007b }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ all -> 0x007b }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x007b }
            r9.A0Q = r0     // Catch:{ all -> 0x007b }
        L_0x005f:
            r9.A0B = r4     // Catch:{ all -> 0x007b }
            monitor-exit(r7)     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r9.A0I
            monitor-enter(r2)
            android.opengl.EGLSurface r1 = r9.A0R     // Catch:{ all -> 0x0078 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0078 }
            if (r1 == r0) goto L_0x0076
            android.opengl.EGLDisplay r1 = r9.A0E     // Catch:{ all -> 0x0078 }
            android.opengl.EGLSurface r0 = r9.A0R     // Catch:{ all -> 0x0078 }
            android.opengl.EGL14.eglDestroySurface(r1, r0)     // Catch:{ all -> 0x0078 }
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x0078 }
            r9.A0R = r0     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x007b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x007b }
            throw r0
        L_0x007e:
            android.opengl.EGLSurface r1 = r9.A0F
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r1 == r0) goto L_0x0089
            android.opengl.EGLDisplay r0 = r9.A0E
            android.opengl.EGL14.eglDestroySurface(r0, r1)
        L_0x0089:
            int r1 = r9.A03
            if (r1 == r5) goto L_0x0094
            int[] r0 = new int[r6]
            r0[r3] = r1
            android.opengl.GLES20.glDeleteTextures(r6, r0, r3)
        L_0x0094:
            int r0 = r9.A02
            if (r0 == 0) goto L_0x009b
            android.opengl.GLES20.glDeleteProgram(r0)
        L_0x009b:
            android.opengl.EGLDisplay r2 = r9.A0E
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r2, r1, r1, r0)
            android.opengl.EGLDisplay r1 = r9.A0E
            android.opengl.EGLContext r0 = r9.A0D
            android.opengl.EGL14.eglDestroyContext(r1, r0)
            android.opengl.EGL14.eglReleaseThread()
            android.opengl.EGLDisplay r0 = r9.A0E
            android.opengl.EGL14.eglTerminate(r0)
        L_0x00b3:
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r9.A0E = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r9.A0D = r0
            r9.A0C = r4
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r9.A0F = r0
            r9.A02 = r3
            r9.A03 = r5
            android.graphics.SurfaceTexture r0 = r9.A0A
            if (r0 == 0) goto L_0x00ce
            r0.release()
            r9.A0A = r4
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5yF.A04():void");
    }

    public void A05(SurfaceTexture surfaceTexture, int i2) {
        if (this.A0E != EGL14.EGL_NO_DISPLAY) {
            synchronized (this.A0H) {
                this.A0O = i2;
                if (this.A0B == surfaceTexture) {
                    float[] fArr = this.A0J;
                    Matrix.setIdentityM(fArr, 0);
                    Matrix.rotateM(fArr, 0, (float) i2, 0.0f, 0.0f, 1.0f);
                } else {
                    if (this.A0Q != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(this.A0E, this.A0Q);
                        Matrix.setIdentityM(this.A0J, 0);
                        this.A0Q = EGL14.EGL_NO_SURFACE;
                    }
                    this.A0B = surfaceTexture;
                    if (surfaceTexture != null) {
                        float[] fArr2 = this.A0J;
                        Matrix.setIdentityM(fArr2, 0);
                        Matrix.rotateM(fArr2, 0, (float) i2, 0.0f, 0.0f, 1.0f);
                        this.A0Q = EGL14.eglCreateWindowSurface(this.A0E, this.A0C, surfaceTexture, new int[]{12344}, 0);
                        if (this.A0Q == null || EGL14.eglGetError() != 12288) {
                            this.A0Q = EGL14.EGL_NO_SURFACE;
                        }
                    }
                }
            }
        }
    }

    public void A06(EGLSurface eGLSurface, float[] fArr, int i2, long j2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            try {
                EGL14.eglMakeCurrent(this.A0E, eGLSurface, eGLSurface, this.A0D);
                EGLDisplay eGLDisplay = this.A0E;
                int[] iArr = this.A0N;
                EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
                EGL14.eglQuerySurface(this.A0E, eGLSurface, 12374, iArr, 1);
                GLES20.glViewport(0, 0, iArr[0], iArr[1]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
                if (i2 % 180 == 0) {
                    i3 = this.A00;
                    i4 = this.A01;
                } else {
                    i3 = this.A01;
                    i4 = this.A00;
                }
                float f2 = ((float) i3) / ((float) i4);
                int i7 = iArr[0];
                float f3 = (float) i7;
                int i8 = iArr[1];
                float f4 = (float) i8;
                if (f3 / f4 > f2) {
                    i5 = (int) (f4 * f2);
                    i6 = i8;
                } else {
                    i6 = (int) (f3 / f2);
                    i5 = i7;
                }
                int i9 = (i7 - i5) / 2;
                int i10 = (i8 - i6) / 2;
                if (i9 < 8 && i10 < 8) {
                    i5 = i7;
                    i6 = i8;
                    i9 = 0;
                    i10 = 0;
                }
                GLES20.glViewport(i9, i10, i5, i6);
                A02("draw start");
                GLES20.glUseProgram(this.A02);
                A02("glUseProgram");
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, this.A03);
                GLES20.glUniformMatrix4fv(this.A07, 1, false, this.A0L, 0);
                A02("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(this.A08, 1, false, this.A0M, 0);
                A02("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(this.A06, 1, false, fArr, 0);
                A02("glUniformMatrix4fv");
                int i11 = this.A04;
                GLES20.glEnableVertexAttribArray(i11);
                A02("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, A0T);
                A02("glVertexAttribPointer");
                int i12 = this.A05;
                GLES20.glEnableVertexAttribArray(i12);
                A02("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(i12, 2, 5126, false, 8, A0S);
                A02("glVertexAttribPointer");
                GLES20.glDrawArrays(5, 0, 4);
                A02("glDrawArrays");
                GLES20.glDisableVertexAttribArray(i11);
                GLES20.glDisableVertexAttribArray(i12);
                GLES20.glBindTexture(36197, 0);
                GLES20.glUseProgram(0);
                EGLExt.eglPresentationTimeANDROID(this.A0E, eGLSurface, j2);
                EGL14.eglSwapBuffers(this.A0E, eGLSurface);
            } catch (RuntimeException unused) {
            }
            EGLDisplay eGLDisplay2 = this.A0E;
            EGLSurface eGLSurface2 = this.A0F;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.A0D);
        }
    }

    public void A07(Surface surface, int i2) {
        if (this.A0E != EGL14.EGL_NO_DISPLAY) {
            synchronized (this.A0I) {
                this.A0P = i2;
                if (this.A0R != EGL14.EGL_NO_SURFACE) {
                    Matrix.setIdentityM(this.A0K, 0);
                    EGL14.eglDestroySurface(this.A0E, this.A0R);
                    this.A0R = EGL14.EGL_NO_SURFACE;
                }
                if (surface != null) {
                    float[] fArr = this.A0K;
                    Matrix.setIdentityM(fArr, 0);
                    Matrix.rotateM(fArr, 0, (float) i2, 0.0f, 0.0f, 1.0f);
                    this.A0R = EGL14.eglCreateWindowSurface(this.A0E, this.A0C, surface, new int[]{12344}, 0);
                    if (this.A0R == null || EGL14.eglGetError() != 12288) {
                        this.A0R = EGL14.EGL_NO_SURFACE;
                    }
                }
            }
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.A0A;
        if (surfaceTexture2 != null) {
            try {
                surfaceTexture2.updateTexImage();
                this.A0A.getTransformMatrix(this.A0L);
            } catch (RuntimeException unused) {
            }
            long timestamp = this.A0A.getTimestamp();
            if (!this.A0G) {
                long j2 = Long.MAX_VALUE;
                for (int i2 = 0; i2 < 3; i2++) {
                    long nanoTime = System.nanoTime();
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long nanoTime2 = System.nanoTime();
                    long j3 = nanoTime2 - nanoTime;
                    if (i2 == 0 || j3 < j2) {
                        this.A09 = elapsedRealtimeNanos - ((nanoTime + nanoTime2) >> 1);
                        j2 = j3;
                    }
                }
                this.A0G = true;
            }
            if (Math.abs(((float) (SystemClock.elapsedRealtimeNanos() - timestamp)) / 1.0E9f) < 5.0f) {
                timestamp -= this.A09;
            }
            synchronized (this.A0H) {
                A06(this.A0Q, this.A0J, this.A0O, timestamp);
            }
            synchronized (this.A0I) {
                A06(this.A0R, this.A0K, this.A0P, timestamp);
            }
        }
    }
}
