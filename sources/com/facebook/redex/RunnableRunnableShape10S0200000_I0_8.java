package com.facebook.redex;

public class RunnableRunnableShape10S0200000_I0_8 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape10S0200000_I0_8(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:523|524|525|526|527) */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x055b, code lost:
        if (r5.A04(r11, r0) == false) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x055f, code lost:
        if (r0 != null) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0561, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0562, code lost:
        if (r18 == 0) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0564, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0565, code lost:
        r8 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0569, code lost:
        r5 = r1.A02;
        r10 = X.C29501aj.A00(r3.A06, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0572, code lost:
        if (r6 != false) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0574, code lost:
        if (r5 == false) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0576, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0578, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x06e6, code lost:
        if (r8.A04(r11, r0) == false) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x06ea, code lost:
        if (r0 != null) goto L_0x06ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06ec, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06ed, code lost:
        if (r18 == 0) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06ef, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06f0, code lost:
        r13 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06f4, code lost:
        r1.A02.A0G(r4, r2, r13, r37, X.C29501aj.A00(r3.A06, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0704, code lost:
        if (r10 != false) goto L_0x070a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0706, code lost:
        if (r8 == false) goto L_0x070a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0708, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x070a, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0ac1, code lost:
        r2.A0G(r1, r3.getString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0ac8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0b3f, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0b42, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:521:0x0fe6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:526:0x0feb */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x06d7  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0719 A[SYNTHETIC, Splitter:B:238:0x0719] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0726 A[Catch:{ all -> 0x092d }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0775  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0996  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x09ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r46 = this;
            r17 = 0
            r5 = r46
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x00f1;
                case 1: goto L_0x014e;
                case 2: goto L_0x015f;
                case 3: goto L_0x0194;
                case 4: goto L_0x01c9;
                case 5: goto L_0x01da;
                case 6: goto L_0x01ee;
                case 7: goto L_0x0200;
                case 8: goto L_0x0234;
                case 9: goto L_0x0934;
                case 10: goto L_0x0942;
                case 11: goto L_0x0950;
                case 12: goto L_0x096d;
                case 13: goto L_0x0a8c;
                case 14: goto L_0x0aa2;
                case 15: goto L_0x0ab2;
                case 16: goto L_0x0ac9;
                case 17: goto L_0x0b43;
                case 18: goto L_0x0bba;
                case 19: goto L_0x0c02;
                case 20: goto L_0x0009;
                case 21: goto L_0x0009;
                case 22: goto L_0x0c1d;
                case 23: goto L_0x0ca0;
                case 24: goto L_0x0caf;
                case 25: goto L_0x0cd8;
                case 26: goto L_0x0ced;
                case 27: goto L_0x0cff;
                case 28: goto L_0x0d0b;
                case 29: goto L_0x0d19;
                case 30: goto L_0x0d3c;
                case 31: goto L_0x0d4a;
                case 32: goto L_0x0d6c;
                case 33: goto L_0x0d8f;
                case 34: goto L_0x0dc3;
                case 35: goto L_0x0dde;
                case 36: goto L_0x0dec;
                case 37: goto L_0x0e05;
                case 38: goto L_0x0e27;
                case 39: goto L_0x0e3e;
                case 40: goto L_0x0e4a;
                case 41: goto L_0x0e73;
                case 42: goto L_0x0e7f;
                case 43: goto L_0x0ea9;
                case 44: goto L_0x0ec8;
                case 45: goto L_0x0f3f;
                case 46: goto L_0x0f62;
                case 47: goto L_0x0f6f;
                case 48: goto L_0x0fef;
                case 49: goto L_0x1025;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller r3 = (com.obwhatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller) r3
            java.lang.Object r2 = r5.A01
            X.4L4 r2 = (X.AnonymousClass4L4) r2
            X.0tz r0 = r3.A04
            android.content.Context r0 = r0.A00
            java.lang.String r4 = r2.A02
            java.lang.String r23 = X.AnonymousClass3A8.A00(r0, r4)
            java.lang.String r0 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r7 = r3.A05
            X.01D r6 = r7.A01
            java.lang.Object r5 = r6.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r1 = "com.obwhatsapp.registration.RegisterPhone.mistyped_state"
            r0 = r17
            java.lang.String r13 = r5.getString(r1, r0)
            X.01V r0 = r3.A02
            android.telephony.TelephonyManager r1 = r0.A0N()
            if (r1 == 0) goto L_0x0070
            java.lang.String r0 = r1.getNetworkOperator()
        L_0x003e:
            X.2Hf r10 = X.C47032Hf.A00(r0)
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = r1.getSimOperator()
        L_0x0048:
            X.2Hf r11 = X.C47032Hf.A00(r0)
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r5 = "reg_attempts_fetch_device_confirmation"
            r0 = 0
            int r0 = r1.getInt(r5, r0)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r7.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r5, r1)
            r0.apply()
            X.2Hc r7 = new X.2Hc
            r7.<init>(r1)
            r1 = -1
            goto L_0x0073
        L_0x006d:
            r0 = r17
            goto L_0x0048
        L_0x0070:
            r0 = r17
            goto L_0x003e
        L_0x0073:
            X.1KP r5 = r3.A06     // Catch:{ Exception -> 0x104d }
            java.lang.String r0 = r2.A01     // Catch:{ Exception -> 0x104d }
            java.lang.Object r9 = r6.get()     // Catch:{ Exception -> 0x104d }
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9     // Catch:{ Exception -> 0x104d }
            java.lang.String r8 = "registration_failure_reason"
            java.lang.String r6 = ""
            java.lang.String r12 = r9.getString(r8, r6)     // Catch:{ Exception -> 0x104d }
            r5.A08()     // Catch:{ Exception -> 0x104d }
            byte[] r27 = r5.A0C(r0, r4)     // Catch:{ Exception -> 0x104d }
            java.lang.String r6 = "fetchAccountDefenceDeviceConfirmation"
            byte[] r28 = r5.A0B(r6)     // Catch:{ Exception -> 0x104d }
            java.lang.String r6 = "http/registration/wamsys/fetchAccountDefenceDeviceConfirmation"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ Exception -> 0x104d }
            r8 = r5
            r9 = r7
            java.util.Map r26 = r8.A06(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x104d }
            X.1SU r6 = r5.A0L     // Catch:{ Exception -> 0x104d }
            java.lang.String r7 = "fetch_device_confirm_entrypoint"
            java.lang.String r24 = r5.A03(r0, r7)     // Catch:{ Exception -> 0x104d }
            java.util.List r25 = r5.A04()     // Catch:{ Exception -> 0x104d }
            X.1S0 r5 = r5.A00     // Catch:{ Exception -> 0x104d }
            r29 = 1
            com.obwhatsapp.wamsys.IDxARunnableShape0S4600000_2_I1 r18 = new com.obwhatsapp.wamsys.IDxARunnableShape0S4600000_2_I1     // Catch:{ Exception -> 0x104d }
            r19 = r5
            r20 = r6
            r21 = r0
            r22 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x104d }
            java.lang.Object r5 = X.C31591ei.A00(r18)     // Catch:{ Exception -> 0x104d }
            X.4Mc r5 = (X.C84844Mc) r5     // Catch:{ Exception -> 0x104d }
            if (r5 != 0) goto L_0x00d2
            java.lang.String r0 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/result is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x104d }
            r0 = r17
            r3.A01(r0, r2)     // Catch:{ Exception -> 0x104d }
            X.5S6 r0 = r2.A00     // Catch:{ Exception -> 0x104d }
            r0.AQR(r1)     // Catch:{ Exception -> 0x104d }
            return
        L_0x00d2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x104d }
            r4.<init>()     // Catch:{ Exception -> 0x104d }
            java.lang.String r0 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/success status:"
            r4.append(r0)     // Catch:{ Exception -> 0x104d }
            int r0 = r5.A00     // Catch:{ Exception -> 0x104d }
            r4.append(r0)     // Catch:{ Exception -> 0x104d }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x104d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x104d }
            r3.A01(r5, r2)     // Catch:{ Exception -> 0x104d }
            X.5S6 r0 = r2.A00     // Catch:{ Exception -> 0x104d }
            r0.AOt(r5)     // Catch:{ Exception -> 0x104d }
            return
        L_0x00f1:
            java.lang.Object r1 = r5.A00
            X.13A r1 = (X.AnonymousClass13A) r1
            java.lang.Object r0 = r5.A01
            X.0vs r0 = (X.C17930vs) r0
            X.0yO r7 = r1.A0A
            r6 = 1
            X.1C5 r9 = new X.1C5
            r9.<init>()
            X.1C5 r8 = new X.1C5
            r8.<init>()
            X.0uz r0 = r0.entrySet()
            X.1Ub r5 = r0.iterator()
        L_0x010e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0139
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getValue()
            X.2TX r3 = (X.AnonymousClass2TX) r3
            java.lang.Object r2 = r4.getKey()
            long r0 = r3.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r9.put(r2, r1)
            com.whatsapp.jid.DeviceJid r0 = r3.A02
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r4.getKey()
            r8.put(r0, r1)
            goto L_0x010e
        L_0x0139:
            X.0vs r0 = r9.build()
            r7.A0D(r0, r6, r6)
            X.0vs r1 = r8.build()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x1069
            r7.A0D(r1, r6, r6)
            return
        L_0x014e:
            java.lang.Object r1 = r5.A00
            X.1Sf r1 = (X.C27561Sf) r1
            java.lang.Object r0 = r5.A01
            X.0xU r2 = r1.A07
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 1
            r2.A0T(r1, r0)
            return
        L_0x015f:
            java.lang.Object r1 = r5.A00
            X.1Sf r1 = (X.C27561Sf) r1
            java.lang.Object r0 = r5.A01
            X.1br r0 = (X.C30161br) r0
            X.1St r3 = r1.A0U
            X.0tZ r2 = r0.A0B
            java.lang.String r1 = r0.A0o
            com.whatsapp.jid.Jid r0 = r0.A01()
            X.0rv r0 = X.C16030sJ.A00(r0)
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r3.A04(r2)
            if (r0 == 0) goto L_0x1069
            r5 = r17
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r1
            X.2TW r1 = r3.A01(r4, r5, r6, r7, r8, r9)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            r3.A03(r1, r2)
            return
        L_0x0194:
            java.lang.Object r3 = r5.A00
            X.1Sf r3 = (X.C27561Sf) r3
            java.lang.Object r2 = r5.A01
            X.1br r2 = (X.C30161br) r2
            X.1Vw r1 = r2.A0C
            if (r1 != 0) goto L_0x01a2
            X.1Vw r1 = r2.A0m
        L_0x01a2:
            X.0t6 r0 = r3.A0E
            X.0th r0 = r0.A0K
            X.0tZ r0 = r0.A03(r1)
            if (r0 != 0) goto L_0x1069
            java.lang.String r0 = "Dropping message "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " due to message with old counter"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0w1 r1 = r3.A03
            r0 = 3
            r1.A0K(r2, r0)
            return
        L_0x01c9:
            java.lang.Object r0 = r5.A00
            X.1Sf r0 = (X.C27561Sf) r0
            java.lang.Object r2 = r5.A01
            X.0tT r2 = (X.C16690tT) r2
            X.0sq r1 = r0.A0V
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Ack(r2, r0)
            return
        L_0x01da:
            java.lang.Object r2 = r5.A00
            X.1Sk r2 = (X.C27601Sk) r2
            java.lang.Object r1 = r5.A01
            X.1br r1 = (X.C30161br) r1
            r0 = 31
            X.0tZ r1 = r1.A02(r0)
            X.0t6 r0 = r2.A0Q
            r0.A0u(r1)
            return
        L_0x01ee:
            java.lang.Object r0 = r5.A00
            X.1Sk r0 = (X.C27601Sk) r0
            java.lang.Object r3 = r5.A01
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            X.0yO r2 = r0.A0c
            java.lang.String r1 = "unknown_companion"
            r0 = 0
            r2.A0A(r3, r1, r0, r0)
            return
        L_0x0200:
            java.lang.Object r4 = r5.A00
            X.1Sb r4 = (X.C27521Sb) r4
            java.lang.Object r3 = r5.A01
            X.0y7 r2 = r4.A04
            java.util.List r0 = java.util.Collections.singletonList(r3)
            X.2Tb r1 = new X.2Tb
            r1.<init>(r0)
            X.1mi r0 = r2.A02
            r0.A01(r1)
            X.1SL r0 = r4.A05
            java.util.List r2 = java.util.Collections.singletonList(r3)
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0224:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1069
            java.lang.Object r0 = r1.next()
            X.27N r0 = (X.AnonymousClass27N) r0
            r0.AN7(r2)
            goto L_0x0224
        L_0x0234:
            java.lang.Object r1 = r5.A00
            X.1Sb r1 = (X.C27521Sb) r1
            java.lang.Object r8 = r5.A01
            X.2eM r8 = (X.C52732eM) r8
            X.1ci r3 = r8.A05
            X.1Vw r2 = r8.A02
            byte[] r13 = r8.A0A
            int r0 = r8.A00
            r37 = r0
            long r4 = r8.A01
            r40 = r4
            byte[] r9 = r8.A09
            byte[] r11 = r8.A08
            X.1dG r7 = r8.A04
            X.1dG r6 = r8.A03
            boolean r14 = r8.A07
            r27 = 5
            int r22 = X.C28641Wx.A00(r13)
            java.lang.String r0 = "axolotl got retry request "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            r0 = r37
            r8.append(r0)
            java.lang.String r0 = " for "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = " with "
            r8.append(r0)
            r0 = r22
            r8.append(r0)
            java.lang.String r0 = " originally sent at "
            r8.append(r0)
            r8.append(r4)
            java.lang.String r0 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11o r8 = r1.A0L
            long r4 = r3.A00
            r0 = 1
            X.1d2 r5 = r8.A00(r0, r4)
            r4 = 4
            r0 = r37
            if (r0 <= r4) goto L_0x02ac
            java.lang.String r4 = "axolotl skipping retry for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x02a3:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x02a6:
            X.124 r0 = r1.A0K
            r0.A02(r3)
            return
        L_0x02ac:
            if (r5 == 0) goto L_0x02b2
            r0 = 3
            r5.A00(r0)
        L_0x02b2:
            X.0rv r5 = r2.A00
            boolean r21 = X.C16030sJ.A0L(r5)
            boolean r20 = X.C16030sJ.A0G(r5)
            X.0t6 r0 = r1.A0B
            X.0th r8 = r0.A0K
            X.0tZ r0 = r8.A03(r2)
            if (r0 != 0) goto L_0x02dc
            X.15G r0 = r1.A0F
            X.1qx r0 = r0.A05(r2)
            r4 = 0
            if (r0 != 0) goto L_0x02dc
            if (r21 == 0) goto L_0x02dc
            java.lang.String r10 = r2.A01
            X.1Vw r0 = new X.1Vw
            r0.<init>(r5, r10, r4)
            X.0tZ r0 = r8.A03(r0)
        L_0x02dc:
            X.1RV r4 = r1.A0M
            r4.A00(r0)
            if (r0 == 0) goto L_0x02f9
            long r4 = r0.A0I
            X.0t3 r10 = r1.A06
            long r18 = r10.A00()
            r15 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r18 = r18 - r15
            int r10 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r10 >= 0) goto L_0x02f9
            java.lang.String r0 = "axolotl cannot send retry to older message"
            goto L_0x02a3
        L_0x02f9:
            boolean r4 = r0 instanceof X.C39131ry
            if (r4 == 0) goto L_0x0300
            java.lang.String r0 = "axolotl cannot send retry to transient message"
            goto L_0x02a3
        L_0x0300:
            if (r0 == 0) goto L_0x0304
            X.1Vw r2 = r0.A11
        L_0x0304:
            if (r21 != 0) goto L_0x046d
            if (r20 != 0) goto L_0x046d
            com.whatsapp.jid.Jid r4 = r3.A01
        L_0x030a:
            com.whatsapp.jid.DeviceJid r12 = com.whatsapp.jid.DeviceJid.of(r4)
            X.1HF r4 = r1.A0E
            r18 = 0
            if (r0 == 0) goto L_0x0336
            if (r12 == 0) goto L_0x0336
            X.16V r5 = r4.A05
            boolean r4 = r0 instanceof X.C38541qx
            if (r4 == 0) goto L_0x0469
            X.179 r4 = r5.A01
        L_0x031e:
            X.1yA r4 = r4.A00(r0)
            java.util.concurrent.ConcurrentHashMap r4 = r4.A00
            java.lang.Object r4 = r4.get(r12)
            X.1yB r4 = (X.C42651yB) r4
            if (r4 == 0) goto L_0x0336
            long r4 = r4.A00
            r15 = 0
            int r10 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0336
            r18 = 1
        L_0x0336:
            com.whatsapp.jid.UserJid r10 = r3.A03
            boolean r4 = r0 instanceof X.C38841rV
            if (r4 == 0) goto L_0x0465
            r4 = r0
            X.1rV r4 = (X.C38841rV) r4
            int r4 = r4.A00
            if (r4 <= 0) goto L_0x0465
            java.lang.Integer r19 = java.lang.Integer.valueOf(r4)
        L_0x0347:
            if (r21 != 0) goto L_0x0484
            if (r20 != 0) goto L_0x0484
            if (r9 == 0) goto L_0x0365
            if (r6 == 0) goto L_0x0365
            if (r7 == 0) goto L_0x0365
            if (r12 == 0) goto L_0x0471
            X.137 r4 = r1.A0G
            r28 = 3
            r23 = r4
            r24 = r12
            r25 = r11
            r26 = r9
            boolean r4 = r23.A0C(r24, r25, r26, r27, r28)
            if (r4 == 0) goto L_0x0471
        L_0x0365:
            com.whatsapp.jid.Jid r5 = r3.A01
            com.whatsapp.jid.DeviceJid r24 = com.whatsapp.jid.DeviceJid.of(r5)
            r23 = r1
            r25 = r2
            r26 = r7
            r27 = r6
            r28 = r13
            r29 = r9
            r30 = r37
            r31 = r22
            r32 = r14
            byte[] r25 = r23.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r11 = 0
            if (r25 == 0) goto L_0x0385
            r11 = 1
        L_0x0385:
            X.124 r4 = r1.A0K
            r4.A02(r3)
            com.whatsapp.jid.DeviceJid r4 = com.whatsapp.jid.DeviceJid.of(r5)
            X.AnonymousClass00B.A06(r4)
            java.lang.String r6 = "axolotl unable to resend "
            r5 = 0
            if (r0 != 0) goto L_0x03c1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r2)
            java.lang.String r0 = "; message gone"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0w1 r7 = r1.A02
            java.lang.String r0 = r3.A06
            int r12 = X.C29501aj.A00(r0, r5)
        L_0x03b5:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
        L_0x03b9:
            r8 = r4
            r9 = r2
            r11 = r37
            r7.A0G(r8, r9, r10, r11, r12)
            return
        L_0x03c1:
            X.16V r7 = r1.A0D
            java.util.Set r7 = r7.A00(r2)
            boolean r8 = r7.contains(r4)
            r9 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x0431
            java.lang.String r0 = "MessagingXmppHandler/onMessageDecryptionFailureRetry/Not processing retry for "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r0 = " since isn't an originally intended recipient"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            byte r0 = r4.device
            if (r0 == 0) goto L_0x03fa
            X.0z2 r6 = r1.A0H
            com.whatsapp.jid.UserJid r0 = r4.getUserJid()
            java.util.Set r0 = r6.A0D(r0)
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0417
        L_0x03fa:
            X.0w1 r8 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            X.3qz r6 = new X.3qz
            r6.<init>()
            r6.A00 = r0
            byte r0 = r4.device
            if (r0 != 0) goto L_0x042f
            r0 = 1
        L_0x040c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A01 = r0
            X.0t9 r0 = r8.A0C
            r0.A06(r6)
        L_0x0417:
            com.whatsapp.jid.UserJid r0 = r4.getUserJid()
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()
            boolean r6 = r7.contains(r0)
            X.0w1 r7 = r1.A02
            java.lang.String r0 = r3.A06
            int r12 = X.C29501aj.A00(r0, r5)
            if (r6 != 0) goto L_0x03b5
            r5 = 2
            goto L_0x03b5
        L_0x042f:
            r0 = 2
            goto L_0x040c
        L_0x0431:
            if (r18 == 0) goto L_0x07ee
            java.lang.String r0 = "axolotl original message already marked delivered; message.key="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r2)
            java.lang.String r0 = ", remoteJid="
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0w1 r7 = r1.A02
            java.lang.String r3 = r3.A06
            java.lang.String r0 = "7"
            boolean r1 = r0.equalsIgnoreCase(r3)
            r0 = r37
            r7.A0F(r4, r2, r0, r1)
            int r12 = X.C29501aj.A00(r3, r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            goto L_0x03b9
        L_0x0465:
            r19 = 0
            goto L_0x0347
        L_0x0469:
            X.17B r4 = r5.A02
            goto L_0x031e
        L_0x046d:
            com.whatsapp.jid.Jid r4 = r3.A02
            goto L_0x030a
        L_0x0471:
            java.lang.String r2 = "MessagingXmppHandler/onMessageDecryptionFailureRetry/adv validation fails, key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x02a6
        L_0x0484:
            com.whatsapp.jid.Jid r4 = r3.A01
            r21 = r4
            r5 = r4
            boolean r4 = r4 instanceof X.C16060sN
            if (r4 == 0) goto L_0x05f2
            X.0sN r5 = (X.C16060sN) r5
        L_0x048f:
            X.AnonymousClass00B.A06(r5)
            com.whatsapp.jid.Jid r4 = r3.A02
            com.whatsapp.jid.DeviceJid r4 = com.whatsapp.jid.DeviceJid.of(r4)
            X.AnonymousClass00B.A06(r4)
            java.lang.String r6 = "axolotl checking group/broadcast list membership due to retry receipt; key="
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r2)
            java.lang.String r6 = "; groupJid="
            r7.append(r6)
            r7.append(r5)
            java.lang.String r9 = "; individualDeviceJid="
            r7.append(r9)
            r7.append(r4)
            java.lang.String r6 = r7.toString()
            com.whatsapp.util.Log.i((java.lang.String) r6)
            X.0sO r6 = r1.A0C
            X.0us r6 = r6.A07
            X.1cE r7 = r6.A04(r5)
            com.whatsapp.jid.UserJid r6 = r4.getUserJid()
            X.1ck r6 = r7.A05(r6)
            if (r6 != 0) goto L_0x05ea
            r6 = 0
        L_0x04cf:
            r7 = 0
            r13 = 0
            if (r6 == 0) goto L_0x04d4
            r13 = 1
        L_0x04d4:
            if (r0 != 0) goto L_0x0580
            java.lang.String r10 = "axolotl original message has been deleted; message.key="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r10)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.whatsapp.util.Log.w((java.lang.String) r6)
        L_0x04e7:
            r12 = 0
        L_0x04e8:
            java.lang.String r10 = "axolotl isCurrentlyInGroup="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r10)
            r6.append(r13)
            java.lang.String r14 = "; wasInGroupAtTimeOfMessage="
            r6.append(r14)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r6)
            com.whatsapp.jid.UserJid r6 = r4.getUserJid()
            com.whatsapp.jid.DeviceJid r11 = r6.getPrimaryDevice()
            X.0pd r6 = r1.A0I
            r20 = r6
            r15 = 1941(0x795, float:2.72E-42)
            X.0tM r16 = X.C16620tM.A02
            r10 = r6
            r6 = r16
            boolean r6 = r10.A0E(r6, r15)
            if (r6 != 0) goto L_0x0548
            byte r6 = r4.device
            if (r6 == 0) goto L_0x0548
            if (r12 != 0) goto L_0x0548
            if (r0 == 0) goto L_0x0548
            X.16V r10 = r1.A0D
            boolean r6 = r0 instanceof X.C38541qx
            if (r6 == 0) goto L_0x0545
            X.179 r6 = r10.A01
        L_0x052a:
            boolean r6 = r6.A04(r11, r0)
            if (r6 == 0) goto L_0x0548
            X.0w1 r5 = r1.A02
            java.lang.String r0 = r3.A06
            int r10 = X.C29501aj.A00(r0, r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r18)
        L_0x053c:
            r6 = r4
            r7 = r2
            r9 = r37
            r5.A0G(r6, r7, r8, r9, r10)
            goto L_0x02a6
        L_0x0545:
            X.17B r6 = r10.A02
            goto L_0x052a
        L_0x0548:
            if (r13 != 0) goto L_0x05f5
            if (r12 != 0) goto L_0x05f5
            if (r0 == 0) goto L_0x055d
            X.16V r6 = r1.A0D
            boolean r5 = r0 instanceof X.C38541qx
            if (r5 == 0) goto L_0x057d
            X.179 r5 = r6.A01
        L_0x0556:
            boolean r5 = r5.A04(r11, r0)
            r6 = 1
            if (r5 != 0) goto L_0x0561
        L_0x055d:
            r6 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0562
        L_0x0561:
            r5 = 1
        L_0x0562:
            if (r18 == 0) goto L_0x0572
            r0 = 1
        L_0x0565:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x0569:
            X.0w1 r5 = r1.A02
            java.lang.String r0 = r3.A06
            int r10 = X.C29501aj.A00(r0, r7)
            goto L_0x053c
        L_0x0572:
            if (r6 != 0) goto L_0x0578
            if (r5 == 0) goto L_0x0578
            r0 = 2
            goto L_0x0565
        L_0x0578:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            goto L_0x0569
        L_0x057d:
            X.17B r5 = r6.A02
            goto L_0x0556
        L_0x0580:
            if (r18 == 0) goto L_0x05a4
            java.lang.String r10 = "axolotl original message already marked delivered; message.key="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r10)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.whatsapp.util.Log.w((java.lang.String) r6)
            X.0w1 r11 = r1.A02
            java.lang.String r10 = r3.A06
            java.lang.String r6 = "7"
            boolean r10 = r6.equals(r10)
            r6 = r37
            r11.A0F(r4, r2, r6, r10)
            goto L_0x04e7
        L_0x05a4:
            X.16V r10 = r1.A0D
            boolean r6 = r0 instanceof X.C38541qx
            if (r6 == 0) goto L_0x05e7
            X.179 r6 = r10.A01
        L_0x05ac:
            boolean r12 = r6.A04(r4, r0)
            if (r12 != 0) goto L_0x04e8
            byte r6 = r4.device
            if (r6 == 0) goto L_0x05c6
            X.0z2 r10 = r1.A0H
            com.whatsapp.jid.UserJid r6 = r4.getUserJid()
            java.util.Set r6 = r10.A0D(r6)
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto L_0x04e8
        L_0x05c6:
            X.0w1 r11 = r1.A02
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r14)
            X.3qz r10 = new X.3qz
            r10.<init>()
            r10.A00 = r6
            byte r6 = r4.device
            if (r6 != 0) goto L_0x05e5
            r6 = 1
        L_0x05d8:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.A01 = r6
            X.0t9 r6 = r11.A0C
            r6.A06(r10)
            goto L_0x04e8
        L_0x05e5:
            r6 = 2
            goto L_0x05d8
        L_0x05e7:
            X.17B r6 = r10.A02
            goto L_0x05ac
        L_0x05ea:
            java.util.concurrent.ConcurrentHashMap r6 = r6.A04
            java.lang.Object r6 = r6.get(r4)
            goto L_0x04cf
        L_0x05f2:
            r5 = 0
            goto L_0x048f
        L_0x05f5:
            java.lang.String r6 = "axolotl resending group/broadcast list message; message.key="
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r2)
            java.lang.String r6 = "; participantDevice="
            r10.append(r6)
            r10.append(r4)
            java.lang.String r6 = "; isCurrentlyInGroup="
            r10.append(r6)
            r10.append(r13)
            r10.append(r14)
            r10.append(r12)
            java.lang.String r6 = r10.toString()
            com.whatsapp.util.Log.i((java.lang.String) r6)
            X.1iD r6 = X.C33211iD.A0o
            X.1Wr r6 = r6.A0U()
            X.1iE r6 = (X.C33221iE) r6
            if (r13 == 0) goto L_0x0671
            X.0rt r10 = r1.A0A
            boolean r13 = X.C38621r6.A0Y(r10, r0)
            X.0sK r10 = r1.A01
            if (r13 == 0) goto L_0x0712
            X.1ZY r10 = r10.A02()
        L_0x0634:
            X.AnonymousClass00B.A06(r10)
            X.1Yb r14 = X.C28851Ya.A02(r10)
            java.lang.String r13 = r5.getRawString()
            X.1dH r10 = new X.1dH
            r10.<init>(r14, r13)
            X.11s r13 = r1.A07
            X.1n0 r10 = r13.A0C(r10)
            byte[] r14 = r10.A01
            X.AnonymousClass00B.A06(r14)
            X.1Wm r10 = r6.A00
            X.1iD r10 = (X.C33211iD) r10
            X.2tY r10 = r10.A0h
            if (r10 != 0) goto L_0x0659
            X.2tY r10 = X.C58472tY.A03
        L_0x0659:
            X.1Wr r13 = r10.A0U()
            X.3fL r13 = (X.C69623fL) r13
            java.lang.String r10 = r5.getRawString()
            r13.A06(r10)
            int r10 = r14.length
            X.1Ww r10 = X.C28631Ww.A01(r14, r7, r10)
            r13.A05(r10)
            r6.A0B(r13)
        L_0x0671:
            r25 = 0
            if (r12 == 0) goto L_0x06d7
            boolean r10 = X.C16030sJ.A0H(r21)
            if (r10 == 0) goto L_0x06d2
            com.whatsapp.jid.UserJid r13 = r3.A00()
            boolean r12 = r2.A02
            java.lang.String r11 = r2.A01
            X.1Vw r10 = new X.1Vw
            r10.<init>(r13, r11, r12)
            X.0tZ r8 = r8.A03(r10)
            if (r8 != 0) goto L_0x06cd
            X.0sK r8 = r1.A01
            boolean r8 = r8.A0J(r4)
            if (r8 == 0) goto L_0x06ba
            r31 = r17
        L_0x0698:
            X.1GC r12 = r1.A0N
            X.0sK r11 = r1.A01
            com.whatsapp.wamsys.JniBridge r10 = r1.A0P
            X.21Q r8 = new X.21Q
            r26 = r8
            r27 = r11
            r28 = r17
            r29 = r20
            r30 = r6
            r32 = r10
            r33 = r17
            r34 = r7
            r35 = r7
            r36 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r12.A01(r0, r8)
        L_0x06ba:
            X.1Wm r6 = r6.A02()
            X.1iD r6 = (X.C33211iD) r6
            X.1Yb r8 = X.C28851Ya.A02(r4)
            X.0xT r7 = r1.A09
            java.util.concurrent.locks.Lock r11 = r7.A02(r8)
            if (r11 == 0) goto L_0x071c
            goto L_0x0719
        L_0x06cd:
            X.1WV r31 = X.C40491uD.A01(r8)
            goto L_0x0698
        L_0x06d2:
            X.1WV r31 = X.C40491uD.A01(r0)
            goto L_0x0698
        L_0x06d7:
            if (r0 == 0) goto L_0x06e8
            X.16V r10 = r1.A0D
            boolean r8 = r0 instanceof X.C38541qx
            if (r8 == 0) goto L_0x070f
            X.179 r8 = r10.A01
        L_0x06e1:
            boolean r8 = r8.A04(r11, r0)
            r10 = 1
            if (r8 != 0) goto L_0x06ec
        L_0x06e8:
            r10 = 0
            r8 = 0
            if (r0 == 0) goto L_0x06ed
        L_0x06ec:
            r8 = 1
        L_0x06ed:
            if (r18 == 0) goto L_0x0704
            r8 = 1
        L_0x06f0:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
        L_0x06f4:
            X.0w1 r10 = r1.A02
            java.lang.String r8 = r3.A06
            int r15 = X.C29501aj.A00(r8, r7)
            r11 = r4
            r12 = r2
            r14 = r37
            r10.A0G(r11, r12, r13, r14, r15)
            goto L_0x06ba
        L_0x0704:
            if (r10 != 0) goto L_0x070a
            if (r8 == 0) goto L_0x070a
            r8 = 2
            goto L_0x06f0
        L_0x070a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            goto L_0x06f4
        L_0x070f:
            X.17B r8 = r10.A02
            goto L_0x06e1
        L_0x0712:
            r10.A0B()
            X.1Za r10 = r10.A04
            goto L_0x0634
        L_0x0719:
            r11.lock()     // Catch:{ all -> 0x092d }
        L_0x071c:
            X.11s r7 = r1.A07     // Catch:{ all -> 0x092d }
            X.1ev r10 = r7.A0D(r8)     // Catch:{ all -> 0x092d }
            boolean r7 = r10.A00     // Catch:{ all -> 0x092d }
            if (r7 != 0) goto L_0x0773
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x092d }
            r8.<init>()     // Catch:{ all -> 0x092d }
            java.lang.String r7 = "axolotl checking conditions for group retry to individual; message.key="
            r8.append(r7)     // Catch:{ all -> 0x092d }
            r8.append(r2)     // Catch:{ all -> 0x092d }
            r8.append(r9)     // Catch:{ all -> 0x092d }
            r8.append(r4)     // Catch:{ all -> 0x092d }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x092d }
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ all -> 0x092d }
            r8 = 2
            r7 = r37
            if (r7 >= r8) goto L_0x074f
            X.1ms r7 = r10.A01     // Catch:{ all -> 0x092d }
            X.1mt r7 = r7.A00     // Catch:{ all -> 0x092d }
            int r8 = r7.A03     // Catch:{ all -> 0x092d }
            r7 = r22
            if (r8 == r7) goto L_0x0773
        L_0x074f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x092d }
            r8.<init>()     // Catch:{ all -> 0x092d }
            java.lang.String r7 = "axolotl requiring new session before resending; message.key="
            r8.append(r7)     // Catch:{ all -> 0x092d }
            r8.append(r2)     // Catch:{ all -> 0x092d }
            r8.append(r9)     // Catch:{ all -> 0x092d }
            r8.append(r4)     // Catch:{ all -> 0x092d }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x092d }
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ all -> 0x092d }
            X.1ms r7 = r10.A01     // Catch:{ all -> 0x092d }
            X.1mt r7 = r7.A00     // Catch:{ all -> 0x092d }
            X.1Ww r7 = r7.A05     // Catch:{ all -> 0x092d }
            byte[] r25 = r7.A04()     // Catch:{ all -> 0x092d }
        L_0x0773:
            if (r11 == 0) goto L_0x0778
            r11.unlock()
        L_0x0778:
            X.0t3 r7 = r1.A06
            long r8 = r7.A00()
            java.lang.String r11 = r2.A01
            java.util.Set r24 = java.util.Collections.emptySet()
            X.0yS r10 = r1.A0O
            X.AnonymousClass00B.A06(r11)
            X.AnonymousClass00B.A06(r5)
            X.AnonymousClass00B.A06(r6)
            X.AnonymousClass00B.A06(r24)
            X.AnonymousClass00B.A06(r10)
            r33 = 86400000(0x5265c00, double:4.2687272E-316)
            long r33 = r33 + r8
            if (r0 == 0) goto L_0x07e9
            byte r9 = r0.A10
            int r29 = r0.A07()
            int r8 = r0.A01
        L_0x07a4:
            long r31 = android.os.SystemClock.uptimeMillis()
            long r35 = r7.A00()
            r39 = 0
            r7 = 1785(0x6f9, float:2.501E-42)
            r2 = r20
            r0 = r16
            boolean r45 = r2.A0E(r0, r7)
            com.obwhatsapp.jobqueue.job.SendE2EMessageJob r0 = new com.obwhatsapp.jobqueue.job.SendE2EMessageJob
            r18 = r10
            r20 = r11
            r21 = r17
            r22 = r17
            r23 = r17
            r26 = r17
            r27 = r9
            r28 = r37
            r30 = r8
            r37 = r40
            r40 = r39
            r41 = r39
            r42 = r39
            r43 = r39
            r44 = r39
            r12 = r0
            r13 = r4
            r14 = r5
            r15 = r17
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r39, r40, r41, r42, r43, r44, r45)
            X.0xb r2 = r1.A03
            r2.A00(r0)
            goto L_0x02a6
        L_0x07e9:
            r9 = -1
            r29 = 0
            r8 = 0
            goto L_0x07a4
        L_0x07ee:
            java.lang.String r7 = "axolotl resending "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r2)
            java.lang.String r3 = " Recipient="
            r5.append(r3)
            r5.append(r10)
            java.lang.String r3 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r3 = r37
            r0.A0B = r3
            if (r11 == 0) goto L_0x08e1
            java.lang.String r5 = "axolotl reinjecting send e2e job; originalMessageKey="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.1iD r3 = X.C33211iD.A0o
            X.1Wr r7 = r3.A0U()
            X.1iE r7 = (X.C33221iE) r7
            X.1GC r11 = r1.A0N
            X.0pd r5 = r1.A0I
            X.0sK r9 = r1.A01
            com.whatsapp.wamsys.JniBridge r8 = r1.A0P
            X.1WV r31 = X.C40491uD.A01(r0)
            r39 = 0
            X.21Q r3 = new X.21Q
            r26 = r3
            r27 = r9
            r28 = r17
            r29 = r5
            r30 = r7
            r32 = r8
            r33 = r17
            r34 = r39
            r35 = r39
            r36 = r39
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r11.A01(r0, r3)
            X.0t3 r3 = r1.A06
            long r33 = r3.A00()
            if (r4 == 0) goto L_0x08c8
            boolean r8 = r4.isProtocolCompliant()
            if (r8 == 0) goto L_0x08c8
            java.lang.String r9 = r2.A01
            X.1Wm r2 = r7.A02()
            X.1iD r2 = (X.C33211iD) r2
            java.util.Set r24 = java.util.Collections.emptySet()
            X.0yS r8 = r1.A0O
            X.AnonymousClass00B.A06(r9)
            X.AnonymousClass00B.A06(r4)
            X.AnonymousClass00B.A06(r2)
            X.AnonymousClass00B.A06(r24)
            X.AnonymousClass00B.A06(r8)
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r33 = r33 + r6
            byte r7 = r0.A10
            int r29 = r0.A07()
            int r6 = r0.A01
            long r31 = android.os.SystemClock.uptimeMillis()
            long r35 = r3.A00()
            r3 = 1785(0x6f9, float:2.501E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r45 = r5.A0E(r0, r3)
            com.obwhatsapp.jobqueue.job.SendE2EMessageJob r0 = new com.obwhatsapp.jobqueue.job.SendE2EMessageJob
            r12 = r0
            r13 = r17
            r14 = r4
            r15 = r10
            r16 = r2
            r18 = r8
            r20 = r9
            r21 = r13
            r22 = r13
            r23 = r13
            r26 = r13
            r27 = r7
            r28 = r37
            r30 = r6
            r37 = r40
            r40 = r39
            r41 = r39
            r42 = r39
            r43 = r39
            r44 = r39
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r39, r40, r41, r42, r43, r44, r45)
            X.0xb r1 = r1.A03
            r1.A00(r0)
            return
        L_0x08c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r2)
            java.lang.String r0 = "; jid is invalid: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            goto L_0x0b3f
        L_0x08e1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r2)
            java.lang.String r2 = " immediately"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0y3 r6 = r1.A0J
            X.0t3 r5 = r6.A06
            java.util.HashSet r18 = new java.util.HashSet
            r18.<init>()
            long r1 = r5.A00()
            r21 = 0
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r3 != 0) goto L_0x0913
            boolean r1 = r0 instanceof X.C38831rU
            if (r1 == 0) goto L_0x092a
            long r1 = r5.A00()
        L_0x0913:
            r25 = 0
            X.2Fi r3 = new X.2Fi
            r12 = r3
            r13 = r4
            r14 = r10
            r15 = r0
            r16 = r17
            r19 = r40
            r23 = r1
            r26 = r25
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21, r23, r25, r26)
            r6.A00(r3)
            return
        L_0x092a:
            long r1 = r0.A0I
            goto L_0x0913
        L_0x092d:
            r0 = move-exception
            if (r11 == 0) goto L_0x0933
            r11.unlock()
        L_0x0933:
            throw r0
        L_0x0934:
            java.lang.Object r0 = r5.A00
            X.2i2 r0 = (X.C54702i2) r0
            java.lang.Object r1 = r5.A01
            X.0sH r1 = (X.C16010sH) r1
            X.0sG r0 = r0.A01
            r0.A0L(r1)
            return
        L_0x0942:
            java.lang.Object r0 = r5.A00
            X.2i3 r0 = (X.C54712i3) r0
            java.lang.Object r1 = r5.A01
            X.2RN r1 = (X.AnonymousClass2RN) r1
            X.2RO r0 = r0.A02
            r0.A02(r1)
            return
        L_0x0950:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment r4 = (com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment) r4
            java.lang.Object r1 = r5.A01
            X.0sL r1 = (X.C16050sL) r1
            X.0uk r0 = r4.A07
            X.0sL r3 = r0.A02(r1)
            if (r3 == 0) goto L_0x1069
            X.1FI r2 = r4.A0G
            X.0rt r0 = r4.A0F
            int r1 = r0.A02(r1)
            r0 = 0
            r2.A00(r3, r1, r0)
            return
        L_0x096d:
            java.lang.Object r3 = r5.A00
            X.0pN r3 = (X.C14550pN) r3
            java.lang.Object r4 = r5.A01
            X.2f2 r4 = (X.AnonymousClass2f2) r4
            java.lang.String r0 = "EULA/retrieveBackupToken/try to retrieve token from block store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C15450qv.A03()
            if (r0 != 0) goto L_0x09ee
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/backup skipped/older api version"
        L_0x0982:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0985:
            java.io.File r2 = r3.getFilesDir()
            java.lang.String r1 = "backup_token"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x09ad
            java.lang.String r0 = "EULA/retrieveBackupToken/successfully retrieved token from block store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rz r0 = r3.A09
            java.lang.String r2 = "block_store"
        L_0x099f:
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "backup_token_source"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            return
        L_0x09ad:
            if (r4 != 0) goto L_0x09b3
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/accountTransferClient is null"
            goto L_0x0b3f
        L_0x09b3:
            java.lang.String r1 = "com.obwhatsapp"
            X.3Ww r0 = new X.3Ww
            r0.<init>(r1)
            X.3W4 r1 = new X.3W4
            r1.<init>(r0)
            r0 = 0
            X.0on r4 = r4.A01(r1, r0)
            r1 = 10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0a62 }
            X.C14310ox.A00(r4, r0, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0a62 }
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x1069
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/import successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r4.A01()
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0a5e
            int r0 = r1.length
            if (r0 == 0) goto L_0x0a5e
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/save imported token to backup_token file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass2FR.A03(r3, r1)
            X.0rz r0 = r3.A09
            java.lang.String r2 = "device_to_device_transfer"
            goto L_0x099f
        L_0x09ee:
            X.3WU r6 = new X.3WU
            r6.<init>(r3)
            X.4ay r5 = new X.4ay
            r0 = r17
            r5.<init>(r0)
            r0 = 1
            X.3Y2[] r2 = new X.AnonymousClass3Y2[r0]
            X.3Y2 r0 = X.AnonymousClass4BK.A00
            r1 = 0
            r2[r1] = r0
            r5.A03 = r2
            X.4qq r0 = new X.4qq
            r0.<init>(r6)
            r5.A01 = r0
            r5.A02 = r1
            r0 = 1570(0x622, float:2.2E-42)
            r5.A00 = r0
            X.2j2 r0 = r5.A00()
            X.0on r5 = r6.A01(r0, r1)
            r1 = 10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0a21 }
            X.C14310ox.A00(r5, r0, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0a21 }
            goto L_0x0a27
        L_0x0a21:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/exception receiving bytes"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0a27:
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L_0x0a5a
            java.lang.Object r0 = r5.A01()
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0a5a
            int r0 = r0.length
            if (r0 == 0) goto L_0x0a5a
            java.lang.Object r2 = r5.A01()
            byte[] r2 = (byte[]) r2
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/Block Store token success/saved token size is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r2.length
            r1.append(r0)
            java.lang.String r0 = " bytes"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass2FR.A03(r3, r2)
            goto L_0x0985
        L_0x0a5a:
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/Block Store token not retrieved"
            goto L_0x0982
        L_0x0a5e:
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/imported empty data"
            goto L_0x0b3f
        L_0x0a62:
            r2 = move-exception
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/error during import"
            com.whatsapp.util.Log.e(r0, r2)
            boolean r0 = r2 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L_0x0a86
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass3WQ
            if (r0 == 0) goto L_0x0a86
            java.lang.Throwable r0 = r2.getCause()
            X.43Z r0 = (X.AnonymousClass43Z) r0
            com.google.android.gms.common.api.Status r0 = r0.mStatus
            int r1 = r0.A01
            r0 = 20501(0x5015, float:2.8728E-41)
            if (r1 != r0) goto L_0x0a86
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/NO_DATA_AVAILABLE exception"
            goto L_0x0b3f
        L_0x0a86:
            java.lang.String r0 = "eula/create/exception during retrieving data from account transfer"
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x0a8c:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.registration.RegisterName r2 = (com.obwhatsapp.registration.RegisterName) r2
            java.lang.Object r1 = r5.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x1069
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x1069
            android.widget.ImageView r0 = r2.A04
            r0.setImageBitmap(r1)
            return
        L_0x0aa2:
            java.lang.Object r0 = r5.A00
            X.0yx r0 = (X.C19760yx) r0
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            X.0pt r2 = r0.A04
            X.0pS r1 = r2.A00
            r0 = 2131887112(0x7f120408, float:1.9408822E38)
            goto L_0x0ac1
        L_0x0ab2:
            java.lang.Object r0 = r5.A00
            X.0yx r0 = (X.C19760yx) r0
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            X.0pt r2 = r0.A04
            X.0pS r1 = r2.A00
            r0 = 2131887143(0x7f120427, float:1.9408885E38)
        L_0x0ac1:
            java.lang.String r0 = r3.getString(r0)
            r2.A0G(r1, r0)
            return
        L_0x0ac9:
            java.lang.Object r6 = r5.A00
            X.0yx r6 = (X.C19760yx) r6
            java.lang.Object r7 = r5.A01
            android.content.Context r7 = (android.content.Context) r7
            X.0rz r4 = r6.A0O
            r5 = 0
            X.01D r3 = r4.A01
            java.lang.Object r1 = r3.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "migration_state_on_provider_side"
            int r0 = r1.getInt(r0, r5)
            r8 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0ae7
            r2 = 1
        L_0x0ae7:
            X.AnonymousClass00B.A00()
            java.lang.Object r1 = r3.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_biz_registered_on_device"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x0b05
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            java.lang.String r0 = "com.obwhatsapp.w4b"
            r1.getPackageInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x0b02 }
            goto L_0x0b3d
        L_0x0b02:
            r4.A1F(r5)
        L_0x0b05:
            if (r2 != 0) goto L_0x0b3d
            X.0tH r0 = r6.A01
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x1069
            r0 = 2131889747(0x7f120e53, float:1.9414166E38)
            java.lang.String r4 = r7.getString(r0)
            r0 = 2131889746(0x7f120e52, float:1.9414164E38)
            java.lang.String r3 = r7.getString(r0)
            r2 = 2131889745(0x7f120e51, float:1.9414162E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 2131893495(0x7f121cf7, float:1.9421768E38)
            java.lang.String r0 = r7.getString(r0)
            r1[r5] = r0
            java.lang.String r0 = r7.getString(r2, r1)
            X.03l r0 = r6.A02(r4, r3, r0)
            X.0yL r2 = r6.A0N
            android.app.Notification r1 = r0.A01()
            r0 = 20
            r2.A02(r0, r1)
            return
        L_0x0b3d:
            java.lang.String r0 = "app/loginfailed/notification was suppressed by smb registration"
        L_0x0b3f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0b43:
            java.lang.Object r10 = r5.A00
            X.0yx r10 = (X.C19760yx) r10
            java.lang.Object r3 = r5.A01
            com.obwhatsapp.Me r3 = (com.obwhatsapp.Me) r3
            X.0sK r0 = r10.A05
            r0.A0B()
            com.obwhatsapp.Me r9 = r0.A00
            X.0pt r6 = r10.A04
            X.0pS r5 = r6.A00
            X.0tz r0 = r10.A0M
            android.content.Context r2 = r0.A00
            r7 = 2131887144(0x7f120428, float:1.9408887E38)
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            X.013 r8 = r10.A0Q
            java.lang.String r1 = r3.cc
            java.lang.String r0 = r3.number
            java.lang.String r0 = X.AnonymousClass2JN.A0E(r1, r0)
            java.lang.String r1 = r8.A0H(r0)
            r0 = 0
            r4[r0] = r1
            java.lang.String r1 = r9.cc
            java.lang.String r0 = r9.number
            java.lang.String r0 = X.AnonymousClass2JN.A0E(r1, r0)
            java.lang.String r0 = r8.A0H(r0)
            r1 = 1
            r4[r1] = r0
            java.lang.String r0 = r2.getString(r7, r4)
            r6.A0G(r5, r0)
            X.0yo r0 = r10.A0C
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x1069
            X.0rz r0 = r10.A0O
            java.lang.String r0 = r0.A0M()
            if (r0 == 0) goto L_0x1069
            java.lang.String r9 = r3.jabber_id
            r0 = 0
            android.os.ConditionVariable r11 = new android.os.ConditionVariable
            r11.<init>(r0)
            X.4g8 r12 = new X.4g8
            r12.<init>(r11, r10)
            r0 = r17
            android.content.Intent r0 = X.C14750ph.A0d(r2, r0)
            r2.bindService(r0, r12, r1)
            X.0sq r0 = r10.A0q
            r8 = 8
            com.facebook.redex.RunnableRunnableShape0S1300000_I0 r7 = new com.facebook.redex.RunnableRunnableShape0S1300000_I0
            r7.<init>(r8, r9, r10, r11, r12)
            r0.Acl(r7)
            return
        L_0x0bba:
            java.lang.Object r4 = r5.A00
            X.0yx r4 = (X.C19760yx) r4
            java.lang.Object r5 = r5.A01
            X.1Zk r5 = (X.C28951Zk) r5
            X.0pt r2 = r4.A04
            X.0pS r1 = r2.A00
            if (r1 == 0) goto L_0x0bef
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x0bef
            boolean r0 = r1 instanceof X.C14550pN
            if (r0 == 0) goto L_0x0bef
            boolean r0 = r1 instanceof X.AnonymousClass2FK
            r3 = r0 ^ 1
            if (r3 == 0) goto L_0x0bf0
            X.0pS r0 = r2.A00
            boolean r0 = X.C46052Cd.A01(r0, r5)
            if (r0 == 0) goto L_0x0bf0
            X.12J r1 = r4.A0B
            r0 = r17
            r1.A01(r0)
            X.0yL r2 = r4.A0N
            r1 = 52
            r2.A03(r1, r0)
            return
        L_0x0bef:
            r3 = 0
        L_0x0bf0:
            java.lang.String r0 = "Couldn't show account logout dialog - showing system notification instead"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sq r2 = r4.A0q
            r1 = 20
            com.facebook.redex.RunnableRunnableShape0S0210000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0210000_I0
            r0.<init>(r4, r5, r1, r3)
            r2.Acl(r0)
            return
        L_0x0c02:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.registration.VerifyTwoFactorAuth r3 = (com.obwhatsapp.registration.VerifyTwoFactorAuth) r3
            java.lang.Object r2 = r5.A01
            X.2Hq r2 = (X.C47112Hq) r2
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/dismiss-verification-complete-dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A0A
            if (r0 == 0) goto L_0x0c1b
            java.lang.String r1 = r3.A0V
        L_0x0c15:
            java.lang.String r0 = r2.A05
            r3.A39(r1, r0)
            return
        L_0x0c1b:
            r1 = 0
            goto L_0x0c15
        L_0x0c1d:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment r3 = (com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment) r3
            java.lang.Object r0 = r5.A01
            X.1Zk r0 = (X.C28951Zk) r0
            com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06 = r0
            android.view.View r1 = r3.A00
            r0 = 2131364748(0x7f0a0b8c, float:1.8349342E38)
            android.view.View r5 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.1Zk r0 = com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            long r1 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            X.0t3 r4 = r3.A04
            X.013 r2 = r3.A02
            long r0 = r0.getTime()
            long r0 = r4.A02(r0)
            java.lang.CharSequence r0 = X.C28961Zl.A01(r2, r0)
            r5.setText(r0)
            android.view.View r1 = r3.A00
            r0 = 2131364749(0x7f0a0b8d, float:1.8349344E38)
            android.view.View r5 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.1Zk r0 = com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            java.lang.String r4 = r0.A01
            if (r4 != 0) goto L_0x0c92
            r0 = 2131886172(0x7f12005c, float:1.9406915E38)
            java.lang.String r0 = r3.A0J(r0)
        L_0x0c66:
            r5.setText(r0)
            android.view.View r1 = r3.A00
            r0 = 2131364386(0x7f0a0a22, float:1.8348608E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r1 = r3.A00
            r0 = 2131364751(0x7f0a0b8f, float:1.8349348E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            r1 = 0
            r0.setVisibility(r1)
            android.widget.Button r0 = r3.A02
            if (r0 == 0) goto L_0x0c8a
            r0.setVisibility(r1)
        L_0x0c8a:
            android.widget.Button r0 = r3.A01
            if (r0 == 0) goto L_0x1069
            r0.setVisibility(r1)
            return
        L_0x0c92:
            r2 = 2131886171(0x7f12005b, float:1.9406913E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r4
            java.lang.String r0 = r3.A0K(r2, r1)
            goto L_0x0c66
        L_0x0ca0:
            java.lang.Object r0 = r5.A00
            X.12x r0 = (X.C211312x) r0
            java.lang.Object r2 = r5.A01
            X.0tZ r2 = (X.C16740tZ) r2
            X.0xq r1 = r0.A0I
            r0 = -1
            r1.A08(r2, r0)
            return
        L_0x0caf:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.search.SearchFragment r2 = (com.obwhatsapp.search.SearchFragment) r2
            java.lang.Object r0 = r5.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r0)
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "global_search_new_chat"
            java.lang.String r6 = "whatsapp"
            X.1vW r3 = new X.1vW
            r3.<init>(r4, r5, r6, r7, r9)
            X.1vV r1 = new X.1vV
            r1.<init>(r3)
            X.0z3 r0 = r2.A0l
            r0.A00(r1)
            return
        L_0x0cd8:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.search.SearchFragment r2 = (com.obwhatsapp.search.SearchFragment) r2
            java.lang.Object r0 = r5.A01
            java.lang.Number r0 = (java.lang.Number) r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.A03
            int r0 = r0.intValue()
            r1.A0Z(r0)
            r2.A1B()
            return
        L_0x0ced:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.search.SearchViewModel r0 = (com.obwhatsapp.search.SearchViewModel) r0
            java.lang.Object r2 = r5.A01
            X.026 r1 = r0.A0E
            java.lang.Object r0 = r1.A01()
            if (r0 != 0) goto L_0x1069
            r1.A0B(r2)
            return
        L_0x0cff:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.service.RestoreChatConnectionWorker r0 = (com.obwhatsapp.service.RestoreChatConnectionWorker) r0
            java.lang.Object r1 = r5.A01
            X.0tK r0 = r0.A03
            r0.A03(r1)
            return
        L_0x0d0b:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.service.RestoreChatConnectionWorker r0 = (com.obwhatsapp.service.RestoreChatConnectionWorker) r0
            java.lang.Object r1 = r5.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.os.Handler r0 = r0.A00
            r0.removeCallbacks(r1)
            return
        L_0x0d19:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.settings.SettingsUserProxyActivity r2 = (com.obwhatsapp.settings.SettingsUserProxyActivity) r2
            java.lang.Object r0 = r5.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            com.obwhatsapp.settings.SettingsUserProxyViewModel r1 = r2.A06
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x1069
            com.obwhatsapp.settings.SettingsUserProxyViewModel r2 = r2.A06
            r1 = 1
            r0 = 0
            r2.A06(r1, r0)
            r2.A05()
            return
        L_0x0d3c:
            java.lang.Object r0 = r5.A00
            X.0sf r0 = (X.C16220sf) r0
            java.lang.Object r1 = r5.A01
            X.0rv r1 = (X.C15830rv) r1
            X.11A r0 = r0.A0M
            r0.A06(r1)
            return
        L_0x0d4a:
            java.lang.Object r0 = r5.A00
            X.0sf r0 = (X.C16220sf) r0
            java.lang.Object r2 = r5.A01
            X.0rv r2 = (X.C15830rv) r2
            X.18W r0 = r0.A0S
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0d5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1069
            java.lang.Object r0 = r1.next()
            X.5QL r0 = (X.AnonymousClass5QL) r0
            r0.AXf(r2)
            goto L_0x0d5c
        L_0x0d6c:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.shareinvitelink.ShareInviteLinkActivity r3 = (com.obwhatsapp.shareinvitelink.ShareInviteLinkActivity) r3
            java.lang.Object r0 = r5.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.3qy r2 = new X.3qy
            r2.<init>()
            r2.A00 = r0
            X.0sL r1 = r3.A09
            X.0ul r0 = r3.A08
            int r0 = X.C40511uF.A03(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.0t9 r0 = r3.A07
            r0.A06(r2)
            return
        L_0x0d8f:
            java.lang.Object r4 = r5.A00
            X.1Cr r4 = (X.C23621Cr) r4
            java.lang.Object r3 = r5.A01
            X.0tZ r3 = (X.C16740tZ) r3
            X.1Cq r0 = r4.A02
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x1069
            boolean r0 = r3 instanceof X.C38831rU
            if (r0 != 0) goto L_0x0db0
            android.os.Handler r2 = r4.A00
            r1 = 34
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            return
        L_0x0db0:
            X.1rU r3 = (X.C38831rU) r3
            java.lang.String r3 = r3.A01
            if (r3 == 0) goto L_0x1069
            android.os.Handler r2 = r4.A00
            r1 = 42
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r3, r4)
            r2.post(r0)
            return
        L_0x0dc3:
            java.lang.Object r4 = r5.A00
            X.1Cr r4 = (X.C23621Cr) r4
            java.lang.Object r3 = r5.A01
            X.0tZ r3 = (X.C16740tZ) r3
            java.util.Map r2 = r4.A03
            X.1Vw r0 = r3.A11
            java.lang.String r1 = r0.A01
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x1069
            r2.put(r1, r3)
            r4.A09()
            return
        L_0x0dde:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = (com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment) r0
            java.lang.Object r1 = r5.A01
            X.0sH r1 = (X.C16010sH) r1
            X.0sG r0 = r0.A0C
            r0.A0K(r1)
            return
        L_0x0dec:
            java.lang.Object r6 = r5.A00
            X.0zV r6 = (X.C20100zV) r6
            java.lang.Object r4 = r5.A01
            X.0zU r0 = r6.A02
            java.util.List r3 = r0.A00()
            X.0pt r2 = r6.A00
            r1 = 12
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r0.<init>(r6, r3, r4, r1)
            r2.A0K(r0)
            return
        L_0x0e05:
            java.lang.Object r1 = r5.A00
            X.13k r1 = (X.C212613k) r1
            java.lang.Object r0 = r5.A01
            X.1jm r0 = (X.C34151jm) r0
            java.lang.String r2 = r0.A0D
            java.lang.String r3 = r0.A0G
            java.lang.String r4 = r0.A08
            java.lang.String r5 = r0.A06
            java.lang.String r6 = r0.A0C
            java.lang.String r7 = r0.A0B
            int r9 = r0.A00
            int r10 = r0.A03
            int r11 = r0.A02
            java.lang.String r8 = r0.A07
            boolean r12 = r0.A0I
            r1.A0G(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0e27:
            java.lang.Object r0 = r5.A00
            X.13k r0 = (X.C212613k) r0
            java.lang.Object r4 = r5.A01
            java.util.List r3 = r0.A0C()
            X.0pt r2 = r0.A01
            r1 = 39
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r4, r1, r3)
            r2.Acq(r0)
            return
        L_0x0e3e:
            java.lang.Object r1 = r5.A00
            X.5QQ r1 = (X.AnonymousClass5QQ) r1
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            r1.AXm(r0)
            return
        L_0x0e4a:
            java.lang.Object r3 = r5.A00
            X.20v r3 = (X.C436220v) r3
            java.lang.Object r2 = r5.A01
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            if (r3 == 0) goto L_0x0e62
            java.lang.String r1 = r3.A04
            android.widget.ImageView r0 = r3.A00
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1069
        L_0x0e62:
            r1 = 0
            if (r2 == 0) goto L_0x0e6b
            r1 = 1
            android.widget.ImageView r0 = r3.A00
            r0.setImageDrawable(r2)
        L_0x0e6b:
            X.20x r0 = r3.A01
            if (r0 == 0) goto L_0x1069
            r0.AXn(r1)
            return
        L_0x0e73:
            java.lang.Object r1 = r5.A00
            X.1CX r1 = (X.AnonymousClass1CX) r1
            java.lang.Object r0 = r5.A01
            X.1pi r0 = (X.C37771pi) r0
            r1.A0C(r0)
            return
        L_0x0e7f:
            java.lang.Object r0 = r5.A00
            X.1CX r0 = (X.AnonymousClass1CX) r0
            java.lang.Object r1 = r5.A01
            X.1pi r1 = (X.C37771pi) r1
            X.14h r0 = r0.A0T
            java.lang.String r1 = r1.A0F
            X.12j r0 = r0.A00
            X.0tf r4 = r0.A02()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0ea4 }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x0ea4 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0ea4 }
            java.lang.String r1 = "new_sticker_packs"
            java.lang.String r0 = "pack_id = ?"
            r2.A01(r1, r0, r3)     // Catch:{ all -> 0x0ea4 }
            r4.close()
            return
        L_0x0ea4:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0ea8 }
        L_0x0ea8:
            throw r0
        L_0x0ea9:
            java.lang.Object r1 = r5.A00
            X.1CX r1 = (X.AnonymousClass1CX) r1
            X.14W r0 = r1.A0K
            r2 = 0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0eb8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1069
            java.lang.Object r0 = r1.next()
            X.1we r0 = (X.C41781we) r0
            r0.A09(r2)
            goto L_0x0eb8
        L_0x0ec8:
            java.lang.Object r4 = r5.A00
            X.1CX r4 = (X.AnonymousClass1CX) r4
            java.lang.Object r5 = r5.A01
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r9 = r5.iterator()
        L_0x0ed4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0f32
            java.lang.Object r8 = r9.next()
            X.1jm r8 = (X.C34151jm) r8
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x0ef1
            java.lang.String r1 = r8.A05
            if (r1 == 0) goto L_0x0ef1
            X.12k r0 = r4.A0V
            X.1jm r8 = r0.A00(r1)
            if (r8 != 0) goto L_0x0ef1
            goto L_0x0ed4
        L_0x0ef1:
            java.lang.String r7 = r8.A0D
            if (r7 == 0) goto L_0x0ed4
            X.1Go r6 = r4.A0S
            boolean r0 = r6.A02(r7)
            if (r0 == 0) goto L_0x0ed4
            X.01Z r0 = r4.A06
            r0.A07(r7)
            X.0xU r3 = r4.A00
            if (r3 == 0) goto L_0x0f2d
            r2 = 0
            X.0t3 r0 = r4.A08
            long r0 = r0.A00()
            java.util.Set r2 = r3.A0H(r8, r0, r2)
        L_0x0f11:
            X.AnonymousClass00B.A00()
            r6.A01()
            X.1pf r1 = r6.A01
            java.lang.String r0 = r1.A00(r7)
            r1.A02(r7, r0)
            X.1Qj r0 = r6.A04
            r0.A04(r7)
            X.0xU r0 = r4.A00
            if (r0 == 0) goto L_0x0ed4
            r0.A0V(r2)
            goto L_0x0ed4
        L_0x0f2d:
            java.util.Set r2 = java.util.Collections.emptySet()
            goto L_0x0f11
        L_0x0f32:
            X.0pt r2 = r4.A05
            r1 = 43
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r4, r1, r5)
            r2.A0K(r0)
            return
        L_0x0f3f:
            java.lang.Object r0 = r5.A00
            X.1CX r0 = (X.AnonymousClass1CX) r0
            java.lang.Object r3 = r5.A01
            java.util.Collection r3 = (java.util.Collection) r3
            X.14W r0 = r0.A0K
            r2 = 0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0f52:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1069
            java.lang.Object r0 = r1.next()
            X.1we r0 = (X.C41781we) r0
            r0.A08(r3, r2)
            goto L_0x0f52
        L_0x0f62:
            java.lang.Object r2 = r5.A00
            X.1CX r2 = (X.AnonymousClass1CX) r2
            java.lang.Object r1 = r5.A01
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 1
            r2.A0G(r1, r0)
            return
        L_0x0f6f:
            java.lang.Object r6 = r5.A00
            X.1CX r6 = (X.AnonymousClass1CX) r6
            java.lang.Object r2 = r5.A01
            java.util.List r2 = (java.util.List) r2
            X.14d r0 = r6.A0R
            r0.A00()
            java.lang.String r0 = "StickerRepository/reorderMyStickerPackSync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14X r0 = r6.A0U
            X.AnonymousClass00B.A00()
            X.1Qg r5 = r0.A03
            monitor-enter(r5)
            X.12j r0 = r5.A00     // Catch:{ all -> 0x0fec }
            X.0tf r4 = r0.A02()     // Catch:{ all -> 0x0fec }
            X.1cj r10 = r4.A00()     // Catch:{ all -> 0x0fe7 }
            X.0tg r8 = r4.A02     // Catch:{ all -> 0x0fe2 }
            java.lang.String r7 = "sticker_pack_order"
            r1 = r17
            r8.A01(r7, r1, r1)     // Catch:{ all -> 0x0fe2 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x0fe2 }
        L_0x0fa1:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0fe2 }
            if (r0 == 0) goto L_0x0fc9
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0fe2 }
            X.1pi r0 = (X.C37771pi) r0     // Catch:{ all -> 0x0fe2 }
            java.lang.String r3 = r0.A0F     // Catch:{ all -> 0x0fe2 }
            int r1 = r0.A00     // Catch:{ all -> 0x0fe2 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0fe2 }
            r2.<init>()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r0 = "sticker_pack_id"
            r2.put(r0, r3)     // Catch:{ all -> 0x0fe2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0fe2 }
            java.lang.String r0 = "pack_order"
            r2.put(r0, r1)     // Catch:{ all -> 0x0fe2 }
            r8.A03(r2, r7)     // Catch:{ all -> 0x0fe2 }
            goto L_0x0fa1
        L_0x0fc9:
            r10.A00()     // Catch:{ all -> 0x0fe2 }
            r10.close()     // Catch:{ all -> 0x0fe7 }
            r4.close()     // Catch:{ all -> 0x0fec }
            monitor-exit(r5)
            X.0pt r3 = r6.A05
            X.14W r2 = r6.A0K
            r1 = 12
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r2, r1)
            r3.A0K(r0)
            return
        L_0x0fe2:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0fe6 }
        L_0x0fe6:
            throw r0     // Catch:{ all -> 0x0fe7 }
        L_0x0fe7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0feb }
        L_0x0feb:
            throw r0     // Catch:{ all -> 0x0fec }
        L_0x0fec:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0fef:
            java.lang.Object r0 = r5.A00
            X.1Qf r0 = (X.C27041Qf) r0
            java.lang.Object r3 = r5.A01
            X.1pi r3 = (X.C37771pi) r3
            X.14W r0 = r0.A03
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x1001:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1069
            java.lang.Object r1 = r2.next()
            X.1we r1 = (X.C41781we) r1
            boolean r0 = r1 instanceof com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0
            if (r0 == 0) goto L_0x1001
            com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0 r1 = (com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0) r1
            int r0 = r1.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x1001
            java.lang.Object r0 = r1.A00
            X.1wf r0 = (X.C41791wf) r0
            X.1wg r0 = r0.A03
            if (r0 == 0) goto L_0x1001
            r0.AXs(r3)
            goto L_0x1001
        L_0x1025:
            java.lang.Object r0 = r5.A00
            X.54y r0 = (X.C1043454y) r0
            java.lang.Object r2 = r5.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            java.lang.ref.WeakReference r0 = r0.A03
            java.lang.Object r1 = r0.get()
            X.1vn r1 = (X.C41441vn) r1
            if (r1 == 0) goto L_0x1069
            boolean r0 = r2.isRecycled()
            if (r0 == 0) goto L_0x1043
            java.lang.String r0 = "AnimatedSticker/StickerFramePreloader/run/frame is recycled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x1043:
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x1069
            r1.A03 = r2
            r1.A00()
            return
        L_0x104d:
            r5 = move-exception
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/error "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = r17
            r3.A01(r0, r2)
            X.5S6 r0 = r2.A00
            r0.AQR(r1)
        L_0x1069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape10S0200000_I0_8.run():void");
    }
}
