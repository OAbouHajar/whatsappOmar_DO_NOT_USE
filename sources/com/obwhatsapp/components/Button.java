package com.obwhatsapp.components;

import X.AnonymousClass090;
import X.C004601z;
import X.C434920f;
import X.C53072ew;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;

public class Button extends WaButton {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public boolean A05;
    public final Paint A06;
    public final Rect A07;
    public final RectF A08;

    public Button(Context context) {
        this(context, (AttributeSet) null);
    }

    public Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr0087);
    }

    public Button(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        int i4;
        ColorStateList colorStateList;
        A00();
        this.A06 = new Paint(1);
        this.A07 = new Rect();
        this.A08 = new RectF();
        if (!this.A0E) {
            Resources.Theme theme = context.getTheme();
            this.A03 = context.getResources().getDimensionPixelSize(R.dimen.dimen00ec);
            this.A01 = context.getResources().getDimensionPixelSize(R.dimen.dimen00e8);
            this.A02 = context.getResources().getDimensionPixelSize(R.dimen.dimen00e9);
            Paint paint = this.A06;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) this.A03);
            this.A00 = context.getResources().getDimensionPixelSize(R.dimen.dimen00c6);
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C53072ew.A03, i2, R.style.style03a2);
            if (obtainStyledAttributes.hasValue(1)) {
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(1);
                this.A04 = colorStateList2;
                if (colorStateList2 != null) {
                    paint.setColor(colorStateList2.getColorForState(getDrawableState(), 0));
                }
            }
            if (Build.VERSION.SDK_INT < 21) {
                if (!obtainStyledAttributes.hasValue(0) || (colorStateList = obtainStyledAttributes.getColorStateList(0)) == null) {
                    i3 = 0;
                    i4 = 0;
                } else {
                    i4 = colorStateList.getDefaultColor();
                    i3 = colorStateList.getColorForState(new int[]{-16842910}, i4);
                }
                int A052 = AnonymousClass090.A05(C434920f.A00(context, R.attr.attr00eb, R.color.color00d9), i4);
                C004601z.A0O(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842910}, new int[]{16842908, 16842919}, new int[]{-16842910}, new int[0]}, new int[]{A052, i4, A052, i3, i4}), this);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        if (!this.A0E && (colorStateList = this.A04) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Paint paint = this.A06;
            if (colorForState != paint.getColor()) {
                paint.setColor(colorForState);
                invalidate();
            }
        }
    }

    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (!this.A0E && canvas != null && this.A04 != null && (i2 = this.A03) > 0) {
            Rect rect = this.A07;
            rect.set(getBackground().getBounds());
            RectF rectF = this.A08;
            float f2 = ((float) i2) / 2.0f;
            float f3 = (float) this.A01;
            float f4 = (float) this.A02;
            rectF.set(((float) rect.left) + f2 + f3, ((float) rect.top) + f2 + f4, (((float) rect.right) - f2) - f3, (((float) rect.bottom) - f2) - f4);
            float f5 = ((float) this.A00) - f2;
            canvas.drawRoundRect(rectF, f5, f5, this.A06);
        }
    }
}
