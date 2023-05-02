package X;

import android.animation.ValueAnimator;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.5xs  reason: invalid class name and case insensitive filesystem */
public class C119435xs implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FormItemEditText A01;

    public C119435xs(FormItemEditText formItemEditText, int i2) {
        this.A01 = formItemEditText;
        this.A00 = i2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        FormItemEditText formItemEditText = this.A01;
        formItemEditText.A0M[this.A00] = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        formItemEditText.invalidate();
    }
}
