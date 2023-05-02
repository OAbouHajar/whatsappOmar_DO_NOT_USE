package com.facebook.redex;

public class RunnableRunnableShape8S0200000_I0_6 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape8S0200000_I0_6(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0545, code lost:
        if (r4 <= r0) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0691, code lost:
        r3.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0694, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x075e, code lost:
        r2.A09(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0761, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07c5, code lost:
        r1.A08(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07c8, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:318:0x07a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:439:0x0ac2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x03e4 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r5 = r26
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x00d4;
                case 2: goto L_0x0106;
                case 3: goto L_0x0139;
                case 4: goto L_0x0172;
                case 5: goto L_0x0695;
                case 6: goto L_0x01a1;
                case 7: goto L_0x06ad;
                case 8: goto L_0x01bc;
                case 9: goto L_0x06d1;
                case 10: goto L_0x06e0;
                case 11: goto L_0x06ec;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x0705;
                case 19: goto L_0x0717;
                case 20: goto L_0x0725;
                case 21: goto L_0x0731;
                case 22: goto L_0x074c;
                case 23: goto L_0x0762;
                case 24: goto L_0x01d4;
                case 25: goto L_0x07b9;
                case 26: goto L_0x07c9;
                case 27: goto L_0x07da;
                case 28: goto L_0x07e6;
                case 29: goto L_0x080c;
                case 30: goto L_0x0823;
                case 31: goto L_0x082f;
                case 32: goto L_0x083d;
                case 33: goto L_0x026c;
                case 34: goto L_0x085b;
                case 35: goto L_0x08ad;
                case 36: goto L_0x08f6;
                case 37: goto L_0x02b2;
                case 38: goto L_0x0916;
                case 39: goto L_0x09a3;
                case 40: goto L_0x09b1;
                case 41: goto L_0x09c2;
                case 42: goto L_0x03d8;
                case 43: goto L_0x0522;
                case 44: goto L_0x0579;
                case 45: goto L_0x0015;
                case 46: goto L_0x0a44;
                case 47: goto L_0x0a44;
                case 48: goto L_0x059b;
                case 49: goto L_0x059b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A00
            X.0yQ r0 = (X.C19430yQ) r0
            java.lang.Object r1 = r5.A01
            X.0rv r1 = (X.C15830rv) r1
            X.11A r0 = r0.A0K
            r0.A06(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r4 = r5.A00
            X.1Gg r4 = (X.C24521Gg) r4
            java.lang.Object r6 = r5.A01
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r0 = "completion callback for onGetPreKeySuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1HD r5 = r4.A02
            monitor-enter(r5)
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x0a41 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0a41 }
        L_0x002d:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0a41 }
            if (r0 == 0) goto L_0x0090
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x0a41 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0a41 }
            java.lang.Object r2 = r3.getKey()     // Catch:{ all -> 0x0a41 }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x0a41 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a41 }
            r1.<init>()     // Catch:{ all -> 0x0a41 }
            java.lang.String r0 = "prekeysmanager/onGetPreKeySuccess:"
            r1.append(r0)     // Catch:{ all -> 0x0a41 }
            r1.append(r2)     // Catch:{ all -> 0x0a41 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a41 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a41 }
            java.util.Map r0 = r5.A08     // Catch:{ all -> 0x0a41 }
            java.lang.Object r1 = r0.remove(r2)     // Catch:{ all -> 0x0a41 }
            X.2Fd r1 = (X.C46612Fd) r1     // Catch:{ all -> 0x0a41 }
            if (r1 == 0) goto L_0x002d
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0a41 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0a41 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0a41 }
            if (r0 == 0) goto L_0x002d
            int r0 = r1.A00     // Catch:{ all -> 0x0a41 }
            int r3 = r1.A02     // Catch:{ all -> 0x0a41 }
            int r2 = r1.A01     // Catch:{ all -> 0x0a41 }
            X.3rK r1 = new X.3rK     // Catch:{ all -> 0x0a41 }
            r1.<init>()     // Catch:{ all -> 0x0a41 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0a41 }
            r1.A02 = r0     // Catch:{ all -> 0x0a41 }
            if (r3 <= 0) goto L_0x0082
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0a41 }
            r1.A01 = r0     // Catch:{ all -> 0x0a41 }
        L_0x0082:
            if (r2 <= 0) goto L_0x008a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0a41 }
            r1.A00 = r0     // Catch:{ all -> 0x0a41 }
        L_0x008a:
            X.0t9 r0 = r5.A06     // Catch:{ all -> 0x0a41 }
            r0.A06(r1)     // Catch:{ all -> 0x0a41 }
            goto L_0x002d
        L_0x0090:
            r5.A00()     // Catch:{ all -> 0x0a41 }
            monitor-exit(r5)
            java.util.Set r0 = r6.keySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            X.0y7 r0 = r4.A03
            X.2Tb r1 = new X.2Tb
            r1.<init>(r2)
            X.1mi r0 = r0.A02
            r0.A01(r1)
            android.os.Handler r3 = r4.A01
            r0 = 44
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r1 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r1.<init>(r4, r0, r2)
            goto L_0x0691
        L_0x00b4:
            java.lang.Object r2 = r5.A00
            X.01X r2 = (X.AnonymousClass01X) r2
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x00c0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.A02(r0)
            goto L_0x00c0
        L_0x00d4:
            java.lang.Object r3 = r5.A00
            X.2OT r3 = (X.AnonymousClass2OT) r3
            java.lang.Object r1 = r5.A01
            X.0sH r1 = (X.C16010sH) r1
            X.0sL r0 = r3.A08
            if (r0 == 0) goto L_0x0014
            X.15l r0 = r3.A07
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x00f5
            X.0pt r2 = r3.A01
            r1 = 38
        L_0x00ec:
            com.facebook.redex.RunnableRunnableShape9S0100000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape9S0100000_I0_8
            r0.<init>(r3, r1)
            r2.A0K(r0)
            return
        L_0x00f5:
            X.0uk r0 = r3.A02
            X.0sL r1 = r3.A08
            X.28n r0 = r0.A03
            java.util.List r0 = r0.A00(r1)
            r3.A0B = r0
            X.0pt r2 = r3.A01
            r1 = 37
            goto L_0x00ec
        L_0x0106:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.identity.IdentityVerificationActivity r3 = (com.obwhatsapp.identity.IdentityVerificationActivity) r3
            java.lang.Object r0 = r5.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r2 = r0.getUserJid()
            X.0sH r1 = r3.A0K
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x0014
            android.widget.ProgressBar r1 = r3.A06
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r3.A0I = r0
            r0 = 0
            r3.A01 = r0
            r3.A00 = r0
            r3.A39()
            return
        L_0x0139:
            java.lang.Object r0 = r5.A00
            X.2Om r0 = (X.C48692Om) r0
            java.lang.Object r3 = r5.A01
            byte[] r3 = (byte[]) r3
            com.obwhatsapp.invites.ViewGroupInviteActivity r2 = r0.A00
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "ViewGroupInviteActivity/fetchGroupProfilePicture: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r3 != 0) goto L_0x016c
            java.lang.String r0 = "null"
        L_0x0154:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0014
            r1 = 0
            int r0 = r3.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r1, r0)
            X.2Op r0 = r2.A0J
            r0.A00(r1)
            return
        L_0x016c:
            int r0 = r3.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0154
        L_0x0172:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob r3 = (com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob) r3
            java.lang.Object r2 = r5.A01
            byte[] r2 = (byte[]) r2
            X.0xT r0 = r3.A03
            java.util.concurrent.locks.Lock r1 = r0.A01()
            if (r1 == 0) goto L_0x0185
            r1.lock()     // Catch:{ all -> 0x0a52 }
        L_0x0185:
            X.11s r0 = r3.A01     // Catch:{ all -> 0x0a52 }
            byte[] r0 = r0.A0h()     // Catch:{ all -> 0x0a52 }
            boolean r0 = java.security.MessageDigest.isEqual(r2, r0)     // Catch:{ all -> 0x0a52 }
            if (r0 != 0) goto L_0x019b
            X.11s r0 = r3.A01     // Catch:{ all -> 0x0a52 }
            r0.A0Q()     // Catch:{ all -> 0x0a52 }
            X.12z r0 = r3.A00     // Catch:{ all -> 0x0a52 }
            r0.A03()     // Catch:{ all -> 0x0a52 }
        L_0x019b:
            if (r1 == 0) goto L_0x0014
            r1.unlock()
            return
        L_0x01a1:
            java.lang.Object r0 = r5.A00
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = r5.A01
            X.0xc r3 = (X.C19010xc) r3
            java.lang.String r2 = "_has_set_default_values"
            r1 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 != 0) goto L_0x0014
            r3.A01()
            return
        L_0x01bc:
            java.lang.Object r3 = r5.A00
            X.0pe r3 = (X.C14720pe) r3
            java.lang.Object r2 = r5.A01
            X.0tq r2 = (X.C16900tq) r2
            r1 = 1350(0x546, float:1.892E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x0014
            X.0tf r7 = r2.A02()
            goto L_0x0a59
        L_0x01d4:
            java.lang.Object r4 = r5.A00
            X.1co r4 = (X.C30701co) r4
            java.lang.Object r6 = r5.A01
            X.1et r6 = (X.C31701et) r6
            X.14r r3 = r4.A0V
            X.1cs r9 = r4.A0c
            long r0 = r9.A02()
            double r7 = (double) r0
            X.1qT r2 = r4.A0a
            int r13 = r2.A05
            int r5 = r4.A06
            r0 = 11
            if (r5 == r0) goto L_0x0203
            switch(r5) {
                case 1: goto L_0x0214;
                case 2: goto L_0x0216;
                case 3: goto L_0x0218;
                case 4: goto L_0x021a;
                case 5: goto L_0x0203;
                case 6: goto L_0x0203;
                case 7: goto L_0x0203;
                default: goto L_0x01f2;
            }
        L_0x01f2:
            java.lang.String r1 = "MediaDownload/downloadOriginTypeToMediaOriginType/invalid downloadOriginType = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0203:
            r15 = 0
        L_0x0204:
            int r0 = r6.A01
            r10 = 0
            if (r0 != 0) goto L_0x020a
            r10 = 1
        L_0x020a:
            int r0 = r4.A0u
            r18 = 0
            if (r0 == 0) goto L_0x0212
            r18 = 1
        L_0x0212:
            monitor-enter(r3)
            goto L_0x021c
        L_0x0214:
            r15 = 1
            goto L_0x0204
        L_0x0216:
            r15 = 2
            goto L_0x0204
        L_0x0218:
            r15 = 3
            goto L_0x0204
        L_0x021a:
            r15 = 4
            goto L_0x0204
        L_0x021c:
            long r16 = r3.A01()     // Catch:{ all -> 0x0ab5 }
            int r14 = r3.A00()     // Catch:{ all -> 0x0ab5 }
            X.14q r11 = r3.A04     // Catch:{ all -> 0x0ab5 }
            r19 = r11
            r20 = r13
            r21 = r14
            r22 = r15
            r23 = r16
            r25 = r18
            X.25Q r12 = r19.A01(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0ab5 }
            long r5 = r12.A00     // Catch:{ all -> 0x0ab5 }
            double r0 = (double) r5     // Catch:{ all -> 0x0ab5 }
            double r0 = r0 + r7
            long r5 = (long) r0     // Catch:{ all -> 0x0ab5 }
            r12.A00 = r5     // Catch:{ all -> 0x0ab5 }
            if (r10 == 0) goto L_0x0246
            long r0 = r12.A02     // Catch:{ all -> 0x0ab5 }
            r5 = 1
            long r0 = r0 + r5
            r12.A02 = r0     // Catch:{ all -> 0x0ab5 }
        L_0x0246:
            r11.A02(r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0ab5 }
            monitor-exit(r3)
            X.0w1 r5 = r4.A0C
            X.1cu r0 = r4.A0Z
            java.io.File r10 = r0.A03()
            X.1et r0 = r9.A08
            if (r0 != 0) goto L_0x0269
            r0 = -1
        L_0x0257:
            int r1 = X.C42141xI.A01(r0)
            X.1XK r8 = r2.A09
            X.1XK r4 = X.AnonymousClass1XK.A0S
            if (r8 != r4) goto L_0x0014
            r0 = 1
            if (r1 == r0) goto L_0x0a73
            r0 = 15
            if (r1 == r0) goto L_0x0a73
            return
        L_0x0269:
            int r0 = r0.A01
            goto L_0x0257
        L_0x026c:
            java.lang.Object r0 = r5.A00
            X.29h r0 = (X.C455629h) r0
            java.lang.Object r7 = r5.A01
            java.util.AbstractMap r7 = (java.util.AbstractMap) r7
            X.1bp r6 = r0.A00
            r0 = 0
            r6.A00 = r0
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L_0x0282:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r1 = r5.next()
            java.util.Map r0 = X.AnonymousClass3B5.A01
            java.lang.Object r0 = r0.get(r1)
            X.4Kt r0 = (X.C84494Kt) r0
            int r3 = r0.A00
            r0 = 1
            int r3 = r3 - r0
            java.lang.Object r0 = r7.get(r1)
            if (r3 < 0) goto L_0x0282
            r2 = 0
            if (r0 == 0) goto L_0x02a2
            r2 = 1
        L_0x02a2:
            boolean[] r1 = r6.A02
            boolean r0 = r1[r3]
            if (r2 == r0) goto L_0x02a9
            r4 = 1
        L_0x02a9:
            r1[r3] = r2
            goto L_0x0282
        L_0x02ac:
            if (r4 == 0) goto L_0x0014
            r6.A01()
            return
        L_0x02b2:
            java.lang.Object r6 = r5.A00
            X.1Gw r6 = (X.C24681Gw) r6
            java.lang.Object r1 = r5.A01
            X.01V r1 = (X.AnonymousClass01V) r1
            X.3sK r4 = new X.3sK
            r4.<init>()
            X.00F r7 = r4.samplingRate
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x0014
            android.app.ActivityManager r2 = r1.A03()
            if (r2 == 0) goto L_0x0014
            r0 = 1
            int[] r1 = new int[r0]
            int r0 = android.os.Process.myPid()
            r5 = 0
            r1[r5] = r0
            android.os.Debug$MemoryInfo[] r3 = r2.getProcessMemoryInfo(r1)
            X.1Gs r2 = r6.A04
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A00 = r0
            if (r3 == 0) goto L_0x0014
            int r0 = r3.length
            if (r0 == 0) goto L_0x0014
            r2 = r3[r5]
            int r0 = r2.getTotalPss()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A05 = r0
            int r0 = r2.getTotalPrivateDirty()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A02 = r0
            int r0 = r2.dalvikPrivateDirty
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A00 = r0
            int r0 = r2.nativePrivateDirty
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A01 = r0
            int r0 = r2.getTotalSharedDirty()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A03 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            X.0vy r2 = r6.A02
            long r2 = r2.A00
            long r0 = r0 - r2
            double r2 = (double) r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r4.A04 = r0
            int r0 = java.lang.Thread.activeCount()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A06 = r0
            X.0t9 r1 = r6.A03
            int r0 = r7.A03
            r1.A07(r4, r0)
            java.lang.Long r8 = r4.A06
            long r3 = r8.longValue()
            r1 = 140(0x8c, double:6.9E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03b2
            X.0so r7 = r6.A00
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "too-many-threads"
            r7.AcB(r0, r1, r5)
            java.util.Map r1 = java.lang.Thread.getAllStackTraces()
            int r0 = r1.size()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0372:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.String r2 = r0.getName()
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L_0x03ae
            java.util.Set r0 = X.C818349x.A00
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0372
            java.lang.String r1 = "ThreadLeakDetector/detectAndReportThreadLeak detected:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "thread-leak"
            r7.AcB(r0, r2, r5)
            goto L_0x0372
        L_0x03ae:
            r4.add(r2)
            goto L_0x0372
        L_0x03b2:
            X.0sq r0 = r6.A05
            boolean r0 = r0 instanceof X.C23291Bk
            if (r0 == 0) goto L_0x0014
            X.1Uh r0 = X.C23291Bk.A05
            int r0 = r0.getLargestPoolSize()
            long r3 = (long) r0
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            X.0so r2 = r6.A00
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "too-many-threads-waworkers"
            r2.AcB(r0, r1, r5)
            return
        L_0x03d8:
            java.lang.Object r3 = r5.A00
            X.1Sq r3 = (X.C27661Sq) r3
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r11 = r0.iterator()
        L_0x03e4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r6 = r11.next()
            X.0rv r6 = (X.C15830rv) r6
            boolean r0 = r6 instanceof X.C16060sN
            if (r0 == 0) goto L_0x051f
            X.11J r0 = r3.A02
            java.util.concurrent.ConcurrentHashMap r0 = r0.A03
            java.lang.Object r2 = r0.get(r6)
            X.1cE r2 = (X.C30361cE) r2
        L_0x03fe:
            r4 = 0
            if (r2 == 0) goto L_0x0412
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0412
            X.18H r1 = r3.A01
            monitor-enter(r1)
            if (r6 == 0) goto L_0x040f
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0ab8 }
            r0.remove(r6)     // Catch:{ all -> 0x0ab8 }
        L_0x040f:
            monitor-exit(r1)
            r9 = 1
            goto L_0x0413
        L_0x0412:
            r9 = 0
        L_0x0413:
            X.18H r5 = r3.A01
            monitor-enter(r5)
            if (r6 == 0) goto L_0x043a
            java.util.Map r1 = r5.A00     // Catch:{ all -> 0x0abb }
            boolean r0 = r1.containsKey(r6)     // Catch:{ all -> 0x0abb }
            if (r0 == 0) goto L_0x0433
            monitor-exit(r5)
            java.lang.String r1 = "FetchPrekey/requestFetch prekeys already requested: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x03e4
        L_0x0433:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0abb }
            r1.put(r6, r0)     // Catch:{ all -> 0x0abb }
        L_0x043a:
            monitor-exit(r5)
            if (r2 == 0) goto L_0x043f
            r2.A09 = r4
        L_0x043f:
            boolean r10 = X.C16030sJ.A0Q(r6)
            if (r10 == 0) goto L_0x045e
            X.16u r2 = r3.A04
            X.0tq r0 = r2.A07
            X.0tf r7 = r0.A02()
            X.1cj r1 = r7.A00()     // Catch:{ all -> 0x0ac3 }
            r0 = 0
            r2.A00(r0, r4)     // Catch:{ all -> 0x0abe }
            r1.A00()     // Catch:{ all -> 0x0abe }
            r1.close()     // Catch:{ all -> 0x0ac3 }
            r7.close()
        L_0x045e:
            X.16y r8 = r3.A03
            if (r9 == 0) goto L_0x04ac
            r9 = r6
            X.0sN r9 = (X.C16060sN) r9
            X.0sO r0 = r8.A04
            X.0us r7 = r0.A07
            X.1cE r1 = r7.A04(r9)
            X.0sK r2 = r8.A01
            r0 = 1
            java.util.Set r1 = r1.A0F(r2, r0)
            X.1cE r0 = r7.A04(r9)
            java.util.Set r0 = r0.A0F(r2, r4)
            r1.addAll(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04de
            java.util.List r0 = X.C221816y.A00(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0492:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04e2
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.11s r0 = r8.A02
            java.util.Set r0 = r0.A0N(r1)
            java.util.List r0 = X.C28851Ya.A04(r0)
            r7.addAll(r0)
            goto L_0x0492
        L_0x04ac:
            r0 = 0
            java.util.Set r1 = r8.A01(r6, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x04de
            java.util.List r0 = X.C221816y.A00(r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x04c4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04e2
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.11s r0 = r8.A02
            java.util.Set r0 = r0.A0N(r1)
            java.util.List r0 = X.C28851Ya.A04(r0)
            r7.addAll(r0)
            goto L_0x04c4
        L_0x04de:
            java.util.Set r7 = java.util.Collections.emptySet()
        L_0x04e2:
            java.lang.String r1 = "FetchPrekey/requestFetch missing sessions: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x03e4
            int r0 = r7.size()
            monitor-enter(r5)
            if (r6 == 0) goto L_0x0509
            java.util.Map r1 = r5.A00     // Catch:{ all -> 0x0ac8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0ac8 }
            r1.put(r6, r0)     // Catch:{ all -> 0x0ac8 }
        L_0x0509:
            monitor-exit(r5)
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r4]
            java.lang.Object[] r2 = r7.toArray(r0)
            com.whatsapp.jid.DeviceJid[] r2 = (com.whatsapp.jid.DeviceJid[]) r2
            r1 = 10
            if (r10 == 0) goto L_0x0518
            r1 = 13
        L_0x0518:
            X.1HD r0 = r3.A00
            r0.A04(r2, r1, r4)
            goto L_0x03e4
        L_0x051f:
            r2 = 0
            goto L_0x03fe
        L_0x0522:
            java.lang.Object r8 = r5.A00
            X.0xk r8 = (X.C19090xk) r8
            java.lang.Object r1 = r5.A01
            java.lang.Number r1 = (java.lang.Number) r1
            X.0t3 r0 = r8.A0S
            long r10 = r0.A00()
            r9 = 1
            if (r1 == 0) goto L_0x0547
            int r4 = r1.intValue()
            X.0xi r3 = r8.A0W
            monitor-enter(r3)
            android.content.SharedPreferences r2 = r3.A01     // Catch:{ all -> 0x0acb }
            java.lang.String r1 = "ab_props:sys:last_version"
            r0 = 0
            int r0 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0acb }
            monitor-exit(r3)
            r7 = 1
            if (r4 > r0) goto L_0x0548
        L_0x0547:
            r7 = 0
        L_0x0548:
            X.0xi r6 = r8.A0W
            long r4 = r6.A00()
            monitor-enter(r6)
            android.content.SharedPreferences r3 = r6.A01     // Catch:{ all -> 0x0ace }
            java.lang.String r2 = "ab_props:sys:refresh"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r3.getLong(r2, r0)     // Catch:{ all -> 0x0ace }
            monitor-exit(r6)
            long r4 = r4 + r0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0569
            long r1 = r6.A00()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0569
            r9 = 0
        L_0x0569:
            if (r7 != 0) goto L_0x056d
            if (r9 == 0) goto L_0x0014
        L_0x056d:
            X.01J r0 = r8.A0x
            java.lang.Object r0 = r0.get()
            X.1Tt r0 = (X.C27951Tt) r0
            r0.A00(r7)
            return
        L_0x0579:
            java.lang.Object r0 = r5.A00
            X.1Gg r0 = (X.C24521Gg) r0
            java.lang.Object r2 = r5.A01
            java.util.List r2 = (java.util.List) r2
            X.1SL r0 = r0.A04
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x058b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.27N r0 = (X.AnonymousClass27N) r0
            r0.AN7(r2)
            goto L_0x058b
        L_0x059b:
            java.lang.Object r0 = r5.A00
            X.1SV r0 = (X.AnonymousClass1SV) r0
            java.lang.Object r4 = r5.A01
            java.util.List r4 = (java.util.List) r4
            X.1Gg r2 = r0.A06
            java.lang.String r0 = "RecvPreKeyMessageListener/processPrekeysAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r7 = r4.iterator()
        L_0x05b8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0631
            java.lang.Object r0 = r7.next()
            X.2dZ r0 = (X.C52312dZ) r0
            com.whatsapp.jid.DeviceJid r11 = r0.A01
            byte[] r14 = r0.A05
            byte[] r15 = r0.A06
            byte[] r6 = r0.A04
            byte r4 = r0.A00
            X.1dG r12 = r0.A02
            X.1dG r13 = r0.A03
            if (r12 != 0) goto L_0x05d7
            r3.add(r11)
        L_0x05d7:
            java.lang.String r5 = "prekey request successful; initiating signal protocol session; jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte r0 = r11.device
            if (r0 == 0) goto L_0x0609
            X.137 r0 = r2.A08
            r21 = 4
            r16 = r0
            r17 = r11
            r18 = r6
            r19 = r14
            r20 = r4
            boolean r0 = r16.A0C(r17, r18, r19, r20, r21)
            if (r0 != 0) goto L_0x0609
            java.lang.String r0 = "recvprekeymessagelistener/onGetPreKeySuccess adv verification fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.A00(r11)
            goto L_0x05b8
        L_0x0609:
            X.1Yb r9 = X.C28851Ya.A02(r11)
            X.11s r10 = r2.A05
            X.5CX r8 = new X.5CX
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            monitor-enter(r2)
            X.1Xx r6 = r2.A00     // Catch:{ all -> 0x0ad1 }
            if (r6 != 0) goto L_0x0629
            X.0sq r5 = r2.A09     // Catch:{ all -> 0x0ad1 }
            int r4 = X.AnonymousClass1U8.A00()     // Catch:{ all -> 0x0ad1 }
            r0 = 1
            X.1Xx r6 = new X.1Xx     // Catch:{ all -> 0x0ad1 }
            r6.<init>(r5, r4, r0)     // Catch:{ all -> 0x0ad1 }
            r2.A00 = r6     // Catch:{ all -> 0x0ad1 }
        L_0x0629:
            monitor-exit(r2)
            r6.execute(r8)
            r1.add(r8)
            goto L_0x05b8
        L_0x0631:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Iterator r7 = r1.iterator()
        L_0x063a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0682
            java.lang.Object r0 = r7.next()
            X.5CX r0 = (X.AnonymousClass5CX) r0
            com.whatsapp.jid.DeviceJid r6 = r0.A00
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            int r4 = r0.intValue()     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            if (r4 != 0) goto L_0x0660
            boolean r0 = r3.contains(r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            r5.put(r6, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            goto L_0x063a
        L_0x0660:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            r1.<init>()     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            java.lang.String r0 = "Error received from SignalCoordinator; status="
            r1.append(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            r1.append(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            java.lang.String r0 = r1.toString()     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            r2.A00(r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0678 }
            goto L_0x063a
        L_0x0678:
            r1 = move-exception
            java.lang.String r0 = "Error received from SignalCoordinator"
            com.whatsapp.util.Log.e(r0, r1)
            r2.A00(r6)
            goto L_0x063a
        L_0x0682:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0014
            android.os.Handler r3 = r2.A01
            r0 = 45
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r1 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r1.<init>(r2, r0, r5)
        L_0x0691:
            r3.post(r1)
            return
        L_0x0695:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.jobqueue.job.SendE2EMessageJob r0 = (com.obwhatsapp.jobqueue.job.SendE2EMessageJob) r0
            java.lang.Object r1 = r5.A01
            X.0rv r1 = (X.C15830rv) r1
            X.0tZ r2 = r0.A0c
            if (r2 == 0) goto L_0x06a7
            X.0xq r1 = r0.A0I
            r0 = 30
            goto L_0x07c5
        L_0x06a7:
            X.0xq r0 = r0.A0I
            r0.A04(r1)
            return
        L_0x06ad:
            java.lang.Object r0 = r5.A00
            X.01V r0 = (X.AnonymousClass01V) r0
            java.lang.Object r3 = r5.A01
            X.0yi r3 = (X.C19610yi) r3
            android.telephony.TelephonyManager r2 = r0.A0N()
            if (r2 != 0) goto L_0x06c1
            java.lang.String r0 = "appinit/async tm=null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x06c1:
            java.lang.String r0 = "appinit/async set listener for call state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Os r1 = new X.2Os
            r1.<init>(r3)
            r0 = 32
            r2.listen(r1, r0)
            return
        L_0x06d1:
            java.lang.Object r1 = r5.A00
            X.2jx r1 = (X.C55562jx) r1
            java.lang.Object r0 = r5.A01
            X.074 r0 = (X.AnonymousClass074) r0
            r0.A06()
            r0 = 0
            r1.A02 = r0
            return
        L_0x06e0:
            java.lang.Object r1 = r5.A00
            X.29S r1 = (X.AnonymousClass29S) r1
            java.lang.Object r0 = r5.A01
            com.obwhatsapp.location.PlaceInfo r0 = (com.obwhatsapp.location.PlaceInfo) r0
            r1.A0P(r0)
            return
        L_0x06ec:
            java.lang.Object r0 = r5.A00
            X.0yQ r0 = (X.C19430yQ) r0
            java.lang.Object r3 = r5.A01
            X.1Yb r3 = (X.C28861Yb) r3
            X.11s r2 = r0.A0I
            X.1l7 r0 = X.C34941l7.A00
            java.lang.String r1 = r0.getRawString()
            X.1dH r0 = new X.1dH
            r0.<init>(r3, r1)
            r2.A0Y(r0)
            return
        L_0x0705:
            java.lang.Object r1 = r5.A00
            X.0yQ r1 = (X.C19430yQ) r1
            java.lang.Object r0 = r5.A01
            X.0tZ r0 = (X.C16740tZ) r0
            X.11A r1 = r1.A0K
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            r1.A06(r0)
            return
        L_0x0717:
            java.lang.Object r0 = r5.A00
            X.0wL r0 = (X.C18220wL) r0
            java.lang.Object r1 = r5.A01
            X.1f1 r1 = (X.C31781f1) r1
            X.1OJ r0 = r0.A09
            r0.A04(r1)
            return
        L_0x0725:
            java.lang.Object r1 = r5.A00
            X.0wL r1 = (X.C18220wL) r1
            java.lang.Object r0 = r5.A01
            X.1XP r0 = (X.AnonymousClass1XP) r0
            r1.A07(r0)
            return
        L_0x0731:
            java.lang.Object r6 = r5.A00
            X.1HE r6 = (X.AnonymousClass1HE) r6
            java.lang.Object r4 = r5.A01
            X.1zg r4 = (X.C43241zg) r4
            X.1Sv r3 = r6.A0E
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1 = 4
            com.facebook.redex.IDxMModifierShape235S0100000_2_I1 r0 = new com.facebook.redex.IDxMModifierShape235S0100000_2_I1
            r0.<init>(r3, r1)
            X.C27711Sv.A00(r4, r0, r2)
            X.0xq r2 = r6.A07
            java.util.concurrent.CopyOnWriteArrayList r1 = r4.A01
            r0 = -1
            goto L_0x075e
        L_0x074c:
            java.lang.Object r1 = r5.A00
            X.1HE r1 = (X.AnonymousClass1HE) r1
            java.lang.Object r0 = r5.A01
            X.1zg r0 = (X.C43241zg) r0
            X.0xq r2 = r1.A07
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A01
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            r0 = 12
        L_0x075e:
            r2.A09(r1, r0)
            return
        L_0x0762:
            java.lang.Object r6 = r5.A00
            X.1OJ r6 = (X.AnonymousClass1OJ) r6
            java.lang.Object r5 = r5.A01
            X.1f1 r5 = (X.C31781f1) r5
            monitor-enter(r6)
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x07b6 }
            X.03L r2 = r6.A00     // Catch:{ all -> 0x07b6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07b6 }
            r1.<init>()     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x07b6 }
            r1.append(r0)     // Catch:{ all -> 0x07b6 }
            int r0 = r5.A0B     // Catch:{ all -> 0x07b6 }
            r1.append(r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07b6 }
            r2.A06(r0, r5)     // Catch:{ all -> 0x07b6 }
            X.0t3 r4 = r6.A01     // Catch:{ all -> 0x07b6 }
            r4.A00()     // Catch:{ all -> 0x07b6 }
            X.0tc r0 = r6.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x07ab, Error | RuntimeException -> 0x07a9 }
            X.0tf r3 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x07ab, Error | RuntimeException -> 0x07a9 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x07a4 }
            java.lang.String r1 = "media_job"
            android.content.ContentValues r0 = r6.A00(r5)     // Catch:{ all -> 0x07a4 }
            r2.A02(r0, r1)     // Catch:{ all -> 0x07a4 }
            r4.A00()     // Catch:{ all -> 0x07a4 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x07ab, Error | RuntimeException -> 0x07a9 }
            monitor-exit(r6)
            return
        L_0x07a4:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x07a8 }
        L_0x07a8:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x07ab, Error | RuntimeException -> 0x07a9 }
        L_0x07a9:
            r1 = move-exception
            goto L_0x07b2
        L_0x07ab:
            r1 = move-exception
            java.lang.String r0 = "mediajobdb/insert"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07b6 }
            goto L_0x07b5
        L_0x07b2:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x07b6 }
        L_0x07b5:
            throw r1     // Catch:{ all -> 0x07b6 }
        L_0x07b6:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x07b9:
            java.lang.Object r0 = r5.A00
            X.1Ae r0 = (X.C23021Ae) r0
            java.lang.Object r2 = r5.A01
            X.0tZ r2 = (X.C16740tZ) r2
            X.0xq r1 = r0.A0D
            r0 = 12
        L_0x07c5:
            r1.A08(r2, r0)
            return
        L_0x07c9:
            java.lang.Object r2 = r5.A00
            X.1Ot r2 = (X.C26691Ot) r2
            java.lang.Object r1 = r5.A01
            X.0tY r1 = (X.C16730tY) r1
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            r2.A01(r1, r0)
            return
        L_0x07da:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.mediacomposer.MediaComposerActivity r1 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r1
            java.lang.Object r0 = r5.A01
            android.view.Window r0 = (android.view.Window) r0
            com.obwhatsapp.mediacomposer.MediaComposerActivity.A03(r0, r1)
            return
        L_0x07e6:
            java.lang.Object r4 = r5.A00
            X.1Mt r4 = (X.C26211Mt) r4
            java.lang.Object r0 = r5.A01
            X.2V1 r0 = (X.AnonymousClass2V1) r0
            X.4zZ r0 = (X.C102814zZ) r0
            X.1jm r3 = r0.A00
            java.lang.String r2 = r3.A0D
            X.AnonymousClass00B.A06(r2)
            java.lang.String r0 = r3.A09
            r1 = 1
            if (r0 == 0) goto L_0x0806
            int r0 = r3.A01
            if (r0 == r1) goto L_0x0806
            X.1CX r0 = r4.A01
            r0.A04(r3)
            return
        L_0x0806:
            X.01Z r0 = r4.A00
            r0.A02(r2)
            return
        L_0x080c:
            java.lang.Object r1 = r5.A00
            X.1Mt r1 = (X.C26211Mt) r1
            java.lang.Object r0 = r5.A01
            X.2V1 r0 = (X.AnonymousClass2V1) r0
            X.4zZ r0 = (X.C102814zZ) r0
            X.01Z r1 = r1.A00
            X.1jm r0 = r0.A00
            java.lang.String r0 = r0.A0D
            X.AnonymousClass00B.A06(r0)
            r1.A07(r0)
            return
        L_0x0823:
            java.lang.Object r1 = r5.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r5.A01
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r1.setLayoutParams(r0)
            return
        L_0x082f:
            java.lang.Object r0 = r5.A00
            X.2Ut r0 = (X.AnonymousClass2Ut) r0
            java.lang.Object r1 = r5.A01
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            android.view.View r0 = r0.A03
            r0.setLayoutParams(r1)
            return
        L_0x083d:
            java.lang.Object r4 = r5.A00
            X.2k1 r4 = (X.C55602k1) r4
            java.lang.Object r3 = r5.A01
            X.4zb r3 = (X.C102834zb) r3
            com.obwhatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A05
            android.text.Editable r2 = r0.getEditableText()
            com.obwhatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A05
            int r1 = r0.getWidth()
            com.obwhatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r4.A05
            android.text.TextPaint r0 = r0.getPaint()
            r3.A01(r0, r2, r1)
            return
        L_0x085b:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.mediaview.MediaViewFragment r3 = (com.obwhatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r5 = r5.A01
            X.10C r0 = r3.A0c
            r4 = 1
            r0.A00(r4, r4)
            X.10C r0 = r3.A0c
            X.1dR r0 = r0.A00
            java.lang.String r2 = "update_star_message_store"
            r0.A08(r2)
            X.10G r1 = r3.A0u
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r1.A01(r0)
            X.10C r0 = r3.A0c
            X.1dR r0 = r0.A00
            r0.A07(r2)
            X.10C r0 = r3.A0c
            X.1dR r0 = r0.A00
            java.lang.String r2 = "sync"
            r0.A08(r2)
            X.0xU r1 = r3.A0R
            java.util.Set r0 = java.util.Collections.singleton(r5)
            java.util.Set r1 = r1.A0J(r0, r4)
            X.0xU r0 = r3.A0R
            r0.A0V(r1)
            X.10C r0 = r3.A0c
            X.1dR r0 = r0.A00
            r0.A07(r2)
            X.0pt r2 = r3.A0I
            r1 = 3
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0K(r0)
            return
        L_0x08ad:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.mediaview.MediaViewFragment r4 = (com.obwhatsapp.mediaview.MediaViewFragment) r4
            java.lang.Object r2 = r5.A01
            X.0xU r1 = r4.A0R
            java.util.Set r0 = java.util.Collections.singleton(r2)
            r6 = 0
            java.util.Set r5 = r1.A0J(r0, r6)
            X.10G r1 = r4.A0u
            java.util.Set r0 = java.util.Collections.singleton(r2)
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x08f0
            X.0pt r3 = r4.A0I
            X.00l r0 = r4.A0C()
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131755383(0x7f100177, float:1.9141644E38)
            r0 = 1
            java.lang.String r0 = r2.getQuantityString(r1, r0)
            r3.A0I(r0, r6)
            X.0xU r0 = r4.A0R
            r0.A0U(r5)
        L_0x08e4:
            X.0pt r2 = r4.A0I
            r1 = 2
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.A0K(r0)
            return
        L_0x08f0:
            X.0xU r0 = r4.A0R
            r0.A0V(r5)
            goto L_0x08e4
        L_0x08f6:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.mediaview.MediaViewFragment r1 = (com.obwhatsapp.mediaview.MediaViewFragment) r1
            java.lang.Object r4 = r5.A01
            X.0tZ r4 = (X.C16740tZ) r4
            byte r0 = r4.A10
            r3 = 2
            r2 = 3
            if (r0 == r2) goto L_0x0905
            r2 = 2
        L_0x0905:
            X.14r r1 = r1.A18
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 != 0) goto L_0x0912
            r3 = 1
        L_0x0912:
            r1.A03(r2, r3)
            return
        L_0x0916:
            java.lang.Object r4 = r5.A00
            X.1HJ r4 = (X.AnonymousClass1HJ) r4
            java.lang.Object r1 = r5.A01
            X.1kO r1 = (X.C34511kO) r1
            java.lang.String r0 = "xmpp/client-ping/on-connected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r5 = r4.A09
            X.AnonymousClass00B.A02(r5)
            r4.A03()
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0944
            X.1kO r0 = r4.A03
            if (r1 != r0) goto L_0x093b
            java.lang.String r0 = "xmpp/client-ping/on-connected; already connected, ignoring."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x093b:
            java.lang.String r0 = "xmpp/client-ping/on-connected; new channel, forcing disconnect."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r4.A02()
        L_0x0944:
            r4.A03 = r1
            r2 = 0
            r4.A00 = r2
            r0 = 0
            r4.A0G = r0
            r4.A08 = r2
            r0 = 1
            r4.A06 = r0
            X.AnonymousClass00B.A02(r5)
            X.2CB r0 = r4.A01
            if (r0 == 0) goto L_0x098b
            java.lang.String r0 = "xmpp/client-ping/periodic/register-receiver; duplicate receiver registration."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x095f:
            r4.A06()
            X.AnonymousClass00B.A02(r5)
            X.2CA r0 = r4.A02
            if (r0 == 0) goto L_0x0973
            java.lang.String r0 = "xmpp/client-ping/timeout/register-receiver; duplicate receiver registration."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x096f:
            r4.A01()
            return
        L_0x0973:
            X.2CA r3 = new X.2CA
            r3.<init>(r4)
            r4.A02 = r3
            X.0tz r0 = r4.A0F
            android.content.Context r2 = r0.A00
            java.lang.String r0 = "com.obwhatsapp.alarm.CLIENT_PING_TIMEOUT"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass01S.A09
            r2.registerReceiver(r3, r1, r0, r5)
            goto L_0x096f
        L_0x098b:
            X.2CB r3 = new X.2CB
            r3.<init>(r4)
            r4.A01 = r3
            X.0tz r0 = r4.A0F
            android.content.Context r2 = r0.A00
            java.lang.String r0 = "com.obwhatsapp.alarm.CLIENT_PING_PERIODIC"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass01S.A09
            r2.registerReceiver(r3, r1, r0, r5)
            goto L_0x095f
        L_0x09a3:
            java.lang.Object r0 = r5.A00
            X.2eJ r0 = (X.C52702eJ) r0
            java.lang.Object r1 = r5.A01
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            X.17Y r0 = r0.A0e
            r0.A04(r1)
            return
        L_0x09b1:
            java.lang.Object r0 = r5.A00
            X.2eJ r0 = (X.C52702eJ) r0
            java.lang.Object r1 = r5.A01
            X.0rv r1 = (X.C15830rv) r1
            X.0sG r0 = r0.A09
            r0.A0A(r1)
            r0.A0J()
            return
        L_0x09c2:
            java.lang.Object r7 = r5.A00
            X.1Sr r7 = (X.C27671Sr) r7
            java.lang.Object r8 = r5.A01
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8
            com.whatsapp.jid.GroupJid r6 = com.whatsapp.jid.GroupJid.of(r8)
            X.AnonymousClass00B.A06(r6)
            X.0sO r0 = r7.A03
            X.0us r0 = r0.A07
            X.1cE r2 = r0.A04(r6)
            X.0sK r1 = r7.A00
            r0 = 0
            java.util.Set r0 = r2.A0F(r1, r0)
            java.util.Map r5 = r7.A07
            monitor-enter(r5)
            java.lang.String r4 = r2.A0A()     // Catch:{ all -> 0x0a3e }
            int r1 = r0.size()     // Catch:{ all -> 0x0a3e }
            X.0uz r0 = r2.A04()     // Catch:{ all -> 0x0a3e }
            int r0 = r0.size()     // Catch:{ all -> 0x0a3e }
            int r1 = r1 / r0
            int r3 = r1 * 100
            X.0pd r2 = r7.A04     // Catch:{ all -> 0x0a3e }
            r1 = 2860(0xb2c, float:4.008E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0a3e }
            int r0 = r2.A03(r0, r1)     // Catch:{ all -> 0x0a3e }
            if (r3 < r0) goto L_0x0a3c
            java.lang.Object r0 = r5.get(r6)     // Catch:{ all -> 0x0a3e }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0a3e }
            if (r0 != 0) goto L_0x0a3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a3e }
            r1.<init>()     // Catch:{ all -> 0x0a3e }
            java.lang.String r0 = "DistributeSenderKeyRequester/sending invisible message: "
            r1.append(r0)     // Catch:{ all -> 0x0a3e }
            r1.append(r8)     // Catch:{ all -> 0x0a3e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a3e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a3e }
            r5.put(r6, r4)     // Catch:{ all -> 0x0a3e }
            X.0t6 r4 = r7.A02     // Catch:{ all -> 0x0a3e }
            X.17g r1 = r7.A05     // Catch:{ all -> 0x0a3e }
            X.0t3 r0 = r7.A01     // Catch:{ all -> 0x0a3e }
            long r2 = r0.A00()     // Catch:{ all -> 0x0a3e }
            X.18b r1 = r1.A05     // Catch:{ all -> 0x0a3e }
            r0 = 1
            X.1Vw r1 = r1.A02(r6, r0)     // Catch:{ all -> 0x0a3e }
            X.1rx r0 = new X.1rx     // Catch:{ all -> 0x0a3e }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0a3e }
            r4.A0W(r0)     // Catch:{ all -> 0x0a3e }
        L_0x0a3c:
            monitor-exit(r5)     // Catch:{ all -> 0x0a3e }
            return
        L_0x0a3e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0a3e }
            throw r0
        L_0x0a41:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0a44:
            java.lang.Object r0 = r5.A00
            X.1SV r0 = (X.AnonymousClass1SV) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            X.1Gg r0 = r0.A06
            r0.A00(r1)
            return
        L_0x0a52:
            r0 = move-exception
            if (r1 == 0) goto L_0x0a58
            r1.unlock()
        L_0x0a58:
            throw r0
        L_0x0a59:
            java.lang.String r0 = "app-init/async/create-chat-sort-id-index"
            X.1Zf r2 = new X.1Zf     // Catch:{ all -> 0x0ac3 }
            r2.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0ac3 }
            X.0tg r1 = r7.A02     // Catch:{ all -> 0x0ac3 }
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS message_chat_sort_id_index ON message (chat_row_id, sort_id)"
            r1.A0B(r0)     // Catch:{ all -> 0x0ac3 }
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS message_starred_sort_id_index ON message (starred, sort_id)"
            r1.A0B(r0)     // Catch:{ all -> 0x0ac3 }
            r2.A01()     // Catch:{ all -> 0x0ac3 }
            r7.close()
            return
        L_0x0a73:
            X.3rc r3 = new X.3rc
            r3.<init>()
            long r6 = r2.A07
            double r0 = (double) r6
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r3.A03 = r0
            if (r8 != r4) goto L_0x0aaf
            if (r10 == 0) goto L_0x0aaf
            boolean r0 = r10.exists()
            if (r0 == 0) goto L_0x0aaf
            java.lang.String r0 = r10.getAbsolutePath()
            byte[] r0 = com.whatsapp.stickers.WebpUtils.fetchWebpMetadata(r0)
            X.1XO r1 = X.AnonymousClass1XO.A00(r0)
            if (r1 == 0) goto L_0x0aaf
            boolean r0 = r1.A07
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            boolean r0 = r1.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
        L_0x0aaf:
            X.0t9 r0 = r5.A0C
            r0.A06(r3)
            return
        L_0x0ab5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0ab8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0abb:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0abe:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0ac2 }
        L_0x0ac2:
            throw r0     // Catch:{ all -> 0x0ac3 }
        L_0x0ac3:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0ac7 }
        L_0x0ac7:
            throw r0
        L_0x0ac8:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0acb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0ace:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0ad1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape8S0200000_I0_6.run():void");
    }
}
