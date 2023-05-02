package X;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5A7  reason: invalid class name */
public class AnonymousClass5A7 implements AnonymousClass5SG {
    public static final Map A05;
    public String A00;
    public C85284Nv A01;
    public boolean A02;
    public final AnonymousClass5NQ A03;
    public final AnonymousClass5BY A04;

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A05 = A0x;
        A0x.put(AnonymousClass3K3.A0w("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        A0x.put(C32031fX.A2D, "SHA224WITHRSA");
        A0x.put(C32031fX.A2E, "SHA256WITHRSA");
        AnonymousClass3K2.A1O(C32031fX.A2F, A0x);
        AnonymousClass3K2.A1P(C32111ff.A0G, A0x);
    }

    public AnonymousClass5A7(AnonymousClass5NQ r1, AnonymousClass5BY r2) {
        this.A04 = r2;
        this.A03 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0116, code lost:
        if (r0 == false) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b A[Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0121 A[Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123 A[Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d1 A[Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f0 A[Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.security.cert.X509Certificate r12, X.AnonymousClass5I0 r13, X.C85284Nv r14, X.AnonymousClass5NQ r15, byte[] r16) {
        /*
            java.lang.String r11 = "OCSP response failure: "
            X.1gJ r1 = r13.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5II r4 = r13.A03     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fb r3 = r4.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r3 == 0) goto L_0x0044
            X.5Hc r2 = X.C107275Hc.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r2 == r3) goto L_0x0044
            X.1fZ r0 = r3.Agm()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = r2.A09(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 != 0) goto L_0x0044
            X.1fY r2 = r4.A01     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fY r0 = X.C32031fX.A0I     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = r2.A04(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 == 0) goto L_0x0044
            boolean r0 = r3 instanceof X.AnonymousClass5IB     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 == 0) goto L_0x0037
            X.5IB r3 = (X.AnonymousClass5IB) r3     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x0028:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5II r0 = r3.A02     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fY r2 = r0.A01     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.util.Map r0 = X.AnonymousClass4AH.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.lang.String r4 = X.C13690nt.A0e(r2, r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x0041
        L_0x0037:
            X.1gJ r0 = X.C32411gJ.A00(r3)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5IB r3 = new X.5IB     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r3.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x0028
        L_0x0041:
            if (r4 != 0) goto L_0x0058
            goto L_0x0056
        L_0x0044:
            java.util.Map r3 = A05     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fY r2 = r4.A01     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = r3.containsKey(r2)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = X.C13690nt.A0e(r2, r3)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x0083
        L_0x0053:
            java.lang.String r0 = r2.A01     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x0083
        L_0x0056:
            java.lang.String r4 = r2.A01     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x0058:
            r0 = 45
            int r3 = r4.indexOf(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r3 <= 0) goto L_0x007a
            java.lang.String r0 = "SHA3"
            boolean r0 = r4.startsWith(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 != 0) goto L_0x007a
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r0 = 0
            X.AnonymousClass3K3.A1M(r4, r2, r0, r3)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            int r0 = r3 + 1
            java.lang.String r0 = r4.substring(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.lang.String r4 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x007a:
            r5.append(r4)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.lang.String r0 = "WITHRSAANDMGF1"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r5)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x0083:
            X.5AA r15 = (X.AnonymousClass5AA) r15     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.security.Provider r10 = r15.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.security.Signature r5 = java.security.Signature.getInstance(r0, r10)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.security.cert.X509Certificate r7 = r14.A03     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5IC r4 = r13.A02     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5IL r0 = r4.A03     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fb r9 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r8 = r9 instanceof X.C107405Ib     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r8 == 0) goto L_0x00e0
            r0 = r9
            X.5Ib r0 = (X.C107405Ib) r0     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r2 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r2 == 0) goto L_0x00e0
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0, r10)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r12 == 0) goto L_0x00c3
            java.security.PublicKey r0 = r12.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5Hx r0 = X.C107365Hx.A00(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5HY r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.A0A()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r3.digest(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 == 0) goto L_0x00c3
            goto L_0x011d
        L_0x00c3:
            if (r7 == 0) goto L_0x0118
            java.security.PublicKey r0 = r7.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5Hx r0 = X.C107365Hx.A00(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5HY r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.A0A()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r3.digest(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x0115
        L_0x00e0:
            X.4c5 r3 = X.AnonymousClass5J7.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r8 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00ea
        L_0x00e6:
            X.5IQ r0 = X.AnonymousClass5IQ.A01(r9)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x00ea:
            X.5IQ r2 = X.AnonymousClass5IQ.A02(r0, r3)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r12 == 0) goto L_0x0103
            javax.security.auth.x500.X500Principal r0 = r12.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5IQ r0 = X.AnonymousClass5IQ.A02(r0, r3)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = r2.equals(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 == 0) goto L_0x0103
            goto L_0x011d
        L_0x0103:
            if (r7 == 0) goto L_0x0118
            javax.security.auth.x500.X500Principal r0 = r7.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5IQ r0 = X.AnonymousClass5IQ.A02(r0, r3)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = r2.equals(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x0115:
            r12 = r7
            if (r0 != 0) goto L_0x011d
        L_0x0118:
            r12 = 0
            if (r1 != 0) goto L_0x011d
            goto L_0x01ff
        L_0x011d:
            r3 = 0
            r2 = 0
            if (r12 == 0) goto L_0x0123
            goto L_0x01b5
        L_0x0123:
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r0, r10)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fb r0 = r1.A0C(r3)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fZ r0 = r0.Agm()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r1 = r0.A01()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r0.<init>(r1)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.security.cert.Certificate r6 = r6.generateCertificate(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.security.PublicKey r0 = r7.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r6.verify(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.util.Date r0 = r14.A04     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            long r0 = r0.getTime()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.util.Date r7 = new java.util.Date     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r7.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r6.checkValidity(r7)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r8 == 0) goto L_0x017f
            r0 = r9
            X.5Ib r0 = (X.C107405Ib) r0     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r7 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r7 == 0) goto L_0x017f
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0, r10)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.security.PublicKey r0 = r6.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5Hx r0 = X.C107365Hx.A00(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5HY r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.A0A()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r1.digest(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = java.util.Arrays.equals(r7, r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x019d
        L_0x017f:
            X.4c5 r7 = X.AnonymousClass5J7.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r8 == 0) goto L_0x0185
            r0 = 0
            goto L_0x0189
        L_0x0185:
            X.5IQ r0 = X.AnonymousClass5IQ.A01(r9)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x0189:
            X.5IQ r1 = X.AnonymousClass5IQ.A02(r0, r7)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            javax.security.auth.x500.X500Principal r0 = r6.getSubjectX500Principal()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.getEncoded()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5IQ r0 = X.AnonymousClass5IQ.A02(r0, r7)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = r1.equals(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x019d:
            if (r0 == 0) goto L_0x01f8
            java.util.List r1 = r6.getExtendedKeyUsage()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r1 == 0) goto L_0x01f1
            X.5I4 r0 = X.AnonymousClass5I4.A03     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fY r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            java.lang.String r0 = r0.A01     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = r1.contains(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 == 0) goto L_0x01f1
            r5.initVerify(r6)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x01bc
        L_0x01b5:
            java.security.PublicKey r0 = r12.getPublicKey()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r5.initVerify(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x01bc:
            java.lang.String r0 = "DER"
            byte[] r0 = r4.A02(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r5.update(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5HY r0 = r13.A01     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.A0A()     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = r5.verify(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 == 0) goto L_0x01f0
            r3 = r16
            if (r16 == 0) goto L_0x01ee
            X.5Hu r1 = r4.A04     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.1fY r0 = X.C109655Tb.A06     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5IH r0 = X.C107335Hu.A00(r0, r1)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            X.5Ib r0 = r0.A01     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            byte[] r0 = r0.A00     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            if (r0 != 0) goto L_0x01ee
            java.lang.String r0 = "nonce mismatch in OCSP response"
            java.security.cert.CertPathValidatorException r1 = X.C85284Nv.A00(r0, r2, r14)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x0206
        L_0x01ee:
            r0 = 1
            return r0
        L_0x01f0:
            return r3
        L_0x01f1:
            java.lang.String r0 = "responder certificate not valid for signing OCSP responses"
            java.security.cert.CertPathValidatorException r1 = X.C85284Nv.A00(r0, r2, r14)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x0206
        L_0x01f8:
            java.lang.String r0 = "responder certificate does not match responderID"
            java.security.cert.CertPathValidatorException r1 = X.C85284Nv.A00(r0, r2, r14)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            goto L_0x0206
        L_0x01ff:
            java.lang.String r0 = "OCSP responder certificate not found"
            java.security.cert.CertPathValidatorException r1 = new java.security.cert.CertPathValidatorException     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
            r1.<init>(r0)     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x0206:
            throw r1     // Catch:{ CertPathValidatorException -> 0x0219, IOException | GeneralSecurityException -> 0x0207 }
        L_0x0207:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r11)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.security.cert.CertPathValidatorException r0 = X.C85284Nv.A00(r0, r2, r14)
            throw r0
        L_0x0219:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5A7.A00(java.security.cert.X509Certificate, X.5I0, X.4Nv, X.5NQ, byte[]):boolean");
    }

    public final AnonymousClass5I1 A01(C33041hq r6, AnonymousClass5II r7, AnonymousClass5I2 r8) {
        try {
            AnonymousClass5NQ r3 = this.A03;
            C32041fY r2 = r7.A01;
            String A0e = C13690nt.A0e(r2, AnonymousClass4AH.A00);
            if (A0e == null) {
                A0e = r2.A01;
            }
            MessageDigest instance = MessageDigest.getInstance(A0e, ((AnonymousClass5AA) r3).A00);
            AnonymousClass5I3 r32 = r8.A03;
            return new AnonymousClass5I1(r6, new AnonymousClass5IT(instance.digest(r32.A06.A02("DER"))), new AnonymousClass5IT(instance.digest(r32.A09.A00.A0A())), r7);
        } catch (Exception e2) {
            throw new CertPathValidatorException(AnonymousClass000.A0g("problem creating ID: ", e2), e2);
        }
    }

    public final AnonymousClass5I2 A02() {
        try {
            return AnonymousClass5I2.A00(this.A01.A03.getEncoded());
        } catch (Exception e2) {
            throw C85284Nv.A00(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("cannot process signing cert: ")), e2, this.A01);
        }
    }

    public void AIJ(C85284Nv r2) {
        this.A01 = r2;
        this.A02 = C89714cm.A01("ocsp.enable");
        this.A00 = C89714cm.A00("ocsp.responderURL");
    }

    public void check(Certificate certificate) {
        boolean z2;
        byte[] bArr;
        Throwable A002;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        AnonymousClass5BY r1 = this.A04;
        Map<X509Certificate, byte[]> ocspResponses = r1.getOcspResponses();
        URI ocspResponder = r1.getOcspResponder();
        if (ocspResponder == null) {
            String str = this.A00;
            if (str != null) {
                try {
                    ocspResponder = new URI(str);
                } catch (URISyntaxException e2) {
                    throw C85284Nv.A00(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("configuration error: ")), e2, this.A01);
                }
            } else {
                byte[] extensionValue = x509Certificate.getExtensionValue(AnonymousClass5IH.A04.A01);
                ocspResponder = null;
                if (extensionValue != null) {
                    byte[] bArr2 = C107405Ib.A01(extensionValue).A00;
                    AnonymousClass5I5[] r2 = (bArr2 instanceof AnonymousClass5Hm ? (AnonymousClass5Hm) bArr2 : bArr2 != null ? new AnonymousClass5Hm(C32411gJ.A00(bArr2)) : null).A00;
                    int length = r2.length;
                    AnonymousClass5I5[] r8 = new AnonymousClass5I5[length];
                    System.arraycopy(r2, 0, r8, 0, length);
                    int i2 = 0;
                    while (true) {
                        if (i2 == length) {
                            break;
                        }
                        AnonymousClass5I5 r3 = r8[i2];
                        if (AnonymousClass5I5.A03.A04(r3.A00)) {
                            AnonymousClass5IP r32 = r3.A01;
                            if (r32.A00 == 6) {
                                try {
                                    ocspResponder = new URI(((C33031hp) r32.A01).AGJ());
                                    break;
                                } catch (URISyntaxException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2++;
                    }
                }
            }
        }
        if (ocspResponses.get(x509Certificate) != null || ocspResponder == null) {
            List<Extension> ocspExtensions = r1.getOcspExtensions();
            bArr = null;
            for (int i3 = 0; i3 != ocspExtensions.size(); i3++) {
                Extension extension = ocspExtensions.get(i3);
                byte[] value = extension.getValue();
                if ("1.3.6.1.5.5.7.48.1.2".equals(extension.getId())) {
                    bArr = value;
                }
            }
            z2 = false;
        } else if (this.A00 == null && r1.getOcspResponder() == null && !this.A02) {
            C85284Nv r0 = this.A01;
            throw new AnonymousClass5BR("OCSP disabled by \"ocsp.enable\" setting", r0.A02, r0.A00);
        } else {
            try {
                ocspResponses.put(x509Certificate, AnonymousClass4Yo.A00(ocspResponder, r1.getOcspResponderCert(), r1.getOcspExtensions(), A01(new C33041hq(x509Certificate.getSerialNumber()), new AnonymousClass5II(C32341gA.A07), A02()), this.A01, this.A03).A01());
                bArr = null;
                z2 = true;
            } catch (IOException e3) {
                C85284Nv r02 = this.A01;
                throw new CertPathValidatorException("unable to encode OCSP response", e3, r02.A02, r02.A00);
            }
        }
        if (!ocspResponses.isEmpty()) {
            byte[] bArr3 = ocspResponses.get(x509Certificate);
            C107315Hg r7 = bArr3 instanceof C107315Hg ? (C107315Hg) bArr3 : bArr3 != null ? new C107315Hg(C32411gJ.A00(bArr3)) : null;
            C33041hq r82 = new C33041hq(x509Certificate.getSerialNumber());
            if (r7 != null) {
                AnonymousClass5IZ r6 = r7.A00.A00;
                if (r6.A0A() == 0) {
                    C107325Ht r72 = r7.A01;
                    if (r72 == null) {
                        r72 = null;
                    }
                    if (r72.A00.A04(C109655Tb.A02)) {
                        try {
                            byte[] bArr4 = r72.A01.A00;
                            AnonymousClass5I0 r73 = bArr4 instanceof AnonymousClass5I0 ? (AnonymousClass5I0) bArr4 : bArr4 != null ? new AnonymousClass5I0(C32411gJ.A00(bArr4)) : null;
                            if (!z2) {
                                if (!A00(r1.getOcspResponderCert(), r73, this.A01, this.A03, bArr)) {
                                    return;
                                }
                            }
                            AnonymousClass5IC r03 = r73.A02;
                            if (r03 == null) {
                                r03 = null;
                            }
                            C32411gJ r74 = r03.A02;
                            AnonymousClass5I1 r10 = null;
                            for (int i4 = 0; i4 != r74.A0A(); i4++) {
                                C32071fb A0C = r74.A0C(i4);
                                AnonymousClass5Hj r62 = A0C instanceof AnonymousClass5Hj ? (AnonymousClass5Hj) A0C : A0C != null ? new AnonymousClass5Hj(C32411gJ.A00(A0C)) : null;
                                AnonymousClass5I1 r9 = r62.A02;
                                if (r82.A04(r9.A00)) {
                                    C107395Ia r12 = r62.A00;
                                    if (r12 == null || !new Date(this.A01.A04.getTime()).after(r12.A0C())) {
                                        if (r10 == null || !r10.A03.equals(r9.A03)) {
                                            r10 = A01(r82, r9.A03, A02());
                                        }
                                        if (r10.equals(r9)) {
                                            AnonymousClass5IM r13 = r62.A03;
                                            int i5 = r13.A00;
                                            if (i5 == 0) {
                                                return;
                                            }
                                            if (i5 == 1) {
                                                C32071fb r4 = r13.A01;
                                                AnonymousClass5Hh r42 = r4 instanceof AnonymousClass5Hh ? (AnonymousClass5Hh) r4 : r4 != null ? new AnonymousClass5Hh(C32411gJ.A00(r4)) : null;
                                                AnonymousClass5ID r22 = r42.A01;
                                                StringBuilder A0o = AnonymousClass000.A0o();
                                                A0o.append("certificate revoked, reason=(");
                                                A0o.append(r22);
                                                A0o.append("), date=");
                                                A002 = C85284Nv.A00(AnonymousClass000.A0f(r42.A00.A0C(), A0o), (Throwable) null, this.A01);
                                            } else {
                                                A002 = C85284Nv.A00("certificate revoked, details unknown", (Throwable) null, this.A01);
                                            }
                                        }
                                    } else {
                                        A002 = new AnonymousClass5BS();
                                    }
                                    throw A002;
                                }
                            }
                        } catch (CertPathValidatorException e4) {
                            throw e4;
                        } catch (Exception e5) {
                            C85284Nv r04 = this.A01;
                            throw new CertPathValidatorException("unable to process OCSP response", e5, r04.A02, r04.A00);
                        }
                    }
                } else {
                    throw C85284Nv.A00(AnonymousClass000.A0f(new BigInteger(r6.A01), AnonymousClass000.A0r("OCSP response failed: ")), (Throwable) null, this.A01);
                }
            } else {
                C85284Nv r05 = this.A01;
                throw new AnonymousClass5BR("no OCSP response found for certificate", r05.A02, r05.A00);
            }
        } else {
            C85284Nv r06 = this.A01;
            throw new AnonymousClass5BR("no OCSP response found for any certificate", r06.A02, r06.A00);
        }
    }
}
