package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass2St;
import X.AnonymousClass35O;
import X.AnonymousClass61W;
import X.AnonymousClass69F;
import X.C004601z;
import X.C110105dW;
import X.C110255dl;
import X.C119525yc;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C17020u3;
import X.C17250um;
import X.C93744jh;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.Button;

public class IndiaUpiEditTransactionDescriptionFragment extends Hilt_IndiaUpiEditTransactionDescriptionFragment {
    public C14870pt A00;
    public WaEditText A01;
    public WaTextView A02;
    public Button A03;
    public AnonymousClass01V A04;
    public AnonymousClass013 A05;
    public C17250um A06;
    public AnonymousClass61W A07;
    public AnonymousClass69F A08;
    public C17020u3 A09;
    public String A0A;

    public static IndiaUpiEditTransactionDescriptionFragment A01(String str) {
        IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment = new IndiaUpiEditTransactionDescriptionFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("arg_payment_description", str);
        indiaUpiEditTransactionDescriptionFragment.A0T(A0D);
        return indiaUpiEditTransactionDescriptionFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0311);
    }

    public void A18(Bundle bundle, View view) {
        String string = A04().getString("arg_payment_description");
        AnonymousClass00B.A06(string);
        this.A0A = string;
        C110105dW.A0r(C004601z.A0E(view, R.id.common_action_bar_header_back), this, 41);
        this.A03 = (Button) C004601z.A0E(view, R.id.save_description_button);
        this.A02 = C13680ns.A0S(view, R.id.payment_description_error);
        WaEditText waEditText = (WaEditText) C004601z.A0E(view, R.id.payment_description_text);
        this.A01 = waEditText;
        waEditText.requestFocus();
        this.A01.addTextChangedListener(new C119525yc(this));
        C17250um r8 = this.A06;
        AnonymousClass35O r3 = new AnonymousClass35O(this.A01, C13680ns.A0L(view, R.id.counter), this.A04, this.A05, r8, this.A09, 50, 0, true);
        this.A01.setFilters(new InputFilter[]{new C93744jh(50)});
        this.A01.addTextChangedListener(r3);
        if (!TextUtils.isEmpty(this.A0A) && this.A01.getText() != null) {
            this.A01.setText(this.A0A);
            WaEditText waEditText2 = this.A01;
            waEditText2.setSelection(waEditText2.getText().length());
        }
        C110105dW.A0r(C004601z.A0E(view, R.id.save_description_button), this, 40);
        TextView A0L = C13680ns.A0L(view, R.id.payment_description_disclaimer_text);
        String A0J = A0J(R.string.str194b);
        String A0c = C13690nt.A0c(this, A0J, new Object[1], 0, R.string.str1949);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0c);
        C110255dl r32 = new C110255dl(this);
        int length = A0c.length();
        spannableStringBuilder.setSpan(r32, length - A0J.length(), length, 33);
        A0L.setText(spannableStringBuilder);
        A0L.setLinksClickable(true);
        A0L.setMovementMethod(LinkMovementMethod.getInstance());
        this.A07.AKU((AnonymousClass2St) null, 0, (Integer) null, "payment_description", (String) null);
    }
}
