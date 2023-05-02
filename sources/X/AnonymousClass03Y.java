package X;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: X.03Y  reason: invalid class name */
public abstract class AnonymousClass03Y {
    public Animatable2.AnimationCallback A00;

    public Animatable2.AnimationCallback A00() {
        Animatable2.AnimationCallback animationCallback = this.A00;
        if (animationCallback != null) {
            return animationCallback;
        }
        AnonymousClass0AT r0 = new AnonymousClass0AT(this);
        this.A00 = r0;
        return r0;
    }

    public abstract void A01(Drawable drawable);
}
