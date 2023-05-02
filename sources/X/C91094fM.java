package X;

import android.animation.ValueAnimator;
import com.obwhatsapp.storage.SizeTickerView;

/* renamed from: X.4fM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91094fM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ SizeTickerView A02;

    public /* synthetic */ C91094fM(SizeTickerView sizeTickerView, long j2, long j3) {
        this.A02 = sizeTickerView;
        this.A00 = j2;
        this.A01 = j3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SizeTickerView sizeTickerView = this.A02;
        long j2 = this.A00;
        sizeTickerView.A05 = (long) (((float) j2) + (((float) ((this.A01 - j2) * ((long) AnonymousClass000.A0D(valueAnimator.getAnimatedValue())))) / 10.0f));
        sizeTickerView.A0A();
    }
}
