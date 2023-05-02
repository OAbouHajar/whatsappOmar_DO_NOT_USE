package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5vT  reason: invalid class name */
public class AnonymousClass5vT {
    public long A00 = 5000;
    public AnonymousClass68B A01;
    public Condition A02;
    public final ReentrantLock A03 = new ReentrantLock();

    public void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.await(this.A00, TimeUnit.MILLISECONDS);
            }
            if (this.A02 != null) {
                this.A02 = null;
                AnonymousClass68B r0 = this.A01;
                if (r0 != null) {
                    r0.AYu();
                }
            }
            reentrantLock.unlock();
        } catch (InterruptedException e2) {
            throw new AnonymousClass67O("Operation blocker interrupted. ", e2);
        } catch (Throwable th) {
            if (this.A02 != null) {
                this.A02 = null;
                AnonymousClass68B r02 = this.A01;
                if (r02 != null) {
                    r02.AYu();
                }
            }
            reentrantLock.unlock();
            throw th;
        }
    }

    public void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public void A02(long j2) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 == null) {
            this.A02 = reentrantLock.newCondition();
            if (j2 <= 0) {
                j2 = 5000;
            }
            this.A00 = j2;
            reentrantLock.unlock();
            return;
        }
        throw AnonymousClass000.A0V("There is already a block condition being used.");
    }
}
