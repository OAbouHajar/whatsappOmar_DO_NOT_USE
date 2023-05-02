package X;

import android.animation.ValueAnimator;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.AutoScrollView;

/* renamed from: X.4fQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91134fQ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AutoScrollView A04;

    public /* synthetic */ C91134fQ(AutoScrollView autoScrollView, float f2, int i2, int i3, int i4) {
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = autoScrollView;
        this.A00 = f2;
        this.A03 = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.A01;
        int i3 = this.A02;
        AutoScrollView autoScrollView = this.A04;
        float f2 = this.A00;
        int i4 = this.A03;
        C18450wi.A0H(valueAnimator, 5);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            float A042 = ((float) i2) * AnonymousClass000.A04(animatedValue) * ((float) i3);
            WaTextView waTextView = autoScrollView.A0A;
            waTextView.setTranslationX(f2 + A042);
            autoScrollView.A0B.setTranslationX(waTextView.getTranslationX() + ((float) (i2 * i4)));
            return;
        }
        throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.Float");
    }
}
