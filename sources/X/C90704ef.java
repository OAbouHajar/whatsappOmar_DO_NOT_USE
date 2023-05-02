package X;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.4ef  reason: invalid class name and case insensitive filesystem */
public final class C90704ef {
    public int A00;
    public C32561ga A01;
    public final ByteBuffer A02;

    public C90704ef(byte[] bArr, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i2);
        this.A02 = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int A00(int i2) {
        int A012 = A01(i2 << 3);
        int A03 = A03("");
        return A012 + A01(A03) + A03;
    }

    public static int A01(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) != 0) {
            return (i2 & -268435456) == 0 ? 4 : 5;
        }
        return 3;
    }

    public static int A02(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if ((-16384 & j2) == 0) {
            return 2;
        }
        if ((-2097152 & j2) == 0) {
            return 3;
        }
        if ((-268435456 & j2) == 0) {
            return 4;
        }
        if ((-34359738368L & j2) == 0) {
            return 5;
        }
        if ((-4398046511104L & j2) == 0) {
            return 6;
        }
        if ((-562949953421312L & j2) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r5 < r6) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        r0 = X.AnonymousClass3K2.A0g(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(java.lang.CharSequence r8) {
        /*
            int r6 = r8.length()
            r7 = 0
            r4 = 0
        L_0x0006:
            if (r4 >= r6) goto L_0x0013
            char r1 = r8.charAt(r4)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x0013
            int r4 = r4 + 1
            goto L_0x0006
        L_0x0013:
            r5 = r6
        L_0x0014:
            if (r4 >= r6) goto L_0x0052
            char r0 = r8.charAt(r4)
            r3 = 2048(0x800, float:2.87E-42)
            if (r0 >= r3) goto L_0x0026
            int r0 = 127 - r0
            int r0 = r0 >>> 31
            int r5 = r5 + r0
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0026:
            int r2 = r8.length()
        L_0x002a:
            if (r4 >= r2) goto L_0x0051
            char r1 = r8.charAt(r4)
            if (r1 >= r3) goto L_0x003a
            int r0 = 127 - r1
            int r0 = r0 >>> 31
            int r7 = r7 + r0
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003a:
            int r7 = r7 + 2
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r0 > r1) goto L_0x0037
            r0 = 57343(0xdfff, float:8.0355E-41)
            if (r1 > r0) goto L_0x0037
            int r1 = java.lang.Character.codePointAt(r8, r4)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 < r0) goto L_0x005a
            int r4 = r4 + 1
            goto L_0x0037
        L_0x0051:
            int r5 = r5 + r7
        L_0x0052:
            if (r5 < r6) goto L_0x0055
            return r5
        L_0x0055:
            java.lang.String r0 = X.AnonymousClass3K2.A0g(r5)
            goto L_0x0066
        L_0x005a:
            r0 = 39
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Unpaired surrogate at index "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r4)
        L_0x0066:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90704ef.A03(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (57343 >= r12) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(java.lang.CharSequence r15, java.nio.ByteBuffer r16) {
        /*
            r8 = r16
            boolean r0 = r8.isReadOnly()
            if (r0 != 0) goto L_0x0153
            boolean r0 = r8.hasArray()
            java.lang.String r7 = "Unpaired surrogate at index "
            r16 = 39
            r6 = 57343(0xdfff, float:8.0355E-41)
            r5 = 55296(0xd800, float:7.7486E-41)
            r4 = 2048(0x800, float:2.87E-42)
            r10 = 0
            r3 = 128(0x80, float:1.794E-43)
            r9 = r15
            if (r0 == 0) goto L_0x00d7
            byte[] r15 = r8.array()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            int r2 = r8.arrayOffset()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            int r0 = r8.position()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            int r2 = r2 + r0
            int r14 = r8.remaining()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            int r13 = r9.length()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            int r14 = r14 + r2
        L_0x0034:
            if (r10 >= r13) goto L_0x0046
            int r1 = r10 + r2
            if (r1 >= r14) goto L_0x0046
            char r0 = r9.charAt(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            if (r0 >= r3) goto L_0x0046
            byte r0 = (byte) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            r15[r1] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            int r10 = r10 + 1
            goto L_0x0034
        L_0x0046:
            if (r10 != r13) goto L_0x004a
            int r2 = r2 + r13
            goto L_0x00c4
        L_0x004a:
            int r2 = r2 + r10
        L_0x004b:
            if (r10 >= r13) goto L_0x00c4
            char r12 = r9.charAt(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            if (r12 >= r3) goto L_0x0058
            if (r2 >= r14) goto L_0x0063
            int r1 = r2 + 1
            goto L_0x0071
        L_0x0058:
            if (r12 < r4) goto L_0x0063
            if (r12 < r5) goto L_0x005e
            if (r6 >= r12) goto L_0x0075
        L_0x005e:
            int r0 = r14 + -3
            if (r2 > r0) goto L_0x0075
            goto L_0x0068
        L_0x0063:
            int r0 = r14 + -2
            if (r2 > r0) goto L_0x005e
            goto L_0x0091
        L_0x0068:
            int r2 = X.AnonymousClass3K2.A0E(r15, r2, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            int r1 = r2 + 1
            r12 = r12 & 63
            r12 = r12 | r3
        L_0x0071:
            byte r0 = (byte) r12     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            r15[r2] = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            goto L_0x0096
        L_0x0075:
            int r0 = r14 + -4
            if (r2 > r0) goto L_0x00aa
            int r11 = r10 + 1
            int r0 = r9.length()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            if (r11 == r0) goto L_0x009b
            char r1 = r9.charAt(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            if (r0 == 0) goto L_0x009a
            int r2 = X.AnonymousClass3K2.A0B(r15, r12, r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            r10 = r11
            goto L_0x0097
        L_0x0091:
            int r2 = X.AnonymousClass3K3.A0N(r15, r2, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            goto L_0x0097
        L_0x0096:
            r2 = r1
        L_0x0097:
            int r10 = r10 + 1
            goto L_0x004b
        L_0x009a:
            r10 = r11
        L_0x009b:
            int r1 = r10 + -1
            java.lang.StringBuilder r0 = X.C13690nt.A0g(r16)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            java.lang.String r0 = X.C13680ns.A0i(r7, r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
        L_0x00aa:
            r0 = 37
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            java.lang.String r0 = "Failed writing "
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            r1.append(r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            java.lang.String r0 = " at index "
            java.lang.String r1 = X.C13680ns.A0i(r0, r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            r0.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
        L_0x00c4:
            int r0 = r8.arrayOffset()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            int r2 = r2 - r0
            r8.position(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00cd }
            return
        L_0x00cd:
            r1 = move-exception
            java.nio.BufferOverflowException r0 = new java.nio.BufferOverflowException
            r0.<init>()
            r0.initCause(r1)
            throw r0
        L_0x00d7:
            int r2 = r15.length()
        L_0x00db:
            if (r10 >= r2) goto L_0x0152
            char r11 = r15.charAt(r10)
            if (r11 < r3) goto L_0x00f0
            if (r11 >= r4) goto L_0x00f7
            int r0 = r11 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
        L_0x00e9:
            byte r0 = (byte) r0
            r8.put(r0)
            r11 = r11 & 63
            r11 = r11 | r3
        L_0x00f0:
            byte r0 = (byte) r11
            r8.put(r0)
        L_0x00f4:
            int r10 = r10 + 1
            goto L_0x00db
        L_0x00f7:
            if (r11 < r5) goto L_0x0134
            if (r6 < r11) goto L_0x0134
            int r1 = r10 + 1
            int r0 = r15.length()
            if (r1 == r0) goto L_0x0143
            char r10 = r15.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r11, r10)
            if (r0 == 0) goto L_0x0142
            int r10 = java.lang.Character.toCodePoint(r11, r10)
            int r0 = r10 >>> 18
            r0 = r0 | 240(0xf0, float:3.36E-43)
            byte r0 = (byte) r0
            r8.put(r0)
            int r0 = r10 >>> 12
            r0 = r0 & 63
            r0 = r0 | r3
            byte r0 = (byte) r0
            r8.put(r0)
            int r0 = r10 >>> 6
            r0 = r0 & 63
            r0 = r0 | r3
            byte r0 = (byte) r0
            r8.put(r0)
            r0 = r10 & 63
            r0 = r0 | r3
            byte r0 = (byte) r0
            r8.put(r0)
            r10 = r1
            goto L_0x00f4
        L_0x0134:
            int r0 = r11 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            r8.put(r0)
            int r0 = r11 >>> 6
            r0 = r0 & 63
            r0 = r0 | r3
            goto L_0x00e9
        L_0x0142:
            r10 = r1
        L_0x0143:
            int r1 = r10 + -1
            java.lang.StringBuilder r0 = X.C13690nt.A0g(r16)
            java.lang.String r0 = X.C13680ns.A0i(r7, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0152:
            return
        L_0x0153:
            java.nio.ReadOnlyBufferException r0 = new java.nio.ReadOnlyBufferException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90704ef.A04(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    public final void A05(int i2) {
        byte b2 = (byte) i2;
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer.hasRemaining()) {
            byteBuffer.put(b2);
            return;
        }
        throw new AnonymousClass40A(byteBuffer.position(), byteBuffer.limit());
    }

    public final void A06(int i2) {
        while ((i2 & -128) != 0) {
            A05((i2 & 127) | 128);
            i2 >>>= 7;
        }
        A05(i2);
    }

    public final void A07(int i2, String str) {
        A06((i2 << 3) | 2);
        try {
            int length = str.length();
            int A012 = A01(length);
            if (A012 == A01(length * 3)) {
                ByteBuffer byteBuffer = this.A02;
                int position = byteBuffer.position();
                if (byteBuffer.remaining() >= A012) {
                    byteBuffer.position(position + A012);
                    A04(str, byteBuffer);
                    int position2 = byteBuffer.position();
                    byteBuffer.position(position);
                    A06((position2 - position) - A012);
                    byteBuffer.position(position2);
                    return;
                }
                throw new AnonymousClass40A(position + A012, byteBuffer.limit());
            }
            A06(A03(str));
            A04(str, this.A02);
        } catch (BufferOverflowException e2) {
            ByteBuffer byteBuffer2 = this.A02;
            AnonymousClass40A r0 = new AnonymousClass40A(byteBuffer2.position(), byteBuffer2.limit());
            r0.initCause(e2);
            throw r0;
        }
    }

    public final void A08(int i2, byte[] bArr) {
        A06((i2 << 3) | 2);
        int length = bArr.length;
        A06(length);
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer.remaining() >= length) {
            byteBuffer.put(bArr, 0, length);
            return;
        }
        throw new AnonymousClass40A(byteBuffer.position(), byteBuffer.limit());
    }

    public final void A09(long j2) {
        while (true) {
            int i2 = (int) j2;
            if ((-128 & j2) == 0) {
                A05(i2);
                return;
            } else {
                A05((i2 & 127) | 128);
                j2 >>>= 7;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.AnonymousClass5UZ r7, int r8) {
        /*
            r6 = this;
            X.1ga r0 = r6.A01
            if (r0 != 0) goto L_0x005b
            java.nio.ByteBuffer r5 = r6.A02
            boolean r0 = r5.hasArray()
            if (r0 == 0) goto L_0x003f
            X.3ZE r0 = new X.3ZE
            r0.<init>(r5)
        L_0x0011:
            r6.A01 = r0
        L_0x0013:
            int r0 = r5.position()
            r6.A00 = r0
        L_0x0019:
            X.1ga r2 = r6.A01
            X.AnonymousClass3K3.A1A(r2, r8)
            int r0 = r7.Aiz()
            r2.A08(r0)
            X.1gd r1 = X.AnonymousClass3K3.A0Y(r7)
            X.4rU r0 = r2.A00
            if (r0 != 0) goto L_0x0032
            X.4rU r0 = new X.4rU
            r0.<init>(r2)
        L_0x0032:
            r1.Aiv(r0, r7)
            r2.A06()
            int r0 = r5.position()
            r6.A00 = r0
            return
        L_0x003f:
            boolean r0 = r5.isDirect()
            if (r0 == 0) goto L_0x0078
            boolean r0 = r5.isReadOnly()
            if (r0 != 0) goto L_0x0078
            boolean r0 = X.C90904f2.A07
            if (r0 == 0) goto L_0x0055
            X.3ZH r0 = new X.3ZH
            r0.<init>(r5)
            goto L_0x0011
        L_0x0055:
            X.3ZF r0 = new X.3ZF
            r0.<init>(r5)
            goto L_0x0011
        L_0x005b:
            int r1 = r6.A00
            java.nio.ByteBuffer r5 = r6.A02
            int r0 = r5.position()
            if (r1 == r0) goto L_0x0019
            X.1ga r4 = r6.A01
            byte[] r3 = r5.array()
            int r2 = r6.A00
            int r1 = r5.position()
            int r0 = r6.A00
            int r1 = r1 - r0
            r4.A0E(r3, r2, r1)
            goto L_0x0013
        L_0x0078:
            java.lang.String r0 = "ByteBuffer is read-only"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90704ef.A0A(X.5UZ, int):void");
    }

    public final void A0B(C90124dX r2, int i2) {
        A06((i2 << 3) | 2);
        if (r2.A00 < 0) {
            r2.A00 = r2.A03();
        }
        A06(r2.A00);
        r2.A05(this);
    }
}
