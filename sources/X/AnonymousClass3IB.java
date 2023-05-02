package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3IB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IB implements Runnable {
    public final /* synthetic */ AnonymousClass38R A00;
    public final /* synthetic */ C61743Ad A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CountDownLatch A05;
    public final /* synthetic */ AtomicBoolean A06;
    public final /* synthetic */ AtomicReference A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ AnonymousClass3IB(AnonymousClass38R r1, C61743Ad r2, File file, String str, List list, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference, boolean z2) {
        this.A00 = r1;
        this.A06 = atomicBoolean;
        this.A08 = z2;
        this.A02 = file;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = list;
        this.A07 = atomicReference;
        this.A05 = countDownLatch;
    }

    public final void run() {
        AnonymousClass38R r8 = this.A00;
        AtomicBoolean atomicBoolean = this.A06;
        boolean z2 = this.A08;
        File file = this.A02;
        C61743Ad r11 = this.A01;
        String str = this.A03;
        List list = this.A04;
        AtomicReference atomicReference = this.A07;
        CountDownLatch countDownLatch = this.A05;
        try {
            if (!r8.A07.A05()) {
                atomicBoolean.set(false);
            } else if (z2 || !file.exists() || file.length() <= 0) {
                int A002 = C62173By.A00(r11, r8.A09, r8.A0A, file.getAbsolutePath());
                if (A002 != 1) {
                    if (A002 == 2) {
                        Log.e(String.format("restore>MediaRestoreAction/get-files-to-be-downloaded received '%s' from gdrive file map which does not exist.", new Object[]{str}));
                    } else if (A002 == 3) {
                        AnonymousClass2GU r1 = r8.A0F;
                        AnonymousClass00B.A06(r1);
                        r1.A01 = Boolean.FALSE;
                    }
                }
                list.add(str);
            }
        } catch (C71153iZ e2) {
            atomicReference.set(e2);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
