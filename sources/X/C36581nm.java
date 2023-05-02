package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;

/* renamed from: X.1nm  reason: invalid class name and case insensitive filesystem */
public class C36581nm {
    public static byte[] A00(byte[]... bArr) {
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

    public static byte[][] A01(byte[] bArr, int i2, int i3) {
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = new byte[i2];
        System.arraycopy(bArr, 0, bArr2[0], 0, i2);
        bArr2[1] = new byte[i3];
        System.arraycopy(bArr, i2, bArr2[1], 0, i3);
        return bArr2;
    }

    public static byte[][] A02(byte[] bArr, int i2, int i3, int i4) {
        String obj;
        if (bArr != null && i3 >= 0) {
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
        if (bArr == null) {
            obj = null;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : bArr) {
                stringBuffer.append("(byte)0x");
                char[] cArr = AnonymousClass4AP.A00;
                stringBuffer.append(cArr[(b2 >> 4) & 15]);
                stringBuffer.append(cArr[b2 & 15]);
                stringBuffer.append(", ");
            }
            obj = stringBuffer.toString();
        }
        sb.append(obj);
        throw new ParseException(sb.toString(), 0);
    }
}
