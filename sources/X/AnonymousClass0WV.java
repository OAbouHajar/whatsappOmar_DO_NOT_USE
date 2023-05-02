package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0WV  reason: invalid class name */
public class AnonymousClass0WV {
    public static File A00(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            StringBuilder A0r = AnonymousClass000.A0r(".font");
            A0r.append(Process.myPid());
            A0r.append("-");
            A0r.append(Process.myTid());
            String A0h = AnonymousClass000.A0h("-", A0r);
            int i2 = 0;
            while (i2 < 100) {
                File file = new File(cacheDir, AnonymousClass000.A0l(AnonymousClass000.A0q(A0h), i2));
                try {
                    if (file.createNewFile()) {
                        return file;
                    }
                    i2++;
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer A01(android.content.Context r8, android.net.Uri r9) {
        /*
            r4 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()
            r3 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = X.AnonymousClass0LX.A00(r1, r9, r4, r0)     // Catch:{ IOException -> 0x0039 }
            if (r2 != 0) goto L_0x000f
            return r4
        L_0x000f:
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ all -> 0x0034 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0034 }
            r1.<init>(r0)     // Catch:{ all -> 0x0034 }
            java.nio.channels.FileChannel r4 = r1.getChannel()     // Catch:{ all -> 0x002f }
            long r8 = r4.size()     // Catch:{ all -> 0x002f }
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x002f }
            r6 = 0
            java.nio.MappedByteBuffer r0 = r4.map(r5, r6, r8)     // Catch:{ all -> 0x002f }
            r1.close()     // Catch:{ all -> 0x0034 }
            r2.close()     // Catch:{ IOException -> 0x0039 }
            return r0
        L_0x002f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WV.A01(android.content.Context, android.net.Uri):java.nio.ByteBuffer");
    }

    public static boolean A02(Resources resources, File file, int i2) {
        try {
            InputStream openRawResource = resources.openRawResource(i2);
            try {
                boolean A03 = A03(file, openRawResource);
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return A03;
            } catch (Throwable th) {
                th = th;
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                        throw th;
                    } catch (IOException unused2) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (r5 == null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041 A[SYNTHETIC, Splitter:B:23:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.io.File r8, java.io.InputStream r9) {
        /*
            android.os.StrictMode$ThreadPolicy r7 = android.os.StrictMode.allowThreadDiskWrites()
            r6 = 0
            r5 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0028 }
            r4.<init>(r8, r6)     // Catch:{ IOException -> 0x0028 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r1 = r9.read(r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r0 = -1
            if (r1 == r0) goto L_0x001a
            r4.write(r2, r6, r1)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r0 = 1
            r4.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r7)
            return r0
        L_0x0022:
            r0 = move-exception
            r5 = r4
            goto L_0x004b
        L_0x0025:
            r3 = move-exception
            r5 = r4
            goto L_0x0029
        L_0x0028:
            r3 = move-exception
        L_0x0029:
            java.lang.String r2 = "TypefaceCompatUtil"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Error copying resource contents to temp file: "
            r1.append(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0048 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0044
            r5.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            android.os.StrictMode.setThreadPolicy(r7)
            return r6
        L_0x0048:
            r0 = move-exception
            if (r5 == 0) goto L_0x004e
        L_0x004b:
            r5.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            android.os.StrictMode.setThreadPolicy(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WV.A03(java.io.File, java.io.InputStream):boolean");
    }
}
