package X;

import java.nio.ByteBuffer;

/* renamed from: X.3UT  reason: invalid class name */
public final class AnonymousClass3UT extends C96304o7 {
    public int[] A00;
    public int[] A01;

    public void AbH(ByteBuffer byteBuffer) {
        int[] iArr = this.A00;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer A002 = A00(((limit - position) / this.A00.A00) * this.A01.A00);
        while (position < limit) {
            for (int i2 : iArr) {
                A002.putShort(byteBuffer.getShort((i2 << 1) + position));
            }
            position += this.A00.A00;
        }
        byteBuffer.position(limit);
        A002.flip();
    }
}
