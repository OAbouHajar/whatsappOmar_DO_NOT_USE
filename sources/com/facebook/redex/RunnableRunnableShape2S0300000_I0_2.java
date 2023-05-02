package com.facebook.redex;

public class RunnableRunnableShape2S0300000_I0_2 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape2S0300000_I0_2(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0746, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0747, code lost:
        com.whatsapp.util.Log.e("voicenote/startvoicenote/startfailed", r1);
        r6.A0T(false, false);
        r5.Afg(com.obwhatsapp.R.string.str0862);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0756, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x091e, code lost:
        r0 = r5.A0F;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:320:0x0adb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r40 = this;
            r3 = r40
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0aee;
                case 1: goto L_0x05c2;
                case 2: goto L_0x056a;
                case 3: goto L_0x0955;
                case 4: goto L_0x093a;
                case 5: goto L_0x090c;
                case 6: goto L_0x08fa;
                case 7: goto L_0x08d4;
                case 8: goto L_0x051a;
                case 9: goto L_0x08b6;
                case 10: goto L_0x04e4;
                case 11: goto L_0x02cb;
                case 12: goto L_0x0889;
                case 13: goto L_0x0293;
                case 14: goto L_0x0872;
                case 15: goto L_0x0176;
                case 16: goto L_0x0139;
                case 17: goto L_0x00ee;
                case 18: goto L_0x0842;
                case 19: goto L_0x0092;
                case 20: goto L_0x0785;
                case 21: goto L_0x075e;
                case 22: goto L_0x006e;
                case 23: goto L_0x002b;
                case 24: goto L_0x06f5;
                case 25: goto L_0x0017;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r3.A00
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r2
            java.lang.Object r1 = r3.A01
            java.util.concurrent.Exchanger r1 = (java.util.concurrent.Exchanger) r1
            java.lang.Object r0 = r3.A02
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            r2.lambda$syncRunOnCameraThread$0(r1, r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r2 = r3.A00
            X.1ZK r2 = (X.AnonymousClass1ZK) r2
            java.lang.Object r1 = r3.A01
            X.1cz r1 = (X.C30811cz) r1
            java.lang.Object r0 = r3.A02
            X.5Qi r0 = (X.C109005Qi) r0
            r2.A0P = r1
            if (r0 == 0) goto L_0x0016
            r0.A5p()
            return
        L_0x002b:
            java.lang.Object r0 = r3.A00
            X.25e r0 = (X.C447025e) r0
            java.lang.Object r5 = r3.A01
            X.25Z r5 = (X.AnonymousClass25Z) r5
            java.lang.Object r4 = r3.A02
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            X.25S r0 = r0.A04
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0B
            r0.decrementAndGet()
            X.1Ld r2 = r5.A03
            X.0tZ r3 = r5.A01
            monitor-enter(r2)
            X.1Vw r0 = r3.A11     // Catch:{ all -> 0x0b28 }
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0b28 }
            if (r1 != 0) goto L_0x004d
        L_0x004b:
            java.lang.String r1 = "null"
        L_0x004d:
            java.util.HashMap r0 = r2.A05     // Catch:{ all -> 0x0b26 }
            r0.remove(r1)     // Catch:{ all -> 0x0b26 }
            if (r4 == 0) goto L_0x0059
            X.1kk r0 = r2.A02     // Catch:{ all -> 0x0b26 }
            r0.A03(r1, r4)     // Catch:{ all -> 0x0b26 }
        L_0x0059:
            monitor-exit(r2)
            java.lang.Object r2 = r5.A04
            android.view.View r1 = r5.A00
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0016
            X.25V r0 = r5.A02
            r0.AfV(r4, r1, r3)
            return
        L_0x006e:
            java.lang.Object r4 = r3.A00
            X.15O r4 = (X.AnonymousClass15O) r4
            java.lang.Object r5 = r3.A01
            java.lang.Object r6 = r3.A02
            X.0yi r0 = r4.A04
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0084
            boolean r0 = X.C41971wz.A08()
            if (r0 != 0) goto L_0x0016
        L_0x0084:
            r7 = 5
            java.util.concurrent.ExecutorService r0 = r4.A01
            r8 = 11
            com.facebook.redex.RunnableRunnableShape0S0301000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0301000_I0
            r3.<init>(r4, r5, r6, r7, r8)
            r0.submit(r3)
            return
        L_0x0092:
            java.lang.Object r0 = r3.A00
            X.1w2 r0 = (X.C41501w2) r0
            java.lang.Object r1 = r3.A01
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r7 = r3.A02
            java.io.File r7 = (java.io.File) r7
            java.lang.ref.WeakReference r0 = r0.A0C
            java.lang.Object r6 = r0.get()
            X.1w4 r6 = (X.C41521w4) r6
            r6.A09 = r1
            r6.A0A = r7
            X.3yZ r0 = r6.A05
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00cc
            int r0 = r6.A00
            X.4Iy r3 = new X.4Iy
            r3.<init>(r7, r0)
            com.facebook.redex.IDxConsumerShape208S0100000_1_I1 r0 = new com.facebook.redex.IDxConsumerShape208S0100000_1_I1
            r0.<init>(r6, r4)
            X.3yZ r2 = new X.3yZ
            r2.<init>(r0)
            r6.A05 = r2
            X.0sq r1 = r6.A0K
            X.4Iy[] r0 = new X.C84024Iy[r4]
            r0[r5] = r3
            r1.Ack(r2, r0)
        L_0x00cc:
            X.3yZ r0 = r6.A04
            if (r0 != 0) goto L_0x0016
            r0 = 192(0xc0, float:2.69E-43)
            X.4Iy r3 = new X.4Iy
            r3.<init>(r7, r0)
            r1 = 3
            com.facebook.redex.IDxConsumerShape210S0100000_2_I1 r0 = new com.facebook.redex.IDxConsumerShape210S0100000_2_I1
            r0.<init>(r6, r1)
            X.3yZ r2 = new X.3yZ
            r2.<init>(r0)
            r6.A04 = r2
            X.0sq r1 = r6.A0K
            X.4Iy[] r0 = new X.C84024Iy[r4]
            r0[r5] = r3
            r1.Ack(r2, r0)
            return
        L_0x00ee:
            java.lang.Object r0 = r3.A00
            X.1wb r0 = (X.C41751wb) r0
            java.lang.Object r6 = r3.A01
            java.lang.Object r5 = r3.A02
            X.1Xf r5 = (X.C28701Xf) r5
            com.obwhatsapp.storage.StorageUsageActivity r0 = r0.A00
            X.1YJ r4 = r0.A0G
            java.util.List r0 = r4.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0102:
            boolean r0 = r2.hasNext()
            r3 = -1
            if (r0 == 0) goto L_0x0016
            java.lang.Object r1 = r2.next()
            X.1Xg r1 = (X.C28711Xg) r1
            X.0rv r0 = r1.A01()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0102
            java.util.List r0 = r4.A05
            int r2 = r0.indexOf(r1)
            if (r2 == r3) goto L_0x0016
            java.util.List r0 = r4.A05
            java.lang.Object r1 = r0.get(r2)
            X.1Xg r1 = (X.C28711Xg) r1
            r1.A00 = r5
            java.util.List r0 = r4.A05
            r0.set(r2, r1)
            java.util.List r0 = r4.A05
            java.util.Collections.sort(r0)
            r4.A01()
            return
        L_0x0139:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.storage.StorageUsageActivity r0 = (com.obwhatsapp.storage.StorageUsageActivity) r0
            java.lang.Object r4 = r3.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r2 = r3.A02
            java.util.List r2 = (java.util.List) r2
            X.1YJ r3 = r0.A0G
            X.AnonymousClass00B.A06(r4)
            java.lang.String r1 = r0.A0L
            java.util.List r0 = r0.A0N
            r3.A05 = r4
            r3.A04 = r1
            r3.A06 = r0
            r0 = 1
            r3.A07 = r0
            if (r2 == 0) goto L_0x0b2b
            java.util.Iterator r2 = r2.iterator()
        L_0x015d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r3.A0E()
            int r1 = r1 + r0
            r3.A03(r1)
            goto L_0x015d
        L_0x0176:
            java.lang.Object r5 = r3.A00
            X.1Nh r5 = (X.C26331Nh) r5
            java.lang.Object r4 = r3.A01
            X.3sx r4 = (X.C75933sx) r4
            java.lang.Object r2 = r3.A02
            X.00F r2 = (X.AnonymousClass00F) r2
            X.0sK r0 = r5.A01
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0016
            X.0tq r0 = r5.A06
            r0.A04()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0016
            X.0sC r0 = r5.A0A
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0016
            r7 = 10000000(0x989680, double:4.9406565E-317)
            X.0pf r3 = r5.A04
            long r0 = r3.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0C = r0
            long r0 = r3.A04()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0D = r0
            long r0 = r3.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A05 = r0
            long r0 = r3.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A06 = r0
            X.0ww r0 = r5.A05
            java.lang.Long r0 = r0.A00()
            r4.A00 = r0
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r6 = new java.util.concurrent.atomic.AtomicBoolean
            r6.<init>(r0)
            X.4y4 r3 = new X.4y4
            r3.<init>(r4, r5, r6)
            X.1Hm r1 = r5.A07
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.A09
            r0.add(r3)
            r0 = 0
            r1.A02(r0, r6)
            X.0tz r0 = r5.A03
            android.content.Context r3 = r0.A00
            java.io.File r0 = r3.getFilesDir()
            java.io.File r1 = r0.getParentFile()
            r0 = 0
            long r0 = X.AnonymousClass1XI.A00(r0, r1)
            long r0 = r0 / r7
            long r0 = r0 * r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0B = r0
            java.io.File r1 = r3.getFilesDir()
            r0 = 0
            long r0 = X.AnonymousClass1XI.A00(r0, r1)
            long r0 = r0 / r7
            long r0 = r0 * r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0A = r0
            java.lang.String r0 = "ignore"
            java.io.File r0 = r3.getDatabasePath(r0)
            java.io.File r1 = r0.getParentFile()
            r0 = 0
            long r0 = X.AnonymousClass1XI.A00(r0, r1)
            long r0 = r0 / r7
            long r0 = r0 * r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A09 = r0
            java.io.File r1 = r3.getCacheDir()
            r0 = 0
            long r0 = X.AnonymousClass1XI.A00(r0, r1)
            long r0 = r0 / r7
            long r0 = r0 * r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A08 = r0
            X.0sc r3 = r5.A02
            X.01D r0 = r3.A03
            java.lang.Object r1 = r0.get()
            java.io.File r1 = (java.io.File) r1
            r0 = 0
            long r0 = X.AnonymousClass1XI.A00(r0, r1)
            long r0 = r0 / r7
            long r0 = r0 * r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A07 = r0
            X.0sb r0 = r5.A00
            X.1jH r0 = r0.A05()
            java.io.File r1 = r0.A0A
            r0 = 0
            X.C16180sb.A04(r1, r0)
            r0 = 0
            long r0 = X.AnonymousClass1XI.A00(r0, r1)
            long r0 = r0 / r7
            long r0 = r0 * r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A04 = r0
            java.io.File r1 = r3.A03()
            r0 = 0
            long r0 = X.AnonymousClass1XI.A00(r0, r1)
            long r0 = r0 / r7
            long r0 = r0 * r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A03 = r0
            java.io.File r1 = r3.A02()
            r0 = 0
            long r0 = X.AnonymousClass1XI.A00(r0, r1)
            long r0 = r0 / r7
            long r0 = r0 * r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A02 = r0
            X.0t9 r1 = r5.A09
            int r0 = r2.A03
            r1.A07(r4, r0)
            return
        L_0x0293:
            java.lang.Object r2 = r3.A00
            X.13k r2 = (X.C212613k) r2
            java.lang.Object r4 = r3.A01
            X.1jm r4 = (X.C34151jm) r4
            java.lang.Object r1 = r3.A02
            X.1z1 r1 = (X.AnonymousClass1z1) r1
            java.lang.String r5 = r4.A0D
            if (r5 == 0) goto L_0x0016
            X.1pf r0 = r2.A05
            java.lang.String r6 = r0.A00(r5)
            r8 = 0
            java.lang.String r7 = r4.A05
            X.1z2 r3 = new X.1z2
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A06(r3)
            if (r1 == 0) goto L_0x02bc
            java.lang.String r0 = r4.A0D
            r1.APS(r0)
        L_0x02bc:
            X.0pt r3 = r2.A01
            X.14W r2 = r2.A06
            r1 = 10
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r2, r1)
            r3.A0K(r0)
            return
        L_0x02cb:
            java.lang.Object r5 = r3.A00
            X.1L1 r5 = (X.AnonymousClass1L1) r5
            java.lang.Object r1 = r3.A01
            X.2Jf r1 = (X.C47502Jf) r1
            java.lang.Object r8 = r3.A02
            java.util.List r8 = (java.util.List) r8
            X.128 r0 = r5.A05
            com.whatsapp.jid.UserJid r12 = r1.A05
            java.util.List r7 = r0.A01(r12)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r6 = 0
        L_0x02e5:
            int r0 = r7.size()
            if (r6 >= r0) goto L_0x0308
            java.lang.Object r0 = r7.get(r6)
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            java.lang.String r3 = r0.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r7.get(r6)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r4.put(r3, r0)
            int r6 = r6 + 1
            goto L_0x02e5
        L_0x0308:
            java.util.Iterator r13 = r8.iterator()
        L_0x030c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r6 = r13.next()
            X.4PH r6 = (X.AnonymousClass4PH) r6
            boolean r0 = X.C16030sJ.A0P(r12)
            r11 = 1
            if (r0 == 0) goto L_0x038e
            java.lang.String r0 = r6.A0K
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x038e
            java.lang.String r0 = r6.A0K
            java.lang.Object r7 = r4.get(r0)
            X.AnonymousClass00B.A06(r7)
            X.01Q r7 = (X.AnonymousClass01Q) r7
            java.lang.Object r3 = r7.A01
            X.0tZ r3 = (X.C16740tZ) r3
            java.lang.String r1 = r6.A0K
            X.1Vw r0 = r3.A11
            java.lang.String r2 = r0.A01
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x038e
            java.lang.Object r0 = r7.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0J = r0
            X.184 r0 = r5.A06
            X.1kX r7 = r0.A00(r3)
            java.lang.String r0 = r7.A04
            r6.A0L = r0
            java.util.Map r1 = r5.A0H
            java.lang.String r0 = r6.A0K
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r3 = 0
            if (r0 == 0) goto L_0x04e1
            int r0 = r0.intValue()
        L_0x036c:
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0I = r0
            java.lang.String r0 = r7.A03
            if (r0 == 0) goto L_0x0378
            r3 = 1
        L_0x0378:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.A0D = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x038e
            java.util.Map r0 = r5.A0I
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r6.A0E = r0
        L_0x038e:
            X.0sG r1 = r5.A03
            com.whatsapp.jid.UserJid r0 = r6.A0A
            X.0sH r1 = r1.A08(r0)
            if (r1 == 0) goto L_0x03ac
            boolean r0 = r1.A0H()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0B = r0
            boolean r0 = r1.A0G()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0C = r0
        L_0x03ac:
            X.3sz r10 = new X.3sz
            r10.<init>()
            java.lang.Boolean r0 = r6.A0B
            r10.A00 = r0
            java.lang.Boolean r0 = r6.A0C
            r10.A01 = r0
            long r0 = r6.A09
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A0J = r0
            int r0 = r6.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A07 = r0
            int r0 = r6.A01
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A0I = r0
            int r0 = r6.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A06 = r0
            java.lang.Integer r9 = r6.A0F
            r10.A05 = r9
            long r0 = r6.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A0E = r0
            long r2 = r6.A08
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r10.A0H = r0
            long r7 = r6.A06
            double r0 = (double) r7
            r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r7
            long r7 = java.lang.Math.round(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r10.A0D = r0
            int r0 = r6.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A0F = r0
            int r0 = r6.A03
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A0G = r0
            long r0 = r6.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A0B = r0
            boolean r0 = r6.A0M
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A04 = r0
            java.lang.Long r0 = r6.A0J
            r10.A0C = r0
            java.lang.String r0 = r6.A0L
            r10.A0K = r0
            java.lang.Long r0 = r6.A0I
            r10.A0A = r0
            java.lang.Boolean r0 = r6.A0D
            r10.A02 = r0
            java.lang.Boolean r0 = r6.A0E
            r10.A03 = r0
            java.lang.Integer r0 = r6.A0H
            r10.A09 = r0
            java.lang.Integer r0 = r6.A0G
            r10.A08 = r0
            if (r9 == 0) goto L_0x0451
            int r0 = r9.intValue()
            r7 = 2
            r1 = 3
            if (r0 != r7) goto L_0x04d2
            X.14r r0 = r5.A0A
            r0.A03(r7, r1)
        L_0x0451:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x04ca
            X.0t9 r0 = r5.A09
            r0.A05(r10)
        L_0x045e:
            java.lang.String r0 = r6.A0K
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x030c
            java.lang.String r0 = r6.A0K
            java.lang.Object r0 = r4.get(r0)
            X.AnonymousClass00B.A06(r0)
            X.01Q r0 = (X.AnonymousClass01Q) r0
            java.lang.Object r7 = r0.A01
            X.0tZ r7 = (X.C16740tZ) r7
            long r0 = r6.A09
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            boolean r0 = r6.A0M
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
            java.lang.String r8 = r6.A0K
            com.whatsapp.jid.UserJid r15 = r6.A0A
            java.lang.Integer r0 = r6.A0F
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x04bb
            r0 = 3
            if (r1 == r0) goto L_0x04bb
            java.lang.Boolean r16 = java.lang.Boolean.TRUE
        L_0x0493:
            int r0 = r6.A02
            int r0 = X.C27691St.A00(r0)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            X.1St r14 = r5.A0E
            r0 = 0
            X.C18450wi.A0H(r7, r0)
            boolean r0 = r14.A04(r7)
            if (r0 == 0) goto L_0x030c
            r20 = r8
            X.2TW r1 = r14.A01(r15, r16, r17, r18, r19, r20)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            r14.A03(r1, r7)
            goto L_0x030c
        L_0x04bb:
            long r2 = r6.A08
            long r0 = r6.A06
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 0
            if (r9 < 0) goto L_0x04c5
            r0 = 1
        L_0x04c5:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
            goto L_0x0493
        L_0x04ca:
            X.0t9 r1 = r5.A09
            X.00F r0 = X.AnonymousClass3B1.A00
            r1.A0B(r10, r0, r11)
            goto L_0x045e
        L_0x04d2:
            if (r0 != r1) goto L_0x0451
            r7 = 400(0x190, double:1.976E-321)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0451
            X.14r r0 = r5.A0A
            r0.A03(r1, r1)
            goto L_0x0451
        L_0x04e1:
            r0 = 0
            goto L_0x036c
        L_0x04e4:
            java.lang.Object r6 = r3.A00
            X.1Pv r6 = (X.C26941Pv) r6
            java.lang.Object r5 = r3.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r3.A02
            X.0tZ r4 = (X.C16740tZ) r4
            X.0pd r2 = r6.A05
            r1 = 2039(0x7f7, float:2.857E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r3 = 0
            if (r0 == 0) goto L_0x0504
            java.util.List r2 = java.util.Collections.synchronizedList(r5)
            monitor-enter(r2)
            goto L_0x0b2f
        L_0x0504:
            java.util.Iterator r1 = r5.iterator()
        L_0x0508:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.0tZ r0 = (X.C16740tZ) r0
            r6.A00(r0, r4, r5, r3)
            int r3 = r3 + 1
            goto L_0x0508
        L_0x051a:
            java.lang.Object r7 = r3.A00
            X.18p r7 = (X.C226118p) r7
            java.lang.Object r6 = r3.A01
            X.1dM r6 = (X.C31031dM) r6
            java.lang.Object r5 = r3.A02
            X.1bu r5 = (X.C30191bu) r5
            X.01D r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.0yX r4 = (X.C19500yX) r4
            java.util.concurrent.atomic.AtomicInteger r0 = X.C226118p.A09
            int r3 = r0.getAndIncrement()
            r2 = 916783105(0x36a50001, float:4.9173836E-6)
            r4.ALF(r2, r3)
            java.lang.String r1 = r6.ADD()
            java.lang.String r0 = "job"
            r4.AKp(r0, r1, r2, r3)
            int r1 = r5.A00
            java.lang.String r0 = "marker_id"
            r4.AKn(r0, r2, r3, r1)
            r6.A8B(r5)     // Catch:{ Exception -> 0x0552 }
            r0 = 2
            r4.AKy(r2, r3, r0)     // Catch:{ Exception -> 0x0552 }
            goto L_0x0556
        L_0x0552:
            r0 = 3
            r4.AKy(r2, r3, r0)     // Catch:{ all -> 0x0b4a }
        L_0x0556:
            java.util.concurrent.ConcurrentHashMap r1 = r7.A08
            int r0 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x0016
            r0.decrementAndGet()
            return
        L_0x056a:
            java.lang.Object r5 = r3.A00
            X.1TW r5 = (X.AnonymousClass1TW) r5
            java.lang.Object r4 = r3.A01
            X.1ci r4 = (X.C30641ci) r4
            java.lang.Object r0 = r3.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = 0
            java.lang.Object r1 = r0.get(r6)
            X.1Vv r1 = (X.C28371Vv) r1
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "message"
            java.util.List r0 = r1.A0O(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x058e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0b5f
            java.lang.Object r2 = r7.next()
            X.1Vv r2 = (X.C28371Vv) r2
            if (r2 == 0) goto L_0x058e
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r2 = r2.A0N(r1, r0)
            boolean r0 = X.AnonymousClass1ZW.A0E(r2)
            if (r0 != 0) goto L_0x058e
            X.1kt r0 = X.C34801kt.A00
            X.1Vw r1 = new X.1Vw
            r1.<init>(r0, r2, r6)
            X.0t6 r2 = r5.A0A
            X.0th r0 = r2.A0K
            X.0tZ r1 = r0.A03(r1)
            if (r1 == 0) goto L_0x058e
            r3.add(r1)
            r0 = 1
            r2.A0g(r1, r0, r0)
            goto L_0x058e
        L_0x05c2:
            java.lang.Object r10 = r3.A00
            X.1TW r10 = (X.AnonymousClass1TW) r10
            java.lang.Object r9 = r3.A01
            X.1ci r9 = (X.C30641ci) r9
            java.lang.Object r6 = r3.A02
            X.1Vv r6 = (X.C28371Vv) r6
            r0 = 0
            X.1Vv r1 = r6.A0I(r0)
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "message"
            java.util.List r5 = r1.A0O(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3 = 1000(0x3e8, double:4.94E-321)
            r0 = 0
            java.lang.String r2 = "t"
            long r0 = r6.A0D(r2, r0)     // Catch:{ 1W9 -> 0x05ed }
            long r0 = r0 * r3
            goto L_0x05ff
        L_0x05ed:
            r4 = move-exception
            java.lang.String r3 = "connection/getMessageChatPSAFromProtocolTree: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x05ff:
            java.util.Iterator r16 = r5.iterator()
        L_0x0603:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x06bb
            java.lang.Object r4 = r16.next()
            X.1Vv r4 = (X.C28371Vv) r4
            if (r4 == 0) goto L_0x0603
            java.lang.String r3 = "id"
            r2 = 0
            java.lang.String r15 = r4.A0N(r3, r2)
            boolean r2 = X.AnonymousClass1ZW.A0E(r15)
            if (r2 != 0) goto L_0x0603
            java.lang.String r2 = "type"
            java.lang.String r3 = "text"
            java.lang.String r2 = r4.A0N(r2, r3)
            boolean r3 = r3.equalsIgnoreCase(r2)
            r2 = 0
            if (r3 == 0) goto L_0x0632
            byte[] r3 = r4.A01
            goto L_0x0640
        L_0x0632:
            X.1Vv r3 = r4.A0I(r2)
            if (r3 != 0) goto L_0x063e
            java.lang.String r2 = "connection/generateChatPSAFMessage null media"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x0603
        L_0x063e:
            byte[] r3 = r3.A01
        L_0x0640:
            X.1iD r7 = X.C33211iD.A0U(r3)     // Catch:{ Exception -> 0x06a7 }
            X.0tz r3 = r10.A06     // Catch:{ Exception -> 0x06a7 }
            r22 = r3
            X.0so r3 = r10.A00     // Catch:{ Exception -> 0x06a7 }
            r18 = r3
            X.0sG r3 = r10.A03     // Catch:{ Exception -> 0x06a7 }
            r20 = r3
            X.013 r3 = r10.A07     // Catch:{ Exception -> 0x06a7 }
            r23 = r3
            X.1GF r3 = r10.A0H     // Catch:{ Exception -> 0x06a7 }
            r17 = r3
            X.0uc r3 = r10.A02     // Catch:{ Exception -> 0x06a7 }
            r19 = r3
            X.0sK r14 = r10.A01     // Catch:{ Exception -> 0x06a7 }
            X.0pd r6 = r10.A0F     // Catch:{ Exception -> 0x06a7 }
            X.17g r13 = r10.A0I     // Catch:{ Exception -> 0x06a7 }
            X.0wS r12 = r10.A0G     // Catch:{ Exception -> 0x06a7 }
            X.173 r11 = r10.A0E     // Catch:{ Exception -> 0x06a7 }
            X.1GG r5 = r10.A08     // Catch:{ Exception -> 0x06a7 }
            X.1kt r4 = X.C34801kt.A00     // Catch:{ Exception -> 0x06a7 }
            X.1Vw r3 = new X.1Vw     // Catch:{ Exception -> 0x06a7 }
            r3.<init>(r4, r15, r2)     // Catch:{ Exception -> 0x06a7 }
            r27 = 0
            X.0wH r2 = r10.A04     // Catch:{ Exception -> 0x06a7 }
            X.21S r30 = X.C41061vA.A01(r6, r7)     // Catch:{ Exception -> 0x06a7 }
            r36 = 0
            r37 = 0
            r38 = 0
            r25 = r11
            r26 = r6
            r28 = r12
            r29 = r17
            r31 = r7
            r32 = r3
            r33 = r13
            r34 = r0
            r17 = r18
            r18 = r14
            r21 = r2
            r24 = r5
            X.0tZ r3 = X.C41061vA.A05(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38)     // Catch:{ Exception -> 0x06a7 }
            r3.A0b(r4)     // Catch:{ Exception -> 0x06a7 }
            java.lang.String r2 = "OBWhatsApp"
            r3.A0l = r2     // Catch:{ Exception -> 0x06a7 }
            r3.A0I = r0     // Catch:{ Exception -> 0x06a7 }
            r8.add(r3)
            goto L_0x0603
        L_0x06a7:
            r4 = move-exception
            java.lang.String r3 = "connection/generateChatPSAMultimediaFMessage "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x0603
        L_0x06bb:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0016
            java.util.Iterator r3 = r8.iterator()
        L_0x06c5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0b77
            java.lang.Object r2 = r3.next()
            X.0tZ r2 = (X.C16740tZ) r2
            X.0t6 r0 = r10.A0A
            boolean r0 = r0.A0u(r2)
            if (r0 == 0) goto L_0x06df
            java.lang.String r0 = "PSANotificationHandler/message added"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x06c5
        L_0x06df:
            java.lang.String r0 = "PSANotificationHandler/didn't add message: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x06c5
        L_0x06f5:
            java.lang.Object r6 = r3.A00
            X.1ZK r6 = (X.AnonymousClass1ZK) r6
            java.lang.Object r5 = r3.A02
            X.0pS r5 = (X.C14600pS) r5
            X.1cz r0 = r6.A0P
            if (r0 == 0) goto L_0x0757
            java.lang.String r0 = "voicenote/startvoicenote/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.media.SoundPool r2 = X.AnonymousClass1ZK.A1d
            int r1 = r6.A09
            r0 = 0
            r2.setVolume(r1, r0, r0)
            r4 = 0
            r6.A0D()     // Catch:{ Exception -> 0x0746 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0746 }
            r6.A0C = r0     // Catch:{ Exception -> 0x0746 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0746 }
            r6.A0B = r0     // Catch:{ Exception -> 0x0746 }
            r0 = 0
            r6.A0A = r0     // Catch:{ Exception -> 0x0746 }
            android.os.Handler r0 = r6.A0b     // Catch:{ Exception -> 0x0746 }
            r0.sendEmptyMessage(r4)     // Catch:{ Exception -> 0x0746 }
            X.44E r3 = r6.A0m     // Catch:{ Exception -> 0x0746 }
            X.1cz r2 = r6.A0P     // Catch:{ Exception -> 0x0746 }
            java.lang.String r1 = "PushToTalkVoiceVisualizerHandler"
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ Exception -> 0x0746 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0746 }
            r0.start()     // Catch:{ Exception -> 0x0746 }
            X.3Lz r1 = new X.3Lz     // Catch:{ Exception -> 0x0746 }
            r1.<init>(r0, r3, r2)     // Catch:{ Exception -> 0x0746 }
            r6.A0M = r1     // Catch:{ Exception -> 0x0746 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0746 }
            r1.sendEmptyMessage(r4)     // Catch:{ all -> 0x0743 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0746 }
            return
        L_0x0743:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0746 }
            throw r0     // Catch:{ Exception -> 0x0746 }
        L_0x0746:
            r1 = move-exception
            java.lang.String r0 = "voicenote/startvoicenote/startfailed"
            com.whatsapp.util.Log.e(r0, r1)
            r6.A0T(r4, r4)
            r0 = 2131888226(0x7f120862, float:1.9411081E38)
            r5.Afg(r0)
            return
        L_0x0757:
            java.lang.String r0 = "voicenote/startvoicenote/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x075e:
            java.lang.Object r5 = r3.A00
            X.0yw r5 = (X.C19750yw) r5
            java.lang.Object r4 = r3.A01
            X.1KC r4 = (X.AnonymousClass1KC) r4
            java.lang.Object r2 = r3.A02
            X.2JU r2 = (X.AnonymousClass2JU) r2
            X.0wP r0 = r5.A02
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x077c
            r1 = 1
            com.facebook.redex.IDxRCallbacksShape75S0200000_2_I1 r0 = new com.facebook.redex.IDxRCallbacksShape75S0200000_2_I1
            r0.<init>(r2, r1, r5)
            r4.Aah(r0)
            return
        L_0x077c:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.AQv(r0)
            return
        L_0x0785:
            java.lang.Object r5 = r3.A00
            X.135 r5 = (X.AnonymousClass135) r5
            java.lang.Object r4 = r3.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r3.A02
            java.util.List r3 = (java.util.List) r3
            X.0ug r2 = r5.A06
            X.0wP r1 = r5.A03
            X.4Iz r0 = new X.4Iz
            r0.<init>(r5, r4)
            X.51I r10 = new X.51I
            r10.<init>(r1, r2, r0, r3)
            X.0wP r0 = r10.A00
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x07b1
            X.4Iz r0 = r10.A02
            X.135 r0 = r0.A00
            X.1ue r0 = r0.A0A
            r0.A01()
            return
        L_0x07b1:
            X.0ug r9 = r10.A01
            java.lang.String r12 = r9.A02()
            r13 = 290(0x122, float:4.06E-43)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r10.A03
            java.util.Iterator r5 = r0.iterator()
        L_0x07c4:
            boolean r0 = r5.hasNext()
            java.lang.String r7 = "id"
            r3 = 1
            r8 = 0
            if (r0 == 0) goto L_0x07e8
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            X.1lL[] r2 = new X.C35081lL[r3]
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r7, (java.lang.String) r1)
            r2[r8] = r0
            java.lang.String r1 = "notice"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x07c4
        L_0x07e8:
            X.1lL[] r2 = new X.C35081lL[r3]
            java.lang.String r6 = "type"
            java.lang.String r1 = "session_update"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r6, (java.lang.String) r1)
            r2[r8] = r0
            X.1Vv[] r0 = new X.C28371Vv[r8]
            java.lang.Object[] r1 = r4.toArray(r0)
            X.1Vv[] r1 = (X.C28371Vv[]) r1
            java.lang.String r0 = "request"
            X.1Vv r5 = new X.1Vv
            r5.<init>((java.lang.String) r0, (X.C35081lL[]) r2, (X.C28371Vv[]) r1)
            r0 = 4
            X.1lL[] r4 = new X.C35081lL[r0]
            X.1ks r2 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r4[r8] = r0
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r7, (java.lang.String) r12)
            r4[r3] = r0
            r3 = 2
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "tos"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4[r3] = r0
            r2 = 3
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r6, (java.lang.String) r1)
            r4[r2] = r0
            java.lang.String r0 = "iq"
            X.1Vv r11 = new X.1Vv
            r11.<init>((X.C28371Vv) r5, (java.lang.String) r0, (X.C35081lL[]) r4)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0B(r10, r11, r12, r13, r14)
            return
        L_0x0842:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.support.faq.SearchFAQ r2 = (com.obwhatsapp.support.faq.SearchFAQ) r2
            java.lang.Object r1 = r3.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r3 = r3.A02
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r1 == 0) goto L_0x085e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x085e
            android.content.Intent r0 = com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.A02(r2, r3, r1)
        L_0x085a:
            r2.startActivity(r0)
            return
        L_0x085e:
            X.1KO r1 = r2.A01
            X.15W r0 = r2.A03
            boolean r10 = r0.A00()
            java.lang.String r6 = r2.A06
            r4 = 0
            r7 = r4
            r8 = r4
            r9 = r4
            r5 = r4
            android.content.Intent r0 = r1.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x085a
        L_0x0872:
            java.lang.Object r4 = r3.A00
            X.2Jq r4 = (X.C47602Jq) r4
            java.lang.Object r2 = r3.A01
            X.1jm r2 = (X.C34151jm) r2
            java.lang.Object r1 = r3.A02
            X.1jm r1 = (X.C34151jm) r1
            X.35D r0 = r4.A0H
            r0.A04(r2)
            X.35C r0 = r4.A0I
            r0.A04(r1)
            return
        L_0x0889:
            java.lang.Object r6 = r3.A00
            X.0zV r6 = (X.C20100zV) r6
            java.lang.Object r5 = r3.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r3.A02
            X.4Pd r4 = (X.C85614Pd) r4
            java.util.Iterator r3 = r5.iterator()
        L_0x0899:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08b2
            java.lang.Object r2 = r3.next()
            X.1pi r2 = (X.C37771pi) r2
            X.0zT r0 = r6.A01
            java.lang.String r1 = r2.A0F
            java.util.Map r0 = r0.A01
            boolean r0 = r0.containsKey(r1)
            r2.A05 = r0
            goto L_0x0899
        L_0x08b2:
            r4.A00(r5)
            return
        L_0x08b6:
            java.lang.Object r0 = r3.A00
            X.0yl r0 = (X.C19640yl) r0
            java.lang.Object r1 = r3.A01
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r7 = r3.A02
            android.os.Bundle r7 = (android.os.Bundle) r7
            X.0tz r0 = r0.A00
            android.content.Context r0 = r0.A00
            X.2nB r3 = new X.2nB
            r3.<init>()
            java.lang.String r2 = "com.obwhatsapp.permission.REGISTRATION"
            r4 = 0
            r5 = 1
            r6 = r4
            r0.sendOrderedBroadcast(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x08d4:
            java.lang.Object r5 = r3.A00
            X.1Sk r5 = (X.C27601Sk) r5
            java.lang.Object r4 = r3.A01
            X.2Qs r4 = (X.AnonymousClass2Qs) r4
            java.lang.Object r2 = r3.A02
            r0 = 5000(0x1388, double:2.4703E-320)
            r5.A04(r4, r0)     // Catch:{ all -> 0x08ee }
            java.util.Set r1 = r5.A1D
            monitor-enter(r1)
            r1.remove(r2)     // Catch:{ all -> 0x08eb }
            monitor-exit(r1)     // Catch:{ all -> 0x08eb }
            return
        L_0x08eb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x08eb }
            throw r0
        L_0x08ee:
            r1 = move-exception
            java.util.Set r0 = r5.A1D
            monitor-enter(r0)
            r0.remove(r2)     // Catch:{ all -> 0x08f7 }
        L_0x08f5:
            monitor-exit(r0)     // Catch:{ all -> 0x08f7 }
            goto L_0x08f9
        L_0x08f7:
            r1 = move-exception
            goto L_0x08f5
        L_0x08f9:
            throw r1
        L_0x08fa:
            java.lang.Object r0 = r3.A00
            X.1Sk r0 = (X.C27601Sk) r0
            java.lang.Object r2 = r3.A01
            X.1Yb r2 = (X.C28861Yb) r2
            java.lang.Object r1 = r3.A02
            X.1Vw r1 = (X.C28381Vw) r1
            X.11s r0 = r0.A0L
            r0.A0W(r2, r1)
            return
        L_0x090c:
            java.lang.Object r6 = r3.A00
            X.1Sk r6 = (X.C27601Sk) r6
            java.lang.Object r5 = r3.A01
            X.1bM r5 = (X.C29871bM) r5
            java.lang.Object r4 = r3.A02
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            X.1Bn r3 = r6.A0z
            java.lang.String r1 = r5.A0G
            if (r1 == 0) goto L_0x0938
            java.lang.String r0 = r5.A0F
            if (r0 == 0) goto L_0x0938
            X.1WM r2 = new X.1WM
            r2.<init>(r1, r0)
        L_0x0927:
            int r0 = r5.A02
            int r1 = r0 + 1
            X.1Vw r0 = r5.A11
            java.lang.String r0 = r0.A01
            r3.A02(r2, r4, r0, r1)
            X.1Cb r0 = r6.A0E
            r0.A00()
            return
        L_0x0938:
            r2 = 0
            goto L_0x0927
        L_0x093a:
            java.lang.Object r5 = r3.A00
            X.1Sk r5 = (X.C27601Sk) r5
            java.lang.Object r0 = r3.A01
            X.2Qs r0 = (X.AnonymousClass2Qs) r0
            java.lang.Object r4 = r3.A02
            X.1kE r4 = (X.C34421kE) r4
            r2 = 10000(0x2710, double:4.9407E-320)
            r1 = 0
            r5.A04(r0, r2)     // Catch:{ all -> 0x0950 }
            r4.A02(r1)
            return
        L_0x0950:
            r0 = move-exception
            r4.A02(r1)
            throw r0
        L_0x0955:
            java.lang.Object r9 = r3.A00
            X.1TW r9 = (X.AnonymousClass1TW) r9
            java.lang.Object r8 = r3.A01
            X.1ci r8 = (X.C30641ci) r8
            java.lang.Object r1 = r3.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "recvmessagelistener/on-messages-server-psa"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.size()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r7.<init>(r0)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
        L_0x0973:
            boolean r0 = r16.hasNext()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            if (r0 == 0) goto L_0x0a37
            java.lang.Object r6 = r16.next()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1kX r6 = (X.C34601kX) r6     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.0tZ r5 = r6.A05     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            byte[] r0 = r5.A11()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1iD r4 = X.C33211iD.A0U(r0)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            if (r4 == 0) goto L_0x0973
            X.0pd r3 = r9.A0F     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.21S r10 = X.C41061vA.A01(r3, r4)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r2 = 0
            if (r10 == 0) goto L_0x0a33
            int r1 = r10.A00     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0a33
            X.2tK r1 = r10.A0A     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r0 = r1
            if (r1 != 0) goto L_0x09a2
            X.2tK r1 = X.C58332tK.A03     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
        L_0x09a2:
            java.lang.String r2 = r1.A02     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            if (r0 != 0) goto L_0x09a8
            X.2tK r0 = X.C58332tK.A03     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
        L_0x09a8:
            java.lang.String r0 = r0.A01     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r39 = r0
        L_0x09ac:
            X.0tz r1 = r9.A06     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.0so r0 = r9.A00     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r22 = r0
            X.0sG r0 = r9.A03     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r21 = r0
            X.013 r0 = r9.A07     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r23 = r0
            X.1GF r0 = r9.A0H     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r20 = r0
            X.0uc r0 = r9.A02     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r19 = r0
            X.0sK r0 = r9.A01     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r18 = r0
            X.17g r0 = r9.A0I     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r17 = r0
            X.0wS r15 = r9.A0G     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.173 r14 = r9.A0E     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1GG r13 = r9.A08     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1Vw r10 = r5.A11     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1Vw r0 = new X.1Vw     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r0.<init>(r10)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            long r10 = r5.A0I     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r27 = 0
            X.0wH r12 = r9.A04     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r36 = 0
            X.21S r30 = X.C41061vA.A01(r3, r4)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r37 = 0
            r38 = 0
            r24 = r13
            r25 = r14
            r26 = r3
            r28 = r15
            r29 = r20
            r31 = r4
            r32 = r0
            r33 = r17
            r34 = r10
            r17 = r22
            r20 = r21
            r21 = r12
            r22 = r1
            X.0tZ r10 = X.C41061vA.A05(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1kt r0 = X.C34801kt.A00     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r10.A0b(r0)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            android.content.Context r1 = r1.A00     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r0 = 2131893204(0x7f121bd4, float:1.9421178E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r10.A0l = r0     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            long r0 = r5.A0I     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r10.A0I = r0     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            java.lang.String r1 = r6.A04     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            long r3 = r6.A00     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1kX r0 = new X.1kX     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r19 = r1
            r20 = r2
            r21 = r39
            r22 = r3
            r17 = r0
            r18 = r10
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r7.add(r0)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            goto L_0x0973
        L_0x0a33:
            r39 = r2
            goto L_0x09ac
        L_0x0a37:
            X.0t6 r3 = r9.A0A     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.126 r0 = r3.A0H     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            android.os.Handler r0 = r0.A00     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.AnonymousClass00B.A02(r0)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            boolean r0 = r7.isEmpty()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            if (r0 != 0) goto L_0x0adc
            java.util.Iterator r13 = r7.iterator()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
        L_0x0a4a:
            boolean r0 = r13.hasNext()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            if (r0 == 0) goto L_0x0adc
            java.lang.Object r6 = r13.next()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1kX r6 = (X.C34601kX) r6     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.0tZ r4 = r6.A05     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            boolean r12 = r3.A0u(r4)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.184 r5 = r3.A1I     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            long r0 = r4.A13     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r10 = -1
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0ab7
            boolean r0 = r6.A00()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            if (r0 != 0) goto L_0x0ab7
            X.0tq r0 = r5.A00     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.0tf r2 = r0.A02()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0ad7 }
            r5.<init>()     // Catch:{ all -> 0x0ad7 }
            java.lang.String r7 = "message_row_id"
            long r0 = r4.A13     // Catch:{ all -> 0x0ad7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0ad7 }
            r5.put(r7, r0)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r1 = "campaign_id"
            java.lang.String r0 = r6.A04     // Catch:{ all -> 0x0ad7 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r7 = "duration"
            long r0 = r6.A00     // Catch:{ all -> 0x0ad7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0ad7 }
            r5.put(r7, r0)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r7 = "first_seen_timestamp"
            long r0 = r6.A01     // Catch:{ all -> 0x0ad7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0ad7 }
            r5.put(r7, r0)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r1 = "action_link_url"
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x0ad7 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0ad7 }
            java.lang.String r1 = "action_link_button_title"
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x0ad7 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0ad7 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0ad7 }
            java.lang.String r0 = "message_status_psa_campaign"
            r1.A04(r5, r0)     // Catch:{ all -> 0x0ad7 }
            r2.close()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
        L_0x0ab7:
            if (r12 == 0) goto L_0x0a4a
            X.11A r1 = r3.A0R     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1Vw r0 = r4.A11     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.0rv r2 = r0.A00     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            java.lang.Iterable r0 = r1.A01()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
        L_0x0ac7:
            boolean r0 = r1.hasNext()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            if (r0 == 0) goto L_0x0a4a
            java.lang.Object r0 = r1.next()     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            X.1ig r0 = (X.C33501ig) r0     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            r0.A02(r2)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            goto L_0x0ac7
        L_0x0ad7:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0adb }
        L_0x0adb:
            throw r0     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
        L_0x0adc:
            r9.A03(r8)     // Catch:{ 1bD -> 0x0ae7, 23S -> 0x0ae0 }
            return
        L_0x0ae0:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-message-server-psa/bade2e:"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0ae7:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-message-server-psa/invalidproto:"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0aee:
            java.lang.Object r5 = r3.A00
            X.18C r5 = (X.AnonymousClass18C) r5
            java.lang.Object r4 = r3.A01
            X.0tm r4 = (X.C16870tm) r4
            java.lang.Object r3 = r3.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            X.0pd r2 = r5.A01
            r1 = 1856(0x740, float:2.601E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0b1f
            X.0tZ r2 = r4.A04
            byte r0 = r2.A10
            boolean r0 = X.C16870tm.A00(r0)
            if (r0 == 0) goto L_0x0b1f
            X.0xO r1 = r5.A02
            java.io.File r0 = X.C18870xO.A00(r2)
            if (r0 == 0) goto L_0x0b1f
            byte[] r0 = r1.A01(r2)
            r4.A01(r0)
        L_0x0b1f:
            r5.A01(r4)
            r3.run()
            return
        L_0x0b26:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0b28 }
        L_0x0b28:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0b2b:
            r3.A01()
            return
        L_0x0b2f:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0b47 }
        L_0x0b33:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b47 }
            if (r0 == 0) goto L_0x0b45
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b47 }
            X.0tZ r0 = (X.C16740tZ) r0     // Catch:{ all -> 0x0b47 }
            r6.A00(r0, r4, r2, r3)     // Catch:{ all -> 0x0b47 }
            int r3 = r3 + 1
            goto L_0x0b33
        L_0x0b45:
            monitor-exit(r2)     // Catch:{ all -> 0x0b47 }
            return
        L_0x0b47:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0b47 }
            throw r0
        L_0x0b4a:
            r2 = move-exception
            java.util.concurrent.ConcurrentHashMap r1 = r7.A08
            int r0 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x0b5e
            r0.decrementAndGet()
        L_0x0b5e:
            throw r2
        L_0x0b5f:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0b73
            X.17E r0 = r5.A0B
            android.os.Handler r2 = r0.A01
            r1 = 46
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r5, r1, r3)
            r2.post(r0)
        L_0x0b73:
            r5.A03(r4)
            return
        L_0x0b77:
            r10.A03(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape2S0300000_I0_2.run():void");
    }
}
