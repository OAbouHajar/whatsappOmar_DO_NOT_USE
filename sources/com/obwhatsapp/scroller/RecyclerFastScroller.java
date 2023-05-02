package com.obwhatsapp.scroller;

import X.AnonymousClass006;
import X.AnonymousClass01X;
import X.AnonymousClass078;
import X.AnonymousClass3D2;
import X.C52662eE;
import X.C54642hu;
import X.C98924tC;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxDObserverShape31S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.google.android.material.appbar.AppBarLayout;

public class RecyclerFastScroller extends FrameLayout implements AnonymousClass006 {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public CoordinatorLayout A04;
    public AnonymousClass01X A05;
    public RecyclerView A06;
    public AppBarLayout A07;
    public C54642hu A08;
    public C52662eE A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass078 A0D;
    public final Runnable A0E;

    public RecyclerFastScroller(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public RecyclerFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerFastScroller(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public RecyclerFastScroller(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
        this.A0D = new IDxDObserverShape31S0100000_2_I0(this, 3);
        this.A0E = new RunnableRunnableShape14S0100000_I0_13((Object) this, 10);
        this.A01 = 1500;
        this.A0A = true;
    }

    /* access modifiers changed from: private */
    public int getVisibleHeight() {
        return (this.A04 == null || this.A07 == null) ? getHeight() : Math.min(getHeight(), (this.A04.getHeight() - this.A07.getHeight()) + this.A00);
    }

    public void A01() {
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null && this.A0A) {
            Runnable runnable = this.A0E;
            recyclerView.removeCallbacks(runnable);
            this.A06.postDelayed(runnable, (long) this.A01);
        }
    }

    public final void A02() {
        requestLayout();
        if (this.A03.getVisibility() != 0) {
            this.A03.setVisibility(0);
            float f2 = 1.0f;
            if (this.A0C) {
                f2 = -1.0f;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, f2, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(200);
            this.A03.startAnimation(translateAnimation);
        }
        A01();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A09;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public int getHideDelay() {
        return this.A01;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int right;
        int left;
        int top2;
        int left2;
        super.onLayout(z2, i2, i3, i4, i5);
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() + this.A00;
            int computeVerticalScrollRange = this.A06.computeVerticalScrollRange();
            AppBarLayout appBarLayout = this.A07;
            int i7 = 0;
            int totalScrollRange = appBarLayout == null ? 0 : appBarLayout.getTotalScrollRange();
            int visibleHeight = getVisibleHeight();
            float paddingBottom = ((float) computeVerticalScrollOffset) / ((float) (((computeVerticalScrollRange + totalScrollRange) + this.A06.getPaddingBottom()) - visibleHeight));
            View view = this.A03;
            if (view != null) {
                float height = paddingBottom * ((float) (visibleHeight - view.getHeight()));
                boolean z3 = this.A0C;
                View view2 = this.A03;
                if (z3) {
                    i6 = (int) height;
                    right = view2.getWidth();
                } else {
                    i7 = getRight() - this.A03.getWidth();
                    i6 = (int) height;
                    right = getRight();
                }
                view2.layout(i7, i6, right, this.A03.getHeight() + i6);
                View view3 = this.A02;
                if (view3 != null) {
                    boolean z4 = this.A0C;
                    View view4 = this.A03;
                    if (z4) {
                        left = view4.getRight();
                        top2 = ((this.A03.getTop() + this.A03.getBottom()) - this.A02.getHeight()) >> 1;
                        left2 = this.A03.getRight() + this.A02.getWidth();
                    } else {
                        left = view4.getLeft() - this.A02.getWidth();
                        top2 = ((this.A03.getTop() + this.A03.getBottom()) - this.A02.getHeight()) >> 1;
                        left2 = this.A03.getLeft();
                    }
                    view3.layout(left, top2, left2, ((this.A03.getTop() + this.A03.getBottom()) + this.A02.getHeight()) >> 1);
                }
            }
        }
    }

    public void setAdapter(AnonymousClass01X r3) {
        AnonymousClass01X r0 = this.A05;
        if (r0 != r3) {
            if (r0 != null) {
                r0.A01.unregisterObserver(this.A0D);
            }
            if (r3 != null) {
                r3.A01.registerObserver(this.A0D);
            }
            this.A05 = r3;
        }
    }

    public void setAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.A04 = coordinatorLayout;
        this.A07 = appBarLayout;
        appBarLayout.A01(new C98924tC(this));
    }

    public void setBubbleView(View view, C54642hu r4) {
        this.A08 = r4;
        this.A02 = view;
        view.setVisibility(4);
        addView(this.A02, -2, -2);
    }

    public void setHideDelay(int i2) {
        this.A01 = i2;
    }

    public void setHidingEnabled(boolean z2) {
        this.A0A = z2;
        if (z2) {
            A01();
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        recyclerView.A0o(new IDxSListenerShape34S0100000_2_I0(this, 13));
        AnonymousClass01X r0 = recyclerView.A0N;
        if (r0 != null) {
            setAdapter(r0);
        }
    }

    public void setRtl(boolean z2) {
        this.A0C = z2;
    }

    public void setThumbView(View view) {
        View view2 = this.A03;
        if (view2 != null) {
            removeView(view2);
        }
        this.A03 = view;
        view.setVisibility(4);
        this.A03.setOnTouchListener(new AnonymousClass3D2(this));
        addView(this.A03, -2, -2);
    }
}
