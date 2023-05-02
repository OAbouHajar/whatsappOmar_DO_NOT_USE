package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5zM  reason: invalid class name */
public class AnonymousClass5zM implements AnonymousClass69V {
    public ImageReader A00;
    public C117865tg A01;
    public final ImageReader.OnImageAvailableListener A02 = new AnonymousClass5yR(this);
    public final AtomicInteger A03 = new AtomicInteger(0);

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(android.media.ImageReader r6, X.AnonymousClass5zM r7) {
        /*
            X.5tg r5 = r7.A01
            android.media.ImageReader r0 = r7.A00
            r4 = 0
            if (r0 == 0) goto L_0x000c
            r0.setOnImageAvailableListener(r4, r4)
            r7.A01 = r4
        L_0x000c:
            android.media.Image r2 = r6.acquireLatestImage()     // Catch:{ Exception -> 0x0028 }
            if (r2 == 0) goto L_0x003f
            X.5va r1 = new X.5va     // Catch:{ all -> 0x0022 }
            r1.<init>()     // Catch:{ all -> 0x0022 }
            r0 = 1
            r1.A02(r2, r0, r0)     // Catch:{ all -> 0x0020 }
            r4 = r1
            r2.close()     // Catch:{ Exception -> 0x0028 }
            goto L_0x003f
        L_0x0020:
            r0 = move-exception
            goto L_0x0024
        L_0x0022:
            r0 = move-exception
            r1 = r4
        L_0x0024:
            r2.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0     // Catch:{ Exception -> 0x002a }
        L_0x0028:
            r3 = move-exception
            goto L_0x002c
        L_0x002a:
            r3 = move-exception
            r4 = r1
        L_0x002c:
            java.lang.String r2 = "YuvPhotoProcessor"
            java.lang.String r0 = "Failed to acquire image: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            X.AnonymousClass5xH.A01(r2, r0)
        L_0x003f:
            if (r5 == 0) goto L_0x0049
            X.5wG r0 = new X.5wG
            r0.<init>((X.C118895va) r4)
            r5.A00(r0)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zM.A00(android.media.ImageReader, X.5zM):void");
    }

    public int ACi() {
        return 35;
    }

    public void AHv(int i2, int i3, int i4) {
        this.A00 = ImageReader.newInstance(i2, i3, 35, 1);
    }

    public void Aam(Handler handler, C117865tg r4) {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            this.A01 = r4;
            imageReader.setOnImageAvailableListener(this.A02, handler);
        }
    }

    public Surface getSurface() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A00.close();
            this.A00 = null;
        }
        this.A01 = null;
    }
}
