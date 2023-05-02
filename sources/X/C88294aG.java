package X;

import android.util.Base64;
import com.AssemMods.fakechat.utils.AppUtils;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.4aG  reason: invalid class name and case insensitive filesystem */
public class C88294aG {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final String A03;
    public final X509Certificate A04;
    public final X509Certificate A05;

    public C88294aG(Integer num, String str, X509Certificate x509Certificate, X509Certificate x509Certificate2, int i2, long j2) {
        this.A04 = x509Certificate;
        this.A05 = x509Certificate2;
        this.A00 = i2;
        this.A01 = j2;
        this.A03 = str;
        this.A02 = num;
    }

    public C88294aG(String str) {
        JSONObject jSONObject = new JSONObject(str);
        byte[] decode = Base64.decode(jSONObject.getString("e_cert"), 3);
        byte[] decode2 = Base64.decode(jSONObject.getString("s_cert"), 3);
        CertificateFactory instance = CertificateFactory.getInstance("X.509");
        this.A04 = (X509Certificate) instance.generateCertificate(new ByteArrayInputStream(decode));
        this.A05 = (X509Certificate) instance.generateCertificate(new ByteArrayInputStream(decode2));
        this.A00 = jSONObject.optInt("ttl");
        this.A01 = jSONObject.optLong(AppUtils.HANDLER_TS_KEY);
        this.A03 = jSONObject.optString("ppk");
        this.A02 = Integer.valueOf(jSONObject.optInt("ppk_id"));
    }
}
