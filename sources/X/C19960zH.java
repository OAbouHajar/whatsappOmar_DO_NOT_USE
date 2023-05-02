package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: X.0zH  reason: invalid class name and case insensitive filesystem */
public final class C19960zH extends C19970zI {
    public String A00;
    public String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19960zH(X.C17130ua r8, X.C16980tz r9, X.C19950zG r10, X.C17670vS r11, X.C16320sq r12) {
        /*
            r7 = this;
            r0 = 1
            r2 = r9
            X.C18450wi.A0H(r9, r0)
            r0 = 2
            r5 = r12
            X.C18450wi.A0H(r12, r0)
            r0 = 3
            r1 = r8
            X.C18450wi.A0H(r8, r0)
            r0 = 4
            r4 = r11
            X.C18450wi.A0H(r11, r0)
            r0 = 5
            r3 = r10
            X.C18450wi.A0H(r10, r0)
            r0 = 13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19960zH.<init>(X.0ua, X.0tz, X.0zG, X.0vS, X.0sq):void");
    }

    public /* bridge */ /* synthetic */ void A03(C440622p r3, C108005Mh r4, Object obj, String str, String str2) {
        throw new UnsupportedOperationException("Current fetch method is not supported for the bloks commerce flow");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.C41191vO.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.C41191vO.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A07(java.io.InputStream r18, java.lang.Object r19) {
        /*
            r17 = this;
            java.lang.String r6 = "CommerceBloksAssetDownloader/unzipBatchBackgrounds"
            r2 = r17
            java.lang.String r0 = r2.A00
            java.lang.String r1 = "commerce_flow_"
            java.lang.String r0 = X.C18450wi.A06(r1, r0)
            java.io.File r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0015
            X.AnonymousClass1XI.A0N(r0)
        L_0x0015:
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.C18450wi.A06(r1, r0)
            java.io.File r1 = super.A00(r0)
            java.lang.String r0 = X.AnonymousClass1N0.A0G
            java.io.File r16 = r2.A00(r0)
            r9 = 0
            if (r1 == 0) goto L_0x00cc
            if (r16 == 0) goto L_0x00cc
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException | IOException -> 0x00d2 }
            r0 = r18
            r7.<init>(r0)     // Catch:{ FileNotFoundException | IOException -> 0x00d2 }
            java.lang.String r15 = r1.getCanonicalPath()     // Catch:{ all -> 0x00c5 }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r8]     // Catch:{ all -> 0x00c5 }
            r13 = 0
        L_0x003b:
            java.util.zip.ZipEntry r3 = r7.getNextEntry()     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00c0
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = X.AnonymousClass1XI.A08(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = "json"
            boolean r0 = X.C18450wi.A0R(r1, r0)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00b2
            r2 = r15
            java.lang.String r1 = r3.getName()     // Catch:{ all -> 0x00c5 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00c5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00c5 }
        L_0x005f:
            java.io.File r2 = X.AnonymousClass1XI.A05(r2, r0)     // Catch:{ all -> 0x00c5 }
            if (r2 == 0) goto L_0x00ae
            java.io.File r1 = r2.getParentFile()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0074
            boolean r0 = r1.exists()     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x0074
            r1.mkdirs()     // Catch:{ all -> 0x00c5 }
        L_0x0074:
            r11 = 0
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x009d }
            r10.<init>(r2)     // Catch:{ FileNotFoundException -> 0x009d }
        L_0x007b:
            int r1 = r7.read(r5)     // Catch:{ all -> 0x0096 }
            r0 = -1
            if (r1 == r0) goto L_0x0092
            r10.write(r5, r9, r1)     // Catch:{ all -> 0x0096 }
            long r0 = (long) r1     // Catch:{ all -> 0x0096 }
            long r11 = r11 + r0
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 + r11
            r1 = 10485760(0xa00000, double:5.180654E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            goto L_0x007b
        L_0x0092:
            r10.close()     // Catch:{ FileNotFoundException -> 0x009d }
            goto L_0x00a3
        L_0x0096:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            X.C41191vO.A00(r10, r1)     // Catch:{ FileNotFoundException -> 0x009d }
            throw r0     // Catch:{ FileNotFoundException -> 0x009d }
        L_0x009d:
            r1 = move-exception
            java.lang.String r0 = "CommerceBloksAssetZipEntrySaver/saveFile"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00c5 }
        L_0x00a3:
            long r13 = r13 + r11
            long r3 = (long) r8     // Catch:{ all -> 0x00c5 }
            long r3 = r3 + r13
            r1 = 15728640(0xf00000, double:7.7709807E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            goto L_0x00bb
        L_0x00ae:
            r3.getName()     // Catch:{ all -> 0x00c5 }
            goto L_0x003b
        L_0x00b2:
            java.lang.String r2 = r16.getCanonicalPath()     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x00c5 }
            goto L_0x005f
        L_0x00bb:
            java.lang.String r0 = "CommerceBloksAssetZipEntrySaver/saveInputStream: File being unzipped is too big."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00c5 }
        L_0x00c0:
            r7.close()     // Catch:{ FileNotFoundException | IOException -> 0x00d2 }
            r0 = 1
            return r0
        L_0x00c5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            X.C41191vO.A00(r7, r1)     // Catch:{ FileNotFoundException | IOException -> 0x00d2 }
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x00d2 }
        L_0x00cc:
            java.lang.String r0 = "CommerceBloksAssetDownloader/storeAssets:: Could not prepare resource directory"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00d6
        L_0x00d2:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
        L_0x00d6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19960zH.A07(java.io.InputStream, java.lang.Object):boolean");
    }

    public final String A0A(String str) {
        File[] listFiles;
        File A002 = A00(C18450wi.A06("commerce_flow_", str));
        if (A002 == null || (listFiles = A002.listFiles()) == null) {
            return null;
        }
        int i2 = 0;
        int length = listFiles.length;
        while (i2 < length) {
            File file = listFiles[i2];
            i2++;
            if (C18450wi.A0R(AnonymousClass1XI.A08(file.getAbsolutePath()), "json")) {
                try {
                    byte[] A003 = C29301aP.A00(file);
                    C18450wi.A0B(A003);
                    return new String(A003, AnonymousClass4BJ.A05);
                } catch (IOException e2) {
                    Log.e("CommerceBloksAssetDownloader/readFile/ioerror", e2);
                    return null;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final void A0B(C440622p r7, String str, String str2) {
        C18450wi.A0H(str2, 1);
        this.A00 = str2;
        this.A01 = str;
        super.A03(r7, (C108005Mh) null, (Object) null, str, (String) null);
    }
}
