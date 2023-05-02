package com.obwhatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass29j;
import X.AnonymousClass4XG;
import X.AnonymousClass4Z1;
import X.C004601z;
import X.C04240Lt;
import X.C102764zU;
import X.C109355Ru;
import X.C13680ns;
import X.C52662eE;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

public class ColorPickerComponent extends LinearLayout implements AnonymousClass006 {
    public AnonymousClass4XG A00;
    public C52662eE A01;
    public boolean A02;
    public final View A03;
    public final ViewGroup A04;
    public final ColorPickerView A05;

    public ColorPickerComponent(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorPickerComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerComponent(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ViewGroup viewGroup = (ViewGroup) C13680ns.A0G(this).inflate(R.layout.layout010c, this, true);
        this.A04 = viewGroup;
        ColorPickerView colorPickerView = (ColorPickerView) C004601z.A0E(viewGroup, R.id.color_picker);
        this.A05 = colorPickerView;
        this.A03 = C004601z.A0E(viewGroup, R.id.color_picker_container);
        C004601z.A0d(colorPickerView, 1);
        A02(colorPickerView.A02);
        A03(getResources().getConfiguration().orientation);
    }

    public void A00() {
        ColorPickerView colorPickerView = this.A05;
        if (colorPickerView.getVisibility() != 0) {
            colorPickerView.setVisibility(0);
            A01(R.anim.anim001e);
        }
        AnonymousClass4XG r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void A01(int i2) {
        ColorPickerView colorPickerView = this.A05;
        colorPickerView.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i2);
        loadAnimation.setInterpolator(C04240Lt.A00(0.5f, 1.35f, 0.4f, 1.0f));
        colorPickerView.startAnimation(loadAnimation);
    }

    public final void A02(int i2) {
        Integer[] numArr = AnonymousClass4Z1.A01;
        int i3 = -1;
        double d2 = Double.MAX_VALUE;
        for (int i4 = 0; i4 < numArr.length; i4++) {
            double[] A002 = AnonymousClass4Z1.A00(numArr[i4].intValue());
            double[] A003 = AnonymousClass4Z1.A00(i2);
            double d3 = A002[0] - A003[0];
            double d4 = A002[1];
            double d5 = A003[1];
            double d6 = A002[2];
            double d7 = A003[2];
            double d8 = d6 - d7;
            double sqrt = Math.sqrt(Math.pow(d4, 2.0d) + Math.pow(d6, 2.0d));
            double sqrt2 = sqrt - Math.sqrt(Math.pow(d5, 2.0d) + Math.pow(d7, 2.0d));
            double pow = (Math.pow(d4 - d5, 2.0d) + Math.pow(d8, 2.0d)) - Math.pow(sqrt2, 2.0d);
            double d9 = 0.0d;
            if (pow > 0.0d) {
                d9 = Math.sqrt(pow);
            }
            double sqrt3 = Math.sqrt((double) ((float) (Math.pow(d3 / 1.0d, 2.0d) + Math.pow(sqrt2 / ((0.045d * sqrt) + 1.0d), 2.0d) + Math.pow(d9 / ((sqrt * 0.015d) + 1.0d), 2.0d))));
            if (sqrt3 < d2) {
                i3 = numArr[i4].intValue();
                d2 = sqrt3;
            }
        }
        this.A05.setContentDescription(getResources().getString(R.string.str0732, AnonymousClass000.A1a(getResources().getString(((Number) AnonymousClass000.A0Y(AnonymousClass4Z1.A00, i3)).intValue()))));
    }

    public final void A03(int i2) {
        View view = this.A03;
        view.setPadding(view.getPaddingLeft(), (int) getResources().getDimension(R.dimen.dimen01a0), view.getPaddingRight(), i2 == 2 ? (int) getResources().getDimension(R.dimen.dimen019c) : 0);
    }

    public void A04(AnonymousClass4XG r4, C109355Ru r5, AnonymousClass29j r6) {
        this.A00 = r4;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = (int) getResources().getDimension(R.dimen.dimen019d);
        setLayoutParams(layoutParams);
        if (r6 != null) {
            ColorPickerView colorPickerView = this.A05;
            r6.Aej(colorPickerView.A00, colorPickerView.A02);
        }
        this.A05.A09 = new C102764zU(r5, this, r6);
    }

    public void A05(boolean z2) {
        ColorPickerView colorPickerView = this.A05;
        if (colorPickerView.getVisibility() == 0) {
            if (z2) {
                A01(R.anim.anim001f);
            }
            colorPickerView.setVisibility(4);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public int getColorPickerHeight() {
        return this.A05.getHeight();
    }

    public float getMinSize() {
        return (float) this.A05.A06;
    }

    public int getSelectedColor() {
        return this.A05.A02;
    }

    public float getSelectedStrokeSize() {
        return this.A05.A00;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A03(configuration.orientation);
    }

    public void setColorAndInvalidate(int i2) {
        this.A05.setColorAndInvalidate(i2);
    }

    public void setInsets(Rect rect) {
        ViewGroup viewGroup = this.A04;
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(viewGroup);
        A0O.leftMargin = rect.left;
        A0O.topMargin = rect.top;
        A0O.rightMargin = rect.right;
        A0O.bottomMargin = rect.bottom;
        viewGroup.setLayoutParams(A0O);
    }

    public void setMaxHeight(int i2) {
        this.A05.A03 = i2;
    }

    public void setSizeAndInvalidate(float f2) {
        this.A05.setSizeAndInvalidate(f2);
    }
}
