package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.56Z  reason: invalid class name */
public abstract class AnonymousClass56Z implements Runnable {
    public final /* synthetic */ C15020qC A00;

    public /* synthetic */ AnonymousClass56Z(C15020qC r1) {
        this.A00 = r1;
    }

    public abstract void A00();

    public final void run() {
        C15020qC r1 = this.A00;
        Lock lock = r1.A0K;
        lock.lock();
        try {
            if (!Thread.interrupted()) {
                A00();
            }
        } catch (RuntimeException e2) {
            C66313Yw r12 = r1.A0F.A06;
            r12.sendMessage(r12.obtainMessage(2, e2));
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
        lock.unlock();
    }
}
