package com.obwhatsapp.deeplink;

import X.AnonymousClass000;
import X.AnonymousClass01J;
import X.AnonymousClass11R;
import X.AnonymousClass15W;
import X.AnonymousClass1IN;
import X.AnonymousClass1KA;
import X.AnonymousClass1KO;
import X.AnonymousClass1KP;
import X.AnonymousClass1KW;
import X.AnonymousClass1KZ;
import X.AnonymousClass1L3;
import X.AnonymousClass1L4;
import X.AnonymousClass1MX;
import X.AnonymousClass1NZ;
import X.AnonymousClass1WD;
import X.AnonymousClass26S;
import X.AnonymousClass2Rf;
import X.AnonymousClass2ZK;
import X.AnonymousClass5PW;
import X.C100354vV;
import X.C1037652q;
import X.C1044755n;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14750ph;
import X.C14870pt;
import X.C16000sG;
import X.C16150sX;
import X.C16260sj;
import X.C16440t3;
import X.C16490t9;
import X.C16620tM;
import X.C17030uP;
import X.C17170ue;
import X.C17180uf;
import X.C17190ug;
import X.C17210ui;
import X.C17580vJ;
import X.C17750va;
import X.C17790ve;
import X.C17800vf;
import X.C18030w2;
import X.C18290wS;
import X.C18640x1;
import X.C18890xQ;
import X.C19760yx;
import X.C19820z3;
import X.C204310c;
import X.C226918x;
import X.C23101Am;
import X.C23181Au;
import X.C23201Aw;
import X.C24881Hq;
import X.C24901Hs;
import X.C24961Hy;
import X.C26001Ly;
import X.C26021Ma;
import X.C26081Mg;
import X.C26091Mh;
import X.C26101Mi;
import X.C26261Na;
import X.C49132Rg;
import X.C61843Ap;
import X.C85944Qp;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;

public class DeepLinkActivity extends C14530pL implements AnonymousClass5PW {
    public static final HashSet A0o;
    public Handler A00;
    public C23101Am A01;
    public AnonymousClass1KO A02;
    public C18890xQ A03;
    public AnonymousClass1KZ A04;
    public C26261Na A05;
    public C18640x1 A06;
    public C17170ue A07;
    public AnonymousClass1KA A08;
    public C24961Hy A09;
    public C17180uf A0A;
    public C17210ui A0B;
    public C204310c A0C;
    public AnonymousClass1L3 A0D;
    public AnonymousClass1L4 A0E;
    public C17750va A0F;
    public C16000sG A0G;
    public C17030uP A0H;
    public C23181Au A0I;
    public AnonymousClass11R A0J;
    public C16260sj A0K;
    public C19820z3 A0L;
    public C85944Qp A0M;
    public C26021Ma A0N;
    public C24901Hs A0O;
    public C26001Ly A0P;
    public C24881Hq A0Q;
    public C26081Mg A0R;
    public C17580vJ A0S;
    public C26091Mh A0T;
    public C18030w2 A0U;
    public AnonymousClass1MX A0V;
    public C26101Mi A0W;
    public C16490t9 A0X;
    public AnonymousClass15W A0Y;
    public C17190ug A0Z;
    public C17790ve A0a;
    public C17800vf A0b;
    public C18290wS A0c;
    public AnonymousClass1IN A0d;
    public AnonymousClass1KW A0e;
    public AnonymousClass1KP A0f;
    public C19760yx A0g;
    public AnonymousClass1NZ A0h;
    public C226918x A0i;
    public AnonymousClass2ZK A0j;
    public C23201Aw A0k;
    public String A0l;
    public boolean A0m;
    public final C14750ph A0n;

    static {
        Integer[] numArr = new Integer[18];
        AnonymousClass000.A1K(numArr, 1);
        AnonymousClass000.A1M(numArr, 2, 1);
        AnonymousClass000.A1M(numArr, 3, 2);
        AnonymousClass000.A1M(numArr, 5, 3);
        numArr[4] = 6;
        AnonymousClass000.A1M(numArr, 8, 5);
        AnonymousClass000.A1M(numArr, 9, 6);
        numArr[7] = 10;
        AnonymousClass000.A1M(numArr, 11, 8);
        AnonymousClass000.A1M(numArr, 12, 9);
        AnonymousClass000.A1M(numArr, 13, 10);
        AnonymousClass000.A1M(numArr, 23, 11);
        AnonymousClass000.A1M(numArr, 24, 12);
        AnonymousClass000.A1M(numArr, 25, 13);
        numArr[14] = 30;
        numArr[15] = 32;
        numArr[16] = 33;
        A0o = C13680ns.A0p(36, numArr, 17);
    }

    public DeepLinkActivity() {
        this(0);
        this.A0n = C14750ph.A0q();
    }

    public DeepLinkActivity(int i2) {
        this.A0m = false;
        C13680ns.A1G(this, 62);
    }

    public static AnonymousClass1WD A02(Context context, Intent intent, C14870pt r17, C18640x1 r18, C17170ue r19, AnonymousClass1KA r20, UserJid userJid, String str, boolean z2) {
        Boolean bool;
        AnonymousClass1WD r5 = new AnonymousClass1WD();
        UserJid userJid2 = userJid;
        String str2 = str;
        Context context2 = context;
        Intent intent2 = intent;
        boolean z3 = z2;
        if (r18.A05(userJid2, str2) == null) {
            AnonymousClass1KA r6 = r20;
            if (r6.A08(new AnonymousClass26S(userJid2, Integer.valueOf((int) context.getResources().getDimension(R.dimen.dimen0529)), Integer.valueOf((int) context.getResources().getDimension(R.dimen.dimen0529)), str2, r19.A00, false))) {
                r6.A0M.add(new C100354vV(context2, intent2, r17, r5, r6, userJid2, str2, z3));
                return r5;
            }
            bool = Boolean.FALSE;
        } else {
            C61843Ap.A00(context, intent2, userJid2, (Integer) null, (Integer) null, str2, 6, z3);
            bool = Boolean.TRUE;
        }
        r5.A02(bool);
        return r5;
    }

    public void A1q() {
        if (!this.A0m) {
            this.A0m = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            C14550pN.A15(r1, this);
            this.A0A = C14550pN.A0v(r1);
            AnonymousClass01J A0R2 = C14530pL.A0R(r2, r1, this);
            this.A03 = C16150sX.A06(r1);
            this.A01 = (C23101Am) r1.A0N.get();
            this.A0a = (C17790ve) r1.AGX.get();
            this.A0Q = (C24881Hq) r1.AP5.get();
            this.A0C = (C204310c) r1.A3O.get();
            this.A02 = (AnonymousClass1KO) r1.ALY.get();
            this.A0Z = C16150sX.A0t(r1);
            this.A08 = (AnonymousClass1KA) r1.A3a.get();
            this.A0U = (C18030w2) r1.A6W.get();
            this.A0G = C16150sX.A0M(r1);
            this.A0c = (C18290wS) r1.AIB.get();
            this.A0R = (C26081Mg) r1.AIY.get();
            this.A0I = (C23181Au) r1.A53.get();
            this.A0S = (C17580vJ) r1.AQW.get();
            this.A0b = C16150sX.A0x(r1);
            this.A0D = (AnonymousClass1L3) r1.A4N.get();
            this.A0T = (C26091Mh) r1.A61.get();
            this.A0P = (C26001Ly) r1.A65.get();
            this.A0Y = (AnonymousClass15W) r1.AOC.get();
            this.A06 = (C18640x1) r1.A3X.get();
            this.A04 = (AnonymousClass1KZ) r1.A3c.get();
            this.A0g = (C19760yx) r1.AKx.get();
            this.A0i = (C226918x) r1.AO5.get();
            this.A0H = C16150sX.A0P(r1);
            this.A0K = C16150sX.A0X(r1);
            this.A0j = r2.A0g();
            this.A07 = C16150sX.A0A(r1);
            this.A0d = (AnonymousClass1IN) r1.AIZ.get();
            this.A0A = C16150sX.A0D(r1);
            this.A0F = C16150sX.A0K(r1);
            this.A0V = (AnonymousClass1MX) r1.A6V.get();
            this.A0f = (AnonymousClass1KP) r1.AKw.get();
            this.A0E = (AnonymousClass1L4) r1.A4K.get();
            this.A0M = new C85944Qp((C16440t3) A0R2.get(), C16150sX.A0a(r1));
            this.A0O = (C24901Hs) r1.ADg.get();
            this.A0W = (C26101Mi) r1.AQU.get();
            this.A0L = (C19820z3) r1.A7p.get();
            this.A0h = (AnonymousClass1NZ) r1.AO6.get();
            this.A0J = (AnonymousClass11R) r1.A4a.get();
            this.A0B = C16150sX.A0E(r1);
            this.A09 = (C24961Hy) r1.A2l.get();
            this.A0e = (AnonymousClass1KW) r1.A3e.get();
            this.A0N = (C26021Ma) r1.A63.get();
            this.A0X = C16150sX.A0m(r1);
            this.A05 = (C26261Na) r1.ADi.get();
            this.A0k = (C23201Aw) r1.AK6.get();
        }
    }

    public void A2S(int i2) {
        finish();
        overridePendingTransition(0, 0);
    }

    public void A35(AnonymousClass1WD r5, int i2, int i3) {
        Message obtain = Message.obtain(this.A00, 1);
        obtain.arg1 = i2;
        this.A00.sendMessageDelayed(obtain, 500);
        r5.A00(new C1037652q(this, i3));
    }

    public final void A36(UserJid userJid, String str, boolean z2) {
        if (this.A0C.A0E(C16620tM.A02, 508)) {
            this.A05.Acl(new C1044755n(this, userJid, str, z2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v23, types: [com.whatsapp.jid.Jid, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0287, code lost:
        if (r4 != false) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0404, code lost:
        startActivity(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05b6, code lost:
        com.whatsapp.util.Log.i(r1);
        r1 = X.C13680ns.A0d(r0, getString(com.obwhatsapp.R.string.str053b), new java.lang.Object[1], 0, com.obwhatsapp.R.string.str1388);
        r4 = new X.AnonymousClass2T3();
        r4.A08 = r1;
        r4.A05 = com.obwhatsapp.R.string.str0df8;
        r4.A0B = new java.lang.Object[0];
        r4.A01(new com.facebook.redex.IDxCListenerShape23S0000000_2_I1(13), com.obwhatsapp.R.string.str0e87);
        X.C13680ns.A1J(r4.A00(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x061c, code lost:
        r4.putExtra("action", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0669, code lost:
        if (r6.AJR(r1) != false) goto L_0x0c7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06a0, code lost:
        if (r5.A03.A0E(X.C16620tM.A02, 1439) != false) goto L_0x06a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0768, code lost:
        r4.putExtra(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x076b, code lost:
        startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0a65, code lost:
        if (r0.A09.A01() == false) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0ad4, code lost:
        if (X.AnonymousClass49K.A00.contains(r2) != false) goto L_0x0ad6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0b00, code lost:
        r3 = X.C32241fu.A00(r0);
        r3.A02(com.obwhatsapp.R.string.str0ba6);
        r3.A01(com.obwhatsapp.R.string.str0ba7);
        X.C13690nt.A1H(r3, r0, 54, com.obwhatsapp.R.string.str0394);
        r3.setPositiveButton(com.obwhatsapp.R.string.str0e92, new X.AnonymousClass3C4(r0, r4));
        r3 = r3.create();
        r3.setOnDismissListener(new com.facebook.redex.IDxDListenerShape159S0100000_2_I1(r0, 2));
        r3.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0b33, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0b95, code lost:
        r0.A0k.A00(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0b9a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0baa, code lost:
        r13 = new X.AnonymousClass3GT(r0, r0.A0Z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        r5 = new java.net.URI(r1.getScheme(), r1.getHost(), r1.getPath(), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0bc6, code lost:
        r12 = r13.A01;
        r15 = r12.A02();
        r10 = new X.C35081lL[1];
        X.C35081lL.A02("type", "verify_link", r10, 0);
        r6 = new X.C28371Vv("request", r10, new X.C28371Vv[]{new X.C28371Vv("url", r5.toString(), (X.C35081lL[]) null)});
        r5 = new X.C35081lL[3];
        X.C35081lL.A02("id", r15, r5, 0);
        X.C35081lL.A02("xmlns", "fb:thrift_iq", r5, 1);
        X.C35081lL.A01("type", "get", r5);
        r3 = r12.A0G(r13, X.C28371Vv.A04(r6, r5), r15, 229, 32000);
        r2 = X.AnonymousClass000.A0q("sendVerifyLinkRequest url=");
        r2.append(r1);
        r2.append(" success:");
        r2.append(r3);
        X.C13680ns.A1V(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0c22, code lost:
        if (r3 == false) goto L_0x0c7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0c24, code lost:
        r3 = android.os.Message.obtain(r0.A00, 1);
        r3.arg1 = com.obwhatsapp.R.string.str0e95;
        r0.A00.sendMessageDelayed(r3, 500);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0c36, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0c6e, code lost:
        r2 = X.AnonymousClass000.A0q("sendVerifyLinkRequest url=");
        r2.append(r1);
        com.whatsapp.util.Log.w(X.AnonymousClass000.A0h(" failed because the url is invalid", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011e, code lost:
        if (r2 < 1) goto L_0x0120;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x04b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            super.onCreate(r1)
            X.1Hq r4 = r0.A0Q
            X.0pt r3 = r4.A02
            r2 = 33
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r1.<init>(r4, r2)
            r3.Acq(r1)
            android.os.Looper r2 = r0.getMainLooper()
            r7 = 0
            X.3Lp r1 = new X.3Lp
            r1.<init>(r2, r0)
            r0.A00 = r1
            android.content.Intent r5 = r0.getIntent()
            android.net.Uri r1 = r5.getData()
            r2 = 0
            if (r1 != 0) goto L_0x0038
            r3 = 2131889062(0x7f120ba6, float:1.9412777E38)
        L_0x002f:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.Afj(r1, r3, r2)
        L_0x0034:
            r0.finish()
            return
        L_0x0038:
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r0.A0l = r3
            X.0wS r3 = r0.A0c
            X.19r r3 = r3.A03()
            r3.AKO(r1)
            X.0w2 r3 = r0.A0U
            int r8 = r3.A08(r1)
            java.lang.String r22 = "source"
            r4 = 1
            r3 = r22
            int r21 = r5.getIntExtra(r3, r4)
            r6 = 2
            r3 = r21
            boolean r3 = X.AnonymousClass000.A1R(r3, r6)
            if (r8 == r6) goto L_0x0071
            X.1MX r9 = r0.A0V
            java.lang.String r6 = r0.A0l
            r10 = 0
            r11 = r10
            r12 = r6
            r13 = r8
            r14 = r21
            r9.A00(r10, r11, r12, r13, r14)
        L_0x0071:
            X.0sK r6 = r0.A01
            boolean r6 = r6.A0G()
            if (r6 == 0) goto L_0x0090
            java.util.HashSet r6 = A0o
            boolean r6 = X.C13700nu.A0h(r6, r8)
            if (r6 != 0) goto L_0x0090
            r0.Ac1()
            r1 = 2131889062(0x7f120ba6, float:1.9412777E38)
            r0.Afg(r1)
            android.os.Handler r0 = r0.A00
            r0.removeMessages(r4)
            return
        L_0x0090:
            r11 = 5
            java.lang.String r12 = "deeplink"
            r9 = 6
            java.lang.String r6 = "extra_entry_point"
            java.lang.String r10 = "action"
            switch(r8) {
                case 1: goto L_0x0baa;
                case 2: goto L_0x0132;
                case 3: goto L_0x0409;
                case 4: goto L_0x04e4;
                case 5: goto L_0x050c;
                case 6: goto L_0x05ac;
                case 7: goto L_0x009b;
                case 8: goto L_0x009b;
                case 9: goto L_0x009b;
                case 10: goto L_0x0409;
                case 11: goto L_0x009b;
                case 12: goto L_0x009b;
                case 13: goto L_0x00a8;
                case 14: goto L_0x05f9;
                case 15: goto L_0x0600;
                case 16: goto L_0x0607;
                case 17: goto L_0x060e;
                case 18: goto L_0x0616;
                case 19: goto L_0x0621;
                case 20: goto L_0x0ae1;
                case 21: goto L_0x06b7;
                case 22: goto L_0x06e4;
                case 23: goto L_0x06f3;
                case 24: goto L_0x0702;
                case 25: goto L_0x0711;
                case 26: goto L_0x0729;
                case 27: goto L_0x00ec;
                case 28: goto L_0x0752;
                case 29: goto L_0x0741;
                case 30: goto L_0x009c;
                case 31: goto L_0x0a8f;
                case 32: goto L_0x0770;
                case 33: goto L_0x07a2;
                case 34: goto L_0x009b;
                case 35: goto L_0x07cc;
                case 36: goto L_0x08b7;
                case 37: goto L_0x0902;
                case 38: goto L_0x009b;
                case 39: goto L_0x009b;
                case 40: goto L_0x009b;
                case 41: goto L_0x091b;
                case 42: goto L_0x0ae5;
                case 43: goto L_0x009b;
                case 44: goto L_0x009b;
                case 45: goto L_0x009b;
                case 46: goto L_0x0ae9;
                case 47: goto L_0x009b;
                case 48: goto L_0x0aed;
                case 49: goto L_0x0af1;
                case 50: goto L_0x0af5;
                case 51: goto L_0x0af9;
                case 52: goto L_0x0a20;
                case 53: goto L_0x0afd;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x0034
        L_0x009c:
            X.0wP r3 = r0.A07
            boolean r3 = r3.A0A()
            if (r3 != 0) goto L_0x0a35
            java.lang.String r1 = "about/no-connectivity"
            goto L_0x05b6
        L_0x00a8:
            X.0sK r2 = r0.A01
            r2.A0B()
            com.obwhatsapp.Me r2 = r2.A00
            if (r2 == 0) goto L_0x00e3
            X.0sC r2 = r0.A09
            boolean r2 = r2.A01()
            if (r2 == 0) goto L_0x00e3
            java.lang.String r2 = "id"
            java.lang.String r4 = r1.getQueryParameter(r2)
            if (r4 != 0) goto L_0x00dd
            java.lang.String r3 = r1.getHost()
            java.lang.String r2 = "wa.me"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00dd
            java.util.List r2 = r1.getPathSegments()
            int r3 = r2.size()
            r2 = 2
            if (r3 != r2) goto L_0x00dd
            java.lang.String r4 = r1.getLastPathSegment()
        L_0x00dd:
            android.content.Intent r5 = X.C14750ph.A0i(r0, r4, r12)
            goto L_0x09a0
        L_0x00e3:
            android.content.Intent r1 = X.C14750ph.A04(r0)
            r0.startActivity(r1)
            goto L_0x0034
        L_0x00ec:
            java.lang.String r3 = r1.getLastPathSegment()
            if (r3 == 0) goto L_0x0122
            java.lang.String r2 = "20210210"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0122
            java.lang.String r5 = "page"
            java.lang.String r1 = r1.getQueryParameter(r5)
            if (r1 != 0) goto L_0x0115
            r3 = 0
        L_0x0103:
            android.content.Intent r7 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.greenalert.GreenAlertActivity"
            r7.setClassName(r2, r1)
            r7.putExtra(r5, r3)
            goto L_0x0404
        L_0x0115:
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0120 }
            r1 = 2
            if (r2 > r1) goto L_0x0120
            int r3 = r2 - r4
            if (r2 >= r4) goto L_0x0103
        L_0x0120:
            r3 = 0
            goto L_0x0103
        L_0x0122:
            r0.Ac1()
            r1 = 2131889062(0x7f120ba6, float:1.9412777E38)
            r0.Afg(r1)
            android.os.Handler r1 = r0.A00
            r1.removeMessages(r4)
            goto L_0x0034
        L_0x0132:
            X.0pd r5 = r0.A0C
            r4 = 496(0x1f0, float:6.95E-43)
            X.0tM r9 = X.C16620tM.A02
            boolean r4 = r5.A0E(r9, r4)
            if (r4 == 0) goto L_0x01fe
            X.0pd r15 = r0.A0C
            X.1Mg r14 = r0.A0R
            X.1Ly r11 = r0.A0P
            X.1Ma r13 = r0.A0N
            X.0t9 r12 = r0.A0X
            X.1Mh r10 = r0.A0T
            r20 = 0
            X.39a r4 = new X.39a
            r4.<init>()
            X.3BB r8 = r4.A01()
            java.lang.String r19 = X.C18030w2.A01(r1)
            java.lang.String r4 = "text"
            java.lang.String r6 = r1.getQueryParameter(r4)
            java.lang.String r4 = "jid"
            java.lang.String r18 = r1.getQueryParameter(r4)
            java.lang.String r4 = "lid"
            r1.getQueryParameter(r4)
            if (r6 == 0) goto L_0x0179
            int r4 = X.C18030w2.A06
            java.lang.String r5 = X.C40651uT.A02(r4, r6)
            r4 = 8000(0x1f40, float:1.121E-41)
            java.lang.String r6 = X.AnonymousClass1ZW.A04(r4, r5)
        L_0x0179:
            r16 = 0
            r4 = 508(0x1fc, float:7.12E-43)
            boolean r4 = r15.A0E(r9, r4)
            if (r4 == 0) goto L_0x0329
            java.lang.String r5 = X.C18030w2.A02(r1, r15)
            if (r5 == 0) goto L_0x018f
            java.lang.String r4 = "ctwa"
            boolean r16 = r5.contains(r4)
        L_0x018f:
            java.lang.String r17 = X.C18030w2.A03(r1, r15, r3)
            if (r16 == 0) goto L_0x019f
            java.lang.String r4 = "deep_link"
            r13.A01(r4)
            java.lang.String r4 = "ctwa_deeplink_parsing_starts"
            r13.A00(r4)
        L_0x019f:
            r4 = 2754(0xac2, float:3.859E-42)
            boolean r4 = r15.A0E(r9, r4)
            if (r4 == 0) goto L_0x0301
            X.0pd r11 = r11.A00
            r4 = 981(0x3d5, float:1.375E-42)
            boolean r4 = r11.A0E(r9, r4)
            X.3BB r11 = r10.A00(r1, r4)
        L_0x01b3:
            if (r16 == 0) goto L_0x01ba
            java.lang.String r4 = "ctwa_deeplink_parsing_completes"
            r13.A00(r4)
        L_0x01ba:
            java.lang.String r10 = r11.A07
            if (r10 == 0) goto L_0x02fe
            X.0rv r4 = X.C15830rv.A02(r19)
            java.util.Set r4 = r14.A01(r4, r10)
            if (r4 == 0) goto L_0x02fe
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x02fe
            r6 = r20
        L_0x01d0:
            java.lang.String r4 = r8.A03
            r23 = r4
            java.lang.String r4 = r8.A06
            r20 = r4
            java.lang.String r4 = r8.A02
            r25 = r4
            java.lang.String r4 = r8.A05
            r16 = r4
            boolean r4 = X.AnonymousClass000.A1V(r18)
            if (r4 != 0) goto L_0x01ea
            com.whatsapp.jid.UserJid r4 = r8.A01
            if (r4 == 0) goto L_0x01fe
        L_0x01ea:
            X.0rv r4 = r8.A00
            if (r4 == 0) goto L_0x01ef
            r7 = r4
        L_0x01ef:
            com.whatsapp.jid.UserJid r11 = r8.A01
            if (r11 != 0) goto L_0x021a
            X.0rv r11 = X.C15830rv.A02(r18)
            if (r11 != 0) goto L_0x021a
            java.lang.String r2 = "CTWA: DeepLinkActivity/onCreate/ JID parameter for DEEP_LINK_CHAT has invalid format"
        L_0x01fb:
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x01fe:
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r3 = r0.getPackageName()
            java.lang.String r2 = "com.obwhatsapp.contact.picker.ContactPicker"
            r5.setClassName(r3, r2)
            java.lang.String r2 = "uri"
            r5.putExtra(r2, r1)
            r2 = r22
            r1 = r21
            r5.putExtra(r2, r1)
            goto L_0x09a0
        L_0x021a:
            boolean r4 = android.text.TextUtils.isEmpty(r19)
            if (r4 != 0) goto L_0x02fa
            java.lang.String r4 = r19.trim()
            java.lang.String r14 = android.telephony.PhoneNumberUtils.stripSeparators(r4)
            int r4 = r14.length()
            if (r4 <= 0) goto L_0x023d
            char r4 = r14.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L_0x023d
            r4 = 1
            java.lang.String r14 = r14.substring(r4)
        L_0x023d:
            java.lang.String r15 = r11.getRawString()
            r4 = 64
            int r13 = r15.indexOf(r4)
            r4 = 46
            int r12 = r15.indexOf(r4)
            r4 = 58
            int r10 = r15.indexOf(r4)
            r4 = -1
            if (r12 == r4) goto L_0x025a
            int r13 = java.lang.Math.min(r12, r13)
        L_0x025a:
            if (r10 == r4) goto L_0x0260
            int r13 = java.lang.Math.min(r10, r13)
        L_0x0260:
            java.lang.String r4 = r15.substring(r2, r13)
            boolean r4 = r14.equals(r4)
            if (r4 == 0) goto L_0x02fa
            boolean r4 = r7 instanceof X.AnonymousClass1ZX
            if (r4 == 0) goto L_0x0279
            boolean r4 = r11 instanceof X.AnonymousClass1ZT
            if (r4 == 0) goto L_0x0279
            X.0sq r10 = r0.A05
            r4 = 26
            X.C13700nu.A0X(r10, r0, r7, r11, r4)
        L_0x0279:
            X.0pd r10 = r0.A0C
            r4 = 1823(0x71f, float:2.555E-42)
            boolean r4 = r10.A0E(r9, r4)
            if (r4 == 0) goto L_0x02f8
            boolean r4 = X.C16030sJ.A0M(r7)
            if (r4 == 0) goto L_0x02f8
        L_0x0289:
            com.whatsapp.jid.UserJid r11 = com.whatsapp.jid.UserJid.of(r7)
            X.1Hs r12 = r0.A0O
            X.4Qp r13 = r0.A0M
            r10 = r20
            r4 = r23
            X.21U r13 = r13.A00(r11, r10, r4, r5)
            int r10 = r13.A00
            r4 = 1
            if (r10 != r4) goto L_0x02a6
            X.1Hp r10 = r12.A05
            boolean r10 = r10.A00()
            if (r10 == 0) goto L_0x02ab
        L_0x02a6:
            X.0zO r10 = r12.A01
            r10.A04(r13)
        L_0x02ab:
            if (r16 == 0) goto L_0x032f
            if (r11 == 0) goto L_0x032f
            X.0pd r12 = r0.A0C
            r10 = 2255(0x8cf, float:3.16E-42)
            boolean r10 = r12.A0E(r9, r10)
            if (r10 == 0) goto L_0x032f
            X.1Aw r4 = r0.A0k
            r4.A00(r1, r11)
            X.0ue r4 = r0.A07
            r1 = 17
            r4.A02(r1)
            X.0sK r1 = r0.A01
            boolean r25 = r1.A0I(r11)
            r7 = 2131889814(0x7f120e96, float:1.9414302E38)
            r6 = 2131890962(0x7f121312, float:1.941663E38)
            android.content.Intent r18 = X.C14750ph.A0o(r0, r2)
            X.0pt r5 = r0.A05
            X.1KA r4 = r0.A08
            X.0x1 r2 = r0.A06
            X.0ue r1 = r0.A07
            r17 = r0
            r19 = r5
            r20 = r2
            r21 = r1
            r22 = r4
            r23 = r11
            r24 = r16
            X.1WD r1 = A02(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A35(r1, r7, r6)
            java.lang.String r1 = "product_link_ads"
            r0.A36(r11, r1, r3)
            return
        L_0x02f8:
            r7 = r11
            goto L_0x0289
        L_0x02fa:
            java.lang.String r2 = "CTWA: DeepLinkActivity/onCreate/ JID parameter for DEEP_LINK_CHAT does not match phone number"
            goto L_0x01fb
        L_0x02fe:
            r8 = r11
            goto L_0x01d0
        L_0x0301:
            X.0pd r10 = r11.A00
            r4 = 981(0x3d5, float:1.375E-42)
            boolean r11 = r10.A0E(r9, r4)
            X.39a r10 = new X.39a
            r10.<init>()
            r10.A01 = r1
            X.54G r4 = new X.54G
            r4.<init>(r15)
            r10.A06 = r4
            r4 = 1841(0x731, float:2.58E-42)
            int r4 = r15.A03(r9, r4)
            r10.A00 = r4
            r10.A0J = r11
            r10.A03 = r12
            X.3BB r11 = r10.A01()
            goto L_0x01b3
        L_0x0329:
            r5 = r20
            r17 = r5
            goto L_0x019f
        L_0x032f:
            X.1Aw r3 = r0.A0k
            r3.A00(r1, r7)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r11 = r1 ^ 1
            boolean r1 = android.text.TextUtils.isEmpty(r19)
            r10 = r1 ^ 1
            X.1MX r13 = r0.A0V
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r12 = r1 ^ 1
            boolean r1 = android.text.TextUtils.isEmpty(r19)
            r3 = r1 ^ 1
            java.lang.String r1 = r0.A0l
            r13.A01(r1, r12, r3)
            X.1MX r14 = r0.A0V
            X.0sG r1 = r0.A0G
            r3 = r7
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r1 = r1.A0Z(r3)
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r1)
            java.lang.String r1 = r0.A0l
            r23 = 2
            android.content.Intent r13 = r0.getIntent()
            r12 = r22
            int r24 = r13.getIntExtra(r12, r4)
            X.0uP r12 = r0.A0H
            X.1Vq r12 = r12.A00(r3)
            java.lang.Integer r21 = X.C54692i1.A00(r12)
            r19 = r14
            r22 = r1
            r19.A00(r20, r21, r22, r23, r24)
            java.lang.ref.WeakReference r1 = X.C13690nt.A0h(r0)
            X.4xX r14 = new X.4xX
            r14.<init>(r0, r1)
            X.0ug r13 = r0.A0Z
            X.1Au r1 = r0.A0I
            X.3z9 r12 = new X.3z9
            r12.<init>(r1, r14, r3, r13)
            X.0sq r1 = r0.A05
            X.C13700nu.A0W(r12, r1)
            X.0ph r1 = r0.A0n
            android.os.Bundle r3 = r8.A00()
            android.content.Intent r7 = r1.A0x(r0, r7)
            java.lang.String r1 = "wa_type"
            r7.putExtra(r1, r2)
            java.lang.String r1 = "has_share"
            r7.putExtra(r1, r4)
            java.lang.String r1 = "confirm"
            r7.putExtra(r1, r4)
            java.lang.String r1 = "text_from_url"
            r7.putExtra(r1, r11)
            java.lang.String r1 = "number_from_url"
            r7.putExtra(r1, r10)
            java.lang.String r2 = "iq_code"
            r1 = r25
            r7.putExtra(r2, r1)
            java.lang.String r2 = "ctwa_deeplink_content"
            r7.putExtra(r2, r3)
            X.C51382ba.A00(r0, r7)
            if (r11 == 0) goto L_0x03d4
            java.lang.String r1 = "share_msg"
            r7.putExtra(r1, r6)
        L_0x03d4:
            android.os.Bundle r1 = r8.A00()
            r7.putExtra(r2, r1)
            X.0pd r2 = r0.A0C
            r1 = 508(0x1fc, float:7.12E-43)
            boolean r1 = r2.A0E(r9, r1)
            if (r1 == 0) goto L_0x03fd
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x03fd
            java.lang.String r1 = "entry_point_conversion_source"
            r7.putExtra(r1, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r17)
            if (r1 != 0) goto L_0x03fd
            java.lang.String r2 = "entry_point_conversion_app"
            r1 = r17
            r7.putExtra(r2, r1)
        L_0x03fd:
            java.lang.String r2 = r0.A0l
            java.lang.String r1 = "extra_deep_link_session_id"
            r7.putExtra(r1, r2)
        L_0x0404:
            r0.startActivity(r7)
            goto L_0x0034
        L_0x0409:
            java.lang.String r10 = r1.getScheme()
            java.lang.String r9 = r1.getHost()
            java.lang.String r4 = "wa.me"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x04b2
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 != 0) goto L_0x04b0
            java.lang.String r4 = "whatsapp"
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x0432
            java.lang.String r4 = "whatsapp-consumer"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x04b0
        L_0x0432:
            java.lang.String r9 = r1.getHost()
            java.lang.String r4 = "send"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x04b2
            java.lang.String r9 = r1.getHost()
            java.lang.String r4 = "message"
            boolean r4 = r4.equals(r9)
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0o()
            if (r4 == 0) goto L_0x04ad
            java.lang.String r4 = "https://wa.me/message/"
        L_0x0451:
            r9.append(r4)
            java.lang.String r4 = r1.getLastPathSegment()
            r9.append(r4)
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "utm_source"
            java.lang.String r11 = r1.getQueryParameter(r4)
            if (r11 == 0) goto L_0x0472
            java.lang.String r4 = "utm_source="
            java.lang.String r4 = X.C13680ns.A0h(r4, r11)
            r10.add(r4)
        L_0x0472:
            java.lang.String r4 = "utm_campaign"
            java.lang.String r4 = r1.getQueryParameter(r4)
            if (r4 == 0) goto L_0x0485
            java.lang.String r1 = "utm_campaign="
            java.lang.String r1 = X.C13680ns.A0h(r1, r4)
            r10.add(r1)
        L_0x0485:
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x049c
            java.lang.String r1 = ""
        L_0x048d:
            java.lang.String r9 = X.AnonymousClass000.A0h(r1, r9)
        L_0x0491:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto L_0x04b7
            r3 = 2131889060(0x7f120ba4, float:1.9412773E38)
            goto L_0x002f
        L_0x049c:
            java.lang.String r1 = "?"
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r1)
            java.lang.String r1 = "&"
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r4)
            goto L_0x048d
        L_0x04ad:
            java.lang.String r4 = "https://wa.me/qr/"
            goto L_0x0451
        L_0x04b0:
            r9 = 0
            goto L_0x0491
        L_0x04b2:
            java.lang.String r9 = r1.toString()
            goto L_0x0491
        L_0x04b7:
            r1 = 10
            if (r8 != r1) goto L_0x04bd
            java.lang.String r7 = r0.A0l
        L_0x04bd:
            r1 = 4
            int r5 = r5.getIntExtra(r6, r1)
            android.content.Intent r4 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.qrcode.contactqr.QrSheetDeepLinkActivity"
            android.content.Intent r4 = r4.setClassName(r2, r1)
            java.lang.String r1 = "qrcode"
            r4.putExtra(r1, r9)
            java.lang.String r1 = "from_internal_deep_link_click"
            r4.putExtra(r1, r3)
            java.lang.String r1 = "extra_deep_link_session_id"
            r4.putExtra(r1, r7)
            r4.putExtra(r6, r5)
            goto L_0x076b
        L_0x04e4:
            X.0wS r2 = r0.A0c
            X.19r r2 = r2.A03()
            java.lang.Class r3 = r2.AEt()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0, r3)
            java.lang.String r2 = "PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT "
            java.lang.String r2 = X.AnonymousClass000.A0g(r2, r3)
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "actual_deep_link"
            r4.putExtra(r1, r2)
            java.lang.String r1 = "referral_screen"
            r4.putExtra(r1, r12)
            goto L_0x076b
        L_0x050c:
            X.0wP r5 = r0.A07
            boolean r5 = r5.A0A()
            if (r5 != 0) goto L_0x0518
            java.lang.String r1 = "deep_link_product/no-connectivity"
            goto L_0x05b6
        L_0x0518:
            java.lang.String r5 = "phoneNumber"
            java.lang.String r8 = r1.getQueryParameter(r5)
            java.lang.String r5 = "productID"
            java.lang.String r7 = r1.getQueryParameter(r5)
            java.lang.String r6 = r1.getHost()
            java.lang.String r5 = "wa.me"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x054a
            java.util.List r7 = r1.getPathSegments()
            int r6 = r7.size()
            r5 = 3
            boolean r5 = X.AnonymousClass000.A1R(r6, r5)
            X.AnonymousClass00B.A0F(r5)
            r5 = 2
            java.lang.String r8 = X.AnonymousClass000.A0n(r7, r5)
            java.lang.Object r7 = r7.get(r4)
        L_0x054a:
            r4 = 0
            if (r8 == 0) goto L_0x0551
            X.1ZT r4 = X.AnonymousClass1ZT.A03(r8)     // Catch:{ 1W4 -> 0x0551 }
        L_0x0551:
            android.util.Pair r6 = X.C13690nt.A0I(r7, r4)
            java.lang.Object r7 = r6.second
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            java.lang.Object r4 = r6.first
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x05a7
            if (r7 == 0) goto L_0x05a7
            X.0ue r4 = r0.A07
            r4.A02(r9)
            X.0sK r5 = r0.A01
            java.lang.Object r4 = r6.second
            X.0rv r4 = (X.C15830rv) r4
            boolean r20 = r5.A0I(r4)
            r11 = 2131889814(0x7f120e96, float:1.9414302E38)
            java.lang.Object r10 = r6.second
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.Object r9 = r6.first
            java.lang.String r9 = (java.lang.String) r9
            android.content.Intent r13 = X.C14750ph.A0o(r0, r2)
            X.0pt r8 = r0.A05
            X.1KA r6 = r0.A08
            X.0x1 r5 = r0.A06
            X.0ue r2 = r0.A07
            r4 = 2131890962(0x7f121312, float:1.941663E38)
            r12 = r0
            r14 = r8
            r15 = r5
            r16 = r2
            r17 = r6
            r18 = r10
            r19 = r9
            X.1WD r2 = A02(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A35(r2, r11, r4)
            java.lang.String r2 = "product_link"
            r0.A36(r7, r2, r3)
            goto L_0x0b95
        L_0x05a7:
            r3 = 2131889065(0x7f120ba9, float:1.9412783E38)
            goto L_0x002f
        L_0x05ac:
            X.0wP r7 = r0.A07
            boolean r7 = r7.A0A()
            if (r7 != 0) goto L_0x05ee
            java.lang.String r1 = "deep_link_catalog/no-connectivity"
        L_0x05b6:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r5 = 2131891080(0x7f121388, float:1.941687E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r1 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r1 = X.C13680ns.A0d(r0, r1, r3, r2, r5)
            X.2T3 r4 = new X.2T3
            r4.<init>()
            r4.A08 = r1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 2131889656(0x7f120df8, float:1.9413982E38)
            r4.A05 = r1
            r4.A0B = r2
            r3 = 2131889799(0x7f120e87, float:1.9414272E38)
            r2 = 13
            com.facebook.redex.IDxCListenerShape23S0000000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape23S0000000_2_I1
            r1.<init>(r2)
            r4.A01(r1, r3)
            androidx.fragment.app.DialogFragment r1 = r4.A00()
            X.C13680ns.A1J(r1, r0)
            return
        L_0x05ee:
            com.whatsapp.jid.UserJid r7 = X.C18030w2.A00(r1)
            if (r7 != 0) goto L_0x0b34
            r3 = 2131889059(0x7f120ba3, float:1.941277E38)
            goto L_0x002f
        L_0x05f9:
            android.content.Intent r4 = X.C14530pL.A0B(r0)
            java.lang.String r1 = "hub"
            goto L_0x061c
        L_0x0600:
            android.content.Intent r4 = X.C14530pL.A0B(r0)
            java.lang.String r1 = "add_new_debit_card"
            goto L_0x061c
        L_0x0607:
            android.content.Intent r4 = X.C14530pL.A0B(r0)
            java.lang.String r1 = "add_new_bank_account"
            goto L_0x061c
        L_0x060e:
            android.content.Intent r4 = X.C14530pL.A0B(r0)
            java.lang.String r1 = "withdraw"
            goto L_0x061c
        L_0x0616:
            android.content.Intent r4 = X.C14530pL.A0B(r0)
            java.lang.String r1 = "reset_password"
        L_0x061c:
            r4.putExtra(r10, r1)
            goto L_0x076b
        L_0x0621:
            X.0sK r3 = r0.A01
            r3.A0B()
            com.obwhatsapp.Me r3 = r3.A00
            if (r3 != 0) goto L_0x0655
            r3 = 2131887706(0x7f12065a, float:1.9410027E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.2T3 r4 = com.obwhatsapp.LegacyMessageDialogFragment.A01(r1, r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 2131887707(0x7f12065b, float:1.9410029E38)
            r4.A05 = r1
            r4.A0B = r2
            r3 = 2131887705(0x7f120659, float:1.9410025E38)
            r2 = 57
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r1.<init>(r0, r2)
            r4.A01(r1, r3)
            androidx.fragment.app.DialogFragment r1 = r4.A00()
            X.02C r0 = r0.AGM()
            r1.A1G(r0, r7)
            return
        L_0x0655:
            X.0w2 r3 = r0.A0U
            X.0w8 r3 = r3.A03
            boolean r5 = r3.A09()
            X.0wS r3 = r0.A0c
            X.19r r6 = r3.A03()
            if (r5 != 0) goto L_0x066d
            boolean r3 = r6.AJR(r1)
            if (r3 == 0) goto L_0x0baa
            goto L_0x0c7e
        L_0x066d:
            X.0w2 r3 = r0.A0U
            java.lang.String r5 = r3.A0C(r1)
            X.19c r3 = r6.AEU()
            if (r3 == 0) goto L_0x0c37
            boolean r3 = r3.A8C(r5)
            if (r3 == 0) goto L_0x0c37
            X.0w2 r2 = r0.A0U
            X.0w8 r5 = r2.A03
            X.174 r2 = r5.A06
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x0695
            X.0s5 r3 = r5.A00
            X.0s8 r2 = X.C15910s6.A0j
            boolean r2 = r3.A05(r2)
            if (r2 != 0) goto L_0x06a2
        L_0x0695:
            X.0pd r5 = r5.A03
            r3 = 1439(0x59f, float:2.016E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r5.A0E(r2, r3)
            r3 = 0
            if (r2 == 0) goto L_0x06a3
        L_0x06a2:
            r3 = 1
        L_0x06a3:
            X.0wS r2 = r0.A0c
            X.19r r2 = r2.A03()
            if (r3 != 0) goto L_0x06b1
            android.content.Intent r5 = r2.ABg(r0, r1, r4)
            goto L_0x09a0
        L_0x06b1:
            android.content.Intent r5 = r2.ABh(r0, r1)
            goto L_0x09a0
        L_0x06b7:
            X.0wS r3 = r0.A0c
            X.19r r3 = r3.A03()
            java.lang.Class r4 = r3.AEw()
            java.lang.String r3 = "PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_VIRALITY "
            java.lang.String r3 = X.AnonymousClass000.A0g(r3, r4)
            com.whatsapp.util.Log.i((java.lang.String) r3)
            if (r4 == 0) goto L_0x06df
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0, r4)
            r3.setData(r1)
            r0.startActivity(r3)
            r1 = 2130771985(0x7f010011, float:1.7147076E38)
            r0.overridePendingTransition(r1, r2)
            goto L_0x0034
        L_0x06df:
            X.C14530pL.A0n(r0)
            goto L_0x0034
        L_0x06e4:
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.account.delete.DeleteAccountActivity"
            r5.setClassName(r2, r1)
            goto L_0x09a0
        L_0x06f3:
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.report.ReportActivity"
            r5.setClassName(r2, r1)
            goto L_0x09a0
        L_0x0702:
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.settings.SettingsChatHistory"
            r5.setClassName(r2, r1)
            goto L_0x09a0
        L_0x0711:
            X.0sK r2 = r0.A01
            X.11R r1 = r0.A0J
            boolean r1 = X.AnonymousClass2BX.A01(r2, r1)
            if (r1 == 0) goto L_0x0034
            X.0ph r2 = r0.A0n
            X.1Mi r1 = r0.A0W
            boolean r1 = r1.A00()
            android.content.Intent r5 = r2.A0s(r0, r11, r1)
            goto L_0x09a0
        L_0x0729:
            java.lang.String r4 = "archived_chats"
            android.content.Intent r3 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.settings.SettingsChat"
            android.content.Intent r5 = r3.setClassName(r2, r1)
            java.lang.String r1 = "scroll_to_setting"
            r5.putExtra(r1, r4)
            goto L_0x09a0
        L_0x0741:
            java.lang.String r3 = r1.getLastPathSegment()
            android.content.Intent r4 = X.C14530pL.A0B(r0)
            java.lang.String r1 = "tpp_account_link"
            r4.putExtra(r10, r1)
            java.lang.String r1 = "access_code"
            goto L_0x0768
        L_0x0752:
            X.0wS r1 = r0.A0c
            X.19r r1 = r1.A03()
            java.lang.String r3 = r1.ABZ()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0034
            android.content.Intent r4 = X.C14750ph.A08(r0, r2)
            java.lang.String r1 = "jid"
        L_0x0768:
            r4.putExtra(r1, r3)
        L_0x076b:
            r0.startActivity(r4)
            goto L_0x0034
        L_0x0770:
            X.0uf r1 = r0.A0A
            boolean r1 = r1.A06()
            if (r1 == 0) goto L_0x0c62
            X.0ui r4 = r0.A0B
            X.1a7 r3 = new X.1a7
            r3.<init>()
            r1 = 2
            r4.A00 = r1
            java.util.Random r1 = r4.A02
            if (r1 != 0) goto L_0x078d
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r4.A02 = r1
        L_0x078d:
            long r1 = r1.nextLong()
            java.lang.String r1 = java.lang.Long.toHexString(r1)
            r4.A01 = r1
            r4.A06(r3)
            X.1Am r1 = r0.A01
            android.content.Intent r5 = r1.A00(r0)
            goto L_0x09a0
        L_0x07a2:
            r2 = 4
            int r3 = r5.getIntExtra(r6, r2)
            r2 = 2
            if (r3 != r2) goto L_0x07c4
            r14 = 17
        L_0x07ac:
            X.0pd r6 = r0.A0C
            X.0sK r5 = r0.A01
            X.10c r4 = r0.A0C
            X.0xQ r3 = r0.A03
            X.0pt r2 = r0.A05
            r7 = r1
            r8 = r0
            r9 = r2
            r10 = r5
            r11 = r3
            r12 = r4
            r13 = r6
            boolean r1 = X.C30341cC.A0H(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 == 0) goto L_0x0034
            return
        L_0x07c4:
            r2 = 3
            r14 = 14
            if (r3 != r2) goto L_0x07ac
            r14 = 18
            goto L_0x07ac
        L_0x07cc:
            X.1IN r3 = r0.A0d
            java.util.List r6 = r1.getPathSegments()
            int r5 = r6.size()
            if (r5 >= r11) goto L_0x07e3
            java.lang.String r2 = "Invalid phoenix deeplink URI: "
            java.lang.String r1 = X.C18450wi.A06(r2, r1)
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x0034
        L_0x07e3:
            java.lang.Object r5 = r6.get(r4)
            X.C18450wi.A0B(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r7 = java.lang.Integer.parseInt(r5)
            r5 = 2
            java.lang.Object r9 = r6.get(r5)
            if (r7 > r4) goto L_0x0034
            java.lang.String r4 = "pay"
            boolean r4 = X.C18450wi.A0R(r9, r4)
            if (r4 == 0) goto L_0x0034
            r4 = 3
            java.lang.String r4 = X.AnonymousClass000.A0n(r6, r4)
            r5 = 4
            java.lang.Object r7 = r6.get(r5)
            X.C18450wi.A09(r9)
            X.C18450wi.A09(r4)
            X.C18450wi.A09(r7)
            java.lang.String r8 = "domain"
            java.lang.String r6 = "config"
            org.json.JSONObject r5 = X.C13700nu.A0J()
            r5.put(r10, r7)
            r5.put(r6, r4)
            r5.put(r8, r9)
            java.lang.String r8 = r5.toString()
            X.C18450wi.A0B(r8)
            X.0vk r6 = r3.A02
            monitor-enter(r6)
            java.util.Map r5 = r6.A00     // Catch:{ all -> 0x0c6b }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x0c6b }
            monitor-exit(r6)
            java.util.Iterator r11 = r5.iterator()
        L_0x0838:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0870
            java.lang.Object r5 = r11.next()
            X.0vu r5 = (X.C17950vu) r5
            X.1VZ r9 = r5.A00
            if (r9 == 0) goto L_0x0838
            X.4Qy r6 = r9.A03
            boolean r5 = r6 instanceof X.C77633w6
            if (r5 == 0) goto L_0x0838
            X.3w6 r6 = (X.C77633w6) r6
            java.lang.String r5 = r6.A02
            X.1IC r6 = r9.A02(r5)
            if (r6 == 0) goto L_0x0838
            boolean r5 = r6 instanceof X.AnonymousClass1IS
            if (r5 == 0) goto L_0x0838
            X.1IS r6 = (X.AnonymousClass1IS) r6
            boolean r5 = r6.A4S(r8)
            if (r5 == 0) goto L_0x0838
            java.lang.String r1 = r1.toString()
            X.C18450wi.A0B(r1)
            r6.AHH(r8, r1)
            goto L_0x0034
        L_0x0870:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.Map r1 = X.AnonymousClass47A.A00(r1)
            if (r1 == 0) goto L_0x087e
            r13.putAll(r1)
        L_0x087e:
            X.0pt r5 = r3.A00
            r1 = 2131889292(0x7f120c8c, float:1.9413243E38)
            r5.A08(r2, r1)
            r13.put(r10, r7)
            X.0wR r1 = r3.A03
            java.lang.String r2 = r1.A01()
            if (r2 == 0) goto L_0x089c
            int r1 = r2.length()
            if (r1 == 0) goto L_0x089c
            java.lang.String r1 = "device_id"
            r13.put(r1, r2)
        L_0x089c:
            X.0vu r9 = r3.A01
            java.lang.String r1 = "DeepLink"
            X.4W4 r10 = new X.4W4
            r10.<init>(r13, r4, r1)
            r11 = 0
            X.511 r7 = new X.511
            r7.<init>(r3)
            X.512 r8 = new X.512
            r8.<init>(r3)
            r14 = 72
            X.C17950vu.A01(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0034
        L_0x08b7:
            java.lang.String r4 = "page"
            java.lang.String r3 = r1.getQueryParameter(r4)
            if (r3 != 0) goto L_0x08ce
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.settings.SettingsChat"
            r5.setClassName(r2, r1)
            goto L_0x09a0
        L_0x08ce:
            java.lang.String r1 = "language"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x08f0
            X.0sK r1 = r0.A01
            boolean r1 = r1.A0G()
            if (r1 != 0) goto L_0x0c7e
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.settings.Settings"
            r5.setClassName(r2, r1)
            r5.putExtra(r4, r3)
            goto L_0x09a0
        L_0x08f0:
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.settings.SettingsChat"
            r5.setClassName(r2, r1)
            r5.putExtra(r4, r3)
            goto L_0x09a0
        L_0x0902:
            X.1L3 r4 = r0.A0D
            X.0vf r3 = r0.A0b
            X.0va r2 = r0.A0F
            X.1L4 r1 = r0.A0E
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()
            r5 = r0
            r6 = r1
            r7 = r2
            r8 = r3
            r4.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0034
        L_0x091b:
            java.lang.String r3 = "text"
            java.lang.String r6 = r1.getQueryParameter(r3)
            java.lang.String r3 = "android.intent.extra.STREAM"
            android.os.Parcelable r3 = r5.getParcelableExtra(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto L_0x09d8
            X.0pd r9 = r0.A0C
            r8 = 2816(0xb00, float:3.946E-42)
            X.0tM r5 = X.C16620tM.A02
            boolean r5 = r9.A0E(r5, r8)
            if (r5 == 0) goto L_0x09d8
            X.20I r5 = new X.20I
            r5.<init>(r1)
            if (r6 == 0) goto L_0x0942
            r5.A0D(r6)
        L_0x0942:
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r1.getType(r3)
            java.lang.String r7 = r2.getExtensionFromMimeType(r1)
            java.util.List r1 = X.C43011zC.A08
            java.util.Iterator r2 = r1.iterator()
        L_0x0958:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x09a5
            java.lang.String r1 = X.AnonymousClass000.A0m(r2)
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L_0x0958
            r1 = 1
        L_0x0969:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            if (r1 == 0) goto L_0x0972
            r5.A0C(r1)
        L_0x0972:
            X.29Q r7 = new X.29Q
            r7.<init>(r5)
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            r5.add(r3)
            X.2KC r2 = new X.2KC
            r2.<init>(r0)
            r2.A02 = r11
            X.1kq r1 = X.C34771kq.A00
            java.lang.String r1 = r1.getRawString()
            r2.A0A = r1
            r2.A0I = r4
            r2.A0E = r5
            android.os.Bundle r1 = X.C13690nt.A0D()
            r7.A02(r1)
            r2.A08 = r1
            r2.A0C = r6
            android.content.Intent r5 = r2.A00()
        L_0x09a0:
            r0.startActivity(r5)
            goto L_0x0034
        L_0x09a5:
            java.util.List r1 = X.C43011zC.A07
            java.util.Iterator r2 = r1.iterator()
        L_0x09ab:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x09be
            java.lang.String r1 = X.AnonymousClass000.A0m(r2)
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L_0x09ab
            r1 = 13
            goto L_0x0969
        L_0x09be:
            java.util.List r1 = X.C43011zC.A09
            java.util.Iterator r2 = r1.iterator()
        L_0x09c4:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x09d6
            java.lang.String r1 = X.AnonymousClass000.A0m(r2)
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L_0x09c4
            r1 = 3
            goto L_0x0969
        L_0x09d6:
            r1 = 0
            goto L_0x0969
        L_0x09d8:
            if (r6 == 0) goto L_0x0a03
            X.1m6 r4 = new X.1m6
            r4.<init>(r7, r7, r2, r2)
            r1 = 13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity"
            r5.setClassName(r2, r1)
            java.lang.String r1 = "status_distribution"
            r5.putExtra(r1, r4)
            java.lang.String r1 = "android.intent.extra.TEXT"
            r5.putExtra(r1, r6)
            java.lang.String r1 = "entry_point"
            r5.putExtra(r1, r3)
            goto L_0x09a0
        L_0x0a03:
            android.content.Intent r4 = X.C13680ns.A09()
            java.lang.String r3 = r0.getPackageName()
            java.lang.String r2 = "com.obwhatsapp.HomeActivity"
            android.content.Intent r3 = r4.setClassName(r3, r2)
            java.lang.String r2 = "com.obwhatsapp.intent.action.STATUSES"
            android.content.Intent r5 = r3.setAction(r2)
            java.lang.String r2 = "android.intent.action.VIEW"
            r5.setAction(r2)
            r5.setData(r1)
            goto L_0x09a0
        L_0x0a20:
            android.content.Intent r3 = X.C13680ns.A09()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.settings.SettingsPrivacy"
            r3.setClassName(r2, r1)
            r0.startActivity(r3)
            r0.finish()
            goto L_0x0034
        L_0x0a35:
            java.lang.String r3 = "ep"
            java.lang.String r4 = r1.getQueryParameter(r3)
            java.lang.String r3 = "articles"
            java.lang.String r1 = r1.getQueryParameter(r3)
            if (r4 != 0) goto L_0x0a89
            if (r1 != 0) goto L_0x0a89
            r10 = 0
        L_0x0a46:
            X.0sq r9 = r0.A05
            X.1KO r8 = r0.A02
            X.01V r7 = r0.A08
            X.15W r6 = r0.A0Y
            X.0sj r5 = r0.A0K
            X.1KP r4 = r0.A0f
            X.0wP r3 = r0.A07
            X.0sK r1 = r0.A01
            r1.A0B()
            com.obwhatsapp.Me r1 = r1.A00
            if (r1 == 0) goto L_0x0a67
            X.0sC r1 = r0.A09
            boolean r1 = r1.A01()
            r23 = 1
            if (r1 != 0) goto L_0x0a69
        L_0x0a67:
            r23 = 0
        L_0x0a69:
            r24 = 1
            r12 = 0
            java.lang.String r21 = "deeplink/support"
            X.379 r1 = new X.379
            r22 = 0
            r11 = r1
            r13 = r0
            r14 = r8
            r15 = r3
            r16 = r7
            r17 = r5
            r18 = r10
            r19 = r6
            r20 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String[] r0 = new java.lang.String[r2]
            r9.Ack(r1, r0)
            return
        L_0x0a89:
            X.1Y3 r10 = new X.1Y3
            r10.<init>(r4, r1)
            goto L_0x0a46
        L_0x0a8f:
            java.lang.String r3 = r1.getQueryParameter(r10)
            java.lang.String r2 = "deeper-category-selection"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0a9f
            java.lang.String r4 = "whatsapp-smb://biztools/directory?action=deeper-category-selection"
            goto L_0x0b00
        L_0x0a9f:
            java.util.Set r2 = r1.getQueryParameterNames()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0ad6
            r2 = r22
            java.lang.String r3 = r1.getQueryParameter(r2)
            java.lang.String r2 = "version"
            java.lang.String r4 = r1.getQueryParameter(r2)
            if (r3 == 0) goto L_0x0ada
            if (r4 == 0) goto L_0x0ada
            java.lang.String r2 = "\""
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r2, r1)
            java.lang.String r2 = r4.replaceAll(r2, r1)
            java.lang.String r1 = "directory_bot"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0ada
            java.util.Set r1 = X.AnonymousClass49K.A00
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0ada
        L_0x0ad6:
            java.lang.String r4 = "whatsapp-smb://biztools/directory"
            goto L_0x0b00
        L_0x0ada:
            r1 = 2131889062(0x7f120ba6, float:1.9412777E38)
            r0.Afg(r1)
            return
        L_0x0ae1:
            java.lang.String r4 = "whatsapp-smb://biztools/accounts"
            goto L_0x0b00
        L_0x0ae5:
            java.lang.String r4 = "whatsapp-smb://premium"
            goto L_0x0b00
        L_0x0ae9:
            java.lang.String r4 = "whatsapp-smb://biz-edit-profile"
            goto L_0x0b00
        L_0x0aed:
            java.lang.String r4 = "whatsapp-smb://biz-edit-catalog"
            goto L_0x0b00
        L_0x0af1:
            java.lang.String r4 = "whatsapp-smb://biz-hours"
            goto L_0x0b00
        L_0x0af5:
            java.lang.String r4 = "whatsapp-smb://biz-location"
            goto L_0x0b00
        L_0x0af9:
            java.lang.String r4 = "whatsapp-smb://biz-linked-accounts"
            goto L_0x0b00
        L_0x0afd:
            java.lang.String r4 = "whatsapp-smb://biz-edit-description"
        L_0x0b00:
            X.1fu r3 = X.C32241fu.A00(r0)
            r1 = 2131889062(0x7f120ba6, float:1.9412777E38)
            r3.A02(r1)
            r1 = 2131889063(0x7f120ba7, float:1.9412779E38)
            r3.A01(r1)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 54
            X.C13690nt.A1H(r3, r0, r1, r2)
            r2 = 2131889810(0x7f120e92, float:1.9414294E38)
            X.3C4 r1 = new X.3C4
            r1.<init>(r0, r4)
            r3.setPositiveButton(r2, r1)
            X.02l r3 = r3.create()
            r2 = 2
            com.facebook.redex.IDxDListenerShape159S0100000_2_I1 r1 = new com.facebook.redex.IDxDListenerShape159S0100000_2_I1
            r1.<init>(r0, r2)
            r3.setOnDismissListener(r1)
            r3.show()
            return
        L_0x0b34:
            java.lang.String r2 = "entry_point"
            java.lang.String r2 = r1.getQueryParameter(r2)
            java.lang.String r10 = "wa_pages"
            boolean r12 = r10.equals(r2)
            if (r12 == 0) goto L_0x0b9b
            X.0ue r4 = r0.A07
            r2 = 18
            r4.A02(r2)
        L_0x0b4a:
            X.1KW r2 = r0.A0e
            r2.A00()
            r8 = 2131889812(0x7f120e94, float:1.9414298E38)
            r6 = 2131887053(0x7f1203cd, float:1.9408702E38)
            X.1KZ r9 = r0.A04
            X.0x0 r11 = r9.A05
            r5 = 774781666(0x2e2e3ae2, float:3.9615318E-11)
            java.lang.String r4 = "catalog_collections_view_tag"
            java.lang.String r2 = "CatalogModuleHelper"
            r11.A00(r5, r4, r2)
            X.1WD r5 = new X.1WD
            r5.<init>()
            X.1KY r4 = r9.A03
            X.3Ew r2 = new X.3Ew
            r13 = r2
            r14 = r0
            r15 = r5
            r16 = r9
            r17 = r7
            r18 = r21
            r13.<init>(r14, r15, r16, r17, r18)
            r4.A02(r2)
            android.content.res.Resources r4 = r0.getResources()
            r2 = 2131166783(0x7f07063f, float:1.7947821E38)
            int r4 = r4.getDimensionPixelSize(r2)
            X.1KA r2 = r9.A04
            r2.A04(r7, r4)
            r0.A35(r5, r8, r6)
            if (r12 != 0) goto L_0x0b92
            java.lang.String r10 = "catalog_link"
        L_0x0b92:
            r0.A36(r7, r10, r3)
        L_0x0b95:
            X.1Aw r0 = r0.A0k
            r0.A00(r1, r7)
            return
        L_0x0b9b:
            r8 = 4
            int r4 = r5.getIntExtra(r6, r8)
            X.0ue r2 = r0.A07
            if (r4 != r8) goto L_0x0ba6
            r9 = 15
        L_0x0ba6:
            r2.A02(r9)
            goto L_0x0b4a
        L_0x0baa:
            X.0ug r3 = r0.A0Z
            X.3GT r13 = new X.3GT
            r13.<init>(r0, r3)
            java.lang.String r11 = "sendVerifyLinkRequest url="
            java.lang.String r8 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x0c6e }
            java.lang.String r7 = r1.getHost()     // Catch:{ URISyntaxException -> 0x0c6e }
            java.lang.String r6 = r1.getPath()     // Catch:{ URISyntaxException -> 0x0c6e }
            r3 = 0
            java.net.URI r5 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0c6e }
            r5.<init>(r8, r7, r6, r3)     // Catch:{ URISyntaxException -> 0x0c6e }
            X.0ug r12 = r13.A01
            java.lang.String r15 = r12.A02()
            X.1lL[] r10 = new X.C35081lL[r4]
            java.lang.String r7 = "type"
            java.lang.String r3 = "verify_link"
            X.C35081lL.A02(r7, r3, r10, r2)
            X.1Vv[] r9 = new X.C28371Vv[r4]
            java.lang.String r8 = r5.toString()
            java.lang.String r6 = "url"
            r5 = 0
            X.1Vv r3 = new X.1Vv
            r3.<init>((java.lang.String) r6, (java.lang.String) r8, (X.C35081lL[]) r5)
            r9[r2] = r3
            java.lang.String r3 = "request"
            X.1Vv r6 = new X.1Vv
            r6.<init>((java.lang.String) r3, (X.C35081lL[]) r10, (X.C28371Vv[]) r9)
            r3 = 3
            X.1lL[] r5 = new X.C35081lL[r3]
            java.lang.String r3 = "id"
            X.C35081lL.A02(r3, r15, r5, r2)
            java.lang.String r3 = "xmlns"
            java.lang.String r2 = "fb:thrift_iq"
            X.C35081lL.A02(r3, r2, r5, r4)
            java.lang.String r2 = "get"
            X.C35081lL.A01(r7, r2, r5)
            X.1Vv r14 = X.C28371Vv.A04(r6, r5)
            r16 = 229(0xe5, float:3.21E-43)
            r17 = 32000(0x7d00, double:1.581E-319)
            boolean r3 = r12.A0G(r13, r14, r15, r16, r17)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r11)
            r2.append(r1)
            java.lang.String r1 = " success:"
            r2.append(r1)
            r2.append(r3)
            X.C13680ns.A1V(r2)
            if (r3 == 0) goto L_0x0c7e
            android.os.Handler r1 = r0.A00
            android.os.Message r3 = android.os.Message.obtain(r1, r4)
            r1 = 2131889813(0x7f120e95, float:1.94143E38)
            r3.arg1 = r1
            android.os.Handler r2 = r0.A00
            r0 = 500(0x1f4, double:2.47E-321)
            r2.sendMessageDelayed(r3, r0)
            return
        L_0x0c37:
            r3 = 2131893156(0x7f121ba4, float:1.942108E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.2T3 r4 = com.obwhatsapp.LegacyMessageDialogFragment.A01(r1, r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 2131893157(0x7f121ba5, float:1.9421083E38)
            r4.A05 = r1
            r4.A0B = r2
            r3 = 2131889799(0x7f120e87, float:1.9414272E38)
            r2 = 12
            com.facebook.redex.IDxCListenerShape23S0000000_2_I1 r1 = new com.facebook.redex.IDxCListenerShape23S0000000_2_I1
            r1.<init>(r2)
            r4.A01(r1, r3)
            androidx.fragment.app.DialogFragment r1 = r4.A00()
            X.02C r0 = r0.AGM()
            r1.A1G(r0, r7)
            return
        L_0x0c62:
            r3 = 2131887866(0x7f1206fa, float:1.9410351E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0.Afj(r1, r3, r2)
            return
        L_0x0c6b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0c6e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r11)
            r2.append(r1)
            java.lang.String r1 = " failed because the url is invalid"
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0c7e:
            X.C14530pL.A0n(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.deeplink.DeepLinkActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.removeMessages(1);
    }
}
