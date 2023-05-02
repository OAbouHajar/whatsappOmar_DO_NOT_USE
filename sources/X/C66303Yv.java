package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3Yv  reason: invalid class name and case insensitive filesystem */
public final class C66303Yv extends AnonymousClass3M2 {
    public final /* synthetic */ C57912sB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66303Yv(Looper looper, C57912sB r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            C57912sB r2 = this.A00;
            Lock lock = r2.A0J;
            lock.lock();
            try {
                if (r2.A0B()) {
                    r2.A0A();
                }
            } finally {
                lock.unlock();
            }
        } else if (i2 != 2) {
            Log.w("GoogleApiClientImpl", C13680ns.A0i("Unknown message id: ", C13690nt.A0g(31), i2));
        } else {
            C57912sB.A00(this.A00);
        }
    }
}
