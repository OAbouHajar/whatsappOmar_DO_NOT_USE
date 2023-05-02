package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0Lo  reason: invalid class name and case insensitive filesystem */
public class C04200Lo {
    public static void A00(Window window, boolean z2) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i2 = systemUiVisibility | 1792;
        if (z2) {
            i2 = systemUiVisibility & -1793;
        }
        decorView.setSystemUiVisibility(i2);
    }
}
