package X;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

/* renamed from: X.4vA  reason: invalid class name and case insensitive filesystem */
public class C100144vA implements C109915Uf {
    public final URL A00;
    public final HttpEntity A01;
    public final HttpResponse A02;

    public C100144vA(URL url, HttpResponse httpResponse) {
        this.A02 = httpResponse;
        this.A01 = httpResponse.getEntity();
        this.A00 = url;
    }

    public int A6O() {
        return this.A02.getStatusLine().getStatusCode();
    }

    public InputStream A9j(C17130ua r2, Integer num, Integer num2) {
        return null;
    }

    public InputStream A9k(C17130ua r2, Integer num, Integer num2) {
        HttpEntity httpEntity = this.A01;
        if (httpEntity != null) {
            return httpEntity.getContent();
        }
        throw AnonymousClass3K3.A0e("Entity is null");
    }

    public String AAu() {
        HttpEntity httpEntity = this.A01;
        if (httpEntity != null) {
            return EntityUtils.toString(httpEntity);
        }
        return null;
    }

    public String AAv() {
        return null;
    }

    public String AC0() {
        return AAu();
    }

    public String AFa() {
        return this.A02.getStatusLine().getReasonPhrase();
    }

    public URL AGi() {
        return this.A00;
    }

    public String AHk(String str) {
        List AHl = AHl(str);
        if (AHl == null || AHl.isEmpty()) {
            return null;
        }
        return (String) C13690nt.A0Z(AHl);
    }

    public List AHl(String str) {
        Header[] headers = this.A02.getHeaders(str);
        if (headers == null) {
            return null;
        }
        ArrayList A0i = C13690nt.A0i(r3);
        for (Header value : headers) {
            A0i.add(value.getValue());
        }
        return A0i;
    }

    public void close() {
        AnonymousClass3BQ.A02(this.A01);
    }

    public long getContentLength() {
        HttpEntity httpEntity = this.A01;
        if (httpEntity != null) {
            return httpEntity.getContentLength();
        }
        return 0;
    }
}
