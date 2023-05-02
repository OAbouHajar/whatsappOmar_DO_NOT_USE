package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.4eP  reason: invalid class name and case insensitive filesystem */
public class C90584eP {
    public static final AnonymousClass5AL A00 = new AnonymousClass5AL();

    public static String A00(byte[] bArr) {
        return C32941ha.A02(A03(bArr, 0, bArr.length));
    }

    public static byte[] A01(String str) {
        try {
            return A00.A00(str, 0, str.length());
        } catch (Exception e2) {
            throw new AnonymousClass449(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("exception decoding Hex string: ")), e2);
        }
    }

    public static byte[] A02(String str, int i2) {
        try {
            return A00.A00(str, 1, i2);
        } catch (Exception e2) {
            throw new AnonymousClass449(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("exception decoding Hex string: ")), e2);
        }
    }

    public static byte[] A03(byte[] bArr, int i2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            A00.A8N(byteArrayOutputStream, bArr, i2, i3);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            throw new AnonymousClass44A(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("exception encoding Hex string: ")), e2);
        }
    }
}
