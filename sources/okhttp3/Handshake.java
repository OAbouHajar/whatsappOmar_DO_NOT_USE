package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

/* compiled from: XFMFile */
public final class Handshake {

    /* renamed from: a  reason: collision with root package name */
    public final TlsVersion f1962a;

    /* renamed from: b  reason: collision with root package name */
    public final CipherSuite f1963b;

    /* renamed from: c  reason: collision with root package name */
    public final List f1964c;

    /* renamed from: d  reason: collision with root package name */
    public final List f1965d;

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, List list2) {
        this.f1962a = tlsVersion;
        this.f1963b = cipherSuite;
        this.f1964c = list;
        this.f1965d = list2;
    }

    public static Handshake get(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            CipherSuite forJavaName = CipherSuite.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                TlsVersion forJavaName2 = TlsVersion.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List immutableList = certificateArr != null ? Util.immutableList((T[]) certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new Handshake(forJavaName2, forJavaName, immutableList, localCertificates != null ? Util.immutableList((T[]) localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public static Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<Certificate> list, List<Certificate> list2) {
        if (tlsVersion == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (cipherSuite != null) {
            return new Handshake(tlsVersion, cipherSuite, Util.immutableList(list), Util.immutableList(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    public CipherSuite cipherSuite() {
        return this.f1963b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return this.f1962a.equals(handshake.f1962a) && this.f1963b.equals(handshake.f1963b) && this.f1964c.equals(handshake.f1964c) && this.f1965d.equals(handshake.f1965d);
    }

    public int hashCode() {
        int hashCode = this.f1963b.hashCode();
        int hashCode2 = this.f1964c.hashCode();
        return this.f1965d.hashCode() + ((hashCode2 + ((hashCode + ((this.f1962a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public List<Certificate> localCertificates() {
        return this.f1965d;
    }

    @Nullable
    public Principal localPrincipal() {
        List list = this.f1965d;
        if (!list.isEmpty()) {
            return ((X509Certificate) list.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public List<Certificate> peerCertificates() {
        return this.f1964c;
    }

    @Nullable
    public Principal peerPrincipal() {
        List list = this.f1964c;
        if (!list.isEmpty()) {
            return ((X509Certificate) list.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public TlsVersion tlsVersion() {
        return this.f1962a;
    }
}
