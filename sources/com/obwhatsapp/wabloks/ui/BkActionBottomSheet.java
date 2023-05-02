package com.obwhatsapp.wabloks.ui;

import X.AnonymousClass000;
import X.AnonymousClass01D;
import X.AnonymousClass2ZU;
import X.C108615Or;
import X.C110105dW;
import X.C1206362k;
import X.C13680ns;
import X.C13690nt;
import X.C20140zZ;
import X.C20180zd;
import X.C52372dh;
import X.C89924dA;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.IDxCListenerShape24S0200000_3_I1;
import java.util.List;
import java.util.Map;

public class BkActionBottomSheet extends Hilt_BkActionBottomSheet {
    public AnonymousClass2ZU A00;
    public C52372dh A01;
    public C20180zd A02;
    public AnonymousClass01D A03;
    public Map A04;

    public static BkActionBottomSheet A01(C20140zZ r5, String str, String str2, List list) {
        Bundle A0D = C13690nt.A0D();
        String A0l = AnonymousClass000.A0l(AnonymousClass000.A0r("action_sheet_buttons"), list.hashCode());
        A0D.putString("action_sheet_buttons", A0l);
        A0D.putString("action_sheet_title", str);
        A0D.putString("action_sheet_message", str2);
        A0D.putBoolean("action_sheet_has_buttons", true);
        r5.A02(new C89924dA(list), "action_sheet_buttons", A0l);
        BkActionBottomSheet bkActionBottomSheet = new BkActionBottomSheet();
        bkActionBottomSheet.A0T(A0D);
        return bkActionBottomSheet;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        List<C108615Or> list;
        C52372dh A012 = this.A02.A01(A02());
        this.A01 = A012;
        C110105dW.A1N(A012, C1206362k.class, this, 5);
        Bundle A042 = A04();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.layout0023, viewGroup, false);
        TextView A0M = C13680ns.A0M(viewGroup2, R.id.bloks_action_sheet_title);
        TextView A0M2 = C13680ns.A0M(viewGroup2, R.id.bloks_action_sheet_description);
        String string = A042.getString("action_sheet_title", "");
        String string2 = A042.getString("action_sheet_message", "");
        if (!TextUtils.isEmpty(string)) {
            A0M.setVisibility(0);
            A0M.setText(A042.getString("action_sheet_title"));
        }
        if (!TextUtils.isEmpty(string2)) {
            A0M2.setVisibility(0);
            A0M2.setText(A042.getString("action_sheet_message"));
        }
        if (A042.getBoolean("action_sheet_has_buttons")) {
            boolean z2 = A042.getBoolean("action_sheet_has_buttons", false);
            String string3 = A042.getString("action_sheet_buttons", "");
            if (!z2 || (list = (List) ((C20140zZ) this.A03.get()).A01("action_sheet_buttons", string3)) == null) {
                A1C();
            } else {
                for (C108615Or r3 : list) {
                    TextView textView = (TextView) layoutInflater.inflate(R.layout.layout0027, viewGroup, false);
                    textView.setText(r3.A9T().A0J(36));
                    textView.setOnClickListener(new IDxCListenerShape24S0200000_3_I1(r3, 1, this));
                    viewGroup2.addView(textView);
                }
            }
        }
        return viewGroup2;
    }
}
