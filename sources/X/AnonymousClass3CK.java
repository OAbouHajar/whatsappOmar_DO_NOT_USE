package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3CK  reason: invalid class name */
public final class AnonymousClass3CK implements Handler.Callback {
    public boolean A00 = false;
    public final Handler A01;
    public final C108425Nx A02;
    public final Object A03 = C13690nt.A0Y();
    public final ArrayList A04 = AnonymousClass000.A0u();
    public final ArrayList A05 = AnonymousClass000.A0u();
    public final ArrayList A06 = AnonymousClass000.A0u();
    public final AtomicInteger A07 = new AtomicInteger(0);
    public volatile boolean A08 = false;

    public AnonymousClass3CK(Looper looper, C108425Nx r4) {
        this.A02 = r4;
        this.A01 = new AnonymousClass3M2(looper, this);
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            C15660rd r2 = (C15660rd) message.obj;
            synchronized (this.A03) {
                if (this.A08 && this.A02.isConnected() && this.A05.contains(r2)) {
                    r2.onConnected((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder A0g = C13690nt.A0g(45);
        A0g.append("Don't know how to handle message: ");
        A0g.append(i2);
        Log.wtf("GmsClientEvents", A0g.toString(), new Exception());
        return false;
    }
}
