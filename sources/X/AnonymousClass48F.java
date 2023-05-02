package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: X.48F  reason: invalid class name */
public final class AnonymousClass48F {
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
