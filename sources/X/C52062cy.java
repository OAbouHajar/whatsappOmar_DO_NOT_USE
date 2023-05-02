package X;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: X.2cy  reason: invalid class name and case insensitive filesystem */
public class C52062cy {
    public static boolean A00(C16440t3 r6, C15860rz r7) {
        long A00 = r6.A00();
        AnonymousClass01D r4 = r7.A01;
        return A00 < ((SharedPreferences) r4.get()).getLong("device_switching_code_expiry", 0) && !TextUtils.isEmpty(((SharedPreferences) r4.get()).getString("device_switching_code", (String) null));
    }
}
