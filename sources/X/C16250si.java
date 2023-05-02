package X;

import android.os.Environment;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0si  reason: invalid class name and case insensitive filesystem */
public class C16250si {
    public int A00 = 3;
    public File A01;
    public File A02;
    public final AnonymousClass027 A03;
    public final C16300so A04;
    public final C14870pt A05;
    public final C16040sK A06;
    public final C40961uy A07;
    public final C16200sd A08;
    public final C210812s A09;
    public final C16190sc A0A;
    public final AnonymousClass12W A0B;
    public final C16440t3 A0C;
    public final C16980tz A0D;
    public final C19380yL A0E;
    public final C16260sj A0F;
    public final C15860rz A0G;
    public final C14730pf A0H;
    public final C18790xG A0I;
    public final AnonymousClass1D0 A0J;
    public final C27631Sn A0K;
    public final AnonymousClass11K A0L;
    public final AnonymousClass17F A0M;
    public final C16480t8 A0N;
    public final AnonymousClass0y0 A0O;
    public final C19650ym A0P;
    public final C16900tq A0Q;
    public final AnonymousClass131 A0R;
    public final AnonymousClass17C A0S;
    public final AnonymousClass11E A0T;
    public final AnonymousClass11D A0U;
    public final C206911f A0V;
    public final C14710pd A0W;
    public final C16490t9 A0X;
    public final AnonymousClass12X A0Y;
    public final C18870xO A0Z;
    public final AnonymousClass0y3 A0a;
    public final C17020u3 A0b;
    public final C27841Ti A0c;
    public final C210112l A0d;
    public final C16990u0 A0e;
    public final AnonymousClass12V A0f;
    public final C16320sq A0g;
    public final AnonymousClass1CW A0h;
    public final Object A0i = new Object();
    public final Set A0j = new HashSet();

    public C16250si(C16300so r5, C14870pt r6, C16040sK r7, C16200sd r8, C210812s r9, C16190sc r10, AnonymousClass12W r11, C16440t3 r12, C16980tz r13, C19380yL r14, C16260sj r15, C15860rz r16, C14730pf r17, C18790xG r18, AnonymousClass1D0 r19, C27631Sn r20, AnonymousClass11K r21, AnonymousClass17F r22, C16480t8 r23, AnonymousClass0y0 r24, C19650ym r25, C16900tq r26, AnonymousClass131 r27, AnonymousClass17C r28, AnonymousClass11E r29, AnonymousClass11D r30, C206911f r31, C14710pd r32, C16490t9 r33, AnonymousClass12X r34, C18870xO r35, AnonymousClass0y3 r36, C17020u3 r37, C27841Ti r38, C210112l r39, C16990u0 r40, AnonymousClass12V r41, C16320sq r42, AnonymousClass1CW r43) {
        this.A0D = r13;
        this.A0C = r12;
        C14710pd r2 = r32;
        this.A0W = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A0f = r41;
        this.A06 = r7;
        this.A0g = r42;
        this.A0X = r33;
        this.A0A = r10;
        this.A0H = r17;
        this.A0V = r31;
        this.A0h = r43;
        this.A0M = r22;
        this.A0Z = r35;
        this.A0I = r18;
        this.A08 = r8;
        this.A0K = r20;
        this.A0J = r19;
        this.A0N = r23;
        this.A0B = r11;
        AnonymousClass11D r3 = r30;
        this.A0U = r3;
        this.A0S = r28;
        this.A0c = r38;
        this.A0O = r24;
        this.A0a = r36;
        this.A0Q = r26;
        this.A0F = r15;
        this.A0G = r16;
        this.A09 = r9;
        this.A0E = r14;
        this.A0e = r40;
        this.A0L = r21;
        this.A0T = r29;
        this.A0b = r37;
        this.A0R = r27;
        this.A0d = r39;
        this.A0P = r25;
        this.A0Y = r34;
        this.A03 = new AnonymousClass027();
        boolean A0E2 = r2.A0E(C16620tM.A02, 2668);
        this.A07 = new C40961uy(r3, A0E2 ? 1 : 0, A0E2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r1 != null) goto L_0x0038;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0078 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x0078=Splitter:B:44:0x0078, B:37:0x006e=Splitter:B:37:0x006e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.io.File r7) {
        /*
            r6 = -1
            java.lang.String r1 = r7.getAbsolutePath()     // Catch:{ Exception -> 0x0079 }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            r5 = 0
            android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r5, r0)     // Catch:{ Exception -> 0x0079 }
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0072 }
            r1 = 0
            java.lang.String r0 = "table"
            r4[r1] = r0     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "messages"
            r2 = 1
            r4[r2] = r0     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "SELECT sql FROM sqlite_master WHERE type = ? AND name = ?"
            android.database.Cursor r1 = r3.rawQuery(r0, r4)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "sql"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0038
        L_0x0035:
            r0 = r5
            if (r1 == 0) goto L_0x003b
        L_0x0038:
            r1.close()     // Catch:{ all -> 0x0072 }
        L_0x003b:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "SELECT COUNT(*) as count FROM messages"
        L_0x0043:
            android.database.Cursor r1 = r3.rawQuery(r0, r5)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x006e
            goto L_0x004d
        L_0x004a:
            java.lang.String r0 = "SELECT COUNT(*) as count FROM message"
            goto L_0x0043
        L_0x004d:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0069 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0069 }
            int r0 = r0 - r2
            r1.close()     // Catch:{ all -> 0x0072 }
            r3.close()     // Catch:{ Exception -> 0x0079 }
            return r0
        L_0x0065:
            r1.close()     // Catch:{ all -> 0x0072 }
            goto L_0x006e
        L_0x0069:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x006e:
            r3.close()     // Catch:{ Exception -> 0x0079 }
            return r6
        L_0x0072:
            r0 = move-exception
            if (r3 == 0) goto L_0x0078
            r3.close()     // Catch:{ all -> 0x0078 }
        L_0x0078:
            throw r0     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            r2 = move-exception
            java.lang.String r0 = "msgstore/getMessageCountInDb error while trying to retrieve messages count in "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16250si.A00(java.io.File):int");
    }

    public static void A01(C16810tg r3, String str, String str2) {
        StringBuilder sb = new StringBuilder("DROP INDEX IF EXISTS ");
        sb.append(str2);
        String obj = sb.toString();
        C34021jZ.A01(str, "dropViewIfExistsWithoutStatement", C34021jZ.A00(str2));
        r3.A0B(obj);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(java.io.File r5) {
        /*
            r4 = 0
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x0041 }
            if (r0 != 0) goto L_0x0008
            return r4
        L_0x0008:
            java.lang.String r2 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0041 }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r1, r0)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r0 = "PRAGMA integrity_check"
            java.lang.String r2 = android.database.DatabaseUtils.stringForQuery(r3, r0, r1)     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "msgstore/fieldstat/isdatabaseintegrityok "
            r1.append(r0)     // Catch:{ all -> 0x003a }
            r1.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x003a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "ok"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0039
            r3.close()     // Catch:{ Exception -> 0x0041 }
        L_0x0039:
            return r0
        L_0x003a:
            r0 = move-exception
            if (r3 == 0) goto L_0x0040
            r3.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            java.lang.String r0 = "msgstore/fieldstat/isdatabaseintegrityok/error "
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16250si.A02(java.io.File):boolean");
    }

    public static final boolean A03(File file, String str) {
        File parentFile = file.getParentFile();
        AnonymousClass00B.A06(parentFile);
        if (parentFile.exists()) {
            return true;
        }
        StringBuilder sb = new StringBuilder("MessageStoreBackup/");
        sb.append(str);
        sb.append("/createdir");
        Log.i(sb.toString());
        if (parentFile.mkdirs()) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageStoreBackup/");
        sb2.append(str);
        sb2.append("/createdir failed");
        Log.w(sb2.toString());
        return false;
    }

    public int A04() {
        C16900tq r0 = this.A0Q;
        r0.A04();
        long length = r0.A06.length();
        long A012 = this.A0H.A01();
        if (A012 > 7 * length) {
            return 7;
        }
        int max = Math.max((int) (A012 / length), 2);
        StringBuilder sb = new StringBuilder("MessageStoreBackup/backup/backupexpirationInDays not enough space to store full backup history, saving backups only for ");
        sb.append(max);
        sb.append(" days");
        Log.i(sb.toString());
        return max;
    }

    public int A05() {
        for (C16960tx A0E2 : C16960tx.values()) {
            A0E(A0E2);
        }
        return A0F().size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0790, code lost:
        if (r1 != null) goto L_0x0792;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x07a4, code lost:
        if (r14 != null) goto L_0x07a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x094f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0958, code lost:
        if (r8.A0H.A01() == 0) goto L_0x095a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x095a, code lost:
        com.whatsapp.util.Log.w("MessageStoreBackup/backupDatabase/out-of-space");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:?, code lost:
        r0 = r0.A01();
        java.lang.String.format(java.util.Locale.ENGLISH, "MessageStoreBackup backupDatabase time spent: %.2f seconds", new java.lang.Object[]{java.lang.Double.valueOf(((double) r0) / 1000.0d)});
        r3 = new java.lang.StringBuilder();
        r3.append("MessageStoreBackup/backupDatabase | time spent: ");
        r3.append(r0);
        com.whatsapp.util.Log.i(r3.toString());
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x098c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("MessageStoreBackup/backupDatabase/failed ");
        r1.append(r2);
        r7.A00(r1.toString(), 4);
        r6.A0B = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:?, code lost:
        r0 = r0.A01();
        java.lang.String.format(java.util.Locale.ENGLISH, "MessageStoreBackup backupDatabase time spent: %.2f seconds", new java.lang.Object[]{java.lang.Double.valueOf(((double) r0) / 1000.0d)});
        r3 = new java.lang.StringBuilder();
        r3.append("MessageStoreBackup/backupDatabase | time spent: ");
        r3.append(r0);
        com.whatsapp.util.Log.i(r3.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0368 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x03c1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:227:0x078d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:255:0x07cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00e1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:357:0x0b26 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0165 */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x031e A[Catch:{ all -> 0x07cf, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x034f A[SYNTHETIC, Splitter:B:133:0x034f] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03de A[Catch:{ all -> 0x0789, all -> 0x078d, SQLException -> 0x03c7, all -> 0x07c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0765 A[Catch:{ all -> 0x0789, all -> 0x078d, SQLException -> 0x03c7, all -> 0x07c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x07a4 A[Catch:{ all -> 0x0789, all -> 0x078d, SQLException -> 0x03c7, all -> 0x07c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0804 A[Catch:{ all -> 0x07cf, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0834 A[SYNTHETIC, Splitter:B:263:0x0834] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x098c A[ExcHandler: UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r2v16 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:102:0x029c] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0a64 A[Catch:{ SQLiteException -> 0x0a75, all -> 0x0b0c }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0adf  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0aed  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:145:0x0368=Splitter:B:145:0x0368, B:139:0x035e=Splitter:B:139:0x035e} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:236:0x07a6=Splitter:B:236:0x07a6, B:255:0x07cf=Splitter:B:255:0x07cf} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x00e1=Splitter:B:32:0x00e1, B:27:0x00d9=Splitter:B:27:0x00d9} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:62:0x0165=Splitter:B:62:0x0165, B:56:0x0159=Splitter:B:56:0x0159} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A06(X.C17000u1 r46) {
        /*
            r45 = this;
            java.lang.String r0 = "MessageStoreBackup/backupdb"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = r45
            X.0tz r0 = r8.A0D
            android.content.Context r0 = r0.A00
            r44 = r0
            X.0u0 r7 = r8.A0e
            java.lang.String r0 = "checkaccounthashvalidity"
            r6 = 0
            r7.A00(r0, r6)
            X.2Fy r5 = X.C40691uX.A05(r44)     // Catch:{ Exception -> 0x0b2c }
            java.lang.String r0 = "checkaccounthashvalidity/null-check: backup key is null = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 0
            if (r5 != 0) goto L_0x0024
            r0 = 1
        L_0x0024:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4 = 2
            r7.A00(r0, r4)
            if (r5 == 0) goto L_0x0b3f
            java.lang.String r0 = "checkaccounthashvalidity/google id salt is null = "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            X.1ub r0 = r5.A00
            byte[] r2 = r0.A02
            r3.append(r6)
            java.lang.String r0 = " hashedGoogleId is null = "
            r3.append(r0)
            byte[] r1 = r5.A02
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            r7.A00(r0, r4)
            byte[] r0 = X.C40691uX.A0G(r2)
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L_0x0b3f
            X.11K r4 = r8.A0L
            X.2Fn r3 = r4.A08
            r1 = 0
            r0 = 1
            r4.A01(r3, r1, r0)
            X.0tq r0 = r8.A0Q
            r43 = r0
            X.0tf r3 = r43.A02()
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x0b27 }
            r43.A04()     // Catch:{ all -> 0x0b22 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x0b22 }
            r18 = r0
            X.0tg r0 = r0.A00     // Catch:{ all -> 0x0b22 }
            if (r0 == 0) goto L_0x0b1a
            java.lang.String r0 = "databasehelper/cleanBeforeBackup"
            X.1Zf r1 = new X.1Zf     // Catch:{ all -> 0x0b22 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0b22 }
            r0 = r18
            r0.A06(r3)     // Catch:{ all -> 0x0b22 }
            r1.A01()     // Catch:{ all -> 0x0b22 }
            r2.A00()     // Catch:{ all -> 0x0b22 }
            r2.close()     // Catch:{ all -> 0x0b27 }
            r3.close()
            java.lang.String r0 = "MessageStoreBackup/backupdb/ephemeral purge is done and starting backup now"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Fz r6 = new X.2Fz
            r6.<init>()
            r43.A04()
            r0 = r43
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A07
            r42 = r0
            r42.lock()
            X.027 r1 = r8.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            X.0y3 r1 = r8.A0a
            r0 = 0
            r1.A03(r0)
            r5 = 1
            r2 = 0
            r43.A04()     // Catch:{ Exception -> 0x00e2 }
            X.0tg r1 = r18.AFO()     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r0 = "select sqlite_version() AS sqlite_version"
            android.database.Cursor r3 = r1.A07(r2, r0, r2)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r1 = ""
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = "sqlite_version"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = r3.getString(r0)     // Catch:{ all -> 0x00dd }
        L_0x00d9:
            r3.close()     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00e9
        L_0x00dd:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            throw r0     // Catch:{ Exception -> 0x00e2 }
        L_0x00e2:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backup/errors/failed to query sqlite version"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = r2
        L_0x00e9:
            r6.A0C = r1
            r43.A04()     // Catch:{ all -> 0x0b0c }
            r0 = r43
            java.io.File r0 = r0.A06     // Catch:{ all -> 0x0b0c }
            r41 = r0
            java.lang.String r1 = "MessageStoreBackup/backupdb/beforeclose/list "
            X.AnonymousClass1XI.A0F(r0, r1)     // Catch:{ all -> 0x0b0c }
            r43.A04()     // Catch:{ all -> 0x0b0c }
            monitor-enter(r18)     // Catch:{ all -> 0x0b0c }
            r0 = r18
            X.0tg r0 = r0.A00     // Catch:{ all -> 0x0b09 }
            r9 = 1
            if (r0 == 0) goto L_0x0168
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0b09 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0b09 }
            if (r0 == 0) goto L_0x0168
            r0 = r18
            X.0tg r0 = r0.A00     // Catch:{ all -> 0x0b09 }
            android.database.sqlite.SQLiteDatabase r1 = r0.A00     // Catch:{ all -> 0x0b09 }
            boolean r0 = r1.isWriteAheadLoggingEnabled()     // Catch:{ all -> 0x0b09 }
            if (r0 == 0) goto L_0x0168
            java.lang.String r0 = "PRAGMA wal_checkpoint(FULL);"
            android.database.Cursor r4 = r1.rawQuery(r0, r2)     // Catch:{ all -> 0x0b09 }
            r1 = 0
            if (r4 == 0) goto L_0x0166
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0161 }
            if (r0 == 0) goto L_0x015d
            int r3 = r4.getInt(r1)     // Catch:{ all -> 0x0161 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0161 }
            r2.<init>()     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = "msgstore/wal_checkpoint: "
            r2.append(r0)     // Catch:{ all -> 0x0161 }
            r2.append(r3)     // Catch:{ all -> 0x0161 }
            java.lang.String r1 = " "
            r2.append(r1)     // Catch:{ all -> 0x0161 }
            int r0 = r4.getInt(r5)     // Catch:{ all -> 0x0161 }
            r2.append(r0)     // Catch:{ all -> 0x0161 }
            r2.append(r1)     // Catch:{ all -> 0x0161 }
            r0 = 2
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x0161 }
            r2.append(r0)     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0161 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0161 }
            if (r3 == 0) goto L_0x0159
            r9 = 0
        L_0x0159:
            r4.close()     // Catch:{ all -> 0x0b09 }
            goto L_0x0168
        L_0x015d:
            r4.close()     // Catch:{ all -> 0x0b09 }
            goto L_0x0166
        L_0x0161:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0165 }
        L_0x0165:
            throw r0     // Catch:{ all -> 0x0b09 }
        L_0x0166:
            monitor-exit(r18)     // Catch:{ all -> 0x0b0c }
            goto L_0x016a
        L_0x0168:
            monitor-exit(r18)     // Catch:{ all -> 0x0b0c }
            goto L_0x016b
        L_0x016a:
            r9 = 0
        L_0x016b:
            r25 = 1
            if (r9 != 0) goto L_0x0176
            java.lang.String r0 = "MessageStoreBackup/backup/wal checkpoint failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0b0c }
            goto L_0x0ad2
        L_0x0176:
            r43.A04()     // Catch:{ all -> 0x0b0c }
            r18.close()     // Catch:{ all -> 0x0b0c }
            r43.A04()     // Catch:{ all -> 0x0b0c }
            java.lang.String r1 = "MessageStoreBackup/backupdb/afterclose/list "
            r0 = r41
            X.AnonymousClass1XI.A0F(r0, r1)     // Catch:{ all -> 0x0b0c }
            X.0sd r0 = r8.A08     // Catch:{ all -> 0x0b0c }
            r33 = r0
            X.0tx r9 = X.C40691uX.A06(r33)     // Catch:{ all -> 0x0b0c }
            com.facebook.redex.RunnableRunnableShape0S0110000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0110000_I0     // Catch:{ Exception -> 0x0a4f }
            r2.<init>(r8)     // Catch:{ Exception -> 0x0a4f }
            java.lang.String r0 = "MessageStoreBackup/dodbbackup/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0a4f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0a4f }
            r6.A05 = r0     // Catch:{ Exception -> 0x0a4f }
            long r23 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0a4f }
            java.lang.String r29 = "MessageStoreBackup/backupDatabase | time spent: "
            java.lang.String r28 = "MessageStoreBackup backupDatabase time spent: %.2f seconds"
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            X.12W r0 = r8.A0B     // Catch:{ all -> 0x0a35 }
            r34 = r0
            boolean r0 = r34.A02()     // Catch:{ all -> 0x0a35 }
            if (r0 == 0) goto L_0x01c1
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/skip no media or read-only media"
            r0 = 2
            r7.A00(r1, r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = "no/read-only media"
        L_0x01bd:
            r6.A0B = r0     // Catch:{ all -> 0x0a35 }
            goto L_0x09ff
        L_0x01c1:
            r43.A04()     // Catch:{ all -> 0x0a35 }
            boolean r0 = r41.exists()     // Catch:{ all -> 0x0a35 }
            r3 = 4
            if (r0 != 0) goto L_0x01e4
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/skip/file-not-found "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r1.<init>(r0)     // Catch:{ all -> 0x0a35 }
            r43.A04()     // Catch:{ all -> 0x0a35 }
            r0 = r41
            r1.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a35 }
            r7.A00(r0, r3)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = "db file not found"
            goto L_0x01bd
        L_0x01e4:
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r0.<init>(r1)     // Catch:{ all -> 0x0a35 }
            r0.append(r9)     // Catch:{ all -> 0x0a35 }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0a35 }
            X.1Zf r27 = new X.1Zf     // Catch:{ all -> 0x0a35 }
            r0 = r27
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0a35 }
            java.io.File r1 = r8.A0E(r9)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = "backupDatabase"
            boolean r0 = A03(r1, r0)     // Catch:{ all -> 0x0a35 }
            if (r0 == 0) goto L_0x09ff
            X.0tx[] r12 = X.C16960tx.values()     // Catch:{ all -> 0x0a35 }
            int r11 = r12.length     // Catch:{ all -> 0x0a35 }
            r10 = 0
        L_0x020b:
            if (r10 >= r11) goto L_0x028b
            r0 = r12[r10]     // Catch:{ all -> 0x0a35 }
            java.io.File r4 = r8.A0E(r0)     // Catch:{ all -> 0x0a35 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0a35 }
            if (r0 == 0) goto L_0x0288
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0a35 }
            long r0 = r4.lastModified()     // Catch:{ all -> 0x0a35 }
            long r15 = r15 - r0
            int r0 = r8.A04()     // Catch:{ all -> 0x0a35 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a35 }
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r13
            int r3 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x026b
            java.lang.String r0 = "MessageStoreBackup/backup/too_old "
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r13.<init>(r0)     // Catch:{ all -> 0x0a35 }
            long r0 = r4.lastModified()     // Catch:{ all -> 0x0a35 }
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x0a35 }
            r3.<init>(r0)     // Catch:{ all -> 0x0a35 }
            r13.append(r3)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = "MessageStoreBackup/backup/delete "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r1.<init>(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0a35 }
            r1.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x0a35 }
            boolean r0 = r4.delete()     // Catch:{ all -> 0x0a35 }
            r1.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            goto L_0x0288
        L_0x026b:
            java.lang.String r1 = ""
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0a35 }
            if (r0 == 0) goto L_0x0288
            java.util.Date r0 = new java.util.Date     // Catch:{ SecurityException -> 0x0288 }
            r0.<init>()     // Catch:{ SecurityException -> 0x0288 }
            java.lang.String r3 = X.AnonymousClass02N.A00(r4, r1, r0)     // Catch:{ SecurityException -> 0x0288 }
            java.io.File r1 = r4.getParentFile()     // Catch:{ SecurityException -> 0x0288 }
            java.io.File r0 = new java.io.File     // Catch:{ SecurityException -> 0x0288 }
            r0.<init>(r1, r3)     // Catch:{ SecurityException -> 0x0288 }
            r4.renameTo(r0)     // Catch:{ SecurityException -> 0x0288 }
        L_0x0288:
            int r10 = r10 + 1
            goto L_0x020b
        L_0x028b:
            int r0 = r9.version     // Catch:{ all -> 0x0a35 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a35 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0a35 }
            r6.A06 = r0     // Catch:{ all -> 0x0a35 }
            r21 = 0
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r4 = 0
            r43.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r19 = r41.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r6.A08 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r3.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/size "
            r3.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0 = r19
            r3.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r26 = "MessageStoreBackup/backupDatabase/to "
            r43.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.0pf r3 = r8.A0H     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r12 = r3.A02()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r10 = 3
            long r10 = r10 * r19
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d8
            java.lang.String r0 = "MessageStoreBackup/backup/prepare/db/not enough internal storage to make db copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            goto L_0x0311
        L_0x02d8:
            X.12X r1 = r8.A0Y     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            X.1XH r10 = r1.A00     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            java.lang.String r0 = ""
            java.io.File r10 = r10.A00(r0)     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            r0 = r41
            boolean r0 = X.AnonymousClass1XI.A0M(r1, r0, r10)     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            if (r0 != 0) goto L_0x02f0
            java.lang.String r0 = "MessageStoreBackup/backup/prepare/db/failed to copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            goto L_0x0311
        L_0x02f0:
            long r13 = r3.A01()     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            r0 = 2
            long r11 = r19 * r0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0305
            java.lang.String r0 = "MessageStoreBackup/backup/prepare/db/not enough external storage to use db copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            r10.delete()     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            goto L_0x0311
        L_0x0305:
            java.lang.String r0 = "MessageStoreBackup/backup/prepare/db/let's use db copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x030b, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c }
            goto L_0x0313
        L_0x030b:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backup/prepare/db/source failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
        L_0x0311:
            r10 = r41
        L_0x0313:
            r43.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0 = r41
            boolean r0 = r0.equals(r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 != 0) goto L_0x0326
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/unlocking db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r2.run()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
        L_0x0326:
            r43.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0 = r41
            boolean r0 = r0.equals(r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 != 0) goto L_0x07d0
            boolean r0 = r10.setWritable(r5)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 == 0) goto L_0x07d0
            java.lang.String r30 = "status_crossposting"
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0 = 0
            android.database.sqlite.SQLiteDatabase r14 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.0pd r15 = r8.A0W     // Catch:{ all -> 0x07c9 }
            r0 = 1856(0x740, float:2.601E-42)
            X.0tM r13 = X.C16620tM.A02     // Catch:{ all -> 0x07c9 }
            boolean r0 = r15.A0E(r13, r0)     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x03d6
            java.lang.String r1 = X.AnonymousClass2G0.A01     // Catch:{ Exception -> 0x0369 }
            r0 = 0
            android.database.Cursor r2 = r14.rawQuery(r1, r0)     // Catch:{ Exception -> 0x0369 }
            int r1 = r2.getCount()     // Catch:{ all -> 0x0362 }
            r0 = 0
            if (r1 <= 0) goto L_0x035e
            r0 = 1
        L_0x035e:
            r2.close()     // Catch:{ Exception -> 0x0369 }
            goto L_0x036e
        L_0x0362:
            r0 = move-exception
            if (r2 == 0) goto L_0x0368
            r2.close()     // Catch:{ all -> 0x0368 }
        L_0x0368:
            throw r0     // Catch:{ Exception -> 0x0369 }
        L_0x0369:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ SQLException -> 0x03c7 }
            r0 = 0
        L_0x036e:
            r12 = 0
            java.lang.String r11 = ")"
            if (r0 == 0) goto L_0x038e
            java.lang.String r2 = "message_thumbnail"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x03c7 }
            r1.<init>()     // Catch:{ SQLException -> 0x03c7 }
            java.lang.String r0 = "message_row_id IN ("
            r1.append(r0)     // Catch:{ SQLException -> 0x03c7 }
            java.lang.String r0 = X.AnonymousClass2G0.A01     // Catch:{ SQLException -> 0x03c7 }
            r1.append(r0)     // Catch:{ SQLException -> 0x03c7 }
            r1.append(r11)     // Catch:{ SQLException -> 0x03c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLException -> 0x03c7 }
            r14.delete(r2, r0, r12)     // Catch:{ SQLException -> 0x03c7 }
        L_0x038e:
            java.lang.String r3 = X.AnonymousClass2G0.A00     // Catch:{ Exception -> 0x03c2 }
            android.database.Cursor r2 = r14.rawQuery(r3, r12)     // Catch:{ Exception -> 0x03c2 }
            int r1 = r2.getCount()     // Catch:{ all -> 0x03bb }
            r0 = 0
            if (r1 <= 0) goto L_0x039c
            r0 = 1
        L_0x039c:
            r2.close()     // Catch:{ Exception -> 0x03c2 }
            if (r0 == 0) goto L_0x03cf
            java.lang.String r2 = "message_thumbnails"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x03c7 }
            r1.<init>()     // Catch:{ SQLException -> 0x03c7 }
            java.lang.String r0 = "ROWID IN ("
            r1.append(r0)     // Catch:{ SQLException -> 0x03c7 }
            r1.append(r3)     // Catch:{ SQLException -> 0x03c7 }
            r1.append(r11)     // Catch:{ SQLException -> 0x03c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLException -> 0x03c7 }
            r14.delete(r2, r0, r12)     // Catch:{ SQLException -> 0x03c7 }
            goto L_0x03cf
        L_0x03bb:
            r0 = move-exception
            if (r2 == 0) goto L_0x03c1
            r2.close()     // Catch:{ all -> 0x03c1 }
        L_0x03c1:
            throw r0     // Catch:{ Exception -> 0x03c2 }
        L_0x03c2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ SQLException -> 0x03c7 }
            goto L_0x03cf
        L_0x03c7:
            r1 = move-exception
            java.lang.String r0 = "ThumbnailHelper/deleteMediaThumbnails failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07c9 }
            r0 = 0
            goto L_0x03d0
        L_0x03cf:
            r0 = 1
        L_0x03d0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x07c9 }
            r6.A02 = r0     // Catch:{ all -> 0x07c9 }
        L_0x03d6:
            r0 = 2660(0xa64, float:3.727E-42)
            boolean r0 = r15.A0E(r13, r0)     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x075f
            long r2 = r10.length()     // Catch:{ all -> 0x07c9 }
            X.11f r0 = r8.A0V     // Catch:{ all -> 0x07c9 }
            X.0tg r13 = X.C33931jQ.A01(r14, r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "migration_fts_index"
            X.C33971jU.A01(r13, r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "migration_fts_retry"
            X.C33971jU.A01(r13, r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "fts_index_start"
            X.C33971jU.A01(r13, r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r11 = "0"
            java.lang.String r1 = "fts_ready"
            java.lang.String r0 = "FtsMessageStore"
            X.C33971jU.A03(r13, r1, r11, r0)     // Catch:{ all -> 0x07c9 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x07c9 }
            r12.<init>()     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "messages_fts"
            r12.add(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String[] r0 = X.C33991jW.A00     // Catch:{ all -> 0x07c9 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x07c9 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x07c9 }
            r1.<init>(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "v2"
            r1.add(r0)     // Catch:{ all -> 0x07c9 }
            java.util.Iterator r31 = r1.iterator()     // Catch:{ all -> 0x07c9 }
        L_0x041f:
            boolean r0 = r31.hasNext()     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x04b1
            java.lang.Object r11 = r31.next()     // Catch:{ all -> 0x07c9 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "message_fts"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x07c9 }
            r0.append(r11)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x07c9 }
            r12.add(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c9 }
            r15.<init>()     // Catch:{ all -> 0x07c9 }
            r15.append(r1)     // Catch:{ all -> 0x07c9 }
            r15.append(r11)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "_content"
            r15.append(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x07c9 }
            r12.add(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c9 }
            r15.<init>()     // Catch:{ all -> 0x07c9 }
            r15.append(r1)     // Catch:{ all -> 0x07c9 }
            r15.append(r11)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "_docsize"
            r15.append(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x07c9 }
            r12.add(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c9 }
            r15.<init>()     // Catch:{ all -> 0x07c9 }
            r15.append(r1)     // Catch:{ all -> 0x07c9 }
            r15.append(r11)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "_segdir"
            r15.append(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x07c9 }
            r12.add(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c9 }
            r15.<init>()     // Catch:{ all -> 0x07c9 }
            r15.append(r1)     // Catch:{ all -> 0x07c9 }
            r15.append(r11)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "_segments"
            r15.append(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x07c9 }
            r12.add(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c9 }
            r0.<init>()     // Catch:{ all -> 0x07c9 }
            r0.append(r1)     // Catch:{ all -> 0x07c9 }
            r0.append(r11)     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "_stat"
            r0.append(r1)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x07c9 }
            r12.add(r0)     // Catch:{ all -> 0x07c9 }
            goto L_0x041f
        L_0x04b1:
            java.util.Iterator r15 = r12.iterator()     // Catch:{ all -> 0x07c9 }
            r1 = 1
        L_0x04b6:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x07c9 }
            if (r0 == 0) goto L_0x04dc
            java.lang.Object r12 = r15.next()     // Catch:{ all -> 0x07c9 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "DatabaseUtils"
            X.C33961jT.A01(r13, r0, r12)     // Catch:{ SQLException -> 0x04c8 }
            goto L_0x04b6
        L_0x04c8:
            r11 = move-exception
            java.lang.String r1 = "DatabaseUtils/dropTables/failed to drop table: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c9 }
            r0.<init>(r1)     // Catch:{ all -> 0x07c9 }
            r0.append(r12)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x07c9 }
            com.whatsapp.util.Log.e(r0, r11)     // Catch:{ all -> 0x07c9 }
            r1 = 0
            goto L_0x04b6
        L_0x04dc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x07c9 }
            r6.A00 = r0     // Catch:{ all -> 0x07c9 }
            java.lang.String r1 = "AgentChatAssignmentTable"
            java.lang.String r0 = "chat_assignee_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "AgentDevicesTable"
            java.lang.String r0 = "agent_device_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "CallLinkTable"
            java.lang.String r0 = "call_link_token_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "CallLogParticipantTable"
            java.lang.String r0 = "call_log_participants_key_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "call_log_participant_key_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "CallLogTable"
            java.lang.String r0 = "call_log_key_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "ChatTable"
            java.lang.String r0 = "chat_group_type_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "deleted_chat_job_table"
            java.lang.String r0 = "deleted_chat_job_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "FrequentsTable"
            java.lang.String r0 = "frequent_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "GroupNotificationVersionTable"
            java.lang.String r0 = "group_notification_version_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "GroupParticipantsHistoryTable"
            java.lang.String r0 = "group_participants_history_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "GroupParticipantsTable"
            java.lang.String r0 = "group_participants_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "InteractiveMessageTable"
            java.lang.String r0 = "message_row_id_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "JidMapTable"
            java.lang.String r0 = "jid_lid_map_jid_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "JidTable"
            java.lang.String r0 = "jid_key_new_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "jid_raw_string_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "JoinableCallLogTable"
            java.lang.String r0 = "joinable_call_log_group_jid_row_id_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "joinable_call_log_call_id_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "LabeledJidTable"
            java.lang.String r0 = "labeled_jid_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "LabeledJidsLegacyTable"
            java.lang.String r0 = "labeled_jids_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "LabeledMessagesTable"
            java.lang.String r0 = "labeled_messages_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "LabelsTable"
            java.lang.String r0 = "labels_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "MentionTable"
            java.lang.String r0 = "mentions_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageAddOnOrphanTable"
            java.lang.String r0 = "message_add_on_orphan_key_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_add_on_orphan_parent_key_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageAddOnPollVoteSelectedOptionTable"
            java.lang.String r0 = "message_add_on_poll_vote_selected_option_message_add_on_row_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageAddOnReceiptDeviceTable"
            java.lang.String r0 = "message_add_on_receipt_device_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_add_on_receipt_device_jid_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageAddOnTable"
            java.lang.String r0 = "message_add_on_key_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_add_on_status_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_add_on_chat_status_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_add_on_parent_message_row_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageDetails"
            java.lang.String r0 = "message_details_author_device_jid_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageEphemeralTable"
            java.lang.String r0 = "message_ephemeral_expire_timestamp_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageLinkTable"
            java.lang.String r0 = "message_link_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageMediaInteractiveAnnotationTable"
            java.lang.String r0 = "message_media_interactive_annotation_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageMediaInteractiveAnnotationVertexTable"
            java.lang.String r0 = "message_media_interactive_annotation_vertex_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageMediaTable"
            java.lang.String r0 = "message_media_hash_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_media_chat_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_media_original_file_hash_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageMediaVCardCountTable"
            java.lang.String r0 = "message_media_vcard_count_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessagePollOptionTable"
            java.lang.String r0 = "message_poll_option_message_row_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageSystemChatParticipantTable"
            java.lang.String r0 = "message_system_chat_participant_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageTable"
            java.lang.String r0 = "message_chat_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_chat_sort_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_type_chat_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_sort_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_starred_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_starred_sort_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_type_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "message_key_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessageViewOnceTable"
            java.lang.String r0 = "message_view_once_media_state_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MessagesTable"
            java.lang.String r0 = "starred_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "media_hash_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "media_type_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "messages_jid_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "messages_key_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "media_type_jid_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MissedCallLogParticipantsTable"
            java.lang.String r0 = "missed_call_log_participants_key_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MissedCallLogsTable"
            java.lang.String r0 = "missed_call_logs_key_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "MmsThumbnailMetadataTable"
            java.lang.String r0 = "mms_thumbnail_metadata_transferred_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "OrphanedEditTable"
            java.lang.String r0 = "message_orphaned_edit_key_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "ParentGroupParticipantsTable"
            java.lang.String r0 = "parent_group_participants_parent_jid_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "PayTransactionTable"
            java.lang.String r0 = "message_payment_transaction_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r11 = "QuickReplyAttachmentsTable"
            java.lang.String r0 = "attachments_quick_reply_id_index"
            A01(r13, r11, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "quoted_mentions_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "QuotedVCardTable"
            java.lang.String r0 = "message_quoted_vcard_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "ReceiptDeviceTable"
            java.lang.String r0 = "receipt_device_table_device_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "receipt_device_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "ReceiptOrphanedTable"
            java.lang.String r0 = "receipt_orphaned_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "ReceiptUserTable"
            java.lang.String r0 = "receipt_user_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "ReceiptsTable"
            java.lang.String r0 = "receipts_key_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "TableGroupParticipantDevice"
            java.lang.String r0 = "group_participant_device_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "TableGroupParticipantUser"
            java.lang.String r0 = "group_participant_user_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "TableGroupPastParticipantUser"
            java.lang.String r0 = "group_past_participant_user_timestamp_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r0 = "group_past_participant_user_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "TemplateButtonTable"
            java.lang.String r0 = "message_template_button_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "TemplateTable"
            java.lang.String r0 = "message_template_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "ThumbnailTable"
            java.lang.String r0 = "messages_thumbnail_key_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "UserDeviceInfoTable"
            java.lang.String r0 = "user_device_info_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "UserDeviceTable"
            java.lang.String r0 = "user_device_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "VCardJidTable"
            java.lang.String r0 = "message_vcard_jid_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            java.lang.String r1 = "VCardTable"
            java.lang.String r0 = "message_vcard_index"
            A01(r13, r1, r0)     // Catch:{ SQLException -> 0x06fa }
            r0 = 1
            goto L_0x0700
        L_0x06fa:
            java.lang.String r0 = "DatabaseHelperdropIndexes failed to drop all of the indexes"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07c9 }
            r0 = 0
        L_0x0700:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x07c9 }
            r6.A01 = r0     // Catch:{ all -> 0x07c9 }
            java.lang.String r12 = "MessageStoreBackup"
            java.lang.String r11 = "VACUUM"
            java.lang.String r1 = "vacuumDb"
            java.lang.String r0 = "vacuum"
            X.C34021jZ.A01(r12, r1, r0)     // Catch:{ SQLException -> 0x0718 }
            r13.A0B(r11)     // Catch:{ SQLException -> 0x0718 }
            r0 = 1
            goto L_0x071f
        L_0x0718:
            r1 = move-exception
            java.lang.String r0 = "SharedDBQueryExecutor/vacuumDb/failed to vacuum"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07c9 }
            r0 = 0
        L_0x071f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x07c9 }
            r6.A03 = r0     // Catch:{ all -> 0x07c9 }
            long r0 = r10.length()     // Catch:{ all -> 0x07c9 }
            r31 = 100
            long r11 = r0 * r31
            long r11 = r11 / r2
            long r31 = r31 - r11
            java.lang.Long r13 = java.lang.Long.valueOf(r31)     // Catch:{ all -> 0x07c9 }
            r6.A09 = r13     // Catch:{ all -> 0x07c9 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x07c9 }
            r12.<init>()     // Catch:{ all -> 0x07c9 }
            java.lang.String r11 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/original size "
            r12.append(r11)     // Catch:{ all -> 0x07c9 }
            r12.append(r2)     // Catch:{ all -> 0x07c9 }
            java.lang.String r2 = " cleaned size "
            r12.append(r2)     // Catch:{ all -> 0x07c9 }
            r12.append(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = ", saved "
            r12.append(r0)     // Catch:{ all -> 0x07c9 }
            r12.append(r13)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "%"
            r12.append(r0)     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x07c9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07c9 }
        L_0x075f:
            boolean r0 = android.text.TextUtils.isEmpty(r30)     // Catch:{ all -> 0x07c9 }
            if (r0 != 0) goto L_0x07a4
            java.lang.String r2 = "table"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x07c9 }
            r1[r4] = r2     // Catch:{ all -> 0x07c9 }
            r1[r5] = r30     // Catch:{ all -> 0x07c9 }
            java.lang.String r0 = "SELECT sql FROM sqlite_master WHERE type = ? AND name = ?"
            android.database.Cursor r1 = r14.rawQuery(r0, r1)     // Catch:{ all -> 0x07c9 }
            if (r1 == 0) goto L_0x078e
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0789 }
            if (r0 == 0) goto L_0x078e
            java.lang.String r0 = "sql"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0789 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0789 }
            goto L_0x0792
        L_0x0789:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x078d }
        L_0x078d:
            throw r0     // Catch:{ all -> 0x07c9 }
        L_0x078e:
            java.lang.String r0 = ""
            if (r1 == 0) goto L_0x0795
        L_0x0792:
            r1.close()     // Catch:{ all -> 0x07c9 }
        L_0x0795:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07c9 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x07a6
            r1 = 0
            r0 = r30
            r14.delete(r0, r1, r1)     // Catch:{ all -> 0x07c9 }
            goto L_0x07a6
        L_0x07a4:
            if (r14 == 0) goto L_0x07a9
        L_0x07a6:
            r14.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
        L_0x07a9:
            java.lang.Boolean r0 = r6.A01     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 == 0) goto L_0x07b3
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 != 0) goto L_0x07c7
        L_0x07b3:
            java.lang.Boolean r0 = r6.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 == 0) goto L_0x07bd
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 != 0) goto L_0x07c7
        L_0x07bd:
            java.lang.Boolean r0 = r6.A03     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 == 0) goto L_0x07d0
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 == 0) goto L_0x07d0
        L_0x07c7:
            r0 = 1
            goto L_0x07d1
        L_0x07c9:
            r0 = move-exception
            if (r14 == 0) goto L_0x07cf
            r14.close()     // Catch:{ all -> 0x07cf }
        L_0x07cf:
            throw r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
        L_0x07d0:
            r0 = 0
        L_0x07d1:
            java.io.File r3 = r8.A0E(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.12V r13 = r8.A0f     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.0sK r12 = r8.A06     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.0xG r11 = r8.A0I     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.12X r2 = r8.A0Y     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.1uy r1 = r8.A07     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.Boolean r40 = java.lang.Boolean.valueOf(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.2G1 r0 = new X.2G1     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0.<init>(r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r30 = r12
            r31 = r0
            r32 = r1
            r35 = r11
            r36 = r2
            r37 = r7
            r38 = r9
            r39 = r13
            X.1uz r11 = X.C40951ux.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0 = r44
            boolean r0 = r11.A04(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 != 0) goto L_0x0834
            java.lang.String r0 = "failed to prepare for backup"
            r6.A0B = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r0 = r27.A01()     // Catch:{ all -> 0x0a35 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0a35 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0a35 }
            double r2 = (double) r0     // Catch:{ all -> 0x0a35 }
            double r2 = r2 / r16
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0a35 }
            r5[r4] = r2     // Catch:{ all -> 0x0a35 }
            r2 = r28
            java.lang.String.format(r7, r2, r5)     // Catch:{ all -> 0x0a35 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r3.<init>()     // Catch:{ all -> 0x0a35 }
            r2 = r29
            r3.append(r2)     // Catch:{ all -> 0x0a35 }
            r3.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            goto L_0x09ff
        L_0x0834:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0 = r26
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r0 = r3.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0 = r46
            r11.A03(r0, r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r43.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0 = r41
            boolean r0 = r0.equals(r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 != 0) goto L_0x085f
            r10.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
        L_0x085f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r2.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/file-closed size="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r0 = r3.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r0 = " modification time = "
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r0 = r3.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r9 = r3.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            int r0 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0896
            r0 = r19
            double r2 = (double) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            double r0 = (double) r9     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r6.A04 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
        L_0x0896:
            X.1v4 r0 = r11.A00()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            int r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 == r5) goto L_0x08d1
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/integrity-check/not-successful"
            r0 = 2
            r7.A00(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r0 = r27.A01()     // Catch:{ all -> 0x0a35 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0a35 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0a35 }
            double r2 = (double) r0     // Catch:{ all -> 0x0a35 }
            double r2 = r2 / r16
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0a35 }
            r5[r4] = r2     // Catch:{ all -> 0x0a35 }
            r2 = r28
            java.lang.String.format(r7, r2, r5)     // Catch:{ all -> 0x0a35 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r3.<init>()     // Catch:{ all -> 0x0a35 }
            r2 = r29
            r3.append(r2)     // Catch:{ all -> 0x0a35 }
            r3.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            r2 = 3
            goto L_0x0a00
        L_0x08d1:
            int r9 = r8.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.0tx[] r10 = X.C16960tx.values()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            int r3 = r10.length     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r2 = 0
        L_0x08db:
            java.lang.String r1 = ""
            if (r2 >= r3) goto L_0x08eb
            r0 = r10[r2]     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.io.File r0 = r8.A0E(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.AnonymousClass02N.A04(r0, r1, r9, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            int r2 = r2 + 1
            goto L_0x08db
        L_0x08eb:
            java.io.File r2 = r8.A0D()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            X.AnonymousClass02N.A04(r2, r1, r9, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            boolean r0 = r2.exists()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            if (r0 == 0) goto L_0x0922
            r2.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r0 = r2.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            long r11 = r11 - r0
            long r0 = (long) r9     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r9
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0922
            java.lang.String r1 = "MessageStoreBackup/backup/basefile_delete "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            boolean r1 = r2.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            r0.append(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x098c, IOException -> 0x094f }
        L_0x0922:
            long r0 = r27.A01()     // Catch:{ all -> 0x0a35 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0a35 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0a35 }
            double r2 = (double) r0     // Catch:{ all -> 0x0a35 }
            double r2 = r2 / r16
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0a35 }
            r5[r4] = r2     // Catch:{ all -> 0x0a35 }
            r2 = r28
            java.lang.String.format(r7, r2, r5)     // Catch:{ all -> 0x0a35 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r3.<init>()     // Catch:{ all -> 0x0a35 }
            r2 = r29
            r3.append(r2)     // Catch:{ all -> 0x0a35 }
            r3.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            r2 = 0
            goto L_0x0a00
        L_0x094f:
            r3 = move-exception
            X.0pf r0 = r8.A0H     // Catch:{ all -> 0x09d3 }
            long r1 = r0.A01()     // Catch:{ all -> 0x09d3 }
            int r0 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x098b
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/out-of-space"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x09d3 }
            long r0 = r27.A01()     // Catch:{ all -> 0x0a35 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0a35 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0a35 }
            double r2 = (double) r0     // Catch:{ all -> 0x0a35 }
            double r2 = r2 / r16
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0a35 }
            r5[r4] = r2     // Catch:{ all -> 0x0a35 }
            r2 = r28
            java.lang.String.format(r7, r2, r5)     // Catch:{ all -> 0x0a35 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r3.<init>()     // Catch:{ all -> 0x0a35 }
            r2 = r29
            r3.append(r2)     // Catch:{ all -> 0x0a35 }
            r3.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            r2 = 2
            goto L_0x0a00
        L_0x098b:
            throw r3     // Catch:{ all -> 0x09d3 }
        L_0x098c:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09d3 }
            r1.<init>()     // Catch:{ all -> 0x09d3 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/failed "
            r1.append(r0)     // Catch:{ all -> 0x09d3 }
            r1.append(r2)     // Catch:{ all -> 0x09d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x09d3 }
            r0 = 4
            r7.A00(r1, r0)     // Catch:{ all -> 0x09d3 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x09d3 }
            r6.A0B = r0     // Catch:{ all -> 0x09d3 }
            long r0 = r27.A01()     // Catch:{ all -> 0x0a35 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0a35 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0a35 }
            double r2 = (double) r0     // Catch:{ all -> 0x0a35 }
            double r2 = r2 / r16
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0a35 }
            r5[r4] = r2     // Catch:{ all -> 0x0a35 }
            r2 = r28
            java.lang.String.format(r7, r2, r5)     // Catch:{ all -> 0x0a35 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r3.<init>()     // Catch:{ all -> 0x0a35 }
            r2 = r29
            r3.append(r2)     // Catch:{ all -> 0x0a35 }
            r3.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            goto L_0x09ff
        L_0x09d3:
            r9 = move-exception
            long r0 = r27.A01()     // Catch:{ all -> 0x0a35 }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0a35 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0a35 }
            double r2 = (double) r0     // Catch:{ all -> 0x0a35 }
            double r2 = r2 / r16
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0a35 }
            r5[r4] = r2     // Catch:{ all -> 0x0a35 }
            r2 = r28
            java.lang.String.format(r7, r2, r5)     // Catch:{ all -> 0x0a35 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r3.<init>()     // Catch:{ all -> 0x0a35 }
            r2 = r29
            r3.append(r2)     // Catch:{ all -> 0x0a35 }
            r3.append(r0)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            throw r9     // Catch:{ all -> 0x0a35 }
        L_0x09ff:
            r2 = 1
        L_0x0a00:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0a35 }
            r6.A05 = r0     // Catch:{ all -> 0x0a35 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a35 }
            r1.<init>()     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = "MessageStoreBackup/dodbbackup/result = "
            r1.append(r0)     // Catch:{ all -> 0x0a35 }
            r1.append(r2)     // Catch:{ all -> 0x0a35 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a35 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a35 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0a4f }
            long r0 = r0 - r23
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0a4f }
            r6.A0A = r0     // Catch:{ Exception -> 0x0a4f }
            X.0pf r0 = r8.A0H     // Catch:{ Exception -> 0x0a4f }
            long r0 = r0.A02()     // Catch:{ Exception -> 0x0a4f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0a4f }
            r6.A07 = r0     // Catch:{ Exception -> 0x0a4f }
            r25 = r2
            goto L_0x0a5b
        L_0x0a35:
            r2 = move-exception
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0a4f }
            long r0 = r0 - r23
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0a4f }
            r6.A0A = r0     // Catch:{ Exception -> 0x0a4f }
            X.0pf r0 = r8.A0H     // Catch:{ Exception -> 0x0a4f }
            long r0 = r0.A02()     // Catch:{ Exception -> 0x0a4f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0a4f }
            r6.A07 = r0     // Catch:{ Exception -> 0x0a4f }
            throw r2     // Catch:{ Exception -> 0x0a4f }
        L_0x0a4f:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/backup/error "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0b0c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b0c }
            r6.A0B = r0     // Catch:{ all -> 0x0b0c }
        L_0x0a5b:
            r43.A04()     // Catch:{ all -> 0x0b0c }
            boolean r0 = r42.isHeldByCurrentThread()     // Catch:{ all -> 0x0b0c }
            if (r0 == 0) goto L_0x0adf
            java.lang.String r0 = "MessageStoreBackup/backupdb/callreset"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b0c }
            r43.A04()     // Catch:{ SQLiteException -> 0x0a75 }
            r18.AHC()     // Catch:{ SQLiteException -> 0x0a75 }
            X.17C r0 = r8.A0S     // Catch:{ SQLiteException -> 0x0a75 }
            r0.A01()     // Catch:{ SQLiteException -> 0x0a75 }
            goto L_0x0ae4
        L_0x0a75:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/failed-to-get-database/cannot-generate-fts-or-links"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0b0c }
            java.lang.Long r0 = r6.A06     // Catch:{ all -> 0x0b0c }
            if (r0 == 0) goto L_0x0ad0
            int r0 = r0.intValue()     // Catch:{ all -> 0x0b0c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b0c }
        L_0x0a87:
            java.lang.String r0 = "MessageStoreBackup/backup/log-chat-db-backup-event overall-result: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b0c }
            r1.<init>(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.Integer r0 = r6.A05     // Catch:{ all -> 0x0b0c }
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.String r0 = " database-backup-version: "
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            r1.append(r2)     // Catch:{ all -> 0x0b0c }
            java.lang.String r0 = " compression-ratio: "
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.Double r0 = r6.A04     // Catch:{ all -> 0x0b0c }
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.String r0 = " backup-file-size: "
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.Long r0 = r6.A08     // Catch:{ all -> 0x0b0c }
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.String r0 = " time: "
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.Long r0 = r6.A0A     // Catch:{ all -> 0x0b0c }
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.String r0 = " free-disk-space: "
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.Long r0 = r6.A07     // Catch:{ all -> 0x0b0c }
            r1.append(r0)     // Catch:{ all -> 0x0b0c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b0c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b0c }
            X.0t9 r0 = r8.A0X     // Catch:{ all -> 0x0b0c }
            r0.A06(r6)     // Catch:{ all -> 0x0b0c }
            goto L_0x0ad2
        L_0x0ad0:
            r2 = 0
            goto L_0x0a87
        L_0x0ad2:
            r43.A04()
            boolean r0 = r42.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0b08
            r8.A0I()
            return r25
        L_0x0adf:
            java.lang.String r0 = "MessageStoreBackup/backupdb/db lock not held by current thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b0c }
        L_0x0ae4:
            r43.A04()
            boolean r0 = r42.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0af0
            r8.A0I()
        L_0x0af0:
            X.0t9 r0 = r8.A0X
            r0.A06(r6)
            java.lang.String r0 = "MessageStoreBackup/backupdb/result = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r25
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0b08:
            return r25
        L_0x0b09:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0b0c }
            throw r0     // Catch:{ all -> 0x0b0c }
        L_0x0b0c:
            r1 = move-exception
            r43.A04()
            boolean r0 = r42.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0b19
            r8.A0I()
        L_0x0b19:
            throw r1
        L_0x0b1a:
            java.lang.String r1 = "databasehelper/cleanBeforeBackup/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b22 }
            r0.<init>(r1)     // Catch:{ all -> 0x0b22 }
            throw r0     // Catch:{ all -> 0x0b22 }
        L_0x0b22:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0b26 }
        L_0x0b26:
            throw r0     // Catch:{ all -> 0x0b27 }
        L_0x0b27:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0b2b }
        L_0x0b2b:
            throw r0
        L_0x0b2c:
            r2 = move-exception
            java.lang.String r1 = "checkaccounthashvalidity/error = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            r0 = 3
            r7.A00(r1, r0)
        L_0x0b3f:
            r1 = 2
            java.lang.String r0 = "MessageStoreBackup/backupdb/check/invalid"
            r7.A00(r0, r1)
            r0 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16250si.A06(X.0u1):int");
    }

    public long A07() {
        try {
            File A0A2 = A0A();
            if (A0A2 != null) {
                return A0A2.lastModified();
            }
            return 0;
        } catch (IOException e2) {
            Log.i("MessageStoreBackup/lastbackupfiletime", e2);
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:192|(2:194|195)|196|197) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:468|469|470|471|472|(2:585|474)) */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04d5, code lost:
        if (r7 != 0) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0501, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        com.whatsapp.util.Log.e("MessageStoreBackup/integritycheck/error ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x057c, code lost:
        if (r12.A01.size() != 0) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0740, code lost:
        if (r8 != false) goto L_0x0d30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x018a, code lost:
        if (r7.A00().A0C == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0e17, code lost:
        if (java.lang.Boolean.TRUE.equals(r12.A0A) != false) goto L_0x0e19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0eae, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:?, code lost:
        com.whatsapp.util.Log.e("DatabaseHelper/verifyBackup/restoreIndexes - database error.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0ebe, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:?, code lost:
        com.whatsapp.util.Log.e("DatabaseHelper/verifyBackup - unknown error.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0f37, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:?, code lost:
        r11.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0f42, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0f47, code lost:
        if (r40.exists() == false) goto L_0x0f49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0f49, code lost:
        com.whatsapp.util.Log.i("MessageStoreBackup/integritycheck/corrupt-db-was-deleted/restore-from-backup-copy");
        A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0f4f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0f50, code lost:
        X.AnonymousClass1XI.A0N(A0C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0f57, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0225, code lost:
        if (r0 != false) goto L_0x0227;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:190:0x04f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:196:0x0500 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:246:0x061a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:403:0x0c20 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:411:0x0c2a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:445:0x0d12 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:471:0x0dcf */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0670 A[LOOP:5: B:233:0x05bb->B:265:0x0670, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0e71 A[Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }] */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0e74 A[Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0e7f A[Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }] */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0ebe A[ExcHandler: Exception (r1v27 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r32 r34 
      PHI: (r32v4 long) = (r32v0 long), (r32v0 long), (r32v6 long), (r32v7 long), (r32v0 long) binds: [B:462:0x0d47, B:498:0x0e9a, B:502:0x0eb1, B:499:?, B:471:0x0dcf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r34v4 boolean) = (r34v0 boolean), (r34v0 boolean), (r34v6 boolean), (r34v7 boolean), (r34v0 boolean) binds: [B:462:0x0d47, B:498:0x0e9a, B:502:0x0eb1, B:499:?, B:471:0x0dcf] A[DONT_GENERATE, DONT_INLINE], Splitter:B:462:0x0d47] */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0ede  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0f16  */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x0054 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:577:0x0690 A[EDGE_INSN: B:577:0x0690->B:271:0x0690 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0ddb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f2 A[Catch:{ Exception -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f3 A[Catch:{ Exception -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0229 A[Catch:{ Exception -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024b A[Catch:{ Exception -> 0x029a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0252 A[Catch:{ Exception -> 0x029a }, EDGE_INSN: B:564:0x0252->B:90:0x0252 ?: BREAK  
    EDGE_INSN: B:565:0x0252->B:90:0x0252 ?: BREAK  ] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C34121jj A08(X.C41011v3 r54, java.util.List r55, int r56) {
        /*
            r53 = this;
            r52 = r55
            int r0 = r52.size()
            r23 = 2
            int r28 = r0 << 1
            int r46 = r56 / r28
            r0 = 2
            boolean[] r0 = new boolean[r0]
            r27 = r0
            r0 = {1, 0} // fill-array
            r4 = 0
            r17 = 0
            r24 = 0
            r22 = 0
            r21 = 0
            r20 = 0
        L_0x001f:
            java.lang.String r31 = "MessageStoreBackup/restore/"
            r3 = 1
            r2 = r53
            r1 = 2
            r0 = r20
            if (r0 >= r1) goto L_0x0f58
            boolean r19 = r27[r20]
            int r0 = r52.size()
            int r16 = r0 + -1
        L_0x0031:
            if (r16 < 0) goto L_0x0f33
            if (r17 != 0) goto L_0x0f33
            if (r21 != 0) goto L_0x0f33
            int r45 = r16 * r46
            r1 = r16
            r0 = r52
            java.lang.Object r26 = r0.get(r1)
            r0 = r26
            java.io.File r0 = (java.io.File) r0
            r26 = r0
            X.1uy r12 = r2.A07
            boolean r0 = r12.A03(r0)
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "MessageStoreBackup/restore/backup-not-supported"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0054:
            int r16 = r16 + -1
            goto L_0x0031
        L_0x0057:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r31
            r1.append(r0)
            if (r19 == 0) goto L_0x0f2f
            java.lang.String r0 = "repair-enabled"
        L_0x0065:
            r1.append(r0)
            java.lang.String r13 = " "
            r1.append(r13)
            java.lang.String r0 = r26.getAbsolutePath()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1Zf r30 = new X.1Zf
            r0 = r30
            r0.<init>((java.lang.String) r1)
            int r0 = r52.size()
            long r0 = (long) r0
            r50 = r0
            r0 = r16
            long r0 = (long) r0
            r48 = r0
            boolean r0 = r26.exists()
            r18 = 3
            r42 = r54
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "MessageStoreBackup/restore-db-backup-file/does-not-exist "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r26.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure "
        L_0x00b1:
            r1.append(r0)
            java.lang.String r0 = r26.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00c2:
            r30.A01()
            if (r54 == 0) goto L_0x0054
            r8 = 0
            r10 = 1
            r5 = r42
            r7 = 0
            r6 = r45
            r5.A00(r6, r7, r8, r10)
            goto L_0x0054
        L_0x00d4:
            java.lang.String r1 = "MessageStoreBackup/restore/chatdb"
            X.1Zf r29 = new X.1Zf
            r0 = r29
            r0.<init>((java.lang.String) r1)
            java.lang.String r6 = r26.getName()
            java.lang.String r0 = "MessageStoreBackup/restore/copy "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r0 = " size: "
            r5.append(r0)
            long r0 = r26.length()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tx r9 = X.C40721ua.A00(r6)
            X.2G4 r5 = new X.2G4
            r5.<init>()
            if (r9 == 0) goto L_0x0115
            int r0 = r9.version
            long r0 = (long) r0
        L_0x010c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0D = r0
            if (r9 == 0) goto L_0x0253
            goto L_0x0118
        L_0x0115:
            r0 = 0
            goto L_0x010c
        L_0x0118:
            X.12V r11 = r2.A0f     // Catch:{ Exception -> 0x029a }
            X.0sK r10 = r2.A06     // Catch:{ Exception -> 0x029a }
            X.0xG r8 = r2.A0I     // Catch:{ Exception -> 0x029a }
            X.0sd r7 = r2.A08     // Catch:{ Exception -> 0x029a }
            X.12W r6 = r2.A0B     // Catch:{ Exception -> 0x029a }
            X.0u0 r1 = r2.A0e     // Catch:{ Exception -> 0x029a }
            X.12X r0 = r2.A0Y     // Catch:{ Exception -> 0x029a }
            r32 = r10
            r33 = r12
            r34 = r7
            r35 = r6
            r36 = r8
            r37 = r0
            r38 = r1
            r39 = r9
            r40 = r11
            r41 = r26
            X.1uz r7 = X.C40951ux.A01(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x029a }
            r6 = 5
            X.0tz r1 = r2.A0D     // Catch:{ IOException -> 0x01dd }
            X.0tq r0 = r2.A0Q     // Catch:{ IOException -> 0x01dd }
            r0.A04()     // Catch:{ IOException -> 0x01dd }
            java.io.File r0 = r0.A06     // Catch:{ IOException -> 0x01dd }
            r47 = 1
            r41 = r7
            r43 = r1
            r44 = r0
            X.1v4 r8 = r41.A01(r42, r43, r44, r45, r46, r47)     // Catch:{ IOException -> 0x01dd }
            java.lang.String r1 = r8.A01     // Catch:{ IOException -> 0x01dd }
            if (r1 == 0) goto L_0x015d
            java.util.Set r0 = r2.A0j     // Catch:{ IOException -> 0x01dd }
            r0.add(r1)     // Catch:{ IOException -> 0x01dd }
        L_0x015d:
            int r1 = r8.A00     // Catch:{ IOException -> 0x01dd }
            if (r1 != r3) goto L_0x019a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x01db }
            r5.A03 = r0     // Catch:{ IOException -> 0x01db }
            r5.A02 = r0     // Catch:{ IOException -> 0x01db }
            boolean r0 = r7 instanceof X.AnonymousClass2G5     // Catch:{ IOException -> 0x01db }
            if (r0 == 0) goto L_0x0193
            X.2G5 r7 = (X.AnonymousClass2G5) r7     // Catch:{ IOException -> 0x01db }
            X.2G6 r7 = r7.A00     // Catch:{ IOException -> 0x01db }
            if (r7 == 0) goto L_0x018c
            X.2G7 r0 = r7.A00()     // Catch:{ IOException -> 0x01db }
            if (r0 == 0) goto L_0x018c
            X.2G7 r0 = r7.A00()     // Catch:{ IOException -> 0x01db }
            int r0 = r0.A02     // Catch:{ IOException -> 0x01db }
            r6 = 64
            r0 = r0 & 64
            if (r0 != r6) goto L_0x018c
            X.2G7 r0 = r7.A00()     // Catch:{ IOException -> 0x01db }
            boolean r0 = r0.A0C     // Catch:{ IOException -> 0x01db }
            r6 = 1
            if (r0 != 0) goto L_0x018d
        L_0x018c:
            r6 = 0
        L_0x018d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x01db }
            r5.A00 = r0     // Catch:{ IOException -> 0x01db }
        L_0x0193:
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01db }
            goto L_0x02a8
        L_0x019a:
            r7 = 2
            if (r1 != r7) goto L_0x01aa
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x01db }
            r5.A03 = r0     // Catch:{ IOException -> 0x01db }
            r5.A02 = r0     // Catch:{ IOException -> 0x01db }
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01db }
            goto L_0x02a9
        L_0x01aa:
            r7 = 4
            if (r1 != r7) goto L_0x01bc
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x01db }
            r5.A03 = r0     // Catch:{ IOException -> 0x01db }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x01db }
            r5.A02 = r0     // Catch:{ IOException -> 0x01db }
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/failed_jid_mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01db }
            goto L_0x02a9
        L_0x01bc:
            if (r1 != r6) goto L_0x01c4
            java.lang.String r0 = "Backup prefix is null"
            r5.A0I = r0     // Catch:{ IOException -> 0x01db }
            goto L_0x0298
        L_0x01c4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01db }
            r6.<init>()     // Catch:{ IOException -> 0x01db }
            java.lang.String r0 = "Unexpected integrity check result "
            r6.append(r0)     // Catch:{ IOException -> 0x01db }
            r6.append(r1)     // Catch:{ IOException -> 0x01db }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x01db }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01db }
            r0.<init>(r6)     // Catch:{ IOException -> 0x01db }
            throw r0     // Catch:{ IOException -> 0x01db }
        L_0x01db:
            r7 = move-exception
            goto L_0x01df
        L_0x01dd:
            r7 = move-exception
            r1 = 3
        L_0x01df:
            java.lang.String r0 = r7.getMessage()     // Catch:{ Exception -> 0x029a }
            if (r0 == 0) goto L_0x01f3
            java.lang.String r6 = r7.getMessage()     // Catch:{ Exception -> 0x029a }
            java.lang.String r0 = "unknown format"
            boolean r0 = r6.contains(r0)     // Catch:{ Exception -> 0x029a }
            if (r0 == 0) goto L_0x01f3
            goto L_0x0227
        L_0x01f3:
            java.lang.Throwable r0 = r7.getCause()     // Catch:{ Exception -> 0x029a }
            if (r0 == 0) goto L_0x0202
            java.lang.Throwable r0 = r7.getCause()     // Catch:{ Exception -> 0x029a }
            boolean r0 = r0 instanceof java.util.zip.DataFormatException     // Catch:{ Exception -> 0x029a }
            if (r0 == 0) goto L_0x0202
            goto L_0x0227
        L_0x0202:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x029a }
            r0 = 19
            if (r6 < r0) goto L_0x0215
            java.lang.Throwable r0 = r7.getCause()     // Catch:{ Exception -> 0x029a }
            if (r0 == 0) goto L_0x0239
            java.lang.Throwable r0 = r7.getCause()     // Catch:{ Exception -> 0x029a }
            boolean r0 = r0 instanceof javax.crypto.AEADBadTagException     // Catch:{ Exception -> 0x029a }
            goto L_0x0225
        L_0x0215:
            java.lang.String r0 = r7.getMessage()     // Catch:{ Exception -> 0x029a }
            if (r0 == 0) goto L_0x0239
            java.lang.String r6 = r7.getMessage()     // Catch:{ Exception -> 0x029a }
            java.lang.String r0 = "mac check in GCM failed"
            boolean r0 = r6.contains(r0)     // Catch:{ Exception -> 0x029a }
        L_0x0225:
            if (r0 == 0) goto L_0x0239
        L_0x0227:
            if (r1 != r3) goto L_0x0239
            java.lang.String r0 = "MessageStoreBackup/restore/error/decrypting-failure"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ Exception -> 0x029a }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x029a }
            r5.A02 = r0     // Catch:{ Exception -> 0x029a }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x029a }
            r5.A0I = r0     // Catch:{ Exception -> 0x029a }
            goto L_0x0298
        L_0x0239:
            java.lang.String r0 = r7.getMessage()     // Catch:{ Exception -> 0x029a }
            if (r0 == 0) goto L_0x0252
            java.lang.String r1 = r7.getMessage()     // Catch:{ Exception -> 0x029a }
            java.lang.String r0 = "ENOSPC"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x029a }
            if (r0 == 0) goto L_0x0252
            java.lang.String r0 = "MessageStoreBackup/restore/error/no-space-left"
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ Exception -> 0x029a }
            r7 = 5
            goto L_0x02a9
        L_0x0252:
            throw r7     // Catch:{ Exception -> 0x029a }
        L_0x0253:
            X.0tx r39 = X.C16960tx.A08     // Catch:{ Exception -> 0x029a }
            X.12V r10 = r2.A0f     // Catch:{ Exception -> 0x029a }
            X.0sK r9 = r2.A06     // Catch:{ Exception -> 0x029a }
            X.0xG r8 = r2.A0I     // Catch:{ Exception -> 0x029a }
            X.0sd r7 = r2.A08     // Catch:{ Exception -> 0x029a }
            X.12W r6 = r2.A0B     // Catch:{ Exception -> 0x029a }
            X.0u0 r1 = r2.A0e     // Catch:{ Exception -> 0x029a }
            X.12X r0 = r2.A0Y     // Catch:{ Exception -> 0x029a }
            r32 = r9
            r33 = r12
            r34 = r7
            r35 = r6
            r36 = r8
            r37 = r0
            r38 = r1
            r40 = r10
            r41 = r26
            X.1uz r41 = X.C40951ux.A01(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x029a }
            X.0tz r1 = r2.A0D     // Catch:{ 03R | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0292 }
            X.0tq r0 = r2.A0Q     // Catch:{ 03R | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0292 }
            r0.A04()     // Catch:{ 03R | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0292 }
            java.io.File r0 = r0.A06     // Catch:{ 03R | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0292 }
            r47 = 0
            r43 = r1
            r44 = r0
            X.1v4 r0 = r41.A01(r42, r43, r44, r45, r46, r47)     // Catch:{ 03R | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0292 }
            int r0 = r0.A00     // Catch:{ 03R | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0292 }
            r7 = 1
            if (r0 != r3) goto L_0x0298
            goto L_0x02a9
        L_0x0292:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restore/plaintext error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x029a }
        L_0x0298:
            r7 = 3
            goto L_0x02a9
        L_0x029a:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restore/error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = r1.toString()
            r5.A0I = r0
            r7 = 3
            goto L_0x02a9
        L_0x02a8:
            r7 = 1
        L_0x02a9:
            r25 = 1
            if (r7 != r3) goto L_0x02dc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r5.A01 = r0
            X.0tq r0 = r2.A0Q
            r41 = r0
            r41.A04()
            java.io.File r0 = r0.A06
            r40 = r0
            boolean r0 = r40.exists()
            if (r0 != 0) goto L_0x03be
            java.lang.String r0 = "MessageStoreBackup/restore/check-restored-db/missing-file "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r41.A04()
            r0 = r40
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x02da:
            r7 = r18
        L_0x02dc:
            java.lang.String r1 = "MessageStoreBackup/restore/result/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r7 == r3) goto L_0x02f1
            r25 = 0
        L_0x02f1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r25)
            r5.A04 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r50)
            r5.A0H = r0
            r1 = 1
            if (r7 == r3) goto L_0x030a
            r1 = 2
            if (r7 == r1) goto L_0x030a
            r1 = 3
            if (r7 == r1) goto L_0x030a
            r1 = 4
            if (r7 == r1) goto L_0x030a
            r1 = 5
        L_0x030a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A0B = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r48)
            r5.A0C = r0
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0A = r0
            X.0rz r1 = r2.A0G
            r0 = 512(0x200, float:7.175E-43)
            r1.A0e(r0)
            long r8 = r29.A01()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r5.A0F = r0
            java.lang.String r0 = "MessageStoreBackup/restore/log-chat-db-restore-event overall-result: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Boolean r0 = r5.A04
            r1.append(r0)
            java.lang.String r0 = " database-backup-version: "
            r1.append(r0)
            java.lang.Long r0 = r5.A0D
            r1.append(r0)
            java.lang.String r0 = " file-integrity-check: "
            r1.append(r0)
            java.lang.Boolean r0 = r5.A03
            r1.append(r0)
            java.lang.String r0 = " jid-correct: "
            r1.append(r0)
            java.lang.Boolean r0 = r5.A02
            r1.append(r0)
            java.lang.String r0 = " database-repair-enabled: "
            r1.append(r0)
            java.lang.Boolean r0 = r5.A01
            r1.append(r0)
            java.lang.String r0 = " sqlite-integrity-check: "
            r1.append(r0)
            java.lang.Boolean r0 = r5.A06
            r1.append(r0)
            java.lang.String r0 = " has-only-index-errors: "
            r1.append(r0)
            java.lang.Boolean r0 = r5.A08
            r1.append(r0)
            java.lang.String r0 = " dump-and-restore-result: "
            r1.append(r0)
            java.lang.Boolean r0 = r5.A07
            r1.append(r0)
            java.lang.String r0 = " dump-and-restore-recovery-percentage: "
            r1.append(r0)
            java.lang.Long r0 = r5.A0E
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t9 r0 = r2.A0X
            r0.A06(r5)
            if (r7 == r3) goto L_0x0f16
            r0 = 2
            if (r7 == r0) goto L_0x0f0b
            r0 = 3
            if (r7 == r0) goto L_0x00aa
            r0 = 4
            if (r7 == r0) goto L_0x0f00
            java.lang.String r1 = "MessageStoreBackup/restore/failure/out-of-space "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r1 = r26.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r21 = 1
            goto L_0x00c2
        L_0x03be:
            r41.A04()
            java.lang.String r15 = "MessageStoreBackup/integritycheck/corrupt-db-was-deleted/restore-from-backup-copy"
            X.2G8 r12 = new X.2G8
            r12.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A02 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A01 = r0
            java.lang.String r0 = "index (\\w+)$"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r0)
            r10 = 0
            java.lang.String r7 = r40.getAbsolutePath()     // Catch:{ Exception -> 0x0501 }
            r6 = 536870928(0x20000010, float:1.0842042E-19)
            X.2G9 r1 = new X.2G9     // Catch:{ Exception -> 0x0501 }
            r0 = r40
            r1.<init>(r0)     // Catch:{ Exception -> 0x0501 }
            android.database.sqlite.SQLiteDatabase r9 = android.database.sqlite.SQLiteDatabase.openDatabase(r7, r10, r6, r1)     // Catch:{ Exception -> 0x0501 }
            java.lang.String r0 = "PRAGMA integrity_check"
            android.database.Cursor r8 = r9.rawQuery(r0, r10)     // Catch:{ all -> 0x04fa }
            if (r8 == 0) goto L_0x04ea
            r7 = 0
        L_0x03f8:
            boolean r0 = r8.moveToNext()     // Catch:{ Exception -> 0x04e0 }
            if (r0 == 0) goto L_0x045c
            int r7 = r7 + 1
            java.lang.String r6 = r8.getString(r4)     // Catch:{ Exception -> 0x04e0 }
            r14 = 1
            if (r7 != r3) goto L_0x0410
            java.lang.String r0 = "ok"
            boolean r0 = r0.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x04e0 }
            if (r0 == 0) goto L_0x0410
            goto L_0x0458
        L_0x0410:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e0 }
            r1.<init>()     // Catch:{ Exception -> 0x04e0 }
            java.lang.String r0 = "MessageStoreBackup/integritycheck/c "
            r1.append(r0)     // Catch:{ Exception -> 0x04e0 }
            r1.append(r7)     // Catch:{ Exception -> 0x04e0 }
            r1.append(r13)     // Catch:{ Exception -> 0x04e0 }
            r1.append(r6)     // Catch:{ Exception -> 0x04e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x04e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x04e0 }
            java.util.regex.Matcher r0 = r11.matcher(r6)     // Catch:{ Exception -> 0x04e0 }
            boolean r1 = r0.find()     // Catch:{ Exception -> 0x04e0 }
            if (r1 == 0) goto L_0x0452
            java.lang.String r6 = r0.group(r3)     // Catch:{ Exception -> 0x04e0 }
            java.util.HashMap r0 = r12.A02     // Catch:{ Exception -> 0x04e0 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x04e0 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x04e0 }
            java.util.HashMap r1 = r12.A02     // Catch:{ Exception -> 0x04e0 }
            if (r0 == 0) goto L_0x044a
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x04e0 }
            int r14 = r0 + 1
        L_0x044a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x04e0 }
            r1.put(r6, r0)     // Catch:{ Exception -> 0x04e0 }
            goto L_0x03f8
        L_0x0452:
            java.util.ArrayList r0 = r12.A01     // Catch:{ Exception -> 0x04e0 }
            r0.add(r6)     // Catch:{ Exception -> 0x04e0 }
            goto L_0x03f8
        L_0x0458:
            r8.close()     // Catch:{ all -> 0x04fa }
            goto L_0x04c3
        L_0x045c:
            r12.A00 = r7     // Catch:{ Exception -> 0x04e0 }
            r8.close()     // Catch:{ all -> 0x04fa }
            java.util.HashMap r0 = r12.A02     // Catch:{ all -> 0x04fa }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x04fa }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x04fa }
        L_0x046b:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x04fa }
            if (r0 == 0) goto L_0x049c
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x04fa }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x04fa }
            java.util.HashMap r0 = r12.A02     // Catch:{ all -> 0x04fa }
            java.lang.Object r6 = r0.get(r7)     // Catch:{ all -> 0x04fa }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x04fa }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fa }
            r1.<init>()     // Catch:{ all -> 0x04fa }
            java.lang.String r0 = "MessageStoreBackup/integritycheck/error-details/index/"
            r1.append(r0)     // Catch:{ all -> 0x04fa }
            r1.append(r7)     // Catch:{ all -> 0x04fa }
            java.lang.String r0 = " cnt="
            r1.append(r0)     // Catch:{ all -> 0x04fa }
            r1.append(r6)     // Catch:{ all -> 0x04fa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04fa }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04fa }
            goto L_0x046b
        L_0x049c:
            java.util.ArrayList r0 = r12.A01     // Catch:{ all -> 0x04fa }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x04fa }
        L_0x04a2:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x04fa }
            if (r0 == 0) goto L_0x04c3
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x04fa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x04fa }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fa }
            r1.<init>()     // Catch:{ all -> 0x04fa }
            java.lang.String r0 = "MessageStoreBackup/integritycheck/error-details/other/"
            r1.append(r0)     // Catch:{ all -> 0x04fa }
            r1.append(r6)     // Catch:{ all -> 0x04fa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04fa }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04fa }
            goto L_0x04a2
        L_0x04c3:
            r9.close()     // Catch:{ Exception -> 0x0501 }
            boolean r0 = r40.exists()
            if (r0 != 0) goto L_0x04d8
            com.whatsapp.util.Log.i((java.lang.String) r15)
            r2.A0H()
        L_0x04d2:
            int r7 = r12.A00
            r0 = 1
            if (r7 == 0) goto L_0x0516
            goto L_0x0515
        L_0x04d8:
            java.io.File r0 = r2.A0C()
            X.AnonymousClass1XI.A0N(r0)
            goto L_0x04d2
        L_0x04e0:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/integritycheck/c/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04f3 }
            r8.close()     // Catch:{ all -> 0x04fa }
            goto L_0x04ef
        L_0x04ea:
            java.lang.String r0 = "MessageStoreBackup/integritycheck/query-failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04f3 }
        L_0x04ef:
            r9.close()     // Catch:{ Exception -> 0x0501 }
            goto L_0x0507
        L_0x04f3:
            r0 = move-exception
            if (r8 == 0) goto L_0x04f9
            r8.close()     // Catch:{ all -> 0x04f9 }
        L_0x04f9:
            throw r0     // Catch:{ all -> 0x04fa }
        L_0x04fa:
            r0 = move-exception
            if (r9 == 0) goto L_0x0500
            r9.close()     // Catch:{ all -> 0x0500 }
        L_0x0500:
            throw r0     // Catch:{ Exception -> 0x0501 }
        L_0x0501:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/integritycheck/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0f42 }
        L_0x0507:
            boolean r0 = r40.exists()
            if (r0 != 0) goto L_0x0563
            com.whatsapp.util.Log.i((java.lang.String) r15)
            r2.A0H()
        L_0x0513:
            r12 = r10
            r7 = -1
        L_0x0515:
            r0 = 0
        L_0x0516:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A06 = r0
            java.lang.String r0 = "MessageStoreBackup/restore/errors/count "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r7)
            if (r12 == 0) goto L_0x0560
            java.lang.String r0 = " index="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.HashMap r0 = r12.A02
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " other="
            r1.append(r0)
            java.util.ArrayList r0 = r12.A01
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x054a:
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r7 == 0) goto L_0x0d30
            if (r19 != 0) goto L_0x056b
            r41.A04()
            X.AnonymousClass1XI.A0N(r40)
            goto L_0x02da
        L_0x0560:
            java.lang.String r0 = ""
            goto L_0x054a
        L_0x0563:
            java.io.File r0 = r2.A0C()
            X.AnonymousClass1XI.A0N(r0)
            goto L_0x0513
        L_0x056b:
            if (r12 == 0) goto L_0x057e
            java.util.HashMap r0 = r12.A02
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x057e
            java.util.ArrayList r0 = r12.A01
            int r0 = r0.size()
            r1 = 1
            if (r0 == 0) goto L_0x057f
        L_0x057e:
            r1 = 0
        L_0x057f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.A08 = r0
            if (r1 == 0) goto L_0x06d0
            java.io.File r6 = r2.A0C()
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x059c
            boolean r0 = r6.delete()
            if (r0 != 0) goto L_0x059c
            java.lang.String r0 = "MessageStoreBackup/copydbtobackup/failed to delete backup file before copying from db."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x059c:
            r41.A04()
            boolean r0 = r40.exists()
            if (r0 == 0) goto L_0x0689
            X.12X r1 = r2.A0Y
            r41.A04()
            r0 = r40
            X.AnonymousClass1XI.A0M(r1, r0, r6)
        L_0x05af:
            java.util.HashMap r0 = r12.A02
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r12 = r0.iterator()
            r10 = 0
            r9 = 0
        L_0x05bb:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0690
            java.lang.Object r8 = r12.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r6 = r8.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "MessageStoreBackup/reindex"
            X.1Zf r11 = new X.1Zf
            r11.<init>((java.lang.String) r0)
            r41.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0628, SQLiteConstraintException -> 0x0621, SQLiteFullException -> 0x061b, SQLiteException -> 0x062f }
            java.lang.String r7 = r40.getAbsolutePath()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0628, SQLiteConstraintException -> 0x0621, SQLiteFullException -> 0x061b, SQLiteException -> 0x062f }
            r1 = 0
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r7 = android.database.sqlite.SQLiteDatabase.openDatabase(r7, r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0628, SQLiteConstraintException -> 0x0621, SQLiteFullException -> 0x061b, SQLiteException -> 0x062f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0614 }
            r1.<init>()     // Catch:{ all -> 0x0614 }
            java.lang.String r0 = "REINDEX "
            r1.append(r0)     // Catch:{ all -> 0x0614 }
            r1.append(r6)     // Catch:{ all -> 0x0614 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0614 }
            r7.execSQL(r0)     // Catch:{ all -> 0x0614 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0614 }
            r6.<init>()     // Catch:{ all -> 0x0614 }
            java.lang.String r0 = "MessageStoreBackup/reindex | time spent:"
            r6.append(r0)     // Catch:{ all -> 0x0614 }
            long r0 = r11.A01()     // Catch:{ all -> 0x0614 }
            r6.append(r0)     // Catch:{ all -> 0x0614 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0614 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0614 }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0628, SQLiteConstraintException -> 0x0621, SQLiteFullException -> 0x061b, SQLiteException -> 0x062f }
            r6 = 1
            goto L_0x064e
        L_0x0614:
            r0 = move-exception
            if (r7 == 0) goto L_0x061a
            r7.close()     // Catch:{ all -> 0x061a }
        L_0x061a:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0628, SQLiteConstraintException -> 0x0621, SQLiteFullException -> 0x061b, SQLiteException -> 0x062f }
        L_0x061b:
            X.0y0 r0 = r2.A0O
            r0.A00(r4)
            goto L_0x064d
        L_0x0621:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/reindex/constraintexception "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x064d
        L_0x0628:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/reindex/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x064d
        L_0x062f:
            r7 = move-exception
            X.0tz r0 = r2.A0D
            android.content.Context r6 = r0.A00
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "unable to open"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0677
            X.0yL r1 = r2.A0E
            r0 = 2131888227(0x7f120863, float:1.9411083E38)
        L_0x0646:
            java.lang.String r0 = r6.getString(r0)
            X.C33881jL.A00(r6, r1, r0)
        L_0x064d:
            r6 = 0
        L_0x064e:
            java.lang.String r1 = "MessageStoreBackup/restore/reindex/key: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.Object r1 = r8.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            if (r6 == 0) goto L_0x0674
            java.lang.String r1 = " ok"
        L_0x0662:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r10 = r10 + 1
            if (r6 == 0) goto L_0x0690
            int r9 = r9 + 1
            goto L_0x05bb
        L_0x0674:
            java.lang.String r1 = " failed"
            goto L_0x0662
        L_0x0677:
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "attempt to write a readonly database"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x064d
            X.0yL r1 = r2.A0E
            r0 = 2131888228(0x7f120864, float:1.9411085E38)
            goto L_0x0646
        L_0x0689:
            java.lang.String r0 = "MessageStoreBackup/copydbtobackup/no db to backup."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x05af
        L_0x0690:
            r41.A04()
            boolean r6 = A02(r40)
            java.lang.String r0 = "MessageStoreBackup/restore/reindexresult/dbintegrity "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r6 == 0) goto L_0x06e5
            java.lang.String r0 = "ok"
        L_0x06a2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "MessageStoreBackup/restore/reindexresult/reindexed "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.A05 = r0
            if (r6 != 0) goto L_0x0d30
            r2.A0H()
        L_0x06d0:
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.util.concurrent.atomic.AtomicReference r14 = new java.util.concurrent.atomic.AtomicReference
            r14.<init>(r0)
            X.0tz r0 = r2.A0D
            android.content.Context r0 = r0.A00
            r39 = r0
            r41.A04()
            goto L_0x06e8
        L_0x06e5:
            java.lang.String r0 = "failed"
            goto L_0x06a2
        L_0x06e8:
            java.lang.String r0 = "sqlite"
            java.lang.System.loadLibrary(r0)     // Catch:{ UnsatisfiedLinkError -> 0x06ef }
            goto L_0x06f6
        L_0x06ef:
            r1 = move-exception
            java.lang.String r0 = "libsqlite is not present on device, cannot perform dump and restore."
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0710
        L_0x06f6:
            boolean r0 = r40.exists()
            if (r0 != 0) goto L_0x0744
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r40.getAbsolutePath()
            r1[r4] = r0
            java.lang.String r0 = "sqlite-repair/recover-database original database (%s) does not exist."
            java.lang.String r0 = java.lang.String.format(r6, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0710:
            r8 = 0
        L_0x0711:
            java.lang.String r0 = "MessageStoreBackup/restore/dumpAndRestoreResult/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = " recovery %age: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r5.A07 = r0
            java.lang.Object r0 = r14.get()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0E = r0
            if (r8 != 0) goto L_0x0d30
            goto L_0x02da
        L_0x0744:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r40.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = "_new"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.File r36 = new java.io.File
            r0 = r36
            r0.<init>(r1)
            X.AnonymousClass1XI.A0N(r36)
            r6 = 2
            long r0 = r40.length()
            long r0 = r0 * r6
            X.0pf r8 = r2.A0H
            long r9 = r8.A02()
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0785
            r6 = r39
            android.content.Intent r7 = X.C14750ph.A0C(r6, r0)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r7 = r7.setFlags(r6)
            r6 = r39
            r6.startActivity(r7)
        L_0x0785:
            long r9 = r8.A02()
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x079c
            r8.A02()
            r41.A04()
            r40.getAbsolutePath()
            r6 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r6)
            goto L_0x0785
        L_0x079c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r6.<init>()     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = "sqlite-repair/recover-database dbFile is "
            r6.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r40.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            r6.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = " (Size: "
            r6.append(r0)     // Catch:{ Exception -> 0x0d18 }
            long r0 = r40.length()     // Catch:{ Exception -> 0x0d18 }
            r6.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
            java.io.File r1 = r39.getFilesDir()     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = "tmp_db_dump_schema"
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0d18 }
            r9.<init>(r1, r0)     // Catch:{ Exception -> 0x0d18 }
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0d18 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            r1[r4] = r0     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r38 = ".read %s"
            r0 = r38
            java.lang.String r12 = java.lang.String.format(r6, r0, r1)     // Catch:{ Exception -> 0x0d18 }
            X.AnonymousClass1XI.A0N(r9)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r6 = r40.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            java.lang.String r1 = r9.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = ".schema"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r6, r1, r0)     // Catch:{ all -> 0x0d13 }
            r32 = 0
            if (r0 == 0) goto L_0x0824
            java.lang.String r0 = "sqlite-repair/copy-schema/failed \".schema\""
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d13 }
            r1.<init>()     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "sqlite-repair/copy-schema/result of command \".schema\" is \""
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0d13 }
            r0.<init>(r9)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = X.C30311c8.A00(r0)     // Catch:{ all -> 0x0d13 }
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d13 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
            goto L_0x0923
        L_0x0824:
            java.lang.String r0 = "sqlite-repair/copy-schema/success \".schema\""
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r10 = "ROLLBACK;"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d13 }
            r1.<init>()     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = ".tmp"
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d13 }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0d13 }
            r8.<init>(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
            boolean r0 = X.AnonymousClass1XI.A0N(r8)     // Catch:{ all -> 0x0d13 }
            if (r0 == 0) goto L_0x0915
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0d13 }
            r1.<init>(r9)     // Catch:{ all -> 0x0d13 }
            java.lang.String r6 = "ISO-8859-1"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0d13 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0d13 }
            java.io.BufferedReader r15 = new java.io.BufferedReader     // Catch:{ all -> 0x0d13 }
            r15.<init>(r0)     // Catch:{ all -> 0x0d13 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0c26 }
            r0.<init>(r8)     // Catch:{ all -> 0x0c26 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ UnsupportedEncodingException -> 0x0c21 }
            r1.<init>(r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x0c21 }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ UnsupportedEncodingException -> 0x0c21 }
            r11.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x0c21 }
            java.lang.String r7 = r15.readLine()     // Catch:{ all -> 0x0c1c }
        L_0x0876:
            if (r7 == 0) goto L_0x08d8
            java.lang.String r13 = r15.readLine()     // Catch:{ all -> 0x0c1c }
            if (r13 != 0) goto L_0x08a9
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = r7.toUpperCase(r6)     // Catch:{ all -> 0x0c1c }
            boolean r0 = r0.contains(r10)     // Catch:{ all -> 0x0c1c }
            if (r0 == 0) goto L_0x08a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1c }
            r1.<init>()     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump replacing following statement with 'commit transaction': "
            r1.append(r0)     // Catch:{ all -> 0x0c1c }
            r1.append(r7)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c1c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c1c }
            java.lang.String r1 = r7.toUpperCase(r6)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "COMMIT TRANSACTION;"
            java.lang.String r7 = r1.replace(r10, r0)     // Catch:{ all -> 0x0c1c }
        L_0x08a9:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0c1c }
            java.lang.String r1 = r7.toUpperCase(r0)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "CREATE TABLE 'MESSAGES_FTS_"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0c1c }
            if (r0 == 0) goto L_0x08ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1c }
            r1.<init>()     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump creation of virtual table messages_fts will take care of this, ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x0c1c }
            r1.append(r7)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c1c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c1c }
            java.lang.String r7 = ""
        L_0x08ce:
            r11.write(r7)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "\n"
            r11.write(r0)     // Catch:{ all -> 0x0c1c }
            r7 = r13
            goto L_0x0876
        L_0x08d8:
            r11.close()     // Catch:{ all -> 0x0c26 }
            r15.close()     // Catch:{ all -> 0x0d13 }
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0d13 }
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            r1[r4] = r0     // Catch:{ all -> 0x0d13 }
            long r10 = r9.length()     // Catch:{ all -> 0x0d13 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d13 }
            r1[r3] = r0     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            r1[r23] = r0     // Catch:{ all -> 0x0d13 }
            long r10 = r8.length()     // Catch:{ all -> 0x0d13 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d13 }
            r1[r18] = r0     // Catch:{ all -> 0x0d13 }
            r0 = 4
            r1[r0] = r9     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump deleting %s (size %d), renaming %s (size:%d) -> %s"
            java.lang.String.format(r6, r0, r1)     // Catch:{ all -> 0x0d13 }
            boolean r0 = r9.delete()     // Catch:{ all -> 0x0d13 }
            if (r0 == 0) goto L_0x0915
            r8.renameTo(r9)     // Catch:{ all -> 0x0d13 }
        L_0x0915:
            java.lang.String r1 = r36.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "/dev/null"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r1, r0, r12)     // Catch:{ all -> 0x0d13 }
            if (r0 != 0) goto L_0x0923
            r32 = 1
        L_0x0923:
            X.AnonymousClass1XI.A0N(r9)     // Catch:{ Exception -> 0x0d18 }
            if (r32 == 0) goto L_0x0710
            java.io.File r1 = r39.getFilesDir()     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r37 = "tmp_db_dump_table"
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0d18 }
            r0 = r37
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r7 = r40.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r1 = ".tables"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r7, r0, r1)     // Catch:{ Exception -> 0x0d18 }
            if (r0 == 0) goto L_0x0976
            java.lang.String r6 = "sqlite-repair/get-tables/failed \""
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0d18 }
            r0.append(r1)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r1 = "\""
            r0.append(r1)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
        L_0x095d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r1.<init>()     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = "sqlite-repair/recover-database/failed-to-get-tables "
            r1.append(r0)     // Catch:{ Exception -> 0x0d18 }
            r0 = r40
            r1.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
            goto L_0x0710
        L_0x0976:
            java.lang.String r0 = "sqlite-repair/get-tables/success \""
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0d18 }
            r7.append(r1)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r35 = "\" dump size:"
            r0 = r35
            r7.append(r0)     // Catch:{ Exception -> 0x0d18 }
            long r0 = r6.length()     // Catch:{ Exception -> 0x0d18 }
            r7.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x0d18 }
            r8.<init>()     // Catch:{ Exception -> 0x0d18 }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0d18 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r1 = X.C30311c8.A00(r9)     // Catch:{ all -> 0x0d0e }
            java.lang.String r0 = "[\\t\\n\\r, ]"
            java.lang.String[] r7 = android.text.TextUtils.split(r1, r0)     // Catch:{ all -> 0x0d0e }
            int r6 = r7.length     // Catch:{ all -> 0x0d0e }
            r1 = 0
        L_0x09ac:
            if (r1 >= r6) goto L_0x09c0
            r0 = r7[r1]     // Catch:{ all -> 0x0d0e }
            java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x0d0e }
            int r10 = r0.length()     // Catch:{ all -> 0x0d0e }
            if (r10 <= 0) goto L_0x09bd
            r8.add(r0)     // Catch:{ all -> 0x0d0e }
        L_0x09bd:
            int r1 = r1 + 1
            goto L_0x09ac
        L_0x09c0:
            r9.close()     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = "sqlite-repair/get-tables/ "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r8)     // Catch:{ Exception -> 0x0d18 }
            r1.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
            int r0 = r8.size()     // Catch:{ Exception -> 0x0d18 }
            if (r0 == 0) goto L_0x095d
            r6 = 0
        L_0x09e2:
            int r0 = r8.size()     // Catch:{ Exception -> 0x0d18 }
            if (r6 >= r0) goto L_0x0c2b
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r1 = "sqlite-repair/recover-database/reading-table %d/%d: %s"
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0d18 }
            int r34 = r6 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r34)     // Catch:{ Exception -> 0x0d18 }
            r0[r4] = r9     // Catch:{ Exception -> 0x0d18 }
            int r9 = r8.size()     // Catch:{ Exception -> 0x0d18 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0d18 }
            r0[r3] = r9     // Catch:{ Exception -> 0x0d18 }
            int r9 = r8.size()     // Catch:{ Exception -> 0x0d18 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0d18 }
            r0[r23] = r9     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = java.lang.String.format(r7, r1, r0)     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.Object r6 = r8.get(r6)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0d18 }
            java.io.File r1 = r39.getFilesDir()     // Catch:{ Exception -> 0x0d18 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0d18 }
            r0 = r37
            r9.<init>(r1, r0)     // Catch:{ Exception -> 0x0d18 }
            X.AnonymousClass1XI.A0N(r9)     // Catch:{ Exception -> 0x0d18 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0d13 }
            r1[r4] = r6     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = ".dump %s"
            java.lang.String r7 = java.lang.String.format(r7, r0, r1)     // Catch:{ all -> 0x0d13 }
            java.lang.String r1 = r40.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r1, r0, r7)     // Catch:{ all -> 0x0d13 }
            if (r0 == 0) goto L_0x0bf2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d13 }
            r1.<init>()     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "sqlite-repair/recover-database-table/failed \""
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            r1.append(r7)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d13 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
        L_0x0a59:
            java.lang.String r13 = "ROLLBACK;"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d13 }
            r1.<init>()     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = ".tmp"
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d13 }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0d13 }
            r10.<init>(r0)     // Catch:{ all -> 0x0d13 }
            boolean r0 = r10.exists()     // Catch:{ all -> 0x0d13 }
            if (r0 == 0) goto L_0x0ac0
            java.lang.String r1 = "sqlite-repair/cleanup-per-table-dump-file deleting "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d13 }
            r0.<init>(r1)     // Catch:{ all -> 0x0d13 }
            r0.append(r10)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0d13 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
            boolean r0 = r10.delete()     // Catch:{ all -> 0x0d13 }
            if (r0 != 0) goto L_0x0ac0
            java.lang.String r1 = "sqlite-repair/cleanup-per-table-dump-file failed to delete "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d13 }
            r0.<init>(r1)     // Catch:{ all -> 0x0d13 }
            r0.append(r10)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0d13 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
        L_0x0aa5:
            java.lang.String r10 = r36.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            java.lang.String r7 = "/dev/null"
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0d13 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            r1[r4] = r0     // Catch:{ all -> 0x0d13 }
            r0 = r38
            java.lang.String r0 = java.lang.String.format(r6, r0, r1)     // Catch:{ all -> 0x0d13 }
            com.whatsapp.SqliteShell.executeMetaCommand(r10, r7, r0)     // Catch:{ all -> 0x0d13 }
            goto L_0x0c15
        L_0x0ac0:
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d13 }
            r1.<init>(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            r1.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0d13 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0d13 }
            r1.<init>(r9)     // Catch:{ all -> 0x0d13 }
            java.lang.String r6 = "ISO-8859-1"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0d13 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0d13 }
            java.io.BufferedReader r15 = new java.io.BufferedReader     // Catch:{ all -> 0x0d13 }
            r15.<init>(r0)     // Catch:{ all -> 0x0d13 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0c26 }
            r0.<init>(r10)     // Catch:{ all -> 0x0c26 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ UnsupportedEncodingException -> 0x0c21 }
            r1.<init>(r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x0c21 }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ UnsupportedEncodingException -> 0x0c21 }
            r11.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x0c21 }
            java.lang.String r7 = r15.readLine()     // Catch:{ all -> 0x0c1c }
            r33 = 1
        L_0x0afc:
            if (r7 == 0) goto L_0x0bb3
            java.lang.String r32 = r15.readLine()     // Catch:{ all -> 0x0c1c }
            if (r32 != 0) goto L_0x0b2f
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = r7.toUpperCase(r6)     // Catch:{ all -> 0x0c1c }
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x0c1c }
            if (r0 == 0) goto L_0x0b2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1c }
            r1.<init>()     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file replacing following statement with 'commit transaction': "
            r1.append(r0)     // Catch:{ all -> 0x0c1c }
            r1.append(r7)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c1c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c1c }
            java.lang.String r1 = r7.toUpperCase(r6)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "COMMIT TRANSACTION;"
            java.lang.String r7 = r1.replace(r13, r0)     // Catch:{ all -> 0x0c1c }
        L_0x0b2f:
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ all -> 0x0c1c }
            java.lang.String r12 = r7.toUpperCase(r6)     // Catch:{ all -> 0x0c1c }
            java.lang.String r1 = "\""
            java.lang.String r0 = "'"
            java.lang.String r1 = r12.replace(r1, r0)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "CREATE TABLE 'MESSAGES_FTS_"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0c1c }
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0b5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1c }
            r1.<init>()     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file creation of virtual table messages_fts will take care of this, ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x0c1c }
            r1.append(r7)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c1c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c1c }
            r7 = r12
        L_0x0b5d:
            if (r33 == 0) goto L_0x0b83
            java.lang.String r1 = r7.toUpperCase(r6)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "CREATE TABLE "
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0c1c }
            if (r0 == 0) goto L_0x0b81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1c }
            r1.<init>()     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file transaction started, ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x0c1c }
            r1.append(r7)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c1c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c1c }
            r7 = r12
        L_0x0b81:
            r33 = 0
        L_0x0b83:
            java.lang.String r1 = r7.toUpperCase(r6)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "INSERT INTO SQLITE_MASTER"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0c1c }
            if (r0 == 0) goto L_0x0bad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c1c }
            r1.<init>()     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x0c1c }
            r1.append(r7)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c1c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c1c }
        L_0x0ba4:
            r11.write(r12)     // Catch:{ all -> 0x0c1c }
            java.lang.String r0 = "\n"
            r11.write(r0)     // Catch:{ all -> 0x0c1c }
            goto L_0x0baf
        L_0x0bad:
            r12 = r7
            goto L_0x0ba4
        L_0x0baf:
            r7 = r32
            goto L_0x0afc
        L_0x0bb3:
            r11.close()     // Catch:{ all -> 0x0c26 }
            r15.close()     // Catch:{ all -> 0x0d13 }
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0d13 }
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            r1[r4] = r0     // Catch:{ all -> 0x0d13 }
            long r11 = r9.length()     // Catch:{ all -> 0x0d13 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d13 }
            r1[r3] = r0     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ all -> 0x0d13 }
            r1[r23] = r0     // Catch:{ all -> 0x0d13 }
            long r11 = r10.length()     // Catch:{ all -> 0x0d13 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d13 }
            r1[r18] = r0     // Catch:{ all -> 0x0d13 }
            r0 = 4
            r1[r0] = r9     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file deleting %s (size %d), renaming %s (size:%d) -> %s"
            java.lang.String.format(r6, r0, r1)     // Catch:{ all -> 0x0d13 }
            boolean r0 = r9.delete()     // Catch:{ all -> 0x0d13 }
            if (r0 == 0) goto L_0x0aa5
            r10.renameTo(r9)     // Catch:{ all -> 0x0d13 }
            goto L_0x0aa5
        L_0x0bf2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d13 }
            r6.<init>()     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = "sqlite-repair/recover-database-table/success \""
            r6.append(r0)     // Catch:{ all -> 0x0d13 }
            r6.append(r7)     // Catch:{ all -> 0x0d13 }
            r0 = r35
            r6.append(r0)     // Catch:{ all -> 0x0d13 }
            long r0 = r9.length()     // Catch:{ all -> 0x0d13 }
            r6.append(r0)     // Catch:{ all -> 0x0d13 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0d13 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0d13 }
            goto L_0x0a59
        L_0x0c15:
            X.AnonymousClass1XI.A0N(r9)     // Catch:{ Exception -> 0x0d18 }
            r6 = r34
            goto L_0x09e2
        L_0x0c1c:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0c20 }
        L_0x0c20:
            throw r0     // Catch:{ all -> 0x0c26 }
        L_0x0c21:
            r1 = move-exception
            X.C30311c8.A04(r0)     // Catch:{ all -> 0x0c26 }
            throw r1     // Catch:{ all -> 0x0c26 }
        L_0x0c26:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x0c2a }
        L_0x0c2a:
            throw r0     // Catch:{ all -> 0x0d13 }
        L_0x0c2b:
            java.lang.String r0 = "sqlite-repair/set-db-version "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r36.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            r1.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r6 = r36.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            r1 = 0
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r6, r1, r0)     // Catch:{ Exception -> 0x0d18 }
            r0.setVersion(r3)     // Catch:{ all -> 0x0d07 }
            r0.close()     // Catch:{ Exception -> 0x0d18 }
            int r0 = A00(r40)     // Catch:{ Exception -> 0x0d18 }
            long r10 = (long) r0     // Catch:{ Exception -> 0x0d18 }
            int r0 = A00(r36)     // Catch:{ Exception -> 0x0d18 }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = "sqlite-repair/check-restored-db/orig number of messages \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r40.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            r1.append(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r8 = "\" is "
            r1.append(r8)     // Catch:{ Exception -> 0x0d18 }
            r1.append(r10)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = "sqlite-repair/check-restored-db/restored number of messages \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r36.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            r1.append(r0)     // Catch:{ Exception -> 0x0d18 }
            r1.append(r8)     // Catch:{ Exception -> 0x0d18 }
            r1.append(r6)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r0 = "sqlite-repair/check-restored-db/ratio "
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d18 }
            r15.<init>(r0)     // Catch:{ Exception -> 0x0d18 }
            double r0 = (double) r6     // Catch:{ Exception -> 0x0d18 }
            r34 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r0 * r34
            double r12 = (double) r10     // Catch:{ Exception -> 0x0d18 }
            double r8 = r8 / r12
            r15.append(r8)     // Catch:{ Exception -> 0x0d18 }
            java.lang.String r8 = r15.toString()     // Catch:{ Exception -> 0x0d18 }
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ Exception -> 0x0d18 }
            A02(r40)     // Catch:{ Exception -> 0x0d18 }
            r36.getAbsolutePath()     // Catch:{ Exception -> 0x0d18 }
            A02(r36)     // Catch:{ Exception -> 0x0d18 }
            r8 = 0
            r32 = 0
            int r9 = (r6 > r32 ? 1 : (r6 == r32 ? 0 : -1))
            if (r9 >= 0) goto L_0x0ccb
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0d18 }
            r14.set(r0)     // Catch:{ Exception -> 0x0d18 }
            goto L_0x0711
        L_0x0ccb:
            int r9 = (r10 > r32 ? 1 : (r10 == r32 ? 0 : -1))
            if (r9 > 0) goto L_0x0ce0
            int r9 = (r6 > r32 ? 1 : (r6 == r32 ? 0 : -1))
            if (r9 <= 0) goto L_0x0ce0
            r6 = 4636807660098813952(0x4059400000000000, double:101.0)
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0d18 }
            r14.set(r6)     // Catch:{ Exception -> 0x0d18 }
            goto L_0x0ce2
        L_0x0ce0:
            r7 = 0
            goto L_0x0ce3
        L_0x0ce2:
            r7 = 1
        L_0x0ce3:
            double r0 = r0 / r12
            r9 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0cee
            goto L_0x0cf1
        L_0x0cee:
            if (r7 == 0) goto L_0x0711
            goto L_0x0cfa
        L_0x0cf1:
            double r0 = r0 * r34
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0d18 }
            r14.set(r0)     // Catch:{ Exception -> 0x0d18 }
        L_0x0cfa:
            r1 = r36
            r0 = r40
            boolean r0 = r1.renameTo(r0)     // Catch:{ Exception -> 0x0d18 }
            if (r0 == 0) goto L_0x0711
            r8 = 1
            goto L_0x0711
        L_0x0d07:
            r1 = move-exception
            if (r0 == 0) goto L_0x0d12
            r0.close()     // Catch:{ all -> 0x0d12 }
            goto L_0x0d12
        L_0x0d0e:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0d12 }
        L_0x0d12:
            throw r1     // Catch:{ Exception -> 0x0d18 }
        L_0x0d13:
            r0 = move-exception
            X.AnonymousClass1XI.A0N(r9)     // Catch:{ Exception -> 0x0d18 }
            throw r0     // Catch:{ Exception -> 0x0d18 }
        L_0x0d18:
            r6 = move-exception
            java.lang.String r0 = "Error while restoring dbFile "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r40.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r6)
            goto L_0x0710
        L_0x0d30:
            r41.A04()
            r0 = r41
            X.1jC r12 = r0.A04
            monitor-enter(r12)
            r32 = 0
            r34 = 0
            java.lang.String r0 = "DatabaseHelper/verifyBackup - initialize backup verification."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0f3f }
            X.1jN r11 = r12.A04     // Catch:{ all -> 0x0f3f }
            monitor-enter(r11)     // Catch:{ all -> 0x0f3f }
            boolean r14 = r11.A00     // Catch:{ all -> 0x0f3c }
            monitor-exit(r11)     // Catch:{ all -> 0x0f3f }
            r11.A00(r3)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            X.0tg r10 = r12.AHC()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = "DatabaseHelper/verifyBackup - check if all migrations flags meet database state."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            boolean r0 = X.C33811jC.A03(r10)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r12.A09 = r0     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            boolean r0 = r12.A0F(r10)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r12.A0A = r0     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = "DatabaseHelperverifyMigrationStatus - isMigrationCompleted: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r1.<init>(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r0 = r12.A09     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r1.append(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = "DatabaseHelperverifyMigrationStatus - isWriteToOldSchemaEnabled: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r1.<init>(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r0 = r12.A0A     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r1.append(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r0 = r12.A09     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            boolean r9 = r1.equals(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r8 = 0
            if (r9 == 0) goto L_0x0e19
            java.lang.String r0 = "DatabaseHelperverifyMigrationStatus - verify all essential migrations are completed."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.util.Map r0 = X.C34071je.A00     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.util.Set r0 = r0.entrySet()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
        L_0x0da7:
            boolean r0 = r13.hasNext()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            if (r0 == 0) goto L_0x0dfb
            java.lang.Object r6 = r13.next()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Object r1 = r6.getKey()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Object r0 = r6.getValue()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            int r0 = r0.intValue()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0dcf }
            java.lang.String r1 = X.C33971jU.A00(r10, r1, r7)     // Catch:{ NumberFormatException -> 0x0dcf }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0dcf }
        L_0x0dcf:
            java.lang.Object r1 = r6.getValue()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            int r1 = r1.intValue()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            if (r0 == r1) goto L_0x0da7
            java.lang.String r1 = "DatabaseHelperverifyMigrationStatus - migration '"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r7.<init>(r1)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Object r1 = r6.getKey()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r7.append(r1)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r1 = "' has wrong migration status: "
            r7.append(r1)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r7.append(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = r7.toString()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r9 = 0
        L_0x0dfb:
            java.lang.String r1 = "DatabaseHelperverifyMigrationStatus - essential migrations: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r0.append(r9)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            if (r9 == 0) goto L_0x0e19
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r0 = r12.A0A     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            boolean r0 = r1.equals(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r6 = 0
            if (r0 == 0) goto L_0x0e3a
        L_0x0e19:
            r6 = 1
            java.lang.String r0 = "DatabaseHelperverifyMigrationStatus - check write to old tables."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r1 = "messages"
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C33961jT.A00(r10, r0, r1)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            if (r0 == 0) goto L_0x0e35
            java.lang.String r0 = "DatabaseHelper/old tables verification, old tables do not exist."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r9 = 1
            goto L_0x0e3b
        L_0x0e35:
            java.lang.String r0 = "DatabaseHelper/old tables verification, old tables are available."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
        L_0x0e3a:
            r8 = r6
        L_0x0e3b:
            java.lang.Boolean r0 = r12.A09     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            boolean r0 = r0.booleanValue()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            if (r0 != r9) goto L_0x0e4b
            java.lang.Boolean r0 = r12.A0A     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            boolean r0 = r0.booleanValue()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            if (r0 == r8) goto L_0x0e93
        L_0x0e4b:
            java.lang.String r1 = "DatabaseHelperverifyMigrationStatus - update props, isMigrationCompleted: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r0.append(r9)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r1 = "DatabaseHelperverifyMigrationStatus - update props, isWriteToOldSchemaEnabled: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r0.append(r8)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r6 = 1
            if (r9 == 0) goto L_0x0e74
            r0 = 1
            goto L_0x0e76
        L_0x0e74:
            r0 = 0
        L_0x0e76:
            java.lang.String r15 = "migration_completed"
            java.lang.String r13 = "DatabaseHelper"
            X.C33971jU.A02(r10, r15, r13, r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            if (r8 == 0) goto L_0x0e81
            r6 = 0
        L_0x0e81:
            java.lang.String r0 = "write_to_old_schema_disabled"
            X.C33971jU.A02(r10, r0, r13, r6)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r12.A09 = r0     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r12.A0A = r0     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
        L_0x0e93:
            java.lang.String r0 = "DatabaseHelper/verifyBackup - force re-create missing indexes."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r1 = "DatabaseHelper/verifyBackup/restoreIndexes"
            X.1Zf r0 = new X.1Zf     // Catch:{ SQLiteException -> 0x0eae, Exception -> 0x0ebe }
            r0.<init>((java.lang.String) r1)     // Catch:{ SQLiteException -> 0x0eae, Exception -> 0x0ebe }
            r12.A08(r10)     // Catch:{ SQLiteException -> 0x0eae, Exception -> 0x0ebe }
            long r6 = r0.A01()     // Catch:{ SQLiteException -> 0x0eae, Exception -> 0x0ebe }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            r32 = r6
            r34 = 1
            goto L_0x0eb4
        L_0x0eae:
            r1 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup/restoreIndexes - database error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
        L_0x0eb4:
            r12.close()     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            java.lang.String r0 = "DatabaseHelper/verifyBackup - database is valid and ready to be used."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0ec5, Exception -> 0x0ebe }
            r1 = 1
            goto L_0x0ecc
        L_0x0ebe:
            r1 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup - unknown error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0f37 }
            goto L_0x0ecb
        L_0x0ec5:
            r1 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup - database error."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0f37 }
        L_0x0ecb:
            r1 = 0
        L_0x0ecc:
            r11.A00(r14)     // Catch:{ all -> 0x0f3f }
            monitor-exit(r12)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r34)
            r5.A09 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r32)
            r5.A0G = r0
            if (r1 == 0) goto L_0x02da
            if (r19 == 0) goto L_0x0efc
            X.0u3 r1 = r2.A0b
            java.lang.String r0 = X.AnonymousClass01S.A07
            android.content.SharedPreferences r0 = r1.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "maintain_db_integrity"
            r1.putBoolean(r0, r3)
            boolean r0 = r1.commit()
            if (r0 != 0) goto L_0x0efc
            java.lang.String r0 = "MessageStoreBackup/restore/maintain-db-integrity/failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0efc:
            r18 = 1
            goto L_0x02da
        L_0x0f00:
            int r22 = r22 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure/jid-mismatch "
            goto L_0x00b1
        L_0x0f0b:
            int r24 = r24 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure/file-integrity "
            goto L_0x00b1
        L_0x0f16:
            java.lang.String r1 = "MessageStoreBackup/restore/success "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r1 = r26.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r17 = 1
            goto L_0x00c2
        L_0x0f2f:
            java.lang.String r0 = "repair-disabled"
            goto L_0x0065
        L_0x0f33:
            int r20 = r20 + 1
            goto L_0x001f
        L_0x0f37:
            r0 = move-exception
            r11.A00(r14)     // Catch:{ all -> 0x0f3f }
            goto L_0x0f3e
        L_0x0f3c:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0f3f }
        L_0x0f3e:
            throw r0     // Catch:{ all -> 0x0f3f }
        L_0x0f3f:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x0f42:
            r1 = move-exception
            boolean r0 = r40.exists()
            if (r0 != 0) goto L_0x0f50
            com.whatsapp.util.Log.i((java.lang.String) r15)
            r2.A0H()
            throw r1
        L_0x0f50:
            java.io.File r0 = r2.A0C()
            X.AnonymousClass1XI.A0N(r0)
            throw r1
        L_0x0f58:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r31
            r1.append(r0)
            if (r17 == 0) goto L_0x0fc5
            java.lang.String r0 = "success"
        L_0x0f67:
            r1.append(r0)
            java.lang.String r0 = " num-backup-files-attempts: "
            r1.append(r0)
            r0 = r28
            r1.append(r0)
            java.lang.String r0 = " num-integrity-failure: "
            r1.append(r0)
            r0 = r24
            r1.append(r0)
            java.lang.String r0 = " num-jid-mismatch: "
            r1.append(r0)
            r0 = r22
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r17 == 0) goto L_0x0f98
            r4 = 1
        L_0x0f92:
            X.1jj r0 = new X.1jj
            r0.<init>(r4)
            return r0
        L_0x0f98:
            X.131 r0 = r2.A0R
            r0.A00()
            X.0ym r0 = r2.A0P
            X.0tq r0 = r0.A02
            r0.A04()
            r0.A05()
            if (r21 == 0) goto L_0x0fb0
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/out-of-space"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4 = 5
            goto L_0x0f92
        L_0x0fb0:
            if (r22 <= 0) goto L_0x0fb8
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/some-failures-are-jid-mismatch"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0f92
        L_0x0fb8:
            r1 = r24
            r0 = r28
            if (r1 != r0) goto L_0x0f92
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/all-failures-are-file-integrity-issues"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4 = 4
            goto L_0x0f92
        L_0x0fc5:
            java.lang.String r0 = "failed"
            goto L_0x0f67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16250si.A08(X.1v3, java.util.List, int):X.1jj");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        r1 = (X.C16730tY) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b5, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        r3.A04();
        r2.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
        return r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C34121jj A09(X.AnonymousClass2G3 r10, boolean r11) {
        /*
            r9 = this;
            X.0tq r3 = r9.A0Q
            r3.A04()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r3.A07
            r2.lock()
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00cc }
            monitor-enter(r9)     // Catch:{ all -> 0x00cc }
            r3.A04()     // Catch:{ all -> 0x00c9 }
            boolean r0 = r3.A01     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00b6
            X.1jj r6 = r10.Acb()     // Catch:{ all -> 0x00c9 }
            int r0 = r6.A00     // Catch:{ all -> 0x00c9 }
            r7 = 1
            r1 = 0
            if (r0 != r7) goto L_0x0022
            r1 = 1
        L_0x0022:
            r3.A04()     // Catch:{ SQLiteException -> 0x0089 }
            X.1jC r0 = r3.A04     // Catch:{ SQLiteException -> 0x0089 }
            r0.AHC()     // Catch:{ SQLiteException -> 0x0089 }
            if (r1 == 0) goto L_0x0089
            r3.A04()     // Catch:{ all -> 0x00c9 }
            r3.A01 = r7     // Catch:{ all -> 0x00c9 }
            X.1Sn r5 = r9.A0K     // Catch:{ all -> 0x00c9 }
            X.126 r4 = r5.A02     // Catch:{ all -> 0x00c9 }
            r0 = 35
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x00c9 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x00c9 }
            r0 = 32
            r4.A01(r1, r0)     // Catch:{ all -> 0x00c9 }
            X.1D0 r0 = r9.A0J     // Catch:{ all -> 0x00c9 }
            r0.A06()     // Catch:{ all -> 0x00c9 }
            X.0t8 r8 = r9.A0N     // Catch:{ all -> 0x00c9 }
            X.0tq r0 = r8.A0B     // Catch:{ all -> 0x00c9 }
            X.0tf r5 = r0.A02()     // Catch:{ all -> 0x00c9 }
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = X.AnonymousClass2Fo.A01     // Catch:{ all -> 0x0084 }
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0084 }
            android.database.Cursor r4 = r4.A08(r1, r0)     // Catch:{ all -> 0x0084 }
        L_0x0059:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0079
            X.0t6 r0 = r8.A06     // Catch:{ all -> 0x007d }
            X.0th r0 = r0.A0K     // Catch:{ all -> 0x007d }
            X.0tZ r1 = r0.A01(r4)     // Catch:{ all -> 0x007d }
            boolean r0 = r1 instanceof X.C16730tY     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0059
            X.0tY r1 = (X.C16730tY) r1     // Catch:{ all -> 0x007d }
            X.0ta r0 = r1.A02     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0059
            r0.A0W = r7     // Catch:{ all -> 0x007d }
            X.17I r0 = r8.A07     // Catch:{ all -> 0x007d }
            r0.A07(r1)     // Catch:{ all -> 0x007d }
            goto L_0x0059
        L_0x0079:
            r4.close()     // Catch:{ all -> 0x0084 }
            goto L_0x00a6
        L_0x007d:
            r0 = move-exception
            if (r4 == 0) goto L_0x0083
            r4.close()     // Catch:{ all -> 0x0083 }
        L_0x0083:
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x0089:
            if (r11 == 0) goto L_0x00ae
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/re-creating db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c9 }
            X.0ym r0 = r9.A0P     // Catch:{ all -> 0x00c9 }
            X.0tq r0 = r0.A02     // Catch:{ all -> 0x00c9 }
            r0.A04()     // Catch:{ all -> 0x00c9 }
            r0.A06()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/db recreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c9 }
            r0 = 2
            X.1jj r1 = new X.1jj     // Catch:{ all -> 0x00c9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x00c1
        L_0x00a6:
            r5.close()     // Catch:{ all -> 0x00c9 }
            X.1Ti r0 = r9.A0c     // Catch:{ all -> 0x00c9 }
            r0.A02()     // Catch:{ all -> 0x00c9 }
        L_0x00ae:
            monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
            r3.A04()
            r2.unlock()
            return r6
        L_0x00b6:
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup/6"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c9 }
            r0 = 6
            X.1jj r1 = new X.1jj     // Catch:{ all -> 0x00c9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00c9 }
        L_0x00c1:
            monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
            r3.A04()
            r2.unlock()
            return r1
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00c9 }
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            r3.A04()
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16250si.A09(X.2G3, boolean):X.1jj");
    }

    public File A0A() {
        File file;
        String externalStorageState = Environment.getExternalStorageState();
        C16260sj r2 = this.A0F;
        if (("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && (r2.A07() || r2.A04(C28971Zm.A00(this.A0D.A00, false, false)) == 0)) {
            ArrayList A0F2 = A0F();
            int size = A0F2.size();
            do {
                size--;
                if (size < 0) {
                    return null;
                }
                file = (File) A0F2.get(size);
            } while (file.length() <= 0);
            StringBuilder sb = new StringBuilder("MessageStoreBackup/lastbackupfile/file ");
            sb.append(file.getName());
            sb.append(" size=");
            sb.append(file.length());
            Log.i(sb.toString());
            return file;
        }
        StringBuilder sb2 = new StringBuilder("MessageStoreBackup/lastbackupfiletime/media_unavailable ");
        sb2.append(externalStorageState);
        Log.i(sb2.toString());
        throw new IOException("External media not readable");
    }

    public File A0B() {
        File[] A0K2 = A0K();
        int length = A0K2.length;
        if (length != 0) {
            int i2 = 0;
            do {
                File file = A0K2[i2];
                if (file.exists()) {
                    StringBuilder sb = new StringBuilder("MessageStoreBackup/get-latest-db-backup-for-gdrive ");
                    sb.append(file.getAbsolutePath());
                    Log.i(sb.toString());
                    return file;
                }
                i2++;
            } while (i2 < length);
            StringBuilder sb2 = new StringBuilder("MessageStoreBackup/get-latest-db-backup-for-gdrive/no-file-exists ");
            sb2.append(A0K2[0].getAbsolutePath());
            Log.i(sb2.toString());
            return A0K2[0];
        }
        throw new IllegalStateException("MessageStoreBackup/backup/list-of-backup-files-is-null");
    }

    public final File A0C() {
        File file;
        synchronized (this.A0i) {
            file = this.A01;
            if (file == null) {
                file = this.A0D.A00.getDatabasePath("msgstore.db-backup");
                this.A01 = file;
            }
        }
        return file;
    }

    public final File A0D() {
        File file;
        synchronized (this.A0i) {
            file = this.A02;
            if (file == null) {
                file = new File(this.A0A.A03(), "msgstore.db");
                this.A02 = file;
            }
        }
        return file;
    }

    public File A0E(C16960tx r5) {
        if (r5 == C16960tx.A08) {
            return A0D();
        }
        File A032 = this.A0A.A03();
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore.db");
        StringBuilder sb2 = new StringBuilder(".crypt");
        sb2.append(r5.version);
        sb.append(sb2.toString());
        return new File(A032, sb.toString());
    }

    public ArrayList A0F() {
        ArrayList A072 = C40691uX.A07(A0D(), C40691uX.A08(C16960tx.A01(), C16960tx.A00()));
        C40691uX.A0D(A0D(), A072);
        return A072;
    }

    public void A0G() {
        for (C16960tx A0E2 : C16960tx.values()) {
            AnonymousClass02N.A04(A0E(A0E2), "", -1, false);
        }
        AnonymousClass02N.A04(A0D(), "", -1, false);
    }

    public final void A0H() {
        C16900tq r3 = this.A0Q;
        r3.A04();
        File file = r3.A06;
        if (file.exists()) {
            r3.A04();
            if (!file.delete()) {
                Log.w("MessageStoreBackup/copybackuptodb/failed to delete db before copying from backup up.");
            }
        }
        File A0C2 = A0C();
        if (A0C2.exists()) {
            AnonymousClass12X r0 = this.A0Y;
            r3.A04();
            AnonymousClass1XI.A0M(r0, A0C2, file);
            return;
        }
        Log.w("MessageStoreBackup/copybackuptodb/no backup db to copy.");
    }

    public final void A0I() {
        this.A0a.A03(true);
        this.A03.A09(Boolean.FALSE);
        C16900tq r0 = this.A0Q;
        r0.A04();
        r0.A07.unlock();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        com.whatsapp.util.Log.i("MessageStoreBackup/lastbackupfileencrypted", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0J() {
        /*
            r5 = this;
            r4 = 0
            java.io.File r3 = r5.A0A()     // Catch:{ IOException -> 0x002a }
            if (r3 == 0) goto L_0x0029
            java.lang.Class<X.0tx> r2 = X.C16960tx.class
            monitor-enter(r2)     // Catch:{ IOException -> 0x002a }
            r0 = 1
            X.0tx[] r1 = new X.C16960tx[r0]     // Catch:{ all -> 0x0025 }
            X.0tx r0 = X.C16960tx.A07     // Catch:{ all -> 0x0025 }
            r1[r4] = r0     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x002a }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ IOException -> 0x002a }
            java.lang.String r0 = r3.getName()     // Catch:{ IOException -> 0x002a }
            X.0tx r0 = X.C40721ua.A00(r0)     // Catch:{ IOException -> 0x002a }
            boolean r0 = r1.contains(r0)     // Catch:{ IOException -> 0x002a }
            if (r0 == 0) goto L_0x0029
            goto L_0x0028
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x002a }
            throw r0     // Catch:{ IOException -> 0x002a }
        L_0x0028:
            r4 = 1
        L_0x0029:
            return r4
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/lastbackupfileencrypted"
            com.whatsapp.util.Log.i(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16250si.A0J():boolean");
    }

    public File[] A0K() {
        C16960tx[] A042 = C16960tx.A04(C16960tx.A01(), C16960tx.A00());
        int length = A042.length;
        File[] fileArr = new File[length];
        for (int i2 = 0; i2 < length; i2++) {
            fileArr[i2] = A0E(A042[(length - i2) - 1]);
        }
        TextUtils.join(", ", fileArr);
        return fileArr;
    }
}
