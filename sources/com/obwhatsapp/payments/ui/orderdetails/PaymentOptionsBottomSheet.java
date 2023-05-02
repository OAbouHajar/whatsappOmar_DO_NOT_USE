package com.obwhatsapp.payments.ui.orderdetails;

import X.AnonymousClass16G;
import X.AnonymousClass2St;
import X.AnonymousClass5xP;
import X.AnonymousClass5yE;
import X.C004601z;
import X.C110105dW;
import X.C110845ev;
import X.C116225r2;
import X.C116775rv;
import X.C117405sw;
import X.C119505ya;
import X.C1220568c;
import X.C1222969a;
import X.C13680ns;
import X.C13690nt;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.List;

public class PaymentOptionsBottomSheet extends Hilt_PaymentOptionsBottomSheet {
    public RecyclerView A00;
    public AnonymousClass16G A01;
    public C1222969a A02;
    public C1220568c A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;

    public static PaymentOptionsBottomSheet A01(String str, String str2, List list, boolean z2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("selected_payment_method", str);
        A0D.putParcelableArrayList("payment_method_list", C13680ns.A0n(list));
        A0D.putString("referral_screen", str2);
        A0D.putBoolean("should_log_event", z2);
        PaymentOptionsBottomSheet paymentOptionsBottomSheet = new PaymentOptionsBottomSheet();
        paymentOptionsBottomSheet.A0T(A0D);
        return paymentOptionsBottomSheet;
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        bundle.putString("selected_payment_method", this.A05);
        bundle.putParcelableArrayList("payment_method_list", C13680ns.A0n(this.A06));
        bundle.putString("referral_screen", this.A04);
        bundle.putBoolean("should_log_event", this.A07);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0440);
    }

    public void A13() {
        super.A13();
        this.A03 = null;
    }

    public void A18(Bundle bundle, View view) {
        C117405sw r14;
        Bundle bundle2 = bundle;
        if (bundle == null) {
            this.A05 = A04().getString("selected_payment_method", "WhatsappPay");
            this.A06 = A04().getParcelableArrayList("payment_method_list");
            this.A04 = A04().getString("referral_screen");
            bundle2 = A04();
        } else {
            this.A05 = bundle2.getString("selected_payment_method", "WhatsappPay");
            this.A06 = bundle2.getParcelableArrayList("payment_method_list");
            this.A04 = bundle2.getString("referral_screen");
        }
        this.A07 = bundle2.getBoolean("should_log_event");
        View view2 = view;
        C110105dW.A0r(C004601z.A0E(view2, R.id.close), this, 112);
        C110845ev r4 = new C110845ev();
        String str = this.A05;
        List<C119505ya> list = this.A06;
        C116225r2 r0 = new C116225r2(this);
        AnonymousClass16G r15 = this.A01;
        r4.A00 = str;
        List list2 = r4.A01;
        list2.clear();
        C116775rv r12 = new C116775rv(r0, r4);
        for (C119505ya r11 : list) {
            String str2 = r11.A07;
            if ("WhatsappPay".equals(str2)) {
                r14 = new C117405sw((AnonymousClass16G) null, r11, r12, 0, "WhatsappPay".equals(str));
            } else {
                r14 = new C117405sw(r15, r11, r12, 1, str.equals(str2));
            }
            list2.add(r14);
        }
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(view2, R.id.payment_option_recycler_view);
        this.A00 = recyclerView;
        recyclerView.setAdapter(r4);
        C110105dW.A0r(C004601z.A0E(view2, R.id.continue_button), this, 113);
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setOnShowListener(new AnonymousClass5yE());
        }
        A1N((Integer) null, this.A05, 0);
    }

    public final void A1N(Integer num, String str, int i2) {
        String str2;
        if (this.A07) {
            AnonymousClass2St A0N = C110105dW.A0N();
            A0N.A01("transaction_type", "purchase");
            if ("WhatsappPay".equals(str)) {
                str2 = "native";
            } else {
                if ("CustomPaymentInstructions".equals(str)) {
                    str2 = "non-native";
                }
                AnonymousClass5xP.A01(A0N, this.A02, num, "payment_options_prompt", this.A04, i2);
            }
            A0N.A01("payment_type", str2);
            AnonymousClass5xP.A01(A0N, this.A02, num, "payment_options_prompt", this.A04, i2);
        }
    }
}
