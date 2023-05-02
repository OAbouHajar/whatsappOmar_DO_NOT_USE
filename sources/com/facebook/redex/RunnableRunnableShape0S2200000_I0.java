package com.facebook.redex;

public class RunnableRunnableShape0S2200000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape0S2200000_I0(Object obj, Object obj2, String str, String str2, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x023e A[Catch:{ Exception -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0270 A[Catch:{ Exception -> 0x02ab }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r5 = r34
            int r0 = r5.A04
            switch(r0) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x02c1;
                case 2: goto L_0x013b;
                case 3: goto L_0x0119;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r5.A00
            X.0yw r2 = (X.C19750yw) r2
            java.lang.String r4 = r5.A02
            java.lang.String r3 = r5.A03
            java.lang.Object r1 = r5.A01
            X.2JU r1 = (X.AnonymousClass2JU) r1
            X.1Bc r8 = r2.A05
            X.0tz r0 = r2.A03
            android.content.Context r9 = r0.A00
            java.lang.String r12 = "blocked_ban_appeals"
            X.0pf r6 = r8.A01
            long r20 = r6.A02()
            r0 = 1
            long[] r7 = new long[r0]
            X.4xj r5 = new X.4xj
            r5.<init>(r8, r7)
            X.12W r0 = r8.A00
            boolean r5 = r0.A03(r5)
            r0 = 0
            if (r5 == 0) goto L_0x0038
            long r5 = r6.A01()
            r7[r0] = r5
        L_0x0038:
            java.lang.String r15 = android.os.Environment.getExternalStorageState()
            X.1Bb r8 = r8.A04
            r10 = 0
            r22 = 1
            r18 = r7[r0]
            r13 = r10
            r14 = r10
            r16 = r10
            r17 = r10
            r23 = 0
            r11 = r10
            java.lang.String r31 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23)
            X.1H6 r5 = r2.A00
            X.0un r5 = r5.A00
            X.0sX r6 = r5.A01
            X.01J r5 = r6.A05
            java.lang.Object r11 = r5.get()
            X.0pd r11 = (X.C14710pd) r11
            X.01J r5 = r6.AN9
            java.lang.Object r10 = r5.get()
            X.0ua r10 = (X.C17130ua) r10
            X.01J r5 = r6.AQh
            java.lang.Object r9 = r5.get()
            X.0rz r9 = (X.C15860rz) r9
            X.01J r5 = r6.AQV
            X.01D r28 = X.C17270uo.A00(r5)
            X.01J r8 = r6.AO4
            X.01J r7 = r6.A1b
            X.01J r5 = r6.AAi
            java.lang.Object r6 = r5.get()
            X.168 r6 = (X.AnonymousClass168) r6
            X.3tq r5 = new X.3tq
            r23 = r5
            r24 = r10
            r25 = r9
            r26 = r11
            r27 = r6
            r29 = r4
            r30 = r3
            r32 = r8
            r33 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.0wP r3 = r2.A02
            boolean r3 = r3.A0A()
            if (r3 == 0) goto L_0x0111
            com.facebook.redex.IDxRCallbacksShape74S0200000_1_I1 r3 = new com.facebook.redex.IDxRCallbacksShape74S0200000_1_I1
            r3.<init>(r2, r0, r1)
            r5.Aah(r3)
        L_0x00a7:
            return
        L_0x00a8:
            java.lang.String r3 = r5.A02
            java.lang.String r0 = r5.A03
            java.lang.Object r5 = r5.A01
            X.0t6 r5 = (X.C16460t6) r5
            X.0rv r2 = X.C15830rv.A02(r0)
            r0 = 0
            X.1Vw r1 = new X.1Vw
            r1.<init>(r2, r3, r0)
            X.0th r0 = r5.A0K
            X.0tZ r4 = r0.A03(r1)
            r3 = 1
            if (r4 == 0) goto L_0x00e6
            X.1sA r0 = r4.A0E()
            X.1sB r0 = r0.A00
            if (r0 == 0) goto L_0x00e6
            X.1sA r0 = r4.A0E()
            X.1sB r0 = r0.A00
            java.util.List r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x00d7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02da
            java.lang.Object r0 = r1.next()
            X.1t7 r0 = (X.C39821t7) r0
            r0.A00 = r3
            goto L_0x00d7
        L_0x00e6:
            boolean r0 = r4 instanceof X.C16840tj
            if (r0 == 0) goto L_0x00a7
            r0 = r4
            X.0tj r0 = (X.C16840tj) r0
            X.0tn r2 = r0.AAt()
            if (r2 == 0) goto L_0x00a7
            int r1 = r2.A00
            r0 = 5
            if (r1 != r0) goto L_0x00a7
            X.1lW r0 = r2.A03
            if (r0 == 0) goto L_0x00a7
            java.util.List r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0102:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02da
            java.lang.Object r0 = r1.next()
            X.1lV r0 = (X.C35181lV) r0
            r0.A00 = r3
            goto L_0x0102
        L_0x0111:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r1.AQv(r0)
            return
        L_0x0119:
            java.lang.Object r0 = r5.A00
            X.2KF r0 = (X.AnonymousClass2KF) r0
            java.lang.Object r3 = r5.A01
            android.util.Pair r3 = (android.util.Pair) r3
            X.1H4 r0 = r0.A00
            X.01D r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.0ps r2 = (X.C14860ps) r2
            java.lang.Object r0 = r3.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r3.second
            java.lang.String r0 = (java.lang.String) r0
            r2.A03(r0, r1)
            return
        L_0x013b:
            java.lang.Object r0 = r5.A00
            X.1Pl r0 = (X.C26841Pl) r0
            java.lang.String r8 = r5.A02
            java.lang.String r7 = r5.A03
            java.lang.Object r1 = r5.A01
            X.5S6 r1 = (X.AnonymousClass5S6) r1
            X.0tz r2 = r0.A02
            android.content.Context r2 = r2.A00
            java.lang.String r9 = X.AnonymousClass3A8.A00(r2, r8)
            java.lang.String r2 = "AccountDefenceDataManager/resendDeviceConfirmationNotice"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0rz r6 = r0.A03
            X.01D r5 = r6.A01
            java.lang.Object r3 = r5.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "com.obwhatsapp.registration.RegisterPhone.mistyped_state"
            r4 = 0
            java.lang.String r20 = r3.getString(r2, r4)
            X.01V r2 = r0.A00
            android.telephony.TelephonyManager r3 = r2.A0N()
            r2 = 0
            if (r3 == 0) goto L_0x0172
            java.lang.String r4 = r3.getNetworkOperator()
        L_0x0172:
            X.2Hf r17 = X.C47032Hf.A00(r4)
            if (r3 == 0) goto L_0x017c
            java.lang.String r2 = r3.getSimOperator()
        L_0x017c:
            X.2Hf r18 = X.C47032Hf.A00(r2)
            java.lang.Object r3 = r5.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r4 = "reg_attempts_device_confirmation"
            r2 = 0
            int r2 = r3.getInt(r4, r2)
            int r3 = r2 + 1
            android.content.SharedPreferences$Editor r2 = r6.A0K()
            android.content.SharedPreferences$Editor r2 = r2.putInt(r4, r3)
            r2.apply()
            X.2Hc r4 = new X.2Hc
            r4.<init>(r3)
            r2 = -1
            X.1KP r15 = r0.A04     // Catch:{ Exception -> 0x02ab }
            java.lang.Object r6 = r5.get()     // Catch:{ Exception -> 0x02ab }
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch:{ Exception -> 0x02ab }
            java.lang.String r5 = "registration_failure_reason"
            java.lang.String r3 = ""
            java.lang.String r19 = r6.getString(r5, r3)     // Catch:{ Exception -> 0x02ab }
            r15.A08()     // Catch:{ Exception -> 0x02ab }
            byte[] r13 = r15.A0C(r7, r8)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "sendAccountDefenceDeviceConfirmation"
            byte[] r14 = r15.A0B(r3)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "http/registration/wamsys/sendAccountDefenceDeviceConfirmation"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x02ab }
            r16 = r4
            java.util.Map r12 = r15.A06(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x02ab }
            X.1SU r6 = r15.A0L     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "send_device_confirm_entrypoint"
            java.lang.String r10 = r15.A03(r7, r3)     // Catch:{ Exception -> 0x02ab }
            java.util.List r11 = r15.A04()     // Catch:{ Exception -> 0x02ab }
            X.1S0 r5 = r15.A00     // Catch:{ Exception -> 0x02ab }
            r15 = 0
            com.obwhatsapp.wamsys.IDxARunnableShape0S4600000_2_I1 r4 = new com.obwhatsapp.wamsys.IDxARunnableShape0S4600000_2_I1     // Catch:{ Exception -> 0x02ab }
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x02ab }
            java.lang.Object r4 = X.C31591ei.A00(r4)     // Catch:{ Exception -> 0x02ab }
            X.4Mb r4 = (X.C84834Mb) r4     // Catch:{ Exception -> 0x02ab }
            if (r4 != 0) goto L_0x01ef
            java.lang.String r0 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/result is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x02ab }
            r1.AQR(r2)     // Catch:{ Exception -> 0x02ab }
            return
        L_0x01ef:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ab }
            r5.<init>()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/success status: "
            r5.append(r3)     // Catch:{ Exception -> 0x02ab }
            int r6 = r4.A00     // Catch:{ Exception -> 0x02ab }
            r5.append(r6)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x02ab }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x02ab }
            r5 = 11
            X.1Pk r3 = r0.A06     // Catch:{ Exception -> 0x02ab }
            if (r6 != r5) goto L_0x028b
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveRetryLimitReachedForResendingNotice/"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x02ab }
            X.0u3 r8 = r3.A01     // Catch:{ Exception -> 0x02ab }
            java.lang.String r7 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r0 = r8.A00(r7)     // Catch:{ Exception -> 0x02ab }
            android.content.SharedPreferences$Editor r5 = r0.edit()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r0 = 1
            r5.putBoolean(r3, r0)     // Catch:{ Exception -> 0x02ab }
            boolean r0 = r5.commit()     // Catch:{ Exception -> 0x02ab }
            if (r0 != 0) goto L_0x022d
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveRetryLimitReachedForResendingNotice/error"
        L_0x022a:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x02ab }
        L_0x022d:
            java.lang.String r0 = r4.A02     // Catch:{ Exception -> 0x02ab }
            r5 = -1
            long r9 = X.AnonymousClass2JN.A02(r0, r5)     // Catch:{ Exception -> 0x02ab }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r5
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0270
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02ab }
            long r5 = r5 + r9
            java.lang.String r3 = "AccountDefenceLocalDataRepository/saveRetryTimeForResendingNotice/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ab }
            r0.<init>(r3)     // Catch:{ Exception -> 0x02ab }
            r0.append(r5)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ab }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x02ab }
            android.content.SharedPreferences r0 = r8.A00(r7)     // Catch:{ Exception -> 0x02ab }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r0 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice"
            r3.putLong(r0, r5)     // Catch:{ Exception -> 0x02ab }
            boolean r0 = r3.commit()     // Catch:{ Exception -> 0x02ab }
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveRetryTimeForResendingNotice/error"
        L_0x0269:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x02ab }
        L_0x026c:
            r1.AOt(r4)     // Catch:{ Exception -> 0x02ab }
            goto L_0x02aa
        L_0x0270:
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryTimeForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x02ab }
            android.content.SharedPreferences r0 = r8.A00(r7)     // Catch:{ Exception -> 0x02ab }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r0 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice"
            r3.remove(r0)     // Catch:{ Exception -> 0x02ab }
            boolean r0 = r3.commit()     // Catch:{ Exception -> 0x02ab }
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryTimeForResendingNotice/error"
            goto L_0x0269
        L_0x028b:
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryLimitReachedForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x02ab }
            X.0u3 r8 = r3.A01     // Catch:{ Exception -> 0x02ab }
            java.lang.String r7 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r0 = r8.A00(r7)     // Catch:{ Exception -> 0x02ab }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r0 = "com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r3.remove(r0)     // Catch:{ Exception -> 0x02ab }
            boolean r0 = r3.commit()     // Catch:{ Exception -> 0x02ab }
            if (r0 != 0) goto L_0x022d
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryLimitReachedForResendingNotice/error"
            goto L_0x022a
        L_0x02aa:
            return
        L_0x02ab:
            r4 = move-exception
            java.lang.String r3 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/error "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1.AQR(r2)
            return
        L_0x02c1:
            java.lang.Object r1 = r5.A00
            X.2bB r1 = (X.C51202bB) r1
            java.lang.Object r0 = r5.A01
            X.2RN r0 = (X.AnonymousClass2RN) r0
            java.lang.String r4 = r5.A02
            java.lang.String r3 = r5.A03
            X.156 r2 = r1.A0G
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.26U r0 = new X.26U
            r0.<init>(r1, r4, r3)
            r2.A01(r0)
            return
        L_0x02da:
            r5.A0a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S2200000_I0.run():void");
    }
}
