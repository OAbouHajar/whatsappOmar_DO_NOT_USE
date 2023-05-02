package X;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;

/* renamed from: X.3FZ  reason: invalid class name */
public class AnonymousClass3FZ implements AnonymousClass5SZ {
    public final /* synthetic */ C88294aG A00;
    public final /* synthetic */ AnonymousClass144 A01;
    public final /* synthetic */ AnonymousClass2HZ A02;
    public final /* synthetic */ AnonymousClass14J A03;

    public AnonymousClass3FZ(C88294aG r1, AnonymousClass144 r2, AnonymousClass2HZ r3, AnonymousClass14J r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void APa(Exception exc) {
        C88294aG r5 = this.A00;
        AnonymousClass2HZ r4 = this.A02;
        if (r5 != null) {
            try {
                X509Certificate x509Certificate = r5.A04;
                X509Certificate x509Certificate2 = r5.A05;
                String str = r5.A03;
                r4.AYK(r5.A02, str == null ? null : AnonymousClass3BS.A03(str), x509Certificate, x509Certificate2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r4.APa(exc);
    }

    public void AQa(Exception exc) {
        C88294aG r5 = this.A00;
        AnonymousClass2HZ r4 = this.A02;
        if (r5 != null) {
            try {
                X509Certificate x509Certificate = r5.A04;
                X509Certificate x509Certificate2 = r5.A05;
                String str = r5.A03;
                r4.AYK(r5.A02, str == null ? null : AnonymousClass3BS.A03(str), x509Certificate, x509Certificate2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        r4.AQa(exc);
    }

    public void AYL(Integer num, String str, String str2, String str3, String str4, String str5) {
        try {
            AnonymousClass14J.A00(this.A01, this.A02, this.A03, num, str2, str3, str4, str5);
        } catch (CertificateExpiredException unused) {
            AnonymousClass14J r2 = this.A03;
            AnonymousClass14C r0 = r2.A02;
            AnonymousClass144 r1 = this.A01;
            r0.A01(r1);
            Object obj = ((AnonymousClass14H) r2.A03.get()).A00.get(r1);
            AnonymousClass00B.A06(obj);
            ((AnonymousClass14E) ((AnonymousClass01J) obj).get()).A00(new C102044yJ(this));
        }
    }
}
