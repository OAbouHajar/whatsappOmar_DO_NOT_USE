package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.16w  reason: invalid class name and case insensitive filesystem */
public class C221616w {
    public final C16920ts A00;
    public final C15810rt A01;
    public final C16900tq A02;
    public final AnonymousClass15B A03;

    public C221616w(C16920ts r1, C15810rt r2, C16900tq r3, AnonymousClass15B r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0064=Splitter:B:16:0x0064, B:8:0x0057=Splitter:B:8:0x0057} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C15830rv r6) {
        /*
            r5 = this;
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            X.0ts r0 = r5.A00
            long r0 = r0.A02(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = 0
            r2[r4] = r0
            X.0tq r0 = r5.A02
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "SELECT COUNT(*) as count  FROM deleted_messages_ids_view WHERE chat_row_id = ? AND message_type != 8"
            android.database.Cursor r2 = r1.A08(r0, r2)     // Catch:{ all -> 0x0065 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005e }
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r1.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "msgstore/countmessagestodelete/count: "
            r1.append(r0)     // Catch:{ all -> 0x005e }
            r1.append(r4)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x005e }
            goto L_0x0057
        L_0x0043:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r1.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "msgstore/countmessagestodelete/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x005e }
            r1.append(r6)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x005e }
        L_0x0057:
            r2.close()     // Catch:{ all -> 0x0065 }
            r3.close()
            return r4
        L_0x005e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0064
            r2.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221616w.A00(X.0rv):int");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42561y1 A01(long r7) {
        /*
            r6 = this;
            X.0tq r0 = r6.A02
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job WHERE chat_row_id = ? ORDER BY _id DESC LIMIT 1"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0038 }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r7)     // Catch:{ all -> 0x0038 }
            r2[r1] = r0     // Catch:{ all -> 0x0038 }
            android.database.Cursor r1 = r4.A08(r3, r2)     // Catch:{ all -> 0x0038 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0029
            X.1y1 r0 = r6.A02(r1)     // Catch:{ all -> 0x0031 }
            r1.close()     // Catch:{ all -> 0x0038 }
            r5.close()
            return r0
        L_0x0029:
            r1.close()     // Catch:{ all -> 0x0038 }
            r5.close()
            r0 = 0
            return r0
        L_0x0031:
            r0 = move-exception
            if (r1 == 0) goto L_0x0037
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221616w.A01(long):X.1y1");
    }

    public final C42561y1 A02(Cursor cursor) {
        ArrayList arrayList;
        Cursor cursor2 = cursor;
        long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("chat_row_id"));
        C15830rv A05 = this.A00.A05(j2);
        if (A05 == null) {
            return null;
        }
        long j3 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_message_row_id"));
        if (j3 == 0) {
            j3 = Long.MIN_VALUE;
        }
        long j4 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_starred_message_row_id"));
        if (j4 == 0) {
            j4 = Long.MIN_VALUE;
        }
        long j5 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_categories_message_row_id"));
        if (j5 == 0) {
            j5 = Long.MIN_VALUE;
        }
        long j6 = cursor2.getLong(cursor2.getColumnIndexOrThrow("deleted_categories_starred_message_row_id"));
        if (j6 == 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id"));
        int i2 = cursor2.getInt(cursor2.getColumnIndexOrThrow("block_size"));
        boolean z2 = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("deleted_messages_remove_files")) != 0) {
            z2 = true;
        }
        boolean z3 = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("delete_files_singular_delete")) != 0) {
            z3 = true;
        }
        boolean z4 = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("deleted_categories_remove_files")) != 0) {
            z4 = true;
        }
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("deleted_message_categories"));
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("singular_message_delete_rows_id"));
        if (string2 == null || string2.isEmpty()) {
            arrayList = null;
        } else {
            String[] split = string2.replace("\"", "").split(",");
            arrayList = new ArrayList();
            for (String valueOf : split) {
                arrayList.add(Long.valueOf(valueOf));
            }
        }
        return new C42561y1(A05, string, arrayList, i2, j7, j2, j3, j4, j5, j6, z2, z3, z4);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x022f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0234 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0239 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:76:0x021e=Splitter:B:76:0x021e, B:87:0x022f=Splitter:B:87:0x022f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:80:0x0224=Splitter:B:80:0x0224, B:97:0x0239=Splitter:B:97:0x0239} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42561y1 A03(X.C15830rv r59, java.lang.Long r60, java.util.List r61, boolean r62, boolean r63, boolean r64) {
        /*
            r58 = this;
            r39 = r63
            r42 = 100
            r24 = 0
            r4 = r58
            X.0tq r7 = r4.A02
            X.0tf r21 = r7.A02()
            X.1cj r20 = r21.A00()     // Catch:{ all -> 0x023a }
            X.0ts r6 = r4.A00     // Catch:{ all -> 0x0235 }
            r5 = r59
            long r29 = r6.A02(r5)     // Catch:{ all -> 0x0235 }
            if (r60 == 0) goto L_0x0027
            long r31 = r60.longValue()     // Catch:{ all -> 0x0235 }
        L_0x0020:
            boolean r0 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x0235 }
            if (r0 == 0) goto L_0x004d
            goto L_0x003f
        L_0x0027:
            X.0rt r0 = r4.A01     // Catch:{ all -> 0x0235 }
            X.0rx r1 = r0.A06(r5)     // Catch:{ all -> 0x0235 }
            X.15B r0 = r4.A03     // Catch:{ all -> 0x0235 }
            long r2 = r0.A05(r5)     // Catch:{ all -> 0x0235 }
            if (r1 == 0) goto L_0x003c
            long r0 = r1.A0M     // Catch:{ all -> 0x0235 }
        L_0x0037:
            long r31 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0235 }
            goto L_0x0020
        L_0x003c:
            r0 = -9223372036854775808
            goto L_0x0037
        L_0x003f:
            if (r62 == 0) goto L_0x004a
            r33 = r31
        L_0x0043:
            r35 = -9223372036854775808
            r37 = -9223372036854775808
            r41 = 0
            goto L_0x005f
        L_0x004a:
            r33 = -9223372036854775808
            goto L_0x0043
        L_0x004d:
            if (r62 == 0) goto L_0x005c
            r37 = r31
        L_0x0051:
            r41 = r39
            r35 = r31
            r39 = 0
            r31 = -9223372036854775808
            r33 = -9223372036854775808
            goto L_0x005f
        L_0x005c:
            r37 = -9223372036854775808
            goto L_0x0051
        L_0x005f:
            r27 = -1
            X.1y1 r8 = new X.1y1     // Catch:{ all -> 0x0235 }
            r26 = 100
            r25 = r61
            r40 = r64
            r22 = r8
            r23 = r5
            r22.<init>(r23, r24, r25, r26, r27, r29, r31, r33, r35, r37, r39, r40, r41)     // Catch:{ all -> 0x0235 }
            java.lang.String r19 = "deleted_chat_job"
            X.0tf r18 = r7.A02()     // Catch:{ all -> 0x0235 }
            X.1cj r17 = r18.A00()     // Catch:{ all -> 0x0230 }
            long r0 = r8.A01     // Catch:{ all -> 0x022b }
            r26 = r0
            X.0rv r15 = r6.A05(r0)     // Catch:{ all -> 0x022b }
            if (r15 == 0) goto L_0x021e
            X.0rt r0 = r4.A01     // Catch:{ all -> 0x022b }
            X.0rx r10 = r0.A06(r15)     // Catch:{ all -> 0x022b }
            r0 = r26
            X.1y1 r9 = r4.A01(r0)     // Catch:{ all -> 0x022b }
            if (r9 == 0) goto L_0x00a2
            boolean r0 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x022b }
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = r9.A08     // Catch:{ all -> 0x022b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x022b }
            if (r0 != 0) goto L_0x00a2
            goto L_0x021e
        L_0x00a2:
            long r2 = r8.A04     // Catch:{ all -> 0x022b }
            long r0 = r8.A05     // Catch:{ all -> 0x022b }
            boolean r4 = r8.A0C     // Catch:{ all -> 0x022b }
            r25 = r4
            long r6 = r8.A02     // Catch:{ all -> 0x022b }
            long r4 = r8.A03     // Catch:{ all -> 0x022b }
            boolean r11 = r8.A0A     // Catch:{ all -> 0x022b }
            r23 = r11
            r22 = r24
            java.util.List r11 = r8.A09     // Catch:{ all -> 0x022b }
            r16 = r11
            if (r11 != 0) goto L_0x00bc
            r13 = 0
            goto L_0x00f4
        L_0x00bc:
            int r11 = r16.size()     // Catch:{ all -> 0x022b }
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ all -> 0x022b }
            r12 = 0
        L_0x00c3:
            int r11 = r16.size()     // Catch:{ all -> 0x022b }
            if (r12 >= r11) goto L_0x00da
            r11 = r16
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x022b }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x022b }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x022b }
            r13[r12] = r11     // Catch:{ all -> 0x022b }
            int r12 = r12 + 1
            goto L_0x00c3
        L_0x00da:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x022b }
            r12.<init>()     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "\""
            r12.append(r11)     // Catch:{ all -> 0x022b }
            java.lang.String r14 = "\",\""
            java.lang.String r13 = X.AnonymousClass1ZW.A0B(r14, r13)     // Catch:{ all -> 0x022b }
            r12.append(r13)     // Catch:{ all -> 0x022b }
            r12.append(r11)     // Catch:{ all -> 0x022b }
            java.lang.String r13 = r12.toString()     // Catch:{ all -> 0x022b }
        L_0x00f4:
            boolean r8 = r8.A0B     // Catch:{ all -> 0x022b }
            r14 = r8
            if (r9 == 0) goto L_0x012f
            boolean r8 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x022b }
            if (r8 != 0) goto L_0x0109
            java.lang.String r8 = r9.A08     // Catch:{ all -> 0x022b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x022b }
            if (r8 != 0) goto L_0x0109
            goto L_0x021e
        L_0x0109:
            java.lang.String r8 = r9.A08     // Catch:{ all -> 0x022b }
            r22 = r8
            boolean r8 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x022b }
            if (r8 != 0) goto L_0x01d6
            boolean r8 = r9.A0A     // Catch:{ all -> 0x022b }
            r23 = r8
        L_0x0117:
            long r11 = r9.A04     // Catch:{ all -> 0x022b }
            long r2 = java.lang.Math.max(r2, r11)     // Catch:{ all -> 0x022b }
            long r11 = r9.A05     // Catch:{ all -> 0x022b }
            long r0 = java.lang.Math.max(r0, r11)     // Catch:{ all -> 0x022b }
            long r11 = r9.A02     // Catch:{ all -> 0x022b }
            long r6 = java.lang.Math.max(r6, r11)     // Catch:{ all -> 0x022b }
            long r11 = r9.A03     // Catch:{ all -> 0x022b }
            long r4 = java.lang.Math.max(r4, r11)     // Catch:{ all -> 0x022b }
        L_0x012f:
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x022b }
            r12.<init>()     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "chat_row_id"
            java.lang.Long r8 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "block_size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r42)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "deleted_message_row_id"
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "deleted_starred_message_row_id"
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "deleted_messages_remove_files"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r25)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "deleted_categories_message_row_id"
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "deleted_categories_starred_message_row_id"
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "deleted_message_categories"
            r8 = r22
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "deleted_categories_remove_files"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = "delete_files_singular_delete"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x022b }
            r12.put(r11, r8)     // Catch:{ all -> 0x022b }
            java.lang.String r8 = "singular_message_delete_rows_id"
            X.C38611r4.A04(r12, r8, r13)     // Catch:{ all -> 0x022b }
            r8 = r18
            X.0tg r11 = r8.A02     // Catch:{ all -> 0x022b }
            r8 = r19
            long r43 = r11.A02(r12, r8)     // Catch:{ all -> 0x022b }
            if (r9 == 0) goto L_0x01b1
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x022b }
            long r12 = r9.A06     // Catch:{ all -> 0x022b }
            java.lang.String r12 = java.lang.Long.toString(r12)     // Catch:{ all -> 0x022b }
            r9 = 0
            r8[r9] = r12     // Catch:{ all -> 0x022b }
            java.lang.String r12 = "_id = ?"
            r9 = r19
            r11.A01(r9, r12, r8)     // Catch:{ all -> 0x022b }
        L_0x01b1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x022b }
            r9.<init>()     // Catch:{ all -> 0x022b }
            java.lang.String r8 = "msgstore/deletemsgs/mark jid:"
            r9.append(r8)     // Catch:{ all -> 0x022b }
            r9.append(r15)     // Catch:{ all -> 0x022b }
            java.lang.String r8 = " lastDeletedMessageSortId:"
            r9.append(r8)     // Catch:{ all -> 0x022b }
            r9.append(r2)     // Catch:{ all -> 0x022b }
            java.lang.String r8 = " lastDeletedStarredMessageSortId:"
            r9.append(r8)     // Catch:{ all -> 0x022b }
            r9.append(r0)     // Catch:{ all -> 0x022b }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x022b }
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ all -> 0x022b }
            goto L_0x01da
        L_0x01d6:
            r22 = r24
            goto L_0x0117
        L_0x01da:
            r11 = 0
            int r8 = (r43 > r11 ? 1 : (r43 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x01f4
            if (r10 == 0) goto L_0x01f4
            monitor-enter(r10)     // Catch:{ all -> 0x022b }
            r10.A0D = r2     // Catch:{ all -> 0x01f0 }
            r10.A0E = r0     // Catch:{ all -> 0x01f0 }
            r10.A0B = r6     // Catch:{ all -> 0x01f0 }
            r10.A0C = r4     // Catch:{ all -> 0x01f0 }
            r8 = r22
            r10.A0c = r8     // Catch:{ all -> 0x01f0 }
            goto L_0x01f3
        L_0x01f0:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x022b }
            throw r0     // Catch:{ all -> 0x022b }
        L_0x01f3:
            monitor-exit(r10)     // Catch:{ all -> 0x022b }
        L_0x01f4:
            r17.A00()     // Catch:{ all -> 0x022b }
            X.1y1 r24 = new X.1y1     // Catch:{ all -> 0x022b }
            r38 = r24
            r39 = r15
            r40 = r22
            r41 = r16
            r45 = r26
            r47 = r2
            r49 = r0
            r51 = r6
            r53 = r4
            r55 = r25
            r56 = r14
            r57 = r23
            r38.<init>(r39, r40, r41, r42, r43, r45, r47, r49, r51, r53, r55, r56, r57)     // Catch:{ all -> 0x022b }
            r17.close()     // Catch:{ all -> 0x0230 }
            r18.close()     // Catch:{ all -> 0x0235 }
            r20.A00()     // Catch:{ all -> 0x0235 }
            goto L_0x0224
        L_0x021e:
            r17.close()     // Catch:{ all -> 0x0230 }
            r18.close()     // Catch:{ all -> 0x0235 }
        L_0x0224:
            r20.close()     // Catch:{ all -> 0x023a }
            r21.close()
            return r24
        L_0x022b:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x022f }
        L_0x022f:
            throw r0     // Catch:{ all -> 0x0230 }
        L_0x0230:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0234 }
        L_0x0234:
            throw r0     // Catch:{ all -> 0x0235 }
        L_0x0235:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x0239 }
        L_0x0239:
            throw r0     // Catch:{ all -> 0x023a }
        L_0x023a:
            r0 = move-exception
            r21.close()     // Catch:{ all -> 0x023e }
        L_0x023e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221616w.A03(X.0rv, java.lang.Long, java.util.List, boolean, boolean, boolean):X.1y1");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A04() {
        /*
            r7 = this;
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.0tq r0 = r7.A02
            X.0tf r5 = r0.get()
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "SELECT DISTINCT chat_row_id FROM deleted_chat_job"
            r0 = 0
            android.database.Cursor r4 = r2.A08(r1, r0)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "chat_row_id"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0037 }
        L_0x001a:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            long r1 = r4.getLong(r3)     // Catch:{ all -> 0x0037 }
            X.0ts r0 = r7.A00     // Catch:{ all -> 0x0037 }
            X.0rv r0 = r0.A05(r1)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x001a
            r6.add(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x001a
        L_0x0030:
            r4.close()     // Catch:{ all -> 0x003e }
            r5.close()
            return r6
        L_0x0037:
            r0 = move-exception
            if (r4 == 0) goto L_0x003d
            r4.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221616w.A04():java.util.Set");
    }

    public void A05(C42561y1 r11) {
        C15810rt r0 = this.A01;
        C15830rv r4 = r11.A07;
        C15840rx A06 = r0.A06(r4);
        C16800tf A022 = this.A02.A02();
        try {
            A022.A02.A01("deleted_chat_job", "_id = ?", new String[]{String.valueOf(r11.A06)});
            if (A06 != null && A01(r11.A01) == null) {
                synchronized (A06) {
                    A06.A0D = Long.MIN_VALUE;
                    A06.A0E = Long.MIN_VALUE;
                    A06.A0B = Long.MIN_VALUE;
                    A06.A0C = Long.MIN_VALUE;
                    A06.A0c = null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/deletemsgs/unmark jid:");
            sb.append(r4);
            Log.i(sb.toString());
            A022.close();
        } catch (Throwable th) {
            try {
                A022.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
