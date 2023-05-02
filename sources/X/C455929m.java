package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.29m  reason: invalid class name and case insensitive filesystem */
public class C455929m {
    public int A00 = 1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Bitmap A06;
    public Bitmap A07;
    public Bitmap A08;
    public C455829l A09;
    public boolean A0A;
    public boolean A0B;
    public final Paint A0C = new Paint(1);
    public final PointF A0D = new PointF();
    public final C16440t3 A0E;
    public final AnonymousClass4ET A0F;
    public final AnonymousClass39P A0G;
    public final C455729k A0H;

    public C455929m(C16440t3 r3, AnonymousClass4ET r4, AnonymousClass39P r5, C455729k r6) {
        this.A0E = r3;
        this.A0G = r5;
        this.A0H = r6;
        this.A0F = r4;
    }

    public static Bitmap A00(Bitmap bitmap, int i2, int i3) {
        if (bitmap != null && bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (i2 <= 0 || i3 <= 0) {
            return null;
        }
        try {
            return Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e2) {
            Log.i("oom trying to create bitmap cache", e2);
            return null;
        } catch (NullPointerException e3) {
            Log.i("NPE trying to create bitmap cache", e3);
            return null;
        }
    }

    public void A01() {
        this.A0B = false;
        this.A0F.A00.invalidate();
    }

    public void A02() {
        Bitmap bitmap = this.A06;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        Bitmap bitmap2 = this.A05;
        if (bitmap2 != null) {
            bitmap2.eraseColor(0);
        }
        List<AnonymousClass32x> A012 = this.A0H.A01();
        if (!A012.isEmpty()) {
            A03(true);
            A04(true);
            for (AnonymousClass32x r4 : A012) {
                C61773Ag r3 = r4.A03;
                Bitmap bitmap3 = r3 instanceof C76923uu ? this.A06 : this.A05;
                PointF pointF = this.A0D;
                int i2 = this.A00;
                r4.A01 = bitmap3;
                r4.A02 = pointF;
                r4.A00 = i2;
                r4.A05 = false;
                if (bitmap3 != null) {
                    r3.A01(bitmap3, pointF, i2);
                    C61773Ag r1 = r4.A03;
                    Canvas canvas = r1.A00;
                    if (canvas != null) {
                        r1.A02(canvas);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r6 == r3) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(boolean r9) {
        /*
            r8 = this;
            X.39P r0 = r8.A0G
            android.graphics.RectF r5 = r0.A07
            android.util.DisplayMetrics r1 = r0.A08
            r7 = 0
            if (r5 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            android.graphics.Bitmap r0 = r8.A05
            if (r0 != 0) goto L_0x0012
            if (r9 != 0) goto L_0x0012
        L_0x0011:
            return r7
        L_0x0012:
            int r0 = r1.widthPixels
            float r2 = (float) r0
            float r0 = r5.width()
            float r2 = r2 / r0
            int r0 = r1.heightPixels
            float r1 = (float) r0
            float r0 = r5.height()
            float r1 = r1 / r0
            float r0 = java.lang.Math.min(r2, r1)
            int r0 = (int) r0
            r4 = 1
            int r6 = java.lang.Math.max(r4, r0)
            android.graphics.Bitmap r0 = r8.A05
            if (r0 == 0) goto L_0x0064
            int r2 = r0.getHeight()
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0064
            android.graphics.Bitmap r0 = r8.A05
            int r2 = r0.getWidth()
            float r1 = r5.width()
            int r3 = r8.A00
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0064
            android.graphics.PointF r2 = r8.A0D
            float r1 = r2.x
            float r0 = r5.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            float r1 = r2.y
            float r0 = r5.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            if (r6 == r3) goto L_0x0011
        L_0x0064:
            r8.A00 = r6
            android.graphics.Bitmap r3 = r8.A05
            float r1 = r5.width()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            android.graphics.Bitmap r0 = A00(r3, r2, r0)
            r8.A05 = r0
            android.graphics.PointF r2 = r8.A0D
            float r1 = r5.left
            float r0 = r5.top
            r2.set(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455929m.A03(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r6 == r3) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(boolean r9) {
        /*
            r8 = this;
            X.39P r0 = r8.A0G
            android.graphics.RectF r5 = r0.A07
            android.util.DisplayMetrics r1 = r0.A08
            r7 = 0
            if (r5 == 0) goto L_0x0011
            if (r1 == 0) goto L_0x0011
            android.graphics.Bitmap r0 = r8.A06
            if (r0 != 0) goto L_0x0012
            if (r9 != 0) goto L_0x0012
        L_0x0011:
            return r7
        L_0x0012:
            int r0 = r1.widthPixels
            float r2 = (float) r0
            float r0 = r5.width()
            float r2 = r2 / r0
            int r0 = r1.heightPixels
            float r1 = (float) r0
            float r0 = r5.height()
            float r1 = r1 / r0
            float r0 = java.lang.Math.min(r2, r1)
            int r0 = (int) r0
            r4 = 1
            int r6 = java.lang.Math.max(r4, r0)
            android.graphics.Bitmap r0 = r8.A06
            if (r0 == 0) goto L_0x0064
            int r2 = r0.getHeight()
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0064
            android.graphics.Bitmap r0 = r8.A06
            int r2 = r0.getWidth()
            float r1 = r5.width()
            int r3 = r8.A00
            float r0 = (float) r3
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r2 != r0) goto L_0x0064
            android.graphics.PointF r2 = r8.A0D
            float r1 = r2.x
            float r0 = r5.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            float r1 = r2.y
            float r0 = r5.top
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            if (r6 == r3) goto L_0x0011
        L_0x0064:
            r8.A00 = r6
            android.graphics.Bitmap r3 = r8.A06
            float r1 = r5.width()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r5.height()
            int r0 = r8.A00
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            android.graphics.Bitmap r0 = A00(r3, r2, r0)
            r8.A06 = r0
            android.graphics.PointF r2 = r8.A0D
            float r1 = r5.left
            float r0 = r5.top
            r2.set(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455929m.A04(boolean):boolean");
    }
}
