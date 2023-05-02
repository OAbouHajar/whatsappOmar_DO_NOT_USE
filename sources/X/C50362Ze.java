package X;

import android.app.Activity;
import android.os.Build;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1;
import androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2Ze  reason: invalid class name and case insensitive filesystem */
public final class C50362Ze {
    public C07990cp A00;
    public List A01 = new ArrayList();
    public final C94994lo A02 = new C94994lo(this);

    public final synchronized void A00() {
        C07990cp r1 = this.A00;
        if (r1 != null) {
            C94994lo r4 = this.A02;
            C18450wi.A0H(r4, 0);
            ReentrantLock reentrantLock = r1.A02;
            reentrantLock.lock();
            try {
                Map map = r1.A01;
                C004001t r12 = (C004001t) map.get(r4);
                if (r12 != null) {
                    r12.A62((CancellationException) null);
                }
                map.remove(r4);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.A00 = null;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void A01(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && ((!Build.MODEL.startsWith("SM-F700") || i2 != 29) && activity != null)) {
            C07990cp r2 = new C07990cp(C13430m1.A00.A02(activity));
            this.A00 = r2;
            C10890hr r7 = C10890hr.A00;
            C94994lo r6 = this.A02;
            C18450wi.A0H(r6, 2);
            C107085Gi r4 = new C107085Gi(new WindowInfoTrackerImpl$windowLayoutInfo$1(activity, (C07980co) r2.A00, (AnonymousClass1UG) null));
            ReentrantLock reentrantLock = r2.A02;
            reentrantLock.lock();
            try {
                Map map = r2.A01;
                if (map.get(r6) == null) {
                    map.put(r6, AnonymousClass1UK.A00(new WindowInfoTrackerCallbackAdapter$addListener$1$1(r6, (AnonymousClass1UG) null, r4), AnonymousClass485.A00(new C11520iu(r7))));
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final synchronized void A02(AnonymousClass04N r2) {
        C18450wi.A0H(r2, 0);
        this.A01.add(r2);
    }
}
