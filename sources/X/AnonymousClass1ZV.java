package X;

import java.util.concurrent.Callable;

/* renamed from: X.1ZV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1ZV implements Callable {
    public final /* synthetic */ C16040sK A00;

    public /* synthetic */ AnonymousClass1ZV(C16040sK r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r6 = this;
            X.0sK r4 = r6.A00
            java.lang.String r5 = "me"
            java.lang.String r0 = "MeManager/loadMe"
            X.C004201v.A01(r0)     // Catch:{ all -> 0x006b }
            X.1ZU r3 = r4.A08     // Catch:{ all -> 0x006b }
            r3.A03()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "memanager/load-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x006b }
            X.0tz r0 = r4.A09     // Catch:{ all -> 0x006b }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x006b }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ all -> 0x006b }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006b }
            r0.<init>(r1, r5)     // Catch:{ all -> 0x006b }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x005d
            java.io.FileInputStream r2 = r2.openFileInput(r5)     // Catch:{ ClassNotFoundException -> 0x0057, IOException -> 0x0050 }
            X.1ZZ r1 = new X.1ZZ     // Catch:{ all -> 0x0049 }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r1.readObject()     // Catch:{ all -> 0x0044 }
            com.obwhatsapp.Me r0 = (com.obwhatsapp.Me) r0     // Catch:{ all -> 0x0044 }
            r4.A0D(r0)     // Catch:{ all -> 0x0044 }
            r3.A01()     // Catch:{ all -> 0x0044 }
            r1.close()     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ ClassNotFoundException -> 0x0057, IOException -> 0x0050 }
            goto L_0x005d
        L_0x0044:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ ClassNotFoundException -> 0x0057, IOException -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "memanager/read_me/io_error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x006b }
            goto L_0x005d
        L_0x0057:
            r1 = move-exception
            java.lang.String r0 = "memanager/read_me/serialization_error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x006b }
        L_0x005d:
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x0066
            r3.A02()
        L_0x0066:
            X.C004201v.A00()
            r0 = 0
            return r0
        L_0x006b:
            r2 = move-exception
            X.1ZU r1 = r4.A08
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0077
            r1.A02()
        L_0x0077:
            X.C004201v.A00()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZV.call():java.lang.Object");
    }
}
