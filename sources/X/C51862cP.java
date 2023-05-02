package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.obwhatsapp.HomeActivity;

/* renamed from: X.2cP  reason: invalid class name and case insensitive filesystem */
public class C51862cP extends AnimatorListenerAdapter {
    public final /* synthetic */ HomeActivity A00;

    public C51862cP(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A09.setVisibility(0);
    }
}
