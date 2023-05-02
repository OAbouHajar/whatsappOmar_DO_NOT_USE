package X;

import android.os.CancellationSignal;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0xI  reason: invalid class name and case insensitive filesystem */
public class C18810xI {
    public final C16040sK A00;
    public final C16600tK A01;
    public final C18800xH A02;
    public final C16440t3 A03;
    public final C18780xF A04;
    public final C18790xG A05;

    public C18810xI(C16040sK r1, C16600tK r2, C18800xH r3, C16440t3 r4, C18780xF r5, C18790xG r6) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static void A00(CancellationSignal cancellationSignal, CountDownLatch countDownLatch) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + AnonymousClass1NO.A0L;
        while (true) {
            cancellationSignal.throwIfCanceled();
            if (countDownLatch.getCount() != 0 && SystemClock.elapsedRealtime() <= elapsedRealtime) {
                countDownLatch.await(500, TimeUnit.MILLISECONDS);
            } else {
                return;
            }
        }
    }

    public C37881pt A01(CancellationSignal cancellationSignal, String str, String str2, String str3) {
        byte[] bArr;
        C16040sK r12 = this.A00;
        r12.A0B();
        AnonymousClass1ZT r11 = r12.A05;
        if (r11 != null) {
            byte[] decode = Base64.decode(str2, 2);
            byte[] decode2 = Base64.decode(str3, 2);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            String str4 = str;
            this.A02.A00(new RunnableRunnableShape6S0100000_I0_5(countDownLatch, 33), str4, decode2, decode);
            try {
                A00(cancellationSignal, countDownLatch);
                if (countDownLatch.getCount() <= 0) {
                    r12.A0B();
                    AnonymousClass1ZT r122 = r12.A05;
                    if (r122 == null) {
                        throw new AnonymousClass40S(301, "User was logged out while waiting for encryption key.");
                    } else if (r122.equals(r11)) {
                        C18790xG r0 = this.A05;
                        C40671uV r1 = (C40671uV) r0.A01.A00.get(new C40681uW(str4, decode2));
                        if (r1 != null && Arrays.equals(r1.A01, decode) && (bArr = r1.A02) != null) {
                            return new C37881pt(r122, str4, Base64.encodeToString(decode, 2), Base64.encodeToString(decode2, 2), Base64.encodeToString(bArr, 2), System.currentTimeMillis());
                        }
                        throw new C76983v2(101, "Key not found.");
                    } else {
                        throw new AnonymousClass40S(301, "User changed while waiting for encryption key.");
                    }
                } else if (!this.A01.A08()) {
                    throw new C76983v2(102, "Not connected to server, cannot fetch keys.");
                } else {
                    throw new C76983v2(103, "Failed to fetch keys, timed out.");
                }
            } catch (InterruptedException e2) {
                throw new C76983v2("Failed to fetch keys, interrupted.", (Throwable) e2);
            }
        } else {
            throw new AnonymousClass40S(301, "Cannot fetch encryption key when user is not logged in.");
        }
    }
}
