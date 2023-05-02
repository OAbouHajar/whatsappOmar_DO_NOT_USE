package X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: X.0Lw  reason: invalid class name and case insensitive filesystem */
public final class C04270Lw {
    public static void A00(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            C04260Lv.A00(edgeEffect, f2, f3);
        } else {
            edgeEffect.onPull(f2);
        }
    }
}
