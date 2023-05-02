package X;

/* renamed from: X.60A  reason: invalid class name */
public class AnonymousClass60A implements C109285Rl {
    public final C17130ua A00;
    public final C16980tz A01;
    public final AnonymousClass60V A02;
    public final AnonymousClass175 A03;
    public final AnonymousClass17O A04;
    public final C18290wS A05;

    public AnonymousClass60A(C17130ua r1, C16980tz r2, AnonymousClass60V r3, AnonymousClass175 r4, AnonymousClass17O r5, C18290wS r6) {
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r2 = X.C30681cm.A0E.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4n(java.util.List r5) {
        /*
            r4 = this;
            java.util.Iterator r3 = r5.iterator()
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004f
            X.1cl r0 = X.C110115dX.A0F(r3)
            X.1tF r1 = r0.A08
            boolean r0 = r1 instanceof X.C111805hR
            if (r0 == 0) goto L_0x0028
            X.5hR r1 = (X.C111805hR) r1
            X.1lh r0 = r1.A05
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0004
            X.175 r1 = r4.A03
            java.lang.String r0 = "2fa"
            r1.A09(r0)
            goto L_0x0004
        L_0x0028:
            boolean r0 = r1 instanceof X.C111835hU
            if (r0 == 0) goto L_0x0004
            X.5hU r1 = (X.C111835hU) r1
            java.lang.String r0 = r1.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0004
            X.1lh r0 = r1.A00
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 != 0) goto L_0x0004
            X.1cm r0 = X.C30681cm.A0E
            X.1tS[] r2 = r0.A0B
            int r0 = r2.length
            if (r0 <= 0) goto L_0x0004
            X.17O r1 = r4.A04
            int r0 = r0 + -1
            r0 = r2[r0]
            r1.A08(r0)
            goto L_0x0004
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60A.A4n(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        if (r0 != null) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30671cl A5L(X.C30671cl r9) {
        /*
            r8 = this;
            int r1 = r9.A04()
            r0 = 5
            if (r0 != r1) goto L_0x0066
            X.1tF r2 = r9.A08
            X.5hU r2 = (X.C111835hU) r2
            if (r2 == 0) goto L_0x0065
            X.0wS r0 = r8.A05
            X.160 r1 = X.C110115dX.A0H(r0)
            java.lang.String r0 = r9.A0A
            X.1cl r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0039
            X.1tF r1 = r0.A08
            if (r1 == 0) goto L_0x0039
            X.5hU r1 = (X.C111835hU) r1
            X.1lh r0 = r2.A00
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 == 0) goto L_0x002d
            X.1lh r0 = r1.A00
            r2.A00 = r0
        L_0x002d:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r1.A02
            r2.A02 = r0
        L_0x0039:
            X.1lh r0 = r2.A00
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 == 0) goto L_0x004f
            X.60V r0 = r8.A02
            X.1lh r1 = r0.A05()
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x004f
            r2.A00 = r1
        L_0x004f:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0065
            X.60V r0 = r8.A02
            java.lang.String r1 = r0.A0D()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0065
            r2.A02 = r1
        L_0x0065:
            return r9
        L_0x0066:
            X.1tF r3 = r9.A08
            X.5hR r3 = (X.C111805hR) r3
            java.lang.String r0 = "PAY: beforeMethodAdded got methodData: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            if (r3 == 0) goto L_0x0180
            java.lang.String r0 = "vpa: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.1lh r0 = r3.A09
            r1.append(r0)
            java.lang.String r0 = " image: "
            r1.append(r0)
            java.lang.String r0 = r3.A03
            r1.append(r0)
            java.lang.String r0 = " supportPhoneNumber: "
            r1.append(r0)
            java.lang.String r0 = r3.A0D
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x0092:
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0065
            java.lang.String r0 = r3.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0105
            java.lang.String r4 = r3.A03
            java.lang.String r1 = "BankLogos"
            X.0tz r0 = r8.A01
            android.content.Context r6 = r0.A00
            java.io.File r0 = r6.getCacheDir()
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.mkdirs()
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = "PAY: IndiaUpiStorageObserver/imageUrlToByteArray unable to create bank logos cache directory"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00c5:
            r0 = 1048576(0x100000, double:5.180654E-318)
            X.1zV r5 = new X.1zV
            r5.<init>(r2, r0)
            java.lang.String r4 = X.C004101u.A02(r4)
            X.AnonymousClass00B.A06(r4)
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131166675(0x7f0705d3, float:1.7947602E38)
            int r2 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r6.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            r0 = 0
            android.graphics.Bitmap r4 = r5.A00(r4, r2, r1, r0)
            r5.A03(r0)
            if (r4 == 0) goto L_0x0177
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            r4.compress(r1, r0, r2)
            byte[] r0 = r2.toByteArray()
            if (r0 == 0) goto L_0x0177
        L_0x0103:
            r9.A0D = r0
        L_0x0105:
            X.0wS r0 = r8.A05
            X.160 r1 = X.C110115dX.A0H(r0)
            java.lang.String r0 = r9.A0A
            X.1cl r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x013f
            X.1tF r1 = r0.A08
            if (r1 == 0) goto L_0x013f
            X.5hR r1 = (X.C111805hR) r1
            X.1lh r0 = r3.A09
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 == 0) goto L_0x0125
            X.1lh r0 = r1.A09
            r3.A09 = r0
        L_0x0125:
            java.lang.String r0 = r3.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = r1.A0F
            r3.A0F = r0
        L_0x0131:
            X.1lh r0 = r3.A03
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 == 0) goto L_0x013f
            X.1lh r0 = r1.A06()
            r3.A03 = r0
        L_0x013f:
            X.1lh r0 = r3.A09
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 == 0) goto L_0x0155
            X.60V r0 = r8.A02
            X.1lh r1 = r0.A05()
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0155
            r3.A09 = r1
        L_0x0155:
            java.lang.String r0 = r3.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x016b
            X.60V r0 = r8.A02
            java.lang.String r1 = r0.A0D()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x016b
            r3.A0F = r1
        L_0x016b:
            X.60V r2 = r8.A02
            X.1lh r7 = r3.A09
            java.lang.String r1 = r3.A0F
            java.lang.String r6 = r3.A0A
            java.lang.String r5 = r3.A0E
            monitor-enter(r2)
            goto L_0x0184
        L_0x0177:
            java.lang.String r1 = r3.A03
            X.0ua r0 = r8.A00
            byte[] r0 = X.C119405xi.A0A(r0, r1)
            goto L_0x0103
        L_0x0180:
            java.lang.String r0 = "null"
            goto L_0x0092
        L_0x0184:
            X.0wT r4 = r2.A03     // Catch:{ JSONException -> 0x01cb }
            org.json.JSONObject r3 = X.C110105dW.A0k(r4)     // Catch:{ JSONException -> 0x01cb }
            boolean r0 = X.C39841t9.A03(r7)     // Catch:{ JSONException -> 0x01cb }
            if (r0 != 0) goto L_0x01a0
            r2.A0I(r7, r1, r3)     // Catch:{ JSONException -> 0x01cb }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updated handle: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r7, r0, r1)     // Catch:{ JSONException -> 0x01cb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ JSONException -> 0x01cb }
        L_0x01a0:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x01cb }
            if (r0 != 0) goto L_0x01c7
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x01cb }
            if (r0 != 0) goto L_0x01c7
            r2.A0L(r6, r5, r3)     // Catch:{ JSONException -> 0x01cb }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updated psp: "
            r1.append(r0)     // Catch:{ JSONException -> 0x01cb }
            r1.append(r6)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = " transactionPrefix: "
            r1.append(r0)     // Catch:{ JSONException -> 0x01cb }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r1)     // Catch:{ JSONException -> 0x01cb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ JSONException -> 0x01cb }
        L_0x01c7:
            X.C110105dW.A1J(r4, r3)     // Catch:{ JSONException -> 0x01cb }
            goto L_0x01d1
        L_0x01cb:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs updateHandleDeviceBinding threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01d3 }
        L_0x01d1:
            monitor-exit(r2)
            return r9
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60A.A5L(X.1cl):X.1cl");
    }
}
