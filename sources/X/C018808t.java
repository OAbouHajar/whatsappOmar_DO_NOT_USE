package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.08t  reason: invalid class name and case insensitive filesystem */
public class C018808t {
    public static void A00(ColorStateList colorStateList, ImageView imageView) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            C018708s.A02(colorStateList, imageView);
            if (i2 == 21 && (drawable = imageView.getDrawable()) != null && C018708s.A00(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C006102p) {
            ((C006102p) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static void A01(PorterDuff.Mode mode, ImageView imageView) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            C018708s.A03(mode, imageView);
            if (i2 == 21 && (drawable = imageView.getDrawable()) != null && C018708s.A00(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C006102p) {
            ((C006102p) imageView).setSupportImageTintMode(mode);
        }
    }
}
