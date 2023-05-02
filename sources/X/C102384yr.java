package X;

import android.app.Activity;
import java.io.IOException;

/* renamed from: X.4yr  reason: invalid class name and case insensitive filesystem */
public final class C102384yr implements C448025p {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass1Z6 A01;
    public final /* synthetic */ C25351Jl A02;
    public final /* synthetic */ boolean A03;

    public C102384yr(Activity activity, AnonymousClass1Z6 r2, C25351Jl r3, boolean z2) {
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = z2;
        this.A01 = r2;
    }

    public void A5s(AnonymousClass2JT r8) {
        C18450wi.A0H(r8, 0);
        if (r8.A00 == 0) {
            this.A02.A00(this.A00, this.A01, "success", C438921y.A01((String) r8.A02.A00), this.A03);
            return;
        }
        this.A02.A00(this.A00, this.A01, "error", AnonymousClass1Z8.A00, this.A03);
    }

    public void APZ(IOException iOException) {
        this.A02.A00(this.A00, this.A01, "error", AnonymousClass1Z8.A00, this.A03);
    }

    public void AQa(Exception exc) {
        this.A02.A00(this.A00, this.A01, "error", AnonymousClass1Z8.A00, this.A03);
    }
}
