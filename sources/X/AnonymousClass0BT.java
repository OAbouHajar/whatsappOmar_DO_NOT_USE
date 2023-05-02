package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.0BT  reason: invalid class name */
public class AnonymousClass0BT extends CharacterStyle {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public AnonymousClass0BT(float f2, float f3, float f4, int i2) {
        this.A02 = f2;
        this.A00 = f3;
        this.A01 = f4;
        this.A03 = i2;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.A02, this.A00, this.A01, this.A03);
    }
}
