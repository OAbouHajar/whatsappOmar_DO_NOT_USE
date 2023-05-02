package X;

import java.util.HashSet;

/* renamed from: X.27q  reason: invalid class name and case insensitive filesystem */
public class C452427q {
    public HashSet A00;
    public final C16980tz A01;

    public C452427q(C16980tz r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashSet A00() {
        /*
            r3 = this;
            java.util.HashSet r0 = r3.A00
            if (r0 != 0) goto L_0x0051
            X.0tz r0 = r3.A01
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r0 = "invalid_numbers"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0046
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L_0x0046
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0042 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0042 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ all -> 0x003d }
            r1.<init>(r2)     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r1.readObject()     // Catch:{ all -> 0x0038 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0038 }
            r3.A00 = r0     // Catch:{ all -> 0x0038 }
            r1.close()     // Catch:{ all -> 0x003d }
            r2.close()     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0042 }
            goto L_0x0046
        L_0x0038:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ IOException | ClassNotFoundException | IllegalArgumentException -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0046:
            java.util.HashSet r0 = r3.A00
            if (r0 != 0) goto L_0x0051
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A00 = r0
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452427q.A00():java.util.HashSet");
    }
}
