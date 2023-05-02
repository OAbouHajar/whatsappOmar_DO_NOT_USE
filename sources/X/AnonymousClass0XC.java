package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.mod2.fblibs.FacebookFacade;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0XC  reason: invalid class name */
public class AnonymousClass0XC {
    public final /* synthetic */ WorkDatabase_Impl A00;

    public AnonymousClass0XC(WorkDatabase_Impl workDatabase_Impl) {
        this.A00 = workDatabase_Impl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        X.C41191vO.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0RO A00(X.C13620mg r12, java.lang.String r13, boolean r14) {
        /*
            java.lang.String r0 = "PRAGMA index_xinfo(`"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r13)
            java.lang.String r0 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.database.Cursor r3 = r12.AbF(r0)
            java.lang.String r10 = "DESC"
            java.lang.String r11 = "ASC"
            java.lang.String r5 = "desc"
            java.lang.String r4 = "name"
            java.lang.String r2 = "cid"
            java.lang.String r1 = "seqno"
            r0 = -1
            int r9 = r3.getColumnIndex(r1)     // Catch:{ all -> 0x0092 }
            int r8 = r3.getColumnIndex(r2)     // Catch:{ all -> 0x0092 }
            int r7 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x0092 }
            int r6 = r3.getColumnIndex(r5)     // Catch:{ all -> 0x0092 }
            if (r9 == r0) goto L_0x008d
            if (r8 == r0) goto L_0x008d
            if (r7 == r0) goto L_0x008d
            if (r6 == r0) goto L_0x008d
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ all -> 0x0092 }
            r5.<init>()     // Catch:{ all -> 0x0092 }
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ all -> 0x0092 }
            r4.<init>()     // Catch:{ all -> 0x0092 }
        L_0x0042:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x006d
            int r0 = r3.getInt(r8)     // Catch:{ all -> 0x0092 }
            if (r0 < 0) goto L_0x0042
            int r2 = r3.getInt(r9)     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = r3.getString(r7)     // Catch:{ all -> 0x0092 }
            int r0 = r3.getInt(r6)     // Catch:{ all -> 0x0092 }
            r12 = r10
            if (r0 > 0) goto L_0x005e
            r10 = r11
        L_0x005e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0092 }
            X.C18450wi.A0B(r1)     // Catch:{ all -> 0x0092 }
            r5.put(r0, r1)     // Catch:{ all -> 0x0092 }
            r4.put(r0, r10)     // Catch:{ all -> 0x0092 }
            r10 = r12
            goto L_0x0042
        L_0x006d:
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x0092 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x0092 }
            java.util.List r2 = X.C003101j.A0A(r0)     // Catch:{ all -> 0x0092 }
            java.util.Collection r0 = r4.values()     // Catch:{ all -> 0x0092 }
            X.C18450wi.A0B(r0)     // Catch:{ all -> 0x0092 }
            java.util.List r0 = X.C003101j.A0A(r0)     // Catch:{ all -> 0x0092 }
            X.0RO r1 = new X.0RO     // Catch:{ all -> 0x0092 }
            r1.<init>(r13, r2, r0, r14)     // Catch:{ all -> 0x0092 }
            r0 = 0
            X.C41191vO.A00(r3, r0)
            return r1
        L_0x008d:
            r0 = 0
            X.C41191vO.A00(r3, r0)
            return r0
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.C41191vO.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XC.A00(X.0mg, java.lang.String, boolean):X.0RO");
    }

    public static final AnonymousClass0RP A01(C13620mg r4, String str) {
        return new AnonymousClass0RP(str, A04(r4, str), A05(r4, str), A06(r4, str));
    }

    public static final List A02(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List A0U = AnonymousClass1JB.A0U();
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(columnIndex);
            int i3 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            C18450wi.A0B(string);
            String string2 = cursor.getString(columnIndex4);
            C18450wi.A0B(string2);
            A0U.add(new C09180f4(string, string2, i2, i3));
        }
        AnonymousClass1JB.A0W(A0U);
        return C003101j.A09(A0U);
    }

    public static List A03(Object obj) {
        return Arrays.asList(new String[]{obj});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        X.C41191vO.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A04(X.C13620mg r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "PRAGMA table_info(`"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r15)
            java.lang.String r0 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.database.Cursor r6 = r14.AbF(r0)
            java.lang.String r9 = "dflt_value"
            java.lang.String r7 = "pk"
            java.lang.String r3 = "notnull"
            java.lang.String r2 = "type"
            java.lang.String r1 = "name"
            r8 = 0
            int r0 = r6.getColumnCount()     // Catch:{ all -> 0x0076 }
            if (r0 > 0) goto L_0x0029
            java.util.Map r7 = X.C25411Jr.A01()     // Catch:{ all -> 0x0076 }
            goto L_0x0072
        L_0x0029:
            int r5 = r6.getColumnIndex(r1)     // Catch:{ all -> 0x0076 }
            int r4 = r6.getColumnIndex(r2)     // Catch:{ all -> 0x0076 }
            int r3 = r6.getColumnIndex(r3)     // Catch:{ all -> 0x0076 }
            int r2 = r6.getColumnIndex(r7)     // Catch:{ all -> 0x0076 }
            int r1 = r6.getColumnIndex(r9)     // Catch:{ all -> 0x0076 }
            java.util.Map r7 = X.C25421Js.A08()     // Catch:{ all -> 0x0076 }
        L_0x0041:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006f
            java.lang.String r10 = r6.getString(r5)     // Catch:{ all -> 0x0076 }
            java.lang.String r11 = r6.getString(r4)     // Catch:{ all -> 0x0076 }
            int r0 = r6.getInt(r3)     // Catch:{ all -> 0x0076 }
            boolean r15 = X.AnonymousClass000.A1O(r0)
            int r13 = r6.getInt(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = r6.getString(r1)     // Catch:{ all -> 0x0076 }
            X.C18450wi.A0B(r10)     // Catch:{ all -> 0x0076 }
            X.C18450wi.A0B(r11)     // Catch:{ all -> 0x0076 }
            r14 = 2
            X.0WI r9 = new X.0WI     // Catch:{ all -> 0x0076 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0076 }
            r7.put(r10, r9)     // Catch:{ all -> 0x0076 }
            goto L_0x0041
        L_0x006f:
            X.C25421Js.A0A(r7)     // Catch:{ all -> 0x0076 }
        L_0x0072:
            X.C41191vO.A00(r6, r8)
            return r7
        L_0x0076:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            X.C41191vO.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XC.A04(X.0mg, java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c2, code lost:
        X.C41191vO.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set A05(X.C13620mg r19, java.lang.String r20) {
        /*
            java.lang.String r0 = "PRAGMA foreign_key_list(`"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r0 = r20
            r1.append(r0)
            java.lang.String r0 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r1 = r19
            android.database.Cursor r7 = r1.AbF(r0)
            r11 = -1
            java.lang.String r4 = "on_update"
            java.lang.String r3 = "on_delete"
            java.lang.String r2 = "table"
            java.lang.String r1 = "seq"
            java.lang.String r0 = "id"
            int r10 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x00bf }
            int r9 = r7.getColumnIndex(r1)     // Catch:{ all -> 0x00bf }
            int r8 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x00bf }
            int r6 = r7.getColumnIndex(r3)     // Catch:{ all -> 0x00bf }
            int r5 = r7.getColumnIndex(r4)     // Catch:{ all -> 0x00bf }
            java.util.List r14 = A02(r7)     // Catch:{ all -> 0x00bf }
            r7.moveToPosition(r11)     // Catch:{ all -> 0x00bf }
            java.util.Set r4 = X.AnonymousClass1FA.A04()     // Catch:{ all -> 0x00bf }
        L_0x0041:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00b7
            int r0 = r7.getInt(r9)     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x0041
            int r12 = r7.getInt(r10)     // Catch:{ all -> 0x00bf }
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00bf }
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00bf }
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00bf }
            java.util.Iterator r13 = r14.iterator()     // Catch:{ all -> 0x00bf }
        L_0x0061:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x00bf }
            r0 = r1
            X.0f4 r0 = (X.C09180f4) r0     // Catch:{ all -> 0x00bf }
            int r0 = r0.A00     // Catch:{ all -> 0x00bf }
            boolean r0 = X.AnonymousClass000.A1R(r0, r12)
            if (r0 == 0) goto L_0x0061
            r11.add(r1)     // Catch:{ all -> 0x00bf }
            goto L_0x0061
        L_0x007a:
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00bf }
        L_0x007e:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0095
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x00bf }
            X.0f4 r1 = (X.C09180f4) r1     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x00bf }
            r3.add(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r1.A03     // Catch:{ all -> 0x00bf }
            r2.add(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x007e
        L_0x0095:
            java.lang.String r16 = r7.getString(r8)     // Catch:{ all -> 0x00bf }
            X.C18450wi.A0B(r16)     // Catch:{ all -> 0x00bf }
            java.lang.String r17 = r7.getString(r6)     // Catch:{ all -> 0x00bf }
            X.C18450wi.A0B(r17)     // Catch:{ all -> 0x00bf }
            java.lang.String r18 = r7.getString(r5)     // Catch:{ all -> 0x00bf }
            X.C18450wi.A0B(r18)     // Catch:{ all -> 0x00bf }
            X.0RV r15 = new X.0RV     // Catch:{ all -> 0x00bf }
            r19 = r3
            r20 = r2
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00bf }
            r4.add(r15)     // Catch:{ all -> 0x00bf }
            goto L_0x0041
        L_0x00b7:
            X.AnonymousClass1FA.A06(r4)     // Catch:{ all -> 0x00bf }
            r0 = 0
            X.C41191vO.A00(r7, r0)
            return r4
        L_0x00bf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            X.C41191vO.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XC.A05(X.0mg, java.lang.String):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        X.C41191vO.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set A06(X.C13620mg r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "PRAGMA index_list(`"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r11)
            java.lang.String r0 = "`)"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.database.Cursor r7 = r10.AbF(r0)
            java.lang.String r9 = "c"
            java.lang.String r3 = "unique"
            java.lang.String r2 = "origin"
            r8 = 1
            java.lang.String r1 = "name"
            r6 = 0
            r0 = -1
            int r5 = r7.getColumnIndex(r1)     // Catch:{ all -> 0x0068 }
            int r4 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x0068 }
            int r3 = r7.getColumnIndex(r3)     // Catch:{ all -> 0x0068 }
            if (r5 == r0) goto L_0x0064
            if (r4 == r0) goto L_0x0064
            if (r3 == r0) goto L_0x0064
            java.util.Set r2 = X.AnonymousClass1FA.A04()     // Catch:{ all -> 0x0068 }
        L_0x0034:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r7.getString(r4)     // Catch:{ all -> 0x0068 }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = r7.getString(r5)     // Catch:{ all -> 0x0068 }
            int r0 = r7.getInt(r3)     // Catch:{ all -> 0x0068 }
            boolean r0 = X.AnonymousClass000.A1R(r0, r8)
            X.C18450wi.A0B(r1)     // Catch:{ all -> 0x0068 }
            X.0RO r0 = A00(r10, r1, r0)     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0064
            r2.add(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0034
        L_0x005d:
            X.AnonymousClass1FA.A06(r2)     // Catch:{ all -> 0x0068 }
            X.C41191vO.A00(r7, r6)
            return r2
        L_0x0064:
            X.C41191vO.A00(r7, r6)
            return r6
        L_0x0068:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            X.C41191vO.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XC.A06(X.0mg, java.lang.String):java.util.Set");
    }

    public static void A07(String str, AbstractMap abstractMap) {
        String str2 = str;
        abstractMap.put(str2, new AnonymousClass0WI(str2, "TEXT", (String) null, 1, 1, true));
    }

    public AnonymousClass0O2 A08(C13620mg r42) {
        StringBuilder A0r;
        String str;
        HashMap hashMap = new HashMap(2);
        A07("work_spec_id", hashMap);
        hashMap.put("prerequisite_id", new AnonymousClass0WI("prerequisite_id", "TEXT", (String) null, 2, 1, true));
        HashSet hashSet = new HashSet(2);
        String str2 = "WorkSpec";
        String str3 = "CASCADE";
        hashSet.add(new AnonymousClass0RV(str2, "CASCADE", str3, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
        hashSet.add(new AnonymousClass0RV(str2, "CASCADE", str3, A03("prerequisite_id"), A03("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new AnonymousClass0RO("index_Dependency_work_spec_id", A03("work_spec_id"), Arrays.asList(new String[]{"ASC"}), false));
        hashSet2.add(new AnonymousClass0RO("index_Dependency_prerequisite_id", A03("prerequisite_id"), A03("ASC"), false));
        AnonymousClass0RP r6 = new AnonymousClass0RP("Dependency", hashMap, hashSet, hashSet2);
        C13620mg r3 = r42;
        AnonymousClass0RP A01 = A01(r3, "Dependency");
        if (!r6.equals(A01)) {
            A0r = AnonymousClass000.A0o();
            str = "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(27);
            A07("id", hashMap2);
            hashMap2.put("state", new AnonymousClass0WI("state", "INTEGER", (String) null, 0, 1, true));
            String str4 = "TEXT";
            hashMap2.put("worker_class_name", new AnonymousClass0WI("worker_class_name", str4, (String) null, 0, 1, true));
            hashMap2.put("input_merger_class_name", new AnonymousClass0WI("input_merger_class_name", str4, (String) null, 0, 1, false));
            hashMap2.put("input", new AnonymousClass0WI("input", "BLOB", (String) null, 0, 1, true));
            hashMap2.put("output", new AnonymousClass0WI("output", "BLOB", (String) null, 0, 1, true));
            String str5 = "INTEGER";
            hashMap2.put("initial_delay", new AnonymousClass0WI("initial_delay", str5, (String) null, 0, 1, true));
            hashMap2.put("interval_duration", new AnonymousClass0WI("interval_duration", str5, (String) null, 0, 1, true));
            hashMap2.put("flex_duration", new AnonymousClass0WI("flex_duration", str5, (String) null, 0, 1, true));
            hashMap2.put("run_attempt_count", new AnonymousClass0WI("run_attempt_count", str5, (String) null, 0, 1, true));
            hashMap2.put("backoff_policy", new AnonymousClass0WI("backoff_policy", str5, (String) null, 0, 1, true));
            hashMap2.put("backoff_delay_duration", new AnonymousClass0WI("backoff_delay_duration", str5, (String) null, 0, 1, true));
            hashMap2.put("last_enqueue_time", new AnonymousClass0WI("last_enqueue_time", str5, (String) null, 0, 1, true));
            hashMap2.put("minimum_retention_duration", new AnonymousClass0WI("minimum_retention_duration", str5, (String) null, 0, 1, true));
            hashMap2.put("schedule_requested_at", new AnonymousClass0WI("schedule_requested_at", str5, (String) null, 0, 1, true));
            hashMap2.put("run_in_foreground", new AnonymousClass0WI("run_in_foreground", str5, (String) null, 0, 1, true));
            hashMap2.put("out_of_quota_policy", new AnonymousClass0WI("out_of_quota_policy", str5, (String) null, 0, 1, true));
            hashMap2.put("period_count", new AnonymousClass0WI("period_count", str5, "0", 0, 1, true));
            String str6 = "generation";
            hashMap2.put("generation", new AnonymousClass0WI(str6, str5, "0", 0, 1, true));
            String str7 = "INTEGER";
            hashMap2.put("required_network_type", new AnonymousClass0WI("required_network_type", str7, (String) null, 0, 1, true));
            hashMap2.put("requires_charging", new AnonymousClass0WI("requires_charging", str7, (String) null, 0, 1, true));
            hashMap2.put("requires_device_idle", new AnonymousClass0WI("requires_device_idle", str7, (String) null, 0, 1, true));
            hashMap2.put("requires_battery_not_low", new AnonymousClass0WI("requires_battery_not_low", str7, (String) null, 0, 1, true));
            hashMap2.put("requires_storage_not_low", new AnonymousClass0WI("requires_storage_not_low", str7, (String) null, 0, 1, true));
            hashMap2.put("trigger_content_update_delay", new AnonymousClass0WI("trigger_content_update_delay", str7, (String) null, 0, 1, true));
            hashMap2.put("trigger_max_content_delay", new AnonymousClass0WI("trigger_max_content_delay", str7, (String) null, 0, 1, true));
            hashMap2.put("content_uri_triggers", new AnonymousClass0WI("content_uri_triggers", "BLOB", (String) null, 0, 1, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new AnonymousClass0RO("index_WorkSpec_schedule_requested_at", A03("schedule_requested_at"), A03("ASC"), false));
            hashSet4.add(new AnonymousClass0RO("index_WorkSpec_last_enqueue_time", A03("last_enqueue_time"), A03("ASC"), false));
            AnonymousClass0RP r2 = new AnonymousClass0RP("WorkSpec", hashMap2, hashSet3, hashSet4);
            A01 = A01(r3, "WorkSpec");
            if (!r2.equals(A01)) {
                A0r = AnonymousClass000.A0r("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                A0r.append(r2);
            } else {
                HashMap hashMap3 = new HashMap(2);
                A07("tag", hashMap3);
                hashMap3.put("work_spec_id", new AnonymousClass0WI("work_spec_id", "TEXT", (String) null, 2, 1, true));
                HashSet hashSet5 = new HashSet(1);
                String str8 = "WorkSpec";
                hashSet5.add(new AnonymousClass0RV(str8, "CASCADE", str3, A03("work_spec_id"), A03("id")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new AnonymousClass0RO("index_WorkTag_work_spec_id", A03("work_spec_id"), A03("ASC"), false));
                r6 = new AnonymousClass0RP("WorkTag", hashMap3, hashSet5, hashSet6);
                A01 = A01(r3, "WorkTag");
                if (!r6.equals(A01)) {
                    A0r = AnonymousClass000.A0o();
                    str = "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n";
                } else {
                    HashMap hashMap4 = new HashMap(3);
                    A07("work_spec_id", hashMap4);
                    hashMap4.put("generation", new AnonymousClass0WI(str6, str5, "0", 2, 1, true));
                    hashMap4.put("system_id", new AnonymousClass0WI("system_id", str5, (String) null, 0, 1, true));
                    HashSet hashSet7 = new HashSet(1);
                    hashSet7.add(new AnonymousClass0RV(str8, "CASCADE", str3, A03("work_spec_id"), A03("id")));
                    r6 = new AnonymousClass0RP("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                    A01 = A01(r3, "SystemIdInfo");
                    if (!r6.equals(A01)) {
                        A0r = AnonymousClass000.A0o();
                        str = "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n";
                    } else {
                        HashMap hashMap5 = new HashMap(2);
                        A07(FacebookFacade.RequestParameter.NAME, hashMap5);
                        hashMap5.put("work_spec_id", new AnonymousClass0WI("work_spec_id", "TEXT", (String) null, 2, 1, true));
                        HashSet hashSet8 = new HashSet(1);
                        hashSet8.add(new AnonymousClass0RV(str8, "CASCADE", str3, A03("work_spec_id"), A03("id")));
                        HashSet hashSet9 = new HashSet(1);
                        hashSet9.add(new AnonymousClass0RO("index_WorkName_work_spec_id", A03("work_spec_id"), A03("ASC"), false));
                        r6 = new AnonymousClass0RP("WorkName", hashMap5, hashSet8, hashSet9);
                        A01 = A01(r3, "WorkName");
                        if (!r6.equals(A01)) {
                            A0r = AnonymousClass000.A0o();
                            str = "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n";
                        } else {
                            HashMap hashMap6 = new HashMap(2);
                            A07("work_spec_id", hashMap6);
                            hashMap6.put("progress", new AnonymousClass0WI("progress", "BLOB", (String) null, 0, 1, true));
                            HashSet hashSet10 = new HashSet(1);
                            String str9 = "CASCADE";
                            hashSet10.add(new AnonymousClass0RV("WorkSpec", str9, str9, A03("work_spec_id"), A03("id")));
                            AnonymousClass0RP r4 = new AnonymousClass0RP("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                            A01 = A01(r3, "WorkProgress");
                            if (!r4.equals(A01)) {
                                A0r = AnonymousClass000.A0r("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
                                A0r.append(r4);
                            } else {
                                HashMap hashMap7 = new HashMap(2);
                                A07("key", hashMap7);
                                hashMap7.put("long_value", new AnonymousClass0WI("long_value", "INTEGER", (String) null, 0, 1, false));
                                AnonymousClass0RP r43 = new AnonymousClass0RP("Preference", hashMap7, new HashSet(0), new HashSet(0));
                                AnonymousClass0RP A012 = A01(r3, "Preference");
                                if (r43.equals(A012)) {
                                    return new AnonymousClass0O2((String) null, true);
                                }
                                A0r = AnonymousClass000.A0r("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
                                A0r.append(r43);
                                A0r.append("\n Found:\n");
                                A0r.append(A012);
                                return new AnonymousClass0O2(A0r.toString(), false);
                            }
                        }
                    }
                }
            }
            A0r.append("\n Found:\n");
            A0r.append(A01);
            return new AnonymousClass0O2(A0r.toString(), false);
        }
        A0r.append(str);
        A0r.append(r6);
        A0r.append("\n Found:\n");
        A0r.append(A01);
        return new AnonymousClass0O2(A0r.toString(), false);
    }

    public void A09(C13620mg r2) {
        r2.A8n("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.A8n("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        r2.A8n("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        r2.A8n("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r2.A8n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r2.A8n("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        r2.A8n("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.A8n("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        r2.A8n("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.A8n("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.A8n("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        r2.A8n("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.A8n("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        r2.A8n("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        r2.A8n("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }
}
