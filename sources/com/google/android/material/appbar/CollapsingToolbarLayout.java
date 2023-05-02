package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass030;
import X.AnonymousClass1VF;
import X.AnonymousClass3BO;
import X.AnonymousClass3ER;
import X.AnonymousClass4RQ;
import X.C004601z;
import X.C018208n;
import X.C53362fa;
import X.C53382fc;
import X.C53572fv;
import X.C64313Nq;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxIListenerShape218S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.List;

public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public ValueAnimator A09;
    public Drawable A0A;
    public Drawable A0B;
    public View A0C;
    public View A0D;
    public Toolbar A0E;
    public AnonymousClass030 A0F;
    public AnonymousClass1VF A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final Rect A0L;
    public final AnonymousClass3BO A0M;

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A0J = true;
        this.A0L = AnonymousClass000.A0J();
        this.A06 = -1;
        AnonymousClass3BO r4 = new AnonymousClass3BO(this);
        this.A0M = r4;
        r4.A0O = C53572fv.A00;
        r4.A04();
        TypedArray A002 = C53382fc.A00(context, attributeSet, C53362fa.A05, new int[0], i2, R.style.style0413);
        int i3 = A002.getInt(3, 8388691);
        if (r4.A0M != i3) {
            r4.A0M = i3;
            r4.A04();
        }
        int i4 = A002.getInt(0, 8388627);
        if (r4.A0K != i4) {
            r4.A0K = i4;
            r4.A04();
        }
        int dimensionPixelSize = A002.getDimensionPixelSize(4, 0);
        this.A01 = dimensionPixelSize;
        this.A02 = dimensionPixelSize;
        this.A04 = dimensionPixelSize;
        this.A03 = dimensionPixelSize;
        if (A002.hasValue(7)) {
            this.A03 = A002.getDimensionPixelSize(7, 0);
        }
        if (A002.hasValue(6)) {
            this.A02 = A002.getDimensionPixelSize(6, 0);
        }
        if (A002.hasValue(8)) {
            this.A04 = A002.getDimensionPixelSize(8, 0);
        }
        if (A002.hasValue(5)) {
            this.A01 = A002.getDimensionPixelSize(5, 0);
        }
        this.A0H = A002.getBoolean(14, true);
        setTitle(A002.getText(13));
        r4.A0A(R.style.style02be);
        r4.A09(R.style.style02a2);
        if (A002.hasValue(9)) {
            r4.A0A(A002.getResourceId(9, 0));
        }
        if (A002.hasValue(1)) {
            r4.A09(A002.getResourceId(1, 0));
        }
        this.A06 = A002.getDimensionPixelSize(11, -1);
        this.A08 = (long) A002.getInt(10, 600);
        setContentScrim(A002.getDrawable(2));
        setStatusBarScrim(A002.getDrawable(12));
        this.A07 = A002.getResourceId(15, -1);
        A002.recycle();
        setWillNotDraw(false);
        C004601z.A0k(this, new IDxIListenerShape218S0100000_2_I1(this, 1));
    }

    public final int A00(View view) {
        AnonymousClass4RQ r0 = (AnonymousClass4RQ) view.getTag(R.id.view_offset_helper);
        if (r0 == null) {
            r0 = new AnonymousClass4RQ(view);
            view.setTag(R.id.view_offset_helper, r0);
        }
        return ((getHeight() - r0.A01) - view.getHeight()) - ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r6 = this;
            boolean r0 = r6.A0J
            if (r0 == 0) goto L_0x0050
            r5 = 0
            r6.A0E = r5
            r6.A0D = r5
            int r1 = r6.A07
            r0 = -1
            if (r1 == r0) goto L_0x002e
            android.view.View r2 = r6.findViewById(r1)
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            r6.A0E = r2
            if (r2 == 0) goto L_0x002e
            android.view.ViewParent r1 = r2.getParent()
        L_0x001c:
            if (r1 == r6) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0027
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x0027:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x001c
        L_0x002c:
            r6.A0D = r2
        L_0x002e:
            androidx.appcompat.widget.Toolbar r0 = r6.A0E
            r4 = 0
            if (r0 != 0) goto L_0x0047
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x0038:
            if (r2 >= r3) goto L_0x0045
            android.view.View r1 = r6.getChildAt(r2)
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L_0x004d
            r5 = r1
            androidx.appcompat.widget.Toolbar r5 = (androidx.appcompat.widget.Toolbar) r5
        L_0x0045:
            r6.A0E = r5
        L_0x0047:
            r6.A02()
            r6.A0J = r4
            return
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A01():void");
    }

    public final void A02() {
        View view;
        if (!this.A0H && (view = this.A0C) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A0C);
            }
        }
        if (this.A0H && this.A0E != null) {
            View view2 = this.A0C;
            if (view2 == null) {
                view2 = new View(getContext());
                this.A0C = view2;
            }
            if (view2.getParent() == null) {
                this.A0E.addView(this.A0C, -1, -1);
            }
        }
    }

    public final void A03() {
        if (this.A0A != null || this.A0B != null) {
            boolean z2 = false;
            if (getHeight() + this.A00 < getScrimVisibleHeightTrigger()) {
                z2 = true;
            }
            setScrimsShown(z2);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C64313Nq;
    }

    public void draw(Canvas canvas) {
        AnonymousClass030 r0;
        int A062;
        Drawable drawable;
        super.draw(canvas);
        A01();
        if (this.A0E == null && (drawable = this.A0A) != null && this.A05 > 0) {
            drawable.mutate().setAlpha(this.A05);
            this.A0A.draw(canvas);
        }
        if (this.A0H && this.A0I) {
            this.A0M.A0D(canvas);
        }
        if (this.A0B != null && this.A05 > 0 && (r0 = this.A0F) != null && (A062 = r0.A06()) > 0) {
            this.A0B.setBounds(0, -this.A00, getWidth(), A062 - this.A00);
            this.A0B.mutate().setAlpha(this.A05);
            this.A0B.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z2;
        Drawable drawable = this.A0A;
        if (drawable != null && this.A05 > 0) {
            View view2 = this.A0D;
            if (view2 == null || view2 == this) {
                view2 = this.A0E;
            }
            if (view == view2) {
                drawable.mutate().setAlpha(this.A05);
                this.A0A.draw(canvas);
                z2 = true;
                return super.drawChild(canvas, view, j2) || z2;
            }
        }
        z2 = false;
        if (super.drawChild(canvas, view, j2)) {
            return true;
        }
    }

    public void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0B;
        boolean z3 = false;
        if (drawable != null && drawable.isStateful()) {
            z3 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0A;
        if (drawable2 != null && drawable2.isStateful()) {
            z3 |= drawable2.setState(drawableState);
        }
        AnonymousClass3BO r1 = this.A0M;
        if (r1 != null) {
            r1.A0c = drawableState;
            ColorStateList colorStateList2 = r1.A0P;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = r1.A0Q) == null || !colorStateList.isStateful())) {
                z2 = false;
            } else {
                r1.A04();
                z2 = true;
            }
            z3 |= z2;
        }
        if (z3) {
            invalidate();
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C64313Nq(layoutParams);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C64313Nq(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.A0M.A0K;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0M.A0T;
        return typeface == null ? Typeface.DEFAULT : typeface;
    }

    public Drawable getContentScrim() {
        return this.A0A;
    }

    public int getExpandedTitleGravity() {
        return this.A0M.A0M;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A01;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A02;
    }

    public int getExpandedTitleMarginStart() {
        return this.A03;
    }

    public int getExpandedTitleMarginTop() {
        return this.A04;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0M.A0V;
        return typeface == null ? Typeface.DEFAULT : typeface;
    }

    public int getScrimAlpha() {
        return this.A05;
    }

    public long getScrimAnimationDuration() {
        return this.A08;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.A06;
        if (i2 >= 0) {
            return i2;
        }
        AnonymousClass030 r0 = this.A0F;
        int A062 = r0 != null ? r0.A06() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight << 1) + A062, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.A0B;
    }

    public CharSequence getTitle() {
        if (this.A0H) {
            return this.A0M.A0W;
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(((View) parent).getFitsSystemWindows());
            AnonymousClass1VF r0 = this.A0G;
            if (r0 == null) {
                r0 = new AnonymousClass3ER(this);
                this.A0G = r0;
            }
            ((AppBarLayout) parent).A01(r0);
            C004601z.A0T(this);
        }
    }

    public void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        AnonymousClass1VF r1 = this.A0G;
        if (!(r1 == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).A05) == null)) {
            list.remove(r1);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r13.A0C.getVisibility() != 0) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        /*
            r13 = this;
            super.onLayout(r14, r15, r16, r17, r18)
            X.030 r0 = r13.A0F
            r4 = 0
            if (r0 == 0) goto L_0x0029
            int r7 = r0.A06()
            int r3 = r13.getChildCount()
            r2 = 0
        L_0x0011:
            if (r2 >= r3) goto L_0x0029
            android.view.View r1 = r13.getChildAt(r2)
            boolean r0 = r1.getFitsSystemWindows()
            if (r0 != 0) goto L_0x0026
            int r0 = r1.getTop()
            if (r0 >= r7) goto L_0x0026
            X.C004601z.A0b(r1, r7)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x009a
            android.view.View r0 = r13.A0C
            if (r0 == 0) goto L_0x009a
            boolean r0 = X.C004601z.A0t(r0)
            r7 = 1
            if (r0 == 0) goto L_0x0041
            android.view.View r0 = r13.A0C
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r13.A0I = r0
            if (r0 == 0) goto L_0x009a
            int r0 = X.C004601z.A06(r13)
            if (r0 == r7) goto L_0x004d
            r7 = 0
        L_0x004d:
            android.view.View r0 = r13.A0D
            if (r0 != 0) goto L_0x0053
            androidx.appcompat.widget.Toolbar r0 = r13.A0E
        L_0x0053:
            int r12 = r13.A00(r0)
            android.view.View r0 = r13.A0C
            android.graphics.Rect r9 = r13.A0L
            X.AnonymousClass3B3.A01(r9, r0, r13)
            X.3BO r3 = r13.A0M
            int r10 = r9.left
            androidx.appcompat.widget.Toolbar r11 = r13.A0E
            if (r7 == 0) goto L_0x00d4
            int r0 = r11.A08
        L_0x0068:
            int r10 = r10 + r0
            int r8 = r9.top
            int r8 = r8 + r12
            int r0 = r11.A0A
            int r8 = r8 + r0
            int r2 = r9.right
            if (r7 == 0) goto L_0x00d1
            int r0 = r11.A09
        L_0x0075:
            int r2 = r2 + r0
            int r1 = r9.bottom
            int r1 = r1 + r12
            int r0 = r11.A07
            int r1 = r1 - r0
            r3.A0B(r10, r8, r2, r1)
            if (r7 == 0) goto L_0x00ce
            int r2 = r13.A02
        L_0x0083:
            int r1 = r9.top
            int r0 = r13.A04
            int r1 = r1 + r0
            int r6 = r17 - r15
            if (r7 == 0) goto L_0x00cb
            int r0 = r13.A03
        L_0x008e:
            int r6 = r6 - r0
            int r5 = r18 - r16
            int r0 = r13.A01
            int r5 = r5 - r0
            r3.A0C(r2, r1, r6, r5)
            r3.A04()
        L_0x009a:
            int r3 = r13.getChildCount()
        L_0x009e:
            if (r4 >= r3) goto L_0x00d7
            android.view.View r1 = r13.getChildAt(r4)
            r0 = 2131366940(0x7f0a141c, float:1.8353788E38)
            java.lang.Object r2 = r1.getTag(r0)
            X.4RQ r2 = (X.AnonymousClass4RQ) r2
            if (r2 != 0) goto L_0x00b7
            X.4RQ r2 = new X.4RQ
            r2.<init>(r1)
            r1.setTag(r0, r2)
        L_0x00b7:
            android.view.View r1 = r2.A03
            int r0 = r1.getTop()
            r2.A01 = r0
            int r0 = r1.getLeft()
            r2.A00 = r0
            r2.A00()
            int r4 = r4 + 1
            goto L_0x009e
        L_0x00cb:
            int r0 = r13.A02
            goto L_0x008e
        L_0x00ce:
            int r2 = r13.A03
            goto L_0x0083
        L_0x00d1:
            int r0 = r11.A08
            goto L_0x0075
        L_0x00d4:
            int r0 = r11.A09
            goto L_0x0068
        L_0x00d7:
            androidx.appcompat.widget.Toolbar r0 = r13.A0E
            if (r0 == 0) goto L_0x010f
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x00f0
            X.3BO r0 = r13.A0M
            java.lang.CharSequence r0 = r0.A0W
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00f0
            androidx.appcompat.widget.Toolbar r0 = r13.A0E
            java.lang.CharSequence r0 = r0.A0V
            r13.setTitle(r0)
        L_0x00f0:
            android.view.View r1 = r13.A0D
            if (r1 == 0) goto L_0x00f6
            if (r1 != r13) goto L_0x00f8
        L_0x00f6:
            androidx.appcompat.widget.Toolbar r1 = r13.A0E
        L_0x00f8:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0113
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r1.getHeight()
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            int r1 = r1 + r0
        L_0x010c:
            r13.setMinimumHeight(r1)
        L_0x010f:
            r13.A03()
            return
        L_0x0113:
            int r1 = r1.getHeight()
            goto L_0x010c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        A01();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        AnonymousClass030 r0 = this.A0F;
        int A062 = r0 != null ? r0.A06() : 0;
        if (mode == 0 && A062 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + A062, 1073741824));
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        AnonymousClass3BO r1 = this.A0M;
        if (r1.A0K != i2) {
            r1.A0K = i2;
            r1.A04();
        }
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.A0M.A09(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        AnonymousClass3BO r1 = this.A0M;
        if (r1.A0P != colorStateList) {
            r1.A0P = colorStateList;
            r1.A04();
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        AnonymousClass3BO r1 = this.A0M;
        if (r1.A0T != typeface) {
            r1.A0T = typeface;
            r1.A04();
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0A;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0A = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.A0A.setCallback(this);
                this.A0A.setAlpha(this.A05);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(AnonymousClass00T.A04(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        AnonymousClass3BO r1 = this.A0M;
        if (r1.A0M != i2) {
            r1.A0M = i2;
            r1.A04();
        }
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.A01 = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.A02 = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.A03 = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.A04 = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.A0M.A0A(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        AnonymousClass3BO r1 = this.A0M;
        if (r1.A0Q != colorStateList) {
            r1.A0Q = colorStateList;
            r1.A04();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        AnonymousClass3BO r1 = this.A0M;
        if (r1.A0V != typeface) {
            r1.A0V = typeface;
            r1.A04();
        }
    }

    public void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.A05) {
            if (!(this.A0A == null || (toolbar = this.A0E) == null)) {
                toolbar.postInvalidateOnAnimation();
            }
            this.A05 = i2;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.A08 = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.A06 != i2) {
            this.A06 = i2;
            A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (isInEditMode() != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrimsShown(boolean r6) {
        /*
            r5 = this;
            boolean r0 = X.C004601z.A0u(r5)
            if (r0 == 0) goto L_0x000d
            boolean r0 = r5.isInEditMode()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r5.A0K
            if (r0 == r6) goto L_0x0054
            r4 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0064
            if (r6 != 0) goto L_0x0019
            r4 = 0
        L_0x0019:
            r5.A01()
            android.animation.ValueAnimator r0 = r5.A09
            if (r0 != 0) goto L_0x0058
            android.animation.ValueAnimator r2 = new android.animation.ValueAnimator
            r2.<init>()
            r5.A09 = r2
            long r0 = r5.A08
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r5.A09
            int r0 = r5.A05
            if (r4 <= r0) goto L_0x0055
            android.animation.TimeInterpolator r0 = X.C53572fv.A01
        L_0x0034:
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r5.A09
            r0 = 1
            X.C13690nt.A0p(r1, r5, r0)
        L_0x003d:
            android.animation.ValueAnimator r3 = r5.A09
            r0 = 2
            int[] r2 = new int[r0]
            r1 = 0
            int r0 = r5.A05
            r2[r1] = r0
            r0 = 1
            r2[r0] = r4
            r3.setIntValues(r2)
            android.animation.ValueAnimator r0 = r5.A09
            r0.start()
        L_0x0052:
            r5.A0K = r6
        L_0x0054:
            return
        L_0x0055:
            android.animation.TimeInterpolator r0 = X.C53572fv.A04
            goto L_0x0034
        L_0x0058:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x003d
            android.animation.ValueAnimator r0 = r5.A09
            r0.cancel()
            goto L_0x003d
        L_0x0064:
            if (r6 != 0) goto L_0x0067
            r4 = 0
        L_0x0067:
            r5.setScrimAlpha(r4)
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.setScrimsShown(boolean):void");
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A0B;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0B = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A0B.setState(getDrawableState());
                }
                C018208n.A0D(C004601z.A06(this), this.A0B);
                this.A0B.setVisible(AnonymousClass000.A1P(getVisibility()), false);
                this.A0B.setCallback(this);
                this.A0B.setAlpha(this.A05);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(AnonymousClass00T.A04(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.A0M.A0E(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z2) {
        if (z2 != this.A0H) {
            this.A0H = z2;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean A1P = AnonymousClass000.A1P(i2);
        Drawable drawable = this.A0B;
        if (!(drawable == null || drawable.isVisible() == A1P)) {
            this.A0B.setVisible(A1P, false);
        }
        Drawable drawable2 = this.A0A;
        if (drawable2 != null && drawable2.isVisible() != A1P) {
            this.A0A.setVisible(A1P, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0A || drawable == this.A0B;
    }
}
