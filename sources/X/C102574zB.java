package X;

import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;

/* renamed from: X.4zB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102574zB implements C51282bN {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C41681wN A01;

    public /* synthetic */ C102574zB(C41681wN r1, long j2) {
        this.A01 = r1;
        this.A00 = j2;
    }

    public final void AUM(AnonymousClass1ZR r8, boolean z2) {
        C41681wN r6 = this.A01;
        long elapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.A00);
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        r6.A0E.A0L(new RunnableRunnableShape5S0200000_I0_3(r6, 33, r8), elapsedRealtime);
    }
}
