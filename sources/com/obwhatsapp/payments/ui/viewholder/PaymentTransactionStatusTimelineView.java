package com.obwhatsapp.payments.ui.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class PaymentTransactionStatusTimelineView extends ListView {
    public PaymentTransactionStatusTimelineView(Context context) {
        super(context);
    }

    public PaymentTransactionStatusTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PaymentTransactionStatusTimelineView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}
