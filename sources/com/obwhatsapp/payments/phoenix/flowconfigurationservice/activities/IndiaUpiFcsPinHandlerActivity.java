package com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01D;
import X.AnonymousClass173;
import X.AnonymousClass174;
import X.AnonymousClass175;
import X.AnonymousClass1IC;
import X.AnonymousClass1IE;
import X.AnonymousClass1JN;
import X.AnonymousClass1VZ;
import X.AnonymousClass1Vo;
import X.AnonymousClass29T;
import X.AnonymousClass2HJ;
import X.AnonymousClass2T3;
import X.AnonymousClass4QN;
import X.AnonymousClass4W4;
import X.AnonymousClass55H;
import X.AnonymousClass55I;
import X.AnonymousClass5Q8;
import X.AnonymousClass5Q9;
import X.AnonymousClass5kk;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C1036852i;
import X.C109405Rz;
import X.C111805hR;
import X.C112325iJ;
import X.C118805vH;
import X.C119265wo;
import X.C119365wy;
import X.C1200960h;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14710pd;
import X.C17190ug;
import X.C17850vk;
import X.C17950vu;
import X.C18260wP;
import X.C18280wR;
import X.C18290wS;
import X.C18310wU;
import X.C18340wX;
import X.C18450wi;
import X.C20180zd;
import X.C228919r;
import X.C25401Jq;
import X.C25411Jr;
import X.C25421Js;
import X.C28401Vy;
import X.C32241fu;
import X.C35301lh;
import X.C35481m0;
import X.C35491m1;
import X.C35521m4;
import X.C39901tF;
import X.C50992an;
import X.C51002ao;
import X.C53852gP;
import X.C86074Rc;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxECallbackShape390S0100000_2_I1;
import com.obwhatsapp.R;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public final class IndiaUpiFcsPinHandlerActivity extends AnonymousClass5kk {
    public C50992an A00;
    public C51002ao A01;
    public C35521m4 A02;
    public C35301lh A03;
    public AnonymousClass4QN A04;
    public C86074Rc A05;
    public C17850vk A06;
    public AnonymousClass01D A07;
    public String A08;
    public String A09;
    public final AnonymousClass1Vo A0A = AnonymousClass1Vo.A00("IndiaUpiFcsPinHandlerActivity", "payment-settings", "IN");
    public final C109405Rz A0B = new IDxECallbackShape390S0100000_2_I1(this, 2);

    public static /* synthetic */ void A02(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity) {
        AnonymousClass29T.A00(indiaUpiFcsPinHandlerActivity, 27);
        indiaUpiFcsPinHandlerActivity.A3H();
        indiaUpiFcsPinHandlerActivity.finish();
    }

    public static /* synthetic */ void A03(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity) {
        AnonymousClass29T.A00(indiaUpiFcsPinHandlerActivity, 12);
        indiaUpiFcsPinHandlerActivity.A00.Act(indiaUpiFcsPinHandlerActivity, Uri.parse("https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"));
        indiaUpiFcsPinHandlerActivity.A3H();
        indiaUpiFcsPinHandlerActivity.finish();
    }

    public static /* synthetic */ void A09(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity) {
        String str;
        AnonymousClass29T.A00(indiaUpiFcsPinHandlerActivity, 10);
        AnonymousClass4W4 r3 = new AnonymousClass4W4((Map) null, "upi_p2p_check_balance", (String) null);
        C35521m4 r0 = indiaUpiFcsPinHandlerActivity.A02;
        if (r0 == null) {
            str = "paymentBankAccount";
        } else {
            Map A092 = C25421Js.A09(new C25401Jq("credential_id", r0.A0A));
            AnonymousClass01D r02 = indiaUpiFcsPinHandlerActivity.A07;
            if (r02 != null) {
                ((AnonymousClass1JN) r02.get()).A00((AnonymousClass5Q8) null, (AnonymousClass5Q9) null, r3, "payment_bank_account_details", A092);
                indiaUpiFcsPinHandlerActivity.A3H();
                indiaUpiFcsPinHandlerActivity.finish();
                return;
            }
            str = "paymentsFdsManagerLazy";
        }
        throw C18450wi.A03(str);
    }

    public static final /* synthetic */ void A0A(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity) {
        indiaUpiFcsPinHandlerActivity.A3H();
        indiaUpiFcsPinHandlerActivity.finish();
    }

    public static final /* synthetic */ void A0T(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity, Map map) {
        Map map2;
        Number number;
        if (map != null) {
            Object obj = map.get("error");
            if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
                Object obj2 = map2.get("code");
                if ((obj2 instanceof Integer) && (number = (Number) obj2) != null) {
                    int intValue = number.intValue();
                    Bundle A0D = C13690nt.A0D();
                    A0D.putInt("error_code", intValue);
                    int i2 = 12;
                    if (intValue != 11454) {
                        i2 = 10;
                        if (intValue != 11459) {
                            i2 = 11;
                            if (intValue != 11468) {
                                if (intValue == 11487 || intValue == 20682 || intValue == 20697) {
                                    i2 = 27;
                                } else {
                                    String str = indiaUpiFcsPinHandlerActivity.A09;
                                    if (str == null) {
                                        throw C18450wi.A03("pinOp");
                                    } else if (str.equals("pay")) {
                                        indiaUpiFcsPinHandlerActivity.A3H();
                                        indiaUpiFcsPinHandlerActivity.finish();
                                        return;
                                    } else {
                                        indiaUpiFcsPinHandlerActivity.A3b();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    AnonymousClass29T.A02(indiaUpiFcsPinHandlerActivity, A0D, i2);
                    return;
                }
            }
        }
        indiaUpiFcsPinHandlerActivity.A0A.A05("Error code is null");
    }

    public void A3Z() {
        Ac1();
        AnonymousClass29T.A01(this, 19);
    }

    public void A3b() {
        C119265wo A032 = this.A0B.A03(this.A06);
        A3I();
        if (A032.A00() == 0) {
            A032.A02();
        }
        String A012 = A032.A01(this);
        AnonymousClass2T3 r0 = new AnonymousClass2T3();
        r0.A08 = A012;
        C13680ns.A1J(r0.A00(), this);
    }

    public void A3c() {
    }

    public void A3d() {
    }

    public void A3i(HashMap hashMap) {
        String str;
        AnonymousClass1IE r4;
        AnonymousClass1VZ r1;
        C18450wi.A0H(hashMap, 0);
        String A002 = C119365wy.A00("MPIN", hashMap);
        C35301lh r0 = this.A03;
        AnonymousClass1IC r42 = null;
        if (r0 == null) {
            str = "seqNumber";
        } else {
            Object obj = r0.A00;
            if (A002 != null && obj != null) {
                C25401Jq[] r2 = new C25401Jq[2];
                C25401Jq.A00("mpin", A002, r2, 0);
                C25401Jq.A00("npci_common_library_transaction_id", obj, r2, 1);
                Map A052 = C25411Jr.A05(r2);
                C17850vk r12 = this.A06;
                if (r12 != null) {
                    String str2 = this.A08;
                    if (str2 == null) {
                        str = "fdsManagerId";
                    } else {
                        C17950vu A003 = r12.A00(str2);
                        if (!(A003 == null || (r1 = A003.A00) == null)) {
                            r42 = r1.A02("native_flow_npci_common_library");
                        }
                        if ((r42 instanceof AnonymousClass1IE) && (r4 = (AnonymousClass1IE) r42) != null) {
                            r4.A93(A052);
                            return;
                        }
                        return;
                    }
                } else {
                    str = "fdsManagerRegistry";
                }
            } else {
                return;
            }
        }
        throw C18450wi.A03(str);
    }

    public void ASh(AnonymousClass2HJ r20, String str) {
        int i2;
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            this.A0A.A06("onListKeys called");
            C18450wi.A0F(str2);
            String str3 = this.A09;
            C111805hR r9 = null;
            if (str3 == null) {
                throw C18450wi.A03("pinOp");
            }
            String str4 = "pay";
            boolean equals = str3.equals(str4);
            C35521m4 r4 = this.A02;
            if (equals) {
                if (r4 != null) {
                    C39901tF r5 = r4.A08;
                    if (r5 != null) {
                        AnonymousClass00B.A06(r5);
                        C111805hR r52 = (C111805hR) r5;
                        int intExtra = getIntent().getIntExtra("extra_payment_preset_amount", 0);
                        C228919r A042 = this.A0P.A04("UPI");
                        AnonymousClass00B.A06(A042);
                        C35491m1 r42 = (C35491m1) C35481m0.A05;
                        C28401Vy r92 = new C28401Vy(new BigDecimal(((long) intExtra) / ((long) A042.ABG(r42.A04))), r42.A01);
                        C35521m4 r0 = this.A02;
                        if (r0 != null) {
                            String str5 = r0.A0B;
                            C35301lh r10 = r52.A08;
                            String str6 = (String) this.A0C.A05().A00;
                            String stringExtra = getIntent().getStringExtra("extra_receiver_vpa");
                            String stringExtra2 = getIntent().getStringExtra("extra_seq_number");
                            C35521m4 r02 = this.A02;
                            if (r02 != null) {
                                C35301lh r03 = r02.A09;
                                A3f(r92, r10, str2, str5, str6, stringExtra, stringExtra2, (String) (r03 == null ? null : r03.A00), getIntent().getStringExtra("extra_payee_name"), (String) null);
                                return;
                            }
                        }
                    } else {
                        throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.payments.IndiaUpiMethodData");
                    }
                }
            } else if (r4 != null) {
                String str7 = r4.A0B;
                C35301lh r04 = this.A03;
                if (r04 == null) {
                    throw C18450wi.A03("seqNumber");
                }
                String str8 = (String) r04.A00;
                C39901tF r1 = r4.A08;
                if (r1 instanceof C111805hR) {
                    r9 = (C111805hR) r1;
                }
                switch (str3.hashCode()) {
                    case -2131583866:
                        if (str3.equals("change_pin")) {
                            i2 = 2;
                            break;
                        }
                        break;
                    case 110760:
                        break;
                    case 74085029:
                        str4 = "check_balance";
                        break;
                    case 398918110:
                        str4 = "check_pin";
                        break;
                    case 1985322040:
                        if (str3.equals("set_pin")) {
                            i2 = 1;
                            break;
                        }
                        break;
                }
                if (str3.equals(str4)) {
                    i2 = 3;
                    C35301lh r05 = r4.A09;
                    A3g(r9, str2, str7, str8, (String) (r05 == null ? null : r05.A00), i2);
                    return;
                }
                throw AnonymousClass000.A0T("Unexpected pin operation");
            }
            throw C18450wi.A03("paymentBankAccount");
        }
        AnonymousClass2HJ r06 = r20;
        if (r20 != null && !C1200960h.A02(this, "upi-list-keys", r06.A00, false)) {
            if (this.A06.A07("upi-list-keys")) {
                this.A0C.A0E();
                Ac1();
                Afq(R.string.str1102);
                this.A0A.A00();
                return;
            }
            AnonymousClass1Vo r2 = this.A0A;
            StringBuilder A0r = AnonymousClass000.A0r("onListKeys: ");
            A0r.append(str == null ? null : Integer.valueOf(str2.length()));
            r2.A06(AnonymousClass000.A0h(" failed; ; showErrorAndFinish", A0r));
            A3b();
        }
    }

    public void AX5(AnonymousClass2HJ r2) {
        throw C14530pL.A0S();
    }

    public void onCreate(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (this.A00 != null) {
            AnonymousClass4QN r0 = new AnonymousClass4QN(this);
            this.A04 = r0;
            if (r0.A00(bundle2)) {
                Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_bank_account");
                C18450wi.A0F(parcelableExtra);
                C18450wi.A0B(parcelableExtra);
                this.A02 = (C35521m4) parcelableExtra;
                String stringExtra = getIntent().getStringExtra("extra_india_upi_pin_op");
                C18450wi.A0F(stringExtra);
                C18450wi.A0B(stringExtra);
                this.A09 = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_fds_manager_id");
                C18450wi.A0F(stringExtra2);
                C18450wi.A0B(stringExtra2);
                this.A08 = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("extra_fcs_observer_id");
                C18450wi.A0F(stringExtra3);
                C18450wi.A0B(stringExtra3);
                C51002ao r02 = this.A01;
                if (r02 != null) {
                    C86074Rc r03 = new C86074Rc(this.A0B, (C20180zd) r02.A00.A03.APJ.get(), stringExtra3, "native_flow_npci_common_library");
                    this.A05 = r03;
                    r03.A00();
                    C14710pd r21 = this.A0C;
                    C17190ug r15 = this.A0H;
                    C18280wR r14 = this.A0C;
                    C18290wS r13 = this.A0P;
                    AnonymousClass175 r12 = this.A0I;
                    C119365wy r11 = this.A0B;
                    C18310wU r10 = this.A0M;
                    C118805vH r9 = this.A08;
                    AnonymousClass173 r8 = this.A02;
                    AnonymousClass174 r7 = this.A0N;
                    AnonymousClass61W r6 = this.A0E;
                    C18260wP r4 = this.A07;
                    C18340wX r3 = this.A0K;
                    AnonymousClass60V r2 = this.A0C;
                    C119365wy r23 = r11;
                    AnonymousClass60V r24 = r2;
                    AnonymousClass175 r25 = r12;
                    C18340wX r26 = r3;
                    C18260wP r19 = r4;
                    AnonymousClass173 r20 = r8;
                    C17190ug r22 = r15;
                    this.A0A = new C112325iJ(this, this.A05, this.A01, r19, r20, r21, r22, r23, r24, r25, r26, r10, r7, r13, r9, this, r6, this.A0F, r14);
                    this.A03 = new C35301lh(new C53852gP(), String.class, A3F(r2.A07()), "upiSequenceNumber");
                    A2h(getString(R.string.str13db));
                    this.A0A.A00();
                    return;
                }
                str = "fcsResourceExecutionCallbackHandlerFactory";
            } else {
                return;
            }
        } else {
            str = "fcsActivityLifecycleManagerFactory";
        }
        throw C18450wi.A03(str);
    }

    public Dialog onCreateDialog(int i2) {
        Dialog create;
        int i3 = i2;
        if (i2 != 27) {
            if (i2 != 28) {
                switch (i2) {
                    case 10:
                        create = A3U(new AnonymousClass55I(this), getString(R.string.str18bf), getString(R.string.str18be), i3, R.string.str1161, R.string.str0394);
                        break;
                    case 11:
                        break;
                    case 12:
                        create = A3U(new AnonymousClass55H(this), getString(R.string.str18c1), getString(R.string.str18c0), i3, R.string.str1cf6, R.string.str0e87);
                        break;
                    default:
                        create = super.onCreateDialog(i2);
                        break;
                }
            }
            C35521m4 r0 = this.A02;
            if (r0 == null) {
                throw C18450wi.A03("paymentBankAccount");
            }
            create = A3S(r0, i2);
        } else {
            C32241fu A002 = C32241fu.A00(this);
            A002.A01(R.string.str044c);
            A002.A02(R.string.str044d);
            C13680ns.A1H(A002, this, 74, R.string.str0e87);
            create = A002.create();
        }
        C18450wi.A0B(create);
        return create;
    }

    public void onDestroy() {
        super.onDestroy();
        C86074Rc r2 = this.A05;
        if (r2 != null) {
            r2.A01.A02(r2.A03).A02(C1036852i.class, r2);
        }
    }
}
