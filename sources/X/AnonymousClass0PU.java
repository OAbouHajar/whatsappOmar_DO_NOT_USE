package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: X.0PU  reason: invalid class name */
public class AnonymousClass0PU {
    public AnonymousClass0PB A00;
    public final AnonymousClass0UZ A01 = new AnonymousClass0UZ(AnonymousClass0JO.FULL_RECTANGLE);

    public AnonymousClass0PU(AnonymousClass0PB r3) {
        this.A00 = r3;
    }

    public void A00(int i2, float[] fArr) {
        AnonymousClass0PB r3 = this.A00;
        float[] fArr2 = AnonymousClass0X0.A00;
        AnonymousClass0UZ r0 = this.A01;
        FloatBuffer floatBuffer = r0.A03;
        int i3 = r0.A00;
        FloatBuffer floatBuffer2 = r0.A02;
        AnonymousClass0X0.A04("draw start");
        GLES20.glUseProgram(r3.A00);
        AnonymousClass0X0.A04("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniformMatrix4fv(r3.A05, 1, false, fArr2, 0);
        AnonymousClass0X0.A04("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(r3.A06, 1, false, fArr, 0);
        AnonymousClass0X0.A04("glUniformMatrix4fv");
        int i4 = r3.A01;
        GLES20.glEnableVertexAttribArray(i4);
        AnonymousClass0X0.A04("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i4, 2, 5126, false, 8, floatBuffer);
        AnonymousClass0X0.A04("glVertexAttribPointer");
        int i5 = r3.A02;
        GLES20.glEnableVertexAttribArray(i5);
        AnonymousClass0X0.A04("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(i5, 2, 5126, false, 8, floatBuffer2);
        AnonymousClass0X0.A04("glVertexAttribPointer");
        int i6 = r3.A04;
        if (i6 >= 0) {
            GLES20.glUniform1fv(i6, 9, r3.A08, 0);
            GLES20.glUniform2fv(r3.A07, 9, r3.A09, 0);
            GLES20.glUniform1f(r3.A03, 0.0f);
        }
        GLES20.glDrawArrays(5, 0, i3);
        AnonymousClass0X0.A04("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i4);
        GLES20.glDisableVertexAttribArray(i5);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
    }
}
