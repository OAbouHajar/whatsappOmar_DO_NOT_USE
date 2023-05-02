package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.5nn  reason: invalid class name and case insensitive filesystem */
public class C114455nn extends C16690tT {
    public final C18290wS A00;
    public final AnonymousClass1Vo A01;
    public final WeakReference A02;

    public C114455nn(C18290wS r2, AnonymousClass1Vo r3, AnonymousClass5r1 r4) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = new WeakReference(r4);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2;
        C18290wS r4 = this.A00;
        List A0A = C110115dX.A0H(r4).A0A();
        AnonymousClass1Vo r2 = this.A01;
        StringBuilder A0r = AnonymousClass000.A0r("#methods=");
        A0r.append(A0A.size());
        C110105dW.A1L(r2, A0r);
        if (A0A.size() > 1) {
            i2 = 201;
        } else {
            r4.A06();
            i2 = 200;
            if (r4.A08.A0T(1).size() > 0) {
                i2 = 202;
            }
        }
        return Integer.valueOf(i2);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Number number = (Number) obj;
        AnonymousClass5r1 r0 = (AnonymousClass5r1) this.A02.get();
        if (r0 != null) {
            AnonymousClass29T.A01(r0.A00, number.intValue());
        }
    }
}
