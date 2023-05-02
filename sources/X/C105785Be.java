package X;

import com.facebook.redex.IDxSCreatorShape10S1100000_2_I1;
import com.facebook.redex.IDxSCreatorShape118S0200000_2_I1;
import com.facebook.redex.IDxSCreatorShape469S0100000_2_I1;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.5Be  reason: invalid class name and case insensitive filesystem */
public abstract class C105785Be extends X509Certificate implements AnonymousClass5NO {
    public C33091hv basicConstraints;
    public AnonymousClass5NQ bcHelper;

    /* renamed from: c  reason: collision with root package name */
    public AnonymousClass5I2 f154c;
    public boolean[] keyUsage;
    public String sigAlgName;
    public byte[] sigAlgParams;

    public C105785Be(String str, C33091hv r2, AnonymousClass5I2 r3, AnonymousClass5NQ r4, byte[] bArr, boolean[] zArr) {
        this.bcHelper = r4;
        this.f154c = r3;
        this.basicConstraints = r2;
        this.keyUsage = zArr;
        this.sigAlgName = str;
        this.sigAlgParams = bArr;
    }

    public static Collection A00(String str, AnonymousClass5I2 r6) {
        String str2;
        byte[] A03 = A03(str, r6);
        if (A03 != null) {
            try {
                ArrayList A0u = AnonymousClass000.A0u();
                Enumeration A0B = C32411gJ.A00(A03).A0B();
                while (A0B.hasMoreElements()) {
                    AnonymousClass5IP A00 = AnonymousClass5IP.A00(A0B.nextElement());
                    ArrayList A0u2 = AnonymousClass000.A0u();
                    int i2 = A00.A00;
                    C13690nt.A1O(A0u2, i2);
                    switch (i2) {
                        case 0:
                        case 3:
                        case 5:
                            A0u2.add(A00.A01());
                            break;
                        case 4:
                            str2 = AnonymousClass5IQ.A02(A00.A01, AnonymousClass5J6.A0l).toString();
                            break;
                        case 7:
                            try {
                                str2 = InetAddress.getByAddress(C107405Ib.A01(A00.A01).A00).getHostAddress();
                                break;
                            } catch (UnknownHostException unused) {
                                break;
                            }
                        case 8:
                            str2 = C32041fY.A00(A00.A01).A01;
                            break;
                        default:
                            str2 = ((C33031hp) A00.A01).AGJ();
                            break;
                    }
                    A0u2.add(str2);
                    A0u.add(Collections.unmodifiableList(A0u2));
                }
                if (A0u.size() != 0) {
                    return Collections.unmodifiableCollection(A0u);
                }
            } catch (Exception e2) {
                throw new CertificateParsingException(e2.getMessage());
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r2.A00 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r0 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r1.equals(X.C107275Hc.A00) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(java.security.PublicKey r5, java.security.Signature r6, X.C32071fb r7, byte[] r8) {
        /*
            r4 = this;
            X.5I2 r0 = r4.f154c
            X.5II r3 = r0.A02
            X.5I3 r0 = r0.A03
            X.5II r2 = r0.A07
            X.1fY r1 = r3.A01
            X.1fY r0 = r2.A01
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "org.spongycastle.x509.allow_absent_equiv_NULL"
            boolean r0 = X.C89714cm.A01(r0)
            if (r0 == 0) goto L_0x0037
            X.1fb r1 = r3.A00
            if (r1 != 0) goto L_0x0032
            X.1fb r1 = r2.A00
            if (r1 == 0) goto L_0x0043
        L_0x0022:
            X.5Hc r0 = X.C107275Hc.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0043
        L_0x002a:
            java.lang.String r1 = "signature algorithm in TBS cert not same as outer cert"
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            r0.<init>(r1)
            throw r0
        L_0x0032:
            X.1fb r0 = r2.A00
            if (r0 != 0) goto L_0x0037
            goto L_0x0022
        L_0x0037:
            X.1fb r1 = r3.A00
            X.1fb r0 = r2.A00
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.equals(r0)
        L_0x0041:
            if (r0 == 0) goto L_0x002a
        L_0x0043:
            X.C90754ek.A03(r6, r7)
            r6.initVerify(r5)
            goto L_0x0051
        L_0x004a:
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.equals(r1)
            goto L_0x0041
        L_0x0051:
            X.40a r1 = new X.40a     // Catch:{ IOException -> 0x0078 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0078 }
            r0 = 512(0x200, float:7.175E-43)
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0078 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0078 }
            X.5I2 r0 = r4.f154c     // Catch:{ IOException -> 0x0078 }
            X.5I3 r1 = r0.A03     // Catch:{ IOException -> 0x0078 }
            java.lang.String r0 = "DER"
            r1.A00(r2, r0)     // Catch:{ IOException -> 0x0078 }
            r2.close()     // Catch:{ IOException -> 0x0078 }
            boolean r0 = r6.verify(r8)
            if (r0 == 0) goto L_0x0070
            return
        L_0x0070:
            java.lang.String r1 = "certificate does not verify with supplied key"
            java.security.SignatureException r0 = new java.security.SignatureException
            r0.<init>(r1)
            throw r0
        L_0x0078:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105785Be.A01(java.security.PublicKey, java.security.Signature, X.1fb, byte[]):void");
    }

    private void A02(PublicKey publicKey, AnonymousClass5R3 r10) {
        boolean A04 = C109705Tg.A0C.A04(this.f154c.A02.A01);
        AnonymousClass5II r0 = this.f154c.A02;
        if (A04) {
            C32411gJ A00 = C32411gJ.A00(r0.A00);
            C32411gJ A002 = C32411gJ.A00(AnonymousClass5HY.A00(this.f154c.A01).A0A());
            boolean z2 = false;
            for (int i2 = 0; i2 != A002.A0A(); i2++) {
                AnonymousClass5II A003 = AnonymousClass5II.A00(A00.A0C(i2));
                try {
                    A01(publicKey, r10.A7c(C90754ek.A01(A003)), A003.A00, AnonymousClass5HY.A00(A002.A0C(i2)).A0A());
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
        A01(publicKey, r10.A7c(C90754ek.A01(r0)), this.f154c.A02.A00, getSignature());
    }

    public static byte[] A03(String str, AnonymousClass5I2 r3) {
        AnonymousClass5IH A00;
        C107405Ib r0;
        C107335Hu r1 = r3.A03.A08;
        if (r1 == null || (A00 = C107335Hu.A00(AnonymousClass3K3.A0w(str), r1)) == null || (r0 = A00.A01) == null) {
            return null;
        }
        return r0.A00;
    }

    public void checkValidity() {
        checkValidity(new Date());
    }

    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException(AnonymousClass000.A0h(this.f154c.A03.A0A.A03(), AnonymousClass000.A0r("certificate expired on ")));
        } else if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException(AnonymousClass000.A0h(this.f154c.A03.A0B.A03(), AnonymousClass000.A0r("certificate not valid till ")));
        }
    }

    public int getBasicConstraints() {
        C33051hr r0;
        C33091hv r2 = this.basicConstraints;
        if (r2 == null || (r0 = r2.A00) == null || r0.A00 == 0) {
            return -1;
        }
        C33041hq r02 = r2.A01;
        if (r02 == null) {
            return Integer.MAX_VALUE;
        }
        new BigInteger(r02.A01);
        C33041hq r03 = this.basicConstraints.A01;
        return (r03 != null ? new BigInteger(r03.A01) : null).intValue();
    }

    public Set getCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet A0o = C13680ns.A0o();
            C107335Hu r3 = this.f154c.A03.A08;
            if (r3 != null) {
                Enumeration elements = r3.A01.elements();
                while (elements.hasMoreElements()) {
                    C32041fY r1 = (C32041fY) elements.nextElement();
                    if (C107335Hu.A00(r1, r3).A02) {
                        A0o.add(r1.A01);
                    }
                }
                return A0o;
            }
        }
        return null;
    }

    public byte[] getEncoded() {
        try {
            return this.f154c.A02("DER");
        } catch (IOException e2) {
            throw new CertificateEncodingException(e2.toString());
        }
    }

    public List getExtendedKeyUsage() {
        byte[] A03 = A03("2.5.29.37", this.f154c);
        if (A03 == null) {
            return null;
        }
        try {
            C32411gJ A00 = C32411gJ.A00(C32051fZ.A02(A03));
            ArrayList A0u = AnonymousClass000.A0u();
            for (int i2 = 0; i2 != A00.A0A(); i2++) {
                A0u.add(((C32041fY) A00.A0C(i2)).A01);
            }
            return Collections.unmodifiableList(A0u);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = X.C107335Hu.A00(X.AnonymousClass3K3.A0w(r4), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getExtensionValue(java.lang.String r4) {
        /*
            r3 = this;
            X.5I2 r0 = r3.f154c
            X.5I3 r0 = r0.A03
            X.5Hu r1 = r0.A08
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
        throw new UnsupportedOperationException("Method not decompiled: X.C105785Be.getExtensionValue(java.lang.String):byte[]");
    }

    public Collection getIssuerAlternativeNames() {
        return A00(AnonymousClass5IH.A0J.A01, this.f154c);
    }

    public Principal getIssuerDN() {
        return new AnonymousClass5J8(this.f154c.A03.A05);
    }

    public boolean[] getIssuerUniqueID() {
        AnonymousClass5HY r1 = this.f154c.A03.A03;
        if (r1 == null) {
            return null;
        }
        byte[] A0A = r1.A0A();
        int length = (A0A.length << 3) - r1.A00;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 != length; i2++) {
            zArr[i2] = AnonymousClass000.A1O(A0A[i2 >> 3] & (128 >>> (i2 % 8)));
        }
        return zArr;
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.f154c.A03.A05.A02("DER"));
        } catch (IOException unused) {
            throw AnonymousClass000.A0V("can't encode issuer DN");
        }
    }

    public boolean[] getKeyUsage() {
        boolean[] zArr = this.keyUsage;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() == 3) {
            HashSet A0o = C13680ns.A0o();
            C107335Hu r3 = this.f154c.A03.A08;
            if (r3 != null) {
                Enumeration elements = r3.A01.elements();
                while (elements.hasMoreElements()) {
                    C32041fY r1 = (C32041fY) elements.nextElement();
                    if (!C107335Hu.A00(r1, r3).A02) {
                        A0o.add(r1.A01);
                    }
                }
                return A0o;
            }
        }
        return null;
    }

    public Date getNotAfter() {
        return this.f154c.A03.A0A.A04();
    }

    public Date getNotBefore() {
        return this.f154c.A03.A0B.A04();
    }

    public PublicKey getPublicKey() {
        try {
            C32041fY r0 = this.f154c.A03.A09.A01.A01;
            Map map = AnonymousClass1UN.A00;
            synchronized (map) {
                map.get(r0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(this.f154c.A03.A00.A01);
    }

    public String getSigAlgName() {
        return this.sigAlgName;
    }

    public String getSigAlgOID() {
        return this.f154c.A02.A01.A01;
    }

    public byte[] getSigAlgParams() {
        return C33111hx.A02(this.sigAlgParams);
    }

    public byte[] getSignature() {
        AnonymousClass5HY r1 = this.f154c.A01;
        if (r1.A00 == 0) {
            return C33111hx.A02(r1.A01);
        }
        throw AnonymousClass000.A0V("attempt to get non-octet aligned data from BIT STRING");
    }

    public Collection getSubjectAlternativeNames() {
        return A00(AnonymousClass5IH.A0U.A01, this.f154c);
    }

    public Principal getSubjectDN() {
        return new AnonymousClass5J8(this.f154c.A03.A06);
    }

    public boolean[] getSubjectUniqueID() {
        AnonymousClass5HY r1 = this.f154c.A03.A04;
        if (r1 == null) {
            return null;
        }
        byte[] A0A = r1.A0A();
        int length = (A0A.length << 3) - r1.A00;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 != length; i2++) {
            zArr[i2] = AnonymousClass000.A1O(A0A[i2 >> 3] & (128 >>> (i2 % 8)));
        }
        return zArr;
    }

    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.f154c.A03.A06.A02("DER"));
        } catch (IOException unused) {
            throw AnonymousClass000.A0V("can't encode subject DN");
        }
    }

    public byte[] getTBSCertificate() {
        try {
            return this.f154c.A03.A02("DER");
        } catch (IOException e2) {
            throw new CertificateEncodingException(e2.toString());
        }
    }

    public int getVersion() {
        return this.f154c.A03.A01.A0A() + 1;
    }

    public boolean hasUnsupportedCriticalExtension() {
        C107335Hu r1;
        if (getVersion() != 3 || (r1 = this.f154c.A03.A08) == null) {
            return false;
        }
        Enumeration elements = r1.A01.elements();
        while (elements.hasMoreElements()) {
            C32051fZ r2 = (C32051fZ) elements.nextElement();
            if (!r2.A04(AnonymousClass5IH.A0L) && !r2.A04(AnonymousClass5IH.A0B) && !r2.A04(AnonymousClass5IH.A0Q) && !r2.A04(AnonymousClass5IH.A0G) && !r2.A04(AnonymousClass5IH.A08) && !r2.A04(AnonymousClass5IH.A0K) && !r2.A04(AnonymousClass5IH.A0C) && !r2.A04(AnonymousClass5IH.A0P) && !r2.A04(AnonymousClass5IH.A06) && !r2.A04(AnonymousClass5IH.A0U) && !r2.A04(AnonymousClass5IH.A0N) && C107335Hu.A00(r2, r1).A02) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        Object r6;
        StringBuffer stringBuffer = new StringBuffer();
        String str = C32941ha.A00;
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.sigAlgName);
        stringBuffer.append(str);
        C90754ek.A02(str, stringBuffer, getSignature());
        C107335Hu r1 = this.f154c.A03.A08;
        if (r1 != null) {
            Enumeration elements = r1.A01.elements();
            if (elements.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (elements.hasMoreElements()) {
                C32041fY r5 = (C32041fY) elements.nextElement();
                AnonymousClass5IH A00 = C107335Hu.A00(r5, r1);
                C107405Ib r0 = A00.A01;
                if (r0 != null) {
                    C33011hn A002 = C107405Ib.A00(stringBuffer, r0, A00);
                    try {
                        if (r5.A04(AnonymousClass5IH.A06)) {
                            r6 = C33091hv.A00(A002.A05());
                        } else if (r5.A04(AnonymousClass5IH.A0L)) {
                            C32051fZ A05 = A002.A05();
                            r6 = A05 != null ? new AnonymousClass5Ho(AnonymousClass5HY.A00(A05)) : null;
                        } else if (r5.A04(C109705Tg.A0R)) {
                            r6 = new AnonymousClass5J0(AnonymousClass5HY.A00(A002.A05()));
                        } else if (r5.A04(C109705Tg.A0T)) {
                            r6 = new AnonymousClass5J1(C33021ho.A00(A002.A05()));
                        } else if (r5.A04(C109705Tg.A0Z)) {
                            r6 = new AnonymousClass5J2(C33021ho.A00(A002.A05()));
                        } else {
                            stringBuffer.append(r5.A01);
                            stringBuffer.append(" value = ");
                            stringBuffer.append(AnonymousClass4YA.A00(A002.A05()));
                            stringBuffer.append(str);
                        }
                        stringBuffer.append(r6);
                        stringBuffer.append(str);
                    } catch (Exception unused) {
                        stringBuffer.append(r5.A01);
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                    }
                }
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    public final void verify(PublicKey publicKey) {
        A02(publicKey, new IDxSCreatorShape469S0100000_2_I1(this, 1));
    }

    public final void verify(PublicKey publicKey, String str) {
        A02(publicKey, new IDxSCreatorShape10S1100000_2_I1(1, str, this));
    }

    public final void verify(PublicKey publicKey, Provider provider) {
        try {
            A02(publicKey, new IDxSCreatorShape118S0200000_2_I1(provider, 1, this));
        } catch (NoSuchProviderException e2) {
            throw new NoSuchAlgorithmException(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("provider issue: ")));
        }
    }
}
