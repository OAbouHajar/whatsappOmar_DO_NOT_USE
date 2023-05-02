package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2o5  reason: invalid class name */
public class AnonymousClass2o5 extends ViewGroup {
    public int A00;
    public int A01;
    public boolean A02 = false;

    public AnonymousClass2o5(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C53362fa.A09, 0, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.A00;
    }

    public int getLineSpacing() {
        return this.A01;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int paddingRight;
        int i6;
        int i7;
        if (getChildCount() != 0) {
            boolean z3 = true;
            if (C004601z.A06(this) == 1) {
                paddingLeft = getPaddingRight();
                paddingRight = getPaddingLeft();
            } else {
                z3 = false;
                paddingLeft = getPaddingLeft();
                paddingRight = getPaddingRight();
            }
            int paddingTop = getPaddingTop();
            int i8 = (i4 - i2) - paddingRight;
            int i9 = paddingLeft;
            int i10 = paddingTop;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i7 = C05580Sd.A01(marginLayoutParams);
                        i6 = C05580Sd.A00(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i7 = 0;
                    }
                    int measuredWidth = i9 + i7 + childAt.getMeasuredWidth();
                    if (!this.A02 && measuredWidth > i8) {
                        i10 = this.A01 + paddingTop;
                        i9 = paddingLeft;
                    }
                    int i12 = i9 + i7;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i12;
                    paddingTop = childAt.getMeasuredHeight() + i10;
                    if (z3) {
                        i12 = i8 - measuredWidth2;
                        measuredWidth2 = (i8 - i9) - i7;
                    }
                    childAt.layout(i12, i10, measuredWidth2, paddingTop);
                    i9 += i7 + i6 + childAt.getMeasuredWidth() + this.A00;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r10 != 1073741824) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r8 != 1073741824) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r10 == 1073741824) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r13 = r19
            int r11 = android.view.View.MeasureSpec.getSize(r13)
            int r10 = android.view.View.MeasureSpec.getMode(r13)
            r12 = r20
            int r9 = android.view.View.MeasureSpec.getSize(r12)
            int r8 = android.view.View.MeasureSpec.getMode(r12)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x001f
            r0 = 1073741824(0x40000000, float:2.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r10 != r0) goto L_0x0020
        L_0x001f:
            r7 = r11
        L_0x0020:
            r6 = r18
            int r17 = r6.getPaddingLeft()
            int r5 = r6.getPaddingTop()
            int r0 = r6.getPaddingRight()
            int r7 = r7 - r0
            r1 = r5
            r4 = 0
            r3 = 0
        L_0x0032:
            int r0 = r6.getChildCount()
            if (r4 >= r0) goto L_0x008a
            android.view.View r15 = r6.getChildAt(r4)
            int r2 = r15.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0084
            r6.measureChild(r15, r13, r12)
            android.view.ViewGroup$LayoutParams r14 = r15.getLayoutParams()
            boolean r0 = r14 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0087
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            int r2 = r14.leftMargin
            int r14 = r14.rightMargin
        L_0x0055:
            int r0 = r17 + r2
            int r16 = r15.getMeasuredWidth()
            int r0 = r0 + r16
            if (r0 <= r7) goto L_0x006a
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x006a
            int r17 = r6.getPaddingLeft()
            int r1 = r6.A01
            int r1 = r1 + r5
        L_0x006a:
            int r0 = r17 + r2
            int r5 = r15.getMeasuredWidth()
            int r0 = r0 + r5
            int r5 = r15.getMeasuredHeight()
            int r5 = r5 + r1
            if (r0 <= r3) goto L_0x0079
            r3 = r0
        L_0x0079:
            int r2 = r2 + r14
            int r0 = r15.getMeasuredWidth()
            int r2 = r2 + r0
            int r0 = r6.A00
            int r2 = r2 + r0
            int r17 = r17 + r2
        L_0x0084:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0087:
            r2 = 0
            r14 = 0
            goto L_0x0055
        L_0x008a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x00a4
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 == r0) goto L_0x00a8
        L_0x0092:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x009e
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 == r0) goto L_0x00a2
        L_0x009a:
            r6.setMeasuredDimension(r3, r5)
            return
        L_0x009e:
            int r9 = java.lang.Math.min(r5, r9)
        L_0x00a2:
            r5 = r9
            goto L_0x009a
        L_0x00a4:
            int r11 = java.lang.Math.min(r3, r11)
        L_0x00a8:
            r3 = r11
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2o5.onMeasure(int, int):void");
    }

    public void setItemSpacing(int i2) {
        this.A00 = i2;
    }

    public void setLineSpacing(int i2) {
        this.A01 = i2;
    }

    public void setSingleLine(boolean z2) {
        this.A02 = z2;
    }
}
