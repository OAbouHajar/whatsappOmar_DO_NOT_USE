package X;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

/* renamed from: X.0hx  reason: invalid class name and case insensitive filesystem */
public final class C10950hx implements Consumer {
    public C05370Qr A00;
    public final Activity A01;
    public final Set A02 = new LinkedHashSet();
    public final ReentrantLock A03 = new ReentrantLock();

    public C10950hx(Activity activity) {
        this.A01 = activity;
    }

    public final void A00(AnonymousClass04N r3) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            C05370Qr r0 = this.A00;
            if (r0 != null) {
                r3.accept(r0);
            }
            this.A02.add(r3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A01(AnonymousClass04N r3) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            this.A02.remove(r3);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: A02 */
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        C18450wi.A0H(windowLayoutInfo, 0);
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            this.A00 = AnonymousClass0UJ.A00(this.A01, windowLayoutInfo);
            for (AnonymousClass04N accept : this.A02) {
                accept.accept(this.A00);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean A03() {
        return this.A02.isEmpty();
    }
}
