package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.MenuItem;

/* renamed from: X.07s  reason: invalid class name and case insensitive filesystem */
public final class C016207s {
    public static void A00(ColorStateList colorStateList, MenuItem menuItem) {
        if (menuItem instanceof AnonymousClass09J) {
            ((AnonymousClass09J) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C06620Wz.A00(colorStateList, menuItem);
        }
    }
}
