package com.obwhatsapp.yo;

import X.C57012pj;
import android.view.View;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f880a;

    /* renamed from: b  reason: collision with root package name */
    public final C57012pj f881b;

    public /* synthetic */ t(C57012pj r1, int i2) {
        this.f880a = i2;
        this.f881b = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0181, code lost:
        r1 = com.obwhatsapp.yo.yo.getCtx();
        r0 = "photo_faled_save_to_gallery";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0187, code lost:
        a.a.i(r0, r1, 0);
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:70:0x0130=Splitter:B:70:0x0130, B:61:0x00f8=Splitter:B:61:0x00f8, B:47:0x00bb=Splitter:B:47:0x00bb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            r1 = 1
            r2 = 0
            int r0 = r8.f880a
            switch(r0) {
                case 0: goto L_0x03b3;
                case 1: goto L_0x03ac;
                case 2: goto L_0x0397;
                case 3: goto L_0x0390;
                case 4: goto L_0x02af;
                case 5: goto L_0x015f;
                case 6: goto L_0x0050;
                default: goto L_0x0007;
            }
        L_0x0007:
            int r3 = com.obwhatsapp.yo.p0.d()     // Catch:{ Exception -> 0x0418 }
            r4 = 1796143604(0x6b0ef9f4, float:1.7284784E26)
            java.lang.String r0 = "ۜۨۘۘۤۛۖۦۗۛۙۜۤۙۛۧۤۙۨۙۚۘۘۦۡۧۘ۟۟۫"
        L_0x0010:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x0418 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1979615920: goto L_0x0424;
                case -1807505928: goto L_0x03c6;
                case 615865394: goto L_0x03c0;
                case 877449266: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0010
        L_0x0019:
            r4 = 998331020(0x3b81528c, float:0.003946608)
            java.lang.String r0 = "ۘۙۦۧۥۘۧ۟ۢۙ۠ۦۘۛۖۘۤۚۜۘۘ۬ۜۘۛۡۤۜۜۘ"
        L_0x001e:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2081556921: goto L_0x03ce;
                case -1473060653: goto L_0x03d4;
                case 1271872560: goto L_0x0045;
                case 2069910192: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x001e
        L_0x0027:
            java.lang.String r1 = com.obwhatsapp.yo.p0.textStatus     // Catch:{ Exception -> 0x0418 }
            r3 = 1364700033(0x5157ab81, float:5.7893458E10)
            java.lang.String r0 = "ۙۜۜۦۘۘۢۧۛ۬ۦۥۘ۫۠ۦۡۖۧۘۘ۬ۜۘ"
        L_0x002e:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x0418 }
            r4 = r4 ^ r3
            switch(r4) {
                case -1525446224: goto L_0x03dc;
                case 274581363: goto L_0x0045;
                case 796122880: goto L_0x03e2;
                case 1254024737: goto L_0x0037;
                default: goto L_0x0036;
            }     // Catch:{ Exception -> 0x0418 }
        L_0x0036:
            goto L_0x002e
        L_0x0037:
            r3 = -1643603430(0xffffffff9e089a1a, float:-7.2316475E-21)
            java.lang.String r0 = "ۦ۫ۚۛۨۙ۬ۧۦۤۘۘۜۨۜۘۘۢۖ"
        L_0x003c:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x0418 }
            r4 = r4 ^ r3
            switch(r4) {
                case -1868092381: goto L_0x03fa;
                case -1849479474: goto L_0x03ea;
                case -724988232: goto L_0x0045;
                case 481400779: goto L_0x03f6;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x003c
        L_0x0045:
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = com.obwhatsapp.yo.p0.mStatusPlaybackContactFragment
            r0.A14()
            X.2pj r0 = r8.f881b
            r0.dismiss()
        L_0x004f:
            return
        L_0x0050:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00e8 }
            r3.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "android.intent.action.SEND"
            r3.setAction(r0)     // Catch:{ Exception -> 0x00e8 }
            int r4 = com.obwhatsapp.yo.p0.d()     // Catch:{ Exception -> 0x00e8 }
            r5 = 1596005833(0x5f211dc9, float:1.1609656E19)
            java.lang.String r0 = "ۖۗۥۧۤۡۘۜ۠ۡۘۢۘۤۨۥۤۤۧۥۘ۠۟ۚ"
        L_0x0063:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x00e8 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1686053200: goto L_0x006c;
                case -699698380: goto L_0x00f3;
                case 788409973: goto L_0x0077;
                case 1188137278: goto L_0x0074;
                default: goto L_0x006b;
            }     // Catch:{ Exception -> 0x00e8 }
        L_0x006b:
            goto L_0x0063
        L_0x006c:
            if (r4 == 0) goto L_0x0071
            java.lang.String r0 = "ۖۚۖۘۗۙۥۧۨ۫۫ۦ۫ۘ۟ۙۘۛۦۙۜ"
            goto L_0x0063
        L_0x0071:
            java.lang.String r0 = "ۙۧۚۥ۠ۧۧۖۥۖۡۧۤۘ۫ۙۦۛ"
            goto L_0x0063
        L_0x0074:
            java.lang.String r0 = "۫ۜۤۧۦۖۘ۠ۜ۬ۥ۠ۖ۠۬ۧ"
            goto L_0x0063
        L_0x0077:
            r5 = 1794851371(0x6afb422b, float:1.51876425E26)
            java.lang.String r0 = "ۧۘۡۢ۬ۦۘۡ۠ۦۧۚۥۘۛۖۧۗۨۜ۫ۗۧ"
        L_0x007c:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -878616574: goto L_0x0098;
                case 152674288: goto L_0x0085;
                case 1696300029: goto L_0x009b;
                case 1731806896: goto L_0x0093;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x007c
        L_0x0085:
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = com.obwhatsapp.yo.p0.mStatusPlaybackContactFragment
            r0.A14()
            X.2pj r0 = r8.f881b
            r0.dismiss()
            goto L_0x004f
        L_0x0090:
            java.lang.String r0 = "ۗۛۡۘۗۤۨۘ۬ۡۡۘ۟ۙۧۙۛۨۘۚۢۥۘ"
            goto L_0x007c
        L_0x0093:
            if (r4 == r1) goto L_0x0090
            java.lang.String r0 = "ۥۘۜ۟ۥۢ۠ۤۡۘۦ۟ۤ۟ۧ۠ۥۡۗۖ۟ۛۨ۟"
            goto L_0x007c
        L_0x0098:
            java.lang.String r0 = "۫۟ۛۢ۠ۘۘۨ۫ۘۙۥۨ۫ۥۡ"
            goto L_0x007c
        L_0x009b:
            java.lang.String r1 = com.obwhatsapp.yo.p0.textStatus     // Catch:{ Exception -> 0x00e8 }
            r4 = 399225252(0x17cbb1a4, float:1.316341E-24)
            java.lang.String r0 = "ۥۡۡۤۛۜۘۤ۫ۡۘۡ۟ۖۥۦۤۦۛۖۙۖۘۦۥۢ"
        L_0x00a2:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00e8 }
            r5 = r5 ^ r4
            switch(r5) {
                case -529788788: goto L_0x00ab;
                case 420726234: goto L_0x0085;
                case 614269339: goto L_0x00b3;
                case 977617180: goto L_0x00b6;
                default: goto L_0x00aa;
            }     // Catch:{ Exception -> 0x00e8 }
        L_0x00aa:
            goto L_0x00a2
        L_0x00ab:
            if (r1 == 0) goto L_0x00b0
            java.lang.String r0 = "ۖۜۜ۟ۦۦۛۘۧۘۗۙۦۦۙ۟"
            goto L_0x00a2
        L_0x00b0:
            java.lang.String r0 = "ۖۨۛ۠ۤۙۗۤۢۡۖۗۨ۫ۚ"
            goto L_0x00a2
        L_0x00b3:
            java.lang.String r0 = "ۡۧۛۚۥ۬ۢۦۘۘۗۜ۫ۙ۬ۥۘۘۨ۟ۢ۟ۢۙ۟"
            goto L_0x00a2
        L_0x00b6:
            r4 = 1643927395(0x61fc5763, float:5.8185955E20)
            java.lang.String r0 = "ۦ۫ۖۘۘۘۧۘۨۢۖۘۥۦۨۢۜ۬ۖ۠ۡۨۦۧۢۚۗ۠۠"
        L_0x00bb:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00e8 }
            r5 = r5 ^ r4
            switch(r5) {
                case -2142420873: goto L_0x00d2;
                case -1263674153: goto L_0x00d5;
                case 61388973: goto L_0x00c4;
                case 458769549: goto L_0x0085;
                default: goto L_0x00c3;
            }     // Catch:{ Exception -> 0x00e8 }
        L_0x00c3:
            goto L_0x00bb
        L_0x00c4:
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x00e8 }
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = "ۛ۫ۤۚۚۚۛۡۥۘ۬ۛۡۘۜ۟ۖۘۗۥ۬"
            goto L_0x00bb
        L_0x00cf:
            java.lang.String r0 = "ۚۜۘۚۗۜۘ۟۫۫ۢۙۙۦ۟۟ۡۖۡۙۖۘۧۛۥ"
            goto L_0x00bb
        L_0x00d2:
            java.lang.String r0 = "ۘ۬ۤۙۗۤۦۨ۬ۖۤۚۢۗۡۘۙ۬۠ۙۖۙۜۦۡۘ"
            goto L_0x00bb
        L_0x00d5:
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r1 = com.obwhatsapp.yo.p0.textStatus     // Catch:{ Exception -> 0x00e8 }
            r3.putExtra(r0, r1)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "text/plain"
            r3.setType(r0)     // Catch:{ Exception -> 0x00e8 }
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x00e8 }
            r0 = r3
        L_0x00e4:
            r1.startActivity(r0)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x0085
        L_0x00e8:
            r0 = move-exception
            java.lang.String r0 = "register_try_again_later"
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            a.a.i(r0, r1, r2)
            goto L_0x0085
        L_0x00f3:
            r1 = -1615301688(0xffffffff9fb873c8, float:-7.8118575E-20)
            java.lang.String r0 = "۟ۡۥۘۛۙ۠ۜۨۦۘۛ۬۠ۢۗۧ۟ۢۨۛۢۖۘۦۗۦ"
        L_0x00f8:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00e8 }
            r4 = r4 ^ r1
            switch(r4) {
                case -1829847713: goto L_0x014a;
                case -1537063804: goto L_0x0101;
                case 814347338: goto L_0x0085;
                case 850672157: goto L_0x0143;
                default: goto L_0x0100;
            }     // Catch:{ Exception -> 0x00e8 }
        L_0x0100:
            goto L_0x00f8
        L_0x0101:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00e8 }
            java.io.File r1 = com.obwhatsapp.yo.p0.f843b     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x00e8 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00e8 }
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x00e8 }
            android.net.Uri r1 = X.AnonymousClass1XI.A01(r1, r0)     // Catch:{ Exception -> 0x00e8 }
            r0 = 1
            r3.addFlags(r0)     // Catch:{ Exception -> 0x00e8 }
            r0 = 128(0x80, float:1.794E-43)
            r3.addFlags(r0)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "android.intent.extra.STREAM"
            r3.putExtra(r0, r1)     // Catch:{ Exception -> 0x00e8 }
            r4 = -1963364837(0xffffffff8af96e1b, float:-2.4019245E-32)
            java.lang.String r0 = "ۖۤۡۘۦۦۜۘ۫۬ۘۖۙۤۛۥۡۥ۟ۜۘۙۗ۟ۙۗۨ"
        L_0x0125:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00e8 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1572488949: goto L_0x0159;
                case -1457912464: goto L_0x0150;
                case 1147596774: goto L_0x012e;
                case 1524113297: goto L_0x015c;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x0125
        L_0x012e:
            java.lang.String r0 = "image/*"
        L_0x0130:
            r3.setType(r0)     // Catch:{ Exception -> 0x00e8 }
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "share_to_other_apps"
            java.lang.String r0 = com.obwhatsapp.yo.yo.getString((java.lang.String) r0)     // Catch:{ Exception -> 0x00e8 }
            android.content.Intent r0 = android.content.Intent.createChooser(r3, r0)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00e4
        L_0x0140:
            java.lang.String r0 = "ۡۥۧۘ۠ۘۨۘۛۧ۫ۨۚۗۗۖ"
            goto L_0x00f8
        L_0x0143:
            java.io.File r0 = com.obwhatsapp.yo.p0.f843b     // Catch:{ Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "ۨۥۖۤۢۙۗۘۦ۟۠۫ۡ۬ۨۘۡۥ۠ۥۦۜۘ"
            goto L_0x00f8
        L_0x014a:
            java.lang.String r0 = "ۛۗۘۘۜ۟ۥۘۗ۠ۜۚۨ۠۠ۚۤۚۜۧ"
            goto L_0x00f8
        L_0x014d:
            java.lang.String r0 = "ۚۗۛۤۨۗ۟۫۟ۚ۫ۘۘۦۡ"
            goto L_0x0125
        L_0x0150:
            boolean r0 = com.obwhatsapp.youbasha.task.utils.isImageFile(r1)     // Catch:{ Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "ۧ۠ۧۦۚۨۘۢ۫ۡ۫ۜۢ۬۫ۚ"
            goto L_0x0125
        L_0x0159:
            java.lang.String r0 = "ۤۛۦۘۤۘۡۛۦ۟ۚۘۘۥۤۦ"
            goto L_0x0125
        L_0x015c:
            java.lang.String r0 = "video/*"
            goto L_0x0130
        L_0x015f:
            X.2pj r3 = r8.f881b
            int r4 = com.obwhatsapp.yo.p0.d()
            r5 = 1630860332(0x6134f42c, float:2.0862552E20)
            java.lang.String r0 = "ۗۧۥۘۥۢۤۛ۠ۖۘۢۨۜۘۤۚۖۘۙۢۢۜ۫ۗۖ۟ۜۘۛۙ۬"
        L_0x016a:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1600254343: goto L_0x0197;
                case -1369600628: goto L_0x019c;
                case -654934342: goto L_0x01f5;
                case 1446065987: goto L_0x0173;
                default: goto L_0x0172;
            }
        L_0x0172:
            goto L_0x016a
        L_0x0173:
            r5 = -655975735(0xffffffffd8e69ac9, float:-2.02841977E15)
            java.lang.String r0 = "ۢ۫ۚۡ۫ۖ۠۬ۘۘ۫۟ۢ۫ۙۤۢۨ۠ۥۛۡ۠ۙۜۤۛۤ"
        L_0x0178:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -443764811: goto L_0x0181;
                case 307535707: goto L_0x01aa;
                case 500589829: goto L_0x01a7;
                case 1031034819: goto L_0x01a2;
                default: goto L_0x0180;
            }
        L_0x0180:
            goto L_0x0178
        L_0x0181:
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r0 = "photo_faled_save_to_gallery"
        L_0x0187:
            a.a.i(r0, r1, r2)
        L_0x018a:
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = com.obwhatsapp.yo.p0.mStatusPlaybackContactFragment
            r0.A14()
            r3.dismiss()
            goto L_0x004f
        L_0x0194:
            java.lang.String r0 = "ۥۖۙ۟ۘۜۘۧۢۢۥۜۥۘ۬ۨۜۘۤ۫ۘۗۨۨۘ۫ۢۜۘۨ۠ۧ"
            goto L_0x016a
        L_0x0197:
            if (r4 == 0) goto L_0x0194
            java.lang.String r0 = "ۥۥۛۦۘۜۗۚۚۨۖۘۦۖ۟ۦ۫۬ۘۖۘ"
            goto L_0x016a
        L_0x019c:
            java.lang.String r0 = "ۤۢ۟ۤۘۘ۫ۖۜۛۙۖۚۗۖ"
            goto L_0x016a
        L_0x019f:
            java.lang.String r0 = "۟ۗۖۘۦ۫ۜ۬ۗۜۘۢۧۡۗ۫ۘ۠ۨۗۧ۬ۚ"
            goto L_0x0178
        L_0x01a2:
            if (r4 == r1) goto L_0x019f
            java.lang.String r0 = "۟۟ۘۘ۠ۜۛۖۦۘۘۦۨۦۘۜۧۡۘۨ۟ۘۤۛ۟"
            goto L_0x0178
        L_0x01a7:
            java.lang.String r0 = "ۢۧۛۘ۬ۖۛۤۜۗۨۘۧۤۨۘۥۚۡۥ۠ۖۘ"
            goto L_0x0178
        L_0x01aa:
            java.lang.String r1 = com.obwhatsapp.yo.p0.textStatus
            r4 = 932024920(0x378d9258, float:1.6876656E-5)
            java.lang.String r0 = "ۗۘ۫۫ۤۦۘۥ۟ۜۡۤۘ۠ۦ۬ۖۛۡۢۙۜ"
        L_0x01b1:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1776845889: goto L_0x01c0;
                case -1730780206: goto L_0x01ba;
                case 254155538: goto L_0x0181;
                case 317519755: goto L_0x01c5;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            goto L_0x01b1
        L_0x01ba:
            java.lang.String r0 = "۬ۨۖۘۦۜۦۘۘ۠ۛۘۨۜ۫ۦۘ۟ۛۢ۬ۚۙۛ۫"
            goto L_0x01b1
        L_0x01bd:
            java.lang.String r0 = "ۦۡۧۘ۟ۡۘۘ۠ۥۜۘۦۦۥۧۙۥ۠ۥۤۨۜۖۘۗ۠۫"
            goto L_0x01b1
        L_0x01c0:
            if (r1 == 0) goto L_0x01bd
            java.lang.String r0 = "ۖۚ۬ۢ۟۫ۤۜ۠ۘ۠ۥۡۛ۟"
            goto L_0x01b1
        L_0x01c5:
            r4 = 922109314(0x36f64582, float:7.339463E-6)
            java.lang.String r0 = "ۤۗۥ۫ۖ۫ۢۘۘ۫۟ۚۜ۠ۜۚۢۖۢۤ۠ۜ۬"
        L_0x01ca:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -769409707: goto L_0x01d3;
                case 783236196: goto L_0x01d9;
                case 1136552042: goto L_0x01ee;
                case 1716335541: goto L_0x01e4;
                default: goto L_0x01d2;
            }
        L_0x01d2:
            goto L_0x01ca
        L_0x01d3:
            java.lang.String r0 = "ۛۥۘۘ۬۟۫ۘۥۜۘۘ۬۬ۛۚۡۘ"
            goto L_0x01ca
        L_0x01d6:
            java.lang.String r0 = "ۡۤۜۦۛۧۜ۟۠ۚ۟ۨۘ۟۬ۖۘ"
            goto L_0x01ca
        L_0x01d9:
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01d6
            java.lang.String r0 = "ۤ۠ۖۘۜۖۤۗۜۘ۬ۦۚۚ۠ۜ۬ۨۘۖ"
            goto L_0x01ca
        L_0x01e4:
            java.lang.String r0 = com.obwhatsapp.yo.p0.textStatus
            com.obwhatsapp.yo.tf.b(r0)
            java.lang.String r0 = ""
            com.obwhatsapp.yo.p0.textStatus = r0
            goto L_0x018a
        L_0x01ee:
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r0 = "yoCopy"
            goto L_0x0187
        L_0x01f5:
            java.lang.Class<com.obwhatsapp.yo.p0> r0 = com.obwhatsapp.yo.p0.class
            monitor-enter(r0)
            java.lang.String r4 = com.obwhatsapp.yo.p0.c()     // Catch:{ Exception -> 0x027f }
            r5 = 1621764813(0x60aa2acd, float:9.809471E19)
            java.lang.String r0 = "ۤ۫ۥۘۛۘ۬ۗۡۥۧۦۙ۠ۚۦۘۘۚۢۥۤ۟ۦ۫ۚ"
        L_0x0201:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x027f }
            r6 = r6 ^ r5
            switch(r6) {
                case -2103156424: goto L_0x024b;
                case -1846957863: goto L_0x0250;
                case -1440667823: goto L_0x0279;
                case -1317865321: goto L_0x020a;
                default: goto L_0x0209;
            }     // Catch:{ Exception -> 0x027f }
        L_0x0209:
            goto L_0x0201
        L_0x020a:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x027f }
            r5.<init>(r4)     // Catch:{ Exception -> 0x027f }
            r6 = -571270665(0xffffffffddf319f7, float:-2.18966298E18)
            java.lang.String r0 = "ۖۦۛۜۦۘ۠ۢۗۖۧۘۦۤۢۛۦۖۨۙۙۘۖۖۘ"
        L_0x0214:
            int r7 = r0.hashCode()     // Catch:{ Exception -> 0x027f }
            r7 = r7 ^ r6
            switch(r7) {
                case -2143091408: goto L_0x021d;
                case -1271661877: goto L_0x025f;
                case -1222490309: goto L_0x0256;
                case -1076775787: goto L_0x0262;
                default: goto L_0x021c;
            }     // Catch:{ Exception -> 0x027f }
        L_0x021c:
            goto L_0x0214
        L_0x021d:
            java.io.File r0 = com.obwhatsapp.yo.p0.f843b     // Catch:{ Exception -> 0x027f }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x027f }
            com.obwhatsapp.youbasha.task.utils.copyFile(r0, r4)     // Catch:{ Exception -> 0x027f }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x027f }
            r0.<init>(r4)     // Catch:{ Exception -> 0x027f }
            com.obwhatsapp.youbasha.task.utils.forceScanMediaFile(r0)     // Catch:{ Exception -> 0x027f }
            java.lang.Class<com.obwhatsapp.yo.p0> r0 = com.obwhatsapp.yo.p0.class
            monitor-exit(r0)
            r0 = r1
        L_0x0232:
            r4 = -944693999(0xffffffffc7b11d11, float:-90682.13)
            java.lang.String r1 = "ۨۙۡۧۜۨۘۘۥۙۤۛۨۘۙۙۜۧ۠ۖۚۥ"
        L_0x0237:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1309118076: goto L_0x018a;
                case -588221221: goto L_0x02a7;
                case -540058658: goto L_0x02ac;
                case -212976094: goto L_0x0240;
                default: goto L_0x023f;
            }
        L_0x023f:
            goto L_0x0237
        L_0x0240:
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r0 = "photo_saved_to_gallery"
            goto L_0x0187
        L_0x0248:
            java.lang.String r0 = "ۦۥۦ۫ۢ۫ۛ۟ۨۘۘ۬۬ۖۛۥۘۗۙۦۜۚۡ۬ۨۦ"
            goto L_0x0201
        L_0x024b:
            if (r4 == 0) goto L_0x0248
            java.lang.String r0 = "ۨ۠ۖۘۦۘۘۦۥۖۘۗۢۥۘ۟ۗ۫ۜ"
            goto L_0x0201
        L_0x0250:
            java.lang.String r0 = "ۙۜۦۛۗ۫۠۬ۦۘ۟ۦۢ۬ۖ۠۬ۛۖۥ۟ۖ"
            goto L_0x0201
        L_0x0253:
            java.lang.String r0 = "ۗۜۦۘۡۙۧۤۗۤۗۦۨ۠ۦۖۥۘۘۤۤۗۥ۠ۤ"
            goto L_0x0214
        L_0x0256:
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x027f }
            if (r0 == 0) goto L_0x0253
            java.lang.String r0 = "ۙ۟ۦ۬ۨۖ۬۬ۗۗ۟ۦۘۜۤۚۛ۠ۜۘ"
            goto L_0x0214
        L_0x025f:
            java.lang.String r0 = "ۦۙۥۙۚۢ۠ۨۘۜۤ۬۠ۥۥۢۛۙۘۛۤۥۤ۟"
            goto L_0x0214
        L_0x0262:
            android.content.Context r0 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x027f }
            java.lang.String r1 = "already_saved"
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)     // Catch:{ Exception -> 0x027f }
            r4 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r4)     // Catch:{ Exception -> 0x027f }
            r0.show()     // Catch:{ Exception -> 0x027f }
        L_0x0274:
            java.lang.Class<com.obwhatsapp.yo.p0> r0 = com.obwhatsapp.yo.p0.class
            monitor-exit(r0)
            r0 = r2
            goto L_0x0232
        L_0x0279:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x027f }
            r0.<init>()     // Catch:{ Exception -> 0x027f }
            throw r0     // Catch:{ Exception -> 0x027f }
        L_0x027f:
            r0 = move-exception
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ all -> 0x029f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x029f }
            java.lang.String r5 = "Error accessing file: "
            r4.<init>(r5)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x029f }
            r4.append(r0)     // Catch:{ all -> 0x029f }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x029f }
            r4 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r4)     // Catch:{ all -> 0x029f }
            r0.show()     // Catch:{ all -> 0x029f }
            goto L_0x0274
        L_0x029f:
            r0 = move-exception
            java.lang.Class<com.obwhatsapp.yo.p0> r1 = com.obwhatsapp.yo.p0.class
            monitor-exit(r1)
            throw r0
        L_0x02a4:
            java.lang.String r1 = "۬ۛۨۢۚۘۖ۠ۨۘۡۙۨ۠ۖۡۧ۫ۦ۟ۛۖۖ۠ۡۘ"
            goto L_0x0237
        L_0x02a7:
            if (r0 == 0) goto L_0x02a4
            java.lang.String r1 = "ۢ۬ۤۙۤۜۘۗۘۖۘ۟ۦۛۨ۬ۥۘۥۧۘ"
            goto L_0x0237
        L_0x02ac:
            java.lang.String r1 = "ۚۗۖۘۢۤ۟ۤۚۨۘۤۤۨۘۚۢۨ۟ۧۖۘۜۗۖۘ"
            goto L_0x0237
        L_0x02af:
            boolean r2 = com.obwhatsapp.yo.yo.isNightModeActive()
            r3 = -633049033(0xffffffffda447037, float:-1.38231192E16)
            java.lang.String r0 = "ۖۥۨۘۘۙۘۘۢۦۗۡ۬۬ۢۡۘۘۢۜۧ"
        L_0x02b8:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1726758063: goto L_0x02f6;
                case -1685663785: goto L_0x02f1;
                case -992981168: goto L_0x02f9;
                case 1197945486: goto L_0x02c1;
                default: goto L_0x02c0;
            }
        L_0x02c0:
            goto L_0x02b8
        L_0x02c1:
            android.content.SharedPreferences$Editor r0 = com.obwhatsapp.yo.shp.stockLightPrefs
            java.lang.String r3 = "night_mode"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)
            r0.commit()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = com.obwhatsapp.yo.yo.datafolder
            r3.append(r0)
            java.lang.String r0 = "files/"
            r3.append(r0)
            java.lang.String r1 = "night"
            r4 = -1462324475(0xffffffffa8d6b305, float:-2.383641E-14)
            java.lang.String r0 = "ۨ۫ۨۜۘۦۘ۟ۘۦۖۘۦۡۘۨۢۤۘۧۛ"
        L_0x02e2:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2041241661: goto L_0x032b;
                case 605463646: goto L_0x0303;
                case 974658815: goto L_0x02eb;
                case 2086865382: goto L_0x02fe;
                default: goto L_0x02ea;
            }
        L_0x02ea:
            goto L_0x02e2
        L_0x02eb:
            java.lang.String r0 = "ۙ۟ۛۘۚۦۜۘۛ۫ۘۗۜۘۢۜۛۦ"
            goto L_0x02e2
        L_0x02ee:
            java.lang.String r0 = "ۖۜۥ۠ۥۜۗۖۥۘ۫۫ۙۡۖۙۜۤۥۙۘۦۘۜۢۥ۠ۡ"
            goto L_0x02b8
        L_0x02f1:
            if (r2 == 0) goto L_0x02ee
            java.lang.String r0 = "ۜۢۜۧۥۧۘۖۨۡ۠۬ۛۘ۟۫ۡۧۨ۠ۘۡ"
            goto L_0x02b8
        L_0x02f6:
            java.lang.String r0 = "ۢۙۚۧۛۜۘۚۜ۫ۢۗۢۖۘۨۚۤ"
            goto L_0x02b8
        L_0x02f9:
            r1 = 2
            goto L_0x02c1
        L_0x02fb:
            java.lang.String r0 = "ۥۥۜۘۤۦ۫ۘۤۢۛۛۜۘۜ۟۫ۖۧۤۘۙۗ"
            goto L_0x02e2
        L_0x02fe:
            if (r2 == 0) goto L_0x02fb
            java.lang.String r0 = "ۤۙۢۦ۫ۘۡۚ۫ۘۧۡۘۦۢۖۖۚۜۘۡۘۥۘۨۤۨۘۖۖۘ"
            goto L_0x02e2
        L_0x0303:
            java.lang.String r0 = "night"
        L_0x0305:
            java.lang.String r4 = "_bak"
            java.lang.String r3 = a.a.f(r3, r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = com.obwhatsapp.yo.yo.datafolder
            r4.append(r0)
            java.lang.String r0 = "files/"
            r4.append(r0)
            r5 = 1489887324(0x58cde05c, float:1.810908E15)
            java.lang.String r0 = "۫ۛۦ۠ۤۛۚۖۚۚۤۛ۠۫ۘۚۙۙۡۨۦ۫ۛۥۘ"
        L_0x031f:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -2141313709: goto L_0x046f;
                case -684973603: goto L_0x0331;
                case -221448365: goto L_0x0328;
                case 788602414: goto L_0x0336;
                default: goto L_0x0327;
            }
        L_0x0327:
            goto L_0x031f
        L_0x0328:
            java.lang.String r0 = "ۚۧ۟۠ۢۜ۬ۦۥ۫ۗۙۧۨۙۗۚۜۘ۫ۦۚ"
            goto L_0x031f
        L_0x032b:
            java.lang.String r0 = "light"
            goto L_0x0305
        L_0x032e:
            java.lang.String r0 = "۟ۜۚۜۜۦۘ۠ۗ۬ۜۜۖ۫ۢۗۢۥۢ"
            goto L_0x031f
        L_0x0331:
            if (r2 == 0) goto L_0x032e
            java.lang.String r0 = "۫ۡۡۡ۟ۘۤ۫ۦۘۥۧۜۙۗ۟"
            goto L_0x031f
        L_0x0336:
            java.lang.String r0 = "light"
        L_0x0338:
            java.lang.String r1 = "_bak"
            java.lang.String r0 = a.a.f(r4, r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".xml"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            com.obwhatsapp.youbasha.task.utils.saveTheme(r3)
            r3 = -643817065(0xffffffffd9a02197, float:-5.6341161E15)
            java.lang.String r0 = "ۖ۠۫ۥۢۙۢۘۖ۟ۦۘۤۤۥۥۡۘ"
        L_0x035c:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1175650104: goto L_0x0365;
                case -207225079: goto L_0x037d;
                case 1022135450: goto L_0x0380;
                case 1273704148: goto L_0x0374;
                default: goto L_0x0364;
            }
        L_0x0364:
            goto L_0x035c
        L_0x0365:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            com.obwhatsapp.youbasha.task.utils.restoreTheme(r0, r1)
        L_0x036a:
            X.2pj r0 = r8.f881b
            r0.create()
            goto L_0x004f
        L_0x0371:
            java.lang.String r0 = "۬ۥۥۘۢۨۨۘۚۛۗۦۨۜۧۖۖۘۘ۬ۦۥۥۨۗۗۗ۟ۢ"
            goto L_0x035c
        L_0x0374:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0371
            java.lang.String r0 = "۠۟ۖۦۡۛۤۥۤ۟۬ۘۢ۠ۜ۟ۜۨ"
            goto L_0x035c
        L_0x037d:
            java.lang.String r0 = "۟ۛۥۦۢۘۨۤۗۦۘۚۢ۫۠ۛ۟ۢۧۖۘۨ۠ۙ"
            goto L_0x035c
        L_0x0380:
            java.lang.String r0 = com.obwhatsapp.yo.HomeUI.getUIHomeStyle()
            com.obwhatsapp.youbasha.task.utils.resetMod()
            java.lang.String r1 = "ui_home_styleV3"
            com.obwhatsapp.yo.shp.putString(r1, r0)
            com.obwhatsapp.yo.yo.rebootYo()
            goto L_0x036a
        L_0x0390:
            X.2pj r0 = r8.f881b
            r0.dismiss()
            goto L_0x004f
        L_0x0397:
            java.lang.String r0 = "yo_airplanemode"
            boolean r1 = com.obwhatsapp.yo.yo.getAirplaneMode()
            r1 = r1 ^ 1
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r1)
            com.obwhatsapp.yo.yo.rebootYo()
            X.2pj r0 = r8.f881b
            r0.create()
            goto L_0x004f
        L_0x03ac:
            X.2pj r0 = r8.f881b
            r0.dismiss()
            goto L_0x004f
        L_0x03b3:
            int r0 = com.obwhatsapp.yo.Conversation.f512a
            X.2pj r0 = r8.f881b
            r0.dismiss()
            goto L_0x004f
        L_0x03bc:
            java.lang.String r0 = "ۖۦۧۛۦۘۘ۟۟ۛۙ۠ۡۘۧۗۘ۫ۛۡۧ۫"
            goto L_0x0010
        L_0x03c0:
            if (r3 == 0) goto L_0x03bc
            java.lang.String r0 = "۫ۡۘۘۜۤۗۤۨۘۥ۟ۥۖۦۡۦۡۙۨۚۛ"
            goto L_0x0010
        L_0x03c6:
            java.lang.String r0 = "ۥ۫ۧۥ۟ۛ۠۟ۜۚۡۦۘۚۢ۫۠ۗۦۧ۫"
            goto L_0x0010
        L_0x03ca:
            java.lang.String r0 = "ۥۚ۬ۗۥۜۚۧۦۘۤۚ۠ۖ۫ۘۥۨ۠ۘ۟ۡ۫ۡۤۨۢ"
            goto L_0x001e
        L_0x03ce:
            if (r3 == r1) goto L_0x03ca
            java.lang.String r0 = "۟۬ۚۦۦۗۧۚۤۖۤۥ۟ۘ۠ۜۡۢۦ۟"
            goto L_0x001e
        L_0x03d4:
            java.lang.String r0 = "ۜۖۡۘۖۚۨ۬ۘۘۥۢۧۤ۫ۦۘۚۥۥۘ۟۬ۦۧۦۜۦۥۧۘ"
            goto L_0x001e
        L_0x03d8:
            java.lang.String r0 = "ۖۘۨۘۗۦۧۘ۫۫۬ۢۦۡۥ۫ۖۚۖۥ۫۠ۜۘۛۚ۟۫ۚۨۘ"
            goto L_0x002e
        L_0x03dc:
            if (r1 == 0) goto L_0x03d8
            java.lang.String r0 = "۬ۤۤ۫ۙۨۘۨۧۨۧۨۛۗۥ۟ۚۧۨ۫۬ۧ"
            goto L_0x002e
        L_0x03e2:
            java.lang.String r0 = "ۢۗۘ۟ۧ۬۠ۚ۫ۛۥۖۘۨ۠ۡۘۧۡۘۦۘۥ"
            goto L_0x002e
        L_0x03e6:
            java.lang.String r0 = "ۤۥۧۛۢۡ۟ۦۖ۬ۢۡۘۜ۟ۡۘ"
            goto L_0x003c
        L_0x03ea:
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0418 }
            if (r0 != 0) goto L_0x03e6
            java.lang.String r0 = "ۨۛۧۖۨۤۖۡۘۙ۟ۜۘۖ۟ۗۧ۟ۥۡۨۥۥۛۗۦۤ"
            goto L_0x003c
        L_0x03f6:
            java.lang.String r0 = "ۥ۬ۡۘۥ۫ۚۢۢۗۡۛۙۧۜ۠ۨۜۛۗۜۘ"
            goto L_0x003c
        L_0x03fa:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0418 }
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x0418 }
            java.lang.Class<com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity> r3 = com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity.class
            r0.<init>(r1, r3)     // Catch:{ Exception -> 0x0418 }
            java.lang.String r1 = "android.intent.extra.TEXT"
            java.lang.String r3 = com.obwhatsapp.yo.p0.textStatus     // Catch:{ Exception -> 0x0418 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0418 }
            java.lang.String r1 = "jid"
            java.lang.String r3 = "status@broadcast"
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0418 }
        L_0x0411:
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x0418 }
            r1.startActivity(r0)     // Catch:{ Exception -> 0x0418 }
            goto L_0x0045
        L_0x0418:
            r0 = move-exception
            java.lang.String r0 = "register_try_again_later"
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            a.a.i(r0, r1, r2)
            goto L_0x0045
        L_0x0424:
            r1 = 1197241514(0x475c74aa, float:56436.664)
            java.lang.String r0 = "ۜۚۢۥ۫۠۠ۨۨۘۨۧۜۢۚ۟۟ۤۖۘۦۘ۟ۦ۟ۜۘۛۡۨ"
        L_0x0429:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0418 }
            r3 = r3 ^ r1
            switch(r3) {
                case -1094820009: goto L_0x046c;
                case -637140491: goto L_0x0465;
                case -169329537: goto L_0x0432;
                case 1130733779: goto L_0x0045;
                default: goto L_0x0431;
            }     // Catch:{ Exception -> 0x0418 }
        L_0x0431:
            goto L_0x0429
        L_0x0432:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0418 }
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x0418 }
            java.lang.Class<com.obwhatsapp.mediacomposer.MediaComposerActivity> r3 = com.obwhatsapp.mediacomposer.MediaComposerActivity.class
            r0.<init>(r1, r3)     // Catch:{ Exception -> 0x0418 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0418 }
            java.io.File r3 = com.obwhatsapp.yo.p0.f843b     // Catch:{ Exception -> 0x0418 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0418 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0418 }
            com.obwhatsapp.HomeActivity r3 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x0418 }
            android.net.Uri r1 = X.AnonymousClass1XI.A01(r3, r1)     // Catch:{ Exception -> 0x0418 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0418 }
            r3.<init>()     // Catch:{ Exception -> 0x0418 }
            r3.add(r1)     // Catch:{ Exception -> 0x0418 }
            java.lang.String r1 = "android.intent.extra.STREAM"
            android.content.Intent r1 = r0.putParcelableArrayListExtra(r1, r3)     // Catch:{ Exception -> 0x0418 }
            java.lang.String r3 = "jid"
            java.lang.String r4 = "status@broadcast"
            r1.putExtra(r3, r4)     // Catch:{ Exception -> 0x0418 }
            goto L_0x0411
        L_0x0462:
            java.lang.String r0 = "ۦ۬ۥۘۦۤۦۘۙۜ۬۟۫ۨۥ۠ۙۢۨۧۘ"
            goto L_0x0429
        L_0x0465:
            java.io.File r0 = com.obwhatsapp.yo.p0.f843b     // Catch:{ Exception -> 0x0418 }
            if (r0 == 0) goto L_0x0462
            java.lang.String r0 = "ۗ۠۬ۡۚۦۛۗۢۙۖۖۧۧۜۚ۟ۜۘۗۦ۬"
            goto L_0x0429
        L_0x046c:
            java.lang.String r0 = "ۛۗۨ۟ۤۚۢۖۥۙۤۨۥۢۦۥۧ۫"
            goto L_0x0429
        L_0x046f:
            r0 = r1
            goto L_0x0338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.t.onClick(android.view.View):void");
    }
}
