package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.obwhatsapp.RollingCounterView;

/* renamed from: X.4fT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91164fT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ RollingCounterView A05;

    public /* synthetic */ C91164fT(RollingCounterView rollingCounterView, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = rollingCounterView;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A04 = i6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RollingCounterView rollingCounterView = this.A05;
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A02;
        int i5 = this.A03;
        int i6 = this.A04;
        float A032 = AnonymousClass000.A03(valueAnimator);
        int i7 = ((int) (((float) i2) * A032)) + i3;
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(rollingCounterView);
        A0O.width = i7;
        A0O.height = i4;
        A0O.leftMargin = Math.round(((float) (rollingCounterView.A01 - i5)) * A032) + i5;
        A0O.rightMargin = Math.round(A032 * ((float) (rollingCounterView.A02 - i6))) + i6;
        rollingCounterView.A0B.set(0, 0, i7, i4);
        rollingCounterView.setLayoutParams(A0O);
    }
}
