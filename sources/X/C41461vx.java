package X;

import java.util.List;

/* renamed from: X.1vx  reason: invalid class name and case insensitive filesystem */
public class C41461vx implements C19550yc {
    public final C18260wP A00;
    public final C17190ug A01;
    public final C41451vw A02;
    public final List A03;

    public C41461vx(C18260wP r1, C17190ug r2, C41451vw r3, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }

    public void APb(String str) {
        this.A02.A00(-1);
    }

    public void AQe(C28371Vv r3, String str) {
        int A002 = C34451kH.A00(r3);
        if (A002 > 0) {
            this.A02.A00(A002);
        } else {
            this.A02.A00(0);
        }
    }

    public void AYG(C28371Vv r4, String str) {
        C41451vw r2 = this.A02;
        C41421vl A002 = C53902gU.A00(r4);
        AnonymousClass135 r1 = r2.A01;
        r1.A02(A002);
        if (r2.A03) {
            AnonymousClass18I r0 = r1.A08;
            r0.A00().edit().putInt("tos_fetch_iteration", r2.A00).apply();
        }
    }
}
