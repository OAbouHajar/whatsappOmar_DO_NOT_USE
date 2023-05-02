package X;

import java.util.concurrent.Callable;

/* renamed from: X.57v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1050057v implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass2Qx A01;

    public /* synthetic */ C1050057v(AnonymousClass2Qx r1, float f2) {
        this.A01 = r1;
        this.A00 = f2;
    }

    public final Object call() {
        int i2;
        AnonymousClass2Qx r2 = this.A01;
        float f2 = this.A00;
        if (!r2.A0E.get()) {
            i2 = -6;
        } else {
            r2.A0C.setCornerRadius(f2);
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }
}
