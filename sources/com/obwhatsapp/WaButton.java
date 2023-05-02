package com.obwhatsapp;

import X.AnonymousClass2VK;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class WaButton extends AnonymousClass2VK {
    public WaButton(Context context) {
        super(context);
    }

    public WaButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04(context, attributeSet);
    }

    public WaButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        A04(context, attributeSet);
    }

    public final void A04(Context context, AttributeSet attributeSet) {
        if (!this.A0E && attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0Q);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(context.getString(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getString(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(context.getString(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }
}
