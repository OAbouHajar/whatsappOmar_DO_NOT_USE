package X;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.4n8  reason: invalid class name and case insensitive filesystem */
public class C95714n8 implements AnonymousClass5NW {
    public final Executor A00;
    public final Executor A01;
    public final Executor A02 = Executors.newFixedThreadPool(2, new AnonymousClass58R("FrescoIoBoundExecutor"));
    public final Executor A03;

    public C95714n8(int i2) {
        this.A01 = Executors.newFixedThreadPool(i2, new AnonymousClass58R("FrescoDecodeExecutor"));
        this.A00 = Executors.newFixedThreadPool(i2, new AnonymousClass58R("FrescoBackgroundExecutor"));
        this.A03 = Executors.newFixedThreadPool(1, new AnonymousClass58R("FrescoLightWeightBackgroundExecutor"));
    }

    public Executor A9C() {
        return this.A01;
    }
}
