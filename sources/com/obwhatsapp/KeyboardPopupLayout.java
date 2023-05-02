package com.obwhatsapp;

import X.AnonymousClass2JI;
import X.C15430qs;
import X.C15440qu;
import X.C23061Ai;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

public class KeyboardPopupLayout extends C15440qu implements C15430qs {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public Paint A03;
    public AnonymousClass2JI A04;
    public C23061Ai A05;
    public boolean A06 = false;
    public boolean A07;
    public final Rect A08 = new Rect();
    public final int[] A09 = new int[2];

    public KeyboardPopupLayout(Context context) {
        super(context);
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    private int getSizeWithKeyboard() {
        int i2 = getResources().getConfiguration().orientation;
        if (i2 == 1) {
            return this.A02;
        }
        if (i2 != 2) {
            return -1;
        }
        return this.A01;
    }

    public AnonymousClass2JI getKeyboardPopup() {
        return this.A04;
    }

    public void invalidate() {
        if (!this.A06) {
            super.invalidate();
        }
    }

    public void invalidate(int i2, int i3, int i4, int i5) {
        if (!this.A06) {
            super.invalidate(i2, i3, i4, i5);
        }
    }

    public void invalidate(Rect rect) {
        if (!this.A06) {
            super.invalidate(rect);
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.A03 != null && this.A00 != getHeight()) {
            Rect rect = this.A08;
            rect.set(0, this.A00, getWidth(), getHeight());
            canvas.drawRect(rect, this.A03);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.A06) {
            return;
        }
        if (this.A04 != null) {
            super.onLayout(z2, i2, i3, i4, i3 + this.A00);
            int[] iArr = this.A09;
            getLocationInWindow(iArr);
            boolean z3 = this.A07;
            AnonymousClass2JI r3 = this.A04;
            r3.update(iArr[0] + getPaddingLeft(), z3 ? 1000000 : iArr[1] + this.A00, (i4 - i2) - getPaddingRight(), r3.A01);
            return;
        }
        super.onLayout(z2, i2, i3, i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        if (X.C23061Ai.A00(r7) != false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.isInEditMode()
            if (r0 != 0) goto L_0x0107
            boolean r0 = r7.A07
            r2 = -1
            if (r0 != 0) goto L_0x008d
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            android.content.Context r0 = r7.getContext()
            android.app.Activity r4 = X.AnonymousClass22N.A00(r0)
            if (r4 == 0) goto L_0x005b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x005b
            boolean r0 = r4.isInMultiWindowMode()
            if (r0 == 0) goto L_0x005b
        L_0x0025:
            r7.A00 = r3
            X.2JI r1 = r7.A04
            if (r1 == 0) goto L_0x0107
            int r0 = r1.A03(r2)
            r1.A01 = r0
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            if (r2 == 0) goto L_0x004a
            X.1Ai r0 = r7.A05
            if (r0 == 0) goto L_0x004a
            boolean r0 = X.C23061Ai.A00(r7)
            if (r0 != 0) goto L_0x004a
            int r1 = r7.A00
            X.2JI r0 = r7.A04
            int r0 = r0.A01
            int r1 = r1 - r0
            r7.A00 = r1
        L_0x004a:
            int r0 = r7.A00
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            super.onMeasure(r8, r0)
            int r0 = r7.getMeasuredWidth()
            r7.setMeasuredDimension(r0, r3)
            return
        L_0x005b:
            X.1Ai r0 = r7.A05
            if (r0 == 0) goto L_0x0081
            boolean r0 = X.C23061Ai.A00(r7)
            if (r0 == 0) goto L_0x0081
            X.2JI r0 = r7.A04
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0081
        L_0x006f:
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            if (r1 == r0) goto L_0x008a
            r0 = 2
            if (r1 != r0) goto L_0x0081
            r7.A01 = r3
        L_0x0081:
            int r0 = r7.getSizeWithKeyboard()
            if (r0 == r2) goto L_0x0025
            int r2 = r3 - r0
            goto L_0x0025
        L_0x008a:
            r7.A02 = r3
            goto L_0x0081
        L_0x008d:
            X.2JI r0 = r7.A04
            if (r0 == 0) goto L_0x0107
            X.1Ai r0 = r7.A05
            r6 = 0
            if (r0 == 0) goto L_0x009d
            boolean r0 = X.C23061Ai.A00(r7)
            r5 = 1
            if (r0 == 0) goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            int r4 = android.view.View.MeasureSpec.getSize(r9)
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            X.2JI r1 = r7.A04
            int r0 = r1.A03(r2)
            r1.A01 = r0
            X.2JI r0 = r7.A04
            int r2 = r0.A01
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 != r0) goto L_0x00cc
            if (r5 == 0) goto L_0x00b9
            int r4 = r4 - r2
        L_0x00b9:
            r7.A00 = r4
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            super.onMeasure(r8, r0)
        L_0x00c2:
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.A00
        L_0x00c8:
            r7.setMeasuredDimension(r1, r0)
            return
        L_0x00cc:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L_0x00f2
            r0 = r4
            if (r5 == 0) goto L_0x00d5
            int r0 = r4 - r2
        L_0x00d5:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            super.onMeasure(r8, r0)
            int r0 = r7.getMeasuredHeight()
            r7.A00 = r0
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            if (r5 == 0) goto L_0x00ed
            int r0 = r0 + r2
        L_0x00ed:
            int r0 = java.lang.Math.min(r0, r4)
            goto L_0x00c8
        L_0x00f2:
            if (r5 == 0) goto L_0x00f5
            int r4 = r4 - r2
        L_0x00f5:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            super.onMeasure(r8, r0)
            int r0 = r7.getMeasuredHeight()
            if (r5 == 0) goto L_0x0103
            r6 = r2
        L_0x0103:
            int r0 = r0 + r6
            r7.A00 = r0
            goto L_0x00c2
        L_0x0107:
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.KeyboardPopupLayout.onMeasure(int, int):void");
    }

    public void requestLayout() {
        if (!this.A06) {
            super.requestLayout();
        }
    }

    public void setHeightShouldWrap(boolean z2) {
        this.A07 = z2;
    }

    public void setKeyboardPopup(AnonymousClass2JI r2) {
        if (this.A04 != r2) {
            this.A04 = r2;
            requestLayout();
        }
    }

    public void setKeyboardPopupBackgroundColor(int i2) {
        if (this.A03 == null) {
            this.A03 = new Paint(1);
        }
        setWillNotDraw(false);
        this.A03.setColor(i2);
    }
}
