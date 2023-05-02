package com.obwhatsapp;

import X.AnonymousClass013;
import X.C31401e7;
import X.C53072ew;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageView extends C31401e7 {
    public AnonymousClass013 A00;
    public boolean A01;

    public WaImageView(Context context) {
        super(context);
    }

    public WaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context, attributeSet);
    }

    public WaImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A03(context, attributeSet);
    }

    public final void A03(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && this.A00 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0V);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(this.A00.A09(resourceId));
            }
            this.A01 = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z2;
        AnonymousClass013 r0;
        if (!this.A01 || (r0 = this.A00) == null) {
            z2 = false;
        } else {
            z2 = r0.A0T();
            if (z2) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        }
        super.onDraw(canvas);
        if (this.A01 && z2) {
            canvas.restore();
        }
    }

    public void setMirrorForRtl(boolean z2) {
        this.A01 = z2;
    }
}
