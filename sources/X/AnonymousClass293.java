package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.293  reason: invalid class name */
public class AnonymousClass293 {
    public static String A00(String str) {
        Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        StringBuilder sb = new StringBuilder();
        sb.append(group);
        sb.append(group2);
        return sb.toString();
    }
}
