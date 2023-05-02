package X;

import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1QS  reason: invalid class name */
public class AnonymousClass1QS {
    public static final C43001zB A01 = new C43001zB(0, 0, true);
    public static final C43001zB A02 = new C43001zB(0, 7, true);
    public static final C43011zC A03 = new C43011zC(0, 0, 0, true);
    public static final C43011zC A04 = new C43011zC(0, 5, 7, true);
    public static final byte[] A05 = {35, 33, 65, 77, 82, 10};
    public static final byte[] A06 = {35, 33, 65, 77, 82, 45, 87, 66, 10};
    public static final byte[] A07 = {79, 103, 103, 83};
    public static final byte[] A08 = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] A09 = {82, 73, 70, 70};
    public static final byte[] A0A = {100, 97, 116, 97};
    public static final byte[] A0B = {102, 109, 116, 32};
    public static final byte[] A0C = {73, 68, 51};
    public static final byte[] A0D = {102, 116, 121, 112};
    public static final byte[] A0E = {51, 103};
    public static final byte[] A0F = {113, 116, 32, 32};
    public static final byte[] A0G = {87, 65, 86, 69};
    public static final int[] A0H = {1633973356, 1668637984, 1684108385, 1717658484, 1718449184, 1768846196, 1818321516, 1819572340, 1852798053, 1886155636, 1936552044};
    public final C16300so A00;

    public AnonymousClass1QS(C16300so r1) {
        this.A00 = r1;
    }

    public static float A00(long j2) {
        long j3 = j2 >> ((int) 16);
        float pow = (float) Math.pow(2.0d, (double) 16);
        return ((float) j3) + (((float) (j2 & (((long) pow) - 1))) / pow);
    }

    public static int A01(C43021zD r11, InputStream inputStream) {
        try {
            int i2 = (int) (r11.A01 - r11.A02);
            byte[] bArr = new byte[i2];
            if (A02(inputStream, bArr, 0, i2) != i2) {
                return 7;
            }
            byte b2 = bArr[4];
            if (b2 != 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Did not find esds description tag - found: ");
                sb.append(b2);
                Log.i(sb.toString());
                return 7;
            }
            int[] A0C2 = A0C(bArr, 4, i2);
            if (A0C2 == null) {
                Log.i("Did not find esds description details");
                return 7;
            }
            int i3 = A0C2[0] + 3;
            byte b3 = bArr[i3];
            int i4 = 1;
            int i5 = i3 + 1;
            if ((b3 & 128) == 128) {
                i5 += 2;
            }
            if ((b3 & 64) == 64) {
                i5 += bArr[i5] + 1;
            }
            if ((b3 & 32) == 32) {
                i5 += 2;
            }
            byte b4 = bArr[i5];
            if (b4 != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Did not find esds config description tag - found: ");
                sb2.append(b4);
                Log.i(sb2.toString());
                return 7;
            }
            int[] A0C3 = A0C(bArr, i5, i2);
            if (A0C3 == null) {
                Log.i("Did not find esds config details");
                return 7;
            }
            int i6 = A0C3[0];
            byte b5 = bArr[i6 + 1];
            if (b5 != 64) {
                if (b5 != 107) {
                    switch (b5) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        case 105:
                            break;
                        default:
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Did not find esds supported type - found: ");
                            sb3.append(b5);
                            Log.i(sb3.toString());
                            return 7;
                    }
                }
                i4 = 2;
            }
            byte b6 = bArr[i6 + 2];
            if (((b6 & 252) >> 2) == 5) {
                return i4;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Did not find stream type - found: ");
            sb4.append(b6);
            Log.i(sb4.toString());
            return 7;
        } catch (Exception e2) {
            Log.i("Exception processing esds box: ", e2);
            return 7;
        }
    }

    public static int A02(InputStream inputStream, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, bArr.length - i2);
        int i4 = 0;
        while (i4 < min) {
            int read = inputStream.read(bArr, i2 + i4, min - i4);
            if (read == -1) {
                break;
            }
            i4 += read;
        }
        return i4;
    }

    public static C43001zB A03(File file) {
        C43001zB r3;
        String str;
        StringBuilder sb;
        String str2;
        int i2;
        String str3;
        int i3;
        String str4;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(C17970vw.A0G(file));
        try {
            byte[] bArr = new byte[36];
            boolean z2 = false;
            int A022 = A02(bufferedInputStream, bArr, 0, 8);
            if (A022 >= 8) {
                int i4 = 1;
                if (!A09(bArr, A0D, 4)) {
                    if (A09(bArr, A07, 0)) {
                        int A023 = A022 + A02(bufferedInputStream, bArr, A022, 36 - A022);
                        if (A023 < 27) {
                            str3 = "not opus - too few bytes for first packet";
                        } else {
                            int i5 = (bArr[26] & 255) + 27;
                            byte[] bArr2 = A08;
                            int length = bArr2.length + i5;
                            if (A023 < length) {
                                byte[] bArr3 = new byte[length];
                                System.arraycopy(bArr, 0, bArr3, 0, A023);
                                if (A023 + A02(bufferedInputStream, bArr3, A023, length - A023) < length) {
                                    str3 = "not opus - too few bytes";
                                } else {
                                    bArr = bArr3;
                                }
                            }
                            if (A09(bArr, bArr2, i5)) {
                                r3 = new C43001zB(4, 5, false);
                            } else {
                                str3 = "not opus - header bytes don't match";
                            }
                        }
                        Log.i(str3);
                        r3 = new C43001zB(4, 7, true);
                    } else {
                        byte[] bArr4 = A09;
                        if (!A09(bArr, bArr4, 0)) {
                            A022 += A02(bufferedInputStream, bArr, A022, 10 - A022);
                            if (A022 >= 10) {
                                if (A022 == 10 && A09(bArr, A0C, 0)) {
                                    A08(bufferedInputStream, (long) (((bArr[8] & Byte.MAX_VALUE) << 7) | ((bArr[6] & Byte.MAX_VALUE) << 21) | ((bArr[7] & Byte.MAX_VALUE) << 14) | (bArr[9] & Byte.MAX_VALUE)));
                                    A022 = A02(bufferedInputStream, bArr, 0, 10);
                                    int i6 = 2048;
                                    boolean z3 = false;
                                    while (A022 > 0 && i6 > 0 && !A09(bArr, bArr4, 0) && (bArr[0] != -1 || ((byte) (bArr[1] & 224)) != -32)) {
                                        A022--;
                                        System.arraycopy(bArr, 1, bArr, 0, A022);
                                        if (!z3) {
                                            if (bufferedInputStream.read(bArr, A022, 1) == -1) {
                                                bArr[A022] = 0;
                                                i6 = 0;
                                                z3 = true;
                                            } else {
                                                A022++;
                                                i6--;
                                            }
                                        }
                                    }
                                    if (A022 < bArr4.length || !A09(bArr, bArr4, 0)) {
                                        if (A022 < 10) {
                                        }
                                    }
                                }
                                if (A022 + A02(bufferedInputStream, bArr, A022, 36 - A022) >= 36) {
                                    if (bArr[0] == -1) {
                                        byte b2 = bArr[1];
                                        if (((byte) (b2 & 224)) == -32) {
                                            if ((b2 & 6) == 0) {
                                                r3 = new C43001zB(1, 1, false);
                                            } else {
                                                i2 = 2;
                                                r3 = new C43001zB(1, i2, false);
                                            }
                                        }
                                    }
                                    if (A09(bArr, A05, 0)) {
                                        i2 = 3;
                                    } else if (A09(bArr, A06, 0)) {
                                        i2 = 4;
                                    } else {
                                        r3 = A02;
                                    }
                                    r3 = new C43001zB(1, i2, false);
                                }
                            }
                        }
                        int i7 = 36;
                        byte[] bArr5 = new byte[36];
                        byte[] bArr6 = new byte[8];
                        System.arraycopy(bArr, 0, bArr5, 0, A022);
                        if (A022 + A02(bufferedInputStream, bArr5, A022, 36 - A022) != 36) {
                            Log.i("Insufficient data for WAV file header");
                            i4 = 0;
                        } else {
                            byte[] bArr7 = A0G;
                            if (!A09(bArr5, bArr7, 8)) {
                                sb = new StringBuilder("Not WAVE File type ");
                                str2 = new String(bArr5, 8, bArr7.length);
                            } else {
                                byte[] bArr8 = A0B;
                                if (!A09(bArr5, bArr8, 12)) {
                                    sb = new StringBuilder("Not WAVE chunk format ");
                                    str2 = new String(bArr5, 12, bArr8.length);
                                } else {
                                    byte b3 = ((bArr5[21] & 255) << 8) | (bArr5[20] & 255);
                                    if (80 == b3 || 85 == b3 || 5632 == b3 || 5648 == b3) {
                                        int i8 = (((bArr5[19] & 255) << 24) | ((bArr5[18] & 255) << 16) | ((bArr5[17] & 255) << 8) | (bArr5[16] & 255)) + 16 + 4;
                                        while (true) {
                                            A08(bufferedInputStream, (long) (i8 - i7));
                                            int A024 = A02(bufferedInputStream, bArr6, 0, 8);
                                            int i9 = i8 + A024;
                                            if (A024 == 8) {
                                                if (!C43041zF.A04(A0H, ((bArr6[0] & 255) << 24) | ((bArr6[1] & 255) << 16) | ((bArr6[2] & 255) << 8) | (bArr6[3] & 255))) {
                                                    sb = new StringBuilder("Unsupported WAVE chunk: ");
                                                    str2 = new String(bArr6, 0, 4);
                                                    break;
                                                } else if (A09(bArr6, A0A, 0)) {
                                                    byte[] bArr9 = new byte[2];
                                                    if (A02(bufferedInputStream, bArr9, 0, 2) != 2) {
                                                        str = "EOF reading WAVE data";
                                                    } else {
                                                        if (bArr9[0] == -1) {
                                                            byte b4 = bArr9[1];
                                                            if (((byte) (b4 & 224)) == -32) {
                                                                if ((b4 & 6) != 0) {
                                                                    i4 = 2;
                                                                }
                                                            }
                                                        }
                                                        str = "Not ACC/MP3 WAVE data";
                                                    }
                                                } else {
                                                    i7 = i9;
                                                    i8 = (((bArr6[7] & 255) << 24) | ((bArr6[6] & 255) << 16) | ((bArr6[5] & 255) << 8) | (bArr6[4] & 255)) + i9;
                                                }
                                            } else {
                                                str = "EOF reading WAVE chunk";
                                                break;
                                            }
                                        }
                                    } else {
                                        sb = new StringBuilder("RIFF/WAV container carries stream which is not one of supported MPEG audio streams ");
                                        sb.append(b3);
                                        str = sb.toString();
                                        Log.i(str);
                                        i4 = 7;
                                        z2 = true;
                                    }
                                }
                            }
                            sb.append(str2);
                            str = sb.toString();
                            Log.i(str);
                            i4 = 7;
                            z2 = true;
                        }
                        r3 = new C43001zB(5, i4, z2);
                    }
                    bufferedInputStream.close();
                    return r3;
                } else if (A022 + A02(bufferedInputStream, bArr, 8, 4) >= 12) {
                    C43021zD A052 = A05(bufferedInputStream, new int[]{1836019574}, (long) ((((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) - 12), -1);
                    if (A052 == null) {
                        str4 = "moov box not found";
                    } else {
                        long j2 = A052.A01;
                        long j3 = A052.A02;
                        C43031zE r2 = new C43031zE(bufferedInputStream, j3);
                        long j4 = (j2 - j3) + r2.A00;
                        i3 = 0;
                        loop0:
                        while (true) {
                            long j5 = r2.A00;
                            if (j5 < j4) {
                                C43021zD A053 = A05(r2, new int[]{1953653099}, 0, j4 - j5);
                                if (A053 != null) {
                                    long j6 = (r2.A00 + A053.A01) - A053.A02;
                                    while (true) {
                                        long j7 = r2.A00;
                                        if (j7 >= j6) {
                                            continue;
                                            break;
                                        }
                                        C43031zE r18 = r2;
                                        C43021zD A054 = A05(r18, new int[]{1835297121}, 0, j6 - j7);
                                        if (A054 == null) {
                                            str4 = "mdia box not found";
                                            break loop0;
                                        }
                                        long j8 = r2.A00;
                                        long j9 = (j8 + A054.A01) - A054.A02;
                                        C43021zD A055 = A05(r18, new int[]{1751411826}, 0, j9 - j8);
                                        if (A055 == null) {
                                            str4 = "hdlr box not found";
                                            break loop0;
                                        }
                                        long j10 = A055.A02;
                                        long j11 = (r2.A00 + A055.A01) - j10;
                                        A08(r2, 16 - j10);
                                        byte[] bArr10 = new byte[4];
                                        if (A02(r2, bArr10, 0, 4) != 4) {
                                            str4 = "hdlr box too short";
                                            break loop0;
                                        }
                                        byte b5 = ((bArr10[0] & 255) << 24) | ((bArr10[1] & 255) << 16) | ((bArr10[2] & 255) << 8) | (bArr10[3] & 255);
                                        if (b5 == 1986618469) {
                                            str4 = "video hdlr type not valid";
                                            break loop0;
                                        }
                                        if (b5 != 1936684398) {
                                            StringBuilder sb2 = new StringBuilder("non sound hdlr type found ");
                                            sb2.append(new String(A0A(b5)));
                                            Log.i(sb2.toString());
                                        } else if (i3 != 0) {
                                            Log.i("multiple hldr sound tracks found");
                                            i3 = 6;
                                            break loop0;
                                        } else {
                                            long j12 = r2.A00;
                                            C43021zD A056 = A05(r2, new int[]{1835626086}, j11 - j12, j9 - j12);
                                            if (A056 == null) {
                                                str4 = "minf box not found";
                                                break loop0;
                                            }
                                            long j13 = r2.A00;
                                            C43021zD A057 = A05(r18, new int[]{1937007212}, 0, ((j13 + A056.A01) - A056.A02) - j13);
                                            if (A057 == null) {
                                                str4 = "stbl box not found";
                                                break loop0;
                                            }
                                            long j14 = r2.A00;
                                            C43021zD A058 = A05(r18, new int[]{1937011556}, 0, ((j14 + A057.A01) - A057.A02) - j14);
                                            if (A058 == null) {
                                                str4 = "stsd box not found";
                                                break loop0;
                                            }
                                            A08(r2, 8);
                                            long j15 = r2.A00;
                                            C43021zD A059 = A05(r18, new int[]{1836069985, 1935764850, 1935767394}, 0, ((j15 + A058.A01) - A058.A02) - j15);
                                            if (A059 == null) {
                                                str4 = "content box not found";
                                                break loop0;
                                            }
                                            int i10 = A059.A00;
                                            if (i10 != 1836069985) {
                                                StringBuilder sb3 = new StringBuilder("Found media contents that wasn't m4a: ");
                                                sb3.append(new String(A0A(i10)));
                                                str4 = sb3.toString();
                                                break loop0;
                                            }
                                            long j16 = (r2.A00 + A059.A01) - A059.A02;
                                            A08(r2, 8);
                                            C43021zD A0510 = A05(r18, new int[]{1702061171}, (long) A0B(r2)[1], j16 - r2.A00);
                                            if (A0510 == null) {
                                                str4 = "esds box not found";
                                                break loop0;
                                            }
                                            i3 = A01(A0510, r2);
                                        }
                                        A08(r2, j6 - r2.A00);
                                    }
                                }
                            } else if (7 == i3) {
                            }
                        }
                    }
                    Log.i(str4);
                    i3 = 7;
                    z2 = true;
                    r3 = new C43001zB(2, i3, z2);
                    bufferedInputStream.close();
                    return r3;
                }
            }
            r3 = A01;
        } catch (IOException e2) {
            Log.i("Excepton reading next chunk ", e2);
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
        bufferedInputStream.close();
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x048b, code lost:
        r0 = "multiple hldr audio tracks found - not dolby";
     */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c A[Catch:{ all -> 0x0497, all -> 0x049b }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x020c A[Catch:{ all -> 0x0497, all -> 0x049b }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0213 A[Catch:{ all -> 0x0497, all -> 0x049b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C43011zC A04(java.io.File r34, boolean r35) {
        /*
            java.io.FileInputStream r1 = X.C17970vw.A0G(r34)
            java.io.BufferedInputStream r20 = new java.io.BufferedInputStream
            r0 = r20
            r0.<init>(r1)
            r5 = 12
            byte[] r6 = new byte[r5]     // Catch:{ all -> 0x0497 }
            r3 = 0
            int r0 = A02(r0, r6, r3, r5)     // Catch:{ all -> 0x0497 }
            if (r0 >= r5) goto L_0x0019
            X.1zC r12 = A03     // Catch:{ all -> 0x0497 }
            goto L_0x007c
        L_0x0019:
            r1 = 4
            byte[] r0 = A0D     // Catch:{ all -> 0x0497 }
            boolean r0 = A09(r6, r0, r1)     // Catch:{ all -> 0x0497 }
            if (r0 == 0) goto L_0x0071
            byte[] r0 = A0F     // Catch:{ all -> 0x0497 }
            r1 = 8
            boolean r0 = A09(r6, r0, r1)     // Catch:{ all -> 0x0497 }
            r18 = 3
            r2 = 2
            if (r0 == 0) goto L_0x0032
            r19 = 7
            goto L_0x003e
        L_0x0032:
            byte[] r0 = A0E     // Catch:{ all -> 0x0497 }
            boolean r0 = A09(r6, r0, r1)     // Catch:{ all -> 0x0497 }
            r19 = 2
            if (r0 == 0) goto L_0x003e
            r19 = 3
        L_0x003e:
            byte r1 = r6[r3]     // Catch:{ all -> 0x0497 }
            r0 = 1
            byte r4 = r6[r0]     // Catch:{ all -> 0x0497 }
            byte r3 = r6[r2]     // Catch:{ all -> 0x0497 }
            byte r2 = r6[r18]     // Catch:{ all -> 0x0497 }
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 24
            r0 = r4 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            r1 = r1 | r0
            r0 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r1 = r1 | r0
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            int r1 = r1 - r5
            long r1 = (long) r1     // Catch:{ all -> 0x0497 }
            r9 = 1
            int[] r4 = new int[r9]     // Catch:{ all -> 0x0497 }
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x0497 }
            r7 = -1
            r3 = r20
            r5 = r1
            X.1zD r3 = A05(r3, r4, r5, r7)     // Catch:{ all -> 0x0497 }
            if (r3 != 0) goto L_0x0247
            java.lang.String r0 = "moov box not found"
            goto L_0x0074
        L_0x0071:
            java.lang.String r0 = "video not MP4/3GP type file"
        L_0x0074:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0497 }
            X.1zC r12 = A04     // Catch:{ all -> 0x0497 }
            goto L_0x007c
        L_0x007a:
            if (r35 == 0) goto L_0x0080
        L_0x007c:
            r20.close()
            return r12
        L_0x0080:
            r13 = 0
        L_0x0081:
            long r5 = r4.A00     // Catch:{ all -> 0x0497 }
            long r1 = r1 - r5
            long r33 = r33 - r5
            int[] r5 = new int[r9]     // Catch:{ all -> 0x0497 }
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            r5[r0] = r6     // Catch:{ all -> 0x0497 }
            r29 = r4
            r30 = r5
            r31 = r1
            X.1zD r7 = A05(r29, r30, r31, r33)     // Catch:{ all -> 0x0497 }
            if (r7 != 0) goto L_0x009c
            java.lang.String r0 = "minf box not found"
            goto L_0x0074
        L_0x009c:
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            long r5 = r7.A01     // Catch:{ all -> 0x0497 }
            long r29 = r1 + r5
            long r5 = r7.A02     // Catch:{ all -> 0x0497 }
            long r29 = r29 - r5
            long r29 = r29 - r1
            int[] r1 = new int[r9]     // Catch:{ all -> 0x0497 }
            r2 = 1937007212(0x7374626c, float:1.9362132E31)
            r1[r0] = r2     // Catch:{ all -> 0x0497 }
            r26 = r1
            X.1zD r7 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x0497 }
            if (r7 != 0) goto L_0x00bb
            java.lang.String r0 = "stbl box not found"
            goto L_0x0074
        L_0x00bb:
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            long r5 = r7.A01     // Catch:{ all -> 0x0497 }
            long r29 = r1 + r5
            long r5 = r7.A02     // Catch:{ all -> 0x0497 }
            long r29 = r29 - r5
            long r29 = r29 - r1
            int[] r1 = new int[r9]     // Catch:{ all -> 0x0497 }
            r2 = 1937011556(0x73747364, float:1.9367383E31)
            r1[r0] = r2     // Catch:{ all -> 0x0497 }
            r26 = r1
            X.1zD r7 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x0497 }
            if (r7 != 0) goto L_0x00da
            java.lang.String r0 = "stsd box not found"
            goto L_0x0074
        L_0x00da:
            r1 = 8
            A08(r4, r1)     // Catch:{ all -> 0x0497 }
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            long r5 = r7.A01     // Catch:{ all -> 0x0497 }
            long r29 = r1 + r5
            long r5 = r7.A02     // Catch:{ all -> 0x0497 }
            long r29 = r29 - r5
            r5 = 1986618469(0x76696465, float:1.1834389E33)
            if (r3 != r5) goto L_0x012a
            r3 = 4
            int[] r7 = new int[r3]     // Catch:{ all -> 0x0497 }
            r6 = 1635148593(0x61766331, float:2.840654E20)
            r7[r0] = r6     // Catch:{ all -> 0x0497 }
            r8 = 1836070006(0x6d703476, float:4.646239E27)
            r7[r9] = r8     // Catch:{ all -> 0x0497 }
            r5 = 1932670515(0x73323633, float:1.4119387E31)
            r7[r24] = r5     // Catch:{ all -> 0x0497 }
            r3 = 1752589105(0x68766331, float:4.6541277E24)
            r0 = 3
            r7[r18] = r3     // Catch:{ all -> 0x0497 }
            long r29 = r29 - r1
            r26 = r7
            X.1zD r1 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0115
            java.lang.String r0 = "video content box not found"
            goto L_0x0074
        L_0x0115:
            int r1 = r1.A00     // Catch:{ all -> 0x0497 }
            if (r1 != r6) goto L_0x011b
            r0 = 2
            goto L_0x0126
        L_0x011b:
            if (r1 == r8) goto L_0x0126
            if (r1 == r5) goto L_0x0122
            if (r1 != r3) goto L_0x023d
            r9 = 4
        L_0x0122:
            r12.A02 = r9     // Catch:{ all -> 0x0497 }
            goto L_0x023d
        L_0x0126:
            r12.A02 = r0     // Catch:{ all -> 0x0497 }
            goto L_0x023d
        L_0x012a:
            r3 = 5
            int[] r7 = new int[r3]     // Catch:{ all -> 0x0497 }
            r6 = 1836069985(0x6d703461, float:4.6462328E27)
            r7[r0] = r6     // Catch:{ all -> 0x0497 }
            r8 = 1935764850(0x73616d72, float:1.7860208E31)
            r7[r9] = r8     // Catch:{ all -> 0x0497 }
            r5 = 1935767394(0x73617762, float:1.7863284E31)
            r7[r24] = r5     // Catch:{ all -> 0x0497 }
            r3 = 778924083(0x2e6d7033, float:5.3987214E-11)
            r7[r18] = r3     // Catch:{ all -> 0x0497 }
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            r10 = 4
            r7[r10] = r0     // Catch:{ all -> 0x0497 }
            long r29 = r29 - r1
            r26 = r7
            X.1zD r7 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x0497 }
            if (r7 != 0) goto L_0x0156
            java.lang.String r0 = "sound content box not found"
            goto L_0x0074
        L_0x0156:
            if (r13 == 0) goto L_0x0162
            int r2 = r12.A00     // Catch:{ all -> 0x0497 }
            r1 = 8
            if (r2 != r1) goto L_0x0180
            int r1 = r7.A00     // Catch:{ all -> 0x0497 }
            if (r1 != r6) goto L_0x048b
        L_0x0162:
            int r1 = r7.A00     // Catch:{ all -> 0x0497 }
            r10 = 7
            if (r1 != r6) goto L_0x0218
            long r0 = r4.A00     // Catch:{ all -> 0x0497 }
            long r2 = r7.A01     // Catch:{ all -> 0x0497 }
            long r0 = r0 + r2
            long r2 = r7.A02     // Catch:{ all -> 0x0497 }
            long r0 = r0 - r2
            r2 = 8
            A08(r4, r2)     // Catch:{ all -> 0x0497 }
            int[] r2 = A0B(r4)     // Catch:{ all -> 0x0497 }
            r5 = 0
            r3 = r2[r5]     // Catch:{ all -> 0x0497 }
            r2 = r2[r9]     // Catch:{ all -> 0x0497 }
            if (r3 == r5) goto L_0x01e5
            goto L_0x0187
        L_0x0180:
            if (r2 != r9) goto L_0x048b
            int r1 = r7.A00     // Catch:{ all -> 0x0497 }
            if (r1 != r0) goto L_0x048b
            goto L_0x0162
        L_0x0187:
            r3 = r19
            if (r3 != r10) goto L_0x01e5
            long r6 = (long) r2     // Catch:{ all -> 0x0497 }
            long r2 = r4.A00     // Catch:{ all -> 0x0497 }
            long r25 = r0 - r2
            r2 = 2
            int[] r3 = new int[r2]     // Catch:{ all -> 0x0497 }
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            r3[r5] = r2     // Catch:{ all -> 0x0497 }
            r10 = 1702061171(0x65736473, float:7.183675E22)
            r3[r9] = r10     // Catch:{ all -> 0x0497 }
            r9 = 8
            r21 = r4
            r22 = r3
            r23 = r6
            X.1zD r11 = A05(r21, r22, r23, r25)     // Catch:{ all -> 0x0497 }
            int r3 = r11.A00     // Catch:{ all -> 0x0497 }
            if (r3 != r2) goto L_0x01e2
            long r5 = r4.A00     // Catch:{ all -> 0x0497 }
            long r7 = r11.A01     // Catch:{ all -> 0x0497 }
            long r2 = r5 + r7
            long r7 = r11.A02     // Catch:{ all -> 0x0497 }
            long r2 = r2 - r7
            long r29 = r2 - r5
            r5 = 1
            int[] r5 = new int[r5]     // Catch:{ all -> 0x0497 }
            r6 = 0
            r5[r6] = r10     // Catch:{ all -> 0x0497 }
            r25 = r4
            r26 = r5
            X.1zD r11 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x0497 }
            if (r11 != 0) goto L_0x0203
            long r5 = r4.A00     // Catch:{ all -> 0x0497 }
            long r2 = r2 - r5
            A08(r4, r2)     // Catch:{ all -> 0x0497 }
            long r2 = r4.A00     // Catch:{ all -> 0x0497 }
            long r0 = r0 - r2
            r2 = 1
            int[] r2 = new int[r2]     // Catch:{ all -> 0x0497 }
            r3 = 0
            r2[r3] = r10     // Catch:{ all -> 0x0497 }
            r23 = 0
            r22 = r2
            r25 = r0
            X.1zD r11 = A05(r21, r22, r23, r25)     // Catch:{ all -> 0x0497 }
            goto L_0x01ff
        L_0x01e2:
            if (r3 != r10) goto L_0x0483
            goto L_0x0203
        L_0x01e5:
            r9 = 8
            long r6 = (long) r2     // Catch:{ all -> 0x0497 }
            long r2 = r4.A00     // Catch:{ all -> 0x0497 }
            long r0 = r0 - r2
            r2 = 1
            int[] r2 = new int[r2]     // Catch:{ all -> 0x0497 }
            r3 = 1702061171(0x65736473, float:7.183675E22)
            r2[r5] = r3     // Catch:{ all -> 0x0497 }
            r21 = r4
            r22 = r2
            r23 = r6
            r25 = r0
            X.1zD r11 = A05(r21, r22, r23, r25)     // Catch:{ all -> 0x0497 }
        L_0x01ff:
            if (r11 != 0) goto L_0x0203
            goto L_0x0483
        L_0x0203:
            int r2 = A01(r11, r4)     // Catch:{ all -> 0x0497 }
            r12.A00 = r2     // Catch:{ all -> 0x0497 }
            r1 = 1
            if (r13 == 0) goto L_0x0213
            if (r2 == r1) goto L_0x0210
            goto L_0x0487
        L_0x0210:
            r12.A00 = r9     // Catch:{ all -> 0x0497 }
            goto L_0x023d
        L_0x0213:
            r0 = 7
            if (r2 != r0) goto L_0x023d
            goto L_0x045b
        L_0x0218:
            r2 = 8
            if (r1 != r8) goto L_0x021e
            r2 = 3
            goto L_0x0231
        L_0x021e:
            if (r1 != r5) goto L_0x0222
            r2 = 4
            goto L_0x0231
        L_0x0222:
            if (r1 != r3) goto L_0x022f
            r0 = r19
            if (r0 == r10) goto L_0x022d
            java.lang.String r0 = ".mp3 box found in non-QuickTime file (?!)"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0497 }
        L_0x022d:
            r2 = 2
            goto L_0x0231
        L_0x022f:
            if (r1 != r0) goto L_0x023d
        L_0x0231:
            r12.A00 = r2     // Catch:{ all -> 0x0497 }
            goto L_0x023d
        L_0x0234:
            byte[] r1 = A0A(r3)     // Catch:{ all -> 0x0497 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0497 }
            r0.<init>(r1)     // Catch:{ all -> 0x0497 }
        L_0x023d:
            long r2 = r4.A00     // Catch:{ all -> 0x0497 }
            long r0 = r14 - r2
            A08(r4, r0)     // Catch:{ all -> 0x0497 }
            r9 = 1
            r0 = 0
            goto L_0x0286
        L_0x0247:
            X.1zC r12 = new X.1zC     // Catch:{ all -> 0x0497 }
            r12.<init>(r0, r0, r0, r0)     // Catch:{ all -> 0x0497 }
            r1 = r19
            r12.A01 = r1     // Catch:{ all -> 0x0497 }
            long r1 = r3.A01     // Catch:{ all -> 0x0497 }
            r16 = r1
            long r1 = r3.A02     // Catch:{ all -> 0x0497 }
            long r16 = r16 - r1
            X.1zE r4 = new X.1zE     // Catch:{ all -> 0x0497 }
            r3 = r20
            r4.<init>(r3, r1)     // Catch:{ all -> 0x0497 }
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            long r16 = r16 + r1
        L_0x0263:
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0470
            r23 = 0
            long r25 = r16 - r1
            int[] r2 = new int[r9]     // Catch:{ all -> 0x0497 }
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            r2[r0] = r1     // Catch:{ all -> 0x0497 }
            r21 = r4
            r22 = r2
            X.1zD r3 = A05(r21, r22, r23, r25)     // Catch:{ all -> 0x0497 }
            if (r3 == 0) goto L_0x0263
            long r14 = r4.A00     // Catch:{ all -> 0x0497 }
            long r1 = r3.A01     // Catch:{ all -> 0x0497 }
            long r14 = r14 + r1
            long r1 = r3.A02     // Catch:{ all -> 0x0497 }
            long r14 = r14 - r1
        L_0x0286:
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x0263
            r24 = 2
            r3 = 2
            int[] r3 = new int[r3]     // Catch:{ all -> 0x0497 }
            r5 = 1953196132(0x746b6864, float:7.46037E31)
            r3[r0] = r5     // Catch:{ all -> 0x0497 }
            r23 = 1835297121(0x6d646961, float:4.4181236E27)
            r3[r9] = r23     // Catch:{ all -> 0x0497 }
            r27 = 0
            long r29 = r14 - r1
            r25 = r4
            r26 = r3
            X.1zD r3 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x0497 }
            if (r3 != 0) goto L_0x02ae
            java.lang.String r0 = "tkmd/mdia box not found"
            goto L_0x0074
        L_0x02ae:
            int r1 = r3.A00     // Catch:{ all -> 0x0497 }
            if (r1 != r5) goto L_0x03eb
            long r5 = r4.A00     // Catch:{ all -> 0x0497 }
            long r7 = r3.A01     // Catch:{ all -> 0x0497 }
            long r5 = r5 + r7
            long r1 = r3.A02     // Catch:{ all -> 0x0497 }
            long r5 = r5 - r1
            r3 = 0
            r21 = 92
            int r10 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r10 < 0) goto L_0x03d3
            long r10 = r7 - r1
            int r1 = (int) r10     // Catch:{ all -> 0x0497 }
            byte[] r11 = new byte[r1]     // Catch:{ all -> 0x0497 }
            int r2 = A02(r4, r11, r0, r1)     // Catch:{ all -> 0x0497 }
            if (r2 != r1) goto L_0x048f
            byte r1 = r11[r0]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x02d5
            r10 = 76
            r22 = 40
            goto L_0x02e1
        L_0x02d5:
            if (r1 != r9) goto L_0x03d3
            r10 = 88
            r21 = 104(0x68, double:5.14E-322)
            int r1 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r1 < 0) goto L_0x03d3
            r22 = 52
        L_0x02e1:
            byte r1 = r11[r10]     // Catch:{ all -> 0x0497 }
            int r2 = r10 + 1
            byte r8 = r11[r2]     // Catch:{ all -> 0x0497 }
            int r2 = r10 + 2
            byte r7 = r11[r2]     // Catch:{ all -> 0x0497 }
            int r2 = r10 + 3
            byte r2 = r11[r2]     // Catch:{ all -> 0x0497 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r13 = r1 << 24
            r1 = r8 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r13 = r13 | r1
            r1 = r7 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r13 = r13 | r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            r13 = r13 | r1
            int r1 = r10 + 4
            byte r1 = r11[r1]     // Catch:{ all -> 0x0497 }
            int r2 = r10 + 5
            byte r8 = r11[r2]     // Catch:{ all -> 0x0497 }
            int r2 = r10 + 6
            byte r7 = r11[r2]     // Catch:{ all -> 0x0497 }
            int r2 = r10 + 7
            byte r2 = r11[r2]     // Catch:{ all -> 0x0497 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r10 = r1 << 24
            r1 = r8 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r10 = r10 | r1
            r1 = r7 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r10 = r10 | r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            r10 = r10 | r1
            if (r13 <= 0) goto L_0x0335
            if (r10 <= 0) goto L_0x0335
            int r1 = r12.A03     // Catch:{ all -> 0x0497 }
            if (r1 > 0) goto L_0x0335
            int r1 = r12.A04     // Catch:{ all -> 0x0497 }
            if (r1 > 0) goto L_0x0335
            int r1 = r10 >>> 16
            r12.A03 = r1     // Catch:{ all -> 0x0497 }
            int r1 = r13 >>> 16
            r12.A04 = r1     // Catch:{ all -> 0x0497 }
        L_0x0335:
            r13 = 9
            int[] r8 = new int[r13]     // Catch:{ all -> 0x0497 }
        L_0x0339:
            int r21 = r3 << 2
            int r21 = r21 + r22
            byte r1 = r11[r21]     // Catch:{ all -> 0x0497 }
            int r2 = r21 + 1
            byte r10 = r11[r2]     // Catch:{ all -> 0x0497 }
            int r2 = r21 + 2
            byte r7 = r11[r2]     // Catch:{ all -> 0x0497 }
            int r2 = r21 + 3
            byte r2 = r11[r2]     // Catch:{ all -> 0x0497 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r21 = r1 << 24
            r1 = r10 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r21 = r21 | r1
            r1 = r7 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r21 = r21 | r1
            r1 = r2 & 255(0xff, float:3.57E-43)
            r21 = r21 | r1
            r8[r3] = r21     // Catch:{ all -> 0x0497 }
            int r3 = r3 + 1
            if (r3 < r13) goto L_0x0339
            r7 = r8[r0]     // Catch:{ all -> 0x0497 }
            r2 = 4
            if (r7 != 0) goto L_0x0390
            r1 = r8[r9]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0390
            r1 = r8[r24]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0390
            r1 = r8[r18]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0390
            r1 = r8[r2]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0390
            r1 = 5
            r1 = r8[r1]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0390
            r1 = 6
            r1 = r8[r1]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0390
            r1 = 7
            r1 = r8[r1]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0390
            r1 = 8
            r1 = r8[r1]     // Catch:{ all -> 0x0497 }
            if (r1 != 0) goto L_0x0390
            goto L_0x03c7
        L_0x0390:
            r1 = r8[r2]     // Catch:{ all -> 0x0497 }
            if (r7 != r1) goto L_0x03c7
            r1 = r8[r9]     // Catch:{ all -> 0x0497 }
            long r1 = (long) r1     // Catch:{ all -> 0x0497 }
            float r3 = A00(r1)     // Catch:{ all -> 0x0497 }
            r1 = r8[r18]     // Catch:{ all -> 0x0497 }
            long r1 = (long) r1     // Catch:{ all -> 0x0497 }
            float r1 = A00(r1)     // Catch:{ all -> 0x0497 }
            float r1 = r1 + r3
            double r1 = (double) r1     // Catch:{ all -> 0x0497 }
            r10 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r8 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x03c7
            long r1 = (long) r7     // Catch:{ all -> 0x0497 }
            float r7 = A00(r1)     // Catch:{ all -> 0x0497 }
            float r1 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0497 }
            double r1 = (double) r1     // Catch:{ all -> 0x0497 }
            int r8 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x03c1
            double r1 = (double) r3     // Catch:{ all -> 0x0497 }
            double r1 = java.lang.Math.asin(r1)     // Catch:{ all -> 0x0497 }
            goto L_0x03c9
        L_0x03c1:
            double r1 = (double) r7     // Catch:{ all -> 0x0497 }
            double r1 = java.lang.Math.acos(r1)     // Catch:{ all -> 0x0497 }
            goto L_0x03c9
        L_0x03c7:
            r3 = 0
            goto L_0x03d1
        L_0x03c9:
            float r3 = (float) r1     // Catch:{ all -> 0x0497 }
            r1 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 * r1
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            float r3 = r3 / r1
        L_0x03d1:
            int r10 = (int) r3     // Catch:{ all -> 0x0497 }
            goto L_0x03d4
        L_0x03d3:
            r10 = 0
        L_0x03d4:
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            long r5 = r5 - r1
            long r29 = r14 - r1
            int[] r1 = new int[r9]     // Catch:{ all -> 0x0497 }
            r1[r0] = r23     // Catch:{ all -> 0x0497 }
            r26 = r1
            r27 = r5
            X.1zD r3 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x0497 }
            if (r3 != 0) goto L_0x03ec
            java.lang.String r0 = "mdia box not found"
            goto L_0x0074
        L_0x03eb:
            r10 = 0
        L_0x03ec:
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            long r5 = r3.A01     // Catch:{ all -> 0x0497 }
            long r33 = r1 + r5
            long r5 = r3.A02     // Catch:{ all -> 0x0497 }
            long r33 = r33 - r5
            r27 = 0
            long r29 = r33 - r1
            int[] r1 = new int[r9]     // Catch:{ all -> 0x0497 }
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            r1[r0] = r2     // Catch:{ all -> 0x0497 }
            r26 = r1
            X.1zD r3 = A05(r25, r26, r27, r29)     // Catch:{ all -> 0x0497 }
            if (r3 != 0) goto L_0x040d
            java.lang.String r0 = "hdlr box not found"
            goto L_0x0074
        L_0x040d:
            long r1 = r4.A00     // Catch:{ all -> 0x0497 }
            long r5 = r3.A01     // Catch:{ all -> 0x0497 }
            long r1 = r1 + r5
            long r7 = r3.A02     // Catch:{ all -> 0x0497 }
            long r1 = r1 - r7
            r5 = 16
            long r5 = r5 - r7
            A08(r4, r5)     // Catch:{ all -> 0x0497 }
            r5 = 4
            byte[] r6 = new byte[r5]     // Catch:{ all -> 0x0497 }
            int r3 = A02(r4, r6, r0, r5)     // Catch:{ all -> 0x0497 }
            if (r3 == r5) goto L_0x0428
            java.lang.String r0 = "hdlr box too short"
            goto L_0x0074
        L_0x0428:
            byte r3 = r6[r0]     // Catch:{ all -> 0x0497 }
            byte r5 = r6[r9]     // Catch:{ all -> 0x0497 }
            byte r7 = r6[r24]     // Catch:{ all -> 0x0497 }
            byte r6 = r6[r18]     // Catch:{ all -> 0x0497 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r3 = r3 | r5
            r5 = r7 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r3 = r3 | r5
            r5 = r6 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            r5 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r3 == r5) goto L_0x044d
            r5 = 1986618469(0x76696465, float:1.1834389E33)
            if (r3 == r5) goto L_0x045f
            goto L_0x0234
        L_0x044d:
            r6 = 8
            int r5 = r12.A00     // Catch:{ all -> 0x0497 }
            if (r5 == 0) goto L_0x0080
            if (r5 == r9) goto L_0x0458
            if (r5 == r6) goto L_0x0458
            goto L_0x046b
        L_0x0458:
            r13 = 1
            goto L_0x0081
        L_0x045b:
            r12.A06 = r1     // Catch:{ all -> 0x0497 }
            goto L_0x007c
        L_0x045f:
            int r5 = r12.A02     // Catch:{ all -> 0x0497 }
            if (r5 == 0) goto L_0x0467
            java.lang.String r0 = "multiple hldr video tracks found"
            goto L_0x0074
        L_0x0467:
            r12.A05 = r10     // Catch:{ all -> 0x0497 }
            goto L_0x007a
        L_0x046b:
            r0 = 6
            r12.A00 = r0     // Catch:{ all -> 0x0497 }
            goto L_0x007c
        L_0x0470:
            java.lang.String r1 = "Details found: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0497 }
            r0.<init>(r1)     // Catch:{ all -> 0x0497 }
            r0.append(r12)     // Catch:{ all -> 0x0497 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0497 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0497 }
            goto L_0x007c
        L_0x0483:
            java.lang.String r0 = "esds box not found"
            goto L_0x0074
        L_0x0487:
            java.lang.String r0 = "multiple hldr audio tracks found - not dolby mp4"
            goto L_0x0074
        L_0x048b:
            java.lang.String r0 = "multiple hldr audio tracks found - not dolby"
            goto L_0x0074
        L_0x048f:
            java.lang.String r1 = "Unexpected eof reading tkhd"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0497 }
            r0.<init>(r1)     // Catch:{ all -> 0x0497 }
            throw r0     // Catch:{ all -> 0x0497 }
        L_0x0497:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x049b }
        L_0x049b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QS.A04(java.io.File, boolean):X.1zC");
    }

    public static C43021zD A05(InputStream inputStream, int[] iArr, long j2, long j3) {
        long j4;
        String str;
        long j5 = j3;
        int[] iArr2 = iArr;
        new String(A0A(iArr[0]));
        long j6 = 0;
        long j7 = j2;
        InputStream inputStream2 = inputStream;
        if (j2 > 0) {
            if (j3 <= 0 || j2 <= j3) {
                A08(inputStream2, j7);
                j5 = j3 == -1 ? -1 : j3 - j2;
            } else {
                throw new IOException("Not enough bytes to skip");
            }
        }
        int i2 = 8;
        byte[] bArr = new byte[8];
        while (true) {
            if (j4 != -1 && j4 <= j6) {
                return null;
            }
            int A022 = A02(inputStream2, bArr, 0, i2);
            if (A022 >= i2) {
                long j8 = j4 == -1 ? -1 : j4 - ((long) A022);
                for (int i3 = 4; i3 < i2; i3++) {
                    byte b2 = bArr[i3];
                    if (b2 < 32) {
                        StringBuilder sb = new StringBuilder("Found non character data in box type ");
                        sb.append(b2);
                        Log.i(sb.toString());
                        return null;
                    }
                }
                int i4 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                new String(bArr, 4, 4);
                if (i4 == 0) {
                    i4 = -1;
                } else if (i4 == 1) {
                    byte[] bArr2 = new byte[i2];
                    A022 += A02(inputStream2, bArr2, 0, i2);
                    if (A022 == 16) {
                        j8 = j8 == -1 ? -1 : j8 - ((long) A022);
                        long j9 = ((long) (((bArr2[4] & 255) << 24) | ((bArr2[5] & 255) << 16) | ((bArr2[6] & 255) << 8) | (bArr2[7] & 255))) | (((long) (((((bArr2[0] & 255) << 24) | ((bArr2[1] & 255) << 16)) | ((bArr2[2] & 255) << 8)) | (bArr2[3] & 255))) << 32);
                        if (j9 <= 2147483647L) {
                            i4 = (int) j9;
                        } else {
                            StringBuilder sb2 = new StringBuilder("Length of box too long to be processed: ");
                            sb2.append(j9);
                            throw new IOException(sb2.toString());
                        }
                    } else {
                        throw new IOException("End of file looking for wide box length");
                    }
                }
                if (j8 <= 0 || j8 >= ((long) (i4 - A022))) {
                    byte b3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
                    boolean A042 = C43041zF.A04(iArr2, b3);
                    byte[] A0A2 = A0A(b3);
                    if (A042) {
                        return new C43021zD(i4, b3, A022);
                    }
                    new String(A0A2);
                    long j10 = (long) (i4 - A022);
                    A08(inputStream2, j10);
                    j4 = j8 == -1 ? -1 : j8 - j10;
                    j6 = 0;
                    i2 = 8;
                } else {
                    StringBuilder sb3 = new StringBuilder("Length of box too long to be in current input: ");
                    sb3.append(i4);
                    sb3.append('>');
                    sb3.append(j8);
                    throw new IOException(sb3.toString());
                }
            } else {
                throw new IOException("End of file looking for box header");
            }
        }
    }

    public static String A06(C43001zB r3) {
        switch (r3.A00) {
            case 1:
                return r3.A01 != 2 ? "audio/aac" : "audio/mp4";
            case 2:
                return r3.A01 != 2 ? "audio/mpeg" : "audio/mp4";
            case 3:
                return "audio/amr";
            case 5:
                return "audio/ogg; codecs=opus";
            case 6:
                StringBuilder sb = new StringBuilder("invalid audio type returned; ");
                sb.append(r3);
                throw new AssertionError(sb.toString());
            default:
                Log.w("unsupported audio type; returning null mime type");
                StringBuilder sb2 = new StringBuilder("Audio type not supported: ");
                sb2.append(r3.A00);
                throw new C43051zG(sb2.toString());
        }
    }

    public static String A07(String str, boolean z2) {
        String obj;
        if (TextUtils.isEmpty(str)) {
            if (z2) {
                obj = "empty audio mime type";
            }
            return null;
        } else if ("audio/aac".equals(str)) {
            return "aac";
        } else {
            if ("audio/mp4".equals(str)) {
                return "m4a";
            }
            if ("audio/amr".equals(str)) {
                return "amr";
            }
            if ("audio/mpeg".equals(str)) {
                return "mp3";
            }
            if ("audio/ogg; codecs=opus".equals(str)) {
                return "opus";
            }
            if (z2) {
                StringBuilder sb = new StringBuilder("unrecognized audio mime type; mimeType=");
                sb.append(str);
                obj = sb.toString();
            }
            return null;
        }
        Log.w(obj);
        return null;
    }

    public static void A08(InputStream inputStream, long j2) {
        byte[] bArr = new byte[1024];
        while (j2 > 0) {
            long j3 = (long) 1024;
            if (A02(inputStream, bArr, 0, (int) Math.min(j3, j2)) != -1) {
                j2 -= j3;
            } else {
                StringBuilder sb = new StringBuilder("Unexpected EOF skipping ");
                sb.append(j2);
                throw new IOException(sb.toString());
            }
        }
    }

    public static boolean A09(byte[] bArr, byte[] bArr2, int i2) {
        int length = bArr.length - i2;
        int length2 = bArr2.length;
        if (length >= length2) {
            int i3 = 0;
            while (i3 < length2) {
                if (bArr[i2 + i3] == bArr2[i3]) {
                    i3++;
                }
            }
            return true;
        }
        return false;
    }

    public static byte[] A0A(int i2) {
        return new byte[]{(byte) ((i2 >> 24) & MotionEventCompat.ACTION_MASK), (byte) ((i2 >> 16) & MotionEventCompat.ACTION_MASK), (byte) ((i2 >> 8) & MotionEventCompat.ACTION_MASK), (byte) (i2 & MotionEventCompat.ACTION_MASK)};
    }

    public static int[] A0B(InputStream inputStream) {
        int[] iArr;
        int i2;
        byte[] bArr = new byte[2];
        if (A02(inputStream, bArr, 0, 2) == 2) {
            byte b2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            StringBuilder sb = new StringBuilder("mp4a box version: ");
            sb.append(b2);
            Log.i(sb.toString());
            if (b2 == 0) {
                iArr = new int[2];
                iArr[0] = 0;
                i2 = 18;
            } else if (b2 == 1) {
                iArr = new int[2];
                iArr[0] = 1;
                i2 = 34;
            } else if (b2 == 2) {
                iArr = new int[2];
                iArr[0] = 2;
                i2 = 54;
            } else {
                throw new IOException("Unexpected result getting mp4a version");
            }
            iArr[1] = i2;
            return iArr;
        }
        throw new IOException("Unexpected eof getting mp4a version");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f A[Catch:{ Exception -> 0x0028 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[Catch:{ Exception -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A0C(byte[] r8, int r9, int r10) {
        /*
            int r0 = r9 + 4
            r7 = 0
            int r6 = java.lang.Math.min(r10, r0)     // Catch:{ Exception -> 0x0028 }
            r5 = 0
            r4 = r9
            r2 = 0
        L_0x000a:
            r3 = 1
            int r4 = r4 + 1
            int r2 = r2 << 7
            byte r0 = r8[r4]     // Catch:{ Exception -> 0x0028 }
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r2 + r0
            if (r9 >= r6) goto L_0x001d
            byte r1 = r8[r4]     // Catch:{ Exception -> 0x0028 }
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 == r0) goto L_0x000a
        L_0x001d:
            if (r2 != 0) goto L_0x0020
            return r7
        L_0x0020:
            r0 = 2
            int[] r0 = new int[r0]     // Catch:{ Exception -> 0x0028 }
            r0[r5] = r4     // Catch:{ Exception -> 0x0028 }
            r0[r3] = r2     // Catch:{ Exception -> 0x0028 }
            return r0
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "Exception processing esds box: "
            com.whatsapp.util.Log.i(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QS.A0C(byte[], int, int):int[]");
    }

    public boolean A0D(File file) {
        C43001zB A032 = A03(file);
        switch (A032.A00) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 6:
                StringBuilder sb = new StringBuilder("invalid audio file type returned; ");
                sb.append(A032);
                throw new AssertionError(sb.toString());
            default:
                return false;
        }
    }

    public boolean A0E(File file) {
        C43011zC A042 = A04(file, false);
        int i2 = A042.A01;
        if (i2 != 2 && i2 != 3) {
            return false;
        }
        int i3 = A042.A00;
        if (i3 != 4 && i3 != 2 && i3 != 1 && i3 != 0 && i3 != 8) {
            return false;
        }
        int i4 = A042.A02;
        return i4 == 2 || i4 == 1 || i4 == 3;
    }
}
