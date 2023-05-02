package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.2CP  reason: invalid class name */
public final class AnonymousClass2CP extends Handler {
    public final boolean A00 = C18900xR.A00();
    public final /* synthetic */ C19090xk A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2CP(Looper looper, C19090xk r3) {
        super(looper);
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        if (this.A00) {
            Log.w("xmpp/handler/unsupported");
            return;
        }
        Message message2 = message;
        int i2 = message2.arg1;
        if (i2 == 0) {
            C19090xk r4 = this.A01;
            r4.A0C = false;
            boolean z2 = message2.getData().getBoolean("should_register", false);
            r4.A06 = (AnonymousClass28H) message2.obj;
            C19090xk.A01(r4);
            if (z2) {
                C16040sK r0 = r4.A0J;
                r0.A0B();
                AnonymousClass1ZT r3 = r0.A05;
                C19440yR r1 = r4.A09;
                AnonymousClass00B.A06(r1);
                if (!r4.A0z) {
                    Log.i("xmpp/handler/registered");
                    r4.A05 = r3;
                    r4.A0A = r1;
                    r4.A0d.A00 = r1;
                    r4.A0G(true, false, false);
                    if (r4.A08 != null) {
                        r4.A0A.A01();
                    }
                    r4.A0z = true;
                } else if (r4.A0M.A02()) {
                    r4.A0G(true, false, false);
                    if (r4.A08 != null) {
                        r4.A0A.A01();
                    }
                }
            }
        } else if (i2 == 1) {
            if (message2.getData().getBoolean("should_unregister", false)) {
                this.A01.A0z = false;
            }
            C19090xk r42 = this.A01;
            Log.i("xmpp/handler/stop");
            if (r42.A10) {
                r42.A10 = false;
                synchronized (r42.A0t) {
                    AnonymousClass2CO r12 = r42.A0a;
                    if (!r12.A00) {
                        r42.A0A.A00();
                    }
                    r12.A00(true);
                }
                if (r42.A08 != null) {
                    r42.A0T.A00.unregisterReceiver(r42.A0E);
                    r42.A0h.AgN();
                    HandlerThread handlerThread = r42.A04;
                    AnonymousClass00B.A06(handlerThread);
                    handlerThread.quit();
                    try {
                        r42.A04.join(120000);
                    } catch (InterruptedException e2) {
                        Log.w("interrupted while waiting on connectivity handler thread to exit", e2);
                        Thread.currentThread().interrupt();
                    }
                    if (r42.A04.isAlive()) {
                        Log.e("xmpp/handler/stop connectivity-handler-thread still alive");
                    }
                    r42.A04 = null;
                    C19090xk.A11 = new CountDownLatch(1);
                    C19090xk.A13.set(false);
                    ((Handler) r42.A08).obtainMessage(3).sendToTarget();
                    r42.A08 = null;
                    C17190ug r02 = r42.A0e;
                    r02.A00 = null;
                    r02.A01 = null;
                } else {
                    r42.A07.quit();
                }
            }
            r42.A0C = true;
        } else if (i2 == 2) {
            Bundle data = message2.getData();
            boolean z3 = data.getBoolean("reset", false);
            boolean z4 = data.getBoolean("force", false);
            boolean z5 = data.getBoolean("force_no_ongoing_backoff", false);
            boolean z6 = data.getBoolean("check_connection", false);
            boolean z7 = data.getBoolean("notify_on_failure", false);
            String string = data.getString("ip_address");
            String string2 = data.getString("cl_sess");
            boolean z8 = data.getBoolean("fgservice", false);
            int i3 = data.getInt("connect_reason", 0);
            if (z4) {
                this.A01.A03 = 0;
            }
            if (z3) {
                this.A01.A0q.A02();
            }
            C19090xk r5 = this.A01;
            long j2 = r5.A03;
            if (j2 <= 0 || SystemClock.elapsedRealtime() >= j2) {
                C19090xk.A01(r5);
                r5.A0B(r5.A06, string2, string, i3, z4, z5, z6, z7, z8);
            }
        } else if (i2 != 3) {
            C19090xk.A01(this.A01);
        } else {
            Bundle data2 = message2.getData();
            C19090xk r13 = this.A01;
            C19090xk.A01(r13);
            if (data2.getBoolean("long_connect", false)) {
                r13.A07();
            }
        }
    }
}
