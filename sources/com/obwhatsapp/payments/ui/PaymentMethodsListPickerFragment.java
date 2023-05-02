package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass173;
import X.AnonymousClass1GP;
import X.AnonymousClass4PY;
import X.AnonymousClass68Z;
import X.C004601z;
import X.C110105dW;
import X.C110335du;
import X.C119405xi;
import X.C119725yw;
import X.C1223069b;
import X.C1223669h;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14870pt;
import X.C18290wS;
import X.C30671cl;
import X.C39901tF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.IDxAObserverShape92S0100000_3_I1;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

public class PaymentMethodsListPickerFragment extends Hilt_PaymentMethodsListPickerFragment implements C1223669h {
    public C14870pt A00;
    public AnonymousClass013 A01;
    public AnonymousClass173 A02;
    public AnonymousClass4PY A03 = new IDxAObserverShape92S0100000_3_I1(this, 4);
    public AnonymousClass1GP A04;
    public C18290wS A05;
    public AnonymousClass68Z A06;
    public C110335du A07;
    public C1223069b A08;

    public static PaymentMethodsListPickerFragment A01(List list) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = new PaymentMethodsListPickerFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelableArrayList("arg_methods", C13680ns.A0n(list));
        paymentMethodsListPickerFragment.A0T(A0D);
        return paymentMethodsListPickerFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout045c);
    }

    public void A12() {
        super.A12();
        this.A04.A03(this.A03);
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A04.A02(this.A03);
    }

    public void A18(Bundle bundle, View view) {
        View view2;
        View A9o;
        ArrayList parcelableArrayList = A04().getParcelableArrayList("arg_methods");
        AnonymousClass00B.A06(parcelableArrayList);
        ListView listView = (ListView) view.findViewById(R.id.methods_list);
        C1223069b r1 = this.A08;
        if (r1 != null) {
            r1.AEi(A05(), (ViewGroup) null);
        }
        C110335du r0 = new C110335du(view.getContext(), this.A01, this.A05, this);
        this.A07 = r0;
        r0.A02 = parcelableArrayList;
        r0.notifyDataSetChanged();
        listView.setAdapter(this.A07);
        if (this.A08 != null) {
            view2 = A05().inflate(R.layout.layout0064, (ViewGroup) null);
            C110105dW.A0q(view2, R.id.add_new_account_icon, AnonymousClass00T.A00(view.getContext(), R.color.color070f));
            C13690nt.A0s(view.getContext(), C13680ns.A0L(view2, R.id.add_new_account_text), R.string.str10e1);
            listView.addFooterView(view2);
        } else {
            view2 = null;
        }
        ViewGroup A072 = C13700nu.A07(view, R.id.additional_bottom_row);
        C1223069b r12 = this.A08;
        if (!(r12 == null || (A9o = r12.A9o(A05(), (ViewGroup) null)) == null)) {
            A072.addView(A9o);
            C110105dW.A0r(A072, this, 90);
        }
        if (this.A08 != null) {
            FrameLayout frameLayout = (FrameLayout) C004601z.A0E(view, R.id.footer_view);
            View ACM = this.A08.ACM(A05(), frameLayout);
            if (ACM != null) {
                frameLayout.setVisibility(0);
                frameLayout.addView(ACM);
            } else {
                frameLayout.setVisibility(8);
            }
        }
        listView.setOnItemClickListener(new C119725yw(view2, listView, this));
        View findViewById = view.findViewById(R.id.back);
        findViewById.setVisibility(0);
        C110105dW.A0r(findViewById, this, 89);
        View findViewById2 = view.findViewById(R.id.icon_lock);
        C1223069b r02 = this.A08;
        if (r02 == null || r02.AfP()) {
            findViewById2.setVisibility(0);
        } else {
            findViewById2.setVisibility(4);
        }
    }

    public int ADe(C30671cl r2) {
        C1223069b r0 = this.A08;
        if (r0 != null) {
            return r0.ADe(r2);
        }
        return 0;
    }

    public String ADf(C30671cl r2) {
        return null;
    }

    public String ADh(C30671cl r4) {
        C1223069b r0 = this.A08;
        if (r0 != null) {
            String ADh = r0.ADh(r4);
            if (!TextUtils.isEmpty(ADh)) {
                return ADh;
            }
        }
        C39901tF r02 = r4.A08;
        AnonymousClass00B.A06(r02);
        return !r02.A09() ? A0J(R.string.str0f80) : C119405xi.A03(A02(), r4) != null ? C119405xi.A03(A02(), r4) : "";
    }

    public String ADi(C30671cl r2) {
        C1223069b r0 = this.A08;
        if (r0 != null) {
            return r0.ADi(r2);
        }
        return null;
    }

    public boolean AfB(C30671cl r3) {
        C1223069b r0 = this.A08;
        return r0 == null || r0.AfB(r3);
    }

    public boolean AfI() {
        return true;
    }

    public boolean AfL() {
        C1223069b r0 = this.A08;
        return r0 != null && r0.AfL();
    }

    public void AfY(C30671cl r2, PaymentMethodRow paymentMethodRow) {
        C1223069b r0 = this.A08;
        if (r0 != null) {
            r0.AfY(r2, paymentMethodRow);
        }
    }
}
