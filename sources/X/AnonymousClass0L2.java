package X;

import android.content.res.Configuration;

/* renamed from: X.0L2  reason: invalid class name */
public class AnonymousClass0L2 {
    public static void A00(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i2 = configuration.colorMode & 3;
        int i3 = configuration2.colorMode & 3;
        if (i2 != i3) {
            configuration3.colorMode |= i3;
        }
        int i4 = configuration.colorMode & 12;
        int i5 = configuration2.colorMode & 12;
        if (i4 != i5) {
            configuration3.colorMode |= i5;
        }
    }
}
