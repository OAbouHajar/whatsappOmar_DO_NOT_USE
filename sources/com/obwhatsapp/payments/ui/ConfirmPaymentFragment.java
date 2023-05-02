package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass173;
import X.AnonymousClass68Z;
import X.AnonymousClass69Z;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C119405xi;
import X.C1223169c;
import X.C13680ns;
import X.C13690nt;
import X.C18090w8;
import X.C18290wS;
import X.C30671cl;
import X.C35511m3;
import X.C39891tE;
import X.C39901tF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.jid.UserJid;

public class ConfirmPaymentFragment extends Hilt_ConfirmPaymentFragment implements AnonymousClass68Z {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public Button A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public ProgressBar A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public WaImageView A0D;
    public AnonymousClass01V A0E;
    public AnonymousClass013 A0F;
    public C35511m3 A0G;
    public AnonymousClass173 A0H;
    public C30671cl A0I;
    public C18090w8 A0J;
    public C18290wS A0K;
    public C1223169c A0L;
    public AnonymousClass69Z A0M;
    public PaymentMethodRow A0N;
    public String A0O;

    public static ConfirmPaymentFragment A01(C30671cl r4, UserJid userJid, String str, int i2) {
        ConfirmPaymentFragment confirmPaymentFragment = new ConfirmPaymentFragment();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putParcelable("arg_payment_method", r4);
        if (userJid != null) {
            A0D2.putString("arg_jid", userJid.getRawString());
        }
        A0D2.putInt("arg_payment_type", i2);
        A0D2.putString("arg_transaction_type", str);
        confirmPaymentFragment.A0T(A0D2);
        return confirmPaymentFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2 = 0;
        View inflate = layoutInflater.inflate(R.layout.layout0120, viewGroup, false);
        this.A08 = (FrameLayout) inflate.findViewById(R.id.title_view);
        this.A0N = (PaymentMethodRow) inflate.findViewById(R.id.payment_method_row);
        this.A05 = C13690nt.A0K(inflate, R.id.transaction_description_container);
        this.A06 = (Button) inflate.findViewById(R.id.confirm_payment);
        this.A07 = (FrameLayout) C004601z.A0E(inflate, R.id.footer_view);
        this.A0A = C13680ns.A0M(inflate, R.id.education);
        this.A09 = (ProgressBar) inflate.findViewById(R.id.confirm_payment_progressbar);
        this.A02 = C004601z.A0E(inflate, R.id.education_divider);
        inflate.findViewById(R.id.account_number_divider).setVisibility(8);
        C13690nt.A13(inflate, R.id.payment_method_account_id, 8);
        C30671cl r5 = this.A0I;
        C39901tF r3 = r5.A08;
        if ((r3 instanceof C39891tE) && r5.A04() == 6 && "p2p".equals(this.A0O)) {
            ((C39891tE) r3).A03 = 1;
        }
        AUY(r5);
        this.A04 = inflate.findViewById(R.id.payment_to_merchant_options_container);
        this.A0C = C13680ns.A0M(inflate, R.id.payment_to_merchant_options);
        this.A0D = (WaImageView) inflate.findViewById(R.id.payment_to_merchant_options_icon);
        this.A03 = inflate.findViewById(R.id.payment_rails_container);
        this.A0B = C13680ns.A0M(inflate, R.id.payment_rails_label);
        AnonymousClass01A r32 = this.A0D;
        C110105dW.A0s(inflate.findViewById(R.id.payment_method_container), r32, this, 5);
        C110105dW.A0s(this.A05, r32, this, 6);
        C110105dW.A0s(inflate.findViewById(R.id.payment_to_merchant_options_container), r32, this, 3);
        C110105dW.A0s(inflate.findViewById(R.id.payment_rails_container), r32, this, 4);
        if (this.A0L != null) {
            ViewGroup A0K2 = C13690nt.A0K(inflate, R.id.contact_info_view);
            if (A0K2 != null) {
                this.A0L.AMi(A0K2);
            }
            ViewGroup viewGroup2 = this.A05;
            if (viewGroup2 != null) {
                this.A0L.AMf(viewGroup2);
            }
            View findViewById = inflate.findViewById(R.id.payment_method_container);
            if (findViewById != null) {
                if (!this.A0L.Afl()) {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
            }
            View findViewById2 = inflate.findViewById(R.id.transaction_amount_info_view);
            if (findViewById2 != null) {
                C110105dW.A0s(findViewById2, r32, this, 2);
            }
            ViewGroup A0K3 = C13690nt.A0K(inflate, R.id.extra_info_view);
            if (A0K3 != null) {
                this.A0L.A5E(A0K3);
            }
        }
        return inflate;
    }

    public void A13() {
        super.A13();
        this.A07 = null;
    }

    public void A14() {
        C1223169c r0;
        super.A14();
        UserJid nullable = UserJid.getNullable(A04().getString("arg_jid"));
        this.A0G = nullable != null ? C110115dX.A0H(this.A0K).A05(nullable) : null;
        int A042 = this.A0I.A04();
        View view = this.A03;
        if (A042 == 6) {
            view.setVisibility(0);
            if (this.A0I.A08 != null) {
                int i2 = this.A00;
                TextView textView = this.A0B;
                int i3 = R.string.str0f9a;
                if (i2 == 0) {
                    i3 = R.string.str0f98;
                }
                textView.setText(i3);
            }
        } else {
            view.setVisibility(8);
        }
        if (this.A0J.A0A() && (r0 = this.A0L) != null && r0.AJN()) {
            A1A(this.A01);
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        Parcelable parcelable = A04().getParcelable("arg_payment_method");
        AnonymousClass00B.A06(parcelable);
        this.A0I = (C30671cl) parcelable;
        int i2 = A04().getInt("arg_payment_type");
        AnonymousClass00B.A06(Integer.valueOf(i2));
        this.A01 = i2;
        String string = A04().getString("arg_transaction_type");
        AnonymousClass00B.A06(string);
        this.A0O = string;
    }

    public void A1A(int i2) {
        WaImageView waImageView;
        int i3;
        this.A01 = i2;
        this.A04.setVisibility(0);
        TextView textView = this.A0C;
        if (i2 == 0) {
            textView.setText(R.string.str032b);
            waImageView = this.A0D;
            i3 = R.drawable.cart;
        } else {
            textView.setText(R.string.str1511);
            waImageView = this.A0D;
            i3 = R.drawable.ic_contacts_storage_usage;
        }
        waImageView.setImageResource(i3);
        AnonymousClass69Z r0 = this.A0M;
        if (r0 != null) {
            r0.AUh(i2);
        }
    }

    public void AUY(C30671cl r7) {
        boolean z2;
        C39891tE r0;
        this.A0I = r7;
        C1223169c r02 = this.A0L;
        if (r02 != null) {
            z2 = r02.AfK(r7);
            if (z2) {
                String ABa = this.A0L.ABa(r7);
                if (!TextUtils.isEmpty(ABa)) {
                    this.A0N.A02.setText(ABa);
                }
            }
        } else {
            z2 = false;
        }
        this.A0N.A02.setVisibility(C13680ns.A02(z2 ? 1 : 0));
        C1223169c r03 = this.A0L;
        String str = null;
        String ABb = r03 != null ? r03.ABb(r7) : null;
        PaymentMethodRow paymentMethodRow = this.A0N;
        if (TextUtils.isEmpty(ABb)) {
            ABb = C119405xi.A05(A02(), r7, this.A0K, true);
        }
        paymentMethodRow.A05.setText(ABb);
        C1223169c r04 = this.A0L;
        if (r04 == null || (str = r04.ADg(r7)) == null) {
            C39901tF r05 = r7.A08;
            AnonymousClass00B.A06(r05);
            if (!r05.A09()) {
                str = A0J(R.string.str0f80);
            }
        }
        this.A0N.A01(str);
        C1223169c r1 = this.A0L;
        if (r1 == null || !r1.AfL()) {
            C119405xi.A08(r7, this.A0N);
        } else {
            r1.AfY(r7, this.A0N);
        }
        C1223169c r12 = this.A0L;
        if (r12 != null) {
            boolean AfC = r12.AfC(r7, this.A01);
            PaymentMethodRow paymentMethodRow2 = this.A0N;
            if (AfC) {
                paymentMethodRow2.A02(false);
                this.A0N.A01(A0J(R.string.str0f7f));
            } else {
                paymentMethodRow2.A02(true);
            }
        }
        C110105dW.A0s(this.A06, r7, this, 1);
        C1223169c r13 = this.A0L;
        this.A06.setText(r13 != null ? r13.AAl(r7, this.A01) : "");
        this.A06.setEnabled(true);
        if (r7.A04() == 6 && (r0 = (C39891tE) r7.A08) != null) {
            this.A00 = r0.A03;
        }
        C1223169c r14 = this.A0L;
        if (r14 != null) {
            r14.AMg(this.A08);
            FrameLayout frameLayout = this.A07;
            if (frameLayout != null) {
                this.A0L.ARV(frameLayout, r7);
            }
            String ABu = this.A0L.ABu(r7, this.A01);
            boolean isEmpty = TextUtils.isEmpty(ABu);
            TextView textView = this.A0A;
            if (!isEmpty) {
                textView.setText(ABu);
            } else {
                textView.setVisibility(8);
                this.A02.setVisibility(8);
            }
            this.A06.setEnabled(true);
        }
        AnonymousClass69Z r15 = this.A0M;
        if (r15 != null) {
            r15.AUZ(r7, this.A0N);
        }
    }
}
