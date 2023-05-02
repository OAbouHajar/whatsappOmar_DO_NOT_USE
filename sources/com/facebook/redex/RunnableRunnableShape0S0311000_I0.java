package com.facebook.redex;

import X.AnonymousClass121;
import X.C15830rv;
import X.C16010sH;
import X.C207611m;
import X.C51412bd;
import java.net.InetSocketAddress;

public class RunnableRunnableShape0S0311000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public RunnableRunnableShape0S0311000_I0(C16010sH r2, C15830rv r3, AnonymousClass121 r4, int i2) {
        this.A05 = 4;
        this.A01 = r4;
        this.A02 = r2;
        this.A00 = i2;
        this.A04 = true;
        this.A03 = r3;
    }

    public RunnableRunnableShape0S0311000_I0(C16010sH r2, C15830rv r3, AnonymousClass121 r4, int i2, int i3, boolean z2) {
        this.A05 = 5;
        this.A01 = r4;
        this.A04 = true;
        this.A02 = r2;
        this.A00 = i2;
        this.A03 = r3;
    }

    public RunnableRunnableShape0S0311000_I0(C207611m r2, C51412bd r3, InetSocketAddress inetSocketAddress, int i2, boolean z2) {
        this.A05 = i2;
        this.A01 = r2;
        this.A02 = inetSocketAddress;
        this.A00 = 30000;
        this.A04 = z2;
        this.A03 = r3;
    }

    public RunnableRunnableShape0S0311000_I0(Object obj, Object obj2, Object obj3, int i2, int i3, boolean z2) {
        this.A05 = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = z2;
        this.A03 = obj3;
        this.A00 = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.1l4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.0sL} */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r4.A05 == r2) goto L_0x0038;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r1 = r13.A05
            switch(r1) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0116;
                case 4: goto L_0x01b5;
                case 5: goto L_0x0017;
                case 6: goto L_0x01f2;
                case 7: goto L_0x0053;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r13.A01
            X.11m r3 = (X.C207611m) r3
            java.lang.Object r2 = r13.A02
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            boolean r1 = r13.A04
            java.lang.Object r0 = r13.A03
            X.2bd r0 = (X.C51412bd) r0
            r3.A01(r0, r2, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r5 = r13.A01
            X.121 r5 = (X.AnonymousClass121) r5
            java.lang.Object r4 = r13.A02
            X.0sH r4 = (X.C16010sH) r4
            int r2 = r13.A00
            java.lang.Object r3 = r13.A03
            X.0rv r3 = (X.C15830rv) r3
            X.120 r0 = r5.A08
            boolean r0 = r0.A05(r4)
            if (r0 != 0) goto L_0x0033
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L_0x0038
        L_0x0033:
            int r0 = r4.A05
            r1 = 1
            if (r0 != r2) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            X.12A r0 = r5.A0A
            X.120 r0 = r0.A05
            r0.A04(r4)
            X.0ub r0 = r5.A07
            r0.A05(r3)
            r0.A04(r3)
            if (r1 == 0) goto L_0x0016
            X.12B r2 = r5.A0L
            int r1 = r4.A05
            r0 = 2
            r2.A01(r3, r1, r0)
            return
        L_0x0053:
            java.lang.Object r5 = r13.A01
            X.1RU r5 = (X.AnonymousClass1RU) r5
            java.lang.Object r4 = r13.A02
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            boolean r3 = r13.A04
            int r1 = r13.A00
            byte r1 = (byte) r1
            java.lang.Object r2 = r13.A03
            X.0tZ r2 = (X.C16740tZ) r2
            if (r4 == 0) goto L_0x0069
            r4.run()
        L_0x0069:
            if (r3 == 0) goto L_0x0016
            r0 = 56
            if (r1 != r0) goto L_0x0077
            X.0xq r1 = r5.A03
            r0 = 28
        L_0x0073:
            r1.A08(r2, r0)
            return
        L_0x0077:
            r0 = 67
            if (r1 != r0) goto L_0x0080
            X.0xq r1 = r5.A03
            r0 = 31
            goto L_0x0073
        L_0x0080:
            r0 = 68
            if (r1 != r0) goto L_0x0016
            X.0xq r1 = r5.A03
            r0 = 30
            goto L_0x0073
        L_0x0089:
            java.lang.Object r3 = r13.A01
            X.152 r3 = (X.AnonymousClass152) r3
            java.lang.Object r7 = r13.A02
            X.0sH r7 = (X.C16010sH) r7
            boolean r8 = r13.A04
            java.lang.Object r9 = r13.A03
            X.0rv r9 = (X.C15830rv) r9
            int r11 = r13.A00
            X.0uk r5 = r3.A01
            X.0rv r2 = r7.A0E
            boolean r0 = r2 instanceof X.C16050sL
            r4 = 0
            if (r0 == 0) goto L_0x00ba
            X.0sL r2 = (X.C16050sL) r2
            X.0rt r0 = r5.A06
            int r1 = r0.A02(r2)
            r0 = 2
            if (r1 == r0) goto L_0x00b0
            r0 = 3
            if (r1 != r0) goto L_0x00b4
        L_0x00b0:
            X.0sL r4 = r5.A02(r2)
        L_0x00b4:
            X.1l4 r0 = new X.1l4
            r0.<init>(r4, r1)
            r4 = r0
        L_0x00ba:
            r6 = 1
            r5 = 2
            r12 = 2
            if (r8 == 0) goto L_0x00c0
            r12 = 1
        L_0x00c0:
            if (r4 != 0) goto L_0x00f9
            r2 = 0
        L_0x00c3:
            boolean r0 = r7.A0J()
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "ContactPhotosBitmapManager/getGroupProfilePictureFromServerIfNeeded/fetching group image from server/groupType = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " group jid = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e2:
            if (r2 != r5) goto L_0x00fc
            if (r4 == 0) goto L_0x0110
            X.0sL r8 = r4.A01
            if (r8 == 0) goto L_0x0110
            X.12B r10 = r3.A04
            X.0sL r9 = (X.C16050sL) r9
            X.0pt r0 = r10.A01
            X.3Hs r7 = new X.3Hs
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0K(r7)
            return
        L_0x00f9:
            int r2 = r4.A00
            goto L_0x00c3
        L_0x00fc:
            if (r2 != r6) goto L_0x0110
            X.12B r1 = r3.A04
            r4 = 0
            X.0pt r0 = r1.A01
            X.3Hs r2 = new X.3Hs
            r3 = r9
            r5 = r1
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0K(r2)
            return
        L_0x0110:
            X.12B r0 = r3.A04
            r0.A01(r9, r11, r12)
            return
        L_0x0116:
            java.lang.Object r6 = r13.A01
            X.1Tv r6 = (X.C27971Tv) r6
            java.lang.Object r5 = r13.A02
            X.1ci r5 = (X.C30641ci) r5
            java.lang.Object r8 = r13.A03
            X.0rv r8 = (X.C15830rv) r8
            int r10 = r13.A00
            boolean r7 = r13.A04
            X.AnonymousClass00B.A06(r8)
            X.0wT r1 = r6.A09
            android.content.SharedPreferences r0 = r1.A01()
            java.lang.String r4 = "payments_invitee_jids_with_expiry"
            java.lang.String r9 = ""
            java.lang.String r0 = r0.getString(r4, r9)
            java.util.Map r0 = r1.A07(r0)
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x01ad
            X.122 r2 = r6.A0G
            X.0t3 r0 = r6.A00
            long r0 = r0.A00()
            X.18b r3 = r2.A03
            r2 = 0
            X.1Vw r3 = r3.A02(r8, r2)
            X.1uB r2 = new X.1uB
            r2.<init>(r3, r0)
            r2.A00 = r10
            r2.A01 = r7
            r2.A0b(r8)
            X.0t6 r1 = r6.A02
            r0 = 16
            r1.A0w(r2, r0)
            X.1HS r3 = r6.A08
            X.0wT r1 = r3.A03
            android.content.SharedPreferences r0 = r1.A01()
            java.lang.String r0 = r0.getString(r4, r9)
            java.util.Map r2 = r1.A07(r0)
            r2.remove(r8)
            android.content.SharedPreferences r0 = r1.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = X.C18300wT.A00(r2)
            android.content.SharedPreferences$Editor r0 = r1.putString(r4, r0)
            r0.apply()
            X.0wU r0 = r3.A04
            X.1HQ r0 = r0.A0H
            X.1Nw r4 = r0.A01
            java.lang.String r3 = r8.getRawString()
            monitor-enter(r4)
            if (r7 == 0) goto L_0x01ac
            X.1Nx r2 = r4.A01     // Catch:{ all -> 0x01a9 }
            X.2Is r1 = r2.A00()     // Catch:{ all -> 0x01a9 }
            java.util.Set r0 = r1.A0E     // Catch:{ all -> 0x01a9 }
            r0.add(r3)     // Catch:{ all -> 0x01a9 }
            r2.A01(r1)     // Catch:{ all -> 0x01a9 }
            goto L_0x01ac
        L_0x01a9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01ac:
            monitor-exit(r4)
        L_0x01ad:
            X.17f r0 = r6.A05
            X.0ug r0 = r0.A03
            r0.A0E(r5)
            return
        L_0x01b5:
            java.lang.Object r5 = r13.A01
            X.121 r5 = (X.AnonymousClass121) r5
            java.lang.Object r3 = r13.A02
            X.0sH r3 = (X.C16010sH) r3
            int r6 = r13.A00
            java.lang.Object r4 = r13.A03
            X.0rv r4 = (X.C15830rv) r4
            r8 = 1
            int r2 = r3.A04
            r1 = 0
            if (r2 == r6) goto L_0x01ca
            r2 = 0
        L_0x01ca:
            int r0 = r3.A05
            if (r0 != r6) goto L_0x01cf
            r1 = r0
        L_0x01cf:
            X.12A r0 = r5.A0A
            r0.A01(r3, r2, r1)
            X.0vc r2 = r5.A0O
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r3.A08(r0)
            X.1ui r0 = r2.A01
            r0.A01(r1)
            X.1ui r0 = r2.A02
            r0.A01(r1)
            X.0pt r0 = r5.A03
            r7 = 5
            com.facebook.redex.RunnableRunnableShape0S0311000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0311000_I0
            r2.<init>((X.C16010sH) r3, (X.C15830rv) r4, (X.AnonymousClass121) r5, (int) r6, (int) r7, (boolean) r8)
            r0.A0K(r2)
            return
        L_0x01f2:
            java.lang.Object r2 = r13.A01
            X.1RU r2 = (X.AnonymousClass1RU) r2
            java.lang.Object r3 = r13.A02
            X.0tZ r3 = (X.C16740tZ) r3
            int r1 = r13.A00
            byte r5 = (byte) r1
            java.lang.Object r4 = r13.A03
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            boolean r7 = r13.A04
            r2.A01(r3, r5)
            r6 = 1
            r2.A03(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0311000_I0.run():void");
    }
}
