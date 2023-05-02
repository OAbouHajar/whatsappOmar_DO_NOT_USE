package X;

import java.util.Random;

/* renamed from: X.033  reason: invalid class name */
public class AnonymousClass033 {
    public static final Random A00 = new Random();

    public static String A00(long j2) {
        if (j2 < 0) {
            StringBuilder sb = new StringBuilder("Cannot internalEncode negative integer ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        } else if (j2 <= (1 << Math.min(63, 66)) - 1) {
            StringBuilder sb2 = new StringBuilder();
            int i2 = 0;
            do {
                sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((int) (j2 % 64)));
                j2 >>= 6;
                i2++;
            } while (i2 < 11);
            if (j2 <= 0) {
                sb2.reverse();
                return sb2.toString();
            }
            throw new IllegalArgumentException("Number won't fit in string");
        } else {
            StringBuilder sb3 = new StringBuilder("Cannot internalEncode integer ");
            sb3.append(j2);
            sb3.append(" in ");
            sb3.append(11);
            sb3.append(" chars");
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
