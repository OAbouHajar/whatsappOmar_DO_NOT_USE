package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.40Z  reason: invalid class name */
public class AnonymousClass40Z extends InputStream implements AnonymousClass5Q1 {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public byte[] A03 = new byte[1024];

    public synchronized void A00() {
        this.A00 = this.A02;
    }

    public void A4z(byte[] bArr, int i2, int i3) {
        String str;
        int i4;
        byte[] bArr2 = this.A03;
        if (bArr2 == null) {
            str = "Stream is closed.";
        } else if (i3 == 0) {
            return;
        } else {
            if (i3 <= bArr.length) {
                int i5 = this.A02;
                int i6 = this.A01;
                if (i5 == i6 && this.A00 == -1) {
                    this.A01 = 0;
                    i6 = 0;
                    this.A02 = 0;
                    i5 = 0;
                }
                int i7 = i4 + i3;
                int length = bArr2.length;
                if (i7 > length) {
                    int i8 = this.A00;
                    int i9 = i4 - i8;
                    int i10 = i9;
                    if (i8 == -1) {
                        i9 = i4 - i5;
                    }
                    int i11 = length - i9;
                    if (i11 < i3) {
                        length += ((int) Math.ceil(((double) (i3 - i11)) / 1024.0d)) << 10;
                    }
                    byte[] bArr3 = new byte[length];
                    if (i8 == -1) {
                        i4 -= i5;
                        System.arraycopy(bArr2, i5, bArr3, 0, i4);
                        this.A02 = 0;
                        this.A01 = i4;
                        this.A00 = -1;
                    } else {
                        System.arraycopy(bArr2, i8, bArr3, 0, i10);
                        int i12 = this.A02;
                        int i13 = this.A00;
                        this.A02 = i12 - i13;
                        i4 = this.A01 - i13;
                        this.A01 = i4;
                        this.A00 = 0;
                    }
                    this.A03 = bArr3;
                    bArr2 = bArr3;
                }
                System.arraycopy(bArr, 0, bArr2, i4, i3);
                this.A01 += i3;
                return;
            }
            StringBuilder A0r = AnonymousClass000.A0r("Len ");
            A0r.append(i3);
            str = AnonymousClass000.A0h(" exceeds supplied buffer limits.", A0r);
        }
        throw AnonymousClass3K3.A0e(str);
    }

    public int available() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A01 - this.A02;
    }

    public void close() {
        if (this.A03 != null) {
            super.close();
            this.A03 = null;
            this.A01 = 0;
            this.A02 = 0;
            this.A00 = -1;
            return;
        }
        throw AnonymousClass3K3.A0e("Stream is already closed.");
    }

    public synchronized void mark(int i2) {
        A00();
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw AnonymousClass3K3.A0e("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) ((short) (bArr[0] & 255));
        } else {
            return -1;
        }
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw AnonymousClass3K3.A0e("Dst buffer is null");
    }

    public int read(byte[] bArr, int i2, int i3) {
        String str;
        if (bArr == null) {
            str = "Dst buffer is null";
        } else if (i3 == 0) {
            return i3;
        } else {
            if (i2 + i3 <= bArr.length) {
                int available = available();
                if (available < 1) {
                    return available;
                }
                int min = Math.min(available, i3);
                System.arraycopy(this.A03, this.A02, bArr, i2, min);
                this.A02 += min;
                return min;
            }
            str = "Not enough space in destination buffer.";
        }
        throw AnonymousClass3K3.A0e(str);
    }

    public synchronized void reset() {
        IOException iOException;
        if (this.A03 != null) {
            int i2 = this.A00;
            if (i2 != -1) {
                this.A02 = i2;
                this.A00 = -1;
            } else {
                iOException = AnonymousClass3K3.A0e("No marked position found.");
            }
        } else {
            iOException = AnonymousClass3K3.A0e("Stream is closed.");
        }
        throw iOException;
    }

    public long skip(long j2) {
        if (this.A03 == null) {
            throw AnonymousClass3K3.A0e("Stream is closed.");
        } else if (j2 <= 0) {
            return 0;
        } else {
            long j3 = ((long) this.A02) + j2;
            int i2 = this.A01;
            if (j3 >= ((long) i2)) {
                int available = available();
                this.A02 = i2;
                return (long) available;
            }
            this.A02 = (int) j3;
            return j2;
        }
    }
}
