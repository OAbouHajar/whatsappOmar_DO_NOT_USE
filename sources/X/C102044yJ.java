package X;

import java.security.cert.CertificateExpiredException;

/* renamed from: X.4yJ  reason: invalid class name and case insensitive filesystem */
public class C102044yJ implements AnonymousClass5SZ {
    public final /* synthetic */ AnonymousClass3FZ A00;

    public C102044yJ(AnonymousClass3FZ r1) {
        this.A00 = r1;
    }

    public void APa(Exception exc) {
        this.A00.A02.AQa(exc);
    }

    public void AQa(Exception exc) {
        this.A00.A02.AQa(exc);
    }

    public void AYL(Integer num, String str, String str2, String str3, String str4, String str5) {
        try {
            AnonymousClass3FZ r0 = this.A00;
            AnonymousClass14J.A00(r0.A01, r0.A02, r0.A03, num, str2, str3, str4, str5);
        } catch (CertificateExpiredException e2) {
            this.A00.A02.AQa(e2);
        }
    }
}
