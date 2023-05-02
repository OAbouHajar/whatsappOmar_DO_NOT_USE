package com.facebook.redex;

public class RunnableRunnableShape19S0100000_I1_2 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape19S0100000_I1_2(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02be, code lost:
        if (r9 == 2) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x038f, code lost:
        if (r9 != 3) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0415, code lost:
        if (r2.contains(r1) != false) goto L_0x0417;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0495  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x016b;
                case 1: goto L_0x001c;
                case 2: goto L_0x0030;
                case 3: goto L_0x018d;
                case 4: goto L_0x0199;
                case 5: goto L_0x01a1;
                case 6: goto L_0x01f7;
                case 7: goto L_0x0200;
                case 8: goto L_0x0056;
                case 9: goto L_0x0208;
                case 10: goto L_0x0223;
                case 11: goto L_0x0231;
                case 12: goto L_0x023f;
                case 13: goto L_0x024d;
                case 14: goto L_0x025b;
                case 15: goto L_0x0066;
                case 16: goto L_0x0269;
                case 17: goto L_0x0276;
                case 18: goto L_0x027e;
                case 19: goto L_0x0084;
                case 20: goto L_0x0286;
                case 21: goto L_0x00bd;
                case 22: goto L_0x00c7;
                case 23: goto L_0x00d5;
                case 24: goto L_0x04a7;
                case 25: goto L_0x00e4;
                case 26: goto L_0x04b1;
                case 27: goto L_0x04bd;
                case 28: goto L_0x04da;
                case 29: goto L_0x04e5;
                case 30: goto L_0x04f4;
                case 31: goto L_0x00f7;
                case 32: goto L_0x0509;
                case 33: goto L_0x0517;
                case 34: goto L_0x0525;
                case 35: goto L_0x0525;
                case 36: goto L_0x0537;
                case 37: goto L_0x0109;
                case 38: goto L_0x0109;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x011e;
                case 42: goto L_0x0139;
                case 43: goto L_0x015f;
                case 44: goto L_0x0549;
                case 45: goto L_0x05a3;
                case 46: goto L_0x05ab;
                case 47: goto L_0x05b4;
                case 48: goto L_0x05d8;
                case 49: goto L_0x05e0;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.3Ga r0 = (X.C63073Ga) r0
            X.4F0 r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.027 r1 = r2.A01
            r0 = 2
            X.C13680ns.A1O(r1, r0)
            X.027 r1 = r2.A02
            r0 = 0
            X.C13680ns.A1O(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r2 = r1.A00
            X.2Ra r2 = (X.AnonymousClass2Ra) r2
            X.2Rb r0 = r2.A0J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x001b
            X.2Rc r1 = r2.A0Q
            r0 = 1
            r1.A08(r0)
            r2.A00()
            return
        L_0x0030:
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCObserverShape9S0100000_2_I0 r0 = (com.facebook.redex.IDxCObserverShape9S0100000_2_I0) r0
            java.lang.Object r2 = r0.A00
            X.2Rd r2 = (X.C49122Rd) r2
            X.0tt r1 = r2.A02
            if (r1 == 0) goto L_0x001b
            X.0tt r0 = r2.A03
            if (r0 == 0) goto L_0x001b
            int r0 = r1.getCount()
            r2.A00 = r0
            X.0tt r0 = r2.A03
            int r0 = r0.getCount()
            r2.A01 = r0
            java.lang.Runnable r0 = r2.A07
            if (r0 == 0) goto L_0x001b
            r0.run()
            return
        L_0x0056:
            java.lang.Object r1 = r1.A00
            X.22J r1 = (X.AnonymousClass22J) r1
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "TODO"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            r1.AIU(r0)
            return
        L_0x0066:
            java.lang.Object r0 = r1.A00
            X.0uu r0 = (X.C17330uu) r0
            X.13d r0 = r0.A01
            r2 = 0
            X.AnonymousClass00B.A01()
            java.util.Iterator r1 = X.C16590tJ.A00(r0)
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.13c r0 = (X.C211813c) r0
            r0.AN6(r2)
            goto L_0x0074
        L_0x0084:
            java.lang.Object r3 = r1.A00
            X.2np r3 = (X.C56542np) r3
            android.hardware.Camera r0 = r3.A03
            if (r0 != 0) goto L_0x0609
            r4 = 0
            android.hardware.Camera r1 = android.hardware.Camera.open()     // Catch:{ Exception -> 0x00a5 }
            r3.A03 = r1     // Catch:{ Exception -> 0x00a5 }
            if (r1 != 0) goto L_0x009c
            r0 = 0
            android.hardware.Camera r1 = android.hardware.Camera.open(r0)     // Catch:{ Exception -> 0x00a5 }
            r3.A03 = r1     // Catch:{ Exception -> 0x00a5 }
        L_0x009c:
            X.4gF r0 = new X.4gF     // Catch:{ Exception -> 0x00a5 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00a5 }
            r1.setErrorCallback(r0)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00b7
        L_0x00a5:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A03
            if (r0 == 0) goto L_0x00ad
            r0.release()
        L_0x00ad:
            r3.A03 = r4
            java.lang.String r0 = "qrview/startcamera error opening camera"
            com.whatsapp.util.Log.e(r0, r1)
            r3.A00()
        L_0x00b7:
            android.hardware.Camera r1 = r3.A03
            if (r1 == 0) goto L_0x001b
            goto L_0x05ec
        L_0x00bd:
            java.lang.Object r0 = r1.A00
            X.2np r0 = (X.C56542np) r0
            android.hardware.Camera r1 = r0.A03
            if (r1 == 0) goto L_0x001b
            goto L_0x0620
        L_0x00c7:
            java.lang.Object r0 = r1.A00
            X.2np r0 = (X.C56542np) r0
            android.hardware.Camera r1 = r0.A03
            if (r1 == 0) goto L_0x001b
            android.hardware.Camera$PreviewCallback r0 = r0.A0G
            r1.setOneShotPreviewCallback(r0)
            return
        L_0x00d5:
            java.lang.Object r2 = r1.A00
            X.2np r2 = (X.C56542np) r2
            java.lang.String r0 = "qrview/stopcamera"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.hardware.Camera r0 = r2.A03
            if (r0 == 0) goto L_0x001b
            goto L_0x062d
        L_0x00e4:
            java.lang.Object r2 = r1.A00
            X.2np r2 = (X.C56542np) r2
            android.hardware.Camera r0 = r2.A03
            if (r0 == 0) goto L_0x001b
            android.os.Handler r1 = r2.A04
            java.lang.Runnable r0 = r2.A0L
            if (r1 == 0) goto L_0x0647
            r1.removeCallbacks(r0)
            goto L_0x064a
        L_0x00f7:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0) r0
            java.lang.Object r1 = r0.A00
            com.obwhatsapp.report.ReportActivity r1 = (com.obwhatsapp.report.ReportActivity) r1
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x001b
            r1.Aba()
            return
        L_0x0109:
            java.lang.Object r0 = r1.A00
            X.3GZ r0 = (X.AnonymousClass3GZ) r0
            X.4F1 r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r2 = r0.A00
            X.13S r0 = r2.A05
            int r1 = r0.A00()
            r0 = 1
            if (r1 != r0) goto L_0x001b
            com.obwhatsapp.report.BusinessActivityReportViewModel.A01(r2)
            return
        L_0x011e:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0) r0
            java.lang.Object r1 = r0.A00
            com.obwhatsapp.search.SearchFragment r1 = (com.obwhatsapp.search.SearchFragment) r1
            X.2AU r0 = r1.A1K
            if (r0 == 0) goto L_0x012d
            r0.A01()
        L_0x012d:
            com.obwhatsapp.search.SearchViewModel r1 = r1.A1L
            boolean r0 = r1.A0a()
            if (r0 == 0) goto L_0x001b
            r1.A0H()
            return
        L_0x0139:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.search.SearchFragment r0 = (com.obwhatsapp.search.SearchFragment) r0
            X.00l r2 = r0.A0C()
            X.0pY r2 = (X.C14660pY) r2
            com.obwhatsapp.search.SearchViewModel r1 = r0.A1L
            r0 = 2
            r1.A0Q(r0)
            if (r2 == 0) goto L_0x001b
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x001b
            com.obwhatsapp.HomeActivity r2 = (com.obwhatsapp.HomeActivity) r2
            android.view.ViewGroup r0 = r2.A0G
            X.AnonymousClass267.A00(r0)
            android.view.View r1 = r2.A09
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x015f:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.WaPreferenceFragment r0 = (com.obwhatsapp.WaPreferenceFragment) r0
            X.2KO r0 = r0.A00
            if (r0 == 0) goto L_0x001b
            r0.Ac1()
            return
        L_0x016b:
            java.lang.Object r3 = r1.A00
            X.2S8 r3 = (X.AnonymousClass2S8) r3
            android.view.View r2 = r3.A05
            r0 = 1962934272(0x75000000, float:1.6225928E32)
            r2.setBackgroundColor(r0)
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0189
            android.widget.TextView r1 = r3.A0A
            r0 = -1291845633(0xffffffffb2ffffff, float:-2.980232E-8)
            r1.setTextColor(r0)
            android.graphics.drawable.Drawable r1 = r3.A03
            r0 = 178(0xb2, float:2.5E-43)
            r1.setAlpha(r0)
        L_0x0189:
            X.C13680ns.A11(r2)
            return
        L_0x018d:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0 r0 = (com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0) r0
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.mediaview.MediaViewBaseFragment r0 = (com.obwhatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1G()
            return
        L_0x0199:
            java.lang.Object r0 = r1.A00
            X.0sr r0 = (X.C16330sr) r0
            r0.A02()
            return
        L_0x01a1:
            java.lang.Object r4 = r1.A00
            X.1Ol r4 = (X.C26611Ol) r4
            X.0sv r0 = r4.A07     // Catch:{ IOException -> 0x01ec }
            r0.A04()     // Catch:{ IOException -> 0x01ec }
            X.1Bq r0 = r4.A06     // Catch:{ IOException -> 0x01ec }
            r0.A01()     // Catch:{ IOException -> 0x01ec }
            java.lang.String r0 = "fpm/DonorTransferTask/reset()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ec }
            X.1Ok r3 = r4.A09     // Catch:{ IOException -> 0x01ec }
            r2 = 0
            com.facebook.redex.IDxCallbackShape445S0100000_2_I1 r1 = new com.facebook.redex.IDxCallbackShape445S0100000_2_I1     // Catch:{ IOException -> 0x01ec }
            r1.<init>(r4, r2)     // Catch:{ IOException -> 0x01ec }
            r0 = 1
            r3.A00(r1, r0)     // Catch:{ IOException -> 0x01ec }
            X.1Bs r1 = r4.A05     // Catch:{ IOException -> 0x01ec }
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ IOException -> 0x01ec }
            r0.<init>()     // Catch:{ IOException -> 0x01ec }
            r1.A02(r0)     // Catch:{ IOException -> 0x01ec }
            r1.A00()     // Catch:{ IOException -> 0x01ec }
            java.lang.String r0 = "fpm/DonorTransferTask/copyKey()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ec }
            X.0yx r0 = r4.A0A     // Catch:{ IOException -> 0x01ec }
            r0.A0F()     // Catch:{ IOException -> 0x01ec }
            X.0y3 r0 = r4.A03     // Catch:{ IOException -> 0x01ec }
            r0.A03(r2)     // Catch:{ IOException -> 0x01ec }
            X.0xk r0 = r4.A02     // Catch:{ IOException -> 0x01ec }
            r0.A0D(r2)     // Catch:{ IOException -> 0x01ec }
            java.lang.String r0 = "fpm/DonorTransferTask/enablePassiveMode()/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x01ec }
            java.util.concurrent.CountDownLatch r0 = r4.A0B     // Catch:{ IOException -> 0x01ec }
            r0.countDown()     // Catch:{ IOException -> 0x01ec }
            return
        L_0x01ec:
            r1 = move-exception
            java.lang.String r0 = "fpm/DonorTransferTask/failure during data preparation: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01f7:
            java.lang.Object r1 = r1.A00
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            r1.setLayoutTransition(r0)
            return
        L_0x0200:
            java.lang.Object r0 = r1.A00
            X.2SE r0 = (X.AnonymousClass2SE) r0
            r0.AUd()
            return
        L_0x0208:
            java.lang.Object r0 = r1.A00
            X.4NR r0 = (X.AnonymousClass4NR) r0
            X.01D r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.13g r0 = (X.C212213g) r0
            X.4QQ r0 = r0.A02
            r1 = 0
            X.0qW r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.1zV r0 = (X.C43201zV) r0
            r0.A03(r1)
            return
        L_0x0223:
            java.lang.Object r1 = r1.A00
            X.22J r1 = (X.AnonymousClass22J) r1
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            X.2SF r0 = X.AnonymousClass2SF.A00
            r1.AIU(r0)
            return
        L_0x0231:
            java.lang.Object r1 = r1.A00
            X.22J r1 = (X.AnonymousClass22J) r1
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            X.2SH r0 = X.AnonymousClass2SH.A00
            r1.AIU(r0)
            return
        L_0x023f:
            java.lang.Object r1 = r1.A00
            X.22J r1 = (X.AnonymousClass22J) r1
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            X.2SI r0 = X.AnonymousClass2SI.A00
            r1.AIU(r0)
            return
        L_0x024d:
            java.lang.Object r1 = r1.A00
            X.22J r1 = (X.AnonymousClass22J) r1
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            X.2SK r0 = X.AnonymousClass2SK.A00
            r1.AIU(r0)
            return
        L_0x025b:
            java.lang.Object r1 = r1.A00
            X.22J r1 = (X.AnonymousClass22J) r1
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            X.2SM r0 = X.AnonymousClass2SM.A00
            r1.AIU(r0)
            return
        L_0x0269:
            java.lang.Object r0 = r1.A00
            X.5CT r0 = (X.AnonymousClass5CT) r0
            X.27A r2 = r0.A00
            X.0rv r1 = r2.A0I
            r0 = 0
            r2.A03(r1, r0)
            return
        L_0x0276:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.qrcode.AuthenticationActivity r0 = (com.obwhatsapp.qrcode.AuthenticationActivity) r0
            r0.A2m()
            return
        L_0x027e:
            java.lang.Object r0 = r1.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x0286:
            java.lang.Object r0 = r1.A00
            r18 = r0
            r0 = r18
            X.2np r0 = (X.C56542np) r0
            r18 = r0
            int r12 = r18.getWidth()
            int r11 = r18.getHeight()
            java.lang.String r15 = "qrview/startpreview "
            java.lang.String r10 = "x"
            android.hardware.Camera r0 = r0.A03
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = "qrview/startpreview camera is null"
        L_0x02a3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x02a6:
            r18.A00()
            return
        L_0x02aa:
            android.content.Context r0 = r18.getContext()
            android.view.WindowManager r0 = X.AnonymousClass01V.A02(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r9 = r0.getRotation()
            r0 = 2
            if (r9 == 0) goto L_0x02c0
            r5 = 0
            if (r9 != r0) goto L_0x02c1
        L_0x02c0:
            r5 = 1
        L_0x02c1:
            r0 = r18
            android.hardware.Camera r0 = r0.A03     // Catch:{ RuntimeException -> 0x0477 }
            android.hardware.Camera$Parameters r8 = r0.getParameters()     // Catch:{ RuntimeException -> 0x0477 }
            java.util.List r1 = r8.getSupportedPreviewSizes()
            r0 = r18
            r0.A0A = r1
            if (r1 != 0) goto L_0x02ee
            java.lang.String r0 = "qrview/fallbacksupportedpreviewsizes"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            r0 = r18
            r0.A0A = r4
            android.hardware.Camera r3 = r0.A03
            r2 = 640(0x280, float:8.97E-43)
            r1 = 480(0x1e0, float:6.73E-43)
            android.hardware.Camera$Size r0 = new android.hardware.Camera$Size
            r0.<init>(r3, r2, r1)
            r4.add(r0)
        L_0x02ee:
            r0 = r18
            java.util.List r2 = r0.A0A
            r1 = r12
            r0 = r11
            if (r5 == 0) goto L_0x02f8
            r1 = r11
            r0 = r12
        L_0x02f8:
            android.hardware.Camera$Size r2 = X.C49062Qp.A01(r2, r1, r0)
            r0 = r18
            r0.A02 = r2
            if (r2 != 0) goto L_0x0305
            java.lang.String r0 = "qrview/startpreview preview size is null"
            goto L_0x02a3
        L_0x0305:
            double r6 = (double) r12
            double r4 = (double) r11
            double r16 = r6 / r4
            int r3 = r2.width
            double r0 = (double) r3
            int r2 = r2.height
            double r13 = (double) r2
            double r0 = r0 / r13
            double r16 = r16 - r0
            double r13 = java.lang.Math.abs(r16)
            double r4 = r4 / r6
            double r4 = r4 - r0
            double r0 = java.lang.Math.abs(r4)
            double r0 = java.lang.Math.min(r13, r0)
            r5 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0360
            r4 = r18
            int r4 = r4.A01
            if (r12 != r4) goto L_0x0335
            r4 = r18
            int r4 = r4.A00
            if (r11 == r4) goto L_0x0360
        L_0x0335:
            java.lang.String r4 = "qrview/startpreview request layout to match preview size:"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r4)
            X.C13690nt.A1N(r10, r4, r3, r2)
            java.lang.String r2 = " (view is "
            r4.append(r2)
            X.C13690nt.A1N(r10, r4, r12, r11)
            java.lang.String r2 = ") aspect diff is "
            r4.append(r2)
            r4.append(r0)
            X.C13680ns.A1V(r4)
            r0 = r18
            android.os.Handler r3 = r0.A0H
            r2 = 18
            com.facebook.redex.RunnableRunnableShape19S0100000_I1_2 r1 = new com.facebook.redex.RunnableRunnableShape19S0100000_I1_2
            r1.<init>(r0, r2)
            r3.post(r1)
            return
        L_0x0360:
            java.lang.String r0 = "qrview/startpreview optimal preview size:"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            X.C13690nt.A1N(r10, r0, r3, r2)
            X.C13680ns.A1V(r0)
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            r0 = 0
            android.hardware.Camera.getCameraInfo(r0, r2)     // Catch:{ RuntimeException -> 0x0376 }
            goto L_0x037c
        L_0x0376:
            r1 = move-exception
            java.lang.String r0 = "qrview/startpreview/getCameraInfo "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x037c:
            int r1 = r2.facing
            r0 = 1
            boolean r4 = X.AnonymousClass000.A1R(r1, r0)
            int r5 = r2.orientation
            if (r9 == 0) goto L_0x0391
            if (r9 == r0) goto L_0x03c8
            r0 = 2
            if (r9 == r0) goto L_0x03c5
            r0 = 3
            r3 = 270(0x10e, float:3.78E-43)
            if (r9 == r0) goto L_0x0392
        L_0x0391:
            r3 = 0
        L_0x0392:
            int r0 = r5 - r3
            int r0 = r0 + 360
            if (r4 == 0) goto L_0x039e
            int r0 = r5 + r3
            int r0 = r0 % 360
            int r0 = 360 - r0
        L_0x039e:
            int r2 = r0 % 360
            java.lang.String r0 = "qrview/startpreview display:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r3)
            java.lang.String r0 = " camera:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " preview:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " front:"
            r1.append(r0)
            r1.append(r4)
            X.C13680ns.A1V(r1)
            goto L_0x03cb
        L_0x03c5:
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x0392
        L_0x03c8:
            r3 = 90
            goto L_0x0392
        L_0x03cb:
            r0 = r18
            android.hardware.Camera r0 = r0.A03     // Catch:{ RuntimeException -> 0x03d3 }
            r0.setDisplayOrientation(r2)     // Catch:{ RuntimeException -> 0x03d3 }
            goto L_0x03d9
        L_0x03d3:
            r1 = move-exception
            java.lang.String r0 = "qrview/startpreview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03d9:
            r0 = r18
            android.hardware.Camera$Size r0 = r0.A02
            int r1 = r0.width
            int r0 = r0.height
            r8.setPreviewSize(r1, r0)
            java.util.List r2 = r8.getSupportedFocusModes()
            if (r2 == 0) goto L_0x0459
            java.lang.String r0 = "qrview/startpreview supported focus:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.Object[] r0 = r2.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "auto"
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x0417
            java.lang.String r1 = "macro"
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L_0x0417
            java.lang.String r1 = "edof"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x041a
        L_0x0417:
            r8.setFocusMode(r1)
        L_0x041a:
            java.util.List r2 = r8.getSupportedFlashModes()
            if (r2 == 0) goto L_0x0456
            java.lang.String r0 = "qrview/startpreview supported flash:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.Object[] r0 = r2.toArray()
            java.lang.String r0 = java.util.Arrays.deepToString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x0432:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            r0 = r18
            r0.A0D = r1
            if (r2 == 0) goto L_0x045f
            java.lang.String r1 = "off"
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0447
            r8.setFlashMode(r1)
        L_0x0447:
            java.lang.String r0 = "torch"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x045f
            r1 = 1
            r0 = r18
            r0.A0D = r1
            goto L_0x045f
        L_0x0456:
            java.lang.String r0 = "qrview/startpreview supported flash:null"
            goto L_0x0432
        L_0x0459:
            java.lang.String r0 = "qrview/startpreview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x041a
        L_0x045f:
            r0 = r18
            android.hardware.Camera r0 = r0.A03     // Catch:{ RuntimeException -> 0x047b }
            r0.setParameters(r8)     // Catch:{ RuntimeException -> 0x047b }
            r0 = r18
            android.hardware.Camera r0 = r0.A03     // Catch:{ RuntimeException -> 0x047b }
            r0.startPreview()     // Catch:{ RuntimeException -> 0x047b }
            r0 = r18
            android.hardware.Camera r1 = r0.A03     // Catch:{ RuntimeException -> 0x047b }
            android.hardware.Camera$AutoFocusCallback r0 = r0.A0F     // Catch:{ RuntimeException -> 0x047b }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x047b }
            goto L_0x048f
        L_0x0477:
            r0 = move-exception
            java.lang.String r15 = "qrview/startpreview/getParameters "
            goto L_0x047c
        L_0x047b:
            r0 = move-exception
        L_0x047c:
            com.whatsapp.util.Log.e(r15, r0)
            r0 = r18
            android.hardware.Camera r0 = r0.A03
            if (r0 == 0) goto L_0x0488
            r0.release()
        L_0x0488:
            r1 = 0
            r0 = r18
            r0.A03 = r1
            goto L_0x02a6
        L_0x048f:
            r0 = r18
            X.5Sf r0 = r0.A08
            if (r0 == 0) goto L_0x04a3
            r0 = r18
            android.os.Handler r3 = r0.A0H
            r2 = 24
            com.facebook.redex.RunnableRunnableShape19S0100000_I1_2 r1 = new com.facebook.redex.RunnableRunnableShape19S0100000_I1_2
            r1.<init>(r0, r2)
            r3.post(r1)
        L_0x04a3:
            r18.AcJ()
            return
        L_0x04a7:
            java.lang.Object r0 = r1.A00
            X.2np r0 = (X.C56542np) r0
            X.5Sf r0 = r0.A08
            r0.AVG()
            return
        L_0x04b1:
            java.lang.Object r0 = r1.A00
            X.4wq r0 = (X.C101174wq) r0
            com.obwhatsapp.qrcode.QrScannerViewV2 r0 = r0.A00
            X.5Sf r0 = r0.A05
            r0.AVG()
            return
        L_0x04bd:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment r2 = (com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment) r2
            boolean r0 = r2.A0e()
            if (r0 == 0) goto L_0x04d6
            X.02C r1 = r2.A0F()
            com.obwhatsapp.qrcode.QrEducationDialogFragment r0 = new com.obwhatsapp.qrcode.QrEducationDialogFragment
            r0.<init>()
            X.C453428a.A01(r0, r1)
            r0 = 1
            r2.A09 = r0
        L_0x04d6:
            r0 = 1
            r2.A0B = r0
            return
        L_0x04da:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment r1 = (com.obwhatsapp.qrcode.contactqr.QrScanCodeFragment) r1
            r0 = 0
            r1.A0C = r0
            r1.A1E()
            return
        L_0x04e5:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "AccountDefenceVerificationHelper/learn-more tapped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 604(0x25c, float:8.46E-43)
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x04f4:
            java.lang.Object r3 = r1.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.backup.google.SettingsGoogleDrive"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0509:
            java.lang.Object r0 = r1.A00
            X.36k r0 = (X.C608636k) r0
            X.0pt r2 = r0.A00
            r1 = 2131888450(0x7f120942, float:1.9411536E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x0517:
            java.lang.Object r0 = r1.A00
            X.36l r0 = (X.C608736l) r0
            X.0pt r2 = r0.A00
            r1 = 2131888451(0x7f120943, float:1.9411538E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x0525:
            java.lang.Object r0 = r1.A00
            X.51L r0 = (X.AnonymousClass51L) r0
            X.4F2 r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel.A01(r0)
            X.027 r1 = r0.A01
            r0 = 3
            X.C13680ns.A1O(r1, r0)
            return
        L_0x0537:
            java.lang.Object r0 = r1.A00
            X.51L r0 = (X.AnonymousClass51L) r0
            X.4F2 r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel.A01(r0)
            X.027 r1 = r0.A01
            r0 = 0
            X.C13680ns.A1O(r1, r0)
            return
        L_0x0549:
            java.lang.Object r5 = r1.A00
            com.obwhatsapp.settings.SettingsDataUsageActivity r5 = (com.obwhatsapp.settings.SettingsDataUsageActivity) r5
            X.0ua r0 = r5.A0G
            com.obwhatsapp.Statistics$Data r10 = r0.A00()
            r7 = 2131891515(0x7f12153b, float:1.9417752E38)
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            X.013 r8 = r5.A01
            long r2 = r10.A0E
            long r0 = r10.A0G
            long r2 = r2 + r0
            long r0 = r10.A0M
            long r2 = r2 + r0
            long r0 = r10.A0D
            long r2 = r2 + r0
            long r0 = r10.A0J
            long r2 = r2 + r0
            java.lang.String r0 = X.AnonymousClass2GQ.A04(r8, r2)
            java.lang.String r0 = r8.A0G(r0)
            r8 = 0
            java.lang.String r6 = X.C13680ns.A0d(r5, r0, r6, r8, r7)
            r7 = 2131891514(0x7f12153a, float:1.941775E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            X.013 r9 = r5.A01
            long r2 = r10.A01
            long r0 = r10.A03
            long r2 = r2 + r0
            long r0 = r10.A0B
            long r2 = r2 + r0
            long r0 = r10.A00
            long r2 = r2 + r0
            long r0 = r10.A08
            long r2 = r2 + r0
            java.lang.String r0 = X.AnonymousClass2GQ.A04(r9, r2)
            java.lang.String r0 = r9.A0G(r0)
            java.lang.String r1 = X.C13680ns.A0d(r5, r0, r4, r8, r7)
            X.013 r0 = r5.A01
            java.lang.String r1 = X.AnonymousClass1ZW.A07(r0, r6, r1)
            android.widget.TextView r0 = r5.A06
            r0.setText(r1)
            return
        L_0x05a3:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.settings.SettingsDataUsageViewModel r0 = (com.obwhatsapp.settings.SettingsDataUsageViewModel) r0
            com.obwhatsapp.settings.SettingsDataUsageViewModel.A01(r0)
            return
        L_0x05ab:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.settings.SettingsNetworkUsage r1 = (com.obwhatsapp.settings.SettingsNetworkUsage) r1
            r0 = 0
            r1.A36(r0)
            return
        L_0x05b4:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0 r0 = (com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0) r0
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.settings.SettingsPrivacy r2 = (com.obwhatsapp.settings.SettingsPrivacy) r2
            r0 = 1
            r2.A0s = r0
            java.util.Set r1 = r2.A0r
            r1.clear()
            X.01Y r0 = r2.A0O
            java.util.Set r0 = r0.A09()
            r1.addAll(r0)
            r0 = 0
            r2.A0s = r0
            X.0pt r1 = r2.A05
            r0 = 48
            X.C14870pt.A01(r1, r2, r0)
            return
        L_0x05d8:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.settings.SettingsPrivacy r0 = (com.obwhatsapp.settings.SettingsPrivacy) r0
            r0.A38()
            return
        L_0x05e0:
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxSObserverShape275S0100000_2_I0 r0 = (com.facebook.redex.IDxSObserverShape275S0100000_2_I0) r0
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.settings.SettingsPrivacy r0 = (com.obwhatsapp.settings.SettingsPrivacy) r0
            r0.A39()
            return
        L_0x05ec:
            android.view.SurfaceHolder r0 = r3.A0J     // Catch:{ IOException | RuntimeException -> 0x05fe }
            r1.setPreviewDisplay(r0)     // Catch:{ IOException | RuntimeException -> 0x05fe }
            android.os.Handler r2 = r3.A04     // Catch:{ IOException | RuntimeException -> 0x05fe }
            r1 = 20
            com.facebook.redex.RunnableRunnableShape19S0100000_I1_2 r0 = new com.facebook.redex.RunnableRunnableShape19S0100000_I1_2     // Catch:{ IOException | RuntimeException -> 0x05fe }
            r0.<init>(r3, r1)     // Catch:{ IOException | RuntimeException -> 0x05fe }
            r2.post(r0)     // Catch:{ IOException | RuntimeException -> 0x05fe }
            return
        L_0x05fe:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A03
            r0.release()
            r3.A03 = r4
            java.lang.String r0 = "qrview/startcamera "
            goto L_0x0618
        L_0x0609:
            r0.reconnect()     // Catch:{ IOException -> 0x060d }
            goto L_0x061f
        L_0x060d:
            r1 = move-exception
            android.hardware.Camera r0 = r3.A03
            r0.release()
            r0 = 0
            r3.A03 = r0
            java.lang.String r0 = "qrview/startcamera error reconnecting camera"
        L_0x0618:
            com.whatsapp.util.Log.e(r0, r1)
            r3.A00()
            return
        L_0x061f:
            return
        L_0x0620:
            android.hardware.Camera$AutoFocusCallback r0 = r0.A0F     // Catch:{ RuntimeException -> 0x0626 }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x0626 }
            return
        L_0x0626:
            r1 = move-exception
            java.lang.String r0 = "qrview/onAutoFocus error:"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x062d:
            r0.stopPreview()     // Catch:{ Exception -> 0x0631 }
            goto L_0x0637
        L_0x0631:
            r1 = move-exception
            java.lang.String r0 = "qrview/stopcamera error stopping camera preview"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0637:
            android.hardware.Camera r0 = r2.A03     // Catch:{ Exception -> 0x063d }
            r0.release()     // Catch:{ Exception -> 0x063d }
            goto L_0x0643
        L_0x063d:
            r1 = move-exception
            java.lang.String r0 = "qrview/stopcamera error releaseing camera"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0643:
            r0 = 0
            r2.A03 = r0
            return
        L_0x0647:
            r2.removeCallbacks(r0)
        L_0x064a:
            android.hardware.Camera r0 = r2.A03     // Catch:{ RuntimeException -> 0x0657 }
            r0.cancelAutoFocus()     // Catch:{ RuntimeException -> 0x0657 }
            android.hardware.Camera r1 = r2.A03     // Catch:{ RuntimeException -> 0x0657 }
            android.hardware.Camera$AutoFocusCallback r0 = r2.A0F     // Catch:{ RuntimeException -> 0x0657 }
            r1.autoFocus(r0)     // Catch:{ RuntimeException -> 0x0657 }
            return
        L_0x0657:
            r1 = move-exception
            java.lang.String r0 = "qrview/autofocus failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape19S0100000_I1_2.run():void");
    }
}
