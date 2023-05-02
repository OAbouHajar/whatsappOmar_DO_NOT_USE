package X;

import java.util.concurrent.Callable;

/* renamed from: X.57x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1050257x implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass53K A01;

    public /* synthetic */ C1050257x(AnonymousClass53K r1, float f2) {
        this.A01 = r1;
        this.A00 = f2;
    }

    public final Object call() {
        int i2;
        AnonymousClass53K r2 = this.A01;
        float f2 = this.A00;
        C90194dg r0 = r2.A03;
        if (r0 == null || !r0.A0B()) {
            i2 = -6;
        } else {
            r2.A08.setCornerRadius(f2);
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }
}
