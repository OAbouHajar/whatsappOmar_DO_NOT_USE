package com.facebook.redex;

import X.AnonymousClass027;
import X.AnonymousClass11I;

public class RunnableRunnableShape0S1200000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public RunnableRunnableShape0S1200000_I0(AnonymousClass027 r2, AnonymousClass11I r3) {
        this.A03 = 22;
        this.A00 = r3;
        this.A02 = "status_distribution";
        this.A01 = r2;
    }

    public RunnableRunnableShape0S1200000_I0(Object obj, String str, Object obj2, int i2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = obj2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x021f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r7 = r22
            int r0 = r7.A03
            switch(r0) {
                case 0: goto L_0x0a07;
                case 1: goto L_0x09fb;
                case 2: goto L_0x0090;
                case 3: goto L_0x090c;
                case 4: goto L_0x08fe;
                case 5: goto L_0x08f0;
                case 6: goto L_0x08f0;
                case 7: goto L_0x08e2;
                case 8: goto L_0x0802;
                case 9: goto L_0x0084;
                case 10: goto L_0x0062;
                case 11: goto L_0x07ed;
                case 12: goto L_0x07cf;
                case 13: goto L_0x07a5;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x03a8;
                case 17: goto L_0x032d;
                case 18: goto L_0x031f;
                case 19: goto L_0x02fc;
                case 20: goto L_0x02c6;
                case 21: goto L_0x0299;
                case 22: goto L_0x0286;
                case 23: goto L_0x002d;
                case 24: goto L_0x024e;
                case 25: goto L_0x0230;
                case 26: goto L_0x0220;
                case 27: goto L_0x0177;
                case 28: goto L_0x013f;
                case 29: goto L_0x00f3;
                case 30: goto L_0x00ba;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r7.A00
            X.1Z7 r4 = (X.AnonymousClass1Z7) r4
            java.lang.String r3 = r7.A02
            java.lang.Object r2 = r7.A01
            X.0q2 r1 = new X.0q2
            r1.<init>()
            r0 = 0
            r1.A03(r3, r0)
            if (r2 == 0) goto L_0x001e
            r0 = 1
            r1.A03(r2, r0)
        L_0x001e:
            X.0q4 r3 = r4.A01
            X.0q1 r2 = r4.A02
            java.util.List r1 = r1.A00
            X.0q3 r0 = new X.0q3
            r0.<init>(r1)
            X.C14980q6.A00(r3, r0, r2)
        L_0x002c:
            return
        L_0x002d:
            java.lang.Object r0 = r7.A00
            X.2Ny r0 = (X.C48572Ny) r0
            java.lang.String r4 = r7.A02
            java.lang.Object r2 = r7.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.2Nz r3 = r0.A01
            java.lang.String r1 = "ChatSupportTicketManager/contactSupport/onSuccess called, ticketId="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1YD r0 = r3.A00
            r0.AON(r2)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x002c
            X.1Ms r0 = r3.A01
            X.0sq r2 = r0.A03
            r1 = 32
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r4, r3)
            r2.Acl(r0)
            return
        L_0x0062:
            java.lang.Object r3 = r7.A00
            X.2RR r3 = (X.AnonymousClass2RR) r3
            java.lang.Object r2 = r7.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            java.lang.String r1 = r7.A02
            X.1Gf r0 = r3.A0C     // Catch:{ Exception -> 0x007a }
            r0.A07(r2, r1)     // Catch:{ Exception -> 0x007a }
            X.027 r0 = r3.A02     // Catch:{ Exception -> 0x007a }
            if (r0 == 0) goto L_0x002c
            r0.A09(r1)     // Catch:{ Exception -> 0x007a }
            goto L_0x0a1a
        L_0x007a:
            X.027 r1 = r3.A05
            if (r1 == 0) goto L_0x002c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            return
        L_0x0084:
            java.lang.Object r0 = r7.A00
            X.23A r0 = (X.AnonymousClass23A) r0
            X.1U3 r0 = r0.A00
            if (r0 == 0) goto L_0x002c
            r0.ARp()
            return
        L_0x0090:
            java.lang.Object r2 = r7.A00
            X.0yD r2 = (X.C19300yD) r2
            java.lang.Object r4 = r7.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.String r1 = r7.A02
            X.0vK r0 = r2.A0P
            X.1ZX r4 = (X.AnonymousClass1ZX) r4
            boolean r0 = r0.A02(r4, r1)
            if (r0 == 0) goto L_0x002c
            X.0sG r3 = r2.A08
            X.0sH r0 = r3.A0A(r4)
            r3.A0O(r0, r4)
            android.os.Handler r2 = r3.A00
            r1 = 30
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r3, r1, r4)
            r2.post(r0)
            return
        L_0x00ba:
            java.lang.Object r3 = r7.A00
            com.obwhatsapp.registration.VerifyPhoneNumber r3 = (com.obwhatsapp.registration.VerifyPhoneNumber) r3
            java.lang.String r1 = r7.A02
            java.lang.Object r2 = r7.A01
            X.1en r2 = (X.C31641en) r2
            java.lang.String r0 = "sms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e7
            X.4Rq r1 = r3.A0s
            r0 = 1
            r1.A00(r0)
        L_0x00d3:
            java.lang.String r4 = r3.A1C
            java.lang.String r5 = r3.A1D
            java.lang.String r6 = r2.A08
            boolean r9 = r2.A0E
            boolean r10 = r2.A0D
            boolean r11 = r2.A0C
            java.lang.String r7 = r2.A07
            int r8 = r2.A01
            r3.A41(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00e7:
            java.lang.String r0 = "flash"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d3
            r3.A3P()
            goto L_0x00d3
        L_0x00f3:
            java.lang.Object r6 = r7.A00
            X.0yx r6 = (X.C19760yx) r6
            java.lang.String r0 = r7.A02
            java.lang.Object r7 = r7.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            int r5 = r0.length()
            r2 = 2
            int r1 = r5 / r2
            r0 = 45
            r3.insert(r1, r0)
            java.lang.String r4 = r3.toString()
            r3 = 2131892612(0x7f121984, float:1.9419977E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 0
            r2[r0] = r1
            r0 = 1
            r2[r0] = r4
            java.lang.String r1 = r7.getString(r3, r2)
            X.0yL r2 = r6.A0N
            r0 = 2131892611(0x7f121983, float:1.9419975E38)
            java.lang.String r0 = r7.getString(r0)
            X.03l r0 = r6.A02(r0, r1, r1)
            android.app.Notification r1 = r0.A01()
            r0 = 53
            r2.A02(r0, r1)
            return
        L_0x013f:
            java.lang.Object r5 = r7.A00
            X.0yx r5 = (X.C19760yx) r5
            java.lang.String r4 = r7.A02
            java.lang.Object r3 = r7.A01
            X.0pt r0 = r5.A04
            X.0pS r1 = r0.A00
            if (r1 == 0) goto L_0x0165
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x0165
            boolean r0 = r1 instanceof X.C14550pN
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = "showing sheet for WAOldRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.obwhatsapp.registration.VerificationCodeBottomSheet r0 = com.obwhatsapp.registration.VerificationCodeBottomSheet.A01(r4)
            r1.Afc(r0)
            return
        L_0x0165:
            java.lang.String r0 = "Couldn't show UI for WAOldRegistrationNotification - showing system notification instead"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sq r2 = r5.A0q
            r1 = 29
            com.facebook.redex.RunnableRunnableShape0S1200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1200000_I0
            r0.<init>(r3, r4, r5, r1)
            r2.Acl(r0)
            return
        L_0x0177:
            java.lang.Object r6 = r7.A00
            X.1TW r6 = (X.AnonymousClass1TW) r6
            java.lang.Object r5 = r7.A01
            X.1ci r5 = (X.C30641ci) r5
            java.lang.String r8 = r7.A02
            java.lang.String r0 = "recvmessagelistener/on-revoke-psa stanzaKey="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = "; campaignId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.184 r0 = r6.A0D
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.0tq r0 = r0.A00
            X.0tf r3 = r0.get()
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x02f7 }
            java.lang.String r2 = "SELECT message_row_id FROM message_status_psa_campaign WHERE campaign_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x02f7 }
            r0 = 0
            r1[r0] = r8     // Catch:{ all -> 0x02f7 }
            android.database.Cursor r2 = r4.A08(r2, r1)     // Catch:{ all -> 0x02f7 }
            if (r2 != 0) goto L_0x01b8
            goto L_0x01d4
        L_0x01b8:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x021b }
            if (r0 == 0) goto L_0x01d0
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x021b }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x021b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021b }
            r7.add(r0)     // Catch:{ all -> 0x021b }
            goto L_0x01b8
        L_0x01d0:
            r2.close()     // Catch:{ all -> 0x02f7 }
            goto L_0x01d5
        L_0x01d4:
            r7 = 0
        L_0x01d5:
            r3.close()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x01e1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0203
            java.lang.Object r0 = r7.next()
            java.lang.Number r0 = (java.lang.Number) r0
            X.0t6 r3 = r6.A0A
            long r1 = r0.longValue()
            X.0th r0 = r3.A0K
            X.0tZ r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x01e1
            r4.add(r1)
            r0 = 1
            r3.A0g(r1, r0, r0)
            goto L_0x01e1
        L_0x0203:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x0217
            X.17E r0 = r6.A0B
            android.os.Handler r2 = r0.A01
            r1 = 45
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r6, r1, r4)
            r2.post(r0)
        L_0x0217:
            r6.A03(r5)
            return
        L_0x021b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x021f }
        L_0x021f:
            throw r0     // Catch:{ all -> 0x02f7 }
        L_0x0220:
            java.lang.Object r0 = r7.A00
            X.1VK r0 = (X.AnonymousClass1VK) r0
            java.lang.Object r2 = r7.A01
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r2 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r2
            java.lang.String r1 = r7.A02
            X.1Ux r0 = r0.A03
            r2.onSharedPreferenceChanged(r0, r1)
            return
        L_0x0230:
            java.lang.Object r4 = r7.A00
            com.obwhatsapp.notification.AndroidWear r4 = (com.obwhatsapp.notification.AndroidWear) r4
            java.lang.String r3 = r7.A02
            java.lang.Object r1 = r7.A01
            X.1Vw r1 = (X.C28381Vw) r1
            X.0tb r2 = r4.A01
            X.0t6 r0 = r2.A0e
            X.0th r0 = r0.A0K
            X.0tZ r1 = r0.A03(r1)
            if (r1 == 0) goto L_0x024a
            r0 = 0
            r2.A0X(r1, r3, r0)
        L_0x024a:
            r4.A03()
            return
        L_0x024e:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.notification.AndroidWear r2 = (com.obwhatsapp.notification.AndroidWear) r2
            java.lang.Object r1 = r7.A01
            X.0sH r1 = (X.C16010sH) r1
            java.lang.String r7 = r7.A02
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r12 = r1.A08(r0)
            X.0rv r12 = (X.C15830rv) r12
            X.15I r1 = r2.A04
            r0 = 2
            r1.A09(r12, r0)
            X.0tb r3 = r2.A01
            X.AnonymousClass00B.A06(r12)
            java.util.List r8 = java.util.Collections.singletonList(r12)
            r4 = 0
            r10 = 0
            r6 = r4
            r9 = r4
            r11 = 0
            r5 = r4
            r3.A0A(r4, r5, r6, r7, r8, r9, r10, r11)
            X.10Y r11 = r2.A03
            r13 = 1
            r14 = 1
            r15 = 1
            r16 = 1
            r11.A01(r12, r13, r14, r15, r16)
            r2.A03()
            return
        L_0x0286:
            java.lang.Object r2 = r7.A00
            X.11I r2 = (X.AnonymousClass11I) r2
            java.lang.String r0 = "status_distribution"
            java.lang.Object r1 = r7.A01
            X.028 r1 = (X.AnonymousClass028) r1
            java.lang.String r0 = r2.A02(r0)
            r1.A09(r0)
            return
        L_0x0299:
            java.lang.Object r0 = r7.A00
            X.1xv r0 = (X.C42511xv) r0
            java.lang.String r3 = r7.A02
            java.lang.Object r2 = r7.A01
            X.1WD r2 = (X.AnonymousClass1WD) r2
            X.160 r0 = r0.A01
            X.1cl r0 = r0.A08(r3)
            if (r0 == 0) goto L_0x02af
            r2.A02(r0)
            return
        L_0x02af:
            java.lang.String r1 = "Payments: failed to read payment method from credId: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            r2.A03(r0)
            return
        L_0x02c6:
            java.lang.Object r0 = r7.A00
            X.153 r0 = (X.AnonymousClass153) r0
            java.lang.Object r1 = r7.A01
            X.0tZ r1 = (X.C16740tZ) r1
            java.lang.String r5 = r7.A02
            X.0tq r0 = r0.A01
            X.0tf r3 = r0.A02()
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x02f7 }
            r4.<init>()     // Catch:{ all -> 0x02f7 }
            java.lang.String r2 = "message_row_id"
            long r0 = r1.A13     // Catch:{ all -> 0x02f7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x02f7 }
            r4.put(r2, r0)     // Catch:{ all -> 0x02f7 }
            java.lang.String r0 = "message_template_id"
            r4.put(r0, r5)     // Catch:{ all -> 0x02f7 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x02f7 }
            java.lang.String r1 = "messages_hydrated_four_row_template"
            r0 = 5
            r2.A06(r4, r1, r0)     // Catch:{ all -> 0x02f7 }
            r3.close()
            return
        L_0x02f7:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x02fb }
        L_0x02fb:
            throw r0
        L_0x02fc:
            java.lang.Object r5 = r7.A00
            X.11H r5 = (X.AnonymousClass11H) r5
            java.lang.Object r4 = r7.A01
            X.0rv r4 = (X.C15830rv) r4
            java.lang.String r3 = r7.A02
            r2 = 0
            X.0rt r1 = r5.A02
            X.0rx r0 = r1.A06(r4)
            if (r0 != 0) goto L_0x0319
            X.0rx r0 = new X.0rx
            r0.<init>(r4)
            r0.A0d = r3
            r1.A0D(r0, r4)
        L_0x0319:
            r0.A0d = r3
            r5.A02(r0, r4, r2)
            return
        L_0x031f:
            java.lang.Object r2 = r7.A00
            X.1wN r2 = (X.C41681wN) r2
            java.lang.String r1 = r7.A02
            java.lang.Object r0 = r7.A01
            X.2Yq r0 = (X.C50262Yq) r0
            r2.A08(r0, r1)
            return
        L_0x032d:
            java.lang.Object r3 = r7.A00
            X.25g r3 = (X.C447225g) r3
            java.lang.String r2 = r7.A02
            java.lang.Object r6 = r7.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.String r1 = "voip/actionStartNewOutgoingCall async start for callId "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r4 = android.os.SystemClock.elapsedRealtime()
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r1)
            if (r0 == 0) goto L_0x0387
            java.lang.String r0 = r1.callId
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x0387
            X.0ua r1 = r3.A1e
            r0 = 1
            r1.A06(r0)
            X.0pd r2 = r3.A2O
            r1 = 1971(0x7b3, float:2.762E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x038b
            java.util.Iterator r2 = r6.iterator()
        L_0x0375:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x038b
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1HG r0 = r3.A2V
            r0.A00(r1)
            goto L_0x0375
        L_0x0387:
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async operation canceled"
            goto L_0x03a4
        L_0x038b:
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async operation elapsed "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r4
            r2.append(r0)
            java.lang.String r0 = " ms"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x03a4:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x03a8:
            java.lang.Object r0 = r7.A00
            X.262 r0 = (X.AnonymousClass262) r0
            java.lang.String r6 = r7.A02
            java.lang.Object r3 = r7.A01
            X.260 r3 = (X.AnonymousClass260) r3
            X.1Kl r0 = r0.A01
            r21 = r0
            X.26B r9 = r3.A02
            java.util.List r0 = r3.A05
            r20 = r0
            int r0 = r3.A01
            r19 = r0
            r5 = 1
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x03da
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 5Ae -> 0x0762 }
            r0 = 8
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r1 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            r0 = r20
            java.util.Collections.sort(r0, r1)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0796
        L_0x03da:
            r8 = 3
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = "server_score"
            r4 = 0
            r1[r4] = r0     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = "distance"
            r1[r5] = r0     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = "endpoint"
            r18 = 2
            r1[r18] = r0     // Catch:{ 5Ae -> 0x0762 }
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch:{ 5Ae -> 0x0762 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            X.4Wu r2 = new X.4Wu     // Catch:{ 5Ae -> 0x0762 }
            r2.<init>(r6)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r6 = "_comment"
            org.json.JSONObject r10 = r2.A02     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Object r0 = r10.opt(r6)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0415
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5Ae -> 0x0762 }
            if (r0 != 0) goto L_0x0415
            java.lang.String r0 = "'s value is not a String."
            java.lang.String r0 = X.C18450wi.A06(r6, r0)     // Catch:{ 5Ae -> 0x0762 }
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
        L_0x0414:
            throw r1     // Catch:{ 5Ae -> 0x0762 }
        L_0x0415:
            java.lang.String r6 = "_version"
            java.lang.Object r0 = r10.opt(r6)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x042d
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 5Ae -> 0x0762 }
            if (r0 != 0) goto L_0x042d
            java.lang.String r0 = "'s value is not a String."
            java.lang.String r0 = X.C18450wi.A06(r6, r0)     // Catch:{ 5Ae -> 0x0762 }
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x042d:
            java.lang.String r0 = "biz_value_features"
            org.json.JSONObject r13 = r10.optJSONObject(r0)     // Catch:{ 5Ae -> 0x0762 }
            if (r13 == 0) goto L_0x069d
            X.4cG r12 = r2.A04     // Catch:{ 5Ae -> 0x0762 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ 5Ae -> 0x0762 }
            r14.<init>()     // Catch:{ 5Ae -> 0x0762 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ 5Ae -> 0x0762 }
            r11.<init>()     // Catch:{ 5Ae -> 0x0762 }
            java.util.Iterator r17 = r13.keys()     // Catch:{ 5Ae -> 0x0762 }
            X.C18450wi.A0B(r17)     // Catch:{ 5Ae -> 0x0762 }
        L_0x0448:
            boolean r0 = r17.hasNext()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x04c3
            java.lang.Object r7 = r17.next()     // Catch:{ 5Ae -> 0x0762 }
            boolean r0 = r11.containsKey(r7)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 != 0) goto L_0x0463
            X.C18450wi.A09(r7)     // Catch:{ 5Ae -> 0x0762 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>()     // Catch:{ 5Ae -> 0x0762 }
            r11.put(r7, r0)     // Catch:{ 5Ae -> 0x0762 }
        L_0x0463:
            java.lang.String r6 = "\\b"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>(r6)     // Catch:{ 5Ae -> 0x0762 }
            r0.append(r7)     // Catch:{ 5Ae -> 0x0762 }
            r0.append(r6)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = r0.toString()     // Catch:{ 5Ae -> 0x0762 }
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r0)     // Catch:{ 5Ae -> 0x0762 }
            X.C18450wi.A0B(r6)     // Catch:{ 5Ae -> 0x0762 }
            java.util.Iterator r16 = r13.keys()     // Catch:{ 5Ae -> 0x0762 }
            X.C18450wi.A0B(r16)     // Catch:{ 5Ae -> 0x0762 }
        L_0x0482:
            boolean r0 = r16.hasNext()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0448
            java.lang.Object r15 = r16.next()     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Object r0 = r13.get(r15)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = r0.toString()     // Catch:{ 5Ae -> 0x0762 }
            java.util.regex.Matcher r0 = r6.matcher(r0)     // Catch:{ 5Ae -> 0x0762 }
            X.C18450wi.A0B(r0)     // Catch:{ 5Ae -> 0x0762 }
            boolean r0 = r0.find()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0482
            boolean r0 = r11.containsKey(r15)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 != 0) goto L_0x04b4
            X.C18450wi.A09(r15)     // Catch:{ 5Ae -> 0x0762 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>()     // Catch:{ 5Ae -> 0x0762 }
            r11.put(r15, r0)     // Catch:{ 5Ae -> 0x0762 }
        L_0x04b4:
            java.lang.Object r0 = r11.get(r15)     // Catch:{ 5Ae -> 0x0762 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0482
            X.C18450wi.A09(r7)     // Catch:{ 5Ae -> 0x0762 }
            r0.add(r7)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0482
        L_0x04c3:
            java.util.Set r0 = r11.keySet()     // Catch:{ 5Ae -> 0x0762 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ 5Ae -> 0x0762 }
        L_0x04cb:
            boolean r0 = r7.hasNext()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x04e3
            java.lang.Object r6 = r7.next()     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5Ae -> 0x0762 }
            X.C18450wi.A09(r6)     // Catch:{ 5Ae -> 0x0762 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>()     // Catch:{ 5Ae -> 0x0762 }
            X.AnonymousClass465.A00(r6, r11, r0, r14)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x04cb
        L_0x04e3:
            java.util.Iterator r16 = r14.iterator()     // Catch:{ 5Ae -> 0x0762 }
        L_0x04e7:
            boolean r0 = r16.hasNext()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x059d
            java.lang.Object r6 = r16.next()     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Object r14 = r13.get(r6)     // Catch:{ 5Ae -> 0x0762 }
            boolean r0 = r14 instanceof java.lang.Integer     // Catch:{ 5Ae -> 0x0762 }
            if (r0 != 0) goto L_0x04ff
            boolean r0 = r14 instanceof java.lang.Double     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0503
        L_0x04ff:
            java.lang.String r14 = r14.toString()     // Catch:{ 5Ae -> 0x0762 }
        L_0x0503:
            boolean r0 = r14 instanceof java.lang.String     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0583
            boolean r0 = r6.equals(r14)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0511
            r12.A0B(r6, r5)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x04e7
        L_0x0511:
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ 5Ae -> 0x0762 }
            X.C18450wi.A0H(r14, r5)     // Catch:{ 5Ae -> 0x0762 }
            int r15 = r12.A0B(r6, r4)     // Catch:{ 5Ae -> 0x0762 }
            java.util.HashMap r7 = r12.A02     // Catch:{ 5Ae -> 0x0762 }
            java.util.Vector r11 = r12.A06     // Catch:{ 5Ae -> 0x0762 }
            int r0 = r11.size()     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 5Ae -> 0x0762 }
            r7.put(r6, r0)     // Catch:{ 5Ae -> 0x0762 }
            java.util.Vector r7 = r12.A08     // Catch:{ 5Ae -> 0x0762 }
            java.util.Vector r0 = new java.util.Vector     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>()     // Catch:{ 5Ae -> 0x0762 }
            r7.addElement(r0)     // Catch:{ 5Ae -> 0x0762 }
            X.4Vb r7 = new X.4Vb     // Catch:{ 5Ae -> 0x0762 }
            r7.<init>(r14)     // Catch:{ 5Ae -> 0x0762 }
            int r14 = r12.A07(r7, r6)     // Catch:{ 5Ae -> 0x0762 }
            char r0 = r7.A01()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 != 0) goto L_0x0553
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch:{ 5Ae -> 0x0762 }
            X.1Jq r0 = new X.1Jq     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>(r7, r6)     // Catch:{ 5Ae -> 0x0762 }
            r11.add(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x04e7
        L_0x0553:
            java.lang.String r0 = "Unexpected character '"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            char r0 = r7.A01()     // Catch:{ 5Ae -> 0x0762 }
            r1.append(r0)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = "' found at index "
            r1.append(r0)     // Catch:{ 5Ae -> 0x0762 }
            int r0 = r7.A00     // Catch:{ 5Ae -> 0x0762 }
            r1.append(r0)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = " in "
            r1.append(r0)     // Catch:{ 5Ae -> 0x0762 }
            r1.append(r6)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = "'s expression"
            r1.append(r0)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = r1.toString()     // Catch:{ 5Ae -> 0x0762 }
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x0583:
            java.lang.String r0 = "Feature "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            r1.append(r6)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = " has unexpected type."
            r1.append(r0)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = r1.toString()     // Catch:{ 5Ae -> 0x0762 }
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x059d:
            java.lang.String r0 = "biz_multiply_values"
            org.json.JSONObject r7 = r10.optJSONObject(r0)     // Catch:{ 5Ae -> 0x0762 }
            if (r7 == 0) goto L_0x0694
            java.lang.String r0 = "base_values"
            org.json.JSONObject r6 = r7.optJSONObject(r0)     // Catch:{ 5Ae -> 0x0762 }
            if (r6 == 0) goto L_0x068b
            java.util.HashMap r0 = r2.A05     // Catch:{ 5Ae -> 0x0762 }
            java.util.Vector r0 = r2.A01(r0, r6)     // Catch:{ 5Ae -> 0x0762 }
            r2.A00 = r0     // Catch:{ 5Ae -> 0x0762 }
            java.util.Vector r0 = r2.A02(r7, r5)     // Catch:{ 5Ae -> 0x0762 }
            r2.A01 = r0     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = "sort_strategy"
            java.lang.Object r6 = r10.opt(r0)     // Catch:{ 5Ae -> 0x0762 }
            if (r6 == 0) goto L_0x0681
            boolean r0 = r6 instanceof java.lang.String     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0677
            java.lang.String r0 = "asc"
            boolean r0 = r6.equals(r0)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x05d2
            r0 = 0
            goto L_0x05db
        L_0x05d2:
            java.lang.String r0 = "desc"
            boolean r0 = r6.equals(r0)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0669
            r0 = 1
        L_0x05db:
            r2.A03 = r0     // Catch:{ 5Ae -> 0x0762 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ 5Ae -> 0x0762 }
            r7.<init>()     // Catch:{ 5Ae -> 0x0762 }
            java.util.Vector r11 = r12.A09     // Catch:{ 5Ae -> 0x0762 }
            r11.clear()     // Catch:{ 5Ae -> 0x0762 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ 5Ae -> 0x0762 }
            r1 = 0
        L_0x05ec:
            boolean r0 = r14.hasNext()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0637
            int r13 = r1 + 1
            java.lang.Object r10 = r14.next()     // Catch:{ 5Ae -> 0x0762 }
            java.util.HashSet r0 = r12.A04     // Catch:{ 5Ae -> 0x0762 }
            boolean r0 = r0.contains(r10)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x062a
            boolean r0 = r7.contains(r10)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 != 0) goto L_0x061d
            java.util.HashMap r0 = r12.A03     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Object r6 = X.C25411Jr.A00(r0, r10)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 5Ae -> 0x0762 }
            X.1Jq r0 = new X.1Jq     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>(r6, r1)     // Catch:{ 5Ae -> 0x0762 }
            r11.add(r0)     // Catch:{ 5Ae -> 0x0762 }
            r7.add(r10)     // Catch:{ 5Ae -> 0x0762 }
            r1 = r13
            goto L_0x05ec
        L_0x061d:
            java.lang.String r0 = "inputOrder contains multiple occurrences of extracted feature "
            java.lang.String r0 = X.C18450wi.A06(r0, r10)     // Catch:{ 5Ae -> 0x0762 }
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x062a:
            java.lang.String r0 = "inputOrder contains undeclared symbol "
            java.lang.String r0 = X.C18450wi.A06(r0, r10)     // Catch:{ 5Ae -> 0x0762 }
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x0637:
            java.util.HashSet r0 = r12.A05     // Catch:{ 5Ae -> 0x0762 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 5Ae -> 0x0762 }
        L_0x063d:
            boolean r0 = r1.hasNext()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x06a6
            java.lang.Object r6 = r1.next()     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5Ae -> 0x0762 }
            boolean r0 = r7.contains(r6)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 != 0) goto L_0x063d
            java.lang.String r0 = "Required extracted feature "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            r1.append(r6)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = " is not provided in inputOrder"
            r1.append(r0)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = r1.toString()     // Catch:{ 5Ae -> 0x0762 }
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x0669:
            java.lang.String r0 = "sort_strategy has unexpected value: "
            java.lang.String r0 = X.C18450wi.A06(r0, r6)     // Catch:{ 5Ae -> 0x0762 }
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x0677:
            java.lang.String r0 = "sort_strategy's value is not a String."
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x0681:
            java.lang.String r0 = "sort_strategy missing from config file."
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x068b:
            java.lang.String r0 = "base_values missing in biz_multiply_values in config file."
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x0694:
            java.lang.String r0 = "biz_multiply_values missing from config file."
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x069d:
            java.lang.String r0 = "biz_value_features missing from config file."
            X.5Ae r1 = new X.5Ae     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0414
        L_0x06a6:
            java.lang.String r1 = r9.A08     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r0 = "country_default"
            boolean r0 = r1.equals(r0)     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x06e7
            java.util.Iterator r9 = r20.iterator()     // Catch:{ 5Ae -> 0x0762 }
        L_0x06b4:
            boolean r0 = r9.hasNext()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0744
            java.lang.Object r6 = r9.next()     // Catch:{ 5Ae -> 0x0762 }
            X.1US r6 = (X.AnonymousClass1US) r6     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double[] r7 = new java.lang.Double[r8]     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = r6.A07     // Catch:{ 5Ae -> 0x0762 }
            r7[r4] = r0     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = X.C25611Kl.A06     // Catch:{ 5Ae -> 0x0762 }
            r7[r5] = r0     // Catch:{ 5Ae -> 0x0762 }
            r0 = r19
            double r0 = (double) r0     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 5Ae -> 0x0762 }
            r7[r18] = r0     // Catch:{ 5Ae -> 0x0762 }
            java.util.List r1 = java.util.Arrays.asList(r7)     // Catch:{ 5Ae -> 0x0762 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>(r1)     // Catch:{ 5Ae -> 0x0762 }
            double r0 = r2.A00(r0)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 5Ae -> 0x0762 }
            r6.A02 = r0     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x06b4
        L_0x06e7:
            java.lang.Double r0 = r9.A03     // Catch:{ 5Ae -> 0x0762 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ 5Ae -> 0x0762 }
            double r6 = r0.doubleValue()     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = r9.A04     // Catch:{ 5Ae -> 0x0762 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ 5Ae -> 0x0762 }
            double r0 = r0.doubleValue()     // Catch:{ 5Ae -> 0x0762 }
            java.lang.String r10 = ""
            android.location.Location r9 = new android.location.Location     // Catch:{ 5Ae -> 0x0762 }
            r9.<init>(r10)     // Catch:{ 5Ae -> 0x0762 }
            r9.setLatitude(r6)     // Catch:{ 5Ae -> 0x0762 }
            r9.setLongitude(r0)     // Catch:{ 5Ae -> 0x0762 }
            java.util.Iterator r10 = r20.iterator()     // Catch:{ 5Ae -> 0x0762 }
        L_0x070a:
            boolean r0 = r10.hasNext()     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0744
            java.lang.Object r6 = r10.next()     // Catch:{ 5Ae -> 0x0762 }
            X.1US r6 = (X.AnonymousClass1US) r6     // Catch:{ 5Ae -> 0x0762 }
            r6.A03(r9)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double[] r7 = new java.lang.Double[r8]     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = r6.A07     // Catch:{ 5Ae -> 0x0762 }
            r7[r4] = r0     // Catch:{ 5Ae -> 0x0762 }
            double r0 = r6.A00     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 5Ae -> 0x0762 }
            r7[r5] = r0     // Catch:{ 5Ae -> 0x0762 }
            r0 = r19
            double r0 = (double) r0     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 5Ae -> 0x0762 }
            r7[r18] = r0     // Catch:{ 5Ae -> 0x0762 }
            java.util.List r1 = java.util.Arrays.asList(r7)     // Catch:{ 5Ae -> 0x0762 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 5Ae -> 0x0762 }
            r0.<init>(r1)     // Catch:{ 5Ae -> 0x0762 }
            double r0 = r2.A00(r0)     // Catch:{ 5Ae -> 0x0762 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 5Ae -> 0x0762 }
            r6.A02 = r0     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x070a
        L_0x0744:
            boolean r0 = r2.A03     // Catch:{ 5Ae -> 0x0762 }
            if (r0 == 0) goto L_0x0755
            r0 = 11
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r1 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            r0 = r20
            java.util.Collections.sort(r0, r1)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0796
        L_0x0755:
            r0 = 12
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r1 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1     // Catch:{ 5Ae -> 0x0762 }
            r1.<init>(r0)     // Catch:{ 5Ae -> 0x0762 }
            r0 = r20
            java.util.Collections.sort(r0, r1)     // Catch:{ 5Ae -> 0x0762 }
            goto L_0x0796
        L_0x0762:
            r4 = move-exception
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/rankUsingConfig Failed with exception message: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r4.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = r21
            X.0so r2 = r0.A00
            java.lang.String r1 = r4.getMessage()
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/rankUsingConfig Value model parsing failed"
            r2.AcB(r0, r1, r5)
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 8
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r1 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r1.<init>(r0)
            r0 = r20
            java.util.Collections.sort(r0, r1)
        L_0x0796:
            r0 = r21
            X.0pt r2 = r0.A01
            r1 = 26
            com.facebook.redex.RunnableRunnableShape4S0100000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape4S0100000_I0_3
            r0.<init>(r3, r1)
            r2.A0K(r0)
            return
        L_0x07a5:
            java.lang.Object r5 = r7.A00
            X.1Z7 r5 = (X.AnonymousClass1Z7) r5
            java.lang.String r1 = r7.A02
            java.lang.Object r2 = r7.A01
            java.util.Map r2 = (java.util.Map) r2
            X.0q2 r4 = new X.0q2
            r4.<init>()
            r0 = 0
            r4.A03(r1, r0)
            r1 = 1
            java.util.Map r0 = X.C87604Xq.A01(r2)
            r4.A03(r0, r1)
            X.0q4 r3 = r5.A01
            X.0q1 r2 = r5.A02
            java.util.List r1 = r4.A00
            X.0q3 r0 = new X.0q3
            r0.<init>(r1)
            X.C14980q6.A00(r3, r0, r2)
            return
        L_0x07cf:
            java.lang.Object r5 = r7.A00
            X.1Pb r5 = (X.C26771Pb) r5
            java.lang.Object r4 = r7.A01
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
            java.lang.String r3 = r7.A02
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x07e0, all -> 0x07e6 }
            r4.get(r1, r0)     // Catch:{ Exception -> 0x07e0, all -> 0x07e6 }
        L_0x07e0:
            java.util.Hashtable r0 = r5.A00
            r0.remove(r3)
            return
        L_0x07e6:
            r1 = move-exception
            java.util.Hashtable r0 = r5.A00
            r0.remove(r3)
            throw r1
        L_0x07ed:
            java.lang.Object r4 = r7.A00
            X.1KE r4 = (X.AnonymousClass1KE) r4
            java.lang.String r3 = r7.A02
            java.lang.Object r2 = r7.A01
            X.5S7 r2 = (X.AnonymousClass5S7) r2
            X.1KB r1 = r4.A09
            X.4yp r0 = new X.4yp
            r0.<init>(r4, r2, r3)
            r1.Aah(r0)
            return
        L_0x0802:
            java.lang.Object r4 = r7.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r4 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r4
            java.lang.String r3 = r7.A02
            java.lang.Object r5 = r7.A01
            java.lang.String r8 = "settings-gdrive/auth-request/user-cancelled"
            java.lang.String r6 = "settings-gdrive/auth-request"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r1.<init>()     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = "settings-gdrive/auth-request asking GoogleAuthUtil for token for "
            r1.append(r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r3)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r1.append(r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = r1.toString()     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r1 = "com.google"
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r0.<init>(r3, r1)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r7 = X.C62103Bq.A01(r0, r4)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r1.<init>()     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = "settings-gdrive/auth-request for account "
            r1.append(r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r3)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r1.append(r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = ", token has been received."
            r1.append(r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = r1.toString()     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            boolean r0 = r4.A0p     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            if (r0 != 0) goto L_0x0867
            X.0pt r2 = r4.A05     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r1 = 2
            com.facebook.redex.RunnableRunnableShape0S2100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S2100000_I0     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r0.<init>(r4, r7, r3, r1)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r2.A0K(r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
        L_0x0861:
            android.os.ConditionVariable r0 = r4.A0n     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r0.open()     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            goto L_0x0881
        L_0x0867:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r1.<init>()     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = "settings-gdrive/auth-request/received-token-but-user-cancelled-the-request/"
            r1.append(r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r3)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            r1.append(r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            java.lang.String r0 = r1.toString()     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3W3 -> 0x08cc, 2RG -> 0x08b6, IOException -> 0x089c, 2RH | SecurityException -> 0x0882 }
            goto L_0x0861
        L_0x0881:
            return
        L_0x0882:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            android.os.ConditionVariable r0 = r4.A0n
            r0.open()
            boolean r0 = r4.A0p
            if (r0 != 0) goto L_0x09be
            X.0pt r2 = r4.A05
            r1 = 13
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r3, r4)
            r2.A0K(r0)
            return
        L_0x089c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            android.os.ConditionVariable r0 = r4.A0n
            r0.open()
            boolean r0 = r4.A0p
            if (r0 != 0) goto L_0x09be
            X.0pt r2 = r4.A05
            r1 = 30
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r4, r1)
            r2.A0K(r0)
            return
        L_0x08b6:
            r3 = move-exception
            boolean r1 = r4.A0p
            android.os.ConditionVariable r0 = r4.A0n
            if (r1 != 0) goto L_0x09d9
            r0.close()
            X.0pt r2 = r4.A05
            r1 = 3
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
            return
        L_0x08cc:
            r3 = move-exception
            boolean r0 = r4.A0p
            if (r0 == 0) goto L_0x08d5
            android.os.ConditionVariable r0 = r4.A0n
            goto L_0x09e4
        L_0x08d5:
            X.0pt r2 = r4.A05
            r1 = 5
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r0.<init>(r4, r1, r5)
            r2.A0K(r0)
            goto L_0x09e7
        L_0x08e2:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r2 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.String r1 = r7.A02
            java.lang.Object r0 = r7.A01
            com.obwhatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r0 = (com.obwhatsapp.backup.google.SettingsGoogleDrive.AuthRequestDialogFragment) r0
            com.obwhatsapp.backup.google.SettingsGoogleDrive.A0A(r0, r2, r1)
            return
        L_0x08f0:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.backup.google.SettingsGoogleDrive r2 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.String r1 = r7.A02
            java.lang.Object r0 = r7.A01
            com.obwhatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r0 = (com.obwhatsapp.backup.google.SettingsGoogleDrive.AuthRequestDialogFragment) r0
            r2.A3D(r0, r1)
            return
        L_0x08fe:
            java.lang.Object r2 = r7.A00
            X.2YL r2 = (X.AnonymousClass2YL) r2
            java.lang.String r1 = r7.A02
            java.lang.Object r0 = r7.A01
            com.obwhatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment r0 = (com.obwhatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment) r0
            r2.A3A(r0, r1)
            return
        L_0x090c:
            java.lang.Object r4 = r7.A00
            X.2YL r4 = (X.AnonymousClass2YL) r4
            java.lang.String r3 = r7.A02
            java.lang.Object r5 = r7.A01
            java.lang.String r8 = "settings-gdrive/auth-request/user-cancelled"
            java.lang.String r6 = "settings-gdrive/auth-request"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r1.<init>()     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = "settings-gdrive/auth-request asking GoogleAuthUtil for token for "
            r1.append(r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r3)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r1.append(r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = r1.toString()     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r1 = "com.google"
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r0.<init>(r3, r1)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r7 = X.C62103Bq.A01(r0, r4)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r1.<init>()     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = "settings-gdrive/auth-request for account "
            r1.append(r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r3)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r1.append(r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = ", token has been received."
            r1.append(r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = r1.toString()     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            boolean r0 = r4.A0X     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            if (r0 != 0) goto L_0x0971
            X.0pt r2 = r4.A05     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r1 = 1
            com.facebook.redex.RunnableRunnableShape0S2100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S2100000_I0     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r0.<init>(r4, r7, r3, r1)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r2.A0K(r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
        L_0x096b:
            android.os.ConditionVariable r0 = r4.A0V     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r0.open()     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            goto L_0x098b
        L_0x0971:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r1.<init>()     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = "settings-gdrive/auth-request/received-token-but-user-cancelled-the-request/"
            r1.append(r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r3)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            r1.append(r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            java.lang.String r0 = r1.toString()     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3W3 -> 0x09dd, 2RG -> 0x09c2, IOException -> 0x09a5, 2RH | SecurityException -> 0x098c }
            goto L_0x096b
        L_0x098b:
            return
        L_0x098c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            android.os.ConditionVariable r0 = r4.A0V
            r0.open()
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x09be
            X.0pt r2 = r4.A05
            r1 = 7
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r0.<init>(r1, r3, r4)
            r2.A0K(r0)
            return
        L_0x09a5:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            android.os.ConditionVariable r0 = r4.A0V
            r0.open()
            boolean r0 = r4.A0X
            if (r0 != 0) goto L_0x09be
            X.0pt r2 = r4.A05
            r1 = 5
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r4, r1)
            r2.A0K(r0)
            return
        L_0x09be:
            com.whatsapp.util.Log.i((java.lang.String) r8)
            return
        L_0x09c2:
            r3 = move-exception
            boolean r1 = r4.A0X
            android.os.ConditionVariable r0 = r4.A0V
            if (r1 != 0) goto L_0x09d9
            r0.close()
            X.0pt r2 = r4.A05
            r1 = 47
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r3, r1, r4)
            r2.A0K(r0)
            return
        L_0x09d9:
            r0.open()
            return
        L_0x09dd:
            r3 = move-exception
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x09ee
            android.os.ConditionVariable r0 = r4.A0V
        L_0x09e4:
            r0.open()
        L_0x09e7:
            java.lang.String r0 = "settings-gdrive/gps-unavailable"
            com.whatsapp.util.Log.e(r0, r3)
            return
        L_0x09ee:
            X.0pt r2 = r4.A05
            r1 = 45
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r5, r1, r4)
            r2.A0K(r0)
            goto L_0x09e7
        L_0x09fb:
            java.lang.Object r2 = r7.A00
            X.0pz r2 = (X.C14910pz) r2
            java.lang.String r1 = r7.A02
            java.lang.Object r0 = r7.A01
            r2.A08(r1, r0)
            return
        L_0x0a07:
            java.lang.Object r0 = r7.A01
            com.google.android.gms.internal.gtm.zzbq r0 = (com.google.android.gms.internal.gtm.zzbq) r0
            com.google.android.gms.internal.gtm.zzck r1 = r0.zza
            java.lang.String r0 = r7.A02
            r1.zzn(r0)
            java.lang.Object r0 = r7.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0a1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1200000_I0.run():void");
    }
}
