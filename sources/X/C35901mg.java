package X;

import com.whatsapp.util.Log;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1mg  reason: invalid class name and case insensitive filesystem */
public class C35901mg extends ReentrantLock {
    public final /* synthetic */ C18920xT this$0;
    public final AtomicLong threadId = new AtomicLong(-1);

    public C35901mg(C18920xT r4) {
        this.this$0 = r4;
    }

    public final void A00() {
        Set<C33921jP> set;
        AtomicLong atomicLong = this.threadId;
        Thread currentThread = Thread.currentThread();
        atomicLong.compareAndSet(-1, currentThread.getId());
        C19460yT r3 = this.this$0.A00;
        if (r3 != null) {
            synchronized (r3) {
                set = r3.A00;
                if (set.size() == 0) {
                    for (C24701Gy AE6 : r3.A01) {
                        set.add(AE6.AE6());
                    }
                }
            }
            for (C33921jP r2 : set) {
                ThreadLocal threadLocal = r2.A01;
                if (threadLocal.get() != null) {
                    Object obj = threadLocal.get();
                    AnonymousClass00B.A06(obj);
                    if (((Boolean) obj).booleanValue()) {
                        StringBuilder sb = new StringBuilder("TransactionLockManager/inTransactionOnCurrentThread/transaction is in progress ");
                        sb.append(r2.A00);
                        Log.w(sb.toString());
                        if (getHoldCount() == 0 || this.threadId.get() != currentThread.getId()) {
                            Log.e("SignalLock/getLock/trying to acquire lock from a transaction");
                            this.this$0.A01.AcB("signal-lock-in-transaction", (String) null, true);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void lock() {
        A00();
        super.lock();
    }

    public boolean tryLock() {
        A00();
        return super.tryLock();
    }

    public boolean tryLock(long j2, TimeUnit timeUnit) {
        A00();
        return super.tryLock(j2, timeUnit);
    }

    public void unlock() {
        super.unlock();
        if (getHoldCount() == 0) {
            this.threadId.set(-1);
        }
    }
}
