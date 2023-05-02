package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;

/* renamed from: X.0Cl  reason: invalid class name and case insensitive filesystem */
public class C02530Cl extends AnonymousClass0Rj {
    public final ObjectAnimator A00;
    public final boolean A01;

    public C02530Cl(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i2 = z2 ? numberOfFrames - 1 : 0;
        int i3 = z2 ? 0 : numberOfFrames - 1;
        AnonymousClass0XU r3 = new AnonymousClass0XU(animationDrawable, z2);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i2, i3});
        if (Build.VERSION.SDK_INT >= 18) {
            ofInt.setAutoCancel(true);
        }
        ofInt.setDuration((long) r3.A01);
        ofInt.setInterpolator(r3);
        this.A01 = z3;
        this.A00 = ofInt;
    }

    public void A00() {
        this.A00.reverse();
    }

    public void A01() {
        this.A00.start();
    }

    public void A02() {
        this.A00.cancel();
    }

    public boolean A03() {
        return this.A01;
    }
}
