package com.obwhatsapp.emoji;

import X.AnonymousClass006;
import X.C004601z;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiPopupFooter extends FrameLayout implements AnonymousClass006 {
    public int A00;
    public C52662eE A01;
    public boolean A02;

    public EmojiPopupFooter(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public EmojiPopupFooter(Context context, AttributeSet attributeSet, int i2, int i3) {
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

    public int getTopOffset() {
        return this.A00;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C004601z.A0b(this, this.A00);
    }

    public void setTopOffset(int i2) {
        C004601z.A0b(this, Math.max(Math.min(getHeight(), i2), 0) - getTop());
        this.A00 = getTop();
    }
}
