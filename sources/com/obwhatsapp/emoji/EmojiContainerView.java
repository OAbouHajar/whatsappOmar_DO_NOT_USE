package com.obwhatsapp.emoji;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C13690nt;
import X.C13700nu;
import X.C52662eE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class EmojiContainerView extends FrameLayout implements AnonymousClass006 {
    public Paint A00;
    public Path A01;
    public C52662eE A02;
    public boolean A03;
    public boolean A04;

    public EmojiContainerView(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        setWillNotDraw(false);
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        setWillNotDraw(false);
    }

    public EmojiContainerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A04) {
            if (this.A01 == null) {
                this.A01 = AnonymousClass000.A0I();
            }
            Paint paint = this.A00;
            if (paint == null) {
                paint = C13700nu.A05();
                this.A00 = paint;
            }
            paint.setColor(285212672);
            this.A01.reset();
            this.A01.moveTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.A01.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 3) >> 2));
            C13690nt.A0z(this.A01, this, (getWidth() * 3) >> 2);
            C13690nt.A0z(this.A01, this, (getWidth() * 9) / 10);
            this.A01.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A01, this.A00);
        }
    }

    public void setIsSkinTone(boolean z2) {
        this.A04 = z2;
    }
}
