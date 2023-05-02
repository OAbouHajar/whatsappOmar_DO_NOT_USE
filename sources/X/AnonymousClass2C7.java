package X;

import java.util.concurrent.Callable;

/* renamed from: X.2C7  reason: invalid class name */
public class AnonymousClass2C7 implements Callable {
    public C42591y4 A00;
    public AnonymousClass1QO A01;

    public AnonymousClass2C7(C42591y4 r1, AnonymousClass1QO r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C42591y4 r2 = this.A00;
        if (r2 == null) {
            return null;
        }
        this.A01.A00(r2);
        return new C42581y3(r2.A05(), r2.A06());
    }
}
