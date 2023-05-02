package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;

/* compiled from: XFMFile */
public final class ConnectionSpec {
    public static final ConnectionSpec CLEARTEXT = new Builder(false).build();
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final ConnectionSpec MODERN_TLS;
    public static final ConnectionSpec RESTRICTED_TLS;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1919a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1920b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f1921c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f1922d;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f1923a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f1924b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f1925c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1926d;

        public Builder(ConnectionSpec connectionSpec) {
            this.f1923a = connectionSpec.f1919a;
            this.f1924b = connectionSpec.f1921c;
            this.f1925c = connectionSpec.f1922d;
            this.f1926d = connectionSpec.f1920b;
        }

        public Builder(boolean z2) {
            this.f1923a = z2;
        }

        public Builder allEnabledCipherSuites() {
            if (this.f1923a) {
                this.f1924b = null;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public Builder allEnabledTlsVersions() {
            if (this.f1923a) {
                this.f1925c = null;
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public ConnectionSpec build() {
            return new ConnectionSpec(this);
        }

        public Builder cipherSuites(String... strArr) {
            if (!this.f1923a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f1924b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public Builder cipherSuites(CipherSuite... cipherSuiteArr) {
            if (this.f1923a) {
                String[] strArr = new String[cipherSuiteArr.length];
                for (int i2 = 0; i2 < cipherSuiteArr.length; i2++) {
                    strArr[i2] = cipherSuiteArr[i2].f1911a;
                }
                return cipherSuites(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public Builder supportsTlsExtensions(boolean z2) {
            if (this.f1923a) {
                this.f1926d = z2;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public Builder tlsVersions(String... strArr) {
            if (!this.f1923a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f1925c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public Builder tlsVersions(TlsVersion... tlsVersionArr) {
            if (this.f1923a) {
                String[] strArr = new String[tlsVersionArr.length];
                for (int i2 = 0; i2 < tlsVersionArr.length; i2++) {
                    strArr[i2] = tlsVersionArr[i2].f2100a;
                }
                return tlsVersions(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite3 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        Builder cipherSuites = new Builder(true).cipherSuites(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6);
        TlsVersion tlsVersion = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = cipherSuites.tlsVersions(tlsVersion).supportsTlsExtensions(true).build();
        Builder cipherSuites2 = new Builder(true).cipherSuites(cipherSuiteArr);
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_0;
        ConnectionSpec build = cipherSuites2.tlsVersions(tlsVersion, TlsVersion.TLS_1_1, tlsVersion2).supportsTlsExtensions(true).build();
        MODERN_TLS = build;
        COMPATIBLE_TLS = new Builder(build).tlsVersions(tlsVersion2).supportsTlsExtensions(true).build();
    }

    public ConnectionSpec(Builder builder) {
        this.f1919a = builder.f1923a;
        this.f1921c = builder.f1924b;
        this.f1922d = builder.f1925c;
        this.f1920b = builder.f1926d;
    }

    @Nullable
    public List<CipherSuite> cipherSuites() {
        String[] strArr = this.f1921c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String forJavaName : strArr) {
            arrayList.add(CipherSuite.forJavaName(forJavaName));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z2 = connectionSpec.f1919a;
        boolean z3 = this.f1919a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f1921c, connectionSpec.f1921c) && Arrays.equals(this.f1922d, connectionSpec.f1922d) && this.f1920b == connectionSpec.f1920b);
    }

    public int hashCode() {
        if (this.f1919a) {
            return ((((527 + Arrays.hashCode(this.f1921c)) * 31) + Arrays.hashCode(this.f1922d)) * 31) + (this.f1920b ^ true ? 1 : 0);
        }
        return 17;
    }

    public boolean isCompatible(SSLSocket sSLSocket) {
        if (!this.f1919a) {
            return false;
        }
        String[] strArr = this.f1922d;
        if (strArr != null && !Util.nonEmptyIntersection(Util.NATURAL_ORDER, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f1921c;
        return strArr2 == null || Util.nonEmptyIntersection(CipherSuite.f1909b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean isTls() {
        return this.f1919a;
    }

    public boolean supportsTlsExtensions() {
        return this.f1920b;
    }

    @Nullable
    public List<TlsVersion> tlsVersions() {
        String[] strArr = this.f1922d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String forJavaName : strArr) {
            arrayList.add(TlsVersion.forJavaName(forJavaName));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        if (!this.f1919a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f1921c != null ? cipherSuites().toString() : str;
        if (this.f1922d != null) {
            str = tlsVersions().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.f1920b + ")";
    }
}
