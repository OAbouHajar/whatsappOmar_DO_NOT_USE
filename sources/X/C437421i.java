package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.21i  reason: invalid class name and case insensitive filesystem */
public class C437421i {
    public static int A00(Context context) {
        try {
            return C57892s9.A00.A00(context, 12451000);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder("google-utils/checkGooglePlayServicesStatus/unexpected exception/");
            sb.append(e2);
            Log.e(sb.toString());
            return 8;
        }
    }

    public static boolean A01(Context context) {
        return A00(context) == 0;
    }
}
