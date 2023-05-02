package com.whatsapp.util;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ClippingLayout extends FrameLayout implements AnonymousClass006 {
    public Rect A00;
    public C52662eE A01;
    public boolean A02;

    public ClippingLayout(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public ClippingLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        Rect rect = this.A00;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        return super.drawChild(canvas, view, j2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setClipBounds(Rect rect) {
        Rect rect2;
        Rect rect3 = this.A00;
        if (rect != rect3) {
            if (rect == null) {
                rect2 = null;
            } else if (!rect.equals(rect3)) {
                Rect rect4 = this.A00;
                if (rect4 == null) {
                    rect2 = new Rect(rect);
                } else {
                    rect4.set(rect);
                    invalidate();
                }
            } else {
                return;
            }
            this.A00 = rect2;
            invalidate();
        }
    }
}
