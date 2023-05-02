package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.5zL  reason: invalid class name */
public class AnonymousClass5zL implements AnonymousClass69V {
    public ImageReader A00;
    public final ImageReader.OnImageAvailableListener A01 = new AnonymousClass5yP(this);
    public volatile C117865tg A02;

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0030=Splitter:B:14:0x0030, B:19:0x0038=Splitter:B:19:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(android.media.ImageReader r6, X.AnonymousClass5zL r7) {
        /*
            android.media.ImageReader r0 = r7.A00
            r5 = 0
            if (r0 == 0) goto L_0x0008
            r0.setOnImageAvailableListener(r5, r5)
        L_0x0008:
            X.5tg r4 = r7.A02
            r7.A02 = r5
            if (r4 == 0) goto L_0x0077
            android.media.Image r2 = r6.acquireNextImage()     // Catch:{ Exception -> 0x0039 }
            if (r2 == 0) goto L_0x0050
            android.media.Image$Plane[] r1 = r2.getPlanes()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0030
            int r0 = r1.length     // Catch:{ all -> 0x0034 }
            if (r0 <= 0) goto L_0x0030
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x0034 }
            java.nio.ByteBuffer r1 = r0.getBuffer()     // Catch:{ all -> 0x0034 }
            r1.rewind()     // Catch:{ all -> 0x0034 }
            int r0 = r1.remaining()     // Catch:{ all -> 0x0034 }
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x0034 }
            r1.get(r5)     // Catch:{ all -> 0x0034 }
        L_0x0030:
            r2.close()     // Catch:{ Exception -> 0x0039 }
            goto L_0x0050
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            r3 = move-exception
            java.lang.String r2 = "DefaultPhotoProcessor"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "Failed to acquire image: "
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0063 }
            android.util.Log.e(r2, r0, r3)     // Catch:{ all -> 0x0063 }
        L_0x0050:
            boolean r0 = X.C119015vm.A00()
            if (r0 == 0) goto L_0x005a
            byte[] r5 = X.C119015vm.A01()
        L_0x005a:
            X.5wG r0 = new X.5wG
            r0.<init>((byte[]) r5)
            r4.A00(r0)
            return
        L_0x0063:
            r1 = move-exception
            boolean r0 = X.C119015vm.A00()
            if (r0 == 0) goto L_0x006e
            byte[] r5 = X.C119015vm.A01()
        L_0x006e:
            X.5wG r0 = new X.5wG
            r0.<init>((byte[]) r5)
            r4.A00(r0)
            throw r1
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zL.A00(android.media.ImageReader, X.5zL):void");
    }

    public int ACi() {
        return 256;
    }

    public void AHv(int i2, int i3, int i4) {
        this.A00 = ImageReader.newInstance(i2, i3, 256, 1);
    }

    public void Aam(Handler handler, C117865tg r4) {
        if (this.A00 != null) {
            this.A02 = r4;
            this.A00.setOnImageAvailableListener(this.A01, handler);
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
        this.A02 = null;
    }
}
