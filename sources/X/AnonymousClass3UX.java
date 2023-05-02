package X;

import java.nio.ByteBuffer;

/* renamed from: X.3UX  reason: invalid class name */
public class AnonymousClass3UX extends AnonymousClass4XM {
    public long A00;
    public ByteBuffer A01;
    public ByteBuffer A02;
    public boolean A03;
    public final int A04;
    public final AnonymousClass4OQ A05 = new AnonymousClass4OQ();

    public AnonymousClass3UX(int i2) {
        this.A04 = i2;
    }

    public final void A00() {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.A02;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void A01(int i2) {
        ByteBuffer allocateDirect;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            int i3 = this.A04;
            if (i3 == 1) {
                allocateDirect = ByteBuffer.allocate(i2);
            } else if (i3 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i2);
            } else {
                throw new AnonymousClass447(0, i2);
            }
        } else {
            int capacity = byteBuffer.capacity();
            int position = byteBuffer.position();
            int i4 = i2 + position;
            if (capacity >= i4) {
                this.A01 = byteBuffer;
                return;
            }
            int i5 = this.A04;
            if (i5 == 1) {
                allocateDirect = ByteBuffer.allocate(i4);
            } else if (i5 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i4);
            } else {
                ByteBuffer byteBuffer2 = this.A01;
                throw new AnonymousClass447(byteBuffer2 == null ? 0 : byteBuffer2.capacity(), i4);
            }
            allocateDirect.order(byteBuffer.order());
            if (position > 0) {
                byteBuffer.flip();
                allocateDirect.put(byteBuffer);
            }
        }
        this.A01 = allocateDirect;
    }

    public void clear() {
        this.flags = 0;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.A02;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.A03 = false;
    }
}
