package X;

/* renamed from: X.0xa  reason: invalid class name and case insensitive filesystem */
public class C18990xa extends C16590tJ {
    public boolean A00;
    public final C16980tz A01;

    public C18990xa(C16980tz r1, AnonymousClass01D r2) {
        super(r2);
        this.A01 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A00
            if (r0 == r4) goto L_0x0042
            r3.A00 = r4
            X.0tz r0 = r3.A01     // Catch:{ IOException -> 0x0024 }
            android.content.Context r2 = r0.A00     // Catch:{ IOException -> 0x0024 }
            java.lang.String r1 = "login_failed"
            r0 = 0
            java.io.FileOutputStream r0 = r2.openFileOutput(r1, r0)     // Catch:{ IOException -> 0x0024 }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0024 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0024 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x001f }
            r1.writeBoolean(r0)     // Catch:{ all -> 0x001f }
            r1.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x002a
        L_0x001f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r0     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "loginmanager/failed/save login_failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x002a:
            java.lang.Iterable r0 = r3.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0032:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r1.next()
            X.0wW r0 = (X.C18330wW) r0
            r0.ATC(r4)
            goto L_0x0032
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18990xa.A04(boolean):void");
    }
}
