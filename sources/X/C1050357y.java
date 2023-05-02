package X;

import java.util.concurrent.Callable;

/* renamed from: X.57y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1050357y implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass53K A01;

    public /* synthetic */ C1050357y(AnonymousClass53K r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final Object call() {
        int i2;
        AnonymousClass53K r2 = this.A01;
        int i3 = this.A00;
        C90194dg r0 = r2.A03;
        if (r0 == null || !r0.A0B()) {
            i2 = -6;
        } else {
            r2.A08.setScaleType(i3);
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }
}
