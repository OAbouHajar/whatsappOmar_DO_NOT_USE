package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass07T;
import X.AnonymousClass0D0;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SH;
import X.AnonymousClass0ZV;
import X.C004601z;
import X.C016607w;
import X.C07370bD;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class ActionBarContextView extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public LinearLayout A07;
    public TextView A08;
    public TextView A09;
    public AnonymousClass0ZV A0A;
    public ActionMenuView A0B;
    public AnonymousClass0SH A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Context A0I;
    public final C07370bD A0J;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr0020);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        this.A0J = new C07370bD(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.secondary_text_default_material_light, typedValue, true) || (i3 = typedValue.resourceId) == 0) {
            this.A0I = context;
        } else {
            this.A0I = new ContextThemeWrapper(context, i3);
        }
        AnonymousClass07T A002 = AnonymousClass07T.A00(context, attributeSet, AnonymousClass05L.A03, i2, 0);
        setBackground(A002.A02(0));
        TypedArray typedArray = A002.A02;
        this.A03 = typedArray.getResourceId(5, 0);
        this.A02 = typedArray.getResourceId(4, 0);
        this.A01 = typedArray.getLayoutDimension(3, 0);
        this.A00 = typedArray.getResourceId(2, R.layout.layout0005);
        A002.A04();
    }

    public static int A00(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) >> 1);
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
            return -measuredWidth;
        }
        view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        return measuredWidth;
    }

    public void A03() {
        removeAllViews();
        this.A06 = null;
        this.A0B = null;
        this.A0A = null;
        View view = this.A05;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void A04() {
        if (this.A07 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.layout0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A07 = linearLayout;
            this.A09 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.A08 = (TextView) this.A07.findViewById(R.id.action_bar_subtitle);
            int i2 = this.A03;
            if (i2 != 0) {
                this.A09.setTextAppearance(getContext(), i2);
            }
            int i3 = this.A02;
            if (i3 != 0) {
                this.A08.setTextAppearance(getContext(), i3);
            }
        }
        this.A09.setText(this.A0E);
        this.A08.setText(this.A0D);
        boolean z2 = !TextUtils.isEmpty(this.A0E);
        boolean z3 = !TextUtils.isEmpty(this.A0D);
        TextView textView = this.A08;
        int i4 = 0;
        int i5 = 8;
        if (z3) {
            i5 = 0;
        }
        textView.setVisibility(i5);
        LinearLayout linearLayout2 = this.A07;
        if (!z2 && !z3) {
            i4 = 8;
        }
        linearLayout2.setVisibility(i4);
        if (this.A07.getParent() == null) {
            addView(this.A07);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass05J r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.A04
            if (r0 != 0) goto L_0x0092
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            int r1 = r6.A00
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r6, r0)
            r6.A04 = r0
        L_0x0015:
            r6.addView(r0)
        L_0x0018:
            android.view.View r1 = r6.A04
            r0 = 2131361916(0x7f0a007c, float:1.8343598E38)
            android.view.View r1 = r1.findViewById(r0)
            r6.A05 = r1
            r5 = 0
            com.facebook.redex.IDxCListenerShape31S0200000_I1 r0 = new com.facebook.redex.IDxCListenerShape31S0200000_I1
            r0.<init>(r7, r5, r6)
            r1.setOnClickListener(r0)
            android.view.Menu r2 = r7.A00()
            X.07w r2 = (X.C016607w) r2
            X.0ZV r0 = r6.A0A
            if (r0 == 0) goto L_0x0040
            r0.A01()
            X.0D0 r0 = r0.A0B
            if (r0 == 0) goto L_0x0040
            r0.A01()
        L_0x0040:
            android.content.Context r0 = r6.getContext()
            X.0ZV r1 = new X.0ZV
            r1.<init>(r0)
            r6.A0A = r1
            r0 = 1
            r1.A0I = r0
            r1.A0J = r0
            r1 = -2
            r0 = -1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r0)
            X.0ZV r1 = r6.A0A
            android.content.Context r0 = r6.A0I
            r2.A09(r0, r1)
            X.0ZV r3 = r6.A0A
            X.0k5 r2 = r3.A0A
            if (r2 != 0) goto L_0x007a
            android.view.LayoutInflater r1 = r3.A07
            r0 = 2131558403(0x7f0d0003, float:1.874212E38)
            android.view.View r1 = r1.inflate(r0, r6, r5)
            X.0k5 r1 = (X.C12250k5) r1
            r3.A0A = r1
            X.07w r0 = r3.A08
            r1.AIH(r0)
            r0 = 1
            r3.AhS(r0)
        L_0x007a:
            X.0k5 r1 = r3.A0A
            if (r2 == r1) goto L_0x0084
            r0 = r1
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r3)
        L_0x0084:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.A0B = r1
            r0 = 0
            r1.setBackground(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r6.A0B
            r6.addView(r0, r4)
            return
        L_0x0092:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0018
            android.view.View r0 = r6.A04
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.A05(X.05J):void");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getAnimatedVisibility$AbsActionBarView */
    public int getAnimatedVisibility() {
        return this.A0C != null ? this.A0J.A00 : getVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return this.A01;
    }

    public int getContentHeight$AbsActionBarView() {
        return this.A01;
    }

    public CharSequence getSubtitle() {
        return this.A0D;
    }

    public CharSequence getTitle() {
        return this.A0E;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, AnonymousClass05L.A00, R.attr.attr0009, 0);
        this.A01 = obtainStyledAttributes.getLayoutDimension(13, 0);
        obtainStyledAttributes.recycle();
        AnonymousClass0ZV r2 = this.A0A;
        if (r2 != null) {
            r2.A01 = new AnonymousClass0Q7(r2.A03).A00();
            C016607w r1 = r2.A08;
            if (r1 != null) {
                r1.A0F(true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass0ZV r0 = this.A0A;
        if (r0 != null) {
            r0.A01();
            AnonymousClass0D0 r02 = this.A0A.A0B;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0F = false;
        }
        if (!this.A0F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0F = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0F = false;
            return true;
        }
        return true;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(AnonymousClass000.A0d(this));
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.A0E);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int paddingLeft;
        int i6;
        int i7;
        boolean z3 = true;
        if (C004601z.A06(this) == 1) {
            paddingLeft = (i4 - i2) - getPaddingRight();
        } else {
            z3 = false;
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.A04;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(this.A04);
            if (z3) {
                int i8 = A0O.rightMargin;
                i6 = A0O.leftMargin;
                i7 = paddingLeft - i8;
            } else {
                int i9 = A0O.leftMargin;
                i6 = A0O.rightMargin;
                i7 = paddingLeft + i9;
            }
            int A002 = i7 + A00(this.A04, i7, paddingTop, paddingTop2, z3);
            paddingLeft = z3 ? A002 - i6 : A002 + i6;
        }
        LinearLayout linearLayout = this.A07;
        if (!(linearLayout == null || this.A06 != null || linearLayout.getVisibility() == 8)) {
            paddingLeft += A00(this.A07, paddingLeft, paddingTop, paddingTop2, z3);
        }
        View view2 = this.A06;
        if (view2 != null) {
            A00(view2, paddingLeft, paddingTop, paddingTop2, z3);
        }
        int paddingLeft2 = z3 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.A0B;
        if (actionMenuView != null) {
            A00(actionMenuView, paddingLeft2, paddingTop, paddingTop2, !z3);
        }
    }

    public void onMeasure(int i2, int i3) {
        StringBuilder sb;
        String str;
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            sb = AnonymousClass000.A0p(this);
            str = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)";
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.A01;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.A04;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                int max = Math.max(0, paddingLeft - view.getMeasuredWidth());
                ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(this.A04);
                paddingLeft = max - (A0O.leftMargin + A0O.rightMargin);
            }
            ActionMenuView actionMenuView = this.A0B;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                ActionMenuView actionMenuView2 = this.A0B;
                actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - actionMenuView2.getMeasuredWidth());
            }
            LinearLayout linearLayout = this.A07;
            if (linearLayout != null && this.A06 == null) {
                if (this.A0H) {
                    this.A07.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.A07.getMeasuredWidth();
                    boolean z2 = false;
                    if (measuredWidth <= paddingLeft) {
                        z2 = true;
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.A07;
                    int i7 = 8;
                    if (z2) {
                        i7 = 0;
                    }
                    linearLayout2.setVisibility(i7);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                    paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                }
            }
            View view2 = this.A06;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i8 = layoutParams.width;
                int i9 = Integer.MIN_VALUE;
                if (i8 != -2) {
                    i9 = 1073741824;
                    if (i8 >= 0) {
                        paddingLeft = Math.min(i8, paddingLeft);
                    }
                }
                int i10 = layoutParams.height;
                if (i10 == -2) {
                    i4 = Integer.MIN_VALUE;
                } else if (i10 >= 0) {
                    i6 = Math.min(i10, i6);
                }
                this.A06.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.A01 <= 0) {
                int childCount = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i11) {
                        i11 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i11);
                return;
            }
            setMeasuredDimension(size, i5);
            return;
        } else {
            sb = AnonymousClass000.A0p(this);
            str = " can only be used with android:layout_height=\"wrap_content\"";
        }
        throw AnonymousClass000.A0V(AnonymousClass000.A0h(str, sb));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0G = false;
        }
        if (!this.A0G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0G = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0G = false;
            return true;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.A01 = i2;
    }

    public void setCustomView(View view) {
        View view2 = this.A06;
        if (view2 != null) {
            removeView(view2);
        }
        this.A06 = view;
        if (view != null) {
            LinearLayout linearLayout = this.A07;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A07 = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A0D = charSequence;
        A04();
    }

    public void setTitle(CharSequence charSequence) {
        this.A0E = charSequence;
        A04();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.A0H) {
            requestLayout();
        }
        this.A0H = z2;
    }

    /* renamed from: setVisibility$AbsActionBarView */
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            AnonymousClass0SH r0 = this.A0C;
            if (r0 != null) {
                r0.A01();
            }
            super.setVisibility(i2);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
