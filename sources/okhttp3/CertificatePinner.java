package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;
import r.g;

/* compiled from: XFMFile */
public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();

    /* renamed from: a  reason: collision with root package name */
    public final Set f1903a;

    /* renamed from: b  reason: collision with root package name */
    public final CertificateChainCleaner f1904b;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f1905a = new ArrayList();

        public Builder add(String str, String... strArr) {
            if (str != null) {
                for (String gVar : strArr) {
                    this.f1905a.add(new g(str, gVar));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        public CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.f1905a), (CertificateChainCleaner) null);
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        this.f1903a = set;
        this.f1904b = certificateChainCleaner;
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + ByteString.of(((X509Certificate) certificate).getPublicKey().getEncoded()).sha256().base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public void check(String str, List<Certificate> list) {
        int i2;
        List emptyList = Collections.emptyList();
        Iterator it = this.f1903a.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            g gVar = (g) it.next();
            boolean startsWith = gVar.f2426a.startsWith("*.");
            String str2 = gVar.f2427b;
            if (startsWith) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == str2.length()) {
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        i2 = 1;
                    }
                }
            } else {
                i2 = str.equals(str2);
            }
            if (i2 != 0) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(gVar);
            }
        }
        if (!emptyList.isEmpty()) {
            CertificateChainCleaner certificateChainCleaner = this.f1904b;
            if (certificateChainCleaner != null) {
                list = certificateChainCleaner.clean(list, str);
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i3);
                int size2 = emptyList.size();
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (int i4 = 0; i4 < size2; i4++) {
                    g gVar2 = (g) emptyList.get(i4);
                    boolean equals = gVar2.f2428c.equals("sha256/");
                    ByteString byteString3 = gVar2.f2429d;
                    if (equals) {
                        if (byteString == null) {
                            byteString = ByteString.of(x509Certificate.getPublicKey().getEncoded()).sha256();
                        }
                        if (byteString3.equals(byteString)) {
                            return;
                        }
                    } else {
                        String str3 = gVar2.f2428c;
                        if (str3.equals("sha1/")) {
                            if (byteString2 == null) {
                                byteString2 = ByteString.of(x509Certificate.getPublicKey().getEncoded()).sha1();
                            }
                            if (byteString3.equals(byteString2)) {
                                return;
                            }
                        } else {
                            throw new AssertionError("unsupported hashAlgorithm: ".concat(str3));
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i5 = 0; i5 < size3; i5++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                sb.append("\n    ");
                sb.append(pin(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size4 = emptyList.size();
            while (i2 < size4) {
                sb.append("\n    ");
                sb.append((g) emptyList.get(i2));
                i2++;
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public void check(String str, Certificate... certificateArr) {
        check(str, (List<Certificate>) Arrays.asList(certificateArr));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            return Util.equal(this.f1904b, certificatePinner.f1904b) && this.f1903a.equals(certificatePinner.f1903a);
        }
    }

    public int hashCode() {
        CertificateChainCleaner certificateChainCleaner = this.f1904b;
        return this.f1903a.hashCode() + ((certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0) * 31);
    }
}
