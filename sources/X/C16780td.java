package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0td  reason: invalid class name and case insensitive filesystem */
public abstract class C16780td extends SQLiteOpenHelper implements AnonymousClass01J, C16790te {
    public static volatile C34371k9 A06;
    public C16810tg A00;
    public final Context A01;
    public final C16300so A02;
    public final C34371k9 A03;
    public final C33921jP A04;
    public final ReentrantReadWriteLock A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16780td(Context context, C16300so r10, C14710pd r11, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2, r11.A0E(C16620tM.A02, 2779) ? new C34361k8(r10, str) : null);
        this.A01 = context;
        this.A02 = r10;
        if (A06 == null) {
            synchronized (C16780td.class) {
                if (A06 == null) {
                    A06 = new C34371k9(r10);
                }
            }
        }
        this.A03 = A06;
        this.A05 = new ReentrantReadWriteLock();
        this.A04 = new C33921jP(str);
        setWriteAheadLoggingEnabled(true);
    }

    public SQLiteDatabase A00() {
        return super.getWritableDatabase();
    }

    /* renamed from: A01 */
    public C16800tf get() {
        return new C16800tf(this, this.A05.readLock(), false);
    }

    public C16800tf A02() {
        return new C16800tf(this, this.A05.readLock(), true);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0051=Splitter:B:12:0x0051, B:18:0x005d=Splitter:B:18:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r7 = this;
            java.lang.String r6 = " "
            X.0tf r5 = r7.A02()
            X.0tg r0 = r5.A02     // Catch:{ all -> 0x0066 }
            android.database.sqlite.SQLiteDatabase r2 = r0.A00     // Catch:{ all -> 0x0066 }
            boolean r0 = r2.isWriteAheadLoggingEnabled()     // Catch:{ all -> 0x0066 }
            r4 = 1
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = "PRAGMA wal_checkpoint(FULL);"
            r0 = 0
            android.database.Cursor r3 = r2.rawQuery(r1, r0)     // Catch:{ all -> 0x0066 }
            r1 = 0
            if (r3 == 0) goto L_0x005e
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0055
            int r2 = r3.getInt(r1)     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r1.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "BaseSQLiteOpenHelper/wal_checkpoint: "
            r1.append(r0)     // Catch:{ all -> 0x0059 }
            r1.append(r2)     // Catch:{ all -> 0x0059 }
            r1.append(r6)     // Catch:{ all -> 0x0059 }
            int r0 = r3.getInt(r4)     // Catch:{ all -> 0x0059 }
            r1.append(r0)     // Catch:{ all -> 0x0059 }
            r1.append(r6)     // Catch:{ all -> 0x0059 }
            r0 = 2
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0059 }
            r1.append(r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0059 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0051
            r4 = 0
        L_0x0051:
            r3.close()     // Catch:{ all -> 0x0066 }
            goto L_0x0062
        L_0x0055:
            r3.close()     // Catch:{ all -> 0x0066 }
            goto L_0x005e
        L_0x0059:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            r5.close()
            return r1
        L_0x0062:
            r5.close()
            return r4
        L_0x0066:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16780td.A03():boolean");
    }

    public void A04() {
        ReentrantReadWriteLock.WriteLock writeLock = this.A05.writeLock();
        try {
            writeLock.lock();
            close();
            String databaseName = getDatabaseName();
            StringBuilder sb = new StringBuilder();
            sb.append("BaseSQLiteOpenHelper/deleteDatabaseFiles for ");
            sb.append(databaseName);
            Log.i(sb.toString());
            if (databaseName != null) {
                File databasePath = this.A01.getDatabasePath(databaseName);
                if (!databasePath.delete()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("BaseSQLiteOpenHelper/failed to delete ");
                    sb2.append(databaseName);
                    sb2.append(" db");
                    Log.w(sb2.toString());
                }
                C33931jQ.A04(databasePath, "BaseSQLiteOpenHelper");
            }
        } finally {
            writeLock.unlock();
        }
    }

    public abstract C16810tg A05();

    public C33921jP AE6() {
        return this.A04;
    }

    public C16810tg AFO() {
        return AHC();
    }

    public synchronized C16810tg AHC() {
        C16810tg r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            this.A00 = A05();
        }
        return this.A00;
    }

    public void close() {
        super.close();
        C34371k9 r0 = this.A03;
        r0.A01.remove(getDatabaseName());
    }

    @Deprecated
    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00B.A08("Use getReadableLoggableDatabase instead");
        return AHC().A00;
    }

    @Deprecated
    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00B.A08("Use getWritableLoggableDatabase instead");
        return AHC().A00;
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C34371k9 r1 = this.A03;
        String databaseName = getDatabaseName();
        if (!r1.A01.add(databaseName)) {
            r1.A00.A03("db-already-created", databaseName, new Throwable());
        }
    }
}
