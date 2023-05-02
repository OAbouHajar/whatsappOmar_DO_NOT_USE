package X;

import java.io.File;

/* renamed from: X.2Ie  reason: invalid class name and case insensitive filesystem */
public abstract class C47242Ie {
    public final long A00;
    public final String A01;

    public C47242Ie(File file, long j2) {
        this.A00 = j2;
        this.A01 = file.getCanonicalPath();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r2.isDirectory() != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00d4 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ea A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(java.util.zip.ZipInputStream r19) {
        /*
            r18 = this;
            r0 = 8192(0x2000, float:1.14794E-41)
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r0]
            r6 = 0
            r16 = 0
            r5 = 0
        L_0x000a:
            r4 = r19
            java.util.zip.ZipEntry r12 = r4.getNextEntry()
            if (r12 == 0) goto L_0x0129
            r9 = r18
            java.lang.String r11 = r9.A01
            java.lang.String r0 = r12.getName()
            java.io.File r2 = X.AnonymousClass1XI.A05(r11, r0)
            if (r2 == 0) goto L_0x0110
            boolean r3 = r9 instanceof X.AnonymousClass323
            java.lang.String r10 = r2.getCanonicalPath()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r3 == 0) goto L_0x00f9
            r1.append(r11)
            r0 = 47
            r1.append(r0)
            java.lang.String r0 = "thumbnails"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r0 = r10.startsWith(r0)
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass1XI.A08(r0)
            java.lang.String r0 = "jpg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005b
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0110
        L_0x005b:
            if (r3 == 0) goto L_0x0093
            java.io.File r1 = r2.getParentFile()
            if (r1 == 0) goto L_0x006c
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x006c
            r1.mkdirs()
        L_0x006c:
            r14 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00d9 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00d9 }
        L_0x0073:
            int r1 = r4.read(r7)     // Catch:{ all -> 0x008e }
            r0 = -1
            if (r1 == r0) goto L_0x008a
            r3.write(r7, r6, r1)     // Catch:{ all -> 0x008e }
            long r0 = (long) r1     // Catch:{ all -> 0x008e }
            long r14 = r14 + r0
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = r10 + r14
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
            goto L_0x0073
        L_0x008a:
            r3.close()     // Catch:{ FileNotFoundException -> 0x00d9 }
            goto L_0x00df
        L_0x008e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            throw r0     // Catch:{ FileNotFoundException -> 0x00d9 }
        L_0x0093:
            r13 = r9
            X.2Id r13 = (X.C47232Id) r13
            java.io.File r1 = r13.A00
            java.lang.String r0 = r2.getName()
            java.io.File r12 = new java.io.File
            r12.<init>(r1, r0)
            r14 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00d5 }
            r3.<init>(r12)     // Catch:{ FileNotFoundException -> 0x00d5 }
        L_0x00a8:
            int r1 = r4.read(r7)     // Catch:{ all -> 0x00d0 }
            r0 = -1
            if (r1 == r0) goto L_0x00bf
            r3.write(r7, r6, r1)     // Catch:{ all -> 0x00d0 }
            long r0 = (long) r1     // Catch:{ all -> 0x00d0 }
            long r14 = r14 + r0
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = r10 + r14
            r1 = 524288000(0x1f400000, double:2.590326893E-315)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00bf
            goto L_0x00a8
        L_0x00bf:
            java.util.Set r1 = r13.A01     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r12.getName()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = X.AnonymousClass1XI.A09(r0)     // Catch:{ all -> 0x00d0 }
            r1.add(r0)     // Catch:{ all -> 0x00d0 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x00d5 }
            goto L_0x00df
        L_0x00d0:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            throw r0     // Catch:{ FileNotFoundException -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver"
            goto L_0x00dc
        L_0x00d9:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperZipEntrySaver"
        L_0x00dc:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00df:
            long r16 = r16 + r14
            long r3 = (long) r8
            long r3 = r3 + r16
            long r1 = r9.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            java.lang.String r0 = "SafeZipEntrySaver: File being unzipped is too big."
        L_0x00ec:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        L_0x00f0:
            int r5 = r5 + 1
            r0 = 100
            if (r5 <= r0) goto L_0x000a
            java.lang.String r0 = "SafeZipEntrySaver: Too many files to unzip."
            goto L_0x00ec
        L_0x00f9:
            r1.append(r11)
            java.lang.String r0 = "/backgrounds"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r0 = r10.startsWith(r0)
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver/invalid zip content"
        L_0x010d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0110:
            r12.getName()
            goto L_0x000a
        L_0x0115:
            java.lang.String r0 = r2.getAbsolutePath()
            java.lang.String r1 = X.AnonymousClass1XI.A08(r0)
            java.lang.String r0 = "webp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "PAY: PaymentBackgroundBatchZipEntrySaver/store: Zip entry not webp"
            goto L_0x010d
        L_0x0129:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47242Ie.A00(java.util.zip.ZipInputStream):boolean");
    }
}
