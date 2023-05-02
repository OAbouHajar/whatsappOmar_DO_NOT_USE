package com.google.android.material.appbar;

import X.AnonymousClass1VG;
import X.AnonymousClass3OK;
import X.AnonymousClass4RQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;

public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public VelocityTracker A03;
    public OverScroller A04;
    public Runnable A05;
    public boolean A06;

    public HeaderBehavior() {
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 != 3) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(android.view.MotionEvent r7, android.view.View r8, androidx.coordinatorlayout.widget.CoordinatorLayout r9) {
        /*
            r6 = this;
            int r0 = r6.A02
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r9.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.A02 = r0
        L_0x0012:
            int r0 = r7.getAction()
            r5 = 2
            r4 = 1
            if (r0 != r5) goto L_0x001f
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            int r2 = r7.getActionMasked()
            r3 = 0
            if (r2 == 0) goto L_0x0056
            r1 = -1
            if (r2 == r4) goto L_0x007f
            if (r2 == r5) goto L_0x0038
            r0 = 3
            if (r2 == r0) goto L_0x007f
        L_0x002e:
            android.view.VelocityTracker r0 = r6.A03
            if (r0 == 0) goto L_0x0035
            r0.addMovement(r7)
        L_0x0035:
            boolean r0 = r6.A06
            return r0
        L_0x0038:
            int r0 = r6.A00
            if (r0 == r1) goto L_0x002e
            int r0 = r7.findPointerIndex(r0)
            if (r0 == r1) goto L_0x002e
            float r0 = r7.getY(r0)
            int r2 = (int) r0
            int r0 = r6.A01
            int r1 = X.AnonymousClass000.A09(r2, r0)
            int r0 = r6.A02
            if (r1 <= r0) goto L_0x002e
            r6.A06 = r4
            r6.A01 = r2
            goto L_0x002e
        L_0x0056:
            r6.A06 = r3
            float r0 = r7.getX()
            int r2 = (int) r0
            float r0 = r7.getY()
            int r1 = (int) r0
            boolean r0 = r6.A0N()
            if (r0 == 0) goto L_0x002e
            boolean r0 = r9.A0I(r8, r2, r1)
            if (r0 == 0) goto L_0x002e
            r6.A01 = r1
            int r0 = r7.getPointerId(r3)
            r6.A00 = r0
            android.view.VelocityTracker r0 = r6.A03
            if (r0 != 0) goto L_0x002e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            goto L_0x008b
        L_0x007f:
            r6.A06 = r3
            r6.A00 = r1
            android.view.VelocityTracker r0 = r6.A03
            if (r0 == 0) goto L_0x002e
            r0.recycle()
            r0 = 0
        L_0x008b:
            r6.A03 = r0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0B(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r7 != 3) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(android.view.MotionEvent r20, android.view.View r21, androidx.coordinatorlayout.widget.CoordinatorLayout r22) {
        /*
            r19 = this;
            r4 = r21
            r2 = r19
            int r0 = r2.A02
            r3 = r22
            if (r0 >= 0) goto L_0x0018
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r2.A02 = r0
        L_0x0018:
            r5 = r20
            int r7 = r5.getActionMasked()
            r1 = 1
            r11 = 0
            if (r7 == 0) goto L_0x0076
            r6 = -1
            if (r7 == r1) goto L_0x009d
            r0 = 2
            if (r7 == r0) goto L_0x0033
            r0 = 3
            if (r7 == r0) goto L_0x0100
        L_0x002b:
            android.view.VelocityTracker r0 = r2.A03
            if (r0 == 0) goto L_0x0032
            r0.addMovement(r5)
        L_0x0032:
            return r1
        L_0x0033:
            int r0 = r2.A00
            int r0 = r5.findPointerIndex(r0)
            if (r0 == r6) goto L_0x0122
            float r0 = r5.getY(r0)
            int r8 = (int) r0
            int r7 = r2.A01
            int r7 = r7 - r8
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0054
            int r6 = java.lang.Math.abs(r7)
            int r0 = r2.A02
            if (r6 <= r0) goto L_0x002b
            r2.A06 = r1
            if (r7 <= 0) goto L_0x0074
            int r7 = r7 - r0
        L_0x0054:
            r2.A01 = r8
            boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r0 == 0) goto L_0x006f
            r0 = r4
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
        L_0x0061:
            int r0 = -r0
            int r9 = r2.A0K()
            int r9 = r9 - r7
            r8 = r3
            r10 = r0
            r6 = r2
            r7 = r4
            r6.A0L(r7, r8, r9, r10, r11)
            goto L_0x002b
        L_0x006f:
            int r0 = r4.getHeight()
            goto L_0x0061
        L_0x0074:
            int r7 = r7 + r0
            goto L_0x0054
        L_0x0076:
            float r0 = r5.getX()
            int r7 = (int) r0
            float r0 = r5.getY()
            int r6 = (int) r0
            boolean r0 = r3.A0I(r4, r7, r6)
            if (r0 == 0) goto L_0x0122
            boolean r0 = r2.A0N()
            if (r0 == 0) goto L_0x0122
            r2.A01 = r6
            int r0 = r5.getPointerId(r11)
            r2.A00 = r0
            android.view.VelocityTracker r0 = r2.A03
            if (r0 != 0) goto L_0x002b
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            goto L_0x010c
        L_0x009d:
            android.view.VelocityTracker r0 = r2.A03
            if (r0 == 0) goto L_0x0100
            r0.addMovement(r5)
            android.view.VelocityTracker r7 = r2.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r2.A03
            int r0 = r2.A00
            float r9 = r7.getYVelocity(r0)
            boolean r7 = r2 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r7 == 0) goto L_0x011d
            r0 = r4
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getTotalScrollRange()
        L_0x00be:
            int r0 = -r0
            java.lang.Runnable r8 = r2.A05
            if (r8 == 0) goto L_0x00c9
            r4.removeCallbacks(r8)
            r8 = 0
            r2.A05 = r8
        L_0x00c9:
            android.widget.OverScroller r10 = r2.A04
            if (r10 != 0) goto L_0x00d8
            android.content.Context r8 = r4.getContext()
            android.widget.OverScroller r10 = new android.widget.OverScroller
            r10.<init>(r8)
            r2.A04 = r10
        L_0x00d8:
            X.4RQ r8 = r2.A01
            if (r8 == 0) goto L_0x011b
            int r12 = r8.A02
        L_0x00de:
            int r14 = java.lang.Math.round(r9)
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r17 = r0
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r2.A04
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x0110
            r7 = 3
            com.facebook.redex.RunnableRunnableShape3S0300000_I1 r0 = new com.facebook.redex.RunnableRunnableShape3S0300000_I1
            r0.<init>(r4, r3, r2, r7)
            r2.A05 = r0
            r4.postOnAnimation(r0)
        L_0x0100:
            r2.A06 = r11
            r2.A00 = r6
            android.view.VelocityTracker r0 = r2.A03
            if (r0 == 0) goto L_0x002b
            r0.recycle()
            r0 = 0
        L_0x010c:
            r2.A03 = r0
            goto L_0x002b
        L_0x0110:
            if (r7 == 0) goto L_0x0100
            r0 = r2
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            r0.A0O(r3, r4)
            goto L_0x0100
        L_0x011b:
            r12 = 0
            goto L_0x00de
        L_0x011d:
            int r0 = r4.getHeight()
            goto L_0x00be
        L_0x0122:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0C(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public int A0K() {
        if (this instanceof AppBarLayout.BaseBehavior) {
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
            AnonymousClass4RQ r0 = baseBehavior.A01;
            return (r0 != null ? r0.A02 : 0) + baseBehavior.A02;
        }
        AnonymousClass4RQ r02 = this.A01;
        if (r02 != null) {
            return r02.A02;
        }
        return 0;
    }

    public int A0L(View view, CoordinatorLayout coordinatorLayout, int i2, int i3, int i4) {
        int i5 = i3;
        View view2 = view;
        int i6 = i2;
        int i7 = i4;
        if (this instanceof AppBarLayout.BaseBehavior) {
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            int A0K = baseBehavior.A0K();
            int i8 = 0;
            if (i3 == 0 || A0K < i5 || A0K > i7) {
                baseBehavior.A02 = 0;
                return 0;
            }
            if (i6 >= i5) {
                i5 = i6;
                if (i6 > i7) {
                    i5 = i7;
                }
            }
            if (A0K != i5) {
                int i9 = i5;
                if (appBarLayout.A06) {
                    int abs = Math.abs(i5);
                    int childCount = appBarLayout.getChildCount();
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = appBarLayout.getChildAt(i11);
                        AnonymousClass3OK r7 = (AnonymousClass3OK) childAt.getLayoutParams();
                        Interpolator interpolator = r7.A01;
                        if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                            i11++;
                        } else if (interpolator != null) {
                            int i12 = r7.A00;
                            if ((i12 & 1) != 0) {
                                i10 = childAt.getHeight() + r7.topMargin + r7.bottomMargin;
                                if ((i12 & 2) != 0) {
                                    i10 -= childAt.getMinimumHeight();
                                }
                            }
                            if (childAt.getFitsSystemWindows()) {
                                i10 -= appBarLayout.getTopInset();
                            }
                            if (i10 > 0) {
                                float f2 = (float) i10;
                                i9 = Integer.signum(i5) * (childAt.getTop() + Math.round(f2 * interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f2)));
                            }
                        }
                    }
                }
                boolean A0J = baseBehavior.A0J(i9);
                i8 = A0K - i5;
                baseBehavior.A02 = i5 - i9;
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                if (!A0J && appBarLayout.A06) {
                    coordinatorLayout2.A0C(appBarLayout);
                }
                AnonymousClass4RQ r0 = baseBehavior.A01;
                int i13 = r0 != null ? r0.A02 : 0;
                List list = appBarLayout.A05;
                if (list != null) {
                    int size = list.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        AnonymousClass1VG r02 = (AnonymousClass1VG) appBarLayout.A05.get(i14);
                        if (r02 != null) {
                            r02.AU9(appBarLayout, i13);
                        }
                    }
                }
                int i15 = 1;
                if (i5 < A0K) {
                    i15 = -1;
                }
                baseBehavior.A0Q(coordinatorLayout2, appBarLayout, i5, i15, false);
            }
            return i8;
        }
        AnonymousClass4RQ r03 = this.A01;
        int i16 = r03 != null ? r03.A02 : 0;
        if (i3 == 0 || i16 < i5 || i16 > i7) {
            return 0;
        }
        if (i6 >= i5) {
            i5 = i6;
            if (i6 > i7) {
                i5 = i7;
            }
        }
        if (i16 == i5) {
            return 0;
        }
        A0J(i5);
        return i16 - i5;
    }

    public void A0M(View view, CoordinatorLayout coordinatorLayout, int i2) {
        A0L(view, coordinatorLayout, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r1 = (android.view.View) r0.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0N() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r0 == 0) goto L_0x0024
            r0 = r3
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            java.lang.ref.WeakReference r0 = r0.A05
            r2 = 1
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x0022
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            return r2
        L_0x0022:
            r2 = 0
            return r2
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0N():boolean");
    }
}
