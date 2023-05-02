package X;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: X.0PB  reason: invalid class name */
public class AnonymousClass0PB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public float[] A08 = new float[9];
    public float[] A09;

    public AnonymousClass0PB(AnonymousClass0JP r7) {
        int A002 = AnonymousClass0X0.A00();
        this.A00 = A002;
        if (A002 != 0) {
            StringBuilder A0r = AnonymousClass000.A0r("Created program ");
            A0r.append(A002);
            A0r.append(" (");
            A0r.append(r7);
            Log.d("Grafika", AnonymousClass000.A0h(")", A0r));
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.A00, "aPosition");
            this.A01 = glGetAttribLocation;
            AnonymousClass0X0.A03(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A00, "aTextureCoord");
            this.A02 = glGetAttribLocation2;
            AnonymousClass0X0.A03(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.A00, "uMVPMatrix");
            this.A05 = glGetUniformLocation;
            AnonymousClass0X0.A03(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A00, "uTexMatrix");
            this.A06 = glGetUniformLocation2;
            AnonymousClass0X0.A03(glGetUniformLocation2, "uTexMatrix");
            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A00, "uKernel");
            this.A04 = glGetUniformLocation3;
            if (glGetUniformLocation3 < 0) {
                this.A04 = -1;
                this.A07 = -1;
                this.A03 = -1;
                return;
            }
            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.A00, "uTexOffset");
            this.A07 = glGetUniformLocation4;
            AnonymousClass0X0.A03(glGetUniformLocation4, "uTexOffset");
            int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.A00, "uColorAdjust");
            this.A03 = glGetUniformLocation5;
            AnonymousClass0X0.A03(glGetUniformLocation5, "uColorAdjust");
            System.arraycopy(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0, this.A08, 0, 9);
            float f2 = 1.0f / ((float) 256);
            float f3 = -f2;
            this.A09 = new float[]{f3, f3, 0.0f, f3, f2, f3, f3, 0.0f, 0.0f, 0.0f, f2, 0.0f, f3, f2, 0.0f, f2, f2, f2};
            return;
        }
        throw AnonymousClass000.A0a("Unable to create program");
    }
}
