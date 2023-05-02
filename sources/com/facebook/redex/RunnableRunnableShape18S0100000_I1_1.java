package com.facebook.redex;

import X.AnonymousClass4RZ;

public class RunnableRunnableShape18S0100000_I1_1 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape18S0100000_I1_1(AnonymousClass4RZ r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public RunnableRunnableShape18S0100000_I1_1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0340, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0343, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r0.A03(r7) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        X.AnonymousClass22U.A00(r1, r0);
        r2.A2X(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0101, code lost:
        r2.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x047a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0203;
                case 1: goto L_0x0571;
                case 2: goto L_0x0565;
                case 3: goto L_0x0559;
                case 4: goto L_0x01e4;
                case 5: goto L_0x0545;
                case 6: goto L_0x0407;
                case 7: goto L_0x01ba;
                case 8: goto L_0x03ff;
                case 9: goto L_0x03f3;
                case 10: goto L_0x03dd;
                case 11: goto L_0x0197;
                case 12: goto L_0x039f;
                case 13: goto L_0x0372;
                case 14: goto L_0x036a;
                case 15: goto L_0x035a;
                case 16: goto L_0x0352;
                case 17: goto L_0x0344;
                case 18: goto L_0x0334;
                case 19: goto L_0x0328;
                case 20: goto L_0x015c;
                case 21: goto L_0x0118;
                case 22: goto L_0x0310;
                case 23: goto L_0x0304;
                case 24: goto L_0x0104;
                case 25: goto L_0x02eb;
                case 26: goto L_0x02e3;
                case 27: goto L_0x02db;
                case 28: goto L_0x02d1;
                case 29: goto L_0x02d1;
                case 30: goto L_0x02d1;
                case 31: goto L_0x02c2;
                case 32: goto L_0x00f1;
                case 33: goto L_0x00e0;
                case 34: goto L_0x02ba;
                case 35: goto L_0x029b;
                case 36: goto L_0x028a;
                case 37: goto L_0x0007;
                case 38: goto L_0x0007;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x027c;
                case 42: goto L_0x00c4;
                case 43: goto L_0x0274;
                case 44: goto L_0x008a;
                case 45: goto L_0x0061;
                case 46: goto L_0x0268;
                case 47: goto L_0x0268;
                case 48: goto L_0x0228;
                case 49: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.group.GroupChatInfoActivity r0 = (com.obwhatsapp.group.GroupChatInfoActivity) r0
            r0.A3b()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r2 = r5.A00
            X.0xv r2 = (X.C19200xv) r2
            java.util.ArrayList r1 = r2.A0C
            monitor-enter(r1)
            java.util.ArrayList r3 = X.C13680ns.A0n(r1)     // Catch:{ all -> 0x0579 }
            r1.clear()     // Catch:{ all -> 0x0579 }
            monitor-exit(r1)     // Catch:{ all -> 0x0579 }
            X.0wP r1 = r2.A03
            r0 = 0
            int r1 = r1.A04(r0)
            java.util.Iterator r4 = r3.iterator()
        L_0x0029:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r3 = r4.next()
            X.2IB r3 = (X.AnonymousClass2IB) r3
            int r8 = r3.A00
            r0 = 1
            if (r8 == r0) goto L_0x003d
            r0 = 3
            if (r8 != r0) goto L_0x0047
        L_0x003d:
            X.14u r0 = r2.A06
            X.0tY r7 = r3.A03
            boolean r0 = r0.A03(r7)
            if (r0 != 0) goto L_0x0054
        L_0x0047:
            r0 = 2
            if (r8 != r0) goto L_0x0029
            X.14u r0 = r2.A06
            X.0tY r7 = r3.A03
            boolean r0 = r0.A06(r7, r1)
            if (r0 == 0) goto L_0x0029
        L_0x0054:
            X.12c r5 = r2.A07
            X.1qc r6 = r3.A02
            long r9 = r3.A01
            boolean r11 = r3.A04
            r12 = 1
            r5.A08(r6, r7, r8, r9, r11, r12)
            goto L_0x0029
        L_0x0061:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0) r0
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.invites.ViewGroupInviteActivity r2 = (com.obwhatsapp.invites.ViewGroupInviteActivity) r2
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "ViewGroupInviteActivity/onConversationChanged/ok/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.0sL r0 = r2.A0K
            r1.append(r0)
            X.C13680ns.A1V(r1)
            X.0ph r1 = X.C14750ph.A0q()
            X.0sL r0 = r2.A0K
            android.content.Intent r1 = r1.A0x(r2, r0)
            java.lang.String r0 = "ViewGroupInviteActivity:onConversationChanged"
            goto L_0x00bc
        L_0x008a:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0) r0
            java.lang.Object r2 = r0.A00
            com.obwhatsapp.invites.ViewGroupInviteActivity r2 = (com.obwhatsapp.invites.ViewGroupInviteActivity) r2
            X.0rt r1 = r2.A0D
            X.0sL r0 = r2.A0K
            boolean r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x000e
            boolean r0 = r2.AIm()
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "ViewGroupInviteActivity/onConversationsListChanged/ok/"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.0sL r0 = r2.A0K
            r1.append(r0)
            X.C13680ns.A1V(r1)
            X.0ph r1 = X.C14750ph.A0q()
            X.0sL r0 = r2.A0K
            android.content.Intent r1 = r1.A0x(r2, r0)
            java.lang.String r0 = "ViewGroupInviteActivity:onConversationsListChanged"
        L_0x00bc:
            X.AnonymousClass22U.A00(r1, r0)
            r0 = 1
            r2.A2X(r1, r0)
            return
        L_0x00c4:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = (com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0) r0
            java.lang.Object r2 = r0.A00
            X.2Nw r2 = (X.C48562Nw) r2
            X.11A r1 = r2.A09
            X.1ig r0 = r2.A08
            r1.A03(r0)
            r0 = 0
            boolean r0 = r2.A04(r0)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "SupportContactUsPresenter/convoObserver, unexpectedly did not redirect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00e0:
            java.lang.Object r2 = r5.A00
            X.3E7 r2 = (X.AnonymousClass3E7) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            X.0wP r1 = r2.A04
            X.0vz r0 = r2.A03
            r1.A03(r0)
            r0 = 0
            goto L_0x0101
        L_0x00f1:
            java.lang.Object r2 = r5.A00
            X.3E7 r2 = (X.AnonymousClass3E7) r2
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x000e
            X.0wP r1 = r2.A04
            X.0vz r0 = r2.A03
            r1.A02(r0)
            r0 = 1
        L_0x0101:
            r2.A00 = r0
            return
        L_0x0104:
            java.lang.Object r0 = r5.A00
            X.1Lk r0 = (X.C25861Lk) r0
            X.1Li r2 = r0.A07
            X.1qk r0 = r2.A01
            if (r0 == 0) goto L_0x000e
            r1 = 0
            X.1qo r0 = r0.A02
            r0.A02(r1)
            r0 = 0
            r2.A01 = r0
            return
        L_0x0118:
            java.lang.Object r2 = r5.A00
            X.39b r2 = (X.C614739b) r2
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x000e
            int r1 = r2.A0I
            r0 = 2
            if (r1 != r0) goto L_0x000e
            r0 = 19
            com.facebook.redex.RunnableRunnableShape18S0100000_I1_1 r4 = new com.facebook.redex.RunnableRunnableShape18S0100000_I1_1
            r4.<init>((java.lang.Object) r2, (int) r0)
            X.3T3 r3 = r2.A0A
            X.AnonymousClass00B.A04(r3)
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x000e
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x000e
            int r1 = r3.getHeight()
            if (r1 <= 0) goto L_0x057c
            r0 = 1
            r3.A0E = r0
            r0 = 0
            com.facebook.redex.IDxAnimationShape3S0101000_2_I1 r2 = new com.facebook.redex.IDxAnimationShape3S0101000_2_I1
            r2.<init>(r3, r1, r0)
            r1 = 6
            com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1 r0 = new com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1
            r0.<init>(r4, r1, r3)
            r2.setAnimationListener(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x015c:
            java.lang.Object r2 = r5.A00
            X.39b r2 = (X.C614739b) r2
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x000e
            int r1 = r2.A0I
            r0 = 2
            if (r1 != r0) goto L_0x000e
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x000e
            r0 = 18
            com.facebook.redex.RunnableRunnableShape18S0100000_I1_1 r3 = new com.facebook.redex.RunnableRunnableShape18S0100000_I1_1
            r3.<init>((java.lang.Object) r2, (int) r0)
            X.3T3 r2 = r2.A0A
            X.AnonymousClass00B.A04(r2)
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x000e
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x000e
            r0 = 2
            com.facebook.redex.IDxDListenerShape58S0200000_2_I1 r1 = new com.facebook.redex.IDxDListenerShape58S0200000_2_I1
            r1.<init>(r3, r0, r2)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
            r0 = 0
            r2.setVisibility(r0)
            return
        L_0x0197:
            java.lang.Object r0 = r5.A00
            X.4E8 r0 = (X.AnonymousClass4E8) r0
            X.1yj r1 = r0.A00
            X.1ZK r0 = r1.A4F
            if (r0 == 0) goto L_0x000e
            X.1ZL r0 = r0.A1G
            android.view.ViewGroup r0 = r0.A0B
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x000e
            X.1ZK r2 = r1.A4F
            X.1cz r0 = r2.A0P
            boolean r1 = X.AnonymousClass000.A1V(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0582
            r2.A0T(r0, r0)
            return
        L_0x01ba:
            java.lang.Object r5 = r5.A00
            X.1bd r5 = (X.C30031bd) r5
            X.0tZ r0 = r5.getFMessage()
            X.1Vw r0 = r0.A11
            X.0rv r4 = r0.A00
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x000e
            r3 = 0
            android.content.Context r2 = r5.getContext()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r0 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            android.content.Intent r1 = X.C14750ph.A0Z(r2, r4, r1, r0)
            android.content.Context r0 = r5.getContext()
            r0.startActivity(r1, r3)
            return
        L_0x01e4:
            java.lang.Object r1 = r5.A00
            X.309 r1 = (X.AnonymousClass309) r1
            X.0sG r3 = r1.A06
            X.0sL r0 = r1.A02
            boolean r2 = r1.A03
            X.0sH r1 = r3.A0A(r0)
            boolean r0 = r1.A0e
            if (r0 == r2) goto L_0x000e
            r1.A0e = r2
            X.18c r0 = r3.A06
            r0.A0J(r1)
            X.1kv r0 = r3.A04
            r0.A00(r1)
            return
        L_0x0203:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxLListenerShape144S0100000_2_I0 r0 = (com.facebook.redex.IDxLListenerShape144S0100000_2_I0) r0
            java.lang.Object r4 = r0.A00
            X.289 r4 = (X.AnonymousClass289) r4
            java.lang.ref.WeakReference r0 = r4.A0F
            java.lang.Object r3 = r0.get()
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L_0x000e
            X.AnonymousClass289.A01(r4)
            com.obwhatsapp.conversation.ConversationAttachmentContentView r0 = r4.A0C
            r0.A04()
            boolean r2 = r4.A03
            int r1 = r4.A03(r3)
            r0 = 0
            r4.A08(r3, r0, r1, r2)
            return
        L_0x0228:
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.AnonymousClass2S0.A00
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0241
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxDListenerShape57S0200000_2_I0 r0 = (com.facebook.redex.IDxDListenerShape57S0200000_2_I0) r0
            java.lang.Object r0 = r0.A00
            android.view.View r0 = (android.view.View) r0
            r0.postDelayed(r5, r1)
            return
        L_0x0241:
            java.lang.Object r0 = r5.A00     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            com.facebook.redex.IDxDListenerShape57S0200000_2_I0 r0 = (com.facebook.redex.IDxDListenerShape57S0200000_2_I0) r0     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            java.lang.Object r2 = r0.A00     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            com.obwhatsapp.location.WaMapView r2 = (com.obwhatsapp.location.WaMapView) r2     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            X.2S6 r1 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            X.AnonymousClass00B.A04(r1)     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            r0 = 0
            r1.A04(r0)     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            X.2S6 r0 = r2.A01     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            r0.A03()     // Catch:{ IncompatibleClassChangeError -> 0x0258 }
            goto L_0x025c
        L_0x0258:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
        L_0x025c:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxDListenerShape57S0200000_2_I0 r0 = (com.facebook.redex.IDxDListenerShape57S0200000_2_I0) r0
            java.lang.Object r1 = r0.A01
            X.1GE r1 = (X.AnonymousClass1GE) r1
            r0 = 1
            r1.A00 = r0
            return
        L_0x0268:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxSObserverShape275S0100000_2_I0 r0 = (com.facebook.redex.IDxSObserverShape275S0100000_2_I0) r0
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.location.LiveLocationPrivacyActivity r0 = (com.obwhatsapp.location.LiveLocationPrivacyActivity) r0
            r0.A36()
            return
        L_0x0274:
            java.lang.Object r0 = r5.A00
            X.1Vi r0 = (X.C28291Vi) r0
            r0.A02()
            return
        L_0x027c:
            java.lang.Object r0 = r5.A00
            X.2Rv r0 = (X.AnonymousClass2Rv) r0
            com.obwhatsapp.inappbugreporting.InAppBugReportingViewModel r0 = r0.A00
            X.027 r1 = r0.A04
            X.2Ry r0 = X.C49252Ry.A00
            r1.A0B(r0)
            return
        L_0x028a:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxCListenerShape219S0100000_2_I0 r0 = (com.facebook.redex.IDxCListenerShape219S0100000_2_I0) r0
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.group.GroupChatInfoActivity r0 = (com.obwhatsapp.group.GroupChatInfoActivity) r0
            X.0tb r2 = r0.A01
            X.0sL r1 = r0.A1M
            r0 = 2
            r2.A0D(r1, r0)
            return
        L_0x029b:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.group.GroupChatInfoActivity r3 = (com.obwhatsapp.group.GroupChatInfoActivity) r3
            X.0sf r1 = r3.A0N
            X.0sL r0 = r3.A1M
            java.lang.String r0 = r0.getRawString()
            X.1WS r2 = r1.A07(r0)
            android.view.View r1 = r3.A00
            r0 = 2131364776(0x7f0a0ba8, float:1.8349399E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r3.A1m
            r3.A3H(r1, r0, r2)
            return
        L_0x02ba:
            java.lang.Object r0 = r5.A00
            X.2OW r0 = (X.AnonymousClass2OW) r0
            r0.AQs()
            return
        L_0x02c2:
            java.lang.Object r0 = r5.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.A03
            android.view.Window r1 = r0.getWindow()
            r0 = 1
            r1.setSoftInputMode(r0)
            return
        L_0x02d1:
            java.lang.Object r0 = r5.A00
            X.5PW r0 = (X.AnonymousClass5PW) r0
            com.obwhatsapp.deeplink.DeepLinkActivity r0 = (com.obwhatsapp.deeplink.DeepLinkActivity) r0
            X.C14530pL.A0n(r0)
            return
        L_0x02db:
            java.lang.Object r0 = r5.A00
            X.5Rm r0 = (X.C109295Rm) r0
            r0.AXi()
            return
        L_0x02e3:
            java.lang.Object r0 = r5.A00
            X.5Rm r0 = (X.C109295Rm) r0
            r0.AXg()
            return
        L_0x02eb:
            java.lang.Object r0 = r5.A00
            X.353 r0 = (X.AnonymousClass353) r0
            X.39R r3 = r0.A00
            X.1MH r0 = r3.A06
            X.0rz r0 = r0.A05
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "sticker_picker_initial_download"
            X.C13680ns.A0z(r1, r0, r2)
            r3.A00()
            return
        L_0x0304:
            java.lang.Object r0 = r5.A00
            X.3Gk r0 = (X.C63173Gk) r0
            X.4RZ r1 = r0.A05
            r0 = 422(0x1a6, float:5.91E-43)
            r1.A00(r0)
            return
        L_0x0310:
            java.lang.Object r1 = r5.A00
            X.4RZ r1 = (X.AnonymousClass4RZ) r1
            java.lang.String r0 = "WebPagePreviewViewModel/CTWAListener/onDeliveryFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.027 r4 = r1.A00
            X.4NG r3 = r1.A02
            r2 = 0
            r1 = 0
            X.4KT r0 = new X.4KT
            r0.<init>(r1, r3, r2)
            r4.A09(r0)
            return
        L_0x0328:
            java.lang.Object r0 = r5.A00
            X.39b r0 = (X.C614739b) r0
            X.4Nk r0 = r0.A07
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A05
            android.view.View r1 = r0.A01
            r0 = 0
            goto L_0x0340
        L_0x0334:
            java.lang.Object r0 = r5.A00
            X.39b r0 = (X.C614739b) r0
            X.4Nk r0 = r0.A07
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A05
            android.view.View r1 = r0.A01
            r0 = 8
        L_0x0340:
            r1.setVisibility(r0)
            return
        L_0x0344:
            java.lang.Object r0 = r5.A00
            X.4xG r0 = (X.C101404xG) r0
            X.0pt r2 = r0.A01
            r1 = 2131891209(0x7f121409, float:1.9417132E38)
            r0 = 1
            r2.A09(r1, r0)
            return
        L_0x0352:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = (com.obwhatsapp.conversationslist.ConversationsFragment) r0
            r0.A1G()
            return
        L_0x035a:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxSConnectionShape327S0100000_2_I0 r0 = (com.facebook.redex.IDxSConnectionShape327S0100000_2_I0) r0
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = (com.obwhatsapp.conversationslist.ConversationsFragment) r0
            X.12N r1 = r0.A0W
            X.2JE r0 = r0.A16
            r1.A02(r0)
            return
        L_0x036a:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.conversationslist.ConversationsFragment r1 = (com.obwhatsapp.conversationslist.ConversationsFragment) r1
            r0 = 0
            r1.A2C = r0
            return
        L_0x0372:
            java.lang.Object r0 = r5.A00
            X.4RZ r0 = (X.AnonymousClass4RZ) r0
            X.1wN r3 = r0.A03     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            X.1ZR r2 = r3.A01     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            java.util.LinkedHashSet r0 = r2.A0P     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            if (r0 != 0) goto L_0x0390
            java.util.LinkedHashSet r0 = r2.A0P     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            java.lang.Object[] r1 = r0.toArray()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            r2.A0C(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
        L_0x0390:
            X.027 r1 = r3.A0B     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            X.1ZR r0 = r3.A01     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            r1.A09(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0398 }
            return
        L_0x0398:
            r1 = move-exception
            java.lang.String r0 = "CTWAListener/onSuccess/failed to load thumb"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x039f:
            java.lang.Object r0 = r5.A00
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r0 = (com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1) r0
            java.lang.Object r0 = r0.A00
            X.1yj r0 = (X.C42821yj) r0
            X.15I r5 = r0.A1w
            X.0rv r0 = r0.A33
            monitor-enter(r5)
            android.content.SharedPreferences r6 = r5.A05()     // Catch:{ all -> 0x03da }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x03da }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x03da }
            java.lang.String r0 = "_cart"
            java.lang.String r4 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x03da }
            java.lang.String r0 = "0"
            java.lang.String r2 = r6.getString(r4, r0)     // Catch:{ all -> 0x03da }
            r0 = 0
            long r2 = X.C29501aj.A01(r2, r0)     // Catch:{ all -> 0x03da }
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = r6.edit()     // Catch:{ all -> 0x03da }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x03da }
            X.C13680ns.A0y(r1, r4, r0)     // Catch:{ all -> 0x03da }
            monitor-exit(r5)
            return
        L_0x03da:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x03dd:
            java.lang.Object r0 = r5.A00
            X.3DD r0 = (X.AnonymousClass3DD) r0
            X.1yj r2 = r0.A04
            X.1j5 r0 = r2.A47
            r1 = 8
            r0.A03(r1)
            X.1kZ r0 = r2.A2C
            r0.A03 = r1
            r0 = 1
            r2.A0o(r0)
            return
        L_0x03f3:
            java.lang.Object r0 = r5.A00
            X.4Rj r0 = (X.C86144Rj) r0
            X.0xq r1 = r0.A03
            X.0xV r0 = r0.A02
            r1.A03(r0)
            return
        L_0x03ff:
            java.lang.Object r1 = r5.A00
            X.312 r1 = (X.AnonymousClass312) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0407:
            java.lang.Object r3 = r5.A00
            X.30q r3 = (X.C602430q) r3
            X.0tZ r1 = r3.A0O
            X.0tY r1 = (X.C16730tY) r1
            X.1rR r1 = (X.C38801rR) r1
            X.29C r0 = r3.A0D
            if (r0 != 0) goto L_0x04b0
            X.1LB r0 = r3.A0E
            android.app.Activity r7 = X.C19980zJ.A02(r3)
            X.4aQ r4 = r0.A00
            X.AnonymousClass00B.A01()
            java.util.List r6 = r4.A06
            boolean r0 = r6.isEmpty()
            r14 = 0
            r5 = 4
            if (r0 == 0) goto L_0x044a
            java.util.List r2 = r4.A07
            int r0 = r2.size()
            if (r0 < r5) goto L_0x044a
            java.lang.Object r2 = r2.remove(r14)
            X.29C r2 = (X.AnonymousClass29C) r2
            X.4E2 r0 = r2.A0B
            if (r0 == 0) goto L_0x0444
            X.30q r0 = r0.A00
            r0.A1S()
            r0.A1T(r14)
        L_0x0444:
            r6.add(r2)
            r2.hashCode()
        L_0x044a:
            java.util.List r2 = r4.A07
            r2.size()
            r6.size()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x04c4
            java.lang.Object r6 = r6.remove(r14)
            X.29C r6 = (X.AnonymousClass29C) r6
            X.0ta r0 = X.C16730tY.A00(r1)
            java.io.File r0 = r0.A0F
            X.AnonymousClass00B.A06(r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r6.A07 = r0
            r0 = 0
            r6.A0A = r0
        L_0x0470:
            r6.hashCode()
            r2.add(r6)
        L_0x0476:
            r3.A0D = r6
            if (r6 == 0) goto L_0x04b0
            r3.A0H = r14
            r0 = 1
            r6.A0F = r0
            X.3HM r0 = new X.3HM
            r0.<init>(r3, r1)
            r6.A04 = r0
            X.4E2 r0 = new X.4E2
            r0.<init>(r3)
            r6.A0B = r0
            r0 = 1
            r6.A0I = r0
            android.view.ViewGroup r2 = r3.A05
            r2.removeAllViews()
            X.29C r0 = r3.A0D
            X.2oj r1 = r0.A0Y
            if (r1 == 0) goto L_0x04b0
            android.view.ViewParent r0 = r1.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x04a6
            r0.removeAllViews()
        L_0x04a6:
            r2.setVisibility(r14)
            android.widget.FrameLayout$LayoutParams r0 = X.C13690nt.A0M()
            r2.addView(r1, r0)
        L_0x04b0:
            X.29C r7 = r3.A0D
            if (r7 == 0) goto L_0x053b
            X.0tZ r8 = r3.A0O
            X.0tY r8 = (X.C16730tY) r8
            X.4Sl r6 = r3.A0I
            if (r6 == 0) goto L_0x0522
            monitor-enter(r6)
            r11 = 3
            r9 = 4663319084467748864(0x40b7700000000000, double:6000.0)
            goto L_0x04ed
        L_0x04c4:
            int r0 = r2.size()
            if (r0 >= r5) goto L_0x04eb
            X.0ta r0 = X.C16730tY.A00(r1)
            X.0pt r8 = r4.A01
            X.0sq r11 = r4.A04
            X.01V r9 = r4.A02
            X.013 r10 = r4.A03
            java.io.File r0 = r0.A0F
            X.AnonymousClass00B.A06(r0)
            X.4FM r12 = r4.A05
            r13 = 0
            r15 = 0
            X.29C r6 = new X.29C
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r6.A07 = r0
            goto L_0x0470
        L_0x04eb:
            r6 = 0
            goto L_0x0476
        L_0x04ed:
            int r1 = r8.A00     // Catch:{ all -> 0x051c }
            r0 = 1
            if (r1 > r0) goto L_0x04f5
            r4 = 600(0x258, double:2.964E-321)
            goto L_0x04f9
        L_0x04f5:
            long r4 = X.C13690nt.A08(r1)
        L_0x04f9:
            double r0 = (double) r4     // Catch:{ all -> 0x051c }
            double r9 = r9 / r0
            double r1 = java.lang.Math.ceil(r9)     // Catch:{ all -> 0x051c }
            int r0 = (int) r1     // Catch:{ all -> 0x051c }
            int r2 = java.lang.Math.max(r11, r0)     // Catch:{ all -> 0x051c }
            java.util.Map r1 = r6.A00     // Catch:{ all -> 0x051c }
            if (r1 == 0) goto L_0x051f
            X.1Vw r0 = r8.A11     // Catch:{ all -> 0x051c }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x051c }
            X.01Q r0 = (X.AnonymousClass01Q) r0     // Catch:{ all -> 0x051c }
            if (r0 == 0) goto L_0x051f
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x051c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x051c }
            int r0 = r0.intValue()     // Catch:{ all -> 0x051c }
            int r2 = r2 - r0
            goto L_0x051f
        L_0x051c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x051f:
            monitor-exit(r6)
            r7.A00 = r2
        L_0x0522:
            X.29C r2 = r3.A0D
            boolean r0 = r2.A0G
            r1 = 1
            if (r0 == 0) goto L_0x053f
            X.2PR r0 = r2.A08
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.AF5()
            if (r0 != r1) goto L_0x0536
            r3.A0H = r1
        L_0x0536:
            X.29C r0 = r3.A0D
            r0.A0H()
        L_0x053b:
            r0 = 0
            r3.A0G = r0
            return
        L_0x053f:
            r3.A0H = r1
            r2.A08()
            goto L_0x053b
        L_0x0545:
            java.lang.Object r2 = r5.A00
            X.30q r2 = (X.C602430q) r2
            X.29C r0 = r2.A0D
            if (r0 == 0) goto L_0x0555
            X.2PR r1 = r0.A08
            if (r1 == 0) goto L_0x0555
            r0 = 1
            r1.AeK(r0)
        L_0x0555:
            r0 = 0
            r2.A0F = r0
            return
        L_0x0559:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxLListenerShape4S0201000_2_I0 r0 = (com.facebook.redex.IDxLListenerShape4S0201000_2_I0) r0
            java.lang.Object r0 = r0.A02
            X.1cT r0 = (X.C30511cT) r0
            r0.A05()
            return
        L_0x0565:
            java.lang.Object r0 = r5.A00
            com.facebook.redex.IDxLListenerShape4S0201000_2_I0 r0 = (com.facebook.redex.IDxLListenerShape4S0201000_2_I0) r0
            java.lang.Object r0 = r0.A02
            X.1cT r0 = (X.C30511cT) r0
            r0.A04()
            return
        L_0x0571:
            java.lang.Object r0 = r5.A00
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x0579:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0579 }
            throw r0
        L_0x057c:
            r0 = 8
            r3.setVisibility(r0)
            return
        L_0x0582:
            r2.A0N(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape18S0100000_I1_1.run():void");
    }
}
