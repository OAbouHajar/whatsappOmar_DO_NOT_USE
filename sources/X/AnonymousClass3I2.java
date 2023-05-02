package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3I2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I2 implements Runnable {
    public final /* synthetic */ C616039o A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CountDownLatch A05;
    public final /* synthetic */ AtomicReference A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass3I2(C616039o r1, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, boolean z2) {
        this.A00 = r1;
        this.A01 = file;
        this.A02 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A06 = atomicReference;
        this.A07 = z2;
        this.A05 = countDownLatch;
    }

    public final void run() {
        C616039o r3 = this.A00;
        File file = this.A01;
        String str = this.A02;
        List list = this.A03;
        List list2 = this.A04;
        AtomicReference atomicReference = this.A06;
        boolean z2 = this.A07;
        CountDownLatch countDownLatch = this.A05;
        try {
            C16190sc r13 = r3.A0N;
            C16980tz r11 = r3.A0Q;
            String A08 = AnonymousClass2GK.A08(r11.A00, r13, file);
            if (A08 == null) {
                Log.e(AnonymousClass000.A0e(file, "gdrive/backup/collect-files-to-be-uploaded/file-upload-path-is-null/ ", AnonymousClass000.A0o()));
            } else {
                Map map = r3.A0b;
                C61743Ad r7 = (C61743Ad) map.get(A08);
                AnonymousClass2GJ r25 = r3.A0J;
                if (r25.A05()) {
                    String absolutePath = file.getAbsolutePath();
                    C16260sj r14 = r3.A0R;
                    int A002 = C62173By.A00(r7, r13, r14, absolutePath);
                    if (!(A002 == 3 || A002 == 1)) {
                        Object[] A1Z = C13690nt.A1Z();
                        A1Z[0] = A08;
                        A1Z[1] = A002 != 2 ? A002 != 3 ? "remote-file-different-from-local" : "remote-file-same-as-local" : "remote-file-does-not-exist";
                        String.format("gdrive/backup/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", A1Z);
                        C615839m r132 = new C615839m(r3.A0B, r3.A0D, r3.A0H, r13, r3.A0O, r11, r14, file, str, A08);
                        list.add(r132);
                        String str2 = r132.A06;
                        map.remove(str2);
                        if (r7 != null) {
                            String str3 = r7.A06;
                            if (!str3.equals(str2)) {
                                list2.add(r7);
                                AnonymousClass4WW r0 = r7.A02;
                                if (r0 != null) {
                                    str3 = r0.A04;
                                }
                                map.remove(str3);
                            }
                        }
                    }
                    AtomicLong atomicLong = r3.A0d;
                    atomicLong.addAndGet(file.length());
                    if (r25.A05() && r3.A0F.A0c.get() && z2) {
                        AnonymousClass12M r4 = r3.A0G;
                        long j2 = atomicLong.get();
                        long j3 = r3.A05;
                        int min = j3 > 0 ? Math.min(100, (int) ((100 * j2) / j3)) : -1;
                        if (j3 <= 0) {
                            StringBuilder A0r = AnonymousClass000.A0r("GoogleBackupRestoreObservable/backup-preparation-progress ");
                            A0r.append(j2);
                            A0r.append("/");
                            A0r.append(j3);
                            C13680ns.A1V(A0r);
                        }
                        if (min != r4.A00) {
                            r4.A00 = min;
                            StringBuilder A0r2 = AnonymousClass000.A0r("GoogleBackupRestoreObservable/backup-preparation-progress/");
                            A0r2.append(min);
                            Log.i(AnonymousClass000.A0h("%", A0r2));
                            Iterator A003 = C16590tJ.A00(r4);
                            while (A003.hasNext()) {
                                ((AnonymousClass12R) A003.next()).ANP(r4.A00);
                            }
                        }
                    }
                }
            }
        } catch (C71153iZ e2) {
            Log.e(AnonymousClass000.A0e(file, "gdrive/backup/get-files-to-be-uploaded problem with a file ", AnonymousClass000.A0o()), e2);
            atomicReference.set(e2);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
