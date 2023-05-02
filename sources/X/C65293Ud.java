package X;

import java.nio.ByteBuffer;

/* renamed from: X.3Ud  reason: invalid class name and case insensitive filesystem */
public final class C65293Ud extends AnonymousClass3UX {
    public int A00 = 32;
    public int A01;
    public long A02;

    public C65293Ud() {
        super(2);
    }

    public boolean A02(AnonymousClass3UX r5) {
        ByteBuffer byteBuffer;
        C90524eJ.A03(!AnonymousClass000.A1R(r5.flags & 1073741824, 1073741824));
        C90524eJ.A03(!AnonymousClass000.A1R(r5.flags & 268435456, 268435456));
        C90524eJ.A03(!AnonymousClass4XM.A00(r5));
        int i2 = this.A01;
        if (i2 > 0) {
            if (i2 >= this.A00 || AnonymousClass000.A1R(r5.flags & Integer.MIN_VALUE, Integer.MIN_VALUE) != AnonymousClass000.A1R(this.flags & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = r5.A01;
            if (!(byteBuffer2 == null || (byteBuffer = this.A01) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        if (i3 == 0) {
            this.A00 = r5.A00;
            if (AnonymousClass000.A1R(r5.flags & 1, 1)) {
                this.flags = 1;
            }
        }
        if (AnonymousClass000.A1R(r5.flags & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.flags = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = r5.A01;
        if (byteBuffer3 != null) {
            A01(byteBuffer3.remaining());
            this.A01.put(byteBuffer3);
        }
        this.A02 = r5.A00;
        return true;
    }

    public void clear() {
        super.clear();
        this.A01 = 0;
    }
}
