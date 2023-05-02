package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0hF  reason: invalid class name and case insensitive filesystem */
public final class C10510hF implements Runnable {
    public final /* synthetic */ C06100Ug A00;

    public C10510hF(C06100Ug r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A00() {
        /*
            r6 = this;
            X.0Ug r5 = r6.A00
            java.util.Set r4 = X.AnonymousClass1FA.A04()
            X.0SM r2 = r5.A03
            java.lang.String r0 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            X.0cS r1 = new X.0cS
            r1.<init>(r0)
            r3 = 0
            r2.A08()
            r2.A09()
            X.0mg r0 = X.AnonymousClass0AP.A00(r2)
            android.database.Cursor r2 = r0.AbE(r1)
            r1 = 0
        L_0x001f:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0031
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x005b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005b }
            r4.add(r0)     // Catch:{ all -> 0x005b }
            goto L_0x001f
        L_0x0031:
            X.C41191vO.A00(r2, r3)
            X.AnonymousClass1FA.A06(r4)
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0050
            X.0mT r0 = r5.A0C
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0056
            X.0mT r0 = r5.A0C
            if (r0 == 0) goto L_0x0051
            X.0GC r0 = (X.AnonymousClass0GC) r0
            android.database.sqlite.SQLiteStatement r0 = r0.A00
            r0.executeUpdateDelete()
        L_0x0050:
            return r4
        L_0x0051:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r1)
            throw r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r1)
            throw r0
        L_0x005b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10510hF.A00():java.util.Set");
    }

    public void run() {
        Set set;
        SQLiteDatabase sQLiteDatabase;
        C06100Ug r3 = this.A00;
        AnonymousClass0SM r5 = r3.A03;
        Lock A07 = r5.A07();
        A07.lock();
        try {
            if (r5.A0D()) {
                if (!r3.A0D) {
                    ((C07730cN) r5.A00()).A00().A05();
                }
                if (!r3.A0D) {
                    Log.e("ROOM", "database is not initialized even though it is open");
                } else if (r3.A0A.compareAndSet(true, false) && !((C07700cK) AnonymousClass0AP.A00(r5)).A00.inTransaction()) {
                    sQLiteDatabase = ((C07700cK) AnonymousClass0AP.A00(r5)).A00;
                    sQLiteDatabase.beginTransactionNonExclusive();
                    set = A00();
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    A07.unlock();
                    if (!set.isEmpty()) {
                        AnonymousClass03P r2 = r3.A00;
                        synchronized (r2) {
                            Iterator it = r2.iterator();
                            if (it.hasNext()) {
                                AnonymousClass000.A0z(it).getValue();
                                throw AnonymousClass000.A0W("notifyByTableInvalidStatus$room_runtime_release");
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            A07.unlock();
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
            set = AnonymousClass1F9.A00();
        } catch (SQLiteException e3) {
            try {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                set = AnonymousClass1F9.A00();
            } catch (Throwable th) {
                A07.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }
}
