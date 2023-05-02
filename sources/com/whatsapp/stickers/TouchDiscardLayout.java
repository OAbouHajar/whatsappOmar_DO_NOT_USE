package com.whatsapp.stickers;

import X.AnonymousClass006;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchDiscardLayout extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public TouchDiscardLayout(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public TouchDiscardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public TouchDiscardLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public TouchDiscardLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
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

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
