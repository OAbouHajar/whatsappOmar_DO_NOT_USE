package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5dj  reason: invalid class name and case insensitive filesystem */
public class C110235dj extends Handler {
    public final C111805hR A00;
    public final C119365wy A01;
    public final AnonymousClass60V A02;
    public final C18280wR A03;
    public final String A04;
    public final /* synthetic */ C119175wf A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110235dj(Looper looper, C111805hR r2, C119365wy r3, AnonymousClass60V r4, C119175wf r5, C18280wR r6, String str) {
        super(looper);
        this.A05 = r5;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = str;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r0.optJSONObject(r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r25) {
        /*
            r24 = this;
            r3 = r24
            X.60V r4 = r3.A02
            java.lang.String r10 = r3.A04
            monitor-enter(r4)
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x0174 }
            r9 = 0
            X.0wT r0 = r4.A03     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r1 = r0.A04()     // Catch:{ JSONException -> 0x0041 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0041 }
            if (r0 != 0) goto L_0x0049
            org.json.JSONObject r5 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r0 = "smsVerifDataSentToPsp"
            org.json.JSONObject r0 = r5.optJSONObject(r0)     // Catch:{ JSONException -> 0x0041 }
            if (r0 == 0) goto L_0x0030
            org.json.JSONObject r1 = r0.optJSONObject(r10)     // Catch:{ JSONException -> 0x0041 }
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = "smsVerifData"
            java.lang.String r2 = r1.optString(r0, r9)     // Catch:{ JSONException -> 0x0041 }
            goto L_0x0031
        L_0x0030:
            r2 = r9
        L_0x0031:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x003e }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "smsVerifData"
            java.lang.String r9 = r5.optString(r0, r9)     // Catch:{ JSONException -> 0x003e }
            goto L_0x0049
        L_0x003e:
            r1 = move-exception
            r9 = r2
            goto L_0x0042
        L_0x0041:
            r1 = move-exception
        L_0x0042:
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataSent threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0174 }
            goto L_0x0049
        L_0x0048:
            r9 = r2
        L_0x0049:
            monitor-exit(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x016e
            X.0wR r0 = r3.A03
            X.2H5 r1 = r0.A00
            if (r1 != 0) goto L_0x005e
            X.2H5 r1 = r0.A00()
            r0.A00 = r1
            if (r1 == 0) goto L_0x008d
        L_0x005e:
            X.60f r1 = (X.C1200760f) r1
            X.1Vo r6 = r1.A02
            java.lang.String r0 = "PaymentDeviceId: try to upgrade algorithm ..."
            r6.A04(r0)
            X.0wT r5 = r1.A01
            android.content.SharedPreferences r0 = r5.A01()
            java.lang.String r2 = "payments_device_id_algorithm"
            int r1 = X.C13690nt.A01(r0, r2)
            r0 = 2
            if (r1 >= r0) goto L_0x008d
            java.lang.String r0 = "PaymentDeviceId: algorithm upgraded!"
            r6.A04(r0)
            r1 = 2
            android.content.SharedPreferences$Editor r0 = X.C110105dW.A06(r5)
            X.C13680ns.A0w(r0, r2, r1)
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C110105dW.A06(r5)
            java.lang.String r0 = "payments_device_id"
            X.C13680ns.A0y(r1, r0, r2)
        L_0x008d:
            monitor-enter(r4)
            r8 = 0
            X.0wT r0 = r4.A03     // Catch:{ JSONException -> 0x00a6 }
            java.lang.String r1 = r0.A04()     // Catch:{ JSONException -> 0x00a6 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00a6 }
            if (r0 != 0) goto L_0x00ac
            org.json.JSONObject r1 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x00a6 }
            java.lang.String r0 = "smsVerifDataGateway"
            java.lang.String r8 = r1.optString(r0, r8)     // Catch:{ JSONException -> 0x00a6 }
            goto L_0x00ac
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readSmsGateway threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0174 }
        L_0x00ac:
            monitor-exit(r4)
            if (r8 != 0) goto L_0x00b7
            X.5wy r1 = r3.A01
            X.5hR r0 = r3.A00
            java.lang.String r8 = r1.A05(r0)
        L_0x00b7:
            X.5wf r7 = r3.A05
            java.lang.String r0 = "PAY: sendDeviceBindingIq called with psp: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r10)
            java.lang.String r0 = " verificationData: "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass5x3.A00(r9)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.61W r6 = r7.A0G
            r1 = 20
            r5 = 0
            r0 = 0
            r6.A06(r5, r1, r0)
            X.4XO r4 = r7.A0E
            java.lang.String r0 = "upi-bind-device"
            r4.A04(r0)
            X.0ug r3 = r7.A0A
            java.lang.String r2 = r3.A02()
            int r1 = r7.A00
            int r0 = r1 + -1
            if (r1 != 0) goto L_0x00ef
            r0 = 0
        L_0x00ef:
            long r11 = (long) r0
            X.0wR r0 = r7.A0J
            java.lang.String r19 = r0.A01()
            int r0 = r7.A00
            int r14 = r0 + -1
            if (r0 != 0) goto L_0x00fd
            r14 = 0
        L_0x00fd:
            r17 = 0
            r13 = 0
        L_0x0100:
            if (r13 > r14) goto L_0x0113
            long[] r1 = X.C119175wf.A0L
            int r0 = r1.length
            if (r13 >= r0) goto L_0x010e
            r0 = r1[r13]
        L_0x0109:
            long r17 = r17 + r0
            int r13 = r13 + 1
            goto L_0x0100
        L_0x010e:
            long r0 = (long) r13
            r15 = 5
            long r0 = r0 * r15
            goto L_0x0109
        L_0x0113:
            java.lang.Long r17 = java.lang.Long.valueOf(r17)
            java.lang.Long r18 = java.lang.Long.valueOf(r11)
            X.60V r0 = r7.A0C
            boolean r0 = r0.A0Q()
            if (r0 == 0) goto L_0x0171
            java.lang.String r23 = "1"
        L_0x0125:
            X.2cK r0 = new X.2cK
            r0.<init>(r2)
            X.5wC r1 = new X.5wC
            r15 = r1
            r16 = r0
            r20 = r9
            r21 = r10
            r22 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            X.0pd r8 = r7.A09
            r0 = 2227(0x8b3, float:3.12E-42)
            boolean r10 = r8.A0C(r0)
            java.lang.String r9 = "in_upi_device_binding_tag"
            if (r10 == 0) goto L_0x014c
            X.5ix r8 = r7.A0H
            r0 = 185476608(0xb0e2600, float:2.7376793E-32)
            r8.A04(r0, r9)
        L_0x014c:
            X.1Vv r8 = r1.A00
            X.0tz r0 = r7.A07
            android.content.Context r11 = r0.A00
            X.0pt r1 = r7.A06
            X.0wX r0 = r7.A0D
            if (r10 == 0) goto L_0x016f
            X.5ix r5 = r7.A0H
        L_0x015a:
            r19 = 2
            com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1 r10 = new com.obwhatsapp.payments.actions.IDxNCallbackShape95S0100000_3_I1
            r18 = r9
            r15 = r7
            r16 = r6
            r17 = r5
            r12 = r1
            r13 = r0
            r14 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.C110105dW.A1G(r3, r10, r8, r2)
        L_0x016e:
            return
        L_0x016f:
            r9 = r5
            goto L_0x015a
        L_0x0171:
            java.lang.String r23 = "0"
            goto L_0x0125
        L_0x0174:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110235dj.handleMessage(android.os.Message):void");
    }
}
