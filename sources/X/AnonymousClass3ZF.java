package X;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.3ZF  reason: invalid class name */
public final class AnonymousClass3ZF extends C32561ga {
    public final ByteBuffer A00;
    public final ByteBuffer A01;

    public AnonymousClass3ZF(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
        this.A01 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void A05(byte[] bArr, int i2, int i3) {
        A0E(bArr, i2, i3);
    }

    public final void A06() {
        this.A00.position(this.A01.position());
    }

    public final void A07(byte b2) {
        try {
            this.A01.put(b2);
        } catch (BufferOverflowException e2) {
            throw new AnonymousClass40Q((Throwable) e2);
        }
    }

    public final void A08(int i2) {
        while ((i2 & -128) != 0) {
            try {
                this.A01.put((byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            } catch (BufferOverflowException e2) {
                throw new AnonymousClass40Q((Throwable) e2);
            }
        }
        this.A01.put((byte) i2);
    }

    public final void A09(int i2) {
        try {
            this.A01.putInt(i2);
        } catch (BufferOverflowException e2) {
            throw new AnonymousClass40Q((Throwable) e2);
        }
    }

    public final void A0A(int i2, String str) {
        AnonymousClass40Q r1;
        AnonymousClass3K3.A1A(this, i2);
        ByteBuffer byteBuffer = this.A01;
        int position = byteBuffer.position();
        try {
            int length = str.length();
            int A002 = C32561ga.A00(length * 3);
            int A003 = C32561ga.A00(length);
            if (A003 == A002) {
                int position2 = byteBuffer.position() + A003;
                byteBuffer.position(position2);
                try {
                    C90324dx.A01(str, byteBuffer);
                    int position3 = byteBuffer.position();
                    byteBuffer.position(position);
                    A08(position3 - position2);
                    byteBuffer.position(position3);
                } catch (IndexOutOfBoundsException e2) {
                    r1 = new AnonymousClass40Q((Throwable) e2);
                    throw r1;
                }
            } else {
                A08(C90324dx.A00(str));
                try {
                    C90324dx.A01(str, byteBuffer);
                } catch (IndexOutOfBoundsException e3) {
                    r1 = new AnonymousClass40Q((Throwable) e3);
                    throw r1;
                }
            }
        } catch (AnonymousClass442 e4) {
            byteBuffer.position(position);
            A0D(e4, str);
        } catch (IllegalArgumentException e5) {
            throw new AnonymousClass40Q((Throwable) e5);
        }
    }

    public final void A0B(long j2) {
        while ((-128 & j2) != 0) {
            try {
                this.A01.put((byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            } catch (BufferOverflowException e2) {
                throw new AnonymousClass40Q((Throwable) e2);
            }
        }
        this.A01.put((byte) ((int) j2));
    }

    public final void A0C(long j2) {
        try {
            this.A01.putLong(j2);
        } catch (BufferOverflowException e2) {
            throw new AnonymousClass40Q((Throwable) e2);
        }
    }

    public final void A0E(byte[] bArr, int i2, int i3) {
        try {
            this.A01.put(bArr, i2, i3);
        } catch (IndexOutOfBoundsException e2) {
            throw new AnonymousClass40Q((Throwable) e2);
        } catch (BufferOverflowException e3) {
            throw new AnonymousClass40Q((Throwable) e3);
        }
    }
}
