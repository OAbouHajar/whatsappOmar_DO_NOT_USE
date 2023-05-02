package X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0sl  reason: invalid class name and case insensitive filesystem */
public class C16280sl implements C16240sh {
    public final C16040sK A00;
    public final AnonymousClass01Z A01;
    public final C16200sd A02;
    public final C16190sc A03;
    public final AnonymousClass12W A04;
    public final C16980tz A05;
    public final C18790xG A06;
    public final C209912j A07;
    public final AnonymousClass12X A08;
    public final C210112l A09;
    public final C210012k A0A;
    public final C16990u0 A0B;
    public final AnonymousClass12V A0C;

    public C16280sl(C16040sK r1, AnonymousClass01Z r2, C16200sd r3, C16190sc r4, AnonymousClass12W r5, C16980tz r6, C18790xG r7, C209912j r8, AnonymousClass12X r9, C210112l r10, C210012k r11, C16990u0 r12, AnonymousClass12V r13) {
        this.A05 = r6;
        this.A0C = r13;
        this.A00 = r1;
        this.A03 = r4;
        this.A06 = r7;
        this.A02 = r3;
        this.A07 = r8;
        this.A04 = r5;
        this.A0A = r11;
        this.A0B = r12;
        this.A09 = r10;
        this.A01 = r2;
        this.A08 = r9;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0120 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x0120=Splitter:B:50:0x0120, B:43:0x0115=Splitter:B:43:0x0115} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A00(X.C16960tx r17) {
        /*
            r16 = this;
            r2 = r16
            X.12W r9 = r2.A04
            boolean r0 = r9.A02()
            r7 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "sticker-db-storage/backup/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0011:
            return r7
        L_0x0012:
            X.0tx r0 = X.C16960tx.A08
            r13 = r17
            if (r13 != r0) goto L_0x002d
            X.12X r0 = r2.A08     // Catch:{ IOException -> 0x0023 }
            X.1XH r1 = r0.A00     // Catch:{ IOException -> 0x0023 }
            java.lang.String r0 = ""
            java.io.File r1 = r1.A00(r0)     // Catch:{ IOException -> 0x0023 }
            goto L_0x003f
        L_0x0023:
            r1 = move-exception
            java.lang.String r0 = "sticker-db-storage/make temp file failed"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 0
            r15 = r7
            goto L_0x0040
        L_0x002d:
            X.0sc r1 = r2.A03
            X.0tx r0 = X.C16960tx.A05
            java.io.File r3 = r1.A02()
            if (r13 != r0) goto L_0x00a5
            java.lang.String r0 = "stickers.db.crypt1"
        L_0x003a:
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
        L_0x003f:
            r15 = r1
        L_0x0040:
            if (r1 == 0) goto L_0x0011
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0051
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L_0x0051
            r1.delete()
        L_0x0051:
            java.io.File r1 = r1.getParentFile()
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0061
            r1.mkdirs()
        L_0x0061:
            X.0tx r1 = X.C16960tx.A05
            X.0tx r0 = X.C16960tx.A00()
            java.util.List r4 = X.C40691uX.A08(r1, r0)
            java.lang.String r0 = ".crypt1"
            r4.add(r0)
            X.0sc r0 = r2.A03
            java.io.File r0 = r0.A02()
            java.lang.String r3 = "stickers.db"
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r3)
            java.util.ArrayList r0 = X.C40691uX.A07(r1, r4)
            X.C40691uX.A0D(r1, r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0089:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r1 = r4.next()
            java.io.File r1 = (java.io.File) r1
            boolean r0 = r1.equals(r15)
            if (r0 != 0) goto L_0x0089
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0089
            r1.delete()
            goto L_0x0089
        L_0x00a5:
            java.lang.String r0 = "stickers.db.crypt"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r13.version
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x003a
        L_0x00b7:
            java.lang.String r1 = "sticker-db-storage/backup/to "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12j r1 = r2.A07
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.A05
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r0.writeLock()
            r1.A03()
            r1.close()
            r5.lock()
            X.12V r14 = r2.A0C     // Catch:{ Exception -> 0x0121 }
            X.0sK r6 = r2.A00     // Catch:{ Exception -> 0x0121 }
            X.0xG r10 = r2.A06     // Catch:{ Exception -> 0x0121 }
            X.0sd r8 = r2.A02     // Catch:{ Exception -> 0x0121 }
            X.0u0 r12 = r2.A0B     // Catch:{ Exception -> 0x0121 }
            X.12X r11 = r2.A08     // Catch:{ Exception -> 0x0121 }
            X.1uz r1 = X.C40951ux.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0121 }
            X.0tz r0 = r2.A05     // Catch:{ Exception -> 0x0121 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0121 }
            X.5Uj r4 = r1.A02(r0)     // Catch:{ Exception -> 0x0121 }
            if (r4 == 0) goto L_0x0128
            java.io.File r0 = r0.getDatabasePath(r3)     // Catch:{ all -> 0x011c }
            r4.AiC(r0)     // Catch:{ all -> 0x011c }
            X.01Z r0 = r2.A01     // Catch:{ all -> 0x011c }
            X.0sb r0 = r0.A00     // Catch:{ all -> 0x011c }
            java.io.File r0 = r0.A0B()     // Catch:{ all -> 0x011c }
            java.io.File[] r3 = r0.listFiles()     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x0115
            int r2 = r3.length     // Catch:{ all -> 0x011c }
            r1 = 0
        L_0x010b:
            if (r1 >= r2) goto L_0x0115
            r0 = r3[r1]     // Catch:{ all -> 0x011c }
            r4.AiC(r0)     // Catch:{ all -> 0x011c }
            int r1 = r1 + 1
            goto L_0x010b
        L_0x0115:
            r4.close()     // Catch:{ Exception -> 0x0121 }
            r5.unlock()
            return r15
        L_0x011c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0120 }
        L_0x0120:
            throw r0     // Catch:{ Exception -> 0x0121 }
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "sticker-db-storage/backup failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x012c }
        L_0x0128:
            r5.unlock()
            return r7
        L_0x012c:
            r0 = move-exception
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16280sl.A00(X.0tx):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r14 == null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A01(java.io.File r18) {
        /*
            r17 = this;
            r2 = r17
            monitor-enter(r2)
            X.12j r1 = r2.A07     // Catch:{ all -> 0x0076 }
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.A05     // Catch:{ all -> 0x0076 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r0.writeLock()     // Catch:{ all -> 0x0076 }
            r6.lock()     // Catch:{ all -> 0x0076 }
            r1.close()     // Catch:{ all -> 0x0071 }
            r1.A04()     // Catch:{ all -> 0x0071 }
            X.0tz r0 = r2.A05     // Catch:{ all -> 0x0071 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "stickers.db"
            java.io.File r5 = r0.getDatabasePath(r1)     // Catch:{ all -> 0x0071 }
            X.01Z r0 = r2.A01     // Catch:{ all -> 0x0071 }
            X.0sb r0 = r0.A00     // Catch:{ all -> 0x0071 }
            java.io.File r4 = r0.A0B()     // Catch:{ all -> 0x0071 }
            r3 = 0
            r16 = r18
            java.lang.String r0 = r16.getName()     // Catch:{ Exception -> 0x0065 }
            int r1 = X.C40691uX.A01(r0, r1)     // Catch:{ Exception -> 0x0065 }
            if (r1 <= 0) goto L_0x005d
            X.0tx r14 = X.C16960tx.A05     // Catch:{ Exception -> 0x0065 }
            int r0 = r14.version     // Catch:{ Exception -> 0x0065 }
            if (r1 < r0) goto L_0x0040
            X.0tx r14 = X.C16960tx.A02(r1)     // Catch:{ Exception -> 0x0065 }
            if (r14 == 0) goto L_0x005d
        L_0x0040:
            X.12V r15 = r2.A0C     // Catch:{ Exception -> 0x0065 }
            X.0sK r7 = r2.A00     // Catch:{ Exception -> 0x0065 }
            X.0xG r11 = r2.A06     // Catch:{ Exception -> 0x0065 }
            X.0sd r9 = r2.A02     // Catch:{ Exception -> 0x0065 }
            X.12W r10 = r2.A04     // Catch:{ Exception -> 0x0065 }
            X.0u0 r13 = r2.A0B     // Catch:{ Exception -> 0x0065 }
            X.12X r12 = r2.A08     // Catch:{ Exception -> 0x0065 }
            r8 = 0
            X.1uz r1 = X.C40951ux.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0065 }
            X.4v2 r0 = new X.4v2     // Catch:{ Exception -> 0x0065 }
            r0.<init>(r5, r4)     // Catch:{ Exception -> 0x0065 }
            boolean r0 = r1.A05(r0, r3)     // Catch:{ Exception -> 0x0065 }
            goto L_0x0060
        L_0x005d:
            X.0tx r14 = X.C16960tx.A08     // Catch:{ Exception -> 0x0065 }
            goto L_0x0040
        L_0x0060:
            r6.unlock()     // Catch:{ all -> 0x0076 }
            monitor-exit(r2)
            return r0
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "sticker-db-storage/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0071 }
            r6.unlock()     // Catch:{ all -> 0x0076 }
            monitor-exit(r2)
            return r3
        L_0x0071:
            r0 = move-exception
            r6.unlock()     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16280sl.A01(java.io.File):boolean");
    }

    public boolean A5J() {
        return A00(C40691uX.A06(this.A02)) != null;
    }

    public String AA3() {
        return "stickers-db";
    }

    public synchronized boolean Aca(Context context) {
        List A082 = C40691uX.A08(C16960tx.A05, C16960tx.A00());
        A082.add(".crypt1");
        File file = new File(this.A03.A02(), "stickers.db");
        ArrayList A072 = C40691uX.A07(file, A082);
        C40691uX.A0D(file, A072);
        if (A072.isEmpty()) {
            return false;
        }
        return A01((File) A072.get(0));
    }
}
