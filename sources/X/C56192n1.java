package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import com.facebook.redex.IDxLAdapterShape4S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.2n1  reason: invalid class name and case insensitive filesystem */
public class C56192n1 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Interpolator A02;
    public final /* synthetic */ AnonymousClass3D8 A03;

    public C56192n1(View view, View view2, Interpolator interpolator, AnonymousClass3D8 r4) {
        this.A03 = r4;
        this.A02 = interpolator;
        this.A00 = view;
        this.A01 = view2;
    }

    public final void A00(View view) {
        if (view != null) {
            view.animate().setDuration(250).alpha(1.0f).translationY(0.0f).setInterpolator(this.A02).setListener(new IDxLAdapterShape4S0100000_2_I1(this, 9));
        }
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A03.A04;
        solidColorWallpaperPreview.A05.setBackgroundColor(solidColorWallpaperPreview.getResources().getColor(R.color.color090b));
        solidColorWallpaperPreview.A0C = false;
        solidColorWallpaperPreview.A09.setScrollEnabled(true);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A03.A04;
        solidColorWallpaperPreview.A05.setBackgroundColor(solidColorWallpaperPreview.getResources().getColor(R.color.color090b));
        solidColorWallpaperPreview.A06.animate().setDuration(250).alpha(1.0f).setInterpolator(this.A02);
        A00(this.A00);
        A00(this.A01);
    }
}
