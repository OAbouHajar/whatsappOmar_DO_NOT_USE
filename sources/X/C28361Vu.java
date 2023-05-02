package X;

import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1Vu  reason: invalid class name and case insensitive filesystem */
public class C28361Vu {
    public byte[] A00;
    public final C16300so A01;
    public final C46822Gj A02;
    public final C46832Gk A03;

    public C28361Vu(C16300so r1, C46822Gj r2, C46832Gk r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public static void A00(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int read = inputStream.read(bArr, i2, length - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new IOException("ran out of bytes while reading into buffer");
            }
        }
    }

    public static byte[] A01(InputStream inputStream, int i2) {
        int i3;
        int read = inputStream.read();
        int i4 = 0;
        if ((read & 128) != 0) {
            i4 = 1;
        }
        int i5 = read & 127;
        byte[] bArr = new byte[i5];
        A00(inputStream, bArr);
        int i6 = (i5 << 1) - i4;
        byte[] bArr2 = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = (1 - (i7 % 2)) << 2;
            int i9 = (bArr[i7 >> 1] & (15 << i8)) >> i8;
            if (i2 == 251) {
                switch (i9) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i3 = (i9 - 10) + 65;
                        continue;
                    default:
                        StringBuilder sb = new StringBuilder("bad hex ");
                        sb.append(i9);
                        throw new AnonymousClass1W9(sb.toString());
                }
            } else if (i2 == 255) {
                switch (i9) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    case 10:
                    case 11:
                        i3 = (i9 - 10) + 45;
                        continue;
                    default:
                        StringBuilder sb2 = new StringBuilder("bad nibble ");
                        sb2.append(i9);
                        throw new AnonymousClass1W9(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder("bad packed type ");
                sb3.append(i2);
                throw new AnonymousClass1W9(sb3.toString());
            }
            i3 = i9 + 48;
            bArr2[i7] = (byte) i3;
        }
        return bArr2;
    }

    public final int A02(InputStream inputStream, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 248) {
            return inputStream.read();
        }
        if (i2 == 249) {
            return (inputStream.read() << 8) + inputStream.read();
        }
        StringBuilder sb = new StringBuilder("invalid list size in readListSize: token ");
        sb.append(i2);
        throw new AnonymousClass1W9(sb.toString(), A05());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28371Vv A03() {
        /*
            r8 = this;
            X.2Gk r7 = r8.A03
            java.lang.String r0 = "frameInputStream is null"
            X.AnonymousClass00B.A07(r7, r0)
        L_0x0007:
            X.2Gx r1 = r7.A00     // Catch:{ 2H0 -> 0x009f }
            r0 = 3
            byte[] r0 = r1.A00(r0)     // Catch:{ 2H0 -> 0x009f }
            int r0 = X.C28641Wx.A01(r0)     // Catch:{ 2H0 -> 0x009f }
            byte[] r4 = r1.A00(r0)     // Catch:{ 2H0 -> 0x009f }
            X.2Gy r0 = r7.A01     // Catch:{ 2H0 -> 0x009f }
            X.2Gz r3 = r0.A03     // Catch:{ 2H0 -> 0x009f }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A00     // Catch:{ 2H0 -> 0x009f }
            long r1 = r0.getAndIncrement()     // Catch:{ 2H0 -> 0x009f }
            r0 = 0
            byte[] r0 = new byte[r0]     // Catch:{ 2H0 -> 0x009f }
            byte[] r6 = r3.A02(r0, r4, r1)     // Catch:{ 2H0 -> 0x009f }
            int r5 = r6.length
            if (r5 == 0) goto L_0x0007
            r0 = 1
            if (r5 == r0) goto L_0x0097
            r4 = 0
            byte r3 = r6[r4]
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0079
            r2 = 1
            int r5 = r5 - r2
            byte[] r1 = new byte[r2]
            r1[r4] = r3
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r6, r2, r5)
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream
            r3.<init>(r0)
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0071 }
            r2.<init>(r0)     // Catch:{ all -> 0x0071 }
            r2.write(r1)     // Catch:{ all -> 0x006c }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x006c }
            int r0 = r3.read(r1)     // Catch:{ all -> 0x006c }
        L_0x0054:
            if (r0 < 0) goto L_0x005e
            r2.write(r1, r4, r0)     // Catch:{ all -> 0x006c }
            int r0 = r3.read(r1)     // Catch:{ all -> 0x006c }
            goto L_0x0054
        L_0x005e:
            r3.close()     // Catch:{ all -> 0x006c }
            r2.close()     // Catch:{ all -> 0x006c }
            byte[] r6 = r2.toByteArray()     // Catch:{ all -> 0x006c }
            r2.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0076
        L_0x006c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            throw r0
        L_0x0076:
            r3.close()
        L_0x0079:
            r8.A00 = r6
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            int r0 = r1.read()
            byte r0 = (byte) r0
            r0 = r0 & 1
            if (r0 != 0) goto L_0x008e
            X.1Vv r0 = r8.A04(r1)
            return r0
        L_0x008e:
            java.lang.String r1 = "server to client stanza fragmentation not supported"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0097:
            java.lang.String r1 = "header only frame received"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x009f:
            r1 = move-exception
            X.2H1 r0 = new X.2H1
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28361Vu.A03():X.1Vv");
    }

    public final C28371Vv A04(InputStream inputStream) {
        C35081lL[] r4;
        String str;
        C35081lL r2;
        byte[] A012;
        int read;
        int A022 = A02(inputStream, inputStream.read());
        int read2 = inputStream.read();
        if (read2 == 2) {
            return null;
        }
        String A08 = A08(inputStream, read2);
        if (A022 == 0 || A08 == null) {
            throw new AnonymousClass1W9("nextTree sees 0 list or null tag", A05());
        }
        int i2 = A022 - 2;
        int i3 = A022 % 2;
        int i4 = (i2 + i3) / 2;
        if (i4 == 0) {
            r4 = null;
        } else {
            r4 = new C35081lL[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                String A082 = A08(inputStream, inputStream.read());
                int read3 = inputStream.read();
                if (read3 == 247) {
                    str = A06(inputStream);
                    r2 = new C35081lL(Jid.get(str), A082);
                } else if (read3 != 250) {
                    r2 = new C35081lL(A082, A08(inputStream, read3));
                } else {
                    str = A07(inputStream);
                    try {
                        r2 = new C35081lL(Jid.get(str), A082);
                    } catch (AnonymousClass1W4 unused) {
                        r2 = new C35081lL(A082, str);
                    }
                }
                r4[i5] = r2;
            }
        }
        if (i3 == 1) {
            return new C28371Vv(A08, r4);
        }
        int read4 = inputStream.read();
        if (read4 == 0 || read4 == 248 || read4 == 249) {
            int A023 = A02(inputStream, read4);
            C28371Vv[] r22 = new C28371Vv[A023];
            for (int i6 = 0; i6 < A023; i6++) {
                r22[i6] = A04(inputStream);
            }
            return new C28371Vv(A08, r4, r22);
        }
        if (read4 == 252) {
            read = inputStream.read();
        } else if (read4 == 253) {
            read = ((inputStream.read() & 15) << 16) + (inputStream.read() << 8) + inputStream.read();
        } else if (read4 == 254) {
            read = inputStream.read() | ((inputStream.read() & 127) << 24) | (inputStream.read() << 16) | (inputStream.read() << 8);
        } else if (read4 != 255 && read4 != 251) {
            return new C28371Vv(A08, A08(inputStream, read4), r4);
        } else {
            A012 = A01(inputStream, read4);
            return new C28371Vv(A08, A012, r4);
        }
        A012 = new byte[read];
        A00(inputStream, A012);
        return new C28371Vv(A08, A012, r4);
    }

    public String A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("size = ");
        int length = bArr.length;
        sb.append(Integer.toString(length));
        sb.append('<');
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(Integer.toString(bArr[i2] & 255));
            if (((long) sb.length()) >= 262144) {
                break;
            }
        }
        if (((long) sb.length()) < 262144) {
            sb.append('>');
        } else {
            sb.append("...");
        }
        return sb.toString();
    }

    public final String A06(InputStream inputStream) {
        String obj;
        int read = inputStream.read() & MotionEventCompat.ACTION_MASK;
        int read2 = inputStream.read() & MotionEventCompat.ACTION_MASK;
        String A08 = A08(inputStream, inputStream.read());
        String str = read == 1 ? "lid" : "s.whatsapp.net";
        if (TextUtils.isEmpty(A08)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A08);
        if (read2 == 0) {
            obj = "";
        } else {
            StringBuilder sb2 = new StringBuilder(":");
            sb2.append(read2);
            obj = sb2.toString();
        }
        sb.append(obj);
        sb.append('@');
        sb.append(str);
        return sb.toString();
    }

    public final String A07(InputStream inputStream) {
        String A08 = A08(inputStream, inputStream.read());
        String A082 = A08(inputStream, inputStream.read());
        if (TextUtils.isEmpty(A08)) {
            return A082;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A08);
        sb.append('@');
        sb.append(A082);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        throw new X.AnonymousClass1W9("invalid token index in getToken()", A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010e, code lost:
        throw new X.AnonymousClass1W9("invalid token index in getToken()", A05());
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: NullPointerException (unused java.lang.NullPointerException), SYNTHETIC, Splitter:B:9:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ExcHandler: NullPointerException (unused java.lang.NullPointerException), SYNTHETIC, Splitter:B:44:0x00cb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A08(java.io.InputStream r5, int r6) {
        /*
            r4 = this;
            r0 = -1
            if (r6 == r0) goto L_0x0119
            r0 = 2
            if (r6 <= r0) goto L_0x004b
            r0 = 236(0xec, float:3.31E-43)
            if (r6 >= r0) goto L_0x004f
            r3 = 0
            java.lang.String[] r0 = X.AnonymousClass2H2.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0024 }
            r2 = r0[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0024 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            r1.<init>()     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            java.lang.String r0 = "Token was null for singlebyte idx: "
            r1.append(r0)     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            r1.append(r6)     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            java.lang.String r0 = r1.toString()     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            X.AnonymousClass00B.A07(r2, r0)     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            return r2
        L_0x0024:
            r2 = move-exception
            java.lang.String r0 = "Fail while trying to access WapDict, dictNum="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            r1.<init>(r0)     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            r1.append(r3)     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            r1.append(r6)     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            java.lang.String r0 = r1.toString()     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
            throw r2     // Catch:{ NullPointerException -> 0x003f, NullPointerException -> 0x003f }
        L_0x003f:
            java.lang.String r2 = r4.A05()
            java.lang.String r1 = "invalid token index in getToken()"
            X.1W9 r0 = new X.1W9
            r0.<init>(r1, r2)
            throw r0
        L_0x004b:
            if (r6 != 0) goto L_0x004f
            r0 = 0
            return r0
        L_0x004f:
            r0 = 247(0xf7, float:3.46E-43)
            if (r6 == r0) goto L_0x010f
            switch(r6) {
                case 236: goto L_0x00bf;
                case 237: goto L_0x00bf;
                case 238: goto L_0x00bf;
                case 239: goto L_0x00bf;
                default: goto L_0x0056;
            }
        L_0x0056:
            switch(r6) {
                case 250: goto L_0x0065;
                case 251: goto L_0x006f;
                case 252: goto L_0x007b;
                case 253: goto L_0x0080;
                case 254: goto L_0x0095;
                case 255: goto L_0x006f;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.String r2 = r4.A05()
            java.lang.String r1 = "readString couldn't match token"
            X.1W9 r0 = new X.1W9
            r0.<init>(r1, r2)
            throw r0
        L_0x0065:
            java.lang.String r0 = "Unexpected ReadString for token JID_PAIR"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r2 = r4.A07(r5)
            return r2
        L_0x006f:
            byte[] r1 = A01(r5, r6)
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x00bd }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00bd }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00bd }
            return r2
        L_0x007b:
            int r1 = r5.read()
            goto L_0x00b0
        L_0x0080:
            int r0 = r5.read()
            r1 = r0 & 15
            int r0 = r5.read()
            int r2 = r5.read()
            int r1 = r1 << 16
            int r0 = r0 << 8
            int r1 = r1 + r0
            int r1 = r1 + r2
            goto L_0x00b0
        L_0x0095:
            int r0 = r5.read()
            r2 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r5.read()
            int r3 = r5.read()
            int r1 = r5.read()
            int r2 = r2 << 24
            int r0 = r0 << 16
            r2 = r2 | r0
            int r0 = r3 << 8
            r2 = r2 | r0
            r1 = r1 | r2
        L_0x00b0:
            byte[] r1 = new byte[r1]
            A00(r5, r1)
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x00bd }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00bd }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00bd }
            return r2
        L_0x00bd:
            r2 = 0
            return r2
        L_0x00bf:
            int r3 = r5.read()
            java.lang.String[][] r1 = X.AnonymousClass2H2.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00e8 }
            int r0 = r6 + -236
            r0 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00e8 }
            r2 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00e8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            r1.<init>()     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            java.lang.String r0 = "Token was null for doublebyte dictNum="
            r1.append(r0)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            r1.append(r6)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            r1.append(r3)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            java.lang.String r0 = r1.toString()     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            X.AnonymousClass00B.A07(r2, r0)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            return r2
        L_0x00e8:
            r2 = move-exception
            java.lang.String r0 = "Fail while trying to access WapDict, dictNum="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            r1.<init>(r0)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            r1.append(r6)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            java.lang.String r0 = ", dictIdx="
            r1.append(r0)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            r1.append(r3)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            java.lang.String r0 = r1.toString()     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
            throw r2     // Catch:{ NullPointerException -> 0x0103, NullPointerException -> 0x0103 }
        L_0x0103:
            java.lang.String r2 = r4.A05()
            java.lang.String r1 = "invalid token index in getToken()"
            X.1W9 r0 = new X.1W9
            r0.<init>(r1, r2)
            throw r0
        L_0x010f:
            java.lang.String r0 = "Unexpected ReadString for token JID_4"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r2 = r4.A06(r5)
            return r2
        L_0x0119:
            java.lang.String r2 = r4.A05()
            java.lang.String r1 = "-1 token in readString"
            X.1W9 r0 = new X.1W9
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28361Vu.A08(java.io.InputStream, int):java.lang.String");
    }
}
