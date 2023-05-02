package X;

import com.facebook.redex.RunnableRunnableShape1S1300000_I1;
import java.io.IOException;

/* renamed from: X.4yp  reason: invalid class name and case insensitive filesystem */
public class C102364yp implements C448025p {
    public final /* synthetic */ AnonymousClass1KE A00;
    public final /* synthetic */ AnonymousClass5S7 A01;
    public final /* synthetic */ String A02;

    public C102364yp(AnonymousClass1KE r1, AnonymousClass5S7 r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public void A5s(AnonymousClass2JT r8) {
        this.A00.A03.A0K(new RunnableRunnableShape1S1300000_I1(2, this.A02, this, r8, this.A01));
    }

    public void APZ(IOException iOException) {
        AQa(iOException);
    }

    public void AQa(Exception exc) {
        this.A00.A03.A0K(new RunnableRunnableShape1S1300000_I1(3, this.A02, this, exc, this.A01));
    }
}
