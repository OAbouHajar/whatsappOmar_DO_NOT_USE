package X;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: X.5w2  reason: invalid class name */
public class AnonymousClass5w2 {
    public static final Pattern A00 = Pattern.compile("[0-9]+");

    public static boolean A00(C14710pd r3, String str) {
        if (!r3.A0C(1458)) {
            return false;
        }
        String A05 = r3.A05(1459);
        return !TextUtils.isEmpty(A05) && !TextUtils.isEmpty(str) && A05.contains(str);
    }
}
