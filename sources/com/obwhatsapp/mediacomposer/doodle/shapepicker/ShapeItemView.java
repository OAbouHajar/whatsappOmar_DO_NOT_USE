package com.obwhatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass006;
import X.C006002o;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ShapeItemView extends C006002o implements AnonymousClass006 {
    public C52662eE A00;
    public String A01;
    public boolean A02;

    public ShapeItemView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ShapeItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public ShapeItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ShapeItemView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
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
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i2);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
