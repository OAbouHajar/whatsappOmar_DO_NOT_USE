package X;

import android.graphics.Paint;

/* renamed from: X.3Ky  reason: invalid class name */
public class AnonymousClass3Ky extends Paint {
    public final float A00;
    public final float A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r2 >= 27) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3Ky(int r4, android.graphics.Paint r5) {
        /*
            r3 = this;
            r3.<init>(r5)
            float r0 = X.C90384e3.A00(r5)
            r3.A00 = r0
            float r0 = X.C90384e3.A01(r5)
            r3.A01 = r0
            r3.setColor(r4)
            r3.setStrokeWidth(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r2 <= r0) goto L_0x0020
            r1 = 27
            r0 = 0
            if (r2 < r1) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            r3.setAntiAlias(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Ky.<init>(int, android.graphics.Paint):void");
    }

    public float getUnderlinePosition() {
        return this.A00;
    }

    public float getUnderlineThickness() {
        return this.A01;
    }
}
