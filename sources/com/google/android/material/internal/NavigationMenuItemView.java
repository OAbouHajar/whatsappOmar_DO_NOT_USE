package com.google.android.material.internal;

import X.AnonymousClass000;
import X.AnonymousClass00X;
import X.AnonymousClass04h;
import X.AnonymousClass05M;
import X.C004601z;
import X.C018208n;
import X.C07290av;
import X.C12950lE;
import X.C13700nu;
import X.C53362fa;
import X.C53382fc;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.facebook.redex.IDxDCompatShape23S0100000_2_I1;
import com.obwhatsapp.R;

public class NavigationMenuItemView extends LinearLayoutCompat implements C12950lE {
    public static final int[] A0G = {16842912};
    public int A00;
    public ColorStateList A01;
    public Drawable A02;
    public Drawable A03;
    public FrameLayout A04;
    public C07290av A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final Rect A0C;
    public final Rect A0D;
    public final CheckedTextView A0E;
    public final AnonymousClass05M A0F;

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A0D = AnonymousClass000.A0J();
        this.A0C = AnonymousClass000.A0J();
        this.A00 = 119;
        this.A09 = true;
        this.A07 = false;
        TypedArray A002 = C53382fc.A00(context, attributeSet, C53362fa.A0A, new int[0], i2, 0);
        this.A00 = A002.getInt(1, this.A00);
        Drawable drawable = A002.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.A09 = A002.getBoolean(2, true);
        A002.recycle();
        IDxDCompatShape23S0100000_2_I1 iDxDCompatShape23S0100000_2_I1 = new IDxDCompatShape23S0100000_2_I1(this, 2);
        this.A0F = iDxDCompatShape23S0100000_2_I1;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.layout0223, this, true);
        this.A0B = context.getResources().getDimensionPixelSize(R.dimen.dimen02d2);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.A0E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C004601z.A0j(checkedTextView, iDxDCompatShape23S0100000_2_I1);
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.A04;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
                this.A04 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.A04.addView(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0092, code lost:
        if (r5.A05.getActionView() == null) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AII(X.C07290av r6, int r7) {
        /*
            r5 = this;
            r5.A05 = r6
            boolean r0 = r6.isVisible()
            int r0 = X.C13680ns.A02(r0)
            r5.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x0045
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r2 = X.C13700nu.A04(r5)
            r1 = 2130968811(0x7f0400eb, float:1.7546286E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r4, r0)
            if (r0 == 0) goto L_0x00c1
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            int[] r2 = A0G
            int r1 = r4.data
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
            int[] r2 = android.view.ViewGroup.EMPTY_STATE_SET
            r1 = 0
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r3.addState(r2, r0)
        L_0x0042:
            r5.setBackground(r3)
        L_0x0045:
            boolean r0 = r6.isCheckable()
            r5.setCheckable(r0)
            boolean r0 = r6.isChecked()
            r5.setChecked(r0)
            boolean r0 = r6.isEnabled()
            r5.setEnabled(r0)
            java.lang.CharSequence r0 = r6.getTitle()
            r5.setTitle(r0)
            android.graphics.drawable.Drawable r0 = r6.getIcon()
            r5.setIcon(r0)
            android.view.View r0 = r6.getActionView()
            r5.setActionView(r0)
            java.lang.CharSequence r0 = r6.getContentDescription()
            r5.setContentDescription(r0)
            java.lang.CharSequence r0 = r6.getTooltipText()
            X.AnonymousClass0L5.A00(r5, r0)
            X.0av r1 = r5.A05
            java.lang.CharSequence r0 = r1.getTitle()
            if (r0 != 0) goto L_0x0094
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 != 0) goto L_0x0094
            X.0av r0 = r5.A05
            android.view.View r1 = r0.getActionView()
            r0 = 1
            if (r1 != 0) goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            android.widget.CheckedTextView r1 = r5.A0E
            if (r0 == 0) goto L_0x00b1
            r0 = 8
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A04
            if (r0 == 0) goto L_0x00b0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = -1
        L_0x00a9:
            r1.width = r0
            android.widget.FrameLayout r0 = r5.A04
            r0.setLayoutParams(r1)
        L_0x00b0:
            return
        L_0x00b1:
            r0 = 0
            r1.setVisibility(r0)
            android.widget.FrameLayout r0 = r5.A04
            if (r0 == 0) goto L_0x00b0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = -2
            goto L_0x00a9
        L_0x00c1:
            r3 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.NavigationMenuItemView.AII(X.0av, int):void");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A03;
        if (drawable != null) {
            if (this.A07) {
                this.A07 = false;
                Rect rect = this.A0D;
                Rect rect2 = this.A0C;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.A09) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.A00, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A03;
        if (drawable != null && drawable.isStateful()) {
            this.A03.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.A03;
    }

    public int getForegroundGravity() {
        return this.A00;
    }

    public C07290av getItemData() {
        return this.A05;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C07290av r1 = this.A05;
        if (r1 != null && r1.isCheckable() && r1.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, A0G);
        }
        return onCreateDrawableState;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.A07 = z2 | this.A07;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.A07 = true;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.A06 != z2) {
            this.A06 = z2;
            this.A0F.A00(this.A0E, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.A0E.setChecked(z2);
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.A03;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.A03);
            }
            this.A03 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.A00 == 119) {
                    drawable.getPadding(AnonymousClass000.A0J());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i2) {
        if (this.A00 != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= GravityCompat.START;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.A00 = i2;
            if (i2 == 119 && this.A03 != null) {
                this.A03.getPadding(AnonymousClass000.A0J());
            }
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.A08) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C018208n.A03(drawable).mutate();
                C018208n.A04(this.A01, drawable);
            }
            int i2 = this.A0B;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.A0A) {
            if (this.A02 == null) {
                Drawable A042 = AnonymousClass00X.A04(C13700nu.A04(this), getResources(), R.drawable.navigation_empty_icon);
                this.A02 = A042;
                if (A042 != null) {
                    int i3 = this.A0B;
                    A042.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.A02;
        }
        AnonymousClass04h.A05(drawable, (Drawable) null, (Drawable) null, (Drawable) null, this.A0E);
    }

    public void setIconPadding(int i2) {
        this.A0E.setCompoundDrawablePadding(i2);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        this.A08 = AnonymousClass000.A1V(colorStateList);
        C07290av r0 = this.A05;
        if (r0 != null) {
            setIcon(r0.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.A0A = z2;
    }

    public void setTextAppearance(int i2) {
        AnonymousClass04h.A08(this.A0E, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A0E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A0E.setText(charSequence);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A03;
    }
}
