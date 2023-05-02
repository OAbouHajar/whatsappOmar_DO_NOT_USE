package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;

/* renamed from: X.0Mc  reason: invalid class name and case insensitive filesystem */
public class C04330Mc {
    public static int A00(Layout layout) {
        int i2 = 0;
        if (layout == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            int max = Math.max(0, layout.getLineCount() - 1);
            float lineDescent = (float) (layout.getLineDescent(max) - layout.getLineAscent(max));
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            i2 = spacingAdd >= 0.0f ? (int) (((double) spacingAdd) + 0.5d) : -((int) (((double) (-spacingAdd)) + 0.5d));
        }
        return layout.getHeight() - i2;
    }
}
