package com.mod.bomfab.fab;

import android.content.Context;
import android.os.Build;

final class Util {
    Util() {
    }

    static int dpToPx(Context context, float f2) {
        return Math.round(context.getResources().getDisplayMetrics().density * f2);
    }

    static boolean hasJellyBean() {
        return Build.VERSION.SDK_INT >= 16;
    }

    static boolean hasLollipop() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
