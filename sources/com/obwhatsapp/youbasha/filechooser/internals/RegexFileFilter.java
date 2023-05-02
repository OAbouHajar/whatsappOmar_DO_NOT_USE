package com.obwhatsapp.youbasha.filechooser.internals;

import java.io.FileFilter;
import java.util.regex.Pattern;

public class RegexFileFilter implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1050a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1051b;

    /* renamed from: c  reason: collision with root package name */
    public final Pattern f1052c;

    public RegexFileFilter() {
        this((Pattern) null);
    }

    public RegexFileFilter(Pattern pattern) {
        this(false, false, pattern);
    }

    public RegexFileFilter(boolean z2, boolean z3, String str) {
        this.f1050a = z3;
        this.f1051b = z2;
        this.f1052c = Pattern.compile(str, 2);
    }

    public RegexFileFilter(boolean z2, boolean z3, String str, int i2) {
        this.f1050a = z3;
        this.f1051b = z2;
        this.f1052c = Pattern.compile(str, i2);
    }

    public RegexFileFilter(boolean z2, boolean z3, Pattern pattern) {
        this.f1050a = z3;
        this.f1051b = z2;
        this.f1052c = pattern;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r0 = "ۨ۟۬۠ۘۚۖ۬ۘۚ۟ۢۖۢۡۘۥۜۨۘۦۘۛ۠ۤۧۖۖۥ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f9, code lost:
        r0 = "ۦۧۖۘۤ۬ۦ۠ۤۨۘۘۘۤۙۥۚۧۡۘۨۦۘ۠ۖ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean accept(java.io.File r8) {
        /*
            r7 = this;
            r3 = 1
            r2 = 0
            r1 = 0
            java.lang.String r0 = "ۘ۬۫ۘۦۧۘۡۦۡۘۖ۟ۛ۟ۢۚۢۖۧۘ"
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 212(0xd4, float:2.97E-43)
            r6 = -1053513831(0xffffffffc134a799, float:-11.290917)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1654469143: goto L_0x00eb;
                case -1553093884: goto L_0x00c7;
                case -1455263663: goto L_0x0014;
                case -533828748: goto L_0x005d;
                case -84542727: goto L_0x0017;
                case 84289641: goto L_0x001a;
                case 409605510: goto L_0x009e;
                case 649008283: goto L_0x007b;
                case 750286842: goto L_0x0038;
                case 1429846727: goto L_0x005b;
                case 1476229178: goto L_0x00e8;
                case 1619715356: goto L_0x00c5;
                case 1761441639: goto L_0x00a4;
                case 1836800680: goto L_0x009c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۛ۟ۨۘۘۢۥۘۢۨۚ۫۠ۜ۟ۘۡۘ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "ۙۜۡۘ۠ۚۖۥ۬ۜ۠ۘۘۜ۬۠ۗۚۖۘ۬ۚۚ"
            goto L_0x0005
        L_0x001a:
            r4 = 1437176013(0x55a990cd, float:2.33049225E13)
            java.lang.String r0 = "ۨۧۜۧۜۖۘ۫ۤۖۘۢۚۨۧۚ"
        L_0x001f:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1334579187: goto L_0x0046;
                case 477170361: goto L_0x0028;
                case 1044504848: goto L_0x0035;
                case 1451234708: goto L_0x0032;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x001f
        L_0x0028:
            boolean r0 = r7.f1050a
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "ۡۛۜۚۧۖۜ۠ۙ۫ۖۗۗۘ۫۟۟ۜۢۥۡۚۤۜۤۦ۟"
            goto L_0x001f
        L_0x002f:
            java.lang.String r0 = "ۗ۟ۦۘۨۡۘۘۧۚ۫ۨۜ۬ۘ۫۫ۨۙۜۖۖۦ"
            goto L_0x001f
        L_0x0032:
            java.lang.String r0 = "ۧۢۗۧ۬ۜۘۨۚۨ۫ۦۖۢۖۦ۟ۜۨۘ"
            goto L_0x001f
        L_0x0035:
            java.lang.String r0 = "ۢۙ۟ۜۡۘۙۡۗۘۡ۫۟۟ۘۨۨۘۚۛۜۜۤۜ"
            goto L_0x0005
        L_0x0038:
            r4 = -288898411(0xffffffffeec7c295, float:-3.0911376E28)
            java.lang.String r0 = "ۗ۠ۡۢۜۥۜۤۘۘۤ۫ۖۘۙۙۤۖ۫ۢ"
        L_0x003d:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -651698501: goto L_0x0046;
                case -580890846: goto L_0x0055;
                case -213188132: goto L_0x0058;
                case -198490920: goto L_0x004c;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x003d
        L_0x0046:
            java.lang.String r0 = "ۨ۟۬۠ۘۚۖ۬ۘۚ۟ۢۖۢۡۘۥۜۨۘۦۘۛ۠ۤۧۖۖۥ"
            goto L_0x0005
        L_0x0049:
            java.lang.String r0 = "ۜ۟۫ۛۘۧۚ۬ۙ۟ۖ۟۟ۢۦ۬ۧۥۘ"
            goto L_0x003d
        L_0x004c:
            boolean r0 = r8.isHidden()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "۫۫ۦۧۦۢ۫ۦ۠ۥ۠ۛۘۘۚۙ"
            goto L_0x003d
        L_0x0055:
            java.lang.String r0 = "۬۠ۖۘۜ۫ۦۤ۠ۨۚۗۙ۠ۜۜۘ"
            goto L_0x003d
        L_0x0058:
            java.lang.String r0 = "۟ۤۘۖۗۧۧۖۡۘۧۢ۫ۥۤۗۖۚۛ۬ۗ۫"
            goto L_0x0005
        L_0x005b:
            r0 = r2
        L_0x005c:
            return r0
        L_0x005d:
            r4 = -787790926(0xffffffffd10b43b2, float:-3.7383512E10)
            java.lang.String r0 = "ۗۡۥۘۧۧۦۘۚۗۨۧۧۙۨۢۙۙۙۡۘۦۨ۫"
        L_0x0062:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2145970369: goto L_0x0078;
                case -1219010942: goto L_0x006b;
                case 1000986928: goto L_0x00f9;
                case 2143517389: goto L_0x0075;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x0062
        L_0x006b:
            boolean r0 = r7.f1051b
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "ۢۥ۬ۛۥۨۘۗۛۥۘۙۖ۠ۚۛۡۘۢۚۜ۟۟ۜۘ"
            goto L_0x0062
        L_0x0072:
            java.lang.String r0 = "ۡ۫ۡۦۦ۟ۨۥۙۢۚۘ۬ۨۡۘ۠ۧۖۢ۬ۜ"
            goto L_0x0062
        L_0x0075:
            java.lang.String r0 = "۟ۢۢۦۢۜۘۨ۟ۤۜ۠ۖۘۘۗۦۘ"
            goto L_0x0062
        L_0x0078:
            java.lang.String r0 = "ۤ۠۠ۖۨۛۧۥ۟ۛۛۡۗۤۛ۟ۧۡۘۙۢۡۢۤۥۢ۠ۧ"
            goto L_0x0005
        L_0x007b:
            r4 = 834232677(0x31b96165, float:5.395281E-9)
            java.lang.String r0 = "ۥۙ۬ۤۗۤۚۧۤۡۧۙۘۢۚۡۨۚۧۙۜۘ"
        L_0x0080:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1994010464: goto L_0x00f9;
                case -1610804808: goto L_0x0098;
                case 71203715: goto L_0x0095;
                case 422489283: goto L_0x0089;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x0080
        L_0x0089:
            boolean r0 = r8.isDirectory()
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "ۛۗ۠۠ۥۡ۬ۜۦۘۗ۫۬۫ۡۡۘ۠ۨۙ"
            goto L_0x0080
        L_0x0092:
            java.lang.String r0 = "ۜۗۥ۟ۘ۟ۦۗۥۘۘۢ۬ۦۖۨۘۖۛۨۘ۠ۛۗ"
            goto L_0x0080
        L_0x0095:
            java.lang.String r0 = "ۢۧۖۘۤۘۨۥۖۜۘۙۗۛۜ۠ۦۘۜ۠ۘۘ"
            goto L_0x0080
        L_0x0098:
            java.lang.String r0 = "ۚۖ۠ۨۖۘ۫ۚۜۘۤۜ۬ۚ۟۠۟ۥۚۨۙ۟ۨۙۖۘ"
            goto L_0x0005
        L_0x009c:
            r0 = r2
            goto L_0x005c
        L_0x009e:
            java.util.regex.Pattern r1 = r7.f1052c
            java.lang.String r0 = "ۚۙ۟ۡۙۜۨ۠ۜۘ۠۫ۡۚۥۘۘۨۗۢ"
            goto L_0x0005
        L_0x00a4:
            r4 = 1460074725(0x5706f8e5, float:1.48403552E14)
            java.lang.String r0 = "۬ۜۗۡ۬ۦ۬۠ۙۥۥ۬ۙۧۘ۟ۡۨۘ۬ۜۥۘۦۧۘۢۢۨ"
        L_0x00a9:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -332191019: goto L_0x00c1;
                case -259235920: goto L_0x00b9;
                case 1507129761: goto L_0x00b2;
                case 2089357083: goto L_0x00be;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            goto L_0x00a9
        L_0x00b2:
            java.lang.String r0 = "۠ۧۙۛۚ۬ۜۥ۟ۦۧۢۥۨۦۦۧۦۘۛۡۖ۫ۙۧ۠ۤۦ"
            goto L_0x0005
        L_0x00b6:
            java.lang.String r0 = "۫ۙ۫ۚۦۜۘۗۛۗۨ۬ۖۘۖۦۘۘ"
            goto L_0x00a9
        L_0x00b9:
            if (r1 != 0) goto L_0x00b6
            java.lang.String r0 = "ۡۧ۫ۖۥ۟ۧۚۨۙ۬ۦۘۚ۬ۨۘۛۛۖۖ۟۬"
            goto L_0x00a9
        L_0x00be:
            java.lang.String r0 = "۟ۜۜۘۖۘۦۘۗۜۘ۬ۘۧۘ۟ۗۤۥۥۘۚ۠ۛۧۙۨ"
            goto L_0x00a9
        L_0x00c1:
            java.lang.String r0 = "ۜ۬ۡۘۗۧ۟۠ۤ۠۫ۨۦۜۜۡۘۤۢۛ"
            goto L_0x0005
        L_0x00c5:
            r0 = r3
            goto L_0x005c
        L_0x00c7:
            r4 = 534869215(0x1fe174df, float:9.5484554E-20)
            java.lang.String r0 = "ۥ۠ۚۚ۠ۚۘۢۢۚۡۖ۠۬ۥۘ۟۫ۧ"
        L_0x00cc:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2074510641: goto L_0x00dc;
                case -1415461111: goto L_0x00fd;
                case 1699850735: goto L_0x00d5;
                case 1844169418: goto L_0x00e5;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            goto L_0x00cc
        L_0x00d5:
            java.lang.String r0 = "ۜ۫۬ۛۧۥۘۖ۬ۘۘۤۢۡۚ۫۫۠۠ۛۘۡۨۨۨۖۘۤ۠ۢ"
            goto L_0x0005
        L_0x00d9:
            java.lang.String r0 = "ۛۨۘۗۦۘ۫ۦۤۡۘۘۘۚۡۨۘۘۗۦۘۛ۟ۡ۬ۤۡ"
            goto L_0x00cc
        L_0x00dc:
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = "ۡۗۥ۫ۖۚۡۤۨۛ۟ۗۗۘ۫۫۟ۜۡۨۘۤۥۨۘۘ۠ۡۘ"
            goto L_0x00cc
        L_0x00e5:
            java.lang.String r0 = "ۜۢ۬ۤۜۦۘۘۛۡۘۧۡۖۙۤ۬۬۠ۘۘۧ۬ۜ۬ۗۨۧۧۙ"
            goto L_0x00cc
        L_0x00e8:
            r0 = r3
            goto L_0x005c
        L_0x00eb:
            java.lang.String r0 = r8.getName()
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            goto L_0x005c
        L_0x00f9:
            java.lang.String r0 = "ۦۧۖۘۤ۬ۦ۠ۤۨۘۘۘۤۙۥۚۧۡۘۨۦۘ۠ۖ"
            goto L_0x0005
        L_0x00fd:
            java.lang.String r0 = "۬ۚۜۘۘۙۤۜۧ۬ۧ۟ۘ۬ۤ۬ۘۤ۬"
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.filechooser.internals.RegexFileFilter.accept(java.io.File):boolean");
    }
}
