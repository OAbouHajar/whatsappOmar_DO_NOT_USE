package X;

import java.util.concurrent.Executor;

/* renamed from: X.5GT  reason: invalid class name */
public final class AnonymousClass5GT extends AnonymousClass5GL implements Executor {
    public static final C11340ia A00;
    public static final AnonymousClass5GT A01 = new AnonymousClass5GT();

    static {
        AnonymousClass5GJ r3 = AnonymousClass5GJ.A00;
        int i2 = AnonymousClass4AD.A00;
        int i3 = 64;
        if (64 < i2) {
            i3 = i2;
        }
        A00 = r3.A02((int) AnonymousClass488.A00("kotlinx.coroutines.io.parallelism", (long) i3, (long) 1, (long) Integer.MAX_VALUE));
    }

    public C11340ia A02(int i2) {
        return AnonymousClass5GJ.A00.A02(i2);
    }

    public void A05(Runnable runnable, AnonymousClass1UM r3) {
        A00.A05(runnable, r3);
    }

    public void execute(Runnable runnable) {
        A00.A05(runnable, C1052258r.A00);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
