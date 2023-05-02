package X;

import android.graphics.BitmapFactory;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.nio.ByteBuffer;

/* renamed from: X.4bl  reason: invalid class name and case insensitive filesystem */
public abstract class C89204bl {
    public static final byte[] A03 = {-1, -39};
    public final AnonymousClass0EH A00;
    public final AnonymousClass5UM A01;
    public final PreverificationHelper A02;

    public C89204bl(AnonymousClass0EH r4, AnonymousClass5UM r5, int i2) {
        this.A02 = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.A01 = r5;
        this.A00 = r4;
        for (int i3 = 0; i3 < i2; i3++) {
            this.A00.Abi(ByteBuffer.allocate(16384));
        }
    }

    public abstract int A00(BitmapFactory.Options options, int i2, int i3);

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r4 == false) goto L_0x0095;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0116 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5 A[Catch:{ RuntimeException -> 0x0127 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7 A[Catch:{ RuntimeException -> 0x0127 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C09110ev A01(android.graphics.Bitmap.Config r13, X.AnonymousClass54L r14, int r15) {
        /*
            r12 = this;
            r7 = 0
            X.0UN r1 = r14.A00
            X.0UN r0 = X.AnonymousClass0NF.A01
            r4 = 1
            if (r1 == r0) goto L_0x0062
            X.0UN r0 = X.AnonymousClass0NF.A00
            if (r1 == r0) goto L_0x0062
        L_0x000c:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r2.inSampleSize = r3
            r2.inJustDecodeBounds = r3
            java.io.InputStream r0 = r14.A00()
            android.graphics.BitmapFactory.decodeStream(r0, r7, r2)
            int r0 = r2.outWidth
            r1 = -1
            if (r0 == r1) goto L_0x012f
            int r0 = r2.outHeight
            if (r0 == r1) goto L_0x012f
            r10 = 0
            r2.inJustDecodeBounds = r10
            r2.inDither = r3
            r2.inPreferredConfig = r13
            r2.inMutable = r3
            java.io.InputStream r1 = r14.A00()
            X.0ev r3 = r14.A01
            java.lang.Object r0 = r3.A04()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r3.A04()
            X.0me r0 = (X.C13600me) r0
            int r0 = r0.size()
        L_0x0045:
            if (r0 <= r15) goto L_0x004d
            X.0J5 r0 = new X.0J5
            r0.<init>(r1, r15)
            r1 = r0
        L_0x004d:
            if (r4 != 0) goto L_0x0057
            byte[] r3 = A03
            X.044 r0 = new X.044
            r0.<init>(r1, r3)
            r1 = r0
        L_0x0057:
            android.graphics.Bitmap$Config r4 = r2.inPreferredConfig
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            boolean r11 = X.C13680ns.A1a(r4, r3)
            goto L_0x0080
        L_0x0060:
            r0 = -1
            goto L_0x0045
        L_0x0062:
            X.0ev r0 = r14.A01
            java.lang.Object r2 = r0.A04()
            X.0me r2 = (X.C13600me) r2
            int r0 = r15 + -2
            byte r1 = r2.AbM(r0)
            r0 = -1
            if (r1 != r0) goto L_0x007e
            int r0 = r15 - r4
            byte r1 = r2.AbM(r0)
            r0 = -39
            if (r1 != r0) goto L_0x007e
            goto L_0x000c
        L_0x007e:
            r4 = 0
            goto L_0x000c
        L_0x0080:
            int r9 = r2.outWidth     // Catch:{ RuntimeException -> 0x0127 }
            int r6 = r2.outHeight     // Catch:{ RuntimeException -> 0x0127 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x0127 }
            r5 = 26
            if (r8 < r5) goto L_0x0095
            com.facebook.imagepipeline.platform.PreverificationHelper r0 = r12.A02     // Catch:{ RuntimeException -> 0x0127 }
            if (r0 == 0) goto L_0x0095
            boolean r4 = r0.shouldUseHardwareBitmapConfig(r4)     // Catch:{ RuntimeException -> 0x0127 }
            r0 = 1
            if (r4 != 0) goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            if (r0 == 0) goto L_0x009c
            r2.inMutable = r10     // Catch:{ RuntimeException -> 0x0127 }
            r6 = r7
            goto L_0x00b1
        L_0x009c:
            int r4 = r12.A00(r2, r9, r6)     // Catch:{ RuntimeException -> 0x0127 }
            X.5UM r0 = r12.A01     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ RuntimeException -> 0x0127 }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ RuntimeException -> 0x0127 }
            if (r6 != 0) goto L_0x00b1
            java.lang.String r0 = "BitmapPool.get returned null"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)     // Catch:{ RuntimeException -> 0x0127 }
        L_0x00b0:
            throw r0     // Catch:{ RuntimeException -> 0x0127 }
        L_0x00b1:
            r2.inBitmap = r6     // Catch:{ RuntimeException -> 0x0127 }
            if (r8 < r5) goto L_0x00bd
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB     // Catch:{ RuntimeException -> 0x0127 }
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)     // Catch:{ RuntimeException -> 0x0127 }
            r2.inPreferredColorSpace = r0     // Catch:{ RuntimeException -> 0x0127 }
        L_0x00bd:
            X.0EH r4 = r12.A00     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.Object r5 = r4.A4T()     // Catch:{ RuntimeException -> 0x0127 }
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch:{ RuntimeException -> 0x0127 }
            if (r5 != 0) goto L_0x00cd
            r0 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ RuntimeException -> 0x0127 }
        L_0x00cd:
            byte[] r0 = r5.array()     // Catch:{ IllegalArgumentException -> 0x00f4, RuntimeException -> 0x00eb }
            r2.inTempStorage = r0     // Catch:{ IllegalArgumentException -> 0x00f4, RuntimeException -> 0x00eb }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1, r7, r2)     // Catch:{ IllegalArgumentException -> 0x00f4, RuntimeException -> 0x00eb }
            r4.Abi(r5)     // Catch:{ RuntimeException -> 0x0127 }
            if (r6 == 0) goto L_0x011c
            if (r6 == r1) goto L_0x011c
            X.5UM r0 = r12.A01     // Catch:{ RuntimeException -> 0x0127 }
            r0.Abg(r6)     // Catch:{ RuntimeException -> 0x0127 }
            r1.recycle()     // Catch:{ RuntimeException -> 0x0127 }
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()     // Catch:{ RuntimeException -> 0x0127 }
            goto L_0x00b0
        L_0x00eb:
            r1 = move-exception
            if (r6 == 0) goto L_0x00f3
            X.5UM r0 = r12.A01     // Catch:{ all -> 0x0117 }
            r0.Abg(r6)     // Catch:{ all -> 0x0117 }
        L_0x00f3:
            throw r1     // Catch:{ all -> 0x0117 }
        L_0x00f4:
            r2 = move-exception
            if (r6 == 0) goto L_0x00fc
            X.5UM r0 = r12.A01     // Catch:{ all -> 0x0117 }
            r0.Abg(r6)     // Catch:{ all -> 0x0117 }
        L_0x00fc:
            r1.reset()     // Catch:{ IOException -> 0x0116 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x0116 }
            if (r1 == 0) goto L_0x0115
            X.4mz r0 = X.C95654mz.A00     // Catch:{ IOException -> 0x0116 }
            if (r0 != 0) goto L_0x0110
            X.4mz r0 = new X.4mz     // Catch:{ IOException -> 0x0116 }
            r0.<init>()     // Catch:{ IOException -> 0x0116 }
            X.C95654mz.A00 = r0     // Catch:{ IOException -> 0x0116 }
        L_0x0110:
            X.0ev r0 = X.C09110ev.A00(r0, r1)     // Catch:{ IOException -> 0x0116 }
            goto L_0x0123
        L_0x0115:
            throw r2     // Catch:{ IOException -> 0x0116 }
        L_0x0116:
            throw r2     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            r4.Abi(r5)     // Catch:{ RuntimeException -> 0x0127 }
            goto L_0x00b0
        L_0x011c:
            X.5UM r0 = r12.A01     // Catch:{ RuntimeException -> 0x0127 }
            X.0ev r0 = X.C09110ev.A00(r0, r1)     // Catch:{ RuntimeException -> 0x0127 }
            return r0
        L_0x0123:
            r4.Abi(r5)     // Catch:{ RuntimeException -> 0x0127 }
            return r0
        L_0x0127:
            r0 = move-exception
            if (r11 == 0) goto L_0x0133
            X.0ev r0 = r12.A01(r3, r14, r15)
            return r0
        L_0x012f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass3K3.A0f()
        L_0x0133:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89204bl.A01(android.graphics.Bitmap$Config, X.54L, int):X.0ev");
    }
}
