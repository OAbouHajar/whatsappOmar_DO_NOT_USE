package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.obwhatsapp.HomeActivity;

/* renamed from: X.2d8  reason: invalid class name and case insensitive filesystem */
public class C52102d8 extends AnimatorListenerAdapter {
    public final /* synthetic */ HomeActivity A00;

    public C52102d8(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        HomeActivity homeActivity = this.A00;
        homeActivity.A0I.A07();
        homeActivity.A0E.setVisibility(4);
    }
}
