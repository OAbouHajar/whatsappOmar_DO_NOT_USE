package com.whatsapp.stickers;

import X.AnonymousClass01S;
import X.AnonymousClass1XI;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class WebpUtils {
    public static final Random A00 = new Random();

    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.io.File r19) {
        /*
            X.AnonymousClass00B.A00()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x00a3, NoSuchAlgorithmException -> 0x00c6 }
            r0 = r19
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x00a3, NoSuchAlgorithmException -> 0x00c6 }
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x00a3, NoSuchAlgorithmException -> 0x00c6 }
            r11.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x00a3, NoSuchAlgorithmException -> 0x00c6 }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r14 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x009e }
            r0 = 4
            byte[] r13 = new byte[r0]     // Catch:{ all -> 0x009e }
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x009e }
            r0 = 8
            r11.skip(r0)     // Catch:{ all -> 0x009e }
            r18 = 1
            r10 = 0
            r9 = 0
            r17 = 1
            r8 = 0
        L_0x0026:
            int r16 = r11.read(r13)     // Catch:{ all -> 0x009e }
            r7 = 2
            if (r16 <= 0) goto L_0x008c
            byte r15 = r13[r10]     // Catch:{ all -> 0x009e }
            r6 = 70
            r5 = 73
            r4 = 88
            r3 = 69
            r1 = 3
            if (r15 != r3) goto L_0x0048
            byte r0 = r13[r18]     // Catch:{ all -> 0x009e }
            if (r0 != r4) goto L_0x0048
            byte r0 = r13[r7]     // Catch:{ all -> 0x009e }
            if (r0 != r5) goto L_0x0048
            byte r0 = r13[r1]     // Catch:{ all -> 0x009e }
            if (r0 != r6) goto L_0x0048
            r8 = 4
            goto L_0x0072
        L_0x0048:
            byte r2 = r12[r1]     // Catch:{ all -> 0x009e }
            if (r2 != r3) goto L_0x0057
            if (r15 != r4) goto L_0x0057
            byte r0 = r13[r18]     // Catch:{ all -> 0x009e }
            if (r0 != r5) goto L_0x0057
            byte r0 = r13[r7]     // Catch:{ all -> 0x009e }
            if (r0 != r6) goto L_0x0057
            goto L_0x0071
        L_0x0057:
            byte r1 = r12[r7]     // Catch:{ all -> 0x009e }
            if (r1 != r3) goto L_0x0065
            if (r2 != r4) goto L_0x0065
            if (r15 != r5) goto L_0x0065
            byte r0 = r13[r18]     // Catch:{ all -> 0x009e }
            if (r0 != r6) goto L_0x0065
            r8 = 2
            goto L_0x0072
        L_0x0065:
            byte r0 = r12[r18]     // Catch:{ all -> 0x009e }
            if (r0 != r3) goto L_0x0072
            if (r1 != r4) goto L_0x0072
            if (r2 != r5) goto L_0x0072
            if (r15 != r6) goto L_0x0072
            r8 = 1
            goto L_0x0072
        L_0x0071:
            r8 = 3
        L_0x0072:
            if (r17 != 0) goto L_0x007c
            if (r8 <= 0) goto L_0x0077
            goto L_0x0088
        L_0x0077:
            r14.update(r12, r10, r9)     // Catch:{ all -> 0x009e }
            r0 = 4
            goto L_0x0080
        L_0x007c:
            r0 = 4
            if (r8 != r0) goto L_0x0080
            goto L_0x008c
        L_0x0080:
            java.lang.System.arraycopy(r13, r10, r12, r10, r0)     // Catch:{ all -> 0x009e }
            r9 = r16
            r17 = 0
            goto L_0x0026
        L_0x0088:
            r14.update(r12, r10, r8)     // Catch:{ all -> 0x009e }
            goto L_0x008f
        L_0x008c:
            r14.update(r12, r10, r9)     // Catch:{ all -> 0x009e }
        L_0x008f:
            byte[] r0 = r14.digest()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r7)     // Catch:{ all -> 0x009e }
            r19.getAbsolutePath()     // Catch:{ all -> 0x009e }
            r11.close()     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x00a3, NoSuchAlgorithmException -> 0x00c6 }
            return r0
        L_0x009e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            throw r0     // Catch:{ FileNotFoundException -> 0x00ac, IOException -> 0x00a3, NoSuchAlgorithmException -> 0x00c6 }
        L_0x00a3:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "WebpUtils/getFileHashExcludingMetadata/io exception, file path:"
            goto L_0x00b4
        L_0x00ac:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "WebpUtils/getFileHashExcludingMetadata/file not found:"
        L_0x00b4:
            r1.append(r0)
            java.lang.String r0 = r19.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            goto L_0x00cc
        L_0x00c6:
            r1 = move-exception
            java.lang.String r0 = "WebpUtils/getFileHashExcludingMetadata/no such algorithms exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00cc:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.WebpUtils.A00(java.io.File):java.lang.String");
    }

    public static boolean A01(File file, byte[] bArr) {
        if (!file.exists()) {
            return false;
        }
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(".");
        sb.append(A00.nextLong());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        try {
            new String(bArr, AnonymousClass01S.A08);
            boolean insertWebpMetadata = insertWebpMetadata(file.getAbsolutePath(), file2.getAbsolutePath(), bArr);
            file.getAbsolutePath();
            if (insertWebpMetadata) {
                boolean renameTo = file2.renameTo(file);
                file2.getAbsolutePath();
                file.getAbsolutePath();
                AnonymousClass1XI.A0N(file2);
                return renameTo;
            }
        } catch (UnsupportedEncodingException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WebpUtils/insertWebpMetadata/error when converting bytes to string, input file:");
            sb2.append(file);
            Log.e(sb2.toString(), e2);
        } catch (Throwable th) {
            AnonymousClass1XI.A0N(file2);
            throw th;
        }
        AnonymousClass1XI.A0N(file2);
        return false;
    }

    public static native boolean createFirstThumbnail(byte[] bArr, int i2, String str);

    public static native byte[] fetchWebpMetadata(String str);

    public static native int getFirstWebpThumbnailMinimumFileLength(String str);

    public static native boolean insertWebpMetadata(String str, String str2, byte[] bArr);

    public static native WebpInfo verifyWebpFileIntegrity(String str);
}
