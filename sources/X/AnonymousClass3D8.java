package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.3D8  reason: invalid class name */
public class AnonymousClass3D8 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SolidColorWallpaperPreview A04;

    public AnonymousClass3D8(SolidColorWallpaperPreview solidColorWallpaperPreview, int i2, int i3, int i4, int i5) {
        this.A04 = solidColorWallpaperPreview;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
    }

    public boolean onPreDraw() {
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A04;
        solidColorWallpaperPreview.A07.getViewTreeObserver().removeOnPreDrawListener(this);
        View findViewById = solidColorWallpaperPreview.findViewById(R.id.wallpaper_preview_mock_chat);
        View findViewById2 = solidColorWallpaperPreview.findViewById(R.id.wallpaper_preview_mock_chat_dark);
        int[] iArr = new int[2];
        solidColorWallpaperPreview.A09.getLocationOnScreen(iArr);
        solidColorWallpaperPreview.A02 = this.A02 - iArr[0];
        solidColorWallpaperPreview.A03 = this.A03 - iArr[1];
        solidColorWallpaperPreview.A00 = ((float) this.A01) / ((float) solidColorWallpaperPreview.A09.getWidth());
        solidColorWallpaperPreview.A01 = ((float) this.A00) / ((float) solidColorWallpaperPreview.A09.getHeight());
        int A012 = (int) (C13680ns.A01(solidColorWallpaperPreview) * 20.0f);
        solidColorWallpaperPreview.A09.setPivotX(0.0f);
        solidColorWallpaperPreview.A09.setPivotY(0.0f);
        solidColorWallpaperPreview.A09.setScaleX(solidColorWallpaperPreview.A00);
        solidColorWallpaperPreview.A09.setScaleY(solidColorWallpaperPreview.A01);
        solidColorWallpaperPreview.A09.setTranslationX((float) solidColorWallpaperPreview.A02);
        solidColorWallpaperPreview.A09.setTranslationY((float) solidColorWallpaperPreview.A03);
        solidColorWallpaperPreview.A04.setAlpha(0.0f);
        solidColorWallpaperPreview.A06.setAlpha(0.0f);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
            findViewById.setTranslationY((float) A012);
        }
        if (findViewById2 != null) {
            findViewById2.setAlpha(0.0f);
            findViewById2.setTranslationY((float) A012);
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        solidColorWallpaperPreview.A05.setBackgroundColor(0);
        solidColorWallpaperPreview.A04.animate().setDuration(250).alpha(1.0f).setInterpolator(decelerateInterpolator);
        C13690nt.A0L(solidColorWallpaperPreview.A09.animate().setDuration(250)).setInterpolator(decelerateInterpolator).setListener(new C56192n1(findViewById, findViewById2, decelerateInterpolator, this));
        return true;
    }
}
