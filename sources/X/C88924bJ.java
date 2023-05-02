package X;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.4bJ  reason: invalid class name and case insensitive filesystem */
public class C88924bJ {
    public final int A00;
    public final int A01;
    public final long A02;

    public C88924bJ(int i2, long j2) {
        this.A01 = i2;
        this.A02 = j2;
        this.A00 = 0;
    }

    public C88924bJ(int i2, long j2, int i3) {
        this.A01 = i2;
        this.A02 = j2;
        this.A00 = i3;
    }

    public void A00(OutputStream outputStream) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putInt(this.A01);
        allocate.putLong(4, this.A02);
        allocate.putInt(12, this.A00);
        outputStream.write(allocate.array());
        outputStream.flush();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FpmMessage{type=");
        A0r.append(this.A01);
        A0r.append(", length=");
        A0r.append(this.A02);
        A0r.append(", errorCode=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}
