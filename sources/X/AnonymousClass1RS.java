package X;

import android.database.sqlite.SQLiteStatement;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Executor;

/* renamed from: X.1RS  reason: invalid class name */
public class AnonymousClass1RS {
    public final AnonymousClass1XS A00 = new AnonymousClass1XS();
    public final C26451Nt A01;
    public final AnonymousClass19K A02;
    public final AnonymousClass1WA A03;

    public AnonymousClass1RS(C26451Nt r3, AnonymousClass19K r4, C16320sq r5) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = new AnonymousClass1WA(r5, false);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x011e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0116=Splitter:B:29:0x0116, B:34:0x011e=Splitter:B:34:0x011e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C29851bK A00() {
        /*
            r36 = this;
            X.AnonymousClass00B.A00()
            r2 = r36
            X.19K r0 = r2.A02
            X.0tf r7 = r0.get()
            X.0tg r1 = r7.A02     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "SELECT _id, device_id, sync_type, last_processed_msg_row_id, oldest_msg_row_id, oldest_message_to_sync_row_id, sent_msgs_count, chunk_order, sent_bytes, last_chunk_timestamp, status, peer_msg_row_id, session_id, md_reg_attempt_id, size_limit_bytes FROM msg_history_sync WHERE status=1 ORDER BY sync_type ASC, last_chunk_timestamp ASC LIMIT 1"
            r3 = 0
            android.database.Cursor r0 = r1.A08(r0, r3)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x011f
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x011a }
            if (r1 == 0) goto L_0x0116
            java.lang.String r1 = "device_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x011a }
            com.whatsapp.jid.DeviceJid r14 = com.whatsapp.jid.DeviceJid.getNullable(r1)     // Catch:{ all -> 0x011a }
            if (r14 == 0) goto L_0x0116
            java.lang.String r1 = "sync_type"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            int r15 = r0.getInt(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            long r18 = r0.getLong(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "last_processed_msg_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            long r20 = r0.getLong(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "oldest_msg_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            long r22 = r0.getLong(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "oldest_message_to_sync_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            long r24 = r0.getLong(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "sent_msgs_count"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            long r26 = r0.getLong(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "chunk_order"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            int r16 = r0.getInt(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "sent_bytes"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x011a }
            long r10 = (long) r1     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "last_chunk_timestamp"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x011a }
            long r8 = (long) r1     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "status"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            int r17 = r0.getInt(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "peer_msg_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            long r32 = r0.getLong(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "session_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r6 = r0.getString(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "md_reg_attempt_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r5 = r0.getString(r1)     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "size_limit_bytes"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x011a }
            boolean r3 = r0.isNull(r1)     // Catch:{ all -> 0x011a }
            if (r3 != 0) goto L_0x00c7
            long r1 = r0.getLong(r1)     // Catch:{ all -> 0x011a }
            goto L_0x00f8
        L_0x00c7:
            X.1Nt r3 = r2.A01     // Catch:{ all -> 0x011a }
            r4 = 2
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r1 = -1
            if (r15 == r4) goto L_0x00f1
            r4 = 3
            if (r15 == r4) goto L_0x00e6
            java.lang.String r4 = "HistorySyncUtil/getSizeLimitBytes unexpected sync type "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            r3.<init>(r4)     // Catch:{ all -> 0x011a }
            r3.append(r15)     // Catch:{ all -> 0x011a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x011a }
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x011a }
            goto L_0x00f8
        L_0x00e6:
            X.0s5 r2 = r3.A00     // Catch:{ all -> 0x011a }
            X.0tC r1 = X.C15910s6.A1O     // Catch:{ all -> 0x011a }
            int r1 = r2.A02(r1)     // Catch:{ all -> 0x011a }
            long r1 = (long) r1     // Catch:{ all -> 0x011a }
            long r1 = r1 * r12
            goto L_0x00f8
        L_0x00f1:
            X.0pd r4 = r3.A01     // Catch:{ all -> 0x011a }
            r3 = 2645(0xa55, float:3.706E-42)
            r4.A02(r3)     // Catch:{ all -> 0x011a }
        L_0x00f8:
            if (r6 == 0) goto L_0x00fd
            if (r5 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r13 = 0
            goto L_0x0104
        L_0x00ff:
            X.1WM r13 = new X.1WM     // Catch:{ all -> 0x011a }
            r13.<init>(r6, r5)     // Catch:{ all -> 0x011a }
        L_0x0104:
            X.1bK r12 = new X.1bK     // Catch:{ all -> 0x011a }
            r28 = r10
            r30 = r8
            r34 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r24, r26, r28, r30, r32, r34)     // Catch:{ all -> 0x011a }
            r0.close()     // Catch:{ all -> 0x0123 }
            r7.close()
            return r12
        L_0x0116:
            r0.close()     // Catch:{ all -> 0x0123 }
            goto L_0x011f
        L_0x011a:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x011e }
        L_0x011e:
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x011f:
            r7.close()
            return r3
        L_0x0123:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0127 }
        L_0x0127:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RS.A00():X.1bK");
    }

    public final void A01(C16800tf r3, DeviceJid deviceJid) {
        if (r3.A02.A00.inTransaction()) {
            r3.A03(new RunnableRunnableShape7S0200000_I0_5(this, 19, deviceJid));
        } else {
            A03(deviceJid);
        }
    }

    public void A02(C29851bK r9) {
        AnonymousClass00B.A00();
        C16800tf A022 = this.A02.A02();
        try {
            C37281ou A0A = A022.A02.A0A("INSERT INTO msg_history_sync (device_id, sync_type, last_processed_msg_row_id, oldest_msg_row_id, sent_msgs_count, chunk_order, sent_bytes, last_chunk_timestamp, status, peer_msg_row_id, oldest_message_to_sync_row_id, session_id, md_reg_attempt_id, size_limit_bytes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            SQLiteStatement sQLiteStatement = A0A.A00;
            sQLiteStatement.clearBindings();
            DeviceJid deviceJid = r9.A0D;
            A0A.A02(1, deviceJid.getRawString());
            A0A.A01(2, (long) r9.A02);
            A0A.A01(3, r9.A04);
            A0A.A01(4, r9.A0A);
            A0A.A01(5, r9.A08);
            A0A.A01(6, (long) r9.A00);
            A0A.A01(7, r9.A07);
            A0A.A01(8, r9.A03);
            A0A.A01(9, (long) r9.A01);
            A0A.A01(10, r9.A05);
            A0A.A01(11, r9.A0B);
            AnonymousClass1WM r7 = r9.A0C;
            if (r7 != null) {
                A0A.A02(12, r7.A01);
                A0A.A02(13, r7.A00);
            } else {
                sQLiteStatement.bindNull(12);
                sQLiteStatement.bindNull(13);
            }
            A0A.A01(14, r9.A09);
            sQLiteStatement.executeInsert();
            A01(A022, deviceJid);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0033=Splitter:B:13:0x0033, B:8:0x002b=Splitter:B:8:0x002b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.whatsapp.jid.DeviceJid r8) {
        /*
            r7 = this;
            X.AnonymousClass00B.A00()
            X.19K r0 = r7.A02
            X.0tf r6 = r0.get()
            X.0tg r5 = r6.A02     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "SELECT device_id, status FROM msg_history_sync WHERE device_id=? AND status=? LIMIT 1"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0044 }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x0044 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0044 }
            r2[r1] = r0     // Catch:{ all -> 0x0044 }
            android.database.Cursor r1 = r5.A08(r4, r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0034
            int r0 = r1.getCount()     // Catch:{ all -> 0x002f }
            if (r0 <= 0) goto L_0x002b
            r3 = 1
        L_0x002b:
            r1.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0034
        L_0x002f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0034:
            r6.close()
            X.1WA r2 = r7.A03
            r1 = 12
            com.facebook.redex.RunnableRunnableShape0S0210000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0210000_I0
            r0.<init>(r7, r8, r1, r3)
            r2.execute(r0)
            return
        L_0x0044:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RS.A03(com.whatsapp.jid.DeviceJid):void");
    }

    public void A04(DeviceJid deviceJid, int i2) {
        AnonymousClass00B.A00();
        C16800tf A022 = this.A02.A02();
        try {
            A022.A02.A0C("DELETE FROM msg_history_sync WHERE device_id=? AND sync_type=?", new String[]{deviceJid.getRawString(), String.valueOf(i2)});
            A022.close();
            A03(deviceJid);
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A05(AnonymousClass1WE r4, Executor executor) {
        this.A03.execute(new RunnableRunnableShape1S0300000_I0_1(this, r4, executor, 12));
    }
}
