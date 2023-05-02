package com.obwhatsapp.yo;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class CustomTypefaceSpan extends TypefaceSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f540a;

    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        this.f540a = typeface;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00da, code lost:
        r0 = "ۡۡ۫ۦ۟ۜۘۦ۬ۥۧۜۛۤۤۨۘۧۥۥۡۦۘ۠۫ۛۦۧۦۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.graphics.Paint r9, android.graphics.Typeface r10) {
        /*
            r2 = 0
            r5 = 0
            java.lang.String r0 = "۠ۘ۫۠ۚۤ۟ۛ۬ۤۗۖۘۧۚ۠"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 354(0x162, float:4.96E-43)
            r8 = -564745733(0xffffffffde56a9fb, float:-3.86704259E18)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -2108386639: goto L_0x0046;
                case -1851403450: goto L_0x0016;
                case -1378319010: goto L_0x0051;
                case -1242753243: goto L_0x00de;
                case -999836996: goto L_0x0078;
                case -923805811: goto L_0x003f;
                case -725570870: goto L_0x0023;
                case -425052821: goto L_0x0042;
                case -347172444: goto L_0x00be;
                case -287771243: goto L_0x006d;
                case -122479613: goto L_0x001c;
                case 678068949: goto L_0x0019;
                case 701519595: goto L_0x004d;
                case 1125783803: goto L_0x0097;
                case 1258363081: goto L_0x009f;
                case 1553118529: goto L_0x00d2;
                case 2107756057: goto L_0x00c7;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۛۥ۟ۜ۫ۡۘۤۤۜۘۥۢۨ۫ۡۦۘۥۛۖ۟ۦۗ"
            goto L_0x0007
        L_0x0019:
            java.lang.String r0 = "ۤۤۖۘۢۡۘۘۚۨۤۦۖۖۘۦۗۖۘ"
            goto L_0x0007
        L_0x001c:
            android.graphics.Typeface r5 = r9.getTypeface()
            java.lang.String r0 = "۠ۥۧۢۙۙۡۙۦۘ۠ۛۨۘۥۜ۟"
            goto L_0x0007
        L_0x0023:
            r6 = 565846474(0x21ba21ca, float:1.2612794E-18)
            java.lang.String r0 = "۫۠ۜۘۢۜۘۚ۠ۘ۠ۤۦۡۗ۠"
        L_0x0028:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -509121522: goto L_0x0031;
                case 189893223: goto L_0x0037;
                case 1010676671: goto L_0x003c;
                case 1516239335: goto L_0x00ce;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r0 = "ۙۜۤ۟ۘ۫ۛۦۘۙ۫ۜۡۗۘ"
            goto L_0x0007
        L_0x0034:
            java.lang.String r0 = "۫۟ۘ۟ۦۥۦۖۡۤۖۥۘۜۜۧۘۘۙ۠ۚ۫ۡۘۧۖۖۥۢۗ"
            goto L_0x0028
        L_0x0037:
            if (r5 != 0) goto L_0x0034
            java.lang.String r0 = "ۛۤۡۘۘۡۚ۬۟ۙۨ۬ۧۨۨۘۥ۬ۜۘۘۘۦۢۖۢ"
            goto L_0x0028
        L_0x003c:
            java.lang.String r0 = "۠ۚ۬ۜۤۙۥ۟۟ۜۜۘۘۙۡۘۚۨۧ۟۫ۘۛۧۜ۫۠ۜۘ"
            goto L_0x0028
        L_0x003f:
            java.lang.String r0 = "ۡۧۛۘۚ۠ۥ۠ۥۘۤۢ۫ۤۚۖۡۥ۠"
            goto L_0x0007
        L_0x0042:
            java.lang.String r0 = "۫ۤۦۘ۬ۖۧۛۘۘۙۖۡۡ۫ۡۘۢ۠ۡۘۘ۟"
            r4 = r2
            goto L_0x0007
        L_0x0046:
            int r3 = r5.getStyle()
            java.lang.String r0 = "ۙۗۧۥۛ۫ۖۖۖۘۤۥۜ۫ۜ۬۟ۛۜ"
            goto L_0x0007
        L_0x004d:
            java.lang.String r0 = "ۘ۬ۢۢۚۗۙۧۚۨۤۗۧۤۤۤۜۦۘۨۜ۬"
            r4 = r3
            goto L_0x0007
        L_0x0051:
            r6 = 1391449403(0x52efd53b, float:5.15037299E11)
            java.lang.String r0 = "ۢۦۙۘ۟ۦۘۗۦۥۥۡۡۘۙۢۦۘ۬ۗۚۜۘۡۘ"
        L_0x0056:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -810155529: goto L_0x0065;
                case -808693494: goto L_0x00da;
                case 508863434: goto L_0x006a;
                case 1633226639: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0056
        L_0x005f:
            java.lang.String r0 = "ۘۦۧۘۡ۠ۜۘ۫ۨۜۘۚۖۦۘ۠ۤۖ"
            goto L_0x0056
        L_0x0062:
            java.lang.String r0 = "ۨ۫۟ۧۨۜ۟۫ۦۘۙۜۜۦۚۘۤۢۡۘۙۢۧۗۦۡ"
            goto L_0x0056
        L_0x0065:
            if (r10 == 0) goto L_0x0062
            java.lang.String r0 = "۠ۢ۬ۧۥۢۛۥۜۥۢۢۥ۫ۥۘ۬ۚۥۘۡۨۢ"
            goto L_0x0056
        L_0x006a:
            java.lang.String r0 = "۠ۤۖۡۘۛۧۖۢۚۛۛۧۚ"
            goto L_0x0007
        L_0x006d:
            int r0 = r10.getStyle()
            r0 = r0 ^ -1
            r1 = r4 & r0
            java.lang.String r0 = "ۙۚۤۦۗۥۗۚۧ۬ۦۚ۬۠۟ۨ۟۬ۜۜۜ"
            goto L_0x0007
        L_0x0078:
            r6 = 86113821(0x521fe1d, float:7.616857E-36)
            java.lang.String r0 = "۟ۧۨۘۨۚۡۘۙۦۥۤۥۡۘ۬ۖ۫ۨۚۡۘۧ۫ۥۙۡۥۗۤۘ"
        L_0x007d:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -2074732573: goto L_0x0094;
                case -1248758905: goto L_0x00d6;
                case 1280155204: goto L_0x0086;
                case 1692998921: goto L_0x008d;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x007d
        L_0x0086:
            java.lang.String r0 = "ۗۢۨۘۘۖۖۗۚ۫ۦۖۛۜۙۥۗۗۡۛۤۤ"
            goto L_0x0007
        L_0x008a:
            java.lang.String r0 = "ۗۤۦۘۢۢۗۗۨۘۡۘۘ۬۫ۛۚۛۥ"
            goto L_0x007d
        L_0x008d:
            r0 = r1 & 1
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "ۧۤۙ۠ۖۗ۟ۡۤۢۢ۬ۙۜۨۡۘۘۙۘۘ۫ۛۘۘ"
            goto L_0x007d
        L_0x0094:
            java.lang.String r0 = "ۦ۫ۨۘۨۢۜۛۚۜۘۢۤۥۘ۟ۙۡۗۥۧۘ۬۠ۖ"
            goto L_0x007d
        L_0x0097:
            r0 = 1
            r9.setFakeBoldText(r0)
            java.lang.String r0 = "ۥۡۘ۟ۚۢۦۚۥۘۢۚ۟ۧ۟ۖۘۛۡۜۙۘۧۘ۬ۛۗۥۚۖ"
            goto L_0x0007
        L_0x009f:
            r6 = 1197361381(0x475e48e5, float:56904.895)
            java.lang.String r0 = "ۨۜۧۘۧۘۘۨۚۖۥۢۚۚ۬ۨۖۢۨۘۜۛ۬ۨ۬ۜۘۛۙۜ"
        L_0x00a4:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -150464223: goto L_0x00b7;
                case 733953388: goto L_0x00da;
                case 1341937400: goto L_0x00ba;
                case 1924846509: goto L_0x00ad;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00a4
        L_0x00ad:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "۫۫۫ۙۦ۠ۜ۬ۛۧ۠۠ۧۧ"
            goto L_0x00a4
        L_0x00b4:
            java.lang.String r0 = "ۦۛۨۦۘۧۘۛۜۥۙ۟ۧۤۛۚۗۥۧ"
            goto L_0x00a4
        L_0x00b7:
            java.lang.String r0 = "ۘۙ۟۫ۧۤۛۛ۟ۧۢۙ۬ۙۚ۟۬ۢۨ۫ۦۡۧۗۡۛۖ"
            goto L_0x00a4
        L_0x00ba:
            java.lang.String r0 = "۠ۡۦۘ۟ۙۢۢۢۥۖۜۦۢۧۥ۠ۗۡ۟ۢ"
            goto L_0x0007
        L_0x00be:
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
            r9.setTextSkewX(r0)
            java.lang.String r0 = "ۡۡ۫ۦ۟ۜۘۦ۬ۥۧۜۛۤۤۨۘۧۥۥۡۦۘ۠۫ۛۦۧۦۘ"
            goto L_0x0007
        L_0x00c7:
            r9.setTypeface(r10)
            java.lang.String r0 = "ۨۚۖۘۡ۫ۡۘ۬ۗۗ۬ۡۢۗۖۗۡۚۨ۬۫ۨۘ"
            goto L_0x0007
        L_0x00ce:
            java.lang.String r0 = "۠ۨۢۤۥۢ۟ۨۥ۟ۦۜۡ۫۬ۛۧۘۗ۟۠۠ۚ"
            goto L_0x0007
        L_0x00d2:
            java.lang.String r0 = "ۘ۬ۢۢۚۗۙۧۚۨۤۗۧۤۤۤۜۦۘۨۜ۬"
            goto L_0x0007
        L_0x00d6:
            java.lang.String r0 = "ۥۡۘ۟ۚۢۦۚۥۘۢۚ۟ۧ۟ۖۘۛۡۜۙۘۧۘ۬ۛۗۥۚۖ"
            goto L_0x0007
        L_0x00da:
            java.lang.String r0 = "ۡۡ۫ۦ۟ۜۘۦ۬ۥۧۜۛۤۤۨۘۧۥۥۡۦۘ۠۫ۛۦۧۦۘ"
            goto L_0x0007
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.CustomTypefaceSpan.a(android.graphics.Paint, android.graphics.Typeface):void");
    }

    public void updateDrawState(TextPaint textPaint) {
        String str = "ۚۥۘۖۦۨۘ۟ۙۛۡۧۧۦۥۙۤۢ۠ۛ";
        while (true) {
            switch ((str.hashCode() ^ 513) ^ -1254407487) {
                case -1595188674:
                    return;
                case -50383994:
                    str = "ۦۨۨۧۚۧۥۖۗۖ۟۟ۜۜۡۖۥ۫ۥ۟۠ۨۨۤۤۖۤ";
                    break;
                case 715673819:
                    str = "ۜ۬۫ۜۙۤۜۨ۠۟ۧۨۗۤۖۘ۬ۗۜۡۜۗۛۡۖۘ";
                    break;
                case 1580456762:
                    a(textPaint, this.f540a);
                    str = "ۡۢۨۘۜۖۤۜۦۛ۬۟ۛۡۜۨۚۨۥۘ";
                    break;
            }
        }
    }

    public void updateMeasureState(TextPaint textPaint) {
        String str = "ۜۡۢ۟ۖۢۘۢۧۧۦۚ۬ۛۦۘۗ۬ۨۘ۠ۗۖۘۜۢۡۘۙۛۚ";
        while (true) {
            switch ((str.hashCode() ^ 877) ^ -1208853557) {
                case -1459718029:
                    a(textPaint, this.f540a);
                    str = "ۜ۫ۢ۠ۘۚۗ۟ۦ۠ۗۘۖ۟ۨۚۧۘۖۡۚۢۤۨ";
                    break;
                case -593282536:
                    str = "۫ۗۘۘۢۛۧۨۘۜۧۖۧۘۧ۫ۜۦ۟ۡۚۗۦۜ۠ۤ۬۟ۙ";
                    break;
                case -206760045:
                    return;
                case 367355734:
                    str = "ۖ۫ۚۧ۟۟ۛۖۚۚۤ۠ۛ۬ۡۘۡ۫ۗۥۗ";
                    break;
            }
        }
    }
}
