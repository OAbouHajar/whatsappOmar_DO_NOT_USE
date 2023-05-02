package X;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: X.0Lt  reason: invalid class name and case insensitive filesystem */
public final class C04240Lt {
    public static Interpolator A00(float f2, float f3, float f4, float f5) {
        return Build.VERSION.SDK_INT >= 21 ? C04230Ls.A00(f2, f3, f4, f5) : new C07050Yy(f2, f3, f4, f5);
    }
}
