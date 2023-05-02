package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.199  reason: invalid class name */
public class AnonymousClass199 {
    public final AnonymousClass198 A00;
    public final C216314v A01;
    public final AnonymousClass195 A02;
    public final C16900tq A03;
    public final AnonymousClass11I A04;

    public AnonymousClass199(AnonymousClass198 r1, C216314v r2, AnonymousClass195 r3, C16900tq r4, AnonymousClass11I r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final ContentValues A00(C35011lE r7, C37831po r8) {
        ContentValues contentValues = new ContentValues();
        C216314v r5 = this.A01;
        contentValues.put("jid_row_id", Long.valueOf(r5.A01(r7.A01)));
        contentValues.put("from_me", Integer.valueOf(r7.A03 ? 1 : 0));
        contentValues.put("call_id", r7.A02);
        contentValues.put("transaction_id", Integer.valueOf(r7.A00));
        contentValues.put("timestamp", Long.valueOf(r8.A0A));
        contentValues.put("video_call", Boolean.valueOf(r8.A0I));
        contentValues.put("duration", Integer.valueOf(r8.A01));
        contentValues.put("call_result", Integer.valueOf(r8.A00));
        contentValues.put("is_dnd_mode_on", Boolean.valueOf(r8.A09));
        contentValues.put("bytes_transferred", Long.valueOf(r8.A02));
        GroupJid groupJid = r8.A04;
        long j2 = 0;
        contentValues.put("group_jid_row_id", Long.valueOf(groupJid != null ? r5.A01(groupJid) : 0));
        contentValues.put("is_joinable_group_call", Boolean.valueOf(r8.A0H));
        DeviceJid deviceJid = r8.A0B;
        contentValues.put("call_creator_device_jid_row_id", Long.valueOf(deviceJid != null ? r5.A01(deviceJid) : 0));
        contentValues.put("call_random_id", r8.A07);
        if (r8.A0G != null) {
            j2 = r8.A0G.A00;
        }
        contentValues.put("call_link_row_id", Long.valueOf(j2));
        return contentValues;
    }

    public final C37831po A01(Cursor cursor, Cursor cursor2) {
        Cursor cursor3 = cursor;
        long j2 = cursor3.getLong(cursor3.getColumnIndexOrThrow("_id"));
        String string = cursor3.getString(cursor3.getColumnIndexOrThrow("call_id"));
        long j3 = cursor3.getLong(cursor3.getColumnIndexOrThrow("jid_row_id"));
        C216314v r1 = this.A01;
        UserJid of = UserJid.of(r1.A03(j3));
        if (!C16030sJ.A0O(of)) {
            StringBuilder sb = new StringBuilder("CallLogStore/readCallLogFromCursors/error getting jid; log jidRowId=");
            sb.append(j3);
            Log.e(sb.toString());
            return null;
        }
        boolean z2 = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("from_me")) > 0) {
            z2 = true;
        }
        C35011lE r2 = new C35011lE(cursor3.getInt(cursor3.getColumnIndexOrThrow("transaction_id")), of, string, z2);
        long j4 = cursor3.getLong(cursor3.getColumnIndexOrThrow("timestamp"));
        boolean z3 = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("video_call")) > 0) {
            z3 = true;
        }
        int i2 = cursor3.getInt(cursor3.getColumnIndexOrThrow("duration"));
        int i3 = cursor3.getInt(cursor3.getColumnIndexOrThrow("call_result"));
        boolean z4 = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("is_dnd_mode_on")) > 0) {
            z4 = true;
        }
        long j5 = cursor3.getLong(cursor3.getColumnIndexOrThrow("bytes_transferred"));
        int i4 = cursor3.getInt(cursor3.getColumnIndexOrThrow("group_jid_row_id"));
        boolean z5 = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("is_joinable_group_call")) > 0) {
            z5 = true;
        }
        long j6 = cursor3.getLong(cursor3.getColumnIndexOrThrow("call_creator_device_jid_row_id"));
        ArrayList arrayList = new ArrayList();
        while (true) {
            Cursor cursor4 = cursor2;
            try {
                if (cursor4.moveToNext()) {
                    long j7 = cursor4.getLong(cursor4.getColumnIndexOrThrow("_id"));
                    int i5 = cursor4.getInt(cursor4.getColumnIndexOrThrow("jid_row_id"));
                    UserJid of2 = UserJid.of(r1.A03((long) i5));
                    if (C16030sJ.A0O(of2)) {
                        arrayList.add(new C38581r1(of2, cursor4.getInt(cursor4.getColumnIndexOrThrow("call_result")), j7));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=");
                        sb2.append(i5);
                        Log.e(sb2.toString());
                    }
                } else {
                    String string2 = cursor3.getString(cursor3.getColumnIndexOrThrow("call_random_id"));
                    GroupJid of3 = GroupJid.of(r1.A03((long) i4));
                    return new C37831po(this.A00.A00(cursor3), DeviceJid.of(r1.A03(j6)), of3, (C38601r3) null, r2, this.A02.A01(cursor3), string2, arrayList, i2, i3, j2, j4, j5, z3, z4, false, false, z5);
                }
            } catch (RuntimeException e2) {
                Log.e("CallLogStore/readCallLogFromCursors/exception", e2);
                StringBuilder sb3 = new StringBuilder("CallLogStore/readCallLogFromCursors/exception logCursorCount");
                sb3.append(cursor3.getCount());
                sb3.append(" position:");
                sb3.append(cursor3.getPosition());
                Log.e(sb3.toString());
                StringBuilder sb4 = new StringBuilder("CallLogStore/readCallLogFromCursors/exception participantsCursorCount");
                sb4.append(cursor4.getCount());
                sb4.append(" position:");
                sb4.append(cursor4.getPosition());
                Log.e(sb4.toString());
                throw e2;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x016b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x017b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37831po A02(X.C35011lE r41) {
        /*
            r40 = this;
            r10 = r40
            X.0tq r0 = r10.A03
            X.0tf r17 = r0.get()
            r0 = r17
            X.0tg r8 = r0.A02     // Catch:{ all -> 0x017c }
            java.lang.String r5 = "SELECT call_log._id, call_log.call_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log.call_id = ? AND jid_row_id = ? AND from_me = ? AND transaction_id = ?"
            r0 = 4
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x017c }
            r12 = r41
            java.lang.String r0 = r12.A02     // Catch:{ all -> 0x017c }
            r37 = 0
            r4[r37] = r0     // Catch:{ all -> 0x017c }
            X.14v r2 = r10.A01     // Catch:{ all -> 0x017c }
            com.whatsapp.jid.UserJid r0 = r12.A01     // Catch:{ all -> 0x017c }
            long r0 = r2.A01(r0)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x017c }
            r3 = 1
            r4[r3] = r0     // Catch:{ all -> 0x017c }
            r1 = 2
            boolean r0 = r12.A03     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "1"
        L_0x002f:
            r4[r1] = r0     // Catch:{ all -> 0x017c }
            r1 = 3
            int r0 = r12.A00     // Catch:{ all -> 0x017c }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x017c }
            r4[r1] = r0     // Catch:{ all -> 0x017c }
            android.database.Cursor r0 = r8.A08(r5, r4)     // Catch:{ all -> 0x017c }
            goto L_0x0042
        L_0x003f:
            java.lang.String r0 = "0"
            goto L_0x002f
        L_0x0042:
            boolean r1 = r0.moveToLast()     // Catch:{ all -> 0x0175 }
            if (r1 == 0) goto L_0x016c
            java.lang.String r4 = "_id"
            int r1 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0175 }
            long r6 = r0.getLong(r1)     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = "SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id"
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0175 }
            java.lang.String r1 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x0175 }
            r3[r37] = r1     // Catch:{ all -> 0x0175 }
            android.database.Cursor r1 = r8.A08(r5, r3)     // Catch:{ all -> 0x0175 }
            int r3 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0165 }
            long r29 = r0.getLong(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "timestamp"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            long r31 = r0.getLong(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "video_call"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x0165 }
            r35 = 0
            if (r3 <= 0) goto L_0x0084
            r35 = 1
        L_0x0084:
            java.lang.String r3 = "duration"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            int r27 = r0.getInt(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r11 = "call_result"
            int r3 = r0.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x0165 }
            int r28 = r0.getInt(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "is_dnd_mode_on"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x0165 }
            r36 = 0
            if (r3 <= 0) goto L_0x00a8
            r36 = 1
        L_0x00a8:
            java.lang.String r3 = "bytes_transferred"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            long r33 = r0.getLong(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "group_jid_row_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            int r15 = r0.getInt(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "is_joinable_group_call"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            int r3 = r0.getInt(r3)     // Catch:{ all -> 0x0165 }
            r39 = 0
            if (r3 <= 0) goto L_0x00cc
            r39 = 1
        L_0x00cc:
            java.lang.String r3 = "call_creator_device_jid_row_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            long r13 = r0.getLong(r3)     // Catch:{ all -> 0x0165 }
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ all -> 0x0165 }
            r16.<init>()     // Catch:{ all -> 0x0165 }
        L_0x00db:
            boolean r3 = r1.moveToNext()     // Catch:{ all -> 0x0165 }
            if (r3 == 0) goto L_0x0127
            int r3 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0165 }
            long r8 = r1.getLong(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "jid_row_id"
            int r3 = r1.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            int r5 = r1.getInt(r3)     // Catch:{ all -> 0x0165 }
            long r6 = (long) r5     // Catch:{ all -> 0x0165 }
            com.whatsapp.jid.Jid r3 = r2.A03(r6)     // Catch:{ all -> 0x0165 }
            com.whatsapp.jid.UserJid r6 = com.whatsapp.jid.UserJid.of(r3)     // Catch:{ all -> 0x0165 }
            boolean r3 = X.C16030sJ.A0O(r6)     // Catch:{ all -> 0x0165 }
            if (r3 == 0) goto L_0x0115
            int r3 = r1.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x0165 }
            int r3 = r1.getInt(r3)     // Catch:{ all -> 0x0165 }
            X.1r1 r5 = new X.1r1     // Catch:{ all -> 0x0165 }
            r5.<init>(r6, r3, r8)     // Catch:{ all -> 0x0165 }
            r3 = r16
            r3.add(r5)     // Catch:{ all -> 0x0165 }
            goto L_0x00db
        L_0x0115:
            java.lang.String r6 = "CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r3.<init>(r6)     // Catch:{ all -> 0x0165 }
            r3.append(r5)     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0165 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0165 }
            goto L_0x00db
        L_0x0127:
            java.lang.String r3 = "call_random_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0165 }
            java.lang.String r25 = r0.getString(r3)     // Catch:{ all -> 0x0165 }
            long r3 = (long) r15     // Catch:{ all -> 0x0165 }
            com.whatsapp.jid.Jid r3 = r2.A03(r3)     // Catch:{ all -> 0x0165 }
            com.whatsapp.jid.GroupJid r21 = com.whatsapp.jid.GroupJid.of(r3)     // Catch:{ all -> 0x0165 }
            com.whatsapp.jid.Jid r2 = r2.A03(r13)     // Catch:{ all -> 0x0165 }
            com.whatsapp.jid.DeviceJid r20 = com.whatsapp.jid.DeviceJid.of(r2)     // Catch:{ all -> 0x0165 }
            X.195 r2 = r10.A02     // Catch:{ all -> 0x0165 }
            X.1r0 r24 = r2.A01(r0)     // Catch:{ all -> 0x0165 }
            X.198 r2 = r10.A00     // Catch:{ all -> 0x0165 }
            X.1r2 r19 = r2.A00(r0)     // Catch:{ all -> 0x0165 }
            r22 = 0
            r38 = 0
            X.1po r18 = new X.1po     // Catch:{ all -> 0x0165 }
            r23 = r12
            r26 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0165 }
            r1.close()     // Catch:{ all -> 0x0175 }
            r0.close()     // Catch:{ all -> 0x017c }
            r17.close()
            return r18
        L_0x0165:
            r2 = move-exception
            if (r1 == 0) goto L_0x016b
            r1.close()     // Catch:{ all -> 0x016b }
        L_0x016b:
            throw r2     // Catch:{ all -> 0x0175 }
        L_0x016c:
            r0.close()     // Catch:{ all -> 0x017c }
            r17.close()
            r18 = 0
            return r18
        L_0x0175:
            r1 = move-exception
            if (r0 == 0) goto L_0x017b
            r0.close()     // Catch:{ all -> 0x017b }
        L_0x017b:
            throw r1     // Catch:{ all -> 0x017c }
        L_0x017c:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0180 }
        L_0x0180:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass199.A02(X.1lE):X.1po");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C37831po r18) {
        /*
            r17 = this;
            long r1 = r18.A02()
            r15 = -1
            r9 = 1
            r8 = 0
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r1 = 1
        L_0x000e:
            java.lang.String r0 = "CallLog row_id is not set"
            X.AnonymousClass00B.A0C(r0, r1)
            r7 = r17
            X.0tq r0 = r7.A03
            X.0tf r6 = r0.A02()
            X.1cj r14 = r6.A00()     // Catch:{ all -> 0x00ab }
            java.util.List r0 = r18.A04()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0027:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x00a6 }
            r5 = r12
            X.1r1 r5 = (X.C38581r1) r5     // Catch:{ all -> 0x00a6 }
            boolean r0 = r5.A01()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0027
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x00a6 }
            r11.<init>()     // Catch:{ all -> 0x00a6 }
            long r0 = r18.A02()     // Catch:{ all -> 0x00a6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "call_log_row_id"
            r11.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            X.14v r1 = r7.A01     // Catch:{ all -> 0x00a6 }
            com.whatsapp.jid.UserJid r0 = r5.A02     // Catch:{ all -> 0x00a6 }
            long r0 = r1.A01(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "jid_row_id"
            r11.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            int r0 = r5.A00     // Catch:{ all -> 0x00a6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "call_result"
            r11.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            long r1 = r5.A00()     // Catch:{ all -> 0x00a6 }
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x008a
            X.0tg r10 = r6.A02     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = "call_log_participant_v2"
            java.lang.String r3 = "_id = ?"
            java.lang.String[] r2 = new java.lang.String[r9]     // Catch:{ all -> 0x00a6 }
            long r0 = r5.A00()     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x00a6 }
            r2[r8] = r0     // Catch:{ all -> 0x00a6 }
            r10.A00(r4, r11, r3, r2)     // Catch:{ all -> 0x00a6 }
        L_0x0085:
            monitor-enter(r12)     // Catch:{ all -> 0x00a6 }
            r5.A03 = r8     // Catch:{ all -> 0x0097 }
            monitor-exit(r12)     // Catch:{ all -> 0x00a6 }
            goto L_0x0027
        L_0x008a:
            X.0tg r1 = r6.A02     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "call_log_participant_v2"
            long r0 = r1.A05(r11, r0)     // Catch:{ all -> 0x00a6 }
            monitor-enter(r12)     // Catch:{ all -> 0x00a6 }
            r5.A01 = r0     // Catch:{ all -> 0x0097 }
            monitor-exit(r12)     // Catch:{ all -> 0x00a6 }
            goto L_0x0085
        L_0x0097:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x009a:
            monitor-enter(r18)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r18)     // Catch:{ all -> 0x00a6 }
            r14.A00()     // Catch:{ all -> 0x00a6 }
            r14.close()     // Catch:{ all -> 0x00ab }
            r6.close()
            return
        L_0x00a6:
            r0 = move-exception
            r14.close()     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00af }
        L_0x00af:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass199.A03(X.1po):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A04(X.C37831po r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            X.0tq r0 = r9.A03     // Catch:{ all -> 0x006a }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x006a }
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = "call_log"
            java.lang.String r3 = "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?"
            r0 = 4
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0065 }
            r8 = 0
            X.14v r1 = r9.A01     // Catch:{ all -> 0x0065 }
            X.1lE r7 = r10.A0C     // Catch:{ all -> 0x0065 }
            com.whatsapp.jid.UserJid r0 = r7.A01     // Catch:{ all -> 0x0065 }
            long r0 = r1.A01(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0065 }
            r2[r8] = r0     // Catch:{ all -> 0x0065 }
            r1 = 1
            boolean r0 = r7.A03     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "1"
        L_0x0028:
            r2[r1] = r0     // Catch:{ all -> 0x0065 }
            r1 = 2
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x0065 }
            r2[r1] = r0     // Catch:{ all -> 0x0065 }
            r1 = 3
            int r0 = r7.A00     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x0065 }
            r2[r1] = r0     // Catch:{ all -> 0x0065 }
            int r3 = r6.A01(r5, r3, r2)     // Catch:{ all -> 0x0065 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r2.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "CallLogStore/deleteCallLog/rowId="
            r2.append(r0)     // Catch:{ all -> 0x0065 }
            long r0 = r10.A02()     // Catch:{ all -> 0x0065 }
            r2.append(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "; count="
            r2.append(r0)     // Catch:{ all -> 0x0065 }
            r2.append(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0065 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0065 }
            goto L_0x0060
        L_0x005d:
            java.lang.String r0 = "0"
            goto L_0x0028
        L_0x0060:
            r4.close()     // Catch:{ all -> 0x006a }
            monitor-exit(r9)
            return
        L_0x0065:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass199.A04(X.1po):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A05(X.C37831po r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.A0F     // Catch:{ all -> 0x004e }
            r1 = 0
            if (r0 != 0) goto L_0x0047
            boolean r0 = r6.A0E     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x0047
            boolean r0 = r6.A0D()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0047
            X.0tq r0 = r5.A03     // Catch:{ all -> 0x004e }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x004e }
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0042 }
            X.1lE r0 = r6.A0C     // Catch:{ all -> 0x003d }
            android.content.ContentValues r2 = r5.A00(r0, r6)     // Catch:{ all -> 0x003d }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "call_log"
            long r0 = r1.A03(r2, r0)     // Catch:{ all -> 0x003d }
            r6.A06(r0)     // Catch:{ all -> 0x003d }
            r6.A05()     // Catch:{ all -> 0x003d }
            r5.A03(r6)     // Catch:{ all -> 0x003d }
            r3.A00()     // Catch:{ all -> 0x003d }
            r0 = 1
            r3.close()     // Catch:{ all -> 0x0042 }
            r4.close()     // Catch:{ all -> 0x004e }
            monitor-exit(r5)
            return r0
        L_0x003d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ all -> 0x004e }
        L_0x0047:
            java.lang.String r0 = "CallLogStore/insertCallLog - only regular call log is stored here"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x004e }
            monitor-exit(r5)
            return r1
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass199.A05(X.1po):boolean");
    }
}
