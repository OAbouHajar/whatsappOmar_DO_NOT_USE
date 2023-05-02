package X;

import org.json.JSONObject;

/* renamed from: X.60p  reason: invalid class name and case insensitive filesystem */
public class C1201760p implements C42701yH {
    public JSONObject A00;
    public final C16000sG A01;
    public final C16080sP A02;
    public final C16440t3 A03;
    public final C18300wT A04;
    public final C218315p A05;
    public final AnonymousClass122 A06;

    public C1201760p(C16000sG r1, C16080sP r2, C16440t3 r3, C18300wT r4, C218315p r5, AnonymousClass122 r6) {
        this.A03 = r3;
        this.A05 = r5;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r4;
        this.A06 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ac, code lost:
        r0 = r1.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A5l(java.util.List r16) {
        /*
            r15 = this;
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.util.Iterator r14 = r16.iterator()
        L_0x0008:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r8 = r14.next()
            X.1Vt r8 = (X.AnonymousClass1Vt) r8
            X.1W2 r0 = r8.A0A
            if (r0 == 0) goto L_0x01ee
            long r0 = r0.A09()
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L_0x0020:
            java.lang.String r0 = "PAY: BrazilPaymentStatusNotificationHelper/buildPaymentReminders - transaction transferred at: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            long r0 = r8.A05
            r2.append(r0)
            java.lang.String r0 = ", expired at: "
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.15p r7 = r15.A05
            java.lang.Long r13 = r7.A0F(r8)
            if (r13 == 0) goto L_0x00a2
            java.lang.String r3 = r8.A0L
            r9 = 0
            long r5 = r13.longValue()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            org.json.JSONObject r0 = r15.A00
            if (r0 != 0) goto L_0x0072
            X.0wT r0 = r15.A04
            android.content.SharedPreferences r2 = r0.A01()
            java.lang.String r1 = "payments_nagged_transactions"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            org.json.JSONObject r0 = X.C13700nu.A0K(r0)     // Catch:{ Exception -> 0x006c }
            r15.A00 = r0     // Catch:{ Exception -> 0x006c }
            goto L_0x0072
        L_0x006c:
            org.json.JSONObject r0 = X.C13700nu.A0J()
            r15.A00 = r0
        L_0x0072:
            boolean r0 = r0.optBoolean(r3)
            if (r0 != 0) goto L_0x008f
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r0 = 11
            int r1 = r1.get(r0)
            r0 = 9
            if (r1 < r0) goto L_0x008f
            r0 = 21
            if (r1 >= r0) goto L_0x008f
            r9 = 1
        L_0x008f:
            if (r9 != 0) goto L_0x00a2
            java.lang.String r0 = "PAY: BrazilPaymentStatusNotificationHelper/buildPaymentReminders - transaction skipped: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r8.A0L
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0008
        L_0x00a2:
            com.whatsapp.jid.UserJid r2 = r8.A0E
            if (r2 == 0) goto L_0x0008
            X.0sP r1 = r15.A02
            X.0sG r0 = r15.A01
            X.0sH r0 = r0.A0A(r2)
            java.lang.String r2 = r1.A08(r0)
            X.122 r6 = r15.A06
            X.0rv r5 = r8.A0C
            X.0t3 r0 = r15.A03
            long r0 = r0.A00()
            r3 = 39
            X.1sL r3 = r6.A08(r5, r3, r0)
            X.1sM r3 = (X.C39361sM) r3
            r11 = 3
            java.lang.Comparable[] r10 = new java.lang.Comparable[r11]
            r1 = 0
            com.whatsapp.jid.UserJid r0 = r8.A0E
            r10[r1] = r0
            r1 = 1
            java.lang.String r0 = r8.A0I
            r10[r1] = r0
            r6 = 2
            X.1Vy r0 = r8.A08
            java.lang.String r5 = ""
            r9 = r5
            if (r0 != 0) goto L_0x01b2
            r0 = r5
        L_0x00da:
            r10[r6] = r0
            java.util.List r1 = java.util.Arrays.asList(r10)
            java.lang.String r0 = ";"
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            r3.A02 = r0
            java.lang.String r1 = r8.A0I
            X.1Vy r0 = r8.A08
            java.lang.String r0 = X.C218315p.A08(r0, r1)
            r3.A03 = r0
            X.1Vy r0 = r8.A08
            if (r0 == 0) goto L_0x0100
            java.math.BigDecimal r0 = r0.A00
            int r0 = r0.intValue()
            java.lang.String r5 = java.lang.String.valueOf(r0)
        L_0x0100:
            r3.A01 = r5
            long r5 = r8.A05
            X.0t3 r0 = r7.A04
            long r0 = r0.A00()
            int r0 = X.C42681yF.A00(r0, r5)
            if (r0 != 0) goto L_0x0143
            X.013 r1 = r7.A06
            r0 = 270(0x10e, float:3.78E-43)
            java.lang.String r0 = r1.A08(r0)
        L_0x0118:
            r3.A04 = r0
            r3.A03 = r2
            X.0rv r2 = r8.A0C
            boolean r1 = r8.A0Q
            java.lang.String r5 = r8.A0L
            X.1Vw r0 = new X.1Vw
            r0.<init>(r2, r5, r1)
            r3.A02 = r0
            if (r13 == 0) goto L_0x01e9
            int r0 = r13.intValue()
            r3.A00 = r0
            org.json.JSONObject r2 = r15.A00
            if (r2 != 0) goto L_0x01cf
            X.0wT r0 = r15.A04
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "payments_nagged_transactions"
            java.lang.String r0 = r1.getString(r0, r9)
            goto L_0x01c2
        L_0x0143:
            r10 = 1
            if (r0 != r10) goto L_0x014f
            X.013 r1 = r7.A06
            r0 = 294(0x126, float:4.12E-43)
            java.lang.String r0 = r1.A08(r0)
            goto L_0x0118
        L_0x014f:
            r1 = 7
            if (r0 >= r1) goto L_0x0160
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r5)
            int r0 = r0.get(r1)
            switch(r0) {
                case 1: goto L_0x01a5;
                case 2: goto L_0x019d;
                case 3: goto L_0x0195;
                case 4: goto L_0x018d;
                case 5: goto L_0x0185;
                case 6: goto L_0x017d;
                case 7: goto L_0x0175;
                default: goto L_0x0160;
            }
        L_0x0160:
            X.0tz r0 = r7.A05
            android.content.Context r12 = r0.A00
            r11 = 2131892260(0x7f121824, float:1.9419263E38)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r1 = 0
            X.013 r0 = r7.A06
            java.lang.String r0 = X.C28891Zc.A01(r0, r5)
            java.lang.String r0 = X.C13680ns.A0d(r12, r0, r10, r1, r11)
            goto L_0x0118
        L_0x0175:
            X.0tz r0 = r7.A05
            android.content.Context r1 = r0.A00
            r0 = 2131892263(0x7f121827, float:1.941927E38)
            goto L_0x01ac
        L_0x017d:
            X.0tz r0 = r7.A05
            android.content.Context r1 = r0.A00
            r0 = 2131892261(0x7f121825, float:1.9419265E38)
            goto L_0x01ac
        L_0x0185:
            X.0tz r0 = r7.A05
            android.content.Context r1 = r0.A00
            r0 = 2131892265(0x7f121829, float:1.9419273E38)
            goto L_0x01ac
        L_0x018d:
            X.0tz r0 = r7.A05
            android.content.Context r1 = r0.A00
            r0 = 2131892267(0x7f12182b, float:1.9419277E38)
            goto L_0x01ac
        L_0x0195:
            X.0tz r0 = r7.A05
            android.content.Context r1 = r0.A00
            r0 = 2131892266(0x7f12182a, float:1.9419275E38)
            goto L_0x01ac
        L_0x019d:
            X.0tz r0 = r7.A05
            android.content.Context r1 = r0.A00
            r0 = 2131892262(0x7f121826, float:1.9419267E38)
            goto L_0x01ac
        L_0x01a5:
            X.0tz r0 = r7.A05
            android.content.Context r1 = r0.A00
            r0 = 2131892264(0x7f121828, float:1.9419271E38)
        L_0x01ac:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0118
        L_0x01b2:
            java.math.BigDecimal r0 = r0.A00
            java.math.BigDecimal r0 = r0.scaleByPowerOfTen(r11)
            long r0 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00da
        L_0x01c2:
            org.json.JSONObject r2 = X.C13700nu.A0K(r0)     // Catch:{ Exception -> 0x01c9 }
            r15.A00 = r2     // Catch:{ Exception -> 0x01c9 }
            goto L_0x01cf
        L_0x01c9:
            org.json.JSONObject r2 = X.C13700nu.A0J()
            r15.A00 = r2
        L_0x01cf:
            r0 = 1
            r2.put(r5, r0)     // Catch:{ Exception -> 0x01d4 }
            goto L_0x01da
        L_0x01d4:
            r1 = move-exception
            java.lang.String r0 = "BrazilPaymentStatusNotificationHelper/setNaggedTransaction/error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01da:
            X.0wT r0 = r15.A04
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences$Editor r1 = X.C110105dW.A06(r0)
            java.lang.String r0 = "payments_nagged_transactions"
            X.C13680ns.A0y(r1, r0, r2)
        L_0x01e9:
            r4.add(r3)
            goto L_0x0008
        L_0x01ee:
            java.lang.String r3 = "EMPTY"
            goto L_0x0020
        L_0x01f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201760p.A5l(java.util.List):java.util.List");
    }
}
