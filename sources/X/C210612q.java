package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.12q  reason: invalid class name and case insensitive filesystem */
public class C210612q implements C16240sh {
    public static final String[] A0D = {"wa_trusted_contacts", "wa_trusted_contacts_send"};
    public final C16300so A00;
    public final C16040sK A01;
    public final C16200sd A02;
    public final C16190sc A03;
    public final AnonymousClass12W A04;
    public final C16980tz A05;
    public final C18790xG A06;
    public final C206911f A07;
    public final C14710pd A08;
    public final AnonymousClass12X A09;
    public final C16990u0 A0A;
    public final AnonymousClass12V A0B;
    public final AnonymousClass11X A0C;

    public C210612q(C16300so r1, C16040sK r2, C16200sd r3, C16190sc r4, AnonymousClass12W r5, C16980tz r6, C18790xG r7, C206911f r8, C14710pd r9, AnonymousClass12X r10, C16990u0 r11, AnonymousClass12V r12, AnonymousClass11X r13) {
        this.A05 = r6;
        this.A08 = r9;
        this.A00 = r1;
        this.A0B = r12;
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A0C = r13;
        this.A04 = r5;
        this.A0A = r11;
        this.A09 = r10;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0095 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass11X r18, X.AnonymousClass11X r19) {
        /*
            X.0tf r4 = r18.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a5 }
            X.0tf r5 = r19.A02()     // Catch:{ all -> 0x00a0 }
            X.1cj r11 = r4.A00()     // Catch:{ all -> 0x009b }
            X.1cj r10 = r5.A00()     // Catch:{ all -> 0x0096 }
            java.lang.String[] r9 = A0D     // Catch:{ all -> 0x0091 }
            int r8 = r9.length     // Catch:{ all -> 0x0091 }
            r7 = 0
        L_0x0014:
            if (r7 >= r8) goto L_0x007d
            r13 = r9[r7]     // Catch:{ all -> 0x0091 }
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r1.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "WaDatabaseBackupProducer/copyBackupTables/delete/"
            r1.append(r0)     // Catch:{ all -> 0x0091 }
            r1.append(r13)     // Catch:{ all -> 0x0091 }
            r1.toString()     // Catch:{ all -> 0x0091 }
            r0 = 0
            r6.A01(r13, r0, r0)     // Catch:{ all -> 0x0091 }
            X.0tg r12 = r4.A02     // Catch:{ all -> 0x0091 }
            r14 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r1.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "WaDatabaseBackupProducer/copyBackupTables/read/"
            r1.append(r0)     // Catch:{ all -> 0x0091 }
            r1.append(r13)     // Catch:{ all -> 0x0091 }
            r1.toString()     // Catch:{ all -> 0x0091 }
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r15 = r14
            android.database.Cursor r3 = r12.A09(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x0075
        L_0x0050:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0072
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0078 }
            r2.<init>()     // Catch:{ all -> 0x0078 }
            android.database.DatabaseUtils.cursorRowToContentValues(r3, r2)     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r1.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "WaDatabaseBackupProducer/copyBackupTables/write/"
            r1.append(r0)     // Catch:{ all -> 0x0078 }
            r1.append(r13)     // Catch:{ all -> 0x0078 }
            r1.toString()     // Catch:{ all -> 0x0078 }
            r6.A02(r2, r13)     // Catch:{ all -> 0x0078 }
            goto L_0x0050
        L_0x0072:
            r3.close()     // Catch:{ all -> 0x0091 }
        L_0x0075:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x0078:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x007c }
        L_0x007c:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x007d:
            r11.A00()     // Catch:{ all -> 0x0091 }
            r10.A00()     // Catch:{ all -> 0x0091 }
            r10.close()     // Catch:{ all -> 0x0096 }
            r11.close()     // Catch:{ all -> 0x009b }
            r5.close()     // Catch:{ all -> 0x00a0 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a5 }
            r0 = 1
            return r0
        L_0x0091:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0095 }
        L_0x0095:
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x009a }
        L_0x009a:
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x009f }
        L_0x009f:
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            java.lang.String r0 = "WaDatabaseBackupProducer/copyBackupTables/exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210612q.A00(X.11X, X.11X):boolean");
    }

    public boolean A5J() {
        AnonymousClass12W r14 = this.A04;
        boolean z2 = false;
        if (r14.A02()) {
            Log.i("WaDatabaseBackupProducer/skip no media or read-only media");
            return false;
        }
        C16200sd r13 = this.A02;
        C16960tx A062 = C40691uX.A06(r13);
        C16980tz r4 = this.A05;
        C14710pd r3 = this.A08;
        AnonymousClass11X r15 = new AnonymousClass11X(this.A00, r4, this.A07, r3, "wa-backup.db");
        try {
            if (!A00(this.A0C, r15)) {
                Log.e("WaDatabaseBackupProducer/failed-to-copy");
            } else if (!r15.A03()) {
                Log.e("WaDatabaseBackupProducer/wal checkpoint failed");
            } else {
                Log.i("WaDatabaseBackupProducer/close-backup-db");
                r15.close();
                C16190sc r9 = this.A03;
                File A022 = r9.A02();
                StringBuilder sb = new StringBuilder();
                sb.append("wa.db.crypt");
                sb.append(A062.version);
                File file = new File(A022, sb.toString());
                List A082 = C40691uX.A08(C16960tx.A06, C16960tx.A00());
                File file2 = new File(r9.A02(), "wa.db");
                ArrayList A072 = C40691uX.A07(file2, A082);
                C40691uX.A0D(file2, A072);
                Iterator it = A072.iterator();
                while (it.hasNext()) {
                    File file3 = (File) it.next();
                    if (!file3.equals(file) && file3.exists()) {
                        file3.delete();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("WaDatabaseBackupProducer/to ");
                sb2.append(file);
                Log.i(sb2.toString());
                AnonymousClass12V r32 = this.A0B;
                AnonymousClass12X r16 = this.A09;
                C40971uz A012 = C40951ux.A01(this.A01, (C40961uy) null, r13, r14, this.A06, r16, this.A0A, A062, r32, file);
                if (!A012.A04(r4.A00)) {
                    Log.w("WaDatabaseBackupProducer/prepare for backup failed");
                } else {
                    A012.A03((C17000u1) null, r15.A00.A00.getDatabasePath(r15.getDatabaseName()));
                    z2 = true;
                }
                r15.A04();
                return z2;
            }
            r15.A04();
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            Log.e("WaDatabaseBackupProducer failed", e2);
        } catch (Throwable th) {
            r15.A04();
            throw th;
        }
        r15.A04();
        return z2;
    }

    public String AA3() {
        return "wa-db";
    }

    /* JADX INFO: finally extract failed */
    public boolean Aca(Context context) {
        List A082 = C40691uX.A08(C16960tx.A06, C16960tx.A00());
        File file = new File(this.A03.A02(), "wa.db");
        ArrayList A072 = C40691uX.A07(file, A082);
        C40691uX.A0D(file, A072);
        if (A072.isEmpty()) {
            return false;
        }
        File file2 = (File) A072.get(0);
        C16980tz r15 = this.A05;
        C14710pd r4 = this.A08;
        AnonymousClass11X r6 = new AnonymousClass11X(this.A00, r15, this.A07, r4, "wa-backup.db");
        ReentrantReadWriteLock.WriteLock writeLock = r6.A05.writeLock();
        writeLock.lock();
        try {
            r6.A04();
            File databasePath = r6.A00.A00.getDatabasePath(r6.getDatabaseName());
            file2.getAbsolutePath();
            databasePath.getAbsolutePath();
            C16960tx A022 = C16960tx.A02(C40691uX.A01(file2.getName(), "wa.db"));
            AnonymousClass12V r13 = this.A0B;
            C16040sK r5 = this.A01;
            C18790xG r9 = this.A06;
            C40951ux.A01(r5, (C40961uy) null, this.A02, this.A04, r9, this.A09, this.A0A, A022, r13, file2).A01((C41011v3) null, r15, databasePath, 0, 0, false);
            writeLock.unlock();
            try {
                A00(r6, this.A0C);
                r6.A04();
                return true;
            } catch (Exception e2) {
                Log.e("WaDatabaseBackupProducer/restore copy backup tables failed", e2);
                return false;
            }
        } catch (Exception e3) {
            Log.e("WaDatabaseBackupProducer/restore backup file failed", e3);
            writeLock.unlock();
            return false;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }
}
