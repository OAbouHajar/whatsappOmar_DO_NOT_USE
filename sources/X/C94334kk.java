package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* renamed from: X.4kk  reason: invalid class name and case insensitive filesystem */
public class C94334kk implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C48702Op A01;

    public C94334kk(C48702Op r1, float f2) {
        this.A01 = r1;
        this.A00 = f2;
    }

    public void onGlobalLayout() {
        C48702Op r2 = this.A01;
        View view = r2.A02;
        AnonymousClass3K3.A16(view, this);
        float height = (float) view.getHeight();
        float f2 = this.A00;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f - (f2 / height), 1, 0.0f);
        translateAnimation.setDuration(300);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(translateAnimation);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 0, (height - f2) * 1.4f, 0, 0.0f));
        animationSet.setDuration(300);
        r2.A04.startAnimation(animationSet);
        r2.A03.startAnimation(animationSet);
    }
}
