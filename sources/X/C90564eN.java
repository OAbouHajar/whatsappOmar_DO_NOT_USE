package X;

import android.support.v4.view.MotionEventCompat;
import android.util.Pair;

/* renamed from: X.4eN  reason: invalid class name and case insensitive filesystem */
public final class C90564eN {
    public static final byte[] A00 = "OpusHead".getBytes(AnonymousClass4BH.A05);

    public static Pair A00(C90504eH r4, int i2) {
        r4.A0S(i2 + 8 + 4);
        r4.A0T(1);
        do {
        } while ((r4.A0C() & 128) == 128);
        int A01 = C90504eH.A01(r4, 2);
        if ((A01 & 128) != 0) {
            r4.A0T(2);
        }
        if ((A01 & 64) != 0) {
            r4.A0T(r4.A0F());
        }
        if ((A01 & 32) != 0) {
            r4.A0T(2);
        }
        r4.A0T(1);
        do {
        } while ((r4.A0C() & 128) == 128);
        String A02 = C90834eu.A02(r4.A0C());
        if ("audio/mpeg".equals(A02) || "audio/vnd.dts".equals(A02) || "audio/vnd.dts.hd".equals(A02)) {
            return Pair.create(A02, (Object) null);
        }
        r4.A0T(12);
        int A012 = C90504eH.A01(r4, 1);
        int i3 = A012 & 127;
        while ((A012 & 128) == 128) {
            A012 = r4.A0C();
            i3 = (i3 << 7) | (A012 & 127);
        }
        byte[] bArr = new byte[i3];
        r4.A0V(bArr, 0, i3);
        return Pair.create(A02, bArr);
    }

    public static Pair A01(C90504eH r19, int i2, int i3) {
        int i4;
        int i5;
        C90504eH r4 = r19;
        int i6 = r4.A01;
        while (i6 - i2 < i3) {
            int A03 = C90504eH.A03(r4, i6);
            C90524eJ.A02("childAtomSize should be positive", AnonymousClass000.A1Q(A03));
            if (r4.A07() == 1936289382) {
                int i7 = i6 + 8;
                boolean z2 = false;
                C85044Mw r12 = null;
                String str = null;
                Integer num = null;
                int i8 = -1;
                int i9 = 0;
                while (i7 - i6 < A03) {
                    int A032 = C90504eH.A03(r4, i7);
                    int A07 = r4.A07();
                    if (A07 == 1718775137) {
                        num = Integer.valueOf(r4.A07());
                    } else if (A07 == 1935894637) {
                        r4.A0T(4);
                        str = r4.A0O(4);
                    } else if (A07 == 1935894633) {
                        i8 = i7;
                        i9 = A032;
                    }
                    i7 += A032;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    String str2 = "frma atom is mandatory";
                    if (num != null) {
                        if (i8 != -1) {
                            z2 = true;
                        }
                        C90524eJ.A02("schi atom is mandatory", z2);
                        int i10 = i8 + 8;
                        while (true) {
                            byte[] bArr = null;
                            if (i10 - i8 >= i9) {
                                break;
                            }
                            int A033 = C90504eH.A03(r4, i10);
                            if (r4.A07() == 1952804451) {
                                int A072 = (r4.A07() >> 24) & MotionEventCompat.ACTION_MASK;
                                r4.A0T(1);
                                if (A072 == 0) {
                                    r4.A0T(1);
                                    i4 = 0;
                                    i5 = 0;
                                } else {
                                    int A0C = r4.A0C();
                                    i4 = (A0C & 240) >> 4;
                                    i5 = A0C & 15;
                                }
                                boolean A1R = AnonymousClass000.A1R(r4.A0C(), 1);
                                int A0C2 = r4.A0C();
                                byte[] bArr2 = new byte[16];
                                r4.A0V(bArr2, 0, 16);
                                if (A1R && A0C2 == 0) {
                                    int A0C3 = r4.A0C();
                                    bArr = new byte[A0C3];
                                    r4.A0V(bArr, 0, A0C3);
                                }
                                r12 = new C85044Mw(str, bArr2, bArr, A0C2, i4, i5, A1R);
                            } else {
                                i10 += A033;
                            }
                        }
                        str2 = "tenc atom is mandatory";
                        if (r12 != null) {
                            Pair create = Pair.create(num, r12);
                            if (create != null) {
                                return create;
                            }
                        }
                    }
                    throw AnonymousClass000.A0V(String.valueOf(str2));
                }
            }
            i6 += A03;
        }
        return null;
    }

    public static C32471gR A02(int i2) {
        C32471gR r1 = new C32471gR();
        r1.A0O = Integer.toString(i2);
        return r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: X.4Mw[]} */
    /* JADX WARNING: type inference failed for: r36v1, types: [X.5SL] */
    /* JADX WARNING: type inference failed for: r0v338, types: [X.4oy] */
    /* JADX WARNING: type inference failed for: r0v339, types: [X.4ox] */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06c0, code lost:
        if (r9 <= 0) goto L_0x06c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0c7d, code lost:
        if (r14 == 1) goto L_0x0c7f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x08ce  */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x0b32  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0b3f  */
    /* JADX WARNING: Removed duplicated region for block: B:633:0x0cfc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A03(X.AnonymousClass57J r50, X.C88644ar r51, X.C65423Us r52, X.C49762Vq r53, long r54, boolean r56) {
        /*
            java.util.ArrayList r24 = X.AnonymousClass000.A0u()
            r21 = 0
        L_0x0006:
            r3 = r52
            java.util.List r2 = r3.A01
            int r1 = r2.size()
            r0 = r21
            if (r0 >= r1) goto L_0x0dd4
            java.lang.Object r23 = r2.get(r0)
            r0 = r23
            X.3Us r0 = (X.C65423Us) r0
            r23 = r0
            int r1 = r0.A00
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 != r0) goto L_0x0942
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            X.3Ur r6 = r3.A01(r0)
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r0 = r23
            X.3Us r4 = r0.A00(r1)
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.3Ur r0 = r4.A01(r0)
            X.4eH r1 = r0.A00
            r0 = 16
            int r1 = X.C90504eH.A03(r1, r0)
            r0 = 1936684398(0x736f756e, float:1.8971874E31)
            if (r1 != r0) goto L_0x0892
            r16 = 1
        L_0x0049:
            r22 = 0
            r1 = -1
            r0 = r16
            if (r0 == r1) goto L_0x08eb
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            r0 = r23
            X.3Ur r0 = r0.A01(r1)
            X.4eH r8 = r0.A00
            r7 = 8
            int r0 = X.C90504eH.A03(r8, r7)
            int r0 = r0 >> 24
            r5 = r0 & 255(0xff, float:3.57E-43)
            r3 = 16
            r0 = 16
            if (r5 != 0) goto L_0x006d
            r0 = 8
        L_0x006d:
            r8.A0T(r0)
            int r36 = r8.A07()
            r2 = 4
            r8.A0T(r2)
            int r10 = r8.A01
            if (r5 != 0) goto L_0x007d
            r7 = 4
        L_0x007d:
            r19 = 0
            r9 = 0
        L_0x0080:
            byte[] r0 = r8.A02
            int r1 = r10 + r9
            byte r1 = r0[r1]
            r0 = -1
            if (r1 == r0) goto L_0x088b
            r9 = 0
        L_0x008a:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L_0x0877
            r8.A0T(r7)
        L_0x0094:
            r8.A0T(r3)
            int r7 = r8.A07()
            int r5 = r8.A07()
            r8.A0T(r2)
            int r9 = r8.A07()
            int r8 = r8.A07()
            r3 = 65536(0x10000, float:9.18355E-41)
            r2 = -65536(0xffffffffffff0000, float:NaN)
            if (r7 != 0) goto L_0x086b
            if (r5 != r3) goto L_0x0861
            if (r9 != r2) goto L_0x00b8
            if (r8 != 0) goto L_0x00b8
            r19 = 90
        L_0x00b8:
            r44 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r54 > r44 ? 1 : (r54 == r44 ? 0 : -1))
            if (r2 == 0) goto L_0x00c3
            r0 = r54
        L_0x00c3:
            X.4eH r5 = r6.A00
            r3 = 8
            int r2 = X.C90504eH.A03(r5, r3)
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x00d3
            r3 = 16
        L_0x00d3:
            r5.A0T(r3)
            long r29 = r5.A0I()
            int r2 = (r0 > r44 ? 1 : (r0 == r44 ? 0 : -1))
            if (r2 == 0) goto L_0x00e4
            r2 = r29
            long r44 = X.AnonymousClass3K4.A0G(r0, r2)
        L_0x00e4:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.3Us r1 = r4.A00(r0)
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.3Us r3 = r1.A00(r0)
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            X.3Ur r0 = r4.A01(r0)
            X.4eH r4 = r0.A00
            r2 = 8
            int r0 = X.C90504eH.A03(r4, r2)
            int r0 = r0 >> 24
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 16
            if (r1 != 0) goto L_0x010b
            r0 = 8
        L_0x010b:
            r4.A0T(r0)
            long r5 = r4.A0I()
            if (r1 != 0) goto L_0x0115
            r2 = 4
        L_0x0115:
            r4.A0T(r2)
            int r2 = r4.A0F()
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r2 >> 10
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            int r0 = r2 >> 5
            r0 = r0 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            r1.append(r0)
            r0 = r2 & 31
            int r0 = r0 + 96
            char r0 = (char) r0
            java.lang.String r1 = X.AnonymousClass3K3.A0p(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            android.util.Pair r28 = android.util.Pair.create(r0, r1)
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            X.3Ur r0 = r3.A01(r0)
            X.4eH r6 = r0.A00
            r0 = r28
            java.lang.Object r0 = r0.second
            r25 = r0
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0
            r25 = r0
            r0 = 12
            int r26 = X.C90504eH.A03(r6, r0)
            r13 = 0
            r27 = 0
            r0 = r26
            X.4Mw[] r0 = new X.C85044Mw[r0]
            r20 = r0
            r38 = 0
            r17 = 0
        L_0x016f:
            r1 = r17
            r0 = r26
            if (r1 >= r0) goto L_0x07fd
            int r0 = r6.A01
            r18 = r0
            int r15 = r6.A07()
            boolean r1 = X.AnonymousClass000.A1Q(r15)
            java.lang.String r31 = "childAtomSize should be positive"
            r0 = r31
            X.C90524eJ.A02(r0, r1)
            int r5 = r6.A07()
            r0 = 1635148593(0x61766331, float:2.840654E20)
            r2 = r50
            if (r5 == r0) goto L_0x063d
            r0 = 1635148595(0x61766333, float:2.8406544E20)
            if (r5 == r0) goto L_0x063d
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r5 == r0) goto L_0x063d
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r5 == r0) goto L_0x063d
            r0 = 1836070006(0x6d703476, float:4.646239E27)
            if (r5 == r0) goto L_0x063d
            r0 = 1752589105(0x68766331, float:4.6541277E24)
            if (r5 == r0) goto L_0x063d
            r0 = 1751479857(0x68657631, float:4.3344087E24)
            if (r5 == r0) goto L_0x063d
            r0 = 1932670515(0x73323633, float:1.4119387E31)
            if (r5 == r0) goto L_0x063d
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r5 == r0) goto L_0x063d
            r0 = 1987063865(0x76703039, float:1.2178997E33)
            if (r5 == r0) goto L_0x063d
            r0 = 1635135537(0x61763031, float:2.8383572E20)
            if (r5 == r0) goto L_0x063d
            r0 = 1685479798(0x64766176, float:1.8179687E22)
            if (r5 == r0) goto L_0x063d
            r0 = 1685479729(0x64766131, float:1.817961E22)
            if (r5 == r0) goto L_0x063d
            r0 = 1685481573(0x64766865, float:1.8181686E22)
            if (r5 == r0) goto L_0x063d
            r0 = 1685481521(0x64766831, float:1.8181627E22)
            if (r5 == r0) goto L_0x063d
            r0 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r5 == r0) goto L_0x02e4
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r5 == r0) goto L_0x02e4
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r5 == r0) goto L_0x02e4
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r5 == r0) goto L_0x02e4
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r5 == r0) goto L_0x02e4
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r5 == r0) goto L_0x02e4
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r5 == r0) goto L_0x02e4
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r5 == r0) goto L_0x02e4
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r5 == r0) goto L_0x02e4
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r5 == r0) goto L_0x02e4
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r5 == r0) goto L_0x02e4
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r5 == r0) goto L_0x02e4
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r5 == r0) goto L_0x02e4
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r5 == r0) goto L_0x02e4
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r5 == r0) goto L_0x02e4
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r5 == r0) goto L_0x02e4
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r5 == r0) goto L_0x02e4
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r5 == r0) goto L_0x02e4
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r5 == r0) goto L_0x02e4
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r5 == r0) goto L_0x02e4
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r5 == r0) goto L_0x02e4
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r5 == r0) goto L_0x0292
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r5 == r0) goto L_0x0292
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r5 == r0) goto L_0x0292
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r5 == r0) goto L_0x0292
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r5 == r0) goto L_0x0292
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r5 != r0) goto L_0x0286
            int r0 = r18 + 8
            int r0 = r0 + 8
            r6.A0S(r0)
            r6.A0M()
            java.lang.String r0 = r6.A0M()
            if (r0 == 0) goto L_0x027b
            X.1gR r4 = A02(r36)
        L_0x0274:
            r4.A0R = r0
        L_0x0276:
            X.1gT r13 = new X.1gT
            r13.<init>((X.C32471gR) r4)
        L_0x027b:
            int r18 = r18 + r15
            r0 = r18
            r6.A0S(r0)
            int r17 = r17 + 1
            goto L_0x016f
        L_0x0286:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r5 != r0) goto L_0x027b
            X.1gR r4 = A02(r36)
            java.lang.String r0 = "application/x-camera-motion"
            goto L_0x0274
        L_0x0292:
            int r0 = r18 + 8
            int r0 = r0 + 8
            r6.A0S(r0)
            java.lang.String r7 = "application/ttml+xml"
            r3 = 0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r5 == r2) goto L_0x02bb
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r5 != r2) goto L_0x02ca
            int r2 = r15 + -8
            int r4 = r2 + -8
            byte[] r3 = new byte[r4]
            r2 = 0
            r6.A0V(r3, r2, r4)
            X.1kb r3 = X.C34641kb.of(r3)
            java.lang.String r7 = "application/x-quicktime-tx3g"
        L_0x02bb:
            X.1gR r4 = A02(r36)
            r4.A0R = r7
            r2 = r25
            r4.A0Q = r2
            r4.A0H = r0
            r4.A0S = r3
            goto L_0x0276
        L_0x02ca:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r5 != r2) goto L_0x02d2
            java.lang.String r7 = "application/x-mp4-vtt"
            goto L_0x02bb
        L_0x02d2:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r5 != r2) goto L_0x02da
            r0 = 0
            goto L_0x02bb
        L_0x02da:
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r5 != r2) goto L_0x0dc1
            r38 = 1
            java.lang.String r7 = "application/x-mp4-cea-608"
            goto L_0x02bb
        L_0x02e4:
            int r0 = r18 + 8
            r1 = 8
            int r0 = r0 + 8
            r6.A0S(r0)
            r0 = 6
            if (r56 == 0) goto L_0x0619
            int r8 = r6.A0F()
            r6.A0T(r0)
        L_0x02f7:
            r4 = 16
            r1 = 2
            r7 = 1
            if (r8 == 0) goto L_0x05f4
            if (r8 == r7) goto L_0x05f4
            if (r8 != r1) goto L_0x027b
            r6.A0T(r4)
            long r0 = r6.A0H()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r0 = java.lang.Math.round(r0)
            int r3 = (int) r0
            int r11 = r6.A0E()
            r0 = 20
            r6.A0T(r0)
        L_0x031a:
            int r4 = r6.A01
            r0 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r5 != r0) goto L_0x05f1
            r0 = r18
            android.util.Pair r8 = A01(r6, r0, r15)
            if (r8 == 0) goto L_0x05ee
            java.lang.Object r0 = r8.first
            int r5 = X.AnonymousClass000.A0D(r0)
            if (r50 != 0) goto L_0x05d3
            r14 = 0
        L_0x0332:
            java.lang.Object r0 = r8.second
            r20[r17] = r0
        L_0x0336:
            r6.A0S(r4)
        L_0x0339:
            r0 = 1633889587(0x61632d33, float:2.6191674E20)
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r2 = "audio/raw"
            if (r5 != r0) goto L_0x053d
            java.lang.String r2 = "audio/ac3"
        L_0x0345:
            r12 = -1
        L_0x0346:
            r32 = 0
            r5 = 0
        L_0x0349:
            int r0 = r4 - r18
            if (r0 >= r15) goto L_0x061f
            int r8 = X.C90504eH.A03(r6, r4)
            if (r8 > 0) goto L_0x0354
            r7 = 0
        L_0x0354:
            r0 = r31
            X.C90524eJ.A02(r0, r7)
            int r1 = r6.A07()
            r0 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 == r0) goto L_0x0388
            if (r56 == 0) goto L_0x03b8
            r0 = 2002876005(0x77617665, float:4.5729223E33)
            if (r1 != r0) goto L_0x03b8
            r7 = 1
            int r1 = r6.A01
        L_0x036c:
            int r0 = r1 - r4
            if (r0 >= r8) goto L_0x03fe
            int r10 = X.C90504eH.A03(r6, r1)
            boolean r9 = X.AnonymousClass000.A1Q(r10)
            r0 = r31
            X.C90524eJ.A02(r0, r9)
            int r9 = r6.A07()
            r0 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r0) goto L_0x038a
            int r1 = r1 + r10
            goto L_0x036c
        L_0x0388:
            r7 = 1
            r1 = r4
        L_0x038a:
            r0 = -1
            if (r1 == r0) goto L_0x03fe
            android.util.Pair r0 = A00(r6, r1)
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x03fe
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x04f2
            int r0 = r1.length
            X.4dh r3 = new X.4dh
            r3.<init>(r1, r0)
            r0 = 0
            X.4JS r0 = X.C89734co.A01(r3, r0)
            int r3 = r0.A01
            int r11 = r0.A00
            java.lang.String r0 = r0.A02
            r32 = r0
            goto L_0x04f2
        L_0x03b8:
            r0 = 1684103987(0x64616333, float:1.6630662E22)
            if (r1 != r0) goto L_0x0401
            int r0 = r4 + 8
            r6.A0S(r0)
            java.lang.String r0 = java.lang.Integer.toString(r36)
            int r1 = r6.A0C()
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r7 = r1 >> 6
            int[] r1 = X.AnonymousClass4ZE.A03
            r9 = r1[r7]
            int r10 = r6.A0C()
            int[] r7 = X.AnonymousClass4ZE.A02
            r1 = r10 & 56
            int r1 = r1 >> 3
            r7 = r7[r1]
            r1 = r10 & 4
            if (r1 == 0) goto L_0x03e4
            int r7 = r7 + 1
        L_0x03e4:
            X.1gR r1 = X.AnonymousClass3K4.A0N()
            r1.A0O = r0
            java.lang.String r0 = "audio/ac3"
            r1.A0R = r0
            r1.A04 = r7
            r1.A0D = r9
        L_0x03f2:
            r1.A0I = r14
            r0 = r25
            r1.A0Q = r0
            X.1gT r13 = new X.1gT
            r13.<init>((X.C32471gR) r1)
        L_0x03fd:
            r7 = 1
        L_0x03fe:
            int r4 = r4 + r8
            goto L_0x0349
        L_0x0401:
            r0 = 1684366131(0x64656333, float:1.692581E22)
            if (r1 != r0) goto L_0x046c
            int r0 = r4 + 8
            r6.A0S(r0)
            java.lang.String r10 = java.lang.Integer.toString(r36)
            r0 = 2
            int r1 = X.C90504eH.A01(r6, r0)
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r7 = r1 >> 6
            int[] r1 = X.AnonymousClass4ZE.A03
            r9 = r1[r7]
            int r13 = r6.A0C()
            int[] r7 = X.AnonymousClass4ZE.A02
            r1 = r13 & 14
            int r1 = r1 >> 1
            r7 = r7[r1]
            r1 = r13 & 1
            if (r1 == 0) goto L_0x042e
            int r7 = r7 + 1
        L_0x042e:
            int r1 = r6.A0C()
            r1 = r1 & 30
            int r1 = r1 >> 1
            if (r1 <= 0) goto L_0x0441
            int r1 = r6.A0C()
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0441
            int r7 = r7 + 2
        L_0x0441:
            int r0 = X.C90504eH.A00(r6)
            if (r0 <= 0) goto L_0x0469
            int r0 = r6.A0C()
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0469
            java.lang.String r1 = "audio/eac3-joc"
        L_0x0451:
            X.1gR r0 = X.AnonymousClass3K4.A0N()
            r0.A0O = r10
            r0.A0R = r1
            r0.A04 = r7
            r0.A0D = r9
        L_0x045d:
            r0.A0I = r14
            r1 = r25
            r0.A0Q = r1
            X.1gT r13 = new X.1gT
            r13.<init>((X.C32471gR) r0)
            goto L_0x03fd
        L_0x0469:
            java.lang.String r1 = "audio/eac3"
            goto L_0x0451
        L_0x046c:
            r0 = 1684103988(0x64616334, float:1.6630663E22)
            if (r1 != r0) goto L_0x049c
            int r0 = r4 + 8
            r6.A0S(r0)
            java.lang.String r9 = java.lang.Integer.toString(r36)
            r7 = 1
            int r0 = X.C90504eH.A01(r6, r7)
            r0 = r0 & 32
            int r1 = r0 >> 5
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r1 != r7) goto L_0x048b
            r0 = 48000(0xbb80, float:6.7262E-41)
        L_0x048b:
            X.1gR r1 = X.AnonymousClass3K4.A0N()
            r1.A0O = r9
            java.lang.String r7 = "audio/ac4"
            r1.A0R = r7
            r7 = 2
            r1.A04 = r7
            r1.A0D = r0
            goto L_0x03f2
        L_0x049c:
            r0 = 1684305011(0x64647473, float:1.6856995E22)
            if (r1 != r0) goto L_0x04ac
            X.1gR r0 = A02(r36)
            r0.A0R = r2
            r0.A04 = r11
            r0.A0D = r3
            goto L_0x045d
        L_0x04ac:
            r0 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r1 != r0) goto L_0x04ca
            int r7 = r8 + -8
            byte[] r1 = A00
            int r5 = r1.length
            int r0 = r5 + r7
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r0 = r4 + 8
            r6.A0S(r0)
            r6.A0V(r1, r5, r7)
            java.util.List r5 = X.C806644z.A00(r1)
            goto L_0x03fd
        L_0x04ca:
            r0 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r1 != r0) goto L_0x04f8
            int r5 = r8 + -12
            int r0 = r5 + 4
            byte[] r1 = new byte[r0]
            r7 = 102(0x66, float:1.43E-43)
            r0 = 0
            r1[r0] = r7
            r0 = 76
            r7 = 1
            r1[r7] = r0
            r9 = 97
            r0 = 2
            r1[r0] = r9
            r9 = 3
            r0 = 67
            r1[r9] = r0
            int r0 = r4 + 12
            r6.A0S(r0)
            r0 = 4
            r6.A0V(r1, r0, r5)
        L_0x04f2:
            X.1kb r5 = X.C34641kb.of(r1)
            goto L_0x03fe
        L_0x04f8:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r7 = 1
            if (r1 != r0) goto L_0x03fe
            int r3 = r8 + -12
            byte[] r0 = new byte[r3]
            int r1 = r4 + 12
            r6.A0S(r1)
            r1 = 0
            r6.A0V(r0, r1, r3)
            X.4eH r3 = new X.4eH
            r3.<init>((byte[]) r0)
            r1 = 9
            r3.A0S(r1)
            int r5 = r3.A0C()
            r1 = 20
            int r1 = X.C90504eH.A02(r3, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            android.util.Pair r1 = android.util.Pair.create(r3, r1)
            java.lang.Object r3 = r1.first
            int r3 = X.AnonymousClass000.A0D(r3)
            java.lang.Object r1 = r1.second
            int r11 = X.AnonymousClass000.A0D(r1)
            X.1kb r5 = X.C34641kb.of(r0)
            goto L_0x03fe
        L_0x053d:
            r0 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r5 != r0) goto L_0x0546
            java.lang.String r2 = "audio/eac3"
            goto L_0x0345
        L_0x0546:
            r0 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r5 != r0) goto L_0x054f
            java.lang.String r2 = "audio/ac4"
            goto L_0x0345
        L_0x054f:
            r0 = 1685353315(0x64747363, float:1.803728E22)
            if (r5 != r0) goto L_0x0558
            java.lang.String r2 = "audio/vnd.dts"
            goto L_0x0345
        L_0x0558:
            r0 = 1685353320(0x64747368, float:1.8037286E22)
            if (r5 == r0) goto L_0x05cf
            r0 = 1685353324(0x6474736c, float:1.803729E22)
            if (r5 == r0) goto L_0x05cf
            r0 = 1685353317(0x64747365, float:1.8037282E22)
            if (r5 != r0) goto L_0x056b
            java.lang.String r2 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0345
        L_0x056b:
            r0 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r5 != r0) goto L_0x0574
            java.lang.String r2 = "audio/3gpp"
            goto L_0x0345
        L_0x0574:
            r0 = 1935767394(0x73617762, float:1.7863284E31)
            if (r5 != r0) goto L_0x057d
            java.lang.String r2 = "audio/amr-wb"
            goto L_0x0345
        L_0x057d:
            r0 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r5 == r0) goto L_0x05cc
            r0 = 1936684916(0x736f7774, float:1.89725E31)
            if (r5 == r0) goto L_0x05cc
            r0 = 1953984371(0x74776f73, float:7.841539E31)
            if (r5 != r0) goto L_0x0590
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0346
        L_0x0590:
            r0 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r5 == r0) goto L_0x05c8
            r0 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r5 == r0) goto L_0x05c8
            if (r5 != r1) goto L_0x05a0
            java.lang.String r2 = "audio/alac"
            goto L_0x0345
        L_0x05a0:
            r0 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r5 != r0) goto L_0x05a9
            java.lang.String r2 = "audio/g711-alaw"
            goto L_0x0345
        L_0x05a9:
            r0 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r5 != r0) goto L_0x05b2
            java.lang.String r2 = "audio/g711-mlaw"
            goto L_0x0345
        L_0x05b2:
            r0 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r5 != r0) goto L_0x05bb
            java.lang.String r2 = "audio/opus"
            goto L_0x0345
        L_0x05bb:
            r0 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r5 != r0) goto L_0x05c4
            java.lang.String r2 = "audio/flac"
            goto L_0x0345
        L_0x05c4:
            r12 = -1
            r2 = 0
            goto L_0x0346
        L_0x05c8:
            java.lang.String r2 = "audio/mpeg"
            goto L_0x0345
        L_0x05cc:
            r12 = 2
            goto L_0x0346
        L_0x05cf:
            java.lang.String r2 = "audio/vnd.dts.hd"
            goto L_0x0345
        L_0x05d3:
            java.lang.Object r0 = r8.second
            X.4Mw r0 = (X.C85044Mw) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r2.A01
            boolean r0 = X.AnonymousClass3C1.A0F(r0, r1)
            if (r0 == 0) goto L_0x05e4
            r14 = r2
            goto L_0x0332
        L_0x05e4:
            r0 = 0
            X.4jV[] r2 = r2.A02
            X.57J r14 = new X.57J
            r14.<init>(r1, r2, r0)
            goto L_0x0332
        L_0x05ee:
            r14 = r2
            goto L_0x0336
        L_0x05f1:
            r14 = r2
            goto L_0x0339
        L_0x05f4:
            int r11 = r6.A0F()
            r6.A0T(r0)
            byte[] r3 = r6.A02
            int r0 = r6.A01
            int r1 = r0 + 1
            int r0 = X.C90504eH.A04(r6, r3, r1, r0)
            int r9 = r0 << 8
            int r0 = r1 + 1
            int r3 = X.C90504eH.A04(r6, r3, r0, r1)
            r3 = r3 | r9
            int r0 = r0 + 2
            r6.A01 = r0
            if (r8 != r7) goto L_0x031a
            r6.A0T(r4)
            goto L_0x031a
        L_0x0619:
            r6.A0T(r1)
            r8 = 0
            goto L_0x02f7
        L_0x061f:
            if (r13 != 0) goto L_0x027b
            if (r2 == 0) goto L_0x027b
            X.1gR r4 = A02(r36)
            r4.A0R = r2
            r0 = r32
            r4.A0M = r0
            r4.A04 = r11
            r4.A0D = r3
            r4.A09 = r12
            r4.A0S = r5
            r4.A0I = r14
            r0 = r25
            r4.A0Q = r0
            goto L_0x0276
        L_0x063d:
            r14 = r2
            int r0 = r18 + 8
            int r0 = r0 + 8
            r6.A0S(r0)
            r0 = 16
            r6.A0T(r0)
            int r35 = r6.A0F()
            int r34 = r6.A0F()
            r0 = 50
            r6.A0T(r0)
            int r8 = r6.A01
            r10 = 0
            r0 = 1701733238(0x656e6376, float:7.035987E22)
            if (r5 != r0) goto L_0x0677
            r0 = r18
            android.util.Pair r3 = A01(r6, r0, r15)
            if (r3 == 0) goto L_0x0674
            java.lang.Object r0 = r3.first
            int r5 = X.AnonymousClass000.A0D(r0)
            if (r50 != 0) goto L_0x07e5
            r14 = r10
        L_0x0670:
            java.lang.Object r0 = r3.second
            r20[r17] = r0
        L_0x0674:
            r6.A0S(r8)
        L_0x0677:
            r0 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r5 != r0) goto L_0x07e2
            java.lang.String r3 = "video/mpeg"
        L_0x067e:
            r33 = r10
            r7 = -1
            r2 = 1065353216(0x3f800000, float:1.0)
            r32 = 0
            r12 = r10
        L_0x0686:
            int r0 = r8 - r18
            if (r0 >= r15) goto L_0x069b
            r6.A0S(r8)
            int r4 = r6.A01
            int r9 = r6.A07()
            if (r9 != 0) goto L_0x06bf
            int r0 = r6.A01
            int r0 = r0 - r18
            if (r0 != r15) goto L_0x06c2
        L_0x069b:
            if (r3 == 0) goto L_0x027b
            X.1gR r4 = A02(r36)
            r4.A0R = r3
            r4.A0M = r10
            r0 = r35
            r4.A0G = r0
            r0 = r34
            r4.A07 = r0
            r4.A01 = r2
            r0 = r19
            r4.A0C = r0
            r4.A0T = r12
            r4.A0F = r7
            r0 = r33
            r4.A0S = r0
            r4.A0I = r14
            goto L_0x0276
        L_0x06bf:
            r1 = 1
            if (r9 > 0) goto L_0x06c3
        L_0x06c2:
            r1 = 0
        L_0x06c3:
            r0 = r31
            X.C90524eJ.A02(r0, r1)
            int r0 = r6.A07()
            r1 = 1635148611(0x61766343, float:2.8406573E20)
            r11 = 3
            if (r0 != r1) goto L_0x06f4
            boolean r0 = X.AnonymousClass000.A1W(r3)
            X.C90524eJ.A04(r0)
            int r0 = r4 + 8
            r6.A0S(r0)
            X.4aE r1 = X.C88274aE.A00(r6)
            java.util.List r0 = r1.A05
            r33 = r0
            int r0 = r1.A02
            r27 = r0
            if (r32 != 0) goto L_0x06ee
            float r2 = r1.A00
        L_0x06ee:
            java.lang.String r10 = r1.A04
            java.lang.String r3 = "video/avc"
        L_0x06f2:
            int r8 = r8 + r9
            goto L_0x0686
        L_0x06f4:
            r1 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r1) goto L_0x0716
            boolean r0 = X.AnonymousClass000.A1W(r3)
            X.C90524eJ.A04(r0)
            int r0 = r4 + 8
            r6.A0S(r0)
            X.4Zo r1 = X.C88014Zo.A00(r6)
            java.util.List r0 = r1.A02
            r33 = r0
            int r0 = r1.A00
            r27 = r0
            java.lang.String r10 = r1.A01
            java.lang.String r3 = "video/hevc"
            goto L_0x06f2
        L_0x0716:
            r1 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r1) goto L_0x07d6
            r1 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 == r1) goto L_0x07d6
            r1 = 1987076931(0x76706343, float:1.21891066E33)
            if (r0 != r1) goto L_0x0737
            boolean r0 = X.AnonymousClass000.A1W(r3)
            X.C90524eJ.A04(r0)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r5 != r0) goto L_0x0734
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x06f2
        L_0x0734:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x06f2
        L_0x0737:
            r1 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r1) goto L_0x0746
            boolean r0 = X.AnonymousClass000.A1W(r3)
            X.C90524eJ.A04(r0)
            java.lang.String r3 = "video/av01"
            goto L_0x06f2
        L_0x0746:
            r1 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r1) goto L_0x0755
            boolean r0 = X.AnonymousClass000.A1W(r3)
            X.C90524eJ.A04(r0)
            java.lang.String r3 = "video/3gpp"
            goto L_0x06f2
        L_0x0755:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r1) goto L_0x0772
            boolean r0 = X.AnonymousClass000.A1W(r3)
            X.C90524eJ.A04(r0)
            android.util.Pair r0 = A00(r6, r4)
            java.lang.Object r3 = r0.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x06f2
            X.1kb r33 = X.C34641kb.of(r0)
            goto L_0x06f2
        L_0x0772:
            r1 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r1) goto L_0x0788
            int r0 = r4 + 8
            int r1 = X.C90504eH.A02(r6, r0)
            int r0 = r6.A0E()
            float r2 = (float) r1
            float r0 = (float) r0
            float r2 = r2 / r0
            r32 = 1
            goto L_0x06f2
        L_0x0788:
            r1 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r1) goto L_0x07ae
            int r1 = r4 + 8
        L_0x078f:
            int r0 = r1 - r4
            if (r0 >= r9) goto L_0x07ab
            int r0 = X.C90504eH.A03(r6, r1)
            int r12 = r6.A07()
            r11 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r12 != r11) goto L_0x07a9
            byte[] r4 = r6.A02
            int r0 = r0 + r1
            byte[] r12 = java.util.Arrays.copyOfRange(r4, r1, r0)
            goto L_0x06f2
        L_0x07a9:
            int r1 = r1 + r0
            goto L_0x078f
        L_0x07ab:
            r12 = 0
            goto L_0x06f2
        L_0x07ae:
            r1 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r1) goto L_0x06f2
            int r0 = r6.A0C()
            r6.A0T(r11)
            if (r0 != 0) goto L_0x06f2
            int r0 = r6.A0C()
            if (r0 == 0) goto L_0x07d3
            r1 = 1
            if (r0 == r1) goto L_0x07d0
            r1 = 2
            if (r0 == r1) goto L_0x07cd
            if (r0 != r11) goto L_0x06f2
            r7 = 3
            goto L_0x06f2
        L_0x07cd:
            r7 = 2
            goto L_0x06f2
        L_0x07d0:
            r7 = 1
            goto L_0x06f2
        L_0x07d3:
            r7 = 0
            goto L_0x06f2
        L_0x07d6:
            X.4ZI r0 = X.AnonymousClass4ZI.A00(r6)
            if (r0 == 0) goto L_0x06f2
            java.lang.String r10 = r0.A00
            java.lang.String r3 = "video/dolby-vision"
            goto L_0x06f2
        L_0x07e2:
            r3 = r10
            goto L_0x067e
        L_0x07e5:
            java.lang.Object r0 = r3.second
            X.4Mw r0 = (X.C85044Mw) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r2.A01
            boolean r0 = X.AnonymousClass3C1.A0F(r0, r1)
            if (r0 != 0) goto L_0x0670
            r0 = 0
            X.4jV[] r2 = r2.A02
            X.57J r14 = new X.57J
            r14.<init>(r1, r2, r0)
            goto L_0x0670
        L_0x07fd:
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r1 = r23
            X.3Us r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x0dbc
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            X.3Ur r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0dbc
            X.4eH r7 = r0.A00
            r0 = 8
            int r0 = X.C90504eH.A03(r7, r0)
            int r0 = r0 >> 24
            r9 = r0 & 255(0xff, float:3.57E-43)
            int r6 = r7.A0E()
            long[] r5 = new long[r6]
            long[] r4 = new long[r6]
            r3 = 0
        L_0x0826:
            if (r3 >= r6) goto L_0x08be
            r2 = 1
            if (r9 != r2) goto L_0x085c
            long r0 = r7.A0J()
        L_0x082f:
            r5[r3] = r0
            if (r9 != r2) goto L_0x0856
            long r0 = r7.A0H()
        L_0x0837:
            r4[r3] = r0
            byte[] r8 = r7.A02
            int r1 = r7.A01
            int r0 = r1 + 1
            int r1 = X.C90504eH.A04(r7, r8, r0, r1)
            int r10 = r1 << 8
            int r1 = r0 + 1
            int r0 = X.C90504eH.A04(r7, r8, r1, r0)
            r0 = r0 | r10
            short r0 = (short) r0
            if (r0 != r2) goto L_0x0dc6
            r0 = 2
            r7.A0T(r0)
            int r3 = r3 + 1
            goto L_0x0826
        L_0x0856:
            int r0 = r7.A07()
            long r0 = (long) r0
            goto L_0x0837
        L_0x085c:
            long r0 = r7.A0I()
            goto L_0x082f
        L_0x0861:
            if (r5 != r2) goto L_0x00b8
            if (r9 != r3) goto L_0x00b8
            if (r8 != 0) goto L_0x00b8
            r19 = 270(0x10e, float:3.78E-43)
            goto L_0x00b8
        L_0x086b:
            if (r7 != r2) goto L_0x00b8
            if (r5 != 0) goto L_0x00b8
            if (r9 != 0) goto L_0x00b8
            if (r8 != r2) goto L_0x00b8
            r19 = 180(0xb4, float:2.52E-43)
            goto L_0x00b8
        L_0x0877:
            if (r5 != 0) goto L_0x0886
            long r11 = r8.A0I()
        L_0x087d:
            r9 = 0
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0094
            r0 = r11
            goto L_0x0094
        L_0x0886:
            long r11 = r8.A0J()
            goto L_0x087d
        L_0x088b:
            int r9 = r9 + 1
            if (r9 < r7) goto L_0x0080
            r9 = 1
            goto L_0x008a
        L_0x0892:
            r0 = 1986618469(0x76696465, float:1.1834389E33)
            if (r1 != r0) goto L_0x089b
            r16 = 2
            goto L_0x0049
        L_0x089b:
            r0 = 1952807028(0x74657874, float:7.272211E31)
            if (r1 == r0) goto L_0x08ba
            r0 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r1 == r0) goto L_0x08ba
            r0 = 1937072756(0x73756274, float:1.944137E31)
            if (r1 == r0) goto L_0x08ba
            r0 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r1 == r0) goto L_0x08ba
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            r16 = -1
            if (r1 != r0) goto L_0x0049
            r16 = 5
            goto L_0x0049
        L_0x08ba:
            r16 = 3
            goto L_0x0049
        L_0x08be:
            android.util.Pair r0 = android.util.Pair.create(r5, r4)
            if (r0 == 0) goto L_0x0dbc
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
        L_0x08cc:
            if (r13 == 0) goto L_0x08eb
            r2 = r28
            java.lang.Object r2 = r2.first
            long r40 = X.C13700nu.A01(r2)
            X.4Or r22 = new X.4Or
            r31 = r22
            r32 = r13
            r33 = r1
            r34 = r0
            r35 = r20
            r37 = r16
            r39 = r27
            r42 = r29
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r44)
        L_0x08eb:
            r1 = r53
            r0 = r22
            java.lang.Object r13 = r1.apply(r0)
            X.4Or r13 = (X.C85494Or) r13
            if (r13 == 0) goto L_0x0942
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            r0 = r23
            X.3Us r1 = r0.A00(r1)
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.3Us r1 = r1.A00(r0)
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.3Us r2 = r1.A00(r0)
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            X.3Ur r3 = r2.A01(r0)
            if (r3 == 0) goto L_0x0daa
            X.1gT r1 = r13.A07
            X.4ox r36 = new X.4ox
            r0 = r36
            r0.<init>(r1, r3)
        L_0x0920:
            int r35 = r36.AFg()
            r0 = 0
            if (r35 != 0) goto L_0x0946
            long[] r4 = new long[r0]
            int[] r3 = new int[r0]
            r14 = 0
            long[] r2 = new long[r0]
            int[] r0 = new int[r0]
            r15 = 0
            X.4S8 r1 = new X.4S8
            r8 = r1
            r9 = r13
            r10 = r3
            r11 = r0
            r12 = r4
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L_0x093d:
            r0 = r24
            r0.add(r1)
        L_0x0942:
            int r21 = r21 + 1
            goto L_0x0006
        L_0x0946:
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            X.3Ur r1 = r2.A01(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0a55
            r1 = 1668232756(0x636f3634, float:4.4126776E21)
            X.3Ur r1 = r2.A01(r1)
            r34 = 1
        L_0x0959:
            X.4eH r1 = r1.A00
            r39 = r1
            r1 = 1937011555(0x73747363, float:1.9367382E31)
            X.3Ur r1 = r2.A01(r1)
            X.4eH r1 = r1.A00
            r38 = r1
            r1 = 1937011827(0x73747473, float:1.9367711E31)
            X.3Ur r1 = r2.A01(r1)
            X.4eH r1 = r1.A00
            r37 = r1
            r1 = 1937011571(0x73747373, float:1.9367401E31)
            X.3Ur r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x0a51
            X.4eH r1 = r1.A00
            r33 = r1
        L_0x0980:
            r1 = 1668576371(0x63747473, float:4.5093966E21)
            X.3Ur r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x0a4d
            X.4eH r1 = r1.A00
            r32 = r1
        L_0x098d:
            r8 = 0
            r31 = 0
            r2 = 12
            r1 = r39
            int r12 = X.C90504eH.A02(r1, r2)
            r1 = r38
            int r30 = X.C90504eH.A02(r1, r2)
            int r1 = r38.A07()
            r3 = 1
            if (r1 == r0) goto L_0x09a6
            r3 = 0
        L_0x09a6:
            java.lang.String r1 = "first_chunk must be 1"
            X.C90524eJ.A02(r1, r3)
            r7 = -1
            r1 = r37
            int r6 = X.C90504eH.A02(r1, r2)
            int r6 = r6 - r0
            int r11 = r37.A0E()
            int r25 = r37.A0E()
            if (r32 == 0) goto L_0x0a49
            r1 = r32
            int r23 = X.C90504eH.A02(r1, r2)
        L_0x09c3:
            if (r33 == 0) goto L_0x0a43
            r1 = r33
            int r5 = X.C90504eH.A02(r1, r2)
            if (r5 <= 0) goto L_0x0a45
            int r1 = r33.A0E()
            int r15 = r1 + -1
        L_0x09d3:
            int r4 = r36.ACK()
            X.1gT r1 = r13.A07
            r44 = r1
            java.lang.String r2 = r1.A0T
            if (r4 == r7) goto L_0x0a96
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x09f7
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x09f7
            java.lang.String r1 = "audio/g711-alaw"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0a96
        L_0x09f7:
            if (r6 != 0) goto L_0x0a96
            if (r23 != 0) goto L_0x0a96
            if (r5 != 0) goto L_0x0a96
            long[] r11 = new long[r12]
            int[] r10 = new int[r12]
        L_0x0a01:
            r18 = 1
            int r7 = r7 + 1
            if (r7 != r12) goto L_0x0a1c
            r0 = r25
            long r0 = (long) r0
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r4
            r7 = 0
            r3 = 0
            r2 = 0
        L_0x0a10:
            if (r3 >= r12) goto L_0x0a59
            r5 = r10[r3]
            int r5 = r5 + r8
            int r5 = r5 + -1
            int r5 = r5 / r8
            int r2 = r2 + r5
            int r3 = r3 + 1
            goto L_0x0a10
        L_0x0a1c:
            if (r34 == 0) goto L_0x0a3e
            long r5 = r39.A0J()
        L_0x0a22:
            if (r7 != r8) goto L_0x0a37
            int r31 = r38.A0E()
            r2 = 4
            r1 = r38
            r1.A0T(r2)
            int r30 = r30 - r0
            if (r30 <= 0) goto L_0x0a3c
            int r8 = r38.A0E()
            int r8 = r8 - r0
        L_0x0a37:
            r11[r7] = r5
            r10[r7] = r31
            goto L_0x0a01
        L_0x0a3c:
            r8 = -1
            goto L_0x0a37
        L_0x0a3e:
            long r5 = r39.A0I()
            goto L_0x0a22
        L_0x0a43:
            r5 = 0
            goto L_0x0a47
        L_0x0a45:
            r33 = 0
        L_0x0a47:
            r15 = -1
            goto L_0x09d3
        L_0x0a49:
            r23 = 0
            goto L_0x09c3
        L_0x0a4d:
            r32 = 0
            goto L_0x098d
        L_0x0a51:
            r33 = 0
            goto L_0x0980
        L_0x0a55:
            r34 = 0
            goto L_0x0959
        L_0x0a59:
            long[] r3 = new long[r2]
            r27 = r3
            int[] r3 = new int[r2]
            r29 = r3
            long[] r9 = new long[r2]
            int[] r2 = new int[r2]
            r28 = r2
            r6 = 0
            r17 = 0
            r26 = 0
        L_0x0a6c:
            if (r7 >= r12) goto L_0x0bcb
            r5 = r10[r7]
            r15 = r11[r7]
        L_0x0a72:
            if (r5 <= 0) goto L_0x0a93
            int r14 = java.lang.Math.min(r8, r5)
            r27[r17] = r15
            int r3 = r4 * r14
            r29[r17] = r3
            r2 = r26
            int r26 = java.lang.Math.max(r2, r3)
            long r2 = (long) r6
            long r2 = r2 * r0
            r9[r17] = r2
            r28[r17] = r18
            r2 = r29[r17]
            long r2 = (long) r2
            long r15 = r15 + r2
            int r6 = r6 + r14
            int r5 = r5 - r14
            int r17 = r17 + 1
            goto L_0x0a72
        L_0x0a93:
            int r7 = r7 + 1
            goto L_0x0a6c
        L_0x0a96:
            r0 = r35
            long[] r0 = new long[r0]
            r27 = r0
            r0 = r35
            int[] r0 = new int[r0]
            r29 = r0
            r0 = r35
            long[] r9 = new long[r0]
            int[] r0 = new int[r0]
            r28 = r0
            r4 = 0
            r26 = 0
            r22 = 0
            r14 = 0
            r10 = 0
            r0 = 0
            r19 = 0
        L_0x0ab5:
            java.lang.String r16 = "AtomParsers"
            r2 = r35
            if (r4 >= r2) goto L_0x0ae2
            r18 = 1
        L_0x0abd:
            if (r14 != 0) goto L_0x0b71
            int r7 = r7 + 1
            if (r7 != r12) goto L_0x0b4a
            java.lang.String r3 = "Unexpected end of chunk data"
            r2 = r16
            android.util.Log.w(r2, r3)
            r2 = r27
            long[] r27 = java.util.Arrays.copyOf(r2, r4)
            r2 = r29
            int[] r29 = java.util.Arrays.copyOf(r2, r4)
            long[] r9 = java.util.Arrays.copyOf(r9, r4)
            r2 = r28
            int[] r28 = java.util.Arrays.copyOf(r2, r4)
            r35 = r4
        L_0x0ae2:
            r2 = r22
            long r2 = (long) r2
            long r0 = r0 + r2
            if (r32 == 0) goto L_0x0b48
        L_0x0ae8:
            if (r23 <= 0) goto L_0x0b48
            int r2 = r32.A0E()
            if (r2 == 0) goto L_0x0b42
            r4 = 0
        L_0x0af1:
            if (r5 != 0) goto L_0x0afd
            if (r11 != 0) goto L_0x0afd
            if (r14 != 0) goto L_0x0afd
            if (r6 != 0) goto L_0x0afd
            if (r10 != 0) goto L_0x0afd
            if (r4 != 0) goto L_0x0bcd
        L_0x0afd:
            java.lang.String r2 = "Inconsistent stbl box for track "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r2)
            int r2 = r13.A00
            r3.append(r2)
            java.lang.String r2 = ": remainingSynchronizationSamples "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = ", remainingSamplesAtTimestampDelta "
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = ", remainingSamplesInChunk "
            r3.append(r2)
            r3.append(r14)
            java.lang.String r2 = ", remainingTimestampDeltaChanges "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = ", remainingSamplesAtTimestampOffset "
            r3.append(r2)
            r3.append(r10)
            if (r4 != 0) goto L_0x0b3f
            java.lang.String r2 = ", ctts invalid"
        L_0x0b34:
            java.lang.String r3 = X.AnonymousClass000.A0h(r2, r3)
            r2 = r16
            android.util.Log.w(r2, r3)
            goto L_0x0bcd
        L_0x0b3f:
            java.lang.String r2 = ""
            goto L_0x0b34
        L_0x0b42:
            r32.A07()
            int r23 = r23 + -1
            goto L_0x0ae8
        L_0x0b48:
            r4 = 1
            goto L_0x0af1
        L_0x0b4a:
            if (r34 == 0) goto L_0x0b6c
            long r19 = r39.A0J()
        L_0x0b50:
            if (r7 != r8) goto L_0x0b66
            int r31 = r38.A0E()
            r3 = 4
            r2 = r38
            r2.A0T(r3)
            int r30 = r30 - r18
            if (r30 <= 0) goto L_0x0b6a
            int r8 = r38.A0E()
            int r8 = r8 - r18
        L_0x0b66:
            r14 = r31
            goto L_0x0abd
        L_0x0b6a:
            r8 = -1
            goto L_0x0b66
        L_0x0b6c:
            long r19 = r39.A0I()
            goto L_0x0b50
        L_0x0b71:
            if (r32 == 0) goto L_0x0b84
        L_0x0b73:
            if (r10 != 0) goto L_0x0b82
            if (r23 <= 0) goto L_0x0b82
            int r10 = r32.A0E()
            int r22 = r32.A07()
            int r23 = r23 + -1
            goto L_0x0b73
        L_0x0b82:
            int r10 = r10 + -1
        L_0x0b84:
            r27[r4] = r19
            int r3 = r36.AbW()
            r29[r4] = r3
            r2 = r26
            if (r3 <= r2) goto L_0x0b92
            r26 = r29[r4]
        L_0x0b92:
            r2 = r22
            long r2 = (long) r2
            long r2 = r2 + r0
            r9[r4] = r2
            boolean r2 = X.AnonymousClass000.A1W(r33)
            r28[r4] = r2
            if (r4 != r15) goto L_0x0bac
            r28[r4] = r18
            int r5 = r5 + -1
            if (r5 <= 0) goto L_0x0bac
            int r15 = r33.A0E()
            int r15 = r15 - r18
        L_0x0bac:
            r2 = r25
            long r2 = (long) r2
            long r0 = r0 + r2
            int r11 = r11 + -1
            if (r11 != 0) goto L_0x0bc0
            if (r6 <= 0) goto L_0x0bc0
            int r11 = r37.A0E()
            int r25 = r37.A07()
            int r6 = r6 + -1
        L_0x0bc0:
            r2 = r29[r4]
            long r2 = (long) r2
            long r19 = r19 + r2
            int r14 = r14 + -1
            int r4 = r4 + 1
            goto L_0x0ab5
        L_0x0bcb:
            long r2 = (long) r6
            long r0 = r0 * r2
        L_0x0bcd:
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r13.A06
            r48 = r2
            r15 = r0
            r19 = r2
            long r11 = X.AnonymousClass3C1.A05(r15, r17, r19)
            long[] r10 = r13.A08
            if (r10 != 0) goto L_0x0bf3
            X.AnonymousClass3C1.A0D(r9, r2)
        L_0x0be2:
            X.4S8 r1 = new X.4S8
            r4 = r1
            r5 = r13
            r6 = r29
            r7 = r28
            r8 = r27
            r10 = r26
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x093d
        L_0x0bf3:
            int r14 = r10.length
            r3 = 1
            if (r14 != r3) goto L_0x0c7d
            int r2 = r13.A03
            if (r2 != r3) goto L_0x0c7f
            int r3 = r9.length
            r2 = 2
            if (r3 < r2) goto L_0x0c7f
            long[] r4 = r13.A09
            r2 = 0
            r42 = r4[r2]
            r36 = r10[r2]
            long r6 = r13.A05
            r38 = r48
            r40 = r6
            long r15 = X.AnonymousClass3C1.A05(r36, r38, r40)
            long r15 = r15 + r42
            r2 = 1
            int r5 = r3 - r2
            r4 = 4
            r2 = 0
            int r8 = X.AnonymousClass3K3.A0C(r4, r5, r2)
            int r3 = r3 - r4
            int r5 = X.AnonymousClass3K3.A0C(r3, r5, r2)
            r11 = r9[r2]
            int r2 = (r11 > r42 ? 1 : (r11 == r42 ? 0 : -1))
            if (r2 > 0) goto L_0x0c7f
            r3 = r9[r8]
            int r2 = (r42 > r3 ? 1 : (r42 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0c7f
            r3 = r9[r5]
            int r2 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x0c7f
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0c7f
            long r36 = r0 - r15
            long r42 = r42 - r11
            r2 = r44
            int r2 = r2.A0F
            long r4 = (long) r2
            r44 = r4
            r46 = r48
            long r2 = X.AnonymousClass3C1.A05(r42, r44, r46)
            r38 = r4
            r40 = r48
            long r4 = X.AnonymousClass3C1.A05(r36, r38, r40)
            r11 = 0
            int r8 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0c59
            int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0c7f
        L_0x0c59:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r8 > 0) goto L_0x0c7f
            int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r8 > 0) goto L_0x0c7f
            int r0 = (int) r2
            r1 = r51
            r1.A00 = r0
            int r0 = (int) r4
            r1.A01 = r0
            r0 = r48
            X.AnonymousClass3C1.A0D(r9, r0)
            r0 = 0
            r0 = r10[r0]
        L_0x0c74:
            r15 = r0
            r19 = r6
            long r11 = X.AnonymousClass3C1.A05(r15, r17, r19)
            goto L_0x0be2
        L_0x0c7d:
            if (r14 != r3) goto L_0x0ca0
        L_0x0c7f:
            r7 = 0
            r5 = r10[r7]
            r3 = 0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0ca0
            long[] r2 = r13.A09
            r5 = r2[r7]
            r4 = 0
        L_0x0c8d:
            int r2 = r9.length
            if (r4 >= r2) goto L_0x0c9c
            r15 = r9[r4]
            long r15 = r15 - r5
            long r2 = X.AnonymousClass3C1.A05(r15, r17, r19)
            r9[r4] = r2
            int r4 = r4 + 1
            goto L_0x0c8d
        L_0x0c9c:
            long r0 = r0 - r5
            r6 = r48
            goto L_0x0c74
        L_0x0ca0:
            int r1 = r13.A03
            r0 = 1
            boolean r15 = X.AnonymousClass000.A1R(r1, r0)
            int[] r4 = new int[r14]
            int[] r8 = new int[r14]
            long[] r0 = r13.A09
            r25 = r0
            r5 = 0
            r23 = 0
            r3 = 0
            r2 = 0
        L_0x0cb4:
            if (r5 >= r14) goto L_0x0d12
            r0 = r25[r5]
            r11 = -1
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0d0f
            r36 = r10[r5]
            long r6 = r13.A05
            r38 = r48
            r40 = r6
            long r11 = X.AnonymousClass3C1.A05(r36, r38, r40)
            r6 = 1
            int r6 = X.AnonymousClass3C1.A04(r9, r0, r6)
            r4[r5] = r6
            long r0 = r0 + r11
            int r7 = java.util.Arrays.binarySearch(r9, r0)
            if (r7 >= 0) goto L_0x0cee
            r7 = r7 ^ -1
        L_0x0cda:
            r8[r5] = r7
        L_0x0cdc:
            r1 = r4[r5]
            r0 = r8[r5]
            if (r1 >= r0) goto L_0x0cff
            r0 = r4[r5]
            r0 = r28[r0]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0cff
            X.AnonymousClass3K4.A17(r4, r5)
            goto L_0x0cdc
        L_0x0cee:
            int r7 = r7 + 1
            int r6 = r9.length
            if (r7 >= r6) goto L_0x0cfa
            r11 = r9[r7]
            int r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0cfa
            goto L_0x0cee
        L_0x0cfa:
            if (r15 == 0) goto L_0x0cda
            int r7 = r7 + -1
            goto L_0x0cda
        L_0x0cff:
            r1 = r8[r5]
            r0 = r4[r5]
            int r1 = r1 - r0
            int r3 = r3 + r1
            boolean r0 = X.AnonymousClass3K2.A1X(r2, r0)
            r0 = r0 | r23
            r2 = r8[r5]
            r23 = r0
        L_0x0d0f:
            int r5 = r5 + 1
            goto L_0x0cb4
        L_0x0d12:
            r7 = 0
            r1 = 1
            r0 = r35
            if (r3 != r0) goto L_0x0d19
            r1 = 0
        L_0x0d19:
            r23 = r23 | r1
            if (r23 == 0) goto L_0x0d8b
            long[] r0 = new long[r3]
            r37 = r0
            int[] r0 = new int[r3]
            r22 = r0
            r26 = 0
            int[] r0 = new int[r3]
            r36 = r0
        L_0x0d2b:
            long[] r0 = new long[r3]
            r20 = r0
            r6 = 0
            r0 = 0
        L_0x0d32:
            if (r7 >= r14) goto L_0x0d92
            r18 = r25[r7]
            r5 = r4[r7]
            r15 = r8[r7]
            if (r23 == 0) goto L_0x0d53
            int r11 = r15 - r5
            r3 = r27
            r2 = r37
            java.lang.System.arraycopy(r3, r5, r2, r6, r11)
            r3 = r29
            r2 = r22
            java.lang.System.arraycopy(r3, r5, r2, r6, r11)
            r3 = r28
            r2 = r36
            java.lang.System.arraycopy(r3, r5, r2, r6, r11)
        L_0x0d53:
            if (r5 >= r15) goto L_0x0d85
            r32 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r13.A05
            r30 = r0
            r34 = r2
            long r16 = X.AnonymousClass3C1.A05(r30, r32, r34)
            r2 = r9[r5]
            long r2 = r2 - r18
            r11 = 0
            long r11 = java.lang.Math.max(r11, r2)
            r2 = r48
            long r2 = X.AnonymousClass3K4.A0G(r11, r2)
            long r16 = r16 + r2
            r20[r6] = r16
            if (r23 == 0) goto L_0x0d80
            r3 = r22[r6]
            r2 = r26
            if (r3 <= r2) goto L_0x0d80
            r26 = r29[r5]
        L_0x0d80:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L_0x0d53
        L_0x0d85:
            r2 = r10[r7]
            long r0 = r0 + r2
            int r7 = r7 + 1
            goto L_0x0d32
        L_0x0d8b:
            r37 = r27
            r22 = r29
            r36 = r28
            goto L_0x0d2b
        L_0x0d92:
            long r2 = r13.A05
            long r8 = X.AnonymousClass3K4.A0G(r0, r2)
            X.4S8 r1 = new X.4S8
            r2 = r13
            r3 = r22
            r4 = r36
            r5 = r37
            r6 = r20
            r7 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x093d
        L_0x0daa:
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            X.3Ur r1 = r2.A01(r0)
            if (r1 == 0) goto L_0x0dcd
            X.4oy r36 = new X.4oy
            r0 = r36
            r0.<init>(r1)
            goto L_0x0920
        L_0x0dbc:
            r1 = r22
            r0 = r1
            goto L_0x08cc
        L_0x0dc1:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        L_0x0dc6:
            java.lang.String r0 = "Unsupported media rate."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0dcd:
            java.lang.String r0 = "Track has no sample table size information"
            X.40M r0 = X.AnonymousClass40M.A00(r0)
            throw r0
        L_0x0dd4:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90564eN.A03(X.57J, X.4ar, X.3Us, X.2Vq, long, boolean):java.util.List");
    }
}
