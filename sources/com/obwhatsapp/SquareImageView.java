package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass3Om;
import X.C13680ns;
import X.C13700nu;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SquareImageView extends AnonymousClass3Om {
    public int A00 = 0;
    public Drawable A01;

    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00(context, attributeSet);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0M)) != null) {
            if (obtainStyledAttributes.hasValue(0)) {
                this.A00 = obtainStyledAttributes.getInt(0, this.A00);
            }
            setSelector(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onMeasure(int i2, int i3) {
        int defaultSize;
        int i4 = this.A00;
        if (i4 == 0) {
            defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i2);
        } else if (i4 == 1) {
            defaultSize = ImageView.getDefaultSize(getSuggestedMinimumHeight(), i3);
        } else {
            throw AnonymousClass000.A0T(C13680ns.A0c(i4, "Illegal value: "));
        }
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != drawable) {
            C13700nu.A0N(drawable2);
            this.A01 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A01 || super.verifyDrawable(drawable);
    }
}
