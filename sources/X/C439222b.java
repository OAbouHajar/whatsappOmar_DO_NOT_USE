package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.22b  reason: invalid class name and case insensitive filesystem */
public class C439222b implements C439322c {
    public final /* synthetic */ AnonymousClass16N A00;

    public C439222b(AnonymousClass16N r1) {
        this.A00 = r1;
    }

    public void ARk(UserJid userJid) {
        AnonymousClass16N r2 = this.A00;
        r2.A08.A0n(userJid.getRawString());
        r2.A04(userJid);
        r2.A04.AcB("direct-connection-public-key-error-response", "", false);
    }

    public void ARl(UserJid userJid, String str) {
        Log.i("DirectConnectionManager/onGetBusinessPublicKeySuccess");
        try {
            X509Certificate[] x509CertificateArr = (X509Certificate[]) CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(str.getBytes(AnonymousClass01S.A08))).toArray(new X509Certificate[0]);
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            ((X509TrustManager) instance.getTrustManagers()[0]).checkServerTrusted(x509CertificateArr, "RSA");
            String encodeToString = Base64.encodeToString(x509CertificateArr[0].getEncoded(), 2);
            AnonymousClass16N r4 = this.A00;
            C15860rz r0 = r4.A08;
            String rawString = userJid.getRawString();
            SharedPreferences.Editor A0K = r0.A0K();
            StringBuilder sb = new StringBuilder("smb_business_direct_connection_public_key_");
            sb.append(rawString);
            A0K.putString(sb.toString(), encodeToString).apply();
            r4.A03(userJid);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e2) {
            Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/", e2);
            AnonymousClass16N r1 = this.A00;
            r1.A04(userJid);
            boolean z2 = e2 instanceof NoSuchAlgorithmException;
            r1.A04.AcB(z2 ? "direct-connection-certificate-exception-no-such-algorithm" : "direct-connection-certificate-exception", e2.toString(), true);
        }
    }
}
