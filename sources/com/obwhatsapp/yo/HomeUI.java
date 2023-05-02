package com.obwhatsapp.yo;

import X.C005402i;
import a.a;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.components.PhoneNumberEntry;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.views.FloatingActionButton;
import com.obwhatsapp.youbasha.ui.views.IGStatusesView;
import rc.whatsapp.home.HomeActivity.OnPageSelected;

public abstract class HomeUI {

    /* renamed from: a  reason: collision with root package name */
    public static OnPageSelected f541a;

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int BG_aux() {
        /*
            java.lang.String r0 = "۫ۥۜۘۗۥۧۦۛۚۚ۬ۡۜۧۡۘۨۜ۟۠ۘ۟ۨۡۚۚ۠ۛ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 172(0xac, float:2.41E-43)
            r3 = -822497881(0xffffffffcef9ada7, float:-2.09445363E9)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -646130316: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -7922560368065(0xfffff8cb629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getFabColorNormal()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.BG_aux():int");
    }

    public static int HomeStyle(int i2) {
        int i3 = 0;
        String str = "۟ۖۧۘ۟ۛۥۛۙۖۘۛ۬ۜۖۦۘۘۥۧۘۘ";
        StringBuilder sb = null;
        String str2 = null;
        while (true) {
            switch ((str.hashCode() ^ 203) ^ -57339031) {
                case -1966600044:
                case 1268213201:
                    return i2;
                case -1708581132:
                    sb = a.g(str2);
                    str = "ۗۨۦۘۡۦۗۨۥۦۘۢۧۡۘ۟ۘ۠";
                    break;
                case -1686006898:
                    String str3 = "ۨۢۗۦۖ۫ۙۜۛۛۡۘۥۖۨۘۖ۟ۖۘۨۜ۠ۤۘۡۘۛۜۖ";
                    while (true) {
                        switch (str3.hashCode() ^ -786211830) {
                            case -1380230680:
                                if (!Deobfuscator$app$Custom.getString(-5371349794241L).equals(str2)) {
                                    str3 = "ۢۧۤ۫ۧۖۘۨ۫ۖۚۙۛۘۨۘۜۨۨۧۦۙۛ۟ۤ";
                                    break;
                                } else {
                                    str3 = "ۗۘۛۙۡۜۤۨۜۡ۟ۨۗۨۥۘ";
                                    break;
                                }
                            case 272958858:
                                str = "۬ۜۘۛۚۜۘۛ۟ۡۘ۟۠ۥۘۛ۬ۚۧۙ۟";
                                continue;
                            case 1350502196:
                                str = "ۘۖۥۚ۬ۖۢ۠۠۫ۘۚ۫ۖۘۛۧۥ۬ۤ۟";
                                continue;
                            case 1526558938:
                                str3 = "ۗۜۢ۟ۡۨۛۥۘ۠ۖۧۘ۟ۥۦۘ۫ۛۢۜۗۨ۫ۗۨۘۘۛۜ";
                                break;
                        }
                    }
                    break;
                case -1289710291:
                    str = "ۧ۫ۖۘۘۙۧ۟ۨۛۙۛ۠۠ۜۜ۠ۢۨۗۘۙۖۦۧۘۢۥۖۘ";
                    str2 = shp.getPrefString(Deobfuscator$app$Custom.getString(-5298335350209L), Deobfuscator$app$Custom.getString(-5341285023169L));
                    break;
                case -912749285:
                    String str4 = "۫ۧ۠ۢۧۘۤ۠۬۟ۦۖۘۖ۬۟";
                    while (true) {
                        switch (str4.hashCode() ^ 912989015) {
                            case -1944032359:
                                str4 = "ۛۨۦۘۜۦۙۨۙۜۘۦ۠۫ۤ۟۫ۙ۬ۨۘۨۦۧۘ";
                                break;
                            case -1529460376:
                                if (i3 > 0) {
                                    str4 = "۫ۥۖۘۘ۬ۚۦۨۚ۟ۚ۬۠۫ۦۘۜۙۨۘۧۥۤ";
                                    break;
                                } else {
                                    str4 = "ۙۤۥۘۗۦۖۨۨۢ۬ۚۚۥۛۗ";
                                    break;
                                }
                            case -1010766994:
                                str = "ۖۛ۬ۢۗۦ۠ۨۥۘۚۚۨ۬۫ۢۛۤۧۘۡ۬ۤۨۨ";
                                continue;
                            case -314673159:
                                str = "ۛۘۨۨۦۛ۫ۛۨۚۚ۠ۧۘۗ۬ۚۜۘ";
                                continue;
                        }
                    }
                    break;
                case -610946114:
                    str = "ۢ۠ۗۜۜۜۡۢۗۥۤۘۙۛۗ";
                    break;
                case 586979439:
                    sb.append(Deobfuscator$app$Custom.getString(-5401414565313L));
                    str = "۟ۛۢۤۥۖۘ۬ۚۧۚۘۘۥۡۘۨۦۡۘۜۜۡۘۗ۟۫";
                    break;
                case 1321903325:
                    return i3;
                case 1420362951:
                    i3 = yo.getID(sb.toString(), Deobfuscator$app$Custom.getString(-5483018943937L));
                    str = "ۦۢ۠ۤۥۧۖۡۡۙۚ۬ۗۧۤۖ۬۬";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean IGStoriesEnabled() {
        /*
            java.lang.String r0 = "ۢۗۡۢۙۡۘۖۛۜۘۤۨ۟۟ۢۤۘ۟ۙ۬ۙۢۗۛۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 287(0x11f, float:4.02E-43)
            r3 = -402625517(0xffffffffe8006c13, float:-2.425826E24)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -2074693565: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -4864543653313(0xfffffb93629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r1 = 0
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.IGStoriesEnabled():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ae, code lost:
        r2 = "ۘۤۡۘۚۘۥۘ۬ۙۧ۬ۘۧۜۥۧۜۚۖ۠ۨۦۘۧ۬ۡ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int NewOldUI(int r48) {
        /*
            r43 = 0
            r42 = 0
            r40 = 0
            r39 = 0
            r38 = 0
            r37 = 0
            r36 = 0
            r41 = 0
            r25 = 0
            r34 = 0
            r30 = 0
            r32 = 0
            r24 = 0
            r28 = 0
            r22 = 0
            r20 = 0
            r16 = 0
            r18 = 0
            r13 = 0
            r14 = 0
            r12 = 0
            r10 = 0
            r6 = 0
            r8 = 0
            r3 = 0
            r4 = 0
            r23 = 0
            r26 = 0
            java.lang.String r2 = "ۥۧۨۥۥۨۘ۟ۖۦ۠ۛۤۛۗۦۛۦۨۘۢۗ۠۬ۜۦۘ"
        L_0x0037:
            int r44 = r2.hashCode()
            r45 = 384(0x180, float:5.38E-43)
            r46 = -1404861859(0xffffffffac43825d, float:-2.7783533E-12)
            r44 = r44 ^ r45
            r44 = r44 ^ r46
            switch(r44) {
                case -1906105825: goto L_0x03b6;
                case -1900286406: goto L_0x03ca;
                case -1841932680: goto L_0x008d;
                case -1841013903: goto L_0x02e6;
                case -1821611082: goto L_0x0181;
                case -1748497411: goto L_0x03d2;
                case -1743765252: goto L_0x0304;
                case -1710165842: goto L_0x0175;
                case -1686484147: goto L_0x01e5;
                case -1650114991: goto L_0x019f;
                case -1576622213: goto L_0x0252;
                case -1565527341: goto L_0x0329;
                case -1539598121: goto L_0x0376;
                case -1491736094: goto L_0x024c;
                case -1483644668: goto L_0x02f3;
                case -1356420320: goto L_0x0366;
                case -1332723364: goto L_0x0276;
                case -1182978659: goto L_0x0092;
                case -1165972162: goto L_0x02d1;
                case -1121071090: goto L_0x03b6;
                case -1101870694: goto L_0x017b;
                case -1075846962: goto L_0x0310;
                case -1023821961: goto L_0x028b;
                case -984584846: goto L_0x00fd;
                case -813893937: goto L_0x027f;
                case -784361570: goto L_0x0136;
                case -768995268: goto L_0x03b2;
                case -711107426: goto L_0x0088;
                case -679940900: goto L_0x02a6;
                case -645303728: goto L_0x0261;
                case -577753142: goto L_0x03b6;
                case -573531049: goto L_0x02c8;
                case -559723584: goto L_0x0103;
                case -458925053: goto L_0x03b6;
                case -422190334: goto L_0x00ca;
                case -335294622: goto L_0x0169;
                case -320910835: goto L_0x0130;
                case -265132720: goto L_0x0319;
                case -245147866: goto L_0x036b;
                case 76872702: goto L_0x0206;
                case 192471221: goto L_0x03ce;
                case 199947994: goto L_0x02fb;
                case 213619832: goto L_0x00f7;
                case 240140618: goto L_0x00be;
                case 286674726: goto L_0x02d7;
                case 294815465: goto L_0x020f;
                case 364596484: goto L_0x030a;
                case 399383285: goto L_0x025b;
                case 445969899: goto L_0x0243;
                case 632398010: goto L_0x0294;
                case 716728350: goto L_0x0285;
                case 808449765: goto L_0x0048;
                case 950844570: goto L_0x026e;
                case 1079468763: goto L_0x0221;
                case 1125677690: goto L_0x0358;
                case 1146784694: goto L_0x037e;
                case 1209744623: goto L_0x02e0;
                case 1212447266: goto L_0x013c;
                case 1215391568: goto L_0x005c;
                case 1241799043: goto L_0x00c4;
                case 1248177810: goto L_0x034f;
                case 1329918233: goto L_0x03be;
                case 1416599015: goto L_0x004b;
                case 1741195042: goto L_0x03b6;
                case 1774950128: goto L_0x035d;
                case 1850846521: goto L_0x0387;
                case 1876183724: goto L_0x01c4;
                case 1880379997: goto L_0x03d2;
                case 1936445175: goto L_0x038d;
                case 2005993653: goto L_0x016f;
                case 2058067426: goto L_0x0052;
                case 2069283810: goto L_0x0393;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x0037
        L_0x0048:
            java.lang.String r2 = "۬ۦ۟ۦ۫ۘ۫ۙۥۘۙۗۖ۟ۙ۬ۤۧۦ"
            goto L_0x0037
        L_0x004b:
            java.lang.String r43 = getUIHomeStyle()
            java.lang.String r2 = "۫ۨۥۖۙۖۛ۟ۢ۟ۥۙۖۨۦۘۢۜۜۘۡۥۘۨۘۖۘۖۧۜ"
            goto L_0x0037
        L_0x0052:
            int r2 = r43.hashCode()
            switch(r2) {
                case -1378241396: goto L_0x03ae;
                case 104461: goto L_0x03aa;
                case 110182: goto L_0x03a6;
                case 93508654: goto L_0x03a2;
                case 109770518: goto L_0x039e;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.String r2 = "ۢۦۨۘ۬ۘۘۘۛ۬۫ۧۢ۫ۙۥ۠ۨۛۘۦۢ۟ۚۤ۫ۦۘۘ"
            goto L_0x0037
        L_0x005c:
            r44 = 155967810(0x94be142, float:2.4541152E-33)
            java.lang.String r2 = "ۧۛۥۖ۠۠۠ۗۤۥۚۜۢ۟ۘۥۖۦ"
        L_0x0061:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -2001845515: goto L_0x0082;
                case -350292522: goto L_0x0085;
                case 1730434709: goto L_0x03b2;
                case 1789106491: goto L_0x006b;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x0061
        L_0x006b:
            r46 = -4563895942593(0xfffffbd9629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r46)
            r0 = r43
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x007f
            java.lang.String r2 = "ۤۗۡۘ۠۫ۛۚۙۖۧۖۘ۫۫ۛۢۘ۟ۨ۫۠"
            goto L_0x0061
        L_0x007f:
            java.lang.String r2 = "ۡ۫ۡ۫۬ۚۜۥۧۘۖ۫۬۠ۦۘ"
            goto L_0x0061
        L_0x0082:
            java.lang.String r2 = "۫ۢۖۘۨۘۖۛۜۖۘۜۡۖۘۦۡۖۘ"
            goto L_0x0061
        L_0x0085:
            java.lang.String r2 = "۠ۙۨۘ۟ۛۨۘۘ۟ۛۦ۫ۘۘۛ۫ۨۢۥۨۧۘۧۘ۠۫ۡ"
            goto L_0x0037
        L_0x0088:
            r42 = 3
            java.lang.String r2 = "ۜ۬ۡۘۥۨ۬ۖۤ۫ۜۥۡۘۧۦ۬۠ۥۚۚۢۧ۟ۖۘ"
            goto L_0x0037
        L_0x008d:
            java.lang.String r2 = "ۢۧ۟ۜۤ۬۬ۗ۬ۡۙۖۘۦۜۡۘ"
            r41 = r42
            goto L_0x0037
        L_0x0092:
            r44 = 7572443(0x738bdb, float:1.0611253E-38)
            java.lang.String r2 = "ۘۦۥۖۡۗۚۛۛۨۧ۠۬ۛۜۘ"
        L_0x0097:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -1626818280: goto L_0x00a1;
                case -765996708: goto L_0x00bb;
                case 242913551: goto L_0x03b2;
                case 2065261692: goto L_0x00a7;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            goto L_0x0097
        L_0x00a1:
            java.lang.String r2 = "۟ۖۖۘ۫ۗۖۘۜۜۘۜۜۥۘۨ۬ۦۥۨۛۚۦۚۘۖ۠۟ۥ۫"
            goto L_0x0037
        L_0x00a4:
            java.lang.String r2 = "ۨۧۨۘ۠ۦۘۙ۫ۨۘ۟ۧۗۦ۠ۨۘ"
            goto L_0x0097
        L_0x00a7:
            r46 = -4538126138817(0xfffffbdf629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r46)
            r0 = r43
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00a4
            java.lang.String r2 = "ۡۘۡ۬ۥۖ۬۫۫۬ۦ۫ۧۤۖۤۛۥۘۜۦۦۘۦ۬ۖۚۖۖۘ"
            goto L_0x0097
        L_0x00bb:
            java.lang.String r2 = "ۧ۫ۘۗۢ۠ۤ۠ۖۨ۬۟ۗۦۦۘ"
            goto L_0x0097
        L_0x00be:
            r40 = 2
            java.lang.String r2 = "۫ۙ۟ۘۤۨۦۨۘۗ۬ۥۖۥۧۘۚۜۡۘ"
            goto L_0x0037
        L_0x00c4:
            java.lang.String r2 = "ۧۗۘۘ۟ۤۘۘۖۙۘۧ۫ۗۤۖۚۛۨۘ۟ۘ۠ۛۢۗ"
            r41 = r40
            goto L_0x0037
        L_0x00ca:
            r44 = 215610537(0xcd9f4a9, float:3.3581393E-31)
            java.lang.String r2 = "۠ۙۦۘۛ۬ۦۖۙۜۦۨۘۜۚۙۘ۫۠"
        L_0x00cf:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -592590315: goto L_0x00d9;
                case 406312692: goto L_0x03b2;
                case 441093427: goto L_0x00f3;
                case 723567184: goto L_0x00df;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            goto L_0x00cf
        L_0x00d9:
            java.lang.String r2 = "ۥۢ۫ۨۘۘۖۙۘۚۚۗۨۨۖ"
            goto L_0x00cf
        L_0x00dc:
            java.lang.String r2 = "ۜ۟ۥ۟ۨۘ۠ۘ۫ۢ۟ۥۘ۬ۨۗۜ۠۬ۨۡۗۜۨۨۘۤۨۘ"
            goto L_0x00cf
        L_0x00df:
            r46 = -4589665746369(0xfffffbd3629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r46)
            r0 = r43
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00dc
            java.lang.String r2 = "ۢ۬ۥۘۨۤۙۡۧۧۥۗۦۘۛۤۗۥۨۧۖۜۥۡۨۧۘ"
            goto L_0x00cf
        L_0x00f3:
            java.lang.String r2 = "۫ۖ۬ۥ۫۬ۡ۫ۚۚۡۨۧۡۡۡۦ۬ۦۢۚۚۗ"
            goto L_0x0037
        L_0x00f7:
            r39 = 4
            java.lang.String r2 = "۟ۖۜ۫ۡۦۘۢۜۡ۬۫ۦ۫۫ۤ۬۠ۘۗۧۜۘ۠۠ۖۤ۟ۧ"
            goto L_0x0037
        L_0x00fd:
            java.lang.String r2 = "ۛۚۚ۬ۧۥۘۛۘۢ۟ۚۧ۠ۧۧۧۗۚ۟ۖۤ"
            r41 = r39
            goto L_0x0037
        L_0x0103:
            r44 = -1499052031(0xffffffffa6a64801, float:-1.1538081E-15)
            java.lang.String r2 = "ۤۤۨ۟ۚۧ۠ۨۢۡۥۧۥۡۨ"
        L_0x0108:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -2030290329: goto L_0x03b2;
                case -1143678040: goto L_0x0129;
                case 1139528092: goto L_0x012c;
                case 1318419838: goto L_0x0112;
                default: goto L_0x0111;
            }
        L_0x0111:
            goto L_0x0108
        L_0x0112:
            r46 = -4490881498561(0xfffffbea629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r46)
            r0 = r43
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0126
            java.lang.String r2 = "ۥۙۗۨۙۖۨ۟ۦۡۨ۬ۛ۟ۚۢۡۙۗۤۨۦ۠ۨۘ"
            goto L_0x0108
        L_0x0126:
            java.lang.String r2 = "۟ۗۘۘۥۡۨۘۤ۟ۥۘۨۤۜۘۖۢ۫ۦ۬ۨۘۖۡۨۘ"
            goto L_0x0108
        L_0x0129:
            java.lang.String r2 = "ۖۚۗۦ۫ۧۚۤۥۘۜۖ۠۫ۦ۟۬۟"
            goto L_0x0108
        L_0x012c:
            java.lang.String r2 = "ۢۧۜۚ۫ۖۘۛۢۡۘۦۖۧ۫ۥۡۘۜۜۖ۬ۡۖۤ۟ۥۨۙ"
            goto L_0x0037
        L_0x0130:
            r38 = 0
            java.lang.String r2 = "ۢۗۘۘۚۛۛۚۘۧۧۥۧۧۧۨ"
            goto L_0x0037
        L_0x0136:
            java.lang.String r2 = "۠۟ۦۘۚ۟ۗۖۚۡۘۥۧ۠ۘۜۘۘ۟ۦۤ"
            r41 = r38
            goto L_0x0037
        L_0x013c:
            r44 = 406573015(0x183bcfd7, float:2.4274116E-24)
            java.lang.String r2 = "ۧۛۦ۬ۗۚۥۧۙۘ۠ۜۘۡۤ۬ۦۚۖ"
        L_0x0141:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -1359053952: goto L_0x0165;
                case -631490621: goto L_0x03b2;
                case 50745824: goto L_0x014b;
                case 2099355038: goto L_0x0162;
                default: goto L_0x014a;
            }
        L_0x014a:
            goto L_0x0141
        L_0x014b:
            r46 = -4508061367745(0xfffffbe6629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r46)
            r0 = r43
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x015f
            java.lang.String r2 = "ۛ۬ۖۘۨۚۜۘۗ۬ۙۚۛۡۧۥۙۖۖۢ۠ۘۥ"
            goto L_0x0141
        L_0x015f:
            java.lang.String r2 = "ۚۦۥۤۤۡ۬ۗۘۘۚۦۛ۬۠ۨۘۨ۫ۜۘۖ۫ۘۘ"
            goto L_0x0141
        L_0x0162:
            java.lang.String r2 = "ۡۦۥۘ۬ۛ۬۬ۜۤۥۢۨۘۗۚۜۤۘۜۘۚۡۜۤۦۡ"
            goto L_0x0141
        L_0x0165:
            java.lang.String r2 = "ۙۢ۠۬ۙۦۤ۬ۘۜۗۥۜۧۦ۬ۚۜۦ۬ۗۧۧۡ"
            goto L_0x0037
        L_0x0169:
            r37 = 1
            java.lang.String r2 = "ۦۙۥۘۛۖۧۡۘ۫ۥۘۡ۫ۨۧۘۨۤ۫۬ۧۢۢۖۢ"
            goto L_0x0037
        L_0x016f:
            java.lang.String r2 = "ۘۚۙۡ۟ۛۚۧۜۡۧۦۘۡ۫ۘۘۦۘۨ۠۟۬"
            r41 = r37
            goto L_0x0037
        L_0x0175:
            r36 = -1
            java.lang.String r2 = "ۢۚۦۦ۠ۜۗۗۖۘۘۨۢۜۨۥۗۜۘ۬ۡۜۘ"
            goto L_0x0037
        L_0x017b:
            java.lang.String r2 = "ۥۡۚ۟۬ۦۘۚۛۨۘۨۙۡۛۚ۬"
            r41 = r36
            goto L_0x0037
        L_0x0181:
            r44 = 753731396(0x2ced0744, float:6.7367518E-12)
            java.lang.String r2 = "ۚ۠ۗۥ۟۟ۤ۠ۨۧۖ۠۠۫ۜ"
        L_0x0186:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -1477712720: goto L_0x01ae;
                case -1138807026: goto L_0x019b;
                case -129139396: goto L_0x0190;
                case -13518158: goto L_0x0198;
                default: goto L_0x018f;
            }
        L_0x018f:
            goto L_0x0186
        L_0x0190:
            if (r41 == 0) goto L_0x0195
            java.lang.String r2 = "۠ۥۡۘۤ۬ۜۜۗۢۨ۠ۨۨۗۖۘۢ۫ۥۘۜۚۡ۫ۜۜ"
            goto L_0x0186
        L_0x0195:
            java.lang.String r2 = "ۜۛۘۘۡۡۧ۠ۚ۠۟ۛ۫۟ۖۜ"
            goto L_0x0186
        L_0x0198:
            java.lang.String r2 = "۟ۜۘۘۖۘۢۗۧۖۘ۟ۖۗۙۤۖۘۢۤۤ"
            goto L_0x0186
        L_0x019b:
            java.lang.String r2 = "ۧۢۖۘۥۥۦۘۛۛۦۘۧۜۜۦ۫ۥۘۙۧ"
            goto L_0x0037
        L_0x019f:
            r44 = -1295765943(0xffffffffb2c42e49, float:-2.2838451E-8)
            java.lang.String r2 = "ۤۚۚۖۧۙۗۤۡۗۜۘۥۢۨۘۜۚۨ"
        L_0x01a4:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -541164102: goto L_0x01c0;
                case -11188692: goto L_0x01bd;
                case 487360166: goto L_0x01ae;
                case 1650814995: goto L_0x01b5;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            goto L_0x01a4
        L_0x01ae:
            java.lang.String r2 = "ۘۤۡۘۚۘۥۘ۬ۙۧ۬ۘۧۜۥۧۜۚۖ۠ۨۦۘۧ۬ۡ"
            goto L_0x0037
        L_0x01b2:
            java.lang.String r2 = "ۢۖۨ۫۫ۛۧۛۛۨۙۡۘ۫۠ۦۘ"
            goto L_0x01a4
        L_0x01b5:
            r2 = 1
            r0 = r41
            if (r0 == r2) goto L_0x01b2
            java.lang.String r2 = "ۖۡۖ۠ۖۨۨۚۨۢۤۡۘۦ۬ۥۘۧ۬۫"
            goto L_0x01a4
        L_0x01bd:
            java.lang.String r2 = "ۗۥۧۘۨۘۦۘۙۥۤ۠ۖ۫۠ۨۤۙۡۙ"
            goto L_0x01a4
        L_0x01c0:
            java.lang.String r2 = "ۚ۠ۥۘۘۤۥۘۧ۠ۖۘۜۚۘۡۙ۠ۢۖۖۘۚۘۦۘ۟ۡۚ"
            goto L_0x0037
        L_0x01c4:
            r44 = -732905808(0xffffffffd450beb0, float:-3.58620961E12)
            java.lang.String r2 = "۠ۥۧ۟ۙۡۘ۠ۨۦۢۨۨۡۖۡۘۡۤ"
        L_0x01c9:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -2040043434: goto L_0x01de;
                case -308396807: goto L_0x01ae;
                case 78423088: goto L_0x01e1;
                case 699927030: goto L_0x01d3;
                default: goto L_0x01d2;
            }
        L_0x01d2:
            goto L_0x01c9
        L_0x01d3:
            r2 = 2
            r0 = r41
            if (r0 == r2) goto L_0x01db
            java.lang.String r2 = "ۡ۬ۥۘۤۖۖۢۡ۫ۗۙۡ۫ۢۨۘ۬ۧۖۘۢۤ۟ۡۧ۬"
            goto L_0x01c9
        L_0x01db:
            java.lang.String r2 = "ۢۡۘ۠ۜۙۢۗۗۚ۬ۡۘۜ۫ۥۘ"
            goto L_0x01c9
        L_0x01de:
            java.lang.String r2 = "ۦۢۤۚۜۨۘ۬۬ۜۜۙ۬۠۠ۦۘۧۖۦۘ"
            goto L_0x01c9
        L_0x01e1:
            java.lang.String r2 = "۟ۡۡۚ۠ۖۘۜۘۥۘۧۘ۟۠ۘ"
            goto L_0x0037
        L_0x01e5:
            r44 = 1679491146(0x641b004a, float:1.1437065E22)
            java.lang.String r2 = "ۗۦۡۖۡۨۘۚۙ۠۬ۦۗۜۡ۫"
        L_0x01ea:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -1974993371: goto L_0x03c2;
                case 693286486: goto L_0x0203;
                case 754674674: goto L_0x01f4;
                case 1854047639: goto L_0x01fb;
                default: goto L_0x01f3;
            }
        L_0x01f3:
            goto L_0x01ea
        L_0x01f4:
            java.lang.String r2 = "ۜۡۗۘۧۜۘۧۡۛ۬ۙۥۡۦۘۖۨۦۘ"
            goto L_0x0037
        L_0x01f8:
            java.lang.String r2 = "ۢۖۦۘۨ۫ۚۢۡۨۖۥۘۛۘۚۘۙۖۘ"
            goto L_0x01ea
        L_0x01fb:
            r2 = 3
            r0 = r41
            if (r0 == r2) goto L_0x01f8
            java.lang.String r2 = "ۡۢۜۤۡۜۘۥۦۧۘۖۗ۠۫۫ۥۥۦۘۜۧۘ۫ۧۚ"
            goto L_0x01ea
        L_0x0203:
            java.lang.String r2 = "ۡۦ۫۬ۧۖۙۤ۫ۛۡۚۛۙ۟"
            goto L_0x01ea
        L_0x0206:
            java.lang.StringBuilder r25 = new java.lang.StringBuilder
            r25.<init>()
            java.lang.String r2 = "ۨۦۙۖۖۖۘۙ۬ۡۘۘۛۦۘۜ۬ۜۘۨۖۤۗۛۦ"
            goto L_0x0037
        L_0x020f:
            r44 = -4791529209281(0xfffffba4629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r44)
            r0 = r25
            r0.append(r2)
            java.lang.String r2 = "ۨۨۘۘۤۦۧۘۡۚۜۘۡۤۦۘۜۜۡۥۖۤ۬ۥۨۘ۫ۨۛ"
            goto L_0x0037
        L_0x0221:
            r44 = -2147246840(0xffffffff80039d08, float:-3.31839E-40)
            java.lang.String r2 = "ۘۘۢ۬ۦ۬۫۫ۧۙۙۚۖۡ۠ۜ۠ۖ۟۟ۥۘۢۧۜۘ"
        L_0x0226:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -1845748407: goto L_0x03ba;
                case -1246529208: goto L_0x023f;
                case 279704284: goto L_0x0230;
                case 338735812: goto L_0x023c;
                default: goto L_0x022f;
            }
        L_0x022f:
            goto L_0x0226
        L_0x0230:
            boolean r2 = IGStoriesEnabled()
            if (r2 == 0) goto L_0x0239
            java.lang.String r2 = "ۖۤ۫ۙۨۨۘۘ۟۟۠ۢۨۖۛۧۤۦۥۘۧۦۘ"
            goto L_0x0226
        L_0x0239:
            java.lang.String r2 = "ۨۢ۫ۧ۟۟ۘ۟ۖۜۜۦۘۚ۠ۥۘۛ۫ۤ۟ۖۨ"
            goto L_0x0226
        L_0x023c:
            java.lang.String r2 = "ۧ۫ۨۘ۫۫ۦۘۧۡۛۢۧۖۘۨۥ۬ۙۜۨۘ"
            goto L_0x0226
        L_0x023f:
            java.lang.String r2 = "ۨۧۛۚۗۡۘۧۧۤۘۖ۟ۜۦۦۜ۬۬۬ۥۜۘۧۤۢۢۤۛ"
            goto L_0x0037
        L_0x0243:
            r34 = -4813004045761(0xfffffb9f629a823f, double:NaN)
            java.lang.String r2 = "ۜۢ۫ۙۧۚ۫ۛ۟ۨۗ۫ۡۥۦۘۚۤۗ۠ۥۦۘۡ۫ۨۢۦۡۘ"
            goto L_0x0037
        L_0x024c:
            java.lang.String r2 = "ۘۤ۟ۨۙۡۖۥۧ۬ۗۥۘۜۥۨۥۗۦۥۛ"
            r32 = r34
            goto L_0x0037
        L_0x0252:
            r30 = -4830183914945(0xfffffb9b629a823f, double:NaN)
            java.lang.String r2 = "ۨ۠ۨۖۘۡۘۘۗۛۜۚۖۘۥ۬ۢ"
            goto L_0x0037
        L_0x025b:
            java.lang.String r2 = "ۛۤ۫۫ۚۘۘ۟ۙۙ۬ۧ۟ۦ۠ۚ۠ۡۖۘ"
            r32 = r30
            goto L_0x0037
        L_0x0261:
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r32)
            r0 = r25
            r0.append(r2)
            java.lang.String r2 = "۫ۧۜ۬۫ۨۘۜۜۨ۟ۜۨۦۦۧۜ"
            goto L_0x0037
        L_0x026e:
            java.lang.String r24 = r25.toString()
            java.lang.String r2 = "ۡۥۨۢۜۜۘۛۛۛ۫ۜۦ۠۠ۗۥۦۥ"
            goto L_0x0037
        L_0x0276:
            r28 = -4834478882241(0xfffffb9a629a823f, double:NaN)
            java.lang.String r2 = "ۨۥۡۗ۬ۖۘۙۛۡ۬ۦۨۙۗۗۖۘۘۖ۟ۢ"
            goto L_0x0037
        L_0x027f:
            java.lang.String r2 = "ۥۡ۫ۤۗۦۘۧۦۥۘۨۛۛۗۥ۫ۙۛ۠"
            r26 = r28
            goto L_0x0037
        L_0x0285:
            java.lang.String r2 = "ۚۘۥۘۚۡۡۘۧ۟ۘۧۚ۟۫ۛ۫"
            r23 = r24
            goto L_0x0037
        L_0x028b:
            java.lang.StringBuilder r22 = new java.lang.StringBuilder
            r22.<init>()
            java.lang.String r2 = "ۘۙۢۗۛۖۦۨ۬ۥۦۦۘۛۚۙۖۡ۠"
            goto L_0x0037
        L_0x0294:
            r44 = -4692744961473(0xfffffbbb629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r44)
            r0 = r22
            r0.append(r2)
            java.lang.String r2 = "ۗۢۗۖۦۨۘۙ۬ۗۦۦۥۗۥ۟۬ۘۢۡۙ۫"
            goto L_0x0037
        L_0x02a6:
            r44 = -443551961(0xffffffffe58fef27, float:-8.496375E22)
            java.lang.String r2 = "ۢۜۧۘۗۦ۫ۢۤۡۦ۟۟ۦۗۙۖۡۧۘۖۗۨۘ۟۟۬ۙۜ۠"
        L_0x02ab:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -2132048503: goto L_0x02b5;
                case -1046019385: goto L_0x03c6;
                case -862615824: goto L_0x02c1;
                case 1604192497: goto L_0x02c4;
                default: goto L_0x02b4;
            }
        L_0x02b4:
            goto L_0x02ab
        L_0x02b5:
            boolean r2 = IGStoriesEnabled()
            if (r2 == 0) goto L_0x02be
            java.lang.String r2 = "ۧۦۥ۠۠ۥۘ۟ۙۖۘۧۜۖۥۡ۠ۜۢۘۘۖۙۘ"
            goto L_0x02ab
        L_0x02be:
            java.lang.String r2 = "ۙۥۘۘ۬ۡۡۘۜۨۘۜۘۘۘۛۛۖ۠ۜۧۘۙۡ۠ۢۙۦۦۖۚ"
            goto L_0x02ab
        L_0x02c1:
            java.lang.String r2 = "۫ۢۘ۫ۨۢۘۙۡۧۖۢۧۨۢۛۥۡ۬۬ۧۧۧ۫ۖۛ"
            goto L_0x02ab
        L_0x02c4:
            java.lang.String r2 = "ۨ۠ۡۤۥۡۡۘۦۙ۟ۖۗۤۖ۫ۤ"
            goto L_0x0037
        L_0x02c8:
            r20 = -4739989601729(0xfffffbb0629a823f, double:NaN)
            java.lang.String r2 = "ۖۡۨۘۗۚۧ۬ۘۖۘۘ۬۟ۛ۠ۜ"
            goto L_0x0037
        L_0x02d1:
            java.lang.String r2 = "ۗۥۛۢۛۤۙۤ۫ۦۙ۬۬ۚ۬"
            r18 = r20
            goto L_0x0037
        L_0x02d7:
            r16 = -4757169470913(0xfffffbac629a823f, double:NaN)
            java.lang.String r2 = "ۛۡۗۤۢۗۧۖ۟ۜۙ۟۬ۧۧ"
            goto L_0x0037
        L_0x02e0:
            java.lang.String r2 = "۬۠ۚۢ۫ۦۘۙۧۙۧ۠ۛۤۜۜۘ"
            r18 = r16
            goto L_0x0037
        L_0x02e6:
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r18)
            r0 = r22
            r0.append(r2)
            java.lang.String r2 = "۠۫ۢۖۢۨ۫ۛ۫ۗۥۘۘۦ۟ۜۘ"
            goto L_0x0037
        L_0x02f3:
            java.lang.String r13 = r22.toString()
            java.lang.String r2 = "ۗ۫ۢۤۘۘۘۦۗۙۙۜۘۨۤۥۘۚۦۛۨ۫ۥۘۛۦۙ"
            goto L_0x0037
        L_0x02fb:
            r14 = -4761464438209(0xfffffbab629a823f, double:NaN)
            java.lang.String r2 = "۠ۢۖۘۚۦۧۘۘۥۦ۫ۘۙ۟۟ۖۤ۬ۘۧۛۡۘ۫ۖۚ۬ۤۥۘ"
            goto L_0x0037
        L_0x0304:
            java.lang.String r2 = "ۡۙۙۙ۫ۖۡ۬ۨۘ۬ۧۜۗ۬ۖ۟۬ۤ"
            r26 = r14
            goto L_0x0037
        L_0x030a:
            java.lang.String r2 = "ۡۧۡۘ۫ۙۤ۟ۤ۫ۨ۫ۗۨۚۖ۫ۢۖۘۘۘۤۚۗ۫"
            r23 = r13
            goto L_0x0037
        L_0x0310:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "۬ۙۖۘ۟ۖۧۡۧۘۘۜ۫ۦۘۤۚۘ۠ۚ۟۠ۛۧۗۗ۬ۖۘ"
            goto L_0x0037
        L_0x0319:
            r44 = -4606845615553(0xfffffbcf629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r44)
            r12.append(r2)
            java.lang.String r2 = "ۧ۟ۤۙۗۗۧۥۢۥۙۚۘ۬ۘ۠ۤۧ"
            goto L_0x0037
        L_0x0329:
            r44 = -1800713390(0xffffffff94ab4b52, float:-1.7296296E-26)
            java.lang.String r2 = "۟ۜۖ۫ۢۦۚۙۨۘۨۗۦۘۤ۫ۖۧۨۛ"
        L_0x032e:
            int r45 = r2.hashCode()
            r45 = r45 ^ r44
            switch(r45) {
                case -2117764101: goto L_0x0338;
                case -791160707: goto L_0x034b;
                case -674002714: goto L_0x0348;
                case -116528317: goto L_0x033f;
                default: goto L_0x0337;
            }
        L_0x0337:
            goto L_0x032e
        L_0x0338:
            java.lang.String r2 = "ۧۤۥۨۢ۟ۦۙۜۘۘ۟ۦۤۗ۟ۦۚۤۧۧۨۖۧۘۧۜۖۘ"
            goto L_0x0037
        L_0x033c:
            java.lang.String r2 = "ۥۘۤۘ۫۬۠ۚۢۜ۠ۖۧۖۡۘۧۨۜۘۢۡۛۗۙ"
            goto L_0x032e
        L_0x033f:
            boolean r2 = IGStoriesEnabled()
            if (r2 == 0) goto L_0x033c
            java.lang.String r2 = "ۤۙۖۘۛ۠ۧ۫ۢۨۘۥۖۡۖۤ۠"
            goto L_0x032e
        L_0x0348:
            java.lang.String r2 = "۠ۨۡۛۘۧۘۘۡۧۘ۟ۨ۫ۨ۠ۨ"
            goto L_0x032e
        L_0x034b:
            java.lang.String r2 = "۟ۙۙۗۢۜۘۙۚۡۘۢۢۜۥۗۙ۫ۡۡۗۧۡۢۥۡ"
            goto L_0x0037
        L_0x034f:
            r10 = -4641205353921(0xfffffbc7629a823f, double:NaN)
            java.lang.String r2 = "ۥۛۥۛۨۦۚۜۖۛۦ۠ۨۙۖۚۧۡۡۗۖۘۙۥ۟ۚۘۦ"
            goto L_0x0037
        L_0x0358:
            java.lang.String r2 = "ۜۘۨۡ۟۠ۢۜۢۧۚۨۘۚۚۥۘ"
            r8 = r10
            goto L_0x0037
        L_0x035d:
            r6 = -4658385223105(0xfffffbc3629a823f, double:NaN)
            java.lang.String r2 = "ۥۨۦۘۦۚۡۨۚۡۗۧۦۙۘۧۘ۫ۙۨۘۙۧۘ"
            goto L_0x0037
        L_0x0366:
            java.lang.String r2 = "ۚ۬ۨۘۢۤۘۥ۬ۡۘ۬ۜۦ۫ۦۚ"
            r8 = r6
            goto L_0x0037
        L_0x036b:
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r8)
            r12.append(r2)
            java.lang.String r2 = "۠ۢۘ۫ۛۥۨ۟ۙۗۦۘۥۦۥۧۗۦۘۡۖۥۦۢۘۖۚۚ"
            goto L_0x0037
        L_0x0376:
            java.lang.String r3 = r12.toString()
            java.lang.String r2 = "ۨ۠ۘۨۨۤۜۗۥۘۛۜۨۖ۬ۙۘۘۚۙ۟ۧ۬ۦۜۘ"
            goto L_0x0037
        L_0x037e:
            r4 = -4662680190401(0xfffffbc2629a823f, double:NaN)
            java.lang.String r2 = "ۨۤۥ۫ۙۘۘۥۡۦۦۦۚۢ۬۫ۢۗۦۘ۟۠ۦ"
            goto L_0x0037
        L_0x0387:
            java.lang.String r2 = "ۡۙۦۘۜۧ۟ۜۖۖۘۧۢۧۖۧۡ"
            r23 = r3
            goto L_0x0037
        L_0x038d:
            java.lang.String r2 = "ۖ۫ۢ۬ۧۜۖۛۙ۫۟ۖۘۚۛۨۗ۬ۡۙۛۜۘۗۘ۠۫۬ۦ"
            r26 = r4
            goto L_0x0037
        L_0x0393:
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r26)
            r0 = r23
            int r2 = com.obwhatsapp.yo.yo.getID(r0, r2)
            return r2
        L_0x039e:
            java.lang.String r2 = "ۜۥۥۘۗۛۨۘۧۗۧ۟ۡۨ۬۟ۡۘ۬ۛۡۡۗۦۘۢ۬ۨ"
            goto L_0x0037
        L_0x03a2:
            java.lang.String r2 = "ۗۜۦۘۢ۫ۛۚۗۙۚۛۘۢ۠ۜۥۤۢۙۖۘ"
            goto L_0x0037
        L_0x03a6:
            java.lang.String r2 = "ۗۨۥۘۥۗۥۘۧۜۜۘۡۧۢۦۜۗ"
            goto L_0x0037
        L_0x03aa:
            java.lang.String r2 = "ۙۗۧ۠ۜ۟ۗ۫۟ۚۜۛۡۦۘ۠۫ۥۙۤۥۤۤۦۘ"
            goto L_0x0037
        L_0x03ae:
            java.lang.String r2 = "ۛۘۗۛۡۜۛۤۗۨ۬۟ۤ۟ۗ۬ۨۘۡۢۦۗۧ۫"
            goto L_0x0037
        L_0x03b2:
            java.lang.String r2 = "ۛۥۤۖ۟ۦۛ۫ۡۘۥۗۜۘۙۘۨۘ۠۬۠ۢۤۘۗۗۜ"
            goto L_0x0037
        L_0x03b6:
            java.lang.String r2 = "ۥۡۚ۟۬ۦۘۚۛۨۘۨۙۡۛۚ۬"
            goto L_0x0037
        L_0x03ba:
            java.lang.String r2 = "۬ۖۗۘ۠ۧۚ۬۬ۧۚۧ۠ۙ۫"
            goto L_0x0037
        L_0x03be:
            java.lang.String r2 = "ۛۤ۫۫ۚۘۘ۟ۙۙ۬ۧ۟ۦ۠ۚ۠ۡۖۘ"
            goto L_0x0037
        L_0x03c2:
            java.lang.String r2 = "ۥۙۤۥۥ۫ۚۖ۫ۖۦۘۢ۬ۖۘۘۧۖۘ۫۬ۘۡۥۧۚۚۧ"
            goto L_0x0037
        L_0x03c6:
            java.lang.String r2 = "ۦۤۚ۬ۘۨۘۢ۫ۜ۟۠ۡۤۡۘ۫ۛۢۦۖۜۛۥۙۘۢۤ"
            goto L_0x0037
        L_0x03ca:
            java.lang.String r2 = "۬۠ۚۢ۫ۦۘۙۧۙۧ۠ۛۤۜۜۘ"
            goto L_0x0037
        L_0x03ce:
            java.lang.String r2 = "ۚ۬ۨۘۢۤۘۥ۬ۡۘ۬ۜۦ۫ۦۚ"
            goto L_0x0037
        L_0x03d2:
            java.lang.String r2 = "ۖ۫ۢ۬ۧۜۖۛۙ۫۟ۖۘۚۛۨۗ۬ۡۙۛۜۘۗۘ۠۫۬ۦ"
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.NewOldUI(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int TTextColor() {
        /*
            java.lang.String r0 = "ۢۧۥۘۢۘۙۖۥ۬۟۟ۧ۠ۙ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 399(0x18f, float:5.59E-43)
            r3 = 1162070628(0x4543ca64, float:3132.6494)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1044968763: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -7613322722753(0xfffff913629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultHomeToolbarColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.TTextColor():int");
    }

    public static String a(PhoneNumberEntry phoneNumberEntry) {
        String str = "۠ۨ۟ۛۜۨۛۖۤۦ۫ۨۘ۫ۘۡۘۡۘۧۘۖۢۙۦۚۙۙۡۖ";
        String str2 = null;
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        StringBuilder sb2 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            switch ((str.hashCode() ^ 473) ^ -1390964340) {
                case -1620074959:
                    str = "ۡۢۡۘۦۜۥۘۘۖۤۨۙۥۘۜۙۨۘۖۘۦۘۢ۟ۢ";
                    str3 = str4;
                    break;
                case -1552254982:
                    str2 = sb.toString();
                    str = "ۚ۫ۢ۠ۛۘۘۛۤۛۜۜۧۜۜۛۗۚۨۘ";
                    break;
                case -830348951:
                    str = "ۤ۫۠ۡۢ۫۟ۙ۟ۙۚۤۙۢۛ";
                    break;
                case -819210985:
                    str4 = sb2.toString().replaceAll(Deobfuscator$app$Custom.getString(-10297677282753L), Deobfuscator$app$Custom.getString(-10310562184641L));
                    str = "ۗۘ۠ۚۚۖۘۨۥۥۘۛ۟ۥۘ۬ۨ";
                    break;
                case -376573539:
                    str = "ۙۘۦۧ۫ۡۥۖۦۨۡ۬ۥۗ۟۠ۤ۠ۡۛۖۘۡۦۤۥ۠۬";
                    str5 = phoneNumberEntry.getPhoneNumberField().getText().toString();
                    break;
                case 96098698:
                    sb2.append(str5);
                    str = "ۗۖ۫ۖۗۚۚۖۜۘ۬ۡۥۚۖۦۤۡۡۛۜۛۚۧ";
                    break;
                case 465400668:
                    return str3;
                case 674775785:
                    sb.append(Deobfuscator$app$Custom.getString(-10314857151937L));
                    str = "ۘ۫۟ۧۧۘۦ۠۟ۢۚۘۘ۬ۗۡ۫ۘ۫ۗۚۖۨۜۥۘۛۖۥۘ";
                    break;
                case 1191596004:
                    str = "ۢۘۧۘ۬ۚۦۥۢۛۙ۟ۨۢ۟ۘۘ۠۫ۦۜ۬ۨۘۤۙۡۘ";
                    sb2 = new StringBuilder();
                    break;
                case 1511572376:
                    str = "ۗ۬ۚ۫ۡۨۘۨۗ۫۠۠۠ۨۢۚۨۤۖ";
                    str3 = str2;
                    break;
                case 1750565390:
                    String str7 = "ۗ۟۬ۚۡۙۚ۬۠ۨۢۨۘۘۜۖۧۡ۬ۤۤ";
                    while (true) {
                        switch (str7.hashCode() ^ -99016384) {
                            case -1563983564:
                                str7 = "۠ۤۘۘۢ۫ۥۜۢۘ۟۠ۥۡۖۚۢۦۡ۬ۢۗۖۤۖۛۡۘۘ";
                                break;
                            case -381141366:
                                if (str4.isEmpty()) {
                                    str7 = "ۨۤۧ۫ۤۘۘ۬ۖۜۨۜۦۘۦۡ۬۫ۗۥۘۨۚۨۙۦۡۘ";
                                    break;
                                } else {
                                    str7 = "ۗۙۙ۠ۥۥۘۖۦۙ۟ۚۖۙۦۨۢۦ۬ۖ۬ۘۦۧۜۘۖۘۧ";
                                    break;
                                }
                            case -149745314:
                                str = "ۗ۬ۚ۫ۡۨۘۨۗ۫۠۠۠ۨۢۚۨۤۖ";
                                continue;
                            case 2093888847:
                                str = "ۙۙۘۢ۠ۖۖۜۤۛۘ۟۬ۤۜۘۜۜۘۨۙۦ";
                                continue;
                        }
                    }
                    break;
                case 1799143552:
                    sb2.append(str6);
                    str = "ۜ۫ۜ۟ۘۡۘۨۥۦۘۙۛۦۘ۫۫ۦۘۛۤ۠ۜۖ";
                    break;
                case 2088339190:
                    str = "ۢ۟ۨۘۤۙۘۖ۫۫۫ۨۙۢۗۥۗۢۤۢۙۧ۠ۘ۫";
                    str6 = phoneNumberEntry.getCountryCodeField().getText().toString();
                    break;
                case 2130674048:
                    str = "ۛۜۦۗۨۜۘ۟ۤ۠ۤۧۢۤۦۤۧۤۖۙۙۧ۫ۙۤ";
                    sb = a.g(str4);
                    break;
            }
        }
    }

    private static void addSwitchAccount(Menu menu) {
        menu.add(0, yo.getID("div2", "id"), 0, yo.getID("add_account", "string")).setIcon(yo.getID("ic_add_account", "drawable")).setOnMenuItemClickListener(AddAccounts.INSTANCE).setVisible(isMultiAccountEnabled()).setShowAsAction(2);
    }

    public static void anyNum() {
        String str = "ۗۖۨ۫ۦۜۡۘۢۨۛۚ۫ۖۜۨۗۡۘ";
        PhoneNumberEntry phoneNumberEntry = null;
        View view = null;
        CustomAlertDialogBuilder customAlertDialogBuilder = null;
        while (true) {
            switch ((str.hashCode() ^ 767) ^ 936029838) {
                case -1934347391:
                    customAlertDialogBuilder.show();
                    str = "ۡۡۥۖۦ۟۠ۗۜ۟ۜۥۛ۬ۥۚۙۗۡ";
                    break;
                case -1698003839:
                    customAlertDialogBuilder.setView(view);
                    str = "۠ۗۜۚ۬ۦۘۡ۫ۜۘ۠ۢۡۧۦۧۘۢ۟ۧۚۦۨۘۚۢۤ";
                    break;
                case -1631351726:
                    customAlertDialogBuilder = new CustomAlertDialogBuilder(yo.Homeac);
                    str = "۬ۤۖۗ۟ۖۘۖۥۡۗ۠۠ۤۜ۠";
                    break;
                case -1541645202:
                    ((ViewGroup) view.findViewWithTag(Deobfuscator$app$Custom.getString(-10259022577089L))).setOnClickListener(new c0(phoneNumberEntry, customAlertDialogBuilder, 2));
                    str = "۠ۖۖۘۨۦ۟۟ۥ۟ۡ۟ۙ۠۬ۜۤۤۘۘۧۤۖۥۥۤۢۤۢ";
                    break;
                case -1258830953:
                    ((ViewGroup) view.findViewWithTag(Deobfuscator$app$Custom.getString(-10194598067649L))).setOnClickListener(new c0(phoneNumberEntry, customAlertDialogBuilder, 1));
                    str = "ۦۜۦۢۙۜۦۦۡۘ۫ۗۡۘۖ۠ۢ۫ۨۘۥۘ۟ۦۖۘۖۥۖۘ";
                    break;
                case -145024533:
                    ((TextView) view.findViewWithTag(Deobfuscator$app$Custom.getString(-9988439637441L))).setText(yo.getString(Deobfuscator$app$Custom.getString(-10014209441217L)));
                    str = "ۗۦۥۘۙۤۚۙ۬ۘۤۗۛۡۚ";
                    break;
                case -53929361:
                    view = LayoutInflater.from(yo.Homeac).inflate(yo.getID(Deobfuscator$app$Custom.getString(-9812345978305L), Deobfuscator$app$Custom.getString(-9876770487745L)), (ViewGroup) null);
                    str = "ۡۤۙۜۨۧۘ۬ۖۜۜ۫ۢ۟۬ۘۛۙۧۘۨۘ۫ۖۗۢۚۖۘ";
                    break;
                case 416254081:
                    return;
                case 525552938:
                    customAlertDialogBuilder.setTransparentBackground(true);
                    str = "ۚۗۤۖۗۤ۠ۤۨۘۜ۟ۨۘ۫ۧۚ۫ۖۨۘۜۙۜۘۨ۫ۚۧۡۜۘ";
                    break;
                case 766449016:
                    ((ViewGroup) view.findViewWithTag(Deobfuscator$app$Custom.getString(-10130173558209L))).setOnClickListener(new c0(phoneNumberEntry, customAlertDialogBuilder, 0));
                    str = "۬ۛۦۚ۠ۘۛۦۤۡۚۥۘۧۡۘ۟۬ۧ";
                    break;
                case 1395577831:
                    str = "ۖ۠۟ۡ۟ۢۥ۫ۗ۬۟ۘۘۢۡۦۨۘۢۤۜۘۢ۬ۨۘ";
                    phoneNumberEntry = (PhoneNumberEntry) view.findViewWithTag(Deobfuscator$app$Custom.getString(-9906835258817L));
                    break;
            }
        }
    }

    public static void b(C005402i r5, String str) {
        try {
            boolean z2 = shp.getBoolean(Deobfuscator$app$Custom.getString(-6423616781761L));
            boolean z3 = shp.getBoolean(Deobfuscator$app$Custom.getString(-6457976520129L));
            r5.A0J(u1.k(str));
            String str2 = "ۚۛ۟ۘۥۘۨۥۨۤۤۧۗۘۜ";
            while (true) {
                switch (str2.hashCode() ^ -763970834) {
                    case -1456975443:
                        return;
                    case -1329957351:
                        str2 = "ۡۢۦۘۡۡۜۖۨۥۘۜۛۨۘۦۢۘۘۥۧۧ";
                        break;
                    case -729027934:
                        String str3 = "ۡۧۥ۬ۦ۫ۧۚۖ۫ۘۧۘ۟۟ۖۘۧۥۧۚۥۖۘۘۢۡۖۘۘ";
                        while (true) {
                            switch (str3.hashCode() ^ -162405386) {
                                case -2118159322:
                                    r5.A0I(u1.k(yo.getMyStatus(Deobfuscator$app$Custom.getString(-6505221160385L))));
                                    return;
                                case -948994663:
                                    return;
                                case -321530830:
                                    if (z3) {
                                        str3 = "ۨۖ۠ۘۧۦۘۚۦۘۜ۟ۘۘۢۘۧۘۗۧۙۢۥۘ";
                                        break;
                                    } else {
                                        str3 = "ۢ۠ۤۖۤۘۘ۬ۚۜۘۗۨۜۡۧۤ";
                                        break;
                                    }
                                case 1307353031:
                                    str3 = "ۧ۫ۢ۠ۖ۬ۢۢۡ۟۫ۜۘ۫۟ۦ۫۠ۤۗۧۦۘ";
                                    break;
                            }
                        }
                        break;
                    case 1286565308:
                        if (!z2) {
                            str2 = "ۛۖۖۘ۠ۗۜۘۨۧۘۘ۟۬ۢ۬ۤۡ";
                            break;
                        } else {
                            str2 = "ۢۦۚۘۥ۫ۗۜۘۢۜۜۘ۬ۙ۟ۦ۠ۢ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r0 = "ۦۚۡۡۙ۟ۨ۬ۨۘ۟ۧۗۡۦۛ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c4, code lost:
        r0 = "ۨۚۚۗۗۚۘ۟ۤۗۧۛ۫۠۬";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void bringYoFAB_Chats() {
        /*
            r12 = 4
            r6 = 1
            r2 = 0
            java.lang.String r0 = "۫ۛۨۘۗ۬ۡۘۛ۬ۛۡۜۨۗ۟ۥۨۤۡۜۤ۫ۥۨۘ"
            r1 = r2
            r4 = r2
            r5 = r2
            r3 = r2
            r7 = r2
            r8 = r2
        L_0x000b:
            int r9 = r0.hashCode()
            r10 = 505(0x1f9, float:7.08E-43)
            r11 = -1263619553(0xffffffffb4aeb21f, float:-3.2539626E-7)
            r9 = r9 ^ r10
            r9 = r9 ^ r11
            switch(r9) {
                case -1951024854: goto L_0x0057;
                case -1719772181: goto L_0x00d7;
                case -1714795539: goto L_0x0053;
                case -1679398517: goto L_0x0136;
                case -1612161891: goto L_0x002a;
                case -1456089807: goto L_0x0188;
                case -1433970495: goto L_0x005b;
                case -1288282513: goto L_0x001a;
                case -1286845164: goto L_0x0035;
                case -70843281: goto L_0x0180;
                case 43372251: goto L_0x0062;
                case 151794795: goto L_0x005e;
                case 277285966: goto L_0x017c;
                case 315031140: goto L_0x0111;
                case 486267425: goto L_0x0085;
                case 766718223: goto L_0x00b1;
                case 968653494: goto L_0x00f4;
                case 1197605397: goto L_0x0153;
                case 1498889633: goto L_0x00b6;
                case 1591456726: goto L_0x00a8;
                case 1636303965: goto L_0x0031;
                case 1753383827: goto L_0x00ad;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x000b
        L_0x001a:
            r8 = -7123696451009(0xfffff985629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r8)
            boolean r8 = com.obwhatsapp.yo.shp.getBoolean(r0)
            java.lang.String r0 = "ۤۦۡۘۢۡۤۛۡۡۘۤ۬ۡۘ۫ۤۦۤ۬ۦۘۛۜۙۦۨۘۘ"
            goto L_0x000b
        L_0x002a:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            int r7 = r0.A03
            java.lang.String r0 = "ۛۤ۠ۗۗۨۘ۠ۦۘۘ۠ۛۜۧۚۢ"
            goto L_0x000b
        L_0x0031:
            java.lang.String r0 = "ۦۨۥۖۢ۠۬ۘۖۢۧۢۙۤۡ"
            r3 = r6
            goto L_0x000b
        L_0x0035:
            r9 = -1632057289(0xffffffff9eb8c837, float:-1.9564565E-20)
            java.lang.String r0 = "ۤۛۖۜ۠ۚۘۥۦۘ۬ۦۨۚۡۦۘ"
        L_0x003a:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1737355979: goto L_0x0050;
                case -956784463: goto L_0x0178;
                case 331089862: goto L_0x0043;
                case 1052474939: goto L_0x004d;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x003a
        L_0x0043:
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 != r0) goto L_0x004a
            java.lang.String r0 = "ۢۥۨۘۢۚۡۚۚۙۙۢۨۘۚۘۦ"
            goto L_0x003a
        L_0x004a:
            java.lang.String r0 = "ۚ۠۟ۢۤۤ۠ۙ۫ۨ۠ۖۡۦ۠"
            goto L_0x003a
        L_0x004d:
            java.lang.String r0 = "ۗۥۛۨۧۗۗۜۘۘۘۥۧ۟۫ۜۘۧۡۥۘۙۥ۠۬۫ۖ"
            goto L_0x003a
        L_0x0050:
            java.lang.String r0 = "۬ۘ۫ۡۘۥۘۥۚۚۥۥ۫ۨۤۖ"
            goto L_0x000b
        L_0x0053:
            java.lang.String r0 = "۠ۛ۬۟۬ۜۚۢۢۙۚۦۗۚۡۦ۟ۢۚۜۢ"
            r5 = r6
            goto L_0x000b
        L_0x0057:
            java.lang.String r0 = "ۨۚۦۘۦ۬ۛۚ۫ۚۦۗۢۦۚۚ۫ۦ"
            r4 = r5
            goto L_0x000b
        L_0x005b:
            java.lang.String r0 = "۟ۛۡۤ۬ۡۘ۟ۡۥۘۜ۬۫ۚۥۚ"
            goto L_0x000b
        L_0x005e:
            java.lang.String r0 = "ۦۢۡۦۦۨۘۛۘ۬ۚ۬ۙۘۚۖۘۥۗۙۨۚۙ۫ۢۥ"
            r4 = r2
            goto L_0x000b
        L_0x0062:
            r9 = 401115785(0x17e88a89, float:1.502762E-24)
            java.lang.String r0 = "ۧۥ۬۫۬ۘۘۛۦۢ۬ۡۥ۫ۙۚۧۖۧۥۙ۬"
        L_0x0067:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1943646589: goto L_0x0082;
                case -1876955883: goto L_0x0070;
                case -993765768: goto L_0x007f;
                case 454660909: goto L_0x0076;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0067
        L_0x0070:
            java.lang.String r0 = "ۦۚۡۡۙ۟ۨ۬ۨۘ۟ۧۗۡۦۛ"
            goto L_0x000b
        L_0x0073:
            java.lang.String r0 = "ۥ۠ۖۤۗۘ۬ۖۥۙۤۗ۟ۡۚۧۗۤ۠ۢۚ۠ۛ"
            goto L_0x0067
        L_0x0076:
            boolean r0 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "۠ۢۨۘۨۖۡۘۙۜۘ۬۬ۗۙۜۢۡۦۜ"
            goto L_0x0067
        L_0x007f:
            java.lang.String r0 = "ۥ۠ۤۚۙ۫ۢۜۡۗۢۧۦۥۜۘۜۘۤۥۦۤۢ۠ۚۛۤۡ"
            goto L_0x0067
        L_0x0082:
            java.lang.String r0 = "۠ۢۘۚۜۙۖۙۖۖۦ۠ۜۧۜۖۛۛۡۗ۠"
            goto L_0x000b
        L_0x0085:
            r9 = -1747103376(0xffffffff97dd5170, float:-1.4302348E-24)
            java.lang.String r0 = "ۙۜۜۨۡۡۘۧۨۨۘۛۘ۟ۚ۫ۙ"
        L_0x008a:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1318936016: goto L_0x009a;
                case -1173356384: goto L_0x0093;
                case -1021959341: goto L_0x0070;
                case 1837004645: goto L_0x00a5;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x008a
        L_0x0093:
            java.lang.String r0 = "ۚۗۦ۟ۚ۟۬ۨۨۘۖۤۜۘۖۘۢۛۦۖۘ۬ۖۘۥ۬ۛ۟ۛۦۘ"
            goto L_0x000b
        L_0x0097:
            java.lang.String r0 = "ۢۡ۠۫ۖۨۙۥۚۖ۠ۡۘۙۖ۟ۖۜۘ"
            goto L_0x008a
        L_0x009a:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            int r0 = r0.A03
            r10 = 300(0x12c, float:4.2E-43)
            if (r0 != r10) goto L_0x0097
            java.lang.String r0 = "ۤۨۘۚۘۨ۠ۖۗۘۤۜ۟ۚ۬ۙۘۘ۫ۜۡۘ"
            goto L_0x008a
        L_0x00a5:
            java.lang.String r0 = "ۡ۟ۧۤۡۧۘۗ۬۟ۚۚۥۘۛۙ۠۫ۙۢۨۖۦۢۗ۠ۘۙۜ"
            goto L_0x008a
        L_0x00a8:
            java.lang.String r0 = "ۖۥۜۘۧۥۘ۟ۗ۫۫ۛۨۜۦۢۖۧۧۙۗۙۖۦۢ"
            r1 = r3
            goto L_0x000b
        L_0x00ad:
            java.lang.String r0 = "۬ۥۥ۟ۜۖۘۗۧۚۤۚۡۘۜۨۥۨۖۤ"
            goto L_0x000b
        L_0x00b1:
            java.lang.String r0 = "ۛ۬ۨۘ۟ۜ۟ۧۖۨۢۤۢۨ۟ۜۘۧۦۧۦۗۥ"
            r1 = r2
            goto L_0x000b
        L_0x00b6:
            r9 = 1392236198(0x52fbd6a6, float:5.40818997E11)
            java.lang.String r0 = "ۢ۬ۛۛۛۗۘ۟ۗۧۘۖۛۤۜۙۥۙۖۜۘ"
        L_0x00bb:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1328793445: goto L_0x00cb;
                case -1126548676: goto L_0x00c4;
                case -1008372456: goto L_0x00d3;
                case 1274407874: goto L_0x00d0;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            goto L_0x00bb
        L_0x00c4:
            java.lang.String r0 = "ۨۚۚۗۗۚۘ۟ۤۗۧۛ۫۠۬"
            goto L_0x000b
        L_0x00c8:
            java.lang.String r0 = "ۤ۠ۗۗۧ۫ۘ۬ۖۥۖۤۡۡۖۘ۟ۗۥ"
            goto L_0x00bb
        L_0x00cb:
            if (r8 != 0) goto L_0x00c8
            java.lang.String r0 = "ۢۖۡ۫۬۠ۗۤۚ۫ۨۗۛۙۖۦۥ۟ۢۜۡۢۖۘ"
            goto L_0x00bb
        L_0x00d0:
            java.lang.String r0 = "ۤۘۜۘ۠ۚۡۘۧۨۜۘۘ۬ۖۥۡۘۨۤۘۙۗۢۘۜۜۘۢۛۗ"
            goto L_0x00bb
        L_0x00d3:
            java.lang.String r0 = "ۧۘ۬ۜ۫ۧۤۡۨۘ۬ۨۧۨۥ۫"
            goto L_0x000b
        L_0x00d7:
            r9 = -1880924117(0xffffffff8fe3602b, float:-2.242097E-29)
            java.lang.String r0 = "۠ۥۨۙ۠ۚۛۛۧ۟ۢۘ۬ۜۜۗ۬ۨۘۥۦۘۢۦۥ۟ۖ"
        L_0x00dc:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1588812556: goto L_0x0184;
                case -1093407393: goto L_0x00ec;
                case -1053647329: goto L_0x00f1;
                case 2122718271: goto L_0x00e5;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x00dc
        L_0x00e5:
            java.lang.String r0 = "ۖۡۥ۠ۘۡۘۧ۫ۧۜۨ۫ۚۥ"
            goto L_0x000b
        L_0x00e9:
            java.lang.String r0 = "ۖۙۢۙۧۛ۫ۢۡۘۢۜۨۢۗۦ"
            goto L_0x00dc
        L_0x00ec:
            if (r4 != 0) goto L_0x00e9
            java.lang.String r0 = "ۧۛۗ۟ۘۗۡ۟۠ۧ۠ۧ۫ۛۥۘۗۥۜۘ"
            goto L_0x00dc
        L_0x00f1:
            java.lang.String r0 = "۫۫ۧۚۨۦۛۚۥۘۥۘۘۖ۬ۡۛۚۥۗۧۜۧ۟ۜۦۜ۟"
            goto L_0x00dc
        L_0x00f4:
            r9 = 1932021451(0x73284ecb, float:1.3334717E31)
            java.lang.String r0 = "ۧ۠ۤ۬ۘۨۢ۠۫ۢ۬ۘۘۚۡۥ۫۫ۚۛۧۤ۟ۙۨ۟ۡ۫"
        L_0x00f9:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1527709478: goto L_0x0108;
                case -951661392: goto L_0x0102;
                case -136277561: goto L_0x00c4;
                case 1637506412: goto L_0x010d;
                default: goto L_0x0101;
            }
        L_0x0101:
            goto L_0x00f9
        L_0x0102:
            java.lang.String r0 = "ۗۥۧۘۥۖۥ۟۠۠ۢۦۡۘۘ۠ۨۦ۫ۧ"
            goto L_0x00f9
        L_0x0105:
            java.lang.String r0 = "ۚ۫ۥۤۜۥۢ۫۠ۗۨ۬ۖۥ"
            goto L_0x00f9
        L_0x0108:
            if (r1 == 0) goto L_0x0105
            java.lang.String r0 = "ۤۥۗۚۖ۫ۧۛۘۤۡ۬ۙۙۡۘ"
            goto L_0x00f9
        L_0x010d:
            java.lang.String r0 = "ۧۚۢۢ۬ۜۘۜۡ۠ۛ۬ۦۘ۫ۤۤ"
            goto L_0x000b
        L_0x0111:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r10 = -7162351156673(0xfffff97c629a823f, double:NaN)
            java.lang.String r9 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r10)
            r10 = -7179531025857(0xfffff978629a823f, double:NaN)
            java.lang.String r10 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r10)
            int r9 = com.obwhatsapp.yo.yo.getID(r9, r10)
            android.view.View r0 = r0.findViewById(r9)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r12)
            java.lang.String r0 = "ۥۚۤۡۤۛۘ۟ۨۘۜ۟۫۬ۧ۟ۢۥۤۦۙۥ"
            goto L_0x000b
        L_0x0136:
            r9 = -675342558(0xffffffffd7bf1722, float:-4.20212151E14)
            java.lang.String r0 = "ۛۥۦۘ۠۟ۜ۫ۡ۫ۦۨۛۘۧۜۚۨۦۘ"
        L_0x013b:
            int r10 = r0.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -2035348898: goto L_0x014c;
                case 731584618: goto L_0x0144;
                case 1153265600: goto L_0x00c4;
                case 1681871104: goto L_0x014f;
                default: goto L_0x0143;
            }
        L_0x0143:
            goto L_0x013b
        L_0x0144:
            if (r1 == 0) goto L_0x0149
            java.lang.String r0 = "ۡ۟ۖۙۚۥۨۦۘۛۢۥۘۢۚۘۚۧۘۘۘۜۥ"
            goto L_0x013b
        L_0x0149:
            java.lang.String r0 = "ۢ۠۟ۛۜۨۘ۠ۡۦۘۘ۟۬ۙ۫ۨۘ"
            goto L_0x013b
        L_0x014c:
            java.lang.String r0 = "ۦ۠ۖۨ۫ۥۛ۠ۨۨۖۘ۟ۘۜۘ"
            goto L_0x013b
        L_0x014f:
            java.lang.String r0 = "ۤۚۜۚۚۘۘۤۖۛۡۚۙۛۨۘۘۚۨ۬ۘۗ"
            goto L_0x000b
        L_0x0153:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r10 = -7192415927745(0xfffff975629a823f, double:NaN)
            java.lang.String r9 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r10)
            r10 = -7239660568001(0xfffff96a629a823f, double:NaN)
            java.lang.String r10 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r10)
            int r9 = com.obwhatsapp.yo.yo.getID(r9, r10)
            android.view.View r0 = r0.findViewById(r9)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r12)
            java.lang.String r0 = "ۨۚۚۗۗۚۘ۟ۤۗۧۛ۫۠۬"
            goto L_0x000b
        L_0x0178:
            java.lang.String r0 = "ۦۘۘۢۢ۠ۙۛ۬ۧۡۜۗ۠ۖۖۢۘۘ"
            goto L_0x000b
        L_0x017c:
            java.lang.String r0 = "ۦۢۡۦۦۨۘۛۘ۬ۚ۬ۙۘۚۖۘۥۗۙۨۚۙ۫ۢۥ"
            goto L_0x000b
        L_0x0180:
            java.lang.String r0 = "ۛ۬ۨۘ۟ۜ۟ۧۖۨۢۤۢۨ۟ۜۘۧۦۧۦۗۥ"
            goto L_0x000b
        L_0x0184:
            java.lang.String r0 = "ۧۚۢۢ۬ۜۘۜۡ۠ۛ۬ۦۘ۫ۤۤ"
            goto L_0x000b
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.bringYoFAB_Chats():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int dialogTextColor() {
        /*
            java.lang.String r0 = "۠ۦۦۘ۬۬ۦ۠۠۟ۖ۫ۜ۬ۚۜۘ۟ۚۥ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 880(0x370, float:1.233E-42)
            r3 = -1475252643(0xffffffffa8116e5d, float:-8.073048E-15)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1197840071: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -7458703900097(0xfffff937629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultListItemTitleColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.dialogTextColor():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int dialog_bg() {
        /*
            java.lang.String r0 = "۠ۥۨ۟ۜۥۘ۟ۥۙۦۦۚۥۨۥ۬ۛ۟ۤۗۥۨۚۡ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 810(0x32a, float:1.135E-42)
            r3 = 1760462152(0x68ee8548, float:9.0110546E24)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1246619367: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -7544603246017(0xfffff923629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getPrimarySurfaceColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.dialog_bg():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int fab_Bg() {
        /*
            java.lang.String r0 = "ۛ۬ۡۘۤۘۖ۟۫ۡۗۡۢۨۙۢۢۘۥ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 744(0x2e8, float:1.043E-42)
            r3 = 1946208079(0x7400c74f, float:4.081155E31)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1755312612: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -7664862330305(0xfffff907629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getFabColorNormal()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.fab_Bg():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getAirplaneMode() {
        /*
            java.lang.String r0 = "ۧ۬ۜۦۗۡۘ۫ۜۡۘ۬۫۫ۙۖۜۢۚۢۘۡۦۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 815(0x32f, float:1.142E-42)
            r3 = 904442737(0x35e8b371, float:1.7337571E-6)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1139650069: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -6642660113857(0xfffff9f5629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r1 = 0
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.getAirplaneMode():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getUIBottomStyle() {
        /*
            java.lang.String r0 = "ۜ۠۠ۖۢۢۨۦۖۘۦ۫ۡۘۦۛۨۘ۫ۤۜۘ۟ۢۢ۫ۥۗۥۥۧ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 189(0xbd, float:2.65E-43)
            r3 = -1240987527(0xffffffffb6080879, float:-2.027051E-6)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -862204611: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -5032047377857(0xfffffb6c629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r2 = -5100766854593(0xfffffb5c629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            java.lang.String r0 = com.obwhatsapp.yo.shp.getPrefString(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.getUIBottomStyle():java.lang.String");
    }

    public static int getUIBottomStyleID() {
        StringBuilder sb = null;
        String str = "ۙۗۡۢۦۡۢۥۖۘۨۚۧۦۥۘۘۢۗۤۖۧۥ";
        while (true) {
            switch ((str.hashCode() ^ 593) ^ 1574950117) {
                case -1997165598:
                    sb.append(Deobfuscator$app$Custom.getString(-5130831625665L));
                    str = "۟ۧۧۤۘۧۖ۫ۘۘۨۧۘ۫۫ۥۘۜۧۤۚۢۖۘۗ۠۟ۦۙۤ";
                    break;
                case -496814065:
                    sb.append(getUIBottomStyle());
                    str = "۬۠ۗۥۢۥۘۙۗ۬ۚۦۘۘۛۛۖ";
                    break;
                case -85997778:
                    sb = new StringBuilder();
                    str = "ۧ۬ۧۜۥۜۜ۫۬ۜ۬ۖ۫ۡۦ";
                    break;
                case 1783765851:
                    return yo.getID(sb.toString(), Deobfuscator$app$Custom.getString(-5178076265921L));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getUIHomeStyle() {
        /*
            java.lang.String r0 = "ۡۜۡۘۘۛۦۖۥۚۘۚ۠۬ۗۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 728(0x2d8, float:1.02E-42)
            r3 = 1696888348(0x6524761c, float:4.8540427E22)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1944199683: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -4396392218049(0xfffffc00629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r2 = -4465111694785(0xfffffbf0629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            java.lang.String r0 = com.obwhatsapp.yo.shp.getPrefString(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.getUIHomeStyle():java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void handleAlphaOnTitle(float r10) {
        /*
            r2 = 0
            r4 = 0
            r3 = 0
            java.lang.String r0 = "ۥۦۘۘۥۛۚۙۤۗۚۙۦۘ۫ۛۥۘۙۧۢۖۨۖۘۜۢۖۘ"
            r1 = r2
        L_0x0007:
            int r6 = r0.hashCode()
            r7 = 427(0x1ab, float:5.98E-43)
            r8 = -1493186528(0xffffffffa6ffc820, float:-1.7748423E-15)
            r6 = r6 ^ r7
            r6 = r6 ^ r8
            switch(r6) {
                case -1967776018: goto L_0x001d;
                case -1836185422: goto L_0x0055;
                case -1522377155: goto L_0x0022;
                case -1092827595: goto L_0x0095;
                case -685931613: goto L_0x0066;
                case -496274610: goto L_0x00ad;
                case -495622307: goto L_0x00a0;
                case 47550271: goto L_0x0047;
                case 304229698: goto L_0x0071;
                case 1297259255: goto L_0x0019;
                case 1601097004: goto L_0x0027;
                case 1632180361: goto L_0x0078;
                case 2059906552: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۙۙ۠ۖۨۜۛۨ۫ۨۗۥۤۘۘۦ۠ۦۜ۬ۖ"
            goto L_0x0007
        L_0x0019:
            double r4 = (double) r10
            java.lang.String r0 = "ۥۤۗۡ۠ۢۚۧ۟ۦۛۘۙ۫۠ۜۤ۬ۘۖۚۡۜۘۘ"
            goto L_0x0007
        L_0x001d:
            com.obwhatsapp.HomeActivity r3 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "۫۬۠ۚ۬ۦۘۡ۬ۖۘۤۨۛۛۙۛۤۙۖۘ۫ۙۙۨۛۧ"
            goto L_0x0007
        L_0x0022:
            boolean r1 = r3.mIsTheTitleContainerVisible
            java.lang.String r0 = "ۢۖۤۚۨ۟۬ۖۤ۟ۜۘ۫ۢ۫ۙۜۜ"
            goto L_0x0007
        L_0x0027:
            r6 = -2136357781(0xffffffff80a9c46b, float:-1.559066E-38)
            java.lang.String r0 = "ۜۙۥۘۛۜۧۘ۠ۢۨۘۙۢۨۘۥ۟ۢۛۤۥۡۡ"
        L_0x002c:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -251999190: goto L_0x0035;
                case 88628350: goto L_0x0044;
                case 470956037: goto L_0x00a9;
                case 1193741302: goto L_0x0041;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            java.lang.String r0 = "ۥۗۥۘ۟ۧ۠۫ۖۚۜۨۡۛۥ۠"
            goto L_0x002c
        L_0x003e:
            java.lang.String r0 = "ۗۢۖۘ۟۠ۥۡۙۥۘۧۢۨۘۡۤۛۥۜ۠ۜۨۘ"
            goto L_0x002c
        L_0x0041:
            java.lang.String r0 = "ۨۜۘ۠۟۟ۖ۟۟ۛۜۢۜۘۘۘۡۢۖۘۚ۬۠ۧ۠ۖۛۖۥ"
            goto L_0x002c
        L_0x0044:
            java.lang.String r0 = "ۡۜۚ۟ۚۡۘۚۙۥۦۙۙۥ"
            goto L_0x0007
        L_0x0047:
            r6 = 10265042(0x9ca1d2, float:1.4384388E-38)
            java.lang.String r0 = "ۚۛۡۘ۠۟ۡۘۖۨ۬ۚۡۨۘ۬ۛۘ۫ۚۖ"
        L_0x004c:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -262386042: goto L_0x0060;
                case 598533236: goto L_0x0055;
                case 764101683: goto L_0x005b;
                case 1545111337: goto L_0x0063;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x004c
        L_0x0055:
            java.lang.String r0 = "۫ۛۧۙۦۖۡ۫ۨۜۦۥۘۤۡۖۘۗۖۤۙۜۜۘۖ۟ۥۚۛۦ"
            goto L_0x0007
        L_0x0058:
            java.lang.String r0 = "ۤ۬۫ۜ۠ۜۘۢۚۘۘۥۛۥ۫ۖۢۦۡ۫۟۬۠"
            goto L_0x004c
        L_0x005b:
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "ۙۢۗ۬۠ۗۜۗۛ۫ۖۤۡۨۤۘ۠ۜ۟ۦ۠"
            goto L_0x004c
        L_0x0060:
            java.lang.String r0 = "ۗۦ۠۬ۗۘۨۘۨ۠ۦۘۘۧ۠"
            goto L_0x004c
        L_0x0063:
            java.lang.String r0 = "ۦۧۖۨۨۢۥۥۡۘۥۥۡۘۧۚۙۨۙۤ"
            goto L_0x0007
        L_0x0066:
            android.widget.LinearLayout r0 = r3.mTitleContainer
            r6 = 300(0x12c, double:1.48E-321)
            r8 = 4
            startAlphaAnimation(r0, r6, r8)
            java.lang.String r0 = "ۡ۠ۡۚۧۙۙۗ۠ۙۡۖۘۦۡۦۘ۬ۢۜۘۦۤۨ"
            goto L_0x0007
        L_0x0071:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r0.mIsTheTitleContainerVisible = r2
            java.lang.String r0 = "۫ۙۧۢۨ۫۫ۚ۬ۙۛ۠۫ۡۡۘۗ۬ۤۘۜۦۘ۫ۢۛ"
            goto L_0x0007
        L_0x0078:
            r6 = -359763849(0xffffffffea8e7077, float:-8.609928E25)
            java.lang.String r0 = "ۚۤۤۛۜۖۗ۬۬ۘۜۜۘۢۤۥۘۨۧۘ"
        L_0x007d:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -855165628: goto L_0x0091;
                case -826375553: goto L_0x0086;
                case 815621740: goto L_0x0055;
                case 1687020911: goto L_0x008e;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x007d
        L_0x0086:
            if (r1 != 0) goto L_0x008b
            java.lang.String r0 = "۠ۦۨۘۚۙۥۘۘۥ۬۠ۘ۟ۛۗۚۤۨۡ۫ۖۗۨۧۜۘ"
            goto L_0x007d
        L_0x008b:
            java.lang.String r0 = "ۡۖۤ۬ۖ۟ۙۡۖۘ۟۟ۤۙۚۘۤۜۘۘ"
            goto L_0x007d
        L_0x008e:
            java.lang.String r0 = "ۘۘۖۘ۟۠ۤ۟ۧۜۘۜۤۜۘۡۦۡ"
            goto L_0x007d
        L_0x0091:
            java.lang.String r0 = "۠ۥۥۘۡ۟ۦۨ۬ۖۨۢۜۚۘ۬۠۫ۗ"
            goto L_0x0007
        L_0x0095:
            android.widget.LinearLayout r0 = r3.mTitleContainer
            r6 = 500(0x1f4, double:2.47E-321)
            startAlphaAnimation(r0, r6, r2)
            java.lang.String r0 = "۟ۥۜۘۙۢ۠ۥۖۦۘۚۙۘ۬ۨۥۛۖۙ"
            goto L_0x0007
        L_0x00a0:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r6 = 1
            r0.mIsTheTitleContainerVisible = r6
            java.lang.String r0 = "۫ۛۧۙۦۖۡ۫ۨۜۦۥۘۤۡۖۘۗۖۤۙۜۜۘۖ۟ۥۚۛۦ"
            goto L_0x0007
        L_0x00a9:
            java.lang.String r0 = "ۘۘۢۜۘ۬۠ۢۘۘۜۘۢۚ۟ۙۢۤۧۖۤۙۦۚۚ"
            goto L_0x0007
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.handleAlphaOnTitle(float):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void handleToolbarTitleVisibility(float r7) {
        /*
            r2 = 0
            r6 = 0
            java.lang.String r0 = "۠ۥۧۚۘۘۤۨۜۧۤۦۘۙۥۦۘۢۙۦۢ۬ۧ۫ۚ۟"
            r1 = r2
            r3 = r2
        L_0x0006:
            int r2 = r0.hashCode()
            r4 = 216(0xd8, float:3.03E-43)
            r5 = -39717870(0xfffffffffda1f412, float:-2.6909124E37)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -1746272065: goto L_0x0015;
                case -1705606233: goto L_0x0018;
                case -933873702: goto L_0x003c;
                case -914789055: goto L_0x009a;
                case -570895086: goto L_0x0060;
                case -446595166: goto L_0x0042;
                case -433980080: goto L_0x0072;
                case 473549933: goto L_0x00ae;
                case 567906468: goto L_0x0077;
                case 592708706: goto L_0x006a;
                case 1663549124: goto L_0x0085;
                case 1960344302: goto L_0x00a6;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۘۘۨۘۜ۠ۡۘۛۧۖۦۖ۠۠ۗۖۙۚۨۡۨ۫ۤ۬ۧۜۧ۬"
            goto L_0x0006
        L_0x0018:
            r2 = -863600910(0xffffffffcc867ef2, float:-7.0514576E7)
            java.lang.String r0 = "۟ۖۥۙۚۖ۬ۗۨۘۧ۬ۨۘۘ۟۟"
        L_0x001d:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1198452247: goto L_0x0026;
                case -532510600: goto L_0x0036;
                case -139645467: goto L_0x0039;
                case 652522611: goto L_0x002c;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001d
        L_0x0026:
            java.lang.String r0 = "۠ۥ۫۟ۗۡۘۨۨ۫۫ۗۦۘۘۥۡۘ۟ۢۥۘ۫ۤۥۘ"
            goto L_0x0006
        L_0x0029:
            java.lang.String r0 = "۫ۚۚۘۖۨۘۦۥۦۗۙۜۘۜ۫ۨۤۦۘۘۦۢۦۡ۫ۗۖۡۘ"
            goto L_0x001d
        L_0x002c:
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            java.lang.String r0 = "ۤۜۡۨ۟ۥۡ۟ۚ۟ۚۥۖۘۦۘ۬ۜۨۘۖۨۙۖۛۜۙۗ۟"
            goto L_0x001d
        L_0x0036:
            java.lang.String r0 = "ۘ۠ۗۧۖۡ۠ۜۦۖۡۡۨۡۡ۫ۗۜ"
            goto L_0x001d
        L_0x0039:
            java.lang.String r0 = "ۜۙۧۨۙۨۘ۫۬ۜۘۦ۫۬ۨۗۥۘۖۘۧۖۛۖۘۨۨ۟ۜ۟ۧ"
            goto L_0x0006
        L_0x003c:
            com.obwhatsapp.HomeActivity r2 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "ۚ۠ۡ۫ۧۜ۫ۛۢ۠ۨۧۘۦ۫ۡ۫۟ۡۘۚۥۥۤۡۦۘ"
            r3 = r2
            goto L_0x0006
        L_0x0042:
            r2 = -781681315(0xffffffffd1687d5d, float:-6.2408479E10)
            java.lang.String r0 = "ۢۖۖۢ۟ۧۗۡۘۘۥۗۘۘۤۡۘۨۡۚ۫ۡۖۨۧۥۛ۫ۥ"
        L_0x0047:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -387371337: goto L_0x005d;
                case 505717205: goto L_0x0050;
                case 974653877: goto L_0x0085;
                case 1830004408: goto L_0x0056;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0047
        L_0x0050:
            java.lang.String r0 = "ۙۡ۫ۖۜۚ۬۫ۨۘۨۤۘۛۡۚۜۦۘ۬ۛۗۥۡۦ"
            goto L_0x0006
        L_0x0053:
            java.lang.String r0 = "ۙ۠ۘۢ۫ۨۘۖ۟ۖ۠ۦۚۜ۫ۚۢۡۥۨۘۤ"
            goto L_0x0047
        L_0x0056:
            boolean r0 = r3.mIsTheTitleVisible
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "ۙۨۥ۬۬ۥۗۗۗ۬ۤۙ۬ۙۨۘ۫ۗۚۨ۟ۘ۠ۡۨۘۦۥۧۘ"
            goto L_0x0047
        L_0x005d:
            java.lang.String r0 = "ۧۘۥۨۛۗۚۚۗۥۚۡۘۗۢۜ۟ۥ۬"
            goto L_0x0047
        L_0x0060:
            android.widget.TextView r0 = r3.mTitle
            r4 = 800(0x320, double:3.953E-321)
            startAlphaAnimation(r0, r4, r6)
            java.lang.String r0 = "۬۠ۡۘۨۖۤۚۘۗۦۤۡۘۡۤۛ۬ۘۤۨۥۦۨۖ۟ۗ۟ۛ"
            goto L_0x0006
        L_0x006a:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r2 = 1
            r0.mIsTheTitleVisible = r2
            java.lang.String r0 = "ۚۗۜۗ۠۫ۜۛۡۛۦۘۨۤۛۙۙۗۦ۬ۛۦۧۘۖ۬ۨۘ"
            goto L_0x0006
        L_0x0072:
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "ۡۥ۟ۥ۬۠ۢۖۦ۠ۨۗ۠ۜۡۘ"
            goto L_0x0006
        L_0x0077:
            r2 = -1465928111(0xffffffffa89fb651, float:-1.7731613E-14)
            java.lang.String r0 = "ۤۛۜۘۧۥ۠ۢۧۖ۬۬ۨۘۤۖۙۜ۟۟ۢ۟ۥ۫ۘ"
        L_0x007c:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1768654721: goto L_0x008c;
                case -421501497: goto L_0x0096;
                case 90409393: goto L_0x0085;
                case 591000336: goto L_0x0093;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x007c
        L_0x0085:
            java.lang.String r0 = "۠ۤ۫ۦۥۧۖ۠ۗۦۛۥۢۧۗۘۨ۫ۢۖۘۦ۟ۖۘۖۨ۫"
            goto L_0x0006
        L_0x0089:
            java.lang.String r0 = "ۖۥۦۜۧ۠ۗۦۛۖۡ۠ۜ۫ۦۨۥۘۨۜ۟"
            goto L_0x007c
        L_0x008c:
            boolean r0 = r1.mIsTheTitleVisible
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "ۖۚۥۘۦۖۨۘۗۢۖۘۘۦۗۤۗۦۘ۠ۙۜۘ۫۟ۙ۟ۢۦۘۦ۬"
            goto L_0x007c
        L_0x0093:
            java.lang.String r0 = "ۨۨۜۘ۠ۤۨۘۜۦۖۚۥۨۧ۬ۜ"
            goto L_0x007c
        L_0x0096:
            java.lang.String r0 = "ۦۙۙۚۙۚ۠ۢۡۥ۟ۤۗ۟ۗۦ۫ۡۘ"
            goto L_0x0006
        L_0x009a:
            android.widget.TextView r0 = r1.mTitle
            r4 = 500(0x1f4, double:2.47E-321)
            r2 = 4
            startAlphaAnimation(r0, r4, r2)
            java.lang.String r0 = "۫ۢۖۘۧۦۘ۬ۥۗۛ۠ۨۘ۟ۡۡۖۖۧۘۤ۫ۨۙۛۡ۠ۦۥ"
            goto L_0x0006
        L_0x00a6:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r0.mIsTheTitleVisible = r6
            java.lang.String r0 = "۠ۤ۫ۦۥۧۖ۠ۗۦۛۥۢۧۗۘۨ۫ۢۖۘۦ۟ۖۘۖۨ۫"
            goto L_0x0006
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.handleToolbarTitleVisibility(float):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isBottomBarEnabled() {
        /*
            r2 = 0
            r4 = 0
            java.lang.String r0 = "ۥۤ۬ۗ۬ۗ۟ۛ۠۠ۡۛ۠ۖۗ"
            r1 = r2
            r3 = r2
        L_0x0006:
            int r5 = r0.hashCode()
            r6 = 86
            r7 = -116374381(0xfffffffff9104493, float:-4.68176E34)
            r5 = r5 ^ r6
            r5 = r5 ^ r7
            switch(r5) {
                case -1332792612: goto L_0x001c;
                case -1096155330: goto L_0x009c;
                case -801255986: goto L_0x00b7;
                case -480262511: goto L_0x0045;
                case 406724793: goto L_0x00af;
                case 1340307086: goto L_0x00a1;
                case 1384670867: goto L_0x0015;
                case 1708317576: goto L_0x0098;
                case 1750307076: goto L_0x006e;
                case 2014353989: goto L_0x00a6;
                case 2017782797: goto L_0x00b3;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r4 = getUIHomeStyle()
            java.lang.String r0 = "ۜۡۤ۫ۜۨۘۘۖۤۚۨۗۡۧۘۤۗۥۘۢۡۖ۬ۦۨۘۥ"
            goto L_0x0006
        L_0x001c:
            r5 = -948038633(0xffffffffc77e1417, float:-65044.09)
            java.lang.String r0 = "ۥۛۖۢۙ۠ۛ۟ۜۛۢۦۘۜۚۘۘ۫ۖۥۘ"
        L_0x0021:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1854372653: goto L_0x0030;
                case -1686815877: goto L_0x0042;
                case -236022612: goto L_0x002a;
                case 699768463: goto L_0x00af;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0021
        L_0x002a:
            java.lang.String r0 = "۠۫ۡۘۥۧۚۘ۫ۜۡ۟۟ۤۧۤۘ۠ۡۨۧۘ۫۟ۘۧۘۖ"
            goto L_0x0006
        L_0x002d:
            java.lang.String r0 = "۟ۙۘۗۘۚۢۤۚۗۤۨۨۦۜۘ"
            goto L_0x0021
        L_0x0030:
            r6 = -4959032933825(0xfffffb7d629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "ۧۢۨۘۛۥۖۘۦۘۡۥۛۦۘۨ۫۫۠ۡۘۢۨۜۙۙۡۘۖۢۖ"
            goto L_0x0021
        L_0x0042:
            java.lang.String r0 = "ۧ۬ۤ۠ۧۡۘ۟۟ۙ۬ۙ۫۬۠ۗۤۢۡ۬ۘ۫ۥۗ۫ۧۦ"
            goto L_0x0021
        L_0x0045:
            r5 = 1238113057(0x49cc1b21, float:1672036.1)
            java.lang.String r0 = "۬۟ۗ۠ۡۖۘۨۧۨۜۧۘۘ۟ۧۥۘ"
        L_0x004a:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -899767220: goto L_0x00af;
                case -222577500: goto L_0x0053;
                case 354526500: goto L_0x006b;
                case 931669449: goto L_0x0059;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x004a
        L_0x0053:
            java.lang.String r0 = "ۚۖۡۜۧۧۚۦ۠ۨۘۗۤۙ۟ۜۙۧۨۘۖۖۘ۠ۤۧ"
            goto L_0x004a
        L_0x0056:
            java.lang.String r0 = "ۜۢ۟ۛ۬ۤۧۢ۠ۥۨۤۚ۬۬ۤۥۘۖۚۤ"
            goto L_0x004a
        L_0x0059:
            r6 = -4976212803009(0xfffffb79629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "ۨۤ۠ۥۗۢۨۜ۫ۙۘۨۘۢۚۙۗۨ۟ۗ۬ۦ۠ۛۛۗۛ۟"
            goto L_0x004a
        L_0x006b:
            java.lang.String r0 = "ۢۖ۟۫ۖ۫ۡۛۘۘۘۨ۫ۢۤۥۘ"
            goto L_0x0006
        L_0x006e:
            r5 = 1266780315(0x4b81889b, float:1.697823E7)
            java.lang.String r0 = "ۥۡۘ۠ۥۥۘۖ۠۬ۥۜۤۚۦۚ۫ۙۥۙۦۨۜۥۗ"
        L_0x0073:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1714847099: goto L_0x007c;
                case -232771924: goto L_0x00ab;
                case 129080448: goto L_0x0082;
                case 609694227: goto L_0x0094;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x0073
        L_0x007c:
            java.lang.String r0 = "۬ۖۤۙۤ۟ۥۗ۟ۧۥۘۘۚ۫ۡۙ۫ۙ"
            goto L_0x0073
        L_0x007f:
            java.lang.String r0 = "ۢۤۡۡۦۙ۫ۤۜۢۢۚۨ۫۟ۛۢ۟ۜۧۘۘۤ۠ۦ"
            goto L_0x0073
        L_0x0082:
            r6 = -5006277574081(0xfffffb72629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "ۢۢۜۘۥۨۘۢۘۥۘۘۢۨ۬۬ۚ"
            goto L_0x0073
        L_0x0094:
            java.lang.String r0 = "ۨۛۧۥۘۘۙۗۘۘۖۙۚ۬۫ۜۙۡۙ"
            goto L_0x0006
        L_0x0098:
            java.lang.String r0 = "ۛۜۤ۬ۖۢۗۢۢۙۖۘ۠۬ۢۨ۬ۥۘ۫ۨ۬"
            goto L_0x0006
        L_0x009c:
            java.lang.String r0 = "۟۬ۨۤۜۖۥۗ۠ۘۖۦۘۛ۠ۨ"
            r3 = r2
            goto L_0x0006
        L_0x00a1:
            r1 = 1
            java.lang.String r0 = "۠ۧۜۘۡۜۡۘۦۢۗۖۤۧۛ۬ۧۚۢۘۘۦۨۥۘ"
            goto L_0x0006
        L_0x00a6:
            java.lang.String r0 = "۬ۜۦ۬ۜۘۤۦۦۘۗۨۚۦۡۙۡۜۧ۬۟ۘۗۤ۬"
            r3 = r1
            goto L_0x0006
        L_0x00ab:
            java.lang.String r0 = "ۜۡۘۘۗۢۤۚۧۨ۟ۧۘۘۗۜۖۘ۠ۗۘۘ"
            goto L_0x0006
        L_0x00af:
            java.lang.String r0 = "ۦۥۗ۟ۡۧۘۗۡۜۦ۠ۙۤ۟۟ۡۡۢۛۡۦ۟ۨۦۘۗ۟ۘ"
            goto L_0x0006
        L_0x00b3:
            java.lang.String r0 = "۬ۜۦ۬ۜۘۤۦۦۘۗۨۚۦۡۙۡۜۧ۬۟ۘۗۤ۬"
            goto L_0x0006
        L_0x00b7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.isBottomBarEnabled():boolean");
    }

    private static boolean isMultiAccountEnabled() {
        return shp.getBoolean("yo_multi_account_menu", true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isOneUIEnabled() {
        /*
            java.lang.String r0 = "ۚ۟ۢۙۛۥۘ۬ۘۧۘۤۜۙۢۘۡۘۦۙ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 255(0xff, float:3.57E-43)
            r3 = -2080949072(0xffffffff83f73cb0, float:-1.4531288E-36)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1789442781: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = getUIHomeStyle()
            r2 = -4941853064641(0xfffffb81629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            boolean r0 = r0.equals(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.isOneUIEnabled():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isOneUIOrBottomEnabled() {
        /*
            r2 = 0
            java.lang.String r0 = "ۖۥۘۦۤۨۚۦ۬ۧۧۧ۬۫۬ۧۥ۠۬ۢۛ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 482(0x1e2, float:6.75E-43)
            r6 = 504220606(0x1e0dcbbe, float:7.506611E-21)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -2043059246: goto L_0x0057;
                case -1222171599: goto L_0x0054;
                case -262815838: goto L_0x0066;
                case -221018544: goto L_0x005b;
                case 61065505: goto L_0x0069;
                case 124118867: goto L_0x0034;
                case 1221385776: goto L_0x005f;
                case 1465383540: goto L_0x0014;
                case 1492742321: goto L_0x006c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            r4 = 251210946(0xef92cc2, float:6.142634E-30)
            java.lang.String r0 = "ۥ۟ۥۘۧ۫۬۟ۦۛۜۨ۬ۖۛ۫"
        L_0x0019:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case 382171937: goto L_0x002e;
                case 1163163964: goto L_0x0066;
                case 1413286557: goto L_0x0022;
                case 1604176132: goto L_0x0031;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            boolean r0 = isBottomBarEnabled()
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "ۧۙۤۧۘۜۘ۟۠ۚ۬۬ۦ۠۬۠۟۠۬۬ۦۨ۬ۜۦ۬ۖۘ"
            goto L_0x0019
        L_0x002b:
            java.lang.String r0 = "۠ۤۧۚۛ۟ۗۧۦۘ۬ۖ۠ۙۢۥۥۜۘ"
            goto L_0x0019
        L_0x002e:
            java.lang.String r0 = "۫ۖۧۘ۠ۨۥۚۛ۬۟ۛۛۥۧۘۨۚۥۘ"
            goto L_0x0019
        L_0x0031:
            java.lang.String r0 = "۟ۘۥۘۡۙۤۢۙۘۘ۫ۛۤۢۢۦۘ"
            goto L_0x0005
        L_0x0034:
            r4 = -1243971714(0xffffffffb5da7f7e, float:-1.6279371E-6)
            java.lang.String r0 = "ۛ۟ۖۘۤۜۜۥۤۜۘ۠ۖۢۖۗۜ۠۬ۙ"
        L_0x0039:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1368299880: goto L_0x0063;
                case -1233987738: goto L_0x0051;
                case -1151625125: goto L_0x0048;
                case 1343437588: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0039
        L_0x0042:
            java.lang.String r0 = "۠ۡ۟ۛۖ۫۫ۖۜۘۘ۬ۜ۠۬ۜۘۘ۫ۖۛۨۚۨ۠ۗ"
            goto L_0x0005
        L_0x0045:
            java.lang.String r0 = "۠ۚۜۘ۠ۚۧۖ۟۟۠۬ۦۘۗۦۙۧ۫ۛ۫۟ۗۤ۠ۗۙ۫ۚ"
            goto L_0x0039
        L_0x0048:
            boolean r0 = isOneUIEnabled()
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "ۦۧۛۦۤۨۘۥۨۦ۬ۥۤۡۦ۬ۘ۫ۨۘۗۙۜۛۛۚۤ۫ۡۘ"
            goto L_0x0039
        L_0x0051:
            java.lang.String r0 = "۫ۘۖۘ۟ۤۙۨۨۛۤۧۥۘ۠۬ۦۘ"
            goto L_0x0039
        L_0x0054:
            java.lang.String r0 = "ۗۦۜۘ۫ۘ۟ۨۡ۫ۢۤۡۖۢۗۡۛ۟"
            goto L_0x0005
        L_0x0057:
            java.lang.String r0 = "ۗۘۦۘۨ۬ۘۢۦ۬ۙۗۘۘۤۢ۠"
            r3 = r2
            goto L_0x0005
        L_0x005b:
            r1 = 1
            java.lang.String r0 = "ۜ۬ۗۚۨۡۘۛۤۖۥۙ۫۬ۦۥۘۗ۫ۤۜۘۡۘۨۚ۠ۘۖ"
            goto L_0x0005
        L_0x005f:
            java.lang.String r0 = "ۡۛۨۘۗۖ۬ۜ۫ۙۚۦۢۢ۬ۡ۠۟ۖۘۢۘ۬"
            r3 = r1
            goto L_0x0005
        L_0x0063:
            java.lang.String r0 = "ۙ۟ۜۘۘ۫ۡۙۘۙۢۛ۬ۨۖۘۜ۬ۢ"
            goto L_0x0005
        L_0x0066:
            java.lang.String r0 = "ۨ۟ۛۚۥۡۘۘۙۖۥ۠ۘۛۖۡ۬ۛۨۘۙۚۜۘۖۧۥۘۤۜۜ"
            goto L_0x0005
        L_0x0069:
            java.lang.String r0 = "ۡۛۨۘۗۖ۬ۜ۫ۙۚۦۢۢ۬ۡ۠۟ۖۘۢۘ۬"
            goto L_0x0005
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.isOneUIOrBottomEnabled():boolean");
    }

    public static int isSwiRow(int i2) {
        String str = "ۤۦۥۢۛۖۘۚۢۖۘۜۨۢۛ۟ۚۡۧۥۖۡ۬ۛۘۧۘۗۙۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 918) ^ 1049104861) {
                case -1166087465:
                    return yo.getID(Deobfuscator$app$Custom.getString(-6964782661057L), Deobfuscator$app$Custom.getString(-7093631679937L));
                case 175587995:
                    String str2 = "۠۬ۖۘۨۥۨ۠ۤۛۖۗۖۙۨ۬ۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 372851295) {
                            case -1130404106:
                                str = "ۧ۬ۜۚۨۙۥۚۘۘ۟۬ۚۙۖۡۘۙ۟۫ۦۘۧۘۨۜ۠";
                                continue;
                            case 92119852:
                                str = "ۜ۟ۙۤۜۡۘۛۡۖ۠ۗۘۚ۠ۘۧۚۢ";
                                continue;
                            case 1641959497:
                                if (!yo.isSwipeEnabled()) {
                                    str2 = "ۚۢۜۢ۠ۗۘۖ۠ۢۤۥۘ۠ۤۜۘۡۙۖۡۢ۠ۦۛۛ";
                                    break;
                                } else {
                                    str2 = "ۤۘ۫ۧۨۦۥ۬۠ۤ۫ۨۘۘۢۧۘۛۖ۟۟ۜۘ";
                                    break;
                                }
                            case 1864072907:
                                str2 = "ۚ۟۬۟ۛ۠ۢۤۙۙۗۗۥۚۙۥۨۦ۟ۦۧۘۖۛۤ";
                                break;
                        }
                    }
                    break;
                case 829623322:
                    str = "ۘ۫ۨۘ۠۟ۦۨۖۜۙۦۖۘۢ۟۟ۤۙۦۘ";
                    break;
                case 1825810232:
                    return HomeStyle(i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int listbg_Color() {
        /*
            java.lang.String r0 = "ۗۛۡۡۤۥۘ۠ۗۘۘۛۤۚۖۥۚۧۚۦۘ۬ۥۥۘۨۨۦ۠ۨۡۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 662(0x296, float:9.28E-43)
            r3 = -552110412(0xffffffffdf1776b4, float:-1.0914109E19)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -680865966: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -7862430825921(0xfffff8d9629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getPrimaryColorRound()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.listbg_Color():int");
    }

    public static void mWall() {
        String str = "۠ۡۘۘۡۤۨۘۗۚۙۜۥۤۘۗۜۥۚۢ۠ۨۛۚۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 856) ^ -765448496) {
                case 1234939408:
                    return;
                case 2129428431:
                    others.MainBKC((FrameLayout) yo.Homeac.findViewById(yo.getID(Deobfuscator$app$Custom.getString(-8944762584513L), Deobfuscator$app$Custom.getString(-8970532388289L))));
                    str = "ۨۘۡۛۖۘۘۧۡۘۜۙۖۘۡۜۡۘۡ۬ۦ";
                    break;
            }
        }
    }

    public static void myname(C005402i r8) {
        String str = "ۥۥۦۘۢۛۗۥۥۘۘۦۥۚۛۡ۫ۤۥۨۢۨ۟ۛۛۛۦۚۗ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch ((str.hashCode() ^ 757) ^ 77042730) {
                case -964222289:
                    str = "ۙۡۧۘۚ۬ۤۦۚۜۘۧۥ۬۠ۦ۫ۡۥۤۥۛۦ";
                    break;
                case -854651146:
                    b(r8, str3);
                    str = "ۜ۠ۜۥۢۚۖۚۥۘۤۛۧۛۢۖۦۚ۟ۨۨۡۘ۟ۗۨۘ۬۟ۙ";
                    break;
                case -615030610:
                    str = "ۙ۟ۤۖۙۡۘۚۗۦ۟ۤۡۘۘۜ۠ۗۦۘۘۨۜۨۘۘ۬۟";
                    str3 = str2;
                    break;
                case -208076834:
                    str = "ۙ۟ۤۖۙۡۘۚۗۦ۟ۤۡۘۘۜ۠ۗۦۘۘۨۜۨۘۘ۬۟";
                    break;
                case -26493082:
                    str = "۠ۙۜۥۖۧۥۚۦۥۘۖۘۘۘۛ۬ۜۥۘۥۡۨ";
                    str3 = str4;
                    break;
                case 84648180:
                    str2 = yo.pname;
                    str = "ۛۡۘۨ۟ۜۘۙۨۥۨۤۦۛۘۚۨ۬ۗۥۧ";
                    break;
                case 223549864:
                    str4 = dep.getMyName();
                    str = "ۨۖۨۘۤ۫ۖۖۜۢۘۖۡۘ۫ۖۤ";
                    break;
                case 753092815:
                    String str5 = "ۜۦۖۗۦۙۤۦۤۛۧۘۛۖۧۘۖ۬ۗۦۗ۟ۢۥۜ";
                    while (true) {
                        switch (str5.hashCode() ^ 272535620) {
                            case -1960359153:
                                str5 = "۠ۡۨۘۡۙۙۛۧ۬ۘ۬۫ۧۚۢ۬ۢۙ۫۟ۥۤۖۘۚۜۘ";
                                break;
                            case -1820308990:
                                str = "ۛ۟ۜۘۡۙ۟ۜۗۥۜۘۤۗۖۥۤۚ";
                                continue;
                            case -1380737796:
                                if (!shp.getBoolean(Deobfuscator$app$Custom.getString(-6608300375489L))) {
                                    str5 = "ۖۚۖۚۢ۟ۙۙۥۘۖۧۗۖۥۤۗ۬ۤ۠ۥ۟";
                                    break;
                                } else {
                                    str5 = "ۙۛ۬ۙۡۙۢۦۗۦۘۘۨ۟ۢۧۧۚۨۤ۟ۦ۫ۧۙۧۡ";
                                    break;
                                }
                            case -1195298538:
                                str = "۠۟ۢ۫۫ۘ۬ۨۙ۟ۦۥۘۤۚۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1739057096:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x029e, code lost:
        r1 = "۫ۙ۟ۤ۬ۦۘۙ۫ۥۦۘۖۥۨۜۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void oneUI() {
        /*
            r14 = 1
            r3 = 0
            r6 = 0
            java.lang.String r0 = "ۤۖۥۘۘۗۧۤۙۖۘۘۦۜۘ۟۟۫"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r6
            r7 = r6
            r8 = r3
            r9 = r3
            r10 = r3
        L_0x000d:
            int r0 = r1.hashCode()
            r3 = 286(0x11e, float:4.01E-43)
            r11 = -1576906023(0xffffffffa20252d9, float:-1.7662144E-18)
            r0 = r0 ^ r3
            r0 = r0 ^ r11
            switch(r0) {
                case -2135438468: goto L_0x01e6;
                case -2096176710: goto L_0x0039;
                case -2089630252: goto L_0x013b;
                case -2022110861: goto L_0x0074;
                case -1785491300: goto L_0x00fc;
                case -1679091722: goto L_0x025c;
                case -1678521340: goto L_0x01c1;
                case -1584446467: goto L_0x0097;
                case -1392744339: goto L_0x006d;
                case -1382013005: goto L_0x00ab;
                case -1345044041: goto L_0x01a3;
                case -1242954639: goto L_0x0214;
                case -1214732208: goto L_0x0172;
                case -702698129: goto L_0x002a;
                case -646411435: goto L_0x01f4;
                case -559746561: goto L_0x0040;
                case -401279280: goto L_0x02a8;
                case -398054678: goto L_0x027f;
                case 89813978: goto L_0x015f;
                case 95035616: goto L_0x0062;
                case 354566246: goto L_0x0224;
                case 438537216: goto L_0x0204;
                case 480810784: goto L_0x001c;
                case 751609298: goto L_0x028c;
                case 831095563: goto L_0x0108;
                case 862156757: goto L_0x01cd;
                case 941461427: goto L_0x024f;
                case 1183280443: goto L_0x022c;
                case 1365771569: goto L_0x00f0;
                case 1606570023: goto L_0x012a;
                case 1659766033: goto L_0x00a3;
                case 1736719317: goto L_0x014c;
                case 1769421900: goto L_0x0157;
                case 1820590188: goto L_0x0185;
                case 2002883059: goto L_0x00ce;
                case 2055787070: goto L_0x02a3;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x000d
        L_0x001c:
            rc.whatsapp.home.HomeActivity.HomeView r0 = new rc.whatsapp.home.HomeActivity.HomeView
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac
            r0.<init>(r1)
            r0.startHome()
            java.lang.String r0 = "ۜۚۦۘ۬ۙۗۚۗۘۘۡۥ۬ۗۦۨ"
            r1 = r0
            goto L_0x000d
        L_0x002a:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.view.Window r0 = r0.getWindow()
            r1 = 32
            r0.setSoftInputMode(r1)
            java.lang.String r0 = "ۤۚۜۘۚۘ۫ۛۗۖۥۘۥۢ۬"
            r1 = r0
            goto L_0x000d
        L_0x0039:
            com.obwhatsapp.HomeActivity r3 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "۟ۛۡۘ۟۫ۥۘۧۨۦۢ۠ۙۤۥۨۘ۟ۘۤۘۡۛۛۨۥ"
            r1 = r0
            r10 = r3
            goto L_0x000d
        L_0x0040:
            r0 = -7991279844801(0xfffff8bb629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r12 = -8021344615873(0xfffff8b4629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.mTitle = r0
            java.lang.String r0 = "۠ۨۡۡۡۘۢۗۨۘۙۛ۫ۢۤۤ۫۬۬ۜ۫ۖۘۛۡۨۦۢۦ"
            r1 = r0
            goto L_0x000d
        L_0x0062:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            com.obwhatsapp.youbasha.task.utils.makeTextViewMarquee(r0)
            java.lang.String r0 = "ۚۨۜۘۚۙۥۘ۟۬ۢۖۙۥ۫ۥۘۘۥۧۛۖۙۧۜۘ"
            r1 = r0
            goto L_0x000d
        L_0x006d:
            com.obwhatsapp.HomeActivity r3 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "۠ۢ۬ۛۛۨۘۚۚ۟ۙ۫ۘۘۥۗۨۘۥ۟ۗۢۧۥۘۥۡۡ۫ۤۦۘ"
            r1 = r0
            r9 = r3
            goto L_0x000d
        L_0x0074:
            r0 = -8034229517761(0xfffff8b1629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r12 = -8072884223425(0xfffff8a8629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r9.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.mTitle2 = r0
            java.lang.String r0 = "۬ۥۚ۫ۧۖۘۢۜۡۘۜۚۨۧ۠ۘۘ۬ۦۦۘۜۛۜۘ"
            r1 = r0
            goto L_0x000d
        L_0x0097:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle2
            com.obwhatsapp.youbasha.task.utils.makeTextViewMarquee(r0)
            java.lang.String r0 = "۫ۖ۠ۗۖۥ۬ۙۜۨۧۘۙۤۜ"
            r1 = r0
            goto L_0x000d
        L_0x00a3:
            com.obwhatsapp.HomeActivity r3 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "ۜ۠ۥۘۢۨ۟ۢۖۘۦۘۘۘۦۖۘ"
            r1 = r0
            r8 = r3
            goto L_0x000d
        L_0x00ab:
            r0 = -8085769125313(0xfffff8a5629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r12 = -8128718798273(0xfffff89b629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.mSubTitle = r0
            java.lang.String r0 = "ۙ۟ۙۘۦ۫ۘۢ۬ۥ۟۠ۧۤۨۘۢۙۦ"
            r1 = r0
            goto L_0x000d
        L_0x00ce:
            r1 = 957169497(0x390d3f59, float:1.3470407E-4)
            java.lang.String r0 = "ۧۢۗۜۛ۟ۢۡۥۗۚۡۘۗۜۧۘۗۦۖ"
        L_0x00d3:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1154406644: goto L_0x00eb;
                case -721819459: goto L_0x0294;
                case 49896556: goto L_0x00dc;
                case 1754297589: goto L_0x00e8;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x00d3
        L_0x00dc:
            boolean r0 = isOneUIEnabled()
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "ۚۧۥۦۙ۫ۖۗۥۘ۬ۡۥۦ۬ۨۡۡۖۘۙ۟ۢۤۥۡ"
            goto L_0x00d3
        L_0x00e5:
            java.lang.String r0 = "ۥۚۤ۬ۜۜۛۘۧۡ۟ۥۙ۠ۖۘۙۙ۠ۧۡۛ"
            goto L_0x00d3
        L_0x00e8:
            java.lang.String r0 = "ۡۛۡۘۙۦۚ۠۫ۧۡۖۥۥ۫۫"
            goto L_0x00d3
        L_0x00eb:
            java.lang.String r0 = "۬۬ۤۥ۠ۙۘۛۖۘ۫ۤ۠۟۫۟ۜۦۤۛۗۥۘۧۥۥۘۦ۫ۖۘ"
            r1 = r0
            goto L_0x000d
        L_0x00f0:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            setToolbarTitle(r0, r14)
            java.lang.String r0 = "ۛۧۧۧۥۥۖ۬ۨ۠ۚۥۡۢۙۘۧۙۜۦۧ۬ۙۧۡۨ"
            r1 = r0
            goto L_0x000d
        L_0x00fc:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle2
            setToolbarTitle(r0, r14)
            java.lang.String r0 = "ۤۥۡۖ۫ۧۗۖۘ۟ۚۘۘۥۗۘۜۤۘۘ"
            r1 = r0
            goto L_0x000d
        L_0x0108:
            r1 = 1340760094(0x4fea601e, float:7.8643354E9)
            java.lang.String r0 = "ۡۙۘۘۨۡۜۘۙۜۨۘۦ۫ۡۜۦۖۘۖۜۘۦۥۜۙۥۥ"
        L_0x010d:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1880256789: goto L_0x0127;
                case -1270607598: goto L_0x0299;
                case -53228917: goto L_0x0116;
                case 1580677656: goto L_0x011e;
                default: goto L_0x0115;
            }
        L_0x0115:
            goto L_0x010d
        L_0x0116:
            java.lang.String r0 = "ۥۦۧۖۡۖۘۖۖ۬ۡۥۚۚۙ۬ۚۢۚۖ۬ۜۦۡ۠ۡ"
            r1 = r0
            goto L_0x000d
        L_0x011b:
            java.lang.String r0 = "ۚۛۧۧۦۜۘ۠ۦۜۘۢۢ۫ۡۨۚۗۡ۬ۗۖۜۗ۬ۨۢۡ"
            goto L_0x010d
        L_0x011e:
            boolean r0 = com.obwhatsapp.yo.yo.disableClickToOpenHiddenChats()
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "۫ۦۡۘۦ۠ۖۡۚ۬ۤۚۖۢ۫ۘۘۦۘۚۜۖۗ"
            goto L_0x010d
        L_0x0127:
            java.lang.String r0 = "ۛۤۜ۬ۘۖۘ۫۬ۛۢۦ۟۟ۛۘ۟ۘۚ۠ۤ۠"
            goto L_0x010d
        L_0x012a:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            com.obwhatsapp.yo.a0 r1 = new com.obwhatsapp.yo.a0
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            java.lang.String r0 = "ۜۙۥۘۛ۫ۘۢ۬ۡۖ۟ۦۘ۫۫۟ۖ۫ۥ۟ۛۨ۠ۦۚۢۢ"
            r1 = r0
            goto L_0x000d
        L_0x013b:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle2
            com.obwhatsapp.yo.a0 r1 = new com.obwhatsapp.yo.a0
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            java.lang.String r0 = "ۖۙۛۧۗۛۚۦۡۨۚۨۨۨۦ"
            r1 = r0
            goto L_0x000d
        L_0x014c:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            com.obwhatsapp.yo.yo.homeActionbarTitle = r0
            java.lang.String r0 = "ۛۤۘۘۙۢۡۥۡۨۘ۠۟ۨۚ۬ۜۘۦ۬ۙۖۦۨۦۢۨ"
            r1 = r0
            goto L_0x000d
        L_0x0157:
            com.obwhatsapp.yo.yo.H2()
            java.lang.String r0 = "ۢ۫ۡۨۨ۫۫ۨۘۘۛۚۤۘ۟ۜ۬ۖۧۘۨۖۦ"
            r1 = r0
            goto L_0x000d
        L_0x015f:
            r0 = -8141603700161(0xfffff898629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            boolean r3 = com.obwhatsapp.yo.shp.getBoolean(r0)
            java.lang.String r0 = "ۧۚۛ۠ۦۚۘ۫ۚ۬ۡۦۨۥۜۖۦۢۖۘۢۧۡ۟ۜۥ"
            r1 = r0
            r7 = r3
            goto L_0x000d
        L_0x0172:
            r0 = -8175963438529(0xfffff890629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            boolean r3 = com.obwhatsapp.yo.shp.getBoolean(r0)
            java.lang.String r0 = "ۗ۟ۛۧۘ۬ۛۥۚۛۖۥۘۗۖۖۘۘۜۦ"
            r1 = r0
            r5 = r3
            goto L_0x000d
        L_0x0185:
            r1 = 643378883(0x26592ec3, float:7.5350373E-16)
            java.lang.String r0 = "ۦ۟ۖۘۦۘۨ۟ۦۦۨۨۘۙۖۥۗۙۘۜۚۖ۫ۧ۠ۡۘ"
        L_0x018a:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1525311127: goto L_0x029e;
                case -296613346: goto L_0x01a0;
                case -257680140: goto L_0x0193;
                case 285073222: goto L_0x019b;
                default: goto L_0x0192;
            }
        L_0x0192:
            goto L_0x018a
        L_0x0193:
            java.lang.String r0 = "ۙ۠ۖۙ۠۠ۜۥۗۜۖ۠ۛۙۨۘۦۖۜ۫ۤۥ"
            r1 = r0
            goto L_0x000d
        L_0x0198:
            java.lang.String r0 = "ۖ۫ۨ۟ۥۙ۬ۛۗۢۡۚۘۥۥۢۡۧ۠ۨۥۘ۟۫"
            goto L_0x018a
        L_0x019b:
            if (r7 == 0) goto L_0x0198
            java.lang.String r0 = "ۖۥۨۛۨۦۘۖۡۜ۟ۖۥۗۧۗۘ۠۬ۛ۟۟۬۠"
            goto L_0x018a
        L_0x01a0:
            java.lang.String r0 = "ۨۜۦ۬ۦۙۥ۠۟ۖۤۙۨۚۛۛۚ۠ۛۘۨۘ۠ۡۡۘۥۘۛ"
            goto L_0x018a
        L_0x01a3:
            r1 = 743999051(0x2c58864b, float:3.0769994E-12)
            java.lang.String r0 = "ۙ۠ۨۘۜۧۦۘۗۖۨۘۗۙۛۧۧۘۙۘۦ"
        L_0x01a8:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -2096176274: goto L_0x01b7;
                case -1989495688: goto L_0x01bc;
                case 835713252: goto L_0x029e;
                case 1830130808: goto L_0x01b1;
                default: goto L_0x01b0;
            }
        L_0x01b0:
            goto L_0x01a8
        L_0x01b1:
            java.lang.String r0 = "ۡۗۖۨ۬ۙۗۜۦۤۗۢ۠۠۫ۦۚۡۘ"
            goto L_0x01a8
        L_0x01b4:
            java.lang.String r0 = "ۨۙۘۘ۟۬ۡۘۥ۬۬۫ۜۜۢ۬ۚۤۢۢ"
            goto L_0x01a8
        L_0x01b7:
            if (r5 != 0) goto L_0x01b4
            java.lang.String r0 = "ۘۢ۫۬ۜۢۢۦۤۦۧۖۧۢۢ۬ۢۡۛۢۤ"
            goto L_0x01a8
        L_0x01bc:
            java.lang.String r0 = "ۡۦۦۘۚ۫ۘۘۙ۠ۥۘۚ۠ۜۘۡۘۡۘۤۛۡۘۚۖۘۘ۬ۙ۬"
            r1 = r0
            goto L_0x000d
        L_0x01c1:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mSubTitle
            r0.setVisibility(r6)
            java.lang.String r0 = "ۘۜۨۘۘ۫ۖۘ۫ۚۦۘۜ۟ۜۘۙۡ۠ۘۚۨۘۚ۟۟ۖۗ۬"
            r1 = r0
            goto L_0x000d
        L_0x01cd:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mSubTitle
            r12 = -8223208078785(0xfffff885629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getMyStatus(r1)
            r0.setText(r1)
            java.lang.String r0 = "ۘۥۖۘۢۜۙ۠ۨۡۦۨۛۖۜۡۘۢۡۙ۠ۛۡ"
            r1 = r0
            goto L_0x000d
        L_0x01e6:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mSubTitle
            r1 = 8
            r0.setVisibility(r1)
            java.lang.String r0 = "ۧۢۛۨۢۥۘۥۘۘۛۘۗۚۨۖۘ"
            r1 = r0
            goto L_0x000d
        L_0x01f4:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            int r1 = TTextColor()
            r0.setTextColor(r1)
            java.lang.String r0 = "ۧۖۛۧۦۥۘۜۘۧۡۧ۠ۛۧۨۘۙۙۡۤ۟ۛۘۢۙ"
            r1 = r0
            goto L_0x000d
        L_0x0204:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle2
            int r1 = TTextColor()
            r0.setTextColor(r1)
            java.lang.String r0 = "۫ۦۥۘۡۗۘۤۚۘۦۨۥۘ۠۫ۖۘۧۧۨۥۘۥۘۤۨۘۘ۫ۨۡۘ"
            r1 = r0
            goto L_0x000d
        L_0x0214:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mSubTitle
            int r1 = TTextColor()
            r0.setTextColor(r1)
            java.lang.String r0 = "ۢۖۖۢۛۗ۠ۖۘۨۜۘۘۢ۬ۦۘۖۛۥۘۙۜۨۘ"
            r1 = r0
            goto L_0x000d
        L_0x0224:
            com.obwhatsapp.HomeActivity r3 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "ۙ۫ۡۡۤۚ۟ۘ۠۟ۢ۫ۥۘ"
            r1 = r0
            r4 = r3
            goto L_0x000d
        L_0x022c:
            r0 = -8326287293889(0xfffff86d629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r12 = -8373531934145(0xfffff862629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.mTitleContainer = r0
            java.lang.String r0 = "ۛ۟ۖۘۥۨۗ۠ۗۦ۫ۤۤۖۚۗۢۚۘ۟ۜ"
            r1 = r0
            goto L_0x000d
        L_0x024f:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            r1 = 4
            r0.setVisibility(r1)
            java.lang.String r0 = "ۚۦۚۢۛۧ۫ۗۢۜۘۧۤۤۦ"
            r1 = r0
            goto L_0x000d
        L_0x025c:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r2 = -8386416836033(0xfffff85f629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            r2 = -8437956443585(0xfffff853629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            java.lang.String r1 = "ۗ۬ۙۦۜۧۘۘ۠ۥۧ۟۫ۦۚۤۜ۫۫"
            r2 = r0
            goto L_0x000d
        L_0x027f:
            com.obwhatsapp.yo.b0 r0 = new com.obwhatsapp.yo.b0
            r0.<init>()
            r2.A01(r0)
            java.lang.String r0 = "ۢۧۚ۫ۗۜۦۤ۟ۧۥۘ۫۠۠۫ۢۜۘۤۙ۬ۜۢ۠ۦۜۘ"
            r1 = r0
            goto L_0x000d
        L_0x028c:
            r2.setBackgroundColor(r6)
            java.lang.String r0 = "ۗۗۧۦ۟ۧۤۗۨۛۘ۫۬ۛۚۘۨۦۖۖۛۤۜۧۗ۟ۨۘ"
            r1 = r0
            goto L_0x000d
        L_0x0294:
            java.lang.String r0 = "ۤۥۡۖ۫ۧۗۖۘ۟ۚۘۘۥۗۘۜۤۘۘ"
            r1 = r0
            goto L_0x000d
        L_0x0299:
            java.lang.String r0 = "ۖۙۛۧۗۛۚۦۡۨۚۨۨۨۦ"
            r1 = r0
            goto L_0x000d
        L_0x029e:
            java.lang.String r0 = "۫ۙ۟ۤ۬ۦۘۙ۫ۥۦۘۖۥۨۜۘ"
            r1 = r0
            goto L_0x000d
        L_0x02a3:
            java.lang.String r0 = "ۧۢۛۨۢۥۘۥۘۘۛۘۗۚۨۖۘ"
            r1 = r0
            goto L_0x000d
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.oneUI():void");
    }

    public static C005402i oneUITransToolbar(C005402i r4) {
        String str = "۠ۙۛۜۚ۠ۜۤۤۢ۫ۗۡۙۦ۟ۖۧۗۧۜۢۡ";
        while (true) {
            switch ((str.hashCode() ^ 318) ^ -645118330) {
                case -1783102503:
                    String str2 = "۫ۦۨۢۚۥۘ۟۫ۘۖۘۜ۟ۖۚۖۖۙۧۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1587432290) {
                            case -1957688315:
                                str = "ۢۧۜۘۙۖۦۚ۠ۖۘ۟ۧ۬ۡۡۡ";
                                continue;
                            case 46643141:
                                if (!isOneUIEnabled()) {
                                    str2 = "ۡۡۗۨۖۡۘۧۗۗ۫ۡۢۤۘۥۘ";
                                    break;
                                } else {
                                    str2 = "ۘۨۨۨۜۦۡۚۖۘ۟۠ۥۛ۟ۦۗۨۘۨۗ۬ۙۛ";
                                    break;
                                }
                            case 318729546:
                                str = "ۨۨۘۘۖۖۚۤۥۨۘ۟ۙۙۛ۟ۨۘ";
                                continue;
                            case 346914697:
                                str2 = "ۡۡۨۘۙۦۥۘۜۧ۬ۥ۟ۨۘۨۡۛ";
                                break;
                        }
                    }
                    break;
                case -1281922129:
                    str = "ۥ۠ۜۘۧۢۨ۫۫ۙۤۘۡۘۡ۟ۜۤۤۛۗۖ۫";
                    break;
                case -136302384:
                    return r4;
                case 1114491317:
                    r4.A0D(new ColorDrawable(0));
                    str = "ۨۨۘۘۖۖۚۤۥۨۘ۟ۙۙۛ۟ۨۘ";
                    break;
            }
        }
    }

    public static void pagerIndex(int i2, HomeActivity homeActivity) {
        String str = "ۖۙۥۘ۬۠۟۠ۤۜۘۖ۬ۙۧۥۥۘ";
        Toolbar toolbar = null;
        boolean z2 = false;
        boolean z3 = false;
        IGStatusesView iGStatusesView = null;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 68) ^ 1130510464) {
                case -1988860978:
                    z3 = true;
                    str = "۫ۛۨۘۙۖۛۤۜۘۧۚۡۘۦۗۨ۬ۢۛۧۚۥۘ";
                    break;
                case -1812012894:
                    setToolbarTitle(homeActivity.mTitle, i3);
                    str = "ۘۖۜۘۨۡ۬ۡۤۚۧۛۦۘۚ۠۟ۤۗۨۘۥۚۥۘ";
                    break;
                case -1529784528:
                    String str2 = "ۘۨۨۙۨۘ۬ۧ۟۠۟ۘۘۥۖ۠";
                    while (true) {
                        switch (str2.hashCode() ^ 63727144) {
                            case -1157845876:
                                str = "ۖۨۦۚۜۖ۟ۛۡۘۧۙ۟ۢۨۤۨۢۨ";
                                continue;
                            case -399038157:
                                str2 = "۫۬ۨۤۤۛ۠ۧۥ۫ۢۘۧ۠۠ۡ۬ۨۘ۫ۦۛ۬۟۬";
                                break;
                            case 1309781062:
                                str = "۬۬ۡۢۘۦۜۥۦۤۜۖۘۥۢۨۘۦ۠ۧۜۢۨۦ۫ۨۘ";
                                continue;
                            case 1985584341:
                                if (i3 != 0) {
                                    str2 = "ۙۜۖۘ۠ۨۨۘۙۧۥۘۜۜ۟ۢۤ۬ۢۗۜ۫ۛ";
                                    break;
                                } else {
                                    str2 = "ۢۥۧۢۛ۫۫ۤۤ۠ۛۢ۬ۨۗۡۛۨۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1038617497:
                    f541a.onPageListener(i3, homeActivity);
                    str = "ۦۚۦۘۡۡۖۘۥۤۗۥۖۧۘۥ۫۟ۨۥۗۖۖۨۥ۟ۘۘ";
                    break;
                case -1017980614:
                    String str3 = "ۨۜۥ۟ۚۨۗ۬ۢۤۤۥۘۥۜۖۘ۟ۥۡۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1945812984) {
                            case 344383471:
                                str = "ۤۚۙۡۥۘ۬ۢۥۤۗۥۥۨۜۘۘ۫";
                                continue;
                            case 425979876:
                                str3 = "ۘۚۘۘۖۥۘۚۜ۠ۢۖۖۘۙۖۨۘۧۜ۠ۧۖۧۡ۟ۦۘ۠ۢ۠";
                                break;
                            case 602244306:
                                if (!isOneUIEnabled()) {
                                    str3 = "ۥۡ۠ۚۧۤۦۦ۠ۥۤۘۛۚۥۧۜۡ";
                                    break;
                                } else {
                                    str3 = "ۜۜۦۘۗۨۤ۟ۛۗۙۦۢۜۚۥۘ";
                                    break;
                                }
                            case 1725862202:
                                str = "ۢۦۨۘۖ۫ۘۙ۫ۤ۠۬ۜۘ۬ۚۗۛۥ۠ۜ۠ۢۡۜۖۘ";
                                continue;
                        }
                    }
                    break;
                case -983717034:
                    yo.mIGStatusesView.setTranslationY(0.0f);
                    str = "ۘ۫ۨۘۘۗ۟ۛۙۨ۠ۧۘۘۗ۠ۛۛۡ۫ۡ۟۬ۖۦۘۥۥۥۘ";
                    break;
                case -796122468:
                    String str4 = "ۛ۠ۛۤۙۧۤۥ۫ۧۜۖۘ۬ۨۘۙۦۥۘۧۜۙۧۤ۠";
                    while (true) {
                        switch (str4.hashCode() ^ 2118551352) {
                            case -1643220259:
                                str = "۟ۥۦۙۘۨۘ۟ۜۥۘ۠ۢۘۘۤ۠ۨۧۘۜ";
                                continue;
                            case -37925138:
                                if (toolbar == null) {
                                    str4 = "ۙ۠ۨۨۦۜۙۛۖۘۘۨ۬ۛۢۛ۫ۧۚ";
                                    break;
                                } else {
                                    str4 = "ۚ۠ۨۙۗۨۙۖۖۘ۬ۙۖۧۚۨۛۥۘ۬۠ۧ";
                                    break;
                                }
                            case 245849952:
                                str4 = "ۢۜ۫ۘۦۢۦۖۘۘۨۛۥۘۢ۬ۢ۟۠۫۬ۦۧۘ";
                                break;
                            case 1495505006:
                                str = "ۢۛ۟ۗۨۜۛ۫ۥۘۜۢۜۘۙۘۡۘۛۨۥ";
                                continue;
                        }
                    }
                    break;
                case -757227077:
                    str = "ۨۨۨۖۘ۬ۡۡۤۚۗۖۘ۬ۨۧۚۘۨ";
                    break;
                case -598278999:
                    str = "ۥۨۙ۟ۚۙۤ۫ۢۥۤۜۜۜۘ";
                    i3 = u1.Tab_Index_Corrector(i2);
                    break;
                case -530937164:
                    f541a = new OnPageSelected();
                    str = "۬ۙۧۜ۫۟۬ۜۙ۫۠ۤۗۖ۟۠ۤۦ";
                    break;
                case -159473595:
                    iGStatusesView.setCameraTab(z2);
                    str = "ۛۗۨۘۧ۠ۘۘۡۨۧ۟ۗ۠ۨ۫ۥۢۖ۬ۖۥ";
                    break;
                case -3864168:
                    str = "ۤۨۘۡۛۙ۫ۤۚۢۥ۠ۗ۟ۨۘۨۖۘۘ";
                    break;
                case 1661269:
                    String str5 = "۠ۗۧۡۗۗ۫ۖۘۘۦۢۗۗۨۢۘۗۛۧۗۘۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 1596186072) {
                            case -1415777374:
                                str5 = "ۤۡۡۛۢۦۘۗ۫ۥۜۧۡۘۨۜۘ";
                                break;
                            case -768911594:
                                str = "۬ۢۘۘۦۗ۫ۗ۫۟ۙۡۜۘ۬۫ۥۘۘۤۡۦۥ۠ۜۢۥۘۧۙۨ";
                                continue;
                            case -89416654:
                                str = "ۘ۫ۨۘۘۗ۟ۛۙۨ۠ۧۘۘۗ۠ۛۛۡ۫ۡ۟۬ۖۦۘۥۥۥۘ";
                                continue;
                            case 2078527778:
                                if (iGStatusesView == null) {
                                    str5 = "ۤۚ۟ۘۙۥۘۥۛۖۘۙ۫ۢۙۨ۫ۛۖۖۜۤۜۘ۫ۤۡ";
                                    break;
                                } else {
                                    str5 = "ۗۢۡۜۘۤۨۢ۠۫ۚۚۡۙۛ۟ۧۤۘۡ۠ۙۚۢ";
                                    break;
                                }
                        }
                    }
                    break;
                case 206231044:
                    return;
                case 224555808:
                    homeActivity.A0J.setVisibility(0);
                    str = "۟ۥۦۙۘۨۘ۟ۜۥۘ۠ۢۘۘۤ۠ۨۧۘۜ";
                    break;
                case 518553074:
                    str = "ۢۖۜۘۧۦۖۘۘۖ۬ۡ۠ۦۘ۫ۧۡۘۡ۟ۨ۬ۧۨۨۨ۟۟ۥۘۘ";
                    break;
                case 896293552:
                    toolbar = homeActivity.A0J;
                    str = "ۡۦۘۧۡۨۢۛ۟ۨۧۥۘۦۥۦ۫۠ۜۡ۬ۛۥۨۜۘۡۧ";
                    break;
                case 1076598986:
                    String str6 = "۫ۙۜۘۛۘ۫ۨ۬ۘۨۘۥۢۚۗۡۘۦۗۙۛ";
                    while (true) {
                        switch (str6.hashCode() ^ 1178418464) {
                            case -926705735:
                                str = "ۦۥۜۘۥۘۛ۟۫ۗۗۗ۠ۨۨۚۖۛۤۢۧۜ";
                                continue;
                            case -644540146:
                                str = "۬ۙۧۜ۫۟۬ۜۙ۫۠ۤۗۖ۟۠ۤۦ";
                                continue;
                            case 1764305377:
                                str6 = "ۖۘۙۘۖۦۦۗۖۘۧۘۦۘۛۗۦۖ۟ۥ";
                                break;
                            case 2088200516:
                                if (f541a != null) {
                                    str6 = "۠ۘۖۤۚۥۘۘۧۡۘۧۦۦۘۙۚۘۙۛۥۘ";
                                    break;
                                } else {
                                    str6 = "ۨۗۡۘۧۖۦۚۖۡ۬ۢۦۘ۫ۜ۠ۦ۠ۘۘ۫ۡۛۗۜۗۗۨ۬";
                                    break;
                                }
                        }
                    }
                    break;
                case 1139704635:
                    str = "ۥۘ۫ۦ۫ۥۘۛۗۘۙۧۡۖۙۦ";
                    break;
                case 1455806724:
                    str = "ۧۖۧۗ۬ۡۘۧۤۧ۠ۜۧۧ۬۠";
                    z2 = z3;
                    break;
                case 1585597771:
                    str = "۠۠ۛۜۜۥۖۛۦۘۙۘۥۘۚۥۙۜۦ۫ۜ۬ۧ";
                    iGStatusesView = yo.mIGStatusesView;
                    break;
                case 1902748004:
                    str = "ۢۖۜۘۧۦۖۘۘۖ۬ۡ۠ۦۘ۫ۧۡۘۡ۟ۨ۬ۧۨۨۨ۟۟ۥۘۘ";
                    z2 = false;
                    break;
                case 2118514140:
                    toolbar.setTranslationY(0.0f);
                    str = "ۤ۟ۜۘۙۘۘۜۧۡۘۥ۫ۧ۟ۖۚۦۛ۟";
                    break;
                case 2127417604:
                    setToolbarTitle(homeActivity.mTitle2, i3);
                    str = "ۢۦۨۘۖ۫ۘۙ۫ۤ۠۬ۜۘ۬ۚۗۛۥ۠ۜ۠ۢۡۜۖۘ";
                    break;
            }
        }
    }

    public static void paintHomeFAB(Activity activity) {
        boolean z2 = shp.getBoolean(Deobfuscator$app$Custom.getString(-7252545469889L));
        try {
            int color = others.getColor(Deobfuscator$app$Custom.getString(-7291200175553L), ColorStore.getFabColorNormal());
            ImageView imageView = (ImageView) activity.findViewById(yo.getID(Deobfuscator$app$Custom.getString(-7368509586881L), Deobfuscator$app$Custom.getString(-7385689456065L)));
            Drawable background = imageView.getBackground();
            background.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            String str = "ۛۘۥۘۤ۫ۛۙۢۖۘ۫ۤ۫ۧۨۙۜ۬۟ۨۡۡۛۨۥۖۙۦ";
            while (true) {
                switch (str.hashCode() ^ 2135585862) {
                    case -1237243169:
                        if (!z2) {
                            str = "ۘۖ۠ۗۦۖۘۢۨۙۥۧۦ۠۟ۗۨۖۜۜۙ۫۠۟";
                            break;
                        } else {
                            str = "۟ۖۢ۬ۜۢۡۥۥۘۢۗۗۥ۫۠ۢۦۤۡۧۢۙۥۘ۬ۜۧ";
                            continue;
                        }
                    case -763605894:
                        imageView.setBackground(background);
                        break;
                    case 780102773:
                        str = "ۙ۬ۜۘۢۜۢ۫ۤۨۘ۫ۘۖۘۧۚ۟ۙۛۙ";
                        continue;
                    case 1879303867:
                        break;
                    default:
                        continue;
                }
            }
            imageView.setColorFilter(FloatingActionButton.getFABIconsColor(), PorterDuff.Mode.SRC_IN);
            ImageView imageView2 = (ImageView) activity.findViewById(yo.getID(Deobfuscator$app$Custom.getString(-7398574357953L), Deobfuscator$app$Custom.getString(-7445818998209L)));
            String str2 = "ۧۦ۬ۦۘۜۜۘۥۘۥۗۖۘۚ۟ۦۘۘۜۜ۫ۘۘۘ";
            while (true) {
                switch (str2.hashCode() ^ 725899304) {
                    case -1561415793:
                        str2 = "ۜۡۗ۫ۛۖۘۘۡۘۚ۬۫۟ۢ۫ۗۨۦۘ";
                        break;
                    case 972954709:
                        imageView2.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                        imageView2.setColorFilter(FloatingActionButton.getFABIconsColor(), PorterDuff.Mode.SRC_IN);
                        return;
                    case 1176089638:
                        if (imageView2 == null) {
                            str2 = "ۙ۠۠ۖۥۨۗۡۡۡۙۜۘ۠ۘ۬ۙۦۢۦۨۥۛ۠ۚ";
                            break;
                        } else {
                            str2 = "ۡۨۘۛۛ۠ۛۢۤۤۜۦۦۢۦۘۧۖۡ۫";
                            break;
                        }
                    case 1744480470:
                        return;
                }
            }
        } catch (Exception e2) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x008e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void sendStatusShowConfirmation(com.obwhatsapp.mediacomposer.MediaComposerActivity r8, android.view.View r9, android.view.View.OnClickListener r10) {
        /*
            r4 = 0
            r3 = 1
            r0 = -9490223431105(0xfffff75e629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r6 = -9494518398401(0xfffff75d629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            r1.add(r2)
            android.content.Intent r2 = r8.getIntent()     // Catch:{ Exception -> 0x0107 }
            r6 = -9507403300289(0xfffff75a629a823f, double:NaN)
            java.lang.String r5 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x0107 }
            java.util.ArrayList r1 = r2.getStringArrayListExtra(r5)     // Catch:{ Exception -> 0x0107 }
            r6 = -9528878136769(0xfffff755629a823f, double:NaN)
            java.lang.String r5 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r0 = r2.getStringExtra(r5)     // Catch:{ Exception -> 0x0107 }
        L_0x003a:
            r5 = -428435750(0xffffffffe67696da, float:-2.9112122E23)
            java.lang.String r2 = "ۙۜۘۢۤۨۗۥۨ۫ۡۙۤۧ۬"
        L_0x003f:
            int r6 = r2.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case 82923347: goto L_0x0064;
                case 398131165: goto L_0x0048;
                case 929655957: goto L_0x005c;
                case 2011568350: goto L_0x0061;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x003f
        L_0x0048:
            r2 = 1074941232(0x40124d30, float:2.2859612)
            java.lang.String r1 = "ۧۦ۟ۜۛۡۛۧۖۤۧۢۛ۬ۦۘۗۤ۟ۦۗۛۥۙۨۖ۟ۗ"
        L_0x004d:
            int r5 = r1.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1867055332: goto L_0x00ad;
                case -1520606597: goto L_0x0056;
                case 1139274088: goto L_0x00b2;
                case 1805666479: goto L_0x00d8;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x004d
        L_0x0056:
            java.lang.String r1 = "ۡ۬ۘۡۨۦۘۥۨۜۘۤۧۧۨۡ۟ۦ۬ۘۚۢ۫"
            goto L_0x004d
        L_0x0059:
            java.lang.String r2 = "ۦۥۛ۠ۦۨۘۧۙۖۘۜۛۖۛۙۦۡۜۙ"
            goto L_0x003f
        L_0x005c:
            if (r1 == 0) goto L_0x0059
            java.lang.String r2 = "ۡۛۦۘۘۤ۫ۜ۟ۙ۟۫ۡۘۗۗۜۗۥۘۘۛۚۧ"
            goto L_0x003f
        L_0x0061:
            java.lang.String r2 = "ۥۥۡۧۖ۬ۖۤۤۚۗۘۥۛۨۘۛۤۖۧۘ۠"
            goto L_0x003f
        L_0x0064:
            r5 = 562766736(0x218b2390, float:9.42842E-19)
            java.lang.String r2 = "ۧۨۧۘۛۖۥۘۦۜۡۛۡۨۥۧۜ"
        L_0x0069:
            int r6 = r2.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1332989677: goto L_0x0048;
                case -318587015: goto L_0x0072;
                case 647820609: goto L_0x00a7;
                case 723252627: goto L_0x0095;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            r0 = r4
        L_0x0073:
            r6 = -9692086894017(0xfffff72f629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            boolean r2 = com.obwhatsapp.yo.shp.getBoolean(r1, r4)
            r4 = -521445849(0xffffffffe0eb5e27, float:-1.3568029E20)
            java.lang.String r1 = "ۦ۫ۥۘۦۘۜۤۚۘۘۖ۫ۤۜۥۗۜۦ۬"
        L_0x0085:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1158040603: goto L_0x008e;
                case -944976452: goto L_0x00dd;
                case 140613042: goto L_0x00e5;
                case 932081983: goto L_0x00e2;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0085
        L_0x008e:
            r9.setOnClickListener(r10)
        L_0x0091:
            return
        L_0x0092:
            java.lang.String r2 = "۟۫ۥۧۢ۠ۗۖۡۘۛۤ۟ۜۛۜ"
            goto L_0x0069
        L_0x0095:
            r6 = -9546058005953(0xfffff751629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = "ۢ۟۫۠ۘۘۧۚۜ۠۟ۢۨ۠ۗ۟ۖ۫ۧۘۘۗۚۚ"
            goto L_0x0069
        L_0x00a7:
            java.lang.String r2 = "۫ۜۥۘ۟ۗۛۦۗۤ۠۟ۖۘ۫ۚ۬ۘۖۡۘۜ۫۟۠ۦۜ"
            goto L_0x0069
        L_0x00aa:
            java.lang.String r1 = "ۦۦ۬ۤۡۙۧۙۨۘۨۨۙۗۦۗ۠"
            goto L_0x004d
        L_0x00ad:
            if (r0 == 0) goto L_0x00aa
            java.lang.String r1 = "ۤۗ۠ۡۦ۟ۦۜۥۘۜ۟ۖۚۙۡۘۡۨۧۙ۠۠ۖۨ۬ۨۨۙ"
            goto L_0x004d
        L_0x00b2:
            r2 = 169379659(0xa18874b, float:7.3439796E-33)
            java.lang.String r1 = "ۨۡۨ۫ۡ۟ۜۚۘۘۚۜۜۚۤۥۘ۟ۧۨۦۖ۟ۤ۫ۢ"
        L_0x00b7:
            int r5 = r1.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1729036673: goto L_0x00d8;
                case 166301286: goto L_0x00c6;
                case 892588743: goto L_0x0072;
                case 1747815305: goto L_0x00c0;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            goto L_0x00b7
        L_0x00c0:
            java.lang.String r1 = "ۛ۫ۡۖ۟ۨۥ۟ۦۘۛ۫ۤۦۚۢۨۤۨۜۨۨۘ"
            goto L_0x00b7
        L_0x00c3:
            java.lang.String r1 = "ۖۨۧۤ۫ۤۤۢۡۘ۟۫ۥۘ۫ۖۚ۟ۙ۠۬ۥ"
            goto L_0x00b7
        L_0x00c6:
            r6 = -9619072449985(0xfffff740629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00c3
            java.lang.String r1 = "ۢۘۘ۠۠ۗۢۧۤۨۧۖۘۢۧۚۙۜۡۚۜۖۘۙۙۚ"
            goto L_0x00b7
        L_0x00d8:
            r0 = r3
            goto L_0x0073
        L_0x00da:
            java.lang.String r1 = "۟۫ۨۘۙۡۦۜۜۧۘۤ۟ۘۘۨۢۙۧۧۙۚۘۥ۟۫ۢۥۘ۬"
            goto L_0x0085
        L_0x00dd:
            if (r0 == 0) goto L_0x00da
            java.lang.String r1 = "ۨ۟ۙۧ۬ۙۚ۠ۨۘۥۘۧۢ۟ۙۘۢۘۘۡ۟ۡۘۤۧۥۤ۟ۦ"
            goto L_0x0085
        L_0x00e2:
            java.lang.String r1 = "ۗۦۖۢۥۤ۠ۙۡۘۥۗۧ۫ۗ۬"
            goto L_0x0085
        L_0x00e5:
            r1 = 646535324(0x2689589c, float:9.530302E-16)
            java.lang.String r0 = "ۥ۟ۘۘۛۨۗۨۛۜۧۙۗۘ"
        L_0x00ea:
            int r4 = r0.hashCode()
            r4 = r4 ^ r1
            switch(r4) {
                case -1693467286: goto L_0x008e;
                case 156569852: goto L_0x00fe;
                case 1785811498: goto L_0x00f3;
                case 1910077392: goto L_0x00f9;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            goto L_0x00ea
        L_0x00f3:
            java.lang.String r0 = "ۤ۠ۡۤۡۖۙۤۜ۬ۨۘۙ۬ۖ۫ۨۡۘۘۚۚ"
            goto L_0x00ea
        L_0x00f6:
            java.lang.String r0 = "ۦۚۡۜ۫ۡۘۙۡۡۘ۬ۤ۟ۗۥ۟ۗۗۨۘۙۗ۠"
            goto L_0x00ea
        L_0x00f9:
            if (r2 == 0) goto L_0x00f6
            java.lang.String r0 = "ۘۤۘ۫ۧۘ۬ۤۥۛۛ۫ۥ۠۟"
            goto L_0x00ea
        L_0x00fe:
            c.a r0 = new c.a
            r0.<init>(r8, r10, r9, r3)
            r9.setOnClickListener(r0)
            goto L_0x0091
        L_0x0107:
            r2 = move-exception
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.sendStatusShowConfirmation(com.obwhatsapp.mediacomposer.MediaComposerActivity, android.view.View, android.view.View$OnClickListener):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0418, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0391, code lost:
        r4 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04a5 A[FALL_THROUGH, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setHoMenu(android.view.Menu r11) {
        /*
            r9 = -2
            r8 = 12
            r2 = 1
            r10 = 10
            r3 = 0
            r1 = 800279741(0x2fb34cbd, float:3.2614436E-10)
            java.lang.String r0 = "ۘۘۥۘۜۥۘۘۤۛۤۧۤۚۘۥۦۘۙۤ۟"
        L_0x000c:
            int r4 = r0.hashCode()
            r4 = r4 ^ r1
            switch(r4) {
                case -215645036: goto L_0x0015;
                case 423604609: goto L_0x0305;
                case 633138843: goto L_0x0021;
                case 914589172: goto L_0x0024;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x000c
        L_0x0015:
            int r0 = r11.size()
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "ۖۤۗ۬ۡۧۘۨۜۗۦۖۢۜۧ۫ۨ۫ۡۖۦۦۘ۠ۤۨ"
            goto L_0x000c
        L_0x001e:
            java.lang.String r0 = "ۧۢۖ۟ۖ۫ۧۚ۠ۦ۠ۘ۟ۡۧۙۥۘۚۖۜۘ"
            goto L_0x000c
        L_0x0021:
            java.lang.String r0 = "ۨ۫ۡۘۘۡۛۥۢۙۦۡ۟ۖۤۜ۟ۡ۬"
            goto L_0x000c
        L_0x0024:
            com.obwhatsapp.yo.yo.follow_div(r11)
            com.B58works.B58.masfollow(r11)
            r0 = -5513083715009(0xfffffafc629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r4 = -5534558551489(0xfffffaf7629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            r4 = -5547443453377(0xfffffaf4629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            android.view.MenuItem r1 = r11.add(r10, r0, r3, r1)
            com.obwhatsapp.yo.w r4 = new com.obwhatsapp.yo.w
            r5 = 7
            r4.<init>(r5)
            r1.setOnMenuItemClickListener(r4)
            r4 = -5577508224449(0xfffffaed629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            android.view.MenuItem r1 = r11.add(r10, r0, r3, r1)
            com.obwhatsapp.yo.w r4 = new com.obwhatsapp.yo.w
            r5 = 8
            r4.<init>(r5)
            r1.setOnMenuItemClickListener(r4)
            r4 = -5663407570369(0xfffffad9629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            android.view.MenuItem r1 = r11.add(r10, r0, r3, r1)
            com.obwhatsapp.yo.w r4 = new com.obwhatsapp.yo.w
            r5 = 9
            r4.<init>(r5)
            r1.setOnMenuItemClickListener(r4)
            r4 = -5749306916289(0xfffffac5629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            android.view.MenuItem r1 = r11.add(r10, r0, r3, r1)
            com.obwhatsapp.yo.w r4 = new com.obwhatsapp.yo.w
            r4.<init>(r10)
            r1.setOnMenuItemClickListener(r4)
            r4 = -5796551556545(0xfffffaba629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            android.view.MenuItem r1 = r11.add(r10, r0, r3, r1)
            com.obwhatsapp.yo.w r4 = new com.obwhatsapp.yo.w
            r5 = 11
            r4.<init>(r5)
            r1.setOnMenuItemClickListener(r4)
            r4 = -5830911294913(0xfffffab2629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r1)
            android.view.MenuItem r1 = r11.add(r10, r0, r3, r1)
            com.obwhatsapp.yo.w r4 = new com.obwhatsapp.yo.w
            r4.<init>(r8)
            r1.setOnMenuItemClickListener(r4)
            r1 = 30
            r4 = -5895335804353(0xfffffaa3629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r4 = com.obwhatsapp.yo.yo.getString((java.lang.String) r4)
            android.view.MenuItem r0 = r11.add(r1, r0, r3, r4)
            com.obwhatsapp.yo.w r1 = new com.obwhatsapp.yo.w
            r4 = 13
            r1.<init>(r4)
            r0.setOnMenuItemClickListener(r1)
            addSwitchAccount(r11)
            r1 = 593471820(0x235fa94c, float:1.2124704E-17)
            java.lang.String r0 = "ۘ۟ۨ۬۟ۘۨ۠ۨ۫ۤ۟ۜۗۥ۫ۦۤۧۙۡۘ"
        L_0x0102:
            int r4 = r0.hashCode()
            r4 = r4 ^ r1
            switch(r4) {
                case -1023515346: goto L_0x010b;
                case 162993854: goto L_0x011a;
                case 619200615: goto L_0x0117;
                case 2140416287: goto L_0x01ed;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x0102
        L_0x010b:
            boolean r0 = showAirplaneMode()
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "ۤ۠۟۟ۛۧۖۥ۬۬ۤۜۘۙ۫ۨۛۙۜۘۜۚۥۘ۟ۡۜۤ۫ۖۘ"
            goto L_0x0102
        L_0x0114:
            java.lang.String r0 = "ۡۚ۠ۛۚ۟ۥۨ۠ۡ۫ۚۧۛۜۘ۫ۧ۫۠۟"
            goto L_0x0102
        L_0x0117:
            java.lang.String r0 = "ۖۥۛۥ۫ۢۖۦۢۙۛۗ۠ۗ۟ۢۜۢۢ۟ۥۚۘ"
            goto L_0x0102
        L_0x011a:
            r0 = -6251818089921(0xfffffa50629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r4 = -6273292926401(0xfffffa4b629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            boolean r4 = getAirplaneMode()
            r6 = -6286177828289(0xfffffa48629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            android.view.MenuItem r5 = r11.add(r10, r0, r3, r1)
            r1 = -20928822(0xfffffffffec0a6ca, float:-1.280389E38)
            java.lang.String r0 = "ۚ۫۠۠۠۠ۡۛۧ۬ۧۗۡ۫ۜۜۥ۠ۧۘ۬ۤۛۢۦۡۨۘ"
        L_0x0146:
            int r6 = r0.hashCode()
            r6 = r6 ^ r1
            switch(r6) {
                case -2012148358: goto L_0x014f;
                case -1930675453: goto L_0x01b8;
                case -1929877247: goto L_0x015a;
                case -374555126: goto L_0x0155;
                default: goto L_0x014e;
            }
        L_0x014e:
            goto L_0x0146
        L_0x014f:
            java.lang.String r0 = "ۦۛۡۘۦۖۜۘ۫ۜ۫ۨۖۨۘۙ۟ۖۘ۠ۜۛ۫۫ۢ۟۠ۙۘۥۧۘ"
            goto L_0x0146
        L_0x0152:
            java.lang.String r0 = "ۙۡۘۘۢۚۥۛ۬ۨۘۨۦۨۘۥ۬۬ۖۢۛۥۖۜ۠۠ۜۘ"
            goto L_0x0146
        L_0x0155:
            if (r4 == 0) goto L_0x0152
            java.lang.String r0 = "ۙۖ۬ۢۚۜۡۢۨۘۖۚۨۘۢۢ۠۫ۢۥۘ"
            goto L_0x0146
        L_0x015a:
            r0 = -6290472795585(0xfffffa47629a823f, double:NaN)
        L_0x015f:
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            r6 = -6384962076097(0xfffffa31629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r6)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r1, r0)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            int r6 = TTextColor()
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r6, r7)
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r6 = com.obwhatsapp.yo.yo.getCtx()
            r1.<init>(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r9, r9)
            r1.setLayoutParams(r6)
            int r6 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r8)
            int r7 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r8)
            r1.setPadding(r6, r3, r7, r3)
            r1.setImageDrawable(r0)
            r5.setActionView(r1)
            r6 = -588631080(0xffffffffdcea33d8, float:-5.27377179E17)
            java.lang.String r0 = "ۙۖۜۘۤ۬ۧۛۘۧۘ۫ۤ۫ۜۡۘۚۧۧۜۡۡۘ"
        L_0x01ac:
            int r7 = r0.hashCode()
            r7 = r7 ^ r6
            switch(r7) {
                case -860607478: goto L_0x01b5;
                case -264682119: goto L_0x01c1;
                case -28779274: goto L_0x01c6;
                case 1192546291: goto L_0x01e0;
                default: goto L_0x01b4;
            }
        L_0x01b4:
            goto L_0x01ac
        L_0x01b5:
            java.lang.String r0 = "ۡۤۙۖۡ۠ۧۧۚۜ۠ۛۚۤۙۙۘۖۤۦۖۤۨ۟ۖۙ"
            goto L_0x01ac
        L_0x01b8:
            r0 = -6329127501249(0xfffffa3e629a823f, double:NaN)
            goto L_0x015f
        L_0x01be:
            java.lang.String r0 = "ۛۤۥۦ۫ۧ۬ۨۡۘۡۙۜۘۖۚۜ"
            goto L_0x01ac
        L_0x01c1:
            if (r4 == 0) goto L_0x01be
            java.lang.String r0 = "۠ۦۨۗۢۧۚۖۗ۫ۖۦۤۤۖۘۗۛۦۘ"
            goto L_0x01ac
        L_0x01c6:
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r6 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r6)
            r6 = 1000(0x3e8, double:4.94E-321)
            r0.setDuration(r6)
            r4 = -1
            r0.setRepeatCount(r4)
            r4 = 2
            r0.setRepeatMode(r4)
            r1.startAnimation(r0)
        L_0x01e0:
            com.obwhatsapp.yo.a0 r0 = new com.obwhatsapp.yo.a0
            r4 = 3
            r0.<init>(r4)
            r1.setOnClickListener(r0)
            r0 = 2
            r5.setShowAsAction(r0)
        L_0x01ed:
            r1 = -1742964488(0xffffffff981c78f8, float:-2.0223601E-24)
            java.lang.String r0 = "ۧۘ۫۠ۖۨۘۜۦۖۨ۠ۢۙ۠ۦۘۙ۫ۖۧ۠۠ۜۜۜ۫ۙ۠"
        L_0x01f2:
            int r4 = r0.hashCode()
            r4 = r4 ^ r1
            switch(r4) {
                case -1853734544: goto L_0x02a3;
                case -1322188312: goto L_0x0201;
                case 850098838: goto L_0x020a;
                case 1211050828: goto L_0x01fb;
                default: goto L_0x01fa;
            }
        L_0x01fa:
            goto L_0x01f2
        L_0x01fb:
            java.lang.String r0 = "ۜۜۜ۫۟ۨۛۜۦۘۡۖۦۛۘۜۤۧۘۘۛۧ"
            goto L_0x01f2
        L_0x01fe:
            java.lang.String r0 = "ۢۙۥۖۜۦۙۧۛۗۖۚۘ۠ۖ"
            goto L_0x01f2
        L_0x0201:
            boolean r0 = showNightMode()
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = "۬ۗ۫ۛۧۜۛۤ۫ۛۡۡۘۛۜۤ"
            goto L_0x01f2
        L_0x020a:
            r0 = -6135853972929(0xfffffa6b629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r4 = -6157328809409(0xfffffa66629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            boolean r4 = com.obwhatsapp.yo.yo.isNightModeActive()
            r6 = -6170213711297(0xfffffa63629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            android.view.MenuItem r5 = r11.add(r10, r0, r3, r1)
            r1 = 247847920(0xec5dbf0, float:4.877604E-30)
            java.lang.String r0 = "ۤۜۡۦۨۧۘۥۡۜۖۤ۟ۘۢۖۘۥۡۖ"
        L_0x0236:
            int r6 = r0.hashCode()
            r6 = r6 ^ r1
            switch(r6) {
                case -1625709939: goto L_0x0306;
                case -1332865813: goto L_0x0247;
                case 1393832989: goto L_0x024a;
                case 1912954545: goto L_0x023f;
                default: goto L_0x023e;
            }
        L_0x023e:
            goto L_0x0236
        L_0x023f:
            if (r4 == 0) goto L_0x0244
            java.lang.String r0 = "۬ۨۜۘۥ۠ۤ۠ۨۥۖۛۙ۬۬ۥۘۡۢۦۘۜۘۧۘ"
            goto L_0x0236
        L_0x0244:
            java.lang.String r0 = "ۛۦۖۘۧۤۢۡ۟ۨۛ۫ۛۢۜۥۖۘ۟ۘۚۨۘ"
            goto L_0x0236
        L_0x0247:
            java.lang.String r0 = "ۥۤۢۨ۬ۤ۠ۡۥۘۡۢۘۘۤۘۙۘۘۘۘۜۙۖۚۧ۠"
            goto L_0x0236
        L_0x024a:
            r0 = -6174508678593(0xfffffa62629a823f, double:NaN)
        L_0x024f:
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            r6 = -6213163384257(0xfffffa59629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r6)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r1, r0)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            int r6 = TTextColor()
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r6, r7)
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r6 = com.obwhatsapp.yo.yo.getCtx()
            r1.<init>(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r9, r9)
            r1.setLayoutParams(r6)
            int r6 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r8)
            int r7 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r8)
            r1.setPadding(r6, r3, r7, r3)
            r1.setImageDrawable(r0)
            r5.setActionView(r1)
            com.obwhatsapp.yo.e0 r0 = new com.obwhatsapp.yo.e0
            r0.<init>(r4)
            r1.setOnClickListener(r0)
            r0 = 2
            r5.setShowAsAction(r0)
        L_0x02a3:
            android.content.Context r0 = com.obwhatsapp.yo.yo.getCtx()
            r4 = -5942580444609(0xfffffa98629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -6015594888641(0xfffffa87629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r4)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r0, r1)
            android.graphics.drawable.Drawable r1 = r0.mutate()
            int r4 = TTextColor()
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r4, r5)
            r4 = -6054249594305(0xfffffa7e629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            r4 = -6122969071041(0xfffffa6e629a823f, double:NaN)
            java.lang.String r4 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r4)
            r4 = 17039372(0x104000c, float:2.4244605E-38)
            android.view.MenuItem r1 = r11.add(r3, r1, r3, r4)
            android.view.MenuItem r0 = r1.setIcon(r0)
            android.view.MenuItem r0 = r0.setVisible(r2)
            r1 = 2
            r0.setShowAsAction(r1)
            r1 = -1249098001(0xffffffffb58c46ef, float:-1.0451457E-6)
            java.lang.String r0 = "ۢۡۚۚۢۢ۠ۢۙ۠۬ۜ۫ۦۘۘۛۘ۟۠ۡۖ"
        L_0x02fc:
            int r4 = r0.hashCode()
            r4 = r4 ^ r1
            switch(r4) {
                case -1885558971: goto L_0x031a;
                case 224040630: goto L_0x0305;
                case 1188845609: goto L_0x0310;
                case 1555819534: goto L_0x0317;
                default: goto L_0x0304;
            }
        L_0x0304:
            goto L_0x02fc
        L_0x0305:
            return
        L_0x0306:
            r0 = -6191688547777(0xfffffa5e629a823f, double:NaN)
            goto L_0x024f
        L_0x030d:
            java.lang.String r0 = "ۜ۠ۧۗ۟ۡ۠ۘۨۜۚۖۘۤ۬ۤۖۘۨ۬ۦۗ"
            goto L_0x02fc
        L_0x0310:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "ۡۜۧۘۤۧۘۜۜۖۜۗۨۘۧۗۦۡۦ۬ۦۢۨۨۜۘ"
            goto L_0x02fc
        L_0x0317:
            java.lang.String r0 = "ۖۗۢ۬ۚۚۢ۟ۘۡۜۚۡۧۦۘۙۘۤۨۡۥۘ"
            goto L_0x02fc
        L_0x031a:
            boolean r7 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            int r6 = r0.A03
            r1 = -480077955(0xffffffffe362977d, float:-4.17988E21)
            java.lang.String r0 = "ۦۚۦۦۧۧۧۨۘۦۘ۠ۜۜۧۤ۫ۙ۟ۚۤۤ۫ۦۘ"
        L_0x0327:
            int r4 = r0.hashCode()
            r4 = r4 ^ r1
            switch(r4) {
                case -2035782227: goto L_0x033d;
                case -34065316: goto L_0x0351;
                case 864697328: goto L_0x0330;
                case 1926980945: goto L_0x0336;
                default: goto L_0x032f;
            }
        L_0x032f:
            goto L_0x0327
        L_0x0330:
            java.lang.String r0 = "ۢۡۦ۬ۢۖ۟ۦ۟۟ۙۥۤۘۡۘۙۢۦۘ۠۫ۨۘۘۗۜ"
            goto L_0x0327
        L_0x0333:
            java.lang.String r0 = "ۙ۬ۤۘۨ۬۠ۖۘ۟ۚۨۘ۟ۡۖۘۦۦ۫ۨۨۜۘ"
            goto L_0x0327
        L_0x0336:
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x0333
            java.lang.String r0 = "ۖۙ۫ۦۥۦۧۡۡ۬۠ۤۨۙۦ"
            goto L_0x0327
        L_0x033d:
            r0 = r2
        L_0x033e:
            r4 = -1051469174(0xffffffffc153da8a, float:-13.240854)
            java.lang.String r1 = "ۧ۫ۦۖ۫ۥۘۦۧۤۤ۫۬۫ۡۘۨۢۖۘۛۙۜۘ۟۠ۦۘۖۦۦۘ"
        L_0x0343:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1314334741: goto L_0x034c;
                case -1124102949: goto L_0x0359;
                case -817675133: goto L_0x03a5;
                case -148584721: goto L_0x0356;
                default: goto L_0x034b;
            }
        L_0x034b:
            goto L_0x0343
        L_0x034c:
            if (r7 == 0) goto L_0x0353
            java.lang.String r1 = "ۦ۫ۥۘۧ۫ۖۘۙۖۙ۬ۦۡ۬۬ۖۤۗ۠ۛ۠"
            goto L_0x0343
        L_0x0351:
            r0 = r3
            goto L_0x033e
        L_0x0353:
            java.lang.String r1 = "ۘۤ۟ۤۧۧۦۤۧۨۢۛۖۜۧۘۥ۬ۧۧ۠ۢ"
            goto L_0x0343
        L_0x0356:
            java.lang.String r1 = "ۥۖۥۦ۟۟ۜۢۖۘۥۢۢ۠ۖ۬۫۬۠ۛۦۘۚ۬ۜ"
            goto L_0x0343
        L_0x0359:
            r4 = 1509930051(0x59ffb443, float:8.9967899E15)
            java.lang.String r1 = "ۚۚۡۘۡۢۘۘۥۡۘ۠ۙۥۘۜۗۡۤۚ۫۠ۚۘۘۥ۠ۜ"
        L_0x035e:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -600047723: goto L_0x0374;
                case -303687537: goto L_0x0371;
                case -84087427: goto L_0x03a5;
                case 1425337675: goto L_0x0367;
                default: goto L_0x0366;
            }
        L_0x0366:
            goto L_0x035e
        L_0x0367:
            r1 = 300(0x12c, float:4.2E-43)
            if (r6 != r1) goto L_0x036e
            java.lang.String r1 = "ۚۖۗۡۦۛۜۙۦۚۤۖۘ۠ۥۖۥۖۦۘۤۚۘۘۤۦۦۦۢۜ"
            goto L_0x035e
        L_0x036e:
            java.lang.String r1 = "ۜۘۡۘۢۛۧۖۦ۫۟۬ۥۘ۫ۚۡۘۡۧۜۘۢۧۜۘۢ۬ۡۡۡ۬"
            goto L_0x035e
        L_0x0371:
            java.lang.String r1 = "۫ۛۢۤۙۢۜۤۛۦۘۘۘۥ۟ۚ"
            goto L_0x035e
        L_0x0374:
            r1 = r2
        L_0x0375:
            r5 = -57438589(0xfffffffffc938e83, float:-6.129265E36)
            java.lang.String r4 = "ۧۜ۬ۤۜۙۥۤۢۙۜۘۤ۬ۨۘۤۚۦۘۚۥۦۘ"
        L_0x037a:
            int r8 = r4.hashCode()
            r8 = r8 ^ r5
            switch(r8) {
                case 216035409: goto L_0x03bf;
                case 428689850: goto L_0x03aa;
                case 576020027: goto L_0x0383;
                case 1080081812: goto L_0x03af;
                default: goto L_0x0382;
            }
        L_0x0382:
            goto L_0x037a
        L_0x0383:
            r5 = -733612874(0xffffffffd445f4b6, float:-3.4008565E12)
            java.lang.String r4 = "ۧ۬ۥۘۡۚۨۘۨۧۖۘ۬۬ۡۘۧ۫ۧ"
        L_0x0388:
            int r8 = r4.hashCode()
            r8 = r8 ^ r5
            switch(r8) {
                case -2108560045: goto L_0x0391;
                case -1596686599: goto L_0x03da;
                case 232611548: goto L_0x03bc;
                case 870798460: goto L_0x03b5;
                default: goto L_0x0390;
            }
        L_0x0390:
            goto L_0x0388
        L_0x0391:
            r4 = r2
        L_0x0392:
            r8 = 700991118(0x29c8468e, float:8.8940235E-14)
            java.lang.String r5 = "۟ۙ۬ۚۖۧۘۡۙۚۤۤۘۘ۬ۛۨۙۢۜۘ"
        L_0x0397:
            int r9 = r5.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1875089966: goto L_0x03fd;
                case -1025266518: goto L_0x03df;
                case -540626448: goto L_0x03e2;
                case 381862485: goto L_0x03a0;
                default: goto L_0x039f;
            }
        L_0x039f:
            goto L_0x0397
        L_0x03a0:
            if (r7 == 0) goto L_0x03dc
            java.lang.String r5 = "ۜۘۙ۟ۗۧۗۛ۟ۙۦۨۧۗۗۛۙۡۖۜۘ"
            goto L_0x0397
        L_0x03a5:
            r1 = r3
            goto L_0x0375
        L_0x03a7:
            java.lang.String r4 = "ۚۥۥۘۗۦۘۘۥ۬ۡۘۢ۟ۨۦۜۜۡۙۧۛۡۡ"
            goto L_0x037a
        L_0x03aa:
            if (r7 == 0) goto L_0x03a7
            java.lang.String r4 = "ۛۖۚۡۦۢۡۤ۫ۚۗۘۘۡۥۨۘۧ۬ۡۘ"
            goto L_0x037a
        L_0x03af:
            java.lang.String r4 = "ۚۛۧۖ۠ۜ۟ۨۥۤۖ۬ۡۘ۫ۧۤۚۙۖۨ"
            goto L_0x037a
        L_0x03b2:
            java.lang.String r4 = "۬۫ۚۨۖ۫ۙۙۖۘۨۜۦۖۥۛۚۗۗ۫ۥ۟ۥۥۛۥ۠ۜ"
            goto L_0x0388
        L_0x03b5:
            r4 = 400(0x190, float:5.6E-43)
            if (r6 != r4) goto L_0x03b2
            java.lang.String r4 = "۬ۤۦۘۛۜۘۘۘ۬۠ۘۢۛۖۢۜۘ۠ۜۢۜۜۢۢ۫ۧ"
            goto L_0x0388
        L_0x03bc:
            java.lang.String r4 = "ۨۙ۫ۥۨۦۦۦۦۜۚۨۘۡۨۘۚۦۥۘ"
            goto L_0x0388
        L_0x03bf:
            r5 = -163158084(0xfffffffff64667bc, float:-1.00603395E33)
            java.lang.String r4 = "ۡۘۦ۠ۧۙ۬ۜۧ۫ۛۨۛۢۜۘ۫ۧ۟ۚۡۡ"
        L_0x03c4:
            int r8 = r4.hashCode()
            r8 = r8 ^ r5
            switch(r8) {
                case -1829323668: goto L_0x0391;
                case -1350931678: goto L_0x03d3;
                case 1135015933: goto L_0x03da;
                case 1447037971: goto L_0x03cd;
                default: goto L_0x03cc;
            }
        L_0x03cc:
            goto L_0x03c4
        L_0x03cd:
            java.lang.String r4 = "ۖ۠ۘۘۙۛۤۗ۬ۘ۬۟ۡۚ۟ۙۛۖۖۘۡۚۗ"
            goto L_0x03c4
        L_0x03d0:
            java.lang.String r4 = "ۖۛ۟۠ۤۚۤۦۘۨ۟ۡۦۙۖ۠۫ۡۘ۟ۡۜۥۚۛ"
            goto L_0x03c4
        L_0x03d3:
            r4 = 300(0x12c, float:4.2E-43)
            if (r6 != r4) goto L_0x03d0
            java.lang.String r4 = "ۤۥۦ۠ۜ۟ۤۙۡۘۜۡۛۥۜۜۖۨۚ"
            goto L_0x03c4
        L_0x03da:
            r4 = r3
            goto L_0x0392
        L_0x03dc:
            java.lang.String r5 = "۠۫ۧۢ۫ۡۙۢۙۤۥۨۘۨۚۥۦۙۜۘۡۤۧۘۜۧۘ"
            goto L_0x0397
        L_0x03df:
            java.lang.String r5 = "ۚۚ۟ۚۘۤۤۥۚۜۖۦۘۢۖۚۘ۠ۘۘۙۗ۬"
            goto L_0x0397
        L_0x03e2:
            r8 = -540095942(0xffffffffdfceca3a, float:-2.9801572E19)
            java.lang.String r5 = "ۚ۫ۡۚۦ۫۬۠ۦۚۨۙ۬۬ۡۘ"
        L_0x03e7:
            int r9 = r5.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1167781044: goto L_0x0442;
                case 871959581: goto L_0x03f0;
                case 1810239676: goto L_0x0418;
                case 2137386469: goto L_0x03f6;
                default: goto L_0x03ef;
            }
        L_0x03ef:
            goto L_0x03e7
        L_0x03f0:
            java.lang.String r5 = "ۜۖۡ۟ۙ۟ۦۥۚۨۡۢ۟ۧۚۗۘۨ۟ۤ"
            goto L_0x03e7
        L_0x03f3:
            java.lang.String r5 = "ۙۙۨۘۢۡۜۘۨۙۜ۫ۥۡۚۙۜ"
            goto L_0x03e7
        L_0x03f6:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r6 != r5) goto L_0x03f3
            java.lang.String r5 = "ۧۨ۬ۥۙۘۘ۠ۥ۟ۛۖۗ۟ۢ۬ۘۤۡ۬ۘ۠"
            goto L_0x03e7
        L_0x03fd:
            r8 = 2093325078(0x7cc59b16, float:8.208224E36)
            java.lang.String r5 = "ۥۛۛۜۨۤ۟ۗۘ۠۠ۥۘۚۗۨ"
        L_0x0402:
            int r9 = r5.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1703936177: goto L_0x0418;
                case 642741139: goto L_0x0442;
                case 1063939321: goto L_0x040b;
                case 1541378781: goto L_0x0411;
                default: goto L_0x040a;
            }
        L_0x040a:
            goto L_0x0402
        L_0x040b:
            java.lang.String r5 = "ۜۚۡۥۢۡۦۖۜۘۘۤ۠ۡ۠ۦۜۥۜۥۙۢۨۦ"
            goto L_0x0402
        L_0x040e:
            java.lang.String r5 = "ۖۥۥۘ۫۬ۖۤ۠ۡۘ۟ۛۡۢۤۦ"
            goto L_0x0402
        L_0x0411:
            r5 = 400(0x190, float:5.6E-43)
            if (r6 != r5) goto L_0x040e
            java.lang.String r5 = "ۦۥ۫ۛۜۢۥۦۥۦۧۨۛۚۤۙۙۜ"
            goto L_0x0402
        L_0x0418:
            r5 = r2
        L_0x0419:
            r8 = 1883774941(0x70481fdd, float:2.4774209E29)
            java.lang.String r6 = "ۗۤۛۥ۬ۙ۟ۛ۬ۖ۟ۦۘۜۙۜۘۧ۬ۛۛۛۜۛۥۘ"
        L_0x041e:
            int r9 = r6.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1043844834: goto L_0x044c;
                case -746314583: goto L_0x0427;
                case 290997437: goto L_0x044f;
                case 1225702101: goto L_0x0447;
                default: goto L_0x0426;
            }
        L_0x0426:
            goto L_0x041e
        L_0x0427:
            r11.setGroupVisible(r10, r2)
            r0 = 30
            r11.setGroupVisible(r0, r5)
            r1 = -1606375263(0xffffffffa040a8a1, float:-1.6318827E-19)
            java.lang.String r0 = "ۢۧۨۘۙۥۡۚۥۚۨۡۚۢۧۦۘۡۚ۟ۜۘ۬"
        L_0x0434:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1121014795: goto L_0x046d;
                case -404487502: goto L_0x043d;
                case -15811608: goto L_0x04a5;
                case 1437689755: goto L_0x0470;
                default: goto L_0x043c;
            }
        L_0x043c:
            goto L_0x0434
        L_0x043d:
            if (r7 == 0) goto L_0x046a
            java.lang.String r0 = "ۧۗۥۡ۟ۘۘۚۦ۫۟۬ۘۘ۬۫ۘ۬۠"
            goto L_0x0434
        L_0x0442:
            r5 = r3
            goto L_0x0419
        L_0x0444:
            java.lang.String r6 = "ۨۛ۫ۗۦۖ۬۟ۦۘۢۘۚۜۧۤ۫ۜۘۤۙۧ"
            goto L_0x041e
        L_0x0447:
            if (r0 != 0) goto L_0x0444
            java.lang.String r6 = "ۧۙۘۘۚۘۜۖۧۦۖۧۘۥۖۦۘۢ۫ۘۘۥ۬ۦۘ"
            goto L_0x041e
        L_0x044c:
            java.lang.String r6 = "ۥۧۙ۟ۚۧۘۗ۠ۨۗۜۡۦۙۘۡۤۤ۠ۙۙۗۡۘ۬ۢ"
            goto L_0x041e
        L_0x044f:
            r6 = -1089659309(0xffffffffbf0d1e53, float:-0.55124396)
            java.lang.String r0 = "ۧۢۢ۫ۨۡۘۗۥۧۘۛۛۘۘ۟۟ۜۘۜۨ۫ۖ۠۠ۡۨۘ"
        L_0x0454:
            int r8 = r0.hashCode()
            r8 = r8 ^ r6
            switch(r8) {
                case -1366274418: goto L_0x0468;
                case 262116072: goto L_0x0427;
                case 798850635: goto L_0x045d;
                case 2133339159: goto L_0x0463;
                default: goto L_0x045c;
            }
        L_0x045c:
            goto L_0x0454
        L_0x045d:
            java.lang.String r0 = "ۦۗۛۥۡۗۚۘۚۥۘۥ۫ۗ۟ۡۢۨۛۗۢۗۚۛۢۖۜ"
            goto L_0x0454
        L_0x0460:
            java.lang.String r0 = "ۧۗۛۜۙۥۘۘۘۚۦ۬ۙ۟ۡ۫ۤۖۜۤ۬"
            goto L_0x0454
        L_0x0463:
            if (r1 == 0) goto L_0x0460
            java.lang.String r0 = "ۜۚ۬ۤۛ۠ۚ۠۬۬۠ۛۨۖۗۗۢۨۛ۫ۧۘۗۘۦ۬"
            goto L_0x0454
        L_0x0468:
            r2 = r3
            goto L_0x0427
        L_0x046a:
            java.lang.String r0 = "ۥۖۧ۫ۜۘۢ۫ۦۜۛۨۡ۟۟ۘ۟ۗۙۚۥۘۨ۟ۦۘ"
            goto L_0x0434
        L_0x046d:
            java.lang.String r0 = "ۧۤۚ۟۬ۥۘۦۨۥۨ۬ۜۗ۟ۨۛۘۘۘۨۨۘ۫۠ۜ"
            goto L_0x0434
        L_0x0470:
            r1 = 1965642647(0x75295397, float:2.1464687E32)
            java.lang.String r0 = "۬۫ۥ۠ۢۡۘۤۤۜ۬ۨۘۡۤۢۦ۠ۦۙۚۘۧ۠۠"
        L_0x0475:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1761629710: goto L_0x0486;
                case 323935196: goto L_0x0497;
                case 700858539: goto L_0x047e;
                case 1160673169: goto L_0x0489;
                default: goto L_0x047d;
            }
        L_0x047d:
            goto L_0x0475
        L_0x047e:
            if (r4 == 0) goto L_0x0483
            java.lang.String r0 = "۟ۡۦۢۡۤۘۤۦۙۙۙۘۧۦۘ۟ۘ۟"
            goto L_0x0475
        L_0x0483:
            java.lang.String r0 = "ۤۛۗۜۥۗ۬۫ۨۘۖ۠۬ۗۘۘ۠ۚۗ"
            goto L_0x0475
        L_0x0486:
            java.lang.String r0 = "ۘۡۤۤۨۖۘ۟ۨۚۢۚۜۘۨۘۦۘ"
            goto L_0x0475
        L_0x0489:
            r1 = 812643554(0x306ff4e2, float:8.7295693E-10)
            java.lang.String r0 = "ۦۨۥۘۥۚۧ۠۬ۘۘۘۘۙ۫ۦۘۗۗ۟ۧۚۙ"
        L_0x048e:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x04b9 }
            r2 = r2 ^ r1
            switch(r2) {
                case -828183020: goto L_0x0497;
                case -52076034: goto L_0x04c9;
                case 66971542: goto L_0x04bf;
                case 691433794: goto L_0x04cc;
                default: goto L_0x0496;
            }
        L_0x0496:
            goto L_0x048e
        L_0x0497:
            r1 = 1780953020(0x6a272fbc, float:5.052901E25)
            java.lang.String r0 = "ۨۦۧۖۘۘۘ۟ۖۘۢۙۘ۫ۧۙۙۦۨۥۖۖۘۤۜۘۦۤۛ"
        L_0x049c:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2040722822: goto L_0x04a5;
                case -1542609302: goto L_0x04e8;
                case 561791109: goto L_0x04e0;
                case 1436576399: goto L_0x04e5;
                default: goto L_0x04a4;
            }
        L_0x04a4:
            goto L_0x049c
        L_0x04a5:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x04b9 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x04b9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04b9 }
            com.obwhatsapp.yo.d0 r1 = new com.obwhatsapp.yo.d0     // Catch:{ Exception -> 0x04b9 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ Exception -> 0x04b9 }
            r0.post(r1)     // Catch:{ Exception -> 0x04b9 }
            goto L_0x0305
        L_0x04b9:
            r0 = move-exception
            goto L_0x0305
        L_0x04bc:
            java.lang.String r0 = "ۤۖۦۘۧۛۦۘۨۗۤۨۙۥۚۘۨۤۧۦۘ"
            goto L_0x048e
        L_0x04bf:
            r0 = 3
            int r0 = com.obwhatsapp.yo.u1.getUnreadForThisTab(r0)     // Catch:{ Exception -> 0x04b9 }
            if (r0 <= 0) goto L_0x04bc
            java.lang.String r0 = "ۙ۬ۦۘۚۢۧ۬ۤۖۘ۬ۘۧۘۡۜۖۖ۬ۡۜۦۧ"
            goto L_0x048e
        L_0x04c9:
            java.lang.String r0 = "ۧۙۛۥۦۜۘۨۢۥۘۚۥ۠ۚۙۘۗۖۢۥۥۡۨ۫۟۠ۡۨ"
            goto L_0x048e
        L_0x04cc:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x04b9 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x04b9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04b9 }
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x04b9 }
            java.lang.Runnable r1 = r1.A27     // Catch:{ Exception -> 0x04b9 }
            r0.post(r1)     // Catch:{ Exception -> 0x04b9 }
            goto L_0x0497
        L_0x04dd:
            java.lang.String r0 = "ۨۖۥۘۜۦۨۨۗ۫ۢ۟ۥ۠ۖۧۘۛۥ۠"
            goto L_0x049c
        L_0x04e0:
            if (r5 == 0) goto L_0x04dd
            java.lang.String r0 = "۫ۧۙۚ۠ۨۘ۟۫ۨۘ۠ۛۢۛۥۙ۫ۧۘۘ"
            goto L_0x049c
        L_0x04e5:
            java.lang.String r0 = "۫۬ۛۗۡ۟ۚۢۨۜ۫ۖۡۡۘ"
            goto L_0x049c
        L_0x04e8:
            r1 = 820029948(0x30e0a9fc, float:1.6346458E-9)
            java.lang.String r0 = "ۛ۠۬۬ۖۥۘۨۙۖۘۙ۬۬ۢۧۧۢ۫۬ۤۧۘۘۙۦۜۘ"
        L_0x04ed:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x04b9 }
            r2 = r2 ^ r1
            switch(r2) {
                case -2081553549: goto L_0x04fc;
                case -768943758: goto L_0x0506;
                case 1136531819: goto L_0x04a5;
                case 1811663240: goto L_0x04f6;
                default: goto L_0x04f5;
            }     // Catch:{ Exception -> 0x04b9 }
        L_0x04f5:
            goto L_0x04ed
        L_0x04f6:
            java.lang.String r0 = "ۡۥۨۤۧۜۘۨۖۖۢ۬ۢۛ۟ۧۛۙۘۘ"
            goto L_0x04ed
        L_0x04f9:
            java.lang.String r0 = "ۚۘ۠ۤۗۧۛۡۦۘۚۙۡۜۨۥۘ"
            goto L_0x04ed
        L_0x04fc:
            r0 = 4
            int r0 = com.obwhatsapp.yo.u1.getUnreadForThisTab(r0)     // Catch:{ Exception -> 0x04b9 }
            if (r0 <= 0) goto L_0x04f9
            java.lang.String r0 = "۠ۡ۠ۘۥۗۗ۫ۚ۫۟ۨۢۤۙ۬ۢ"
            goto L_0x04ed
        L_0x0506:
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x04b9 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x04b9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04b9 }
            com.obwhatsapp.HomeActivity r1 = com.obwhatsapp.yo.yo.Homeac     // Catch:{ Exception -> 0x04b9 }
            java.lang.Runnable r1 = r1.A26     // Catch:{ Exception -> 0x04b9 }
            r0.post(r1)     // Catch:{ Exception -> 0x04b9 }
            goto L_0x04a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.setHoMenu(android.view.Menu):void");
    }

    public static void setToolbar() {
        Toolbar toolbar = null;
        String str = "۬ۘۥ۠ۗۘۥۜۢ۬ۡۦۥۧۘۤۙۦۜۙۥۘۙۘۨۘۙۢۡ";
        while (true) {
            switch ((str.hashCode() ^ 47) ^ 1760756179) {
                case -1078333274:
                    String str2 = "۟ۡۨۤۦۘۘ۬ۙۖۖۦۨۘ۟ۚۗ۬ۦۡۘۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -243352761) {
                            case -144537049:
                                str = "ۗۧۙۙ۠ۥۘ۬ۥۛۤۡۖ۟ۛۦ";
                                continue;
                            case 1632033325:
                                str2 = "ۦۛۘ۬۬ۘۗۢۦۤۜۤۛۗۛ";
                                break;
                            case 1883027038:
                                str = "ۚۗۛۚۗۨۦۖۦۗۡۗۙۦ۫ۤ۬ۚۚۜ۟ۚۡ۬";
                                continue;
                            case 2137504094:
                                if (!isOneUIEnabled()) {
                                    str2 = "ۧۤ۟ۦۙۚۧۥۡۦۗۦۘۗۗۥۢ۠۬۟ۡ۬";
                                    break;
                                } else {
                                    str2 = "ۜۨۙۙۗۨۘۗۥۢ۠ۦۛۤۖۜۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -414051060:
                    return;
                case -110995588:
                    toolbar.setOverflowIcon(others.coloredDrawable(Deobfuscator$app$Custom.getString(-8897517944257L), TTextColor(), PorterDuff.Mode.SRC_IN));
                    str = "ۗۧۙۙ۠ۥۘ۬ۥۛۤۡۖ۟ۛۦ";
                    break;
                case 831190017:
                    yo.Homeac.Aem(toolbar);
                    str = "ۛۥۙۛۘۦۘۜۨ۬۟ۦۧۥۖۡۘ۬ۧۖۤ۠ۦۡۡ۬ۙۡۙ";
                    break;
                case 1034064780:
                    toolbar.setTitleTextColor(TTextColor());
                    str = "۠ۚۖۙۧۘۘۗۚۥۘۖۦۜۜۧ۠ۘۖۜۘۜۙۨۗۥۘۡۜۘۘ";
                    break;
                case 1308477388:
                    str = "ۨۢۛ۠ۜ۠ۧۧۨۘۤۥۜۘۢۧۥۧ۫ۥۤۨۥۘۗۛ۬ۜۘ۬";
                    toolbar = (Toolbar) yo.Homeac.findViewById(yo.getID(Deobfuscator$app$Custom.getString(-8850273304001L), Deobfuscator$app$Custom.getString(-8884633042369L)));
                    break;
            }
        }
    }

    public static void setToolbarTitle(TextView textView, int i2) {
        long j2 = 0;
        String str = null;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str2 = null;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = "ۡۘ۫ۛۘۡۘۨۢۦۘ۠ۛۤۤۧۨۤۙ۬";
        while (true) {
            switch ((str5.hashCode() ^ 941) ^ -499640049) {
                case -2144537610:
                case 1856946018:
                    str5 = "ۚۘ۟ۜۦۡۘۢۜۛۡۛۗۢ۫ۧ";
                    break;
                case -1996701022:
                case -1287478725:
                    return;
                case -1935322890:
                    str5 = "ۚۧۜۘۛۤۤۘ۟ۡ۠ۢۢۛ۬ۥۘ۠۠ۜۗۙۘ";
                    break;
                case -1867057987:
                    str2 = dep.getMyName();
                    str5 = "ۛۥۥۘۖۧۦۖ۟۠۫۬ۗۧۘۗۨ۟ۜۡۡۖۡۜ۠";
                    break;
                case -1849978425:
                    str5 = "ۨۖۥۢۗ۬ۡۧۛۥ۟ۘۘۦۥۛۨ۫ۖۦۘۜ";
                    str4 = str2;
                    break;
                case -1823072825:
                    j4 = -9318424739265L;
                    str5 = "ۤ۬ۥ۠ۧۡ۬ۦۘ۠ۥۘۛۦۗ";
                    break;
                case -1652732140:
                    String str6 = "ۗۚۡۚۢۡۘۚ۫۫ۢۡۢۛ۬ۗۛۥ۟";
                    while (true) {
                        switch (str6.hashCode() ^ -1770122084) {
                            case -822915225:
                                str5 = "ۨۚۗ۫ۡ۟ۨ۠ۗۨۜۘ۬ۛۨۖۙۘ۟۬۫";
                                continue;
                            case -569170575:
                                str5 = "ۡۚۡۘۨ۫ۦۘۦ۫ۘۘ۫ۜۖۘۥۘۛۜۧۡۘۗۚ۫ۨۛ۫";
                                continue;
                            case -207810327:
                                if (textView != null) {
                                    str6 = "ۘۜۨۘ۬۟ۛ۬۠ۦۥۙۢ۫ۛۨۘۗۖۨۘۖۖ۫۠ۜۙۡۚۗ";
                                    break;
                                } else {
                                    str6 = "۟ۤۢۥۗۚۛۙۨۤۦۙۘۦۘۗ۫ۘۘ";
                                    break;
                                }
                            case 1967668090:
                                str6 = "ۧ۫۬ۚۦۤۙۙۥۘۢۙۨۘۖۗ۟ۜۧۨۘ۠ۚ۬ۚۢۨۘ";
                                break;
                        }
                    }
                    break;
                case -1604355432:
                    String str7 = "ۥۚۡۨۥۘۢۗ۟ۙۦ۫ۜۧ۫ۧۖۧۘ۠ۗ۟۬ۙۡ";
                    while (true) {
                        switch (str7.hashCode() ^ 1369568858) {
                            case -1207076749:
                                if (i2 == 2) {
                                    str7 = "ۥۙۗۜۢۛۤۙۦۘ۟ۖۨۘۜۗۜۘۧۥۥۘۨ۠ۧۖۦ۟۫ۨۜ";
                                    break;
                                } else {
                                    str7 = "ۧۡ۟ۡۦۗ۬ۘ۫۟ۡۜۗۨۧۤۚ۫ۗ";
                                    break;
                                }
                            case -365614065:
                                str5 = "ۗ۬ۨۨۨ۫۟ۜۧۘۥۙۘۘ۟ۚۡۢۛۙ";
                                continue;
                            case 69534861:
                                str5 = "ۧۚ۟۬ۙۦۘ۟ۘ۬ۚۤۥۦ۠ۚ۫ۘۘ۟ۗ۫۫۟۬ۦۦۘ";
                                continue;
                            case 1125849610:
                                str7 = "۟۫ۖۤۜۦۘۤۜۜۘۢۖۜۘ۬ۤۨۙۧۡۜ۠ۥۘ۫ۚۖ";
                                break;
                        }
                    }
                    break;
                case -1520869412:
                case -1256988840:
                case 397045993:
                case 1208545268:
                case 1272894443:
                case 1397768748:
                    str5 = "ۗۢۦۧۚۧۚۨۘ۬ۚۙۗۦۥۘ";
                    break;
                case -1477096555:
                    str3 = Deobfuscator$app$Custom.getString(-9026366963137L);
                    str5 = "ۗۙۨۘ۬ۥۛۦۢۘۘۡۚ۟۫ۘ۟ۢۦۡۘ";
                    break;
                case -1463938546:
                    j2 = -9404324085185L;
                    str5 = "ۘۤۜۘۘ۟۟۟ۚۨۘۦۦ۬ۘۧۘۘ";
                    break;
                case -1448928105:
                    String str8 = "ۘۥۖۨ۬۠ۥ۬ۡۘۢۜۗۚۤۥۘۖ۬ۜ۬ۨۜۧ۠ۜ۟ۧ۟";
                    while (true) {
                        switch (str8.hashCode() ^ -469735025) {
                            case -1388536526:
                                str8 = "ۦۖۖۚۖۚ۠ۛ۫ۨۨۡۘۖۖۡۥۥۥۖۛۜۘۧ۬ۦۤۨۘ";
                                break;
                            case -681676648:
                                if (!yo.isGrpSeparateEnabled()) {
                                    str8 = "ۘۙۖۘۤ۠ۥ۫۫ۘۦۚۦۘۘۥۜۛۡۧۘ";
                                    break;
                                } else {
                                    str8 = "۠ۜۨۢ۫ۦۘۥۧۘۢۡۘۜۚۥ";
                                    break;
                                }
                            case 696080904:
                                str5 = "۠ۡۘۘ۬ۜۤۥۗۥۘۡۥۨۘۧ۠۟ۚ۬۠ۙۢۥ";
                                continue;
                            case 1427553665:
                                str5 = "ۜۘۡۘۛ۫ۗ۠ۜۘۜۨ۟ۥۖۦۖۡۡۜۚۗۥ";
                                continue;
                        }
                    }
                    break;
                case -1432797734:
                    j6 = -9241115327937L;
                    str5 = "۫ۢۥۡ۬ۖۘۦۘۙۘۧۘۘۜۢۙۚ۫ۙۙۨۥ۟ۘۘ";
                    break;
                case -1277682580:
                    String str9 = "۬۟۬ۨ۟ۘۘ۟ۤ۠ۘ۫ۦۘۨ۟ۖۦ۠ۢ";
                    while (true) {
                        switch (str9.hashCode() ^ -325403888) {
                            case 459966886:
                                str5 = "۬ۙۡۘ۬ۡۛۡۢۖۘ۠ۚۡۘۛۤ۠ۢۧ۠ۛۗۗۘۙۨۘ";
                                continue;
                            case 854558929:
                                str9 = "ۦ۫ۖۘۥۜۖۜۖ۟ۡۨۨۧۖ۟ۥ۟";
                                break;
                            case 910181115:
                                str5 = "۠ۙۜۡۜۡۘۙۛۥۘۜۛ۫ۦ۬ۘۙۖۥۘ۟۟ۥ";
                                continue;
                            case 1557085897:
                                if (!yo.isGrpSeparateEnabled()) {
                                    str9 = "۟ۜۛ۬ۨۙۘۦۙۢ۟ۘۨ۠۟ۤۗ";
                                    break;
                                } else {
                                    str9 = "ۢ۫ۥۘۖۧۢ۫ۚۘۘۖۛۚۙۡۥ۬۫ۥۘۢۜۘۜۜۤۨۨۥ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1060760620:
                    String str10 = "۟ۘ۫۟ۚۦۘۡۥۤ۬ۗۧۧۤۜۥ۟ۤۖۡۜۘ";
                    while (true) {
                        switch (str10.hashCode() ^ -968951049) {
                            case -1719283238:
                                if (i2 == 1) {
                                    str10 = "ۜۖ۟ۙۙۚۥۜۙۢۚۡ۫ۡۥۘۜۚ۬ۨۙ۫";
                                    break;
                                } else {
                                    str10 = "ۜۦ۠۫ۙۢۖۚۨۙ۫ۛۦۜۨ۠ۥ۟ۦۤ";
                                    break;
                                }
                            case -1334709338:
                                str5 = "ۖۢۦۜۛۖۘۘۥۖۘۗ۫ۨۜۨۥ";
                                continue;
                            case -579007810:
                                str10 = "ۡۧۢۨۚۨۘۗۖۛۛۚۧۛۢ۟";
                                break;
                            case 1290987353:
                                str5 = "ۗ۠ۦۘۜۢۡ۠۫ۗۧۖۤ۫ۜ";
                                continue;
                        }
                    }
                    break;
                case -613536880:
                    j3 = -9279770033601L;
                    str5 = "ۙۦۨۧۢۗۢۦ۬ۧۗۖۘۛۖۦۘۚ۫ۙۦۤۖۘۗۙۜۘۘۡۨۘ";
                    break;
                case -226996098:
                    str = yo.getString(Deobfuscator$app$Custom.getString(j9));
                    str5 = "ۢۖۘۘۛۙۢۚۡۜۜۡۘۡۨ۬";
                    break;
                case -203055214:
                    textView.setText(str4);
                    str5 = "ۡ۟ۤۚۢۚۦۡۡۘ۟۫ۛ۬ۗۡۘۙۥۚۡۢ۟ۨ۟ۛۨۡۚ";
                    break;
                case -116310302:
                    str5 = "ۦۧۨۨ۬ۧۜۨۥۡۢۡۘۥۛۧۗ۟ۘ۬ۥۚۛۢۖۘ";
                    j9 = j5;
                    break;
                case -69263016:
                    str5 = "ۤۡۤۤۨ۠ۥۡۚۗۢ۟ۗۜ۟ۨۗۨ۟۫ۡۘ۠ۡۜ";
                    j9 = j4;
                    break;
                case -3508179:
                    String str11 = "ۛۦۗۗ۬ۛۥۗۘ۟ۡۥۘۜۡۗ۫ۡۚ";
                    while (true) {
                        switch (str11.hashCode() ^ -1172568839) {
                            case -236377307:
                                str11 = "۠ۥۡۢ۟ۦۘۗۚۖ۫ۡۦ۟ۚۖۘۢۛۜ۬ۘ";
                                break;
                            case 99754154:
                                if (!shp.getBoolean(Deobfuscator$app$Custom.getString(-9030661930433L))) {
                                    str11 = "ۙۧۜۘۨ۟ۧ۬ۧۤ۟ۥۜۘۘۢۘۤۜۦۢۙۨۘ";
                                    break;
                                } else {
                                    str11 = "ۦۤۚۢۙۦۘۢۗۜۘ۬ۥۧۘ۟ۡۦۧۘۜۧۥۢۡ۟ۨۘۛۚۦۘ";
                                    break;
                                }
                            case 1558923091:
                                str5 = "ۤ۠ۡۘ۟ۤۗۢۥۧۡۦۨۦۗۨۘ";
                                continue;
                            case 1662558261:
                                str5 = "ۚۚ۟ۧ۠۬ۚۦۨۘۦۘۢۛۜۘۗ۠ۥۘۥ۠ۜۙۦ۬";
                                continue;
                        }
                    }
                    break;
                case 174869150:
                    String str12 = "۫۟ۥۦۚۥۘۢۡۚۥۤۜ۫ۡۢۜۜۤ۠ۤۖ۫ۜۚۥ۟ۥۘ";
                    while (true) {
                        switch (str12.hashCode() ^ 1185230880) {
                            case -1838942742:
                                str5 = "۬ۢ۠ۙۚۖۥۖۥۜۨۢ۠ۛۨۚۡۚۙۙۡۚۥۥۘ";
                                continue;
                            case -1274991786:
                                if (i2 == 4) {
                                    str12 = "ۙۙۘۘ۠ۥۦۘ۠ۙۘۥۥۧۘۙۙ۫ۧۥۛۛۜۧۘ۬ۢۡۘ";
                                    break;
                                } else {
                                    str12 = "۟ۢۙۚۜۖۚۢۨۙۨۙ۟ۡۜ";
                                    break;
                                }
                            case 224789166:
                                str5 = "ۖ۬۫ۧۗۗ۠ۘ۬ۘ۠۬ۙۗۙۤ۬ۛ۬ۜۛۗۚ";
                                continue;
                            case 1012379442:
                                str12 = "ۚۦۜۦ۫ۛۨۦۥۘۤۛۗۤۗۥۛۖۤۡۦۘۜۦۧۘۜ۟۟";
                                break;
                        }
                    }
                    break;
                case 530508849:
                    str5 = "ۤۗۤۧۨۗ۫۟ۜۘۖۖ۬ۧ۟ۗۥۖۜۜۧۘۘ";
                    str4 = str3;
                    break;
                case 531918421:
                    str5 = "ۢ۫ۘۘۦۘ۠ۦۢۢ۬ۦۧۥۧۖۘ";
                    str4 = str;
                    break;
                case 654270156:
                    String str13 = "ۢۥۦۧ۟ۖۘۛۥۗۢۥۘۥۙۤۗۤۢۡۢ";
                    while (true) {
                        switch (str13.hashCode() ^ 1343466134) {
                            case -1624391600:
                                str5 = "ۙ۠ۦۘۘۚۥۖۚۥۘۡۘۘ۬۟ۜۘۙۥۛۙۢۦ۫ۜ۟ۨۙۥ";
                                continue;
                            case -245505127:
                                str5 = "ۨۧۡۧ۟ۢۜ۬ۗۙۘۦ۠۟۬ۗۧ۬ۡۜۗۗ۟ۤ";
                                continue;
                            case 324468669:
                                if (!yo.isCommunityEnabled) {
                                    str13 = "ۚ۟ۖۘۤۖۖۘۗ۬ۤۡۦۛ۫ۡۗۨۗ۟ۜۛ۟";
                                    break;
                                } else {
                                    str13 = "ۛۛۨۘۦۢ۠ۥۨۧۨۨۛ۠۫ۘۤۨۙۢ۠ۙۘ۬۫";
                                    break;
                                }
                            case 1245274809:
                                str13 = "ۘ۬ۡۘۜۦۖۘ۠ۡۖۘۗۡ۫ۙۤ۠ۘۨۤ۫۫";
                                break;
                        }
                    }
                    break;
                case 689167756:
                case 902821318:
                    str5 = "ۢ۫ۘۘۦۘ۠ۦۢۢ۬ۦۧۥۧۖۘ";
                    break;
                case 817753343:
                    String str14 = "ۧۗۧۢۖ۠ۨۛۧۧۥۜۙ۬ۥۘۖۡۦۛ۟ۜۗۨۨۘ";
                    while (true) {
                        switch (str14.hashCode() ^ 1089152679) {
                            case -1843180732:
                                if (i2 == 0) {
                                    str14 = "ۨۗۛۥۧ۬ۦۥ۬ۘۦ۫ۨۙۦۘ۟ۜۘۥ۬ۙۢۙۦ";
                                    break;
                                } else {
                                    str14 = "۫ۡۢۚ۠ۨ۟ۜ۟ۛۗۦۘۙ۠ۘۘۛۜۧۘۤۤ۠";
                                    break;
                                }
                            case -1526957696:
                                str5 = "ۚۨۚۦ۟ۗۨۘۨۛۛۡۘۜۤۦۛۤۘ";
                                continue;
                            case -1075835926:
                                str14 = "ۧۛۖۜۙۡۘ۠۠ۢۖ۠۠ۤۚۡۘۗ۟ۦۜۨۧۤۤۢۚۙۡ";
                                break;
                            case 54730739:
                                str5 = "ۡۡۛ۫۠ۜ۟۬ۨۧ۬ۘۘ۟ۗۧۚ۠ۛۥۜۚ۬۠ۡۘۛۙۨ";
                                continue;
                        }
                    }
                    break;
                case 1319027077:
                    str5 = "۬ۗ۬۫ۘۖۘۡۗۦۚۡۥۤ۟ۨۘۦ۫ۢ";
                    break;
                case 1433676598:
                    String str15 = "ۛۦۡۜۦ۬۟۬ۨ۟۠ۨۡ۟۠ۖۦ۫ۚۨۦ۠ۘۚۧۡ۬";
                    while (true) {
                        switch (str15.hashCode() ^ -726530708) {
                            case -1934289346:
                                str5 = "۬ۨۦۘۤۦۥۘۡۥۜۘۦۘۤ۠ۛۦ";
                                continue;
                            case -1095890173:
                                str5 = "ۥۨ۬ۚۘۤۙۜۨۦۧۥۘۗۙ۬";
                                continue;
                            case 429440029:
                                str15 = "۫ۢۘۘۧۜۦۗۘۗۚۧۨۧۥۡۘۙۡۨۖۙۡ";
                                break;
                            case 1797563899:
                                if (i2 == 3) {
                                    str15 = "۬ۖۧۖۖ۠ۢۗۛۛۘۡۖۛۤ۠ۚۧ";
                                    break;
                                } else {
                                    str15 = "۠ۥۦۘۡۚۛۙۗۨۘۤ۬ۖۘۦۙۖۘۖۙ۬";
                                    break;
                                }
                        }
                    }
                    break;
                case 1537085091:
                    str5 = "ۢۥ۫ۤۙۡۘۜ۫۟ۜۥۢ۬۠ۛ۫ۗۙۗۧۛ۬ۨ۬ۧۛۖ";
                    j9 = j8;
                    break;
                case 1539051969:
                    j8 = -8983417290177L;
                    str5 = "۬ۡۥۘۥۘۘۤۥۧۘۡۜۧۘۖۗۖۘۙۚۨۢۚۦۜۘ";
                    break;
                case 1761917339:
                    str5 = "ۖۘۜۛۛۖۗ۟۟ۤ۟ۢ۬ۘۥۘ";
                    j9 = j3;
                    break;
                case 1973093698:
                    str5 = "ۗۢۦۧۚۧۚۨۘ۬ۚۙۗۦۥۘ";
                    j9 = j2;
                    break;
                case 2040882067:
                    j7 = -9065021668801L;
                    str5 = "ۖۦۙۗۖۥۚۦ۬ۨۢۜۘۚ۟ۚۙۗۨۧۙۘۢۘۘ";
                    break;
                case 2058048731:
                    str5 = "ۚۥۡۖۥۙۚۡۥۘۘۘۘۘۘۖۦۘ";
                    j9 = j6;
                    break;
                case 2093601930:
                    j5 = -9090791472577L;
                    str5 = "۠ۖۦۙۢۡۘۛۖۡۗ۬ۤۖۜۨ۬۟ۚۨۗۥۘ";
                    break;
                case 2137223720:
                    str5 = "ۙۜۛۦ۟ۘۘۙۘۢۗ۟ۤۜۙۖۘ";
                    j9 = j7;
                    break;
            }
        }
    }

    public static void setupBottomBar() {
        ViewStub viewStub = null;
        String str = "ۙۚۜۢۜۚ۫ۢۙۤۤۗۜ۬ۢۨۘۤ۫ۤ";
        while (true) {
            switch ((str.hashCode() ^ 931) ^ 610977178) {
                case -1957035345:
                    str = "۫ۘۦۘۜۙۡۘۗۜۤۡۡۙ۠۬ۜۘۗۖ۠ۙۘۢۗۛۖۡۧۤ";
                    viewStub = (ViewStub) yo.Homeac.findViewById(yo.getID(Deobfuscator$app$Custom.getString(-5208141036993L), Deobfuscator$app$Custom.getString(-5285450448321L)));
                    break;
                case -1930474438:
                    viewStub.setLayoutResource(getUIBottomStyleID());
                    str = "۠ۚ۬ۗ۟۫ۛۖۘۙۗۡۘۦ۫ۥۘۗ۬۟۠ۢۘۘۙۦۜۘ";
                    break;
                case -411047161:
                    return;
                case -167202452:
                    String str2 = "ۖۛۢ۫ۖۜۘۥۙۥۘۧۤۜۡۙۢۤۧۥۙۛ۠";
                    while (true) {
                        switch (str2.hashCode() ^ 1284718411) {
                            case -296806689:
                                str = "ۛۜۡۥۗۦۚ۫ۗ۠ۢۜۘ۬ۖۜۘ";
                                continue;
                            case 22671767:
                                str2 = "ۛۖۙۥۛ۬ۗۙ۬ۙ۠۟ۙۥۘۘۗ۬ۛ";
                                break;
                            case 181856963:
                                str = "۟ۘ۫ۜۨۥۘۨۨۥۡۙۗۦۧ۠ۙۢۛ";
                                continue;
                            case 1400103993:
                                if (!isBottomBarEnabled()) {
                                    str2 = "ۡۦۛۘۚۖۗ۠ۚۗۚۡۘۜۘۡۤۘۛۧۨۘ";
                                    break;
                                } else {
                                    str2 = "۟۠ۘۘۥۡۦۘ۟ۙۥۘ۠ۧۗۗۗۜ۠۟ۘۘۘۖۡ";
                                    break;
                                }
                        }
                    }
                    break;
                case 744361189:
                    yo.Homeac.yoBottomBarView = viewStub.inflate();
                    str = "۟ۘ۫ۜۨۥۘۨۨۥۡۙۗۦۧ۠ۙۢۛ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean showAirplaneMode() {
        /*
            java.lang.String r0 = "ۗۢۥۘۖ۫ۨۤۥۥۘۘ۟ۨۦۤۖۘۛۘۢ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 977(0x3d1, float:1.369E-42)
            r3 = -624379522(0xffffffffdac8b97e, float:-2.82494731E16)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -879999710: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -6711379590593(0xfffff9e5629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.showAirplaneMode():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean showCameraStatusIcon() {
        /*
            java.lang.String r0 = "ۨ۬ۦۘۚۤۥۥ۫ۖ۬۬۟ۚ۠ۙ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 875(0x36b, float:1.226E-42)
            r3 = 1827866852(0x6cf308e4, float:2.3504877E27)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1916279504: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -6878883315137(0xfffff9be629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.showCameraStatusIcon():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean showNightMode() {
        /*
            java.lang.String r0 = "ۖۨۗ۫ۧۥۖۦۡۛۜ۟ۜ۫ۢۡۤۨۘۜۗۙ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 924(0x39c, float:1.295E-42)
            r3 = -1529136298(0xffffffffa4db3b56, float:-9.507663E-17)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 764084611: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -6801573903809(0xfffff9d0629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.showNightMode():boolean");
    }

    public static void startAlphaAnimation(View view, long j2, int i2) {
        String str = "ۗۦۡۘۧۜ۠ۛۖۢۛۦ۬ۤۘۥۘ";
        AlphaAnimation alphaAnimation = null;
        AlphaAnimation alphaAnimation2 = null;
        AlphaAnimation alphaAnimation3 = null;
        while (true) {
            switch ((str.hashCode() ^ 799) ^ 1529241870) {
                case -2063754564:
                    alphaAnimation2.setFillAfter(true);
                    str = "ۗۥ۬ۦ۬ۦۘۗۜۜۚ۟ۖۚۦ۟ۖۡۖۘ";
                    break;
                case -1880181469:
                    str = "۠۟ۘۘۛ۬ۡۛۤۘۘۚۨ۬۠ۦۡۨ۬ۦۘ۬ۦ۠ۦۚۧ۫ۖ";
                    break;
                case -1362989293:
                    str = "ۢۘۥۡ۫ۚۙۡۢۢۢۛۢۙۢۗ۫ۢ";
                    break;
                case -1215273420:
                    str = "ۛۡۧۘۖۥۤ۟۬ۨۦ۟ۖۡۤۤ";
                    break;
                case -1058542323:
                    str = "ۨۢ۠ۛۧۡۘۙۢۢۨۢۧۜ۟ۢ";
                    alphaAnimation2 = alphaAnimation3;
                    break;
                case -816012140:
                    alphaAnimation2.setDuration(j2);
                    str = "ۚۚۖۘۥ۫ۡ۟۠ۨۘۥۚۘۘ۟۫ۗ۠ۖ۠ۥۢۡۘۜۤۗۥۜۡ";
                    break;
                case -726243056:
                    String str2 = "ۜۡۛۡۗۛۖۛ۫۠۠ۛۥۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 1602084057) {
                            case -1656949415:
                                str = "ۚۥۦۦۦۢۢۡ۟۟ۨۘۘۜ۠ۗۤ۟ۛ";
                                continue;
                            case 281556869:
                                str = "ۤۢۚۚۖۜۘۗۛۗ۟۬ۡۘۙۦۛۧۥۡۘۛۥ۟ۚۧۜۘ۫ۥۘۘ";
                                continue;
                            case 512185946:
                                if (i2 != 0) {
                                    str2 = "ۦ۠ۥۘۡۜۙ۟ۚۥۛۢۢۚ۫ۚۘۖ۬ۙۗۛۤۤۖ";
                                    break;
                                } else {
                                    str2 = "ۦۧۛۗۜۧۖۥۦۘۢ۫ۜۦ۬ۜۗۘ۠ۢۗۤۢۖ";
                                    break;
                                }
                            case 901567657:
                                str2 = "ۥۙۜۡۥ۬ۖۛۗ۬ۢۥۘۨۦ۟ۧۧۨۙ۠ۥۘۚۦۤ";
                                break;
                        }
                    }
                    break;
                case -687743074:
                    alphaAnimation = new AlphaAnimation(0.5f, 0.0f);
                    str = "ۖۤۧۥۡۧۧۛۦ۟ۨۗۘۙۘۘۡ۫ۡۘ";
                    break;
                case -21361231:
                    return;
                case 678472471:
                    str = "ۧۖۦۛۘۘۘۢۙۜۥۥۗۦۘ۠ۨ۠ۦۘ";
                    break;
                case 1286642657:
                    view.startAnimation(alphaAnimation2);
                    str = "ۡۡ۠ۨۖۦۘۚۧ۟ۡۡۘۨۢۘۘ";
                    break;
                case 1303496073:
                    alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
                    str = "ۡۛۜۨۙۜۗ۟ۦۙۗ۠ۢۖۦۘۙۥ۫ۨۘ";
                    break;
                case 2057646337:
                    str = "ۢۘۥۡ۫ۚۙۡۢۢۢۛۢۙۢۗ۫ۢ";
                    alphaAnimation2 = alphaAnimation;
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int tabBgColor() {
        /*
            java.lang.String r0 = "۬ۡۦۥ۬ۥۘۖ۠ۡۘ۫۫ۥۘ۟۟۟ۖۜ۠ۥ۬ۧۤ۫ۚۡۧۜۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 936(0x3a8, float:1.312E-42)
            r3 = 675875590(0x28490b06, float:1.1160132E-14)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 805404897: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -7810891218369(0xfffff8e5629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getPrimaryColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.tabBgColor():int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f7, code lost:
        r0 = "ۜۢۨۘ۠ۙۙۥۘ۫۟۫ۡۨۧۧۘۘۘۥۡۘ۫ۛۜۘۨۡۨۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void titleToolbar() {
        /*
            r8 = 0
            r2 = 0
            java.lang.String r0 = "ۗۘۜۘ۟ۗۥ۬ۘۗۜ۠ۖۘۥۥ۬ۡۧۘ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r8
            r9 = r8
            r10 = r2
            r11 = r2
        L_0x000d:
            int r2 = r0.hashCode()
            r12 = 597(0x255, float:8.37E-43)
            r13 = -432700189(0xffffffffe63584e3, float:-2.1429992E23)
            r2 = r2 ^ r12
            r2 = r2 ^ r13
            switch(r2) {
                case -1955633907: goto L_0x0082;
                case -1930069718: goto L_0x0175;
                case -1891360539: goto L_0x01cc;
                case -1690195020: goto L_0x0207;
                case -1615807495: goto L_0x00a3;
                case -1467480975: goto L_0x001c;
                case -1446033619: goto L_0x0029;
                case -1398966950: goto L_0x020c;
                case -1341344814: goto L_0x0157;
                case -1161648168: goto L_0x00e9;
                case -1027542921: goto L_0x0050;
                case -1000807680: goto L_0x01fa;
                case -675658535: goto L_0x0056;
                case -492081568: goto L_0x01b7;
                case -487169073: goto L_0x0166;
                case -357624698: goto L_0x00b4;
                case -348923010: goto L_0x0127;
                case -65823744: goto L_0x00d7;
                case -64593639: goto L_0x022b;
                case 113405212: goto L_0x01f5;
                case 121793165: goto L_0x010a;
                case 173938283: goto L_0x0132;
                case 181051035: goto L_0x00be;
                case 424173632: goto L_0x0223;
                case 725755996: goto L_0x002f;
                case 801139806: goto L_0x00c5;
                case 891555965: goto L_0x01ed;
                case 917306538: goto L_0x0077;
                case 1036231893: goto L_0x01be;
                case 1042948556: goto L_0x014a;
                case 1357920469: goto L_0x0227;
                case 1608768250: goto L_0x0217;
                case 1706429687: goto L_0x0196;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x000d
        L_0x001c:
            rc.whatsapp.home.HomeActivity.HomeView r0 = new rc.whatsapp.home.HomeActivity.HomeView
            com.obwhatsapp.HomeActivity r2 = com.obwhatsapp.yo.yo.Homeac
            r0.<init>(r2)
            r0.startHome()
            java.lang.String r0 = "۬ۢۜ۬ۘۥۘۢۦۘۘۥۨۥۜۗۥۘ۠ۥ۬ۨۗۜۚۨۖ"
            goto L_0x000d
        L_0x0029:
            com.obwhatsapp.HomeActivity r2 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "ۛ۟ۥۨۜۦ۠۠ۜۘۨۦۧ۫ۦۜۛ۠ۥۘ۫ۘ"
            r11 = r2
            goto L_0x000d
        L_0x002f:
            r12 = -8450841345473(0xfffff850629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            r12 = -8480906116545(0xfffff849629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r2)
            android.view.View r0 = r11.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r11.mTitle = r0
            java.lang.String r0 = "ۙۖۨۘ۫ۖۥۘ۠ۖۖۧۦۜۘۡۙ۟ۗۚۥۘۜ۠ۘۦۗۙ"
            goto L_0x000d
        L_0x0050:
            com.obwhatsapp.HomeActivity r2 = com.obwhatsapp.yo.yo.Homeac
            java.lang.String r0 = "۬ۨۦۘۛۢ۠ۡۦۦۘۖۗ۠ۧۤۥۘۘۦۘۘ۟ۢۢۖۧۤ"
            r10 = r2
            goto L_0x000d
        L_0x0056:
            r12 = -8493791018433(0xfffff846629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            r12 = -8536740691393(0xfffff83c629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r2)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.mSubTitle = r0
            java.lang.String r0 = "۫ۗۙ۫ۘۘۘ۠۬ۢۚۘۡۖۙ۫ۛۨۚ۠ۛۨ۫ۦۘ"
            goto L_0x000d
        L_0x0077:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            r2 = 1
            setToolbarTitle(r0, r2)
            java.lang.String r0 = "ۢ۬ۨۘۡۗۢۙۜۥۦۢۡۘۧ۬ۗۘۖۘ۬۫ۥ"
            goto L_0x000d
        L_0x0082:
            r2 = 1943849844(0x73dccb74, float:3.4986323E31)
            java.lang.String r0 = "ۨۚۢۙۗۥ۫ۦۘۤ۟ۥۘۛۙۛ۠ۤۡۘۧ۫ۖۘ"
        L_0x0087:
            int r12 = r0.hashCode()
            r12 = r12 ^ r2
            switch(r12) {
                case -1967366985: goto L_0x009f;
                case -1788837855: goto L_0x009c;
                case 867071486: goto L_0x0090;
                case 1811763741: goto L_0x0213;
                default: goto L_0x008f;
            }
        L_0x008f:
            goto L_0x0087
        L_0x0090:
            boolean r0 = com.obwhatsapp.yo.yo.disableClickToOpenHiddenChats()
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "ۨۛۘۘ۫ۘۛۧۥۛۚۡ۠ۧۚۙۢ۟ۡ"
            goto L_0x0087
        L_0x0099:
            java.lang.String r0 = "۬ۡۧۘۧۘۨۘ۫ۦۨۘۢ۬ۛۢۡۧۜۖۨۢ۠ۡۚۙۦ"
            goto L_0x0087
        L_0x009c:
            java.lang.String r0 = "ۙۥۦۙۨۘۙۡۨ۬ۚۨۘۨ۠ۤۗۛۗۦۚ۟ۧۧۦۘۗۥۘ"
            goto L_0x0087
        L_0x009f:
            java.lang.String r0 = "ۦۢۧۜۗۖۘۦ۬ۖ۠ۡۡۙۤ۠ۛۜ۠۫ۙۚۨۖۥۘ۠ۤۘۘ"
            goto L_0x000d
        L_0x00a3:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            com.obwhatsapp.yo.a0 r2 = new com.obwhatsapp.yo.a0
            r12 = 2
            r2.<init>(r12)
            r0.setOnClickListener(r2)
            java.lang.String r0 = "۫ۨ۬۫ۦۦۘۖۢ۟ۧۤۦۖ۫ۦۘۦۜ۠ۨۦ۟"
            goto L_0x000d
        L_0x00b4:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            com.obwhatsapp.yo.yo.homeActionbarTitle = r0
            java.lang.String r0 = "۠ۗۗۡۦۨۘۜۤۗ۫ۦ۟ۥۖۨۘ۬ۘۜۘۢۚۖۘ"
            goto L_0x000d
        L_0x00be:
            com.obwhatsapp.yo.yo.H2()
            java.lang.String r0 = "ۦۥ۠۠ۤ۫ۢۡۥۘۨۛۦۘۘ۟۬"
            goto L_0x000d
        L_0x00c5:
            r12 = -8549625593281(0xfffff839629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            boolean r2 = com.obwhatsapp.yo.shp.getBoolean(r0)
            java.lang.String r0 = "ۦۤۖۘ۫ۦۗۤ۠ۥ۬ۡ۫ۡۘۙۚۢۤ۟ۖۘۘۚۖ"
            r9 = r2
            goto L_0x000d
        L_0x00d7:
            r12 = -8583985331649(0xfffff831629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            boolean r2 = com.obwhatsapp.yo.shp.getBoolean(r0)
            java.lang.String r0 = "ۡ۫ۖۖ۠ۡۖۧۥۘۚ۟ۖ۟۠ۥۘۘۨۨۜ۬۠"
            r7 = r2
            goto L_0x000d
        L_0x00e9:
            r2 = 886899372(0x34dd02ac, float:4.1166402E-7)
            java.lang.String r0 = "۬ۢۦ۠ۛۤۤۧۘۘ۫ۛۘ۠ۘ۠ۨۗۜۘۖۨۤۗۘۘ۬ۨۡ"
        L_0x00ee:
            int r12 = r0.hashCode()
            r12 = r12 ^ r2
            switch(r12) {
                case -1748885076: goto L_0x0106;
                case -936850923: goto L_0x00fe;
                case -422635626: goto L_0x0103;
                case 1767347145: goto L_0x00f7;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            goto L_0x00ee
        L_0x00f7:
            java.lang.String r0 = "ۜۢۨۘ۠ۙۙۥۘ۫۟۫ۡۨۧۧۘۘۘۥۡۘ۫ۛۜۘۨۡۨۘ"
            goto L_0x000d
        L_0x00fb:
            java.lang.String r0 = "ۙۛۚۙۜۘۘۖ۟ۧۜۘۦۘۛۤۖۥۗۦۘ۬۬ۥ"
            goto L_0x00ee
        L_0x00fe:
            if (r9 == 0) goto L_0x00fb
            java.lang.String r0 = "ۡۚۘۘۜۦۦۛۥ۫ۙۦۘۜۡۗۥۤۥۢ۬ۥ"
            goto L_0x00ee
        L_0x0103:
            java.lang.String r0 = "ۢۧۨۘ۟۬ۘۘۜۦۖۘۦۧۘ۟ۖۚۜۡۗۡۙۨۘ"
            goto L_0x00ee
        L_0x0106:
            java.lang.String r0 = "ۗۛۜۨۛۤۙ۟ۛۤۗۢ۟۫ۘۨۖۚۘۥۢۗۙ۟"
            goto L_0x000d
        L_0x010a:
            r2 = -1763313289(0xffffffff96e5f977, float:-3.715438E-25)
            java.lang.String r0 = "ۘۢۥۘۗۨۚ۠ۥۥۢ۬ۤۨۡۖ۬ۨ"
        L_0x010f:
            int r12 = r0.hashCode()
            r12 = r12 ^ r2
            switch(r12) {
                case -482757868: goto L_0x0120;
                case 499789080: goto L_0x0123;
                case 1214410404: goto L_0x0118;
                case 1659319953: goto L_0x00f7;
                default: goto L_0x0117;
            }
        L_0x0117:
            goto L_0x010f
        L_0x0118:
            if (r7 != 0) goto L_0x011d
            java.lang.String r0 = "ۚۗ۫۬ۜۥۘۖۨۨۘۨۡۡۡۖۘ۟ۖۧۘ۬ۗۨ۬ۧۥ"
            goto L_0x010f
        L_0x011d:
            java.lang.String r0 = "ۚۢ۠ۙ۬ۥۘۗۧۥۘۤ۬ۙۛۛۨۡۜۥۘ"
            goto L_0x010f
        L_0x0120:
            java.lang.String r0 = "۟۟ۡ۟ۗۘۜۘۚۦ۠۬۟ۧۖ۬ۚۘۛۗۚ"
            goto L_0x010f
        L_0x0123:
            java.lang.String r0 = "ۡۢ۫ۦ۬ۡۤۛۡۘۦۡۖۢۖۢۙۙۡۙۡۖۘ۠۟۠"
            goto L_0x000d
        L_0x0127:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mSubTitle
            r0.setVisibility(r8)
            java.lang.String r0 = "ۜۧۨۘۙۨۚۜۧۙۙۥۘۥۖۖۥۙۤۢۙۚ۬ۥ۠"
            goto L_0x000d
        L_0x0132:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mSubTitle
            r12 = -8631229971905(0xfffff826629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            java.lang.String r2 = com.obwhatsapp.yo.yo.getMyStatus(r2)
            r0.setText(r2)
            java.lang.String r0 = "ۘ۟ۡۦۦۛۤۗ۠ۙ۬ۦۙۛۨۘۦ۬ۖۥۖۧۘۘۚۧ"
            goto L_0x000d
        L_0x014a:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mSubTitle
            r2 = 8
            r0.setVisibility(r2)
            java.lang.String r0 = "۠۫ۥۘ۠ۤۨۘۜ۟ۘۜۖۧۘۚۖ۠ۘۧۨۘۛۦۖۘۛ۬ۢۙ۬ۖۘ"
            goto L_0x000d
        L_0x0157:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mTitle
            int r2 = TTextColor()
            r0.setTextColor(r2)
            java.lang.String r0 = "ۧۗۡۘۡۨ۬۠ۚ۠ۖۜ۟ۥ۟۬ۢۜۘۛۥ۠"
            goto L_0x000d
        L_0x0166:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.widget.TextView r0 = r0.mSubTitle
            int r2 = TTextColor()
            r0.setTextColor(r2)
            java.lang.String r0 = "ۗ۟ۧۚۢۨۘۢۗۘۘۡۖۖۜۜۛ۠ۘۘۙۘۨۜۗۦ"
            goto L_0x000d
        L_0x0175:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            r12 = -8734309187009(0xfffff80e629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            r12 = -8768668925377(0xfffff806629a823f, double:NaN)
            java.lang.String r6 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r6)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r0 = "ۦۗۚۡۜۖۘ۟ۖۤۤ۬ۚۚۦۘۤۜۚ"
            r6 = r2
            goto L_0x000d
        L_0x0196:
            r2 = -1364987223(0xffffffffaea3f2a9, float:-7.455487E-11)
            java.lang.String r0 = "۠ۧۜۘۘۡۗۡ۠ۖۧۛۦۙۧۨۘ۬ۖۥ۟ۙۘۘ۫ۦۖۘ"
        L_0x019b:
            int r12 = r0.hashCode()
            r12 = r12 ^ r2
            switch(r12) {
                case -1724715169: goto L_0x01b0;
                case -486430387: goto L_0x01b3;
                case 17230599: goto L_0x01a4;
                case 1882495644: goto L_0x021b;
                default: goto L_0x01a3;
            }
        L_0x01a3:
            goto L_0x019b
        L_0x01a4:
            boolean r0 = isOneUIEnabled()
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = "ۨ۟ۥۡۨۧۗۘ۠ۥ۬ۛۗۛۡ"
            goto L_0x019b
        L_0x01ad:
            java.lang.String r0 = "ۡۜۥۘۜۜۨۘۧۢۖۦۗۖۘۢ۬ۨۘۙ۫ۗۛۗ۬"
            goto L_0x019b
        L_0x01b0:
            java.lang.String r0 = "ۤۡۥۥ۫ۦۘۙۚۚ۟ۤۜۘ۠ۦۧۘۨۥۘۘۖۜۘ"
            goto L_0x019b
        L_0x01b3:
            java.lang.String r0 = "ۧۥۤ۠ۗۢۤۘۦۡۖۦ۫ۨۛۨ۫ۨۗۖ۠"
            goto L_0x000d
        L_0x01b7:
            r6.setBackgroundColor(r8)
            java.lang.String r0 = "۠ۜۘۙۧۥۘۡۦۚۙۤ۠۟ۧۨ"
            goto L_0x000d
        L_0x01be:
            r12 = -8781553827265(0xfffff803629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            java.lang.String r0 = "ۤ۟۠ۦۤۜۥۜۡۘ۫ۥۧۘۦۙۜۘ۬۬ۨۘ۟ۥۜۘ"
            r5 = r2
            goto L_0x000d
        L_0x01cc:
            r2 = 267585646(0xff3086e, float:2.3964897E-29)
            java.lang.String r0 = "ۧۡۚ۟ۖ۠ۨۙۨۘۦ۟ۢۙ۠ۗۧ۟ۤ۫ۙۛ۫ۥۡۧ۠ۦ"
        L_0x01d1:
            int r12 = r0.hashCode()
            r12 = r12 ^ r2
            switch(r12) {
                case -130847011: goto L_0x01e9;
                case 763940098: goto L_0x01e6;
                case 925080981: goto L_0x021f;
                case 2139461654: goto L_0x01da;
                default: goto L_0x01d9;
            }
        L_0x01d9:
            goto L_0x01d1
        L_0x01da:
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r5)
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "ۖۡ۬۟ۜۦۤۚۛۚۢۖۖ۟ۥۗ"
            goto L_0x01d1
        L_0x01e3:
            java.lang.String r0 = "ۘۨۘۘۖ۬ۛۜۨۨۘۥ۫۬ۥۗۧ۬ۧۥۖۢۨۘۙ۬ۖۘ"
            goto L_0x01d1
        L_0x01e6:
            java.lang.String r0 = "ۦۗۘۨۢۚ۫ۧۦۡۨ۟ۨۙ۫۟ۡۨ"
            goto L_0x01d1
        L_0x01e9:
            java.lang.String r0 = "ۚۛۥۚۗۢۗۨۗ۟۠۟ۨۧۖۘۗ۫ۡۘۥۛۦ"
            goto L_0x000d
        L_0x01ed:
            android.graphics.drawable.GradientDrawable r4 = com.obwhatsapp.yo.shp.getGradientDrawable(r5)
            java.lang.String r0 = "ۙۗۛۖ۬ۥۘۨۙۦۙۗۛۨ۟۫۟ۗۘۘ۟ۦۥۘۗۙ۠ۧۜۥ"
            goto L_0x000d
        L_0x01f5:
            java.lang.String r0 = "ۘۧۘۘۨۖ۬ۘۦۡۘ۠ۨۗۡۨ۠ۘۡۖۙۚۦ"
            r3 = r4
            goto L_0x000d
        L_0x01fa:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            int r0 = toolbarBg()
            r1.<init>(r0)
            java.lang.String r0 = "۠ۧۨۘۧۨۥۖۨ۬۫ۥۘۚۘۦۘۚۨۤۧۗۥۘ۬۟۬ۖ۬ۙ"
            goto L_0x000d
        L_0x0207:
            java.lang.String r0 = "ۨۘۗۦۤۧۢ۟ۦۘۤۘ۟ۦۗۡۗۢۧۦۙۜۘۚۖۨۘ۫۠ۢ"
            r3 = r1
            goto L_0x000d
        L_0x020c:
            r6.setBackground(r3)
            java.lang.String r0 = "۟ۛۖۘ۟ۥۧۘۥ۠ۨۜ۫ۨۘۡۗۜ"
            goto L_0x000d
        L_0x0213:
            java.lang.String r0 = "۫ۨ۬۫ۦۦۘۖۢ۟ۧۤۦۖ۫ۦۘۦۜ۠ۨۦ۟"
            goto L_0x000d
        L_0x0217:
            java.lang.String r0 = "۠۫ۥۘ۠ۤۨۘۜ۟ۘۜۖۧۘۚۖ۠ۘۧۨۘۛۦۖۘۛ۬ۢۙ۬ۖۘ"
            goto L_0x000d
        L_0x021b:
            java.lang.String r0 = "ۜ۟ۖۘۖۤۤۚ۠ۥۗۘۨۘ۬۠ۖ"
            goto L_0x000d
        L_0x021f:
            java.lang.String r0 = "ۡۛۤ۬ۤ۠۬ۜۚ۠ۤۧۧۚ۠"
            goto L_0x000d
        L_0x0223:
            java.lang.String r0 = "ۨۘۗۦۤۧۢ۟ۦۘۤۘ۟ۦۗۡۗۢۧۦۙۜۘۚۖۨۘ۫۠ۢ"
            goto L_0x000d
        L_0x0227:
            java.lang.String r0 = "۟ۛۖۘ۟ۥۧۘۥ۠ۨۜ۫ۨۘۡۗۜ"
            goto L_0x000d
        L_0x022b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.titleToolbar():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int toolbarBg() {
        /*
            java.lang.String r0 = "ۗۜۘۛۜۖۤۨۜۘۡۦۡۡۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 786(0x312, float:1.101E-42)
            r3 = -609032231(0xffffffffdbb2e7d9, float:-1.0071493E17)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -325540518: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -7742171741633(0xfffff8f5629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getPrimaryColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.toolbarBg():int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r0 = "ۦ۟ۥۜۗۦۘۚۧۦۘۗ۠ۢ۬ۧۘۥ۫۫ۗ۬ۗۗۨ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void yoScroll(int r6) {
        /*
            r2 = 0
            r1 = 0
            java.lang.String r0 = "ۜۨۦۢۧۦۤۘۘۡۥۦۘۖۧۨۥ۬۬"
        L_0x0004:
            int r3 = r0.hashCode()
            r4 = 453(0x1c5, float:6.35E-43)
            r5 = -439037271(0xffffffffe5d4d2a9, float:-1.2562846E23)
            r3 = r3 ^ r4
            r3 = r3 ^ r5
            switch(r3) {
                case -1594498385: goto L_0x0088;
                case -1163876762: goto L_0x0093;
                case -1009637523: goto L_0x0013;
                case -906515983: goto L_0x0016;
                case 150153651: goto L_0x003d;
                case 783755745: goto L_0x0062;
                case 1219970421: goto L_0x0059;
                case 2033162026: goto L_0x0036;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0004
        L_0x0013:
            java.lang.String r0 = "ۤ۫ۙۛۦ۬ۢۖۘ۬ۧ۠ۨۘ۟ۡۨۡۘ"
            goto L_0x0004
        L_0x0016:
            r3 = 1863529969(0x6f1335f1, float:4.5559508E28)
            java.lang.String r0 = "ۚۦ۫۠ۥۦۘۛۦۚ۫۟ۚ۬۫ۜۘۧۢۤ"
        L_0x001b:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1034183264: goto L_0x0033;
                case 179707047: goto L_0x0024;
                case 1373048240: goto L_0x002a;
                case 2047427604: goto L_0x0070;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x001b
        L_0x0024:
            java.lang.String r0 = "ۚۖۧۧۙۨۗۥۨۘۚۨۘ۬ۧۖۦۥۡ۬ۧۤۚۢۚ"
            goto L_0x001b
        L_0x0027:
            java.lang.String r0 = "۬۟ۘ۬ۨ۬ۧۤۘۤۙ۫۫ۦ۠ۘۦۡۜ۬ۚۘۥۖۘ"
            goto L_0x001b
        L_0x002a:
            boolean r0 = IGStoriesEnabled()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "ۙ۬ۥۘۢۛۘۢۥۘۘۥۜۥ۫ۜۥۘ"
            goto L_0x001b
        L_0x0033:
            java.lang.String r0 = "ۙۚۘۘۖۜۢۛۤۤ۬ۘ۠ۜۤۢ"
            goto L_0x0004
        L_0x0036:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.view.View r2 = r0.mStatusContainer
            java.lang.String r0 = "ۖۛۙۡۢۙ۬ۤۥۘۛۘۗۘۙۥۘ"
            goto L_0x0004
        L_0x003d:
            r3 = 1257409284(0x4af28b04, float:7947650.0)
            java.lang.String r0 = "ۖۖۨ۬۫ۡ۫ۙۘۘۚۥۜۛ۟ۨۘۦۚۗۤ۟ۘۘ"
        L_0x0042:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1651866778: goto L_0x0070;
                case -86920799: goto L_0x0056;
                case 827858790: goto L_0x004b;
                case 1417069925: goto L_0x0051;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0042
        L_0x004b:
            java.lang.String r0 = "ۢۧۚ۠ۖ۬ۛ۬ۥۨۧۜۘۖۡ"
            goto L_0x0004
        L_0x004e:
            java.lang.String r0 = "ۖ۬ۡۚۛۡۘۦۢۚۧۧۡ۫ۥ۟ۗۚ"
            goto L_0x0042
        L_0x0051:
            if (r2 == 0) goto L_0x004e
            java.lang.String r0 = "ۥۧۛ۬ۛ۬ۥ۬۬ۗۢۖۡۜۘۘ"
            goto L_0x0042
        L_0x0056:
            java.lang.String r0 = "۬ۘۚ۠ۖۤۧۛۡ۟ۡ۫ۨۥۛ"
            goto L_0x0042
        L_0x0059:
            int r0 = -r6
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r0 / r1
            java.lang.String r0 = "ۚۚ۠ۡۖۤۡۖۧۘۘۧۘ۠ۗۖۘ"
            goto L_0x0004
        L_0x0062:
            r3 = 774292944(0x2e26c5d0, float:3.7919723E-11)
            java.lang.String r0 = "ۛۨۘۘۘۜۙ۫ۢ۠ۚۥۙ۬۟ۜۘۛ۟ۗۢ۬ۛۡۘۙ۟ۖ"
        L_0x0067:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -23471756: goto L_0x0070;
                case 245410746: goto L_0x0081;
                case 710360143: goto L_0x0076;
                case 900712086: goto L_0x0084;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0067
        L_0x0070:
            java.lang.String r0 = "ۦ۟ۥۜۗۦۘۚۧۦۘۗ۠ۢ۬ۧۘۥ۫۫ۗ۬ۗۗۨ"
            goto L_0x0004
        L_0x0073:
            java.lang.String r0 = "ۧۚۤۘۨۖۘۜۘۘۘۤۗ۟۠ۖۘۚۜۧۧۛۨ"
            goto L_0x0067
        L_0x0076:
            float r0 = r2.getTranslationY()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "۟ۚۘۢۖۘۤۨۖۘۦۖۘۤۘۙ"
            goto L_0x0067
        L_0x0081:
            java.lang.String r0 = "ۗۜۤ۬ۨۥۚۜۘۜۖۙ۠ۧۚ۠ۘۥۡۧۥۘ"
            goto L_0x0067
        L_0x0084:
            java.lang.String r0 = "ۚ۟ۖۘۧۘۧۙۦ۟ۢۡ۬۫ۖۢۨۗۡۚۗۛۜۧۧ"
            goto L_0x0004
        L_0x0088:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            android.view.View r0 = r0.mStatusContainer
            r0.setTranslationY(r1)
            java.lang.String r0 = "ۦ۟ۥۜۗۦۘۚۧۦۘۗ۠ۢ۬ۧۘۥ۫۫ۗ۬ۗۗۨ"
            goto L_0x0004
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.HomeUI.yoScroll(int):void");
    }
}
