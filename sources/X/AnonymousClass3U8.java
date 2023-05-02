package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3U8  reason: invalid class name */
public class AnonymousClass3U8 extends C96104nn {
    public static final long A03;
    public static final long A04;
    public final C12890l8 A00;
    public final Set A01 = Collections.synchronizedSet(C13680ns.A0o());
    public volatile long A02 = A03;

    static {
        long millis = TimeUnit.HOURS.toMillis(4);
        A04 = millis;
        A03 = millis * -2;
    }

    public AnonymousClass3U8(C12890l8 r3, AnonymousClass5UN r4) {
        super(r4);
        this.A00 = r3;
    }
}
