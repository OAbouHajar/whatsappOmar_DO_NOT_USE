package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0wZ  reason: invalid class name and case insensitive filesystem */
public abstract class C18360wZ {
    public final AnonymousClass027 A00 = new AnonymousClass027(0);
    public final C16300so A01;
    public final C15810rt A02;
    public final C16900tq A03;
    public final AnonymousClass11E A04;
    public final AnonymousClass11D A05;

    public C18360wZ(C16300so r3, C15810rt r4, C16900tq r5, AnonymousClass11E r6, AnonymousClass11D r7) {
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        r3 = r7;
        r4 = r7 instanceof X.C24481Gc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r4 != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        r1 = (X.C18350wY) r3;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        if (r0 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r0.A03(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        r0 = r1.A03;
        r0.A04();
        r0.A07.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r7.A02.A0C();
        r1 = new java.lang.StringBuilder();
        r1.append("BaseForceMigrationManager/processMigrations, running forced migrations. blocking = ");
        r1.append(r8);
        com.whatsapp.util.Log.i(r1.toString());
        r2 = new X.C30101bk(new X.C30091bj[0]);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (r8 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r6.A04(r2, r5, 7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        r3 = (X.C18350wY) r3;
        r0 = r3.A03;
        r0.A04();
        r0.A07.unlock();
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        if (r1 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r1.A03(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(boolean r8) {
        /*
            r7 = this;
            X.0tq r0 = r7.A03
            r0.A04()
            boolean r0 = r0.A01
            r2 = 0
            if (r0 == 0) goto L_0x00f6
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.11D r0 = r7.A05
            X.0vs r0 = r0.A00()
            X.0v0 r0 = r0.values()
            X.1Ub r4 = r0.iterator()
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r3 = r4.next()
            X.1bl r3 = (X.C30111bl) r3
            boolean r0 = r7 instanceof X.C24481Gc
            if (r0 == 0) goto L_0x0046
            boolean r0 = r3.A0M()
        L_0x0031:
            if (r0 == 0) goto L_0x001d
            int r1 = r3.A03()
            r0 = 3
            if (r1 != r0) goto L_0x001d
            boolean r0 = r3.A0L()
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = r3.A0C
            r5.add(r0)
            goto L_0x001d
        L_0x0046:
            boolean r0 = r3.A0N()
            goto L_0x0031
        L_0x004b:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00f6
            X.11E r6 = r7.A04
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0E
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00f6
            monitor-enter(r7)
            X.027 r3 = r7.A00     // Catch:{ all -> 0x00f3 }
            java.lang.Object r0 = r3.A01()     // Catch:{ all -> 0x00f3 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00f3 }
            r1 = 1
            if (r0 == 0) goto L_0x006f
            int r0 = r0.intValue()     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x006f
            monitor-exit(r7)     // Catch:{ all -> 0x00f3 }
            return
        L_0x006f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00f3 }
            r3.A09(r0)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f3 }
            r3 = r7
            boolean r4 = r7 instanceof X.C24481Gc
            if (r4 != 0) goto L_0x0090
            r1 = r3
            X.0wY r1 = (X.C18350wY) r1
            X.0y3 r0 = r1.A00
            if (r0 == 0) goto L_0x0086
            r0.A03(r2)
        L_0x0086:
            X.0tq r0 = r1.A03
            r0.A04()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A07
            r0.lock()
        L_0x0090:
            X.0rt r0 = r7.A02     // Catch:{ all -> 0x00d5 }
            r0.A0C()     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r1.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "BaseForceMigrationManager/processMigrations, running forced migrations. blocking = "
            r1.append(r0)     // Catch:{ all -> 0x00d5 }
            r1.append(r8)     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d5 }
            X.1bj[] r0 = new X.C30091bj[r2]     // Catch:{ all -> 0x00d5 }
            X.1bk r2 = new X.1bk     // Catch:{ all -> 0x00d5 }
            r2.<init>(r0)     // Catch:{ all -> 0x00d5 }
            r1 = 7
            r0 = 2
            if (r8 == 0) goto L_0x00b5
            r0 = 3
        L_0x00b5:
            r6.A04(r2, r5, r1, r0)     // Catch:{ all -> 0x00d5 }
            boolean r0 = r7.A01(r5, r8)
            if (r0 == 0) goto L_0x00f6
            if (r4 != 0) goto L_0x00f6
            X.0wY r3 = (X.C18350wY) r3
            X.0tq r0 = r3.A03
            r0.A04()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A07
            r0.unlock()
            X.0y3 r1 = r3.A00
            if (r1 == 0) goto L_0x00f6
            r0 = 1
            r1.A03(r0)
            return
        L_0x00d5:
            r2 = move-exception
            boolean r0 = r7.A01(r5, r8)
            if (r0 == 0) goto L_0x00f2
            if (r4 != 0) goto L_0x00f2
            X.0wY r3 = (X.C18350wY) r3
            X.0tq r0 = r3.A03
            r0.A04()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A07
            r0.unlock()
            X.0y3 r1 = r3.A00
            if (r1 == 0) goto L_0x00f2
            r0 = 1
            r1.A03(r0)
        L_0x00f2:
            throw r2
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f3 }
            throw r0
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18360wZ.A00(boolean):void");
    }

    public boolean A01(Set set, boolean z2) {
        boolean z3;
        AnonymousClass027 r1;
        int i2;
        AnonymousClass11D r7 = this.A05;
        C30111bl r0 = (C30111bl) r7.A00().get("migration_jid_store");
        if (r0 == null || r0.A0L()) {
            z3 = true;
        } else {
            Log.e("BaseForceMigrationManager/afterForcedMigration, failed to migrate jidStore");
            z3 = false;
        }
        C30111bl r02 = (C30111bl) r7.A00().get("migration_chat_store");
        if (r02 != null && !r02.A0L()) {
            Log.e("BaseForceMigrationManager/afterForcedMigration, failed to migrate chatStore");
            z3 = false;
        }
        Iterator it = set.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C30111bl r2 = (C30111bl) r7.A00().get(str);
            if (r2 != null && !r2.A0L()) {
                StringBuilder sb = new StringBuilder("BaseForceMigrationManager/afterForcedMigration, failed to migrate ");
                sb.append(str);
                sb.append(", blocking = ");
                sb.append(z2);
                Log.e(sb.toString());
                if (z4 || r2.A0J()) {
                    z3 = false;
                } else {
                    z3 = false;
                    z4 = true;
                }
            }
        }
        if (z3) {
            StringBuilder sb2 = new StringBuilder("BaseForceMigrationManager/afterForcedMigration, successfully migrated all forced migration, blocking = ");
            sb2.append(z2);
            Log.i(sb2.toString());
            r1 = this.A00;
            i2 = 5;
        } else {
            StringBuilder sb3 = new StringBuilder("BaseForceMigrationManager/afterForcedMigration, failed to migrate all forced migration. blocking = ");
            sb3.append(z2);
            Log.i(sb3.toString());
            this.A01.AcB("ForcedDatabaseMigrationManager/failedToMigrate", "failedToMigrate", true);
            r1 = this.A00;
            if (!z2) {
                i2 = 2;
            } else {
                i2 = 4;
                if (z4) {
                    i2 = 3;
                }
            }
        }
        r1.A09(Integer.valueOf(i2));
        return z3;
    }
}
