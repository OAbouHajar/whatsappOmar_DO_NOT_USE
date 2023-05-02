package okhttp3;

/* compiled from: XFMFile */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f2100a;

    /* access modifiers changed from: public */
    TlsVersion(String str) {
        this.f2100a = str;
    }

    public static TlsVersion forJavaName(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c2 = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c2 = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c2 = 2;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c2 = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return TLS_1_1;
            case 1:
                return TLS_1_2;
            case 2:
                return TLS_1_3;
            case 3:
                return SSL_3_0;
            case 4:
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }

    public String javaName() {
        return this.f2100a;
    }
}