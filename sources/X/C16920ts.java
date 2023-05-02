package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0ts  reason: invalid class name and case insensitive filesystem */
public class C16920ts {
    public final C16300so A00;
    public final C15810rt A01;
    public final C216314v A02;
    public final C19650ym A03;
    public final C16900tq A04;
    public final AnonymousClass11I A05;
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();

    public C16920ts(C16300so r2, C15810rt r3, C216314v r4, C19650ym r5, C16900tq r6, AnonymousClass11I r7) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
    }

    public int A00(ContentValues contentValues, C15830rv r11) {
        C16800tf A022 = this.A04.A02();
        try {
            contentValues.put("hidden", 0);
            long A012 = this.A02.A01(r11);
            int A002 = A022.A02.A00("chat", contentValues, "jid_row_id = ?", new String[]{String.valueOf(A012)});
            A022.close();
            return A002;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public long A01(ContentValues contentValues) {
        C16800tf A022 = this.A04.A02();
        try {
            contentValues.put("hidden", 0);
            long A023 = A022.A02.A02(contentValues, "chat");
            A022.close();
            return A023;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1 = java.lang.Long.valueOf(r3);
        r5.put(r7, r1);
        r6.A07.put(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r3 = A03(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r3 == -1) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A02(X.C15830rv r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r5 = r6.A06     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r5.get(r7)     // Catch:{ all -> 0x002f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0011
            long r3 = r0.longValue()     // Catch:{ all -> 0x002f }
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            return r3
        L_0x0011:
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            long r3 = r6.A03(r7)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            monitor-enter(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x002b }
            r5.put(r7, r1)     // Catch:{ all -> 0x002b }
            java.util.Map r0 = r6.A07     // Catch:{ all -> 0x002b }
            r0.put(r1, r7)     // Catch:{ all -> 0x002b }
            monitor-exit(r6)     // Catch:{ all -> 0x002b }
            return r3
        L_0x002b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002b }
            throw r0
        L_0x002e:
            return r3
        L_0x002f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A02(X.0rv):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 > 0) goto L_0x0012;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x005c=Splitter:B:17:0x005c, B:29:0x008c=Splitter:B:29:0x008c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A03(X.C15830rv r14) {
        /*
            r13 = this;
            X.0rt r0 = r13.A01
            X.0rx r0 = r0.A06(r14)
            r11 = 0
            java.lang.String r4 = "; rowId="
            if (r0 == 0) goto L_0x0013
            long r1 = r0.A0U
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0013
        L_0x0012:
            return r1
        L_0x0013:
            X.14v r0 = r13.A02
            long r2 = r0.A01(r14)
            r9 = -1
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            java.lang.String r1 = "ChatStore/getRowIdForChat/invalid jidRowId="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r9
        L_0x0031:
            X.0tq r0 = r13.A04
            X.0tf r5 = r0.get()
            X.0tg r8 = r5.A02     // Catch:{ all -> 0x008d }
            java.lang.String r7 = "SELECT _id FROM chat WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x008d }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x008d }
            r6[r1] = r0     // Catch:{ all -> 0x008d }
            android.database.Cursor r3 = r8.A08(r7, r6)     // Catch:{ all -> 0x008d }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0086 }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x0086 }
            goto L_0x005c
        L_0x005a:
            r1 = -1
        L_0x005c:
            r3.close()     // Catch:{ all -> 0x008d }
            r5.close()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0012
            long r1 = r13.A04(r14)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            java.lang.String r3 = "ChatStore/getRowIdForChat/error inserting a hidden chat; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r14)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r1
        L_0x0086:
            r0 = move-exception
            if (r3 == 0) goto L_0x008c
            r3.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            throw r0     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A03(X.0rv):long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A04(X.C15830rv r9) {
        /*
            r8 = this;
            X.14v r0 = r8.A02
            long r6 = r0.A01(r9)
            r4 = -1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            java.lang.String r1 = "ChatStore/insertHiddenChat/jid row id not found; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r4
        L_0x001e:
            r2 = 1
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.String r0 = "jid_row_id"
            r3.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = "hidden"
            r3.put(r0, r1)
            X.0tq r0 = r8.A04     // Catch:{ SQLiteConstraintException -> 0x004d }
            X.0tf r2 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x004d }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "chat"
            long r0 = r1.A03(r3, r0)     // Catch:{ all -> 0x0048 }
            r2.close()     // Catch:{ SQLiteConstraintException -> 0x004d }
            return r0
        L_0x0048:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x004d }
        L_0x004d:
            r2 = move-exception
            java.lang.String r1 = "ChatStore/insertHiddenChat/row already exists but can't be read; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A04(X.0rv):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r4 = r9.A04.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r4.A02.A08("SELECT jid_row_id FROM chat WHERE _id = ?", new java.lang.String[]{java.lang.Long.toString(r10)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3.moveToLast() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r8 = X.C15830rv.A00(r9.A02.A03(r3.getLong(r3.getColumnIndexOrThrow("jid_row_id"))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r8 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.put(r5, r8);
        r9.A06.put(r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r3 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x006c=Splitter:B:35:0x006c, B:27:0x005f=Splitter:B:27:0x005f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C15830rv A05(long r10) {
        /*
            r9 = this;
            r8 = 0
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            monitor-enter(r9)
            java.util.Map r6 = r9.A07     // Catch:{ all -> 0x0072 }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0072 }
            boolean r0 = r6.containsKey(r5)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x0072 }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r9)     // Catch:{ all -> 0x0072 }
            return r0
        L_0x001c:
            monitor-exit(r9)     // Catch:{ all -> 0x0072 }
            X.0tq r0 = r9.A04
            X.0tf r4 = r0.get()
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "SELECT jid_row_id FROM chat WHERE _id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006d }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x006d }
            r2[r1] = r0     // Catch:{ all -> 0x006d }
            android.database.Cursor r3 = r7.A08(r3, r2)     // Catch:{ all -> 0x006d }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x005f
            X.14v r2 = r9.A02     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "jid_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x0066 }
            com.whatsapp.jid.Jid r0 = r2.A03(r0)     // Catch:{ all -> 0x0066 }
            X.0rv r8 = X.C15830rv.A00(r0)     // Catch:{ all -> 0x0066 }
            if (r8 == 0) goto L_0x005f
            monitor-enter(r9)     // Catch:{ all -> 0x0066 }
            r6.put(r5, r8)     // Catch:{ all -> 0x005c }
            java.util.Map r0 = r9.A06     // Catch:{ all -> 0x005c }
            r0.put(r8, r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            goto L_0x005f
        L_0x005c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005f:
            r3.close()     // Catch:{ all -> 0x006d }
            r4.close()
            return r8
        L_0x0066:
            r0 = move-exception
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0071 }
        L_0x0071:
            throw r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0072 }
            throw r0
        L_0x0075:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A05(long):X.0rv");
    }

    public C15830rv A06(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("chat_row_id");
        if (columnIndex >= 0) {
            return A05(cursor.getLong(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("key_remote_jid");
        if (columnIndex2 >= 0) {
            return C15830rv.A02(cursor.getString(columnIndex2));
        }
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A07(int r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A04
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = "SELECT _id FROM chat WHERE group_type = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0047 }
            r1 = 0
            java.lang.String r0 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0047 }
            r2[r1] = r0     // Catch:{ all -> 0x0047 }
            android.database.Cursor r4 = r4.A08(r3, r2)     // Catch:{ all -> 0x0047 }
            int r0 = r4.getCount()     // Catch:{ all -> 0x0040 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0040 }
            r3.<init>(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "_id"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0040 }
        L_0x0027:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0039
            long r0 = r4.getLong(r2)     // Catch:{ all -> 0x0040 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0040 }
            r3.add(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0027
        L_0x0039:
            r4.close()     // Catch:{ all -> 0x0047 }
            r5.close()
            return r3
        L_0x0040:
            r0 = move-exception
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A07(int):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0334 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0339 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A08() {
        /*
            r55 = this;
            java.lang.String r1 = "ChatsStore/getChats"
            X.1Zf r54 = new X.1Zf
            r0 = r54
            r0.<init>((java.lang.String) r1)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r53 = r55
            r0 = r53
            X.0tq r0 = r0.A04     // Catch:{ all -> 0x033a }
            X.0tf r52 = r0.get()     // Catch:{ all -> 0x033a }
            r0 = r52
            X.0tg r2 = r0.A02     // Catch:{ all -> 0x0335 }
            java.lang.String r1 = X.C34131jk.A00     // Catch:{ all -> 0x0335 }
            r0 = 0
            android.database.Cursor r7 = r2.A08(r1, r0)     // Catch:{ all -> 0x0335 }
            java.lang.String r0 = "_id"
            int r51 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "raw_string_jid"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "display_message_row_id"
            int r50 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "display_message_sort_id"
            int r49 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_read_message_row_id"
            int r48 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_read_message_sort_id"
            int r47 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_read_receipt_sent_message_row_id"
            int r46 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_read_receipt_sent_message_sort_id"
            int r45 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "archived"
            int r44 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "sort_timestamp"
            int r43 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "spam_detection"
            int r42 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "plaintext_disabled"
            int r41 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "vcard_ui_dismissed"
            int r40 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "change_number_notified_message_row_id"
            int r39 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "subject"
            int r38 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_message_row_id"
            int r37 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_message_sort_id"
            int r36 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_important_message_row_id"
            int r35 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "unseen_earliest_message_received_time"
            int r34 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "unseen_message_count"
            int r33 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "unseen_missed_calls_count"
            int r32 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "unseen_row_count"
            int r31 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "unseen_message_reaction_count"
            int r30 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_message_reaction_row_id"
            int r29 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "last_seen_message_reaction_row_id"
            int r28 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "deleted_message_row_id"
            int r27 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "deleted_starred_message_row_id"
            int r26 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "deleted_categories_message_row_id"
            int r25 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "deleted_categories_starred_message_row_id"
            int r24 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "deleted_message_categories"
            int r23 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "show_group_description"
            int r22 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "ephemeral_expiration"
            int r21 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "ephemeral_setting_timestamp"
            int r20 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "ephemeral_disappearing_messages_initiator"
            int r19 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "unseen_important_message_count"
            int r18 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "group_type"
            int r14 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "growth_lock_level"
            int r13 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "growth_lock_expiration_ts"
            int r12 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "has_new_community_admin_dialog_been_acknowledged"
            int r11 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "history_sync_progress"
            int r10 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "hidden"
            int r9 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x032e }
        L_0x0124:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x032e }
            if (r0 == 0) goto L_0x02d8
            java.lang.String r0 = r7.getString(r6)     // Catch:{ all -> 0x032e }
            X.0rv r5 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x032e }
            if (r5 != 0) goto L_0x014d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r1.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "msgstore-manager/initialize/chats/could not parse raw chat jid: "
            r1.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r7.getString(r6)     // Catch:{ all -> 0x032e }
            r1.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x032e }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x032e }
            goto L_0x0124
        L_0x014d:
            boolean r0 = X.C16030sJ.A0Q(r5)     // Catch:{ all -> 0x032e }
            if (r0 != 0) goto L_0x0124
            int r1 = r7.getInt(r9)     // Catch:{ all -> 0x032e }
            r0 = 1
            if (r1 == r0) goto L_0x0124
            X.0rx r4 = new X.0rx     // Catch:{ all -> 0x032e }
            r4.<init>(r5)     // Catch:{ all -> 0x032e }
            boolean r0 = r53.A0H()     // Catch:{ all -> 0x032e }
            if (r0 == 0) goto L_0x01a7
            r0 = r51
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
        L_0x016b:
            r4.A0U = r0     // Catch:{ all -> 0x032e }
            r0 = r50
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0S = r0     // Catch:{ all -> 0x032e }
            r0 = r49
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0T = r0     // Catch:{ all -> 0x032e }
            r0 = r48
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0N = r0     // Catch:{ all -> 0x032e }
            r0 = r47
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0O = r0     // Catch:{ all -> 0x032e }
            r0 = r46
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0P = r0     // Catch:{ all -> 0x032e }
            r0 = r45
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0Q = r0     // Catch:{ all -> 0x032e }
            r0 = r44
            int r1 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r0 = 1
            if (r1 == r0) goto L_0x01ab
            goto L_0x01aa
        L_0x01a7:
            r0 = -1
            goto L_0x016b
        L_0x01aa:
            r0 = 0
        L_0x01ab:
            r4.A0e = r0     // Catch:{ all -> 0x032e }
            r0 = r43
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0V = r0     // Catch:{ all -> 0x032e }
            r0 = r42
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r4.A03 = r0     // Catch:{ all -> 0x032e }
            r0 = r41
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r4.A00 = r0     // Catch:{ all -> 0x032e }
            r0 = r40
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r4.A09 = r0     // Catch:{ all -> 0x032e }
            r0 = r39
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0A = r0     // Catch:{ all -> 0x032e }
            r0 = r38
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x032e }
            r4.A0d = r0     // Catch:{ all -> 0x032e }
            r0 = r37
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0L = r0     // Catch:{ all -> 0x032e }
            r0 = r36
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0M = r0     // Catch:{ all -> 0x032e }
            r0 = r35
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0J = r0     // Catch:{ all -> 0x032e }
            r16 = 0
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x01ff
            r0 = 1
            r4.A0J = r0     // Catch:{ all -> 0x032e }
        L_0x01ff:
            r0 = r34
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0W = r0     // Catch:{ all -> 0x032e }
            r0 = r33
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r4.A06 = r0     // Catch:{ all -> 0x032e }
            r0 = r32
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r4.A07 = r0     // Catch:{ all -> 0x032e }
            r0 = r31
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r4.A08 = r0     // Catch:{ all -> 0x032e }
            r0 = r30
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r4.A05 = r0     // Catch:{ all -> 0x032e }
            r0 = r29
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            long r0 = (long) r0     // Catch:{ all -> 0x032e }
            r4.A0K = r0     // Catch:{ all -> 0x032e }
            r0 = r28
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            long r0 = (long) r0     // Catch:{ all -> 0x032e }
            r4.A0R = r0     // Catch:{ all -> 0x032e }
            r0 = r27
            long r2 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0D = r2     // Catch:{ all -> 0x032e }
            r0 = -9223372036854775808
            int r15 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x0249
            r4.A0D = r0     // Catch:{ all -> 0x032e }
        L_0x0249:
            r0 = r26
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0E = r0     // Catch:{ all -> 0x032e }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0259
            r0 = -9223372036854775808
            r4.A0E = r0     // Catch:{ all -> 0x032e }
        L_0x0259:
            r0 = r23
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x032e }
            r4.A0c = r0     // Catch:{ all -> 0x032e }
            r0 = r25
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0B = r0     // Catch:{ all -> 0x032e }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0271
            r0 = -9223372036854775808
            r4.A0B = r0     // Catch:{ all -> 0x032e }
        L_0x0271:
            r0 = r24
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            r4.A0C = r0     // Catch:{ all -> 0x032e }
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0281
            r0 = -9223372036854775808
            r4.A0C = r0     // Catch:{ all -> 0x032e }
        L_0x0281:
            r0 = r22
            int r1 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r0 = 1
            if (r1 == r0) goto L_0x028b
            r0 = 0
        L_0x028b:
            r4.A0h = r0     // Catch:{ all -> 0x032e }
            int r0 = r7.getInt(r10)     // Catch:{ all -> 0x032e }
            r4.A02 = r0     // Catch:{ all -> 0x032e }
            r0 = r19
            int r2 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r0 = r21
            int r3 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r0 = r20
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x032e }
            X.1WV r15 = new X.1WV     // Catch:{ all -> 0x032e }
            r15.<init>(r3, r0, r2)     // Catch:{ all -> 0x032e }
            r4.A0X = r15     // Catch:{ all -> 0x032e }
            r0 = r18
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x032e }
            r4.A04 = r0     // Catch:{ all -> 0x032e }
            int r1 = r7.getInt(r11)     // Catch:{ all -> 0x032e }
            r0 = 1
            if (r1 == r0) goto L_0x02bc
            r0 = 0
        L_0x02bc:
            r4.A0f = r0     // Catch:{ all -> 0x032e }
            int r0 = r7.getInt(r14)     // Catch:{ all -> 0x032e }
            r4.A01 = r0     // Catch:{ all -> 0x032e }
            int r3 = r7.getInt(r13)     // Catch:{ all -> 0x032e }
            long r0 = r7.getLong(r12)     // Catch:{ all -> 0x032e }
            X.1jl r2 = new X.1jl     // Catch:{ all -> 0x032e }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x032e }
            r4.A0a = r2     // Catch:{ all -> 0x032e }
            r8.put(r5, r4)     // Catch:{ all -> 0x032e }
            goto L_0x0124
        L_0x02d8:
            monitor-enter(r53)     // Catch:{ all -> 0x032e }
            java.util.Set r0 = r8.entrySet()     // Catch:{ all -> 0x032b }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x032b }
        L_0x02e1:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x032b }
            if (r0 == 0) goto L_0x0320
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x032b }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x032b }
            r0 = r53
            java.util.Map r2 = r0.A07     // Catch:{ all -> 0x032b }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x032b }
            X.0rx r0 = (X.C15840rx) r0     // Catch:{ all -> 0x032b }
            long r0 = r0.A0U     // Catch:{ all -> 0x032b }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x032b }
            java.lang.Object r0 = r4.getKey()     // Catch:{ all -> 0x032b }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x032b }
            r2.put(r1, r0)     // Catch:{ all -> 0x032b }
            r0 = r53
            java.util.Map r3 = r0.A06     // Catch:{ all -> 0x032b }
            java.lang.Object r2 = r4.getKey()     // Catch:{ all -> 0x032b }
            X.0rv r2 = (X.C15830rv) r2     // Catch:{ all -> 0x032b }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x032b }
            X.0rx r0 = (X.C15840rx) r0     // Catch:{ all -> 0x032b }
            long r0 = r0.A0U     // Catch:{ all -> 0x032b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x032b }
            r3.put(r2, r0)     // Catch:{ all -> 0x032b }
            goto L_0x02e1
        L_0x0320:
            monitor-exit(r53)     // Catch:{ all -> 0x032b }
            r7.close()     // Catch:{ all -> 0x0335 }
            r52.close()     // Catch:{ all -> 0x033a }
            r54.A01()
            return r8
        L_0x032b:
            r0 = move-exception
            monitor-exit(r53)     // Catch:{ all -> 0x032b }
            throw r0     // Catch:{ all -> 0x032e }
        L_0x032e:
            r0 = move-exception
            if (r7 == 0) goto L_0x0334
            r7.close()     // Catch:{ all -> 0x0334 }
        L_0x0334:
            throw r0     // Catch:{ all -> 0x0335 }
        L_0x0335:
            r0 = move-exception
            r52.close()     // Catch:{ all -> 0x0339 }
        L_0x0339:
            throw r0     // Catch:{ all -> 0x033a }
        L_0x033a:
            r0 = move-exception
            r54.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A08():java.util.Map");
    }

    public void A09(C15840rx r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues(2);
            contentValues.put("change_number_notified_message_row_id", Long.valueOf(r5.A0A));
        }
        A00(contentValues, r5.A0i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r4.A03.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C15840rx r5) {
        /*
            r4 = this;
            monitor-enter(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x002f }
            r3.<init>()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "archived"
            boolean r0 = r5.A0e     // Catch:{ all -> 0x002f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x002f }
            r3.put(r1, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            X.0rv r2 = r5.A0i     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            int r0 = r4.A00(r3, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            if (r0 != 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            java.lang.String r0 = "msgstore/archive/did not update "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0037, Error | RuntimeException -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0037:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r4.A03
            r0.A02()
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A0A(X.0rx):void");
    }

    public void A0B(C15840rx r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues();
            contentValues.put("unseen_message_reaction_count", Integer.valueOf(r5.A05));
            contentValues.put("last_message_reaction_row_id", Long.valueOf(r5.A0K));
            contentValues.put("last_seen_message_reaction_row_id", Long.valueOf(r5.A0R));
        }
        C15830rv r1 = r5.A0i;
        int A002 = A00(contentValues, r1);
        StringBuilder sb = new StringBuilder("msgstore/updateChatLastMessageReactionInfo/");
        sb.append(r1);
        sb.append("/");
        sb.append(r5.A07());
        sb.append("/");
        sb.append(A002);
        Log.i(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009c, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a1, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r6.A03.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a9, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C15840rx r7) {
        /*
            r6 = this;
            java.lang.String r4 = "/"
            monitor-enter(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            android.content.ContentValues r5 = r7.A03()     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "last_read_message_row_id"
            long r0 = r7.A0N     // Catch:{ all -> 0x0098 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "last_read_message_sort_id"
            long r0 = r7.A0O     // Catch:{ all -> 0x0098 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "last_message_row_id"
            long r0 = r7.A0L     // Catch:{ all -> 0x0098 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "last_message_sort_id"
            long r0 = r7.A0M     // Catch:{ all -> 0x0098 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "last_important_message_row_id"
            long r0 = r7.A0J     // Catch:{ all -> 0x0098 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "unseen_important_message_count"
            int r0 = r7.A04     // Catch:{ all -> 0x0098 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "unseen_message_reaction_count"
            int r0 = r7.A05     // Catch:{ all -> 0x0098 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "last_message_reaction_row_id"
            long r0 = r7.A0K     // Catch:{ all -> 0x0098 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "last_seen_message_reaction_row_id"
            long r0 = r7.A0R     // Catch:{ all -> 0x0098 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0098 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0098 }
            monitor-exit(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            X.0rv r3 = r7.A0i     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            int r2 = r6.A00(r5, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            java.lang.String r0 = "msgstore/setchatseen/"
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            r1.append(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            java.lang.String r0 = r7.A07()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            r1.append(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            return
        L_0x0098:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a0, Error | RuntimeException -> 0x009b }
        L_0x009b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x00a0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r6.A03
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A0C(X.0rx):void");
    }

    public void A0D(C15840rx r6) {
        try {
            ContentValues A032 = r6.A03();
            C15830rv r3 = r6.A0i;
            int A002 = A00(A032, r3);
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/setchatunseen/");
            sb.append(r3);
            sb.append("/");
            sb.append(r6.A07());
            sb.append("/");
            sb.append(A002);
            Log.i(sb.toString());
        } catch (SQLiteDatabaseCorruptException e2) {
            Log.e((Throwable) e2);
            this.A03.A02();
        } catch (Error | RuntimeException e3) {
            Log.e(e3);
            throw e3;
        }
    }

    public void A0E(C15840rx r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues();
            contentValues.put("ephemeral_expiration", Integer.valueOf(r5.A0X.expiration));
            contentValues.put("ephemeral_setting_timestamp", Long.valueOf(r5.A0X.ephemeralSettingTimestamp));
            contentValues.put("ephemeral_disappearing_messages_initiator", Integer.valueOf(r5.A0X.disappearingMessagesInitiator));
        }
        A00(contentValues, r5.A0i);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0053 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.C15830rv r10) {
        /*
            r9 = this;
            X.0tq r0 = r9.A04
            X.0tf r4 = r0.A02()
            X.1cj r8 = r4.A00()     // Catch:{ all -> 0x0054 }
            X.14v r0 = r9.A02     // Catch:{ all -> 0x004f }
            long r6 = r0.A01(r10)     // Catch:{ all -> 0x004f }
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "DELETE FROM chat WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x004f }
            r2[r1] = r0     // Catch:{ all -> 0x004f }
            r5.A0C(r3, r2)     // Catch:{ all -> 0x004f }
            X.0rt r1 = r9.A01     // Catch:{ all -> 0x004f }
            monitor-enter(r1)     // Catch:{ all -> 0x004f }
            if (r10 == 0) goto L_0x002d
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()     // Catch:{ all -> 0x004c }
            r0.remove(r10)     // Catch:{ all -> 0x004c }
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
            monitor-enter(r9)     // Catch:{ all -> 0x004f }
            java.util.Map r0 = r9.A06     // Catch:{ all -> 0x0049 }
            java.lang.Object r1 = r0.remove(r10)     // Catch:{ all -> 0x0049 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x003e
            java.util.Map r0 = r9.A07     // Catch:{ all -> 0x0049 }
            r0.remove(r1)     // Catch:{ all -> 0x0049 }
        L_0x003e:
            monitor-exit(r9)     // Catch:{ all -> 0x0049 }
            r8.A00()     // Catch:{ all -> 0x004f }
            r8.close()     // Catch:{ all -> 0x0054 }
            r4.close()
            return
        L_0x0049:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0049 }
            goto L_0x004e
        L_0x004c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004f }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16920ts.A0F(X.0rv):void");
    }

    public void A0G(C15830rv r5, long j2) {
        C15840rx A062 = this.A01.A06(r5);
        if (A062 != null && A062.A0R <= j2 && j2 >= 1) {
            A062.A0R = j2;
            if (A062.A0K < j2) {
                A062.A0K = j2;
            }
            A062.A05 = 0;
            A0B(A062);
        }
    }

    public boolean A0H() {
        return this.A05.A01("chat_ready", 0) == 2;
    }

    public boolean A0I(ContentValues contentValues, C15840rx r8) {
        C15830rv r1 = r8.A0i;
        if (A00(contentValues, r1) != 0) {
            return true;
        }
        contentValues.put("jid_row_id", Long.valueOf(this.A02.A01(r1)));
        long A012 = A01(contentValues);
        r8.A0U = A012;
        return A012 != -1;
    }
}
