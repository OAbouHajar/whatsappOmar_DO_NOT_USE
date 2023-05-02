package X;

import java.util.concurrent.Callable;

/* renamed from: X.588  reason: invalid class name */
public final /* synthetic */ class AnonymousClass588 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass53K A02;
    public final /* synthetic */ AnonymousClass4V1 A03;

    public /* synthetic */ AnonymousClass588(AnonymousClass53K r1, AnonymousClass4V1 r2, int i2, int i3) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final Object call() {
        short s2;
        AnonymousClass53K r5 = this.A02;
        AnonymousClass4V1 r6 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        C90194dg r0 = r5.A03;
        if (r0 == null || !r0.A0B()) {
            s2 = -6;
        } else {
            Object A012 = r5.A01();
            if (r5.A0A && ((r5.A03.A04() != r5.A01 || r5.A03.A03() != r5.A00) && (A012 == null || !r5.A07(A012)))) {
                s2 = -5;
            } else if (r6.A01(r5.A08, i2, i3)) {
                C90194dg r02 = r5.A03;
                AnonymousClass00B.A06(r02);
                s2 = C90194dg.A01(r02);
            } else {
                s2 = -7;
            }
        }
        return Integer.valueOf(s2);
    }
}
