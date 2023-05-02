package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape3S0201000_3_I1 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape3S0201000_3_I1(Object obj, int i2, Object obj2, int i3) {
        this.A03 = i3;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0100, code lost:
        r2 = r4.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A03
            if (r0 == 0) goto L_0x008e
            java.lang.Object r8 = r13.A01
            X.5ew r8 = (X.C110855ew) r8
            java.lang.Object r0 = r13.A02
            X.02k r0 = (X.C005602k) r0
            int r7 = r13.A00
            com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity r2 = r8.A03
            X.1Ai r1 = r2.A0B
            android.view.View r0 = r0.A0H
            r1.A01(r0)
            java.util.List r0 = r8.A00
            java.lang.Object r4 = r0.get(r7)
            X.5hR r4 = (X.C111805hR) r4
            r1 = 0
            r6 = 0
            r5 = 0
        L_0x0022:
            if (r6 >= r7) goto L_0x0030
            int r3 = r8.getItemViewType(r6)
            r0 = 1
            if (r3 != r0) goto L_0x002d
            int r5 = r5 + 1
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x0022
        L_0x0030:
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r2.A0G
            int r1 = r0.size()
        L_0x003a:
            int r1 = r1 + r7
            int r1 = r1 - r5
            X.60V r5 = r2.A0C
            X.5wy r0 = r2.A0B
            java.lang.String r3 = r0.A06(r4)
            X.61W r0 = r2.A0E
            boolean r0 = r5.A0S(r4, r0, r3)
            if (r0 == 0) goto L_0x0086
            org.json.JSONObject r6 = X.C13700nu.A0J()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r0 = "SelectBankStep"
            X.C111345g2.A1u(r2, r0, r6)     // Catch:{ Exception -> 0x0117 }
            X.5wy r0 = r2.A0B     // Catch:{ Exception -> 0x0117 }
            java.lang.String r7 = r0.A06(r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r0 = "pspForDeviceBinding"
            r6.put(r0, r7)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r5 = "isDeviceBindingDone"
            X.60V r3 = r2.A0C     // Catch:{ Exception -> 0x0117 }
            X.61W r0 = r2.A0E     // Catch:{ Exception -> 0x0117 }
            boolean r0 = r3.A0S(r4, r0, r7)     // Catch:{ Exception -> 0x0117 }
            r6.put(r5, r0)     // Catch:{ Exception -> 0x0117 }
            X.0t3 r8 = r2.A05     // Catch:{ Exception -> 0x0117 }
            X.0pd r9 = r2.A0C     // Catch:{ Exception -> 0x0117 }
            X.0ug r10 = r2.A0H     // Catch:{ Exception -> 0x0117 }
            X.5wy r11 = r2.A0B     // Catch:{ Exception -> 0x0117 }
            X.0wU r12 = r2.A0M     // Catch:{ Exception -> 0x0117 }
            X.5iD r7 = new X.5iD     // Catch:{ Exception -> 0x0117 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0117 }
            r7.A00 = r6     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "SKIPPED_DEVICE_BINDING"
            r0 = 0
            r7.A00(r3, r0)     // Catch:{ Exception -> 0x0117 }
            goto L_0x0117
        L_0x0086:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiSimVerificationActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiSimVerificationActivity.class
            android.content.Intent r7 = X.C110105dW.A04(r2, r0)
            goto L_0x011d
        L_0x008e:
            java.lang.Object r7 = r13.A01
            X.5et r7 = (X.C110825et) r7
            java.lang.Object r4 = r13.A02
            X.5fC r4 = (X.C111015fC) r4
            int r5 = r13.A00
            r3 = 0
            X.5et r2 = r4.A06     // Catch:{ JSONException -> 0x00ab }
            org.json.JSONArray r1 = r2.A0B     // Catch:{ JSONException -> 0x00ab }
            int r0 = r4.A00()     // Catch:{ JSONException -> 0x00ab }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r0 = r2.A05     // Catch:{ JSONException -> 0x00ab }
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x00ab }
        L_0x00ab:
            if (r3 != 0) goto L_0x017c
            org.json.JSONArray r0 = r7.A0B     // Catch:{ JSONException -> 0x00d9 }
            org.json.JSONObject r6 = r0.getJSONObject(r5)     // Catch:{ JSONException -> 0x00d9 }
            X.04N r5 = r7.A02     // Catch:{ JSONException -> 0x00d9 }
            if (r5 == 0) goto L_0x00eb
            java.util.HashMap r3 = X.AnonymousClass000.A0x()     // Catch:{ JSONException -> 0x00d9 }
            java.util.Iterator r2 = r6.keys()     // Catch:{ JSONException -> 0x00d9 }
        L_0x00bf:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x00d9 }
            if (r0 == 0) goto L_0x00d5
            java.lang.String r1 = X.AnonymousClass000.A0m(r2)     // Catch:{ JSONException -> 0x00d9 }
            java.lang.Object r0 = r6.get(r1)     // Catch:{ JSONException -> 0x00d9 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00d9 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x00d9 }
            goto L_0x00bf
        L_0x00d5:
            r5.accept(r3)     // Catch:{ JSONException -> 0x00d9 }
            goto L_0x00eb
        L_0x00d9:
            r2 = move-exception
            java.lang.String r0 = "WaListViewBinder/SingleTextSelectionAdapter/notifyPositionTapped : "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00eb:
            r3 = 0
            X.5et r2 = r4.A06     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONArray r1 = r2.A0B     // Catch:{ JSONException -> 0x00fe }
            int r0 = r4.A00()     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = r2.A05     // Catch:{ JSONException -> 0x00fe }
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x00fe }
        L_0x00fe:
            if (r3 != 0) goto L_0x017c
            X.5et r2 = r4.A06
            int r1 = r2.A00
            int r0 = r4.A00()
            if (r1 == r0) goto L_0x017c
            r2.A02(r1)
            int r0 = r4.A00()
            r2.A00 = r0
            r2.A02(r0)
            return
        L_0x0117:
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.class
            android.content.Intent r7 = X.C110105dW.A04(r2, r0)
        L_0x011d:
            X.5ln r0 = r2.A05
            java.lang.String r3 = "bankSelected"
            X.1dR r0 = r0.A00
            r0.A09(r3)
            r2.A3M(r7)
            java.lang.String r0 = "extra_previous_screen"
            java.lang.String r6 = "nav_bank_select"
            r7.putExtra(r0, r6)
            java.lang.String r0 = "bankPicker"
            X.AnonymousClass22U.A00(r7, r0)
            java.lang.String r0 = "extra_selected_bank"
            r7.putExtra(r0, r4)
            r5 = 1
            r2.A2X(r7, r5)
            X.2gO r3 = r2.A0K
            boolean r0 = r2.A0J
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A02 = r0
            java.lang.String r0 = r2.A0E
            r3.A0P = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A04 = r0
            java.lang.String r0 = r4.A0A()
            r3.A0Q = r0
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0J = r0
            X.C111345g2.A1t(r3, r2, r6)
            java.lang.String r0 = r2.A0O
            r3.A0Z = r0
            X.C110115dX.A10(r3, r5)
            java.lang.String r0 = r2.A0E
            r3.A0P = r0
            java.lang.Integer r0 = X.C13690nt.A0U()
            r3.A07 = r0
            X.C111345g2.A1s(r3, r2)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape3S0201000_3_I1.onClick(android.view.View):void");
    }
}
