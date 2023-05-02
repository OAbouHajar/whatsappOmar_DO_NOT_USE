package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0tq  reason: invalid class name and case insensitive filesystem */
public class C16900tq implements AnonymousClass01J {
    public boolean A00;
    public boolean A01;
    public final C16040sK A02;
    public final AnonymousClass1ZU A03;
    public final C33811jC A04;
    public final C23591Co A05;
    public final File A06;
    public final ReentrantReadWriteLock.WriteLock A07;
    public final ReentrantReadWriteLock A08;

    public C16900tq(C16040sK r17, C16980tz r18, C16290sm r19, AnonymousClass0y0 r20, C206911f r21, C14710pd r22, C15960sC r23, C23591Co r24, AnonymousClass01D r25) {
        Context context = r18.A00;
        File databasePath = context.getDatabasePath("msgstore.db");
        this.A06 = databasePath;
        boolean A0E = r22.A0E(C16620tM.A02, 1350);
        C33891jM r3 = new C33891jM();
        r3.A01 = true;
        r3.A02 = A0E;
        C16290sm r11 = r19;
        r3.A00 = r11.A00.getBoolean("force_db_check", false);
        C206911f r8 = r21;
        this.A04 = new C33811jC(context, new C33921jP("msgstore.db"), new C33901jN(r3), r8, databasePath, Collections.singleton(new C33911jO(r11, r20, this, r23, r25)));
        this.A02 = r17;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A08 = reentrantReadWriteLock;
        this.A07 = reentrantReadWriteLock.writeLock();
        this.A05 = r24;
        this.A03 = new AnonymousClass1ZU();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0082=Splitter:B:30:0x0082, B:36:0x008c=Splitter:B:36:0x008c} */
    public int A00() {
        /*
            r9 = this;
            r9.A04()
            X.1jC r4 = r9.A04
            r9.A04()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r0.readLock()
            r8.lock()     // Catch:{ all -> 0x00f2 }
            java.lang.Object r3 = r4.A08     // Catch:{ all -> 0x00f2 }
            monitor-enter(r3)     // Catch:{ all -> 0x00f2 }
            java.lang.Integer r0 = r4.A01     // Catch:{ all -> 0x00ef }
            if (r0 != 0) goto L_0x00d5
            java.lang.String r0 = "databasehelper/getInitialMessageCount"
            X.1Zf r6 = new X.1Zf     // Catch:{ all -> 0x00ef }
            r6.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00ef }
            r5 = 0
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            X.0tg r2 = r4.A00     // Catch:{ all -> 0x00be }
            if (r2 != 0) goto L_0x0029
            monitor-exit(r4)     // Catch:{ all -> 0x00be }
            r0 = 0
            goto L_0x00ea
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            r1.<init>()     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM "
            r1.append(r0)     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            X.0tg r0 = r4.A00     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            boolean r0 = r4.A0E(r0)     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "message"
        L_0x003e:
            r1.append(r0)     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            r0 = 0
            android.database.Cursor r7 = r2.A08(r1, r0)     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            goto L_0x004e
        L_0x004b:
            java.lang.String r0 = "messages"
            goto L_0x003e
        L_0x004e:
            java.lang.String r0 = "count"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0086 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0082
            int r5 = r7.getInt(r1)     // Catch:{ all -> 0x0086 }
            if (r5 <= 0) goto L_0x0062
            int r5 = r5 + -1
        L_0x0062:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r2.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "databasehelper/getInitialMessageCount "
            r2.append(r0)     // Catch:{ all -> 0x0086 }
            r2.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = " | time spent:"
            r2.append(r0)     // Catch:{ all -> 0x0086 }
            long r0 = r6.A01()     // Catch:{ all -> 0x0086 }
            r2.append(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0086 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0086 }
        L_0x0082:
            r7.close()     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
            goto L_0x009f
        L_0x0086:
            r0 = move-exception
            if (r7 == 0) goto L_0x008c
            r7.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            throw r0     // Catch:{ SQLiteFullException -> 0x00b9, SQLiteException -> 0x008d }
        L_0x008d:
            r2 = move-exception
            java.lang.String r1 = r2.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            java.lang.String r0 = "file is encrypted"
            boolean r0 = r1.contains(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "databasehelper/getInitialMessageCount/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
        L_0x009f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            java.lang.String r0 = "databasehelper/getInitialMessageCount/nocursor | time spent:"
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            long r0 = r6.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            goto L_0x00e0
        L_0x00b8:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
        L_0x00b9:
            r0 = move-exception
            r4.A05(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
        L_0x00be:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00be }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00da, SQLiteException -> 0x00c1 }
        L_0x00c1:
            r2 = move-exception
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = "file is encrypted"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "databasehelper/getInitialMessageCount/encrypted-file-error"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x00ef }
            goto L_0x00e0
        L_0x00d4:
            throw r2     // Catch:{ all -> 0x00ef }
        L_0x00d5:
            int r0 = r0.intValue()     // Catch:{ all -> 0x00ef }
            goto L_0x00ea
        L_0x00da:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/getInitialMessageCount/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00ef }
        L_0x00e0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00ef }
            r4.A01 = r0     // Catch:{ all -> 0x00ef }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00ef }
        L_0x00ea:
            monitor-exit(r3)     // Catch:{ all -> 0x00ef }
            r8.unlock()
            return r0
        L_0x00ef:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r0 = move-exception
            r8.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16900tq.A00():int");
    }

    /* renamed from: A01 */
    public C16800tf get() {
        A04();
        ReentrantReadWriteLock.ReadLock readLock = this.A08.readLock();
        A04();
        return new C16800tf(this.A04, readLock, false);
    }

    public C16800tf A02() {
        A04();
        ReentrantReadWriteLock.ReadLock readLock = this.A08.readLock();
        A04();
        return new C16800tf(this.A04, readLock, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1.getReadHoldCount() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r2 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r2.A08
            int r0 = r1.getWriteHoldCount()
            if (r0 > 0) goto L_0x000f
            int r1 = r1.getReadHoldCount()
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.AnonymousClass00B.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16900tq.A03():void");
    }

    public void A04() {
        AnonymousClass1ZU r2 = this.A03;
        if (r2.A06()) {
            r2.A04(new IDxCallableShape148S0100000_2_I0(this, 12));
            if (r2.A05()) {
                A07((C18370wa) null, true);
            }
            r2.A00();
        }
    }

    public final void A05() {
        C33811jC r0 = this.A04;
        r0.close();
        File file = r0.A07;
        boolean delete = file.delete() & C33931jQ.A04(file, "databasehelper");
        StringBuilder sb = new StringBuilder("msgstore-manager/deletedb/result/");
        sb.append(delete);
        Log.i(sb.toString());
    }

    public final void A06() {
        Log.i("msgstore-manager/setup");
        AnonymousClass00B.A0G(this.A07.isHeldByCurrentThread());
        synchronized (this) {
            C33811jC r5 = this.A04;
            try {
                File file = r5.A07;
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.delete();
                C33931jQ.A04(file, "databasehelper");
                AnonymousClass1XI.A0F(file, "msgstore/create-db/list ");
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 805306384);
                AnonymousClass00B.A06(openDatabase);
                r5.onCreate(openDatabase);
                AnonymousClass1XI.A0F(file, "msgstore/create-db/done/list ");
                r5.AHC();
                this.A01 = true;
            } catch (Throwable th) {
                AnonymousClass1XI.A0F(r5.A07, "msgstore/create-db/done/list ");
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        return r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.C18370wa r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "msgstore-manager/checkhealth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r5.A07
            r3.lock()
            monitor-enter(r5)
            if (r7 == 0) goto L_0x0033
            X.1ZU r4 = r5.A03     // Catch:{ all -> 0x00e0 }
            monitor-enter(r4)     // Catch:{ all -> 0x00e0 }
            int r2 = r4.A00     // Catch:{ all -> 0x0030 }
            r1 = 3
            r0 = 0
            if (r2 <= r1) goto L_0x0017
            r0 = 1
        L_0x0017:
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0033
            boolean r1 = r5.A01     // Catch:{ all -> 0x00e0 }
            r3.unlock()     // Catch:{ all -> 0x00f6 }
            r4.A01()     // Catch:{ all -> 0x00f6 }
            boolean r0 = r5.A01     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x002e
            if (r6 == 0) goto L_0x002e
            X.0wY r6 = (X.C18350wY) r6     // Catch:{ all -> 0x00f6 }
            r0 = 1
            r6.A00(r0)     // Catch:{ all -> 0x00f6 }
        L_0x002e:
            monitor-exit(r5)     // Catch:{ all -> 0x00f6 }
            return r1
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x0033:
            boolean r0 = r5.A01     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x00c5
            X.1ZU r0 = r5.A03     // Catch:{ all -> 0x00e0 }
            r0.A03()     // Catch:{ all -> 0x00e0 }
            java.io.File r4 = r5.A06     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "-journal"
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e0 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00e0 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00e0 }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "msgstore-manager/checkhealth/journal/delete "
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = ".back"
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e0 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00e0 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00e0 }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "msgstore-manager/checkhealth/back/delete "
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e0 }
            X.1jC r0 = r5.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bc, SQLiteException -> 0x00b5 }
            r0.AHC()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bc, SQLiteException -> 0x00b5 }
            r0 = 1
            r5.A01 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bc, SQLiteException -> 0x00b5 }
            r5.A00 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bc, SQLiteException -> 0x00b5 }
            goto L_0x00c5
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/checkhealth no db"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00e0 }
            goto L_0x00c5
        L_0x00bc:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/checkhealth "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e0 }
            r5.A05()     // Catch:{ all -> 0x00e0 }
        L_0x00c5:
            r3.unlock()     // Catch:{ all -> 0x00f6 }
            X.1ZU r0 = r5.A03     // Catch:{ all -> 0x00f6 }
            r0.A01()     // Catch:{ all -> 0x00f6 }
            boolean r0 = r5.A01     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00d9
            if (r6 == 0) goto L_0x00d9
            X.0wY r6 = (X.C18350wY) r6     // Catch:{ all -> 0x00f6 }
            r0 = 1
            r6.A00(r0)     // Catch:{ all -> 0x00f6 }
        L_0x00d9:
            monitor-exit(r5)     // Catch:{ all -> 0x00f6 }
            r5.A04()
            boolean r1 = r5.A01
            return r1
        L_0x00e0:
            r1 = move-exception
            r3.unlock()     // Catch:{ all -> 0x00f6 }
            X.1ZU r0 = r5.A03     // Catch:{ all -> 0x00f6 }
            r0.A01()     // Catch:{ all -> 0x00f6 }
            boolean r0 = r5.A01     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00f5
            if (r6 == 0) goto L_0x00f5
            X.0wY r6 = (X.C18350wY) r6     // Catch:{ all -> 0x00f6 }
            r0 = 1
            r6.A00(r0)     // Catch:{ all -> 0x00f6 }
        L_0x00f5:
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00f6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16900tq.A07(X.0wa, boolean):boolean");
    }
}
