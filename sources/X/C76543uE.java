package X;

import java.util.List;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.3uE  reason: invalid class name and case insensitive filesystem */
public class C76543uE extends C37791pk implements C109915Uf {
    public final HttpsURLConnection A00;

    public C76543uE(HttpsURLConnection httpsURLConnection) {
        super((Boolean) null, httpsURLConnection);
        this.A00 = httpsURLConnection;
    }

    public String AAu() {
        return C30311c8.A00(this.A00.getInputStream());
    }

    public String AC0() {
        return C30311c8.A00(this.A00.getErrorStream());
    }

    public String AFa() {
        return this.A01.getResponseMessage();
    }

    public List AHl(String str) {
        return this.A01.getHeaderFields().get(str);
    }
}
