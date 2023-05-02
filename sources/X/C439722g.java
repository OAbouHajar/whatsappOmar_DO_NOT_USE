package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.22g  reason: invalid class name and case insensitive filesystem */
public final class C439722g implements C439322c {
    public final /* synthetic */ AnonymousClass16K A00;
    public final /* synthetic */ C439622f A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C439722g(AnonymousClass16K r1, C439622f r2, String str, String str2, String str3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
    }

    public void ARk(UserJid userJid) {
        C18450wi.A0H(userJid, 0);
        AnonymousClass16K r3 = this.A00;
        r3.A02.A0o(userJid.getRawString());
        Log.w(C18450wi.A06("Galaxy /onGetBusinessPublicKeyError/", userJid.getRawString()));
        C439622f r0 = this.A01;
        if (r0 != null) {
            r0.ARf("extensions-public-key-error-response");
        }
        r3.A00.AcB("extensions-public-key-error-response", "", false);
    }

    public void ARl(UserJid userJid, String str) {
        C439622f r4;
        String str2;
        String str3;
        UserJid userJid2 = userJid;
        C18450wi.A0H(userJid2, 0);
        String str4 = str;
        C18450wi.A0H(str4, 1);
        try {
            X509Certificate[] x509CertificateArr = (X509Certificate[]) CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(str4.getBytes(AnonymousClass01S.A08))).toArray(new X509Certificate[0]);
            C18450wi.A0B(x509CertificateArr);
            AnonymousClass16K r14 = this.A00;
            if (!r14.A02(userJid2)) {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                ((X509TrustManager) instance.getTrustManagers()[0]).checkServerTrusted(x509CertificateArr, "RSA");
            }
            X509Certificate x509Certificate = x509CertificateArr[0];
            String encodeToString = Base64.encodeToString(x509Certificate.getEncoded(), 2);
            if (new Date().getTime() > x509Certificate.getNotAfter().getTime()) {
                r14.A00.AcB("extensions-expired-certificate-exception", "", false);
                C439622f r0 = this.A01;
                if (r0 != null) {
                    r0.ARf("extensions-expired-certificate-exception");
                    return;
                }
                return;
            }
            C15860rz r02 = r14.A02;
            String str5 = userJid2.user;
            SharedPreferences.Editor A0K = r02.A0K();
            StringBuilder sb = new StringBuilder("galaxy_biz_public_key_");
            sb.append(str5);
            A0K.putString(sb.toString(), encodeToString).apply();
            if (r14.A02(userJid2) || r14.A03.A0E(C16620tM.A02, 2030)) {
                String str6 = this.A02;
                if (str6 != null && (r4 = this.A01) != null && (str2 = this.A04) != null && (str3 = this.A03) != null) {
                    r14.A00(r4, userJid2, str6, str2, str3);
                    return;
                }
                return;
            }
            String A002 = AnonymousClass16J.A00(x509Certificate.getSubjectX500Principal().getName());
            String A003 = AnonymousClass16J.A00(x509CertificateArr[x509CertificateArr.length - 1].getIssuerX500Principal().getName());
            String str7 = this.A02;
            C439622f r15 = this.A01;
            String str8 = this.A04;
            String str9 = this.A03;
            AnonymousClass51N r9 = new AnonymousClass51N(userJid2, r14.A04);
            r9.A00 = new AnonymousClass4O6(r14, r15, A002, A003, str7, str8, str9);
            C17190ug r8 = r9.A02;
            String A022 = r8.A02();
            C18450wi.A0B(A022);
            r8.A0A(r9, new C28371Vv(new C28371Vv("business_cert_info", new C35081lL[]{new C35081lL("biz_jid", r9.A01.getRawString())}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("xmlns", "w:biz:catalog"), new C35081lL("type", "get"), new C35081lL("id", A022)}), A022, 338, 32000);
        } catch (Exception e2) {
            Log.w("Galaxy /generateEncryptionStringFromSignedInfo/", e2);
            boolean z2 = e2 instanceof NoSuchAlgorithmException;
            String str10 = "extensions-certificate-exception";
            C16300so r1 = this.A00.A00;
            String message = e2.getMessage();
            if (z2) {
                r1.AcB("extensions-certificate-exception-no-such-algorithm", message, true);
                str10 = "extensions-certificate-exception-no-such-algorithm";
            } else {
                r1.AcB(str10, message, true);
            }
            C439622f r03 = this.A01;
            if (r03 != null) {
                r03.ARf(str10);
            }
        }
    }
}
