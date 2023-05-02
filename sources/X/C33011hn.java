package X;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1hn  reason: invalid class name and case insensitive filesystem */
public class C33011hn extends FilterInputStream {
    public final int A00;
    public final boolean A01 = false;
    public final byte[][] A02 = new byte[11][];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33011hn(InputStream inputStream) {
        super(inputStream);
        int A022 = C32551gZ.A02(inputStream);
        this.A00 = A022;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33011hn(InputStream inputStream, boolean z2) {
        super(inputStream);
        int A022 = C32551gZ.A02(inputStream);
        this.A00 = A022;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33011hn(byte[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r4)
            int r1 = r4.length
            r0 = 0
            r3.<init>(r2)
            r3.A00 = r1
            r3.A01 = r0
            r0 = 11
            byte[][] r0 = new byte[r0][]
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33011hn.<init>(byte[]):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33011hn(byte[] r4, boolean r5) {
        /*
            r3 = this;
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r4)
            int r1 = r4.length
            r0 = 1
            r3.<init>(r2)
            r3.A00 = r1
            r3.A01 = r0
            r0 = 11
            byte[][] r0 = new byte[r0][]
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33011hn.<init>(byte[], boolean):void");
    }

    public static int A00(InputStream inputStream, int i2) {
        int i3 = i2 & 31;
        if (i3 == 31) {
            int i4 = 0;
            int read = inputStream.read();
            if ((read & 127) == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            while (read >= 0) {
                i3 = i4 | (read & 127);
                if ((read & 128) != 0) {
                    i4 = i3 << 7;
                    read = inputStream.read();
                }
            }
            throw new EOFException("EOF found inside tag value.");
        }
        return i3;
    }

    public static int A01(InputStream inputStream, int i2, boolean z2) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read > 127) {
                int i3 = read & 127;
                if (i3 <= 4) {
                    read = 0;
                    int i4 = 0;
                    while (i4 < i3) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            read = (read << 8) + read2;
                            i4++;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (read < 0) {
                        throw new IOException("corrupted stream - negative length found");
                    } else if (read >= i2 && !z2) {
                        StringBuilder sb = new StringBuilder("corrupted stream - out of bounds length found: ");
                        sb.append(read);
                        sb.append(" >= ");
                        sb.append(i2);
                        throw new IOException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("DER length more than 4 bytes: ");
                    sb2.append(i3);
                    throw new IOException(sb2.toString());
                }
            }
            return read;
        }
    }

    public static C32391gH A02(AnonymousClass5J4 r2) {
        if (r2.A00 < 1) {
            return new C32391gH(0);
        }
        C33011hn r1 = new C33011hn((InputStream) r2);
        C32391gH r22 = new C32391gH();
        while (true) {
            C32051fZ A05 = r1.A05();
            if (A05 == null) {
                return r22;
            }
            r22.A02(A05);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0159, code lost:
        if (r1 != 8) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015b, code lost:
        r7[r3] = (char) ((r5[0] << 8) | (r5[1] & 255));
        r7[r3 + 1] = (char) ((r5[2] << 8) | (r5[3] & 255));
        r7[r3 + 2] = (char) ((r5[4] << 8) | (r5[5] & 255));
        r7[r3 + 3] = (char) ((r5[6] << 8) | (r5[7] & 255));
        r3 = r3 + 4;
        r9 = r9 - 8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b6 A[LOOP:4: B:100:0x01b6->B:101:0x01c8, LOOP_START, PHI: r3 r4 
      PHI: (r3v4 int) = (r3v2 int), (r3v5 int) binds: [B:97:0x01ae, B:101:0x01c8] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:97:0x01ae, B:101:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C32051fZ A03(X.AnonymousClass5J4 r10, byte[][] r11, int r12) {
        /*
            r0 = 10
            if (r12 == r0) goto L_0x01ee
            r0 = 12
            if (r12 == r0) goto L_0x01e4
            r0 = 30
            if (r12 == r0) goto L_0x0139
            switch(r12) {
                case 1: goto L_0x0115;
                case 2: goto L_0x010a;
                case 3: goto L_0x009a;
                case 4: goto L_0x0100;
                case 5: goto L_0x00fd;
                case 6: goto L_0x00e4;
                default: goto L_0x000f;
            }
        L_0x000f:
            switch(r12) {
                case 18: goto L_0x0090;
                case 19: goto L_0x0086;
                case 20: goto L_0x007c;
                case 21: goto L_0x0072;
                case 22: goto L_0x0068;
                case 23: goto L_0x005e;
                case 24: goto L_0x0054;
                case 25: goto L_0x004a;
                case 26: goto L_0x0040;
                case 27: goto L_0x0036;
                case 28: goto L_0x002c;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.String r0 = "unknown tag "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = " encountered"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x002c:
            byte[] r1 = r10.A01()
            X.5Il r0 = new X.5Il
            r0.<init>(r1)
            return r0
        L_0x0036:
            byte[] r1 = r10.A01()
            X.5If r0 = new X.5If
            r0.<init>(r1)
            return r0
        L_0x0040:
            byte[] r1 = r10.A01()
            X.5Ii r0 = new X.5Ii
            r0.<init>(r1)
            return r0
        L_0x004a:
            byte[] r1 = r10.A01()
            X.5Ic r0 = new X.5Ic
            r0.<init>(r1)
            return r0
        L_0x0054:
            byte[] r1 = r10.A01()
            X.5Ia r0 = new X.5Ia
            r0.<init>((byte[]) r1)
            return r0
        L_0x005e:
            byte[] r1 = r10.A01()
            X.5IX r0 = new X.5IX
            r0.<init>((byte[]) r1)
            return r0
        L_0x0068:
            byte[] r1 = r10.A01()
            X.1ho r0 = new X.1ho
            r0.<init>((byte[]) r1)
            return r0
        L_0x0072:
            byte[] r1 = r10.A01()
            X.5Id r0 = new X.5Id
            r0.<init>(r1)
            return r0
        L_0x007c:
            byte[] r1 = r10.A01()
            X.5Ih r0 = new X.5Ih
            r0.<init>(r1)
            return r0
        L_0x0086:
            byte[] r1 = r10.A01()
            X.5Ij r0 = new X.5Ij
            r0.<init>((byte[]) r1)
            return r0
        L_0x0090:
            byte[] r1 = r10.A01()
            X.5Ig r0 = new X.5Ig
            r0.<init>(r1)
            return r0
        L_0x009a:
            int r5 = r10.A00
            r4 = 1
            if (r5 < r4) goto L_0x00db
            int r3 = r10.read()
            int r5 = r5 - r4
            byte[] r2 = new byte[r5]
            if (r5 == 0) goto L_0x00d5
            r1 = 0
        L_0x00a9:
            if (r1 >= r5) goto L_0x00b5
            int r0 = r5 - r1
            int r0 = r10.read(r2, r1, r0)
            if (r0 < 0) goto L_0x00b5
            int r1 = r1 + r0
            goto L_0x00a9
        L_0x00b5:
            if (r1 != r5) goto L_0x00cd
            if (r3 <= 0) goto L_0x00d5
            r0 = 8
            if (r3 >= r0) goto L_0x00d5
            int r5 = r5 - r4
            byte r1 = r2[r5]
            r0 = 255(0xff, float:3.57E-43)
            int r0 = r0 << r3
            r0 = r0 & r1
            byte r0 = (byte) r0
            if (r1 == r0) goto L_0x00d5
            X.5HX r0 = new X.5HX
            r0.<init>(r2, r3)
            return r0
        L_0x00cd:
            java.lang.String r1 = "EOF encountered in middle of BIT STRING"
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>(r1)
            throw r0
        L_0x00d5:
            X.5HY r0 = new X.5HY
            r0.<init>(r2, r3)
            return r0
        L_0x00db:
            java.lang.String r1 = "truncated BIT STRING detected"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00e4:
            byte[] r2 = A04(r10, r11)
            X.1hw r1 = new X.1hw
            r1.<init>(r2)
            java.util.concurrent.ConcurrentMap r0 = X.C32041fY.A02
            java.lang.Object r0 = r0.get(r1)
            X.1fZ r0 = (X.C32051fZ) r0
            if (r0 != 0) goto L_0x00fc
            X.1fY r0 = new X.1fY
            r0.<init>((byte[]) r2)
        L_0x00fc:
            return r0
        L_0x00fd:
            X.5Hc r0 = X.C107275Hc.A00
            return r0
        L_0x0100:
            byte[] r1 = r10.A01()
            X.5IT r0 = new X.5IT
            r0.<init>(r1)
            return r0
        L_0x010a:
            byte[] r2 = r10.A01()
            r1 = 0
            X.1hq r0 = new X.1hq
            r0.<init>(r2, r1)
            return r0
        L_0x0115:
            byte[] r2 = A04(r10, r11)
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x0131
            r0 = 0
            byte r1 = r2[r0]
            r0 = -1
            if (r1 == r0) goto L_0x012e
            if (r1 == 0) goto L_0x012b
            X.1hr r0 = new X.1hr
            r0.<init>(r1)
            return r0
        L_0x012b:
            X.1hr r0 = X.C33051hr.A01
            return r0
        L_0x012e:
            X.1hr r0 = X.C33051hr.A02
            return r0
        L_0x0131:
            java.lang.String r1 = "BOOLEAN value should have 1 byte in it"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0139:
            int r9 = r10.A00
            r0 = r9 & 1
            if (r0 != 0) goto L_0x01dc
            int r8 = r9 >> 1
            char[] r7 = new char[r8]
            r6 = 8
            byte[] r5 = new byte[r6]
            r4 = 0
            r3 = 0
        L_0x0149:
            java.lang.String r2 = "EOF encountered in middle of BMPString"
            if (r9 < r6) goto L_0x019f
            r1 = 0
        L_0x014e:
            int r0 = r6 - r1
            int r0 = r10.read(r5, r1, r0)
            if (r0 < 0) goto L_0x0199
            int r1 = r1 + r0
            if (r1 < r6) goto L_0x014e
            if (r1 != r6) goto L_0x0199
            byte r1 = r5[r4]
            int r1 = r1 << r6
            r0 = 1
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r3] = r0
            int r2 = r3 + 1
            r0 = 2
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 3
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r2 = r3 + 2
            r0 = 4
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 5
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r2 = r3 + 3
            r0 = 6
            byte r1 = r5[r0]
            int r1 = r1 << r6
            r0 = 7
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            char r0 = (char) r1
            r7[r2] = r0
            int r3 = r3 + 4
            int r9 = r9 + -8
            goto L_0x0149
        L_0x0199:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>(r2)
            throw r0
        L_0x019f:
            if (r9 <= 0) goto L_0x01ca
            r1 = 0
        L_0x01a2:
            int r0 = r9 - r1
            int r0 = r10.read(r5, r1, r0)
            if (r0 < 0) goto L_0x01ae
            int r1 = r1 + r0
            if (r1 >= r9) goto L_0x01ae
            goto L_0x01a2
        L_0x01ae:
            if (r1 == r9) goto L_0x01b6
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>(r2)
            throw r0
        L_0x01b6:
            int r0 = r4 + 1
            byte r2 = r5[r4]
            int r2 = r2 << r6
            int r4 = r0 + 1
            byte r0 = r5[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r2 = r2 | r0
            char r0 = (char) r2
            r7[r3] = r0
            r3 = r1
            if (r4 < r9) goto L_0x01b6
        L_0x01ca:
            int r0 = r10.A00
            if (r0 != 0) goto L_0x01d6
            if (r8 != r3) goto L_0x01d6
            X.5Ie r0 = new X.5Ie
            r0.<init>(r7)
            return r0
        L_0x01d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x01dc:
            java.lang.String r1 = "malformed BMPString encoding encountered"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x01e4:
            byte[] r1 = r10.A01()
            X.5Ik r0 = new X.5Ik
            r0.<init>((byte[]) r1)
            return r0
        L_0x01ee:
            byte[] r3 = A04(r10, r11)
            int r1 = r3.length
            r0 = 1
            if (r1 > r0) goto L_0x0216
            if (r1 == 0) goto L_0x020e
            r0 = 0
            byte r0 = r3[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            X.5IZ[] r1 = X.AnonymousClass5IZ.A02
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0216
            r0 = r1[r2]
            if (r0 != 0) goto L_0x020d
            X.5IZ r0 = new X.5IZ
            r0.<init>((byte[]) r3)
            r1[r2] = r0
        L_0x020d:
            return r0
        L_0x020e:
            java.lang.String r1 = "ENUMERATED has zero length"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0216:
            X.5IZ r0 = new X.5IZ
            r0.<init>((byte[]) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33011hn.A03(X.5J4, byte[][], int):X.1fZ");
    }

    public static byte[] A04(AnonymousClass5J4 r6, byte[][] bArr) {
        int i2 = r6.A00;
        if (i2 >= bArr.length) {
            return r6.A01();
        }
        byte[] bArr2 = bArr[i2];
        if (bArr2 == null) {
            bArr2 = new byte[i2];
            bArr[i2] = bArr2;
        }
        int length = bArr2.length;
        if (i2 != length) {
            throw new IllegalArgumentException("buffer length not right for data");
        } else if (i2 == 0) {
            return bArr2;
        } else {
            int i3 = r6.A00;
            if (i2 < i3) {
                InputStream inputStream = r6.A01;
                int i4 = 0;
                while (i4 < length) {
                    int read = inputStream.read(bArr2, i4, length - i4);
                    if (read < 0) {
                        break;
                    }
                    i4 += read;
                }
                int i5 = i2 - i4;
                r6.A00 = i5;
                if (i5 == 0) {
                    r6.A00();
                    return bArr2;
                }
                StringBuilder sb = new StringBuilder("DEF length ");
                sb.append(r6.A01);
                sb.append(" object truncated by ");
                sb.append(i5);
                throw new EOFException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("corrupted stream - out of bounds length found: ");
            sb2.append(i2);
            sb2.append(" >= ");
            sb2.append(i3);
            throw new IOException(sb2.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.5Ib[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C32051fZ A05() {
        /*
            r8 = this;
            int r7 = r8.read()
            if (r7 > 0) goto L_0x0013
            if (r7 == 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            java.lang.String r1 = "unexpected end-of-contents marker"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0013:
            int r4 = A00(r8, r7)
            r2 = r7 & 32
            r1 = 0
            if (r2 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            int r3 = r8.A00
            r0 = 0
            int r0 = A01(r8, r3, r0)
            if (r0 >= 0) goto L_0x0092
            if (r1 == 0) goto L_0x008a
            X.5J3 r0 = new X.5J3
            r0.<init>(r8, r3)
            X.4WD r1 = new X.4WD
            r1.<init>(r0, r3)
            r0 = r7 & 64
            if (r0 == 0) goto L_0x0040
            X.59P r0 = new X.59P
            r0.<init>(r1, r4)
            X.1fZ r0 = r0.ADB()
            return r0
        L_0x0040:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            X.1fZ r0 = r1.A02(r4, r0)
            return r0
        L_0x004a:
            r0 = 4
            if (r4 == r0) goto L_0x0080
            r0 = 8
            if (r4 == r0) goto L_0x0076
            r0 = 16
            if (r4 == r0) goto L_0x006c
            r0 = 17
            if (r4 != r0) goto L_0x0063
            X.59U r0 = new X.59U
            r0.<init>(r1)
            X.1fZ r0 = r0.ADB()
            return r0
        L_0x0063:
            java.lang.String r1 = "unknown BER object encountered"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x006c:
            X.59S r0 = new X.59S
            r0.<init>(r1)
            X.1fZ r0 = r0.ADB()
            return r0
        L_0x0076:
            X.59O r0 = new X.59O
            r0.<init>(r1)
            X.1fZ r0 = r0.ADB()
            return r0
        L_0x0080:
            X.59Q r0 = new X.59Q
            r0.<init>(r1)
            X.1fZ r0 = r0.ADB()
            return r0
        L_0x008a:
            java.lang.String r1 = "indefinite-length primitive encoding encountered"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0092:
            r6 = 0
            r5 = 0
            if (r2 == 0) goto L_0x0097
            r5 = 1
        L_0x0097:
            X.5J4 r2 = new X.5J4     // Catch:{ IllegalArgumentException -> 0x0160 }
            r2.<init>(r8, r0, r3)     // Catch:{ IllegalArgumentException -> 0x0160 }
            r0 = r7 & 64
            if (r0 == 0) goto L_0x00aa
            byte[] r0 = r2.A01()     // Catch:{ IllegalArgumentException -> 0x0160 }
            X.5HW r3 = new X.5HW     // Catch:{ IllegalArgumentException -> 0x0160 }
            r3.<init>(r0, r4, r5)     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x00aa:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00bc
            int r1 = X.C32551gZ.A02(r2)     // Catch:{ IllegalArgumentException -> 0x0160 }
            X.4WD r0 = new X.4WD     // Catch:{ IllegalArgumentException -> 0x0160 }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x0160 }
            X.1fZ r3 = r0.A02(r4, r5)     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x00bc:
            if (r5 == 0) goto L_0x0159
            r0 = 4
            if (r4 == r0) goto L_0x0123
            r0 = 8
            if (r4 == r0) goto L_0x0119
            r0 = 16
            if (r4 == r0) goto L_0x00f9
            r0 = 17
            if (r4 != r0) goto L_0x00df
            X.1gH r2 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x0160 }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0160 }
            r0 = 1
            if (r1 >= r0) goto L_0x00d9
            X.5Iu r3 = X.C82004Aq.A01     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x00d9:
            X.5Is r3 = new X.5Is     // Catch:{ IllegalArgumentException -> 0x0160 }
            r3.<init>((X.C32391gH) r2)     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x00df:
            java.lang.String r0 = "unknown tag "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0160 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
            r1.append(r4)     // Catch:{ IllegalArgumentException -> 0x0160 }
            java.lang.String r0 = " encountered"
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0160 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IllegalArgumentException -> 0x0160 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
            goto L_0x0152
        L_0x00f9:
            boolean r0 = r8.A01     // Catch:{ IllegalArgumentException -> 0x0160 }
            if (r0 == 0) goto L_0x0107
            byte[] r0 = r2.A01()     // Catch:{ IllegalArgumentException -> 0x0160 }
            X.5Io r3 = new X.5Io     // Catch:{ IllegalArgumentException -> 0x0160 }
            r3.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x0107:
            X.1gH r2 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x0160 }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0160 }
            r0 = 1
            if (r1 >= r0) goto L_0x0113
            X.1gJ r3 = X.C82004Aq.A00     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x0113:
            X.5Iq r3 = new X.5Iq     // Catch:{ IllegalArgumentException -> 0x0160 }
            r3.<init>((X.C32391gH) r2)     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x0119:
            X.1gH r0 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x0160 }
            X.5HZ r3 = new X.5HZ     // Catch:{ IllegalArgumentException -> 0x0160 }
            r3.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x0123:
            X.1gH r4 = A02(r2)     // Catch:{ IllegalArgumentException -> 0x0160 }
            int r3 = r4.A00     // Catch:{ IllegalArgumentException -> 0x0160 }
            X.5Ib[] r1 = new X.C107405Ib[r3]     // Catch:{ IllegalArgumentException -> 0x0160 }
        L_0x012b:
            if (r6 == r3) goto L_0x0153
            X.1fb r2 = r4.A01(r6)     // Catch:{ IllegalArgumentException -> 0x0160 }
            boolean r0 = r2 instanceof X.C107405Ib     // Catch:{ IllegalArgumentException -> 0x0160 }
            if (r0 == 0) goto L_0x013a
            r1[r6] = r2     // Catch:{ IllegalArgumentException -> 0x0160 }
            int r6 = r6 + 1
            goto L_0x012b
        L_0x013a:
            java.lang.String r0 = "unknown object encountered in constructed OCTET STRING: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0160 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
            java.lang.Class r0 = r2.getClass()     // Catch:{ IllegalArgumentException -> 0x0160 }
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0160 }
            X.40L r1 = new X.40L     // Catch:{ IllegalArgumentException -> 0x0160 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0160 }
        L_0x0152:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0160 }
        L_0x0153:
            X.5IU r3 = new X.5IU     // Catch:{ IllegalArgumentException -> 0x0160 }
            r3.<init>((X.C107405Ib[]) r1)     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x0159:
            byte[][] r0 = r8.A02     // Catch:{ IllegalArgumentException -> 0x0160 }
            X.1fZ r3 = A03(r2, r0, r4)     // Catch:{ IllegalArgumentException -> 0x0160 }
            return r3
        L_0x0160:
            r2 = move-exception
            java.lang.String r1 = "corrupted stream detected"
            X.40L r0 = new X.40L
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33011hn.A05():X.1fZ");
    }
}
