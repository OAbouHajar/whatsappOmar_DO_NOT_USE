package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.4ZU  reason: invalid class name */
public class AnonymousClass4ZU {
    public final C12890l8 A00;
    public final ExecutorService A01 = Executors.newFixedThreadPool(3);

    public AnonymousClass4ZU() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A00 = realtimeSinceBootClock;
    }

    public AnonymousClass4ZU(int i2) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A00 = realtimeSinceBootClock;
    }
}
