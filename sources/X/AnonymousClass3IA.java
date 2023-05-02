package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3IA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IA implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass390 A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ CountDownLatch A07;
    public final /* synthetic */ AtomicReference A08;

    public /* synthetic */ AnonymousClass3IA(AnonymousClass390 r1, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, int i2, long j2) {
        this.A02 = r1;
        this.A03 = file;
        this.A04 = str;
        this.A00 = i2;
        this.A01 = j2;
        this.A05 = list;
        this.A06 = list2;
        this.A08 = atomicReference;
        this.A07 = countDownLatch;
    }

    public final void run() {
        AnonymousClass390 r13 = this.A02;
        File file = this.A03;
        String str = this.A04;
        int i2 = this.A00;
        long j2 = this.A01;
        List list = this.A05;
        List list2 = this.A06;
        AtomicReference atomicReference = this.A08;
        CountDownLatch countDownLatch = this.A07;
        try {
            C16190sc r14 = r13.A07;
            C16980tz r8 = r13.A0A;
            String A082 = AnonymousClass2GK.A08(r8.A00, r14, file);
            if (A082 == null) {
                Log.e(AnonymousClass000.A0e(file, "gdrive/encrypted-re-upload/collect-files-to-be-uploaded/file-upload-path-is-null/ ", AnonymousClass000.A0o()));
            } else {
                Map map = r13.A0J;
                C61743Ad r3 = (C61743Ad) map.get(A082);
                AnonymousClass2GJ r27 = r13.A05;
                if (r27.A05()) {
                    r13.A0P.incrementAndGet();
                    String absolutePath = file.getAbsolutePath();
                    C16260sj r1 = r13.A0B;
                    if (C62173By.A00(r3, r14, r1, absolutePath) != 3 || r3 == null || C62173By.A07(r3)) {
                        r13.A0N.incrementAndGet();
                        r13.A0M.addAndGet(file.length());
                        r27.A05();
                    } else {
                        Object[] A1Z = C13690nt.A1Z();
                        A1Z[0] = A082;
                        A1Z[1] = "remote-file-same-as-local";
                        String.format("gdrive/encrypted-re-upload/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", A1Z);
                        C615839m r16 = new C615839m(r13.A00, r13.A01, r13.A03, r14, r13.A08, r8, r1, file, str, A082);
                        AtomicLong atomicLong = r13.A0O;
                        if (atomicLong.get() < ((long) i2) || r13.A0L.get() < j2) {
                            list.add(r16);
                            String str2 = r3.A06;
                            if (!str2.equals(r16.A06)) {
                                list2.add(r3);
                                AnonymousClass4WW r0 = r3.A02;
                                if (r0 != null) {
                                    str2 = r0.A04;
                                }
                                map.remove(str2);
                            }
                            atomicLong.incrementAndGet();
                            r13.A0L.addAndGet(r16.A00());
                            r27.A05();
                        } else {
                            r13.A0K.set(false);
                            r27.A05();
                        }
                    }
                }
            }
        } catch (C71153iZ e2) {
            Log.e(AnonymousClass000.A0e(file, "gdrive/encrypted-re-upload/get-files-to-be-uploaded problem with a file ", AnonymousClass000.A0o()), e2);
            atomicReference.set(e2);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
