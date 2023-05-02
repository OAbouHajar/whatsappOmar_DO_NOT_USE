package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;

public final class AutoOrientationLinearLayout extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AutoOrientationLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        post(new RunnableRunnableShape17S0100000_I1((Object) this, 48));
    }
}
