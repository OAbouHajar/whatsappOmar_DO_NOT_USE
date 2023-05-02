package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* renamed from: X.46C  reason: invalid class name */
public final class AnonymousClass46C {
    public static Object A00(Handler handler, Object obj, Callable callable) {
        if (Thread.currentThread() == handler.getLooper().getThread()) {
            try {
                return callable.call();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            Exchanger exchanger = new Exchanger();
            if (!handler.post(new RunnableRunnableShape13S0200000_I1_1(exchanger, 18, callable))) {
                return obj;
            }
            try {
                return exchanger.exchange((Object) null);
            } catch (InterruptedException e3) {
                throw new RuntimeException(e3);
            }
        }
    }
}
