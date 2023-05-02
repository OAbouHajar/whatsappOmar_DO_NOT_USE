package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.11G  reason: invalid class name */
public class AnonymousClass11G {
    public final C16440t3 A00;
    public final C216314v A01;
    public final C16900tq A02;
    public final AnonymousClass11I A03;
    public final AnonymousClass184 A04;
    public final C14710pd A05;
    public final Object A06 = new Object();
    public final Object A07 = new Object();
    public volatile ConcurrentHashMap A08;

    public AnonymousClass11G(C16440t3 r2, C216314v r3, C16900tq r4, AnonymousClass11I r5, AnonymousClass184 r6, C14710pd r7) {
        this.A05 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
    }

    public static final void A00(ContentValues contentValues, C30991dI r3) {
        long j2;
        long j3;
        long j4;
        long j5;
        contentValues.put("message_table_id", Long.valueOf(r3.A03()));
        synchronized (r3) {
            j2 = r3.A06;
        }
        contentValues.put("last_read_message_table_id", Long.valueOf(j2));
        synchronized (r3) {
            j3 = r3.A07;
        }
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(j3));
        synchronized (r3) {
            j4 = r3.A03;
        }
        contentValues.put("first_unread_message_table_id", Long.valueOf(j4));
        synchronized (r3) {
            j5 = r3.A02;
        }
        contentValues.put("autodownload_limit_message_table_id", Long.valueOf(j5));
        contentValues.put("timestamp", Long.valueOf(r3.A04()));
        contentValues.put("unseen_count", Integer.valueOf(r3.A02()));
        contentValues.put("total_count", Integer.valueOf(r3.A01()));
    }

    public static final void A01(String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append((z2 ? "status_list" : "status").toUpperCase(Locale.ROOT));
        sb.toString();
    }

    public int A02() {
        return this.A03.A00("status_distribution", 0);
    }

    public int A03(UserJid userJid) {
        String str;
        String str2;
        C16800tf A022 = this.A02.A02();
        try {
            boolean A0H = A0H();
            C16810tg r4 = A022.A02;
            if (A0H) {
                str = "status_list";
                str2 = "key_remote_jid=?";
            } else {
                str = "status";
                str2 = "jid_row_id=?";
            }
            String[] A0K = A0K(userJid, A0H);
            A01("deleteStatus/DELETE", A0H);
            int A012 = r4.A01(str, str2, A0K);
            A0B();
            this.A08.remove(userJid);
            A022.close();
            return A012;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A04(java.lang.String r6) {
        /*
            r5 = this;
            X.0tq r0 = r5.A02
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "SELECT timestamp FROM status WHERE jid_row_id=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x003c }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x003c }
            android.database.Cursor r2 = r3.A08(r2, r1)     // Catch:{ all -> 0x003c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0035 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0035 }
            r2.close()     // Catch:{ all -> 0x003c }
            r4.close()
            return r0
        L_0x002c:
            r2.close()     // Catch:{ all -> 0x003c }
            r4.close()
            r0 = 0
            return r0
        L_0x0035:
            r0 = move-exception
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11G.A04(java.lang.String):long");
    }

    public C30991dI A05() {
        A0B();
        return (C30991dI) this.A08.get(C34091jg.A00);
    }

    public C30991dI A06(UserJid userJid) {
        A0B();
        if (userJid == null) {
            return null;
        }
        return (C30991dI) this.A08.get(userJid);
    }

    public List A07() {
        A0B();
        ConcurrentHashMap concurrentHashMap = this.A08;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (C30991dI r1 : concurrentHashMap.values()) {
            if (!r1.A0C()) {
                arrayList.add(r1.A05());
            }
        }
        return arrayList;
    }

    public List A08() {
        String A022 = this.A03.A02("status_white_list");
        return TextUtils.isEmpty(A022) ? new ArrayList() : C16030sJ.A08(UserJid.class, Arrays.asList(A022.split(",")));
    }

    public List A09() {
        String A022 = this.A03.A02("status_black_list");
        return TextUtils.isEmpty(A022) ? new ArrayList() : C16030sJ.A08(UserJid.class, Arrays.asList(A022.split(",")));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x012c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.ConcurrentHashMap A0A(X.C16800tf r27) {
        /*
            r26 = this;
            r1 = r26
            boolean r7 = r1.A0H()
            if (r7 == 0) goto L_0x0014
            java.lang.String r3 = "SELECT key_remote_jid, message_table_id, last_read_message_table_id, last_read_receipt_sent_message_table_id, first_unread_message_table_id, autodownload_limit_message_table_id, timestamp, unseen_count, total_count FROM status_list"
        L_0x000a:
            r0 = r27
            X.0tg r2 = r0.A02
            r0 = 0
            android.database.Cursor r0 = r2.A08(r3, r0)
            goto L_0x0017
        L_0x0014:
            java.lang.String r3 = "SELECT jid_row_id, message_table_id, last_read_message_table_id, last_read_receipt_sent_message_table_id, first_unread_message_table_id, autodownload_limit_message_table_id, timestamp, unseen_count, total_count FROM status"
            goto L_0x000a
        L_0x0017:
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0138 }
            r2.<init>()     // Catch:{ all -> 0x0138 }
        L_0x001c:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0138 }
            if (r3 == 0) goto L_0x00ac
            if (r7 == 0) goto L_0x0033
            java.lang.String r3 = "key_remote_jid"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0138 }
            com.whatsapp.jid.UserJid r11 = X.C16030sJ.A02(r3)     // Catch:{ all -> 0x0138 }
            goto L_0x0047
        L_0x0033:
            X.14v r6 = r1.A01     // Catch:{ all -> 0x0138 }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r3 = "jid_row_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x0138 }
            com.whatsapp.jid.Jid r11 = r6.A07(r5, r3)     // Catch:{ all -> 0x0138 }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x0138 }
        L_0x0047:
            if (r11 == 0) goto L_0x001c
            X.0pd r10 = r1.A05     // Catch:{ all -> 0x0138 }
            X.0t3 r9 = r1.A00     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "message_table_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            long r14 = r0.getLong(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "last_read_message_table_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            long r16 = r0.getLong(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "last_read_receipt_sent_message_table_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            long r18 = r0.getLong(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "first_unread_message_table_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            long r20 = r0.getLong(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "autodownload_limit_message_table_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            long r22 = r0.getLong(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "timestamp"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            long r24 = r0.getLong(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "unseen_count"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            int r12 = r0.getInt(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "total_count"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            int r13 = r0.getInt(r3)     // Catch:{ all -> 0x0138 }
            X.1dI r8 = new X.1dI     // Catch:{ all -> 0x0138 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18, r20, r22, r24)     // Catch:{ all -> 0x0138 }
            com.whatsapp.jid.UserJid r3 = r8.A0B     // Catch:{ all -> 0x0138 }
            r2.put(r3, r8)     // Catch:{ all -> 0x0138 }
            goto L_0x001c
        L_0x00ac:
            r0.close()
            if (r7 == 0) goto L_0x0137
            X.11I r8 = r1.A03
            java.lang.String r7 = "status_list_ready"
            r0 = 0
            int r0 = r8.A00(r7, r0)
            r6 = 1
            if (r0 == r6) goto L_0x0137
            X.14v r10 = r1.A01
            boolean r0 = r10.A0C()
            if (r0 == 0) goto L_0x0137
            X.0tq r0 = r1.A02
            X.0tf r5 = r0.A02()
            r0 = 0
            X.1Zf r4 = new X.1Zf     // Catch:{ all -> 0x0132 }
            r4.<init>((boolean) r0)     // Catch:{ all -> 0x0132 }
            X.1cj r13 = r5.A01()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "StatusStore/convertStatusListToV2"
            r4.A04(r0)     // Catch:{ all -> 0x0128 }
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x0128 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0128 }
        L_0x00e3:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0128 }
            r3 = 0
            if (r0 == 0) goto L_0x0110
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x0128 }
            X.1dI r11 = (X.C30991dI) r11     // Catch:{ all -> 0x0128 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0128 }
            r9.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "jid_row_id"
            com.whatsapp.jid.UserJid r0 = r11.A0B     // Catch:{ all -> 0x0128 }
            long r0 = r10.A01(r0)     // Catch:{ all -> 0x0128 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0128 }
            r9.put(r3, r0)     // Catch:{ all -> 0x0128 }
            A00(r9, r11)     // Catch:{ all -> 0x0128 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "status"
            r1.A02(r9, r0)     // Catch:{ all -> 0x0128 }
            goto L_0x00e3
        L_0x0110:
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "status_list"
            r1.A01(r0, r3, r3)     // Catch:{ all -> 0x0128 }
            r8.A04(r7, r6)     // Catch:{ all -> 0x0128 }
            r13.A00()     // Catch:{ all -> 0x0128 }
            r13.close()     // Catch:{ all -> 0x012d }
            r4.A01()     // Catch:{ all -> 0x0132 }
            r5.close()
            return r2
        L_0x0128:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x012c }
        L_0x012c:
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            r4.A01()     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0136 }
        L_0x0136:
            throw r0
        L_0x0137:
            return r2
        L_0x0138:
            r1 = move-exception
            if (r0 == 0) goto L_0x013e
            r0.close()     // Catch:{ all -> 0x013e }
        L_0x013e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11G.A0A(X.0tf):java.util.concurrent.ConcurrentHashMap");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r4.A08
            if (r0 != 0) goto L_0x004b
            X.0tq r0 = r4.A02
            X.0tf r3 = r0.get()
            boolean r0 = r4.A0H()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0031
            X.1cj r2 = r3.A01()     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r4.A07     // Catch:{ all -> 0x002c }
            monitor-enter(r1)     // Catch:{ all -> 0x002c }
            java.util.concurrent.ConcurrentHashMap r0 = r4.A08     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0021
            java.util.concurrent.ConcurrentHashMap r0 = r4.A0A(r3)     // Catch:{ all -> 0x0029 }
            r4.A08 = r0     // Catch:{ all -> 0x0029 }
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r2.A00()     // Catch:{ all -> 0x002c }
            r2.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0048
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0031:
            java.lang.Object r1 = r4.A07     // Catch:{ all -> 0x0043 }
            monitor-enter(r1)     // Catch:{ all -> 0x0043 }
            java.util.concurrent.ConcurrentHashMap r0 = r4.A08     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003e
            java.util.concurrent.ConcurrentHashMap r0 = r4.A0A(r3)     // Catch:{ all -> 0x0040 }
            r4.A08 = r0     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x0048
        L_0x0040:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r3.close()
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11G.A0B():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0095 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.content.ContentValues r9, com.whatsapp.jid.UserJid r10, X.C16740tZ r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            X.0tq r0 = r8.A02
            X.0tf r3 = r0.A02()
            X.1cj r7 = r3.A00()     // Catch:{ all -> 0x0096 }
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x0091 }
            if (r12 == 0) goto L_0x0024
            java.lang.String r4 = "status_list"
            java.lang.String r2 = "key_remote_jid=?"
        L_0x0013:
            java.lang.String[] r1 = r8.A0K(r10, r12)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "updateStatusesListForNewMessage/UPDATE"
            A01(r0, r12)     // Catch:{ all -> 0x0091 }
            int r0 = r5.A00(r4, r9, r2, r1)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x0087
            goto L_0x002a
        L_0x0024:
            java.lang.String r4 = "status"
            java.lang.String r2 = "jid_row_id=?"
            goto L_0x0013
        L_0x002a:
            if (r12 == 0) goto L_0x002d
            goto L_0x003d
        L_0x002d:
            java.lang.String r2 = "jid_row_id"
            X.14v r0 = r8.A01     // Catch:{ all -> 0x0091 }
            long r0 = r0.A01(r10)     // Catch:{ all -> 0x0091 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0091 }
            r9.put(r2, r0)     // Catch:{ all -> 0x0091 }
            goto L_0x0046
        L_0x003d:
            java.lang.String r1 = "key_remote_jid"
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0091 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0091 }
        L_0x0046:
            java.lang.String r0 = "updateStatusesListForNewMessage/INSERT"
            A01(r0, r12)     // Catch:{ all -> 0x0091 }
            long r5 = r5.A02(r9, r4)     // Catch:{ all -> 0x0091 }
            if (r13 == 0) goto L_0x0064
            java.util.concurrent.ConcurrentHashMap r0 = r8.A08     // Catch:{ all -> 0x0091 }
            int r1 = r0.size()     // Catch:{ all -> 0x0091 }
            r0 = 1
            if (r1 != r0) goto L_0x0064
            X.11I r4 = r8.A03     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "earliest_status_time"
            long r0 = r11.A0I     // Catch:{ all -> 0x0091 }
            r4.A05(r2, r0)     // Catch:{ all -> 0x0091 }
        L_0x0064:
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0087
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r1.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "statusmsgstore/addmsg/statuslist/insert/failed gid="
            r1.append(r0)     // Catch:{ all -> 0x0091 }
            r1.append(r10)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "; shouldUseDeprecatedTable="
            r1.append(r0)     // Catch:{ all -> 0x0091 }
            r1.append(r12)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0091 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0091 }
        L_0x0087:
            r7.A00()     // Catch:{ all -> 0x0091 }
            r7.close()     // Catch:{ all -> 0x0096 }
            r3.close()
            return
        L_0x0091:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0095 }
        L_0x0095:
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x009a }
        L_0x009a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11G.A0C(android.content.ContentValues, com.whatsapp.jid.UserJid, X.0tZ, boolean, boolean):void");
    }

    public void A0D(C30991dI r9, UserJid userJid) {
        String str;
        String str2;
        C16800tf A022 = this.A02.A02();
        try {
            boolean A0H = A0H();
            ContentValues contentValues = new ContentValues(8);
            A00(contentValues, r9);
            C16810tg r4 = A022.A02;
            if (A0H) {
                str = "status_list";
                str2 = "key_remote_jid=?";
            } else {
                str = "status";
                str2 = "jid_row_id=?";
            }
            String[] A0K = A0K(userJid, A0H);
            A01("updateStatus/UPDATE", A0H);
            if (r4.A00(str, contentValues, str2, A0K) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/updateStatus/failed jid=");
                sb.append(userJid);
                sb.append("; shouldUseDeprecatedTable=");
                sb.append(A0H);
                Log.e(sb.toString());
            }
            A0B();
            this.A08.put(userJid, r9);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A0E(UserJid userJid, int i2, int i3) {
        String str;
        String str2;
        boolean A0H = A0H();
        C16800tf A022 = this.A02.A02();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("unseen_count", Integer.valueOf(i2));
            contentValues.put("total_count", Integer.valueOf(i3));
            C16810tg r4 = A022.A02;
            if (A0H) {
                str = "status_list";
                str2 = "key_remote_jid=?";
            } else {
                str = "status";
                str2 = "jid_row_id=?";
            }
            String[] A0K = A0K(userJid, A0H);
            A01("updateStatusCount/UPDATE", A0H);
            if (r4.A00(str, contentValues, str2, A0K) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/updateStatusCount/update count failed jid=");
                sb.append(userJid);
                sb.append("; shouldUseDeprecatedTable=");
                sb.append(A0H);
                Log.e(sb.toString());
            }
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A0F(Collection collection, int i2) {
        String join;
        String str;
        ArrayList A062 = collection == null ? null : C16030sJ.A06(collection);
        AnonymousClass11I r2 = this.A03;
        r2.A04("status_distribution", i2);
        if (A062 != null) {
            if (i2 == 2) {
                join = TextUtils.join(",", A062);
                str = "status_black_list";
            } else if (i2 == 1) {
                join = TextUtils.join(",", A062);
                str = "status_white_list";
            } else {
                return;
            }
            r2.A06(str, join);
        }
    }

    public boolean A0G() {
        return this.A03.A02("status_distribution") != null;
    }

    public boolean A0H() {
        return this.A03.A00("status_list_ready", 0) == 0;
    }

    public boolean A0I(C16740tZ r11) {
        int i2;
        AnonymousClass00B.A0B("isStatusExpired should be called for statuses only", C16030sJ.A0Q(r11.A11.A00));
        if (C16030sJ.A0P(r11.A0B())) {
            C34601kX A002 = this.A04.A00(r11);
            if (!A002.A00()) {
                StringBuilder sb = new StringBuilder("StatusStore/isStatusExpired/is new status psa/campaign id: ");
                sb.append(A002.A04);
                sb.append(", campaign first seen time: ");
                sb.append(A002.A01);
                sb.append(", campaign expiration time:");
                sb.append(A002.A00);
                Log.i(sb.toString());
                return A002.A01(this.A00.A00()) && A002.A04 != null;
            }
            AnonymousClass11I r3 = this.A03;
            long A012 = r3.A01("status_psa_viewed_time", 0);
            long A013 = r3.A01("status_psa_exipration_time", 0);
            StringBuilder sb2 = new StringBuilder("StatusStore/isStatusExpired/is legacy status psa/psa seen ts: ");
            sb2.append(A012);
            sb2.append(", psa expire ts: ");
            sb2.append(A013);
            Log.i(sb2.toString());
            if (r11.A0I >= A012 || A013 == 0) {
                return false;
            }
            i2 = (A013 > this.A00.A00() ? 1 : (A013 == this.A00.A00() ? 0 : -1));
        } else {
            i2 = (r11.A0I > (this.A00.A00() - 86400000) ? 1 : (r11.A0I == (this.A00.A00() - 86400000) ? 0 : -1));
        }
        return i2 < 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        if (r3 != false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J(X.C16740tZ r5) {
        /*
            r4 = this;
            X.1Vw r0 = r5.A11
            boolean r3 = r0.A02
            X.0pd r2 = r4.A05
            r1 = 2039(0x7f7, float:2.857E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r2 = 0
            if (r0 != 0) goto L_0x0014
            if (r3 == 0) goto L_0x0035
        L_0x0013:
            return r2
        L_0x0014:
            if (r3 == 0) goto L_0x0035
            X.1dI r0 = r4.A05()
        L_0x001a:
            if (r0 != 0) goto L_0x0040
            if (r3 != 0) goto L_0x0013
            java.lang.String r0 = "statusmsgstore/isstatusunseen/no status for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r5.A0B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r2
        L_0x0035:
            X.0rv r0 = r5.A0B()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.1dI r0 = r4.A06(r0)
            goto L_0x001a
        L_0x0040:
            boolean r0 = r0.A0D(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11G.A0J(X.0tZ):boolean");
    }

    public final String[] A0K(UserJid userJid, boolean z2) {
        String valueOf;
        String[] strArr = new String[1];
        if (z2) {
            valueOf = C16030sJ.A03(userJid);
        } else {
            valueOf = String.valueOf(userJid != null ? this.A01.A01(userJid) : -1);
        }
        strArr[0] = valueOf;
        return strArr;
    }
}
