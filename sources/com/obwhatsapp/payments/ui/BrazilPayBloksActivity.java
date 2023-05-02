package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass0y5;
import X.AnonymousClass124;
import X.AnonymousClass160;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass175;
import X.AnonymousClass17O;
import X.AnonymousClass1JN;
import X.AnonymousClass1MQ;
import X.AnonymousClass1N0;
import X.AnonymousClass1N3;
import X.AnonymousClass1TR;
import X.AnonymousClass1XK;
import X.AnonymousClass1Z7;
import X.AnonymousClass22A;
import X.AnonymousClass2KR;
import X.AnonymousClass2ZU;
import X.AnonymousClass50C;
import X.AnonymousClass5vV;
import X.AnonymousClass5vX;
import X.AnonymousClass5wV;
import X.AnonymousClass5x7;
import X.AnonymousClass5xF;
import X.AnonymousClass5xG;
import X.AnonymousClass60F;
import X.AnonymousClass61E;
import X.AnonymousClass638;
import X.AnonymousClass68D;
import X.C110105dW;
import X.C110115dX;
import X.C111335g1;
import X.C111815hS;
import X.C111995hm;
import X.C112855jo;
import X.C113015lE;
import X.C115245pQ;
import X.C116105qp;
import X.C116325rC;
import X.C116565ra;
import X.C117045sM;
import X.C117475t3;
import X.C117745tU;
import X.C117875th;
import X.C118045ty;
import X.C118205uJ;
import X.C118305uT;
import X.C118335uW;
import X.C118365uZ;
import X.C118415ue;
import X.C118435ug;
import X.C118445uh;
import X.C118495um;
import X.C118505un;
import X.C118585uv;
import X.C118795vG;
import X.C118915vc;
import X.C118955vg;
import X.C119165we;
import X.C119195wh;
import X.C119285wq;
import X.C119315wt;
import X.C119405xi;
import X.C119895zn;
import X.C1200860g;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14870pt;
import X.C16150sX;
import X.C16460t6;
import X.C16490t9;
import X.C17190ug;
import X.C17220uj;
import X.C17270uo;
import X.C18090w8;
import X.C18280wR;
import X.C18310wU;
import X.C18320wV;
import X.C18340wX;
import X.C221116r;
import X.C24561Gk;
import X.C26071Mf;
import X.C26251Mz;
import X.C30671cl;
import X.C32241fu;
import X.C35391lr;
import X.C39891tE;
import X.C49132Rg;
import X.C88624ap;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxBCallbackShape114S0200000_3_I1;
import com.facebook.redex.IDxCListenerShape130S0100000_3_I1;
import com.facebook.redex.IDxKCallbackShape15S0400000_3_I1;
import com.facebook.redex.IDxKCallbackShape73S0200000_3_I1;
import com.obwhatsapp.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public class BrazilPayBloksActivity extends C112855jo implements AnonymousClass2KR {
    public C118305uT A00;
    public AnonymousClass1Z7 A01;
    public C117875th A02;
    public AnonymousClass173 A03;
    public C30671cl A04;
    public AnonymousClass160 A05;
    public C17190ug A06;
    public AnonymousClass5x7 A07;
    public C111995hm A08;
    public C1200860g A09;
    public C119315wt A0A;
    public C18090w8 A0B;
    public C118495um A0C;
    public C118505un A0D;
    public C116105qp A0E;
    public C118585uv A0F;
    public AnonymousClass1N3 A0G;
    public AnonymousClass1JN A0H;
    public AnonymousClass1TR A0I;
    public AnonymousClass5vX A0J;
    public C113015lE A0K;
    public C118955vg A0L;
    public C119165we A0M;
    public AnonymousClass5xF A0N;
    public C118205uJ A0O;
    public String A0P;
    public boolean A0Q;

    public BrazilPayBloksActivity() {
        this(0);
        this.A01 = null;
        this.A0P = null;
        this.A04 = null;
    }

    public BrazilPayBloksActivity(int i2) {
        this.A0Q = false;
        C110105dW.A0t(this, 17);
    }

    public static int A0A(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((AnonymousClass638) list.get(i2)).A0C) {
                return i2;
            }
        }
        return -1;
    }

    public static void A0T(AnonymousClass638 r3, Map map) {
        String str;
        String str2;
        map.put("card_verify_identifier", r3.A03);
        String str3 = r3.A0B;
        map.put("card_verify_type", str3);
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1302107194:
                    if (!str3.equals("customer-service")) {
                        return;
                    }
                    break;
                case -119226117:
                    if (str3.equals("app-to-app")) {
                        map.put("app_to_app_partner_app_name", r3.A06);
                        map.put("app_to_app_partner_app_package", r3.A07);
                        map.put("app_to_app_partner_intent_action", r3.A08);
                        map.put("app_to_app_request_payload", r3.A09);
                        break;
                    } else {
                        return;
                    }
                case 110379:
                    if (str3.equals("otp")) {
                        map.put("card_verify_otp_type", r3.A05);
                        map.put("card_verify_otp_resend_interval_sec", String.valueOf(r3.A01));
                        map.put("card_verify_otp_receiver_info", r3.A04);
                        int i2 = r3.A00;
                        map.put("otp_length", String.valueOf(i2));
                        map.put("remaining_validates", String.valueOf(1));
                        StringBuilder A0o = AnonymousClass000.A0o();
                        for (int i3 = 0; i3 < i2; i3++) {
                            A0o.append("#  ");
                        }
                        str = A0o.toString().trim();
                        str2 = "otp_mask";
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            str = r3.A0A;
            str2 = "support_phone_number";
            map.put(str2, str);
        }
    }

    public void A1q() {
        if (!this.A0Q) {
            this.A0Q = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            this.A07 = (C16490t9) r1.AQz.get();
            this.A01 = (C118045ty) r1.A2E.get();
            this.A02 = (C119195wh) r1.ABr.get();
            this.A06 = A0C2.A06();
            this.A00 = (AnonymousClass2ZU) A0C2.A1m.get();
            C116565ra r3 = new C116565ra();
            r3.A01 = C17270uo.A00(r1.AJv);
            this.A04 = r3;
            this.A08 = C16150sX.A1C(r1);
            this.A06 = (AnonymousClass124) r1.ALe.get();
            this.A0H = (C118365uZ) r1.AIm.get();
            this.A0V = (C116325rC) r1.APA.get();
            this.A0X = (C17220uj) r1.A9x.get();
            this.A0G = C110115dX.A0Q(r1);
            this.A0U = C110115dX.A0V(r1);
            this.A04 = (C16460t6) r1.A5k.get();
            this.A0P = (AnonymousClass5wV) r1.AHi.get();
            this.A00 = (AnonymousClass1N0) r1.A20.get();
            this.A01 = (C26251Mz) r1.A28.get();
            this.A0L = (AnonymousClass5vV) r1.AHW.get();
            this.A0J = (C117045sM) r1.AI4.get();
            this.A0C = C110115dX.A0O(r1);
            this.A0W = (AnonymousClass0y5) r1.ARa.get();
            this.A09 = (AnonymousClass175) r1.AH5.get();
            this.A03 = C16150sX.A0X(r1);
            this.A0R = new C115245pQ();
            this.A0D = C110115dX.A0P(r1);
            this.A0Q = (C118915vc) r1.AHj.get();
            this.A02 = (C24561Gk) r1.AQA.get();
            this.A0N = (C118335uW) r1.AGB.get();
            this.A0E = (AnonymousClass174) r1.AI3.get();
            this.A07 = C110115dX.A0J(r1);
            this.A05 = (C221116r) r1.AHt.get();
            this.A0F = (C18320wV) r1.AIA.get();
            this.A0I = (C118795vG) r1.AI0.get();
            this.A0A = C110115dX.A0M(r1);
            this.A0O = (AnonymousClass5xG) r1.AHX.get();
            this.A0K = (C119285wq) r1.AIH.get();
            this.A0B = (AnonymousClass17O) r1.AHe.get();
            this.A0T = (C117745tU) r1.AHx.get();
            this.A05 = (AnonymousClass160) r1.AHq.get();
            this.A06 = C16150sX.A0t(r1);
            this.A02 = (C117875th) r1.A24.get();
            this.A07 = (AnonymousClass5x7) r1.A2I.get();
            this.A0K = (C113015lE) r1.A2N.get();
            this.A00 = (C118305uT) r1.A21.get();
            this.A0H = (AnonymousClass1JN) r1.AI5.get();
            this.A0F = (C118585uv) r1.A2P.get();
            this.A0J = (AnonymousClass5vX) r1.A2J.get();
            this.A0B = C16150sX.A10(r1);
            this.A0C = (C118495um) r1.AFx.get();
            this.A03 = C110115dX.A0D(r1);
            this.A0A = (C119315wt) r1.A2Y.get();
            this.A09 = A0C2.A0N();
            this.A0I = (AnonymousClass1TR) r1.AEa.get();
            this.A0E = (C116105qp) r1.A2O.get();
            this.A0N = (AnonymousClass5xF) r1.A2H.get();
            this.A0O = (C118205uJ) r1.A2a.get();
            this.A0L = (C118955vg) r1.A2T.get();
            this.A0M = A0C2.A0T();
            this.A0D = (C118505un) r1.AI1.get();
            this.A08 = (C111995hm) r1.A2L.get();
            this.A0G = (AnonymousClass1N3) r1.A2Q.get();
        }
    }

    public AnonymousClass68D A35() {
        return new C119895zn(this);
    }

    public final void A3A(AnonymousClass1Z7 r5) {
        C32241fu A002 = C32241fu.A00(this);
        A002.setTitle(getString(R.string.str0727));
        C110115dX.A0m(this, A002, R.string.str0726);
        A002.A09(new IDxCListenerShape130S0100000_3_I1(r5, 6), getString(R.string.str1161));
        A002.A00();
    }

    public final void A3B(AnonymousClass1Z7 r10, C35391lr r11, String str, List list, boolean z2) {
        AnonymousClass638 r2;
        HashMap A0x = AnonymousClass000.A0x();
        C111815hS r8 = (C111815hS) r11.A08;
        A3F(r11, str, A0x);
        if (z2) {
            A0x.put("verified_state", "1");
        } else {
            if (list == null || list.isEmpty()) {
                if (r8 != null && r8.A08) {
                    A0x.put("verified_state", "0");
                    A0x.put("card_need_device_binding", "1");
                }
            } else if (!AnonymousClass5x7.A01(list)) {
                int A002 = C110115dX.A00(this, list);
                JSONArray A022 = this.A07.A02(list);
                if (A022 != null) {
                    int A0A2 = A0A(list);
                    if (!(!this.A0C.A0C(A002) || A0A2 == -1 || (r2 = (AnonymousClass638) list.get(A0A2)) == null)) {
                        A0x.put("default_selected_position", String.valueOf(A0A2));
                        A0T(r2, A0x);
                    }
                    A0x.put("verify_methods", A022.toString());
                }
                A0x.put("verified_state", "0");
            }
            C112855jo.A09(r10, (Map) null, -233);
            return;
        }
        r10.A01("on_success", A0x);
    }

    public final void A3C(AnonymousClass1Z7 r10, String str) {
        C14870pt r3 = this.A05;
        new C118445uh(this, this.A03, r3, this.A03, this.A06, this.A0A, new IDxBCallbackShape114S0200000_3_I1(r10, 0, this), str).A00();
    }

    public final void A3D(AnonymousClass1Z7 r16, String str, List list, List list2, int i2) {
        List list3 = list;
        AnonymousClass1Z7 r3 = r16;
        int i3 = i2;
        if (i3 >= list3.size()) {
            r3.A00("on_failure");
            return;
        }
        C118505un r11 = this.A0D;
        File file = (File) list3.get(i3);
        AnonymousClass1XK r13 = AnonymousClass1XK.A0Q;
        C117475t3 r2 = new C117475t3(r3, this, str, list2, list3, i3);
        Context context = r11.A01;
        C14870pt r5 = r11.A02;
        C18310wU r7 = r11.A06;
        C18340wX r6 = r11.A05;
        C119285wq r8 = r11.A07;
        C118435ug r32 = new C118435ug(context, r5, r6, r7, r8, "DOC-UPLOAD");
        AnonymousClass50C A022 = r8.A02("FB", "DOC-UPLOAD", true);
        if (A022 != null) {
            r11.A00(A022, r2, r13, file);
        } else {
            r32.A00(new IDxKCallbackShape15S0400000_3_I1(file, r11, r2, r13, 1), "FB");
        }
    }

    public final void A3E(AnonymousClass1Z7 r22, Map map, int i2) {
        Map map2 = map;
        String A022 = C111335g1.A02("full_name", map2);
        String A0e = C13690nt.A0e("tax_id", map2);
        AnonymousClass00B.A05(A0e);
        String replaceAll = A0e.replaceAll("[^\\d]", "");
        String A062 = this.A01.A06();
        AnonymousClass00B.A06(A062);
        String replaceAll2 = C24561Gk.A00(C26071Mf.A00(), A062).replaceAll("[^\\d]", "");
        String replaceAll3 = C111335g1.A02("address_postal_code", map2).replaceAll("[^\\d]", "");
        String A0e2 = C13690nt.A0e("address_street_name", map2);
        String A0e3 = C13690nt.A0e("address_city", map2);
        String A0e4 = C13690nt.A0e("address_state", map2);
        String A0e5 = C13690nt.A0e("address_houe_number", map2);
        String A0e6 = C13690nt.A0e("address_extra_line", map2);
        String A0e7 = C13690nt.A0e("address_neighborhood", map2);
        C14870pt r6 = this.A05;
        C18280wR r10 = this.A0U;
        C118415ue r4 = new C118415ue(this, r6, this.A0A, this.A0D, this.A0K, r10, A022, replaceAll, replaceAll2, A0e2, A0e5, A0e6, A0e7, A0e3, A0e4, replaceAll3);
        AnonymousClass61E r2 = new AnonymousClass61E(r22, this, map2, i2);
        C119285wq r102 = r4.A05;
        AnonymousClass50C A0R = C110115dX.A0R(r102, "FB", "KYC");
        if (A0R == null || !A0R.A05.equalsIgnoreCase("FB")) {
            new C118435ug(r4.A01, r4.A02, r4.A03, r4.A04, r102, "KYC").A00(new IDxKCallbackShape73S0200000_3_I1(r2, 0, r4), "FB");
            return;
        }
        r4.A00(r2, A0R);
    }

    public final void A3F(C35391lr r4, String str, Map map) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            map.put("callback_url", str);
        }
        map.put("credential_id", r4.A0A);
        map.put("readable_name", C119405xi.A02(this, r4));
        C39891tE r2 = (C39891tE) r4.A08;
        if (r2 != null && ((str2 = r2.A0N) == null || !(!"DISABLED".equals(str2)))) {
            map.put("p2p_ineligible", "1");
        }
        map.put("network_name", C35391lr.A06(r4.A01));
        if (r2 != null && !TextUtils.isEmpty(r2.A0E)) {
            map.put("card_image_url", r2.A0E);
        }
    }

    public AnonymousClass1MQ AA9() {
        return this.A06;
    }

    public AnonymousClass22A AH1() {
        return C110115dX.A0A(this, AGM(), this.A00, this.A08);
    }

    public boolean AHK(int i2) {
        if (i2 != 442) {
            return super.AHK(i2);
        }
        BrazilReTosFragment brazilReTosFragment = new BrazilReTosFragment();
        brazilReTosFragment.A1N();
        Afc(brazilReTosFragment);
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:205:0x056b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AaT(X.AnonymousClass1Z7 r36, java.lang.String r37, java.util.Map r38) {
        /*
            r35 = this;
            r5 = r37
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r4 = ""
            r3 = r36
            if (r0 == 0) goto L_0x000f
            r3.A00(r4)
        L_0x000f:
            r7 = -1
            int r0 = r5.hashCode()
            r2 = 1
            switch(r0) {
                case -1828362259: goto L_0x024e;
                case -1789788977: goto L_0x0259;
                case -1579572125: goto L_0x0264;
                case -1427341776: goto L_0x026f;
                case -1326006358: goto L_0x027a;
                case -1290918873: goto L_0x0285;
                case -1265267765: goto L_0x0290;
                case -1264881022: goto L_0x029b;
                case -1236338706: goto L_0x02a6;
                case -1157449815: goto L_0x02b2;
                case -1017011091: goto L_0x02be;
                case -981053487: goto L_0x02ca;
                case -857462632: goto L_0x02d6;
                case -641808715: goto L_0x02e2;
                case -553110595: goto L_0x02ee;
                case -524241064: goto L_0x02fa;
                case -491008410: goto L_0x0306;
                case -468036698: goto L_0x0312;
                case -438460728: goto L_0x031e;
                case 159220715: goto L_0x032a;
                case 243254635: goto L_0x0336;
                case 580608584: goto L_0x0342;
                case 828045967: goto L_0x034e;
                case 1410504463: goto L_0x035a;
                case 1564995942: goto L_0x0366;
                case 1684922085: goto L_0x0372;
                case 1760388972: goto L_0x037e;
                case 2069491034: goto L_0x038a;
                case 2124929861: goto L_0x0396;
                case 2146747614: goto L_0x03a2;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r6 = "on_success"
            r0 = r35
            r1 = r38
            switch(r7) {
                case 0: goto L_0x03db;
                case 1: goto L_0x03e6;
                case 2: goto L_0x03ae;
                case 3: goto L_0x0474;
                case 4: goto L_0x04d7;
                case 5: goto L_0x0572;
                case 6: goto L_0x05a8;
                case 7: goto L_0x05ad;
                case 8: goto L_0x0025;
                case 9: goto L_0x03b6;
                case 10: goto L_0x06de;
                case 11: goto L_0x0751;
                case 12: goto L_0x0834;
                case 13: goto L_0x088b;
                case 14: goto L_0x03e9;
                case 15: goto L_0x03f7;
                case 16: goto L_0x0945;
                case 17: goto L_0x03fe;
                case 18: goto L_0x098e;
                case 19: goto L_0x0406;
                case 20: goto L_0x0a00;
                case 21: goto L_0x0aab;
                case 22: goto L_0x0b7e;
                case 23: goto L_0x040d;
                case 24: goto L_0x0bde;
                case 25: goto L_0x0c04;
                case 26: goto L_0x0c31;
                case 27: goto L_0x041c;
                case 28: goto L_0x0428;
                case 29: goto L_0x00f6;
                default: goto L_0x0021;
            }
        L_0x0021:
            super.AaT(r3, r5, r1)
        L_0x0024:
            return
        L_0x0025:
            java.lang.String r4 = "cvv"
            java.lang.String r30 = X.C13690nt.A0e(r4, r1)
            java.lang.String r4 = "expiry_date"
            java.lang.String r5 = X.C111335g1.A02(r4, r1)
            java.lang.String r4 = "/"
            java.lang.String[] r6 = r5.split(r4)
            r4 = 2
            int[] r11 = new int[r4]
            r5 = 0
            r4 = r6[r5]
            int r4 = X.C29501aj.A00(r4, r5)
            r11[r5] = r4
            r5 = r6[r2]
            r4 = -2000(0xfffffffffffff830, float:NaN)
            int r4 = X.C29501aj.A00(r5, r4)
            int r4 = r4 + 2000
            r11[r2] = r4
            java.lang.String r4 = "card_number"
            java.lang.String r29 = X.C13690nt.A0e(r4, r1)
            X.0pd r4 = r0.A0C
            r1 = 1482(0x5ca, float:2.077E-42)
            boolean r1 = r4.A0C(r1)
            if (r1 == 0) goto L_0x00dc
            X.5vg r1 = r0.A0L
            X.175 r4 = r1.A02
            java.lang.String r1 = "add_card"
            boolean r1 = r4.A0G(r1)
            r1 = r1 ^ 1
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r1)
        L_0x006f:
            X.0t3 r1 = r0.A05
            r18 = r1
            X.0pt r1 = r0.A05
            r34 = r1
            X.0sK r1 = r0.A01
            r33 = r1
            X.0sq r1 = r0.A05
            r17 = r1
            X.0ug r1 = r0.A06
            r16 = r1
            X.5rC r15 = r0.A0V
            X.0wR r14 = r0.A0U
            X.0wS r13 = r0.A0G
            X.0wT r12 = r0.A0C
            X.0y5 r10 = r0.A0W
            X.5vX r9 = r0.A0J
            X.5uv r8 = r0.A0F
            X.173 r7 = r0.A03
            X.0wU r6 = r0.A0D
            X.0wP r5 = r0.A07
            X.0wX r4 = r0.A0A
            r1 = 0
            r31 = r11[r1]
            r32 = r11[r2]
            X.5u2 r1 = new X.5u2
            r1.<init>(r3, r0)
            X.5i0 r3 = new X.5i0
            r19 = r6
            r20 = r13
            r21 = r8
            r22 = r9
            r23 = r1
            r24 = r14
            r25 = r15
            r26 = r10
            r27 = r17
            r13 = r5
            r14 = r18
            r15 = r7
            r17 = r4
            r18 = r12
            r9 = r3
            r10 = r0
            r11 = r34
            r12 = r33
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.5uv r5 = r0.A0F
            X.5ro r4 = new X.5ro
            r4.<init>(r3, r5)
            X.5hm r1 = r5.A0B
            r1.A03(r4)
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00df
            r1.A02(r4)
            return
        L_0x00dc:
            r28 = 0
            goto L_0x006f
        L_0x00df:
            X.5tD r1 = r5.A00
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0024
            r5.A02 = r2
            r5.A00 = r1
            X.1Vo r1 = r3.A0B
            java.lang.String r0 = "sendAddCard"
            r1.A06(r0)
            X.0sq r0 = r3.A0G
            X.C13680ns.A1U(r3, r0)
            return
        L_0x00f6:
            java.lang.String r2 = "card_verify_type"
            java.lang.String r4 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r4)
            java.lang.String r2 = "app-to-app"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x01e1
            java.lang.String r2 = "otp"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "credential_id"
            java.lang.String r20 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r20)
            java.lang.String r2 = "card_verify_identifier"
            java.lang.String r21 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r21)
            X.0t3 r4 = r0.A05
            X.0sK r2 = r0.A01
            java.lang.String r19 = X.C110105dW.A0f(r2, r4)
            java.lang.String r2 = "card_verify_otp_resend_interval_sec"
            java.lang.String r7 = X.C13690nt.A0e(r2, r1)
            X.0pt r6 = r0.A05
            X.0ug r5 = r0.A06
            X.5uv r4 = r0.A0F
            X.173 r2 = r0.A03
            X.0wX r1 = r0.A0A
            X.5tK r12 = new X.5tK
            r13 = r0
            r14 = r6
            r15 = r2
            r16 = r5
            r17 = r1
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.5uF r5 = new X.5uF
            r5.<init>(r3, r0, r7)
            X.0ug r7 = r12.A03
            java.lang.String r6 = r7.A02()
            java.lang.String r11 = r12.A06
            java.lang.String r13 = r12.A07
            java.lang.String r4 = r12.A08
            X.5uv r2 = r12.A05
            X.160 r0 = r2.A09
            X.1cl r0 = r0.A08(r11)
            X.1lr r0 = (X.C35391lr) r0
            if (r0 == 0) goto L_0x01df
            int r0 = r0.A01
            r1 = 5
            if (r0 != r1) goto L_0x01df
            X.5uW r0 = r2.A0H
            java.lang.String r0 = r0.A00(r1)
            X.5rN r3 = new X.5rN
            r3.<init>(r0)
        L_0x0174:
            X.2cK r2 = new X.2cK
            r2.<init>(r6)
            X.1gQ r1 = X.C110105dW.A0X()
            X.1gQ r0 = X.C110105dW.A0Y(r1)
            java.lang.String r9 = "action"
            java.lang.String r8 = "br-select-otp-verification-method"
            X.C32461gQ.A00(r0, r9, r8)
            r10 = 0
            boolean r8 = X.C110115dX.A1C(r11, r10)
            if (r8 == 0) goto L_0x0194
            java.lang.String r8 = "credential-id"
            X.C32461gQ.A00(r0, r8, r11)
        L_0x0194:
            r16 = 1000(0x3e8, double:4.94E-321)
            r14 = 1
            r18 = 0
            boolean r8 = X.C32271fx.A0D(r13, r14, r16, r18)
            if (r8 == 0) goto L_0x01a5
            java.lang.String r8 = "identifier"
            X.C32461gQ.A00(r0, r8, r13)
        L_0x01a5:
            r13 = r4
            boolean r8 = X.C32271fx.A0D(r13, r14, r16, r18)
            if (r8 == 0) goto L_0x01b1
            java.lang.String r8 = "nonce"
            X.C32461gQ.A00(r0, r8, r4)
        L_0x01b1:
            if (r3 == 0) goto L_0x01b8
            X.1Vv r3 = r3.A00
            r0.A03(r3)
        L_0x01b8:
            X.1Vv r20 = X.C110105dW.A0T(r0, r1, r2)
            android.content.Context r2 = r12.A00
            X.0pt r1 = r12.A01
            X.0wX r0 = r12.A04
            r19 = 9
            com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1 r13 = new com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1
            r14 = r2
            r15 = r0
            r16 = r1
            r17 = r5
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r23 = 30000(0x7530, double:1.4822E-319)
            r22 = 204(0xcc, float:2.86E-43)
            r18 = r7
            r19 = r13
            r21 = r6
            r18.A0A(r19, r20, r21, r22, r23)
            return
        L_0x01df:
            r3 = 0
            goto L_0x0174
        L_0x01e1:
            r0.A01 = r3
            java.lang.String r2 = "credential_id"
            java.lang.String r2 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r2)
            r0.A0P = r2
            java.lang.String r2 = "app_to_app_partner_app_package"
            java.lang.String r5 = X.C13690nt.A0e(r2, r1)
            java.lang.String r2 = "app_to_app_partner_intent_action"
            java.lang.String r4 = X.C13690nt.A0e(r2, r1)
            java.lang.String r2 = "app_to_app_request_payload"
            java.lang.String r6 = X.C13690nt.A0e(r2, r1)
            X.01Q r2 = X.C119095vw.A00(r5, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0ca5
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0ca5
            if (r2 == 0) goto L_0x0ca5
            java.lang.Object r5 = r2.A00
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r2.A01
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r3 = X.C13680ns.A09()
            java.lang.String r1 = "android.intent.extra.TEXT"
            r3.putExtra(r1, r6)
            r3.setPackage(r5)
            r3.setAction(r4)
            java.lang.String r1 = "PAY: BrazilPayBloksActivity appToApp package: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)
            r2.append(r5)
            java.lang.String r1 = " action "
            r2.append(r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r4, r2)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            android.content.ComponentName r1 = r3.resolveActivity(r1)
            if (r1 == 0) goto L_0x0024
            r1 = 100
            r0.startActivityForResult(r3, r1)
            return
        L_0x024e:
            java.lang.String r0 = "get_compliance_status"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 0
            goto L_0x0018
        L_0x0259:
            java.lang.String r0 = "show_account_removal_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 1
            goto L_0x0018
        L_0x0264:
            java.lang.String r0 = "get_merchant_reg_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 2
            goto L_0x0018
        L_0x026f:
            java.lang.String r0 = "get_autofill_address"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 3
            goto L_0x0018
        L_0x027a:
            java.lang.String r0 = "get_filtered_card_verification_options"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 4
            goto L_0x0018
        L_0x0285:
            java.lang.String r0 = "get_payout_banks"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 5
            goto L_0x0018
        L_0x0290:
            java.lang.String r0 = "send_kyc_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 6
            goto L_0x0018
        L_0x029b:
            java.lang.String r0 = "verify_card_otp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 7
            goto L_0x0018
        L_0x02a6:
            java.lang.String r0 = "add_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 8
            goto L_0x0018
        L_0x02b2:
            java.lang.String r0 = "dial_phone_number"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 9
            goto L_0x0018
        L_0x02be:
            java.lang.String r0 = "link_merchant"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 10
            goto L_0x0018
        L_0x02ca:
            java.lang.String r0 = "pre_link_merchant"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 11
            goto L_0x0018
        L_0x02d6:
            java.lang.String r0 = "bind_device"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 12
            goto L_0x0018
        L_0x02e2:
            java.lang.String r0 = "add_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 13
            goto L_0x0018
        L_0x02ee:
            java.lang.String r0 = "open_fbpay_pin_bottom_sheet"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 14
            goto L_0x0018
        L_0x02fa:
            java.lang.String r0 = "show_confirm_cancel_add_card_alert_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 15
            goto L_0x0018
        L_0x0306:
            java.lang.String r0 = "refetch_verification_methods"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 16
            goto L_0x0018
        L_0x0312:
            java.lang.String r0 = "open_setup_payments_warning_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 17
            goto L_0x0018
        L_0x031e:
            java.lang.String r0 = "document_upload_submit_document"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 18
            goto L_0x0018
        L_0x032a:
            java.lang.String r0 = "dismiss_confirm_cancel_add_card_alert_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 19
            goto L_0x0018
        L_0x0336:
            java.lang.String r0 = "reset_pin_from_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 20
            goto L_0x0018
        L_0x0342:
            java.lang.String r0 = "get_card_network"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 21
            goto L_0x0018
        L_0x034e:
            java.lang.String r0 = "send_taxid"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 22
            goto L_0x0018
        L_0x035a:
            java.lang.String r0 = "show_contact_picker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 23
            goto L_0x0018
        L_0x0366:
            java.lang.String r0 = "verify_card_phoenix"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 24
            goto L_0x0018
        L_0x0372:
            java.lang.String r0 = "handle_error_native"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 25
            goto L_0x0018
        L_0x037e:
            java.lang.String r0 = "update_merchant_account"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 26
            goto L_0x0018
        L_0x038a:
            java.lang.String r0 = "set_onboarding_started"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 27
            goto L_0x0018
        L_0x0396:
            java.lang.String r0 = "get_kyc_status"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 28
            goto L_0x0018
        L_0x03a2:
            java.lang.String r0 = "submit_verification_method"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 29
            goto L_0x0018
        L_0x03ae:
            X.5qp r0 = r0.A0E
            java.util.Map r0 = r0.A00
            r3.A01(r6, r0)
            return
        L_0x03b6:
            java.lang.String r2 = "phone_number"
            java.lang.Object r1 = r1.get(r2)
            r2 = r4
            if (r1 == 0) goto L_0x03c3
            java.lang.String r2 = r1.toString()
        L_0x03c3:
            java.lang.String r1 = "[^\\d+]"
            java.lang.String r3 = r2.replaceAll(r1, r4)
            r2 = 0
            java.lang.String r1 = "tel"
            android.net.Uri r3 = android.net.Uri.fromParts(r1, r3, r2)
            java.lang.String r2 = "android.intent.action.DIAL"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r3)
            r0.startActivity(r1)
            return
        L_0x03db:
            X.5um r4 = r0.A0C
            X.61P r1 = new X.61P
            r1.<init>(r3, r0)
            r4.A00(r1, r2)
            return
        L_0x03e6:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x03fa
        L_0x03e9:
            X.5xF r5 = r0.A0N
            X.5um r4 = r5.A0D
            X.61Q r1 = new X.61Q
            r1.<init>(r0, r3, r5, r2)
            r0 = 0
            r4.A00(r1, r0)
            return
        L_0x03f7:
            r1 = 2131886744(0x7f120298, float:1.9408075E38)
        L_0x03fa:
            X.AnonymousClass29T.A01(r0, r1)
            return
        L_0x03fe:
            X.5xF r2 = r0.A0N
            java.lang.String r1 = "payment_home"
            r2.A02(r0, r1)
            return
        L_0x0406:
            r1 = 2131886744(0x7f120298, float:1.9408075E38)
            X.AnonymousClass29T.A00(r0, r1)
            return
        L_0x040d:
            java.lang.Class<com.obwhatsapp.payments.ui.PaymentContactPicker> r1 = com.obwhatsapp.payments.ui.PaymentContactPicker.class
            android.content.Intent r3 = X.C110105dW.A04(r0, r1)
            java.lang.String r1 = "for_payments"
            r3.putExtra(r1, r2)
            r0.startActivity(r3)
            return
        L_0x041c:
            X.0rz r0 = r0.A09
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            X.C13680ns.A0z(r1, r0, r2)
            return
        L_0x0428:
            java.lang.String r11 = "FB"
            X.0pt r7 = r0.A05
            X.0wR r6 = r0.A0U
            X.0wU r5 = r0.A0D
            X.0wX r4 = r0.A0A
            X.5wq r1 = r0.A0K
            X.5tC r8 = new X.5tC
            r12 = r8
            r13 = r0
            r14 = r7
            r15 = r4
            r16 = r5
            r17 = r1
            r18 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.61D r7 = new X.61D
            r7.<init>(r3, r0)
            X.0wU r12 = r8.A03
            r0 = 2
            X.1lL[] r1 = new X.C35081lL[r0]
            java.lang.String r0 = "action"
            java.lang.String r10 = "get-kyc-state"
            X.C110115dX.A14(r0, r10, r1)
            java.lang.String r0 = "provider"
            X.C35081lL.A02(r0, r11, r1, r2)
            java.lang.String r0 = "account"
            X.1Vv r14 = new X.1Vv
            r14.<init>(r0, r1)
            android.content.Context r5 = r8.A00
            X.0pt r9 = r8.A01
            X.0wX r6 = r8.A02
            X.5ht r4 = new X.5ht
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r15 = "get"
            r16 = 0
            r13 = r4
            r12.A0H(r13, r14, r15, r16)
            return
        L_0x0474:
            java.lang.String r5 = "cep"
            java.lang.String r2 = X.C13690nt.A0e(r5, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x0485
            java.lang.String r1 = "on_failure"
            r3.A00(r1)
        L_0x0485:
            java.lang.String r1 = "-"
            java.lang.String r10 = r2.replace(r1, r4)
            X.0pt r4 = r0.A05
            X.0ug r2 = r0.A06
            X.0wX r1 = r0.A0A
            X.5sf r9 = new X.5sf
            r9.<init>(r0, r4, r2, r1)
            X.5rq r8 = new X.5rq
            r8.<init>(r3, r0)
            X.0ug r2 = r9.A02
            java.lang.String r1 = r2.A02()
            X.2BJ r6 = new X.2BJ
            r6.<init>(r1)
            X.1gQ r4 = X.C110105dW.A0X()
            X.1gQ r3 = X.C110105dW.A0Y(r4)
            java.lang.String r7 = "action"
            java.lang.String r0 = "br-get-autofill-address"
            X.C32461gQ.A00(r3, r7, r0)
            r15 = 0
            r11 = 1
            r13 = 9
            boolean r0 = X.C32271fx.A0D(r10, r11, r13, r15)
            if (r0 == 0) goto L_0x04c3
            X.C32461gQ.A00(r3, r5, r10)
        L_0x04c3:
            X.1Vv r0 = X.C110105dW.A0S(r3, r4, r6)
            android.content.Context r5 = r9.A00
            X.0pt r7 = r9.A01
            X.0wX r6 = r9.A03
            r10 = 5
            com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1 r4 = new com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.C110105dW.A1H(r2, r4, r0, r1)
            return
        L_0x04d7:
            java.lang.String r0 = "verify_methods"
            java.lang.String r2 = X.C13690nt.A0e(r0, r1)
            java.lang.String r0 = "keys"
            java.lang.String r1 = X.C13690nt.A0e(r0, r1)
            if (r2 == 0) goto L_0x056c
            if (r1 == 0) goto L_0x056c
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r8 = java.util.Arrays.asList(r0)
            java.io.StringWriter r7 = new java.io.StringWriter
            r7.<init>()
            android.util.JsonWriter r4 = new android.util.JsonWriter
            r4.<init>(r7)
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x056c }
            r0.<init>(r2)     // Catch:{ IOException -> 0x056c }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ IOException -> 0x056c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x056c }
            r4.beginObject()     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "verification_options"
            r4.name(r0)     // Catch:{ all -> 0x0567 }
        L_0x0511:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x0554
            r2.beginArray()     // Catch:{ all -> 0x0567 }
            r4.beginArray()     // Catch:{ all -> 0x0567 }
        L_0x051d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x0550
            r2.beginObject()     // Catch:{ all -> 0x0567 }
            r4.beginObject()     // Catch:{ all -> 0x0567 }
        L_0x0529:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x0549
            java.lang.String r1 = r2.nextName()     // Catch:{ all -> 0x0567 }
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x0545
            android.util.JsonWriter r1 = r4.name(r1)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = r2.nextString()     // Catch:{ all -> 0x0567 }
            r1.value(r0)     // Catch:{ all -> 0x0567 }
            goto L_0x0529
        L_0x0545:
            r2.skipValue()     // Catch:{ all -> 0x0567 }
            goto L_0x0529
        L_0x0549:
            r2.endObject()     // Catch:{ all -> 0x0567 }
            r4.endObject()     // Catch:{ all -> 0x0567 }
            goto L_0x051d
        L_0x0550:
            r4.endArray()     // Catch:{ all -> 0x0567 }
            goto L_0x0511
        L_0x0554:
            r4.endObject()     // Catch:{ all -> 0x0567 }
            r2.close()     // Catch:{ IOException -> 0x056c }
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "payload"
            r5.put(r0, r1)
            r3.A02(r6, r5)
            return
        L_0x0567:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x056b }
        L_0x056b:
            throw r0     // Catch:{ IOException -> 0x056c }
        L_0x056c:
            java.lang.String r0 = "on_failure"
            r3.A00(r0)
            return
        L_0x0572:
            X.5wq r1 = r0.A0K
            java.lang.String r8 = "FB"
            java.lang.String r7 = "KYC"
            X.50C r1 = r1.A02(r8, r7, r2)
            if (r1 == 0) goto L_0x058a
            java.lang.String r2 = r1.A05
            boolean r1 = r2.equalsIgnoreCase(r8)
            if (r1 == 0) goto L_0x058a
            r0.A3C(r3, r2)
            return
        L_0x058a:
            r1 = 2
            com.facebook.redex.IDxKCallbackShape73S0200000_3_I1 r6 = new com.facebook.redex.IDxKCallbackShape73S0200000_3_I1
            r6.<init>(r3, r1, r0)
            X.0pt r5 = r0.A05
            X.0wU r4 = r0.A0D
            X.0wX r3 = r0.A0A
            X.5wq r2 = r0.A0K
            X.5ug r1 = new X.5ug
            r13 = r4
            r14 = r2
            r15 = r7
            r9 = r1
            r10 = r0
            r11 = r5
            r12 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.A00(r6, r8)
            return
        L_0x05a8:
            r2 = 0
            r0.A3E(r3, r1, r2)
            return
        L_0x05ad:
            java.lang.String r5 = "otp"
            java.lang.String r6 = X.C13690nt.A0e(r5, r1)
            X.AnonymousClass00B.A05(r6)
            java.lang.String r5 = " "
            java.lang.String r28 = r6.replace(r5, r4)
            java.lang.String r4 = "card_verify_type"
            r1.get(r4)
            java.lang.String r4 = "credential_id"
            java.lang.String r30 = X.C13690nt.A0e(r4, r1)
            java.lang.String r4 = "card_verify_identifier"
            java.lang.String r31 = X.C13690nt.A0e(r4, r1)
            java.lang.String r4 = "card_verify_otp_resend_interval_sec"
            java.lang.String r1 = X.C13690nt.A0e(r4, r1)
            X.0t3 r5 = r0.A05
            X.0sK r4 = r0.A01
            java.lang.String r29 = X.C110105dW.A0f(r4, r5)
            X.0t3 r4 = r0.A05
            r16 = r4
            X.0pt r4 = r0.A05
            r32 = r4
            X.0sK r15 = r0.A01
            X.160 r14 = r0.A05
            X.0ug r13 = r0.A06
            X.0wS r12 = r0.A0G
            X.5uv r11 = r0.A0F
            X.0wU r10 = r0.A0D
            X.173 r9 = r0.A03
            X.5uW r8 = r0.A0N
            X.5wt r7 = r0.A0A
            X.0wX r6 = r0.A0A
            X.5wq r5 = r0.A0K
            X.5uG r4 = new X.5uG
            r4.<init>(r3, r0, r1)
            X.5i3 r1 = new X.5i3
            r22 = r10
            r23 = r12
            r24 = r5
            r25 = r11
            r26 = r8
            r27 = r4
            r17 = r9
            r18 = r14
            r19 = r13
            r20 = r7
            r21 = r6
            r13 = r0
            r14 = r32
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.String r5 = r1.A06
            X.160 r4 = r1.A04
            X.1cl r0 = r4.A08(r5)
            if (r0 == 0) goto L_0x0640
            X.1tF r0 = r0.A08
            X.5hS r0 = (X.C111815hS) r0
            if (r0 == 0) goto L_0x0640
            java.lang.String r3 = r0.A03
            java.lang.String r0 = "VISA"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0640
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction sendRequestCardVerification with encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A00()
            return
        L_0x0640:
            X.1cl r0 = r4.A08(r5)
            X.1lr r0 = (X.C35391lr) r0
            if (r0 == 0) goto L_0x06d3
            int r3 = r0.A01
            r0 = 5
            if (r3 != r0) goto L_0x06d3
            java.lang.String r0 = "PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5uv r0 = r1.A09
            X.5tD r4 = r0.A00
            r3 = 0
            if (r4 == 0) goto L_0x0663
            java.lang.String r0 = r4.A02
            r4.A02 = r3
            if (r0 == 0) goto L_0x0663
            r1.A02(r3, r0)
            return
        L_0x0663:
            X.0t3 r8 = r1.A03
            android.content.Context r7 = r1.A00
            X.0pt r6 = r1.A01
            X.0sK r5 = r1.A02
            X.0wU r3 = r1.A06
            X.0wX r0 = r1.A05
            X.5t1 r4 = new X.5t1
            r11 = r5
            r12 = r8
            r13 = r0
            r14 = r3
            r8 = r4
            r9 = r7
            r10 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.5qm r10 = new X.5qm
            r10.<init>(r1)
            java.lang.String r8 = "ADD_CARD"
            java.lang.String r9 = "elo"
            X.0t3 r1 = r4.A03
            X.0sK r0 = r4.A02
            r7 = 0
            java.lang.String r6 = X.C110105dW.A0g(r0, r1)
            X.0wU r3 = r4.A05
            r0 = 4
            X.1lL[] r5 = new X.C35081lL[r0]
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-request-new-challenge"
            X.C35081lL.A02(r1, r0, r5, r7)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r9.toUpperCase(r0)
            java.lang.String r0 = "network_type"
            X.C35081lL.A02(r0, r1, r5, r2)
            java.lang.String r0 = "scope"
            X.C35081lL.A01(r0, r8, r5)
            java.lang.String r0 = "nonce"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r0, (java.lang.String) r6)
            r0 = 3
            r5[r0] = r1
            java.lang.String r1 = "account"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r5)
            android.content.Context r7 = r4.A00
            X.0pt r9 = r4.A01
            X.0wX r8 = r4.A04
            r12 = 8
            com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1 r6 = new com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.String r7 = "set"
            r8 = 30000(0x7530, double:1.4822E-319)
            r4 = r3
            r5 = r6
            r6 = r0
            r4.A0H(r5, r6, r7, r8)
            return
        L_0x06d3:
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction sendRequestCardVerification without encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r1.A09
            r1.A03(r0)
            return
        L_0x06de:
            java.lang.String r2 = "credential_id"
            java.lang.String r14 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r14)
            X.0pt r8 = r0.A05
            X.0wR r7 = r0.A0U
            X.0wS r6 = r0.A0G
            X.0wU r5 = r0.A0D
            X.173 r4 = r0.A03
            X.0wX r2 = r0.A0A
            X.5tm r1 = new X.5tm
            r1.<init>(r3)
            X.5tJ r15 = new X.5tJ
            r9 = r2
            r10 = r5
            r11 = r6
            r12 = r1
            r13 = r7
            r5 = r15
            r6 = r0
            r7 = r8
            r8 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction linkMerchant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = r15.A08
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-link-merchant"
            X.C110105dW.A1P(r1, r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x074a
            java.lang.String r0 = "credential-id"
            X.C110105dW.A1P(r0, r3, r2)
            X.0wR r0 = r15.A07
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device-id"
            X.C110105dW.A1P(r0, r1, r2)
            X.0wU r0 = r15.A04
            X.1Vv r2 = X.C110105dW.A0V(r2)
            android.content.Context r12 = r15.A00
            X.0pt r14 = r15.A01
            X.0wX r13 = r15.A03
            r16 = 3
            com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1 r11 = new com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1
            r11.<init>(r12, r13, r14, r15, r16)
            r4 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r3 = "set"
            r1 = r11
            r0.A0H(r1, r2, r3, r4)
            return
        L_0x074a:
            java.lang.String r0 = "Credential id missing"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0751:
            java.lang.String r2 = "verify_type"
            java.lang.String r8 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r8)
            java.lang.String r2 = "verify_id"
            java.lang.String r29 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r29)
            java.lang.String r7 = "BANK"
            boolean r2 = r8.equals(r7)
            r4 = 0
            if (r2 == 0) goto L_0x07fe
            java.lang.String r2 = "bank_code"
            java.lang.String r30 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r30)
            java.lang.String r2 = "branch_name"
            java.lang.String r31 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r31)
            java.lang.String r2 = "bank_account_type"
            java.lang.String r32 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r32)
            java.lang.String r2 = "bank_account_number"
            java.lang.String r33 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r33)
            r34 = r4
        L_0x0792:
            X.0t3 r15 = r0.A05
            X.0pt r14 = r0.A05
            X.0sK r13 = r0.A01
            X.0sq r12 = r0.A05
            X.5rC r11 = r0.A0V
            X.0wR r10 = r0.A0U
            X.0wT r9 = r0.A0C
            X.0y5 r6 = r0.A0W
            X.0wU r5 = r0.A0D
            X.0wP r4 = r0.A07
            X.0wX r2 = r0.A0A
            X.5tn r1 = new X.5tn
            r1.<init>(r3)
            X.5hz r3 = new X.5hz
            r24 = r10
            r25 = r11
            r26 = r6
            r27 = r12
            r28 = r8
            r18 = r4
            r19 = r15
            r20 = r2
            r21 = r9
            r22 = r5
            r23 = r1
            r15 = r0
            r16 = r14
            r17 = r13
            r14 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction preLinkMerchant: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r4 = r3.A0F
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r2 = r4.hashCode()
            r1 = -1136784465(0xffffffffbc3e0baf, float:-0.011599465)
            if (r2 == r1) goto L_0x0825
            r0 = 2031164(0x1efe3c, float:2.846267E-39)
            if (r2 == r0) goto L_0x07f2
            r0 = 399611855(0x17d197cf, float:1.354463E-24)
            if (r2 != r0) goto L_0x0825
            java.lang.String r7 = "PREPAID"
        L_0x07f2:
            boolean r0 = r4.equals(r7)
            if (r0 == 0) goto L_0x0825
            X.0sq r0 = r3.A08
            X.C13700nu.A0W(r3, r0)
            return
        L_0x07fe:
            java.lang.String r2 = "PREPAID"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0819
            java.lang.String r2 = "serial_number"
            java.lang.String r34 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r34)
            r30 = r4
            r31 = r4
            r32 = r4
            r33 = r4
            goto L_0x0792
        L_0x0819:
            r30 = r4
            r31 = r4
            r32 = r4
            r33 = r4
            r34 = r4
            goto L_0x0792
        L_0x0825:
            java.lang.String r0 = "Invalid Verify Type: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0834:
            java.lang.String r2 = "credential_id"
            java.lang.String r2 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r2)
            X.0wS r1 = r0.A0G
            X.160 r1 = X.C110115dX.A0H(r1)
            X.1cl r14 = r1.A08(r2)
            X.AnonymousClass00B.A06(r14)
            X.1lr r14 = (X.C35391lr) r14
            X.0t3 r13 = r0.A05
            X.0pt r12 = r0.A05
            X.0sK r11 = r0.A01
            X.0ug r10 = r0.A06
            X.0wS r9 = r0.A0G
            X.0wU r8 = r0.A0D
            X.5uW r7 = r0.A0N
            X.173 r6 = r0.A03
            X.5wt r5 = r0.A0A
            X.0wP r4 = r0.A07
            X.0wX r2 = r0.A0A
            r15 = 1
            com.facebook.redex.IDxBCallbackShape113S0200000_3_I1 r1 = new com.facebook.redex.IDxBCallbackShape113S0200000_3_I1
            r1.<init>(r3, r0, r15)
            X.5vI r15 = new X.5vI
            r25 = r8
            r26 = r9
            r27 = r1
            r28 = r7
            r19 = r4
            r20 = r13
            r21 = r6
            r22 = r10
            r23 = r5
            r24 = r2
            r16 = r0
            r17 = r12
            r18 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r15.A00(r14)
            return
        L_0x088b:
            java.lang.String r2 = "credential_push_data"
            java.lang.String r25 = X.C13690nt.A0e(r2, r1)
            java.lang.String r2 = "credential_card_network"
            java.lang.String r26 = X.C13690nt.A0e(r2, r1)
            X.0sK r1 = r0.A01
            java.lang.String r2 = r1.A06()
            X.AnonymousClass00B.A06(r2)
            X.1Mf r1 = X.C26071Mf.A00()
            java.lang.String r2 = X.C24561Gk.A00(r1, r2)
            java.lang.String r1 = "[^\\d]"
            java.lang.String r27 = r2.replaceAll(r1, r4)
            X.0pd r2 = r0.A0C
            r1 = 1482(0x5ca, float:2.077E-42)
            boolean r1 = r2.A0C(r1)
            if (r1 == 0) goto L_0x0923
            X.5vg r1 = r0.A0L
            X.175 r2 = r1.A02
            java.lang.String r1 = "add_card"
            boolean r1 = r2.A0G(r1)
            r1 = r1 ^ 1
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r1)
        L_0x08c8:
            X.0t3 r11 = r0.A05
            X.0pt r10 = r0.A05
            X.0sK r9 = r0.A01
            X.0ug r8 = r0.A06
            X.0wS r7 = r0.A0G
            X.5vX r6 = r0.A0J
            X.0wU r5 = r0.A0D
            X.173 r4 = r0.A03
            X.0wX r2 = r0.A0A
            X.5wq r1 = r0.A0K
            X.5ur r12 = new X.5ur
            r22 = r1
            r23 = r6
            r16 = r11
            r17 = r4
            r18 = r8
            r19 = r2
            r20 = r5
            r21 = r7
            r13 = r0
            r14 = r10
            r15 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0wR r1 = r0.A0U
            java.lang.String r28 = r1.A01()
            X.5rr r5 = new X.5rr
            r5.<init>(r3, r0)
            X.5wq r4 = r12.A09
            java.lang.String r3 = "FB"
            java.lang.String r2 = "KYC"
            X.50C r1 = X.C110115dX.A0R(r4, r3, r2)
            if (r1 == 0) goto L_0x0926
            java.lang.String r0 = r1.A05
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0926
            r0 = r12
            r2 = r5
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r0.A00(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0923:
            r24 = 0
            goto L_0x08c8
        L_0x0926:
            X.61L r1 = new X.61L
            r22 = r12
            r23 = r5
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            android.content.Context r6 = r12.A00
            X.0pt r7 = r12.A01
            X.0wU r0 = r12.A07
            X.0wX r8 = r12.A06
            X.5ug r5 = new X.5ug
            r9 = r0
            r10 = r4
            r11 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r5.A00(r1, r3)
            return
        L_0x0945:
            java.lang.String r2 = "credential_id"
            java.lang.String r12 = X.C13690nt.A0e(r2, r1)
            X.0t3 r14 = r0.A05
            X.0pt r13 = r0.A05
            X.0sK r11 = r0.A01
            X.0ug r10 = r0.A06
            X.0wR r9 = r0.A0U
            X.0wS r8 = r0.A0G
            X.0wU r7 = r0.A0D
            X.5uW r6 = r0.A0N
            X.173 r5 = r0.A03
            X.5wt r4 = r0.A0A
            X.0wP r2 = r0.A07
            X.0wX r1 = r0.A0A
            X.5ut r15 = new X.5ut
            r25 = r7
            r26 = r8
            r27 = r6
            r28 = r9
            r29 = r12
            r19 = r2
            r20 = r14
            r21 = r5
            r22 = r10
            r23 = r4
            r24 = r1
            r16 = r0
            r17 = r13
            r18 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2 = 1
            com.facebook.redex.IDxMCallbackShape6S1200000_3_I1 r1 = new com.facebook.redex.IDxMCallbackShape6S1200000_3_I1
            r1.<init>(r3, r12, r0, r2)
            r15.A00(r1)
            return
        L_0x098e:
            java.lang.String r4 = "on_failure"
            java.lang.String r2 = "document_type"
            java.lang.String r9 = X.C111335g1.A02(r2, r1)
            java.lang.String r2 = "doc_file_name_list"
            java.lang.String r1 = X.C111335g1.A02(r2, r1)
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            org.json.JSONObject r7 = X.C13700nu.A0K(r1)     // Catch:{ JSONException -> 0x09f6 }
            X.5th r2 = r0.A02     // Catch:{ JSONException -> 0x09f6 }
            java.lang.String r1 = "front"
            java.lang.String r1 = r7.getString(r1)     // Catch:{ JSONException -> 0x09f6 }
            java.io.File r5 = r2.A00(r1)     // Catch:{ JSONException -> 0x09f6 }
            X.5th r2 = r0.A02     // Catch:{ JSONException -> 0x09f6 }
            java.lang.String r1 = "back"
            java.lang.String r1 = r7.getString(r1)     // Catch:{ JSONException -> 0x09f6 }
            java.io.File r2 = r2.A00(r1)     // Catch:{ JSONException -> 0x09f6 }
            if (r5 == 0) goto L_0x09ed
            if (r2 == 0) goto L_0x09ed
            boolean r1 = r5.exists()     // Catch:{ JSONException -> 0x09f6 }
            if (r1 == 0) goto L_0x09ed
            boolean r1 = r2.exists()     // Catch:{ JSONException -> 0x09f6 }
            if (r1 == 0) goto L_0x09ed
            r6.add(r5)     // Catch:{ JSONException -> 0x09f6 }
            r6.add(r2)     // Catch:{ JSONException -> 0x09f6 }
            int r1 = r6.size()
            if (r1 != 0) goto L_0x09e1
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload no file to upload"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3.A00(r4)
            return
        L_0x09e1:
            r12 = 0
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()
            r7 = r0
            r8 = r3
            r10 = r6
            r7.A3D(r8, r9, r10, r11, r12)
            return
        L_0x09ed:
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x09f6 }
            r3.A00(r4)     // Catch:{ JSONException -> 0x09f6 }
            return
        L_0x09f6:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload threw exception "
            com.whatsapp.util.Log.e(r0, r1)
            r3.A00(r4)
            return
        L_0x0a00:
            java.lang.String r2 = "credential_id"
            java.lang.String r12 = X.C111335g1.A02(r2, r1)
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "card_num"
            java.lang.String r5 = X.C111335g1.A02(r2, r1)
            java.lang.String r2 = "\\s"
            java.lang.String r4 = r5.replace(r2, r4)
            java.lang.String r2 = "creditCardNumber"
            X.C13680ns.A1W(r2, r4, r11)
            X.0t3 r15 = r0.A05
            X.0pt r13 = r0.A05
            X.0sK r10 = r0.A01
            X.5uZ r9 = r0.A0H
            X.0wR r8 = r0.A0U
            X.5vc r7 = r0.A0Q
            X.0wU r6 = r0.A0D
            X.0wP r5 = r0.A07
            X.0wX r4 = r0.A0A
            X.5wq r2 = r0.A0K
            java.lang.String r14 = "pin"
            java.lang.String r27 = X.C13690nt.A0e(r14, r1)
            java.lang.String r14 = "provider"
            java.lang.String r28 = X.C13690nt.A0e(r14, r1)
            X.5uu r14 = new X.5uu
            r24 = r7
            r25 = r8
            r26 = r12
            r29 = r11
            r18 = r5
            r19 = r15
            r20 = r4
            r21 = r6
            r22 = r9
            r23 = r2
            r15 = r0
            r16 = r13
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.5uH r4 = new X.5uH
            r4.<init>(r3, r0, r12)
            java.lang.String r5 = r14.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0a8a
            java.lang.String r3 = r14.A0D
            X.AnonymousClass00B.A06(r3)
            X.5wq r1 = r14.A07
            java.lang.String r0 = "PIN"
            r2 = 1
            X.50C r1 = r1.A02(r3, r0, r2)
            if (r1 != 0) goto L_0x0a81
            X.5ug r1 = r14.A06
            com.facebook.redex.IDxKCallbackShape73S0200000_3_I1 r0 = new com.facebook.redex.IDxKCallbackShape73S0200000_3_I1
            r0.<init>(r4, r2, r14)
            r1.A00(r0, r3)
            return
        L_0x0a81:
            X.5tl r0 = new X.5tl
            r0.<init>(r1)
            r14.A00(r0, r4, r5)
            return
        L_0x0a8a:
            X.5uZ r1 = r14.A05
            java.util.List r9 = r14.A0E
            r0 = 1
            com.facebook.redex.IDxTCallbackShape112S0200000_3_I1 r6 = new com.facebook.redex.IDxTCallbackShape112S0200000_3_I1
            r6.<init>(r4, r0, r14)
            X.0sq r0 = r1.A05
            X.5rC r7 = r1.A03
            X.0wT r3 = r1.A01
            X.0y5 r8 = r1.A04
            X.0wU r4 = r1.A02
            X.0wP r2 = r1.A00
            r10 = -1
            r5 = 0
            X.5hx r1 = new X.5hx
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.C13680ns.A1U(r1, r0)
            return
        L_0x0aab:
            java.lang.String r5 = "card_number"
            java.lang.String r5 = X.C13690nt.A0e(r5, r1)
            java.lang.String r1 = "\\s"
            java.lang.String r5 = r5.replaceAll(r1, r4)
            java.util.HashMap r10 = X.AnonymousClass000.A0x()
            int r4 = r5.length()
            r7 = 0
            r1 = 6
            if (r4 >= r1) goto L_0x0ace
            java.lang.String r1 = "unknown"
            java.lang.String r0 = "network_name"
            r10.put(r0, r1)
        L_0x0aca:
            r3.A01(r6, r10)
            return
        L_0x0ace:
            java.lang.String r20 = r5.substring(r7, r1)
            X.5uv r4 = r0.A0F
            boolean r1 = r4.A03
            if (r1 != 0) goto L_0x0aca
            r4.A03 = r2
            X.0t3 r9 = r0.A05
            X.0pt r8 = r0.A05
            X.0sK r6 = r0.A01
            X.0ug r5 = r0.A06
            X.5uW r4 = r0.A0N
            X.0wX r2 = r0.A0A
            X.5wq r1 = r0.A0K
            X.5tH r11 = new X.5tH
            r12 = r0
            r13 = r8
            r14 = r6
            r15 = r9
            r16 = r5
            r17 = r2
            r18 = r1
            r19 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.5uE r4 = new X.5uE
            r4.<init>(r3, r0, r10)
            X.5uW r1 = r11.A07
            r0 = 5
            java.lang.String r9 = r1.A00(r0)
            X.0t3 r1 = r11.A03
            X.0sK r0 = r11.A02
            java.lang.String r8 = X.C110105dW.A0g(r0, r1)
            X.0ug r3 = r11.A04
            java.lang.String r2 = r3.A02()
            java.lang.String r12 = r11.A08
            java.lang.String r0 = "elo"
            X.1gQ r6 = X.AnonymousClass3K4.A0S(r0)
            r0 = 1
            boolean r5 = X.C110105dW.A1V(r9, r0, r7)
            if (r5 == 0) goto L_0x0b28
            java.lang.String r5 = "network_device_id"
            X.C32461gQ.A00(r6, r5, r9)
        L_0x0b28:
            boolean r0 = X.C110105dW.A1W(r8, r0, r7)
            if (r0 == 0) goto L_0x0b33
            java.lang.String r0 = "nonce"
            X.C32461gQ.A00(r6, r0, r8)
        L_0x0b33:
            X.1Vv r7 = r6.A01()
            X.2BJ r6 = new X.2BJ
            r6.<init>(r2)
            X.1gQ r5 = X.C110105dW.A0X()
            X.1gQ r1 = X.C110105dW.A0Y(r5)
            java.lang.String r8 = "action"
            java.lang.String r0 = "br-fetch-network-info"
            X.C32461gQ.A00(r1, r8, r0)
            r13 = 6
            r15 = 6
            r17 = 0
            boolean r0 = X.C32271fx.A0D(r12, r13, r15, r17)
            if (r0 == 0) goto L_0x0b5c
            java.lang.String r0 = "bin"
            X.C32461gQ.A00(r1, r0, r12)
        L_0x0b5c:
            r1.A03(r7)
            X.1Vv r13 = X.C110105dW.A0S(r1, r5, r6)
            android.content.Context r5 = r11.A00
            X.0pt r1 = r11.A01
            X.0wX r0 = r11.A05
            r12 = 4
            com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1 r6 = new com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1
            r7 = r5
            r8 = r0
            r9 = r1
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r15 = 204(0xcc, float:2.86E-43)
            r16 = 30000(0x7530, double:1.4822E-319)
            r11 = r3
            r12 = r6
            r14 = r2
            r11.A0A(r12, r13, r14, r15, r16)
            return
        L_0x0b7e:
            java.lang.String r2 = "tax_id"
            java.lang.String r2 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r2)
            java.lang.String r1 = "[^\\d]"
            java.lang.String r12 = r2.replaceAll(r1, r4)
            X.0pt r7 = r0.A05
            X.0so r6 = r0.A03
            X.0ug r5 = r0.A06
            X.0wR r4 = r0.A0U
            X.0wX r2 = r0.A0A
            X.5qq r1 = new X.5qq
            r1.<init>(r3)
            X.5tF r13 = new X.5tF
            r8 = r5
            r9 = r2
            r10 = r1
            r11 = r4
            r4 = r13
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.0ug r3 = r13.A03
            java.lang.String r2 = r3.A02()
            X.0wR r0 = r13.A06
            java.lang.String r4 = r0.A01()
            java.lang.String r1 = r13.A07
            X.2BJ r0 = new X.2BJ
            r0.<init>(r2)
            X.5rL r14 = new X.5rL
            r14.<init>(r0, r4, r1)
            java.util.HashMap r15 = X.AnonymousClass000.A0x()
            X.1Vv r0 = r14.A00
            android.content.Context r10 = r13.A00
            X.0pt r12 = r13.A02
            X.0wX r11 = r13.A04
            r16 = 0
            com.obwhatsapp.payments.IDxRCallbackShape8S0300000_3_I1 r9 = new com.obwhatsapp.payments.IDxRCallbackShape8S0300000_3_I1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r10 = 204(0xcc, float:2.86E-43)
            r11 = 30000(0x7530, double:1.4822E-319)
            r7 = r9
            r6 = r3
            r8 = r0
            r9 = r2
            r6.A0A(r7, r8, r9, r10, r11)
            return
        L_0x0bde:
            java.lang.String r2 = "credential_id"
            java.lang.String r6 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r6)
            X.5uJ r2 = r0.A0O
            X.61s r4 = new X.61s
            r4.<init>(r3, r0)
            X.62R r5 = new X.62R
            r5.<init>(r3, r0)
            java.lang.String r7 = "add_card"
            r3 = 0
            X.1WD r3 = r2.A00(r3, r4, r5, r6, r7)
            r2 = 0
            com.facebook.redex.IDxNConsumerShape8S1100000_3_I1 r1 = new com.facebook.redex.IDxNConsumerShape8S1100000_3_I1
            r1.<init>(r2, r6, r0)
            r3.A00(r1)
            return
        L_0x0c04:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = X.C13690nt.A0e(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0c1b
            int r4 = java.lang.Integer.parseInt(r2)
            boolean r1 = r0.AHK(r4)
            if (r1 == 0) goto L_0x0c1c
            return
        L_0x0c1b:
            r4 = -1
        L_0x0c1c:
            X.60g r3 = r0.A09
            X.0pd r2 = r0.A0C
            r8 = 2131890225(0x7f121031, float:1.9415136E38)
            X.61t r1 = r0.A07
            r7 = r4
            r4 = r0
            r5 = r2
            r6 = r1
            X.02l r0 = r3.A01(r4, r5, r6, r7, r8)
            r0.show()
            return
        L_0x0c31:
            java.lang.String r2 = "bank_account_number"
            java.lang.String r28 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r28)
            java.lang.String r2 = "bank_code"
            java.lang.String r29 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r29)
            java.lang.String r2 = "bank_branch_number"
            java.lang.String r30 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r30)
            java.lang.String r2 = "bank_account_type"
            java.lang.String r14 = X.C13690nt.A0e(r2, r1)
            X.AnonymousClass00B.A05(r14)
            X.0t3 r2 = r0.A05
            X.0sK r1 = r0.A01
            java.lang.String r31 = X.C110105dW.A0f(r1, r2)
            X.0pt r13 = r0.A05
            X.0sq r12 = r0.A05
            X.5rC r11 = r0.A0V
            X.0wR r10 = r0.A0U
            X.0wS r9 = r0.A0G
            X.0wT r8 = r0.A0C
            X.0y5 r7 = r0.A0W
            X.0wU r6 = r0.A0D
            X.173 r5 = r0.A03
            X.0wP r4 = r0.A07
            X.0wX r2 = r0.A0A
            int r32 = java.lang.Integer.parseInt(r14)
            X.5to r1 = new X.5to
            r1.<init>(r3)
            X.5hy r14 = new X.5hy
            r24 = r10
            r25 = r11
            r26 = r7
            r27 = r12
            r18 = r5
            r19 = r2
            r20 = r8
            r21 = r6
            r22 = r9
            r23 = r1
            r15 = r0
            r16 = r13
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.String r0 = "PAY: BrazilUpdateMerchantAccountAction updateMerchant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sq r0 = r14.A09
            X.C13680ns.A1U(r14, r0)
            return
        L_0x0ca5:
            java.util.HashMap r1 = X.AnonymousClass000.A0x()
            java.lang.String r0 = "on_failure"
            r3.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.BrazilPayBloksActivity.AaT(X.1Z7, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x023a, code lost:
        return "1";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String AaW(java.lang.String r10, java.util.Map r11) {
        /*
            r9 = this;
            java.lang.String r4 = "case"
            java.lang.Object r3 = r11.remove(r4)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x023c
            r8 = -1
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -1618032200: goto L_0x01bd;
                case -1539179277: goto L_0x01b2;
                case -1333887770: goto L_0x01a7;
                case -1067148390: goto L_0x019c;
                case -450144912: goto L_0x0191;
                case 96330030: goto L_0x0186;
                case 493597816: goto L_0x017b;
                case 1867705314: goto L_0x0170;
                case 2027790727: goto L_0x0164;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.String r7 = "1"
            java.lang.String r5 = "0"
            r6 = 0
            switch(r8) {
                case 0: goto L_0x01cd;
                case 1: goto L_0x0213;
                case 2: goto L_0x01c8;
                case 3: goto L_0x020b;
                case 4: goto L_0x0201;
                case 5: goto L_0x0067;
                case 6: goto L_0x0229;
                case 7: goto L_0x0222;
                case 8: goto L_0x0029;
                default: goto L_0x0021;
            }
        L_0x0021:
            r11.put(r4, r3)
            java.lang.String r6 = super.AaW(r10, r11)
        L_0x0028:
            return r6
        L_0x0029:
            java.lang.String r0 = "credential_id"
            java.lang.String r2 = X.C13690nt.A0e(r0, r11)
            java.lang.String r0 = "payment_method_field_name"
            java.lang.String r3 = X.C13690nt.A0e(r0, r11)
            X.1cl r1 = r9.A04
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = r1.A0A
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0049
        L_0x0041:
            X.160 r0 = r9.A05
            X.1cl r1 = r0.A08(r2)
            r9.A04 = r1
        L_0x0049:
            X.1tF r2 = r1.A08
            X.1tE r2 = (X.C39891tE) r2
            java.lang.String r0 = "p2p_receive"
            boolean r0 = r3.equals(r0)
            java.lang.String r1 = "DISABLED"
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "p2p_send"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r2.A0N
        L_0x0061:
            if (r0 == 0) goto L_0x023b
            return r0
        L_0x0064:
            java.lang.String r0 = r2.A0M
            goto L_0x0061
        L_0x0067:
            X.5qp r0 = r9.A0E
            java.util.Map r0 = r0.A00
            r0.putAll(r11)
            java.util.Iterator r5 = X.AnonymousClass000.A0y(r11)
        L_0x0072:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0028
            java.util.Map$Entry r4 = X.AnonymousClass000.A0z(r5)
            java.lang.String r1 = X.C13690nt.A0f(r4)
            r3 = -1
            int r0 = r1.hashCode()
            switch(r0) {
                case -1823090409: goto L_0x00a9;
                case -1787697648: goto L_0x00b3;
                case -1422091778: goto L_0x00bd;
                case -1057402635: goto L_0x00c7;
                case -554367363: goto L_0x00d1;
                case -97971314: goto L_0x00db;
                case -13138338: goto L_0x00e5;
                case 17961485: goto L_0x00ef;
                case 17962411: goto L_0x00f9;
                case 82874128: goto L_0x0104;
                case 180337583: goto L_0x0110;
                case 552892207: goto L_0x011c;
                case 629885866: goto L_0x0128;
                case 672839619: goto L_0x0134;
                case 1287484568: goto L_0x0140;
                case 1595342407: goto L_0x014c;
                case 2069092435: goto L_0x0158;
                default: goto L_0x0088;
            }
        L_0x0088:
            java.lang.String r1 = "[^\\d]"
            switch(r3) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0098;
                case 2: goto L_0x0098;
                case 3: goto L_0x0098;
                case 4: goto L_0x0098;
                case 5: goto L_0x008e;
                case 6: goto L_0x0098;
                case 7: goto L_0x008e;
                case 8: goto L_0x009c;
                case 9: goto L_0x0098;
                case 10: goto L_0x0098;
                case 11: goto L_0x0098;
                case 12: goto L_0x0098;
                case 13: goto L_0x0098;
                case 14: goto L_0x0098;
                case 15: goto L_0x0098;
                case 16: goto L_0x0098;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0072
        L_0x008e:
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r0.replaceAll(r1, r2)
            goto L_0x0072
        L_0x0098:
            r4.getValue()
            goto L_0x0072
        L_0x009c:
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass00B.A05(r0)
            X.C119055vq.A01(r0)
            goto L_0x0072
        L_0x00a9:
            java.lang.String r0 = "business_address_postcode"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 0
            goto L_0x0088
        L_0x00b3:
            java.lang.String r0 = "bank_code"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 1
            goto L_0x0088
        L_0x00bd:
            java.lang.String r0 = "bank_account_number"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 2
            goto L_0x0088
        L_0x00c7:
            java.lang.String r0 = "business_address_city"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 3
            goto L_0x0088
        L_0x00d1:
            java.lang.String r0 = "business_address_street_name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 4
            goto L_0x0088
        L_0x00db:
            java.lang.String r0 = "business_tax_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 5
            goto L_0x0088
        L_0x00e5:
            java.lang.String r0 = "business_address_street_extra"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 6
            goto L_0x0088
        L_0x00ef:
            java.lang.String r0 = "owner_cpf"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 7
            goto L_0x0088
        L_0x00f9:
            java.lang.String r0 = "owner_dob"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 8
            goto L_0x0088
        L_0x0104:
            java.lang.String r0 = "owner_email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 9
            goto L_0x0088
        L_0x0110:
            java.lang.String r0 = "owner_full_name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 10
            goto L_0x0088
        L_0x011c:
            java.lang.String r0 = "bank_account_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 11
            goto L_0x0088
        L_0x0128:
            java.lang.String r0 = "business_name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 12
            goto L_0x0088
        L_0x0134:
            java.lang.String r0 = "bank_branch_number"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 13
            goto L_0x0088
        L_0x0140:
            java.lang.String r0 = "business_address_neighborhood"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 14
            goto L_0x0088
        L_0x014c:
            java.lang.String r0 = "business_address_state"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 15
            goto L_0x0088
        L_0x0158:
            java.lang.String r0 = "business_address_number"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0088
            r3 = 16
            goto L_0x0088
        L_0x0164:
            java.lang.String r0 = "get_card_method_field_data"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 8
            goto L_0x0019
        L_0x0170:
            java.lang.String r0 = "is_smb_build"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 7
            goto L_0x0019
        L_0x017b:
            java.lang.String r0 = "is_purchase_enabled"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 6
            goto L_0x0019
        L_0x0186:
            java.lang.String r0 = "store_merchant_reg_data"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 5
            goto L_0x0019
        L_0x0191:
            java.lang.String r0 = "open_fb_pay_hub"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 4
            goto L_0x0019
        L_0x019c:
            java.lang.String r0 = "clear_merchant_reg_data"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 3
            goto L_0x0019
        L_0x01a7:
            java.lang.String r0 = "get_formatted_phone_number"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 2
            goto L_0x0019
        L_0x01b2:
            java.lang.String r0 = "smb_business_name"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 1
            goto L_0x0019
        L_0x01bd:
            java.lang.String r0 = "get_consumer_next_screen"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0019
            r8 = 0
            goto L_0x0019
        L_0x01c8:
            java.lang.String r6 = X.C115295pW.A00(r10)
            return r6
        L_0x01cd:
            X.5vg r0 = r9.A0L
            java.lang.String r1 = r0.A02(r1)
            if (r1 != 0) goto L_0x01d6
            return r2
        L_0x01d6:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1412891550: goto L_0x01e0;
                case 823631114: goto L_0x01eb;
                case 1027588136: goto L_0x01f6;
                default: goto L_0x01dd;
            }
        L_0x01dd:
            java.lang.String r6 = "p_add_card"
            return r6
        L_0x01e0:
            java.lang.String r0 = "brpay_p_tos"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01dd
            java.lang.String r6 = "p_tos"
            return r6
        L_0x01eb:
            java.lang.String r0 = "brpay_p_pin_nux_create"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01dd
            java.lang.String r6 = "p_pin_nux_create"
            return r6
        L_0x01f6:
            java.lang.String r0 = "brpay_p_compliance_kyc_next_screen_router"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01dd
            java.lang.String r6 = "p_compliance_kyc"
            return r6
        L_0x0201:
            java.lang.Class<com.obwhatsapp.payments.ui.BrazilFbPayHubActivity> r0 = com.obwhatsapp.payments.ui.BrazilFbPayHubActivity.class
            android.content.Intent r0 = X.C110105dW.A04(r9, r0)
            r9.startActivity(r0)
            return r6
        L_0x020b:
            X.5qp r0 = r9.A0E
            java.util.Map r0 = r0.A00
            r0.clear()
            return r6
        L_0x0213:
            X.0w8 r0 = r9.A0B
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x023c
            X.0sK r0 = r9.A01
            java.lang.String r2 = r0.A07()
            return r2
        L_0x0222:
            X.0w8 r0 = r9.A0B
            boolean r0 = r0.A05()
            goto L_0x0237
        L_0x0229:
            X.0w8 r0 = r9.A0B
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x023a
            X.0w8 r0 = r9.A0B
            boolean r0 = r0.A06()
        L_0x0237:
            if (r0 != 0) goto L_0x023a
            return r5
        L_0x023a:
            return r7
        L_0x023b:
            return r1
        L_0x023c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.BrazilPayBloksActivity.AaW(java.lang.String, java.util.Map):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d9, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00db, code lost:
        r1 = r14.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r32, int r33, android.content.Intent r34) {
        /*
            r31 = this;
            r14 = r31
            r1 = r32
            r2 = r33
            r5 = r34
            super.onActivityResult(r1, r2, r5)
            r0 = 100
            if (r1 != r0) goto L_0x0036
            X.1Z7 r1 = r14.A01
            if (r1 == 0) goto L_0x0036
            r6 = -232(0xffffffffffffff18, float:NaN)
            r0 = -1
            r4 = 0
            if (r2 != r0) goto L_0x00dd
            java.lang.String r3 = "on_success"
            if (r34 == 0) goto L_0x00ee
            android.os.Bundle r2 = r5.getExtras()
            java.lang.String r0 = "STEP_UP_RESPONSE"
            java.lang.String r1 = r2.getString(r0, r4)
            if (r1 != 0) goto L_0x0037
            java.lang.String r0 = "issuerMobileAppAuthResponse"
            java.lang.String r1 = r2.getString(r0, r4)
            if (r1 != 0) goto L_0x0037
            java.lang.String r0 = "PAY: BrazilPayBloksActivity onActivityResult - response is NULL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1086574198: goto L_0x0045;
                case 568196142: goto L_0x00d3;
                case 1185244855: goto L_0x0049;
                default: goto L_0x0044;
            }
        L_0x0044:
            return
        L_0x0045:
            java.lang.String r0 = "failure"
            goto L_0x00d5
        L_0x0049:
            java.lang.String r0 = "approved"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r1 = "STEP_UP_AUTH_CODE"
            boolean r0 = r5.hasExtra(r1)
            if (r0 != 0) goto L_0x005b
            java.lang.String r1 = "TAV"
        L_0x005b:
            java.lang.String r13 = r5.getStringExtra(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00ec
            X.0t3 r1 = r14.A05
            X.0sK r0 = r14.A01
            java.lang.String r29 = X.C110105dW.A0f(r0, r1)
            X.0t3 r0 = r14.A05
            r16 = r0
            X.0pt r15 = r14.A05
            X.0sK r12 = r14.A01
            X.160 r11 = r14.A05
            X.0ug r10 = r14.A06
            X.0wS r9 = r14.A0G
            X.5uv r8 = r14.A0F
            X.0wU r7 = r14.A0D
            X.173 r6 = r14.A03
            X.5wt r5 = r14.A0A
            X.0wX r4 = r14.A0A
            X.5wq r3 = r14.A0K
            java.lang.String r2 = r14.A0P
            X.5u3 r1 = new X.5u3
            r1.<init>(r14, r13)
            X.5i2 r0 = new X.5i2
            r24 = r9
            r25 = r3
            r26 = r8
            r27 = r1
            r28 = r13
            r30 = r2
            r23 = r7
            r22 = r4
            r21 = r5
            r20 = r10
            r19 = r11
            r18 = r6
            r17 = r16
            r16 = r12
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r2 = r0.A06
            X.160 r1 = r0.A04
            X.1cl r1 = r1.A08(r2)
            if (r1 == 0) goto L_0x00e1
            X.1tF r1 = r1.A08
            X.5hS r1 = (X.C111815hS) r1
            if (r1 == 0) goto L_0x00e1
            java.lang.String r2 = r1.A03
            java.lang.String r1 = "VISA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e1
            java.lang.String r1 = "PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification with encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r0.A00()
            return
        L_0x00d3:
            java.lang.String r0 = "declined"
        L_0x00d5:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
            X.1Z7 r1 = r14.A01
        L_0x00dd:
            X.C112855jo.A09(r1, r4, r6)
            return
        L_0x00e1:
            java.lang.String r1 = "PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification without encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = r0.A05
            r0.A03(r1)
            return
        L_0x00ec:
            X.1Z7 r1 = r14.A01
        L_0x00ee:
            r1.A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.BrazilPayBloksActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.bloks_background_layout).setBackgroundResource(R.drawable.round_rectangle);
        if (getIntent().getIntExtra("extra_setup_mode", 0) != 0) {
            getIntent().putExtra("screen_name", this.A0L.A02(true));
        }
        String stringExtra = getIntent().getStringExtra("screen_name");
        AnonymousClass00B.A05(stringExtra);
        if ("brpay_p_tos".equalsIgnoreCase(stringExtra) || "brpay_p_compliance_kyc_next_screen_router".equalsIgnoreCase(stringExtra)) {
            C88624ap r6 = this.A0G.A00;
            Intent intent = getIntent();
            if (intent == null || !intent.hasExtra("perf_origin")) {
                r6.A01.A0D("unknown", -1);
            } else {
                long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
                String stringExtra2 = intent.getStringExtra("perf_origin");
                if (stringExtra2 != null) {
                    r6.A01.A0D(stringExtra2, longExtra);
                }
            }
        }
        this.A00.A00 = this.A0K.A04;
        if (!this.A00.A0E() || !this.A00.A0F()) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.bloks_progress_bar);
            progressBar.setVisibility(0);
            this.A00.A0C(new AnonymousClass60F(progressBar, this), "on_demand", false);
        } else {
            this.A0Y = true;
        }
        Toolbar A092 = C110105dW.A09(this);
        if (A092 != null) {
            A092.setLogo((Drawable) null);
            A092.setTitle((CharSequence) null);
        }
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 == R.string.str0298) {
            C32241fu A002 = C32241fu.A00(this);
            A002.A02(R.string.str0298);
            A002.A01(R.string.str0295);
            C110105dW.A0w(A002, this, 7, R.string.str0297);
            A002.setNegativeButton(R.string.str0296, (DialogInterface.OnClickListener) null);
            return A002.create();
        }
        Dialog A012 = this.A0M.A01((Bundle) null, this, i2);
        return A012 == null ? super.onCreateDialog(i2) : A012;
    }

    public void onDestroy() {
        super.onDestroy();
        C118585uv r1 = this.A0F;
        r1.A00 = null;
        r1.A03 = false;
        r1.A02 = false;
    }
}
