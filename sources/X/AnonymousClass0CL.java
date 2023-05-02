package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: X.0CL  reason: invalid class name */
public class AnonymousClass0CL extends ImageView {
    public int A00;
    public Animation.AnimationListener A01;

    public AnonymousClass0CL(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f2 = AnonymousClass000.A0M(getContext()).density;
        int i2 = (int) (1.75f * f2);
        int i3 = (int) (0.0f * f2);
        int i4 = (int) (3.5f * f2);
        this.A00 = i4;
        if (Build.VERSION.SDK_INT >= 21) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C004601z.A0X(this, f2 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C02230Am(this, i4));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.A00, (float) i3, (float) i2, 503316480);
            int i5 = this.A00;
            setPadding(i5, i5, i5, i5);
        }
        shapeDrawable.getPaint().setColor(-328966);
        setBackground(shapeDrawable);
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.A01;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.A01;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (Build.VERSION.SDK_INT < 21) {
            setMeasuredDimension(getMeasuredWidth() + (this.A00 << 1), getMeasuredHeight() + (this.A00 << 1));
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.A01 = animationListener;
    }

    public void setBackgroundColor(int i2) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i2);
        }
    }

    public void setBackgroundColorRes(int i2) {
        setBackgroundColor(AnonymousClass00T.A00(getContext(), i2));
    }
}
