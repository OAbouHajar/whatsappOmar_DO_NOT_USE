package X;

/* renamed from: X.1NQ  reason: invalid class name */
public class AnonymousClass1NQ {
    public final AnonymousClass1NS A00;

    public AnonymousClass1NQ(AnonymousClass1NS r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0021=Splitter:B:8:0x0021, B:16:0x002e=Splitter:B:16:0x002e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
            r4 = this;
            X.1NS r0 = r4.A00
            X.0tf r3 = r0.A00()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM prefetched_files WHERE prefetched = 0"
            r0 = 0
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x002f }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0028 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r1.close()     // Catch:{ all -> 0x002f }
            r3.close()
            return r0
        L_0x0028:
            r0 = move-exception
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NQ.A00():int");
    }
}
