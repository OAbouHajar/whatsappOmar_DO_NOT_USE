package X;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0cm  reason: invalid class name and case insensitive filesystem */
public final class C07960cm implements C13100lT {
    public final WindowLayoutComponent A00;
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();
    public final ReentrantLock A03 = new ReentrantLock();

    public C07960cm(WindowLayoutComponent windowLayoutComponent) {
        this.A00 = windowLayoutComponent;
    }

    public void Abc(Activity activity, AnonymousClass04N r6, Executor executor) {
        C18450wi.A0H(activity, 0);
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Map map = this.A01;
            C10950hx r0 = (C10950hx) map.get(activity);
            if (r0 == null) {
                C10950hx r1 = new C10950hx(activity);
                map.put(activity, r1);
                this.A02.put(r6, activity);
                r1.A00(r6);
                this.A00.addWindowLayoutInfoListener(activity, r1);
            } else {
                r0.A00(r6);
                this.A02.put(r6, activity);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void AhC(AnonymousClass04N r4) {
        C10950hx r1;
        C18450wi.A0H(r4, 0);
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.A02.get(r4);
            if (!(activity == null || (r1 = (C10950hx) this.A01.get(activity)) == null)) {
                r1.A01(r4);
                if (r1.A03()) {
                    this.A00.removeWindowLayoutInfoListener(r1);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
