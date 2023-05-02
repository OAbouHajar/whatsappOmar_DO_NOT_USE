package X;

import java.util.concurrent.Callable;

/* renamed from: X.58B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass58B implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ AnonymousClass53K A06;

    public /* synthetic */ AnonymousClass58B(AnonymousClass53K r1, int i2, int i3, int i4, int i5, int i6, long j2) {
        this.A06 = r1;
        this.A05 = j2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A04 = i6;
    }

    public final Object call() {
        short s2;
        AnonymousClass53K r2 = this.A06;
        long j2 = this.A05;
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A02;
        int i5 = this.A03;
        int i6 = this.A04;
        C90194dg r0 = r2.A03;
        if (r0 == null || !r0.A0B()) {
            s2 = -6;
        } else {
            Object A012 = r2.A01();
            if (!r2.A0A || ((r2.A03.A04() == r2.A01 && r2.A03.A03() == r2.A00) || (A012 != null && r2.A07(A012)))) {
                r2.A08.renderNativeFrame(j2, i2, i3, i4, i5, i6);
                C90194dg r02 = r2.A03;
                AnonymousClass00B.A06(r02);
                s2 = C90194dg.A01(r02);
            } else {
                s2 = -5;
            }
        }
        return Integer.valueOf(s2);
    }
}
