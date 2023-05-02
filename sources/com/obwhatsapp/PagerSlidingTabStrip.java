package com.obwhatsapp;

import X.AnonymousClass012;
import X.C004601z;
import X.C015507l;
import X.C14830pp;
import X.C35711mN;
import X.C51972cc;
import X.C53042et;
import X.C53062ev;
import X.C53072ew;
import X.C53092ey;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0;
import com.obwhatsapp.youbasha.others;
import java.util.Locale;

public class PagerSlidingTabStrip extends C51972cc {
    public static final int[] A0R = {16842901, 16842904};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public Paint A0H;
    public Paint A0I;
    public LinearLayout.LayoutParams A0J;
    public LinearLayout.LayoutParams A0K;
    public LinearLayout A0L;
    public C015507l A0M;
    public ViewPager A0N;
    public Locale A0O;
    public boolean A0P;
    public final C53042et A0Q;

    public PagerSlidingTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A0Q = new C53042et(this);
        this.A01 = 0;
        this.A00 = 0.0f;
        this.A05 = -10066330;
        this.A0F = 436207616;
        this.A02 = 436207616;
        this.A0P = true;
        this.A08 = 52;
        this.A06 = 3;
        this.A0G = 1;
        this.A03 = 12;
        this.A0B = 8;
        this.A04 = 1;
        this.A0D = 12;
        this.A0C = -10066330;
        this.A0E = 1;
        this.A07 = 0;
        this.A09 = R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout r0 = this instanceof HomePagerSlidingTabStrip ? new C53062ev(context) : new LinearLayout(context);
        this.A0L = r0;
        r0.setOrientation(0);
        this.A0L.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.A0L);
        C004601z.A0d(this.A0L, 2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A08 = (int) TypedValue.applyDimension(1, (float) this.A08, displayMetrics);
        this.A06 = (int) TypedValue.applyDimension(1, (float) this.A06, displayMetrics);
        this.A0G = (int) TypedValue.applyDimension(1, (float) this.A0G, displayMetrics);
        this.A03 = (int) TypedValue.applyDimension(1, (float) this.A03, displayMetrics);
        this.A0B = (int) TypedValue.applyDimension(1, (float) this.A0B, displayMetrics);
        this.A04 = (int) TypedValue.applyDimension(1, (float) this.A04, displayMetrics);
        this.A0D = (int) TypedValue.applyDimension(2, (float) this.A0D, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0R);
        this.A0D = obtainStyledAttributes.getDimensionPixelSize(0, this.A0D);
        this.A0C = obtainStyledAttributes.getColor(1, this.A0C);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C53072ew.A0E);
        int color = obtainStyledAttributes2.getColor(1, this.A05);
        this.A05 = others.pagerIndicator();
        this.A02 = obtainStyledAttributes2.getColor(0, this.A02);
        this.A0B = obtainStyledAttributes2.getDimensionPixelSize(2, this.A0B);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.A0I = paint;
        paint.setAntiAlias(true);
        this.A0I.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.A0H = paint2;
        paint2.setAntiAlias(true);
        this.A0H.setStrokeWidth((float) this.A04);
        this.A0J = new LinearLayout.LayoutParams(-2, -1);
        this.A0K = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.A0O == null) {
            this.A0O = getResources().getConfiguration().locale;
        }
    }

    public static /* synthetic */ void A00(PagerSlidingTabStrip pagerSlidingTabStrip, int i2, int i3) {
        if (pagerSlidingTabStrip.A0A != 0) {
            int left = pagerSlidingTabStrip.A0L.getChildAt(i2).getLeft() + i3;
            if (i2 > 0 || i3 > 0) {
                left -= pagerSlidingTabStrip.A08;
            }
            if (left != pagerSlidingTabStrip.A07) {
                pagerSlidingTabStrip.A07 = left;
                pagerSlidingTabStrip.scrollTo(left, 0);
            }
        }
    }

    public final void A01() {
        for (int i2 = 0; i2 < this.A0A; i2++) {
            View childAt = this.A0L.getChildAt(i2);
            childAt.setBackgroundResource(this.A09);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, (float) this.A0D);
                int i3 = this.A0E;
                textView.setTextColor(this.A0C);
                textView.setAllCaps(true);
            }
        }
    }

    public void A02(View view, int i2) {
        view.setFocusable(true);
        view.setOnClickListener(new ViewOnClickCListenerShape1S0101000_I0(this, i2, 0));
        int i3 = this.A0B;
        view.setPadding(i3, 0, i3, 0);
        C004601z.A0j(view, new C53092ey(this));
        this.A0L.addView(view, i2, this.A0P ? this.A0K : this.A0J);
    }

    public int getTextColor() {
        return this.A0C;
    }

    public int getTextSize() {
        return this.A0D;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (!isInEditMode() && this.A0A != 0) {
            int height = getHeight();
            Paint paint = this.A0I;
            paint.setColor(this.A05);
            LinearLayout linearLayout = this.A0L;
            View childAt = linearLayout.getChildAt(this.A01);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.A00 > 0.0f && (i2 = this.A01) < this.A0A - 1) {
                View childAt2 = linearLayout.getChildAt(i2 + 1);
                float left2 = (float) childAt2.getLeft();
                float right2 = (float) childAt2.getRight();
                float f2 = this.A00;
                float f3 = 1.0f - f2;
                left = (left2 * f2) + (f3 * left);
                right = (right2 * f2) + (f3 * right);
            }
            float f4 = (float) height;
            canvas2.drawRect(left, (float) (height - this.A06), right, f4, paint);
            paint.setColor(this.A0F);
            canvas2.drawRect(0.0f, (float) (height - this.A0G), (float) linearLayout.getWidth(), f4, paint);
            Paint paint2 = this.A0H;
            paint2.setColor(this.A02);
            for (int i3 = 0; i3 < this.A0A - 1; i3++) {
                View childAt3 = linearLayout.getChildAt(i3);
                int i4 = this.A03;
                canvas2.drawLine((float) childAt3.getRight(), (float) i4, (float) childAt3.getRight(), (float) (height - i4), paint2);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C35711mN r2 = (C35711mN) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A01 = r2.A00;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C35711mN r1 = new C35711mN(super.onSaveInstanceState());
        r1.A00 = this.A01;
        return r1;
    }

    public void setOnPageChangeListener(C015507l r1) {
        this.A0M = r1;
    }

    public void setShouldExpand(boolean z2) {
        this.A0P = z2;
        requestLayout();
    }

    public void setTextColor(int i2) {
        this.A0C = i2;
        A01();
    }

    public void setTextSize(int i2) {
        this.A0D = i2;
        A01();
    }

    public void setViewPager(ViewPager viewPager) {
        this.A0N = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.A0W = this.A0Q;
            this.A0L.removeAllViews();
            this.A0A = this.A0N.getAdapter().A01();
            for (int i2 = 0; i2 < this.A0A; i2++) {
                AnonymousClass012 adapter = this.A0N.getAdapter();
                if (adapter instanceof C14830pp) {
                    A02(((C14830pp) adapter).AEF(i2), i2);
                } else {
                    String charSequence = adapter.A04(i2).toString();
                    TextView textView = new TextView(getContext());
                    textView.setText(charSequence);
                    textView.setGravity(17);
                    textView.setSingleLine();
                    A02(textView, i2);
                }
            }
            A01();
            getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 1));
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
