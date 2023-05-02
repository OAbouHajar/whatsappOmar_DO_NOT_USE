package X;

import android.app.Activity;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0cj  reason: invalid class name and case insensitive filesystem */
public final class C07930cj implements C12560kb {
    public final C12560kb A00;
    public final WeakHashMap A01 = new WeakHashMap();
    public final ReentrantLock A02 = new ReentrantLock();

    public C07930cj(C12560kb r2) {
        this.A00 = r2;
    }

    public void AZo(Activity activity, C05370Qr r5) {
        C18450wi.A0H(activity, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            WeakHashMap weakHashMap = this.A01;
            if (!C18450wi.A0R(r5, (C05370Qr) weakHashMap.get(activity))) {
                weakHashMap.put(activity, r5);
                reentrantLock.unlock();
                this.A00.AZo(activity, r5);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
