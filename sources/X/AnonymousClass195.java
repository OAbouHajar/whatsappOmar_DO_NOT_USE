package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import java.util.HashMap;

/* renamed from: X.195  reason: invalid class name */
public class AnonymousClass195 {
    public AnonymousClass194 A00;
    public final C216314v A01;
    public final C16900tq A02;
    public final C16320sq A03;

    public AnonymousClass195(C216314v r1, AnonymousClass194 r2, C16900tq r3, C16320sq r4) {
        this.A01 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r2;
    }

    public final ContentValues A00(C38571r0 r4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("call_log_row_id", Long.valueOf(r4.A00));
        contentValues.put("call_id", r4.A03);
        contentValues.put("joinable_video_call", Boolean.valueOf(r4.A04));
        GroupJid groupJid = r4.A01;
        contentValues.put("group_jid_row_id", Long.valueOf(groupJid != null ? this.A01.A01(groupJid) : 0));
        return contentValues;
    }

    public C38571r0 A01(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("call_log_row_id");
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return null;
        }
        long j2 = cursor.getLong(columnIndex);
        String string = cursor.getString(cursor.getColumnIndexOrThrow("call_id"));
        boolean z2 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("joinable_video_call")) > 0) {
            z2 = true;
        }
        return new C38571r0(GroupJid.of(this.A01.A03(cursor.getLong(cursor.getColumnIndexOrThrow("group_jid_row_id")))), string, j2, z2);
    }

    public C38571r0 A02(GroupJid groupJid) {
        C38571r0 r0;
        HashMap hashMap = this.A00.A01;
        synchronized (hashMap) {
            r0 = (C38571r0) hashMap.get(groupJid);
        }
        return r0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x005c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x004c=Splitter:B:28:0x004c, B:41:0x005c=Splitter:B:41:0x005c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C38571r0 A03(com.whatsapp.jid.GroupJid r10) {
        /*
            r9 = this;
            X.194 r8 = r9.A00
            java.util.HashMap r7 = r8.A01
            monitor-enter(r7)
            boolean r0 = r7.containsKey(r10)     // Catch:{ all -> 0x0062 }
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0018
            monitor-enter(r7)
            java.lang.Object r0 = r7.get(r10)     // Catch:{ all -> 0x0015 }
            X.1r0 r0 = (X.C38571r0) r0     // Catch:{ all -> 0x0015 }
            monitor-exit(r7)     // Catch:{ all -> 0x0015 }
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0015 }
            throw r0
        L_0x0018:
            X.0tq r0 = r9.A02
            X.0tf r5 = r0.get()
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log WHERE group_jid_row_id = ? "
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x005d }
            r2 = 0
            X.14v r0 = r9.A01     // Catch:{ all -> 0x005d }
            long r0 = r0.A01(r10)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005d }
            r3[r2] = r0     // Catch:{ all -> 0x005d }
            android.database.Cursor r1 = r6.A08(r4, r3)     // Catch:{ all -> 0x005d }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0046
            X.1r0 r0 = r9.A01(r1)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0046
            r8.A00(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x004c
        L_0x0046:
            monitor-enter(r7)     // Catch:{ all -> 0x0056 }
            r0 = 0
            r7.put(r10, r0)     // Catch:{ all -> 0x0053 }
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
        L_0x004c:
            r1.close()     // Catch:{ all -> 0x005d }
            r5.close()
            return r0
        L_0x0053:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0062 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass195.A03(com.whatsapp.jid.GroupJid):X.1r0");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0052 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0042=Splitter:B:28:0x0042, B:41:0x0052=Splitter:B:41:0x0052} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C38571r0 A04(java.lang.String r8) {
        /*
            r7 = this;
            X.194 r6 = r7.A00
            java.util.HashMap r5 = r6.A00
            monitor-enter(r5)
            boolean r0 = r5.containsKey(r8)     // Catch:{ all -> 0x0058 }
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            if (r0 == 0) goto L_0x0018
            monitor-enter(r5)
            java.lang.Object r0 = r5.get(r8)     // Catch:{ all -> 0x0015 }
            X.1r0 r0 = (X.C38571r0) r0     // Catch:{ all -> 0x0015 }
            monitor-exit(r5)     // Catch:{ all -> 0x0015 }
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0015 }
            throw r0
        L_0x0018:
            X.0tq r0 = r7.A02
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log WHERE call_id = ? "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0053 }
            r0 = 0
            r1[r0] = r8     // Catch:{ all -> 0x0053 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0053 }
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x003c
            X.1r0 r0 = r7.A01(r1)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x003c
            r6.A00(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0042
        L_0x003c:
            monitor-enter(r5)     // Catch:{ all -> 0x004c }
            r0 = 0
            r5.put(r8, r0)     // Catch:{ all -> 0x0049 }
            monitor-exit(r5)     // Catch:{ all -> 0x0049 }
        L_0x0042:
            r1.close()     // Catch:{ all -> 0x0053 }
            r4.close()
            return r0
        L_0x0049:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0
        L_0x0058:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0058 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass195.A04(java.lang.String):X.1r0");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A05() {
        /*
            r5 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0tq r0 = r5.A02
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log"
            r0 = 0
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x003a }
        L_0x0014:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "call_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = X.C30341cC.A0A(r0)     // Catch:{ all -> 0x0033 }
            r4.add(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0014
        L_0x002c:
            r1.close()     // Catch:{ all -> 0x003a }
            r3.close()
            return r4
        L_0x0033:
            r0 = move-exception
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass195.A05():java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C38571r0 r6) {
        /*
            r5 = this;
            X.0tq r0 = r5.A02
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0042 }
            android.content.ContentValues r2 = r5.A00(r6)     // Catch:{ all -> 0x003d }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "joinable_call_log"
            r1.A03(r2, r0)     // Catch:{ all -> 0x003d }
            X.194 r0 = r5.A00     // Catch:{ all -> 0x003d }
            r0.A00(r6)     // Catch:{ all -> 0x003d }
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x003d }
            r3.A00()     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "JoinableCallLogStore/insertOnCurrentThread/inserted; joinableCallLog.callId="
            r1.append(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x003d }
            r1.append(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x003d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x003d }
            r3.close()     // Catch:{ all -> 0x0042 }
            r4.close()
            return
        L_0x003d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass195.A06(X.1r0):void");
    }

    public boolean A07(GroupJid groupJid) {
        boolean containsKey;
        HashMap hashMap = this.A00.A01;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(groupJid);
        }
        return containsKey;
    }
}
