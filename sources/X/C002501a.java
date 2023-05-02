package X;

/* renamed from: X.01a  reason: invalid class name and case insensitive filesystem */
public class C002501a {
    public final AnonymousClass0y0 A00;
    public final C16900tq A01;

    public C002501a(AnonymousClass0y0 r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0037 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0026=Splitter:B:10:0x0026, B:15:0x002e=Splitter:B:15:0x002e} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0037=Splitter:B:23:0x0037, B:17:0x002f=Splitter:B:17:0x002f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 1
            X.0tq r0 = r6.A01     // Catch:{ SQLiteDiskIOException -> 0x0038 }
            X.0tf r4 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x0038 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "SELECT ref_count FROM media_refs WHERE path = ?"
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x0033 }
            r2 = 0
            r0[r2] = r7     // Catch:{ all -> 0x0033 }
            android.database.Cursor r1 = r3.A08(r1, r0)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002f
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "ref_count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002a }
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x002a }
        L_0x0026:
            r1.close()     // Catch:{ all -> 0x0033 }
            goto L_0x002f
        L_0x002a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r4.close()     // Catch:{ SQLiteDiskIOException -> 0x0038 }
            return r2
        L_0x0033:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            X.0y0 r0 = r6.A00
            r0.A00(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002501a.A00(java.lang.String):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(java.lang.String r10, int r11) {
        /*
            r9 = this;
            r8 = 0
            r7 = 1
            r0 = 0
            if (r11 < 0) goto L_0x0006
            r0 = 1
        L_0x0006:
            X.AnonymousClass00B.A0G(r0)
            X.0tq r0 = r9.A01
            X.0tf r3 = r0.A02()
            X.1cj r6 = r3.A00()     // Catch:{ all -> 0x0052 }
            int r4 = r9.A00(r10)     // Catch:{ all -> 0x004d }
            if (r4 > r11) goto L_0x0027
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "media_refs"
            java.lang.String r1 = "path = ?"
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x004d }
            r0[r8] = r10     // Catch:{ all -> 0x004d }
            r5.A01(r2, r1, r0)     // Catch:{ all -> 0x004d }
            goto L_0x0042
        L_0x0027:
            X.0tg r1 = r3.A02()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?"
            X.1ou r2 = r1.A0A(r0)     // Catch:{ all -> 0x004d }
            int r0 = -r11
            long r0 = (long) r0     // Catch:{ all -> 0x004d }
            r2.A01(r7, r0)     // Catch:{ all -> 0x004d }
            r0 = 2
            r2.A02(r0, r10)     // Catch:{ all -> 0x004d }
            int r0 = r2.A00()     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0042
            r4 = -1
            goto L_0x0043
        L_0x0042:
            int r4 = r4 - r11
        L_0x0043:
            r6.A00()     // Catch:{ all -> 0x004d }
            r6.close()     // Catch:{ all -> 0x0052 }
            r3.close()
            return r4
        L_0x004d:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002501a.A01(java.lang.String, int):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r7, int r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x005a
            r5 = 1
            r0 = 0
            if (r8 <= 0) goto L_0x0007
            r0 = 1
        L_0x0007:
            X.AnonymousClass00B.A0G(r0)
            X.0tq r0 = r6.A01
            X.0tf r3 = r0.A02()
            X.1cj r4 = r3.A00()     // Catch:{ all -> 0x0055 }
            X.0tg r1 = r3.A02()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "UPDATE media_refs SET ref_count = ref_count + ? WHERE path = ?"
            X.1ou r2 = r1.A0A(r0)     // Catch:{ all -> 0x0050 }
            long r0 = (long) r8     // Catch:{ all -> 0x0050 }
            r2.A01(r5, r0)     // Catch:{ all -> 0x0050 }
            r0 = 2
            r2.A02(r0, r7)     // Catch:{ all -> 0x0050 }
            int r0 = r2.A00()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0046
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0050 }
            r2.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "path"
            r2.put(r0, r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "ref_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0050 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0050 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "media_refs"
            r1.A02(r2, r0)     // Catch:{ all -> 0x0050 }
        L_0x0046:
            r4.A00()     // Catch:{ all -> 0x0050 }
            r4.close()     // Catch:{ all -> 0x0055 }
            r3.close()
            return
        L_0x0050:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002501a.A02(java.lang.String, int):void");
    }
}
