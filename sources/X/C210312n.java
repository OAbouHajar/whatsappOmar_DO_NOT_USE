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

/* renamed from: X.12n  reason: invalid class name and case insensitive filesystem */
public class C210312n implements C16240sh {
    public final C16040sK A00;
    public final C16200sd A01;
    public final C16190sc A02;
    public final AnonymousClass12W A03;
    public final C16980tz A04;
    public final C18790xG A05;
    public final C210212m A06;
    public final AnonymousClass12X A07;
    public final C16990u0 A08;
    public final AnonymousClass12V A09;

    public C210312n(C16040sK r1, C16200sd r2, C16190sc r3, AnonymousClass12W r4, C16980tz r5, C18790xG r6, C210212m r7, AnonymousClass12X r8, C16990u0 r9, AnonymousClass12V r10) {
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A03 = r4;
        this.A08 = r9;
        this.A07 = r8;
    }

    public boolean A5J() {
        String obj;
        C16200sd r12 = this.A01;
        C16960tx A062 = C40691uX.A06(r12);
        AnonymousClass12W r13 = this.A03;
        if (r13.A02()) {
            Log.i("commerce_backup_store/backup/skip no media or read-only media");
            return false;
        }
        C210212m r1 = this.A06;
        ReentrantReadWriteLock.WriteLock writeLock = r1.A00().A05.writeLock();
        writeLock.lock();
        try {
            Log.i("commerce_backup_store/backup/close-backup-db");
            r1.A01();
            File databasePath = r1.A02.A00.getDatabasePath("commerce.db");
            if (!databasePath.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("commerce_backup_store/backup/db-file-not-found");
                sb.append(databasePath);
                Log.i(sb.toString());
            } else {
                C16190sc r8 = this.A02;
                C16960tx r7 = C16960tx.A05;
                File A022 = r8.A02();
                if (A062 == r7) {
                    obj = "commerce_backup.db.crypt1";
                } else {
                    StringBuilder sb2 = new StringBuilder("commerce_backup.db.crypt");
                    sb2.append(A062.version);
                    obj = sb2.toString();
                }
                File file = new File(A022, obj);
                List A082 = C40691uX.A08(r7, C16960tx.A00());
                A082.add(".crypt1");
                File file2 = new File(r8.A02(), "commerce_backup.db");
                ArrayList A072 = C40691uX.A07(file2, A082);
                C40691uX.A0D(file2, A072);
                Iterator it = A072.iterator();
                while (it.hasNext()) {
                    File file3 = (File) it.next();
                    if (!file3.equals(file) && file3.exists()) {
                        file3.delete();
                    }
                }
                AnonymousClass12V r14 = this.A09;
                C16040sK r10 = this.A00;
                C18790xG r142 = this.A05;
                C16990u0 r16 = this.A08;
                C40971uz A012 = C40951ux.A01(r10, (C40961uy) null, r12, r13, r142, this.A07, r16, A062, r14, file);
                if (!A012.A04(this.A04.A00)) {
                    Log.w("commerce_backup_store/backup/failed to prepare for backup");
                    writeLock.unlock();
                    return false;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("commerce_backup_store/backup/to ");
                sb3.append(file);
                Log.i(sb3.toString());
                A012.A03((C17000u1) null, databasePath);
            }
            writeLock.unlock();
            return true;
        } catch (Exception e2) {
            Log.w("commerce_backup_store/backup/error", e2);
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public String AA3() {
        return "commerce-db";
    }

    public boolean Aca(Context context) {
        C16960tx r14 = C16960tx.A05;
        List A082 = C40691uX.A08(r14, C16960tx.A00());
        A082.add(".crypt1");
        File file = new File(this.A02.A02(), "commerce_backup.db");
        ArrayList A072 = C40691uX.A07(file, A082);
        C40691uX.A0D(file, A072);
        if (A072.isEmpty()) {
            return false;
        }
        File file2 = (File) A072.get(0);
        synchronized (this) {
            C210212m r2 = this.A06;
            ReentrantReadWriteLock.WriteLock writeLock = r2.A00().A05.writeLock();
            writeLock.lock();
            boolean z2 = false;
            try {
                r2.A01();
                File databasePath = r2.A02.A00.getDatabasePath("commerce.db");
                if (!file2.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("commerce_backup_store/backup/backup-file-not-found");
                    sb.append(file2);
                    Log.i(sb.toString());
                    writeLock.unlock();
                    return true;
                }
                file2.length();
                int A012 = C40691uX.A01(file2.getName(), "commerce_backup.db");
                if (A012 <= 0 || (A012 >= r14.version && (r14 = C16960tx.A02(A012)) == null)) {
                    r14 = C16960tx.A08;
                }
                AnonymousClass12V r15 = this.A09;
                C16040sK r7 = this.A00;
                C18790xG r11 = this.A05;
                C41021v4 A013 = C40951ux.A01(r7, (C40961uy) null, this.A01, this.A03, r11, this.A07, this.A08, r14, r15, file2).A01((C41011v3) null, this.A04, databasePath, 0, 0, false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("commerce_backup_store/restore/result ");
                sb2.append(A013);
                Log.i(sb2.toString());
                if (A013.A00 == 1) {
                    z2 = true;
                }
                writeLock.unlock();
                return z2;
            } catch (AnonymousClass03R | IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
                Log.w("commerce_backup_store/restore/error", e2);
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        }
    }
}
