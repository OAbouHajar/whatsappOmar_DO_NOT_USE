package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: X.0Wz  reason: invalid class name and case insensitive filesystem */
public class C06620Wz {
    public static void A00(ColorStateList colorStateList, MenuItem menuItem) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void A01(PorterDuff.Mode mode, MenuItem menuItem) {
        menuItem.setIconTintMode(mode);
    }

    public static void A02(MenuItem menuItem, char c2, int i2) {
        menuItem.setAlphabeticShortcut(c2, i2);
    }

    public static void A03(MenuItem menuItem, char c2, int i2) {
        menuItem.setNumericShortcut(c2, i2);
    }

    public static void A04(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void A05(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
