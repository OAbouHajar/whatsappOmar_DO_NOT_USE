package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0XI  reason: invalid class name */
public class AnonymousClass0XI {
    public static ColorFilter A00(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void A01(ColorStateList colorStateList, Drawable drawable) {
        drawable.setTintList(colorStateList);
    }

    public static void A02(Resources.Theme theme, Resources resources, Drawable drawable, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void A03(Resources.Theme theme, Drawable drawable) {
        drawable.applyTheme(theme);
    }

    public static void A04(PorterDuff.Mode mode, Drawable drawable) {
        drawable.setTintMode(mode);
    }

    public static void A05(Drawable drawable, float f2, float f3) {
        drawable.setHotspot(f2, f3);
    }

    public static void A06(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    public static void A07(Drawable drawable, int i2, int i3, int i4, int i5) {
        drawable.setHotspotBounds(i2, i3, i4, i5);
    }

    public static boolean A08(Drawable drawable) {
        return drawable.canApplyTheme();
    }
}
