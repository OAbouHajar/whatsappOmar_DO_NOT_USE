package X;

import android.text.TextUtils;

/* renamed from: X.4Xr  reason: invalid class name and case insensitive filesystem */
public class C87614Xr {
    public static char A00(String str) {
        int length;
        char charAt = str.charAt(0);
        if ((charAt != '+' && charAt != '-') || (length = str.length()) < 2) {
            return charAt;
        }
        int i2 = 1;
        do {
            char charAt2 = str.charAt(i2);
            if (charAt2 != '+' && charAt2 != '-') {
                return str.charAt(i2);
            }
            i2++;
        } while (i2 < length);
        return charAt;
    }

    public static Integer A01(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return C13680ns.A0X();
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                char A00 = A00(str);
                char A002 = A00(str2);
                if (!Character.isDigit(A00) || Character.isDigit(A002)) {
                    if (Character.isDigit(A00) || !Character.isDigit(A002)) {
                        return null;
                    }
                }
            }
            return -1;
        }
        return 1;
    }
}
