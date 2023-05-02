package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;
import com.obwhatsapp.profile.ViewProfilePhoto;

/* renamed from: X.3MV  reason: invalid class name */
public class AnonymousClass3MV extends Fade {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewProfilePhoto A02;

    public AnonymousClass3MV(ViewProfilePhoto viewProfilePhoto, int i2, int i3) {
        this.A02 = viewProfilePhoto;
        this.A01 = i2;
        this.A00 = i3;
    }

    public static /* synthetic */ void A00(ObjectAnimator objectAnimator, AnonymousClass3MV r3, int i2, int i3) {
        Window window = r3.A02.getWindow();
        int A03 = AnonymousClass090.A03(AnonymousClass000.A03(objectAnimator), i2, i3);
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        ObjectAnimator objectAnimator = (ObjectAnimator) super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (!(objectAnimator == null || (i2 = this.A01) == 0)) {
            ViewProfilePhoto viewProfilePhoto = this.A02;
            objectAnimator.addUpdateListener(new C91124fP(objectAnimator, this, i2, viewProfilePhoto.getWindow().getStatusBarColor()));
            int navigationBarColor = viewProfilePhoto.getWindow().getNavigationBarColor();
            viewProfilePhoto.getWindow().setNavigationBarColor(AnonymousClass090.A03(AnonymousClass000.A03(objectAnimator), this.A00, navigationBarColor));
        }
        return objectAnimator;
    }
}
