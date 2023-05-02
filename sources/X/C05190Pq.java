package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.0Pq  reason: invalid class name and case insensitive filesystem */
public class C05190Pq {
    public float A00;
    public float A01;
    public final Matrix A02 = AnonymousClass000.A0H();
    public final View A03;
    public final float[] A04;

    public C05190Pq(View view, float[] fArr) {
        this.A03 = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.A04 = fArr2;
        float f2 = fArr2[2];
        this.A00 = f2;
        float f3 = fArr2[5];
        this.A01 = f3;
        fArr2[2] = f2;
        fArr2[5] = f3;
        Matrix matrix = this.A02;
        matrix.setValues(fArr2);
        C06430Vt.A02.A01(matrix, this.A03);
    }
}
