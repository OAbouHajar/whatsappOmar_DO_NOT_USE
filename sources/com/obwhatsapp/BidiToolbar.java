package com.obwhatsapp;

import X.AnonymousClass013;
import X.C004601z;
import X.C45902Bo;
import X.C52972el;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BidiToolbar extends C52972el {
    public AnonymousClass013 A00;

    public BidiToolbar(Context context) {
        super(context);
        if (!isInEditMode()) {
            C004601z.A0f(this, this.A00.A0T() ? 1 : 0);
        }
    }

    public BidiToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            C004601z.A0f(this, this.A00.A0T() ? 1 : 0);
        }
    }

    public BidiToolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!isInEditMode()) {
            C004601z.A0f(this, this.A00.A0T() ? 1 : 0);
        }
    }

    public final void A0K(View view, int i2) {
        if ((view instanceof ViewGroup) && view.getId() != R.id.custom_view) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                childAt.layout(i2 - childAt.getRight(), childAt.getTop(), i2 - childAt.getLeft(), childAt.getBottom());
                A0K(childAt, childAt.getRight() - childAt.getLeft());
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (!isInEditMode() && !C45902Bo.A01 && this.A00.A0T()) {
            A0K(this, i4 - i2);
        }
    }
}
