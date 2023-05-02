package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.03c  reason: invalid class name and case insensitive filesystem */
public final class C006803c extends ByteArrayOutputStream {
    public C006803c(int i2) {
        super(i2);
    }

    public byte[] toByteArray() {
        int i2 = this.count;
        byte[] bArr = this.buf;
        return i2 == bArr.length ? bArr : super.toByteArray();
    }
}
