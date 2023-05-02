package X;

/* renamed from: X.11P  reason: invalid class name */
public class AnonymousClass11P {
    public final AnonymousClass19K A00;

    public AnonymousClass11P(AnonymousClass19K r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[Catch:{ all -> 0x002c, all -> 0x0030, all -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long A00(java.lang.String r6) {
        /*
            r5 = this;
            X.19K r0 = r5.A00
            X.0tf r3 = r0.get()
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x003b }
            java.lang.String r2 = "SELECT * FROM collection_versions WHERE collection_name = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x003b }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x003b }
            android.database.Cursor r2 = r4.A08(r2, r1)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0031
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "version"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002c }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x002c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ all -> 0x003b }
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ all -> 0x003b }
        L_0x0037:
            r3.close()
            return r0
        L_0x003b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11P.A00(java.lang.String):java.lang.Long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A01() {
        /*
            r6 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.19K r0 = r6.A00
            X.0tf r4 = r0.get()
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "SELECT collection_name, version FROM collection_versions"
            r0 = 0
            android.database.Cursor r3 = r2.A08(r1, r0)     // Catch:{ all -> 0x0045 }
        L_0x0014:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "collection_name"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003e }
            java.lang.String r2 = r3.getString(r0)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "version"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003e }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x003e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x003e }
            r5.put(r2, r0)     // Catch:{ all -> 0x003e }
            goto L_0x0014
        L_0x0037:
            r3.close()     // Catch:{ all -> 0x0045 }
            r4.close()
            return r5
        L_0x003e:
            r0 = move-exception
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11P.A01():java.util.Map");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r7) {
        /*
            r6 = this;
            X.19K r0 = r6.A00
            X.0tf r5 = r0.A02()
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x0026 }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0021 }
            java.lang.String r2 = "UPDATE collection_versions SET dirty_version = -1 WHERE collection_name = ? AND dirty_version = 0"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0021 }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x0021 }
            r3.A0C(r2, r1)     // Catch:{ all -> 0x0021 }
            r4.A00()     // Catch:{ all -> 0x0021 }
            r4.close()     // Catch:{ all -> 0x0026 }
            r5.close()
            return
        L_0x0021:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11P.A02(java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r8) {
        /*
            r7 = this;
            X.19K r0 = r7.A00
            X.0tf r5 = r0.A02()
            X.1cj r6 = r5.A00()     // Catch:{ all -> 0x003a }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "INSERT OR IGNORE INTO collection_versions (collection_name, version, lt_hash, dirty_version) VALUES (?, ?, ?, ?)"
            X.1ou r4 = r1.A0A(r0)     // Catch:{ all -> 0x0035 }
            r0 = 1
            r4.A02(r0, r8)     // Catch:{ all -> 0x0035 }
            r2 = 2
            r0 = 0
            r4.A01(r2, r0)     // Catch:{ all -> 0x0035 }
            r0 = 3
            android.database.sqlite.SQLiteStatement r3 = r4.A00     // Catch:{ all -> 0x0035 }
            r3.bindNull(r0)     // Catch:{ all -> 0x0035 }
            r2 = 4
            r0 = -1
            r4.A01(r2, r0)     // Catch:{ all -> 0x0035 }
            r3.executeInsert()     // Catch:{ all -> 0x0035 }
            r6.A00()     // Catch:{ all -> 0x0035 }
            r6.close()     // Catch:{ all -> 0x003a }
            r5.close()
            return
        L_0x0035:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11P.A03(java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r8, long r9) {
        /*
            r7 = this;
            r2 = 1
            r5 = 0
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x0009
            r0 = 1
        L_0x0009:
            X.AnonymousClass00B.A0G(r0)
            X.19K r0 = r7.A00
            X.0tf r3 = r0.A02()
            X.1cj r4 = r3.A00()     // Catch:{ all -> 0x005e }
            r7.A03(r8)     // Catch:{ all -> 0x0059 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "UPDATE collection_versions SET dirty_version = ?  WHERE collection_name = ? "
            X.1ou r1 = r1.A0A(r0)     // Catch:{ all -> 0x0059 }
            r1.A01(r2, r9)     // Catch:{ all -> 0x0059 }
            r0 = 2
            r1.A02(r0, r8)     // Catch:{ all -> 0x0059 }
            android.database.sqlite.SQLiteStatement r0 = r1.A00     // Catch:{ all -> 0x0059 }
            int r0 = r0.executeUpdateDelete()     // Catch:{ all -> 0x0059 }
            long r1 = (long) r0     // Catch:{ all -> 0x0059 }
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x004f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r1.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "SyncDbStore/updateCollectionDirtyVersion failed for collection: "
            r1.append(r0)     // Catch:{ all -> 0x0059 }
            r1.append(r8)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = ", dirtyVersion: "
            r1.append(r0)     // Catch:{ all -> 0x0059 }
            r1.append(r9)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0059 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0059 }
        L_0x004f:
            r4.A00()     // Catch:{ all -> 0x0059 }
            r4.close()     // Catch:{ all -> 0x005e }
            r3.close()
            return
        L_0x0059:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11P.A04(java.lang.String, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r8, byte[] r9, long r10) {
        /*
            r7 = this;
            X.19K r0 = r7.A00
            X.0tf r2 = r0.A02()
            X.1cj r6 = r2.A00()     // Catch:{ all -> 0x0069 }
            r7.A03(r8)     // Catch:{ all -> 0x0064 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "UPDATE collection_versions SET version = ?  , lt_hash = ?  WHERE collection_name = ? "
            X.1ou r3 = r1.A0A(r0)     // Catch:{ all -> 0x0064 }
            r0 = 1
            r3.A01(r0, r10)     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0021
            r1 = 2
            android.database.sqlite.SQLiteStatement r0 = r3.A00     // Catch:{ all -> 0x0064 }
            r0.bindBlob(r1, r9)     // Catch:{ all -> 0x0064 }
        L_0x0021:
            r0 = 3
            r3.A02(r0, r8)     // Catch:{ all -> 0x0064 }
            android.database.sqlite.SQLiteStatement r0 = r3.A00     // Catch:{ all -> 0x0064 }
            int r0 = r0.executeUpdateDelete()     // Catch:{ all -> 0x0064 }
            long r0 = (long) r0     // Catch:{ all -> 0x0064 }
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x005a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "SyncDbStore/updateCollectionVersion failed for collection: "
            r1.append(r0)     // Catch:{ all -> 0x0064 }
            r1.append(r8)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = ", version: "
            r1.append(r0)     // Catch:{ all -> 0x0064 }
            r1.append(r10)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = ", ltHash: "
            r1.append(r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = java.util.Arrays.toString(r9)     // Catch:{ all -> 0x0064 }
            r1.append(r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0064 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0064 }
        L_0x005a:
            r6.A00()     // Catch:{ all -> 0x0064 }
            r6.close()     // Catch:{ all -> 0x0069 }
            r2.close()
            return
        L_0x0064:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0068 }
        L_0x0068:
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11P.A05(java.lang.String, byte[], long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r9 != null) goto L_0x003f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(java.lang.String r11) {
        /*
            r10 = this;
            X.19K r0 = r10.A00
            X.0tf r6 = r0.get()
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "SELECT * FROM collection_versions WHERE collection_name = ?"
            r5 = 1
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x0050 }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x0050 }
            android.database.Cursor r9 = r3.A08(r2, r1)     // Catch:{ all -> 0x0050 }
            r7 = 0
            if (r9 == 0) goto L_0x0039
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "version"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0034 }
            long r3 = r9.getLong(r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = "dirty_version"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0034 }
            long r1 = r9.getLong(r0)     // Catch:{ all -> 0x0034 }
            goto L_0x003f
        L_0x0034:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0039:
            r3 = 0
            r1 = 0
            if (r9 == 0) goto L_0x0042
        L_0x003f:
            r9.close()     // Catch:{ all -> 0x0050 }
        L_0x0042:
            r6.close()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004e
            return r5
        L_0x004e:
            r5 = 0
            return r5
        L_0x0050:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11P.A06(java.lang.String):boolean");
    }
}
