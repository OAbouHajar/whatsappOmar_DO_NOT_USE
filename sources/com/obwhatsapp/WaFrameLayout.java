package com.obwhatsapp;

import X.AnonymousClass00T;
import X.AnonymousClass2VY;
import X.C018208n;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaFrameLayout extends AnonymousClass2VY {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public boolean A04 = false;

    public WaFrameLayout(Context context) {
        super(context);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01(context, attributeSet);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.A04 = isPressed();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0T);
            this.A01 = obtainStyledAttributes.getResourceId(1, 0);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            if (!(getBackground() == null || this.A01 == 0)) {
                setBackgroundDrawable(getBackground());
            }
            this.A03 = obtainStyledAttributes.getResourceId(3, 0);
            this.A02 = obtainStyledAttributes.getResourceId(2, 0);
            if (!(getForeground() == null || this.A03 == 0)) {
                setForeground(getForeground());
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() != this.A04) {
            this.A04 = isPressed();
            setBackgroundDrawable(getBackground());
            setForeground(getForeground());
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        int i2;
        if (!(this.A01 == 0 || drawable == null)) {
            drawable = C018208n.A03(drawable);
            if (!isPressed() || (i2 = this.A00) == 0) {
                i2 = this.A01;
            }
            C018208n.A0A(drawable, AnonymousClass00T.A00(getContext(), i2));
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setForeground(Drawable drawable) {
        int i2;
        if (!(this.A03 == 0 || drawable == null)) {
            drawable = C018208n.A03(drawable);
            if (!isPressed() || (i2 = this.A02) == 0) {
                i2 = this.A03;
            }
            C018208n.A0A(drawable, AnonymousClass00T.A00(getContext(), i2));
        }
        super.setForeground(drawable);
    }
}
