package com.obwhatsapp.youbasha.filechooser.internals;

import java.io.FileFilter;

public class ExtFileFilter implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1047a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1048b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f1049c;

    public ExtFileFilter() {
        this(false, false, new String[0]);
    }

    public ExtFileFilter(boolean z2, boolean z3, String... strArr) {
        this.f1047a = z3;
        this.f1048b = z2;
        this.f1049c = strArr;
    }

    public ExtFileFilter(String... strArr) {
        this(false, false, strArr);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        r0 = "ۧۤۡۘۖۖ۠ۦۢۜۘ۬ۗۤۤۦۘۚۥۘۨۙۨۘۡ۬ۢۗ۬ۨ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014f, code lost:
        r0 = "۠ۦ۫ۘ۬ۤۦۥۢۜۥۡۘۙۤ۠ۗۡ۫ۜ۬";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean accept(java.io.File r12) {
        /*
            r11 = this;
            r6 = 0
            r8 = 1
            r2 = 0
            java.lang.String r0 = "۟ۗۖۙۢۥۥۥۡ۠ۜۧۘۥ۠ۜۘۥۗۧۗۨۢۤۥۙۛۥۘ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r6
            r7 = r6
        L_0x000a:
            int r6 = r0.hashCode()
            r9 = 760(0x2f8, float:1.065E-42)
            r10 = -719304130(0xffffffffd5204a3e, float:-1.10150455E13)
            r6 = r6 ^ r9
            r6 = r6 ^ r10
            switch(r6) {
                case -1929904531: goto L_0x014a;
                case -1705603091: goto L_0x00c4;
                case -1700707632: goto L_0x007e;
                case -1518769480: goto L_0x001f;
                case -1501136161: goto L_0x0019;
                case -1345932028: goto L_0x00fd;
                case -1332082862: goto L_0x009f;
                case -1256932401: goto L_0x0060;
                case -1001178239: goto L_0x00a6;
                case -878083400: goto L_0x001c;
                case -843980171: goto L_0x00c3;
                case -472992884: goto L_0x0102;
                case -453892825: goto L_0x0144;
                case -415475916: goto L_0x011f;
                case -49781620: goto L_0x00f4;
                case 377331026: goto L_0x00c5;
                case 385695680: goto L_0x015b;
                case 412798649: goto L_0x00c4;
                case 875173327: goto L_0x00c4;
                case 1005997217: goto L_0x00e6;
                case 1104468294: goto L_0x00f9;
                case 1201963510: goto L_0x0142;
                case 1287375501: goto L_0x00e8;
                case 1320030255: goto L_0x003d;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = "ۚۜۥۜ۠ۧ۟ۗۨۘۤۡۢۖۤۥۘ"
            goto L_0x000a
        L_0x001c:
            java.lang.String r0 = "ۤۙ۟۟ۨۛۧۢۙۖۖۥۘۖۨۘۨ۠۬ۥۖۖۥۤ۫"
            goto L_0x000a
        L_0x001f:
            r6 = -1634403458(0xffffffff9e94fb7e, float:-1.5774124E-20)
            java.lang.String r0 = "ۢۨۡۗۖۘ۫ۦۥ۬ۗۛۡۜۡۦۘۖۘۗۛۥ"
        L_0x0024:
            int r9 = r0.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case -314438250: goto L_0x002d;
                case 680505678: goto L_0x003a;
                case 795084693: goto L_0x0033;
                case 1233166523: goto L_0x004b;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            java.lang.String r0 = "ۧۢۤۘۧۙ۠۬ۥۘۖۡۘۘۦۤۙ"
            goto L_0x0024
        L_0x0030:
            java.lang.String r0 = "ۖۧۡۘۗۡ۬ۚۘۦۘۤ۬ۚۘ۟ۢۛۚۡۘۧۧۜۘ"
            goto L_0x0024
        L_0x0033:
            boolean r0 = r11.f1047a
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "ۙۗ۠ۜۜۛۦۤ۠ۥۚۖۗۦۧۦۨۗۖۚۙۡۦۡۨۜۘ"
            goto L_0x0024
        L_0x003a:
            java.lang.String r0 = "ۙۧ۫۬۠ۢ۫ۖۧۙۧۥ۠ۤۧۧۨۛۦۖۜ"
            goto L_0x000a
        L_0x003d:
            r6 = -1314178779(0xffffffffb1ab3925, float:-4.9832516E-9)
            java.lang.String r0 = "ۥ۟ۘۘ۬ۦۨۗ۫ۖۘۧۛۙۜۧۘۘۨۙ۟"
        L_0x0042:
            int r9 = r0.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case -2102079545: goto L_0x005d;
                case -387709618: goto L_0x004b;
                case 422182637: goto L_0x0051;
                case 746015401: goto L_0x005a;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0042
        L_0x004b:
            java.lang.String r0 = "ۧۤۡۘۖۖ۠ۦۢۜۘ۬ۗۤۤۦۘۚۥۘۨۙۨۘۡ۬ۢۗ۬ۨ"
            goto L_0x000a
        L_0x004e:
            java.lang.String r0 = "ۤۦۢۤۘۨۘۚۨۦۙۚۜۜ۬ۢ"
            goto L_0x0042
        L_0x0051:
            boolean r0 = r12.isHidden()
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "ۜۥۖۘۨۛۗۛۡۗۚۡۥۖ۬ۨۘ"
            goto L_0x0042
        L_0x005a:
            java.lang.String r0 = "ۛۡۧۘۗۘۚۘۙۙۘۙۨۢۜۨۛۡۦۥ"
            goto L_0x0042
        L_0x005d:
            java.lang.String r0 = "ۗۨۥۘۛ۬۬ۚۗۡۘۙۛۢۛۥۧۘۨۙ۬"
            goto L_0x000a
        L_0x0060:
            r6 = -223181041(0xfffffffff2b2870f, float:-7.072206E30)
            java.lang.String r0 = "ۚۦۢۧ۫ۨۤ۬ۚۤۘۡۘ۟ۚۨۛۤۤۨۘۜۘۥۡۦ۫"
        L_0x0065:
            int r9 = r0.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case -1560221936: goto L_0x007b;
                case -523863098: goto L_0x006e;
                case 24383237: goto L_0x0074;
                case 1693439921: goto L_0x014f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0065
        L_0x006e:
            java.lang.String r0 = "ۦ۫ۢۥۛۗۜۙۙۘ۠۬۟ۧۥۙ۬ۘۙۛۘۘ"
            goto L_0x000a
        L_0x0071:
            java.lang.String r0 = "۫ۙۜۙ۟ۨۘۛۖۡ۬ۘۗۨۚۜۡۙۗ"
            goto L_0x0065
        L_0x0074:
            boolean r0 = r11.f1048b
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "ۤۘۗۗۜ۫ۛ۟ۜۡ۬۠۫ۡۡۢ۟ۜۘ۟ۚۛۤۡۘ"
            goto L_0x0065
        L_0x007b:
            java.lang.String r0 = "ۢۥ۟ۜۛۨۘۥۤۜۘ۟۫ۦۘ۠ۙۧۖۜۜۘۦۡۦۘ۟ۦۖۘۨۜۥۘ"
            goto L_0x0065
        L_0x007e:
            r6 = -74505011(0xfffffffffb8f24cd, float:-1.4864897E36)
            java.lang.String r0 = "ۘۢ۠ۙۡ۫ۥۗ۟ۨۙۦۘۗۚۨۘ۠ۙۜ۫ۚۡۘۨۚۚۘۧۗ"
        L_0x0083:
            int r9 = r0.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case -847432851: goto L_0x014f;
                case 1343251593: goto L_0x009b;
                case 1549729790: goto L_0x008c;
                case 1696087208: goto L_0x0098;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0083
        L_0x008c:
            boolean r0 = r12.isDirectory()
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = "ۨۥۦۘ۬ۥۡۤۥۛۙۥ۠ۡۡۘ"
            goto L_0x0083
        L_0x0095:
            java.lang.String r0 = "ۡۖۦۙۦۘۢۘۨۙۦ۠ۦۥۘ۬ۙ۫"
            goto L_0x0083
        L_0x0098:
            java.lang.String r0 = "ۖۙۜۘۢۡۛ۠ۦۚ۟۬ۨۢۧۡۦ۫ۦۛۙ۫"
            goto L_0x0083
        L_0x009b:
            java.lang.String r0 = "ۧ۫۫ۙۥۜۘ۫ۡۘ۫۠ۘ۠ۛۖۘۧۛۤۧۡۦ"
            goto L_0x000a
        L_0x009f:
            java.lang.String[] r6 = r11.f1049c
            java.lang.String r0 = "ۙۥۤۦۜۨۖۡۨ۠ۖۙۦۚۗ۠۠ۖۢ۟ۘۜۛ"
            r7 = r6
            goto L_0x000a
        L_0x00a6:
            r6 = -1611411720(0xffffffff9ff3cef8, float:-1.03256904E-19)
            java.lang.String r0 = "۬ۚۡۘۥۖۜۘۢۢۜۤۜۘۘۗ۬ۜۘ"
        L_0x00ab:
            int r9 = r0.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case -1295312821: goto L_0x00b4;
                case -851908006: goto L_0x00bc;
                case 637720244: goto L_0x0153;
                case 2066450951: goto L_0x00bf;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x00ab
        L_0x00b4:
            if (r7 != 0) goto L_0x00b9
            java.lang.String r0 = "۬ۖ۠ۚ۬۟ۚ۬ۖۘۖ۠۬۠۟ۥ۠ۢۘۘۗۜۘ"
            goto L_0x00ab
        L_0x00b9:
            java.lang.String r0 = "ۜۥۨۘۖ۫ۥۘۗ۬ۙۦۗۘۗۛۘۘ۠ۖۜۘ۫ۢۖۥۨۢۚۜۨۘ"
            goto L_0x00ab
        L_0x00bc:
            java.lang.String r0 = "ۙۧ۟۟ۤۚۥۖۡ۟۠ۦۜۡۘۢۜۘ۬ۡۘ"
            goto L_0x00ab
        L_0x00bf:
            java.lang.String r0 = "۟ۜۚۥۜۖۚۢۛۘۨۧۛۚ۠۟ۦۘۘۡۚۘۘۘۥۛ"
            goto L_0x000a
        L_0x00c3:
            r2 = r8
        L_0x00c4:
            return r2
        L_0x00c5:
            r6 = 1967621791(0x7547869f, float:2.5292908E32)
            java.lang.String r0 = "ۙۢۡۘۙۗۡۧۚۛۘۤۢ۟۬۟ۘۛۤۙۘۤۜۚۚۡ۬ۡۘ"
        L_0x00ca:
            int r9 = r0.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case -1598007494: goto L_0x0157;
                case -673676378: goto L_0x00d3;
                case -167067942: goto L_0x00e2;
                case 912166273: goto L_0x00df;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            goto L_0x00ca
        L_0x00d3:
            boolean r0 = r12.isDirectory()
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = "ۛ۫ۥۤۧۢۜۥ۬۟ۚۗۢۙۖۘۨۨۨۘ۬۫ۘۧۘۨۛۗۤ"
            goto L_0x00ca
        L_0x00dc:
            java.lang.String r0 = "ۤۙۡۙۦۨۘ۟۟۟ۡ۫ۥۙۗۖۘ"
            goto L_0x00ca
        L_0x00df:
            java.lang.String r0 = "ۚۨۡۘۙ۫ۜۥ۬ۙۜۡۘۢۚۙۛ۟ۙ۬ۥۘ"
            goto L_0x00ca
        L_0x00e2:
            java.lang.String r0 = "ۦۚۛ۟ۛۗۜۥۛۖ۠۟ۚۤۨ"
            goto L_0x000a
        L_0x00e6:
            r2 = r8
            goto L_0x00c4
        L_0x00e8:
            java.lang.String r0 = com.obwhatsapp.youbasha.filechooser.internals.FileUtil.getExtension(r12)
            java.lang.String r5 = r0.substring(r8)
            java.lang.String r0 = "ۛۛۧۥۦۥۡۥۧ۬ۤۥۘۦۢۨۜ۟ۥۘۖۦ۫"
            goto L_0x000a
        L_0x00f4:
            int r4 = r7.length
            java.lang.String r0 = "ۡ۟۫ۚۢۘۘۢ۬ۦۘۥ۫۫۬ۦۨۤ۟ۢ۬ۦۗۚۘۦۘ"
            goto L_0x000a
        L_0x00f9:
            java.lang.String r0 = "ۙۗۢۚ۫ۗۚۢ۟۟۫۟۠ۜۨۘۦۚ۟ۗۙۥ"
            goto L_0x000a
        L_0x00fd:
            java.lang.String r0 = "ۚ۫ۘۘۖۥ۠ۥۜۤۚ۠ۗ۟ۨۗ"
            r3 = r2
            goto L_0x000a
        L_0x0102:
            r6 = 764630762(0x2d9356ea, float:1.6750563E-11)
            java.lang.String r0 = "ۢۗۢ۬ۧۨ۬۬ۛۙۧۤۛ۠ۜۘ۫ۥۢۗۙۙۜۖ۟۫ۦۧۘ"
        L_0x0107:
            int r9 = r0.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case 185833529: goto L_0x0118;
                case 949863404: goto L_0x0110;
                case 1134304303: goto L_0x011b;
                case 1367003816: goto L_0x0163;
                default: goto L_0x010f;
            }
        L_0x010f:
            goto L_0x0107
        L_0x0110:
            if (r3 >= r4) goto L_0x0115
            java.lang.String r0 = "ۙۜۘۦۢۦۘۛۖۤۡ۬ۖۘۢ۠ۢۘ۬ۢۙ۬۬ۧۘۘۘۘۚۢ"
            goto L_0x0107
        L_0x0115:
            java.lang.String r0 = "۟ۦۨۘۥ۠ۚۦۤۘۗۥۨۜۖ"
            goto L_0x0107
        L_0x0118:
            java.lang.String r0 = "ۡۜۖۘۢۖۥۜۚۚۢ۬ۨۘۘۨۜۘۜۡۤۦۚ"
            goto L_0x0107
        L_0x011b:
            java.lang.String r0 = "ۙۧۥۤۗ۫ۤۨۡۜ۠ۙۚ۫ۜ"
            goto L_0x000a
        L_0x011f:
            r6 = -11654646(0xffffffffff4e2a0a, float:-2.7403925E38)
            java.lang.String r0 = "ۤۖۧۘ۫ۢۧ۫۬ۢ۠ۢۤۛ۠ۡۘ"
        L_0x0124:
            int r9 = r0.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case -1142322101: goto L_0x012d;
                case -751922092: goto L_0x015f;
                case 478892539: goto L_0x013f;
                case 1936331296: goto L_0x0134;
                default: goto L_0x012c;
            }
        L_0x012c:
            goto L_0x0124
        L_0x012d:
            java.lang.String r0 = "ۜۗۛ۬ۡۜۘۚ۫ۖۘۚۖۧ۟ۤۙ۫ۦ۬ۨۦۡۘۡۖۖۘ"
            goto L_0x000a
        L_0x0131:
            java.lang.String r0 = "ۤۚۘۤ۟ۦۘۢ۫ۘۘۡ۬ۨ۬ۥ۬ۤۡۚۢۡ۬"
            goto L_0x0124
        L_0x0134:
            r0 = r7[r3]
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "ۛۚۨۜۦۥ۠ۙۜۤۥۥۙۖۙۗۢۙۘۦۘۤۦۘ"
            goto L_0x0124
        L_0x013f:
            java.lang.String r0 = "ۙۨۢۚۨۘۨۨۥۘ۬ۙۨۘۛۤ۫ۚۧۥۘۦۚۦۘ"
            goto L_0x0124
        L_0x0142:
            r2 = r8
            goto L_0x00c4
        L_0x0144:
            int r1 = r3 + 1
            java.lang.String r0 = "ۢۦۨۘۧ۫ۖۘ۬ۘۚۦۘ۫ۦۦۛۘۙۖۘ۟ۙۜۘۚۛۛ"
            goto L_0x000a
        L_0x014a:
            java.lang.String r0 = "ۡۖۥۧ۫ۥۡۢۨۗۥۜ۠۠ۘۘۧۚۛۚۛۗ"
            r3 = r1
            goto L_0x000a
        L_0x014f:
            java.lang.String r0 = "۠ۦ۫ۘ۬ۤۦۥۢۜۥۡۘۙۤ۠ۗۡ۫ۜ۬"
            goto L_0x000a
        L_0x0153:
            java.lang.String r0 = "ۥۧ۟ۖۗۖۦۗۡۘۚۡۧۘۙۤۙ۫ۖۤۗ۟۠۫ۘۖ"
            goto L_0x000a
        L_0x0157:
            java.lang.String r0 = "ۤۡۥۘۛۡۜ۫ۗۡۦۖۦۛۧۦۗۜۤۢۡ"
            goto L_0x000a
        L_0x015b:
            java.lang.String r0 = "ۚ۫ۘۘۖۥ۠ۥۜۤۚ۠ۗ۟ۨۗ"
            goto L_0x000a
        L_0x015f:
            java.lang.String r0 = "ۙۜ۠ۥ۬۠ۦۙ۬ۢۦۧۘۦۦۜۘۚۥۚۗۛۖۘ۬ۚۙۨۨۥ"
            goto L_0x000a
        L_0x0163:
            java.lang.String r0 = "ۨۨۥۘ۫ۖۘۘ۟ۙۤۡ۫ۥۡۦ۟ۧۥۙۖ۟ۙۚۧۦۘ"
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.filechooser.internals.ExtFileFilter.accept(java.io.File):boolean");
    }
}
