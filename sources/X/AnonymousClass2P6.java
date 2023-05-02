package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2P6  reason: invalid class name */
public class AnonymousClass2P6 extends ByteArrayOutputStream {
    public final ByteBuffer A00() {
        ByteBuffer wrap = ByteBuffer.wrap(this.buf, 0, size());
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.asReadOnlyBuffer();
    }

    public final byte[] A01() {
        return this.buf;
    }
}
