package X;

import java.nio.ByteBuffer;

/* renamed from: X.3UU  reason: invalid class name */
public final class AnonymousClass3UU extends C96304o7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = AnonymousClass3C1.A0A;

    public ByteBuffer AE7() {
        int i2;
        if (super.AIm() && (i2 = this.A00) > 0) {
            ByteBuffer A002 = A00(i2);
            A002.put(this.A06, 0, this.A00);
            A002.flip();
            this.A00 = 0;
        }
        ByteBuffer byteBuffer = this.A05;
        this.A05 = C109765Tm.A00;
        return byteBuffer;
    }

    public boolean AIm() {
        return super.AIm() && this.A00 == 0;
    }

    public void AbH(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 != 0) {
            int i3 = this.A01;
            int min = Math.min(i2, i3);
            this.A04 += (long) (min / this.A00.A00);
            this.A01 = i3 - min;
            byteBuffer.position(position + min);
            if (this.A01 <= 0) {
                int i4 = i2 - min;
                int length = (this.A00 + i4) - this.A06.length;
                ByteBuffer A002 = A00(length);
                int A0C = AnonymousClass3K3.A0C(length, this.A00, 0);
                A002.put(this.A06, 0, A0C);
                int A0C2 = AnonymousClass3K3.A0C(length - A0C, i4, 0);
                byteBuffer.limit(byteBuffer.position() + A0C2);
                A002.put(byteBuffer);
                byteBuffer.limit(limit);
                int i5 = i4 - A0C2;
                int i6 = this.A00 - A0C;
                this.A00 = i6;
                byte[] bArr = this.A06;
                System.arraycopy(bArr, A0C, bArr, 0, i6);
                byteBuffer.get(this.A06, this.A00, i5);
                this.A00 += i5;
                A002.flip();
            }
        }
    }
}
