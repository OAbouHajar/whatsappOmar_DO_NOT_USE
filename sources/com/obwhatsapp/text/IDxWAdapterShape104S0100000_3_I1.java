package com.obwhatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.C004601z;
import X.C110495eG;
import X.C110685ef;
import X.C111425gA;
import X.C116785rw;
import X.C1205762e;
import X.C13680ns;
import X.C17020u3;
import X.C17250um;
import X.C41651wK;
import X.C45922Bq;
import X.C86084Rd;
import android.content.Context;
import android.text.Editable;
import android.widget.EditText;
import com.obwhatsapp.R;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import org.npci.commonlibrary.widget.FormItemEditText;

public class IDxWAdapterShape104S0100000_3_I1 extends C41651wK {
    public Object A00;
    public final int A01;

    public IDxWAdapterShape104S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        C86084Rd r2;
        Editable editable2 = editable;
        switch (this.A01) {
            case 1:
                IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this.A00;
                indiaUpiSendPaymentToVpaFragment.A02.setVisibility(4);
                indiaUpiSendPaymentToVpaFragment.A06.setEnabled(AnonymousClass000.A1Q(editable.toString().length()));
                EditText editText = indiaUpiSendPaymentToVpaFragment.A00;
                C004601z.A0O(AnonymousClass00T.A03(editText.getContext(), R.color.color064b), editText);
                return;
            case 2:
                C1205762e r0 = (C1205762e) this.A00;
                Context context = r0.A0E;
                C17250um r7 = r0.A0I;
                AnonymousClass01V r6 = r0.A0G;
                C17020u3 r8 = r0.A0K;
                MentionableEntry mentionableEntry = r0.A09;
                AnonymousClass00B.A04(mentionableEntry);
                C45922Bq.A06(context, mentionableEntry.getPaint(), editable2, r6, r7, r8);
                return;
            case 3:
                PaymentView paymentView = (PaymentView) this.A00;
                if (paymentView.A17.A00 && (r2 = paymentView.A1A) != null && paymentView.A0i.A02) {
                    r2.A00(editable.toString(), 200);
                    return;
                }
                return;
            case 4:
                C110495eG r3 = (C110495eG) this.A00;
                if (r3.A0C || r3.A0D) {
                    str = editable.toString();
                } else if (editable.length() == 0) {
                    r3.A09 = "";
                    return;
                } else if (r3.A09.length() > editable.length()) {
                    String str2 = r3.A09;
                    str = str2.substring(0, str2.length() - 1);
                } else {
                    char charAt = editable.toString().charAt(editable.length() - 1);
                    if (charAt != 9679) {
                        String str3 = r3.A09;
                        StringBuilder A0q = AnonymousClass000.A0q("");
                        A0q.append(charAt);
                        String concat = str3.concat(A0q.toString());
                        r3.A09 = concat;
                        r3.A0A.setText(concat.replaceAll(".", "●"));
                        return;
                    }
                    r3.A0A.setSelection(editable.length());
                    return;
                }
                r3.A09 = str;
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        switch (this.A01) {
            case 0:
                C110685ef r1 = ((C111425gA) this.A00).A07;
                int length = charSequence.length();
                AnonymousClass027 r2 = r1.A01;
                int i5 = 1;
                if (length > 0) {
                    i5 = 3;
                }
                r2.A0B(new C116785rw(i5));
                return;
            case 4:
                C110495eG r4 = (C110495eG) this.A00;
                if (r4.A0B != null) {
                    FormItemEditText formItemEditText = r4.A0A;
                    if (formItemEditText.getText() != null && formItemEditText.getText().length() >= r4.A00) {
                        r4.A0B.ARa(r4.A01, C13680ns.A0f(formItemEditText));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i2, i3, i4);
                return;
        }
    }
}
