package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0Ww  reason: invalid class name and case insensitive filesystem */
public class C06590Ww {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public C06590Ww(long j2, byte[] bArr, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = j2;
        this.A03 = bArr;
    }

    public static C06590Ww A00(String str) {
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(0);
        byte[] bytes = A0q.toString().getBytes(C007703o.A0K);
        return new C06590Ww(-1, bytes, 2, bytes.length);
    }

    public static C06590Ww A01(ByteOrder byteOrder, int[] iArr) {
        int i2 = C007703o.A0s[3];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i2 * r5)]);
        wrap.order(byteOrder);
        for (int i3 : iArr) {
            wrap.putShort((short) i3);
        }
        return new C06590Ww(-1, wrap.array(), 3, r5);
    }

    public static C06590Ww A02(ByteOrder byteOrder, long[] jArr) {
        int i2 = C007703o.A0s[4];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i2 * r6)]);
        wrap.order(byteOrder);
        for (long j2 : jArr) {
            wrap.putInt((int) j2);
        }
        return new C06590Ww(-1, wrap.array(), 4, r6);
    }

    public static C06590Ww A03(ByteOrder byteOrder, AnonymousClass0PQ[] r9) {
        int i2 = C007703o.A0s[5];
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i2 * r7)]);
        wrap.order(byteOrder);
        for (AnonymousClass0PQ r3 : r9) {
            wrap.putInt((int) r3.A01);
            wrap.putInt((int) r3.A00);
        }
        return new C06590Ww(-1, wrap.array(), 5, r7);
    }

    public int A04(ByteOrder byteOrder) {
        Object A05 = A05(byteOrder);
        if (A05 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (A05 instanceof String) {
            return Integer.parseInt((String) A05);
        } else {
            if (A05 instanceof long[]) {
                long[] jArr = (long[]) A05;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (A05 instanceof int[]) {
                int[] iArr = (int[]) A05;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0161, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0162, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0165, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0166, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0170, code lost:
        if (r6 != null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0175, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0176, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0177, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x017a, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0181 A[SYNTHETIC, Splitter:B:144:0x0181] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A05(java.nio.ByteOrder r14) {
        /*
            r13 = this;
            java.lang.String r5 = "IOException occurred while closing InputStream"
            java.lang.String r4 = "ExifInterface"
            r12 = 0
            byte[] r8 = r13.A03     // Catch:{ IOException -> 0x0169, all -> 0x017e }
            X.0JA r6 = new X.0JA     // Catch:{ IOException -> 0x0169, all -> 0x017e }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0169, all -> 0x017e }
            r6.A01 = r14     // Catch:{ IOException -> 0x0167 }
            int r0 = r13.A00     // Catch:{ IOException -> 0x0167 }
            r11 = 1
            r7 = 0
            switch(r0) {
                case 1: goto L_0x0017;
                case 2: goto L_0x0047;
                case 3: goto L_0x0084;
                case 4: goto L_0x009d;
                case 5: goto L_0x00bd;
                case 6: goto L_0x0017;
                case 7: goto L_0x0047;
                case 8: goto L_0x00e8;
                case 9: goto L_0x0101;
                case 10: goto L_0x011a;
                case 11: goto L_0x013e;
                case 12: goto L_0x014e;
                default: goto L_0x0015;
            }     // Catch:{ IOException -> 0x0167 }
        L_0x0015:
            goto L_0x0172
        L_0x0017:
            int r0 = r8.length     // Catch:{ IOException -> 0x0167 }
            if (r0 != r11) goto L_0x0036
            byte r0 = r8[r7]     // Catch:{ IOException -> 0x0167 }
            if (r0 < 0) goto L_0x0036
            if (r0 > r11) goto L_0x0036
            char[] r2 = new char[r11]     // Catch:{ IOException -> 0x0167 }
            int r0 = r0 + 48
            char r0 = (char) r0     // Catch:{ IOException -> 0x0167 }
            r2[r7] = r0     // Catch:{ IOException -> 0x0167 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0167 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0167 }
            r6.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0035
        L_0x0030:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0035:
            return r1
        L_0x0036:
            java.nio.charset.Charset r0 = X.C007703o.A0K     // Catch:{ IOException -> 0x0167 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0167 }
            r1.<init>(r8, r0)     // Catch:{ IOException -> 0x0167 }
            r6.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0046
        L_0x0041:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0046:
            return r1
        L_0x0047:
            int r10 = r13.A01     // Catch:{ IOException -> 0x0167 }
            byte[] r9 = X.C007703o.A0U     // Catch:{ IOException -> 0x0167 }
            int r3 = r9.length     // Catch:{ IOException -> 0x0167 }
            if (r10 < r3) goto L_0x005f
            r2 = 0
        L_0x004f:
            if (r2 >= r3) goto L_0x005c
            byte r1 = r8[r2]     // Catch:{ IOException -> 0x0167 }
            byte r0 = r9[r2]     // Catch:{ IOException -> 0x0167 }
            if (r1 == r0) goto L_0x0058
            goto L_0x005b
        L_0x0058:
            int r2 = r2 + 1
            goto L_0x004f
        L_0x005b:
            r11 = 0
        L_0x005c:
            if (r11 == 0) goto L_0x005f
            r7 = r3
        L_0x005f:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ IOException -> 0x0167 }
        L_0x0063:
            if (r7 >= r10) goto L_0x0076
            byte r2 = r8[r7]     // Catch:{ IOException -> 0x0167 }
            if (r2 == 0) goto L_0x0076
            r1 = 32
            r0 = 63
            if (r2 < r1) goto L_0x0070
            char r0 = (char) r2     // Catch:{ IOException -> 0x0167 }
        L_0x0070:
            r3.append(r0)     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x0063
        L_0x0076:
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0167 }
            r6.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0083
        L_0x007e:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0083:
            return r1
        L_0x0084:
            int r2 = r13.A01     // Catch:{ IOException -> 0x0167 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0167 }
        L_0x0088:
            if (r7 >= r2) goto L_0x0093
            int r0 = r6.readUnsignedShort()     // Catch:{ IOException -> 0x0167 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x0088
        L_0x0093:
            r6.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x009c
        L_0x0097:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x009c:
            return r1
        L_0x009d:
            int r9 = r13.A01     // Catch:{ IOException -> 0x0167 }
            long[] r8 = new long[r9]     // Catch:{ IOException -> 0x0167 }
        L_0x00a1:
            if (r7 >= r9) goto L_0x00b3
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0167 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0167 }
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r8[r7] = r0     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x00a1
        L_0x00b3:
            r6.close()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00bc
        L_0x00b7:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r8
        L_0x00bc:
            return r8
        L_0x00bd:
            int r11 = r13.A01     // Catch:{ IOException -> 0x0167 }
            X.0PQ[] r10 = new X.AnonymousClass0PQ[r11]     // Catch:{ IOException -> 0x0167 }
        L_0x00c1:
            if (r7 >= r11) goto L_0x00de
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0167 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0167 }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r8
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0167 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0167 }
            long r0 = r0 & r8
            X.0PQ r8 = new X.0PQ     // Catch:{ IOException -> 0x0167 }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x0167 }
            r10[r7] = r8     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x00c1
        L_0x00de:
            r6.close()     // Catch:{ IOException -> 0x00e2 }
            goto L_0x00e7
        L_0x00e2:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r10
        L_0x00e7:
            return r10
        L_0x00e8:
            int r2 = r13.A01     // Catch:{ IOException -> 0x0167 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0167 }
        L_0x00ec:
            if (r7 >= r2) goto L_0x00f7
            short r0 = r6.readShort()     // Catch:{ IOException -> 0x0167 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x00ec
        L_0x00f7:
            r6.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x0100
        L_0x00fb:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0100:
            return r1
        L_0x0101:
            int r2 = r13.A01     // Catch:{ IOException -> 0x0167 }
            int[] r1 = new int[r2]     // Catch:{ IOException -> 0x0167 }
        L_0x0105:
            if (r7 >= r2) goto L_0x0110
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0167 }
            r1[r7] = r0     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x0105
        L_0x0110:
            r6.close()     // Catch:{ IOException -> 0x0114 }
            goto L_0x0119
        L_0x0114:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r1
        L_0x0119:
            return r1
        L_0x011a:
            int r10 = r13.A01     // Catch:{ IOException -> 0x0167 }
            X.0PQ[] r9 = new X.AnonymousClass0PQ[r10]     // Catch:{ IOException -> 0x0167 }
        L_0x011e:
            if (r7 >= r10) goto L_0x0134
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0167 }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0167 }
            int r0 = r6.readInt()     // Catch:{ IOException -> 0x0167 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0167 }
            X.0PQ r8 = new X.0PQ     // Catch:{ IOException -> 0x0167 }
            r8.<init>(r2, r0)     // Catch:{ IOException -> 0x0167 }
            r9[r7] = r8     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x011e
        L_0x0134:
            r6.close()     // Catch:{ IOException -> 0x0138 }
            goto L_0x013d
        L_0x0138:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r9
        L_0x013d:
            return r9
        L_0x013e:
            int r2 = r13.A01     // Catch:{ IOException -> 0x0167 }
            double[] r3 = new double[r2]     // Catch:{ IOException -> 0x0167 }
        L_0x0142:
            if (r7 >= r2) goto L_0x015d
            float r0 = r6.readFloat()     // Catch:{ IOException -> 0x0167 }
            double r0 = (double) r0     // Catch:{ IOException -> 0x0167 }
            r3[r7] = r0     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x0142
        L_0x014e:
            int r2 = r13.A01     // Catch:{ IOException -> 0x0167 }
            double[] r3 = new double[r2]     // Catch:{ IOException -> 0x0167 }
        L_0x0152:
            if (r7 >= r2) goto L_0x015d
            double r0 = r6.readDouble()     // Catch:{ IOException -> 0x0167 }
            r3[r7] = r0     // Catch:{ IOException -> 0x0167 }
            int r7 = r7 + 1
            goto L_0x0152
        L_0x015d:
            r6.close()     // Catch:{ IOException -> 0x0161 }
            goto L_0x0166
        L_0x0161:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
            return r3
        L_0x0166:
            return r3
        L_0x0167:
            r1 = move-exception
            goto L_0x016b
        L_0x0169:
            r1 = move-exception
            r6 = r12
        L_0x016b:
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r4, r0, r1)     // Catch:{ all -> 0x017b }
            if (r6 == 0) goto L_0x017a
        L_0x0172:
            r6.close()     // Catch:{ IOException -> 0x0176 }
            return r12
        L_0x0176:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x017a:
            return r12
        L_0x017b:
            r1 = move-exception
            r12 = r6
            goto L_0x017f
        L_0x017e:
            r1 = move-exception
        L_0x017f:
            if (r12 == 0) goto L_0x0189
            r12.close()     // Catch:{ IOException -> 0x0185 }
            throw r1
        L_0x0185:
            r0 = move-exception
            android.util.Log.e(r4, r5, r0)
        L_0x0189:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06590Ww.A05(java.nio.ByteOrder):java.lang.Object");
    }

    public String A06(ByteOrder byteOrder) {
        Object A05 = A05(byteOrder);
        if (A05 != null) {
            if (A05 instanceof String) {
                return (String) A05;
            }
            StringBuilder A0o = AnonymousClass000.A0o();
            int i2 = 0;
            if (!(A05 instanceof long[])) {
                if (!(A05 instanceof int[])) {
                    if (!(A05 instanceof double[])) {
                        if (A05 instanceof AnonymousClass0PQ[]) {
                            AnonymousClass0PQ[] r7 = (AnonymousClass0PQ[]) A05;
                            while (true) {
                                int length = r7.length;
                                if (i2 >= length) {
                                    break;
                                }
                                AnonymousClass0PQ r2 = r7[i2];
                                A0o.append(r2.A01);
                                A0o.append(IOUtils.DIR_SEPARATOR_UNIX);
                                A0o.append(r2.A00);
                                i2++;
                                if (i2 != length) {
                                    A0o.append(",");
                                }
                            }
                        }
                    } else {
                        double[] dArr = (double[]) A05;
                        while (true) {
                            int length2 = dArr.length;
                            if (i2 >= length2) {
                                break;
                            }
                            A0o.append(dArr[i2]);
                            i2++;
                            if (i2 != length2) {
                                A0o.append(",");
                            }
                        }
                    }
                } else {
                    int[] iArr = (int[]) A05;
                    while (true) {
                        int length3 = iArr.length;
                        if (i2 >= length3) {
                            break;
                        }
                        A0o.append(iArr[i2]);
                        i2++;
                        if (i2 != length3) {
                            A0o.append(",");
                        }
                    }
                }
            } else {
                long[] jArr = (long[]) A05;
                while (true) {
                    int length4 = jArr.length;
                    if (i2 >= length4) {
                        break;
                    }
                    A0o.append(jArr[i2]);
                    i2++;
                    if (i2 != length4) {
                        A0o.append(",");
                    }
                }
            }
            return A0o.toString();
        }
        return null;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("(");
        A0r.append(C007703o.A13[this.A00]);
        A0r.append(", data length:");
        A0r.append(this.A03.length);
        return AnonymousClass000.A0h(")", A0r);
    }
}
