package X;

import java.util.Comparator;

/* renamed from: X.27Q  reason: invalid class name */
public class AnonymousClass27Q implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int length;
        int i2;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = bArr.length;
            if (i3 < length && i4 < bArr2.length) {
                length = bArr[i3] & 255;
                i2 = bArr2[i4] & 255;
                if (length != i2) {
                    break;
                }
                i3++;
                i4++;
            } else {
                i2 = bArr2.length;
            }
        }
        i2 = bArr2.length;
        return length - i2;
    }
}
