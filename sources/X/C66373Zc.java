package X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.3Zc  reason: invalid class name and case insensitive filesystem */
public final class C66373Zc extends C66383Zd implements Cloneable {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03;
    public AnonymousClass3ZP A04;
    public AnonymousClass3ZO A05;
    public C66363Zb A06;
    public C66353Za A07;
    public boolean A08;
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;
    public int[] A0C;
    public AnonymousClass3ZZ[] A0D;

    public C66373Zc() {
        if (AnonymousClass3ZZ.A00 == null) {
            synchronized (C89754cq.A00) {
                if (AnonymousClass3ZZ.A00 == null) {
                    AnonymousClass3ZZ.A00 = new AnonymousClass3ZZ[0];
                }
            }
        }
        this.A0D = AnonymousClass3ZZ.A00;
        byte[] bArr = AnonymousClass4BB.A00;
        this.A09 = bArr;
        this.A04 = null;
        this.A0A = bArr;
        this.A06 = null;
        this.A03 = 180000;
        this.A07 = null;
        this.A0B = bArr;
        this.A0C = AnonymousClass4BB.A01;
        this.A05 = null;
        this.A08 = false;
        this.A00 = null;
        this.A00 = -1;
    }

    public final int A03() {
        int length;
        int A032 = super.A03();
        long j2 = this.A01;
        if (j2 != 0) {
            A032 += 1 + C90704ef.A02(j2);
        }
        boolean equals = "".equals("");
        if (!equals) {
            A032 += C90704ef.A00(2);
        }
        AnonymousClass3ZZ[] r0 = this.A0D;
        int i2 = 0;
        if (r0 != null && r0.length > 0) {
            int i3 = 0;
            while (true) {
                AnonymousClass3ZZ[] r1 = this.A0D;
                if (i3 >= r1.length) {
                    break;
                }
                AnonymousClass3ZZ r2 = r1[i3];
                if (r2 != null) {
                    int A033 = r2.A03();
                    r2.A00 = A033;
                    A032 = C66383Zd.A00(A033, 1, A032);
                }
                i3++;
            }
        }
        byte[] bArr = this.A09;
        byte[] bArr2 = AnonymousClass4BB.A00;
        if (!Arrays.equals(bArr, bArr2)) {
            A032 = C66383Zd.A00(bArr.length, 1, A032);
        }
        if (!Arrays.equals(this.A0A, bArr2)) {
            A032 = C66383Zd.A00(this.A0A.length, 1, A032);
        }
        C66363Zb r22 = this.A06;
        if (r22 != null) {
            int A034 = r22.A03();
            r22.A00 = A034;
            A032 = C66383Zd.A00(A034, 1, A032);
        }
        if (!equals) {
            A032 += C90704ef.A00(8);
        }
        AnonymousClass3ZP r02 = this.A04;
        if (r02 != null) {
            A032 += AnonymousClass3K4.A05(r02.Aiz(), 1);
        }
        int i4 = this.A00;
        if (i4 != 0) {
            A032 += 1 + C90704ef.A01(i4);
        }
        if (!equals) {
            A032 = A032 + C90704ef.A00(13) + C90704ef.A00(14);
        }
        long j3 = this.A03;
        if (j3 != 180000) {
            A032 += 1 + C90704ef.A02(AnonymousClass3K3.A0R(j3));
        }
        C66353Za r23 = this.A07;
        if (r23 != null) {
            int A035 = r23.A03();
            r23.A00 = A035;
            A032 = C66383Zd.A00(A035, 2, A032);
        }
        long j4 = this.A02;
        if (j4 != 0) {
            A032 += 2 + C90704ef.A02(j4);
        }
        byte[] bArr3 = this.A0B;
        if (!Arrays.equals(bArr3, bArr2)) {
            A032 = C66383Zd.A00(bArr3.length, 2, A032);
        }
        int[] iArr = this.A0C;
        if (iArr != null && (length = iArr.length) > 0) {
            int i5 = 0;
            do {
                int i6 = iArr[i2];
                i5 += i6 >= 0 ? C90704ef.A01(i6) : 10;
                i2++;
            } while (i2 < length);
            A032 = A032 + i5 + (length << 1);
        }
        AnonymousClass3ZO r03 = this.A05;
        if (r03 != null) {
            A032 += AnonymousClass3K4.A05(r03.Aiz(), 2);
        }
        if (!equals) {
            A032 += C90704ef.A00(24);
        }
        if (this.A08) {
            A032 += 3;
        }
        return !equals ? A032 + C90704ef.A00(26) : A032;
    }

    public final void A05(C90704ef r12) {
        long j2 = this.A01;
        if (j2 != 0) {
            r12.A05(8);
            r12.A09(j2);
        }
        boolean equals = "".equals("");
        if (!equals) {
            r12.A07(2, "");
        }
        AnonymousClass3ZZ[] r0 = this.A0D;
        int i2 = 0;
        if (r0 != null && r0.length > 0) {
            int i3 = 0;
            while (true) {
                AnonymousClass3ZZ[] r1 = this.A0D;
                if (i3 >= r1.length) {
                    break;
                }
                AnonymousClass3ZZ r13 = r1[i3];
                if (r13 != null) {
                    r12.A0B(r13, 3);
                }
                i3++;
            }
        }
        byte[] bArr = this.A09;
        byte[] bArr2 = AnonymousClass4BB.A00;
        if (!Arrays.equals(bArr, bArr2)) {
            r12.A08(4, bArr);
        }
        if (!Arrays.equals(this.A0A, bArr2)) {
            r12.A08(6, this.A0A);
        }
        C66363Zb r14 = this.A06;
        if (r14 != null) {
            r12.A0B(r14, 7);
        }
        if (!equals) {
            r12.A07(8, "");
        }
        AnonymousClass3ZP r15 = this.A04;
        if (r15 != null) {
            r12.A0A(r15, 9);
        }
        int i4 = this.A00;
        if (i4 != 0) {
            r12.A05(88);
            r12.A06(i4);
        }
        if (!equals) {
            r12.A07(13, "");
            r12.A07(14, "");
        }
        long j3 = this.A03;
        if (j3 != 180000) {
            r12.A05(120);
            r12.A09(AnonymousClass3K3.A0R(j3));
        }
        C66353Za r16 = this.A07;
        if (r16 != null) {
            r12.A0B(r16, 16);
        }
        long j4 = this.A02;
        if (j4 != 0) {
            r12.A06(136);
            r12.A09(j4);
        }
        byte[] bArr3 = this.A0B;
        if (!Arrays.equals(bArr3, bArr2)) {
            r12.A08(18, bArr3);
        }
        int[] iArr = this.A0C;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.A0C;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i5 = iArr2[i2];
                r12.A06(160);
                if (i5 >= 0) {
                    r12.A06(i5);
                } else {
                    r12.A09((long) i5);
                }
                i2++;
            }
        }
        AnonymousClass3ZO r17 = this.A05;
        if (r17 != null) {
            r12.A0A(r17, 23);
        }
        if (!equals) {
            r12.A07(24, "");
        }
        if (this.A08) {
            r12.A06(200);
            byte b2 = (byte) 1;
            ByteBuffer byteBuffer = r12.A02;
            if (byteBuffer.hasRemaining()) {
                byteBuffer.put(b2);
            } else {
                throw new AnonymousClass40A(byteBuffer.position(), byteBuffer.limit());
            }
        }
        if (!equals) {
            r12.A07(26, "");
        }
        super.A05(r12);
    }

    public final /* synthetic */ Object clone() {
        int length;
        try {
            C66373Zc r2 = (C66373Zc) super.A06();
            AnonymousClass3ZZ[] r0 = this.A0D;
            if (r0 != null && (length = r0.length) > 0) {
                r2.A0D = new AnonymousClass3ZZ[length];
                int i2 = 0;
                while (true) {
                    AnonymousClass3ZZ[] r3 = this.A0D;
                    if (i2 >= r3.length) {
                        break;
                    }
                    if (r3[i2] != null) {
                        r2.A0D[i2] = r3[i2].clone();
                    }
                    i2++;
                }
            }
            AnonymousClass3ZP r02 = this.A04;
            if (r02 != null) {
                r2.A04 = r02;
            }
            C66363Zb r03 = this.A06;
            if (r03 != null) {
                r2.A06 = (C66363Zb) r03.clone();
            }
            C66353Za r04 = this.A07;
            if (r04 != null) {
                r2.A07 = (C66353Za) r04.clone();
            }
            int[] iArr = this.A0C;
            if (iArr != null && iArr.length > 0) {
                r2.A0C = (int[]) iArr.clone();
            }
            AnonymousClass3ZO r05 = this.A05;
            if (r05 != null) {
                r2.A05 = r05;
            }
            return r2;
        } catch (CloneNotSupportedException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009b, code lost:
        if (r1.length != 0) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x00ca
            boolean r0 = r8 instanceof X.C66373Zc
            r5 = 0
            if (r0 == 0) goto L_0x0044
            X.3Zc r8 = (X.C66373Zc) r8
            long r3 = r7.A01
            long r1 = r8.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            long r3 = r7.A02
            long r1 = r8.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r0)
            if (r0 == 0) goto L_0x0044
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 != r0) goto L_0x0044
            X.3ZZ[] r1 = r7.A0D
            X.3ZZ[] r0 = r8.A0D
            boolean r0 = X.C89754cq.A00(r1, r0)
            if (r0 == 0) goto L_0x0044
            byte[] r1 = r7.A09
            byte[] r0 = r8.A09
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0044
            X.3ZP r1 = r7.A04
            X.3ZP r0 = r8.A04
            if (r1 != 0) goto L_0x0045
            if (r0 == 0) goto L_0x004c
        L_0x0044:
            return r5
        L_0x0045:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004c
            return r5
        L_0x004c:
            byte[] r1 = r7.A0A
            byte[] r0 = r8.A0A
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0044
            X.3Zb r1 = r7.A06
            X.3Zb r0 = r8.A06
            if (r1 != 0) goto L_0x005f
            if (r0 == 0) goto L_0x0066
            return r5
        L_0x005f:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0066
            return r5
        L_0x0066:
            long r3 = r7.A03
            long r1 = r8.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            X.3Za r1 = r7.A07
            X.3Za r0 = r8.A07
            if (r1 != 0) goto L_0x0077
            if (r0 == 0) goto L_0x007e
            return r5
        L_0x0077:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007e
            return r5
        L_0x007e:
            byte[] r1 = r7.A0B
            byte[] r0 = r8.A0B
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0044
            int[] r2 = r7.A0C
            int[] r1 = r8.A0C
            if (r2 == 0) goto L_0x0098
            int r0 = r2.length
            if (r0 == 0) goto L_0x0098
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x009d
            return r5
        L_0x0098:
            if (r1 == 0) goto L_0x009d
            int r0 = r1.length
            if (r0 != 0) goto L_0x0044
        L_0x009d:
            X.3ZO r1 = r7.A05
            X.3ZO r0 = r8.A05
            if (r1 != 0) goto L_0x00a6
            if (r0 == 0) goto L_0x00ad
            return r5
        L_0x00a6:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ad
            return r5
        L_0x00ad:
            boolean r1 = r7.A08
            boolean r0 = r8.A08
            if (r1 != r0) goto L_0x0044
            X.54v r1 = r7.A00
            if (r1 == 0) goto L_0x00c2
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00c2
            X.54v r0 = r8.A00
            boolean r0 = r1.equals(r0)
            return r0
        L_0x00c2:
            X.54v r0 = r8.A00
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0044
        L_0x00ca:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66373Zc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2 = 0;
        int hashCode = "".hashCode();
        int i3 = 1237;
        int A0E = ((((((((AnonymousClass3K3.A0E(AnonymousClass3K3.A0E((C66373Zc.class.getName().hashCode() + 527) * 31, this.A01), this.A02) * 31) + hashCode) * 31) + this.A00) * 31) + hashCode) * 31 * 31) + 1237) * 31;
        AnonymousClass3ZZ[] r4 = this.A0D;
        int length = r4 == null ? 0 : r4.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            AnonymousClass3ZZ r1 = r4[i5];
            if (r1 != null) {
                i4 = AnonymousClass3K2.A06(r1, i4 * 31);
            }
        }
        int A0B2 = AnonymousClass3K4.A0B(this.A09, (A0E + i4) * 31);
        byte[] bArr = this.A0A;
        long j2 = this.A03;
        int A0B3 = ((AnonymousClass3K4.A0B(this.A0B, ((((((((((((AnonymousClass3K4.A0B(bArr, ((A0B2 * 31) + AnonymousClass000.A0C(this.A04)) * 31) * 31) + hashCode) * 31) + hashCode) * 31) + AnonymousClass000.A0C(this.A06)) * 31) + hashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + AnonymousClass000.A0C(this.A07)) * 31) * 31) + hashCode) * 31 * 31;
        int[] iArr = this.A0C;
        int hashCode2 = (((A0B3 + ((iArr == null || iArr.length == 0) ? 0 : Arrays.hashCode(iArr))) * 31 * 31) + AnonymousClass000.A0C(this.A05)) * 31;
        if (this.A08) {
            i3 = 1231;
        }
        int i6 = (hashCode2 + i3) * 31;
        C1043154v r12 = this.A00;
        if (!(r12 == null || r12.A00 == 0)) {
            i2 = r12.hashCode();
        }
        return i6 + i2;
    }
}
