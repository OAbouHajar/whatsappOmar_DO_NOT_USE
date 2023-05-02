package com.facebook.redex;

public class RunnableRunnableShape2S0200000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape2S0200000_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:170:0x037a, code lost:
        if (r3 > 0) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06a1, code lost:
        if (r8 != null) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0935, code lost:
        r5.A02(r6, r7, r8, r9, r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0938, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0939, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x09c2, code lost:
        r1.A0A(java.lang.Integer.valueOf(r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x09c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r3 != -9223372036854775807L) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0a80  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r23 = this;
            r2 = r23
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x02f6;
                case 1: goto L_0x0302;
                case 2: goto L_0x0015;
                case 3: goto L_0x0168;
                case 4: goto L_0x0494;
                case 5: goto L_0x04fe;
                case 6: goto L_0x073f;
                case 7: goto L_0x074f;
                case 8: goto L_0x0a36;
                case 9: goto L_0x0a8a;
                case 10: goto L_0x0789;
                case 11: goto L_0x07bd;
                case 12: goto L_0x07c9;
                case 13: goto L_0x07d6;
                case 14: goto L_0x07d6;
                case 15: goto L_0x005e;
                case 16: goto L_0x07e2;
                case 17: goto L_0x07f2;
                case 18: goto L_0x0099;
                case 19: goto L_0x086a;
                case 20: goto L_0x00c0;
                case 21: goto L_0x00f2;
                case 22: goto L_0x0878;
                case 23: goto L_0x0886;
                case 24: goto L_0x089a;
                case 25: goto L_0x08cf;
                case 26: goto L_0x08e7;
                case 27: goto L_0x0901;
                case 28: goto L_0x093d;
                case 29: goto L_0x0982;
                case 30: goto L_0x099f;
                case 31: goto L_0x0206;
                case 32: goto L_0x09b7;
                case 33: goto L_0x09ab;
                case 34: goto L_0x09b7;
                case 35: goto L_0x0225;
                case 36: goto L_0x0007;
                case 37: goto L_0x0007;
                case 38: goto L_0x0007;
                case 39: goto L_0x09ca;
                case 40: goto L_0x09d8;
                case 41: goto L_0x024e;
                case 42: goto L_0x09ea;
                case 43: goto L_0x0a00;
                case 44: goto L_0x0279;
                case 45: goto L_0x029d;
                case 46: goto L_0x02ce;
                case 47: goto L_0x0a0a;
                case 48: goto L_0x0a22;
                case 49: goto L_0x0a2c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r1 = r2.A01
            X.0rv r1 = (X.C15830rv) r1
            X.11A r0 = r0.A0d
            r0.A06(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r7 = r2.A00
            X.0qF r7 = (X.C15050qF) r7
            java.lang.Object r10 = r2.A01
            X.1gD r10 = (X.C32371gD) r10
            X.1mO r0 = r7.A08
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x0056
            r2 = r10
        L_0x0027:
            r7.A07 = r2
            long r3 = r10.ABr()
            r7.A03 = r3
            long r8 = r7.A05
            r11 = -1
            r1 = 1
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            r7.A0C = r2
            if (r2 == 0) goto L_0x0043
            r1 = 7
        L_0x0043:
            r7.A00 = r1
            X.5Nn r1 = r7.A0T
            boolean r0 = r10.AJe()
            r1.AXL(r3, r0, r2)
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x0014
            r7.A03()
            return
        L_0x0056:
            r0 = 0
            X.1gC r2 = new X.1gC
            r2.<init>(r5, r0)
            goto L_0x0027
        L_0x005e:
            java.lang.Object r0 = r2.A00
            X.0yD r0 = (X.C19300yD) r0
            java.lang.Object r3 = r2.A01
            X.0tZ r3 = (X.C16740tZ) r3
            X.1HQ r2 = r0.A0k
            X.1Vw r0 = r3.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0014
            X.1Vt r0 = r3.A0L
            if (r0 == 0) goto L_0x0014
            com.whatsapp.jid.UserJid r1 = r0.A0D
            X.0sK r0 = r2.A00
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r1 != r0) goto L_0x0014
            X.0tZ r1 = r3.A0D()
            boolean r0 = r1 instanceof X.C38641rB
            if (r0 != 0) goto L_0x0086
            r1 = 0
        L_0x0086:
            X.1Nw r8 = r2.A01
            X.1Vt r0 = r3.A0L
            X.1lo r0 = r0.A01()
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0093
            r6 = 1
        L_0x0093:
            if (r1 != 0) goto L_0x0096
            r7 = 0
        L_0x0096:
            monitor-enter(r8)
            goto L_0x0ab1
        L_0x0099:
            java.lang.Object r0 = r2.A00
            X.0yD r0 = (X.C19300yD) r0
            java.lang.Object r4 = r2.A01
            X.1cb r4 = (X.C30571cb) r4
            X.17V r3 = r0.A0A
            X.0pd r2 = r3.A03
            r1 = 1530(0x5fa, float:2.144E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0014
            boolean r0 = X.C38621r6.A0Z(r2, r4)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05(r4, r0)
            return
        L_0x00c0:
            java.lang.Object r1 = r2.A00
            com.obwhatsapp.MuteDialogFragment r1 = (com.obwhatsapp.MuteDialogFragment) r1
            java.lang.Object r2 = r2.A01
            X.0rv r2 = (X.C15830rv) r2
            boolean r0 = X.C16030sJ.A0L(r2)
            if (r0 == 0) goto L_0x0014
            X.0sG r0 = r1.A05
            X.0sH r0 = r0.A0A(r2)
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L_0x0014
            X.127 r0 = r1.A04
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1ug r0 = (X.C40781ug) r0
            r0.A02(r2)
            goto L_0x00e2
        L_0x00f2:
            java.lang.Object r3 = r2.A00
            X.12z r3 = (X.C211512z) r3
            java.lang.Object r7 = r2.A01
            X.1dG[] r7 = (X.C30971dG[]) r7
            X.0xT r0 = r3.A0D
            java.util.concurrent.locks.Lock r6 = r0.A01()
            if (r6 == 0) goto L_0x0105
            r6.lock()     // Catch:{ all -> 0x0161 }
        L_0x0105:
            X.11s r5 = r3.A0B     // Catch:{ all -> 0x0161 }
            if (r7 == 0) goto L_0x013d
            int r4 = r7.length     // Catch:{ all -> 0x0161 }
            if (r4 == 0) goto L_0x013d
            int[] r2 = new int[r4]     // Catch:{ all -> 0x0161 }
            r1 = 0
        L_0x010f:
            r0 = r7[r1]     // Catch:{ all -> 0x0161 }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0161 }
            int r0 = X.C28641Wx.A01(r0)     // Catch:{ all -> 0x0161 }
            r2[r1] = r0     // Catch:{ all -> 0x0161 }
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x010f
            X.0xT r0 = r5.A0I     // Catch:{ all -> 0x0161 }
            java.util.concurrent.locks.Lock r1 = r0.A01()     // Catch:{ all -> 0x0161 }
            if (r1 != 0) goto L_0x012b
            X.16P r0 = r5.A0H     // Catch:{ all -> 0x0136 }
            r0.A00()     // Catch:{ all -> 0x0136 }
            goto L_0x012e
        L_0x012b:
            r1.lock()     // Catch:{ all -> 0x0136 }
        L_0x012e:
            X.1es r0 = r5.A09     // Catch:{ all -> 0x0136 }
            r0.A03(r2)     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x0147
            goto L_0x0144
        L_0x0136:
            r0 = move-exception
            if (r1 == 0) goto L_0x013c
            r1.unlock()     // Catch:{ all -> 0x0161 }
        L_0x013c:
            throw r0     // Catch:{ all -> 0x0161 }
        L_0x013d:
            java.lang.String r0 = "tried to mark an empty list of preKeys as sent to server"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0161 }
            goto L_0x0147
        L_0x0144:
            r1.unlock()     // Catch:{ all -> 0x0161 }
        L_0x0147:
            X.0rz r1 = r3.A0A     // Catch:{ all -> 0x0161 }
            boolean r0 = r1.A1k()     // Catch:{ all -> 0x0161 }
            if (r0 == 0) goto L_0x0156
            r0 = 0
            r1.A1T(r0)     // Catch:{ all -> 0x0161 }
            r1.A1S(r0)     // Catch:{ all -> 0x0161 }
        L_0x0156:
            r0 = 0
            r3.A05(r0)     // Catch:{ all -> 0x0161 }
            if (r6 == 0) goto L_0x0014
            r6.unlock()
            return
        L_0x0161:
            r1 = move-exception
            if (r6 == 0) goto L_0x01cb
            r6.unlock()
            throw r1
        L_0x0168:
            java.lang.Object r5 = r2.A00
            X.3BD r5 = (X.AnonymousClass3BD) r5
            X.4Jg r4 = r5.A07
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            java.lang.Class<com.google.android.gms.internal.gtm.zzbe> r0 = com.google.android.gms.internal.gtm.zzbe.class
            X.1gG r3 = r5.A01(r0)
            com.google.android.gms.internal.gtm.zzbe r3 = (com.google.android.gms.internal.gtm.zzbe) r3
            java.lang.String r0 = r3.zzb
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x018f
            com.google.android.gms.internal.gtm.zzbv r1 = r4.A01
            com.google.android.gms.internal.gtm.zzcn r0 = r1.zzm
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzcn r0 = r1.zzm
            java.lang.String r0 = r0.zzb()
            r3.zzb = r0
        L_0x018f:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = r3.zzd
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01b0
            com.google.android.gms.internal.gtm.zzbv r1 = r4.A01
            com.google.android.gms.internal.gtm.zzbi r0 = r1.zzn
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzbi r1 = r1.zzn
            java.lang.String r0 = r1.zza()
            r3.zzd = r0
            boolean r0 = r1.zzb()
            r3.zze = r0
        L_0x01b0:
            java.lang.Object r0 = r2.A01
            X.0qA r0 = (X.C15000qA) r0
            java.util.List r0 = r0.A04
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cc
            r1.next()
            java.lang.String r0 = "zza"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
        L_0x01cb:
            throw r1
        L_0x01cc:
            java.lang.String r0 = "deliver should be called from worker thread"
            X.C13710nw.A06(r0)
            boolean r1 = r5.A05
            java.lang.String r0 = "Measurement must be submitted"
            X.C13710nw.A03(r0, r1)
            java.util.List r1 = r5.A09
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0014
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x01e9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r3.next()
            X.5RD r2 = (X.AnonymousClass5RD) r2
            android.net.Uri r1 = r2.Aj2()
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x01e9
            r4.add(r1)
            r2.AjL(r5)
            goto L_0x01e9
        L_0x0206:
            java.lang.Object r3 = r2.A00
            X.0tb r3 = (X.C16760tb) r3
            java.lang.Object r0 = r2.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "starred"
            if (r0 == 0) goto L_0x0adb
            X.1Mm r0 = r3.A1L
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0014
            X.1Sp r0 = r3.A1V
            r0.A04(r1)
            return
        L_0x0225:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r1 = r2.A01
            X.1zg r1 = (X.C43241zg) r1
            X.01Z r4 = r0.A06     // Catch:{ IOException -> 0x0ae2 }
            X.0tY r0 = r1.A00()     // Catch:{ IOException -> 0x0ae2 }
            X.0ta r0 = r0.A02     // Catch:{ IOException -> 0x0ae2 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ IOException -> 0x0ae2 }
            java.io.File r3 = r0.A0F     // Catch:{ IOException -> 0x0ae2 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A01     // Catch:{ IOException -> 0x0ae2 }
            int r2 = r0.size()     // Catch:{ IOException -> 0x0ae2 }
            r1 = 0
            X.0sb r0 = r4.A00     // Catch:{ IOException -> 0x0ae2 }
            boolean r0 = r0.A0U(r3)     // Catch:{ IOException -> 0x0ae2 }
            if (r0 == 0) goto L_0x0014
            r4.A06(r3, r2, r1)     // Catch:{ IOException -> 0x0ae2 }
            goto L_0x0ae1
        L_0x024e:
            java.lang.Object r3 = r2.A00
            com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity r3 = (com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity) r3
            java.lang.Object r2 = r2.A01
            byte[] r2 = (byte[]) r2
            boolean r0 = r3.AIm()
            if (r0 != 0) goto L_0x0014
            java.lang.String r1 = "AcceptInviteLinkActivity/fetchGroupProfilePicture: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            int r1 = r2.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)
            X.2Op r0 = r3.A0H
            r0.A00(r1)
            return
        L_0x0279:
            java.lang.Object r1 = r2.A00
            X.2YL r1 = (X.AnonymousClass2YL) r1
            java.lang.Object r2 = r2.A01
            X.01A r2 = (X.AnonymousClass01A) r2
            boolean r0 = X.AnonymousClass29T.A03(r1)
            if (r0 != 0) goto L_0x0014
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x0014
            X.02C r0 = r1.AGM()
            X.050 r1 = new X.050
            r1.<init>(r0)
            java.lang.String r0 = "auth_request_dialog"
            r1.A0C(r2, r0)
            r1.A02()
            return
        L_0x029d:
            java.lang.Object r5 = r2.A00
            X.2YL r5 = (X.AnonymousClass2YL) r5
            java.lang.Object r4 = r2.A01
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            int r3 = X.C437421i.A00(r5)
            r0 = 3
            com.facebook.redex.IDxCListenerShape162S0100000_2_I1 r2 = new com.facebook.redex.IDxCListenerShape162S0100000_2_I1
            r2.<init>(r5, r0)
            r1 = 0
            r0 = 1
            android.app.Dialog r1 = X.AnonymousClass2GK.A02(r5, r2, r3, r1, r0)
            if (r1 == 0) goto L_0x0aea
            boolean r0 = X.AnonymousClass29T.A03(r5)
            if (r0 != 0) goto L_0x0014
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "settings-gdrive/gps-unavailable/prompting-user-to-fix"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A1D()
            r1.show()
            return
        L_0x02ce:
            java.lang.Object r5 = r2.A00
            X.00l r5 = (X.C001000l) r5
            java.lang.Object r0 = r2.A01
            X.1Zf r0 = (X.C28921Zf) r0
            long r3 = r0.A01()
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02e4
            long r1 = r1 - r3
            android.os.SystemClock.sleep(r1)
        L_0x02e4:
            X.02C r1 = r5.AGM()
            java.lang.String r0 = "auth_request_dialog"
            X.01A r0 = r1.A0B(r0)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            if (r0 == 0) goto L_0x0014
            r0.A1D()
            return
        L_0x02f6:
            java.lang.Object r1 = r2.A01
            X.3Ae r1 = (X.C61753Ae) r1
            java.lang.Object r0 = r2.A00
            X.0rq r0 = (X.C15780rq) r0
            r1.A02(r0)
            return
        L_0x0302:
            java.lang.Object r0 = r2.A01
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getValue()
            X.0qe r7 = (X.C15300qe) r7
            monitor-enter(r7)
            java.lang.Object r6 = r2.A00     // Catch:{ all -> 0x0491 }
            X.0qX r6 = (X.C15230qX) r6     // Catch:{ all -> 0x0491 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x0491 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0491 }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x0491 }
            java.lang.String r0 = "stash"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x035f
            boolean r0 = r7 instanceof X.AnonymousClass3UA     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x035d
            r0 = r7
            X.3UA r0 = (X.AnonymousClass3UA) r0     // Catch:{ all -> 0x0491 }
            java.lang.ref.WeakReference r0 = r0.A00     // Catch:{ all -> 0x0491 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0491 }
            X.5TA r1 = (X.AnonymousClass5TA) r1     // Catch:{ all -> 0x0491 }
        L_0x0331:
            boolean r0 = r1 instanceof X.AnonymousClass5UN     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x0355
            X.5UN r1 = (X.AnonymousClass5UN) r1     // Catch:{ all -> 0x0491 }
        L_0x0337:
            X.4nq r8 = new X.4nq     // Catch:{ all -> 0x0491 }
            r8.<init>(r1)     // Catch:{ all -> 0x0491 }
        L_0x033c:
            X.0qa r5 = r7.A01     // Catch:{ all -> 0x0491 }
            r1 = 0
            if (r5 == 0) goto L_0x036a
            java.lang.Boolean r3 = r6.A01     // Catch:{ all -> 0x0491 }
            if (r3 != 0) goto L_0x0370
            X.0qi r0 = r6.A03     // Catch:{ all -> 0x0491 }
            X.0ql r0 = (X.C15370ql) r0     // Catch:{ all -> 0x0491 }
            boolean r0 = r0.AJv()     // Catch:{ all -> 0x0491 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0491 }
            r6.A01 = r3     // Catch:{ all -> 0x0491 }
            goto L_0x0367
        L_0x0355:
            X.0qi r0 = r6.A03     // Catch:{ all -> 0x0491 }
            X.3Dx r1 = new X.3Dx     // Catch:{ all -> 0x0491 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0491 }
            goto L_0x0337
        L_0x035d:
            r1 = 0
            goto L_0x0331
        L_0x035f:
            X.0qi r0 = r6.A03     // Catch:{ all -> 0x0491 }
            X.4nr r8 = new X.4nr     // Catch:{ all -> 0x0491 }
            r8.<init>(r0, r2)     // Catch:{ all -> 0x0491 }
            goto L_0x033c
        L_0x0367:
            if (r0 == 0) goto L_0x0370
            goto L_0x036c
        L_0x036a:
            r3 = r1
            goto L_0x037c
        L_0x036c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0491 }
            r6.A00 = r0     // Catch:{ all -> 0x0491 }
        L_0x0370:
            boolean r0 = r3.booleanValue()     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x0383
            long r3 = r5.A02     // Catch:{ all -> 0x0491 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0383
        L_0x037c:
            X.0qd r0 = r7.A02     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x03a5
            long r5 = r0.A00     // Catch:{ all -> 0x0491 }
            goto L_0x03a7
        L_0x0383:
            java.lang.Boolean r0 = r6.A00     // Catch:{ all -> 0x0491 }
            if (r0 != 0) goto L_0x0395
            X.0qi r0 = r6.A03     // Catch:{ all -> 0x0491 }
            X.0ql r0 = (X.C15370ql) r0     // Catch:{ all -> 0x0491 }
            boolean r0 = r0.AJ8()     // Catch:{ all -> 0x0491 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0491 }
            r6.A00 = r0     // Catch:{ all -> 0x0491 }
        L_0x0395:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x03a2
            long r3 = r5.A01     // Catch:{ all -> 0x0491 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a2
            goto L_0x037c
        L_0x03a2:
            long r1 = r5.A00     // Catch:{ all -> 0x0491 }
            goto L_0x036a
        L_0x03a5:
            r5 = 0
        L_0x03a7:
            r14 = 0
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x03b3
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x03b3
            goto L_0x0457
        L_0x03b3:
            java.util.Collection r2 = r8.A9s()     // Catch:{ all -> 0x0491 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0491 }
            if (r0 != 0) goto L_0x0457
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x03c4
            r12 = -1
            goto L_0x03cc
        L_0x03c4:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0491 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            long r12 = r12 - r5
        L_0x03cc:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0491 }
            r5.<init>()     // Catch:{ all -> 0x0491 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0491 }
        L_0x03d5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x03ea
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0491 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0491 }
            X.1k0 r0 = new X.1k0     // Catch:{ all -> 0x0491 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0491 }
            r5.add(r0)     // Catch:{ all -> 0x0491 }
            goto L_0x03d5
        L_0x03ea:
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0491 }
            r6.<init>()     // Catch:{ all -> 0x0491 }
            r11 = 3
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0427
            r1 = 0
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1     // Catch:{ all -> 0x0491 }
            r0.<init>(r1)     // Catch:{ all -> 0x0491 }
            java.util.Collections.sort(r5, r0)     // Catch:{ all -> 0x0491 }
            java.util.ListIterator r10 = r5.listIterator()     // Catch:{ all -> 0x0491 }
        L_0x0401:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x0427
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0491 }
            X.1k0 r9 = (X.C34281k0) r9     // Catch:{ all -> 0x0491 }
            if (r9 == 0) goto L_0x0427
            java.lang.Long r0 = r9.A00     // Catch:{ all -> 0x0491 }
            long r1 = r0.longValue()     // Catch:{ all -> 0x0491 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0427
            r10.remove()     // Catch:{ all -> 0x0491 }
            java.lang.String r1 = r9.A02     // Catch:{ all -> 0x0491 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0491 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0491 }
            goto L_0x0401
        L_0x0427:
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x045b
            r1 = 1
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1     // Catch:{ all -> 0x0491 }
            r0.<init>(r1)     // Catch:{ all -> 0x0491 }
            java.util.Collections.sort(r5, r0)     // Catch:{ all -> 0x0491 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0491 }
        L_0x0438:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x045b
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0491 }
            X.1k0 r0 = (X.C34281k0) r0     // Catch:{ all -> 0x0491 }
            java.lang.String r2 = r0.A02     // Catch:{ all -> 0x0491 }
            long r0 = r8.AJx(r2)     // Catch:{ all -> 0x0491 }
            long r14 = r14 + r0
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0438
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0491 }
            r6.put(r2, r0)     // Catch:{ all -> 0x0491 }
            goto L_0x0438
        L_0x0457:
            java.util.Map r6 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0491 }
        L_0x045b:
            java.util.Set r0 = r6.entrySet()     // Catch:{ all -> 0x0491 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0491 }
        L_0x0463:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x048f
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0491 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0491 }
            java.lang.Object r0 = r2.getKey()     // Catch:{ all -> 0x0491 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0491 }
            r8.AJq(r0)     // Catch:{ all -> 0x0491 }
            boolean r0 = r8.Abs(r0)     // Catch:{ all -> 0x0491 }
            if (r0 == 0) goto L_0x0463
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0491 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0491 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0491 }
            r0 = 3
            if (r1 == r0) goto L_0x0463
            r2.getValue()     // Catch:{ all -> 0x0491 }
            goto L_0x0463
        L_0x048f:
            monitor-exit(r7)     // Catch:{ all -> 0x0491 }
            return
        L_0x0491:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0491 }
            throw r1
        L_0x0494:
            java.lang.Object r3 = r2.A01
            X.0rX r3 = (X.C15600rX) r3
            java.lang.Object r1 = r2.A00
            X.3XU r1 = (X.AnonymousClass3XU) r1
            X.0rh r4 = r1.A01
            int r0 = r4.A01
            if (r0 != 0) goto L_0x04f8
            X.3Xk r1 = r1.A02
            X.C13710nw.A01(r1)
            X.0rh r4 = r1.A02
            int r0 = r4.A01
            if (r0 != 0) goto L_0x04e4
            X.0rg r4 = r3.A00
            com.google.android.gms.common.internal.IAccountAccessor r2 = r1.A00()
            java.util.Set r1 = r3.A06
            X.3ED r4 = (X.AnonymousClass3ED) r4
            if (r2 == 0) goto L_0x04ce
            if (r1 == 0) goto L_0x04ce
            r4.A00 = r2
            r4.A01 = r1
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x04c8
            X.0rn r0 = r4.A03
            r0.AFQ(r2, r1)
        L_0x04c8:
            X.5UT r0 = r3.A01
            r0.A80()
            return
        L_0x04ce:
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r1 = "GoogleApiManager"
            java.lang.String r0 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r1, r0, r2)
            r1 = 4
            X.0rh r0 = new X.0rh
            r0.<init>(r1)
            r4.AiY(r0)
            goto L_0x04c8
        L_0x04e4:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r0 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r1 = r0.concat(r1)
            java.lang.String r0 = "SignInCoordinator"
            android.util.Log.wtf(r0, r1, r2)
        L_0x04f8:
            X.0rg r0 = r3.A00
            r0.AiY(r4)
            goto L_0x04c8
        L_0x04fe:
            java.lang.Object r0 = r2.A01
            com.google.android.gms.internal.gtm.zzbq r0 = (com.google.android.gms.internal.gtm.zzbq) r0
            com.google.android.gms.internal.gtm.zzck r3 = r0.zza
            java.lang.Object r2 = r2.A00
            com.google.android.gms.internal.gtm.zzex r2 = (com.google.android.gms.internal.gtm.zzex) r2
            java.lang.String r12 = "hit_id"
            X.C13710nw.A01(r2)
            X.C15000qA.A00()
            r3.zzW()
            boolean r0 = r3.zzk
            if (r0 == 0) goto L_0x05b7
            java.lang.String r0 = "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions"
            r3.zzF(r0)
        L_0x051c:
            java.lang.String r7 = "_m"
            java.lang.String r11 = ""
            X.C13710nw.A05(r7)
            java.lang.String r0 = "&"
            boolean r0 = r7.startsWith(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "Short param name required"
            X.C13710nw.A03(r0, r1)
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x053b
            r0 = r11
        L_0x053b:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r8 = 1
            if (r0 == 0) goto L_0x05a6
            com.google.android.gms.internal.gtm.zzbv r1 = r3.zza
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfh r0 = r1.zzk
            com.google.android.gms.internal.gtm.zzfg r0 = r0.zzd
            android.util.Pair r1 = r0.zza()
            if (r1 == 0) goto L_0x05a6
            java.lang.Object r0 = r1.second
            java.lang.Object r6 = r1.first
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r4 = r5.length()
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r1 = r0.length()
            int r0 = r4 + 1
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.util.Map r0 = r2.zza
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r0)
            r10.put(r7, r1)
            long r6 = r2.zzd
            boolean r9 = r2.zzf
            long r4 = r2.zzc
            int r1 = r2.zze
            java.util.List r0 = r2.zzb
            com.google.android.gms.internal.gtm.zzex r2 = new com.google.android.gms.internal.gtm.zzex
            r13 = r2
            r14 = r3
            r15 = r10
            r16 = r6
            r18 = r9
            r19 = r4
            r21 = r1
            r22 = r0
            r13.<init>(r14, r15, r16, r18, r19, r21, r22)
        L_0x05a6:
            r3.zzi()
            com.google.android.gms.internal.gtm.zzcc r0 = r3.zze
            boolean r0 = r0.zzh(r2)
            if (r0 == 0) goto L_0x05be
            java.lang.String r0 = "Hit sent to the device AnalyticsService for delivery"
            r3.zzF(r0)
            return
        L_0x05b7:
            java.lang.String r0 = "Delivering hit"
            r3.zzP(r0, r2)
            goto L_0x051c
        L_0x05be:
            com.google.android.gms.internal.gtm.zzce r4 = r3.zzb     // Catch:{ SQLiteException -> 0x072a }
            X.C15000qA.A00()     // Catch:{ SQLiteException -> 0x072a }
            r4.zzW()     // Catch:{ SQLiteException -> 0x072a }
            android.net.Uri$Builder r7 = new android.net.Uri$Builder     // Catch:{ SQLiteException -> 0x072a }
            r7.<init>()     // Catch:{ SQLiteException -> 0x072a }
            java.util.Map r0 = r2.zza     // Catch:{ SQLiteException -> 0x072a }
            java.util.Set r0 = r0.entrySet()     // Catch:{ SQLiteException -> 0x072a }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ SQLiteException -> 0x072a }
        L_0x05d5:
            boolean r0 = r6.hasNext()     // Catch:{ SQLiteException -> 0x072a }
            if (r0 == 0) goto L_0x0609
            java.lang.Object r5 = r6.next()     // Catch:{ SQLiteException -> 0x072a }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ SQLiteException -> 0x072a }
            java.lang.Object r1 = r5.getKey()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r0 = "ht"
            boolean r0 = r0.equals(r1)     // Catch:{ SQLiteException -> 0x072a }
            if (r0 != 0) goto L_0x05d5
            java.lang.String r0 = "qt"
            boolean r0 = r0.equals(r1)     // Catch:{ SQLiteException -> 0x072a }
            if (r0 != 0) goto L_0x05d5
            java.lang.String r0 = "AppUID"
            boolean r0 = r0.equals(r1)     // Catch:{ SQLiteException -> 0x072a }
            if (r0 != 0) goto L_0x05d5
            java.lang.Object r0 = r5.getValue()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SQLiteException -> 0x072a }
            r7.appendQueryParameter(r1, r0)     // Catch:{ SQLiteException -> 0x072a }
            goto L_0x05d5
        L_0x0609:
            android.net.Uri r0 = r7.build()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r7 = r0.getEncodedQuery()     // Catch:{ SQLiteException -> 0x072a }
            if (r7 != 0) goto L_0x0614
            r7 = r11
        L_0x0614:
            int r1 = r7.length()     // Catch:{ SQLiteException -> 0x072a }
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 <= r0) goto L_0x062f
            com.google.android.gms.internal.gtm.zzbv r1 = r4.zza     // Catch:{ SQLiteException -> 0x072a }
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf     // Catch:{ SQLiteException -> 0x072a }
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)     // Catch:{ SQLiteException -> 0x072a }
            com.google.android.gms.internal.gtm.zzfb r1 = r1.zzf     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r0 = "Hit length exceeds the maximum allowed size"
            r1.zzb(r2, r0)     // Catch:{ SQLiteException -> 0x072a }
        L_0x062a:
            r3.zzae()     // Catch:{ SQLiteException -> 0x072a }
            goto L_0x0720
        L_0x062f:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzf     // Catch:{ SQLiteException -> 0x072a }
            java.lang.Object r0 = r0.zzb()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ SQLiteException -> 0x072a }
            int r6 = r0.intValue()     // Catch:{ SQLiteException -> 0x072a }
            long r9 = r4.zzb()     // Catch:{ SQLiteException -> 0x072a }
            int r0 = r6 + -1
            long r0 = (long) r0     // Catch:{ SQLiteException -> 0x072a }
            r14 = 0
            int r5 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x06bb
            long r0 = (long) r6     // Catch:{ SQLiteException -> 0x072a }
            long r9 = r9 - r0
            r0 = 1
            long r9 = r9 + r0
            X.C15000qA.A00()     // Catch:{ SQLiteException -> 0x072a }
            r4.zzW()     // Catch:{ SQLiteException -> 0x072a }
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0659
            goto L_0x06a7
        L_0x0659:
            android.database.sqlite.SQLiteDatabase r11 = r4.zzf()     // Catch:{ SQLiteException -> 0x072a }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x072a }
            r5.<init>()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String[] r13 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x069a, all -> 0x0721 }
            r6 = 0
            r13[r6] = r12     // Catch:{ SQLiteException -> 0x069a, all -> 0x0721 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ SQLiteException -> 0x069a, all -> 0x0721 }
            r1[r6] = r12     // Catch:{ SQLiteException -> 0x069a, all -> 0x0721 }
            java.lang.String r12 = "hits2"
            java.lang.String r0 = "%s ASC"
            java.lang.String r18 = java.lang.String.format(r0, r1)     // Catch:{ SQLiteException -> 0x069a, all -> 0x0721 }
            java.lang.String r19 = java.lang.Long.toString(r9)     // Catch:{ SQLiteException -> 0x069a, all -> 0x0721 }
            r16 = r14
            r17 = r14
            r15 = r14
            android.database.Cursor r8 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x069a, all -> 0x0721 }
            boolean r0 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0698 }
            if (r0 == 0) goto L_0x06a3
        L_0x0686:
            long r0 = r8.getLong(r6)     // Catch:{ SQLiteException -> 0x0698 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0698 }
            r5.add(r0)     // Catch:{ SQLiteException -> 0x0698 }
            boolean r0 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0698 }
            if (r0 != 0) goto L_0x0686
            goto L_0x06a3
        L_0x0698:
            r1 = move-exception
            goto L_0x069c
        L_0x069a:
            r1 = move-exception
            r8 = r14
        L_0x069c:
            java.lang.String r0 = "Error selecting hit ids"
            r4.zzS(r0, r1)     // Catch:{ all -> 0x0723 }
            if (r8 == 0) goto L_0x06ab
        L_0x06a3:
            r8.close()     // Catch:{ SQLiteException -> 0x072a }
            goto L_0x06ab
        L_0x06a7:
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x072a }
        L_0x06ab:
            java.lang.String r1 = "Store full, deleting hits to make room, count"
            int r0 = r5.size()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x072a }
            r4.zzS(r1, r0)     // Catch:{ SQLiteException -> 0x072a }
            r4.zzZ(r5)     // Catch:{ SQLiteException -> 0x072a }
        L_0x06bb:
            android.database.sqlite.SQLiteDatabase r6 = r4.zzf()     // Catch:{ SQLiteException -> 0x072a }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x072a }
            r5.<init>()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r0 = "hit_string"
            r5.put(r0, r7)     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r7 = "hit_time"
            long r0 = r2.zzd     // Catch:{ SQLiteException -> 0x072a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x072a }
            r5.put(r7, r0)     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r1 = "hit_app_id"
            int r0 = r2.zze     // Catch:{ SQLiteException -> 0x072a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteException -> 0x072a }
            r5.put(r1, r0)     // Catch:{ SQLiteException -> 0x072a }
            boolean r0 = r2.zzf     // Catch:{ SQLiteException -> 0x072a }
            if (r0 == 0) goto L_0x06f1
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzr     // Catch:{ SQLiteException -> 0x072a }
            java.lang.Object r1 = r0.zzb()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SQLiteException -> 0x072a }
        L_0x06eb:
            java.lang.String r0 = "hit_url"
            r5.put(r0, r1)     // Catch:{ SQLiteException -> 0x072a }
            goto L_0x06fa
        L_0x06f1:
            com.google.android.gms.internal.gtm.zzet r0 = com.google.android.gms.internal.gtm.zzeu.zzq     // Catch:{ SQLiteException -> 0x072a }
            java.lang.Object r1 = r0.zzb()     // Catch:{ SQLiteException -> 0x072a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SQLiteException -> 0x072a }
            goto L_0x06eb
        L_0x06fa:
            java.lang.String r0 = "hits2"
            long r7 = r6.insert(r0, r14, r5)     // Catch:{ SQLiteException -> 0x0718 }
            r5 = -1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x070d
            java.lang.String r0 = "Failed to insert a hit (got -1)"
            r4.zzJ(r0)     // Catch:{ SQLiteException -> 0x0718 }
            goto L_0x062a
        L_0x070d:
            java.lang.String r1 = "Hit saved to database. db-id, hit"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0718 }
            r4.zzH(r1, r0, r2)     // Catch:{ SQLiteException -> 0x0718 }
            goto L_0x062a
        L_0x0718:
            r1 = move-exception
            java.lang.String r0 = "Error storing a hit"
            r4.zzK(r0, r1)     // Catch:{ SQLiteException -> 0x072a }
            goto L_0x062a
        L_0x0720:
            return
        L_0x0721:
            r0 = move-exception
            goto L_0x0729
        L_0x0723:
            r0 = move-exception
            if (r8 == 0) goto L_0x0729
            r8.close()     // Catch:{ SQLiteException -> 0x072a }
        L_0x0729:
            throw r0     // Catch:{ SQLiteException -> 0x072a }
        L_0x072a:
            r1 = move-exception
            java.lang.String r0 = "Delivery failed to save hit to a database"
            r3.zzK(r0, r1)
            com.google.android.gms.internal.gtm.zzbv r1 = r3.zza
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r1 = r1.zzf
            java.lang.String r0 = "deliver: failed to insert hit to database"
            r1.zzb(r2, r0)
            return
        L_0x073f:
            java.lang.Object r0 = r2.A01
            com.google.android.gms.internal.gtm.zzbq r0 = (com.google.android.gms.internal.gtm.zzbq) r0
            com.google.android.gms.internal.gtm.zzck r3 = r0.zza
            java.lang.Object r2 = r2.A00
            com.google.android.gms.internal.gtm.zzcz r2 = (com.google.android.gms.internal.gtm.zzcz) r2
            long r0 = r3.zzj
            r3.zzg(r2, r0)
            return
        L_0x074f:
            java.lang.Object r1 = r2.A00
            X.0on r1 = (X.C14210on) r1
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0761
            java.lang.Object r0 = r2.A01
            X.0p7 r0 = (X.C14410p7) r0
            X.0on r0 = r0.A01
            r0.A02()
            return
        L_0x0761:
            java.lang.Object r3 = r2.A01     // Catch:{ 5Ac -> 0x077a, Exception -> 0x0771 }
            X.0p7 r3 = (X.C14410p7) r3     // Catch:{ 5Ac -> 0x077a, Exception -> 0x0771 }
            X.0op r0 = r3.A00     // Catch:{ 5Ac -> 0x077a, Exception -> 0x0771 }
            java.lang.Object r1 = r0.Agh(r1)     // Catch:{ 5Ac -> 0x077a, Exception -> 0x0771 }
            X.0on r0 = r3.A01
            r0.A08(r1)
            return
        L_0x0771:
            r1 = move-exception
            java.lang.Object r0 = r2.A01
            X.0p7 r0 = (X.C14410p7) r0
            X.0on r0 = r0.A01
            goto L_0x0aad
        L_0x077a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r3 = r1 instanceof java.lang.Exception
            java.lang.Object r1 = r2.A01
            X.0p7 r1 = (X.C14410p7) r1
            X.0on r1 = r1.A01
            goto L_0x0a7e
        L_0x0789:
            java.lang.Object r3 = r2.A00
            X.0rE r3 = (X.C15500rE) r3
            java.lang.Object r2 = r2.A01
            android.os.IBinder r2 = (android.os.IBinder) r2
            monitor-enter(r3)
            r1 = 0
            if (r2 != 0) goto L_0x0796
            goto L_0x07b3
        L_0x0796:
            X.4GZ r0 = new X.4GZ     // Catch:{ RemoteException -> 0x07ad }
            r0.<init>(r2)     // Catch:{ RemoteException -> 0x07ad }
            r3.A01 = r0     // Catch:{ RemoteException -> 0x07ad }
            r0 = 2
            r3.A00 = r0     // Catch:{ all -> 0x07ba }
            X.0pD r0 = r3.A05     // Catch:{ all -> 0x07ba }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x07ba }
            X.3HV r0 = new X.3HV     // Catch:{ all -> 0x07ba }
            r0.<init>(r3)     // Catch:{ all -> 0x07ba }
            r1.execute(r0)     // Catch:{ all -> 0x07ba }
            goto L_0x07b8
        L_0x07ad:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x07ba }
            goto L_0x07b5
        L_0x07b3:
            java.lang.String r0 = "Null service connection"
        L_0x07b5:
            r3.A01(r1, r0)     // Catch:{ all -> 0x07ba }
        L_0x07b8:
            monitor-exit(r3)     // Catch:{ all -> 0x07ba }
            return
        L_0x07ba:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x07ba }
            throw r1
        L_0x07bd:
            java.lang.Object r1 = r2.A00
            X.0zu r1 = (X.C20350zu) r1
            java.lang.Object r0 = r2.A01
            X.01G r0 = (X.AnonymousClass01G) r0
            com.obwhatsapp.AbstractAppShellDelegate.lambda$queueAsyncInit$3(r1, r0)
            return
        L_0x07c9:
            java.lang.Object r3 = r2.A00
            X.0pN r3 = (X.C14550pN) r3
            java.lang.Object r1 = r2.A01
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 0
            r3.A2X(r1, r0)
            return
        L_0x07d6:
            java.lang.Object r0 = r2.A00
            X.0yD r0 = (X.C19300yD) r0
            X.0pd r1 = r0.A0R
            r0 = 508(0x1fc, float:7.12E-43)
            r1.A0C(r0)
            return
        L_0x07e2:
            java.lang.Object r0 = r2.A00
            X.0yD r0 = (X.C19300yD) r0
            java.lang.Object r1 = r2.A01
            X.0tZ r1 = (X.C16740tZ) r1
            X.1HH r0 = r0.A0g
            X.1sE r1 = (X.C39291sE) r1
            r0.A00(r1)
            return
        L_0x07f2:
            java.lang.Object r4 = r2.A00
            X.0yD r4 = (X.C19300yD) r4
            java.lang.Object r3 = r2.A01
            X.0tY r3 = (X.C16730tY) r3
            X.14r r2 = r4.A0T
            X.0w2 r0 = r4.A0Q
            int r9 = X.C18020w1.A02(r0, r3)
            int r11 = X.C18020w1.A05(r3)
            monitor-enter(r2)
            long r12 = r2.A01()     // Catch:{ all -> 0x0867 }
            int r10 = r2.A00()     // Catch:{ all -> 0x0867 }
            X.14q r7 = r2.A04     // Catch:{ all -> 0x0867 }
            r14 = 0
            r21 = 0
            r15 = r7
            r16 = r9
            r17 = r10
            r18 = r11
            r19 = r12
            X.25Q r8 = r15.A01(r16, r17, r18, r19, r21)     // Catch:{ all -> 0x0867 }
            long r0 = r8.A04     // Catch:{ all -> 0x0867 }
            r5 = 1
            long r0 = r0 + r5
            r8.A04 = r0     // Catch:{ all -> 0x0867 }
            r7.A02(r8, r9, r10, r11, r12, r14)     // Catch:{ all -> 0x0867 }
            monitor-exit(r2)
            X.1HP r1 = r4.A0W
            boolean r0 = r1.A01(r3)
            if (r0 == 0) goto L_0x083a
            X.1Ae r1 = r1.A06
            r0 = 1
            r1.A06(r3, r0)
        L_0x083a:
            boolean r0 = r3.A1D
            if (r0 == 0) goto L_0x085a
            boolean r0 = r3 instanceof X.C38641rB
            if (r0 == 0) goto L_0x085a
            X.0pd r2 = r4.A0R
            r1 = 1829(0x725, float:2.563E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            if (r0 <= 0) goto L_0x085a
            X.0xv r2 = r4.A0U
            com.facebook.redex.IDxDListenerShape88S0200000_2_I1 r1 = new com.facebook.redex.IDxDListenerShape88S0200000_2_I1
            r1.<init>(r4, r14, r3)
            r0 = 1
            r2.A00(r1, r3, r0, r0)
            return
        L_0x085a:
            X.0xv r2 = r4.A0U
            X.0wP r1 = r2.A03
            r0 = 1
            int r0 = r1.A04(r0)
            r2.A01(r3, r0, r14)
            return
        L_0x0867:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x086a:
            java.lang.Object r0 = r2.A00
            X.0yD r0 = (X.C19300yD) r0
            java.lang.Object r1 = r2.A01
            X.0sH r1 = (X.C16010sH) r1
            X.0sG r0 = r0.A08
            r0.A0L(r1)
            return
        L_0x0878:
            java.lang.Object r0 = r2.A00
            X.10X r0 = (X.AnonymousClass10X) r0
            java.lang.Object r1 = r2.A01
            X.25G r1 = (X.AnonymousClass25G) r1
            X.1QZ r0 = r0.A0M
            r0.A02(r1)
            return
        L_0x0886:
            java.lang.Object r3 = r2.A00
            X.15a r3 = (X.C216815a) r3
            java.lang.Object r0 = r2.A01
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            X.0sG r0 = r3.A02
            r0.A0X(r1)
            return
        L_0x089a:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r1 = r2.A01
            X.0tZ r1 = (X.C16740tZ) r1
            X.14r r2 = r0.A18
            X.0w2 r0 = r0.A0w
            int r7 = X.C18020w1.A02(r0, r1)
            int r9 = X.C18020w1.A05(r1)
            monitor-enter(r2)
            long r10 = r2.A01()     // Catch:{ all -> 0x093a }
            int r8 = r2.A00()     // Catch:{ all -> 0x093a }
            X.14q r5 = r2.A04     // Catch:{ all -> 0x093a }
            r12 = 0
            r19 = 0
            r13 = r5
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r10
            X.25Q r6 = r13.A01(r14, r15, r16, r17, r19)     // Catch:{ all -> 0x093a }
            long r0 = r6.A03     // Catch:{ all -> 0x093a }
            r3 = 1
            long r0 = r0 + r3
            r6.A03 = r0     // Catch:{ all -> 0x093a }
            goto L_0x0935
        L_0x08cf:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r3 = r2.A01
            X.0tZ r3 = (X.C16740tZ) r3
            X.0xq r2 = r0.A0n
            X.1Vw r0 = r3.A11
            boolean r1 = r0.A02
            r0 = 25
            if (r1 == 0) goto L_0x08e3
            r0 = 9
        L_0x08e3:
            r2.A08(r3, r0)
            return
        L_0x08e7:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r4 = r2.A01
            X.0z4 r3 = r0.A1H
            r2 = 1
            X.0tZ[] r1 = new X.C16740tZ[r2]
            r0 = 0
            r1[r0] = r4
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A0A(r0, r1)
            return
        L_0x0901:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r1 = r2.A01
            X.0tZ r1 = (X.C16740tZ) r1
            X.14r r2 = r0.A18
            X.0w2 r0 = r0.A0w
            int r7 = X.C18020w1.A02(r0, r1)
            int r9 = X.C18020w1.A05(r1)
            monitor-enter(r2)
            long r10 = r2.A01()     // Catch:{ all -> 0x093a }
            int r8 = r2.A00()     // Catch:{ all -> 0x093a }
            X.14q r5 = r2.A04     // Catch:{ all -> 0x093a }
            r12 = 0
            r19 = 0
            r13 = r5
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r10
            X.25Q r6 = r13.A01(r14, r15, r16, r17, r19)     // Catch:{ all -> 0x093a }
            long r0 = r6.A06     // Catch:{ all -> 0x093a }
            r3 = 1
            long r0 = r0 + r3
            r6.A06 = r0     // Catch:{ all -> 0x093a }
        L_0x0935:
            r5.A02(r6, r7, r8, r9, r10, r12)     // Catch:{ all -> 0x093a }
            monitor-exit(r2)
            return
        L_0x093a:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x093d:
            java.lang.Object r4 = r2.A00
            X.0tb r4 = (X.C16760tb) r4
            boolean r0 = com.obwhatsapp.yo.yo.antiVOnce()
            if (r0 == 0) goto L_0x0948
            return
        L_0x0948:
            java.lang.Object r5 = r2.A01
            X.0tZ r5 = (X.C16740tZ) r5
            java.lang.String r0 = "UserActions/update view once/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            long r0 = r5.A13
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.180 r3 = r4.A0r
            X.AnonymousClass00B.A00()
            boolean r0 = r5 instanceof X.C39001rl
            X.AnonymousClass00B.A0G(r0)
            long r1 = r5.A13
            r0 = r5
            X.1rl r0 = (X.C39001rl) r0
            int r0 = r0.AGz()
            r3.A00(r1, r0)
            X.0pt r2 = r4.A03
            r1 = 25
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r5, r1, r4)
            r2.A0K(r0)
            return
        L_0x0982:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r5 = r2.A01
            X.0tZ r5 = (X.C16740tZ) r5
            X.0z4 r2 = r0.A1H
            monitor-enter(r2)
            X.1Vw r0 = r5.A11     // Catch:{ all -> 0x099c }
            X.0rv r3 = r0.A00     // Catch:{ all -> 0x099c }
            X.0tZ r4 = r2.A04(r3)     // Catch:{ all -> 0x099c }
            r6 = -1
            r7 = 1
            r2.A07(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x099c }
            monitor-exit(r2)
            return
        L_0x099c:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x099f:
            java.lang.Object r1 = r2.A00
            X.0tb r1 = (X.C16760tb) r1
            java.lang.Object r0 = r2.A01
            X.1d9 r0 = (X.C30901d9) r0
            r1.A0U(r0)
            return
        L_0x09ab:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r2 = r2.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.0z4 r1 = r0.A1H
            r0 = 0
            goto L_0x09c2
        L_0x09b7:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r2 = r2.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.0z4 r1 = r0.A1H
            r0 = 4
        L_0x09c2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0A(r0, r2)
            return
        L_0x09ca:
            java.lang.Object r0 = r2.A00
            X.0tb r0 = (X.C16760tb) r0
            java.lang.Object r1 = r2.A01
            X.1ZX r1 = (X.AnonymousClass1ZX) r1
            X.15H r0 = r0.A0s
            r0.A05(r1)
            return
        L_0x09d8:
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            java.lang.Object r0 = r2.A00
            X.0pQ r0 = (X.C14580pQ) r0
            android.view.ViewTreeObserver$OnDrawListener r0 = r0.A00
            r1.removeOnDrawListener(r0)
            return
        L_0x09ea:
            java.lang.Object r0 = r2.A00
            X.0xc r0 = (X.C19010xc) r0
            java.lang.Object r4 = r2.A01
            android.content.Context r4 = (android.content.Context) r4
            X.0pd r3 = r0.A0X
            X.10J r2 = r0.A0W
            X.0rz r1 = r0.A0M
            java.lang.String r0 = r1.A0Q()
            X.AnonymousClass2FR.A02(r4, r1, r2, r3, r0)
            return
        L_0x0a00:
            java.lang.Object r1 = r2.A00
            X.1WE r1 = (X.AnonymousClass1WE) r1
            java.lang.Object r0 = r2.A01
            r1.accept(r0)
            return
        L_0x0a0a:
            java.lang.Object r3 = r2.A00
            X.0pN r3 = (X.C14550pN) r3
            java.lang.Object r0 = r2.A01
            X.2RG r0 = (X.AnonymousClass2RG) r0
            android.content.Intent r0 = r0.mIntent
            if (r0 != 0) goto L_0x0a1c
            r1 = 0
        L_0x0a17:
            r0 = 1
            r3.Ag3(r1, r0)
            return
        L_0x0a1c:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            goto L_0x0a17
        L_0x0a22:
            java.lang.Object r1 = r2.A00
            X.0tJ r1 = (X.C16590tJ) r1
            java.lang.Object r0 = r2.A01
            r1.A02(r0)
            return
        L_0x0a2c:
            java.lang.Object r1 = r2.A00
            X.0tJ r1 = (X.C16590tJ) r1
            java.lang.Object r0 = r2.A01
            r1.A03(r0)
            return
        L_0x0a36:
            java.lang.Object r4 = r2.A01     // Catch:{ 5Ac -> 0x0a71, Exception -> 0x0a69 }
            X.0or r4 = (X.C14250or) r4     // Catch:{ 5Ac -> 0x0a71, Exception -> 0x0a69 }
            X.0op r1 = r4.A00     // Catch:{ 5Ac -> 0x0a71, Exception -> 0x0a69 }
            java.lang.Object r0 = r2.A00     // Catch:{ 5Ac -> 0x0a71, Exception -> 0x0a69 }
            X.0on r0 = (X.C14210on) r0     // Catch:{ 5Ac -> 0x0a71, Exception -> 0x0a69 }
            java.lang.Object r3 = r1.Agh(r0)     // Catch:{ 5Ac -> 0x0a71, Exception -> 0x0a69 }
            X.0on r3 = (X.C14210on) r3     // Catch:{ 5Ac -> 0x0a71, Exception -> 0x0a69 }
            if (r3 != 0) goto L_0x0a53
            java.lang.String r1 = "Continuation returned null"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            r4.AQu(r0)
            return
        L_0x0a53:
            java.util.concurrent.Executor r2 = X.C14500pH.A01
            r3.A06(r4, r2)
            r3.A05(r4, r2)
            X.0oq r1 = r3.A03
            X.0pI r0 = new X.0pI
            r0.<init>(r4, r2)
            r1.A00(r0)
            r3.A04()
            return
        L_0x0a69:
            r1 = move-exception
            java.lang.Object r0 = r2.A01
            X.0or r0 = (X.C14250or) r0
            X.0on r0 = r0.A01
            goto L_0x0aad
        L_0x0a71:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r3 = r1 instanceof java.lang.Exception
            java.lang.Object r1 = r2.A01
            X.0or r1 = (X.C14250or) r1
            X.0on r1 = r1.A01
        L_0x0a7e:
            if (r3 == 0) goto L_0x0a86
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
        L_0x0a86:
            r1.A07(r0)
            return
        L_0x0a8a:
            java.lang.Object r1 = r2.A00     // Catch:{ Exception -> 0x0aa8, all -> 0x0a9a }
            X.0on r1 = (X.C14210on) r1     // Catch:{ Exception -> 0x0aa8, all -> 0x0a9a }
            java.lang.Object r0 = r2.A01     // Catch:{ Exception -> 0x0aa8, all -> 0x0a9a }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x0aa8, all -> 0x0a9a }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0aa8, all -> 0x0a9a }
            r1.A08(r0)     // Catch:{ Exception -> 0x0aa8, all -> 0x0a9a }
            return
        L_0x0a9a:
            r3 = move-exception
            java.lang.Object r1 = r2.A00
            X.0on r1 = (X.C14210on) r1
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            r1.A07(r0)
            return
        L_0x0aa8:
            r1 = move-exception
            java.lang.Object r0 = r2.A00
            X.0on r0 = (X.C14210on) r0
        L_0x0aad:
            r0.A07(r1)
            return
        L_0x0ab1:
            X.1Nx r5 = r8.A01     // Catch:{ all -> 0x0ad8 }
            X.2Is r4 = r5.A00()     // Catch:{ all -> 0x0ad8 }
            long r0 = r4.A04     // Catch:{ all -> 0x0ad8 }
            r2 = 1
            long r0 = r0 + r2
            r4.A04 = r0     // Catch:{ all -> 0x0ad8 }
            if (r6 == 0) goto L_0x0ac5
            long r0 = r4.A07     // Catch:{ all -> 0x0ad8 }
            long r0 = r0 + r2
            r4.A07 = r0     // Catch:{ all -> 0x0ad8 }
        L_0x0ac5:
            if (r7 == 0) goto L_0x0ad3
            long r0 = r4.A08     // Catch:{ all -> 0x0ad8 }
            long r0 = r0 + r2
            r4.A08 = r0     // Catch:{ all -> 0x0ad8 }
            if (r6 == 0) goto L_0x0ad3
            long r0 = r4.A06     // Catch:{ all -> 0x0ad8 }
            long r0 = r0 + r2
            r4.A06 = r0     // Catch:{ all -> 0x0ad8 }
        L_0x0ad3:
            r5.A01(r4)     // Catch:{ all -> 0x0ad8 }
            monitor-exit(r8)
            return
        L_0x0ad8:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        L_0x0adb:
            X.1Sp r0 = r3.A1V
            r0.A05(r1)
            return
        L_0x0ae1:
            return
        L_0x0ae2:
            r1 = move-exception
            java.lang.String r0 = "userActionSendMediaMessages/addManagedFileReferencesIfExternalShared"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0aea:
            java.lang.String r0 = "settings-gdrive/gps-unavailable no way to install."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.os.ConditionVariable r0 = r5.A0V
            r0.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape2S0200000_I0.run():void");
    }
}
