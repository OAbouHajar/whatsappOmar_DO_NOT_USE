package com.facebook.redex;

import X.AnonymousClass291;

public class RunnableRunnableShape10S0100000_I0_9 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape10S0100000_I0_9(AnonymousClass291 r1, int i2) {
        this.A01 = i2;
        switch (i2) {
            case 17:
            case 18:
            case 19:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    public RunnableRunnableShape10S0100000_I0_9(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v18, types: [int] */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: type inference failed for: r3v33 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:271:0x06f5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:362:0x0983 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:367:0x0988 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:372:0x098d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:362:0x0983=Splitter:B:362:0x0983, B:187:0x052f=Splitter:B:187:0x052f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r0 = 0
            r3 = 0
            r7 = r28
            int r1 = r7.A01
            switch(r1) {
                case 0: goto L_0x0920;
                case 1: goto L_0x0911;
                case 2: goto L_0x08f3;
                case 3: goto L_0x08e7;
                case 4: goto L_0x08d5;
                case 5: goto L_0x0831;
                case 6: goto L_0x056c;
                case 7: goto L_0x0817;
                case 8: goto L_0x07fc;
                case 9: goto L_0x053e;
                case 10: goto L_0x07e9;
                case 11: goto L_0x07e1;
                case 12: goto L_0x0477;
                case 13: goto L_0x001c;
                case 14: goto L_0x07d9;
                case 15: goto L_0x0420;
                case 16: goto L_0x0402;
                case 17: goto L_0x02d1;
                case 18: goto L_0x07ac;
                case 19: goto L_0x07a4;
                case 20: goto L_0x0784;
                case 21: goto L_0x076b;
                case 22: goto L_0x0761;
                case 23: goto L_0x0759;
                case 24: goto L_0x027b;
                case 25: goto L_0x0751;
                case 26: goto L_0x0749;
                case 27: goto L_0x073f;
                case 28: goto L_0x0735;
                case 29: goto L_0x0261;
                case 30: goto L_0x0009;
                case 31: goto L_0x071d;
                case 32: goto L_0x0247;
                case 33: goto L_0x0711;
                case 34: goto L_0x0705;
                case 35: goto L_0x066f;
                case 36: goto L_0x0009;
                case 37: goto L_0x0663;
                case 38: goto L_0x064a;
                case 39: goto L_0x0636;
                case 40: goto L_0x0047;
                case 41: goto L_0x0627;
                case 42: goto L_0x05e6;
                case 43: goto L_0x05de;
                case 44: goto L_0x05d5;
                case 45: goto L_0x0034;
                case 46: goto L_0x05ca;
                case 47: goto L_0x05c0;
                case 48: goto L_0x0589;
                case 49: goto L_0x001d;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r7.A00
            X.1qc r2 = (X.C38331qc) r2
            r0 = 8
            X.1et r1 = new X.1et
            r1.<init>(r0)
            X.1cu r0 = new X.1cu
            r0.<init>()
            r2.AQ4(r1, r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r2 = r7.A00
            X.1bo r2 = (X.C30141bo) r2
            android.graphics.Bitmap r1 = r2.A04
            r2.A03 = r1
            r2.A01 = r0
            X.29E r0 = r2.A0V
            r0.A00()
            X.1bp r0 = r2.A0A
            if (r0 == 0) goto L_0x001c
            r0.A01()
            return
        L_0x0034:
            java.lang.Object r1 = r7.A00
            X.29F r1 = (X.AnonymousClass29F) r1
            X.29I r0 = r1.A02
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x001c
            X.29I r1 = r1.A02
            r0 = 1
            r1.A00(r0)
            return
        L_0x0047:
            java.lang.Object r5 = r7.A00
            com.obwhatsapp.mediacomposer.MediaComposerActivity r5 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r5
            boolean r1 = r5.A1K
            if (r1 == 0) goto L_0x001c
            boolean r1 = r5.A1A
            if (r1 == 0) goto L_0x001c
            X.29P r1 = r5.A0l
            X.027 r1 = r1.A01
            java.lang.Object r1 = r1.A01()
            java.util.List r1 = (java.util.List) r1
            boolean r4 = X.C16030sJ.A0S(r1)
            X.29P r1 = r5.A0l
            X.027 r1 = r1.A01
            java.lang.Object r1 = r1.A01()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r1.iterator()
        L_0x006f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0082
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            boolean r1 = X.C16030sJ.A0Q(r1)
            if (r1 != 0) goto L_0x006f
            r3 = 1
        L_0x0082:
            java.util.List r1 = r5.A39()
            java.util.Iterator r16 = r1.iterator()
        L_0x008a:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x001c
            java.lang.Object r2 = r16.next()
            android.net.Uri r2 = (android.net.Uri) r2
            X.29Q r1 = r5.A1S
            X.20I r6 = r1.A00(r2)
            X.0vv r1 = r5.A0i
            byte r2 = r1.A01(r6)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            r6.A0C(r1)
            r1 = 1
            if (r2 == r1) goto L_0x00b0
            r1 = 42
            if (r2 != r1) goto L_0x008a
        L_0x00b0:
            java.io.File r1 = r6.A05()
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            X.AnonymousClass1A9.A0Q(r1, r6)
            android.net.Uri r2 = r1.build()
            X.0wL r1 = r5.A0j
            java.lang.Byte r6 = r6.A06()
            X.AnonymousClass00B.A06(r6)
            byte r7 = r6.byteValue()
            r6 = 1
            X.1XJ r8 = new X.1XJ
            r8.<init>(r6, r4, r3)
            X.14o r6 = r1.A0C
            r18 = 0
            X.1XN r19 = r6.A00(r7, r4)
            X.1XK r21 = X.C31831f6.A01(r7, r0)
            r7 = 1
            r23 = r18
            r24 = 0
            r26 = 1
            r27 = 1
            r22 = r18
            r25 = r4
            r17 = r2
            r20 = r8
            X.1XL r10 = X.AnonymousClass1XL.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.0wK r8 = r1.A08
            X.1OJ r11 = r8.A0J
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            X.1f1 r9 = r11.A01(r6, r0)
            X.0sq r6 = r8.A0Q
            X.1zh r8 = new X.1zh
            r8.<init>(r9, r11, r6, r7)
            monitor-enter(r8)
            r8.A09 = r7     // Catch:{ all -> 0x0995 }
            monitor-exit(r8)
            X.1qS r6 = r10.A00
            X.1XK r7 = r6.A05
            boolean r6 = r6.A0A
            if (r6 == 0) goto L_0x0240
            X.1zi r6 = new X.1zi
            r6.<init>(r7)
        L_0x011f:
            X.1XP r11 = new X.1XP
            r11.<init>(r6, r9, r8, r10)
            X.1f1 r8 = r11.A0J
            X.AnonymousClass00B.A06(r8)
            java.lang.String r12 = r8.A0D
            X.1XS r6 = r11.A09
            r6.A04(r12)
            X.1Rp r10 = r1.A0B
            X.210 r7 = r11.A01()
            X.0t9 r6 = r10.A01
            X.211 r9 = new X.211
            r9.<init>(r6)
            X.AnonymousClass00B.A06(r8)
            X.212 r8 = r9.A03
            java.util.UUID r6 = java.util.UUID.fromString(r12)
            long r14 = r6.getMostSignificantBits()
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = r14 & r12
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r8.A0D = r6
            X.213 r8 = new X.213
            r8.<init>(r9)
            X.1XK r13 = r7.A05
            X.1XK r12 = X.AnonymousClass1XK.A0B
            if (r13 == r12) goto L_0x01ec
            X.1XK r6 = X.AnonymousClass1XK.A0Z
            if (r13 == r6) goto L_0x01ec
            X.1XK r6 = X.AnonymousClass1XK.A0G
            if (r13 == r6) goto L_0x01ec
            X.1XK r6 = X.AnonymousClass1XK.A0R
            if (r13 == r6) goto L_0x01ec
            X.1XK r6 = X.AnonymousClass1XK.A06
            if (r13 == r6) goto L_0x01ec
            X.1XK r6 = X.AnonymousClass1XK.A07
            if (r13 == r6) goto L_0x01ec
            X.1XK r12 = X.AnonymousClass1XK.A0S
            if (r13 != r12) goto L_0x008a
            java.io.File r6 = r7.A07
            r24 = r6
            java.lang.String r6 = r7.A0B
            r26 = r6
            java.lang.String r6 = r7.A09
            r19 = r6
            X.1XO r6 = r7.A06
            r18 = r6
            X.214 r6 = r8.A07
            r17 = r6
            X.215 r13 = r8.A06
            X.216 r6 = r8.A05
            java.io.File r14 = r7.A00()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            r15.append(r7)
            java.lang.String r7 = ".webp"
            r15.append(r7)
            java.lang.String r7 = r15.toString()
            java.io.File r25 = r10.A01(r14, r7)
            X.205 r7 = new X.205
            r20 = r6
            r21 = r13
            r22 = r17
            r23 = r18
            r27 = r19
            r17 = r7
            r18 = r9
            r19 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.1Ra r6 = r10.A05
            r6.A01(r7, r12)
        L_0x01cc:
            X.1zh r7 = r11.A0K
            X.AnonymousClass00B.A06(r7)
            X.211 r6 = r8.A00
            r7.A05(r6)
            r1.A0A(r11, r8)
            com.facebook.redex.IDxNConsumerShape40S0200000_2_I1 r7 = new com.facebook.redex.IDxNConsumerShape40S0200000_2_I1
            r7.<init>(r1, r0, r11)
            java.util.concurrent.Executor r6 = r1.A0K
            X.1XS r1 = r11.A0A
            r1.A03(r7, r6)
            java.util.Map r1 = r5.A1Y
            r1.put(r2, r11)
            goto L_0x008a
        L_0x01ec:
            java.lang.String r6 = r7.A0B
            r18 = r6
            X.AnonymousClass00B.A06(r18)
            X.214 r6 = r8.A07
            r17 = r6
            r21 = 0
            X.216 r15 = r8.A05
            java.io.File r14 = r7.A00()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            r13.append(r6)
            java.lang.String r6 = ".jpg"
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            java.io.File r24 = r10.A01(r14, r6)
            X.1XN r13 = r7.A04
            X.AnonymousClass00B.A06(r13)
            boolean r7 = r7.A0D
            X.203 r6 = new X.203
            r26 = 0
            r20 = r15
            r22 = r13
            r23 = r17
            r25 = r18
            r27 = r7
            r17 = r6
            r18 = r9
            r19 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.1Ra r7 = r10.A05
            r7.A01(r6, r12)
            goto L_0x01cc
        L_0x0240:
            X.1zj r6 = new X.1zj
            r6.<init>(r7)
            goto L_0x011f
        L_0x0247:
            java.lang.Object r0 = r7.A00
            X.0xv r0 = (X.C19200xv) r0
            boolean r2 = r0.A00
            if (r2 == 0) goto L_0x001c
            java.lang.String r1 = "mediaautodownload/timeout getting offline complete marker "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0261:
            java.lang.Object r0 = r7.A00
            X.12W r0 = (X.AnonymousClass12W) r0
            java.util.List r0 = r0.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x026b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r1.next()
            X.29R r0 = (X.AnonymousClass29R) r0
            r0.AXc()
            goto L_0x026b
        L_0x027b:
            java.lang.Object r2 = r7.A00
            X.29S r2 = (X.AnonymousClass29S) r2
            r6 = 1
            r2.A0t = r6
            android.location.Location r1 = r2.A06
            if (r1 == 0) goto L_0x029c
            X.1li r0 = r2.A0h
            if (r0 != 0) goto L_0x029c
            float r0 = r1.getAccuracy()
            int r1 = (int) r0
            r0 = 100
            int r5 = java.lang.Math.max(r1, r0)
            android.location.Location r3 = r2.A06
            r4 = 0
            r7 = 1
            r2.A0L(r3, r4, r5, r6, r7)
        L_0x029c:
            X.0sj r0 = r2.A1C
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001c
            android.location.Location r0 = r2.A06
            if (r0 == 0) goto L_0x02b2
            float r1 = r0.getAccuracy()
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
        L_0x02b2:
            X.01V r0 = r2.A19
            android.location.LocationManager r1 = r0.A0F()
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 == 0) goto L_0x02ca
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x001c
        L_0x02ca:
            X.00k r1 = r2.A0Y
            r0 = 2
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x02d1:
            java.lang.Object r7 = r7.A00
            X.291 r7 = (X.AnonymousClass291) r7
            boolean r0 = r7.A1V
            android.os.Handler r3 = r7.A0v
            java.lang.Runnable r2 = r7.A1O
            if (r0 == 0) goto L_0x02e3
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x02e3:
            r3.removeCallbacks(r2)
            java.util.Map r2 = r7.A1T
            monitor-enter(r2)
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x0958 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0958 }
            r1.<init>(r0)     // Catch:{ all -> 0x0958 }
            r2.clear()     // Catch:{ all -> 0x0958 }
            monitor-exit(r2)     // Catch:{ all -> 0x0958 }
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001c
            X.29U r6 = r7.A09()
            if (r6 == 0) goto L_0x001c
            X.29V r5 = r7.A0k
            java.util.List r9 = r7.A1R
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Iterator r15 = r1.iterator()
        L_0x030f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x093b
            java.lang.Object r10 = r15.next()
            X.1sx r10 = (X.C39721sx) r10
            java.util.Iterator r3 = r9.iterator()
        L_0x031f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03f9
            java.lang.Object r4 = r3.next()
            X.29W r4 = (X.AnonymousClass29W) r4
            java.util.List r11 = r4.A04
            java.util.Iterator r2 = r11.iterator()
        L_0x0331:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x031f
            java.lang.Object r0 = r2.next()
            X.1sx r0 = (X.C39721sx) r0
            com.whatsapp.jid.UserJid r1 = r0.A06
            com.whatsapp.jid.UserJid r0 = r10.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0331
            int r0 = r4.A00
            r3 = 1
            if (r0 == r3) goto L_0x03fd
            X.1GE r2 = r5.A02
            long r0 = r10.A05
            X.0t3 r2 = r2.A04
            long r12 = r2.A00()
            long r12 = r12 - r0
            r1 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x0360
            r1 = 1
        L_0x0360:
            int r0 = r4.A01
            if (r0 == r3) goto L_0x0365
            r3 = 0
        L_0x0365:
            if (r1 != r3) goto L_0x03f9
            int r1 = r11.size()
            r0 = 1
            if (r1 == r0) goto L_0x03a9
            double r2 = r10.A00
            double r0 = r10.A01
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            r10.<init>(r2, r0)
            android.graphics.Point r14 = r6.A00(r10)
            com.google.android.gms.maps.model.LatLng r0 = r4.A00()
            android.graphics.Point r13 = r6.A00(r0)
            int r1 = r14.x
            int r0 = r13.x
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            double r2 = (double) r0
            float r0 = r5.A00
            double r0 = (double) r0
            r11 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r11
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x03f9
            int r1 = r14.y
            int r0 = r13.y
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            double r2 = (double) r0
            float r0 = r5.A01
            double r0 = (double) r0
            double r0 = r0 * r11
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x03f9
        L_0x03a9:
            com.google.android.gms.maps.model.LatLng r0 = r4.A00()
            android.graphics.Point r2 = r6.A00(r0)
            java.util.Iterator r11 = r9.iterator()
        L_0x03b5:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03fd
            java.lang.Object r10 = r11.next()
            X.29W r10 = (X.AnonymousClass29W) r10
            if (r10 == r4) goto L_0x03b5
            java.util.List r0 = r10.A04
            int r3 = r0.size()
            r0 = 2
            r1 = 1
            if (r3 > r0) goto L_0x03d1
            int r0 = r10.A00
            if (r1 == r0) goto L_0x03b5
        L_0x03d1:
            com.google.android.gms.maps.model.LatLng r0 = r10.A00()
            android.graphics.Point r3 = r6.A00(r0)
            int r1 = r3.x
            int r0 = r2.x
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            float r1 = (float) r0
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b5
            int r1 = r3.y
            int r0 = r2.y
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            float r1 = (float) r0
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x03b5
        L_0x03f9:
            r7.A0H()
            return
        L_0x03fd:
            r8.add(r4)
            goto L_0x030f
        L_0x0402:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.location.GroupChatLiveLocationsActivity2 r2 = (com.obwhatsapp.location.GroupChatLiveLocationsActivity2) r2
            boolean r0 = r2.A0X
            if (r0 != 0) goto L_0x001c
            X.2NT r0 = r2.A06
            if (r0 == 0) goto L_0x001c
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001c
            X.2NT r0 = r2.A06
            r0.A04()
            return
        L_0x0420:
            java.lang.Object r0 = r7.A00
            X.1OI r0 = (X.AnonymousClass1OI) r0
            X.17e r3 = r0.A04
            X.0rs r0 = r3.A01
            java.util.List r1 = r0.A06()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001c
            X.2NV r2 = new X.2NV
            r2.<init>()
            X.0rz r0 = r3.A03
            boolean r0 = r0.A1c()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            java.util.Iterator r9 = r1.iterator()
            r8 = 0
            r7 = 0
            r6 = 0
            r4 = 0
        L_0x044d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x095b
            java.lang.Object r5 = r9.next()
            X.0rv r5 = (X.C15830rv) r5
            X.0rt r0 = r3.A04
            int r0 = r0.A00(r5)
            r1 = 0
            if (r0 <= 0) goto L_0x0463
            r1 = 1
        L_0x0463:
            com.whatsapp.jid.GroupJid r0 = com.whatsapp.jid.GroupJid.of(r5)
            if (r0 == 0) goto L_0x0470
            int r8 = r8 + 1
            if (r1 == 0) goto L_0x044d
            int r6 = r6 + 1
            goto L_0x044d
        L_0x0470:
            int r7 = r7 + 1
            if (r1 == 0) goto L_0x044d
            int r4 = r4 + 1
            goto L_0x044d
        L_0x0477:
            java.lang.Object r1 = r7.A00
            X.2Qg r1 = (X.C49002Qg) r1
            com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob r1 = r1.A00
            X.11s r2 = r1.A01
            byte[] r1 = r1.id
            int r4 = X.C28641Wx.A01(r1)
            X.0xT r1 = r2.A0I
            java.util.concurrent.locks.Lock r7 = r1.A01()
            if (r7 != 0) goto L_0x0493
            X.16P r1 = r2.A0H     // Catch:{ all -> 0x098e }
            r1.A00()     // Catch:{ all -> 0x098e }
            goto L_0x0496
        L_0x0493:
            r7.lock()     // Catch:{ all -> 0x098e }
        L_0x0496:
            X.1eu r6 = r2.A0C     // Catch:{ all -> 0x098e }
            r5 = 5
            java.lang.String[] r12 = new java.lang.String[r5]     // Catch:{ all -> 0x098e }
        L_0x049b:
            int r2 = r4 - r3
            if (r2 >= 0) goto L_0x04a2
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            int r2 = r2 + r1
        L_0x04a2:
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x098e }
            r12[r3] = r1     // Catch:{ all -> 0x098e }
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x049b
            X.01d r1 = r6.A01     // Catch:{ all -> 0x098e }
            X.0tf r3 = r1.A02()     // Catch:{ all -> 0x098e }
            X.1cj r6 = r3.A00()     // Catch:{ all -> 0x0989 }
            X.0tg r8 = r3.A02     // Catch:{ all -> 0x0984 }
            java.lang.String r9 = "signed_prekeys"
            r1 = 1
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x0984 }
            java.lang.String r1 = "COUNT(1) as count"
            r10[r0] = r1     // Catch:{ all -> 0x0984 }
            java.lang.String r11 = "prekey_id IN (?,?,?,?,?)"
            r13 = 0
            r15 = r13
            r14 = r13
            android.database.Cursor r5 = r8.A09(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0984 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x097d }
            if (r0 != 0) goto L_0x04e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x097d }
            r1.<init>()     // Catch:{ all -> 0x097d }
            java.lang.String r0 = "failed to query a count while trying to delete old signed prekey records; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x097d }
            r1.append(r4)     // Catch:{ all -> 0x097d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x097d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x097d }
            goto L_0x052f
        L_0x04e6:
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x097d }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x097d }
            if (r0 != 0) goto L_0x0508
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x097d }
            r1.<init>()     // Catch:{ all -> 0x097d }
            java.lang.String r0 = "there would be zero signed prekeys left if this delete old signed prekey records command were executed; aborting; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x097d }
            r1.append(r4)     // Catch:{ all -> 0x097d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x097d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x097d }
            goto L_0x052f
        L_0x0508:
            java.lang.String r0 = "prekey_id NOT IN (?,?,?,?,?)"
            int r2 = r8.A01(r9, r0, r12)     // Catch:{ all -> 0x097d }
            if (r2 == 0) goto L_0x052c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x097d }
            r1.<init>()     // Catch:{ all -> 0x097d }
            java.lang.String r0 = "deleted "
            r1.append(r0)     // Catch:{ all -> 0x097d }
            r1.append(r2)     // Catch:{ all -> 0x097d }
            java.lang.String r0 = " old signed prekey records; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x097d }
            r1.append(r4)     // Catch:{ all -> 0x097d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x097d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x097d }
        L_0x052c:
            r6.A00()     // Catch:{ all -> 0x097d }
        L_0x052f:
            r5.close()     // Catch:{ all -> 0x0984 }
            r6.close()     // Catch:{ all -> 0x0989 }
            r3.close()     // Catch:{ all -> 0x098e }
            if (r7 == 0) goto L_0x001c
            r7.unlock()
            return
        L_0x053e:
            java.lang.Object r1 = r7.A00
            X.11B r1 = (X.AnonymousClass11B) r1
            X.119 r0 = r1.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x001c
            X.118 r0 = r1.A05
            java.lang.Iterable r0 = r0.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x0554:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r1 = r2.next()
            X.1V3 r1 = (X.AnonymousClass1V3) r1
            boolean r0 = r1 instanceof X.AnonymousClass1V4
            if (r0 == 0) goto L_0x0554
            X.1V4 r1 = (X.AnonymousClass1V4) r1
            X.10Z r0 = r1.A00
            r0.A01(r3)
            goto L_0x0554
        L_0x056c:
            java.lang.Object r3 = r7.A00
            X.0yu r3 = (X.C19730yu) r3
            X.0vy r2 = r3.A11
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.A00(r0)
            X.0yE r0 = r3.A0U
            android.net.NetworkInfo r0 = r0.A01()
            X.1UW r0 = X.C19330yG.A00(r0)
            if (r0 == 0) goto L_0x001c
            r2.A01(r0)
            return
        L_0x0589:
            java.lang.Object r4 = r7.A00
            com.obwhatsapp.mediacomposer.doodle.DoodleView r4 = (com.obwhatsapp.mediacomposer.doodle.DoodleView) r4
            X.29k r2 = r4.A0J
            java.util.List r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0595:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05ac
            java.lang.Object r0 = r1.next()
            X.29l r0 = (X.C455829l) r0
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0595
            X.29m r0 = r4.A0G
            r0.A01()
        L_0x05ac:
            boolean r0 = r2.A06()
            android.os.Handler r3 = r4.A0F
            java.lang.Runnable r2 = r4.A0K
            if (r0 == 0) goto L_0x05bc
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x05bc:
            r3.removeCallbacks(r2)
            return
        L_0x05c0:
            java.lang.Object r1 = r7.A00
            X.29n r1 = (X.C456029n) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.A06
            r1.setVisibility(r0)
            return
        L_0x05ca:
            java.lang.Object r0 = r7.A00
            X.29n r0 = (X.C456029n) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.A06
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x05d5:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x05de:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r0)
            return
        L_0x05e6:
            java.lang.Object r8 = r7.A00
            com.obwhatsapp.mediacomposer.VideoComposerFragment r8 = (com.obwhatsapp.mediacomposer.VideoComposerFragment) r8
            X.29D r0 = r8.A0M
            int r0 = r0.A03()
            long r5 = (long) r0
            long r3 = r8.A03
            r1 = 50
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0618
            boolean r0 = r8.A0Q
            if (r0 != 0) goto L_0x0609
            r8.A1I()
        L_0x0600:
            X.29D r3 = r8.A0M
            long r1 = r8.A02
            int r0 = (int) r1
            r3.A0A(r0)
            return
        L_0x0609:
            com.obwhatsapp.mediacomposer.VideoTimelineView r0 = r8.A0I
            r0.invalidate()
            X.29D r0 = r8.A0M
            android.view.View r0 = r0.A06()
            r0.postDelayed(r7, r1)
            goto L_0x0600
        L_0x0618:
            com.obwhatsapp.mediacomposer.VideoTimelineView r0 = r8.A0I
            r0.invalidate()
            X.29D r0 = r8.A0M
            android.view.View r0 = r0.A06()
            r0.postDelayed(r7, r1)
            return
        L_0x0627:
            java.lang.Object r2 = r7.A00
            X.00k r2 = (X.C000900k) r2
            r1 = 2131365554(0x7f0a0eb2, float:1.8350977E38)
            android.view.View r1 = r2.findViewById(r1)
            r1.setVisibility(r0)
            return
        L_0x0636:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.mediacomposer.MediaComposerActivity r2 = (com.obwhatsapp.mediacomposer.MediaComposerActivity) r2
            X.29w r0 = r2.A0o
            X.29n r0 = r0.A08
            X.29y r1 = r0.A02
            r0 = 1
            r1.A00 = r0
            r1.A01()
            r0 = 0
            r2.A19 = r0
            return
        L_0x064a:
            java.lang.Object r0 = r7.A00
            X.1er r0 = (X.C31681er) r0
            X.29z r3 = r0.A0b
            X.2A0 r2 = r0.A02
            X.AnonymousClass00B.A06(r2)
            X.1qJ r1 = r0.A01
            X.AnonymousClass00B.A06(r1)
            X.2A1 r0 = new X.2A1
            r0.<init>(r3, r2)
            r1.A00(r0)
            return
        L_0x0663:
            java.lang.Object r0 = r7.A00
            X.1zh r0 = (X.C43251zh) r0
            X.1OJ r1 = r0.A0G
            X.1f1 r0 = r0.A0F
            r1.A03(r0)
            return
        L_0x066f:
            java.lang.Object r8 = r7.A00
            X.1co r8 = (X.C30701co) r8
            X.1cs r9 = r8.A0c
            X.1ct r9 = (X.C30751ct) r9
            long r6 = r9.A00
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0683
            long r6 = r9.A03()
        L_0x0683:
            java.lang.Long r5 = r9.A0H
            if (r5 != 0) goto L_0x0697
            r0 = 0
        L_0x0689:
            X.0zY r5 = r8.A0W
            X.1qT r2 = r8.A0a
            java.lang.String r13 = r2.A0E
            X.0t3 r2 = r8.A0M
            long r11 = r2.A00()
            monitor-enter(r5)
            goto L_0x06ae
        L_0x0697:
            long r0 = r9.A01
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x06a8
            java.lang.Long r0 = r9.A04()
            long r0 = r0.longValue()
            goto L_0x0689
        L_0x06a8:
            long r2 = r5.longValue()
            long r0 = r0 - r2
            goto L_0x0689
        L_0x06ae:
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x0702 }
            X.0t3 r9 = r5.A00     // Catch:{ all -> 0x0702 }
            r9.A00()     // Catch:{ all -> 0x0702 }
            X.0tc r2 = r5.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x06fb, Error | RuntimeException -> 0x06f6 }
            X.0tf r8 = r2.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x06fb, Error | RuntimeException -> 0x06f6 }
            X.0tg r4 = r8.A02     // Catch:{ all -> 0x06f1 }
            java.lang.String r3 = "express_path_download_data"
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x06f1 }
            r2.<init>()     // Catch:{ all -> 0x06f1 }
            java.lang.String r10 = "enc_file_hash"
            r2.put(r10, r13)     // Catch:{ all -> 0x06f1 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06f1 }
            java.lang.String r0 = "ep_saved_time_ms"
            r2.put(r0, r1)     // Catch:{ all -> 0x06f1 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x06f1 }
            java.lang.String r0 = "ep_saved_bytes"
            r2.put(r0, r1)     // Catch:{ all -> 0x06f1 }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x06f1 }
            java.lang.String r0 = "last_update_time"
            r2.put(r0, r1)     // Catch:{ all -> 0x06f1 }
            r0 = 4
            r4.A06(r2, r3, r0)     // Catch:{ all -> 0x06f1 }
            r9.A00()     // Catch:{ all -> 0x06f1 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x06fb, Error | RuntimeException -> 0x06f6 }
            monitor-exit(r5)
            return
        L_0x06f1:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x06f5 }
        L_0x06f5:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x06fb, Error | RuntimeException -> 0x06f6 }
        L_0x06f6:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0702 }
            goto L_0x0701
        L_0x06fb:
            r1 = move-exception
            java.lang.String r0 = "expresspathdownloaddb/insert"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0702 }
        L_0x0701:
            throw r1     // Catch:{ all -> 0x0702 }
        L_0x0702:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0705:
            java.lang.Object r0 = r7.A00
            X.1co r0 = (X.C30701co) r0
            X.1OJ r1 = r0.A0X
            X.1f1 r0 = r0.A01
            r1.A04(r0)
            return
        L_0x0711:
            java.lang.Object r0 = r7.A00
            X.1co r0 = (X.C30701co) r0
            X.1OJ r1 = r0.A0X
            X.1f1 r0 = r0.A01
            r1.A03(r0)
            return
        L_0x071d:
            java.lang.Object r3 = r7.A00
            X.0xv r3 = (X.C19200xv) r3
            X.0wP r1 = r3.A03
            r0 = 1
            int r2 = r1.A04(r0)
            X.12c r0 = r3.A07
            X.2A3 r1 = new X.2A3
            r1.<init>(r3, r2)
            X.14k r0 = r0.A0Y
            r0.A02(r1)
            return
        L_0x0735:
            java.lang.Object r1 = r7.A00
            com.obwhatsapp.location.LocationSharingService r1 = (com.obwhatsapp.location.LocationSharingService) r1
            r1.A0I = r0
            r1.A02()
            return
        L_0x073f:
            java.lang.Object r1 = r7.A00
            com.obwhatsapp.location.LocationSharingService r1 = (com.obwhatsapp.location.LocationSharingService) r1
            r1.A0H = r0
            r1.A02()
            return
        L_0x0749:
            java.lang.Object r0 = r7.A00
            X.0yQ r0 = (X.C19430yQ) r0
            r0.A0J()
            return
        L_0x0751:
            java.lang.Object r0 = r7.A00
            X.0yQ r0 = (X.C19430yQ) r0
            r0.A0E()
            return
        L_0x0759:
            java.lang.Object r0 = r7.A00
            X.29S r0 = (X.AnonymousClass29S) r0
            r0.A08()
            return
        L_0x0761:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.location.LiveLocationPrivacyActivity r0 = (com.obwhatsapp.location.LiveLocationPrivacyActivity) r0
            X.0yQ r0 = r0.A0D
            r0.A0C()
            return
        L_0x076b:
            java.lang.Object r2 = r7.A00
            X.2A5 r2 = (X.AnonymousClass2A5) r2
            X.29I r1 = r2.A06
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x077b
            r0 = 1
            r1.A00(r0)
        L_0x077b:
            android.widget.ImageButton r1 = r2.A03
            r0 = 2131231383(0x7f080297, float:1.8078845E38)
            r1.setImageResource(r0)
            return
        L_0x0784:
            java.lang.Object r5 = r7.A00
            X.291 r5 = (X.AnonymousClass291) r5
            X.0rv r0 = r5.A0c
            X.2A6 r4 = new X.2A6
            r4.<init>(r7, r0)
            android.os.Handler r3 = r5.A0v
            java.lang.Runnable r2 = r5.A1N
            r3.removeCallbacks(r2)
            long r0 = r5.A0C
            r3.postDelayed(r2, r0)
            X.1Rw r0 = r5.A1M
            r0.A02(r4)
            r5.A0H()
            return
        L_0x07a4:
            java.lang.Object r0 = r7.A00
            X.291 r0 = (X.AnonymousClass291) r0
            r0.A0I()
            return
        L_0x07ac:
            java.lang.Object r6 = r7.A00
            X.291 r6 = (X.AnonymousClass291) r6
            r1 = 1
            r6.A1V = r1
            java.lang.String r1 = "group-chat-live-location-ui-update-locations"
            r6.A0X(r1)
            r6.A0I()
            java.util.List r5 = r6.A1Q
            X.0sK r4 = r6.A0z
            X.0sG r3 = r6.A15
            X.0sP r2 = r6.A18
            X.2A7 r1 = new X.2A7
            r1.<init>(r4, r3, r2)
            java.util.Collections.sort(r5, r1)
            r6.A0Y(r0)
            X.29c r1 = r6.A0h
            r1.A01()
            r6.A0K()
            r6.A1V = r0
            return
        L_0x07d9:
            java.lang.Object r0 = r7.A00
            X.0yx r0 = (X.C19760yx) r0
            r0.A05()
            return
        L_0x07e1:
            java.lang.Object r0 = r7.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x07e9:
            java.lang.Object r0 = r7.A00
            X.1V2 r0 = (X.AnonymousClass1V2) r0
            X.0tz r0 = r0.A01
            android.content.Context r0 = r0.A00
            android.content.ContentResolver r2 = r0.getContentResolver()
            android.net.Uri r1 = X.C48452Nj.A00
            r0 = 0
            r2.notifyChange(r1, r0)
            return
        L_0x07fc:
            java.lang.Object r0 = r7.A00
            X.0xw r0 = (X.C19210xw) r0
            X.2IC r4 = r0.A04
            r4.A00()
            X.0tz r0 = r4.A04
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "com.obwhatsapp.alarm.AVAILABLE_TIMEOUT"
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>(r0)
            java.lang.String r1 = X.AnonymousClass01S.A09
            r0 = 0
            r3.registerReceiver(r4, r2, r1, r0)
            return
        L_0x0817:
            java.lang.Object r2 = r7.A00
            X.0yu r2 = (X.C19730yu) r2
            X.0rt r6 = r2.A0m
            X.0sq r0 = r2.A1f
            X.0xk r5 = r2.A1G
            X.0ym r3 = r2.A0p
            X.0wY r4 = r2.A0v
            r7 = 3
            com.facebook.redex.RunnableRunnableShape0S0500000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0500000_I0     // Catch:{ all -> 0x082f }
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x082f }
            r0.Aco(r1)     // Catch:{ all -> 0x082f }
            return
        L_0x082f:
            r0 = move-exception
            throw r0
        L_0x0831:
            java.lang.Object r5 = r7.A00
            X.0yu r5 = (X.C19730yu) r5
            X.0xb r6 = r5.A0D
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.0y7 r2 = r5.A0G
            X.2Nk r1 = new X.2Nk
            r1.<init>(r2)
            r7.add(r1)
            X.2Nm r1 = new X.2Nm
            r1.<init>(r2)
            r7.add(r1)
            X.2Nn r1 = new X.2Nn
            r1.<init>(r2)
            r7.add(r1)
            X.0uP r2 = r5.A0W
            X.2No r1 = new X.2No
            r1.<init>(r2)
            r7.add(r1)
            X.0yB r2 = r5.A0K
            X.2Np r1 = new X.2Np
            r1.<init>(r2)
            r7.add(r1)
            X.0tK r4 = r5.A0E
            X.2Nq r1 = new X.2Nq
            r1.<init>(r4)
            r7.add(r1)
            X.0wP r2 = r5.A0T
            X.2Nr r1 = new X.2Nr
            r1.<init>(r2)
            r7.add(r1)
            X.2Ns r1 = new X.2Ns
            r1.<init>(r4)
            r7.add(r1)
            X.0tz r1 = r6.A02
            android.content.Context r5 = r1.A00
            r15 = 0
            r12 = 15
            X.2Nl[] r1 = new X.C48472Nl[r0]
            java.lang.Object[] r1 = r7.toArray(r1)
            java.util.List r11 = java.util.Arrays.asList(r1)
            X.2Nt r10 = new X.2Nt
            r10.<init>()
            X.0pd r7 = r6.A03
            r1 = 476(0x1dc, float:6.67E-43)
            X.0tM r4 = X.C16620tM.A02
            boolean r16 = r7.A0E(r4, r1)
            X.2Nu r2 = new X.2Nu
            r2.<init>(r6)
            r1 = 418(0x1a2, float:5.86E-43)
            boolean r1 = r7.A0E(r4, r1)
            if (r1 == 0) goto L_0x08c1
            r15 = 1
            r12 = 1
            r0 = 419(0x1a3, float:5.87E-43)
            int r0 = r7.A03(r4, r0)
            r1 = 420(0x1a4, float:5.89E-43)
            int r3 = r7.A03(r4, r1)
        L_0x08c1:
            if (r11 != 0) goto L_0x08c8
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
        L_0x08c8:
            X.1Xj r1 = new X.1Xj
            r7 = r1
            r8 = r5
            r9 = r2
            r13 = r0
            r14 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r6.A00 = r1
            return
        L_0x08d5:
            java.lang.Object r0 = r7.A00
            X.2Nv r0 = (X.C48552Nv) r0
            X.2Nw r2 = r0.A00
            X.11A r1 = r2.A09
            X.1ig r0 = r2.A08
            r1.A03(r0)
            r0 = 1
            r2.A04(r0)
            return
        L_0x08e7:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.inappsupport.ui.ContactUsActivity r2 = (com.obwhatsapp.inappsupport.ui.ContactUsActivity) r2
            X.1BZ r1 = r2.A06
            java.lang.String r0 = "information-collection-when-contact-support"
            r1.A00(r2, r0)
            return
        L_0x08f3:
            java.lang.Object r0 = r7.A00
            X.2Ny r0 = (X.C48572Ny) r0
            X.2Nz r3 = r0.A01
            r2 = -1
            java.lang.String r1 = "ChatSupportTicketManager/contactSupport/onError, errorCode="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1YD r0 = r3.A00
            r0.AOM(r2)
            return
        L_0x0911:
            java.lang.Object r1 = r7.A00
            X.2Nz r1 = (X.AnonymousClass2Nz) r1
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1YD r0 = r1.A00
            r0.AOL()
            return
        L_0x0920:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.inappbugreporting.InAppBugReportingActivity r2 = (com.obwhatsapp.inappbugreporting.InAppBugReportingActivity) r2
            X.1BZ r1 = r2.A0A
            if (r1 == 0) goto L_0x092e
            java.lang.String r0 = "information-collection-when-contact-support"
            r1.A00(r2, r0)
            return
        L_0x092e:
            java.lang.String r0 = "contextualHelpHandler"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x093b:
            java.util.Iterator r1 = r8.iterator()
        L_0x093f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x094f
            java.lang.Object r0 = r1.next()
            X.29W r0 = (X.AnonymousClass29W) r0
            r7.A0Q(r0)
            goto L_0x093f
        L_0x094f:
            r7.A0J()
            X.29c r0 = r7.A0h
            r0.A01()
            return
        L_0x0958:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0958 }
            throw r0
        L_0x095b:
            long r0 = (long) r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            long r0 = (long) r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
            long r0 = (long) r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A03 = r0
            long r0 = (long) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            X.0t9 r0 = r3.A05
            r0.A06(r2)
            return
        L_0x097d:
            r0 = move-exception
            if (r5 == 0) goto L_0x0983
            r5.close()     // Catch:{ all -> 0x0983 }
        L_0x0983:
            throw r0     // Catch:{ all -> 0x0984 }
        L_0x0984:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0988 }
        L_0x0988:
            throw r0     // Catch:{ all -> 0x0989 }
        L_0x0989:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x098d }
        L_0x098d:
            throw r0     // Catch:{ all -> 0x098e }
        L_0x098e:
            r0 = move-exception
            if (r7 == 0) goto L_0x0997
            r7.unlock()
            throw r0
        L_0x0995:
            r0 = move-exception
            monitor-exit(r8)
        L_0x0997:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape10S0100000_I0_9.run():void");
    }
}
