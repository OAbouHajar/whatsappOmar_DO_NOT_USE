package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxExecutorShape280S0100000_2_I0;
import java.util.concurrent.Executor;

/* renamed from: X.1KJ  reason: invalid class name */
public class AnonymousClass1KJ implements C14880pu {
    public final Handler A00;
    public final Executor A01;

    public AnonymousClass1KJ() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A00 = handler;
        this.A01 = new IDxExecutorShape280S0100000_2_I0(handler, 0);
    }

    public void Acq(Runnable runnable) {
        if (AnonymousClass01E.A01()) {
            runnable.run();
        } else {
            this.A00.post(runnable);
        }
    }
}
