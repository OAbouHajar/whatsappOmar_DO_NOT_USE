package X;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.List;

/* renamed from: X.0GB  reason: invalid class name */
public class AnonymousClass0GB extends C06190Uq {
    public AnonymousClass0PC A00;
    public final AnonymousClass0XC A01;

    public AnonymousClass0GB(AnonymousClass0PC r1, AnonymousClass0XC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C13620mg r5) {
        /*
            r4 = 0
            java.util.List r3 = X.AnonymousClass1JB.A0U()
            java.lang.String r0 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r2 = r5.AbF(r0)
            r1 = 0
        L_0x000c:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r2.getString(r4)     // Catch:{ all -> 0x0048 }
            r3.add(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x000c
        L_0x001a:
            X.C41191vO.A00(r2, r1)
            X.AnonymousClass1JB.A0W(r3)
            java.util.Iterator r2 = r3.iterator()
        L_0x0024:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = X.AnonymousClass000.A0m(r2)
            X.C18450wi.A09(r1)
            java.lang.String r0 = "room_fts_content_sync_"
            boolean r0 = X.C008703y.A0N(r1, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "DROP TRIGGER IF EXISTS "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            r5.A8n(r0)
            goto L_0x0024
        L_0x0047:
            return
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GB.A00(X.0mg):void");
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
    public static final boolean A01(X.C13620mg r5) {
        /*
            r4 = 0
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r3 = r5.AbF(r0)
            r2 = 1
            r1 = 0
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0016
            int r0 = r3.getInt(r4)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0016
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GB.A01(X.0mg):boolean");
    }

    public void A04(C13620mg r6, int i2, int i3) {
        StringBuilder sb;
        String str;
        List<AnonymousClass0PS> A002;
        AnonymousClass0PC r0 = this.A00;
        if (r0 == null || (A002 = r0.A02.A00(i2, i3)) == null) {
            AnonymousClass0PC r1 = this.A00;
            if (r1 == null || ((i2 <= i3 || !r1.A0B) && r1.A0D && !r1.A08.contains(Integer.valueOf(i2)))) {
                sb = AnonymousClass000.A0r("A migration from ");
                sb.append(i2);
                sb.append(" to ");
                sb.append(i3);
                str = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.";
            } else {
                AnonymousClass0XC r4 = this.A01;
                r6.A8n("DROP TABLE IF EXISTS `Dependency`");
                r6.A8n("DROP TABLE IF EXISTS `WorkSpec`");
                r6.A8n("DROP TABLE IF EXISTS `WorkTag`");
                r6.A8n("DROP TABLE IF EXISTS `SystemIdInfo`");
                r6.A8n("DROP TABLE IF EXISTS `WorkName`");
                r6.A8n("DROP TABLE IF EXISTS `WorkProgress`");
                r6.A8n("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = r4.A00;
                List list = workDatabase_Impl.A01;
                if (list != null) {
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        workDatabase_Impl.A01.get(i4);
                    }
                }
                r4.A09(r6);
                return;
            }
        } else {
            AnonymousClass0XC r2 = this.A01;
            A00(r6);
            for (AnonymousClass0PS A003 : A002) {
                A003.A00(r6);
            }
            AnonymousClass0O2 A08 = r2.A08(r6);
            if (A08.A01) {
                A06(r6);
                return;
            } else {
                sb = AnonymousClass000.A0r("Migration didn't properly handle: ");
                str = A08.A00;
            }
        }
        throw AnonymousClass000.A0V(AnonymousClass000.A0h(str, sb));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        X.C41191vO.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C13620mg r6) {
        /*
            r5 = this;
            boolean r0 = A01(r6)
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            X.0cS r0 = new X.0cS
            r0.<init>(r1)
            android.database.Cursor r4 = r6.AbE(r0)
            r2 = 0
            r1 = 0
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x001e
            java.lang.String r3 = r4.getString(r2)     // Catch:{ all -> 0x0045 }
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            X.C41191vO.A00(r4, r1)
            java.lang.String r2 = "5181942b9ebc31ce68dacb56c16fd79f"
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "ae2044fb577e65ee8bb576ca48a2f06e"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = ", found: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)
            goto L_0x0066
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.C41191vO.A00(r4, r1)
            throw r0
        L_0x004c:
            X.0XC r0 = r5.A01
            X.0O2 r2 = r0.A08(r6)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x005a
            r5.A06(r6)
        L_0x0059:
            return
        L_0x005a:
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GB.A05(X.0mg):void");
    }

    public final void A06(C13620mg r4) {
        r4.A8n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        StringBuilder A0r = AnonymousClass000.A0r("INSERT OR REPLACE INTO ");
        A0r.append("room_master_table");
        A0r.append(" (");
        A0r.append("id");
        A0r.append(',');
        A0r.append("identity_hash");
        A0r.append(") VALUES(");
        A0r.append("42");
        A0r.append(", '");
        A0r.append("5181942b9ebc31ce68dacb56c16fd79f");
        r4.A8n(AnonymousClass000.A0h("')", A0r));
    }
}
