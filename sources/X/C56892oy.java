package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.redex.IDxLAdapterShape1S0101000_2_I1;
import com.facebook.redex.IDxUListenerShape0S0104000_2_I1;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.2oy  reason: invalid class name and case insensitive filesystem */
public class C56892oy extends LinearLayout {
    public float A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04;
    public int A05 = -1;
    public ValueAnimator A06;
    public final Paint A07;
    public final GradientDrawable A08;
    public final /* synthetic */ TabLayout A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56892oy(Context context, TabLayout tabLayout) {
        super(context);
        this.A09 = tabLayout;
        setWillNotDraw(false);
        this.A07 = C13700nu.A05();
        this.A08 = new GradientDrawable();
    }

    public final void A00() {
        int i2;
        int i3;
        View childAt = getChildAt(this.A05);
        if (childAt == null || childAt.getWidth() <= 0) {
            i2 = -1;
            i3 = -1;
        } else {
            i2 = childAt.getLeft();
            i3 = childAt.getRight();
            TabLayout tabLayout = this.A09;
            if (!tabLayout.A0S && (childAt instanceof C47822Ks)) {
                RectF rectF = tabLayout.A0Y;
                A02(rectF, (C47822Ks) childAt);
                i2 = (int) rectF.left;
                i3 = (int) rectF.right;
            }
            if (this.A00 > 0.0f && this.A05 < getChildCount() - 1) {
                View childAt2 = getChildAt(this.A05 + 1);
                int left = childAt2.getLeft();
                int right = childAt2.getRight();
                if (!tabLayout.A0S && (childAt2 instanceof C47822Ks)) {
                    RectF rectF2 = tabLayout.A0Y;
                    A02(rectF2, (C47822Ks) childAt2);
                    left = (int) rectF2.left;
                    right = (int) rectF2.right;
                }
                float f2 = this.A00;
                float f3 = 1.0f - f2;
                i2 = (int) ((((float) left) * f2) + (((float) i2) * f3));
                i3 = (int) ((((float) right) * f2) + (f3 * ((float) i3)));
            }
        }
        if (i2 != this.A01 || i3 != this.A02) {
            this.A01 = i2;
            this.A02 = i3;
            postInvalidateOnAnimation();
        }
    }

    public void A01(int i2, int i3) {
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A06.cancel();
        }
        View childAt = getChildAt(i2);
        if (childAt == null) {
            A00();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        TabLayout tabLayout = this.A09;
        if (!tabLayout.A0S && (childAt instanceof C47822Ks)) {
            RectF rectF = tabLayout.A0Y;
            A02(rectF, (C47822Ks) childAt);
            left = (int) rectF.left;
            right = (int) rectF.right;
        }
        int i4 = this.A01;
        int i5 = this.A02;
        if (i4 != left || i5 != right) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.A06 = valueAnimator2;
            valueAnimator2.setInterpolator(C53572fv.A02);
            valueAnimator2.setDuration((long) i3);
            valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
            valueAnimator2.addUpdateListener(new IDxUListenerShape0S0104000_2_I1(this, i4, left, i5, right));
            valueAnimator2.addListener(new IDxLAdapterShape1S0101000_2_I1(this, i2, 1));
            valueAnimator2.start();
        }
    }

    public final void A02(RectF rectF, C47822Ks r7) {
        int contentWidth = r7.getContentWidth();
        TabLayout tabLayout = this.A09;
        if (contentWidth < tabLayout.A01(24)) {
            contentWidth = tabLayout.A01(24);
        }
        int left = (r7.getLeft() + r7.getRight()) >> 1;
        int i2 = contentWidth >> 1;
        rectF.set((float) (left - i2), 0.0f, (float) (left + i2), 0.0f);
    }

    public void draw(Canvas canvas) {
        TabLayout tabLayout = this.A09;
        Drawable drawable = tabLayout.A0I;
        int i2 = 0;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        int i3 = this.A04;
        if (i3 >= 0) {
            intrinsicHeight = i3;
        }
        int i4 = tabLayout.A06;
        if (i4 == 0) {
            i2 = getHeight() - intrinsicHeight;
            intrinsicHeight = getHeight();
        } else if (i4 == 1) {
            i2 = (getHeight() - intrinsicHeight) / 2;
            intrinsicHeight = (getHeight() + intrinsicHeight) >> 1;
        } else if (i4 != 2) {
            if (i4 != 3) {
                intrinsicHeight = 0;
            }
            intrinsicHeight = getHeight();
        }
        int i5 = this.A01;
        if (i5 >= 0 && this.A02 > i5) {
            Drawable drawable2 = tabLayout.A0I;
            if (drawable2 == null) {
                drawable2 = this.A08;
            }
            Drawable A032 = C018208n.A03(drawable2);
            A032.setBounds(this.A01, i2, this.A02, intrinsicHeight);
            Paint paint = this.A07;
            if (paint != null) {
                int i6 = Build.VERSION.SDK_INT;
                int color = paint.getColor();
                if (i6 == 21) {
                    A032.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                } else {
                    C018208n.A0A(A032, color);
                }
            }
            A032.draw(canvas);
        }
        super.draw(canvas);
    }

    public float getIndicatorPosition() {
        return ((float) this.A05) + this.A00;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        ValueAnimator valueAnimator = this.A06;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            A00();
            return;
        }
        this.A06.cancel();
        A01(this.A05, Math.round((1.0f - this.A06.getAnimatedFraction()) * ((float) this.A06.getDuration())));
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            TabLayout tabLayout = this.A09;
            if (tabLayout.A03 == 1 && tabLayout.A04 == 1) {
                int childCount = getChildCount();
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() == 0) {
                        i4 = Math.max(i4, childAt.getMeasuredWidth());
                    }
                }
                if (i4 > 0) {
                    if (i4 * childCount <= getMeasuredWidth() - (tabLayout.A01(16) << 1)) {
                        boolean z2 = false;
                        for (int i6 = 0; i6 < childCount; i6++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                            if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i4;
                                layoutParams.weight = 0.0f;
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            return;
                        }
                    } else {
                        tabLayout.A04 = 0;
                        tabLayout.A0H(false);
                    }
                    super.onMeasure(i2, i3);
                }
            }
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (Build.VERSION.SDK_INT < 23 && this.A03 != i2) {
            requestLayout();
            this.A03 = i2;
        }
    }

    public void setSelectedIndicatorColor(int i2) {
        Paint paint = this.A07;
        if (paint.getColor() != i2) {
            paint.setColor(i2);
            postInvalidateOnAnimation();
        }
    }

    public void setSelectedIndicatorHeight(int i2) {
        if (this.A04 != i2) {
            this.A04 = i2;
            postInvalidateOnAnimation();
        }
    }
}
