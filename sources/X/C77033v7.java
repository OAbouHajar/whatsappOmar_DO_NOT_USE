package X;

import java.io.File;

/* renamed from: X.3v7  reason: invalid class name and case insensitive filesystem */
public class C77033v7 extends C88924bJ {
    public final File A00;

    public C77033v7(File file, int i2) {
        super(i2, file.length());
        this.A00 = file;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.io.OutputStream r3) {
        /*
            r2 = this;
            super.A00(r3)
            java.io.File r0 = r2.A00     // Catch:{ IOException -> 0x0019 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0019 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0019 }
            X.AnonymousClass1XI.A0H(r1, r3)     // Catch:{ all -> 0x0014 }
            r3.flush()     // Catch:{ all -> 0x0014 }
            r1.close()     // Catch:{ IOException -> 0x0019 }
            return
        L_0x0014:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0018 }
        L_0x0018:
            throw r0     // Catch:{ IOException -> 0x0019 }
        L_0x0019:
            r1 = move-exception
            java.lang.String r0 = "fpm/FpmMessageWithFile//writing file failed"
            com.whatsapp.util.Log.w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77033v7.A00(java.io.OutputStream):void");
    }
}
