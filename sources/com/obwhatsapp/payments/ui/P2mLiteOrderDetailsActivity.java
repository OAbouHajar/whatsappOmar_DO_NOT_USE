package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass15W;
import X.AnonymousClass17Y;
import X.AnonymousClass1IC;
import X.AnonymousClass1IE;
import X.AnonymousClass1KO;
import X.AnonymousClass1MA;
import X.AnonymousClass1N2;
import X.AnonymousClass1TS;
import X.AnonymousClass1VZ;
import X.AnonymousClass1Vt;
import X.AnonymousClass1Y3;
import X.AnonymousClass2St;
import X.AnonymousClass2ZJ;
import X.AnonymousClass3GF;
import X.AnonymousClass4QO;
import X.AnonymousClass55L;
import X.AnonymousClass629;
import X.AnonymousClass69W;
import X.C005402i;
import X.C1044155g;
import X.C1044255h;
import X.C1045355t;
import X.C111525gS;
import X.C117045sM;
import X.C117735tT;
import X.C118795vG;
import X.C14710pd;
import X.C14870pt;
import X.C16010sH;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16830ti;
import X.C16880tn;
import X.C17030uP;
import X.C17110uY;
import X.C17850vk;
import X.C17950vu;
import X.C18090w8;
import X.C18290wS;
import X.C18300wT;
import X.C18450wi;
import X.C19150xq;
import X.C20180zd;
import X.C216114t;
import X.C218315p;
import X.C221116r;
import X.C228719p;
import X.C228919r;
import X.C25401Jq;
import X.C25411Jr;
import X.C32241fu;
import X.C35251lc;
import X.C49382Ss;
import X.C52372dh;
import X.C797441c;
import X.C85594Pb;
import X.C90004dL;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxCListenerShape1S1200000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.base.WaFragment;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

public final class P2mLiteOrderDetailsActivity extends C111525gS implements AnonymousClass69W {
    public AnonymousClass1KO A00;
    public C17030uP A01;
    public C16080sP A02;
    public C216114t A03;
    public C16460t6 A04;
    public C19150xq A05;
    public C221116r A06;
    public C16010sH A07;
    public AnonymousClass15W A08;
    public C18300wT A09;
    public AnonymousClass17Y A0A;
    public C18090w8 A0B;
    public C18290wS A0C;
    public AnonymousClass1MA A0D;
    public C118795vG A0E;
    public C117045sM A0F;
    public C228719p A0G;
    public C17850vk A0H;
    public AnonymousClass629 A0I;
    public AnonymousClass2ZJ A0J;
    public AnonymousClass1N2 A0K;
    public C218315p A0L;
    public AnonymousClass1TS A0M;
    public C17110uY A0N;
    public C52372dh A0O;
    public C20180zd A0P;
    public WeakReference A0Q;
    public AnonymousClass01J A0R;
    public final AnonymousClass4QO A0S = new AnonymousClass4QO(this);

    public static final /* synthetic */ void A02(WaFragment waFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, C16830ti r6, String str, String str2, int i2) {
        if (i2 == 10755) {
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A1C();
            }
            p2mLiteOrderDetailsActivity.A3A(r6, str2);
            p2mLiteOrderDetailsActivity.A3C(str, "BLOCKED", "enter_dob");
        } else if (i2 != 10756) {
            if (waFragment instanceof ConfirmLegalNameBottomSheetFragment) {
                ((ConfirmLegalNameBottomSheetFragment) waFragment).A1C(true);
            } else if (waFragment instanceof ConfirmDateOfBirthBottomSheetFragment) {
                ((ConfirmDateOfBirthBottomSheetFragment) waFragment).A1D(true);
            }
            C32241fu r2 = new C32241fu(p2mLiteOrderDetailsActivity);
            r2.A07(false);
            r2.A01(R.string.str1664);
            r2.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
            r2.create().show();
        } else {
            p2mLiteOrderDetailsActivity.A39(paymentBottomSheet2, r6, str, str2);
        }
    }

    public static /* synthetic */ void A09(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity) {
        C16880tn r0;
        C35251lc r02;
        String str;
        C16460t6 A35 = p2mLiteOrderDetailsActivity.A35();
        C16830ti r4 = (C16830ti) A35.A0K.A03(p2mLiteOrderDetailsActivity.A37().A08);
        if (r4 != null && (r0 = r4.A00) != null && (r02 = r0.A01) != null && (str = r02.A03) != null) {
            C18300wT r03 = p2mLiteOrderDetailsActivity.A09;
            if (r03 != null) {
                r03.A01().edit().putBoolean("has_p2mlite_transactions", true).apply();
                AnonymousClass2ZJ r04 = p2mLiteOrderDetailsActivity.A0J;
                if (r04 != null) {
                    AnonymousClass1Vt A0L2 = r04.A02.A0L(str);
                    if (A0L2 == null || !A0L2.A0F()) {
                        p2mLiteOrderDetailsActivity.A05.A0K(new C1044255h(p2mLiteOrderDetailsActivity, r4, str));
                        return;
                    }
                    return;
                }
                C18450wi.A0O("paymentCheckoutOrderRepository");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C18450wi.A0O("paymentSharedPrefs");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static /* synthetic */ void A0A(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C797441c r4, C117735tT r5) {
        C18450wi.A0H(r4, 1);
        C16460t6 A35 = p2mLiteOrderDetailsActivity.A35();
        p2mLiteOrderDetailsActivity.runOnUiThread(new C1045355t(p2mLiteOrderDetailsActivity, r4, r5, (C16830ti) A35.A0K.A03(p2mLiteOrderDetailsActivity.A37().A08)));
    }

    public static /* synthetic */ void A0T(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C797441c r8, C117735tT r9, C16830ti r10) {
        C18450wi.A0H(r8, 1);
        p2mLiteOrderDetailsActivity.A3B(r10, p2mLiteOrderDetailsActivity.A37().A04.A01(r8, r9, p2mLiteOrderDetailsActivity.A37().A09, 4, r9.A00));
    }

    public static /* synthetic */ void A0p(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C16830ti r5, String str) {
        p2mLiteOrderDetailsActivity.Afq(R.string.str13db);
        AnonymousClass1MA r3 = p2mLiteOrderDetailsActivity.A0D;
        if (r3 != null) {
            AnonymousClass3GF r2 = new AnonymousClass3GF(p2mLiteOrderDetailsActivity, r5, str);
            C18290wS r1 = p2mLiteOrderDetailsActivity.A0C;
            if (r1 != null) {
                C228919r A042 = r1.A04("P2M_LITE");
                AnonymousClass00B.A06(A042);
                r3.A00(r2, A042, str, false);
                return;
            }
            C18450wi.A0O("paymentsManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        C18450wi.A0O("paymentTransactionActions");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static /* synthetic */ void A0r(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C16830ti r10, String str) {
        String string = p2mLiteOrderDetailsActivity.getString(R.string.str1d55);
        C18450wi.A0B(string);
        AnonymousClass2St A002 = C49382Ss.A00();
        A002.A01("payments_error_code", "10755");
        A002.A01("payments_error_text", string);
        p2mLiteOrderDetailsActivity.A38(A002, r10, 115, "error_dialog", str, 1);
    }

    public static /* synthetic */ void A0u(P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, C16830ti r10, String str) {
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity2 = p2mLiteOrderDetailsActivity;
        String string = p2mLiteOrderDetailsActivity.getString(R.string.str1d55);
        C18450wi.A0B(string);
        AnonymousClass2St A002 = C49382Ss.A00();
        A002.A01("payments_error_code", "10755");
        A002.A01("payments_error_text", string);
        p2mLiteOrderDetailsActivity2.A38(A002, r10, 158, "error_dialog", str, 1);
        AnonymousClass1KO r2 = p2mLiteOrderDetailsActivity2.A00;
        if (r2 != null) {
            AnonymousClass15W r0 = p2mLiteOrderDetailsActivity2.A08;
            if (r0 != null) {
                p2mLiteOrderDetailsActivity2.startActivity(r2.A00(p2mLiteOrderDetailsActivity2, (Bundle) null, (AnonymousClass1Y3) null, (Integer) null, "payments-blocked", (String) null, (ArrayList) null, (ArrayList) null, r0.A00()));
            } else {
                C18450wi.A0O("supportGatingUtils");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        } else {
            C18450wi.A0O("sendFeedback");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final C16460t6 A35() {
        C16460t6 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("coreMessageStore");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C118795vG A36() {
        C118795vG r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("paymentsComplianceManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass629 A37() {
        AnonymousClass629 r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("orderDetailsCoordinator");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r0 = (r0 = r12.A00).A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A38(X.AnonymousClass2St r11, X.C16830ti r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r10 = this;
            X.19p r1 = r10.A0G
            if (r1 == 0) goto L_0x0034
            r7 = 0
            if (r12 == 0) goto L_0x0032
            X.0tn r0 = r12.A00
            if (r0 == 0) goto L_0x0032
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x0032
            int r0 = r0.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0017:
            java.lang.String r6 = X.C49382Ss.A01(r0)
            if (r12 == 0) goto L_0x0027
            X.0tn r0 = r12.A00
            if (r0 == 0) goto L_0x0027
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x0027
            java.lang.String r7 = r0.A07
        L_0x0027:
            r9 = 1
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r8 = r16
            r1.A01(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0032:
            r0 = r7
            goto L_0x0017
        L_0x0034:
            java.lang.String r0 = "p2mLiteEventLogger"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity.A38(X.2St, X.0ti, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }

    public final void A39(PaymentBottomSheet paymentBottomSheet, C16830ti r13, String str, String str2) {
        C16880tn r0;
        C35251lc r02;
        Integer num = null;
        A38(C49382Ss.A00(), r13, (Integer) null, "enter_dob", str2, 0);
        C85594Pb r1 = ConfirmDateOfBirthBottomSheetFragment.A0D;
        if (!(r13 == null || (r0 = r13.A00) == null || (r02 = r0.A01) == null)) {
            num = Integer.valueOf(r02.A01());
        }
        C49382Ss.A01(num);
        ConfirmDateOfBirthBottomSheetFragment A002 = r1.A00();
        A002.A1B(new C90004dL(A002, this, paymentBottomSheet, r13, str));
        if (paymentBottomSheet == null) {
            PaymentBottomSheet A012 = PaymentBottomSheet.A01();
            this.A0Q = new WeakReference(A012);
            A012.A1P(A002);
            Afc(A012);
            return;
        }
        paymentBottomSheet.A1O(A002);
    }

    public final void A3A(C16830ti r13, String str) {
        C32241fu r3 = new C32241fu(this);
        r3.A02(R.string.str1d55);
        r3.A01(R.string.str1d54);
        r3.A07(false);
        r3.A0B(new IDxCListenerShape1S1200000_2_I0(this, r13, str, 0), R.string.str0e87);
        r3.setPositiveButton(R.string.str1377, new IDxCListenerShape1S1200000_2_I0(this, r13, str, 1));
        String string = getString(R.string.str1d55);
        C18450wi.A0B(string);
        AnonymousClass2St A002 = C49382Ss.A00();
        A002.A01("payments_error_code", "10755");
        A002.A01("payments_error_text", string);
        A38(A002, r13, (Integer) null, "error_dialog", str, 0);
        r3.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (java.lang.Integer.valueOf(X.C35251lc.A00(r0.A01)).intValue() != 1) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A3B(X.C16830ti r8, boolean r9) {
        /*
            r7 = this;
            r2 = r8
            if (r8 == 0) goto L_0x002d
            X.0tn r0 = r8.A00
            if (r0 == 0) goto L_0x0021
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x0021
            X.1lZ r0 = r0.A05
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.A01
            int r0 = X.C35251lc.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            int r0 = r0.intValue()
            r4 = 4
            if (r0 == r1) goto L_0x0023
        L_0x0021:
            r4 = 11
        L_0x0023:
            X.1TS r1 = r7.A0M
            if (r1 == 0) goto L_0x002e
            r5 = 1
            r3 = 0
            r6 = r9
            r1.A02(r2, r3, r4, r5, r6)
        L_0x002d:
            return
        L_0x002e:
            java.lang.String r0 = "orderDetailsMessageLogging"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity.A3B(X.0ti, boolean):void");
    }

    public final void A3C(String str, String str2, String str3) {
        AnonymousClass1IE r3;
        AnonymousClass1VZ r1;
        C17850vk r0 = this.A0H;
        if (r0 != null) {
            C17950vu A002 = r0.A00(str);
            AnonymousClass1IC r32 = null;
            if (!(A002 == null || (r1 = A002.A00) == null)) {
                r32 = r1.A02("native_p2m_lite_compliance");
            }
            Map A052 = C25411Jr.A05(new C25401Jq("account_compliance_status", str2), new C25401Jq("last_screen", str3));
            if ((r32 instanceof AnonymousClass1IE) && (r3 = (AnonymousClass1IE) r32) != null) {
                r3.A93(A052);
                return;
            }
            return;
        }
        C18450wi.A0O("fdsManagerRegistry");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public String AFP() {
        C16010sH r2 = this.A07;
        if (r2 != null) {
            C16080sP r0 = this.A02;
            if (r0 != null) {
                String A082 = r0.A08(r2);
                if (A082 != null) {
                    return A082;
                }
            } else {
                C18450wi.A0O("waContactNames");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
        return "";
    }

    public boolean AJV() {
        return false;
    }

    public void AUE(C797441c r10, C117735tT r11) {
        C797441c r4 = r10;
        C18450wi.A0H(r10, 1);
        String string = getResources().getString(R.string.str0e99);
        C18450wi.A0B(string);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0J(string);
        }
        this.A05.Aco(new C1044155g(this, r10, r11));
        A37().A04.A00(this, this.A01, r4, r11, A37().A09, 4, r11.A00);
    }

    public void AUF(C797441c r1, C117735tT r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r0 = r0.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AX1(X.C35431lv r11) {
        /*
            r10 = this;
            r0 = 0
            X.C18450wi.A0H(r11, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            X.629 r0 = r10.A37()
            java.lang.String r3 = r0.A0C
            X.629 r0 = r10.A37()
            java.lang.String r6 = r0.A0D
            X.0sH r0 = r10.A07
            r9 = 0
            if (r0 == 0) goto L_0x00e1
            X.0rv r0 = r0.A0E
            if (r0 == 0) goto L_0x00e1
            java.lang.String r5 = r0.getRawString()
        L_0x0022:
            if (r3 == 0) goto L_0x00e0
            if (r6 == 0) goto L_0x00e0
            if (r5 == 0) goto L_0x00e0
            java.lang.String r1 = "action"
            java.lang.String r0 = "start"
            r2.put(r1, r0)
            java.lang.String r0 = "order_id"
            r2.put(r0, r3)
            X.629 r0 = r10.A37()
            X.1Vw r0 = r0.A08
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "order_message_id"
            r2.put(r0, r1)
            X.1Vy r0 = r11.A02
            java.math.BigDecimal r0 = r0.A00
            double r3 = r0.doubleValue()
            int r7 = r11.A00
            double r0 = (double) r7
            double r3 = r3 * r0
            long r0 = (long) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "order_amount"
            r2.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "order_amount_offset"
            r2.put(r0, r1)
            X.1Vz r0 = r11.A01
            X.1m1 r0 = (X.C35491m1) r0
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "order_currency"
            r2.put(r0, r1)
            X.629 r0 = r10.A37()
            long r0 = r0.A00
            r7 = 0
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0087
            X.629 r0 = r10.A37()
            long r0 = r0.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "order_expiration_timestamp"
            r2.put(r0, r1)
        L_0x0087:
            java.lang.String r0 = "order_payment_config"
            r2.put(r0, r6)
            java.lang.String r0 = "seller_jid"
            r2.put(r0, r5)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "request_id"
            r2.put(r0, r1)
            java.lang.String r0 = "referral"
            java.lang.String r8 = "order_details"
            r2.put(r0, r8)
            java.lang.String r0 = "p2m_lite_checkout"
            X.4W4 r7 = new X.4W4
            r7.<init>(r2, r0, r9)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r10.Afq(r0)
            X.0wT r0 = r10.A09
            if (r0 == 0) goto L_0x00f1
            r2 = 1
            android.content.SharedPreferences r0 = r0.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "has_p2mlite_account"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            X.01J r0 = r10.A0R
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r4 = r0.get()
            X.1JN r4 = (X.AnonymousClass1JN) r4
            X.3GJ r5 = new X.3GJ
            r5.<init>(r10)
            X.3GK r6 = new X.3GK
            r6.<init>(r10)
            r4.A00(r5, r6, r7, r8, r9)
        L_0x00e0:
            return
        L_0x00e1:
            r5 = r9
            goto L_0x0022
        L_0x00e4:
            java.lang.String r0 = "paymentsFdsManager"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00f1:
            java.lang.String r0 = "paymentSharedPrefs"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.P2mLiteOrderDetailsActivity.AX1(X.1lv):void");
    }

    public void onCreate(Bundle bundle) {
        C16010sH A012;
        super.onCreate(bundle);
        C16440t3 r19 = this.A05;
        C14710pd r18 = this.A0C;
        C14870pt r17 = this.A05;
        C17110uY r13 = this.A0N;
        if (r13 != null) {
            C16320sq r16 = this.A05;
            C218315p r12 = this.A0L;
            if (r12 != null) {
                AnonymousClass013 r15 = this.A01;
                AnonymousClass1N2 r11 = this.A0K;
                if (r11 != null) {
                    C18290wS r10 = this.A0C;
                    if (r10 != null) {
                        C16460t6 A35 = A35();
                        C19150xq r9 = this.A05;
                        if (r9 != null) {
                            C17030uP r8 = this.A01;
                            if (r8 != null) {
                                C18090w8 r7 = this.A0B;
                                if (r7 != null) {
                                    C221116r r6 = this.A06;
                                    if (r6 != null) {
                                        AnonymousClass1MA r5 = this.A0D;
                                        if (r5 != null) {
                                            C216114t r4 = this.A03;
                                            if (r4 != null) {
                                                AnonymousClass1TS r3 = this.A0M;
                                                if (r3 != null) {
                                                    AnonymousClass17Y r2 = this.A0A;
                                                    if (r2 != null) {
                                                        AnonymousClass2ZJ r1 = this.A0J;
                                                        if (r1 != null) {
                                                            C16320sq r34 = r16;
                                                            C216114t r20 = r4;
                                                            C19150xq r22 = r9;
                                                            C221116r r23 = r6;
                                                            C14710pd r24 = r18;
                                                            C14870pt r162 = r17;
                                                            C17030uP r172 = r8;
                                                            C16440t3 r182 = r19;
                                                            AnonymousClass013 r192 = r15;
                                                            this.A0I = new AnonymousClass629(r162, r172, r182, r192, r20, A35, r22, r23, r24, r2, r7, r10, r5, r1, r11, r12, r3, r13, r34);
                                                            A37().A09 = "p2m_lite";
                                                            A37().A00(this, this);
                                                            UserJid of = UserJid.of(A37().A08.A00);
                                                            if (of == null) {
                                                                A012 = null;
                                                            } else {
                                                                C216114t r0 = this.A03;
                                                                if (r0 != null) {
                                                                    A012 = r0.A01(of);
                                                                } else {
                                                                    C18450wi.A0O("conversationContactManager");
                                                                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                                                }
                                                            }
                                                            this.A07 = A012;
                                                            C005402i x2 = x();
                                                            if (x2 != null) {
                                                                x2.A0N(true);
                                                            }
                                                            setContentView((View) A37().A04);
                                                            return;
                                                        }
                                                        C18450wi.A0O("paymentCheckoutOrderRepository");
                                                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                                    }
                                                    C18450wi.A0O("paymentTransactionObservers");
                                                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                                }
                                                C18450wi.A0O("orderDetailsMessageLogging");
                                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                            }
                                            C18450wi.A0O("conversationContactManager");
                                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                        }
                                        C18450wi.A0O("paymentTransactionActions");
                                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                    }
                                    C18450wi.A0O("paymentTransactionStore");
                                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                }
                                C18450wi.A0O("paymentsGatingManager");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                            C18450wi.A0O("verifiedNameManager");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                        C18450wi.A0O("messageObservers");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    C18450wi.A0O("paymentsManager");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                C18450wi.A0O("paymentIntents");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C18450wi.A0O("paymentsUtils");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        C18450wi.A0O("linkifier");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void onDestroy() {
        super.onDestroy();
        C52372dh r0 = this.A0O;
        if (r0 != null) {
            r0.A03(this);
        }
        this.A0O = null;
    }

    public void onResume() {
        super.onResume();
        this.A05.Aco(new AnonymousClass55L(this));
    }
}
