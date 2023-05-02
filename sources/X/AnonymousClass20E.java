package X;

import com.whatsapp.media.transcode.Mozjpeg;

/* renamed from: X.20E  reason: invalid class name */
public class AnonymousClass20E {
    public static final Mozjpeg A00 = new Mozjpeg();

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A00(android.graphics.Bitmap r11, int r12, boolean r13) {
        /*
            r8 = r11
            android.graphics.Bitmap$Config r1 = r11.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r5 = 0
            if (r1 != r0) goto L_0x004e
            java.lang.String r0 = X.C17970vw.A0H()     // Catch:{ IOException -> 0x0047 }
            java.io.File r6 = java.io.File.createTempFile(r0, r5)     // Catch:{ IOException -> 0x0047 }
            com.whatsapp.media.transcode.Mozjpeg r7 = A00     // Catch:{ IOException -> 0x0047 }
            java.lang.String r9 = r6.getAbsolutePath()     // Catch:{ IOException -> 0x0047 }
            r11 = 0
            r10 = r12
            r12 = r13
            r7.A00(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0047 }
            long r3 = r6.length()     // Catch:{ IOException -> 0x0047 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0042 }
            r0.<init>(r6)     // Catch:{ all -> 0x0042 }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0042 }
            r1.<init>(r0)     // Catch:{ all -> 0x0042 }
            byte[] r0 = X.C30311c8.A08(r1)     // Catch:{ all -> 0x003d }
            r1.close()     // Catch:{ all -> 0x0042 }
            r6.delete()     // Catch:{ IOException -> 0x0047 }
            return r0
        L_0x003d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r6.delete()     // Catch:{ IOException -> 0x0047 }
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            java.lang.String r0 = "BitmapCompressor/createCompressedByteArray"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass20E.A00(android.graphics.Bitmap, int, boolean):byte[]");
    }
}
