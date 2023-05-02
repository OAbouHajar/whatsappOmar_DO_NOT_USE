package okhttp3;

import com.google.gson.internal.j;
import java.util.TreeMap;

/* compiled from: XFMFile */
public final class CipherSuite {
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = forJavaName("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = forJavaName("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = forJavaName("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = forJavaName("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = forJavaName("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = forJavaName("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = forJavaName("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = forJavaName("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = forJavaName("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = forJavaName("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA = forJavaName("SSL_DHE_DSS_WITH_DES_CBC_SHA");
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = forJavaName("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = forJavaName("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = forJavaName("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = forJavaName("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = forJavaName("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = forJavaName("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = forJavaName("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = forJavaName("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = forJavaName("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = forJavaName("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA = forJavaName("SSL_DHE_RSA_WITH_DES_CBC_SHA");
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = forJavaName("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = forJavaName("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = forJavaName("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA = forJavaName("TLS_DH_anon_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256 = forJavaName("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256 = forJavaName("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA = forJavaName("TLS_DH_anon_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256 = forJavaName("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384 = forJavaName("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA = forJavaName("SSL_DH_anon_WITH_DES_CBC_SHA");
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5 = forJavaName("SSL_DH_anon_WITH_RC4_128_MD5");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = forJavaName("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = forJavaName("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = forJavaName("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = forJavaName("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = forJavaName("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = forJavaName("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = forJavaName("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = forJavaName("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA = forJavaName("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = forJavaName("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = forJavaName("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = forJavaName("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = forJavaName("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = forJavaName("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = forJavaName("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = forJavaName("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = forJavaName("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = forJavaName("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = forJavaName("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = forJavaName("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = forJavaName("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA = forJavaName("TLS_ECDHE_RSA_WITH_NULL_SHA");
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA = forJavaName("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = forJavaName("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = forJavaName("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = forJavaName("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = forJavaName("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = forJavaName("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = forJavaName("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = forJavaName("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA = forJavaName("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA = forJavaName("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = forJavaName("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = forJavaName("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = forJavaName("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = forJavaName("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = forJavaName("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = forJavaName("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = forJavaName("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA = forJavaName("TLS_ECDH_RSA_WITH_NULL_SHA");
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA = forJavaName("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = forJavaName("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA = forJavaName("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA = forJavaName("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA = forJavaName("TLS_ECDH_anon_WITH_NULL_SHA");
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA = forJavaName("TLS_ECDH_anon_WITH_RC4_128_SHA");
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV = forJavaName("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    public static final CipherSuite TLS_FALLBACK_SCSV = forJavaName("TLS_FALLBACK_SCSV");
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = forJavaName("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = forJavaName("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = forJavaName("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA = forJavaName("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = forJavaName("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA = forJavaName("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5 = forJavaName("TLS_KRB5_WITH_DES_CBC_MD5");
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA = forJavaName("TLS_KRB5_WITH_DES_CBC_SHA");
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5 = forJavaName("TLS_KRB5_WITH_RC4_128_MD5");
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA = forJavaName("TLS_KRB5_WITH_RC4_128_SHA");
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA = forJavaName("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA = forJavaName("TLS_PSK_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA = forJavaName("TLS_PSK_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA = forJavaName("TLS_PSK_WITH_RC4_128_SHA");
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = forJavaName("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5 = forJavaName("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA = forJavaName("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = forJavaName("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256 = forJavaName("TLS_RSA_WITH_AES_128_CBC_SHA256");
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256 = forJavaName("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = forJavaName("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256 = forJavaName("TLS_RSA_WITH_AES_256_CBC_SHA256");
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384 = forJavaName("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = forJavaName("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = forJavaName("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA = forJavaName("SSL_RSA_WITH_DES_CBC_SHA");
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5 = forJavaName("SSL_RSA_WITH_NULL_MD5");
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA = forJavaName("SSL_RSA_WITH_NULL_SHA");
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256 = forJavaName("TLS_RSA_WITH_NULL_SHA256");
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5 = forJavaName("SSL_RSA_WITH_RC4_128_MD5");
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA = forJavaName("SSL_RSA_WITH_RC4_128_SHA");
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA = forJavaName("TLS_RSA_WITH_SEED_CBC_SHA");

    /* renamed from: b  reason: collision with root package name */
    public static final j f1909b;

    /* renamed from: c  reason: collision with root package name */
    public static final TreeMap f1910c;

    /* renamed from: a  reason: collision with root package name */
    public final String f1911a;

    static {
        j jVar = new j(1);
        f1909b = jVar;
        f1910c = new TreeMap(jVar);
    }

    public CipherSuite(String str) {
        str.getClass();
        this.f1911a = str;
    }

    public static synchronized CipherSuite forJavaName(String str) {
        CipherSuite cipherSuite;
        synchronized (CipherSuite.class) {
            TreeMap treeMap = f1910c;
            cipherSuite = (CipherSuite) treeMap.get(str);
            if (cipherSuite == null) {
                cipherSuite = new CipherSuite(str);
                treeMap.put(str, cipherSuite);
            }
        }
        return cipherSuite;
    }

    public String javaName() {
        return this.f1911a;
    }

    public String toString() {
        return this.f1911a;
    }
}