package X;

import android.util.Pair;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.1kE  reason: invalid class name and case insensitive filesystem */
public class C34421kE implements Future {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final CountDownLatch A03 = new CountDownLatch(1);

    public static void A00(Pair pair, C34421kE r2, Object obj) {
        r2.A02(new AnonymousClass4HB(pair, obj));
    }

    public void A01(Exception exc) {
        this.A01 = null;
        this.A02 = false;
        this.A00 = exc;
        this.A03.countDown();
    }

    public void A02(Object obj) {
        this.A01 = obj;
        this.A02 = true;
        this.A03.countDown();
    }

    public boolean cancel(boolean z2) {
        return false;
    }

    public Object get() {
        this.A03.await();
        if (this.A02) {
            return this.A01;
        }
        throw new ExecutionException(this.A00);
    }

    public Object get(long j2, TimeUnit timeUnit) {
        if (!this.A03.await(j2, timeUnit)) {
            throw new TimeoutException();
        } else if (this.A02) {
            return this.A01;
        } else {
            throw new ExecutionException(this.A00);
        }
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return this.A03.getCount() == 0;
    }
}
