package okio;

import a.a;

/* compiled from: XFMFile */
public final class Utf8 {
    public static long size(String str) {
        return size(str, 0, str.length());
    }

    public static long size(String str, int i2, int i3) {
        long j2;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalArgumentException(a.d("beginIndex < 0: ", i2));
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 <= str.length()) {
            long j3 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    j3++;
                } else {
                    if (charAt < 2048) {
                        j2 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        j2 = 3;
                    } else {
                        int i4 = i2 + 1;
                        char charAt2 = i4 < i3 ? str.charAt(i4) : 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j3++;
                            i2 = i4;
                        } else {
                            j3 += 4;
                            i2 += 2;
                        }
                    }
                    j3 += j2;
                }
                i2++;
            }
            return j3;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
    }
}
