package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.4fN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91104fN implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C53802gK A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C91104fN(C53802gK r1, int i2, int i3, boolean z2) {
        this.A02 = r1;
        this.A00 = i2;
        this.A03 = z2;
        this.A01 = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C53802gK r6 = this.A02;
        int i2 = this.A00;
        boolean z2 = this.A03;
        int i3 = this.A01;
        int A032 = (int) (((float) i2) * AnonymousClass000.A03(valueAnimator));
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(r6);
        A0O.height = A032;
        A0O.width = A032;
        int i4 = (i2 - A032) >> 1;
        if (z2) {
            A0O.setMargins((i3 - A032) - i4, i4, i4, A0O.bottomMargin);
        } else {
            A0O.setMargins(i4, i4, 0, A0O.bottomMargin);
        }
        r6.setLayoutParams(A0O);
    }
}
