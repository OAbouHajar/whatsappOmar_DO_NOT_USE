package com.obwhatsapp.ui.media;

import X.C004601z;
import X.C448325u;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

public class MediaCard extends C448325u {
    public LinearLayout A00;

    public MediaCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public MediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaCard(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A05(int i2, int i3) {
        super.A05(i2, i3);
        LinearLayout linearLayout = this.A00;
        if (i2 < 0) {
            i2 = linearLayout.getPaddingLeft();
        }
        int paddingTop = this.A00.getPaddingTop();
        if (i3 < 0) {
            i3 = this.A00.getPaddingRight();
        }
        linearLayout.setPadding(i2, paddingTop, i3, this.A00.getPaddingBottom());
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        this.A00 = (LinearLayout) C004601z.A0E(this, R.id.media_card_thumbs);
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.dimen0529);
    }

    public void setError(String str) {
        super.setError(str);
        this.A00.setVisibility(8);
    }
}
