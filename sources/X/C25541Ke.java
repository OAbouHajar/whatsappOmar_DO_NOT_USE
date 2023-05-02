package X;

import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1Ke  reason: invalid class name and case insensitive filesystem */
public final class C25541Ke extends C19970zI {
    public final C16300so A00;
    public final C14870pt A01;
    public final C17180uf A02;
    public final C17210ui A03;
    public final C25511Kb A04;
    public final C18260wP A05;
    public final ReadWriteLock A06 = new ReentrantReadWriteLock();
    public volatile boolean A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25541Ke(X.C16300so r9, X.C14870pt r10, X.C17130ua r11, X.C17180uf r12, X.C17210ui r13, X.C25511Kb r14, X.C18260wP r15, X.C16980tz r16, X.C19950zG r17, X.C17670vS r18, X.C16320sq r19) {
        /*
            r8 = this;
            r0 = 1
            r3 = r16
            X.C18450wi.A0H(r3, r0)
            r0 = 2
            r6 = r19
            X.C18450wi.A0H(r6, r0)
            r0 = 3
            r2 = r11
            X.C18450wi.A0H(r11, r0)
            r0 = 4
            r4 = r17
            X.C18450wi.A0H(r4, r0)
            r0 = 5
            r5 = r18
            X.C18450wi.A0H(r5, r0)
            r0 = 6
            X.C18450wi.A0H(r10, r0)
            r0 = 7
            X.C18450wi.A0H(r9, r0)
            r0 = 8
            X.C18450wi.A0H(r12, r0)
            r0 = 9
            X.C18450wi.A0H(r14, r0)
            r0 = 10
            X.C18450wi.A0H(r15, r0)
            r0 = 11
            X.C18450wi.A0H(r13, r0)
            r0 = 19
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A01 = r10
            r8.A00 = r9
            r8.A02 = r12
            r8.A04 = r14
            r8.A05 = r15
            r8.A03 = r13
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r8.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25541Ke.<init>(X.0so, X.0pt, X.0ua, X.0uf, X.0ui, X.1Kb, X.0wP, X.0tz, X.0zG, X.0vS, X.0sq):void");
    }

    public File A00(String str) {
        return A0A();
    }

    public final File A0A() {
        File file = new File(this.A03.A00.getFilesDir(), "biz_directory");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "directory_client_value_model_config");
    }

    public final String A0B() {
        if (!A0A().exists()) {
            return null;
        }
        ReadWriteLock readWriteLock = this.A06;
        readWriteLock.readLock().lock();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(A0A()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            } else {
                bufferedReader.close();
                readWriteLock.readLock().unlock();
                return sb.toString();
            }
        }
    }

    public final void A0C(AnonymousClass262 r12, String str) {
        String A0B;
        String str2 = str;
        C18450wi.A0H(str, 0);
        if (!str.equals(this.A04.A02.A00().getString("value_model_config_path", (String) null)) || (A0B = A0B()) == null) {
            if (!this.A05.A0A()) {
                Log.e("DirectoryValueModelConfigDownloader/fetchConfigIfNeeded/Config fetch failed due to no internet!");
            } else {
                C17180uf r1 = this.A02;
                if (!r1.A0B() || !r1.A02.A0E(C16620tM.A02, 3001)) {
                    super.A03(new C101954yA(r12, this), (C108005Mh) null, (Object) null, str2, (String) null);
                    return;
                } else if (!this.A07) {
                    this.A07 = true;
                    this.A06.Ack(new AnonymousClass364(r12, this, str), new Void[0]);
                    return;
                }
            }
            if (r12 != null) {
                r12.A00();
            }
        } else if (r12 != null) {
            r12.A01.A05.Acl(new RunnableRunnableShape0S1200000_I0(r12.A00, A0B, r12, 16));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C41191vO.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(java.io.InputStream r6) {
        /*
            r5 = this;
            r4 = 1
            java.util.concurrent.locks.ReadWriteLock r3 = r5.A06
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.lock()
            java.io.File r0 = r5.A0A()
            X.AnonymousClass1XI.A0N(r0)
            java.io.File r0 = r5.A0A()     // Catch:{ IOException -> 0x002f }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x002f }
            X.AnonymousClass1XI.A0H(r6, r2)     // Catch:{ all -> 0x0028 }
            r2.close()     // Catch:{ IOException -> 0x002f }
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            return r4
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.C41191vO.A00(r2, r1)     // Catch:{ IOException -> 0x002f }
            throw r0     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r0 = move-exception
            java.lang.String r2 = "DirectoryValueModelConfigDownloader/storeAssets/Failed!"
            com.whatsapp.util.Log.e(r2, r0)
            X.0so r1 = r5.A00
            java.lang.String r0 = r0.getMessage()
            r1.AcB(r2, r0, r4)
            java.util.concurrent.locks.Lock r0 = r3.writeLock()
            r0.unlock()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25541Ke.A0D(java.io.InputStream):boolean");
    }
}
