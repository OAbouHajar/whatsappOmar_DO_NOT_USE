package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/* renamed from: X.3D6  reason: invalid class name */
public class AnonymousClass3D6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ C42821yj A02;

    public AnonymousClass3D6(View view, ImageView imageView, C42821yj r3) {
        this.A02 = r3;
        this.A01 = imageView;
        this.A00 = view;
    }

    public void onGlobalLayout() {
        ImageView imageView = this.A01;
        imageView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        int[] iArr = new int[2];
        View view = this.A00;
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        this.A02.A1n.getLocationOnScreen(iArr2);
        int i2 = iArr[0] - iArr2[0];
        int i3 = iArr[1] - iArr2[1];
        int width = i2 - ((intrinsicWidth - view.getWidth()) / 2);
        imageView.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        float f2 = (float) width;
        float height = (float) (i3 - ((intrinsicHeight - view.getHeight()) / 2));
        TranslateAnimation translateAnimation = new TranslateAnimation(f2, f2, height, height - (((float) intrinsicHeight) * 2.0f));
        float intrinsicWidth2 = (((float) ((ImageView) view).getDrawable().getIntrinsicWidth()) * 1.0f) / ((float) intrinsicWidth);
        ScaleAnimation scaleAnimation = new ScaleAnimation(intrinsicWidth2, 1.0f, intrinsicWidth2, 1.0f, 1, 0.5f, 1, 0.5f);
        animationSet.addAnimation(new AlphaAnimation(0.5f, 0.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(2000);
        animationSet.setInterpolator(new DecelerateInterpolator(2.0f));
        C30551cZ.A00(animationSet, this, 2);
        imageView.startAnimation(animationSet);
    }
}
