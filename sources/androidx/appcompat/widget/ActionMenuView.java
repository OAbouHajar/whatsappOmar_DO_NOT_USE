package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass06H;
import X.AnonymousClass08B;
import X.AnonymousClass0CO;
import X.AnonymousClass0D0;
import X.AnonymousClass0D3;
import X.AnonymousClass0DA;
import X.AnonymousClass0ZK;
import X.AnonymousClass0ZM;
import X.AnonymousClass0ZV;
import X.C004601z;
import X.C016607w;
import X.C07290av;
import X.C12240k4;
import X.C12250k5;
import X.C12940lD;
import X.C12960lF;
import X.C13350lt;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends LinearLayoutCompat implements C12240k4, C12250k5 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Context A04;
    public AnonymousClass06H A05;
    public C016607w A06;
    public C12940lD A07;
    public AnonymousClass0ZV A08;
    public AnonymousClass08B A09;
    public boolean A0A;
    public boolean A0B;

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = false;
        float f2 = AnonymousClass000.A0M(context).density;
        this.A02 = (int) (56.0f * f2);
        this.A01 = (int) (f2 * 4.0f);
        this.A04 = context;
        this.A03 = 0;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0CO A00() {
        AnonymousClass0DA r1 = new AnonymousClass0DA();
        r1.gravity = 16;
        return r1;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0CO A01(AttributeSet attributeSet) {
        return new AnonymousClass0DA(getContext(), attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1.gravity <= 0) goto L_0x0011;
     */
    /* renamed from: A06 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0DA generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x001c
            boolean r0 = r3 instanceof X.AnonymousClass0DA
            if (r0 == 0) goto L_0x0016
            X.0DA r3 = (X.AnonymousClass0DA) r3
            X.0DA r1 = new X.0DA
            r1.<init>((X.AnonymousClass0DA) r3)
        L_0x000d:
            int r0 = r1.gravity
            if (r0 > 0) goto L_0x0015
        L_0x0011:
            r0 = 16
            r1.gravity = r0
        L_0x0015:
            return r1
        L_0x0016:
            X.0DA r1 = new X.0DA
            r1.<init>((android.view.ViewGroup.LayoutParams) r3)
            goto L_0x000d
        L_0x001c:
            X.0DA r1 = new X.0DA
            r1.<init>()
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams):X.0DA");
    }

    public boolean A07(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof C12960lF)) {
            z2 = false | ((C12960lF) childAt).ALg();
        }
        return (i2 <= 0 || !(childAt2 instanceof C12960lF)) ? z2 : z2 | ((C12960lF) childAt2).ALh();
    }

    public void AIH(C016607w r1) {
        this.A06 = r1;
    }

    public boolean AIa(C07290av r4) {
        return this.A06.A0L(r4, (C13350lt) null, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass0DA;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AnonymousClass0DA r1 = new AnonymousClass0DA();
        r1.gravity = 16;
        return r1;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass0DA(getContext(), attributeSet);
    }

    public Menu getMenu() {
        C016607w r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        Context context = getContext();
        C016607w r1 = new C016607w(context);
        this.A06 = r1;
        r1.A0D(new AnonymousClass0ZK(this));
        AnonymousClass0ZV r2 = new AnonymousClass0ZV(context);
        this.A08 = r2;
        r2.A0I = true;
        r2.A0J = true;
        C12940lD r02 = this.A07;
        if (r02 == null) {
            r02 = new AnonymousClass0ZM();
        }
        r2.A09 = r02;
        this.A06.A09(this.A04, r2);
        AnonymousClass0ZV r03 = this.A08;
        r03.A0A = this;
        C016607w r04 = r03.A08;
        this.A06 = r04;
        return r04;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        AnonymousClass0ZV r1 = this.A08;
        AnonymousClass0D3 r0 = r1.A0E;
        if (r0 != null) {
            return r0.getDrawable();
        }
        if (r1.A0H) {
            return r1.A05;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.A03;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass0ZV r1 = this.A08;
        if (r1 != null) {
            r1.AhS(false);
            if (this.A08.A02()) {
                this.A08.A01();
                this.A08.A03();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass0ZV r0 = this.A08;
        if (r0 != null) {
            r0.A01();
            AnonymousClass0D0 r02 = r0.A0B;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.A0A) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) >> 1;
        int i8 = this.A05;
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = true;
        if (C004601z.A06(this) != 1) {
            z3 = false;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                AnonymousClass0DA r11 = (AnonymousClass0DA) childAt.getLayoutParams();
                if (r11.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A07(i12)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i6 = getPaddingLeft() + r11.leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - r11.rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i13 = i7 - (measuredHeight >> 1);
                    childAt.layout(i6, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + r11.leftMargin) + r11.rightMargin;
                    A07(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 >> 1) - (measuredWidth2 >> 1);
            int i15 = i7 - (measuredHeight2 >> 1);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                AnonymousClass0DA r4 = (AnonymousClass0DA) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !r4.A04) {
                    int i18 = width2 - r4.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 >> 1);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + r4.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            AnonymousClass0DA r42 = (AnonymousClass0DA) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !r42.A04) {
                int i21 = paddingLeft + r42.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i7 - (measuredHeight4 >> 1);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + r42.rightMargin + max;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01eb, code lost:
        if (r9 != 1) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bf, code lost:
        if ((!android.text.TextUtils.isEmpty(((X.AnonymousClass02Z) r12).getText())) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        if ((!android.text.TextUtils.isEmpty(r0.getText())) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016c, code lost:
        if (r9 != 2) goto L_0x016e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
            r31 = this;
            r4 = r31
            boolean r1 = r4.A0A
            r5 = r32
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            r8 = 1
            r10 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            boolean r0 = X.AnonymousClass000.A1R(r0, r6)
            r4.A0A = r0
            if (r1 == r0) goto L_0x0018
            r4.A00 = r10
        L_0x0018:
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x002d
            X.07w r1 = r4.A06
            if (r1 == 0) goto L_0x002d
            int r0 = r4.A00
            if (r2 == r0) goto L_0x002d
            r4.A00 = r2
            r1.A0F(r8)
        L_0x002d:
            int r2 = r4.getChildCount()
            boolean r0 = r4.A0A
            r3 = r33
            if (r0 == 0) goto L_0x02c0
            if (r2 <= 0) goto L_0x02d4
            int r30 = android.view.View.MeasureSpec.getMode(r3)
            int r29 = android.view.View.MeasureSpec.getSize(r5)
            int r28 = android.view.View.MeasureSpec.getSize(r3)
            int r2 = r4.getPaddingLeft()
            int r0 = r4.getPaddingRight()
            int r2 = r2 + r0
            int r22 = r4.getPaddingTop()
            int r0 = r4.getPaddingBottom()
            int r22 = r22 + r0
            r1 = -2
            r0 = r22
            int r27 = android.view.ViewGroup.getChildMeasureSpec(r3, r0, r1)
            int r29 = r29 - r2
            int r7 = r4.A02
            int r5 = r29 / r7
            int r0 = r29 % r7
            if (r5 != 0) goto L_0x006f
            r0 = r29
            r4.setMeasuredDimension(r0, r10)
            return
        L_0x006f:
            int r0 = r0 / r5
            int r7 = r7 + r0
            int r3 = r4.getChildCount()
            r26 = 0
            r11 = 0
            r25 = 0
            r9 = 0
            r2 = 0
            r19 = 0
            r20 = 0
        L_0x0080:
            if (r11 >= r3) goto L_0x0167
            android.view.View r12 = r4.getChildAt(r11)
            int r1 = r12.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x015b
            boolean r1 = r12 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r9 = r9 + 1
            if (r1 == 0) goto L_0x0099
            int r0 = r4.A01
            r12.setPadding(r0, r10, r0, r10)
        L_0x0099:
            android.view.ViewGroup$LayoutParams r18 = r12.getLayoutParams()
            r0 = r18
            X.0DA r0 = (X.AnonymousClass0DA) r0
            r18 = r0
            r0.A03 = r10
            r0.A01 = r10
            r0.A00 = r10
            r0.A02 = r10
            r0.leftMargin = r10
            r0.rightMargin = r10
            if (r1 == 0) goto L_0x00c1
            r0 = r12
            X.02Z r0 = (X.AnonymousClass02Z) r0
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r1 = 1
            if (r0 != 0) goto L_0x00c2
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            r0 = r18
            r0.A05 = r1
            boolean r0 = r0.A04
            r15 = r5
            if (r0 == 0) goto L_0x00cc
            r15 = 1
        L_0x00cc:
            android.view.ViewGroup$LayoutParams r17 = r12.getLayoutParams()
            r0 = r17
            X.0DA r0 = (X.AnonymousClass0DA) r0
            r17 = r0
            int r1 = android.view.View.MeasureSpec.getSize(r27)
            int r1 = r1 - r22
            int r0 = android.view.View.MeasureSpec.getMode(r27)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            boolean r0 = r12 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x0165
            r0 = r12
            X.02Z r0 = (X.AnonymousClass02Z) r0
        L_0x00eb:
            r14 = 1
            if (r0 == 0) goto L_0x00fc
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r16 = 1
            if (r0 != 0) goto L_0x00fe
        L_0x00fc:
            r16 = 0
        L_0x00fe:
            r1 = 2
            if (r15 <= 0) goto L_0x0163
            if (r16 == 0) goto L_0x0105
            if (r15 < r1) goto L_0x0163
        L_0x0105:
            int r15 = r15 * r7
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            r12.measure(r0, r13)
            int r15 = r12.getMeasuredWidth()
            int r0 = r15 / r7
            int r15 = r15 % r7
            if (r15 == 0) goto L_0x011a
            int r0 = r0 + 1
        L_0x011a:
            if (r16 == 0) goto L_0x0161
            if (r0 >= r1) goto L_0x0161
        L_0x011e:
            r0 = r17
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x015f
            if (r16 == 0) goto L_0x015f
        L_0x0126:
            r0 = r17
            r0.A02 = r14
            r0.A00 = r1
            int r0 = r7 * r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r12.measure(r0, r13)
            int r2 = java.lang.Math.max(r2, r1)
            r0 = r18
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0141
            int r19 = r19 + 1
        L_0x0141:
            r0 = r18
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0149
            r25 = 1
        L_0x0149:
            int r5 = r5 - r1
            int r12 = r12.getMeasuredHeight()
            r0 = r26
            int r26 = java.lang.Math.max(r0, r12)
            if (r1 != r8) goto L_0x015b
            int r0 = r8 << r11
            long r0 = (long) r0
            long r20 = r20 | r0
        L_0x015b:
            int r11 = r11 + 1
            goto L_0x0080
        L_0x015f:
            r14 = 0
            goto L_0x0126
        L_0x0161:
            r1 = r0
            goto L_0x011e
        L_0x0163:
            r1 = 0
            goto L_0x011e
        L_0x0165:
            r0 = 0
            goto L_0x00eb
        L_0x0167:
            r0 = 2
            if (r25 == 0) goto L_0x016e
            r24 = 1
            if (r9 == r0) goto L_0x0170
        L_0x016e:
            r24 = 0
        L_0x0170:
            r17 = 0
            if (r19 <= 0) goto L_0x01e8
        L_0x0174:
            if (r5 <= 0) goto L_0x01e8
            r12 = 0
            r11 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r22 = 0
        L_0x017d:
            if (r11 >= r3) goto L_0x01a2
            android.view.View r0 = r4.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r13 = r0.getLayoutParams()
            X.0DA r13 = (X.AnonymousClass0DA) r13
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x0197
            int r0 = r13.A00
            r13 = 1
            if (r0 >= r1) goto L_0x019a
            long r22 = r13 << r11
            r1 = r0
            r12 = 1
        L_0x0197:
            int r11 = r11 + 1
            goto L_0x017d
        L_0x019a:
            if (r0 != r1) goto L_0x0197
            long r13 = r13 << r11
            long r22 = r22 | r13
            int r12 = r12 + 1
            goto L_0x0197
        L_0x01a2:
            long r20 = r20 | r22
            if (r12 > r5) goto L_0x01e8
            int r13 = r1 + 1
            r12 = 0
        L_0x01a9:
            if (r12 >= r3) goto L_0x01e5
            android.view.View r14 = r4.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r11 = r14.getLayoutParams()
            X.0DA r11 = (X.AnonymousClass0DA) r11
            int r0 = r8 << r12
            long r0 = (long) r0
            long r18 = r22 & r0
            r16 = 0
            int r15 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r15 != 0) goto L_0x01c9
            int r11 = r11.A00
            if (r11 != r13) goto L_0x01c6
            long r20 = r20 | r0
        L_0x01c6:
            int r12 = r12 + 1
            goto L_0x01a9
        L_0x01c9:
            if (r24 == 0) goto L_0x01da
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x01da
            if (r5 != r8) goto L_0x01da
            int r1 = r4.A01
            int r0 = r1 + r7
            r24 = 1
            r14.setPadding(r0, r10, r1, r10)
        L_0x01da:
            int r0 = r11.A00
            int r0 = r0 + 1
            r11.A00 = r0
            r11.A03 = r8
            int r5 = r5 + -1
            goto L_0x01c6
        L_0x01e5:
            r17 = 1
            goto L_0x0174
        L_0x01e8:
            if (r25 != 0) goto L_0x01ed
            r1 = 1
            if (r9 == r8) goto L_0x01ee
        L_0x01ed:
            r1 = 0
        L_0x01ee:
            if (r5 <= 0) goto L_0x028d
            r15 = 0
            int r0 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x028d
            int r9 = r9 - r8
            if (r5 < r9) goto L_0x01fd
            if (r1 != 0) goto L_0x01fd
            if (r2 <= r8) goto L_0x028d
        L_0x01fd:
            int r0 = java.lang.Long.bitCount(r20)
            float r2 = (float) r0
            if (r1 != 0) goto L_0x0237
            r0 = 1
            long r11 = r20 & r0
            r14 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x021d
            android.view.View r0 = r4.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0DA r0 = (X.AnonymousClass0DA) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x021d
            float r2 = r2 - r14
        L_0x021d:
            int r13 = r3 + -1
            int r0 = r8 << r13
            long r0 = (long) r0
            long r11 = r20 & r0
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0237
            android.view.View r0 = r4.getChildAt(r13)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0DA r0 = (X.AnonymousClass0DA) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0237
            float r2 = r2 - r14
        L_0x0237:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x028b
            int r5 = r5 * r7
            float r0 = (float) r5
            float r0 = r0 / r2
            int r5 = (int) r0
        L_0x0240:
            r2 = 0
        L_0x0241:
            if (r2 >= r3) goto L_0x028d
            int r0 = r8 << r2
            long r0 = (long) r0
            long r11 = r20 & r0
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x026b
            android.view.View r0 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            X.0DA r9 = (X.AnonymousClass0DA) r9
            boolean r0 = r0 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x026e
            r9.A01 = r5
            r9.A03 = r8
            if (r2 != 0) goto L_0x0269
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x0269
            int r1 = -r5
            r0 = 2
            int r1 = r1 / r0
            r9.leftMargin = r1
        L_0x0269:
            r17 = 1
        L_0x026b:
            int r2 = r2 + 1
            goto L_0x0241
        L_0x026e:
            r1 = 2
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x027c
            r9.A01 = r5
            r9.A03 = r8
            int r0 = -r5
            int r0 = r0 / r1
            r9.rightMargin = r0
            goto L_0x0269
        L_0x027c:
            if (r2 == 0) goto L_0x0282
            int r0 = r5 >> 1
            r9.leftMargin = r0
        L_0x0282:
            int r0 = r3 + -1
            if (r2 == r0) goto L_0x026b
            int r0 = r5 >> 1
            r9.rightMargin = r0
            goto L_0x026b
        L_0x028b:
            r5 = 0
            goto L_0x0240
        L_0x028d:
            if (r17 == 0) goto L_0x02b2
            r8 = 0
        L_0x0290:
            if (r8 >= r3) goto L_0x02b2
            android.view.View r5 = r4.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            X.0DA r2 = (X.AnonymousClass0DA) r2
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x02af
            int r1 = r2.A00
            int r1 = r1 * r7
            int r0 = r2.A01
            int r1 = r1 + r0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r0 = r27
            r5.measure(r1, r0)
        L_0x02af:
            int r8 = r8 + 1
            goto L_0x0290
        L_0x02b2:
            r0 = r30
            if (r0 != r6) goto L_0x02b8
            r26 = r28
        L_0x02b8:
            r1 = r29
            r0 = r26
            r4.setMeasuredDimension(r1, r0)
            return
        L_0x02c0:
            r1 = 0
        L_0x02c1:
            if (r1 >= r2) goto L_0x02d4
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r0.rightMargin = r10
            r0.leftMargin = r10
            int r1 = r1 + 1
            goto L_0x02c1
        L_0x02d4:
            super.onMeasure(r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.A08.A0G = z2;
    }

    public void setMenuCallbacks(C12940lD r1, AnonymousClass06H r2) {
        this.A07 = r1;
        this.A05 = r2;
    }

    public void setOnMenuItemClickListener(AnonymousClass08B r1) {
        this.A09 = r1;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        AnonymousClass0ZV r1 = this.A08;
        AnonymousClass0D3 r0 = r1.A0E;
        if (r0 != null) {
            r0.setImageDrawable(drawable);
            return;
        }
        r1.A0H = true;
        r1.A05 = drawable;
    }

    public void setOverflowReserved(boolean z2) {
        this.A0B = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.A03 != i2) {
            this.A03 = i2;
            this.A04 = i2 == 0 ? getContext() : new ContextThemeWrapper(getContext(), i2);
        }
    }

    public void setPresenter(AnonymousClass0ZV r2) {
        this.A08 = r2;
        r2.A0A = this;
        this.A06 = r2.A08;
    }
}
