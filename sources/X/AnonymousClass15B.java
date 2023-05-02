package X;

/* renamed from: X.15B  reason: invalid class name */
public class AnonymousClass15B {
    public final C16440t3 A00;
    public final C16920ts A01;
    public final C15810rt A02;
    public final C17620vN A03;
    public final C16900tq A04;

    public AnonymousClass15B(C16440t3 r1, C16920ts r2, C15810rt r3, C17620vN r4, C16900tq r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0067 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0067=Splitter:B:16:0x0067, B:8:0x004e=Splitter:B:8:0x004e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C15830rv r10, long r11) {
        /*
            r9 = this;
            long r7 = android.os.SystemClock.uptimeMillis()
            X.0tq r0 = r9.A04
            X.0tf r3 = r0.get()
            X.0tg r6 = r3.A02     // Catch:{ all -> 0x0068 }
            java.lang.String r5 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0068 }
            X.0ts r0 = r9.A01     // Catch:{ all -> 0x0068 }
            long r0 = r0.A02(r10)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0068 }
            r4 = 0
            r2[r4] = r0     // Catch:{ all -> 0x0068 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0068 }
            r2[r1] = r0     // Catch:{ all -> 0x0068 }
            android.database.Cursor r2 = r6.A08(r5, r2)     // Catch:{ all -> 0x0068 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0061 }
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x0061 }
            goto L_0x004e
        L_0x003a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r1.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "msgstore/getnewercount/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x0061 }
            r1.append(r10)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0061 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0061 }
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x0068 }
            r3.close()
            X.0vN r3 = r9.A03
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r7
            java.lang.String r0 = "SortIdStore/getMessagesNewerThanCount"
            r3.A00(r0, r1)
            return r4
        L_0x0061:
            r0 = move-exception
            if (r2 == 0) goto L_0x0067
            r2.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15B.A00(X.0rv, long):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0057 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0057=Splitter:B:16:0x0057, B:8:0x004a=Splitter:B:8:0x004a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.C15830rv r8, long r9) {
        /*
            r7 = this;
            X.0tq r0 = r7.A04
            X.0tf r4 = r0.get()
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND (message_type = '10') AND sort_id > ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0058 }
            X.0ts r0 = r7.A01     // Catch:{ all -> 0x0058 }
            long r0 = r0.A02(r8)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0058 }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x0058 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0058 }
            r2[r1] = r0     // Catch:{ all -> 0x0058 }
            android.database.Cursor r2 = r6.A08(r5, r2)     // Catch:{ all -> 0x0058 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0051 }
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x0051 }
            goto L_0x004a
        L_0x0036:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r1.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "msgstore/getnewercount/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x0051 }
            r1.append(r8)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0051 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0051 }
        L_0x004a:
            r2.close()     // Catch:{ all -> 0x0058 }
            r4.close()
            return r3
        L_0x0051:
            r0 = move-exception
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15B.A01(X.0rv, long):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0049=Splitter:B:15:0x0049, B:7:0x003c=Splitter:B:7:0x003c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.C15830rv r6, long r7, long r9) {
        /*
            r5 = this;
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]
            X.0ts r0 = r5.A01
            long r0 = r0.A02(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3 = 0
            r4[r3] = r0
            java.lang.String r1 = java.lang.Long.toString(r7)
            r0 = 1
            r4[r0] = r1
            java.lang.String r1 = java.lang.Long.toString(r9)
            r0 = 2
            r4[r0] = r1
            X.0tq r0 = r5.A04
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND sort_id > ? AND sort_id <= ?"
            android.database.Cursor r1 = r1.A08(r0, r4)     // Catch:{ all -> 0x004a }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0043 }
            int r3 = r1.getInt(r0)     // Catch:{ all -> 0x0043 }
        L_0x003c:
            r1.close()     // Catch:{ all -> 0x004a }
            r2.close()
            return r3
        L_0x0043:
            r0 = move-exception
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15B.A02(X.0rv, long, long):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0039=Splitter:B:16:0x0039, B:8:0x002c=Splitter:B:8:0x002c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A03(long r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r0 = 0
            r2[r0] = r1
            X.0tq r0 = r4.A04
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "SELECT sort_id FROM message_view WHERE _id = ?"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x003a }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "sort_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0033 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x002c
        L_0x002a:
            r0 = -9223372036854775808
        L_0x002c:
            r2.close()     // Catch:{ all -> 0x003a }
            r3.close()
            return r0
        L_0x0033:
            r0 = move-exception
            if (r2 == 0) goto L_0x0039
            r2.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15B.A03(long):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0039=Splitter:B:16:0x0039, B:8:0x002c=Splitter:B:8:0x002c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A04(long r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A04
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "SELECT sort_id FROM available_message_view WHERE timestamp <= ? ORDER BY sort_id DESC LIMIT 1"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x003a }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x003a }
            r2[r1] = r0     // Catch:{ all -> 0x003a }
            android.database.Cursor r2 = r4.A08(r3, r2)     // Catch:{ all -> 0x003a }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "sort_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0033 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x002c
        L_0x002a:
            r0 = 0
        L_0x002c:
            r2.close()     // Catch:{ all -> 0x003a }
            r5.close()
            return r0
        L_0x0033:
            r0 = move-exception
            if (r2 == 0) goto L_0x0039
            r2.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15B.A04(long):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0032=Splitter:B:8:0x0032, B:16:0x003f=Splitter:B:16:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05(X.C15830rv r5) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r0 = r4.A01
            long r0 = r0.A02(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r2[r0] = r1
            X.0tq r0 = r4.A04
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? ORDER BY sort_id DESC LIMIT 1"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x0040 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "sort_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0039 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x0032
        L_0x0030:
            r0 = -9223372036854775808
        L_0x0032:
            r2.close()     // Catch:{ all -> 0x0040 }
            r3.close()
            return r0
        L_0x0039:
            r0 = move-exception
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15B.A05(X.0rv):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C15830rv r6, long r7) {
        /*
            r5 = this;
            X.AnonymousClass00B.A06(r6)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            X.0ts r0 = r5.A01
            long r0 = r0.A02(r6)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r3[r0] = r1
            X.0tq r0 = r5.A04
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x0064 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "sort_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005d }
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x005d }
            r1.close()     // Catch:{ all -> 0x0064 }
            r2.close()
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x005c
            goto L_0x005b
        L_0x0044:
            r1.close()     // Catch:{ all -> 0x0064 }
            r2.close()
            java.lang.String r1 = "SortIdStore/ getFirstSortId can't get value for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x005b:
            r0 = 0
        L_0x005c:
            return r0
        L_0x005d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0063
            r1.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0068 }
        L_0x0068:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15B.A06(X.0rv, long):boolean");
    }
}
