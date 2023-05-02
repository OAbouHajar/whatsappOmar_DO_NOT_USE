package X;

import java.util.concurrent.Callable;

/* renamed from: X.66z  reason: invalid class name and case insensitive filesystem */
public class C1218266z implements Callable {
    public final /* synthetic */ C111135fO A00;

    public C1218266z(C111135fO r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C111135fO r4 = this.A00;
        C119325wu r3 = r4.A02;
        r3.A02();
        C119005vl r2 = r3.A01;
        if (r2 != null) {
            r2.A05(r4.A00, r4.A03);
        }
        AnonymousClass5xW r22 = r3.A02;
        if (r22 == null) {
            return null;
        }
        r22.A0F(r4.A04, true);
        return null;
    }
}
