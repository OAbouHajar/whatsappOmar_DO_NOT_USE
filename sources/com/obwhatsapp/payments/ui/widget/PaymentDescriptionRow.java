package com.obwhatsapp.payments.ui.widget;

import X.C004601z;
import X.C13680ns;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class PaymentDescriptionRow extends LinearLayout {
    public View A00;
    public TextView A01;
    public TextView A02;

    public PaymentDescriptionRow(Context context) {
        super(context);
        A00();
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
    }

    public void A00() {
        C13680ns.A0G(this).inflate(R.layout.layout044b, this, true);
        setOrientation(1);
        this.A00 = C004601z.A0E(this, R.id.payment_description_row_container);
        this.A01 = C13680ns.A0L(this, R.id.payment_description_hint);
        this.A02 = C13680ns.A0L(this, R.id.payment_description_text);
    }

    public void A01(String str) {
        Context context;
        int i2;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = this.A02;
        if (isEmpty) {
            textView.setVisibility(8);
            this.A02.setText(str);
            context = getContext();
            i2 = R.string.str0ef9;
        } else {
            textView.setVisibility(0);
            this.A02.setText(str);
            context = getContext();
            i2 = R.string.str0ef8;
        }
        this.A01.setText(context.getString(i2));
    }

    public int getLayoutRes() {
        return R.layout.layout044b;
    }
}
