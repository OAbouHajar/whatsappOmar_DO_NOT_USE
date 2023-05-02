package com.obwhatsapp.chatinfo.view.custom;

import X.C54302hB;
import X.C60032zq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.ui.media.MediaCard;

public class ChatInfoMediaCardV2 extends MediaCard {
    public boolean A00;

    public ChatInfoMediaCardV2(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public C60032zq A02(ViewGroup.LayoutParams layoutParams, C54302hB r5, int i2) {
        C60032zq A02 = super.A02(layoutParams, r5, i2);
        A02.A02 = getResources().getDimension(R.dimen.dimen065e);
        return A02;
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = getThumbnailPixelSize();
        this.A00.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.A06.getLayoutParams();
        layoutParams2.height = getThumbnailPixelSize();
        this.A06.setLayoutParams(layoutParams2);
    }

    public int getThumbnailIconGravity() {
        return this.A0B.A0T() ? 5 : 3;
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.dimen04c2);
    }

    public int getThumbnailTextGravity() {
        return this.A0B.A0T() ? 3 : 5;
    }
}
