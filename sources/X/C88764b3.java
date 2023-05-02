package X;

import android.graphics.PointF;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.4b3  reason: invalid class name and case insensitive filesystem */
public class C88764b3 {
    public static final PointF A07 = new C63653Kz();
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 1.0f;
    public C89004bR A04;
    public C89004bR A05;
    public final NavigableMap A06 = new TreeMap();

    public void A00(PointF pointF, PointF pointF2) {
        C89004bR r8 = this.A05;
        if (r8 == null) {
            PointF pointF3 = A07;
            float f2 = pointF3.x;
            float[] fArr = {f2, f2, pointF2.x, pointF.x};
            float f3 = pointF3.y;
            this.A05 = new C89004bR(fArr, new float[]{f3, f3, pointF2.y, pointF.y});
            return;
        }
        float[] fArr2 = r8.A01;
        float[] fArr3 = {fArr2[3], fArr2[2], pointF2.x, pointF.x};
        float[] fArr4 = r8.A02;
        C89004bR r2 = new C89004bR(fArr3, new float[]{fArr4[3], fArr4[2], pointF2.y, pointF.y});
        this.A05 = r2;
        this.A06.put(Float.valueOf(this.A02), r2);
        this.A02 += this.A05.A00();
    }
}
