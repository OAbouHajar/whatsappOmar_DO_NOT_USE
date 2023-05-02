package com.obwhatsapp.ui.media;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

public class WrappingGridView extends GridView {
    public WrappingGridView(Context context) {
        super(context);
    }

    public WrappingGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrappingGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void onMeasure(int i2, int i3) {
        if (getLayoutParams().height == -2) {
            i3 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
    }
}
