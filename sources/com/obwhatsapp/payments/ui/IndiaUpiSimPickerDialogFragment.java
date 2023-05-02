package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass2St;
import X.AnonymousClass61W;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C1220368a;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C16040sK;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

public class IndiaUpiSimPickerDialogFragment extends Hilt_IndiaUpiSimPickerDialogFragment {
    public C16040sK A00;
    public AnonymousClass61W A01;
    public C1220368a A02;
    public List A03;

    public static /* synthetic */ void A01(RadioGroup radioGroup, IndiaUpiSimPickerDialogFragment indiaUpiSimPickerDialogFragment) {
        List list;
        indiaUpiSimPickerDialogFragment.A1C();
        if (indiaUpiSimPickerDialogFragment.A02 != null && (list = indiaUpiSimPickerDialogFragment.A03) != null) {
            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) list.get(radioGroup.getCheckedRadioButtonId());
            AnonymousClass2St A0N = C110105dW.A0N();
            A0N.A01("sim_slot_picked", String.valueOf(radioGroup.getCheckedRadioButtonId()));
            if (Build.VERSION.SDK_INT >= 22 && !TextUtils.isEmpty(subscriptionInfo.getDisplayName())) {
                A0N.A01("sim_carrier_picked", String.valueOf(subscriptionInfo.getDisplayName()));
            }
            indiaUpiSimPickerDialogFragment.A01.AKU(A0N, C13680ns.A0Y(), (Integer) null, "payments_device_binding_sim_picker", "payments_device_binding_precheck");
            indiaUpiSimPickerDialogFragment.A02.AXF(subscriptionInfo);
        }
    }

    public void A0k() {
        super.A0k();
        this.A02 = null;
    }

    public void A0q() {
        super.A0q();
        Dialog dialog = this.A03;
        if (dialog != null && dialog.getWindow() != null) {
            this.A03.getWindow().setLayout(-1, -2);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout034b);
    }

    public void A16(Context context) {
        super.A16(context);
        try {
            this.A02 = (C1220368a) A0C();
        } catch (ClassCastException e2) {
            Log.e(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("onAttach:")));
        }
    }

    public void A18(Bundle bundle, View view) {
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            this.A03 = bundle2.getParcelableArrayList("extra_subscriptions");
        }
        View view2 = view;
        C13680ns.A0L(view2, R.id.title).setText(C13690nt.A0c(this, C110115dX.A0d(this.A00), new Object[1], 0, R.string.str10f5));
        ViewGroup A07 = C13700nu.A07(view2, R.id.radio_group);
        A07.removeAllViews();
        AnonymousClass2St r12 = new AnonymousClass2St(new AnonymousClass2St[0]);
        if (this.A03 != null) {
            int i2 = 0;
            while (i2 < this.A03.size()) {
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) this.A03.get(i2);
                TextView textView = (TextView) LayoutInflater.from(A0u()).inflate(R.layout.layout034c, A07, false);
                textView.setId(i2);
                int i3 = i2 + 1;
                if (Build.VERSION.SDK_INT < 22 || TextUtils.isEmpty(subscriptionInfo.getDisplayName())) {
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1M(objArr, i3, 0);
                    textView.setText(A0K(R.string.str1624, objArr));
                } else {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1M(objArr2, i3, 0);
                    A0o.append(A0K(R.string.str1624, objArr2));
                    A0o.append(" - ");
                    textView.setText(AnonymousClass000.A0f(subscriptionInfo.getDisplayName(), A0o));
                    r12.A01(C13680ns.A0c(i2, "SIM_"), String.valueOf(subscriptionInfo.getDisplayName()));
                }
                A07.addView(textView);
                i2 = i3;
            }
            if (A07.getChildCount() > 0) {
                ((CompoundButton) A07.getChildAt(0)).setChecked(true);
            }
        }
        this.A01.AKU(r12, 0, (Integer) null, "payments_device_binding_sim_picker", "payments_device_binding_precheck");
        C110105dW.A0r(C004601z.A0E(view2, R.id.cancel_button), this, 84);
        C110105dW.A0s(C004601z.A0E(view2, R.id.confirm_button), A07, this, 16);
    }
}
