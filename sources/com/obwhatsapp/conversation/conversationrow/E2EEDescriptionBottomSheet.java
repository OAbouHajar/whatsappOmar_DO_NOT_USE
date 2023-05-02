package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass1BL;
import X.C004601z;
import X.C16490t9;
import X.C19980zJ;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxSListenerShape246S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;

public class E2EEDescriptionBottomSheet extends Hilt_E2EEDescriptionBottomSheet {
    public static boolean A04;
    public int A00;
    public C19980zJ A01;
    public C16490t9 A02;
    public AnonymousClass1BL A03;

    public static E2EEDescriptionBottomSheet A01(int i2) {
        E2EEDescriptionBottomSheet e2EEDescriptionBottomSheet = new E2EEDescriptionBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putInt("entry_point", i2);
        e2EEDescriptionBottomSheet.A0T(bundle);
        return e2EEDescriptionBottomSheet;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout0246, viewGroup, false);
    }

    public void A18(Bundle bundle, View view) {
        int i2;
        Bundle bundle2 = this.A05;
        if (!(bundle2 == null || (i2 = bundle2.getInt("entry_point", -1)) == -1)) {
            Resources A032 = A03();
            TextView textView = (TextView) C004601z.A0E(view, R.id.e2ee_bottom_sheet_title);
            TextView textView2 = (TextView) C004601z.A0E(view, R.id.e2ee_bottom_sheet_summary);
            if (A04) {
                textView.setText(A032.getString(R.string.str0d5c));
                textView2.setText(A032.getString(R.string.str0d5b));
                View findViewById = view.findViewById(R.id.e2ee_bottom_sheet_image_item_two);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = view.findViewById(R.id.e2ee_bottom_sheet_list_item_two);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                View findViewById3 = view.findViewById(R.id.e2ee_bottom_sheet_image_item_five);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
                View findViewById4 = view.findViewById(R.id.e2ee_bottom_sheet_list_item_five);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
            } else if (8 == i2) {
                textView.setText(A032.getString(R.string.str02c2));
                textView2.setText(A032.getString(R.string.str02c1));
            }
            this.A03.A00(i2, 1);
            this.A00 = i2;
        }
        View A0E = C004601z.A0E(view, R.id.e2ee_bottom_sheet_learn_more_button);
        View A0E2 = C004601z.A0E(view, R.id.e2ee_description_close_button);
        A0E.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 37));
        A0E2.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 38));
    }

    public Dialog A1B(Bundle bundle) {
        Dialog A1B = super.A1B(bundle);
        A1B.setOnShowListener(new IDxSListenerShape246S0100000_2_I0(this, 1));
        return A1B;
    }
}
