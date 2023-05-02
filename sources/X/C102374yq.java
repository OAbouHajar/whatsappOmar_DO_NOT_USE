package X;

import com.facebook.redex.IDxECallbackShape109S0200000_2_I1;
import java.io.IOException;

/* renamed from: X.4yq  reason: invalid class name and case insensitive filesystem */
public class C102374yq implements C448025p {
    public final /* synthetic */ AnonymousClass28T A00;
    public final /* synthetic */ C102404yt A01;
    public final /* synthetic */ C448025p A02;

    public C102374yq(AnonymousClass28T r1, C102404yt r2, C448025p r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A5s(AnonymousClass2JT r2) {
        this.A02.A5s(r2);
    }

    public void APZ(IOException iOException) {
        this.A02.APZ(iOException);
    }

    public void AQa(Exception exc) {
        if (!(exc instanceof C802343b) || ((C802343b) exc).error.A01 != 190) {
            this.A02.AQa(exc);
            return;
        }
        C102404yt r5 = this.A01;
        r5.A01.A01(this.A00, new IDxECallbackShape109S0200000_2_I1(r5, this.A02, 1), (AnonymousClass4UI) null);
    }
}
