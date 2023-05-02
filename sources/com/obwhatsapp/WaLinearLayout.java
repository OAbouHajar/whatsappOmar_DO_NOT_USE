package com.obwhatsapp;

import X.AnonymousClass00T;
import X.AnonymousClass3OR;
import X.C004601z;
import X.C018208n;
import X.C45902Bo;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaLinearLayout extends AnonymousClass3OR {
    public int A00 = 0;

    public WaLinearLayout(Context context) {
        super(context);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01(context, attributeSet);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A01(context, attributeSet);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0W);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            Drawable background = getBackground();
            if (!(background == null || this.A00 == 0)) {
                setBackground(background);
            }
            obtainStyledAttributes.recycle();
            if (z2) {
                C004601z.A0f(this, 0);
                setTag(R.id.bidilayout_ignore, C45902Bo.A00);
            }
        }
    }

    public void setBackground(Drawable drawable) {
        if (!(this.A00 == 0 || drawable == null)) {
            drawable = C018208n.A03(drawable);
            C018208n.A0A(drawable, AnonymousClass00T.A00(getContext(), this.A00));
        }
        super.setBackground(drawable);
    }
}
