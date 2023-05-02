package X;

import android.graphics.Bitmap;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;

/* renamed from: X.0gu  reason: invalid class name and case insensitive filesystem */
public class C10300gu implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ String A02;

    public C10300gu(Bitmap bitmap, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = bitmap;
        this.A02 = str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            android.graphics.Bitmap r5 = r6.A00
            java.lang.String r3 = r6.A02
            java.lang.String r4 = "ShortcutInfoCompatSaver"
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0056
            java.io.File r0 = new java.io.File     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x0040 }
            r0.<init>(r3)     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x0040 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x0040 }
            r2.<init>(r0)     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x0040 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x003b }
            r0 = 100
            boolean r0 = r5.compress(r1, r0, r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0024
            r2.close()     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x0040 }
            return
        L_0x0024:
            java.lang.String r0 = "Unable to compress bitmap"
            android.util.Log.wtf(r4, r0)     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x003b }
            java.lang.String r0 = "Unable to compress bitmap for saving "
            r1.append(r0)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ all -> 0x003b }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x0040 }
        L_0x0040:
            r2 = move-exception
            java.lang.String r0 = "Unable to write bitmap to file"
            android.util.Log.wtf(r4, r0, r2)
            java.lang.String r0 = "Unable to write bitmap to file "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x0056:
            java.lang.String r0 = "path is empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10300gu.run():void");
    }
}
