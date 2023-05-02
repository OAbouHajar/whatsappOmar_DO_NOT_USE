package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.0BF  reason: invalid class name */
public class AnonymousClass0BF extends Handler {
    public AnonymousClass0BF() {
        super(Looper.getMainLooper());
    }

    public void handleMessage(Message message) {
        C04780Nx r2 = (C04780Nx) message.obj;
        if (message.what == 1) {
            C10590hN r4 = r2.A00;
            Object obj = r2.A01[0];
            if (r4.A03.get()) {
                try {
                    r4.A06.A0A(r4, obj);
                } catch (Throwable th) {
                    r4.A01.countDown();
                    throw th;
                }
            } else {
                AnonymousClass0F8 r1 = r4.A06;
                if (r1.A02 != r4) {
                    r1.A0A(r4, obj);
                } else if (r1.A02) {
                    r1.A0B(obj);
                } else {
                    r1.A04 = false;
                    SystemClock.uptimeMillis();
                    r1.A02 = null;
                    r1.A04(obj);
                }
            }
            r4.A01.countDown();
            r4.A05 = C03660Jj.FINISHED;
        }
    }
}
