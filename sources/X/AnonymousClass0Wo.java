package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.0Wo  reason: invalid class name */
public class AnonymousClass0Wo {
    public static int A00(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static Drawable A01(DrawableContainer.DrawableContainerState drawableContainerState, int i2) {
        return drawableContainerState.getChild(i2);
    }

    public static Drawable A02(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static void A03(Drawable drawable, boolean z2) {
        drawable.setAutoMirrored(z2);
    }

    public static boolean A04(Drawable drawable) {
        return drawable.isAutoMirrored();
    }
}
