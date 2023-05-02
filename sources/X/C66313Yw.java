package X;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3Yw  reason: invalid class name and case insensitive filesystem */
public final class C66313Yw extends AnonymousClass3M2 {
    public final /* synthetic */ AnonymousClass3EC A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66313Yw(Looper looper, AnonymousClass3EC r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            C85764Pw r2 = (C85764Pw) message.obj;
            AnonymousClass3EC r0 = this.A00;
            Lock lock = r0.A0D;
            lock.lock();
            try {
                if (r0.A0E == r2.A00) {
                    if (r2 instanceof C65713Wh) {
                        C65713Wh r22 = (C65713Wh) r2;
                        C15020qC r3 = r22.A00;
                        AnonymousClass3XU r1 = r22.A01;
                        if (r3.A07(0)) {
                            C15700rh r5 = r1.A01;
                            if (r5.A01 == 0) {
                                C66003Xk r12 = r1.A02;
                                C13710nw.A01(r12);
                                r5 = r12.A02;
                                if (r5.A01 == 0) {
                                    r3.A08 = true;
                                    IAccountAccessor A002 = r12.A00();
                                    C13710nw.A01(A002);
                                    r3.A04 = A002;
                                    r3.A09 = r12.A03;
                                    r3.A0A = r12.A04;
                                } else {
                                    String valueOf = String.valueOf(r5);
                                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                                    r3.A03(r5);
                                }
                            } else {
                                if (r3.A06 && !r5.A00()) {
                                    r3.A00();
                                }
                                r3.A03(r5);
                            }
                            r3.A02();
                        }
                    } else if (r2 instanceof C65693Wf) {
                        ((C65693Wf) r2).A00.AWA(new C15700rh(16, (PendingIntent) null));
                    } else if (r2 instanceof C65703Wg) {
                        C65703Wg r23 = (C65703Wg) r2;
                        ((C15020qC) r23.A01.A00).A03(r23.A00);
                    } else {
                        ((C65683We) r2).A00.Aic(1);
                    }
                }
            } finally {
                lock.unlock();
            }
        } else if (i2 != 2) {
            Log.w("GACStateManager", C13680ns.A0i("Unknown message id: ", C13690nt.A0g(31), i2));
        } else {
            throw ((Throwable) message.obj);
        }
    }
}
