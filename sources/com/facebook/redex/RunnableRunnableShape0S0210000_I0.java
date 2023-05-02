package com.facebook.redex;

import X.AnonymousClass16P;

public class RunnableRunnableShape0S0210000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public RunnableRunnableShape0S0210000_I0(AnonymousClass16P r2, Runnable runnable) {
        this.A03 = 7;
        this.A00 = r2;
        this.A02 = true;
        this.A01 = runnable;
    }

    public RunnableRunnableShape0S0210000_I0(Object obj, Object obj2, int i2, boolean z2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:463:? A[RETURN, SYNTHETIC] */
    public final void run() {
        /*
            r42 = this;
            r2 = r42
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0b03;
                case 1: goto L_0x01c1;
                case 2: goto L_0x014b;
                case 3: goto L_0x010d;
                case 4: goto L_0x0aed;
                case 5: goto L_0x057d;
                case 6: goto L_0x056f;
                case 7: goto L_0x0559;
                case 8: goto L_0x0501;
                case 9: goto L_0x04e6;
                case 10: goto L_0x04d8;
                case 11: goto L_0x04c7;
                case 12: goto L_0x00f0;
                case 13: goto L_0x04b0;
                case 14: goto L_0x009f;
                case 15: goto L_0x007a;
                case 16: goto L_0x005c;
                case 17: goto L_0x0040;
                case 18: goto L_0x0024;
                case 19: goto L_0x02bd;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r8 = r2.A00
            X.0yx r8 = (X.C19760yx) r8
            java.lang.Object r3 = r2.A01
            X.1Zk r3 = (X.C28951Zk) r3
            boolean r1 = r2.A02
            X.12J r0 = r8.A0B
            r0.A01(r3)
            X.0tH r0 = r8.A01
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0287
            if (r1 == 0) goto L_0x0287
            java.lang.String r0 = "App is no longer in background - skipping notification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r6 = r2.A00
            X.1Gg r6 = (X.C24521Gg) r6
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.DeviceJid[] r5 = (com.whatsapp.jid.DeviceJid[]) r5
            boolean r4 = r2.A02
            int r3 = r5.length
            r2 = 0
        L_0x0030:
            if (r2 >= r3) goto L_0x0023
            r1 = r5[r2]
            byte r0 = r1.device
            if (r0 == 0) goto L_0x003d
            X.137 r0 = r6.A08
            r0.A08(r1, r4)
        L_0x003d:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x0040:
            java.lang.Object r6 = r2.A00
            X.1Gg r6 = (X.C24521Gg) r6
            java.lang.Object r5 = r2.A01
            com.whatsapp.jid.DeviceJid[] r5 = (com.whatsapp.jid.DeviceJid[]) r5
            boolean r4 = r2.A02
            int r3 = r5.length
            r2 = 0
        L_0x004c:
            if (r2 >= r3) goto L_0x0023
            r1 = r5[r2]
            byte r0 = r1.device
            if (r0 == 0) goto L_0x0059
            X.137 r0 = r6.A08
            r0.A08(r1, r4)
        L_0x0059:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x005c:
            java.lang.Object r3 = r2.A00
            com.obwhatsapp.mediaview.MediaViewFragment r3 = (com.obwhatsapp.mediaview.MediaViewFragment) r3
            boolean r0 = r2.A02
            java.lang.Object r2 = r2.A01
            X.0tY r2 = (X.C16730tY) r2
            if (r0 == 0) goto L_0x0023
            X.00l r0 = r3.A0C()
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0023
            r1 = 0
            r0 = 1
            r3.A1b(r2, r1, r0)
            return
        L_0x007a:
            java.lang.Object r3 = r2.A00
            X.29S r3 = (X.AnonymousClass29S) r3
            boolean r1 = r2.A02
            java.lang.Object r4 = r2.A01
            android.location.Location r4 = (android.location.Location) r4
            X.1li r0 = r3.A0h
            if (r0 == 0) goto L_0x008a
            if (r1 == 0) goto L_0x0023
        L_0x008a:
            float r0 = r4.getAccuracy()
            int r1 = (int) r0
            r0 = 100
            int r6 = java.lang.Math.max(r1, r0)
            r5 = 0
            r7 = 1
            boolean r0 = r3.A0w
            r8 = r0 ^ 1
            r3.A0L(r4, r5, r6, r7, r8)
            return
        L_0x009f:
            java.lang.Object r5 = r2.A00
            X.2TH r5 = (X.AnonymousClass2TH) r5
            java.lang.Object r4 = r2.A01
            java.util.List r4 = (java.util.List) r4
            boolean r3 = r2.A02
            X.0tU r0 = r5.A02
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x0023
            X.2TI r1 = r5.A06
            int r0 = r5.A01
            com.obwhatsapp.gallery.MediaGalleryFragmentBase r2 = r1.A00
            r2.A00 = r0
            int r0 = r5.A00
            if (r3 == 0) goto L_0x00d9
            if (r0 != 0) goto L_0x00c7
            r4.size()
        L_0x00c2:
            java.util.List r0 = r5.A09
            r0.addAll(r4)
        L_0x00c7:
            X.01X r0 = r2.A06
            r0.A01()
            java.util.List r0 = r2.A0S
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0023
            r0 = 0
            r2.A1J(r0)
            return
        L_0x00d9:
            if (r0 != 0) goto L_0x00e3
            java.util.List r0 = r5.A09
            r0.size()
            r0.clear()
        L_0x00e3:
            r4.size()
            int r1 = r5.A00
            int r0 = r4.size()
            int r1 = r1 + r0
            r5.A00 = r1
            goto L_0x00c2
        L_0x00f0:
            java.lang.Object r1 = r2.A00
            X.1RS r1 = (X.AnonymousClass1RS) r1
            java.lang.Object r3 = r2.A01
            boolean r0 = r2.A02
            X.1XS r2 = r1.A00
            java.lang.Object r1 = r2.A00()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0023
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.put(r3, r0)
            r2.A04(r1)
            return
        L_0x010d:
            java.lang.Object r4 = r2.A00
            X.25g r4 = (X.C447225g) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r2 = r2.A02
            int r1 = com.whatsapp.voipcalling.Voip.sendRemoveUserRequest(r3)
            r0 = 70004(0x11174, float:9.8096E-41)
            if (r1 != r0) goto L_0x012a
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r0 = 25
            r4.A0y(r1, r0)
            return
        L_0x012a:
            if (r1 != 0) goto L_0x0023
            if (r2 == 0) goto L_0x0133
            java.util.Set r0 = r4.A13
            r0.add(r3)
        L_0x0133:
            android.os.Handler r1 = r4.A0L
            r0 = 46
            r1.removeMessages(r0)
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r0
            r1.arg1 = r2
            r1.obj = r3
            android.os.Handler r0 = r4.A0L
            r0.sendMessage(r1)
            return
        L_0x014b:
            java.lang.Object r0 = r2.A00
            X.1KA r0 = (X.AnonymousClass1KA) r0
            java.lang.Object r1 = r2.A01
            X.2TJ r1 = (X.AnonymousClass2TJ) r1
            boolean r4 = r2.A02
            java.util.List r0 = r0.A0N
            java.util.Iterator r6 = r0.iterator()
        L_0x015b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r6.next()
            X.2TK r0 = (X.AnonymousClass2TK) r0
            X.26l r0 = (X.C449726l) r0
            X.1mM r2 = r0.A0Q
            if (r2 == 0) goto L_0x015b
            java.lang.String r3 = r2.A0D
            java.lang.String r2 = r1.A03
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x015b
            r0.Ac1()
            r11 = 0
            X.0ue r7 = r0.A0S
            java.lang.String r10 = r1.A04
            X.1mM r2 = r0.A0Q
            if (r4 == 0) goto L_0x01a5
            if (r2 == 0) goto L_0x0187
            java.lang.String r11 = r2.A0D
        L_0x0187:
            com.whatsapp.jid.UserJid r8 = r0.A0i
            long r2 = r1.A01
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r12 = r1.A05
            int r14 = r1.A00
            r13 = 15
            r7.A05(r8, r9, r10, r11, r12, r13, r14)
            r5 = 2131887062(0x7f1203d6, float:1.940872E38)
            r3 = 2131887060(0x7f1203d4, float:1.9408716E38)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.Afj(r2, r5, r3)
            goto L_0x015b
        L_0x01a5:
            if (r2 == 0) goto L_0x01a9
            java.lang.String r11 = r2.A0D
        L_0x01a9:
            com.whatsapp.jid.UserJid r8 = r0.A0i
            long r2 = r1.A01
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            java.lang.String r12 = r1.A05
            int r14 = r1.A00
            r13 = 16
            r7.A05(r8, r9, r10, r11, r12, r13, r14)
            r2 = 2131887061(0x7f1203d5, float:1.9408718E38)
            r0.Afg(r2)
            goto L_0x015b
        L_0x01c1:
            java.lang.Object r11 = r2.A00
            X.0uc r11 = (X.C17150uc) r11
            java.lang.Object r10 = r2.A01
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            boolean r9 = r2.A02
            X.235 r8 = r11.A0A
            X.1mD r15 = r8.A00(r10)
            if (r15 == 0) goto L_0x0023
            boolean r0 = r15.A0J
            if (r0 == r9) goto L_0x0023
            com.whatsapp.jid.UserJid r0 = r15.A04
            r41 = r0
            java.lang.String r0 = r15.A0E
            r40 = r0
            java.util.List r0 = r15.A0G
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            java.util.List r0 = r15.A0I
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r0)
            java.lang.String r0 = r15.A0B
            r39 = r0
            java.lang.String r0 = r15.A0A
            r20 = r0
            X.1m7 r0 = r15.A03
            r38 = r0
            X.1mE r0 = r15.A00
            r37 = r0
            boolean r0 = r15.A0L
            r32 = r0
            java.lang.String r0 = r15.A05
            r21 = r0
            java.lang.String r0 = r15.A0D
            r19 = r0
            java.lang.String r0 = r15.A06
            r18 = r0
            java.lang.String r0 = r15.A0F
            r17 = r0
            boolean r0 = r15.A0K
            r16 = r0
            boolean r12 = r15.A0N
            X.1m8 r7 = r15.A02
            java.lang.String r6 = r15.A09
            java.lang.String r5 = r15.A08
            boolean r4 = r15.A0M
            X.1mA r3 = r15.A01
            java.util.List r0 = r15.A0H
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.lang.String r1 = r15.A07
            java.lang.String r0 = r15.A0C
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r14)
            java.util.List r29 = java.util.Collections.unmodifiableList(r15)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r13)
            java.util.List r30 = java.util.Collections.unmodifiableList(r14)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r2)
            java.util.List r31 = java.util.Collections.unmodifiableList(r13)
            X.1mD r2 = new X.1mD
            r22 = r19
            r23 = r18
            r24 = r17
            r25 = r6
            r26 = r5
            r27 = r1
            r28 = r0
            r33 = r9
            r34 = r16
            r35 = r12
            r36 = r4
            r12 = r2
            r13 = r37
            r14 = r3
            r15 = r7
            r16 = r38
            r17 = r41
            r18 = r40
            r19 = r39
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r10, r2)
            r8.A03(r0)
            android.os.Handler r2 = r11.A00
            r1 = 10
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r0.<init>(r11, r1, r10)
            r2.post(r0)
            return
        L_0x0287:
            X.0tz r0 = r8.A0M
            android.content.Context r7 = r0.A00
            r0 = 2131893495(0x7f121cf7, float:1.9421768E38)
            java.lang.String r6 = r7.getString(r0)
            X.0yL r5 = r8.A0N
            r1 = 2131889700(0x7f120e24, float:1.941407E38)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3 = 0
            r0[r3] = r6
            java.lang.String r2 = r7.getString(r1, r0)
            r1 = 2131889701(0x7f120e25, float:1.9414073E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r6
            r0[r4] = r6
            java.lang.String r0 = r7.getString(r1, r0)
            X.03l r0 = r8.A02(r6, r2, r0)
            android.app.Notification r1 = r0.A01()
            r0 = 52
            r5.A02(r0, r1)
            return
        L_0x02bd:
            java.lang.Object r3 = r2.A00
            X.1Ux r3 = (X.C28241Ux) r3
            java.lang.Object r5 = r2.A01
            X.2TF r5 = (X.AnonymousClass2TF) r5
            boolean r10 = r2.A02
            java.lang.Object r4 = r3.A0B
            monitor-enter(r4)
            X.1Uw r6 = r3.A08     // Catch:{ all -> 0x04ad }
            java.io.File r9 = r6.A01     // Catch:{ all -> 0x04ad }
            boolean r0 = r9.exists()     // Catch:{ all -> 0x04ad }
            if (r0 == 0) goto L_0x02f1
            long r0 = r3.A02     // Catch:{ all -> 0x04ad }
            long r7 = r5.A00     // Catch:{ all -> 0x04ad }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0496
            if (r10 != 0) goto L_0x02f1
            java.lang.Object r10 = r3.A0A     // Catch:{ all -> 0x04ad }
            monitor-enter(r10)     // Catch:{ all -> 0x04ad }
            long r0 = r3.A01     // Catch:{ all -> 0x02ee }
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r0 = 0
            if (r2 != 0) goto L_0x02e9
            r0 = 1
        L_0x02e9:
            monitor-exit(r10)     // Catch:{ all -> 0x02ee }
            if (r0 != 0) goto L_0x02f1
            goto L_0x0496
        L_0x02ee:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02ee }
            throw r0     // Catch:{ all -> 0x04ad }
        L_0x02f1:
            java.util.Map r11 = r5.A02     // Catch:{ Exception -> 0x0487 }
            java.lang.Object r7 = r6.A02     // Catch:{ Exception -> 0x0487 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x0487 }
            boolean r0 = r9.exists()     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0335
            java.io.File r2 = r6.A00     // Catch:{ all -> 0x0484 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0484 }
            if (r0 == 0) goto L_0x0308
            r9.delete()     // Catch:{ all -> 0x0484 }
            goto L_0x0335
        L_0x0308:
            boolean r0 = r9.renameTo(r2)     // Catch:{ all -> 0x0484 }
            if (r0 != 0) goto L_0x0335
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0484 }
            r1.<init>()     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Couldn't rename file "
            r1.append(r0)     // Catch:{ all -> 0x0484 }
            r1.append(r9)     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = " to backup file "
            r1.append(r0)     // Catch:{ all -> 0x0484 }
            r1.append(r2)     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0484 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0484 }
            monitor-exit(r7)     // Catch:{ all -> 0x0484 }
            r0 = 0
            r5.A04 = r0     // Catch:{ Exception -> 0x0487 }
            java.util.concurrent.CountDownLatch r0 = r5.A03     // Catch:{ Exception -> 0x0487 }
            r0.countDown()     // Catch:{ Exception -> 0x0487 }
            goto L_0x049e
        L_0x0335:
            java.lang.String r10 = "DefaultSharedPreferencesStorage/Couldn't create directory for SharedPreferences file "
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x033d }
            r8.<init>(r9)     // Catch:{ FileNotFoundException -> 0x033d }
            goto L_0x0362
        L_0x033d:
            r2 = move-exception
            java.io.File r8 = r9.getParentFile()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r8.mkdir()     // Catch:{ SecurityException -> 0x0436 }
            boolean r0 = r8.exists()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            if (r0 == 0) goto L_0x0410
            boolean r0 = r8.isDirectory()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            if (r0 == 0) goto L_0x03da
            boolean r0 = r8.canRead()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            if (r0 == 0) goto L_0x03da
            boolean r0 = r8.canWrite()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            if (r0 == 0) goto L_0x03da
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0423 }
            r8.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0423 }
        L_0x0362:
            java.io.File r10 = r6.A00     // Catch:{ all -> 0x03d5 }
            long r13 = r10.length()     // Catch:{ all -> 0x03d5 }
            r12 = 2048(0x800, float:2.87E-42)
            r1 = 2048(0x800, double:1.0118E-320)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0383
            r1 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x037b
            r12 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0383
        L_0x037b:
            long r0 = (long) r12     // Catch:{ all -> 0x03d5 }
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0383
            int r12 = r12 << 1
            goto L_0x037b
        L_0x0383:
            X.2TV r13 = new X.2TV     // Catch:{ all -> 0x03d5 }
            r13.<init>(r12)     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x03d5 }
            r13.setOutput(r8, r0)     // Catch:{ all -> 0x03d5 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x03d5 }
            r2 = 0
            r13.startDocument(r2, r0)     // Catch:{ all -> 0x03d5 }
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#indent-output"
            r0 = 1
            r13.setFeature(r1, r0)     // Catch:{ all -> 0x03d5 }
            X.AnonymousClass1VV.A03(r2, r11, r13)     // Catch:{ all -> 0x03d5 }
            r13.endDocument()     // Catch:{ all -> 0x03d5 }
            java.io.FileDescriptor r0 = r8.getFD()     // Catch:{ IOException -> 0x03a7 }
            r0.sync()     // Catch:{ IOException -> 0x03a7 }
            goto L_0x03c0
        L_0x03a7:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d5 }
            r1.<init>()     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while syncing preferences, file= "
            r1.append(r0)     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = r9.getName()     // Catch:{ all -> 0x03d5 }
            r1.append(r0)     // Catch:{ all -> 0x03d5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03d5 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x03d5 }
        L_0x03c0:
            r10.delete()     // Catch:{ all -> 0x03d5 }
            r8.close()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            monitor-exit(r7)     // Catch:{ all -> 0x0484 }
            long r0 = r5.A00     // Catch:{ Exception -> 0x0487 }
            r3.A02 = r0     // Catch:{ Exception -> 0x0487 }
            r0 = 1
            r5.A04 = r0     // Catch:{ Exception -> 0x0487 }
            java.util.concurrent.CountDownLatch r0 = r5.A03     // Catch:{ Exception -> 0x0487 }
            r0.countDown()     // Catch:{ Exception -> 0x0487 }
            goto L_0x049e
        L_0x03d5:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x03d9 }
        L_0x03d9:
            throw r0     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
        L_0x03da:
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Invalid directory for SharedPreferences file "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r1.append(r9)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            java.lang.String r0 = ", isDirectory="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            boolean r0 = r8.isDirectory()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            java.lang.String r0 = ", canRead="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            boolean r0 = r8.canRead()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            java.lang.String r0 = ", canWrite="
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            boolean r0 = r8.canWrite()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            java.lang.String r0 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            goto L_0x0435
        L_0x0410:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r0.append(r10)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r0.append(r9)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            goto L_0x0435
        L_0x0423:
            r2 = move-exception
            java.lang.String r1 = "DefaultSharedPreferencesStorage/Couldn't create SharedPreferences file "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r0.append(r9)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
        L_0x0435:
            throw r2     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
        L_0x0436:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r0.append(r10)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            r0.append(r9)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
            throw r1     // Catch:{ XmlPullParserException -> 0x0467, IOException -> 0x044a }
        L_0x044a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0484 }
            r1.<init>()     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while saving preferences, file= "
            r1.append(r0)     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r9.getName()     // Catch:{ all -> 0x0484 }
            r1.append(r0)     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0484 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0484 }
            r6.A00()     // Catch:{ all -> 0x0484 }
            throw r2     // Catch:{ all -> 0x0484 }
        L_0x0467:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0484 }
            r1.<init>()     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Exception while serializing to XML, file= "
            r1.append(r0)     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r9.getName()     // Catch:{ all -> 0x0484 }
            r1.append(r0)     // Catch:{ all -> 0x0484 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0484 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0484 }
            r6.A00()     // Catch:{ all -> 0x0484 }
            throw r2     // Catch:{ all -> 0x0484 }
        L_0x0484:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0484 }
            throw r0     // Catch:{ Exception -> 0x0487 }
        L_0x0487:
            r1 = move-exception
            java.lang.String r0 = "LightSharedPreferencesImpl/writeToFile: Got exception:"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04ad }
            r0 = 0
            r5.A04 = r0     // Catch:{ all -> 0x04ad }
            java.util.concurrent.CountDownLatch r0 = r5.A03     // Catch:{ all -> 0x04ad }
            r0.countDown()     // Catch:{ all -> 0x04ad }
            goto L_0x049e
        L_0x0496:
            r0 = 1
            r5.A04 = r0     // Catch:{ all -> 0x04ad }
            java.util.concurrent.CountDownLatch r0 = r5.A03     // Catch:{ all -> 0x04ad }
            r0.countDown()     // Catch:{ all -> 0x04ad }
        L_0x049e:
            monitor-exit(r4)     // Catch:{ all -> 0x04ad }
            java.lang.Object r1 = r3.A0A
            monitor-enter(r1)
            int r0 = r3.A00     // Catch:{ all -> 0x04aa }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x04aa }
            monitor-exit(r1)     // Catch:{ all -> 0x04aa }
            return
        L_0x04aa:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x04aa }
            throw r0
        L_0x04ad:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x04ad }
            throw r0
        L_0x04b0:
            java.lang.Object r7 = r2.A00
            X.1Mc r7 = (X.C26041Mc) r7
            java.lang.Object r6 = r2.A01
            X.20T r6 = (X.AnonymousClass20T) r6
            boolean r5 = r2.A02
            r3 = 987(0x3db, double:4.876E-321)
            r1 = 1
            X.1kQ r0 = new X.1kQ
            r0.<init>(r1, r3)
            r7.A05(r6, r0, r5)
            return
        L_0x04c7:
            java.lang.Object r0 = r2.A00
            X.10G r0 = (X.AnonymousClass10G) r0
            java.lang.Object r3 = r2.A01
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r2.A02
            X.0xq r1 = r0.A0A
            r0 = 0
            r1.A06(r0, r3, r2)
            return
        L_0x04d8:
            java.lang.Object r3 = r2.A00
            X.1Sn r3 = (X.C27631Sn) r3
            java.lang.Object r1 = r2.A01
            X.1rU r1 = (X.C38831rU) r1
            boolean r0 = r2.A02
            r3.A03(r1, r0)
            return
        L_0x04e6:
            java.lang.Object r4 = r2.A00
            X.0xS r4 = (X.C18910xS) r4
            java.lang.Object r3 = r2.A01
            X.0rx r3 = (X.C15840rx) r3
            boolean r1 = r2.A02
            X.0xU r2 = r4.A02
            X.0rv r0 = r3.A0i
            java.util.Set r1 = r2.A0C(r0, r1)
            X.0ts r0 = r4.A09
            r0.A0A(r3)
            r2.A0V(r1)
            return
        L_0x0501:
            java.lang.Object r6 = r2.A00
            X.0xS r6 = (X.C18910xS) r6
            java.lang.Object r0 = r2.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r7 = r2.A02
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0514:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x052c
            java.lang.Object r0 = r2.next()
            X.0rx r0 = (X.C15840rx) r0
            X.0xU r1 = r6.A02
            X.0rv r0 = r0.A0i
            java.util.Set r0 = r1.A0C(r0, r7)
            r5.addAll(r0)
            goto L_0x0514
        L_0x052c:
            X.0ts r0 = r6.A09
            X.0tq r0 = r0.A04
            X.0tf r4 = r0.A02()
            r0 = 1
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0554 }
            r3.<init>(r0)     // Catch:{ all -> 0x0554 }
            java.lang.String r1 = "archived"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0554 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0554 }
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x0554 }
            java.lang.String r1 = "chat"
            r0 = 0
            r2.A00(r1, r3, r0, r0)     // Catch:{ all -> 0x0554 }
            r4.close()
            X.0xU r0 = r6.A02
            r0.A0V(r5)
            return
        L_0x0554:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0558 }
        L_0x0558:
            throw r0
        L_0x0559:
            java.lang.Object r3 = r2.A00
            X.16P r3 = (X.AnonymousClass16P) r3
            java.lang.Object r2 = r2.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 1
            r3.A02 = r0
            r1 = 0
            r2.run()     // Catch:{ all -> 0x056b }
            r3.A02 = r1
            return
        L_0x056b:
            r0 = move-exception
            r3.A02 = r1
            throw r0
        L_0x056f:
            java.lang.Object r3 = r2.A00
            X.2QM r3 = (X.AnonymousClass2QM) r3
            java.lang.Object r1 = r2.A01
            X.2TL r1 = (X.AnonymousClass2TL) r1
            boolean r0 = r2.A02
            r3.A04(r1, r0)
            return
        L_0x057d:
            java.lang.Object r0 = r2.A00
            r16 = r0
            r0 = r16
            X.2TM r0 = (X.AnonymousClass2TM) r0
            r16 = r0
            java.lang.Object r0 = r2.A01
            r17 = r0
            r0 = r17
            X.1s2 r0 = (X.C39171s2) r0
            r17 = r0
            boolean r0 = r2.A02
            r19 = r0
            r0 = r16
            android.widget.LinearLayout r0 = r0.A06
            r38 = r0
            java.lang.Object r0 = r38.getTag()
            if (r0 == 0) goto L_0x0ae9
            r0 = r17
            X.1Vw r0 = r0.A11
            r37 = r0
            java.lang.Object r1 = r38.getTag()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0ae9
            r0 = r17
            java.util.List r3 = r0.A04
            r8 = 0
            if (r3 == 0) goto L_0x05e0
            r6 = 0
            java.util.Iterator r5 = r3.iterator()
        L_0x05be:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x05e0
            java.lang.Object r4 = r5.next()
            X.1qx r4 = (X.C38541qx) r4
            X.1Vw r0 = r4.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x05be
            boolean r0 = r4 instanceof X.C39181s3
            if (r0 == 0) goto L_0x05be
            X.1s3 r4 = (X.C39181s3) r4
            long r1 = r4.A00
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x05be
            java.util.List r8 = r4.A05
            r6 = r1
            goto L_0x05be
        L_0x05e0:
            r0 = r16
            r0.A01 = r8
            X.1j5 r2 = r0.A0A
            r0 = r17
            int r1 = r0.A00
            r0 = 0
            if (r1 != 0) goto L_0x05ef
            r0 = 8
        L_0x05ef:
            r2.A03(r0)
            r0 = r17
            java.util.List r0 = r0.A05
            r36 = r0
            java.util.Iterator r1 = r36.iterator()
            r8 = 0
        L_0x05fd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0610
            java.lang.Object r0 = r1.next()
            X.1sn r0 = (X.C39631sn) r0
            int r0 = r0.A00
            int r8 = java.lang.Math.max(r8, r0)
            goto L_0x05fd
        L_0x0610:
            java.util.HashMap r18 = new java.util.HashMap
            r18.<init>()
            if (r3 == 0) goto L_0x0663
            int r6 = r3.size()
        L_0x061b:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x0663
            java.lang.Object r5 = r3.get(r6)
            X.1qx r5 = (X.C38541qx) r5
            boolean r0 = r5 instanceof X.C39181s3
            if (r0 == 0) goto L_0x061b
            X.1s3 r5 = (X.C39181s3) r5
            X.1Vw r0 = r5.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x061b
            java.util.List r0 = r5.A05
            java.util.Iterator r4 = r0.iterator()
        L_0x0637:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x061b
            java.lang.Object r2 = r4.next()
            r0 = r18
            java.lang.Object r1 = r0.get(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 != 0) goto L_0x0657
            r0 = 0
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r5, r0)
        L_0x0651:
            r0 = r18
            r0.put(r2, r1)
            goto L_0x0637
        L_0x0657:
            java.lang.Object r0 = r1.second
            if (r0 != 0) goto L_0x0637
            java.lang.Object r0 = r1.first
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r5)
            goto L_0x0651
        L_0x0663:
            r0 = r16
            com.obwhatsapp.WaTextView r1 = r0.A08
            r7 = 1
            r0 = 0
            if (r8 <= 0) goto L_0x066c
            r0 = 1
        L_0x066c:
            r1.setEnabled(r0)
            java.util.List r34 = r16.getHighlightTerms()
            r6 = 0
        L_0x0674:
            int r1 = r36.size()
            r0 = r16
            java.util.List r14 = r0.A0B
            if (r6 >= r1) goto L_0x096d
            int r0 = r14.size()
            int r0 = r0 - r7
            if (r0 >= r6) goto L_0x095d
            android.content.Context r0 = r16.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559582(0x7f0d049e, float:1.8744512E38)
            r0 = 0
            android.view.View r13 = r2.inflate(r1, r0)
            r0 = r16
            X.2TN r1 = r0.A00
            X.2Ao r0 = r0.A09
            r25 = r0
            r0 = r16
            boolean r15 = r0.A0C
            X.2TO r0 = r1.A00
            X.0sX r0 = r0.A03
            X.01J r1 = r0.A05
            java.lang.Object r12 = r1.get()
            X.0pd r12 = (X.C14710pd) r12
            X.01J r1 = r0.AR8
            java.lang.Object r11 = r1.get()
            X.013 r11 = (X.AnonymousClass013) r11
            X.01J r1 = r0.ADr
            java.lang.Object r10 = r1.get()
            X.0sK r10 = (X.C16040sK) r10
            X.01J r1 = r0.A7e
            java.lang.Object r9 = r1.get()
            X.0um r9 = (X.C17250um) r9
            X.01J r1 = r0.APV
            java.lang.Object r4 = r1.get()
            X.0tb r4 = (X.C16760tb) r4
            X.01J r1 = r0.A4x
            java.lang.Object r3 = r1.get()
            X.0sG r3 = (X.C16000sG) r3
            X.01J r1 = r0.AOi
            java.lang.Object r2 = r1.get()
            X.01V r2 = (X.AnonymousClass01V) r2
            X.01J r1 = r0.AIt
            java.lang.Object r1 = r1.get()
            X.1N9 r1 = (X.AnonymousClass1N9) r1
            X.01J r0 = r0.AMG
            java.lang.Object r0 = r0.get()
            X.0u3 r0 = (X.C17020u3) r0
            X.1VX r5 = new X.1VX
            r20 = r5
            r21 = r13
            r22 = r10
            r23 = r4
            r24 = r3
            r26 = r2
            r27 = r11
            r28 = r9
            r29 = r12
            r30 = r1
            r31 = r0
            r32 = r14
            r33 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = r38
            r0.addView(r13)
            r14.add(r5)
        L_0x0714:
            android.content.Context r11 = r16.getContext()
            r0 = r16
            java.util.List r4 = r0.A01
            r0 = r17
            int r0 = r0.A00
            r2 = 0
            if (r0 != 0) goto L_0x0724
            r2 = 1
        L_0x0724:
            r0 = r17
            r5.A01 = r0
            r0 = r36
            java.lang.Object r0 = r0.get(r6)
            X.1sn r0 = (X.C39631sn) r0
            r5.A00 = r0
            java.lang.String r1 = r0.A03
            if (r34 == 0) goto L_0x074a
            X.013 r0 = r5.A0E
            X.2TP r32 = X.AnonymousClass2TP.A01
            r35 = 0
            r30 = r11
            r31 = r0
            r33 = r1
            X.01Q r0 = X.AnonymousClass2TP.A00(r30, r31, r32, r33, r34, r35)
            java.lang.Object r1 = r0.A00
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x074a:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r1)
            X.01V r1 = r5.A0D
            X.0u3 r0 = r5.A0I
            X.C45922Bq.A03(r1, r0, r9)
            android.widget.TextView r3 = r5.A05
            android.text.TextPaint r1 = r3.getPaint()
            X.0um r0 = r5.A0F
            java.lang.CharSequence r0 = X.AnonymousClass2Sy.A03(r11, r1, r0, r9)
            r3.setText(r0)
            X.1j5 r10 = r5.A0K
            r0 = 8
            r10.A03(r0)
            X.1j5 r9 = r5.A0L
            r9.A03(r0)
            X.1j5 r3 = r5.A0J
            r3.A03(r0)
            android.widget.TextView r12 = r5.A06
            X.013 r0 = r5.A0E
            r20 = r0
            java.text.NumberFormat r13 = r20.A0K()
            X.1sn r0 = r5.A00
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.String r0 = r13.format(r0)
            r12.setText(r0)
            android.widget.CheckBox r12 = r5.A04
            r12.setEnabled(r2)
            r0 = r37
            boolean r1 = r0.A02
            r0 = 2131101423(0x7f0606ef, float:1.7815255E38)
            if (r1 == 0) goto L_0x079d
            r0 = 2131101424(0x7f0606f0, float:1.7815257E38)
        L_0x079d:
            android.content.res.ColorStateList r0 = X.AnonymousClass00T.A03(r11, r0)
            X.AnonymousClass06U.A01(r0, r12)
            com.obwhatsapp.components.RoundCornerProgressBarV2 r2 = r5.A0A
            r0 = 2131101231(0x7f06062f, float:1.7814866E38)
            if (r1 == 0) goto L_0x07ae
            r0 = 2131101232(0x7f060630, float:1.7814868E38)
        L_0x07ae:
            int r0 = X.AnonymousClass00T.A00(r11, r0)
            r2.A01 = r0
            r11 = 0
            if (r8 != 0) goto L_0x0944
            r1 = 0
        L_0x07b8:
            int r0 = r2.A02
            if (r1 == r0) goto L_0x0800
            r2.A02 = r1
            android.animation.ValueAnimator r0 = r2.A00
            if (r0 == 0) goto L_0x07cd
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L_0x07cd
            android.animation.ValueAnimator r0 = r2.A00
            r0.cancel()
        L_0x07cd:
            if (r19 == 0) goto L_0x093c
            r0 = 2
            float[] r1 = new float[r0]
            float r0 = r2.A00
            r1[r11] = r0
            int r0 = r2.A02
            float r0 = (float) r0
            r1[r7] = r0
            android.animation.ValueAnimator r13 = android.animation.ValueAnimator.ofFloat(r1)
            r2.A00 = r13
            r0 = 200(0xc8, double:9.9E-322)
            r13.setDuration(r0)
            android.animation.ValueAnimator r1 = r2.A00
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r13 = r2.A00
            r1 = 5
            com.facebook.redex.IDxUListenerShape141S0100000_2_I1 r0 = new com.facebook.redex.IDxUListenerShape141S0100000_2_I1
            r0.<init>(r2, r1)
            r13.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r2.A00
            r0.start()
        L_0x0800:
            android.view.View r2 = r5.A02
            r1 = 14
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.post(r0)
            if (r4 == 0) goto L_0x0937
            X.1sn r0 = r5.A00
            long r0 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0937
            r12.setChecked(r7)
        L_0x081f:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x085a
            boolean r0 = r12.isChecked()
            r14 = 2131755009(0x7f100001, float:1.9140885E38)
            if (r0 == 0) goto L_0x082e
            r14 = 2131755008(0x7f100000, float:1.9140883E38)
        L_0x082e:
            X.1sn r0 = r5.A00
            int r15 = r0.A00
            long r1 = (long) r15
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.String r0 = r0.A03
            r13[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r13[r7] = r0
            r0 = r20
            java.lang.String r0 = r0.A0J(r13, r14, r1)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r5.A07
            r2.setContentDescription(r0)
            boolean r1 = r12.isChecked()
            r0 = 2131886140(0x7f12003c, float:1.940685E38)
            if (r1 == 0) goto L_0x0857
            r0 = 2131886139(0x7f12003b, float:1.9406848E38)
        L_0x0857:
            X.AnonymousClass2JP.A03(r2, r0)
        L_0x085a:
            X.1sn r0 = r5.A00
            if (r0 == 0) goto L_0x08e6
            long r0 = r0.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r18
            java.lang.Object r2 = r0.get(r1)
            android.util.Pair r2 = (android.util.Pair) r2
            if (r4 == 0) goto L_0x0900
            X.1sn r0 = r5.A00
            long r0 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0900
            if (r2 == 0) goto L_0x08ea
            java.lang.Object r0 = r2.first
            if (r0 == 0) goto L_0x08ea
            r10.A03(r11)
            r3.A03(r11)
            android.view.View r4 = r3.A02()
            android.view.View r0 = r3.A02()
            android.content.Context r3 = r0.getContext()
            X.1s2 r0 = r5.A01
            if (r0 == 0) goto L_0x08a1
            X.1Vw r0 = r0.A11
            boolean r1 = r0.A02
            r0 = 2131232326(0x7f080646, float:1.8080758E38)
            if (r1 != 0) goto L_0x08a4
        L_0x08a1:
            r0 = 2131232325(0x7f080645, float:1.8080756E38)
        L_0x08a4:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r3, r0)
            r4.setBackground(r0)
            X.2Ao r3 = r5.A0C
            X.0sK r0 = r5.A08
            r0.A0B()
            X.1Zb r1 = r0.A01
            android.view.View r0 = r10.A02()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A06(r0, r1)
            java.lang.Object r1 = r2.first
        L_0x08bf:
            X.0tZ r1 = (X.C16740tZ) r1
            r9.A03(r11)
            android.view.View r3 = r9.A02()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            X.1Vw r0 = r1.A11
            X.0rv r2 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r2)
            if (r0 == 0) goto L_0x08d8
            X.0rv r2 = r1.A0B()
        L_0x08d8:
            X.AnonymousClass00B.A06(r2)
            X.2Ao r1 = r5.A0C
            X.0sG r0 = r5.A0B
            X.0sH r0 = r0.A0A(r2)
            r1.A06(r3, r0)
        L_0x08e6:
            int r6 = r6 + 1
            goto L_0x0674
        L_0x08ea:
            r9.A03(r11)
            X.2Ao r2 = r5.A0C
            X.0sK r0 = r5.A08
            r0.A0B()
            X.1Zb r1 = r0.A01
            android.view.View r0 = r9.A02()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.A06(r0, r1)
            goto L_0x08e6
        L_0x0900:
            if (r2 == 0) goto L_0x08e6
            java.lang.Object r1 = r2.first
            if (r1 == 0) goto L_0x08e6
            java.lang.Object r0 = r2.second
            if (r0 == 0) goto L_0x08bf
            X.0tZ r1 = (X.C16740tZ) r1
            r10.A03(r11)
            r3.A03(r11)
            android.view.View r4 = r10.A02()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            X.1Vw r0 = r1.A11
            X.0rv r3 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r3)
            if (r0 == 0) goto L_0x0926
            X.0rv r3 = r1.A0B()
        L_0x0926:
            X.AnonymousClass00B.A06(r3)
            X.2Ao r1 = r5.A0C
            X.0sG r0 = r5.A0B
            X.0sH r0 = r0.A0A(r3)
            r1.A06(r4, r0)
            java.lang.Object r1 = r2.second
            goto L_0x08bf
        L_0x0937:
            r12.setChecked(r11)
            goto L_0x081f
        L_0x093c:
            float r0 = (float) r1
            r2.A00 = r0
            r2.invalidate()
            goto L_0x0800
        L_0x0944:
            X.1sn r0 = r5.A00
            int r0 = r0.A00
            r1 = 100
            int r0 = r0 * 100
            int r0 = r0 / r8
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = java.lang.Math.max(r0, r11)
            if (r1 < 0) goto L_0x0965
            r0 = 100
            if (r1 > r0) goto L_0x0965
            goto L_0x07b8
        L_0x095d:
            java.lang.Object r5 = r14.get(r6)
            X.1VX r5 = (X.AnonymousClass1VX) r5
            goto L_0x0714
        L_0x0965:
            java.lang.String r1 = "Progress must be between 0 and 100 inclusive"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x096d:
            int r2 = r14.size()
            int r2 = r2 - r7
        L_0x0972:
            int r0 = r36.size()
            if (r2 < r0) goto L_0x098b
            java.lang.Object r0 = r14.get(r2)
            X.1VX r0 = (X.AnonymousClass1VX) r0
            android.view.View r1 = r0.A02
            r0 = r38
            r0.removeView(r1)
            r14.remove(r2)
            int r2 = r2 + -1
            goto L_0x0972
        L_0x098b:
            r0 = r16
            android.widget.LinearLayout r1 = r0.A05
            boolean r0 = r0.A0C
            if (r0 != 0) goto L_0x0a2b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.res.Resources r8 = r16.getResources()
            r6 = 2131890893(0x7f1212cd, float:1.941649E38)
            r0 = 3
            java.lang.Object[] r5 = new java.lang.Object[r0]
            android.content.Context r9 = r16.getContext()
            r0 = r16
            X.0sG r3 = r0.A0a
            X.0sP r2 = r0.A0d
            r0 = r17
            java.lang.String r2 = X.AnonymousClass2TT.A00(r9, r3, r2, r0)
            r0 = 0
            r5[r0] = r2
            r0 = r16
            X.013 r10 = r0.A0K
            X.0t3 r9 = r0.A0r
            r0 = r17
            long r2 = r0.A0I
            long r2 = r9.A02(r2)
            java.lang.String r0 = X.C47672Jx.A00(r10, r2)
            r5[r7] = r0
            r0 = r17
            java.lang.String r2 = r0.A03
            r0 = 2
            r5[r0] = r2
            java.lang.String r0 = r8.getString(r6, r5)
            r4.append(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = r36
            r6.<init>(r0)
            r3 = 6
            com.facebook.redex.IDxComparatorShape184S0100000_2_I1 r2 = new com.facebook.redex.IDxComparatorShape184S0100000_2_I1
            r0 = r16
            r2.<init>(r0, r3)
            java.util.Collections.sort(r6, r2)
            java.util.Iterator r5 = r6.iterator()
        L_0x09ed:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0a0c
            java.lang.Object r3 = r5.next()
            X.1sn r3 = (X.C39631sn) r3
            java.lang.String r0 = r3.A03
            r4.append(r0)
            java.lang.String r2 = " "
            r4.append(r2)
            int r0 = r3.A00
            r4.append(r0)
            r4.append(r2)
            goto L_0x09ed
        L_0x0a0c:
            r3 = 7
            com.facebook.redex.IDxComparatorShape184S0100000_2_I1 r2 = new com.facebook.redex.IDxComparatorShape184S0100000_2_I1
            r0 = r16
            r2.<init>(r0, r3)
            java.util.Collections.sort(r6, r2)
            android.content.res.Resources r2 = r16.getResources()
            r0 = 2131890897(0x7f1212d1, float:1.9416499E38)
            java.lang.String r0 = r2.getString(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L_0x0abc
        L_0x0a2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r0 = r37
            boolean r0 = r0.A02
            r4 = 2
            r12 = 0
            android.content.res.Resources r9 = r16.getResources()
            if (r0 == 0) goto L_0x0a74
            r8 = 2131890895(0x7f1212cf, float:1.9416495E38)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r0 = r17
            java.lang.String r0 = r0.A03
            r6[r12] = r0
        L_0x0a47:
            java.lang.String r0 = r9.getString(r8, r6)
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            r9 = 0
            java.util.Iterator r6 = r36.iterator()
            r8 = 0
            r2 = 0
        L_0x0a5a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0a92
            java.lang.Object r5 = r6.next()
            X.1sn r5 = (X.C39631sn) r5
            int r0 = r5.A00
            if (r0 <= r8) goto L_0x0a6f
            r8 = r0
            java.lang.String r9 = r5.A03
            r2 = 1
            goto L_0x0a5a
        L_0x0a6f:
            if (r0 != r8) goto L_0x0a5a
            int r2 = r2 + 1
            goto L_0x0a5a
        L_0x0a74:
            r8 = 2131890896(0x7f1212d0, float:1.9416497E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            android.content.Context r10 = r16.getContext()
            r0 = r16
            X.0sG r5 = r0.A0a
            X.0sP r2 = r0.A0d
            r0 = r17
            java.lang.String r0 = X.AnonymousClass2TT.A00(r10, r5, r2, r0)
            r6[r12] = r0
            r0 = r17
            java.lang.String r0 = r0.A03
            r6[r7] = r0
            goto L_0x0a47
        L_0x0a92:
            r0 = r16
            X.013 r11 = r0.A0K
            X.0t3 r10 = r0.A0r
            r0 = r17
            long r5 = r0.A0I
            long r5 = r10.A02(r5)
            java.lang.String r10 = X.C47672Jx.A00(r11, r5)
            if (r8 > 0) goto L_0x0ac0
            android.content.res.Resources r4 = r16.getResources()
            r2 = 2131890894(0x7f1212ce, float:1.9416493E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r12] = r10
            java.lang.String r0 = r4.getString(r2, r0)
        L_0x0ab5:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x0abc:
            r1.setContentDescription(r0)
            return
        L_0x0ac0:
            android.content.res.Resources r6 = r16.getResources()
            if (r2 <= r7) goto L_0x0ad8
            r5 = 2131755288(0x7f100118, float:1.9141451E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2[r12] = r0
            r2[r7] = r10
        L_0x0ad3:
            java.lang.String r0 = r6.getQuantityString(r5, r8, r2)
            goto L_0x0ab5
        L_0x0ad8:
            r5 = 2131755289(0x7f100119, float:1.9141453E38)
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r12] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2[r7] = r0
            r2[r4] = r10
            goto L_0x0ad3
        L_0x0ae9:
            r38.getTag()
            return
        L_0x0aed:
            java.lang.Object r3 = r2.A00
            X.25g r3 = (X.C447225g) r3
            boolean r1 = r2.A02
            java.lang.Object r0 = r2.A01
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            java.lang.String r0 = r0.callId
            boolean r0 = r3.A12(r0)
            r0 = r0 ^ 1
            com.whatsapp.voipcalling.Voip.onCallInterrupted(r1, r0)
            return
        L_0x0b03:
            java.lang.Object r4 = r2.A00
            X.0ye r4 = (X.C19570ye) r4
            java.lang.Object r3 = r2.A01
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r1 = r2.A02
            X.2TU r2 = new X.2TU
            r2.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.A02 = r0
            X.1Gs r0 = r4.A0G
            java.lang.Long r0 = r0.A00()
            r2.A01 = r0
            r0 = 2
            if (r1 == 0) goto L_0x0b28
            r0 = 1
        L_0x0b28:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            X.0t9 r1 = r4.A0F
            boolean r0 = r3 instanceof X.C14620pU
            if (r0 == 0) goto L_0x0b40
            X.0pU r3 = (X.C14620pU) r3
            X.00F r0 = r3.AFf()
        L_0x0b3a:
            int r0 = r0.A03
            r1.A07(r2, r0)
            return
        L_0x0b40:
            X.00F r0 = X.AnonymousClass01S.A03
            goto L_0x0b3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0210000_I0.run():void");
    }
}
