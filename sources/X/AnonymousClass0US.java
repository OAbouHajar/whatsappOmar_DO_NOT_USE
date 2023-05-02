package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0US  reason: invalid class name */
public final class AnonymousClass0US {
    public static Executor A02;
    public static final Object A03 = new Object();
    public Executor A00;
    public final AnonymousClass0Q5 A01;

    public AnonymousClass0US(AnonymousClass0Q5 r1) {
        this.A01 = r1;
    }

    public C04800Nz A00() {
        Executor executor = this.A00;
        if (executor == null) {
            synchronized (A03) {
                if (A02 == null) {
                    A02 = Executors.newFixedThreadPool(2);
                }
            }
            executor = A02;
            this.A00 = executor;
        }
        return new C04800Nz(this.A01, executor);
    }
}
