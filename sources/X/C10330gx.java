package X;

import android.content.Intent;
import java.util.concurrent.Executor;

/* renamed from: X.0gx  reason: invalid class name and case insensitive filesystem */
public class C10330gx implements Runnable {
    public final int A00;
    public final Intent A01;
    public final C08060cy A02;

    public C10330gx(Intent intent, C08060cy r2, int i2) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i2;
    }

    public static void A00(Intent intent, C08060cy r2, Executor executor, int i2) {
        executor.execute(new C10330gx(intent, r2, i2));
    }

    public void run() {
        this.A02.A02(this.A01, this.A00);
    }
}
