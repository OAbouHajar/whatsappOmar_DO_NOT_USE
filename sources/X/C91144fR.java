package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.4fR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91144fR implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C53802gK A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C91144fR(C53802gK r1, int i2, int i3, int i4, boolean z2) {
        this.A03 = r1;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = z2;
        this.A02 = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C53802gK r6 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        boolean z2 = this.A04;
        int i4 = this.A02;
        int A032 = (int) ((((float) i2) * AnonymousClass000.A03(valueAnimator)) + ((float) i3));
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(r6);
        A0O.width = A032;
        if (z2) {
            A0O.setMargins(i4 - A032, A0O.topMargin, 0, A0O.bottomMargin);
        } else {
            A0O.setMargins(0, A0O.topMargin, i4 - A032, A0O.bottomMargin);
        }
        r6.setLayoutParams(A0O);
    }
}
