package X;

import android.opengl.GLES20;
import com.whatsapp.util.Log;
import java.nio.FloatBuffer;

/* renamed from: X.4bD  reason: invalid class name and case insensitive filesystem */
public class C88864bD {
    public int A00;

    public C88864bD() {
        String str;
        int A002 = A00(35633, "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n");
        int A003 = A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        this.A00 = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, A002);
            GLES20.glAttachShader(this.A00, A003);
            GLES20.glLinkProgram(this.A00);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.A00, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(A002);
                GLES20.glDeleteShader(A003);
                AnonymousClass4YC.A01("Creating GlShader");
                return;
            }
            Log.e(AnonymousClass000.A0h(GLES20.glGetProgramInfoLog(this.A00), AnonymousClass000.A0r("GlShader Could not link program: ")));
            str = GLES20.glGetProgramInfoLog(this.A00);
        } else {
            str = AnonymousClass000.A0l(AnonymousClass000.A0r("glCreateProgram() failed. GLES20 error: "), GLES20.glGetError());
        }
        throw AnonymousClass000.A0a(str);
    }

    public static int A00(int i2, String str) {
        String str2;
        int glCreateShader = GLES20.glCreateShader(i2);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                AnonymousClass4YC.A01("compileShader");
                return glCreateShader;
            }
            StringBuilder A0r = AnonymousClass000.A0r("GlShader Could not compile shader ");
            A0r.append(i2);
            A0r.append(":");
            Log.e(AnonymousClass000.A0h(GLES20.glGetShaderInfoLog(glCreateShader), A0r));
            str2 = GLES20.glGetShaderInfoLog(glCreateShader);
        } else {
            str2 = AnonymousClass000.A0l(AnonymousClass000.A0r("glCreateShader() failed. GLES20 error: "), GLES20.glGetError());
        }
        throw AnonymousClass000.A0a(str2);
    }

    public int A01(String str) {
        String str2;
        int i2 = this.A00;
        if (i2 != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i2, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            StringBuilder A0r = AnonymousClass000.A0r("Could not locate uniform '");
            A0r.append(str);
            str2 = AnonymousClass000.A0h("' in program", A0r);
        } else {
            str2 = "The program has been released";
        }
        throw AnonymousClass000.A0a(str2);
    }

    public void A02(String str, FloatBuffer floatBuffer) {
        String str2;
        int i2 = this.A00;
        if (i2 == -1 || i2 == -1) {
            str2 = "The program has been released";
        } else {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i2, str);
            if (glGetAttribLocation >= 0) {
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, floatBuffer);
                AnonymousClass4YC.A01("setVertexAttribArray");
                return;
            }
            StringBuilder A0r = AnonymousClass000.A0r("Could not locate '");
            A0r.append(str);
            str2 = AnonymousClass000.A0h("' in program", A0r);
        }
        throw AnonymousClass000.A0a(str2);
    }
}
