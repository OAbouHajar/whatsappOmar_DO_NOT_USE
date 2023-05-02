package X;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: X.0i7  reason: invalid class name and case insensitive filesystem */
public final class C11050i7 implements C13670mq, Cloneable, ByteChannel, C13630mh {
    public static final byte[] A02;
    public long A00;
    public C89434cA A01;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AnonymousClass4BJ.A05);
        C18450wi.A08(bytes);
        A02 = bytes;
    }

    public static final C09200f6 A00(C11050i7 r7, int i2) {
        AnonymousClass48B.A00(r7.A00, 0, (long) i2);
        C89434cA r3 = r7.A01;
        C89434cA r72 = r3;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 < i2) {
                if (r3 == null) {
                    break;
                }
                int i6 = r3.A00;
                int i7 = r3.A01;
                if (i6 != i7) {
                    i4 += i6 - i7;
                    i5++;
                    r3 = r3.A02;
                } else {
                    throw new AssertionError("s.limit == s.pos");
                }
            } else {
                byte[][] bArr = new byte[i5][];
                int[] iArr = new int[(i5 << 1)];
                int i8 = 0;
                while (i3 < i2) {
                    if (r72 != null) {
                        bArr[i8] = r72.A06;
                        int i9 = r72.A00;
                        int i10 = r72.A01;
                        i3 += i9 - i10;
                        iArr[i8] = Math.min(i3, i2);
                        iArr[i8 + i5] = i10;
                        r72.A05 = true;
                        i8++;
                        r72 = r72.A02;
                    }
                }
                return new AnonymousClass5HF(iArr, bArr);
            }
        }
        C18450wi.A07();
        throw AnonymousClass000.A0Z();
    }

    public final byte A01(long j2) {
        byte[] bArr;
        long j3;
        AnonymousClass48B.A00(this.A00, j2, 1);
        C89434cA r7 = this.A01;
        if (r7 != null) {
            long j4 = this.A00;
            if (j4 - j2 >= j2) {
                long j5 = 0;
                while (true) {
                    int i2 = r7.A00;
                    int i3 = r7.A01;
                    long j6 = ((long) (i2 - i3)) + j5;
                    if (j6 <= j2) {
                        r7 = r7.A02;
                        if (r7 == null) {
                            break;
                        }
                        j5 = j6;
                    } else {
                        bArr = r7.A06;
                        j3 = (((long) i3) + j2) - j5;
                        break;
                    }
                }
            } else {
                while (j4 > j2) {
                    r7 = r7.A03;
                    if (r7 != null) {
                        j4 -= (long) (r7.A00 - r7.A01);
                    } else {
                        C18450wi.A07();
                        throw AnonymousClass000.A0Z();
                    }
                }
                bArr = r7.A06;
                j3 = (((long) r7.A01) + j2) - j4;
            }
            return bArr[(int) j3];
        }
        C18450wi.A07();
        throw null;
    }

    public int A02(byte[] bArr, int i2, int i3) {
        AnonymousClass48B.A00((long) bArr.length, (long) i2, (long) i3);
        C89434cA r6 = this.A01;
        if (r6 == null) {
            return -1;
        }
        int i4 = r6.A00;
        int i5 = r6.A01;
        int min = Math.min(i3, i4 - i5);
        System.arraycopy(r6.A06, i5, bArr, i2, min);
        int i6 = r6.A01 + min;
        r6.A01 = i6;
        this.A00 -= (long) min;
        if (i6 == r6.A00) {
            this.A01 = r6.A00();
            C90404e5.A01(r6);
        }
        return min;
    }

    public final long A03() {
        return this.A00;
    }

    public String A04() {
        return A06(AnonymousClass4BJ.A05, this.A00);
    }

    public String A05(long j2) {
        return A06(AnonymousClass4BJ.A05, j2);
    }

    public String A06(Charset charset, long j2) {
        if (j2 < 0 || j2 > ((long) Integer.MAX_VALUE)) {
            StringBuilder A0r = AnonymousClass000.A0r("byteCount: ");
            A0r.append(j2);
            throw AnonymousClass000.A0T(A0r.toString());
        } else if (this.A00 < j2) {
            throw new EOFException();
        } else if (j2 == 0) {
            return "";
        } else {
            C89434cA r4 = this.A01;
            if (r4 == null) {
                C18450wi.A07();
                throw AnonymousClass000.A0Z();
            }
            int i2 = r4.A01;
            if (((long) i2) + j2 > ((long) r4.A00)) {
                return new String(A0K(j2), charset);
            }
            int i3 = (int) j2;
            String str = new String(r4.A06, i2, i3, charset);
            int i4 = r4.A01 + i3;
            r4.A01 = i4;
            this.A00 -= j2;
            if (i4 == r4.A00) {
                this.A01 = r4.A00();
                C90404e5.A01(r4);
            }
            return str;
        }
    }

    /* renamed from: A07 */
    public C11050i7 clone() {
        C89434cA r1;
        C11050i7 r5 = new C11050i7();
        if (this.A00 != 0) {
            C89434cA r0 = this.A01;
            if (r0 != null) {
                C89434cA A012 = r0.A01();
                r5.A01 = A012;
                A012.A03 = A012;
                A012.A02 = A012;
                C89434cA r2 = this.A01;
                if (r2 != null) {
                    while (true) {
                        r2 = r2.A02;
                        if (r2 == this.A01) {
                            r5.A00 = this.A00;
                            break;
                        }
                        C89434cA r02 = r5.A01;
                        if (r02 == null || (r1 = r02.A03) == null || r2 == null) {
                            break;
                        }
                        r1.A04(r2.A01());
                    }
                }
            }
            C18450wi.A07();
            throw AnonymousClass000.A0Z();
        }
        return r5;
    }

    public C09200f6 A08() {
        return new C09200f6(A0K(this.A00));
    }

    public final C89434cA A09(int i2) {
        C89434cA r0 = this.A01;
        if (r0 == null) {
            C89434cA A002 = C90404e5.A00();
            this.A01 = A002;
            A002.A03 = A002;
            A002.A02 = A002;
            return A002;
        }
        C89434cA r1 = r0.A03;
        if (r1 == null) {
            C18450wi.A07();
            throw AnonymousClass000.A0Z();
        } else if (r1.A00 + i2 <= 8192 && r1.A04) {
            return r1;
        } else {
            C89434cA A003 = C90404e5.A00();
            r1.A04(A003);
            return A003;
        }
    }

    public final void A0A() {
        A0G(this.A00);
    }

    public /* bridge */ /* synthetic */ void A0B() {
        A0C(34);
    }

    public void A0C(int i2) {
        C89434cA A09 = A09(1);
        byte[] bArr = A09.A06;
        int i3 = A09.A00;
        A09.A00 = i3 + 1;
        bArr[i3] = (byte) i2;
        this.A00++;
    }

    public void A0D(int i2) {
        C89434cA A09 = A09(4);
        byte[] bArr = A09.A06;
        int i3 = A09.A00;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & MotionEventCompat.ACTION_MASK);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & MotionEventCompat.ACTION_MASK);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & MotionEventCompat.ACTION_MASK);
        bArr[i6] = (byte) (i2 & MotionEventCompat.ACTION_MASK);
        A09.A00 = i6 + 1;
        this.A00 += 4;
    }

    /* renamed from: A0E */
    public void A0F(int i2, String str, int i3) {
        long j2;
        long j3;
        if (i2 < 0) {
            throw AnonymousClass000.A0U(AnonymousClass000.A0r("beginIndex < 0: "), i2);
        } else if (i3 >= i2) {
            int length = str.length();
            if (i3 > length) {
                StringBuilder A0r = AnonymousClass000.A0r("endIndex > string.length: ");
                A0r.append(i3);
                A0r.append(" > ");
                throw AnonymousClass000.A0U(A0r, length);
            }
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    C89434cA A09 = A09(1);
                    byte[] bArr = A09.A06;
                    int i4 = A09.A00 - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = A09.A00;
                    int i7 = (i4 + i5) - i6;
                    A09.A00 = i6 + i7;
                    this.A00 += (long) i7;
                    i2 = i5;
                } else {
                    if (charAt < 2048) {
                        C89434cA A092 = A09(2);
                        byte[] bArr2 = A092.A06;
                        int i8 = A092.A00;
                        bArr2[i8] = (byte) ((charAt >> 6) | 192);
                        bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                        A092.A00 = i8 + 2;
                        j2 = this.A00;
                        j3 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        C89434cA A093 = A09(3);
                        byte[] bArr3 = A093.A06;
                        int i9 = A093.A00;
                        bArr3[i9] = (byte) ((charAt >> 12) | 224);
                        bArr3[i9 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                        bArr3[i9 + 2] = (byte) ((charAt & '?') | 128);
                        A093.A00 = i9 + 3;
                        j2 = this.A00;
                        j3 = 3;
                    } else {
                        int i10 = i2 + 1;
                        char charAt3 = i10 < i3 ? str.charAt(i10) : 0;
                        if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                            A0C(63);
                            i2 = i10;
                        } else {
                            int i11 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                            C89434cA A094 = A09(4);
                            byte[] bArr4 = A094.A06;
                            int i12 = A094.A00;
                            bArr4[i12] = (byte) ((i11 >> 18) | 240);
                            bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                            bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                            bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                            A094.A00 = i12 + 4;
                            this.A00 += 4;
                            i2 += 2;
                        }
                    }
                    this.A00 = j2 + j3;
                    i2++;
                }
            }
        } else {
            StringBuilder A0r2 = AnonymousClass000.A0r("endIndex < beginIndex: ");
            A0r2.append(i3);
            A0r2.append(" < ");
            throw AnonymousClass000.A0U(A0r2, i2);
        }
    }

    public void A0G(long j2) {
        while (j2 > 0) {
            C89434cA r6 = this.A01;
            if (r6 != null) {
                int i2 = r6.A00;
                int i3 = r6.A01;
                int min = (int) Math.min(j2, (long) (i2 - i3));
                long j3 = (long) min;
                this.A00 -= j3;
                j2 -= j3;
                int i4 = i3 + min;
                r6.A01 = i4;
                if (i4 == i2) {
                    this.A01 = r6.A00();
                    C90404e5.A01(r6);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: A0H */
    public void A0I(String str) {
        C18450wi.A0G(str, 0);
        A0F(0, str, str.length());
    }

    public void A0J(C11050i7 r10, long j2) {
        long j3 = j2;
        if (r10 != this) {
            AnonymousClass48B.A00(r10.A00, 0, j3);
            while (j3 > 0) {
                C89434cA r4 = r10.A01;
                if (r4 != null) {
                    int i2 = (j3 > ((long) (r4.A00 - r4.A01)) ? 1 : (j3 == ((long) (r4.A00 - r4.A01)) ? 0 : -1));
                    long j4 = (long) (r4.A00 - r4.A01);
                    r10.A01 = r4.A00();
                    C89434cA r0 = this.A01;
                    if (r0 == null) {
                        this.A01 = r4;
                        r4.A03 = r4;
                        r4.A02 = r4;
                    } else {
                        C89434cA r02 = r0.A03;
                        if (r02 != null) {
                            r02.A04(r4);
                            r4.A03();
                        }
                    }
                    r10.A00 -= j4;
                    this.A00 += j4;
                    j3 -= j4;
                }
                C18450wi.A07();
                throw AnonymousClass000.A0Z();
            }
            return;
        }
        throw AnonymousClass000.A0T("source == this");
    }

    public byte[] A0K(long j2) {
        if (j2 < 0 || j2 > ((long) Integer.MAX_VALUE)) {
            StringBuilder A0r = AnonymousClass000.A0r("byteCount: ");
            A0r.append(j2);
            throw AnonymousClass000.A0T(A0r.toString());
        } else if (this.A00 >= j2) {
            int i2 = (int) j2;
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int A022 = A02(bArr, i3, i2 - i3);
                if (A022 != -1) {
                    i3 += A022;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public C11050i7 AAD() {
        return this;
    }

    public long AbQ(C11050i7 r6, long j2) {
        if (j2 >= 0) {
            long j3 = this.A00;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            r6.A0J(this, j2);
            return j2;
        }
        StringBuilder A0r = AnonymousClass000.A0r("byteCount < 0: ");
        A0r.append(j2);
        throw AnonymousClass000.A0T(A0r.toString());
    }

    public boolean AcF(long j2) {
        return this.A00 >= j2;
    }

    public void close() {
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r16 = 1
            r3 = r17
            if (r3 == r6) goto L_0x0073
            boolean r0 = r6 instanceof X.C11050i7
            r15 = 0
            if (r0 == 0) goto L_0x0072
            long r4 = r3.A00
            X.0i7 r6 = (X.C11050i7) r6
            long r1 = r6.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0072
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0073
            X.4cA r9 = r3.A01
            if (r9 == 0) goto L_0x006a
            X.4cA r8 = r6.A01
            if (r8 == 0) goto L_0x006a
            int r1 = r9.A01
            int r10 = r8.A01
            r13 = 0
        L_0x002b:
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            int r2 = r9.A00
            int r2 = r2 - r1
            int r0 = r8.A00
            int r0 = r0 - r10
            int r0 = java.lang.Math.min(r2, r0)
            long r2 = (long) r0
            r11 = 0
        L_0x003c:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0054
            byte[] r0 = r9.A06
            int r7 = r1 + 1
            byte r1 = r0[r1]
            byte[] r0 = r8.A06
            int r6 = r10 + 1
            byte r0 = r0[r10]
            if (r1 != r0) goto L_0x0072
            r0 = 1
            long r11 = r11 + r0
            r1 = r7
            r10 = r6
            goto L_0x003c
        L_0x0054:
            int r0 = r9.A00
            if (r1 != r0) goto L_0x005e
            X.4cA r9 = r9.A02
            if (r9 == 0) goto L_0x006a
            int r1 = r9.A01
        L_0x005e:
            int r0 = r8.A00
            if (r10 != r0) goto L_0x0068
            X.4cA r8 = r8.A02
            if (r8 == 0) goto L_0x006a
            int r10 = r8.A01
        L_0x0068:
            long r13 = r13 + r2
            goto L_0x002b
        L_0x006a:
            X.C18450wi.A07()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        L_0x0072:
            return r15
        L_0x0073:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11050i7.equals(java.lang.Object):boolean");
    }

    public void flush() {
    }

    public int hashCode() {
        C89434cA r5 = this.A01;
        C89434cA r4 = r5;
        if (r5 == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = r5.A00;
            for (int i4 = r5.A01; i4 < i3; i4++) {
                i2 = (i2 * 31) + r5.A06[i4];
            }
            r5 = r5.A02;
            if (r5 == null) {
                C18450wi.A07();
                throw AnonymousClass000.A0Z();
            }
        } while (r5 != r4);
        return i2;
    }

    public boolean isOpen() {
        return true;
    }

    public int read(ByteBuffer byteBuffer) {
        C18450wi.A0G(byteBuffer, 0);
        C89434cA r6 = this.A01;
        if (r6 == null) {
            return -1;
        }
        int remaining = byteBuffer.remaining();
        int i2 = r6.A00;
        int i3 = r6.A01;
        int min = Math.min(remaining, i2 - i3);
        byteBuffer.put(r6.A06, i3, min);
        int i4 = r6.A01 + min;
        r6.A01 = i4;
        this.A00 -= (long) min;
        if (i4 == r6.A00) {
            this.A01 = r6.A00();
            C90404e5.A01(r6);
        }
        return min;
    }

    public byte readByte() {
        long j2 = this.A00;
        if (j2 != 0) {
            C89434cA r7 = this.A01;
            if (r7 == null) {
                C18450wi.A07();
                throw AnonymousClass000.A0Z();
            }
            int i2 = r7.A01;
            int i3 = r7.A00;
            int i4 = i2 + 1;
            byte b2 = r7.A06[i2];
            this.A00 = j2 - 1;
            if (i4 == i3) {
                this.A01 = r7.A00();
                C90404e5.A01(r7);
                return b2;
            }
            r7.A01 = i4;
            return b2;
        }
        throw new EOFException();
    }

    public String toString() {
        long j2 = this.A00;
        if (j2 <= ((long) Integer.MAX_VALUE)) {
            int i2 = (int) j2;
            return (i2 == 0 ? C09200f6.A02 : A00(this, i2)).toString();
        }
        StringBuilder A0r = AnonymousClass000.A0r("size > Integer.MAX_VALUE: ");
        A0r.append(j2);
        throw AnonymousClass000.A0V(A0r.toString());
    }

    public int write(ByteBuffer byteBuffer) {
        C18450wi.A0G(byteBuffer, 0);
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            C89434cA A09 = A09(1);
            int i3 = A09.A00;
            int min = Math.min(i2, 8192 - i3);
            byteBuffer.get(A09.A06, i3, min);
            i2 -= min;
            A09.A00 += min;
        }
        this.A00 += (long) remaining;
        return remaining;
    }
}
