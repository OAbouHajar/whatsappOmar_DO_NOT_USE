package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass030;
import X.AnonymousClass06L;
import X.AnonymousClass09F;
import X.AnonymousClass09G;
import X.AnonymousClass09V;
import X.AnonymousClass0Bn;
import X.AnonymousClass0ZV;
import X.C004601z;
import X.C016607w;
import X.C018908v;
import X.C019008w;
import X.C02480Cg;
import X.C04770Nw;
import X.C09240fB;
import X.C09250fC;
import X.C11570iz;
import X.C12940lD;
import X.C13260lj;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.facebook.redex.IDxLAdapterShape1S0100000_I1;
import com.obwhatsapp.R;

public class ActionBarOverlayLayout extends ViewGroup implements C13260lj, C019008w, C018908v, AnonymousClass09V {
    public static final int[] A0V = {R.attr.attr0007, 16842841};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public ViewPropertyAnimator A05;
    public OverScroller A06;
    public ActionBarContainer A07;
    public C11570iz A08;
    public ContentFrameLayout A09;
    public AnonymousClass09G A0A;
    public AnonymousClass030 A0B;
    public AnonymousClass030 A0C;
    public AnonymousClass030 A0D;
    public AnonymousClass030 A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final AnimatorListenerAdapter A0K;
    public final Rect A0L;
    public final Rect A0M;
    public final Rect A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final Rect A0R;
    public final C04770Nw A0S;
    public final Runnable A0T;
    public final Runnable A0U;

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = 0;
        this.A0L = AnonymousClass000.A0J();
        this.A0P = AnonymousClass000.A0J();
        this.A0N = AnonymousClass000.A0J();
        this.A0M = AnonymousClass000.A0J();
        this.A0Q = AnonymousClass000.A0J();
        this.A0O = AnonymousClass000.A0J();
        this.A0R = AnonymousClass000.A0J();
        AnonymousClass030 r0 = AnonymousClass030.A01;
        this.A0B = r0;
        this.A0D = r0;
        this.A0C = r0;
        this.A0E = r0;
        this.A0K = new IDxLAdapterShape1S0100000_I1(this, 0);
        this.A0U = new C09240fB(this);
        this.A0T = new C09250fC(this);
        A02(context);
        this.A0S = new C04770Nw();
    }

    public void A00() {
        removeCallbacks(this.A0U);
        removeCallbacks(this.A0T);
        ViewPropertyAnimator viewPropertyAnimator = this.A05;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void A01() {
        AnonymousClass09G wrapper;
        if (this.A09 == null) {
            this.A09 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.A07 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof AnonymousClass09G) {
                wrapper = (AnonymousClass09G) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw AnonymousClass000.A0V(AnonymousClass000.A0h(AnonymousClass000.A0c(findViewById), AnonymousClass000.A0r("Can't make a decor toolbar out of ")));
            }
            this.A0A = wrapper;
        }
    }

    public final void A02(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0V);
        boolean z2 = false;
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A04 = drawable;
        setWillNotDraw(AnonymousClass000.A1W(drawable));
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.A0I = z2;
        this.A06 = new OverScroller(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r0.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AJL() {
        /*
            r2 = this;
            r2.A01()
            X.09G r0 = r2.A0A
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0O
            if (r0 == 0) goto L_0x0018
            X.0ZV r0 = r0.A08
            if (r0 == 0) goto L_0x0018
            boolean r1 = r0.A02()
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.AJL():boolean");
    }

    public void ATu(View view, int[] iArr, int i2, int i3, int i4) {
    }

    public void ATv(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public void ATw(View view, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        ATv(view, i2, i3, i4, i5, i6);
    }

    public void ATx(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public boolean AXV(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public void AXx(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass0Bn;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A04 != null && !this.A0I) {
            int bottom = this.A07.getVisibility() == 0 ? (int) (((float) this.A07.getBottom()) + this.A07.getTranslationY() + 0.5f) : 0;
            this.A04.setBounds(0, bottom, getWidth(), this.A04.getIntrinsicHeight() + bottom);
            this.A04.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r4 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fitSystemWindows(android.graphics.Rect r7) {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x000b
            boolean r0 = super.fitSystemWindows(r7)
            return r0
        L_0x000b:
            r6.A01()
            androidx.appcompat.widget.ActionBarContainer r0 = r6.A07
            r5 = 1
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0O(r0)
            int r1 = r2.leftMargin
            int r0 = r7.left
            if (r1 == r0) goto L_0x0058
            r2.leftMargin = r0
            r4 = 1
        L_0x001e:
            int r1 = r2.topMargin
            int r0 = r7.top
            if (r1 == r0) goto L_0x0027
            r2.topMargin = r0
            r4 = 1
        L_0x0027:
            int r1 = r2.rightMargin
            int r0 = r7.right
            if (r1 == r0) goto L_0x0030
            r2.rightMargin = r0
            r4 = 1
        L_0x0030:
            android.graphics.Rect r3 = r6.A0M
            r3.set(r7)
            android.graphics.Rect r2 = r6.A0L
            X.C06470Wb.A00(r3, r2, r6)
            android.graphics.Rect r1 = r6.A0Q
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0046
            r1.set(r3)
            r4 = 1
        L_0x0046:
            android.graphics.Rect r1 = r6.A0P
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0055
            r1.set(r2)
        L_0x0051:
            r6.requestLayout()
        L_0x0054:
            return r5
        L_0x0055:
            if (r4 == 0) goto L_0x0054
            goto L_0x0051
        L_0x0058:
            r4 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass0Bn();
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass0Bn(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass0Bn(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A07;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C04770Nw r0 = this.A0S;
        return r0.A01 | r0.A00;
    }

    public CharSequence getTitle() {
        A01();
        return ((AnonymousClass09F) this.A0A).A09.A0V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        if (r6 != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r9) {
        /*
            r8 = this;
            r8.A01()
            X.030 r7 = X.AnonymousClass030.A01(r8, r9)
            int r4 = r7.A04()
            int r2 = r7.A06()
            int r1 = r7.A05()
            int r0 = r7.A03()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r4, r2, r1, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A07
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0O(r0)
            int r1 = r2.leftMargin
            int r0 = r3.left
            if (r1 == r0) goto L_0x0085
            r2.leftMargin = r0
            r6 = 1
        L_0x002b:
            int r1 = r2.topMargin
            int r0 = r3.top
            if (r1 == r0) goto L_0x0034
            r2.topMargin = r0
            r6 = 1
        L_0x0034:
            int r1 = r2.rightMargin
            int r0 = r3.right
            if (r1 == r0) goto L_0x003d
            r2.rightMargin = r0
            r6 = 1
        L_0x003d:
            android.graphics.Rect r5 = r8.A0L
            X.C004601z.A0Q(r5, r8, r7)
            int r4 = r5.left
            int r3 = r5.top
            int r1 = r5.right
            int r0 = r5.bottom
            X.0VF r2 = r7.A00
            X.030 r1 = r2.A0D(r4, r3, r1, r0)
            r8.A0B = r1
            X.030 r0 = r8.A0D
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            X.030 r0 = r8.A0B
            r8.A0D = r0
            r6 = 1
        L_0x005f:
            android.graphics.Rect r1 = r8.A0P
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x0082
            r1.set(r5)
        L_0x006a:
            r8.requestLayout()
        L_0x006d:
            X.030 r0 = r2.A05()
            X.0VF r0 = r0.A00
            X.030 r0 = r0.A07()
            X.0VF r0 = r0.A00
            X.030 r0 = r0.A06()
            android.view.WindowInsets r0 = r0.A07()
            return r0
        L_0x0082:
            if (r6 == 0) goto L_0x006d
            goto L_0x006a
        L_0x0085:
            r6 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A02(getContext());
        C004601z.A0T(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A00();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams A0O2 = AnonymousClass000.A0O(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = A0O2.leftMargin + paddingLeft;
                int i8 = A0O2.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r11 = r17
            r11.A01()
            androidx.appcompat.widget.ActionBarContainer r12 = r11.A07
            r2 = 0
            r5 = 0
            r16 = 0
            r14 = 0
            r13 = r18
            r15 = r19
            r11.measureChildWithMargins(r12, r13, r14, r15, r16)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.A07
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            androidx.appcompat.widget.ActionBarContainer r0 = r11.A07
            int r1 = r0.getMeasuredWidth()
            int r0 = r3.leftMargin
            int r1 = r1 + r0
            int r0 = r3.rightMargin
            int r1 = r1 + r0
            int r4 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.A07
            int r1 = r0.getMeasuredHeight()
            int r0 = r3.topMargin
            int r1 = r1 + r0
            int r0 = r3.bottomMargin
            int r1 = r1 + r0
            int r3 = java.lang.Math.max(r2, r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.A07
            int r0 = r0.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r2, r0)
            int r0 = r11.getWindowSystemUiVisibility()
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0185
            r10 = 1
            int r9 = r11.A00
            boolean r0 = r11.A0G
            if (r0 == 0) goto L_0x005b
            androidx.appcompat.widget.ActionBarContainer r0 = r11.A07
            android.view.View r0 = r0.A06
            if (r0 == 0) goto L_0x005b
            int r9 = r9 + r9
        L_0x005b:
            android.graphics.Rect r8 = r11.A0N
            android.graphics.Rect r0 = r11.A0L
            r8.set(r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r7 < r6) goto L_0x017c
            X.030 r0 = r11.A0B
            r11.A0C = r0
        L_0x006c:
            boolean r0 = r11.A0J
            if (r0 != 0) goto L_0x013e
            if (r10 != 0) goto L_0x013e
            int r0 = r8.top
            int r0 = r0 + r9
            r8.top = r0
            int r0 = r8.bottom
            r8.bottom = r0
            if (r7 < r6) goto L_0x0087
            X.030 r0 = r11.A0C
            X.0VF r0 = r0.A00
            X.030 r0 = r0.A0D(r5, r9, r5, r5)
        L_0x0085:
            r11.A0C = r0
        L_0x0087:
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.A09
            android.view.ViewGroup$MarginLayoutParams r5 = X.AnonymousClass000.A0O(r0)
            int r1 = r5.leftMargin
            int r0 = r8.left
            if (r1 == r0) goto L_0x0095
            r5.leftMargin = r0
        L_0x0095:
            int r1 = r5.topMargin
            int r0 = r8.top
            if (r1 == r0) goto L_0x009d
            r5.topMargin = r0
        L_0x009d:
            int r1 = r5.rightMargin
            int r0 = r8.right
            if (r1 == r0) goto L_0x00a5
            r5.rightMargin = r0
        L_0x00a5:
            int r1 = r5.bottomMargin
            int r0 = r8.bottom
            if (r1 == r0) goto L_0x00ad
            r5.bottomMargin = r0
        L_0x00ad:
            if (r7 < r6) goto L_0x012b
            X.030 r1 = r11.A0E
            X.030 r0 = r11.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c2
            X.030 r1 = r11.A0C
            r11.A0E = r1
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.A09
            X.C004601z.A0J(r0, r1)
        L_0x00c2:
            androidx.appcompat.widget.ContentFrameLayout r12 = r11.A09
            r11.measureChildWithMargins(r12, r13, r14, r15, r16)
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.A09
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.A09
            int r1 = r0.getMeasuredWidth()
            int r0 = r5.leftMargin
            int r1 = r1 + r0
            int r0 = r5.rightMargin
            int r1 = r1 + r0
            int r4 = java.lang.Math.max(r4, r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.A09
            int r1 = r0.getMeasuredHeight()
            int r0 = r5.topMargin
            int r1 = r1 + r0
            int r0 = r5.bottomMargin
            int r1 = r1 + r0
            int r5 = java.lang.Math.max(r3, r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.A09
            int r0 = r0.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r2, r0)
            int r1 = r11.getPaddingLeft()
            int r0 = r11.getPaddingRight()
            int r1 = r1 + r0
            int r4 = r4 + r1
            int r1 = r11.getPaddingTop()
            int r0 = r11.getPaddingBottom()
            int r1 = r1 + r0
            int r5 = r5 + r1
            int r0 = r11.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r5, r0)
            int r0 = r11.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r4, r0)
            int r1 = android.view.View.resolveSizeAndState(r0, r13, r3)
            int r0 = r3 << 16
            int r0 = android.view.View.resolveSizeAndState(r2, r15, r0)
            r11.setMeasuredDimension(r1, r0)
            return
        L_0x012b:
            android.graphics.Rect r5 = r11.A0R
            android.graphics.Rect r1 = r11.A0O
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x00c2
            r5.set(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = r11.A09
            r0.A00(r1)
            goto L_0x00c2
        L_0x013e:
            if (r7 < r6) goto L_0x016f
            X.030 r0 = r11.A0C
            int r10 = r0.A04()
            X.030 r0 = r11.A0C
            int r5 = r0.A06()
            int r5 = r5 + r9
            X.030 r0 = r11.A0C
            int r1 = r0.A05()
            X.030 r0 = r11.A0C
            int r0 = r0.A03()
            X.0Wk r5 = X.C06510Wk.A00(r10, r5, r1, r0)
            X.030 r1 = r11.A0C
            X.0Tl r0 = new X.0Tl
            r0.<init>(r1)
            X.0Qq r0 = r0.A00
            r0.A02(r5)
            X.030 r0 = r0.A00()
            goto L_0x0085
        L_0x016f:
            android.graphics.Rect r1 = r11.A0O
            int r0 = r1.top
            int r0 = r0 + r9
            r1.top = r0
            int r0 = r1.bottom
            r1.bottom = r0
            goto L_0x0087
        L_0x017c:
            android.graphics.Rect r1 = r11.A0O
            android.graphics.Rect r0 = r11.A0M
            r1.set(r0)
            goto L_0x006c
        L_0x0185:
            r10 = 0
            androidx.appcompat.widget.ActionBarContainer r0 = r11.A07
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0198
            androidx.appcompat.widget.ActionBarContainer r0 = r11.A07
            int r9 = r0.getMeasuredHeight()
            goto L_0x005b
        L_0x0198:
            r9 = 0
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        Runnable runnable;
        if (!this.A0H || !z2) {
            return false;
        }
        this.A06.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A06.getFinalY() > this.A07.getHeight()) {
            A00();
            runnable = this.A0T;
        } else {
            A00();
            runnable = this.A0U;
        }
        runnable.run();
        this.A0F = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.A01 + i3;
        this.A01 = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (X.C02480Cg) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            X.0Nw r0 = r2.A0S
            r0.A01 = r5
            int r0 = r2.getActionBarHideOffset()
            r2.A01 = r0
            r2.A00()
            X.0iz r1 = r2.A08
            if (r1 == 0) goto L_0x001d
            X.0Cg r1 = (X.C02480Cg) r1
            X.0QX r0 = r1.A08
            if (r0 == 0) goto L_0x001d
            r0.A00()
            r0 = 0
            r1.A08 = r0
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.A07.getVisibility() != 0) {
            return false;
        }
        return this.A0H;
    }

    public void onStopNestedScroll(View view) {
        Runnable runnable;
        if (this.A0H && !this.A0F) {
            if (this.A01 <= this.A07.getHeight()) {
                A00();
                runnable = this.A0U;
            } else {
                A00();
                runnable = this.A0T;
            }
            postDelayed(runnable, 600);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i2);
        A01();
        int i3 = this.A02 ^ i2;
        this.A02 = i2;
        boolean z3 = false;
        boolean A1P = AnonymousClass000.A1P(i2 & 4);
        if ((i2 & 256) != 0) {
            z3 = true;
        }
        C11570iz r1 = this.A08;
        if (r1 != null) {
            C02480Cg r12 = (C02480Cg) r1;
            r12.A0F = !z3;
            if (A1P || !z3) {
                if (r12.A0I) {
                    r12.A0I = false;
                    z2 = true;
                }
            } else if (!r12.A0I) {
                z2 = true;
                r12.A0I = true;
            }
            r12.A0a(z2);
        }
        if ((i3 & 256) != 0 && this.A08 != null) {
            C004601z.A0T(this);
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.A03 = i2;
        C11570iz r0 = this.A08;
        if (r0 != null) {
            ((C02480Cg) r0).A00 = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        A00();
        this.A07.setTranslationY((float) (-Math.max(0, Math.min(i2, this.A07.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C11570iz r3) {
        this.A08 = r3;
        if (getWindowToken() != null) {
            ((C02480Cg) this.A08).A00 = this.A03;
            int i2 = this.A02;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                C004601z.A0T(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.A0G = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.A0H) {
            this.A0H = z2;
            if (!z2) {
                A00();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        A01();
        AnonymousClass09F r1 = (AnonymousClass09F) this.A0A;
        r1.A03 = i2 != 0 ? AnonymousClass06L.A01(r1.A09.getContext(), i2) : null;
        r1.A00();
    }

    public void setIcon(Drawable drawable) {
        A01();
        AnonymousClass09F r0 = (AnonymousClass09F) this.A0A;
        r0.A03 = drawable;
        r0.A00();
    }

    public void setLogo(int i2) {
        A01();
        AnonymousClass09F r1 = (AnonymousClass09F) this.A0A;
        r1.A04 = i2 != 0 ? AnonymousClass06L.A01(r1.A09.getContext(), i2) : null;
        r1.A00();
    }

    public void setMenu(Menu menu, C12940lD r5) {
        A01();
        AnonymousClass09F r2 = (AnonymousClass09F) this.A0A;
        AnonymousClass0ZV r1 = r2.A08;
        if (r1 == null) {
            r1 = new AnonymousClass0ZV(r2.A09.getContext());
            r2.A08 = r1;
        }
        r1.A09 = r5;
        r2.A09.setMenu((C016607w) menu, r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (getContext().getApplicationInfo().targetSdkVersion >= 19) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverlayMode(boolean r4) {
        /*
            r3 = this;
            r3.A0J = r4
            if (r4 == 0) goto L_0x0013
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.A0I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.setOverlayMode(boolean):void");
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        A01();
        ((AnonymousClass09F) this.A0A).A07 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        A01();
        this.A0A.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
