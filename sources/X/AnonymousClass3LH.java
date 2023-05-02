package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: X.3LH  reason: invalid class name */
public class AnonymousClass3LH extends LayerDrawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public int A02 = 2;
    public long A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3LH(android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3) {
        /*
            r1 = this;
            r0 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            X.AnonymousClass000.A1E(r2, r3, r0)
            r1.<init>(r0)
            r0 = 2
            r1.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LH.<init>(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            int r0 = r9.A02
            r8 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r6) goto L_0x0034
            long r4 = r9.A03
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r4
            float r1 = (float) r2
            int r0 = r9.A00
            float r0 = (float) r0
            float r1 = r1 / r0
            float r3 = java.lang.Math.min(r1, r8)
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r6)
            r0.draw(r10)
            return
        L_0x002c:
            long r0 = android.os.SystemClock.uptimeMillis()
            r9.A03 = r0
            r9.A02 = r6
        L_0x0034:
            r3 = 0
        L_0x0035:
            int r2 = r9.A01
            if (r2 != 0) goto L_0x0041
            android.graphics.Rect r0 = r9.getBounds()
            int r2 = r0.height()
        L_0x0041:
            int r1 = r10.getSaveCount()
            r10.save()
            float r0 = (float) r2
            float r0 = r0 * r3
            r10.translate(r7, r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            r0.draw(r10)
            int r0 = -r2
            float r0 = (float) r0
            r10.translate(r7, r0)
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r6)
            r0.draw(r10)
            r10.restoreToCount(r1)
            r9.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LH.draw(android.graphics.Canvas):void");
    }
}
