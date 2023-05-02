package X;

import android.os.ConditionVariable;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.NativeMediaHandler;
import com.whatsapp.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0yC  reason: invalid class name and case insensitive filesystem */
public class C19290yC {
    public boolean A00;
    public final C16180sb A01;
    public final C14870pt A02;
    public final AnonymousClass12W A03;
    public final C16440t3 A04;
    public final C210912t A05;
    public final AnonymousClass1HV A06;

    public C19290yC(C16180sb r1, C14870pt r2, AnonymousClass12W r3, C16440t3 r4, C210912t r5, AnonymousClass1HV r6) {
        this.A04 = r4;
        this.A02 = r2;
        this.A01 = r1;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
    }

    public final void A00() {
        if (this.A00) {
            AnonymousClass1HV r3 = this.A06;
            if (r3.A04 == null) {
                synchronized (r3) {
                    if (r3.A04 == null) {
                        r3.A04 = new AnonymousClass2IS(r3.A00.A00(), r3.A02);
                    }
                }
            }
            AnonymousClass2IS r32 = r3.A04;
            Lock lock = r32.A03;
            lock.lock();
            if (!r32.A00) {
                lock.unlock();
                r32.A02.Acl(new RunnableRunnableShape9S0100000_I0_8(r32, 14));
                return;
            }
            lock.unlock();
        }
    }

    public void A01(boolean z2, boolean z3) {
        AnonymousClass12W r3 = this.A03;
        AnonymousClass01D r1 = r3.A06;
        if (!((C40751ud) r1.get()).A00) {
            if (!((C40751ud) r1.get()).A01) {
                if (z2) {
                    this.A01.A0Q();
                }
                NativeMediaHandler.initFileHandlingCallbacks(this.A01.A01);
                if (!this.A00) {
                    this.A00 = true;
                    Log.i("media-state-manager/refresh-media-state/writable-media");
                    if (!z3) {
                        A00();
                    }
                }
            }
            C210912t r5 = this.A05;
            if (r5.A02(r5.A0L.A00)) {
                AnonymousClass2GY r4 = new AnonymousClass2GY();
                r4.A04 = Long.valueOf(System.currentTimeMillis());
                r4.A03 = 2;
                r5.A01(new AnonymousClass2GZ((ConditionVariable) null, r5, r4), -1);
            }
            this.A02.Acq(new RunnableRunnableShape10S0100000_I0_9((Object) r3, 29));
        }
    }
}
