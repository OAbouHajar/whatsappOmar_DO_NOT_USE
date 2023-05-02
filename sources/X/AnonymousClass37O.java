package X;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.37O  reason: invalid class name */
public class AnonymousClass37O extends C16690tT {
    public String A00;
    public final Uri A01;
    public final AnonymousClass1A9 A02;
    public final WeakReference A03;

    public AnonymousClass37O(Uri uri, AnonymousClass5QC r3, AnonymousClass1A9 r4) {
        this.A02 = r4;
        this.A03 = C13690nt.A0h(r3);
        this.A01 = uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C86844Uj A03(android.graphics.Bitmap r10, X.C88514ad r11) {
        /*
            r3 = r10
            int r1 = r10.getWidth()
            int r0 = r10.getHeight()
            int r1 = r1 * r0
            int[] r4 = new int[r1]
            int r6 = r10.getWidth()
            int r9 = r10.getWidth()
            int r10 = r10.getHeight()
            r5 = 0
            r7 = 0
            r8 = 0
            r3.getPixels(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r3.getWidth()
            int r0 = r3.getHeight()
            X.3fR r1 = new X.3fR
            r1.<init>(r2, r4, r0)
            r0 = 0
            X.4Uj r0 = X.C812547l.A00(r1, r11, r0)     // Catch:{ 43w -> 0x0033, all -> 0x0031 }
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            throw r0
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37O.A03(android.graphics.Bitmap, X.4ad):X.4Uj");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        com.whatsapp.util.Log.e("CheckImageForQrCodeAsyncTask/OOM ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        com.whatsapp.util.Log.e("contactQrActivity/checkImageForQrCode/ioexception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: 20M | IOException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            r11 = 0
            X.1A9 r6 = r12.A02     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            android.net.Uri r7 = r12.A01     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            r8 = 2000(0x7d0, float:2.803E-42)
            r10 = 1
            r9 = 2000(0x7d0, float:2.803E-42)
            android.graphics.Bitmap r5 = r6.A0X(r7, r8, r9, r10, r11)     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            X.4ad r4 = new X.4ad     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            r4.<init>()     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            X.4Uj r3 = A03(r5, r4)     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
        L_0x0017:
            r6 = 1
            if (r3 != 0) goto L_0x0065
            int r0 = r5.getWidth()     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            double r0 = (double) r0     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            r9 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r0 = r0 / r9
            r7 = 4644337115725824000(0x4074000000000000, double:320.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            int r0 = r5.getHeight()     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            double r0 = (double) r0     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            double r0 = r0 / r9
            r7 = 4647151865492930560(0x407e000000000000, double:480.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            int r0 = r5.getWidth()     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            double r0 = r0 / r9
            double r0 = java.lang.Math.floor(r0)     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            int r3 = (int) r0     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            int r0 = r5.getHeight()     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            double r0 = r0 / r9
            double r1 = java.lang.Math.floor(r0)     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            int r0 = (int) r1     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r5, r3, r0, r6)     // Catch:{ IllegalArgumentException -> 0x005a, 20M | IOException -> 0x007f }
            r5.recycle()     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            X.4Uj r3 = A03(r0, r4)     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            r5 = r0
            goto L_0x0017
        L_0x005a:
            r5.getConfig()     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            r5.isRecycled()     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            return r0
        L_0x0065:
            r5.recycle()     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            if (r3 != 0) goto L_0x006f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            return r0
        L_0x006f:
            java.lang.String r0 = r3.A02     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            r12.A00 = r0     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            java.lang.Integer r0 = X.C13680ns.A0Z()     // Catch:{ 20M | IOException -> 0x007f, OutOfMemoryError -> 0x0078 }
            return r0
        L_0x0078:
            r1 = move-exception
            java.lang.String r0 = "CheckImageForQrCodeAsyncTask/OOM "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0084
        L_0x007f:
            java.lang.String r0 = "contactQrActivity/checkImageForQrCode/ioexception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0084:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37O.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        int A0D = AnonymousClass000.A0D(obj);
        AnonymousClass5QC r1 = (AnonymousClass5QC) this.A03.get();
        if (r1 != null) {
            r1.AWQ(this.A00, A0D);
        }
    }
}
