package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* renamed from: X.0eS  reason: invalid class name and case insensitive filesystem */
public class C08840eS implements C13580mc {
    public int A00;
    public int A01;
    public Bitmap.Config A02 = Bitmap.Config.ARGB_8888;
    public Rect A03;
    public final Paint A04;
    public final C13240lh A05;
    public final C13340ls A06;
    public final AnonymousClass0UA A07;
    public final C05920Tn A08;
    public final C05460Rn A09;
    public final AnonymousClass4SM A0A;

    public C08840eS(C13240lh r3, C13340ls r4, AnonymousClass0UA r5, C05920Tn r6, C05460Rn r7, AnonymousClass4SM r8) {
        this.A0A = r8;
        this.A06 = r4;
        this.A05 = r3;
        this.A09 = r7;
        this.A08 = r6;
        this.A07 = r5;
        this.A04 = new Paint(6);
        A00();
    }

    public final void A00() {
        C05460Rn r2 = this.A09;
        int A012 = r2.A01();
        this.A01 = A012;
        int i2 = -1;
        if (A012 == -1) {
            Rect rect = this.A03;
            this.A01 = rect == null ? -1 : rect.width();
        }
        int A002 = r2.A00();
        this.A00 = A002;
        if (A002 == -1) {
            Rect rect2 = this.A03;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.A00 = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r5 = X.C08840eS.class;
        r1 = X.AnonymousClass0X1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r1.AJ7(5) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r1.Ai2(r5.getSimpleName(), "Failed to create frame bitmap", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        if (r3 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000c, B:6:0x0018] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.graphics.Canvas r10, int r11, int r12) {
        /*
            r9 = this;
            r5 = -1
            r2 = 3
            r7 = 2
            r4 = 0
            r6 = 1
            r3 = 0
            if (r12 == 0) goto L_0x0082
            if (r12 == r6) goto L_0x0059
            if (r12 == r7) goto L_0x0018
            X.0ls r0 = r9.A06     // Catch:{ all -> 0x00a1 }
            X.0ev r3 = r0.ACA(r11)     // Catch:{ all -> 0x00a1 }
            boolean r4 = r9.A02(r10, r3, r11, r2)     // Catch:{ all -> 0x00a1 }
            r2 = -1
            goto L_0x0090
        L_0x0018:
            X.4SM r8 = r9.A0A     // Catch:{ RuntimeException -> 0x0043 }
            int r6 = r9.A01     // Catch:{ RuntimeException -> 0x0043 }
            int r1 = r9.A00     // Catch:{ RuntimeException -> 0x0043 }
            android.graphics.Bitmap$Config r0 = r9.A02     // Catch:{ RuntimeException -> 0x0043 }
            X.0ev r3 = r8.A00(r0, r6, r1)     // Catch:{ RuntimeException -> 0x0043 }
            boolean r0 = X.C09110ev.A01(r3)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0090
            X.0Rn r1 = r9.A09     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r3.A04()     // Catch:{ all -> 0x00a1 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00a1 }
            boolean r0 = r1.A03(r0, r11)     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x003c
            r3.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x0094
        L_0x003c:
            boolean r0 = r9.A02(r10, r3, r11, r7)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0094
            goto L_0x0093
        L_0x0043:
            r6 = move-exception
            java.lang.Class<X.0eS> r5 = X.C08840eS.class
            java.lang.String r2 = "Failed to create frame bitmap"
            X.0lv r1 = X.AnonymousClass0X1.A00     // Catch:{ all -> 0x00a1 }
            r0 = 5
            boolean r0 = r1.AJ7(r0)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = r5.getSimpleName()     // Catch:{ all -> 0x00a1 }
            r1.Ai2(r0, r2, r6)     // Catch:{ all -> 0x00a1 }
            return r4
        L_0x0059:
            X.0ls r2 = r9.A06     // Catch:{ all -> 0x00a1 }
            int r1 = r9.A01     // Catch:{ all -> 0x00a1 }
            int r0 = r9.A00     // Catch:{ all -> 0x00a1 }
            X.0ev r3 = r2.AA5(r11, r1, r0)     // Catch:{ all -> 0x00a1 }
            boolean r0 = X.C09110ev.A01(r3)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x008f
            X.0Rn r1 = r9.A09     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r3.A04()     // Catch:{ all -> 0x00a1 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00a1 }
            boolean r0 = r1.A03(r0, r11)     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x007b
            r3.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x008f
        L_0x007b:
            boolean r0 = r9.A02(r10, r3, r11, r6)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x008f
            goto L_0x008e
        L_0x0082:
            X.0ls r0 = r9.A06     // Catch:{ all -> 0x00a1 }
            X.0ev r3 = r0.AAK(r11)     // Catch:{ all -> 0x00a1 }
            boolean r4 = r9.A02(r10, r3, r11, r4)     // Catch:{ all -> 0x00a1 }
            r2 = 1
            goto L_0x0090
        L_0x008e:
            r4 = 1
        L_0x008f:
            r2 = 2
        L_0x0090:
            if (r3 == 0) goto L_0x0097
            goto L_0x0094
        L_0x0093:
            r4 = 1
        L_0x0094:
            r3.close()
        L_0x0097:
            if (r4 != 0) goto L_0x00a0
            if (r2 == r5) goto L_0x00a0
            boolean r0 = r9.A01(r10, r11, r2)
            return r0
        L_0x00a0:
            return r4
        L_0x00a1:
            r0 = move-exception
            if (r3 == 0) goto L_0x00a7
            r3.close()
        L_0x00a7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08840eS.A01(android.graphics.Canvas, int, int):boolean");
    }

    public final boolean A02(Canvas canvas, C09110ev r6, int i2, int i3) {
        if (!C09110ev.A01(r6)) {
            return false;
        }
        Rect rect = this.A03;
        Bitmap bitmap = (Bitmap) r6.A04();
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A04);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, this.A03, this.A04);
        }
        if (i3 == 3) {
            return true;
        }
        this.A06.ARe(r6, i2, i3);
        return true;
    }

    public boolean A8G(Canvas canvas, Drawable drawable, int i2) {
        AnonymousClass0UA r11;
        int i3 = i2;
        boolean A012 = A01(canvas, i3, 0);
        C05920Tn r6 = this.A08;
        if (!(r6 == null || (r11 = this.A07) == null)) {
            C13340ls r10 = this.A06;
            for (int i4 = 1; i4 <= r6.A00; i4++) {
                int frameCount = (i2 + i4) % this.A05.getFrameCount();
                if (AnonymousClass0X1.A00.AJ7(2)) {
                    AnonymousClass0X1.A01(C05920Tn.class, Integer.valueOf(frameCount), Integer.valueOf(i3), "Preparing frame %d, last drawn: %d");
                }
                int hashCode = (hashCode() * 31) + frameCount;
                SparseArray sparseArray = r11.A01;
                synchronized (sparseArray) {
                    if (sparseArray.get(hashCode) != null) {
                        AnonymousClass0X1.A02(AnonymousClass0UA.class, Integer.valueOf(frameCount), "Already scheduled decode job for frame %d");
                    } else if (r10.A6d(frameCount)) {
                        AnonymousClass0X1.A02(AnonymousClass0UA.class, Integer.valueOf(frameCount), "Frame %d is cached already.");
                    } else {
                        C10530hH r8 = new C10530hH(this, r10, r11, frameCount, hashCode);
                        sparseArray.put(hashCode, r8);
                        r11.A04.execute(r8);
                    }
                }
            }
        }
        return A012;
    }

    public int ACR(int i2) {
        return this.A05.ACR(i2);
    }

    public int ACq() {
        return this.A00;
    }

    public int ACr() {
        return this.A01;
    }

    public void AdX(int i2) {
        this.A04.setAlpha(i2);
    }

    public void Adc(Rect rect) {
        this.A03 = rect;
        this.A09.A02(rect);
        A00();
    }

    public void Adg(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public int getFrameCount() {
        return this.A05.getFrameCount();
    }

    public int getLoopCount() {
        return this.A05.getLoopCount();
    }
}
