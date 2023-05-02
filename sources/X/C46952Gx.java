package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2Gx  reason: invalid class name and case insensitive filesystem */
public class C46952Gx {
    public static final byte[] A01 = {71, 79, 65};
    public final InputStream A00;

    public C46952Gx(InputStream inputStream) {
        this.A00 = inputStream;
    }

    public final byte[] A00(int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i2 > 0) {
            int read = this.A00.read(bArr, i3, i2);
            if (read != -1) {
                i3 += read;
                i2 -= read;
            } else {
                throw new IOException("Closed before read completed!");
            }
        }
        return bArr;
    }
}
