package com.obwhatsapp.emoji;

import X.AnonymousClass49Y;
import X.AnonymousClass49Z;
import X.C434520b;
import X.C816049a;
import X.C816149b;
import X.C816249c;
import java.util.Arrays;

public class EmojiDescriptor {
    public static long A00(C434520b r9, boolean z2) {
        long j2 = 0;
        do {
            int A00 = r9.A00();
            if (A00 == 0) {
                return AnonymousClass49Z.A00[(int) j2];
            }
            int i2 = (int) j2;
            int binarySearch = Arrays.binarySearch(AnonymousClass49Y.A00, C816249c.A00[i2], C816049a.A00[i2], A00);
            if (binarySearch >= 0) {
                j2 = C816149b.A00[binarySearch];
            } else if (!z2) {
                return AnonymousClass49Z.A00[i2];
            } else {
                return -1;
            }
        } while (j2 >= 0);
        if (z2) {
            if (r9.A00() != 0 || j2 == -1) {
                return -1;
            }
        } else if (j2 == -1) {
            return -1;
        }
        return -j2;
    }

    public static long getDescriptor(C434520b r1) {
        return A00(r1, false);
    }
}
