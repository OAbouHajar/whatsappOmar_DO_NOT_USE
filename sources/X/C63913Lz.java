package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.3Lz  reason: invalid class name and case insensitive filesystem */
public class C63913Lz extends Handler {
    public HandlerThread A00;
    public AnonymousClass44E A01;
    public C30811cz A02;

    public C63913Lz(HandlerThread handlerThread, AnonymousClass44E r3, C30811cz r4) {
        super(handlerThread.getLooper());
        this.A00 = handlerThread;
        this.A01 = r3;
        this.A02 = r4;
    }

    public synchronized void A00() {
        this.A00.quit();
    }

    public void handleMessage(Message message) {
        AnonymousClass44E r3 = this.A01;
        r3.A00.set(Double.doubleToRawLongBits((double) this.A02.A00()));
        sendEmptyMessageDelayed(0, (long) 50);
    }
}
