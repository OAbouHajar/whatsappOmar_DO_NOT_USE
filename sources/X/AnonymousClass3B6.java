package X;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* renamed from: X.3B6  reason: invalid class name */
public class AnonymousClass3B6 {
    public final int A00;
    public final short A01;
    public final String[] A02;

    public AnonymousClass3B6(String[] strArr, int i2, short s2) {
        this.A02 = strArr;
        this.A01 = s2;
        this.A00 = i2;
    }

    public static AnonymousClass3B6 A00(byte[] bArr, int i2) {
        String str;
        short s2;
        int i3;
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 1) {
                ArrayList A0u = AnonymousClass000.A0u();
                StringBuilder A0o = AnonymousClass000.A0o();
                int i4 = i2;
                while (true) {
                    if (bArr[i4] != 0 && (bArr[i4] & 192) == 0) {
                        byte b2 = (byte) (bArr[i4] & 63);
                        int i5 = i4 + 1;
                        i4 = i5 + b2;
                        if (length < i4 + 1) {
                            str = "bytes is incomplete";
                            break;
                        }
                        A0o.setLength(0);
                        for (byte b3 = 0; b3 < b2; b3 = (byte) (b3 + 1)) {
                            A0o.append((char) bArr[i5 + b3]);
                        }
                        A0u.add(A0o.toString());
                    } else {
                        byte b4 = bArr[i4];
                    }
                }
                byte b42 = bArr[i4];
                if (b42 == 0) {
                    i3 = i4 + 1;
                    s2 = 0;
                } else {
                    s2 = (short) (((((byte) (b42 & 63)) << 8) & 65280) | (bArr[i4 + 1] & 255));
                    i3 = i4 + 2;
                }
                return new AnonymousClass3B6((String[]) A0u.toArray(new String[0]), i3 - i2, s2);
            }
            str = "insufficient data";
            throw AnonymousClass000.A0T(str);
        }
        throw AnonymousClass000.A0W("bytes may not be null");
    }

    public static AnonymousClass3B6 A01(String[] strArr) {
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            try {
                int length2 = strArr[i2].getBytes(AnonymousClass01S.A08).length;
                if (length2 <= 63) {
                    i3 += length2 + 1;
                    i2++;
                } else {
                    throw AnonymousClass000.A0V("token may not be longer than 63 bytes");
                }
            } catch (UnsupportedEncodingException e2) {
                throw new Error(e2);
            }
        }
        return new AnonymousClass3B6(strArr, i3 + 1, 0);
    }

    public void A02(OutputStream outputStream) {
        String[] strArr = this.A02;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte[] bytes = strArr[i2].getBytes(AnonymousClass01S.A08);
            int length2 = bytes.length;
            if (length2 <= 63) {
                outputStream.write(length2);
                outputStream.write(bytes);
                i2++;
            } else {
                throw AnonymousClass000.A0V("token may not be longer than 63 bytes");
            }
        }
        short s2 = this.A01;
        if (s2 != 0) {
            outputStream.write(((s2 >>> 8) & 63) | 192);
            outputStream.write(s2 & 255);
            return;
        }
        outputStream.write(0);
    }
}
