package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape33S0200000_3_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape33S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0316, code lost:
        r3 = new X.C114125nA(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x031b, code lost:
        r3.A05 = r1;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x031d, code lost:
        r0 = r2.A09;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0336, code lost:
        r0.A0B(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0339, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r31) {
        /*
            r30 = this;
            r3 = r30
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0668;
                case 1: goto L_0x00d5;
                case 2: goto L_0x0026;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00ab;
                case 5: goto L_0x0097;
                case 6: goto L_0x0085;
                case 7: goto L_0x060c;
                case 8: goto L_0x05fa;
                case 9: goto L_0x05ca;
                case 10: goto L_0x05ba;
                case 11: goto L_0x0599;
                case 12: goto L_0x0510;
                case 13: goto L_0x04fb;
                case 14: goto L_0x0482;
                case 15: goto L_0x0473;
                case 16: goto L_0x0467;
                case 17: goto L_0x0027;
                case 18: goto L_0x03dd;
                case 19: goto L_0x03bf;
                case 20: goto L_0x03a9;
                case 21: goto L_0x0344;
                case 22: goto L_0x033a;
                case 23: goto L_0x0007;
                case 24: goto L_0x0007;
                case 25: goto L_0x0320;
                case 26: goto L_0x030c;
                case 27: goto L_0x0301;
                case 28: goto L_0x028d;
                case 29: goto L_0x0278;
                case 30: goto L_0x0266;
                case 31: goto L_0x0256;
                case 32: goto L_0x010f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A00
            X.5eb r4 = (X.C110655eb) r4
            java.lang.Object r3 = r3.A01
            X.5hT r3 = (X.C111825hT) r3
            X.5wq r9 = r4.A0S
            java.lang.String r2 = "FB"
            java.lang.String r10 = "KYC"
            X.50C r0 = X.C110115dX.A0R(r9, r2, r10)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r1 = r0.A05
            boolean r0 = r1.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00f6
            r4.A05(r3, r1)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.payments.ui.PaymentSettingsFragment r4 = (com.obwhatsapp.payments.ui.PaymentSettingsFragment) r4
            java.lang.Object r3 = r3.A01
            X.5wk r3 = (X.C119225wk) r3
            int r1 = r3.A01
            r0 = 1
            if (r1 != r0) goto L_0x007d
            X.0wS r0 = r4.A0h
            X.1yJ r2 = X.C110115dX.A0L(r0)
            if (r2 == 0) goto L_0x0059
            X.0pd r1 = r2.A07
            r0 = 979(0x3d3, float:1.372E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0059
            X.00l r0 = r4.A0D()
            X.02l r0 = r2.A08(r0)
            r0.show()
        L_0x0051:
            X.69E r0 = r3.A06
            if (r0 == 0) goto L_0x0026
            r0.APG()
            return
        L_0x0059:
            X.5eg r0 = r4.A0u
            boolean r0 = r0.A0G()
            java.lang.String r1 = "incentive_banner"
            if (r0 != 0) goto L_0x0067
            r4.A1W(r1)
            goto L_0x0051
        L_0x0067:
            X.19Y r0 = r4.A0L
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0079
            r1 = 2131890620(0x7f1211bc, float:1.9415937E38)
            r0 = 2131890619(0x7f1211bb, float:1.9415935E38)
            com.obwhatsapp.RequestPermissionActivity.A0O(r4, r1, r0)
            goto L_0x0051
        L_0x0079:
            r4.A1X(r1)
            goto L_0x0051
        L_0x007d:
            java.lang.String r0 = r4.A1P()
            r4.A1W(r0)
            goto L_0x0051
        L_0x0085:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.obwhatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r1 = r3.A01
            com.obwhatsapp.payments.ui.PaymentBottomSheet r1 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r1
            if (r1 == 0) goto L_0x0026
            X.69Z r0 = r0.A0M
            if (r0 == 0) goto L_0x0026
            r0.AZ9(r1)
            return
        L_0x0097:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.obwhatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r2 = r3.A01
            com.obwhatsapp.payments.ui.PaymentBottomSheet r2 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0026
            X.69Z r1 = r0.A0M
            if (r1 == 0) goto L_0x0026
            int r0 = r0.A01
            r1.AUW(r2, r0)
            return
        L_0x00ab:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.obwhatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r3 = r3.A01
            com.obwhatsapp.payments.ui.PaymentBottomSheet r3 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r3
            if (r3 == 0) goto L_0x0026
            X.69Z r2 = r0.A0M
            if (r2 == 0) goto L_0x0026
            int r1 = r0.A00
            int r0 = r0.A01
            r2.AUc(r3, r1, r0)
            return
        L_0x00c1:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.obwhatsapp.payments.ui.ConfirmPaymentFragment) r0
            java.lang.Object r2 = r3.A01
            com.obwhatsapp.payments.ui.PaymentBottomSheet r2 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r2
            if (r2 == 0) goto L_0x0026
            X.69Z r1 = r0.A0M
            if (r1 == 0) goto L_0x0026
            int r0 = r0.A01
            r1.AUg(r2, r0)
            return
        L_0x00d5:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.payments.ui.ConfirmPaymentFragment r1 = (com.obwhatsapp.payments.ui.ConfirmPaymentFragment) r1
            java.lang.Object r6 = r3.A01
            X.1cl r6 = (X.C30671cl) r6
            X.69Z r2 = r1.A0M
            if (r2 == 0) goto L_0x0026
            X.1m3 r5 = r1.A0G
            if (r5 == 0) goto L_0x00ea
            int r0 = r1.A01
            r5.A08(r0)
        L_0x00ea:
            android.widget.ProgressBar r4 = r1.A09
            X.01A r7 = r1.A0D
            com.obwhatsapp.payments.ui.PaymentBottomSheet r7 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r7
            r3 = r31
            r2.AP0(r3, r4, r5, r6, r7)
            return
        L_0x00f6:
            r0 = 4
            com.facebook.redex.IDxKCallbackShape73S0200000_3_I1 r1 = new com.facebook.redex.IDxKCallbackShape73S0200000_3_I1
            r1.<init>(r3, r0, r4)
            X.0tz r0 = r4.A0E
            android.content.Context r5 = r0.A00
            X.0pt r6 = r4.A0A
            X.0wU r8 = r4.A0O
            X.0wX r7 = r4.A0L
            X.5ug r4 = new X.5ug
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4.A00(r1, r2)
            return
        L_0x010f:
            java.lang.Object r0 = r3.A00
            X.654 r0 = (X.AnonymousClass654) r0
            org.npci.commonlibrary.NPCIFragment r1 = r0.A00
            java.lang.Object r0 = r3.A01
            X.5eG r0 = (X.C110495eG) r0
            r1.A1D(r0)
            java.lang.String r0 = "TRIGGER_OTP"
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r0)
            android.content.Context r0 = r1.A0u()
            X.0Vz r10 = X.C06450Vz.A00(r0)
            java.util.HashMap r9 = r10.A04
            monitor-enter(r9)
            java.lang.String r16 = r11.getAction()     // Catch:{ all -> 0x0253 }
            android.content.Context r0 = r10.A00     // Catch:{ all -> 0x0253 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x0253 }
            java.lang.String r13 = r11.resolveTypeIfNeeded(r0)     // Catch:{ all -> 0x0253 }
            android.net.Uri r19 = r11.getData()     // Catch:{ all -> 0x0253 }
            java.lang.String r8 = r11.getScheme()     // Catch:{ all -> 0x0253 }
            java.util.Set r20 = r11.getCategories()     // Catch:{ all -> 0x0253 }
            int r0 = r11.getFlags()     // Catch:{ all -> 0x0253 }
            r0 = r0 & 8
            r14 = 0
            if (r0 == 0) goto L_0x0171
            r14 = 1
            java.lang.String r2 = "LocalBroadcastManager"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "Resolving type "
            r1.append(r0)     // Catch:{ all -> 0x0253 }
            r1.append(r13)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = " scheme "
            r1.append(r0)     // Catch:{ all -> 0x0253 }
            r1.append(r8)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = " of intent "
            java.lang.String r0 = X.AnonymousClass000.A0e(r11, r0, r1)     // Catch:{ all -> 0x0253 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0253 }
        L_0x0171:
            java.util.HashMap r1 = r10.A03     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = r11.getAction()     // Catch:{ all -> 0x0253 }
            java.lang.Object r7 = r1.get(r0)     // Catch:{ all -> 0x0253 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0253 }
            if (r7 == 0) goto L_0x0251
            if (r14 == 0) goto L_0x0190
            java.lang.String r2 = "LocalBroadcastManager"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "Action list: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r7, r0, r1)     // Catch:{ all -> 0x0253 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x0253 }
        L_0x0190:
            r6 = 0
            r5 = 0
        L_0x0192:
            int r0 = r7.size()     // Catch:{ all -> 0x0253 }
            if (r5 >= r0) goto L_0x0226
            java.lang.Object r4 = r7.get(r5)     // Catch:{ all -> 0x0253 }
            X.0Pj r4 = (X.C05120Pj) r4     // Catch:{ all -> 0x0253 }
            if (r14 == 0) goto L_0x01b4
            java.lang.String r1 = "LocalBroadcastManager"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "Matching against filter "
            r2.append(r0)     // Catch:{ all -> 0x0253 }
            android.content.IntentFilter r0 = r4.A03     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r2)     // Catch:{ all -> 0x0253 }
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0253 }
        L_0x01b4:
            boolean r0 = r4.A00     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x01c2
            if (r14 == 0) goto L_0x0222
            java.lang.String r1 = "LocalBroadcastManager"
            java.lang.String r0 = "  Filter's target already added"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x0253 }
            goto L_0x0222
        L_0x01c2:
            android.content.IntentFilter r15 = r4.A03     // Catch:{ all -> 0x0253 }
            java.lang.String r3 = "LocalBroadcastManager"
            r2 = 1
            r21 = r3
            r18 = r8
            r17 = r13
            int r12 = r15.match(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0253 }
            if (r12 < 0) goto L_0x01f5
            if (r14 == 0) goto L_0x01e9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "  Filter matched!  match=0x"
            r1.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = java.lang.Integer.toHexString(r12)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0253 }
            android.util.Log.v(r3, r0)     // Catch:{ all -> 0x0253 }
        L_0x01e9:
            if (r6 != 0) goto L_0x01ef
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0253 }
        L_0x01ef:
            r6.add(r4)     // Catch:{ all -> 0x0253 }
            r4.A00 = r2     // Catch:{ all -> 0x0253 }
            goto L_0x0222
        L_0x01f5:
            if (r14 == 0) goto L_0x0222
            r0 = -4
            if (r12 == r0) goto L_0x020d
            r0 = -3
            if (r12 == r0) goto L_0x020a
            r0 = -2
            if (r12 == r0) goto L_0x0207
            r0 = -1
            if (r12 == r0) goto L_0x0204
            goto L_0x0210
        L_0x0204:
            java.lang.String r2 = "type"
            goto L_0x0212
        L_0x0207:
            java.lang.String r2 = "data"
            goto L_0x0212
        L_0x020a:
            java.lang.String r2 = "action"
            goto L_0x0212
        L_0x020d:
            java.lang.String r2 = "category"
            goto L_0x0212
        L_0x0210:
            java.lang.String r2 = "unknown reason"
        L_0x0212:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = "  Filter did not match: "
            r1.append(r0)     // Catch:{ all -> 0x0253 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ all -> 0x0253 }
            android.util.Log.v(r3, r0)     // Catch:{ all -> 0x0253 }
        L_0x0222:
            int r5 = r5 + 1
            goto L_0x0192
        L_0x0226:
            r3 = 1
            if (r6 == 0) goto L_0x0251
            r2 = 0
        L_0x022a:
            int r0 = r6.size()     // Catch:{ all -> 0x0253 }
            if (r2 >= r0) goto L_0x023c
            java.lang.Object r1 = r6.get(r2)     // Catch:{ all -> 0x0253 }
            X.0Pj r1 = (X.C05120Pj) r1     // Catch:{ all -> 0x0253 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0253 }
            int r2 = r2 + 1
            goto L_0x022a
        L_0x023c:
            java.util.ArrayList r1 = r10.A02     // Catch:{ all -> 0x0253 }
            X.0Ny r0 = new X.0Ny     // Catch:{ all -> 0x0253 }
            r0.<init>(r11, r6)     // Catch:{ all -> 0x0253 }
            r1.add(r0)     // Catch:{ all -> 0x0253 }
            android.os.Handler r1 = r10.A01     // Catch:{ all -> 0x0253 }
            boolean r0 = r1.hasMessages(r3)     // Catch:{ all -> 0x0253 }
            if (r0 != 0) goto L_0x0251
            r1.sendEmptyMessage(r3)     // Catch:{ all -> 0x0253 }
        L_0x0251:
            monitor-exit(r9)     // Catch:{ all -> 0x0253 }
            return
        L_0x0253:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0253 }
            throw r0
        L_0x0256:
            java.lang.Object r2 = r3.A00
            X.5em r2 = (X.C110755em) r2
            java.lang.Object r1 = r3.A01
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            r0 = 23
            X.5tS r3 = X.C117725tS.A00(r0)
            goto L_0x031b
        L_0x0266:
            java.lang.Object r2 = r3.A00
            X.5em r2 = (X.C110755em) r2
            java.lang.Object r1 = r3.A01
            X.1cl r1 = (X.C30671cl) r1
            r0 = 9
            X.5tS r3 = X.C117725tS.A00(r0)
            r3.A04 = r1
            goto L_0x031d
        L_0x0278:
            java.lang.Object r2 = r3.A00
            X.5em r2 = (X.C110755em) r2
            java.lang.Object r1 = r3.A01
            X.5hW r1 = (X.C111855hW) r1
            r0 = 102(0x66, float:1.43E-43)
            X.5nA r3 = new X.5nA
            r3.<init>(r0)
            java.lang.String r0 = r1.A0Q
            r3.A06 = r0
            goto L_0x031d
        L_0x028d:
            java.lang.Object r4 = r3.A00
            X.5em r4 = (X.C110755em) r4
            java.lang.Object r1 = r3.A01
            X.5hW r1 = (X.C111855hW) r1
            r0 = 113(0x71, float:1.58E-43)
            X.5nA r3 = new X.5nA
            r3.<init>(r0)
            X.5xC r0 = r1.A0B
            X.5wO[] r8 = r0.A0O
            if (r8 == 0) goto L_0x02fd
            int r7 = r8.length
            if (r7 == 0) goto L_0x02fd
            java.lang.String[] r6 = new java.lang.String[r7]
            r5 = 0
            r2 = 0
        L_0x02a9:
            r0 = r8[r5]
            int r1 = r2 + 1
            X.1lh r0 = r0.A00
            java.lang.Object r0 = r0.A00
            r6[r2] = r0
            int r5 = r5 + 1
            r2 = r1
            if (r5 < r7) goto L_0x02a9
            java.lang.String[] r5 = new java.lang.String[r7]
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            r1 = 0
        L_0x02bf:
            java.lang.String r0 = "id=?"
            r2.append(r0)
            int r0 = r7 + -1
            if (r1 == r0) goto L_0x02cd
            java.lang.String r0 = " OR "
            r2.append(r0)
        L_0x02cd:
            r0 = r6[r1]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5[r1] = r0
            int r1 = r1 + 1
            if (r1 < r7) goto L_0x02bf
            java.lang.String r0 = "("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            android.util.Pair r0 = android.util.Pair.create(r5, r0)
            if (r0 == 0) goto L_0x02fd
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.first
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.1lg r0 = new X.1lg
            r0.<init>(r2, r1)
            r3.A01 = r0
        L_0x02fd:
            X.C110755em.A01(r4, r3)
            return
        L_0x0301:
            java.lang.Object r2 = r3.A00
            X.5em r2 = (X.C110755em) r2
            java.lang.Object r1 = r3.A01
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x0316
        L_0x030c:
            java.lang.Object r2 = r3.A00
            X.5em r2 = (X.C110755em) r2
            java.lang.Object r1 = r3.A01
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            r0 = 112(0x70, float:1.57E-43)
        L_0x0316:
            X.5nA r3 = new X.5nA
            r3.<init>(r0)
        L_0x031b:
            r3.A05 = r1
        L_0x031d:
            X.1cy r0 = r2.A09
            goto L_0x0336
        L_0x0320:
            java.lang.Object r4 = r3.A00
            X.5em r4 = (X.C110755em) r4
            java.lang.Object r2 = r3.A01
            X.1Vt r2 = (X.AnonymousClass1Vt) r2
            r1 = 0
            r0 = 103(0x67, float:1.44E-43)
            X.5nA r3 = new X.5nA
            r3.<init>(r0)
            r3.A05 = r2
            r3.A0J = r1
            X.1cy r0 = r4.A09
        L_0x0336:
            r0.A0B(r3)
            return
        L_0x033a:
            java.lang.Object r1 = r3.A00
            X.5eb r1 = (X.C110655eb) r1
            java.lang.Object r0 = r3.A01
            X.C110105dW.A1M(r1, r0)
            return
        L_0x0344:
            java.lang.Object r1 = r3.A00
            X.02k r1 = (X.C005602k) r1
            java.lang.Object r0 = r3.A01
            X.5sw r0 = (X.C117405sw) r0
            X.5rv r0 = r0.A04
            int r5 = r1.A00()
            X.5ev r2 = r0.A01
            X.5r2 r4 = r0.A00
            r6 = 0
        L_0x0357:
            java.util.List r3 = r2.A01
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0374
            java.lang.Object r0 = r3.get(r6)
            X.5sw r0 = (X.C117405sw) r0
            X.5ya r0 = r0.A03
            java.lang.String r1 = r0.A07
            java.lang.String r0 = r2.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0375
            int r6 = r6 + 1
            goto L_0x0357
        L_0x0374:
            r6 = -1
        L_0x0375:
            java.lang.Object r1 = r3.get(r6)
            X.5sw r1 = (X.C117405sw) r1
            r0 = 0
            r1.A00 = r0
            r2.A02(r6)
            java.lang.Object r0 = r3.get(r5)
            X.5sw r0 = (X.C117405sw) r0
            X.5ya r0 = r0.A03
            java.lang.String r0 = r0.A07
            r2.A00 = r0
            java.lang.Object r0 = r3.get(r5)
            X.5sw r0 = (X.C117405sw) r0
            r3 = 1
            r0.A00 = r3
            r2.A02(r5)
            java.lang.String r2 = r2.A00
            com.obwhatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r1 = r4.A00
            r1.A05 = r2
            r0 = 84
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A1N(r0, r2, r3)
            return
        L_0x03a9:
            java.lang.Object r0 = r3.A00
            X.5tT r0 = (X.C117735tT) r0
            java.lang.Object r4 = r3.A01
            X.5sn r4 = (X.C117315sn) r4
            X.69T r1 = r0.A06
            X.0tj r5 = r0.A07
            X.0rv r3 = r0.A05
            X.1lv r2 = r0.A04
            java.lang.String r6 = r0.A0G
            r1.AOP(r2, r3, r4, r5, r6)
            return
        L_0x03bf:
            java.lang.Object r1 = r3.A00
            X.62d r1 = (X.C1205662d) r1
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            com.obwhatsapp.payments.ui.invites.PaymentInviteFragment r2 = r1.A0A
            r0.size()
            X.3Q5 r1 = r2.A07
            r0 = 3
            r1.A05(r0)
            java.util.List r0 = r2.A0B
            int r1 = r0.size()
            r0 = 0
            r2.A1C(r1, r0)
            return
        L_0x03dd:
            java.lang.Object r0 = r3.A00
            X.5f1 r0 = (X.C110905f1) r0
            java.lang.Object r3 = r3.A01
            X.1Vt r3 = (X.AnonymousClass1Vt) r3
            X.5qs r0 = r0.A00
            com.obwhatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity r2 = r0.A00
            boolean r0 = X.AnonymousClass5wT.A00(r3)
            if (r0 == 0) goto L_0x045d
            X.5uV r1 = new X.5uV
            r1.<init>()
            java.lang.String r0 = "wa_payment_hub_support"
            r1.A04 = r0
            r1.A02 = r3
            X.15p r0 = r2.A0J
            r1.A03 = r0
            X.0sG r0 = r2.A02
            r1.A00 = r0
            X.013 r0 = r2.A05
            r1.A01 = r0
            r1.A00(r2)
        L_0x0409:
            X.2St r4 = X.C110105dW.A0N()
            boolean r0 = X.AnonymousClass5wT.A00(r3)
            if (r0 == 0) goto L_0x045a
            java.lang.String r1 = "p2m"
        L_0x0415:
            java.lang.String r0 = "product_flow"
            r4.A01(r0, r1)
            java.lang.String r1 = r3.A0K
            java.lang.String r0 = "transaction_id"
            r4.A01(r0, r1)
            int r1 = r3.A03
            int r0 = r3.A02
            java.lang.String r1 = X.AnonymousClass1W1.A04(r1, r0)
            java.lang.String r0 = "transaction_status"
            r4.A01(r0, r1)
            X.15p r0 = r2.A0J
            java.lang.String r1 = r0.A0K(r3)
            java.lang.String r0 = "transaction_status_name"
            r4.A01(r0, r1)
            java.lang.String r1 = "hc_entrypoint"
            java.lang.String r0 = "wa_payment_hub_support"
            r4.A01(r1, r0)
            java.lang.String r1 = "app_type"
            java.lang.String r0 = "consumer"
            r4.A01(r1, r0)
            X.69a r3 = r2.A04
            java.lang.Integer r5 = X.C13680ns.A0Y()
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 0
            java.lang.String r7 = "payment_home"
            r3.AKU(r4, r5, r6, r7, r8)
            return
        L_0x045a:
            java.lang.String r1 = "p2p"
            goto L_0x0415
        L_0x045d:
            X.0sq r1 = r2.A05
            X.5o4 r0 = r2.A3A()
            X.C13680ns.A1U(r0, r1)
            goto L_0x0409
        L_0x0467:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.payments.ui.IndiaUpiSimPickerDialogFragment r1 = (com.obwhatsapp.payments.ui.IndiaUpiSimPickerDialogFragment) r1
            java.lang.Object r0 = r3.A01
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            com.obwhatsapp.payments.ui.IndiaUpiSimPickerDialogFragment.A01(r0, r1)
            return
        L_0x0473:
            java.lang.Object r1 = r3.A00
            X.01A r1 = (X.AnonymousClass01A) r1
            java.lang.Object r0 = r3.A01
            X.5jR r0 = (X.C112795jR) r0
            r0.A3U()
            X.C110115dX.A0v(r1)
            return
        L_0x0482:
            java.lang.Object r5 = r3.A00
            com.obwhatsapp.payments.ui.IndiaUpiPaymentsTosActivity r5 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r5
            java.lang.Object r4 = r3.A01
            android.view.View r4 = (android.view.View) r4
            X.0pd r3 = r5.A0C
            X.0t9 r2 = r5.A05
            X.0yX r1 = r5.A04
            java.lang.String r0 = "onboarding"
            boolean r0 = X.C119075vs.A00(r3, r2, r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x04a5
            r2 = 2131891325(0x7f12147d, float:1.9417367E38)
            r1 = 2131891324(0x7f12147c, float:1.9417365E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r5.Afj(r0, r2, r1)
            return
        L_0x04a5:
            X.5ln r0 = r5.A03
            java.lang.String r1 = "tosAccepted"
            X.1dR r0 = r0.A00
            r0.A09(r1)
            X.61W r0 = r5.A0E
            r0.AgB()
            X.5vV r0 = r5.A01
            r0.A02()
            r0 = 8
            r4.setVisibility(r0)
            r0 = 2131365554(0x7f0a0eb2, float:1.8350977E38)
            X.C13680ns.A1I(r5, r0, r3)
            X.0wU r6 = r5.A0M
            java.lang.String r1 = "accept_pay"
            r0 = 0
            X.1Vv r8 = new X.1Vv
            r8.<init>(r1, r0)
            X.0tz r0 = r6.A05
            android.content.Context r2 = r0.A00
            X.0pt r4 = r6.A01
            X.0wX r3 = r6.A0B
            r7 = 0
            com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1 r1 = new com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "set"
            java.lang.String r10 = "urn:xmpp:whatsapp:account"
            r11 = 0
            r7 = r1
            r6.A0I(r7, r8, r9, r10, r11)
            X.2gO r1 = r5.A08
            java.lang.Integer r0 = X.C13690nt.A0U()
            r1.A07 = r0
            java.lang.Integer r0 = X.C13680ns.A0Y()
            r1.A08 = r0
            java.lang.String r0 = r5.A0L
            r1.A0X = r0
            X.C111345g2.A1s(r1, r5)
            return
        L_0x04fb:
            java.lang.Object r0 = r3.A00
            X.622 r0 = (X.AnonymousClass622) r0
            java.lang.Object r4 = r3.A01
            com.obwhatsapp.payments.ui.PaymentBottomSheet r4 = (com.obwhatsapp.payments.ui.PaymentBottomSheet) r4
            X.5ja r3 = r0.A03
            r2 = 3
            java.lang.String r1 = "add_credential_prompt"
            r0 = 0
            r3.A43(r0, r1, r2)
            r4.A1N()
            return
        L_0x0510:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity r0 = (com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r0
            java.lang.Object r2 = r3.A01
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            r1 = r2
            android.app.Dialog r1 = (android.app.Dialog) r1
            r7 = 0
            r1.setOnDismissListener(r7)
            r2.dismiss()
            X.5ea r4 = r0.A01
            X.0pt r3 = r4.A0C
            r2 = 2131891163(0x7f1213db, float:1.9417038E38)
            r1 = 0
            r3.A08(r1, r2)
            X.1Vt r6 = r4.A08
            X.1W2 r2 = r6.A0A
            boolean r1 = r2 instanceof X.C111855hW
            if (r1 == 0) goto L_0x0597
            X.5hW r2 = (X.C111855hW) r2
            X.5xC r1 = r2.A0B
            if (r1 == 0) goto L_0x0597
            X.5xB r5 = r1.A0C
            if (r5 == 0) goto L_0x0597
        L_0x053f:
            X.5iM r11 = r4.A09
            r12 = 1
            com.facebook.redex.IDxRCallbackShape447S0100000_3_I1 r8 = new com.facebook.redex.IDxRCallbackShape447S0100000_3_I1
            r8.<init>(r4, r12)
            java.lang.String r1 = "PAY: rejectPayeeMandate called"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "action"
            java.lang.String r3 = "upi-reject-mandate-request"
            X.C110105dW.A1P(r1, r3, r4)
            r11.A02(r6, r4)
            X.1W2 r2 = r6.A0A
            X.5hW r2 = (X.C111855hW) r2
            r1 = 0
            X.C112355iM.A01(r5, r2, r7, r4, r1)
            X.4XO r10 = X.C116635rh.A02(r11, r3)
            X.1Vv[] r1 = r11.A03(r6)
            X.0wU r13 = r11.A01
            X.1Vv r15 = X.C110105dW.A0W(r4, r1)
            android.content.Context r6 = r11.A00
            X.0pt r7 = r11.A02
            X.0wX r9 = r11.A05
            com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1 r5 = new com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1
            r5.<init>((android.content.Context) r6, (X.C14870pt) r7, (X.AnonymousClass5Q3) r8, (X.C18340wX) r9, (X.AnonymousClass4XO) r10, (X.C112355iM) r11)
            r17 = 0
            java.lang.String r16 = "set"
            r14 = r5
            r13.A0H(r14, r15, r16, r17)
            X.61W r7 = r0.A0E
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r11 = r0.A04
            java.lang.String r10 = "decline_mandate_dialogue"
            r7.AKT(r8, r9, r10, r11, r12)
            return
        L_0x0597:
            r5 = 0
            goto L_0x053f
        L_0x0599:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity r4 = (com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r4
            java.lang.Object r2 = r3.A01
            android.content.DialogInterface r2 = (android.content.DialogInterface) r2
            r1 = r2
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            r1.setOnDismissListener(r0)
            r2.dismiss()
            X.5ea r2 = r4.A01
            X.027 r1 = r2.A02
            X.0tz r0 = r2.A05
            X.C116815rz.A01(r1, r0)
            X.5iJ r0 = r2.A0K
            r0.A00()
            return
        L_0x05ba:
            java.lang.Object r1 = r3.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r3.A01
            X.1yJ r0 = (X.C42711yJ) r0
            X.02l r0 = r0.A08(r1)
            r0.show()
            return
        L_0x05ca:
            java.lang.Object r5 = r3.A00
            X.01A r5 = (X.AnonymousClass01A) r5
            java.lang.Object r4 = r3.A01
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.00l r1 = r5.A0C()
            java.lang.Class<com.obwhatsapp.payments.ui.BrazilPayBloksActivity> r0 = com.obwhatsapp.payments.ui.BrazilPayBloksActivity.class
            android.content.Intent r3 = X.C110105dW.A04(r1, r0)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_add_card"
            r3.putExtra(r1, r0)
            java.util.HashMap r2 = X.AnonymousClass000.A0x()
            java.lang.String r1 = "add_debit_only"
            java.lang.String r0 = "1"
            r2.put(r1, r0)
            java.lang.String r0 = "screen_params"
            r3.putExtra(r0, r2)
            r5.A0r(r3)
            r4.A1C()
            return
        L_0x05fa:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.payments.ui.ConfirmReceivePaymentFragment r4 = (com.obwhatsapp.payments.ui.ConfirmReceivePaymentFragment) r4
            java.lang.Object r3 = r3.A01
            X.1WD r2 = r4.A01
            r1 = 0
            com.facebook.redex.IDxNConsumerShape42S0200000_3_I1 r0 = new com.facebook.redex.IDxNConsumerShape42S0200000_3_I1
            r0.<init>(r3, r1, r4)
            r2.A00(r0)
            return
        L_0x060c:
            java.lang.Object r13 = r3.A00
            com.obwhatsapp.payments.ui.ConfirmReceivePaymentFragment r13 = (com.obwhatsapp.payments.ui.ConfirmReceivePaymentFragment) r13
            java.lang.Object r0 = r3.A01
            X.1cl r0 = (X.C30671cl) r0
            X.01A r12 = r13.A0D
            com.obwhatsapp.payments.ui.BrazilConfirmReceivePaymentFragment r13 = (com.obwhatsapp.payments.ui.BrazilConfirmReceivePaymentFragment) r13
            java.lang.String r11 = r0.A0A
            X.0pt r2 = r13.A00
            r1 = 2131890012(0x7f120f5c, float:1.9414704E38)
            r0 = 0
            r2.A08(r0, r1)
            X.0t3 r14 = r13.A03
            android.content.Context r16 = r13.A0u()
            X.0pt r10 = r13.A00
            X.0sK r9 = r13.A01
            X.0ug r8 = r13.A07
            X.0wR r7 = r13.A0J
            X.0wS r6 = r13.A04
            X.0wU r5 = r13.A0E
            X.5uW r4 = r13.A0G
            X.173 r3 = r13.A05
            X.5wt r2 = r13.A0A
            X.0wP r1 = r13.A02
            X.0wX r0 = r13.A0C
            X.5ut r15 = new X.5ut
            r27 = r4
            r28 = r7
            r29 = r11
            r26 = r6
            r25 = r5
            r24 = r0
            r23 = r2
            r22 = r8
            r21 = r3
            r20 = r14
            r19 = r1
            r18 = r9
            r17 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1 = 0
            com.facebook.redex.IDxMCallbackShape6S1200000_3_I1 r0 = new com.facebook.redex.IDxMCallbackShape6S1200000_3_I1
            r0.<init>(r12, r11, r13, r1)
            r15.A00(r0)
            return
        L_0x0668:
            java.lang.Object r1 = r3.A00
            X.5vR r1 = (X.AnonymousClass5vR) r1
            java.lang.Object r0 = r3.A01
            X.5vR r0 = (X.AnonymousClass5vR) r0
            X.68r r1 = r1.A01
            X.2KI r0 = r0.A02
            r1.AOX(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape33S0200000_3_I1.onClick(android.view.View):void");
    }
}
