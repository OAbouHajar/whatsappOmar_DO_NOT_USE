package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* renamed from: X.4V1  reason: invalid class name */
public final class AnonymousClass4V1 {
    public int A00;
    public final SurfaceTexture A01;
    public final ByteBuffer A02 = AnonymousClass3K3.A0s(64);
    public final float[] A03 = new float[16];
    public volatile int A04;
    public volatile int A05;

    public AnonymousClass4V1() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameterf(36197, 10242, 33071.0f);
        GLES20.glTexParameterf(36197, 10243, 33071.0f);
        AnonymousClass4YC.A01("generateTexture");
        this.A00 = i2;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i2);
        this.A01 = surfaceTexture;
        this.A05 = 0;
        Log.i(AnonymousClass000.A0g("voip/video/SurfaceTextureHolder/createSurfaceTexture, surfaceTexture = ", surfaceTexture));
    }

    public void A00() {
        StringBuilder A0r = AnonymousClass000.A0r("voip/video/SurfaceTextureHolder/deleteSurfaceTexture surfaceTexture = ");
        SurfaceTexture surfaceTexture = this.A01;
        A0r.append(surfaceTexture);
        C13680ns.A1V(A0r);
        surfaceTexture.release();
        int i2 = this.A00;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        }
        this.A00 = 0;
    }

    public boolean A01(GlVideoRenderer glVideoRenderer, int i2, int i3) {
        if (this.A00 == 0) {
            Log.i("voip/video/SurfaceTextureHolder/render ignore rendering after texture is released");
            return false;
        }
        SurfaceTexture surfaceTexture = this.A01;
        surfaceTexture.updateTexImage();
        float[] fArr = this.A03;
        surfaceTexture.getTransformMatrix(fArr);
        int i4 = this.A05 % 4;
        if (i4 != 0) {
            Matrix.rotateM(fArr, 0, (float) (i4 * 90), 0.0f, 0.0f, 1.0f);
        }
        if (i4 == 1) {
            Matrix.translateM(fArr, 0, 0.0f, -1.0f, 0.0f);
        } else if (i4 == 2) {
            Matrix.translateM(fArr, 0, -1.0f, -1.0f, 0.0f);
        } else if (i4 == 3) {
            Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
        }
        FloatBuffer asFloatBuffer = this.A02.asFloatBuffer();
        asFloatBuffer.rewind();
        asFloatBuffer.put(fArr);
        glVideoRenderer.renderOesTexture(this.A00, i2, i3, asFloatBuffer);
        return true;
    }
}
