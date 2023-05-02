package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.44u  reason: invalid class name */
public class AnonymousClass44u {
    public static boolean A00(Context context) {
        return Build.VERSION.SDK_INT >= 17 && (context.getApplicationInfo().flags & 4194304) != 0 && C806144t.A00(context) == 1;
    }
}
