package X;

import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;

/* renamed from: X.2Tg  reason: invalid class name and case insensitive filesystem */
public final class C49462Tg implements AnonymousClass2HV {
    public final /* synthetic */ C27121Qn A00;
    public final /* synthetic */ AnonymousClass2HV A01;

    public C49462Tg(C27121Qn r1, AnonymousClass2HV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AQu(Exception exc) {
        C18450wi.A0H(exc, 0);
        this.A00.A00.A0K(new RunnableRunnableShape9S0200000_I0_7(this.A01, 37, exc));
    }

    public void onSuccess() {
        C27121Qn r4 = this.A00;
        r4.A00.A0K(new RunnableRunnableShape9S0200000_I0_7(r4, 36, this.A01));
    }
}
