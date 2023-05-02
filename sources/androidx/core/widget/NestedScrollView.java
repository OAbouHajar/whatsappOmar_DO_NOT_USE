package androidx.core.widget;

import X.AnonymousClass02S;
import X.AnonymousClass02U;
import X.AnonymousClass09V;
import X.AnonymousClass0EJ;
import X.AnonymousClass0VT;
import X.AnonymousClass0XH;
import X.C004601z;
import X.C02390Bk;
import X.C04270Lw;
import X.C04770Nw;
import X.C12410kM;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.obwhatsapp.R;

public class NestedScrollView extends FrameLayout implements AnonymousClass02S, AnonymousClass09V, AnonymousClass02U {
    public static final AnonymousClass0EJ A0Q = new AnonymousClass0EJ();
    public static final int[] A0R = {16843130};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public VelocityTracker A09;
    public View A0A;
    public EdgeEffect A0B;
    public EdgeEffect A0C;
    public OverScroller A0D;
    public C12410kM A0E;
    public C02390Bk A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final Rect A0L;
    public final AnonymousClass0XH A0M;
    public final C04770Nw A0N;
    public final int[] A0O;
    public final int[] A0P;

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr039e);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A0L = new Rect();
        this.A0J = true;
        this.A0I = false;
        this.A0A = null;
        this.A0H = false;
        this.A0K = true;
        this.A01 = -1;
        this.A0P = new int[2];
        this.A0O = new int[2];
        int i3 = Build.VERSION.SDK_INT;
        this.A0C = i3 >= 31 ? AnonymousClass0VT.A02(context, attributeSet) : new EdgeEffect(context);
        this.A0B = i3 >= 31 ? AnonymousClass0VT.A02(context, attributeSet) : new EdgeEffect(context);
        this.A0D = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A07 = viewConfiguration.getScaledTouchSlop();
        this.A05 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A04 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0R, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A0N = new C04770Nw();
        this.A0M = new AnonymousClass0XH(this);
        setNestedScrollingEnabled(true);
        C004601z.A0j(this, A0Q);
    }

    public static float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AnonymousClass0VT.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static float A01(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AnonymousClass0VT.A01(edgeEffect, f2, f3);
        }
        C04270Lw.A00(edgeEffect, f2, f3);
        return f2;
    }

    public static boolean A02(View view, View view2) {
        if (view != view2) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || !A02((View) parent, view2)) {
                return false;
            }
        }
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        float f2 = this.A00;
        if (f2 != 0.0f) {
            return f2;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
            this.A00 = dimension;
            return dimension;
        }
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
    }

    public int A03(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = i2 - verticalFadingEdgeLength;
        if (rect.bottom >= childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i3 = i2;
        }
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public void A04(int i2) {
        if (getChildCount() > 0) {
            this.A0D.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.A0M.A03(2, 1);
            this.A03 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final void A05(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.A0K) {
            A06(0, i2, false);
        } else {
            scrollBy(0, i2);
        }
    }

    public final void A06(int i2, int i3, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.A08 > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.A0D;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z2) {
                    this.A0M.A03(2, 1);
                } else {
                    AgM(1);
                }
                this.A03 = getScrollY();
                postInvalidateOnAnimation();
            } else {
                OverScroller overScroller2 = this.A0D;
                if (!overScroller2.isFinished()) {
                    overScroller2.abortAnimation();
                    AgM(1);
                }
                scrollBy(i2, i3);
            }
            this.A08 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void A07(int i2, int[] iArr, int i3) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A0M.A05((int[]) null, iArr2, 0, scrollY2, 0, i2 - scrollY2, i3);
    }

    public final void A08(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A01) {
            int i2 = 0;
            if (actionIndex == 0) {
                i2 = 1;
            }
            this.A02 = (int) motionEvent.getY(i2);
            this.A01 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.A09;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean A09(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !A0D(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A05(maxScrollAmount);
        } else {
            Rect rect = this.A0L;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A05(A03(rect));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus == null || !findFocus.isFocused() || !(!A0D(findFocus, 0, getHeight()))) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r2 >= r0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(int r18, int r19, int r20) {
        /*
            r17 = this;
            r13 = r19
            r11 = r17
            int r10 = r11.getHeight()
            int r9 = r11.getScrollY()
            int r10 = r10 + r9
            r16 = 0
            r0 = 33
            r15 = 0
            r12 = r18
            if (r12 != r0) goto L_0x0017
            r15 = 1
        L_0x0017:
            r0 = 2
            java.util.ArrayList r8 = r11.getFocusables(r0)
            int r7 = r8.size()
            r6 = 0
            r5 = 0
            r14 = 0
        L_0x0023:
            r0 = r20
            if (r5 >= r7) goto L_0x0064
            java.lang.Object r4 = r8.get(r5)
            android.view.View r4 = (android.view.View) r4
            int r3 = r4.getTop()
            int r2 = r4.getBottom()
            if (r13 >= r2) goto L_0x0043
            if (r3 >= r0) goto L_0x0043
            if (r13 >= r3) goto L_0x003e
            r1 = 1
            if (r2 < r0) goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r6 != 0) goto L_0x0046
            r6 = r4
            r14 = r1
        L_0x0043:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0046:
            if (r15 == 0) goto L_0x005c
            int r0 = r6.getTop()
            if (r3 < r0) goto L_0x0062
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r14 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0043
        L_0x0053:
            if (r0 == 0) goto L_0x0043
            r6 = r4
            goto L_0x0043
        L_0x0057:
            if (r1 == 0) goto L_0x0053
            r6 = r4
            r14 = 1
            goto L_0x0043
        L_0x005c:
            int r0 = r6.getBottom()
            if (r2 <= r0) goto L_0x004e
        L_0x0062:
            r0 = 1
            goto L_0x004f
        L_0x0064:
            if (r6 != 0) goto L_0x0067
            r6 = r11
        L_0x0067:
            if (r13 < r9) goto L_0x0075
            if (r0 > r10) goto L_0x0075
        L_0x006b:
            android.view.View r0 = r11.findFocus()
            if (r6 == r0) goto L_0x0074
            r6.requestFocus(r12)
        L_0x0074:
            return r16
        L_0x0075:
            int r13 = r19 - r9
            if (r15 != 0) goto L_0x007b
            int r13 = r20 - r10
        L_0x007b:
            r11.A05(r13)
            r16 = 1
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0A(int, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
        if (r0 < 0) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(android.view.KeyEvent r9) {
        /*
            r8 = this;
            android.graphics.Rect r3 = r8.A0L
            r3.setEmpty()
            int r0 = r8.getChildCount()
            r6 = 0
            if (r0 <= 0) goto L_0x0031
            android.view.View r0 = r8.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r0.getHeight()
            int r0 = r1.topMargin
            int r2 = r2 + r0
            int r0 = r1.bottomMargin
            int r2 = r2 + r0
            int r1 = r8.getHeight()
            int r0 = r8.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r8.getPaddingBottom()
            int r1 = r1 - r0
            if (r2 <= r1) goto L_0x0031
            r6 = 1
        L_0x0031:
            r5 = 0
            r4 = 130(0x82, float:1.82E-43)
            if (r6 != 0) goto L_0x005e
            boolean r0 = r8.isFocused()
            if (r0 == 0) goto L_0x005d
            int r1 = r9.getKeyCode()
            r0 = 4
            if (r1 == r0) goto L_0x005d
            android.view.View r1 = r8.findFocus()
            if (r1 != r8) goto L_0x004a
            r1 = 0
        L_0x004a:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocus(r8, r1, r4)
            if (r0 == 0) goto L_0x005d
            if (r0 == r8) goto L_0x005d
            boolean r0 = r0.requestFocus(r4)
            if (r0 == 0) goto L_0x005d
            r5 = 1
        L_0x005d:
            return r5
        L_0x005e:
            int r0 = r9.getAction()
            if (r0 != 0) goto L_0x005d
            int r2 = r9.getKeyCode()
            r0 = 19
            r1 = 33
            if (r2 == r0) goto L_0x0106
            r0 = 20
            if (r2 == r0) goto L_0x00c7
            r0 = 62
            if (r2 != r0) goto L_0x005d
            boolean r0 = r9.isShiftPressed()
            if (r0 == 0) goto L_0x007e
            r4 = 33
        L_0x007e:
            r7 = 1
            r1 = 0
            r0 = 130(0x82, float:1.82E-43)
            r6 = 0
            if (r4 != r0) goto L_0x0086
            r6 = 1
        L_0x0086:
            int r2 = r8.getHeight()
            int r0 = r8.getScrollY()
            if (r6 == 0) goto L_0x00c1
            int r0 = r0 + r2
            r3.top = r0
            int r0 = r8.getChildCount()
            if (r0 <= 0) goto L_0x00b8
            int r0 = r0 - r7
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r1.getBottom()
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r0 = r8.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r3.top
            int r0 = r0 + r2
            if (r0 <= r1) goto L_0x00b8
            int r1 = r1 - r2
        L_0x00b6:
            r3.top = r1
        L_0x00b8:
            int r0 = r3.top
            int r2 = r2 + r0
            r3.bottom = r2
            r8.A0A(r4, r0, r2)
            return r5
        L_0x00c1:
            int r0 = r0 - r2
            r3.top = r0
            if (r0 >= 0) goto L_0x00b8
            goto L_0x00b6
        L_0x00c7:
            boolean r0 = r9.isAltPressed()
            if (r0 != 0) goto L_0x00d2
            boolean r5 = r8.A09(r4)
            return r5
        L_0x00d2:
            r1 = 1
            int r2 = r8.getHeight()
            r3.top = r5
            r3.bottom = r2
            int r0 = r8.getChildCount()
            if (r0 <= 0) goto L_0x00fd
            int r0 = r0 - r1
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r1.getBottom()
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r0 = r8.getPaddingBottom()
            int r1 = r1 + r0
            r3.bottom = r1
            int r1 = r1 - r2
            r3.top = r1
        L_0x00fd:
            int r1 = r3.top
            int r0 = r3.bottom
            boolean r5 = r8.A0A(r4, r1, r0)
            return r5
        L_0x0106:
            boolean r0 = r9.isAltPressed()
            if (r0 != 0) goto L_0x0111
            boolean r5 = r8.A09(r1)
            return r5
        L_0x0111:
            int r0 = r8.getHeight()
            r3.top = r5
            r3.bottom = r0
            boolean r5 = r8.A0A(r1, r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0B(android.view.KeyEvent):boolean");
    }

    public final boolean A0C(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.A0C;
        if (A00(edgeEffect) != 0.0f) {
            A01(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.A0B;
        if (A00(edgeEffect2) == 0.0f) {
            return z2;
        }
        A01(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final boolean A0D(View view, int i2, int i3) {
        Rect rect = this.A0L;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    public void ATu(View view, int[] iArr, int i2, int i3, int i4) {
        this.A0M.A04(iArr, (int[]) null, i2, i3, i4);
    }

    public void ATv(View view, int i2, int i3, int i4, int i5, int i6) {
        A07(i5, (int[]) null, i6);
    }

    public void ATw(View view, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        A07(i5, iArr, i6);
    }

    public void ATx(View view, View view2, int i2, int i3) {
        C04770Nw r1 = this.A0N;
        if (i3 == 1) {
            r1.A00 = i2;
        } else {
            r1.A01 = i2;
        }
        this.A0M.A03(2, i3);
    }

    public boolean AXV(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void AXx(View view, int i2) {
        C04770Nw r2 = this.A0N;
        if (i2 == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
        AgM(i2);
    }

    public void AgM(int i2) {
        this.A0M.A00(i2);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r24 = this;
            r0 = r24
            android.widget.OverScroller r2 = r0.A0D
            boolean r1 = r2.isFinished()
            if (r1 != 0) goto L_0x00b5
            r2.computeScrollOffset()
            int r3 = r2.getCurrY()
            int r1 = r0.A03
            int r16 = r3 - r1
            r0.A03 = r3
            int[] r12 = r0.A0O
            r1 = 1
            r13 = 0
            r12[r1] = r13
            r19 = 0
            X.0XH r10 = r0.A0M
            r4 = 0
            r20 = 0
            r22 = 1
            r17 = r10
            r18 = r12
            r21 = r16
            r17.A04(r18, r19, r20, r21, r22)
            r3 = r12[r1]
            int r16 = r16 - r3
            int r3 = r0.getScrollRange()
            if (r16 == 0) goto L_0x00ac
            int r9 = r0.getScrollY()
            int r7 = r0.getScrollX()
            r0.getOverScrollMode()
            r0.computeHorizontalScrollRange()
            r0.computeHorizontalScrollExtent()
            r0.computeVerticalScrollRange()
            r0.computeVerticalScrollExtent()
            int r6 = r9 + r16
            int r5 = -r13
            if (r7 <= r13) goto L_0x00bf
            r7 = 0
        L_0x0056:
            r4 = 1
        L_0x0057:
            if (r6 <= r3) goto L_0x00b9
            r6 = r3
        L_0x005a:
            r5 = 1
            android.view.ViewParent r8 = r10.A00
            if (r8 != 0) goto L_0x0070
            int r23 = r0.getScrollRange()
            r21 = 0
            r22 = 0
            r18 = r7
            r19 = r6
            r17 = r2
            r17.springBack(r18, r19, r20, r21, r22, r23)
        L_0x0070:
            r0.onOverScrolled(r7, r6, r4, r5)
            int r14 = r0.getScrollY()
            int r14 = r14 - r9
            int r16 = r16 - r14
            r12[r1] = r13
            int[] r11 = r0.A0P
            r15 = 0
            r17 = 1
            r10.A05(r11, r12, r13, r14, r15, r16, r17)
            r4 = r12[r1]
            int r16 = r16 - r4
            if (r16 == 0) goto L_0x00ac
            int r4 = r0.getOverScrollMode()
            if (r4 == 0) goto L_0x0094
            if (r4 != r1) goto L_0x00a6
            if (r3 <= 0) goto L_0x00a6
        L_0x0094:
            if (r16 >= 0) goto L_0x00b6
            android.widget.EdgeEffect r4 = r0.A0C
        L_0x0098:
            boolean r3 = r4.isFinished()
            if (r3 == 0) goto L_0x00a6
            float r3 = r2.getCurrVelocity()
            int r3 = (int) r3
            r4.onAbsorb(r3)
        L_0x00a6:
            r2.abortAnimation()
            r0.AgM(r1)
        L_0x00ac:
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x00c3
            r0.postInvalidateOnAnimation()
        L_0x00b5:
            return
        L_0x00b6:
            android.widget.EdgeEffect r4 = r0.A0B
            goto L_0x0098
        L_0x00b9:
            if (r6 >= r5) goto L_0x00bd
            r6 = r5
            goto L_0x005a
        L_0x00bd:
            r5 = 0
            goto L_0x0070
        L_0x00bf:
            if (r7 >= r5) goto L_0x0057
            r7 = r5
            goto L_0x0056
        L_0x00c3:
            r0.AgM(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0B(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.A0M.A02(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.A0M.A01(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.A0M.A04(iArr, iArr2, i2, i3, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.A0M.A05(iArr, (int[]) null, i2, i3, i4, i5, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        if (r8 >= 21) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        if (r11 >= 21) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            super.draw(r13)
            int r2 = r12.getScrollY()
            android.widget.EdgeEffect r8 = r12.A0C
            boolean r0 = r8.isFinished()
            r7 = 0
            r9 = 21
            if (r0 != 0) goto L_0x0056
            int r6 = r13.save()
            int r5 = r12.getWidth()
            int r4 = r12.getHeight()
            int r10 = java.lang.Math.min(r7, r2)
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r9) goto L_0x00c0
            boolean r0 = X.C04280Lx.A00(r12)
            if (r0 != 0) goto L_0x00c0
            r3 = 0
        L_0x002d:
            boolean r0 = X.C04280Lx.A00(r12)
            if (r0 == 0) goto L_0x0042
            int r1 = r12.getPaddingTop()
            int r0 = r12.getPaddingBottom()
            int r1 = r1 + r0
            int r4 = r4 - r1
            int r0 = r12.getPaddingTop()
            int r10 = r10 + r0
        L_0x0042:
            float r1 = (float) r3
            float r0 = (float) r10
            r13.translate(r1, r0)
            r8.setSize(r5, r4)
            boolean r0 = r8.draw(r13)
            if (r0 == 0) goto L_0x0053
            r12.postInvalidateOnAnimation()
        L_0x0053:
            r13.restoreToCount(r6)
        L_0x0056:
            android.widget.EdgeEffect r6 = r12.A0B
            boolean r0 = r6.isFinished()
            if (r0 != 0) goto L_0x00bf
            int r5 = r13.save()
            int r4 = r12.getWidth()
            int r3 = r12.getHeight()
            int r0 = r12.getScrollRange()
            int r2 = java.lang.Math.max(r0, r2)
            int r2 = r2 + r3
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r9) goto L_0x007d
            boolean r0 = X.C04280Lx.A00(r12)
            if (r0 == 0) goto L_0x008e
        L_0x007d:
            int r1 = r12.getPaddingLeft()
            int r0 = r12.getPaddingRight()
            int r1 = r1 + r0
            int r4 = r4 - r1
            int r0 = r12.getPaddingLeft()
            int r7 = r7 + r0
            if (r8 < r9) goto L_0x00a3
        L_0x008e:
            boolean r0 = X.C04280Lx.A00(r12)
            if (r0 == 0) goto L_0x00a3
            int r1 = r12.getPaddingTop()
            int r0 = r12.getPaddingBottom()
            int r1 = r1 + r0
            int r3 = r3 - r1
            int r0 = r12.getPaddingBottom()
            int r2 = r2 - r0
        L_0x00a3:
            int r7 = r7 - r4
            float r1 = (float) r7
            float r0 = (float) r2
            r13.translate(r1, r0)
            r2 = 1127481344(0x43340000, float:180.0)
            float r1 = (float) r4
            r0 = 0
            r13.rotate(r2, r1, r0)
            r6.setSize(r4, r3)
            boolean r0 = r6.draw(r13)
            if (r0 == 0) goto L_0x00bc
            r12.postInvalidateOnAnimation()
        L_0x00bc:
            r13.restoreToCount(r5)
        L_0x00bf:
            return
        L_0x00c0:
            int r1 = r12.getPaddingLeft()
            int r0 = r12.getPaddingRight()
            int r1 = r1 + r0
            int r5 = r5 - r1
            int r3 = r12.getPaddingLeft()
            if (r11 < r9) goto L_0x0042
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.draw(android.graphics.Canvas):void");
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        C04770Nw r0 = this.A0N;
        return r0.A01 | r0.A00;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.A0M.A01 != null;
    }

    public boolean isNestedScrollingEnabled() {
        return this.A0M.A02;
    }

    public void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0I = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r1 = r9.getAction()
            r2 = 0
            r0 = 8
            if (r1 != r0) goto L_0x00b0
            boolean r0 = r8.A0H
            if (r0 != 0) goto L_0x00b0
            r3 = 2
            int r0 = r9.getSource()
            r1 = r0 & 2
            r0 = 0
            if (r1 != r3) goto L_0x0018
            r0 = 1
        L_0x0018:
            r3 = 0
            if (r0 == 0) goto L_0x00a2
            r0 = 9
        L_0x001d:
            float r1 = r9.getAxisValue(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00b0
            float r0 = r8.getVerticalScrollFactorCompat()
            float r1 = r1 * r0
            int r0 = (int) r1
            int r6 = r8.getScrollRange()
            int r5 = r8.getScrollY()
            int r7 = r5 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r3 = 1
            if (r7 >= 0) goto L_0x006f
            int r0 = r8.getOverScrollMode()
            if (r0 == 0) goto L_0x0048
            if (r0 != r3) goto L_0x00a0
            int r0 = r8.getScrollRange()
            if (r0 <= 0) goto L_0x00a0
        L_0x0048:
            r1 = 8194(0x2002, float:1.1482E-41)
            int r0 = r9.getSource()
            r0 = r0 & r1
            if (r0 == r1) goto L_0x00a0
            android.widget.EdgeEffect r6 = r8.A0C
            float r0 = (float) r7
            float r1 = -r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            A01(r6, r1, r4)
            r6.onRelease()
            r8.invalidate()
            r0 = 1
        L_0x0065:
            if (r2 == r5) goto L_0x00af
            int r0 = r8.getScrollX()
            super.scrollTo(r0, r2)
            return r3
        L_0x006f:
            if (r7 <= r6) goto L_0x009f
            int r0 = r8.getOverScrollMode()
            if (r0 == 0) goto L_0x007f
            if (r0 != r3) goto L_0x009c
            int r0 = r8.getScrollRange()
            if (r0 <= 0) goto L_0x009c
        L_0x007f:
            r1 = 8194(0x2002, float:1.1482E-41)
            int r0 = r9.getSource()
            r0 = r0 & r1
            if (r0 == r1) goto L_0x009c
            android.widget.EdgeEffect r2 = r8.A0B
            int r7 = r7 - r6
            float r1 = (float) r7
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            A01(r2, r1, r4)
            r2.onRelease()
            r8.invalidate()
            r2 = 1
        L_0x009c:
            r0 = r2
            r2 = r6
            goto L_0x0065
        L_0x009f:
            r2 = r7
        L_0x00a0:
            r0 = 0
            goto L_0x0065
        L_0x00a2:
            r1 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r9.getSource()
            r0 = r0 & r1
            if (r0 != r1) goto L_0x00b0
            r0 = 26
            goto L_0x001d
        L_0x00af:
            return r0
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.A0H) {
            return true;
        }
        int i2 = action & MotionEventCompat.ACTION_MASK;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.A01;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder("Invalid pointerId=");
                            sb.append(i3);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.A02) > this.A07 && (2 & getNestedScrollAxes()) == 0) {
                                this.A0H = true;
                                this.A02 = y2;
                                VelocityTracker velocityTracker = this.A09;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A09 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A06 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        A08(motionEvent);
                    }
                }
            }
            this.A0H = false;
            this.A01 = -1;
            VelocityTracker velocityTracker2 = this.A09;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A09 = null;
            }
            if (this.A0D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            AgM(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.A02 = y3;
                    this.A01 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A09;
                    if (velocityTracker3 == null) {
                        this.A09 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A09.addMovement(motionEvent);
                    OverScroller overScroller = this.A0D;
                    overScroller.computeScrollOffset();
                    if (!A0C(motionEvent) && overScroller.isFinished()) {
                        z2 = false;
                    }
                    this.A0H = z2;
                    this.A0M.A03(2, 0);
                }
            }
            if (!A0C(motionEvent) && this.A0D.isFinished()) {
                z2 = false;
            }
            this.A0H = z2;
            VelocityTracker velocityTracker4 = this.A09;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A09 = null;
            }
        }
        return this.A0H;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.A0J = false;
        View view = this.A0A;
        if (view != null && A02(view, this)) {
            View view2 = this.A0A;
            Rect rect = this.A0L;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A032 = A03(rect);
            if (A032 != 0) {
                scrollBy(0, A032);
            }
        }
        this.A0A = null;
        if (!this.A0I) {
            if (this.A0F != null) {
                scrollTo(getScrollX(), this.A0F.A00);
                this.A0F = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int i7 = scrollY;
            if (paddingTop >= i6 || scrollY < 0) {
                i7 = 0;
            } else if (paddingTop + scrollY > i6) {
                i7 = i6 - paddingTop;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A0I = true;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.A0G && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        A04((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return this.A0M.A01(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        ATu(view, iArr, i2, i3, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        A07(i5, (int[]) null, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        ATx(view, view2, i2, 0);
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i2) : instance.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus == null || (!A0D(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C02390Bk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C02390Bk r2 = (C02390Bk) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0F = r2;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C02390Bk r1 = new C02390Bk(super.onSaveInstanceState());
        r1.A00 = getScrollY();
        return r1;
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        C12410kM r0 = this.A0E;
        if (r0 != null) {
            r0.AWl(this, i2, i3, i4, i5);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && A0D(findFocus, 0, i5)) {
            Rect rect = this.A0L;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            A05(A03(rect));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        AXx(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0272, code lost:
        if (getChildCount() > 0) goto L_0x0274;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r29) {
        /*
            r28 = this;
            r0 = r28
            android.view.VelocityTracker r1 = r0.A09
            if (r1 != 0) goto L_0x000c
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.A09 = r1
        L_0x000c:
            r4 = r29
            int r5 = r4.getActionMasked()
            r2 = 0
            if (r5 != 0) goto L_0x0017
            r0.A06 = r2
        L_0x0017:
            android.view.MotionEvent r18 = android.view.MotionEvent.obtain(r4)
            int r1 = r0.A06
            float r3 = (float) r1
            r7 = 0
            r1 = r18
            r1.offsetLocation(r7, r3)
            r8 = 2
            r1 = 1
            if (r5 == 0) goto L_0x028f
            r6 = -1
            if (r5 == r1) goto L_0x020c
            if (r5 == r8) goto L_0x0065
            r3 = 3
            if (r5 == r3) goto L_0x026a
            r2 = 5
            if (r5 == r2) goto L_0x0053
            r2 = 6
            if (r5 != r2) goto L_0x0046
            r0.A08(r4)
            int r2 = r0.A01
            int r2 = r4.findPointerIndex(r2)
            float r2 = r4.getY(r2)
            int r2 = (int) r2
            r0.A02 = r2
        L_0x0046:
            android.view.VelocityTracker r2 = r0.A09
            if (r2 == 0) goto L_0x004f
            r0 = r18
            r2.addMovement(r0)
        L_0x004f:
            r18.recycle()
            return r1
        L_0x0053:
            int r3 = r4.getActionIndex()
            float r2 = r4.getY(r3)
            int r2 = (int) r2
            r0.A02 = r2
            int r2 = r4.getPointerId(r3)
            r0.A01 = r2
            goto L_0x0046
        L_0x0065:
            int r3 = r0.A01
            int r5 = r4.findPointerIndex(r3)
            if (r5 != r6) goto L_0x0088
            java.lang.String r2 = "Invalid pointerId="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r2 = r0.A01
            r3.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r3)
            goto L_0x0046
        L_0x0088:
            float r3 = r4.getY(r5)
            int r9 = (int) r3
            int r3 = r0.A02
            int r3 = r3 - r9
            float r11 = r4.getX(r5)
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r11 = r11 / r6
            float r12 = (float) r3
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r12 = r12 / r6
            android.widget.EdgeEffect r8 = r0.A0C
            r27 = r8
            float r6 = A00(r8)
            r10 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x01f0
            float r6 = -r12
            float r6 = A01(r8, r6, r11)
            float r10 = -r6
        L_0x00b4:
            float r6 = A00(r8)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00bf
            r8.onRelease()
        L_0x00bf:
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r10 = r10 * r6
            int r6 = java.lang.Math.round(r10)
            if (r6 == 0) goto L_0x00ce
            r0.invalidate()
        L_0x00ce:
            int r3 = r3 - r6
            boolean r6 = r0.A0H
            if (r6 != 0) goto L_0x00e9
            int r6 = java.lang.Math.abs(r3)
            int r7 = r0.A07
            if (r6 <= r7) goto L_0x0046
            android.view.ViewParent r6 = r0.getParent()
            if (r6 == 0) goto L_0x00e4
            r6.requestDisallowInterceptTouchEvent(r1)
        L_0x00e4:
            r0.A0H = r1
            if (r3 <= 0) goto L_0x01ed
            int r3 = r3 - r7
        L_0x00e9:
            int[] r12 = r0.A0O
            int[] r8 = r0.A0P
            X.0XH r13 = r0.A0M
            r17 = 0
            r22 = 0
            r24 = 0
            r19 = r13
            r20 = r12
            r21 = r8
            r23 = r3
            boolean r6 = r19.A04(r20, r21, r22, r23, r24)
            if (r6 == 0) goto L_0x010d
            r6 = r12[r1]
            int r3 = r3 - r6
            int r7 = r0.A06
            r6 = r8[r1]
            int r7 = r7 + r6
            r0.A06 = r7
        L_0x010d:
            r6 = r8[r1]
            int r9 = r9 - r6
            r0.A02 = r9
            int r6 = r0.getScrollY()
            int r7 = r0.getScrollRange()
            int r9 = r0.getOverScrollMode()
            if (r9 == 0) goto L_0x0124
            if (r9 != r1) goto L_0x0126
            if (r7 <= 0) goto L_0x0126
        L_0x0124:
            r17 = 1
        L_0x0126:
            int r11 = r0.getScrollY()
            r16 = 0
            r14 = 0
            r0.getOverScrollMode()
            r0.computeHorizontalScrollRange()
            r0.computeHorizontalScrollExtent()
            r0.computeVerticalScrollRange()
            r0.computeVerticalScrollExtent()
            r10 = 0
            int r11 = r11 + r3
            int r9 = -r2
            if (r2 >= r9) goto L_0x0143
            r14 = r9
            r10 = 1
        L_0x0143:
            if (r11 <= r7) goto L_0x01e5
            r11 = r7
        L_0x0146:
            r9 = 1
            android.view.ViewParent r15 = r13.A00
            if (r15 != 0) goto L_0x015c
            android.widget.OverScroller r15 = r0.A0D
            int r25 = r0.getScrollRange()
            r23 = 0
            r19 = r15
            r20 = r14
            r21 = r11
            r19.springBack(r20, r21, r22, r23, r24, r25)
        L_0x015c:
            r0.onOverScrolled(r14, r11, r10, r9)
            if (r10 != 0) goto L_0x0163
            if (r9 == 0) goto L_0x0169
        L_0x0163:
            android.view.ViewParent r9 = r13.A01
            if (r9 != 0) goto L_0x0169
            r16 = 1
        L_0x0169:
            int r23 = r0.getScrollY()
            int r23 = r23 - r6
            int r25 = r3 - r23
            r12[r1] = r2
            r26 = 0
            r19 = r13
            r20 = r8
            r21 = r12
            r19.A05(r20, r21, r22, r23, r24, r25, r26)
            int r2 = r0.A02
            r8 = r8[r1]
            int r2 = r2 - r8
            r0.A02 = r2
            int r2 = r0.A06
            int r2 = r2 + r8
            r0.A06 = r2
            if (r17 == 0) goto L_0x0203
            r2 = r12[r1]
            int r3 = r3 - r2
            int r6 = r6 + r3
            if (r6 >= 0) goto L_0x01c7
            int r2 = -r3
            float r6 = (float) r2
            int r2 = r0.getHeight()
            float r2 = (float) r2
            float r6 = r6 / r2
            float r3 = r4.getX(r5)
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r3 = r3 / r2
            r2 = r27
            A01(r2, r6, r3)
            android.widget.EdgeEffect r3 = r0.A0B
        L_0x01ab:
            boolean r2 = r3.isFinished()
            if (r2 != 0) goto L_0x01b4
            r3.onRelease()
        L_0x01b4:
            boolean r2 = r27.isFinished()
            if (r2 == 0) goto L_0x01c2
            android.widget.EdgeEffect r2 = r0.A0B
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x0203
        L_0x01c2:
            r0.postInvalidateOnAnimation()
            goto L_0x0046
        L_0x01c7:
            if (r6 <= r7) goto L_0x01b4
            android.widget.EdgeEffect r8 = r0.A0B
            float r7 = (float) r3
            int r2 = r0.getHeight()
            float r2 = (float) r2
            float r7 = r7 / r2
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4.getX(r5)
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r3 = r3 / r2
            float r6 = r6 - r3
            A01(r8, r7, r6)
            r3 = r27
            goto L_0x01ab
        L_0x01e5:
            if (r11 >= r9) goto L_0x01ea
            r11 = r9
            goto L_0x0146
        L_0x01ea:
            r9 = 0
            goto L_0x015c
        L_0x01ed:
            int r3 = r3 + r7
            goto L_0x00e9
        L_0x01f0:
            android.widget.EdgeEffect r8 = r0.A0B
            float r6 = A00(r8)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00bf
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r11
            float r10 = A01(r8, r12, r6)
            goto L_0x00b4
        L_0x0203:
            if (r16 == 0) goto L_0x0046
            android.view.VelocityTracker r2 = r0.A09
            r2.clear()
            goto L_0x0046
        L_0x020c:
            android.view.VelocityTracker r5 = r0.A09
            r4 = 1000(0x3e8, float:1.401E-42)
            int r3 = r0.A04
            float r3 = (float) r3
            r5.computeCurrentVelocity(r4, r3)
            int r3 = r0.A01
            float r3 = r5.getYVelocity(r3)
            int r5 = (int) r3
            int r4 = java.lang.Math.abs(r5)
            int r3 = r0.A05
            if (r4 < r3) goto L_0x0274
            android.widget.EdgeEffect r4 = r0.A0C
            float r3 = A00(r4)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0266
            android.widget.EdgeEffect r4 = r0.A0B
            float r3 = A00(r4)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            int r5 = -r5
            if (r3 != 0) goto L_0x0266
            float r4 = (float) r5
            X.0XH r3 = r0.A0M
            boolean r3 = r3.A01(r7, r4)
            if (r3 != 0) goto L_0x0249
            r0.dispatchNestedFling(r7, r4, r1)
            r0.A04(r5)
        L_0x0249:
            r0.A01 = r6
            r0.A0H = r2
            android.view.VelocityTracker r3 = r0.A09
            if (r3 == 0) goto L_0x0257
            r3.recycle()
            r3 = 0
            r0.A09 = r3
        L_0x0257:
            r0.AgM(r2)
            android.widget.EdgeEffect r2 = r0.A0C
            r2.onRelease()
            android.widget.EdgeEffect r2 = r0.A0B
            r2.onRelease()
            goto L_0x0046
        L_0x0266:
            r4.onAbsorb(r5)
            goto L_0x0249
        L_0x026a:
            boolean r3 = r0.A0H
            if (r3 == 0) goto L_0x0249
            int r3 = r0.getChildCount()
            if (r3 <= 0) goto L_0x0249
        L_0x0274:
            android.widget.OverScroller r7 = r0.A0D
            int r8 = r0.getScrollX()
            int r9 = r0.getScrollY()
            int r13 = r0.getScrollRange()
            r10 = 0
            r11 = 0
            r12 = 0
            boolean r3 = r7.springBack(r8, r9, r10, r11, r12, r13)
            if (r3 == 0) goto L_0x0249
            r0.postInvalidateOnAnimation()
            goto L_0x0249
        L_0x028f:
            int r3 = r0.getChildCount()
            if (r3 != 0) goto L_0x0296
            return r2
        L_0x0296:
            boolean r3 = r0.A0H
            if (r3 == 0) goto L_0x02a3
            android.view.ViewParent r3 = r0.getParent()
            if (r3 == 0) goto L_0x02a3
            r3.requestDisallowInterceptTouchEvent(r1)
        L_0x02a3:
            android.widget.OverScroller r5 = r0.A0D
            boolean r3 = r5.isFinished()
            if (r3 != 0) goto L_0x02b1
            r5.abortAnimation()
            r0.AgM(r1)
        L_0x02b1:
            float r3 = r4.getY()
            int r3 = (int) r3
            r0.A02 = r3
            int r3 = r4.getPointerId(r2)
            r0.A01 = r3
            X.0XH r3 = r0.A0M
            r3.A03(r8, r2)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.A0J) {
            Rect rect = this.A0L;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A032 = A03(rect);
            if (A032 != 0) {
                scrollBy(0, A032);
            }
        } else {
            this.A0A = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A032 = A03(rect);
        boolean z3 = false;
        if (A032 != 0) {
            z3 = true;
            if (z2) {
                scrollBy(0, A032);
            } else {
                A06(0, A032, false);
                return true;
            }
        }
        return z3;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.A09) != null) {
            velocityTracker.recycle();
            this.A09 = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.A0J = true;
        super.requestLayout();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 != getScrollX() || i3 != getScrollY()) {
                super.scrollTo(i2, i3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.A0G) {
            this.A0G = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        AnonymousClass0XH r1 = this.A0M;
        if (r1.A02) {
            C004601z.A0V(r1.A04);
        }
        r1.A02 = z2;
    }

    public void setOnScrollChangeListener(C12410kM r1) {
        this.A0E = r1;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.A0K = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return this.A0M.A03(i2, 0);
    }

    public void stopNestedScroll() {
        AgM(0);
    }
}
