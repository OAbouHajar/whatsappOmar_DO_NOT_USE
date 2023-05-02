package com.facebook.redex;

import X.C29251aI;
import com.google.android.gms.internal.gtm.zzbq;

public class RunnableRunnableShape17S0100000_I1 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape17S0100000_I1(C29251aI r1, int i2) {
        this.A01 = i2;
        if (29 - i2 != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public RunnableRunnableShape17S0100000_I1(zzbq zzbq, boolean z2, int i2) {
        this.A01 = 2;
        this.A00 = zzbq;
    }

    public RunnableRunnableShape17S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r1 = X.AnonymousClass000.A0r(r0);
        r1.append(r2.A0I);
        X.C13680ns.A1V(r1);
        r1 = X.C14750ph.A0q().A0x(r2, r2.A0I);
        X.AnonymousClass22U.A00(r1, "AcceptInviteLinkActivity");
        r2.A2X(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x06dc, code lost:
        if (r1 != null) goto L_0x06de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06fc, code lost:
        ((com.obwhatsapp.community.CommunityTabViewModel) r1).A07(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0702, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:252:0x06e9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:285:0x0793 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:290:0x0798 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:295:0x079d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:305:0x07a9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:310:0x07ae */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02f0 A[Catch:{ all -> 0x07ae, all -> 0x07b6 }, LOOP:5: B:107:0x02ea->B:109:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02c3 A[Catch:{ all -> 0x07ae, all -> 0x07b6 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:252:0x06e9=Splitter:B:252:0x06e9, B:246:0x06de=Splitter:B:246:0x06de} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:310:0x07ae=Splitter:B:310:0x07ae, B:62:0x01ff=Splitter:B:62:0x01ff} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r1 = r33
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x04b8;
                case 1: goto L_0x04c0;
                case 2: goto L_0x04ec;
                case 3: goto L_0x04f6;
                case 4: goto L_0x0508;
                case 5: goto L_0x0510;
                case 6: goto L_0x000f;
                case 7: goto L_0x0028;
                case 8: goto L_0x0043;
                case 9: goto L_0x0073;
                case 10: goto L_0x0518;
                case 11: goto L_0x0081;
                case 12: goto L_0x0573;
                case 13: goto L_0x030f;
                case 14: goto L_0x057c;
                case 15: goto L_0x0584;
                case 16: goto L_0x058c;
                case 17: goto L_0x0594;
                case 18: goto L_0x0594;
                case 19: goto L_0x037b;
                case 20: goto L_0x05a1;
                case 21: goto L_0x05d0;
                case 22: goto L_0x05d8;
                case 23: goto L_0x05d8;
                case 24: goto L_0x062c;
                case 25: goto L_0x05e4;
                case 26: goto L_0x0608;
                case 27: goto L_0x062c;
                case 28: goto L_0x0634;
                case 29: goto L_0x063c;
                case 30: goto L_0x0657;
                case 31: goto L_0x0672;
                case 32: goto L_0x067a;
                case 33: goto L_0x0007;
                case 34: goto L_0x0007;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0682;
                case 38: goto L_0x0387;
                case 39: goto L_0x06ef;
                case 40: goto L_0x06f6;
                case 41: goto L_0x06f6;
                case 42: goto L_0x0703;
                case 43: goto L_0x03a0;
                case 44: goto L_0x000e;
                case 45: goto L_0x0730;
                case 46: goto L_0x0749;
                case 47: goto L_0x0772;
                case 48: goto L_0x046a;
                case 49: goto L_0x077a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r0
            r0.A3W()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.HomeActivity r1 = (com.obwhatsapp.HomeActivity) r1
            X.0pk r2 = r1.A39()
            boolean r0 = r2 instanceof X.C14800pm
            if (r0 == 0) goto L_0x000e
            X.0pm r2 = (X.C14800pm) r2
            if (r2 == 0) goto L_0x000e
            X.0pl r1 = r1.A0R
            r0 = 0
            r1.A00 = r0
            r1.A02(r2)
            return
        L_0x0028:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0) r0
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity r2 = (com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity) r2
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x000e
            X.0rt r1 = r2.A08
            X.0sL r0 = r2.A0I
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "acceptlink/onConversationsListChanged/ok/"
            goto L_0x0053
        L_0x0043:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0) r0
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity r2 = (com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity) r2
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "acceptlink/onConversationChanged/ok/"
        L_0x0053:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.0sL r0 = r2.A0I
            r1.append(r0)
            X.C13680ns.A1V(r1)
            X.0ph r1 = X.C14750ph.A0q()
            X.0sL r0 = r2.A0I
            android.content.Intent r1 = r1.A0x(r2, r0)
            java.lang.String r0 = "AcceptInviteLinkActivity"
            X.AnonymousClass22U.A00(r1, r0)
            r0 = 1
            r2.A2X(r1, r0)
            return
        L_0x0073:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.account.delete.DeleteAccountFeedback r1 = (com.obwhatsapp.account.delete.DeleteAccountFeedback) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x000e
            X.0Pu r0 = r1.A05
            r0.A00()
            return
        L_0x0081:
            java.lang.Object r12 = r1.A00
            X.2x0 r12 = (X.C59292x0) r12
            X.0xT r0 = r12.A0A
            java.util.concurrent.locks.Lock r22 = r0.A01()
            if (r22 == 0) goto L_0x0090
            r22.lock()     // Catch:{ all -> 0x07b6 }
        L_0x0090:
            X.0t3 r0 = r12.A06     // Catch:{ all -> 0x07b6 }
            long r2 = r0.A00()     // Catch:{ all -> 0x07b6 }
            X.0rz r8 = r12.A07     // Catch:{ all -> 0x07b6 }
            android.content.SharedPreferences r4 = X.C13680ns.A0B(r8)     // Catch:{ all -> 0x07b6 }
            java.lang.String r7 = "dithered_last_signed_prekey_rotation"
            r0 = -9223372036854775808
            long r13 = r4.getLong(r7, r0)     // Catch:{ all -> 0x07b6 }
            r4 = 0
            r10 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00cf
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00cf
            long r4 = r13 + r10
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00cf
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = "RotateKeysAction/rotateSignedPrekeyAndSenderKeys/rotate keys alarm fired before ready to rotate signed prekey; rotation skipped until "
            r1.append(r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = X.C42681yF.A02(r4)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x07b6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07b6 }
            goto L_0x0309
        L_0x00cf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = "RotateKeysAction/rotateSignedPrekeyAndSenderKeys/rotating signed prekey now; now="
            r1.append(r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = X.C42681yF.A02(r2)     // Catch:{ all -> 0x07b6 }
            r1.append(r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = "; lastSignedPrekeyRotation="
            r1.append(r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = X.C42681yF.A02(r13)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x07b6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07b6 }
            X.11s r0 = r12.A08     // Catch:{ all -> 0x07b6 }
            r32 = r0
            X.1dG r0 = r32.A0K()     // Catch:{ all -> 0x07b6 }
            X.0xb r6 = r12.A02     // Catch:{ all -> 0x07b6 }
            byte[] r5 = r0.A01     // Catch:{ all -> 0x07b6 }
            byte[] r4 = r0.A00     // Catch:{ all -> 0x07b6 }
            byte[] r1 = r0.A02     // Catch:{ all -> 0x07b6 }
            com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob r0 = new com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob     // Catch:{ all -> 0x07b6 }
            r0.<init>(r5, r4, r1)     // Catch:{ all -> 0x07b6 }
            r6.A00(r0)     // Catch:{ all -> 0x07b6 }
            android.content.SharedPreferences$Editor r0 = r8.A0K()     // Catch:{ all -> 0x07b6 }
            X.C13680ns.A0x(r0, r7, r2)     // Catch:{ all -> 0x07b6 }
            X.0sK r9 = r12.A00     // Catch:{ all -> 0x07b6 }
            r9.A0B()     // Catch:{ all -> 0x07b6 }
            X.1ZT r0 = r9.A05     // Catch:{ all -> 0x07b6 }
            if (r0 == 0) goto L_0x0309
            long r0 = r2 - r10
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x07b6 }
            X.0sG r4 = r12.A03     // Catch:{ all -> 0x07b6 }
            r4.A0U(r5)     // Catch:{ all -> 0x07b6 }
            int r4 = r5.size()     // Catch:{ all -> 0x07b6 }
            long r7 = (long) r4     // Catch:{ all -> 0x07b6 }
            r5 = 4000(0xfa0, double:1.9763E-320)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0134
            r4 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r2 = r2 - r4
            goto L_0x0135
        L_0x0134:
            r2 = r0
        L_0x0135:
            r9.A0B()     // Catch:{ all -> 0x07b6 }
            X.1Za r4 = r9.A04     // Catch:{ all -> 0x07b6 }
            X.1Yb r11 = X.C28851Ya.A02(r4)     // Catch:{ all -> 0x07b6 }
            r4 = r32
            X.1fD r5 = r4.A0A     // Catch:{ all -> 0x07b6 }
            java.lang.String r10 = "group_id"
            java.lang.String r4 = "SenderKeyStore get keys older than:"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r4)     // Catch:{ all -> 0x07b6 }
            r4.append(r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r15 = " for sender:"
            r4.append(r15)     // Catch:{ all -> 0x07b6 }
            r4.append(r11)     // Catch:{ all -> 0x07b6 }
            java.lang.String r9 = " statusKeyExpirationTimeMs:"
            r4.append(r9)     // Catch:{ all -> 0x07b6 }
            r4.append(r2)     // Catch:{ all -> 0x07b6 }
            X.C13680ns.A1V(r4)     // Catch:{ all -> 0x07b6 }
            long r16 = X.C13690nt.A09(r2)     // Catch:{ all -> 0x07b6 }
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x07b6 }
            r4 = 4
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x07b6 }
            java.lang.String r6 = r11.A02     // Catch:{ all -> 0x07b6 }
            r14 = 0
            r7[r14] = r6     // Catch:{ all -> 0x07b6 }
            int r4 = r11.A01     // Catch:{ all -> 0x07b6 }
            java.lang.String r21 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07b6 }
            r13 = 1
            r7[r13] = r21     // Catch:{ all -> 0x07b6 }
            int r4 = r11.A00     // Catch:{ all -> 0x07b6 }
            java.lang.String r20 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x07b6 }
            r4 = 2
            r7[r4] = r20     // Catch:{ all -> 0x07b6 }
            java.lang.String r19 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x07b6 }
            r4 = 3
            r7[r4] = r19     // Catch:{ all -> 0x07b6 }
            X.01d r4 = r5.A01     // Catch:{ all -> 0x07b6 }
            r31 = r4
            X.0tf r18 = r31.A02()     // Catch:{ all -> 0x07b6 }
            r4 = r18
            X.0tg r4 = r4.A02     // Catch:{ all -> 0x07aa }
            r23 = r4
            java.lang.String r5 = "sender_keys"
            java.lang.String[] r4 = new java.lang.String[r13]     // Catch:{ all -> 0x07aa }
            r16 = r4
            r4[r14] = r10     // Catch:{ all -> 0x07aa }
            X.1kq r17 = X.C34771kq.A00     // Catch:{ all -> 0x07aa }
            java.lang.String r4 = r17.getRawString()     // Catch:{ all -> 0x07aa }
            java.lang.String r26 = X.C31901fD.A00(r4, r14)     // Catch:{ all -> 0x07aa }
            r28 = 0
            r30 = r28
            r24 = r5
            r25 = r16
            r27 = r7
            r29 = r28
            android.database.Cursor r4 = r23.A09(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x07aa }
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ all -> 0x07a3 }
            r16 = r14
            r14 = 0
            r16[r14] = r10     // Catch:{ all -> 0x07a3 }
            java.lang.String r14 = r17.getRawString()     // Catch:{ all -> 0x07a3 }
            java.lang.String r26 = X.C31901fD.A00(r14, r13)     // Catch:{ all -> 0x07a3 }
            r25 = r16
            android.database.Cursor r13 = r23.A09(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x07a3 }
            if (r4 == 0) goto L_0x01e3
            int r14 = r4.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x078d }
        L_0x01d5:
            boolean r7 = r4.moveToNext()     // Catch:{ all -> 0x078d }
            if (r7 == 0) goto L_0x01e3
            java.lang.String r7 = r4.getString(r14)     // Catch:{ all -> 0x078d }
            r8.add(r7)     // Catch:{ all -> 0x078d }
            goto L_0x01d5
        L_0x01e3:
            if (r13 == 0) goto L_0x01fa
            int r10 = r13.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x078d }
        L_0x01e9:
            boolean r7 = r13.moveToNext()     // Catch:{ all -> 0x078d }
            if (r7 == 0) goto L_0x01f7
            java.lang.String r7 = r13.getString(r10)     // Catch:{ all -> 0x078d }
            r8.add(r7)     // Catch:{ all -> 0x078d }
            goto L_0x01e9
        L_0x01f7:
            r13.close()     // Catch:{ all -> 0x07a3 }
        L_0x01fa:
            if (r4 == 0) goto L_0x01ff
            r4.close()     // Catch:{ all -> 0x07aa }
        L_0x01ff:
            r18.close()     // Catch:{ all -> 0x07b6 }
            r4 = r32
            X.0xT r10 = r4.A0I     // Catch:{ all -> 0x07b6 }
            int r4 = r8.size()     // Catch:{ all -> 0x07b6 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ all -> 0x07b6 }
            r13.<init>(r4)     // Catch:{ all -> 0x07b6 }
            java.util.Iterator r14 = r8.iterator()     // Catch:{ all -> 0x07b6 }
        L_0x0213:
            boolean r4 = r14.hasNext()     // Catch:{ all -> 0x07b6 }
            if (r4 == 0) goto L_0x0226
            java.lang.String r7 = X.AnonymousClass000.A0m(r14)     // Catch:{ all -> 0x07b6 }
            X.1dH r4 = new X.1dH     // Catch:{ all -> 0x07b6 }
            r4.<init>(r11, r7)     // Catch:{ all -> 0x07b6 }
            r13.add(r4)     // Catch:{ all -> 0x07b6 }
            goto L_0x0213
        L_0x0226:
            boolean r14 = r10.A06     // Catch:{ all -> 0x07b6 }
            if (r14 == 0) goto L_0x0251
            boolean r4 = r13.isEmpty()     // Catch:{ all -> 0x07b6 }
            if (r4 != 0) goto L_0x0251
            int r4 = r13.size()     // Catch:{ all -> 0x07b6 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x07b6 }
            r7.<init>(r4)     // Catch:{ all -> 0x07b6 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x07b6 }
        L_0x023d:
            boolean r4 = r13.hasNext()     // Catch:{ all -> 0x07b6 }
            if (r4 == 0) goto L_0x025f
            java.lang.Object r4 = r13.next()     // Catch:{ all -> 0x07b6 }
            X.1dH r4 = (X.C30981dH) r4     // Catch:{ all -> 0x07b6 }
            java.util.concurrent.locks.Lock r4 = r10.A03(r4)     // Catch:{ all -> 0x07b6 }
            r7.add(r4)     // Catch:{ all -> 0x07b6 }
            goto L_0x023d
        L_0x0251:
            java.util.HashSet r7 = X.C13680ns.A0o()     // Catch:{ all -> 0x07b6 }
            if (r14 != 0) goto L_0x025f
            r4 = r32
            X.16P r4 = r4.A0H     // Catch:{ all -> 0x079e }
            r4.A00()     // Catch:{ all -> 0x079e }
            goto L_0x0262
        L_0x025f:
            r10.A06(r7)     // Catch:{ all -> 0x079e }
        L_0x0262:
            java.lang.String r4 = "SenderKeyStore deleting keys older than:"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r4)     // Catch:{ all -> 0x079e }
            r4.append(r0)     // Catch:{ all -> 0x079e }
            r4.append(r15)     // Catch:{ all -> 0x079e }
            r4.append(r11)     // Catch:{ all -> 0x079e }
            r4.append(r9)     // Catch:{ all -> 0x079e }
            r4.append(r2)     // Catch:{ all -> 0x079e }
            X.C13680ns.A1V(r4)     // Catch:{ all -> 0x079e }
            r0 = 4
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x079e }
            r10 = 0
            r9[r10] = r6     // Catch:{ all -> 0x079e }
            r4 = 1
            r9[r4] = r21     // Catch:{ all -> 0x079e }
            r0 = 2
            r9[r0] = r20     // Catch:{ all -> 0x079e }
            r0 = 3
            r9[r0] = r19     // Catch:{ all -> 0x079e }
            X.0tf r3 = r31.A02()     // Catch:{ all -> 0x079e }
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x0799 }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x0794 }
            java.lang.String r0 = r17.getRawString()     // Catch:{ all -> 0x0794 }
            java.lang.String r0 = X.C31901fD.A00(r0, r10)     // Catch:{ all -> 0x0794 }
            r1.A01(r5, r0, r9)     // Catch:{ all -> 0x0794 }
            java.lang.String r0 = r17.getRawString()     // Catch:{ all -> 0x0794 }
            java.lang.String r0 = X.C31901fD.A00(r0, r4)     // Catch:{ all -> 0x0794 }
            r1.A01(r5, r0, r9)     // Catch:{ all -> 0x0794 }
            r2.A00()     // Catch:{ all -> 0x0794 }
            r2.close()     // Catch:{ all -> 0x0799 }
            r3.close()     // Catch:{ all -> 0x079e }
            X.C18920xT.A00(r7)     // Catch:{ all -> 0x07b6 }
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x07b6 }
            java.util.Iterator r4 = r8.iterator()     // Catch:{ all -> 0x07b6 }
        L_0x02bd:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x07b6 }
            if (r0 == 0) goto L_0x02e6
            java.lang.String r3 = X.AnonymousClass000.A0m(r4)     // Catch:{ all -> 0x07b6 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x07b6 }
            r2 = 0
            if (r0 != 0) goto L_0x02bd
            com.whatsapp.jid.Jid r1 = com.whatsapp.jid.Jid.get(r3)     // Catch:{ 1W4 -> 0x02e0 }
            boolean r0 = r1 instanceof X.C16060sN     // Catch:{ 1W4 -> 0x02e0 }
            if (r0 == 0) goto L_0x02da
            X.0sN r1 = (X.C16060sN) r1     // Catch:{ 1W4 -> 0x02e0 }
            r2 = r1
            goto L_0x02e0
        L_0x02da:
            X.1W4 r0 = new X.1W4     // Catch:{ 1W4 -> 0x02e0 }
            r0.<init>((java.lang.String) r3)     // Catch:{ 1W4 -> 0x02e0 }
            throw r0     // Catch:{ 1W4 -> 0x02e0 }
        L_0x02e0:
            if (r2 == 0) goto L_0x02bd
            r5.add(r2)     // Catch:{ all -> 0x07b6 }
            goto L_0x02bd
        L_0x02e6:
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x07b6 }
        L_0x02ea:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x07b6 }
            if (r0 == 0) goto L_0x0309
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x07b6 }
            X.0sN r2 = (X.C16060sN) r2     // Catch:{ all -> 0x07b6 }
            X.0w1 r1 = r12.A01     // Catch:{ all -> 0x07b6 }
            java.lang.Integer r0 = X.C13690nt.A0U()     // Catch:{ all -> 0x07b6 }
            r1.A0H(r2, r0)     // Catch:{ all -> 0x07b6 }
            X.0sO r1 = r12.A0B     // Catch:{ all -> 0x07b6 }
            X.1cE r0 = X.C16070sO.A00(r1, r2)     // Catch:{ all -> 0x07b6 }
            r1.A04(r0)     // Catch:{ all -> 0x07b6 }
            goto L_0x02ea
        L_0x0309:
            if (r22 == 0) goto L_0x000e
            r22.unlock()
            return
        L_0x030f:
            java.lang.Object r6 = r1.A00
            X.2x0 r6 = (X.C59292x0) r6
            X.0xT r0 = r6.A0A
            java.util.concurrent.locks.Lock r8 = r0.A01()
            if (r8 == 0) goto L_0x031e
            r8.lock()     // Catch:{ all -> 0x07af }
        L_0x031e:
            X.11s r7 = r6.A08     // Catch:{ all -> 0x07af }
            X.1f2 r4 = r7.A0G()     // Catch:{ all -> 0x07af }
            X.1mr r0 = r4.A00()     // Catch:{ all -> 0x07af }
            X.1cD r0 = r0.A01     // Catch:{ all -> 0x07af }
            byte[] r3 = r0.A00()     // Catch:{ all -> 0x07af }
            r2 = 32
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x07af }
            r0 = 0
            r5 = 1
            java.lang.System.arraycopy(r3, r5, r1, r0, r2)     // Catch:{ all -> 0x07af }
            X.1mr r0 = r4.A00()     // Catch:{ all -> 0x07af }
            X.1nv r0 = r0.A00     // Catch:{ all -> 0x07af }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x07af }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x07af }
            if (r0 == 0) goto L_0x036a
            java.lang.String r0 = "RotateKeysAction/bad signed pre key found"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x07af }
            X.1dG r0 = r7.A0K()     // Catch:{ all -> 0x07af }
            X.0xb r4 = r6.A02     // Catch:{ all -> 0x07af }
            byte[] r3 = r0.A01     // Catch:{ all -> 0x07af }
            byte[] r2 = r0.A00     // Catch:{ all -> 0x07af }
            byte[] r1 = r0.A02     // Catch:{ all -> 0x07af }
            com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob r0 = new com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob     // Catch:{ all -> 0x07af }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x07af }
            r4.A00(r0)     // Catch:{ all -> 0x07af }
            X.0rz r0 = r6.A07     // Catch:{ all -> 0x07af }
            android.content.SharedPreferences$Editor r1 = r0.A0K()     // Catch:{ all -> 0x07af }
            java.lang.String r0 = "bad_signed_pre_key_check_done"
            X.C13680ns.A0z(r1, r0, r5)     // Catch:{ all -> 0x07af }
            goto L_0x0375
        L_0x036a:
            X.0rz r0 = r6.A07     // Catch:{ all -> 0x07af }
            android.content.SharedPreferences$Editor r1 = r0.A0K()     // Catch:{ all -> 0x07af }
            java.lang.String r0 = "bad_signed_pre_key_check_done"
            X.C13680ns.A0z(r1, r0, r5)     // Catch:{ all -> 0x07af }
        L_0x0375:
            if (r8 == 0) goto L_0x000e
            r8.unlock()
            return
        L_0x037b:
            java.lang.Object r1 = r1.A00
            org.apache.http.client.methods.HttpRequestBase r1 = (org.apache.http.client.methods.HttpRequestBase) r1
            boolean r0 = r1.isAborted()
            if (r0 != 0) goto L_0x000e
            goto L_0x07bd
        L_0x0387:
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxCObserverShape426S0100000_2_I0 r0 = (com.facebook.redex.IDxCObserverShape426S0100000_2_I0) r0
            java.lang.Object r1 = r0.A00
            X.2AF r1 = (X.AnonymousClass2AF) r1
            X.0sK r0 = r1.A02
            r0.A0B()
            X.1ZT r0 = r0.A05
            boolean r0 = X.AnonymousClass2AF.A02(r1, r0)
            if (r0 == 0) goto L_0x000e
            X.AnonymousClass2AF.A01(r1)
            return
        L_0x03a0:
            java.lang.Object r0 = r1.A00
            X.3AE r0 = (X.AnonymousClass3AE) r0
            X.15g r1 = r0.A0C
            X.0sL r8 = r0.A02
            java.util.Map r0 = r0.A0G
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r7 = X.C13680ns.A0n(r0)
            java.util.Iterator r11 = X.C16590tJ.A00(r1)
        L_0x03b6:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r11.next()
            X.2Bm r1 = (X.C45882Bm) r1
            boolean r0 = r1 instanceof X.AnonymousClass32Y
            if (r0 == 0) goto L_0x03b6
            X.32Y r1 = (X.AnonymousClass32Y) r1
            com.obwhatsapp.community.CommunityHomeActivity r6 = r1.A00
            X.0sL r0 = r6.A0s
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x03b6
            int r0 = r7.size()
            if (r0 == 0) goto L_0x03b6
            int r0 = r7.size()
            r10 = 0
            r9 = 1
            if (r0 != r9) goto L_0x041c
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131755261(0x7f1000fd, float:1.9141396E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Object r0 = r7.get(r10)
            r1[r10] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r9, r1)
        L_0x03f3:
            X.2T3 r3 = new X.2T3
            r3.<init>()
            r3.A08 = r0
            r2 = 2131889922(0x7f120f02, float:1.9414521E38)
            r1 = 35
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r0.<init>(r6, r1)
            r3.A01(r0, r2)
            r0 = 6
            com.facebook.redex.IDxCListenerShape23S0000000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape23S0000000_2_I1
            r1.<init>(r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            r3.A04 = r0
            r3.A07 = r1
            androidx.fragment.app.DialogFragment r0 = r3.A00()
            r6.Afc(r0)
            goto L_0x03b6
        L_0x041c:
            int r0 = r7.size()
            r1 = 2
            android.content.res.Resources r5 = r6.getResources()
            if (r0 != r1) goto L_0x043d
            r2 = 2131889923(0x7f120f03, float:1.9414523E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r7.get(r10)
            r1[r10] = r0
            java.lang.Object r0 = r7.get(r9)
            r1[r9] = r0
            java.lang.String r0 = r5.getString(r2, r1)
            goto L_0x03f3
        L_0x043d:
            r4 = 2131755261(0x7f1000fd, float:1.9141396E38)
            int r3 = r7.size()
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Object r0 = r7.get(r10)
            r2[r10] = r0
            java.lang.Object r0 = r7.get(r9)
            r2[r9] = r0
            java.lang.Object r0 = r7.get(r1)
            r2[r1] = r0
            int r0 = r7.size()
            r1 = 3
            int r0 = r0 - r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.String r0 = r5.getQuantityString(r4, r3, r2)
            goto L_0x03f3
        L_0x046a:
            java.lang.Object r4 = r1.A00
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3 = 0
            r6 = 0
            r5 = 0
            r2 = 0
        L_0x0472:
            int r0 = r4.getChildCount()
            if (r6 >= r0) goto L_0x0490
            android.view.View r1 = r4.getChildAt(r6)
            int r0 = r1.getWidth()
            int r5 = r5 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            int r2 = r2 + r1
            int r6 = r6 + 1
            goto L_0x0472
        L_0x0490:
            if (r5 <= 0) goto L_0x000e
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0O(r4)
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            int r0 = r4.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r4.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r4.getWidth()
            int r0 = r0 - r1
            int r0 = r0 - r2
            if (r5 < r0) goto L_0x04ae
            r3 = 1
        L_0x04ae:
            int r0 = r4.getOrientation()
            if (r0 == r3) goto L_0x000e
            r4.setOrientation(r3)
            return
        L_0x04b8:
            java.lang.Object r0 = r1.A00
            X.2io r0 = (X.C55082io) r0
            r0.A02()
            return
        L_0x04c0:
            java.lang.Object r5 = r1.A00
            X.0qL r5 = (X.C15110qL) r5
            X.0qF r5 = (X.C15050qF) r5
            X.2ip[] r4 = r5.A0L
            int r3 = r4.length
            r2 = 0
        L_0x04ca:
            if (r2 >= r3) goto L_0x04de
            r1 = r4[r2]
            r0 = 1
            r1.A04(r0)
            X.2iq r0 = r1.A0C
            if (r0 == 0) goto L_0x04db
            r0 = 0
            r1.A0C = r0
            r1.A08 = r0
        L_0x04db:
            int r2 = r2 + 1
            goto L_0x04ca
        L_0x04de:
            X.2ir r2 = r5.A0S
            X.2is r2 = (X.C55122is) r2
            X.2it r1 = r2.A00
            r0 = 0
            if (r1 == 0) goto L_0x04e9
            r2.A00 = r0
        L_0x04e9:
            r2.A01 = r0
            return
        L_0x04ec:
            java.lang.Object r0 = r1.A00
            com.google.android.gms.internal.gtm.zzbq r0 = (com.google.android.gms.internal.gtm.zzbq) r0
            com.google.android.gms.internal.gtm.zzck r0 = r0.zza
            r0.zzae()
            return
        L_0x04f6:
            java.lang.Object r0 = r1.A00
            com.facebook.redex.RunnableRunnableShape1S1300000_I1 r0 = (com.facebook.redex.RunnableRunnableShape1S1300000_I1) r0
            java.lang.Object r2 = r0.A00
            X.0q4 r2 = (X.C14960q4) r2
            java.lang.Object r1 = r0.A01
            X.0q1 r1 = (X.C14930q1) r1
            X.0q3 r0 = X.C14950q3.A01
            X.C14980q6.A00(r2, r0, r1)
            return
        L_0x0508:
            java.lang.Object r0 = r1.A00
            X.1DU r0 = (X.AnonymousClass1DU) r0
            r0.AIT()
            return
        L_0x0510:
            java.lang.Object r0 = r1.A00
            X.29B r0 = (X.AnonymousClass29B) r0
            r0.APW()
            return
        L_0x0518:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            byte[] r2 = X.AnonymousClass2FR.A06(r1)
            if (r2 == 0) goto L_0x055d
            int r0 = r2.length
            if (r0 == 0) goto L_0x055d
            java.lang.String r0 = "AccountTransferBroadcastReceiver/onReceive/exporting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2ix r6 = new X.2ix
            r6.<init>((android.content.Context) r1)
            java.lang.String r5 = "com.obwhatsapp"
            r4 = 1
            X.2iy r1 = new X.2iy
            r1.<init>(r5, r2)
            X.2iz r0 = new X.2iz
            r0.<init>(r1)
            X.0on r3 = r6.A01(r0, r4)
            r1 = 10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0548 }
            X.C14310ox.A00(r3, r0, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0548 }
            goto L_0x0560
        L_0x0548:
            r2 = move-exception
            r0 = 2
            X.2j3 r1 = new X.2j3
            r1.<init>(r5, r0)
            X.2j4 r0 = new X.2j4
            r0.<init>(r1)
            r6.A01(r0, r4)
            java.lang.String r0 = "AccountTransferBroadcastReceiver/exception during export"
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x055d:
            java.lang.String r0 = "AccountTransferReceiver/onReceive/encrypted backup token is not present"
            goto L_0x056f
        L_0x0560:
            X.2j3 r1 = new X.2j3
            r1.<init>(r5, r4)
            X.2j4 r0 = new X.2j4
            r0.<init>(r1)
            r6.A01(r0, r4)
            java.lang.String r0 = "AccountTransferBroadcastReceiver/onReceive/exported successfully"
        L_0x056f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0573:
            java.lang.Object r1 = r1.A00
            X.2x0 r1 = (X.C59292x0) r1
            r0 = 0
            r1.A06(r0)
            return
        L_0x057c:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.authentication.AppAuthenticationActivity r0 = (com.obwhatsapp.authentication.AppAuthenticationActivity) r0
            r0.A2n()
            return
        L_0x0584:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.authentication.FingerprintView r0 = (com.obwhatsapp.authentication.FingerprintView) r0
            r0.A02(r0.A05)
            return
        L_0x058c:
            java.lang.Object r0 = r1.A00
            X.13d r0 = (X.C211913d) r0
            r0.A04()
            return
        L_0x0594:
            java.lang.Object r1 = r1.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x05a1:
            java.lang.Object r0 = r1.A00
            com.facebook.redex.IDxSConnectionShape327S0100000_2_I0 r0 = (com.facebook.redex.IDxSConnectionShape327S0100000_2_I0) r0
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r2 = (com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r2
            X.12N r1 = r2.A0V
            X.12R r0 = r2.A0X
            r1.A02(r0)
            X.12O r1 = r2.A0S
            X.12S r2 = r2.A0R
            X.2GP r0 = r1.A00
            r0.A02(r2)
            X.0yo r1 = r1.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0Z
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x05cc
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0a
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x05cc
            return
        L_0x05cc:
            r2.ANG()
            return
        L_0x05d0:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = (com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r0
            r0.A07()
            return
        L_0x05d8:
            java.lang.Object r1 = r1.A00
            X.3Ew r1 = (X.C62773Ew) r1
            X.1KZ r0 = r1.A03
            X.1KY r0 = r0.A03
            r0.A03(r1)
            return
        L_0x05e4:
            java.lang.Object r1 = r1.A00
            X.2yc r1 = (X.C59632yc) r1
            r1.A02()
            X.0wz r0 = r1.A03
            X.4Rh r5 = r1.A02
            X.0pd r7 = r0.A05
            X.0ua r3 = r0.A00
            X.0rz r6 = r0.A04
            X.01D r9 = r0.A07
            X.01J r10 = r0.A08
            X.01J r11 = r0.A09
            X.0uc r4 = r0.A01
            X.168 r8 = r0.A06
            X.2ya r2 = new X.2ya
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2.Aah(r1)
            return
        L_0x0608:
            java.lang.Object r1 = r1.A00
            X.2yd r1 = (X.C59642yd) r1
            r1.A02()
            X.0wz r0 = r1.A01
            X.4O7 r5 = r1.A02
            X.0pd r7 = r0.A05
            X.0ua r3 = r0.A00
            X.0rz r6 = r0.A04
            X.01D r9 = r0.A07
            X.01J r10 = r0.A08
            X.01J r11 = r0.A0A
            X.0uc r4 = r0.A01
            X.168 r8 = r0.A06
            X.2yb r2 = new X.2yb
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2.Aah(r1)
            return
        L_0x062c:
            java.lang.Object r0 = r1.A00
            X.00l r0 = (X.C001000l) r0
            r0.A0c()
            return
        L_0x0634:
            java.lang.Object r0 = r1.A00
            X.2Qx r0 = (X.AnonymousClass2Qx) r0
            r0.A03()
            return
        L_0x063c:
            java.lang.Object r3 = r1.A00
            X.1aI r3 = (X.C29251aI) r3
            X.1aJ r0 = r3.A0D
            java.util.Set r0 = r0.A07
            int r0 = r0.size()
            boolean r2 = X.AnonymousClass000.A1Q(r0)
            X.2Qt r1 = r3.A0C
            X.2VC r0 = new X.2VC
            r0.<init>(r3)
            r1.Age(r0, r2)
            return
        L_0x0657:
            java.lang.Object r2 = r1.A00
            X.1aI r2 = (X.C29251aI) r2
            android.view.View r0 = r2.A08
            r1 = 4
            r0.setVisibility(r1)
            android.view.View r0 = r2.A06
            r0.setVisibility(r1)
            X.2V9 r0 = r2.A0H
            r0.A01(r1)
            android.view.View r1 = r2.A07
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0672:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r0 = (com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r0
            r0.A1F()
            return
        L_0x067a:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r0
            r0.A3U()
            return
        L_0x0682:
            java.lang.Object r8 = r1.A00
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r8 = (com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0) r8
            java.lang.Object r7 = r8.A00
            com.obwhatsapp.community.AddGroupsToCommunityActivity r7 = (com.obwhatsapp.community.AddGroupsToCommunityActivity) r7
            X.0sK r0 = r7.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r0 != 0) goto L_0x06a0
            r10 = 0
        L_0x0694:
            X.0pt r2 = r7.A05
            r1 = 3
            com.facebook.redex.RunnableRunnableShape1S0110000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0110000_I1
            r0.<init>(r8, r1, r10)
            r2.A0K(r0)
            return
        L_0x06a0:
            X.0sO r1 = r7.A0I
            X.0sK r0 = r7.A01
            r0.A0B()
            X.1ZT r11 = r0.A05
            X.0us r9 = r1.A07
            X.0tq r0 = r9.A09
            X.0tf r6 = r0.get()
            X.0tg r5 = r6.A02     // Catch:{ all -> 0x06ea }
            java.lang.String r4 = "SELECT * FROM group_participant_user WHERE (rank = ? OR rank = ?) AND user_jid_row_id = ? LIMIT 1"
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x06ea }
            r10 = 1
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x06ea }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x06ea }
            r2 = 2
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x06ea }
            r3[r10] = r0     // Catch:{ all -> 0x06ea }
            long r0 = r9.A02(r11)     // Catch:{ all -> 0x06ea }
            X.C13700nu.A0e(r3, r2, r0)     // Catch:{ all -> 0x06ea }
            android.database.Cursor r1 = r5.A08(r4, r3)     // Catch:{ all -> 0x06ea }
            if (r1 == 0) goto L_0x06db
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x06e5 }
            if (r0 == 0) goto L_0x06db
            goto L_0x06de
        L_0x06db:
            r10 = 0
            if (r1 == 0) goto L_0x06e1
        L_0x06de:
            r1.close()     // Catch:{ all -> 0x06ea }
        L_0x06e1:
            r6.close()
            goto L_0x0694
        L_0x06e5:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x06e9 }
        L_0x06e9:
            throw r0     // Catch:{ all -> 0x06ea }
        L_0x06ea:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x06ee }
        L_0x06ee:
            throw r0
        L_0x06ef:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.group.IDxGObserverShape83S0100000_2_I0 r0 = (com.obwhatsapp.group.IDxGObserverShape83S0100000_2_I0) r0
            java.lang.Object r1 = r0.A00
            goto L_0x06fc
        L_0x06f6:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0) r0
            java.lang.Object r1 = r0.A00
        L_0x06fc:
            com.obwhatsapp.community.CommunityTabViewModel r1 = (com.obwhatsapp.community.CommunityTabViewModel) r1
            r0 = 1
            r1.A07(r0)
            return
        L_0x0703:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.community.LinkExistingGroups r4 = (com.obwhatsapp.community.LinkExistingGroups) r4
            android.content.Intent r2 = X.C13680ns.A09()
            X.0sL r3 = r4.A05
            if (r3 != 0) goto L_0x071a
            r1 = 1
            java.lang.String r0 = "should_open_new_group"
            r2.putExtra(r0, r1)
            X.C13680ns.A0r(r4, r2)
            return
        L_0x071a:
            r1 = 3
            r0 = 0
            android.content.Intent r2 = X.C14750ph.A0m(r4, r0, r1)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid_to_link"
            r2.putExtra(r0, r1)
            r4.finish()
            r4.startActivity(r2)
            return
        L_0x0730:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0 r0 = (com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0) r0
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = (com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel) r2
            r0 = 0
            r2.A03 = r0
            X.027 r1 = r2.A05
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0B(r0)
            X.1cy r1 = r2.A0T
            r0 = 0
            r1.A0B(r0)
            return
        L_0x0749:
            java.lang.Object r1 = r1.A00
            X.4He r1 = (X.C83564He) r1
            X.2dg r3 = r1.A01
            int r0 = r3.A01
            com.obwhatsapp.companiondevice.sync.HistorySyncCompanionWorker r2 = r1.A00
            X.11U r1 = r2.A01
            if (r0 != 0) goto L_0x0766
            r0 = 0
            r1.A02(r3, r0)
            X.1bV r1 = r2.A00
            X.0Gc r0 = new X.0Gc
            r0.<init>()
        L_0x0762:
            r1.A04(r0)
            return
        L_0x0766:
            r0 = 1
            r1.A02(r3, r0)
            X.1bV r1 = r2.A00
            X.02P r0 = new X.02P
            r0.<init>()
            goto L_0x0762
        L_0x0772:
            java.lang.Object r0 = r1.A00
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            return
        L_0x077a:
            java.lang.Object r1 = r1.A00
            X.00k r1 = (X.C000900k) r1
            r0 = 2131365901(0x7f0a100d, float:1.835168E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x078d:
            r0 = move-exception
            if (r13 == 0) goto L_0x0793
            r13.close()     // Catch:{ all -> 0x0793 }
        L_0x0793:
            throw r0     // Catch:{ all -> 0x07a3 }
        L_0x0794:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0798 }
        L_0x0798:
            throw r0     // Catch:{ all -> 0x0799 }
        L_0x0799:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x079d }
        L_0x079d:
            throw r0     // Catch:{ all -> 0x079e }
        L_0x079e:
            r0 = move-exception
            X.C18920xT.A00(r7)     // Catch:{ all -> 0x07b6 }
            throw r0     // Catch:{ all -> 0x07b6 }
        L_0x07a3:
            r0 = move-exception
            if (r4 == 0) goto L_0x07a9
            r4.close()     // Catch:{ all -> 0x07a9 }
        L_0x07a9:
            throw r0     // Catch:{ all -> 0x07aa }
        L_0x07aa:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x07ae }
        L_0x07ae:
            throw r0     // Catch:{ all -> 0x07b6 }
        L_0x07af:
            r0 = move-exception
            if (r8 == 0) goto L_0x07bc
            r8.unlock()
            throw r0
        L_0x07b6:
            r0 = move-exception
            if (r22 == 0) goto L_0x07bc
            r22.unlock()
        L_0x07bc:
            throw r0
        L_0x07bd:
            r1.abort()     // Catch:{ IllegalStateException -> 0x07c1 }
            goto L_0x07c8
        L_0x07c1:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupApi/upload-file"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x07c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape17S0100000_I1.run():void");
    }
}
