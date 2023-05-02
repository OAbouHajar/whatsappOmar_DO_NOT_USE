package X;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.2EL  reason: invalid class name */
public class AnonymousClass2EL extends C30111bl implements AnonymousClass2EI {
    public ReentrantReadWriteLock.WriteLock A00;
    public final AnonymousClass199 A01;
    public final AnonymousClass17G A02;
    public final C14710pd A03;
    public final Object A04 = new Object();

    public AnonymousClass2EL(AnonymousClass199 r3, AnonymousClass17G r4, C24821Hk r5, C14710pd r6) {
        super(r5, "message_main", 1);
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r4;
    }

    public void AMJ() {
        synchronized (this.A04) {
            ReentrantReadWriteLock.WriteLock writeLock = this.A00;
            if (writeLock == null) {
                this.A01.AcB("db-migration-lock-already-null", this.A0C, false);
            } else if (!writeLock.isHeldByCurrentThread()) {
                this.A01.AcB("db-migration-lock-not-held-by-thread", this.A0C, false);
            } else {
                this.A00.unlock();
                this.A00 = null;
            }
        }
    }

    public void ANa() {
        C16900tq r1 = this.A05;
        r1.A03();
        synchronized (this.A04) {
            if (this.A00 != null) {
                this.A01.AcB("db-migration-lock-already-created", this.A0C, false);
            } else {
                r1.A04();
                ReentrantReadWriteLock.WriteLock writeLock = r1.A07;
                this.A00 = writeLock;
                writeLock.lock();
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00d7 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x00c1=Splitter:B:25:0x00c1, B:31:0x00cb=Splitter:B:31:0x00cb} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00d7=Splitter:B:40:0x00d7, B:33:0x00cc=Splitter:B:33:0x00cc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRollback() {
        /*
            r12 = this;
            java.lang.String r0 = "MainMessageStore/resetDatabaseMigration/starting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r6 = r12.A05
            X.0tf r3 = r6.A02()
            X.1cj r11 = r3.A00()     // Catch:{ all -> 0x00d8 }
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = "table"
            java.lang.String r0 = "messages"
            java.lang.String r0 = X.C33961jT.A00(r5, r1, r0)     // Catch:{ all -> 0x00d3 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "SELECT COUNT (*) as rows_count FROM messages"
            r7 = 0
            android.database.Cursor r2 = r5.A08(r0, r7)     // Catch:{ all -> 0x00d3 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "rows_count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c5 }
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x00c5 }
            r0 = 1
            if (r1 <= r0) goto L_0x00c1
            r2.close()     // Catch:{ all -> 0x00d3 }
            r6.A04()     // Catch:{ all -> 0x00d3 }
            X.1jC r4 = r6.A04     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "databasehelper/rollbackMigration"
            X.1Zf r8 = new X.1Zf     // Catch:{ all -> 0x00d3 }
            r8.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00d3 }
            X.1cj r10 = r3.A00()     // Catch:{ all -> 0x00d3 }
            android.database.sqlite.SQLiteDatabase r0 = r5.A00     // Catch:{ all -> 0x00bc }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00bc }
            r0 = 0
            r4.A0A(r5, r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r9 = "migration_completed"
            r0 = 0
            java.lang.String r2 = "DatabaseHelper"
            X.C33971jU.A02(r5, r9, r2, r0)     // Catch:{ all -> 0x00bc }
            boolean r1 = X.C33811jC.A03(r5)     // Catch:{ all -> 0x00bc }
            boolean r0 = r4.A0F(r5)     // Catch:{ all -> 0x00bc }
            r4.A0C(r5, r1, r0)     // Catch:{ all -> 0x00bc }
            r10.A00()     // Catch:{ all -> 0x00bc }
            r1 = 44
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x00bc }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x00bc }
            r3.A03(r0)     // Catch:{ all -> 0x00bc }
            r10.close()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "databasehelper/finalizeMigration time spent:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r2.<init>(r0)     // Catch:{ all -> 0x00d3 }
            long r0 = r8.A01()     // Catch:{ all -> 0x00d3 }
            r2.append(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00d3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "message"
            r5.A01(r0, r7, r7)     // Catch:{ all -> 0x00d3 }
            X.11I r1 = r12.A06     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "main_message_ready"
            r1.A03(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "migration_message_main_index"
            r1.A03(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "migration_message_main_retry"
            r1.A03(r0)     // Catch:{ all -> 0x00d3 }
            r6.A04()     // Catch:{ all -> 0x00d3 }
            r0 = 0
            r4.A0A(r5, r0)     // Catch:{ all -> 0x00d3 }
            r11.A00()     // Catch:{ all -> 0x00d3 }
            r11.close()     // Catch:{ all -> 0x00d8 }
            r3.close()
            java.lang.String r0 = "MainMessageStore/resetDatabaseMigration/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00bc:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x00cb }
            goto L_0x00cb
        L_0x00c1:
            r2.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x00cc
        L_0x00c5:
            r0 = move-exception
            if (r2 == 0) goto L_0x00cb
            r2.close()     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00cc:
            r11.close()     // Catch:{ all -> 0x00d8 }
            r3.close()
            return
        L_0x00d3:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2EL.onRollback():void");
    }
}
