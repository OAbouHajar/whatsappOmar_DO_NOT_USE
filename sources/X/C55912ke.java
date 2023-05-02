package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.2ke  reason: invalid class name and case insensitive filesystem */
public class C55912ke implements AnonymousClass2OY {
    public final C17160ud A00;
    public final C16010sH A01;
    public final C218115n A02;
    public final C17240ul A03;

    public C55912ke(C17160ud r1, C16010sH r2, C218115n r3, C17240ul r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void AfW(Bitmap bitmap, ImageView imageView, boolean z2) {
        if (bitmap != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null || z2) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                if (layerDrawable.getNumberOfLayers() > 0) {
                    drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
                }
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(bitmap)});
            transitionDrawable.setCrossFadeEnabled(false);
            transitionDrawable.startTransition(300);
            imageView.setImageDrawable(transitionDrawable);
            return;
        }
        Afn(imageView);
    }

    public void Afn(ImageView imageView) {
        int i2 = R.drawable.avatar_contact;
        C49762Vq r3 = C99004tK.A00;
        C16010sH r2 = this.A01;
        if (r2 != null) {
            i2 = this.A00.A01(r2);
            if (this.A03.A0m(C16050sL.A03(r2.A0E))) {
                r3 = C49752Vp.A00;
            }
        }
        imageView.setImageDrawable(this.A02.A00(imageView.getContext().getTheme(), imageView.getResources(), r3, i2));
    }
}
