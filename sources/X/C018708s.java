package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: X.08s  reason: invalid class name and case insensitive filesystem */
public class C018708s {
    public static ColorStateList A00(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static PorterDuff.Mode A01(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void A02(ColorStateList colorStateList, ImageView imageView) {
        imageView.setImageTintList(colorStateList);
    }

    public static void A03(PorterDuff.Mode mode, ImageView imageView) {
        imageView.setImageTintMode(mode);
    }
}
