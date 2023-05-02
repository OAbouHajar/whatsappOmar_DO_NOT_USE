package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.5wa  reason: invalid class name and case insensitive filesystem */
public class C119125wa {
    public static C119125wa A06;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Handler A04 = new Handler(Looper.getMainLooper(), new AnonymousClass5yW(this));
    public final C118855vM A05 = new C118855vM();

    public static synchronized C119125wa A00() {
        C119125wa r0;
        synchronized (C119125wa.class) {
            r0 = A06;
            if (r0 == null) {
                r0 = new C119125wa();
                A06 = r0;
            }
        }
        return r0;
    }

    public void A01() {
        long j2 = this.A01;
        if (j2 == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A02(5, this.A00);
            return;
        }
        A02(3, j2);
        this.A01 = SystemClock.elapsedRealtime();
    }

    public final void A02(int i2, long j2) {
        if (!this.A05.A00.isEmpty()) {
            Handler handler = this.A04;
            Message obtain = Message.obtain(handler, i2);
            obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j2);
            handler.sendMessage(obtain);
        }
    }
}
