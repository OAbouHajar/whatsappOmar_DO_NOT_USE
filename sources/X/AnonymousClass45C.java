package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

@Deprecated
/* renamed from: X.45C  reason: invalid class name */
public final class AnonymousClass45C {
    @Deprecated
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C13710nw.A01(inputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
