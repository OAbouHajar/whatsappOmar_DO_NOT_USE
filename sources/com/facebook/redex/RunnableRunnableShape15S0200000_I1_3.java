package com.facebook.redex;

public class RunnableRunnableShape15S0200000_I1_3 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape15S0200000_I1_3(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024a, code lost:
        if (r0 == 2) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x025b, code lost:
        if (r2 != 408) goto L_0x025d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r6 = r19
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x039d;
                case 1: goto L_0x0377;
                case 2: goto L_0x034c;
                case 3: goto L_0x0304;
                case 4: goto L_0x02f6;
                case 5: goto L_0x0299;
                case 6: goto L_0x028c;
                case 7: goto L_0x00db;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00b6;
                case 10: goto L_0x0093;
                case 11: goto L_0x0078;
                case 12: goto L_0x0062;
                case 13: goto L_0x0032;
                case 14: goto L_0x03ca;
                case 15: goto L_0x03ca;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "MediaCodecVideoDecoder Java releaseDecoder on release thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r1 = r6.A00     // Catch:{ Exception -> 0x0024 }
            org.wawebrtc.MediaCodecVideoDecoder r1 = (org.wawebrtc.MediaCodecVideoDecoder) r1     // Catch:{ Exception -> 0x0024 }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x0017
            r0.stop()     // Catch:{ Exception -> 0x0024 }
        L_0x0017:
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x001e
            r0.release()     // Catch:{ Exception -> 0x0024 }
        L_0x001e:
            java.lang.String r0 = "MediaCodecVideoDecoder Java releaseDecoder on release thread done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0024 }
            goto L_0x002a
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoDecoder Media decoder release failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x002a:
            java.lang.Object r0 = r6.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x0032:
            java.lang.Object r5 = r6.A00
            X.4y3 r5 = (X.C101894y3) r5
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x003e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03d7
            java.lang.Object r3 = r4.next()
            X.1Xg r3 = (X.C28711Xg) r3
            X.0rv r1 = r3.A01()
            com.obwhatsapp.storage.StorageUsageGalleryActivity r2 = r5.A00
            X.0rv r0 = r2.A0X
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.1Xf r0 = r3.A00
            long r0 = r0.A0G
            r2.A03 = r0
            r2.A36()
            return
        L_0x0062:
            java.lang.Object r2 = r6.A00
            X.4Rd r2 = (X.C86084Rd) r2
            java.lang.Object r1 = r6.A01
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = 0
            r2.A01 = r0
            X.1Mo r2 = r2.A03
            java.lang.String r1 = r1.toString()
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x0078:
            java.lang.Object r0 = r6.A00
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0) r0
            java.lang.Object r1 = r6.A01
            X.0rv r1 = (X.C15830rv) r1
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.search.SearchFragment r0 = (com.obwhatsapp.search.SearchFragment) r0
            com.obwhatsapp.search.SearchFragment.A02(r1, r0)
            com.obwhatsapp.search.SearchViewModel r1 = r0.A1L
            boolean r0 = r1.A0a()
            if (r0 == 0) goto L_0x03d7
            r1.A0H()
            return
        L_0x0093:
            java.lang.Object r0 = r6.A00
            X.3GZ r0 = (X.AnonymousClass3GZ) r0
            java.lang.Object r4 = r6.A01
            X.1lI r4 = (X.C35051lI) r4
            X.4F1 r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r3 = r0.A00
            X.13S r2 = r3.A05
            int r1 = r2.A00()
            r0 = 4
            if (r1 == r0) goto L_0x00b2
            r2.A03(r4)
            X.027 r1 = r3.A02
            r0 = 2
            X.C13680ns.A1O(r1, r0)
            return
        L_0x00b2:
            com.obwhatsapp.report.BusinessActivityReportViewModel.A01(r3)
            return
        L_0x00b6:
            java.lang.Object r1 = r6.A00
            X.3Gr r1 = (X.C63243Gr) r1
            java.lang.Object r0 = r6.A01
            X.4Mc r0 = (X.C84844Mc) r0
            com.obwhatsapp.registration.VerifyPhoneNumber r1 = r1.A00
            java.lang.String r2 = r1.A1C
            java.lang.String r3 = r1.A1D
            java.lang.String r4 = r0.A01
            boolean r7 = r0.A03
            boolean r8 = r0.A02
            r5 = 0
            r9 = 0
            r6 = -1
            r1.A41(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x00d1:
            java.lang.Object r1 = r6.A00
            X.5S6 r1 = (X.AnonymousClass5S6) r1
            java.lang.Object r0 = r6.A01
            r1.AOt(r0)
            return
        L_0x00db:
            java.lang.Object r4 = r6.A00
            X.2RO r4 = (X.AnonymousClass2RO) r4
            java.lang.Object r12 = r6.A01
            X.284 r12 = (X.AnonymousClass284) r12
            X.2RN r14 = r4.A02
            java.lang.ref.WeakReference r0 = r4.A0N
            java.lang.Object r3 = r0.get()
            X.2bB r3 = (X.C51202bB) r3
            if (r3 == 0) goto L_0x03d7
            r11 = 0
            if (r14 == 0) goto L_0x0289
            com.whatsapp.jid.UserJid r5 = r14.A02
            if (r5 == 0) goto L_0x0289
            X.0uP r0 = r4.A0B
            X.1Vq r11 = r0.A00(r5)
            X.0sG r0 = r4.A0A
            boolean r0 = r0.A0Z(r5)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            X.0pN r2 = r3.A07
            boolean r0 = r2 instanceof com.obwhatsapp.qrcode.contactqr.QrSheetDeepLinkActivity
            if (r0 == 0) goto L_0x0139
            com.obwhatsapp.qrcode.contactqr.QrSheetDeepLinkActivity r2 = (com.obwhatsapp.qrcode.contactqr.QrSheetDeepLinkActivity) r2
            X.0sK r0 = r2.A01
            boolean r0 = r0.A0I(r5)
            if (r0 != 0) goto L_0x0139
            android.content.Intent r6 = r2.getIntent()
            r1 = 4
            java.lang.String r0 = "extra_entry_point"
            int r7 = r6.getIntExtra(r0, r1)
            X.0pd r1 = r2.A0C
            java.lang.String r0 = r2.A0M
            boolean r0 = X.C18030w2.A06(r1, r0)
            r6 = 3
            if (r0 == 0) goto L_0x0270
            X.1ND r2 = r2.A0F
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A01(r5, r1, r0)
        L_0x0139:
            X.0t9 r13 = r4.A0I
            int r2 = r4.A04
            r5 = 0
            java.lang.String r1 = r4.A0M
            boolean r18 = X.C54692i1.A03(r1)
            r17 = r2
            r16 = r5
            X.C54692i1.A02(r11, r12, r13, r14, r15, r16, r17, r18)
            int r0 = r4.A05
            java.lang.String r7 = X.C54692i1.A01(r0, r1)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x015a
            X.0pN r0 = r3.A07
            r0.Ac1()
        L_0x015a:
            r8 = 0
            r3.A00 = r5
            r9 = 0
            if (r14 == 0) goto L_0x016a
            com.whatsapp.jid.UserJid r4 = r14.A02
            if (r4 == 0) goto L_0x016a
            X.0sG r0 = r3.A0F
            X.0sH r8 = r0.A08(r4)
        L_0x016a:
            r10 = 5
            if (r2 != r10) goto L_0x026c
            java.lang.String r6 = "message_short_link"
        L_0x016f:
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0228
            if (r14 == 0) goto L_0x0228
            if (r8 == 0) goto L_0x0228
            X.0sG r0 = r3.A0F
            com.whatsapp.jid.UserJid r11 = r14.A02
            boolean r0 = r0.A0Z(r11)
            r5 = 2
            if (r0 == 0) goto L_0x0193
            X.0sP r4 = r3.A0I
            r0 = -1
            boolean r0 = r4.A0S(r8, r0)
            if (r0 == 0) goto L_0x01a2
            X.0sK r0 = r3.A0A
            boolean r0 = r0.A0I(r11)
            if (r0 != 0) goto L_0x01a2
        L_0x0193:
            int r4 = r14.A01
            r0 = 3
            if (r4 == r0) goto L_0x01a2
            if (r4 != r5) goto L_0x0228
            X.0rs r0 = r3.A0K
            boolean r0 = r0.A0C(r11)
            if (r0 == 0) goto L_0x0228
        L_0x01a2:
            if (r2 != r10) goto L_0x01a9
            X.0pN r0 = r3.A07
            r0.finish()
        L_0x01a9:
            java.lang.String r2 = r14.A03
            int r4 = r14.A01
            if (r4 == r5) goto L_0x0206
            r0 = 3
            if (r4 != r0) goto L_0x021d
            X.0pd r2 = r3.A0Q
            boolean r0 = X.C18030w2.A06(r2, r1)
            if (r0 == 0) goto L_0x01fc
            r2 = 20
        L_0x01bc:
            X.0ph r1 = X.C14750ph.A0q()
            X.0pN r9 = r3.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.content.Intent r2 = r1.A0w(r9, r8, r0)
        L_0x01ca:
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "extra_deep_link_session_id"
            r2.putExtra(r0, r1)
            android.content.Intent r1 = X.C14750ph.A02(r9)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            android.content.Intent r0 = r1.addFlags(r0)
            r9.startActivity(r0)
            java.lang.String r0 = "QrHandler"
            X.AnonymousClass22U.A00(r2, r0)
            r9.startActivity(r2)
            if (r4 != r5) goto L_0x01f8
            X.0sq r1 = r3.A0V
            r11 = 1
            com.facebook.redex.RunnableRunnableShape0S2200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S2200000_I0
            r8 = r14
            r9 = r6
            r10 = r7
            r6 = r0
            r7 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r1.Acl(r0)
        L_0x01f8:
            r0 = 0
            r3.A0a = r0
            return
        L_0x01fc:
            boolean r0 = X.C18030w2.A05(r2, r1)
            r2 = 1
            if (r0 == 0) goto L_0x01bc
            r2 = 19
            goto L_0x01bc
        L_0x0206:
            X.0rv r1 = X.C16010sH.A02(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x021d
            if (r1 == 0) goto L_0x021d
            X.0ph r0 = X.C14750ph.A0q()
            X.0pN r9 = r3.A07
            android.content.Intent r2 = r0.A0z(r9, r1, r2)
            goto L_0x01ca
        L_0x021d:
            X.0ph r0 = X.C14750ph.A0q()
            X.0pN r9 = r3.A07
            android.content.Intent r2 = r0.A0v(r9, r8)
            goto L_0x01ca
        L_0x0228:
            X.0pd r0 = r3.A0Q
            boolean r5 = X.C18030w2.A05(r0, r1)
            if (r14 == 0) goto L_0x0232
            com.whatsapp.jid.UserJid r9 = r14.A02
        L_0x0232:
            X.26U r4 = new X.26U
            r4.<init>(r9, r6, r7)
            if (r14 == 0) goto L_0x025d
            int r2 = r14.A00
            if (r2 != 0) goto L_0x025f
            if (r12 == 0) goto L_0x025d
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x025d
            int r0 = r14.A01
            if (r0 == 0) goto L_0x024c
            r1 = 2
            if (r0 != r1) goto L_0x0267
        L_0x024c:
            com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment r2 = com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment.A01(r4, r14)
        L_0x0250:
            X.0pN r1 = r3.A07
            java.lang.String r0 = "qr_code_scanning_dialog_fragment_tag"
            r1.Afb(r2, r0)
            goto L_0x01f8
        L_0x0258:
            r0 = 408(0x198, float:5.72E-43)
            r1 = 3
            if (r2 == r0) goto L_0x0267
        L_0x025d:
            r1 = 0
            goto L_0x0267
        L_0x025f:
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x0258
            r1 = 1
            if (r5 == 0) goto L_0x0267
            r1 = 7
        L_0x0267:
            com.obwhatsapp.qrcode.contactqr.ErrorDialogFragment r2 = com.obwhatsapp.qrcode.contactqr.ErrorDialogFragment.A01(r1)
            goto L_0x0250
        L_0x026c:
            java.lang.String r6 = "qr_code"
            goto L_0x016f
        L_0x0270:
            X.0pd r1 = r2.A0C
            java.lang.String r0 = r2.A0M
            boolean r0 = X.C18030w2.A05(r1, r0)
            if (r0 == 0) goto L_0x0139
            X.1ND r2 = r2.A0F
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A00(r5, r1, r0)
            goto L_0x0139
        L_0x0289:
            r15 = r11
            goto L_0x0139
        L_0x028c:
            java.lang.Object r0 = r6.A00
            X.4wq r0 = (X.C101174wq) r0
            java.lang.Object r1 = r6.A01
            X.4Uj r1 = (X.C86844Uj) r1
            com.obwhatsapp.qrcode.QrScannerViewV2 r0 = r0.A00
            X.5Sf r0 = r0.A05
            goto L_0x0300
        L_0x0299:
            java.lang.Object r3 = r6.A00
            X.2np r3 = (X.C56542np) r3
            java.lang.Object r5 = r6.A01
            byte[] r5 = (byte[]) r5
            java.lang.String r0 = "QrScannerView/decodeQrCode"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.hardware.Camera$Size r2 = r3.A02
            int r6 = r2.width
            int r0 = r6 * 3
            int r10 = r0 >> 2
            r1 = 320(0x140, float:4.48E-43)
            if (r10 >= r1) goto L_0x02b3
            r10 = r6
        L_0x02b3:
            int r7 = r2.height
            int r0 = r7 * 3
            int r11 = r0 >> 2
            if (r11 >= r1) goto L_0x02bc
            r11 = r7
        L_0x02bc:
            int r0 = r6 - r10
            int r8 = r0 >> 1
            int r0 = r7 - r11
            int r9 = r0 >> 1
            X.3fS r4 = new X.3fS
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.4ad r1 = r3.A0K     // Catch:{ 43w -> 0x02ea }
            java.util.Map r0 = r3.A0B     // Catch:{ 43w -> 0x02ea }
            X.4Uj r4 = X.C812547l.A00(r4, r1, r0)     // Catch:{ 43w -> 0x02ea }
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x02f0
            java.lang.String r0 = "QrScannerView/notifyQrCodeDetected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Sf r0 = r3.A08
            if (r0 == 0) goto L_0x03d7
            android.os.Handler r2 = r3.A0H
            r1 = 4
            com.facebook.redex.RunnableRunnableShape15S0200000_I1_3 r0 = new com.facebook.redex.RunnableRunnableShape15S0200000_I1_3
            r0.<init>(r3, r1, r4)
            r2.post(r0)
            return
        L_0x02ea:
            r1 = move-exception
            java.lang.String r0 = "QrScannerView/decodeQrCode/failed to decode"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x02f4 }
        L_0x02f0:
            r3.AcJ()
            return
        L_0x02f4:
            r0 = move-exception
            throw r0
        L_0x02f6:
            java.lang.Object r0 = r6.A00
            X.2np r0 = (X.C56542np) r0
            java.lang.Object r1 = r6.A01
            X.4Uj r1 = (X.C86844Uj) r1
            X.5Sf r0 = r0.A08
        L_0x0300:
            r0.AVV(r1)
            return
        L_0x0304:
            java.lang.Object r4 = r6.A00
            X.2np r4 = (X.C56542np) r4
            java.lang.Object r1 = r6.A01
            android.view.SurfaceHolder r1 = (android.view.SurfaceHolder) r1
            r3 = 0
            boolean r0 = r1.isCreating()     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
            if (r0 != 0) goto L_0x0318
            android.hardware.Camera r0 = r4.A03     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
            r0.stopPreview()     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
        L_0x0318:
            android.hardware.Camera r0 = r4.A03     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
            r0.setPreviewDisplay(r1)     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
            android.os.Handler r2 = r4.A04     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
            r1 = 20
            com.facebook.redex.RunnableRunnableShape19S0100000_I1_2 r0 = new com.facebook.redex.RunnableRunnableShape19S0100000_I1_2     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
            r0.<init>(r4, r1)     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
            r2.post(r0)     // Catch:{ RuntimeException -> 0x033b, IOException -> 0x032a }
            return
        L_0x032a:
            r1 = move-exception
            android.hardware.Camera r0 = r4.A03
            r0.release()
            r4.A03 = r3
            java.lang.String r0 = "qrview/surfacechanged: error setting preview display"
            com.whatsapp.util.Log.e(r0, r1)
            r4.A00()
            return
        L_0x033b:
            r1 = move-exception
            android.hardware.Camera r0 = r4.A03
            r0.release()
            r4.A03 = r3
            java.lang.String r0 = "qrview/surfacechanged "
            com.whatsapp.util.Log.e(r0, r1)
            r4.A00()
            return
        L_0x034c:
            java.lang.Object r0 = r6.A00
            com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0 r0 = (com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0) r0
            java.lang.Object r1 = r6.A01
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.obwhatsapp.qrcode.DevicePairQrScannerActivity) r2
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x03d7
            X.2gc r0 = r2.A08
            X.2Ui r0 = r0.A00()
            X.1WF r0 = r0.A00
            if (r0 == 0) goto L_0x03d7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03d7
            X.0pt r1 = r2.A05
            java.lang.Runnable r0 = r2.A0E
            r1.A0J(r0)
            r2.A39()
            return
        L_0x0377:
            java.lang.Object r0 = r6.A00
            com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0 r0 = (com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0) r0
            java.lang.Object r2 = r6.A01
            java.lang.Object r1 = r0.A00
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity r1 = (com.obwhatsapp.qrcode.DevicePairQrScannerActivity) r1
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x03d7
            X.2gc r0 = r1.A08
            X.2Ui r0 = r0.A00()
            X.1WF r0 = r0.A00
            if (r0 == 0) goto L_0x03d7
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03d7
            X.5Sp r0 = r1.A04
            r0.AKZ()
            return
        L_0x039d:
            java.lang.Object r0 = r6.A00
            com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0 r0 = (com.obwhatsapp.data.device.IDxDObserverShape77S0100000_2_I0) r0
            java.lang.Object r2 = r6.A01
            java.lang.Object r1 = r0.A00
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity r1 = (com.obwhatsapp.qrcode.DevicePairQrScannerActivity) r1
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x03d7
            X.2gc r0 = r1.A08
            X.2Ui r0 = r0.A00()
            X.1WF r0 = r0.A00
            if (r0 == 0) goto L_0x03d7
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03d7
            r0 = 2131888203(0x7f12084b, float:1.9411035E38)
            r1.Afg(r0)
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity.A02(r1)
            r0 = 0
            r1.A06 = r0
            return
        L_0x03ca:
            java.lang.Object r2 = r6.A00
            X.5GN r2 = (X.AnonymousClass5GN) r2
            java.lang.Object r1 = r6.A01
            X.0ia r1 = (X.C11340ia) r1
            X.22M r0 = X.AnonymousClass22M.A00
            r2.A0B(r0, r1)
        L_0x03d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape15S0200000_I1_3.run():void");
    }
}
