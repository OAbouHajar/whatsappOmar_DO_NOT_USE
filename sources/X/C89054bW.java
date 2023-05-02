package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* renamed from: X.4bW  reason: invalid class name and case insensitive filesystem */
public class C89054bW {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -12345;
    public int A04;
    public int A05;
    public FloatBuffer A06;
    public float[] A07 = new float[16];
    public float[] A08 = new float[16];
    public final float[] A09;

    public C89054bW() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.A09 = fArr;
        FloatBuffer asFloatBuffer = AnonymousClass3K3.A0s(80).asFloatBuffer();
        this.A06 = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        Matrix.setIdentityM(this.A08, 0);
    }

    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw AnonymousClass000.A0a(C13680ns.A0i(": glError ", AnonymousClass000.A0q(str), glGetError));
        }
    }

    public void A01(SurfaceTexture surfaceTexture) {
        A00("onDrawFrame start");
        float[] fArr = this.A08;
        surfaceTexture.getTransformMatrix(fArr);
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.A02);
        A00("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.A03);
        FloatBuffer floatBuffer = this.A06;
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.A00, 3, 5126, false, 20, floatBuffer);
        A00("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.A00);
        A00("glEnableVertexAttribArray aPositionHandle");
        floatBuffer.position(3);
        GLES20.glVertexAttribPointer(this.A01, 2, 5126, false, 20, floatBuffer);
        A00("glVertexAttribPointer aTextureHandle");
        GLES20.glEnableVertexAttribArray(this.A01);
        A00("glEnableVertexAttribArray aTextureHandle");
        float[] fArr2 = this.A07;
        Matrix.setIdentityM(fArr2, 0);
        GLES20.glUniformMatrix4fv(this.A04, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.A05, 1, false, fArr, 0);
        GLES20.glDrawArrays(5, 0, 4);
        A00("glDrawArrays");
        GLES20.glFinish();
    }
}
