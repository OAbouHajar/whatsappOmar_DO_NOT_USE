package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.4WO  reason: invalid class name */
public final class AnonymousClass4WO {
    public final Integer A00;
    public final PublicKey A01;
    public final X509Certificate A02;
    public final X509Certificate A03;

    public AnonymousClass4WO(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.A02 = x509Certificate;
        this.A03 = x509Certificate2;
        this.A01 = publicKey;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WO) {
                AnonymousClass4WO r5 = (AnonymousClass4WO) obj;
                if (!C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0E = (AnonymousClass000.A0E(this.A03, AnonymousClass3K3.A0H(this.A02)) + AnonymousClass000.A0C(this.A01)) * 31;
        Integer num = this.A00;
        if (num != null) {
            i2 = num.hashCode();
        }
        return A0E + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarCertificate(encryptionCertificate=");
        A0r.append(this.A02);
        A0r.append(", signature=");
        A0r.append(this.A03);
        A0r.append(", passwordPublicKey=");
        A0r.append(this.A01);
        A0r.append(", passwordKeyId=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
