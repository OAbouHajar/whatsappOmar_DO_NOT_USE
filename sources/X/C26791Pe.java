package X;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;

/* renamed from: X.1Pe  reason: invalid class name and case insensitive filesystem */
public final class C26791Pe {
    public static final int A00(Context context) {
        Point A01;
        C18450wi.A0H(context, 0);
        Context A00 = C47142Ht.A00(context);
        int i2 = A00.getResources().getConfiguration().smallestScreenWidthDp;
        if (C15450qv.A00() && (A01 = A01(A00)) != null) {
            float min = ((float) Math.min(A01.x, A01.y)) / A00.getResources().getDisplayMetrics().density;
            if (((double) Math.abs(min - ((float) i2))) <= ((double) i2) * 0.15d) {
                return (int) min;
            }
        }
        return i2;
    }

    public static final Point A01(Context context) {
        Point point = new Point();
        Object systemService = context.getSystemService("display");
        if (systemService != null) {
            Display display = ((DisplayManager) systemService).getDisplay(0);
            if (display == null) {
                return null;
            }
            display.getRealSize(point);
            return point;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.hardware.display.DisplayManager");
    }

    public static final AnonymousClass2CF A02(Context context) {
        int i2;
        int i3;
        C18450wi.A0H(context, 0);
        Object systemService = context.getSystemService("display");
        if (systemService != null) {
            Display display = ((DisplayManager) systemService).getDisplay(0);
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                float f2 = displayMetrics.xdpi;
                float f3 = (float) 100;
                if (f2 >= f3) {
                    float f4 = displayMetrics.ydpi;
                    if (f4 >= f3 && (i2 = displayMetrics.widthPixels) > 0 && (i3 = displayMetrics.heightPixels) > 0) {
                        float f5 = ((float) (i2 * 100)) / f2;
                        float f6 = ((float) (i3 * 100)) / f4;
                        return new AnonymousClass2CF((int) f5, (int) f6, (int) Math.sqrt(Math.pow((double) f5, 2.0d) + Math.pow((double) f6, 2.0d)));
                    }
                }
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.hardware.display.DisplayManager");
    }
}
