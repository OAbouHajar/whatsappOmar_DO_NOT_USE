package com.obwhatsapp;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

public class EnhancedConstraintLayoutGroup extends Group implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public EnhancedConstraintLayoutGroup(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public void A06(ConstraintLayout constraintLayout) {
        super.A06(constraintLayout);
        for (int findViewById : getReferencedIds()) {
            constraintLayout.findViewById(findViewById).setAlpha(getAlpha());
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAlpha(float f2) {
        super.setAlpha(f2);
        A01();
    }
}
