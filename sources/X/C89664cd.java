package X;

import java.util.regex.Pattern;

/* renamed from: X.4cd  reason: invalid class name and case insensitive filesystem */
public final class C89664cd {
    public static final Pattern A00 = Pattern.compile("^NOTE([ \t].*)?$");

    public static float A00(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long A01(String str) {
        String[] split = str.split("\\.", 2);
        long j2 = 0;
        for (String parseLong : split[0].split(":", -1)) {
            j2 = (j2 * 60) + Long.parseLong(parseLong);
        }
        long j3 = j2 * 1000;
        if (split.length == 2) {
            j3 += Long.parseLong(split[1]);
        }
        return j3 * 1000;
    }
}
