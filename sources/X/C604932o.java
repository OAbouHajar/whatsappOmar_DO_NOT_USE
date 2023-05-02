package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.32o  reason: invalid class name and case insensitive filesystem */
public class C604932o extends C615539j {
    public float A00 = 0.0f;
    public int A01 = -1;
    public PointF A02;
    public boolean A03 = false;

    public C604932o(RectF rectF, Handler handler, Vibrator vibrator, ViewGroup viewGroup) {
        super(rectF, handler, vibrator, viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 == 3) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(float r7) {
        /*
            r4 = 1
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r6 = 0
            if (r0 >= 0) goto L_0x0008
            r6 = 1
        L_0x0008:
            float r5 = java.lang.Math.abs(r7)
            r0 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 % r0
            r3 = 1110704128(0x42340000, float:45.0)
            float r0 = r5 / r3
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r2 = (int) r0
            float r5 = r5 % r3
            r0 = 1108869120(0x42180000, float:38.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0030
            int r2 = r2 + 1
        L_0x0022:
            r0 = 3
            if (r6 == 0) goto L_0x002e
            if (r2 != r4) goto L_0x002b
            r4 = 3
        L_0x0028:
            int r1 = r4 % 4
        L_0x002a:
            return r1
        L_0x002b:
            if (r2 != r0) goto L_0x002e
            goto L_0x0028
        L_0x002e:
            r4 = r2
            goto L_0x0028
        L_0x0030:
            r0 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = -1
            if (r0 > 0) goto L_0x002a
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C604932o.A00(float):int");
    }

    public void A04() {
        super.A04();
        View view = this.A06;
        if (view.getVisibility() == 0) {
            view.invalidate();
        }
    }
}
