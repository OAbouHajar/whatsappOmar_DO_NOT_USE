package X;

import java.util.concurrent.Callable;

/* renamed from: X.57w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1050157w implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2Qx A01;

    public /* synthetic */ C1050157w(AnonymousClass2Qx r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final Object call() {
        int i2;
        AnonymousClass2Qx r2 = this.A01;
        int i3 = this.A00;
        if (!r2.A0E.get()) {
            i2 = -6;
        } else {
            r2.A0C.setScaleType(i3);
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }
}
