package com.obwhatsapp.calling.callhistory.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass027;
import X.AnonymousClass19Y;
import X.AnonymousClass1SN;
import X.AnonymousClass2OJ;
import X.AnonymousClass3BC;
import X.C003401n;
import X.C101084wg;
import X.C101094wh;
import X.C101114wj;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16440t3;
import X.C16620tM;
import X.C17240ul;
import X.C216014s;
import X.C32601gl;
import X.C56832oa;
import X.C82514Dc;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;

public class CallsHistoryFragmentV2ViewModel extends C003401n {
    public C101084wg A00;
    public C101094wh A01;
    public ArrayList A02;
    public ArrayList A03;
    public ArrayList A04;
    public ArrayList A05;
    public final AnonymousClass027 A06 = C13690nt.A0O();
    public final C16040sK A07;
    public final AnonymousClass3BC A08;
    public final C82514Dc A09;
    public final C56832oa A0A = new C56832oa(this);
    public final AnonymousClass1SN A0B;
    public final AnonymousClass19Y A0C;
    public final C16000sG A0D;
    public final C16080sP A0E;
    public final C16440t3 A0F;
    public final AnonymousClass013 A0G;
    public final C14710pd A0H;
    public final C17240ul A0I;
    public final C216014s A0J;
    public final AnonymousClass2OJ A0K;
    public final HashMap A0L;

    public CallsHistoryFragmentV2ViewModel(C16040sK r6, AnonymousClass3BC r7, AnonymousClass1SN r8, AnonymousClass19Y r9, C16000sG r10, C16080sP r11, C16440t3 r12, AnonymousClass013 r13, C14710pd r14, C17240ul r15, C216014s r16) {
        C82514Dc r1 = new C82514Dc(this);
        this.A09 = r1;
        HashMap A0x = AnonymousClass000.A0x();
        this.A0L = A0x;
        this.A03 = AnonymousClass000.A0u();
        this.A02 = AnonymousClass000.A0u();
        this.A04 = AnonymousClass000.A0u();
        AnonymousClass2OJ r3 = new AnonymousClass2OJ(AnonymousClass000.A0u());
        this.A0K = r3;
        this.A0H = r14;
        this.A08 = r7;
        this.A0D = r10;
        this.A0C = r9;
        this.A0I = r15;
        this.A0B = r8;
        this.A07 = r6;
        this.A0J = r16;
        this.A0F = r12;
        this.A0E = r11;
        this.A0G = r13;
        r7.A01 = r1;
        if (C32601gl.A04(r6, r14)) {
            C101084wg r17 = new C101084wg();
            this.A00 = r17;
            this.A02.add(0, r17);
        }
        if (r14.A0E(C16620tM.A02, 2214)) {
            C101094wh r18 = new C101094wh();
            this.A01 = r18;
            this.A02.add(r18);
        }
        A0x.put(0, new C101114wj(R.string.str0369));
        A0x.put(C13680ns.A0Y(), new C101114wj(R.string.str036a));
        A0x.put(C13680ns.A0Z(), new C101114wj(R.string.str14ad));
        r3.A0B(this.A02);
        A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        if (r15 == 5) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        if (r1 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r9 == false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ X.AnonymousClass3HT A01(X.C101124wk r17, com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r18) {
        /*
            r2 = r17
            X.39v r0 = r2.A01
            r17 = r0
            X.0sH r1 = r17.A03()
            r9 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r0 = "CallsHistoryViewModel/buildCallItemViewState no contact registered"
        L_0x000f:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r9
        L_0x0013:
            java.util.ArrayList r10 = r0.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r10)
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "CallsHistoryViewModel/buildCallItemViewState no calls registered"
            goto L_0x000f
        L_0x0022:
            java.util.List r0 = java.util.Collections.unmodifiableList(r10)
            r5 = 0
            java.lang.Object r12 = r0.get(r5)
            X.1po r12 = (X.C37831po) r12
            if (r12 != 0) goto L_0x0032
            java.lang.String r0 = "CallsHistoryViewModel/buildCallItemViewState registered call log null"
            goto L_0x000f
        L_0x0032:
            X.0sH r2 = r2.A02
            boolean r0 = r17.A06()
            if (r0 == 0) goto L_0x003d
            r8 = 1
            if (r2 == 0) goto L_0x003e
        L_0x003d:
            r8 = 0
        L_0x003e:
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            r11 = r18
            if (r8 == 0) goto L_0x0063
            X.0sG r4 = r11.A0D
            X.0sP r3 = r11.A0E
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            java.util.List r6 = X.AnonymousClass3A7.A00(r4, r3, r12, r0)
            r1 = 0
        L_0x0057:
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x00fb
            X.C16000sG.A01(r4, r7, r6, r1)
            int r1 = r1 + 1
            goto L_0x0057
        L_0x0063:
            if (r2 == 0) goto L_0x0066
            r1 = r2
        L_0x0066:
            r5 = r9
            r9 = r1
        L_0x0068:
            if (r2 != 0) goto L_0x0108
            java.lang.String r4 = ""
        L_0x006c:
            int r3 = r10.size()
            X.013 r13 = r11.A0G
            long r0 = r17.A02()
            java.lang.CharSequence r14 = X.C28961Zl.A01(r13, r0)
            int r13 = r17.A01()
            int r15 = r17.A00()
            r0 = 2131232581(0x7f080745, float:1.8081275E38)
            if (r15 == 0) goto L_0x0097
            r0 = 1
            if (r15 == r0) goto L_0x00f7
            r0 = 2
            if (r15 == r0) goto L_0x00f7
            r0 = 4
            if (r15 == r0) goto L_0x0094
            r1 = 5
            r0 = 0
            if (r15 != r1) goto L_0x0097
        L_0x0094:
            r0 = 2131232580(0x7f080744, float:1.8081273E38)
        L_0x0097:
            int r12 = X.C62043Bk.A00(r12)
            r16 = r9
            if (r2 == 0) goto L_0x00a8
            X.0ul r1 = r11.A0I
            boolean r1 = r1.A0e(r2)
            r2 = 0
            if (r1 != 0) goto L_0x00a9
        L_0x00a8:
            r2 = 1
        L_0x00a9:
            boolean r1 = r17.A08()
            X.0pd r15 = r11.A0H
            r11 = 2536(0x9e8, float:3.554E-42)
            X.0tM r9 = X.C16620tM.A02
            boolean r9 = r15.A0E(r9, r11)
            if (r9 == 0) goto L_0x00cd
            boolean r11 = r10.isEmpty()
            r9 = 0
            if (r11 != 0) goto L_0x00cd
            java.lang.Object r9 = r10.get(r9)
            X.1po r9 = (X.C37831po) r9
            boolean r9 = r9.A0C()
            r10 = 1
            if (r9 != 0) goto L_0x00ce
        L_0x00cd:
            r10 = 0
        L_0x00ce:
            X.3HT r9 = new X.3HT
            r9.<init>()
            r9.A00 = r3
            r3 = 2131886910(0x7f12033e, float:1.9408412E38)
            r9.A01 = r3
            r9.A07 = r14
            r9.A02 = r13
            r9.A03 = r0
            r9.A04 = r12
            r0 = r16
            r9.A05 = r0
            r9.A0A = r7
            r9.A06 = r5
            r9.A0C = r2
            r9.A0D = r1
            r9.A0B = r6
            r9.A0E = r8
            r9.A0F = r10
            r9.A08 = r4
            return r9
        L_0x00f7:
            r0 = 2131232578(0x7f080742, float:1.808127E38)
            goto L_0x0097
        L_0x00fb:
            if (r2 == 0) goto L_0x0128
            java.lang.String r0 = r3.A0C(r2)
            if (r0 == 0) goto L_0x0128
            X.3y8 r5 = new X.3y8
            r5.<init>(r0)
        L_0x0108:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            java.lang.Class<com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2> r0 = com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2.class
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            X.0rv r0 = r2.A0E
            java.lang.String r0 = X.C16030sJ.A03(r0)
            X.C13700nu.A0a(r3, r0)
            long r0 = r17.A02()
            java.lang.String r4 = X.C13680ns.A0j(r3, r0)
            goto L_0x006c
        L_0x0128:
            r0 = 3
            X.2Wj r5 = X.C52142dD.A02(r4, r3, r6, r0, r5)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A01(X.4wk, com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel):X.3HT");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r0 = r2.A0C(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ X.C1042754r A02(X.C101134wl r12, com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r13) {
        /*
            X.39v r4 = r12.A01
            java.util.ArrayList r1 = r4.A04
            boolean r0 = r1.isEmpty()
            r11 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "CallsHistoryViewModel/buildCallItemViewState no calls registered"
        L_0x000d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r11
        L_0x0011:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r5 = 0
            java.lang.Object r10 = r0.get(r5)
            X.1po r10 = (X.C37831po) r10
            if (r10 != 0) goto L_0x0021
            java.lang.String r0 = "CallsHistoryViewModel/buildCallItemViewState registered call log null"
            goto L_0x000d
        L_0x0021:
            X.0sH r1 = r12.A02
            boolean r8 = X.AnonymousClass000.A1V(r1)
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            if (r8 != 0) goto L_0x0070
            X.0sG r3 = r13.A0D
            X.0sP r2 = r13.A0E
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            java.util.List r6 = X.AnonymousClass3A7.A00(r3, r2, r10, r0)
        L_0x003d:
            int r2 = r6.size()
            r0 = 3
            int r0 = java.lang.Math.min(r2, r0)
            if (r5 >= r0) goto L_0x005a
            java.lang.Object r0 = r6.get(r5)
            X.0rv r0 = (X.C15830rv) r0
            X.0sH r0 = r3.A08(r0)
            if (r0 == 0) goto L_0x0057
            r7.add(r0)
        L_0x0057:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x005a:
            int r0 = r7.size()
            if (r0 != 0) goto L_0x0070
            X.0sK r0 = r13.A07
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r0 == 0) goto L_0x0070
            X.0sH r0 = r3.A08(r0)
            r7.add(r0)
        L_0x0070:
            X.0sG r3 = r13.A0D
            X.0sP r2 = r13.A0E
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = r2.A0C(r1)
            if (r0 == 0) goto L_0x00d6
            X.3y8 r9 = new X.3y8
            r9.<init>(r0)
        L_0x0081:
            boolean r5 = r4.A08()
            r4 = 2131231401(0x7f0802a9, float:1.8078882E38)
            r3 = 2131892963(0x7f121ae3, float:1.942069E38)
            if (r5 == 0) goto L_0x0093
            r4 = 2131231439(0x7f0802cf, float:1.807896E38)
            r3 = 2131892960(0x7f121ae0, float:1.9420683E38)
        L_0x0093:
            X.1lE r0 = r10.A0C
            java.lang.String r0 = r0.A02
            java.lang.String r1 = X.C30341cC.A0A(r0)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L_0x00ca
            r1 = 2131892893(0x7f121a9d, float:1.9420547E38)
            r0 = 2131892943(0x7f121acf, float:1.9420649E38)
        L_0x00ab:
            X.54r r11 = new X.54r
            r11.<init>()
            r11.A00 = r4
            r11.A01 = r1
            r11.A06 = r7
            r11.A02 = r3
            r11.A05 = r9
            r11.A08 = r2
            r11.A09 = r8
            r11.A0A = r5
            r11.A03 = r0
            r11.A07 = r6
            r0 = 2131892965(0x7f121ae5, float:1.9420693E38)
            r11.A04 = r0
            return r11
        L_0x00ca:
            r1 = 2131892962(0x7f121ae2, float:1.9420687E38)
            if (r5 == 0) goto L_0x00d2
            r1 = 2131892959(0x7f121adf, float:1.942068E38)
        L_0x00d2:
            r0 = 2131892942(0x7f121ace, float:1.9420647E38)
            goto L_0x00ab
        L_0x00d6:
            r1 = 0
            r0 = 3
            X.2Wj r9 = X.C52142dD.A02(r3, r2, r6, r0, r1)
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A02(X.4wl, com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel):X.54r");
    }

    public void A04() {
        AnonymousClass3BC r2 = this.A08;
        r2.A0H.A03(r2.A0G);
        r2.A0F.A03(r2.A0E);
        r2.A05.A03(r2.A04);
        r2.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r4 != 1) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
            r5 = this;
            X.2oa r3 = r5.A0A
            java.lang.CharSequence r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 5
            r1 = 1
            if (r0 != 0) goto L_0x0056
            java.util.ArrayList r0 = r5.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0056
            r4 = 5
        L_0x0015:
            X.027 r3 = r5.A06
            java.lang.Object r0 = r3.A01()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r3.A01()
            int r0 = X.AnonymousClass000.A0D(r0)
            if (r0 != r4) goto L_0x0053
            if (r4 != r2) goto L_0x004c
        L_0x0029:
            java.util.ArrayList r1 = r5.A02
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x004d
            r1.clear()
            X.4wg r0 = r5.A00
            if (r0 == 0) goto L_0x003b
            r1.add(r0)
        L_0x003b:
            X.4wh r0 = r5.A01
            if (r0 == 0) goto L_0x0042
            r1.add(r0)
        L_0x0042:
            X.2OJ r1 = r5.A0K
            java.util.ArrayList r0 = r5.A02
            r1.A0B(r0)
        L_0x0049:
            X.C13680ns.A1O(r3, r4)
        L_0x004c:
            return
        L_0x004d:
            java.lang.String r0 = "CallsHistoryFragmentV2ViewModel/clearCallLog no items registered"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0042
        L_0x0053:
            if (r4 == r1) goto L_0x0049
            goto L_0x0029
        L_0x0056:
            java.util.ArrayList r0 = r5.A03
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0076
            java.util.ArrayList r0 = r5.A04
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0076
            java.lang.CharSequence r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0078
            java.util.ArrayList r0 = r5.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0078
        L_0x0076:
            r4 = 1
            goto L_0x0015
        L_0x0078:
            X.3BC r0 = r5.A08
            X.37D r0 = r0.A00
            if (r0 == 0) goto L_0x0080
            r4 = 0
            goto L_0x0015
        L_0x0080:
            X.19Y r0 = r5.A0C
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x008a
            r4 = 4
            goto L_0x0015
        L_0x008a:
            X.0sG r0 = r5.A0D
            int r0 = r0.A03()
            r4 = 3
            if (r0 <= 0) goto L_0x0015
            r4 = 2
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A05():void");
    }

    public final void A06() {
        ArrayList A0u = AnonymousClass000.A0u();
        this.A02 = A0u;
        C101084wg r0 = this.A00;
        if (r0 != null) {
            A0u.add(r0);
        }
        if (this.A04.size() > 0) {
            A0u.add(this.A0L.get(C13680ns.A0X()));
            this.A02.addAll(this.A04);
        }
        if (this.A03.size() > 0) {
            this.A02.add(this.A0L.get(C13680ns.A0Y()));
            this.A02.addAll(this.A03);
        }
        C101094wh r1 = this.A01;
        if (r1 != null) {
            this.A02.add(r1);
        }
        this.A0K.A0B(this.A02);
    }
}
