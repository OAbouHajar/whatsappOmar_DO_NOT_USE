package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* renamed from: X.39d  reason: invalid class name and case insensitive filesystem */
public class C614939d {
    public final Paint A00;
    public final C61803Aj A01;
    public final AnonymousClass5NU A02;

    public C614939d(C61803Aj r4, AnonymousClass5NU r5) {
        this.A01 = r4;
        this.A02 = r5;
        Paint A05 = C13700nu.A05();
        this.A00 = A05;
        C13690nt.A0n(0, A05);
        A05.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0078 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0035 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(int r8, android.graphics.Bitmap r9) {
        /*
            r7 = this;
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r9)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            r0 = 0
            r4.drawColor(r0, r1)
            boolean r0 = r7.A02(r8)
            r6 = r8
            if (r0 != 0) goto L_0x0078
            int r6 = r8 + -1
        L_0x0014:
            if (r6 < 0) goto L_0x0071
            X.3Aj r0 = r7.A01
            X.4Na[] r3 = r0.A09
            r2 = r3[r6]
            X.41Q r1 = r2.A05
            X.41Q r0 = X.AnonymousClass41Q.DISPOSE_DO_NOT
            if (r1 == r0) goto L_0x0054
            X.41Q r0 = X.AnonymousClass41Q.DISPOSE_TO_BACKGROUND
            if (r1 != r0) goto L_0x004a
            boolean r0 = r7.A03(r2)
            if (r0 == 0) goto L_0x0054
            X.40t r0 = X.C796540t.NOT_REQUIRED
        L_0x002e:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0099;
                case 2: goto L_0x0035;
                case 3: goto L_0x0078;
                default: goto L_0x0035;
            }
        L_0x0035:
            int r6 = r6 + -1
            goto L_0x0014
        L_0x0038:
            r5 = r3[r6]
            X.5NU r0 = r7.A02
            X.0ev r3 = r0.AAJ(r6)
            if (r3 == 0) goto L_0x0043
            goto L_0x0057
        L_0x0043:
            boolean r0 = r7.A02(r6)
            if (r0 == 0) goto L_0x0035
            goto L_0x0078
        L_0x004a:
            X.41Q r0 = X.AnonymousClass41Q.DISPOSE_TO_PREVIOUS
            if (r1 != r0) goto L_0x0051
            X.40t r0 = X.C796540t.SKIP
            goto L_0x002e
        L_0x0051:
            X.40t r0 = X.C796540t.ABORT
            goto L_0x002e
        L_0x0054:
            X.40t r0 = X.C796540t.REQUIRED
            goto L_0x002e
        L_0x0057:
            java.lang.Object r2 = r3.A04()     // Catch:{ all -> 0x006c }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x006c }
            r1 = 0
            r0 = 0
            r4.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x006c }
            X.41Q r1 = r5.A05     // Catch:{ all -> 0x006c }
            X.41Q r0 = X.AnonymousClass41Q.DISPOSE_TO_BACKGROUND     // Catch:{ all -> 0x006c }
            if (r1 != r0) goto L_0x0073
            r7.A01(r4, r5)     // Catch:{ all -> 0x006c }
            goto L_0x0073
        L_0x006c:
            r0 = move-exception
            r3.close()
            throw r0
        L_0x0071:
            r6 = 0
            goto L_0x0078
        L_0x0073:
            int r6 = r6 + 1
            r3.close()
        L_0x0078:
            if (r6 >= r8) goto L_0x009c
            X.3Aj r5 = r7.A01
            X.4Na[] r0 = r5.A09
            r3 = r0[r6]
            X.41Q r2 = r3.A05
            X.41Q r0 = X.AnonymousClass41Q.DISPOSE_TO_PREVIOUS
            if (r2 == r0) goto L_0x0099
            X.41A r1 = r3.A04
            X.41A r0 = X.AnonymousClass41A.NO_BLEND
            if (r1 != r0) goto L_0x008f
            r7.A01(r4, r3)
        L_0x008f:
            r5.A08(r4, r6)
            X.41Q r0 = X.AnonymousClass41Q.DISPOSE_TO_BACKGROUND
            if (r2 != r0) goto L_0x0099
            r7.A01(r4, r3)
        L_0x0099:
            int r6 = r6 + 1
            goto L_0x0078
        L_0x009c:
            X.3Aj r3 = r7.A01
            X.4Na[] r0 = r3.A09
            r2 = r0[r8]
            X.41A r1 = r2.A04
            X.41A r0 = X.AnonymousClass41A.NO_BLEND
            if (r1 != r0) goto L_0x00ab
            r7.A01(r4, r2)
        L_0x00ab:
            r3.A08(r4, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614939d.A00(int, android.graphics.Bitmap):void");
    }

    public final void A01(Canvas canvas, C85074Na r10) {
        int i2 = r10.A02;
        int i3 = r10.A03;
        canvas.drawRect((float) i2, (float) i3, (float) (i2 + r10.A01), (float) (i3 + r10.A00), this.A00);
    }

    public final boolean A02(int i2) {
        if (i2 != 0) {
            C85074Na[] r0 = this.A01.A09;
            C85074Na r3 = r0[i2];
            C85074Na r2 = r0[i2 - 1];
            if (r3.A04 != AnonymousClass41A.NO_BLEND || !A03(r3)) {
                return r2.A05 == AnonymousClass41Q.DISPOSE_TO_BACKGROUND && A03(r2);
            }
        }
        return true;
    }

    public final boolean A03(C85074Na r4) {
        if (r4.A02 == 0 && r4.A03 == 0) {
            int i2 = r4.A01;
            Rect rect = this.A01.A03;
            return i2 == rect.width() && r4.A00 == rect.height();
        }
    }
}
