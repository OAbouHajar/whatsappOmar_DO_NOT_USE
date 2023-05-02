package X;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.45v  reason: invalid class name and case insensitive filesystem */
public class C808545v {
    public static long A00(C31201dg r5) {
        Object obj = r5.A02.get(35);
        if (obj != null) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return Long.parseLong(str);
                    } catch (NumberFormatException e2) {
                        Log.e("WaRcCountDownTimer", AnonymousClass000.A0g("Invalid long value:", obj), e2);
                        return 0;
                    }
                }
            } else if (obj instanceof Number) {
                return C13700nu.A01(obj);
            } else {
                throw AnonymousClass000.A0T("Attempting to extract unrecognized type from countdown timer component");
            }
        }
        return 0;
    }
}
