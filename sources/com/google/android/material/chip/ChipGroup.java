package com.google.android.material.chip;

import X.AnonymousClass2o5;
import X.AnonymousClass3N1;
import X.AnonymousClass5MH;
import X.C53362fa;
import X.C53382fc;
import X.C94274ke;
import X.C94724lN;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.obwhatsapp.R;

public class ChipGroup extends AnonymousClass2o5 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass5MH A03;
    public C94274ke A04;
    public boolean A05;
    public boolean A06;
    public final C94724lN A07;

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr00be);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A07 = new C94724lN(this);
        this.A04 = new C94274ke(this);
        this.A00 = -1;
        this.A05 = false;
        TypedArray A002 = C53382fc.A00(context, attributeSet, C53362fa.A04, new int[0], i2, R.style.style042e);
        int dimensionPixelOffset = A002.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(A002.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(A002.getDimensionPixelOffset(3, dimensionPixelOffset));
        this.A02 = A002.getBoolean(4, false);
        setSingleSelection(A002.getBoolean(5, false));
        int resourceId = A002.getResourceId(0, -1);
        if (resourceId != -1) {
            this.A00 = resourceId;
        }
        A002.recycle();
        super.setOnHierarchyChangeListener(this.A04);
    }

    private void setCheckedId(int i2) {
        this.A00 = i2;
    }

    public final void A00(int i2, boolean z2) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof Chip) {
            this.A05 = true;
            ((CompoundButton) findViewById).setChecked(z2);
            this.A05 = false;
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            CompoundButton compoundButton = (CompoundButton) view;
            if (compoundButton.isChecked()) {
                int i3 = this.A00;
                if (i3 != -1 && this.A06) {
                    A00(i3, false);
                }
                this.A00 = compoundButton.getId();
            }
        }
        super.addView(view, i2, layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof AnonymousClass3N1);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass3N1();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass3N1(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass3N1(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.A06) {
            return this.A00;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.A01;
    }

    public int getChipSpacingVertical() {
        return this.A02;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.A00;
        if (i2 != -1) {
            A00(i2, true);
            this.A00 = this.A00;
        }
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.A01 != i2) {
            this.A01 = i2;
            this.A00 = i2;
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.A02 != i2) {
            this.A02 = i2;
            this.A01 = i2;
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(AnonymousClass5MH r1) {
        this.A03 = r1;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A04.A00 = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i2) {
        this.A02 = getResources().getBoolean(i2);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z2) {
        if (this.A06 != z2) {
            this.A06 = z2;
            this.A05 = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof Chip) {
                    ((CompoundButton) childAt).setChecked(false);
                }
            }
            this.A05 = false;
            this.A00 = -1;
        }
    }
}
