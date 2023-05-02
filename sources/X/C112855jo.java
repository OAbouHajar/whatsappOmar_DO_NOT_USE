package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.bloks.ui.BloksDialogFragment;
import com.obwhatsapp.payments.IDxRCallbackShape20S0200000_3_I1;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5jo  reason: invalid class name and case insensitive filesystem */
public abstract class C112855jo extends C111665h9 implements C49282Sg {
    public AnonymousClass1N0 A00;
    public C26251Mz A01;
    public C24561Gk A02;
    public C16260sj A03;
    public C16460t6 A04;
    public C221116r A05;
    public AnonymousClass124 A06;
    public C1204661t A07;
    public C115195pK A08;
    public AnonymousClass175 A09;
    public C18340wX A0A;
    public AnonymousClass17O A0B;
    public C18300wT A0C;
    public C18310wU A0D;
    public AnonymousClass174 A0E;
    public C18320wV A0F;
    public C18290wS A0G;
    public C118365uZ A0H;
    public C118795vG A0I;
    public C117045sM A0J;
    public C119285wq A0K;
    public AnonymousClass5vV A0L;
    public AnonymousClass1Vo A0M = C110105dW.A0Q("PayBloksActivity", "bloks");
    public C118335uW A0N;
    public AnonymousClass5xG A0O;
    public AnonymousClass5wV A0P;
    public C118915vc A0Q;
    public C115245pQ A0R;
    public PaymentIncentiveViewModel A0S;
    public C117745tU A0T;
    public C18280wR A0U;
    public C116325rC A0V;
    public AnonymousClass0y5 A0W;
    public C17220uj A0X;
    public boolean A0Y = false;

    public static void A09(AnonymousClass1Z7 r2, Map map, int i2) {
        if (map == null) {
            map = AnonymousClass000.A0x();
        }
        map.put("error_code", String.valueOf(i2));
        r2.A01("on_failure", map);
    }

    public C25261Jc A37() {
        return super.A35().A9W();
    }

    public final void A38() {
        if (!(!this.A0E)) {
            Bundle A0E2 = C13690nt.A0E(this);
            AnonymousClass00B.A06(A0E2);
            String string = A0E2.getString("screen_name");
            HashMap hashMap = (HashMap) A0E2.getSerializable("screen_params");
            AnonymousClass02C AGM = AGM();
            this.A05 = BloksDialogFragment.A01(string, hashMap);
            if (hashMap != null) {
                this.A09.A02(hashMap);
            }
            if (AGM.A04() == 0) {
                AnonymousClass050 r2 = new AnonymousClass050(AGM);
                r2.A0A(this.A05, R.id.bloks_fragment_container);
                r2.A0I(string);
                r2.A02();
                return;
            }
            A36();
            return;
        }
        this.A0Y = true;
    }

    public void A39(AnonymousClass1Z7 r18) {
        C118795vG r2 = this.A0I;
        C116755rt r1 = new C116755rt(r18, this);
        r2.A00 = "PENDING";
        Context context = r2.A03.A00;
        C14870pt r5 = r2.A01;
        C117045sM r9 = r2.A06;
        C117555tB r3 = new C117555tB(context, r5, r2.A02, r2.A04, r2.A05, r9);
        C118065u0 r8 = new C118065u0(r2, r1);
        C35081lL[] r22 = new C35081lL[1];
        C110115dX.A14("action", "get-account-eligibility-state", r22);
        C28371Vv r13 = new C28371Vv("account", r22);
        r3.A04.A0H(new IDxRCallbackShape20S0200000_3_I1(r3.A00, r3.A03, r3.A01, r8, r3, 11), r13, "get", 0);
    }

    public boolean AHK(int i2) {
        if (i2 != 404 && i2 != 440 && i2 != 449) {
            return false;
        }
        this.A0M.A06(C13680ns.A0c(i2, "handleError/error="));
        this.A0F.A01(true, false);
        C32241fu A002 = C32241fu.A00(this);
        A002.A01(R.string.str1031);
        A002.A07(false);
        C110105dW.A0w(A002, this, 73, R.string.str0e87);
        A002.A00();
        return true;
    }

    public void AXH(int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0342, code lost:
        r1.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0345, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0493, code lost:
        r2 = new com.facebook.redex.IDxPCallbackShape69S0200000_3_I1(r1, r3, r13);
        r7.A01(new com.facebook.redex.IDxKCallbackShape2S1200000_3_I1(r2, r7, r4, r3), r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AaT(X.AnonymousClass1Z7 r25, java.lang.String r26, java.util.Map r27) {
        /*
            r24 = this;
            r5 = r26
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = r25
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = ""
            r1.A00(r0)
        L_0x000f:
            r12 = -1
            int r0 = r5.hashCode()
            r2 = 2
            r4 = 0
            r3 = 1
            switch(r0) {
                case -2131583866: goto L_0x0050;
                case -1828362259: goto L_0x005a;
                case -1432382994: goto L_0x0064;
                case -1371677349: goto L_0x006e;
                case -1191424321: goto L_0x0078;
                case -1032682289: goto L_0x0082;
                case -457979232: goto L_0x008c;
                case -214858504: goto L_0x0096;
                case 20864489: goto L_0x00a1;
                case 205988285: goto L_0x00ad;
                case 254954716: goto L_0x00b9;
                case 391773106: goto L_0x00c5;
                case 641482247: goto L_0x00d1;
                case 761629426: goto L_0x00dd;
                case 927713295: goto L_0x00e9;
                case 928063522: goto L_0x00f5;
                case 1032047561: goto L_0x0101;
                case 1369547730: goto L_0x010d;
                case 1853333482: goto L_0x0119;
                case 1877943783: goto L_0x0125;
                case 1985308587: goto L_0x0131;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.String r6 = "on_success"
            java.lang.String r11 = "is_merchant"
            java.lang.String r10 = "completed_step"
            java.lang.String r7 = "compliance_reason"
            java.lang.String r9 = "pin"
            java.lang.String r0 = "provider"
            java.lang.String r8 = "1"
            r13 = r24
            r5 = r27
            switch(r12) {
                case 0: goto L_0x0216;
                case 1: goto L_0x0238;
                case 2: goto L_0x013d;
                case 3: goto L_0x023c;
                case 4: goto L_0x014a;
                case 5: goto L_0x025e;
                case 6: goto L_0x0030;
                case 7: goto L_0x0278;
                case 8: goto L_0x0293;
                case 9: goto L_0x02a3;
                case 10: goto L_0x02c5;
                case 11: goto L_0x020d;
                case 12: goto L_0x02e7;
                case 13: goto L_0x0346;
                case 14: goto L_0x0391;
                case 15: goto L_0x03fc;
                case 16: goto L_0x041e;
                case 17: goto L_0x042a;
                case 18: goto L_0x0436;
                case 19: goto L_0x0446;
                case 20: goto L_0x0489;
                default: goto L_0x002f;
            }
        L_0x002f:
            return
        L_0x0030:
            X.02i r1 = r13.x()
            if (r1 == 0) goto L_0x002f
            com.obwhatsapp.bloks.ui.BloksDialogFragment r0 = r13.A05
            if (r0 == 0) goto L_0x002f
            java.lang.Boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "action_bar_title"
            java.lang.Object r0 = r5.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.A0J(r0)
            return
        L_0x0050:
            java.lang.String r0 = "change_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 0
            goto L_0x001a
        L_0x005a:
            java.lang.String r0 = "get_compliance_status"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 1
            goto L_0x001a
        L_0x0064:
            java.lang.String r0 = "get_oldest_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 2
            goto L_0x001a
        L_0x006e:
            java.lang.String r0 = "remove_completed_step"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 3
            goto L_0x001a
        L_0x0078:
            java.lang.String r0 = "get_abprop_value"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 4
            goto L_0x001a
        L_0x0082:
            java.lang.String r0 = "verify_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 5
            goto L_0x001a
        L_0x008c:
            java.lang.String r0 = "set_action_bar_title"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 6
            goto L_0x001a
        L_0x0096:
            java.lang.String r0 = "compliance_name_check"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 7
            goto L_0x001a
        L_0x00a1:
            java.lang.String r0 = "reinitialize_payments"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 8
            goto L_0x001a
        L_0x00ad:
            java.lang.String r0 = "set_completed_step"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 9
            goto L_0x001a
        L_0x00b9:
            java.lang.String r0 = "compliance_dob_check"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 10
            goto L_0x001a
        L_0x00c5:
            java.lang.String r0 = "check_camera_permission"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 11
            goto L_0x001a
        L_0x00d1:
            java.lang.String r0 = "get_incentive_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 12
            goto L_0x001a
        L_0x00dd:
            java.lang.String r0 = "remove_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 13
            goto L_0x001a
        L_0x00e9:
            java.lang.String r0 = "forward_to_payment_screen"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 14
            goto L_0x001a
        L_0x00f5:
            java.lang.String r0 = "sync_incentive_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 15
            goto L_0x001a
        L_0x0101:
            java.lang.String r0 = "get_methods"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 16
            goto L_0x001a
        L_0x010d:
            java.lang.String r0 = "create_pin"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 17
            goto L_0x001a
        L_0x0119:
            java.lang.String r0 = "set_sandbox"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 18
            goto L_0x001a
        L_0x0125:
            java.lang.String r0 = "set_navigation_icon"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 19
            goto L_0x001a
        L_0x0131:
            java.lang.String r0 = "set_bio"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x001a
            r12 = 20
            goto L_0x001a
        L_0x013d:
            X.0sq r3 = r13.A05
            X.0wS r2 = r13.A0G
            X.5nf r0 = new X.5nf
            r0.<init>(r1, r2)
            X.C13700nu.A0W(r0, r3)
            return
        L_0x014a:
            java.lang.String r0 = "name"
            java.lang.String r12 = X.C13690nt.A0e(r0, r5)
            java.lang.String r0 = "type"
            java.lang.String r4 = X.C13690nt.A0e(r0, r5)
            java.lang.String r7 = "on_failure"
            if (r4 == 0) goto L_0x0209
            if (r12 == 0) goto L_0x0209
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            r11 = -1
            int r0 = r4.hashCode()     // Catch:{ NumberFormatException -> 0x0205 }
            r10 = 4
            r9 = 3
            switch(r0) {
                case -891985903: goto L_0x016b;
                case 3271912: goto L_0x0175;
                case 64711720: goto L_0x017f;
                case 97526364: goto L_0x0189;
                case 1958052158: goto L_0x0193;
                default: goto L_0x016a;
            }     // Catch:{ NumberFormatException -> 0x0205 }
        L_0x016a:
            goto L_0x019c
        L_0x016b:
            java.lang.String r0 = "string"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            if (r0 == 0) goto L_0x019c
            r11 = 3
            goto L_0x019c
        L_0x0175:
            java.lang.String r0 = "json"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            if (r0 == 0) goto L_0x019c
            r11 = 4
            goto L_0x019c
        L_0x017f:
            java.lang.String r0 = "boolean"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            if (r0 == 0) goto L_0x019c
            r11 = 0
            goto L_0x019c
        L_0x0189:
            java.lang.String r0 = "float"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            if (r0 == 0) goto L_0x019c
            r11 = 2
            goto L_0x019c
        L_0x0193:
            java.lang.String r0 = "integer"
            boolean r0 = r4.equals(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            if (r0 == 0) goto L_0x019c
            r11 = 1
        L_0x019c:
            java.lang.String r4 = "result"
            if (r11 == 0) goto L_0x01de
            if (r11 == r3) goto L_0x01cc
            if (r11 == r2) goto L_0x01ba
            if (r11 == r9) goto L_0x01ac
            if (r11 == r10) goto L_0x01f0
            r1.A00(r7)     // Catch:{ NumberFormatException -> 0x0205 }
            return
        L_0x01ac:
            X.0pd r2 = r13.A0C     // Catch:{ NumberFormatException -> 0x0205 }
            int r0 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0205 }
            java.lang.String r0 = r2.A05(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            r5.put(r4, r0)     // Catch:{ NumberFormatException -> 0x0205 }
            goto L_0x0201
        L_0x01ba:
            X.0pd r2 = r13.A0C     // Catch:{ NumberFormatException -> 0x0205 }
            int r0 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0205 }
            float r0 = r2.A00(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            r5.put(r4, r0)     // Catch:{ NumberFormatException -> 0x0205 }
            goto L_0x0201
        L_0x01cc:
            X.0pd r2 = r13.A0C     // Catch:{ NumberFormatException -> 0x0205 }
            int r0 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0205 }
            int r0 = r2.A02(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            r5.put(r4, r0)     // Catch:{ NumberFormatException -> 0x0205 }
            goto L_0x0201
        L_0x01de:
            X.0pd r2 = r13.A0C     // Catch:{ NumberFormatException -> 0x0205 }
            int r0 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0205 }
            boolean r0 = r2.A0C(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            if (r0 != 0) goto L_0x01ec
            java.lang.String r8 = "0"
        L_0x01ec:
            r5.put(r4, r8)     // Catch:{ NumberFormatException -> 0x0205 }
            goto L_0x0201
        L_0x01f0:
            X.0pd r2 = r13.A0C     // Catch:{ NumberFormatException -> 0x0205 }
            int r0 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0205 }
            org.json.JSONObject r0 = r2.A07(r0)     // Catch:{ NumberFormatException -> 0x0205 }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x0205 }
            r5.put(r4, r0)     // Catch:{ NumberFormatException -> 0x0205 }
        L_0x0201:
            r1.A02(r6, r5)     // Catch:{ NumberFormatException -> 0x0205 }
            return
        L_0x0205:
            r1.A00(r7)
            return
        L_0x0209:
            r1.A00(r7)
            return
        L_0x020d:
            X.0sj r2 = r13.A03
            r0 = 30
            com.obwhatsapp.RequestPermissionActivity.A0T(r13, r2, r0)
            goto L_0x0342
        L_0x0216:
            X.5wV r6 = r13.A0P
            java.lang.String r2 = X.C111335g1.A02(r0, r5)
            java.lang.String r0 = "old_pin"
            java.lang.String r7 = X.C111335g1.A02(r0, r5)
            java.lang.String r0 = "new_pin"
            java.lang.String r8 = X.C111335g1.A02(r0, r5)
            r0 = 3
            com.facebook.redex.IDxPCallbackShape69S0200000_3_I1 r5 = new com.facebook.redex.IDxPCallbackShape69S0200000_3_I1
            r5.<init>(r1, r0, r13)
            r9 = 0
            com.facebook.redex.IDxKCallbackShape0S2200000_3_I1 r4 = new com.facebook.redex.IDxKCallbackShape0S2200000_3_I1
            r4.<init>(r5, r6, r7, r8, r9)
            r6.A01(r4, r5, r2)
            return
        L_0x0238:
            r13.A39(r1)
            return
        L_0x023c:
            java.lang.String r2 = X.C13690nt.A0e(r10, r5)
            java.lang.Object r0 = r5.get(r11)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0254
            X.17O r1 = r13.A0B
            X.1tS r0 = r1.A01(r2)
            r1.A07(r0)
            return
        L_0x0254:
            X.175 r1 = r13.A09
            X.1tS r0 = r1.A01(r2)
            r1.A07(r0)
            return
        L_0x025e:
            X.5wV r6 = r13.A0P
            java.lang.String r4 = X.C111335g1.A02(r0, r5)
            java.lang.String r3 = X.C111335g1.A02(r9, r5)
            r0 = 2
            com.facebook.redex.IDxPCallbackShape69S0200000_3_I1 r2 = new com.facebook.redex.IDxPCallbackShape69S0200000_3_I1
            r2.<init>(r1, r0, r13)
            r1 = 3
            com.facebook.redex.IDxKCallbackShape2S1200000_3_I1 r0 = new com.facebook.redex.IDxKCallbackShape2S1200000_3_I1
            r0.<init>(r2, r6, r3, r1)
            r6.A01(r0, r2, r4)
            return
        L_0x0278:
            java.lang.String r0 = "full_name"
            java.lang.String r4 = X.C13690nt.A0e(r0, r5)
            X.AnonymousClass00B.A05(r4)
            java.lang.String r3 = X.C13690nt.A0e(r7, r5)
            X.AnonymousClass00B.A05(r3)
            X.5vG r2 = r13.A0I
            X.61U r0 = new X.61U
            r0.<init>(r1, r13)
            r2.A01(r0, r4, r3)
            return
        L_0x0293:
            java.lang.String r0 = "remove_tos"
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r8.equals(r0)
            X.0wV r0 = r13.A0F
            r0.A01(r1, r4)
            return
        L_0x02a3:
            java.lang.String r2 = X.C13690nt.A0e(r10, r5)
            java.lang.Object r0 = r5.get(r11)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x02bb
            X.17O r1 = r13.A0B
            X.1tS r0 = r1.A01(r2)
            r1.A08(r0)
            return
        L_0x02bb:
            X.175 r1 = r13.A09
            X.1tS r0 = r1.A01(r2)
            r1.A08(r0)
            return
        L_0x02c5:
            java.lang.String r0 = "dob"
            java.lang.String r0 = X.C111335g1.A02(r0, r5)
            int[] r0 = X.C119055vq.A01(r0)
            r10 = r0[r4]
            r9 = r0[r3]
            r8 = r0[r2]
            java.lang.String r7 = X.C13690nt.A0e(r7, r5)
            X.AnonymousClass00B.A05(r7)
            X.5vG r5 = r13.A0I
            X.61T r6 = new X.61T
            r6.<init>(r1, r13)
            r5.A00(r6, r7, r8, r9, r10)
            return
        L_0x02e7:
            com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r0 = r13.A0S
            X.027 r0 = r0.A01
            java.lang.Object r2 = r0.A01()
            X.5xI r2 = (X.AnonymousClass5xI) r2
            if (r2 == 0) goto L_0x033b
            int r0 = r2.A00
            if (r0 == r3) goto L_0x033b
            java.lang.Object r5 = r2.A01
            X.2fW r5 = (X.C53322fW) r5
            java.util.HashMap r4 = X.AnonymousClass000.A0x()
            if (r5 == 0) goto L_0x0337
            X.2fU r0 = r5.A01
            if (r0 == 0) goto L_0x0312
            X.2fV r0 = r0.A08
            long r2 = r0.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "param_incentive_offer_id"
            r4.put(r0, r2)
        L_0x0312:
            X.2fT r3 = r5.A02
            if (r3 == 0) goto L_0x0337
            boolean r0 = r3.A04
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_is_eligible"
            r4.put(r0, r2)
            int r0 = r3.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_pending_count"
            r4.put(r0, r2)
            int r0 = r3.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "param_incentive_claim_info_redeemed_count"
            r4.put(r0, r2)
        L_0x0337:
            r1.A02(r6, r4)
            return
        L_0x033b:
            java.lang.String r0 = "PAY: PayBloksActivity/performAsyncRequest/get incentive data returned an error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r6 = "on_failure"
        L_0x0342:
            r1.A00(r6)
            return
        L_0x0346:
            com.facebook.redex.IDxCallbackShape65S0200000_3_I1 r6 = new com.facebook.redex.IDxCallbackShape65S0200000_3_I1
            r6.<init>(r1, r3, r13)
            java.lang.String r0 = "remaining_cards"
            java.lang.String r0 = X.C13690nt.A0e(r0, r5)
            int r0 = X.C29501aj.A00(r0, r4)
            if (r0 > r3) goto L_0x0384
            X.0pt r14 = r13.A05
            X.0sq r8 = r13.A05
            X.0wR r7 = r13.A0U
            X.0wS r5 = r13.A0G
            X.0t6 r4 = r13.A04
            X.0wT r3 = r13.A0C
            X.0wU r2 = r13.A0D
            X.0wV r1 = r13.A0F
            X.0wP r15 = r13.A07
            X.0wX r0 = r13.A0A
            X.5vZ r12 = new X.5vZ
            r17 = r0
            r18 = r3
            r19 = r2
            r20 = r1
            r21 = r5
            r22 = r7
            r23 = r8
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r12.A00(r6)
            return
        L_0x0384:
            X.0wU r2 = r13.A0D
            java.lang.String r0 = "credential_id"
            java.lang.String r1 = X.C13690nt.A0e(r0, r5)
            r0 = 0
            r2.A0C(r6, r0, r1, r0)
            return
        L_0x0391:
            android.content.Context r1 = r13.getApplicationContext()
            X.0wS r0 = r13.A0G
            X.19r r0 = r0.A03()
            java.lang.Class r0 = r0.AFu()
            android.content.Intent r5 = X.C110105dW.A04(r1, r0)
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r1 = "extra_conversation_message_type"
            int r0 = r2.getIntExtra(r1, r4)
            r5.putExtra(r1, r0)
            java.lang.String r0 = "extra_jid"
            X.C110115dX.A0n(r2, r5, r0)
            java.lang.String r0 = "extra_receiver_jid"
            X.C110115dX.A0n(r2, r5, r0)
            java.lang.String r4 = "extra_quoted_msg_row_id"
            r0 = 0
            long r0 = r2.getLongExtra(r4, r0)
            r5.putExtra(r4, r0)
            java.lang.String r0 = "extra_payment_preset_amount"
            X.C110115dX.A0n(r2, r5, r0)
            java.lang.String r0 = "extra_transaction_id"
            X.C110115dX.A0n(r2, r5, r0)
            java.lang.String r0 = "extra_payment_preset_min_amount"
            X.C110115dX.A0n(r2, r5, r0)
            java.lang.String r0 = "extra_request_message_key"
            X.C110115dX.A0n(r2, r5, r0)
            java.lang.String r1 = "extra_is_pay_money_only"
            boolean r0 = r2.getBooleanExtra(r1, r3)
            r5.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_note"
            X.C110115dX.A0n(r2, r5, r0)
            java.lang.String r1 = "extra_mentioned_jids"
            java.util.ArrayList r0 = r2.getStringArrayListExtra(r1)
            r5.putStringArrayListExtra(r1, r0)
            java.lang.String r0 = "extra_inviter_jid"
            X.C110115dX.A0n(r2, r5, r0)
            r13.A2V(r5)
            r13.finish()
            return
        L_0x03fc:
            java.lang.String r0 = "param_force_incentive_claim_info_sync"
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = r8.equals(r0)
            com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel r2 = r13.A0S
            X.0sq r1 = r2.A07
            if (r0 == 0) goto L_0x0415
            X.64x r0 = new X.64x
            r0.<init>(r2)
            r1.Acl(r0)
            return
        L_0x0415:
            X.662 r0 = new X.662
            r0.<init>(r2, r3)
            r1.Acl(r0)
            return
        L_0x041e:
            r0 = 2
            com.facebook.redex.IDxCallbackShape65S0200000_3_I1 r2 = new com.facebook.redex.IDxCallbackShape65S0200000_3_I1
            r2.<init>(r1, r0, r13)
            X.0wU r0 = r13.A0D
            r0.A08(r2)
            return
        L_0x042a:
            X.5wV r7 = r13.A0P
            java.lang.String r6 = X.C111335g1.A02(r0, r5)
            java.lang.String r4 = X.C111335g1.A02(r9, r5)
            r3 = 0
            goto L_0x0493
        L_0x0436:
            java.lang.String r0 = "is_sandbox"
            java.lang.Object r0 = r5.get(r0)
            boolean r1 = r8.equals(r0)
            X.0wT r0 = r13.A0C
            r0.A0O(r1)
            return
        L_0x0446:
            java.lang.String r0 = "navigation_icon"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "close"
            boolean r2 = r0.equals(r1)
            java.lang.String r0 = "icon_color_filter"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r0 = "white"
            boolean r3 = r0.equals(r1)
            X.013 r1 = r13.A01
            r0 = 2131231482(0x7f0802fa, float:1.8079046E38)
            if (r2 == 0) goto L_0x0468
            r0 = 2131231589(0x7f080365, float:1.8079263E38)
        L_0x0468:
            X.25m r2 = X.C447725m.A00(r13, r1, r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131100093(0x7f0601bd, float:1.7812558E38)
            if (r3 == 0) goto L_0x0478
            r0 = 2131101963(0x7f06090b, float:1.781635E38)
        L_0x0478:
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r1, r0)
            androidx.appcompat.widget.Toolbar r0 = X.C110105dW.A09(r13)
            r0.setNavigationIcon((android.graphics.drawable.Drawable) r2)
            return
        L_0x0489:
            X.5wV r7 = r13.A0P
            java.lang.String r6 = X.C111335g1.A02(r0, r5)
            java.lang.String r4 = X.C111335g1.A02(r9, r5)
        L_0x0493:
            com.facebook.redex.IDxPCallbackShape69S0200000_3_I1 r2 = new com.facebook.redex.IDxPCallbackShape69S0200000_3_I1
            r2.<init>(r1, r3, r13)
            com.facebook.redex.IDxKCallbackShape2S1200000_3_I1 r0 = new com.facebook.redex.IDxKCallbackShape2S1200000_3_I1
            r0.<init>(r2, r7, r4, r3)
            r7.A01(r0, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112855jo.AaT(X.1Z7, java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0335, code lost:
        if (r0 == false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0337, code lost:
        return "1";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String AaW(java.lang.String r23, java.util.Map r24) {
        /*
            r22 = this;
            java.lang.String r0 = "case"
            r4 = r24
            java.lang.Object r1 = r4.remove(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r8 = ""
            if (r0 != 0) goto L_0x0032
            r15 = -1
            int r0 = r1.hashCode()
            r10 = 8
            r9 = 2
            r18 = 0
            r7 = 1
            switch(r0) {
                case -2090067461: goto L_0x01d6;
                case -1486928264: goto L_0x01cb;
                case -1347269146: goto L_0x01c0;
                case -1344002586: goto L_0x01b5;
                case -1145142119: goto L_0x01aa;
                case -1060255204: goto L_0x019f;
                case -1003060006: goto L_0x0194;
                case -985374640: goto L_0x0189;
                case -975395056: goto L_0x017d;
                case -919584206: goto L_0x0171;
                case -848949171: goto L_0x0165;
                case -840371252: goto L_0x0159;
                case -594428356: goto L_0x014d;
                case -314691285: goto L_0x0141;
                case 1809539: goto L_0x0135;
                case 329749850: goto L_0x0129;
                case 425265908: goto L_0x011d;
                case 540049915: goto L_0x0111;
                case 580608584: goto L_0x0105;
                case 674867313: goto L_0x00f9;
                case 1518694893: goto L_0x00ed;
                case 1785060649: goto L_0x00e1;
                case 1976375430: goto L_0x00d5;
                case 1999013019: goto L_0x00c9;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r14 = "on_success"
            java.lang.String r12 = "is_hide"
            java.lang.String r13 = "on_failure"
            java.lang.String r11 = "0"
            r6 = 0
            java.lang.String r5 = "1"
            r3 = r22
            r2 = r23
            switch(r15) {
                case 0: goto L_0x0339;
                case 1: goto L_0x0280;
                case 2: goto L_0x026a;
                case 3: goto L_0x0048;
                case 4: goto L_0x0300;
                case 5: goto L_0x0243;
                case 6: goto L_0x0224;
                case 7: goto L_0x00b1;
                case 8: goto L_0x02e4;
                case 9: goto L_0x00a6;
                case 10: goto L_0x02c9;
                case 11: goto L_0x02b1;
                case 12: goto L_0x02a0;
                case 13: goto L_0x024e;
                case 14: goto L_0x0219;
                case 15: goto L_0x0033;
                case 16: goto L_0x020e;
                case 17: goto L_0x0207;
                case 18: goto L_0x007d;
                case 19: goto L_0x0346;
                case 20: goto L_0x0334;
                case 21: goto L_0x01fc;
                case 22: goto L_0x01e1;
                case 23: goto L_0x028a;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r8
        L_0x0033:
            java.lang.String r0 = "date"
            java.lang.String r0 = X.C111335g1.A02(r0, r4)
            java.util.Date r1 = X.C119055vq.A00(r0)
            if (r1 == 0) goto L_0x0032
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r7)
            java.lang.String r8 = r0.format(r1)
            return r8
        L_0x0048:
            java.lang.String r0 = "num_of_digits"
            java.lang.String r1 = X.C13690nt.A0e(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0375
            int r4 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x036d }
            X.0sK r0 = r3.A01     // Catch:{ NumberFormatException -> 0x036d }
            r0.A0B()     // Catch:{ NumberFormatException -> 0x036d }
            X.1Zb r1 = r0.A01     // Catch:{ NumberFormatException -> 0x036d }
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)     // Catch:{ NumberFormatException -> 0x036d }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ NumberFormatException -> 0x036d }
            java.lang.String r8 = X.C24561Gk.A02(r0)     // Catch:{ NumberFormatException -> 0x036d }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NumberFormatException -> 0x036d }
            if (r0 != 0) goto L_0x0032
            int r0 = r8.length()     // Catch:{ NumberFormatException -> 0x036d }
            if (r0 <= r4) goto L_0x0032
            int r0 = r0 - r4
            java.lang.String r8 = r8.substring(r0)     // Catch:{ NumberFormatException -> 0x036d }
            return r8
        L_0x007d:
            java.lang.String r0 = "\\s"
            java.lang.String r3 = r2.replaceAll(r0, r8)
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r4)
        L_0x0087:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0032
            java.util.Map$Entry r1 = X.AnonymousClass000.A0z(r2)
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.util.regex.Matcher r0 = X.C110115dX.A0k(r3, r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x0087
            java.lang.String r8 = X.C13690nt.A0f(r1)
            return r8
        L_0x00a6:
            java.lang.String r1 = X.C13690nt.A0e(r2, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0032
            return r1
        L_0x00b1:
            androidx.appcompat.widget.Toolbar r1 = X.C110105dW.A09(r3)
            boolean r0 = r1 instanceof com.obwhatsapp.payments.ui.widget.PayToolbar
            if (r0 == 0) goto L_0x0032
            com.obwhatsapp.payments.ui.widget.PayToolbar r1 = (com.obwhatsapp.payments.ui.widget.PayToolbar) r1
            java.lang.Object r0 = r4.get(r12)
            boolean r0 = r5.equals(r0)
            r0 = r0 ^ 1
            r1.setLockIconVisibility(r0)
            return r8
        L_0x00c9:
            java.lang.String r0 = "get_merchant_fees"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 23
            goto L_0x0020
        L_0x00d5:
            java.lang.String r0 = "string_replace"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 22
            goto L_0x0020
        L_0x00e1:
            java.lang.String r0 = "get_pin_retry_ts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 21
            goto L_0x0020
        L_0x00ed:
            java.lang.String r0 = "is_debug_build"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 20
            goto L_0x0020
        L_0x00f9:
            java.lang.String r0 = "get_error_string"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 19
            goto L_0x0020
        L_0x0105:
            java.lang.String r0 = "get_card_network"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 18
            goto L_0x0020
        L_0x0111:
            java.lang.String r0 = "get_device_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 17
            goto L_0x0020
        L_0x011d:
            java.lang.String r0 = "string_upper"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 16
            goto L_0x0020
        L_0x0129:
            java.lang.String r0 = "get_formatted_date"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 15
            goto L_0x0020
        L_0x0135:
            java.lang.String r0 = "current_server_time"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 14
            goto L_0x0020
        L_0x0141:
            java.lang.String r0 = "get_screen_density_bucket"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 13
            goto L_0x0020
        L_0x014d:
            java.lang.String r0 = "can_set_bio"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 12
            goto L_0x0020
        L_0x0159:
            java.lang.String r0 = "show_action_bar_icon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 11
            goto L_0x0020
        L_0x0165:
            java.lang.String r0 = "is_step_completed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 10
            goto L_0x0020
        L_0x0171:
            java.lang.String r0 = "get_button_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 9
            goto L_0x0020
        L_0x017d:
            java.lang.String r0 = "regex_check"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 8
            goto L_0x0020
        L_0x0189:
            java.lang.String r0 = "hide_lock_icon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 7
            goto L_0x0020
        L_0x0194:
            java.lang.String r0 = "get_faq_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 6
            goto L_0x0020
        L_0x019f:
            java.lang.String r0 = "get_tos_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 5
            goto L_0x0020
        L_0x01aa:
            java.lang.String r0 = "exp_date_check"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 4
            goto L_0x0020
        L_0x01b5:
            java.lang.String r0 = "get_phone_last_n_digits"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 3
            goto L_0x0020
        L_0x01c0:
            java.lang.String r0 = "hide_toolbar_bottom_divider"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 2
            goto L_0x0020
        L_0x01cb:
            java.lang.String r0 = "enable_secure_flag"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 1
            goto L_0x0020
        L_0x01d6:
            java.lang.String r0 = "hide_toolbar_title_and_logo"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            r15 = 0
            goto L_0x0020
        L_0x01e1:
            if (r23 == 0) goto L_0x036c
            java.lang.String r0 = "string_to_replace"
            java.lang.String r3 = X.C13690nt.A0e(r0, r4)
            java.lang.String r0 = "string_replacement"
            java.lang.String r1 = X.C13690nt.A0e(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0375
            if (r1 == 0) goto L_0x0375
            java.lang.String r8 = r2.replaceAll(r3, r1)
            return r8
        L_0x01fc:
            X.5vc r0 = r3.A0Q
            long r0 = r0.A00()
            java.lang.String r8 = java.lang.String.valueOf(r0)
            return r8
        L_0x0207:
            X.0wR r0 = r3.A0U
            java.lang.String r8 = r0.A01()
            return r8
        L_0x020e:
            X.013 r0 = r3.A01
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            java.lang.String r8 = r2.toUpperCase(r0)
            return r8
        L_0x0219:
            X.0t3 r0 = r3.A05
            long r0 = r0.A00()
            java.lang.String r8 = java.lang.String.valueOf(r0)
            return r8
        L_0x0224:
            java.lang.String r0 = "platform"
            java.lang.String r2 = X.C13690nt.A0e(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0232
            java.lang.String r2 = "payments"
        L_0x0232:
            X.0uj r1 = r3.A0X
            java.lang.String r0 = "article_id"
            java.lang.String r0 = X.C13690nt.A0e(r0, r4)
            android.net.Uri r0 = r1.A02(r6, r2, r0, r6)
            java.lang.String r8 = r0.toString()
            return r8
        L_0x0243:
            X.1Aj r0 = r3.A02
            android.net.Uri r0 = r0.A00(r2)
            java.lang.String r8 = r0.toString()
            return r8
        L_0x024e:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r0 = r3.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r1 = r1.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x0267
            java.lang.String r8 = "hdpi_or_smaller"
            return r8
        L_0x0267:
            java.lang.String r8 = "larger_than_hdpi"
            return r8
        L_0x026a:
            r0 = 2131366674(0x7f0a1312, float:1.8353248E38)
            android.view.View r1 = r3.findViewById(r0)
            java.lang.Object r0 = r4.get(r12)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x027c
            r10 = 0
        L_0x027c:
            r1.setVisibility(r10)
            return r8
        L_0x0280:
            android.view.Window r1 = r3.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            return r8
        L_0x028a:
            X.174 r0 = r3.A0E
            r0.A00()
            X.5pK r0 = r3.A08
            if (r0 != 0) goto L_0x029a
            X.5pK r0 = new X.5pK
            r0.<init>()
            r3.A08 = r0
        L_0x029a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x02a0:
            X.5xG r0 = r3.A0O
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0338
            X.5xG r0 = r3.A0O
            int r0 = r0.A01()
            if (r0 == r7) goto L_0x0338
            return r5
        L_0x02b1:
            X.02i r1 = r3.x()
            if (r1 == 0) goto L_0x036c
            com.obwhatsapp.bloks.ui.BloksDialogFragment r0 = r3.A05
            if (r0 == 0) goto L_0x036c
            java.lang.Boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x036c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x036c
            r1.A0F(r6)
            return r6
        L_0x02c9:
            java.lang.String r0 = "completed_step"
            java.lang.String r2 = X.C13690nt.A0e(r0, r4)
            java.lang.String r0 = "is_merchant"
            java.lang.Object r0 = r4.get(r0)
            boolean r1 = r5.equals(r0)
            X.175 r0 = r3.A09
            if (r1 == 0) goto L_0x02df
            X.17O r0 = r3.A0B
        L_0x02df:
            boolean r0 = r0.A0G(r2)
            goto L_0x0335
        L_0x02e4:
            java.lang.String r0 = "regex"
            java.lang.String r0 = X.C13690nt.A0e(r0, r4)
            X.AnonymousClass00B.A06(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r9)     // Catch:{ PatternSyntaxException -> 0x02fd }
            java.util.regex.Matcher r0 = r0.matcher(r2)     // Catch:{ PatternSyntaxException -> 0x02fd }
            boolean r0 = r0.find()     // Catch:{ PatternSyntaxException -> 0x02fd }
            if (r0 != 0) goto L_0x02fc
            return r13
        L_0x02fc:
            return r14
        L_0x02fd:
            java.lang.String r0 = "on_exception"
            return r0
        L_0x0300:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = "MM/yy"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r1, r3)
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            int r16 = r15.get(r7)
            int r17 = r15.get(r9)
            r19 = 23
            r20 = 59
            r21 = 59
            r15.set(r16, r17, r18, r19, r20, r21)
            java.util.Date r1 = r0.parse(r2)     // Catch:{ ParseException -> 0x0333 }
            if (r1 == 0) goto L_0x0330
            java.util.Date r0 = r15.getTime()     // Catch:{ ParseException -> 0x0333 }
            boolean r0 = r1.before(r0)     // Catch:{ ParseException -> 0x0333 }
            if (r0 != 0) goto L_0x0330
            r18 = 1
        L_0x0330:
            if (r18 == 0) goto L_0x0333
            return r14
        L_0x0333:
            return r13
        L_0x0334:
            r0 = 0
        L_0x0335:
            if (r0 == 0) goto L_0x0338
            return r5
        L_0x0338:
            return r11
        L_0x0339:
            androidx.appcompat.widget.Toolbar r0 = X.C110105dW.A09(r3)
            if (r0 == 0) goto L_0x036c
            r0.setLogo((android.graphics.drawable.Drawable) r6)
            r0.setTitle((java.lang.CharSequence) r6)
            return r6
        L_0x0346:
            X.0pd r1 = r3.A0C
            r0 = 698(0x2ba, float:9.78E-43)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0356
            X.61t r0 = r3.A07
            java.lang.String r6 = r0.ADW(r2)
        L_0x0356:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x036c
            java.lang.String r6 = X.C13690nt.A0e(r2, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x036c
            java.lang.String r0 = "100"
            java.lang.String r6 = X.C13690nt.A0e(r0, r4)
        L_0x036c:
            return r6
        L_0x036d:
            r4 = move-exception
            X.1Vo r1 = r3.A0M
            java.lang.String r0 = "performDataProcessingAction: REQUESTED_CASE_GET_PHONE_LAST_N_DIGITS: illegal num_of_digits"
            r1.A0A(r0, r4)
        L_0x0375:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112855jo.AaW(java.lang.String, java.util.Map):java.lang.String");
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 30) {
            return;
        }
        if (i3 == -1) {
            A36();
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0S = C110105dW.A0R(this);
        getWindow().setSoftInputMode(16);
    }

    public void onResume() {
        super.onResume();
        if (this.A0Y) {
            A38();
            this.A0Y = false;
        }
    }
}
