package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;

/* renamed from: X.3gX  reason: invalid class name and case insensitive filesystem */
public class C70363gX extends C30551cZ {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ AnonymousClass1ZK A04;

    public C70363gX(View view, View view2, View view3, View view4, AnonymousClass1ZK r5) {
        this.A04 = r5;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = view3;
        this.A00 = view4;
    }

    public void onAnimationEnd(Animation animation) {
        this.A01.setVisibility(8);
        if (this.A04.A0P != null) {
            this.A02.setVisibility(8);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -0.3f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(160);
        RotateAnimation rotateAnimation = new RotateAnimation(-60.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(160);
        rotateAnimation.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        this.A03.startAnimation(animationSet);
        View view = this.A02;
        view.postDelayed(new RunnableRunnableShape3S0300000_I1(this, view, this.A00, 42), 500);
    }
}
