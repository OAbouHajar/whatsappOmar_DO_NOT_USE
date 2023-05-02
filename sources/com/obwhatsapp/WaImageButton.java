package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass06z;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageButton extends AnonymousClass06z implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C52662eE A01;
    public boolean A02;
    public boolean A03;

    public WaImageButton(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }

    public WaImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(context, attributeSet);
    }

    public WaImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A01(context, attributeSet);
    }

    public WaImageButton(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
        }
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0U);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (!isInEditMode() && resourceId != 0) {
                setContentDescription(this.A00.A09(resourceId));
            }
            this.A03 = obtainStyledAttributes.getBoolean(1, false);
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

    public void onDraw(Canvas canvas) {
        boolean z2;
        if (this.A03) {
            z2 = this.A00.A0T();
            if (z2) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        } else {
            z2 = false;
        }
        super.onDraw(canvas);
        if (this.A03 && z2) {
            canvas.restore();
        }
    }
}
