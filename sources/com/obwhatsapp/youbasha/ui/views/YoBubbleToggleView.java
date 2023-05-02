package com.obwhatsapp.youbasha.ui.views;

import X.AnonymousClass00T;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.tf;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;

public class YoBubbleToggleView extends RelativeLayout {

    /* renamed from: i  reason: collision with root package name */
    public static final int f1392i = 0;

    /* renamed from: a  reason: collision with root package name */
    public n f1393a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1394b = false;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f1395c;

    /* renamed from: d  reason: collision with root package name */
    public tf f1396d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f1397e;

    /* renamed from: f  reason: collision with root package name */
    public int f1398f;

    /* renamed from: g  reason: collision with root package name */
    public float f1399g;

    /* renamed from: h  reason: collision with root package name */
    public float f1400h;

    public YoBubbleToggleView(Context context) {
        super(context);
        a(context);
    }

    public YoBubbleToggleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public YoBubbleToggleView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    @RequiresApi(api = 21)
    public YoBubbleToggleView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v6, resolved type: char} */
    /* JADX WARNING: type inference failed for: r42v7 */
    /* JADX WARNING: type inference failed for: r42v8 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r52) {
        /*
            r51 = this;
            r48 = 0
            r47 = 0
            r46 = 0
            r45 = 0
            r44 = 0
            r43 = 0
            r41 = 0
            r40 = 0
            r39 = 0
            r38 = 0
            r37 = 0
            r42 = 0
            r36 = 0
            r35 = 0
            r33 = 0
            r32 = 0
            r31 = 0
            r30 = 0
            r29 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r34 = 0
            r25 = 0
            r23 = 0
            r21 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            java.lang.String r2 = "ۙۤۦۢ۫ۨ۠ۨۨۖۖۗۙ۫ۛۨ۟ۡۘ"
            r3 = r2
        L_0x0051:
            int r2 = r3.hashCode()
            r49 = 606(0x25e, float:8.49E-43)
            r50 = -1093621323(0xffffffffbed0a9b5, float:-0.40754476)
            r2 = r2 ^ r49
            r2 = r2 ^ r50
            switch(r2) {
                case -2116836916: goto L_0x0676;
                case -2109414583: goto L_0x04e6;
                case -2104842346: goto L_0x05e9;
                case -2069785404: goto L_0x063b;
                case -2058496385: goto L_0x06c9;
                case -2054217220: goto L_0x047e;
                case -2037710534: goto L_0x04f2;
                case -1987122975: goto L_0x03ad;
                case -1982498362: goto L_0x0365;
                case -1944658735: goto L_0x0352;
                case -1916613361: goto L_0x0494;
                case -1902386884: goto L_0x0608;
                case -1887840923: goto L_0x018e;
                case -1885388178: goto L_0x011d;
                case -1858126954: goto L_0x006a;
                case -1816129402: goto L_0x05fa;
                case -1759030929: goto L_0x0180;
                case -1757584405: goto L_0x06c4;
                case -1703712414: goto L_0x01bc;
                case -1639114326: goto L_0x0591;
                case -1624583241: goto L_0x02b2;
                case -1612477185: goto L_0x01f8;
                case -1593214742: goto L_0x009b;
                case -1538605884: goto L_0x00ef;
                case -1459247540: goto L_0x04a9;
                case -1421053497: goto L_0x066e;
                case -1350351109: goto L_0x0684;
                case -1347584145: goto L_0x04dd;
                case -1335782544: goto L_0x02cc;
                case -1322429592: goto L_0x0572;
                case -1306735099: goto L_0x03eb;
                case -1280648182: goto L_0x0660;
                case -1244310014: goto L_0x0466;
                case -1219374288: goto L_0x042f;
                case -1206532951: goto L_0x03a6;
                case -1180306147: goto L_0x0315;
                case -1162289398: goto L_0x0206;
                case -1162262481: goto L_0x038a;
                case -1128516135: goto L_0x0438;
                case -1122633862: goto L_0x02fb;
                case -1076886099: goto L_0x0302;
                case -1001874315: goto L_0x02c5;
                case -958981242: goto L_0x04be;
                case -923418700: goto L_0x008e;
                case -832740132: goto L_0x0152;
                case -819156498: goto L_0x00c4;
                case -818147761: goto L_0x0159;
                case -812197973: goto L_0x01ea;
                case -796073751: goto L_0x01ff;
                case -794504538: goto L_0x053d;
                case -793844382: goto L_0x007f;
                case -778479908: goto L_0x06c4;
                case -772662382: goto L_0x04b4;
                case -700548603: goto L_0x0441;
                case -683367810: goto L_0x00e3;
                case -675920467: goto L_0x06e2;
                case -673454824: goto L_0x0652;
                case -670070680: goto L_0x06c9;
                case -630850169: goto L_0x06ec;
                case -570884089: goto L_0x051b;
                case -466692572: goto L_0x0504;
                case -449546575: goto L_0x01c3;
                case -437965409: goto L_0x00b9;
                case -436411561: goto L_0x0247;
                case -433929671: goto L_0x02d3;
                case -398875245: goto L_0x0373;
                case -398640596: goto L_0x032a;
                case -275715488: goto L_0x06e2;
                case -253387820: goto L_0x028b;
                case -196695143: goto L_0x06c9;
                case -73305418: goto L_0x06f6;
                case -64889106: goto L_0x00a5;
                case -51731418: goto L_0x02f4;
                case -36994332: goto L_0x05d4;
                case 6460019: goto L_0x05a3;
                case 80809860: goto L_0x061a;
                case 84098323: goto L_0x0066;
                case 97974992: goto L_0x00af;
                case 126158185: goto L_0x02da;
                case 221699963: goto L_0x014b;
                case 242362073: goto L_0x0391;
                case 313484896: goto L_0x0453;
                case 336543162: goto L_0x0225;
                case 337793161: goto L_0x048c;
                case 345842495: goto L_0x05cb;
                case 352137675: goto L_0x0611;
                case 377869377: goto L_0x0420;
                case 416178111: goto L_0x0485;
                case 426246737: goto L_0x0566;
                case 437893501: goto L_0x0554;
                case 569467243: goto L_0x06e2;
                case 584709182: goto L_0x03f6;
                case 684509283: goto L_0x037a;
                case 714608370: goto L_0x0475;
                case 762845144: goto L_0x039f;
                case 827369797: goto L_0x03ca;
                case 841442836: goto L_0x0549;
                case 846339139: goto L_0x03d5;
                case 914033098: goto L_0x03e0;
                case 976951907: goto L_0x01b5;
                case 1005505453: goto L_0x06c4;
                case 1020523237: goto L_0x0401;
                case 1044303205: goto L_0x0417;
                case 1067804338: goto L_0x040c;
                case 1101858185: goto L_0x06e2;
                case 1133810532: goto L_0x034b;
                case 1227428279: goto L_0x0062;
                case 1247316931: goto L_0x045c;
                case 1279459093: goto L_0x0124;
                case 1330711388: goto L_0x0344;
                case 1342220420: goto L_0x06c4;
                case 1353307016: goto L_0x0269;
                case 1355640829: goto L_0x06c4;
                case 1393271095: goto L_0x031c;
                case 1411423904: goto L_0x0116;
                case 1417375606: goto L_0x057f;
                case 1447168617: goto L_0x0644;
                case 1452979066: goto L_0x06c4;
                case 1584569820: goto L_0x05be;
                case 1613254144: goto L_0x06c9;
                case 1616580112: goto L_0x06c9;
                case 1617724402: goto L_0x0398;
                case 1621117048: goto L_0x03c0;
                case 1705393232: goto L_0x0187;
                case 1743709578: goto L_0x052d;
                case 1745814898: goto L_0x05df;
                case 1765010140: goto L_0x01f1;
                case 1890961349: goto L_0x049d;
                case 1928045845: goto L_0x0323;
                case 1979831985: goto L_0x06e7;
                case 1980585654: goto L_0x050f;
                case 1987659059: goto L_0x02ed;
                case 1995981751: goto L_0x04d1;
                case 2016290124: goto L_0x0383;
                case 2057177394: goto L_0x036c;
                case 2076038960: goto L_0x033d;
                case 2137699549: goto L_0x044a;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0051
        L_0x0062:
            java.lang.String r2 = "۠ۙ۬ۗ۠ۖۘۥ۬ۦۘۧۖۛۢۥ"
            r3 = r2
            goto L_0x0051
        L_0x0066:
            java.lang.String r2 = "ۘۛۤ۠۫۠ۧ۬ۚ۟ۜۖۙۦۙۦۡۨۘۨۥ۟ۨ۟ۨۘۧ۫۫"
            r3 = r2
            goto L_0x0051
        L_0x006a:
            r2 = 2
            r3 = 1096810496(0x41600000, float:14.0)
            android.content.res.Resources r48 = r51.getResources()
            android.util.DisplayMetrics r48 = r48.getDisplayMetrics()
            r0 = r48
            float r48 = android.util.TypedValue.applyDimension(r2, r3, r0)
            java.lang.String r2 = "ۤۤۜۗۡۧۨۗۘۘ۠ۖۨۨۡۢۤۖۧۛ۫ۧ"
            r3 = r2
            goto L_0x0051
        L_0x007f:
            r2 = 80
            int r2 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r2)
            float r2 = (float) r2
            r0 = r51
            r0.f1399g = r2
            java.lang.String r2 = "۟ۧ۬۠ۤۚۧۛۘ۬ۦۤۢۘۘ۬ۡ"
            r3 = r2
            goto L_0x0051
        L_0x008e:
            r2 = 24
            int r2 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r2)
            float r0 = (float) r2
            r47 = r0
            java.lang.String r2 = "۬۟۫ۚۚۚ۫ۢۤ۫ۛۦۘ۫ۦ۠ۡۛۛ۟ۢۙۚۦۖۘۥ۫"
            r3 = r2
            goto L_0x0051
        L_0x009b:
            r2 = 12
            int r46 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r2)
            java.lang.String r2 = "ۤۨۤۦۨ۠ۖۜ۠ۚۤۥۙۜۧ"
            r3 = r2
            goto L_0x0051
        L_0x00a5:
            r2 = 8
            int r45 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r2)
            java.lang.String r2 = "ۜ۟ۧ۠ۦۥۥۦۡۘ۬ۥ۟ۦۥۦۘۤ۫ۨۘ"
            r3 = r2
            goto L_0x0051
        L_0x00af:
            r2 = 300(0x12c, float:4.2E-43)
            r0 = r51
            r0.f1398f = r2
            java.lang.String r2 = "ۘۙۖۘ۫۬ۘۘۨۛ۟۬ۨۨۘۗۗۨ"
            r3 = r2
            goto L_0x0051
        L_0x00b9:
            java.lang.Object r2 = r51.getTag()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "ۤۧۨۘۦ۫ۢ۟ۗۖۘۢۢۙۙۧۨ"
            r44 = r2
            goto L_0x0051
        L_0x00c4:
            r3 = -1552486878(0xffffffffa376ee22, float:-1.3386113E-17)
            java.lang.String r2 = "ۙۚ۟ۦ۟ۙۢۧۢ۠ۗۜۗۢۡۘ۫ۘ۬"
        L_0x00c9:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1942937135: goto L_0x00d3;
                case -1765542255: goto L_0x00db;
                case -743009357: goto L_0x00de;
                case 1679724150: goto L_0x06e7;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            goto L_0x00c9
        L_0x00d3:
            if (r44 == 0) goto L_0x00d8
            java.lang.String r2 = "ۨ۠ۢۢۥ۫۟۬ۤۖۘۡۘۚ۬ۗ"
            goto L_0x00c9
        L_0x00d8:
            java.lang.String r2 = "ۥۗۛۘ۫ۡۧۥ۫ۨۤۦۘۙ۠ۨۘۜۙۖۘۧ۟ۘ"
            goto L_0x00c9
        L_0x00db:
            java.lang.String r2 = "۬ۙۜۘۧۘۢۤۗۥۘ۠۟ۜۘ۫ۖ۫ۘۡۧۘ"
            goto L_0x00c9
        L_0x00de:
            java.lang.String r2 = "۬ۜۢۡۜۧۘۨۖۗۢۦۧۘۘۚۖۘۦۧۚ"
            r3 = r2
            goto L_0x0051
        L_0x00e3:
            int r2 = r44.hashCode()
            switch(r2) {
                case -404757576: goto L_0x06ba;
                case -404559362: goto L_0x06b0;
                case 337440162: goto L_0x06a6;
                case 467731537: goto L_0x069c;
                case 812710511: goto L_0x0692;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            java.lang.String r2 = "ۤ۟ۤۤۚۘ۫ۤۖۖۦۘۗۤۧۡۙۘۘۙۙ۫ۘ۟ۘ۠ۤۧ"
            r3 = r2
            goto L_0x0051
        L_0x00ef:
            r3 = 1747836545(0x682dde81, float:3.2842955E24)
            java.lang.String r2 = "ۢ۠ۛۢۜۘۘۛۥۡ۠ۙۡۡۗ"
        L_0x00f4:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -32761034: goto L_0x0697;
                case 981540151: goto L_0x00fe;
                case 1592554975: goto L_0x0104;
                case 2093506315: goto L_0x0111;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x00f4
        L_0x00fe:
            java.lang.String r2 = "۬ۘ۠ۚ۬ۨۘۦۧۚۛۛۚۘۗ۠"
            goto L_0x00f4
        L_0x0101:
            java.lang.String r2 = "۟ۙۥۘۨ۫۠ۤۨۘۗۡۡۡ۬ۨۥ۠ۦۘ"
            goto L_0x00f4
        L_0x0104:
            java.lang.String r2 = "b_status"
            r0 = r44
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0101
            java.lang.String r2 = "ۧ۬۫ۖۨۘۧۤۜۘۖۚۨۡۙۡۡۜۗۡۛۖ۫ۘۡ"
            goto L_0x00f4
        L_0x0111:
            java.lang.String r2 = "ۦۚۘۘۛۥۛ۠ۤۨۘۚۧۧ۫ۗ۫ۜۡۡۛ۠۫"
            r3 = r2
            goto L_0x0051
        L_0x0116:
            r43 = 4
            java.lang.String r2 = "۠ۙۢۚۥۜۘ۬۬ۡۥۘۨۤۧۡۘ۟۬ۡۤۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x011d:
            java.lang.String r2 = "ۘۥۚ۟ۖۢ۟ۢۡۘۢۚۘۘۦۚۜۘۢۗ۫ۨۦۡۘ"
            r3 = r2
            r42 = r43
            goto L_0x0051
        L_0x0124:
            r3 = -1667730123(0xffffffff9c987535, float:-1.0088814E-21)
            java.lang.String r2 = "ۚۥۘۘۤۥۧۚۘۥۘۤۛۛ۬ۘ۟ۡۘ"
        L_0x0129:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1941460921: goto L_0x0139;
                case -772388056: goto L_0x06a1;
                case -84005524: goto L_0x0133;
                case 1873201354: goto L_0x0146;
                default: goto L_0x0132;
            }
        L_0x0132:
            goto L_0x0129
        L_0x0133:
            java.lang.String r2 = "ۘۙۙ۫ۤۨ۟ۗۜۘۢۡۡۘۨۖۘۢۡۤۤۧ"
            goto L_0x0129
        L_0x0136:
            java.lang.String r2 = "۫ۧۛ۟ۙ۠ۗ۠ۦۘۤۥۡۙۖۘ"
            goto L_0x0129
        L_0x0139:
            java.lang.String r2 = "b_groups"
            r0 = r44
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0136
            java.lang.String r2 = "ۨ۠ۙۘۜۘۤ۟ۥ۫۠۟ۚۡۧ۠ۢۚۗۜۡۖ۫۟"
            goto L_0x0129
        L_0x0146:
            java.lang.String r2 = "ۖۖۘۨ۬ۘۤۛۗۘۨۗۤۖ۟ۛۚ۟"
            r3 = r2
            goto L_0x0051
        L_0x014b:
            r41 = 3
            java.lang.String r2 = "ۤۦۧۨۘۗۘۘۥۘۢ۬ۜۗۡۜۜۜ۠ۗۧۨۛۙۢ"
            r3 = r2
            goto L_0x0051
        L_0x0152:
            java.lang.String r2 = "ۗ۫ۦۡ۬۫ۘۢۦۘۧۛۘ۬ۖۘۤۘۜ"
            r3 = r2
            r42 = r41
            goto L_0x0051
        L_0x0159:
            r3 = 352697738(0x1505bd8a, float:2.7008656E-26)
            java.lang.String r2 = "۟ۚۖۘۘۜۙۖ۬۬ۛۥۧۘۙۨۧ"
        L_0x015e:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1886625853: goto L_0x06ab;
                case -1749717451: goto L_0x0170;
                case 194337750: goto L_0x0168;
                case 1997412924: goto L_0x017d;
                default: goto L_0x0167;
            }
        L_0x0167:
            goto L_0x015e
        L_0x0168:
            java.lang.String r2 = "ۚۘۜۘۡۢۥۦ۠ۨۜ۬ۘۙ۬"
            r3 = r2
            goto L_0x0051
        L_0x016d:
            java.lang.String r2 = "ۗ۠ۦۚ۫ۗ۬ۘ۫ۡۥۡ۫ۤۥ۠ۤۘۘ"
            goto L_0x015e
        L_0x0170:
            java.lang.String r2 = "b_camera"
            r0 = r44
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x016d
            java.lang.String r2 = "۟ۦۜۘۦۧ۟ۙۘۗ۟ۦۗۘۡۛۥۡۗۜۚۛۖۚۤۡۘ"
            goto L_0x015e
        L_0x017d:
            java.lang.String r2 = "ۜۨۥۗۥۥۘۦۨ۬ۗۘۗ۫۟ۖۘ"
            goto L_0x015e
        L_0x0180:
            r40 = 2
            java.lang.String r2 = "ۗۤۥۗ۠ۚ۠ۨۘۢۜ۬ۥۡۦۘۧ۟ۗۗۡۛ"
            r3 = r2
            goto L_0x0051
        L_0x0187:
            java.lang.String r2 = "ۡۗۖۢۜۧۨۖۖۖ۬ۖۘۦ۠ۤۛۤۛۨۢۙۧ"
            r3 = r2
            r42 = r40
            goto L_0x0051
        L_0x018e:
            r3 = 1077609573(0x403b0465, float:2.9221432)
            java.lang.String r2 = "ۖۙۤ۠ۦۤۤۚۘۘۢۤۧ۬ۨۘۥۜ۠ۙۛ"
        L_0x0193:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1991527828: goto L_0x01b0;
                case -1757120517: goto L_0x06b5;
                case -1482810: goto L_0x01ad;
                case 2010630052: goto L_0x019d;
                default: goto L_0x019c;
            }
        L_0x019c:
            goto L_0x0193
        L_0x019d:
            java.lang.String r2 = "b_chats"
            r0 = r44
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x01aa
            java.lang.String r2 = "ۥۤۖۘۛ۠ۤۙۤ۠ۦۘۘۤۛ۠ۙۧ۬ۤۜۨۘۜۥۚۨۦۘۘ"
            goto L_0x0193
        L_0x01aa:
            java.lang.String r2 = "ۘۛۦۖۘۖ۬ۥۖۖۖ۟ۗۨۘ۬ۛۦۤۙۗۜۤۡۘ"
            goto L_0x0193
        L_0x01ad:
            java.lang.String r2 = "ۘۦ۬ۤ۫ۥۘۦ۫ۨۘۨۦۧۢۨۙۧۨۤۥۨۘ"
            goto L_0x0193
        L_0x01b0:
            java.lang.String r2 = "۟ۥۜ۫۠ۥۘ۬۫ۖۘ۬ۘ۠ۗۜۘۘۡۙۜ۬۟ۤۘۥۜۘۖۗۢ"
            r3 = r2
            goto L_0x0051
        L_0x01b5:
            r39 = 1
            java.lang.String r2 = "ۤ۫ۡۘۖۘۙۘۗۚۙۦۚۙۗۦۚ۫ۗ"
            r3 = r2
            goto L_0x0051
        L_0x01bc:
            java.lang.String r2 = "ۘ۬ۢۗۨۗۖ۬ۜۤۤ۫ۡۜۘۤۡۜۚ۟۟"
            r3 = r2
            r42 = r39
            goto L_0x0051
        L_0x01c3:
            r3 = 1264800294(0x4b635226, float:1.4897702E7)
            java.lang.String r2 = "ۥۚۨ۬ۨۘۗۨۘۤ۫ۚۛ۫ۤۨۛۘۘ۠ۡۜۘۘۢ"
        L_0x01c8:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1022216097: goto L_0x01da;
                case -744121850: goto L_0x06bf;
                case 216473621: goto L_0x01d2;
                case 1660269926: goto L_0x01e7;
                default: goto L_0x01d1;
            }
        L_0x01d1:
            goto L_0x01c8
        L_0x01d2:
            java.lang.String r2 = "ۖۙۗۗ۬۫ۘۙ۟ۗ۫ۥۘۘۙۖۙۜۘۤۘۢۚۤۛ"
            r3 = r2
            goto L_0x0051
        L_0x01d7:
            java.lang.String r2 = "۠ۘۖۘۧۦۚۤۥۘۘۜۨۖۘ۬ۢ۬ۙۜۦۗۢۨ"
            goto L_0x01c8
        L_0x01da:
            java.lang.String r2 = "b_calls"
            r0 = r44
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x01d7
            java.lang.String r2 = "ۧ۠ۥۡۧۚۜۤۧۗۛۘۘ۫ۗۧ"
            goto L_0x01c8
        L_0x01e7:
            java.lang.String r2 = "ۤ۠ۚۗۙ۫ۥۦۘۗ۠ۨۘۘۦ"
            goto L_0x01c8
        L_0x01ea:
            r38 = 0
            java.lang.String r2 = "ۗۖۢۜ۬ۜ۬۬ۚۘ۟ۙۥۛ"
            r3 = r2
            goto L_0x0051
        L_0x01f1:
            java.lang.String r2 = "۬ۘۗۦۧۦۘۙۖۖۘۢ۟۟۬۫ۜۘۧۧۛ۬ۖۗ"
            r3 = r2
            r42 = r38
            goto L_0x0051
        L_0x01f8:
            r37 = -1
            java.lang.String r2 = "ۧۡۙ۟۟ۡۘ۫۠ۨۦۨۦۡۧۜۘۗۛۤۗۦۧۘۧۤۖ"
            r3 = r2
            goto L_0x0051
        L_0x01ff:
            java.lang.String r2 = "ۢ۬ۥۘۘۚۥ۬ۘۤۨۨ۠ۡۙۘۘ۠ۢ۠۫ۙۥۦۖ۠ۧ۠۫"
            r3 = r2
            r42 = r37
            goto L_0x0051
        L_0x0206:
            r3 = -1159148530(0xffffffffbae8cc0e, float:-0.0017761008)
            java.lang.String r2 = "۬ۘۛ۟ۤۖۡۥۨۖۖ۟ۡۜۤۥ۠ۖۘۗۥۜۘۡۦۘ۫۠ۚ"
        L_0x020b:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case 94234710: goto L_0x0220;
                case 1260915182: goto L_0x06dd;
                case 1714235158: goto L_0x021d;
                case 1792802987: goto L_0x0215;
                default: goto L_0x0214;
            }
        L_0x0214:
            goto L_0x020b
        L_0x0215:
            if (r42 == 0) goto L_0x021a
            java.lang.String r2 = "ۗۧۙ۟ۧ۬ۡۧۜۘۥ۬ۡۗۘۖ"
            goto L_0x020b
        L_0x021a:
            java.lang.String r2 = "ۨۡۦۨۦ۠۫ۨ۟۫ۚۥۘۡۤۛۚۨۨۘۛۘۜۘ"
            goto L_0x020b
        L_0x021d:
            java.lang.String r2 = "ۧ۟ۘ۠ۜۨۘۙۡۡۧۡۧۘۛۛ"
            goto L_0x020b
        L_0x0220:
            java.lang.String r2 = "ۨۦۦۘۢۚۜۘۘۡۜۘۥۘۖۘۗۤ۠ۦۨۗۙۦۖۘۡۨ۫ۡۦ۫"
            r3 = r2
            goto L_0x0051
        L_0x0225:
            r3 = 674430074(0x2832fc7a, float:9.935732E-15)
            java.lang.String r2 = "ۙۧۚۜۜۘۘۛۦ۫ۖۘۤۙ۫ۧۧۙۙۡۖ۫ۛۘ"
        L_0x022a:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1194306701: goto L_0x06d8;
                case -605040733: goto L_0x0242;
                case -447626423: goto L_0x023a;
                case 50836215: goto L_0x0234;
                default: goto L_0x0233;
            }
        L_0x0233:
            goto L_0x022a
        L_0x0234:
            java.lang.String r2 = "ۖۤۜ۫۠ۖۘۢ۟۟ۤ۫ۨۜ۠ۘ۠ۨۢۛۜۗۛ۬ۜۘ"
            goto L_0x022a
        L_0x0237:
            java.lang.String r2 = "۟ۨۘۜۤۡۘۥۥۨۥ۫ۘۘۙۨۘ"
            goto L_0x022a
        L_0x023a:
            r2 = 1
            r0 = r42
            if (r0 == r2) goto L_0x0237
            java.lang.String r2 = "ۖ۬ۡۘۛۘۦۛۦۤۤۛۖ۬ۘۧۘۙۖۡۘۙ۬۫ۨۜۘۙۥۖۘ"
            goto L_0x022a
        L_0x0242:
            java.lang.String r2 = "ۘۥ۟ۤۖۜۘۖ۟ۥۘ۬ۨۖۚۜۜ"
            r3 = r2
            goto L_0x0051
        L_0x0247:
            r3 = -1173218120(0xffffffffba121cb8, float:-5.5737374E-4)
            java.lang.String r2 = "ۙ۬۫۠ۨۤۗۖۘۦۙۧۤۤۦۗ۠ۙۗۙۖۙۜۘ"
        L_0x024c:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -28801913: goto L_0x0264;
                case 679220370: goto L_0x0256;
                case 697676642: goto L_0x0261;
                case 1332572914: goto L_0x06d3;
                default: goto L_0x0255;
            }
        L_0x0255:
            goto L_0x024c
        L_0x0256:
            r2 = 2
            r0 = r42
            if (r0 == r2) goto L_0x025e
            java.lang.String r2 = "۟ۚۥۘۥۜۖۘۡۚ۬ۖۧۡۘۦۧۜۘ۠۫ۤۛۧۥۘۨۛ"
            goto L_0x024c
        L_0x025e:
            java.lang.String r2 = "۫ۗۜۘ۫ۧ۟۠ۤۨۘۨۖۨۘۘۗۚ۫ۦۘ۬ۛ۟ۢۛۨۘ"
            goto L_0x024c
        L_0x0261:
            java.lang.String r2 = "ۛۜۖۘ۬ۨۦ۫ۘ۫ۦۚ۟ۦ۬ۦۡ۟ۛۚۗۛۤۗ۟"
            goto L_0x024c
        L_0x0264:
            java.lang.String r2 = "ۦۥۚ۠ۘۨۘۧۡۨۘۢ۫ۥۘۦ۫ۦۘۖۙ۬ۗۡۨۘ"
            r3 = r2
            goto L_0x0051
        L_0x0269:
            r3 = -75664399(0xfffffffffb7d73f1, float:-1.3160027E36)
            java.lang.String r2 = "ۜۙۡۘۢۥ۫ۧۡۡۚۤۥۗ۬ۦۘ۬ۥۡۘ"
        L_0x026e:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1760373679: goto L_0x0278;
                case -281933236: goto L_0x0286;
                case 833956436: goto L_0x06ce;
                case 1155325038: goto L_0x027e;
                default: goto L_0x0277;
            }
        L_0x0277:
            goto L_0x026e
        L_0x0278:
            java.lang.String r2 = "ۤۚۙۤۤۦۤ۟ۘۨۡۤۦۜۘۛۜۨۧۖۜۙۧۦۘۚۦ۠"
            goto L_0x026e
        L_0x027b:
            java.lang.String r2 = "ۜ۟ۥۘۥۘۚۧۦ۠ۡۧ۟ۗۜۘۤۦ۫۠ۗۢۗۢۜ"
            goto L_0x026e
        L_0x027e:
            r2 = 3
            r0 = r42
            if (r0 == r2) goto L_0x027b
            java.lang.String r2 = "ۖۨۗۡۡۜۜۙۚۙ۠ۨۗۧۜۘۨۛۚ۟ۘ۬ۜۜۘۘ۠ۤۗ"
            goto L_0x026e
        L_0x0286:
            java.lang.String r2 = "ۖ۟ۥ۟ۤۦۘۛ۟ۜۘۥۤۘۢ۬ۤ۟ۗۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x028b:
            r3 = -787020812(0xffffffffd11703f4, float:-4.0537899E10)
            java.lang.String r2 = "۟ۗۨۘۥ۠ۘۘۥۢۜ۬ۜۥۥۖۧۘۙۨۖۗۧۤۖۤۨۘۨۨۡۘ"
        L_0x0290:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1270766822: goto L_0x02ad;
                case -1134083675: goto L_0x02aa;
                case -76377216: goto L_0x029a;
                case 519451561: goto L_0x02a2;
                default: goto L_0x0299;
            }
        L_0x0299:
            goto L_0x0290
        L_0x029a:
            java.lang.String r2 = "ۜۗۡۤ۠ۖۚۥۜۙ۫ۡ۬ۨۥۛۘ۟ۗۨۘ"
            r3 = r2
            goto L_0x0051
        L_0x029f:
            java.lang.String r2 = "۟۠ۢۡۚۖۧۦۡۘۙۤۘ۟ۦۖ"
            goto L_0x0290
        L_0x02a2:
            r2 = 4
            r0 = r42
            if (r0 == r2) goto L_0x029f
            java.lang.String r2 = "ۥ۬۬ۦۛۧۧۢۙ۟ۨۖۤۙۚۜۛۜۦۢۡ"
            goto L_0x0290
        L_0x02aa:
            java.lang.String r2 = "۟ۦ۬ۖۢ۠ۖۡۜ۠ۗۦۘۢ۟ۖ"
            goto L_0x0290
        L_0x02ad:
            java.lang.String r2 = "ۚۛۖ۟ۤۜۤۢۜۘۛۦۦۗۖۜ۬ۗۛۥۜۧۘ"
            r3 = r2
            goto L_0x0051
        L_0x02b2:
            java.lang.String r2 = "ic_bubble_status"
            java.lang.String r3 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r52
            android.graphics.drawable.Drawable r36 = X.AnonymousClass00T.A04(r0, r2)
            java.lang.String r2 = "ۖۛۙ۠ۢۚۙۖۡ۬ۨۥۢۚۜۘۡۨۤۢ۠"
            r3 = r2
            goto L_0x0051
        L_0x02c5:
            java.lang.String r35 = "statuses"
            java.lang.String r2 = "۠ۢ۠ۛ۫ۜۘۜ۬ۦۧۚۗ۫ۘ۬۟ۜۧۢۨۤ"
            r3 = r2
            goto L_0x0051
        L_0x02cc:
            java.lang.String r2 = "ۨۧۦۘ۫ۗ۬ۙۛۡۖۛۚۥۡۢۜۙ۫ۛۢۦۘۢ۫ۜۘۚۡۘۘ"
            r3 = r2
            r25 = r36
            goto L_0x0051
        L_0x02d3:
            java.lang.String r2 = "ۦۜۦ۟ۧۛۧۧ۫ۤۜۛۢۧۖۛۜۡۘۚۥۦۘ"
            r3 = r2
            r34 = r35
            goto L_0x0051
        L_0x02da:
            java.lang.String r2 = "ic_bubble_group"
            java.lang.String r3 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r52
            android.graphics.drawable.Drawable r33 = X.AnonymousClass00T.A04(r0, r2)
            java.lang.String r2 = "۫ۖ۬ۥ۟ۘۘ۠ۥۥۘۖۜۛۘ۟ۖۘۤۖۖۘۦۤۡۖۖۜ"
            r3 = r2
            goto L_0x0051
        L_0x02ed:
            java.lang.String r32 = "notification_settings_title_groups"
            java.lang.String r2 = "۬ۧۚۤۥۤۢۖۧۡۡۖۘۦۥۘۘۦۥۜ"
            r3 = r2
            goto L_0x0051
        L_0x02f4:
            java.lang.String r2 = "ۦۛ۠۠۫ۘۛ۠ۙۖۧۥۘۡۨۦۘ۟ۘۥۘۤۨۨۘۦۥ۟۬ۦۜ"
            r3 = r2
            r25 = r33
            goto L_0x0051
        L_0x02fb:
            java.lang.String r2 = "ۗ۫ۖۘۜۜۧۙ۬ۦۗۚ۟ۚ"
            r3 = r2
            r34 = r32
            goto L_0x0051
        L_0x0302:
            java.lang.String r2 = "rc_cam_bubb"
            java.lang.String r3 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r52
            android.graphics.drawable.Drawable r31 = X.AnonymousClass00T.A04(r0, r2)
            java.lang.String r2 = "ۧۜۧۘۦۢۤۚۙۢۥۖۧ۫۫ۨۘۥۙ۠ۡ۫ۨۙۙۜۛ"
            r3 = r2
            goto L_0x0051
        L_0x0315:
            java.lang.String r30 = "camera_button_description"
            java.lang.String r2 = "ۨۤۤۜۦۨۛۦۗۧۘۨۘ۟۫ۚۙۤۜ۠ۢۘ"
            r3 = r2
            goto L_0x0051
        L_0x031c:
            java.lang.String r2 = "ۘۚۡۖۛۦ۫۟ۥۥۙۧ۫ۦۥۨۧۜ۠ۗ۬"
            r3 = r2
            r25 = r31
            goto L_0x0051
        L_0x0323:
            java.lang.String r2 = "۫ۚۜۘۢ۬ۘۘ۠ۡۛ۬ۧۨۧۛ۫ۦۢۢ۟ۜۘۨۚۜ"
            r3 = r2
            r34 = r30
            goto L_0x0051
        L_0x032a:
            java.lang.String r2 = "rc_chat_bubb"
            java.lang.String r3 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r52
            android.graphics.drawable.Drawable r29 = X.AnonymousClass00T.A04(r0, r2)
            java.lang.String r2 = "ۧۘۚۤۢۘۨۘۖۘ۟ۡۧۘۢۦ۫۠ۡۦۚۦۡ۬۬ۨۢۖ"
            r3 = r2
            goto L_0x0051
        L_0x033d:
            java.lang.String r28 = "chats"
            java.lang.String r2 = "ۥۛۖۘۧۘۡۨۜۤۗ۫ۦۧۤۖۚۖ۠ۢ۬۠۠ۦ"
            r3 = r2
            goto L_0x0051
        L_0x0344:
            java.lang.String r2 = "ۧۙۘۘۧۖۖۘۥۨۜۘۡۦۘۥۘۘۘۛۘۡۘۧۘۘ"
            r3 = r2
            r25 = r29
            goto L_0x0051
        L_0x034b:
            java.lang.String r2 = "ۡۛۨۜ۠ۖۚۦ۟ۢ۟ۤ۬ۘۖۡۥۘ"
            r3 = r2
            r34 = r28
            goto L_0x0051
        L_0x0352:
            java.lang.String r2 = "rc_call_bubb"
            java.lang.String r3 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r52
            android.graphics.drawable.Drawable r27 = X.AnonymousClass00T.A04(r0, r2)
            java.lang.String r2 = "ۖۘۛۥۧۢۛۚۗ۬۠ۥۘ۟ۚۗۘۥۘۛۗۚۘۜۘۤۚ۠"
            r3 = r2
            goto L_0x0051
        L_0x0365:
            java.lang.String r26 = "network_usage_calls"
            java.lang.String r2 = "ۥۙۨۘۦۤۡۘ۟ۤۨۘۘۗۨۘۖۖۖ"
            r3 = r2
            goto L_0x0051
        L_0x036c:
            java.lang.String r2 = "ۖۢۡۧۖۙ۟۠۠ۧ۫۬ۦۜۘۘۛ۬ۥۘ"
            r3 = r2
            r34 = r26
            goto L_0x0051
        L_0x0373:
            java.lang.String r2 = "ۛۡۧۦۙۙۜۚۧۡ۬ۦۘۗۥۡۘۤۨۚۦۜۖۘ"
            r3 = r2
            r25 = r27
            goto L_0x0051
        L_0x037a:
            java.lang.String r23 = com.obwhatsapp.yo.yo.getString((java.lang.String) r34)
            java.lang.String r2 = "۬ۡ۠ۙ۫ۥۨۢۙۨ۟ۘۘ۫ۤۖۧ۫ۘۘۗ۫"
            r3 = r2
            goto L_0x0051
        L_0x0383:
            java.lang.String r2 = "ۨۧۦۨ۬ۙۛۗۖ۠ۙۚۜۚ۟ۛۦۗۘۚۘۘۨۛۙ"
            r3 = r2
            r24 = r25
            goto L_0x0051
        L_0x038a:
            java.lang.String r2 = "ۜ۟ۥۛ۬ۤۙۗۥۘۛۢۗۗ۟ۖۘۦۨۡۙ۟ۖۜۘ۫ۢۨۘ"
            r3 = r2
            r22 = r23
            goto L_0x0051
        L_0x0391:
            java.lang.String r21 = "Title"
            java.lang.String r2 = "ۥۖۥۖۚ۟ۗ۟ۨۖۗۦۘ۫۬ۙۥ۫۫"
            r3 = r2
            goto L_0x0051
        L_0x0398:
            r20 = 0
            java.lang.String r2 = "۠ۢۛۡ۠ۡۘۙۖۥ۠ۡ۬ۗۖۤ"
            r3 = r2
            goto L_0x0051
        L_0x039f:
            java.lang.String r2 = "۟۫ۤۚ۠ۖۘۘۘ۠ۙۙۛۦۥۜ"
            r3 = r2
            r22 = r21
            goto L_0x0051
        L_0x03a6:
            java.lang.String r2 = "ۥۜۡۘۚۚۡۘۚۚۤۧۡۘۨۛۧۤ۫ۦۘۗۡۧۘ۫۠ۨ"
            r3 = r2
            r24 = r20
            goto L_0x0051
        L_0x03ad:
            java.lang.String r2 = "transition_background_drawable"
            java.lang.String r3 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r52
            android.graphics.drawable.Drawable r19 = X.AnonymousClass00T.A04(r0, r2)
            java.lang.String r2 = "ۛۨۧۦۡۘۗۨۦۘۢۖۙۡۦۗ"
            r3 = r2
            goto L_0x0051
        L_0x03c0:
            com.obwhatsapp.youbasha.ui.views.n r18 = new com.obwhatsapp.youbasha.ui.views.n
            r18.<init>()
            java.lang.String r2 = "ۙۛۢۨۗۙۡۢۛۤ۬۟ۥۚۨۘ۬ۙۗۛۨۘۨۨۛ"
            r3 = r2
            goto L_0x0051
        L_0x03ca:
            r0 = r18
            r1 = r51
            r1.f1393a = r0
            java.lang.String r2 = "ۦۨۖۡۡۧۘۙۚۖۘۧۤۘۢۗ"
            r3 = r2
            goto L_0x0051
        L_0x03d5:
            r0 = r24
            r1 = r18
            r1.f1490a = r0
            java.lang.String r2 = "۬ۘ۠ۧۖۨ۟ۢۘۡۧۖۗ۟ۜۘۢ۟ۧ۟ۧۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x03e0:
            r0 = r19
            r1 = r18
            r1.f1491b = r0
            java.lang.String r2 = "ۥۦۗۨۖۥۗۢۡۢۛۦۘ۟ۛۚۖۦۚۖۜۜۘۚۗۙۜ"
            r3 = r2
            goto L_0x0051
        L_0x03eb:
            r0 = r22
            r1 = r18
            r1.f1492c = r0
            java.lang.String r2 = "۟ۚۖۘ۠ۜ۬ۡۧۜۘۚۦۧۘۥۧۦۘۡۘ۫۬ۗۜ۟ۜۘۘۥۨۘ"
            r3 = r2
            goto L_0x0051
        L_0x03f6:
            r0 = r48
            r1 = r18
            r1.f1499j = r0
            java.lang.String r2 = "ۗ۟ۡۘۨ۟ۙۘۖۨۖۢۥۧ۠ۙ"
            r3 = r2
            goto L_0x0051
        L_0x0401:
            r0 = r45
            r1 = r18
            r1.f1502m = r0
            java.lang.String r2 = "ۥ۬ۖۘۤۖۘ۠۫ۤ۫ۚۡ۟ۦۤۖۖۘۘ۟ۦۧ"
            r3 = r2
            goto L_0x0051
        L_0x040c:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r18
            r0.f1495f = r2
            java.lang.String r2 = "ۢۢۧۗۥۘۡۘۙۖۚۤۜ۬۟"
            r3 = r2
            goto L_0x0051
        L_0x0417:
            int r17 = com.obwhatsapp.youbasha.others.getTabInActiveColor()
            java.lang.String r2 = "ۚ۠۬۬۟ۙۘۡۖۘۖۛۨۚۨۥۘ۠ۜ۟"
            r3 = r2
            goto L_0x0051
        L_0x0420:
            java.lang.String r2 = "pagetitle_sel_picker"
            int r3 = com.obwhatsapp.yo.ColorStore.getPrimaryColor()
            int r16 = com.obwhatsapp.youbasha.others.getColor(r2, r3)
            java.lang.String r2 = "۬۟ۚۙۜۜۘۖۢۢۢۥۖۘۨ۠ۨ"
            r3 = r2
            goto L_0x0051
        L_0x042f:
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r15 = r0.f1393a
            java.lang.String r2 = "ۙۜۚۚ۬ۥۘۥۖ۬ۥۤۜۖۘۢۦۦۖۙۨۚۖۨۛۗۗ"
            r3 = r2
            goto L_0x0051
        L_0x0438:
            r0 = r16
            r15.f1493d = r0
            java.lang.String r2 = "ۛۢۢۢۤۢۙۜۡ۫ۥۥۘۙۛۖ"
            r3 = r2
            goto L_0x0051
        L_0x0441:
            r0 = r17
            r15.f1494e = r0
            java.lang.String r2 = "۠ۜۧۥۦۘۛۨۤۛۧۡۘۘۦۢۢۖۦۢ"
            r3 = r2
            goto L_0x0051
        L_0x044a:
            r0 = r47
            r15.f1501l = r0
            java.lang.String r2 = "۠ۜۙ۟ۛۤۨۜۘۗۤ۫ۡۦۘۘ۠ۥۧۜۘ۟"
            r3 = r2
            goto L_0x0051
        L_0x0453:
            r0 = r46
            r15.f1503n = r0
            java.lang.String r2 = "ۢۜۜۘۤۡۥۥۦۧۘۧۧۨۘۤ۟ۗ"
            r3 = r2
            goto L_0x0051
        L_0x045c:
            r2 = -1
            int r14 = com.obwhatsapp.youbasha.others.getTabBageBKColor(r2)
            java.lang.String r2 = "ۜۥۗۡۖۘۡ۫ۗۛۗۧۙۥۨ"
            r3 = r2
            goto L_0x0051
        L_0x0466:
            java.lang.String r2 = "tabadgeTextColor"
            int r3 = com.obwhatsapp.yo.yo.circleColor()
            int r13 = com.obwhatsapp.youbasha.others.getColor(r2, r3)
            java.lang.String r2 = "ۚ۫ۜۚۗۨۘۜۥۧۖۧۡۘۡۡۤ۫ۘۘۗۛۘۘۗۤ۟"
            r3 = r2
            goto L_0x0051
        L_0x0475:
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r12 = r0.f1393a
            java.lang.String r2 = "ۢۤۨ۬ۛۨ۟ۖ۬ۛۢۜۘۡ۫ۨۘۤۤۡۘۜ۫ۡۘ۠ۘ۫۠۠"
            r3 = r2
            goto L_0x0051
        L_0x047e:
            r12.f1498i = r14
            java.lang.String r2 = "۟ۙ۬۬ۙۜۛ۫ۨ۬ۚۙ۟ۡۗۜۙ۠۟ۦ۬ۘۘۥۧۛۦ"
            r3 = r2
            goto L_0x0051
        L_0x0485:
            r12.f1497h = r13
            java.lang.String r2 = "۫۫ۖ۬ۧۙۙۚۖۛۨۢۜۖ۬۫ۗۘۤ"
            r3 = r2
            goto L_0x0051
        L_0x048c:
            r2 = 0
            r12.f1496g = r2
            java.lang.String r2 = "ۥ۟ۜۘۗۨۙۧ۬ۥۜۥۦۖ۟ۖۘۚۙۙۨۘ۠ۤ۟ۦۘۡۛۛ"
            r3 = r2
            goto L_0x0051
        L_0x0494:
            r2 = 0
            float r2 = (float) r2
            r12.f1500k = r2
            java.lang.String r2 = "ۥۘۡۘۛ۬۫ۛۙۚۘۗۡۗۚۧ"
            r3 = r2
            goto L_0x0051
        L_0x049d:
            r2 = 17
            r0 = r51
            r0.setGravity(r2)
            java.lang.String r2 = "ۡ۬ۦۘۘۤ۠ۙۧۖۘۚۛ۬۟۬ۥۘۖۛ۠ۤۦ۠"
            r3 = r2
            goto L_0x0051
        L_0x04a9:
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r2 = r0.f1393a
            int r11 = r2.f1503n
            java.lang.String r2 = "ۦ۟ۤۡۤ۬ۡ۟ۡ۟ۨۧۘۡۡۨۘ۟ۖۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x04b4:
            r0 = r51
            r0.setPadding(r11, r11, r11, r11)
            java.lang.String r2 = "۫۟ۘۗۢۖۘ۬ۚۡۢۖۘۦ۠ۨۘۜ۠ۚۡۛۜۖۗۦ"
            r3 = r2
            goto L_0x0051
        L_0x04be:
            com.obwhatsapp.yo.d r2 = new com.obwhatsapp.yo.d
            r3 = 15
            r0 = r51
            r2.<init>(r0, r3)
            r0 = r51
            r0.post(r2)
            java.lang.String r2 = "ۡۧۤۦۥۙۖۗۚۧۢۜ۟ۨۘۗۗۘۘۛۖۢ"
            r3 = r2
            goto L_0x0051
        L_0x04d1:
            android.widget.ImageView r10 = new android.widget.ImageView
            r0 = r52
            r10.<init>(r0)
            java.lang.String r2 = "ۢۡۜۘۘۤۥۘۙۖۙۨۖ۠ۨۛۙۤ۬ۙ۟ۘۘ"
            r3 = r2
            goto L_0x0051
        L_0x04dd:
            r0 = r51
            r0.f1395c = r10
            java.lang.String r2 = "ۙۘۨۚۜۦۘۖۜ۟ۤ۬ۙۢۗۙۧۢۜۘۖۢۜۘۢ۟ۖ۫۫ۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x04e6:
            int r2 = androidx.core.view.ViewCompat.generateViewId()
            r10.setId(r2)
            java.lang.String r2 = "ۙۘۧۡۡۗۛۥ۬ۗۦۚ۬۫۟۟ۦ۟۟ۗۙ"
            r3 = r2
            goto L_0x0051
        L_0x04f2:
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r2 = r0.f1393a
            float r2 = r2.f1501l
            int r2 = (int) r2
            r3 = -1
            r9.<init>(r2, r3)
            java.lang.String r2 = "ۛۤۢۢۜ۠ۜۙۥۙ۫ۘۘ۠ۜۦۗ۬ۨۖۘ۠ۙۚۘ"
            r3 = r2
            goto L_0x0051
        L_0x0504:
            r2 = 15
            r3 = -1
            r9.addRule(r2, r3)
            java.lang.String r2 = "ۦۚۛۚۧۡۘۖۘۙۜ۟ۛۥۙ۠ۤۚۗ۠۫ۤ۟ۤۘۘ"
            r3 = r2
            goto L_0x0051
        L_0x050f:
            r0 = r51
            android.widget.ImageView r2 = r0.f1395c
            r2.setLayoutParams(r9)
            java.lang.String r2 = "ۨۙۡ۫۠ۘ۬ۡۧ۠ۤ۫ۧۚۗۨۡ۠ۥۦ"
            r3 = r2
            goto L_0x0051
        L_0x051b:
            r0 = r51
            android.widget.ImageView r2 = r0.f1395c
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r3 = r0.f1393a
            android.graphics.drawable.Drawable r3 = r3.f1490a
            r2.setImageDrawable(r3)
            java.lang.String r2 = "ۖۢۙۦۨۦۘۘ۫ۗۦۧۥۘ۟ۦ۟"
            r3 = r2
            goto L_0x0051
        L_0x052d:
            com.obwhatsapp.yo.tf r2 = new com.obwhatsapp.yo.tf
            r0 = r52
            r2.<init>(r0)
            r0 = r51
            r0.f1396d = r2
            java.lang.String r2 = "ۥۡۨۘۥۙۥۗۡۧۘۥۥۤۙۘۡۘۤ۟ۢ"
            r3 = r2
            goto L_0x0051
        L_0x053d:
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r3 = -1
            r8.<init>(r2, r3)
            java.lang.String r2 = "ۜ۠ۚۨ۟ۚۢۙۨۙۖۤ۫ۗۢۡ۫ۖۘۤۛۦۥۘۡۘۨۦۗ"
            r3 = r2
            goto L_0x0051
        L_0x0549:
            r2 = 15
            r3 = -1
            r8.addRule(r2, r3)
            java.lang.String r2 = "ۥۧۧۙۖۘۤۦۨۘۖۡ۬ۚ۫ۖۤۛۨۛۨۢۛۚۦۚۙ"
            r3 = r2
            goto L_0x0051
        L_0x0554:
            r2 = 17
            r0 = r51
            android.widget.ImageView r3 = r0.f1395c
            int r3 = r3.getId()
            r8.addRule(r2, r3)
            java.lang.String r2 = "ۗ۫ۨۖۙۦۙۧۨۘۥۧۧۧ۬۟ۥ۠ۜۖۨۘۙۛۖۘ۟ۖۜ"
            r3 = r2
            goto L_0x0051
        L_0x0566:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r2.setLayoutParams(r8)
            java.lang.String r2 = "۬ۥۚۨۙۜ۫۟ۦۚۦۨۘۜۙۨۘۛۖۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x0572:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r3 = 1
            r2.setSingleLine(r3)
            java.lang.String r2 = "ۢۦۙۡ۫ۜۘ۬ۨۡۥۤ۫ۜۥۨ"
            r3 = r2
            goto L_0x0051
        L_0x057f:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r3 = r0.f1393a
            int r3 = r3.f1493d
            r2.setTextColor(r3)
            java.lang.String r2 = "ۡۧ۟ۙۖۢۙۤۥۗۦۜۢۢۖۘ"
            r3 = r2
            goto L_0x0051
        L_0x0591:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r3 = r0.f1393a
            java.lang.String r3 = r3.f1492c
            r2.setText(r3)
            java.lang.String r2 = "ۙۗۥۘۙۢۥۘۖۗۜۘۖۘ۟ۖۗۨۜۤ۟ۚۙۡۙۘۥۧۘ"
            r3 = r2
            goto L_0x0051
        L_0x05a3:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r3 = 0
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r0 = r0.f1393a
            r49 = r0
            r0 = r49
            float r0 = r0.f1499j
            r49 = r0
            r0 = r49
            r2.setTextSize(r3, r0)
            java.lang.String r2 = "۬ۛۜۨ۟ۛۖۙۘ۫ۥۖۙۢۜۘۖۨۖۘ"
            r3 = r2
            goto L_0x0051
        L_0x05be:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r3 = 0
            r2.setVisibility(r3)
            java.lang.String r2 = "ۢۚۦۢ۫ۜۖۖۨۘۛۗ۫ۥۗۜ۬ۚۢۨۤۨۤۙۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x05cb:
            r0 = r51
            com.obwhatsapp.yo.tf r7 = r0.f1396d
            java.lang.String r2 = "ۦۢۨۘۨۖۡۜ۟۠ۘۚ۟۬ۙۚۦۜ۫"
            r3 = r2
            goto L_0x0051
        L_0x05d4:
            r0 = r51
            com.obwhatsapp.youbasha.ui.views.n r2 = r0.f1393a
            int r6 = r2.f1502m
            java.lang.String r2 = "ۨۙۨۘ۬۬ۗ۫ۢۘۘۦۥۜۘۦ۟ۚ"
            r3 = r2
            goto L_0x0051
        L_0x05df:
            r2 = 0
            r3 = 0
            r7.setPadding(r6, r2, r6, r3)
            java.lang.String r2 = "ۨۤ۫ۖۡۢۗۘۧۦۧۤۦ۠ۡۘ۬۟ۖۘ۟ۖۡۡ۠ۛ"
            r3 = r2
            goto L_0x0051
        L_0x05e9:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r3 = 0
            r49 = 0
            r0 = r49
            r2.measure(r3, r0)
            java.lang.String r2 = "ۧۖۤۜۚ۟۟ۚۙۙۖۖۧۢۨۘ۠ۦۖۗۛۧۦۛۧ"
            r3 = r2
            goto L_0x0051
        L_0x05fa:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            int r2 = r2.getMeasuredWidth()
            float r5 = (float) r2
            java.lang.String r2 = "ۡۗ۫ۚۚۢۘۨۘ۟ۦۧۥ۟ۙۤۢۖۡۘۧۘۡ۟ۛ"
            r3 = r2
            goto L_0x0051
        L_0x0608:
            r0 = r51
            r0.f1400h = r5
            java.lang.String r2 = "۫۟ۢۗۗۚۜۘۛۗۧ۠ۧۗ۫ۚۚۨ۠۫ۦۘۖۜۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x0611:
            r0 = r51
            float r4 = r0.f1399g
            java.lang.String r2 = "۠۫ۛ۫ۖۙۦ۫ۚۨۚۨۨ۬ۢۥ۬ۘۨۡ۠ۖۢۘۥۡۢ"
            r3 = r2
            goto L_0x0051
        L_0x061a:
            r3 = -741557953(0xffffffffd3ccb93f, float:-1.75856248E12)
            java.lang.String r2 = "۬ۡۖۘۜۛۥۛۘۧۘۙ۠ۖۘۘ۫ۧۙۨۘۘ۟ۜۖۚۤ۟"
        L_0x061f:
            int r49 = r2.hashCode()
            r49 = r49 ^ r3
            switch(r49) {
                case -1702799343: goto L_0x06f1;
                case 866876571: goto L_0x0636;
                case 897475718: goto L_0x0629;
                case 1111081515: goto L_0x0633;
                default: goto L_0x0628;
            }
        L_0x0628:
            goto L_0x061f
        L_0x0629:
            int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0630
            java.lang.String r2 = "ۡ۬ۖۜۙ۟ۡۡۧۨۥۜۘۤ۠ۚۗۧۖۡۡۥ"
            goto L_0x061f
        L_0x0630:
            java.lang.String r2 = "ۛۗۘۘۖۘۦۘۦ۟ۖۘۢۛۛ۠ۢۤۨ۫ۘۘ"
            goto L_0x061f
        L_0x0633:
            java.lang.String r2 = "ۜ۬ۚۤۢۗۘۜ۠ۘۨۤۤۤۙۘۥۘۛۤ۟ۛۢ"
            goto L_0x061f
        L_0x0636:
            java.lang.String r2 = "ۛۙۖۘۤ۫ۡۦۛۖ۬ۛۘۧۦۧۘۦ۠ۛ"
            r3 = r2
            goto L_0x0051
        L_0x063b:
            r0 = r51
            r0.f1400h = r4
            java.lang.String r2 = "ۘۧۥۥۥۘۘ۟۫ۡۢۧۡۗۥۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x0644:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r3 = 8
            r2.setVisibility(r3)
            java.lang.String r2 = "ۖ۫ۘۤۡۦۘۥۗۜۘۗۛۜۙۥۦۙۨ۫۬۠ۦ۫ۤۤ"
            r3 = r2
            goto L_0x0051
        L_0x0652:
            r0 = r51
            android.widget.ImageView r2 = r0.f1395c
            r0 = r51
            r0.addView(r2)
            java.lang.String r2 = "ۢۨۧۧۜۘۗۧۚۧۤۨۘۨۖۖۘ۟ۛ"
            r3 = r2
            goto L_0x0051
        L_0x0660:
            r0 = r51
            com.obwhatsapp.yo.tf r2 = r0.f1396d
            r0 = r51
            r0.addView(r2)
            java.lang.String r2 = "ۡ۬۬ۦ۠ۥۤ۟ۜ۠ۜۘۦۧۦۘۘ۟ۙۚ۟۫"
            r3 = r2
            goto L_0x0051
        L_0x066e:
            r51.b(r52)
            java.lang.String r2 = "ۢۖۧۘۛۙۖ۫ۧۧۙۖۦۘۛۚۘۘ۫ۙۥۘ"
            r3 = r2
            goto L_0x0051
        L_0x0676:
            r0 = r51
            boolean r2 = r0.f1394b
            r0 = r51
            r0.setInitialState(r2)
            java.lang.String r2 = "ۢۜۗۜۧ۠ۛۤۦۘۛۚۨۡ۬۬ۚۥۦۤ۟۫ۖ۟ۙ"
            r3 = r2
            goto L_0x0051
        L_0x0684:
            r0 = r51
            boolean r2 = r0.f1394b
            r0 = r51
            r0.setInitialState(r2)
            java.lang.String r2 = "۟ۖۧۘ۟ۤ۟ۜۖۘۘۚ۠ۡۘۖۛۦۘۖ۫ۦۘۥۛ"
            r3 = r2
            goto L_0x0051
        L_0x0692:
            java.lang.String r2 = "۫ۚ۬۠ۡۤۖۘۤ۠ۤۘ۬ۦۘۦۚۘۘۗۜ۫ۥۛۤۢۗۦ"
            r3 = r2
            goto L_0x0051
        L_0x0697:
            java.lang.String r2 = "ۨۥۚۥ۫ۢ۬ۡۜۡ۬ۡۖۦۡۘۧۤۨۡۛۚۗۖۖۘ"
            r3 = r2
            goto L_0x0051
        L_0x069c:
            java.lang.String r2 = "ۖۖۦ۫۫۫۫ۖۚۜۗۨ۠ۤۤ۫۠ۘۡۘۦۘۢۛۨۘ۠ۤۚ"
            r3 = r2
            goto L_0x0051
        L_0x06a1:
            java.lang.String r2 = "۠ۗۧ۬ۚۗۤۥ۟ۜ۫ۗۛۡۦۢۗۖۘۜۘ"
            r3 = r2
            goto L_0x0051
        L_0x06a6:
            java.lang.String r2 = "ۨۦۦۗ۬ۛۧۚۡۘۤۧۚ۫ۥۤۧۖۨۘۢۙ۫ۚۤ۠ۙۡ"
            r3 = r2
            goto L_0x0051
        L_0x06ab:
            java.lang.String r2 = "ۜۧۘۘۤۨۨۘ۬ۖ۬۬۟ۦۘۚۢۨۜۜ۬ۖۙۛ۟۟"
            r3 = r2
            goto L_0x0051
        L_0x06b0:
            java.lang.String r2 = "ۦ۬ۜۤۨۘۜۗۥۘ۟۟ۡ۬۟ۢۚۘۗۦۤۛۗۧ"
            r3 = r2
            goto L_0x0051
        L_0x06b5:
            java.lang.String r2 = "ۜۙۙۛۘۧۙۤۡۘۜ۟ۜۗۘۚ۫۫ۘ"
            r3 = r2
            goto L_0x0051
        L_0x06ba:
            java.lang.String r2 = "ۤۙۧۚۥۛۢ۬۠ۖۙۦۢ۟ۢ"
            r3 = r2
            goto L_0x0051
        L_0x06bf:
            java.lang.String r2 = "ۧۙ۫ۙۛ۟ۡۗۢۙۚ۫ۚ۠ۨ"
            r3 = r2
            goto L_0x0051
        L_0x06c4:
            java.lang.String r2 = "ۘۢۖۘۖۖۥۘۖ۫ۡۘ۫۠۫ۨ۬ۢۤۘۛ"
            r3 = r2
            goto L_0x0051
        L_0x06c9:
            java.lang.String r2 = "ۢ۬ۥۘۘۚۥ۬ۘۤۨۨ۠ۡۙۘۘ۠ۢ۠۫ۙۥۦۖ۠ۧ۠۫"
            r3 = r2
            goto L_0x0051
        L_0x06ce:
            java.lang.String r2 = "ۤۨ۟ۛ۫ۘ۠ۜۡۤۧۦۜۜۖۘۖۢۧۙۜۜۜۚ۫"
            r3 = r2
            goto L_0x0051
        L_0x06d3:
            java.lang.String r2 = "۟ۛۖۘۙۚۨۚ۟۟ۗۧۥۘۡ۫ۤۨۖۖۡۚۨۘۡۖۦ"
            r3 = r2
            goto L_0x0051
        L_0x06d8:
            java.lang.String r2 = "ۤۨ۫ۜ۟ۙ۟ۢۥۗۜۥۛۤۜۚ۟ۜۘ"
            r3 = r2
            goto L_0x0051
        L_0x06dd:
            java.lang.String r2 = "۠ۡۜ۠۟۠ۨۘۗۗ۬ۜۘۛ۬ۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x06e2:
            java.lang.String r2 = "ۛۡۧۦۙۙۜۚۧۡ۬ۦۘۗۥۡۘۤۨۚۦۜۖۘ"
            r3 = r2
            goto L_0x0051
        L_0x06e7:
            java.lang.String r2 = "ۧۡ۬ۨۡۚ۬ۤۥۘۦۛۥۗۧۘۤۙۙ"
            r3 = r2
            goto L_0x0051
        L_0x06ec:
            java.lang.String r2 = "ۥۜۡۘۚۚۡۘۚۚۤۧۡۘۨۛۧۤ۫ۦۘۗۡۧۘ۫۠ۨ"
            r3 = r2
            goto L_0x0051
        L_0x06f1:
            java.lang.String r2 = "ۘۧۥۥۥۘۘ۟۫ۡۢۧۡۗۥۡۘ"
            r3 = r2
            goto L_0x0051
        L_0x06f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView.a(android.content.Context):void");
    }

    public void activate() {
        String str = "ۙۛۙۨۖۥۘۖۦۨۚۢ۠ۙ۫ۤ۟۬";
        int i2 = 0;
        n nVar = null;
        TransitionDrawable transitionDrawable = null;
        ValueAnimator valueAnimator = null;
        while (true) {
            switch ((str.hashCode() ^ 923) ^ -169299651) {
                case -2043267500:
                    str = "ۦۚۜۘ۠۫۫ۢۨ۠ۢۥ۠ۗۦۗۦ۠ۨۘۢۤۖۘۘۘۘۢۧۗ";
                    valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    break;
                case -1999937096:
                    valueAnimator.start();
                    str = "۬ۢۥۚ۠ۘۨۨ۬۫ۥ۬ۦۦۡۘۢ۠ۥۘۨۦۘ";
                    break;
                case -1983292464:
                    setBackground(this.f1393a.f1491b);
                    str = "۬۠۟ۙۛۘۘۗۦۗ۠ۦۘ۬ۚۢ۫ۘۨ۠ۦۘ";
                    break;
                case -1890088951:
                    str = "ۗۚۤۙۙۨۦۧۚۙ۬ۧۦۗ۠ۙۛۛ";
                    transitionDrawable = (TransitionDrawable) getBackground();
                    break;
                case -1842499954:
                    valueAnimator.addUpdateListener(new o(this, 1));
                    str = "ۦۢۧۧۘۦ۠ۙۡۘۨ۬ۛۡۢۢۜۚۜۙۢۡ";
                    break;
                case -1746352157:
                    utils.updateDrawableColor(this.f1395c.getDrawable(), this.f1393a.f1493d);
                    str = "ۚۜۖۛۤۚۗۜۘۢ۬ۘۘۛۘ۟ۚ۟ۚۢۙ۠ۤۘۤ";
                    break;
                case -1558036204:
                    transitionDrawable.startTransition(this.f1398f);
                    str = "ۨ۠ۦۘۡۤۦۘۚۤۜۘۡۛۖۙۖۧۘۢۡۤۚۗۥۘۡ۬ۖۘۙۦۖۘ";
                    break;
                case -1327483199:
                    str = "ۖۙۙۖۙۜۗۗۤ۬ۘۦۡۡۦۘۜۖۘۘ";
                    break;
                case -1163454510:
                    return;
                case -485448241:
                    String str2 = "۟ۘۘۚۡ۟ۤ۫ۦۢۨۘۘۢۨۢۚۚۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 963008476) {
                            case -686724566:
                                str2 = "۬ۦۥ۠ۡۧۘۨۜ۬۫ۖۘۘۡۙ۫۫۬ۘ۠ۧۧۖۗۘ";
                                break;
                            case 931647709:
                                str = "ۖۨۜۘۗۖۢۢۖۜۘۗۨۥۘۚۚۙۨۛۦۨۢ۬";
                                continue;
                            case 1570606832:
                                if (!(getBackground() instanceof TransitionDrawable)) {
                                    str2 = "ۦۜۤۧۘۢۙ۠ۜۘۛۜ۬ۨۨۥۘۡ۬ۤۡۥ۬ۗۖۡۘۡۦۜۘ";
                                    break;
                                } else {
                                    str2 = "ۘ۬ۡ۟ۙ۫۟ۦۦۘۗۖۜۖۡ۫ۗ۟ۨۘۛۙ۬ۡ۠ۥۦۜۜ";
                                    break;
                                }
                            case 2009817314:
                                str = "ۧۨۘۘ۟ۙۥۘۦۨ۟ۜ۠ۧۚۡ۫ۚۛۖۖۘۖۙۜۘۦ۟ۜ";
                                continue;
                        }
                    }
                    break;
                case -311107974:
                    i2 = nVar.f1495f;
                    str = "ۛۖۤ۫ۗۛۤۧۙۖۙ۟ۙۙۜۘ۠ۦۚ۬ۨۨۘ۟ۙۨۖۢ";
                    break;
                case -53188453:
                    valueAnimator.setDuration((long) this.f1398f);
                    str = "ۚ۟ۨ۠ۦۜۘۨۙۚۗۥۗ۠ۧۤۙۙۡۘۗ۬ۙۧۨۦۘ";
                    break;
                case 63372105:
                    this.f1396d.setVisibility(0);
                    str = "ۨۖۢۢ۟۠ۛۤۗۘۦۗۙۖۜۤۜۡۘۜۨۜۙ۬ۨۘۚۤ۫";
                    break;
                case 378113386:
                    str = "۬۠۟ۙۛۘۘۗۦۗ۠ۦۘ۬ۚۢ۫ۘۨ۠ۦۘ";
                    break;
                case 456377572:
                    String str3 = "ۤۚۗ۠ۜۨۚۧ۫ۦۚۖۘۚۛۧۛۚۥۘ۠ۤۜ۫ۖ۠";
                    while (true) {
                        switch (str3.hashCode() ^ 1198387466) {
                            case -1241000922:
                                str = "۬۠ۚۦۡ۬۫ۚۖۤۨۛۤ۫ۦۨۘۧۘۜۚۥۘ";
                                continue;
                            case -1121310416:
                                str = "ۤ۠ۖۧۙ۟ۜۤۖ۠ۙ۟ۛۚۦۗۢۚۧۚۜ";
                                continue;
                            case -1082831738:
                                if (i2 == Integer.MIN_VALUE) {
                                    str3 = "۟ۨۚ۬۟ۦۥۨۙۢۢۡۧ۟ۚۤ۟۬ۤ۫۫۫۫۟۬ۡۘ";
                                    break;
                                } else {
                                    str3 = "ۡ۟ۦۘۖۖۜ۠ۜۤۛ۟ۙۙۙۘۘۥ۠ۛ۫ۘۧ۠ۥۘ";
                                    break;
                                }
                            case 491902154:
                                str3 = "ۖۙۘۘۗ۬ۦۘۜۗ۬ۢۧ۬۠ۘۙۛۦۗۦۖۘۘ۬ۘۥۘ";
                                break;
                        }
                    }
                    break;
                case 541160746:
                    transitionDrawable.setColorFilter(others.pagerIndicator(), PorterDuff.Mode.SRC_ATOP);
                    str = "ۡ۟ۥۡۥۤۚۥۦ۫ۤ۟ۤۢۛۛۢ۟۫ۘۥۨۥۗۛ۬";
                    break;
                case 734363131:
                    nVar = this.f1393a;
                    str = "۫ۥۧۥۛۢۤۖۖۘۨۙۥۘ۫ۛۖ۟ۖۨۘۥۧۘۘ۟ۨۚۚۤ۟";
                    break;
                case 1227515388:
                    this.f1394b = true;
                    str = "ۘۨۧۘۚ۟ۨۘۢۚۡۘۖۘۖۘۛۥۤۢۖۛ۫ۨ۫ۖۦۢۛ۫ۙ";
                    break;
                case 1642464496:
                    utils.updateDrawableColor(nVar.f1491b, i2);
                    str = "۬۠ۚۦۡ۬۫ۚۖۤۨۛۤ۫ۦۨۘۧۘۜۚۥۘ";
                    break;
            }
        }
    }

    public final void b(Context context) {
        String str = "ۤۧۡۘۢۡۨۗۦ۠ۜۛۦۜۜۢ۬ۦۥۘ";
        TextView textView = null;
        int i2 = 0;
        Drawable drawable = null;
        RelativeLayout.LayoutParams layoutParams = null;
        int i3 = 0;
        TextView textView2 = null;
        while (true) {
            switch ((str.hashCode() ^ 618) ^ -387959288) {
                case -2103197577:
                    utils.updateDrawableColor(drawable, this.f1393a.f1498i);
                    str = "ۨ۠ۘۘۡۜۥۘ۫ۜۘۘۛۨۡۙۤۗۜۦۦۦۖۡ";
                    break;
                case -2075715738:
                    str = "ۖ۬ۥۙۥۖۧۢۛۥۙۨۘ۫ۜ۬ۘۘۘۘۛۗۥۘۜۜۥۘ۫ۢۛ";
                    layoutParams = new RelativeLayout.LayoutParams(i3, i3);
                    break;
                case -1713784093:
                    this.f1397e.setGravity(17);
                    str = "۠ۛۙ۬ۢ۬ۚۖۨۚۦ۟ۜۧۡۘۖۗۥۘ";
                    break;
                case -1681882398:
                    textView.setWidth(textView.getMeasuredHeight());
                    str = "ۜۦ۫ۨۡۥۘۛۡۗۛۧ۫ۥۘ۫ۥ۟۟۬۫";
                    break;
                case -1629517435:
                    addView(this.f1397e);
                    str = "ۚۢۦۨۥۨۘۥۘۡۨۘ۠ۙ۠۠ۤۥ۬ۡۦۜ۬۟ۨ";
                    break;
                case -1466897740:
                    textView = this.f1397e;
                    str = "ۢۤۗ۟۫ۜۥ۠ۛۙۗۤ۟ۚۖ۠۬ۦ";
                    break;
                case -1248197129:
                    str = "ۜۧ۬ۛۗۡۘۢ۠ۘۘ۫ۛۗۥۧۖۚۛ۫ۦۤۜۥۙ۠ۢۙۥ";
                    drawable = AnonymousClass00T.A04(context, yo.getID("new_messages_indicator", "drawable"));
                    break;
                case -1026621850:
                    this.f1397e.setBackground(drawable);
                    str = "ۖۚۥۨۧۚ۫ۥ۟ۚ۫ۘۘ۟ۖۘۡۥۜۘ";
                    break;
                case -1020922997:
                    removeView(textView2);
                    str = "ۘ۠ۤۧۥۜۘۜۚۘۘ۬ۨۨۘۦۨۡۘۤۦۘۘۘ۠ۘ";
                    break;
                case -1019642302:
                    this.f1397e = new TextView(context);
                    str = "۫ۘۙۦۢۧ۟ۦۡ۫ۥ۫ۚ۠ۘۘۗۦۜ";
                    break;
                case -968487095:
                    str = "ۙۦۡۘۛۜۘ۫ۖ۬۬ۥۨ۟ۧ۟ۙۖ۟ۚۧۛۡۤۦ";
                    break;
                case -682127501:
                    layoutParams.addRule(19, this.f1395c.getId());
                    str = "ۤۛۡ۫۟ۖۘۗۨۖ۠ۥۛۜۙۦۘۛۛۖۘۗ۠ۘۧۢۦۘ";
                    break;
                case -606671969:
                case -175164244:
                    return;
                case -560134872:
                    str = "ۙ۠۬ۜۖۤ۬ۙۦۘۛۜۡۦۖۘۥۨۜۘ";
                    break;
                case 118744061:
                    this.f1397e.setTextSize(0, this.f1393a.f1500k);
                    str = "ۘۜۖۘۖۧۨۨۢۥۘ۬۫ۤۨۦۥ۬ۢۜۙۨ۟۫";
                    break;
                case 324913815:
                    String str2 = "ۘۦۙۧۤۛ۟ۧۛ۬ۗۛۗ۫ۢۘۘۤۙۜ۠";
                    while (true) {
                        switch (str2.hashCode() ^ 1446529548) {
                            case -659386318:
                                str = "ۖ۠ۖۘۛۡۜۘۚۤۥۢ۟ۘۘۙۡۜۘ";
                                continue;
                            case -13884726:
                                str2 = "۟۬ۤۥۤۡۗۛۛۨۚ۟ۢۦ۬ۨۜۘۦ۠ۡۙۢۛۤۨۦۘ";
                                break;
                            case 310317499:
                                if (this.f1393a.f1496g != null) {
                                    str2 = "۬ۧۢۥۖۥۤۜۚۢۧ۟۠ۤۦۘ";
                                    break;
                                } else {
                                    str2 = "۫ۥۖۘۤۛۦۨۢۢۛۘۘ۟ۗۗۡ۫ۗۢ۟ۜۘۚۜۡۘ";
                                    break;
                                }
                            case 1146096215:
                                str = "ۚ۟ۧۘ۠۬ۦۘ۬ۤ۠۟۠۠ۖۨۨ۫";
                                continue;
                        }
                    }
                    break;
                case 475320148:
                    this.f1397e.setSingleLine(true);
                    str = "۟ۨۢۨۢۗۢۛۤ۟ۚۡۦۡۘۧۜۘۘۡۘۖۘۧۜۥۘۚۨۛ";
                    break;
                case 536684873:
                    this.f1397e.setText(this.f1393a.f1496g);
                    str = "ۥۘۙۨۢۤۥ۠ۨۜۤ۫ۧۥۥۨۛۚۗۥۢۙ";
                    break;
                case 676455022:
                    String str3 = "ۘۦۤۙۜۥۘ۠ۨۧۢۖ۫۫ۜۡ۠ۚۘۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1741195523) {
                            case -1268284765:
                                str = "ۜۦ۫ۨۡۥۘۛۡۗۛۧ۫ۥۘ۫ۥ۟۟۬۫";
                                continue;
                            case 532606344:
                                str = "۠ۛۨۢۢۗۙۗۡ۠ۛۜۘۢۡ۬ۖۧۤ";
                                continue;
                            case 614103160:
                                str3 = "ۗۘۥ۟ۨۤۛۡۥۘ۬ۢ۠ۧۧۛۤۙ۫";
                                break;
                            case 1023725787:
                                if (this.f1397e.getMeasuredWidth() >= this.f1397e.getMeasuredHeight()) {
                                    str3 = "۟ۡ۟ۛۛ۬ۦۥۘۙۖ۫۟ۦۥ۬ۨ۠ۥۡ۠ۖۖۘ";
                                    break;
                                } else {
                                    str3 = "ۨۦۨۦۜۗ۟ۗۙ۬ۘۘ۬۟ۧ۬۠ۥۘۜ۫ۗۡۙ۬";
                                    break;
                                }
                        }
                    }
                    break;
                case 692164018:
                    layoutParams.addRule(6, this.f1395c.getId());
                    str = "ۖۢۜۛ۫ۧۨۤ۫ۦۡۖۘۧۗۦ";
                    break;
                case 731541757:
                    this.f1397e.measure(0, 0);
                    str = "ۤۚۘۘۨۙۗۗ۟ۧۤۖۛ۠ۡۦۘۢۡ";
                    break;
                case 1189296981:
                    String str4 = "ۖۛ۟ۖۖۜۘ۬ۧۜۡۘۦۘۥۗۗۦۖۘۗ۠ۜۘ";
                    while (true) {
                        switch (str4.hashCode() ^ 482337967) {
                            case -1591180221:
                                str4 = "ۜۧۗ۬ۤ۫ۧ۠ۜۘ۬۠ۨۨۖۘۘۚۚۘۘۙ۟ۘۘۗ۬۠ۤۜۘۘ";
                                break;
                            case -834071789:
                                if (textView2 == null) {
                                    str4 = "ۤۢ۬ۥۥۥۧ۟ۥۘ۬ۨۜۘ۫۟ۜۖۛۢۥ۫ۛ";
                                    break;
                                } else {
                                    str4 = "ۘ۟ۗۢۢۜۘۡ۟ۜۨ۟ۥۘ۬۟ۛ";
                                    break;
                                }
                            case 877473976:
                                str = "ۥۤۢۛۧۢۘ۠ۢۜۦۡۦۗۘۘۖۙۡۘۛۨۥۖۦۡۗ۬";
                                continue;
                            case 973351561:
                                str = "ۘ۠ۤۧۥۜۘۜۚۘۘ۬ۨۨۘۦۨۡۘۤۦۘۘۘ۠ۘ";
                                continue;
                        }
                    }
                    break;
                case 1220203143:
                    str = "ۙ۠ۦۘۦۚۧۤۜۘۗۜۘۜۥ۬";
                    i2 = utils.dimenInDP(2);
                    break;
                case 1758342328:
                    this.f1397e.setLayoutParams(layoutParams);
                    str = "ۗۢۖۘۗ۫ۗۖۢ۟ۗۧ۟ۛۤۧۚۧۥۗۢۛۚ";
                    break;
                case 1762896340:
                    this.f1397e.setPadding(i2, 0, i2, 0);
                    str = "ۜۦۗۛۜۚ۫ۙۥ۬ۙۦۘۘ۫ۜ";
                    break;
                case 1778082331:
                    this.f1397e.setTextColor(this.f1393a.f1497h);
                    str = "ۥۘ۫ۖۙۦۘۜۛۖۤ۬ۨ۬ۡ۟ۖ۬۠ۡ";
                    break;
                case 1803104371:
                    str = "ۡۜۦ۠۟ۜ۟ۜۘۤ۠ۥۘۛۡۥۘ۫ۨۤۧۘۖۢۥۖ";
                    i3 = utils.dimenInDP(8);
                    break;
                case 1817713187:
                    str = "۬ۜۦۜۘ۬ۛۧۙۙۙۗ۬ۜۨۘۤۡۘ";
                    textView2 = this.f1397e;
                    break;
            }
        }
    }

    public void deactivate() {
        String str = "۫ۦۥۘۗۜۖۘۦ۬ۡۗۖۙۛۙۙ۟۠ۛۛۥ۬ۙۚ";
        ValueAnimator valueAnimator = null;
        while (true) {
            switch ((str.hashCode() ^ 799) ^ -45321155) {
                case -1775379339:
                    utils.updateDrawableColor(this.f1395c.getDrawable(), this.f1393a.f1494e);
                    str = "ۨۜۘۘۦۤۡۛۗۦۘۡۜۗ۬۬۟ۡۖۢ۟ۨۗ۬ۦ۟ۗۗ";
                    break;
                case -883077050:
                    this.f1394b = false;
                    str = "ۗ۠ۗۦۨۧ۟ۙۧۜ۠ۙۥۜۜۘۙۗۖۥۛۖۘۡ۬ۨ";
                    break;
                case -819723712:
                    valueAnimator.addUpdateListener(new o(this, 0));
                    str = "۫۬ۧۥ۬ۡۘۡ۠ۡۘۥۛۤۤۚۖۘ";
                    break;
                case -727828607:
                    setBackground((Drawable) null);
                    str = "۟ۦۙۥ۫ۘ۫ۡۢ۬ۙۜۘۡۨۘۘۢۘۡۘ";
                    break;
                case -653419477:
                    String str2 = "۬ۡۛ۬ۤ۟۬ۧۜۘۢۘۨۘۧۡۡۘۘۗۚۧ۠ۛ";
                    while (true) {
                        switch (str2.hashCode() ^ -450915208) {
                            case -1131153287:
                                str = "ۧ۟ۨۚۤۘۦۜۨ۠ۡۡۘۛ۫ۜ";
                                continue;
                            case 763524046:
                                if (!(getBackground() instanceof TransitionDrawable)) {
                                    str2 = "۬ۢۗۙ۬ۦۘ۠ۦۘۘۨۡۧۜ۠ۥ";
                                    break;
                                } else {
                                    str2 = "۠۫ۖۦۥۘۧ۠ۥۘۡۡ۬ۨ۬ۗ";
                                    break;
                                }
                            case 1232497369:
                                str2 = "ۛۗۥۧ۬ۖۗۖۗ۬ۨۧ۬۠ۨۙۡۙۖۥۨ";
                                break;
                            case 1924426791:
                                str = "ۜۜۦۘۙۥۖۘ۟ۖۧۛۚۥۡۜۦۘ";
                                continue;
                        }
                    }
                    break;
                case 160515819:
                    return;
                case 370774013:
                    valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    str = "ۡۦۢۥ۠ۜۘ۫ۚۨۜۤۙۛ۬ۦ۠۫ۘۘۤۘ۫ۛ۟ۡۘ۬ۥ۬";
                    break;
                case 454905474:
                    ((TransitionDrawable) getBackground()).reverseTransition(this.f1398f);
                    str = "ۚ۠ۜ۟ۚۜۘۦۤۘۘۜ۠۠ۤۡۜۡۨۦۤۥۘۚۤۤ";
                    break;
                case 846559566:
                    valueAnimator.start();
                    str = "ۥۥۦۘۦۖۨۘۡۙۛۧۗۤۨۘۡ۫ۢ۠ۨۤ۠";
                    break;
                case 1614462834:
                    str = "ۧۘۖۘۡۥۜۘۤۖۖۘۡۜۧۦۜۜۘ";
                    break;
                case 1960904183:
                    valueAnimator.setDuration((long) this.f1398f);
                    str = "ۜۤۖ۟ۖۛ۫ۢۡۘۨۢۛۥۦ۠ۛۙ۬۫ۖۘ۟ۛ۟";
                    break;
                case 2080494646:
                    str = "۟ۦۙۥ۫ۘ۫ۡۢ۬ۙۜۘۡۨۘۘۢۘۡۘ";
                    break;
            }
        }
    }

    public int getCurrentStateColor() {
        String str = "ۢۙۦۘ۠ۡۖۤۖ۟۬۬ۧ۬ۦۖۚۨ۠ۥۤۜ";
        while (true) {
            switch ((str.hashCode() ^ 901) ^ 961025964) {
                case -1975326120:
                    return this.f1393a.f1493d;
                case -1706042913:
                    String str2 = "ۖۙۢۛ۫ۢۨ۬ۢۜۧۘۥۖۥۤۙۥ۟ۦۧۘۖۨ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 164441255) {
                            case -1752938931:
                                str2 = "ۗ۟ۛ۬ۡۗۢۧۚۗۢۤ۬ۧۘۘۜۦۖۘۜۥۖۘۧۥ۬ۛ۟ۖ";
                                break;
                            case 49395888:
                                if (!this.f1394b) {
                                    str2 = "ۤۧۛۛۡۡ۟ۢۖۤۢۦۘ۫ۗۖۚۙۚ";
                                    break;
                                } else {
                                    str2 = "ۧۥۘۘۨۜۜۘۛ۫ۤ۟ۧۨۙۛۧۢۡ";
                                    break;
                                }
                            case 1817891702:
                                str = "ۘۧۡۘ۫ۦ۠ۚۧۤ۫ۗۡۘۗۥۥۘۤۚۤۚۡۡۙۗ۟";
                                continue;
                            case 2083816462:
                                str = "۫ۜۡۘۗۖۧ۫ۨۘۘ۫ۥۧۜۛۘۘۘۢۥۧۡۚۘۦۜۚۖۧ";
                                continue;
                        }
                    }
                    break;
                case -1446983472:
                    return this.f1393a.f1494e;
                case 1176310280:
                    str = "ۚۨۗ۬ۛۖۘۢۚۡۘۢ۫ۙۧ۬ۗۤۥۢ";
                    break;
            }
        }
    }

    public boolean isActive() {
        String str = "ۤۤۦۧ۟ۖۧۨۨۘۨۥۘ۬ۤ۠ۜۖۘ۫ۜ۠ۡۤۡۘۗۘۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 624) ^ 1309010603) {
                case -1818660116:
                    return this.f1394b;
                case -430709051:
                    str = "ۙۗۦۘۥۦۡۘۨ۫۫۫۬ۜۘ۟ۦۧ۬۬ۙۦۧۡۖۦۡۘ۬ۜۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setBadgeText(java.lang.String r9) {
        /*
            r8 = this;
            r2 = 0
            java.lang.String r0 = "ۙۦۖۘۙۙۥ۟۟ۥۨۧۘۨۘۖۧۡۗ۫ۜۤ"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0006:
            int r5 = r0.hashCode()
            r6 = 627(0x273, float:8.79E-43)
            r7 = 119011802(0x717f9da, float:1.1433402E-34)
            r5 = r5 ^ r6
            r5 = r5 ^ r7
            switch(r5) {
                case -1565389933: goto L_0x0062;
                case -1494239256: goto L_0x0077;
                case -1024462181: goto L_0x0015;
                case -425695412: goto L_0x001b;
                case -361089975: goto L_0x0040;
                case -163731589: goto L_0x0072;
                case -9366804: goto L_0x0020;
                case 19758038: goto L_0x0065;
                case 201153522: goto L_0x006e;
                case 305337192: goto L_0x0069;
                case 821433116: goto L_0x0024;
                case 888046603: goto L_0x0018;
                case 1775427755: goto L_0x0084;
                case 1841759208: goto L_0x0087;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۘ۬ۦۘۢۘۤۗۦۘ۠ۙۨ۟ۨۜۘۚۙۨۘ"
            goto L_0x0006
        L_0x0018:
            java.lang.String r0 = "ۤۙۥۦ۫ۚۨ۠ۡۘۧ۟ۥۘ۟ۢۧ۬ۦۧۘۨ۫ۘۥۥ"
            goto L_0x0006
        L_0x001b:
            com.obwhatsapp.youbasha.ui.views.n r4 = r8.f1393a
            java.lang.String r0 = "ۖۖۖۥۧۨۖۗۙۚۨۛ۬ۢ۠"
            goto L_0x0006
        L_0x0020:
            java.lang.String r0 = "ۧۚ۬۠ۚۧۘۦۨۘۨۜۤۜ۠ۖۧۥۚۚۗۨۘ"
            r3 = r9
            goto L_0x0006
        L_0x0024:
            r5 = -1768945847(0xffffffff96900749, float:-2.3269052E-25)
            java.lang.String r0 = "ۙۧۡۙۢۨۘۗۛۨۡۨۘ۫ۘۧۘ"
        L_0x0029:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -502039064: goto L_0x0032;
                case 47549777: goto L_0x0084;
                case 261373137: goto L_0x003d;
                case 830017790: goto L_0x0038;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0029
        L_0x0032:
            java.lang.String r0 = "ۜۡ۬ۘۢۖ۟۟ۖۚۦۜۘۛۢۦۜۖۧ۠۫ۙۥۖۘ"
            goto L_0x0006
        L_0x0035:
            java.lang.String r0 = "۬ۦۡۘۜۧۨ۠ۧۘۘۚۛ۟۟۬ۦۘۥۘۤۖۙۢ"
            goto L_0x0029
        L_0x0038:
            if (r9 == 0) goto L_0x0035
            java.lang.String r0 = "ۦۛۚۦۜۖۥۗۜۖۤۚۢۤۜۨۡۥۘۘۨۥۛۡۘ۬ۦۘ"
            goto L_0x0029
        L_0x003d:
            java.lang.String r0 = "ۡۦ۠ۥۡ۫ۥۧۢ۫ۜۧۘۨۧ۠ۦۤۦۜۤۥۘ۫ۛۡ"
            goto L_0x0029
        L_0x0040:
            r5 = -1114138812(0xffffffffbd979744, float:-0.074018985)
            java.lang.String r0 = "ۚۧۨۖۖۧۘ۟ۘ۬ۘۜۘۘۤۧۘۢۖۘ"
        L_0x0045:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -806078073: goto L_0x0081;
                case -306848522: goto L_0x004e;
                case 167656223: goto L_0x005f;
                case 418329022: goto L_0x0054;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0045
        L_0x004e:
            java.lang.String r0 = "۫۟ۖۘۥۗ۠ۧۛۡۘۜۘۡۡۘۧۙ۫ۚۙ۬ۥۛ۟ۘۧۨۘ"
            goto L_0x0045
        L_0x0051:
            java.lang.String r0 = "۠ۥۗۡۜۦۘ۫ۤۢۨ۬۠۟ۜ۬ۤۛ۟ۛۜۡۘ"
            goto L_0x0045
        L_0x0054:
            java.lang.String r0 = "0"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "ۗۜۜۘ۬۟ۦۘۗۘۤۦۗۦۖۧ۬ۡۦۦۘ۬"
            goto L_0x0045
        L_0x005f:
            java.lang.String r0 = "ۜۛۖۘۗۥۛ۫ۧۥۘۦ۫ۖۘ۟ۚۧۨۢۜۚ۠ۜۘ"
            goto L_0x0006
        L_0x0062:
            java.lang.String r0 = "۬ۨۥۘ۫ۧۘۢۧۥۘۨۤۖۘ۬۬ۦۘۘۛۗ"
            goto L_0x0006
        L_0x0065:
            java.lang.String r0 = "۟ۘۧۢۛۡۘۜۢ۫ۛۚۖۦۨۨۖ۬۠ۦۚۧ۫ۙۖۡۚ"
            r3 = r2
            goto L_0x0006
        L_0x0069:
            java.lang.String r1 = ""
            java.lang.String r0 = "ۗۧۨۡۖۗۗۖۖ۬ۗۖۘۨۥۙۦۡ۬ۖۢۙۡۤۜ"
            goto L_0x0006
        L_0x006e:
            java.lang.String r0 = "ۤۧۖۘ۟ۙۥۚۚ۫ۜۖۚۚ۟۬ۨۜۛۗۥ۫ۦۛۚۙۜۘ"
            r3 = r1
            goto L_0x0006
        L_0x0072:
            r4.f1496g = r3
            java.lang.String r0 = "ۧۚۙۘۜۜۘ۠ۤۡ۫ۦۦۦۥۤۙۤۡۘ۟ۘۨۘۙۧ۫"
            goto L_0x0006
        L_0x0077:
            android.content.Context r0 = r8.getContext()
            r8.b(r0)
            java.lang.String r0 = "۠ۤ۠ۦۨ۬ۨ۟ۢۖۨ۫ۨۜۖۖۖۧ"
            goto L_0x0006
        L_0x0081:
            java.lang.String r0 = "ۛ۠ۨۘۜ۬ۗۧ۠ۛۤۥۘۘ۟ۙ۫۫ۗۧ۠ۦ"
            goto L_0x0006
        L_0x0084:
            java.lang.String r0 = "ۤۧۖۘ۟ۙۥۚۚ۫ۜۖۚۚ۟۬ۨۜۛۗۥ۫ۦۛۚۙۜۘ"
            goto L_0x0006
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView.setBadgeText(java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInitialState(boolean r10) {
        /*
            r9 = this;
            r5 = 0
            r3 = 0
            java.lang.String r0 = "ۧۧۨۘ۬۬ۥۘ۠۫۬ۡۗۘ۫ۖ۬۫ۤۚۛۚ۟ۥۘۙۡۡۘ"
            r1 = r0
            r2 = r3
            r4 = r5
            r6 = r5
        L_0x0008:
            int r0 = r1.hashCode()
            r7 = 86
            r8 = 858094392(0x33257b38, float:3.8529123E-8)
            r0 = r0 ^ r7
            r0 = r0 ^ r8
            switch(r0) {
                case -1910344088: goto L_0x010e;
                case -1556194860: goto L_0x00b8;
                case -1440316126: goto L_0x00a9;
                case -1407867431: goto L_0x005c;
                case -1356320178: goto L_0x0152;
                case -1134813582: goto L_0x004b;
                case -987422689: goto L_0x009b;
                case -940778753: goto L_0x006c;
                case -916218240: goto L_0x0017;
                case -878865029: goto L_0x0102;
                case -604715216: goto L_0x0157;
                case -99910662: goto L_0x013a;
                case -99682219: goto L_0x00b1;
                case 93204884: goto L_0x0152;
                case 303029599: goto L_0x0063;
                case 329767958: goto L_0x001f;
                case 337317519: goto L_0x00e9;
                case 396000581: goto L_0x0152;
                case 671491180: goto L_0x00bf;
                case 868268645: goto L_0x0090;
                case 1646052428: goto L_0x00df;
                case 1734927737: goto L_0x002a;
                case 1833637842: goto L_0x0132;
                case 1995761364: goto L_0x00fb;
                case 2106022086: goto L_0x001b;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0008
        L_0x0017:
            java.lang.String r0 = "ۨۡ۬۬ۢ۠۫ۥۡۦۛۡۚ۟ۘۘۦ۬ۦۘۗۦۚۘۘۘۘۛۗۖ"
            r1 = r0
            goto L_0x0008
        L_0x001b:
            java.lang.String r0 = "ۚ۠۟ۚۛۜۘۤۧۘۘۛ۠ۢۤۥۗۚۨۘ"
            r1 = r0
            goto L_0x0008
        L_0x001f:
            com.obwhatsapp.youbasha.ui.views.n r0 = r9.f1393a
            android.graphics.drawable.Drawable r0 = r0.f1491b
            r9.setBackground(r0)
            java.lang.String r0 = "ۦۧ۟ۥۢۜۘۥ۫ۥ۫ۦۜۘۡۡۗۗ۬۟۬ۖۘۘۦۖۘۦۙۖ"
            r1 = r0
            goto L_0x0008
        L_0x002a:
            r1 = 1852696699(0x6e6de87b, float:1.840725E28)
            java.lang.String r0 = "۬ۚۡۘۖۘۘۜ۫ۚ۟ۤ۬ۙۖۖۘ"
        L_0x002f:
            int r7 = r0.hashCode()
            r7 = r7 ^ r1
            switch(r7) {
                case -1733209666: goto L_0x0038;
                case -21316009: goto L_0x003f;
                case 667461690: goto L_0x0047;
                case 1363050125: goto L_0x0044;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x002f
        L_0x0038:
            java.lang.String r0 = "ۡۢ۫ۧۖۥ۟۫ۜۘۨ۟ۡۘۡ۠ۨۦ۟ۗۨۦ۟ۤۤۛ۫ۡۨ"
            r1 = r0
            goto L_0x0008
        L_0x003c:
            java.lang.String r0 = "ۡ۟ۗ۟ۗۛۘۗۨۘۧ۟۟ۙۗۙۘۜۧۖۢۗۛۦۥ"
            goto L_0x002f
        L_0x003f:
            if (r10 == 0) goto L_0x003c
            java.lang.String r0 = "۬ۘۖۥۖۜۥۡۖۘۦ۫ۛۜۦۚۖۢۛ"
            goto L_0x002f
        L_0x0044:
            java.lang.String r0 = "ۧ۬ۢ۟ۥۡۘۚۤۜۘ۠۫ۜۨۛۜۧۗۥۙۖ۠ۙۡۥۘ"
            goto L_0x002f
        L_0x0047:
            java.lang.String r0 = "ۡۖۤۤ۟ۘۘ۟ۖۘۘۗۧۢۧۖۧۘ۠۟ۥ۟ۜۚۡ۫ۘۛۛۢ"
            r1 = r0
            goto L_0x0008
        L_0x004b:
            android.widget.ImageView r0 = r9.f1395c
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            com.obwhatsapp.youbasha.ui.views.n r1 = r9.f1393a
            int r1 = r1.f1493d
            com.obwhatsapp.youbasha.task.utils.updateDrawableColor(r0, r1)
            java.lang.String r0 = "۟ۙۧۢ۫ۨۘۢۢۖۘۤۨۘۘۦۚ۟ۡۗۖۘۖ۬ۙۙۚۤ"
            r1 = r0
            goto L_0x0008
        L_0x005c:
            r0 = 1
            r9.f1394b = r0
            java.lang.String r0 = "ۨۗۜۘۛۖۦۖ۟ۚۙۢۘۘۢۡۡۘۘۢۨۘۗۡ۬ۢۤ۫"
            r1 = r0
            goto L_0x0008
        L_0x0063:
            com.obwhatsapp.yo.tf r0 = r9.f1396d
            r0.setVisibility(r3)
            java.lang.String r0 = "ۙۙ۬ۢۧۨۘۤۛۜۘۥ۬ۡۘۘۙۡۧ۬ۤ"
            r1 = r0
            goto L_0x0008
        L_0x006c:
            r1 = 520011581(0x1efebf3d, float:2.697239E-20)
            java.lang.String r0 = "ۢۧۙۛۘۡۛ۠ۜ۫ۘۛۜۤۧۛۥۧ۬ۘۨ۫ۙ"
        L_0x0071:
            int r7 = r0.hashCode()
            r7 = r7 ^ r1
            switch(r7) {
                case -1837213968: goto L_0x007a;
                case -1112932182: goto L_0x008b;
                case -1062344264: goto L_0x0080;
                case 1853690964: goto L_0x0148;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0071
        L_0x007a:
            java.lang.String r0 = "ۧۢۨۘۖۥۜۘۜ۫ۨۥۥۖۘ۫ۧۘ"
            goto L_0x0071
        L_0x007d:
            java.lang.String r0 = "ۢ۫ۨۘۖۘۜ۫ۤۘۗۥۨۘۡۖ۟ۖۨۜۨۧۜۨ۬ۖۘۧۗ۠"
            goto L_0x0071
        L_0x0080:
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.TransitionDrawable
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "ۥۦۚۗۜ۬ۡۥۖ۠ۨۥۡۘۧۘۦۙ۟۠ۦۨۦۙۤۜۚۥ"
            goto L_0x0071
        L_0x008b:
            java.lang.String r0 = "ۧ۫ۙۧ۠ۜۡۨۡۘۚۚۙ۟ۨۢۥۘۢۢۡۗۡۘۘۖۛۜ"
            r1 = r0
            goto L_0x0008
        L_0x0090:
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            java.lang.String r1 = "ۖۡۚ۟۬ۘۤۖۘۡۡۚۘۦۙۥۙ۠"
            r6 = r0
            goto L_0x0008
        L_0x009b:
            int r0 = com.obwhatsapp.youbasha.others.pagerIndicator()
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r6.setColorFilter(r0, r1)
            java.lang.String r0 = "۫ۖۖۘۥۢۨۘۘۘۨۚۢۦۧۥۨۘۛ۟ۘۖۥۜۙۛۥۘ"
            r1 = r0
            goto L_0x0008
        L_0x00a9:
            r6.startTransition(r3)
            java.lang.String r0 = "۠ۛ۟ۡۨۛۗۜ۫۠ۘ۫ۖۤۤۗۘ"
            r1 = r0
            goto L_0x0008
        L_0x00b1:
            com.obwhatsapp.youbasha.ui.views.n r4 = r9.f1393a
            java.lang.String r0 = "۠ۦ۟۠ۥۘ۟ۡۧۚۢ۫ۦۙۛ۫۫۠ۢۙۨۘۘۗۘۘ۫ۛ۠"
            r1 = r0
            goto L_0x0008
        L_0x00b8:
            int r2 = r4.f1495f
            java.lang.String r0 = "ۤۛۡۤۥۙ۟ۦۛۧۡۥۘۘۚ۟ۡۗۜۚۡ۫ۡۛ"
            r1 = r0
            goto L_0x0008
        L_0x00bf:
            r1 = -33415559(0xfffffffffe021e79, float:-4.3239466E37)
            java.lang.String r0 = "ۧۙۦۘۡ۠ۡۘۜۡۜۘۡۦۙ۬ۤ۫ۚ۟۟"
        L_0x00c4:
            int r7 = r0.hashCode()
            r7 = r7 ^ r1
            switch(r7) {
                case 670135214: goto L_0x00da;
                case 755977472: goto L_0x0152;
                case 908992281: goto L_0x00cd;
                case 1040504569: goto L_0x00d7;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            goto L_0x00c4
        L_0x00cd:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x00d4
            java.lang.String r0 = "ۛۜۗۧۚۖۥۚۤۙۘۢۦۘۧۘۢۖۧۘۖۦ۬ۤۖۥ"
            goto L_0x00c4
        L_0x00d4:
            java.lang.String r0 = "ۡۧۦۘ۠ۛۡۦۗۖۘۢ۟ۗۛۤۛ"
            goto L_0x00c4
        L_0x00d7:
            java.lang.String r0 = "۟ۚۦۤۥۡۨۛۜۘۡۧۥۤ۫ۦۘۛۡۨۘۛۨۥۘۨۚۨۘ۬۠ۗ"
            goto L_0x00c4
        L_0x00da:
            java.lang.String r0 = "۬ۜۛۤۗۖۘۤۦۤۡۨۚ۫ۜ"
            r1 = r0
            goto L_0x0008
        L_0x00df:
            android.graphics.drawable.Drawable r0 = r4.f1491b
            com.obwhatsapp.youbasha.task.utils.updateDrawableColor(r0, r2)
            java.lang.String r0 = "۠ۛۜۘ۠ۚۚۤ۟ۖۛۙۡۙۦۖۘ"
            r1 = r0
            goto L_0x0008
        L_0x00e9:
            android.widget.ImageView r0 = r9.f1395c
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            com.obwhatsapp.youbasha.ui.views.n r1 = r9.f1393a
            int r1 = r1.f1494e
            com.obwhatsapp.youbasha.task.utils.updateDrawableColor(r0, r1)
            java.lang.String r0 = "ۛۚۜۘۨۦۖ۠ۚۡۘۙۜ۠ۢۢۦۦۤۙۧۚۡۘۡ۟ۦ"
            r1 = r0
            goto L_0x0008
        L_0x00fb:
            r9.f1394b = r3
            java.lang.String r0 = "ۨۢۥۘۖۘۥۙۙۨۘۜ۠ۢ۠ۚۡۘ۟۠۟"
            r1 = r0
            goto L_0x0008
        L_0x0102:
            com.obwhatsapp.yo.tf r0 = r9.f1396d
            r1 = 8
            r0.setVisibility(r1)
            java.lang.String r0 = "ۢ۟ۢۛۢ۬ۥۧۨۥ۬ۖۦ۫ۖ۟ۢۚۤ۠ۛۖۘۘۥۥ"
            r1 = r0
            goto L_0x0008
        L_0x010e:
            r1 = 1264495549(0x4b5eabbd, float:1.4592957E7)
            java.lang.String r0 = "۫ۜۡۘۥۚ۠ۛۗۥۘۦۛۡۤۡۧۘ۬ۘۨۗۨ۟"
        L_0x0113:
            int r7 = r0.hashCode()
            r7 = r7 ^ r1
            switch(r7) {
                case -1880807288: goto L_0x011c;
                case -1727713815: goto L_0x014d;
                case 496660039: goto L_0x0122;
                case 1115966111: goto L_0x012d;
                default: goto L_0x011b;
            }
        L_0x011b:
            goto L_0x0113
        L_0x011c:
            java.lang.String r0 = "ۙۙۖۖ۠ۥۘۥۨۖ۟ۙۤۚۗۛۤۥۗ"
            goto L_0x0113
        L_0x011f:
            java.lang.String r0 = "ۧۧۥۗۗۢۧۛۡ۟ۥ۟ۗۙۚۡۦۜ۬ۗۧ"
            goto L_0x0113
        L_0x0122:
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.TransitionDrawable
            if (r0 != 0) goto L_0x011f
            java.lang.String r0 = "ۨۚۡ۠ۛۘۘۛۛۖ۬۠ۘۤ۬۠۫ۖۢۨ۫ۥۦۘۜۥۛ"
            goto L_0x0113
        L_0x012d:
            java.lang.String r0 = "ۥۥۥۦۗۨۧ۫ۚ۟۟۫ۡۖۘ"
            r1 = r0
            goto L_0x0008
        L_0x0132:
            r9.setBackground(r5)
            java.lang.String r0 = "ۢ۬ۛۨۗۦۘۢ۬ۧۖۛۤۤۡۡۥۥۛ"
            r1 = r0
            goto L_0x0008
        L_0x013a:
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r0.resetTransition()
            java.lang.String r0 = "ۚ۫ۥۘۚۢۜۦۧۚۥۜۘۘۜ۟ۡۡۜۖۚۤ۬ۗ۬ۖۘۨۚۨۘ"
            r1 = r0
            goto L_0x0008
        L_0x0148:
            java.lang.String r0 = "ۤۢۦۘۖۚۤۗۦۨۘۙ۠ۨۘ۫ۦۜ"
            r1 = r0
            goto L_0x0008
        L_0x014d:
            java.lang.String r0 = "ۥۖۛۛۚۡۘۧۢۜۙۛۦۘۤۘ۬ۤۛۖۘۚۘۧۧۛۤۡۡۗ"
            r1 = r0
            goto L_0x0008
        L_0x0152:
            java.lang.String r0 = "ۚ۫ۥۘۚۢۜۦۧۚۥۜۘۘۜ۟ۡۡۜۖۚۤ۬ۗ۬ۖۘۨۚۨۘ"
            r1 = r0
            goto L_0x0008
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView.setInitialState(boolean):void");
    }

    public void setTitleTypeface(Typeface typeface) {
        String str = "ۖ۬ۛ۠ۚ۠۬ۗۜۘ۫ۚۨۡ۠ۙۡۛۜ۠ۡۨۘ۫ۖۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 628) ^ -1846914229) {
                case -2048254772:
                    return;
                case -434064771:
                    str = "ۗۖۡۨۥۢ۬ۨ۫ۦۖۖۨ۠ۢۥۦۚۦۡۥۘۗۘۘۙۧۙ";
                    break;
                case -274085804:
                    this.f1396d.setTypeface(typeface);
                    str = "ۙۡۥۛۛۜۤۥۖ۟۬ۛ۬ۦ۬ۦۘۙۛۦۨۘۙۥۡۘۤ۬";
                    break;
                case 491192218:
                    str = "ۜۤۨۙۗۧۗۦۧۘۘۛ۫ۦۛۛ۠ۥۡۘۘۜۚۤۜۙۡۢۥۘ";
                    break;
            }
        }
    }

    public void toggle() {
        String str = "ۛۤۜۥۚۡۘۦۦۧۘ۬ۦۗ۫۟ۚۥ۟ۗ۠ۤۗۢ۫";
        while (true) {
            switch ((str.hashCode() ^ 57) ^ -830586988) {
                case -1942609163:
                    str = "ۜۘۦۘ۫ۢۤۦۤۗۘۘ۫ۚۜ۠ۧۚۦۦۡۡۚۨۤۨۘ";
                    break;
                case -1692970687:
                    return;
                case -886691329:
                    deactivate();
                    str = "ۘۨۧۗۜۙۨۦۚۨۚۨ۠ۥۧۡۖ۟ۡۙۘۘۡۥۥۘۙۘۙ";
                    break;
                case 484216667:
                    activate();
                    str = "ۦۘۖۘۙۜۤۛۡۗۛۥ۫۠ۖۨۘۤۦ۟ۘۗ۬";
                    break;
                case 1283987262:
                    str = "ۘۨۧۗۜۙۨۦۚۨۚۨ۠ۥۧۡۖ۟ۡۙۘۘۡۥۥۘۙۘۙ";
                    break;
                case 2085778283:
                    String str2 = "ۙۜۖ۠ۘۘۘ۫۬۫ۖۨۜ۫۫ۨۘۙ۬ۥ";
                    while (true) {
                        switch (str2.hashCode() ^ -313713088) {
                            case -967088065:
                                str = "ۢۢۨۘۖۥۖ۟ۨۖۘۛ۬ۘۘۗۡۡ۫ۛۥۘ۬ۤۖۘۜۗۦۘۡۡۤ";
                                continue;
                            case 144441582:
                                str2 = "ۦۦۦۤۧۡۘۙۚۜۘۖۚۥۜۢۤۜۨۢۚۦۧۧ۠۬ۙۤ";
                                break;
                            case 1591954076:
                                str = "ۚۥۧۚۛۢۥۜۖۘۘۗ۟۠۠ۥۚۗۡۚۨۡ";
                                continue;
                            case 2093393399:
                                if (this.f1394b) {
                                    str2 = "ۤۨۢۨۥۜۛۛۖۖ۟ۘۘۢ۟۠ۜ۬ۘۨۡ";
                                    break;
                                } else {
                                    str2 = "ۢ۬ۧ۬ۗۙۖۡۧۘۦۜۡۡۥ۬ۧۦۗ";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    public void updateAllColors() {
        String str = "۫ۤۘۘ۬ۛۨۜۢۧۨ۫ۨۚۘ۠ۨۘۙۖۘۦۘۙۗۢ۟۟ۜۘ";
        n nVar = null;
        int i2 = 0;
        int i3 = 0;
        n nVar2 = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            switch ((str.hashCode() ^ 795) ^ -595805937) {
                case -1404451987:
                    nVar = this.f1393a;
                    str = "۬ۡۥۚۖ۟ۤۛۘۤۨ۟۬۫ۨۤ۠ۨ";
                    break;
                case -1303236644:
                    nVar2.f1493d = i4;
                    str = "ۡۗۜۘۘ۫ۘۙۘۘ۠ۧۦۘۜ۠۫ۗۦۨۚۗۨۚ۫ۦۘ۠ۨۚ";
                    break;
                case -1082053279:
                    nVar2.f1494e = i5;
                    str = "ۗۘ۟ۚۚۖ۫ۙۘۘ۬ۨۘ۟۬ۜ";
                    break;
                case -912447985:
                    str = "ۛۢۦۛۙۥۘۢۢۢ۬ۛۦۦۤۢۦۢۥۖۨۤ";
                    nVar2 = this.f1393a;
                    break;
                case -638484403:
                    str = "۬ۤۘۙ۠۫۬ۦۜۦۜۥۧ۟ۚۘۙ۠ۜۜۙۥۘۗ";
                    i2 = others.getColor("tabadgeTextColor", yo.circleColor());
                    break;
                case -185412279:
                    this.f1396d.setTextColor(this.f1393a.f1493d);
                    str = "ۜۨ۬ۥۙۥۘۡ۟ۖۘۤۦۡۘۙۨۘ";
                    break;
                case -13873407:
                    String str2 = "ۖۢۦۗ۠ۧۙۜ۬۬۠۫ۜ۠";
                    while (true) {
                        switch (str2.hashCode() ^ -1156966576) {
                            case -625343706:
                                if (!this.f1394b) {
                                    str2 = "ۘۗۡۘۢۘۘۧۘۧۘ۟ۨۖۘۨ۠ۜۥۘۘۗۡۙۡۖۘۜۥۧۘ";
                                    break;
                                } else {
                                    str2 = "۬ۡۦۘۛۛۥۘ۟ۙ۟۫۫ۚ۫ۥۨۨ۫ۚۛۨۘۘۘۡ";
                                    break;
                                }
                            case -10332958:
                                str = "ۙۧۙ۟ۘۤ۠ۡ۟ۛۚۨۘۚ۟ۧۗۖۤ";
                                continue;
                            case 148624414:
                                str2 = "ۗۥۘۘ۫ۢۗۧۦ۠ۨۨۚۙۡۘ۟ۨۘۖۢۤۧ۬ۙۜۨ";
                                break;
                            case 951441496:
                                str = "ۦۤۦۘۛۦۡۤۘۨۘ۟ۥۨۜ۟۫۟ۨۨۘ۬۟ۦۗۢۨ";
                                continue;
                        }
                    }
                    break;
                case 747981341:
                    b(getContext());
                    str = "ۚۨۡۘۨ۟ۡۘۦ۫ۚۜ۟ۧ۫ۡۦۜۨ۟۟ۡ۬ۥ۬۟ۨ";
                    break;
                case 774908265:
                    str = "ۛۙۢۗ۬ۖۘۙ۫ۜۨۘۘۧۖ۬۫۫ۢۙۖۖۘ";
                    i5 = others.getTabInActiveColor();
                    break;
                case 995000109:
                    str = "۬ۛۛۡۤۨۘۗۢۨۘ۟ۤ۟ۧۚ۬";
                    i3 = others.getTabBageBKColor(-1);
                    break;
                case 1204579847:
                    return;
                case 1376483396:
                    activate();
                    str = "ۦۤۦۘۛۦۡۤۘۨۘ۟ۥۨۜ۟۫۟ۨۨۘ۬۟ۦۗۢۨ";
                    break;
                case 1377422596:
                    nVar.f1498i = i3;
                    str = "ۡ۟ۜۘۛۚۡۗ۫ۦۧۖۚۨۥۗۖۡۤ۠ۧ۠۫۬ۚۥۦۙ";
                    break;
                case 1604006505:
                    str = "ۚۨۡۘۜۤۖۛۦ۠ۙۡۨۡۘۧۘ۫ۨۧۘۢۡۜۥۘۗۜۧۗ";
                    i4 = others.getColor("pagetitle_sel_picker", ColorStore.getPrimaryColor());
                    break;
                case 1771441990:
                    utils.updateDrawableColor(this.f1395c.getDrawable(), getCurrentStateColor());
                    str = "ۘۖۦۚ۫ۜۘ۫۠ۘۘ۬ۖۦ۠ۦ۫ۦۨۢۥۗۧۜۙۢ";
                    break;
                case 1783561525:
                    str = "۫ۛۥۧۧۖۘ۬ۢۜۘۡ۟ۚۖۢۜ";
                    break;
                case 2005101772:
                    nVar.f1497h = i2;
                    str = "ۥ۠ۜۘۗۘۙ۟ۖۙۚ۫۠ۨۚۦۘ";
                    break;
            }
        }
    }

    public void updateBubbleDetails(String str, Drawable drawable) {
        String str2 = "ۚ۬ۤۨۛۡۢۢۚۙۧۥۙ۫ۜۧۚۨۜۤۡۘۜۧۜ";
        while (true) {
            switch ((str2.hashCode() ^ 641) ^ -933339503) {
                case -1832858375:
                    this.f1393a.f1490a = drawable;
                    str2 = "۬ۦۛ۬۠ۗۡۧۥ۠۟۬ۦ۬ۤۖ۠ۥۘۙۛۡۘۨۜۚۜۖۥ";
                    break;
                case -1760032808:
                    setInitialState(this.f1394b);
                    str2 = "ۖ۠۠ۗۥ۠ۖۚۛۨۖۥۤ۬۬ۤۡۚۦۡۖۘ۟۠ۡ۟ۧۙ";
                    break;
                case -1678838381:
                    this.f1396d.setText(str);
                    str2 = "ۜۜۖۘۧ۬ۜۦ۟ۗۗۗۧۡ۠ۡ۬ۨۡۘ۬۟ۜۘۙۥۖ۬";
                    break;
                case -1504973805:
                    invalidate();
                    str2 = "ۢۘۨۗۚ۬۠ۤۨۘۗۖۛۜ۠۟ۜۡ";
                    break;
                case -1086974127:
                    this.f1393a.f1492c = str;
                    str2 = "ۘۦۘۘۢۢۦۥۡۖۘۘۡۧۘۘۧۨۘۥۦۢۙۙ۠ۤۨ۟ۚ۫ۡ";
                    break;
                case -181500807:
                    this.f1395c.setImageDrawable(drawable);
                    str2 = "ۦۛۥۘۙۡۨۛۦۧۙۢۖۘۤۖۘۘ";
                    break;
                case -57614281:
                    str2 = "۟ۜۛ۬ۚ۬ۛۛۢۡۥۚ۬ۡۢ۟ۘ۫ۗ۟ۨۘ";
                    break;
                case 484830591:
                    return;
                case 1543668190:
                    str2 = "ۥۡۡۙۘ۟ۥ۬ۨۧۢۙ۠ۘۡۘ";
                    break;
                case 1734984097:
                    str2 = "ۥ۬ۚ۟ۦۧۢ۠ۥۘۗۢۙۥۘ۬";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f6, code lost:
        r3 = "ۖ۟ۗۤ۬ۜۗۨۜۘۗۧۡۘ۟ۗۥۜۥۛ۟ۨۥۚۜ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0010, code lost:
        r2 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateMeasurements(int r19) {
        /*
            r18 = this;
            r2 = 0
            r15 = 0
            r12 = 0
            r14 = 0
            r10 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            java.lang.String r1 = "ۙ۫ۜۘۗۡۚۘۧۛۨۧۤۚ۫ۨۘ۟ۜ۠ۗ۠ۜۨ۟ۥۘ"
            r3 = r1
        L_0x0010:
            int r1 = r3.hashCode()
            r16 = 854(0x356, float:1.197E-42)
            r17 = 1217253055(0x488dcebf, float:290421.97)
            r1 = r1 ^ r16
            r1 = r1 ^ r17
            switch(r1) {
                case -2056487356: goto L_0x00a3;
                case -1947569185: goto L_0x0021;
                case -1884018290: goto L_0x0097;
                case -1690380853: goto L_0x0035;
                case -1569334727: goto L_0x0081;
                case -1314288927: goto L_0x0077;
                case -1171475111: goto L_0x00b0;
                case -1149432237: goto L_0x0086;
                case -1142689517: goto L_0x0062;
                case -1018552385: goto L_0x0072;
                case -818900546: goto L_0x0055;
                case -561650114: goto L_0x00c8;
                case -300512173: goto L_0x007c;
                case -298544367: goto L_0x006d;
                case -259908865: goto L_0x00e7;
                case -140714094: goto L_0x0029;
                case -46086631: goto L_0x008e;
                case 581413884: goto L_0x0114;
                case 691794674: goto L_0x0068;
                case 829349625: goto L_0x0025;
                case 878234166: goto L_0x0130;
                case 892996717: goto L_0x005c;
                case 1705513094: goto L_0x012b;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0010
        L_0x0021:
            java.lang.String r1 = "ۚۘ۬ۤ۟ۤۖ۠ۖۘۖۦ۟ۙۛۚۡۢۧۖۖۛۛ۠ۚ"
            r3 = r1
            goto L_0x0010
        L_0x0025:
            java.lang.String r1 = "ۢۥۨۘۡۢۡۘۨ۟۟ۙ۟ۥۢۦۡ"
            r3 = r1
            goto L_0x0010
        L_0x0029:
            r0 = r18
            com.obwhatsapp.yo.tf r1 = r0.f1396d
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            java.lang.String r1 = "۠۠ۖۜۖۙۗۨۨۘ۫۠ۥۢ۠ۦۡۙۥۖۛۨۘ۟ۖۘ۠ۙۜ"
            r3 = r1
            goto L_0x0010
        L_0x0035:
            r3 = 2061318551(0x7add3997, float:5.7433283E35)
            java.lang.String r1 = "ۧۧۨۘۤۖۛۗۖ۟۟ۥۛۨ۟۫ۥۡۦۘۜ۟ۜۤۗۜۘۦ۟ۗ"
        L_0x003a:
            int r16 = r1.hashCode()
            r16 = r16 ^ r3
            switch(r16) {
                case -2143279197: goto L_0x0126;
                case -1445413186: goto L_0x0051;
                case 1467525044: goto L_0x0044;
                case 1655458269: goto L_0x004a;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x003a
        L_0x0044:
            java.lang.String r1 = "۬ۖۜۘۛۦۘۥۨۤۙۛۧۚۧۥۘۥۡۖۘ"
            goto L_0x003a
        L_0x0047:
            java.lang.String r1 = "ۙۤۜۖۤۜۘۖۖۤۛ۠ۜۡۗۘ"
            goto L_0x003a
        L_0x004a:
            boolean r1 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "ۗ۠۟ۜۤۜۘ۠ۦۙۛۨۨۘۢۜۥۘ"
            goto L_0x003a
        L_0x0051:
            java.lang.String r1 = "۬ۢۘۘۦۧۗۛ۠ۙۚ۠ۙۡ۫۠"
            r3 = r1
            goto L_0x0010
        L_0x0055:
            r1 = r2
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            java.lang.String r3 = "۟ۤۖۨۛۘۗۥۘ۫ۨۡ۠ۦۘ"
            r15 = r1
            goto L_0x0010
        L_0x005c:
            int r12 = r15.rightMargin
            java.lang.String r1 = "ۡ۟ۥۢ۟ۘۘۖۚۘۘ۟ۧۥۘۚۤۦۖ۫ۖۦۘ"
            r3 = r1
            goto L_0x0010
        L_0x0062:
            int r14 = r15.leftMargin
            java.lang.String r1 = "۟ۖۦ۟ۤۙۙۤۘۢ۫ۜۥۥۨۘ"
            r3 = r1
            goto L_0x0010
        L_0x0068:
            java.lang.String r1 = "۠۫ۢۙۛۛ۟ۤۜۦۢۙۨۚۨۘۤۗۚۙۚۡۘۚ۬ۤۖۚۡۘ"
            r3 = r1
            r13 = r14
            goto L_0x0010
        L_0x006d:
            java.lang.String r1 = "ۘ۠ۖۡۤۙۧۘۜۘۥۗۗۥۖۦۘۙۜۥ"
            r3 = r1
            r11 = r12
            goto L_0x0010
        L_0x0072:
            r10 = 0
            java.lang.String r1 = "ۗۧۨۘ۬ۚۦۘ۬ۚۘ۠ۦۥۘۧ۠ۖ۬ۨۘۘۦۨ۬ۧ۟ۜۘ"
            r3 = r1
            goto L_0x0010
        L_0x0077:
            r9 = 0
            java.lang.String r1 = "ۖ۠ۧۤۡۥۘۨۡۨ۟۟ۘۤ۠ۢۙۘۗۦ۬ۨۘۚۢ۠"
            r3 = r1
            goto L_0x0010
        L_0x007c:
            java.lang.String r1 = "ۢۙۛۘۦۚ۫ۘۨۗۨۘ۫ۧۘۘ"
            r3 = r1
            r11 = r10
            goto L_0x0010
        L_0x0081:
            java.lang.String r1 = "ۨۥۧۘ۫ۜۨۘۧ۫ۘۘۗۥۦ۬ۤۡ۟ۤ۠ۛۦ۠ۙۨۤۢۖۥ"
            r3 = r1
            r13 = r9
            goto L_0x0010
        L_0x0086:
            int r8 = r18.getPaddingRight()
            java.lang.String r1 = "۠ۗ۫ۧ۬ۦۘۢۚۢۡۚۗۢۛۥۢ۠ۦۙ۟ۚۚۘۧ"
            r3 = r1
            goto L_0x0010
        L_0x008e:
            int r7 = r18.getPaddingLeft()
            java.lang.String r1 = "ۛۦۜۗۚۨۜۖۨۘۗۙۗۖۘۢ۬ۤۨ"
            r3 = r1
            goto L_0x0010
        L_0x0097:
            r0 = r18
            com.obwhatsapp.youbasha.ui.views.n r1 = r0.f1393a
            float r1 = r1.f1501l
            int r6 = (int) r1
            java.lang.String r1 = "ۗ۟ۜۘ۫ۥۗۥۡ۬ۤ۫۬ۡۙۨۘۜۨۡۘۨۛۖۘۖۥۨۘ"
            r3 = r1
            goto L_0x0010
        L_0x00a3:
            r0 = r18
            com.obwhatsapp.yo.tf r1 = r0.f1396d
            int r5 = r1.getPaddingRight()
            java.lang.String r1 = "ۤۨ۬ۡۨۛۛۦۖۘۧۧۚ۠ۨۧۘۙۗۘۘۜۤۨۘ"
            r3 = r1
            goto L_0x0010
        L_0x00b0:
            r0 = r18
            com.obwhatsapp.yo.tf r1 = r0.f1396d
            int r1 = r1.getPaddingLeft()
            int r3 = r7 + r8
            int r3 = r19 - r3
            int r4 = r11 + r13
            int r3 = r3 - r4
            int r3 = r3 - r6
            int r3 = r3 + r5
            int r4 = r1 + r3
            java.lang.String r1 = "ۙۤۢ۠ۦۥۘۥ۫۟ۗ۫ۤۚۘۖۘ۬ۨ۠۠ۢۧۡۨۤ۫ۛۜ"
            r3 = r1
            goto L_0x0010
        L_0x00c8:
            r3 = 52554632(0x321eb88, float:4.7584024E-37)
            java.lang.String r1 = "ۘۡۙۙۗۜۘۗۥۧۘۛۛۘۨۚۜۜۜ۫ۡ۠ۥ"
        L_0x00cd:
            int r16 = r1.hashCode()
            r16 = r16 ^ r3
            switch(r16) {
                case -759829930: goto L_0x00f6;
                case 1372616414: goto L_0x00dd;
                case 1519044499: goto L_0x00d7;
                case 1683342559: goto L_0x00e2;
                default: goto L_0x00d6;
            }
        L_0x00d6:
            goto L_0x00cd
        L_0x00d7:
            java.lang.String r1 = "ۧ۠۫ۙۧۖۨۚۖۘۛۨۚۤ۫ۨۚۜ۬۟ۡۥ"
            goto L_0x00cd
        L_0x00da:
            java.lang.String r1 = "ۘۦۤ۠ۤۢۜۦۛۚۨۦۘۧۗۥۚۛۚۚۗۨ"
            goto L_0x00cd
        L_0x00dd:
            if (r4 <= 0) goto L_0x00da
            java.lang.String r1 = "ۡ۟ۨۘۗۙۖۧۙۜۜۦۚۧۡ۠۟۬ۜۧۘۡ"
            goto L_0x00cd
        L_0x00e2:
            java.lang.String r1 = "ۙۧۜۘۜۖۜۙ۠ۖۢۥۘۥۢۥۜۛ۟"
            r3 = r1
            goto L_0x0010
        L_0x00e7:
            r3 = 1362452363(0x51355f8b, float:4.8687002E10)
            java.lang.String r1 = "ۜۗۦۙۥۘ۬ۘۥۛۗ۟۠ۗۥۤۧۦ۬ۧۙ"
        L_0x00ec:
            int r16 = r1.hashCode()
            r16 = r16 ^ r3
            switch(r16) {
                case -1298331510: goto L_0x010c;
                case -312152648: goto L_0x00f6;
                case -120005760: goto L_0x010f;
                case 1393209365: goto L_0x00fe;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            goto L_0x00ec
        L_0x00f6:
            java.lang.String r1 = "ۖ۟ۗۤ۬ۜۗۨۜۘۗۧۡۘ۟ۗۥۜۥۛ۟ۨۥۚۜ"
            r3 = r1
            goto L_0x0010
        L_0x00fb:
            java.lang.String r1 = "ۡ۫ۖۘۜۦۙۗۧۢۨۡۘۜۤ۫"
            goto L_0x00ec
        L_0x00fe:
            float r1 = (float) r4
            r0 = r18
            float r0 = r0.f1400h
            r16 = r0
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fb
            java.lang.String r1 = "ۡۥۛۤ۬ۖۘۚۢۘۢۨۡۘۡۗۜۘ۟۠۠"
            goto L_0x00ec
        L_0x010c:
            java.lang.String r1 = "ۧۙۢۡ۬۟ۙ۬ۙۙ۠ۦۤ۠ۦۘۧۢ۬ۜۢۗ"
            goto L_0x00ec
        L_0x010f:
            java.lang.String r1 = "ۡۖۢۛۨۛۙۚۡۖۤ۬ۚ۠ۗۤۢۗۗۚۜۤۘ۟۟ۨۗ"
            r3 = r1
            goto L_0x0010
        L_0x0114:
            r0 = r18
            com.obwhatsapp.yo.tf r1 = r0.f1396d
            int r1 = r1.getMeasuredWidth()
            float r1 = (float) r1
            r0 = r18
            r0.f1400h = r1
            java.lang.String r1 = "ۖ۟ۗۤ۬ۜۗۨۜۘۗۧۡۘ۟ۗۥۜۥۛ۟ۨۥۚۜ"
            r3 = r1
            goto L_0x0010
        L_0x0126:
            java.lang.String r1 = "۠۠ۤۙۜۘۘۛۤ۠۫۫ۜۘ۠ۦۨ"
            r3 = r1
            goto L_0x0010
        L_0x012b:
            java.lang.String r1 = "ۨۥۧۘ۫ۜۨۘۧ۫ۘۘۗۥۦ۬ۤۡ۟ۤ۠ۛۦ۠ۙۨۤۢۖۥ"
            r3 = r1
            goto L_0x0010
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoBubbleToggleView.updateMeasurements(int):void");
    }
}
