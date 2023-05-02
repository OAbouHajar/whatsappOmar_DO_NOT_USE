package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4BM  reason: invalid class name */
public final class AnonymousClass4BM {
    public static C87784Yn A00 = C87784Yn.A00;
    public static final int A01;
    public static final int A02;
    public static final long A03 = TimeUnit.SECONDS.toNanos(AnonymousClass488.A00("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
    public static final long A04 = AnonymousClass488.A00("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final C83184Fr A05 = new C83184Fr(1);
    public static final C83184Fr A06 = new C83184Fr(0);

    static {
        int i2 = AnonymousClass4AD.A00;
        if (i2 < 2) {
            i2 = 2;
        }
        long j2 = (long) 1;
        A01 = (int) AnonymousClass488.A00("kotlinx.coroutines.scheduler.core.pool.size", (long) i2, j2, (long) Integer.MAX_VALUE);
        long j3 = (long) 2097150;
        A02 = (int) AnonymousClass488.A00("kotlinx.coroutines.scheduler.max.pool.size", j3, j2, j3);
    }
}
