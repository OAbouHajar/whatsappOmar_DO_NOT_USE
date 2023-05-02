package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1U7  reason: invalid class name */
public class AnonymousClass1U7 {
    public final long A00;
    public final C16490t9 A01;
    public final AnonymousClass00F A02;
    public final String A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);

    public AnonymousClass1U7(C16490t9 r3, AnonymousClass00F r4, String str) {
        this.A01 = r3;
        this.A03 = str;
        this.A02 = r4;
        this.A00 = SystemClock.elapsedRealtime();
    }

    public void A00() {
        if (this.A04.compareAndSet(false, true)) {
            String str = this.A03;
            C35821mY r2 = new C35821mY();
            r2.A00 = Long.valueOf(SystemClock.elapsedRealtime() - this.A00);
            r2.A01 = str;
            AnonymousClass00F r1 = this.A02;
            C16490t9 r0 = this.A01;
            if (r1 == null) {
                r0.A06(r2);
            } else {
                r0.A0A(r2, r1);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("PerfTimer(");
            sb.append(this.A03);
            sb.append(") already stopped");
            AnonymousClass00B.A0B(sb.toString(), false);
        }
    }
}
