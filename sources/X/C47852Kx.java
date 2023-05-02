package X;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2Kx  reason: invalid class name and case insensitive filesystem */
public final class C47852Kx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final InputStream A07;
    public final byte[] A08;

    public C47852Kx(InputStream inputStream) {
        this.A03 = Integer.MAX_VALUE;
        this.A08 = new byte[4096];
        this.A00 = 0;
        this.A06 = 0;
        this.A07 = inputStream;
    }

    public C47852Kx(byte[] bArr, int i2, int i3) {
        this.A03 = Integer.MAX_VALUE;
        this.A08 = bArr;
        this.A01 = i3 + i2;
        this.A00 = i2;
        this.A06 = -i2;
        this.A07 = null;
    }

    public int A00() {
        int i2 = this.A03;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.A06 + this.A00);
    }

    public int A01() {
        int i2 = this.A00;
        if (this.A01 - i2 < 4) {
            A0E(4);
            i2 = this.A00;
        }
        byte[] bArr = this.A08;
        this.A00 = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02() {
        /*
            r5 = this;
            int r0 = r5.A00
            int r1 = r5.A01
            if (r1 == r0) goto L_0x003c
            byte[] r4 = r5.A08
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x005d
            r5.A00 = r2
            return r3
        L_0x0011:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
        L_0x003c:
            long r1 = r5.A07()
            int r0 = (int) r1
            return r0
        L_0x0042:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x004f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x004d:
            r1 = r2
            goto L_0x006d
        L_0x004f:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0011
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x006d
        L_0x005d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x003c
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x006d:
            r5.A00 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47852Kx.A02():int");
    }

    public int A03() {
        if (this.A00 != this.A01 || A0G(1)) {
            int A022 = A02();
            this.A04 = A022;
            if ((A022 >>> 3) != 0) {
                return A022;
            }
            throw new C29791bD("Protocol message contained an invalid tag (zero).");
        }
        this.A04 = 0;
        return 0;
    }

    public int A04(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.A06 + this.A00;
            int i4 = this.A03;
            if (i3 <= i4) {
                this.A03 = i3;
                A0B();
                return i4;
            }
            throw new C29791bD("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C29791bD("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public long A05() {
        int i2 = this.A00;
        if (this.A01 - i2 < 8) {
            A0E(8);
            i2 = this.A00;
        }
        byte[] bArr = this.A08;
        this.A00 = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (((long) r6[r5]) < 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06() {
        /*
            r10 = this;
            int r0 = r10.A00
            int r3 = r10.A01
            if (r3 == r0) goto L_0x002f
            byte[] r6 = r10.A08
            int r2 = r0 + 1
            byte r1 = r6[r0]
            if (r1 < 0) goto L_0x0072
            r10.A00 = r2
            long r0 = (long) r1
            return r0
        L_0x0012:
            int r5 = r7 + 1
            byte r0 = r6[r7]
            long r1 = (long) r0
            r0 = 56
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r0 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r7 = r5
            if (r0 >= 0) goto L_0x0047
            int r7 = r5 + 1
            byte r0 = r6[r5]
            long r1 = (long) r0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
        L_0x002f:
            long r0 = r10.A07()
            return r0
        L_0x0034:
            int r7 = r5 + 1
            byte r0 = r6[r5]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0046:
            long r3 = r3 ^ r0
        L_0x0047:
            r0 = r3
            goto L_0x0083
        L_0x0049:
            int r5 = r7 + 1
            byte r0 = r6[r7]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00a2
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x006f
        L_0x005c:
            long r3 = (long) r1
            int r5 = r7 + 1
            byte r0 = r6[r7]
            long r1 = (long) r0
            r0 = 28
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x006f:
            long r0 = r0 ^ r3
            r7 = r5
            goto L_0x0083
        L_0x0072:
            int r3 = r3 - r2
            r0 = 9
            if (r3 < r0) goto L_0x002f
            int r7 = r2 + 1
            byte r0 = r6[r2]
            int r0 = r0 << 7
            r1 = r1 ^ r0
            if (r1 >= 0) goto L_0x0086
            r1 = r1 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0082:
            long r0 = (long) r1
        L_0x0083:
            r10.A00 = r7
            return r0
        L_0x0086:
            int r2 = r7 + 1
            byte r0 = r6[r7]
            int r0 = r0 << 14
            r1 = r1 ^ r0
            if (r1 < 0) goto L_0x0094
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r7 = r2
            goto L_0x0083
        L_0x0094:
            int r7 = r2 + 1
            byte r0 = r6[r2]
            int r0 = r0 << 21
            r1 = r1 ^ r0
            if (r1 >= 0) goto L_0x005c
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r1 = r1 ^ r0
            goto L_0x0082
        L_0x00a2:
            int r7 = r5 + 1
            byte r0 = r6[r5]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r3 = r3 ^ r1
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47852Kx.A06():long");
    }

    public long A07() {
        long j2 = 0;
        int i2 = 0;
        do {
            if (this.A00 == this.A01) {
                A0E(1);
            }
            byte[] bArr = this.A08;
            int i3 = this.A00;
            this.A00 = i3 + 1;
            byte b2 = bArr[i3];
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i2;
            if ((b2 & 128) == 0) {
                return j2;
            }
            i2 += 7;
        } while (i2 < 64);
        throw new C29791bD("CodedInputStream encountered a malformed varint.");
    }

    public C28631Ww A08() {
        int A022 = A02();
        int i2 = this.A01;
        int i3 = this.A00;
        if (A022 > i2 - i3 || A022 <= 0) {
            return A022 == 0 ? C28631Ww.A01 : new C28611Wu(A0H(A022));
        }
        C28631Ww A012 = C28631Ww.A01(this.A08, i3, A022);
        this.A00 += A022;
        return A012;
    }

    public AnonymousClass1Wo A09(C47862Ky r4, C47872Kz r5) {
        int A022 = A02();
        int i2 = this.A05;
        if (i2 < 100) {
            int A042 = A04(A022);
            this.A05 = i2 + 1;
            C28541Wm A0B = C28541Wm.A0B(this, r4, r5.A00);
            A0C(0);
            this.A05--;
            this.A03 = A042;
            A0B();
            return A0B;
        }
        throw new C29791bD("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public String A0A() {
        String str;
        int A022 = A02();
        int i2 = this.A01;
        int i3 = this.A00;
        if (A022 <= i2 - i3 && A022 > 0) {
            str = new String(this.A08, i3, A022, C28601Wt.A03);
        } else if (A022 == 0) {
            return "";
        } else {
            if (A022 > i2) {
                return new String(A0H(A022), C28601Wt.A03);
            }
            A0E(A022);
            str = new String(this.A08, this.A00, A022, C28601Wt.A03);
        }
        this.A00 += A022;
        return str;
    }

    public final void A0B() {
        int i2 = this.A01 + this.A02;
        this.A01 = i2;
        int i3 = this.A06 + i2;
        int i4 = this.A03;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.A02 = i5;
            this.A01 = i2 - i5;
            return;
        }
        this.A02 = 0;
    }

    public void A0C(int i2) {
        if (this.A04 != i2) {
            throw new C29791bD("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void A0D(int i2) {
        int i3 = this.A01;
        int i4 = this.A00;
        int i5 = i3 - i4;
        if (i2 <= i5) {
            if (i2 >= 0) {
                this.A00 = i4 + i2;
                return;
            }
        } else if (i2 >= 0) {
            int i6 = this.A06;
            int i7 = i6 + i4 + i2;
            int i8 = this.A03;
            if (i7 <= i8) {
                this.A00 = i3;
                while (true) {
                    A0E(1);
                    int i9 = i2 - i5;
                    int i10 = this.A01;
                    if (i9 > i10) {
                        i5 += i10;
                        this.A00 = i10;
                    } else {
                        this.A00 = i9;
                        return;
                    }
                }
            } else {
                A0D((i8 - i6) - i4);
                throw new C29791bD("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        throw new C29791bD("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void A0E(int i2) {
        if (!A0G(i2)) {
            throw new C29791bD("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public boolean A0F() {
        return A06() != 0;
    }

    public final boolean A0G(int i2) {
        InputStream inputStream;
        int i3 = this.A00;
        int i4 = i3 + i2;
        int i5 = this.A01;
        if (i4 > i5) {
            if (this.A06 + i3 + i2 <= this.A03 && (inputStream = this.A07) != null) {
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.A08;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.A06 += i3;
                    i5 = this.A01 - i3;
                    this.A01 = i5;
                    this.A00 = 0;
                }
                byte[] bArr2 = this.A08;
                int length = bArr2.length;
                int read = inputStream.read(bArr2, i5, length - i5);
                if (read == 0 || read < -1 || read > length) {
                    StringBuilder sb = new StringBuilder("InputStream#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read > 0) {
                    this.A01 += read;
                    if ((this.A06 + i2) - 67108864 <= 0) {
                        A0B();
                        if (this.A01 >= i2) {
                            return true;
                        }
                        return A0G(i2);
                    }
                    throw new C29791bD("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        StringBuilder sb2 = new StringBuilder("refillBuffer() called when ");
        sb2.append(i2);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    public final byte[] A0H(int i2) {
        if (i2 <= 0) {
            throw new C29791bD("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.A06;
        int i4 = this.A00;
        int i5 = i3 + i4 + i2;
        if (i5 <= 67108864) {
            int i6 = this.A03;
            if (i5 <= i6) {
                InputStream inputStream = this.A07;
                if (inputStream != null) {
                    int i7 = this.A01;
                    int i8 = i7 - i4;
                    this.A06 = i3 + i7;
                    this.A00 = 0;
                    this.A01 = 0;
                    int i9 = i2 - i8;
                    if (i9 < 4096 || i9 <= inputStream.available()) {
                        byte[] bArr = new byte[i2];
                        System.arraycopy(this.A08, i4, bArr, 0, i8);
                        while (i8 < i2) {
                            int read = inputStream.read(bArr, i8, i2 - i8);
                            if (read != -1) {
                                this.A06 += read;
                                i8 += read;
                            }
                        }
                        return bArr;
                    }
                    ArrayList arrayList = new ArrayList();
                    do {
                        int min = Math.min(i9, 4096);
                        byte[] bArr2 = new byte[min];
                        int i10 = 0;
                        while (i10 < min) {
                            int read2 = inputStream.read(bArr2, i10, min - i10);
                            if (read2 != -1) {
                                this.A06 += read2;
                                i10 += read2;
                            }
                        }
                        i9 -= min;
                        arrayList.add(bArr2);
                    } while (i9 > 0);
                    byte[] bArr3 = new byte[i2];
                    System.arraycopy(this.A08, i4, bArr3, 0, i8);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] bArr4 = (byte[]) it.next();
                        int length = bArr4.length;
                        System.arraycopy(bArr4, 0, bArr3, i8, length);
                        i8 += length;
                    }
                    return bArr3;
                }
            } else {
                A0D((i6 - i3) - i4);
            }
            throw new C29791bD("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C29791bD("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
