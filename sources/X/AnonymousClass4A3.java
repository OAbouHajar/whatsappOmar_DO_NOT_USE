package X;

import android.os.Build;
import com.obwhatsapp.R;

/* renamed from: X.4A3  reason: invalid class name */
public final class AnonymousClass4A3 {
    public static final int A00;

    static {
        int i2 = Build.VERSION.SDK_INT;
        A00 = (i2 < 19 || (i2 < 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) ? R.color.color0897 : R.color.color08f6;
    }
}
