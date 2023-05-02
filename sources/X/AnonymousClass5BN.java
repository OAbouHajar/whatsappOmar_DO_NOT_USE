package X;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.5BN  reason: invalid class name */
public class AnonymousClass5BN extends CertPath {
    public static final List A00;
    public List certificates;
    public final AnonymousClass5NQ helper;

    static {
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add("PkiPath");
        A0u.add("PEM");
        A0u.add("PKCS7");
        A00 = Collections.unmodifiableList(A0u);
    }

    public AnonymousClass5BN(InputStream inputStream, String str) {
        super("X.509");
        CertificateException certificateException;
        AnonymousClass5AA r4 = new AnonymousClass5AA();
        this.helper = r4;
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                C32051fZ A05 = new C33011hn(inputStream).A05();
                if (A05 instanceof C32411gJ) {
                    Enumeration A0B = ((C32411gJ) A05).A0B();
                    this.certificates = AnonymousClass000.A0u();
                    CertificateFactory instance = CertificateFactory.getInstance("X.509", r4.A00);
                    while (A0B.hasMoreElements()) {
                        this.certificates.add(0, instance.generateCertificate(new ByteArrayInputStream(AnonymousClass3K4.A1E((C32071fb) A0B.nextElement()))));
                    }
                    this.certificates = A00(this.certificates);
                    return;
                }
                certificateException = new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
            } else if (str.equalsIgnoreCase("PKCS7") || str.equalsIgnoreCase("PEM")) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = AnonymousClass000.A0u();
                CertificateFactory instance2 = CertificateFactory.getInstance("X.509", r4.A00);
                while (true) {
                    Certificate generateCertificate = instance2.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
                this.certificates = A00(this.certificates);
                return;
            } else {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("unsupported encoding: ");
                certificateException = new CertificateException(AnonymousClass000.A0h(str, A0o));
            }
            throw certificateException;
        } catch (IOException e2) {
            throw new CertificateException(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("IOException throw while decoding CertPath:\n")));
        } catch (NoSuchProviderException e3) {
            throw new CertificateException(AnonymousClass000.A0h(e3.toString(), AnonymousClass000.A0r("SpongyCastle provider not found while trying to get a CertificateFactory:\n")));
        }
    }

    public AnonymousClass5BN(List list) {
        super("X.509");
        this.helper = new AnonymousClass5AA();
        this.certificates = A00(C13680ns.A0n(list));
    }

    public static final List A00(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) C13690nt.A0Z(list)).getIssuerX500Principal();
            int i2 = 1;
            while (i2 != list.size()) {
                if (issuerX500Principal.equals(((X509Certificate) list.get(i2)).getSubjectX500Principal())) {
                    issuerX500Principal = ((X509Certificate) list.get(i2)).getIssuerX500Principal();
                    i2++;
                } else {
                    ArrayList A0i = C13690nt.A0i(list.size());
                    ArrayList A0n = C13680ns.A0n(list);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        X509Certificate x509Certificate = (X509Certificate) list.get(i3);
                        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i4 = 0;
                        while (true) {
                            if (i4 != list.size()) {
                                if (((X509Certificate) list.get(i4)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                    break;
                                }
                                i4++;
                            } else {
                                A0i.add(x509Certificate);
                                list.remove(i3);
                                break;
                            }
                        }
                    }
                    if (A0i.size() <= 1) {
                        for (int i5 = 0; i5 != A0i.size(); i5++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) A0i.get(i5)).getIssuerX500Principal();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= list.size()) {
                                    break;
                                }
                                X509Certificate x509Certificate2 = (X509Certificate) list.get(i6);
                                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                    A0i.add(x509Certificate2);
                                    list.remove(i6);
                                    break;
                                }
                                i6++;
                            }
                        }
                        if (list.size() <= 0) {
                            return A0i;
                        }
                    }
                    return A0n;
                }
            }
        }
        return list;
    }

    public static final C32051fZ A01(X509Certificate x509Certificate) {
        try {
            return new C33011hn(x509Certificate.getEncoded()).A05();
        } catch (Exception e2) {
            throw new CertificateEncodingException(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("Exception while encoding certificate: ")));
        }
    }

    public List getCertificates() {
        return Collections.unmodifiableList(C13680ns.A0n(this.certificates));
    }

    public byte[] getEncoded() {
        Iterator it = A00.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    public byte[] getEncoded(String str) {
        char[] cArr;
        int length;
        int i2;
        if (str.equalsIgnoreCase("PkiPath")) {
            C32391gH r2 = new C32391gH();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r2.A02(A01((X509Certificate) listIterator.previous()));
            }
            try {
                return AnonymousClass3K4.A1E(new C32401gI(r2));
            } catch (IOException e2) {
                throw new CertificateEncodingException(AnonymousClass000.A0g("Exception thrown: ", e2));
            }
        } else {
            int i3 = 0;
            if (str.equalsIgnoreCase("PKCS7")) {
                AnonymousClass5IR r8 = new AnonymousClass5IR((C32071fb) null, C32031fX.A07);
                C32391gH r22 = new C32391gH();
                while (i3 != this.certificates.size()) {
                    r22.A02(A01((X509Certificate) this.certificates.get(i3)));
                    i3++;
                }
                try {
                    return AnonymousClass3K4.A1E(new AnonymousClass5IR(new AnonymousClass5IS(new C33041hq(1), new C107585It(), new C107585It(r22), new C107585It(), r8), C32031fX.A2K));
                } catch (IOException e3) {
                    throw new CertificateEncodingException(AnonymousClass000.A0g("Exception thrown: ", e3));
                }
            } else if (str.equalsIgnoreCase("PEM")) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                AnonymousClass400 r82 = new AnonymousClass400(new OutputStreamWriter(byteArrayOutputStream));
                while (i3 != this.certificates.size()) {
                    try {
                        C87984Zl r23 = new C87984Zl(((X509Certificate) this.certificates.get(i3)).getEncoded());
                        StringBuilder A0r = AnonymousClass000.A0r("-----BEGIN ");
                        A0r.append("CERTIFICATE");
                        r82.write(AnonymousClass000.A0h("-----", A0r));
                        r82.newLine();
                        List list2 = r23.A00;
                        if (!list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            if (it.hasNext()) {
                                it.next();
                                throw AnonymousClass000.A0W("getName");
                            }
                            r82.newLine();
                        }
                        byte[] bArr = r23.A01;
                        int length2 = bArr.length;
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(((length2 + 2) / 3) << 2);
                        AnonymousClass4AI.A00.A8N(byteArrayOutputStream2, bArr, 0, length2);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        int i4 = 0;
                        while (true) {
                            int length3 = byteArray.length;
                            if (i4 >= length3) {
                                break;
                            }
                            int i5 = 0;
                            while (true) {
                                cArr = r82.A00;
                                length = cArr.length;
                                if (i5 == length || (i2 = i4 + i5) >= length3) {
                                    r82.write(cArr, 0, i5);
                                    r82.newLine();
                                    i4 += length;
                                } else {
                                    cArr[i5] = (char) byteArray[i2];
                                    i5++;
                                }
                            }
                            r82.write(cArr, 0, i5);
                            r82.newLine();
                            i4 += length;
                        }
                        StringBuilder A0r2 = AnonymousClass000.A0r("-----END ");
                        A0r2.append("CERTIFICATE");
                        r82.write(AnonymousClass000.A0h("-----", A0r2));
                        r82.newLine();
                        i3++;
                    } catch (Exception e4) {
                        throw new AnonymousClass44A(AnonymousClass000.A0h(e4.getMessage(), AnonymousClass000.A0r("exception encoding base64 string: ")), e4);
                    } catch (Exception unused) {
                        throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                    }
                }
                r82.close();
                return byteArrayOutputStream.toByteArray();
            } else {
                throw new CertificateEncodingException(AnonymousClass000.A0h(str, AnonymousClass000.A0r("unsupported encoding: ")));
            }
        }
    }

    public Iterator getEncodings() {
        return A00.iterator();
    }
}
