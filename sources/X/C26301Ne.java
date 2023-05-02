package X;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Ne  reason: invalid class name and case insensitive filesystem */
public class C26301Ne {
    public final C16570tH A00;
    public final C16300so A01;
    public final C16180sb A02;
    public final C16190sc A03;
    public final AnonymousClass12W A04;
    public final C16440t3 A05;
    public final C16980tz A06;
    public final C16260sj A07;
    public final C15860rz A08;
    public final C20020zN A09;
    public final C16490t9 A0A;
    public final C15960sC A0B;
    public final AtomicBoolean A0C = new AtomicBoolean(false);

    public C26301Ne(C16570tH r3, C16300so r4, C16180sb r5, C16190sc r6, AnonymousClass12W r7, C16440t3 r8, C16980tz r9, C16260sj r10, C15860rz r11, C20020zN r12, C16490t9 r13, C15960sC r14) {
        this.A06 = r9;
        this.A05 = r8;
        this.A01 = r4;
        this.A02 = r5;
        this.A0A = r13;
        this.A03 = r6;
        this.A09 = r12;
        this.A04 = r7;
        this.A07 = r10;
        this.A08 = r11;
        this.A0B = r14;
        this.A00 = r3;
    }

    public static void A00(Uri uri, C16980tz r7, File file) {
        try {
            ContentResolver contentResolver = r7.A00.getContentResolver();
            StringBuilder sb = new StringBuilder();
            sb.append(file.getAbsolutePath());
            sb.append('%');
            contentResolver.delete(uri, "_data LIKE ?", new String[]{sb.toString()});
        } catch (RuntimeException e2) {
            StringBuilder sb2 = new StringBuilder("externaldirmigration/unscan failed for ");
            sb2.append(file);
            Log.e(sb2.toString(), e2);
        }
    }

    public final int A01() {
        int i2 = ((SharedPreferences) this.A08.A01.get()).getInt("external_dir_migration_stage", 0);
        if (i2 >= 0 && i2 <= 5) {
            return i2;
        }
        StringBuilder sb = new StringBuilder("externaldirmigration/unexpected stage (");
        sb.append(i2);
        sb.append(") resetting to not started");
        Log.e(sb.toString());
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        if ((!new java.io.File(r23, ".nomedia").exists()) == false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5 A[Catch:{ IOException -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0155 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(android.util.SparseIntArray r25, X.C84674Ll r26, java.io.File r27, java.io.File r28, boolean r29) {
        /*
            r24 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x01a9
            r13 = r27
            boolean r0 = r13.exists()
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = ".migrated"
            java.io.File r12 = new java.io.File
            r12.<init>(r13, r0)
            boolean r0 = r12.exists()
            r1 = 1
            if (r0 != 0) goto L_0x0034
            r23 = r28
            boolean r0 = r23.exists()
            r1 = 2
            r11 = r24
            r14 = r25
            if (r0 != 0) goto L_0x0035
            boolean r0 = r23.mkdir()
            if (r0 != 0) goto L_0x0035
            r0 = 3
            r11.A03(r14, r0)
        L_0x0034:
            return r1
        L_0x0035:
            java.lang.String r15 = " to="
            java.lang.String r2 = ".nomedia"
            java.io.File r0 = new java.io.File
            r0.<init>(r13, r2)
            boolean r0 = r0.exists()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0057
            java.io.File r1 = new java.io.File
            r0 = r23
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            r0 = r0 ^ 1
            r16 = 1
            if (r0 != 0) goto L_0x0059
        L_0x0057:
            r16 = 0
        L_0x0059:
            java.io.File[] r10 = r13.listFiles()
            java.lang.String r9 = "externaldirmigration/move/can't delete from="
            r22 = r29
            if (r10 == 0) goto L_0x0187
            int r8 = r10.length
            r7 = 0
            r6 = 0
        L_0x0066:
            if (r6 >= r8) goto L_0x0159
            r2 = r10[r6]
            java.lang.String r1 = r2.getName()
            java.io.File r5 = new java.io.File
            r0 = r23
            r5.<init>(r0, r1)
            com.whatsapp.util.StatResult r3 = com.obwhatsapp.ExternalDirMigration$Utils.lstatOpenFile(r2)     // Catch:{ IOException -> 0x014c }
            if (r3 == 0) goto L_0x0155
            boolean r1 = r3.A05     // Catch:{ IOException -> 0x014c }
            r0 = r26
            if (r1 != 0) goto L_0x00c0
            boolean r1 = r2.isDirectory()     // Catch:{ IOException -> 0x014c }
            if (r1 == 0) goto L_0x0099
            r19 = r0
            r20 = r2
            r21 = r5
            r17 = r11
            r18 = r14
            int r0 = r17.A02(r18, r19, r20, r21, r22)     // Catch:{ IOException -> 0x014c }
            if (r0 <= r7) goto L_0x0155
            goto L_0x0154
        L_0x0099:
            int r1 = r3.A01     // Catch:{ IOException -> 0x014c }
            r3 = 1
            if (r1 <= r3) goto L_0x00c0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x014c }
            r3.<init>()     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = "externaldirmigration/can't migrate "
            r3.append(r0)     // Catch:{ IOException -> 0x014c }
            r3.append(r2)     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = "(too many hard links: "
            r3.append(r0)     // Catch:{ IOException -> 0x014c }
            r3.append(r1)     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x014c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x014c }
            goto L_0x00f2
        L_0x00c0:
            boolean r1 = r5.exists()     // Catch:{ IOException -> 0x014c }
            if (r1 == 0) goto L_0x00f7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x014c }
            r1.<init>()     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = "externaldirmigration/file already exists, to="
            r1.append(r0)     // Catch:{ IOException -> 0x014c }
            r1.append(r5)     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x014c }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x014c }
            boolean r0 = r2.delete()     // Catch:{ IOException -> 0x014c }
            if (r0 != 0) goto L_0x0155
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x014c }
            r0.<init>()     // Catch:{ IOException -> 0x014c }
            r0.append(r9)     // Catch:{ IOException -> 0x014c }
            r0.append(r2)     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x014c }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x014c }
        L_0x00f2:
            r0 = 1
            if (r7 >= r0) goto L_0x0155
            r7 = 1
            goto L_0x0155
        L_0x00f7:
            X.12W r1 = r11.A04     // Catch:{ IOException -> 0x014c }
            boolean r1 = X.AnonymousClass1XI.A0L(r1, r2, r5)     // Catch:{ IOException -> 0x014c }
            if (r1 == 0) goto L_0x0125
            X.1Ne r4 = r0.A00     // Catch:{ IOException -> 0x014c }
            java.util.List r3 = r0.A01     // Catch:{ IOException -> 0x014c }
            boolean r2 = r0.A03     // Catch:{ IOException -> 0x014c }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A02     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = "scoped"
            if (r16 == 0) goto L_0x010f
            r3.add(r5)     // Catch:{ IOException -> 0x014c }
        L_0x010f:
            if (r2 == 0) goto L_0x0155
            r3 = 0
            r2 = 1
            boolean r1 = r1.compareAndSet(r3, r2)     // Catch:{ IOException -> 0x014c }
            if (r1 == 0) goto L_0x0155
            X.0sc r1 = r4.A03     // Catch:{ IOException -> 0x014c }
            r1.A09(r0)     // Catch:{ IOException -> 0x014c }
            X.0rz r1 = r4.A08     // Catch:{ IOException -> 0x014c }
            r0 = 2
            r1.A0g(r0)     // Catch:{ IOException -> 0x014c }
            goto L_0x0155
        L_0x0125:
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x014c }
            if (r0 == 0) goto L_0x0155
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x014c }
            r1.<init>()     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = "externaldirmigration/can't rename from="
            r1.append(r0)     // Catch:{ IOException -> 0x014c }
            r1.append(r2)     // Catch:{ IOException -> 0x014c }
            r1.append(r15)     // Catch:{ IOException -> 0x014c }
            r1.append(r5)     // Catch:{ IOException -> 0x014c }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x014c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x014c }
            if (r29 != 0) goto L_0x0152
            r0 = 4
            r11.A03(r14, r0)     // Catch:{ IOException -> 0x014c }
            goto L_0x0152
        L_0x014c:
            r1 = move-exception
            java.lang.String r0 = "Failed to read a file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0152:
            r7 = 2
            goto L_0x0155
        L_0x0154:
            r7 = r0
        L_0x0155:
            int r6 = r6 + 1
            goto L_0x0066
        L_0x0159:
            if (r7 == 0) goto L_0x0187
            r1 = 1
            r3 = 2
            if (r7 != r1) goto L_0x01a6
            X.0sc r0 = r11.A03
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r12.exists()     // Catch:{ IOException -> 0x0174 }
            if (r0 != 0) goto L_0x0034
            boolean r0 = r12.createNewFile()     // Catch:{ IOException -> 0x0174 }
            if (r0 == 0) goto L_0x01a6
            return r1
        L_0x0174:
            r2 = move-exception
            java.lang.String r1 = "externaldirmigration/ensureFileExists failed to create "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        L_0x0187:
            boolean r0 = r13.delete()
            if (r0 != 0) goto L_0x01a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r29 != 0) goto L_0x01a5
            r0 = 6
            r11.A03(r14, r0)
        L_0x01a5:
            r3 = 2
        L_0x01a6:
            return r3
        L_0x01a7:
            r3 = 0
            return r3
        L_0x01a9:
            java.lang.String r1 = "Must not be called on older api"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26301Ne.A02(android.util.SparseIntArray, X.4Ll, java.io.File, java.io.File, boolean):int");
    }

    public final void A03(SparseIntArray sparseIntArray, int i2) {
        if (sparseIntArray != null) {
            int i3 = sparseIntArray.get(i2, 0);
            sparseIntArray.put(i2, i3 + 1);
            if (i3 != 0) {
                return;
            }
        }
        if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 6) {
            C16300so r2 = this.A01;
            StringBuilder sb = new StringBuilder("externaldirmigration/failed: ");
            Integer valueOf = Integer.valueOf(i2);
            sb.append(valueOf == null ? null : valueOf.toString());
            r2.AcB(sb.toString(), (String) null, true);
        }
        C75243rq r6 = new C75243rq();
        r6.A00 = Integer.valueOf(i2);
        AnonymousClass01D r9 = this.A08.A01;
        r6.A01 = Long.valueOf(((SharedPreferences) r9.get()).getLong("external_dir_migration_attempt_n", -1));
        r6.A04 = Long.valueOf(((SharedPreferences) r9.get()).getLong("ext_dir_migration_rescan_time", -1));
        r6.A03 = Long.valueOf(((SharedPreferences) r9.get()).getLong("ext_dir_migration_move_time", -1));
        r6.A02 = Long.valueOf(System.currentTimeMillis() - ((SharedPreferences) r9.get()).getLong("ext_dir_migration_start_time", 0));
        this.A0A.A0B(r6, (AnonymousClass00F) null, false);
    }

    public final void A04(File file, List list, Set set) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            boolean z2 = !new File(file, ".nomedia").exists();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (set.add(file2)) {
                        A04(file2, list, set);
                    }
                } else if (z2) {
                    list.add(file2);
                }
            }
        }
    }
}
