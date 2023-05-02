package com.obwhatsapp.community.deactivate;

import X.AnonymousClass00B;
import X.AnonymousClass08E;
import X.AnonymousClass49P;
import X.C18450wi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public final class DeactivateCommunityInfoRow extends LinearLayout {
    public ImageView A00;
    public TextView A01;
    public TextView A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DeactivateCommunityInfoRow(Context context) {
        this(context, (AttributeSet) null);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateCommunityInfoRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18450wi.A0H(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateCommunityInfoRow(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C18450wi.A0H(context, 1);
        A00(context, attributeSet);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        RuntimeException A03;
        LayoutInflater.from(context).inflate(R.layout.layout010d, this);
        this.A00 = (ImageView) C18450wi.A00(this, R.id.cdir_icon);
        this.A02 = (TextView) C18450wi.A00(this, R.id.cdir_row_title);
        this.A01 = (TextView) C18450wi.A00(this, R.id.cdir_description);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0769);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass49P.A00);
        C18450wi.A0B(obtainStyledAttributes);
        try {
            TextView textView = this.A02;
            if (textView == null) {
                A03 = C18450wi.A03("rowTitleView");
            } else {
                String string = obtainStyledAttributes.getString(2);
                AnonymousClass00B.A06(string);
                textView.setText(string);
                TextView textView2 = this.A01;
                if (textView2 == null) {
                    A03 = C18450wi.A03("rowDescriptionView");
                } else {
                    String string2 = obtainStyledAttributes.getString(0);
                    AnonymousClass00B.A06(string2);
                    textView2.setText(string2);
                    int resourceId = obtainStyledAttributes.getResourceId(1, -1);
                    if (resourceId != -1) {
                        ImageView imageView = this.A00;
                        if (imageView == null) {
                            A03 = C18450wi.A03("rowIconView");
                        } else {
                            imageView.setImageDrawable(AnonymousClass08E.A01(context, resourceId));
                        }
                    }
                    return;
                }
            }
            throw A03;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
