package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.4Xz  reason: invalid class name and case insensitive filesystem */
public class C87654Xz {
    public static C88924bJ A00(InputStream inputStream) {
        byte[] bArr = new byte[16];
        if (inputStream.read(bArr) != -1) {
            return new C88924bJ(ByteBuffer.wrap(bArr, 0, 4).getInt(), ByteBuffer.wrap(bArr, 4, 8).getLong(), ByteBuffer.wrap(bArr, 12, 4).getInt());
        }
        throw AnonymousClass3K3.A0e("No bytes to read");
    }

    public static void A01(C88924bJ r0, OutputStream outputStream) {
        r0.A00(outputStream);
    }
}
