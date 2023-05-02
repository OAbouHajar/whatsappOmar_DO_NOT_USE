package X;

import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Hi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63343Hi implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C30211bx A01;
    public final /* synthetic */ C94434ku A02;
    public final /* synthetic */ File A03;

    public /* synthetic */ C63343Hi(C30211bx r1, C94434ku r2, File file, double d2) {
        this.A02 = r2;
        this.A03 = file;
        this.A00 = d2;
        this.A01 = r1;
    }

    public final void run() {
        C94434ku r5 = this.A02;
        File file = this.A03;
        double d2 = this.A00;
        C30211bx r4 = this.A01;
        if (d2 == 0.0d) {
            d2 = 43.0d;
        }
        List<Number> A022 = AnonymousClass1ZO.A02(file, (int) d2);
        ArrayList A0w = AnonymousClass000.A0w(A022);
        for (Number byteValue : A022) {
            A0w.add(Float.valueOf(((float) byteValue.byteValue()) / 100.0f));
        }
        r5.A02.A0E.A0K(new RunnableRunnableShape3S0300000_I1(r5, A0w, r4, 41));
    }
}
