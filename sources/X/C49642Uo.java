package X;

import android.os.SystemClock;
import com.facebook.redex.IDxConsumerShape209S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.whatsapp.util.Log;

/* renamed from: X.2Uo  reason: invalid class name and case insensitive filesystem */
public class C49642Uo extends C003401n {
    public int A00 = 0;
    public int A01 = -1;
    public int A02;
    public long A03;
    public C16040sK A04;
    public C17230uk A05;
    public AnonymousClass1PP A06;
    public C18260wP A07;
    public C16000sG A08;
    public C16080sP A09;
    public C16440t3 A0A;
    public AnonymousClass013 A0B;
    public AnonymousClass11A A0C;
    public C16070sO A0D;
    public AnonymousClass1BX A0E;
    public C19810z2 A0F;
    public C14710pd A0G;
    public C16490t9 A0H;
    public C17240ul A0I;
    public C17780vd A0J;
    public C16050sL A0K;
    public C17800vf A0L;
    public C16320sq A0M;
    public boolean A0N;
    public final AnonymousClass027 A0O = new AnonymousClass027();
    public final AnonymousClass027 A0P = new AnonymousClass027();
    public final AnonymousClass027 A0Q = new AnonymousClass027();
    public final AnonymousClass027 A0R = new AnonymousClass027();
    public final AnonymousClass027 A0S = new AnonymousClass027();
    public final C33501ig A0T;
    public final C16050sL A0U;
    public final AnonymousClass2OJ A0V = new AnonymousClass2OJ(0);
    public final AnonymousClass2OJ A0W = new AnonymousClass2OJ(0);
    public final String A0X;
    public final boolean A0Y;

    public C49642Uo(C17230uk r5, AnonymousClass1PP r6, C18260wP r7, C16000sG r8, C16080sP r9, C16440t3 r10, AnonymousClass013 r11, AnonymousClass11A r12, C16070sO r13, C14710pd r14, C17240ul r15, C16050sL r16, C16050sL r17, String str, int i2, boolean z2) {
        IDxCObserverShape72S0100000_2_I0 iDxCObserverShape72S0100000_2_I0 = new IDxCObserverShape72S0100000_2_I0(this, 7);
        this.A0T = iDxCObserverShape72S0100000_2_I0;
        this.A0A = r10;
        this.A0G = r14;
        this.A08 = r8;
        this.A09 = r9;
        this.A0B = r11;
        this.A0I = r15;
        this.A05 = r5;
        this.A0C = r12;
        this.A06 = r6;
        this.A0D = r13;
        this.A07 = r7;
        r12.A02(iDxCObserverShape72S0100000_2_I0);
        this.A02 = i2;
        this.A0U = r16;
        this.A0K = r17;
        this.A0X = str;
        this.A0Y = z2;
    }

    public void A04() {
        this.A0C.A03(this.A0T);
    }

    public void A05(int i2) {
        this.A0V.A09(Integer.valueOf(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f0, code lost:
        if (r7 == 1) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(int r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            r5 = 5
            r4 = 1
            if (r0 != r4) goto L_0x001a
            r0 = 304(0x130, float:4.26E-43)
            if (r11 != r0) goto L_0x001a
            X.0pd r2 = r10.A0G
            r1 = 1728(0x6c0, float:2.421E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x001a
            r10.A05(r5)
        L_0x0019:
            return
        L_0x001a:
            r10.A01 = r11
            X.2OJ r1 = r10.A0V
            r0 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.A09(r3)
            X.027 r2 = r10.A0R
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            int r7 = r10.A02
            int r8 = r10.A00
            int r6 = r1.intValue()
            r0 = 499(0x1f3, float:6.99E-43)
            if (r6 != r0) goto L_0x007e
            r9 = 2131887418(0x7f12053a, float:1.9409443E38)
        L_0x003b:
            r6 = 0
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r7 = 2131100165(0x7f060205, float:1.7812704E38)
            X.2XN r0 = new X.2XN
            r0.<init>(r8, r7, r9)
            r2.A09(r0)
            r0 = 426(0x1aa, float:5.97E-43)
            if (r11 != r0) goto L_0x006a
            X.027 r1 = r10.A0Q
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0053:
            r1.A09(r0)
        L_0x0056:
            int r0 = r10.A00
            if (r0 != r4) goto L_0x0019
            X.0pd r2 = r10.A0G
            r1 = 1728(0x6c0, float:2.421E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0019
            r10.A0B(r6)
            return
        L_0x006a:
            java.util.Set r0 = X.C87974Zk.A02
            boolean r0 = r0.contains(r1)
            X.027 r1 = r10.A0Q
            if (r0 == 0) goto L_0x007a
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0053
        L_0x007a:
            r1.A09(r3)
            goto L_0x0056
        L_0x007e:
            if (r7 == 0) goto L_0x00c5
            if (r7 == r4) goto L_0x00c5
            r0 = 2
            if (r7 == r0) goto L_0x00c5
            r0 = 3
            if (r7 == r0) goto L_0x008f
            r0 = 4
            if (r7 == r0) goto L_0x008f
            r9 = 2131891812(0x7f121664, float:1.9418355E38)
            goto L_0x003b
        L_0x008f:
            r0 = 401(0x191, float:5.62E-43)
            if (r6 == r0) goto L_0x00c0
            r0 = 409(0x199, float:5.73E-43)
            if (r6 == r0) goto L_0x00bb
            r0 = 419(0x1a3, float:5.87E-43)
            if (r6 == r0) goto L_0x00b2
            r0 = 426(0x1aa, float:5.97E-43)
            if (r6 == r0) goto L_0x00f2
            switch(r6) {
                case 403: goto L_0x00a6;
                case 404: goto L_0x00aa;
                case 405: goto L_0x00ae;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r9 = 2131889123(0x7f120be3, float:1.94129E38)
            goto L_0x003b
        L_0x00a6:
            r9 = 2131889124(0x7f120be4, float:1.9412903E38)
            goto L_0x003b
        L_0x00aa:
            r9 = 2131889122(0x7f120be2, float:1.9412899E38)
            goto L_0x003b
        L_0x00ae:
            r9 = 2131889125(0x7f120be5, float:1.9412905E38)
            goto L_0x003b
        L_0x00b2:
            r9 = 2131888310(0x7f1208b6, float:1.9411252E38)
            if (r8 != 0) goto L_0x003b
            r9 = 2131888309(0x7f1208b5, float:1.941125E38)
            goto L_0x003b
        L_0x00bb:
            r9 = 2131889121(0x7f120be1, float:1.9412897E38)
            goto L_0x003b
        L_0x00c0:
            r9 = 2131888308(0x7f1208b4, float:1.9411248E38)
            goto L_0x003b
        L_0x00c5:
            if (r6 == 0) goto L_0x0127
            r0 = 401(0x191, float:5.62E-43)
            if (r6 == r0) goto L_0x010c
            r0 = 404(0x194, float:5.66E-43)
            if (r6 == r0) goto L_0x0105
            r0 = 406(0x196, float:5.69E-43)
            if (r6 == r0) goto L_0x00fe
            r0 = 410(0x19a, float:5.75E-43)
            if (r6 == r0) goto L_0x00f7
            r0 = 419(0x1a3, float:5.87E-43)
            if (r6 == r0) goto L_0x0113
            r0 = 426(0x1aa, float:5.97E-43)
            if (r6 == r0) goto L_0x00eb
            r0 = 436(0x1b4, float:6.11E-43)
            r9 = 2131889086(0x7f120bbe, float:1.9412826E38)
            if (r6 == r0) goto L_0x003b
            r9 = 2131891117(0x7f1213ad, float:1.9416945E38)
            goto L_0x003b
        L_0x00eb:
            if (r7 == 0) goto L_0x00f2
            r9 = 2131888560(0x7f1209b0, float:1.9411759E38)
            if (r7 != r4) goto L_0x003b
        L_0x00f2:
            r9 = 2131888328(0x7f1208c8, float:1.9411288E38)
            goto L_0x003b
        L_0x00f7:
            r9 = 2131888319(0x7f1208bf, float:1.941127E38)
            r0 = 2131888318(0x7f1208be, float:1.9411268E38)
            goto L_0x011e
        L_0x00fe:
            r9 = 2131888315(0x7f1208bb, float:1.9411262E38)
            r0 = 2131888314(0x7f1208ba, float:1.941126E38)
            goto L_0x011e
        L_0x0105:
            r9 = 2131888317(0x7f1208bd, float:1.9411266E38)
            r0 = 2131888316(0x7f1208bc, float:1.9411264E38)
            goto L_0x011e
        L_0x010c:
            r9 = 2131888313(0x7f1208b9, float:1.9411258E38)
            r0 = 2131888312(0x7f1208b8, float:1.9411256E38)
            goto L_0x011e
        L_0x0113:
            r9 = 2131888320(0x7f1208c0, float:1.9411272E38)
            r0 = 2131888310(0x7f1208b6, float:1.9411252E38)
            if (r8 != 0) goto L_0x011e
            r0 = 2131888309(0x7f1208b5, float:1.941125E38)
        L_0x011e:
            if (r7 == 0) goto L_0x0124
            if (r7 == r4) goto L_0x0124
            goto L_0x003b
        L_0x0124:
            r9 = r0
            goto L_0x003b
        L_0x0127:
            r9 = 2131889602(0x7f120dc2, float:1.9413872E38)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49642Uo.A06(int):void");
    }

    public final void A07(int i2) {
        if (i2 != 0) {
            A05(5);
            A0B(true);
            return;
        }
        SystemClock.sleep(Math.max(0, 300 - (this.A0A.A00() - this.A03)));
        A05(4);
        int i3 = this.A02;
        if ((i3 == 4 || i3 == 3) && this.A0U != null) {
            this.A0M.Acl(new RunnableRunnableShape6S0100000_I0_5(this, 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010d, code lost:
        if (r2 != 5) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0152, code lost:
        if (r0 != 2) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C85534Ov r9) {
        /*
            r8 = this;
            int r2 = r8.A02
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x000e
            if (r2 == r1) goto L_0x000e
            if (r2 == 0) goto L_0x000e
            r0 = 5
            if (r2 == r0) goto L_0x000e
            r1 = 0
        L_0x000e:
            r3 = 3
            r6 = 2
            if (r1 == 0) goto L_0x001a
            int r2 = r9.A02
            r1 = 1
            if (r2 != r6) goto L_0x0079
            r8.A02 = r1
            r2 = 1
        L_0x001a:
            r4 = 4
            if (r2 != r4) goto L_0x0030
            X.0pd r2 = r8.A0G
            r1 = 2436(0x984, float:3.414E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0030
            r0 = 6
            r8.A02 = r0
        L_0x0030:
            int r1 = r8.A02
            r0 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r0) goto L_0x0039
            if (r1 != r4) goto L_0x003d
        L_0x0039:
            int r0 = r9.A01
            r8.A00 = r0
        L_0x003d:
            if (r1 != r6) goto L_0x0068
            X.0uk r0 = r8.A05
            X.0sL r2 = r9.A05
            X.28n r0 = r0.A03
            java.util.List r0 = r0.A00(r2)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0068
            X.0vf r1 = r8.A0L
            java.lang.String r0 = "community_home"
            boolean r0 = r1.A00(r2, r0)
            X.2OJ r1 = r8.A0W
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x005f:
            r1.A09(r0)
            return
        L_0x0063:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x005f
        L_0x0068:
            X.0sO r1 = r8.A0D
            X.0sL r0 = r9.A05
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x008f
            X.2OJ r1 = r8.A0W
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x005f
        L_0x0079:
            if (r2 != r3) goto L_0x007f
            r2 = 5
        L_0x007c:
            r8.A02 = r2
            goto L_0x001a
        L_0x007f:
            X.0uk r0 = r8.A05
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x008d
            if (r2 != r1) goto L_0x008d
            r8.A02 = r6
            r2 = 2
            goto L_0x001a
        L_0x008d:
            r2 = 0
            goto L_0x007c
        L_0x008f:
            X.027 r2 = r8.A0S
            r1 = -1
            X.4TT r0 = new X.4TT
            r0.<init>(r9, r1)
            r2.A09(r0)
            X.1cF r0 = r9.A07
            java.lang.String r3 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0156
            int r1 = r8.A02
            r0 = 3
            if (r1 == r0) goto L_0x00ac
            r0 = 5
            if (r1 != r0) goto L_0x00bc
        L_0x00ac:
            r3 = 0
            r0 = 0
        L_0x00ae:
            X.027 r2 = r8.A0O
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r3)
            r2.A09(r0)
        L_0x00bc:
            r8.A05(r6)
            X.027 r4 = r8.A0Q
            int r0 = r8.A02
            r7 = 1
            r3 = 2
            r2 = 1
            if (r0 != r6) goto L_0x00c9
            r2 = 0
        L_0x00c9:
            X.0pd r1 = r8.A0G
            r0 = 2436(0x984, float:3.414E-42)
            X.0tM r5 = X.C16620tM.A02
            boolean r0 = r1.A0E(r5, r0)
            if (r0 == 0) goto L_0x0143
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0143
            r3 = 4
        L_0x00da:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.A09(r0)
            X.027 r4 = r8.A0R
            X.0pd r0 = r8.A0G
            r7 = 1728(0x6c0, float:2.421E-42)
            boolean r0 = r0.A0E(r5, r7)
            r3 = 0
            if (r0 == 0) goto L_0x0103
            int r0 = r8.A00
            if (r0 != r6) goto L_0x0103
            r2 = 2131893053(0x7f121b3d, float:1.9420872E38)
        L_0x00f5:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            X.2XN r3 = new X.2XN
            r3.<init>(r1, r0, r2)
        L_0x00ff:
            r4.A09(r3)
            return
        L_0x0103:
            int r2 = r8.A02
            r1 = 1
            if (r2 == 0) goto L_0x0135
            if (r2 == r1) goto L_0x011f
            if (r2 == r6) goto L_0x013f
            r0 = 5
            if (r2 == r0) goto L_0x011f
        L_0x010f:
            X.0pd r0 = r8.A0G
            boolean r0 = r0.A0E(r5, r7)
            if (r0 == 0) goto L_0x013d
            int r0 = r8.A00
            if (r0 != r1) goto L_0x013d
            r2 = 2131886285(0x7f1200cd, float:1.9407145E38)
            goto L_0x00f5
        L_0x011f:
            boolean r0 = r8.A0N
            if (r0 != 0) goto L_0x010f
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = r9.A08
            r2[r3] = r0
            r1 = 2131891980(0x7f12170c, float:1.9418695E38)
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            X.2XN r3 = new X.2XN
            r3.<init>(r2, r0, r1)
            goto L_0x00ff
        L_0x0135:
            boolean r0 = r8.A0Y
            if (r0 == 0) goto L_0x010f
            r2 = 2131891990(0x7f121716, float:1.9418716E38)
            goto L_0x00f5
        L_0x013d:
            r3 = 0
            goto L_0x00ff
        L_0x013f:
            r2 = 2131889109(0x7f120bd5, float:1.9412872E38)
            goto L_0x00f5
        L_0x0143:
            X.0pd r1 = r8.A0G
            r0 = 1728(0x6c0, float:2.421E-42)
            boolean r0 = r1.A0E(r5, r0)
            if (r0 == 0) goto L_0x0154
            int r0 = r8.A00
            if (r0 == r7) goto L_0x00da
            r3 = 3
            if (r0 == r6) goto L_0x00da
        L_0x0154:
            r3 = r2
            goto L_0x00da
        L_0x0156:
            r0 = 2
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49642Uo.A08(X.4Ov):void");
    }

    public void A09(C85534Ov r3, int i2) {
        AnonymousClass027 r1 = this.A0S;
        if (i2 != -1) {
            r1.A09(new AnonymousClass4TT(r3, i2));
            A05(6);
            return;
        }
        throw new IllegalStateException("Error code expected but default success code '-1' was provided.");
    }

    public void A0A(boolean z2) {
        if (!z2 && ((Number) this.A0V.A01()).intValue() != 0) {
            return;
        }
        if (!this.A07.A0A()) {
            this.A0S.A09(new AnonymousClass4TT((C85534Ov) null, 499));
            A05(6);
            return;
        }
        A05(1);
        int i2 = this.A02;
        if (i2 == 4 || i2 == 3 || i2 == 6) {
            C16050sL r8 = this.A0U;
            AnonymousClass00B.A06(r8);
            C16050sL r3 = this.A0K;
            AnonymousClass00B.A06(r3);
            AnonymousClass1PP r2 = this.A06;
            IDxConsumerShape209S0100000_2_I0 iDxConsumerShape209S0100000_2_I0 = new IDxConsumerShape209S0100000_2_I0(this, 3);
            C82654Dq r0 = new C82654Dq(this);
            C16300so r5 = r2.A00;
            C16320sq r10 = r2.A06;
            new C86264Rx(r5, r2.A01, new C63003Ft(iDxConsumerShape209S0100000_2_I0, r0, r2, r3), r8, r2.A05, r10).A00(r3);
        } else if (i2 == 2 || i2 == 1 || i2 == 0 || i2 == 5) {
            String str = this.A0X;
            AnonymousClass00B.A06(str);
            this.A0J.A01(new C102504z3(this), str);
        } else {
            Log.e("JoinLinkedSubGroupViewModelloadGroupInfo/no data to load group info from");
            AnonymousClass00B.A08("JoinLinkedSubGroupViewModelloadGroupInfo/no data to load group info from");
        }
    }

    public final void A0B(boolean z2) {
        if (this.A0G.A0E(C16620tM.A02, 2913)) {
            C75173rj r4 = new C75173rj();
            r4.A02 = Long.valueOf(this.A0A.A00() - this.A03);
            r4.A01 = 1;
            r4.A00 = Boolean.valueOf(z2);
            C16050sL r0 = this.A0K;
            if (r0 != null && C16050sL.A06(r0.user)) {
                r4.A03 = this.A0K.getRawString();
            }
            this.A0H.A06(r4);
        }
    }
}
