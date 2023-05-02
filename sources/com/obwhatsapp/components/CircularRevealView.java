package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.AnonymousClass3NL;
import X.C52662eE;
import X.C94554l6;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;

public class CircularRevealView extends FrameLayout implements AnonymousClass006 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Animator.AnimatorListener A05;
    public Paint A06;
    public Path A07;
    public RectF A08;
    public Animation.AnimationListener A09;
    public AnonymousClass3NL A0A;
    public C52662eE A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public CircularRevealView(Context context) {
        super(context);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
        this.A0E = true;
        this.A04 = 300;
        this.A03 = -1;
        this.A06 = new Paint(1);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A09 = new C94554l6(this);
        this.A05 = new IDxLAdapterShape3S0100000_2_I0(this, 13);
    }

    public CircularRevealView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A0E = true;
        this.A04 = 300;
        this.A03 = -1;
        this.A06 = new Paint(1);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A09 = new C94554l6(this);
        this.A05 = new IDxLAdapterShape3S0100000_2_I0(this, 13);
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
        this.A0E = true;
        this.A04 = 300;
        this.A03 = -1;
        this.A06 = new Paint(1);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A09 = new C94554l6(this);
        this.A05 = new IDxLAdapterShape3S0100000_2_I0(this, 13);
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
        this.A0E = true;
        this.A04 = 300;
        this.A03 = -1;
        this.A06 = new Paint(1);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A09 = new C94554l6(this);
        this.A05 = new IDxLAdapterShape3S0100000_2_I0(this, 13);
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
    }

    public void A00() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.A0E) {
                super.clearAnimation();
            }
            setWillNotDraw(false);
            setBackgroundColor(0);
            AnonymousClass3NL r2 = new AnonymousClass3NL(this, false);
            this.A0A = r2;
            r2.setDuration((long) this.A04);
            this.A0A.setAnimationListener(this.A09);
            startAnimation(this.A0A);
            return;
        }
        setVisibility(0);
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.A01, this.A02, 0.0f, (float) Math.max(getWidth(), getHeight()));
        createCircularReveal.setDuration((long) this.A04);
        createCircularReveal.addListener(this.A05);
        createCircularReveal.start();
    }

    public void A01(Animation animation) {
        if (this.A0E) {
            super.clearAnimation();
        }
        setBackgroundColor(0);
        animation.setDuration((long) this.A04);
        animation.setAnimationListener(this.A09);
        startAnimation(animation);
    }

    public void A02(boolean z2) {
        if (z2) {
            if (Build.VERSION.SDK_INT < 21) {
                if (this.A0E) {
                    super.clearAnimation();
                }
                AnonymousClass3NL r2 = new AnonymousClass3NL(this, true);
                this.A0A = r2;
                r2.setDuration((long) this.A04);
                this.A0A.setAnimationListener(this.A09);
                startAnimation(this.A0A);
                return;
            }
            int max = Math.max(getWidth(), getHeight());
            if (isAttachedToWindow()) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.A01, this.A02, (float) max, 0.0f);
                createCircularReveal.setDuration((long) this.A04);
                createCircularReveal.addListener(new IDxLAdapterShape3S0100000_2_I0(this, 14));
                createCircularReveal.addListener(this.A05);
                createCircularReveal.start();
                return;
            }
        }
        setVisibility(8);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0B;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 21) {
            clearAnimation();
        }
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return;
        }
        if (this.A03 != -1) {
            float sqrt = (float) (Math.sqrt((double) ((getWidth() * getWidth()) + (getHeight() * getHeight()))) * ((double) this.A00));
            RectF rectF = this.A08;
            float f2 = -sqrt;
            rectF.set(f2, f2, sqrt, sqrt);
            rectF.offset((float) this.A01, (float) this.A02);
            Paint paint = this.A06;
            paint.setColor(this.A03);
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawArc(rectF, 0.0f, 360.0f, true, paint);
        } else if (i2 >= 18) {
            float sqrt2 = (float) (Math.sqrt((double) ((getWidth() * getWidth()) + (getHeight() * getHeight()))) * ((double) this.A00));
            RectF rectF2 = this.A08;
            float f3 = -sqrt2;
            rectF2.set(f3, f3, sqrt2, sqrt2);
            rectF2.offset((float) this.A01, (float) this.A02);
            Paint paint2 = this.A06;
            paint2.setColor(this.A03);
            paint2.setStyle(Paint.Style.FILL);
            Path path = this.A07;
            path.reset();
            path.addArc(rectF2, 0.0f, 360.0f);
            canvas.clipPath(path);
        }
    }

    public void setColor(int i2) {
        this.A03 = i2;
    }

    public void setDuration(int i2) {
        this.A04 = i2;
    }

    public void setShouldClearOnRestart(boolean z2) {
        this.A0E = z2;
    }
}
