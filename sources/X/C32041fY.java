package X;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.1fY  reason: invalid class name and case insensitive filesystem */
public class C32041fY extends C32051fZ {
    public static final ConcurrentMap A02 = new ConcurrentHashMap();
    public byte[] A00;
    public final String A01;

    public C32041fY(String str) {
        char charAt;
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        } else if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2' || !A01(str, 2)) {
            StringBuilder sb = new StringBuilder("string ");
            sb.append(str);
            sb.append(" not an OID");
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.A01 = str;
        }
    }

    public C32041fY(String str, C32041fY r4) {
        if (A01(str, 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(r4.A01);
            sb.append(".");
            sb.append(str);
            this.A01 = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder("string ");
        sb2.append(str);
        sb2.append(" not a valid OID branch");
        throw new IllegalArgumentException(sb2.toString());
    }

    public C32041fY(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        long j2 = 0;
        int i2 = 0;
        BigInteger bigInteger = null;
        while (true) {
            byte[] bArr2 = bArr;
            if (i2 != bArr2.length) {
                byte b2 = bArr[i2] & 255;
                if (j2 <= 72057594037927808L) {
                    long j3 = j2 + ((long) (b2 & Byte.MAX_VALUE));
                    if ((b2 & 128) == 0) {
                        if (z2) {
                            if (j3 < 40) {
                                stringBuffer.append('0');
                            } else if (j3 < 80) {
                                stringBuffer.append('1');
                                j3 -= 40;
                            } else {
                                stringBuffer.append('2');
                                j3 -= 80;
                            }
                            z2 = false;
                        }
                        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                        stringBuffer.append(j3);
                        j2 = 0;
                    } else {
                        j2 = j3 << 7;
                    }
                } else {
                    BigInteger or = (bigInteger == null ? BigInteger.valueOf(j2) : bigInteger).or(BigInteger.valueOf((long) (b2 & Byte.MAX_VALUE)));
                    if ((b2 & 128) == 0) {
                        if (z2) {
                            stringBuffer.append('2');
                            or = or.subtract(BigInteger.valueOf(80));
                            z2 = false;
                        }
                        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                        stringBuffer.append(or);
                        j2 = 0;
                        bigInteger = null;
                    } else {
                        bigInteger = or.shiftLeft(7);
                    }
                }
                i2++;
            } else {
                this.A01 = stringBuffer.toString();
                this.A00 = C33111hx.A02(bArr2);
                return;
            }
        }
    }

    public static C32041fY A00(Object obj) {
        if (obj == null || (obj instanceof C32041fY)) {
            return (C32041fY) obj;
        }
        if (obj instanceof C32071fb) {
            C32051fZ Agm = ((C32071fb) obj).Agm();
            if (Agm instanceof C32041fY) {
                return (C32041fY) Agm;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (C32041fY) C32051fZ.A02((byte[]) obj);
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder("failed to construct object identifier from byte[]: ");
                sb.append(e2.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r4 == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r4 <= 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.charAt(r6 + 1) != '0') goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.lang.String r7, int r8) {
        /*
            int r6 = r7.length()
            r5 = 0
        L_0x0005:
            r4 = 0
        L_0x0006:
            int r6 = r6 + -1
            r3 = 48
            r2 = 1
            if (r6 < r8) goto L_0x002b
            char r1 = r7.charAt(r6)
            r0 = 46
            if (r1 != r0) goto L_0x0022
            if (r4 == 0) goto L_0x0021
            if (r4 <= r2) goto L_0x0005
            int r0 = r6 + 1
            char r0 = r7.charAt(r0)
            if (r0 != r3) goto L_0x0005
        L_0x0021:
            return r5
        L_0x0022:
            if (r3 > r1) goto L_0x0021
            r0 = 57
            if (r1 > r0) goto L_0x0021
            int r4 = r4 + 1
            goto L_0x0006
        L_0x002b:
            if (r4 == 0) goto L_0x0021
            if (r4 <= r2) goto L_0x0038
            int r0 = r6 + 1
            char r0 = r7.charAt(r0)
            if (r0 != r3) goto L_0x0038
            return r5
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32041fY.A01(java.lang.String, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = (X.C32041fY) r1.putIfAbsent(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C32041fY A0A() {
        /*
            r3 = this;
            byte[] r0 = r3.A0B()
            X.1hw r2 = new X.1hw
            r2.<init>(r0)
            java.util.concurrent.ConcurrentMap r1 = A02
            java.lang.Object r0 = r1.get(r2)
            X.1fY r0 = (X.C32041fY) r0
            if (r0 != 0) goto L_0x001c
            java.lang.Object r0 = r1.putIfAbsent(r2, r3)
            X.1fY r0 = (X.C32041fY) r0
            if (r0 != 0) goto L_0x001c
            return r3
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32041fY.A0A():X.1fY");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized byte[] A0B() {
        /*
            r13 = this;
            monitor-enter(r13)
            byte[] r0 = r13.A00     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x00e3
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00e5 }
            r6.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r5 = r13.A01     // Catch:{ all -> 0x00e5 }
            r1 = 0
            r2 = 0
            r0 = -1
            r4 = 46
            int r1 = r5.indexOf(r4, r1)     // Catch:{ all -> 0x00e5 }
            if (r1 != r0) goto L_0x0026
            java.lang.String r0 = r5.substring(r2)     // Catch:{ all -> 0x00e5 }
            r3 = -1
        L_0x001c:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00e5 }
            int r9 = r0 * 40
            r1 = -1
            if (r3 != r1) goto L_0x002f
            goto L_0x002d
        L_0x0026:
            java.lang.String r0 = r5.substring(r2, r1)     // Catch:{ all -> 0x00e5 }
            int r3 = r1 + 1
            goto L_0x001c
        L_0x002d:
            r8 = 0
            goto L_0x003a
        L_0x002f:
            int r0 = r5.indexOf(r4, r3)     // Catch:{ all -> 0x00e5 }
            if (r0 != r1) goto L_0x00d5
            java.lang.String r8 = r5.substring(r3)     // Catch:{ all -> 0x00e5 }
            r3 = -1
        L_0x003a:
            int r0 = r8.length()     // Catch:{ all -> 0x00e5 }
            r2 = 18
            if (r0 > r2) goto L_0x006b
            long r0 = (long) r9     // Catch:{ all -> 0x00e5 }
            long r7 = java.lang.Long.parseLong(r8)     // Catch:{ all -> 0x00e5 }
            long r0 = r0 + r7
        L_0x0048:
            r7 = 9
            byte[] r9 = new byte[r7]     // Catch:{ all -> 0x00e5 }
            int r7 = (int) r0     // Catch:{ all -> 0x00e5 }
            r7 = r7 & 127(0x7f, float:1.78E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x00e5 }
            r8 = 8
        L_0x0052:
            r9[r8] = r7     // Catch:{ all -> 0x00e5 }
            r10 = 128(0x80, double:6.32E-322)
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x0065
            r7 = 7
            long r0 = r0 >> r7
            int r8 = r8 + -1
            int r7 = (int) r0     // Catch:{ all -> 0x00e5 }
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7     // Catch:{ all -> 0x00e5 }
            goto L_0x0052
        L_0x0065:
            int r0 = 9 - r8
            r6.write(r9, r8, r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x00ab
        L_0x006b:
            java.math.BigInteger r7 = new java.math.BigInteger     // Catch:{ all -> 0x00e5 }
            r7.<init>(r8)     // Catch:{ all -> 0x00e5 }
            long r0 = (long) r9     // Catch:{ all -> 0x00e5 }
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)     // Catch:{ all -> 0x00e5 }
            java.math.BigInteger r10 = r7.add(r0)     // Catch:{ all -> 0x00e5 }
        L_0x0079:
            int r0 = r10.bitLength()     // Catch:{ all -> 0x00e5 }
            int r8 = r0 + 6
            r11 = 7
            int r8 = r8 / r11
            r7 = 0
            if (r8 != 0) goto L_0x0088
            r6.write(r7)     // Catch:{ all -> 0x00e5 }
            goto L_0x00ab
        L_0x0088:
            byte[] r1 = new byte[r8]     // Catch:{ all -> 0x00e5 }
            int r12 = r8 + -1
            r9 = r12
        L_0x008d:
            if (r9 < 0) goto L_0x00a1
            int r0 = r10.intValue()     // Catch:{ all -> 0x00e5 }
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0     // Catch:{ all -> 0x00e5 }
            r1[r9] = r0     // Catch:{ all -> 0x00e5 }
            java.math.BigInteger r10 = r10.shiftRight(r11)     // Catch:{ all -> 0x00e5 }
            int r9 = r9 + -1
            goto L_0x008d
        L_0x00a1:
            byte r0 = r1[r12]     // Catch:{ all -> 0x00e5 }
            r0 = r0 & 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0     // Catch:{ all -> 0x00e5 }
            r1[r12] = r0     // Catch:{ all -> 0x00e5 }
            r6.write(r1, r7, r8)     // Catch:{ all -> 0x00e5 }
        L_0x00ab:
            r1 = -1
            if (r3 == r1) goto L_0x00dd
            if (r3 != r1) goto L_0x00b2
            r1 = 0
            goto L_0x00bd
        L_0x00b2:
            int r0 = r5.indexOf(r4, r3)     // Catch:{ all -> 0x00e5 }
            if (r0 != r1) goto L_0x00c8
            java.lang.String r1 = r5.substring(r3)     // Catch:{ all -> 0x00e5 }
            r3 = -1
        L_0x00bd:
            int r0 = r1.length()     // Catch:{ all -> 0x00e5 }
            if (r0 > r2) goto L_0x00cf
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x00e5 }
            goto L_0x0048
        L_0x00c8:
            java.lang.String r1 = r5.substring(r3, r0)     // Catch:{ all -> 0x00e5 }
            int r3 = r0 + 1
            goto L_0x00bd
        L_0x00cf:
            java.math.BigInteger r10 = new java.math.BigInteger     // Catch:{ all -> 0x00e5 }
            r10.<init>(r1)     // Catch:{ all -> 0x00e5 }
            goto L_0x0079
        L_0x00d5:
            java.lang.String r8 = r5.substring(r3, r0)     // Catch:{ all -> 0x00e5 }
            int r3 = r0 + 1
            goto L_0x003a
        L_0x00dd:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x00e5 }
            r13.A00 = r0     // Catch:{ all -> 0x00e5 }
        L_0x00e3:
            monitor-exit(r13)
            return r0
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32041fY.A0B():byte[]");
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        return this.A01;
    }
}
