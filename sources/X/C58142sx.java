package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;

/* renamed from: X.2sx  reason: invalid class name and case insensitive filesystem */
public class C58142sx extends CodedOutputStream {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public C58142sx(byte[] bArr, int i2) {
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.A02 = bArr;
            this.A00 = 0;
            this.A01 = i2;
            return;
        }
        Object[] objArr = new Object[3];
        AnonymousClass000.A1M(objArr, length, 0);
        AnonymousClass000.A1M(objArr, 0, 1);
        AnonymousClass000.A1M(objArr, i2, 2);
        throw AnonymousClass000.A0T(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", objArr));
    }

    public final void A0J(long j2) {
        if (CodedOutputStream.A02) {
            int i2 = this.A01;
            int i3 = this.A00;
            if (i2 - i3 >= 10) {
                long j3 = CodedOutputStream.A00 + ((long) i3);
                while (true) {
                    int i4 = ((j2 & -128) > 0 ? 1 : ((j2 & -128) == 0 ? 0 : -1));
                    byte[] bArr = this.A02;
                    if (i4 == 0) {
                        UnsafeUtil.A00(bArr, (byte) ((int) j2), j3);
                        this.A00++;
                        return;
                    }
                    UnsafeUtil.A00(bArr, (byte) ((((int) j2) & 127) | 128), j3);
                    this.A00++;
                    j2 >>>= 7;
                    j3 = 1 + j3;
                }
            }
        }
        while ((j2 & -128) != 0) {
            try {
                byte[] bArr2 = this.A02;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                bArr2[i5] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                Object[] objArr = new Object[3];
                AnonymousClass000.A1M(objArr, this.A00, 0);
                AnonymousClass000.A1M(objArr, this.A01, 1);
                AnonymousClass000.A1M(objArr, 1, 2);
                throw new AnonymousClass40O(String.format("Pos: %d, limit: %d, len: %d", objArr), e2);
            }
        }
        byte[] bArr3 = this.A02;
        int i6 = this.A00;
        this.A00 = i6 + 1;
        bArr3[i6] = (byte) ((int) j2);
    }
}
