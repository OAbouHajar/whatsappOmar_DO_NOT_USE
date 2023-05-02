package com.obwhatsapp;

import X.C004601z;
import X.C48412Nd;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class ListItemWithLeftIcon extends C48412Nd {
    public View A00;

    public ListItemWithLeftIcon(Context context) {
        super(context, (AttributeSet) null);
    }

    public ListItemWithLeftIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListItemWithLeftIcon(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void A01(AttributeSet attributeSet) {
        super.A01(attributeSet);
        this.A00 = C004601z.A0E(this, R.id.list_item_with_left_icon);
        if (TextUtils.isEmpty(this.A00.getText())) {
            this.A00.setVisibility(8);
        }
    }

    public void A02(View view) {
        ((ViewGroup) C004601z.A0E(this, R.id.right_view_container)).addView(view);
    }

    public int getRootLayoutID() {
        return R.layout.layout0396;
    }

    public void setDescription(Spanned spanned) {
        if (TextUtils.isEmpty(spanned)) {
            setDescriptionVisibility(8);
            return;
        }
        setDescriptionVisibility(0);
        super.setDescription(spanned);
    }

    public void setDescription(String str) {
        if (TextUtils.isEmpty(str)) {
            setDescriptionVisibility(8);
            return;
        }
        setDescriptionVisibility(0);
        super.setDescription(str);
    }

    public void setDescriptionVisibility(int i2) {
        if (this.A00.getVisibility() != i2) {
            this.A00.setVisibility(i2);
            boolean z2 = false;
            if (i2 == 0) {
                z2 = true;
            }
            Resources resources = getResources();
            int i3 = R.dimen.dimen0457;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen0457);
            Resources resources2 = getResources();
            if (z2) {
                i3 = R.dimen.dimen0763;
            }
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(i3);
            this.A00.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A01.getLayoutParams();
            int i4 = 3;
            if (z2) {
                i4 = 51;
            }
            layoutParams.gravity = i4;
            this.A01.setLayoutParams(layoutParams);
            this.A01.setPadding(0, z2 ? getResources().getDimensionPixelSize(R.dimen.dimen0767) : 0, 0, 0);
        }
    }

    public void setTitleTextColor(int i2) {
        this.A02.setTextColor(i2);
    }
}
