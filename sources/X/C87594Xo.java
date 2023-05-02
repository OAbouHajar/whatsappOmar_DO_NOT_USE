package X;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* renamed from: X.4Xo  reason: invalid class name and case insensitive filesystem */
public class C87594Xo {
    public static int A00(Context context, float f2) {
        return Math.round((f2 * ((float) context.getResources().getDisplayMetrics().densityDpi)) / 160.0f);
    }

    public static Point A01(WindowManager windowManager) {
        Point point = new Point();
        if (C15450qv.A09()) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int i2 = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
            int i3 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
            Rect bounds = currentWindowMetrics.getBounds();
            point.set(bounds.width() - i2, bounds.height() - i3);
            return point;
        }
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }
}
