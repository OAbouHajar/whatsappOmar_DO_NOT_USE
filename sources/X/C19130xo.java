package X;

/* renamed from: X.0xo  reason: invalid class name and case insensitive filesystem */
public class C19130xo implements C19140xp {
    public final C15860rz A00;
    public final C19120xn A01;
    public final AnonymousClass01J A02;

    public C19130xo(C15860rz r1, C19120xn r2, AnonymousClass01J r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        if (r0 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if ((r11 - r3.A05.A05[r3.A02].A04) > r9) goto L_0x01d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0217  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AdM(X.C29171a9 r26, boolean r27) {
        /*
            r25 = this;
            r2 = r25
            X.0xn r0 = r2.A01
            X.0tK r0 = r0.A00
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "WamSender/send/mh-disconnected"
        L_0x000e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0011:
            return
        L_0x0012:
            r8 = r26
            int r0 = r8.A03
            r7 = 1
            if (r0 != r7) goto L_0x018d
            X.1aA r1 = r8.A04
            X.1aB r0 = r1.A7h()
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x002e
            boolean r0 = r1.A5v()
            if (r0 == 0) goto L_0x002e
            r8.A02()
        L_0x002e:
            X.1aA r0 = r8.A04
            r24 = r0
            boolean r0 = r24.AHV()
            if (r0 == 0) goto L_0x0011
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x003f
            r8.A01()
        L_0x003f:
            android.util.SparseArray r9 = r24.ABd()
            X.01J r0 = r2.A02
            java.lang.Object r6 = r0.get()
            X.1HZ r6 = (X.AnonymousClass1HZ) r6
            int r0 = r9.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            r4 = 0
        L_0x0055:
            int r0 = r9.size()
            if (r4 >= r0) goto L_0x0200
            java.util.Set r0 = r6.A01
            java.util.Iterator r10 = r0.iterator()
        L_0x0061:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r1 = r10.next()
            X.1HY r1 = (X.AnonymousClass1HY) r1
            X.0vQ r3 = r1.A00
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x008c
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.isGroupCall
            if (r0 == 0) goto L_0x008c
            X.0pd r2 = r1.A01
            r1 = 468(0x1d4, float:6.56E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x0061
            if (r1 != 0) goto L_0x0061
            r1 = 1
        L_0x0096:
            X.0xn r11 = r6.A00
            X.0tK r0 = r11.A00
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0200
            if (r1 != 0) goto L_0x0200
            int r3 = r9.keyAt(r4)
            java.lang.String r1 = "WamSender/sending/buffer:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r10 = r9.get(r3)
            byte[] r10 = (byte[]) r10
            X.0ug r0 = r11.A01
            r23 = r0
            java.lang.String r15 = r23.A02()
            long r12 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r0
            java.lang.String r12 = java.lang.Long.toString(r12)
            X.1lL[] r2 = new X.C35081lL[r7]
            java.lang.String r1 = "t"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)
            r13 = 0
            r2[r13] = r0
            java.lang.String r0 = "add"
            X.1Vv r12 = new X.1Vv
            r12.<init>((java.lang.String) r0, (byte[]) r10, (X.C35081lL[]) r2)
            r0 = 4
            X.1lL[] r1 = new X.C35081lL[r0]
            java.lang.String r2 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r15)
            r1[r13] = r0
            java.lang.String r13 = "xmlns"
            java.lang.String r2 = "w:stats"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r13, (java.lang.String) r2)
            r1[r7] = r0
            java.lang.String r2 = "type"
            java.lang.String r0 = "set"
            X.1lL r13 = new X.1lL
            r13.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r1[r0] = r13
            X.1ks r14 = X.C34791ks.A00
            java.lang.String r0 = "to"
            X.1lL r13 = new X.1lL
            r13.<init>((com.whatsapp.jid.Jid) r14, (java.lang.String) r0)
            r0 = 3
            r1[r0] = r13
            java.lang.String r0 = "iq"
            X.1Vv r14 = new X.1Vv
            r14.<init>((X.C28371Vv) r12, (java.lang.String) r0, (X.C35081lL[]) r1)
            r19 = 58
            r20 = 32000(0x7d00, double:1.581E-319)
            X.1kE r13 = new X.1kE
            r13.<init>()
            r12 = 4
            com.facebook.redex.IDxRCallbackShape49S0200000_2_I0 r1 = new com.facebook.redex.IDxRCallbackShape49S0200000_2_I0
            r0 = r23
            r1.<init>(r13, r12, r0)
            r22 = 1
            r16 = r1
            r17 = r14
            r18 = r15
            r15 = r0
            r15.A0C(r16, r17, r18, r19, r20, r22)
            java.lang.Object r1 = r13.get()     // Catch:{ InterruptedException | ExecutionException -> 0x01ea }
            X.1Vv r1 = (X.C28371Vv) r1     // Catch:{ InterruptedException | ExecutionException -> 0x01ea }
            r0 = 0
            java.lang.String r1 = r1.A0N(r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x01ea }
            java.lang.String r0 = "result"
            boolean r0 = r0.equals(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x01ea }
            if (r0 == 0) goto L_0x01ef
            if (r10 == 0) goto L_0x016e
            X.11O r11 = r11.A02
            int r12 = r10.length
            r10 = 32
            long r0 = (long) r12
            r13 = 0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x016e
            X.1Zn r1 = r11.A00
            if (r1 == 0) goto L_0x016e
            X.AnonymousClass00B.A0G(r7)
            r0 = 2
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r10, r12)
            r0.sendToTarget()
            r11.A00()
        L_0x016e:
            java.lang.String r1 = "WamSender/send/buffer:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.add(r0)
            int r4 = r4 + 1
            goto L_0x0055
        L_0x018a:
            r1 = 0
            goto L_0x0096
        L_0x018d:
            if (r0 != 0) goto L_0x002e
            X.1aA r3 = r8.A04
            boolean r0 = r3.AHV()
            if (r0 != 0) goto L_0x002e
            X.1aB r0 = r3.A7h()
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x002e
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r11 = r4.toSeconds(r0)
            X.0rz r5 = r2.A00
            X.01D r0 = r5.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r4 = "wam_is_current_buffer_real_time"
            r0 = 0
            boolean r0 = r1.getBoolean(r4, r0)
            if (r0 == 0) goto L_0x01e7
            r9 = 300(0x12c, double:1.48E-321)
        L_0x01c1:
            if (r27 != 0) goto L_0x01d6
            X.1aB r3 = r3.A7h()
            X.2I6 r0 = r3.A05
            X.2I7[] r1 = r0.A05
            int r0 = r3.A02
            r0 = r1[r0]
            long r0 = r0.A04
            long r11 = r11 - r0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
        L_0x01d6:
            r8.A02()
            r1 = 0
            android.content.SharedPreferences$Editor r0 = r5.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r4, r1)
            r0.apply()
            goto L_0x002e
        L_0x01e7:
            r9 = 600(0x258, double:2.964E-321)
            goto L_0x01c1
        L_0x01ea:
            java.lang.String r0 = "FieldStatsXmppImpl/error sending fieldstats IQ"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01ef:
            java.lang.String r1 = "WamSender/fail/buffer:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0200:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0217
            java.lang.String r0 = "WamSender/send: successfully sent data; dropping the buffer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r24
            r0.A8I(r5)
            r8.A01()
            java.lang.String r0 = "WamSender/sendack: dropped rotated buffer"
            goto L_0x000e
        L_0x0217:
            java.lang.String r0 = "WamSender/send: failed to send data"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19130xo.AdM(X.1a9, boolean):void");
    }

    public void AdN(C29171a9 r3, int i2, boolean z2, boolean z3) {
        throw new UnsupportedOperationException("fieldstatssender/send should not call send method with dithered info");
    }
}
