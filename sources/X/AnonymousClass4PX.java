package X;

/* renamed from: X.4PX  reason: invalid class name */
public abstract class AnonymousClass4PX {
    public static C77463vo A00(C108125Mt r5, C82814Eg r6, AnonymousClass4NO r7, Throwable th, int i2) {
        return new C77463vo(r5, r6, r7, "Unexpected event type", th, i2);
    }

    public static void A01(C103044zw r2) {
        r2.A0C.A02 = System.currentTimeMillis();
    }

    public static byte[] A02(AnonymousClass392 r3, byte[] bArr) {
        return r3.A01(bArr, C32311g7.A08("key", new byte[0], 16), 16);
    }

    public static byte[] A03(C103044zw r4, byte[] bArr) {
        return r4.A09.A01(bArr, C32311g7.A08("iv", new byte[0], 12), 12);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A04(X.C108125Mt r18, X.C82814Eg r19, X.AnonymousClass4NO r20, int r21) {
        /*
            r17 = this;
            r0 = r18
            r4 = r17
            boolean r3 = r4 instanceof X.C77253vT
            r1 = r19
            r16 = r20
            r2 = r21
            if (r3 == 0) goto L_0x002b
            X.4zw r0 = (X.C103044zw) r0
            A01(r0)
            java.lang.Object r4 = r1.A00
            byte[] r4 = (byte[]) r4
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x001d }
            r3.A00(r4)     // Catch:{ 1aU -> 0x001d }
            return
        L_0x001d:
            r8 = move-exception
            java.lang.String r7 = "Failed to update transcripts."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x002b:
            boolean r3 = r4 instanceof X.C77243vS
            if (r3 == 0) goto L_0x0069
            X.4zw r0 = (X.C103044zw) r0
            boolean r3 = r1 instanceof X.C77453vn
            if (r3 == 0) goto L_0x0307
            A01(r0)     // Catch:{ 1aU -> 0x0056, RuntimeException -> 0x0048 }
            r3 = r1
            X.3vn r3 = (X.C77453vn) r3     // Catch:{ 1aU -> 0x0056, RuntimeException -> 0x0048 }
            java.lang.Object r3 = r3.A00     // Catch:{ 1aU -> 0x0056, RuntimeException -> 0x0048 }
            byte[] r3 = (byte[]) r3     // Catch:{ 1aU -> 0x0056, RuntimeException -> 0x0048 }
            byte[] r4 = X.AnonymousClass4Y0.A00(r3)     // Catch:{ 1aU -> 0x0056, RuntimeException -> 0x0048 }
            r3 = 0
            X.AnonymousClass475.A00(r0, r4, r3)     // Catch:{ 1aU -> 0x0056, RuntimeException -> 0x0048 }
            return
        L_0x0048:
            r8 = move-exception
            java.lang.String r7 = "Server Hello parse error."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0056:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = r4.ex
            java.lang.String r7 = r3.getMessage()
            X.3vo r3 = new X.3vo
            r8 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0069:
            boolean r3 = r4 instanceof X.C77233vR
            if (r3 == 0) goto L_0x00c2
            X.4zw r0 = (X.C103044zw) r0
            boolean r3 = r1 instanceof X.C77443vm
            r7 = 80
            if (r3 == 0) goto L_0x00ba
            A01(r0)     // Catch:{ 1aU -> 0x00ac }
            java.lang.Object r3 = r1.A00     // Catch:{ 1aU -> 0x00ac }
            byte[] r3 = (byte[]) r3     // Catch:{ 1aU -> 0x00ac }
            byte[] r6 = X.AnonymousClass4Y0.A00(r3)     // Catch:{ 1aU -> 0x00ac }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x00ac }
            java.lang.String r3 = "server_finished"
            byte[] r5 = X.AnonymousClass3K4.A1D(r3, r4)     // Catch:{ 1aU -> 0x00ac }
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x00ac }
            byte[] r4 = r3.A02()     // Catch:{ 1aU -> 0x00ac }
            java.lang.String r3 = r0.A0P     // Catch:{ 1aU -> 0x00ac }
            byte[] r3 = X.C32311g7.A09(r3, r5, r4)     // Catch:{ 1aU -> 0x00ac }
            boolean r3 = X.C32311g7.A04(r3, r6)     // Catch:{ 1aU -> 0x00ac }
            if (r3 != 0) goto L_0x07bd
            java.lang.String r3 = "Failed to verify server fin."
            X.1aU r9 = X.AnonymousClass3K2.A0S(r3, r7)     // Catch:{ 1aU -> 0x00ac }
            X.3vo r4 = new X.3vo     // Catch:{ 1aU -> 0x00ac }
            r8 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 1aU -> 0x00ac }
            throw r4     // Catch:{ 1aU -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            java.lang.String r7 = "Failed to process finished message."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x00ba:
            java.lang.String r3 = "Unexpected event"
            X.1aU r4 = X.AnonymousClass3K2.A0S(r3, r7)
            goto L_0x0830
        L_0x00c2:
            boolean r3 = r4 instanceof X.C77223vQ
            if (r3 == 0) goto L_0x0254
            X.4zw r0 = (X.C103044zw) r0
            java.lang.String r9 = " got "
            java.lang.String r10 = "Expected signature scheme "
            A01(r0)
            boolean r3 = r1 instanceof X.C77433vl
            r8 = 80
            if (r3 == 0) goto L_0x082a
            java.lang.String r4 = "TLS 1.3, server CertificateVerify"
            java.lang.String r3 = "UTF-8"
            byte[] r7 = r4.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x0242 }
            r3 = 64
            byte[] r6 = new byte[r3]
            r3 = 32
            java.util.Arrays.fill(r6, r3)
            java.lang.Object r3 = r1.A00     // Catch:{ 1aU -> 0x0234 }
            byte[] r3 = (byte[]) r3     // Catch:{ 1aU -> 0x0234 }
            byte[] r3 = X.AnonymousClass4Y0.A00(r3)     // Catch:{ 1aU -> 0x0234 }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 1aU -> 0x0234 }
            short r5 = r4.getShort()     // Catch:{ 1aU -> 0x0234 }
            byte[] r15 = X.AnonymousClass3K2.A1Z(r4)     // Catch:{ 1aU -> 0x0234 }
            r4 = 1027(0x403, float:1.439E-42)
            if (r5 != r4) goto L_0x020f
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x0234 }
            byte[] r5 = r3.A02()     // Catch:{ 1aU -> 0x0234 }
            int r3 = r7.length
            int r3 = r3 + 64
            r8 = 1
            int r4 = r3 + 1
            int r3 = r5.length
            int r4 = r4 + r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r4)
            r3.put(r6)
            r3.put(r7)
            r10 = 0
            r3.put(r10)
            r3.put(r5)
            byte[] r14 = r3.array()
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()
            java.util.List r3 = r0.A0T
            java.util.Iterator r6 = r3.iterator()
        L_0x012b:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0160
            java.lang.Object r4 = r6.next()
            X.4Qw r4 = (X.C86014Qw) r4
            java.lang.String r3 = "X.509"
            java.security.cert.CertificateFactory r5 = java.security.cert.CertificateFactory.getInstance(r3)     // Catch:{ CertificateException -> 0x014c }
            byte[] r4 = r4.A01     // Catch:{ CertificateException -> 0x014c }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x014c }
            r3.<init>(r4)     // Catch:{ CertificateException -> 0x014c }
            java.security.cert.Certificate r3 = r5.generateCertificate(r3)     // Catch:{ CertificateException -> 0x014c }
            r9.add(r3)     // Catch:{ CertificateException -> 0x014c }
            goto L_0x012b
        L_0x014c:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException
            r3.<init>(r4)
            java.lang.String r8 = "Bad certificate"
            X.3vo r4 = new X.3vo
            r9 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            throw r4
        L_0x0160:
            X.4J9 r5 = r0.A0J     // Catch:{ 1aU -> 0x0201 }
            java.security.cert.X509Certificate[] r3 = new java.security.cert.X509Certificate[r10]     // Catch:{ 1aU -> 0x0201 }
            java.lang.Object[] r13 = r9.toArray(r3)     // Catch:{ 1aU -> 0x0201 }
            java.security.cert.X509Certificate[] r13 = (java.security.cert.X509Certificate[]) r13     // Catch:{ 1aU -> 0x0201 }
            java.lang.String r12 = r0.A0Q     // Catch:{ 1aU -> 0x0201 }
            java.lang.String r11 = ""
            r6 = 42
            r7 = 80
            javax.net.ssl.X509TrustManager r3 = r5.A00     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            if (r3 == 0) goto L_0x01e5
            if (r13 == 0) goto L_0x01de
            int r3 = r13.length     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            if (r3 == 0) goto L_0x01de
            java.lang.String r3 = "SHA256withECDSA"
            java.security.Signature r4 = java.security.Signature.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            r3 = r13[r10]     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            r4.initVerify(r3)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            r4.update(r14)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            boolean r14 = r4.verify(r15)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            if (r14 == 0) goto L_0x01a5
            javax.net.ssl.X509TrustManager r4 = r5.A00     // Catch:{ CertificateException -> 0x0197 }
            java.lang.String r3 = "EC"
            r4.checkServerTrusted(r13, r3)     // Catch:{ CertificateException -> 0x0197 }
            goto L_0x01a5
        L_0x0197:
            r5 = move-exception
            java.lang.String r3 = "Certificate could not be verified"
            javax.net.ssl.SSLException r4 = new javax.net.ssl.SSLException     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            r4.<init>(r3, r5)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            X.1aU r3 = new X.1aU     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            r3.<init>(r4, r6)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            throw r3     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
        L_0x01a5:
            r5 = 0
            r3 = -1
            X.1aT r4 = new X.1aT     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            r4.<init>(r5, r11, r11, r3)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            r4.A01(r13)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            javax.net.ssl.HostnameVerifier r3 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            boolean r3 = r3.verify(r12, r4)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            if (r14 == 0) goto L_0x01cb
            if (r3 == 0) goto L_0x01cb
            X.1aT r2 = r0.A0C
            java.security.cert.Certificate[] r1 = new java.security.cert.Certificate[r10]
            java.lang.Object[] r1 = r9.toArray(r1)
            java.security.cert.Certificate[] r1 = (java.security.cert.Certificate[]) r1
            r2.A01(r1)
            r0.A0b = r8
            return
        L_0x01cb:
            java.lang.String r3 = "ServerCertificate verify failed."
            X.1aU r8 = X.AnonymousClass3K2.A0S(r3, r6)
            java.lang.String r7 = "Certificates could not be verified."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x01de:
            java.lang.String r3 = "Null or empty certificates certificates"
            X.1aU r3 = X.AnonymousClass3K2.A0S(r3, r7)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
            goto L_0x01eb
        L_0x01e5:
            java.lang.String r3 = "Trust Manager cannot be null."
            X.1aU r3 = X.AnonymousClass3K2.A0S(r3, r7)     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
        L_0x01eb:
            throw r3     // Catch:{ NoSuchAlgorithmException -> 0x01f3, InvalidKeyException -> 0x01fa, SignatureException -> 0x01ec }
        L_0x01ec:
            java.lang.String r3 = "Signature is invalid"
            X.1aU r3 = X.AnonymousClass3K2.A0S(r3, r6)     // Catch:{ 1aU -> 0x0201 }
            goto L_0x0200
        L_0x01f3:
            java.lang.String r3 = "SHA256withECDSA not found."
            X.1aU r3 = X.AnonymousClass3K2.A0S(r3, r7)     // Catch:{ 1aU -> 0x0201 }
            goto L_0x0200
        L_0x01fa:
            java.lang.String r3 = "Certificate key is invalid."
            X.1aU r3 = X.AnonymousClass3K2.A0S(r3, r6)     // Catch:{ 1aU -> 0x0201 }
        L_0x0200:
            throw r3     // Catch:{ 1aU -> 0x0201 }
        L_0x0201:
            r8 = move-exception
            java.lang.String r7 = "Certificates verify failed."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x020f:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r10)     // Catch:{ 1aU -> 0x0234 }
            r3.append(r4)     // Catch:{ 1aU -> 0x0234 }
            java.lang.String r7 = X.C13680ns.A0i(r9, r3, r5)     // Catch:{ 1aU -> 0x0234 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r10)     // Catch:{ 1aU -> 0x0234 }
            r3.append(r4)     // Catch:{ 1aU -> 0x0234 }
            java.lang.String r3 = X.C13680ns.A0i(r9, r3, r5)     // Catch:{ 1aU -> 0x0234 }
            X.1aU r8 = X.AnonymousClass3K2.A0S(r3, r8)     // Catch:{ 1aU -> 0x0234 }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x0234 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x0234 }
            throw r3     // Catch:{ 1aU -> 0x0234 }
        L_0x0234:
            r8 = move-exception
            java.lang.String r7 = ""
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0242:
            r3 = move-exception
            X.1aU r8 = X.AnonymousClass3K2.A0T(r3)
            java.lang.String r7 = "Could not encode context string in UTF-8"
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0254:
            boolean r3 = r4 instanceof X.C77213vP
            if (r3 == 0) goto L_0x02fe
            X.4zw r0 = (X.C103044zw) r0
            boolean r3 = r1 instanceof X.C77423vk
            r5 = 80
            if (r3 == 0) goto L_0x02f6
            A01(r0)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r3 = r1
            X.3vk r3 = (X.C77423vk) r3     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            java.lang.Object r3 = r3.A00     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            byte[] r3 = (byte[]) r3     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            byte[] r3 = X.AnonymousClass4Y0.A00(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            byte r3 = r4.get()     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            if (r3 != 0) goto L_0x02c7
            r3 = 3
            byte[] r3 = new byte[r3]     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r4.get(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            int r10 = X.C32311g7.A00(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            byte[] r3 = new byte[r10]     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r4.get(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r7 = 0
        L_0x0290:
            if (r7 >= r10) goto L_0x02c4
            r3 = 3
            byte[] r3 = new byte[r3]     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r8.get(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            int r11 = X.C32311g7.A00(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            byte[] r6 = new byte[r11]     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r8.get(r6)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r3 = 2
            byte[] r3 = new byte[r3]     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r8.get(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            int r5 = X.C32311g7.A01(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            byte[] r3 = new byte[r5]     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r8.get(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            X.4bq r4 = new X.4bq     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r4.<init>(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            int r3 = r11 + 3
            int r3 = r3 + 2
            int r3 = r3 + r5
            int r7 = r7 + r3
            X.4Qw r3 = new X.4Qw     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r3.<init>(r4, r6)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r9.add(r3)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            goto L_0x0290
        L_0x02c4:
            r0.A0T = r9     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            return
        L_0x02c7:
            java.lang.String r7 = "Unexpected certificate size"
            java.lang.String r3 = "Unexpected Message"
            X.1aU r8 = X.AnonymousClass3K2.A0S(r3, r5)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
            throw r3     // Catch:{ 1aU -> 0x02e8, RuntimeException -> 0x02da }
        L_0x02da:
            r8 = move-exception
            java.lang.String r7 = "Failed to parse certificate."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x02e8:
            r8 = move-exception
            java.lang.String r7 = "Failed to process certificate"
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x02f6:
            java.lang.String r3 = "Unexpected event"
            X.1aU r4 = X.AnonymousClass3K2.A0S(r3, r5)
            goto L_0x0830
        L_0x02fe:
            boolean r3 = r4 instanceof X.C77203vO
            if (r3 == 0) goto L_0x0311
            X.4zw r0 = (X.C103044zw) r0
            A01(r0)
        L_0x0307:
            r4 = 80
        L_0x0309:
            java.lang.String r3 = "Unexpected event"
            X.1aU r4 = X.AnonymousClass3K2.A0S(r3, r4)
            goto L_0x0830
        L_0x0311:
            boolean r3 = r4 instanceof X.C77193vN
            if (r3 == 0) goto L_0x0328
            X.4zw r0 = (X.C103044zw) r0
            java.lang.String r5 = "Invalid key update type "
            A01(r0)
            boolean r3 = r1 instanceof X.C77413vj
            r6 = 80
            if (r3 == 0) goto L_0x0537
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            goto L_0x03d1
        L_0x0328:
            boolean r3 = r4 instanceof X.C77183vM
            if (r3 == 0) goto L_0x033d
            X.4zw r0 = (X.C103044zw) r0
            A01(r0)
            boolean r3 = r1 instanceof X.C77393vh
            r4 = 80
            if (r3 == 0) goto L_0x0309
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            goto L_0x053f
        L_0x033d:
            boolean r3 = r4 instanceof X.C77173vL
            if (r3 == 0) goto L_0x0349
            X.4zw r0 = (X.C103044zw) r0
            boolean r3 = r1 instanceof X.C77383vg
            if (r3 == 0) goto L_0x0307
            goto L_0x0661
        L_0x0349:
            boolean r3 = r4 instanceof X.C77163vK
            if (r3 == 0) goto L_0x035e
            X.4zw r0 = (X.C103044zw) r0
            A01(r0)
            boolean r3 = r1 instanceof X.C77373vf
            r4 = 80
            if (r3 == 0) goto L_0x0309
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            goto L_0x06b9
        L_0x035e:
            boolean r3 = r4 instanceof X.C77153vJ
            if (r3 == 0) goto L_0x037a
            X.4zw r0 = (X.C103044zw) r0
            X.1aT r5 = r0.A0C
            long r3 = java.lang.System.currentTimeMillis()
            r5.A02 = r3
            boolean r3 = r1 instanceof X.C77353vd
            r10 = 80
            if (r3 == 0) goto L_0x0823
            java.lang.Object r9 = r1.A00
            X.4RH r9 = (X.AnonymousClass4RH) r9
            com.obwhatsapp.net.tls13.WtCachedPsk r3 = r5.A03
            goto L_0x07ed
        L_0x037a:
            boolean r3 = r4 instanceof X.C77143vI
            if (r3 == 0) goto L_0x0382
            X.4zw r0 = (X.C103044zw) r0
            goto L_0x0837
        L_0x0382:
            boolean r3 = r4 instanceof X.C77133vH
            if (r3 == 0) goto L_0x0393
            X.4zw r0 = (X.C103044zw) r0
            java.lang.String r9 = "finished"
            java.lang.String r7 = "derived_secret"
            java.lang.String r10 = "derived"
            A01(r0)
            goto L_0x08e0
        L_0x0393:
            boolean r3 = r4 instanceof X.C77123vG
            if (r3 == 0) goto L_0x03a3
            X.4zw r0 = (X.C103044zw) r0
            X.1aT r5 = r0.A0C
            long r3 = java.lang.System.currentTimeMillis()
            r5.A02 = r3
            goto L_0x0a12
        L_0x03a3:
            boolean r3 = r4 instanceof X.C77113vF
            if (r3 == 0) goto L_0x03ae
            X.4zw r0 = (X.C103044zw) r0
            A01(r0)
            goto L_0x0a74
        L_0x03ae:
            boolean r3 = r4 instanceof X.C77103vE
            if (r3 == 0) goto L_0x03be
            X.4zw r0 = (X.C103044zw) r0
            boolean r3 = r1 instanceof X.C77313vZ
            if (r3 == 0) goto L_0x0307
            java.lang.Object r3 = r1.A00
            byte[] r3 = (byte[]) r3
            goto L_0x0b15
        L_0x03be:
            boolean r3 = r4 instanceof X.C77093vD
            if (r3 == 0) goto L_0x0b71
            X.4zw r0 = (X.C103044zw) r0
            A01(r0)
            boolean r3 = r1 instanceof X.C77303vY
            if (r3 == 0) goto L_0x0307
            java.lang.Object r3 = r1.A00
            X.4RH r3 = (X.AnonymousClass4RH) r3
            goto L_0x0b55
        L_0x03d1:
            byte[] r3 = X.AnonymousClass4Y0.A00(r3)     // Catch:{ 1aU -> 0x0529 }
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 1aU -> 0x0529 }
            byte r8 = r15.get()     // Catch:{ 1aU -> 0x0529 }
            r4 = 10
            r11 = 1
            if (r8 == r11) goto L_0x0404
            if (r8 == 0) goto L_0x0404
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r9 = X.C13680ns.A0i(r5, r3, r8)     // Catch:{ 1aU -> 0x0529 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r3 = X.C13680ns.A0i(r5, r3, r8)     // Catch:{ 1aU -> 0x0529 }
            X.1aU r10 = X.AnonymousClass3K2.A0S(r3, r4)     // Catch:{ 1aU -> 0x0529 }
            X.3vo r4 = new X.3vo     // Catch:{ 1aU -> 0x0529 }
            r11 = r2
            r7 = r1
            r8 = r16
            r6 = r0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ 1aU -> 0x0529 }
            goto L_0x0481
        L_0x0404:
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r7 = "server_app_traffic_secret"
            byte[] r13 = X.AnonymousClass3K4.A1D(r7, r3)     // Catch:{ 1aU -> 0x0529 }
            X.392 r12 = r0.A09     // Catch:{ 1aU -> 0x0529 }
            r10 = 0
            byte[] r5 = new byte[r10]     // Catch:{ 1aU -> 0x0529 }
            int r3 = r0.A02     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r9 = "traffic upd"
            byte[] r5 = X.C32311g7.A08(r9, r5, r3)     // Catch:{ 1aU -> 0x0529 }
            int r3 = r0.A02     // Catch:{ 1aU -> 0x0529 }
            byte[] r14 = r12.A01(r13, r5, r3)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            r3.put(r7, r14)     // Catch:{ 1aU -> 0x0529 }
            X.392 r12 = r0.A09     // Catch:{ 1aU -> 0x0529 }
            byte[] r7 = new byte[r10]     // Catch:{ 1aU -> 0x0529 }
            r5 = 16
            java.lang.String r3 = "key"
            byte[] r3 = X.C32311g7.A08(r3, r7, r5)     // Catch:{ 1aU -> 0x0529 }
            byte[] r5 = r12.A01(r14, r3, r5)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r13 = "server_app_key"
            r3.put(r13, r5)     // Catch:{ 1aU -> 0x0529 }
            X.392 r12 = r0.A09     // Catch:{ 1aU -> 0x0529 }
            byte[] r7 = new byte[r10]     // Catch:{ 1aU -> 0x0529 }
            r5 = 12
            java.lang.String r3 = "iv"
            byte[] r3 = X.C32311g7.A08(r3, r7, r5)     // Catch:{ 1aU -> 0x0529 }
            byte[] r5 = r12.A01(r14, r3, r5)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r7 = "server_app_iv"
            r3.put(r7, r5)     // Catch:{ 1aU -> 0x0529 }
            int r3 = r0.A03     // Catch:{ 1aU -> 0x0529 }
            int r12 = r3 + 1
            r0.A03 = r12     // Catch:{ 1aU -> 0x0529 }
            X.41Y r5 = X.AnonymousClass41Y.DEBUG     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r3 = "Updated Server App Traffic Keys : Current Gen = "
            java.lang.String r3 = X.C13680ns.A0c(r12, r3)     // Catch:{ 1aU -> 0x0529 }
            X.AnonymousClass4Yd.A00(r5, r3)     // Catch:{ 1aU -> 0x0529 }
            X.4Wo r3 = r0.A0A     // Catch:{ 1aU -> 0x0529 }
            if (r3 == 0) goto L_0x0482
            X.40Z r3 = r3.A00     // Catch:{ 1aU -> 0x0529 }
            int r3 = r3.available()     // Catch:{ 1aU -> 0x0529 }
            if (r3 <= 0) goto L_0x0482
            java.lang.String r8 = "Unexpected Messages: Found pending handshake messages"
            java.lang.String r3 = "Found unprocessed messages in handshake buffer."
            X.1aU r9 = X.AnonymousClass3K2.A0S(r3, r4)     // Catch:{ 1aU -> 0x0529 }
            X.3vo r4 = new X.3vo     // Catch:{ 1aU -> 0x0529 }
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 1aU -> 0x0529 }
        L_0x0481:
            throw r4     // Catch:{ 1aU -> 0x0529 }
        L_0x0482:
            X.16c r3 = r0.A0E     // Catch:{ 1aU -> 0x0529 }
            X.1aW r12 = r3.A00()     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            byte[] r4 = X.AnonymousClass3K4.A1D(r13, r3)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            byte[] r3 = X.AnonymousClass3K4.A1D(r7, r3)     // Catch:{ 1aU -> 0x0529 }
            r12.AI0(r4, r3)     // Catch:{ 1aU -> 0x0529 }
            java.io.InputStream r7 = r0.A0M     // Catch:{ 1aU -> 0x0529 }
            X.40Z r4 = r0.A08     // Catch:{ 1aU -> 0x0529 }
            X.3vr r3 = new X.3vr     // Catch:{ 1aU -> 0x0529 }
            r3.<init>(r12, r4, r7)     // Catch:{ 1aU -> 0x0529 }
            r0.A0A = r3     // Catch:{ 1aU -> 0x0529 }
            if (r8 != r11) goto L_0x0510
            r4 = 24
            byte[] r3 = new byte[r11]     // Catch:{ 1aU -> 0x0529 }
            r3[r10] = r10     // Catch:{ 1aU -> 0x0529 }
            byte[] r8 = X.AnonymousClass4Y0.A01(r3, r4)     // Catch:{ 1aU -> 0x0529 }
            X.4SU r7 = r0.A0B     // Catch:{ 1aU -> 0x0529 }
            r4 = 23
            int r3 = r8.length     // Catch:{ 1aU -> 0x0529 }
            r7.A01(r8, r10, r3, r4)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r8 = "client_app_traffic_secret"
            byte[] r7 = X.AnonymousClass3K4.A1D(r8, r3)     // Catch:{ 1aU -> 0x0529 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0529 }
            byte[] r3 = new byte[r10]     // Catch:{ 1aU -> 0x0529 }
            byte[] r7 = X.C103044zw.A00(r4, r0, r9, r3, r7)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            r3.put(r8, r7)     // Catch:{ 1aU -> 0x0529 }
            X.392 r3 = r0.A09     // Catch:{ 1aU -> 0x0529 }
            byte[] r4 = A02(r3, r7)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r8 = "client_app_key"
            r3.put(r8, r4)     // Catch:{ 1aU -> 0x0529 }
            byte[] r4 = A03(r0, r7)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r7 = "client_app_iv"
            r3.put(r7, r4)     // Catch:{ 1aU -> 0x0529 }
            int r3 = r0.A01     // Catch:{ 1aU -> 0x0529 }
            int r4 = r3 + 1
            r0.A01 = r4     // Catch:{ 1aU -> 0x0529 }
            java.lang.String r3 = "Updated Client App Traffic Keys : Current Gen = "
            java.lang.String r3 = X.C13680ns.A0c(r4, r3)     // Catch:{ 1aU -> 0x0529 }
            X.AnonymousClass4Yd.A00(r5, r3)     // Catch:{ 1aU -> 0x0529 }
            X.16c r3 = r0.A0E     // Catch:{ 1aU -> 0x0529 }
            X.1aW r5 = r3.A00()     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            byte[] r4 = X.AnonymousClass3K4.A1D(r8, r3)     // Catch:{ 1aU -> 0x0529 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0529 }
            byte[] r3 = X.AnonymousClass3K4.A1D(r7, r3)     // Catch:{ 1aU -> 0x0529 }
            r5.AI0(r4, r3)     // Catch:{ 1aU -> 0x0529 }
            java.io.OutputStream r4 = r0.A0N     // Catch:{ 1aU -> 0x0529 }
            X.3vt r3 = new X.3vt     // Catch:{ 1aU -> 0x0529 }
            r3.<init>(r5, r4)     // Catch:{ 1aU -> 0x0529 }
            r0.A0B = r3     // Catch:{ 1aU -> 0x0529 }
        L_0x0510:
            boolean r3 = r15.hasRemaining()     // Catch:{ 1aU -> 0x0529 }
            if (r3 == 0) goto L_0x07bd
            java.lang.String r3 = "Key update message has more than expected bytes."
            X.1aU r9 = X.AnonymousClass3K2.A0S(r3, r6)     // Catch:{ 1aU -> 0x0529 }
            X.3vo r4 = new X.3vo     // Catch:{ 1aU -> 0x0529 }
            r8 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ 1aU -> 0x0529 }
            goto L_0x0481
        L_0x0529:
            r8 = move-exception
            java.lang.String r7 = "Receive key update failed."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0537:
            java.lang.String r3 = "Unexpected event"
            X.1aU r4 = X.AnonymousClass3K2.A0S(r3, r6)
            goto L_0x0830
        L_0x053f:
            byte[] r3 = X.AnonymousClass4Y0.A00(r3)     // Catch:{ 1aU -> 0x0653 }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 1aU -> 0x0653 }
            r8 = 4
            byte[] r10 = new byte[r8]     // Catch:{ 1aU -> 0x0653 }
            r5.get(r10)     // Catch:{ 1aU -> 0x0653 }
            long r6 = X.C32311g7.A02(r10)     // Catch:{ 1aU -> 0x0653 }
            r13 = 0
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x07bd
            byte[] r9 = new byte[r8]     // Catch:{ 1aU -> 0x0653 }
            r5.get(r9)     // Catch:{ 1aU -> 0x0653 }
            int r3 = X.AnonymousClass3K4.A09(r5)     // Catch:{ 1aU -> 0x0653 }
            short r3 = (short) r3     // Catch:{ 1aU -> 0x0653 }
            short r3 = (short) r3     // Catch:{ 1aU -> 0x0653 }
            byte[] r8 = new byte[r3]     // Catch:{ 1aU -> 0x0653 }
            r5.get(r8)     // Catch:{ 1aU -> 0x0653 }
            byte[] r11 = X.AnonymousClass3K2.A1Z(r5)     // Catch:{ 1aU -> 0x0653 }
            byte[] r3 = X.AnonymousClass3K2.A1Z(r5)     // Catch:{ 1aU -> 0x0653 }
            X.4bq r6 = new X.4bq     // Catch:{ 1aU -> 0x0653 }
            r6.<init>(r3)     // Catch:{ 1aU -> 0x0653 }
            r3 = 42
            X.4Qx r3 = r6.A00(r3)     // Catch:{ 1aU -> 0x0653 }
            if (r3 == 0) goto L_0x0582
            byte[] r3 = r3.A01     // Catch:{ 1aU -> 0x0653 }
            long r13 = X.C32311g7.A02(r3)     // Catch:{ 1aU -> 0x0653 }
        L_0x0582:
            X.392 r7 = r0.A09     // Catch:{ 1aU -> 0x0653 }
            java.util.Map r6 = r0.A0U     // Catch:{ 1aU -> 0x0653 }
            java.lang.String r3 = "resumption_master_secret"
            byte[] r6 = X.AnonymousClass3K4.A1D(r3, r6)     // Catch:{ 1aU -> 0x0653 }
            java.lang.String r3 = "resumption"
            byte[] r8 = X.C103044zw.A00(r7, r0, r3, r8, r6)     // Catch:{ 1aU -> 0x0653 }
            java.lang.String r7 = r0.A0Q     // Catch:{ 1aU -> 0x0653 }
            X.1aT r3 = r0.A0C     // Catch:{ 1aU -> 0x0653 }
            java.lang.Byte r3 = r3.A00()     // Catch:{ 1aU -> 0x0653 }
            byte r12 = r3.byteValue()     // Catch:{ 1aU -> 0x0653 }
            com.obwhatsapp.net.tls13.WtCachedPsk r6 = new com.obwhatsapp.net.tls13.WtCachedPsk     // Catch:{ 1aU -> 0x0653 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 1aU -> 0x0653 }
            X.1aT r3 = r0.A0C     // Catch:{ 1aU -> 0x0653 }
            java.util.LinkedHashSet r3 = r3.A07     // Catch:{ 1aU -> 0x0653 }
            r3.add(r6)     // Catch:{ 1aU -> 0x0653 }
            boolean r3 = r5.hasRemaining()     // Catch:{ 1aU -> 0x0653 }
            if (r3 != 0) goto L_0x0640
            X.16f r3 = r0.A0L
            X.1aT r7 = r0.A0C
            monitor-enter(r3)
            byte[] r0 = r7.getId()     // Catch:{ all -> 0x063d }
            X.1aS r6 = new X.1aS     // Catch:{ all -> 0x063d }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x063d }
            java.util.Map r4 = r3.A01     // Catch:{ 1aU -> 0x0626 }
            monitor-enter(r4)     // Catch:{ 1aU -> 0x0626 }
            java.lang.Object r5 = r4.get(r6)     // Catch:{ all -> 0x0623 }
            X.1aT r5 = (X.C29341aT) r5     // Catch:{ all -> 0x0623 }
            if (r5 != 0) goto L_0x05dd
            java.lang.String r2 = r7.getPeerHost()     // Catch:{ all -> 0x0623 }
            int r1 = r7.getPeerPort()     // Catch:{ all -> 0x0623 }
            java.lang.String r0 = r7.getCipherSuite()     // Catch:{ all -> 0x0623 }
            X.1aT r5 = new X.1aT     // Catch:{ all -> 0x0623 }
            r5.<init>(r3, r2, r0, r1)     // Catch:{ all -> 0x0623 }
            r4.put(r6, r5)     // Catch:{ all -> 0x0623 }
        L_0x05dd:
            java.util.Map r2 = r5.A08     // Catch:{ all -> 0x0623 }
            java.lang.Byte r1 = r7.A00()     // Catch:{ all -> 0x0623 }
            java.security.cert.Certificate[] r0 = r7.getPeerCertificates()     // Catch:{ all -> 0x0623 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0623 }
            java.util.LinkedHashSet r0 = r7.A07     // Catch:{ all -> 0x0623 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0623 }
        L_0x05f0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x0602
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0623 }
            com.obwhatsapp.net.tls13.WtCachedPsk r1 = (com.obwhatsapp.net.tls13.WtCachedPsk) r1     // Catch:{ all -> 0x0623 }
            java.util.LinkedHashSet r0 = r5.A07     // Catch:{ all -> 0x0623 }
            r0.add(r1)     // Catch:{ all -> 0x0623 }
            goto L_0x05f0
        L_0x0602:
            X.16e r1 = r3.A00     // Catch:{ all -> 0x0623 }
            if (r1 == 0) goto L_0x0620
            byte[] r0 = r6.A01     // Catch:{ all -> 0x0623 }
            java.lang.String r6 = r5.getPeerHost()     // Catch:{ all -> 0x0623 }
            int r10 = r5.getPeerPort()     // Catch:{ all -> 0x0623 }
            java.lang.String r7 = r5.getCipherSuite()     // Catch:{ all -> 0x0623 }
            java.util.LinkedHashSet r8 = r5.A07     // Catch:{ all -> 0x0623 }
            java.util.Map r9 = r5.A08     // Catch:{ all -> 0x0623 }
            com.obwhatsapp.watls13.WtPersistentSession r5 = new com.obwhatsapp.watls13.WtPersistentSession     // Catch:{ all -> 0x0623 }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0623 }
            r1.A02(r5, r0)     // Catch:{ all -> 0x0623 }
        L_0x0620:
            monitor-exit(r4)     // Catch:{ all -> 0x0623 }
            goto L_0x07bc
        L_0x0623:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0623 }
            throw r0     // Catch:{ 1aU -> 0x0626 }
        L_0x0626:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x063d }
            java.lang.String r0 = "Encountered Exception "
            r1.append(r0)     // Catch:{ all -> 0x063d }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x063d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x063d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x063d }
            goto L_0x07bc
        L_0x063d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0640:
            java.lang.String r7 = "New session ticket has excess bytes than expected"
            java.lang.String r3 = "New session ticket has more bytes than expected."
            X.1aU r8 = X.AnonymousClass3K2.A0S(r3, r4)     // Catch:{ 1aU -> 0x0653 }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x0653 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x0653 }
            throw r3     // Catch:{ 1aU -> 0x0653 }
        L_0x0653:
            r8 = move-exception
            java.lang.String r7 = "Failed to process new session ticket"
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0661:
            A01(r0)     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r3 = r1
            X.3vg r3 = (X.C77383vg) r3     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            java.lang.Object r6 = r3.A00     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            byte[] r6 = (byte[]) r6     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            byte[] r4 = X.AnonymousClass4Y0.A00(r6)     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r3 = 1
            X.AnonymousClass475.A00(r0, r4, r3)     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r0.A0c = r3     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r3 = 0
            r0.A0f = r3     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            byte[] r5 = r3.A02()     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            X.4Vn r4 = r0.A0D     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            java.security.MessageDigest r3 = r4.A00     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r3.reset()     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r3 = 0
            r4.A01 = r3     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            X.4Vn r4 = r0.A0D     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r3 = -2
            byte[] r3 = X.AnonymousClass4Y0.A01(r5, r3)     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r4.A00(r3)     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            r3.A00(r6)     // Catch:{ 1aU -> 0x06a6, RuntimeException -> 0x0698 }
            return
        L_0x0698:
            r8 = move-exception
            java.lang.String r7 = "Hello retry parse error."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x06a6:
            r4 = move-exception
            javax.net.ssl.SSLException r3 = r4.ex
            java.lang.String r7 = r3.getMessage()
            X.3vo r3 = new X.3vo
            r8 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x06b9:
            byte[] r3 = X.AnonymousClass4Y0.A00(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r6 = 2
            byte[] r3 = X.AnonymousClass3K2.A1Z(r14)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            X.4bq r5 = new X.4bq     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r5.<init>(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r3 = 16
            X.4Qx r8 = r5.A00(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r8 == 0) goto L_0x071d
            java.lang.String r3 = r0.A0O     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r3 == 0) goto L_0x071d
            boolean r3 = r3.isEmpty()     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r3 != 0) goto L_0x071d
            byte[] r3 = r8.A01     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            byte[] r3 = new byte[r6]     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r13.get(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            int r12 = X.C32311g7.A01(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r11 = 0
            java.util.HashSet r10 = X.C13680ns.A0o()     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
        L_0x06f1:
            if (r11 >= r12) goto L_0x078a
            byte r9 = r13.get()     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            byte[] r7 = new byte[r9]     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r13.get(r7)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.lang.String r6 = "UTF-8"
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x070a }
            r3.<init>(r7, r6)     // Catch:{ UnsupportedEncodingException -> 0x070a }
            r10.add(r3)     // Catch:{ UnsupportedEncodingException -> 0x070a }
            int r3 = r9 + 1
            int r11 = r11 + r3
            goto L_0x06f1
        L_0x070a:
            r3 = move-exception
            java.lang.String r10 = "Server protocol is not encoded using UTF-8"
            X.1aU r11 = X.AnonymousClass3K2.A0T(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            X.3vo r6 = new X.3vo     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            goto L_0x07bb
        L_0x071d:
            r3 = 42
            X.4Qx r3 = r5.A00(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r3 == 0) goto L_0x0732
            boolean r3 = r0.A0Z     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r3 == 0) goto L_0x0775
            X.1aT r3 = r0.A0C     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            com.obwhatsapp.net.tls13.WtCachedPsk r3 = r3.A03     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r3 == 0) goto L_0x0732
            r3 = 1
            r0.A0f = r3     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
        L_0x0732:
            java.util.Set r6 = X.AnonymousClass4ZF.A02     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.util.Map r3 = r5.A03     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.util.Set r5 = r3.keySet()     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r3.<init>(r5)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r3.removeAll(r6)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            int r3 = r3.size()     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r3 == 0) goto L_0x075c
            java.lang.String r5 = "Unexpected extension provided by the server"
            r3 = 47
            X.1aU r11 = X.AnonymousClass3K2.A0S(r5, r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            X.3vo r6 = new X.3vo     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r10 = r5
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            goto L_0x07bb
        L_0x075c:
            boolean r3 = r14.hasRemaining()     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r3 == 0) goto L_0x07bd
            java.lang.String r10 = "Encrypted extensions has excess bytes than expected"
            java.lang.String r3 = "Encrypted extensions has more bytes than expected."
            X.1aU r11 = X.AnonymousClass3K2.A0S(r3, r4)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            X.3vo r6 = new X.3vo     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            goto L_0x07bb
        L_0x0775:
            java.lang.String r10 = "Received server early data indication without sending early data."
            r5 = 10
            java.lang.String r3 = "Should not have received early data indication without sending early data."
            X.1aU r11 = X.AnonymousClass3K2.A0S(r3, r5)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            X.3vo r6 = new X.3vo     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            goto L_0x07bb
        L_0x078a:
            java.lang.String r3 = r0.A0O     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            boolean r3 = r10.contains(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            if (r3 != 0) goto L_0x071d
            java.lang.String r10 = "Server sent unsupported protocol version."
            r6 = 110(0x6e, float:1.54E-43)
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.lang.String r3 = "Server selected wrong supported version "
            r5.append(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            X.AnonymousClass000.A1I(r8, r5)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.lang.String r3 = " expected: "
            r5.append(r3)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.lang.String r3 = r0.A0O     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            java.lang.String r3 = X.AnonymousClass000.A0h(r3, r5)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            X.1aU r11 = X.AnonymousClass3K2.A0S(r3, r6)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            X.3vo r6 = new X.3vo     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
            r12 = r2
            r8 = r1
            r9 = r16
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
        L_0x07bb:
            throw r6     // Catch:{ 1aU -> 0x07df, RuntimeException -> 0x07be }
        L_0x07bc:
            monitor-exit(r3)
        L_0x07bd:
            return
        L_0x07be:
            r3 = move-exception
            java.lang.String r6 = r3.getMessage()
            java.lang.Throwable r3 = X.AnonymousClass3K3.A0r(r3)
            javax.net.ssl.SSLException r5 = new javax.net.ssl.SSLException
            r5.<init>(r6, r3)
            X.1aU r3 = new X.1aU
            r3.<init>(r5, r4)
            java.lang.String r8 = "Failed to parse encrypted extensions"
            X.3vo r4 = new X.3vo
            r9 = r3
            r10 = r2
            r6 = r1
            r7 = r16
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            throw r4
        L_0x07df:
            r8 = move-exception
            java.lang.String r7 = "Failed to process encrypted extensions"
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x07ed:
            int r8 = r9.A00     // Catch:{ 1aU -> 0x0815 }
            long r6 = (long) r8     // Catch:{ 1aU -> 0x0815 }
            long r4 = r3.maxEarlyDataSize     // Catch:{ 1aU -> 0x0815 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0802
            X.4SU r6 = r0.A0B     // Catch:{ 1aU -> 0x0815 }
            r5 = 23
            byte[] r4 = r9.A02     // Catch:{ 1aU -> 0x0815 }
            int r3 = r9.A01     // Catch:{ 1aU -> 0x0815 }
            r6.A01(r4, r3, r8, r5)     // Catch:{ 1aU -> 0x0815 }
            return
        L_0x0802:
            java.lang.String r7 = "Data size exceeds early data"
            java.lang.String r3 = "Data to be written more than early data size"
            X.1aU r8 = X.AnonymousClass3K2.A0S(r3, r10)     // Catch:{ 1aU -> 0x0815 }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x0815 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x0815 }
            throw r3     // Catch:{ 1aU -> 0x0815 }
        L_0x0815:
            r8 = move-exception
            java.lang.String r7 = "App write for early data failed."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0823:
            java.lang.String r3 = "Unexpected event"
            X.1aU r4 = X.AnonymousClass3K2.A0S(r3, r10)
            goto L_0x0830
        L_0x082a:
            java.lang.String r3 = "Unexpected event"
            X.1aU r4 = X.AnonymousClass3K2.A0S(r3, r8)
        L_0x0830:
            r3 = r16
            X.3vo r0 = A00(r0, r1, r3, r4, r2)
            throw r0
        L_0x0837:
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x08d2 }
            byte[] r6 = r3.A01()     // Catch:{ 1aU -> 0x08d2 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x08d2 }
            java.lang.String r3 = "master_secret"
            byte[] r5 = X.AnonymousClass3K4.A1D(r3, r4)     // Catch:{ 1aU -> 0x08d2 }
            if (r5 == 0) goto L_0x0899
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x08d2 }
            java.lang.String r3 = "res master"
            byte[] r5 = X.C103044zw.A00(r4, r0, r3, r6, r5)     // Catch:{ 1aU -> 0x08d2 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x08d2 }
            java.lang.String r3 = "resumption_master_secret"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x08d2 }
            X.16c r3 = r0.A0E     // Catch:{ 1aU -> 0x08d2 }
            X.1aW r6 = r3.A00()     // Catch:{ 1aU -> 0x08d2 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x08d2 }
            java.lang.String r3 = "client_app_key"
            byte[] r5 = X.AnonymousClass3K4.A1D(r3, r4)     // Catch:{ 1aU -> 0x08d2 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x08d2 }
            java.lang.String r3 = "client_app_iv"
            byte[] r3 = X.AnonymousClass3K4.A1D(r3, r4)     // Catch:{ 1aU -> 0x08d2 }
            r6.AI0(r5, r3)     // Catch:{ 1aU -> 0x08d2 }
            java.io.OutputStream r4 = r0.A0N     // Catch:{ 1aU -> 0x08d2 }
            X.3vt r3 = new X.3vt     // Catch:{ 1aU -> 0x08d2 }
            r3.<init>(r6, r4)     // Catch:{ 1aU -> 0x08d2 }
            r0.A0B = r3     // Catch:{ 1aU -> 0x08d2 }
            X.4Wo r3 = r0.A0A     // Catch:{ 1aU -> 0x08d2 }
            if (r3 == 0) goto L_0x08ad
            X.40Z r3 = r3.A00     // Catch:{ 1aU -> 0x08d2 }
            int r3 = r3.available()     // Catch:{ 1aU -> 0x08d2 }
            if (r3 <= 0) goto L_0x08ad
            java.lang.String r7 = "Unexpected Messages: Found pending handshake messages"
            r4 = 10
            java.lang.String r3 = "Found unprocessed messages in handshake buffer."
            X.1aU r8 = X.AnonymousClass3K2.A0S(r3, r4)     // Catch:{ 1aU -> 0x08d2 }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x08d2 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x08d2 }
        L_0x0898:
            throw r3     // Catch:{ 1aU -> 0x08d2 }
        L_0x0899:
            java.lang.String r4 = "Master Secret is null"
            r3 = 80
            X.1aU r8 = X.AnonymousClass3K2.A0S(r4, r3)     // Catch:{ 1aU -> 0x08d2 }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x08d2 }
            r7 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x08d2 }
            goto L_0x0898
        L_0x08ad:
            X.16c r3 = r0.A0E     // Catch:{ 1aU -> 0x08d2 }
            X.1aW r6 = r3.A00()     // Catch:{ 1aU -> 0x08d2 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x08d2 }
            java.lang.String r3 = "server_app_key"
            byte[] r5 = X.AnonymousClass3K4.A1D(r3, r4)     // Catch:{ 1aU -> 0x08d2 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x08d2 }
            java.lang.String r3 = "server_app_iv"
            byte[] r3 = X.AnonymousClass3K4.A1D(r3, r4)     // Catch:{ 1aU -> 0x08d2 }
            r6.AI0(r5, r3)     // Catch:{ 1aU -> 0x08d2 }
            java.io.InputStream r5 = r0.A0M     // Catch:{ 1aU -> 0x08d2 }
            X.40Z r4 = r0.A08     // Catch:{ 1aU -> 0x08d2 }
            X.3vr r3 = new X.3vr     // Catch:{ 1aU -> 0x08d2 }
            r3.<init>(r6, r4, r5)     // Catch:{ 1aU -> 0x08d2 }
            r0.A0A = r3     // Catch:{ 1aU -> 0x08d2 }
            return
        L_0x08d2:
            r8 = move-exception
            java.lang.String r7 = "Failed to derive resumption keys"
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x08e0:
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r6 = r3.A01()     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.4RK r3 = r0.A0G     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r5 = r0.A0m     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r4 = r0.A0h     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.1nb r3 = r3.A00     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r5 = r3.A02(r5, r4)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            int r11 = r0.A02     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r8 = new byte[r11]     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.1aT r3 = r0.A0C     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            com.obwhatsapp.net.tls13.WtCachedPsk r4 = r3.A03     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            if (r4 == 0) goto L_0x0902
            boolean r3 = r0.A0g     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            if (r3 == 0) goto L_0x0902
            byte[] r8 = r4.pskVal     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
        L_0x0902:
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r3 = new byte[r11]     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r8 = r4.A00(r3, r8)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "early_secret"
            r4.put(r3, r8)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = r0.A0P     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r3)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r3 = r11.digest()     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r4 = X.C103044zw.A00(r4, r0, r10, r3, r8)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            r3.put(r7, r4)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r3 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r8 = r3.A00(r4, r5)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "handshake_secret"
            r4.put(r3, r8)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "c hs traffic"
            byte[] r5 = X.C103044zw.A00(r4, r0, r3, r6, r8)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "client_hs_traffic_secret"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "s hs traffic"
            byte[] r6 = X.C103044zw.A00(r4, r0, r3, r6, r8)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "server_hs_traffic_secret"
            r4.put(r3, r6)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r3 = r11.digest()     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r4 = X.C103044zw.A00(r4, r0, r10, r3, r8)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r3 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            r3.put(r7, r4)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r3 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            r10 = 0
            byte[] r7 = A02(r3, r5)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "client_hs_key"
            r4.put(r3, r7)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r7 = A03(r0, r5)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "client_hs_iv"
            r4.put(r3, r7)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r3 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r8 = A02(r3, r6)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "server_hs_key"
            r4.put(r3, r8)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r7 = A03(r0, r6)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "server_hs_iv"
            r4.put(r3, r7)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r3 = new byte[r10]     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r5 = X.C103044zw.A00(r4, r0, r9, r3, r5)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "client_finished"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r3 = new byte[r10]     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            byte[] r5 = X.C103044zw.A00(r4, r0, r9, r3, r6)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            java.lang.String r3 = "server_finished"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.16c r3 = r0.A0E     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.1aW r6 = r3.A00()     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            r6.AI0(r8, r7)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.4Wo r3 = r0.A0A     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            if (r3 == 0) goto L_0x09d9
            X.40Z r3 = r3.A00     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            int r3 = r3.available()     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            if (r3 <= 0) goto L_0x09d9
            java.lang.String r7 = "Unexpected Messages: Found pending handshake messages"
            r4 = 10
            java.lang.String r3 = "Found unprocessed messages in handshake buffer."
            X.1aU r8 = X.AnonymousClass3K2.A0S(r3, r4)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            throw r3     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
        L_0x09d9:
            java.io.InputStream r5 = r0.A0M     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.40Z r4 = r0.A08     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            X.3vr r3 = new X.3vr     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            r3.<init>(r6, r4, r5)     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            r0.A0A = r3     // Catch:{ 1aU -> 0x0a04, NoSuchAlgorithmException -> 0x09e5 }
            return
        L_0x09e5:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()
            java.lang.String r3 = r0.A0P
            r4.append(r3)
            java.lang.String r3 = " algorithm not found"
            java.lang.String r7 = X.AnonymousClass000.A0h(r3, r4)
            X.1aU r8 = X.AnonymousClass3K2.A0T(r5)
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0a04:
            r8 = move-exception
            java.lang.String r7 = "Failed in action handshake traffic keys"
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0a12:
            com.obwhatsapp.net.tls13.WtCachedPsk r3 = r5.A03     // Catch:{ 1aU -> 0x0a66 }
            byte[] r5 = r3.pskVal     // Catch:{ 1aU -> 0x0a66 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a66 }
            int r3 = r0.A02     // Catch:{ 1aU -> 0x0a66 }
            byte[] r3 = new byte[r3]     // Catch:{ 1aU -> 0x0a66 }
            byte[] r6 = r4.A00(r3, r5)     // Catch:{ 1aU -> 0x0a66 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a66 }
            java.lang.String r3 = "early_secret"
            r4.put(r3, r6)     // Catch:{ 1aU -> 0x0a66 }
            X.392 r5 = r0.A09     // Catch:{ 1aU -> 0x0a66 }
            java.lang.String r4 = "c e traffic"
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x0a66 }
            byte[] r3 = r3.A01()     // Catch:{ 1aU -> 0x0a66 }
            byte[] r8 = X.C103044zw.A00(r5, r0, r4, r3, r6)     // Catch:{ 1aU -> 0x0a66 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0a66 }
            java.lang.String r3 = "client_early_traffic_secret"
            r4.put(r3, r8)     // Catch:{ 1aU -> 0x0a66 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0a66 }
            r3 = 0
            byte[] r7 = A02(r4, r8)     // Catch:{ 1aU -> 0x0a66 }
            X.392 r6 = r0.A09     // Catch:{ 1aU -> 0x0a66 }
            java.lang.String r5 = "iv"
            byte[] r3 = new byte[r3]     // Catch:{ 1aU -> 0x0a66 }
            r4 = 12
            byte[] r3 = X.C32311g7.A08(r5, r3, r4)     // Catch:{ 1aU -> 0x0a66 }
            byte[] r4 = r6.A01(r8, r3, r4)     // Catch:{ 1aU -> 0x0a66 }
            X.16c r3 = r0.A0E     // Catch:{ 1aU -> 0x0a66 }
            X.1aW r5 = r3.A00()     // Catch:{ 1aU -> 0x0a66 }
            r5.AI0(r7, r4)     // Catch:{ 1aU -> 0x0a66 }
            java.io.OutputStream r4 = r0.A0N     // Catch:{ 1aU -> 0x0a66 }
            X.3vt r3 = new X.3vt     // Catch:{ 1aU -> 0x0a66 }
            r3.<init>(r5, r4)     // Catch:{ 1aU -> 0x0a66 }
            r0.A0B = r3     // Catch:{ 1aU -> 0x0a66 }
            return
        L_0x0a66:
            r8 = move-exception
            java.lang.String r7 = "Failed in action early data keys"
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0a74:
            X.4Vn r3 = r0.A0D     // Catch:{ 1aU -> 0x0b07 }
            byte[] r7 = r3.A01()     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "derived_secret"
            byte[] r5 = X.AnonymousClass3K4.A1D(r3, r4)     // Catch:{ 1aU -> 0x0b07 }
            if (r5 == 0) goto L_0x0af3
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0b07 }
            int r3 = r0.A02     // Catch:{ 1aU -> 0x0b07 }
            byte[] r3 = new byte[r3]     // Catch:{ 1aU -> 0x0b07 }
            byte[] r6 = r4.A00(r5, r3)     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "master_secret"
            r4.put(r3, r6)     // Catch:{ 1aU -> 0x0b07 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "c ap traffic"
            byte[] r8 = X.C103044zw.A00(r4, r0, r3, r7, r6)     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "client_app_traffic_secret"
            r4.put(r3, r8)     // Catch:{ 1aU -> 0x0b07 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0b07 }
            byte[] r5 = A02(r4, r8)     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "client_app_key"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x0b07 }
            byte[] r5 = A03(r0, r8)     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "client_app_iv"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x0b07 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "s ap traffic"
            byte[] r8 = X.C103044zw.A00(r4, r0, r3, r7, r6)     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "server_app_traffic_secret"
            r4.put(r3, r8)     // Catch:{ 1aU -> 0x0b07 }
            X.392 r3 = r0.A09     // Catch:{ 1aU -> 0x0b07 }
            byte[] r5 = A02(r3, r8)     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "server_app_key"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x0b07 }
            byte[] r5 = A03(r0, r8)     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "server_app_iv"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x0b07 }
            X.392 r4 = r0.A09     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "exp master"
            byte[] r5 = X.C103044zw.A00(r4, r0, r3, r7, r6)     // Catch:{ 1aU -> 0x0b07 }
            java.util.Map r4 = r0.A0U     // Catch:{ 1aU -> 0x0b07 }
            java.lang.String r3 = "exporter_master_secret"
            r4.put(r3, r5)     // Catch:{ 1aU -> 0x0b07 }
            return
        L_0x0af3:
            java.lang.String r4 = "Derived secret not found."
            r3 = 80
            X.1aU r8 = X.AnonymousClass3K2.A0S(r4, r3)     // Catch:{ 1aU -> 0x0b07 }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x0b07 }
            r7 = r4
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x0b07 }
            throw r3     // Catch:{ 1aU -> 0x0b07 }
        L_0x0b07:
            r8 = move-exception
            java.lang.String r7 = "Failed to derive app traffic keys"
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0b15:
            byte[] r3 = X.AnonymousClass4Y0.A00(r3)     // Catch:{ 1aU -> 0x0b47 }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ 1aU -> 0x0b47 }
            int r3 = X.AnonymousClass3K4.A09(r4)     // Catch:{ 1aU -> 0x0b47 }
            short r3 = (short) r3     // Catch:{ 1aU -> 0x0b47 }
            short r3 = (short) r3     // Catch:{ 1aU -> 0x0b47 }
            if (r3 != 0) goto L_0x0b32
            byte[] r4 = X.AnonymousClass3K2.A1Z(r4)     // Catch:{ 1aU -> 0x0b47 }
            X.4bq r3 = new X.4bq     // Catch:{ 1aU -> 0x0b47 }
            r3.<init>(r4)     // Catch:{ 1aU -> 0x0b47 }
            r1 = 1
            r0.A0X = r1
            return
        L_0x0b32:
            java.lang.String r7 = "Certificate context is not expected"
            r4 = 10
            java.lang.String r3 = "Certificate context is not expected."
            X.1aU r8 = X.AnonymousClass3K2.A0S(r3, r4)     // Catch:{ 1aU -> 0x0b47 }
            X.3vo r3 = new X.3vo     // Catch:{ 1aU -> 0x0b47 }
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ 1aU -> 0x0b47 }
            throw r3     // Catch:{ 1aU -> 0x0b47 }
        L_0x0b47:
            r8 = move-exception
            java.lang.String r7 = "Failed to process certificate request "
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0b55:
            X.4SU r7 = r0.A0B     // Catch:{ 1aU -> 0x0b63 }
            r6 = 23
            byte[] r5 = r3.A02     // Catch:{ 1aU -> 0x0b63 }
            int r4 = r3.A01     // Catch:{ 1aU -> 0x0b63 }
            int r3 = r3.A00     // Catch:{ 1aU -> 0x0b63 }
            r7.A01(r5, r4, r3, r6)     // Catch:{ 1aU -> 0x0b63 }
            return
        L_0x0b63:
            r8 = move-exception
            java.lang.String r7 = "App write failed."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0b71:
            boolean r3 = r4 instanceof X.C77083vC
            X.4zw r0 = (X.C103044zw) r0
            if (r3 == 0) goto L_0x0bbd
            A01(r0)
            boolean r3 = r1 instanceof X.C77293vX
            if (r3 == 0) goto L_0x0bae
            java.lang.Object r6 = r1.A00
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L_0x0b9a
            X.5Q1 r5 = r0.A07     // Catch:{ IOException -> 0x0b8c }
            r4 = 0
            int r3 = r6.length     // Catch:{ IOException -> 0x0b8c }
            r5.A4z(r6, r4, r3)     // Catch:{ IOException -> 0x0b8c }
            return
        L_0x0b8c:
            r8 = move-exception
            java.lang.String r7 = "App read failed."
            X.3vo r3 = new X.3vo
            r9 = r2
            r5 = r1
            r6 = r16
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            throw r3
        L_0x0b9a:
            java.lang.String r4 = "App read failed."
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException
            r3.<init>(r4)
            X.3vo r5 = new X.3vo
            r9 = r4
            r10 = r3
            r11 = r2
            r7 = r1
            r8 = r16
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            throw r5
        L_0x0bae:
            r4 = 80
            java.lang.String r3 = "Unexpected event"
            X.1aU r4 = X.AnonymousClass3K2.A0S(r3, r4)
            r3 = r16
            X.3vo r5 = A00(r0, r1, r3, r4, r2)
            throw r5
        L_0x0bbd:
            A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PX.A04(X.5Mt, X.4Eg, X.4NO, int):void");
    }
}
