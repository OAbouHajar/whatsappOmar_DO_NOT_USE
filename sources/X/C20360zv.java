package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0zv  reason: invalid class name and case insensitive filesystem */
public class C20360zv {
    public final C16300so A00;
    public final AnonymousClass19K A01;
    public final C217615i A02;

    public C20360zv(C16300so r1, AnonymousClass19K r2, C217615i r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final AnonymousClass1WK A00(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("device_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("epoch");
        if (cursor.isNull(columnIndexOrThrow) || cursor.isNull(columnIndexOrThrow2)) {
            return null;
        }
        return new AnonymousClass1WK(cursor.getInt(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2));
    }

    public static final void A01(C16810tg r5, String[] strArr) {
        AnonymousClass00B.A0F(r5.A00.inTransaction());
        C34101jh r4 = new C34101jh(strArr, 975);
        while (r4.hasNext()) {
            String[] strArr2 = (String[]) r4.next();
            int length = strArr2.length;
            StringBuilder sb = new StringBuilder("DELETE FROM pending_mutations WHERE _id IN ( ");
            sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
            sb.append(" )");
            r5.A0C(sb.toString(), strArr2);
        }
    }

    public static final void A02(C16810tg r5, String[] strArr) {
        AnonymousClass00B.A0F(r5.A00.inTransaction());
        C34101jh r4 = new C34101jh(strArr, 975);
        while (r4.hasNext()) {
            String[] strArr2 = (String[]) r4.next();
            int length = strArr2.length;
            StringBuilder sb = new StringBuilder("DELETE FROM syncd_mutations WHERE mutation_index IN ");
            sb.append(C34111ji.A00(length));
            r5.A0C(sb.toString(), strArr2);
        }
    }

    public final AnonymousClass1WJ A03(Cursor cursor) {
        C217615i r5 = this.A02;
        boolean z2 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("are_dependencies_missing")) == 1) {
            z2 = true;
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        return r5.A01(A00(cursor), string, cursor.getString(cursor.getColumnIndexOrThrow("mutation_index")), cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_value")), cursor.getBlob(cursor.getColumnIndexOrThrow("operation")), (byte[]) null, cursor.getInt(cursor.getColumnIndexOrThrow("mutation_version")), z2);
    }

    public final AnonymousClass1WJ A04(Cursor cursor) {
        C217615i r5 = this.A02;
        boolean z2 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("are_dependencies_missing")) == 1) {
            z2 = true;
        }
        AnonymousClass1WK A002 = A00(cursor);
        AnonymousClass00B.A06(A002);
        return r5.A01(A002, (String) null, cursor.getString(cursor.getColumnIndexOrThrow("mutation_index")), cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_value")), C28481Wg.A03.A01, cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_mac")), cursor.getInt(cursor.getColumnIndexOrThrow("mutation_version")), z2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0020=Splitter:B:8:0x0020, B:16:0x002d=Splitter:B:16:0x002d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1WJ A05(java.lang.String r6) {
        /*
            r5 = this;
            X.19K r0 = r5.A01
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_index = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x002e }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x002e }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x002e }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x001c
            r0 = 0
            goto L_0x0020
        L_0x001c:
            X.1WJ r0 = r5.A03(r1)     // Catch:{ all -> 0x0027 }
        L_0x0020:
            r1.close()     // Catch:{ all -> 0x002e }
            r4.close()
            return r0
        L_0x0027:
            r0 = move-exception
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A05(java.lang.String):X.1WJ");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0020=Splitter:B:8:0x0020, B:16:0x002d=Splitter:B:16:0x002d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1WJ A06(java.lang.String r6) {
        /*
            r5 = this;
            X.19K r0 = r5.A01
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_index = ? "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x002e }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x002e }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x002e }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x001c
            r0 = 0
            goto L_0x0020
        L_0x001c:
            X.1WJ r0 = r5.A04(r1)     // Catch:{ all -> 0x0027 }
        L_0x0020:
            r1.close()     // Catch:{ all -> 0x002e }
            r4.close()
            return r0
        L_0x0027:
            r0 = move-exception
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A06(java.lang.String):X.1WJ");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A07(X.C37291ov r5, java.lang.String r6, java.lang.String[] r7) {
        /*
            r4 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.19K r0 = r4.A01
            X.0tf r2 = r0.get()
            X.0tg r0 = r2.A02     // Catch:{ all -> 0x003f }
            android.database.Cursor r1 = r0.A08(r6, r7)     // Catch:{ all -> 0x003f }
        L_0x0011:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "mutation_index"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0038 }
            boolean r0 = r5.A89(r0)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0011
            X.1WJ r0 = r4.A04(r1)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0011
            r3.add(r0)     // Catch:{ all -> 0x0038 }
            goto L_0x0011
        L_0x0031:
            r1.close()     // Catch:{ all -> 0x003f }
            r2.close()
            return r3
        L_0x0038:
            r0 = move-exception
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A07(X.1ov, java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0082 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A08(X.C15830rv r8, java.util.Set r9, boolean r10) {
        /*
            r7 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0088
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r0 = r8.getRawString()
            r6.add(r0)
            r6.addAll(r9)
            X.19K r0 = r7.A01
            X.0tf r3 = r0.get()
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x0083 }
            if (r10 == 0) goto L_0x0047
            int r2 = r9.size()     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE chat_jid = ?  AND mutation_name IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r1.<init>(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = X.C34111ji.A00(r2)     // Catch:{ all -> 0x0083 }
            r1.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0083 }
        L_0x003a:
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x0083 }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0083 }
            android.database.Cursor r1 = r5.A08(r1, r0)     // Catch:{ all -> 0x0083 }
            goto L_0x005e
        L_0x0047:
            int r2 = r9.size()     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid = ?  AND mutation_name IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r1.<init>(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = X.C34111ji.A00(r2)     // Catch:{ all -> 0x0083 }
            r1.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0083 }
            goto L_0x003a
        L_0x005e:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0075
            if (r10 == 0) goto L_0x006b
            X.1WJ r0 = r7.A03(r1)     // Catch:{ all -> 0x007c }
            goto L_0x006f
        L_0x006b:
            X.1WJ r0 = r7.A04(r1)     // Catch:{ all -> 0x007c }
        L_0x006f:
            if (r0 == 0) goto L_0x005e
            r4.add(r0)     // Catch:{ all -> 0x007c }
            goto L_0x005e
        L_0x0075:
            r1.close()     // Catch:{ all -> 0x0083 }
            r3.close()
            return r4
        L_0x007c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0087 }
        L_0x0087:
            throw r0
        L_0x0088:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A08(X.0rv, java.util.Set, boolean):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A09(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.19K r0 = r6.A01
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0044 }
            if (r8 == 0) goto L_0x001c
            java.lang.String r2 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_name = ?"
        L_0x0011:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0044 }
            r0 = 0
            r1[r0] = r7     // Catch:{ all -> 0x0044 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0044 }
            goto L_0x001f
        L_0x001c:
            java.lang.String r2 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_name = ?"
            goto L_0x0011
        L_0x001f:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0036
            if (r8 == 0) goto L_0x002c
            X.1WJ r0 = r6.A03(r1)     // Catch:{ all -> 0x003d }
            goto L_0x0030
        L_0x002c:
            X.1WJ r0 = r6.A04(r1)     // Catch:{ all -> 0x003d }
        L_0x0030:
            if (r0 == 0) goto L_0x001f
            r5.add(r0)     // Catch:{ all -> 0x003d }
            goto L_0x001f
        L_0x0036:
            r1.close()     // Catch:{ all -> 0x0044 }
            r4.close()
            return r5
        L_0x003d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A09(java.lang.String, boolean):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0A(java.util.Set r8, int r9) {
        /*
            r7 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r8)
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r5.add(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.19K r0 = r7.A01
            X.0tf r2 = r0.get()
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0070 }
            int r6 = r8.size()     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE collection_name IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r1.<init>(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = X.C34111ji.A00(r6)     // Catch:{ all -> 0x0070 }
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = " OR "
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "collection_name"
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = " IS NULL  ORDER BY "
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "_id"
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = " ASC  LIMIT ?"
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0070 }
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x0070 }
            java.lang.Object[] r0 = r5.toArray(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0070 }
            android.database.Cursor r1 = r4.A08(r1, r0)     // Catch:{ all -> 0x0070 }
        L_0x0054:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0062
            X.1WJ r0 = r7.A03(r1)     // Catch:{ all -> 0x0069 }
            r3.add(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0054
        L_0x0062:
            r1.close()     // Catch:{ all -> 0x0070 }
            r2.close()
            return r3
        L_0x0069:
            r0 = move-exception
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ all -> 0x006f }
        L_0x006f:
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A0A(java.util.Set, int):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00e8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A0B(java.util.Collection r13) {
        /*
            r12 = this;
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.19K r0 = r12.A01
            X.0tf r2 = r0.A02()
            X.1cj r11 = r2.A00()     // Catch:{ all -> 0x00e9 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "INSERT OR REPLACE INTO pending_mutations (mutation_index, mutation_value, mutation_version, operation, device_id, epoch, is_ready_to_sync, collection_name, are_dependencies_missing, mutation_name, chat_jid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            X.1ou r3 = r1.A0A(r0)     // Catch:{ all -> 0x00e4 }
            java.util.Iterator r10 = r13.iterator()     // Catch:{ all -> 0x00e4 }
        L_0x001b:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00da
            java.lang.Object r6 = r10.next()     // Catch:{ all -> 0x00e4 }
            X.1WJ r6 = (X.AnonymousClass1WJ) r6     // Catch:{ all -> 0x00e4 }
            X.15i r1 = r12.A02     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = r6.A04()     // Catch:{ all -> 0x00e4 }
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = r6.A06     // Catch:{ all -> 0x00e4 }
            android.database.sqlite.SQLiteStatement r5 = r3.A00     // Catch:{ all -> 0x00e4 }
            r5.clearBindings()     // Catch:{ all -> 0x00e4 }
            r1 = 1
            java.lang.String r0 = r6.A03()     // Catch:{ all -> 0x00e4 }
            r3.A02(r1, r0)     // Catch:{ all -> 0x00e4 }
            X.1Wl r0 = r6.A02()     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            byte[] r0 = r0.A02()     // Catch:{ all -> 0x00e4 }
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r0 == 0) goto L_0x0062
            X.1Wl r0 = r6.A02()     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x0059
            r1 = 0
            goto L_0x005d
        L_0x0059:
            byte[] r1 = r0.A02()     // Catch:{ all -> 0x00e4 }
        L_0x005d:
            r0 = 2
            r5.bindBlob(r0, r1)     // Catch:{ all -> 0x00e4 }
            goto L_0x0066
        L_0x0062:
            r0 = 2
            r5.bindNull(r0)     // Catch:{ all -> 0x00e4 }
        L_0x0066:
            r8 = 3
            int r0 = r6.A03     // Catch:{ all -> 0x00e4 }
            long r0 = (long) r0     // Catch:{ all -> 0x00e4 }
            r3.A01(r8, r0)     // Catch:{ all -> 0x00e4 }
            X.1Wg r0 = r6.A05     // Catch:{ all -> 0x00e4 }
            byte[] r1 = r0.A01     // Catch:{ all -> 0x00e4 }
            r0 = 4
            r5.bindBlob(r0, r1)     // Catch:{ all -> 0x00e4 }
            X.1WK r0 = r6.A00     // Catch:{ all -> 0x00e4 }
            r9 = 6
            r8 = 5
            if (r0 != 0) goto L_0x0095
            r5.bindNull(r8)     // Catch:{ all -> 0x00e4 }
            r5.bindNull(r9)     // Catch:{ all -> 0x00e4 }
        L_0x0081:
            r8 = 7
            r0 = 0
            r3.A01(r8, r0)     // Catch:{ all -> 0x00e4 }
            r8 = 8
            r3.A02(r8, r7)     // Catch:{ all -> 0x00e4 }
            r8 = 9
            boolean r7 = r6.A06()     // Catch:{ all -> 0x00e4 }
            if (r7 == 0) goto L_0x00aa
            goto L_0x00a8
        L_0x0095:
            int r0 = r0.A00()     // Catch:{ all -> 0x00e4 }
            long r0 = (long) r0     // Catch:{ all -> 0x00e4 }
            r3.A01(r8, r0)     // Catch:{ all -> 0x00e4 }
            X.1WK r0 = r6.A00     // Catch:{ all -> 0x00e4 }
            int r0 = r0.A01()     // Catch:{ all -> 0x00e4 }
            long r0 = (long) r0     // Catch:{ all -> 0x00e4 }
            r3.A01(r9, r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x0081
        L_0x00a8:
            r0 = 1
        L_0x00aa:
            r3.A01(r8, r0)     // Catch:{ all -> 0x00e4 }
            r1 = 10
            java.lang.String r0 = r6.A04()     // Catch:{ all -> 0x00e4 }
            r3.A02(r1, r0)     // Catch:{ all -> 0x00e4 }
            boolean r0 = r6 instanceof X.C36821oA     // Catch:{ all -> 0x00e4 }
            r1 = 11
            if (r0 == 0) goto L_0x00d6
            X.1oA r6 = (X.C36821oA) r6     // Catch:{ all -> 0x00e4 }
            X.0rv r0 = r6.AAV()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00e4 }
            r3.A02(r1, r0)     // Catch:{ all -> 0x00e4 }
        L_0x00c9:
            long r0 = r5.executeInsert()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00e4 }
            r4.add(r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x001b
        L_0x00d6:
            r5.bindNull(r1)     // Catch:{ all -> 0x00e4 }
            goto L_0x00c9
        L_0x00da:
            r11.A00()     // Catch:{ all -> 0x00e4 }
            r11.close()     // Catch:{ all -> 0x00e9 }
            r2.close()
            return r4
        L_0x00e4:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            throw r0     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A0B(java.util.Collection):java.util.Set");
    }

    public final void A0C(C16810tg r6, AnonymousClass1WK r7, C15830rv r8, String str, String str2, String str3, byte[] bArr, byte[] bArr2, int i2, boolean z2) {
        if (r7.A01() == 0) {
            C16300so r3 = this.A00;
            StringBuilder sb = new StringBuilder("keyId=");
            sb.append(r7);
            r3.AcB("syncdMutationStore/insertOrReplaceMutation unexpected key", sb.toString(), true);
        }
        C37281ou A0A = r6.A0A("INSERT OR REPLACE INTO syncd_mutations (mutation_index, mutation_value, mutation_version, collection_name, are_dependencies_missing, device_id, epoch, mutation_mac, chat_jid, mutation_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        SQLiteStatement sQLiteStatement = A0A.A00;
        sQLiteStatement.clearBindings();
        A0A.A02(1, str);
        if (bArr == null) {
            sQLiteStatement.bindNull(2);
        } else {
            sQLiteStatement.bindBlob(2, bArr);
        }
        A0A.A01(3, (long) i2);
        A0A.A02(4, str2);
        A0A.A01(5, z2 ? 1 : 0);
        A0A.A01(6, (long) r7.A00());
        A0A.A01(7, (long) r7.A01());
        sQLiteStatement.bindBlob(8, bArr2);
        if (r8 == null) {
            sQLiteStatement.bindNull(9);
        } else {
            A0A.A02(9, r8.getRawString());
        }
        A0A.A02(10, str3);
        if (sQLiteStatement.executeInsert() == -1) {
            Log.e("SyncdMutationsStore/insertOrReplaceMutation was unsuccessful");
        }
    }

    public final void A0D(C16810tg r17, Collection collection) {
        C16810tg r6 = r17;
        AnonymousClass00B.A0F(r6.A00.inTransaction());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1WJ r1 = (AnonymousClass1WJ) it.next();
            C28481Wg r2 = r1.A05;
            if (r2 == C28481Wg.A03) {
                arrayList.add(r1);
            } else if (r2 == C28481Wg.A02) {
                arrayList2.add(r1);
            } else {
                StringBuilder sb = new StringBuilder("Incorrect operation: ");
                sb.append(r2);
                throw new IllegalStateException(sb.toString());
            }
        }
        A02(r6, AnonymousClass1XA.A02(arrayList2));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AnonymousClass1WJ r12 = (AnonymousClass1WJ) it2.next();
            String str = r12.A06;
            String A03 = r12.A03();
            C28531Wl A022 = r12.A02();
            byte[] A023 = A022 == null ? null : A022.A02();
            int i2 = r12.A03;
            boolean A06 = r12.A06();
            AnonymousClass1WK r7 = r12.A00;
            AnonymousClass00B.A06(r7);
            byte[] bArr = r12.A02;
            AnonymousClass00B.A06(bArr);
            A0C(r6, r7, r12 instanceof C36821oA ? ((C36821oA) r12).AAV() : null, A03, str, r12.A04(), A023, bArr, i2, A06);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.AnonymousClass1WJ r7) {
        /*
            r6 = this;
            X.19K r0 = r6.A01
            X.0tf r5 = r0.A02()
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x0026 }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0021 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0021 }
            r1 = 0
            java.lang.String r0 = r7.A07     // Catch:{ all -> 0x0021 }
            r2[r1] = r0     // Catch:{ all -> 0x0021 }
            A01(r3, r2)     // Catch:{ all -> 0x0021 }
            r4.A00()     // Catch:{ all -> 0x0021 }
            r4.close()     // Catch:{ all -> 0x0026 }
            r5.close()
            return
        L_0x0021:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A0E(X.1WJ):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(java.util.Collection r4) {
        /*
            r3 = this;
            X.19K r0 = r3.A01
            X.0tf r2 = r0.A02()
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x0020 }
            java.util.Set r0 = r3.A0B(r4)     // Catch:{ all -> 0x001b }
            r3.A0H(r0)     // Catch:{ all -> 0x001b }
            r1.A00()     // Catch:{ all -> 0x001b }
            r1.close()     // Catch:{ all -> 0x0020 }
            r2.close()
            return
        L_0x001b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A0F(java.util.Collection):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(java.util.Collection r4) {
        /*
            r3 = this;
            X.19K r0 = r3.A01
            X.0tf r2 = r0.A02()
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x001e }
            X.0tg r0 = r2.A02     // Catch:{ all -> 0x0019 }
            r3.A0D(r0, r4)     // Catch:{ all -> 0x0019 }
            r1.A00()     // Catch:{ all -> 0x0019 }
            r1.close()     // Catch:{ all -> 0x001e }
            r2.close()
            return
        L_0x0019:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001d }
        L_0x001d:
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A0G(java.util.Collection):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(java.util.Set r9) {
        /*
            r8 = this;
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0065
            X.19K r0 = r8.A01
            X.0tf r5 = r0.A02()
            X.1cj r7 = r5.A00()     // Catch:{ all -> 0x0060 }
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x005b }
            java.lang.Object[] r1 = r9.toArray(r0)     // Catch:{ all -> 0x005b }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x005b }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r6 = new X.1jh     // Catch:{ all -> 0x005b }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x005b }
        L_0x001f:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0051
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x005b }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x005b }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x005b }
            int r1 = r4.length     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "UPDATE pending_mutations SET is_ready_to_sync = 1 WHERE _id IN ( "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r2.<init>(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x005b }
            r2.append(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = " )"
            r2.append(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005b }
            r3.A0C(r0, r4)     // Catch:{ all -> 0x005b }
            goto L_0x001f
        L_0x0051:
            r7.A00()     // Catch:{ all -> 0x005b }
            r7.close()     // Catch:{ all -> 0x0060 }
            r5.close()
            return
        L_0x005b:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A0H(java.util.Set):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0030 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0030=Splitter:B:17:0x0030, B:9:0x0023=Splitter:B:9:0x0023} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I() {
        /*
            r4 = this;
            X.19K r0 = r4.A01
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = "SELECT _id FROM pending_mutations WHERE is_ready_to_sync = 1  LIMIT 1"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x002a }
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002a }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            r2.close()     // Catch:{ all -> 0x0031 }
            r3.close()
            return r1
        L_0x002a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0030
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A0I():boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0030 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0030=Splitter:B:17:0x0030, B:9:0x0023=Splitter:B:9:0x0023} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J() {
        /*
            r4 = this;
            X.19K r0 = r4.A01
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = "SELECT _id FROM syncd_mutations LIMIT 1"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x002a }
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002a }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            r2.close()     // Catch:{ all -> 0x0031 }
            r3.close()
            return r1
        L_0x002a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0030
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20360zv.A0J():boolean");
    }

    public boolean A0K(Set set) {
        C16810tg AHC = this.A01.AHC();
        int size = set.size();
        StringBuilder sb = new StringBuilder("SELECT _id FROM syncd_mutations WHERE collection_name IN ");
        sb.append(C34111ji.A00(size));
        sb.append(" LIMIT 1");
        Cursor A08 = AHC.A08(sb.toString(), (String[]) set.toArray(AnonymousClass01S.A0H));
        try {
            boolean z2 = false;
            if (A08.moveToNext() && A08.getString(A08.getColumnIndexOrThrow("_id")) != null) {
                z2 = true;
            }
            A08.close();
            return z2;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
