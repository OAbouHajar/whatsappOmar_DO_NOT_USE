package X;

import com.google.protobuf.UnsafeUtil;

/* renamed from: X.4YV  reason: invalid class name */
public final class AnonymousClass4YV {
    public static final AnonymousClass4PO A00 = ((!UnsafeUtil.A02 || !UnsafeUtil.A03) ? new C69653fO() : new C69663fP());

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                int i4 = 0;
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new AnonymousClass444(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i4;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AnonymousClass000.A0T(C13680ns.A0j(AnonymousClass000.A0r("UTF-8 length does not fit in int: "), ((long) i3) + 4294967296L));
    }
}
