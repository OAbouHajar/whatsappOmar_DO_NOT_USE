package X;

import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1fp  reason: invalid class name and case insensitive filesystem */
public class C32211fp {
    public static final Class A00 = C32971hd.A00(C32211fp.class, "java.security.cert.PKIXRevocationChecker");
    public static final String A01 = AnonymousClass5IH.A05.A01;
    public static final String A02 = AnonymousClass5IH.A06.A01;
    public static final String A03 = AnonymousClass5IH.A0B.A01;
    public static final String A04 = AnonymousClass5IH.A08.A01;
    public static final String A05 = AnonymousClass5IH.A0C.A01;
    public static final String A06 = AnonymousClass5IH.A0G.A01;
    public static final String A07 = AnonymousClass5IH.A0K.A01;
    public static final String A08 = AnonymousClass5IH.A0L.A01;
    public static final String A09 = AnonymousClass5IH.A0N.A01;
    public static final String A0A = AnonymousClass5IH.A0P.A01;
    public static final String A0B = AnonymousClass5IH.A0Q.A01;
    public static final String A0C = AnonymousClass5IH.A0U.A01;
    public static final String[] A0D = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    public static int A00(CertPath certPath, int i2, int i3) {
        try {
            C32411gJ A002 = C32411gJ.A00(C90924f5.A07(A0A, (X509Certificate) certPath.getCertificates().get(i2)));
            if (A002 != null) {
                Enumeration A0B2 = A002.A0B();
                while (true) {
                    if (!A0B2.hasMoreElements()) {
                        break;
                    }
                    try {
                        C107525In A012 = C107525In.A01(A0B2.nextElement());
                        if (A012.A00 == 0) {
                            int A0A2 = C33041hq.A01(A012, false).A0A();
                            if (A0A2 < i3) {
                                return A0A2;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new AnonymousClass5BS("Policy constraints extension contents cannot be decoded.", e2, certPath, i2);
                    }
                }
            }
            return i3;
        } catch (Exception e3) {
            throw new AnonymousClass5BS("Policy constraints extension cannot be decoded.", e3, certPath, i2);
        }
    }

    public static int A01(CertPath certPath, int i2, int i3) {
        try {
            C32411gJ A002 = C32411gJ.A00(C90924f5.A07(A0A, (X509Certificate) certPath.getCertificates().get(i2)));
            if (A002 != null) {
                Enumeration A0B2 = A002.A0B();
                while (true) {
                    if (!A0B2.hasMoreElements()) {
                        break;
                    }
                    try {
                        C107525In A012 = C107525In.A01(A0B2.nextElement());
                        if (A012.A00 == 1) {
                            int A0A2 = C33041hq.A01(A012, false).A0A();
                            if (A0A2 < i3) {
                                return A0A2;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw new AnonymousClass5BS("Policy constraints extension contents cannot be decoded.", e2, certPath, i2);
                    }
                }
            }
            return i3;
        } catch (Exception e3) {
            throw new AnonymousClass5BS("Policy constraints extension cannot be decoded.", e3, certPath, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r0.A0A();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(java.security.cert.CertPath r3, int r4, int r5) {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r1 = r0.get(r4)
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            java.lang.String r0 = A06     // Catch:{ Exception -> 0x001e }
            X.1fZ r0 = X.C90924f5.A07(r0, r1)     // Catch:{ Exception -> 0x001e }
            X.1hq r0 = X.C33041hq.A00(r0)     // Catch:{ Exception -> 0x001e }
            if (r0 == 0) goto L_0x001d
            int r0 = r0.A0A()
            if (r0 >= r5) goto L_0x001d
            return r0
        L_0x001d:
            return r5
        L_0x001e:
            r2 = move-exception
            java.lang.String r1 = "Inhibit any-policy extension cannot be decoded."
            X.5BS r0 = new X.5BS
            r0.<init>(r1, r2, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32211fp.A02(java.security.cert.CertPath, int, int):int");
    }

    public static int A03(CertPath certPath, int i2, int i3) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i2);
        if (x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN())) {
            return i3;
        }
        if (i3 > 0) {
            return i3 - 1;
        }
        throw new AnonymousClass5BS("Max path length not greater than zero", (Throwable) null, certPath, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r0 = new java.math.BigInteger((r0 = r0.A01).A01).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(java.security.cert.CertPath r3, int r4, int r5) {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r1 = r0.get(r4)
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            java.lang.String r0 = A02     // Catch:{ Exception -> 0x0029 }
            X.1fZ r0 = X.C90924f5.A07(r0, r1)     // Catch:{ Exception -> 0x0029 }
            X.1hv r0 = X.C33091hv.A00(r0)     // Catch:{ Exception -> 0x0029 }
            if (r0 == 0) goto L_0x0028
            X.1hq r0 = r0.A01
            if (r0 == 0) goto L_0x0028
            byte[] r1 = r0.A01
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            int r0 = r0.intValue()
            if (r0 >= r5) goto L_0x0028
            return r0
        L_0x0028:
            return r5
        L_0x0029:
            r2 = move-exception
            java.lang.String r1 = "Basic constraints extension cannot be decoded."
            X.5BS r0 = new X.5BS
            r0.<init>(r1, r2, r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32211fp.A04(java.security.cert.CertPath, int, int):int");
    }

    public static int A05(CertPath certPath, int i2, int i3) {
        try {
            C32411gJ A002 = C32411gJ.A00(C90924f5.A07(A0A, (X509Certificate) certPath.getCertificates().get(i2)));
            if (A002 != null) {
                Enumeration A0B2 = A002.A0B();
                while (A0B2.hasMoreElements()) {
                    C107525In r2 = (C107525In) A0B2.nextElement();
                    if (r2.A00 == 0) {
                        try {
                            if (C33041hq.A01(r2, false).A0A() == 0) {
                                return 0;
                            }
                        } catch (Exception e2) {
                            throw new AnonymousClass5BS("Policy constraints requireExplicitPolicy field could not be decoded.", e2, certPath, i2);
                        }
                    }
                }
            }
            return i3;
        } catch (C803243k e3) {
            throw new AnonymousClass5BS("Policy constraints could not be decoded.", e3, certPath, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r10.isEmpty() != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0121, code lost:
        if (r13 != null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0123, code lost:
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0125, code lost:
        if (r8 < 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0127, code lost:
        r3 = r14[r8];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012e, code lost:
        if (r2 >= r3.size()) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0130, code lost:
        r1 = (X.AnonymousClass3IS) r3.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013e, code lost:
        if ((!r1.A03.isEmpty()) != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0140, code lost:
        r13 = X.C90924f5.A08(r13, r1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0144, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3IS A06(java.security.cert.CertPath r9, java.util.Set r10, java.util.Set r11, X.C1047156p r12, X.AnonymousClass3IS r13, java.util.List[] r14, int r15) {
        /*
            java.util.List r0 = r9.getCertificates()
            int r8 = r0.size()
            java.lang.String r2 = "Explicit policy requested but none available."
            r1 = 0
            if (r13 != 0) goto L_0x001c
            java.security.cert.PKIXParameters r0 = r12.A01
            boolean r0 = r0.isExplicitPolicyRequired()
            if (r0 == 0) goto L_0x001b
            X.5BS r0 = new X.5BS
            r0.<init>(r2, r1, r9, r15)
            throw r0
        L_0x001b:
            return r1
        L_0x001c:
            if (r10 == 0) goto L_0x002d
            java.lang.String r0 = "2.5.29.32.0"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x002d
            boolean r3 = r10.isEmpty()
            r0 = 0
            if (r3 == 0) goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            java.lang.String r3 = "2.5.29.32.0"
            if (r0 == 0) goto L_0x00bc
            java.security.cert.PKIXParameters r0 = r12.A01
            boolean r0 = r0.isExplicitPolicyRequired()
            if (r0 == 0) goto L_0x0147
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00b6
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r5 = 0
        L_0x0046:
            int r0 = r14.length
            if (r5 >= r0) goto L_0x007a
            r4 = r14[r5]
            r2 = 0
        L_0x004c:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0077
            java.lang.Object r1 = r4.get(r2)
            X.3IS r1 = (X.AnonymousClass3IS) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0074
            java.util.Iterator r1 = r1.getChildren()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r1.next()
            r6.add(r0)
            goto L_0x0066
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0077:
            int r5 = r5 + 1
            goto L_0x0046
        L_0x007a:
            java.util.Iterator r1 = r6.iterator()
        L_0x007e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.next()
            X.3IS r0 = (X.AnonymousClass3IS) r0
            java.lang.String r0 = r0.getValidPolicy()
            r11.contains(r0)
            goto L_0x007e
        L_0x0092:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x0147
            r3 = r14[r8]
            r2 = 0
        L_0x0099:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0092
            java.lang.Object r1 = r3.get(r2)
            X.3IS r1 = (X.AnonymousClass3IS) r1
            java.util.List r0 = r1.A03
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00b3
            X.3IS r13 = X.C90924f5.A08(r13, r1, r14)
        L_0x00b3:
            int r2 = r2 + 1
            goto L_0x0099
        L_0x00b6:
            X.5BS r0 = new X.5BS
            r0.<init>(r2, r1, r9, r15)
            throw r0
        L_0x00bc:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r6 = 0
        L_0x00c2:
            int r0 = r14.length
            if (r6 >= r0) goto L_0x0102
            r5 = r14[r6]
            r4 = 0
        L_0x00c8:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x00ff
            java.lang.Object r1 = r5.get(r4)
            X.3IS r1 = (X.AnonymousClass3IS) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00fc
            java.util.Iterator r2 = r1.getChildren()
        L_0x00e2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r1 = r2.next()
            X.3IS r1 = (X.AnonymousClass3IS) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x00e2
            r7.add(r1)
            goto L_0x00e2
        L_0x00fc:
            int r4 = r4 + 1
            goto L_0x00c8
        L_0x00ff:
            int r6 = r6 + 1
            goto L_0x00c2
        L_0x0102:
            java.util.Iterator r2 = r7.iterator()
        L_0x0106:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r1 = r2.next()
            X.3IS r1 = (X.AnonymousClass3IS) r1
            java.lang.String r0 = r1.getValidPolicy()
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x0106
            X.3IS r13 = X.C90924f5.A08(r13, r1, r14)
            goto L_0x0106
        L_0x0121:
            if (r13 == 0) goto L_0x0147
        L_0x0123:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x0147
            r3 = r14[r8]
            r2 = 0
        L_0x012a:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0123
            java.lang.Object r1 = r3.get(r2)
            X.3IS r1 = (X.AnonymousClass3IS) r1
            java.util.List r0 = r1.A03
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0144
            X.3IS r13 = X.C90924f5.A08(r13, r1, r14)
        L_0x0144:
            int r2 = r2 + 1
            goto L_0x012a
        L_0x0147:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32211fp.A06(java.security.cert.CertPath, java.util.Set, java.util.Set, X.56p, X.3IS, java.util.List[], int):X.3IS");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r1 = new java.util.HashSet();
        r1.add(r7);
        r18 = new X.AnonymousClass3IS(r7, r6, new java.util.ArrayList(), r1, r23, r2, false);
        r6.A03.add(r18);
        r18.A02 = r6;
        r28[r2].add(r18);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3IS A07(java.security.cert.CertPath r25, java.util.Set r26, X.AnonymousClass3IS r27, java.util.List[] r28, int r29, int r30, boolean r31) {
        /*
            r14 = r25
            r5 = r27
            java.util.List r0 = r14.getCertificates()
            r10 = r29
            java.lang.Object r3 = r0.get(r10)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            int r9 = r0.size()
            int r2 = r9 - r29
            java.lang.String r13 = A03     // Catch:{ 43k -> 0x0210 }
            X.1fZ r0 = X.C90924f5.A07(r13, r3)     // Catch:{ 43k -> 0x0210 }
            X.1gJ r17 = X.C32411gJ.A00(r0)     // Catch:{ 43k -> 0x0210 }
            if (r17 == 0) goto L_0x020e
            if (r27 == 0) goto L_0x020e
            java.util.Enumeration r16 = r17.A0B()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
        L_0x002d:
            boolean r0 = r16.hasMoreElements()
            java.lang.String r11 = "2.5.29.32.0"
            r4 = r28
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r1 = r16.nextElement()
            if (r1 == 0) goto L_0x00c3
            boolean r0 = r1 instanceof X.AnonymousClass5Hp
            if (r0 != 0) goto L_0x00c3
            X.1gJ r0 = X.C32411gJ.A00(r1)
            X.5Hp r1 = new X.5Hp
            r1.<init>(r0)
        L_0x004a:
            X.1fY r0 = r1.A00
            java.lang.String r7 = r0.A01
            r8.add(r7)
            boolean r0 = r11.equals(r7)
            if (r0 != 0) goto L_0x002d
            X.1gJ r0 = r1.A01     // Catch:{ CertPathValidatorException -> 0x00c6 }
            java.util.Set r23 = X.C90924f5.A06(r0)     // Catch:{ CertPathValidatorException -> 0x00c6 }
            int r15 = r2 + -1
            r12 = r28[r15]
            r25 = 0
            r1 = 0
        L_0x0064:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x007d
            java.lang.Object r6 = r12.get(r1)
            X.3IS r6 = (X.AnonymousClass3IS) r6
            java.util.Set r0 = r6.getExpectedPolicies()
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L_0x0099
            int r1 = r1 + 1
            goto L_0x0064
        L_0x007d:
            r12 = r28[r15]
            r1 = 0
        L_0x0080:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x002d
            java.lang.Object r6 = r12.get(r1)
            X.3IS r6 = (X.AnonymousClass3IS) r6
            java.lang.String r0 = r6.getValidPolicy()
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0099
            int r1 = r1 + 1
            goto L_0x0080
        L_0x0099:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.add(r7)
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            X.3IS r0 = new X.3IS
            r24 = r2
            r18 = r0
            r19 = r7
            r20 = r6
            r22 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            java.util.List r1 = r6.A03
            r1.add(r0)
            r0.A02 = r6
            r1 = r28[r2]
            r1.add(r0)
            goto L_0x002d
        L_0x00c3:
            X.5Hp r1 = (X.AnonymousClass5Hp) r1
            goto L_0x004a
        L_0x00c6:
            r1 = move-exception
            java.lang.String r0 = "Policy qualifier info set could not be build."
            X.5BS r2 = new X.5BS
            r2.<init>(r0, r1, r14, r10)
            throw r2
        L_0x00cf:
            r10 = r26
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r10.contains(r11)
            if (r0 != 0) goto L_0x00fa
            java.util.Iterator r7 = r10.iterator()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L_0x00e6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0101
            java.lang.Object r1 = r7.next()
            boolean r0 = r8.contains(r1)
            if (r0 == 0) goto L_0x00e6
            r6.add(r1)
            goto L_0x00e6
        L_0x00fa:
            r10.clear()
            r10.addAll(r8)
            goto L_0x0107
        L_0x0101:
            r10.clear()
            r10.addAll(r6)
        L_0x0107:
            if (r30 > 0) goto L_0x011b
            if (r2 < r9) goto L_0x010d
            if (r31 == 0) goto L_0x01c7
        L_0x010d:
            java.security.Principal r1 = r3.getSubjectDN()
            java.security.Principal r0 = r3.getIssuerDN()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01c7
        L_0x011b:
            java.util.Enumeration r6 = r17.A0B()
        L_0x011f:
            boolean r0 = r6.hasMoreElements()
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r1 = r6.nextElement()
            if (r1 == 0) goto L_0x01c3
            boolean r0 = r1 instanceof X.AnonymousClass5Hp
            if (r0 != 0) goto L_0x01c3
            X.1gJ r0 = X.C32411gJ.A00(r1)
            X.5Hp r1 = new X.5Hp
            r1.<init>(r0)
        L_0x0138:
            X.1fY r0 = r1.A00
            java.lang.String r0 = r0.A01
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x011f
            X.1gJ r0 = r1.A01
            java.util.Set r19 = X.C90924f5.A06(r0)
            int r0 = r2 + -1
            r7 = r28[r0]
            r6 = 0
        L_0x014d:
            int r0 = r7.size()
            if (r6 >= r0) goto L_0x01c7
            java.lang.Object r1 = r7.get(r6)
            X.3IS r1 = (X.AnonymousClass3IS) r1
            java.util.Set r0 = r1.getExpectedPolicies()
            java.util.Iterator r10 = r0.iterator()
        L_0x0161:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r15 = r10.next()
            boolean r0 = r15 instanceof java.lang.String
            if (r0 == 0) goto L_0x01b7
            java.lang.String r15 = (java.lang.String) r15
        L_0x0171:
            java.util.Iterator r9 = r1.getChildren()
            r8 = 0
        L_0x0176:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x018e
            java.lang.Object r0 = r9.next()
            X.3IS r0 = (X.AnonymousClass3IS) r0
            java.lang.String r0 = r0.getValidPolicy()
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0176
            r8 = 1
            goto L_0x0176
        L_0x018e:
            if (r8 != 0) goto L_0x0161
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r0.add(r15)
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            r21 = 0
            X.3IS r14 = new X.3IS
            r20 = r2
            r18 = r0
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            java.util.List r0 = r1.A03
            r0.add(r14)
            r14.A02 = r1
            r0 = r28[r2]
            r0.add(r14)
            goto L_0x0161
        L_0x01b7:
            boolean r0 = r15 instanceof X.C32041fY
            if (r0 == 0) goto L_0x0161
            X.1fY r15 = (X.C32041fY) r15
            java.lang.String r15 = r15.A01
            goto L_0x0171
        L_0x01c0:
            int r6 = r6 + 1
            goto L_0x014d
        L_0x01c3:
            X.5Hp r1 = (X.AnonymousClass5Hp) r1
            goto L_0x0138
        L_0x01c7:
            int r8 = r2 + -1
        L_0x01c9:
            if (r8 < 0) goto L_0x01f0
            r7 = r28[r8]
            r6 = 0
        L_0x01ce:
            int r0 = r7.size()
            if (r6 >= r0) goto L_0x01ea
            java.lang.Object r1 = r7.get(r6)
            X.3IS r1 = (X.AnonymousClass3IS) r1
            java.util.List r0 = r1.A03
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x01ed
            X.3IS r5 = X.C90924f5.A08(r5, r1, r4)
            if (r5 != 0) goto L_0x01ed
        L_0x01ea:
            int r8 = r8 + -1
            goto L_0x01c9
        L_0x01ed:
            int r6 = r6 + 1
            goto L_0x01ce
        L_0x01f0:
            java.util.Set r0 = r3.getCriticalExtensionOIDs()
            if (r0 == 0) goto L_0x020f
            boolean r3 = r0.contains(r13)
            r2 = r28[r2]
            r1 = 0
        L_0x01fd:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x020f
            java.lang.Object r0 = r2.get(r1)
            X.3IS r0 = (X.AnonymousClass3IS) r0
            r0.A06 = r3
            int r1 = r1 + 1
            goto L_0x01fd
        L_0x020e:
            r5 = 0
        L_0x020f:
            return r5
        L_0x0210:
            r1 = move-exception
            java.lang.String r0 = "Could not read certificate policies extension from certificate."
            X.5BS r2 = new X.5BS
            r2.<init>(r0, r1, r14, r10)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32211fp.A07(java.security.cert.CertPath, java.util.Set, X.3IS, java.util.List[], int, int, boolean):X.3IS");
    }

    public static AnonymousClass3IS A08(CertPath certPath, AnonymousClass3IS r4, int i2) {
        try {
            if (C32411gJ.A00(C90924f5.A07(A03, (X509Certificate) certPath.getCertificates().get(i2))) == null) {
                return null;
            }
            return r4;
        } catch (C803243k e2) {
            throw new AnonymousClass5BS("Could not read certificate policies extension from certificate.", e2, certPath, i2);
        }
    }

    public static AnonymousClass3IS A09(CertPath certPath, AnonymousClass3IS r20, List[] listArr, int i2, int i3) {
        CertPath certPath2 = certPath;
        AnonymousClass3IS r6 = r20;
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int i4 = i2;
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i4);
        int size = certificates.size() - i2;
        try {
            C32411gJ A002 = C32411gJ.A00(C90924f5.A07(A0B, x509Certificate));
            if (A002 != null) {
                HashMap hashMap = new HashMap();
                HashSet hashSet = new HashSet();
                for (int i5 = 0; i5 < A002.A0A(); i5++) {
                    C32411gJ r5 = (C32411gJ) A002.A0C(i5);
                    String str = ((C32041fY) r5.A0C(0)).A01;
                    String str2 = ((C32041fY) r5.A0C(1)).A01;
                    if (!hashMap.containsKey(str)) {
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(str2);
                        hashMap.put(str, hashSet2);
                        hashSet.add(str);
                    } else {
                        ((Set) hashMap.get(str)).add(str2);
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    List[] listArr2 = listArr;
                    Iterator it2 = listArr[size].iterator();
                    if (i3 > 0) {
                        while (true) {
                            if (!it2.hasNext()) {
                                Iterator it3 = listArr[size].iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    AnonymousClass3IS r8 = (AnonymousClass3IS) it3.next();
                                    if ("2.5.29.32.0".equals(r8.getValidPolicy())) {
                                        Set set = null;
                                        try {
                                            String str4 = A03;
                                            Enumeration A0B2 = ((C32411gJ) C90924f5.A07(str4, x509Certificate)).A0B();
                                            while (true) {
                                                if (!A0B2.hasMoreElements()) {
                                                    break;
                                                }
                                                try {
                                                    Object nextElement = A0B2.nextElement();
                                                    AnonymousClass5Hp r10 = (nextElement == null || (nextElement instanceof AnonymousClass5Hp)) ? (AnonymousClass5Hp) nextElement : new AnonymousClass5Hp(C32411gJ.A00(nextElement));
                                                    if ("2.5.29.32.0".equals(r10.A00.A01)) {
                                                        try {
                                                            set = C90924f5.A06(r10.A01);
                                                            break;
                                                        } catch (CertPathValidatorException e2) {
                                                            throw new AnonymousClass5BS("Policy qualifier info set could not be decoded.", e2, certPath2, i4);
                                                        }
                                                    }
                                                } catch (Exception e3) {
                                                    throw new CertPathValidatorException("Policy information could not be decoded.", e3, certPath2, i4);
                                                }
                                            }
                                            boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(str4) : false;
                                            AnonymousClass3IS r15 = (AnonymousClass3IS) r8.getParent();
                                            if ("2.5.29.32.0".equals(r15.getValidPolicy())) {
                                                AnonymousClass3IS r13 = new AnonymousClass3IS(str3, r15, new ArrayList(), (Set) hashMap.get(str3), set, size, contains);
                                                r15.A03.add(r13);
                                                r13.A02 = r15;
                                                listArr[size].add(r13);
                                            }
                                        } catch (C803243k e4) {
                                            throw new AnonymousClass5BS("Certificate policies extension could not be decoded.", e4, certPath2, i4);
                                        }
                                    }
                                }
                            } else {
                                AnonymousClass3IS r7 = (AnonymousClass3IS) it2.next();
                                if (r7.getValidPolicy().equals(str3)) {
                                    r7.A04 = (Set) hashMap.get(str3);
                                    break;
                                }
                            }
                        }
                    } else {
                        while (it2.hasNext()) {
                            AnonymousClass3IS r72 = (AnonymousClass3IS) it2.next();
                            if (r72.getValidPolicy().equals(str3)) {
                                ((AnonymousClass3IS) r72.getParent()).A03.remove(r72);
                                it2.remove();
                                for (int i6 = size - 1; i6 >= 0; i6--) {
                                    List list = listArr[i6];
                                    for (int i7 = 0; i7 < list.size(); i7++) {
                                        AnonymousClass3IS r73 = (AnonymousClass3IS) list.get(i7);
                                        if (!(!r73.A03.isEmpty()) && (r6 = C90924f5.A08(r6, r73, listArr2)) == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return r6;
        } catch (C803243k e5) {
            throw new AnonymousClass5BS("Policy mappings extension could not be decoded.", e5, certPath2, i4);
        }
    }

    public static void A0A(PublicKey publicKey, CertPath certPath, X509Certificate x509Certificate, Date date, AnonymousClass5IQ r12, AnonymousClass5SG r13, C1047156p r14, int i2, boolean z2) {
        CertPath certPath2 = certPath;
        List<? extends Certificate> certificates = certPath.getCertificates();
        int i3 = i2;
        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(i2);
        PublicKey publicKey2 = publicKey;
        C1047156p r8 = r14;
        if (!z2) {
            try {
                String sigProvider = r14.A01.getSigProvider();
                if (sigProvider == null) {
                    x509Certificate2.verify(publicKey2);
                } else {
                    x509Certificate2.verify(publicKey2, sigProvider);
                }
            } catch (GeneralSecurityException e2) {
                throw new AnonymousClass5BS("Could not validate certificate signature.", e2, certPath2, i2);
            }
        }
        try {
            Date A042 = C90924f5.A04(certPath2, date, r14.A00, i2);
            try {
                x509Certificate2.checkValidity(A042);
                if (r13 != null) {
                    r13.AIJ(new C85284Nv(publicKey2, certPath2, x509Certificate, A042, r8, i3));
                    r13.check(x509Certificate2);
                }
                AnonymousClass5IQ A022 = C90554eM.A02(x509Certificate2);
                if (!A022.equals(r12)) {
                    StringBuilder sb = new StringBuilder("IssuerName(");
                    sb.append(A022);
                    sb.append(") does not match SubjectName(");
                    sb.append(r12);
                    sb.append(") of signing certificate.");
                    throw new AnonymousClass5BS(sb.toString(), (Throwable) null, certPath2, i2);
                }
            } catch (CertificateExpiredException e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not validate certificate: ");
                sb2.append(e3.getMessage());
                throw new AnonymousClass5BS(sb2.toString(), e3, certPath2, i2);
            } catch (CertificateNotYetValidException e4) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not validate certificate: ");
                sb3.append(e4.getMessage());
                throw new AnonymousClass5BS(sb3.toString(), e4, certPath2, i2);
            }
        } catch (C803243k e5) {
            throw new AnonymousClass5BS("Could not validate time of certificate.", e5, certPath2, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r0 = r4.A0B;
        r18 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a8, code lost:
        if (r0 == false) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02aa, code lost:
        r10 = X.C90924f5.A05(r2, r25, r24.getCertStores(), r23, r35).iterator();
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02cf, code lost:
        if (r1 == null) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r2 = new X.C803243k("Cannot verify delta CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02da, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02de, code lost:
        if (r4.A00 == 1) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f2, code lost:
        if (r6.getNotAfter().getTime() >= r2.getThisUpdate().getTime()) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f4, code lost:
        r1 = new X.C803243k("No valid CRL for current time found.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02fc, code lost:
        r0 = X.C90924f5.A07(r9, r2);
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0301, code lost:
        if (r0 == null) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0303, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x030b, code lost:
        if (X.AnonymousClass5IF.A00(r0).A03 != false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x030d, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r12 = X.C90554eM.A01(r2).A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0317, code lost:
        if (r19 == null) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r10 = r19.A03();
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031f, code lost:
        if (r13 >= r10.length) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0326, code lost:
        if (r10[r13].A00 != 4) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0338, code lost:
        if (java.util.Arrays.equals(r10[r13].A01.Agm().A01(), r12) == false) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x033a, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033b, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x033e, code lost:
        if (r15 == false) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0340, code lost:
        if (r16 != false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0350, code lost:
        if (X.C90554eM.A01(r2).equals(X.C90554eM.A00(r6)) != false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0352, code lost:
        r2 = new X.C803243k("Cannot find matching CRL issuer for certificate.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r10 = X.AnonymousClass5IF.A00(X.C90924f5.A07(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0363, code lost:
        if (r10 == null) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0367, code lost:
        if (r10.A01 == null) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0369, code lost:
        r15 = X.AnonymousClass5IF.A00(r10).A01;
        r12 = new java.util.ArrayList();
        r0 = r15.A00;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0377, code lost:
        if (r0 != 0) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0379, code lost:
        r15 = X.AnonymousClass5IG.A00(r15.A01).A03();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0385, code lost:
        if (r14 >= r15.length) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0387, code lost:
        r12.add(r15[r14]);
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x038f, code lost:
        if (r0 != 1) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0391, code lost:
        r14 = new X.C32391gH();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        r16 = X.C32411gJ.A00(X.C90554eM.A01(r2)).A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a6, code lost:
        if (r16.hasMoreElements() == false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a8, code lost:
        r14.A02((X.C32071fb) r16.nextElement());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r14.A02(r15.A01);
        r12.add(new X.AnonymousClass5IP(X.AnonymousClass5IQ.A01(new X.C32401gI(r14))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03c8, code lost:
        r15 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03cc, code lost:
        if (r15 == null) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ce, code lost:
        r0 = r15.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03d0, code lost:
        if (r0 != 0) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03d2, code lost:
        r11 = X.AnonymousClass5IG.A00(r15.A01).A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03dd, code lost:
        if (r0 != 1) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03df, code lost:
        if (r19 == null) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e2, code lost:
        r11 = new X.AnonymousClass5IP[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r11[0] = new X.AnonymousClass5IP(X.C90554eM.A00(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        r11 = r19.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03f5, code lost:
        if (r13 >= r11.length) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03f7, code lost:
        r16 = X.C32411gJ.A00(r11[r13].A01.Agm()).A0B();
        r14 = new X.C32391gH();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0410, code lost:
        if (r16.hasMoreElements() == false) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0412, code lost:
        r14.A02((X.C32071fb) r16.nextElement());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x041c, code lost:
        r14.A02(r15.A01);
        r11[r13] = new X.AnonymousClass5IP(X.AnonymousClass5IQ.A01(new X.C32401gI(r14)));
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0434, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0436, code lost:
        if (r13 >= r11.length) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x043e, code lost:
        if (r12.contains(r11[r13]) != false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0440, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0443, code lost:
        r1 = new X.C803243k("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x044c, code lost:
        if (r19 == null) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x044e, code lost:
        r11 = r19.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0453, code lost:
        if (r13 >= r11.length) goto L_0x0460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x045b, code lost:
        if (r12.contains(r11[r13]) != false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x045d, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0460, code lost:
        r1 = new X.C803243k("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        r11 = X.C33091hv.A00(X.C90924f5.A07(A02, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0473, code lost:
        if (r27 == null) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0477, code lost:
        if (r10.A06 == false) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0479, code lost:
        if (r11 == null) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x047b, code lost:
        r0 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x047d, code lost:
        if (r0 == null) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0481, code lost:
        if (r0.A00 == 0) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0483, code lost:
        r2 = new X.C803243k("CA Cert CRL only contains user certificates.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x048e, code lost:
        if (r10.A05 == false) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0490, code lost:
        if (r11 == null) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0492, code lost:
        r0 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0494, code lost:
        if (r0 == null) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0498, code lost:
        if (r0.A00 == 0) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x049c, code lost:
        if (r10.A04 == false) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x049e, code lost:
        r2 = new X.C803243k("onlyContainsAttributeCerts boolean is asserted.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04a7, code lost:
        if (r1 == null) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04ad, code lost:
        if (r1.hasUnsupportedCriticalExtension() != false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r11 = X.AnonymousClass5IF.A00(X.C90924f5.A07(r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04b7, code lost:
        if (r18 == false) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04c5, code lost:
        if (X.C90554eM.A01(r1).equals(X.C90554eM.A01(r2)) == false) goto L_0x05e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        r0 = X.AnonymousClass5IF.A00(X.C90924f5.A07(r9, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04cf, code lost:
        if (r11 != null) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04d1, code lost:
        if (r0 != null) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04d8, code lost:
        if (r11.equals(r0) == false) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        r0 = A01;
        r9 = X.C90924f5.A07(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        r0 = X.C90924f5.A07(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04e4, code lost:
        if (r9 == null) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04e6, code lost:
        if (r0 == null) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04ec, code lost:
        if (r9.A04(r0) == false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04ee, code lost:
        X.C90924f5.A09(r6, r1, r25, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x04f7, code lost:
        if (r8.A00 != 11) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04f9, code lost:
        X.C90924f5.A09(r6, r2, r25, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0502, code lost:
        if (r8.A00 != 8) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0504, code lost:
        r8.A00 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0508, code lost:
        r37.A00 = r7.A00 | r37.A00;
        r0 = r2.getCriticalExtensionOIDs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0517, code lost:
        if (r0 == null) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0519, code lost:
        r2 = new java.util.HashSet(r0);
        r2.remove(X.AnonymousClass5IH.A0K.A01);
        r2.remove(X.AnonymousClass5IH.A0C.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0530, code lost:
        if (r2.isEmpty() != false) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0532, code lost:
        r1 = new X.C803243k("CRL contains unsupported critical extensions.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x053b, code lost:
        if (r1 == null) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x053d, code lost:
        r0 = r1.getCriticalExtensionOIDs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0541, code lost:
        if (r0 == null) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0543, code lost:
        r1 = new java.util.HashSet(r0);
        r1.remove(X.AnonymousClass5IH.A0K.A01);
        r1.remove(X.AnonymousClass5IH.A0C.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x055a, code lost:
        if (r1.isEmpty() != false) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x055c, code lost:
        r1 = new X.C803243k("Delta CRL contains unsupported critical extension.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0565, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0566, code lost:
        r2 = new X.C803243k("CRL issuer information from distribution point cannot be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x056f, code lost:
        r2 = new X.C803243k("Distribution point contains cRLIssuer field but CRL is not indirect.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0578, code lost:
        r2 = new X.C803243k("CRL issuer of CRL does not match CRL issuer of distribution point.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0581, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0582, code lost:
        r2 = new X.C803243k("Could not read CRL issuer.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x058b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x058c, code lost:
        r2 = new X.C803243k("Could not read certificate issuer.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0595, code lost:
        r2 = new X.C803243k("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x059e, code lost:
        r2 = new X.C803243k("End CRL only contains CA certificates.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x05a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05a8, code lost:
        r2 = new X.C803243k("Basic constraints extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x05b1, code lost:
        r2 = new X.C803243k("Delta CRL authority key identifier is null.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05ba, code lost:
        r2 = new X.C803243k("CRL authority key identifier is null.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05c3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x05c4, code lost:
        r2 = new X.C803243k("Authority key identifier extension could not be extracted from delta CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x05cd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x05ce, code lost:
        r2 = new X.C803243k("Authority key identifier extension could not be extracted from complete CRL.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05d7, code lost:
        r2 = new X.C803243k("Issuing distribution point extension from delta CRL and complete CRL does not match.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05df, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x05e0, code lost:
        r2 = new X.C803243k("Issuing distribution point extension from delta CRL could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05e8, code lost:
        r2 = new X.C803243k("Complete CRL issuer does not match delta CRL issuer.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05f0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05f1, code lost:
        r2 = new X.C803243k("Issuing distribution point extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05f9, code lost:
        r2 = new X.C803243k("delta CRL has unsupported critical extensions", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0601, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0605, code lost:
        r2 = new X.C803243k("Delta CRL authority key identifier does not match complete CRL authority key identifier.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x060d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x060e, code lost:
        r2 = new X.C803243k("Issuing distribution point extension could not be decoded.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0616, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0617, code lost:
        r1 = new java.lang.StringBuilder("Exception encoding CRL issuer: ");
        r1.append(r7.getMessage());
        r2 = new X.C803243k(r1.toString(), r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0157 A[Catch:{ 43k -> 0x065d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(java.security.PublicKey r26, java.security.cert.X509Certificate r27, java.security.cert.X509Certificate r28, java.util.Date r29, java.util.Date r30, java.util.List r31, X.AnonymousClass5IE r32, X.C85284Nv r33, X.C1047156p r34, X.AnonymousClass5NQ r35, X.AnonymousClass4JF r36, X.C89864d4 r37) {
        /*
            r25 = r30
            long r3 = r25.getTime()
            long r1 = r29.getTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x067e
            java.security.cert.X509CRLSelector r2 = new java.security.cert.X509CRLSelector
            r2.<init>()
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ 43k -> 0x0675 }
            r1.<init>()     // Catch:{ 43k -> 0x0675 }
            r6 = r27
            X.5IQ r0 = X.C90554eM.A00(r6)     // Catch:{ 43k -> 0x0675 }
            r1.add(r0)     // Catch:{ 43k -> 0x0675 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 43k -> 0x0675 }
            r3.<init>()     // Catch:{ 43k -> 0x0675 }
            r5 = r32
            X.5IG r0 = r5.A01     // Catch:{ 43k -> 0x0675 }
            r19 = r0
            if (r0 == 0) goto L_0x005d
            X.5IP[] r7 = r19.A03()     // Catch:{ 43k -> 0x0675 }
            r4 = 0
        L_0x0033:
            int r0 = r7.length     // Catch:{ 43k -> 0x0675 }
            if (r4 >= r0) goto L_0x0073
            r0 = r7[r4]     // Catch:{ 43k -> 0x0675 }
            int r1 = r0.A00     // Catch:{ 43k -> 0x0675 }
            r0 = 4
            if (r1 != r0) goto L_0x0050
            r0 = r7[r4]     // Catch:{ IOException -> 0x0053 }
            X.1fb r0 = r0.A01     // Catch:{ IOException -> 0x0053 }
            X.1fZ r0 = r0.Agm()     // Catch:{ IOException -> 0x0053 }
            byte[] r0 = r0.A01()     // Catch:{ IOException -> 0x0053 }
            X.5IQ r0 = X.AnonymousClass5IQ.A01(r0)     // Catch:{ IOException -> 0x0053 }
            r3.add(r0)     // Catch:{ IOException -> 0x0053 }
        L_0x0050:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0053:
            r1 = move-exception
            java.lang.String r0 = "CRL issuer information from distribution point cannot be decoded."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x0675 }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x0675 }
            goto L_0x0674
        L_0x005d:
            X.5IN r0 = r5.A00     // Catch:{ 43k -> 0x0675 }
            if (r0 == 0) goto L_0x0663
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 43k -> 0x0675 }
        L_0x0065:
            boolean r0 = r1.hasNext()     // Catch:{ 43k -> 0x0675 }
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r1.next()     // Catch:{ 43k -> 0x0675 }
            r3.add(r0)     // Catch:{ 43k -> 0x0675 }
            goto L_0x0065
        L_0x0073:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 43k -> 0x0675 }
        L_0x0077:
            boolean r0 = r1.hasNext()     // Catch:{ 43k -> 0x0675 }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r1.next()     // Catch:{ IOException -> 0x066c }
            X.1fa r0 = (X.C32061fa) r0     // Catch:{ IOException -> 0x066c }
            byte[] r0 = r0.A01()     // Catch:{ IOException -> 0x066c }
            r2.addIssuerName(r0)     // Catch:{ IOException -> 0x066c }
            goto L_0x0077
        L_0x008b:
            if (r27 == 0) goto L_0x0090
            r2.setCertificateChecking(r6)
        L_0x0090:
            X.4NZ r1 = new X.4NZ
            r1.<init>(r2)
            r0 = 1
            r1.A01 = r0
            X.5AI r3 = new X.5AI
            r3.<init>(r1)
            r4 = r34
            java.security.cert.PKIXParameters r0 = r4.A01
            r24 = r0
            java.util.List r2 = r24.getCertStores()
            java.util.List r0 = r4.A04
            r23 = r0
            r1 = r25
            java.util.Set r1 = X.AnonymousClass4YB.A00(r1, r2, r0, r3)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r3 = "\""
            java.lang.String r0 = "No CRLs found for issuer \""
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            X.4c5 r1 = X.AnonymousClass5J6.A0l
            X.5IQ r0 = X.C90554eM.A02(r6)
            java.lang.String r0 = r1.A01(r0)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0 = r33
            java.security.cert.CertPath r2 = r0.A02
            int r1 = r0.A00
            X.5BR r0 = new X.5BR
            r0.<init>(r3, r2, r1)
            throw r0
        L_0x00e3:
            java.util.Iterator r21 = r1.iterator()
            r3 = 0
            r22 = r3
            r20 = 0
        L_0x00ec:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0660
            r8 = r36
            int r1 = r8.A00
            r0 = 11
            if (r1 != r0) goto L_0x0660
            r0 = r37
            int r1 = r0.A00
            X.4d4 r7 = X.C89864d4.A01
            int r0 = r7.A00
            if (r1 == r0) goto L_0x0660
            java.lang.Object r2 = r21.next()     // Catch:{ 43k -> 0x065d }
            java.security.cert.X509CRL r2 = (java.security.cert.X509CRL) r2     // Catch:{ 43k -> 0x065d }
            java.lang.String r9 = A07     // Catch:{ Exception -> 0x0649 }
            X.1fZ r0 = X.C90924f5.A07(r9, r2)     // Catch:{ Exception -> 0x0649 }
            X.5IF r1 = X.AnonymousClass5IF.A00(r0)     // Catch:{ Exception -> 0x0649 }
            if (r1 == 0) goto L_0x0117
            goto L_0x0124
        L_0x0117:
            X.5Iz r0 = r5.A02     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x014d
            X.4d4 r10 = new X.4d4     // Catch:{ 43k -> 0x065d }
            r10.<init>((X.C107645Iz) r0)     // Catch:{ 43k -> 0x065d }
            if (r1 != 0) goto L_0x015e
            r1 = r7
            goto L_0x0165
        L_0x0124:
            X.5Iz r11 = r1.A02     // Catch:{ 43k -> 0x065d }
            if (r11 == 0) goto L_0x0117
            X.5Iz r0 = r5.A02     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x015d
            X.4d4 r10 = new X.4d4     // Catch:{ 43k -> 0x065d }
            r10.<init>((X.C107645Iz) r0)     // Catch:{ 43k -> 0x065d }
            X.4d4 r1 = new X.4d4     // Catch:{ 43k -> 0x065d }
            r1.<init>((X.C107645Iz) r11)     // Catch:{ 43k -> 0x065d }
            r0 = 0
            X.4d4 r7 = new X.4d4     // Catch:{ 43k -> 0x065d }
            r7.<init>((int) r0)     // Catch:{ 43k -> 0x065d }
            int r0 = r10.A00     // Catch:{ 43k -> 0x065d }
            int r1 = r1.A00     // Catch:{ 43k -> 0x065d }
            r1 = r1 & r0
        L_0x0141:
            X.4d4 r0 = new X.4d4     // Catch:{ 43k -> 0x065d }
            r0.<init>((int) r1)     // Catch:{ 43k -> 0x065d }
            int r1 = r7.A00     // Catch:{ 43k -> 0x065d }
            int r0 = r0.A00     // Catch:{ 43k -> 0x065d }
            r0 = r0 | r1
            r7.A00 = r0     // Catch:{ 43k -> 0x065d }
        L_0x014d:
            int r1 = r7.A00     // Catch:{ 43k -> 0x065d }
            r0 = r37
            int r0 = r0.A00     // Catch:{ 43k -> 0x065d }
            r0 = r0 ^ r1
            r0 = r0 | r1
            if (r0 == 0) goto L_0x00ec
            java.security.cert.X509CertSelector r1 = new java.security.cert.X509CertSelector     // Catch:{ 43k -> 0x065d }
            r1.<init>()     // Catch:{ 43k -> 0x065d }
            goto L_0x0171
        L_0x015d:
            r10 = r7
        L_0x015e:
            X.5Iz r0 = r1.A02     // Catch:{ 43k -> 0x065d }
            X.4d4 r1 = new X.4d4     // Catch:{ 43k -> 0x065d }
            r1.<init>((X.C107645Iz) r0)     // Catch:{ 43k -> 0x065d }
        L_0x0165:
            r0 = 0
            X.4d4 r7 = new X.4d4     // Catch:{ 43k -> 0x065d }
            r7.<init>((int) r0)     // Catch:{ 43k -> 0x065d }
            int r0 = r10.A00     // Catch:{ 43k -> 0x065d }
            int r1 = r1.A00     // Catch:{ 43k -> 0x065d }
            r1 = r1 & r0
            goto L_0x0141
        L_0x0171:
            X.5IQ r0 = X.C90554eM.A01(r2)     // Catch:{ IOException -> 0x0640 }
            byte[] r0 = r0.A01()     // Catch:{ IOException -> 0x0640 }
            r1.setSubject(r0)     // Catch:{ IOException -> 0x0640 }
            java.lang.Object r0 = r1.clone()     // Catch:{ 43k -> 0x065d }
            java.security.cert.CertSelector r0 = (java.security.cert.CertSelector) r0     // Catch:{ 43k -> 0x065d }
            X.5AH r10 = new X.5AH     // Catch:{ 43k -> 0x065d }
            r10.<init>(r0)     // Catch:{ 43k -> 0x065d }
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch:{ 43k -> 0x065d }
            r1.<init>()     // Catch:{ 43k -> 0x065d }
            java.util.List r0 = r4.A05     // Catch:{ 43k -> 0x0637 }
            X.C90924f5.A0B(r1, r0, r10)     // Catch:{ 43k -> 0x0637 }
            java.util.List r0 = r24.getCertStores()     // Catch:{ 43k -> 0x0637 }
            X.C90924f5.A0B(r1, r0, r10)     // Catch:{ 43k -> 0x0637 }
            r0 = r28
            r1.add(r0)     // Catch:{ 43k -> 0x065d }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ 43k -> 0x065d }
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ 43k -> 0x065d }
            r16.<init>()     // Catch:{ 43k -> 0x065d }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ 43k -> 0x065d }
            r10.<init>()     // Catch:{ 43k -> 0x065d }
        L_0x01ab:
            boolean r0 = r17.hasNext()     // Catch:{ 43k -> 0x065d }
            r11 = 0
            if (r0 == 0) goto L_0x0240
            java.lang.Object r12 = r17.next()     // Catch:{ 43k -> 0x065d }
            java.security.cert.X509Certificate r12 = (java.security.cert.X509Certificate) r12     // Catch:{ 43k -> 0x065d }
            r0 = r28
            boolean r0 = r12.equals(r0)     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x01cb
            r0 = r16
            r0.add(r12)     // Catch:{ 43k -> 0x065d }
            r0 = r26
            r10.add(r0)     // Catch:{ 43k -> 0x065d }
            goto L_0x01ab
        L_0x01cb:
            java.lang.Class r0 = A00     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r14 = 1
            if (r0 == 0) goto L_0x0226
            X.5BQ r13 = new X.5BQ     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r13.<init>(r14)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
        L_0x01d5:
            java.security.cert.X509CertSelector r0 = new java.security.cert.X509CertSelector     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r0.<init>()     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r0.setCertificate(r12)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            X.4aU r1 = new X.4aU     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r1.<init>((X.C1047156p) r4)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            java.lang.Object r15 = r0.clone()     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            java.security.cert.CertSelector r15 = (java.security.cert.CertSelector) r15     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            X.5AH r0 = new X.5AH     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r0.<init>(r15)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r1.A06 = r0     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r0 = r31
            boolean r0 = r0.contains(r12)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            if (r0 == 0) goto L_0x0223
            r1.A07 = r11     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
        L_0x01f9:
            X.56p r0 = new X.56p     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r0.<init>(r1)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            X.4Zs r1 = new X.4Zs     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r1.<init>((X.C1047156p) r0)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            X.56o r0 = new X.56o     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r0.<init>(r1)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            java.security.cert.CertPathBuilderResult r0 = r13.engineBuild(r0)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            java.security.cert.CertPath r0 = r0.getCertPath()     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            java.util.List r1 = r0.getCertificates()     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r0 = r16
            r0.add(r12)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r0 = r35
            java.security.PublicKey r0 = X.C90924f5.A00(r1, r0, r11)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r10.add(r0)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            goto L_0x01ab
        L_0x0223:
            r1.A07 = r14     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            goto L_0x01f9
        L_0x0226:
            X.5BP r13 = new X.5BP     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            r13.<init>(r14)     // Catch:{ CertPathBuilderException -> 0x0236, CertPathValidatorException -> 0x022c, Exception -> 0x0652 }
            goto L_0x01d5
        L_0x022c:
            r1 = move-exception
            java.lang.String r0 = "Public key of issuer certificate of CRL could not be retrieved."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0236:
            r1 = move-exception
            java.lang.String r0 = "CertPath for CRL signer failed to validate."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0240:
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ 43k -> 0x065d }
            r12.<init>()     // Catch:{ 43k -> 0x065d }
            r1 = 0
        L_0x0246:
            int r0 = r16.size()     // Catch:{ 43k -> 0x065d }
            if (r11 >= r0) goto L_0x0274
            r0 = r16
            java.lang.Object r0 = r0.get(r11)     // Catch:{ 43k -> 0x065d }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ 43k -> 0x065d }
            boolean[] r14 = r0.getKeyUsage()     // Catch:{ 43k -> 0x065d }
            if (r14 == 0) goto L_0x026a
            int r13 = r14.length     // Catch:{ 43k -> 0x065d }
            r0 = 6
            if (r13 <= r0) goto L_0x0262
            boolean r0 = r14[r0]     // Catch:{ 43k -> 0x065d }
            if (r0 != 0) goto L_0x026a
        L_0x0262:
            java.lang.String r0 = "Issuer certificate key usage extension does not permit CRL signing."
            X.43k r1 = new X.43k     // Catch:{ 43k -> 0x065d }
            r1.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x0271
        L_0x026a:
            java.lang.Object r0 = r10.get(r11)     // Catch:{ 43k -> 0x065d }
            r12.add(r0)     // Catch:{ 43k -> 0x065d }
        L_0x0271:
            int r11 = r11 + 1
            goto L_0x0246
        L_0x0274:
            boolean r0 = r12.isEmpty()     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x0285
            if (r1 != 0) goto L_0x0285
            java.lang.String r0 = "Cannot find a valid issuer certificate."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0285:
            boolean r0 = r12.isEmpty()     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x028d
            if (r1 != 0) goto L_0x02fb
        L_0x028d:
            java.util.Iterator r10 = r12.iterator()     // Catch:{ 43k -> 0x065d }
            r1 = 0
        L_0x0292:
            boolean r0 = r10.hasNext()     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x062f
            java.lang.Object r11 = r10.next()     // Catch:{ 43k -> 0x065d }
            java.security.PublicKey r11 = (java.security.PublicKey) r11     // Catch:{ 43k -> 0x065d }
            r2.verify(r11)     // Catch:{ Exception -> 0x02a2 }
            goto L_0x02a4
        L_0x02a2:
            r1 = move-exception
            goto L_0x0292
        L_0x02a4:
            boolean r0 = r4.A0B     // Catch:{ 43k -> 0x065d }
            r18 = r0
            if (r0 == 0) goto L_0x02da
            java.util.List r12 = r24.getCertStores()     // Catch:{ 43k -> 0x065d }
            r10 = r35
            r1 = r25
            r0 = r23
            java.util.Set r0 = X.C90924f5.A05(r2, r1, r12, r0, r10)     // Catch:{ 43k -> 0x065d }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ 43k -> 0x065d }
            r1 = r3
        L_0x02bd:
            boolean r0 = r10.hasNext()     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x02cf
            java.lang.Object r1 = r10.next()     // Catch:{ 43k -> 0x065d }
            java.security.cert.X509CRL r1 = (java.security.cert.X509CRL) r1     // Catch:{ 43k -> 0x065d }
            r1.verify(r11)     // Catch:{ Exception -> 0x02cd }
            goto L_0x02db
        L_0x02cd:
            r1 = move-exception
            goto L_0x02bd
        L_0x02cf:
            if (r1 == 0) goto L_0x02da
            java.lang.String r0 = "Cannot verify delta CRL."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x02da:
            r1 = r3
        L_0x02db:
            int r0 = r4.A00     // Catch:{ 43k -> 0x065d }
            r11 = 1
            if (r0 == r11) goto L_0x02fc
            java.util.Date r0 = r6.getNotAfter()     // Catch:{ 43k -> 0x065d }
            long r14 = r0.getTime()     // Catch:{ 43k -> 0x065d }
            java.util.Date r0 = r2.getThisUpdate()     // Catch:{ 43k -> 0x065d }
            long r12 = r0.getTime()     // Catch:{ 43k -> 0x065d }
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x02fc
            java.lang.String r0 = "No valid CRL for current time found."
            X.43k r1 = new X.43k     // Catch:{ 43k -> 0x065d }
            r1.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
        L_0x02fb:
            throw r1     // Catch:{ 43k -> 0x065d }
        L_0x02fc:
            X.1fZ r0 = X.C90924f5.A07(r9, r2)     // Catch:{ 43k -> 0x065d }
            r13 = 0
            if (r0 == 0) goto L_0x030d
            X.5IF r0 = X.AnonymousClass5IF.A00(r0)     // Catch:{ 43k -> 0x065d }
            boolean r0 = r0.A03     // Catch:{ 43k -> 0x065d }
            r16 = 1
            if (r0 != 0) goto L_0x030f
        L_0x030d:
            r16 = 0
        L_0x030f:
            X.5IQ r0 = X.C90554eM.A01(r2)     // Catch:{ IOException -> 0x0616 }
            byte[] r12 = r0.A01()     // Catch:{ IOException -> 0x0616 }
            if (r19 == 0) goto L_0x0344
            X.5IP[] r10 = r19.A03()     // Catch:{ 43k -> 0x065d }
            r15 = 0
        L_0x031e:
            int r0 = r10.length     // Catch:{ 43k -> 0x065d }
            if (r13 >= r0) goto L_0x033e
            r0 = r10[r13]     // Catch:{ 43k -> 0x065d }
            int r14 = r0.A00     // Catch:{ 43k -> 0x065d }
            r0 = 4
            if (r14 != r0) goto L_0x033b
            r0 = r10[r13]     // Catch:{ IOException -> 0x0565 }
            X.1fb r0 = r0.A01     // Catch:{ IOException -> 0x0565 }
            X.1fZ r0 = r0.Agm()     // Catch:{ IOException -> 0x0565 }
            byte[] r0 = r0.A01()     // Catch:{ IOException -> 0x0565 }
            boolean r0 = java.util.Arrays.equals(r0, r12)     // Catch:{ IOException -> 0x0565 }
            if (r0 == 0) goto L_0x033b
            r15 = 1
        L_0x033b:
            int r13 = r13 + 1
            goto L_0x031e
        L_0x033e:
            if (r15 == 0) goto L_0x0578
            if (r16 != 0) goto L_0x035b
            goto L_0x056f
        L_0x0344:
            X.5IQ r10 = X.C90554eM.A01(r2)     // Catch:{ 43k -> 0x065d }
            X.5IQ r0 = X.C90554eM.A00(r6)     // Catch:{ 43k -> 0x065d }
            boolean r0 = r10.equals(r0)     // Catch:{ 43k -> 0x065d }
            if (r0 != 0) goto L_0x035b
            java.lang.String r0 = "Cannot find matching CRL issuer for certificate."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x035b:
            X.1fZ r0 = X.C90924f5.A07(r9, r2)     // Catch:{ Exception -> 0x060d }
            X.5IF r10 = X.AnonymousClass5IF.A00(r0)     // Catch:{ Exception -> 0x060d }
            if (r10 == 0) goto L_0x04a7
            X.5IN r0 = r10.A01     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x0469
            X.5IF r0 = X.AnonymousClass5IF.A00(r10)     // Catch:{ 43k -> 0x065d }
            X.5IN r15 = r0.A01     // Catch:{ 43k -> 0x065d }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ 43k -> 0x065d }
            r12.<init>()     // Catch:{ 43k -> 0x065d }
            int r0 = r15.A00     // Catch:{ 43k -> 0x065d }
            r13 = 0
            if (r0 != 0) goto L_0x038f
            X.1fb r0 = r15.A01     // Catch:{ 43k -> 0x065d }
            X.5IG r0 = X.AnonymousClass5IG.A00(r0)     // Catch:{ 43k -> 0x065d }
            X.5IP[] r15 = r0.A03()     // Catch:{ 43k -> 0x065d }
            r14 = 0
        L_0x0384:
            int r0 = r15.length     // Catch:{ 43k -> 0x065d }
            if (r14 >= r0) goto L_0x03c8
            r0 = r15[r14]     // Catch:{ 43k -> 0x065d }
            r12.add(r0)     // Catch:{ 43k -> 0x065d }
            int r14 = r14 + 1
            goto L_0x0384
        L_0x038f:
            if (r0 != r11) goto L_0x03c8
            X.1gH r14 = new X.1gH     // Catch:{ 43k -> 0x065d }
            r14.<init>()     // Catch:{ 43k -> 0x065d }
            X.5IQ r0 = X.C90554eM.A01(r2)     // Catch:{ Exception -> 0x0581 }
            X.1gJ r0 = X.C32411gJ.A00(r0)     // Catch:{ Exception -> 0x0581 }
            java.util.Enumeration r16 = r0.A0B()     // Catch:{ Exception -> 0x0581 }
        L_0x03a2:
            boolean r0 = r16.hasMoreElements()     // Catch:{ Exception -> 0x0581 }
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r0 = r16.nextElement()     // Catch:{ Exception -> 0x0581 }
            X.1fb r0 = (X.C32071fb) r0     // Catch:{ Exception -> 0x0581 }
            r14.A02(r0)     // Catch:{ Exception -> 0x0581 }
            goto L_0x03a2
        L_0x03b2:
            X.1fb r0 = r15.A01     // Catch:{ 43k -> 0x065d }
            r14.A02(r0)     // Catch:{ 43k -> 0x065d }
            X.1gI r0 = new X.1gI     // Catch:{ 43k -> 0x065d }
            r0.<init>((X.C32391gH) r14)     // Catch:{ 43k -> 0x065d }
            X.5IQ r14 = X.AnonymousClass5IQ.A01(r0)     // Catch:{ 43k -> 0x065d }
            X.5IP r0 = new X.5IP     // Catch:{ 43k -> 0x065d }
            r0.<init>((X.AnonymousClass5IQ) r14)     // Catch:{ 43k -> 0x065d }
            r12.add(r0)     // Catch:{ 43k -> 0x065d }
        L_0x03c8:
            X.5IN r15 = r5.A00     // Catch:{ 43k -> 0x065d }
            java.lang.String r17 = "No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point."
            if (r15 == 0) goto L_0x044c
            int r0 = r15.A00     // Catch:{ 43k -> 0x065d }
            if (r0 != 0) goto L_0x03dd
            X.1fb r0 = r15.A01     // Catch:{ 43k -> 0x065d }
            X.5IG r0 = X.AnonymousClass5IG.A00(r0)     // Catch:{ 43k -> 0x065d }
            X.5IP[] r11 = r0.A03()     // Catch:{ 43k -> 0x065d }
            goto L_0x0434
        L_0x03dd:
            if (r0 != r11) goto L_0x0443
            if (r19 == 0) goto L_0x03e2
            goto L_0x03f0
        L_0x03e2:
            X.5IP[] r11 = new X.AnonymousClass5IP[r11]     // Catch:{ 43k -> 0x065d }
            X.5IQ r14 = X.C90554eM.A00(r6)     // Catch:{ Exception -> 0x058b }
            X.5IP r0 = new X.5IP     // Catch:{ Exception -> 0x058b }
            r0.<init>((X.AnonymousClass5IQ) r14)     // Catch:{ Exception -> 0x058b }
            r11[r13] = r0     // Catch:{ Exception -> 0x058b }
            goto L_0x03f4
        L_0x03f0:
            X.5IP[] r11 = r19.A03()     // Catch:{ 43k -> 0x065d }
        L_0x03f4:
            int r0 = r11.length     // Catch:{ 43k -> 0x065d }
            if (r13 >= r0) goto L_0x0434
            r0 = r11[r13]     // Catch:{ 43k -> 0x065d }
            X.1fb r0 = r0.A01     // Catch:{ 43k -> 0x065d }
            X.1fZ r0 = r0.Agm()     // Catch:{ 43k -> 0x065d }
            X.1gJ r0 = X.C32411gJ.A00(r0)     // Catch:{ 43k -> 0x065d }
            java.util.Enumeration r16 = r0.A0B()     // Catch:{ 43k -> 0x065d }
            X.1gH r14 = new X.1gH     // Catch:{ 43k -> 0x065d }
            r14.<init>()     // Catch:{ 43k -> 0x065d }
        L_0x040c:
            boolean r0 = r16.hasMoreElements()     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x041c
            java.lang.Object r0 = r16.nextElement()     // Catch:{ 43k -> 0x065d }
            X.1fb r0 = (X.C32071fb) r0     // Catch:{ 43k -> 0x065d }
            r14.A02(r0)     // Catch:{ 43k -> 0x065d }
            goto L_0x040c
        L_0x041c:
            X.1fb r0 = r15.A01     // Catch:{ 43k -> 0x065d }
            r14.A02(r0)     // Catch:{ 43k -> 0x065d }
            X.1gI r0 = new X.1gI     // Catch:{ 43k -> 0x065d }
            r0.<init>((X.C32391gH) r14)     // Catch:{ 43k -> 0x065d }
            X.5IQ r14 = X.AnonymousClass5IQ.A01(r0)     // Catch:{ 43k -> 0x065d }
            X.5IP r0 = new X.5IP     // Catch:{ 43k -> 0x065d }
            r0.<init>((X.AnonymousClass5IQ) r14)     // Catch:{ 43k -> 0x065d }
            r11[r13] = r0     // Catch:{ 43k -> 0x065d }
            int r13 = r13 + 1
            goto L_0x03f4
        L_0x0434:
            r13 = 0
        L_0x0435:
            int r0 = r11.length     // Catch:{ 43k -> 0x065d }
            if (r13 >= r0) goto L_0x0443
            r0 = r11[r13]     // Catch:{ 43k -> 0x065d }
            boolean r0 = r12.contains(r0)     // Catch:{ 43k -> 0x065d }
            if (r0 != 0) goto L_0x0469
            int r13 = r13 + 1
            goto L_0x0435
        L_0x0443:
            X.43k r1 = new X.43k     // Catch:{ 43k -> 0x065d }
            r0 = r17
            r1.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x02fb
        L_0x044c:
            if (r19 == 0) goto L_0x0595
            X.5IP[] r11 = r19.A03()     // Catch:{ 43k -> 0x065d }
        L_0x0452:
            int r0 = r11.length     // Catch:{ 43k -> 0x065d }
            if (r13 >= r0) goto L_0x0460
            r0 = r11[r13]     // Catch:{ 43k -> 0x065d }
            boolean r0 = r12.contains(r0)     // Catch:{ 43k -> 0x065d }
            if (r0 != 0) goto L_0x0469
            int r13 = r13 + 1
            goto L_0x0452
        L_0x0460:
            X.43k r1 = new X.43k     // Catch:{ 43k -> 0x065d }
            r0 = r17
            r1.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x02fb
        L_0x0469:
            java.lang.String r0 = A02     // Catch:{ Exception -> 0x05a7 }
            X.1fZ r0 = X.C90924f5.A07(r0, r6)     // Catch:{ Exception -> 0x05a7 }
            X.1hv r11 = X.C33091hv.A00(r0)     // Catch:{ Exception -> 0x05a7 }
            if (r27 == 0) goto L_0x049a
            boolean r0 = r10.A06     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x048c
            if (r11 == 0) goto L_0x048c
            X.1hr r0 = r11.A00     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x048c
            byte r0 = r0.A00     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x048c
            java.lang.String r0 = "CA Cert CRL only contains user certificates."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x048c:
            boolean r0 = r10.A05     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x049a
            if (r11 == 0) goto L_0x059e
            X.1hr r0 = r11.A00     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x059e
            byte r0 = r0.A00     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x059e
        L_0x049a:
            boolean r0 = r10.A04     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x04a7
            java.lang.String r0 = "onlyContainsAttributeCerts boolean is asserted."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x04a7:
            if (r1 == 0) goto L_0x04f3
            boolean r0 = r1.hasUnsupportedCriticalExtension()     // Catch:{ 43k -> 0x065d }
            if (r0 != 0) goto L_0x05f9
            X.1fZ r0 = X.C90924f5.A07(r9, r2)     // Catch:{ Exception -> 0x05f0 }
            X.5IF r11 = X.AnonymousClass5IF.A00(r0)     // Catch:{ Exception -> 0x05f0 }
            if (r18 == 0) goto L_0x04f3
            X.5IQ r10 = X.C90554eM.A01(r1)     // Catch:{ 43k -> 0x065d }
            X.5IQ r0 = X.C90554eM.A01(r2)     // Catch:{ 43k -> 0x065d }
            boolean r0 = r10.equals(r0)     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x05e8
            X.1fZ r0 = X.C90924f5.A07(r9, r1)     // Catch:{ Exception -> 0x05df }
            X.5IF r0 = X.AnonymousClass5IF.A00(r0)     // Catch:{ Exception -> 0x05df }
            if (r11 != 0) goto L_0x04d4
            if (r0 != 0) goto L_0x05d7
            goto L_0x04da
        L_0x04d4:
            boolean r0 = r11.equals(r0)     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x05d7
        L_0x04da:
            java.lang.String r0 = A01     // Catch:{ 43k -> 0x05cd }
            X.1fZ r9 = X.C90924f5.A07(r0, r2)     // Catch:{ 43k -> 0x05cd }
            X.1fZ r0 = X.C90924f5.A07(r0, r1)     // Catch:{ 43k -> 0x05c3 }
            if (r9 == 0) goto L_0x05ba
            if (r0 == 0) goto L_0x05b1
            boolean r0 = r9.A04(r0)     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x0605
            r0 = r25
            X.C90924f5.A09(r6, r1, r0, r8)     // Catch:{ 43k -> 0x065d }
        L_0x04f3:
            int r9 = r8.A00     // Catch:{ 43k -> 0x065d }
            r0 = 11
            if (r9 != r0) goto L_0x04fe
            r0 = r25
            X.C90924f5.A09(r6, r2, r0, r8)     // Catch:{ 43k -> 0x065d }
        L_0x04fe:
            int r9 = r8.A00     // Catch:{ 43k -> 0x065d }
            r0 = 8
            if (r9 != r0) goto L_0x0508
            r0 = 11
            r8.A00 = r0     // Catch:{ 43k -> 0x065d }
        L_0x0508:
            r0 = r37
            int r0 = r0.A00     // Catch:{ 43k -> 0x065d }
            int r7 = r7.A00     // Catch:{ 43k -> 0x065d }
            r7 = r7 | r0
            r0 = r37
            r0.A00 = r7     // Catch:{ 43k -> 0x065d }
            java.util.Set r0 = r2.getCriticalExtensionOIDs()     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x053b
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0)     // Catch:{ 43k -> 0x065d }
            X.1fY r0 = X.AnonymousClass5IH.A0K     // Catch:{ 43k -> 0x065d }
            java.lang.String r0 = r0.A01     // Catch:{ 43k -> 0x065d }
            r2.remove(r0)     // Catch:{ 43k -> 0x065d }
            X.1fY r0 = X.AnonymousClass5IH.A0C     // Catch:{ 43k -> 0x065d }
            java.lang.String r0 = r0.A01     // Catch:{ 43k -> 0x065d }
            r2.remove(r0)     // Catch:{ 43k -> 0x065d }
            boolean r0 = r2.isEmpty()     // Catch:{ 43k -> 0x065d }
            if (r0 != 0) goto L_0x053b
            java.lang.String r0 = "CRL contains unsupported critical extensions."
            X.43k r1 = new X.43k     // Catch:{ 43k -> 0x065d }
            r1.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x02fb
        L_0x053b:
            if (r1 == 0) goto L_0x0601
            java.util.Set r0 = r1.getCriticalExtensionOIDs()     // Catch:{ 43k -> 0x065d }
            if (r0 == 0) goto L_0x0601
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ 43k -> 0x065d }
            r1.<init>(r0)     // Catch:{ 43k -> 0x065d }
            X.1fY r0 = X.AnonymousClass5IH.A0K     // Catch:{ 43k -> 0x065d }
            java.lang.String r0 = r0.A01     // Catch:{ 43k -> 0x065d }
            r1.remove(r0)     // Catch:{ 43k -> 0x065d }
            X.1fY r0 = X.AnonymousClass5IH.A0C     // Catch:{ 43k -> 0x065d }
            java.lang.String r0 = r0.A01     // Catch:{ 43k -> 0x065d }
            r1.remove(r0)     // Catch:{ 43k -> 0x065d }
            boolean r0 = r1.isEmpty()     // Catch:{ 43k -> 0x065d }
            if (r0 != 0) goto L_0x0601
            java.lang.String r0 = "Delta CRL contains unsupported critical extension."
            X.43k r1 = new X.43k     // Catch:{ 43k -> 0x065d }
            r1.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x02fb
        L_0x0565:
            r1 = move-exception
            java.lang.String r0 = "CRL issuer information from distribution point cannot be decoded."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x056f:
            java.lang.String r0 = "Distribution point contains cRLIssuer field but CRL is not indirect."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0578:
            java.lang.String r0 = "CRL issuer of CRL does not match CRL issuer of distribution point."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0581:
            r1 = move-exception
            java.lang.String r0 = "Could not read CRL issuer."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x058b:
            r1 = move-exception
            java.lang.String r0 = "Could not read certificate issuer."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0595:
            java.lang.String r0 = "Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x059e:
            java.lang.String r0 = "End CRL only contains CA certificates."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05a7:
            r1 = move-exception
            java.lang.String r0 = "Basic constraints extension could not be decoded."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05b1:
            java.lang.String r0 = "Delta CRL authority key identifier is null."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05ba:
            java.lang.String r0 = "CRL authority key identifier is null."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05c3:
            r1 = move-exception
            java.lang.String r0 = "Authority key identifier extension could not be extracted from delta CRL."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05cd:
            r1 = move-exception
            java.lang.String r0 = "Authority key identifier extension could not be extracted from complete CRL."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05d7:
            java.lang.String r0 = "Issuing distribution point extension from delta CRL and complete CRL does not match."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05df:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension from delta CRL could not be decoded."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05e8:
            java.lang.String r0 = "Complete CRL issuer does not match delta CRL issuer."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05f0:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x05f9:
            java.lang.String r0 = "delta CRL has unsupported critical extensions"
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0601:
            r20 = 1
            goto L_0x00ec
        L_0x0605:
            java.lang.String r0 = "Delta CRL authority key identifier does not match complete CRL authority key identifier."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x060d:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0616:
            r7 = move-exception
            java.lang.String r0 = "Exception encoding CRL issuer: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 43k -> 0x065d }
            r1.<init>(r0)     // Catch:{ 43k -> 0x065d }
            java.lang.String r0 = r7.getMessage()     // Catch:{ 43k -> 0x065d }
            r1.append(r0)     // Catch:{ 43k -> 0x065d }
            java.lang.String r0 = r1.toString()     // Catch:{ 43k -> 0x065d }
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r7)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x062f:
            java.lang.String r0 = "Cannot verify CRL."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0637:
            r1 = move-exception
            java.lang.String r0 = "Issuer certificate for CRL cannot be searched."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0640:
            r1 = move-exception
            java.lang.String r0 = "Subject criteria for certificate selector to find issuer certificate for CRL could not be set."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0649:
            r1 = move-exception
            java.lang.String r0 = "Issuing distribution point extension could not be decoded."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x065d }
            goto L_0x065c
        L_0x0652:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ 43k -> 0x065d }
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x065d }
            r2.<init>(r0, r3)     // Catch:{ 43k -> 0x065d }
        L_0x065c:
            throw r2     // Catch:{ 43k -> 0x065d }
        L_0x065d:
            r22 = move-exception
            goto L_0x00ec
        L_0x0660:
            if (r20 == 0) goto L_0x0688
            return
        L_0x0663:
            java.lang.String r1 = "CRL issuer is omitted from distribution point but no distributionPoint field present."
            r0 = 0
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x0675 }
            r2.<init>(r1, r0)     // Catch:{ 43k -> 0x0675 }
            goto L_0x0674
        L_0x066c:
            r1 = move-exception
            java.lang.String r0 = "Cannot decode CRL issuer information."
            X.43k r2 = new X.43k     // Catch:{ 43k -> 0x0675 }
            r2.<init>(r0, r1)     // Catch:{ 43k -> 0x0675 }
        L_0x0674:
            throw r2     // Catch:{ 43k -> 0x0675 }
        L_0x0675:
            r2 = move-exception
            java.lang.String r1 = "Could not get issuer information from distribution point."
            X.43k r0 = new X.43k
            r0.<init>(r1, r2)
            throw r0
        L_0x067e:
            java.lang.String r2 = "Validation time is in future."
            r1 = 0
            X.43k r22 = new X.43k
            r0 = r22
            r0.<init>(r2, r1)
        L_0x0688:
            throw r22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32211fp.A0B(java.security.PublicKey, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.util.Date, java.util.Date, java.util.List, X.5IE, X.4Nv, X.56p, X.5NQ, X.4JF, X.4d4):void");
    }

    public static void A0C(CertPath certPath, int i2) {
        try {
            C32411gJ A002 = C32411gJ.A00(C90924f5.A07(A0B, (X509Certificate) certPath.getCertificates().get(i2)));
            if (A002 != null) {
                int i3 = 0;
                while (i3 < A002.A0A()) {
                    try {
                        C32411gJ A003 = C32411gJ.A00(A002.A0C(i3));
                        C32041fY A004 = C32041fY.A00(A003.A0C(0));
                        C32041fY A005 = C32041fY.A00(A003.A0C(1));
                        if ("2.5.29.32.0".equals(A004.A01)) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", (Throwable) null, certPath, i2);
                        } else if (!"2.5.29.32.0".equals(A005.A01)) {
                            i3++;
                        } else {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", (Throwable) null, certPath, i2);
                        }
                    } catch (Exception e2) {
                        throw new AnonymousClass5BS("Policy mappings extension contents could not be decoded.", e2, certPath, i2);
                    }
                }
            }
        } catch (C803243k e3) {
            throw new AnonymousClass5BS("Policy mappings extension could not be decoded.", e3, certPath, i2);
        }
    }

    public static void A0D(CertPath certPath, int i2) {
        try {
            C33091hv A002 = C33091hv.A00(C90924f5.A07(A02, (X509Certificate) certPath.getCertificates().get(i2)));
            if (A002 != null) {
                C33051hr r0 = A002.A00;
                if (r0 == null || r0.A00 == 0) {
                    throw new CertPathValidatorException("Not a CA certificate", (Throwable) null, certPath, i2);
                }
                return;
            }
            throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", (Throwable) null, certPath, i2);
        } catch (Exception e2) {
            throw new AnonymousClass5BS("Basic constraints extension cannot be decoded.", e2, certPath, i2);
        }
    }

    public static void A0E(CertPath certPath, int i2) {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i2)).getKeyUsage();
        if (keyUsage == null) {
            return;
        }
        if (keyUsage.length <= 5 || !keyUsage[5]) {
            throw new AnonymousClass5BS("Issuer certificate keyusage extension is critical and does not permit key signing.", (Throwable) null, certPath, i2);
        }
    }

    public static void A0F(CertPath certPath, List list, Set set, int i2) {
        Certificate certificate = (Certificate) certPath.getCertificates().get(i2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(certificate, set);
            } catch (CertPathValidatorException e2) {
                throw new CertPathValidatorException(e2.getMessage(), e2.getCause(), certPath, i2);
            }
        }
        if (!set.isEmpty()) {
            StringBuilder sb = new StringBuilder("Certificate has unsupported critical extension: ");
            sb.append(set);
            throw new AnonymousClass5BS(sb.toString(), (Throwable) null, certPath, i2);
        }
    }

    public static void A0G(CertPath certPath, List list, Set set, int i2) {
        Certificate certificate = (Certificate) certPath.getCertificates().get(i2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(certificate, set);
            } catch (CertPathValidatorException e2) {
                throw new AnonymousClass5BS(e2.getMessage(), e2, certPath, i2);
            } catch (Exception e3) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e3, certPath, i2);
            }
        }
        if (!set.isEmpty()) {
            StringBuilder sb = new StringBuilder("Certificate has unsupported critical extension: ");
            sb.append(set);
            throw new AnonymousClass5BS(sb.toString(), (Throwable) null, certPath, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0199, code lost:
        if (java.util.Arrays.equals(r13, r9) != false) goto L_0x019b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0277 A[Catch:{ Exception -> 0x0472 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03eb A[Catch:{ Exception -> 0x0472 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0576 A[Catch:{ Exception -> 0x070e }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x06bb A[Catch:{ Exception -> 0x070e }] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0210 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0384 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(java.security.cert.CertPath r24, X.C615439i r25, int r26) {
        /*
            r4 = r24
            java.util.List r0 = r4.getCertificates()
            r3 = r26
            java.lang.Object r1 = r0.get(r3)
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            java.lang.String r0 = A09     // Catch:{ Exception -> 0x0718 }
            X.1fZ r0 = X.C90924f5.A07(r0, r1)     // Catch:{ Exception -> 0x0718 }
            X.1gJ r0 = X.C32411gJ.A00(r0)     // Catch:{ Exception -> 0x0718 }
            if (r0 == 0) goto L_0x0717
            X.1gJ r0 = X.C32411gJ.A00(r0)     // Catch:{ Exception -> 0x0718 }
            X.5Hv r6 = new X.5Hv     // Catch:{ Exception -> 0x0718 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0718 }
            X.5Hz[] r1 = r6.A01
            r26 = r25
            if (r1 == 0) goto L_0x047b
            int r10 = r1.length
            X.5Hz[] r9 = new X.C107385Hz[r10]
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r9, r0, r10)
            r0 = r26
            X.3Bt r7 = r0.A00     // Catch:{ Exception -> 0x0472 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x0472 }
            r8.<init>()     // Catch:{ Exception -> 0x0472 }
            r5 = 0
        L_0x003a:
            if (r5 == r10) goto L_0x0060
            r2 = r9[r5]     // Catch:{ Exception -> 0x0472 }
            X.5IP r0 = r2.A02     // Catch:{ Exception -> 0x0472 }
            int r0 = r0.A00     // Catch:{ Exception -> 0x0472 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0472 }
            java.lang.Object r0 = r8.get(r1)     // Catch:{ Exception -> 0x0472 }
            if (r0 != 0) goto L_0x0054
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x0472 }
            r0.<init>()     // Catch:{ Exception -> 0x0472 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0472 }
        L_0x0054:
            java.lang.Object r0 = r8.get(r1)     // Catch:{ Exception -> 0x0472 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0472 }
            r0.add(r2)     // Catch:{ Exception -> 0x0472 }
            int r5 = r5 + 1
            goto L_0x003a
        L_0x0060:
            java.util.Set r0 = r8.entrySet()     // Catch:{ Exception -> 0x0472 }
            java.util.Iterator r25 = r0.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x0068:
            boolean r0 = r25.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x047b
            java.lang.Object r1 = r25.next()     // Catch:{ Exception -> 0x0472 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x0472 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ Exception -> 0x0472 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0472 }
            int r2 = r0.intValue()     // Catch:{ Exception -> 0x0472 }
            if (r2 == 0) goto L_0x0411
            r0 = 1
            if (r2 == r0) goto L_0x034f
            r0 = 2
            if (r2 == r0) goto L_0x02f6
            r0 = 4
            if (r2 == r0) goto L_0x029d
            r0 = 6
            if (r2 == r0) goto L_0x01db
            r0 = 7
            if (r2 != r0) goto L_0x045e
            java.util.Set r0 = r7.A09     // Catch:{ Exception -> 0x0472 }
            r24 = r0
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0472 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0472 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ Exception -> 0x0472 }
            r12.<init>()     // Catch:{ Exception -> 0x0472 }
            java.util.Iterator r23 = r0.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x00a2:
            boolean r0 = r23.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r0 = r23.next()     // Catch:{ Exception -> 0x0472 }
            X.5Hz r0 = (X.C107385Hz) r0     // Catch:{ Exception -> 0x0472 }
            X.5IP r0 = r0.A02     // Catch:{ Exception -> 0x0472 }
            X.1fb r0 = r0.A01     // Catch:{ Exception -> 0x0472 }
            X.5Ib r0 = X.C107405Ib.A01(r0)     // Catch:{ Exception -> 0x0472 }
            byte[] r11 = r0.A00     // Catch:{ Exception -> 0x0472 }
            if (r24 != 0) goto L_0x00c0
            if (r11 == 0) goto L_0x00a2
            r12.add(r11)     // Catch:{ Exception -> 0x0472 }
            goto L_0x00a2
        L_0x00c0:
            java.util.Iterator r22 = r24.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x00c4:
            boolean r0 = r22.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r2 = r22.next()     // Catch:{ Exception -> 0x0472 }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x0472 }
            int r1 = r2.length     // Catch:{ Exception -> 0x0472 }
            int r0 = r11.length     // Catch:{ Exception -> 0x0472 }
            if (r1 != r0) goto L_0x019b
            r13 = 2
            int r1 = r1 / r13
            byte[] r10 = new byte[r1]     // Catch:{ Exception -> 0x0472 }
            byte[] r9 = new byte[r1]     // Catch:{ Exception -> 0x0472 }
            r8 = 0
            java.lang.System.arraycopy(r2, r8, r10, r8, r1)     // Catch:{ Exception -> 0x0472 }
            java.lang.System.arraycopy(r2, r1, r9, r8, r1)     // Catch:{ Exception -> 0x0472 }
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0472 }
            byte[] r2 = new byte[r1]     // Catch:{ Exception -> 0x0472 }
            java.lang.System.arraycopy(r11, r8, r5, r8, r1)     // Catch:{ Exception -> 0x0472 }
            java.lang.System.arraycopy(r11, r1, r2, r8, r1)     // Catch:{ Exception -> 0x0472 }
            r0 = 4
            byte[][] r1 = new byte[r0][]     // Catch:{ Exception -> 0x0472 }
            r1[r8] = r10     // Catch:{ Exception -> 0x0472 }
            r0 = 1
            r1[r0] = r9     // Catch:{ Exception -> 0x0472 }
            r1[r13] = r5     // Catch:{ Exception -> 0x0472 }
            r0 = 3
            r1[r0] = r2     // Catch:{ Exception -> 0x0472 }
            r10 = 0
            r15 = r1[r8]     // Catch:{ Exception -> 0x0472 }
            r21 = 1
            r14 = r1[r21]     // Catch:{ Exception -> 0x0472 }
            r20 = 2
            r19 = r1[r13]     // Catch:{ Exception -> 0x0472 }
            r18 = 3
            r17 = r1[r0]     // Catch:{ Exception -> 0x0472 }
            int r8 = r15.length     // Catch:{ Exception -> 0x0472 }
            byte[] r13 = new byte[r8]     // Catch:{ Exception -> 0x0472 }
            byte[] r9 = new byte[r8]     // Catch:{ Exception -> 0x0472 }
            byte[] r5 = new byte[r8]     // Catch:{ Exception -> 0x0472 }
            byte[] r2 = new byte[r8]     // Catch:{ Exception -> 0x0472 }
            r1 = 0
        L_0x0111:
            if (r1 >= r8) goto L_0x0142
            byte r0 = r15[r1]     // Catch:{ Exception -> 0x0472 }
            byte r16 = r14[r1]     // Catch:{ Exception -> 0x0472 }
            r0 = r0 & r16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0472 }
            r13[r1] = r0     // Catch:{ Exception -> 0x0472 }
            byte r0 = r15[r1]     // Catch:{ Exception -> 0x0472 }
            byte r16 = r14[r1]     // Catch:{ Exception -> 0x0472 }
            r0 = r0 & r16
            r16 = r16 ^ -1
            r0 = r0 | r16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0472 }
            r9[r1] = r0     // Catch:{ Exception -> 0x0472 }
            byte r0 = r19[r1]     // Catch:{ Exception -> 0x0472 }
            byte r16 = r17[r1]     // Catch:{ Exception -> 0x0472 }
            r0 = r0 & r16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0472 }
            r5[r1] = r0     // Catch:{ Exception -> 0x0472 }
            byte r0 = r19[r1]     // Catch:{ Exception -> 0x0472 }
            byte r16 = r17[r1]     // Catch:{ Exception -> 0x0472 }
            r0 = r0 & r16
            r16 = r16 ^ -1
            r0 = r0 | r16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0472 }
            r2[r1] = r0     // Catch:{ Exception -> 0x0472 }
            int r1 = r1 + 1
            goto L_0x0111
        L_0x0142:
            r0 = 4
            byte[][] r8 = new byte[r0][]     // Catch:{ Exception -> 0x0472 }
            r8[r10] = r13     // Catch:{ Exception -> 0x0472 }
            r8[r21] = r9     // Catch:{ Exception -> 0x0472 }
            r8[r20] = r5     // Catch:{ Exception -> 0x0472 }
            r8[r18] = r2     // Catch:{ Exception -> 0x0472 }
            r13 = r8[r21]     // Catch:{ Exception -> 0x0472 }
            r9 = r8[r18]     // Catch:{ Exception -> 0x0472 }
            r5 = 0
        L_0x0152:
            int r0 = r13.length     // Catch:{ Exception -> 0x0472 }
            if (r5 >= r0) goto L_0x0163
            byte r2 = r13[r5]     // Catch:{ Exception -> 0x0472 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            byte r0 = r9[r5]     // Catch:{ Exception -> 0x0472 }
            r1 = r1 & r0
            if (r2 < r1) goto L_0x0164
            int r5 = r5 + 1
            goto L_0x0152
        L_0x0163:
            r13 = r9
        L_0x0164:
            r9 = r8[r10]     // Catch:{ Exception -> 0x0472 }
            r15 = r8[r20]     // Catch:{ Exception -> 0x0472 }
            r5 = 0
        L_0x0169:
            int r0 = r9.length     // Catch:{ Exception -> 0x0472 }
            if (r5 >= r0) goto L_0x017a
            byte r2 = r9[r5]     // Catch:{ Exception -> 0x0472 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            byte r0 = r15[r5]     // Catch:{ Exception -> 0x0472 }
            r1 = r1 & r0
            if (r2 > r1) goto L_0x017b
            int r5 = r5 + 1
            goto L_0x0169
        L_0x017a:
            r9 = r15
        L_0x017b:
            boolean r0 = java.util.Arrays.equals(r9, r13)     // Catch:{ Exception -> 0x0472 }
            if (r0 != 0) goto L_0x01a2
            r5 = 0
        L_0x0182:
            int r0 = r9.length     // Catch:{ Exception -> 0x0472 }
            if (r5 >= r0) goto L_0x0195
            byte r2 = r9[r5]     // Catch:{ Exception -> 0x0472 }
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            byte r0 = r13[r5]     // Catch:{ Exception -> 0x0472 }
            r1 = r1 & r0
            if (r2 <= r1) goto L_0x0191
            goto L_0x0194
        L_0x0191:
            int r5 = r5 + 1
            goto L_0x0182
        L_0x0194:
            r13 = r9
        L_0x0195:
            boolean r0 = java.util.Arrays.equals(r13, r9)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x01a2
        L_0x019b:
            java.util.Set r0 = java.util.Collections.EMPTY_SET     // Catch:{ Exception -> 0x0472 }
        L_0x019d:
            r12.addAll(r0)     // Catch:{ Exception -> 0x0472 }
            goto L_0x00c4
        L_0x01a2:
            r13 = r8[r10]     // Catch:{ Exception -> 0x0472 }
            r5 = r8[r20]     // Catch:{ Exception -> 0x0472 }
            int r9 = r13.length     // Catch:{ Exception -> 0x0472 }
            byte[] r8 = new byte[r9]     // Catch:{ Exception -> 0x0472 }
            r2 = 0
        L_0x01aa:
            if (r2 >= r9) goto L_0x01b7
            byte r1 = r13[r2]     // Catch:{ Exception -> 0x0472 }
            byte r0 = r5[r2]     // Catch:{ Exception -> 0x0472 }
            r1 = r1 | r0
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0472 }
            r8[r2] = r0     // Catch:{ Exception -> 0x0472 }
            int r2 = r2 + 1
            goto L_0x01aa
        L_0x01b7:
            int r13 = r14.length     // Catch:{ Exception -> 0x0472 }
            byte[] r5 = new byte[r13]     // Catch:{ Exception -> 0x0472 }
            r2 = 0
        L_0x01bb:
            if (r2 >= r13) goto L_0x01c8
            byte r1 = r14[r2]     // Catch:{ Exception -> 0x0472 }
            byte r0 = r17[r2]     // Catch:{ Exception -> 0x0472 }
            r1 = r1 | r0
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0472 }
            r5[r2] = r0     // Catch:{ Exception -> 0x0472 }
            int r2 = r2 + 1
            goto L_0x01bb
        L_0x01c8:
            int r0 = r9 << 1
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0472 }
            java.lang.System.arraycopy(r8, r10, r0, r10, r9)     // Catch:{ Exception -> 0x0472 }
            java.lang.System.arraycopy(r5, r10, r0, r9, r9)     // Catch:{ Exception -> 0x0472 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ Exception -> 0x0472 }
            goto L_0x019d
        L_0x01d7:
            r7.A09 = r12     // Catch:{ Exception -> 0x0472 }
            goto L_0x0068
        L_0x01db:
            java.util.Set r5 = r7.A0B     // Catch:{ Exception -> 0x0472 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0472 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0472 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x0472 }
            r2.<init>()     // Catch:{ Exception -> 0x0472 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x01ec:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0299
            java.lang.Object r0 = r14.next()     // Catch:{ Exception -> 0x0472 }
            X.5Hz r0 = (X.C107385Hz) r0     // Catch:{ Exception -> 0x0472 }
            X.5IP r0 = r0.A02     // Catch:{ Exception -> 0x0472 }
            X.1fb r0 = r0.A01     // Catch:{ Exception -> 0x0472 }
            X.1ho r0 = X.C33021ho.A00(r0)     // Catch:{ Exception -> 0x0472 }
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x0472 }
            java.lang.String r1 = X.C32941ha.A02(r0)     // Catch:{ Exception -> 0x0472 }
            if (r5 != 0) goto L_0x020c
            r2.add(r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x01ec
        L_0x020c:
            java.util.Iterator r13 = r5.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x0210:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r8 = r13.next()     // Catch:{ Exception -> 0x0472 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0472 }
            r12 = 64
            int r0 = r8.indexOf(r12)     // Catch:{ Exception -> 0x0472 }
            java.lang.String r11 = "."
            r10 = -1
            if (r0 == r10) goto L_0x0243
            int r0 = r0 + 1
            java.lang.String r9 = r8.substring(r0)     // Catch:{ Exception -> 0x0472 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0472 }
            if (r0 != r10) goto L_0x0271
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x023e
            boolean r0 = X.C62133Bt.A03(r9, r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0275
        L_0x023e:
            boolean r0 = r9.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0275
        L_0x0243:
            boolean r9 = r8.startsWith(r11)     // Catch:{ Exception -> 0x0472 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0472 }
            if (r9 == 0) goto L_0x0259
            if (r0 == r10) goto L_0x0278
            r0 = 0
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x0472 }
            boolean r0 = X.C62133Bt.A03(r0, r8)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0292
        L_0x0259:
            if (r0 == r10) goto L_0x0266
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x0472 }
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0292
        L_0x0266:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0271
            boolean r0 = X.C62133Bt.A03(r8, r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0275
        L_0x0271:
            boolean r0 = r8.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0472 }
        L_0x0275:
            if (r0 == 0) goto L_0x0210
            goto L_0x028a
        L_0x0278:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x028e
            boolean r0 = X.C62133Bt.A03(r8, r1)     // Catch:{ Exception -> 0x0472 }
            if (r0 != 0) goto L_0x028a
            boolean r0 = r8.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x028e
        L_0x028a:
            r2.add(r8)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0210
        L_0x028e:
            boolean r0 = X.C62133Bt.A03(r1, r8)     // Catch:{ Exception -> 0x0472 }
        L_0x0292:
            if (r0 == 0) goto L_0x0210
            r2.add(r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0210
        L_0x0299:
            r7.A0B = r2     // Catch:{ Exception -> 0x0472 }
            goto L_0x0068
        L_0x029d:
            java.util.Set r9 = r7.A06     // Catch:{ Exception -> 0x0472 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0472 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0472 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ Exception -> 0x0472 }
            r8.<init>()     // Catch:{ Exception -> 0x0472 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x02ae:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x0472 }
            X.5Hz r0 = (X.C107385Hz) r0     // Catch:{ Exception -> 0x0472 }
            X.5IP r0 = r0.A02     // Catch:{ Exception -> 0x0472 }
            X.1fb r0 = r0.A01     // Catch:{ Exception -> 0x0472 }
            X.1fZ r0 = r0.Agm()     // Catch:{ Exception -> 0x0472 }
            X.1gJ r5 = X.C32411gJ.A00(r0)     // Catch:{ Exception -> 0x0472 }
            if (r9 != 0) goto L_0x02ce
            if (r5 == 0) goto L_0x02ae
            r8.add(r5)     // Catch:{ Exception -> 0x0472 }
            goto L_0x02ae
        L_0x02ce:
            java.util.Iterator r2 = r9.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x02d2:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x02ae
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0472 }
            X.1gJ r1 = (X.C32411gJ) r1     // Catch:{ Exception -> 0x0472 }
            boolean r0 = X.C62133Bt.A04(r5, r1)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x02e8
            r8.add(r5)     // Catch:{ Exception -> 0x0472 }
            goto L_0x02d2
        L_0x02e8:
            boolean r0 = X.C62133Bt.A04(r1, r5)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x02d2
            r8.add(r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x02d2
        L_0x02f2:
            r7.A06 = r8     // Catch:{ Exception -> 0x0472 }
            goto L_0x0068
        L_0x02f6:
            java.util.Set r9 = r7.A07     // Catch:{ Exception -> 0x0472 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0472 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0472 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ Exception -> 0x0472 }
            r8.<init>()     // Catch:{ Exception -> 0x0472 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x0307:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x034b
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x0472 }
            X.5Hz r0 = (X.C107385Hz) r0     // Catch:{ Exception -> 0x0472 }
            X.5IP r0 = r0.A02     // Catch:{ Exception -> 0x0472 }
            X.1fb r0 = r0.A01     // Catch:{ Exception -> 0x0472 }
            X.1ho r0 = X.C33021ho.A00(r0)     // Catch:{ Exception -> 0x0472 }
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x0472 }
            java.lang.String r5 = X.C32941ha.A02(r0)     // Catch:{ Exception -> 0x0472 }
            if (r9 != 0) goto L_0x0327
            r8.add(r5)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0307
        L_0x0327:
            java.util.Iterator r2 = r9.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x032b:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0307
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0472 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0472 }
            boolean r0 = X.C62133Bt.A03(r1, r5)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0341
            r8.add(r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x032b
        L_0x0341:
            boolean r0 = X.C62133Bt.A03(r5, r1)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x032b
            r8.add(r5)     // Catch:{ Exception -> 0x0472 }
            goto L_0x032b
        L_0x034b:
            r7.A07 = r8     // Catch:{ Exception -> 0x0472 }
            goto L_0x0068
        L_0x034f:
            java.util.Set r8 = r7.A08     // Catch:{ Exception -> 0x0472 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0472 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0472 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ Exception -> 0x0472 }
            r5.<init>()     // Catch:{ Exception -> 0x0472 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x0360:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x040d
            java.lang.Object r0 = r14.next()     // Catch:{ Exception -> 0x0472 }
            X.5Hz r0 = (X.C107385Hz) r0     // Catch:{ Exception -> 0x0472 }
            X.5IP r0 = r0.A02     // Catch:{ Exception -> 0x0472 }
            X.1fb r0 = r0.A01     // Catch:{ Exception -> 0x0472 }
            X.1ho r0 = X.C33021ho.A00(r0)     // Catch:{ Exception -> 0x0472 }
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x0472 }
            java.lang.String r2 = X.C32941ha.A02(r0)     // Catch:{ Exception -> 0x0472 }
            if (r8 != 0) goto L_0x0380
            r5.add(r2)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0360
        L_0x0380:
            java.util.Iterator r13 = r8.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x0384:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0360
            java.lang.Object r1 = r13.next()     // Catch:{ Exception -> 0x0472 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0472 }
            r12 = 64
            int r0 = r2.indexOf(r12)     // Catch:{ Exception -> 0x0472 }
            java.lang.String r11 = "."
            r10 = -1
            if (r0 == r10) goto L_0x03b7
            int r0 = r0 + 1
            java.lang.String r9 = r2.substring(r0)     // Catch:{ Exception -> 0x0472 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0472 }
            if (r0 != r10) goto L_0x03e5
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x03b2
            boolean r0 = X.C62133Bt.A03(r9, r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x03e9
        L_0x03b2:
            boolean r0 = r9.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x03e9
        L_0x03b7:
            boolean r9 = r2.startsWith(r11)     // Catch:{ Exception -> 0x0472 }
            int r0 = r1.indexOf(r12)     // Catch:{ Exception -> 0x0472 }
            if (r9 == 0) goto L_0x03cd
            if (r0 == r10) goto L_0x03ec
            r0 = 0
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x0472 }
            boolean r0 = X.C62133Bt.A03(r0, r2)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0406
        L_0x03cd:
            if (r0 == r10) goto L_0x03da
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x0472 }
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0406
        L_0x03da:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x03e5
            boolean r0 = X.C62133Bt.A03(r2, r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x03e9
        L_0x03e5:
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0472 }
        L_0x03e9:
            if (r0 == 0) goto L_0x0384
            goto L_0x03fe
        L_0x03ec:
            boolean r0 = r1.startsWith(r11)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0402
            boolean r0 = X.C62133Bt.A03(r2, r1)     // Catch:{ Exception -> 0x0472 }
            if (r0 != 0) goto L_0x03fe
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0402
        L_0x03fe:
            r5.add(r2)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0384
        L_0x0402:
            boolean r0 = X.C62133Bt.A03(r1, r2)     // Catch:{ Exception -> 0x0472 }
        L_0x0406:
            if (r0 == 0) goto L_0x0384
            r5.add(r1)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0384
        L_0x040d:
            r7.A08 = r5     // Catch:{ Exception -> 0x0472 }
            goto L_0x0068
        L_0x0411:
            java.util.Set r8 = r7.A0A     // Catch:{ Exception -> 0x0472 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x0472 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x0472 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ Exception -> 0x0472 }
            r5.<init>()     // Catch:{ Exception -> 0x0472 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x0422:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x045a
            java.lang.Object r0 = r9.next()     // Catch:{ Exception -> 0x0472 }
            X.5Hz r0 = (X.C107385Hz) r0     // Catch:{ Exception -> 0x0472 }
            X.5IP r0 = r0.A02     // Catch:{ Exception -> 0x0472 }
            X.1fb r0 = r0.A01     // Catch:{ Exception -> 0x0472 }
            X.5Hw r2 = X.C107355Hw.A00(r0)     // Catch:{ Exception -> 0x0472 }
            if (r8 != 0) goto L_0x043e
            if (r2 == 0) goto L_0x0422
            r5.add(r2)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0422
        L_0x043e:
            java.util.Iterator r1 = r8.iterator()     // Catch:{ Exception -> 0x0472 }
        L_0x0442:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0422
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0472 }
            X.5Hw r0 = X.C107355Hw.A00(r0)     // Catch:{ Exception -> 0x0472 }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x0472 }
            if (r0 == 0) goto L_0x0442
            r5.add(r2)     // Catch:{ Exception -> 0x0472 }
            goto L_0x0442
        L_0x045a:
            r7.A0A = r5     // Catch:{ Exception -> 0x0472 }
            goto L_0x0068
        L_0x045e:
            java.lang.String r1 = "Unknown tag encountered: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0472 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0472 }
            r0.append(r2)     // Catch:{ Exception -> 0x0472 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0472 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0472 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0472 }
            throw r0     // Catch:{ Exception -> 0x0472 }
        L_0x0472:
            r2 = move-exception
            java.lang.String r1 = "Permitted subtrees cannot be build from name constraints extension."
            X.5BS r0 = new X.5BS
            r0.<init>(r1, r2, r4, r3)
            throw r0
        L_0x047b:
            X.5Hz[] r1 = r6.A00
            if (r1 == 0) goto L_0x0717
            int r7 = r1.length
            X.5Hz[] r6 = new X.C107385Hz[r7]
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r6, r0, r7)
            r5 = 0
        L_0x0487:
            if (r5 == r7) goto L_0x0717
            r1 = r6[r5]     // Catch:{ Exception -> 0x070e }
            r0 = r26
            X.3Bt r8 = r0.A00     // Catch:{ Exception -> 0x070e }
            X.5IP r9 = r1.A02     // Catch:{ Exception -> 0x070e }
            int r2 = r9.A00     // Catch:{ Exception -> 0x070e }
            if (r2 == 0) goto L_0x06e4
            r0 = 1
            if (r2 == r0) goto L_0x062f
            r0 = 2
            if (r2 == r0) goto L_0x05e9
            r0 = 4
            if (r2 == r0) goto L_0x059f
            r0 = 6
            if (r2 == r0) goto L_0x04ea
            r0 = 7
            if (r2 != r0) goto L_0x06fa
            java.util.Set r1 = r8.A03     // Catch:{ Exception -> 0x070e }
            X.1fb r0 = r9.A01     // Catch:{ Exception -> 0x070e }
            X.5Ib r0 = X.C107405Ib.A01(r0)     // Catch:{ Exception -> 0x070e }
            byte[] r11 = r0.A00     // Catch:{ Exception -> 0x070e }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x04b7
            if (r11 == 0) goto L_0x04e6
            goto L_0x04e3
        L_0x04b7:
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ Exception -> 0x070e }
            r10.<init>()     // Catch:{ Exception -> 0x070e }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ Exception -> 0x070e }
        L_0x04c0:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x04e1
            java.lang.Object r2 = r9.next()     // Catch:{ Exception -> 0x070e }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x070e }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x070e }
            r1.<init>()     // Catch:{ Exception -> 0x070e }
            boolean r0 = java.util.Arrays.equals(r2, r11)     // Catch:{ Exception -> 0x070e }
            r1.add(r2)     // Catch:{ Exception -> 0x070e }
            if (r0 != 0) goto L_0x04dd
            r1.add(r11)     // Catch:{ Exception -> 0x070e }
        L_0x04dd:
            r10.addAll(r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x04c0
        L_0x04e1:
            r1 = r10
            goto L_0x04e6
        L_0x04e3:
            r1.add(r11)     // Catch:{ Exception -> 0x070e }
        L_0x04e6:
            r8.A03 = r1     // Catch:{ Exception -> 0x070e }
            goto L_0x06f6
        L_0x04ea:
            java.util.Set r1 = r8.A05     // Catch:{ Exception -> 0x070e }
            X.1fb r0 = r9.A01     // Catch:{ Exception -> 0x070e }
            X.1ho r0 = X.C33021ho.A00(r0)     // Catch:{ Exception -> 0x070e }
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x070e }
            java.lang.String r9 = X.C32941ha.A02(r0)     // Catch:{ Exception -> 0x070e }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x0505
            r1.add(r9)     // Catch:{ Exception -> 0x070e }
        L_0x0501:
            r8.A05 = r1     // Catch:{ Exception -> 0x070e }
            goto L_0x06f6
        L_0x0505:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x070e }
            r2.<init>()     // Catch:{ Exception -> 0x070e }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x070e }
        L_0x050e:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x059c
            java.lang.Object r1 = r14.next()     // Catch:{ Exception -> 0x070e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x070e }
            r13 = 64
            int r0 = r1.indexOf(r13)     // Catch:{ Exception -> 0x070e }
            java.lang.String r12 = "."
            r11 = -1
            if (r0 == r11) goto L_0x0541
            int r0 = r0 + 1
            java.lang.String r10 = r1.substring(r0)     // Catch:{ Exception -> 0x070e }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x070e }
            if (r0 != r11) goto L_0x0570
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x053c
            boolean r0 = X.C62133Bt.A03(r10, r9)     // Catch:{ Exception -> 0x070e }
            goto L_0x056d
        L_0x053c:
            boolean r0 = r10.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x070e }
            goto L_0x056d
        L_0x0541:
            boolean r10 = r1.startsWith(r12)     // Catch:{ Exception -> 0x070e }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x070e }
            if (r10 == 0) goto L_0x0557
            if (r0 == r11) goto L_0x057b
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x070e }
            boolean r0 = X.C62133Bt.A03(r0, r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x0574
        L_0x0557:
            if (r0 == r11) goto L_0x0563
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x070e }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x0574
        L_0x0563:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x0570
            boolean r0 = X.C62133Bt.A03(r1, r9)     // Catch:{ Exception -> 0x070e }
        L_0x056d:
            if (r0 == 0) goto L_0x0577
            goto L_0x058d
        L_0x0570:
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x070e }
        L_0x0574:
            if (r0 == 0) goto L_0x0577
            goto L_0x0597
        L_0x0577:
            r2.add(r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x058d
        L_0x057b:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x0592
            boolean r0 = X.C62133Bt.A03(r1, r9)     // Catch:{ Exception -> 0x070e }
            if (r0 != 0) goto L_0x058d
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x0592
        L_0x058d:
            r2.add(r9)     // Catch:{ Exception -> 0x070e }
            goto L_0x050e
        L_0x0592:
            boolean r0 = X.C62133Bt.A03(r9, r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x0574
        L_0x0597:
            r2.add(r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x050e
        L_0x059c:
            r1 = r2
            goto L_0x0501
        L_0x059f:
            java.util.Set r1 = r8.A00     // Catch:{ Exception -> 0x070e }
            X.1fb r0 = r9.A01     // Catch:{ Exception -> 0x070e }
            X.1fZ r10 = r0.Agm()     // Catch:{ Exception -> 0x070e }
            X.1gJ r10 = (X.C32411gJ) r10     // Catch:{ Exception -> 0x070e }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x05b2
            if (r10 == 0) goto L_0x05e5
            goto L_0x05e2
        L_0x05b2:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ Exception -> 0x070e }
            r9.<init>()     // Catch:{ Exception -> 0x070e }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x070e }
        L_0x05bb:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x05e0
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x070e }
            X.1gJ r1 = X.C32411gJ.A00(r0)     // Catch:{ Exception -> 0x070e }
            boolean r0 = X.C62133Bt.A04(r10, r1)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x05d3
            r9.add(r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x05bb
        L_0x05d3:
            boolean r0 = X.C62133Bt.A04(r1, r10)     // Catch:{ Exception -> 0x070e }
            if (r0 != 0) goto L_0x05dc
            r9.add(r1)     // Catch:{ Exception -> 0x070e }
        L_0x05dc:
            r9.add(r10)     // Catch:{ Exception -> 0x070e }
            goto L_0x05bb
        L_0x05e0:
            r1 = r9
            goto L_0x05e5
        L_0x05e2:
            r1.add(r10)     // Catch:{ Exception -> 0x070e }
        L_0x05e5:
            r8.A00 = r1     // Catch:{ Exception -> 0x070e }
            goto L_0x06f6
        L_0x05e9:
            java.util.Set r1 = r8.A01     // Catch:{ Exception -> 0x070e }
            X.1fb r0 = r9.A01     // Catch:{ Exception -> 0x070e }
            X.1ho r0 = X.C33021ho.A00(r0)     // Catch:{ Exception -> 0x070e }
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x070e }
            java.lang.String r10 = X.C32941ha.A02(r0)     // Catch:{ Exception -> 0x070e }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x0604
            r1.add(r10)     // Catch:{ Exception -> 0x070e }
        L_0x0600:
            r8.A01 = r1     // Catch:{ Exception -> 0x070e }
            goto L_0x06f6
        L_0x0604:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ Exception -> 0x070e }
            r9.<init>()     // Catch:{ Exception -> 0x070e }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x070e }
        L_0x060d:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x062d
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x070e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x070e }
            boolean r0 = X.C62133Bt.A03(r1, r10)     // Catch:{ Exception -> 0x070e }
            if (r0 != 0) goto L_0x0629
            boolean r0 = X.C62133Bt.A03(r10, r1)     // Catch:{ Exception -> 0x070e }
            r9.add(r1)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x0629
            goto L_0x060d
        L_0x0629:
            r9.add(r10)     // Catch:{ Exception -> 0x070e }
            goto L_0x060d
        L_0x062d:
            r1 = r9
            goto L_0x0600
        L_0x062f:
            java.util.Set r1 = r8.A02     // Catch:{ Exception -> 0x070e }
            X.1fb r0 = r9.A01     // Catch:{ Exception -> 0x070e }
            X.1ho r0 = X.C33021ho.A00(r0)     // Catch:{ Exception -> 0x070e }
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x070e }
            java.lang.String r9 = X.C32941ha.A02(r0)     // Catch:{ Exception -> 0x070e }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x064a
            r1.add(r9)     // Catch:{ Exception -> 0x070e }
        L_0x0646:
            r8.A02 = r1     // Catch:{ Exception -> 0x070e }
            goto L_0x06f6
        L_0x064a:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x070e }
            r2.<init>()     // Catch:{ Exception -> 0x070e }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x070e }
        L_0x0653:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x06e1
            java.lang.Object r1 = r14.next()     // Catch:{ Exception -> 0x070e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x070e }
            r13 = 64
            int r0 = r1.indexOf(r13)     // Catch:{ Exception -> 0x070e }
            java.lang.String r12 = "."
            r11 = -1
            if (r0 == r11) goto L_0x0686
            int r0 = r0 + 1
            java.lang.String r10 = r1.substring(r0)     // Catch:{ Exception -> 0x070e }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x070e }
            if (r0 != r11) goto L_0x06b5
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x0681
            boolean r0 = X.C62133Bt.A03(r10, r9)     // Catch:{ Exception -> 0x070e }
            goto L_0x06b2
        L_0x0681:
            boolean r0 = r10.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x070e }
            goto L_0x06b2
        L_0x0686:
            boolean r10 = r1.startsWith(r12)     // Catch:{ Exception -> 0x070e }
            int r0 = r9.indexOf(r13)     // Catch:{ Exception -> 0x070e }
            if (r10 == 0) goto L_0x069c
            if (r0 == r11) goto L_0x06c0
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x070e }
            boolean r0 = X.C62133Bt.A03(r0, r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x06b9
        L_0x069c:
            if (r0 == r11) goto L_0x06a8
            r0 = 0
            java.lang.String r0 = r9.substring(r0)     // Catch:{ Exception -> 0x070e }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x06b9
        L_0x06a8:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x06b5
            boolean r0 = X.C62133Bt.A03(r1, r9)     // Catch:{ Exception -> 0x070e }
        L_0x06b2:
            if (r0 == 0) goto L_0x06bc
            goto L_0x06d2
        L_0x06b5:
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x070e }
        L_0x06b9:
            if (r0 == 0) goto L_0x06bc
            goto L_0x06dc
        L_0x06bc:
            r2.add(r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x06d2
        L_0x06c0:
            boolean r0 = r9.startsWith(r12)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x06d7
            boolean r0 = X.C62133Bt.A03(r1, r9)     // Catch:{ Exception -> 0x070e }
            if (r0 != 0) goto L_0x06d2
            boolean r0 = r1.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x070e }
            if (r0 == 0) goto L_0x06d7
        L_0x06d2:
            r2.add(r9)     // Catch:{ Exception -> 0x070e }
            goto L_0x0653
        L_0x06d7:
            boolean r0 = X.C62133Bt.A03(r9, r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x06b9
        L_0x06dc:
            r2.add(r1)     // Catch:{ Exception -> 0x070e }
            goto L_0x0653
        L_0x06e1:
            r1 = r2
            goto L_0x0646
        L_0x06e4:
            java.util.Set r2 = r8.A04     // Catch:{ Exception -> 0x070e }
            X.1fb r0 = r9.A01     // Catch:{ Exception -> 0x070e }
            X.5Hw r1 = X.C107355Hw.A00(r0)     // Catch:{ Exception -> 0x070e }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x070e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x070e }
            r0.add(r1)     // Catch:{ Exception -> 0x070e }
            r8.A04 = r0     // Catch:{ Exception -> 0x070e }
        L_0x06f6:
            int r5 = r5 + 1
            goto L_0x0487
        L_0x06fa:
            java.lang.String r1 = "Unknown tag encountered: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x070e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x070e }
            r0.append(r2)     // Catch:{ Exception -> 0x070e }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x070e }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x070e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x070e }
            throw r0     // Catch:{ Exception -> 0x070e }
        L_0x070e:
            r2 = move-exception
            java.lang.String r1 = "Excluded subtrees cannot be build from name constraints extension."
            X.5BS r0 = new X.5BS
            r0.<init>(r1, r2, r4, r3)
            throw r0
        L_0x0717:
            return
        L_0x0718:
            r2 = move-exception
            java.lang.String r1 = "Name constraints extension could not be decoded."
            X.5BS r0 = new X.5BS
            r0.<init>(r1, r2, r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32211fp.A0H(java.security.cert.CertPath, X.39i, int):void");
    }

    public static void A0I(CertPath certPath, C615439i r14, int i2, boolean z2) {
        C803343l r2;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i2);
        int size = certificates.size();
        int i3 = size - i2;
        if (!x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN()) || (i3 >= size && !z2)) {
            try {
                C32411gJ A002 = C32411gJ.A00(C90554eM.A03(x509Certificate));
                try {
                    C62133Bt r1 = r14.A00;
                    r1.A08(AnonymousClass5IQ.A01(A002));
                    try {
                        r1.A07(AnonymousClass5IQ.A01(A002));
                        try {
                            AnonymousClass5IG A003 = AnonymousClass5IG.A00(C90924f5.A07(A0C, x509Certificate));
                            AnonymousClass5IQ A012 = AnonymousClass5IQ.A01(A002);
                            C32041fY r10 = AnonymousClass5J5.A0F;
                            AnonymousClass5IJ[] r9 = A012.A04;
                            int length = r9.length;
                            AnonymousClass5IJ[] r4 = new AnonymousClass5IJ[length];
                            int i4 = 0;
                            for (int i5 = 0; i5 != length; i5++) {
                                AnonymousClass5IJ r3 = r9[i5];
                                C107595Iu r11 = r3.A00;
                                int length2 = r11.A01.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length2) {
                                        break;
                                    } else if (AnonymousClass5I9.A00(r11.A01[i6]).A01.A04(r10)) {
                                        r4[i4] = r3;
                                        i4++;
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            if (i4 < length) {
                                AnonymousClass5IJ[] r0 = new AnonymousClass5IJ[i4];
                                System.arraycopy(r4, 0, r0, 0, i4);
                                r4 = r0;
                            }
                            int i7 = 0;
                            int i8 = 0;
                            while (i8 != r4.length) {
                                AnonymousClass5IP r02 = new AnonymousClass5IP(((C33031hp) r4[i8].A03().A00).AGJ());
                                try {
                                    r14.A02(r02);
                                    r14.A01(r02);
                                    i8++;
                                } catch (C803343l e2) {
                                    throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e2, certPath, i2);
                                }
                            }
                            if (A003 != null) {
                                try {
                                    AnonymousClass5IP[] A032 = A003.A03();
                                    while (i7 < A032.length) {
                                        try {
                                            r14.A02(A032[i7]);
                                            r14.A01(A032[i7]);
                                            i7++;
                                        } catch (C803343l e3) {
                                            throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e3, certPath, i2);
                                        }
                                    }
                                } catch (Exception e4) {
                                    throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e4, certPath, i2);
                                }
                            }
                        } catch (Exception e5) {
                            throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e5, certPath, i2);
                        }
                    } catch (AnonymousClass43V e6) {
                        r2 = new C803343l(e6.getMessage(), e6);
                        throw r2;
                    }
                } catch (AnonymousClass43V e7) {
                    try {
                        r2 = new C803343l(e7.getMessage(), e7);
                        throw r2;
                    } catch (C803343l e8) {
                        throw new CertPathValidatorException("Subtree check for certificate subject failed.", e8, certPath, i2);
                    }
                }
            } catch (Exception e9) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e9, certPath, i2);
            }
        }
    }
}
