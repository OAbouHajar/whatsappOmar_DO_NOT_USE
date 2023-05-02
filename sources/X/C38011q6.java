package X;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: X.1q6  reason: invalid class name and case insensitive filesystem */
public final class C38011q6 implements HostnameVerifier {
    public final String A00;
    public final HostnameVerifier A01;

    public C38011q6(String str, HostnameVerifier hostnameVerifier) {
        this.A00 = str;
        this.A01 = hostnameVerifier;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C38011q6.class == obj.getClass()) {
            C38011q6 r4 = (C38011q6) obj;
            if (this.A00.equals(r4.A00)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return this.A01.verify(this.A00, sSLSession);
    }
}
