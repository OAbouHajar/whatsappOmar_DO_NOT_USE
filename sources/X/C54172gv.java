package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: X.2gv  reason: invalid class name and case insensitive filesystem */
public class C54172gv extends FilterOutputStream {
    public C54172gv(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(int i2) {
        write(new byte[]{(byte) i2});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        if (i3 < 16777216) {
            OutputStream outputStream = this.out;
            byte[] bArr2 = new byte[3];
            bArr2[2] = (byte) i3;
            bArr2[1] = (byte) (i3 >> 8);
            bArr2[0] = (byte) (i3 >> 16);
            outputStream.write(bArr2);
            this.out.write(bArr, i2, i3);
            this.out.flush();
            return;
        }
        StringBuilder sb = new StringBuilder("data too large to write; length=");
        sb.append(i3);
        throw new C48812Pf(sb.toString(), i3);
    }
}
