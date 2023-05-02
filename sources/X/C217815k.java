package X;

import com.whatsapp.jid.GroupJid;
import java.util.Collection;
import java.util.List;

/* renamed from: X.15k  reason: invalid class name and case insensitive filesystem */
public class C217815k {
    public final AnonymousClass11X A00;

    public C217815k(AnonymousClass11X r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0050 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0050=Splitter:B:27:0x0050, B:22:0x0048=Splitter:B:22:0x0048} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16050sL A00(X.C16050sL r13) {
        /*
            r12 = this;
            java.lang.String r3 = "parent_raw_jid"
            X.11X r0 = r12.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            X.0tf r2 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "group_relationship"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x004c }
            r1 = 0
            r6[r1] = r3     // Catch:{ all -> 0x004c }
            java.lang.String r7 = "subgroup_raw_id = ?"
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x004c }
            r8[r1] = r0     // Catch:{ all -> 0x004c }
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0048
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003f
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0043 }
            X.0sL r0 = X.C16050sL.A05(r0)     // Catch:{ all -> 0x0043 }
            r1.close()     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            return r0
        L_0x003f:
            r1.close()     // Catch:{ all -> 0x004c }
            goto L_0x0048
        L_0x0043:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x0048:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            goto L_0x0058
        L_0x004c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            java.lang.String r0 = "subgroupStore/getParentGroupJid"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0058:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217815k.A00(X.0sL):X.0sL");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(X.C16050sL r14) {
        /*
            r13 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r1 = r14.getRawString()
            r0 = 0
            r2[r0] = r1
            X.11X r0 = r13.A00
            X.0tf r3 = r0.get()
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "SELECT subgroups.subgroup_raw_jid, subject, subject_ts, group_type FROM subgroup_info subgroups INNER JOIN group_relationship relationship ON subgroups.subgroup_raw_jid = relationship.subgroup_raw_id WHERE relationship.parent_raw_jid = ?"
            android.database.Cursor r4 = r1.A08(r0, r2)     // Catch:{ all -> 0x0073 }
        L_0x001d:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "subject"
            int r7 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "subject_ts"
            int r6 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "subgroup_raw_jid"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "group_type"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r4.getString(r2)     // Catch:{ 1W4 -> 0x0058 }
            X.0sL r8 = X.C16050sL.A04(r0)     // Catch:{ 1W4 -> 0x0058 }
            java.lang.String r9 = r4.getString(r7)     // Catch:{ 1W4 -> 0x0058 }
            long r11 = r4.getLong(r6)     // Catch:{ 1W4 -> 0x0058 }
            int r10 = r4.getInt(r1)     // Catch:{ 1W4 -> 0x0058 }
            X.1sW r7 = new X.1sW     // Catch:{ 1W4 -> 0x0058 }
            r7.<init>(r8, r9, r10, r11)     // Catch:{ 1W4 -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            r1 = move-exception
            java.lang.String r0 = "SubgroupStore/invalid subgroup jid"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x006c }
            r7 = 0
        L_0x005f:
            if (r7 == 0) goto L_0x001d
            r5.add(r7)     // Catch:{ all -> 0x006c }
            goto L_0x001d
        L_0x0065:
            r4.close()     // Catch:{ all -> 0x0073 }
            r3.close()
            return r5
        L_0x006c:
            r0 = move-exception
            if (r4 == 0) goto L_0x0072
            r4.close()     // Catch:{ all -> 0x0072 }
        L_0x0072:
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0077 }
        L_0x0077:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217815k.A01(X.0sL):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.whatsapp.jid.GroupJid r10) {
        /*
            r9 = this;
            X.11X r0 = r9.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044, Error | RuntimeException -> 0x003f }
            X.0tf r8 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044, Error | RuntimeException -> 0x003f }
            X.1cj r7 = r8.A00()     // Catch:{ all -> 0x003a }
            java.lang.String r6 = r10.getRawString()     // Catch:{ all -> 0x0035 }
            r5 = 1
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x0035 }
            r4 = 0
            r2[r4] = r6     // Catch:{ all -> 0x0035 }
            X.0tg r3 = r8.A02     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "subgroup_info"
            java.lang.String r0 = "subgroup_raw_jid = ?"
            r3.A01(r1, r0, r2)     // Catch:{ all -> 0x0035 }
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x0035 }
            r2[r4] = r6     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "group_relationship"
            java.lang.String r0 = "subgroup_raw_id = ?"
            r3.A01(r1, r0, r2)     // Catch:{ all -> 0x0035 }
            r7.A00()     // Catch:{ all -> 0x0035 }
            r7.close()     // Catch:{ all -> 0x003a }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044, Error | RuntimeException -> 0x003f }
            return
        L_0x0035:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0044, Error | RuntimeException -> 0x003f }
        L_0x003f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0044:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217815k.A02(com.whatsapp.jid.GroupJid):void");
    }

    public void A03(GroupJid groupJid, Collection collection) {
        A04(groupJid, collection);
        List<C39461sW> A01 = A01(C16050sL.A03(groupJid));
        A01.removeAll(collection);
        for (C39461sW r0 : A01) {
            A02(r0.A02);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00ce */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00e7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(com.whatsapp.jid.GroupJid r18, java.util.Collection r19) {
        /*
            r17 = this;
            r16 = 0
            r0 = r17
            X.11X r6 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ed, Error | RuntimeException -> 0x00e8 }
            X.0tf r4 = r6.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ed, Error | RuntimeException -> 0x00e8 }
            X.1cj r15 = r4.A00()     // Catch:{ all -> 0x00e3 }
            java.util.Iterator r14 = r19.iterator()     // Catch:{ all -> 0x00de }
        L_0x0012:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x00de }
            r8 = 1
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r5 = r14.next()     // Catch:{ all -> 0x00de }
            X.1sW r5 = (X.C39461sW) r5     // Catch:{ all -> 0x00de }
            com.whatsapp.jid.GroupJid r2 = r5.A02     // Catch:{ all -> 0x00de }
            java.lang.String r11 = r5.A03     // Catch:{ all -> 0x00de }
            long r0 = r5.A01     // Catch:{ all -> 0x00de }
            java.lang.String r7 = r2.getRawString()     // Catch:{ all -> 0x00de }
            r13 = 1
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ all -> 0x00de }
            java.lang.String r2 = r2.getRawString()     // Catch:{ all -> 0x00de }
            r10[r16] = r2     // Catch:{ all -> 0x00de }
            X.0tf r3 = r6.get()     // Catch:{ all -> 0x00de }
            X.0tg r9 = r3.A02     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "SELECT subject_ts FROM subgroup_info WHERE subgroup_raw_jid = ?"
            android.database.Cursor r12 = r9.A08(r2, r10)     // Catch:{ all -> 0x00cf }
            boolean r2 = r12.moveToFirst()     // Catch:{ all -> 0x00c8 }
            if (r2 == 0) goto L_0x005d
            java.lang.String r2 = "subject_ts"
            int r2 = r12.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00c8 }
            long r9 = r12.getLong(r2)     // Catch:{ all -> 0x00c8 }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0054
            r13 = 0
        L_0x0054:
            r12.close()     // Catch:{ all -> 0x00cf }
            r3.close()     // Catch:{ all -> 0x00de }
            if (r13 == 0) goto L_0x0063
            goto L_0x0012
        L_0x005d:
            r12.close()     // Catch:{ all -> 0x00cf }
            r3.close()     // Catch:{ all -> 0x00de }
        L_0x0063:
            r2 = 3
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00de }
            r3.<init>(r2)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "subgroup_raw_jid"
            r3.put(r2, r7)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "subject"
            r3.put(r2, r11)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "subject_ts"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00de }
            r3.put(r2, r0)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "group_type"
            int r0 = r5.A00     // Catch:{ all -> 0x00de }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00de }
            r3.put(r1, r0)     // Catch:{ all -> 0x00de }
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "subgroup_info"
            java.lang.String r1 = "subgroup_raw_jid = ?"
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x00de }
            r0[r16] = r7     // Catch:{ all -> 0x00de }
            int r0 = r5.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x009f
            r5.A02(r3, r2)     // Catch:{ all -> 0x00de }
        L_0x009f:
            r0 = 2
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00de }
            r3.<init>(r0)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "parent_raw_jid"
            java.lang.String r0 = r18.getRawString()     // Catch:{ all -> 0x00de }
            r3.put(r1, r0)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "subgroup_raw_id"
            r3.put(r0, r7)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "group_relationship"
            java.lang.String r1 = "subgroup_raw_id = ?"
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ all -> 0x00de }
            r0[r16] = r7     // Catch:{ all -> 0x00de }
            int r0 = r5.A00(r2, r3, r1, r0)     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x0012
            r5.A02(r3, r2)     // Catch:{ all -> 0x00de }
            goto L_0x0012
        L_0x00c8:
            r0 = move-exception
            if (r12 == 0) goto L_0x00ce
            r12.close()     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00d4:
            r15.A00()     // Catch:{ all -> 0x00de }
            r15.close()     // Catch:{ all -> 0x00e3 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ed, Error | RuntimeException -> 0x00e8 }
            return
        L_0x00de:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ed, Error | RuntimeException -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x00ed:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217815k.A04(com.whatsapp.jid.GroupJid, java.util.Collection):void");
    }
}
