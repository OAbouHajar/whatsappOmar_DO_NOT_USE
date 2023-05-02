package com.obwhatsapp.mediacomposer.bottombar.filterswipe;

import X.C13680ns;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class FilterSwipeView extends LinearLayout {
    public final TextView A00 = C13680ns.A0L(this, R.id.filter_swipe_text);

    public FilterSwipeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.inflate(getContext(), R.layout.layout0287, this);
        C13680ns.A0t(context, this, R.string.str08f1);
    }

    public int getFilterSwipeTextViewVisibility() {
        return this.A00.getVisibility();
    }

    public void setFilterSwipeTextVisibility(int i2) {
        this.A00.setVisibility(i2);
    }

    public void setText(int i2) {
        this.A00.setText(i2);
    }
}
