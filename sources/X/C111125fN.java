package X;

import com.facebook.redex.IDxCallableShape150S0100000_3_I1;

/* renamed from: X.5fN  reason: invalid class name and case insensitive filesystem */
public class C111125fN extends C118595uw {
    public final /* synthetic */ C118645v1 A00;
    public final /* synthetic */ AnonymousClass5zC A01;
    public final /* synthetic */ AnonymousClass5wQ A02;

    public C111125fN(C118645v1 r1, AnonymousClass5zC r2, AnonymousClass5wQ r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public void A02(Exception exc) {
        AnonymousClass5xH.A00();
        AnonymousClass5zC r3 = this.A01;
        C119355wx r2 = r3.A0T;
        r2.A05(new AnonymousClass656(this, exc), r3.A0S.A03);
        if (!AnonymousClass5x0.A02(AnonymousClass5w3.A01) || !r3.A0W.get()) {
            r2.A07("take_photo_exception_restart_preview", new IDxCallableShape150S0100000_3_I1(this, 5));
        }
    }

    public /* bridge */ /* synthetic */ void A03(Object obj) {
    }
}
