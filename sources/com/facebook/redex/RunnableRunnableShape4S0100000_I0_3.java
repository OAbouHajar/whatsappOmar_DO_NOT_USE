package com.facebook.redex;

public class RunnableRunnableShape4S0100000_I0_3 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape4S0100000_I0_3(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x035b, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x035e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0388, code lost:
        r4.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x038b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0623, code lost:
        if (r2 != Integer.MAX_VALUE) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0655, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0658, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r1 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f2, code lost:
        r1.AWT(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1.A0Q != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r0.A0J(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x0249;
                case 1: goto L_0x0019;
                case 2: goto L_0x0034;
                case 3: goto L_0x0043;
                case 4: goto L_0x026d;
                case 5: goto L_0x027f;
                case 6: goto L_0x008e;
                case 7: goto L_0x02bc;
                case 8: goto L_0x009b;
                case 9: goto L_0x030d;
                case 10: goto L_0x0328;
                case 11: goto L_0x033e;
                case 12: goto L_0x035f;
                case 13: goto L_0x0373;
                case 14: goto L_0x038e;
                case 15: goto L_0x0398;
                case 16: goto L_0x03be;
                case 17: goto L_0x03f0;
                case 18: goto L_0x03f8;
                case 19: goto L_0x04d7;
                case 20: goto L_0x04fa;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00ca;
                case 23: goto L_0x0508;
                case 24: goto L_0x0510;
                case 25: goto L_0x0518;
                case 26: goto L_0x00f6;
                case 27: goto L_0x0104;
                case 28: goto L_0x010e;
                case 29: goto L_0x0523;
                case 30: goto L_0x0188;
                case 31: goto L_0x053c;
                case 32: goto L_0x01b2;
                case 33: goto L_0x0552;
                case 34: goto L_0x0565;
                case 35: goto L_0x057c;
                case 36: goto L_0x058d;
                case 37: goto L_0x0595;
                case 38: goto L_0x059d;
                case 39: goto L_0x05ab;
                case 40: goto L_0x062a;
                case 41: goto L_0x0638;
                case 42: goto L_0x0659;
                case 43: goto L_0x066c;
                case 44: goto L_0x0676;
                case 45: goto L_0x0219;
                case 46: goto L_0x0243;
                case 47: goto L_0x067e;
                case 48: goto L_0x069c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A00
            X.26h r0 = (X.C449326h) r0
            X.26F r0 = r0.A00
        L_0x000b:
            X.1px r1 = r0.A06
            if (r1 == 0) goto L_0x0018
            boolean r1 = r1.A0Q
            if (r1 != 0) goto L_0x0018
            r1 = 8
            r0.A0J(r1)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r2 = r13.A00
            X.2Xb r2 = (X.C49992Xb) r2
            X.1Gf r1 = r2.A04
            com.whatsapp.jid.UserJid r0 = r2.A06
            java.util.concurrent.Future r0 = r1.A04(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0018 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0018 }
            X.027 r0 = r2.A00     // Catch:{ Exception -> 0x0018 }
            if (r0 == 0) goto L_0x0018
            r0.A09(r1)     // Catch:{ Exception -> 0x0018 }
            goto L_0x06a9
        L_0x0034:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity r1 = (com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity) r1
            X.25l r0 = r1.A06
            if (r0 == 0) goto L_0x0018
            r0.A00()
            r0 = 0
            r1.A06 = r0
            return
        L_0x0043:
            java.lang.Object r6 = r13.A00
            com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity r6 = (com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity) r6
            X.25l r2 = r6.A06
            if (r2 == 0) goto L_0x0018
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167215(0x7f0707ef, float:1.7948697E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r5 = (float) r0
            android.widget.TextView r4 = r2.A00
            X.013 r3 = r2.A01
            android.content.res.Resources r2 = r6.getResources()
            r1 = 2131232534(0x7f080716, float:1.808118E38)
            r0 = 0
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00X.A04(r0, r2, r1)
            X.25m r0 = new X.25m
            r0.<init>(r1, r3)
            r4.setBackground(r0)
            r0 = 0
            r4.setVisibility(r0)
            r4.setTranslationY(r5)
            r0 = 0
            r4.setAlpha(r0)
            android.view.ViewPropertyAnimator r1 = r4.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            r0 = 320(0x140, double:1.58E-321)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            return
        L_0x008e:
            java.lang.Object r3 = r13.A00
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0018 }
            r3.get(r1, r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x06aa
        L_0x009b:
            java.lang.Object r0 = r13.A00
            X.25o r0 = (X.C447925o) r0
            X.25q r2 = r0.A01
            X.25r r0 = r0.A04
            com.whatsapp.jid.UserJid r1 = r0.A03
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r0 = r2.A07
            com.whatsapp.jid.UserJid r0 = r0.A06
            boolean r0 = X.C34901l3.A00(r0, r1)
            if (r0 == 0) goto L_0x0018
            r2.A01(r1)
            return
        L_0x00b3:
            java.lang.Object r2 = r13.A00
            X.25z r2 = (X.C448725z) r2
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x00c4
            X.0pt r1 = r2.A03
            android.app.Activity r0 = r2.A01
            X.0pS r0 = (X.C14600pS) r0
            r1.A0C(r0)
        L_0x00c4:
            X.1ZI r1 = r2.A04
            if (r1 == 0) goto L_0x0018
            r0 = 0
            goto L_0x00f2
        L_0x00ca:
            java.lang.Object r2 = r13.A00
            X.25z r2 = (X.C448725z) r2
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x00db
            X.0pt r1 = r2.A03
            android.app.Activity r0 = r2.A01
            X.0pS r0 = (X.C14600pS) r0
            r1.A0C(r0)
        L_0x00db:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x00ec
            X.0ub r1 = r2.A08
            X.1ZJ r0 = r2.A06
            com.whatsapp.jid.UserJid r0 = r0.A04
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A08(r0)
        L_0x00ec:
            X.1ZI r1 = r2.A04
            if (r1 == 0) goto L_0x0018
            boolean r0 = r2.A00
        L_0x00f2:
            r1.AWT(r0)
            return
        L_0x00f6:
            java.lang.Object r1 = r13.A00
            X.260 r1 = (X.AnonymousClass260) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0018
            X.261 r0 = r1.A03
            r0.AVc()
            return
        L_0x0104:
            java.lang.Object r0 = r13.A00
            X.262 r0 = (X.AnonymousClass262) r0
            if (r0 == 0) goto L_0x0018
            r0.A00()
            return
        L_0x010e:
            java.lang.Object r0 = r13.A00
            X.263 r0 = (X.AnonymousClass263) r0
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r3 = r0.A00
            X.266 r0 = r3.A08
            if (r0 == 0) goto L_0x0018
            X.1Kc r4 = r3.A06
            boolean r2 = r4.A02
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r1 = "pt"
            boolean r0 = r0.equals(r1)
            if (r2 == r0) goto L_0x0140
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = r0.equals(r1)
            r4.A02 = r0
            java.util.List r0 = r4.A00()
            r4.A01 = r0
        L_0x0140:
            java.util.List r1 = r4.A01
            int r0 = r4.A00
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r4.A00
            int r1 = r0 + 1
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            int r1 = r1 % r0
            r4.A00 = r1
            java.lang.String r0 = X.AnonymousClass266.A0H
            X.AnonymousClass266.A0F = r0
            java.lang.String r0 = X.AnonymousClass266.A0G
            X.AnonymousClass266.A0H = r0
            X.AnonymousClass266.A0G = r2
            X.266 r1 = r3.A08
            androidx.appcompat.widget.SearchView r0 = r1.A06
            if (r0 == 0) goto L_0x0018
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.A0k
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0018
            android.animation.ObjectAnimator r0 = r1.A02
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A03
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A01
            r0.start()
            android.animation.ObjectAnimator r0 = r1.A00
            r0.start()
            return
        L_0x0188:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r1 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r1
            X.269 r0 = r1.A0M
            if (r0 != 0) goto L_0x019e
            java.lang.String r0 = "viewModel"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x019e:
            X.1cy r0 = r0.A0f
            java.lang.Object r0 = r0.A01()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0018
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0018
            r1.A37()
            return
        L_0x01b2:
            java.lang.Object r4 = r13.A00
            X.26A r4 = (X.AnonymousClass26A) r4
            X.1Ko r0 = r4.A04
            X.26B r0 = r0.A01()
            if (r0 == 0) goto L_0x01d5
            r4.A0D(r0)
        L_0x01c1:
            X.1dt r1 = r4.A0C()
            java.lang.Object r0 = r4.A01()
            if (r0 == 0) goto L_0x01d1
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0018
        L_0x01d1:
            r4.A09(r1)
            return
        L_0x01d5:
            X.1Kb r0 = r4.A03
            X.1I2 r0 = r0.A02
            android.content.SharedPreferences r2 = r0.A00()
            java.lang.String r1 = "location_access_granted"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x01fc
            X.0sj r0 = r4.A07
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x01fc
            r0 = 1
            r4.A00 = r0
            android.os.Handler r3 = r4.A02
            java.lang.Runnable r2 = r4.A09
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.postDelayed(r2, r0)
            goto L_0x01c1
        L_0x01fc:
            X.0wG r2 = r4.A05
            X.26B r0 = r2.A00()
            r4.A01 = r0
            java.lang.String r0 = "country_default"
            boolean r0 = r0.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0216
            r0 = 0
            boolean r0 = r2.A02(r0)
            r1 = 4
            if (r0 == 0) goto L_0x0216
            r1 = 7
        L_0x0216:
            r4.A00 = r1
            goto L_0x01c1
        L_0x0219:
            java.lang.Object r1 = r13.A00
            X.26C r1 = (X.AnonymousClass26C) r1
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0018
            com.obwhatsapp.calling.callgrid.view.PipViewContainer r3 = r1.A0J
            X.26E r2 = r3.A04
            X.1px r0 = r2.A06
            r1 = 0
            if (r0 == 0) goto L_0x023c
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x023c
            android.view.View r0 = r2.A0H
            r0.performHapticFeedback(r1)
            X.26E r0 = r3.A04
            android.view.View r0 = r0.A0H
            r0.performLongClick()
        L_0x023c:
            com.obwhatsapp.calling.callgrid.view.PipViewContainer.A00(r3, r1)
            r3.A02()
            return
        L_0x0243:
            java.lang.Object r0 = r13.A00
            X.26F r0 = (X.AnonymousClass26F) r0
            goto L_0x000b
        L_0x0249:
            java.lang.Object r1 = r13.A00
            X.2j8 r1 = (X.C55242j8) r1
            r1.A02()
            X.0wz r0 = r1.A01
            X.2j9 r5 = r1.A02
            X.0pd r7 = r0.A05
            X.0ua r3 = r0.A00
            X.0rz r6 = r0.A04
            X.01D r9 = r0.A07
            X.01J r10 = r0.A08
            X.01J r11 = r0.A0E
            X.0uc r4 = r0.A01
            X.168 r8 = r0.A06
            X.2jA r2 = new X.2jA
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2.Aah(r1)
            return
        L_0x026d:
            java.lang.Object r0 = r13.A00
            X.1fh r0 = (X.C32131fh) r0
            X.156 r4 = r0.A0J
            com.whatsapp.jid.UserJid r2 = r0.A0K
            java.lang.String r1 = "catalog_link"
            r0 = 0
            X.26U r3 = new X.26U
            r3.<init>(r2, r1, r0)
            goto L_0x0388
        L_0x027f:
            java.lang.Object r5 = r13.A00
            com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector r5 = (com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector) r5
            com.obwhatsapp.WaImageButton r0 = r5.A0G
            int r4 = r0.getMeasuredWidth()
            int r3 = r5.getMeasuredWidth()
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r3
            r0 = 1
            r1[r0] = r4
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r1)
            r5.A02 = r2
            r1 = 0
            com.facebook.redex.IDxUListenerShape1S0102000_2_I1 r0 = new com.facebook.redex.IDxUListenerShape1S0102000_2_I1
            r0.<init>(r5, r3, r4, r1)
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r1 = r5.A02
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r5.A02
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r5.A02
            r0.start()
            return
        L_0x02bc:
            java.lang.Object r1 = r13.A00
            X.25o r1 = (X.C447925o) r1
            X.1Oz r0 = r1.A05
            X.25r r4 = r1.A04
            X.1Oy r0 = r0.A00
            X.0un r0 = r0.A00
            X.0sX r2 = r0.A01
            X.01J r0 = r2.A05
            java.lang.Object r7 = r0.get()
            X.0pd r7 = (X.C14710pd) r7
            X.01J r0 = r2.APW
            java.lang.Object r9 = r0.get()
            X.0vR r9 = (X.C17660vR) r9
            X.01J r0 = r2.AN9
            java.lang.Object r3 = r0.get()
            X.0ua r3 = (X.C17130ua) r3
            X.01J r0 = r2.AQB
            java.lang.Object r5 = r0.get()
            X.0tz r5 = (X.C16980tz) r5
            X.01J r0 = r2.AQh
            java.lang.Object r6 = r0.get()
            X.0rz r6 = (X.C15860rz) r6
            X.01J r0 = r2.AQV
            X.01D r10 = X.C17270uo.A00(r0)
            X.01J r11 = r2.ADQ
            X.01J r12 = r2.ADR
            X.01J r0 = r2.AAi
            java.lang.Object r8 = r0.get()
            X.168 r8 = (X.AnonymousClass168) r8
            X.26V r2 = new X.26V
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.Aah(r1)
            return
        L_0x030d:
            java.lang.Object r0 = r13.A00
            X.26W r0 = (X.AnonymousClass26W) r0
            X.26Y r3 = r0.A01
            if (r3 == 0) goto L_0x0324
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "delivery failure"
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r3.AQT(r0)
        L_0x0324:
            java.lang.String r0 = "CreateOrderProtocol/onDeliveryFailure"
            goto L_0x0655
        L_0x0328:
            java.lang.Object r1 = r13.A00
            X.26W r1 = (X.AnonymousClass26W) r1
            X.26j r0 = r1.A00
            if (r0 != 0) goto L_0x0333
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionSucceeded/Failed to repeat request. It is null"
            goto L_0x035b
        L_0x0333:
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionSucceeded/retrying request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.26j r0 = r1.A00
            r1.A02(r0)
            return
        L_0x033e:
            java.lang.Object r4 = r13.A00
            X.26W r4 = (X.AnonymousClass26W) r4
            X.26Y r3 = r4.A01
            if (r3 == 0) goto L_0x0356
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "Failed to create direct connection info"
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r3.AQT(r0)
        L_0x0356:
            r0 = 0
            r4.A00 = r0
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionError/Failed to create direct connection info"
        L_0x035b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x035f:
            java.lang.Object r2 = r13.A00
            X.26k r2 = (X.C449626k) r2
            X.0uc r0 = r2.A01
            com.whatsapp.jid.UserJid r1 = r2.A03
            X.235 r0 = r0.A0A
            X.1mD r1 = r0.A00(r1)
            X.027 r0 = r2.A00
            r0.A09(r1)
            return
        L_0x0373:
            java.lang.Object r0 = r13.A00
            X.26l r0 = (X.C449726l) r0
            X.156 r4 = r0.A0e
            com.whatsapp.jid.UserJid r2 = r0.A0i
            X.1mM r0 = r0.A0Q
            if (r0 == 0) goto L_0x038c
            java.lang.String r1 = r0.A0D
        L_0x0381:
            java.lang.String r0 = "product_link"
            X.26U r3 = new X.26U
            r3.<init>(r2, r0, r1)
        L_0x0388:
            r4.A01(r3)
            return
        L_0x038c:
            r1 = 0
            goto L_0x0381
        L_0x038e:
            java.lang.Object r0 = r13.A00
            X.26l r0 = (X.C449726l) r0
            X.1fz r0 = r0.A0B
            r0.A03()
            return
        L_0x0398:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.blocklist.BlockList r4 = (com.obwhatsapp.blocklist.BlockList) r4
            X.01Y r0 = r4.A01
            java.util.Set r1 = r0.A09()
            java.lang.Object r3 = r4.A0N
            monitor-enter(r3)
            java.util.Set r0 = r4.A0Q     // Catch:{ all -> 0x03bb }
            r0.clear()     // Catch:{ all -> 0x03bb }
            r0.addAll(r1)     // Catch:{ all -> 0x03bb }
            X.0pt r2 = r4.A05     // Catch:{ all -> 0x03bb }
            r1 = 18
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3     // Catch:{ all -> 0x03bb }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x03bb }
            r2.A0K(r0)     // Catch:{ all -> 0x03bb }
            monitor-exit(r3)     // Catch:{ all -> 0x03bb }
            return
        L_0x03bb:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03bb }
            throw r0
        L_0x03be:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.blocklist.BlockList r4 = (com.obwhatsapp.blocklist.BlockList) r4
            X.01Y r0 = r4.A01
            java.util.Set r1 = r0.A09()
            java.lang.Object r3 = r4.A0N
            monitor-enter(r3)
            java.util.Set r0 = r4.A0Q     // Catch:{ all -> 0x03ed }
            r0.clear()     // Catch:{ all -> 0x03ed }
            r0.addAll(r1)     // Catch:{ all -> 0x03ed }
            X.0pt r2 = r4.A05     // Catch:{ all -> 0x03ed }
            r1 = 18
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3     // Catch:{ all -> 0x03ed }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x03ed }
            r2.A0K(r0)     // Catch:{ all -> 0x03ed }
            X.0pt r2 = r4.A05     // Catch:{ all -> 0x03ed }
            r1 = 17
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3     // Catch:{ all -> 0x03ed }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x03ed }
            r2.A0K(r0)     // Catch:{ all -> 0x03ed }
            monitor-exit(r3)     // Catch:{ all -> 0x03ed }
            return
        L_0x03ed:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03ed }
            throw r0
        L_0x03f0:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.blocklist.BlockList r0 = (com.obwhatsapp.blocklist.BlockList) r0
            r0.A36()
            return
        L_0x03f8:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.blocklist.BlockList r4 = (com.obwhatsapp.blocklist.BlockList) r4
            java.util.ArrayList r3 = r4.A0O
            r3.clear()
            java.util.ArrayList r5 = r4.A0P
            r5.clear()
            java.lang.Object r6 = r4.A0N
            monitor-enter(r6)
            java.util.Set r0 = r4.A0Q     // Catch:{ all -> 0x04d4 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x04d4 }
        L_0x040f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x04d4 }
            if (r0 == 0) goto L_0x0425
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x04d4 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x04d4 }
            X.0sG r0 = r4.A04     // Catch:{ all -> 0x04d4 }
            X.0sH r0 = r0.A0A(r1)     // Catch:{ all -> 0x04d4 }
            r5.add(r0)     // Catch:{ all -> 0x04d4 }
            goto L_0x040f
        L_0x0425:
            monitor-exit(r6)     // Catch:{ all -> 0x04d4 }
            X.0sP r2 = r4.A06
            X.013 r1 = r4.A01
            X.26p r0 = new X.26p
            r0.<init>(r2, r1)
            java.util.Collections.sort(r5, r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r5.iterator()
        L_0x0445:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0467
            java.lang.Object r5 = r8.next()
            X.0sH r5 = (X.C16010sH) r5
            boolean r1 = r5.A0H()
            X.26q r0 = new X.26q
            if (r1 == 0) goto L_0x0460
            r0.<init>(r5)
            r6.add(r0)
            goto L_0x0445
        L_0x0460:
            r0.<init>(r5)
            r7.add(r0)
            goto L_0x0445
        L_0x0467:
            X.19d r0 = r4.A0E
            if (r0 == 0) goto L_0x0498
            boolean r0 = r0.AIp()
            if (r0 == 0) goto L_0x0498
            X.19d r0 = r4.A0E
            java.util.Set r1 = r0.AA6()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Collections.sort(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0483:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0498
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            X.26s r0 = new X.26s
            r0.<init>(r1)
            r2.add(r0)
            goto L_0x0483
        L_0x0498:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x04a7
            r1 = 0
            X.26t r0 = new X.26t
            r0.<init>(r1)
            r3.add(r0)
        L_0x04a7:
            r3.addAll(r7)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x04bc
            r1 = 1
            X.26t r0 = new X.26t
            r0.<init>(r1)
            r3.add(r0)
            r3.addAll(r6)
        L_0x04bc:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x04cb
            r1 = 2
            X.26t r0 = new X.26t
            r0.<init>(r1)
            r3.add(r0)
        L_0x04cb:
            r3.addAll(r2)
            X.26u r0 = r4.A00
            r0.notifyDataSetChanged()
            return
        L_0x04d4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x04d4 }
            throw r0
        L_0x04d7:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.blocklist.BlockList r4 = (com.obwhatsapp.blocklist.BlockList) r4
            X.01Y r0 = r4.A01
            java.util.Set r1 = r0.A09()
            java.lang.Object r3 = r4.A0N
            monitor-enter(r3)
            java.util.Set r0 = r4.A0Q     // Catch:{ all -> 0x04f7 }
            r0.addAll(r1)     // Catch:{ all -> 0x04f7 }
            X.0pt r2 = r4.A05     // Catch:{ all -> 0x04f7 }
            r1 = 18
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3     // Catch:{ all -> 0x04f7 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x04f7 }
            r2.A0K(r0)     // Catch:{ all -> 0x04f7 }
            monitor-exit(r3)     // Catch:{ all -> 0x04f7 }
            return
        L_0x04f7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04f7 }
            throw r0
        L_0x04fa:
            java.lang.Object r0 = r13.A00
            X.01Y r0 = (X.AnonymousClass01Y) r0
            X.15K r1 = r0.A0B
            java.util.Set r0 = r0.A08()
            r1.A00(r0)
            return
        L_0x0508:
            java.lang.Object r0 = r13.A00
            X.22p r0 = (X.C440622p) r0
            r0.ALw()
            return
        L_0x0510:
            java.lang.Object r0 = r13.A00
            X.22p r0 = (X.C440622p) r0
            r0.onSuccess()
            return
        L_0x0518:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment r0 = (com.obwhatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            r0 = 0
            r1.A0Z(r0)
            return
        L_0x0523:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r1 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r1
            android.view.View r0 = r1.A02
            if (r0 != 0) goto L_0x0538
            java.lang.String r0 = "businessProfileSheet"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0538:
            r1.updateMapPadding(r0)
            return
        L_0x053c:
            java.lang.Object r2 = r13.A00
            X.26A r2 = (X.AnonymousClass26A) r2
            r0 = 3
            r2.A00 = r0
            android.os.Handler r1 = r2.A02
            java.lang.Runnable r0 = r2.A09
            r1.removeCallbacks(r0)
            X.1dt r0 = r2.A0C()
            r2.A09(r0)
            return
        L_0x0552:
            java.lang.Object r1 = r13.A00
            X.26x r1 = (X.C450626x) r1
            X.26y r0 = r1.A04
            r0.A01()
            X.027 r1 = r1.A00
            java.util.List r0 = r0.A00()
            r1.A09(r0)
            return
        L_0x0565:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r3 = (com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r3
            java.util.List r2 = r3.A09()
            r1 = 1
            X.2jC r0 = new X.2jC
            r0.<init>(r1)
            r2.add(r0)
            X.026 r0 = r3.A0G
            r0.A09(r2)
            return
        L_0x057c:
            java.lang.Object r1 = r13.A00
            X.1kj r1 = (X.C34701kj) r1
            r0 = 0
            r1.A02 = r0
            r0 = 59000(0xe678, float:8.2677E-41)
            r1.A01(r0)
            r1.A04()
            return
        L_0x058d:
            java.lang.Object r0 = r13.A00
            X.2jD r0 = (X.C55282jD) r0
            X.C55282jD.A02(r0)
            return
        L_0x0595:
            java.lang.Object r0 = r13.A00
            X.2jD r0 = (X.C55282jD) r0
            X.C55282jD.A03(r0)
            return
        L_0x059d:
            java.lang.Object r0 = r13.A00
            X.1C0 r0 = (X.AnonymousClass1C0) r0
            X.0wP r0 = r0.A01
            boolean r0 = r0.A0B()
            com.whatsapp.voipcalling.Voip.updateNetworkRestrictions(r0)
            return
        L_0x05ab:
            java.lang.Object r0 = r13.A00
            X.1C0 r0 = (X.AnonymousClass1C0) r0
            X.0wP r0 = r0.A01
            r4 = 1
            int r0 = r0.A04(r4)
            if (r0 != 0) goto L_0x05bd
            r4 = 3
        L_0x05b9:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x05c1
        L_0x05bd:
            if (r0 != r4) goto L_0x05b9
            r4 = 2
            goto L_0x05b9
        L_0x05c1:
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x061a }
            java.util.ArrayList r1 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x061a }
            r0 = 3
            if (r4 == r0) goto L_0x0625
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x061a }
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x05d3:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x061f }
            if (r0 == 0) goto L_0x0623
            java.lang.Object r5 = r6.next()     // Catch:{ Exception -> 0x061f }
            java.net.NetworkInterface r5 = (java.net.NetworkInterface) r5     // Catch:{ Exception -> 0x061f }
            boolean r0 = r5.isUp()     // Catch:{ Exception -> 0x061f }
            if (r0 == 0) goto L_0x05d3
            boolean r0 = r5.isLoopback()     // Catch:{ Exception -> 0x061f }
            if (r0 != 0) goto L_0x05d3
            boolean r0 = r5.isVirtual()     // Catch:{ Exception -> 0x061f }
            if (r0 != 0) goto L_0x05d3
            java.lang.String r0 = r5.getName()     // Catch:{ Exception -> 0x061f }
            if (r0 == 0) goto L_0x05d3
            java.lang.String r1 = r5.getName()     // Catch:{ Exception -> 0x061f }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x061f }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ Exception -> 0x061f }
            java.lang.String r0 = "wlan"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x061f }
            if (r0 == 0) goto L_0x060e
            r0 = 2
            if (r4 == r0) goto L_0x0611
            goto L_0x05d3
        L_0x060e:
            r0 = 1
            if (r4 != r0) goto L_0x05d3
        L_0x0611:
            int r0 = r5.getMTU()     // Catch:{ Exception -> 0x061f }
            int r2 = java.lang.Math.min(r2, r0)     // Catch:{ Exception -> 0x061f }
            goto L_0x05d3
        L_0x061a:
            r0 = move-exception
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0620
        L_0x061f:
            r0 = move-exception
        L_0x0620:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0623:
            if (r2 != r3) goto L_0x0626
        L_0x0625:
            r2 = 0
        L_0x0626:
            com.whatsapp.voipcalling.Voip.updateNetworkMedium(r4, r2)
            return
        L_0x062a:
            java.lang.Object r1 = r13.A00
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            java.lang.Object r0 = X.AnonymousClass26Z.A0I
            android.media.AudioManager$OnAudioFocusChangeListener r0 = (android.media.AudioManager.OnAudioFocusChangeListener) r0
            r1.abandonAudioFocus(r0)
            java.lang.String r0 = "abandon audio focus"
            goto L_0x0655
        L_0x0638:
            java.lang.Object r3 = r13.A00
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            java.lang.Object r2 = X.AnonymousClass26Z.A0I
            android.media.AudioManager$OnAudioFocusChangeListener r2 = (android.media.AudioManager.OnAudioFocusChangeListener) r2
            r1 = 0
            r0 = 2
            int r2 = r3.requestAudioFocus(r2, r1, r0)
            java.lang.String r1 = "result of audio focus for voice call: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x0655:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0659:
            java.lang.Object r0 = r13.A00
            X.26b r0 = (X.C448926b) r0
            java.util.Set r1 = r0.A0G
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r0 = (com.whatsapp.jid.UserJid[]) r0
            com.whatsapp.voipcalling.Voip.updateParticipantsRxSubscription(r0)
            return
        L_0x066c:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = (com.obwhatsapp.calling.callgrid.view.CallGrid) r0
            X.26d r0 = r0.A03
            r0.A01()
            return
        L_0x0676:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.calling.callgrid.view.PipViewContainer r0 = (com.obwhatsapp.calling.callgrid.view.PipViewContainer) r0
            r0.A02()
            return
        L_0x067e:
            java.lang.Object r3 = r13.A00
            X.26F r3 = (X.AnonymousClass26F) r3
            X.1px r1 = r3.A06
            if (r1 == 0) goto L_0x069a
            boolean r0 = r1.A0E
            if (r0 != 0) goto L_0x069a
            android.graphics.Bitmap r2 = r1.A04
        L_0x068c:
            android.widget.ImageView r1 = r3.A0F
            r1.setImageBitmap(r2)
            r0 = 0
            if (r2 != 0) goto L_0x0696
            r0 = 8
        L_0x0696:
            r1.setVisibility(r0)
            return
        L_0x069a:
            r2 = 0
            goto L_0x068c
        L_0x069c:
            java.lang.Object r0 = r13.A00
            X.26e r0 = (X.C449026e) r0
            X.26F r0 = r0.A01
            android.view.View r1 = r0.A0C
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x06a9:
            return
        L_0x06aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape4S0100000_I0_3.run():void");
    }
}
