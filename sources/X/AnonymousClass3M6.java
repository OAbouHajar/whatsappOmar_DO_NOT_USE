package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.3M6  reason: invalid class name */
public class AnonymousClass3M6 extends ResultReceiver {
    public final WeakReference A00;
    public final WeakReference A01;

    public AnonymousClass3M6(Handler handler, Runnable runnable, Set set) {
        super(handler);
        set.add(runnable);
        this.A00 = C13690nt.A0h(runnable);
        this.A01 = C13690nt.A0h(set);
    }

    public void onReceiveResult(int i2, Bundle bundle) {
        Runnable runnable = (Runnable) this.A00.get();
        if (runnable != null) {
            runnable.run();
            Set set = (Set) this.A01.get();
            if (set != null) {
                set.remove(runnable);
            }
        }
    }
}
