package X;

/* renamed from: X.64f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1211064f implements Runnable {
    public final /* synthetic */ C110715ei A00;

    public /* synthetic */ C1211064f(C110715ei r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f9, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r12 = 0
            r0 = r17
            X.5ei r4 = r0.A00
            X.1Vw r1 = r4.A0C
            if (r1 == 0) goto L_0x010f
            X.2ZJ r0 = r4.A0A
            X.0t6 r0 = r0.A01
            X.0th r0 = r0.A0K
            X.0tZ r3 = r0.A03(r1)
            X.0ti r3 = (X.C16830ti) r3
        L_0x0015:
            r2 = 0
            if (r3 == 0) goto L_0x010c
            X.0tn r0 = r3.A00
            if (r0 == 0) goto L_0x010c
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x010c
            java.lang.String r5 = r0.A03
            if (r5 == 0) goto L_0x0030
            X.2ZJ r0 = r4.A0A
            X.16r r0 = r0.A02
            X.1Vt r0 = r0.A0L(r5)
            if (r0 == 0) goto L_0x0105
            r3.A0L = r0
        L_0x0030:
            r4.A08(r3)
            if (r3 == 0) goto L_0x0101
            X.0tn r0 = r3.A00
            if (r0 == 0) goto L_0x0101
            X.1lc r8 = r0.A01
            if (r8 == 0) goto L_0x0102
            X.1lY r0 = r8.A06
            X.C18450wi.A0F(r0)
            X.1lv r0 = r8.A02(r0)
            X.1Vy r0 = r0.A02
        L_0x0048:
            X.C18450wi.A0F(r0)
            java.math.BigDecimal r9 = r0.A00
            X.C18450wi.A0B(r9)
            X.0pd r7 = r4.A07
            r0 = 1826(0x722, float:2.559E-42)
            int r0 = r7.A02(r0)
            long r0 = (long) r0
            X.0tn r6 = r3.A00
            if (r6 == 0) goto L_0x00fe
            X.1lc r6 = r6.A01
            if (r6 == 0) goto L_0x00fe
            X.1Vz r11 = r6.A04
        L_0x0063:
            r10 = 1000(0x3e8, float:1.401E-42)
            X.1lv r6 = new X.1lv
            r6.<init>(r11, r10, r0)
            r0 = 1712(0x6b0, float:2.399E-42)
            int r0 = r7.A02(r0)
            long r0 = (long) r0
            X.0tn r3 = r3.A00
            if (r3 == 0) goto L_0x007b
            X.1lc r3 = r3.A01
            if (r3 == 0) goto L_0x007b
            X.1Vz r2 = r3.A04
        L_0x007b:
            X.1lv r3 = new X.1lv
            r3.<init>(r2, r10, r0)
            java.lang.String r2 = r8.A07
            float r1 = r9.floatValue()
            X.1Vy r0 = r6.A02
            java.math.BigDecimal r0 = r0.A00
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00fb
            float r1 = r9.floatValue()
            X.1Vy r0 = r3.A02
            java.math.BigDecimal r0 = r0.A00
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00fb
            java.lang.String r1 = r8.A01
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x00f5
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00f5
            r0 = 2178(0x882, float:3.052E-42)
            boolean r0 = r7.A0C(r0)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00e4
            X.0uP r1 = r4.A04
            com.whatsapp.jid.UserJid r0 = r4.A08
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            X.1Vq r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00e4
        L_0x00d2:
            X.41c r14 = X.C797441c.ACTIVE
        L_0x00d4:
            X.027 r1 = r4.A03
            X.5wL r11 = r4.A0B
            r15 = r12
            r16 = r12
            r13 = r12
            X.5xI r0 = r11.A00(r12, r13, r14, r15, r16)
            r1.A09(r0)
        L_0x00e3:
            return
        L_0x00e4:
            com.whatsapp.jid.UserJid r2 = r4.A08
            if (r2 == 0) goto L_0x00e3
            X.2ZJ r0 = r4.A0A
            X.61F r1 = new X.61F
            r1.<init>(r4)
            X.5uU r0 = r0.A03
            r0.A00(r2, r1)
            return
        L_0x00f5:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00d2
        L_0x00fb:
            X.41c r14 = X.C797441c.INACTIVE
            goto L_0x00d4
        L_0x00fe:
            r11 = r12
            goto L_0x0063
        L_0x0101:
            r8 = r12
        L_0x0102:
            r0 = r12
            goto L_0x0048
        L_0x0105:
            java.lang.String r0 = "Pay: PaymentCheckoutOrderViewModel/loadData the paymentTransactionInfo fetched from PaymentTransactionStore is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0030
        L_0x010c:
            r5 = r12
            goto L_0x0030
        L_0x010f:
            r3 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1211064f.run():void");
    }
}
