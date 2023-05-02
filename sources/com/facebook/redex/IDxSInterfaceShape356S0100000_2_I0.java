package com.facebook.redex;

import X.AnonymousClass00T;
import X.AnonymousClass3MQ;
import X.AnonymousClass5OV;
import X.C13690nt;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;

public class IDxSInterfaceShape356S0100000_2_I0 implements AnonymousClass5OV {
    public Object A00;
    public final int A01;

    public IDxSInterfaceShape356S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final SpannableStringBuilder AGB(String str) {
        SpannableStringBuilder spannableStringBuilder;
        if (this.A01 != 0) {
            CodeInputField codeInputField = (CodeInputField) this.A00;
            spannableStringBuilder = new SpannableStringBuilder(str);
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == codeInputField.A01) {
                    spannableStringBuilder.setSpan(C13690nt.A0G(codeInputField.getContext(), R.color.color0150), i2, i2 + 1, 33);
                }
            }
        } else {
            Context context = (Context) this.A00;
            spannableStringBuilder = new SpannableStringBuilder(str);
            for (int i3 = 0; i3 < spannableStringBuilder.length(); i3++) {
                if (spannableStringBuilder.charAt(i3) == '*') {
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i3, i4, 33);
                    spannableStringBuilder.setSpan(new AnonymousClass3MQ(context, AnonymousClass00T.A00(context, R.color.color0150)), i3, i4, 33);
                } else if (spannableStringBuilder.charAt(i3) != 160) {
                    spannableStringBuilder.setSpan(new AnonymousClass3MQ(context, AnonymousClass00T.A00(context, R.color.color0151)), i3, i3 + 1, 33);
                }
            }
        }
        return spannableStringBuilder;
    }
}
