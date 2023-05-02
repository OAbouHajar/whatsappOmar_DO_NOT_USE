package X;

import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.1v7  reason: invalid class name and case insensitive filesystem */
public class C41031v7 {
    public static Pair A00(String str) {
        int lastIndexOf = str.lastIndexOf(95);
        if (lastIndexOf != -1) {
            try {
                int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
                String substring = str.substring(0, lastIndexOf);
                if (!TextUtils.isEmpty(substring)) {
                    return new Pair(substring, Integer.valueOf(parseInt));
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
