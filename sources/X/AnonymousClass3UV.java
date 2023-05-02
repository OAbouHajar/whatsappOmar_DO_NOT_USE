package X;

import java.nio.ByteBuffer;

/* renamed from: X.3UV  reason: invalid class name */
public final class AnonymousClass3UV extends C96304o7 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;

    public AnonymousClass3UV() {
        byte[] bArr = AnonymousClass3C1.A0A;
        this.A07 = bArr;
        this.A08 = bArr;
    }

    public final void A01(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int remaining = byteBuffer.remaining();
        int i3 = this.A02;
        int min = Math.min(remaining, i3);
        int i4 = i3 - min;
        System.arraycopy(bArr, i2 - i4, this.A08, 0, i4);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.A08, i4, min);
    }

    public final void A02(byte[] bArr, int i2) {
        ByteBuffer A002 = A00(i2);
        A002.put(bArr, 0, i2);
        A002.flip();
        if (i2 > 0) {
            this.A06 = true;
        }
    }

    public void AbH(ByteBuffer byteBuffer) {
        int position;
        int limit;
        long j2;
        int i2;
        int limit2;
        while (byteBuffer.hasRemaining() && !this.A05.hasRemaining()) {
            int i3 = this.A03;
            if (i3 == 0) {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.A07.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit4)) > 1024) {
                            int i4 = this.A00;
                            position = ((limit4 / i4) * i4) + i4;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.A03 = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    ByteBuffer A002 = A00(remaining);
                    A002.put(byteBuffer);
                    A002.flip();
                    if (remaining > 0) {
                        this.A06 = true;
                    }
                }
                byteBuffer.limit(limit3);
            } else if (i3 != 1) {
                int limit5 = byteBuffer.limit();
                int position2 = byteBuffer.position();
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit2 = byteBuffer.limit();
                        break;
                    } else if (Math.abs(byteBuffer.getShort(position2)) > 1024) {
                        int i5 = this.A00;
                        limit2 = i5 * (position2 / i5);
                        break;
                    } else {
                        position2 += 2;
                    }
                }
                byteBuffer.limit(limit2);
                this.A04 += (long) (byteBuffer.remaining() / this.A00);
                A01(byteBuffer, this.A08, this.A02);
                if (limit2 < limit5) {
                    A02(this.A08, this.A02);
                    this.A03 = 0;
                    byteBuffer.limit(limit5);
                }
            } else {
                int limit6 = byteBuffer.limit();
                int position3 = byteBuffer.position();
                while (true) {
                    if (position3 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else if (Math.abs(byteBuffer.getShort(position3)) > 1024) {
                        int i6 = this.A00;
                        limit = i6 * (position3 / i6);
                        break;
                    } else {
                        position3 += 2;
                    }
                }
                int position4 = limit - byteBuffer.position();
                byte[] bArr = this.A07;
                int length = bArr.length;
                int i7 = this.A01;
                int i8 = length - i7;
                if (limit >= limit6 || position4 >= i8) {
                    int min = Math.min(position4, i8);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.A07, this.A01, min);
                    int i9 = this.A01 + min;
                    this.A01 = i9;
                    byte[] bArr2 = this.A07;
                    if (i9 == bArr2.length) {
                        if (this.A06) {
                            A02(bArr2, this.A02);
                            j2 = this.A04;
                            i9 = this.A01;
                            i2 = this.A02 << 1;
                        } else {
                            j2 = this.A04;
                            i2 = this.A02;
                        }
                        this.A04 = j2 + ((long) ((i9 - i2) / this.A00));
                        A01(byteBuffer, this.A07, i9);
                        this.A01 = 0;
                        this.A03 = 2;
                    }
                    byteBuffer.limit(limit6);
                } else {
                    A02(bArr, i7);
                    this.A01 = 0;
                    this.A03 = 0;
                }
            }
        }
    }
}
