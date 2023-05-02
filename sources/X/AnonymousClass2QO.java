package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.2QO  reason: invalid class name */
public class AnonymousClass2QO {
    public float A00;
    public int A01;
    public int A02 = 0;
    public Matrix A03;
    public Rect A04;
    public RectF A05;
    public RectF A06;
    public View A07;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A = false;
    public final Paint A0B = new Paint();
    public final Paint A0C = new Paint();
    public final Paint A0D = new Paint();

    public AnonymousClass2QO(View view) {
        this.A07 = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r11 >= (((float) r3.bottom) + r4)) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r6 == false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(float r10, float r11) {
        /*
            r9 = this;
            android.graphics.Rect r3 = r9.A02()
            android.view.View r0 = r9.A07
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r4 = r0.density
            r0 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r0
            boolean r0 = r9.A08
            r8 = 32
            r1 = 1
            if (r0 == 0) goto L_0x0065
            int r0 = r3.centerX()
            float r0 = (float) r0
            float r10 = r10 - r0
            int r0 = r3.centerY()
            float r0 = (float) r0
            float r11 = r11 - r0
            float r1 = r10 * r10
            float r0 = r11 * r11
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            int r2 = (int) r0
            android.graphics.Rect r0 = r9.A04
            int r1 = r0.width()
            r0 = 2
            int r1 = r1 / r0
            int r0 = r2 - r1
            int r0 = java.lang.Math.abs(r0)
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0061
            float r2 = java.lang.Math.abs(r11)
            float r0 = java.lang.Math.abs(r10)
            r1 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r8 = 16
            if (r0 >= 0) goto L_0x0059
            r8 = 8
        L_0x0059:
            return r8
        L_0x005a:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r8 = 4
            if (r0 >= 0) goto L_0x0059
            r8 = 2
            return r8
        L_0x0061:
            if (r2 < r1) goto L_0x0059
            r8 = 1
            return r8
        L_0x0065:
            int r0 = r3.top
            float r5 = (float) r0
            float r0 = r5 - r4
            r7 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            int r0 = r3.bottom
            float r0 = (float) r0
            float r0 = r0 + r4
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r6 = 1
            if (r0 < 0) goto L_0x0079
        L_0x0078:
            r6 = 0
        L_0x0079:
            int r0 = r3.left
            float r2 = (float) r0
            float r0 = r2 - r4
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x008b
            int r0 = r3.right
            float r0 = (float) r0
            float r0 = r0 + r4
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x008b
            r7 = 1
        L_0x008b:
            float r2 = r2 - r10
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0097
            r2 = 3
            if (r6 != 0) goto L_0x0098
        L_0x0097:
            r2 = 1
        L_0x0098:
            int r0 = r3.right
            float r0 = (float) r0
            float r0 = r0 - r10
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a8
            if (r6 == 0) goto L_0x00a8
            r2 = r2 | 4
        L_0x00a8:
            float r5 = r5 - r11
            float r0 = java.lang.Math.abs(r5)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b5
            if (r7 == 0) goto L_0x00b5
            r2 = r2 | 8
        L_0x00b5:
            int r0 = r3.bottom
            float r0 = (float) r0
            float r0 = r0 - r11
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c5
            if (r7 == 0) goto L_0x00c5
            r2 = r2 | 16
        L_0x00c5:
            if (r2 != r1) goto L_0x00d0
            int r1 = (int) r10
            int r0 = (int) r11
            boolean r0 = r3.contains(r1, r0)
            if (r0 == 0) goto L_0x00d0
            return r8
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2QO.A00(float, float):int");
    }

    public Rect A01() {
        RectF rectF = this.A05;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final Rect A02() {
        RectF rectF = this.A05;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.A03.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }
}
