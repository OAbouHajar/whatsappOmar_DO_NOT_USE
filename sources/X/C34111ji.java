package X;

import android.text.TextUtils;
import java.util.Collections;

/* renamed from: X.1ji  reason: invalid class name and case insensitive filesystem */
public class C34111ji {
    public static String A00(int i2) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(TextUtils.join(",", Collections.nCopies(i2, "?")));
        sb.append(")");
        return sb.toString();
    }

    public static String A01(String str, String str2) {
        String[] split = str2.replaceAll(" ", "").split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            String str3 = split[i2];
            sb.append(str3);
            sb.append(" AS ");
            sb.append(str3);
            split[i2] = sb.toString();
        }
        return TextUtils.join(", ", split);
    }
}
