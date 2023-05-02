package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass02S;
import X.AnonymousClass030;
import X.AnonymousClass06y;
import X.AnonymousClass0Bo;
import X.AnonymousClass1VF;
import X.AnonymousClass1VG;
import X.AnonymousClass3OK;
import X.AnonymousClass3PD;
import X.AnonymousClass4RQ;
import X.C004601z;
import X.C13690nt;
import X.C53362fa;
import X.C53382fc;
import X.C53572fv;
import X.C90344dz;
import X.C91074fK;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.IDxIListenerShape218S0100000_2_I1;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;
import java.util.List;

@CoordinatorLayout.DefaultBehavior(Behavior.class)
public class AppBarLayout extends LinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass030 A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;

    public class BaseBehavior extends HeaderBehavior {
        public float A00;
        public int A01;
        public int A02;
        public int A03 = -1;
        public ValueAnimator A04;
        public WeakReference A05;
        public boolean A06;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ void A01(View view, View view2, CoordinatorLayout coordinatorLayout, int i2, int i3, int i4, int i5, int i6) {
            boolean A1Q;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i5 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                A0L(appBarLayout, coordinatorLayout2, A0K() - i5, -appBarLayout.getDownNestedScrollRange(), 0);
                if (i6 == 1 && A0K() == 0 && (view2 instanceof AnonymousClass02S)) {
                    ((AnonymousClass02S) view2).AgM(1);
                }
            }
            if (appBarLayout.A07 && appBarLayout.A09 != (A1Q = AnonymousClass000.A1Q(view2.getScrollY()))) {
                appBarLayout.A09 = A1Q;
                appBarLayout.refreshDrawableState();
            }
        }

        public /* bridge */ /* synthetic */ boolean A06(View view, CoordinatorLayout coordinatorLayout, int i2, int i3, int i4, int i5) {
            if (AnonymousClass000.A0O(view).height != -2) {
                return false;
            }
            coordinatorLayout.A0E(view, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public /* bridge */ /* synthetic */ Parcelable A07(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            AnonymousClass4RQ r0 = this.A01;
            int i2 = r0 != null ? r0.A02 : 0;
            int childCount = appBarLayout.getChildCount();
            boolean z2 = false;
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = appBarLayout.getChildAt(i3);
                int bottom = childAt.getBottom() + i2;
                if (childAt.getTop() + i2 > 0 || bottom < 0) {
                    i3++;
                } else {
                    AnonymousClass3PD r2 = new AnonymousClass3PD(absSavedState);
                    r2.A01 = i3;
                    if (bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                    r2.A02 = z2;
                    r2.A00 = ((float) bottom) / ((float) childAt.getHeight());
                    return r2;
                }
            }
            return absSavedState;
        }

        public /* bridge */ /* synthetic */ void A08(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
            if (parcelable instanceof AnonymousClass3PD) {
                AnonymousClass3PD r2 = (AnonymousClass3PD) parcelable;
                this.A03 = r2.A01;
                this.A00 = r2.A00;
                this.A06 = r2.A02;
                return;
            }
            this.A03 = -1;
        }

        public /* bridge */ /* synthetic */ void A09(View view, View view2, CoordinatorLayout coordinatorLayout, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.A01 == 0 || i2 == 1) {
                A0O(coordinatorLayout, appBarLayout);
            }
            this.A05 = C13690nt.A0h(view2);
        }

        public /* bridge */ /* synthetic */ void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 != 0) {
                int i5 = -appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = i3 < 0 ? appBarLayout.getDownNestedPreScrollRange() + i5 : 0;
                if (i5 != downNestedPreScrollRange) {
                    iArr[1] = A0L(appBarLayout, coordinatorLayout, A0K() - i3, i5, downNestedPreScrollRange);
                    if (i4 == 1) {
                        int A0K = A0K();
                        if (i3 < 0) {
                            if (A0K != 0) {
                                return;
                            }
                        } else if (A0K != (-appBarLayout.getDownNestedScrollRange())) {
                            return;
                        }
                        if (view2 instanceof AnonymousClass02S) {
                            ((AnonymousClass02S) view2).AgM(1);
                        }
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ boolean A0D(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i2, int i3) {
            boolean z2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i2 & 2) == 0 || (!appBarLayout.A07 && (appBarLayout.getTotalScrollRange() == 0 || coordinatorLayout.getHeight() - view2.getHeight() > appBarLayout.getHeight()))) {
                z2 = false;
            } else {
                z2 = true;
                ValueAnimator valueAnimator = this.A04;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.A05 = null;
            this.A01 = i3;
            return z2;
        }

        public /* bridge */ /* synthetic */ boolean A0F(View view, CoordinatorLayout coordinatorLayout, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            boolean A0F = super.A0F(appBarLayout, coordinatorLayout, i2);
            int i3 = appBarLayout.A02;
            int i4 = this.A03;
            if (i4 >= 0 && (i3 & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i4);
                A0M(appBarLayout, coordinatorLayout, (-childAt.getBottom()) + (this.A06 ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(((float) childAt.getHeight()) * this.A00)));
            } else if (i3 != 0) {
                boolean A1O = AnonymousClass000.A1O(i3 & 4);
                if ((i3 & 2) != 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    if (A1O) {
                        A0P(coordinatorLayout, appBarLayout, i5);
                    } else {
                        A0M(appBarLayout, coordinatorLayout, i5);
                    }
                } else if ((i3 & 1) != 0) {
                    if (A1O) {
                        A0P(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A0M(appBarLayout, coordinatorLayout, 0);
                    }
                }
            }
            appBarLayout.A02 = 0;
            this.A03 = -1;
            AnonymousClass4RQ r0 = this.A01;
            int i6 = r0 != null ? r0.A02 : 0;
            int i7 = -appBarLayout.getTotalScrollRange();
            int i8 = 0;
            if (i6 < i7) {
                i6 = i7;
            } else if (i6 > 0) {
                i6 = 0;
            }
            A0J(i6);
            AnonymousClass4RQ r02 = this.A01;
            if (r02 != null) {
                i8 = r02.A02;
            }
            A0Q(coordinatorLayout2, appBarLayout, i8, 0, true);
            AnonymousClass4RQ r03 = this.A01;
            int i9 = r03 != null ? r03.A02 : 0;
            List list = appBarLayout.A05;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    AnonymousClass1VG r04 = (AnonymousClass1VG) appBarLayout.A05.get(i10);
                    if (r04 != null) {
                        r04.AU9(appBarLayout, i9);
                    }
                }
            }
            return A0F;
        }

        public final void A0O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int A0K = A0K();
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = appBarLayout.getChildAt(i2);
                int top2 = childAt.getTop();
                int bottom = childAt.getBottom();
                AnonymousClass3OK r2 = (AnonymousClass3OK) childAt.getLayoutParams();
                if ((r2.A00 & 32) == 32) {
                    top2 -= r2.topMargin;
                    bottom += r2.bottomMargin;
                }
                int i3 = -A0K;
                if (top2 > i3 || bottom < i3) {
                    i2++;
                } else if (i2 >= 0) {
                    View childAt2 = appBarLayout.getChildAt(i2);
                    AnonymousClass3OK r6 = (AnonymousClass3OK) childAt2.getLayoutParams();
                    int i4 = r6.A00;
                    if ((i4 & 17) == 17) {
                        int i5 = -childAt2.getTop();
                        int i6 = -childAt2.getBottom();
                        if (i2 == appBarLayout.getChildCount() - 1) {
                            i6 += appBarLayout.getTopInset();
                        }
                        if ((i4 & 2) == 2) {
                            i6 += childAt2.getMinimumHeight();
                        } else if ((i4 & 5) == 5) {
                            int minimumHeight = childAt2.getMinimumHeight() + i6;
                            if (A0K < minimumHeight) {
                                i5 = minimumHeight;
                            } else {
                                i6 = minimumHeight;
                            }
                        }
                        if ((i4 & 32) == 32) {
                            i5 += r6.topMargin;
                            i6 -= r6.bottomMargin;
                        }
                        if (A0K < (i6 + i5) / 2) {
                            i5 = i6;
                        }
                        int i7 = -appBarLayout.getTotalScrollRange();
                        if (i5 >= i7) {
                            i7 = i5;
                            if (i5 > 0) {
                                i7 = 0;
                            }
                        }
                        A0P(coordinatorLayout, appBarLayout, i7);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }

        public final void A0P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            int A09 = AnonymousClass000.A09(A0K(), i2);
            float abs = Math.abs(0.0f);
            int round = abs > 0.0f ? Math.round((((float) A09) / abs) * 1000.0f) * 3 : (int) (((((float) A09) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            int A0K = A0K();
            ValueAnimator valueAnimator = this.A04;
            if (A0K != i2) {
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.A04 = valueAnimator2;
                    valueAnimator2.setInterpolator(C53572fv.A00);
                    this.A04.addUpdateListener(new C91074fK(coordinatorLayout, this, appBarLayout));
                } else {
                    valueAnimator.cancel();
                }
                this.A04.setDuration((long) Math.min(round, 600));
                this.A04.setIntValues(new int[]{A0K, i2});
                this.A04.start();
            } else if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A04.cancel();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r2 < r1) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void A0Q(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r3 = java.lang.Math.abs(r9)
                int r2 = r8.getChildCount()
                r1 = 0
            L_0x0009:
                if (r1 >= r2) goto L_0x00a2
                android.view.View r4 = r8.getChildAt(r1)
                int r0 = r4.getTop()
                if (r3 < r0) goto L_0x00b0
                int r0 = r4.getBottom()
                if (r3 > r0) goto L_0x00b0
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                X.3OK r0 = (X.AnonymousClass3OK) r0
                int r1 = r0.A00
                r0 = r1 & 1
                r5 = 1
                if (r0 == 0) goto L_0x0040
                int r3 = r4.getMinimumHeight()
                if (r10 <= 0) goto L_0x00ab
                r0 = r1 & 12
                if (r0 == 0) goto L_0x00ab
            L_0x0032:
                int r2 = -r9
                int r1 = r4.getBottom()
                int r1 = r1 - r3
                int r0 = r8.getTopInset()
                int r1 = r1 - r0
                r4 = 1
                if (r2 >= r1) goto L_0x0041
            L_0x0040:
                r4 = 0
            L_0x0041:
                boolean r0 = r8.A07
                if (r0 == 0) goto L_0x005e
                int r3 = r7.getChildCount()
                r2 = 0
            L_0x004a:
                if (r2 >= r3) goto L_0x005e
                android.view.View r1 = r7.getChildAt(r2)
                boolean r0 = r1 instanceof X.AnonymousClass02T
                if (r0 == 0) goto L_0x00a8
                if (r1 == 0) goto L_0x005e
                int r0 = r1.getScrollY()
                if (r0 > 0) goto L_0x005d
                r5 = 0
            L_0x005d:
                r4 = r5
            L_0x005e:
                boolean r0 = r8.A09
                if (r0 == r4) goto L_0x00a6
                r8.A09 = r4
                r8.refreshDrawableState()
                r0 = 1
            L_0x0068:
                if (r11 != 0) goto L_0x009f
                if (r0 == 0) goto L_0x00a2
                X.0Pi r0 = r7.A0C
                X.00O r0 = r0.A00
                java.lang.Object r0 = r0.get(r8)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r4 = r7.A0F
                r4.clear()
                if (r0 == 0) goto L_0x0080
                r4.addAll(r0)
            L_0x0080:
                int r3 = r4.size()
                r2 = 0
            L_0x0085:
                if (r2 >= r3) goto L_0x00a2
                java.lang.Object r0 = r4.get(r2)
                android.view.View r0 = (android.view.View) r0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                X.0Bo r0 = (X.AnonymousClass0Bo) r0
                X.06y r1 = r0.A0A
                boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x00a3
                com.google.android.material.appbar.HeaderScrollingViewBehavior r1 = (com.google.android.material.appbar.HeaderScrollingViewBehavior) r1
                int r0 = r1.A00
                if (r0 == 0) goto L_0x00a2
            L_0x009f:
                r8.jumpDrawablesToCurrentState()
            L_0x00a2:
                return
            L_0x00a3:
                int r2 = r2 + 1
                goto L_0x0085
            L_0x00a6:
                r0 = 0
                goto L_0x0068
            L_0x00a8:
                int r2 = r2 + 1
                goto L_0x004a
            L_0x00ab:
                r0 = r1 & 2
                if (r0 == 0) goto L_0x0040
                goto L_0x0032
            L_0x00b0:
                int r1 = r1 + 1
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0Q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }
    }

    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53362fa.A0C);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean A03(Rect rect, View view, CoordinatorLayout coordinatorLayout, boolean z2) {
            AppBarLayout appBarLayout;
            List A07 = coordinatorLayout.A07(view);
            int size = A07.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) A07.get(i2);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i2++;
            }
            boolean z3 = false;
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.A02;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    z3 = true;
                    int i3 = 0;
                    if (!z2) {
                        i3 = 4;
                    }
                    appBarLayout.A02 = 2 | i3 | 8;
                    appBarLayout.requestLayout();
                }
            }
            return z3;
        }

        public boolean A05(View view, View view2, CoordinatorLayout coordinatorLayout) {
            boolean A1Q;
            AnonymousClass06y r1 = ((AnonymousClass0Bo) view2.getLayoutParams()).A0A;
            if (r1 instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) r1).A02 + this.A01;
                int i2 = 0;
                if (this.A00 != 0) {
                    float A0K = A0K(view2);
                    int i3 = this.A00;
                    int i4 = (int) (A0K * ((float) i3));
                    if (i4 >= 0) {
                        i2 = i4;
                        if (i4 > i3) {
                            i2 = i3;
                        }
                    }
                }
                C004601z.A0b(view, bottom - i2);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.A07 || appBarLayout.A09 == (A1Q = AnonymousClass000.A1Q(view.getScrollY()))) {
                return false;
            }
            appBarLayout.A09 = A1Q;
            appBarLayout.refreshDrawableState();
            return false;
        }

        public boolean A0H(View view, View view2, CoordinatorLayout coordinatorLayout) {
            return view2 instanceof AppBarLayout;
        }
    }

    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.A03 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = 0;
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            C90344dz.A00(this);
            C90344dz.A02(this, attributeSet);
        }
        TypedArray A002 = C53382fc.A00(context2, attributeSet2, C53362fa.A00, new int[0], 0, R.style.style0410);
        setBackground(A002.getDrawable(0));
        if (A002.hasValue(4)) {
            this.A02 = A002.getBoolean(4, false) ? 1 : 2;
            requestLayout();
        }
        if (i2 >= 21) {
            if (A002.hasValue(3)) {
                C90344dz.A01(this, (float) A002.getDimensionPixelSize(3, 0));
            }
            if (i2 >= 26) {
                if (A002.hasValue(2)) {
                    setKeyboardNavigationCluster(A002.getBoolean(2, false));
                }
                if (A002.hasValue(1)) {
                    setTouchscreenBlocksFocus(A002.getBoolean(1, false));
                }
            }
        }
        this.A07 = A002.getBoolean(5, false);
        A002.recycle();
        C004601z.A0k(this, new IDxIListenerShape218S0100000_2_I1(this, 0));
    }

    public static AnonymousClass3OK A00(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new AnonymousClass3OK((ViewGroup.MarginLayoutParams) layoutParams) : new AnonymousClass3OK(layoutParams) : new AnonymousClass3OK((LinearLayout.LayoutParams) layoutParams);
    }

    public void A01(AnonymousClass1VF r2) {
        List list = this.A05;
        if (list == null) {
            list = AnonymousClass000.A0u();
            this.A05 = list;
        }
        if (!list.contains(r2)) {
            this.A05.add(r2);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass3OK;
    }

    public int getDownNestedPreScrollRange() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            AnonymousClass3OK r4 = (AnonymousClass3OK) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = r4.A00;
            if ((i4 & 5) == 5) {
                int i5 = i3 + r4.topMargin + r4.bottomMargin;
                if ((i4 & 8) != 0) {
                    i3 = i5 + childAt.getMinimumHeight();
                } else {
                    i3 = i5 + (measuredHeight - ((i4 & 2) != 0 ? childAt.getMinimumHeight() : getTopInset()));
                }
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.A00 = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.A01;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            AnonymousClass3OK r3 = (AnonymousClass3OK) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + r3.topMargin + r3.bottomMargin;
            int i5 = r3.A00;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= childAt.getMinimumHeight() + getTopInset();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.A01 = max;
        return max;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = getChildAt((r1 = getChildCount()) - 1).getMinimumHeight();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getMinimumHeightForVisibleOverlappingContent() {
        /*
            r3 = this;
            int r2 = r3.getTopInset()
            int r0 = r3.getMinimumHeight()
            if (r0 != 0) goto L_0x001c
            int r1 = r3.getChildCount()
            r0 = 1
            if (r1 < r0) goto L_0x0020
            int r1 = r1 - r0
            android.view.View r0 = r3.getChildAt(r1)
            int r0 = r0.getMinimumHeight()
            if (r0 == 0) goto L_0x0020
        L_0x001c:
            int r0 = r0 << 1
            int r0 = r0 + r2
            return r0
        L_0x0020:
            int r0 = r3.getHeight()
            int r0 = r0 / 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getMinimumHeightForVisibleOverlappingContent():int");
    }

    public int getPendingAction() {
        return this.A02;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        AnonymousClass030 r0 = this.A04;
        if (r0 != null) {
            return r0.A06();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.A03;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            AnonymousClass3OK r3 = (AnonymousClass3OK) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = r3.A00;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + r3.topMargin + r3.bottomMargin;
            if ((i5 & 2) != 0) {
                i4 -= childAt.getMinimumHeight();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4 - getTopInset());
        this.A03 = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r1 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r1 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] onCreateDrawableState(int r7) {
        /*
            r6 = this;
            int[] r4 = r6.A0A
            if (r4 != 0) goto L_0x0009
            r0 = 4
            int[] r4 = new int[r0]
            r6.A0A = r4
        L_0x0009:
            int r0 = r4.length
            int r7 = r7 + r0
            int[] r5 = super.onCreateDrawableState(r7)
            r1 = 0
            boolean r3 = r6.A08
            r0 = 2130969787(0x7f0404bb, float:1.7548266E38)
            if (r3 != 0) goto L_0x0018
            int r0 = -r0
        L_0x0018:
            r4[r1] = r0
            r2 = 1
            if (r3 == 0) goto L_0x0024
            boolean r1 = r6.A09
            r0 = 2130969788(0x7f0404bc, float:1.7548268E38)
            if (r1 != 0) goto L_0x0028
        L_0x0024:
            r0 = 2130969788(0x7f0404bc, float:1.7548268E38)
            int r0 = -r0
        L_0x0028:
            r4[r2] = r0
            r1 = 2
            r0 = 2130969786(0x7f0404ba, float:1.7548264E38)
            if (r3 != 0) goto L_0x0031
            int r0 = -r0
        L_0x0031:
            r4[r1] = r0
            r2 = 3
            if (r3 == 0) goto L_0x003d
            boolean r1 = r6.A09
            r0 = 2130969785(0x7f0404b9, float:1.7548262E38)
            if (r1 != 0) goto L_0x0041
        L_0x003d:
            r0 = 2130969785(0x7f0404b9, float:1.7548262E38)
            int r0 = -r0
        L_0x0041:
            r4[r2] = r0
            int[] r0 = android.widget.LinearLayout.mergeDrawableStates(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r0 = -1
            r6.A03 = r0
            r6.A00 = r0
            r6.A01 = r0
            r5 = 0
            r6.A06 = r5
            int r2 = r6.getChildCount()
            r1 = 0
        L_0x0012:
            r4 = 1
            if (r1 >= r2) goto L_0x0025
            android.view.View r0 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.3OK r0 = (X.AnonymousClass3OK) r0
            android.view.animation.Interpolator r0 = r0.A01
            if (r0 == 0) goto L_0x0052
            r6.A06 = r4
        L_0x0025:
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0044
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x002e:
            if (r2 >= r3) goto L_0x0045
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.3OK r0 = (X.AnonymousClass3OK) r0
            int r1 = r0.A00
            r0 = r1 & 1
            if (r0 != r4) goto L_0x004f
            r0 = r1 & 10
            if (r0 == 0) goto L_0x004f
        L_0x0044:
            r5 = 1
        L_0x0045:
            boolean r0 = r6.A08
            if (r0 == r5) goto L_0x004e
            r6.A08 = r5
            r6.refreshDrawableState()
        L_0x004e:
            return
        L_0x004f:
            int r2 = r2 + 1
            goto L_0x002e
        L_0x0052:
            int r1 = r1 + 1
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.A03 = -1;
        this.A00 = -1;
        this.A01 = -1;
    }

    public void setExpanded(boolean z2) {
        boolean A0u = C004601z.A0u(this);
        int i2 = 2;
        if (z2) {
            i2 = 1;
        }
        int i3 = 0;
        if (A0u) {
            i3 = 4;
        }
        this.A02 = i2 | i3 | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z2) {
        this.A07 = z2;
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw AnonymousClass000.A0T("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C90344dz.A01(this, f2);
        }
    }
}
