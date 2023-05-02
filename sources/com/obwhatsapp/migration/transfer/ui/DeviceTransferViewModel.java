package com.obwhatsapp.migration.transfer.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass027;
import X.AnonymousClass4PB;
import X.AnonymousClass4ZP;
import X.C003401n;
import X.C103034zv;
import X.C108915Pz;
import X.C13680ns;
import X.C13690nt;
import X.C16320sq;
import X.C16980tz;
import X.C17320ut;
import X.C26591Oj;
import X.C26611Ol;
import X.C26871Po;
import X.C30801cy;
import X.C34901l3;
import X.C85224Np;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.redex.IDxActionShape258S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.migration.transfer.service.DonorDeviceTransferService;
import com.obwhatsapp.migration.transfer.service.ReceiverDeviceTransferService;

public class DeviceTransferViewModel extends C003401n {
    public int A00;
    public boolean A01;
    public final AnonymousClass027 A02 = C30801cy.A01();
    public final AnonymousClass027 A03 = C30801cy.A01();
    public final AnonymousClass027 A04 = C13690nt.A0O();
    public final AnonymousClass027 A05 = C13690nt.A0O();
    public final AnonymousClass027 A06 = C30801cy.A01();
    public final AnonymousClass027 A07 = C13690nt.A0O();
    public final C16980tz A08;
    public final C26871Po A09;
    public final C17320ut A0A;
    public final C26591Oj A0B;
    public final AnonymousClass4ZP A0C;
    public final C26611Ol A0D;
    public final C16320sq A0E;

    public DeviceTransferViewModel(C16980tz r2, C26871Po r3, C17320ut r4, C26591Oj r5, AnonymousClass4ZP r6, C26611Ol r7, C16320sq r8) {
        this.A08 = r2;
        this.A0E = r8;
        this.A0D = r7;
        this.A0B = r5;
        this.A09 = r3;
        this.A0A = r4;
        this.A0C = r6;
    }

    public C85224Np A05() {
        return new C85224Np(new IDxActionShape258S0100000_2_I1(this, 4), (C108915Pz) null, R.string.str09fa, R.string.str1c84, R.string.str0e87, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0228 A[SYNTHETIC, Splitter:B:73:0x0228] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4PB A06(java.lang.Integer r23) {
        /*
            r22 = this;
            X.4PB r7 = new X.4PB
            r7.<init>()
            r19 = 2131893339(0x7f121c5b, float:1.9421452E38)
            r18 = 2131893335(0x7f121c57, float:1.9421444E38)
            r20 = 2131893334(0x7f121c56, float:1.9421442E38)
            r21 = 2131886996(0x7f120394, float:1.9408587E38)
            r14 = 5
            r6 = r22
            com.facebook.redex.IDxActionShape258S0100000_2_I1 r0 = new com.facebook.redex.IDxActionShape258S0100000_2_I1
            r0.<init>(r6, r14)
            r5 = 0
            X.4Np r4 = new X.4Np
            r15 = r4
            r16 = r0
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)
            int r1 = r23.intValue()
            if (r1 == 0) goto L_0x02d6
            r11 = 1
            r10 = 0
            r9 = 8
            if (r1 == r11) goto L_0x00cc
            r0 = 2
            if (r1 == r0) goto L_0x00a3
            r0 = 3
            if (r1 == r0) goto L_0x0071
            r0 = 4
            if (r1 != r0) goto L_0x02d5
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0063
            r0 = 2131893365(0x7f121c75, float:1.9421504E38)
            r7.A0A = r0
            r0 = 2131893364(0x7f121c74, float:1.9421502E38)
            r7.A09 = r0
            r0 = 2131887916(0x7f12072c, float:1.9410453E38)
        L_0x004a:
            r7.A02 = r0
            r7.A08 = r9
            r0 = 2131232644(0x7f080784, float:1.8081403E38)
            r7.A00 = r0
            com.facebook.redex.IDxActionShape387S0100000_2_I1 r0 = new com.facebook.redex.IDxActionShape387S0100000_2_I1
            r0.<init>(r6, r11)
            r7.A0D = r0
            r1 = 2
            com.facebook.redex.IDxActionShape387S0100000_2_I1 r0 = new com.facebook.redex.IDxActionShape387S0100000_2_I1
            r0.<init>(r6, r1)
            r7.A0C = r0
            return r7
        L_0x0063:
            r0 = 2131888623(0x7f1209ef, float:1.9411887E38)
            r7.A0A = r0
            r0 = 2131893614(0x7f121d6e, float:1.942201E38)
            r7.A09 = r0
            r0 = 2131889632(0x7f120de0, float:1.9413933E38)
            goto L_0x004a
        L_0x0071:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x009a
            r0 = 2131893373(0x7f121c7d, float:1.942152E38)
            r7.A0A = r0
            r0 = 2131893368(0x7f121c78, float:1.942151E38)
        L_0x007d:
            r7.A04 = r0
            r0 = 2131893342(0x7f121c5e, float:1.9421458E38)
            r7.A09 = r0
            r7.A06 = r10
            r7.A05 = r10
            r7.A03 = r9
            r1 = 7
            com.facebook.redex.IDxActionShape62S0200000_2_I1 r0 = new com.facebook.redex.IDxActionShape62S0200000_2_I1
            r0.<init>(r4, r6, r1)
            r7.A0E = r0
            com.facebook.redex.IDxActionShape62S0200000_2_I1 r0 = new com.facebook.redex.IDxActionShape62S0200000_2_I1
            r0.<init>(r4, r6, r10)
            r7.A0C = r0
            return r7
        L_0x009a:
            r0 = 2131888619(0x7f1209eb, float:1.9411878E38)
            r7.A0A = r0
            r0 = 2131893620(0x7f121d74, float:1.9422022E38)
            goto L_0x007d
        L_0x00a3:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x00c6
            r0 = 2131893373(0x7f121c7d, float:1.942152E38)
            r7.A0A = r0
            r0 = 2131893372(0x7f121c7c, float:1.9421519E38)
            r7.A09 = r0
            r0 = 2131893371(0x7f121c7b, float:1.9421517E38)
            r7.A04 = r0
            r7.A06 = r10
            r7.A05 = r10
            r7.A03 = r9
            com.facebook.redex.IDxActionShape62S0200000_2_I1 r0 = new com.facebook.redex.IDxActionShape62S0200000_2_I1
            r0.<init>(r4, r6, r11)
            r7.A0E = r0
            r1 = 3
            goto L_0x02f5
        L_0x00c6:
            java.lang.String r0 = "fpm/DeviceTransferViewModel/Receiver should not be in pairing state"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x00cc:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x00d8
            X.027 r1 = r6.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            return r7
        L_0x00d8:
            r0 = 2131893618(0x7f121d72, float:1.9422018E38)
            r7.A09 = r0
            r7.A01 = r9
            r0 = 2131893352(0x7f121c68, float:1.9421478E38)
            r7.A0A = r0
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x019c }
            r0 = 1024(0x400, float:1.435E-42)
            r1.initialize(r0)     // Catch:{ NoSuchAlgorithmException -> 0x019c }
            java.security.KeyPair r0 = r1.generateKeyPair()     // Catch:{ NoSuchAlgorithmException -> 0x019c }
            if (r0 == 0) goto L_0x01a2
            java.security.PrivateKey r8 = r0.getPrivate()
            java.security.PublicKey r1 = r0.getPublic()
            X.1fY r0 = X.AnonymousClass4ZP.A01
            X.5II r3 = new X.5II
            r3.<init>((X.C32041fY) r0)
            byte[] r0 = r1.getEncoded()     // Catch:{ IOException -> 0x01a9 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x01a9 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01a9 }
            X.1hn r0 = new X.1hn     // Catch:{ IOException -> 0x01a9 }
            r0.<init>((java.io.InputStream) r1)     // Catch:{ IOException -> 0x01a9 }
            X.1fZ r0 = r0.A05()     // Catch:{ IOException -> 0x01a9 }
            X.5Hx r2 = X.C107365Hx.A00(r0)     // Catch:{ IOException -> 0x01a9 }
            X.5IQ r17 = new X.5IQ
            r17.<init>()
            X.5IQ r16 = new X.5IQ
            r16.<init>()
            r0 = 2
            X.1hq r12 = new X.1hq
            r12.<init>((long) r0)
            X.5Ix r13 = new X.5Ix
            r13.<init>(r12, r10, r11)
            long r0 = java.lang.System.currentTimeMillis()
            X.1hq r12 = new X.1hq
            r12.<init>((long) r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Date r15 = new java.util.Date
            r15.<init>(r0)
            X.5IO r1 = new X.5IO
            r1.<init>((java.util.Date) r15)
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            r0 = 6
            r15.add(r0, r11)
            java.util.Date r0 = r15.getTime()
            X.5IO r15 = new X.5IO
            r15.<init>((java.util.Date) r0)
            if (r2 == 0) goto L_0x0195
            r0 = 10
            X.1gH r11 = new X.1gH
            r11.<init>(r0)
            r11.A02(r13)
            r11.A02(r12)
            r11.A02(r3)
            r0 = r17
            r11.A02(r0)
            r0 = 2
            X.1gH r12 = new X.1gH
            r12.<init>(r0)
            r12.A02(r1)
            r12.A02(r15)
            X.1gI r0 = new X.1gI
            r0.<init>((X.C32391gH) r12)
            r11.A02(r0)
            r0 = r16
            r11.A02(r0)
            r11.A02(r2)
            X.1gI r0 = new X.1gI
            r0.<init>((X.C32391gH) r11)
            X.5I3 r13 = X.AnonymousClass5I3.A00(r0)
            goto L_0x01af
        L_0x0195:
            java.lang.String r0 = "not all mandatory fields set in V3 TBScertificate generator"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x019c:
            r1 = move-exception
            java.lang.String r0 = "fpm/SelfSignedCertificateFactory/generate-keys/no such algorithm found RSA"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01a2:
            java.lang.String r0 = "fpm/SelfSignedCertificateFactory/generate-self-signed-certificate/key pair was not generated"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2 = 0
            goto L_0x01bb
        L_0x01a9:
            java.lang.String r0 = "fpm/SelfSignedCertificateFactory/generate-unsigned-certificate-properties/failed to read public key info with ASN input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r13 = 0
        L_0x01af:
            r2 = 0
            if (r13 != 0) goto L_0x01ca
            java.lang.String r0 = "fpm/SelfSignedCertificateFactory/generate-self-signed-certificate/failed to create unsigned certificate"
        L_0x01b4:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01b7:
            android.util.Pair r2 = X.C13690nt.A0I(r2, r8)
        L_0x01bb:
            r0 = 32
            byte[] r1 = X.C004101u.A0E(r0)
            r0 = 10
            java.lang.String r12 = android.util.Base64.encodeToString(r1, r0)
            if (r2 == 0) goto L_0x02cc
            goto L_0x0228
        L_0x01ca:
            java.lang.String r12 = "DER"
            X.1fY r0 = r3.A01     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x021b }
            java.lang.String r0 = r0.A01     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x021b }
            java.security.Signature r1 = java.security.Signature.getInstance(r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x021b }
            r1.initSign(r8)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x021b }
            X.1fZ r0 = r13.Agm()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x021b }
            byte[] r0 = r0.A02(r12)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x021b }
            r1.update(r0)     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x021b }
            byte[] r11 = r1.sign()     // Catch:{ IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException -> 0x021b }
            X.1gH r1 = new X.1gH
            r1.<init>()
            r1.A02(r13)
            r1.A02(r3)
            X.5HY r0 = new X.5HY
            r0.<init>(r11)
            r1.A02(r0)
            X.1gI r0 = new X.1gI     // Catch:{ IOException -> 0x021f }
            r0.<init>((X.C32391gH) r1)     // Catch:{ IOException -> 0x021f }
            byte[] r3 = r0.A02(r12)     // Catch:{ IOException -> 0x021f }
            if (r3 == 0) goto L_0x0225
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ CertificateException -> 0x0214 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x0214 }
            r0.<init>(r3)     // Catch:{ CertificateException -> 0x0214 }
            java.security.cert.Certificate r2 = r1.generateCertificate(r0)     // Catch:{ CertificateException -> 0x0214 }
            goto L_0x01b7
        L_0x0214:
            r1 = move-exception
            java.lang.String r0 = "fpm/SelfSignedCertificateFactory/generate-x509-certificate/failed to generate certificate"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x01b7
        L_0x021b:
            r1 = move-exception
            java.lang.String r0 = "fpm/SelfSignedCertificateFactory/sign-certificate/Failed to sign certificate"
            goto L_0x0222
        L_0x021f:
            r1 = move-exception
            java.lang.String r0 = "fpm/SelfSignedCertificateFactory/sign-certificate/Failed to encode signed vector"
        L_0x0222:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0225:
            java.lang.String r0 = "fpm/SelfSignedCertificateFactory/generate-self-signed-certificate/failed to sign certificate"
            goto L_0x01b4
        L_0x0228:
            java.lang.Object r0 = r2.first     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r0 = X.AnonymousClass474.A00(r0)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            r1 = 1
            java.lang.String r15 = "android"
            java.lang.String r13 = "cert"
            X.4Zd r8 = new X.4Zd     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            r8.<init>(r0, r12)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r0 = "whatsapp-consumer://fpm-migration?version="
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            r3.append(r1)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r11 = "?"
            r3.append(r11)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r0 = "platform"
            r3.append(r0)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r1 = "="
            X.C13680ns.A1Y(r1, r15, r11, r3)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r0 = "authMethod"
            X.C13680ns.A1Y(r0, r1, r13, r3)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            r3.append(r11)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r0 = "certHash"
            r3.append(r0)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            r3.append(r1)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r0 = r8.A01     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            r3.append(r0)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            r3.append(r11)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r11 = "authToken"
            r3.append(r11)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            r3.append(r1)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r0 = r8.A00     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r3)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            X.2bE r0 = X.C51232bE.A03     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            X.2bG r0 = X.C51242bF.A00(r0, r1, r5)     // Catch:{ CertificateEncodingException -> 0x02c0, 440 -> 0x02c7 }
            java.lang.Object r8 = r2.first
            if (r8 == 0) goto L_0x02cc
            java.lang.Object r3 = r2.second
            if (r3 == 0) goto L_0x02cc
            r7.A07 = r10
            r7.A0B = r0
            X.0tz r0 = r6.A08
            android.content.Context r2 = r0.A00
            java.io.Serializable r3 = (java.io.Serializable) r3
            java.security.cert.Certificate r8 = (java.security.cert.Certificate) r8
            java.lang.String r0 = "com.obwhatsapp.migration.START"
            android.content.Intent r1 = X.C13700nu.A02(r0)
            r1.putExtra(r11, r12)
            java.lang.String r0 = "privateKey"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "certificate"
            r1.putExtra(r0, r8)
            java.lang.Class<com.obwhatsapp.migration.transfer.service.ReceiverDeviceTransferService> r0 = com.obwhatsapp.migration.transfer.service.ReceiverDeviceTransferService.class
            r1.setClass(r2, r0)
            X.C446524y.A00(r2, r1)
            r7.A03 = r9
            r1 = 2
            com.facebook.redex.IDxActionShape62S0200000_2_I1 r0 = new com.facebook.redex.IDxActionShape62S0200000_2_I1
            r0.<init>(r4, r6, r1)
            r7.A0E = r0
            com.facebook.redex.IDxActionShape62S0200000_2_I1 r0 = new com.facebook.redex.IDxActionShape62S0200000_2_I1
            r0.<init>(r4, r6, r14)
            r7.A0C = r0
            return r7
        L_0x02c0:
            r1 = move-exception
            java.lang.String r0 = "fpm/DeviceTransferViewModel/qr code generation failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x02cc
        L_0x02c7:
            java.lang.String r0 = "fpm/DeviceTransferViewModel/generateQrCodeForReceiver/encoder exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x02cc:
            X.027 r1 = r6.A06
            X.4Np r0 = r6.A05()
            r1.A09(r0)
        L_0x02d5:
            return r5
        L_0x02d6:
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x02e4
            r0 = 2131893616(0x7f121d70, float:1.9422014E38)
            r7.A0A = r0
            r0 = 2131893615(0x7f121d6f, float:1.9422012E38)
            r7.A09 = r0
        L_0x02e4:
            r1 = 0
            com.facebook.redex.IDxActionShape387S0100000_2_I1 r0 = new com.facebook.redex.IDxActionShape387S0100000_2_I1
            r0.<init>(r6, r1)
            r7.A0D = r0
            r1 = 6
            com.facebook.redex.IDxActionShape62S0200000_2_I1 r0 = new com.facebook.redex.IDxActionShape62S0200000_2_I1
            r0.<init>(r4, r6, r1)
            r7.A0E = r0
            r1 = 4
        L_0x02f5:
            com.facebook.redex.IDxActionShape62S0200000_2_I1 r0 = new com.facebook.redex.IDxActionShape62S0200000_2_I1
            r0.<init>(r4, r6, r1)
            r7.A0C = r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel.A06(java.lang.Integer):X.4PB");
    }

    public void A07() {
        boolean z2 = this.A01;
        Context context = this.A08.A00;
        context.startService(new Intent(context, z2 ? DonorDeviceTransferService.class : ReceiverDeviceTransferService.class).setAction("com.obwhatsapp.migration.STOP"));
    }

    public final void A08(int i2) {
        int i3 = this.A00;
        if (i2 != i3) {
            StringBuilder A0r = AnonymousClass000.A0r("fpm/DeviceTransferViewModel/change state from ");
            A0r.append(i3);
            A0r.append(" to ");
            A0r.append(i2);
            C13680ns.A1V(A0r);
            this.A00 = i2;
            AnonymousClass4PB A062 = A06(Integer.valueOf(i2));
            if (A062 != null) {
                this.A07.A09(A062);
            }
        }
    }

    public void A09(int i2, int i3) {
        AnonymousClass027 r2 = this.A04;
        if (r2.A01() == null || !C34901l3.A00(Integer.valueOf(i2), ((Pair) r2.A01()).first) || !C34901l3.A00(Integer.valueOf(i3), ((Pair) r2.A01()).second)) {
            r2.A09(C13680ns.A0F(Integer.valueOf(i2), i3));
        }
    }

    public void A0A(Bundle bundle) {
        C103034zv r1 = new C103034zv(this);
        this.A0B.A02(r1);
        this.A09.A02(r1);
        this.A0A.A02(r1);
        AnonymousClass00B.A0C("getIntent().getExtras()[IS_DONOR_ARG] is required but is not present", bundle.containsKey("is_donor"));
        this.A01 = bundle.getBoolean("is_donor");
        this.A07.A0B(A06(C13680ns.A0X()));
        if (this.A01) {
            this.A0E.Acl(new RunnableRunnableShape19S0100000_I1_2(this.A0D, 5));
        }
    }
}
