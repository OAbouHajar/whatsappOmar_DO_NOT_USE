package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.0X0  reason: invalid class name */
public class AnonymousClass0X0 {
    public static final float[] A00;

    static {
        float[] fArr = new float[16];
        A00 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static int A00() {
        int A01;
        int A012 = A01(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        if (!(A012 == 0 || (A01 = A01(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0)) {
            int glCreateProgram = GLES20.glCreateProgram();
            A04("glCreateProgram");
            if (glCreateProgram == 0) {
                Log.e("Grafika", "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, A012);
            A04("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, A01);
            A04("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            Log.e("Grafika", "Could not link program: ");
            Log.e("Grafika", GLES20.glGetProgramInfoLog(glCreateProgram));
            GLES20.glDeleteProgram(glCreateProgram);
        }
        return 0;
    }

    public static int A01(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        A04(AnonymousClass000.A0l(AnonymousClass000.A0r("glCreateShader type="), i2));
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Could not compile shader ");
        A0r.append(i2);
        Log.e("Grafika", AnonymousClass000.A0h(":", A0r));
        Log.e("Grafika", AnonymousClass000.A0h(GLES20.glGetShaderInfoLog(glCreateShader), AnonymousClass000.A0r(" ")));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static FloatBuffer A02(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void A03(int i2, String str) {
        if (i2 < 0) {
            StringBuilder A0r = AnonymousClass000.A0r("Unable to locate '");
            A0r.append(str);
            throw AnonymousClass000.A0a(AnonymousClass000.A0h("' in program", A0r));
        }
    }

    public static void A04(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append(": glError 0x");
            String A0h = AnonymousClass000.A0h(Integer.toHexString(glGetError), A0q);
            Log.e("Grafika", A0h);
            throw AnonymousClass000.A0a(A0h);
        }
    }
}
