package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.2s0  reason: invalid class name and case insensitive filesystem */
public class C57842s0 extends C49832Wc implements C108205Nb {
    public AnonymousClass3AI A00;
    public final C61813Al A01 = new C61813Al(this);

    public C57842s0(Context context) {
        super(context, (AttributeSet) null);
    }

    public void offsetLeftAndRight(int i2) {
        if (i2 != 0) {
            super.offsetLeftAndRight(i2);
        }
    }

    public void offsetTopAndBottom(int i2) {
        if (i2 != 0) {
            super.offsetTopAndBottom(i2);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01.A01();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01.A02();
    }

    public void onMeasure(int i2, int i3) {
        AnonymousClass3AI r0 = this.A00;
        if (r0 == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(r0.A03.A04.width(), this.A00.A03.A04.height());
        }
    }

    public void setRenderTree(AnonymousClass3AI r2) {
        if (this.A00 != r2) {
            if (r2 == null) {
                this.A01.A03();
            }
            this.A00 = r2;
            requestLayout();
        }
    }

    public void setTranslationX(float f2) {
        if (f2 != getTranslationX()) {
            super.setTranslationX(f2);
        }
    }

    public void setTranslationY(float f2) {
        if (f2 != getTranslationY()) {
            super.setTranslationY(f2);
        }
    }
}
