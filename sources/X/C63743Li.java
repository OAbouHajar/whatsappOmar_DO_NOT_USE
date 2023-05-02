package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;

/* renamed from: X.3Li  reason: invalid class name and case insensitive filesystem */
public class C63743Li extends Handler {
    public final /* synthetic */ SystemCounterThread A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63743Li(Looper looper, SystemCounterThread systemCounterThread) {
        super(looper);
        this.A00 = systemCounterThread;
    }

    public void handleMessage(Message message) {
        SystemCounterThread systemCounterThread = this.A00;
        int i2 = message.what;
        int i3 = message.arg1;
        synchronized (systemCounterThread) {
            try {
                if (systemCounterThread.mEnabled) {
                    if (i2 == 1) {
                        systemCounterThread.mSystemCounterLogger.A00();
                        systemCounterThread.logCounters();
                    } else if (i2 == 2) {
                        systemCounterThread.logHighFrequencyThreadCounters();
                    } else if (i2 == 3) {
                        systemCounterThread.logExpensiveCounters();
                    } else {
                        th = AnonymousClass000.A0T("Unknown message type");
                        throw th;
                    }
                    systemCounterThread.mHandler.sendMessageDelayed(systemCounterThread.mHandler.obtainMessage(i2, i3, 0), (long) i3);
                }
            } catch (Throwable th) {
                th = th;
            }
        }
    }
}
