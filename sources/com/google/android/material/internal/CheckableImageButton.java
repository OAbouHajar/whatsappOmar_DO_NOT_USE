package com.google.android.material.internal;

import X.AnonymousClass06z;
import X.C004601z;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.facebook.redex.IDxDCompatShape23S0100000_2_I1;
import com.obwhatsapp.R;

public class CheckableImageButton extends AnonymousClass06z implements Checkable {
    public static final int[] A01 = {16842912};
    public boolean A00;

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr02d0);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C004601z.A0j(this, new IDxDCompatShape23S0100000_2_I1(this, 1));
    }

    public boolean isChecked() {
        return this.A00;
    }

    public int[] onCreateDrawableState(int i2) {
        if (!this.A00) {
            return super.onCreateDrawableState(i2);
        }
        int[] iArr = A01;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
    }

    public void setChecked(boolean z2) {
        if (this.A00 != z2) {
            this.A00 = z2;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.A00);
    }
}
