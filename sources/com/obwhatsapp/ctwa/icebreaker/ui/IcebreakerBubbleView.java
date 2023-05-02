package com.obwhatsapp.ctwa.icebreaker.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class IcebreakerBubbleView extends FrameLayout {
    public IcebreakerBubbleView(Context context) {
        super(context);
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
    }

    public final void A00() {
        setBackgroundResource(R.drawable.floating_spam_banner_background);
        int dimension = (int) getResources().getDimension(R.dimen.dimen043c);
        setPadding(dimension, dimension, dimension, 0);
    }
}
