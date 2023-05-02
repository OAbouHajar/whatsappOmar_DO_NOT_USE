package androidx.appcompat.widget;

import X.AnonymousClass02Z;
import X.AnonymousClass05K;
import X.AnonymousClass06H;
import X.AnonymousClass06L;
import X.AnonymousClass06z;
import X.AnonymousClass08B;
import X.AnonymousClass08D;
import X.AnonymousClass09E;
import X.AnonymousClass09F;
import X.AnonymousClass09G;
import X.AnonymousClass09K;
import X.AnonymousClass0ZS;
import X.AnonymousClass0ZV;
import X.C004601z;
import X.C006002o;
import X.C016607w;
import X.C02350Bg;
import X.C02690El;
import X.C05580Sd;
import X.C12940lD;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape131S0100000_I0;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class Toolbar extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Context A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public Drawable A0F;
    public View A0G;
    public ImageButton A0H;
    public ImageButton A0I;
    public ImageView A0J;
    public TextView A0K;
    public AnonymousClass06H A0L;
    public C12940lD A0M;
    public AnonymousClass0ZV A0N;
    public ActionMenuView A0O;
    public AnonymousClass08D A0P;
    public AnonymousClass0ZS A0Q;
    public AnonymousClass09E A0R;
    public AnonymousClass09F A0S;
    public CharSequence A0T;
    public CharSequence A0U;
    public CharSequence A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final AnonymousClass08B A0Z;
    public final Runnable A0a;
    public final ArrayList A0b;
    public final ArrayList A0c;
    public final int[] A0d;
    public TextView mTitleTextView;

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr0543);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Toolbar(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r10 = r13
            r7 = r14
            r9 = r15
            r12 = r16
            r13.<init>(r14, r15, r12)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r13.A03 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0b = r0
            r0 = 2
            int[] r0 = new int[r0]
            r13.A0d = r0
            X.08A r0 = new X.08A
            r0.<init>(r13)
            r13.A0Z = r0
            X.08C r0 = new X.08C
            r0.<init>(r13)
            r13.A0a = r0
            android.content.Context r0 = r13.getContext()
            int[] r11 = X.AnonymousClass05L.A0N
            r2 = 0
            X.07T r3 = X.AnonymousClass07T.A00(r0, r15, r11, r12, r2)
            android.content.res.TypedArray r8 = r3.A02
            X.C004601z.A0N(r7, r8, r9, r10, r11, r12)
            r0 = 28
            int r0 = r8.getResourceId(r0, r2)
            r13.A0B = r0
            r0 = 19
            int r0 = r8.getResourceId(r0, r2)
            r13.A06 = r0
            int r0 = r13.A03
            int r0 = r8.getInteger(r2, r0)
            r13.A03 = r0
            r1 = 2
            r0 = 48
            int r0 = r8.getInteger(r1, r0)
            r13.A00 = r0
            r0 = 22
            int r1 = r8.getDimensionPixelOffset(r0, r2)
            r0 = 27
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x0073
            r0 = 27
            int r1 = r8.getDimensionPixelOffset(r0, r1)
        L_0x0073:
            r13.A07 = r1
            r13.A0A = r1
            r13.A08 = r1
            r13.A09 = r1
            r0 = 25
            r1 = -1
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x0086
            r13.A09 = r0
        L_0x0086:
            r0 = 24
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x0090
            r13.A08 = r0
        L_0x0090:
            r0 = 26
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x009a
            r13.A0A = r0
        L_0x009a:
            r0 = 23
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00a4
            r13.A07 = r0
        L_0x00a4:
            r0 = 13
            int r0 = r8.getDimensionPixelSize(r0, r1)
            r13.A04 = r0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 9
            int r6 = r8.getDimensionPixelOffset(r0, r7)
            r0 = 5
            int r5 = r8.getDimensionPixelOffset(r0, r7)
            r0 = 7
            int r4 = r8.getDimensionPixelSize(r0, r2)
            r0 = 8
            int r1 = r8.getDimensionPixelSize(r0, r2)
            X.08D r0 = r13.A0P
            if (r0 != 0) goto L_0x00cf
            X.08D r0 = new X.08D
            r0.<init>()
            r13.A0P = r0
        L_0x00cf:
            r0.A06 = r2
            if (r4 == r7) goto L_0x00d7
            r0.A01 = r4
            r0.A03 = r4
        L_0x00d7:
            if (r1 == r7) goto L_0x00dd
            r0.A02 = r1
            r0.A04 = r1
        L_0x00dd:
            if (r6 != r7) goto L_0x00e1
            if (r5 == r7) goto L_0x00e4
        L_0x00e1:
            r0.A00(r6, r5)
        L_0x00e4:
            r0 = 10
            int r0 = r8.getDimensionPixelOffset(r0, r7)
            r13.A02 = r0
            r0 = 6
            int r0 = r8.getDimensionPixelOffset(r0, r7)
            r13.A01 = r0
            r0 = 4
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            r13.A0F = r0
            r0 = 3
            java.lang.CharSequence r0 = r8.getText(r0)
            r13.A0T = r0
            r0 = 21
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0110
            r13.setTitle((java.lang.CharSequence) r1)
        L_0x0110:
            r0 = 18
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011f
            r13.setSubtitle((java.lang.CharSequence) r1)
        L_0x011f:
            android.content.Context r0 = r13.getContext()
            r13.A0C = r0
            r0 = 17
            int r0 = r8.getResourceId(r0, r2)
            r13.setPopupTheme(r0)
            r0 = 16
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x0139
            r13.setNavigationIcon((android.graphics.drawable.Drawable) r0)
        L_0x0139:
            r0 = 15
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0148
            r13.setNavigationContentDescription((java.lang.CharSequence) r1)
        L_0x0148:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x0153
            r13.setLogo((android.graphics.drawable.Drawable) r0)
        L_0x0153:
            r0 = 12
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0162
            r13.setLogoDescription((java.lang.CharSequence) r1)
        L_0x0162:
            r1 = 29
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x0171
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r13.setTitleTextColor((android.content.res.ColorStateList) r0)
        L_0x0171:
            r1 = 20
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x0180
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r13.setSubtitleTextColor((android.content.res.ColorStateList) r0)
        L_0x0180:
            r0 = 14
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x0199
            r0 = 14
            int r2 = r8.getResourceId(r0, r2)
            android.view.MenuInflater r1 = r13.getMenuInflater()
            android.view.Menu r0 = r13.getMenu()
            r1.inflate(r2, r0)
        L_0x0199:
            r3.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static final int A00(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static AnonymousClass09K A01(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass09K ? new AnonymousClass09K((AnonymousClass09K) layoutParams) : layoutParams instanceof AnonymousClass05K ? new AnonymousClass09K((AnonymousClass05K) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new AnonymousClass09K((ViewGroup.MarginLayoutParams) layoutParams) : new AnonymousClass09K(layoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new C02350Bg(getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r1 != 80) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r5 = r9.getLayoutParams()
            X.05K r5 = (X.AnonymousClass05K) r5
            int r7 = r9.getMeasuredHeight()
            r6 = 0
            r3 = 0
            if (r10 <= 0) goto L_0x0012
            int r0 = r7 - r10
            int r3 = r0 >> 1
        L_0x0012:
            int r0 = r5.A00
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L_0x002c
            r0 = 48
            if (r1 == r0) goto L_0x0063
            r2 = 80
            if (r1 == r2) goto L_0x0054
            int r0 = r8.A03
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L_0x0063
            if (r1 == r2) goto L_0x0054
        L_0x002c:
            int r4 = r8.getPaddingTop()
            int r3 = r8.getPaddingBottom()
            int r2 = r8.getHeight()
            int r0 = r2 - r4
            int r0 = r0 - r3
            int r0 = r0 - r7
            int r1 = r0 >> 1
            int r0 = r5.topMargin
            if (r1 >= r0) goto L_0x0045
            r1 = r0
        L_0x0043:
            int r4 = r4 + r1
            return r4
        L_0x0045:
            int r2 = r2 - r3
            int r2 = r2 - r7
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r0 = r5.bottomMargin
            if (r2 >= r0) goto L_0x0043
            int r0 = r0 - r2
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r6, r1)
            goto L_0x0043
        L_0x0054:
            int r1 = r8.getHeight()
            int r0 = r8.getPaddingBottom()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            int r1 = r1 - r3
            return r1
        L_0x0063:
            int r0 = r8.getPaddingTop()
            int r0 = r0 - r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A02(android.view.View, int):int");
    }

    public final int A03(View view, int[] iArr, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = marginLayoutParams.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int A022 = A02(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A022, max + measuredWidth, view.getMeasuredHeight() + A022);
        return max + measuredWidth + marginLayoutParams.rightMargin;
    }

    public final int A04(View view, int[] iArr, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i4 = marginLayoutParams.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int A022 = A02(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A022, max, view.getMeasuredHeight() + A022);
        return max - (measuredWidth + marginLayoutParams.leftMargin);
    }

    public final int A05(View view, int[] iArr, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void A06() {
        if (this.A0H == null) {
            AnonymousClass06z r1 = new AnonymousClass06z(getContext(), (AttributeSet) null, R.attr.attr0542);
            this.A0H = r1;
            r1.setImageDrawable(this.A0F);
            this.A0H.setContentDescription(this.A0T);
            AnonymousClass09K r2 = new AnonymousClass09K(-2);
            r2.A00 = 8388611 | (this.A00 & 112);
            r2.A00 = 2;
            this.A0H.setLayoutParams(r2);
            this.A0H.setOnClickListener(new IDxCListenerShape131S0100000_I0(this, 1));
        }
    }

    public void A07() {
        AnonymousClass08D r1 = this.A0P;
        if (r1 == null) {
            r1 = new AnonymousClass08D();
            this.A0P = r1;
        }
        r1.A06 = false;
        r1.A01 = 0;
        r1.A03 = 0;
        r1.A02 = 0;
        r1.A04 = 0;
    }

    public final void A08() {
        A09();
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView.A06 == null) {
            C016607w r3 = (C016607w) actionMenuView.getMenu();
            AnonymousClass0ZS r2 = this.A0Q;
            if (r2 == null) {
                r2 = new AnonymousClass0ZS(this);
                this.A0Q = r2;
            }
            this.A0O.setExpandedActionViewsExclusive(true);
            r3.A09(this.A0C, r2);
        }
    }

    public final void A09() {
        if (this.A0O == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.A0O = actionMenuView;
            actionMenuView.setPopupTheme(this.A05);
            ActionMenuView actionMenuView2 = this.A0O;
            actionMenuView2.A09 = this.A0Z;
            actionMenuView2.setMenuCallbacks(this.A0M, this.A0L);
            AnonymousClass09K r2 = new AnonymousClass09K(-2);
            r2.A00 = 8388613 | (this.A00 & 112);
            this.A0O.setLayoutParams(r2);
            A0E(this.A0O, false);
        }
    }

    public final void A0A() {
        if (this.A0I == null) {
            this.A0I = new AnonymousClass06z(getContext(), (AttributeSet) null, R.attr.attr0542);
            AnonymousClass09K r2 = new AnonymousClass09K(-2);
            r2.A00 = 8388611 | (this.A00 & 112);
            this.A0I.setLayoutParams(r2);
        }
    }

    public void A0B(int i2, int i3) {
        AnonymousClass08D r0 = this.A0P;
        if (r0 == null) {
            r0 = new AnonymousClass08D();
            this.A0P = r0;
        }
        r0.A00(i2, i3);
    }

    public void A0C(Context context, int i2) {
        this.A0B = i2;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public final void A0D(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void A0E(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AnonymousClass09K r1 = layoutParams == null ? new AnonymousClass09K(-2) : !checkLayoutParams(layoutParams) ? A01(layoutParams) : (AnonymousClass09K) layoutParams;
        r1.A00 = 1;
        if (!z2 || this.A0G == null) {
            addView(view, r1);
            return;
        }
        view.setLayoutParams(r1);
        this.A0b.add(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(java.util.List r10, int r11) {
        /*
            r9 = this;
            int r0 = X.C004601z.A06(r9)
            r7 = 0
            r6 = 1
            r1 = 0
            if (r0 != r6) goto L_0x000a
            r1 = 1
        L_0x000a:
            int r5 = r9.getChildCount()
            int r0 = X.C004601z.A06(r9)
            int r8 = X.C05570Sc.A00(r11, r0)
            r10.clear()
            if (r1 == 0) goto L_0x0053
            int r5 = r5 - r6
        L_0x001c:
            if (r5 < 0) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.09K r1 = (X.AnonymousClass09K) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004e
            boolean r0 = r9.A0H(r4)
            if (r0 == 0) goto L_0x004e
            int r0 = r1.A00
            int r3 = X.C004601z.A06(r9)
            int r0 = X.C05570Sc.A00(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0051
            r1 = 3
            if (r2 == r1) goto L_0x0051
            r0 = 5
            if (r2 == r0) goto L_0x0051
            if (r3 != r6) goto L_0x0049
            r1 = 5
        L_0x0049:
            if (r1 != r8) goto L_0x004e
            r10.add(r4)
        L_0x004e:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0051:
            r1 = r2
            goto L_0x0049
        L_0x0053:
            if (r7 >= r5) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.09K r1 = (X.AnonymousClass09K) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0085
            boolean r0 = r9.A0H(r4)
            if (r0 == 0) goto L_0x0085
            int r0 = r1.A00
            int r3 = X.C004601z.A06(r9)
            int r0 = X.C05570Sc.A00(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0088
            r1 = 3
            if (r2 == r1) goto L_0x0088
            r0 = 5
            if (r2 == r0) goto L_0x0088
            if (r3 != r6) goto L_0x0080
            r1 = 5
        L_0x0080:
            if (r1 != r8) goto L_0x0085
            r10.add(r4)
        L_0x0085:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x0088:
            r1 = r2
            goto L_0x0080
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0F(java.util.List, int):void");
    }

    public final boolean A0G(View view) {
        return view.getParent() == this || this.A0b.contains(view);
    }

    public final boolean A0H(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof AnonymousClass09K);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass09K(-2);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass09K(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A01(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        AnonymousClass08D r1 = this.A0P;
        if (r1 != null) {
            return r1.A07 ? r1.A03 : r1.A04;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.A01;
        return i2 == Integer.MIN_VALUE ? getContentInsetEnd() : i2;
    }

    public int getContentInsetLeft() {
        AnonymousClass08D r0 = this.A0P;
        if (r0 != null) {
            return r0.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        AnonymousClass08D r0 = this.A0P;
        if (r0 != null) {
            return r0.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        AnonymousClass08D r1 = this.A0P;
        if (r1 != null) {
            return r1.A07 ? r1.A04 : r1.A03;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.A02;
        return i2 == Integer.MIN_VALUE ? getContentInsetStart() : i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.A0O
            r2 = 0
            if (r0 == 0) goto L_0x001e
            X.07w r0 = r0.A06
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x001e
            int r1 = r3.getContentInsetEnd()
            int r0 = r3.A01
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x001e:
            int r0 = r3.getContentInsetEnd()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C004601z.A06(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C004601z.A06(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        Drawable navigationIcon = getNavigationIcon();
        int contentInsetStart = getContentInsetStart();
        return navigationIcon != null ? Math.max(contentInsetStart, Math.max(this.A02, 0)) : contentInsetStart;
    }

    public Drawable getLogo() {
        ImageView imageView = this.A0J;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A0J;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        A08();
        return this.A0O.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public AnonymousClass0ZV getOuterActionMenuPresenter() {
        return this.A0N;
    }

    public Drawable getOverflowIcon() {
        A08();
        return this.A0O.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.A0C;
    }

    public int getPopupTheme() {
        return this.A05;
    }

    public CharSequence getSubtitle() {
        return this.A0U;
    }

    public final TextView getSubtitleTextView() {
        return this.A0K;
    }

    public CharSequence getTitle() {
        return this.A0V;
    }

    public int getTitleMarginBottom() {
        return this.A07;
    }

    public int getTitleMarginEnd() {
        return this.A08;
    }

    public int getTitleMarginStart() {
        return this.A09;
    }

    public int getTitleMarginTop() {
        return this.A0A;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public AnonymousClass09G getWrapper() {
        AnonymousClass09F r1 = this.A0S;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass09F r12 = new AnonymousClass09F(this, true);
        this.A0S = r12;
        return r12;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A0a);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0X = false;
        }
        if (!this.A0X) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0X = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0X = false;
            return true;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x028a A[LOOP:1: B:102:0x0288->B:103:0x028a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a7 A[LOOP:2: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f0 A[LOOP:3: B:113:0x02ee->B:114:0x02f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a2 A[LOOP:0: B:67:0x01a0->B:68:0x01a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            r8 = r21
            int r1 = X.C004601z.A06(r8)
            r0 = 1
            r5 = 0
            r20 = 0
            if (r1 != r0) goto L_0x000e
            r20 = 1
        L_0x000e:
            int r19 = r8.getWidth()
            int r3 = r8.getHeight()
            int r10 = r8.getPaddingLeft()
            int r18 = r8.getPaddingRight()
            int r1 = r8.getPaddingTop()
            int r17 = r8.getPaddingBottom()
            int r4 = r19 - r18
            int[] r7 = r8.A0d
            r7[r0] = r5
            r7[r5] = r5
            int r0 = r8.getMinimumHeight()
            if (r0 < 0) goto L_0x027c
            int r2 = r26 - r24
            int r9 = java.lang.Math.min(r0, r2)
        L_0x003a:
            android.widget.ImageButton r0 = r8.A0I
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x0273
            android.widget.ImageButton r0 = r8.A0I
            if (r20 == 0) goto L_0x0275
            int r11 = r8.A04(r0, r7, r4, r9)
            r6 = r10
        L_0x004b:
            android.widget.ImageButton r0 = r8.A0H
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x005b
            android.widget.ImageButton r0 = r8.A0H
            if (r20 == 0) goto L_0x026d
            int r11 = r8.A04(r0, r7, r11, r9)
        L_0x005b:
            androidx.appcompat.widget.ActionMenuView r0 = r8.A0O
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x006b
            androidx.appcompat.widget.ActionMenuView r0 = r8.A0O
            if (r20 == 0) goto L_0x0267
            int r6 = r8.A03(r0, r7, r6, r9)
        L_0x006b:
            int r2 = r8.getCurrentContentInsetLeft()
            int r12 = r8.getCurrentContentInsetRight()
            int r0 = r2 - r6
            int r0 = java.lang.Math.max(r5, r0)
            r7[r5] = r0
            int r0 = r4 - r11
            int r0 = r12 - r0
            int r0 = java.lang.Math.max(r5, r0)
            r16 = 1
            r7[r16] = r0
            int r6 = java.lang.Math.max(r6, r2)
            int r4 = r4 - r12
            int r11 = java.lang.Math.min(r11, r4)
            android.view.View r0 = r8.A0G
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x00a0
            android.view.View r0 = r8.A0G
            if (r20 == 0) goto L_0x0261
            int r11 = r8.A04(r0, r7, r11, r9)
        L_0x00a0:
            android.widget.ImageView r0 = r8.A0J
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x00b0
            android.widget.ImageView r0 = r8.A0J
            if (r20 == 0) goto L_0x025b
            int r11 = r8.A04(r0, r7, r11, r9)
        L_0x00b0:
            android.widget.TextView r0 = r8.mTitleTextView
            boolean r15 = r8.A0H(r0)
            android.widget.TextView r0 = r8.A0K
            boolean r14 = r8.A0H(r0)
            if (r15 == 0) goto L_0x00d2
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r5 = r2.topMargin
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredHeight()
            int r5 = r5 + r0
            int r0 = r2.bottomMargin
            int r5 = r5 + r0
        L_0x00d2:
            if (r14 == 0) goto L_0x00e9
            android.widget.TextView r0 = r8.A0K
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r2 = r4.topMargin
            android.widget.TextView r0 = r8.A0K
            int r0 = r0.getMeasuredHeight()
            int r2 = r2 + r0
            int r0 = r4.bottomMargin
            int r2 = r2 + r0
            int r5 = r5 + r2
        L_0x00e9:
            if (r15 != 0) goto L_0x0254
            if (r14 == 0) goto L_0x0194
            android.widget.TextView r2 = r8.A0K
        L_0x00ef:
            android.widget.TextView r0 = r8.A0K
        L_0x00f1:
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            if (r15 == 0) goto L_0x0107
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L_0x0111
        L_0x0107:
            if (r14 == 0) goto L_0x0250
            android.widget.TextView r0 = r8.A0K
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0250
        L_0x0111:
            int r0 = r8.A03
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r2 == r0) goto L_0x0244
            r0 = 80
            if (r2 == r0) goto L_0x0238
            int r0 = r3 - r1
            int r0 = r0 - r17
            int r0 = r0 - r5
            int r4 = r0 >> 1
            int r2 = r13.topMargin
            int r0 = r8.A0A
            int r2 = r2 + r0
            if (r4 >= r2) goto L_0x0220
            r4 = r2
        L_0x012c:
            int r1 = r1 + r4
        L_0x012d:
            if (r20 == 0) goto L_0x01b6
            if (r16 == 0) goto L_0x01b3
            int r4 = r8.A09
        L_0x0133:
            r3 = 1
            r0 = r7[r3]
            int r4 = r4 - r0
            r2 = 0
            int r0 = java.lang.Math.max(r2, r4)
            int r11 = r11 - r0
            int r0 = -r4
            int r0 = java.lang.Math.max(r2, r0)
            r7[r3] = r0
            if (r15 == 0) goto L_0x01b1
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            int r4 = r11 - r0
            android.widget.TextView r0 = r8.mTitleTextView
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.mTitleTextView
            r0.layout(r4, r1, r11, r2)
            int r0 = r8.A08
            int r4 = r4 - r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x0169:
            if (r14 == 0) goto L_0x01af
            android.widget.TextView r0 = r8.A0K
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0K
            int r0 = r0.getMeasuredWidth()
            int r3 = r11 - r0
            android.widget.TextView r0 = r8.A0K
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0K
            r0.layout(r3, r1, r11, r2)
            int r0 = r8.A08
            int r0 = r11 - r0
        L_0x018e:
            if (r16 == 0) goto L_0x0194
            int r11 = java.lang.Math.min(r4, r0)
        L_0x0194:
            r5 = 0
        L_0x0195:
            java.util.ArrayList r4 = r8.A0c
            r0 = 3
            r8.A0F(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x01a0:
            if (r1 >= r2) goto L_0x027f
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r6 = r8.A03(r0, r7, r6, r9)
            int r1 = r1 + 1
            goto L_0x01a0
        L_0x01af:
            r0 = r11
            goto L_0x018e
        L_0x01b1:
            r4 = r11
            goto L_0x0169
        L_0x01b3:
            r4 = 0
            goto L_0x0133
        L_0x01b6:
            if (r16 == 0) goto L_0x021d
            int r2 = r8.A09
            r5 = 0
        L_0x01bb:
            r0 = r7[r5]
            int r2 = r2 - r0
            int r0 = java.lang.Math.max(r5, r2)
            int r6 = r6 + r0
            int r0 = -r2
            int r0 = java.lang.Math.max(r5, r0)
            r7[r5] = r0
            if (r15 == 0) goto L_0x021b
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.widget.TextView r0 = r8.mTitleTextView
            int r4 = r0.getMeasuredWidth()
            int r4 = r4 + r6
            android.widget.TextView r0 = r8.mTitleTextView
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.mTitleTextView
            r0.layout(r6, r1, r4, r2)
            int r0 = r8.A08
            int r4 = r4 + r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x01ee:
            if (r14 == 0) goto L_0x0219
            android.widget.TextView r0 = r8.A0K
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0K
            int r3 = r0.getMeasuredWidth()
            int r3 = r3 + r6
            android.widget.TextView r0 = r8.A0K
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0K
            r0.layout(r6, r1, r3, r2)
            int r0 = r8.A08
            int r3 = r3 + r0
        L_0x0211:
            if (r16 == 0) goto L_0x0195
            int r6 = java.lang.Math.max(r4, r3)
            goto L_0x0195
        L_0x0219:
            r3 = r6
            goto L_0x0211
        L_0x021b:
            r4 = r6
            goto L_0x01ee
        L_0x021d:
            r5 = 0
            r2 = 0
            goto L_0x01bb
        L_0x0220:
            int r3 = r3 - r17
            int r3 = r3 - r5
            int r3 = r3 - r4
            int r3 = r3 - r1
            int r0 = r13.bottomMargin
            int r2 = r8.A07
            int r0 = r0 + r2
            if (r3 >= r0) goto L_0x012c
            int r0 = r12.bottomMargin
            int r0 = r0 + r2
            int r0 = r0 - r3
            int r4 = r4 - r0
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            goto L_0x012c
        L_0x0238:
            int r3 = r3 - r17
            int r0 = r12.bottomMargin
            int r3 = r3 - r0
            int r0 = r8.A07
            int r3 = r3 - r0
            int r1 = r3 - r5
            goto L_0x012d
        L_0x0244:
            int r1 = r8.getPaddingTop()
            int r0 = r13.topMargin
            int r1 = r1 + r0
            int r0 = r8.A0A
            int r1 = r1 + r0
            goto L_0x012d
        L_0x0250:
            r16 = 0
            goto L_0x0111
        L_0x0254:
            android.widget.TextView r2 = r8.mTitleTextView
            if (r14 != 0) goto L_0x00ef
            r0 = r2
            goto L_0x00f1
        L_0x025b:
            int r6 = r8.A03(r0, r7, r6, r9)
            goto L_0x00b0
        L_0x0261:
            int r6 = r8.A03(r0, r7, r6, r9)
            goto L_0x00a0
        L_0x0267:
            int r11 = r8.A04(r0, r7, r11, r9)
            goto L_0x006b
        L_0x026d:
            int r6 = r8.A03(r0, r7, r6, r9)
            goto L_0x005b
        L_0x0273:
            r6 = r10
            goto L_0x0279
        L_0x0275:
            int r6 = r8.A03(r0, r7, r10, r9)
        L_0x0279:
            r11 = r4
            goto L_0x004b
        L_0x027c:
            r9 = 0
            goto L_0x003a
        L_0x027f:
            r0 = 5
            r8.A0F(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x0288:
            if (r1 >= r2) goto L_0x0297
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r11 = r8.A04(r0, r7, r11, r9)
            int r1 = r1 + 1
            goto L_0x0288
        L_0x0297:
            r0 = 1
            r8.A0F(r4, r0)
            r17 = r7[r5]
            r16 = r7[r0]
            int r13 = r4.size()
            r12 = 0
            r3 = 0
        L_0x02a5:
            if (r12 >= r13) goto L_0x02d7
            java.lang.Object r14 = r4.get(r12)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.leftMargin
            int r0 = r0 - r17
            int r15 = r1.rightMargin
            int r15 = r15 - r16
            int r2 = java.lang.Math.max(r5, r0)
            int r1 = java.lang.Math.max(r5, r15)
            int r0 = -r0
            int r17 = java.lang.Math.max(r5, r0)
            int r0 = -r15
            int r16 = java.lang.Math.max(r5, r0)
            int r0 = r14.getMeasuredWidth()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r3 = r3 + r2
            int r12 = r12 + 1
            goto L_0x02a5
        L_0x02d7:
            int r19 = r19 - r10
            int r19 = r19 - r18
            int r0 = r19 >> 1
            int r10 = r10 + r0
            int r0 = r3 >> 1
            int r10 = r10 - r0
            int r3 = r3 + r10
            if (r10 < r6) goto L_0x02ea
            r6 = r10
            if (r3 <= r11) goto L_0x02ea
            int r3 = r3 - r11
            int r6 = r10 - r3
        L_0x02ea:
            int r1 = r4.size()
        L_0x02ee:
            if (r5 >= r1) goto L_0x02fd
            java.lang.Object r0 = r4.get(r5)
            android.view.View r0 = (android.view.View) r0
            int r6 = r8.A03(r0, r7, r6, r9)
            int r5 = r5 + 1
            goto L_0x02ee
        L_0x02fd:
            r4.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.A0d;
        char c2 = 1;
        if (C004601z.A06(this) != 1) {
            c2 = 0;
        }
        int i10 = 0;
        char c3 = c2 ^ 1;
        int i11 = i2;
        int i12 = i3;
        if (A0H(this.A0I)) {
            A0D(this.A0I, i11, 0, i12, this.A04);
            int measuredWidth = this.A0I.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0I.getLayoutParams();
            i4 = measuredWidth + C05580Sd.A01(marginLayoutParams) + C05580Sd.A00(marginLayoutParams);
            i5 = Math.max(0, this.A0I.getMeasuredHeight() + A00(this.A0I));
            i6 = View.combineMeasuredStates(0, this.A0I.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (A0H(this.A0H)) {
            A0D(this.A0H, i11, 0, i12, this.A04);
            int measuredWidth2 = this.A0H.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A0H.getLayoutParams();
            i4 = measuredWidth2 + C05580Sd.A01(marginLayoutParams2) + C05580Sd.A00(marginLayoutParams2);
            i5 = Math.max(i5, this.A0H.getMeasuredHeight() + A00(this.A0H));
            i6 = View.combineMeasuredStates(i6, this.A0H.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4);
        iArr[c2] = Math.max(0, currentContentInsetStart - i4);
        if (A0H(this.A0O)) {
            A0D(this.A0O, i11, max, i12, this.A04);
            int measuredWidth3 = this.A0O.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A0O.getLayoutParams();
            i7 = measuredWidth3 + C05580Sd.A01(marginLayoutParams3) + C05580Sd.A00(marginLayoutParams3);
            i5 = Math.max(i5, this.A0O.getMeasuredHeight() + A00(this.A0O));
            i6 = View.combineMeasuredStates(i6, this.A0O.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i7);
        if (A0H(this.A0G)) {
            max2 += A05(this.A0G, iArr, i11, max2, i12, 0);
            i5 = Math.max(i5, this.A0G.getMeasuredHeight() + A00(this.A0G));
            i6 = View.combineMeasuredStates(i6, this.A0G.getMeasuredState());
        }
        if (A0H(this.A0J)) {
            max2 += A05(this.A0J, iArr, i11, max2, i12, 0);
            i5 = Math.max(i5, this.A0J.getMeasuredHeight() + A00(this.A0J));
            i6 = View.combineMeasuredStates(i6, this.A0J.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((AnonymousClass09K) childAt.getLayoutParams()).A00 == 0 && A0H(childAt)) {
                max2 += A05(childAt, iArr, i11, max2, i12, 0);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + A00(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i14 = this.A0A + this.A07;
        int i15 = this.A09 + this.A08;
        if (A0H(this.mTitleTextView)) {
            A05(this.mTitleTextView, iArr, i11, max2 + i15, i12, i14);
            int measuredWidth4 = this.mTitleTextView.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.mTitleTextView.getLayoutParams();
            i8 = measuredWidth4 + C05580Sd.A01(marginLayoutParams4) + C05580Sd.A00(marginLayoutParams4);
            i9 = this.mTitleTextView.getMeasuredHeight() + A00(this.mTitleTextView);
            i6 = View.combineMeasuredStates(i6, this.mTitleTextView.getMeasuredState());
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (A0H(this.A0K)) {
            i8 = Math.max(i8, A05(this.A0K, iArr, i11, max2 + i15, i12, i9 + i14));
            i9 += this.A0K.getMeasuredHeight() + A00(this.A0K);
            i6 = View.combineMeasuredStates(i6, this.A0K.getMeasuredState());
        }
        int max3 = Math.max(i5, i9);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, -16777216 & i6);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, i6 << 16);
        if (this.A0W) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i16);
                if (A0H(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i16++;
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C02690El)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C02690El r4 = (C02690El) parcelable;
        super.onRestoreInstanceState(r4.A00);
        ActionMenuView actionMenuView = this.A0O;
        C016607w r2 = actionMenuView != null ? actionMenuView.A06 : null;
        int i2 = r4.A00;
        if (!(i2 == 0 || this.A0Q == null || r2 == null || (findItem = r2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (r4.A01) {
            Runnable runnable = this.A0a;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r5) {
        /*
            r4 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r1 < r0) goto L_0x0009
            super.onRtlPropertiesChanged(r5)
        L_0x0009:
            X.08D r3 = r4.A0P
            if (r3 != 0) goto L_0x0014
            X.08D r3 = new X.08D
            r3.<init>()
            r4.A0P = r3
        L_0x0014:
            r2 = 1
            if (r5 == r2) goto L_0x0018
            r2 = 0
        L_0x0018:
            boolean r0 = r3.A07
            if (r2 == r0) goto L_0x0034
            r3.A07 = r2
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0040
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x0035
            int r0 = r3.A00
            if (r0 != r1) goto L_0x002c
            int r0 = r3.A01
        L_0x002c:
            r3.A03 = r0
            int r0 = r3.A05
        L_0x0030:
            if (r0 == r1) goto L_0x0044
        L_0x0032:
            r3.A04 = r0
        L_0x0034:
            return
        L_0x0035:
            int r0 = r3.A05
            if (r0 != r1) goto L_0x003b
            int r0 = r3.A01
        L_0x003b:
            r3.A03 = r0
            int r0 = r3.A00
            goto L_0x0030
        L_0x0040:
            int r0 = r3.A01
            r3.A03 = r0
        L_0x0044:
            int r0 = r3.A02
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.0El r2 = new X.0El
            r2.<init>(r0)
            X.0ZS r0 = r3.A0Q
            if (r0 == 0) goto L_0x0017
            X.0av r0 = r0.A01
            if (r0 == 0) goto L_0x0017
            int r0 = r0.getItemId()
            r2.A00 = r0
        L_0x0017:
            androidx.appcompat.widget.ActionMenuView r0 = r3.A0O
            if (r0 == 0) goto L_0x0026
            X.0ZV r0 = r0.A08
            if (r0 == 0) goto L_0x0026
            boolean r1 = r0.A02()
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0Y = false;
        }
        if (!this.A0Y) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0Y = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0Y = false;
            return true;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A06();
        }
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AnonymousClass06L.A02().A05(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A06();
            this.A0H.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.A0F);
        }
    }

    public void setCollapsible(boolean z2) {
        this.A0W = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.A01) {
            this.A01 = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.A02) {
            this.A02 = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AnonymousClass06L.A02().A05(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A0J;
            if (imageView == null) {
                imageView = new C006002o(getContext(), (AttributeSet) null);
                this.A0J = imageView;
            }
            if (!A0G(imageView)) {
                A0E(this.A0J, true);
            }
        } else {
            ImageView imageView2 = this.A0J;
            if (imageView2 != null && A0G(imageView2)) {
                removeView(this.A0J);
                this.A0b.remove(this.A0J);
            }
        }
        ImageView imageView3 = this.A0J;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A0J == null) {
            this.A0J = new C006002o(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.A0J;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(C016607w r5, AnonymousClass0ZV r6) {
        if (r5 != null || this.A0O != null) {
            A09();
            C016607w r1 = this.A0O.A06;
            if (r1 != r5) {
                if (r1 != null) {
                    r1.A0E(this.A0N);
                    r1.A0E(this.A0Q);
                }
                if (this.A0Q == null) {
                    this.A0Q = new AnonymousClass0ZS(this);
                }
                r6.A0G = true;
                Context context = this.A0C;
                if (r5 != null) {
                    r5.A09(context, r6);
                    r5.A09(this.A0C, this.A0Q);
                } else {
                    r6.AIA(context, (C016607w) null);
                    this.A0Q.AIA(this.A0C, (C016607w) null);
                    r6.AhS(true);
                    this.A0Q.AhS(true);
                }
                this.A0O.setPopupTheme(this.A05);
                this.A0O.setPresenter(r6);
                this.A0N = r6;
            }
        }
    }

    public void setMenuCallbacks(C12940lD r2, AnonymousClass06H r3) {
        this.A0M = r2;
        this.A0L = r3;
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(r2, r3);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0A();
        }
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AnonymousClass06L.A02().A05(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A0A();
            if (!A0G(this.A0I)) {
                A0E(this.A0I, true);
            }
        } else {
            ImageButton imageButton = this.A0I;
            if (imageButton != null && A0G(imageButton)) {
                removeView(this.A0I);
                this.A0b.remove(this.A0I);
            }
        }
        ImageButton imageButton2 = this.A0I;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A0A();
        this.A0I.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(AnonymousClass09E r1) {
        this.A0R = r1;
    }

    public void setOverflowIcon(Drawable drawable) {
        A08();
        this.A0O.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.A05 != i2) {
            this.A05 = i2;
            this.A0C = i2 == 0 ? getContext() : new ContextThemeWrapper(getContext(), i2);
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0K;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass02Z r0 = new AnonymousClass02Z(context, (AttributeSet) null);
                this.A0K = r0;
                r0.setSingleLine();
                this.A0K.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.A06;
                if (i2 != 0) {
                    this.A0K.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A0D;
                if (colorStateList != null) {
                    this.A0K.setTextColor(colorStateList);
                }
            }
            if (!A0G(this.A0K)) {
                A0E(this.A0K, true);
            }
        } else if (textView != null && A0G(textView)) {
            removeView(this.A0K);
            this.A0b.remove(this.A0K);
        }
        TextView textView2 = this.A0K;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0U = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        TextView textView = this.A0K;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTitleTextView;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass02Z r0 = new AnonymousClass02Z(context, (AttributeSet) null);
                this.mTitleTextView = r0;
                r0.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.A0B;
                if (i2 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A0E;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!A0G(this.mTitleTextView)) {
                A0E(this.mTitleTextView, true);
            }
        } else if (textView != null && A0G(textView)) {
            removeView(this.mTitleTextView);
            this.A0b.remove(this.mTitleTextView);
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0V = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.A07 = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.A08 = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.A09 = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.A0A = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0E = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
