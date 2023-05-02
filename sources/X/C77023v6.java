package X;

import java.io.OutputStream;

/* renamed from: X.3v6  reason: invalid class name and case insensitive filesystem */
public class C77023v6 extends C88924bJ {
    public final byte[] A00;

    public C77023v6(int i2, byte[] bArr) {
        super(i2, (long) bArr.length);
        this.A00 = bArr;
    }

    public void A00(OutputStream outputStream) {
        super.A00(outputStream);
        outputStream.write(this.A00);
        outputStream.flush();
    }
}
