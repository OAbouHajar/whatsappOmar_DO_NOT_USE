package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;

/* renamed from: X.1Bj  reason: invalid class name and case insensitive filesystem */
public class C23281Bj {
    public final Handler A00;
    public final HandlerThread A01;
    public final SparseArray A02 = new SparseArray();
    public final C16320sq A03;

    public C23281Bj(C16320sq r4) {
        this.A03 = r4;
        HandlerThread handlerThread = new HandlerThread("light-prefs-save-scheduler", -2);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }

    public void A00(Runnable runnable, int i2, boolean z2) {
        AnonymousClass1WA r4;
        synchronized (this) {
            SparseArray sparseArray = this.A02;
            r4 = (AnonymousClass1WA) sparseArray.get(i2);
            if (r4 == null) {
                r4 = new AnonymousClass1WA(this.A03, true);
                sparseArray.put(i2, r4);
            }
        }
        if (z2) {
            this.A00.postDelayed(new RunnableRunnableShape9S0200000_I0_7(r4, 28, runnable), 100);
        } else {
            r4.execute(runnable);
        }
    }
}
