package X;

import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: X.0VG  reason: invalid class name */
public class AnonymousClass0VG {
    public static Resources A00(Resources.Theme theme) {
        return theme.getResources();
    }

    public static void A01(Outline outline, Drawable drawable) {
        drawable.getOutline(outline);
    }

    public static boolean A02(Drawable.ConstantState constantState) {
        return constantState.canApplyTheme();
    }
}
