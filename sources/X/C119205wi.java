package X;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5wi  reason: invalid class name and case insensitive filesystem */
public class C119205wi {
    public static final Charset A04;
    public static final HashMap A05 = AnonymousClass000.A0x();
    public static final HashSet A06;
    public static final byte[] A07 = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final byte[] A08;
    public static final byte[] A09 = {-1, -40, -1};
    public static final int[] A0A = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final C116975sF[] A0B;
    public static final C116975sF[] A0C;
    public static final C116975sF[] A0D;
    public static final String[] A0E = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final HashMap[] A0F = new HashMap[3];
    public static final C116975sF[][] A0G;
    public int A00;
    public ByteOrder A01;
    public final Set A02;
    public final HashMap[] A03;

    static {
        int i2 = 0;
        C116975sF[] r12 = new C116975sF[3];
        A00("Orientation", r12, 274, 3, 0);
        A00("SubIFDPointer", r12, 330, 4, 1);
        A00("ExifIFDPointer", r12, 34665, 4, 2);
        A0D = r12;
        C116975sF[] r11 = new C116975sF[8];
        A00("ExposureTime", r11, 33434, 5, 0);
        A00("PhotographicSensitivity", r11, 34855, 3, 1);
        A00("ShutterSpeedValue", r11, 37377, 10, 2);
        A00("ApertureValue", r11, 37378, 5, 3);
        A00("FocalLength", r11, 37386, 5, 4);
        A00("WhiteBalance", r11, 41987, 3, 5);
        A00("DigitalZoomRatio", r11, 41988, 5, 6);
        A00("FocalLengthIn35mmFilm", r11, 41989, 3, 7);
        A0C = r11;
        A0G = new C116975sF[][]{r12, r11, r12};
        C116975sF[] r1 = new C116975sF[2];
        A00("SubIFDPointer", r1, 330, 4, 0);
        A00("ExifIFDPointer", r1, 34665, 4, 1);
        A0B = r1;
        String[] strArr = new String[2];
        strArr[0] = "DigitalZoomRatio";
        A06 = C13680ns.A0p("ExposureTime", strArr, 1);
        Charset forName = Charset.forName("US-ASCII");
        A04 = forName;
        A08 = "Exif\u0000\u0000".getBytes(forName);
        while (true) {
            C116975sF[][] r2 = A0G;
            if (i2 < r2.length) {
                A0F[i2] = AnonymousClass000.A0x();
                for (C116975sF r22 : r2[i2]) {
                    AnonymousClass3K2.A1Q(r22, A0F[i2], r22.A00);
                }
                i2++;
            } else {
                C13680ns.A1X(Integer.valueOf(A0B[1].A00), A05, 1);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C119205wi(java.io.InputStream r14) {
        /*
            r13 = this;
            r13.<init>()
            X.5sF[][] r0 = A0G
            int r3 = r0.length
            java.util.HashMap[] r0 = new java.util.HashMap[r3]
            r13.A03 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            r13.A02 = r0
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            r13.A01 = r6
            r2 = 0
        L_0x0016:
            if (r2 >= r3) goto L_0x0023
            java.util.HashMap[] r1 = r13.A03     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.util.HashMap r0 = X.AnonymousClass000.A0x()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1[r2] = r0     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            int r2 = r2 + 1
            goto L_0x0016
        L_0x0023:
            r0 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r5.<init>(r14, r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r5.mark(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            byte[] r4 = new byte[r0]     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r5.read(r4)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r5.reset()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r3 = 0
        L_0x0036:
            byte[] r2 = A09     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            int r0 = r2.length     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            if (r3 >= r0) goto L_0x004c
            byte r1 = r4[r3]     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            byte r0 = r2[r3]     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            if (r1 == r0) goto L_0x0049
            java.lang.String r0 = "This EXIF util only supports JPEG"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
        L_0x0048:
            throw r1     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
        L_0x0049:
            int r3 = r3 + 1
            goto L_0x0036
        L_0x004c:
            X.635 r4 = new X.635     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r4.A02 = r6     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            byte r0 = r4.A00()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.lang.String r2 = "Invalid marker: "
            r3 = -1
            if (r0 != r3) goto L_0x017e
            byte r1 = r4.A00()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r0 = -40
            if (r1 != r0) goto L_0x0169
            r12 = 2
            r10 = 2
        L_0x0066:
            byte r2 = r4.A00()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            if (r2 != r3) goto L_0x0152
            r6 = 1
            int r0 = r10 + 1
            byte r2 = r4.A00()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            int r1 = r0 + 1
            r0 = -39
            if (r2 == r0) goto L_0x0193
            r0 = -38
            if (r2 == r0) goto L_0x0193
            int r11 = r4.A02()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            int r11 = r11 - r12
            int r10 = r1 + 2
            java.lang.String r0 = "Invalid length"
            if (r11 < 0) goto L_0x014b
            r0 = -31
            if (r2 != r0) goto L_0x0102
            byte[] r9 = new byte[r11]     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r4.A06(r9)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            int r8 = r10 + r11
            byte[] r7 = A08     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            if (r7 != 0) goto L_0x0098
            r6 = 0
        L_0x0098:
            int r5 = r7.length     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            if (r11 >= r5) goto L_0x009c
            r6 = 0
        L_0x009c:
            r2 = 0
        L_0x009d:
            if (r2 >= r5) goto L_0x00a9
            byte r1 = r9[r2]     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            byte r0 = r7[r2]     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            if (r1 == r0) goto L_0x00a6
            r6 = 0
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00a9:
            if (r6 == 0) goto L_0x0100
            byte[] r1 = java.util.Arrays.copyOfRange(r9, r5, r11)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            int r10 = r10 + r5
            r13.A00 = r10     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r7 = 0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            X.635 r6 = new X.635     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            int r5 = r1.length     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            short r2 = r6.A04()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r0 = 18761(0x4949, float:2.629E-41)
            if (r2 == r0) goto L_0x00cb
            r0 = 19789(0x4d4d, float:2.773E-41)
            if (r2 != r0) goto L_0x010b
            goto L_0x00ce
        L_0x00cb:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x00d0
        L_0x00ce:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
        L_0x00d0:
            r13.A01 = r0     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r6.A02 = r0     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            int r2 = r6.A02()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r0 = 42
            if (r2 != r0) goto L_0x012d
            int r1 = r6.A01()     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r0 = 8
            if (r1 < r0) goto L_0x0120
            if (r1 >= r5) goto L_0x0120
            int r1 = r1 + -8
            if (r1 <= 0) goto L_0x00fd
            int r0 = r6.A03(r1)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            if (r0 == r1) goto L_0x00fd
            java.lang.String r0 = "Couldn't jump to first Ifd: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x00fd:
            r13.A03(r6, r7)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
        L_0x0100:
            r10 = r8
            r11 = 0
        L_0x0102:
            int r0 = r4.A03(r11)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            if (r0 != r11) goto L_0x0142
            int r10 = r10 + r11
            goto L_0x0066
        L_0x010b:
            java.lang.String r0 = "Invalid byte order: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.lang.String r0 = java.lang.Integer.toHexString(r2)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x0120:
            java.lang.String r0 = "Invalid first Ifd offset: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x012d:
            java.lang.String r0 = "Invalid start code: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.lang.String r0 = java.lang.Integer.toHexString(r2)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x0142:
            java.lang.String r0 = "Invalid JPEG segment"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x014b:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x0152:
            java.lang.String r0 = "Invalid marker:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r0 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x0169:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r2)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x017e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r2)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0193, all -> 0x0194 }
            goto L_0x0048
        L_0x0193:
            return
        L_0x0194:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119205wi.<init>(java.io.InputStream):void");
    }

    public static void A00(String str, Object[] objArr, int i2, int i3, int i4) {
        objArr[i4] = new C116975sF(i2, str, i3);
    }

    public double A01(String str) {
        NumberFormatException numberFormatException;
        int i2 = 0;
        while (i2 < A0G.length) {
            C118725v9 r1 = (C118725v9) this.A03[i2].get(str);
            if (r1 != null) {
                try {
                    Object A012 = r1.A01(this.A01);
                    if (A012 == null) {
                        numberFormatException = new NumberFormatException("NULL can't be converted to a double value");
                    } else if (A012 instanceof String) {
                        return Double.parseDouble((String) A012);
                    } else {
                        if (A012 instanceof long[]) {
                            long[] jArr = (long[]) A012;
                            if (jArr.length == 1) {
                                return (double) jArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A012 instanceof int[]) {
                            int[] iArr = (int[]) A012;
                            if (iArr.length == 1) {
                                return (double) iArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A012 instanceof double[]) {
                            double[] dArr = (double[]) A012;
                            if (dArr.length == 1) {
                                return dArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A012 instanceof C118035tx[]) {
                            C118035tx[] r4 = (C118035tx[]) A012;
                            if (r4.length == 1) {
                                C118035tx r2 = r4[0];
                                return ((double) r2.A01) / ((double) r2.A00);
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else {
                            numberFormatException = new NumberFormatException("Couldn't find a double value");
                        }
                    }
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                    return -1.0d;
                }
            } else {
                i2++;
            }
        }
        return -1.0d;
    }

    public int A02(String str) {
        NumberFormatException numberFormatException;
        int i2 = 0;
        while (i2 < A0G.length) {
            C118725v9 r1 = (C118725v9) this.A03[i2].get(str);
            if (r1 != null) {
                try {
                    Object A012 = r1.A01(this.A01);
                    if (A012 == null) {
                        numberFormatException = new NumberFormatException("NULL can't be converted to a integer value");
                    } else if (A012 instanceof String) {
                        return Integer.parseInt((String) A012);
                    } else {
                        if (A012 instanceof long[]) {
                            long[] jArr = (long[]) A012;
                            if (jArr.length == 1) {
                                return (int) jArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else if (A012 instanceof int[]) {
                            int[] iArr = (int[]) A012;
                            if (iArr.length == 1) {
                                return iArr[0];
                            }
                            numberFormatException = new NumberFormatException("There are more than one component");
                        } else {
                            numberFormatException = new NumberFormatException("Couldn't find a integer value");
                        }
                    }
                    throw numberFormatException;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            } else {
                i2++;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r12 == r0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r12 == 7) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0132, code lost:
        if (((long) r9.A00) != r4) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass635 r22, int r23) {
        /*
            r21 = this;
            r20 = r21
            r0 = r20
            java.util.Set r15 = r0.A02
            r9 = r22
            int r0 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.add(r0)
            int r0 = r9.A00
            int r0 = r0 + 2
            int r8 = r9.A03
            if (r0 > r8) goto L_0x00d6
            short r14 = r9.A04()
            int r1 = r9.A00
            int r0 = r14 * 12
            int r1 = r1 + r0
            if (r1 > r8) goto L_0x00d6
            if (r14 <= 0) goto L_0x00d6
            r10 = 0
        L_0x0027:
            int r2 = r9.A02()
            int r12 = r9.A02()
            int r19 = r9.A01()
            int r0 = r9.A00
            long r4 = (long) r0
            r0 = 4
            long r4 = r4 + r0
            java.util.HashMap[] r0 = A0F
            r0 = r0[r23]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            java.lang.Object r11 = r0.get(r13)
            X.5sF r11 = (X.C116975sF) r11
            if (r11 == 0) goto L_0x00ae
            if (r12 <= 0) goto L_0x00ae
            int[] r1 = A0A
            int r0 = r1.length
            if (r12 >= r0) goto L_0x00ae
            int r2 = r11.A01
            r0 = 7
            if (r2 == r0) goto L_0x0065
            if (r12 == r0) goto L_0x0068
            if (r2 == r12) goto L_0x0065
            r3 = 4
            r0 = 3
            if (r2 == r3) goto L_0x0063
            r0 = 9
            if (r2 != r0) goto L_0x00ae
            r0 = 8
        L_0x0063:
            if (r12 != r0) goto L_0x00ae
        L_0x0065:
            r0 = 7
            if (r12 != r0) goto L_0x0069
        L_0x0068:
            r12 = r2
        L_0x0069:
            r0 = r19
            long r6 = (long) r0
            r0 = r1[r12]
            long r0 = (long) r0
            long r6 = r6 * r0
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00ae
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ae
            r1 = 4
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0092
            int r0 = r9.A01()
            long r2 = (long) r0
            long r17 = r2 + r6
            long r0 = (long) r8
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 > 0) goto L_0x00ae
            r9.A05(r2)
        L_0x0092:
            java.util.HashMap r0 = A05
            java.lang.Object r13 = r0.get(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            if (r13 == 0) goto L_0x0115
            r0 = 3
            if (r12 == r0) goto L_0x00e8
            r0 = 4
            if (r12 == r0) goto L_0x00dc
            r0 = 8
            if (r12 == r0) goto L_0x00ed
            r0 = 9
            if (r12 == r0) goto L_0x00d7
            r0 = 13
            if (r12 == r0) goto L_0x00d7
        L_0x00ae:
            r9.A05(r4)
        L_0x00b1:
            int r0 = r10 + 1
            short r10 = (short) r0
            if (r10 < r14) goto L_0x0027
            int r0 = r9.A00
            int r0 = r0 + 4
            if (r0 > r8) goto L_0x00d6
            int r5 = r9.A01()
            long r1 = (long) r5
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d6
            if (r5 >= r8) goto L_0x00d6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L_0x00d6
            r9.A05(r1)
        L_0x00d6:
            return
        L_0x00d7:
            int r0 = r9.A01()
            goto L_0x00f1
        L_0x00dc:
            int r0 = r9.A01()
            long r2 = (long) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            goto L_0x00f2
        L_0x00e8:
            int r0 = r9.A02()
            goto L_0x00f1
        L_0x00ed:
            short r0 = r9.A04()
        L_0x00f1:
            long r2 = (long) r0
        L_0x00f2:
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            long r0 = (long) r8
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ae
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L_0x00ae
            r9.A05(r2)
            int r1 = r13.intValue()
            r0 = r20
            r0.A03(r9, r1)
            goto L_0x00ae
        L_0x0115:
            int r0 = (int) r6
            byte[] r1 = new byte[r0]
            r9.A06(r1)
            X.5v9 r2 = new X.5v9
            r0 = r19
            r2.<init>(r1, r12, r0)
            r0 = r20
            java.util.HashMap[] r0 = r0.A03
            r1 = r0[r23]
            java.lang.String r0 = r11.A02
            r1.put(r0, r2)
            int r0 = r9.A00
            long r0 = (long) r0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00b1
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119205wi.A03(X.635, int):void");
    }
}
