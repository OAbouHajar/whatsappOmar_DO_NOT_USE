package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0yd  reason: invalid class name and case insensitive filesystem */
public class C19560yd {
    public final C31081dR A00;

    public C19560yd(C16440t3 r10, C16490t9 r11, AnonymousClass17S r12, C19500yX r13) {
        C31081dR r2 = new C31081dR(r10, r11, r12, r13, "ApplicationCreatePerfTracker", 703926783);
        r2.A06.A03 = true;
        this.A00 = r2;
    }

    public void A00() {
        C31081dR r1 = this.A00;
        r1.A07("app_creation_on_create");
        r1.A0C(2);
    }

    public void A01() {
        this.A00.A08("app_creation_on_create");
    }

    public void A02(long j2) {
        C31081dR r0 = this.A00;
        r0.A08.ALJ("perf_origin", "ApplicationCreatePerfTracker", TimeUnit.NANOSECONDS, 703926783, j2);
        r0.A06(j2);
    }

    public void A03(String str) {
        this.A00.A07(str);
    }

    public void A04(String str) {
        this.A00.A08(str);
    }
}
