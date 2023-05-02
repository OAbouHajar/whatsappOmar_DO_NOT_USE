package com.obwhatsapp.checkbox;

import X.AnonymousClass013;
import X.C13680ns;
import X.C13700nu;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.redex.IDxIDrawableShape12S0100000_2_I1;

public class RtlCheckBox extends AppCompatCheckBox {
    public int A00;
    public Drawable A01;
    public AnonymousClass013 A02;

    public RtlCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = C13700nu.A0A(getContext()).Ai9();
        }
        if (!isInEditMode() && this.A02.A0T()) {
            setBackgroundDrawable((Drawable) null);
            this.A00 = getPaddingLeft();
            int min = Math.min(this.A00, getPaddingRight());
            setPadding(min, getPaddingTop(), min, getPaddingBottom());
        }
    }

    public int getCompoundPaddingLeft() {
        return (isInEditMode() || C13680ns.A1Z(this.A02)) ? super.getCompoundPaddingLeft() : super.getPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (isInEditMode() || C13680ns.A1Z(this.A02)) {
            return super.getCompoundPaddingRight();
        }
        int paddingRight = super.getPaddingRight();
        Drawable drawable = this.A01;
        return drawable != null ? paddingRight + Math.max(this.A00, drawable.getIntrinsicWidth()) : paddingRight;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.A02.A0T() && this.A01 != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = this.A01.getIntrinsicHeight();
            int intrinsicWidth = this.A01.getIntrinsicWidth();
            int i2 = 0;
            if (gravity == 16) {
                i2 = (getHeight() - intrinsicHeight) >> 1;
            } else if (gravity == 80) {
                i2 = getHeight() - intrinsicHeight;
            }
            int width = getWidth() - intrinsicWidth;
            int width2 = getWidth();
            this.A01.setBounds(width, i2, width2, intrinsicHeight + i2);
            this.A01.draw(canvas);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        if (this.A02 == null) {
            this.A02 = C13700nu.A0A(getContext()).Ai9();
        }
        if (!isInEditMode() && !C13680ns.A1Z(this.A02)) {
            this.A01 = drawable;
            drawable = new IDxIDrawableShape12S0100000_2_I1(drawable, this, 1);
        }
        super.setButtonDrawable(drawable);
    }
}
