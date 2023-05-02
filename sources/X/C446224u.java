package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.OutputStream;

/* renamed from: X.24u  reason: invalid class name and case insensitive filesystem */
public final class C446224u extends CodedOutputStream {
    public int A00;
    public int A01;
    public final int A02;
    public final OutputStream A03;
    public final byte[] A04;

    public C446224u(OutputStream outputStream, int i2) {
        if (i2 >= 0) {
            int max = Math.max(i2, 20);
            this.A04 = new byte[max];
            this.A02 = max;
            if (outputStream != null) {
                this.A03 = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final void A0J() {
        this.A03.write(this.A04, 0, this.A00);
        this.A00 = 0;
    }

    public final void A0K(int i2) {
        byte[] bArr;
        int i3;
        int i4;
        byte[] bArr2;
        long j2;
        if (CodedOutputStream.A02) {
            long j3 = CodedOutputStream.A00 + ((long) this.A00);
            long j4 = j3;
            while (true) {
                int i5 = i2 & -128;
                bArr2 = this.A04;
                j2 = 1 + j4;
                if (i5 == 0) {
                    break;
                }
                UnsafeUtil.A00(bArr2, (byte) ((i2 & 127) | 128), j4);
                i2 >>>= 7;
                j4 = j2;
            }
            UnsafeUtil.A00(bArr2, (byte) i2, j4);
            int i6 = (int) (j2 - j3);
            this.A00 += i6;
            i4 = this.A01 + i6;
        } else {
            while (true) {
                int i7 = i2 & -128;
                bArr = this.A04;
                i3 = this.A00;
                this.A00 = i3 + 1;
                if (i7 == 0) {
                    break;
                }
                bArr[i3] = (byte) ((i2 & 127) | 128);
                this.A01++;
                i2 >>>= 7;
            }
            bArr[i3] = (byte) i2;
            i4 = this.A01 + 1;
        }
        this.A01 = i4;
    }

    public final void A0L(int i2) {
        if (this.A02 - this.A00 < i2) {
            A0J();
        }
    }

    public final void A0M(long j2) {
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        byte[] bArr2;
        long j3;
        int i5;
        long j4 = j2;
        if (CodedOutputStream.A02) {
            long j5 = CodedOutputStream.A00 + ((long) this.A00);
            long j6 = j5;
            while (true) {
                int i6 = ((j4 & -128) > 0 ? 1 : ((j4 & -128) == 0 ? 0 : -1));
                bArr2 = this.A04;
                j3 = 1 + j6;
                i5 = (int) j4;
                if (i6 == 0) {
                    break;
                }
                UnsafeUtil.A00(bArr2, (byte) ((i5 & 127) | 128), j6);
                j4 >>>= 7;
                j6 = j3;
            }
            UnsafeUtil.A00(bArr2, (byte) i5, j6);
            int i7 = (int) (j3 - j5);
            this.A00 += i7;
            i4 = this.A01 + i7;
        } else {
            while (true) {
                int i8 = ((j4 & -128) > 0 ? 1 : ((j4 & -128) == 0 ? 0 : -1));
                bArr = this.A04;
                i2 = this.A00;
                this.A00 = i2 + 1;
                i3 = (int) j4;
                if (i8 == 0) {
                    break;
                }
                bArr[i2] = (byte) ((i3 & 127) | 128);
                this.A01++;
                j4 >>>= 7;
            }
            bArr[i2] = (byte) i3;
            i4 = this.A01 + 1;
        }
        this.A01 = i4;
    }
}
