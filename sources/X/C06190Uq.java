package X;

/* renamed from: X.0Uq  reason: invalid class name and case insensitive filesystem */
public abstract class C06190Uq {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r2 == ' ') goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(java.lang.String r6) {
        /*
            java.lang.String r0 = ":memory:"
            r1 = 1
            if (r6 == 0) goto L_0x000b
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0060
        L_0x000b:
            int r5 = r6.length()
            int r5 = r5 - r1
            r4 = 0
            r3 = 0
        L_0x0012:
            if (r4 > r5) goto L_0x0032
            r0 = r5
            if (r3 != 0) goto L_0x0018
            r0 = r4
        L_0x0018:
            char r2 = r6.charAt(r0)
            r0 = 32
            if (r2 < r0) goto L_0x0023
            r1 = 0
            if (r2 != r0) goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            if (r3 != 0) goto L_0x002d
            if (r1 != 0) goto L_0x002a
            r3 = 1
            goto L_0x0012
        L_0x002a:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            int r5 = r5 + -1
            goto L_0x0012
        L_0x0032:
            int r0 = r5 + 1
            java.lang.CharSequence r0 = r6.subSequence(r4, r0)
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "deleting the database file: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r0)
            java.lang.String r2 = "SupportSQLite"
            android.util.Log.w(r2, r0)
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x005a }
            r0.<init>(r6)     // Catch:{ Exception -> 0x005a }
            android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch:{ Exception -> 0x005a }
            return
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "delete failed: "
            android.util.Log.w(r2, r0, r1)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06190Uq.A02(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r0 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r1.hasNext() != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        r0 = ((android.util.Pair) r1.next()).second;
        X.C18450wi.A0A(r0);
        A02((java.lang.String) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r0 = r1.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r0 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042 A[ExcHandler: all (r2v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v6 java.util.List) = (r0v5 java.util.List), (r0v13 java.util.List), (r0v13 java.util.List) binds: [B:3:0x0020, B:5:0x0022, B:6:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C13620mg r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Corruption reported by sqlite on database: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r4)
            java.lang.String r0 = ".path"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.e(r0, r1)
            r2 = r4
            X.0cK r2 = (X.C07700cK) r2
            android.database.sqlite.SQLiteDatabase r1 = r2.A00
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x006a
            r0 = 0
            java.util.List r0 = r2.A01     // Catch:{ SQLiteException -> 0x0022, all -> 0x0042 }
        L_0x0022:
            r4.close()     // Catch:{ IOException -> 0x0025, all -> 0x0042 }
        L_0x0025:
            if (r0 == 0) goto L_0x006a
            java.util.Iterator r1 = r0.iterator()
        L_0x002b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.C18450wi.A0A(r0)
            java.lang.String r0 = (java.lang.String) r0
            A02(r0)
            goto L_0x002b
        L_0x0042:
            r2 = move-exception
            if (r0 == 0) goto L_0x0060
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.C18450wi.A0A(r0)
            java.lang.String r0 = (java.lang.String) r0
            A02(r0)
            goto L_0x0049
        L_0x0060:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x0069
            A02(r0)
        L_0x0069:
            throw r2
        L_0x006a:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x0073
            A02(r0)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06190Uq.A03(X.0mg):void");
    }

    public abstract void A04(C13620mg r1, int i2, int i3);
}
