package X;

import com.whatsapp.util.Log;

/* renamed from: X.29a  reason: invalid class name and case insensitive filesystem */
public final class C454929a {
    public static C33211iD A00(C33211iD r2) {
        if ((r2.A00 & 33554432) != 33554432) {
            return r2;
        }
        C58612tm r0 = r2.A0B;
        if (r0 == null) {
            r0 = C58612tm.A04;
        }
        C33211iD r22 = r0.A01;
        return r22 == null ? C33211iD.A0o : r22;
    }

    public static void A01(C30861d5 r1, C30841d3 r2, int i2) {
        if (r2 != null) {
            r2.A02 = false;
        }
        if (r1 != null) {
            r1.A00 = Boolean.FALSE;
            r1.A05 = Integer.valueOf(i2);
        }
    }

    public static byte[] A02(C30861d5 r4, C30841d3 r5, byte[] bArr) {
        int length;
        String str;
        if (bArr == null || (length = bArr.length) == 0) {
            Log.w("MessageUtil/removePadding/ axolotl derived null or empty plaintext from message");
            return null;
        }
        byte b2 = bArr[length - 1] & 255;
        if (b2 == 0) {
            str = "MessageUtil/removePadding/ axolotl derived plaintext has invalid padding";
        } else if (b2 >= length) {
            str = "MessageUtil/removePadding/ axolotl derived entire plaintext as padding";
        } else {
            int i2 = length - b2;
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            return bArr2;
        }
        Log.w(str);
        A01(r4, r5, 10);
        return null;
    }
}
