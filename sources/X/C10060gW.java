package X;

import java.util.Map;

/* renamed from: X.0gW  reason: invalid class name and case insensitive filesystem */
public class C10060gW implements Runnable {
    public final AnonymousClass0R5 A00;
    public final AnonymousClass0UY A01;

    public C10060gW(AnonymousClass0R5 r1, AnonymousClass0UY r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0UY r1 = this.A01;
        synchronized (r1.A01) {
            Map map = r1.A03;
            AnonymousClass0R5 r5 = this.A00;
            if (((C10060gW) map.remove(r5)) != null) {
                C12120js r3 = (C12120js) r1.A02.remove(r5);
                if (r3 != null) {
                    AnonymousClass0d5 r32 = (AnonymousClass0d5) r3;
                    C06530Wm.A00().A02(AnonymousClass0d5.A0C, AnonymousClass000.A0g("Exceeded time limits on execution for ", r5));
                    r32.A0B.execute(new C09570fj(r32));
                }
            } else {
                C06530Wm.A00().A02("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", AnonymousClass000.A1a(r5)));
            }
        }
    }
}
