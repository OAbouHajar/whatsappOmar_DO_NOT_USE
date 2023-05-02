package X;

import android.util.Log;

/* renamed from: X.5v9  reason: invalid class name and case insensitive filesystem */
public class C118725v9 {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C118725v9(byte[] bArr, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = bArr;
    }

    public static void A00(Throwable th) {
        Log.e("ExifReader", "IOException occurred while closing InputStream", th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x013a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x013b, code lost:
        A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x013e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x013f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0222, code lost:
        if (r5 != null) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0227, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0228, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0229, code lost:
        A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x022c, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0234 A[SYNTHETIC, Splitter:B:159:0x0234] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.nio.ByteOrder r23) {
        /*
            r22 = this;
            java.lang.String r6 = "IOException occurred while closing InputStream"
            r21 = 0
            r1 = r22
            byte[] r7 = r1.A02     // Catch:{ IOException -> 0x0218, all -> 0x0231 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0218, all -> 0x0231 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0218, all -> 0x0231 }
            X.635 r5 = new X.635     // Catch:{ IOException -> 0x0218, all -> 0x0231 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0218, all -> 0x0231 }
            r0 = r23
            r5.A02 = r0     // Catch:{ IOException -> 0x0216 }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0216 }
            r10 = 1
            r4 = 0
            switch(r0) {
                case 1: goto L_0x001f;
                case 2: goto L_0x0051;
                case 3: goto L_0x0090;
                case 4: goto L_0x00a9;
                case 5: goto L_0x00c9;
                case 6: goto L_0x001f;
                case 7: goto L_0x0051;
                case 8: goto L_0x00ea;
                case 9: goto L_0x0103;
                case 10: goto L_0x011c;
                case 11: goto L_0x0140;
                case 12: goto L_0x015e;
                default: goto L_0x001d;
            }     // Catch:{ IOException -> 0x0216 }
        L_0x001d:
            goto L_0x0224
        L_0x001f:
            int r0 = r7.length     // Catch:{ IOException -> 0x0216 }
            if (r0 != r10) goto L_0x003e
            byte r0 = r7[r4]     // Catch:{ IOException -> 0x0216 }
            if (r0 < 0) goto L_0x003e
            if (r0 > r10) goto L_0x003e
            char[] r2 = new char[r10]     // Catch:{ IOException -> 0x0216 }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x0216 }
            r2[r4] = r0     // Catch:{ IOException -> 0x0216 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0216 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0216 }
            r5.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003d
        L_0x0038:
            r0 = move-exception
            A00(r0)
            return r1
        L_0x003d:
            return r1
        L_0x003e:
            java.nio.charset.Charset r0 = X.C119205wi.A04     // Catch:{ IOException -> 0x0216 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0216 }
            r2.<init>(r7, r0)     // Catch:{ IOException -> 0x0216 }
            r5.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r6, r1)
            return r2
        L_0x0050:
            return r2
        L_0x0051:
            int r9 = r1.A01     // Catch:{ IOException -> 0x0216 }
            byte[] r8 = X.C119205wi.A07     // Catch:{ IOException -> 0x0216 }
            int r3 = r8.length     // Catch:{ IOException -> 0x0216 }
            if (r9 < r3) goto L_0x0069
            r2 = 0
        L_0x0059:
            if (r2 >= r3) goto L_0x0066
            byte r1 = r7[r2]     // Catch:{ IOException -> 0x0216 }
            byte r0 = r8[r2]     // Catch:{ IOException -> 0x0216 }
            if (r1 == r0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x0059
        L_0x0065:
            r10 = 0
        L_0x0066:
            if (r10 == 0) goto L_0x0069
            r4 = r3
        L_0x0069:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0216 }
        L_0x006d:
            if (r4 >= r9) goto L_0x0080
            byte r2 = r7[r4]     // Catch:{ IOException -> 0x0216 }
            if (r2 == 0) goto L_0x0080
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x007a
            char r0 = (char) r2     // Catch:{ IOException -> 0x0216 }
        L_0x007a:
            r3.append(r0)     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x006d
        L_0x0080:
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0216 }
            r5.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008f
        L_0x0088:
            r1 = move-exception
            java.lang.String r0 = "ExifReader"
            android.util.Log.e(r0, r6, r1)
            return r2
        L_0x008f:
            return r2
        L_0x0090:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0216 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0216 }
        L_0x0094:
            if (r4 >= r2) goto L_0x009f
            int r0 = r5.A02()     // Catch:{ IOException -> 0x0216 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x0094
        L_0x009f:
            r5.close()     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00a8
        L_0x00a3:
            r0 = move-exception
            A00(r0)
            return r1
        L_0x00a8:
            return r1
        L_0x00a9:
            int r7 = r1.A01     // Catch:{ IOException -> 0x0216 }
            long[] r6 = new long[r7]     // Catch:{ IOException -> 0x0216 }
        L_0x00ad:
            if (r4 >= r7) goto L_0x00bf
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0216 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0216 }
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            r6[r4] = r2     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x00ad
        L_0x00bf:
            r5.close()     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00c8
        L_0x00c3:
            r0 = move-exception
            A00(r0)
            return r6
        L_0x00c8:
            return r6
        L_0x00c9:
            int r10 = r1.A01     // Catch:{ IOException -> 0x0216 }
            X.5tx[] r3 = new X.C118035tx[r10]     // Catch:{ IOException -> 0x0216 }
        L_0x00cd:
            if (r4 >= r10) goto L_0x0136
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0216 }
            long r6 = (long) r0     // Catch:{ IOException -> 0x0216 }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0216 }
            long r1 = (long) r0     // Catch:{ IOException -> 0x0216 }
            long r1 = r1 & r8
            X.5tx r0 = new X.5tx     // Catch:{ IOException -> 0x0216 }
            r0.<init>(r6, r1)     // Catch:{ IOException -> 0x0216 }
            r3[r4] = r0     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x00cd
        L_0x00ea:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0216 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0216 }
        L_0x00ee:
            if (r4 >= r2) goto L_0x00f9
            short r0 = r5.A04()     // Catch:{ IOException -> 0x0216 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x00ee
        L_0x00f9:
            r5.close()     // Catch:{ IOException -> 0x00fd }
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            A00(r0)
            return r1
        L_0x0102:
            return r1
        L_0x0103:
            int r2 = r1.A01     // Catch:{ IOException -> 0x0216 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0216 }
        L_0x0107:
            if (r4 >= r2) goto L_0x0112
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0216 }
            r1[r4] = r0     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x0107
        L_0x0112:
            r5.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x011b
        L_0x0116:
            r0 = move-exception
            A00(r0)
            return r1
        L_0x011b:
            return r1
        L_0x011c:
            int r8 = r1.A01     // Catch:{ IOException -> 0x0216 }
            X.5tx[] r3 = new X.C118035tx[r8]     // Catch:{ IOException -> 0x0216 }
        L_0x0120:
            if (r4 >= r8) goto L_0x0136
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0216 }
            long r6 = (long) r0     // Catch:{ IOException -> 0x0216 }
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0216 }
            long r1 = (long) r0     // Catch:{ IOException -> 0x0216 }
            X.5tx r0 = new X.5tx     // Catch:{ IOException -> 0x0216 }
            r0.<init>(r6, r1)     // Catch:{ IOException -> 0x0216 }
            r3[r4] = r0     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x0120
        L_0x0136:
            r5.close()     // Catch:{ IOException -> 0x013a }
            goto L_0x013f
        L_0x013a:
            r0 = move-exception
            A00(r0)
            return r3
        L_0x013f:
            return r3
        L_0x0140:
            int r3 = r1.A01     // Catch:{ IOException -> 0x0216 }
            double[] r2 = new double[r3]     // Catch:{ IOException -> 0x0216 }
        L_0x0144:
            if (r4 >= r3) goto L_0x0154
            int r0 = r5.A01()     // Catch:{ IOException -> 0x0216 }
            float r0 = java.lang.Float.intBitsToFloat(r0)     // Catch:{ IOException -> 0x0216 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0216 }
            r2[r4] = r0     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x0144
        L_0x0154:
            r5.close()     // Catch:{ IOException -> 0x0158 }
            goto L_0x015d
        L_0x0158:
            r0 = move-exception
            A00(r0)
            return r2
        L_0x015d:
            return r2
        L_0x015e:
            int r15 = r1.A01     // Catch:{ IOException -> 0x0216 }
            double[] r14 = new double[r15]     // Catch:{ IOException -> 0x0216 }
        L_0x0162:
            if (r4 >= r15) goto L_0x020c
            int r0 = r5.A00     // Catch:{ IOException -> 0x0216 }
            int r1 = r0 + 8
            r5.A00 = r1     // Catch:{ IOException -> 0x0216 }
            int r0 = r5.A03     // Catch:{ IOException -> 0x0216 }
            if (r1 > r0) goto L_0x0200
            java.io.DataInputStream r0 = r5.A01     // Catch:{ IOException -> 0x0216 }
            int r11 = r0.read()     // Catch:{ IOException -> 0x0216 }
            int r10 = r0.read()     // Catch:{ IOException -> 0x0216 }
            int r13 = r0.read()     // Catch:{ IOException -> 0x0216 }
            int r12 = r0.read()     // Catch:{ IOException -> 0x0216 }
            int r7 = r0.read()     // Catch:{ IOException -> 0x0216 }
            int r6 = r0.read()     // Catch:{ IOException -> 0x0216 }
            int r9 = r0.read()     // Catch:{ IOException -> 0x0216 }
            int r8 = r0.read()     // Catch:{ IOException -> 0x0216 }
            r0 = r11 | r10
            r0 = r0 | r13
            r0 = r0 | r12
            r0 = r0 | r7
            r0 = r0 | r6
            r0 = r0 | r9
            r0 = r0 | r8
            if (r0 < 0) goto L_0x0206
            java.nio.ByteOrder r2 = r5.A02     // Catch:{ IOException -> 0x0216 }
            java.nio.ByteOrder r0 = X.AnonymousClass635.A05     // Catch:{ IOException -> 0x0216 }
            r20 = 16
            r19 = 24
            r18 = 32
            r17 = 40
            r16 = 48
            r1 = 56
            if (r2 != r0) goto L_0x01c9
            long r2 = (long) r8     // Catch:{ IOException -> 0x0216 }
            long r2 = r2 << r1
            long r0 = (long) r9     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r6     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r7     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r10     // Catch:{ IOException -> 0x0216 }
            r6 = 8
            long r0 = r0 << r6
            long r2 = r2 + r0
            long r0 = (long) r11     // Catch:{ IOException -> 0x0216 }
            goto L_0x01e9
        L_0x01c9:
            java.nio.ByteOrder r0 = X.AnonymousClass635.A04     // Catch:{ IOException -> 0x0216 }
            if (r2 != r0) goto L_0x01f4
            long r2 = (long) r11     // Catch:{ IOException -> 0x0216 }
            long r2 = r2 << r1
            long r0 = (long) r10     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r16
            long r2 = r2 + r0
            long r0 = (long) r13     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r17
            long r2 = r2 + r0
            long r0 = (long) r12     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r18
            long r2 = r2 + r0
            long r0 = (long) r7     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r19
            long r2 = r2 + r0
            long r0 = (long) r6     // Catch:{ IOException -> 0x0216 }
            long r0 = r0 << r20
            long r2 = r2 + r0
            long r0 = (long) r9     // Catch:{ IOException -> 0x0216 }
            r6 = 8
            long r0 = r0 << r6
            long r2 = r2 + r0
            long r0 = (long) r8     // Catch:{ IOException -> 0x0216 }
        L_0x01e9:
            long r2 = r2 + r0
            double r0 = java.lang.Double.longBitsToDouble(r2)     // Catch:{ IOException -> 0x0216 }
            r14[r4] = r0     // Catch:{ IOException -> 0x0216 }
            int r4 = r4 + 1
            goto L_0x0162
        L_0x01f4:
            java.lang.String r0 = "Invalid byte order: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r2)     // Catch:{ IOException -> 0x0216 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0216 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0216 }
            goto L_0x020b
        L_0x0200:
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ IOException -> 0x0216 }
            r1.<init>()     // Catch:{ IOException -> 0x0216 }
            goto L_0x020b
        L_0x0206:
            java.io.EOFException r1 = new java.io.EOFException     // Catch:{ IOException -> 0x0216 }
            r1.<init>()     // Catch:{ IOException -> 0x0216 }
        L_0x020b:
            throw r1     // Catch:{ IOException -> 0x0216 }
        L_0x020c:
            r5.close()     // Catch:{ IOException -> 0x0210 }
            goto L_0x0215
        L_0x0210:
            r0 = move-exception
            A00(r0)
            return r14
        L_0x0215:
            return r14
        L_0x0216:
            r2 = move-exception
            goto L_0x021b
        L_0x0218:
            r2 = move-exception
            r5 = r21
        L_0x021b:
            java.lang.String r1 = "ExifReader"
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x022d }
            if (r5 == 0) goto L_0x022c
        L_0x0224:
            r5.close()     // Catch:{ IOException -> 0x0228 }
            return r21
        L_0x0228:
            r0 = move-exception
            A00(r0)
        L_0x022c:
            return r21
        L_0x022d:
            r1 = move-exception
            r21 = r5
            goto L_0x0232
        L_0x0231:
            r1 = move-exception
        L_0x0232:
            if (r21 == 0) goto L_0x023c
            r21.close()     // Catch:{ IOException -> 0x0238 }
            throw r1
        L_0x0238:
            r0 = move-exception
            A00(r0)
        L_0x023c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118725v9.A01(java.nio.ByteOrder):java.lang.Object");
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("(");
        A0r.append(C119205wi.A0E[this.A00]);
        A0r.append(", data length:");
        A0r.append(this.A02.length);
        return AnonymousClass000.A0h(")", A0r);
    }
}
