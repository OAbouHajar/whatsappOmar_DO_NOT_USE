package X;

import java.util.Arrays;

/* renamed from: X.4eQ  reason: invalid class name and case insensitive filesystem */
public final class C90594eQ {
    public static final C09200f6 A00;
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        byte[] copyOf = Arrays.copyOf(new byte[0], 0);
        C18450wi.A08(copyOf);
        A00 = new C09200f6(copyOf);
    }

    public static final String A00(C09200f6 r8) {
        char[] cArr = new char[(r7 << 1)];
        int i2 = 0;
        for (byte b2 : r8.data) {
            int i3 = i2 + 1;
            char[] cArr2 = A01;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r1 < 65536) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bf, code lost:
        if (r0 != 64) goto L_0x0162;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(X.C09200f6 r17) {
        /*
            r10 = 0
            r11 = r17
            byte[] r9 = r11.data
            int r8 = r9.length
            if (r8 != 0) goto L_0x000b
            java.lang.String r0 = "[size=0]"
            return r0
        L_0x000b:
            r7 = 64
            r13 = 0
            r6 = 0
            r0 = 0
        L_0x0010:
            byte r1 = r9[r13]
            r15 = 127(0x7f, float:1.78E-43)
            r14 = 159(0x9f, float:2.23E-43)
            r12 = 31
            r5 = 13
            r4 = 65533(0xfffd, float:9.1831E-41)
            r3 = 10
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 < 0) goto L_0x0060
            int r17 = r0 + 1
            if (r0 == r7) goto L_0x00c1
            if (r1 == r3) goto L_0x0036
            if (r1 == r5) goto L_0x0036
            if (r12 >= r1) goto L_0x0162
            if (r15 > r1) goto L_0x0036
            if (r14 >= r1) goto L_0x0162
            if (r1 == r4) goto L_0x0162
            r0 = 2
            if (r1 >= r2) goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            int r6 = r6 + r0
            int r13 = r13 + 1
        L_0x003a:
            r0 = r17
            if (r13 >= r8) goto L_0x008c
            byte r1 = r9[r13]
            if (r1 < 0) goto L_0x008c
            int r16 = r13 + 1
            byte r1 = r9[r13]
            int r17 = r17 + 1
            if (r0 == r7) goto L_0x00c1
            if (r1 == r3) goto L_0x005b
            if (r1 == r5) goto L_0x005b
            if (r1 < 0) goto L_0x005b
            if (r12 >= r1) goto L_0x0162
            if (r15 > r1) goto L_0x005b
            if (r14 >= r1) goto L_0x0162
            if (r1 == r4) goto L_0x0162
            r0 = 2
            if (r1 >= r2) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            int r6 = r6 + r0
            r13 = r16
            goto L_0x003a
        L_0x0060:
            int r3 = r1 >> 5
            r2 = -2
            r5 = 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x008f
            int r1 = r13 + 1
            if (r8 <= r1) goto L_0x00bf
            byte r12 = r9[r13]
            byte r2 = r9[r1]
            r1 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00bf
            r3 = r2 ^ 3968(0xf80, float:5.56E-42)
            int r1 = r12 << 6
            r3 = r3 ^ r1
            if (r3 < r5) goto L_0x00bf
            int r2 = r0 + 1
            if (r0 == r7) goto L_0x00c1
            if (r14 >= r3) goto L_0x0162
            if (r3 == r4) goto L_0x0162
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 2
            if (r3 >= r1) goto L_0x0088
            r0 = 1
        L_0x0088:
            int r6 = r6 + r0
            int r13 = r13 + 2
        L_0x008b:
            r0 = r2
        L_0x008c:
            if (r13 >= r8) goto L_0x00c1
            goto L_0x0010
        L_0x008f:
            int r12 = r1 >> 4
            r4 = 55296(0xd800, float:7.7486E-41)
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r12 != r2) goto L_0x0165
            int r12 = r13 + 2
            if (r8 <= r12) goto L_0x00bf
            byte r14 = r9[r13]
            int r1 = r13 + 1
            byte r2 = r9[r1]
            r1 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00bf
            byte r12 = r9[r12]
            r1 = r12 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00bf
            r1 = -123008(0xfffffffffffe1f80, float:NaN)
            r12 = r12 ^ r1
            int r1 = r2 << 6
            r12 = r12 ^ r1
            int r1 = r14 << 12
            r12 = r12 ^ r1
            r1 = 2048(0x800, float:2.87E-42)
            if (r12 < r1) goto L_0x00bf
            if (r4 > r12) goto L_0x014e
            if (r3 < r12) goto L_0x014e
        L_0x00bf:
            if (r0 != r7) goto L_0x0162
        L_0x00c1:
            r0 = -1
            r4 = 93
            java.lang.String r3 = "…]"
            java.lang.String r12 = "[size="
            if (r6 != r0) goto L_0x00e1
            if (r8 > r7) goto L_0x012d
            java.lang.String r0 = "[hex="
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r11.A03()
            r2.append(r0)
            r2.append(r4)
        L_0x00dc:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00e1:
            java.lang.String r5 = r11.A01
            if (r5 != 0) goto L_0x00f5
            byte[] r1 = r11.A06()
            X.C18450wi.A0G(r1, r10)
            java.nio.charset.Charset r0 = X.AnonymousClass4BJ.A05
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r0)
            r11.A01 = r5
        L_0x00f5:
            java.lang.String r2 = r5.substring(r10, r6)
            X.C18450wi.A08(r2)
            java.lang.String r1 = "\\"
            java.lang.String r0 = "\\\\"
            java.lang.String r2 = X.C008703y.A0K(r2, r1, r0)
            java.lang.String r1 = "\n"
            java.lang.String r0 = "\\n"
            java.lang.String r2 = X.C008703y.A0K(r2, r1, r0)
            java.lang.String r1 = "\r"
            java.lang.String r0 = "\\r"
            java.lang.String r1 = X.C008703y.A0K(r2, r1, r0)
            int r0 = r5.length()
            if (r6 >= r0) goto L_0x01a9
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r12)
            byte[] r0 = r11.data
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = " text="
            r2.append(r0)
            r2.append(r1)
            goto L_0x014a
        L_0x012d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r12)
            r2.append(r8)
            java.lang.String r0 = " hex="
            r2.append(r0)
            byte[] r1 = new byte[r7]
            java.lang.System.arraycopy(r9, r10, r1, r10, r7)
            X.0f6 r0 = new X.0f6
            r0.<init>(r1)
            java.lang.String r0 = r0.A03()
            r2.append(r0)
        L_0x014a:
            r2.append(r3)
            goto L_0x00dc
        L_0x014e:
            int r2 = r0 + 1
            if (r0 == r7) goto L_0x00c1
            r0 = 65533(0xfffd, float:9.1831E-41)
            if (r12 == r0) goto L_0x0162
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 2
            if (r12 >= r1) goto L_0x015d
            r0 = 1
        L_0x015d:
            int r6 = r6 + r0
            int r13 = r13 + 3
            goto L_0x008b
        L_0x0162:
            r6 = -1
            goto L_0x00c1
        L_0x0165:
            int r1 = r1 >> 3
            if (r1 != r2) goto L_0x00bf
            int r2 = r13 + 3
            if (r8 <= r2) goto L_0x00bf
            byte r15 = r9[r13]
            int r1 = r13 + 1
            byte r12 = r9[r1]
            r1 = r12 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00bf
            int r1 = r13 + 2
            byte r14 = r9[r1]
            r1 = r14 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00bf
            byte r2 = r9[r2]
            r1 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00bf
            r1 = 3678080(0x381f80, float:5.154088E-39)
            r2 = r2 ^ r1
            int r1 = r14 << 6
            r2 = r2 ^ r1
            int r1 = r12 << 12
            r2 = r2 ^ r1
            int r1 = r15 << 18
            r2 = r2 ^ r1
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 > r1) goto L_0x00bf
            if (r4 > r2) goto L_0x00bf
            if (r3 >= r2) goto L_0x00bf
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 < r1) goto L_0x00bf
            int r2 = r0 + 1
            if (r0 == r7) goto L_0x00c1
            int r6 = r6 + 2
            int r13 = r13 + 4
            goto L_0x008b
        L_0x01a9:
            java.lang.String r0 = "[text="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r0.append(r1)
            java.lang.String r0 = X.AnonymousClass3K3.A0p(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90594eQ.A01(X.0f6):java.lang.String");
    }

    public static final C09200f6 A02() {
        return A00;
    }

    public static final C09200f6 A03(String str) {
        byte[] bytes = str.getBytes(AnonymousClass4BJ.A05);
        C18450wi.A08(bytes);
        C09200f6 r0 = new C09200f6(bytes);
        r0.A01 = str;
        return r0;
    }
}
