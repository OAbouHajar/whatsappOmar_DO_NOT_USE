package X;

import android.content.Intent;

/* renamed from: X.4uh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C99854uh implements AnonymousClass2Sv {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ C18890xQ A01;

    public /* synthetic */ C99854uh(C14550pN r1, C18890xQ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void AOW() {
        C18890xQ r0 = this.A01;
        C14550pN r2 = this.A00;
        Intent A09 = C13680ns.A09();
        A09.setData(r0.A00());
        r2.startActivity(A09);
    }
}
