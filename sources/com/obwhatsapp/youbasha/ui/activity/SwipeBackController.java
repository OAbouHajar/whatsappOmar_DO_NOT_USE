package com.obwhatsapp.youbasha.ui.activity;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.obwhatsapp.youbasha.task.utils;
import n.e;

public class SwipeBackController {

    /* renamed from: l  reason: collision with root package name */
    public static int f1251l;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1252a = utils.isRTL();

    /* renamed from: b  reason: collision with root package name */
    public final int f1253b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1254c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1255d = false;

    /* renamed from: e  reason: collision with root package name */
    public float f1256e;

    /* renamed from: f  reason: collision with root package name */
    public float f1257f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f1258g;

    /* renamed from: h  reason: collision with root package name */
    public final ViewGroup f1259h;

    /* renamed from: i  reason: collision with root package name */
    public final ArgbEvaluator f1260i;

    /* renamed from: j  reason: collision with root package name */
    public final ValueAnimator f1261j;

    /* renamed from: k  reason: collision with root package name */
    public VelocityTracker f1262k;

    public SwipeBackController(Activity activity) {
        new ColorDrawable(0);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        int i2 = activity.getResources().getDisplayMetrics().widthPixels;
        this.f1253b = i2;
        f1251l = i2 / 2;
        this.f1254c = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.f1260i = new ArgbEvaluator();
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        this.f1258g = viewGroup;
        viewGroup.setBackground(colorDrawable);
        this.f1259h = (ViewGroup) activity.findViewById(16908290);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1261j = valueAnimator;
        valueAnimator.setDuration(250);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.addUpdateListener(new e(this, activity, 0));
    }

    public final void a(float f2) {
        int i2 = 0;
        String str = "ۡۦۙۥۨۦۖۤۥۘۜۙۡۗۙۚۧۛۜۘۜ۬ۗۢ۫ۦۘ۟ۤۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 13) ^ 982676998) {
                case -1570318262:
                    str = "ۘ۠ۗۗۤۖۜ۫۫ۖ۬ۢۨۨۡۘ";
                    break;
                case -1368922580:
                    this.f1258g.setBackgroundColor(i2);
                    str = "ۜۤۥۤۜۗۢۚۜ۬ۢۙ۫ۘۥۘ";
                    break;
                case 931707710:
                    str = "ۖۗۡۦۖۥ۬ۜۦۘ۟ۜۖۜ۬ۚۘۧۘ";
                    break;
                case 1218812170:
                    i2 = ((Integer) this.f1260i.evaluate(f2 / ((float) this.f1253b), Integer.valueOf(Color.parseColor("#80000000")), Integer.valueOf(Color.parseColor("#05000000")))).intValue();
                    str = "ۢۤۦۗ۫۠ۢۨۥۡۜۢۢۜۘ۬ۤۥۘۗۥ";
                    break;
                case 1238498954:
                    return;
            }
        }
    }

    public final void b(int i2) {
        String str = "ۘ۬ۙۖۙ۟ۧ۬۟ۚۚۡۘۖ۬ۤۛۖۧۘۗ۟";
        while (true) {
            switch ((str.hashCode() ^ 587) ^ 1346222448) {
                case -1911720198:
                    this.f1259h.setTranslationX((float) i2);
                    str = "ۖ۬ۥۘ۬ۖ۬ۛۦۜۧۨۧۘۤ";
                    break;
                case -1831220351:
                    return;
                case -199762504:
                    str = "۠ۨۜۘ۫۬ۧ۬۟۫ۦۖۗۨۗۡۚۤۥۘۙۙۜ۟ۢ";
                    break;
                case 1699077843:
                    str = "ۛ۫ۗۖۙ۫۫ۦۗ۟ۗۡۘۥ۬ۦۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 807 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0243, code lost:
        r1 = "ۘۤۥۘۢ۠۫۠ۢۘۘۙۤۧۨۥۘۘۖۢۥۧۘۧۘۨۙۘۘ۟ۢۦۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0359, code lost:
        r1 = "ۙۖۡۘۘۘۧ۠۬ۦۘۚ۬۠۬ۡۧ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0551, code lost:
        r1 = "۟ۡۙ۟ۜۗ۟ۤۜۜۛۗۚۤۥۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05b2, code lost:
        r1 = "ۦۜۨۘ۠۟ۖۛۤۖۘۜۡۦۘ۠ۧۥۜۗ۬ۜ۟ۖۡۛۙۢ۟ۘۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0867, code lost:
        r1 = "ۥۜۥۜۦۥۘۧ۫ۚۥۚۥۗۥۘۤ۟ۨۘۖۤۦۘۛۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x086b, code lost:
        r1 = "۟ۚۦۨۚۦۤۢۘۜۛۛۚۦۖۘ۬۬ۨۘۗ۠ۜۚۘۧۘ۬ۨۧۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0897, code lost:
        r1 = "ۦۧۜۢۗۦۘۖۦۛۦۚۗۘۢۥۘۙۖۘۘۚۖۦ۫ۤۢۘۤۨ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x08a3, code lost:
        r1 = "ۖۗۘۨۘۧۘ۟ۚۤۜۨۗۢۧۥۘۖ۫۠";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean processEvent(android.view.MotionEvent r29) {
        /*
            r28 = this;
            r24 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r16 = 0
            r17 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r7 = 0
            r8 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            java.lang.String r1 = "ۚۜ۟ۤ۬ۡۡۦۨۛۖۜۘۥۧۡ"
        L_0x0022:
            int r25 = r1.hashCode()
            r26 = 43
            r27 = -2135510755(0xffffffff80b6b11d, float:-1.6777597E-38)
            r25 = r25 ^ r26
            r25 = r25 ^ r27
            switch(r25) {
                case -2142150155: goto L_0x05eb;
                case -2140311707: goto L_0x0283;
                case -2071849467: goto L_0x0102;
                case -2055386002: goto L_0x07f5;
                case -2039814026: goto L_0x0893;
                case -2032253106: goto L_0x028c;
                case -2028297146: goto L_0x06e1;
                case -2008239111: goto L_0x005b;
                case -2000526228: goto L_0x010a;
                case -1982658928: goto L_0x02ae;
                case -1968333699: goto L_0x0211;
                case -1960416231: goto L_0x0662;
                case -1947403672: goto L_0x05c9;
                case -1923304043: goto L_0x08ab;
                case -1896724840: goto L_0x047b;
                case -1892490599: goto L_0x0328;
                case -1891909776: goto L_0x0863;
                case -1867113340: goto L_0x06a2;
                case -1808758691: goto L_0x0749;
                case -1742814688: goto L_0x00a5;
                case -1738082273: goto L_0x06c9;
                case -1724675661: goto L_0x0850;
                case -1715182055: goto L_0x07e4;
                case -1702968225: goto L_0x039a;
                case -1646347101: goto L_0x062e;
                case -1577480709: goto L_0x02f4;
                case -1555198099: goto L_0x0825;
                case -1488708457: goto L_0x0033;
                case -1484521477: goto L_0x02e7;
                case -1461790655: goto L_0x087b;
                case -1410973543: goto L_0x016a;
                case -1404249681: goto L_0x07db;
                case -1366632090: goto L_0x0659;
                case -1271979011: goto L_0x00d3;
                case -1228532457: goto L_0x0450;
                case -1201430549: goto L_0x047e;
                case -1052306089: goto L_0x03ba;
                case -1017237038: goto L_0x0813;
                case -1005835677: goto L_0x01cd;
                case -1003510388: goto L_0x0594;
                case -998293732: goto L_0x076f;
                case -998203117: goto L_0x01b5;
                case -994250788: goto L_0x0542;
                case -935187905: goto L_0x0383;
                case -840543785: goto L_0x08ab;
                case -815986253: goto L_0x07ed;
                case -769944715: goto L_0x0076;
                case -754313101: goto L_0x078f;
                case -730603947: goto L_0x05a3;
                case -645535619: goto L_0x0128;
                case -635571240: goto L_0x0200;
                case -629364901: goto L_0x04a0;
                case -562150313: goto L_0x06d3;
                case -562047569: goto L_0x087b;
                case -522585672: goto L_0x0758;
                case -465953108: goto L_0x030c;
                case -456304862: goto L_0x007f;
                case -441051325: goto L_0x0406;
                case -410906178: goto L_0x083a;
                case -393998080: goto L_0x05da;
                case -361427604: goto L_0x07d2;
                case -352427309: goto L_0x0459;
                case -301935128: goto L_0x03f6;
                case -269901133: goto L_0x071f;
                case -236732050: goto L_0x0523;
                case -208898014: goto L_0x0088;
                case -174198593: goto L_0x06bc;
                case -132844226: goto L_0x07ae;
                case -78792274: goto L_0x087b;
                case -75589461: goto L_0x0445;
                case -39657360: goto L_0x02fe;
                case 17529763: goto L_0x08ab;
                case 82216034: goto L_0x0599;
                case 134379398: goto L_0x0059;
                case 158768797: goto L_0x018b;
                case 193373055: goto L_0x0234;
                case 221246507: goto L_0x040f;
                case 266939448: goto L_0x04ac;
                case 418398790: goto L_0x081a;
                case 460193147: goto L_0x01bb;
                case 467376204: goto L_0x06f0;
                case 530423281: goto L_0x0258;
                case 542267346: goto L_0x087b;
                case 571745450: goto L_0x0873;
                case 623696075: goto L_0x0374;
                case 648109910: goto L_0x01c7;
                case 707285066: goto L_0x059e;
                case 715809607: goto L_0x0471;
                case 786928283: goto L_0x058f;
                case 849442863: goto L_0x04b9;
                case 936455006: goto L_0x0064;
                case 944630841: goto L_0x00e0;
                case 947162438: goto L_0x0149;
                case 979609334: goto L_0x0418;
                case 987377272: goto L_0x04de;
                case 1060897875: goto L_0x0504;
                case 1090770732: goto L_0x0465;
                case 1097917954: goto L_0x087b;
                case 1107197284: goto L_0x07cb;
                case 1171261578: goto L_0x089f;
                case 1223767048: goto L_0x0420;
                case 1300817606: goto L_0x031b;
                case 1362212027: goto L_0x00c7;
                case 1363936479: goto L_0x034a;
                case 1406183213: goto L_0x0846;
                case 1410818037: goto L_0x082e;
                case 1506855983: goto L_0x04e6;
                case 1746679122: goto L_0x060e;
                case 1760269517: goto L_0x0039;
                case 1777160113: goto L_0x08ab;
                case 1886973252: goto L_0x0684;
                case 1898408277: goto L_0x04db;
                case 1916463398: goto L_0x03fd;
                case 1927917161: goto L_0x0036;
                case 1965467615: goto L_0x0565;
                case 1989384831: goto L_0x006d;
                case 2001593380: goto L_0x01c1;
                case 2008109204: goto L_0x043e;
                case 2023020173: goto L_0x01ef;
                case 2077934768: goto L_0x02cc;
                case 2094414005: goto L_0x03d9;
                case 2141983804: goto L_0x06fd;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x0022
        L_0x0033:
            java.lang.String r1 = "ۢۢۛ۟ۜۗۙۗۘۥ۠ۡۘۤۤۥۜ۟ۜۘۦ۬ۜ"
            goto L_0x0022
        L_0x0036:
            java.lang.String r1 = "ۜۤۤۥۤۤۡۦۘ۫ۧۡۘۤ۬۫ۛۘۜۘۖ۠ۤ"
            goto L_0x0022
        L_0x0039:
            r25 = -940631805(0xffffffffc7ef1903, float:-122418.02)
            java.lang.String r1 = "ۖ۬ۢۗۙۗۙۡۡۜۖۙۦۖۘۢۚۚ۬ۤۙۛۡۦۘ۟ۛ"
        L_0x003e:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1564448787: goto L_0x0053;
                case -1489635217: goto L_0x0048;
                case -916839008: goto L_0x0056;
                case 1099718543: goto L_0x004e;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x003e
        L_0x0048:
            java.lang.String r1 = "ۦۘۧۜۖۘۦۡۖۖ۟۠ۤۙۦۘ۬ۘۧۘۘۤۜۘۧۚۧ۠ۖۨ"
            goto L_0x0022
        L_0x004b:
            java.lang.String r1 = "ۛۧۥۘۜۗۘۚۚۡۘۧۢۜۘ۫ۘۥۘ"
            goto L_0x003e
        L_0x004e:
            if (r29 != 0) goto L_0x004b
            java.lang.String r1 = "ۥۢۦۘ۫۫ۜۘۨۤۖۘۘۖۖۘۢۜۨۡۖۨۘۦۙۦۘۥ۬ۤ"
            goto L_0x003e
        L_0x0053:
            java.lang.String r1 = "ۡۚ۟۬ۦۖۘۧۜۧۘۢۗۦۘ۫ۜۥۘ۫ۛۘۘ"
            goto L_0x003e
        L_0x0056:
            java.lang.String r1 = "ۛۘۛۤۗۦۘۦۧۖ۬۟۠ۦ۫ۨۘ"
            goto L_0x0022
        L_0x0059:
            r1 = 0
        L_0x005a:
            return r1
        L_0x005b:
            r0 = r28
            android.animation.ValueAnimator r0 = r0.f1261j
            r24 = r0
            java.lang.String r1 = "۬ۘۦۘ۫ۚۖ۠۟ۤۦ۟۠ۤۘۜۘۖۥۧۛۘۥۘۦ۟ۖۘ"
            goto L_0x0022
        L_0x0064:
            r0 = r28
            boolean r0 = r0.f1252a
            r23 = r0
            java.lang.String r1 = "ۧۡۨۢۥۦۥۤۜۘۥۛۥۘ۬ۥۡۘ"
            goto L_0x0022
        L_0x006d:
            r0 = r28
            int r0 = r0.f1254c
            r22 = r0
            java.lang.String r1 = "۟ۙۘۘۦۤۜ۟ۗۥۘۛۧۦۙۘۖۘۖۡۦ۬ۙ۟"
            goto L_0x0022
        L_0x0076:
            r0 = r28
            android.view.ViewGroup r0 = r0.f1259h
            r21 = r0
            java.lang.String r1 = "ۡۛۗۧۥۙۖۗۨۘۨۦۧۖۗ۟ۖ۫ۤۖ۠ۖۘۨۙۡۡۖۢ"
            goto L_0x0022
        L_0x007f:
            r0 = r28
            int r0 = r0.f1253b
            r20 = r0
            java.lang.String r1 = "ۛۖۨۘۖ۟۫۬ۚۗۨۢۚۤۙۨۙ"
            goto L_0x0022
        L_0x0088:
            r25 = -114964345(0xfffffffff925c887, float:-5.379976E34)
            java.lang.String r1 = "ۥۦۥۘۘۥۧ۫۫۬ۘۙۤ۟۬ۢۤۜۡۘ"
        L_0x008d:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -424613908: goto L_0x0097;
                case 901005056: goto L_0x009d;
                case 976074935: goto L_0x00a2;
                case 1540625486: goto L_0x087f;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x008d
        L_0x0097:
            java.lang.String r1 = "ۘۦۚۨۙۦۘ۟ۧ۬ۡۦۚ۫۬ۗ"
            goto L_0x0022
        L_0x009a:
            java.lang.String r1 = "ۖۛ۠ۚ۠ۗۚۛۙۤ۠ۨۦ۬ۢۚۧۨۘۖ۠ۢ"
            goto L_0x008d
        L_0x009d:
            if (r23 == 0) goto L_0x009a
            java.lang.String r1 = "ۖۙۚۛۗۡۘۡۡۤۡۨۖۥۗۗ"
            goto L_0x008d
        L_0x00a2:
            java.lang.String r1 = "ۥ۬ۤ۫۬۬ۡۚۖۦ۬ۖۘۥۗۦۘۤۧۗ۟۟ۦۘ"
            goto L_0x008d
        L_0x00a5:
            r25 = 1171506888(0x45d3c6c8, float:6776.8477)
            java.lang.String r1 = "ۨۦۧۘۙۛۧۜۥۜۘ۫ۦۖۖۜۜۘ"
        L_0x00aa:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1399879992: goto L_0x00c3;
                case -656165958: goto L_0x00c0;
                case 555517093: goto L_0x0853;
                case 680969322: goto L_0x00b4;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x00aa
        L_0x00b4:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            if (r1 != 0) goto L_0x00bd
            java.lang.String r1 = "ۙ۠ۡۗۨۘۢۗۜۘۦۛۘۘۗ۫۟ۗۤۖۘۛۡ۟"
            goto L_0x00aa
        L_0x00bd:
            java.lang.String r1 = "ۜۖۤ۠ۜۛۜ۬ۗۤۙۖۘ۫۫ۨۜۤۨۨۛۢۘۘۥۘۥۚۡۘ"
            goto L_0x00aa
        L_0x00c0:
            java.lang.String r1 = "۟ۥۚ۟ۧۘۦۧۘۘۤۗۖۘۘۚۘۘۤۛۡۢۗ۟ۦۛۡۘ"
            goto L_0x00aa
        L_0x00c3:
            java.lang.String r1 = "۠۟۬ۦۛ۟ۦۚۨۘۤۜۧۘ۟ۥ۟ۘۦۨۘ۠ۡۨ۫ۨ۫ۡۙۙ"
            goto L_0x0022
        L_0x00c7:
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0 = r28
            r0.f1262k = r1
            java.lang.String r1 = "ۜۛۚۖۨ۟ۨ۬ۙۡ۠ۦۘۦ۫ۤ"
            goto L_0x0022
        L_0x00d3:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            r0 = r29
            r1.addMovement(r0)
            java.lang.String r1 = "ۜۛ۟ۥۜۘۘۢۧۙ۟ۗ۠ۖ۟ۦۘۗۛۤۚۙۖ۬ۨۧ۬ۚ۫"
            goto L_0x0022
        L_0x00e0:
            r25 = 523441048(0x1f331398, float:3.7920932E-20)
            java.lang.String r1 = "ۘۛۙۥ۟ۡۘ۬ۥ۫ۤ۫ۗۖۖ"
        L_0x00e5:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -834506083: goto L_0x00f5;
                case -471326930: goto L_0x00ef;
                case 245013940: goto L_0x0857;
                case 567572069: goto L_0x00fe;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            goto L_0x00e5
        L_0x00ef:
            java.lang.String r1 = "ۦۢۘ۠ۛۤۚۛۖۥ۠۠۟۫ۘۘۨۥۡۘ"
            goto L_0x00e5
        L_0x00f2:
            java.lang.String r1 = "ۙۜۘۜ۟ۦۘ۬ۘ۬ۖۗ۬ۤۚۗ"
            goto L_0x00e5
        L_0x00f5:
            boolean r1 = r24.isRunning()
            if (r1 == 0) goto L_0x00f2
            java.lang.String r1 = "ۚ۫ۖۘۨ۠ۗ۬۠ۜۘۗۙۥۦۢۨۘۚۙ۫۬ۢۥ"
            goto L_0x00e5
        L_0x00fe:
            java.lang.String r1 = "ۤ۬ۗۥۥۦۘ۟ۚ۫ۗۘۘ۫۫ۨۤ۠ۡۡۡۚۥۙ۠"
            goto L_0x0022
        L_0x0102:
            int r19 = r29.getAction()
            java.lang.String r1 = "ۥۘ۠ۙۤۧۤ۠ۜۘۛۛۦۚۥۨۘ"
            goto L_0x0022
        L_0x010a:
            r25 = 936552714(0x37d2a90a, float:2.5112666E-5)
            java.lang.String r1 = "۟ۛۛ۠ۧۘۘ۫۫ۗ۟ۥۘۢۤۥ۟ۜ۠"
        L_0x010f:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1471955759: goto L_0x0119;
                case 802582475: goto L_0x0120;
                case 873127216: goto L_0x0877;
                case 1564539739: goto L_0x0125;
                default: goto L_0x0118;
            }
        L_0x0118:
            goto L_0x010f
        L_0x0119:
            java.lang.String r1 = "ۛ۠ۢۖۜۖۘۧۚۘۗۡۧۜ۠ۡۧۡۧۘ"
            goto L_0x0022
        L_0x011d:
            java.lang.String r1 = "ۛۛۡۘۗۢ۫ۦۜۜۚۤۢ۟۫۟۬ۡۗۘ۠۬"
            goto L_0x010f
        L_0x0120:
            if (r19 == 0) goto L_0x011d
            java.lang.String r1 = "۟ۦۦۥۨۘۡۛۘ۠ۜۙۤۢۦۨۘ۠ۘ۬"
            goto L_0x010f
        L_0x0125:
            java.lang.String r1 = "ۦۧۡۘ۫ۢ۟ۦۥۧۘۨ۟۬ۙۢۘۚۢۥۘۜۢۘۘ"
            goto L_0x010f
        L_0x0128:
            r25 = 2129689360(0x7ef07b10, float:1.5982685E38)
            java.lang.String r1 = "ۡ۬ۖۘۧۡۖۗۡۦۘۨۤۦ۬ۥۜۗۛۜۖۙۢ۬ۦۘ"
        L_0x012d:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1317339261: goto L_0x0137;
                case -1086255939: goto L_0x0145;
                case -884197084: goto L_0x086b;
                case -745153672: goto L_0x0142;
                default: goto L_0x0136;
            }
        L_0x0136:
            goto L_0x012d
        L_0x0137:
            r1 = 1
            r0 = r19
            if (r0 == r1) goto L_0x013f
            java.lang.String r1 = "۠ۙۦۦ۟ۥۘۗۙۖۚۢۖ۬ۡ"
            goto L_0x012d
        L_0x013f:
            java.lang.String r1 = "ۢۤۘۘۜۢۜۖۦۧ۬ۦ۬ۢۢۘۡۥۘۥۤۖۘ۟۫۬"
            goto L_0x012d
        L_0x0142:
            java.lang.String r1 = "ۥۦۨۘۨۧۥۥۧۦۘۛۛۦۤۜۘۖۛۖۘۗۡۡ"
            goto L_0x012d
        L_0x0145:
            java.lang.String r1 = "ۨ۟ۚۜۚ۟۫ۜ۬۬ۖۧۤۛۘۘۘۡۤۦۚۨ"
            goto L_0x0022
        L_0x0149:
            r25 = 714174228(0x2a916f14, float:2.583425E-13)
            java.lang.String r1 = "۬ۥۤ۟ۛ۠ۗۨۧۘۥ۠ۘ۫۟ۜۡۤۧ"
        L_0x014e:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1634247895: goto L_0x0163;
                case 173946922: goto L_0x0158;
                case 551919452: goto L_0x085b;
                case 1235130431: goto L_0x0166;
                default: goto L_0x0157;
            }
        L_0x0157:
            goto L_0x014e
        L_0x0158:
            r1 = 2
            r0 = r19
            if (r0 == r1) goto L_0x0160
            java.lang.String r1 = "ۘۜۧۧ۬ۥۘۖۦۦ۟ۦۖۘ۫ۛۨۘ۟ۤۜ۫ۤ۫۬ۖۦۚ۟۟"
            goto L_0x014e
        L_0x0160:
            java.lang.String r1 = "ۨۛ۫ۢۤۤۛۦۦۘ۬۟ۜۗۡۜۘۡۨۨ۬ۛۥۘ۫ۨ۠"
            goto L_0x014e
        L_0x0163:
            java.lang.String r1 = "ۡۜۘۘۧ۟ۦۙۢۘۘۦۙۧۤ۬ۘۖۚۧ"
            goto L_0x014e
        L_0x0166:
            java.lang.String r1 = "ۘۨۧۘۡۗۚ۬۟ۡۘۤۦۢۛۛ۠ۘۨۦۘ"
            goto L_0x0022
        L_0x016a:
            r25 = 319598368(0x130caf20, float:1.7756828E-27)
            java.lang.String r1 = "۬۬ۛۚۗۘۨۧۚۜۗۗۨۙۖ"
        L_0x016f:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -292449692: goto L_0x0180;
                case -159105568: goto L_0x0179;
                case 1144261264: goto L_0x0188;
                case 1419147778: goto L_0x086b;
                default: goto L_0x0178;
            }
        L_0x0178:
            goto L_0x016f
        L_0x0179:
            java.lang.String r1 = "ۨۤ۟۫ۤۢۧۛۨۘ۫ۧۛۙۦ۠ۢۚۖۘ"
            goto L_0x0022
        L_0x017d:
            java.lang.String r1 = "ۖ۟ۦۘۛۜۛۥۡ۬ۧۖۥۘۛۚۨۘ"
            goto L_0x016f
        L_0x0180:
            r1 = 3
            r0 = r19
            if (r0 == r1) goto L_0x017d
            java.lang.String r1 = "ۛ۬۬۟ۙۛ۫ۥۥ۫ۦۘ۬ۚۖ"
            goto L_0x016f
        L_0x0188:
            java.lang.String r1 = "ۡۤۢۨ۠ۡۘ۠ۦ۫ۜۗۜۘۦۛۖۘۧۥ۟ۢۛۘ۟ۧۛۥ۬ۗ"
            goto L_0x016f
        L_0x018b:
            r25 = -261310199(0xfffffffff06cb909, float:-2.9304862E29)
            java.lang.String r1 = "ۨۘۘۘۧۗۨۘۖۚۚۖۢۧ۟۫ۗ۟ۥۨۘ"
        L_0x0190:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -2145946459: goto L_0x01a1;
                case -1847505898: goto L_0x085f;
                case 63898647: goto L_0x019a;
                case 1579431699: goto L_0x01b2;
                default: goto L_0x0199;
            }
        L_0x0199:
            goto L_0x0190
        L_0x019a:
            java.lang.String r1 = "ۥۤۚۤۚۖۘۗۥۘۡۛۙۘۤۙ"
            goto L_0x0022
        L_0x019e:
            java.lang.String r1 = "ۤۖۨ۠۫ۖ۬ۛۧۥۘۧ۟۠ۙۢۘۖۘ"
            goto L_0x0190
        L_0x01a1:
            float r1 = r29.getRawX()
            r0 = r28
            float r0 = r0.f1256e
            r26 = r0
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 >= 0) goto L_0x019e
            java.lang.String r1 = "ۜۜۥۘۚ۠۬ۥۦۜۘ۠۠ۨۥ۠ۗۚۗۡۡۚۙۚۢۧۢۡۘ"
            goto L_0x0190
        L_0x01b2:
            java.lang.String r1 = "ۥۧۨۖۗۢۜۦۡۤ۬ۜۘۚۜ۠"
            goto L_0x0190
        L_0x01b5:
            r18 = 1
            java.lang.String r1 = "۠ۖ۟ۦ۟۫ۙۚۥۛۤ۫ۡ۠ۨ۬ۢۢۢ۠ۛۤۥۜۘۡ۬ۦۘ"
            goto L_0x0022
        L_0x01bb:
            java.lang.String r1 = "ۙۜۦۘۖ۠ۜۨ۫ۙۜۛۜۘ۫ۢۦۖۡ"
            r17 = r18
            goto L_0x0022
        L_0x01c1:
            r16 = 0
            java.lang.String r1 = "ۚۧۘۘۘۗۥۚ۫ۦۢۙۛۛۡۘۘ۟۬ۛ"
            goto L_0x0022
        L_0x01c7:
            java.lang.String r1 = "ۡۚۡ۠ۤۦۘۥۨۘۘ۬۬ۘۜۘۨ"
            r17 = r16
            goto L_0x0022
        L_0x01cd:
            r25 = 2113600408(0x7dfafb98, float:4.1701669E37)
            java.lang.String r1 = "ۦۢۡۡۦۘۘۗۘ۫ۥ۟ۛ۠ۘۡۤۧۢۧۢۚۥۖۥۘۜۡۦۘ"
        L_0x01d2:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1588641248: goto L_0x0243;
                case -1489377701: goto L_0x01e3;
                case -412620804: goto L_0x01ec;
                case 141389678: goto L_0x01dc;
                default: goto L_0x01db;
            }
        L_0x01db:
            goto L_0x01d2
        L_0x01dc:
            java.lang.String r1 = "۟ۗۦۡ۫ۗۙۙۗۙۖۘۚۘۜۤۙۨۘ۠۟ۚ"
            goto L_0x0022
        L_0x01e0:
            java.lang.String r1 = "ۛ۟ۚۨ۠ۜۘۢ۠ۦ۬ۜ۠ۛۧ۟۠۫ۥۘۜۛۖ"
            goto L_0x01d2
        L_0x01e3:
            r0 = r28
            boolean r1 = r0.f1255d
            if (r1 != 0) goto L_0x01e0
            java.lang.String r1 = "ۛۘ۠۟۠۬ۢۤۘۘۚۚۤ۟ۘۗ"
            goto L_0x01d2
        L_0x01ec:
            java.lang.String r1 = "ۧۗۤۘۗ۫ۨۦۡۡۢۖ۟۫"
            goto L_0x01d2
        L_0x01ef:
            float r1 = r29.getRawX()
            r0 = r28
            float r15 = r0.f1256e
            float r1 = r1 - r15
            float r15 = java.lang.Math.abs(r1)
            java.lang.String r1 = "ۘ۬۟۬ۚۦۨۛۢۖۢ۬۫ۦۡۘ۠۟ۢۥۥ۬ۤۨۜ۫ۦۨ"
            goto L_0x0022
        L_0x0200:
            float r1 = r29.getRawY()
            r0 = r28
            float r14 = r0.f1257f
            float r1 = r1 - r14
            float r14 = java.lang.Math.abs(r1)
            java.lang.String r1 = "ۧ۬ۗ۫ۖۖۙ۠ۜۘۗۚ۬ۗۖۗ"
            goto L_0x0022
        L_0x0211:
            r25 = 1349959083(0x5076bdab, float:1.65585009E10)
            java.lang.String r1 = "۫ۗۗ۫۬ۨۖ۬ۡۘ۟۫ۛۗ۬ۦۘۥ۟۬ۛ۬ۨ۫۠ۖۘ"
        L_0x0216:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -43045515: goto L_0x0243;
                case 322262882: goto L_0x0220;
                case 519417410: goto L_0x0226;
                case 1168902169: goto L_0x0230;
                default: goto L_0x021f;
            }
        L_0x021f:
            goto L_0x0216
        L_0x0220:
            java.lang.String r1 = "۠۟ۜۘۘۥۖۢ۫ۖۢ۫ۗۛۙۨۗۜۦۦۘۨۙۨۜۡۖ"
            goto L_0x0216
        L_0x0223:
            java.lang.String r1 = "ۢۙۖۘۙۗۢۘۚ۠ۨۘۖۙۤ"
            goto L_0x0216
        L_0x0226:
            r0 = r22
            float r1 = (float) r0
            int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0223
            java.lang.String r1 = "ۧۦ۬ۖۡۛۧۛۖۘۦۖ۟ۧ۬ۤ"
            goto L_0x0216
        L_0x0230:
            java.lang.String r1 = "ۛۧۘۘۨۘۘۜۤۡۘۚۖۜۘۢۘ"
            goto L_0x0022
        L_0x0234:
            r25 = -940425004(0xffffffffc7f240d4, float:-124033.66)
            java.lang.String r1 = "ۨ۫۫ۙۡۥۘۡ۟ۗۜۡۧۘۚۧۖ"
        L_0x0239:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -2138645207: goto L_0x024a;
                case -715742804: goto L_0x0251;
                case 397670549: goto L_0x0243;
                case 1704012718: goto L_0x0254;
                default: goto L_0x0242;
            }
        L_0x0242:
            goto L_0x0239
        L_0x0243:
            java.lang.String r1 = "ۘۤۥۘۢ۠۫۠ۢۘۘۙۤۧۨۥۘۘۖۢۥۧۘۧۘۨۙۘۘ۟ۢۦۘ"
            goto L_0x0022
        L_0x0247:
            java.lang.String r1 = "ۦۧۦۧۘۦۘۖۧۖۤۖ۫ۥۦۘ۬ۢۨ۠ۘۦۘۛ۟ۦ"
            goto L_0x0239
        L_0x024a:
            int r1 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0247
            java.lang.String r1 = "ۖۤ۫ۦۧ۫۬ۧ۬۫ۧۨۡۡۦۘۡۢ۫ۤۗ۬ۚۧۖۘ"
            goto L_0x0239
        L_0x0251:
            java.lang.String r1 = "ۜ۠۟ۤۜ۟ۗۦۖ۟ۥ۠ۨۛۙۥ۟ۛ"
            goto L_0x0239
        L_0x0254:
            java.lang.String r1 = "ۛۛ۫ۚ۫ۨۦۦۘۘ۠ۦۚ۫ۗۖۘۦۢۦۘۗۗۙۢۚ۬ۘۨۖ"
            goto L_0x0022
        L_0x0258:
            r25 = 332385032(0x13cfcb08, float:5.245435E-27)
            java.lang.String r1 = "۟ۗۙۡۙۡ۬۫ۖۥ۟ۜۘۡ۠ۢۙۚۨۙۗۦۘۥۤ۠۫ۡۛ"
        L_0x025d:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1340213885: goto L_0x0267;
                case -745224363: goto L_0x026e;
                case 894350910: goto L_0x0280;
                case 1381078630: goto L_0x0243;
                default: goto L_0x0266;
            }
        L_0x0266:
            goto L_0x025d
        L_0x0267:
            java.lang.String r1 = "ۜ۫۫ۥۗ۠ۡۧۨۘۡۨۖۘۗۙۦۖۗۧ"
            goto L_0x0022
        L_0x026b:
            java.lang.String r1 = "ۡ۠۟ۛۥۡۚۢۘۘ۬ۚ۟ۡۥۧۤۘ۬ۡۤۙۘۥۦۘ"
            goto L_0x025d
        L_0x026e:
            r0 = r28
            float r1 = r0.f1256e
            int r26 = f1251l
            r0 = r26
            float r0 = (float) r0
            r26 = r0
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 <= 0) goto L_0x026b
            java.lang.String r1 = "ۜ۫ۦ۠ۥۘۤۛ۟ۦۛۖۘۛۥۨۛۖۖۢۘ۬"
            goto L_0x025d
        L_0x0280:
            java.lang.String r1 = "ۨۤۖۧ۠ۡۘۡ۟ۜۘۘۥۗۖۘۦۗ۫ۧۗۢۚۥۘۗ۠ۡ"
            goto L_0x025d
        L_0x0283:
            r1 = 1
            r0 = r28
            r0.f1255d = r1
            java.lang.String r1 = "ۘۤۥۘۢ۠۫۠ۢۘۘۙۤۧۨۥۘۘۖۢۥۧۘۧۘۨۙۘۘ۟ۢۦۘ"
            goto L_0x0022
        L_0x028c:
            r25 = -1138797843(0xffffffffbc1f52ed, float:-0.009724361)
            java.lang.String r1 = "۫ۡ۟ۗ۬۟۠ۗۡۘۜۤۜۘۛۡ۟۟ۜۖۘ۬ۧ۬"
        L_0x0291:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1230356261: goto L_0x029b;
                case 102520627: goto L_0x02aa;
                case 1108065537: goto L_0x02a1;
                case 2089322323: goto L_0x0867;
                default: goto L_0x029a;
            }
        L_0x029a:
            goto L_0x0291
        L_0x029b:
            java.lang.String r1 = "ۖۢۖۘ۫ۢۥۘۘۗۥۨۜۤۜ۬ۤۥۜۥ۟ۙۨ۬ۧۚ۠ۚۥ"
            goto L_0x0291
        L_0x029e:
            java.lang.String r1 = "ۥۧۙۜۛۗۦۙۨۘ۫ۧۤۨۜۤۗۢۥۘۚۜ۟ۚۥۘۘ"
            goto L_0x0291
        L_0x02a1:
            r0 = r28
            boolean r1 = r0.f1255d
            if (r1 == 0) goto L_0x029e
            java.lang.String r1 = "ۖۖ۟ۗۢۜۘۡۧ۬ۘۖۡۘ۫ۚۚ"
            goto L_0x0291
        L_0x02aa:
            java.lang.String r1 = "ۘ۠ۘۥۜۧ۠۫ۙۙۧۘۘۧۛۥۘۦۖۥۘ"
            goto L_0x0022
        L_0x02ae:
            r25 = -1821369608(0xffffffff93701af8, float:-3.0305555E-27)
            java.lang.String r1 = "ۥۖۨۚۗۦۘ۟۬ۢ۠ۚۚۜۚۗۗۖۘۜۨۖۧ۬ۖۙ۫ۥ"
        L_0x02b3:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -2087829022: goto L_0x02c9;
                case -1148361216: goto L_0x0867;
                case 132534467: goto L_0x02c4;
                case 1031719156: goto L_0x02bd;
                default: goto L_0x02bc;
            }
        L_0x02bc:
            goto L_0x02b3
        L_0x02bd:
            java.lang.String r1 = "ۢۤ۠ۨۚۜۘۧۚۚۥ۠۬ۚۧۦۘۡۜۖ"
            goto L_0x0022
        L_0x02c1:
            java.lang.String r1 = "ۤۚۤۙۜۥۘۦۨۖۨۤۤۙۡ۟ۚۢۢۜ۫ۛۚۘۨۖ۠ۛ"
            goto L_0x02b3
        L_0x02c4:
            if (r17 == 0) goto L_0x02c1
            java.lang.String r1 = "۬ۙ۬۟ۦۨۘۜۗۤ۟ۢۘۘ۬ۖ۟ۤۜۘۘۗ۫ۥ"
            goto L_0x02b3
        L_0x02c9:
            java.lang.String r1 = "۟ۘ۟ۘۦ۫ۢۙۛۙ۟ۘۢۨۖۘ۠ۨ۫ۖ۫ۗ"
            goto L_0x02b3
        L_0x02cc:
            float r1 = r29.getRawX()
            r0 = r28
            float r0 = r0.f1256e
            r25 = r0
            float r1 = r1 - r25
            float r1 = java.lang.Math.abs(r1)
            int r1 = (int) r1
            int r1 = -r1
            r0 = r28
            r0.b(r1)
            java.lang.String r1 = "ۤۚۡۨۤۛۨ۟ۡۘۧۧۡۚۡۛۙ۟ۦۘ"
            goto L_0x0022
        L_0x02e7:
            float r1 = r29.getRawX()
            r0 = r28
            r0.a(r1)
            java.lang.String r1 = "۟ۡۘ۬۟ۥۘۖ۬ۦۘۗ۫ۚ۠ۜ۫ۨ۬ۥۘ"
            goto L_0x0022
        L_0x02f4:
            r1 = 0
            r0 = r28
            r0.b(r1)
            java.lang.String r1 = "ۜۘۡۘۡ۫ۧۥۥۦۘۡۛۨۘ۠ۗۖ"
            goto L_0x0022
        L_0x02fe:
            r0 = r28
            float r1 = r0.f1256e
            float r13 = r29.getRawX()
            float r1 = r1 - r13
            int r13 = (int) r1
            java.lang.String r1 = "ۦ۬ۦۛ۫ۘۤۡۘۘۡۘ۟ۤۦ۬ۚۗۦۥۡۘ"
            goto L_0x0022
        L_0x030c:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            r25 = 1000(0x3e8, float:1.401E-42)
            r0 = r25
            r1.computeCurrentVelocity(r0)
            java.lang.String r1 = "۬ۤۡ۠ۦۡۘۨۘۘۚ۫ۖۘۨۡۡۢ۟"
            goto L_0x0022
        L_0x031b:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            r12 = -1
            float r12 = r1.getXVelocity(r12)
            java.lang.String r1 = "ۘ۬ۙۖۦۜۘۧۜ۫۫ۖۥۤۖۘ۠ۙۙ"
            goto L_0x0022
        L_0x0328:
            r25 = 1427250489(0x55121d39, float:1.0040888E13)
            java.lang.String r1 = "۟۬ۦ۬ۜۜۙۙۥۘۖۜۤۗۦۘ"
        L_0x032d:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1849062198: goto L_0x0346;
                case 1041333032: goto L_0x033d;
                case 1142131912: goto L_0x0337;
                case 1516814832: goto L_0x0359;
                default: goto L_0x0336;
            }
        L_0x0336:
            goto L_0x032d
        L_0x0337:
            java.lang.String r1 = "ۢ۫۬ۖۢۨۘۧۢۡۡۥۧۧۗۦۗۧۘۢۥۘۡۦ۠ۜ۫ۖ"
            goto L_0x032d
        L_0x033a:
            java.lang.String r1 = "ۦ۫۫ۤۛۥۘ۠ۢ۫ۢۤۖۗ۬۟ۖۗۨۥۨۘ۟ۘ۟"
            goto L_0x032d
        L_0x033d:
            r0 = r28
            boolean r1 = r0.f1255d
            if (r1 == 0) goto L_0x033a
            java.lang.String r1 = "ۛۘ۠۠۬ۜۘۖ۠ۧ۟ۗ۬ۚۜۧۚۖۡۚۜۜۘ۫۠ۜۘ"
            goto L_0x032d
        L_0x0346:
            java.lang.String r1 = "ۘۘۡۘۛۚۛۢ۠ۦۘ۠ۗ۫ۘۤۖۘۥۥۖ"
            goto L_0x0022
        L_0x034a:
            r25 = 46687713(0x2c865e1, float:2.9445834E-37)
            java.lang.String r1 = "۠ۤۖۘۧۤ۠۬۟ۢۧۧۡۛۡۨۘ۫ۢۜۦۥۥۘ۟ۤۦۘۢ۟ۙ"
        L_0x034f:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1328949504: goto L_0x036d;
                case -578919218: goto L_0x0359;
                case -196966638: goto L_0x0360;
                case 984919708: goto L_0x0370;
                default: goto L_0x0358;
            }
        L_0x0358:
            goto L_0x034f
        L_0x0359:
            java.lang.String r1 = "ۙۖۡۘۘۘۧ۠۬ۦۘۚ۬۠۬ۡۧ"
            goto L_0x0022
        L_0x035d:
            java.lang.String r1 = "ۥۨۚۖۚ۬۠۬ۘۘۖ۫ۘۦۧۖ"
            goto L_0x034f
        L_0x0360:
            float r1 = r21.getTranslationX()
            r26 = 0
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 > 0) goto L_0x035d
            java.lang.String r1 = "ۖۖۨۚۦۙۛۚۤۥۢۨۘ۬ۦ۟ۧ۬ۖۘۡۜۡ۠ۗ۟"
            goto L_0x034f
        L_0x036d:
            java.lang.String r1 = "ۙ۬ۥۘۨۜۥۥۡۡۘۥۡۘۘ۬ۙ۟ۢۤۖۘۛۘۘۘۡۦۜۤۡۘ"
            goto L_0x034f
        L_0x0370:
            java.lang.String r1 = "ۙۛۗ۬۫ۧ۟ۧ۬ۤۨۢۖۘ۬"
            goto L_0x0022
        L_0x0374:
            r25 = -437796613(0xffffffffe5e7c0fb, float:-1.36803315E23)
            java.lang.String r1 = "ۘۡۦۢۘۥۘۚۨ۠۫۟ۘۘۛ۬۬۬ۦۥۘ"
        L_0x0379:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -740624269: goto L_0x038a;
                case -427836646: goto L_0x0383;
                case 51318253: goto L_0x0396;
                case 1831240415: goto L_0x0393;
                default: goto L_0x0382;
            }
        L_0x0382:
            goto L_0x0379
        L_0x0383:
            java.lang.String r1 = "۠ۨۦۘۤۜۨۗۨۘۘۖۡۥۘۥۛ۟ۛۛۤ۠ۧۘۤۖ"
            goto L_0x0022
        L_0x0387:
            java.lang.String r1 = "ۤۢۢۗۨۜۢ۟ۥۗۖۘ۠ۦ۟"
            goto L_0x0379
        L_0x038a:
            r1 = 1148846080(0x447a0000, float:1000.0)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0387
            java.lang.String r1 = "ۤۧۦ۟ۤ۟۫ۛ۬۠ۚ۟ۚۗۥ۟۠ۨۦۜۗۢۗۛ"
            goto L_0x0379
        L_0x0393:
            java.lang.String r1 = "ۨ۠ۘۨۤ۬۬ۧ۟ۧۖۖۘۥۥۘۢۨ۫ۗۢۡ۬ۧۖۘۗۦۦ"
            goto L_0x0379
        L_0x0396:
            java.lang.String r1 = "ۢۢۘۨ۬۟۫۟ۜ۟ۥۘ۠ۖ۬"
            goto L_0x0022
        L_0x039a:
            r25 = 671847389(0x280b93dd, float:7.748113E-15)
            java.lang.String r1 = "ۘۧۢۛۙۢ۫ۤۖ۠ۢۖۛۛۦۘ"
        L_0x039f:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1877089657: goto L_0x03a9;
                case -105992331: goto L_0x03b6;
                case 732047876: goto L_0x086f;
                case 2020110842: goto L_0x03b3;
                default: goto L_0x03a8;
            }
        L_0x03a8:
            goto L_0x039f
        L_0x03a9:
            int r1 = r20 / 4
            if (r13 < r1) goto L_0x03b0
            java.lang.String r1 = "۫۬۫۬ۜۘۧۗۥۛۗۜۦۢۥۘۖۛۨۨۥۘۙۘۖ"
            goto L_0x039f
        L_0x03b0:
            java.lang.String r1 = "ۦۗۡۘۤۨۦۗۥۨۘۚۦ۠۟ۦۙ۠ۘۦۘۢۙۖۘ"
            goto L_0x039f
        L_0x03b3:
            java.lang.String r1 = "۠ۗۤۖۜۧۘ۬ۗ۟ۖۡۚۧ۟ۖۘۧۦ۠"
            goto L_0x039f
        L_0x03b6:
            java.lang.String r1 = "ۧۡۦۗ۫ۖۖۨۘۡ۠ۚۙۖۖۨۨۘۜۥۘۧۛ۠ۚۜ"
            goto L_0x0022
        L_0x03ba:
            r1 = 2
            int[] r1 = new int[r1]
            r25 = 0
            float r26 = r29.getRawX()
            r0 = r26
            int r0 = (int) r0
            r26 = r0
            r1[r25] = r26
            r25 = 1
            r26 = 0
            r1[r25] = r26
            r0 = r24
            r0.setIntValues(r1)
            java.lang.String r1 = "ۜۛۨ۬ۘ۫ۜۗۘۘۚ۫ۥۖۛۤ"
            goto L_0x0022
        L_0x03d9:
            r1 = 2
            int[] r1 = new int[r1]
            r25 = 0
            float r26 = r29.getRawX()
            r0 = r26
            int r0 = (int) r0
            r26 = r0
            r1[r25] = r26
            r25 = 1
            r1[r25] = r20
            r0 = r24
            r0.setIntValues(r1)
            java.lang.String r1 = "ۥ۬ۢۢۛۥۧۚۜۘۦ۬ۚۧ۫ۥۘۤۗۤ۟ۛۜۘ"
            goto L_0x0022
        L_0x03f6:
            r24.start()
            java.lang.String r1 = "ۥ۫ۧۖ۫ۜۨ۬ۜۘۨۜ۬۠ۚۘۨ۫۟"
            goto L_0x0022
        L_0x03fd:
            r1 = 0
            r0 = r28
            r0.f1255d = r1
            java.lang.String r1 = "ۙۖۡۘۘۘۧ۠۬ۦۘۚ۬۠۬ۡۧ"
            goto L_0x0022
        L_0x0406:
            r1 = 0
            r0 = r28
            r0.f1256e = r1
            java.lang.String r1 = "۬ۡۢۥۦۗۚ۠ۜۤۗۥ۫ۥۧ۬۠ۙۘۘ"
            goto L_0x0022
        L_0x040f:
            r1 = 0
            r0 = r28
            r0.f1257f = r1
            java.lang.String r1 = "ۡۤۡۜۘۦۘۢۢۙۙۗۥۢۥ۫۬۬ۡۜ۟ۛۗۙۧ"
            goto L_0x0022
        L_0x0418:
            r0 = r28
            android.view.VelocityTracker r11 = r0.f1262k
            java.lang.String r1 = "ۜۢۖ۬ۘۜۘۧۙۚ۠ۜۨۘۘۜۨۗۤۨۛۚۜۤۖۖۘ"
            goto L_0x0022
        L_0x0420:
            r25 = -1799882587(0xffffffff94b7f8a5, float:-1.8576351E-26)
            java.lang.String r1 = "ۨۦۗ۫۫۬۟۫ۛۧ۟ۨۘۡۡۤۨ"
        L_0x0425:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1695938456: goto L_0x043b;
                case -1652600223: goto L_0x042f;
                case 575227405: goto L_0x0436;
                case 2099247247: goto L_0x087b;
                default: goto L_0x042e;
            }
        L_0x042e:
            goto L_0x0425
        L_0x042f:
            java.lang.String r1 = "ۧ۟۬ۢۛۢۙۧۡۗۨۦۖۧۗ۬ۛۦ۠ۥ۠ۗۡۢ۬ۡۜ"
            goto L_0x0022
        L_0x0433:
            java.lang.String r1 = "ۡۥۦۘۚۡ۠ۦ۬ۜۥۙ۟ۛ۟ۦ"
            goto L_0x0425
        L_0x0436:
            if (r11 == 0) goto L_0x0433
            java.lang.String r1 = "ۨۥۦۘۜۥ۫۫ۗ۬ۜۧ۠ۗۜۤ۬۫ۦۘۖۢۙۛ۠ۜۥ۠ۘۘ"
            goto L_0x0425
        L_0x043b:
            java.lang.String r1 = "ۖۧۤ۬ۜۖۛۛۨ۬ۥ۬ۛۘۡۤۛ۫ۘۘۦۥۥۘۙۜۧ"
            goto L_0x0425
        L_0x043e:
            r11.clear()
            java.lang.String r1 = "۬ۥۦۘۛۙۤۨ۫ۥۘۨۢ۟۟ۥۙ۟ۜۛۘۜۤ۠ۨۦ۬ۖۤ"
            goto L_0x0022
        L_0x0445:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            r1.recycle()
            java.lang.String r1 = "ۨۛۡۘۤ۫ۥۘۤ۠ۗۛ۬۠ۦۙ۬"
            goto L_0x0022
        L_0x0450:
            r1 = 0
            r0 = r28
            r0.f1262k = r1
            java.lang.String r1 = "ۤ۬ۗۜ۠ۢۦ۬ۗ۫ۥۖۘ۟ۨۜۢۡۘۖ۫ۛۧۜ۫"
            goto L_0x0022
        L_0x0459:
            float r1 = r29.getRawX()
            r0 = r28
            r0.f1256e = r1
            java.lang.String r1 = "ۘۤۜۢۤۜ۬ۤۜۘۙۥۢۢۛۛۖۘۧۦۗۦ"
            goto L_0x0022
        L_0x0465:
            float r1 = r29.getRawY()
            r0 = r28
            r0.f1257f = r1
            java.lang.String r1 = "ۧۘۥۘۚۧۘۗۦۘ۫ۦۘۘۗ۟۟ۤۨۗۚۧۤۗۡۖۘۡ۬ۜۘ"
            goto L_0x0022
        L_0x0471:
            r1 = 0
            r0 = r29
            r0.getPointerId(r1)
            java.lang.String r1 = "ۗ۬۬ۘۘۤۛۢۧۘۦۦۧۡۦۘ۫ۘ۬"
            goto L_0x0022
        L_0x047b:
            r1 = 0
            goto L_0x005a
        L_0x047e:
            r25 = -1513846270(0xffffffffa5c48a02, float:-3.4094098E-16)
            java.lang.String r1 = "ۤ۟۫ۖ۫ۤۧۤۙ۠ۨۧۘۚ۟ۘۛۥۜ"
        L_0x0483:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -467445801: goto L_0x0494;
                case -245212517: goto L_0x0883;
                case 196563703: goto L_0x048d;
                case 846659356: goto L_0x049d;
                default: goto L_0x048c;
            }
        L_0x048c:
            goto L_0x0483
        L_0x048d:
            java.lang.String r1 = "۠ۗۜۛۡۥۢۘۨۘ۠ۜۨ۬ۦۢ۠ۖ۟"
            goto L_0x0022
        L_0x0491:
            java.lang.String r1 = "ۙ۠ۤۨۗ۬ۨۡ۟۠ۚۖۥۨ"
            goto L_0x0483
        L_0x0494:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            if (r1 != 0) goto L_0x0491
            java.lang.String r1 = "۫ۨۨۡۧۘۧۙۤ۟۫ۜۘۖۚۨۜ۬ۨۤۥۘۨۗۨۙ۫ۙ"
            goto L_0x0483
        L_0x049d:
            java.lang.String r1 = "ۖ۟۫ۤۜۨۘۦ۬ۗۘۧۘۘۤۤ۫"
            goto L_0x0483
        L_0x04a0:
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0 = r28
            r0.f1262k = r1
            java.lang.String r1 = "ۧۡۧۦۜۥۘ۠ۗۛۨۥۡۘ۟ۥۦۡ۬ۗ"
            goto L_0x0022
        L_0x04ac:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            r0 = r29
            r1.addMovement(r0)
            java.lang.String r1 = "۟ۡۦۘ۠ۦۥۘۦۨۥۧۤۚۧۨۖۘۙ۟ۦۘۧۢۖ"
            goto L_0x0022
        L_0x04b9:
            r25 = 993174762(0x3b32a4ea, float:0.002725894)
            java.lang.String r1 = "ۙۦ۬ۖۢۦۖ۫۠۫۫ۧۨۘۡۘۙۗۨۘ۫ۥۖۘۨۛۢ"
        L_0x04be:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case 592472813: goto L_0x04cf;
                case 920701411: goto L_0x0887;
                case 1880591901: goto L_0x04d8;
                case 1950000815: goto L_0x04c8;
                default: goto L_0x04c7;
            }
        L_0x04c7:
            goto L_0x04be
        L_0x04c8:
            java.lang.String r1 = "ۥۛۖۘۤۙۨۘۧ۠ۗۙۡۚۛۘۜۘۖۙۜۘۤۗۘۧۗۡۘ"
            goto L_0x0022
        L_0x04cc:
            java.lang.String r1 = "ۡۙۥۜ۬ۧ۫ۜۨۙۡۘ۠ۖۜۛۨۜۚۦۧۘ"
            goto L_0x04be
        L_0x04cf:
            boolean r1 = r24.isRunning()
            if (r1 == 0) goto L_0x04cc
            java.lang.String r1 = "ۙ۠ۖۖ۫ۖۘۦۦۗۖۡۥۘۖۘۨ"
            goto L_0x04be
        L_0x04d8:
            java.lang.String r1 = "ۨۤۡۘۚۗۨۘ۬ۧۖۦۥ۟ۤۛۡ"
            goto L_0x04be
        L_0x04db:
            r1 = 1
            goto L_0x005a
        L_0x04de:
            int r10 = r29.getAction()
            java.lang.String r1 = "۫ۢۢۨۥۜۢۢۦۦۘۘۡۗۥۨۦ"
            goto L_0x0022
        L_0x04e6:
            r25 = -682477852(0xffffffffd75236e4, float:-2.31133195E14)
            java.lang.String r1 = "۠ۛ۠ۘۦۘ۫ۡۖۘۛ۫ۨۖ۬ۥ۟ۖ۫ۛۘۚۜۥ۫ۘ۟"
        L_0x04eb:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1986221240: goto L_0x04f5;
                case 190441227: goto L_0x04fd;
                case 772171243: goto L_0x0500;
                case 903077067: goto L_0x08a7;
                default: goto L_0x04f4;
            }
        L_0x04f4:
            goto L_0x04eb
        L_0x04f5:
            if (r10 == 0) goto L_0x04fa
            java.lang.String r1 = "ۗۜۦۡۙۧۧۢۜۘۖۜۛ۬ۧۡۨۨۥ"
            goto L_0x04eb
        L_0x04fa:
            java.lang.String r1 = "ۛ۠ۦۘۙ۠ۚۜۘۛۜۘۤۗۜ۠ۢۨۘۗ۬ۨۘۨۚۜۘ"
            goto L_0x04eb
        L_0x04fd:
            java.lang.String r1 = "ۖ۬ۛ۟ۢۖۘ۫۫ۚۘۗ۫۫ۢۗۜ۠۠ۛۙۥ"
            goto L_0x04eb
        L_0x0500:
            java.lang.String r1 = "ۤۖۦۜۗۨۘۤ۟ۡۘۥۙۜۜ۫۫۫ۢۤ۬ۛۜ"
            goto L_0x0022
        L_0x0504:
            r25 = 812284430(0x306a7a0e, float:8.5302154E-10)
            java.lang.String r1 = "ۚۤۥ۟ۖ۫ۖ۫ۨۘۤۦۤۦۥۥۖۤۦۨ۟ۘ۟ۨۦۘۗۢۡۘ"
        L_0x0509:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -2001905487: goto L_0x0513;
                case -1734985370: goto L_0x051a;
                case 540004034: goto L_0x0520;
                case 1010327268: goto L_0x0551;
                default: goto L_0x0512;
            }
        L_0x0512:
            goto L_0x0509
        L_0x0513:
            java.lang.String r1 = "ۙۙۛ۬ۦ۠ۗۚۨۜۘۘ۬ۨۜ۫ۥ"
            goto L_0x0022
        L_0x0517:
            java.lang.String r1 = "ۥۡ۫۫ۦۤۧۧۘۤۙۙۗۥۧۦۖۘۖۡۥۥۡۧۘۦ۬ۢ"
            goto L_0x0509
        L_0x051a:
            r1 = 1
            if (r10 == r1) goto L_0x0517
            java.lang.String r1 = "ۧ۠ۦۢۜۨۘۦۙۛۦ۠۠۟۠ۙۙۧۡۥۦۘۗۥۡۘ"
            goto L_0x0509
        L_0x0520:
            java.lang.String r1 = "۠ۙۧ۟۠ۨ۫۫ۜ۫ۖۛ۬۬۬"
            goto L_0x0509
        L_0x0523:
            r25 = 1648763317(0x624621b5, float:9.1372104E20)
            java.lang.String r1 = "ۜۢۗۨۡۙۗۖۧۤ۠۫ۦ۠ۥۘۧۙۙۘۢ"
        L_0x0528:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1873264597: goto L_0x088b;
                case -1510002885: goto L_0x0538;
                case -171863835: goto L_0x0532;
                case 97797414: goto L_0x053e;
                default: goto L_0x0531;
            }
        L_0x0531:
            goto L_0x0528
        L_0x0532:
            java.lang.String r1 = "۠ۜۤۘۖۗۢۙۜۘ۫ۗۡۛۤۖۘۧۚۢ"
            goto L_0x0528
        L_0x0535:
            java.lang.String r1 = "ۗۦۗ۫ۦۦۤۚ۟ۙۡۛ۫ۗۛ۫ۥۦۢۥ۠۬ۧ۬"
            goto L_0x0528
        L_0x0538:
            r1 = 2
            if (r10 == r1) goto L_0x0535
            java.lang.String r1 = "ۜۘۛۖۡۙۙۤۤۡ۠ۘۦۗۖۘۤۧ۫ۖ۠ۗ۫۠۬"
            goto L_0x0528
        L_0x053e:
            java.lang.String r1 = "ۤۗۖۗۘۦۘۦ۫ۥۥ۬ۡۚۘۘ"
            goto L_0x0022
        L_0x0542:
            r25 = -1332592206(0xffffffffb09241b2, float:-1.064157E-9)
            java.lang.String r1 = "ۗۤۙ۬ۨۖۛ۟ۧ۟ۗ۟ۦۜۦۘ"
        L_0x0547:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -936505388: goto L_0x0551;
                case -886479909: goto L_0x0561;
                case 296517098: goto L_0x055e;
                case 754665192: goto L_0x0558;
                default: goto L_0x0550;
            }
        L_0x0550:
            goto L_0x0547
        L_0x0551:
            java.lang.String r1 = "۟ۡۙ۟ۜۗ۟ۤۜۜۛۗۚۤۥۘ"
            goto L_0x0022
        L_0x0555:
            java.lang.String r1 = "ۡۛۥۘۛۙۙ۬ۨۡۘۛۡۦۘ۫۬ۧ۫ۙۨۘۦۦۨۥۢ۫ۖۧۨ"
            goto L_0x0547
        L_0x0558:
            r1 = 3
            if (r10 == r1) goto L_0x0555
            java.lang.String r1 = "۠ۗۦۘۡ۬ۙۗۘ۬ۙۖ۬۠ۘۗ۫ۜۤۘۜۙ"
            goto L_0x0547
        L_0x055e:
            java.lang.String r1 = "ۜۘۤ۫ۜ۬ۡۘ۬۟ۧۤۗ۟۫ۛۗۜۧۙ"
            goto L_0x0547
        L_0x0561:
            java.lang.String r1 = "ۢۡ۫ۨۖۗۚ۠ۙۢۛ۟ۦۢۥۘۜ۟ۥ"
            goto L_0x0022
        L_0x0565:
            r25 = -430757715(0xffffffffe65328ad, float:-2.4929242E23)
            java.lang.String r1 = "ۥۥۡۥۡ۬ۡ۠ۨۘۧۘ۫ۜۗۜۘۡۧۨۙۚۢ۫۟"
        L_0x056a:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -526342482: goto L_0x058b;
                case -43610357: goto L_0x0574;
                case 1112071607: goto L_0x088f;
                case 1622707228: goto L_0x0588;
                default: goto L_0x0573;
            }
        L_0x0573:
            goto L_0x056a
        L_0x0574:
            float r1 = r29.getRawX()
            r0 = r28
            float r0 = r0.f1256e
            r26 = r0
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 <= 0) goto L_0x0585
            java.lang.String r1 = "ۥۦۜۘ۠ۗۘۨۚۡۘۨۨۘۨۖۜۘۚۚۦ"
            goto L_0x056a
        L_0x0585:
            java.lang.String r1 = "ۨۢۘۘ۟ۦۥۘۙۘۥۘۜ۟ۘۗ۟ۙ۟ۗ"
            goto L_0x056a
        L_0x0588:
            java.lang.String r1 = "ۖۥۥۘۙۖۦۘۨۘۙۨۥۥ۠ۥۘ"
            goto L_0x056a
        L_0x058b:
            java.lang.String r1 = "ۧۚ۟۬۠ۖ۠ۨۧۘۦۦۘۘۛۖۧۘۗ۠ۦۘۨۖۘۦۧۢ"
            goto L_0x0022
        L_0x058f:
            r9 = 1
            java.lang.String r1 = "ۤ۠ۡۧۦۥۧۤۦۘۨ۠ۜۘۚۙۦۡ۟ۛ"
            goto L_0x0022
        L_0x0594:
            java.lang.String r1 = "۫ۡۨۡۨۨۘ۟ۖۧۤۨۤۛۨۘۖۦۢ"
            r8 = r9
            goto L_0x0022
        L_0x0599:
            r7 = 0
            java.lang.String r1 = "ۘۢۡۘۢۥۖۘۜۜۥۥۦۥۢۚۙۧۛۨۤۨۘ"
            goto L_0x0022
        L_0x059e:
            java.lang.String r1 = "ۛۧۦۘۧ۠۠ۤۙ۠ۗۤۖۥۛۥۢ۬ۖۘ۠۬ۘ۠ۚۤ۬ۙۢ"
            r8 = r7
            goto L_0x0022
        L_0x05a3:
            r25 = -2038695623(0xffffffff867bf939, float:-4.7390953E-35)
            java.lang.String r1 = "ۥۥۘ۟۬ۛ۬۟ۜۖۦۥ۟ۢۤۦ۫ۘۘۜ۠ۡ"
        L_0x05a8:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1786055228: goto L_0x05b2;
                case -607298336: goto L_0x05c5;
                case -292252800: goto L_0x05b9;
                case 1840325410: goto L_0x05c2;
                default: goto L_0x05b1;
            }
        L_0x05b1:
            goto L_0x05a8
        L_0x05b2:
            java.lang.String r1 = "ۦۜۨۘ۠۟ۖۛۤۖۘۜۡۦۘ۠ۧۥۜۗ۬ۜ۟ۖۡۛۙۢ۟ۘۘ"
            goto L_0x0022
        L_0x05b6:
            java.lang.String r1 = "ۡۙۘۗۦۘۘۡۨۖۘۜۥ۠ۡۛۢۗۦۘۡ۬ۘۘۦۚۜ"
            goto L_0x05a8
        L_0x05b9:
            r0 = r28
            boolean r1 = r0.f1255d
            if (r1 != 0) goto L_0x05b6
            java.lang.String r1 = "ۛۨۘۘ۠۠ۜۘۦ۫ۗۗۢۥۚۖۖۘۚ۠ۗۘ۟ۜۚۗۜۘ۟ۜۦۘ"
            goto L_0x05a8
        L_0x05c2:
            java.lang.String r1 = "۠ۦۖۘۤۙۖۢۥۜۘۥ۠ۛۖۦۡ۫ۧۚ۬ۖۘ"
            goto L_0x05a8
        L_0x05c5:
            java.lang.String r1 = "ۘۤۡۛۙۜۘۥۧۧۛۧ۟ۚۛۜ"
            goto L_0x0022
        L_0x05c9:
            float r1 = r29.getRawX()
            r0 = r28
            float r6 = r0.f1256e
            float r1 = r1 - r6
            float r6 = java.lang.Math.abs(r1)
            java.lang.String r1 = "ۙ۫ۨۥۙۚۙۥۖ۠ۨۡۘ۟ۨۘ"
            goto L_0x0022
        L_0x05da:
            float r1 = r29.getRawY()
            r0 = r28
            float r5 = r0.f1257f
            float r1 = r1 - r5
            float r5 = java.lang.Math.abs(r1)
            java.lang.String r1 = "ۘۛۖۛۙۖ۬ۨۗۥۨۨ۫۟۬ۧۚ۬ۜۘۨۚۡ"
            goto L_0x0022
        L_0x05eb:
            r25 = 1763622876(0x691ebfdc, float:1.1994769E25)
            java.lang.String r1 = "۟ۖۘۤۧۥۘۜۜۛۧۘۧۘۚۥۖ۠ۙۡۧۥۤ۫۠۟"
        L_0x05f0:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case 46285655: goto L_0x05b2;
                case 66432429: goto L_0x060a;
                case 94834289: goto L_0x0607;
                case 2141359899: goto L_0x05fa;
                default: goto L_0x05f9;
            }
        L_0x05f9:
            goto L_0x05f0
        L_0x05fa:
            r0 = r22
            float r1 = (float) r0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0604
            java.lang.String r1 = "ۘۢۢۤۖۘۢۤۤۧۡۛۙۚۨۚۙۦ"
            goto L_0x05f0
        L_0x0604:
            java.lang.String r1 = "ۧۦۦۘ۟ۘۗۧ۬ۘۘۜ۬۟ۜۤۜۢ۠ۖۧۛۥۘ۬۠ۚۜۖۥۘ"
            goto L_0x05f0
        L_0x0607:
            java.lang.String r1 = "ۛۧۚ۬ۖۘۛۦۦ۟ۥۘ۫۬ۚۧۖۢ"
            goto L_0x05f0
        L_0x060a:
            java.lang.String r1 = "ۜۡۨ۬ۖۖۘ۫ۨ۟ۖۜۡۘۙۡۥۜ۠ۖۘۤۤۗۘۘ"
            goto L_0x0022
        L_0x060e:
            r25 = -1745190556(0xffffffff97fa8164, float:-1.6188534E-24)
            java.lang.String r1 = "ۚۘۥۜ۟ۡۜۨۘۨۨۧۡۡۗۥۛۢ۠ۖ۬ۧۛۙ"
        L_0x0613:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1764028979: goto L_0x061d;
                case -1332801550: goto L_0x0623;
                case -40335784: goto L_0x05b2;
                case 714254184: goto L_0x062a;
                default: goto L_0x061c;
            }
        L_0x061c:
            goto L_0x0613
        L_0x061d:
            java.lang.String r1 = "۟ۥۡۘۚۛۡۢۦ۬ۢ۠ۗۧ۬ۥ"
            goto L_0x0613
        L_0x0620:
            java.lang.String r1 = "ۛۢۡۤۦۥۚۢۘۘۨ۬ۚۙۚۥۗۚۜۘ۫ۡۙ۫ۦۗۖۛۘۘ"
            goto L_0x0613
        L_0x0623:
            int r1 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0620
            java.lang.String r1 = "ۘۡۦۘ۠۠ۡۦۡۚ۟ۦۛ۫ۖۤۥۚۨۖۗۥۘ"
            goto L_0x0613
        L_0x062a:
            java.lang.String r1 = "ۜ۬ۨۘ۠ۘۥۦۥۦۘۖۤۙۘۢ۬"
            goto L_0x0022
        L_0x062e:
            r25 = 1376887453(0x5211a29d, float:1.56374614E11)
            java.lang.String r1 = "۠ۚۦۦۜۛۡۤۙۧۤۥ۬۫ۙۦ"
        L_0x0633:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1290532019: goto L_0x05b2;
                case -890563370: goto L_0x0655;
                case 1382711102: goto L_0x0652;
                case 1909625898: goto L_0x063d;
                default: goto L_0x063c;
            }
        L_0x063c:
            goto L_0x0633
        L_0x063d:
            r0 = r28
            float r1 = r0.f1256e
            int r26 = f1251l
            r0 = r26
            float r0 = (float) r0
            r26 = r0
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 >= 0) goto L_0x064f
            java.lang.String r1 = "ۡ۫۬ۘۥ۫۠ۛۗۘۗۖۘۤۤۨۘۖ۠ۢۘۤۖ"
            goto L_0x0633
        L_0x064f:
            java.lang.String r1 = "ۨ۟ۦۗۦۨۘۖۖۚۧۥۦۘۡ۟ۥۙۤ۬ۤ۟ۡ"
            goto L_0x0633
        L_0x0652:
            java.lang.String r1 = "ۤۦۦۘۢ۠ۦۗۦۜۤ۟ۨۘۙۦۧۙۧۦۨۦۥۚ۫ۡ"
            goto L_0x0633
        L_0x0655:
            java.lang.String r1 = "ۢۨۨۘۚۛۙۙۧۜۜۨ۫ۖۙۙۜۘۨۘۜۜ۟ۡۨ۬ۧۢ"
            goto L_0x0022
        L_0x0659:
            r1 = 1
            r0 = r28
            r0.f1255d = r1
            java.lang.String r1 = "ۦۜۨۘ۠۟ۖۛۤۖۘۜۡۦۘ۠ۧۥۜۗ۬ۜ۟ۖۡۛۙۢ۟ۘۘ"
            goto L_0x0022
        L_0x0662:
            r25 = -107261707(0xfffffffff99b50f5, float:-1.00806E35)
            java.lang.String r1 = "۠ۚۚۥۛۨۘۗۘۤۗۦۙۥۦۦۘۡۤ۬۫ۘۘۦۘ۟"
        L_0x0667:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1841634229: goto L_0x0897;
                case -1039160823: goto L_0x0681;
                case 106746379: goto L_0x0671;
                case 1058292286: goto L_0x0678;
                default: goto L_0x0670;
            }
        L_0x0670:
            goto L_0x0667
        L_0x0671:
            java.lang.String r1 = "ۗۛۤۗۚۜۥ۠ۛۙ۬۟ۗ۫ۥۘۢۤۙۤۙۘۘ۫۬ۧۘۤۤ"
            goto L_0x0022
        L_0x0675:
            java.lang.String r1 = "ۛۛ۠۫ۙۜۙۥۥۘ۟۬ۖۤۧ۬ۚۨۙ"
            goto L_0x0667
        L_0x0678:
            r0 = r28
            boolean r1 = r0.f1255d
            if (r1 == 0) goto L_0x0675
            java.lang.String r1 = "ۗ۬۫۠۫۠ۖۚۖۘۧ۠ۜۘۖۨۨۢۘۧۦ۠ۗ۬ۥۖۘ۠ۢۡۘ"
            goto L_0x0667
        L_0x0681:
            java.lang.String r1 = "ۧ۬ۨۡ۫ۘۙۖۨۘۘۛۥۘۤۤۨۘ"
            goto L_0x0667
        L_0x0684:
            r25 = 1706125702(0x65b16986, float:1.0472568E23)
            java.lang.String r1 = "ۥۗ۠ۨۦۛۛ۠۬ۛۧۨ۟ۙۥۘ۫ۤۨ"
        L_0x0689:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1827784576: goto L_0x069b;
                case -1195645672: goto L_0x0693;
                case -545263915: goto L_0x069e;
                case 2059709904: goto L_0x0897;
                default: goto L_0x0692;
            }
        L_0x0692:
            goto L_0x0689
        L_0x0693:
            if (r8 == 0) goto L_0x0698
            java.lang.String r1 = "۠ۤۗۖۖ۠ۖۜۨۘۖۥۥۘۙۖۛۖۚۧۨۗ۟"
            goto L_0x0689
        L_0x0698:
            java.lang.String r1 = "ۖۢۗ۫۠ۗۨۤۤ۟ۧۙۜۚۧۘ۠ۡۘۡۜۙ"
            goto L_0x0689
        L_0x069b:
            java.lang.String r1 = "ۤۥۨۘۧۛ۫ۥۖۧۘۤۡۨۦۥۦۘۢۖۛ"
            goto L_0x0689
        L_0x069e:
            java.lang.String r1 = "۬ۜۤۛۚۘۘۡۘۖۢۚۦۦ۬ۤۖ۠ۘ"
            goto L_0x0022
        L_0x06a2:
            float r1 = r29.getRawX()
            r0 = r28
            float r0 = r0.f1256e
            r25 = r0
            float r1 = r1 - r25
            float r1 = java.lang.Math.abs(r1)
            int r1 = (int) r1
            r0 = r28
            r0.b(r1)
            java.lang.String r1 = "ۦۙۨۘۜۤۜ۟ۢۗ۫۫۬ۧۥۧۘۤۗۘ۟ۡۘ"
            goto L_0x0022
        L_0x06bc:
            float r1 = r29.getRawX()
            r0 = r28
            r0.a(r1)
            java.lang.String r1 = "۠ۚۙۢۦۛ۟ۡ۬ۘ۬ۘۙۤۤ"
            goto L_0x0022
        L_0x06c9:
            r1 = 0
            r0 = r28
            r0.b(r1)
            java.lang.String r1 = "۬ۢۡۘ۠ۦۘۡۡۤ۟ۚۦۘ۫۫ۢۗۢ"
            goto L_0x0022
        L_0x06d3:
            float r1 = r29.getRawX()
            r0 = r28
            float r4 = r0.f1256e
            float r1 = r1 - r4
            int r4 = (int) r1
            java.lang.String r1 = "ۢۜ۫ۥۛۥۘۚۢۨۘ۠ۧۤۜۧۥۘۗۘ۬ۦۘۧۤۡ"
            goto L_0x0022
        L_0x06e1:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            r25 = 1000(0x3e8, float:1.401E-42)
            r0 = r25
            r1.computeCurrentVelocity(r0)
            java.lang.String r1 = "ۗ۫ۖۘۢۖۥۘۡۙۦۘۗ۬ۧۜۛۙۗۛۧۢۗ۬ۜۙۚ"
            goto L_0x0022
        L_0x06f0:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            r3 = -1
            float r3 = r1.getXVelocity(r3)
            java.lang.String r1 = "ۜۖۖۘۙۢۥۡۖ۠ۡۡۡۖۥۜۙ۫۫ۨ۠ۦۘ۫ۘۧۘ"
            goto L_0x0022
        L_0x06fd:
            r25 = -1406710760(0xffffffffac274c18, float:-2.3774368E-12)
            java.lang.String r1 = "ۚ۬ۛۧۡۡۘۦۧۚۙۤۥۘۛۛ۫"
        L_0x0702:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1138449305: goto L_0x070c;
                case -1122019687: goto L_0x08a3;
                case -1001372061: goto L_0x071b;
                case -826193738: goto L_0x0712;
                default: goto L_0x070b;
            }
        L_0x070b:
            goto L_0x0702
        L_0x070c:
            java.lang.String r1 = "ۘۛۦۘۢۙۚ۠ۦ۫ۛ۬۬ۦۨۦ۟ۜۘ"
            goto L_0x0702
        L_0x070f:
            java.lang.String r1 = "ۘ۠ۚۥۗۡۘۘۤۙۧۜۜۤۦۘ"
            goto L_0x0702
        L_0x0712:
            r0 = r28
            boolean r1 = r0.f1255d
            if (r1 == 0) goto L_0x070f
            java.lang.String r1 = "۠ۗۘۘۘۛۖۡۘۙۨۜۨۙۧۛ"
            goto L_0x0702
        L_0x071b:
            java.lang.String r1 = "ۜۘۥۘۚۘۖۘۡۨۨۢۨۖ۟ۚۙۗۙۧ"
            goto L_0x0022
        L_0x071f:
            r25 = -1554074159(0xffffffffa35eb5d1, float:-1.2073145E-17)
            java.lang.String r1 = "ۥۢۗ۬۬ۨۘۗ۫ۦۘۜۢۦۘۤۗۖۨۧۨۚ۟ۙۚ۫ۙۛ۬ۘ"
        L_0x0724:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1624523885: goto L_0x08a3;
                case -1115200491: goto L_0x0746;
                case -925000936: goto L_0x072e;
                case 1815772628: goto L_0x0735;
                default: goto L_0x072d;
            }
        L_0x072d:
            goto L_0x0724
        L_0x072e:
            java.lang.String r1 = "ۖ۫ۘۘۙ۬ۨۘ۬ۡۨۘۦۢۨۘۚۚۡۡۙۜۛۛۗ"
            goto L_0x0022
        L_0x0732:
            java.lang.String r1 = "ۖۦ۬ۥ۠ۤۙ۟۟ۦۜ۫۫ۨ۬۠ۙۚۡۤ۬ۚۡۗ"
            goto L_0x0724
        L_0x0735:
            float r1 = r21.getTranslationX()
            float r1 = java.lang.Math.abs(r1)
            r26 = 0
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r1 < 0) goto L_0x0732
            java.lang.String r1 = "ۢ۟۟۫۫ۛۦۡۥۘ۫ۚ۬ۤ۠ۧۖۜۨۘۗۦۚۦۖۙ۠ۛ"
            goto L_0x0724
        L_0x0746:
            java.lang.String r1 = "ۢۨۦۘۘۙۤۨۙۛۖۜۡۘۚۘۨ۠ۡۘ"
            goto L_0x0724
        L_0x0749:
            r25 = 2099049803(0x7d1cf54b, float:1.3039575E37)
            java.lang.String r1 = "ۜۦۥۘۤۘۥۘۛۡۜۘۜ۟ۜ۠ۗ۟"
        L_0x074e:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -2001300418: goto L_0x075f;
                case 377407554: goto L_0x076b;
                case 636475865: goto L_0x0768;
                case 1799252194: goto L_0x0758;
                default: goto L_0x0757;
            }
        L_0x0757:
            goto L_0x074e
        L_0x0758:
            java.lang.String r1 = "۟۠ۨ۠ۘۖۘۤ۟ۚۤۚۥۘۦۛۦۢۘۨ"
            goto L_0x0022
        L_0x075c:
            java.lang.String r1 = "۟۫ۡ۬ۙۖۜۘ۟ۧ۟ۧۚ۬ۡۘ"
            goto L_0x074e
        L_0x075f:
            r1 = 1148846080(0x447a0000, float:1000.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x075c
            java.lang.String r1 = "ۙ۫ۖۘۥۗۙۖۧ۟ۛ۫ۡۜۗۥۚۥۖۘ۟۫۠ۘۘۦۘۨ۫ۚ"
            goto L_0x074e
        L_0x0768:
            java.lang.String r1 = "۟ۨۖۜۘۜۧۖۥۜۥ۠ۢ۠ۡۘ"
            goto L_0x074e
        L_0x076b:
            java.lang.String r1 = "۟ۗۜۘۚۙۨۨۤۘۘۤۚۜۦۢۛ"
            goto L_0x0022
        L_0x076f:
            r25 = -1056814981(0xffffffffc102487b, float:-8.142695)
            java.lang.String r1 = "ۜۢ۬۬ۖۦۖۨۛ۬۟ۡۘۨۛۨۘۡۥ"
        L_0x0774:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1620012823: goto L_0x077e;
                case 45318427: goto L_0x089b;
                case 1351127999: goto L_0x0785;
                case 1992636402: goto L_0x078c;
                default: goto L_0x077d;
            }
        L_0x077d:
            goto L_0x0774
        L_0x077e:
            java.lang.String r1 = "ۖۥۡ۫۠ۡۘۢۥۥۜ۠ۖۘۧۧ۬ۚۙ۟ۗ۬ۜۘۧۖ۬"
            goto L_0x0022
        L_0x0782:
            java.lang.String r1 = "۫ۗ۟ۢۙۘۨۨۥۘۦ۠ۥۘۢۜۢۚ"
            goto L_0x0774
        L_0x0785:
            int r1 = r20 / 4
            if (r4 < r1) goto L_0x0782
            java.lang.String r1 = "ۢۗۢۘۢۗۥ۟ۖۘۢۗۧۢۚۗ"
            goto L_0x0774
        L_0x078c:
            java.lang.String r1 = "ۚۦ۫ۢۨۥۘ۫ۡۜۥۖۖۤۛ۠"
            goto L_0x0774
        L_0x078f:
            r1 = 2
            int[] r1 = new int[r1]
            r25 = 0
            float r26 = r29.getRawX()
            r0 = r26
            int r0 = (int) r0
            r26 = r0
            r1[r25] = r26
            r25 = 1
            r26 = 0
            r1[r25] = r26
            r0 = r24
            r0.setIntValues(r1)
            java.lang.String r1 = "ۙۖ۠۫ۖۘۚۤۖۘۦۢ۬ۤۘۥۤۧۚۘ۠۟ۖۡ۠ۚۖۖ"
            goto L_0x0022
        L_0x07ae:
            r1 = 2
            int[] r1 = new int[r1]
            r25 = 0
            float r26 = r29.getRawX()
            r0 = r26
            int r0 = (int) r0
            r26 = r0
            r1[r25] = r26
            r25 = 1
            r1[r25] = r20
            r0 = r24
            r0.setIntValues(r1)
            java.lang.String r1 = "ۛۦۤ۟ۨۘۛ۟۬ۤۜۧۘ۫ۘۗۨۢۡ۟۟ۘۘۙ۠ۥۘ"
            goto L_0x0022
        L_0x07cb:
            r24.start()
            java.lang.String r1 = "ۚۧۜۚۜۖۘۧۨ۠ۘۤ۟۫۬ۗۗ۠ۖۘ"
            goto L_0x0022
        L_0x07d2:
            r1 = 0
            r0 = r28
            r0.f1255d = r1
            java.lang.String r1 = "ۖۗۘۨۘۧۘ۟ۚۤۜۨۗۢۧۥۘۖ۫۠"
            goto L_0x0022
        L_0x07db:
            r1 = 0
            r0 = r28
            r0.f1256e = r1
            java.lang.String r1 = "ۦۜۙۢ۫ۙۗۚۨ۫ۜۖۢۗۖۘۜۤۚۜ۫۬"
            goto L_0x0022
        L_0x07e4:
            r1 = 0
            r0 = r28
            r0.f1257f = r1
            java.lang.String r1 = "ۗ۫ۛۘۚۙۤۖۘۡۤۡۘۘۤۡ"
            goto L_0x0022
        L_0x07ed:
            r0 = r28
            android.view.VelocityTracker r2 = r0.f1262k
            java.lang.String r1 = "ۧۦ۟۬۬۬ۦۨۧۛۖۡۘۢۘۘۘۤ۫ۢۡۘۤۙ۫ۥۘ"
            goto L_0x0022
        L_0x07f5:
            r25 = -1966360499(0xffffffff8acbb84d, float:-1.9617515E-32)
            java.lang.String r1 = "ۧۦۡۤۤ۫ۘۦ۬ۘۖۧۘۢۧۢۥۙۜ"
        L_0x07fa:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1724386654: goto L_0x080a;
                case -608890251: goto L_0x080f;
                case -287889184: goto L_0x0804;
                case 1014412390: goto L_0x08ab;
                default: goto L_0x0803;
            }
        L_0x0803:
            goto L_0x07fa
        L_0x0804:
            java.lang.String r1 = "ۛۘۨۘ۬ۡۦۜۧ۬ۛۙۖۘ۫۟ۦۘ۬ۧۙ۫ۛۥۢۢۘۘ۫ۛۢ"
            goto L_0x07fa
        L_0x0807:
            java.lang.String r1 = "ۗۢۨۘ۟ۛۤۢۙۡ۬ۡۥۜۨ۟ۥ۠۬ۢۡۖۘۤۡۚ"
            goto L_0x07fa
        L_0x080a:
            if (r2 == 0) goto L_0x0807
            java.lang.String r1 = "ۤ۠ۡۢ۠ۖۥۦۚۢۧۢۗۗۥۘۙۨۡ۠ۨۡۘۡۥۘ"
            goto L_0x07fa
        L_0x080f:
            java.lang.String r1 = "ۧۢۖۘۖۜۙۖۦۦۘۨۗۤۙۘۘۘۢۛۡۗ۟ۦۖۨ"
            goto L_0x0022
        L_0x0813:
            r2.clear()
            java.lang.String r1 = "۠ۥۦۘ۬ۨ۬۫ۥۡۢۤ۬ۤۛۢۨۨۦۥۥۤ۟ۗۥۘ۠ۜۜۘ"
            goto L_0x0022
        L_0x081a:
            r0 = r28
            android.view.VelocityTracker r1 = r0.f1262k
            r1.recycle()
            java.lang.String r1 = "۟ۨۥۡۛۙۦۛۦۙۡۚۧۡۙ"
            goto L_0x0022
        L_0x0825:
            r1 = 0
            r0 = r28
            r0.f1262k = r1
            java.lang.String r1 = "ۧ۬ۨۘۦۦۢۡ۠ۛ۠ۢۜۖۙۨۡۥۖۘ۬ۜۜۘۦۤ۟"
            goto L_0x0022
        L_0x082e:
            float r1 = r29.getRawX()
            r0 = r28
            r0.f1256e = r1
            java.lang.String r1 = "ۧۥۢۨۦۛۚۦۨۘۦ۬ۖۘۢۨ۠ۨۤۥ۟ۛ"
            goto L_0x0022
        L_0x083a:
            float r1 = r29.getRawY()
            r0 = r28
            r0.f1257f = r1
            java.lang.String r1 = "۫۫ۖۜۛۦۘۧۦ۟۬ۙۜۥۘ۫۬ۗ۟ۤۛۢۢۨۚ"
            goto L_0x0022
        L_0x0846:
            r1 = 0
            r0 = r29
            r0.getPointerId(r1)
            java.lang.String r1 = "ۜۧۘۚۛ۫ۡۖۜۜ۫ۗۛۢ"
            goto L_0x0022
        L_0x0850:
            r1 = 1
            goto L_0x005a
        L_0x0853:
            java.lang.String r1 = "ۜۛۚۖۨ۟ۨ۬ۙۡ۠ۦۘۦ۫ۤ"
            goto L_0x0022
        L_0x0857:
            java.lang.String r1 = "۟ۢۨۘۨۡۨۘۢۖۘۖۖۡۗۘۗ۬ۧۜۡۤۘۖۘ"
            goto L_0x0022
        L_0x085b:
            java.lang.String r1 = "ۧۡۧۘۥۖۢۙ۠ۘۘۨ۟ۘۖۛۛ۠۠ۘۡۘۘ"
            goto L_0x0022
        L_0x085f:
            java.lang.String r1 = "ۢۨۚۤۚۡ۬ۡۘۘۥۗۥۗۗۗۦ۠ۨۧۙۢۗۗ"
            goto L_0x0022
        L_0x0863:
            java.lang.String r1 = "ۡۚۡ۠ۤۦۘۥۨۘۘ۬۬ۘۜۘۨ"
            goto L_0x0022
        L_0x0867:
            java.lang.String r1 = "ۥۜۥۜۦۥۘۧ۫ۚۥۚۥۗۥۘۤ۟ۨۘۖۤۦۘۛۘ"
            goto L_0x0022
        L_0x086b:
            java.lang.String r1 = "۟ۚۦۨۚۦۤۢۘۜۛۛۚۦۖۘ۬۬ۨۘۗ۠ۜۚۘۧۘ۬ۨۧۘ"
            goto L_0x0022
        L_0x086f:
            java.lang.String r1 = "ۙۛۡۘۛۘۦۘ۠ۙۨۘۚۥۧۤۨۦۘ"
            goto L_0x0022
        L_0x0873:
            java.lang.String r1 = "ۥ۬ۢۢۛۥۧۚۜۘۦ۬ۚۧ۫ۥۘۤۗۤ۟ۛۜۘ"
            goto L_0x0022
        L_0x0877:
            java.lang.String r1 = "ۖۡۨۘ۟ۛ۫ۥۚۙ۟ۜ۟ۨۥۖۘ۬۫ۗۧۢۧ"
            goto L_0x0022
        L_0x087b:
            java.lang.String r1 = "ۗ۬۬ۘۘۤۛۢۧۘۦۦۧۡۦۘ۫ۘ۬"
            goto L_0x0022
        L_0x087f:
            java.lang.String r1 = "ۖ۫۬۫۫ۨۗۘۘۖ۬ۜۘۖۢۨۘۡۘۙ۬ۘۥۘۦۥۧۘ"
            goto L_0x0022
        L_0x0883:
            java.lang.String r1 = "ۧۡۧۦۜۥۘ۠ۗۛۨۥۡۘ۟ۥۦۡ۬ۗ"
            goto L_0x0022
        L_0x0887:
            java.lang.String r1 = "ۗۙۗۢۦۜۘۖۘۥۨۨ۟ۦۘۘۧۖ۟۟۠۫۟ۜۚ"
            goto L_0x0022
        L_0x088b:
            java.lang.String r1 = "ۜۨۖۙۧۨۘ۬ۙۗۨ۬ۜۙۜۢ"
            goto L_0x0022
        L_0x088f:
            java.lang.String r1 = "ۦۘۥۘۡۚۨ۫۬ۡۜۡ۠ۚۨۧ"
            goto L_0x0022
        L_0x0893:
            java.lang.String r1 = "ۛۧۦۘۧ۠۠ۤۙ۠ۗۤۖۥۛۥۢ۬ۖۘ۠۬ۘ۠ۚۤ۬ۙۢ"
            goto L_0x0022
        L_0x0897:
            java.lang.String r1 = "ۦۧۜۢۗۦۘۖۦۛۦۚۗۘۢۥۘۙۖۘۘۚۖۦ۫ۤۢۘۤۨ"
            goto L_0x0022
        L_0x089b:
            java.lang.String r1 = "ۤ۬ۘۖۛ۠۟ۖۨۘۧۤۜۘۡۜ۫"
            goto L_0x0022
        L_0x089f:
            java.lang.String r1 = "ۛۦۤ۟ۨۘۛ۟۬ۤۜۧۘ۫ۘۗۨۢۡ۟۟ۘۘۙ۠ۥۘ"
            goto L_0x0022
        L_0x08a3:
            java.lang.String r1 = "ۖۗۘۨۘۧۘ۟ۚۤۜۨۗۢۧۥۘۖ۫۠"
            goto L_0x0022
        L_0x08a7:
            java.lang.String r1 = "ۜۘۦۚۤۜۘۥۖۗۤۥۜۨۧۡۘۘ۫ۛۤ۟ۜ۠ۡۘ"
            goto L_0x0022
        L_0x08ab:
            java.lang.String r1 = "ۜۧۘۚۛ۫ۡۖۜۜ۫ۗۛۢ"
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.activity.SwipeBackController.processEvent(android.view.MotionEvent):boolean");
    }
}
