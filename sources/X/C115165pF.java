package X;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.5pF  reason: invalid class name and case insensitive filesystem */
public class C115165pF {
    public static Object A00(Object obj, int i2, boolean z2) {
        StringBuilder A0r;
        if (obj != null) {
            boolean z3 = false;
            if (i2 != 1) {
                if (i2 == 2) {
                    return Long.valueOf(C13700nu.A01(obj));
                }
                if (i2 == 3) {
                    return Float.valueOf(AnonymousClass000.A04(obj));
                }
                if (i2 == 4) {
                    return obj;
                }
                if (i2 != 5) {
                    A0r = AnonymousClass000.A0r("BloksFieldStatParser/parseValue/unknown type/type=");
                    A0r.append(i2);
                } else {
                    String str = (String) obj;
                    if (str != null) {
                        String[] split = TextUtils.split(str, "\\|");
                        int length = split.length;
                        if (length == 2) {
                            return z2 ? split[1] : Integer.valueOf(C87604Xq.A00(split[0]));
                        }
                        A0r = AnonymousClass000.A0r("BloksFieldStatParser/parseValue/invalid enum format/length=");
                        A0r.append(length);
                    }
                }
                Log.d("Whatsapp", A0r.toString());
            } else if (obj instanceof Boolean) {
                return obj;
            } else {
                if (1 == AnonymousClass000.A0D(obj)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            }
        }
        return null;
    }
}
