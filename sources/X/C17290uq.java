package X;

/* renamed from: X.0uq  reason: invalid class name and case insensitive filesystem */
public class C17290uq {
    public final C16040sK A00;
    public final C16440t3 A01;
    public final C16920ts A02;
    public final C15810rt A03;
    public final C17620vN A04;
    public final C19650ym A05;
    public final C16900tq A06;
    public final AnonymousClass15B A07;
    public final C14710pd A08;

    public C17290uq(C16040sK r1, C16440t3 r2, C16920ts r3, C15810rt r4, C17620vN r5, C19650ym r6, C16900tq r7, AnonymousClass15B r8, C14710pd r9) {
        this.A01 = r2;
        this.A08 = r9;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A07 = r8;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(long r6, long r8) {
        /*
            r5 = this;
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.Long.toString(r6)
            r4 = 0
            r2[r4] = r0
            java.lang.String r1 = java.lang.Long.toString(r8)
            r0 = 1
            r2[r0] = r1
            X.0tq r0 = r5.A06
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM available_message_view WHERE (message_type != '8') AND _id > ? AND _id <= ?"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x0055 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004e }
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r1.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "msgstore/getmessagesatid/pos:"
            r1.append(r0)     // Catch:{ all -> 0x004e }
            r1.append(r4)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004e }
        L_0x0040:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x004e }
            goto L_0x0047
        L_0x0044:
            java.lang.String r0 = "msgstore/getmessagesatid/db no messages"
            goto L_0x0040
        L_0x0047:
            r2.close()     // Catch:{ all -> 0x0055 }
            r3.close()
            return r4
        L_0x004e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17290uq.A00(long, long):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0047=Splitter:B:16:0x0047, B:8:0x003a=Splitter:B:8:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01() {
        /*
            r4 = this;
            X.0tq r0 = r4.A06
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = " SELECT _id FROM available_message_view ORDER BY sort_id DESC LIMIT 1"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0048 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0041 }
            r1.<init>()     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "msgstore/lastmsgid/count "
            r1.append(r0)     // Catch:{ all -> 0x0041 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x0041 }
            r1.append(r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0041 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0041 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0041 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x003a
        L_0x0038:
            r0 = 1
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x0048 }
            r3.close()
            return r0
        L_0x0041:
            r0 = move-exception
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17290uq.A01():long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0056 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0056=Splitter:B:16:0x0056, B:8:0x0049=Splitter:B:8:0x0049} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A02(X.C15830rv r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r0 = r4.A02
            long r0 = r0.A02(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            X.0tq r0 = r4.A06
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "   SELECT _id FROM available_message_view WHERE chat_row_id = ? ORDER BY sort_id DESC LIMIT 1"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x0057 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "msgstore/lastmsgid/count "
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x0050 }
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0050 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0050 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0050 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0049
        L_0x0047:
            r0 = 1
        L_0x0049:
            r2.close()     // Catch:{ all -> 0x0057 }
            r3.close()
            return r0
        L_0x0050:
            r0 = move-exception
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17290uq.A02(X.0rv):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0047 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0047=Splitter:B:16:0x0047, B:8:0x003a=Splitter:B:8:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A03(X.C15830rv r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r0 = r4.A02
            long r0 = r0.A02(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            r1 = 1
            int r0 = r6 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r1] = r0
            X.0tq r0 = r4.A06
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = " SELECT _id FROM available_message_view WHERE chat_row_id = ? AND message_type != 7 ORDER BY sort_id DESC LIMIT ?"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x0048 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0041 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x003a
        L_0x0038:
            r0 = 1
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x0048 }
            r3.close()
            return r0
        L_0x0041:
            r0 = move-exception
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17290uq.A03(X.0rv, int):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00ab */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0080=Splitter:B:12:0x0080, B:20:0x00ab=Splitter:B:20:0x00ab} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A04(X.C15830rv r9, int[] r10, long r11) {
        /*
            r8 = this;
            r0 = 0
            X.1Zf r5 = new X.1Zf
            r5.<init>((boolean) r0)
            java.lang.String r0 = "rowidstore/getRowIdByTimestampExcludeTypes"
            r5.A04(r0)
            java.lang.String r0 = "SELECT _id FROM available_message_view WHERE chat_row_id = ? AND "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            int r0 = r10.length
            java.lang.String r2 = " AND "
            if (r0 == 0) goto L_0x004d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.C224417y.A00(r10)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
        L_0x002b:
            r3.append(r0)
            java.lang.String r0 = "timestamp > 0"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "timestamp <= ?"
            r3.append(r0)
            java.lang.String r0 = " ORDER BY sort_id DESC LIMIT 1"
            r3.append(r0)
            java.lang.String r7 = r3.toString()
            X.0tq r0 = r8.A06
            X.0tf r4 = r0.get()
            goto L_0x0050
        L_0x004d:
            java.lang.String r0 = ""
            goto L_0x002b
        L_0x0050:
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x00ac }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00ac }
            r2 = 0
            X.0ts r0 = r8.A02     // Catch:{ all -> 0x00ac }
            long r0 = r0.A02(r9)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ac }
            r3[r2] = r0     // Catch:{ all -> 0x00ac }
            r1 = 1
            java.lang.String r0 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x00ac }
            r3[r1] = r0     // Catch:{ all -> 0x00ac }
            android.database.Cursor r1 = r6.A08(r7, r3)     // Catch:{ all -> 0x00ac }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a5 }
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x0080
        L_0x007e:
            r2 = 0
        L_0x0080:
            r1.close()     // Catch:{ all -> 0x00ac }
            r4.close()
            java.lang.String r0 = "rowidstore/getRowIdByTimestampExcludeTypes "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r4.append(r2)
            java.lang.String r0 = " | time spent:"
            r4.append(r0)
            long r0 = r5.A01()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x00a5:
            r0 = move-exception
            if (r1 == 0) goto L_0x00ab
            r1.close()     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17290uq.A04(X.0rv, int[], long):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0032 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0032=Splitter:B:15:0x0032, B:7:0x0025=Splitter:B:7:0x0025} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.C15830rv r6) {
        /*
            r5 = this;
            r4 = 1
            java.lang.String[] r3 = new java.lang.String[r4]
            X.0ts r0 = r5.A02
            long r0 = r0.A02(r6)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r3[r0] = r1
            X.0tq r0 = r5.A06
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "SELECT  1 FROM available_message_view WHERE chat_row_id = ? AND message_type != ('7') AND from_me = 1 LIMIT 1"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x0033 }
            int r0 = r1.getCount()     // Catch:{ all -> 0x002c }
            if (r0 > 0) goto L_0x0025
            r4 = 0
        L_0x0025:
            r1.close()     // Catch:{ all -> 0x0033 }
            r2.close()
            return r4
        L_0x002c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17290uq.A05(X.0rv):boolean");
    }
}
