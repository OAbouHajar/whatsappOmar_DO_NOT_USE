package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass0CI;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class ActionBarContainer extends FrameLayout {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public View A04;
    public View A05;
    public View A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0043, code lost:
        if (r0 == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContainer(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            X.0AY r0 = new X.0AY
            r0.<init>(r4)
            r4.setBackground(r0)
            int[] r0 = X.AnonymousClass05L.A00
            android.content.res.TypedArray r3 = r5.obtainStyledAttributes(r6, r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r4.A01 = r0
            r0 = 2
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r4.A03 = r0
            r1 = 13
            r0 = -1
            int r0 = r3.getDimensionPixelSize(r1, r0)
            r4.A00 = r0
            int r2 = r4.getId()
            r0 = 2131366317(0x7f0a11ad, float:1.8352524E38)
            r1 = 1
            if (r2 != r0) goto L_0x003a
            r4.A07 = r1
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r1)
            r4.A02 = r0
        L_0x003a:
            r3.recycle()
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r4.A02
        L_0x0043:
            if (r0 != 0) goto L_0x0050
        L_0x0045:
            r4.setWillNotDraw(r1)
            return
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r4.A01
            if (r0 != 0) goto L_0x0050
            android.graphics.drawable.Drawable r0 = r4.A03
            goto L_0x0043
        L_0x0050:
            r1 = 0
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful()) {
            this.A01.setState(getDrawableState());
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null && drawable2.isStateful()) {
            this.A03.setState(getDrawableState());
        }
        Drawable drawable3 = this.A02;
        if (drawable3 != null && drawable3.isStateful()) {
            this.A02.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.A06;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.A02;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A04 = findViewById(R.id.action_bar);
        this.A05 = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A09 || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r7.A07 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r7.A01 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r7.A04.getVisibility() != 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r6 = r7.A01;
        r4 = r7.A04.getLeft();
        r2 = r7.A04.getTop();
        r1 = r7.A04.getRight();
        r0 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r6.setBounds(r4, r2, r1, r0.getBottom());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        r7.A08 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r3 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r4 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        if (r4 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        r4.setBounds(r5.getLeft(), r5.getTop(), r5.getRight(), r5.getBottom());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        r0 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (r0 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        if (r0.getVisibility() != 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        r6 = r7.A01;
        r4 = r7.A05.getLeft();
        r2 = r7.A05.getTop();
        r1 = r7.A05.getRight();
        r0 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        r7.A01.setBounds(0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        if (r6 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.getVisibility() == 8) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r5 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r5.getVisibility() == 8) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r4 = getMeasuredHeight();
        r1 = r4 - r5.getMeasuredHeight();
        r0 = ((android.widget.FrameLayout.LayoutParams) r5.getLayoutParams()).bottomMargin;
        r5.layout(r9, r1 - r0, r11, r4 - r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            android.view.View r5 = r7.A06
            r1 = 8
            r6 = 0
            if (r5 == 0) goto L_0x0011
            int r0 = r5.getVisibility()
            r3 = 1
            if (r0 != r1) goto L_0x0014
        L_0x0011:
            r3 = 0
            if (r5 == 0) goto L_0x0031
        L_0x0014:
            int r0 = r5.getVisibility()
            if (r0 == r1) goto L_0x0031
            int r4 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r5.getMeasuredHeight()
            int r1 = r4 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r4 = r4 - r0
            r5.layout(r9, r1, r11, r4)
        L_0x0031:
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r2 = r7.A02
            if (r2 == 0) goto L_0x0047
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            r2.setBounds(r6, r6, r1, r0)
        L_0x0044:
            r7.invalidate()
        L_0x0047:
            return
        L_0x0048:
            android.graphics.drawable.Drawable r0 = r7.A01
            if (r0 == 0) goto L_0x0072
            android.view.View r0 = r7.A04
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x008e
            android.graphics.drawable.Drawable r6 = r7.A01
            android.view.View r0 = r7.A04
            int r4 = r0.getLeft()
            android.view.View r0 = r7.A04
            int r2 = r0.getTop()
            android.view.View r0 = r7.A04
            int r1 = r0.getRight()
            android.view.View r0 = r7.A04
        L_0x006a:
            int r0 = r0.getBottom()
            r6.setBounds(r4, r2, r1, r0)
        L_0x0071:
            r6 = 1
        L_0x0072:
            r7.A08 = r3
            if (r3 == 0) goto L_0x00b5
            android.graphics.drawable.Drawable r4 = r7.A03
            if (r4 == 0) goto L_0x00b5
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L_0x0044
        L_0x008e:
            android.view.View r0 = r7.A05
            if (r0 == 0) goto L_0x00af
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00af
            android.graphics.drawable.Drawable r6 = r7.A01
            android.view.View r0 = r7.A05
            int r4 = r0.getLeft()
            android.view.View r0 = r7.A05
            int r2 = r0.getTop()
            android.view.View r0 = r7.A05
            int r1 = r0.getRight()
            android.view.View r0 = r7.A05
            goto L_0x006a
        L_0x00af:
            android.graphics.drawable.Drawable r0 = r7.A01
            r0.setBounds(r6, r6, r6, r6)
            goto L_0x0071
        L_0x00b5:
            if (r6 == 0) goto L_0x0047
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.A04
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r3) goto L_0x001c
            int r1 = r6.A00
            if (r1 < 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = java.lang.Math.min(r1, r0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L_0x001c:
            super.onMeasure(r7, r8)
            android.view.View r0 = r6.A04
            if (r0 == 0) goto L_0x007d
            int r4 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View r0 = r6.A06
            if (r0 == 0) goto L_0x007d
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x007d
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x007d
            android.view.View r1 = r6.A04
            if (r1 == 0) goto L_0x0082
            int r0 = r1.getVisibility()
            if (r0 == r2) goto L_0x0082
            int r0 = r1.getMeasuredHeight()
            if (r0 == 0) goto L_0x0082
            android.view.View r0 = r6.A04
        L_0x0049:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r1 = r0.getMeasuredHeight()
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            int r1 = r1 + r0
        L_0x0059:
            if (r4 != r3) goto L_0x007e
            int r5 = android.view.View.MeasureSpec.getSize(r8)
        L_0x005f:
            int r4 = r6.getMeasuredWidth()
            android.view.View r0 = r6.A06
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r0.getMeasuredHeight()
            int r0 = r3.topMargin
            int r2 = r2 + r0
            int r0 = r3.bottomMargin
            int r2 = r2 + r0
            int r1 = r1 + r2
            int r0 = java.lang.Math.min(r1, r5)
            r6.setMeasuredDimension(r4, r0)
        L_0x007d:
            return
        L_0x007e:
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x005f
        L_0x0082:
            android.view.View r1 = r6.A05
            if (r1 == 0) goto L_0x0095
            int r0 = r1.getVisibility()
            if (r0 == r2) goto L_0x0095
            int r0 = r1.getMeasuredHeight()
            if (r0 == 0) goto L_0x0095
            android.view.View r0 = r6.A05
            goto L_0x0049
        L_0x0095:
            r1 = 0
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPrimaryBackground(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r1 = r5.A01
            if (r1 == 0) goto L_0x000d
            r0 = 0
            r1.setCallback(r0)
            android.graphics.drawable.Drawable r0 = r5.A01
            r5.unscheduleDrawable(r0)
        L_0x000d:
            r5.A01 = r6
            if (r6 == 0) goto L_0x0033
            r6.setCallback(r5)
            android.view.View r0 = r5.A04
            if (r0 == 0) goto L_0x0033
            android.graphics.drawable.Drawable r4 = r5.A01
            int r3 = r0.getLeft()
            android.view.View r0 = r5.A04
            int r2 = r0.getTop()
            android.view.View r0 = r5.A04
            int r1 = r0.getRight()
            android.view.View r0 = r5.A04
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L_0x0033:
            boolean r0 = r5.A07
            r1 = 1
            if (r0 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r0 = r5.A02
        L_0x003a:
            if (r0 != 0) goto L_0x0053
        L_0x003c:
            r5.setWillNotDraw(r1)
            r5.invalidate()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x004b
            r5.invalidateOutline()
        L_0x004b:
            return
        L_0x004c:
            android.graphics.drawable.Drawable r0 = r5.A01
            if (r0 != 0) goto L_0x0053
            android.graphics.drawable.Drawable r0 = r5.A03
            goto L_0x003a
        L_0x0053:
            r1 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setPrimaryBackground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSplitBackground(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r1 = r4.A02
            if (r1 == 0) goto L_0x000d
            r0 = 0
            r1.setCallback(r0)
            android.graphics.drawable.Drawable r0 = r4.A02
            r4.unscheduleDrawable(r0)
        L_0x000d:
            r4.A02 = r5
            r3 = 0
            if (r5 == 0) goto L_0x0028
            r5.setCallback(r4)
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0028
            android.graphics.drawable.Drawable r2 = r4.A02
            if (r2 == 0) goto L_0x0028
            int r1 = r4.getMeasuredWidth()
            int r0 = r4.getMeasuredHeight()
            r2.setBounds(r3, r3, r1, r0)
        L_0x0028:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.Drawable r0 = r4.A02
        L_0x002e:
            if (r0 != 0) goto L_0x0031
            r3 = 1
        L_0x0031:
            r4.setWillNotDraw(r3)
            r4.invalidate()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0040
            r4.invalidateOutline()
        L_0x0040:
            return
        L_0x0041:
            android.graphics.drawable.Drawable r0 = r4.A01
            if (r0 != 0) goto L_0x0031
            android.graphics.drawable.Drawable r0 = r4.A03
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setSplitBackground(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackedBackground(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r1 = r5.A03
            if (r1 == 0) goto L_0x000d
            r0 = 0
            r1.setCallback(r0)
            android.graphics.drawable.Drawable r0 = r5.A03
            r5.unscheduleDrawable(r0)
        L_0x000d:
            r5.A03 = r6
            if (r6 == 0) goto L_0x0037
            r6.setCallback(r5)
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0037
            android.graphics.drawable.Drawable r4 = r5.A03
            if (r4 == 0) goto L_0x0037
            android.view.View r0 = r5.A06
            int r3 = r0.getLeft()
            android.view.View r0 = r5.A06
            int r2 = r0.getTop()
            android.view.View r0 = r5.A06
            int r1 = r0.getRight()
            android.view.View r0 = r5.A06
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L_0x0037:
            boolean r0 = r5.A07
            r1 = 1
            if (r0 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r0 = r5.A02
        L_0x003e:
            if (r0 != 0) goto L_0x0057
        L_0x0040:
            r5.setWillNotDraw(r1)
            r5.invalidate()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x004f
            r5.invalidateOutline()
        L_0x004f:
            return
        L_0x0050:
            android.graphics.drawable.Drawable r0 = r5.A01
            if (r0 != 0) goto L_0x0057
            android.graphics.drawable.Drawable r0 = r5.A03
            goto L_0x003e
        L_0x0057:
            r1 = 0
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setStackedBackground(android.graphics.drawable.Drawable):void");
    }

    public void setTabContainer(AnonymousClass0CI r3) {
        View view = this.A06;
        if (view != null) {
            removeView(view);
        }
        this.A06 = r3;
        if (r3 != null) {
            addView(r3);
            ViewGroup.LayoutParams layoutParams = r3.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            throw AnonymousClass000.A0W("setAllowCollapse");
        }
    }

    public void setTransitioning(boolean z2) {
        this.A09 = z2;
        int i2 = AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
        if (z2) {
            i2 = 393216;
        }
        setDescendantFocusability(i2);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean A1P = AnonymousClass000.A1P(i2);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setVisible(A1P, false);
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null) {
            drawable2.setVisible(A1P, false);
        }
        Drawable drawable3 = this.A02;
        if (drawable3 != null) {
            drawable3.setVisible(A1P, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.A01 && !this.A07) || (drawable == this.A03 && this.A08) || ((drawable == this.A02 && this.A07) || super.verifyDrawable(drawable));
    }
}
