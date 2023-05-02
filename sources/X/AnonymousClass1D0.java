package X;

import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1D0  reason: invalid class name */
public class AnonymousClass1D0 {
    public AnonymousClass2ED A00;
    public final C16300so A01;
    public final C16040sK A02;
    public final C16440t3 A03;
    public final C14730pf A04;
    public final AnonymousClass126 A05;
    public final C16820th A06;
    public final AnonymousClass199 A07;
    public final C16920ts A08;
    public final C15810rt A09;
    public final C16460t6 A0A;
    public final AnonymousClass17E A0B;
    public final AnonymousClass17H A0C;
    public final C19150xq A0D;
    public final AnonymousClass0y0 A0E;
    public final C16900tq A0F;
    public final AnonymousClass11I A0G;
    public final C24811Hj A0H;
    public final C14710pd A0I;
    public final C16490t9 A0J;
    public final AnonymousClass122 A0K;
    public final AnonymousClass1SP A0L;
    public final ReentrantReadWriteLock A0M = new ReentrantReadWriteLock();

    public AnonymousClass1D0(C16300so r2, C16040sK r3, C16440t3 r4, C14730pf r5, AnonymousClass126 r6, C16820th r7, AnonymousClass199 r8, C16920ts r9, C15810rt r10, C16460t6 r11, AnonymousClass17E r12, AnonymousClass17H r13, C19150xq r14, AnonymousClass0y0 r15, C16900tq r16, AnonymousClass11I r17, C24811Hj r18, C14710pd r19, C16490t9 r20, AnonymousClass122 r21, AnonymousClass1SP r22) {
        AnonymousClass2ED r0 = new AnonymousClass2ED();
        this.A03 = r4;
        this.A00 = r0;
        this.A0I = r19;
        this.A02 = r3;
        this.A08 = r9;
        this.A01 = r2;
        this.A09 = r10;
        this.A0J = r20;
        this.A07 = r8;
        this.A04 = r5;
        this.A0B = r12;
        this.A0L = r22;
        this.A0A = r11;
        this.A0D = r14;
        this.A0G = r17;
        this.A05 = r6;
        this.A06 = r7;
        this.A0E = r15;
        this.A0C = r13;
        this.A0F = r16;
        this.A0K = r21;
        this.A0H = r18;
    }

    public static C37831po A00(C37831po r33) {
        C37831po r4 = r33;
        boolean z2 = false;
        if (r4.A05 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0C("not a legacy/v1 call log", z2);
        ArrayList arrayList = new ArrayList(r4.A04().size());
        for (C38581r1 r0 : r4.A04()) {
            arrayList.add(new C38581r1(r0.A02, r0.A00, -1));
        }
        C35011lE r11 = r4.A0C;
        long j2 = r4.A0A;
        boolean z3 = r4.A0I;
        int i2 = r4.A01;
        int i3 = r4.A00;
        boolean z4 = r4.A09;
        long j3 = r4.A02;
        GroupJid groupJid = r4.A04;
        boolean z5 = r4.A0H;
        long j4 = j2;
        long j5 = j3;
        int i4 = i2;
        int i5 = i3;
        return new C37831po((C38591r2) null, r4.A0B, groupJid, (C38601r3) null, r11, (C38571r0) null, r4.A07, arrayList, i4, i5, -1, j4, j5, z3, z4, false, false, z5);
    }

    public C37831po A01(long j2) {
        C37831po r0;
        AnonymousClass03L r1 = this.A00.A01;
        synchronized (r1) {
            r0 = (C37831po) r1.A02(Long.valueOf(j2));
        }
        return r0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0066 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0045=Splitter:B:18:0x0045, B:38:0x0066=Splitter:B:38:0x0066} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37831po A02(long r11) {
        /*
            r10 = this;
            X.2ED r9 = r10.A00
            X.03L r1 = r9.A01
            monitor-enter(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r1.A02(r0)     // Catch:{ all -> 0x006d }
            X.1po r0 = (X.C37831po) r0     // Catch:{ all -> 0x006d }
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x006c
            X.199 r8 = r10.A07
            X.0tq r0 = r8.A03
            X.0tf r7 = r0.get()
            X.0tg r6 = r7.A02     // Catch:{ all -> 0x0067 }
            java.lang.String r1 = "SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log._id = ?"
            r5 = 1
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = java.lang.Long.toString(r11)     // Catch:{ all -> 0x0067 }
            r3 = 0
            r0[r3] = r4     // Catch:{ all -> 0x0067 }
            android.database.Cursor r2 = r6.A08(r1, r0)     // Catch:{ all -> 0x0067 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r1 = "SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id"
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x0060 }
            r0[r3] = r4     // Catch:{ all -> 0x0060 }
            android.database.Cursor r1 = r6.A08(r1, r0)     // Catch:{ all -> 0x0060 }
            X.1po r0 = r8.A01(r2, r1)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ all -> 0x0060 }
        L_0x0045:
            r2.close()     // Catch:{ all -> 0x0067 }
            r7.close()
            if (r0 == 0) goto L_0x006c
            r9.A00(r0)
            return r0
        L_0x0051:
            r0 = move-exception
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0058:
            r2.close()     // Catch:{ all -> 0x0067 }
            r7.close()
            r0 = 0
            return r0
        L_0x0060:
            r0 = move-exception
            if (r2 == 0) goto L_0x0066
            r2.close()     // Catch:{ all -> 0x0066 }
        L_0x0066:
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r0
        L_0x006c:
            return r0
        L_0x006d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A02(long):X.1po");
    }

    public final C37831po A03(C35011lE r4) {
        C37831po r0;
        AnonymousClass2ED r2 = this.A00;
        AnonymousClass03L r1 = r2.A00;
        synchronized (r1) {
            r0 = (C37831po) r1.A02(r4);
        }
        if (r0 == null && (r0 = this.A07.A02(r4)) != null) {
            r2.A00(r0);
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r14.A0E != false) goto L_0x001d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00cf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37831po A04(X.C35011lE r13, X.C37831po r14) {
        /*
            r12 = this;
            X.1po r0 = r12.A03(r13)
            if (r0 != 0) goto L_0x00dc
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r12.A0M
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.lock()
            X.199 r6 = r12.A07     // Catch:{ all -> 0x00d3 }
            monitor-enter(r6)     // Catch:{ all -> 0x00d3 }
            boolean r0 = r14.A0F     // Catch:{ all -> 0x00d0 }
            r2 = 1
            r11 = 0
            if (r0 != 0) goto L_0x001d
            boolean r0 = r14.A0E     // Catch:{ all -> 0x00d0 }
            r1 = 1
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            java.lang.String r0 = "Only regular call log is stored here"
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ all -> 0x00d0 }
            long r7 = r14.A02()     // Catch:{ all -> 0x00d0 }
            r4 = -1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x002f
            r1 = 1
        L_0x002f:
            java.lang.String r0 = "CallLog row_id is not set"
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ all -> 0x00d0 }
            X.0tq r0 = r6.A03     // Catch:{ all -> 0x00d0 }
            X.0tf r7 = r0.A02()     // Catch:{ all -> 0x00d0 }
            X.1cj r10 = r7.A00()     // Catch:{ all -> 0x00cb }
            android.content.ContentValues r9 = r6.A00(r13, r14)     // Catch:{ all -> 0x00c6 }
            X.0tg r8 = r7.A02     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "call_log"
            java.lang.String r4 = "_id = ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x00c6 }
            long r0 = r14.A02()     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x00c6 }
            r2[r11] = r0     // Catch:{ all -> 0x00c6 }
            r8.A00(r5, r9, r4, r2)     // Catch:{ all -> 0x00c6 }
            r10.A00()     // Catch:{ all -> 0x00c6 }
            X.1lE r1 = r14.A0C     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "; new key="
            r10.close()     // Catch:{ all -> 0x00cb }
            r7.close()     // Catch:{ all -> 0x00d0 }
            X.1po r4 = r6.A02(r13)     // Catch:{ all -> 0x00d0 }
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00af
            X.2ED r0 = r12.A00     // Catch:{ all -> 0x00d3 }
            r0.A01(r14)     // Catch:{ all -> 0x00d3 }
            r0.A00(r4)     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r2.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread; callLog.key="
            r2.append(r0)     // Catch:{ all -> 0x00d3 }
            r2.append(r1)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "; callLog.row_id="
            r2.append(r0)     // Catch:{ all -> 0x00d3 }
            long r0 = r14.A02()     // Catch:{ all -> 0x00d3 }
            r2.append(r0)     // Catch:{ all -> 0x00d3 }
            r2.append(r5)     // Catch:{ all -> 0x00d3 }
            r2.append(r13)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d3 }
            X.126 r2 = r12.A05     // Catch:{ all -> 0x00d3 }
            r0 = 11
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r1 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x00d3 }
            r1.<init>(r12, r0, r4)     // Catch:{ all -> 0x00d3 }
            r0 = 16
            r2.A01(r1, r0)     // Catch:{ all -> 0x00d3 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.unlock()
            return r4
        L_0x00af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r1.<init>()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "CallsMessageStore/updateCallLogOnCurrentThread error on creating new call log for this key="
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            r1.append(r13)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d3 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d2
        L_0x00c6:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
        L_0x00d2:
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.unlock()
            throw r1
        L_0x00dc:
            java.lang.String r1 = "CallsMessageStore/updateCallLogOnCurrentThread already exists for this key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A04(X.1lE, X.1po):X.1po");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b4 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x006e=Splitter:B:26:0x006e, B:36:0x00af=Splitter:B:36:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A05(X.C42891yr r16, int r17, int r18) {
        /*
            r15 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r15.A0M
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.readLock()
            r0.lock()
            X.199 r11 = r15.A07     // Catch:{ SQLiteException -> 0x00b5 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00b5 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00b5 }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r0 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x00b5 }
            r14 = 0
            r1[r14] = r0     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r0 = java.lang.Integer.toString(r18)     // Catch:{ SQLiteException -> 0x00b5 }
            r10 = 1
            r1[r10] = r0     // Catch:{ SQLiteException -> 0x00b5 }
            X.0tq r0 = r11.A03     // Catch:{ SQLiteException -> 0x00b5 }
            X.0tf r9 = r0.get()     // Catch:{ SQLiteException -> 0x00b5 }
            X.0tg r7 = r9.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id ORDER BY call_log._id DESC LIMIT ?,?"
            android.database.Cursor r6 = r7.A08(r0, r1)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "_id"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a9 }
        L_0x003a:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r16.AfQ()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x006e
            long r12 = r6.getLong(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id"
            java.lang.String[] r1 = new java.lang.String[r10]     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = java.lang.Long.toString(r12)     // Catch:{ all -> 0x00a9 }
            r1[r14] = r0     // Catch:{ all -> 0x00a9 }
            android.database.Cursor r1 = r7.A08(r4, r1)     // Catch:{ all -> 0x00a9 }
            X.1po r0 = r11.A01(r6, r1)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0061
            r8.add(r0)     // Catch:{ all -> 0x0067 }
        L_0x0061:
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ all -> 0x00a9 }
            goto L_0x003a
        L_0x0067:
            r0 = move-exception
            if (r1 == 0) goto L_0x006d
            r1.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x006e:
            r6.close()     // Catch:{ all -> 0x00b0 }
            r9.close()     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r0 = "CallLogStore/getCalls/size="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00b5 }
            r1.<init>(r0)     // Catch:{ SQLiteException -> 0x00b5 }
            int r0 = r8.size()     // Catch:{ SQLiteException -> 0x00b5 }
            r1.append(r0)     // Catch:{ SQLiteException -> 0x00b5 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteException -> 0x00b5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x00b5 }
            r2.addAll(r8)     // Catch:{ SQLiteException -> 0x00b5 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.readLock()
            r0.unlock()
            java.lang.String r0 = "CallsMessageStore/calls/size:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x00a9:
            r0 = move-exception
            if (r6 == 0) goto L_0x00af
            r6.close()     // Catch:{ all -> 0x00af }
        L_0x00af:
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            throw r0     // Catch:{ SQLiteException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "CallsMessageStore/getCalls/db/unavailable"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00c3 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.readLock()
            r0.unlock()
            return r2
        L_0x00c3:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.readLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A05(X.1yr, int, int):java.util.ArrayList");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x019a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x019f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x01ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x01b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x02de */
    /* JADX WARNING: Missing exception handler attribute for start block: B:192:0x02e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:223:0x039a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:232:0x03a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0129 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x012e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:121:0x01b2=Splitter:B:121:0x01b2, B:43:0x00c7=Splitter:B:43:0x00c7} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:232:0x03a4=Splitter:B:232:0x03a4, B:216:0x038b=Splitter:B:216:0x038b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r22 = this;
            r10 = r22
            X.0tq r13 = r10.A0F
            r13.A04()
            boolean r0 = r13.A01
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "CallsMessageStore/convertCallLogToV2/database is not ready"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0011:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r10.A0M
            r21 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r21.writeLock()
            r0.lock()
            r13.A04()
            java.io.File r0 = r13.A06
            r20 = r0
            long r15 = r20.length()
            X.0tf r19 = r13.A02()     // Catch:{ all -> 0x03a5 }
            r0 = 0
            X.1Zf r9 = new X.1Zf     // Catch:{ all -> 0x03a0 }
            r9.<init>((boolean) r0)     // Catch:{ all -> 0x03a0 }
            X.1cj r18 = r19.A00()     // Catch:{ all -> 0x039b }
            java.lang.String r0 = "CallsMessageStore/convertCallLogToV2"
            r9.A04(r0)     // Catch:{ all -> 0x0396 }
            r7 = 0
            r14 = 0
            r12 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0396 }
            r11.<init>()     // Catch:{ all -> 0x0396 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01ba }
            r6.<init>()     // Catch:{ SQLiteException -> 0x01ba }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01ba }
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ SQLiteException -> 0x01ba }
            r2[r14] = r0     // Catch:{ SQLiteException -> 0x01ba }
            java.lang.String r0 = java.lang.Integer.toString(r12)     // Catch:{ SQLiteException -> 0x01ba }
            r8 = 1
            r2[r8] = r0     // Catch:{ SQLiteException -> 0x01ba }
            X.0tf r5 = r13.get()     // Catch:{ SQLiteDiskIOException -> 0x01b3 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = X.AnonymousClass2EE.A01     // Catch:{ all -> 0x01ae }
            android.database.Cursor r4 = r1.A08(r0, r2)     // Catch:{ all -> 0x01ae }
            if (r4 == 0) goto L_0x00c2
            java.lang.String r0 = "transaction_id"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01a7 }
        L_0x006d:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x00be
            X.0ts r0 = r10.A08     // Catch:{ all -> 0x01a7 }
            X.0rv r1 = r0.A06(r4)     // Catch:{ all -> 0x01a7 }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r1)     // Catch:{ all -> 0x01a7 }
            if (r0 != 0) goto L_0x0094
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a7 }
            r2.<init>()     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = "CallsMessageStore/getLegacyCallsFromMessageTable/Userjid is null! Got: "
            r2.append(r0)     // Catch:{ all -> 0x01a7 }
            r2.append(r1)     // Catch:{ all -> 0x01a7 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a7 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
            goto L_0x006d
        L_0x0094:
            int r2 = r4.getInt(r3)     // Catch:{ all -> 0x01a7 }
            X.0th r0 = r10.A06     // Catch:{ all -> 0x01a7 }
            X.0tZ r0 = r0.A02(r4, r1, r14)     // Catch:{ all -> 0x01a7 }
            X.1rN r0 = (X.C38761rN) r0     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x006d
            java.util.List r0 = r0.A02     // Catch:{ all -> 0x01a7 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x01a7 }
        L_0x00a8:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x01a7 }
            if (r0 == 0) goto L_0x006d
            java.lang.Object r1 = r17.next()     // Catch:{ all -> 0x01a7 }
            X.1po r1 = (X.C37831po) r1     // Catch:{ all -> 0x01a7 }
            X.1lE r0 = r1.A0C     // Catch:{ all -> 0x01a7 }
            int r0 = r0.A00     // Catch:{ all -> 0x01a7 }
            if (r0 != r2) goto L_0x00a8
            r6.add(r1)     // Catch:{ all -> 0x01a7 }
            goto L_0x006d
        L_0x00be:
            r4.close()     // Catch:{ all -> 0x01ae }
            goto L_0x00c7
        L_0x00c2:
            java.lang.String r0 = "CallsMessageStore/getLegacyCallsFromCallLogsDeprecatedTable/db/cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01a7 }
        L_0x00c7:
            r5.close()     // Catch:{ SQLiteDiskIOException -> 0x01b3 }
            java.lang.String r0 = "CallsMessageStore/getLegacyCallsFromCallLogsDeprecatedTable/size:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x01ba }
            r1.<init>(r0)     // Catch:{ SQLiteException -> 0x01ba }
            int r0 = r6.size()     // Catch:{ SQLiteException -> 0x01ba }
            r1.append(r0)     // Catch:{ SQLiteException -> 0x01ba }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteException -> 0x01ba }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x01ba }
            r11.addAll(r6)     // Catch:{ SQLiteException -> 0x01ba }
            int r0 = r11.size()     // Catch:{ SQLiteException -> 0x01ba }
            if (r0 >= r12) goto L_0x01c0
            int r0 = r11.size()     // Catch:{ SQLiteException -> 0x01ba }
            int r12 = r12 - r0
            boolean r0 = r11.isEmpty()     // Catch:{ SQLiteException -> 0x01ba }
            if (r0 == 0) goto L_0x012f
            X.199 r0 = r10.A07     // Catch:{ SQLiteException -> 0x01ba }
            X.0tq r0 = r0.A03     // Catch:{ SQLiteException -> 0x01ba }
            X.0tf r1 = r0.get()     // Catch:{ SQLiteException -> 0x01ba }
            X.0tg r2 = r1.A02     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "SELECT COUNT(1) as count, MIN(message_row_id) as first_id FROM call_logs"
            android.database.Cursor r2 = r2.A08(r0, r7)     // Catch:{ all -> 0x012a }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0123 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0123 }
            r2.close()     // Catch:{ all -> 0x012a }
            r1.close()     // Catch:{ SQLiteException -> 0x01ba }
            goto L_0x0121
        L_0x011a:
            r2.close()     // Catch:{ all -> 0x012a }
            r1.close()     // Catch:{ SQLiteException -> 0x01ba }
            r0 = 0
        L_0x0121:
            int r14 = r14 - r0
            goto L_0x012f
        L_0x0123:
            r0 = move-exception
            if (r2 == 0) goto L_0x0129
            r2.close()     // Catch:{ all -> 0x0129 }
        L_0x0129:
            throw r0     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x012e }
        L_0x012e:
            throw r0     // Catch:{ SQLiteException -> 0x01ba }
        L_0x012f:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01ba }
            r7.<init>()     // Catch:{ SQLiteException -> 0x01ba }
            java.lang.String r6 = X.AnonymousClass2EE.A00     // Catch:{ SQLiteException -> 0x01ba }
            X.0tf r5 = r13.get()     // Catch:{ SQLiteDiskIOException -> 0x01a0 }
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x019b }
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x019b }
            r2 = 0
            long r0 = (long) r14     // Catch:{ all -> 0x019b }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x019b }
            r3[r2] = r0     // Catch:{ all -> 0x019b }
            java.lang.String r0 = java.lang.Integer.toString(r12)     // Catch:{ all -> 0x019b }
            r3[r8] = r0     // Catch:{ all -> 0x019b }
            android.database.Cursor r1 = r4.A08(r6, r3)     // Catch:{ all -> 0x019b }
        L_0x0151:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x018a
            X.0ts r0 = r10.A08     // Catch:{ all -> 0x0194 }
            X.0rv r4 = r0.A06(r1)     // Catch:{ all -> 0x0194 }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r4)     // Catch:{ all -> 0x0194 }
            if (r0 != 0) goto L_0x0178
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r3.<init>()     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = "CallsMessageStore/getLegacyCallsFromMessageTable/Userjid is null! Got: "
            r3.append(r0)     // Catch:{ all -> 0x0194 }
            r3.append(r4)     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0194 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0194 }
            goto L_0x0151
        L_0x0178:
            X.0th r0 = r10.A06     // Catch:{ all -> 0x0194 }
            X.0tZ r0 = r0.A02(r1, r4, r2)     // Catch:{ all -> 0x0194 }
            X.1rN r0 = (X.C38761rN) r0     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x0151
            java.util.List r0 = r0.A13()     // Catch:{ all -> 0x0194 }
            r7.addAll(r0)     // Catch:{ all -> 0x0194 }
            goto L_0x0151
        L_0x018a:
            r1.close()     // Catch:{ all -> 0x019b }
            r5.close()     // Catch:{ SQLiteDiskIOException -> 0x01a0 }
            r11.addAll(r7)     // Catch:{ SQLiteException -> 0x01ba }
            goto L_0x01c0
        L_0x0194:
            r0 = move-exception
            if (r1 == 0) goto L_0x019a
            r1.close()     // Catch:{ all -> 0x019a }
        L_0x019a:
            throw r0     // Catch:{ all -> 0x019b }
        L_0x019b:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x019f }
        L_0x019f:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x01a0 }
        L_0x01a0:
            r1 = move-exception
            X.0y0 r0 = r10.A0E     // Catch:{ SQLiteException -> 0x01ba }
            r0.A00(r8)     // Catch:{ SQLiteException -> 0x01ba }
            goto L_0x01b9
        L_0x01a7:
            r0 = move-exception
            if (r4 == 0) goto L_0x01ad
            r4.close()     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x01b2 }
        L_0x01b2:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x01b3 }
        L_0x01b3:
            r1 = move-exception
            X.0y0 r0 = r10.A0E     // Catch:{ SQLiteException -> 0x01ba }
            r0.A00(r8)     // Catch:{ SQLiteException -> 0x01ba }
        L_0x01b9:
            throw r1     // Catch:{ SQLiteException -> 0x01ba }
        L_0x01ba:
            r1 = move-exception
            java.lang.String r0 = "CallsMessageStore/getLegacyCalls/db/unavailable"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0396 }
        L_0x01c0:
            java.util.Collections.reverse(r11)     // Catch:{ all -> 0x0396 }
            java.util.Iterator r2 = r11.iterator()     // Catch:{ all -> 0x0396 }
            r4 = 0
        L_0x01c8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0396 }
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0396 }
            X.1po r0 = (X.C37831po) r0     // Catch:{ all -> 0x0396 }
            X.1po r1 = A00(r0)     // Catch:{ all -> 0x0396 }
            X.199 r0 = r10.A07     // Catch:{ all -> 0x0396 }
            boolean r0 = r0.A05(r1)     // Catch:{ all -> 0x0396 }
            if (r0 == 0) goto L_0x01c8
            int r4 = r4 + 1
            monitor-enter(r1)     // Catch:{ all -> 0x0396 }
            monitor-exit(r1)     // Catch:{ all -> 0x0396 }
            goto L_0x01c8
        L_0x01e5:
            X.2ED r0 = r10.A00     // Catch:{ all -> 0x0396 }
            X.03L r0 = r0.A00     // Catch:{ all -> 0x0396 }
            java.util.Map r0 = r0.A04()     // Catch:{ all -> 0x0396 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0396 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0396 }
            r2.<init>(r0)     // Catch:{ all -> 0x0396 }
            r1 = 17
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0     // Catch:{ all -> 0x0396 }
            r0.<init>(r1)     // Catch:{ all -> 0x0396 }
            java.util.Collections.sort(r2, r0)     // Catch:{ all -> 0x0396 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0396 }
        L_0x0204:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0396 }
            if (r0 == 0) goto L_0x021d
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0396 }
            X.1po r1 = (X.C37831po) r1     // Catch:{ all -> 0x0396 }
            X.199 r0 = r10.A07     // Catch:{ all -> 0x0396 }
            boolean r0 = r0.A05(r1)     // Catch:{ all -> 0x0396 }
            if (r0 == 0) goto L_0x0204
            int r4 = r4 + 1
            monitor-enter(r1)     // Catch:{ all -> 0x0396 }
            monitor-exit(r1)     // Catch:{ all -> 0x0396 }
            goto L_0x0204
        L_0x021d:
            X.199 r0 = r10.A07     // Catch:{ all -> 0x0396 }
            X.11I r1 = r0.A04     // Catch:{ all -> 0x0396 }
            java.lang.String r5 = "call_log_ready"
            r0 = 0
            int r1 = r1.A00(r5, r0)     // Catch:{ all -> 0x0396 }
            r0 = 1
            if (r1 == r0) goto L_0x02e7
            r3 = 1
            X.17H r0 = r10.A0C     // Catch:{ all -> 0x0396 }
            java.lang.Class<X.1rN> r8 = X.C38761rN.class
            X.1sc r2 = r0.A01     // Catch:{ all -> 0x0396 }
            monitor-enter(r2)     // Catch:{ all -> 0x0396 }
            X.03L r6 = r2.A01     // Catch:{ all -> 0x02e4 }
            java.util.Map r0 = r6.A04()     // Catch:{ all -> 0x02e4 }
            java.util.Collection r1 = r0.values()     // Catch:{ all -> 0x02e4 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x02e4 }
            r0.<init>(r1)     // Catch:{ all -> 0x02e4 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x02e4 }
        L_0x0246:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0262
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x02e4 }
            X.0tZ r1 = (X.C16740tZ) r1     // Catch:{ all -> 0x02e4 }
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x02e4 }
            boolean r0 = r8.isAssignableFrom(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0246
            X.1Vw r0 = r1.A11     // Catch:{ all -> 0x02e4 }
            r6.A03(r0)     // Catch:{ all -> 0x02e4 }
            goto L_0x0246
        L_0x0262:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x02e4 }
            r7.<init>()     // Catch:{ all -> 0x02e4 }
            java.util.Map r6 = r2.A02     // Catch:{ all -> 0x02e4 }
            java.util.Collection r0 = r6.values()     // Catch:{ all -> 0x02e4 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x02e4 }
        L_0x0271:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0295
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x02e4 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x02e4 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x02e4 }
            X.0tZ r1 = (X.C16740tZ) r1     // Catch:{ all -> 0x02e4 }
            if (r1 == 0) goto L_0x0271
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x02e4 }
            boolean r0 = r8.isAssignableFrom(r0)     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x0271
            X.1Vw r0 = r1.A11     // Catch:{ all -> 0x02e4 }
            r7.add(r0)     // Catch:{ all -> 0x02e4 }
            goto L_0x0271
        L_0x0295:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x02e4 }
        L_0x0299:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02e4 }
            if (r0 == 0) goto L_0x02a9
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02e4 }
            X.1Vw r0 = (X.C28381Vw) r0     // Catch:{ all -> 0x02e4 }
            r6.remove(r0)     // Catch:{ all -> 0x02e4 }
            goto L_0x0299
        L_0x02a9:
            monitor-exit(r2)     // Catch:{ all -> 0x0396 }
            X.0tf r2 = r13.A02()     // Catch:{ SQLiteException -> 0x02e9 }
            X.1cj r6 = r2.A00()     // Catch:{ all -> 0x02df }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x02da }
            java.lang.String r0 = "DELETE FROM messages WHERE media_wa_type = 8"
            r1.A0B(r0)     // Catch:{ all -> 0x02da }
            java.lang.String r0 = "call_logs"
            java.lang.String r0 = X.C34031ja.A00(r0)     // Catch:{ all -> 0x02da }
            r1.A0B(r0)     // Catch:{ all -> 0x02da }
            java.lang.String r0 = "call_log_participant"
            java.lang.String r0 = X.C34031ja.A00(r0)     // Catch:{ all -> 0x02da }
            r1.A0B(r0)     // Catch:{ all -> 0x02da }
            X.11I r0 = r10.A0G     // Catch:{ all -> 0x02da }
            r0.A04(r5, r3)     // Catch:{ all -> 0x02da }
            r6.A00()     // Catch:{ all -> 0x02da }
            r6.close()     // Catch:{ all -> 0x02df }
            r2.close()     // Catch:{ SQLiteException -> 0x02e9 }
            goto L_0x02e7
        L_0x02da:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x02de }
        L_0x02de:
            throw r0     // Catch:{ all -> 0x02df }
        L_0x02df:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x02e3 }
        L_0x02e3:
            throw r0     // Catch:{ SQLiteException -> 0x02e9 }
        L_0x02e4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0396 }
            throw r0     // Catch:{ all -> 0x0396 }
        L_0x02e7:
            r5 = 1
            goto L_0x02fe
        L_0x02e9:
            r0 = move-exception
            java.lang.String r3 = "CallsMessageStore/clearLegacyCallLog"
            com.whatsapp.util.Log.e(r3, r0)     // Catch:{ all -> 0x0396 }
            X.0so r2 = r10.A01     // Catch:{ all -> 0x0396 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0396 }
            java.lang.String r0 = "db-migration-call-log-failure"
            r5 = 0
            r2.AcB(r0, r1, r5)     // Catch:{ all -> 0x0396 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0396 }
        L_0x02fe:
            r18.A00()     // Catch:{ all -> 0x0396 }
            r18.close()     // Catch:{ all -> 0x039b }
            r9.A01()     // Catch:{ all -> 0x03a0 }
            r13.A04()     // Catch:{ all -> 0x03a0 }
            long r0 = r20.length()     // Catch:{ all -> 0x03a0 }
            r14 = 0
            if (r5 != 0) goto L_0x0312
            r14 = 1
        L_0x0312:
            double r2 = (double) r15     // Catch:{ all -> 0x03a0 }
            double r7 = (double) r0     // Catch:{ all -> 0x03a0 }
            long r12 = r9.A00()     // Catch:{ all -> 0x03a0 }
            long r5 = (long) r4     // Catch:{ all -> 0x03a0 }
            X.2EF r9 = new X.2EF     // Catch:{ all -> 0x03a0 }
            r9.<init>()     // Catch:{ all -> 0x03a0 }
            X.1Hj r11 = r10.A0H     // Catch:{ all -> 0x03a0 }
            long r0 = (long) r2     // Catch:{ all -> 0x03a0 }
            java.util.List r4 = r11.A00     // Catch:{ all -> 0x03a0 }
            long r2 = X.C24811Hj.A00(r4, r0)     // Catch:{ all -> 0x03a0 }
            double r0 = (double) r2     // Catch:{ all -> 0x03a0 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x03a0 }
            r9.A01 = r0     // Catch:{ all -> 0x03a0 }
            long r0 = (long) r7     // Catch:{ all -> 0x03a0 }
            long r2 = X.C24811Hj.A00(r4, r0)     // Catch:{ all -> 0x03a0 }
            double r0 = (double) r2     // Catch:{ all -> 0x03a0 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x03a0 }
            r9.A00 = r0     // Catch:{ all -> 0x03a0 }
            java.lang.String r0 = "call_log"
            r9.A09 = r0     // Catch:{ all -> 0x03a0 }
            X.0pf r0 = r10.A04     // Catch:{ all -> 0x03a0 }
            long r0 = r0.A02()     // Catch:{ all -> 0x03a0 }
            double r2 = (double) r0     // Catch:{ all -> 0x03a0 }
            long r0 = (long) r2     // Catch:{ all -> 0x03a0 }
            long r2 = X.C24811Hj.A00(r4, r0)     // Catch:{ all -> 0x03a0 }
            double r0 = (double) r2     // Catch:{ all -> 0x03a0 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x03a0 }
            r9.A02 = r0     // Catch:{ all -> 0x03a0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x03a0 }
            r9.A05 = r0     // Catch:{ all -> 0x03a0 }
            java.util.List r0 = r11.A02     // Catch:{ all -> 0x03a0 }
            long r0 = X.C24811Hj.A00(r0, r5)     // Catch:{ all -> 0x03a0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03a0 }
            r9.A07 = r0     // Catch:{ all -> 0x03a0 }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03a0 }
            r9.A08 = r0     // Catch:{ all -> 0x03a0 }
            r9.A06 = r0     // Catch:{ all -> 0x03a0 }
            r2 = 2
            if (r14 == 0) goto L_0x0375
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03a0 }
            goto L_0x037a
        L_0x0375:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03a0 }
        L_0x037a:
            r9.A04 = r0     // Catch:{ all -> 0x03a0 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x03a0 }
            X.0t9 r0 = r10.A0J     // Catch:{ all -> 0x03a0 }
            if (r1 != r2) goto L_0x0388
            r0.A05(r9)     // Catch:{ all -> 0x03a0 }
            goto L_0x038b
        L_0x0388:
            r0.A06(r9)     // Catch:{ all -> 0x03a0 }
        L_0x038b:
            r19.close()     // Catch:{ all -> 0x03a5 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r21.writeLock()
            r0.unlock()
            return
        L_0x0396:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x039a }
        L_0x039a:
            throw r0     // Catch:{ all -> 0x039b }
        L_0x039b:
            r0 = move-exception
            r9.A01()     // Catch:{ all -> 0x03a0 }
            throw r0     // Catch:{ all -> 0x03a0 }
        L_0x03a0:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x03a4 }
        L_0x03a4:
            throw r0     // Catch:{ all -> 0x03a5 }
        L_0x03a5:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r21.writeLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A06():void");
    }

    public final void A07(C35011lE r3) {
        StringBuilder sb = new StringBuilder("CallsMessageStore/checkIfCallLogAlreadyExists; callLog.key=");
        sb.append(r3);
        Log.i(sb.toString());
        if (A03(r3) != null) {
            StringBuilder sb2 = new StringBuilder("CallsMessageStore/checkIfCallLogAlreadyExists call log already exists for this key=");
            sb2.append(r3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public void A08(C37831po r4) {
        StringBuilder sb = new StringBuilder("CallsMessageStore/updateCallLog; callLog.key=");
        sb.append(r4.A0C);
        sb.append("; callLog.row_id=");
        sb.append(r4.A02());
        Log.i(sb.toString());
        this.A05.A01(new RunnableRunnableShape6S0200000_I0_4(this, 10, r4), 16);
    }

    public void A09(C37831po r4) {
        AnonymousClass00B.A00();
        StringBuilder sb = new StringBuilder("CallsMessageStore/updateCallLogOnCurrentThread; callLog.key=");
        sb.append(r4.A0C);
        sb.append("; callLog.row_id=");
        sb.append(r4.A02());
        Log.i(sb.toString());
        A0B(r4);
    }

    public final void A0A(C37831po r6) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.A0M;
        reentrantReadWriteLock.writeLock().lock();
        try {
            boolean A052 = this.A07.A05(r6);
            StringBuilder sb = new StringBuilder();
            sb.append("CallsMessageStore/insertCallLog; callLog.key=");
            sb.append(r6.A0C);
            sb.append("; callLog.getRowId()=");
            sb.append(r6.A02());
            Log.i(sb.toString());
            if (A052) {
                this.A00.A00(r6);
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00c1=Splitter:B:35:0x00c1, B:71:0x010d=Splitter:B:71:0x010d, B:88:0x012f=Splitter:B:88:0x012f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:73:0x0121=Splitter:B:73:0x0121, B:93:0x0134=Splitter:B:93:0x0134} */
    public final void A0B(X.C37831po r18) {
        /*
            r17 = this;
            r4 = r18
            long r1 = r4.A02()
            r10 = -1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0162
            r5 = r17
            X.199 r2 = r5.A07
            monitor-enter(r2)
            boolean r0 = r4.A0F     // Catch:{ all -> 0x015f }
            r12 = 1
            r7 = 0
            if (r0 != 0) goto L_0x001c
            boolean r0 = r4.A0E     // Catch:{ all -> 0x015f }
            r1 = 1
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.String r0 = "Only regular call log is stored here"
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ all -> 0x015f }
            long r8 = r4.A02()     // Catch:{ all -> 0x015f }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x002c
            r1 = 1
        L_0x002c:
            java.lang.String r0 = "CallLog row_id is not set"
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ all -> 0x015f }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x014a
            X.0tq r0 = r2.A03     // Catch:{ all -> 0x015f }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x015f }
            X.1cj r16 = r3.A00()     // Catch:{ all -> 0x0145 }
            X.1lE r10 = r4.A0C     // Catch:{ all -> 0x0140 }
            android.content.ContentValues r13 = r2.A00(r10, r4)     // Catch:{ all -> 0x0140 }
            X.0tg r11 = r3.A02     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "call_log"
            java.lang.String r8 = "_id = ?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ all -> 0x0140 }
            long r0 = r4.A02()     // Catch:{ all -> 0x0140 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0140 }
            r6[r7] = r0     // Catch:{ all -> 0x0140 }
            r11.A00(r9, r13, r8, r6)     // Catch:{ all -> 0x0140 }
            r4.A05()     // Catch:{ all -> 0x0140 }
            r2.A03(r4)     // Catch:{ all -> 0x0140 }
            X.1r0 r6 = r4.A06     // Catch:{ all -> 0x0140 }
            if (r6 == 0) goto L_0x00c8
            boolean r0 = r4.A08     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0136
            long r0 = r4.A02()     // Catch:{ all -> 0x0140 }
            r6.A00 = r0     // Catch:{ all -> 0x0140 }
            X.1r0 r9 = r4.A06     // Catch:{ all -> 0x0140 }
            boolean r0 = r9.A02     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x00c2
            X.195 r14 = r2.A02     // Catch:{ all -> 0x0140 }
            X.0tq r0 = r14.A02     // Catch:{ all -> 0x0140 }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x0140 }
            X.1cj r15 = r6.A00()     // Catch:{ all -> 0x0130 }
            android.content.ContentValues r13 = r14.A00(r9)     // Catch:{ all -> 0x00bd }
            X.0tg r11 = r6.A02     // Catch:{ all -> 0x00bd }
            java.lang.String r10 = "joinable_call_log"
            java.lang.String r8 = "call_log_row_id = ?"
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ all -> 0x00bd }
            long r0 = r9.A00     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x00bd }
            r12[r7] = r0     // Catch:{ all -> 0x00bd }
            r11.A00(r10, r13, r8, r12)     // Catch:{ all -> 0x00bd }
            X.194 r0 = r14.A00     // Catch:{ all -> 0x00bd }
            r0.A00(r9)     // Catch:{ all -> 0x00bd }
            r9.A02 = r7     // Catch:{ all -> 0x00bd }
            r15.A00()     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r1.<init>()     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "JoinableCallLogStore/updateCallLogInternal/updaetd; joinableCallLog.callId="
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r9.A03     // Catch:{ all -> 0x00bd }
            r1.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00bd }
            r15.close()     // Catch:{ all -> 0x0130 }
            goto L_0x0121
        L_0x00bd:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x00c2:
            X.195 r0 = r2.A02     // Catch:{ all -> 0x0140 }
            r0.A06(r9)     // Catch:{ all -> 0x0140 }
            goto L_0x0124
        L_0x00c8:
            boolean r0 = r4.A08     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0136
            X.195 r11 = r2.A02     // Catch:{ all -> 0x0140 }
            java.lang.String r10 = r10.A02     // Catch:{ all -> 0x0140 }
            X.0tq r0 = r11.A02     // Catch:{ all -> 0x0140 }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x0140 }
            X.0tg r9 = r6.A02     // Catch:{ all -> 0x0130 }
            java.lang.String r8 = "joinable_call_log"
            java.lang.String r1 = "call_id = ?"
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ all -> 0x0130 }
            r0[r7] = r10     // Catch:{ all -> 0x0130 }
            r9.A01(r8, r1, r0)     // Catch:{ all -> 0x0130 }
            X.194 r11 = r11.A00     // Catch:{ all -> 0x0130 }
            java.util.HashMap r1 = r11.A00     // Catch:{ all -> 0x0130 }
            monitor-enter(r1)     // Catch:{ all -> 0x0130 }
            java.lang.Object r9 = r1.remove(r10)     // Catch:{ all -> 0x012d }
            X.1r0 r9 = (X.C38571r0) r9     // Catch:{ all -> 0x012d }
            r8 = 0
            r1.put(r10, r8)     // Catch:{ all -> 0x012b }
            monitor-exit(r1)     // Catch:{ all -> 0x012d }
            if (r9 == 0) goto L_0x010d
            com.whatsapp.jid.GroupJid r0 = r9.A01     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x010d
            java.util.HashMap r1 = r11.A01     // Catch:{ all -> 0x0130 }
            monitor-enter(r1)     // Catch:{ all -> 0x0130 }
            com.whatsapp.jid.GroupJid r0 = r9.A01     // Catch:{ all -> 0x010a }
            r1.remove(r0)     // Catch:{ all -> 0x010a }
            com.whatsapp.jid.GroupJid r0 = r9.A01     // Catch:{ all -> 0x010a }
            r1.put(r0, r8)     // Catch:{ all -> 0x0108 }
            monitor-exit(r1)     // Catch:{ all -> 0x010a }
            goto L_0x010d
        L_0x0108:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x010a }
        L_0x010a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010a }
            goto L_0x012f
        L_0x010d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0130 }
            r1.<init>()     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = "JoinableCallLogStore/deleteCallLog/callId="
            r1.append(r0)     // Catch:{ all -> 0x0130 }
            r1.append(r10)     // Catch:{ all -> 0x0130 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0130 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0130 }
        L_0x0121:
            r6.close()     // Catch:{ all -> 0x0140 }
        L_0x0124:
            monitor-enter(r4)     // Catch:{ all -> 0x0140 }
            r4.A08 = r7     // Catch:{ all -> 0x0128 }
            goto L_0x0135
        L_0x0128:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
            throw r0     // Catch:{ all -> 0x0140 }
        L_0x012b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012d }
        L_0x012f:
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0134 }
        L_0x0134:
            throw r0     // Catch:{ all -> 0x0140 }
        L_0x0135:
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
        L_0x0136:
            r16.A00()     // Catch:{ all -> 0x0140 }
            r16.close()     // Catch:{ all -> 0x0145 }
            r3.close()     // Catch:{ all -> 0x015f }
            goto L_0x014a
        L_0x0140:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x0144 }
        L_0x0144:
            throw r0     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0149 }
        L_0x0149:
            throw r0     // Catch:{ all -> 0x015f }
        L_0x014a:
            monitor-exit(r2)
            X.2ED r0 = r5.A00
            r0.A00(r4)
            X.17E r0 = r5.A0B
            android.os.Handler r2 = r0.A02
            r1 = 13
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r5, r1, r4)
            r2.post(r0)
            return
        L_0x015f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A0B(X.1po):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x008b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x0090=Splitter:B:41:0x0090, B:50:0x0096=Splitter:B:50:0x0096} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0C(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r1.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "CallsMessageStore/clearCallLogInBackground currentCallId: "
            r1.append(r0)     // Catch:{ all -> 0x00a0 }
            r1.append(r10)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r9.A0M     // Catch:{ all -> 0x00a0 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00a0 }
            r0.lock()     // Catch:{ all -> 0x00a0 }
            X.2ED r2 = r9.A00     // Catch:{ all -> 0x0097 }
            X.03L r1 = r2.A01     // Catch:{ all -> 0x0097 }
            monitor-enter(r1)     // Catch:{ all -> 0x0097 }
            r0 = -1
            r1.A05(r0)     // Catch:{ all -> 0x0094 }
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            X.03L r1 = r2.A00     // Catch:{ all -> 0x0097 }
            monitor-enter(r1)     // Catch:{ all -> 0x0097 }
            r1.A05(r0)     // Catch:{ all -> 0x0091 }
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            X.0tq r0 = r9.A0F     // Catch:{ all -> 0x0097 }
            X.0tf r7 = r0.A02()     // Catch:{ all -> 0x0097 }
            X.1cj r8 = r7.A00()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = ""
            if (r10 == 0) goto L_0x0053
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = " AND call_id != '"
            r1.append(r0)     // Catch:{ all -> 0x0087 }
            r1.append(r10)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "'"
            r1.append(r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0087 }
        L_0x0053:
            X.0tg r5 = r7.A02     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = "call_log"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "(is_joinable_group_call is NULL OR is_joinable_group_call = ?)"
            r1.append(r0)     // Catch:{ all -> 0x0087 }
            r1.append(r2)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0087 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0087 }
            r1 = 0
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0087 }
            r2[r1] = r0     // Catch:{ all -> 0x0087 }
            r5.A01(r4, r3, r2)     // Catch:{ all -> 0x0087 }
            r8.A00()     // Catch:{ all -> 0x0087 }
            r8.close()     // Catch:{ all -> 0x008c }
            r7.close()     // Catch:{ all -> 0x0097 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00a0 }
            r0.unlock()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r9)
            return
        L_0x0087:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x008b }
        L_0x008b:
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0091:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0096
        L_0x0094:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
        L_0x0096:
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00a0 }
            r0.unlock()     // Catch:{ all -> 0x00a0 }
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A0C(java.lang.String):void");
    }

    public void A0D(Collection collection) {
        StringBuilder sb = new StringBuilder("CallsMessageStore/deleteCallLogs ");
        sb.append(collection.size());
        Log.i(sb.toString());
        this.A05.A01(new RunnableRunnableShape6S0200000_I0_4(this, 14, collection), 17);
    }
}
