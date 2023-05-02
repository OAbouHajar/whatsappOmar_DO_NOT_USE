package X;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5x0  reason: invalid class name */
public class AnonymousClass5x0 {
    public static HashSet A00(Object... objArr) {
        HashSet A0o = C13680ns.A0o();
        for (Object add : objArr) {
            A0o.add(add);
        }
        return A0o;
    }

    public static boolean A01(char c2, char c3, char c4) {
        String str;
        int indexOf;
        if (!Build.MANUFACTURER.equals("samsung") || (indexOf = str.indexOf(":user/")) < 3) {
            return false;
        }
        char charAt = (str = Build.FINGERPRINT).charAt(indexOf - 3);
        char charAt2 = str.charAt(indexOf - 2);
        char charAt3 = str.charAt(indexOf - 1);
        if (charAt <= c2) {
            if (charAt != c2) {
                return false;
            }
            if (charAt2 <= c3) {
                return charAt2 == c3 && charAt3 >= c4;
            }
        }
        return true;
    }

    public static boolean A02(Set set) {
        return set.contains(AnonymousClass5xA.A04) || set.contains(AnonymousClass5xA.A05) || set.contains(AnonymousClass5xA.A06) || set.contains(AnonymousClass5xA.A07);
    }
}
