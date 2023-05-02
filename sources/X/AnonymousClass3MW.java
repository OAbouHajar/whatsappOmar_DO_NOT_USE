package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;
import com.obwhatsapp.profile.ViewProfilePhoto;

/* renamed from: X.3MW  reason: invalid class name */
public class AnonymousClass3MW extends Fade {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ ViewProfilePhoto A03;

    public AnonymousClass3MW(ViewProfilePhoto viewProfilePhoto, float f2, int i2, int i3) {
        this.A03 = viewProfilePhoto;
        this.A00 = f2;
        this.A02 = i2;
        this.A01 = i3;
    }

    public static /* synthetic */ void A00(ObjectAnimator objectAnimator, AnonymousClass3MW r5, float f2, int i2, int i3) {
        float A032 = (AnonymousClass000.A03(objectAnimator) - f2) / (1.0f - f2);
        ViewProfilePhoto viewProfilePhoto = r5.A03;
        Window window = viewProfilePhoto.getWindow();
        int A033 = AnonymousClass090.A03(A032, i2, -16777216);
        viewProfilePhoto.getWindow().setNavigationBarColor(AnonymousClass090.A03(A032, i3, -16777216));
    }

    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        float f2 = this.A00;
        if (f2 != 0.0f) {
            transitionValues.values.put("android:fade:transitionAlpha", Float.valueOf(f2));
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        ObjectAnimator objectAnimator = (ObjectAnimator) super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (!(objectAnimator == null || (i2 = this.A02) == 0)) {
            objectAnimator.addUpdateListener(new C91154fS(objectAnimator, this, this.A00, i2, this.A01));
        }
        return objectAnimator;
    }
}
