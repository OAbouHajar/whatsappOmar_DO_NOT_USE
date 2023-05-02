package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Wx  reason: invalid class name and case insensitive filesystem */
public class C28641Wx {
    public static int A00(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int A01(byte[] bArr) {
        return (bArr[2] & 255) | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static byte[] A02(int i2) {
        byte[] bArr = new byte[4];
        bArr[3] = (byte) i2;
        bArr[2] = (byte) (i2 >> 8);
        bArr[1] = (byte) (i2 >> 16);
        bArr[0] = (byte) (i2 >> 24);
        return bArr;
    }

    public static byte[] A03(Collection collection) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write((byte[]) it.next());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static byte[] A04(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] write : bArr) {
                byteArrayOutputStream.write(write);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static byte[][] A05(byte[] bArr, int i2, int i3) {
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = new byte[i2];
        System.arraycopy(bArr, 0, bArr2[0], 0, i2);
        bArr2[1] = new byte[i3];
        System.arraycopy(bArr, i2, bArr2[1], 0, i3);
        return bArr2;
    }

    public static byte[][] A06(byte[] bArr, int i2, int i3, int i4) {
        if (i3 >= 0 && i4 >= 0) {
            int i5 = i2 + i3;
            if (bArr.length >= i5 + i4) {
                byte[][] bArr2 = new byte[3][];
                bArr2[0] = new byte[i2];
                System.arraycopy(bArr, 0, bArr2[0], 0, i2);
                bArr2[1] = new byte[i3];
                System.arraycopy(bArr, i2, bArr2[1], 0, i3);
                bArr2[2] = new byte[i4];
                System.arraycopy(bArr, i5, bArr2[2], 0, i4);
                return bArr2;
            }
        }
        StringBuilder sb = new StringBuilder("Input too small: ");
        sb.append(C87794Yp.A00(bArr));
        throw new ParseException(sb.toString(), 0);
    }
}
