package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Se  reason: invalid class name and case insensitive filesystem */
public class C27551Se {
    public final AnonymousClass16P A00;
    public final ThreadPoolExecutor A01;

    public C27551Se(AnonymousClass16P r9, C14710pd r10) {
        this.A00 = r9;
        C16620tM r1 = C16620tM.A02;
        this.A01 = (!r10.A0E(r1, 2233) || !r10.A0E(r1, 1885)) ? null : new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass58P());
    }
}
