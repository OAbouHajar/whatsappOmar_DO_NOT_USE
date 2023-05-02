package X;

import java.nio.ByteBuffer;

/* renamed from: X.3ZE  reason: invalid class name */
public final class AnonymousClass3ZE extends AnonymousClass3ZG {
    public int A00;
    public final ByteBuffer A01;

    public AnonymousClass3ZE(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.A01 = byteBuffer;
        this.A00 = byteBuffer.position();
    }
}
