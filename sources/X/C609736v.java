package X;

import android.view.View;
import com.obwhatsapp.mediacomposer.VideoTimelineView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.36v  reason: invalid class name and case insensitive filesystem */
public class C609736v extends C16690tT {
    public long A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final File A04;
    public final WeakReference A05;

    public C609736v(VideoTimelineView videoTimelineView, File file, float f2, float f3, int i2) {
        this.A05 = C13690nt.A0h(videoTimelineView);
        this.A04 = file;
        this.A03 = i2;
        this.A02 = f2;
        this.A01 = f3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091 A[SYNTHETIC, Splitter:B:27:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            X.1wq r12 = new X.1wq
            r12.<init>()
            r13 = r18
            java.io.File r0 = r13.A04     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x00a8 }
            r12.setDataSource(r0)     // Catch:{ Exception -> 0x00a8 }
            r0 = 9
            java.lang.String r0 = r12.extractMetadata(r0)     // Catch:{ Exception -> 0x00a8 }
            long r16 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00a8 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a3 }
            r13.A00 = r0     // Catch:{ all -> 0x00a3 }
            float r11 = r13.A02     // Catch:{ all -> 0x00a3 }
            float r10 = r13.A01     // Catch:{ all -> 0x00a3 }
            r0 = 0
            android.graphics.RectF r9 = new android.graphics.RectF     // Catch:{ all -> 0x00a3 }
            r9.<init>(r0, r0, r11, r10)     // Catch:{ all -> 0x00a3 }
            android.graphics.Rect r8 = X.AnonymousClass000.A0J()     // Catch:{ all -> 0x00a3 }
            r7 = 1
            android.graphics.Paint r6 = X.C13700nu.A06(r7)     // Catch:{ all -> 0x00a3 }
            r5 = 0
            r4 = 0
        L_0x0035:
            int r14 = r13.A03     // Catch:{ all -> 0x00a3 }
            if (r4 >= r14) goto L_0x009e
            boolean r0 = X.C16690tT.A02(r13)     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x009e
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r16
            long r0 = (long) r4     // Catch:{ all -> 0x00a3 }
            long r2 = r2 * r0
            long r0 = (long) r14     // Catch:{ all -> 0x00a3 }
            long r2 = r2 / r0
            android.graphics.Bitmap r2 = r12.getFrameAtTime(r2)     // Catch:{ Exception | NoSuchMethodError -> 0x008d }
            if (r2 == 0) goto L_0x008e
            int r14 = r2.getWidth()     // Catch:{ all -> 0x00a3 }
            int r3 = r2.getHeight()     // Catch:{ all -> 0x00a3 }
            float r0 = (float) r14     // Catch:{ all -> 0x00a3 }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            float r0 = (float) r3     // Catch:{ all -> 0x00a3 }
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            int r15 = (int) r11     // Catch:{ all -> 0x00a3 }
            int r1 = (int) r10     // Catch:{ all -> 0x00a3 }
            android.graphics.Bitmap$Config r0 = r2.getConfig()     // Catch:{ all -> 0x00a3 }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r15, r1, r0)     // Catch:{ all -> 0x00a3 }
            if (r14 <= r3) goto L_0x0080
            r8.top = r5     // Catch:{ all -> 0x00a3 }
            r8.bottom = r3     // Catch:{ all -> 0x00a3 }
            int r14 = r14 - r3
            int r0 = r14 / 2
            r8.left = r0     // Catch:{ all -> 0x00a3 }
            int r0 = r0 + r3
            r8.right = r0     // Catch:{ all -> 0x00a3 }
        L_0x0077:
            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch:{ all -> 0x00a3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a3 }
            r0.drawBitmap(r2, r8, r9, r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x008f
        L_0x0080:
            r8.left = r5     // Catch:{ all -> 0x00a3 }
            r8.right = r14     // Catch:{ all -> 0x00a3 }
            int r3 = r3 - r14
            int r0 = r3 / 2
            r8.top = r0     // Catch:{ all -> 0x00a3 }
            int r0 = r0 + r14
            r8.bottom = r0     // Catch:{ all -> 0x00a3 }
            goto L_0x0077
        L_0x008d:
            r2 = 0
        L_0x008e:
            r1 = r2
        L_0x008f:
            if (r1 == r2) goto L_0x0094
            r2.recycle()     // Catch:{ all -> 0x00a3 }
        L_0x0094:
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r7]     // Catch:{ all -> 0x00a3 }
            r0[r5] = r1     // Catch:{ all -> 0x00a3 }
            r13.A07(r0)     // Catch:{ all -> 0x00a3 }
            int r4 = r4 + 1
            goto L_0x0035
        L_0x009e:
            r12.close()
            r0 = 0
            return r0
        L_0x00a3:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            throw r0
        L_0x00a8:
            r12.close()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609736v.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        View view = (View) this.A05.get();
        if (view != null) {
            view.invalidate();
        }
    }
}
