package X;

import android.net.Uri;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.3El  reason: invalid class name and case insensitive filesystem */
public class C62663El implements AnonymousClass2G2 {
    public final Uri A00;
    public final C16980tz A01;

    public C62663El(Uri uri, C16980tz r2) {
        this.A01 = r2;
        this.A00 = uri;
    }

    public boolean A7l() {
        throw new UnsupportedOperationException("BackupStreamResource/does not support delete");
    }

    public boolean A8q() {
        return true;
    }

    public C40791uh AC6(AnonymousClass12W r3) {
        throw new UnsupportedOperationException("BackupStreamResource/does not support getExternalAtomicFileStream");
    }

    public FileInputStream ACG() {
        throw new UnsupportedOperationException("BackupStreamResource/does not support getFileInputStream");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String ACX(java.security.MessageDigest r12, long r13) {
        /*
            r11 = this;
            java.io.InputStream r6 = r11.ACp()
            r12.reset()     // Catch:{ all -> 0x0041 }
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r10]     // Catch:{ all -> 0x0041 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0041 }
            r7.<init>(r6)     // Catch:{ all -> 0x0041 }
            r8 = 0
            r4 = 0
            r3 = 0
        L_0x0014:
            r0 = -1
            if (r3 == r0) goto L_0x002d
            int r3 = r7.read(r9, r8, r10)     // Catch:{ all -> 0x003c }
            if (r3 <= 0) goto L_0x0014
            long r1 = (long) r3     // Catch:{ all -> 0x003c }
            long r1 = r1 + r4
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0028
            r12.update(r9, r8, r3)     // Catch:{ all -> 0x003c }
            r4 = r1
            goto L_0x0014
        L_0x0028:
            long r13 = r13 - r4
            int r0 = (int) r13     // Catch:{ all -> 0x003c }
            r12.update(r9, r8, r0)     // Catch:{ all -> 0x003c }
        L_0x002d:
            byte[] r0 = r12.digest()     // Catch:{ all -> 0x003c }
            java.lang.String r0 = X.C004101u.A05(r0)     // Catch:{ all -> 0x003c }
            r7.close()     // Catch:{ all -> 0x0041 }
            r6.close()
            return r0
        L_0x003c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62663El.ACX(java.security.MessageDigest, long):java.lang.String");
    }

    public InputStream ACp() {
        InputStream openInputStream = this.A01.A00.getContentResolver().openInputStream(this.A00);
        if (openInputStream != null) {
            return openInputStream;
        }
        throw new IOException("BackupStreamResource/cannot get input stream");
    }

    public OutputStream AEA() {
        OutputStream openOutputStream = this.A01.A00.getContentResolver().openOutputStream(this.A00);
        if (openOutputStream != null) {
            return openOutputStream;
        }
        throw new IOException("BackupStreamResource/cannot get output stream");
    }

    public long AK4() {
        throw C13680ns.A0m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long AK8() {
        /*
            r6 = this;
            X.0tz r0 = r6.A01
            android.content.Context r0 = r0.A00
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = r6.A00
            r2 = 0
            r4 = r2
            r5 = r2
            r3 = r2
            android.database.Cursor r2 = r0.query(r1, r2, r3, r4, r5)
            if (r2 == 0) goto L_0x0025
            java.lang.String r0 = "_size"
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0032 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002a
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x002e
        L_0x0025:
            java.lang.String r0 = "BackupStreamResource/uri-length/fail"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0032 }
        L_0x002a:
            r0 = -1
            if (r2 == 0) goto L_0x0031
        L_0x002e:
            r2.close()
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62663El.AK8():long");
    }
}
