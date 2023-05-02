package androidx.appcompat.widget;

import X.AnonymousClass05L;
import X.AnonymousClass07T;
import X.AnonymousClass0CO;
import X.C004601z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Drawable A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A0B = true;
        this.A01 = -1;
        this.A02 = 0;
        this.A06 = 8388659;
        int[] iArr = AnonymousClass05L.A0C;
        AnonymousClass07T A002 = AnonymousClass07T.A00(context, attributeSet, iArr, i2, 0);
        TypedArray typedArray = A002.A02;
        C004601z.A0N(context, typedArray, attributeSet, this, iArr, i2);
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        if (!typedArray.getBoolean(2, true)) {
            this.A0B = false;
        }
        this.A00 = typedArray.getFloat(4, -1.0f);
        this.A01 = typedArray.getInt(3, -1);
        this.A0C = typedArray.getBoolean(7, false);
        setDividerDrawable(A002.A02(5));
        this.A08 = typedArray.getInt(8, 0);
        this.A04 = typedArray.getDimensionPixelSize(6, 0);
        A002.A04();
    }

    /* renamed from: A00 */
    public AnonymousClass0CO generateDefaultLayoutParams() {
        int i2 = this.A07;
        int i3 = -2;
        if (i2 != 0) {
            if (i2 != 1) {
                return null;
            }
            i3 = -1;
        }
        return new AnonymousClass0CO(i3);
    }

    /* renamed from: A01 */
    public AnonymousClass0CO generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass0CO(getContext(), attributeSet);
    }

    /* renamed from: A02 */
    public AnonymousClass0CO generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass0CO(layoutParams);
    }

    public void A03(Canvas canvas, int i2) {
        this.A0A.setBounds(getPaddingLeft() + this.A04, i2, (getWidth() - getPaddingRight()) - this.A04, this.A03 + i2);
        this.A0A.draw(canvas);
    }

    public void A04(Canvas canvas, int i2) {
        this.A0A.setBounds(i2, getPaddingTop() + this.A04, this.A05 + i2, (getHeight() - getPaddingBottom()) - this.A04);
        this.A0A.draw(canvas);
    }

    public boolean A05(int i2) {
        int i3;
        if (i2 == 0) {
            i3 = this.A08 & 1;
        } else {
            int childCount = getChildCount();
            int i4 = this.A08;
            if (i2 == childCount) {
                i3 = i4 & 4;
            } else if ((i4 & 2) == 0) {
                return false;
            } else {
                int i5 = i2 - 1;
                while (i5 >= 0) {
                    if (getChildAt(i5).getVisibility() == 8) {
                        i5--;
                    }
                }
                return false;
            }
        }
        return i3 != 0;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass0CO;
    }

    public int getBaseline() {
        int i2;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.A01;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.A02;
                if (this.A07 == 1 && (i2 = this.A06 & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.A09) >> 1;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.A09;
                    }
                }
                return i4 + ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.A01 == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A0A;
    }

    public int getDividerPadding() {
        return this.A04;
    }

    public int getDividerWidth() {
        return this.A05;
    }

    public int getGravity() {
        return this.A06;
    }

    public int getOrientation() {
        return this.A07;
    }

    public int getShowDividers() {
        return this.A08;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.A00;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.A0A == null) {
            return;
        }
        if (this.A07 == 1) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!(childAt == null || childAt.getVisibility() == 8 || !A05(i5))) {
                    A03(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin) - this.A03);
                }
            }
            if (A05(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                A03(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.A03 : childAt2.getBottom() + ((LinearLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean z2 = true;
        if (C004601z.A06(this) != 1) {
            z2 = false;
        }
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt3 = getChildAt(i6);
            if (!(childAt3 == null || childAt3.getVisibility() == 8 || !A05(i6))) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt3.getLayoutParams();
                A04(canvas, z2 ? childAt3.getRight() + layoutParams.rightMargin : (childAt3.getLeft() - layoutParams.leftMargin) - this.A05);
            }
        }
        if (A05(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt4.getLayoutParams();
                if (z2) {
                    i2 = childAt4.getLeft();
                    i3 = layoutParams2.leftMargin;
                    i4 = (i2 - i3) - this.A05;
                } else {
                    i4 = childAt4.getRight() + layoutParams2.rightMargin;
                }
            } else if (z2) {
                i4 = getPaddingLeft();
            } else {
                i2 = getWidth();
                i3 = getPaddingRight();
                i4 = (i2 - i3) - this.A05;
            }
            A04(canvas, i4);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r7 = r22
            int r0 = r7.A07
            r6 = 1
            if (r0 != r6) goto L_0x00a6
            int r13 = r7.getPaddingLeft()
            int r26 = r26 - r24
            int r0 = r7.getPaddingRight()
            int r12 = r26 - r0
            int r26 = r26 - r13
            int r0 = r7.getPaddingRight()
            int r26 = r26 - r0
            int r4 = r7.getChildCount()
            int r3 = r7.A06
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            r0 = 16
            if (r1 == r0) goto L_0x0098
            r0 = 80
            int r2 = r7.getPaddingTop()
            if (r1 != r0) goto L_0x003a
            int r2 = r2 + r27
            int r2 = r2 - r25
            int r0 = r7.A09
            int r2 = r2 - r0
        L_0x003a:
            r9 = 0
        L_0x003b:
            if (r9 >= r4) goto L_0x0195
            android.view.View r10 = r7.getChildAt(r9)
            if (r10 == 0) goto L_0x0086
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0086
            int r8 = r10.getMeasuredWidth()
            int r11 = r10.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r5 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L_0x005e
            r1 = r3
        L_0x005e:
            int r0 = X.C004601z.A06(r7)
            int r0 = X.C05570Sc.A00(r1, r0)
            r1 = r0 & 7
            if (r1 == r6) goto L_0x0089
            r0 = 5
            if (r1 == r0) goto L_0x0092
            int r1 = r5.leftMargin
            int r1 = r1 + r13
        L_0x0070:
            boolean r0 = r7.A05(r9)
            if (r0 == 0) goto L_0x0079
            int r0 = r7.A03
            int r2 = r2 + r0
        L_0x0079:
            int r0 = r5.topMargin
            int r2 = r2 + r0
            int r8 = r8 + r1
            int r0 = r11 + r2
            r10.layout(r1, r2, r8, r0)
            int r0 = r5.bottomMargin
            int r11 = r11 + r0
            int r2 = r2 + r11
        L_0x0086:
            int r9 = r9 + 1
            goto L_0x003b
        L_0x0089:
            int r0 = r26 - r8
            int r1 = r0 >> 1
            int r1 = r1 + r13
            int r0 = r5.leftMargin
            int r1 = r1 + r0
            goto L_0x0094
        L_0x0092:
            int r1 = r12 - r8
        L_0x0094:
            int r0 = r5.rightMargin
            int r1 = r1 - r0
            goto L_0x0070
        L_0x0098:
            int r2 = r7.getPaddingTop()
            int r27 = r27 - r25
            int r0 = r7.A09
            int r27 = r27 - r0
            int r0 = r27 >> 1
            int r2 = r2 + r0
            goto L_0x003a
        L_0x00a6:
            int r0 = X.C004601z.A06(r7)
            r9 = 1
            if (r0 == r6) goto L_0x00ae
            r9 = 0
        L_0x00ae:
            int r21 = r7.getPaddingTop()
            int r27 = r27 - r25
            int r0 = r7.getPaddingBottom()
            int r20 = r27 - r0
            int r27 = r27 - r21
            int r0 = r7.getPaddingBottom()
            int r27 = r27 - r0
            int r8 = r7.getChildCount()
            int r0 = r7.A06
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r19 = r0 & 112(0x70, float:1.57E-43)
            boolean r5 = r7.A0B
            int[] r4 = r7.A0D
            int[] r3 = r7.A0E
            int r0 = X.C004601z.A06(r7)
            int r2 = X.C05570Sc.A00(r1, r0)
            r1 = 2
            if (r2 == r6) goto L_0x0185
            r0 = 5
            int r18 = r7.getPaddingLeft()
            if (r2 != r0) goto L_0x00ee
            int r18 = r18 + r26
            int r18 = r18 - r24
            int r0 = r7.A09
            int r18 = r18 - r0
        L_0x00ee:
            r17 = 0
            r16 = 1
            if (r9 == 0) goto L_0x00f8
            int r17 = r8 + -1
            r16 = -1
        L_0x00f8:
            r12 = 0
        L_0x00f9:
            if (r12 >= r8) goto L_0x0195
            int r0 = r16 * r12
            int r11 = r17 + r0
            android.view.View r10 = r7.getChildAt(r11)
            if (r10 == 0) goto L_0x0168
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0168
            int r15 = r10.getMeasuredWidth()
            int r9 = r10.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            if (r5 == 0) goto L_0x0183
            int r1 = r2.height
            r0 = -1
            if (r1 == r0) goto L_0x0183
            int r13 = r10.getBaseline()
        L_0x0126:
            int r0 = r2.gravity
            if (r0 >= 0) goto L_0x012c
            r0 = r19
        L_0x012c:
            r14 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r14 == r0) goto L_0x0177
            r0 = 48
            if (r14 == r0) goto L_0x016b
            r0 = 80
            r1 = r21
            if (r14 != r0) goto L_0x014e
            int r1 = r20 - r9
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            r0 = -1
            if (r13 == r0) goto L_0x014e
            int r14 = r10.getMeasuredHeight()
            int r14 = r14 - r13
            r0 = 2
            r0 = r3[r0]
            int r0 = r0 - r14
        L_0x014d:
            int r1 = r1 - r0
        L_0x014e:
            boolean r0 = r7.A05(r11)
            if (r0 == 0) goto L_0x0158
            int r0 = r7.A05
            int r18 = r18 + r0
        L_0x0158:
            int r11 = r2.leftMargin
            int r11 = r11 + r18
            int r0 = r15 + r11
            int r9 = r9 + r1
            r10.layout(r11, r1, r0, r9)
            int r0 = r2.rightMargin
            int r15 = r15 + r0
            int r11 = r11 + r15
            r18 = r11
        L_0x0168:
            int r12 = r12 + 1
            goto L_0x00f9
        L_0x016b:
            r0 = -1
            int r1 = r2.topMargin
            int r1 = r1 + r21
            if (r13 == r0) goto L_0x014e
            r0 = r4[r6]
            int r0 = r0 - r13
            int r1 = r1 + r0
            goto L_0x014e
        L_0x0177:
            int r1 = r27 - r9
            r0 = 2
            int r1 = r1 / r0
            int r1 = r1 + r21
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            goto L_0x014d
        L_0x0183:
            r13 = -1
            goto L_0x0126
        L_0x0185:
            int r18 = r7.getPaddingLeft()
            int r26 = r26 - r24
            int r0 = r7.A09
            int r26 = r26 - r0
            int r26 = r26 / r1
            int r18 = r18 + r26
            goto L_0x00ee
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x020e, code lost:
        if (r10.width == -1) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021a, code lost:
        if (r10.width != r2) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e5, code lost:
        if (r12.height != -1) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05b7, code lost:
        if (r3.height != -1) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05d6, code lost:
        if (r3.height != -1) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        if (r2.width != -1) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0405  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r37, int r38) {
        /*
            r36 = this;
            r1 = r36
            int r0 = r1.A07
            r11 = 1
            r32 = r37
            r34 = r38
            if (r0 != r11) goto L_0x02e8
            r0 = 0
            r1.A09 = r0
            int r6 = r1.getChildCount()
            int r22 = android.view.View.MeasureSpec.getMode(r32)
            int r11 = android.view.View.MeasureSpec.getMode(r34)
            int r12 = r1.A01
            boolean r10 = r1.A0C
            r21 = 0
            r20 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r19 = 0
            r18 = 1
            r17 = 0
        L_0x002e:
            r2 = 8
            if (r3 >= r6) goto L_0x0125
            android.view.View r24 = r1.getChildAt(r3)
            if (r24 != 0) goto L_0x003f
            int r0 = r1.A09
            r1.A09 = r0
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x002e
        L_0x003f:
            int r0 = r24.getVisibility()
            if (r0 == r2) goto L_0x003c
            boolean r0 = r1.A05(r3)
            if (r0 == 0) goto L_0x0052
            int r2 = r1.A09
            int r0 = r1.A03
            int r2 = r2 + r0
            r1.A09 = r2
        L_0x0052:
            android.view.ViewGroup$LayoutParams r2 = r24.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            float r13 = r2.weight
            float r20 = r20 + r13
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 != r0) goto L_0x0092
            int r0 = r2.height
            if (r0 != 0) goto L_0x0092
            int r0 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0092
            int r13 = r1.A09
            int r11 = r2.topMargin
            int r11 = r11 + r13
            int r0 = r2.bottomMargin
            int r11 = r11 + r0
            int r13 = java.lang.Math.max(r13, r11)
            r1.A09 = r13
            r19 = 1
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x007a:
            if (r12 < 0) goto L_0x0082
            int r0 = r3 + 1
            if (r12 != r0) goto L_0x0082
            r1.A02 = r13
        L_0x0082:
            if (r3 >= r12) goto L_0x00d7
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0092:
            int r0 = r2.height
            if (r0 != 0) goto L_0x00d4
            int r0 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d4
            r0 = -2
            r2.height = r0
            r13 = 0
        L_0x009e:
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x00d2
            int r0 = r1.A09
        L_0x00a4:
            r26 = 0
            r23 = r1
            r25 = r32
            r27 = r34
            r28 = r0
            r23.measureChildWithMargins(r24, r25, r26, r27, r28)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x00b7
            r2.height = r13
        L_0x00b7:
            int r15 = r24.getMeasuredHeight()
            int r14 = r1.A09
            int r13 = r14 + r15
            int r0 = r2.topMargin
            int r13 = r13 + r0
            int r0 = r2.bottomMargin
            int r13 = r13 + r0
            int r13 = java.lang.Math.max(r14, r13)
            r1.A09 = r13
            if (r10 == 0) goto L_0x007a
            int r7 = java.lang.Math.max(r15, r7)
            goto L_0x007a
        L_0x00d2:
            r0 = 0
            goto L_0x00a4
        L_0x00d4:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x00d7:
            r13 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r13) goto L_0x0122
            int r13 = r2.width
            r0 = -1
            if (r13 != r0) goto L_0x0122
            r16 = 1
            r17 = 1
        L_0x00e6:
            int r14 = r2.leftMargin
            int r0 = r2.rightMargin
            int r14 = r14 + r0
            int r13 = r24.getMeasuredWidth()
            int r13 = r13 + r14
            int r8 = java.lang.Math.max(r8, r13)
            int r0 = r24.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            if (r18 == 0) goto L_0x0106
            int r0 = r2.width
            r15 = r0
            r18 = 1
            r0 = -1
            if (r15 == r0) goto L_0x0108
        L_0x0106:
            r18 = 0
        L_0x0108:
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x011a
            if (r16 != 0) goto L_0x0111
            r14 = r13
        L_0x0111:
            int r5 = java.lang.Math.max(r5, r14)
        L_0x0115:
            r0 = 0
            int r0 = r0 + r3
            r3 = r0
            goto L_0x003c
        L_0x011a:
            if (r16 != 0) goto L_0x011d
            r14 = r13
        L_0x011d:
            int r4 = java.lang.Math.max(r4, r14)
            goto L_0x0115
        L_0x0122:
            r16 = 0
            goto L_0x00e6
        L_0x0125:
            int r0 = r1.A09
            if (r0 <= 0) goto L_0x0136
            boolean r0 = r1.A05(r6)
            if (r0 == 0) goto L_0x0136
            int r3 = r1.A09
            int r0 = r1.A03
            int r3 = r3 + r0
            r1.A09 = r3
        L_0x0136:
            if (r10 == 0) goto L_0x016b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r0) goto L_0x013e
            if (r11 != 0) goto L_0x016b
        L_0x013e:
            r14 = 0
            r1.A09 = r14
        L_0x0141:
            if (r14 >= r6) goto L_0x016b
            android.view.View r3 = r1.getChildAt(r14)
            if (r3 != 0) goto L_0x0150
            int r0 = r1.A09
        L_0x014b:
            r1.A09 = r0
        L_0x014d:
            int r14 = r14 + 1
            goto L_0x0141
        L_0x0150:
            int r0 = r3.getVisibility()
            if (r0 == r2) goto L_0x014d
            android.view.ViewGroup$LayoutParams r13 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r13 = (android.widget.LinearLayout.LayoutParams) r13
            int r12 = r1.A09
            int r3 = r12 + r7
            int r0 = r13.topMargin
            int r3 = r3 + r0
            int r0 = r13.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r12, r3)
            goto L_0x014b
        L_0x016b:
            int r12 = r1.A09
            int r3 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            int r3 = r3 + r0
            int r12 = r12 + r3
            r1.A09 = r12
            int r0 = r1.getSuggestedMinimumHeight()
            int r12 = java.lang.Math.max(r12, r0)
            r3 = 0
            r0 = r34
            int r3 = android.view.View.resolveSizeAndState(r12, r0, r3)
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r3
            int r0 = r1.A09
            int r12 = r12 - r0
            if (r19 != 0) goto L_0x0197
            if (r12 == 0) goto L_0x0241
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0241
        L_0x0197:
            float r2 = r1.A00
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x019f
            r20 = r2
        L_0x019f:
            r0 = 0
            r1.A09 = r0
            r7 = 0
        L_0x01a3:
            if (r7 >= r6) goto L_0x027a
            android.view.View r13 = r1.getChildAt(r7)
            int r2 = r13.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0231
            android.view.ViewGroup$LayoutParams r10 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            float r2 = r10.weight
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f7
            float r0 = (float) r12
            float r0 = r0 * r2
            float r0 = r0 / r20
            int r14 = (int) r0
            float r20 = r20 - r2
            int r12 = r12 - r14
            int r5 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r5 = r5 + r0
            int r0 = r10.leftMargin
            int r5 = r5 + r0
            int r0 = r10.rightMargin
            int r5 = r5 + r0
            int r2 = r10.width
            r0 = r32
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r0, r5, r2)
            int r0 = r10.height
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0238
            if (r11 != r2) goto L_0x0238
            if (r14 <= 0) goto L_0x023f
        L_0x01e6:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r2)
            r13.measure(r5, r0)
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
        L_0x01f7:
            int r14 = r10.leftMargin
            int r0 = r10.rightMargin
            int r14 = r14 + r0
            int r5 = r13.getMeasuredWidth()
            int r5 = r5 + r14
            int r8 = java.lang.Math.max(r8, r5)
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r2) goto L_0x0235
            int r0 = r10.width
            r2 = -1
            if (r0 != r2) goto L_0x0236
        L_0x0210:
            int r4 = java.lang.Math.max(r4, r14)
            if (r18 == 0) goto L_0x021c
            int r0 = r10.width
            r18 = 1
            if (r0 == r2) goto L_0x021e
        L_0x021c:
            r18 = 0
        L_0x021e:
            int r5 = r1.A09
            int r2 = r13.getMeasuredHeight()
            int r2 = r2 + r5
            int r0 = r10.topMargin
            int r2 = r2 + r0
            int r0 = r10.bottomMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r5, r2)
            r1.A09 = r0
        L_0x0231:
            int r7 = r7 + 1
            goto L_0x01a3
        L_0x0235:
            r2 = -1
        L_0x0236:
            r14 = r5
            goto L_0x0210
        L_0x0238:
            int r0 = r13.getMeasuredHeight()
            int r14 = r14 + r0
            if (r14 >= 0) goto L_0x01e6
        L_0x023f:
            r14 = 0
            goto L_0x01e6
        L_0x0241:
            int r4 = java.lang.Math.max(r4, r5)
            if (r10 == 0) goto L_0x0288
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 == r0) goto L_0x0288
            r11 = 0
        L_0x024c:
            if (r11 >= r6) goto L_0x0288
            android.view.View r10 = r1.getChildAt(r11)
            if (r10 == 0) goto L_0x0277
            int r0 = r10.getVisibility()
            if (r0 == r2) goto L_0x0277
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            float r0 = r0.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0277
            int r5 = r10.getMeasuredWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            r10.measure(r5, r0)
        L_0x0277:
            int r11 = r11 + 1
            goto L_0x024c
        L_0x027a:
            int r5 = r1.A09
            int r2 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            int r2 = r2 + r0
            int r5 = r5 + r2
            r1.A09 = r5
        L_0x0288:
            if (r18 != 0) goto L_0x02e6
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r2) goto L_0x02e6
        L_0x0290:
            int r2 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r2 = r2 + r0
            int r4 = r4 + r2
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r4, r0)
            r0 = r32
            int r0 = android.view.View.resolveSizeAndState(r2, r0, r9)
            r1.setMeasuredDimension(r0, r3)
            if (r17 == 0) goto L_0x0711
            int r2 = r1.getMeasuredWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r4 = 0
        L_0x02b8:
            if (r4 >= r6) goto L_0x0711
            android.view.View r8 = r1.getChildAt(r4)
            int r2 = r8.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x02e3
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            int r2 = r3.width
            r0 = -1
            if (r2 != r0) goto L_0x02e3
            int r2 = r3.height
            int r0 = r8.getMeasuredHeight()
            r3.height = r0
            r10 = 0
            r12 = 0
            r7 = r1
            r11 = r34
            r7.measureChildWithMargins(r8, r9, r10, r11, r12)
            r3.height = r2
        L_0x02e3:
            int r4 = r4 + 1
            goto L_0x02b8
        L_0x02e6:
            r4 = r8
            goto L_0x0290
        L_0x02e8:
            r10 = 0
            r1.A09 = r10
            int r5 = r1.getChildCount()
            int r9 = android.view.View.MeasureSpec.getMode(r32)
            int r29 = android.view.View.MeasureSpec.getMode(r34)
            int[] r8 = r1.A0D
            r0 = 4
            if (r8 == 0) goto L_0x0300
            int[] r7 = r1.A0E
            if (r7 != 0) goto L_0x0308
        L_0x0300:
            int[] r8 = new int[r0]
            r1.A0D = r8
            int[] r7 = new int[r0]
            r1.A0E = r7
        L_0x0308:
            r28 = 3
            r0 = -1
            r8[r28] = r0
            r27 = 2
            r8[r27] = r0
            r8[r11] = r0
            r8[r10] = r0
            r7[r28] = r0
            r7[r27] = r0
            r7[r11] = r0
            r7[r10] = r0
            boolean r0 = r1.A0B
            r26 = r0
            boolean r0 = r1.A0C
            r25 = r0
            r14 = 1073741824(0x40000000, float:2.0)
            r24 = 0
            if (r9 != r14) goto L_0x032d
            r24 = 1
        L_0x032d:
            r23 = 0
            r22 = 0
            r13 = 0
            r3 = 0
            r6 = 0
            r4 = 0
            r21 = 0
            r20 = 0
            r19 = 1
            r18 = 0
        L_0x033d:
            r2 = 8
            if (r13 >= r5) goto L_0x0467
            android.view.View r16 = r1.getChildAt(r13)
            if (r16 != 0) goto L_0x0350
            int r0 = r1.A09
            r1.A09 = r0
        L_0x034b:
            int r13 = r13 + 1
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x033d
        L_0x0350:
            int r0 = r16.getVisibility()
            if (r0 == r2) goto L_0x034b
            boolean r0 = r1.A05(r13)
            if (r0 == 0) goto L_0x0363
            int r2 = r1.A09
            int r0 = r1.A05
            int r2 = r2 + r0
            r1.A09 = r2
        L_0x0363:
            android.view.ViewGroup$LayoutParams r12 = r16.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            float r2 = r12.weight
            float r22 = r22 + r2
            if (r9 != r14) goto L_0x0419
            int r0 = r12.width
            if (r0 != 0) goto L_0x0419
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0419
            int r14 = r1.A09
            int r2 = r12.leftMargin
            if (r24 == 0) goto L_0x040f
            int r0 = r12.rightMargin
            int r2 = r2 + r0
            int r14 = r14 + r2
        L_0x0381:
            r1.A09 = r14
            if (r26 == 0) goto L_0x0408
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r0 = r16
            r0.measure(r2, r2)
        L_0x038f:
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0391:
            r0 = r29
            if (r0 == r2) goto L_0x0405
            int r2 = r12.height
            r0 = -1
            if (r2 != r0) goto L_0x0405
            r17 = 1
            r18 = 1
        L_0x039e:
            int r2 = r12.topMargin
            int r0 = r12.bottomMargin
            int r2 = r2 + r0
            int r14 = r16.getMeasuredHeight()
            int r14 = r14 + r2
            int r0 = r16.getMeasuredState()
            int r10 = android.view.View.combineMeasuredStates(r10, r0)
            if (r26 == 0) goto L_0x03da
            int r0 = r16.getBaseline()
            r15 = -1
            if (r0 == r15) goto L_0x03da
            int r15 = r12.gravity
            if (r15 >= 0) goto L_0x03bf
            int r15 = r1.A06
        L_0x03bf:
            r16 = r15 & 112(0x70, float:1.57E-43)
            r15 = 4
            int r16 = r16 >> r15
            r15 = r16 & -2
            int r16 = r15 >> 1
            r15 = r8[r16]
            int r15 = java.lang.Math.max(r15, r0)
            r8[r16] = r15
            r15 = r7[r16]
            int r0 = r14 - r0
            int r0 = java.lang.Math.max(r15, r0)
            r7[r16] = r0
        L_0x03da:
            int r6 = java.lang.Math.max(r6, r14)
            if (r19 == 0) goto L_0x03e7
            int r15 = r12.height
            r0 = -1
            r19 = 1
            if (r15 == r0) goto L_0x03e9
        L_0x03e7:
            r19 = 0
        L_0x03e9:
            float r0 = r12.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x03fd
            if (r17 != 0) goto L_0x03f2
            r2 = r14
        L_0x03f2:
            r0 = r21
            int r21 = java.lang.Math.max(r0, r2)
        L_0x03f8:
            r0 = 0
            int r0 = r0 + r13
            r13 = r0
            goto L_0x034b
        L_0x03fd:
            if (r17 != 0) goto L_0x0400
            r2 = r14
        L_0x0400:
            int r4 = java.lang.Math.max(r4, r2)
            goto L_0x03f8
        L_0x0405:
            r17 = 0
            goto L_0x039e
        L_0x0408:
            r26 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            r20 = 1
            goto L_0x0391
        L_0x040f:
            int r2 = r2 + r14
            int r0 = r12.rightMargin
            int r2 = r2 + r0
            int r14 = java.lang.Math.max(r14, r2)
            goto L_0x0381
        L_0x0419:
            int r0 = r12.width
            if (r0 != 0) goto L_0x0464
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0464
            r0 = -2
            r12.width = r0
            r14 = 0
        L_0x0425:
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x0462
            int r2 = r1.A09
        L_0x042b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r35 = 0
            r30 = r1
            r31 = r16
            r33 = r2
            r30.measureChildWithMargins(r31, r32, r33, r34, r35)
            if (r14 == r0) goto L_0x043c
            r12.width = r14
        L_0x043c:
            int r15 = r16.getMeasuredWidth()
            int r14 = r1.A09
            if (r24 == 0) goto L_0x0455
            int r2 = r12.leftMargin
            int r2 = r2 + r15
            int r0 = r12.rightMargin
            int r2 = r2 + r0
            int r14 = r14 + r2
        L_0x044b:
            r1.A09 = r14
            if (r25 == 0) goto L_0x038f
            int r3 = java.lang.Math.max(r15, r3)
            goto L_0x038f
        L_0x0455:
            int r2 = r14 + r15
            int r0 = r12.leftMargin
            int r2 = r2 + r0
            int r0 = r12.rightMargin
            int r2 = r2 + r0
            int r14 = java.lang.Math.max(r14, r2)
            goto L_0x044b
        L_0x0462:
            r2 = 0
            goto L_0x042b
        L_0x0464:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0425
        L_0x0467:
            int r0 = r1.A09
            if (r0 <= 0) goto L_0x0478
            boolean r0 = r1.A05(r5)
            if (r0 == 0) goto L_0x0478
            int r2 = r1.A09
            int r0 = r1.A05
            int r2 = r2 + r0
            r1.A09 = r2
        L_0x0478:
            r13 = r8[r11]
            r2 = -1
            if (r13 != r2) goto L_0x048a
            r0 = 0
            r0 = r8[r0]
            if (r0 != r2) goto L_0x048a
            r0 = r8[r27]
            if (r0 != r2) goto L_0x048a
            r0 = r8[r28]
            if (r0 == r2) goto L_0x04b7
        L_0x048a:
            r12 = r8[r28]
            r0 = 0
            r2 = r8[r0]
            r0 = r8[r27]
            int r0 = java.lang.Math.max(r13, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r12 = java.lang.Math.max(r12, r0)
            r13 = r7[r28]
            r0 = 0
            r14 = r7[r0]
            r2 = r7[r11]
            r0 = r7[r27]
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = java.lang.Math.max(r14, r0)
            int r0 = java.lang.Math.max(r13, r0)
            int r12 = r12 + r0
            int r6 = java.lang.Math.max(r6, r12)
        L_0x04b7:
            if (r25 == 0) goto L_0x04fa
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r0) goto L_0x04bf
            if (r9 != 0) goto L_0x04fa
        L_0x04bf:
            r13 = 0
            r1.A09 = r13
        L_0x04c2:
            if (r13 >= r5) goto L_0x04fa
            android.view.View r12 = r1.getChildAt(r13)
            if (r12 != 0) goto L_0x04d1
            int r0 = r1.A09
        L_0x04cc:
            r1.A09 = r0
        L_0x04ce:
            int r13 = r13 + 1
            goto L_0x04c2
        L_0x04d1:
            int r2 = r12.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x04ce
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            int r12 = r1.A09
            if (r24 == 0) goto L_0x04ed
            int r2 = r14.leftMargin
            int r2 = r2 + r3
            int r0 = r14.rightMargin
            int r2 = r2 + r0
            int r12 = r12 + r2
            r1.A09 = r12
            goto L_0x04ce
        L_0x04ed:
            int r2 = r12 + r3
            int r0 = r14.leftMargin
            int r2 = r2 + r0
            int r0 = r14.rightMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r12, r2)
            goto L_0x04cc
        L_0x04fa:
            int r12 = r1.A09
            int r2 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r2 = r2 + r0
            int r12 = r12 + r2
            r1.A09 = r12
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r12, r0)
            r12 = 0
            r0 = r32
            int r17 = android.view.View.resolveSizeAndState(r2, r0, r12)
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r17
            int r0 = r1.A09
            int r13 = r13 - r0
            if (r20 != 0) goto L_0x0527
            if (r13 == 0) goto L_0x061f
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x061f
        L_0x0527:
            float r2 = r1.A00
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x052f
            r22 = r2
        L_0x052f:
            r0 = -1
            r8[r28] = r0
            r8[r27] = r0
            r8[r11] = r0
            r8[r12] = r0
            r7[r28] = r0
            r7[r27] = r0
            r7[r11] = r0
            r7[r12] = r0
            r1.A09 = r12
            r6 = -1
        L_0x0543:
            if (r12 >= r5) goto L_0x065c
            android.view.View r16 = r1.getChildAt(r12)
            if (r16 == 0) goto L_0x0601
            int r2 = r16.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0601
            android.view.ViewGroup$LayoutParams r3 = r16.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            float r2 = r3.weight
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x059c
            float r0 = (float) r13
            float r0 = r0 * r2
            float r0 = r0 / r22
            int r14 = (int) r0
            float r22 = r22 - r2
            int r13 = r13 - r14
            int r2 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            int r2 = r2 + r0
            int r0 = r3.topMargin
            int r2 = r2 + r0
            int r0 = r3.bottomMargin
            int r2 = r2 + r0
            int r0 = r3.height
            r15 = r34
            int r15 = android.view.ViewGroup.getChildMeasureSpec(r15, r2, r0)
            int r0 = r3.width
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0615
            if (r9 != r2) goto L_0x0615
            if (r14 <= 0) goto L_0x061c
        L_0x0588:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r2)
            r0 = r16
            r0.measure(r14, r15)
            int r2 = r16.getMeasuredState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r0
            int r10 = android.view.View.combineMeasuredStates(r10, r2)
        L_0x059c:
            int r14 = r1.A09
            int r2 = r16.getMeasuredWidth()
            if (r24 == 0) goto L_0x0607
            int r0 = r3.leftMargin
            int r2 = r2 + r0
            int r0 = r3.rightMargin
            int r2 = r2 + r0
            int r14 = r14 + r2
            r1.A09 = r14
        L_0x05ad:
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            if (r0 == r2) goto L_0x05b9
            int r2 = r3.height
            r0 = -1
            r15 = 1
            if (r2 == r0) goto L_0x05ba
        L_0x05b9:
            r15 = 0
        L_0x05ba:
            int r2 = r3.topMargin
            int r0 = r3.bottomMargin
            int r2 = r2 + r0
            int r14 = r16.getMeasuredHeight()
            int r14 = r14 + r2
            int r6 = java.lang.Math.max(r6, r14)
            if (r15 != 0) goto L_0x05cb
            r2 = r14
        L_0x05cb:
            int r4 = java.lang.Math.max(r4, r2)
            if (r19 == 0) goto L_0x0605
            int r2 = r3.height
            r0 = -1
            r19 = 1
            if (r2 == r0) goto L_0x05da
        L_0x05d8:
            r19 = 0
        L_0x05da:
            if (r26 == 0) goto L_0x0601
            int r2 = r16.getBaseline()
            if (r2 == r0) goto L_0x0601
            int r0 = r3.gravity
            if (r0 >= 0) goto L_0x05e8
            int r0 = r1.A06
        L_0x05e8:
            r3 = r0 & 112(0x70, float:1.57E-43)
            r0 = 4
            int r3 = r3 >> r0
            r0 = r3 & -2
            int r3 = r0 >> 1
            r0 = r8[r3]
            int r0 = java.lang.Math.max(r0, r2)
            r8[r3] = r0
            r0 = r7[r3]
            int r14 = r14 - r2
            int r0 = java.lang.Math.max(r0, r14)
            r7[r3] = r0
        L_0x0601:
            int r12 = r12 + 1
            goto L_0x0543
        L_0x0605:
            r0 = -1
            goto L_0x05d8
        L_0x0607:
            int r2 = r2 + r14
            int r0 = r3.leftMargin
            int r2 = r2 + r0
            int r0 = r3.rightMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r14, r2)
            r1.A09 = r0
            goto L_0x05ad
        L_0x0615:
            int r0 = r16.getMeasuredWidth()
            int r14 = r14 + r0
            if (r14 >= 0) goto L_0x0588
        L_0x061c:
            r14 = 0
            goto L_0x0588
        L_0x061f:
            r0 = r21
            int r4 = java.lang.Math.max(r4, r0)
            if (r25 == 0) goto L_0x06a8
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 == r0) goto L_0x06a8
            r9 = 0
        L_0x062c:
            if (r9 >= r5) goto L_0x06a8
            android.view.View r8 = r1.getChildAt(r9)
            if (r8 == 0) goto L_0x0659
            int r2 = r8.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0659
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            float r0 = r0.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0659
            r7 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            int r0 = r8.getMeasuredHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            r8.measure(r2, r0)
        L_0x0659:
            int r9 = r9 + 1
            goto L_0x062c
        L_0x065c:
            int r3 = r1.A09
            int r2 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r2 = r2 + r0
            int r3 = r3 + r2
            r1.A09 = r3
            r12 = r8[r11]
            r2 = -1
            if (r12 != r2) goto L_0x067c
            r0 = 0
            r0 = r8[r0]
            if (r0 != r2) goto L_0x067c
            r0 = r8[r27]
            if (r0 != r2) goto L_0x067c
            r0 = r8[r28]
            if (r0 == r2) goto L_0x06a8
        L_0x067c:
            r9 = r8[r28]
            r3 = 0
            r2 = r8[r3]
            r0 = r8[r27]
            int r0 = java.lang.Math.max(r12, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r9 = java.lang.Math.max(r9, r0)
            r8 = r7[r28]
            r3 = r7[r3]
            r2 = r7[r11]
            r0 = r7[r27]
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Math.max(r8, r0)
            int r9 = r9 + r0
            int r6 = java.lang.Math.max(r6, r9)
        L_0x06a8:
            if (r19 != 0) goto L_0x070f
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            if (r0 == r2) goto L_0x070f
        L_0x06b0:
            int r2 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            int r2 = r2 + r0
            int r4 = r4 + r2
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r4, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r10
            r17 = r17 | r0
            int r2 = r10 << 16
            r0 = r34
            int r2 = android.view.View.resolveSizeAndState(r3, r0, r2)
            r0 = r17
            r1.setMeasuredDimension(r0, r2)
            if (r18 == 0) goto L_0x0711
            int r2 = r1.getMeasuredHeight()
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r4 = 0
        L_0x06e1:
            if (r4 >= r5) goto L_0x0711
            android.view.View r7 = r1.getChildAt(r4)
            int r2 = r7.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x070c
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            int r2 = r3.height
            r0 = -1
            if (r2 != r0) goto L_0x070c
            int r2 = r3.width
            int r0 = r7.getMeasuredWidth()
            r3.width = r0
            r9 = 0
            r11 = 0
            r6 = r1
            r8 = r32
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            r3.width = r2
        L_0x070c:
            int r4 = r4 + 1
            goto L_0x06e1
        L_0x070f:
            r4 = r6
            goto L_0x06b0
        L_0x0711:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.A0B = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder sb = new StringBuilder("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.A01 = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.A0A) {
            this.A0A = drawable;
            boolean z2 = false;
            if (drawable != null) {
                this.A05 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A05 = 0;
                this.A03 = 0;
                z2 = true;
            }
            setWillNotDraw(z2);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.A04 = i2;
    }

    public void setGravity(int i2) {
        if (this.A06 != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= GravityCompat.START;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.A06 = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i4 = this.A06;
        if ((8388615 & i4) != i3) {
            this.A06 = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.A0C = z2;
    }

    public void setOrientation(int i2) {
        if (this.A07 != i2) {
            this.A07 = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.A08) {
            requestLayout();
        }
        this.A08 = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.A06;
        if ((i4 & 112) != i3) {
            this.A06 = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.A00 = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
