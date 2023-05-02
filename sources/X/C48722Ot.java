package X;

/* renamed from: X.2Ot  reason: invalid class name and case insensitive filesystem */
public class C48722Ot {
    public static final byte[][] A00;

    static {
        byte[][] bArr = new byte[3][];
        A00 = bArr;
        bArr[0] = new byte[]{87, 65, 77, 3};
        bArr[1] = new byte[]{87, 65, 77, 4};
        bArr[2] = new byte[]{87, 65, 77, 5};
    }

    public static byte[] A00(int i2) {
        if (i2 >= 0) {
            byte[][] bArr = A00;
            if (i2 <= bArr.length - 1) {
                return bArr[i2];
            }
        }
        StringBuilder sb = new StringBuilder("Invalid version: ");
        sb.append(i2);
        throw new RuntimeException(sb.toString());
    }
}
