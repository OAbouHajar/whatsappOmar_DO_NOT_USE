package com.obwhatsapp.status.posting;

import X.AnonymousClass013;
import X.AnonymousClass11G;
import X.C17810vg;
import X.C19000xb;
import X.C32241fu;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCSpanShape13S0100000_2_I0;
import com.obwhatsapp.R;

public class FirstStatusConfirmationDialogFragment extends Hilt_FirstStatusConfirmationDialogFragment implements C17810vg {
    public TextView A00;
    public C19000xb A01;
    public AnonymousClass11G A02;

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        if (i2 == 0) {
            this.A00.setText(A1N());
        }
    }

    public Dialog A1B(Bundle bundle) {
        View inflate = A0C().getLayoutInflater().inflate(R.layout.layout028d, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        this.A00 = textView;
        textView.setText(A1N());
        this.A00.setMovementMethod(LinkMovementMethod.getInstance());
        C32241fu r3 = new C32241fu(A0C());
        r3.setView(inflate);
        r3.A07(true);
        r3.setPositiveButton(R.string.str14e6, new IDxCListenerShape127S0100000_2_I0(this, 133));
        r3.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 132));
        return r3.create();
    }

    public final Spanned A1N() {
        String A0J;
        int size;
        AnonymousClass013 r5;
        int i2;
        int A022 = this.A02.A02();
        if (A022 != 0) {
            if (A022 == 1) {
                size = this.A02.A08().size();
                r5 = this.A02;
                i2 = R.plurals.plurals009d;
            } else if (A022 == 2) {
                size = this.A02.A09().size();
                if (size != 0) {
                    r5 = this.A02;
                    i2 = R.plurals.plurals009c;
                }
            } else {
                throw new IllegalStateException("unknown status distribution mode");
            }
            Object[] objArr = {Integer.valueOf(size)};
            A0J = r5.A0J(objArr, i2, (long) size);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0J);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(A0J(R.string.str0435));
            spannableStringBuilder2.setSpan(new IDxCSpanShape13S0100000_2_I0(this, 0), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append(spannableStringBuilder2);
            return spannableStringBuilder;
        }
        A0J = A0J(R.string.str08fe);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(A0J);
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(A0J(R.string.str0435));
        spannableStringBuilder22.setSpan(new IDxCSpanShape13S0100000_2_I0(this, 0), 0, spannableStringBuilder22.length(), 33);
        spannableStringBuilder3.append(" ");
        spannableStringBuilder3.append(spannableStringBuilder22);
        return spannableStringBuilder3;
    }
}
