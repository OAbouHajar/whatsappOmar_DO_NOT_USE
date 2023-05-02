package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.3ZH  reason: invalid class name */
public final class AnonymousClass3ZH extends C32561ga {
    public long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final ByteBuffer A04;
    public final ByteBuffer A05;

    public AnonymousClass3ZH(ByteBuffer byteBuffer) {
        this.A04 = byteBuffer;
        this.A05 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long A052 = C90904f2.A02.A05(byteBuffer, C90904f2.A01);
        this.A01 = A052;
        long position = ((long) byteBuffer.position()) + A052;
        long limit = A052 + ((long) byteBuffer.limit());
        this.A02 = limit;
        this.A03 = limit - 10;
        this.A00 = position;
    }

    public static AnonymousClass40Q A04(long j2, long j3) {
        return new AnonymousClass40Q(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(j3), 1}));
    }

    public final void A05(byte[] bArr, int i2, int i3) {
        A0E(bArr, i2, i3);
    }

    public final void A06() {
        this.A04.position((int) (this.A00 - this.A01));
    }

    public final void A07(byte b2) {
        long j2 = this.A00;
        long j3 = this.A02;
        if (j2 < j3) {
            this.A00 = 1 + j2;
            C90904f2.A02.A07(j2, b2);
            return;
        }
        throw A04(j2, j3);
    }

    public final void A08(int i2) {
        long j2;
        if (this.A00 <= this.A03) {
            while (true) {
                int i3 = i2 & -128;
                j2 = this.A00;
                if (i3 == 0) {
                    break;
                }
                this.A00 = j2 + 1;
                C90904f2.A02.A07(j2, (byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
        } else {
            while (true) {
                j2 = this.A00;
                long j3 = this.A02;
                if (j2 < j3) {
                    if ((i2 & -128) == 0) {
                        break;
                    }
                    this.A00 = j2 + 1;
                    C90904f2.A02.A07(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                } else {
                    throw A04(j2, j3);
                }
            }
        }
        this.A00 = 1 + j2;
        C90904f2.A02.A07(j2, (byte) i2);
    }

    public final void A09(int i2) {
        this.A05.putInt((int) (this.A00 - this.A01), i2);
        this.A00 += 4;
    }

    public final void A0A(int i2, String str) {
        long j2;
        long j3;
        AnonymousClass3K3.A1A(this, i2);
        long j4 = this.A00;
        try {
            int length = str.length();
            int A002 = C32561ga.A00(length * 3);
            int A003 = C32561ga.A00(length);
            if (A003 == A002) {
                int i3 = ((int) (j4 - this.A01)) + A003;
                ByteBuffer byteBuffer = this.A05;
                byteBuffer.position(i3);
                C90324dx.A01(str, byteBuffer);
                int position = byteBuffer.position() - i3;
                A08(position);
                j2 = this.A00;
                j3 = (long) position;
            } else {
                int A004 = C90324dx.A00(str);
                A08(A004);
                long j5 = this.A00;
                ByteBuffer byteBuffer2 = this.A05;
                byteBuffer2.position((int) (j5 - this.A01));
                C90324dx.A01(str, byteBuffer2);
                j2 = this.A00;
                j3 = (long) A004;
            }
            this.A00 = j2 + j3;
        } catch (AnonymousClass442 e2) {
            this.A00 = j4;
            this.A05.position((int) (j4 - this.A01));
            A0D(e2, str);
        } catch (IllegalArgumentException e3) {
            throw new AnonymousClass40Q((Throwable) e3);
        } catch (IndexOutOfBoundsException e4) {
            throw new AnonymousClass40Q((Throwable) e4);
        }
    }

    public final void A0B(long j2) {
        long j3;
        if (this.A00 <= this.A03) {
            while (true) {
                int i2 = ((j2 & -128) > 0 ? 1 : ((j2 & -128) == 0 ? 0 : -1));
                j3 = this.A00;
                if (i2 == 0) {
                    break;
                }
                this.A00 = j3 + 1;
                C90904f2.A02.A07(j3, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
        } else {
            while (true) {
                j3 = this.A00;
                long j4 = this.A02;
                if (j3 < j4) {
                    if ((j2 & -128) == 0) {
                        break;
                    }
                    this.A00 = j3 + 1;
                    C90904f2.A02.A07(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                } else {
                    throw A04(j3, j4);
                }
            }
        }
        this.A00 = 1 + j3;
        C90904f2.A02.A07(j3, (byte) ((int) j2));
    }

    public final void A0C(long j2) {
        this.A05.putLong((int) (this.A00 - this.A01), j2);
        this.A00 += 8;
    }

    public final void A0E(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = bArr;
        if (bArr != null) {
            if (i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = (long) i3;
                long j3 = this.A00;
                if (this.A02 - j2 >= j3) {
                    C90904f2.A02.A0E(bArr2, (long) i2, j3, j2);
                    this.A00 += j2;
                    return;
                }
            }
            Object[] objArr = new Object[3];
            C13690nt.A1Q(objArr, 0, this.A00);
            C13690nt.A1Q(objArr, 1, this.A02);
            AnonymousClass000.A1M(objArr, i3, 2);
            throw new AnonymousClass40Q(String.format("Pos: %d, limit: %d, len: %d", objArr));
        }
        throw AnonymousClass000.A0W("value");
    }
}
