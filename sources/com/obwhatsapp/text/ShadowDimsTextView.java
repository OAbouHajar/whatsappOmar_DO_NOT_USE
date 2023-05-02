package com.obwhatsapp.text;

import X.AnonymousClass006;
import X.AnonymousClass02Z;
import X.C52662eE;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class ShadowDimsTextView extends AnonymousClass02Z implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public ShadowDimsTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0L);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(1, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(2, 0.0f);
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            setShadowLayer(dimension, dimension2, dimension3, color);
        } else {
            getPaint().clearShadowLayer();
        }
        obtainStyledAttributes.recycle();
    }

    public ShadowDimsTextView(Context context, AttributeSet attributeSet, int i2) {
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
}
