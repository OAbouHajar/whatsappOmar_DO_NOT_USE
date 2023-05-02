package com.obwhatsapp.components;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass2WK;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FloatingActionButton extends AnonymousClass2WK implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C52662eE A01;
    public boolean A02;

    public FloatingActionButton(Context context) {
        super(context, (AttributeSet) null);
        A05();
        setScaleType(ImageView.ScaleType.CENTER);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        A06(context, attributeSet);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A05();
        A06(context, attributeSet);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A05();
    }

    public void A05() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final void A06(Context context, AttributeSet attributeSet) {
        setScaleType(ImageView.ScaleType.CENTER);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A09);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(this.A00.A09(resourceId));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }
}
