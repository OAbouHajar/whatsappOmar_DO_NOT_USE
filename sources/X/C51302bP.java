package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import java.lang.ref.WeakReference;

/* renamed from: X.2bP  reason: invalid class name and case insensitive filesystem */
public class C51302bP extends C16690tT {
    public Handler A00;
    public Runnable A01;
    public final long A02 = SystemClock.uptimeMillis();
    public final C16080sP A03;
    public final C16060sN A04;
    public final WeakReference A05;
    public final boolean A06;

    public C51302bP(C16080sP r3, C51312bQ r4, C16060sN r5, boolean z2) {
        this.A03 = r3;
        this.A05 = new WeakReference(r4);
        this.A04 = r5;
        this.A06 = z2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A03.A0K(this.A04, 1, true);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A00 = handler;
        RunnableRunnableShape0S1100000_I0 runnableRunnableShape0S1100000_I0 = new RunnableRunnableShape0S1100000_I0(30, (String) obj, this);
        this.A01 = runnableRunnableShape0S1100000_I0;
        if (this.A06) {
            handler.postAtTime(runnableRunnableShape0S1100000_I0, this.A02 + 3000);
        } else {
            runnableRunnableShape0S1100000_I0.run();
        }
    }
}
