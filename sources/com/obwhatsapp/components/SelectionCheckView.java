package com.obwhatsapp.components;

import X.AnonymousClass00T;
import X.AnonymousClass2SR;
import X.C13690nt;
import X.C13700nu;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

public class SelectionCheckView extends FrameLayout {
    public int A00;
    public ShapeDrawable A01;
    public View A02;
    public AnimationSet A03;
    public AnimationSet A04;
    public ScaleAnimation A05;
    public ScaleAnimation A06;
    public ScaleAnimation A07;
    public ScaleAnimation A08;
    public ScaleAnimation A09;
    public ScaleAnimation A0A;
    public FrameLayout A0B;
    public ImageView A0C;
    public boolean A0D = false;
    public boolean A0E = true;

    public SelectionCheckView(Context context) {
        super(context);
        A03(context, (AttributeSet) null);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context, attributeSet);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A03(context, attributeSet);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A03(context, attributeSet);
    }

    public final ScaleAnimation A00(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setAnimationListener(new IDxLAdapterShape12S0200000_2_I1(view, 2, this));
        return scaleAnimation;
    }

    public final ScaleAnimation A01(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setAnimationListener(new IDxLAdapterShape12S0200000_2_I1(view, 3, this));
        return scaleAnimation;
    }

    public final void A02() {
        ScaleAnimation A002 = A00(this.A0B);
        this.A07 = A002;
        A002.setStartOffset(20);
        this.A09 = A00(this.A02);
        ScaleAnimation A003 = A00(this.A0C);
        this.A05 = A003;
        A003.setStartOffset(10);
        AnimationSet animationSet = new AnimationSet(false);
        this.A03 = animationSet;
        animationSet.addAnimation(this.A07);
        this.A03.addAnimation(this.A09);
        this.A03.addAnimation(this.A05);
        this.A08 = A01(this.A0B);
        ScaleAnimation A012 = A01(this.A02);
        this.A0A = A012;
        A012.setStartOffset(20);
        ScaleAnimation A013 = A01(this.A0C);
        this.A06 = A013;
        A013.setStartOffset(10);
        AnimationSet animationSet2 = new AnimationSet(false);
        this.A04 = animationSet2;
        animationSet2.addAnimation(this.A08);
        this.A04.addAnimation(this.A0A);
        this.A04.addAnimation(this.A06);
        this.A0D = true;
    }

    public void A03(Context context, AttributeSet attributeSet) {
        String str;
        this.A0D = false;
        int i2 = R.drawable.ic_checkmark_selected;
        int A002 = AnonymousClass00T.A00(getContext(), R.color.color06d1);
        int A003 = AnonymousClass00T.A00(getContext(), R.color.color04c8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06e5);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0K);
            i2 = obtainStyledAttributes.getResourceId(2, R.drawable.ic_checkmark_selected);
            str = obtainStyledAttributes.getString(3);
            A002 = obtainStyledAttributes.getColor(4, A002);
            A003 = obtainStyledAttributes.getColor(0, A003);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
            obtainStyledAttributes.recycle();
        } else {
            str = null;
        }
        this.A00 = A002;
        if (str == null) {
            str = context.getString(R.string.str0453);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C13690nt.A0r(getContext(), shapeDrawable.getPaint(), R.color.color06d2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        this.A01 = shapeDrawable2;
        shapeDrawable2.getPaint().setColor(A003);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.A0B = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        this.A0B.setBackground(shapeDrawable);
        this.A0B.setForeground(this.A01);
        this.A0B.setVisibility(4);
        addView(this.A0B);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
        shapeDrawable3.getPaint().setColor(A002);
        this.A02 = new WaImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A02.setLayoutParams(layoutParams2);
        this.A02.setBackground(shapeDrawable3);
        this.A02.setVisibility(4);
        addView(this.A02);
        WaImageView waImageView = new WaImageView(getContext());
        this.A0C = waImageView;
        waImageView.setLayoutParams(layoutParams);
        AnonymousClass2SR.A07(getContext(), this.A0C, R.color.color06d0);
        C13700nu.A0L(getContext(), this.A0C, i2);
        this.A0C.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.A0C.setVisibility(4);
        this.A0C.setContentDescription(str);
        addView(this.A0C);
    }

    public void A04(boolean z2, boolean z3) {
        int i2;
        FrameLayout frameLayout;
        AnimationSet animationSet;
        if (z2) {
            if (z3) {
                if (!this.A0D) {
                    A02();
                }
                setVisibility(0);
                this.A0B.clearAnimation();
                this.A02.clearAnimation();
                this.A0C.clearAnimation();
                this.A0B.setAnimation(this.A07);
                this.A02.setAnimation(this.A09);
                this.A0C.setAnimation(this.A05);
                this.A0B.setForeground(this.A01);
                animationSet = this.A03;
            } else {
                frameLayout = this.A0B;
                i2 = 0;
                frameLayout.setVisibility(i2);
                this.A02.setVisibility(i2);
                this.A0C.setVisibility(i2);
                return;
            }
        } else if (z3) {
            if (!this.A0D) {
                A02();
            }
            this.A0B.clearAnimation();
            this.A02.clearAnimation();
            this.A0C.clearAnimation();
            this.A0B.setAnimation(this.A08);
            this.A02.setAnimation(this.A0A);
            this.A0C.setAnimation(this.A06);
            this.A0B.setForeground((Drawable) null);
            animationSet = this.A04;
        } else {
            frameLayout = this.A0B;
            i2 = 4;
            frameLayout.setVisibility(i2);
            this.A02.setVisibility(i2);
            this.A0C.setVisibility(i2);
            return;
        }
        animationSet.start();
    }

    public boolean isEnabled() {
        return this.A0E;
    }

    public void setEnabled(boolean z2) {
        if (this.A0E != z2) {
            int A002 = z2 ? this.A00 : AnonymousClass00T.A00(getContext(), R.color.color04cd);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(A002);
            this.A02.setBackground(shapeDrawable);
            this.A0E = z2;
        }
    }

    public void setIcon(int i2) {
        C13700nu.A0L(getContext(), this.A0C, i2);
    }

    public void setSelectionBackground(int i2) {
        this.A02.setBackgroundResource(i2);
    }
}
