package com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils;

import java.util.ArrayList;
import java.util.Random;

public abstract class RandomUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final Random f1333a = new Random();

    static {
        String str = "ۡۛۨ۠۠۬ۙ۫ۡ۠ۧۜۘۨۘۚۧ۟۟۫ۚۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 979) ^ -871164697) {
                case -1948721784:
                    str = "ۙۗۦۘ۫ۤۚۘۙ۫ۧۤۨۧ۬۫ۧۚ۬ۙۡ۟۟ۜۛ۬۠ۙ";
                    break;
                case 1634535213:
                    return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int randInt() {
        /*
            java.lang.String r0 = "۠ۗۖۖۙ۠ۜۗۨۜۢۡۛۙۘۘۢۖۨۗۘۨ۬ۢۘۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 958(0x3be, float:1.342E-42)
            r3 = 1515258487(0x5a510277, float:1.47077451E16)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1906979738: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.util.Random r0 = f1333a
            long r2 = java.lang.System.nanoTime()
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = r2 % r4
            int r1 = (int) r2
            int r0 = r0.nextInt(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.RandomUtils.randInt():int");
    }

    public static int randInt(int i2) {
        String str = "ۜۤۘۘۦۦۙۗۙۛ۫ۦۘۤۨ۠ۤۢۜۘۧۘۥۘ";
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 797) ^ 198676799) {
                case -1514321022:
                    return i3;
                case -1294422873:
                    str = "ۛۗۖۘ۫۫ۡۘۘۤۢۚۦۖۘۚۘۜۘۚۧۢۡۘ";
                    break;
                case -1203067689:
                    str = "ۤۘۜ۠ۧ۬۬ۖۦۙۛۡۘ۟۬۟ۤۖۘۘۥ۬ۙۘۧۥۘۥ۫ۧ";
                    break;
                case -658023554:
                    i4 = randInt() % i2;
                    str = "ۛۨۜۦۡۙۙ۬ۦۘۦۛ۬ۛۧۚۤۗ۬ۦۘۡۘ";
                    break;
                case 346850673:
                    str = "ۛۧ۟۟ۢ۬۬ۚۜۦ۟ۢۡۨۧۘۦۖۜۘۦۛۤۗۥۨ";
                    break;
                case 1120696565:
                    str = "ۛ۫ۡۘ۠ۨۡۧۦۘۘۙۘ۬۬ۡۙۖۡ";
                    i3 = i4;
                    break;
                case 1350995003:
                    str = "ۛۧ۟۟ۢ۬۬ۚۜۦ۟ۢۡۨۧۘۦۖۜۘۦۛۤۗۥۨ";
                    i3 = 0;
                    break;
                case 1914138081:
                    String str2 = "۬ۥۧۘۖۤۚ۬ۙۜۘ۟ۜ۫ۤۧۖۗۛۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -300529064) {
                            case -1679642311:
                                str = "ۤۜۨۙۘۥ۫ۜۡۘ۬ۨۡۗۛۧ";
                                continue;
                            case -1241211473:
                                str = "ۤۖۦۚۙ۟ۦۤۡۦۢۥۘۡۧۛۙ۠ۜۜۢۡ";
                                continue;
                            case 1490412403:
                                if (i2 <= 0) {
                                    str2 = "ۧ۬ۦ۬۠ۨۙۛۤ۠ۗۛ۬ۙۗۢۤ";
                                    break;
                                } else {
                                    str2 = "۟ۙۜۘۦۗ۫۫ۙۡۤۦۛ۟ۛۨۘ";
                                    break;
                                }
                            case 1717567918:
                                str2 = "ۜۖۨ۟ۥ۫ۥۗ۫۟ۛ۬ۥۥۖۘ۬۟ۖۘۧ۫ۛۢۡۘۖۥۗ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static int[] randIntArray(int i2) {
        String str = "ۨۥۜۘۘۤۛۖۖۘ۠ۛۨۘۧۢۜۘۥۘۢۡۧۘ";
        while (true) {
            switch ((str.hashCode() ^ 671) ^ -1853945231) {
                case 1011298409:
                    str = "ۘۚۜ۠ۜۚۙۤۦۘۥۗۙۤۖۦ۟ۛۜۘ";
                    break;
                case 1048020584:
                    return randIntArray(0, i2);
            }
        }
    }

    public static int[] randIntArray(int i2, int i3) {
        String str = "ۘۙۢۖ۫۫ۘۥۤۛۙۥۦۨۙ";
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        ArrayList arrayList = null;
        while (true) {
            switch ((str.hashCode() ^ 555) ^ -1195842576) {
                case -1930530197:
                    iArr[i6] = ((Integer) arrayList.get(i5)).intValue();
                    str = "ۧۡۜۘۢۖۦ۠۫ۘۜۖۘۘۤۧۖۘۘۖۢۜۦۘۚۜۘ";
                    break;
                case -1853610886:
                    str = "ۧۢۚۜۢۖۘۘۢ۟ۤۤۨۥۜ";
                    i6 = i4;
                    break;
                case -1540702862:
                    String str2 = "ۧۗۖۘۜۛ۫ۡۧ۠۬ۡۘ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 321486427) {
                            case -712509826:
                                str = "۟ۥ۠ۗ۠ۦۘۜۘۘۚۛۜ۟ۦۨۘۦۨۧۧۡۡ";
                                continue;
                            case -683040685:
                                if (i6 >= i7) {
                                    str2 = "ۚۜۢ۠ۗۨۡۜۜۤ۟ۡۙ۬ۜۘ";
                                    break;
                                } else {
                                    str2 = "۟ۛۢۛۦ۫ۧۨۙۢۜ۬ۧۨۘۤۛۜۘۚۧۦۘ";
                                    break;
                                }
                            case 952883278:
                                str2 = "ۥ۠ۦۘۛ۬ۛۧۢۨۛۥۘۘ۬ۘ";
                                break;
                            case 1438391581:
                                str = "ۙۦۢ۠ۛۦۘۤ۠ۢۗ۬ۨۙۢۨۜۦۛۘۙۧۤ۟ۜۛۦۘ";
                                continue;
                        }
                    }
                    break;
                case -1219636975:
                    str = "ۧۨۙۤ۟۠ۨ۠ۙۖ۠ۡۘۦۗۖ";
                    break;
                case -1100966527:
                    return new int[0];
                case -742627580:
                    str = "۠ۘۥۘ۫۠ۖۛۧۥ۫۬ۜۘ۟ۧۡۘ";
                    i7 = arrayList.size();
                    break;
                case -646273980:
                    str = "ۧۨۙۤ۟۠ۨ۠ۙۖ۠ۡۘۦۗۖ";
                    i9 = i2;
                    break;
                case -584016746:
                    return iArr;
                case -499301463:
                    str = "ۜ۫ۨۘۥۧۡۘ۬ۥۜۙۧۜۙۙۡۘۚۤ۠";
                    break;
                case -489117334:
                    str = "ۜۡۘ۬ۢۤۥ۠ۛۡ۫ۙ۫ۜۖۘ۠ۘۜۘۙۦۗۘۗۡ";
                    break;
                case -362390:
                    arrayList.add(Integer.valueOf(i9));
                    str = "ۛۗۨ۠ۜۥ۫ۜۛۧۖۛۜۥۨۖۜ۫ۢۨۥۘۤۧۧۥۖۘ";
                    break;
                case 37414775:
                    str = "ۜ۠ۥۘۘۜۗۖۨۦۚۛۗۚۧۘۘۤۢۘۘۧۤۢۜۗۡۤۙ۠";
                    break;
                case 221011307:
                    String str3 = "ۥۡۨۜ۟ۤۙۨۧۙۗۡۘۚ۬ۧۗۢۜۘۙۨۡ";
                    while (true) {
                        switch (str3.hashCode() ^ 1701611168) {
                            case -1584848146:
                                if (i9 >= i3) {
                                    str3 = "ۦۤۙۜۡۥۥۚۡۖۡۛۙۢۗۥۘۛۗۙۖۘ";
                                    break;
                                } else {
                                    str3 = "ۚۛۥۛۥۙ۫ۡۨۘۚۥۨۘۦ۟ۚ۬ۙۧۜۛۗۧۙ۬ۘۡۨ";
                                    break;
                                }
                            case 593458471:
                                str = "ۢۙۨۦۨۜۘۚۦۥۘۤۨۤ۟ۨۜۚۖۖۘۥۡۦۘ۬ۨۖ۫۫۬";
                                continue;
                            case 927559285:
                                str = "۬ۜۢۤۖۘۢۥ۠ۡ۫ۦۘۖۗۗ";
                                continue;
                            case 1783112696:
                                str3 = "ۧۡۜۘ۫ۛۛ۫ۙۖۘۢۨۘۨۘۘۘۦۗۜۧۦۨۘ۟۠ۡۘ";
                                break;
                        }
                    }
                    break;
                case 241084999:
                    arrayList.remove(i5);
                    str = "ۨۜ۬ۡ۫ۡۘۡ۠ۥۘۢ۠ۢ۫ۛ۠۠ۜ";
                    break;
                case 256640648:
                    i4 = i6 + 1;
                    str = "ۥ۫۬ۢ۬ۦۘۛۤۨۘۜۦۨۧۗۚۖۜۡۙۛ۠ۘۢۦۗۥۡ";
                    break;
                case 558337034:
                    i5 = randInt(arrayList.size());
                    str = "ۜۦۦۘۘۛ۠ۦۥۛۜۨۥۗۨ۟";
                    break;
                case 592277946:
                    str = "ۨۗۧۜۛۢۧۜۘۤۜۧ۫ۧ۬";
                    i8 = i9 + 1;
                    break;
                case 635746500:
                    str = "ۜۡۘ۬ۢۤۥ۠ۛۡ۫ۙ۫ۜۖۘ۠ۘۜۘۙۦۗۘۗۡ";
                    i6 = 0;
                    break;
                case 1071572292:
                    iArr = new int[i7];
                    str = "ۢۘۨ۫ۛۡۘۖۡۥۘۜۡۤۨ۬ۛ۠ۙۙۢ۫ۙ";
                    break;
                case 1429101978:
                    String str4 = "۫ۤۥۘۜ۟ۨۗۗۘۘۤ۬ۡ۫ۗۖ";
                    while (true) {
                        switch (str4.hashCode() ^ -2019067607) {
                            case -1495419988:
                                str4 = "ۘ۠ۜۘۚۧۙۙۙۚۙ۫ۦۘۛۛۘۘۘۤۖۘۜ۫ۜۘ";
                                break;
                            case 472614499:
                                str = "ۤ۬ۛۦۥۧۧۖۘۗۦۦۘۥ۠۠ۖۧۘ";
                                continue;
                            case 1348834886:
                                str = "ۥ۠ۚۢ۬ۚۘۗۖۘۥ۟ۛۖۧۧۥۢ۬ۥۖۘ۟ۛۘۧۦۖ";
                                continue;
                            case 1913898339:
                                if (i3 > i2) {
                                    str4 = "ۘۜ۠۫۬ۦ۫ۧۨۘۗۖۨۘۡۚۧ";
                                    break;
                                } else {
                                    str4 = "۠ۥۡۧ۟ۘۘۖۛۨۘۖۧۘۘۤۖ۫۟ۧۡۤۧۢ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1843199623:
                    str = "ۤۗۙۥۘۨۘۦۙۨۘ۠ۘۚۦۤ۠";
                    break;
                case 2033814444:
                    str = "ۖۧۜۘۘۢO۠ۛۜۘ۟۬ۘۘۡۚ۟ۦۤۖۦۛۜۘۧۢۙ";
                    arrayList = new ArrayList();
                    break;
                case 2090168898:
                    str = "ۡۡۧۙۨۙۥۛۛۛ۠ۘۘ۠ۡۗۨۙۡۘ۟ۧۤۖۢۛ";
                    i9 = i8;
                    break;
            }
        }
    }
}
