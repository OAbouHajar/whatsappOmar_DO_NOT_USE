package X;

import android.text.TextUtils;

/* renamed from: X.1aj  reason: invalid class name and case insensitive filesystem */
public class C29501aj {
    public static int A00(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static long A01(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return j2;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static Float A02(String str, float f2) {
        if (TextUtils.isEmpty(str)) {
            return Float.valueOf(f2);
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return Float.valueOf(f2);
        }
    }
}
