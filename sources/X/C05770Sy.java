package X;

import android.util.Log;
import java.util.Set;

/* renamed from: X.0Sy  reason: invalid class name and case insensitive filesystem */
public class C05770Sy {
    public static void A00(String str) {
        Set set = C04540My.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, (Throwable) null);
            set.add(str);
        }
    }

    public static void A01(String str, Throwable th) {
        Set set = C04540My.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
