package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public class MultiExclusionChip extends Chip implements AnonymousClass006 {
    public CompoundButton.OnCheckedChangeListener A00;
    public C52662eE A01;
    public boolean A02;

    public MultiExclusionChip(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public MultiExclusionChip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public MultiExclusionChip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public MultiExclusionChip(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setChecked(boolean z2) {
        super.setChecked(z2);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.A00;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z2);
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00 = onCheckedChangeListener;
    }
}
