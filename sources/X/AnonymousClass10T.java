package X;

/* renamed from: X.10T  reason: invalid class name */
public class AnonymousClass10T {
    public final C15970sD A00;

    public AnonymousClass10T(C15970sD r1) {
        this.A00 = r1;
    }

    public synchronized boolean A00(String str, String str2) {
        String string;
        string = this.A00.A01().getString(C15970sD.A00(str, "auth/token"), (String) null);
        return string == null ? false : string.equals(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A01(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
            if (r6 == 0) goto L_0x0020
            X.0sD r1 = r4.A00     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "request/token"
            java.lang.String r2 = X.C15970sD.A00(r5, r0)     // Catch:{ all -> 0x001d }
            android.content.SharedPreferences r1 = r1.A01()     // Catch:{ all -> 0x001d }
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0020
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x001d }
            monitor-exit(r4)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0020:
            monitor-exit(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10T.A01(java.lang.String, java.lang.String):boolean");
    }
}
