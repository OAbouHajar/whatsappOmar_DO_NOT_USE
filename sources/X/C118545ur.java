package X;

import android.content.Context;

/* renamed from: X.5ur  reason: invalid class name and case insensitive filesystem */
public class C118545ur {
    public final Context A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C16440t3 A03;
    public final AnonymousClass173 A04;
    public final C17190ug A05;
    public final C18340wX A06;
    public final C18310wU A07;
    public final C18290wS A08;
    public final C119285wq A09;
    public final AnonymousClass1Vo A0A = AnonymousClass1Vo.A00("BrazilAddCredentialAction", "network", "BR");
    public final AnonymousClass5vX A0B;

    public C118545ur(Context context, C14870pt r5, C16040sK r6, C16440t3 r7, AnonymousClass173 r8, C17190ug r9, C18340wX r10, C18310wU r11, C18290wS r12, C119285wq r13, AnonymousClass5vX r14) {
        this.A03 = r7;
        this.A00 = context;
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r9;
        this.A08 = r12;
        this.A0B = r14;
        this.A07 = r11;
        this.A04 = r8;
        this.A06 = r10;
        this.A09 = r13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass50C r25, X.C116735rr r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            r24 = this;
            org.json.JSONObject r2 = X.C13700nu.A0J()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            java.lang.String r0 = "pushAccountData"
            r1 = r28
            r2.put(r0, r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            java.lang.String r0 = "phone"
            r1 = r30
            r2.put(r0, r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            r3 = r29
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            java.lang.String r1 = "issuer"
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "MASTERCARD"
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "VISA"
            boolean r0 = r3.equals(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "V"
            r2.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
        L_0x0031:
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            byte[] r1 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            r0 = 16
            byte[] r0 = X.C004101u.A0E(r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            r2 = r25
            byte[] r8 = r2.A8P(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            r5 = r24
            X.0t3 r3 = r5.A03
            X.0sK r1 = r5.A02
            java.lang.String r9 = X.C110105dW.A0g(r1, r3)
            X.0ug r0 = r5.A05
            r23 = r0
            java.lang.String r12 = r23.A02()
            java.lang.String r15 = r2.A05
            java.lang.String r0 = r2.A04
            long r13 = java.lang.Long.parseLong(r0)
            java.lang.Long r16 = java.lang.Long.valueOf(r13)
            if (r27 == 0) goto L_0x0077
            goto L_0x006e
        L_0x0068:
            java.lang.String r0 = "M"
            r2.put(r1, r0)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0121 }
            goto L_0x0031
        L_0x006e:
            boolean r0 = r27.booleanValue()
            if (r0 != 0) goto L_0x0077
            java.lang.String r6 = "0"
            goto L_0x0079
        L_0x0077:
            java.lang.String r6 = "1"
        L_0x0079:
            java.lang.String r0 = r2.A03
            java.lang.String r10 = "CARD"
            java.lang.String r1 = "credential"
            X.1gQ r7 = X.AnonymousClass3K4.A0S(r1)
            r2 = 1
            r20 = 100
            r4 = 0
            r18 = 1
            r22 = 0
            r17 = r0
            boolean r1 = X.C32271fx.A0D(r17, r18, r20, r22)
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = "key_type"
            X.C32461gQ.A00(r7, r1, r0)
        L_0x0099:
            r0 = 32786(0x8012, double:1.61984E-319)
            X.C32271fx.A09(r8, r2, r0)
            r7.A01 = r8
            java.util.ArrayList r1 = X.C115565px.A00
            java.lang.String r0 = "type"
            r7.A0A(r10, r0, r1)
            X.1Vv r11 = r7.A01()
            X.2cK r10 = new X.2cK
            r10.<init>(r12)
            X.1gQ r8 = X.C110105dW.A0X()
            X.1gQ r7 = X.C110105dW.A0Y(r8)
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-add-credential"
            X.C32461gQ.A00(r7, r1, r0)
            r1 = r31
            boolean r0 = X.C110105dW.A1V(r1, r2, r4)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "device_id"
            X.C32461gQ.A00(r7, r0, r1)
        L_0x00cd:
            boolean r0 = X.C110105dW.A1W(r9, r2, r4)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "nonce"
            X.C32461gQ.A00(r7, r0, r9)
        L_0x00d8:
            r17 = r15
            boolean r0 = X.C32271fx.A0D(r17, r18, r20, r22)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "provider"
            X.C32461gQ.A00(r7, r0, r15)
        L_0x00e5:
            r0 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            r2 = r16
            boolean r0 = X.C32271fx.A0B(r2, r0, r4)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = "key_version"
            X.C110115dX.A13(r7, r0, r13)
        L_0x00f7:
            java.util.ArrayList r1 = X.C115555pw.A00
            java.lang.String r0 = "is_first_card"
            r7.A0A(r6, r0, r1)
            r7.A03(r11)
            X.1Vv r4 = X.C110105dW.A0T(r7, r8, r10)
            android.content.Context r3 = r5.A00
            X.0pt r2 = r5.A01
            X.0wX r0 = r5.A06
            r19 = 2
            com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1 r1 = new com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1
            r17 = r26
            r13 = r1
            r14 = r3
            r15 = r0
            r16 = r2
            r18 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0 = r23
            X.C110105dW.A1H(r0, r1, r4, r12)
            return
        L_0x0121:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118545ur.A00(X.50C, X.5rr, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
