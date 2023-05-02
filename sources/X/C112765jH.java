package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxNConsumerShape19S0300000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.obwhatsapp.payments.ui.PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0;
import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.obwhatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.obwhatsapp.payments.ui.widget.PaymentView$$ExternalSyntheticLambda7;
import com.obwhatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5jH  reason: invalid class name and case insensitive filesystem */
public abstract class C112765jH extends C111345g2 implements C1224069l {
    public int A00;
    public int A01 = 6;
    public long A02;
    public Bundle A03;
    public AnonymousClass1WD A04;
    public AnonymousClass1N0 A05;
    public C19230xz A06;
    public C16980tz A07;
    public C216114t A08;
    public C16460t6 A09;
    public C16010sH A0A;
    public C35511m3 A0B;
    public C35361lo A0C;
    public C18080w7 A0D;
    public C15830rv A0E;
    public UserJid A0F;
    public UserJid A0G;
    public C17190ug A0H;
    public AnonymousClass175 A0I;
    public C114415nj A0J;
    public C18340wX A0K;
    public C18490wm A0L;
    public C18310wU A0M;
    public AnonymousClass174 A0N;
    public C18090w8 A0O;
    public C18290wS A0P;
    public C118365uZ A0Q;
    public C118315uU A0R;
    public C18270wQ A0S;
    public AnonymousClass1GO A0T;
    public C53322fW A0U;
    public AnonymousClass5xV A0V;
    public C118405ud A0W;
    public PaymentIncentiveViewModel A0X;
    public C117745tU A0Y;
    public AnonymousClass1DY A0Z;
    public AnonymousClass3H7 A0a;
    public C222617g A0b;
    public C34151jm A0c;
    public AnonymousClass1MF A0d;
    public Integer A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public List A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;

    public static void A22(C14530pL r5, C1222969a r6, C53322fW r7, int i2) {
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(r5.A05, (C28401Vy) null, r7, (String) null, true), r6, Integer.valueOf(i2), "new_payment", (String) null, 1);
    }

    public static boolean A23(C112765jH r1) {
        return "p2m".equals(r1.A0n);
    }

    public PaymentView A35() {
        if (!(this instanceof AnonymousClass5ko)) {
            return ((BrazilPaymentActivity) this).A0W;
        }
        AnonymousClass5ko r1 = (AnonymousClass5ko) this;
        if (r1 instanceof C112825ja) {
            return ((C112825ja) r1).A0X;
        }
        return null;
    }

    public C30581cc A36(String str, List list) {
        UserJid userJid;
        C222617g r3 = this.A0b;
        C15830rv r5 = this.A0E;
        AnonymousClass00B.A06(r5);
        long j2 = this.A02;
        C30581cc A042 = r3.A04((AnonymousClass1ZR) null, r5, j2 != 0 ? this.A09.A0K.A00(j2) : null, (C30771cv) null, str, list, 0, false, false);
        if (C16030sJ.A0L(this.A0E) && (userJid = this.A0G) != null) {
            A042.A0b(userJid);
        }
        return A042;
    }

    public void A37(int i2) {
        Intent A0v;
        boolean z2 = this instanceof BrazilSmbPaymentActivity;
        C15830rv r1 = this.A0E;
        if (z2) {
            if (r1 != null) {
                A0v = new C14750ph().A0v(this, this.A08.A01(r1));
                AnonymousClass22U.A00(A0v, "BrazilSmbPaymentActivity");
                A0v.putExtra("show_keyboard", false);
                A0v.putExtra("start_t", SystemClock.uptimeMillis());
                if (i2 == 1) {
                    A0v.putExtra("extra_merchant_upsell_enabled", true);
                }
            }
            finish();
        }
        if (r1 != null) {
            A0v = new C14750ph().A0v(this, this.A08.A01(r1));
            AnonymousClass22U.A00(A0v, "BasePaymentsActivity");
            A0v.putExtra("show_keyboard", false);
            A0v.putExtra("start_t", SystemClock.uptimeMillis());
        }
        finish();
        this.A0Z.A00();
        A2V(A0v);
        finish();
    }

    public void A38(Bundle bundle) {
        C16010sH r0;
        C35511m3 A052;
        if (!(this instanceof AnonymousClass5ko)) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this;
            if (brazilPaymentActivity instanceof BrazilOrderDetailsActivity) {
                BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) brazilPaymentActivity;
                brazilOrderDetailsActivity.A0J = brazilOrderDetailsActivity.getIntent().getBooleanExtra("extra_is_quick_buy", false);
                brazilOrderDetailsActivity.A07 = (PaymentCheckoutOrderDetailsViewV2) LayoutInflater.from(brazilOrderDetailsActivity).inflate(R.layout.layout0100, (ViewGroup) null, false);
                C005402i x2 = brazilOrderDetailsActivity.x();
                if (!brazilOrderDetailsActivity.A0J) {
                    brazilOrderDetailsActivity.setContentView((View) brazilOrderDetailsActivity.A07);
                    if (x2 != null) {
                        x2.A0N(true);
                    }
                } else if (x2 != null) {
                    x2.A06();
                }
                brazilOrderDetailsActivity.A0G = brazilOrderDetailsActivity.getIntent().getStringExtra("extra_order_id");
                brazilOrderDetailsActivity.A0H = brazilOrderDetailsActivity.getIntent().getStringExtra("extra_payment_config_id");
                brazilOrderDetailsActivity.A00 = brazilOrderDetailsActivity.getIntent().getLongExtra("extra_order_expiry_ts_in_sec", 0);
                C28381Vw A022 = AnonymousClass1yL.A02(brazilOrderDetailsActivity.getIntent());
                AnonymousClass00B.A06(A022);
                brazilOrderDetailsActivity.A0D = A022;
                C16440t3 r6 = brazilOrderDetailsActivity.A05;
                C14710pd r9 = brazilOrderDetailsActivity.A0C;
                C17110uY r14 = brazilOrderDetailsActivity.A0b;
                Resources resources = brazilOrderDetailsActivity.getResources();
                C218315p r13 = brazilOrderDetailsActivity.A0C;
                AnonymousClass013 r7 = brazilOrderDetailsActivity.A04;
                C18290wS r11 = brazilOrderDetailsActivity.A0P;
                C114235nP r3 = new C114235nP(resources, brazilOrderDetailsActivity.A01, r6, r7, brazilOrderDetailsActivity.A08, r9, brazilOrderDetailsActivity.A0O, r11, brazilOrderDetailsActivity, r13, r14);
                brazilOrderDetailsActivity.A05 = r3;
                C118395uc r2 = new C118395uc(brazilOrderDetailsActivity.A03, brazilOrderDetailsActivity, r3, brazilOrderDetailsActivity.A05);
                brazilOrderDetailsActivity.A06 = r2;
                brazilOrderDetailsActivity.A06.A00(new PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0(r2));
                C16440t3 r22 = brazilOrderDetailsActivity.A05;
                C14710pd r4 = brazilOrderDetailsActivity.A0C;
                C16320sq r92 = brazilOrderDetailsActivity.A05;
                C19150xq r32 = brazilOrderDetailsActivity.A02;
                brazilOrderDetailsActivity.A09 = (C110715ei) new C006602z((AnonymousClass04o) new AnonymousClass5z5(brazilOrderDetailsActivity.A01, r22, r32, r4, brazilOrderDetailsActivity.A0G, brazilOrderDetailsActivity.A0F, brazilOrderDetailsActivity.A08, brazilOrderDetailsActivity.A0D, r92, true), (C001500q) brazilOrderDetailsActivity).A01(C110715ei.class);
                Bundle bundle2 = bundle;
                if (bundle == null || bundle2.getBundle("save_order_detail_state_key") == null) {
                    brazilOrderDetailsActivity.A09.A05();
                } else {
                    brazilOrderDetailsActivity.A09.A06(bundle2);
                }
                C110105dW.A0x(brazilOrderDetailsActivity, brazilOrderDetailsActivity.A09.A02, 3);
                return;
            }
            C005402i x3 = brazilPaymentActivity.x();
            if (x3 != null) {
                Context context = brazilPaymentActivity.A01;
                boolean z2 = brazilPaymentActivity.A0r;
                int i2 = R.string.str0ddf;
                if (z2) {
                    i2 = R.string.str10c7;
                }
                x3.A0J(context.getString(i2));
                x3.A0N(true);
                if (!brazilPaymentActivity.A0r) {
                    x3.A08(0.0f);
                }
            }
            brazilPaymentActivity.setContentView((int) R.layout.layout0541);
            PaymentView paymentView = (PaymentView) brazilPaymentActivity.findViewById(R.id.payment_view);
            brazilPaymentActivity.A0W = paymentView;
            paymentView.A0s = brazilPaymentActivity;
            brazilPaymentActivity.getLifecycle().A00(new PaymentView$$ExternalSyntheticLambda7(paymentView));
            Intent intent = brazilPaymentActivity.getIntent();
            if (intent != null) {
                brazilPaymentActivity.A0c = intent.getStringExtra("referral_screen");
            }
            C216114t r1 = brazilPaymentActivity.A08;
            UserJid userJid = brazilPaymentActivity.A0G;
            AnonymousClass00B.A06(userJid);
            brazilPaymentActivity.A0A = r1.A01(userJid);
            C35511m3 A053 = C110115dX.A0H(brazilPaymentActivity.A0P).A05(brazilPaymentActivity.A0G);
            brazilPaymentActivity.A0B = A053;
            if (A053 == null || A053.A05 == null) {
                brazilPaymentActivity.A05.Acl(new C1209563q(brazilPaymentActivity));
            }
            PaymentView paymentView2 = brazilPaymentActivity.A0W;
            C16010sH r23 = brazilPaymentActivity.A0A;
            String A082 = brazilPaymentActivity.A03.A08(r23);
            paymentView2.A1F = A082;
            paymentView2.A0G.setText(A082);
            paymentView2.A06.setVisibility(8);
            paymentView2.A0X.A06(paymentView2.A0V, r23);
            if (brazilPaymentActivity.A0O.A0A()) {
                UserJid userJid2 = brazilPaymentActivity.A0G;
                if (brazilPaymentActivity.A0O.A08() && (A052 = C110115dX.A0H(brazilPaymentActivity.A0P).A05(userJid2)) != null && A052.A01 < brazilPaymentActivity.A05.A00()) {
                    C114415nj r02 = brazilPaymentActivity.A0J;
                    if (r02 != null) {
                        r02.A06(true);
                    }
                    C114415nj r12 = new C114415nj(brazilPaymentActivity.A06, userJid2, brazilPaymentActivity.A0P);
                    brazilPaymentActivity.A0J = r12;
                    C13680ns.A1U(r12, brazilPaymentActivity.A05);
                }
            }
            if (brazilPaymentActivity.A0O.A04() && (r0 = brazilPaymentActivity.A0A) != null && r0.A0H()) {
                AnonymousClass1WD r24 = new AnonymousClass1WD();
                brazilPaymentActivity.A05.Acl(new AnonymousClass65N(r24, brazilPaymentActivity));
                brazilPaymentActivity.A04 = r24;
            }
            if (!C110115dX.A18(brazilPaymentActivity.A0C) || brazilPaymentActivity.A0C.A0C(979)) {
                AnonymousClass5xP.A02(AnonymousClass5xP.A00(brazilPaymentActivity.A05, (C28401Vy) null, brazilPaymentActivity.A0U, (String) null, true), brazilPaymentActivity.A0L, "new_payment", brazilPaymentActivity.A0c);
                return;
            }
            brazilPaymentActivity.A3C(brazilPaymentActivity.A0G);
        }
    }

    public void A39(Bundle bundle) {
        Intent A042 = C110105dW.A04(this, PaymentGroupParticipantPickerActivity.class);
        C15830rv r0 = this.A0E;
        AnonymousClass00B.A06(r0);
        A042.putExtra("extra_jid", r0.getRawString());
        if (bundle != null) {
            A042.putExtras(bundle);
        }
        startActivity(A042);
        finish();
    }

    public void A3A(C28401Vy r14) {
        PaymentView A35 = A35();
        if (A35 != null) {
            PaymentView A352 = A35();
            if (A352 == null || A352.getStickerIfSelected() == null) {
                this.A05.Acl(new AnonymousClass66L(r14, this, A35));
                A37(1);
                return;
            }
            Afq(R.string.str13db);
            C18270wQ r6 = this.A0S;
            AnonymousClass00B.A04(A35);
            C34151jm stickerIfSelected = A35.getStickerIfSelected();
            AnonymousClass00B.A06(stickerIfSelected);
            C15830rv r8 = this.A0E;
            AnonymousClass00B.A06(r8);
            UserJid userJid = this.A0G;
            long j2 = this.A02;
            r6.A01(A35.getPaymentBackground(), r8, userJid, j2 != 0 ? this.A09.A0K.A00(j2) : null, stickerIfSelected, A35.getStickerSendOrigin()).A01(new IDxNConsumerShape19S0300000_3_I1(A35, r14, this, 0), this.A05.A06);
        }
    }

    public void A3B(AnonymousClass1W2 r4) {
        PaymentIncentiveViewModel paymentIncentiveViewModel;
        AnonymousClass5xI r0;
        C53322fW r02;
        C53302fU r03;
        if (C110115dX.A18(this.A0C) && (paymentIncentiveViewModel = this.A0X) != null && (r0 = (AnonymousClass5xI) paymentIncentiveViewModel.A02.A01()) != null && (r02 = (C53322fW) r0.A01) != null && (r03 = r02.A01) != null) {
            r4.A00 = new C35471lz(String.valueOf(r03.A08.A01), (String) null, (String) null, (String) null);
        }
    }

    public void A3C(UserJid userJid) {
        if (this.A0X == null) {
            PaymentIncentiveViewModel A0R2 = C110105dW.A0R(this);
            this.A0X = A0R2;
            if (A0R2 != null) {
                C110105dW.A0x(this, A0R2.A00, 0);
                C110105dW.A0x(this, this.A0X.A02, 1);
            }
        }
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0X;
        if (paymentIncentiveViewModel != null) {
            paymentIncentiveViewModel.A07.Acl(new AnonymousClass662(paymentIncentiveViewModel, false));
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0X;
            paymentIncentiveViewModel2.A07.Acl(new AnonymousClass661(userJid, paymentIncentiveViewModel2));
        }
    }

    public void A3D(C1222969a r7, C53322fW r8) {
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(this.A05, (C28401Vy) null, r8, (String) null, true), r7, 50, "new_payment", (String) null, 2);
    }

    public void A3E(String str) {
        int i2;
        PaymentView A35 = A35();
        if (A35 != null) {
            TextView A0M2 = C13680ns.A0M(A35, R.id.gift_tool_tip);
            if (C110115dX.A17(A35.A0p.A01(), "payment_incentive_tooltip_viewed") || A0M2 == null || str == null) {
                i2 = 8;
            } else {
                A0M2.setText(str);
                i2 = 0;
            }
            A0M2.setVisibility(i2);
            int i3 = this.A01;
            A35.A01 = i3;
            FrameLayout frameLayout = A35.A05;
            if (i3 != 0) {
                frameLayout.setVisibility(8);
                return;
            }
            frameLayout.setVisibility(0);
            C13680ns.A0z(C110105dW.A06(A35.A0p), "payment_incentive_tooltip_viewed", true);
        }
    }

    public void AUl(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0a.A02(pickerSearchDialogFragment);
    }

    public void Afa(DialogFragment dialogFragment) {
        Afc(dialogFragment);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1001) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            this.A0G = UserJid.getNullable(intent.getStringExtra("extra_receiver_jid"));
            A38(this.A03);
        } else if (i3 == 0 && this.A0G == null) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        C228919r AEp;
        super.onCreate(bundle);
        this.A03 = bundle;
        if (getIntent() != null) {
            this.A00 = getIntent().getIntExtra("extra_conversation_message_type", 0);
            this.A0E = C15830rv.A02(getIntent().getStringExtra("extra_jid"));
            this.A0G = UserJid.getNullable(getIntent().getStringExtra("extra_receiver_jid"));
            getIntent().getStringExtra("extra_tpp_transaction_request_id");
            this.A02 = getIntent().getLongExtra("extra_quoted_msg_row_id", 0);
            this.A0i = getIntent().getStringExtra("extra_payment_preset_amount");
            this.A0m = getIntent().getStringExtra("extra_transaction_id");
            this.A0k = getIntent().getStringExtra("extra_payment_preset_min_amount");
            this.A0j = getIntent().getStringExtra("extra_payment_preset_max_amount");
            this.A0l = getIntent().getStringExtra("extra_request_message_key");
            this.A0r = getIntent().getBooleanExtra("extra_is_pay_money_only", true);
            this.A0h = getIntent().getStringExtra("extra_payment_note");
            this.A0C = (C35361lo) getIntent().getParcelableExtra("extra_payment_background");
            this.A0c = (C34151jm) getIntent().getParcelableExtra("extra_payment_sticker");
            int intExtra = getIntent().getIntExtra("extra_payment_sticker_send_origin", -1);
            this.A0e = intExtra != -1 ? Integer.valueOf(intExtra) : null;
            this.A0p = C16030sJ.A08(UserJid.class, getIntent().getStringArrayListExtra("extra_mentioned_jids"));
            this.A0F = UserJid.getNullable(getIntent().getStringExtra("extra_inviter_jid"));
            String stringExtra = getIntent().getStringExtra("extra_transaction_type");
            if (stringExtra == null) {
                stringExtra = "p2p";
            }
            this.A0n = stringExtra;
            this.A0o = getIntent().getStringExtra("extra_transaction_token");
            this.A0q = getIntent().getBooleanExtra("extra_transaction_is_merchant", false);
            this.A0s = getIntent().getBooleanExtra("extra_transaction_is_valid_merchant", false);
            this.A0g = getIntent().getStringExtra("extra_order_type");
            this.A0f = getIntent().getStringExtra("extra_payment_config_id");
        }
        String str = null;
        C28391Vx A022 = this.A0N.A01() != null ? this.A0P.A02(this.A0N.A01().A03) : null;
        C28411Vz A002 = this.A0N.A00();
        if (A002 != null) {
            str = ((C35491m1) A002).A04;
        }
        if (A022 != null && (AEp = A022.AEp(str)) != null && AEp.AfD()) {
            this.A05.A0D("payment_view");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C114415nj r1 = this.A0J;
        if (r1 != null) {
            r1.A06(true);
            this.A0J = null;
        }
    }
}
