package com.facebook.redex;

import X.AnonymousClass10F;

public class RunnableRunnableShape12S0100000_I0_11 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape12S0100000_I0_11(AnonymousClass10F r1, int i2) {
        this.A01 = i2;
        switch (i2) {
            case 10:
            case 11:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    public RunnableRunnableShape12S0100000_I0_11(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:241:0x04f5=Splitter:B:241:0x04f5, B:251:0x052d=Splitter:B:251:0x052d} */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x03a0;
                case 2: goto L_0x03ac;
                case 3: goto L_0x03b4;
                case 4: goto L_0x03c3;
                case 5: goto L_0x003d;
                case 6: goto L_0x03d2;
                case 7: goto L_0x0059;
                case 8: goto L_0x03db;
                case 9: goto L_0x03ec;
                case 10: goto L_0x0394;
                case 11: goto L_0x03fc;
                case 12: goto L_0x0074;
                case 13: goto L_0x0456;
                case 14: goto L_0x045e;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0489;
                case 18: goto L_0x058e;
                case 19: goto L_0x0596;
                case 20: goto L_0x05a2;
                case 21: goto L_0x0082;
                case 22: goto L_0x00c2;
                case 23: goto L_0x01af;
                case 24: goto L_0x05bc;
                case 25: goto L_0x03e4;
                case 26: goto L_0x01ef;
                case 27: goto L_0x05c8;
                case 28: goto L_0x0200;
                case 29: goto L_0x05d0;
                case 30: goto L_0x0242;
                case 31: goto L_0x0255;
                case 32: goto L_0x026a;
                case 33: goto L_0x05d8;
                case 34: goto L_0x0620;
                case 35: goto L_0x0636;
                case 36: goto L_0x063e;
                case 37: goto L_0x064c;
                case 38: goto L_0x028d;
                case 39: goto L_0x0659;
                case 40: goto L_0x02af;
                case 41: goto L_0x0682;
                case 42: goto L_0x0692;
                case 43: goto L_0x069a;
                case 44: goto L_0x0345;
                case 45: goto L_0x06a2;
                case 46: goto L_0x0733;
                case 47: goto L_0x0741;
                case 48: goto L_0x074d;
                case 49: goto L_0x0755;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.1Fv r0 = (X.C24411Fv) r0
            X.0rz r1 = r0.A02
            r0 = 1
            r1.A1H(r0)
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r4 = r1.A00
            X.109 r4 = (X.AnonymousClass109) r4
            X.0w8 r0 = r4.A05
            X.0pd r2 = r0.A03
            r1 = 1458(0x5b2, float:2.043E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0011
            X.0tz r0 = r4.A00
            android.content.Context r1 = r0.A00
            r0 = 2131889717(0x7f120e35, float:1.9414105E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 2131889716(0x7f120e34, float:1.9414103E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 0
            java.lang.String r0 = "ALIAS_DEREGISTER"
            r4.A03(r3, r2, r0, r1)
            return
        L_0x003d:
            java.lang.Object r0 = r1.A00
            X.0tJ r0 = (X.C16590tJ) r0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r1.next()
            X.1VQ r0 = (X.AnonymousClass1VQ) r0
            r0.AM0()
            goto L_0x0049
        L_0x0059:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel r2 = (com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel) r2
            X.1TR r0 = r2.A07
            X.1VP r1 = new X.1VP
            r1.<init>(r2)
            X.0wS r0 = r0.A03
            X.19r r0 = r0.A03()
            X.1GQ r0 = r0.ADT()
            if (r0 == 0) goto L_0x0011
            r0.A01(r1)
            return
        L_0x0074:
            java.lang.Object r1 = r1.A00
            X.10F r1 = (X.AnonymousClass10F) r1
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "contents_are_drained"
            r1.A06(r0)
            return
        L_0x0082:
            java.lang.Object r7 = r1.A00
            X.1DN r7 = (X.AnonymousClass1DN) r7
            java.util.concurrent.ConcurrentHashMap r6 = r7.A02
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x0090:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r5.next()
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r6.get(r1)
            X.2dv r0 = (X.C52512dv) r0
            if (r0 == 0) goto L_0x0090
            int r4 = r1.intValue()
            int r1 = r0.A00
            r0 = 9
            if (r1 == r0) goto L_0x0090
            r0 = -1
            if (r1 <= r0) goto L_0x00bd
            r0 = 9
            if (r1 == r0) goto L_0x00bd
            X.13K r3 = r7.A07
            r1 = 0
            r0 = 3
            r3.A00(r4, r1, r0)
        L_0x00bd:
            r0 = 2
            r7.A03(r4, r0)
            goto L_0x0090
        L_0x00c2:
            java.lang.Object r4 = r1.A00
            X.1DN r4 = (X.AnonymousClass1DN) r4
            r4.A02()
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x00f4
            X.0pd r2 = r4.A04
            r1 = 1450(0x5aa, float:2.032E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00e4
            X.176 r0 = r4.A05
            boolean r1 = r0.A0C()
            r0 = 1
            if (r1 != 0) goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            r4.A0B = r0
            r4.A0D = r2
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x00f1
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x00f2
        L_0x00f1:
            r3 = 1
        L_0x00f2:
            r4.A0C = r3
        L_0x00f4:
            boolean r6 = r4.A0B
            r3 = 20220328(0x13489a8, float:3.3159542E-38)
            r11 = 2131366825(0x7f0a13a9, float:1.8353554E38)
            java.util.concurrent.ConcurrentHashMap r2 = r4.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r2.containsKey(r1)
            r5 = -1
            r12 = 0
            if (r0 != 0) goto L_0x0156
            r13 = -1
            if (r6 == 0) goto L_0x014d
            r15 = -1
            X.2dv r10 = new X.2dv
            r10.<init>(r11, r12, r13, r15)
            X.0t3 r0 = r4.A03
            long r0 = r0.A00()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            r10.A02 = r0
            X.13K r6 = r4.A07
            r5 = 1
            r6.A00(r3, r0, r5)
        L_0x0126:
            r4.A04(r10, r3)
        L_0x0129:
            r3 = 20220225(0x1348941, float:3.3159253E-38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0011
            r2.remove(r1)
            android.content.SharedPreferences r0 = r4.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = java.lang.String.valueOf(r3)
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            return
        L_0x014d:
            r12 = -1
            r15 = -1
            X.2dv r10 = new X.2dv
            r10.<init>(r11, r12, r13, r15)
            goto L_0x0126
        L_0x0156:
            java.lang.Object r10 = r2.get(r1)
            X.2dv r10 = (X.C52512dv) r10
            if (r10 == 0) goto L_0x0129
            int r0 = r10.A01
            if (r11 == r0) goto L_0x019d
            r10.A01 = r11
            r9 = 1
        L_0x0165:
            int r0 = r10.A00
            if (r6 == 0) goto L_0x019f
            if (r0 != r5) goto L_0x017f
            r10.A00 = r12
            X.0t3 r0 = r4.A03
            long r0 = r0.A00()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            r10.A02 = r0
            X.13K r6 = r4.A07
            r5 = 1
            r6.A00(r3, r0, r5)
            r9 = 1
        L_0x017f:
            int r1 = r10.A00
            r0 = 4
            if (r1 >= r0) goto L_0x01ab
            X.0t3 r0 = r4.A03
            long r7 = r0.A00()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r0
            long r0 = r10.A02
            long r7 = r7 - r0
            long r5 = r4.A00()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01ab
            r0 = 9
            r10.A00 = r0
            goto L_0x0126
        L_0x019d:
            r9 = 0
            goto L_0x0165
        L_0x019f:
            if (r0 < 0) goto L_0x01ab
            r0 = -1
            r10.A02 = r0
            r10.A03 = r0
            r10.A00 = r5
            goto L_0x0126
        L_0x01ab:
            if (r9 == 0) goto L_0x0129
            goto L_0x0126
        L_0x01af:
            java.lang.Object r7 = r1.A00
            X.1DN r7 = (X.AnonymousClass1DN) r7
            java.util.concurrent.ConcurrentHashMap r6 = r7.A02
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x01bd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r5.next()
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r6.get(r1)
            X.2dv r0 = (X.C52512dv) r0
            if (r0 == 0) goto L_0x01bd
            int r4 = r1.intValue()
            int r1 = r0.A00
            r0 = 9
            if (r1 == r0) goto L_0x01bd
            r0 = -1
            if (r1 <= r0) goto L_0x01ea
            r0 = 9
            if (r1 == r0) goto L_0x01ea
            X.13K r3 = r7.A07
            r1 = 0
            r0 = 2
            r3.A00(r4, r1, r0)
        L_0x01ea:
            r0 = 1
            r7.A03(r4, r0)
            goto L_0x01bd
        L_0x01ef:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.profile.ProfileInfoActivity r2 = (com.obwhatsapp.profile.ProfileInfoActivity) r2
            X.0sH r1 = r2.A08
            int r0 = r1.A05
            if (r0 != 0) goto L_0x0011
            int r0 = r1.A04
            if (r0 != 0) goto L_0x0011
            android.view.View r1 = r2.A02
            goto L_0x0265
        L_0x0200:
            java.lang.Object r5 = r1.A00
            X.27A r5 = (X.AnonymousClass27A) r5
            X.0rv r4 = r5.A0I
            r5.A02(r4)
            byte[] r0 = r5.A05
            r3 = 0
            if (r0 != 0) goto L_0x0213
            byte[] r0 = r5.A06
            r2 = 1
            if (r0 == 0) goto L_0x0214
        L_0x0213:
            r2 = 0
        L_0x0214:
            boolean r0 = X.C16030sJ.A0L(r4)
            if (r0 == 0) goto L_0x0228
            X.0pt r1 = r5.A07
            r0 = 2131888793(0x7f120a99, float:1.9412231E38)
            if (r2 == 0) goto L_0x0224
            r0 = 2131888792(0x7f120a98, float:1.941223E38)
        L_0x0224:
            r1.A09(r0, r3)
            return
        L_0x0228:
            X.0sK r1 = r5.A08
            r1.A0B()
            X.1Zb r0 = r1.A01
            if (r0 == 0) goto L_0x0011
            boolean r0 = r1.A0I(r4)
            if (r0 == 0) goto L_0x0011
            X.0pt r1 = r5.A07
            r0 = 2131890971(0x7f12131b, float:1.9416649E38)
            if (r2 == 0) goto L_0x0224
            r0 = 2131890970(0x7f12131a, float:1.9416647E38)
            goto L_0x0224
        L_0x0242:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.profile.ProfilePhotoReminder r1 = (com.obwhatsapp.profile.ProfilePhotoReminder) r1
            X.29I r0 = r1.A0B
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0011
            X.29I r1 = r1.A0B
            r0 = 1
            r1.A00(r0)
            return
        L_0x0255:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.profile.ProfilePhotoReminder r2 = (com.obwhatsapp.profile.ProfilePhotoReminder) r2
            X.0sH r1 = r2.A09
            int r0 = r1.A05
            if (r0 != 0) goto L_0x0011
            int r0 = r1.A04
            if (r0 != 0) goto L_0x0011
            android.view.View r1 = r2.A02
        L_0x0265:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x026a:
            java.lang.Object r5 = r1.A00
            X.1TY r5 = (X.AnonymousClass1TY) r5
            X.0rz r4 = r5.A04
            X.01D r0 = r4.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r3 = "pref_wam_advertisement_id_reporting_done"
            r0 = 0
            boolean r0 = r1.getBoolean(r3, r0)
            if (r0 != 0) goto L_0x0011
            X.0s5 r1 = r5.A00
            X.0s8 r0 = X.C15910s6.A0y
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0011
            goto L_0x076a
        L_0x028d:
            java.lang.Object r1 = r1.A00
            X.0tK r1 = (X.C16600tK) r1
            r0 = 0
            r1.A01 = r0
            X.AnonymousClass00B.A01()
            java.lang.Iterable r0 = r1.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x029f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r1.next()
            X.0xW r0 = (X.C18950xW) r0
            r0.AS1()
            goto L_0x029f
        L_0x02af:
            java.lang.Object r5 = r1.A00
            X.1Sk r5 = (X.C27601Sk) r5
            X.195 r0 = r5.A0U
            java.util.List r6 = r0.A05()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x02c8
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            if (r0 == 0) goto L_0x02c8
            r6.remove(r0)
        L_0x02c8:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0011
            X.0pd r10 = r5.A0h
            r9 = 522(0x20a, float:7.31E-43)
            X.0tM r2 = X.C16620tM.A02
            int r0 = r10.A03(r2, r9)
            if (r0 == 0) goto L_0x0011
            long r3 = java.lang.System.currentTimeMillis()
            X.1OL r8 = r5.A0C
            android.content.SharedPreferences r11 = r8.A01()
            java.lang.String r7 = "zombie_cleanup"
            r0 = 0
            long r0 = r11.getLong(r7, r0)
            long r3 = r3 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            r0 = 60
            long r3 = r3 / r0
            java.lang.String r0 = "MessagingXmppHandler/shouldCleanupZombieCalls Interval = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r10.A03(r2, r9)
            r1.append(r0)
            java.lang.String r0 = " diff = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r10.A03(r2, r9)
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0011
            java.lang.String r0 = "MessagingXmppHandler/onOfflineComplete Cleaning up zombie calls"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r8.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r7, r1)
            r0.apply()
            r1 = 0
            r0 = 0
            android.os.Message r3 = android.os.Message.obtain(r1, r0, r6)
            X.0wb r2 = r5.A0D
            java.lang.String r1 = "check_ongoing_calls"
            X.10g r0 = new X.10g
            r0.<init>((android.os.Message) r3, (java.lang.String) r1)
            r2.A00(r0)
            return
        L_0x0345:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity r3 = (com.obwhatsapp.qrcode.DevicePairQrScannerActivity) r3
            java.lang.String r0 = "QrScannerActivity/registration timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Sp r4 = r3.A04
            r2 = 2
            r0 = -3
            r4.AKQ(r2, r0)
            X.2gc r0 = r3.A08
            X.2Ui r2 = r0.A00()
            X.2UO r1 = r2.A01
            if (r1 == 0) goto L_0x0363
            r0 = 0
            r1.A02 = r0
        L_0x0363:
            X.0yO r2 = r2.A0E
            java.lang.Object r1 = r2.A0O
            monitor-enter(r1)
            r0 = 0
            r2.A01 = r0     // Catch:{ all -> 0x079f }
            monitor-exit(r1)     // Catch:{ all -> 0x079f }
            X.0sq r2 = r3.A05
            r1 = 47
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            boolean r0 = r3.AIm()
            if (r0 != 0) goto L_0x0011
            r0 = 2131888203(0x7f12084b, float:1.9411035E38)
            r3.Afg(r0)
            java.lang.Runnable r1 = r3.A0A
            if (r1 == 0) goto L_0x038d
            android.view.View r0 = r3.A00
            r0.removeCallbacks(r1)
        L_0x038d:
            r3.Ac1()
            r0 = 0
            r3.A06 = r0
            return
        L_0x0394:
            boolean r0 = X.AnonymousClass10F.A0U     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x07a3 }
            if (r0 != 0) goto L_0x0011
            com.obwhatsapp.perf.preload.PreloadWA4aColdStartClasses.preloadClasses()     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x07a3 }
            r0 = 1
            X.AnonymousClass10F.A0U = r0     // Catch:{ Exception | NoClassDefFoundError | UnsatisfiedLinkError -> 0x07a3 }
            goto L_0x07a2
        L_0x03a0:
            java.lang.Object r1 = r1.A00
            X.109 r1 = (X.AnonymousClass109) r1
            r0 = 0
            r1.A02(r0)
            r1.A00()
            return
        L_0x03ac:
            java.lang.Object r0 = r1.A00
            X.108 r0 = (X.AnonymousClass108) r0
            r0.A01()
            return
        L_0x03b4:
            java.lang.Object r1 = r1.A00
            X.12K r1 = (X.AnonymousClass12K) r1
            X.0wP r0 = r1.A04
            r0.A03(r1)
            X.0tK r0 = r1.A03
            r0.A03(r1)
            return
        L_0x03c3:
            java.lang.Object r1 = r1.A00
            X.12K r1 = (X.AnonymousClass12K) r1
            X.0wP r0 = r1.A04
            r0.A02(r1)
            X.0tK r0 = r1.A03
            r0.A02(r1)
            return
        L_0x03d2:
            java.lang.Object r1 = r1.A00
            X.1VZ r1 = (X.AnonymousClass1VZ) r1
            r0 = 0
            r1.A08(r0)
            return
        L_0x03db:
            java.lang.Object r0 = r1.A00
            X.1VN r0 = (X.AnonymousClass1VN) r0
            java.lang.Runnable r0 = r0.A09
            if (r0 != 0) goto L_0x03e8
            return
        L_0x03e4:
            java.lang.Object r0 = r1.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
        L_0x03e8:
            r0.run()
            return
        L_0x03ec:
            java.lang.Object r0 = r1.A00
            X.1VY r0 = (X.AnonymousClass1VY) r0
            X.0wT r1 = r0.A01
            X.16r r0 = r0.A00
            boolean r0 = r0.A0h()
            r1.A0N(r0)
            return
        L_0x03fc:
            java.lang.Object r0 = r1.A00
            X.10F r0 = (X.AnonymousClass10F) r0
            X.1FS r5 = r0.A0J
            int r3 = r0.A01
            monitor-enter(r5)
            android.content.SharedPreferences r0 = r5.A00()     // Catch:{ all -> 0x0453 }
            android.content.SharedPreferences$Editor r6 = r0.edit()     // Catch:{ all -> 0x0453 }
            android.content.SharedPreferences r2 = r5.A00()     // Catch:{ all -> 0x0453 }
            r0 = 1
            if (r3 == r0) goto L_0x041c
            r0 = 2
            if (r3 == r0) goto L_0x0418
            goto L_0x041f
        L_0x0418:
            java.lang.String r1 = "warm_start_count_pref"
            goto L_0x0421
        L_0x041c:
            java.lang.String r1 = "fg_cold_start_count_pref"
            goto L_0x0421
        L_0x041f:
            java.lang.String r1 = "lukewarm_start_count_pref"
        L_0x0421:
            r0 = 0
            int r0 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0453 }
            int r0 = r0 + 1
            r6.putInt(r1, r0)     // Catch:{ all -> 0x0453 }
            r0 = 1
            if (r3 == r0) goto L_0x0435
            r0 = 2
            if (r3 == r0) goto L_0x0432
            goto L_0x0438
        L_0x0432:
            java.lang.String r4 = "last_warm_start_time_min"
            goto L_0x043a
        L_0x0435:
            java.lang.String r4 = "last_cold_start_time_min"
            goto L_0x043a
        L_0x0438:
            java.lang.String r4 = "last_lukewarm_start_time_min"
        L_0x043a:
            X.0t3 r0 = r5.A01     // Catch:{ all -> 0x0453 }
            long r2 = r0.A00()     // Catch:{ all -> 0x0453 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            r0 = 60
            long r2 = r2 / r0
            r0 = 10
            long r2 = r2 / r0
            long r2 = r2 * r0
            int r0 = (int) r2     // Catch:{ all -> 0x0453 }
            r6.putInt(r4, r0)     // Catch:{ all -> 0x0453 }
            r6.apply()     // Catch:{ all -> 0x0453 }
            monitor-exit(r5)
            return
        L_0x0453:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0456:
            java.lang.Object r0 = r1.A00
            X.0pn r0 = (X.C14810pn) r0
            r0.AMG()
            return
        L_0x045e:
            java.lang.Object r0 = r1.A00
            X.1VX r0 = (X.AnonymousClass1VX) r0
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.widget.CheckBox r3 = r0.A04
            r3.getHitRect(r4)
            int r1 = r4.right
            android.view.View r2 = r0.A02
            int r0 = r2.getWidth()
            int r1 = r1 + r0
            r4.right = r1
            int r1 = r4.bottom
            int r0 = r2.getHeight()
            int r1 = r1 + r0
            r4.bottom = r1
            android.view.TouchDelegate r0 = new android.view.TouchDelegate
            r0.<init>(r4, r3)
            r2.setTouchDelegate(r0)
            return
        L_0x0489:
            java.lang.Object r4 = r1.A00
            X.1Ux r4 = (X.C28241Ux) r4
            java.lang.Object r3 = r4.A0A
            monitor-enter(r3)
            boolean r0 = r4.A05     // Catch:{ all -> 0x058b }
            if (r0 != 0) goto L_0x0589
            X.1Uw r2 = r4.A08     // Catch:{ Exception -> 0x0569, all -> 0x0567 }
            java.util.Map r9 = r4.A04     // Catch:{ Exception -> 0x0569, all -> 0x0567 }
            java.lang.Object r5 = r2.A02     // Catch:{ Exception -> 0x0569, all -> 0x0567 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0569, all -> 0x0567 }
            java.io.File r1 = r2.A00     // Catch:{ all -> 0x0564 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0564 }
            if (r0 == 0) goto L_0x04ab
            java.io.File r0 = r2.A01     // Catch:{ all -> 0x0564 }
            r0.delete()     // Catch:{ all -> 0x0564 }
            r1.renameTo(r0)     // Catch:{ all -> 0x0564 }
        L_0x04ab:
            java.io.File r6 = r2.A01     // Catch:{ all -> 0x0564 }
            boolean r0 = r6.canRead()     // Catch:{ all -> 0x0564 }
            if (r0 == 0) goto L_0x0562
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ XmlPullParserException -> 0x0548, IOException -> 0x052e }
            r1.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0548, IOException -> 0x052e }
            r0 = 16384(0x4000, float:2.2959E-41)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ XmlPullParserException -> 0x0548, IOException -> 0x052e }
            r2.<init>(r1, r0)     // Catch:{ XmlPullParserException -> 0x0548, IOException -> 0x052e }
            org.xmlpull.v1.XmlPullParser r7 = android.util.Xml.newPullParser()     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x0529 }
            r7.setInput(r2, r0)     // Catch:{ all -> 0x0529 }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0529 }
            int r1 = r7.getEventType()     // Catch:{ all -> 0x0529 }
        L_0x04cf:
            r0 = 2
            if (r1 != r0) goto L_0x04d3
            goto L_0x04e8
        L_0x04d3:
            r0 = 3
            if (r1 == r0) goto L_0x04f9
            r0 = 4
            if (r1 == r0) goto L_0x0511
            int r1 = r7.next()     // Catch:{ all -> 0x0529 }
            r0 = 1
            if (r1 != r0) goto L_0x04cf
            java.lang.String r0 = "Unexpected end of document"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x0529 }
            r1.<init>(r0)     // Catch:{ all -> 0x0529 }
            goto L_0x0528
        L_0x04e8:
            r1 = 0
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass1VV.A01(r1, r7, r8, r0)     // Catch:{ all -> 0x0529 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0529 }
            if (r0 == 0) goto L_0x04f5
            r9.putAll(r0)     // Catch:{ all -> 0x0529 }
        L_0x04f5:
            r2.close()     // Catch:{ XmlPullParserException -> 0x0548, IOException -> 0x052e }
            goto L_0x0562
        L_0x04f9:
            java.lang.String r0 = "Unexpected end tag at: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0529 }
            r1.<init>(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x0529 }
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0529 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x0529 }
            r1.<init>(r0)     // Catch:{ all -> 0x0529 }
            goto L_0x0528
        L_0x0511:
            java.lang.String r0 = "Unexpected text: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0529 }
            r1.<init>(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r7.getText()     // Catch:{ all -> 0x0529 }
            r1.append(r0)     // Catch:{ all -> 0x0529 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0529 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x0529 }
            r1.<init>(r0)     // Catch:{ all -> 0x0529 }
        L_0x0528:
            throw r1     // Catch:{ all -> 0x0529 }
        L_0x0529:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x052d }
        L_0x052d:
            throw r0     // Catch:{ XmlPullParserException -> 0x0548, IOException -> 0x052e }
        L_0x052e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0564 }
            r1.<init>()     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Cannot read "
            r1.append(r0)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0564 }
            r1.append(r0)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0564 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0564 }
            throw r2     // Catch:{ all -> 0x0564 }
        L_0x0548:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0564 }
            r1.<init>()     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Parsing error while reading "
            r1.append(r0)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0564 }
            r1.append(r0)     // Catch:{ all -> 0x0564 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0564 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0564 }
            throw r2     // Catch:{ all -> 0x0564 }
        L_0x0562:
            monitor-exit(r5)     // Catch:{ all -> 0x0564 }
            goto L_0x0583
        L_0x0564:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0564 }
            throw r0     // Catch:{ Exception -> 0x0569, all -> 0x0567 }
        L_0x0567:
            r0 = move-exception
            goto L_0x0581
        L_0x0569:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x058b }
            r1.<init>()     // Catch:{ all -> 0x058b }
            java.lang.String r0 = "LightSharedPreferencesImpl/Cannot read preferences from "
            r1.append(r0)     // Catch:{ all -> 0x058b }
            X.1Uw r0 = r4.A08     // Catch:{ all -> 0x058b }
            r1.append(r0)     // Catch:{ all -> 0x058b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x058b }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x058b }
            goto L_0x0583
        L_0x0581:
            r4.A03 = r0     // Catch:{ all -> 0x058b }
        L_0x0583:
            r0 = 1
            r4.A05 = r0     // Catch:{ all -> 0x058b }
            r3.notifyAll()     // Catch:{ all -> 0x058b }
        L_0x0589:
            monitor-exit(r3)     // Catch:{ all -> 0x058b }
            return
        L_0x058b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x058b }
            throw r0
        L_0x058e:
            java.lang.Object r0 = r1.A00
            X.125 r0 = (X.AnonymousClass125) r0
            r0.A03()
            return
        L_0x0596:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment r1 = (com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment) r1
            r0 = 1
            r1.A1P(r0, r0)
            r0 = 0
            r1.A0G = r0
            return
        L_0x05a2:
            java.lang.Object r0 = r1.A00
            java.io.File r0 = (java.io.File) r0
            boolean r2 = X.AnonymousClass1XI.A0O(r0)
            java.lang.String r1 = "UserNoticeContentManager/deleteContentFromDir/deleted result "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x05bc:
            java.lang.Object r1 = r1.A00
            X.2HV r1 = (X.AnonymousClass2HV) r1
            r0 = 0
            X.C18450wi.A0H(r1, r0)
            r1.onSuccess()
            return
        L_0x05c8:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.profile.ProfileInfoActivity r0 = (com.obwhatsapp.profile.ProfileInfoActivity) r0
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11.super.onBackPressed()
            return
        L_0x05d0:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x05d8:
            java.lang.Object r0 = r1.A00
            X.12F r0 = (X.AnonymousClass12F) r0
            X.0xz r5 = r0.A0C
            r4 = 0
            X.0sK r0 = r5.A01
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0614
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0sG r0 = r5.A05
            java.util.ArrayList r0 = r0.A0F()
            java.util.Iterator r2 = r0.iterator()
        L_0x05f6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x060c
            java.lang.Object r1 = r2.next()
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            r3.add(r0)
            goto L_0x05f6
        L_0x060c:
            X.1kz r1 = X.C34861kz.A04
            X.27w r0 = X.C453027w.A0A
            r5.A08(r0, r1, r3, r4)
            return
        L_0x0614:
            X.1kz r2 = X.C34861kz.A03
            X.27w r1 = X.C453027w.A09
            java.util.Set r0 = java.util.Collections.emptySet()
            r5.A08(r1, r2, r0, r4)
            return
        L_0x0620:
            java.lang.Object r3 = r1.A00
            X.12F r3 = (X.AnonymousClass12F) r3
            X.12D r0 = r3.A0D
            r0.A02()
            X.0sq r2 = r3.A0P
            r1 = 33
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            return
        L_0x0636:
            java.lang.Object r0 = r1.A00
            X.1RI r0 = (X.AnonymousClass1RI) r0
            r0.A00()
            return
        L_0x063e:
            java.lang.Object r0 = r1.A00
            X.2KD r0 = (X.AnonymousClass2KD) r0
            X.134 r0 = r0.A01
            X.0pt r2 = r0.A00
            r1 = 2131889015(0x7f120b77, float:1.9412682E38)
            r0 = 0
            goto L_0x073d
        L_0x064c:
            java.lang.Object r1 = r1.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 9
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x0659:
            java.lang.Object r2 = r1.A00
            X.1Sk r2 = (X.C27601Sk) r2
            X.0s5 r1 = r2.A07
            X.0s8 r0 = X.C15910s6.A0x
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x067e
            r0 = 42
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r3 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r3.<init>((java.lang.Object) r2, (int) r0)
            X.126 r0 = r2.A0O
            r2 = 14
            android.os.Handler r1 = r0.A01
            android.os.Message r0 = android.os.Message.obtain(r1, r3)
            r0.arg1 = r2
            r1.sendMessage(r0)
            return
        L_0x067e:
            r2.A02()
            return
        L_0x0682:
            java.lang.Object r0 = r1.A00
            X.1Sk r0 = (X.C27601Sk) r0
            X.116 r2 = r0.A19
            X.0tz r0 = r0.A0J
            android.content.Context r1 = r0.A00
            java.lang.Class<com.obwhatsapp.service.GcmFGService> r0 = com.obwhatsapp.service.GcmFGService.class
            r2.A01(r1, r0)
            return
        L_0x0692:
            java.lang.Object r0 = r1.A00
            X.1Sk r0 = (X.C27601Sk) r0
            r0.A02()
            return
        L_0x069a:
            java.lang.Object r0 = r1.A00
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            return
        L_0x06a2:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.obwhatsapp.qrcode.DevicePairQrScannerActivity) r2
            boolean r0 = r2.A2k()
            if (r0 == 0) goto L_0x06b0
            r0 = 0
            r2.A06 = r0
            return
        L_0x06b0:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x072d
            X.5Sp r0 = r2.A04
            r0.AVx(r1)
            X.2gc r0 = r2.A08
            X.2Ui r5 = r0.A00()
            java.lang.String r3 = r2.A06
            X.2UO r0 = r5.A01
            if (r0 == 0) goto L_0x06d6
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x06d6
        L_0x06c9:
            java.lang.String r0 = "CompanionDeviceQrHandler/handleQrCode/request already in progress"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r3 = r5.A02
            X.0yO r0 = r5.A0E
            java.lang.Object r2 = r0.A0O
            monitor-enter(r2)
            goto L_0x0706
        L_0x06d6:
            X.0yO r0 = r5.A0E
            java.lang.Object r2 = r0.A0O
            monitor-enter(r2)
            X.1WF r1 = r0.A00     // Catch:{ all -> 0x072a }
            r0 = 0
            if (r1 == 0) goto L_0x06e1
            r0 = 1
        L_0x06e1:
            monitor-exit(r2)     // Catch:{ all -> 0x072a }
            if (r0 != 0) goto L_0x06c9
            X.2i7 r4 = X.C54732i7.A00(r3)
            if (r4 == 0) goto L_0x0727
            java.lang.String r3 = r4.A02
            byte[] r2 = r4.A03
            X.1WL r1 = r4.A00
            byte[] r0 = r4.A04
            X.4M6 r6 = new X.4M6
            r6.<init>(r1, r3, r2, r0)
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x071b
            r5.A00()
            r7 = 0
            r10 = 0
            r9 = r7
            r8 = r7
            r5.A03(r6, r7, r8, r9, r10)
            return
        L_0x0706:
            X.1WF r1 = r0.A00     // Catch:{ all -> 0x0718 }
            r0 = 0
            if (r1 == 0) goto L_0x070c
            r0 = 1
        L_0x070c:
            monitor-exit(r2)     // Catch:{ all -> 0x0718 }
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "CompanionDeviceQrHandler/request already in progress"
            r3.AcB(r0, r2, r1)
            return
        L_0x0718:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0718 }
            throw r0
        L_0x071b:
            X.1WL r0 = r6.A00
            if (r0 == 0) goto L_0x0727
            byte[] r0 = r6.A02
            if (r0 == 0) goto L_0x0727
            r5.A01(r6)
            return
        L_0x0727:
            X.2Uf r0 = r5.A0G
            goto L_0x072f
        L_0x072a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x072a }
            throw r0
        L_0x072d:
            X.2Uf r0 = r2.A0D
        L_0x072f:
            r0.ASK()
            return
        L_0x0733:
            java.lang.Object r0 = r1.A00
            X.0pN r0 = (X.C14550pN) r0
            X.0pt r2 = r0.A05
            r1 = 2131891339(0x7f12148b, float:1.9417395E38)
            r0 = 1
        L_0x073d:
            r2.A09(r1, r0)
            return
        L_0x0741:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity r0 = (com.obwhatsapp.qrcode.DevicePairQrScannerActivity) r0
            X.0yO r1 = r0.A06
            java.lang.String r0 = "account_sync_timeout"
            r1.A0B(r0)
            return
        L_0x074d:
            java.lang.Object r0 = r1.A00
            X.2WW r0 = (X.AnonymousClass2WW) r0
            r0.A35()
            return
        L_0x0755:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment r0 = (com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment) r0
            X.156 r4 = r0.A08
            com.whatsapp.jid.UserJid r3 = r0.A0L
            java.lang.String r2 = r0.A0R
            java.lang.String r1 = r0.A0T
            X.26U r0 = new X.26U
            r0.<init>(r3, r2, r1)
            r4.A01(r0)
            return
        L_0x076a:
            X.0tz r0 = r5.A03     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            X.2Hk r2 = X.C47072Hj.A00(r0)     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            boolean r0 = r2.A01     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            if (r0 != 0) goto L_0x0784
            X.3qB r1 = new X.3qB     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            r1.<init>()     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            java.lang.String r0 = r2.A00     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            r1.A00 = r0     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            X.0t9 r0 = r5.A05     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
            r0.A04(r1)     // Catch:{ Exception -> 0x0784, all -> 0x0791 }
        L_0x0784:
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)
            r0.apply()
            return
        L_0x0791:
            r2 = move-exception
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)
            r0.apply()
            throw r2
        L_0x079f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x079f }
            throw r0
        L_0x07a2:
            return
        L_0x07a3:
            r2 = move-exception
            java.lang.String r0 = "AbstractAppShellDelegate/performClassPreloading: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape12S0100000_I0_11.run():void");
    }
}
