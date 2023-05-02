package X;

import com.facebook.redex.IDxSCreatorShape10S1100000_2_I1;
import com.facebook.redex.IDxSCreatorShape118S0200000_2_I1;
import com.facebook.redex.IDxSCreatorShape469S0100000_2_I1;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.5BZ  reason: invalid class name */
public abstract class AnonymousClass5BZ extends X509CRL {
    public String A00;
    public AnonymousClass5Hs A01;
    public AnonymousClass5NQ A02;
    public boolean A03;
    public byte[] A04;

    public AnonymousClass5BZ(String str, AnonymousClass5Hs r2, AnonymousClass5NQ r3, byte[] bArr, boolean z2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = str;
        this.A04 = bArr;
        this.A03 = z2;
    }

    public static AnonymousClass5IQ A00(C32411gJ r1, AnonymousClass5IQ r2, AnonymousClass5Hq r3) {
        if (r1.A0A() == 3) {
            C107335Hu A032 = r3.A03();
            AnonymousClass5IH r0 = (AnonymousClass5IH) A032.A00.get(AnonymousClass5IH.A0A);
            if (r0 != null) {
                return AnonymousClass5IQ.A01(AnonymousClass5IG.A00(r0.A03()).A03()[0].A01);
            }
        }
        return r2;
    }

    public final Set A01(boolean z2) {
        C107335Hu r4;
        if (getVersion() != 2 || (r4 = this.A01.A03.A04) == null) {
            return null;
        }
        HashSet A0o = C13680ns.A0o();
        Enumeration elements = r4.A01.elements();
        while (elements.hasMoreElements()) {
            C32041fY r1 = (C32041fY) elements.nextElement();
            if (z2 == C107335Hu.A00(r1, r4).A02) {
                A0o.add(r1.A01);
            }
        }
        return A0o;
    }

    public final void A02(PublicKey publicKey, Signature signature, C32071fb r6, byte[] bArr) {
        if (r6 != null) {
            C90754ek.A03(signature, r6);
        }
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C794940a(signature), 512);
            this.A01.A03.A00(bufferedOutputStream, "DER");
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    public final void A03(PublicKey publicKey, AnonymousClass5R3 r10) {
        AnonymousClass5Hs r7 = this.A01;
        AnonymousClass5II r2 = r7.A02;
        if (r2.equals(r7.A03.A03)) {
            if (C109705Tg.A0C.A04(r2.A01)) {
                C32411gJ A002 = C32411gJ.A00(r2.A00);
                C32411gJ A003 = C32411gJ.A00(AnonymousClass5HY.A00(r7.A01).A0A());
                boolean z2 = false;
                for (int i2 = 0; i2 != A003.A0A(); i2++) {
                    AnonymousClass5II A004 = AnonymousClass5II.A00(A002.A0C(i2));
                    try {
                        A02(publicKey, r10.A7c(C90754ek.A01(A004)), A004.A00, AnonymousClass5HY.A00(A003.A0C(i2)).A0A());
                        z2 = true;
                    } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                    } catch (SignatureException e2) {
                        throw e2;
                    }
                }
                if (!z2) {
                    throw new InvalidKeyException("no matching key found");
                }
                return;
            }
            Signature A7c = r10.A7c(this.A00);
            byte[] bArr = this.A04;
            if (bArr == null) {
                A02(publicKey, A7c, (C32071fb) null, getSignature());
                return;
            }
            try {
                A02(publicKey, A7c, C32051fZ.A02(bArr), getSignature());
            } catch (IOException e3) {
                throw new SignatureException(AnonymousClass000.A0h(e3.getMessage(), AnonymousClass000.A0r("cannot decode signature parameters: ")));
            }
        } else {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
    }

    public Set getCriticalExtensionOIDs() {
        return A01(true);
    }

    public byte[] getEncoded() {
        try {
            return this.A01.A02("DER");
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = X.C107335Hu.A00(X.AnonymousClass3K3.A0w(r4), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getExtensionValue(java.lang.String r4) {
        /*
            r3 = this;
            X.5Hs r0 = r3.A01
            X.5Hl r0 = r0.A03
            X.5Hu r1 = r0.A04
            if (r1 == 0) goto L_0x0017
            X.1fY r0 = X.AnonymousClass3K3.A0w(r4)
            X.5IH r0 = X.C107335Hu.A00(r0, r1)
            if (r0 == 0) goto L_0x0017
            X.5Ib r0 = r0.A01
        L_0x0014:
            if (r0 == 0) goto L_0x0032
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x0014
        L_0x0019:
            byte[] r0 = r0.A01()     // Catch:{ Exception -> 0x001e }
            return r0
        L_0x001e:
            r2 = move-exception
            java.lang.String r0 = "error parsing "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0032:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5BZ.getExtensionValue(java.lang.String):byte[]");
    }

    public Principal getIssuerDN() {
        return new AnonymousClass5J8(AnonymousClass5IQ.A01(this.A01.A03.A02.A01));
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.A01.A03.A02.A01());
        } catch (IOException unused) {
            throw AnonymousClass000.A0V("can't encode issuer DN");
        }
    }

    public Date getNextUpdate() {
        AnonymousClass5IO r0 = this.A01.A03.A05;
        if (r0 == null) {
            return null;
        }
        return r0.A04();
    }

    public Set getNonCriticalExtensionOIDs() {
        return A01(false);
    }

    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        AnonymousClass5Hl r1 = this.A01.A03;
        C32411gJ r0 = r1.A01;
        Enumeration r5 = r0 == null ? new AnonymousClass57M(r1) : new AnonymousClass57O(r0.A0B(), r1);
        AnonymousClass5IQ r3 = null;
        while (r5.hasMoreElements()) {
            AnonymousClass5Hq r2 = (AnonymousClass5Hq) r5.nextElement();
            C32411gJ r12 = r2.A00;
            if (C33041hq.A00(AnonymousClass3K3.A0u(r12)).A0B(bigInteger)) {
                return new C105745Ba(r3, r2, this.A03);
            }
            if (this.A03) {
                r3 = A00(r12, r3, r2);
            }
        }
        return null;
    }

    public Set getRevokedCertificates() {
        HashSet A0o = C13680ns.A0o();
        AnonymousClass5Hl r1 = this.A01.A03;
        C32411gJ r0 = r1.A01;
        Enumeration r4 = r0 == null ? new AnonymousClass57M(r1) : new AnonymousClass57O(r0.A0B(), r1);
        AnonymousClass5IQ r3 = null;
        while (r4.hasMoreElements()) {
            AnonymousClass5Hq r2 = (AnonymousClass5Hq) r4.nextElement();
            boolean z2 = this.A03;
            A0o.add(new C105745Ba(r3, r2, z2));
            if (z2) {
                r3 = A00(r2.A00, r3, r2);
            }
        }
        if (!A0o.isEmpty()) {
            return Collections.unmodifiableSet(A0o);
        }
        return null;
    }

    public String getSigAlgName() {
        return this.A00;
    }

    public String getSigAlgOID() {
        return this.A01.A02.A01.A01;
    }

    public byte[] getSigAlgParams() {
        return C33111hx.A02(this.A04);
    }

    public byte[] getSignature() {
        AnonymousClass5HY r1 = this.A01.A01;
        if (r1.A00 == 0) {
            return C33111hx.A02(r1.A01);
        }
        throw AnonymousClass000.A0V("attempt to get non-octet aligned data from BIT STRING");
    }

    public byte[] getTBSCertList() {
        try {
            return this.A01.A03.A02("DER");
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    public Date getThisUpdate() {
        return this.A01.A03.A06.A04();
    }

    public int getVersion() {
        C33041hq r0 = this.A01.A03.A00;
        if (r0 == null) {
            return 1;
        }
        return r0.A0A() + 1;
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(AnonymousClass5IH.A0K.A01);
        criticalExtensionOIDs.remove(AnonymousClass5IH.A0C.A01);
        return !criticalExtensionOIDs.isEmpty();
    }

    public boolean isRevoked(Certificate certificate) {
        AnonymousClass5IQ r0;
        AnonymousClass5IH A002;
        if (certificate.getType().equals("X.509")) {
            AnonymousClass5Hl r1 = this.A01.A03;
            C32411gJ r02 = r1.A01;
            Enumeration r4 = r02 == null ? new AnonymousClass57M(r1) : new AnonymousClass57O(r02.A0B(), r1);
            AnonymousClass5IQ r2 = r1.A02;
            if (r4.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (true) {
                    if (!r4.hasMoreElements()) {
                        break;
                    }
                    Object nextElement = r4.nextElement();
                    AnonymousClass5Hq r6 = nextElement instanceof AnonymousClass5Hq ? (AnonymousClass5Hq) nextElement : nextElement != null ? new AnonymousClass5Hq(C32411gJ.A00(nextElement)) : null;
                    if (this.A03 && r6.A00.A0A() == 3 && (A002 = C107335Hu.A00(AnonymousClass5IH.A0A, r6.A03())) != null) {
                        r2 = AnonymousClass5IQ.A01(AnonymousClass5IG.A00(A002.A03()).A03()[0].A01);
                    }
                    if (C33041hq.A00(r6.A00.A0C(0)).A0B(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            r0 = AnonymousClass5IQ.A01(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                r0 = AnonymousClass5I2.A00(certificate.getEncoded()).A03.A05;
                            } catch (CertificateEncodingException e2) {
                                throw AnonymousClass000.A0T(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Cannot process certificate: ")));
                            }
                        }
                        if (r2.equals(r0)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw AnonymousClass000.A0T("X.509 CRL used with non X.509 Cert");
    }

    public String toString() {
        String str;
        String A002;
        Object A003;
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = C32941ha.A00;
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str2);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str2);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(str2);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(str2);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.A00);
        stringBuffer.append(str2);
        C90754ek.A02(str2, stringBuffer, getSignature());
        C107335Hu r1 = this.A01.A03.A04;
        if (r1 != null) {
            Enumeration elements = r1.A01.elements();
            if (elements.hasMoreElements()) {
                str = "           Extensions: ";
                stringBuffer.append(str);
                stringBuffer.append(str2);
            }
            while (true) {
                if (!elements.hasMoreElements()) {
                    break;
                }
                C32041fY r5 = (C32041fY) elements.nextElement();
                AnonymousClass5IH A004 = C107335Hu.A00(r5, r1);
                C107405Ib r0 = A004.A01;
                if (r0 == null) {
                    break;
                }
                C33011hn A005 = C107405Ib.A00(stringBuffer, r0, A004);
                C33011hn A0052 = C107405Ib.A00(stringBuffer, r0, A004);
                try {
                } catch (Exception unused) {
                    stringBuffer.append(r5.A01);
                    stringBuffer.append(" value = ");
                    str = "*****";
                }
                if (r5.A04(AnonymousClass5IH.A09)) {
                    A003 = new AnonymousClass5Hn(new BigInteger(1, C33041hq.A00(A0052.A05()).A01));
                } else {
                    if (r5.A04(AnonymousClass5IH.A0C)) {
                        StringBuilder A0o = AnonymousClass000.A0o();
                        A0o.append("Base CRL: ");
                        A002 = AnonymousClass000.A0f(new AnonymousClass5Hn(new BigInteger(1, C33041hq.A00(A0052.A05()).A01)), A0o);
                    } else if (r5.A04(AnonymousClass5IH.A0K)) {
                        A003 = AnonymousClass5IF.A00(A0052.A05());
                    } else if (r5.A04(AnonymousClass5IH.A08)) {
                        A003 = AnonymousClass5I6.A00(A0052.A05());
                    } else if (r5.A04(AnonymousClass5IH.A0F)) {
                        A003 = AnonymousClass5I6.A00(A0052.A05());
                    } else {
                        stringBuffer.append(r5.A01);
                        stringBuffer.append(" value = ");
                        A002 = AnonymousClass4YA.A00(A0052.A05());
                    }
                    stringBuffer.append(A002);
                    stringBuffer.append(str2);
                }
                stringBuffer.append(A003);
                stringBuffer.append(str2);
                break;
                break;
            }
        }
        Set<? extends X509CRLEntry> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object append : revokedCertificates) {
                stringBuffer.append(append);
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    public void verify(PublicKey publicKey) {
        A03(publicKey, new IDxSCreatorShape469S0100000_2_I1(this, 0));
    }

    public void verify(PublicKey publicKey, String str) {
        A03(publicKey, new IDxSCreatorShape10S1100000_2_I1(0, str, this));
    }

    public void verify(PublicKey publicKey, Provider provider) {
        try {
            A03(publicKey, new IDxSCreatorShape118S0200000_2_I1(provider, 0, this));
        } catch (NoSuchProviderException e2) {
            throw new NoSuchAlgorithmException(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("provider issue: ")));
        }
    }
}
