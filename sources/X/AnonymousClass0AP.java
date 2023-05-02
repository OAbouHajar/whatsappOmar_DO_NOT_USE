package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0AP  reason: invalid class name */
public final class AnonymousClass0AP extends SQLiteOpenHelper {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final C06190Uq A03;
    public final AnonymousClass0NU A04;
    public final AnonymousClass0U2 A05;
    public final boolean A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0AP(android.content.Context r9, X.C06190Uq r10, X.AnonymousClass0NU r11, java.lang.String r12, boolean r13) {
        /*
            r8 = this;
            r4 = r12
            r6 = 16
            X.0Xk r7 = new X.0Xk
            r7.<init>(r10, r11)
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A02 = r9
            r8.A04 = r11
            r8.A03 = r10
            r8.A06 = r13
            if (r12 != 0) goto L_0x0023
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            X.C18450wi.A0B(r4)
        L_0x0023:
            java.io.File r1 = r9.getCacheDir()
            X.C18450wi.A0B(r1)
            X.0U2 r0 = new X.0U2
            r0.<init>(r1, r4)
            r8.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.<init>(android.content.Context, X.0Uq, X.0NU, java.lang.String, boolean):void");
    }

    public static C13620mg A00(AnonymousClass0SM r0) {
        return ((C07730cN) r0.A00()).A00().A05();
    }

    public static final C07700cK A01(SQLiteDatabase sQLiteDatabase, AnonymousClass0NU r3) {
        C18450wi.A0H(r3, 0);
        C07700cK r1 = r3.A00;
        if (r1 != null && r1.A01(sQLiteDatabase)) {
            return r1;
        }
        C07700cK r12 = new C07700cK(sQLiteDatabase);
        r3.A00 = r12;
        return r12;
    }

    public static final void A02(SQLiteDatabase sQLiteDatabase, C06190Uq r1, AnonymousClass0NU r2) {
        C18450wi.A0C(sQLiteDatabase);
        r1.A03(A01(sQLiteDatabase, r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.C13620mg r5) {
        /*
            r4 = 0
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r3 = r5.AbF(r0)
            r2 = 1
            r1 = 0
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0016
            int r0 = r3.getInt(r4)     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            X.C41191vO.A00(r3, r1)
            return r2
        L_0x001b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.A03(X.0mg):boolean");
    }

    public final SQLiteDatabase A04() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        C18450wi.A0B(writableDatabase);
        return writableDatabase;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|(1:3)|5|6|(4:8|9|(1:11)|12)|17|(2:21|(1:23))|24|25|26|27|28|29|30|31|49|50|(1:52)(1:53)|54|55|(1:57)|58|60) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        if ((r1 instanceof android.database.sqlite.SQLiteException) != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (getDatabaseName() == null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c4, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C13620mg A05() {
        /*
            r6 = this;
            X.0U2 r4 = r6.A05     // Catch:{ all -> 0x00c6 }
            boolean r0 = r6.A01     // Catch:{ all -> 0x00c6 }
            r5 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = r6.getDatabaseName()     // Catch:{ all -> 0x00c6 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.util.concurrent.locks.Lock r3 = r4.A02     // Catch:{ all -> 0x00c6 }
            r3.lock()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x003b
            java.io.File r1 = r4.A01     // Catch:{ IOException -> 0x0030 }
            java.io.File r0 = r1.getParentFile()     // Catch:{ IOException -> 0x0030 }
            if (r0 == 0) goto L_0x0021
            r0.mkdirs()     // Catch:{ IOException -> 0x0030 }
        L_0x0021:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0030 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0030 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0030 }
            r0.lock()     // Catch:{ IOException -> 0x0030 }
            r4.A00 = r0     // Catch:{ IOException -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            r2 = move-exception
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "SupportSQLiteLock"
            java.lang.String r0 = "Unable to grab file lock."
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x00c6 }
        L_0x003b:
            r6.A00 = r5     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = r6.getDatabaseName()     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x0063
            android.content.Context r0 = r6.A02     // Catch:{ all -> 0x00c6 }
            java.io.File r0 = r0.getDatabasePath(r5)     // Catch:{ all -> 0x00c6 }
            java.io.File r1 = r0.getParentFile()     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x0063
            r1.mkdirs()     // Catch:{ all -> 0x00c6 }
            boolean r0 = r1.isDirectory()     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "Invalid database parent file, not a directory: "
            java.lang.String r1 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x00c6 }
        L_0x0063:
            android.database.sqlite.SQLiteDatabase r1 = r6.A04()     // Catch:{ all -> 0x0068 }
            goto L_0x00a3
        L_0x0068:
            super.close()     // Catch:{ all -> 0x00c6 }
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0070 }
        L_0x0070:
            android.database.sqlite.SQLiteDatabase r1 = r6.A04()     // Catch:{ all -> 0x0075 }
            goto L_0x00a3
        L_0x0075:
            r2 = move-exception
            super.close()     // Catch:{ all -> 0x00c6 }
            boolean r0 = r2 instanceof X.C11140iG     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x0094
            X.0iG r2 = (X.C11140iG) r2     // Catch:{ all -> 0x00c6 }
            java.lang.Throwable r1 = r2.cause     // Catch:{ all -> 0x00c6 }
            X.0K3 r0 = r2.callbackName     // Catch:{ all -> 0x00c6 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x00c6 }
            switch(r0) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00c4;
                default: goto L_0x008a;
            }     // Catch:{ all -> 0x00c6 }
        L_0x008a:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00c4
        L_0x008e:
            android.content.Context r0 = r6.A02     // Catch:{ all -> 0x00c6 }
            r0.deleteDatabase(r5)     // Catch:{ all -> 0x00c6 }
            goto L_0x009f
        L_0x0094:
            boolean r0 = r2 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00c5
            boolean r0 = r6.A06     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00c5
            goto L_0x008e
        L_0x009f:
            android.database.sqlite.SQLiteDatabase r1 = r6.A04()     // Catch:{ 0iG -> 0x00c0 }
        L_0x00a3:
            boolean r0 = r6.A00     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00af
            r6.close()     // Catch:{ all -> 0x00c6 }
            X.0mg r1 = r6.A05()     // Catch:{ all -> 0x00c6 }
            goto L_0x00b5
        L_0x00af:
            X.0NU r0 = r6.A04     // Catch:{ all -> 0x00c6 }
            X.0cK r1 = A01(r1, r0)     // Catch:{ all -> 0x00c6 }
        L_0x00b5:
            java.nio.channels.FileChannel r0 = r4.A00     // Catch:{ IOException -> 0x00bc }
            if (r0 == 0) goto L_0x00bc
            r0.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            r3.unlock()
            return r1
        L_0x00c0:
            r0 = move-exception
            java.lang.Throwable r0 = r0.cause     // Catch:{ all -> 0x00c6 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x00c4:
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c5:
            throw r2     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r2 = move-exception
            X.0U2 r1 = r6.A05
            java.nio.channels.FileChannel r0 = r1.A00     // Catch:{ IOException -> 0x00d0 }
            if (r0 == 0) goto L_0x00d0
            r0.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            java.util.concurrent.locks.Lock r0 = r1.A02
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.A05():X.0mg");
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            AnonymousClass0U2 r4 = this.A05;
            Lock lock = r4.A02;
            lock.lock();
            super.close();
            this.A04.A00 = null;
            this.A01 = false;
            try {
                FileChannel fileChannel = r4.A00;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException unused) {
            }
            lock.unlock();
        } catch (Throwable th) {
            AnonymousClass0U2 r1 = this.A05;
            try {
                FileChannel fileChannel2 = r1.A00;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (IOException unused2) {
            }
            r1.A02.unlock();
            throw th;
        }
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C18450wi.A0H(sQLiteDatabase, 0);
        try {
            A01(sQLiteDatabase, this.A04);
        } catch (Throwable th) {
            throw new C11140iG(AnonymousClass0K3.ON_CONFIGURE, th);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C18450wi.A0H(sQLiteDatabase, 0);
        try {
            C06190Uq r4 = this.A03;
            C07700cK A012 = A01(sQLiteDatabase, this.A04);
            AnonymousClass0GB r42 = (AnonymousClass0GB) r4;
            boolean A032 = A03(A012);
            AnonymousClass0XC r1 = r42.A01;
            r1.A09(A012);
            if (!A032) {
                AnonymousClass0O2 A08 = r1.A08(A012);
                if (!A08.A01) {
                    throw AnonymousClass000.A0V(AnonymousClass000.A0h(A08.A00, AnonymousClass000.A0r("Pre-packaged database has an invalid schema: ")));
                }
            }
            r42.A06(A012);
            WorkDatabase_Impl workDatabase_Impl = r1.A00;
            List list = workDatabase_Impl.A01;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    workDatabase_Impl.A01.get(i2);
                }
            }
        } catch (Throwable th) {
            throw new C11140iG(AnonymousClass0K3.ON_CREATE, th);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        C18450wi.A0H(sQLiteDatabase, 0);
        this.A00 = true;
        try {
            ((AnonymousClass0GB) this.A03).A04(A01(sQLiteDatabase, this.A04), i2, i3);
        } catch (Throwable th) {
            throw new C11140iG(AnonymousClass0K3.ON_DOWNGRADE, th);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        C18450wi.A0H(sQLiteDatabase, 0);
        if (!this.A00) {
            try {
                C06190Uq r8 = this.A03;
                C07700cK A012 = A01(sQLiteDatabase, this.A04);
                AnonymousClass0GB r82 = (AnonymousClass0GB) r8;
                r82.A05(A012);
                WorkDatabase_Impl workDatabase_Impl = r82.A01.A00;
                workDatabase_Impl.A0B = A012;
                A012.A8n("PRAGMA foreign_keys = ON");
                C06100Ug r1 = workDatabase_Impl.A06;
                synchronized (r1.A05) {
                    if (r1.A0D) {
                        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    } else {
                        A012.A8n("PRAGMA temp_store = MEMORY;");
                        A012.A8n("PRAGMA recursive_triggers='ON';");
                        A012.A8n("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        r1.A00(A012);
                        r1.A0C = A012.A6T("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                        r1.A0D = true;
                    }
                }
                List list = workDatabase_Impl.A01;
                if (list != null) {
                    int i2 = 0;
                    int size = list.size();
                    while (i2 < size) {
                        workDatabase_Impl.A01.get(i2);
                        SQLiteDatabase sQLiteDatabase2 = A012.A00;
                        sQLiteDatabase2.beginTransaction();
                        try {
                            StringBuilder A0r = AnonymousClass000.A0r("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                            A0r.append(System.currentTimeMillis() - C04440Mo.A00);
                            A012.A8n(AnonymousClass000.A0h(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))", A0r));
                            sQLiteDatabase2.setTransactionSuccessful();
                            sQLiteDatabase2.endTransaction();
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteDatabase2.endTransaction();
                            throw th;
                        }
                    }
                }
                r82.A00 = null;
            } catch (Throwable th2) {
                throw new C11140iG(AnonymousClass0K3.ON_OPEN, th2);
            }
        }
        this.A01 = true;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        C18450wi.A0H(sQLiteDatabase, 0);
        this.A00 = true;
        try {
            this.A03.A04(A01(sQLiteDatabase, this.A04), i2, i3);
        } catch (Throwable th) {
            throw new C11140iG(AnonymousClass0K3.ON_UPGRADE, th);
        }
    }
}
