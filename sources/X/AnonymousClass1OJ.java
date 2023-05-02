package X;

import android.content.ContentValues;
import com.facebook.redex.IDxLCacheShape19S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;

/* renamed from: X.1OJ  reason: invalid class name */
public class AnonymousClass1OJ {
    public final AnonymousClass03L A00 = new IDxLCacheShape19S0100000_2_I0(this);
    public final C16440t3 A01;
    public final C16770tc A02;
    public final C16320sq A03;

    public AnonymousClass1OJ(C16440t3 r2, C16770tc r3, C16320sq r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final ContentValues A00(C31781f1 r25) {
        C31781f1 r1 = r25;
        String str = r1.A0D;
        long j2 = (long) r1.A0B;
        long j3 = r1.A0C;
        long j4 = r1.A09;
        long j5 = (long) r1.A03;
        long j6 = r1.A07;
        long j7 = r1.A08;
        int i2 = r1.A02;
        int i3 = r1.A00;
        long j8 = r1.A0A;
        int i4 = r1.A01;
        long j9 = r1.A04;
        long j10 = r1.A05;
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", str);
        contentValues.put("job_type", Long.valueOf(j2));
        contentValues.put("create_time", Long.valueOf(j3));
        contentValues.put("transfer_start_time", Long.valueOf(j4));
        contentValues.put("last_update_time", Long.valueOf(this.A01.A00()));
        contentValues.put("user_initiated_attempt_count", Long.valueOf(j5));
        contentValues.put("overall_cumulative_time", Long.valueOf(j6));
        contentValues.put("overall_cumulative_user_visible_time", Long.valueOf(j7));
        contentValues.put("streaming_playback_count", Integer.valueOf(i2));
        contentValues.put("media_key_reuse_type", Integer.valueOf(i3));
        contentValues.put("transferred_bytes", Long.valueOf(j8));
        contentValues.put("reupload_attempt_count", Integer.valueOf(i4));
        contentValues.put("last_reupload_attempt_timestamp", Long.valueOf(j9));
        contentValues.put("last_reupload_success_timestamp", Long.valueOf(j10));
        return contentValues;
    }

    public C31781f1 A01(String str, int i2) {
        C16440t3 r1 = this.A01;
        long A002 = r1.A00();
        long A003 = r1.A00();
        long A004 = r1.A00();
        boolean z2 = true;
        boolean z3 = false;
        if (A002 > 0) {
            z3 = true;
        }
        AnonymousClass00B.A0G(z3);
        if (A004 <= 0) {
            z2 = false;
        }
        AnonymousClass00B.A0G(z2);
        String str2 = str;
        AnonymousClass00B.A06(str2);
        C31781f1 r4 = new C31781f1(str2, i2, 0, 0, 0, 0, A002, A003, A004, 0, 0, 0, 0, 0);
        this.A03.Acl(new RunnableRunnableShape8S0200000_I0_6(this, 23, r4));
        return r4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:35|36|37|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dd, code lost:
        return r8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00db */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C31781f1 A02(java.lang.String r32, int r33) {
        /*
            r31 = this;
            r1 = r31
            monitor-enter(r1)
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x00de }
            X.03L r4 = r1.A00     // Catch:{ all -> 0x00de }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r0.<init>()     // Catch:{ all -> 0x00de }
            r9 = r32
            r0.append(r9)     // Catch:{ all -> 0x00de }
            r2 = r33
            r0.append(r2)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00de }
            java.lang.Object r8 = r4.A02(r0)     // Catch:{ all -> 0x00de }
            X.1f1 r8 = (X.C31781f1) r8     // Catch:{ all -> 0x00de }
            if (r8 != 0) goto L_0x00dc
            X.0tc r0 = r1.A02     // Catch:{ all -> 0x00de }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x00de }
            X.0tg r8 = r5.A02     // Catch:{ all -> 0x00d7 }
            java.lang.String r7 = "SELECT + _id, uuid, job_type , create_time, transfer_start_time, last_update_time, user_initiated_attempt_count, overall_cumulative_time, overall_cumulative_user_visible_time, streaming_playback_count, media_key_reuse_type, doodle_id, transferred_bytes, reupload_attempt_count, last_reupload_attempt_timestamp, last_reupload_success_timestamp FROM media_job WHERE uuid=? AND job_type=?"
            r6 = 2
            java.lang.String[] r3 = new java.lang.String[r6]     // Catch:{ all -> 0x00d7 }
            r0 = 0
            r3[r0] = r32     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = java.lang.Integer.toString(r2)     // Catch:{ all -> 0x00d7 }
            r2 = 1
            r3[r2] = r0     // Catch:{ all -> 0x00d7 }
            android.database.Cursor r0 = r8.A08(r7, r3)     // Catch:{ all -> 0x00d7 }
            boolean r3 = r0.moveToLast()     // Catch:{ all -> 0x00d0 }
            if (r3 == 0) goto L_0x00c7
            java.lang.String r9 = r0.getString(r2)     // Catch:{ all -> 0x00d0 }
            int r10 = r0.getInt(r6)     // Catch:{ all -> 0x00d0 }
            r3 = 3
            long r15 = r0.getLong(r3)     // Catch:{ all -> 0x00d0 }
            r7 = 0
            r3 = 4
            long r17 = r0.getLong(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 5
            long r19 = r0.getLong(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 6
            int r11 = r0.getInt(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 7
            long r21 = r0.getLong(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 8
            long r23 = r0.getLong(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 9
            int r12 = r0.getInt(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 10
            int r13 = r0.getInt(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 12
            long r25 = r0.getLong(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 13
            int r14 = r0.getInt(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 14
            long r27 = r0.getLong(r3)     // Catch:{ all -> 0x00d0 }
            r3 = 15
            long r29 = r0.getLong(r3)     // Catch:{ all -> 0x00d0 }
            int r6 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            r3 = 0
            if (r6 <= 0) goto L_0x0097
            r3 = 1
        L_0x0097:
            X.AnonymousClass00B.A0G(r3)     // Catch:{ all -> 0x00d0 }
            int r3 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x009f
            r2 = 0
        L_0x009f:
            X.AnonymousClass00B.A0G(r2)     // Catch:{ all -> 0x00d0 }
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x00d0 }
            X.1f1 r8 = new X.1f1     // Catch:{ all -> 0x00d0 }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r25, r27, r29)     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r3.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = r8.A0D     // Catch:{ all -> 0x00d0 }
            r3.append(r2)     // Catch:{ all -> 0x00d0 }
            int r2 = r8.A0B     // Catch:{ all -> 0x00d0 }
            r3.append(r2)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00d0 }
            r4.A06(r2, r8)     // Catch:{ all -> 0x00d0 }
            r0.close()     // Catch:{ all -> 0x00d7 }
            r5.close()     // Catch:{ all -> 0x00de }
            goto L_0x00dc
        L_0x00c7:
            r2 = 0
            r0.close()     // Catch:{ all -> 0x00d7 }
            r5.close()     // Catch:{ all -> 0x00de }
            monitor-exit(r1)
            return r2
        L_0x00d0:
            r2 = move-exception
            if (r0 == 0) goto L_0x00d6
            r0.close()     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            throw r2     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00db }
        L_0x00db:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00dc:
            monitor-exit(r1)
            return r8
        L_0x00de:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OJ.A02(java.lang.String, int):X.1f1");
    }

    public void A03(C31781f1 r4) {
        r4.A06 = this.A01.A00();
        if (A05(r4)) {
            AnonymousClass03L r2 = this.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(r4.A0D);
            sb.append(r4.A0B);
            r2.A06(sb.toString(), r4);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A04(X.C31781f1 r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x0059 }
            r1 = 0
            X.0tc r0 = r10.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            X.0tf r7 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            X.1cj r9 = r7.A00()     // Catch:{ all -> 0x004c }
            X.0tg r8 = r7.A02     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = "media_job"
            java.lang.String r5 = "uuid = ? AND job_type = ? "
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = r11.A0D     // Catch:{ all -> 0x0047 }
            r4[r1] = r3     // Catch:{ all -> 0x0047 }
            int r2 = r11.A0B     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = java.lang.Integer.toString(r2)     // Catch:{ all -> 0x0047 }
            r0 = 1
            r4[r0] = r1     // Catch:{ all -> 0x0047 }
            r8.A01(r6, r5, r4)     // Catch:{ all -> 0x0047 }
            r9.A00()     // Catch:{ all -> 0x0047 }
            X.03L r1 = r10.A00     // Catch:{ all -> 0x0047 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r0.<init>()     // Catch:{ all -> 0x0047 }
            r0.append(r3)     // Catch:{ all -> 0x0047 }
            r0.append(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0047 }
            r1.A03(r0)     // Catch:{ all -> 0x0047 }
            r9.close()     // Catch:{ all -> 0x004c }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            goto L_0x0057
        L_0x0047:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            java.lang.String r0 = "mediajobdb/delete"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r10)
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OJ.A04(X.1f1):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.C31781f1 r10) {
        /*
            r9 = this;
            X.AnonymousClass00B.A00()
            r8 = 0
            X.0tc r0 = r9.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036, Error | RuntimeException -> 0x0031 }
            X.0tf r7 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036, Error | RuntimeException -> 0x0031 }
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x002c }
            java.lang.String r5 = "media_job"
            android.content.ContentValues r4 = r9.A00(r10)     // Catch:{ all -> 0x002c }
            java.lang.String r3 = "uuid = ? AND job_type = ? "
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x002c }
            java.lang.String r0 = r10.A0D     // Catch:{ all -> 0x002c }
            r2[r8] = r0     // Catch:{ all -> 0x002c }
            int r0 = r10.A0B     // Catch:{ all -> 0x002c }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x002c }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x002c }
            r6.A00(r5, r4, r3, r2)     // Catch:{ all -> 0x002c }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036, Error | RuntimeException -> 0x0031 }
            return r0
        L_0x002c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036, Error | RuntimeException -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0036:
            r1 = move-exception
            java.lang.String r0 = "mediajobdb/update"
            com.whatsapp.util.Log.e(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OJ.A05(X.1f1):boolean");
    }
}
