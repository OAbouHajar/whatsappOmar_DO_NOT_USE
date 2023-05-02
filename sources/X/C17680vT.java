package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vT  reason: invalid class name and case insensitive filesystem */
public class C17680vT {
    public AtomicInteger A00 = new AtomicInteger();
    public boolean A01 = false;
    public final C16300so A02;
    public final C14710pd A03;

    public C17680vT(C16300so r2, C14710pd r3) {
        this.A03 = r3;
        this.A02 = r2;
    }

    public synchronized void A00() {
        if (this.A00.addAndGet(1) > 15) {
            Log.i("Disable WATLS stack.");
            this.A01 = true;
        }
    }

    public synchronized boolean A01() {
        return this.A01 ? false : this.A03.A0E(C16620tM.A02, 48);
    }

    public boolean A02(Throwable th) {
        return th.getMessage() != null && th.getMessage().contains("WATLS Exception");
    }
}
