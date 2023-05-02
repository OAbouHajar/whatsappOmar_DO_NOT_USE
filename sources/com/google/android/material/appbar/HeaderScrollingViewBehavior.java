package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass030;
import X.AnonymousClass06y;
import X.AnonymousClass0Bo;
import X.C05570Sc;
import X.C13690nt;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;

public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int A00;
    public int A01 = 0;
    public final Rect A02 = AnonymousClass000.A0J();
    public final Rect A03 = AnonymousClass000.A0J();

    public HeaderScrollingViewBehavior() {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A06(View view, CoordinatorLayout coordinatorLayout, int i2, int i3, int i4, int i5) {
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            List A07 = coordinatorLayout.A07(view);
            int size = A07.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                View view2 = (View) A07.get(i7);
                if (!(view2 instanceof AppBarLayout)) {
                    i7++;
                } else if (view2 != null) {
                    if (view2.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        view.setFitsSystemWindows(true);
                        if (view.getFitsSystemWindows()) {
                            view.requestLayout();
                            return true;
                        }
                    }
                    int size2 = View.MeasureSpec.getSize(i4);
                    if (size2 == 0) {
                        size2 = coordinatorLayout.getHeight();
                    }
                    int measuredHeight = (size2 - view2.getMeasuredHeight()) + (this instanceof AppBarLayout.ScrollingViewBehavior ? ((AppBarLayout) view2).getTotalScrollRange() : view2.getMeasuredHeight());
                    int i8 = Integer.MIN_VALUE;
                    if (i6 == -1) {
                        i8 = 1073741824;
                    }
                    coordinatorLayout.A0E(view, i2, i3, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                    return true;
                }
            }
        }
        return false;
    }

    public void A0I(View view, CoordinatorLayout coordinatorLayout, int i2) {
        int i3;
        List A07 = coordinatorLayout.A07(view);
        int size = A07.size();
        int i4 = 0;
        while (true) {
            int i5 = i2;
            if (i4 >= size) {
                break;
            }
            View view2 = (View) A07.get(i4);
            if (!(view2 instanceof AppBarLayout)) {
                i4++;
            } else if (view2 != null) {
                AnonymousClass0Bo r4 = (AnonymousClass0Bo) view.getLayoutParams();
                Rect rect = this.A02;
                rect.set(coordinatorLayout.getPaddingLeft() + r4.leftMargin, view2.getBottom() + r4.topMargin, C13690nt.A04(coordinatorLayout) - r4.rightMargin, ((coordinatorLayout.getHeight() + view2.getBottom()) - coordinatorLayout.getPaddingBottom()) - r4.bottomMargin);
                AnonymousClass030 r2 = coordinatorLayout.A06;
                if (r2 != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left += r2.A04();
                    rect.right -= r2.A05();
                }
                Rect rect2 = this.A03;
                int i6 = r4.A02;
                if (i6 == 0) {
                    i6 = 8388659;
                }
                C05570Sc.A01(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i5);
                int i7 = 0;
                if (this.A00 != 0) {
                    float A0K = A0K(view2);
                    int i8 = this.A00;
                    int i9 = (int) (A0K * ((float) i8));
                    if (i9 >= 0) {
                        i7 = i9;
                        if (i9 > i8) {
                            i7 = i8;
                        }
                    }
                }
                view.layout(rect2.left, rect2.top - i7, rect2.right, rect2.bottom - i7);
                i3 = rect2.top - view2.getBottom();
            }
        }
        coordinatorLayout.A0D(view, i2);
        i3 = 0;
        this.A01 = i3;
    }

    public float A0K(View view) {
        int i2;
        if (!(this instanceof AppBarLayout.ScrollingViewBehavior)) {
            return 1.0f;
        }
        if (!(view instanceof AppBarLayout)) {
            return 0.0f;
        }
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
        AnonymousClass06y r1 = ((AnonymousClass0Bo) appBarLayout.getLayoutParams()).A0A;
        int A0K = r1 instanceof AppBarLayout.BaseBehavior ? ((HeaderBehavior) r1).A0K() : 0;
        if ((downNestedPreScrollRange == 0 || totalScrollRange + A0K > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
            return (((float) A0K) / ((float) i2)) + 1.0f;
        }
        return 0.0f;
    }
}
