package X;

import com.google.common.base.Strings;

/* renamed from: X.4ba  reason: invalid class name and case insensitive filesystem */
public abstract class C89094ba {
    public static final char[] A00 = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        if (!(obj instanceof C89094ba)) {
            return false;
        }
        byte[] bArr = ((C68183d1) this).bytes;
        int length = bArr.length;
        int i2 = length << 3;
        byte[] bArr2 = ((C68183d1) ((C89094ba) obj)).bytes;
        int length2 = bArr2.length;
        if (i2 != (length2 << 3) || length != length2) {
            return false;
        }
        boolean z2 = true;
        for (int i3 = 0; i3 < length; i3++) {
            z2 &= AnonymousClass000.A1R(bArr[i3], bArr2[i3]);
        }
        return z2;
    }

    public final int hashCode() {
        byte[] bArr = ((C68183d1) this).bytes;
        int length = bArr.length;
        if ((length << 3) < 32) {
            byte b2 = bArr[0] & 255;
            for (int i2 = 1; i2 < length; i2++) {
                b2 |= (bArr[i2] & 255) << (i2 << 3);
            }
            return b2;
        } else if (AnonymousClass3K3.A1P(length, 4)) {
            return ((bArr[3] & 255) << 24) | AnonymousClass3K3.A0M(bArr, 2, AnonymousClass3K3.A0L(bArr, 1, bArr[0] & 255));
        } else {
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, length, 0);
            throw AnonymousClass000.A0V(Strings.A00("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", objArr));
        }
    }

    public final String toString() {
        StringBuilder A0g = C13690nt.A0g(r5 << 1);
        for (byte b2 : ((C68183d1) this).bytes) {
            char[] cArr = A00;
            A0g.append(cArr[(b2 >> 4) & 15]);
            A0g.append(cArr[b2 & 15]);
        }
        return A0g.toString();
    }
}
