package X;

import java.io.File;

/* renamed from: X.3t4  reason: invalid class name and case insensitive filesystem */
public class C75993t4 extends AnonymousClass2BE {
    public C75993t4(C16730tY r1, File file, long j2) {
        super(r1, file, j2);
    }

    public String ADk() {
        return "image/*";
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap Agi(int r6) {
        /*
            r5 = this;
            java.io.File r1 = r5.A04     // Catch:{ IOException | SecurityException -> 0x001e }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ IOException | SecurityException -> 0x001e }
            long r2 = (long) r6     // Catch:{ IOException | SecurityException -> 0x001e }
            long r2 = r2 * r2
            r0 = 2
            long r2 = r2 * r0
            android.graphics.Bitmap r0 = X.C61883Au.A01(r4, r6, r2)     // Catch:{ all -> 0x0017 }
            if (r4 == 0) goto L_0x0025
            r4.close()     // Catch:{ IOException | SecurityException -> 0x001e }
            return r0
        L_0x0017:
            r0 = move-exception
            if (r4 == 0) goto L_0x001d
            r4.close()     // Catch:{ all -> 0x001d }
        L_0x001d:
            throw r0     // Catch:{ IOException | SecurityException -> 0x001e }
        L_0x001e:
            r1 = move-exception
            java.lang.String r0 = "got exception decoding bitmap "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75993t4.Agi(int):android.graphics.Bitmap");
    }

    public int getType() {
        return 0;
    }
}
