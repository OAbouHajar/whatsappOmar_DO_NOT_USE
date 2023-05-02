package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass1ZW;
import X.C110105dW;
import X.C111425gA;
import X.C114035n1;
import X.C119735yx;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrazilPaymentDPOActivity extends C111425gA {
    public C114035n1 A00;
    public List A01;
    public boolean A02;

    public BrazilPaymentDPOActivity() {
        this(0);
    }

    public BrazilPaymentDPOActivity(int i2) {
        this.A02 = false;
        C110105dW.A0t(this, 24);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A00 = (C114035n1) A0C.A06.get();
        }
    }

    public void A35() {
        super.A35();
        AnonymousClass00T.A05(this, R.id.warning).setVisibility(8);
        this.A05.setVisibility(8);
        AnonymousClass00T.A05(this, R.id.conditions_container).setVisibility(0);
        TextView textView = (TextView) AnonymousClass00T.A05(this, R.id.condition_relocated_checkbox);
        textView.setText(R.string.str145f);
        TextView textView2 = (TextView) AnonymousClass00T.A05(this, R.id.condition_travelled_checkbox);
        textView2.setText(R.string.str1460);
        TextView textView3 = (TextView) AnonymousClass00T.A05(this, R.id.condition_foreign_method_checkbox);
        textView3.setText(R.string.str145e);
        Object[] objArr = new CheckBox[3];
        C13690nt.A1L(textView, textView2, objArr);
        objArr[2] = textView3;
        List<TextView> asList = Arrays.asList(objArr);
        this.A01 = asList;
        C114035n1 r2 = this.A00;
        ArrayList A0u = AnonymousClass000.A0u();
        for (TextView text : asList) {
            A0u.add(text.getText().toString());
        }
        r2.A06.A01("list_of_conditions", AnonymousClass1ZW.A0B("|", (CharSequence[]) A0u.toArray(new String[0])));
        for (CompoundButton onCheckedChangeListener : this.A01) {
            onCheckedChangeListener.setOnCheckedChangeListener(new C119735yx(this));
        }
        C110105dW.A0r(this.A01, this, 16);
    }
}
