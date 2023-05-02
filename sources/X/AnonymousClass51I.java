package X;

import java.util.List;

/* renamed from: X.51I  reason: invalid class name */
public class AnonymousClass51I implements C19550yc {
    public final C18260wP A00;
    public final C17190ug A01;
    public final C84034Iz A02;
    public final List A03;

    public AnonymousClass51I(C18260wP r1, C17190ug r2, C84034Iz r3, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }

    public void APb(String str) {
        this.A02.A00.A0A.A01();
    }

    public void AQe(C28371Vv r6, String str) {
        Long A002;
        int A003 = C34451kH.A00(r6);
        if (A003 > 0) {
            C84034Iz r2 = this.A02;
            AnonymousClass135 r3 = r2.A00;
            C40761ue r1 = r3.A0A;
            if (A003 != 500 || (A002 = r1.A00()) == null) {
                r1.A01();
            } else {
                r3.A03(r2.A01, A002.longValue());
            }
        } else {
            this.A02.A00.A0A.A01();
        }
    }

    public void AYG(C28371Vv r3, String str) {
        AnonymousClass135 r1 = this.A02.A00;
        r1.A00 = null;
        r1.A0A.A01();
    }
}
