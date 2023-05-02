package X;

import android.os.SystemClock;

/* renamed from: X.059  reason: invalid class name */
public class AnonymousClass059 extends C004902d {
    public /* bridge */ /* synthetic */ C005102f A01() {
        return new AnonymousClass04X();
    }

    public /* bridge */ /* synthetic */ boolean A02(C005102f r3) {
        AnonymousClass04X r32 = (AnonymousClass04X) r3;
        if (r32 != null) {
            r32.realtimeMs = SystemClock.elapsedRealtime();
            r32.uptimeMs = SystemClock.uptimeMillis();
            return true;
        }
        throw new IllegalArgumentException("Null value passed to getSnapshot!");
    }
}
