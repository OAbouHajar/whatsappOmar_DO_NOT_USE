package com.obwhatsapp.status.playback.content;

import X.AnonymousClass006;
import X.C16150sX;
import X.C16320sq;
import X.C16980tz;
import X.C47832Ku;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

public class BlurFrameLayout extends FrameLayout implements AnonymousClass006 {
    public Bitmap A00;
    public Bitmap A01;
    public ViewPropertyAnimator A02;
    public C16980tz A03;
    public C47832Ku A04;
    public C16320sq A05;
    public C52662eE A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public BlurFrameLayout(Context context) {
        super(context);
        A00();
        this.A00 = null;
        this.A09 = true;
        this.A07 = true;
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
    }

    public BlurFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A00 = null;
        this.A09 = true;
        this.A07 = true;
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
    }

    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A00 = null;
        this.A09 = true;
        this.A07 = true;
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
    }

    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
        this.A00 = null;
        this.A09 = true;
        this.A07 = true;
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
    }

    public BlurFrameLayout(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A08) {
            this.A08 = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A03 = (C16980tz) r1.AQB.get();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.A07) {
            if (this.A09) {
                Bitmap bitmap = this.A00;
                if (bitmap == null) {
                    bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    this.A00 = bitmap;
                }
                Canvas canvas2 = new Canvas(bitmap);
                Drawable background = getBackground();
                if (background != null) {
                    background.draw(canvas2);
                }
                super.dispatchDraw(canvas2);
                C47832Ku r0 = this.A04;
                if (r0 != null) {
                    r0.A02.clear();
                    this.A04.A06(true);
                }
                C47832Ku r4 = new C47832Ku(this.A03, this);
                this.A04 = r4;
                this.A05.Ack(r4, this.A00);
                this.A09 = false;
            }
            Bitmap bitmap2 = this.A01;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                return;
            }
            Drawable background2 = getBackground();
            if (background2 != null) {
                background2.draw(canvas);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47832Ku r0 = this.A04;
        if (r0 != null) {
            r0.A02.clear();
            this.A04.A06(true);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
            this.A01 = null;
        }
        this.A09 = true;
        Bitmap bitmap2 = this.A00;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.A00 = null;
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.A07) {
            this.A00 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.A09 = true;
            invalidate();
        }
    }

    public void setBlurEnabled(boolean z2) {
        this.A07 = z2;
        if (z2) {
            this.A09 = true;
        }
        invalidate();
    }
}
