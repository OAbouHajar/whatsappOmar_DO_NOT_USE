package com.facebook.redex;

public class RunnableRunnableShape3S0300000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape3S0300000_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r20 = this;
            r5 = r20
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x09be;
                case 1: goto L_0x09ac;
                case 2: goto L_0x099a;
                case 3: goto L_0x0364;
                case 4: goto L_0x0981;
                case 5: goto L_0x02cd;
                case 6: goto L_0x0954;
                case 7: goto L_0x0930;
                case 8: goto L_0x0930;
                case 9: goto L_0x0908;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x0007;
                case 13: goto L_0x08d9;
                case 14: goto L_0x08ba;
                case 15: goto L_0x0864;
                case 16: goto L_0x0842;
                case 17: goto L_0x076b;
                case 18: goto L_0x0752;
                case 19: goto L_0x022f;
                case 20: goto L_0x01e1;
                case 21: goto L_0x0211;
                case 22: goto L_0x01bb;
                case 23: goto L_0x01a5;
                case 24: goto L_0x0189;
                case 25: goto L_0x0740;
                case 26: goto L_0x072a;
                case 27: goto L_0x0718;
                case 28: goto L_0x06fa;
                case 29: goto L_0x0116;
                case 30: goto L_0x06ea;
                case 31: goto L_0x06da;
                case 32: goto L_0x0562;
                case 33: goto L_0x00cf;
                case 34: goto L_0x054b;
                case 35: goto L_0x0533;
                case 36: goto L_0x0093;
                case 37: goto L_0x0509;
                case 38: goto L_0x0056;
                case 39: goto L_0x04d5;
                case 40: goto L_0x04b3;
                case 41: goto L_0x0499;
                case 42: goto L_0x0020;
                case 43: goto L_0x0395;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r5.A00
            X.1dg r4 = (X.C31201dg) r4
            java.lang.Object r3 = r5.A01
            X.0q1 r3 = (X.C14930q1) r3
            java.lang.Object r2 = r5.A02
            X.0q7 r2 = (X.C14990q7) r2
            X.0q2 r1 = new X.0q2
            r1.<init>()
            r0 = 0
            r1.A03(r4, r0)
            X.C14940q2.A00(r2, r4, r1, r3)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r4 = r5.A00
            X.3gX r4 = (X.C70363gX) r4
            java.lang.Object r2 = r5.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r3 = r5.A02
            r0 = 8
            r2.setVisibility(r0)
            X.1ZK r0 = r4.A04
            X.1cz r0 = r0.A0P
            if (r0 != 0) goto L_0x001f
            r6 = 1
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 1
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 8
            com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1 r0 = new com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1
            r0.<init>(r3, r1, r4)
            r5.setAnimationListener(r0)
            r0 = 213(0xd5, double:1.05E-321)
            r5.setDuration(r0)
            r2.startAnimation(r5)
            return
        L_0x0056:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.text.IDxWAdapterShape23S0200000_2_I1 r0 = (com.obwhatsapp.text.IDxWAdapterShape23S0200000_2_I1) r0
            java.lang.Object r3 = r5.A01
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.Object r2 = r5.A02
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r4 = r0.A00
            com.obwhatsapp.picker.search.StickerSearchDialogFragment r4 = (com.obwhatsapp.picker.search.StickerSearchDialogFragment) r4
            r0 = 0
            r4.A0D = r0
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = r4.A0E
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001f
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = r3.toString()
            if (r0 == 0) goto L_0x0a02
            r4.A0E = r5
            X.3QB r1 = r4.A09
            r0 = 0
            r1.A02 = r0
            r0 = 4
            r2.setVisibility(r0)
            X.3QB r0 = r4.A09
            r0.A05()
            r4.A1N()
            return
        L_0x0093:
            java.lang.Object r3 = r5.A00
            X.3FN r3 = (X.AnonymousClass3FN) r3
            java.lang.Object r6 = r5.A01
            X.2DT r6 = (X.AnonymousClass2DT) r6
            java.lang.Object r4 = r5.A02
            X.0tZ r4 = (X.C16740tZ) r4
            X.0yi r5 = r3.A07
            boolean r0 = r5.A0B()
            if (r0 != 0) goto L_0x001f
            int r1 = X.AnonymousClass2DT.A0x
            r0 = 0
            r2 = 1
            r6.A0B(r1, r0, r2)
            X.0rz r1 = r3.A08
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass2DE.A0B(r1, r0)
            X.2DT r0 = r5.A00()
            if (r0 == 0) goto L_0x00bf
            r0.A0X = r2
        L_0x00bf:
            X.013 r6 = r3.A09
            android.view.View r0 = r3.A00
            X.2Ao r4 = r3.A05
            X.0sK r1 = r3.A02
            X.0sG r2 = r3.A03
            X.0sP r3 = r3.A04
            X.AnonymousClass2DE.A01(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00cf:
            java.lang.Object r1 = r5.A00
            com.facebook.redex.RunnableRunnableShape0S0310000_I0 r1 = (com.facebook.redex.RunnableRunnableShape0S0310000_I0) r1
            java.lang.Object r6 = r5.A01
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.Object r5 = r5.A02
            X.4Ku r5 = (X.C84504Ku) r5
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x001f
            java.lang.Object r4 = r1.A01
            com.obwhatsapp.mediaview.MediaViewFragment r4 = (com.obwhatsapp.mediaview.MediaViewFragment) r4
            X.00l r0 = r4.A0D()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x001f
            if (r6 == 0) goto L_0x00ff
            com.obwhatsapp.mediaview.PhotoView r3 = r5.A00
            X.0tY r2 = r5.A01
            android.content.res.Resources r1 = r4.A03()
            X.3L1 r0 = new X.3L1
            r0.<init>(r1, r6, r2)
            r3.A07(r0)
        L_0x00ff:
            X.0tY r2 = r4.A1M
            if (r2 == 0) goto L_0x001f
            X.0tY r0 = r5.A01
            X.1Vw r1 = r0.A11
            X.1Vw r0 = r2.A11
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001f
            r0 = 1
            r4.A1f = r0
            com.obwhatsapp.mediaview.MediaViewFragment.A05(r4)
            return
        L_0x0116:
            java.lang.Object r2 = r5.A00
            X.4z5 r2 = (X.C102524z5) r2
            java.lang.Object r6 = r5.A01
            X.0pN r6 = (X.C14550pN) r6
            java.lang.Object r0 = r5.A02
            java.util.Set r0 = (java.util.Set) r0
            r6.Ac1()
            java.util.Iterator r4 = r0.iterator()
        L_0x0129:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            int r3 = X.AnonymousClass000.A0D(r0)
            r0 = -1
            if (r3 == r0) goto L_0x0165
            r0 = 400(0x190, float:5.6E-43)
            r1 = 2131892368(0x7f121890, float:1.9419482E38)
            if (r3 == r0) goto L_0x0162
            r0 = 404(0x194, float:5.66E-43)
            r1 = 2131892369(0x7f121891, float:1.9419484E38)
            if (r3 == r0) goto L_0x0162
            r8 = 2131892371(0x7f121893, float:1.9419488E38)
            r9 = 2131892370(0x7f121892, float:1.9419486E38)
            r10 = 2131888712(0x7f120a48, float:1.9412067E38)
            r11 = 2131886996(0x7f120394, float:1.9408587E38)
            r0 = 4
            com.facebook.redex.IDxCListenerShape238S0100000_2_I1 r7 = new com.facebook.redex.IDxCListenerShape238S0100000_2_I1
            r7.<init>(r6, r0)
            r6.A2b(r7, r8, r9, r10, r11)
            goto L_0x0129
        L_0x0162:
            r6.Afg(r1)
        L_0x0165:
            com.facebook.redex.RunnableRunnableShape1S0700000_I1 r0 = r2.A00
            java.lang.Object r1 = r0.A00
            X.127 r1 = (X.AnonymousClass127) r1
            java.lang.Object r0 = r0.A03
            X.0rv r0 = (X.C15830rv) r0
            r1.A04(r0)
            r0 = 2131364315(0x7f0a09db, float:1.8348464E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r6, r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131365724(0x7f0a0f5c, float:1.8351321E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r6, r0)
            r0.setVisibility(r1)
            goto L_0x0129
        L_0x0189:
            java.lang.Object r0 = r5.A00
            X.4Qo r0 = (X.C85934Qo) r0
            java.lang.Object r6 = r5.A01
            X.58D r6 = (X.AnonymousClass58D) r6
            java.lang.Object r4 = r5.A02
            java.lang.Object r3 = r6.call()     // Catch:{ 057 -> 0x001f }
            android.os.Handler r2 = r0.A00     // Catch:{ 057 -> 0x001f }
            r1 = 23
            com.facebook.redex.RunnableRunnableShape3S0300000_I1 r0 = new com.facebook.redex.RunnableRunnableShape3S0300000_I1     // Catch:{ 057 -> 0x001f }
            r0.<init>(r6, r4, r3, r1)     // Catch:{ 057 -> 0x001f }
            r2.post(r0)     // Catch:{ 057 -> 0x001f }
            goto L_0x0a32
        L_0x01a5:
            java.lang.Object r0 = r5.A00
            X.58D r0 = (X.AnonymousClass58D) r0
            java.lang.Object r2 = r5.A01
            X.5PR r2 = (X.AnonymousClass5PR) r2
            java.lang.Object r1 = r5.A02
            X.024 r0 = r0.A00
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x001f
            r2.AOt(r1)
            return
        L_0x01bb:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r4 = (com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r4
            java.lang.Object r2 = r5.A01
            X.0rv r2 = (X.C15830rv) r2
            java.lang.Object r3 = r5.A02
            X.028 r3 = (X.AnonymousClass028) r3
            X.15H r1 = r4.A03
            r0 = r2
            X.1ZX r0 = (X.AnonymousClass1ZX) r0
            java.lang.Boolean r1 = r1.A01(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ed
            X.3pB r0 = new X.3pB
            r0.<init>(r2)
            r3.A09(r0)
            return
        L_0x01e1:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r4 = (com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r4
            java.lang.Object r2 = r5.A01
            X.0rv r2 = (X.C15830rv) r2
            java.lang.Object r3 = r5.A02
            X.028 r3 = (X.AnonymousClass028) r3
        L_0x01ed:
            X.0sK r0 = r4.A00
            r0.A0B()
            X.1Zb r1 = r0.A01
            X.0sG r0 = r4.A01
            X.0sH r0 = r0.A08(r2)
            if (r1 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001f
            java.lang.String r2 = X.C24561Gk.A01(r1)
            if (r2 == 0) goto L_0x001f
            boolean r1 = r0.A0H()
            X.3pC r0 = new X.3pC
            r0.<init>(r2, r1)
            r3.A09(r0)
            return
        L_0x0211:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r3 = (com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r3
            java.lang.Object r1 = r5.A01
            X.0rv r1 = (X.C15830rv) r1
            java.lang.Object r2 = r5.A02
            X.028 r2 = (X.AnonymousClass028) r2
            X.0sG r0 = r3.A01
            X.0sH r1 = r0.A08(r1)
            if (r1 == 0) goto L_0x001f
            X.0sP r0 = r3.A02
            java.lang.String r0 = r0.A0F(r1)
            r2.A09(r0)
            return
        L_0x022f:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0 r4 = (com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0) r4
            java.lang.Object r3 = r5.A01
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r5.A02
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r3.size()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x0248:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x028a
            X.0tZ r1 = X.C13680ns.A0V(r6)
            X.1Vw r0 = r1.A11
            X.0rv r5 = r0.A00
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0248
            int r1 = r1.A0C
            r0 = 16
            if (r1 == r0) goto L_0x0248
            r0 = 18
            if (r1 == r0) goto L_0x0248
            r0 = 17
            if (r1 == r0) goto L_0x0248
            r0 = 9
            if (r1 == r0) goto L_0x0248
            r0 = 10
            if (r1 == r0) goto L_0x0248
            boolean r0 = r3.containsKey(r5)
            if (r0 == 0) goto L_0x0248
            r1 = 1
            boolean r0 = r2.containsKey(r5)
            if (r0 == 0) goto L_0x0286
            java.lang.Object r0 = r2.get(r5)
            int r0 = X.AnonymousClass000.A0D(r0)
            int r1 = r1 + r0
        L_0x0286:
            X.C13680ns.A1X(r5, r2, r1)
            goto L_0x0248
        L_0x028a:
            java.lang.Object r0 = r4.A00
            X.15I r0 = (X.AnonymousClass15I) r0
            android.content.SharedPreferences r5 = r0.A05()
            java.util.Iterator r6 = X.C13690nt.A0j(r2)
        L_0x0296:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x001f
            java.util.Map$Entry r1 = X.AnonymousClass000.A0z(r6)
            java.lang.Object r0 = r1.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r4 = r0.getRawString()
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r5.getString(r4, r0)
            X.2D4 r3 = X.AnonymousClass2D4.A00(r0)
            java.lang.Long r2 = r3.A0C
            java.lang.Object r0 = r1.getValue()
            int r0 = X.AnonymousClass000.A0D(r0)
            long r0 = (long) r0
            long r0 = X.AnonymousClass2D6.A00(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0C = r0
            X.AnonymousClass15I.A00(r5, r3, r4)
            goto L_0x0296
        L_0x02cd:
            java.lang.Object r1 = r5.A00
            com.facebook.redex.IDxDListenerShape58S0200000_2_I1 r1 = (com.facebook.redex.IDxDListenerShape58S0200000_2_I1) r1
            java.lang.Object r5 = r5.A02
            X.0u3 r5 = (X.C17020u3) r5
            java.lang.Object r0 = r1.A00
            X.4mg r0 = (X.C95464mg) r0
            X.3BH r11 = r0.A01
            X.4bP[] r4 = r11.A0S
            int r0 = r11.A00
            r0 = r4[r0]
            int r3 = r0.A00()
            r2 = 0
            r1 = 0
        L_0x02e7:
            if (r1 >= r3) goto L_0x001f
            int r0 = r11.A00
            r0 = r4[r0]
            int[] r7 = r0.A01(r5, r1)
            X.20a r0 = new X.20a
            r0.<init>(r7)
            long r13 = com.obwhatsapp.emoji.EmojiDescriptor.A00(r0, r2)
            r8 = 0
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0339
            int r0 = r11.A00
            r0 = r4[r0]
            int[] r10 = r0.A01(r5, r1)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0o()
            int r9 = r10.length
            r6 = 0
        L_0x030e:
            if (r6 >= r9) goto L_0x031d
            r0 = r10[r6]
            X.AnonymousClass000.A1J(r8, r0)
            r0 = 32
            r8.append(r0)
            int r6 = r6 + 1
            goto L_0x030e
        L_0x031d:
            java.lang.String r0 = "bad emoji on page "
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0r(r0)
            int r0 = r11.A00
            r6.append(r0)
            java.lang.String r0 = " index "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = ": "
            java.lang.String r0 = X.AnonymousClass000.A0e(r8, r0, r6)
            X.AnonymousClass00B.A0B(r0, r2)
        L_0x0339:
            java.util.HashMap r6 = X.AnonymousClass3BH.A0Y
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            java.lang.Object r0 = r6.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x034d
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0361
        L_0x034d:
            r10 = 0
            X.20a r12 = new X.20a
            r12.<init>(r7)
            X.4Lk r9 = new X.4Lk
            r9.<init>(r10, r11, r12, r13)
            X.2nf r0 = X.AnonymousClass3BH.A0V
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r2, r2, r9)
            r0.sendToTarget()
        L_0x0361:
            int r1 = r1 + 1
            goto L_0x02e7
        L_0x0364:
            java.lang.Object r3 = r5.A00
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x001f
            java.lang.Object r2 = r5.A02
            com.google.android.material.appbar.HeaderBehavior r2 = (com.google.android.material.appbar.HeaderBehavior) r2
            android.widget.OverScroller r0 = r2.A04
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.computeScrollOffset()
            java.lang.Object r1 = r5.A01
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r1
            if (r0 == 0) goto L_0x0389
            android.widget.OverScroller r0 = r2.A04
            int r0 = r0.getCurrY()
            r2.A0M(r3, r1, r0)
            r3.postOnAnimation(r5)
            return
        L_0x0389:
            boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r0 == 0) goto L_0x001f
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r2 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r2
            com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
            r2.A0O(r1, r3)
            return
        L_0x0395:
            java.lang.Object r1 = r5.A00
            X.3Dt r1 = (X.C62493Dt) r1
            java.lang.Object r12 = r5.A01
            com.facebook.msys.mci.DataTask r12 = (com.facebook.msys.mci.DataTask) r12
            java.lang.Object r5 = r5.A02
            com.facebook.msys.mci.NetworkSession r5 = (com.facebook.msys.mci.NetworkSession) r5
            int r2 = r12.mTaskType
            if (r2 == 0) goto L_0x0460
            r11 = 1
            if (r2 == r11) goto L_0x042a
            r0 = 2
            if (r2 == r0) goto L_0x0460
            r0 = 3
            if (r2 == r0) goto L_0x03ec
            r0 = 4
            if (r2 != r0) goto L_0x03d7
            X.1z9 r4 = r1.A00
            java.util.Map r3 = r4.A07     // Catch:{ IOException -> 0x03c5 }
            java.lang.String r2 = r12.mTaskIdentifier     // Catch:{ IOException -> 0x03c5 }
            X.4J6 r1 = new X.4J6     // Catch:{ IOException -> 0x03c5 }
            r1.<init>(r12, r4)     // Catch:{ IOException -> 0x03c5 }
            X.39L r0 = new X.39L     // Catch:{ IOException -> 0x03c5 }
            r0.<init>(r12, r5, r1, r4)     // Catch:{ IOException -> 0x03c5 }
            r3.put(r2, r0)     // Catch:{ IOException -> 0x03c5 }
            return
        L_0x03c5:
            r2 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = "Failed to create StreamingUploadDataTask"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x03d7:
            java.lang.String r0 = "DataTask type "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = " not yet supported"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x03ec:
            X.1z9 r4 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r12.mUrlRequest
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0491 }
            r8.<init>()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0491 }
            java.lang.String r2 = r12.mContentUrl     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = "file://"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replaceFirst(r1, r0)     // Catch:{ all -> 0x0425 }
            java.io.File r0 = X.C13700nu.A0D(r0)     // Catch:{ all -> 0x0425 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0425 }
            r7.<init>(r0)     // Catch:{ all -> 0x0425 }
            java.lang.String r9 = r12.mTaskIdentifier     // Catch:{ all -> 0x0425 }
            r10 = 1
            r11 = 0
            com.facebook.msys.mci.UrlResponse r14 = r4.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0425 }
            byte[] r16 = r8.toByteArray()     // Catch:{ all -> 0x0425 }
            java.lang.String r15 = "wa-msys/NetworkSession: "
            r17 = 0
            r19 = 0
            r13 = r5
            r18 = r17
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0425 }
            r8.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0491 }
            return
        L_0x0425:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0429 }
        L_0x0429:
            throw r0     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x0491 }
        L_0x042a:
            X.1z9 r4 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r12.mUrlRequest
            java.lang.String r1 = "NetworkSessionDownload"
            r7 = 0
            java.io.File r0 = r4.A06     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x045b }
            java.io.File r0 = java.io.File.createTempFile(r1, r7, r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x045b }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x045b }
            r8.<init>(r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x045b }
            java.lang.String r9 = r12.mTaskIdentifier     // Catch:{ all -> 0x0456 }
            r10 = 0
            com.facebook.msys.mci.UrlResponse r14 = r4.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0456 }
            java.lang.String r15 = "wa-msys/NetworkSession: "
            r18 = r7
            r19 = 0
            r13 = r5
            r16 = r7
            r17 = r0
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0456 }
            r8.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x045b }
            return
        L_0x0456:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x045a }
        L_0x045a:
            throw r0     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x045b }
        L_0x045b:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleDownloadDataTask"
            goto L_0x0495
        L_0x0460:
            X.1z9 r4 = r1.A00
            com.facebook.msys.mci.UrlRequest r6 = r12.mUrlRequest
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x048c }
            r8.<init>()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x048c }
            java.lang.String r9 = r12.mTaskIdentifier     // Catch:{ all -> 0x0487 }
            r10 = 1
            r11 = 0
            r7 = 0
            com.facebook.msys.mci.UrlResponse r14 = r4.A00(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0487 }
            byte[] r16 = r8.toByteArray()     // Catch:{ all -> 0x0487 }
            java.lang.String r15 = "wa-msys/NetworkSession: "
            r18 = r7
            r19 = 0
            r13 = r5
            r17 = r7
            com.facebook.msys.mci.NetworkUtils.markDataTaskCompleted(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0487 }
            r8.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x048c }
            return
        L_0x0487:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x048b }
        L_0x048b:
            throw r0     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x048c }
        L_0x048c:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleDataDataTask"
            goto L_0x0495
        L_0x0491:
            r1 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleUploadDataTask"
        L_0x0495:
            X.C13680ns.A1Q(r12, r5, r6, r0, r1)
            return
        L_0x0499:
            java.lang.Object r0 = r5.A00
            X.4ku r0 = (X.C94434ku) r0
            java.lang.Object r3 = r5.A01
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = r5.A02
            X.1bx r2 = (X.C30211bx) r2
            X.1ZL r1 = r0.A02
            java.util.List r0 = r1.A0J
            r0.clear()
            r0.addAll(r3)
            r1.A05(r2, r0)
            return
        L_0x04b3:
            java.lang.Object r3 = r5.A01
            X.2FP r3 = (X.AnonymousClass2FP) r3
            java.lang.Object r1 = r5.A00
            X.37B r1 = (X.AnonymousClass37B) r1
            boolean r0 = r1.A0H
            java.lang.String r2 = r1.A0D
            r3.AHn(r2, r0)
            java.lang.Object r0 = r5.A02
            X.01Q r0 = (X.AnonymousClass01Q) r0
            java.lang.Object r1 = r0.A00
            X.AnonymousClass00B.A06(r1)
            X.427 r1 = (X.AnonymousClass427) r1
            java.lang.Object r0 = r0.A01
            X.1lJ r0 = (X.C35061lJ) r0
            r3.AOn(r0, r1, r2)
            return
        L_0x04d5:
            java.lang.Object r7 = r5.A00
            X.4NR r7 = (X.AnonymousClass4NR) r7
            java.lang.Object r6 = r5.A01
            X.22J r6 = (X.AnonymousClass22J) r6
            java.lang.Object r5 = r5.A02
            X.22J r5 = (X.AnonymousClass22J) r5
            X.01J r0 = r7.A04
            java.lang.Object r3 = r0.get()
            X.4Ia r3 = (X.C83784Ia) r3
            X.13Y r2 = r3.A01
            r1 = 1
            com.facebook.redex.IDxRProviderShape347S0100000_2_I1 r0 = new com.facebook.redex.IDxRProviderShape347S0100000_2_I1
            r0.<init>(r3, r1)
            X.4ys r4 = r2.A71(r0)
            X.3Ir r3 = new X.3Ir
            r3.<init>(r7, r6, r5)
            X.5Fb r2 = new X.5Fb
            r2.<init>(r7, r6)
            r1 = 0
            com.facebook.redex.IDxRCallbacksShape75S0200000_2_I1 r0 = new com.facebook.redex.IDxRCallbacksShape75S0200000_2_I1
            r0.<init>(r3, r1, r2)
            r4.Aah(r0)
            return
        L_0x0509:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.payments.model.BipProcessActionViewModel r0 = (com.obwhatsapp.payments.model.BipProcessActionViewModel) r0
            java.lang.Object r1 = r5.A01
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            java.lang.Object r2 = r5.A02
            android.view.View r2 = (android.view.View) r2
            X.1Oq r0 = r0.A04
            java.lang.String r1 = r1.A0K
            X.16r r0 = r0.A00
            X.1Vt r0 = r0.A0L(r1)
            if (r0 == 0) goto L_0x052b
            int r1 = r0.A02
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x0531
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L_0x0531
        L_0x052b:
            r0 = 8
        L_0x052d:
            r2.setVisibility(r0)
            return
        L_0x0531:
            r0 = 0
            goto L_0x052d
        L_0x0533:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.notification.MessageOTPNotificationBroadcastReceiver r0 = (com.obwhatsapp.notification.MessageOTPNotificationBroadcastReceiver) r0
            java.lang.Object r3 = r5.A01
            X.0tZ r3 = (X.C16740tZ) r3
            java.lang.Object r2 = r5.A02
            android.content.Context r2 = (android.content.Context) r2
            X.17V r1 = r0.A02
            X.1cb r3 = (X.C30571cb) r3
            java.lang.Integer r0 = X.C13680ns.A0X()
            r1.A04(r2, r3, r0)
            return
        L_0x054b:
            java.lang.Object r3 = r5.A00
            X.1DI r3 = (X.AnonymousClass1DI) r3
            java.lang.Object r2 = r5.A01
            X.0rv r2 = (X.C15830rv) r2
            java.lang.Object r0 = r5.A02
            X.1cE r0 = (X.C30361cE) r0
            java.util.Map r0 = r0.A04
            int r1 = r0.size()
            r0 = 2
            r3.A00(r2, r1, r0)
            return
        L_0x0562:
            java.lang.Object r4 = r5.A00
            X.4OF r4 = (X.AnonymousClass4OF) r4
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r8 = r5.A02
            X.028 r8 = (X.AnonymousClass028) r8
            X.4Kr r3 = new X.4Kr
            r3.<init>(r4)
            java.util.Iterator r15 = r0.iterator()
        L_0x0577:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x06d6
            java.lang.Object r2 = r15.next()
            android.net.Uri r2 = (android.net.Uri) r2
            X.29Q r0 = r4.A02
            X.20I r1 = r0.A00(r2)
            java.io.File r0 = r1.A05()
            if (r0 != 0) goto L_0x05ac
            X.1A9 r5 = r4.A05     // Catch:{ IOException -> 0x059b }
            java.io.File r0 = r5.A0Z(r2)     // Catch:{ IOException -> 0x059b }
            java.util.Collection r5 = r3.A00     // Catch:{ IOException -> 0x059b }
            r5.add(r0)     // Catch:{ IOException -> 0x059b }
            goto L_0x05aa
        L_0x059b:
            r6 = move-exception
            java.util.Set r5 = r3.A01
            r5.add(r2)
            java.lang.String r5 = "MediaFilesLoader/Cannot get file for "
            java.lang.String r5 = X.AnonymousClass000.A0g(r5, r2)
            com.whatsapp.util.Log.e(r5, r6)
        L_0x05aa:
            if (r0 == 0) goto L_0x0577
        L_0x05ac:
            r1.A0B(r0)
            X.0vv r5 = r4.A03
            byte r10 = r5.A01(r1)
            java.lang.Byte r5 = java.lang.Byte.valueOf(r10)
            r1.A0C(r5)
            r9 = 13
            r6 = 3
            r7 = 1
            if (r10 == r7) goto L_0x0577
            if (r10 == r6) goto L_0x05d8
            if (r10 == r9) goto L_0x05d8
            java.util.Set r5 = r3.A01
            r5.add(r2)
            java.lang.String r5 = "MediaFilesLoader/Bad type "
            java.lang.String r5 = X.AnonymousClass000.A0g(r5, r2)
            com.whatsapp.util.Log.e((java.lang.String) r5)
            if (r10 == r6) goto L_0x05d8
            if (r10 != r9) goto L_0x0577
        L_0x05d8:
            X.0pd r10 = r4.A01
            r5 = 422(0x1a6, float:5.91E-43)
            X.0tM r9 = X.C16620tM.A02
            boolean r14 = r10.A0E(r9, r5)
            java.lang.String r11 = "videotranscoder/isisomedia/"
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ IOException -> 0x061e }
            r12.<init>(r0)     // Catch:{ IOException -> 0x061e }
            r5 = 4
            byte[] r13 = new byte[r5]     // Catch:{ all -> 0x0619 }
            r5 = 4
            r12.skip(r5)     // Catch:{ all -> 0x0619 }
            r12.read(r13)     // Catch:{ all -> 0x0619 }
            byte[] r5 = X.C43291zl.A0N     // Catch:{ all -> 0x0619 }
            boolean r5 = java.util.Arrays.equals(r13, r5)     // Catch:{ all -> 0x0619 }
            if (r5 != 0) goto L_0x0615
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0q(r11)     // Catch:{ all -> 0x0619 }
            java.lang.String r5 = r0.getAbsolutePath()     // Catch:{ all -> 0x0619 }
            r6.append(r5)     // Catch:{ all -> 0x0619 }
            java.lang.String r5 = " is not iso base media container"
            java.lang.String r5 = X.AnonymousClass000.A0h(r5, r6)     // Catch:{ all -> 0x0619 }
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ all -> 0x0619 }
            r12.close()     // Catch:{ IOException -> 0x061e }
            goto L_0x0622
        L_0x0615:
            r12.close()     // Catch:{ IOException -> 0x061e }
            goto L_0x0636
        L_0x0619:
            r5 = move-exception
            r12.close()     // Catch:{ all -> 0x061d }
        L_0x061d:
            throw r5     // Catch:{ IOException -> 0x061e }
        L_0x061e:
            r5 = move-exception
            com.whatsapp.util.Log.w(r11, r5)
        L_0x0622:
            int r5 = X.C43291zl.A01(r14)
            if (r5 == r7) goto L_0x0636
            java.util.Set r5 = r3.A01
            r5.add(r2)
            java.lang.String r5 = "MediaFilesLoader/Cannot transcode or trim "
            java.lang.String r5 = X.AnonymousClass000.A0g(r5, r2)
            com.whatsapp.util.Log.e((java.lang.String) r5)
        L_0x0636:
            X.0u3 r12 = r4.A04
            X.01V r11 = r4.A00
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r5 = "samsung"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x066d
            int r6 = X.C42971z5.A02(r11, r12)
            r5 = 2016(0x7e0, float:2.825E-42)
            if (r6 >= r5) goto L_0x066d
            r11 = 0
        L_0x064e:
            int r5 = android.media.MediaCodecList.getCodecCount()
            if (r11 >= r5) goto L_0x066d
            android.media.MediaCodecInfo r5 = android.media.MediaCodecList.getCodecInfoAt(r11)
            java.lang.String r6 = r5.getName()
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r5)
            java.lang.String r5 = "exynos"
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L_0x06ab
            int r11 = r11 + 1
            goto L_0x064e
        L_0x066d:
            r5 = 2917(0xb65, float:4.088E-42)
            java.lang.String r5 = r10.A06(r9, r5)
            boolean r5 = X.C41971wz.A0B(r5)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x06ab
            X.2s2 r5 = new X.2s2
            r5.<init>()
            android.net.Uri r10 = android.net.Uri.fromFile(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x06a2 }
            r11 = 0
            long r13 = r0.length()     // Catch:{ IOException | IllegalArgumentException -> 0x06a2 }
            X.3AL r9 = new X.3AL     // Catch:{ IOException | IllegalArgumentException -> 0x06a2 }
            r9.<init>(r10, r11, r13)     // Catch:{ IOException | IllegalArgumentException -> 0x06a2 }
            long r13 = r5.AZr(r9)     // Catch:{ IOException | IllegalArgumentException -> 0x06a2 }
            X.4od r9 = new X.4od     // Catch:{ IOException | IllegalArgumentException -> 0x06a2 }
            r10 = r5
            r9.<init>(r10, r11, r13)     // Catch:{ IOException | IllegalArgumentException -> 0x06a2 }
            r6 = 0
            boolean r6 = X.AnonymousClass4YJ.A00(r9, r6)     // Catch:{ IOException | IllegalArgumentException -> 0x06a2 }
            r5.close()     // Catch:{ IOException -> 0x06ad }
            goto L_0x06ad
        L_0x06a2:
            r7 = move-exception
            java.lang.String r6 = "ExoPlayerVideoPlayer/canExtractVideo"
            com.whatsapp.util.Log.e(r6, r7)     // Catch:{ all -> 0x06ce }
            r5.close()     // Catch:{ IOException -> 0x06ab }
        L_0x06ab:
            r7 = 0
            goto L_0x06af
        L_0x06ad:
            if (r6 == 0) goto L_0x06ab
        L_0x06af:
            monitor-enter(r1)
            r1.A0D = r7     // Catch:{ all -> 0x06d3 }
            monitor-exit(r1)
            X.1xA r5 = new X.1xA     // Catch:{ 1xB -> 0x06c1 }
            r5.<init>(r0)     // Catch:{ 1xB -> 0x06c1 }
            monitor-enter(r1)     // Catch:{ 1xB -> 0x06c1 }
            r1.A05 = r5     // Catch:{ all -> 0x06be }
            monitor-exit(r1)     // Catch:{ 1xB -> 0x06c1 }
            goto L_0x0577
        L_0x06be:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ 1xB -> 0x06c1 }
            throw r0     // Catch:{ 1xB -> 0x06c1 }
        L_0x06c1:
            r1 = move-exception
            java.lang.String r0 = "MediaFilesLoader/Bad video"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.Set r0 = r3.A01
            r0.add(r2)
            goto L_0x0577
        L_0x06ce:
            r0 = move-exception
            r5.close()     // Catch:{ IOException -> 0x06d2 }
        L_0x06d2:
            throw r0
        L_0x06d3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x06d6:
            r8.A09(r3)
            return
        L_0x06da:
            java.lang.Object r2 = r5.A00
            X.3Ak r2 = (X.AnonymousClass3Ak) r2
            java.lang.Object r1 = r5.A01
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r5.A02
            java.util.Map r0 = (java.util.Map) r0
            r2.A0B(r1, r0)
            return
        L_0x06ea:
            java.lang.Object r2 = r5.A00
            X.3Ak r2 = (X.AnonymousClass3Ak) r2
            java.lang.Object r1 = r5.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r5.A02
            java.util.Map r0 = (java.util.Map) r0
            r2.A0A(r1, r0)
            return
        L_0x06fa:
            java.lang.Object r3 = r5.A00
            X.0zJ r3 = (X.C19980zJ) r3
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r5.A02
            X.2X7 r0 = (X.AnonymousClass2X7) r0
            android.content.Context r2 = r1.getContext()
            android.content.Context r1 = r1.getContext()
            X.0sL r0 = r0.A00
            android.content.Intent r0 = X.C14750ph.A0N(r1, r0)
            r3.A06(r2, r0)
            return
        L_0x0718:
            java.lang.Object r2 = r5.A00
            X.2OW r2 = (X.AnonymousClass2OW) r2
            java.lang.Object r1 = r5.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r0 = r5.A02
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r2.AY3(r1, r0)
            return
        L_0x072a:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.deeplink.DeepLinkActivity r0 = (com.obwhatsapp.deeplink.DeepLinkActivity) r0
            java.lang.Object r2 = r5.A01
            X.0rv r2 = (X.C15830rv) r2
            java.lang.Object r1 = r5.A02
            X.0rv r1 = (X.C15830rv) r1
            X.0vJ r0 = r0.A0S
            X.1ZX r2 = (X.AnonymousClass1ZX) r2
            X.1ZT r1 = (X.AnonymousClass1ZT) r1
            r0.A03(r2, r1)
            return
        L_0x0740:
            java.lang.Object r0 = r5.A00
            X.4gQ r0 = (X.C91744gQ) r0
            java.lang.Object r2 = r5.A01
            X.1WN r2 = (X.AnonymousClass1WN) r2
            java.lang.Object r1 = r5.A02
            android.location.Location r1 = (android.location.Location) r1
            X.0yO r0 = r0.A01
            r0.A08(r1, r2)
            return
        L_0x0752:
            java.lang.Object r0 = r5.A00
            X.4Qn r0 = (X.C85924Qn) r0
            java.lang.Object r2 = r5.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r5.A02
            X.1kE r1 = (X.C34421kE) r1
            X.1Gh r0 = r0.A00
            X.1Gg r0 = r0.A05
            r0.A01(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A02(r0)
            return
        L_0x076b:
            java.lang.Object r8 = r5.A00
            X.4HV r8 = (X.AnonymousClass4HV) r8
            java.lang.Object r7 = r5.A01
            X.0sL r7 = (X.C16050sL) r7
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            X.1L5 r11 = r8.A00
            X.15d r9 = r11.A06
            monitor-enter(r9)
            java.util.List r0 = r9.A00(r7)     // Catch:{ all -> 0x083f }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x083f }
            r4.<init>(r0)     // Catch:{ all -> 0x083f }
            java.util.HashSet r3 = X.C13680ns.A0o()     // Catch:{ all -> 0x083f }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x083f }
        L_0x078d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x083f }
            if (r0 == 0) goto L_0x07a3
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x083f }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x083f }
            X.14v r0 = r9.A00     // Catch:{ all -> 0x083f }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x083f }
            X.C13700nu.A0d(r3, r0)     // Catch:{ all -> 0x083f }
            goto L_0x078d
        L_0x07a3:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x083f }
            r2.<init>(r3)     // Catch:{ all -> 0x083f }
            r10 = 1
            com.facebook.redex.IDxPredicateShape413S0100000_2_I1 r0 = new com.facebook.redex.IDxPredicateShape413S0100000_2_I1     // Catch:{ all -> 0x083f }
            r0.<init>(r4, r10)     // Catch:{ all -> 0x083f }
            X.C43041zF.A02(r0, r2)     // Catch:{ all -> 0x083f }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x083f }
            r12.<init>(r4)     // Catch:{ all -> 0x083f }
            com.facebook.redex.IDxPredicateShape413S0100000_2_I1 r0 = new com.facebook.redex.IDxPredicateShape413S0100000_2_I1     // Catch:{ all -> 0x083f }
            r0.<init>(r3, r10)     // Catch:{ all -> 0x083f }
            X.C43041zF.A02(r0, r12)     // Catch:{ all -> 0x083f }
            int r0 = r2.size()     // Catch:{ all -> 0x083f }
            if (r0 != 0) goto L_0x07cb
            int r0 = r12.size()     // Catch:{ all -> 0x083f }
            if (r0 != 0) goto L_0x07cb
            goto L_0x0831
        L_0x07cb:
            X.0tq r0 = r9.A01     // Catch:{ all -> 0x083f }
            X.0tf r6 = r0.A02()     // Catch:{ all -> 0x083f }
            X.14v r0 = r9.A00     // Catch:{ all -> 0x083a }
            long r0 = r0.A01(r7)     // Catch:{ all -> 0x083a }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x083a }
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x083a }
        L_0x07df:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x083a }
            r4 = 2
            if (r0 == 0) goto L_0x0805
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x083a }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x083a }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x083a }
            r3.<init>(r4)     // Catch:{ all -> 0x083a }
            java.lang.String r0 = "parent_group_jid_row_id"
            r3.put(r0, r5)     // Catch:{ all -> 0x083a }
            java.lang.String r0 = "user_jid_row_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x083a }
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x083a }
            java.lang.String r1 = "parent_group_participants"
            r0 = 5
            r2.A06(r3, r1, r0)     // Catch:{ all -> 0x083a }
            goto L_0x07df
        L_0x0805:
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x083a }
        L_0x0809:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x083a }
            if (r0 == 0) goto L_0x082e
            java.lang.Object r2 = r12.next()     // Catch:{ all -> 0x083a }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x083a }
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ all -> 0x083a }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x083a }
            r3[r1] = r0     // Catch:{ all -> 0x083a }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x083a }
            r3[r10] = r0     // Catch:{ all -> 0x083a }
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x083a }
            java.lang.String r1 = "parent_group_participants"
            java.lang.String r0 = "parent_group_jid_row_id = ? AND user_jid_row_id = ?"
            r2.A01(r1, r0, r3)     // Catch:{ all -> 0x083a }
            goto L_0x0809
        L_0x082e:
            r6.close()     // Catch:{ all -> 0x083f }
        L_0x0831:
            monitor-exit(r9)
            X.0pt r1 = r11.A01
            r0 = 26
            X.C14870pt.A02(r1, r8, r7, r0)
            return
        L_0x083a:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x083e }
        L_0x083e:
            throw r0     // Catch:{ all -> 0x083f }
        L_0x083f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0842:
            java.lang.Object r3 = r5.A00
            X.26O r3 = (X.AnonymousClass26O) r3
            java.lang.Object r2 = r5.A01
            X.22J r2 = (X.AnonymousClass22J) r2
            java.lang.Object r0 = r5.A02
            X.4Ri r0 = (X.C86134Ri) r0
            X.C18450wi.A0J(r2, r0)
            if (r3 != 0) goto L_0x0859
            X.3ne r0 = X.C73293ne.A00
            r2.AIU(r0)
            return
        L_0x0859:
            X.4vn r1 = new X.4vn
            r1.<init>(r0, r2)
            X.0xE r0 = r0.A01
            r0.A01(r1, r3)
            return
        L_0x0864:
            java.lang.Object r7 = r5.A00
            com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel r7 = (com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel) r7
            java.lang.Object r6 = r5.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r5.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            java.util.Iterator r2 = r6.iterator()
        L_0x087d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x088f
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C73123nL
            if (r0 == 0) goto L_0x087d
            r8.add(r1)
            goto L_0x087d
        L_0x088f:
            java.util.ArrayList r3 = X.AnonymousClass1J9.A0N(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x0897:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x08ab
            java.lang.Object r0 = r1.next()
            X.3nL r0 = (X.C73123nL) r0
            X.4N4 r0 = r0.A00
            java.lang.String r0 = r0.A01
            r3.add(r0)
            goto L_0x0897
        L_0x08ab:
            X.39A r2 = r7.A05
            java.util.Set r1 = X.C003101j.A0F(r3)
            X.5Fi r0 = new X.5Fi
            r0.<init>(r7, r5, r6, r4)
            r2.A01(r5, r1, r0)
            return
        L_0x08ba:
            java.lang.Object r1 = r5.A01
            java.util.concurrent.Exchanger r1 = (java.util.concurrent.Exchanger) r1
            java.lang.Object r0 = r5.A02
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x08d2 }
            r1.exchange(r0)     // Catch:{ InterruptedException -> 0x08ca }
            goto L_0x08d1
        L_0x08ca:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x08d1:
            return
        L_0x08d2:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x08d9:
            java.lang.Object r7 = r5.A00
            X.39h r7 = (X.C615339h) r7
            java.lang.Object r6 = r5.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r4 = r5.A02
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166761(0x7f070629, float:1.7947776E38)
            int r3 = r1.getDimensionPixelSize(r0)
            X.152 r2 = r7.A0L
            X.0sK r0 = r7.A06
            r0.A0B()
            X.1Zb r1 = r0.A01
            r0 = 0
            android.graphics.Bitmap r3 = r2.A00(r6, r1, r0, r3)
            android.os.Handler r2 = r7.A0P
            r1 = 6
            com.facebook.redex.RunnableRunnableShape13S0200000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape13S0200000_I1_1
            r0.<init>(r3, r1, r4)
            r2.post(r0)
            return
        L_0x0908:
            java.lang.Object r6 = r5.A00
            X.3CS r6 = (X.AnonymousClass3CS) r6
            java.lang.Object r4 = r5.A01
            X.0q1 r4 = (X.C14930q1) r4
            java.lang.Object r0 = r5.A02
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            X.1dg r3 = r6.A04
            X.0q2 r2 = new X.0q2
            r2.<init>()
            java.lang.String r1 = r0.toString()
            r0 = 0
            r2.A03(r1, r0)
            java.util.List r0 = r2.A00
            X.0q3 r1 = new X.0q3
            r1.<init>(r0)
            X.0q7 r0 = r6.A03
            X.C29701b3.A01(r0, r3, r1, r4)
            return
        L_0x0930:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxRListenerShape419S0100000_2_I0 r0 = (com.facebook.redex.IDxRListenerShape419S0100000_2_I0) r0
            java.lang.Object r2 = r5.A01
            X.26O r2 = (X.AnonymousClass26O) r2
            java.lang.Object r1 = r5.A02
            X.2GI r1 = (X.AnonymousClass2GI) r1
            java.lang.Object r0 = r0.A00
            X.1KA r0 = (X.AnonymousClass1KA) r0
            java.util.Map r0 = r0.A0O
            java.lang.Object r0 = r0.remove(r2)
            X.5RU r0 = (X.AnonymousClass5RU) r0
            if (r0 != 0) goto L_0x0950
            java.lang.String r0 = "The response handler must not be null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0950:
            r0.AR9(r1, r2)
            return
        L_0x0954:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.VoiceMessagingService r0 = (com.obwhatsapp.VoiceMessagingService) r0
            java.lang.Object r7 = r5.A01
            X.0rv r7 = (X.C15830rv) r7
            java.lang.Object r5 = r5.A02
            X.0ta r5 = (X.C16750ta) r5
            X.0tb r2 = r0.A01
            X.0wK r3 = r0.A08
            r4 = 0
            r13 = 2
            r14 = 1
            r15 = 0
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r16 = 0
            r6 = r4
            X.0tY r0 = r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.1zg r0 = new X.1zg
            r0.<init>(r1)
            r2.A07(r0, r4, r15, r15)
            return
        L_0x0981:
            java.lang.Object r3 = r5.A00
            X.2n5 r3 = (X.C56212n5) r3
            java.lang.Object r0 = r5.A01
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.Object r2 = r5.A02
            X.0p3 r2 = (X.C14370p3) r2
            r1 = 0
            r3.A02(r0)     // Catch:{ all -> 0x0995 }
            r2.A01(r1)
            return
        L_0x0995:
            r0 = move-exception
            r2.A01(r1)
            throw r0
        L_0x099a:
            java.lang.Object r0 = r5.A00
            X.4GS r0 = (X.AnonymousClass4GS) r0
            java.lang.Object r2 = r5.A01
            X.1gT r2 = (X.C32491gT) r2
            java.lang.Object r1 = r5.A02
            X.4Ut r1 = (X.C86944Ut) r1
            X.5TJ r0 = r0.A01
            r0.AZd(r2, r1)
            return
        L_0x09ac:
            java.lang.Object r0 = r5.A00
            X.4TD r0 = (X.AnonymousClass4TD) r0
            java.lang.Object r2 = r5.A01
            X.1gT r2 = (X.C32491gT) r2
            java.lang.Object r1 = r5.A02
            X.4Ut r1 = (X.C86944Ut) r1
            X.5TI r0 = r0.A01
            r0.AMo(r2, r1)
            return
        L_0x09be:
            java.lang.Object r0 = r5.A00
            X.4XV r0 = (X.AnonymousClass4XV) r0
            java.lang.Object r1 = r5.A01
            X.3cL r1 = (X.C67763cL) r1
            java.lang.Object r2 = r5.A02
            X.1c3 r2 = (X.C30271c3) r2
            X.4nz r0 = r0.A0C
            X.1kb r1 = r1.build()
            X.3AT r4 = r0.A06
            X.2PT r3 = r0.A00
            X.1kb r0 = X.C34641kb.copyOf((java.util.Collection) r1)
            r4.A03 = r0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x09ea
            java.lang.Object r0 = X.C13690nt.A0Z(r1)
            X.1c3 r0 = (X.C30271c3) r0
            r4.A01 = r0
            r4.A02 = r2
        L_0x09ea:
            X.1c3 r0 = r4.A00
            if (r0 != 0) goto L_0x09fa
            X.1kb r2 = r4.A03
            X.1c3 r1 = r4.A01
            X.4XE r0 = r4.A05
            X.1c3 r0 = X.AnonymousClass3AT.A00(r3, r0, r1, r2)
            r4.A00 = r0
        L_0x09fa:
            com.google.android.exoplayer2.Timeline r0 = r3.ABV()
            r4.A01(r0)
            return
        L_0x0a02:
            X.3QB r3 = r4.A09
            X.1BQ r1 = r3.A03
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0a2f
            r0 = 1
            r2 = 0
            X.2X4 r0 = r1.A00(r5, r0)
            r0.A00(r3)
            android.view.View r0 = r4.A00
            r1 = 8
            r0.setVisibility(r1)
            com.google.android.material.tabs.TabLayout r0 = r4.A04
            r0.setVisibility(r1)
            androidx.viewpager.widget.ViewPager r0 = r4.A03
            int r0 = r0.getVisibility()
            if (r0 == r1) goto L_0x0a2f
            r4.A1P(r2)
            androidx.viewpager.widget.ViewPager r0 = r4.A03
            r0.setVisibility(r1)
        L_0x0a2f:
            r4.A0E = r5
            return
        L_0x0a32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape3S0300000_I1.run():void");
    }
}
