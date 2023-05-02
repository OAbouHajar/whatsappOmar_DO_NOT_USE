package rc.whatsapp.home.RCTABS;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.yo.d1;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.views.IBottomNavigation;

public class BasicNavigationView extends LinearLayout implements IBottomNavigation, ViewTreeObserver.OnGlobalLayoutListener, View.OnClickListener {
    public static final int H = 0;
    public ViewGroup A;
    public ViewGroup B;
    public ViewGroup C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2509a;

    /* renamed from: b  reason: collision with root package name */
    public int f2510b;

    /* renamed from: c  reason: collision with root package name */
    public int f2511c;

    /* renamed from: d  reason: collision with root package name */
    public int f2512d;

    /* renamed from: e  reason: collision with root package name */
    public int f2513e;

    /* renamed from: f  reason: collision with root package name */
    public int f2514f;

    /* renamed from: g  reason: collision with root package name */
    public int f2515g;

    /* renamed from: h  reason: collision with root package name */
    public int f2516h;

    /* renamed from: i  reason: collision with root package name */
    public int f2517i;

    /* renamed from: j  reason: collision with root package name */
    public int f2518j;

    /* renamed from: k  reason: collision with root package name */
    public int f2519k;

    /* renamed from: l  reason: collision with root package name */
    public int f2520l;

    /* renamed from: m  reason: collision with root package name */
    public int f2521m;

    /* renamed from: n  reason: collision with root package name */
    public int f2522n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f2523o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f2524p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f2525q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f2526r;

    /* renamed from: s  reason: collision with root package name */
    public TextView f2527s;

    /* renamed from: t  reason: collision with root package name */
    public ImageView f2528t;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f2529u;

    /* renamed from: v  reason: collision with root package name */
    public ImageView f2530v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f2531w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f2532x;

    /* renamed from: y  reason: collision with root package name */
    public ViewGroup f2533y;

    /* renamed from: z  reason: collision with root package name */
    public ViewGroup f2534z;

    public BasicNavigationView(Context context) {
        super(context);
        a(context);
    }

    public BasicNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(Context context) {
        int i2 = 0;
        String str = "ۖۢۛۖۜۚۙۘۧۘۜۧۢ۬ۡۘۛۢۡۘۗۨۙ";
        while (true) {
            switch ((str.hashCode() ^ 139) ^ 517661386) {
                case -1848629455:
                    this.f2520l = yo.getID("cv_ios_call_unsel", "drawable");
                    str = "ۤۚۡۥۧ۫ۨۗۖۚۘۘۨۢۧۚۚۡۘۡۤۡۘ";
                    break;
                case -947569813:
                    str = "ۢۥۜۘۖۗۥۘ۬ۡۘۖۡ۫ۚۚۨ";
                    break;
                case -593314880:
                    this.f2519k = yo.getID("cv_ios_call_sel", "drawable");
                    str = "۟ۖ۠۬ۙۧۜۡۡۘۛۢ۠ۤۜۜۚۘۖۘۗۦۖۜۖۜۘۡۘ۬";
                    break;
                case -592908457:
                    i2 = others.getTabActiveColor();
                    str = "ۧۨۜۧۜ۟ۧۙ۠ۗۥۡۘ۠۬ۦۘۗۘۥۘ۫ۤۘۤۜۨ";
                    break;
                case -574816099:
                    this.f2509a = yo.isGrpSeparateEnabled();
                    str = "ۧ۫ۜ۟ۢ۬ۨ۬ۖۜ۫ۥۜۨ۠ۢ۟ۛ۬ۘۘۡ۠ۧۨۨۨ";
                    break;
                case -430315162:
                    this.f2512d = i2;
                    str = "ۖۧۛۤ۠ۦۘ۬۫۬ۙ۫ۜۖۨۘۘۗۙۙ۬ۢۥۘۙۖۢ";
                    break;
                case -277162759:
                    getViewTreeObserver().addOnGlobalLayoutListener(this);
                    str = "ۦۤۜ۫ۚۜۘۚۖۨۚۗۗۤۢۥۘۛۥ۠ۙۗۛۧۤۥۘ۠۟ۚ";
                    break;
                case -243731327:
                    this.f2517i = yo.getID("cv_ios_chat_sel", "drawable");
                    str = "ۙ۟ۖۧۧۖۘۛۧۘۨۙۖ۟ۥۜ۟ۥ۫۫۟ۤۛ۟ۖ";
                    break;
                case -136118227:
                    this.f2516h = yo.getID("rc_call_unsel", "drawable");
                    str = "ۘۨۖ۠ۡۗ۫ۨۥ۬ۖۨۛ۬ۘۜۜ۫۟ۢۥۘ";
                    break;
                case 93837292:
                    return;
                case 147872869:
                    this.f2513e = yo.getID("rc_chat_sel", "drawable");
                    str = "۠ۛۘۥۧۧۦ۠ۚۦۘ۠ۖۚۛۗۢۛ۠۬ۗ";
                    break;
                case 331938796:
                    this.f2522n = others.getColor("tabadgeTextColor", -16777216);
                    str = "ۚۤۚۖۖۙ۫ۦ۠۬ۢۦۘۘ۬ۜ";
                    break;
                case 470797288:
                    str = "ۖۥۖۘ۫ۧۦۦ۟ۡۘۛۙۛۢۖۥ۫۟ۛ";
                    break;
                case 824406349:
                    this.f2521m = others.getColor("tabadgeBKColor", i2);
                    str = "ۨ۬ۛۢۨۧۨۢ۟ۧۥۥۥۤۥۘ۬ۘۡ۫۬ۚۗ۠ۘ";
                    break;
                case 1335576320:
                    this.f2515g = yo.getID("rc_call_sel", "drawable");
                    str = "۠۠ۡۘۤۗۦۧۖۚۗۥۘۗۨۘۘ";
                    break;
                case 1389961949:
                    this.f2518j = yo.getID("cv_ios_chat_unsel", "drawable");
                    str = "ۚۜۡۘۘ۬ۜۘۨ۟ۤۡ۬ۧۖۚۙۢۦۢ۠۠";
                    break;
                case 1709032093:
                    this.f2514f = yo.getID("rc_chat_unsel", "drawable");
                    str = "ۧ۬ۧۘۥۜۘۘۗۘ۠ۢۖ۫ۦ";
                    break;
                case 1851723084:
                    this.f2511c = others.getTabInActiveColor();
                    str = "ۗۤۜۘۤ۟ۨۨ۫ۜۘۖۖۦ۬ۤۖ۠ۥۨۘ۬ۢۨۗۚ۬۟۬ۖۘ";
                    break;
            }
        }
    }

    public int getCurrentActiveItemPosition() {
        String str = "ۙۙۖۨۘۛۙۘۜۘۙۚ۬ۨۖۘۙ۬ۨۘ۠ۜ۠ۘۨۙ۬ۤۦ";
        while (true) {
            switch ((str.hashCode() ^ 729) ^ 541787339) {
                case -522547451:
                    str = "ۘۗۤۜۥ۠ۦ۫ۡۘۢۤۖۘۙۖۤۨۦۨۧۢۧۧ۬ۧ";
                    break;
                case 30136345:
                    return this.f2510b;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            r2 = 0
            java.lang.String r0 = "ۜ۠۬ۛۤۘۘۙۘ۠۟ۡۖۡۜۖۢ۟۬ۜۗۚۘۖۗ۠ۘۘ"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
        L_0x0009:
            int r8 = r0.hashCode()
            r9 = 529(0x211, float:7.41E-43)
            r10 = 796083536(0x2f734550, float:2.2125346E-10)
            r8 = r8 ^ r9
            r8 = r8 ^ r10
            switch(r8) {
                case -2127105328: goto L_0x001e;
                case -2036216328: goto L_0x00e3;
                case -1726843792: goto L_0x0112;
                case -1581882291: goto L_0x003f;
                case -1482677846: goto L_0x015d;
                case -1305839409: goto L_0x0018;
                case -1270791137: goto L_0x013c;
                case -1091355342: goto L_0x00c4;
                case -1080075575: goto L_0x00ed;
                case -873386288: goto L_0x0060;
                case -807611541: goto L_0x00ac;
                case -588247508: goto L_0x0066;
                case -359783487: goto L_0x00e8;
                case -261107114: goto L_0x0145;
                case -202434914: goto L_0x0088;
                case -141643842: goto L_0x005d;
                case -112271010: goto L_0x0084;
                case 25438167: goto L_0x00b8;
                case 107576414: goto L_0x0149;
                case 295232191: goto L_0x00b1;
                case 306110800: goto L_0x015d;
                case 324613838: goto L_0x0159;
                case 352077053: goto L_0x0145;
                case 602785472: goto L_0x00a7;
                case 1246051247: goto L_0x010c;
                case 1294426019: goto L_0x001b;
                case 1511812224: goto L_0x0136;
                case 1676752712: goto L_0x0145;
                case 1684533167: goto L_0x00bd;
                case 1896816789: goto L_0x0117;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x0009
        L_0x0018:
            java.lang.String r0 = "۟ۦۥۛۡۨۘۦۜۧۖ۠ۨۡۤۘ۫۟ۧۨ۫"
            goto L_0x0009
        L_0x001b:
            java.lang.String r0 = "ۤ۫۫ۜۢ۟ۙۛ۫ۢۨۘۘۨۢۥ"
            goto L_0x0009
        L_0x001e:
            r8 = -1884484889(0xffffffff8fad0ae7, float:-1.7063317E-29)
            java.lang.String r0 = "ۛ۠۬۬ۦۥۘۜۧۙۧۥۧۘۖۘۖۖۖۙۢ۟ۤ۬ۡ"
        L_0x0023:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -2118432791: goto L_0x0032;
                case -96290715: goto L_0x003c;
                case 1845238898: goto L_0x002c;
                case 1980637718: goto L_0x0039;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0023
        L_0x002c:
            java.lang.String r0 = "ۧۛۘۘۡۨۖۘۥۚۦۘۙۘ۠ۧ۬ۥۘۗ۟ۖۚۖۡ"
            goto L_0x0009
        L_0x002f:
            java.lang.String r0 = "ۨۗۢۗ۠ۘۗۥۜۘۚ۠ۡۘ۠ۧۨ۬ۜۙۤ۬ۛ۫ۨۚ"
            goto L_0x0023
        L_0x0032:
            com.obwhatsapp.HomeActivity r0 = com.obwhatsapp.yo.yo.Homeac
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "۠۟۬۫ۤۥ۠ۢۨۤۙۨۖۚۨۘ۫ۚۤۢۖۙۘۙ"
            goto L_0x0023
        L_0x0039:
            java.lang.String r0 = "ۜۤۧ۫ۤۥۘ۫۠۠ۢۧۖۘۙۙ۟ۨ۫ۥۢۖ۠"
            goto L_0x0023
        L_0x003c:
            java.lang.String r0 = "ۖۛۥۖۦۨۜۥۤ۠ۖۘۤۗۧۘۗۗۨۤۥۘۘۧۨۘ"
            goto L_0x0009
        L_0x003f:
            r8 = 579264789(0x2286e115, float:3.6559088E-18)
            java.lang.String r0 = "ۜۥۛۧۨۘۘ۬۟ۤۦ۫ۖۘۡ۬ۜ"
        L_0x0044:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -2087689338: goto L_0x005a;
                case -666549287: goto L_0x004d;
                case 865349142: goto L_0x0141;
                case 1039698795: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0044
        L_0x004d:
            android.view.ViewGroup r0 = r11.C
            if (r12 != r0) goto L_0x0054
            java.lang.String r0 = "۟۬ۖۚۘۜۘۧ۫ۦۘۥۙۘۧۥۖۙ۬ۥۘۜۥۗۗۢۤ"
            goto L_0x0044
        L_0x0054:
            java.lang.String r0 = "۫ۨ۫ۚۦ۫ۖۡ۟ۡ۠ۨۘۤۢۥۘ"
            goto L_0x0044
        L_0x0057:
            java.lang.String r0 = "ۧۥۘۘۚۢۙۢۦۖۜۗۜۨۗۖۘ"
            goto L_0x0044
        L_0x005a:
            java.lang.String r0 = "ۨ۫ۡۜۗۘۘۢۗ۫۫ۦ۠ۦۥۦ"
            goto L_0x0009
        L_0x005d:
            java.lang.String r0 = "۬۫ۡۘۗۨۖۘۜۡۚۛۧۜۘۦۨۗۥ۠ۨۥۛۡۘۤۥ۫"
            goto L_0x0009
        L_0x0060:
            com.obwhatsapp.yo.u1.changeWAViewPager(r2)
            java.lang.String r0 = "ۨ۬۬ۛ۬ۜ۠ۢۖۘ۟ۘۡۘۘۖۥۘۖۚ۠ۙۚۢ"
            goto L_0x0009
        L_0x0066:
            r8 = 684792765(0x28d11bbd, float:2.321569E-14)
            java.lang.String r0 = "ۜۙۜ۟ۦۙۙۨۘۧۜۤ۫ۗۖۘۥۥۙ"
        L_0x006b:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1880629000: goto L_0x0159;
                case -1703783035: goto L_0x007e;
                case -938559441: goto L_0x0074;
                case -680047846: goto L_0x0081;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x006b
        L_0x0074:
            boolean r0 = com.obwhatsapp.yo.yo.isCommunityEnabled
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "۫۠۟ۖۧۤۥۛۜۘۗۖۛۙ۬ۡۘۘ۬ۗ"
            goto L_0x006b
        L_0x007b:
            java.lang.String r0 = "۫ۙۨۡۢۥۘۛۛۦۤۛ۟ۧۙۖۘۨۦ۠ۘ۟"
            goto L_0x006b
        L_0x007e:
            java.lang.String r0 = "۟ۗۜۘۢۡۘۘۧ۠ۘۘۧۙ۠ۘۥۤ۟۫ۘۘ۬ۥۘۛۗۗۥۚۙ"
            goto L_0x006b
        L_0x0081:
            java.lang.String r0 = "ۛۥۡۘۨ۬ۘۘۚۙۦۘۨ۫ۜۘۗ۟ۚۥۜۥۛۚ۠ۘ۟ۖ"
            goto L_0x0009
        L_0x0084:
            java.lang.String r0 = "۠۬۫ۛۙۥۘۗۨۧ۫۟ۘۘ۠ۗ۠۫ۡۚ۟ۧ۬ۙۘۧۘ"
            r7 = r2
            goto L_0x0009
        L_0x0088:
            r8 = -1556350903(0xffffffffa33bf849, float:-1.0189867E-17)
            java.lang.String r0 = "ۙ۟ۤۤۥۡۗ۠ۨۘ۬ۙۦۙ۬۟"
        L_0x008d:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -2014740366: goto L_0x00a0;
                case -1432571481: goto L_0x0096;
                case -740719511: goto L_0x00a3;
                case 320926729: goto L_0x014d;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x008d
        L_0x0096:
            android.view.ViewGroup r0 = r11.f2533y
            if (r12 != r0) goto L_0x009d
            java.lang.String r0 = "ۡۢۖۘۥۨۧۦۡۨ۟۫ۖۦ۠ۘۖۛ۠"
            goto L_0x008d
        L_0x009d:
            java.lang.String r0 = "ۧۡۨۘۘۡۤۜۦۙ۠ۗۘۜۜۘ۬ۧۦۙۛ۬ۧۨۖۜۛ"
            goto L_0x008d
        L_0x00a0:
            java.lang.String r0 = "ۘۗۢۙۢۡۨۚ۬ۧۥ۟ۙۖۙ"
            goto L_0x008d
        L_0x00a3:
            java.lang.String r0 = "ۖ۫ۗۘۡۙۙۙۡۨۘ۟ۛ۠"
            goto L_0x0009
        L_0x00a7:
            r6 = 1
            java.lang.String r0 = "ۨۛۨۘ۠۫ۚۤ۟ۜۘ۟ۙۨۗۢۛ۠ۥ"
            goto L_0x0009
        L_0x00ac:
            java.lang.String r0 = "۫ۢۤ۫۫ۗۨۙۦۡ۠۠۫ۗۦ۟ۡۦۖۗ۟"
            r5 = r6
            goto L_0x0009
        L_0x00b1:
            com.obwhatsapp.yo.u1.changeWAViewPager(r5)
            java.lang.String r0 = "۟ۨۖۘۥ۟ۤۚۛۥۘۜ۫ۢۛۜۜۘۗ۫ۙۧۡۘ"
            goto L_0x0009
        L_0x00b8:
            java.lang.String r0 = "ۤۥۦۘۥۚ۟ۤۡۤۖ۠ۚۛ۟ۚۤۘۘ"
            r7 = r5
            goto L_0x0009
        L_0x00bd:
            r11.onTabSelected(r7)
            java.lang.String r0 = "ۤۨۤۛۦۛۦۥۘ۫ۖۢۨۥۖۖۥۘۚ۠۬ۘۦۥۘۢ۠ۖ"
            goto L_0x0009
        L_0x00c4:
            r8 = -988776409(0xffffffffc5107827, float:-2311.5095)
            java.lang.String r0 = "ۘ۫ۘۘۙ۠۟ۢۛ۠ۘۥۘۜۚۤۜۢۖۤۨۘ۫ۘۖۘۜۥۧۘ"
        L_0x00c9:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -1434054062: goto L_0x0151;
                case -499945385: goto L_0x00df;
                case 1995310355: goto L_0x00d2;
                case 2026674989: goto L_0x00d8;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x00c9
        L_0x00d2:
            java.lang.String r0 = "ۡۦۖۘۦۡۙۨۦۘۡ۬ۤ۟۫ۜۙ۫ۡۙۢۦۘۦۥ۟"
            goto L_0x00c9
        L_0x00d5:
            java.lang.String r0 = "ۛۥۦۘۖ۟ۢۚۜۤۜۡۘ۫ۚ۫ۥ۬ۘۘ"
            goto L_0x00c9
        L_0x00d8:
            android.view.ViewGroup r0 = r11.f2534z
            if (r12 != r0) goto L_0x00d5
            java.lang.String r0 = "ۚۨۘۤۚۦۘۨۢۡۗ۟ۛۚۥ۠۫ۘۖۗۚۥ۟ۖۛ"
            goto L_0x00c9
        L_0x00df:
            java.lang.String r0 = "ۨۦۘۘۙ۫ۥ۬ۢ۠ۛۦۧۢ۬ۚۧۤۥۘ"
            goto L_0x0009
        L_0x00e3:
            r4 = 2
            java.lang.String r0 = "۟ۨۧۘۥۛ۟۠۫۠ۗۢۦۘۢۢ۫ۤۖۦ۫ۦۨۘۛۥۡ"
            goto L_0x0009
        L_0x00e8:
            java.lang.String r0 = "۟ۗۛۗۨۗۢۗ۠ۨۦۢ۬ۘۤ۠ۙۙۘۙۡۢۨۦۙۚۡۘ"
            r5 = r4
            goto L_0x0009
        L_0x00ed:
            r8 = 1752818192(0x6879e210, float:4.7201575E24)
            java.lang.String r0 = "ۥ۬ۙۘۦۜۥۜۖۘۖ۟ۡۘۦۥ۟ۢۙۛۡۤۤۢۦۜۘ۟ۥۤ"
        L_0x00f2:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -403257383: goto L_0x00fb;
                case 21191858: goto L_0x0155;
                case 189354305: goto L_0x0108;
                case 1926849574: goto L_0x0101;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            goto L_0x00f2
        L_0x00fb:
            java.lang.String r0 = "۠ۢۦ۠ۚۙ۟۟۬ۚۙ۬۬ۢۧۜۖۡۘۡۜۨۘ"
            goto L_0x00f2
        L_0x00fe:
            java.lang.String r0 = "ۨ۫ۨۘۢۤۘۘۥۖۡۘۦۢۧۦۚۥۛۧۦ۫ۙۚۥۦۘ"
            goto L_0x00f2
        L_0x0101:
            android.view.ViewGroup r0 = r11.A
            if (r12 != r0) goto L_0x00fe
            java.lang.String r0 = "ۗۜۘۘۜۗۘۘ۠ۖۦ۬۬ۥۘ۬ۢۚ۠ۘۨ۫۟ۥۢۖۨۜۜۡۘ"
            goto L_0x00f2
        L_0x0108:
            java.lang.String r0 = "ۛ۫ۦۖۘۚۜ۠ۙۤۦۚۢۙۦۘ"
            goto L_0x0009
        L_0x010c:
            int r3 = com.obwhatsapp.youbasha.ui.views.IBottomNavigation.TAB_STATUS
            java.lang.String r0 = "ۥۦۡۘۙۗ۫ۛ۬ۥ۠ۥۜۘۙۤۜ۬۠ۖۨۜۤۜۘۡۘۛۗ۟"
            goto L_0x0009
        L_0x0112:
            java.lang.String r0 = "ۛۢۘۘۨۦۧۘۗۡۤ۠ۦۖۘۡۤۖۨۗۥۗۡۡۗۤۖۘ"
            r5 = r3
            goto L_0x0009
        L_0x0117:
            r8 = -1500485810(0xffffffffa690674e, float:-1.0020008E-15)
            java.lang.String r0 = "ۘ۠ۧۡ۫ۦۘ۬ۘۤۧ۟ۛۧۥ۠"
        L_0x011c:
            int r9 = r0.hashCode()
            r9 = r9 ^ r8
            switch(r9) {
                case -727329068: goto L_0x0125;
                case -399456718: goto L_0x012c;
                case 1036653808: goto L_0x0133;
                case 1238155157: goto L_0x0159;
                default: goto L_0x0124;
            }
        L_0x0124:
            goto L_0x011c
        L_0x0125:
            java.lang.String r0 = "ۧۖۡۘۚ۬۟ۢۦۘۜۜۥۥۦۥۧۜ"
            goto L_0x0009
        L_0x0129:
            java.lang.String r0 = "ۨۢۧۥ۬ۦۛۥۛۗۖۧۘۧۧ۫ۘۡ۠"
            goto L_0x011c
        L_0x012c:
            android.view.ViewGroup r0 = r11.B
            if (r12 != r0) goto L_0x0129
            java.lang.String r0 = "ۜۗۘۘ۬۫۬۟۫ۜۘۙۗۨۘۦ۬ۘ۬ۚۖ"
            goto L_0x011c
        L_0x0133:
            java.lang.String r0 = "ۡۡۛۖ۠ۜۘۖ۟ۥۨ۟۠۠ۙۥۘ"
            goto L_0x011c
        L_0x0136:
            int r1 = com.obwhatsapp.youbasha.ui.views.IBottomNavigation.TAB_CALLS
            java.lang.String r0 = "ۢۢۖۢ۟ۥۘۜۖۘۙ۠۫ۡۜ۫۬ۤۜۘۧۥ۬ۗۙۖ"
            goto L_0x0009
        L_0x013c:
            java.lang.String r0 = "ۘۢۖۘۗۗۖۘۚۚۡۨ۬ۖۘۗۧۢۚۦۘۜۛۛ"
            r5 = r1
            goto L_0x0009
        L_0x0141:
            java.lang.String r0 = "ۦۚۤۘۛ۫ۦۚۛۨۥۤۧۙۧۛ۬ۡۘۛۚۥ۠ۧۧ"
            goto L_0x0009
        L_0x0145:
            java.lang.String r0 = "۫ۢۤ۫۫ۗۨۙۦۡ۠۠۫ۗۦ۟ۡۦۖۗ۟"
            goto L_0x0009
        L_0x0149:
            java.lang.String r0 = "ۤۥۦۘۥۚ۟ۤۡۤۖ۠ۚۛ۟ۚۤۘۘ"
            goto L_0x0009
        L_0x014d:
            java.lang.String r0 = "۬۫ۦۛۧۜ۟ۖۛۥۨ۬۫ۖۥۚۥۗۖۘ۫ۖۙ۟"
            goto L_0x0009
        L_0x0151:
            java.lang.String r0 = "ۤۙ۟ۛۛۥۘۖۢ۠ۧۧۢۛۜۥۜۦۘۙۙۥۘ"
            goto L_0x0009
        L_0x0155:
            java.lang.String r0 = "ۤۖۧ۬ۜۜۜۜۨۘۜ۫ۘۘۦ۫ۨۛ۟۟ۧ۟۟ۥ۫ۘ۫ۦۘۘ"
            goto L_0x0009
        L_0x0159:
            java.lang.String r0 = "ۥۙۘۧۨۢۖۦۦۘ۠۟ۥۘۗۚۡۘ"
            goto L_0x0009
        L_0x015d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.home.RCTABS.BasicNavigationView.onClick(android.view.View):void");
    }

    public void onFinishInflate() {
        ViewGroup viewGroup = null;
        String str = "ۙۢۘۢۢۖۙۥ۠ۛۡ۬ۡۚ۟ۚۚۚ";
        while (true) {
            switch ((str.hashCode() ^ 415) ^ 2113255898) {
                case -1962887727:
                    this.f2527s.setTextColor(this.f2511c);
                    str = "۟ۤۥۧۧ۠ۛۤۧۧۖۖ۫ۖۚۜۛۘۘ۬ۖۧۧۜ";
                    break;
                case -1536054329:
                    setUnreadCounterColors();
                    str = "ۢۡ۬ۚۤۦۗۡۨۘۤۜۜۘ۠۬ۘۘۖۘۖۗۘۖۘۚۥۗ۟۫ۡۘ";
                    break;
                case -1491140386:
                    super.onFinishInflate();
                    str = "ۘۖۘۘۖ۬ۛۨۙۘۘ۠۬ۦۘۗۙۦۘ";
                    break;
                case -1411312749:
                    this.f2527s = (TextView) findViewById(yo.getID("mTCalls", "id"));
                    str = "ۘۘۦۤ۠ۡۘۜۙۗۨۨ۫۫ۢۡۘ۫ۗۨۡۙۖ۫ۜۨۙۥۧ";
                    break;
                case -930918366:
                    str = "ۙۚۦۘۧۛۗۢۢۛۚۥۤۜ۟۫ۛ";
                    viewGroup = (ViewGroup) findViewById(yo.getID("bnv_group", "id"));
                    break;
                case -778703038:
                    this.A.setOnClickListener(this);
                    str = "ۡۥۜۥۙ۟ۗۜۧۘۧۜۨۘۜۙۡۘ";
                    break;
                case -537647896:
                    this.f2523o.setTextColor(this.f2511c);
                    str = "۟ۙ۟۫ۤۗ۬ۨۜۥ۫ۖۘ۬ۤۛ";
                    break;
                case -486877465:
                    this.A = (ViewGroup) findViewById(yo.getID("bnv_status", "id"));
                    str = "ۙۧۚۦۤۘۘ۟ۗ۠ۛۖۤۢۙۖۤۘۘ";
                    break;
                case -485853070:
                    this.f2528t = (ImageView) findViewById(yo.getID("mICalls", "id"));
                    str = "۫ۥۘۥۜ۟۟ۧ۠۟۟۟ۜۢۜۘ۬ۘۚۤ۬ۡۘۘۗۥ";
                    break;
                case -421684050:
                    this.f2529u = (ImageView) findViewById(yo.getID("mIChats", "id"));
                    str = "ۖۛۛۧۧۥۘ۬ۖۤ۫ۚۡۘۜۚۨ";
                    break;
                case -372649521:
                    others.pagerTabBk(this);
                    str = "۫ۗۥۘۖۙۢۚۧۜۜۤۡۖ۠ۧ";
                    break;
                case -318560695:
                    this.f2530v.setColorFilter(this.f2511c);
                    str = "۟ۗۜۘۦۥۘ۟۫ۦ۬ۙۥۨۗ۬ۥۜۘۨۨۦۛۤۚۘۛۢ";
                    break;
                case -287949879:
                    this.f2523o = (TextView) findViewById(yo.getID("mTCamera", "id"));
                    str = "ۤۥ۫ۖ۫ۙۢۘۘ۟ۤۥۘۚۡۧۘۨ۫۟ۜۦۧۗۚۘۘ";
                    break;
                case -275429916:
                    this.f2534z = viewGroup;
                    str = "ۙۢۙۢۖ۫۬ۙۘۘۨۨۥۘ۟ۚۨۢۚۜۘ۠ۥۦۘ";
                    break;
                case -267228641:
                    this.E = (TextView) this.f2534z.findViewWithTag("groups_unread");
                    str = "ۜۥ۠ۘۖۨ۟ۜۘۡۚۡۚ۠ۚۥۛۘۘۜۙۦۘ";
                    break;
                case -212379312:
                    this.f2534z.setOnClickListener(this);
                    str = "ۡۦۗۨۗۦۘۜۢۦۘ۠۟ۦۘ۬ۦۖۧۡۡ";
                    break;
                case -187343472:
                    this.f2525q = (TextView) findViewById(yo.getID("mTGroups", "id"));
                    str = "ۙۙۖ۫ۘ۠ۨۢ۠۬ۦ۬ۘۙۜۘۢۖۙۢۖۥۨۤۦ۫۟۟";
                    break;
                case -24331864:
                    str = "۟ۗۛ۟ۙ۬ۛۘۖۤۤۤ۫ۧۡۘۛۨۚۢ۟ۘ";
                    break;
                case 205552340:
                    String str2 = "ۙۦۚۤۧۢۥۙۦ۬ۛۙۦ۫ۨۘۤۜۛۧۜۤۦۤۡ۠۟ۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1780316628) {
                            case -1400233091:
                                str = "۟ۧۚۖۙۢۙۢۥۨ۠ۘۘ۫ۙۘۘۗۚۨۥ۟ۦ";
                                continue;
                            case -1237684717:
                                str2 = "۫ۚ۬۬ۧ۬۬ۥۡۧ۟۬۟۠ۨۘ";
                                break;
                            case 285907066:
                                str = "۬ۜ۠۟ۥۨۘۛۡۘۘ۠ۡۘۘۜۥۦ۬ۛۨۘۦۜۨۢۦۘۧۚۦ";
                                continue;
                            case 1427951733:
                                if (this.f2509a) {
                                    str2 = "۬۟ۚۤۨۜۘۥۤۢۢۦ۬ۡۨۚۤ۬ۢ۠ۗۦۘۛۖۨۢۜۡ";
                                    break;
                                } else {
                                    str2 = "ۚۗۛ۠ۦۥۘ۬ۛۗۗۦۚۖۛۚۗۧۤ۫۟۬";
                                    break;
                                }
                        }
                    }
                    break;
                case 263346166:
                    this.f2531w = (ImageView) findViewById(yo.getID("mIGroup", "id"));
                    str = "ۘ۬ۖۚۖۢۡ۬ۖۘۢۖۘ۫ۗۚۦۘ۬۫ۦۡۘ۟ۜۥۧۡۦ";
                    break;
                case 265866407:
                    this.B.setOnClickListener(this);
                    str = "ۢۦۙۥۛۘۘۗۤ۫ۖۗ۫ۨۥۘۘۦۛۧۧۥۨۘ";
                    break;
                case 365541660:
                    this.F = (TextView) this.A.findViewWithTag("status_unread");
                    str = "ۛ۟ۧۛۚۜۧ۫ۨۘۛ۬ۖۚ۟ۗ";
                    break;
                case 667731486:
                    this.G = (TextView) this.B.findViewWithTag("calls_unread");
                    str = "ۧ۫ۨۘ۟ۛۡۘۙۚ۫ۘ۫ۗۢۡۤ۫ۖۥۘ";
                    break;
                case 679889209:
                    viewGroup.setVisibility(8);
                    str = "۬ۜ۠۟ۥۨۘۛۡۘۘ۠ۡۘۘۜۥۦ۬ۛۨۘۦۜۨۢۦۘۧۚۦ";
                    break;
                case 695306265:
                    this.f2524p = (TextView) findViewById(yo.getID("mTChats", "id"));
                    str = "ۤۧۦ۬ۜۚ۠ۤ۟ۘۘۡۘ۠ۡۡ";
                    break;
                case 854584214:
                    this.f2526r = (TextView) findViewById(yo.getID("mTStatus", "id"));
                    str = "ۦۢۜۘۖ۬ۙۙۗۡۜۥۥۘ۬ۛ۬ۧۨۥ۬ۜۡۘۨ۬۟۟ۧۗ";
                    break;
                case 1027409124:
                    this.C.setOnClickListener(this);
                    str = "ۦۜۦۘۘۤۡۧ۟ۥۘۛۖۘۢ۫ۖۘ۟ۥۚۛۨۘ";
                    break;
                case 1181260912:
                    this.f2532x = (ImageView) findViewById(yo.getID("mIStatus", "id"));
                    str = "۠ۨۧۘۦۦۖۘۢۥۨۘۘۤۥۢۜۜ";
                    break;
                case 1402069474:
                    this.f2533y.setOnClickListener(this);
                    str = "ۚ۫۠ۗۛۦۢۥ۬ۨۖۘۨۗۘ";
                    break;
                case 1663301787:
                    this.D = (TextView) this.f2533y.findViewWithTag("chats_unread");
                    str = "ۢ۠ۡۘۙۥۜۘۥۛۖۘۘۘۨۘۢۦۘ۠ۤۡۘۖۘۦ";
                    break;
                case 1811845640:
                    return;
                case 1856024213:
                    this.B = (ViewGroup) findViewById(yo.getID("bnv_calls", "id"));
                    str = "ۥۧۤۤ۠ۖۘ۫ۧۥۘۖۥ۬ۜۛۖۘۥۚۖۗۧ۟ۥۥۘۥ۠ۤ";
                    break;
                case 1935554484:
                    this.f2533y = (ViewGroup) findViewById(yo.getID("bnv_home", "id"));
                    str = "ۧۘۢۖۤۨ۬ۦۢۖۜۘۙ۫ۖۘ";
                    break;
                case 1974525707:
                    this.f2530v = (ImageView) findViewById(yo.getID("mICamera", "id"));
                    str = "ۛۙ۬ۙۤۥۘ۠ۥۥۘۙۦۡۘۥ۟۫ۜۙۤۡۖ۫۫ۨۧۡۜۘ";
                    break;
                case 2067617622:
                    this.C = (ViewGroup) findViewById(yo.getID("bnv_camera", "id"));
                    str = "ۘۡۖۘۢۙۗ۫ۥۘۡۤۛۥۧ۬ۦۤۘۢ۠ۢۨۧۨۘ۟ۚ۠";
                    break;
            }
        }
    }

    public void onGlobalLayout() {
        String str = "ۦۖۙۙۧۜۧۛۜۘ۬ۢ۫ۦۧۤۚۖۗۦۥۖۘ۫ۡۨ۟ۦۤ";
        while (true) {
            switch ((str.hashCode() ^ 626) ^ -1546638237) {
                case -2024549430:
                    post(new d(this, 18));
                    str = "ۖۗۧۗۡۙۢ۬۠ۗۘۙ۠ۢۢۡ۟ۡۘ۫ۥۘ";
                    break;
                case -952998077:
                    return;
                case 540057077:
                    str = "۬ۨۚۜۗۖۘ۫ۥۧۘۙ۠ۘۥۖۢ۟ۛۨۘ";
                    break;
                case 1401860611:
                    setCurrentActiveItem(1);
                    str = "ۡۘۖۘۧۧۙ۟ۨۧ۬ۙۧۗ";
                    break;
                case 1669678565:
                    getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    str = "ۙۤۨۘ۠ۡۢۤۖۘۜۙۧۖۡۧ";
                    break;
            }
        }
    }

    public void onTabSelected(int i2) {
        try {
            this.f2510b = i2;
            setIconsColors();
        } catch (Exception e2) {
        }
    }

    public void setBadgeValue(int i2, String str) {
        String str2 = "ۘ۠ۗ۬ۦۨۘۥ۫۫۟ۘۨۥۜۥۘۢۢۨۘ";
        while (true) {
            switch ((str2.hashCode() ^ 896) ^ 407927421) {
                case -1014576672:
                    str2 = "۬ۨۦۘۙۥۨۘۙۗۨۘۜۧۤۖۘۘۚۨۖ";
                    break;
                case 296955382:
                    post(new d1(this, str, i2, 3));
                    str2 = "ۦۦۛۤۦ۠ۦۘ۫ۡ۟ۨۘۧۛۥۨۨۥۘ۬ۦۜۘ";
                    break;
                case 683365355:
                    return;
                case 1103490221:
                    str2 = "۠ۦ۠ۙۙۙۘ۬ۦۧۨۡۘ۟ۡۘ";
                    break;
                case 1844497582:
                    str2 = "ۗۘۛۢۘۘۘ۟ۧۘۘۗۜۘۥۤۨۘۛۗ۬ۦۜۨۘۤۨ";
                    break;
            }
        }
    }

    public void setCurrentActiveItem(int i2) {
        String str = "ۦۢۥۘۚۗۥۚ۫ۙۡ۟ۥۘ۟ۘۖۘۛۚۗۤۦۥۥۚۡ۠";
        while (true) {
            switch ((str.hashCode() ^ 429) ^ -251242830) {
                case -1614247907:
                    onTabSelected(i2);
                    str = "ۨۡۨ۟ۖۘۘۦۨ۟ۢ۠ۗۖ۫ۦۧۤ۬ۚۥۦ۫ۗۗ";
                    break;
                case -232893937:
                    return;
                case -215733787:
                    str = "ۛۥۥۘۡۡۖۘۦۜ۠ۙۛۡۙۤۖۡۤۧ۫ۖ";
                    break;
                case 1276240295:
                    str = "ۗۖۜۘ۫۠ۦۘۘۗ۟ۖۘۤۨۦۢ۠ۥۛۤۘۦۡ۫ۜۘ";
                    break;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setIconsColors() {
        /*
            r90 = this;
            r86 = 0
            r73 = 0
            r85 = 0
            r83 = 0
            r84 = 0
            r82 = 0
            r80 = 0
            r81 = 0
            r79 = 0
            r77 = 0
            r78 = 0
            r76 = 0
            r74 = 0
            r75 = 0
            r71 = 0
            r72 = 0
            r70 = 0
            r69 = 0
            r68 = 0
            r66 = 0
            r67 = 0
            r65 = 0
            r64 = 0
            r62 = 0
            r63 = 0
            r61 = 0
            r60 = 0
            r58 = 0
            r57 = 0
            r56 = 0
            r59 = 0
            r55 = 0
            r54 = 0
            r52 = 0
            r53 = 0
            r51 = 0
            r50 = 0
            r48 = 0
            r49 = 0
            r47 = 0
            r46 = 0
            r45 = 0
            r43 = 0
            r44 = 0
            r42 = 0
            r41 = 0
            r39 = 0
            r40 = 0
            r38 = 0
            r37 = 0
            r35 = 0
            r36 = 0
            r34 = 0
            r33 = 0
            r32 = 0
            r30 = 0
            r31 = 0
            r29 = 0
            r28 = 0
            r26 = 0
            r27 = 0
            r25 = 0
            r23 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r17 = 0
            r16 = 0
            r14 = 0
            r15 = 0
            r13 = 0
            r12 = 0
            r10 = 0
            r11 = 0
            r8 = 0
            r6 = 0
            r4 = 0
            r9 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            java.lang.String r2 = "ۤ۟ۦۘۦۢۢۦ۫ۖۘۧۦۖۘۡ۠ۖۘۦۙۡ"
        L_0x009d:
            int r87 = r2.hashCode()
            r88 = 658(0x292, float:9.22E-43)
            r89 = 1966759290(0x753a5d7a, float:2.3624589E32)
            r87 = r87 ^ r88
            r87 = r87 ^ r89
            switch(r87) {
                case -2145401123: goto L_0x0776;
                case -2120761024: goto L_0x00e1;
                case -2078807402: goto L_0x0147;
                case -2065349773: goto L_0x05ee;
                case -2009998859: goto L_0x0153;
                case -1971237394: goto L_0x0586;
                case -1931975633: goto L_0x07c4;
                case -1915025697: goto L_0x01dd;
                case -1914995154: goto L_0x0783;
                case -1848180039: goto L_0x04c9;
                case -1805595667: goto L_0x0228;
                case -1800702921: goto L_0x0199;
                case -1800688981: goto L_0x042f;
                case -1771207086: goto L_0x028b;
                case -1766497340: goto L_0x071f;
                case -1728249031: goto L_0x0238;
                case -1713247492: goto L_0x0110;
                case -1707129149: goto L_0x080b;
                case -1681869754: goto L_0x03b8;
                case -1631360354: goto L_0x00b1;
                case -1630965502: goto L_0x0222;
                case -1622226167: goto L_0x0631;
                case -1605732209: goto L_0x0893;
                case -1592361830: goto L_0x0823;
                case -1587296051: goto L_0x065f;
                case -1571133504: goto L_0x03ab;
                case -1556193545: goto L_0x011a;
                case -1525960879: goto L_0x04da;
                case -1500094343: goto L_0x07ee;
                case -1489177553: goto L_0x03ef;
                case -1478049156: goto L_0x0843;
                case -1412854782: goto L_0x0788;
                case -1378384238: goto L_0x08a7;
                case -1349333095: goto L_0x07e1;
                case -1344210650: goto L_0x033e;
                case -1340925004: goto L_0x0750;
                case -1283671475: goto L_0x0478;
                case -1241611160: goto L_0x06b3;
                case -1197077317: goto L_0x06e4;
                case -1194947811: goto L_0x07c9;
                case -1190844194: goto L_0x0467;
                case -1120019195: goto L_0x040e;
                case -1113341142: goto L_0x01c7;
                case -1072800713: goto L_0x06b9;
                case -1043518120: goto L_0x032e;
                case -1008639162: goto L_0x0665;
                case -974102913: goto L_0x05de;
                case -952019125: goto L_0x07ce;
                case -947204360: goto L_0x014d;
                case -947024661: goto L_0x0487;
                case -897557660: goto L_0x0702;
                case -892625541: goto L_0x015f;
                case -886812379: goto L_0x04bf;
                case -886443774: goto L_0x0535;
                case -880086665: goto L_0x0609;
                case -863233277: goto L_0x01f6;
                case -861513376: goto L_0x0843;
                case -840745928: goto L_0x07f6;
                case -837597739: goto L_0x038a;
                case -811989506: goto L_0x02a0;
                case -801549416: goto L_0x052a;
                case -780671907: goto L_0x06a3;
                case -745090964: goto L_0x05c0;
                case -738265362: goto L_0x04f4;
                case -735221563: goto L_0x0232;
                case -724823326: goto L_0x0675;
                case -700075666: goto L_0x070c;
                case -675656559: goto L_0x0358;
                case -674801195: goto L_0x03c5;
                case -660856896: goto L_0x06c9;
                case -643402899: goto L_0x0285;
                case -623262657: goto L_0x07bc;
                case -578506315: goto L_0x00dc;
                case -575115440: goto L_0x00e6;
                case -515153391: goto L_0x07fb;
                case -511289894: goto L_0x0328;
                case -505453661: goto L_0x088b;
                case -498309168: goto L_0x05b6;
                case -488715301: goto L_0x08ab;
                case -474930033: goto L_0x0349;
                case -425855120: goto L_0x0791;
                case -412420078: goto L_0x077b;
                case -396961541: goto L_0x03e3;
                case -388720114: goto L_0x02f0;
                case -368774351: goto L_0x084b;
                case -333268161: goto L_0x057c;
                case -297718012: goto L_0x00ae;
                case -262893359: goto L_0x059c;
                case -195959765: goto L_0x0457;
                case -183796623: goto L_0x03fb;
                case -168589519: goto L_0x0159;
                case -164550052: goto L_0x024d;
                case -160802728: goto L_0x02e0;
                case -124849960: goto L_0x071a;
                case -82442637: goto L_0x05e8;
                case -67096329: goto L_0x00eb;
                case -62509613: goto L_0x01bb;
                case -41603502: goto L_0x0126;
                case -18093240: goto L_0x0524;
                case 3071398: goto L_0x045d;
                case 25749618: goto L_0x0843;
                case 40796815: goto L_0x0296;
                case 59535974: goto L_0x01cd;
                case 65277254: goto L_0x044d;
                case 122475281: goto L_0x026b;
                case 143083833: goto L_0x03e9;
                case 198063851: goto L_0x081b;
                case 199592666: goto L_0x00ba;
                case 212049432: goto L_0x0390;
                case 240783971: goto L_0x055e;
                case 264874072: goto L_0x0799;
                case 282595275: goto L_0x02ea;
                case 302982240: goto L_0x0659;
                case 306795900: goto L_0x064f;
                case 315490292: goto L_0x066f;
                case 331932452: goto L_0x00bf;
                case 355788512: goto L_0x0491;
                case 420949948: goto L_0x046d;
                case 446057198: goto L_0x02c2;
                case 453533565: goto L_0x051e;
                case 499865942: goto L_0x087b;
                case 553734431: goto L_0x0853;
                case 562969480: goto L_0x0275;
                case 605178536: goto L_0x0712;
                case 634100557: goto L_0x02fa;
                case 660497087: goto L_0x0748;
                case 690146913: goto L_0x0800;
                case 702443598: goto L_0x0120;
                case 752323231: goto L_0x0627;
                case 763883149: goto L_0x06ad;
                case 776505494: goto L_0x04af;
                case 781686385: goto L_0x0728;
                case 806952921: goto L_0x0596;
                case 832568263: goto L_0x0873;
                case 852225956: goto L_0x067b;
                case 892255768: goto L_0x04b9;
                case 917705112: goto L_0x05a7;
                case 918964189: goto L_0x0193;
                case 939386468: goto L_0x086b;
                case 990320588: goto L_0x088b;
                case 1060046554: goto L_0x018d;
                case 1067974992: goto L_0x0218;
                case 1114582470: goto L_0x06da;
                case 1135197181: goto L_0x089b;
                case 1181838187: goto L_0x0187;
                case 1187241290: goto L_0x031e;
                case 1189038346: goto L_0x0512;
                case 1189922361: goto L_0x039a;
                case 1229462251: goto L_0x053d;
                case 1238726402: goto L_0x0243;
                case 1292478093: goto L_0x0380;
                case 1311465172: goto L_0x085b;
                case 1322098573: goto L_0x04cf;
                case 1333959321: goto L_0x03a0;
                case 1459119427: goto L_0x0406;
                case 1473613953: goto L_0x0115;
                case 1478642573: goto L_0x076e;
                case 1500523558: goto L_0x0554;
                case 1591645696: goto L_0x0518;
                case 1608930403: goto L_0x0863;
                case 1622673042: goto L_0x0300;
                case 1656212235: goto L_0x07e9;
                case 1659467894: goto L_0x0685;
                case 1697007699: goto L_0x0425;
                case 1697423409: goto L_0x00f0;
                case 1708056385: goto L_0x088b;
                case 1717897181: goto L_0x05f8;
                case 1738035844: goto L_0x05fe;
                case 1761192698: goto L_0x01c1;
                case 1776313663: goto L_0x0362;
                case 1829282747: goto L_0x027b;
                case 1833189571: goto L_0x0813;
                case 1834617556: goto L_0x0338;
                case 1862170360: goto L_0x03f5;
                case 1874184895: goto L_0x082b;
                case 1906652890: goto L_0x079e;
                case 1909789267: goto L_0x01ec;
                case 1938757984: goto L_0x04e7;
                case 1944114224: goto L_0x058c;
                case 1991889140: goto L_0x06c3;
                case 2043500755: goto L_0x0181;
                case 2062638363: goto L_0x082f;
                case 2109212027: goto L_0x0837;
                case 2128678467: goto L_0x06cf;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            goto L_0x009d
        L_0x00ae:
            java.lang.String r2 = "ۤ۬ۦۘۜۡۘۢۙۦ۠ۨۡۘۚۧۘ"
            goto L_0x009d
        L_0x00b1:
            r0 = r90
            int r0 = r0.f2510b
            r86 = r0
            java.lang.String r2 = "ۖۡۡ۬ۖۜۘۧۖۨۘۦۖ۟۠ۜۥۘ۠ۚ۟ۥۡۨۘۖۙۧۤۨ۬"
            goto L_0x009d
        L_0x00ba:
            r73 = 1
            java.lang.String r2 = "ۥۖۖۘۤۥۘۘ۬ۥ۬ۢۘۖۘۡۖۘ"
            goto L_0x009d
        L_0x00bf:
            r87 = 531299129(0x1faafb39, float:7.2413414E-20)
            java.lang.String r2 = "ۢ۠ۖۘۥ۫ۦۘۤۖ۫۟۬ۡۤ۫ۛۢ۫ۥۘۖۦۧۘ"
        L_0x00c4:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -2105054305: goto L_0x0807;
                case -552378905: goto L_0x00d9;
                case 558060999: goto L_0x00d4;
                case 1296406064: goto L_0x00ce;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            goto L_0x00c4
        L_0x00ce:
            java.lang.String r2 = "ۖ۬ۙۡ۠ۘۘۚۖۚ۠ۦ۬۬ۧۙ۠ۥۗ۫ۖۥۘ۟۠"
            goto L_0x009d
        L_0x00d1:
            java.lang.String r2 = "۠ۘۡۘ۫ۙۦۦۛۖۘۢ۠ۖ۠ۛۢ۠ۘۡۦۘۚ۠ۘ"
            goto L_0x00c4
        L_0x00d4:
            if (r86 != 0) goto L_0x00d1
            java.lang.String r2 = "ۢۨۡۧ۫ۦۤۢۦۢۡۙۘۜۡۘۚ۫ۗۚ۠ۖ"
            goto L_0x00c4
        L_0x00d9:
            java.lang.String r2 = "ۖۚۦۘۙ۠ۧۤۜۜۘۢۤۛۡ۠ۥۘ۬ۜۧۘ۟ۗۢۛۚ۬۟ۡۜ"
            goto L_0x00c4
        L_0x00dc:
            r85 = 1
            java.lang.String r2 = "۠ۛۦۧۨ۫ۖۡۖۘۨ۟ۗۥ۠ۖ۟ۢۨۗۡۦۦۘۙۗۖ"
            goto L_0x009d
        L_0x00e1:
            java.lang.String r2 = "ۘۥۘ۫ۖۙۦۥۖۘۢۡۚ۬ۦۜ"
            r84 = r85
            goto L_0x009d
        L_0x00e6:
            r83 = 0
            java.lang.String r2 = "ۘۗۖۛۧۡۘ۬ۧۚ۬۬۟ۥۗۢۨ۫۬۫ۖۗۧۨۙ"
            goto L_0x009d
        L_0x00eb:
            java.lang.String r2 = "ۚۖۛۦۘۧۗۥۖ۠۠ۢۢۡۨ"
            r84 = r83
            goto L_0x009d
        L_0x00f0:
            r87 = 1665705120(0x6348a4a0, float:3.7012113E21)
            java.lang.String r2 = "ۚۧۥۥۥ۫۟ۗۡۘۙۘۨۖۦۛۖ۫ۖۗۘۙۛ"
        L_0x00f5:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -301659270: goto L_0x010d;
                case 213755904: goto L_0x0105;
                case 1198740376: goto L_0x080f;
                case 1780913448: goto L_0x00ff;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            goto L_0x00f5
        L_0x00ff:
            java.lang.String r2 = "۠ۜۜۚۡ۫ۚۖۘۘ۟۟ۘۘۥۨۢۚۢۡ"
            goto L_0x00f5
        L_0x0102:
            java.lang.String r2 = "ۡۤۧۨۦۦۘۥ۠ۥۘۥۘۦۘۢۢۜۘۨۜۨۜۥۤ۠۫ۥۘۧۦ۟"
            goto L_0x00f5
        L_0x0105:
            r2 = 1
            r0 = r86
            if (r0 != r2) goto L_0x0102
            java.lang.String r2 = "ۙۧۦ۟ۢۜۡ۬ۧۨۙ۫ۢۜۜۙۦۘ"
            goto L_0x00f5
        L_0x010d:
            java.lang.String r2 = "ۨۘۥۛۙۥۘۜۚۗ۟۟ۦۤۖۙ"
            goto L_0x009d
        L_0x0110:
            r82 = 1
            java.lang.String r2 = "۫۫ۧۚۡۢۢۧۥۘۤۢ۠ۚۡۦۡۥ۟ۖۗۥۥۦۜ"
            goto L_0x009d
        L_0x0115:
            java.lang.String r2 = "ۢۗۤۥۥۚۤۢۘۘۖۖۦۨۗۡۘ۠۟ۡۘۙۚۦۗ"
            r81 = r82
            goto L_0x009d
        L_0x011a:
            r80 = 0
            java.lang.String r2 = "ۦ۬ۥۘۥۡۛۦۥۦۘۜۗۨۛۦۧ"
            goto L_0x009d
        L_0x0120:
            java.lang.String r2 = "ۨۦۙ۟ۖۤ۬ۡۛۢ۬۬ۜۜۡ۠۫ۘ"
            r81 = r80
            goto L_0x009d
        L_0x0126:
            r87 = -915033557(0xffffffffc975b22b, float:-1006370.7)
            java.lang.String r2 = "ۤۧۜۘۤۤۖۘ۟ۙۧۖۙۡۘ۫ۛۜۘ"
        L_0x012b:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1807034439: goto L_0x0135;
                case -534315773: goto L_0x0817;
                case -23203352: goto L_0x0140;
                case 1413062331: goto L_0x0143;
                default: goto L_0x0134;
            }
        L_0x0134:
            goto L_0x012b
        L_0x0135:
            r2 = 2
            r0 = r86
            if (r0 != r2) goto L_0x013d
            java.lang.String r2 = "۠۬ۙ۬ۜۦ۫ۤۚۘۜ۠ۛۜۨ"
            goto L_0x012b
        L_0x013d:
            java.lang.String r2 = "ۛۙۜۘ۫ۗۚ۟ۨۘۖۧۖۘۜ۟ۚۘۗۗ۫۫ۧ۬۫۟"
            goto L_0x012b
        L_0x0140:
            java.lang.String r2 = "ۛۡۦۘۥ۫ۢۗۦۨۘۤۙۦ۠ۧۥۘ۟ۢ۬۫۟ۥ"
            goto L_0x012b
        L_0x0143:
            java.lang.String r2 = "ۧۖۢۗ۫ۨۙۧ۠ۖۢۦۛۢۜۘۗۨۤۛ۠ۦۘ"
            goto L_0x009d
        L_0x0147:
            r79 = 1
            java.lang.String r2 = "۫۫ۖۢۜۢ۠ۧۡ۠ۖۡۖۥۜۘ۠ۧۥۘۖۤۦ"
            goto L_0x009d
        L_0x014d:
            java.lang.String r2 = "۟۬ۨۘۡۘۘۚ۫ۚ۠ۡۘۙۥۧۘۡۡۜۘ۟۠ۛۡۚ۫"
            r78 = r79
            goto L_0x009d
        L_0x0153:
            r77 = 0
            java.lang.String r2 = "ۚ۠ۥ۟۠ۢۗۨۛۤۘۚۡۘۙ۠ۡۛۦۗۦۘۥۘۥ"
            goto L_0x009d
        L_0x0159:
            java.lang.String r2 = "ۙۡۧۙۧۛ۫۠ۖ۠۟ۙۦۥۘۡۜۧ۠ۙ"
            r78 = r77
            goto L_0x009d
        L_0x015f:
            r87 = -1830053509(0xffffffff92eb997b, float:-1.4868421E-27)
            java.lang.String r2 = "ۧۖ۫ۤۖۦۜۚۢۘۤۥۧۨۢۡ۟ۥۘۧۖۗۜ۠ۡ"
        L_0x0164:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1611007743: goto L_0x016e;
                case -1560487684: goto L_0x017a;
                case -1395181202: goto L_0x017d;
                case 1157276933: goto L_0x081f;
                default: goto L_0x016d;
            }
        L_0x016d:
            goto L_0x0164
        L_0x016e:
            int r2 = com.obwhatsapp.youbasha.ui.views.IBottomNavigation.TAB_STATUS
            r0 = r86
            if (r0 != r2) goto L_0x0177
            java.lang.String r2 = "ۛ۬ۢ۟ۜۧۘۖۨۦۘۚ۬ۛۘ۬ۗۥۥۤ"
            goto L_0x0164
        L_0x0177:
            java.lang.String r2 = "ۜۜۥۘ۟ۤۢ۟۬ۗۛۢۖۘۘ۫ۨۘۨ۟۠ۚۛ"
            goto L_0x0164
        L_0x017a:
            java.lang.String r2 = "۟ۤۘۘۖۤۖۘۦۜ۠ۚۦ۬ۛ۠ۛۨۥۖۘ۠ۥۧۘ۬ۖۙ۬ۧ۟"
            goto L_0x0164
        L_0x017d:
            java.lang.String r2 = "ۦۦۡۘۚۛۜۘۥۜۖۘۡ۫ۡ۟ۧۨۘۨۧۜ"
            goto L_0x009d
        L_0x0181:
            r76 = 1
            java.lang.String r2 = "ۚۤۡۘ۠۠ۚۡۨۨۤۢۚۨۦۡۘۘۖۜۘ"
            goto L_0x009d
        L_0x0187:
            java.lang.String r2 = "ۧۢۗ۬ۖۥۘۖ۟ۦۦۙ۠۟ۨۧۘ۟ۥ۟۠ۘۡۙ۫ۗ"
            r75 = r76
            goto L_0x009d
        L_0x018d:
            r74 = 0
            java.lang.String r2 = "۟ۘۚۚۛۖۖۢۘۘۛۙۛۥۡ۠ۙ۠ۥۢ۫۫ۡۖۘۚۘ۫"
            goto L_0x009d
        L_0x0193:
            java.lang.String r2 = "ۢۜۦۗۦ۬ۖۘۚ۬ۙ۫ۨۚۜۡۜ۟ۡۡۚۨۖۖۘۛۚۗ"
            r75 = r74
            goto L_0x009d
        L_0x0199:
            r87 = -1500512459(0xffffffffa68fff35, float:-9.991792E-16)
            java.lang.String r2 = "ۤۙۖۤۤۙۤ۠ۥۡۘۧۘۥۢۢۜ۠۫ۛۙ"
        L_0x019e:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1578950300: goto L_0x0827;
                case -1488084208: goto L_0x01b8;
                case -885117268: goto L_0x01af;
                case 1713328: goto L_0x01a8;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            goto L_0x019e
        L_0x01a8:
            java.lang.String r2 = "ۙۜۧۘۧ۬ۖۘ۬۬ۙۢ۬۬ۘۙ۠"
            goto L_0x009d
        L_0x01ac:
            java.lang.String r2 = "ۜۥۚۨۚۘۘ۠ۘۨ۬ۥۢۖۖۥۜۗۦۤۨۗ"
            goto L_0x019e
        L_0x01af:
            int r2 = com.obwhatsapp.youbasha.ui.views.IBottomNavigation.TAB_CALLS
            r0 = r86
            if (r0 != r2) goto L_0x01ac
            java.lang.String r2 = "ۗ۬۫ۘۖۖۘۗۦۗۨ۬ۦۡۚۦۚۚۡۘ۟ۢۜۧۡۤ"
            goto L_0x019e
        L_0x01b8:
            java.lang.String r2 = "ۥۖۦۜۛۗۗۢ۠ۜۦۜ۠ۥ"
            goto L_0x019e
        L_0x01bb:
            java.lang.String r2 = "ۚ۬ۡ۟ۢۦ۠ۚۜ۬ۜ۠۟ۘۚۦۗۗۜ۟۬ۙۘۘۥۥۘۘ"
            r72 = r73
            goto L_0x009d
        L_0x01c1:
            r71 = 0
            java.lang.String r2 = "ۘۖۨۘۥ۠ۡۧۥۜۘۤۘۥۘ۬ۖۘۘۨۖۨ۫ۧۘ۟۫ۖۦۚۛ"
            goto L_0x009d
        L_0x01c7:
            java.lang.String r2 = "ۗۙۜۘۤۦۧۘ۫ۦۚۜۜۙۢۡۘ"
            r72 = r71
            goto L_0x009d
        L_0x01cd:
            java.lang.String r2 = com.obwhatsapp.yo.HomeUI.getUIHomeStyle()
            java.lang.String r70 = "ios"
            r0 = r70
            boolean r70 = r2.equals(r0)
            java.lang.String r2 = "ۚۘۚۦۗ۫ۥۧۖۘۢۥ۫ۖۛ۠ۘۡۜۜ۠۟ۡۥۘ"
            goto L_0x009d
        L_0x01dd:
            r0 = r90
            android.widget.ImageView r2 = r0.f2529u
            r87 = 0
            r0 = r87
            r2.setVisibility(r0)
            java.lang.String r2 = "۬ۘۥۘۥ۠۬ۧۧۧۤ۬ۜۘۢ۫ۛۡۘۤۘ۫ۢ"
            goto L_0x009d
        L_0x01ec:
            r0 = r90
            android.widget.ImageView r0 = r0.f2529u
            r69 = r0
            java.lang.String r2 = "۬ۙۗۚۡۘۘۜۙۥۥۨۘۦۥۨ"
            goto L_0x009d
        L_0x01f6:
            r87 = 1797250010(0x6b1fdbda, float:1.9325742E26)
            java.lang.String r2 = "ۢ۬ۨۚ۫ۡۘۥۨ۠ۡۜۢ۫ۨۧ۬۬ۨۘۢ۬ۜۘۛۜۨ"
        L_0x01fb:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1418724611: goto L_0x0205;
                case -952197822: goto L_0x0211;
                case -740695699: goto L_0x020c;
                case 1000512716: goto L_0x0214;
                default: goto L_0x0204;
            }
        L_0x0204:
            goto L_0x01fb
        L_0x0205:
            java.lang.String r2 = "۟ۗۦۘۦ۫۟۟۟ۢۢۡۡۡ۬ۡۘ۠ۗۗۢۖۨۡۦۨۜۤۘۘ"
            goto L_0x009d
        L_0x0209:
            java.lang.String r2 = "ۦ۫ۢۚۛۥۘۧۥۨۥۛۨۘۖ۫ۦۘۤۙۡۖۛۡۜۛۜ"
            goto L_0x01fb
        L_0x020c:
            if (r81 == 0) goto L_0x0209
            java.lang.String r2 = "۟ۦۡۘ۫ۦۖۨۙۡۘۘۜۜ۟ۡۧ۬ۡۚۚۘۧۘۥۛۘۘ"
            goto L_0x01fb
        L_0x0211:
            java.lang.String r2 = "ۙۖۜۢۖۥ۬ۗۨۙۚۖۡۤۢۜۛۨۛۧۦۖۜۛۡۨ"
            goto L_0x01fb
        L_0x0214:
            java.lang.String r2 = "۫ۙۨۧۚۨۢۥۦۘۖۙۡۥۦۧ"
            goto L_0x009d
        L_0x0218:
            r0 = r90
            int r0 = r0.f2512d
            r68 = r0
            java.lang.String r2 = "ۜ۬ۢۖۧۖۘۥۧۦۘۡۤ۠ۥ۬ۙۛۢۨۘۤۖۡ"
            goto L_0x009d
        L_0x0222:
            java.lang.String r2 = "ۜۖۛۢۚۧۘۖۙ۟ۛۖۢۨ"
            r67 = r68
            goto L_0x009d
        L_0x0228:
            r0 = r90
            int r0 = r0.f2511c
            r66 = r0
            java.lang.String r2 = "۫ۗۖۛۛۜۘ۫ۥۗۧۘۘ۫ۤ۠ۛ۬ۡ۟۫۠۫ۤۡ"
            goto L_0x009d
        L_0x0232:
            java.lang.String r2 = "ۧۜۜ۫ۘۥۘۢ۫ۧۤۗ۠۫ۡۛۙۘۘ۟۬ۨ"
            r67 = r66
            goto L_0x009d
        L_0x0238:
            r0 = r69
            r1 = r67
            r0.setColorFilter(r1)
            java.lang.String r2 = "ۥۛۗۙۤۙ۠ۙ۫ۥ۟ۦۘ۫ۥۥۚۨۥۘۥۧۧ"
            goto L_0x009d
        L_0x0243:
            r0 = r90
            android.widget.TextView r0 = r0.f2524p
            r65 = r0
            java.lang.String r2 = "۠ۖۘۘۢۛۨ۟ۖۦۛ۫ۥۘۘ۬ۘۘ۬ۛۗ۟ۘۘۘۜ۫ۦۘ۬ۛۘ"
            goto L_0x009d
        L_0x024d:
            r87 = 1682238891(0x6444edab, float:1.453075E22)
            java.lang.String r2 = "ۛۘۘۨۡۡۘۧۧۢۜۛۚ۫ۖ۠"
        L_0x0252:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1996565510: goto L_0x0263;
                case -1087464405: goto L_0x025c;
                case 1938637131: goto L_0x0268;
                case 2028869647: goto L_0x0833;
                default: goto L_0x025b;
            }
        L_0x025b:
            goto L_0x0252
        L_0x025c:
            java.lang.String r2 = "۠۟ۥۗۧۥ۟۬ۧۥۨۧ۠ۙۢ۫ۢ۠"
            goto L_0x009d
        L_0x0260:
            java.lang.String r2 = "ۙۤۗۡۡۘۘ۫ۜۨۙۡۖۘۘ۫۬"
            goto L_0x0252
        L_0x0263:
            if (r81 == 0) goto L_0x0260
            java.lang.String r2 = "۬ۜ۟ۘۢۜۛۧ۬۫ۖ۠۠۫ۦۘۛۙۢۤۜۧ"
            goto L_0x0252
        L_0x0268:
            java.lang.String r2 = "ۧۙۘۘۢۛۡۘ۫۫ۗۧۦۢۢۢ۠ۤۜۢۘ۟ۦۚۗۜۘ"
            goto L_0x0252
        L_0x026b:
            r0 = r90
            int r0 = r0.f2512d
            r64 = r0
            java.lang.String r2 = "۫ۥۙۧ۫ۙۜ۫ۛۡ۫۠ۧۤۖۦ۠ۘ۬۟ۘ"
            goto L_0x009d
        L_0x0275:
            java.lang.String r2 = "ۧۧۥۘۦ۫ۥۘۥۖۥۘ۟ۨۙۧۚۧ"
            r63 = r64
            goto L_0x009d
        L_0x027b:
            r0 = r90
            int r0 = r0.f2511c
            r62 = r0
            java.lang.String r2 = "ۡ۟۬ۦۖ۟ۧۡۙۤۡۖۘ۫ۚۘۘۢۦۤ۬ۗۤ"
            goto L_0x009d
        L_0x0285:
            java.lang.String r2 = "۟ۘۙۨۨۡۘ۫ۜۖۘۘۛ۫ۦۢ"
            r63 = r62
            goto L_0x009d
        L_0x028b:
            r0 = r65
            r1 = r63
            r0.setTextColor(r1)
            java.lang.String r2 = "ۢۖۜۘ۫ۖۚۧۡۨۗۚۚۗۖۘۘ"
            goto L_0x009d
        L_0x0296:
            r0 = r90
            android.widget.ImageView r0 = r0.f2529u
            r61 = r0
            java.lang.String r2 = "۠۠ۦۙۡۘۡ۠ۥۖۤۨ۬ۚۗۧۡۧۘ"
            goto L_0x009d
        L_0x02a0:
            r87 = 849318338(0x329f91c2, float:1.857632E-8)
            java.lang.String r2 = "ۘ۟ۦۘۢۖۨ۠۫۬ۥۡ۫ۨ۠ۨۛ۫۟ۖۨۧۙۢۤۙ"
        L_0x02a5:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1858138667: goto L_0x02bb;
                case 1121455153: goto L_0x02be;
                case 1747569102: goto L_0x02af;
                case 1937154025: goto L_0x02b6;
                default: goto L_0x02ae;
            }
        L_0x02ae:
            goto L_0x02a5
        L_0x02af:
            java.lang.String r2 = "۟ۙ۬ۘ۠ۡۘۨ۬ۘۡۛۙۚۜۘ"
            goto L_0x009d
        L_0x02b3:
            java.lang.String r2 = "ۙۗۙۖۦۧۗۖۖۘۖۥۤۤۙۥۘۤۡۚۜۡۢۖ۠ۨۨۥۧۘ"
            goto L_0x02a5
        L_0x02b6:
            if (r70 == 0) goto L_0x02b3
            java.lang.String r2 = "ۥۤۨۦ۠ۥ۟ۙۚۚۖۧۘۡ۫ۚۤۖۡۘۙ۬ۘ"
            goto L_0x02a5
        L_0x02bb:
            java.lang.String r2 = "ۚ۟۠ۗ۬ۖۦۢ۫ۨۥۘۖۧۗۗۨۘ"
            goto L_0x02a5
        L_0x02be:
            java.lang.String r2 = "ۛۛۖۘۗۦۧۘۡۘۧۛ۟ۦۧۖۚۚۢۨ۫ۨۗۧ۫ۥۘۥۘۡ"
            goto L_0x009d
        L_0x02c2:
            r87 = 1815077600(0x6c2fe2e0, float:8.505336E26)
            java.lang.String r2 = "ۦ۟ۧۚۢۦۜۤۖۘۘ۠۟ۖۨ۟ۡۦۢۥ۬ۥۨۗۗ"
        L_0x02c7:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1337763969: goto L_0x02dc;
                case -1254237833: goto L_0x083b;
                case 931971374: goto L_0x02d9;
                case 1636221687: goto L_0x02d1;
                default: goto L_0x02d0;
            }
        L_0x02d0:
            goto L_0x02c7
        L_0x02d1:
            if (r81 == 0) goto L_0x02d6
            java.lang.String r2 = "۬۠۠۫ۛ۟ۛۦ۠ۦۢۗۡۘۚۦۨۘ۬۫ۢ۬ۘۧۢ۫۫"
            goto L_0x02c7
        L_0x02d6:
            java.lang.String r2 = "ۦۖۨۡ۟۟ۥ۬۬ۤ۠ۖۘۦۧ۠ۦ۬ۗۢۥۤۨۛ۟ۡۙۦ"
            goto L_0x02c7
        L_0x02d9:
            java.lang.String r2 = "ۗۘۡۡۦۗۨۦۤۘ۫ۘۘۥۛۛۥۦۦۘ۠ۖ۫ۨۧۜۘ"
            goto L_0x02c7
        L_0x02dc:
            java.lang.String r2 = "ۥۘۧۚ۫ۘۘۚۜ۬ۖۗۡۘۙۙۖۘۗۨ"
            goto L_0x009d
        L_0x02e0:
            r0 = r90
            int r0 = r0.f2517i
            r60 = r0
            java.lang.String r2 = "۬ۘ۫ۙۚۨۘ۠۠ۜ۬۠ۙۗۙۜۘ۟ۥ۠"
            goto L_0x009d
        L_0x02ea:
            java.lang.String r2 = "ۦۨۨۗۗ۬ۖۦ۬ۛ۬ۨۖۚۖۦۛۨۡ۟ۚ"
            r59 = r60
            goto L_0x009d
        L_0x02f0:
            r0 = r90
            int r0 = r0.f2518j
            r58 = r0
            java.lang.String r2 = "ۦۢۖۥ۠ۙۤۖۥۘۢۛۜۘۧ۬ۖۘ"
            goto L_0x009d
        L_0x02fa:
            java.lang.String r2 = "ۧۨۤۦۧۖۘۚ۟ۨ۫ۦۥۖۦۡۘ"
            r59 = r58
            goto L_0x009d
        L_0x0300:
            r87 = 1875467658(0x6fc95d8a, float:1.2463914E29)
            java.lang.String r2 = "ۧۛۘۛۗۡۘۤۢ۫ۘۚۧۦۖۜۘۙۛۗۜ۟ۜۘۤۙۧ۬ۥۙ"
        L_0x0305:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1833090932: goto L_0x031b;
                case -305800072: goto L_0x030f;
                case 382322591: goto L_0x083f;
                case 2139033613: goto L_0x0316;
                default: goto L_0x030e;
            }
        L_0x030e:
            goto L_0x0305
        L_0x030f:
            java.lang.String r2 = "ۧۚ۬ۖۘۤۘۢۖۘۤۜۗۢۛۥ۟ۢۡۘۘۥۥۨۥۛ"
            goto L_0x009d
        L_0x0313:
            java.lang.String r2 = "ۚۖ۟۠ۚۨۥۦۘۤ۫ۖۘۢۦۜۘ"
            goto L_0x0305
        L_0x0316:
            if (r81 == 0) goto L_0x0313
            java.lang.String r2 = "ۥۡۧ۟ۥۛۧۘۡۜۘۘۦ۫ۡۘ۠ۨۥ۟ۨۧۘۜۘۧ"
            goto L_0x0305
        L_0x031b:
            java.lang.String r2 = "ۡۤۖۘ۬۠ۥۘۗۘۥۘۦۦۧۦۛ۫ۡۧۧ"
            goto L_0x0305
        L_0x031e:
            r0 = r90
            int r0 = r0.f2513e
            r57 = r0
            java.lang.String r2 = "ۨۥۖۦۖ۠۬۬ۡ۫ۗۜۘۜۡ۟۟ۚ۫ۙۗۗ۫۬"
            goto L_0x009d
        L_0x0328:
            java.lang.String r2 = "۬ۖ۫ۢۖۥۘ۠۠ۢۜۙۜۗۚ"
            r59 = r57
            goto L_0x009d
        L_0x032e:
            r0 = r90
            int r0 = r0.f2514f
            r56 = r0
            java.lang.String r2 = "ۚ۫ۦۘۧۖ۠ۛۧۨۡۚۖۘ۬۬ۛۦۚۢ"
            goto L_0x009d
        L_0x0338:
            java.lang.String r2 = "ۥۛۜۘۖۧۦۘۡۜۧۘۨۥۜۨۘ"
            r59 = r56
            goto L_0x009d
        L_0x033e:
            r0 = r61
            r1 = r59
            r0.setImageResource(r1)
            java.lang.String r2 = "ۤۖ۟ۥۨۢۦۢۖۙ۫ۚ۠ۧ"
            goto L_0x009d
        L_0x0349:
            r0 = r90
            android.widget.ImageView r2 = r0.f2531w
            r87 = 0
            r0 = r87
            r2.setVisibility(r0)
            java.lang.String r2 = "ۤ۟ۨۘۛۤۖۘۤۖۦۘۧ۠ۨۤۨ"
            goto L_0x009d
        L_0x0358:
            r0 = r90
            android.widget.ImageView r0 = r0.f2531w
            r55 = r0
            java.lang.String r2 = "ۧۚۗۘۥۘۥۘۡۘۗ۬ۥۨۚۦ۬ۧۡۢۨ"
            goto L_0x009d
        L_0x0362:
            r87 = 1112575814(0x42508f46, float:52.139915)
            java.lang.String r2 = "ۜۖۡۘۙ۠ۜۧۨۖۘۨۚۘۘۤ۠ۥۘ۟ۛۙۖۗۘۖۦۥ"
        L_0x0367:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -854183069: goto L_0x0379;
                case -390758347: goto L_0x0371;
                case 878246865: goto L_0x0847;
                case 2125943242: goto L_0x037c;
                default: goto L_0x0370;
            }
        L_0x0370:
            goto L_0x0367
        L_0x0371:
            if (r78 == 0) goto L_0x0376
            java.lang.String r2 = "ۚۥۦۜۘۘۥ۬۬۟ۦۜۖ۬ۨۨ۬"
            goto L_0x0367
        L_0x0376:
            java.lang.String r2 = "ۙ۫۫ۙۧۚۜۘ۬ۡۘۖۘۙۧۧ۫ۚ۫ۢۦۚ۬ۖۦۙۢ۟"
            goto L_0x0367
        L_0x0379:
            java.lang.String r2 = "۠ۦۤۢۘۙۡ۫ۗۤۜۦۧۙۧۥۡۘۛۘۢۤۚۚ"
            goto L_0x0367
        L_0x037c:
            java.lang.String r2 = "ۧۨۧۘۜ۟ۚ۠ۡ۟ۖۛۖ۬ۙۦۘ۟ۛۖۘ۫ۨۥۘ"
            goto L_0x009d
        L_0x0380:
            r0 = r90
            int r0 = r0.f2512d
            r54 = r0
            java.lang.String r2 = "ۧۗۚۦ۠ۙۨۧۙۦ۟ۚۦۗ۫ۨۖۥۘۛۘۤۤۧۨ"
            goto L_0x009d
        L_0x038a:
            java.lang.String r2 = "ۙۨۙۨ۟ۢۤۚ۬۟۬ۦۘ۠۟۬"
            r53 = r54
            goto L_0x009d
        L_0x0390:
            r0 = r90
            int r0 = r0.f2511c
            r52 = r0
            java.lang.String r2 = "ۙۦۜۘۥ۠ۥۤ۬۠ۥۙۜۚۦۜۙ۠ۖۥۥ۫ۘۙۛۖۖۦۘ"
            goto L_0x009d
        L_0x039a:
            java.lang.String r2 = "ۜۜۙ۠ۦۖۚۜ۟ۦۡۘۜ۬ۦۘۧۤۧ"
            r53 = r52
            goto L_0x009d
        L_0x03a0:
            r0 = r55
            r1 = r53
            r0.setColorFilter(r1)
            java.lang.String r2 = "ۢۛۜۙ۬۟ۚۧۖۘۦ۠ۥ۬ۘۡۜۗۥ"
            goto L_0x009d
        L_0x03ab:
            java.lang.StringBuilder r51 = new java.lang.StringBuilder
            java.lang.String r2 = "rc_"
            r0 = r51
            r0.<init>(r2)
            java.lang.String r2 = "۟ۢ۬ۢۡۧۘۥۜۨۢۖ۬۠ۜۡۦۦۖ۬ۥۘۘۘۜ"
            goto L_0x009d
        L_0x03b8:
            java.lang.String r2 = com.obwhatsapp.yo.HomeUI.getUIBottomStyle()
            r0 = r51
            r0.append(r2)
            java.lang.String r2 = "۫ۡۢۥۚۜ۬ۜۡۚ۟ۘۚۘۘ"
            goto L_0x009d
        L_0x03c5:
            r87 = 1146182405(0x44515b05, float:837.4222)
            java.lang.String r2 = "ۦۥۦۛۤ۟ۛۚۦۥ۟ۘۛۛۤ۬ۥۜۜۖۜ۟۬ۖۤ"
        L_0x03ca:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1909500963: goto L_0x03db;
                case -1171272891: goto L_0x084f;
                case -100084205: goto L_0x03d4;
                case 698643512: goto L_0x03e0;
                default: goto L_0x03d3;
            }
        L_0x03d3:
            goto L_0x03ca
        L_0x03d4:
            java.lang.String r2 = "ۡۚۢۗۛۨۙ۠ۦۗۗۥۚۛۖۘ۬ۨۥۘ"
            goto L_0x009d
        L_0x03d8:
            java.lang.String r2 = "ۗۖ۫ۤ۟ۥۚۥ۟ۦۜۚۦۡۨۦۗۢۛۡۘۛۤۘ۫ۤۨ"
            goto L_0x03ca
        L_0x03db:
            if (r78 == 0) goto L_0x03d8
            java.lang.String r2 = "ۙۥۘۘۙ۬ۘۧۧۙۧۙۤۢ۠ۖۘ۫ۦ۬ۥۚۜ۬ۢۤۧۛۗ"
            goto L_0x03ca
        L_0x03e0:
            java.lang.String r2 = "ۤۡۘ۫ۛۦۘ۬ۖۗۚۧۦ۫۬ۛۢۘۦۧۢۜۘ"
            goto L_0x03ca
        L_0x03e3:
            java.lang.String r50 = "_group_sel"
            java.lang.String r2 = "ۢۧۖۘۢۥ۬ۛۡۘۥۡۧۘۡ۫ۗۜۢۧ"
            goto L_0x009d
        L_0x03e9:
            java.lang.String r2 = "ۛ۫ۜۘۛۤۚۗۡۘۘۗۦۜۘۤۙۖ۫ۛۥ۫ۡۜۘۘۧۖۘۤۖۚ"
            r49 = r50
            goto L_0x009d
        L_0x03ef:
            java.lang.String r48 = "_group_unsel"
            java.lang.String r2 = "ۚۖۙۘۚۨۘۡۥۥۘۦۖ۫۬ۨۙ۠ۥۨۛۧ۟ۨۦۘۦۡۥۘ"
            goto L_0x009d
        L_0x03f5:
            java.lang.String r2 = "ۙۨۘۜ۟ۦۘۦۛۦۦۜۦۥۜ۠ۤۦۧ"
            r49 = r48
            goto L_0x009d
        L_0x03fb:
            r0 = r51
            r1 = r49
            r0.append(r1)
            java.lang.String r2 = "۬۠ۚۥۖۡۘۛۗۧۨۨۧۨ۠ۤۗۤۥۤۙۘۘ"
            goto L_0x009d
        L_0x0406:
            java.lang.String r47 = r51.toString()
            java.lang.String r2 = "ۧۧۡۖ۟۠۫ۡۡۘ۠ۙۛ۫۠ۗۢ۬ۨ۫۠ۦۥۜۚ"
            goto L_0x009d
        L_0x040e:
            r0 = r90
            android.widget.ImageView r2 = r0.f2531w
            java.lang.String r87 = "drawable"
            r0 = r47
            r1 = r87
            int r87 = com.obwhatsapp.yo.yo.getID(r0, r1)
            r0 = r87
            r2.setImageResource(r0)
            java.lang.String r2 = "ۗ۟ۨۘۢۙ۫ۡ۠ۘۘۜ۠۠ۜۢۗۦۧ۠ۡۙۢ"
            goto L_0x009d
        L_0x0425:
            r0 = r90
            android.widget.TextView r0 = r0.f2525q
            r46 = r0
            java.lang.String r2 = "ۤۚۢۜۦۖۘۨۨۧۦ۟ۥۛ۫ۖۘۛ۟ۡۛۖ۬"
            goto L_0x009d
        L_0x042f:
            r87 = -480135559(0xffffffffe361b679, float:-4.163666E21)
            java.lang.String r2 = "ۦۛۦۛۧۙۚۛ۟ۡۧۦۨ۬ۤۘ۫۫"
        L_0x0434:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -2122038830: goto L_0x043e;
                case -1800807578: goto L_0x0857;
                case -1491809568: goto L_0x044a;
                case -1181069393: goto L_0x0445;
                default: goto L_0x043d;
            }
        L_0x043d:
            goto L_0x0434
        L_0x043e:
            java.lang.String r2 = "ۤۗۘۘۚۖۥۘۙۛۖۘ۫۬ۖ۟ۛۛۖۤۗۨۤۙۘۦۜۘ"
            goto L_0x009d
        L_0x0442:
            java.lang.String r2 = "ۦ۠۬ۥۦۖۗۦ۠ۖۗۡۘۥۜۥ۟ۚۜۘ"
            goto L_0x0434
        L_0x0445:
            if (r78 == 0) goto L_0x0442
            java.lang.String r2 = "ۡۦۢۗۗۜۙۦۜۘ۟ۨۜۘۥۧۤۗۤۚۧ۬ۨۘ۠۠ۦ"
            goto L_0x0434
        L_0x044a:
            java.lang.String r2 = "ۥۡۗۙۖۖ۠۟ۙۢۘۘ۫ۦۢۙ۫ۥ۬ۧۖۚۜ"
            goto L_0x0434
        L_0x044d:
            r0 = r90
            int r0 = r0.f2512d
            r45 = r0
            java.lang.String r2 = "۬ۜۥۘۗ۟۬ۙۡۨۘۨۜۚۨۚۗۘۗۚ"
            goto L_0x009d
        L_0x0457:
            java.lang.String r2 = "ۢۜۡۘۚۛۧۗ۟ۘۖۜۖۘۡۖۥۧۖۘ"
            r44 = r45
            goto L_0x009d
        L_0x045d:
            r0 = r90
            int r0 = r0.f2511c
            r43 = r0
            java.lang.String r2 = "ۚ۟ۜۘۘ۟ۖ۫ۘۧۘۡۢۘۛ۠ۡۘ۟۫۟ۗۗۨۙۗۜۘ"
            goto L_0x009d
        L_0x0467:
            java.lang.String r2 = "ۛۨۡۨۘۘۢۨۚۥۙۚۚۦۖۘ"
            r44 = r43
            goto L_0x009d
        L_0x046d:
            r0 = r46
            r1 = r44
            r0.setTextColor(r1)
            java.lang.String r2 = "ۛۖۗۦ۬ۥۘۘۧۚۙ۠ۘۛۛ۠"
            goto L_0x009d
        L_0x0478:
            r0 = r90
            android.widget.ImageView r2 = r0.f2532x
            r87 = 0
            r0 = r87
            r2.setVisibility(r0)
            java.lang.String r2 = "۬۬۬ۢۢۦۘۚ۟ۨۖۨۡ۠ۧۦۘ"
            goto L_0x009d
        L_0x0487:
            r0 = r90
            android.widget.ImageView r0 = r0.f2532x
            r42 = r0
            java.lang.String r2 = "۠۫ۡۜۥۛۖۡۢۜ۬ۥۘ۟ۢ۠ۦۤۥ"
            goto L_0x009d
        L_0x0491:
            r87 = -229100899(0xfffffffff258329d, float:-4.2822368E30)
            java.lang.String r2 = "ۙۧۛۡ۬ۢۘ۫۬ۖۛۚۨۡۡۘۧۗۦۘۜۧۘۘۛ۟ۘۘۡ۫ۨۘ"
        L_0x0496:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1175374086: goto L_0x04a0;
                case -515509156: goto L_0x04ab;
                case 821147190: goto L_0x085f;
                case 1161201564: goto L_0x04a6;
                default: goto L_0x049f;
            }
        L_0x049f:
            goto L_0x0496
        L_0x04a0:
            java.lang.String r2 = "ۖۚ۬ۙ۬۟۬ۙۖ۫۬ۦۘۥۘ۬ۙۢۡۘ"
            goto L_0x0496
        L_0x04a3:
            java.lang.String r2 = "ۜۜۙۥۥۘۦۘۧۦۖۘ۟ۖۢ۫۫ۥۧۦ"
            goto L_0x0496
        L_0x04a6:
            if (r75 == 0) goto L_0x04a3
            java.lang.String r2 = "ۡ۫۬ۢۜ۫ۙۛۥۨۚۛۨۚ"
            goto L_0x0496
        L_0x04ab:
            java.lang.String r2 = "ۚۛۨ۬ۨۡ۬ۚۛۙۢۜۛ۬ۡ۬ۘۧۤ۫ۨۛۧۛۚۚۛ"
            goto L_0x009d
        L_0x04af:
            r0 = r90
            int r0 = r0.f2512d
            r41 = r0
            java.lang.String r2 = "ۧۗۧۚ۫ۢۖۥۗۛۡۧۘۜ۫ۤ"
            goto L_0x009d
        L_0x04b9:
            java.lang.String r2 = "ۧ۟۟۠ۜۜۡۘۨۘۨۡۜۘۗۜۥ"
            r40 = r41
            goto L_0x009d
        L_0x04bf:
            r0 = r90
            int r0 = r0.f2511c
            r39 = r0
            java.lang.String r2 = "۟۠۟ۘۚۚۧۚۖۘۛۙۖۢۖ۫ۗ۬ۤ۬ۚۖۘۛۛ"
            goto L_0x009d
        L_0x04c9:
            java.lang.String r2 = "۫ۛۦۘۚۗ۫ۦۗۥۥ۟ۤۤۜ۟"
            r40 = r39
            goto L_0x009d
        L_0x04cf:
            r0 = r42
            r1 = r40
            r0.setColorFilter(r1)
            java.lang.String r2 = "۫ۛۥۘۥ۟۫ۤۜۦۨۚۦۖ۠ۡۘۛۤۗۖۚۢۥۦۥۘ"
            goto L_0x009d
        L_0x04da:
            java.lang.StringBuilder r38 = new java.lang.StringBuilder
            java.lang.String r2 = "rc_"
            r0 = r38
            r0.<init>(r2)
            java.lang.String r2 = "ۖۙۖۘۘۢۤ۠ۡۜ۫۠ۦۘ۠ۨۥۘ"
            goto L_0x009d
        L_0x04e7:
            java.lang.String r2 = com.obwhatsapp.yo.HomeUI.getUIBottomStyle()
            r0 = r38
            r0.append(r2)
            java.lang.String r2 = "۫ۧۢۚۥۧۘ۟ۙۗۛ۫ۘ۫ۜۘۡۘۢۥۧۘ۫ۨۨ"
            goto L_0x009d
        L_0x04f4:
            r87 = -1360833021(0xffffffffaee35603, float:-1.03380436E-10)
            java.lang.String r2 = "ۨۧۡۘۖۜۘ۬ۘۘۖۖۧ۬ۤۦ۟ۢ۬ۗۗۤۚۥۧۛۖ"
        L_0x04f9:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -574159143: goto L_0x050b;
                case 58987334: goto L_0x0503;
                case 527923388: goto L_0x0867;
                case 1622729237: goto L_0x050e;
                default: goto L_0x0502;
            }
        L_0x0502:
            goto L_0x04f9
        L_0x0503:
            if (r75 == 0) goto L_0x0508
            java.lang.String r2 = "ۚۗۜۖۖۘۗ۫ۗۗۤۘۘۙۗۚۢۗۖۘۥۨۚۥۗۘۙۨۘۘ"
            goto L_0x04f9
        L_0x0508:
            java.lang.String r2 = "۬۫۟ۚۥ۟ۦ۟ۥۘ۫۬ۧۥ"
            goto L_0x04f9
        L_0x050b:
            java.lang.String r2 = "ۢ۬ۘ۟ۖۘۗۚۜۘۢۖۗۥ۠ۛ۬ۢۜۚۢۡۘ"
            goto L_0x04f9
        L_0x050e:
            java.lang.String r2 = "۫ۗۘۘۘ۟ۤۢ۠ۤۚ۠ۛۤۘۢۤ۫ۗ"
            goto L_0x009d
        L_0x0512:
            java.lang.String r37 = "_status_sel"
            java.lang.String r2 = "ۦ۟ۡۘۨۚۖۤۥۥۦ۠ۚ۫ۨۡۘۦۥۤۙ۬ۜۢ۫ۚۜۛ"
            goto L_0x009d
        L_0x0518:
            java.lang.String r2 = "ۚۥۨۛۚ۫ۢۥ۠ۗۥۥۘ۠ۥۨۗۘۡۘ"
            r36 = r37
            goto L_0x009d
        L_0x051e:
            java.lang.String r35 = "_status_unsel"
            java.lang.String r2 = "ۧۥۡ۫ۖۥۘۜۚۤۚۘۗۘ۫ۧ"
            goto L_0x009d
        L_0x0524:
            java.lang.String r2 = "ۨ۬ۘۘ۫ۤ۠۬ۘۧۘ۟۫ۗۢ۬ۥ"
            r36 = r35
            goto L_0x009d
        L_0x052a:
            r0 = r38
            r1 = r36
            r0.append(r1)
            java.lang.String r2 = "۟ۜۙۡۤۤ۫ۖۨۘۦۨۨۛۗ۬"
            goto L_0x009d
        L_0x0535:
            java.lang.String r34 = r38.toString()
            java.lang.String r2 = "ۢ۟۬ۙ۠ۜۚ۠ۥۢۛۢ۠ۥۘ"
            goto L_0x009d
        L_0x053d:
            r0 = r90
            android.widget.ImageView r2 = r0.f2532x
            java.lang.String r87 = "drawable"
            r0 = r34
            r1 = r87
            int r87 = com.obwhatsapp.yo.yo.getID(r0, r1)
            r0 = r87
            r2.setImageResource(r0)
            java.lang.String r2 = "ۘۦۥۘ۟ۨۙۙۧۖۨۖۦ۠۬ۛۖۧۘۘۤۧۢۦۙ۟"
            goto L_0x009d
        L_0x0554:
            r0 = r90
            android.widget.TextView r0 = r0.f2526r
            r33 = r0
            java.lang.String r2 = "۫ۚۥۜ۫ۜۘۖۡۜۜۛۢۥ۫ۦۘ"
            goto L_0x009d
        L_0x055e:
            r87 = -1573726428(0xffffffffa232d724, float:-2.4237393E-18)
            java.lang.String r2 = "ۨ۠۬۫ۨۙۧۚۖۙۤۛ۠۫ۖۘ۠ۨۥۘۡ۫ۗۤۥۜۘ"
        L_0x0563:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1425993219: goto L_0x086f;
                case -1373859639: goto L_0x0573;
                case 1415995556: goto L_0x056d;
                case 1595708958: goto L_0x0578;
                default: goto L_0x056c;
            }
        L_0x056c:
            goto L_0x0563
        L_0x056d:
            java.lang.String r2 = "ۧۙۤۢۦ۠۠۫ۧ۫ۥۤۦۦۦۗۘۧۘ۫ۜ۫"
            goto L_0x0563
        L_0x0570:
            java.lang.String r2 = "ۜۨۥۨۡۜۘۙ۫ۡۜۘۛۗۛۡۘۥۦۛۥۘۘۚ۟ۢ"
            goto L_0x0563
        L_0x0573:
            if (r75 == 0) goto L_0x0570
            java.lang.String r2 = "ۖ۠ۡۥۛۛ۠ۘ۠ۗ۬ۨۙۜۙۜۦۧ"
            goto L_0x0563
        L_0x0578:
            java.lang.String r2 = "ۡۨ۟ۨۥۧ۫۬ۘۙ۟ۗۗۢ"
            goto L_0x009d
        L_0x057c:
            r0 = r90
            int r0 = r0.f2512d
            r32 = r0
            java.lang.String r2 = "ۚۙۚۦ۫ۥۘ۬ۧۨۘۢۚۢۨۖۛۨۚۨۜۛۚ"
            goto L_0x009d
        L_0x0586:
            java.lang.String r2 = "ۚۙۜ۟ۡۘۦۥ۟ۙۧۗۦ۫ۘۜۢۜۖۚۘ"
            r31 = r32
            goto L_0x009d
        L_0x058c:
            r0 = r90
            int r0 = r0.f2511c
            r30 = r0
            java.lang.String r2 = "ۡ۟ۨ۬ۧۡۚۡۡۘۦۧۖۗۚۨۘۡۢ۠"
            goto L_0x009d
        L_0x0596:
            java.lang.String r2 = "ۧۥۧۘ۫ۜۦۘۘۨ۬ۢۚۗۘ۠ۜۘ"
            r31 = r30
            goto L_0x009d
        L_0x059c:
            r0 = r33
            r1 = r31
            r0.setTextColor(r1)
            java.lang.String r2 = "ۗۖۜۘۙۙۘۘۦ۠ۥۙ۠ۡۛۦۨۢۜۖۨۧۘ"
            goto L_0x009d
        L_0x05a7:
            r0 = r90
            android.widget.ImageView r2 = r0.f2528t
            r87 = 0
            r0 = r87
            r2.setVisibility(r0)
            java.lang.String r2 = "۬ۛ۠ۙۤۦۘۖۙۦۙۖ۠ۙۤۨۘۚۘۨ۬ۤۨۘۡۚۥۘۧ۠ۦ"
            goto L_0x009d
        L_0x05b6:
            r0 = r90
            android.widget.ImageView r0 = r0.f2528t
            r29 = r0
            java.lang.String r2 = "۫ۢۨۘ۠ۦۨ۫ۢ۫ۙۚ۠ۘۜۘۤۢۨۘ۫۠۠ۡۧۙ"
            goto L_0x009d
        L_0x05c0:
            r87 = 357627150(0x1550f50e, float:4.219858E-26)
            java.lang.String r2 = "۫ۖ۬۟ۧۡۘۢ۫ۡۘ۬ۥۨ۠۬ۦۘۜۖۗۦ۠ۨ"
        L_0x05c5:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1213595747: goto L_0x05cf;
                case -961260863: goto L_0x0877;
                case 1685060880: goto L_0x05d5;
                case 1783177021: goto L_0x05da;
                default: goto L_0x05ce;
            }
        L_0x05ce:
            goto L_0x05c5
        L_0x05cf:
            java.lang.String r2 = "۟۫ۘۘۤ۫ۤۘۜۘۚ۟ۖۘ۬ۦۗ"
            goto L_0x05c5
        L_0x05d2:
            java.lang.String r2 = "ۚۗۦۘۨۨۛۗۚۦۨۧۗۦۗۤۘۚۚۤ۫ۜۘۧ۫ۖۘ"
            goto L_0x05c5
        L_0x05d5:
            if (r72 == 0) goto L_0x05d2
            java.lang.String r2 = "ۢۖۘۘۜۨۨۨۧۗ۬ۢۖۡۜۘۤۛ۠۠ۖۥ"
            goto L_0x05c5
        L_0x05da:
            java.lang.String r2 = "۫ۢۘۘۡۦ۠ۗۧۗۥۦ۟ۗ۟ۚ"
            goto L_0x009d
        L_0x05de:
            r0 = r90
            int r0 = r0.f2512d
            r28 = r0
            java.lang.String r2 = "ۘۧۥ۠ۗۤ۫ۧۛ۬ۗۘۘۘۥۨۘۘۨۛ"
            goto L_0x009d
        L_0x05e8:
            java.lang.String r2 = "ۤۡۛ۟ۙۚۘ۫ۗۜ۬ۥۘۙۚۥۚۡۧ۫ۡۨ۬ۢۥ"
            r27 = r28
            goto L_0x009d
        L_0x05ee:
            r0 = r90
            int r0 = r0.f2511c
            r26 = r0
            java.lang.String r2 = "ۘ۠۠ۥۢۛۧ۟ۛۥ۟ۤۥۧۤ"
            goto L_0x009d
        L_0x05f8:
            java.lang.String r2 = "ۛ۠۬ۨۖۧ۟ۥ۟۬۟ۖۘۙۦ۫۬ۤۚ۬"
            r27 = r26
            goto L_0x009d
        L_0x05fe:
            r0 = r29
            r1 = r27
            r0.setColorFilter(r1)
            java.lang.String r2 = "ۖۨۨۘ۠ۜۨۘۥۗۢۘۛۚۗۧۥ۠ۤۛۡۢۗ"
            goto L_0x009d
        L_0x0609:
            r87 = 2110424742(0x7dca86a6, float:3.3650399E37)
            java.lang.String r2 = "ۘۨۥ۫ۘ۬ۗۡۡۘ۬ۗ۬ۦۗۧ۟ۖۘ"
        L_0x060e:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -2095385682: goto L_0x0624;
                case -355640572: goto L_0x0883;
                case -343624409: goto L_0x061f;
                case 1994325819: goto L_0x0618;
                default: goto L_0x0617;
            }
        L_0x0617:
            goto L_0x060e
        L_0x0618:
            java.lang.String r2 = "ۤۗۨۘۚۗۛۡۡ۟ۖۖۘۘۙۢۤ"
            goto L_0x009d
        L_0x061c:
            java.lang.String r2 = "ۜۨۜۘۤ۟ۥۛۘ۠ۡ۬ۘ۟ۥۨۘ۫ۜۚ۠ۦۨۨۥۤۥۨۥۘ"
            goto L_0x060e
        L_0x061f:
            if (r70 == 0) goto L_0x061c
            java.lang.String r2 = "۫ۢۥۡۦۧ۬ۢۖۘ۬ۙۜۘۨۧۜ"
            goto L_0x060e
        L_0x0624:
            java.lang.String r2 = "۫ۨۡۧۥۥۛۙۜۥۜۡۘۗ۠ۖۘۧ۬۟۠ۖۛۢ۬ۨۘۨۗۥ"
            goto L_0x060e
        L_0x0627:
            r0 = r90
            android.widget.ImageView r0 = r0.f2528t
            r25 = r0
            java.lang.String r2 = "ۡۧۥۘۛۖۗۤۜۘۘۛۗۤۡۙۧۥۨۜۘ"
            goto L_0x009d
        L_0x0631:
            r87 = 1593252776(0x5ef71ba8, float:8.9030051E18)
            java.lang.String r2 = "۫۠ۦۘۧ۠ۖۘ۫ۗۨۤۘۙ۫ۨۦۘۥ۠ۘۘ"
        L_0x0636:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -191228550: goto L_0x087f;
                case 1691009341: goto L_0x0640;
                case 1872095480: goto L_0x0648;
                case 1879652371: goto L_0x064b;
                default: goto L_0x063f;
            }
        L_0x063f:
            goto L_0x0636
        L_0x0640:
            if (r72 == 0) goto L_0x0645
            java.lang.String r2 = "ۤۧۚۤۥ۟۫ۨۨۘ۫ۥۡۘ۫ۤۤ۠ۚۥۢ۫ۜۦۦۖۘ"
            goto L_0x0636
        L_0x0645:
            java.lang.String r2 = "ۢۧۖۙ۟ۢۚۜۘۛۘ۠ۨۡۘۨۙۖۘۛۜ۫ۥۢۛۥ۫ۦ"
            goto L_0x0636
        L_0x0648:
            java.lang.String r2 = "ۖۢۥ۫۠ۖۢۦۦۘۤ۫ۡۖۦۢۛ۫ۡ"
            goto L_0x0636
        L_0x064b:
            java.lang.String r2 = "۟ۖۨۘۡۢۦۥۖۢۗ۫ۢۢۛۙ۫ۨۧۖۗۚ"
            goto L_0x009d
        L_0x064f:
            r0 = r90
            int r0 = r0.f2519k
            r23 = r0
            java.lang.String r2 = "۫ۙۤۛۥ۫ۖۨۥۘۨ۠ۦۚۢۖ۬ۡۧۘۖۦۖۘ"
            goto L_0x009d
        L_0x0659:
            java.lang.String r2 = "ۙۚ۠ۜۥۗۧۛۙۨۥۙۘۤۖۘۖ۬ۨۡ۠ۢ"
            r24 = r25
            goto L_0x009d
        L_0x065f:
            java.lang.String r2 = "ۖ۟ۨۘۨۙ۬ۜۛ۬ۘ۬۠ۨ۟ۙۜۗۛۚۙۥۘ۠ۘ"
            r22 = r23
            goto L_0x009d
        L_0x0665:
            r0 = r90
            int r0 = r0.f2520l
            r21 = r0
            java.lang.String r2 = "ۦۚۛ۠ۢۦۘۤۙۥۘۜۙۘۘۗۥۧۡۖۛ۬۟ۜۘ"
            goto L_0x009d
        L_0x066f:
            java.lang.String r2 = "ۦ۬ۤۖۤۘۘۚۨ۬ۢ۟ۧۘۙۖ۫ۡۡۘ"
            r24 = r25
            goto L_0x009d
        L_0x0675:
            java.lang.String r2 = "ۖ۠ۥۘۛۡۖۗۧۖۘۥ۬۬۫"
            r22 = r21
            goto L_0x009d
        L_0x067b:
            r0 = r90
            android.widget.ImageView r0 = r0.f2528t
            r20 = r0
            java.lang.String r2 = "ۥ۟ۥۘ۟ۖۚۚۤ۫ۡۨۨۜۖۥۘ۬ۥۧۘۡۘ۠ۗۖۙ"
            goto L_0x009d
        L_0x0685:
            r87 = 1959726611(0x74cf0e13, float:1.3123668E32)
            java.lang.String r2 = "ۦۨۧۘۢۧۡ۫ۚۤ۫ۚۧۢۗۘۖۥۦۘۤۖ۫۫ۚۨۖۧ"
        L_0x068a:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1273869445: goto L_0x069c;
                case -950791014: goto L_0x0694;
                case -234886403: goto L_0x0887;
                case 2028238850: goto L_0x069f;
                default: goto L_0x0693;
            }
        L_0x0693:
            goto L_0x068a
        L_0x0694:
            if (r72 == 0) goto L_0x0699
            java.lang.String r2 = "ۡ۫ۚۗۢ۬ۧ۫ۢۚۡ۫ۦۡۜۦۚۖۖۚ۟۟ۘۖۦۡۥۘ"
            goto L_0x068a
        L_0x0699:
            java.lang.String r2 = "ۚۧ۟ۛۙۗۦۥۥۘۤۜ۠ۚۡۢۧ۬۟"
            goto L_0x068a
        L_0x069c:
            java.lang.String r2 = "۟ۥۥۚۗ۫۬ۚۛۛ۟ۖۘۤۛۚۛۤ۫ۙ۬۫ۧۤۜۘۘۤ۫"
            goto L_0x068a
        L_0x069f:
            java.lang.String r2 = "ۘۚۛۥۛۦۚۡۡۘۡۨۖۘۢ۬ۛ۬ۧۢۦۧ"
            goto L_0x009d
        L_0x06a3:
            r0 = r90
            int r0 = r0.f2515g
            r19 = r0
            java.lang.String r2 = "ۥۖۡۘۦ۠ۧۥۛۦ۫ۧۡۗۙ۬ۛ۠۬ۦۥۘ۟ۢۘۘ"
            goto L_0x009d
        L_0x06ad:
            java.lang.String r2 = "ۙ۬ۦۚۜۥۘۗ۟ۘۦۢۗۙۙ۠ۚۛۦۘ"
            r24 = r20
            goto L_0x009d
        L_0x06b3:
            java.lang.String r2 = "۫ۨۢۜ۟ۛ۠ۙۙۗۜۥۡۢۨۘ"
            r22 = r19
            goto L_0x009d
        L_0x06b9:
            r0 = r90
            int r0 = r0.f2516h
            r18 = r0
            java.lang.String r2 = "ۢۙۢۜۜۢۜ۬ۨ۠ۨ۟۬ۘۜۛۡۜۘۥۡۘۘ۫ۡۖۤ۬۬"
            goto L_0x009d
        L_0x06c3:
            java.lang.String r2 = "ۥۡۘۘۢ۫ۢ۠ۛۘۙ۠ۜۘۘ۬ۜۘۧۖ۬۬ۙ۟"
            r22 = r18
            goto L_0x009d
        L_0x06c9:
            java.lang.String r2 = "ۥۧۦۘۢ۠ۙ۟ۨۡۘۘۨۤ۠ۚۡۤۧۖۘۢۘ۠"
            r24 = r20
            goto L_0x009d
        L_0x06cf:
            r0 = r24
            r1 = r22
            r0.setImageResource(r1)
            java.lang.String r2 = "ۛۚۘۘۜۛۡۜ۟ۦ۬ۨۥۚۙۗۧۡۧ۟۟ۨۘ"
            goto L_0x009d
        L_0x06da:
            r0 = r90
            android.widget.TextView r0 = r0.f2527s
            r17 = r0
            java.lang.String r2 = "ۛۘۥۘۡۨۦۘۖۜۖ۫۬۟ۨ۫ۗۥۧۜۘۘۦ۟ۡۧۡۘ"
            goto L_0x009d
        L_0x06e4:
            r87 = 1414252677(0x544bc885, float:3.50097008E12)
            java.lang.String r2 = "ۚ۟ۘۘ۬ۦۥۘۧ۫ۦۢۗۙۜۤۢۤۢ۫ۨۡۘۚۧۦۦ۟ۦ"
        L_0x06e9:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -688091415: goto L_0x06fa;
                case 806172958: goto L_0x088f;
                case 1367115961: goto L_0x06ff;
                case 1995716252: goto L_0x06f3;
                default: goto L_0x06f2;
            }
        L_0x06f2:
            goto L_0x06e9
        L_0x06f3:
            java.lang.String r2 = "ۢ۬ۢۡۢۜ۫ۦ۠ۖۢۜۘۘۥۖۘۤۙۚ"
            goto L_0x009d
        L_0x06f7:
            java.lang.String r2 = "۟۠ۖۗۥۡۘۙۨۤۧۨۗۢ۫ۡۘ"
            goto L_0x06e9
        L_0x06fa:
            if (r72 == 0) goto L_0x06f7
            java.lang.String r2 = "ۖۨۨۘۥۛۜۘۛۢۥۘۜۜۥۥۛۧۧۛۖۘۢۜۦ"
            goto L_0x06e9
        L_0x06ff:
            java.lang.String r2 = "ۥۢۘۘ۬ۚۢۤۗ۟ۘۖۙۜۧۙۜۚۗۥۜۧۘ"
            goto L_0x06e9
        L_0x0702:
            r0 = r90
            int r0 = r0.f2512d
            r16 = r0
            java.lang.String r2 = "۫۬ۦۘۥۚۡۢۗۦۘۛۡۛۛ۫۫"
            goto L_0x009d
        L_0x070c:
            java.lang.String r2 = "ۚ۠ۦۘۛۗۛۢۨۘۧۙۘۘ۫ۖۚ۬ۥۧۘ۬ۨ۬ۨۢۢۥۘ"
            r15 = r16
            goto L_0x009d
        L_0x0712:
            r0 = r90
            int r14 = r0.f2511c
            java.lang.String r2 = "ۡ۫ۥۘ۫ۛۦۘۦۜۥۦ۬ۡۘۤ۬ۤۤۖۥۘۙۚۥۗۗ"
            goto L_0x009d
        L_0x071a:
            java.lang.String r2 = "ۛۡۧۘۥۢۚ۬ۥۘۘۜۘ۫ۤۢۙۦۛ۫ۨۚۗ۠ۛۡ"
            r15 = r14
            goto L_0x009d
        L_0x071f:
            r0 = r17
            r0.setTextColor(r15)
            java.lang.String r2 = "۫ۡۡۘ۠ۨۦ۬ۘۘۜۗ۟ۖ۫ۗ"
            goto L_0x009d
        L_0x0728:
            r87 = -907686098(0xffffffffc9e5cf2e, float:-1882597.8)
            java.lang.String r2 = "ۤۧۗۘۙۜۘۛۥۘۙۨۦۘۙۗ۫۠ۨ۬ۗ۟ۥۘ"
        L_0x072d:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case 1127777415: goto L_0x0737;
                case 1486989406: goto L_0x073e;
                case 1869195880: goto L_0x0745;
                case 2130662342: goto L_0x089f;
                default: goto L_0x0736;
            }
        L_0x0736:
            goto L_0x072d
        L_0x0737:
            java.lang.String r2 = "ۧۘ۫ۜۧ۬۬ۢۥۥۤ۬ۚۘۤ۫ۚۘۘۡۡۥۘۨۦۘ"
            goto L_0x009d
        L_0x073b:
            java.lang.String r2 = "ۦ۟ۨۘ۫ۦۢۡۥۜۘۤۨ۟ۡ۫ۛۢۚۜۘ"
            goto L_0x072d
        L_0x073e:
            boolean r2 = com.obwhatsapp.yo.yo.isCommunityEnabled
            if (r2 == 0) goto L_0x073b
            java.lang.String r2 = "ۥۙۨۘۤۡۨۧۦۦۖۤۡۘ۠۠ۥۘۗۖۦۘۡ۫ۧ۟ۚۡۚۜۚ"
            goto L_0x072d
        L_0x0745:
            java.lang.String r2 = "ۛۜۥۘۦۘۨۜۦۙ۫۬ۙۛۧ۠"
            goto L_0x072d
        L_0x0748:
            r0 = r90
            android.widget.ImageView r13 = r0.f2530v
            java.lang.String r2 = "ۘۖۧۤ۫ۚۘۖۘۧۚۗ۬ۛۥۛۛ۠ۛۡۜۘ۟۫۫ۚۙۚ"
            goto L_0x009d
        L_0x0750:
            r87 = 359745293(0x1571470d, float:4.8725612E-26)
            java.lang.String r2 = "ۡۡۦۘۢۚۢۢۜۧۘ۬ۚۘۗ۟۟ۤۛۘۘۢۙ۠"
        L_0x0755:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -2080994801: goto L_0x0765;
                case -717277716: goto L_0x076a;
                case 900838421: goto L_0x075f;
                case 1257160775: goto L_0x0897;
                default: goto L_0x075e;
            }
        L_0x075e:
            goto L_0x0755
        L_0x075f:
            java.lang.String r2 = "ۦۙۜ۬ۚۤ۟۠۬ۜ۟ۦۘۨۧۨ۠۠ۙۥۦۥ"
            goto L_0x0755
        L_0x0762:
            java.lang.String r2 = "ۚ۠۠ۦۙۨۘ۠ۢۦ۟ۧۦۘۢۥ۠۠۬ۖ۫ۥ۫ۦۘۜۚۡۘ"
            goto L_0x0755
        L_0x0765:
            if (r84 == 0) goto L_0x0762
            java.lang.String r2 = "ۖۢۥ۟ۥۨۘۤۛۥۘۨۢۜ۟ۗۙ"
            goto L_0x0755
        L_0x076a:
            java.lang.String r2 = "ۗۡۦۘ۠ۢ۬ۖۛۛ۠ۢ۫۬ۛۛۙۡۖۘۛ۠ۦۢۨۙ۫ۖۗ"
            goto L_0x009d
        L_0x076e:
            r0 = r90
            int r12 = r0.f2512d
            java.lang.String r2 = "ۢۤۘۚ۬ۡۛۨۛۥۨۙ۫۬ۜۘ۬۬ۖۘۖ۫ۘۘ"
            goto L_0x009d
        L_0x0776:
            java.lang.String r2 = "ۛ۫ۡۤ۟ۦۘۜۗ۟ۛۦۧۤ۬ۡۘ"
            r11 = r12
            goto L_0x009d
        L_0x077b:
            r0 = r90
            int r10 = r0.f2511c
            java.lang.String r2 = "۠ۙۖۘ۠ۦۧۘۖۦۚۡۨۙۧۖۖ۫ۤۘ۫ۡ۠ۢۜۘ"
            goto L_0x009d
        L_0x0783:
            java.lang.String r2 = "ۡۡۖۦۘ۠۠ۖۜۘۗ۫ۙۢۜۦۙۖۘ"
            r11 = r10
            goto L_0x009d
        L_0x0788:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r13.setColorFilter(r11, r2)
            java.lang.String r2 = "۟ۤۦۗۛ۬ۡۖۤۡ۠ۛ۠ۙۗۦۜۘۘۧۚ۫"
            goto L_0x009d
        L_0x0791:
            r0 = r90
            android.widget.TextView r8 = r0.f2523o
            java.lang.String r2 = "ۛۦ۠ۧ۠ۢ۠ۥۦۡ۫ۛ۫ۤۥۘ"
            goto L_0x009d
        L_0x0799:
            java.lang.String r2 = "۬ۨۨۦۧۜ۫ۛۗۥۤۚۙۢ۟ۘۥۦۘ"
            r9 = r8
            goto L_0x009d
        L_0x079e:
            r87 = -714204764(0xffffffffd56e19a4, float:-1.63621183E13)
            java.lang.String r2 = "ۡۜۨۘۙۦ۟ۜ۟ۜۘ۠ۨۡۘ۠ۥ۫"
        L_0x07a3:
            int r88 = r2.hashCode()
            r88 = r88 ^ r87
            switch(r88) {
                case -1180605734: goto L_0x08a3;
                case 451842527: goto L_0x07b8;
                case 467502533: goto L_0x07b3;
                case 1867851348: goto L_0x07ad;
                default: goto L_0x07ac;
            }
        L_0x07ac:
            goto L_0x07a3
        L_0x07ad:
            java.lang.String r2 = "ۗ۫ۤ۠ۥۧۦۧ۫۟ۥۢۡۢ۠۫ۛۙ۫ۗۦۙۨ"
            goto L_0x07a3
        L_0x07b0:
            java.lang.String r2 = "۠ۗۛۧۡۧۘۗ۬۟ۧۙۖۘ۟ۖۧۘۖۢۚۗۧۡۘ"
            goto L_0x07a3
        L_0x07b3:
            if (r84 == 0) goto L_0x07b0
            java.lang.String r2 = "ۙۜۘ۟ۢۜ۬ۘۘۧۘۥ۬ۥۨۥۙۘۘۨ۠ۘۘۧ۟ۗ"
            goto L_0x07a3
        L_0x07b8:
            java.lang.String r2 = "ۚۢۢۨۖۡۘۗۚۥۖۚۨۘۘ۬ۛۢ۬ۦۜۧۨۘۨۖۥۜۧۜۘ"
            goto L_0x009d
        L_0x07bc:
            r0 = r90
            int r6 = r0.f2512d
            java.lang.String r2 = "ۙ۠ۜۘۨۧ۠ۢۧۚۢ۠۬ۡ۟ۡۘۙۗۜۘۤۤۢۨۤۖۙۢ"
            goto L_0x009d
        L_0x07c4:
            java.lang.String r2 = "ۨۢۘ۬ۚ۬ۚۧ۬۬۠۫ۡۘۘ۟ۤۘۤۗۨۤۜۘ"
            r7 = r8
            goto L_0x009d
        L_0x07c9:
            java.lang.String r2 = "ۘۚۚ۬ۖۧۖۘۘ۟ۢ۠ۘۡۖۘۡۦۗۨۧ"
            r5 = r6
            goto L_0x009d
        L_0x07ce:
            r0 = r90
            android.widget.ImageView r2 = r0.f2530v
            r0 = r90
            int r0 = r0.f2511c
            r87 = r0
            r0 = r87
            r2.setColorFilter(r0)
            java.lang.String r2 = "ۡۤۘۚ۟ۦۘۖۧۗۢۨۘۘۦۘۗ۬ۘ"
            goto L_0x009d
        L_0x07e1:
            r0 = r90
            android.widget.TextView r4 = r0.f2523o
            java.lang.String r2 = "ۜۙۡۘۜۢۛۦۤۗۢۡۦۢۦۘ۫۬ۛۛۚۦۘ۫ۧۥۘۧۥۨۘ"
            goto L_0x009d
        L_0x07e9:
            java.lang.String r2 = "ۙۡ۟ۙۨ۠ۥۙۥۘ۫ۤ۠۠ۛۨۘ"
            r9 = r4
            goto L_0x009d
        L_0x07ee:
            r0 = r90
            int r3 = r0.f2511c
            java.lang.String r2 = "ۖۖۥۨۘۦۘۨۤۚۙۛۚ۫۬ۙ۫۬ۥۘۛۦۜۢۘۜۦ۬ۖ"
            goto L_0x009d
        L_0x07f6:
            java.lang.String r2 = "ۚۤۖۘ۠ۜۦۜۖۘ۠ۙۜۘۧۥ۬"
            r5 = r3
            goto L_0x009d
        L_0x07fb:
            java.lang.String r2 = "ۘۥ۬۠۠ۖۘۙۚ۬ۥ۠ۡ۠ۤۜ۟۟ۡۥۜۥ"
            r7 = r9
            goto L_0x009d
        L_0x0800:
            r7.setTextColor(r5)
            java.lang.String r2 = "۠۠۫ۛۘۥ۬ۡۡۘۘ۫۠ۜۘۙ۫ۖۘۛۘۖۘ"
            goto L_0x009d
        L_0x0807:
            java.lang.String r2 = "ۤۛۖۘۤۘۡۡۧۖۘۗۖۥۘۡ۫ۢۗۜۤۡۚۦ"
            goto L_0x009d
        L_0x080b:
            java.lang.String r2 = "ۚۖۛۦۘۧۗۥۖ۠۠ۢۢۡۨ"
            goto L_0x009d
        L_0x080f:
            java.lang.String r2 = "ۘۡۥۘۧۤ۟ۖ۬ۨۛ۠ۥۘ۫ۧۖ۠۬ۡ"
            goto L_0x009d
        L_0x0813:
            java.lang.String r2 = "ۨۦۙ۟ۖۤ۬ۡۛۢ۬۬ۜۜۡ۠۫ۘ"
            goto L_0x009d
        L_0x0817:
            java.lang.String r2 = "ۜۡۨۧۡۡ۠ۙۖۜۚۥۚۖۥۘۛۢۙۜۦۧۘۖۡۘ"
            goto L_0x009d
        L_0x081b:
            java.lang.String r2 = "ۙۡۧۙۧۛ۫۠ۖ۠۟ۙۦۥۘۡۜۧ۠ۙ"
            goto L_0x009d
        L_0x081f:
            java.lang.String r2 = "ۧۢۜ۬۫ۡۘۗۖۚۛۜۥۘۢ۬ۜۘۤۛ۬ۚۘۖ۫ۜ"
            goto L_0x009d
        L_0x0823:
            java.lang.String r2 = "ۢۜۦۗۦ۬ۖۘۚ۬ۙ۫ۨۚۜۡۜ۟ۡۡۚۨۖۖۘۛۚۗ"
            goto L_0x009d
        L_0x0827:
            java.lang.String r2 = "ۢۨۦۘ۫ۦۖۧۤۜۘۡۨۘ۟۟ۧ۫ۧۧ۠ۖۘۥۜۦۘ"
            goto L_0x009d
        L_0x082b:
            java.lang.String r2 = "ۗۙۜۘۤۦۧۘ۫ۦۚۜۜۙۢۡۘ"
            goto L_0x009d
        L_0x082f:
            java.lang.String r2 = "ۧۜۜ۫ۘۥۘۢ۫ۧۤۗ۠۫ۡۛۙۘۘ۟۬ۨ"
            goto L_0x009d
        L_0x0833:
            java.lang.String r2 = "ۘۜۡ۬۬ۖۘ۠ۖۗۡ۠ۡۚۢۛ"
            goto L_0x009d
        L_0x0837:
            java.lang.String r2 = "۟ۘۙۨۨۡۘ۫ۜۖۘۘۛ۫ۦۢ"
            goto L_0x009d
        L_0x083b:
            java.lang.String r2 = "ۢۘۜۘۚۢۜۡۜۖۘۖۧۨۢۧۡ۟ۜ۟ۨۚۖ"
            goto L_0x009d
        L_0x083f:
            java.lang.String r2 = "ۙۗۦۗۥۘۡ۟ۡۧۜۥۘ۫ۘۜۘ۬۠ۡۙ۟۟ۖۧ۟"
            goto L_0x009d
        L_0x0843:
            java.lang.String r2 = "ۥۛۜۘۖۧۦۘۡۜۧۘۨۥۜۨۘ"
            goto L_0x009d
        L_0x0847:
            java.lang.String r2 = "ۖۗۡۘۚ۬ۥۧۧۨۘۖۖۦۘۥۨۦۘۘۜۘۘۨۙۖۘ۟۫ۜۘۚۡۨ"
            goto L_0x009d
        L_0x084b:
            java.lang.String r2 = "ۜۜۙ۠ۦۖۚۜ۟ۦۡۘۜ۬ۦۘۧۤۧ"
            goto L_0x009d
        L_0x084f:
            java.lang.String r2 = "۫۟۠ۘ۠ۨۘۗۢۨ۠۫۟۟۬ۥۤۘۘ"
            goto L_0x009d
        L_0x0853:
            java.lang.String r2 = "ۙۨۘۜ۟ۦۘۦۛۦۦۜۦۥۜ۠ۤۦۧ"
            goto L_0x009d
        L_0x0857:
            java.lang.String r2 = "۬ۙۦۧۡۛۤ۬ۤۙ۫ۘ۠ۤۘ۬۟ۢۤۥ"
            goto L_0x009d
        L_0x085b:
            java.lang.String r2 = "ۛۨۡۨۘۘۢۨۚۥۙۚۚۦۖۘ"
            goto L_0x009d
        L_0x085f:
            java.lang.String r2 = "۟ۗۜۘ۠۠۬ۜ۟ۜۘ۬۫۬ۛۤۗۥۗۙ۠ۥۥۘۥۜۢۙۢ"
            goto L_0x009d
        L_0x0863:
            java.lang.String r2 = "۫ۛۦۘۚۗ۫ۦۗۥۥ۟ۤۤۜ۟"
            goto L_0x009d
        L_0x0867:
            java.lang.String r2 = "ۤۢۨۘۨۦۜۘۧۢۨۖۧۜۛۧۦۘۖۛۨۘۜۧ۬ۧۨۥۘ۬ۛ۠"
            goto L_0x009d
        L_0x086b:
            java.lang.String r2 = "ۨ۬ۘۘ۫ۤ۠۬ۘۧۘ۟۫ۗۢ۬ۥ"
            goto L_0x009d
        L_0x086f:
            java.lang.String r2 = "ۚ۬ۖۘۗۙۚۗۗۤۥ۟ۖ۫ۤۨۘۡۥ۟ۥۡۘۘۨۖۘ"
            goto L_0x009d
        L_0x0873:
            java.lang.String r2 = "ۧۥۧۘ۫ۜۦۘۘۨ۬ۢۚۗۘ۠ۜۘ"
            goto L_0x009d
        L_0x0877:
            java.lang.String r2 = "ۜۦۛ۫ۨۖۘۡۥۡۧۖۤۖۦۨۘۡ۠ۖۦۗۛ"
            goto L_0x009d
        L_0x087b:
            java.lang.String r2 = "ۛ۠۬ۨۖۧ۟ۥ۟۬۟ۖۘۙۦ۫۬ۤۚ۬"
            goto L_0x009d
        L_0x087f:
            java.lang.String r2 = "ۜۧۡۢۘۘۘ۠ۦۗۖۘۛۡۛ"
            goto L_0x009d
        L_0x0883:
            java.lang.String r2 = "ۤۖۖۘۜۖۨ۬ۙۚۥ۫ۨۘۨۢۤۘ۬۠ۖۧۖۘۨۢۘۘۘۖۢ"
            goto L_0x009d
        L_0x0887:
            java.lang.String r2 = "ۖۚۖۗۖۦۘ۫ۘۗۡۧۢۛۛۙۢۚۘۘۙ۠ۡۗۜۜۘ"
            goto L_0x009d
        L_0x088b:
            java.lang.String r2 = "ۥۧۦۘۢ۠ۙ۟ۨۡۘۘۨۤ۠ۚۡۤۧۖۘۢۘ۠"
            goto L_0x009d
        L_0x088f:
            java.lang.String r2 = "ۖۜۢۙۙۥۘۨۚۥۦۗ۫۬۫ۥۥ۟ۤۨۙ۫"
            goto L_0x009d
        L_0x0893:
            java.lang.String r2 = "ۛۡۧۘۥۢۚ۬ۥۘۘۜۘ۫ۤۢۙۦۛ۫ۨۚۗ۠ۛۡ"
            goto L_0x009d
        L_0x0897:
            java.lang.String r2 = "۬ۥ۬ۖۖۖۘ۫ۘۘۘۥۧۥ۟ۢۖۘۗۡۚۤۢۢ"
            goto L_0x009d
        L_0x089b:
            java.lang.String r2 = "ۡۡۖۦۘ۠۠ۖۜۘۗ۫ۙۢۜۦۙۖۘ"
            goto L_0x009d
        L_0x089f:
            java.lang.String r2 = "ۡ۫ۛۥ۬ۧۗۖۜۘۘۙ۠ۘۦۤ۟ۡۘۡ۠ۥۘۨۦۨ"
            goto L_0x009d
        L_0x08a3:
            java.lang.String r2 = "ۙۡ۟ۙۨ۠ۥۙۥۘ۫ۤ۠۠ۛۨۘ"
            goto L_0x009d
        L_0x08a7:
            java.lang.String r2 = "ۘۥ۬۠۠ۖۘۙۚ۬ۥ۠ۡ۠ۤۜ۟۟ۡۥۜۥ"
            goto L_0x009d
        L_0x08ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.home.RCTABS.BasicNavigationView.setIconsColors():void");
    }

    public void setUnreadCounterColors() {
        String str = "ۡۥۧۗۖۙۥۧۧۜۙۜۘۜۖۘ۫۫ۖ";
        while (true) {
            switch ((str.hashCode() ^ 936) ^ -1701012544) {
                case -2029836040:
                    this.D.setTextColor(this.f2522n);
                    str = "ۥۛۛۜۦۡۥۙۚۨ۫ۡۘۨۡۦۧۡۥ";
                    break;
                case -1673944648:
                    this.E.setTextColor(this.f2522n);
                    str = "ۤۦۘۘۖۨۤ۬ۖۢۚۗ۬ۖۥۘۢۨۤۚۡ۫ۘۗۦۡۚ";
                    break;
                case -1331112163:
                    this.G.setTextColor(this.f2522n);
                    str = "۬ۙۘۙۜۘ۫ۨۚۛۜۤۢۗۘۤ۬ۘۘۛ۟۠۠ۜۤۦۛ۬";
                    break;
                case -1295789472:
                    this.F.getBackground().setColorFilter(this.f2521m, PorterDuff.Mode.SRC_ATOP);
                    str = "ۡ۬ۛۤ۠ۘۘۗۢ۫ۘۛ۬ۥ۠ۚۗۢ";
                    break;
                case -658226896:
                    this.E.getBackground().setColorFilter(this.f2521m, PorterDuff.Mode.SRC_ATOP);
                    str = "۫ۜۧ۫ۚۛۡۡۜۡۡۜۛۙۙ";
                    break;
                case -623450268:
                    this.D.getBackground().setColorFilter(this.f2521m, PorterDuff.Mode.SRC_ATOP);
                    str = "ۡ۬ۚۥۤۚۡۨ۠ۙ۬ۧۛۧۖۘۛۢۨۘ۫۟ۨۘۛۛ۟ۦۗۨۘ";
                    break;
                case -205454697:
                    str = "۬ۙۨۘ۬ۖۥۘۦۦۘۘۨۚ۟ۗۖۡۦ۬ۥ";
                    break;
                case 320804655:
                    return;
                case 1384190445:
                    this.F.setTextColor(this.f2522n);
                    str = "۠۟ۡۘۤۥ۠ۘۢۜۜۖۖۢ۫ۦۘۡۖ۠ۤۜۥۘ";
                    break;
                case 2020023032:
                    this.G.getBackground().setColorFilter(this.f2521m, PorterDuff.Mode.SRC_ATOP);
                    str = "ۨ۟ۖۘۖ۫ۜۘۜۜۥ۟ۨۡۘۚۚۢۙ۠ۤۗۘ۠ۛۢۡۘ";
                    break;
            }
        }
    }

    public void updateIconsColors() {
        String str = "ۖ۟ۜۘۡۦۜۚۤۗ۫ۨۥۘۥۖۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 272) ^ -1535445959) {
                case -2111120621:
                    return;
                case -1866093772:
                    this.f2522n = others.getColor("tabadgeTextColor", -16777216);
                    str = "۟ۢ۟۬ۛۦۘۡۚ۫ۛ۠ۨۘ۬ۦۚۖ۫ۦۧۨۜۘۤۥۛ";
                    break;
                case -790596998:
                    this.f2512d = others.getTabActiveColor();
                    str = "ۙۡۥۚ۫۬ۘۗۥۘۛۙ۫۫۟ۤۦۛۛۦۗ۟ۤ۬ۛۜۛ۫";
                    break;
                case -536701114:
                    this.f2521m = others.getColor("tabadgeBKColor", this.f2512d);
                    str = "ۜۛۘۘ۬ۥۥۘۗۗۦۘۧۥۖۘۖۡۥۘۚۙۖۘ۬۫ۘ";
                    break;
                case -451796597:
                    setUnreadCounterColors();
                    str = "ۨۥۖۘۙۛۡۘ۟ۙۡۘۥۧۚۤ۠ۦۘۥۚ۫ۗۨۡۧۨۖۘۡۦۙ";
                    break;
                case 1407202717:
                    setIconsColors();
                    str = "۫ۜۤ۬ۚۧ۟ۦۘۚۗۜۘ۟۠ۙۖ۟ۦۘ";
                    break;
                case 1702189297:
                    str = "ۗۧۙ۠ۦ۠ۡۦۘۨ۬ۜۘ۠۬ۧ۫ۚۨۘۛۖۗۨ۟ۗۜ۫ۢ";
                    break;
                case 2047995006:
                    this.f2511c = others.getTabInActiveColor();
                    str = "ۙۗۦۤ۠ۨۘۤ۠ۨۘۘ۬۟۫ۡۨ۬۫ۡۛۖۘ۟ۦۚ۠ۨ۬";
                    break;
            }
        }
    }
}
