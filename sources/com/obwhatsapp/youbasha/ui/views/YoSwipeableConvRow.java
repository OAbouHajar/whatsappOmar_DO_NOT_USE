package com.obwhatsapp.youbasha.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.obwhatsapp.conversationslist.ArchivedConversationsFragment;
import com.obwhatsapp.yo.d;
import com.obwhatsapp.yo.g;
import com.obwhatsapp.yo.yo;
import java.util.LinkedHashMap;

public class YoSwipeableConvRow extends FrameLayout {
    public boolean A;
    public boolean B;

    /* renamed from: a  reason: collision with root package name */
    public final int f1406a;

    /* renamed from: b  reason: collision with root package name */
    public t f1407b;

    /* renamed from: c  reason: collision with root package name */
    public u f1408c;

    /* renamed from: d  reason: collision with root package name */
    public w f1409d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f1410e;

    /* renamed from: f  reason: collision with root package name */
    public View f1411f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f1412g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f1413h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f1414i;

    /* renamed from: j  reason: collision with root package name */
    public ImageView f1415j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1416k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1417l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1418m;
    public int mCurrentOffset;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1419n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1420o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1421p;

    /* renamed from: q  reason: collision with root package name */
    public int f1422q;

    /* renamed from: r  reason: collision with root package name */
    public int f1423r;

    /* renamed from: s  reason: collision with root package name */
    public int f1424s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1425t;

    /* renamed from: u  reason: collision with root package name */
    public int f1426u;

    /* renamed from: v  reason: collision with root package name */
    public int f1427v;

    /* renamed from: w  reason: collision with root package name */
    public int f1428w;

    /* renamed from: x  reason: collision with root package name */
    public v f1429x;

    /* renamed from: y  reason: collision with root package name */
    public final g f1430y;

    /* renamed from: z  reason: collision with root package name */
    public Object f1431z;

    public YoSwipeableConvRow(Context context) {
        this(context, (AttributeSet) null);
    }

    public YoSwipeableConvRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YoSwipeableConvRow(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1407b = t.f1513c;
        this.f1409d = w.f1524c;
        this.f1410e = new LinkedHashMap();
        this.f1419n = true;
        this.f1421p = true;
        this.mCurrentOffset = 0;
        this.f1425t = false;
        this.f1426u = -1;
        this.f1427v = -1;
        this.f1428w = -1;
        this.f1430y = new g(this, 4);
        this.A = false;
        this.B = true;
        this.f1406a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f1408c = new u(this);
        this.f1426u = 0;
        this.f1428w = 1;
        this.f1427v = 2;
        setOnClickListener(new r(this, 0));
        setOnLongClickListener(new s(this, 0));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r7) {
        /*
            r4 = 0
            r3 = 0
            java.lang.String r2 = "۟۫ۖۘۗۜۜۘ۠۫ۦۦۤۦۘ۟۫ۜۘۛۚۛ"
            r0 = r4
            r1 = r4
        L_0x0006:
            int r4 = r2.hashCode()
            r5 = 340(0x154, float:4.76E-43)
            r6 = 351047762(0x14ec9052, float:2.3886835E-26)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1893872091: goto L_0x003f;
                case -609800101: goto L_0x0038;
                case 552166270: goto L_0x0015;
                case 874685432: goto L_0x00a7;
                case 1251834319: goto L_0x00b4;
                case 1404320906: goto L_0x007f;
                case 1446041124: goto L_0x005b;
                case 1597243807: goto L_0x0062;
                case 1748229158: goto L_0x0094;
                case 1763914885: goto L_0x0086;
                case 1796399785: goto L_0x0018;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r2 = "ۦۡ۫ۜ۟ۜۘۖۧۛ۠ۗ۬۟ۥۡ۠۠ۢۦۢۦۘ"
            goto L_0x0006
        L_0x0018:
            r4 = 1252910759(0x4aade6a7, float:5698387.5)
            java.lang.String r2 = "ۗۘ۬ۧۦۘۤۜۖۘۘ۫ۤۡۥ۟ۙۖۛۖۛۦۘۗۤۙ"
        L_0x001d:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -423197572: goto L_0x0032;
                case -355278915: goto L_0x00b0;
                case -317414576: goto L_0x0035;
                case 405022574: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001d
        L_0x0026:
            com.obwhatsapp.youbasha.ui.views.w r2 = r7.f1409d
            com.obwhatsapp.youbasha.ui.views.w r5 = com.obwhatsapp.youbasha.ui.views.w.f1524c
            if (r2 == r5) goto L_0x002f
            java.lang.String r2 = "ۘۨۘۘۙۗۥۘۜۡۘۖۥ۠ۡۙۗۨۤۖۘۗۜۨۨۤۜ"
            goto L_0x001d
        L_0x002f:
            java.lang.String r2 = "ۧۥۧۧۡ۠۟ۨۦۘۚۙۜ۫ۙۦۘۙۨۨۡ۟ۦۡۚۧ"
            goto L_0x001d
        L_0x0032:
            java.lang.String r2 = "ۛۥۨۘۤۗ۠ۦ۟ۖۘۥ۫ۤ۟ۙ۬ۨۧۘ"
            goto L_0x001d
        L_0x0035:
            java.lang.String r2 = "ۜ۬ۦۦۚۤۦۨ۠ۖ۟ۜۘ۫ۡ۟"
            goto L_0x0006
        L_0x0038:
            android.widget.AdapterView r1 = r7.getAdapterViewFromMainView()
            java.lang.String r2 = "ۗ۟ۤ۟۬ۛ۫ۘ۬۠ۙۖۧۛۖۘۙۖ"
            goto L_0x0006
        L_0x003f:
            r4 = 1380867061(0x524e5bf5, float:2.21576511E11)
            java.lang.String r2 = "ۢۡۦۘۙۖۘۨۛۚۢۨۡۘۛۨۖۘۨۡۘۘۘ۠ۦۘۧۢۚۦۤۦۘ"
        L_0x0044:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1701274778: goto L_0x0053;
                case -705730304: goto L_0x004d;
                case 904763558: goto L_0x0094;
                case 2079091776: goto L_0x0058;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0044
        L_0x004d:
            java.lang.String r2 = "ۚۚۥ۫۬ۦۦۢۖۦۖۡ۬۠ۨۘ۬ۤۢۨۙ۬ۦۨۡۥۤۧ"
            goto L_0x0044
        L_0x0050:
            java.lang.String r2 = "ۚۜۥۘۛۧ۠ۥ۟ۡۥۦۘ۟ۢۥ"
            goto L_0x0044
        L_0x0053:
            if (r1 == 0) goto L_0x0050
            java.lang.String r2 = "۠ۢ۫ۛ۬۫ۗۧۗۖۢۖۥۧۦۘۙ۬ۨۘۥۥۥ۬ۨۦۘ۫ۡۡۘ"
            goto L_0x0044
        L_0x0058:
            java.lang.String r2 = "ۛۤۦ۠ۗۘۘ۠ۤۜۘۥۚۦۘۨۘۘۘۧۥۚۘۧۡۘۤۘ۫ۛۡۨ"
            goto L_0x0006
        L_0x005b:
            int r3 = r7.getPositionFromAdapterView()
            java.lang.String r2 = "ۦ۠ۘۘۨۥۖۨۡۛۘ۬ۧۤۢۖۗۨۡۧۘ"
            goto L_0x0006
        L_0x0062:
            r4 = 1474202212(0x57de8a64, float:4.89371929E14)
            java.lang.String r2 = "ۜۜۤۥۙۡۢ۟ۚۛۖ۫ۧۤۜۛۜۡۘ"
        L_0x0067:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1483089793: goto L_0x0070;
                case 731755302: goto L_0x007c;
                case 1280467199: goto L_0x0079;
                case 1847437334: goto L_0x0094;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0067
        L_0x0070:
            r2 = -1
            if (r3 == r2) goto L_0x0076
            java.lang.String r2 = "ۚۖۦۘۛۛۖۘۧۘۥۘۛۦۗ۫ۛ۬ۤۘۡۘۛۘۘۨۗۖ"
            goto L_0x0067
        L_0x0076:
            java.lang.String r2 = "ۥ۫ۡۖ۠ۗ۬ۤۖۥۢۦۜۡۗۥ۫ۚ۟ۖۜۘۦۖۨۘ"
            goto L_0x0067
        L_0x0079:
            java.lang.String r2 = "ۙۛ۬ۢۗۦۘۖۧ۟ۦۧۤۥۥۖۨۧۖۥۜۥۘۙۦ۠"
            goto L_0x0067
        L_0x007c:
            java.lang.String r2 = "ۥۙۦۘ۫ۖۡۘۚۜ۟ۨۨۛۢ۬ۨۥۡۙۧۢۖۗ۠۫"
            goto L_0x0006
        L_0x007f:
            android.widget.AdapterView$OnItemLongClickListener r0 = r1.getOnItemLongClickListener()
            java.lang.String r2 = "ۥ۬۟ۚۘۜۘۘ۫ۥۘۨۢ۫ۤۢۚ"
            goto L_0x0006
        L_0x0086:
            r4 = -268641904(0xffffffffeffcd990, float:-1.5650648E29)
            java.lang.String r2 = "ۨۢۦۥۚ۠۟۟ۤۚۛۖ۫ۥۗۙۤۢ۟ۛۥۘۥۘۚ"
        L_0x008b:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1054069519: goto L_0x00a3;
                case -809848130: goto L_0x009b;
                case -31308518: goto L_0x00a0;
                case 1855313504: goto L_0x0094;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x008b
        L_0x0094:
            java.lang.String r2 = "۠۫ۡ۬۬ۡۗ۫ۢ۬ۢۘۜ۬ۘ"
            goto L_0x0006
        L_0x0098:
            java.lang.String r2 = "ۢۤۤۥۛۜۘۛۢۖۘۦۦۜۘۢۦۥۘ"
            goto L_0x008b
        L_0x009b:
            if (r0 == 0) goto L_0x0098
            java.lang.String r2 = "ۙ۠ۜۚۦۦۨۖ۬ۦۗۤۨ۟ۤ۟ۙۘۘ۠۟ۖۘۥۘ۫"
            goto L_0x008b
        L_0x00a0:
            java.lang.String r2 = "۠ۦۨۡۥۤۨ۬ۥۗۖۜۡۨ"
            goto L_0x008b
        L_0x00a3:
            java.lang.String r2 = "ۡۖۖ۬ۖۙۨۚۙۤۡۥۜ۠ۖۙۡۘ۠ۦۤۜۜۤۜ۫۠"
            goto L_0x0006
        L_0x00a7:
            long r4 = (long) r3
            r2 = r7
            r0.onItemLongClick(r1, r2, r3, r4)
            java.lang.String r2 = "۠۫ۡ۬۬ۡۗ۫ۢ۬ۢۘۜ۬ۘ"
            goto L_0x0006
        L_0x00b0:
            java.lang.String r2 = "ۛۘۖۘۡۡۘۘ۠۬ۖ۬ۥۘۘۦۥ۠"
            goto L_0x0006
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow.a(com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r7) {
        /*
            r4 = 0
            r3 = 0
            java.lang.String r2 = "۬ۨ۠ۥ۠ۘۢۢۦۤۙۖۘۙۛۗ۫ۨۖۘۖۚۙ"
            r0 = r4
            r1 = r4
        L_0x0006:
            int r4 = r2.hashCode()
            r5 = 751(0x2ef, float:1.052E-42)
            r6 = -1281034886(0xffffffffb3a4f57a, float:-7.681497E-8)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1830540912: goto L_0x0015;
                case -1671853319: goto L_0x00a3;
                case -1139184740: goto L_0x00b0;
                case -379274034: goto L_0x0038;
                case -317213096: goto L_0x0062;
                case 80359605: goto L_0x0086;
                case 359735169: goto L_0x007f;
                case 1097670004: goto L_0x003f;
                case 1112904912: goto L_0x005b;
                case 1136454729: goto L_0x00b4;
                case 1242075776: goto L_0x0018;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r2 = "۟ۡۡۘۤۧۤ۟ۗۚۚ۟ۡۘۙۖۖۘ"
            goto L_0x0006
        L_0x0018:
            r4 = 1406778272(0x53d9bba0, float:1.87031146E12)
            java.lang.String r2 = "ۢ۠۬۟ۘۛۡۧ۬ۗۡۙۘ۬ۡ۬ۡۘۛ۠ۨۘ۬۬۫"
        L_0x001d:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -176312808: goto L_0x00ac;
                case 32967292: goto L_0x0032;
                case 382995331: goto L_0x0026;
                case 1180803323: goto L_0x0035;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001d
        L_0x0026:
            com.obwhatsapp.youbasha.ui.views.w r2 = r7.f1409d
            com.obwhatsapp.youbasha.ui.views.w r5 = com.obwhatsapp.youbasha.ui.views.w.f1524c
            if (r2 == r5) goto L_0x002f
            java.lang.String r2 = "ۦ۬ۘۘۧۧۜۘۨۘ۫ۢۢۛۚ۬۠ۦۧۘۤ۬ۤۨۦۙۧۙۘۘ"
            goto L_0x001d
        L_0x002f:
            java.lang.String r2 = "ۢۤۧۧۤۙۡۗۜۡۚۚۤۚۥۖۢ۟۟ۧۖ"
            goto L_0x001d
        L_0x0032:
            java.lang.String r2 = "ۦۙۡۤ۟ۧۦۘۛۖۘۧ۟ۖۛ۠ۤۗۖۨ"
            goto L_0x001d
        L_0x0035:
            java.lang.String r2 = "ۖۦۘۨۜۖۘۡ۟۟۫ۡ۟ۡۘۧۘۗ"
            goto L_0x0006
        L_0x0038:
            android.widget.AdapterView r1 = r7.getAdapterViewFromMainView()
            java.lang.String r2 = "ۥۜۢۗۤۙۖ۫ۥۧۗۦ۬ۜۘۨ۟ۡۘۜۘ۬"
            goto L_0x0006
        L_0x003f:
            r4 = 758919422(0x2d3c30fe, float:1.0697441E-11)
            java.lang.String r2 = "ۚۜۡۘۡ۠ۚ۟ۢۢۙۜۦۘۦۘۜۘ۟۠"
        L_0x0044:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case 253843187: goto L_0x0058;
                case 478978783: goto L_0x0053;
                case 1221808806: goto L_0x00b0;
                case 1224895666: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0044
        L_0x004d:
            java.lang.String r2 = "ۡۥ۠۫۬ۙۛ۫ۡۘۤۧۦۧۖۦۘ۫۠ۢ۬ۗۤ"
            goto L_0x0044
        L_0x0050:
            java.lang.String r2 = "۫ۗۡۘۡۨۡۡ۫ۦۤۥۥۖ۬ۨۘۗۙۖۦۦۦۘ۫ۨۖ"
            goto L_0x0044
        L_0x0053:
            if (r1 == 0) goto L_0x0050
            java.lang.String r2 = "ۚۖۥۘۤ۫ۨۘۡۧۡۜۢ۟ۢۧۘۖۧ۫ۥۨۚ"
            goto L_0x0044
        L_0x0058:
            java.lang.String r2 = "۠ۡ۟۟ۖۘۘۦۦ۠ۤۧۜۖۜۦۘۦۘۖۘ۠ۜۛ"
            goto L_0x0006
        L_0x005b:
            int r3 = r7.getPositionFromAdapterView()
            java.lang.String r2 = "ۜۡۡۘۙ۠ۛۚۢۛۥۢۖۘ۠۬۠۠ۜۡۘۨۦۗۡۘ۬ۙۢ۟"
            goto L_0x0006
        L_0x0062:
            r4 = -169110673(0xfffffffff5eb936f, float:-5.972559E32)
            java.lang.String r2 = "ۙ۫ۡۘۦۨۡۘۧۖۜۜۘۘۢۡۨۘ۬ۚۤ۫ۦ۬ۤ۫۠ۗۤۦۘ"
        L_0x0067:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1863079502: goto L_0x0070;
                case -1066309793: goto L_0x007c;
                case 1111208961: goto L_0x00b0;
                case 1150359224: goto L_0x0079;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0067
        L_0x0070:
            r2 = -1
            if (r3 == r2) goto L_0x0076
            java.lang.String r2 = "ۤ۟ۢۖۥۘۖ۫۫۠ۚۖۘۙۗۡۘۦۥ۬ۦ۫ۤۗۧۦۘۜۚ"
            goto L_0x0067
        L_0x0076:
            java.lang.String r2 = "۫ۗۨۘ۠ۢۘۘۘۜۨۘۥۡۖۛۗۚۧۚۗ"
            goto L_0x0067
        L_0x0079:
            java.lang.String r2 = "۬ۤۨۘۥۗۘۘ۠ۦۗۢۗ۬ۡۡۜ۫ۡۢ"
            goto L_0x0067
        L_0x007c:
            java.lang.String r2 = "۟۫۬ۤۗۛۙ۫ۦۘۢۦ۫ۨۥۘۘۢۛ۫ۚۜۚ۫۠ۨ۠ۖ۟"
            goto L_0x0006
        L_0x007f:
            android.widget.AdapterView$OnItemClickListener r0 = r1.getOnItemClickListener()
            java.lang.String r2 = "ۛۨۖۧۢۦۜۢۡۘۥۗۥۦ۟ۜۘ۬ۙۖ"
            goto L_0x0006
        L_0x0086:
            r4 = -684573800(0xffffffffd7323b98, float:-1.95969023E14)
            java.lang.String r2 = "ۚ۬ۥۜۜ۬ۢۡۙۢۛۜۘۛۖۤۨ۟ۜ"
        L_0x008b:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case 260908162: goto L_0x00b0;
                case 479788594: goto L_0x00a0;
                case 1176354634: goto L_0x009b;
                case 1513448200: goto L_0x0094;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x008b
        L_0x0094:
            java.lang.String r2 = "۠ۥ۠۠ۤۖۘۖ۬ۖۘۥ۫ۤۛۚۥۖ۫ۡ۫۟۫"
            goto L_0x0006
        L_0x0098:
            java.lang.String r2 = "ۦۢۡۘۦ۠ۖۘۢ۬ۙ۠۫ۡۘۢۨ۠ۖۥۜۘۜۤۘۘۛۘۢ"
            goto L_0x008b
        L_0x009b:
            if (r0 == 0) goto L_0x0098
            java.lang.String r2 = "ۘ۫۬ۚۦۥۘۢۤۡۘۨۦۧۘۡۙۖ۠ۤ۠ۦۗۨۨۤ۬ۤۦۧۘ"
            goto L_0x008b
        L_0x00a0:
            java.lang.String r2 = "ۛۦۧ۬ۚۖۘۢۢۙۥۧۡۘۘۗۜۢۘ۠ۡ۫ۨۘۢۥۥۘ۠ۚۥۘ"
            goto L_0x008b
        L_0x00a3:
            long r4 = (long) r3
            r2 = r7
            r0.onItemClick(r1, r2, r3, r4)
            java.lang.String r2 = "ۙۜۤۦ۟ۖۘۦۤۘۗۡۦ۫۬ۛ"
            goto L_0x0006
        L_0x00ac:
            java.lang.String r2 = "۫ۢۡۡۢۙ۟۠ۦۜ۫ۘۘۥ۟ۦۛۨۨ۫ۤۜۘۘ۟۬"
            goto L_0x0006
        L_0x00b0:
            java.lang.String r2 = "ۙۜۤۦ۟ۖۘۦۤۘۗۡۦ۫۬ۛ"
            goto L_0x0006
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow.b(com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow):void");
    }

    public static /* synthetic */ void c(YoSwipeableConvRow yoSwipeableConvRow) {
        String str = "ۦۜۗۨۘۢ۠ۛۥۛ۠ۖۘۨۥۘۘ";
        while (true) {
            switch ((str.hashCode() ^ 881) ^ -1340734065) {
                case -1856307009:
                    return;
                case -397651605:
                    yoSwipeableConvRow.setStatus(w.f1522a);
                    str = "ۡۖۦۘ۫۫ۖۘ۬۟ۚۨۤۡۘۗۘۦۘۗۤۙۖ۫ۥۘۧۥۥۘ";
                    break;
                case 1111827619:
                    str = "ۚۢ۟ۢۗۨۘۧۥۛ۫ۚۦۘۨۚۡۘۛ۟ۤ";
                    break;
            }
        }
    }

    public static /* synthetic */ View d(YoSwipeableConvRow yoSwipeableConvRow) {
        String str = "۬ۗۤۥۤۧۘۗ۬ۛۗۖۛۥۧۘ۟ۧ";
        while (true) {
            switch ((str.hashCode() ^ 770) ^ 1285728053) {
                case -1206481753:
                    return yoSwipeableConvRow.getLeftView();
                case -868163736:
                    str = "ۤ۟۟ۤۗۨۘ۟۠ۙۛۡۤۘۙ۟۠۫ۘۚۦۘ";
                    break;
            }
        }
    }

    public static /* synthetic */ View e(YoSwipeableConvRow yoSwipeableConvRow) {
        String str = "۬ۦۘۘۢۤۡۨۘۗۜۦۘۢۦ۠ۜۜۜ۠ۙۖۘۢ۬ۙ";
        while (true) {
            switch ((str.hashCode() ^ 772) ^ 1333209448) {
                case -1658135964:
                    str = "۠ۖۙۙۖۦۚۚۡۥۦ۫ۖۙۥۜۗ";
                    break;
                case 1692858658:
                    return yoSwipeableConvRow.getRightView();
            }
        }
    }

    public static /* synthetic */ t f(YoSwipeableConvRow yoSwipeableConvRow) {
        String str = "۬ۜۘۘۢۛ۠۬ۚۘۘۤ۠ۤۚۢۤ۫ۘۗ";
        while (true) {
            switch ((str.hashCode() ^ 219) ^ -303570660) {
                case 781200580:
                    return yoSwipeableConvRow.getCurrentDragEdge();
                case 1558982678:
                    str = "۬۠ۜۥۢۜۘۛ۠ۥۘ۫ۥۧۘۡۦۧۘ۟ۢ۬۬ۦ۬";
                    break;
            }
        }
    }

    private AdapterView getAdapterViewFromMainView() {
        String str = "۟ۦۛۡ۠ۡۘۖۢۧ۟ۧۢ۟ۥۤۧۚۡۘ";
        ViewParent viewParent = null;
        while (true) {
            switch ((str.hashCode() ^ 879) ^ 1290974654) {
                case -1690941876:
                    return (AdapterView) viewParent;
                case -896372355:
                    return null;
                case 199632013:
                    String str2 = "ۚۧۧۨۡۥۘۚۦۥۘۘ۟ۙۤۨ۬ۘۖۛ۫ۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -411511286) {
                            case 115256823:
                                if (getParent() == null) {
                                    str2 = "۬۬۟ۥۦۖۘۚۨۚۡۛۙۙۧۛۚۖ۫ۦۛۦۘۤۢۦۘ";
                                    break;
                                } else {
                                    str2 = "ۜۤۦ۠۬ۨۘ۬ۥ۟۬ۗۖۘۘۜۘ";
                                    break;
                                }
                            case 428079602:
                                str = "۫ۛۖۘۚۛۦۘۡ۠ۡۘۖۦۥۘ۬ۖۛۛۦ۠";
                                continue;
                            case 1817614673:
                                str2 = "ۗۚۢۥ۟ۨۘ۬ۡۡۨۙۨۛۨۥۚۢۡۛ۫ۗۨ۟۫ۛۥۤ";
                                break;
                            case 2080892132:
                                str = "۠ۤۡ۠ۡۖۥۚۥۘۦۙۦۙ۬ۤۗ۫۫۠ۡۗۡۗۜۙۜ";
                                continue;
                        }
                    }
                    break;
                case 449824371:
                    String str3 = "۫۫ۤۧۖۘۥۢ۟ۤ۬ۗ۬ۘۧۜۛ۬۠ۙ۫ۥۦۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 1992630546) {
                            case -997898933:
                                str = "ۜ۬۠ۘۛۖۙۙ۬۫ۛۡۙ۟۫";
                                continue;
                            case -247132829:
                                if (!(viewParent instanceof AdapterView)) {
                                    str3 = "ۗ۟ۘ۠ۡۨۘ۫ۡۢۘۗۡۦۥۙۙ";
                                    break;
                                } else {
                                    str3 = "ۧ۟۫ۦۡۥۗۚۡۘۘۨ۟ۨ۫ۢۖۚۨۘۚ۫ۧۚۢۤۚ۟۬";
                                    break;
                                }
                            case 574964798:
                                str3 = "۟۬۫ۖۗۛۛ۠ۙۗ۟ۡۘۛۜۤۧۢۦۘ";
                                break;
                            case 1099625572:
                                str = "ۢۢۢۖۧۘۘۛۜۥۘۙۡۜۘۛۡۜۘۨۥۦۘ";
                                continue;
                        }
                    }
                    break;
                case 1372559813:
                    viewParent = getParent();
                    str = "ۢۢۢۖۧۘۘۛۜۥۘۙۡۜۘۛۡۜۘۨۥۦۘ";
                    break;
                case 1393575854:
                    str = "ۚۚۜۘۥ۫ۜ۬ۘۢۦۡۜۥۗ۟ۙ۟ۢ";
                    break;
            }
        }
    }

    private t getCurrentDragEdge() {
        String str = "ۚۜۥۘ۠ۜۙ۟ۨۦۖۗۡۘۥۘ۬ۘۖۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 157) ^ 1797776519) {
                case -798904008:
                    return this.f1407b;
                case 1236876192:
                    str = "۟۬ۥۤۖۡ۬ۧۤۦۗۡۥ۫ۖۘۥۡ۟۫ۧۗ۠";
                    break;
            }
        }
    }

    private View getLeftView() {
        String str = "۠ۚۥۗۙۖۘۥ۟ۢۚ۬ۡۘ۬۟ۜ";
        while (true) {
            switch ((str.hashCode() ^ 172) ^ 902651250) {
                case -1002348263:
                    str = "ۥ۟ۗۢۦۤۛۦ۬ۡۙۡۘۡۖۦۘۖ۠ۥۘۖۢۥۥۥ۟ۗۤ۟";
                    break;
                case -504960635:
                    return (View) this.f1410e.get(t.f1511a);
            }
        }
    }

    private int getPositionFromAdapterView() {
        AdapterView adapterView = null;
        String str = "ۤۘۧۘۢ۫ۥ۠ۥۘۛۗ۟ۚۙۘۘۖۚۦ";
        while (true) {
            switch ((str.hashCode() ^ 392) ^ -1087386622) {
                case -1077684457:
                    adapterView = getAdapterViewFromMainView();
                    str = "ۢۚۦۧۜۜۘ۠۠ۖۘۗۚ۫ۤۤۜۘۦۢ۫ۜۡۘ";
                    break;
                case -892024411:
                    return adapterView.getPositionForView(this);
                case 566595149:
                    return -1;
                case 1622903917:
                    String str2 = "ۛ۬ۛۗ۟ۦۗۗۥۥۗۦۘۛۚۦۖ۟ۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1564976892) {
                            case -1939227770:
                                str = "ۥۦۜۘۜۙۙۧۡ۫ۚ۟ۦۘۦۜۜۘۢۛۤۤۥۧۘۥۨۖۘ";
                                continue;
                            case -957034559:
                                if (adapterView == null) {
                                    str2 = "ۥۜۘۘۛۤۥۥۘۖۢۖ۠ۥۘۙۥۦۛۧۡۛ۫ۨۖ";
                                    break;
                                } else {
                                    str2 = "ۦۖۡۘ۬۬ۘۘ۟ۥ۫ۡ۠ۨ۬۫۟ۢ۫ۘۘۗ۫ۘۘۛۦۧۘ";
                                    break;
                                }
                            case -615296506:
                                str = "ۛۦۘۦۘۙۜۦۖۘۧۙۥۖۚۤۥۡۖۡ۫ۖ۟ۥۡ۠ۙ";
                                continue;
                            case 1613100018:
                                str2 = "ۧۗۢۛۜۧۘۤۥۦۧ۟ۛۜۢۢۙۤۥ۫۫ۥۘۦۘۖۥۡۧ";
                                break;
                        }
                    }
                    break;
                case 1988831382:
                    str = "۠ۘ۠۫ۡۘۘۚۨۥۘۢۡۛۖۡ۬ۚۢۘۛۡۦۘۡۨۘۘۤۚۜۘ";
                    break;
            }
        }
    }

    private View getRightView() {
        String str = "ۢۧۦۘۤۙۦ۟ۧ۟۬ۚۜۤۢۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 841) ^ 1913343457) {
                case 1117636965:
                    return (View) this.f1410e.get(t.f1512b);
                case 2050215370:
                    str = "ۡۥۗۖ۬ۖۘ۠ۦۖۘۢ۟ۜۦۤۖۘ۬ۛۘۦ۟ۥۚ۠ۢ";
                    break;
            }
        }
    }

    private void setStatus(w wVar) {
        String str = "ۤۗۨ۟ۛۡۘ۬ۙ۫۫ۛۦۘ۠ۢۜۘۘۦۜۘ۬ۜ۠۠۬ۚۡ۠ۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 394) ^ 1610752606) {
                case -1728826416:
                    this.f1409d = wVar;
                    str = "ۡۨۥۘۛۦۢۘۚۥۢۥۤۧۛۜ۬ۜۦۖۚ۠ۖۚۛ";
                    break;
                case -1167909276:
                    str = "ۡ۟ۙۗ۬ۖۘۜۢۛۡۜ۬ۥۘۦ۟ۜۜۘۛ۠ۦ";
                    break;
                case 21998736:
                    return;
                case 1744566807:
                    str = "۬ۡۤ۟۟ۧۘۧۗ۫ۦۘۘۙۢۨۘ";
                    break;
            }
        }
    }

    public void closeMenu() {
        String str = "ۡۡۛۜ۟ۘۘۘۙ۠۬ۙۛۗۚۨۥۧۦۚ۬۫";
        w wVar = null;
        u uVar = null;
        while (true) {
            switch ((str.hashCode() ^ 617) ^ 1862077536) {
                case -1831113393:
                    return;
                case -1611289227:
                    str = "ۙۡۤۥۛۦۖۗ۠ۙۦۡۛۜ۠ۛ۬ۡۢۘۡ";
                    uVar = this.f1408c;
                    break;
                case -1494145042:
                    wVar = w.f1524c;
                    str = "ۨ۬ۡۘ۫۬ۗۜۨۘۘۛۖۗ۫ۘۥۙۗۗۛ۫۬۬ۘۖۘ۬ۗ۫";
                    break;
                case 133293796:
                    str = "۟ۤۜۘ۠ۜۖۡۥۚۙ۬ۤۡ۟ۙ۟ۗۡ۬ۦۨۘۘۦۖ";
                    break;
                case 893796805:
                    uVar.f1516b.smoothScrollTo(wVar, 0);
                    str = "ۖ۠ۡۦ۬۬ۚۨۗۛۡۛ۬۫۬۬ۖۢ";
                    break;
                case 1671084504:
                    String str2 = "ۗ۟۫ۚۛۘۘۛ۬ۜۘۥۤۖۘۤۖۘۨۙۜۘ۟۠ۢۤۛۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 353565371) {
                            case -552683132:
                                str = "ۖ۠ۡۦ۬۬ۚۨۗۛۡۛ۬۫۬۬ۖۢ";
                                continue;
                            case -493777412:
                                str2 = "ۧۗۡۘ۟ۘۘۘۥۘۖۥ۠ۨۧۙ";
                                break;
                            case -278074350:
                                if (uVar == null) {
                                    str2 = "ۢۥۜۡ۟ۖۘۖۢۖ۟ۚ۟ۘۚۘۘۜۥۦۘ۫۬ۥۘۗ۟ۘۘۘۦۙ";
                                    break;
                                } else {
                                    str2 = "ۛۥۥۘۘۡۡۘ۫ۨۜۘ۫ۖۥۨۦ۬ۥ۠ۚۚۙۤۡۤۧۦۨۧۘ";
                                    break;
                                }
                            case 1566591175:
                                str = "ۜۙۥۘۖۙۨۘۚۥۧ۠۫ۘۘۘۚۧۢۨۛۤۢۙۛۥۘ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        r5 = "ۡ۟۠ۧ۫ۛۦۧۥۘۚۥۗۡۢۘۡۡۧ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r29) {
        /*
            r28 = this;
            r23 = 0
            r8 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r18 = 0
            r17 = 0
            r19 = 0
            r16 = 0
            r14 = 0
            r15 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            java.lang.String r4 = "ۦ۬ۨۘ۟۬ۘۘۖۘۜ۫ۨۘۤۛ۠"
            r5 = r4
        L_0x001d:
            int r4 = r5.hashCode()
            r24 = 51
            r25 = 884183516(0x34b391dc, float:3.3447475E-7)
            r4 = r4 ^ r24
            r4 = r4 ^ r25
            switch(r4) {
                case -2143084439: goto L_0x01c5;
                case -1983699108: goto L_0x00b0;
                case -1980350540: goto L_0x027c;
                case -1968369150: goto L_0x006e;
                case -1582447083: goto L_0x00be;
                case -1448559542: goto L_0x002e;
                case -1381541660: goto L_0x0069;
                case -1376398834: goto L_0x0282;
                case -1054796597: goto L_0x014e;
                case -1016089747: goto L_0x00e2;
                case -962107596: goto L_0x01b0;
                case -824007776: goto L_0x009b;
                case -791463713: goto L_0x00f6;
                case -771322896: goto L_0x0032;
                case -577151190: goto L_0x017d;
                case -570215097: goto L_0x0163;
                case -527586901: goto L_0x015a;
                case -485735769: goto L_0x01a1;
                case -368232762: goto L_0x00b7;
                case -361620639: goto L_0x0269;
                case -326654276: goto L_0x023b;
                case -291117855: goto L_0x0154;
                case -103711509: goto L_0x0061;
                case -92461539: goto L_0x01e9;
                case -14245891: goto L_0x0147;
                case -2274121: goto L_0x0229;
                case 12314350: goto L_0x01fd;
                case 212381002: goto L_0x01f3;
                case 342310381: goto L_0x0058;
                case 401339295: goto L_0x0230;
                case 437323515: goto L_0x01d4;
                case 483464784: goto L_0x0036;
                case 586365745: goto L_0x0170;
                case 600649462: goto L_0x0278;
                case 668195906: goto L_0x0272;
                case 1289144616: goto L_0x00ef;
                case 1303003301: goto L_0x0287;
                case 1328690228: goto L_0x013a;
                case 1386303506: goto L_0x00a7;
                case 1617804715: goto L_0x0090;
                case 1707221283: goto L_0x0220;
                case 1868334687: goto L_0x0263;
                case 2141694534: goto L_0x028c;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x001d
        L_0x002e:
            java.lang.String r4 = "ۜۡۨ۬ۚۜۘۥۜۖۘۗ۠ۛۛۜۦۘ"
            r5 = r4
            goto L_0x001d
        L_0x0032:
            java.lang.String r4 = "ۘۗۛۢ۫ۗۗ۫ۢ۬۬۫ۚۘۥۘۤۘۖۘۛۛۧۚۘۨۘ"
            r5 = r4
            goto L_0x001d
        L_0x0036:
            r5 = -2092221374(0xffffffff834b3c42, float:-5.972551E-37)
            java.lang.String r4 = "ۤۜۤۢۤۢۛۘۡۘ۠ۥۡۘۡ۫ۜۘۨۡۥۢۢۥ"
        L_0x003b:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -2024902527: goto L_0x004c;
                case -1424405798: goto L_0x0055;
                case -306983682: goto L_0x0045;
                case 1729351269: goto L_0x0291;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x003b
        L_0x0045:
            java.lang.String r4 = "ۛ۬۫ۨۚۡۙۡۤۢۦ۠ۛۦۛۚۜۜۡ"
            r5 = r4
            goto L_0x001d
        L_0x0049:
            java.lang.String r4 = "ۧۘۧۨۢۥۡۜ۠ۥۦۦۘۚۢۡۘۙۦ۫۫ۧۧۚ۠ۦۘ"
            goto L_0x003b
        L_0x004c:
            int r4 = r29.getAction()
            if (r4 != 0) goto L_0x0049
            java.lang.String r4 = "ۧۡۥۘۙۧۖۛۥۙۘۗۨۘۗۥۘۘۜۘۛۛۥ"
            goto L_0x003b
        L_0x0055:
            java.lang.String r4 = "ۧ۫ۙۡۖۧۜ۫ۦۤۜ۠۠ۗۚۘۘۖۘۗۛۗ"
            goto L_0x003b
        L_0x0058:
            r4 = 0
            r0 = r28
            r0.f1425t = r4
            java.lang.String r4 = "ۛ۟ۗۜۚۤۙۛۙ۫ۚۛۙۨۡۘ۬ۛۡۗۚ۫"
            r5 = r4
            goto L_0x001d
        L_0x0061:
            boolean r23 = r28.isOpen()
            java.lang.String r4 = "۠ۦۡۘۤۡۧۧۨۘۛۦۦۘ۠ۘۥۘ۫ۦۚۢ۫ۡ"
            r5 = r4
            goto L_0x001d
        L_0x0069:
            r8 = 1
            java.lang.String r4 = "ۜ۟ۙۥۜۧۡۘۡۘ۠ۥۢۜۧۦۖۨۘۤۗۡ۫ۢ۠ۦۤۦ"
            r5 = r4
            goto L_0x001d
        L_0x006e:
            r5 = -1874820266(0xffffffff90408356, float:-3.79665E-29)
            java.lang.String r4 = "ۙۦ۠ۤۧۙۤۜۗۗ۬ۘۗۜۤ۟ۨۢ۫۠۬ۗ۫"
        L_0x0073:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -655796702: goto L_0x0089;
                case 235134429: goto L_0x008c;
                case 334177916: goto L_0x0084;
                case 1106637400: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            goto L_0x0073
        L_0x007d:
            java.lang.String r4 = "ۡ۟۠ۧ۫ۛۦۧۥۘۚۥۗۡۢۘۡۡۧ"
            r5 = r4
            goto L_0x001d
        L_0x0081:
            java.lang.String r4 = "ۖۥۧۖۧۥۘۤۤ۫ۦۤۡۘۨۢ۬"
            goto L_0x0073
        L_0x0084:
            if (r23 == 0) goto L_0x0081
            java.lang.String r4 = "ۘ۬ۦۚۢۨۘۧۜۖۘۢۤۖۗۗۢۘۧۥۘۦ۟ۙۙ۟ۨۗۨۘ"
            goto L_0x0073
        L_0x0089:
            java.lang.String r4 = "ۢۜۡۙۡۧۘ۟۬ۡۘۖۦۢۡۚ۠ۜۨۘۚ۟ۥۘ"
            goto L_0x0073
        L_0x008c:
            java.lang.String r4 = "ۥۥۛۚۨۨۤ۠ۗۛۧۙۡۤۡۘۖۡۡۛۢۦۖۤۦ"
            r5 = r4
            goto L_0x001d
        L_0x0090:
            float r4 = r29.getX()
            int r0 = (int) r4
            r22 = r0
            java.lang.String r4 = "ۛۜۢۢ۫ۢۧۢۖۘۨ۟ۥۘۛ۫"
            r5 = r4
            goto L_0x001d
        L_0x009b:
            float r4 = r29.getY()
            int r0 = (int) r4
            r21 = r0
            java.lang.String r4 = "ۦۖۥۨۚۖۘۖۡۘۡۜ۬ۛۧ۫ۛۡۥۖۦۚ"
            r5 = r4
            goto L_0x001d
        L_0x00a7:
            int r20 = r28.getChildCount()
            java.lang.String r4 = "ۢۡ۫ۚۦۨۢ۬۠ۦ۟ۗۦۧ۫ۥۦ"
            r5 = r4
            goto L_0x001d
        L_0x00b0:
            java.lang.String r4 = "ۦۢۙۜۖۥۖۡۤۥۚ۬ۛۧۦۜۗ"
            r5 = r4
            r19 = r20
            goto L_0x001d
        L_0x00b7:
            int r18 = r19 + -1
            java.lang.String r4 = "ۚۦۚۚۦۢۖۧۨۥ۟ۜ۠ۢۥۘۤۙۨ۟ۡۧۘ۠۬ۨۘ"
            r5 = r4
            goto L_0x001d
        L_0x00be:
            r5 = 1402154220(0x53932cec, float:1.26422771E12)
            java.lang.String r4 = "ۘۦ۟ۧۘ۟ۤۘۥۘ۠ۨۨۘۚۙۖۤ۟ۗ۠ۡۘۘ۬ۛۘۘۗۜۥۘ"
        L_0x00c3:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -1873893915: goto L_0x00d5;
                case -1721399582: goto L_0x00cd;
                case -1032681118: goto L_0x00da;
                case 834621281: goto L_0x00dd;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            goto L_0x00c3
        L_0x00cd:
            java.lang.String r4 = "ۨۘۛۙۗۦۘۙۗۖۘۡۙ۬ۥۡۖۨۗۘۘۘۦۢ"
            r5 = r4
            goto L_0x001d
        L_0x00d2:
            java.lang.String r4 = "ۡۗۙۦۚۙۙۖۧۘۜ۟۫ۖۦۘ۟ۙ۫ۙۙ۟ۙۤۥۢۤ۬"
            goto L_0x00c3
        L_0x00d5:
            if (r18 < 0) goto L_0x00d2
            java.lang.String r4 = "ۨۥۥۖ۬ۥۧۘۥۘۖۧۘۘۤۡۘۨۤۥۘ"
            goto L_0x00c3
        L_0x00da:
            java.lang.String r4 = "ۨ۠ۤۤۗۡۘۦۛ۬ۗۨۖۘۜۜۡ"
            goto L_0x00c3
        L_0x00dd:
            java.lang.String r4 = "۫ۡۨۘۙۦۚۙۧۘۙۜۡۘۤ۠ۛ"
            r5 = r4
            goto L_0x001d
        L_0x00e2:
            r0 = r28
            r1 = r18
            android.view.View r17 = r0.getChildAt(r1)
            java.lang.String r4 = "۫ۥۛۘۨۧۚۘۤۛۛۨۥ۬ۦ"
            r5 = r4
            goto L_0x001d
        L_0x00ef:
            java.lang.String r4 = "ۤۘۢۘۘۜۘۛۡۨۦۛ۟ۨۥۘۡ۟۫ۘۧ۬۠ۚۦۘۢۛۦۘ"
            r5 = r4
            r19 = r18
            goto L_0x001d
        L_0x00f6:
            r5 = -155508043(0xfffffffff6bb22b5, float:-1.8977802E33)
            java.lang.String r4 = "ۤۖ۟ۢ۬ۖۘۘ۫ۘۘ۟ۚۨۙۛۛ۠ۖۘۤۨۜۥۗ"
        L_0x00fb:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -1355186724: goto L_0x0132;
                case -1353260821: goto L_0x027d;
                case -841256779: goto L_0x0105;
                case -653991090: goto L_0x0135;
                default: goto L_0x0104;
            }
        L_0x0104:
            goto L_0x00fb
        L_0x0105:
            android.graphics.Rect r4 = new android.graphics.Rect
            int r24 = r17.getLeft()
            int r25 = r17.getTop()
            int r26 = r17.getRight()
            int r27 = r17.getBottom()
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4.<init>(r0, r1, r2, r3)
            r0 = r22
            r1 = r21
            boolean r4 = r4.contains(r0, r1)
            if (r4 == 0) goto L_0x012f
            java.lang.String r4 = "ۙۢ۫ۡۡۘۘۤۘۙۥۙۦۘۡۚۢۘۘۖۘۗ۟ۛ۠ۡۡۘۜ۬ۨۘ"
            goto L_0x00fb
        L_0x012f:
            java.lang.String r4 = "ۖۜۥۘ۟ۦ۠ۥۥۖۘۚ۠ۥۘۘۙۡۘۜ۫۫ۛۙۗۨۤۦۘ"
            goto L_0x00fb
        L_0x0132:
            java.lang.String r4 = "۫ۢ۟ۧۚۧ۫ۤۥۘۨۙۖۜۗۨۘۢۜۥۘ۬ۢ"
            goto L_0x00fb
        L_0x0135:
            java.lang.String r4 = "ۧۧۖۖ۟۠۬ۙۘۘۧۖ۟ۡۜۘ"
            r5 = r4
            goto L_0x001d
        L_0x013a:
            r0 = r28
            r1 = r18
            android.view.View r16 = r0.getChildAt(r1)
            java.lang.String r4 = "ۦۥۤ۬ۨۗۧۢۧ۫۠۬۟ۥ۠ۥۛ۟ۤ۠ۡۨۛۚ"
            r5 = r4
            goto L_0x001d
        L_0x0147:
            java.lang.String r4 = "۠ۘۡ۠ۖۥۘ۟ۡ۟۬۟ۚۢۙ۠ۚۚۗۗ۬ۡۨۘۜۙۦۘ"
            r5 = r4
            r15 = r16
            goto L_0x001d
        L_0x014e:
            r14 = 0
            java.lang.String r4 = "ۚۜۤۖ۬ۘ۠ۢ۫ۗۖۛۡۘۘ"
            r5 = r4
            goto L_0x001d
        L_0x0154:
            java.lang.String r4 = "ۜۜۘ۫ۘۗۘ۟ۧ۫ۧۨۘۖۦۦۘ۟ۡۢ"
            r5 = r4
            r15 = r14
            goto L_0x001d
        L_0x015a:
            r0 = r28
            java.util.LinkedHashMap r13 = r0.f1410e
            java.lang.String r4 = "۠ۧۦۖۗۡۘۖۙۨۛۖۜۘ۟ۘۘۛۖۖۘۧۙۙۙ۠۟"
            r5 = r4
            goto L_0x001d
        L_0x0163:
            com.obwhatsapp.youbasha.ui.views.t r4 = com.obwhatsapp.youbasha.ui.views.t.f1511a
            java.lang.Object r4 = r13.get(r4)
            android.view.View r4 = (android.view.View) r4
            java.lang.String r5 = "ۜۖۘۘۘۨۖۘۚۗۖۚۥ۟ۗۜۙ۫ۗۦۚ۫ۜ"
            r12 = r4
            goto L_0x001d
        L_0x0170:
            com.obwhatsapp.youbasha.ui.views.t r4 = com.obwhatsapp.youbasha.ui.views.t.f1512b
            java.lang.Object r4 = r13.get(r4)
            android.view.View r4 = (android.view.View) r4
            java.lang.String r5 = "ۛۛۨۘۘ۬ۘۘ۬ۚۛ۟ۛۥۢۥۘۘ۠۟ۧ"
            r11 = r4
            goto L_0x001d
        L_0x017d:
            r5 = 1217258623(0x488de47f, float:290595.97)
            java.lang.String r4 = "ۧۖۗ۠ۜۢۘ۠ۥۚۜ۠ۖۨۢ۫ۡۨۗ۫ۙۧۡ۟ۢۨۥ"
        L_0x0182:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -1683879327: goto L_0x0194;
                case -412625632: goto L_0x018c;
                case 153645140: goto L_0x019c;
                case 1392881973: goto L_0x0199;
                default: goto L_0x018b;
            }
        L_0x018b:
            goto L_0x0182
        L_0x018c:
            java.lang.String r4 = "۫ۜۢ۟ۡۧۙ۫ۜۘ۫ۛۨۘۚۧ۬ۦ۟ۦۘ"
            r5 = r4
            goto L_0x001d
        L_0x0191:
            java.lang.String r4 = "ۥ۠ۨۦۢۚۗ۟ۧۙۥۖۤۧ"
            goto L_0x0182
        L_0x0194:
            if (r15 != 0) goto L_0x0191
            java.lang.String r4 = "ۤۧۖۙ۠ۖۘۨۜۢۢۙ۬ۛۖۨ"
            goto L_0x0182
        L_0x0199:
            java.lang.String r4 = "ۛۘۜۡۙ۬۬ۗۗۗۜۡۘۙۗ۟ۥۨ۬ۦۥۧۘ"
            goto L_0x0182
        L_0x019c:
            java.lang.String r4 = "ۙ۠ۘۘۧۦۖۛۤۦ۠ۛۜ۠ۚۡ۠ۥۧۘ۟ۡۚ۠ۜۜۖۙ"
            r5 = r4
            goto L_0x001d
        L_0x01a1:
            r5 = 1201833582(0x47a2866e, float:83212.86)
            java.lang.String r4 = "۬ۤۜۘۧ۟ۥ۫ۡۙ۠ۦۥۨۥۡۘۖۜۚۨۙ"
        L_0x01a6:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -1837683477: goto L_0x01bd;
                case -1426758192: goto L_0x01b0;
                case -904113710: goto L_0x01b8;
                case 2060674402: goto L_0x01c0;
                default: goto L_0x01af;
            }
        L_0x01af:
            goto L_0x01a6
        L_0x01b0:
            java.lang.String r4 = "ۜۡۛۜۛۥۘ۟۬ۜۘ۫ۡۜۘۙ۠ۦۘ۫ۙۖ۫ۜۧۦۙۥۜۖۧ"
            r5 = r4
            goto L_0x001d
        L_0x01b5:
            java.lang.String r4 = "ۙ۟ۜۘ۠ۘۙ۟ۨۙۧۤۦۖۛۘۨۥۖ"
            goto L_0x01a6
        L_0x01b8:
            if (r15 == r12) goto L_0x01b5
            java.lang.String r4 = "ۤۗۘۘۦ۬ۘ۫ۦۨ۫ۛۗۢ۠۟۟ۥ۟ۗۛۖۘۚ۟ۦۤۙۤ"
            goto L_0x01a6
        L_0x01bd:
            java.lang.String r4 = "ۛ۠۠۠ۚۡۘۦۛۡۘۛ۟ۤۙۢ۠۫ۚۥۘ۬ۚ۫ۛۧۤ"
            goto L_0x01a6
        L_0x01c0:
            java.lang.String r4 = "ۨۗۥۛۛۘۡ۬ۘۘ۫ۧۜۘ۫ۚۤ۟ۛۘۘۧۨۘۥۥ۟۟ۚۡۘ"
            r5 = r4
            goto L_0x001d
        L_0x01c5:
            r5 = 1785029861(0x6a6564e5, float:6.933012E25)
            java.lang.String r4 = "ۥ۫ۨ۫۬۠۟۫ۖۘ۫ۗۙۘۥۘۖۗۡ۠ۡۜۜۘ۠۠ۖۘ"
        L_0x01ca:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -1637901273: goto L_0x01dc;
                case -227058405: goto L_0x01e4;
                case 323000608: goto L_0x01e1;
                case 451167889: goto L_0x01d4;
                default: goto L_0x01d3;
            }
        L_0x01d3:
            goto L_0x01ca
        L_0x01d4:
            java.lang.String r4 = "ۛۘۧۘۛۜۨۘ۟ۢۜۘۦۗۖۘۦۦۡۦ۫۫۠ۘۚۤۢۖۥ۟ۘ"
            r5 = r4
            goto L_0x001d
        L_0x01d9:
            java.lang.String r4 = "ۜۚ۟۬ۘۨۘۖۦۢۤۦۡۘۛ۬ۢۤ۬ۘۘۗ۠"
            goto L_0x01ca
        L_0x01dc:
            if (r15 != r11) goto L_0x01d9
            java.lang.String r4 = "ۢۗۜۘۗۚۢۘۘۘۤ۫۠ۖ۠ۦۘ۟ۧۤۨۘۨۘۗۡ۠"
            goto L_0x01ca
        L_0x01e1:
            java.lang.String r4 = "ۘ۠ۧۜۤۡۜۨۡ۠ۖۥۘۖۧۚۡۡۘۛۦۜ"
            goto L_0x01ca
        L_0x01e4:
            java.lang.String r4 = "ۤۚۖۘۛۥۙۘۧ۫ۦۘ۫ۛ۠ۖۘ"
            r5 = r4
            goto L_0x001d
        L_0x01e9:
            r4 = 1
            r0 = r28
            r0.f1425t = r4
            java.lang.String r4 = "ۥ۫ۘۖ۠ۡۘۖۡۥ۫۫۟ۘۚۨۘ"
            r5 = r4
            goto L_0x001d
        L_0x01f3:
            r4 = 0
            r0 = r28
            r0.f1425t = r4
            java.lang.String r4 = "ۤ۫۟۫ۙ۫ۖۜۡۘۡۥۘۘۥۡۘۘۛۦۘۙ۠ۗ۟۟ۦ"
            r5 = r4
            goto L_0x001d
        L_0x01fd:
            r5 = 1402132367(0x5392d78f, float:1.2613634E12)
            java.lang.String r4 = "ۜۘۛ۫ۤ۟ۢ۟ۚ۠ۛۜۘۥۙۨۧۡۦۘ۠ۗ"
        L_0x0202:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -8181563: goto L_0x0212;
                case 1559621459: goto L_0x020c;
                case 2006270943: goto L_0x021b;
                case 2019045337: goto L_0x007d;
                default: goto L_0x020b;
            }
        L_0x020b:
            goto L_0x0202
        L_0x020c:
            java.lang.String r4 = "ۦۤ۫ۨۨۨۘۢۖۥۘۚۖۗۗ۫ۡ۬ۤۖۘ"
            goto L_0x0202
        L_0x020f:
            java.lang.String r4 = "ۤۧۘ۬۬ۧۖ۠ۨۨۥۤ۟۟ۧۦۜۦۙۘۙ"
            goto L_0x0202
        L_0x0212:
            r0 = r28
            boolean r4 = r0.f1425t
            if (r4 == 0) goto L_0x020f
            java.lang.String r4 = "ۘۚۖۘۛ۟ۦۘۚۙۛۡۡۘۦۚۡۖۚۗ"
            goto L_0x0202
        L_0x021b:
            java.lang.String r4 = "۟ۛۘۘۥۗ۠ۖۧۨۘۚۖۘۗۡۖ۠ۖۘۚ۟ۧۚۤۙ"
            r5 = r4
            goto L_0x001d
        L_0x0220:
            r0 = r28
            com.obwhatsapp.youbasha.ui.views.u r10 = r0.f1408c
            java.lang.String r4 = "ۡ۬ۥۘۥۡ۟ۗۢۨۗۦ۠ۙۡۘ۟۫ۙۜۖۨ"
            r5 = r4
            goto L_0x001d
        L_0x0229:
            com.obwhatsapp.youbasha.ui.views.w r9 = com.obwhatsapp.youbasha.ui.views.w.f1524c
            java.lang.String r4 = "۠۟ۦ۬۬ۧۧ۬ۖۚ۟ۜۤۢۤ۟ۖۜۦۘۢۚۨ۫۠ۖۘ"
            r5 = r4
            goto L_0x001d
        L_0x0230:
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r4 = r10.f1516b
            r5 = 0
            r4.smoothScrollTo(r9, r5)
            java.lang.String r4 = "ۡ۟۠ۧ۫ۛۦۧۥۘۚۥۗۡۢۘۡۡۧ"
            r5 = r4
            goto L_0x001d
        L_0x023b:
            r5 = -1225993962(0xffffffffb6ecd116, float:-7.057689E-6)
            java.lang.String r4 = "ۤ۟ۨۥۚۨۛۨ۬ۛ۠۟ۚۤۦۘۧ۫ۦ"
        L_0x0240:
            int r24 = r4.hashCode()
            r24 = r24 ^ r5
            switch(r24) {
                case -2043208527: goto L_0x025e;
                case 230550581: goto L_0x025b;
                case 1362942055: goto L_0x024a;
                case 1601586003: goto L_0x0252;
                default: goto L_0x0249;
            }
        L_0x0249:
            goto L_0x0240
        L_0x024a:
            java.lang.String r4 = "ۥۦۡۘۢۗ۠ۜۨۘۨ۠ۥۗۦۥۘۜۥۨۤۘۧۘ"
            r5 = r4
            goto L_0x001d
        L_0x024f:
            java.lang.String r4 = "۠ۘۢۢۦۧۢۢۘ۬ۧۨۘۜۨۧ"
            goto L_0x0240
        L_0x0252:
            r0 = r28
            boolean r4 = r0.f1425t
            if (r4 == 0) goto L_0x024f
            java.lang.String r4 = "ۧۘۨۚ۬۫ۘۘ۬۬۠ۜۙۛۨ۠۫ۖ"
            goto L_0x0240
        L_0x025b:
            java.lang.String r4 = "ۨۥۚۜۧۦۘۤ۬ۙۥۚۧۧۛۨۘۗۡ۫۬ۚۡۘ"
            goto L_0x0240
        L_0x025e:
            java.lang.String r4 = "ۤۧۖۘۜۘۘۜۛۛ۟ۜ۫۟ۘۘۘۥۘۚۚۨۘۚۤۡۘۘۢۘۘ"
            r5 = r4
            goto L_0x001d
        L_0x0263:
            java.lang.String r4 = "ۨ۠ۖۘ۟۫ۢۛۙۡۘۥۖۨۘ۫۠ۙ۠ۨۜۙۘۨۢ۫۫ۨ۬ۨ"
            r5 = r4
            r7 = r8
            goto L_0x001d
        L_0x0269:
            boolean r6 = super.dispatchTouchEvent(r29)
            java.lang.String r4 = "ۡ۠ۜۘۢۢ۫۫ۜۧۘۦۧۖۛ۟ۛۤ۟ۜۘۜ۟ۛ"
            r5 = r4
            goto L_0x001d
        L_0x0272:
            java.lang.String r4 = "ۛۗۦۘۥۚۢۡۗۛ۟ۘ۠۠۟ۦۦۗ۟ۥۘ"
            r5 = r4
            r7 = r6
            goto L_0x001d
        L_0x0278:
            boolean r7 = super.dispatchTouchEvent(r29)
        L_0x027c:
            return r7
        L_0x027d:
            java.lang.String r4 = "ۦۢۙۜۖۥۖۡۤۥۚ۬ۛۧۦۜۗ"
            r5 = r4
            goto L_0x001d
        L_0x0282:
            java.lang.String r4 = "ۜۜۘ۫ۘۗۘ۟ۧ۫ۧۨۘۖۦۦۘ۟ۡۢ"
            r5 = r4
            goto L_0x001d
        L_0x0287:
            java.lang.String r4 = "ۤ۫۟۫ۙ۫ۖۜۡۘۡۥۘۘۥۡۘۘۛۦۘۙ۠ۗ۟۟ۦ"
            r5 = r4
            goto L_0x001d
        L_0x028c:
            java.lang.String r4 = "ۛۗۦۘۥۚۢۡۗۛ۟ۘ۠۠۟ۦۦۗ۟ۥۘ"
            r5 = r4
            goto L_0x001d
        L_0x0291:
            java.lang.String r4 = "۬۫ۜۘ۬ۗۦۘ۫ۛۤ۠ۨۢۘۧۧۘۥ۠"
            r5 = r4
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public View getMainView() {
        String str = "ۛ۠ۥۘ۫ۥ۠ۚۜۨۗ۠۫ۥۘۘۡۛۥ۫ۡۗۙۦۙ";
        while (true) {
            switch ((str.hashCode() ^ 589) ^ 1085114322) {
                case -1997792090:
                    return this.f1411f;
                case 105995428:
                    str = "ۛۜۛ۬ۤۚۘ۬ۖ۠ۦۚۜۦۨۘۘۤۙ";
                    break;
            }
        }
    }

    public boolean isClose() {
        String str = "ۙ۬ۦۖۦۜۖۙۦۘۘۙۡۗۦ۬۟ۗۥۘۘ۠ۛ۫ۚۖۘۗۚۧ";
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            switch ((str.hashCode() ^ 524) ^ 1612623644) {
                case -1954067903:
                    String str2 = "ۛ۫ۖۘ۬ۢ۟ۡۧۤۖۜۦۘۥ۫ۘۖۚۘۧ۫ۗۡۤۖۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 720853489) {
                            case -827037452:
                                str2 = "ۛۦۜۘۢۘۤ۬ۧۡۧۜۖ۠ۜۛۤۜۜۘۛۗۖ";
                                break;
                            case 355793970:
                                str = "۟ۦۥۘ۫ۡۘۘۘۘۘۘۙۜۗۜۨۗۤۡۡۘ";
                                continue;
                            case 1362814214:
                                if (this.f1409d != w.f1524c) {
                                    str2 = "ۥۚۡ۬ۡۡۨ۫ۚۚۚۖ۟ۘۖۜۖۛ";
                                    break;
                                } else {
                                    str2 = "ۥۢ۟۬۬ۦۘۤۗ۠ۥ۬۟ۚ۬۠ۡۙ۠ۨ۠ۖ";
                                    break;
                                }
                            case 1982331512:
                                str = "ۙۖۗۙۨۢۦۡۨۨۧۦۘۤۚۚ۫ۤ۠ۡۢۜ";
                                continue;
                        }
                    }
                    break;
                case -1715872229:
                    str = "ۚۦۤۨۗ۟۫ۥۦۘۤۧۖ۠۫ۦۨۥۢۦۖۖۜۚۥۘ";
                    z2 = z3;
                    break;
                case -1543326160:
                    return z2;
                case -327328914:
                    str = "ۡۤ۠ۤ۟ۙۢۨۛۤۘۘۤۡ۟ۖۡ۬۫ۤۜۘۥۘۛۜۘ";
                    break;
                case -268033446:
                    str = "ۡۤ۠ۤ۟ۙۢۨۛۤۘۘۤۡ۟ۖۡ۬۫ۤۜۘۥۘۛۜۘ";
                    z2 = false;
                    break;
                case 659721611:
                    str = "ۦۖۜۘۦۧۦۜۢۜ۟ۥ۟ۜۡۛۗۙۦ";
                    break;
                case 949244230:
                    str = "ۗ۠ۢۚۘۡۘۡۤۖۘۚۙ۬ۤ۟ۜۘ";
                    break;
                case 2056391843:
                    z3 = true;
                    str = "ۥۛۢۛۤۜۘۖۙۢۖۦۥۘ۠ۤۖۘ۬ۦ۬۫ۤۗۙۗۖ۫۫۠";
                    break;
            }
        }
    }

    public boolean isOpen() {
        String str = "ۧۙۨ۬۫ۥۘۗۦۜ۫ۨۨۛۨۙۤ۟ۖۘۤۨ۬";
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            switch ((str.hashCode() ^ 483) ^ 726898939) {
                case -2054662569:
                    str = "ۖۢۖۘ۟ۚۥۚۖۥۘ۫ۡۗ۬ۢ۬ۚۥۦ";
                    break;
                case -1594566830:
                    str = "۟ۥۥۘ۟۫ۥۘۖۘۤۖۤۥۘۡۜۗ";
                    break;
                case -421504963:
                    str = "ۤۖۛۨۚۛۘ۫ۨ۠ۜۧ۬ۘ۬ۗۛۥۦۡ۟";
                    break;
                case 254383337:
                    return z2;
                case 645410275:
                    str = "۟ۥۥۘ۟۫ۥۘۖۘۤۖۤۥۘۡۜۗ";
                    z2 = false;
                    break;
                case 681908495:
                    z3 = true;
                    str = "ۤۧ۠ۘ۫ۥ۠ۥۚ۫ۜۜۘۗۧۨۢۚ۠ۛۤۗ";
                    break;
                case 1744344041:
                    str = "۫ۧۥۘ۠ۛۧۙۥ۫ۖ۠ۛ۠ۦ۟";
                    z2 = z3;
                    break;
                case 1744544565:
                    String str2 = "ۜ۫ۛۖ۬ۜۘۛۥۡۘۨ۬ۡۘۦۨ";
                    while (true) {
                        switch (str2.hashCode() ^ -2080467072) {
                            case -1650815568:
                                str2 = "ۙ۟ۡۗ۬ۨ۫ۢۦۨۥۘۘۦۧۦۘ۬ۖۡۘۗ۬ۚ";
                                break;
                            case -1105235108:
                                if (this.f1409d != w.f1523b) {
                                    str2 = "ۘۖۢۦۗۘۖۥ۬ۢ۫ۗ۟ۢۖۘۤۜۧۘۦ۟ۖۧۢۡ";
                                    break;
                                } else {
                                    str2 = "۠ۛۖۘ۟ۜۙۨۤ۫ۘۘۘ۬ۜۘۖۤۖۘ";
                                    break;
                                }
                            case 1529756637:
                                str = "۬ۘۦۜۤۛۗۡۢ۫ۘۘۘۢۘۥۧ۟ۘ۫ۛۖۘۗۡۖۘۧۚۥ";
                                continue;
                            case 1829992235:
                                str = "ۚۙۚۤۖۧۙۥۥ۠ۚ۟ۥ۠ۡۘۢۤۦ۠ۡۖۘ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinishInflate() {
        /*
            r7 = this;
            r1 = 0
            super.onFinishInflate()
            java.util.LinkedHashMap r2 = r7.f1410e
            com.obwhatsapp.youbasha.ui.views.t r3 = com.obwhatsapp.youbasha.ui.views.t.f1511a     // Catch:{ Exception -> 0x0120 }
            int r4 = r7.f1427v     // Catch:{ Exception -> 0x0120 }
            r5 = 1747360881(0x68269c71, float:3.1471947E24)
            java.lang.String r0 = "ۛۙ۠۟ۘۚۥۧۜۖۥۦۥۡۛۙۨۖ"
        L_0x000f:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x0120 }
            r6 = r6 ^ r5
            switch(r6) {
                case -2015609669: goto L_0x0023;
                case -1485808347: goto L_0x0020;
                case 672271688: goto L_0x005c;
                case 1037107317: goto L_0x0018;
                default: goto L_0x0017;
            }     // Catch:{ Exception -> 0x0120 }
        L_0x0017:
            goto L_0x000f
        L_0x0018:
            if (r4 < 0) goto L_0x001d
            java.lang.String r0 = "۟ۙ۠ۘۡۦۧۘۧۘۚۖۧۘۥۧۤۛۡۖ"
            goto L_0x000f
        L_0x001d:
            java.lang.String r0 = "ۦۢۘۘۙۖ۟ۡۙۨۘۖۜۗۧۚۜۨۡۦۘۙۥۘۢۙ۫"
            goto L_0x000f
        L_0x0020:
            java.lang.String r0 = "۫۠۬ۡۙۙ۬۫۬ۗۛۚۡۜۘۡۧۘۘۗ۟ۦۘ"
            goto L_0x000f
        L_0x0023:
            r5 = 1811558851(0x6bfa31c3, float:6.049329E26)
            java.lang.String r0 = "ۚ۠ۢ۟ۥۢۤۨ۟ۛۥۦۘۢۤۚۧ۬۟"
        L_0x0028:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x0120 }
            r6 = r6 ^ r5
            switch(r6) {
                case -902824021: goto L_0x005c;
                case -558467960: goto L_0x0040;
                case -181003911: goto L_0x0031;
                case 1081999706: goto L_0x0037;
                default: goto L_0x0030;
            }     // Catch:{ Exception -> 0x0120 }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            java.lang.String r0 = "۫ۨۡۘ۠ۜۤۢۜۢۤۦۡۙۛۦۘۘۨۜۘ"
            goto L_0x0028
        L_0x0034:
            java.lang.String r0 = "ۘۧۜۘۤۥۙۘۢۥۧۛۦ۟ۡۡۧۡۗۨۘۚ"
            goto L_0x0028
        L_0x0037:
            int r0 = r7.getChildCount()     // Catch:{ Exception -> 0x0120 }
            if (r4 >= r0) goto L_0x0034
            java.lang.String r0 = "ۦۚۥۘۛ۬ۥۘ۫ۦۤۖۧ۟ۨ۟ۥۘ"
            goto L_0x0028
        L_0x0040:
            android.view.View r0 = r7.getChildAt(r4)     // Catch:{ Exception -> 0x0120 }
        L_0x0044:
            r2.put(r3, r0)     // Catch:{ Exception -> 0x0120 }
            com.obwhatsapp.youbasha.ui.views.t r3 = com.obwhatsapp.youbasha.ui.views.t.f1512b     // Catch:{ Exception -> 0x0120 }
            int r4 = r7.f1428w     // Catch:{ Exception -> 0x0120 }
            r5 = 94497399(0x5a1ea77, float:1.5226496E-35)
            java.lang.String r0 = "ۥۛ۬ۖۛۢۛۖۛ۟ۤۧ۟ۖۦ۟۫ۜ"
        L_0x0050:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x0120 }
            r6 = r6 ^ r5
            switch(r6) {
                case -111250755: goto L_0x0061;
                case 74168345: goto L_0x0059;
                case 1172158022: goto L_0x00dd;
                case 1588482785: goto L_0x0066;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            java.lang.String r0 = "ۦۢۘۘۜۛۘۨۨۗۥ۫ۦ۬ۛ۫"
            goto L_0x0050
        L_0x005c:
            r0 = r1
            goto L_0x0044
        L_0x005e:
            java.lang.String r0 = "ۡۚۡۦۜۘۚۖۡۥۥۛۢۜۨۚۛۨۘۜۡۥ"
            goto L_0x0050
        L_0x0061:
            if (r4 < 0) goto L_0x005e
            java.lang.String r0 = "۠ۛۥۖۡۗ۫ۖۙۤۚۗۢ۬ۧ۬۠ۖۘۗۢۗ"
            goto L_0x0050
        L_0x0066:
            r5 = -227210800(0xfffffffff27509d0, float:-4.8534842E30)
            java.lang.String r0 = "۫۠ۖۘۗ۬۬ۖۤۗۨ۠۫ۡ۟ۘۘۜۦۡۘ۠۬ۧ۠ۧۛ"
        L_0x006b:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x0120 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1534023502: goto L_0x007a;
                case -653736748: goto L_0x00dd;
                case 1379503772: goto L_0x0074;
                case 1406019539: goto L_0x0083;
                default: goto L_0x0073;
            }     // Catch:{ Exception -> 0x0120 }
        L_0x0073:
            goto L_0x006b
        L_0x0074:
            java.lang.String r0 = "ۨۦۨۘۚۙۡ۠ۢۜۘۙۜۤۤۨۖۜۖۧۜ۫ۜ"
            goto L_0x006b
        L_0x0077:
            java.lang.String r0 = "ۗۙۨۘۡۘۧۘ۫ۡۖۘۢۙۛۥۘۢ۠ۧۘۘ"
            goto L_0x006b
        L_0x007a:
            int r0 = r7.getChildCount()     // Catch:{ Exception -> 0x0120 }
            if (r4 >= r0) goto L_0x0077
            java.lang.String r0 = "۫ۜۦۘۜۧ۠ۨۜۨۜۗ۟۬ۡۜۘۤۚۧۚۨۘ"
            goto L_0x006b
        L_0x0083:
            android.view.View r0 = r7.getChildAt(r4)     // Catch:{ Exception -> 0x0120 }
        L_0x0087:
            r2.put(r3, r0)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r0 = "swipe_mute"
            java.lang.String r2 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r2)     // Catch:{ Exception -> 0x0120 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Exception -> 0x0120 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0120 }
            r7.f1412g = r0     // Catch:{ Exception -> 0x0120 }
            java.lang.String r0 = "swipe_call"
            java.lang.String r2 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r2)     // Catch:{ Exception -> 0x0120 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Exception -> 0x0120 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0120 }
            r7.f1413h = r0     // Catch:{ Exception -> 0x0120 }
            java.lang.String r0 = "swipe_archive"
            java.lang.String r2 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r2)     // Catch:{ Exception -> 0x0120 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Exception -> 0x0120 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0120 }
            r7.f1414i = r0     // Catch:{ Exception -> 0x0120 }
            java.lang.String r0 = "swipe_unread"
            java.lang.String r2 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r2)     // Catch:{ Exception -> 0x0120 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Exception -> 0x0120 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0120 }
            r7.f1415j = r0     // Catch:{ Exception -> 0x0120 }
        L_0x00ca:
            int r2 = r7.f1426u     // Catch:{ Exception -> 0x0120 }
            r3 = -1234382835(0xffffffffb66cd00d, float:-3.5287842E-6)
            java.lang.String r0 = "ۚۤۧۖۚۥۚۦۘۤۙۘۘۦ۟ۦ"
        L_0x00d1:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x0120 }
            r4 = r4 ^ r3
            switch(r4) {
                case -2030687158: goto L_0x00da;
                case -822302179: goto L_0x00e2;
                case -443965183: goto L_0x00e7;
                case 549476007: goto L_0x0122;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            goto L_0x00d1
        L_0x00da:
            java.lang.String r0 = "ۙۗۦۘۛۛ۬ۦ۟ۡۘۥ۠۬ۙۡۡ۟ۥۧۥۖۘۤ۟ۡۘ"
            goto L_0x00d1
        L_0x00dd:
            r0 = r1
            goto L_0x0087
        L_0x00df:
            java.lang.String r0 = "۬ۧۧۢ۟ۥۖۡۘۧۜۡۘ۠ۚۧۥۤۗۖۦۘ۫ۛۚ"
            goto L_0x00d1
        L_0x00e2:
            if (r2 < 0) goto L_0x00df
            java.lang.String r0 = "ۛۥۙۘ۬ۨۥۖۗ۬ۙۥۤۜۙۗۧۛۢ۬۠ۦۜۜۘ"
            goto L_0x00d1
        L_0x00e7:
            r3 = 1739010422(0x67a73176, float:1.5790952E24)
            java.lang.String r0 = "ۥۗۘۘۙ۟ۗۗۡۜۘۗ۬ۦۧۙۧ۟ۢ"
        L_0x00ec:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2061991621: goto L_0x0101;
                case -1836694534: goto L_0x00f5;
                case -527231797: goto L_0x0104;
                case 1821321489: goto L_0x0122;
                default: goto L_0x00f4;
            }
        L_0x00f4:
            goto L_0x00ec
        L_0x00f5:
            int r0 = r7.getChildCount()
            if (r2 >= r0) goto L_0x00fe
            java.lang.String r0 = "ۢۨۙۖۦۖۜۡ۫ۘۚۘۘۢۚ"
            goto L_0x00ec
        L_0x00fe:
            java.lang.String r0 = "ۙۦۨۧ۫ۦ۫ۥۥۘۖۦ۬ۡۚۥۖۡۖ"
            goto L_0x00ec
        L_0x0101:
            java.lang.String r0 = "ۢ۟ۙۚ۬ۚۖۛ۟ۢ۬ۖۘ۟۠ۥۨۛۗۘۛ۫ۘۥۖۘ"
            goto L_0x00ec
        L_0x0104:
            android.view.View r0 = r7.getChildAt(r2)
        L_0x0108:
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            java.lang.String r1 = "stock_conversations_row"
            java.lang.String r2 = "layout"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r2)
            int r1 = com.obwhatsapp.yo.HomeUI.HomeStyle(r1)
            r0.setLayoutResource(r1)
            android.view.View r0 = r0.inflate()
            r7.f1411f = r0
            return
        L_0x0120:
            r0 = move-exception
            goto L_0x00ca
        L_0x0122:
            r0 = r1
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow.onFinishInflate():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        r0 = "ۜ۫ۚ۟ۨۡ۠۠ۥۖۘۗ۠ۖۦ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            r1 = 0
            java.lang.String r0 = "ۧۨ۬۟ۜۙ۠ۖۨۘۥۗۚۥۨۦۘۦۦۨۢۢۜۤۘۖۡۘ۟"
        L_0x000c:
            int r11 = r0.hashCode()
            r12 = 234(0xea, float:3.28E-43)
            r13 = 281341124(0x10c4ecc4, float:7.7673164E-29)
            r11 = r11 ^ r12
            r11 = r11 ^ r13
            switch(r11) {
                case -2074679700: goto L_0x0107;
                case -1885097894: goto L_0x01fb;
                case -1864068290: goto L_0x00c4;
                case -1572354055: goto L_0x004b;
                case -1551885585: goto L_0x015e;
                case -1408062448: goto L_0x00cd;
                case -1375308036: goto L_0x003f;
                case -1201949787: goto L_0x0115;
                case -999988101: goto L_0x0115;
                case -938024550: goto L_0x0132;
                case -647913868: goto L_0x01e2;
                case -610036980: goto L_0x00a2;
                case -488081443: goto L_0x0166;
                case -122992781: goto L_0x0115;
                case -83013574: goto L_0x018f;
                case -22941649: goto L_0x0139;
                case -16128076: goto L_0x0084;
                case -3816777: goto L_0x01f2;
                case 159707065: goto L_0x0067;
                case 337547719: goto L_0x01db;
                case 387263943: goto L_0x01bc;
                case 430411714: goto L_0x00d6;
                case 460066823: goto L_0x0201;
                case 538653160: goto L_0x0044;
                case 677816123: goto L_0x0021;
                case 748868142: goto L_0x01e9;
                case 792928631: goto L_0x00e4;
                case 1008574190: goto L_0x001b;
                case 1154388281: goto L_0x001e;
                case 1308336324: goto L_0x0207;
                case 1404862050: goto L_0x0141;
                case 1564244826: goto L_0x016e;
                case 1716448502: goto L_0x00de;
                case 1804115168: goto L_0x019d;
                case 1870543277: goto L_0x020e;
                case 2130440724: goto L_0x0197;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x000c
        L_0x001b:
            java.lang.String r0 = "ۢ۠ۦۘۛۦۥۘ۠ۛۦۘ۟ۧۤ۬ۡۜۤۢۤۗۛۥۥۧ۫ۛۧ۫"
            goto L_0x000c
        L_0x001e:
            java.lang.String r0 = "ۧۥۜۥۗۦ۬۫ۘۘۤۡ۠ۖۥۗۚۙۜۘ"
            goto L_0x000c
        L_0x0021:
            r11 = 1988560122(0x768704fa, float:1.3692598E33)
            java.lang.String r0 = "ۘۛۨۘۢۚۗۨۛ۬ۖ۫ۚۖۚۖۘۧ۫ۚ"
        L_0x0026:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1426075429: goto L_0x002f;
                case -978942: goto L_0x0035;
                case 781946409: goto L_0x003c;
                case 1696401078: goto L_0x0212;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            java.lang.String r0 = "ۛۜ۟۟ۥۗ۠۬ۤۦۙۦۢۤۘ۬ۜۡۚۡۧ۫ۧ"
            goto L_0x0026
        L_0x0032:
            java.lang.String r0 = "ۢۢۖۨ۫ۥۘ۫ۨۙۙۡۗۡۛۢ۬ۙۢ"
            goto L_0x0026
        L_0x0035:
            boolean r0 = r14.f1419n
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "ۡۖۡۤۘۘۘۥ۟۬ۦۗۖۘۤۜۤۚۚۖ۫ۙۡۘۡۜۘۘۡۗۜۘ"
            goto L_0x0026
        L_0x003c:
            java.lang.String r0 = "ۜ۟ۤۛۤۘۘ۬۠ۦۨۖۦ۬ۢۤۧۤۥۦ۫ۤۙ۬ۖۘۧ۟ۨۘ"
            goto L_0x000c
        L_0x003f:
            boolean r0 = super.onInterceptTouchEvent(r15)
        L_0x0043:
            return r0
        L_0x0044:
            int r10 = r15.getAction()
            java.lang.String r0 = "ۥۧۘۘۚۘۜۦۜۦۧۜۖۘۜۖۡۚۢۥۦۚۦ۬ۖۜۘ"
            goto L_0x000c
        L_0x004b:
            r11 = -332395891(0xffffffffec300a8d, float:-8.512831E26)
            java.lang.String r0 = "ۥ۟ۦۘۢۢۥۨۘ۟ۤ۫ۜۧۘۘۚۡۘ"
        L_0x0050:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1625551745: goto L_0x021e;
                case -1351811932: goto L_0x005f;
                case -383439552: goto L_0x0059;
                case 1701199649: goto L_0x0064;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            java.lang.String r0 = "ۚۛۨۜۥۡۥ۬ۤ۟۟ۙۤ۬ۧۢۗۨۡۦۦۘۤۘۘ"
            goto L_0x0050
        L_0x005c:
            java.lang.String r0 = "۟۠ۜۘۜۤۤۡۦۗ۫ۢۢۡ۫۫۫ۚۤۥۙ۫ۙۨ۬"
            goto L_0x0050
        L_0x005f:
            if (r10 == 0) goto L_0x005c
            java.lang.String r0 = "ۗ۬ۗۛۘۜۘۢۨ۟ۡۖۧۘۦۨۧ۟ۚۥ۬ۢۖۤ۟ۨۘۘۨ۟"
            goto L_0x0050
        L_0x0064:
            java.lang.String r0 = "ۦۦ۠ۡۨۡۘۚ۠۠ۘ۫۟ۧ۬ۚۖ۫ۜۚ۟ۨۘ"
            goto L_0x000c
        L_0x0067:
            r11 = -2043798314(0xffffffff862e1cd6, float:-3.2746948E-35)
            java.lang.String r0 = "ۥۡۨۘ۫ۤۖۘۦۦۜۘۥۚۦۧۙۚ"
        L_0x006c:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1311549503: goto L_0x00b0;
                case -1256636033: goto L_0x0075;
                case -843214260: goto L_0x007b;
                case -555029552: goto L_0x0081;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x006c
        L_0x0075:
            java.lang.String r0 = "ۧۖۥۘ۫ۥۦۨۖ۠ۛۛۘۙۨۨۜۜ۟ۘۜ"
            goto L_0x000c
        L_0x0078:
            java.lang.String r0 = "ۥ۫۠ۧ۬ۚ۠ۘۨۘۜۖۨۚۜ۠ۖۘ۠۫ۗ"
            goto L_0x006c
        L_0x007b:
            r0 = 1
            if (r10 == r0) goto L_0x0078
            java.lang.String r0 = "ۗۘۢۛۡ۟ۢ۬ۦۜ۫ۦۜۙۤۚ۟ۘ۫ۛۘۜۘ۫"
            goto L_0x006c
        L_0x0081:
            java.lang.String r0 = "ۚۘۡۘۘ۬۬ۧۢ۫ۨۚۢۖۡۗ"
            goto L_0x006c
        L_0x0084:
            r11 = 2071070314(0x7b72066a, float:1.2566659E36)
            java.lang.String r0 = "ۖۡۖۘۡۤۨۘۙۢۙۛۘۘۘۛۤۡۘ۟ۧۥۘۥۢۦ"
        L_0x0089:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1993624437: goto L_0x0098;
                case -95246452: goto L_0x009e;
                case -4956063: goto L_0x0092;
                case 291091473: goto L_0x0216;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x0089
        L_0x0092:
            java.lang.String r0 = "ۘ۠ۘۘۚۦۢۛ۬ۥۧۙۢۡۙ۠ۦۛۢۤۘۜۦۦۢۡۙۧ"
            goto L_0x0089
        L_0x0095:
            java.lang.String r0 = "ۦۥ۫۫ۧۦۘۗۘۜۘۙۡۥۗۢ۬"
            goto L_0x0089
        L_0x0098:
            r0 = 2
            if (r10 == r0) goto L_0x0095
            java.lang.String r0 = "ۛۡۜۘ۠ۦۛۨۙۨۘۚۤ۬۟ۡ۬ۤۜۡۤۙۙ۟ۜ۟"
            goto L_0x0089
        L_0x009e:
            java.lang.String r0 = "ۢۘۡۜۨۘۘۡۖۘۛۚۚۚۖۚۚۢۦۘ۠ۖۡ"
            goto L_0x000c
        L_0x00a2:
            r11 = -1128380647(0xffffffffbcbe4719, float:-0.023227261)
            java.lang.String r0 = "ۗۧۥۙۥۨۡۚۙ۠۟ۤ۟ۚۦۚۙۖ"
        L_0x00a7:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -524701647: goto L_0x00b0;
                case 1196725186: goto L_0x00bd;
                case 1504733649: goto L_0x00c0;
                case 1684308449: goto L_0x00b7;
                default: goto L_0x00af;
            }
        L_0x00af:
            goto L_0x00a7
        L_0x00b0:
            java.lang.String r0 = "ۜ۫ۚ۟ۨۡ۠۠ۥۖۘۗ۠ۖۦ"
            goto L_0x000c
        L_0x00b4:
            java.lang.String r0 = "۠ۢۚۡۥۨۡ۫ۖۘۤۡۦۘ۟ۗۧ"
            goto L_0x00a7
        L_0x00b7:
            r0 = 3
            if (r10 == r0) goto L_0x00b4
            java.lang.String r0 = "۠ۨۥ۠۟۠ۤۗۨۘۖۡۚۦۧۦۘ"
            goto L_0x00a7
        L_0x00bd:
            java.lang.String r0 = "ۗۛۦۨۤۥۦۗۗ۬ۙۖ۫ۨۥۖ۠"
            goto L_0x00a7
        L_0x00c0:
            java.lang.String r0 = "ۛۧۧۨۜۡۘۥۧۘ۫۠ۥۘۨۜۗ"
            goto L_0x000c
        L_0x00c4:
            float r0 = r15.getX()
            int r9 = (int) r0
            java.lang.String r0 = "ۧۛۘ۟ۦ۫۟ۥۦ۫ۜۘۧۥۜۘ۟۫ۙ۠ۜۦ"
            goto L_0x000c
        L_0x00cd:
            float r0 = r15.getY()
            int r8 = (int) r0
            java.lang.String r0 = "ۘ۬ۘۗۜۖۛۨ۟ۢ۠ۚۡۖۘ"
            goto L_0x000c
        L_0x00d6:
            int r0 = r14.f1422q
            int r7 = r9 - r0
            java.lang.String r0 = "ۧۡۦۘۦۖ۠ۦ۠۬۠ۗ۠ۙۚۖۘۢۡ۠ۤۙۙۛۗۗۚۨۨۘ"
            goto L_0x000c
        L_0x00de:
            int r6 = r14.f1423r
            java.lang.String r0 = "ۚۡۡۧۜۧۖۡۧۘۡۖۨۙۙۛۛۦۡۘۖۙۚ۬ۦ۫ۦ۫ۖ"
            goto L_0x000c
        L_0x00e4:
            r11 = 2073692509(0x7b9a095d, float:1.5996073E36)
            java.lang.String r0 = "ۨ۫ۡۘۦۖ۫ۧۙۡۨ۠ۖۢ۫ۥ۠ۛۤ۬۫ۘ"
        L_0x00e9:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -237838015: goto L_0x00f2;
                case -217055022: goto L_0x0115;
                case 1043097249: goto L_0x00f9;
                case 1161433550: goto L_0x0104;
                default: goto L_0x00f1;
            }
        L_0x00f1:
            goto L_0x00e9
        L_0x00f2:
            java.lang.String r0 = "۫ۗۦۘۜۘۜۘۘۘ۟ۘۗۤۥۜۜۦۚۡۘۤۘۙۦ۠ۡۘ"
            goto L_0x000c
        L_0x00f6:
            java.lang.String r0 = "ۥ۫ۘۘ۫۫ۙۥۛۚۧۖۢۨۚۥ۫۠ۨ۠ۙۖۛۙ۫ۡۢۢ"
            goto L_0x00e9
        L_0x00f9:
            int r0 = java.lang.Math.abs(r7)
            int r12 = r14.f1406a
            if (r0 <= r12) goto L_0x00f6
            java.lang.String r0 = "۠ۚۜۘۜۦۛ۫ۨۜ۬ۛۙۜۧۘ۠ۢۦ۟ۖۧ"
            goto L_0x00e9
        L_0x0104:
            java.lang.String r0 = "۬ۗ۠ۙ۠ۚۦۚۦ۟ۛۖۘۡ۠ۦۘۘۦۧ۟ۦۘ۫ۙۥ"
            goto L_0x00e9
        L_0x0107:
            r11 = 542322438(0x20532f06, float:1.7887954E-19)
            java.lang.String r0 = "ۡ۬ۚ۫ۜۨۘ۠ۧۜۖ۠ۨ۫ۤ۠ۛۧۙۛۜۘ"
        L_0x010c:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -2129165382: goto L_0x012b;
                case -655915534: goto L_0x012e;
                case 557211134: goto L_0x011c;
                case 1400086881: goto L_0x0115;
                default: goto L_0x0114;
            }
        L_0x0114:
            goto L_0x010c
        L_0x0115:
            java.lang.String r0 = "ۡۨۡۘۧۗۘۘۜۖۥۘۢ۟ۢۘۘۗ۬ۢۘۘ"
            goto L_0x000c
        L_0x0119:
            java.lang.String r0 = "ۦۗۚۢۨۡۘۨۘۖۛ۫ۨ۫ۖۗۧ۬۫ۚۜۛ"
            goto L_0x010c
        L_0x011c:
            int r0 = java.lang.Math.abs(r7)
            int r12 = r8 - r6
            int r12 = java.lang.Math.abs(r12)
            if (r0 <= r12) goto L_0x0119
            java.lang.String r0 = "ۤ۠ۚ۠ۤۙ۫ۥۡۘۚۚ۬ۖ۠ۖۙ۬ۦ۬۬ۧ"
            goto L_0x010c
        L_0x012b:
            java.lang.String r0 = "۬ۜۚۗ۬۠ۘۙۜۖ۠۫ۗۡۘۗۦۥۘۖۥ۬"
            goto L_0x010c
        L_0x012e:
            java.lang.String r0 = "ۖۗۦ۟ۜۘۘۜ۬ۛ۟۫ۘۗۡۛۦۜۖۘ۬ۥۘۢۦۥ۟ۛۨۘ"
            goto L_0x000c
        L_0x0132:
            r0 = 1
            r14.A = r0
            java.lang.String r0 = "۠ۦۨۥۧۥۥۢۘ۟ۗۡۢ۠ۨۤۤ۫ۖۗۘۘۜۨۜۛۢۧ"
            goto L_0x000c
        L_0x0139:
            android.view.ViewParent r5 = r14.getParent()
            java.lang.String r0 = "ۥ۫ۦۨۘۦۘۡ۬ۗۚۖۧ۬ۖۧۦۖۘ"
            goto L_0x000c
        L_0x0141:
            r11 = -1095599454(0xffffffffbeb27aa2, float:-0.34859186)
            java.lang.String r0 = "۫ۢۖۘ۬۬ۦ۫۬ۦۘۤۤۦۘۚۜۘۘۚ۠ۢ"
        L_0x0146:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1723686591: goto L_0x015b;
                case -772717522: goto L_0x014f;
                case 1146990667: goto L_0x0115;
                case 1379059850: goto L_0x0156;
                default: goto L_0x014e;
            }
        L_0x014e:
            goto L_0x0146
        L_0x014f:
            java.lang.String r0 = "۠ۗۙۗۘۙۨۙۦۘۚۙۥۙۧۖۧۦۘۗۜۤ"
            goto L_0x000c
        L_0x0153:
            java.lang.String r0 = "۬۠ۖ۬ۗۨۤۚۜ۬ۤۧۚۢۢۢۢۥۘ"
            goto L_0x0146
        L_0x0156:
            if (r5 == 0) goto L_0x0153
            java.lang.String r0 = "ۙۛۡۘۛۡۥۨۤۨۤۘۤۥۗ۠ۡۖۗ۫ۙۜ۠ۥۘ"
            goto L_0x0146
        L_0x015b:
            java.lang.String r0 = "ۥۢۧ۠۫ۨۘۡۘۥۥۨۤ۠۠ۖۘ۬۫ۡۘۖۖۛۤۘۨ۠ۤۙ"
            goto L_0x0146
        L_0x015e:
            r0 = 1
            r5.requestDisallowInterceptTouchEvent(r0)
            java.lang.String r0 = "ۨۧۨۘ۟ۗۜۢۚۤۢۡۘۗۙۡ۟ۛۖ"
            goto L_0x000c
        L_0x0166:
            android.view.ViewParent r4 = r14.getParent()
            java.lang.String r0 = "ۘۨۘۘۧۜۧۘ۟ۘ۫ۖ۠ۛ۬ۢۥۘۦۦۡۘۛۤۘۢ۠۬"
            goto L_0x000c
        L_0x016e:
            r11 = -1438812360(0xffffffffaa3d7738, float:-1.6827934E-13)
            java.lang.String r0 = "ۧۥ۟ۤۙۦۥۗۡ۟ۘۜ۬۬ۖۘۥ۬۠"
        L_0x0173:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1752473845: goto L_0x0183;
                case -24127411: goto L_0x0188;
                case 158910621: goto L_0x017c;
                case 1635167648: goto L_0x018b;
                default: goto L_0x017b;
            }
        L_0x017b:
            goto L_0x0173
        L_0x017c:
            java.lang.String r0 = "ۡۢۗۦۚۘۘۙۧۨۘۚۨۘۘۢ۠ۜۖۛۢ۫ۢۦ"
            goto L_0x000c
        L_0x0180:
            java.lang.String r0 = "ۘۗۤۖۛۡۘۗۘۨۘۖۥۧۛۚۡۚۜۖۡۧۨۘۘۥ۠"
            goto L_0x0173
        L_0x0183:
            if (r4 == 0) goto L_0x0180
            java.lang.String r0 = "ۛۢۜۥۡۜۘۗ۫ۗۚۛۛۘۦۧ"
            goto L_0x0173
        L_0x0188:
            java.lang.String r0 = "۬ۤۖۘۥۢۨۖۜۨۘۙۗۘۜۧۥۘۢۥ۬"
            goto L_0x0173
        L_0x018b:
            java.lang.String r0 = "ۖ۬ۦۖۥۦۘۧۛۖۨۜۦۘۜۢۧۤۗۜۘ۟ۚ"
            goto L_0x000c
        L_0x018f:
            r0 = 0
            r4.requestDisallowInterceptTouchEvent(r0)
            java.lang.String r0 = "ۡۢۗۦۚۘۘۙۧۨۘۚۨۘۘۢ۠ۜۖۛۢ۫ۢۦ"
            goto L_0x000c
        L_0x0197:
            com.obwhatsapp.youbasha.ui.views.t r3 = r14.f1407b
            java.lang.String r0 = "ۤۜۚۚۘ۟ۡۦۧۚۧ۟ۗۖۨۖۘۜۙ۫ۜۘ"
            goto L_0x000c
        L_0x019d:
            r11 = -1440255762(0xffffffffaa2770ee, float:-1.487176E-13)
            java.lang.String r0 = "ۗۨۢۛۖۙ۟۫ۦ۬ۨۧۡۧۜ۟ۨ۬"
        L_0x01a2:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -781674779: goto L_0x01ab;
                case 414428169: goto L_0x021a;
                case 1065107463: goto L_0x01b8;
                case 1325489989: goto L_0x01b5;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            goto L_0x01a2
        L_0x01ab:
            com.obwhatsapp.youbasha.ui.views.t r0 = com.obwhatsapp.youbasha.ui.views.t.f1511a
            if (r3 == r0) goto L_0x01b2
            java.lang.String r0 = "ۤۗۥۘۘۖۡۚۛۚۖۛ۬ۘۨۦ"
            goto L_0x01a2
        L_0x01b2:
            java.lang.String r0 = "ۚۖۚ۬ۥۢۗۚۜۘۦۢۘۖۡ۫ۦۡۛۧۚۖۘ"
            goto L_0x01a2
        L_0x01b5:
            java.lang.String r0 = "ۜۗۤۡۡۦۘۜ۫ۦۧۧ۫ۙۘۗ"
            goto L_0x01a2
        L_0x01b8:
            java.lang.String r0 = "۟ۥۚۖ۬ۖۢ۟ۘۖۦۨۘۧۚۘۘۨۨ۫ۗۡۜ"
            goto L_0x000c
        L_0x01bc:
            r11 = -771891282(0xffffffffd1fddfae, float:-1.36297431E11)
            java.lang.String r0 = "ۛۜۜۤ۠ۨۛۡۘۘۙ۫۫ۖۢۛۗۧۦۘۥۢۘۙۘۜۛ۠ۗ"
        L_0x01c1:
            int r12 = r0.hashCode()
            r12 = r12 ^ r11
            switch(r12) {
                case -1342965873: goto L_0x01d1;
                case 136282683: goto L_0x01ca;
                case 911672897: goto L_0x0115;
                case 1654979914: goto L_0x01d8;
                default: goto L_0x01c9;
            }
        L_0x01c9:
            goto L_0x01c1
        L_0x01ca:
            java.lang.String r0 = "ۢ۫ۡ۫ۦ۠ۡۦۦۧۗۦ۠ۧۧ۟ۥۘۡۥۧۘ"
            goto L_0x000c
        L_0x01ce:
            java.lang.String r0 = "۫ۨۦۘۧ۠۬ۦۘ۫ۙۨ۠ۢۖۥۤۢ۬ۛ۠ۥ۫ۤۨۧ۬ۜ"
            goto L_0x01c1
        L_0x01d1:
            com.obwhatsapp.youbasha.ui.views.t r0 = com.obwhatsapp.youbasha.ui.views.t.f1512b
            if (r3 != r0) goto L_0x01ce
            java.lang.String r0 = "ۡۚۖ۬ۙۥۘۚۚۘۛۢ۬۫ۡ۫ۜۧۚ"
            goto L_0x01c1
        L_0x01d8:
            java.lang.String r0 = "ۘ۟ۖۜۡۤۙۡۖۘ۫۫ۨۘۜۡۤ"
            goto L_0x01c1
        L_0x01db:
            r0 = 0
            r14.f1422q = r0
            java.lang.String r0 = "ۜۥۦۘۢۤۛۧۜ۬ۧۧۛ۟ۘۚۡۢۦۦ۫ۡۛۦۙۗۢۡۘ"
            goto L_0x000c
        L_0x01e2:
            r0 = 0
            r14.f1423r = r0
            java.lang.String r0 = "ۤۜۘۨۧۡۘۡۧۥۘۧۦۧۢۦۥۘ۟ۗۨۘۦۜۨۘۧۖۢ"
            goto L_0x000c
        L_0x01e9:
            float r0 = r15.getX()
            int r2 = (int) r0
            java.lang.String r0 = "ۦۖ۟۠ۘۡ۬ۦۡۡۗۧۢۗ"
            goto L_0x000c
        L_0x01f2:
            float r0 = r15.getY()
            int r1 = (int) r0
            java.lang.String r0 = "۠۬۠ۧ۬ۨۘۛ۟ۡۘ۬۟۬ۧۚۜۡۨۘ۬ۥۨۦۨ"
            goto L_0x000c
        L_0x01fb:
            r14.f1422q = r2
            java.lang.String r0 = "ۗۢۥۘۛ۟ۘۘۚ۫ۘ۫ۥ۬ۙۥ۠ۡۡ۬ۧ۟۬ۚۦۡۘۤۨۥۘ"
            goto L_0x000c
        L_0x0201:
            r14.f1423r = r1
            java.lang.String r0 = "۬ۧۥۘۥۙ۫ۗۚۢۘۡۥۘ۫ۧ۬۬ۨۨۘ"
            goto L_0x000c
        L_0x0207:
            r0 = 0
            r14.A = r0
            java.lang.String r0 = "ۡۨۡۘۧۗۘۘۜۖۥۘۢ۟ۢۘۘۗ۬ۢۘۘ"
            goto L_0x000c
        L_0x020e:
            boolean r0 = r14.A
            goto L_0x0043
        L_0x0212:
            java.lang.String r0 = "ۜۢۛۜۖۙ۫ۛۤۡ۟ۨۘ۠ۛۜۘۨۛۧۚۛ"
            goto L_0x000c
        L_0x0216:
            java.lang.String r0 = "ۢ۬۫ۢ۠ۗۦۥۦۨۢۜۧ۫ۧ"
            goto L_0x000c
        L_0x021a:
            java.lang.String r0 = "ۢ۫ۡ۫ۦ۠ۡۦۦۧۗۦ۠ۧۧ۟ۥۘۡۥۧۘ"
            goto L_0x000c
        L_0x021e:
            java.lang.String r0 = "ۘۚۜۘۡۧۘۘۘۢۧ۟۫۠۟ۨ۠ۛۚۨۙ۟ۡۘۛۡۨۜۢۖۘ"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        YoSwipeableConvRow yoSwipeableConvRow = null;
        View view = null;
        View view2 = null;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        View view3 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        ImageView imageView = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ImageView imageView2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = "۬ۗۦۘ۬ۜ۬ۙۦ۬۬ۛ۟ۗۤۡ۟ۗۛ۠ۦ۫ۘ۬ۜ";
        while (true) {
            switch ((str7.hashCode() ^ 800) ^ 1203020754) {
                case -2061571594:
                    view2.layout(i6, 0, view2.getMeasuredWidth() + i7, view2.getMeasuredHeight());
                    str7 = "ۖۜۢۥۙ۫ۦۡۥۘ۠ۤۦۘ۟ۨۜۘۥۘ۠ۜۦۡۘۧۚۨۡۖ۬";
                    break;
                case -2022242896:
                    str7 = "ۖۙۖۘ۠ۙۦۦۤۨۘۥۦۤۘۧۚ۟ۜ۠ۖۨۖۘ";
                    z6 = z5;
                    break;
                case -1917997567:
                    view3.layout(0, 0, view3.getMeasuredWidth(), this.f1411f.getMeasuredHeight());
                    str7 = "ۚ۠ۖۘۜۧۜ۠ۙۢۤۖۡۦۚۖۖۛۤ";
                    break;
                case -1887432450:
                    bringChildToFront(this.f1411f);
                    str7 = "ۥۘۛۢۦۥۡۘۘ۬ۗۘۛۖۨۘۢۥ۬";
                    break;
                case -1734903008:
                    z4 = true;
                    str7 = "ۛۛۢۢۡۚۦۦۖ۠ۦۧۖۨۜ";
                    break;
                case -1532971724:
                    str2 = "ic_action_archive";
                    str7 = "ۖ۫۟ۧۚۜۘۥۧۤۧ۟ۜۘۥۜۛ";
                    break;
                case -1482669928:
                    String str8 = "ۛ۬ۤ۬ۤۡۘ۬ۢ۟۬ۛۘۘۧۧۥۘۖۢۚ";
                    while (true) {
                        switch (str8.hashCode() ^ 816929318) {
                            case -1871253008:
                                str8 = "ۖۗۡۘۧۧۙۘ۠۠ۨۛۥۘۤۛۚ";
                                break;
                            case -660420576:
                                str7 = "ۤۦۨۙۖۧۛۢ۬ۧۜۖۨۡۙ";
                                continue;
                            case 750939683:
                                if (!this.f1418m) {
                                    str8 = "ۨۧۨۘۨ۬ۛۤۜۚۧۛۛۚۖۘۧۤۖ";
                                    break;
                                } else {
                                    str8 = "ۦۛۜۘۢ۫ۦۘۥ۟ۥۢۨۥۜۤۦ۬۬ۦۘۛۙۤ";
                                    break;
                                }
                            case 1097076940:
                                str7 = "ۤۖۘۘۜۖ۠ۚ۠۬ۙۢ۬ۦۨۖۘۨۦ۬ۗۦۦۗ۟";
                                continue;
                        }
                    }
                    break;
                case -1458594109:
                    str7 = "۟ۜۚۛ۬ۧۜ۟ۦۥۨۡۘۦۜۦۛ۟ۢۛ۫ۜ۬ۙ۬";
                    z8 = z3;
                    break;
                case -1432445621:
                    this.f1418m = yo.conversationsFragment instanceof ArchivedConversationsFragment;
                    str7 = "ۜۥۡۘۜۚۛۘ۫ۨۨۖۦۨ۬ۜۘ";
                    break;
                case -1364542614:
                    str4 = "ic_action_unmute";
                    str7 = "ۖۛۦۙۙۙۥ۟ۥۘۨۖۧۘ۬ۡۨۙۢۥۗۡۚۖۖۨ";
                    break;
                case -1248244112:
                    str7 = "ۢۤۢۛ۫ۚۘ۫۠ۚ۟ۤۨ۬ۨۘۛۘ۫ۦ۬ۥۘۨۜۛ";
                    break;
                case -1213516939:
                    str7 = "ۦۡ۟ۢ۬۬۫ۗۛۜۚۨۘۢۥۢۚۙۚۥۘۡۛۛۡ";
                    str3 = str2;
                    break;
                case -1208130030:
                    str = "ic_action_unarchive";
                    str7 = "ۛۤۚۨۧۥۘۗۡۘۡۚۙۖ۬ۙۙ۫";
                    break;
                case -1160197374:
                    str7 = "ۘۖۦۘۤۜ۬ۨۥ۫۟۬۬ۨۗۦۘۥۡ۬ۥۜۤۛۜ۫";
                    break;
                case -1028370669:
                    String str9 = "ۗ۠ۧ۠ۤۜۘۘۖۥۘۜۜۚ۠ۙۦۘۛۧۘۖۨۘۨ۬";
                    while (true) {
                        switch (str9.hashCode() ^ -18705277) {
                            case -1021222377:
                                if (view == null) {
                                    str9 = "۠ۦۧۢ۫ۥ۠ۛۖۨۢۘۘۛۤۥ";
                                    break;
                                } else {
                                    str9 = "ۛۜۘۘۙۛۨۘ۫ۖ۟ۤ۬ۚۦۤۘۘۦۡۡۗۡۗۚۙۙ۟ۖۨ";
                                    break;
                                }
                            case 667865198:
                                str9 = "۠ۢۙۥۛۘۘۘۦۖۤۙۡۘۥۜ۬ۗۥۘۖۡۘۛۥۗ";
                                break;
                            case 1283574847:
                                str7 = "ۙۚۘۤۢۧۗ۟ۦۘۘ۬ۢۢ۠ۚ";
                                continue;
                            case 1786651009:
                                str7 = "۫۫۫ۚۚۢۦۧۤ۬ۥۚۤۦۧۘۤۗۜۘۧۡۜ۫ۨۦۘ۠ۛۗ";
                                continue;
                        }
                    }
                    break;
                case -1020903388:
                    str7 = "ۘۦ۟ۤۜۚۧۨۜۘۜۖۥۡ۫ۥۘ";
                    break;
                case -961955893:
                    this.f1417l = z6;
                    str7 = "ۤ۟ۛ۠۟ۡۘۘۥۖۘۤۥۘۘۘۖۧۦۙۧ";
                    break;
                case -837214247:
                    String str10 = "ۖۨۙۙۛ۠ۢۢۡ۟ۢۛۤۚۨۗۛ۟ۨۛۜۘۢۧۦۘۛۨۘ";
                    while (true) {
                        switch (str10.hashCode() ^ -700245229) {
                            case -2127267747:
                                if (view3 == null) {
                                    str10 = "ۙۤۖۢۖۤۢۙۜۤۖۚۡۘۜ";
                                    break;
                                } else {
                                    str10 = "ۘۢۘ۠ۤۖۚۛۥ۟ۧۚۦ۫۟ۡۛۤ۬۬ۢ";
                                    break;
                                }
                            case -802222066:
                                str7 = "ۖ۬ۡ۠ۥۢۗۥۘۘۨۦۛۥۖۛ۟۠ۙۗۥۗۘۥۛ";
                                continue;
                            case -155045005:
                                str10 = "ۢۤۦۘۡۤ۠۬۟ۘۘۚ۠۠ۡۧۘۘ۫۬ۘۥۡۡۘۘۢۖ";
                                break;
                            case 668103477:
                                str7 = "ۗۜۤۨۚۙ۬ۢۡۘ۬۫ۥۘ۫۟ۜۘ۫۬۫";
                                continue;
                        }
                    }
                    break;
                case -736268720:
                    String str11 = "ۨۜ۫ۙۨۢۨۡۢ۬ۗۤۘۙۘ";
                    while (true) {
                        switch (str11.hashCode() ^ -1536011228) {
                            case -1205541289:
                                str7 = "ۖۜۢۥۙ۫ۦۡۥۘ۠ۤۦۘ۟ۨۜۘۥۘ۠ۜۦۡۘۧۚۨۡۖ۬";
                                continue;
                            case -1100194129:
                                if (view2 == null) {
                                    str11 = "ۘۖۘ۟ۗۤۜۜۧۘۢۚۨۜۚۧۙ۫ۢۖ۟ۜۖۙۖۘۥۡۥۘ";
                                    break;
                                } else {
                                    str11 = "ۛۡۡۘۖۢۨۘۥۚۘۡۦۗ۟۫۫۫ۡۗ۠۬۟";
                                    break;
                                }
                            case -694209139:
                                str11 = "۬ۛۖۘ۫ۥۛۗۚۛۗۢۦۢ۠ۗۡۢۖۚۥ۬ۤۤ۬";
                                break;
                            case 489221886:
                                str7 = "ۦۨ۫ۨۤ۟ۚۙۡۘۧۗۥۚۚۡۘ";
                                continue;
                        }
                    }
                    break;
                case -728302808:
                    view.layout(-view.getMeasuredWidth(), 0, 0, view.getMeasuredHeight());
                    str7 = "۫۫۫ۚۚۢۦۧۤ۬ۥۚۤۦۧۘۤۗۜۘۧۡۜ۫ۨۦۘ۠ۛۗ";
                    break;
                case -660337254:
                    z7 = true;
                    str7 = "ۧۦۚۡ۟ۤۥۡۘۘ۠ۗ۟۬۫ۖۘ۟۟۟۫ۘۤ";
                    break;
                case -625541570:
                    z3 = false;
                    str7 = "ۘۛۘۤۚۦۘۡ۟۫ۨۜ۟ۘۚ۫ۦۜۥۘۙۛۚ";
                    break;
                case -531763300:
                    str7 = "ۖۙۖۘ۠ۙۦۦۤۨۘۥۦۤۘۧۚ۟ۜ۠ۖۨۖۘ";
                    break;
                case -425709555:
                    str7 = "ۘۦ۟ۤۜۚۧۨۜۘۜۖۥۡ۫ۥۘ";
                    str6 = str5;
                    break;
                case -236339710:
                    return;
                case -157022664:
                    yoSwipeableConvRow = this.f1408c.f1516b;
                    str7 = "۟۬ۨۘۡۢ۬ۘۦۡ۟ۜۢ۫ۜۥۡۡۦۛ۟ۡۘ";
                    break;
                case -41451652:
                    imageView.setImageResource(yo.getID(str3, "drawable"));
                    str7 = "ۘ۫ۘۘۘۢۥۘۜۧۙۚۦۙۢۚۘ۬ۥۖۨۦۥۗ۟ۘۘ";
                    break;
                case 22188311:
                    str7 = "ۥ۫ۘۘۧۧۨۘۦۖ۠ۧۙ۬ۤۦۘۘۡۜۡۙ۠ۡ";
                    str6 = str4;
                    break;
                case 154894669:
                    this.f1416k = z8;
                    str7 = "۫ۢۤ۫ۘ۠ۨ۫ۙۘۘۥۘۡۤۦۘۨۚۙۤۤۧ";
                    break;
                case 198251117:
                    str7 = "ۤۦۙ۬ۤۛ۠ۖۘ۬۫ۤ۫۫۟۬ۛۥۘۤۗ۬۠ۖۡۘ";
                    break;
                case 226706406:
                    str7 = "۟۟۟ۗ۠ۙۤۖۢ۟ۜ۫ۗۚۙ";
                    break;
                case 303990056:
                    imageView2.setImageResource(yo.getID(str6, "drawable"));
                    str7 = "ۦۤۖۧۙۦ۫۟ۛۙۤۙۡۘ۫ۢۥۨ";
                    break;
                case 376474664:
                    str7 = "ۧۨۧۘۡۙۡۘۤۥۜۘۙۢۡۤۖۥۘ";
                    z8 = z7;
                    break;
                case 611786276:
                    str5 = "ic_inline_mute";
                    str7 = "ۗۡۡۘۜۤۛۥۙۘۘۗۤۡۨۧ۬";
                    break;
                case 622578775:
                    z5 = false;
                    str7 = "ۗۚ۫ۤۗۤۢۖۦۘۙۗۡۤۡۗۤۘۜۢۘۘۙۛ";
                    break;
                case 954885190:
                    this.f1415j.setImageResource(yo.getID("new_messages_indicator", "drawable"));
                    str7 = "ۚۘۧۨ۠ۘۘۧۤۢۗۥۥۘ۬ۤۙۚۢۘۘۨۛۨۘ";
                    break;
                case 1070416230:
                    str7 = "ۦۡ۟ۢ۬۬۫ۗۛۜۚۨۘۢۥۢۚۙۚۥۘۡۛۛۡ";
                    break;
                case 1104511493:
                    i7 = yoSwipeableConvRow.getMeasuredWidth();
                    str7 = "۫ۡۗۨ۬ۖۢ۫ۜۜ۠ۖۡۗۖۨ۠ۜۘ";
                    break;
                case 1106780990:
                    view3 = this.f1411f;
                    str7 = "ۚ۟ۧ۫ۥۜۘۥۡۥۘۥۖ۬ۦ۠ۥۘ۬ۘۘ";
                    break;
                case 1378580597:
                    this.f1415j.post(new d(this, 16));
                    str7 = "ۖ۬ۡ۠ۥۢۗۥۘۘۨۦۛۥۖۛ۟۠ۙۗۥۗۘۥۛ";
                    break;
                case 1429075447:
                    String str12 = "ۡۗۚ۠ۖۜۘۨۨۘ۫ۥۨ۫ۚۜۘۜ۫۫۫ۗ۫ۙۡۘ";
                    while (true) {
                        switch (str12.hashCode() ^ 94463837) {
                            case -1930749023:
                                str7 = "ۧۨۧۘۡۙۡۘۤۥۜۘۙۢۡۤۖۥۘ";
                                continue;
                            case 219551345:
                                str7 = "ۘۥۧۘۤۡ۠ۘ۟۬ۜۘۧۛۗۢۨۥۦۦ۠ۦۦ";
                                continue;
                            case 1173777755:
                                str12 = "ۤۚۨۘۢۘ۟ۖۡۨۦۤۨۘۖۥۨۘ۟۫ۢۢۚۚۜۜۨ۠ۦۧ";
                                break;
                            case 1735163915:
                                if (this.f1411f.findViewById(yo.getID("mute_indicator", "id")).getVisibility() != 0) {
                                    str12 = "ۨ۫ۤۨۡۨ۬ۜۥۧۘۨۦۤۦۘۘۛ۟";
                                    break;
                                } else {
                                    str12 = "ۙ۫ۦۘۛۦۘۗۘۙۘۜۤۙۥۨۖ۠ۨۘۛۢۘۘۡۗۨ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1464514535:
                    view2 = e(yoSwipeableConvRow);
                    str7 = "۟ۢۛۙۚۡۧۦۧۘ۫ۦ۬ۡۥ۠۟ۦۖ";
                    break;
                case 1583364357:
                    str7 = "ۘۘۥۤۛۨۘۛ۠ۚ۠ۡۡۤۛۢۡۖۘۘ۬ۤۧۧۡ۟";
                    break;
                case 1612160657:
                    imageView2 = this.f1412g;
                    str7 = "ۦۙۛ۟ۜۡۦۧۦۖۚۙ۟ۘۘۥۘ۠ۙ۬ۖ";
                    break;
                case 1625202958:
                    i6 = yoSwipeableConvRow.getMeasuredWidth();
                    str7 = "ۛۦۙۥۡۖۥۢ۠ۡ۬ۨۦۨۘۦۘۥۥۚۤۥۧۛۗۡ";
                    break;
                case 1630237172:
                    str7 = "ۙۤۜۡۙۦۘ۟۠ۖ۫ۜۥۘ۫ۘ۬ۚ۠ۡۡۦۥۘۚۦۨۘ";
                    z6 = z4;
                    break;
                case 1766299935:
                    view = d(yoSwipeableConvRow);
                    str7 = "ۙۥۜۘ۟ۗۧۗ۫ۚۡۘ۫ۚۙۜۘۧۙۥۘ";
                    break;
                case 1942944818:
                    str7 = "ۥۦۗۛۨۙۥۚۤۛۧۜۘۢۥۨۘ";
                    str3 = str;
                    break;
                case 2027400891:
                    String str13 = "ۤۤۙۥۙۖۧ۟ۖۘ۠۫ۙۖۤ۠";
                    while (true) {
                        switch (str13.hashCode() ^ 1936520719) {
                            case -640675419:
                                str7 = "ۥۖۨۖۤۦۘۨۦۚۛۦۧۘۜۚۜۘۧ۫ۡۚ۟۟";
                                continue;
                            case -531342984:
                                str7 = "ۜۧۥۨۨ۬ۗۨۡۗۛۡۘۖ۫ۡ۠۬ۡۘ";
                                continue;
                            case 88565089:
                                str13 = "۫ۚ۬ۜۙۛۡۥۧۥ۠ۡۘۙ۬ۜۥ۬ۦ";
                                break;
                            case 812593032:
                                if (!this.f1416k) {
                                    str13 = "ۗ۠ۥۘۛ۟ۙۧۡۖ۬۠ۙۢ۠ۗ";
                                    break;
                                } else {
                                    str13 = "ۜۤۨۧۢ۟ۙ۫ۦۘۛ۫ۚۢۢۦ۬ۥۗۗۨۖ۫ۜۦۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 2041502197:
                    str7 = "ۡۧۥۘ۟ۦۛۦۥۥ۟ۡۡۢۜ۟ۥۦۘۡۘۗۥۜۘۨۖ۟";
                    break;
                case 2047323154:
                    String str14 = "ۙۥ۟۟۬ۜۘ۟۠ۛۦۗۨۧۜۢۛۚۤ";
                    while (true) {
                        switch (str14.hashCode() ^ -542432107) {
                            case -1119948252:
                                if (this.f1411f.findViewById(yo.getID("conversations_row_message_count", "id")).getVisibility() != 0) {
                                    str14 = "ۡۚۨۘۘۥۥ۬ۦۨۥۘۡ۫۫۠۟ۖۨ";
                                    break;
                                } else {
                                    str14 = "ۙۛ۬ۤۖۧۢ۫ۖۘۘۙۦۘ۟ۤۡۨۛ";
                                    break;
                                }
                            case -1093592173:
                                str14 = "ۨۚ۫۬ۖ۟۠ۡۡۡۗۜۘۢۢۢۧۙ۠ۡۗ۟ۙۤ";
                                break;
                            case 480854485:
                                str7 = "ۧۚۜۛۖۥۘۜۘۧۘۤۘۦۘۦۦۜۡۡۗ";
                                continue;
                            case 1050761351:
                                str7 = "۠ۙۨ۠۠ۡۤ۠۠ۥۘ۫ۗۦ۬۟ۛۙۗۦۧۘۢۤۚ";
                                continue;
                        }
                    }
                    break;
                case 2120476970:
                    imageView = this.f1414i;
                    str7 = "ۘۤۥۘ۬۟ۥۦۙۢۡۖۦۘۛ۫ۙۢ۫ۡ۫ۚ۫";
                    break;
            }
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 824 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02fe, code lost:
        r2 = "ۢ۬ۢۤۜۥۘ۫ۚۘۘ۬ۥۦ۟ۛ۟۫ۦۨ۬ۛۘۡۚۙ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        r2 = "۬ۤ۟ۥ۟ۦۙۨ۫ۤۧۦۘۖۧۘۚ۟ۤۖۥۘ۫ۛۘۘۡۦ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x085c, code lost:
        r2 = "ۛۖۦۘ۬ۨۧۘۖۧۡۜۘ۠ۚۦۖۚۚۖۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0870, code lost:
        r2 = "ۜۧۡۦۤۛۜ۟ۗۙ۫ۦ۫ۤ۫ۛ۬ۖ۫ۤۛۜۜۚۡ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013d, code lost:
        r2 = "ۖۙ۠ۨۘۡۘۦۥ۫ۚ۫۠ۦ۠ۜۘ۫ۜۜ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r55) {
        /*
            r54 = this;
            r50 = 0
            r5 = 0
            r49 = 0
            r48 = 0
            r47 = 0
            r46 = 0
            r45 = 0
            r44 = 0
            r43 = 0
            r42 = 0
            r41 = 0
            r40 = 0
            r39 = 0
            r38 = 0
            r36 = 0
            r35 = 0
            r37 = 0
            r34 = 0
            r33 = 0
            r31 = 0
            r30 = 0
            r29 = 0
            r32 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r19 = 0
            r16 = 0
            r17 = 0
            r15 = 0
            r18 = 0
            r20 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r9 = 0
            r10 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            java.lang.String r2 = "ۦۜۧ۫ۦۜۙۚ۟ۚۧۤۨ۠ۜۘۗ۟ۥۘۥۦۙۨۘ۠ۙ۫"
        L_0x0055:
            int r51 = r2.hashCode()
            r52 = 217(0xd9, float:3.04E-43)
            r53 = -1447136751(0xffffffffa9be7211, float:-8.4574824E-14)
            r51 = r51 ^ r52
            r51 = r51 ^ r53
            switch(r51) {
                case -2128652735: goto L_0x0507;
                case -2081454391: goto L_0x0408;
                case -1987503278: goto L_0x06b3;
                case -1986263859: goto L_0x07ae;
                case -1985694188: goto L_0x0767;
                case -1981578204: goto L_0x0687;
                case -1976358554: goto L_0x07b8;
                case -1956663114: goto L_0x04bb;
                case -1904903997: goto L_0x0782;
                case -1897682159: goto L_0x061a;
                case -1830940652: goto L_0x035f;
                case -1783228632: goto L_0x0779;
                case -1767730127: goto L_0x07f8;
                case -1767721779: goto L_0x0708;
                case -1740486708: goto L_0x0589;
                case -1733823770: goto L_0x04d9;
                case -1643957225: goto L_0x0556;
                case -1591977212: goto L_0x01f5;
                case -1580551972: goto L_0x0094;
                case -1570022593: goto L_0x084f;
                case -1543234009: goto L_0x0499;
                case -1511632419: goto L_0x0770;
                case -1464582526: goto L_0x059d;
                case -1446963482: goto L_0x01bf;
                case -1377736574: goto L_0x0352;
                case -1370070544: goto L_0x07c8;
                case -1320620286: goto L_0x02aa;
                case -1281789496: goto L_0x068d;
                case -1277974429: goto L_0x0104;
                case -1224554565: goto L_0x0341;
                case -1199201867: goto L_0x0284;
                case -1191764810: goto L_0x0402;
                case -1146192710: goto L_0x00df;
                case -1142905344: goto L_0x05a3;
                case -1117087886: goto L_0x0369;
                case -1008544325: goto L_0x039a;
                case -999425127: goto L_0x0874;
                case -990672926: goto L_0x02d2;
                case -962301832: goto L_0x01eb;
                case -934600573: goto L_0x067f;
                case -931938642: goto L_0x0874;
                case -929132415: goto L_0x065b;
                case -912982616: goto L_0x08a0;
                case -895149512: goto L_0x02ef;
                case -852410128: goto L_0x0702;
                case -827112378: goto L_0x027e;
                case -822710088: goto L_0x038b;
                case -743053077: goto L_0x07c0;
                case -669820258: goto L_0x0884;
                case -655141472: goto L_0x0274;
                case -640631887: goto L_0x05e3;
                case -585841495: goto L_0x015c;
                case -574008517: goto L_0x060f;
                case -547593190: goto L_0x05ff;
                case -529200682: goto L_0x06fd;
                case -462131545: goto L_0x04ed;
                case -444076037: goto L_0x05ed;
                case -443768652: goto L_0x04b3;
                case -430221969: goto L_0x070d;
                case -423651475: goto L_0x00be;
                case -416187694: goto L_0x07fd;
                case -335366094: goto L_0x05f3;
                case -302878031: goto L_0x040e;
                case -253414143: goto L_0x0751;
                case -118197694: goto L_0x0864;
                case -111525534: goto L_0x084a;
                case -111113906: goto L_0x05d3;
                case -109624689: goto L_0x0894;
                case -8430679: goto L_0x0880;
                case 41477176: goto L_0x0250;
                case 49859954: goto L_0x062d;
                case 50817188: goto L_0x01e1;
                case 106437712: goto L_0x0077;
                case 109388568: goto L_0x039a;
                case 130410259: goto L_0x044f;
                case 151139618: goto L_0x04a9;
                case 167166717: goto L_0x04a3;
                case 200587057: goto L_0x012e;
                case 203447140: goto L_0x0455;
                case 203520206: goto L_0x009e;
                case 338435898: goto L_0x07d6;
                case 346867361: goto L_0x0894;
                case 347383717: goto L_0x057f;
                case 370308307: goto L_0x022e;
                case 400215306: goto L_0x0597;
                case 432838712: goto L_0x04e3;
                case 435870485: goto L_0x0069;
                case 456575530: goto L_0x0224;
                case 462524629: goto L_0x05c7;
                case 499172767: goto L_0x0653;
                case 521831726: goto L_0x01b5;
                case 562451594: goto L_0x0860;
                case 587865585: goto L_0x0217;
                case 590688463: goto L_0x0890;
                case 677920620: goto L_0x010f;
                case 816956965: goto L_0x0487;
                case 837925645: goto L_0x080c;
                case 851890067: goto L_0x0073;
                case 882689174: goto L_0x018f;
                case 898764667: goto L_0x011a;
                case 930559023: goto L_0x039a;
                case 973711238: goto L_0x03dd;
                case 1005343206: goto L_0x034a;
                case 1014905531: goto L_0x0099;
                case 1049511921: goto L_0x0513;
                case 1096309133: goto L_0x03bf;
                case 1122582844: goto L_0x02c8;
                case 1145269814: goto L_0x02e9;
                case 1189516447: goto L_0x06d7;
                case 1206912408: goto L_0x07af;
                case 1242807236: goto L_0x0845;
                case 1268176688: goto L_0x0758;
                case 1283712224: goto L_0x0574;
                case 1316685229: goto L_0x05a9;
                case 1382974323: goto L_0x0124;
                case 1396804026: goto L_0x0823;
                case 1405517693: goto L_0x02db;
                case 1407759749: goto L_0x0197;
                case 1414488539: goto L_0x078b;
                case 1417862031: goto L_0x03b3;
                case 1440617818: goto L_0x0535;
                case 1463253411: goto L_0x04ff;
                case 1512136509: goto L_0x07ad;
                case 1547853192: goto L_0x0337;
                case 1598484788: goto L_0x0440;
                case 1643381339: goto L_0x0713;
                case 1675132735: goto L_0x0874;
                case 1696847041: goto L_0x0319;
                case 1736571820: goto L_0x04f7;
                case 1900582103: goto L_0x05f9;
                case 1905270019: goto L_0x0358;
                case 1949616992: goto L_0x0719;
                case 1993544042: goto L_0x0066;
                case 2006961450: goto L_0x06f7;
                case 2011977301: goto L_0x006c;
                case 2015868432: goto L_0x07d1;
                case 2030162934: goto L_0x0635;
                case 2043583207: goto L_0x0493;
                case 2062405797: goto L_0x02e3;
                case 2109864910: goto L_0x0186;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x0055
        L_0x0066:
            java.lang.String r2 = "ۛۨۧۘ۟۟ۗۖۛۦ۠۟ۙ۫ۦۘۢۗۖۛ۠ۦۘۖ۟۫ۘۧۡ"
            goto L_0x0055
        L_0x0069:
            java.lang.String r2 = "ۥۛۥۘ۫ۜۜۘۗۢۛۤۤۤۨۙۡۙۥۨۖۨۥ"
            goto L_0x0055
        L_0x006c:
            int r50 = r55.getAction()
            java.lang.String r2 = "ۧۛۢۦۖۥۘۙۜۘۘۗۖۥۤۥۖۘۖ۬ۛۧ۬۟ۢۗۚ"
            goto L_0x0055
        L_0x0073:
            r5 = 1
            java.lang.String r2 = "ۧۜۙۢۚۖۘۘۡۗۙۡۧۘۚۢۖۘۘۦۙ"
            goto L_0x0055
        L_0x0077:
            r51 = -338539958(0xffffffffebd24a4a, float:-5.084505E26)
            java.lang.String r2 = "ۤۗۧ۠ۡ۬ۨۙۜۜۤۤ۬ۙ۠ۘۢۘۘ"
        L_0x007c:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1589340148: goto L_0x0091;
                case -1105702529: goto L_0x0086;
                case 666390644: goto L_0x0898;
                case 1816837124: goto L_0x008e;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x007c
        L_0x0086:
            if (r50 == 0) goto L_0x008b
            java.lang.String r2 = "ۜۤۘۤۤۡۘۚ۬۠ۥۤۜۤ۫۫"
            goto L_0x007c
        L_0x008b:
            java.lang.String r2 = "۬ۥۜ۫ۢۡۘ۫ۘۢ۬ۧۚۤۗۖۗ۫ۨۘۤ۟ۡۘ"
            goto L_0x007c
        L_0x008e:
            java.lang.String r2 = "ۧ۫۫ۙۥۡۜۗ۫ۡۤۨۘۦ۬ۨۨ۫ۦۘۦ۠۫۫ۜۦ"
            goto L_0x007c
        L_0x0091:
            java.lang.String r2 = "ۨۨۜۘۖ۬ۧۙۢۦۚۜۛۗۜۜۡ۟۬۫ۜۜۢۚۚ۠ۤۗ"
            goto L_0x0055
        L_0x0094:
            com.obwhatsapp.youbasha.ui.views.t r49 = com.obwhatsapp.youbasha.ui.views.t.f1513c
            java.lang.String r2 = "۫۟ۦۘۢ۟ۛ۠ۧۡۘۖۚۚۧۙۦۘۗۛۛۤۛ۟ۜۙۥ"
            goto L_0x0055
        L_0x0099:
            com.obwhatsapp.youbasha.ui.views.w r48 = com.obwhatsapp.youbasha.ui.views.w.f1524c
            java.lang.String r2 = "ۗۜۘۜ۫ۡۘ۠ۛۨۘۜۤ۫ۛۜۦ"
            goto L_0x0055
        L_0x009e:
            r51 = -864464895(0xffffffffcc795001, float:-6.535578E7)
            java.lang.String r2 = "۟ۨۗ۠ۖۨۘۘۤۨۘۥۥۢۙۤۙۖ۬ۡۘ۟ۤۦۘ"
        L_0x00a3:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1552887487: goto L_0x00b3;
                case -554337348: goto L_0x00bb;
                case -294456189: goto L_0x00ad;
                case 849659617: goto L_0x00ee;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00a3
        L_0x00ad:
            java.lang.String r2 = "ۗ۫ۨ۟ۡ۠ۚۙۥۘۘۢ۠ۥۦۘۢۢۢ"
            goto L_0x0055
        L_0x00b0:
            java.lang.String r2 = "ۦۘۗۜۤۗۥۢ۫ۤۥ۬۠ۛۦۘ۫ۗ"
            goto L_0x00a3
        L_0x00b3:
            r2 = 1
            r0 = r50
            if (r0 == r2) goto L_0x00b0
            java.lang.String r2 = "ۗۨ۟ۖۚۜ۟۠ۧ۬ۧ۬ۦ۬ۖۘ"
            goto L_0x00a3
        L_0x00bb:
            java.lang.String r2 = "۬ۘۥۘۦ۫ۖۘۚۥۨۘ۠ۧۥۘۗۧ۬ۚۛ"
            goto L_0x00a3
        L_0x00be:
            r51 = 651642944(0x26d74840, float:1.4938205E-15)
            java.lang.String r2 = "۟ۖۘۘۘۚۗۨۜۜۙۜۥۢۦ۟۠ۡۨۘ۬ۘۧۚۜۜۗۥۜۘ"
        L_0x00c3:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -2018739043: goto L_0x00cd;
                case -1209932172: goto L_0x0854;
                case -503167165: goto L_0x00db;
                case 855794014: goto L_0x00d8;
                default: goto L_0x00cc;
            }
        L_0x00cc:
            goto L_0x00c3
        L_0x00cd:
            r2 = 2
            r0 = r50
            if (r0 == r2) goto L_0x00d5
            java.lang.String r2 = "ۢۦۢۘۜۦۘۢۢۡۘۨۡۖۦۧۤۚۦۖۘۘ۫ۘۚۡۤۚۦۡ"
            goto L_0x00c3
        L_0x00d5:
            java.lang.String r2 = "ۧۤۛۤۚۖۛ۬ۢ۫ۘۘۛۧۜ"
            goto L_0x00c3
        L_0x00d8:
            java.lang.String r2 = "۫ۙ۬ۗۛۘۘۤ۠ۢۚۨۡۘۤۦۥۘ۫۠ۡ۠ۗۨ"
            goto L_0x00c3
        L_0x00db:
            java.lang.String r2 = "ۖۨۨۘۛۢۡۘۤۨۥ۟ۤۦۘۧ۟۠ۛۥ۬"
            goto L_0x0055
        L_0x00df:
            r51 = -1549190071(0xffffffffa3a93c49, float:-1.8348548E-17)
            java.lang.String r2 = "ۥۤ۫ۥۙ۫ۛ۠ۥۘۧۜۦۤۛۧ"
        L_0x00e4:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -2006163184: goto L_0x00ee;
                case -592394901: goto L_0x00f5;
                case -224909588: goto L_0x00fd;
                case 829658239: goto L_0x0100;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x00e4
        L_0x00ee:
            java.lang.String r2 = "۬ۤ۟ۥ۟ۦۙۨ۫ۤۧۦۘۖۧۘۚ۟ۤۖۥۘ۫ۛۘۘۡۦ"
            goto L_0x0055
        L_0x00f2:
            java.lang.String r2 = "ۥ۬ۧۜۦۡۤۛۦۘۙۜۘۡۡۘۘۘ۠ۖ"
            goto L_0x00e4
        L_0x00f5:
            r2 = 3
            r0 = r50
            if (r0 == r2) goto L_0x00f2
            java.lang.String r2 = "ۚۛۧ۬ۥۡۚۨۡۘۢ۫ۙۨۦۘۚ۬ۨۘ۠ۤۜ"
            goto L_0x00e4
        L_0x00fd:
            java.lang.String r2 = "ۧۚۙۢۜۗ۠۬ۚۡۜۗ۟ۧۖۙۜۘ۠ۧ۬۫ۨ"
            goto L_0x00e4
        L_0x0100:
            java.lang.String r2 = "ۙۡۧۨ۠ۨۘۛۗۦۘۚۥۥۘۚ۬ۦۘۧۧۥۘۚۡۘ"
            goto L_0x0055
        L_0x0104:
            float r2 = r55.getX()
            int r0 = (int) r2
            r47 = r0
            java.lang.String r2 = "۬ۤۖۘۜۨۧۘۦۚۖۘ۟ۚۖۘۡ۟۫۟۠ۥۦۘ۬ۢۥۨۢۚ"
            goto L_0x0055
        L_0x010f:
            float r2 = r55.getY()
            int r0 = (int) r2
            r46 = r0
            java.lang.String r2 = "ۖۛۛۛۜۚۢۨۚ۠۠ۙۢ۠ۦۘۥۤۜۘ"
            goto L_0x0055
        L_0x011a:
            r0 = r54
            int r2 = r0.f1422q
            int r45 = r47 - r2
            java.lang.String r2 = "ۘۗۦ۫ۥۗۗۨۥ۠ۗۡۘۥۧۨۘۜۖۖۡ۫ۚۖۡۘ"
            goto L_0x0055
        L_0x0124:
            r0 = r54
            int r0 = r0.f1423r
            r44 = r0
            java.lang.String r2 = "ۤۦۤۙۙۨۡۗۘۘ۟۬ۚ۟ۦۨۗۦ۬ۧۡۖۘۧۨۙۘۢ"
            goto L_0x0055
        L_0x012e:
            r51 = 243841684(0xe88ba94, float:3.3706257E-30)
            java.lang.String r2 = "ۥۚ۬ۗۙۥۘۧ۬ۛ۠ۖۘۘۖۡ۟۠۬ۚۡۘ"
        L_0x0133:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -354889339: goto L_0x0144;
                case 338397388: goto L_0x013d;
                case 1337555257: goto L_0x0158;
                case 1363559914: goto L_0x0155;
                default: goto L_0x013c;
            }
        L_0x013c:
            goto L_0x0133
        L_0x013d:
            java.lang.String r2 = "ۖۙ۠ۨۘۡۘۦۥ۫ۚ۫۠ۦ۠ۜۘ۫ۜۜ"
            goto L_0x0055
        L_0x0141:
            java.lang.String r2 = "ۤ۫ۗۢۘۚۦۙۨۦۚ۟ۜۘۨۚۙۡۘ۟ۙۨۘۨۥ۟ۥۥۘ"
            goto L_0x0133
        L_0x0144:
            int r2 = java.lang.Math.abs(r45)
            r0 = r54
            int r0 = r0.f1406a
            r52 = r0
            r0 = r52
            if (r2 <= r0) goto L_0x0141
            java.lang.String r2 = "ۤۖ۠ۡۖ۬ۤۖۢۦۧۚ۟ۛۗۢۡۦ"
            goto L_0x0133
        L_0x0155:
            java.lang.String r2 = "ۨۨۛ۟۟ۦۘ۫۠ۨۘۤۡۡۘۨۥۘۙۛۤۚۖۤۡ۫ۨۘۧ۟ۚ"
            goto L_0x0133
        L_0x0158:
            java.lang.String r2 = "ۜۗۘۘۢۗۡۘۡۖۨۖ۫ۡۢۘۡۘۙۡۖ"
            goto L_0x0055
        L_0x015c:
            r51 = -2057848424(0xffffffff8557b998, float:-1.01433396E-35)
            java.lang.String r2 = "ۡۜۘ۬ۙ۫ۜۡۚۖۙۧۢۗۥۘ"
        L_0x0161:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -796071646: goto L_0x0182;
                case -242753996: goto L_0x013d;
                case -105401728: goto L_0x0171;
                case 1115873709: goto L_0x016b;
                default: goto L_0x016a;
            }
        L_0x016a:
            goto L_0x0161
        L_0x016b:
            java.lang.String r2 = "ۗۘۥۘ۟ۘۛۙ۟۫۫ۢۜۘۤۜۥۘۘۨ۟"
            goto L_0x0161
        L_0x016e:
            java.lang.String r2 = "ۥۙ۠ۗۡ۬ۖۧۘۜۚۜۘۧۖۦ"
            goto L_0x0161
        L_0x0171:
            int r2 = java.lang.Math.abs(r45)
            int r52 = r46 - r44
            int r52 = java.lang.Math.abs(r52)
            r0 = r52
            if (r2 <= r0) goto L_0x016e
            java.lang.String r2 = "ۚۗۨ۬ۗۡۡ۫ۚ۫ۤۦۘۚۜۧ"
            goto L_0x0161
        L_0x0182:
            java.lang.String r2 = "ۢۜ۠ۤ۫ۜۨۤ۠ۢ۬ۘۘ۟ۖ۬ۤۨۥۘ۠۬ۡۢۢۡۘۧۧۥ"
            goto L_0x0055
        L_0x0186:
            r2 = 1
            r0 = r54
            r0.A = r2
            java.lang.String r2 = "۠ۡ۟۠۠ۤۘۙ۫ۧۡۗۤ۟ۗۜۢۘۢ۠۫"
            goto L_0x0055
        L_0x018f:
            android.view.ViewParent r43 = r54.getParent()
            java.lang.String r2 = "ۚۥۧۘۛۜۦۘ۫ۤۘۘ۠ۥۘۤۙ۠۫۠ۗۙۛۨ۫۠۬ۜۖ"
            goto L_0x0055
        L_0x0197:
            r51 = 1689586702(0x64b50c0e, float:2.6717834E22)
            java.lang.String r2 = "ۖ۟ۥۦۛۦۘۘۧۥۘ۟ۖۧۗ۟ۡۘ"
        L_0x019c:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -187436588: goto L_0x013d;
                case 575019983: goto L_0x01b1;
                case 575961013: goto L_0x01a6;
                case 937101700: goto L_0x01ac;
                default: goto L_0x01a5;
            }
        L_0x01a5:
            goto L_0x019c
        L_0x01a6:
            java.lang.String r2 = "ۧۜۨۘۘۥۦۘۙۜۡۘۗۙۛۨ۫ۦۖۤ۟ۥۖۘۤ۬ۧ"
            goto L_0x019c
        L_0x01a9:
            java.lang.String r2 = "ۥ۫ۡۗۡ۟۠۫ۦۘۚ۬ۘۘۖۥۨۚۢۜۘۤۗۡ"
            goto L_0x019c
        L_0x01ac:
            if (r43 == 0) goto L_0x01a9
            java.lang.String r2 = "۫۟۟۠ۨ۬ۤۤۨ۬ۚۦۘۡۧۛۚۨ۟ۨۡ۟"
            goto L_0x019c
        L_0x01b1:
            java.lang.String r2 = "۬ۖۦۘ۠ۡۤ۬۫ۛۡۡۦ۟ۗۜۘۙ۫ۨۘۘۗ"
            goto L_0x0055
        L_0x01b5:
            r2 = 1
            r0 = r43
            r0.requestDisallowInterceptTouchEvent(r2)
            java.lang.String r2 = "ۖۙ۠ۨۘۡۘۦۥ۫ۚ۫۠ۦ۠ۜۘ۫ۜۜ"
            goto L_0x0055
        L_0x01bf:
            r51 = 1332601678(0x4f6de34e, float:3.99109683E9)
            java.lang.String r2 = "ۚۦۙ۠۬ۜۘۦۥۜۘۙۗ۬۠ۖۢۚ۟ۛ۫ۡۥۘۜۤۧ"
        L_0x01c4:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -2127284914: goto L_0x01ce;
                case -1757376395: goto L_0x01dd;
                case -864991744: goto L_0x01d4;
                case 449537351: goto L_0x039a;
                default: goto L_0x01cd;
            }
        L_0x01cd:
            goto L_0x01c4
        L_0x01ce:
            java.lang.String r2 = "۟ۢۖۘۧۦۙۦۘۛ۟ۜۖۘۘۛۢ۟ۨۚۙۖۧ۫ۘۚۤۗ"
            goto L_0x01c4
        L_0x01d1:
            java.lang.String r2 = "ۖۦ۫۬ۡۜۢ۬ۢۜ۫ۜۘۢۘۚ۟ۙۖۘ"
            goto L_0x01c4
        L_0x01d4:
            r0 = r54
            boolean r2 = r0.A
            if (r2 == 0) goto L_0x01d1
            java.lang.String r2 = "ۤۡۢۡ۠ۡۘۗ۫۟ۗۙۦ۫ۗ"
            goto L_0x01c4
        L_0x01dd:
            java.lang.String r2 = "ۙ۫ۤۜۡۛۙ۬ۧۧۢ۠ۢۦۥ"
            goto L_0x0055
        L_0x01e1:
            r0 = r54
            int r2 = r0.f1424s
            int r42 = r47 - r2
            java.lang.String r2 = "ۙۗۤۜۜۦۘۢۚۡ۠ۢۥۘۗ۫۬ۖ۫ۦ۟ۦۧۘ۬ۦۧۘۜۡۗ"
            goto L_0x0055
        L_0x01eb:
            r0 = r47
            r1 = r54
            r1.f1424s = r0
            java.lang.String r2 = "۠ۗۧ۬۟ۦۘۧ۠ۥۘ۟ۡۦۙۥۥۘۥۢۖۘۤۧۗۛۜ۠"
            goto L_0x0055
        L_0x01f5:
            r51 = 561153433(0x21728599, float:8.2169604E-19)
            java.lang.String r2 = "۠ۨ۫ۥۖ۠۫۠ۨۘۢۗ۟ۨ۟ۨۘۗۛ۬ۤۧ۟ۚۙ۫"
        L_0x01fa:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -2130670943: goto L_0x020b;
                case -763935542: goto L_0x0214;
                case 484324613: goto L_0x0858;
                case 2014222949: goto L_0x0204;
                default: goto L_0x0203;
            }
        L_0x0203:
            goto L_0x01fa
        L_0x0204:
            java.lang.String r2 = "۟ۨۙۡ۟ۥۘۡۚۧۡۦۧۘۚۨ۠ۡۛۨۘ"
            goto L_0x0055
        L_0x0208:
            java.lang.String r2 = "ۡۘۨۥۡۜۗۧۧ۬ۖۡ۠ۘۥۨۤۗ۫ۙۧ"
            goto L_0x01fa
        L_0x020b:
            r0 = r54
            boolean r2 = r0.B
            if (r2 == 0) goto L_0x0208
            java.lang.String r2 = "ۛۙۘۗۗۤۜ۠ۤۛ۬ۚۨ۟ۖۘۘۛۦۘۨ۠ۨ۫ۧۡۛۘ"
            goto L_0x01fa
        L_0x0214:
            java.lang.String r2 = "ۜۛۛۧۖۢۘۚۜۘۘۥۖۘۛۧۥۘۡۧۘۘ۫ۡۨۥۡۡۘ"
            goto L_0x01fa
        L_0x0217:
            float r2 = r55.getX()
            int r2 = (int) r2
            r0 = r54
            r0.f1422q = r2
            java.lang.String r2 = "ۚ۫ۛۡۡ۠ۜۨۥۘۛۜۧۘۚۤۜ۠ۜۘۚۗۖۧ۠ۥۘ۠۬ۘۘ"
            goto L_0x0055
        L_0x0224:
            r0 = r54
            int r2 = r0.f1422q
            int r41 = r47 - r2
            java.lang.String r2 = "ۨۛۗۜۦ۠ۡ۫ۗۘۖۚۡ۟ۦۜۚۥۡۗۛۢۢ۬ۥۥۢ"
            goto L_0x0055
        L_0x022e:
            r51 = -697741427(0xffffffffd6694f8d, float:-6.4131969E13)
            java.lang.String r2 = "ۜۚۥۘۨ۬ۘۥ۠ۖ۬ۧۤۥۨۚۢۜ"
        L_0x0233:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1775508163: goto L_0x024c;
                case -666188305: goto L_0x0249;
                case 1445137101: goto L_0x0864;
                case 1499985677: goto L_0x023d;
                default: goto L_0x023c;
            }
        L_0x023c:
            goto L_0x0233
        L_0x023d:
            r0 = r54
            boolean r2 = r0.f1420o
            if (r2 != 0) goto L_0x0246
            java.lang.String r2 = "ۜۜۗۢۜۧۘۥ۫ۖۛۚ۫ۤۥۡ"
            goto L_0x0233
        L_0x0246:
            java.lang.String r2 = "ۤۚۥۘۧۤ۬ۜۧ۬ۨ۟۟ۚۖۖ۟ۧ۠۫ۚۚ"
            goto L_0x0233
        L_0x0249:
            java.lang.String r2 = "ۤۧۛۖۦۦۘۤۧۙۧۡۜۢۜۥۤۙۚۢۚۥۤۧ"
            goto L_0x0233
        L_0x024c:
            java.lang.String r2 = "۠ۘۚۙۙ۠ۦۡ۠ۜ۠ۦۘۘۚ۠ۢۨۛۜۛۙ۠ۚۧۜۦۡ"
            goto L_0x0055
        L_0x0250:
            r51 = 1325135301(0x4efbf5c5, float:2.11359398E9)
            java.lang.String r2 = "۟ۢۘۘۜ۠ۜۙۧۘۘۧۦۜۖۤۡۘ۬ۛۘۧۢۘۗ۠ۨۘۡ۫ۧ"
        L_0x0255:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1626809625: goto L_0x025f;
                case 150152889: goto L_0x0270;
                case 478472340: goto L_0x0864;
                case 1478773268: goto L_0x0265;
                default: goto L_0x025e;
            }
        L_0x025e:
            goto L_0x0255
        L_0x025f:
            java.lang.String r2 = "ۚ۬ۡۥۤۙۥ۟ۗۘۢ۫ۘۥ"
            goto L_0x0255
        L_0x0262:
            java.lang.String r2 = "ۚۜۥۨۡۥۘۢۚۘۘ۠۫۟ۨۖۚۥۚۦۘۦۚ۫"
            goto L_0x0255
        L_0x0265:
            r0 = r54
            com.obwhatsapp.youbasha.ui.views.w r2 = r0.f1409d
            r0 = r48
            if (r2 != r0) goto L_0x0262
            java.lang.String r2 = "ۜۦۖۛ۟ۥۘ۬۬ۖۘ۠ۨۨۚۙۗۧۦۖۘۥۘۧۘ"
            goto L_0x0255
        L_0x0270:
            java.lang.String r2 = "۫۬ۙ۟۟ۖۖۖ۬ۡ۟ۦۘۦۦ۠ۦ۠ۡۨۡۚۛۜۥ"
            goto L_0x0055
        L_0x0274:
            r0 = r54
            java.util.LinkedHashMap r0 = r0.f1410e
            r40 = r0
            java.lang.String r2 = "ۡ۫ۧۡۤۥۘۢۡۖۘۨۗ۬ۚۗۚۥ۟ۜ"
            goto L_0x0055
        L_0x027e:
            com.obwhatsapp.youbasha.ui.views.t r39 = com.obwhatsapp.youbasha.ui.views.t.f1511a
            java.lang.String r2 = "ۨۗۜۘ۫ۧۥۛۙۡۧۘ۫ۙۨۡ۫۫"
            goto L_0x0055
        L_0x0284:
            r51 = 1827245621(0x6ce98e35, float:2.2588102E27)
            java.lang.String r2 = "ۘۤۥ۟ۨ۠ۢۤۛ۠ۗۨ۠ۦۦۨۢ۬ۛۥۗۚۜۜۦۙ"
        L_0x0289:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1048662023: goto L_0x02a6;
                case -173374787: goto L_0x0299;
                case 895069240: goto L_0x085c;
                case 1830018114: goto L_0x0293;
                default: goto L_0x0292;
            }
        L_0x0292:
            goto L_0x0289
        L_0x0293:
            java.lang.String r2 = "ۢۥۨۘۥ۠ۦۧۡۥۙۚۦۙ۟ۡۗۦۚۧۧ۬ۤۦ"
            goto L_0x0289
        L_0x0296:
            java.lang.String r2 = "ۜۖۖ۟۬ۖۘۗ۫۟۟ۤۡۘۦۥۨۦۖۡۘۗۙۡۘ"
            goto L_0x0289
        L_0x0299:
            r0 = r40
            r1 = r39
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L_0x0296
            java.lang.String r2 = "ۧۗۖۘۗۜۥۘۚ۟ۡۘۛ۠ۘۘ۬ۤۗ۬ۘۜۘۡۨۨۘۥ۫ۨۘۢۨۦ"
            goto L_0x0289
        L_0x02a6:
            java.lang.String r2 = "ۡۚۦ۫ۛۨ۬ۤۡۘۗۖۖۨۡۚۡۢۛ۠ۡۡ"
            goto L_0x0055
        L_0x02aa:
            r51 = 1816155017(0x6c405389, float:9.30033E26)
            java.lang.String r2 = "ۘۥۢۙۨۧ۫۫ۡۘۦ۫۠ۢۖۤۤۢ۟۟۫"
        L_0x02af:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -952492270: goto L_0x02b9;
                case -490268738: goto L_0x085c;
                case -475395689: goto L_0x02bf;
                case -281667131: goto L_0x02c4;
                default: goto L_0x02b8;
            }
        L_0x02b8:
            goto L_0x02af
        L_0x02b9:
            java.lang.String r2 = "ۗۘۨۘ۬ۗۨ۟ۨۦۘۗۙ۬ۦۦۜ۬ۧ۫ۛ۠ۛۘۧۦۥۡ۠"
            goto L_0x02af
        L_0x02bc:
            java.lang.String r2 = "ۚۦ۫ۢۨۦۘۘۧۜۡۦۨۢ۟ۖۨ۟ۦۘۗۙ"
            goto L_0x02af
        L_0x02bf:
            if (r41 <= 0) goto L_0x02bc
            java.lang.String r2 = "ۜۦۦ۫ۧ۟ۦ۠ۡۘۙۢۚۤ۬ۜ"
            goto L_0x02af
        L_0x02c4:
            java.lang.String r2 = "۫ۡۘۚ۠ۨۘ۬۫ۜۢۙۦۚۤ"
            goto L_0x0055
        L_0x02c8:
            r0 = r39
            r1 = r54
            r1.f1407b = r0
            java.lang.String r2 = "ۛۚۧۤۧۦۘ۟ۘۨ۫۫ۖۨۧۖۗۥۥۘۖۘ۠"
            goto L_0x0055
        L_0x02d2:
            r2 = 1
            r0 = r54
            r0.f1420o = r2
            java.lang.String r2 = "ۥۘ۫ۘۘۜۘ۫ۖۡۤ۠ۦۘۙۙۦۦۜۛ۠ۨ۬"
            goto L_0x0055
        L_0x02db:
            android.view.View r38 = r54.getLeftView()
            java.lang.String r2 = "ۙۛۢ۫ۡۡۘۡۦۢۙۧۦ۬ۤۗ۠ۖ"
            goto L_0x0055
        L_0x02e3:
            java.lang.String r2 = "۬ۧۛۨۤ۟ۡ۬ۖۘۙ۠ۨۘۛۧۧۗۦۘۚۢۚۚۡۦ"
            r37 = r38
            goto L_0x0055
        L_0x02e9:
            com.obwhatsapp.youbasha.ui.views.t r36 = com.obwhatsapp.youbasha.ui.views.t.f1512b
            java.lang.String r2 = "ۢۘۡۢۚۙۖۨۘۘۜۘۖۘ۟۟ۡ۫ۨۜۧ۠ۥۘۙۡۦۘۨۙ۫"
            goto L_0x0055
        L_0x02ef:
            r51 = -831086945(0xffffffffce769e9f, float:-1.03439763E9)
            java.lang.String r2 = "ۚۚۗ۬ۢۡۖ۬ۡۚۦ۟ۨ۬ۡۤۖۘۛۦ۟ۤۜۨ"
        L_0x02f4:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -575047660: goto L_0x0315;
                case 147427262: goto L_0x0305;
                case 1044755643: goto L_0x0312;
                case 1956806099: goto L_0x02fe;
                default: goto L_0x02fd;
            }
        L_0x02fd:
            goto L_0x02f4
        L_0x02fe:
            java.lang.String r2 = "ۢ۬ۢۤۜۥۘ۫ۚۘۘ۬ۥۦ۟ۛ۟۫ۦۨ۬ۛۘۡۚۙ"
            goto L_0x0055
        L_0x0302:
            java.lang.String r2 = "ۤۦۜۘۧۙ۠۫ۜۙ۫ۘۡۘۘۡۘ۠ۚۥۘۘۤ"
            goto L_0x02f4
        L_0x0305:
            r0 = r40
            r1 = r36
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L_0x0302
            java.lang.String r2 = "ۜۤۖۘۛۥۘۘ۟ۦۚۤ۫ۨۘۡۤۦۜۗ۬ۙ۠ۜۘ۫ۗۗ"
            goto L_0x02f4
        L_0x0312:
            java.lang.String r2 = "ۖۥ۠ۛۘۡۤۙ۬ۨۖۛ۠۫ۡۘۧۤۦۤۦۢۘۢۘۘۧۨۘ"
            goto L_0x02f4
        L_0x0315:
            java.lang.String r2 = "۠ۡ۫ۘۗۥۨ۠۬ۤۚۖۗۖۢ۫۠ۨۖۢ۟ۙۚۥ"
            goto L_0x0055
        L_0x0319:
            r51 = -137285327(0xfffffffff7d13131, float:-8.485842E33)
            java.lang.String r2 = "ۙۛۖۗ۫ۜۘ۬ۖۙۖۘۨۜۥۘ"
        L_0x031e:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -2045365324: goto L_0x02fe;
                case -1576786981: goto L_0x0328;
                case -305483803: goto L_0x032e;
                case 1908798612: goto L_0x0333;
                default: goto L_0x0327;
            }
        L_0x0327:
            goto L_0x031e
        L_0x0328:
            java.lang.String r2 = "ۘۜۘۘۗۥۦۥۖۘۘۨ۟ۥۘۥۛ"
            goto L_0x031e
        L_0x032b:
            java.lang.String r2 = "ۛۢۤۗۜ۠ۛۙۢۖۨۜ۟ۘۢ"
            goto L_0x031e
        L_0x032e:
            if (r41 >= 0) goto L_0x032b
            java.lang.String r2 = "۟ۘۜۖ۫ۢ۟ۦۧۘۛۡۗۥۤۘۘۘ"
            goto L_0x031e
        L_0x0333:
            java.lang.String r2 = "ۚ۠ۘۢۤۥۥ۬ۘۦۦۦۘۢۨۥۘۢۖۡۤۤۡ۠۟ۦۘ۟۫ۜ"
            goto L_0x0055
        L_0x0337:
            r0 = r36
            r1 = r54
            r1.f1407b = r0
            java.lang.String r2 = "ۜ۬ۘۗ۠ۦۘ۟۟ۘۘۤۜۜۘۥۗۤۢۡۖۘۜۡۜۧۦۥ۠ۘۨۘ"
            goto L_0x0055
        L_0x0341:
            r2 = 1
            r0 = r54
            r0.f1420o = r2
            java.lang.String r2 = "ۖۘۡۨ۟ۡۜۧ۟ۤ۫ۡ۬ۖۧۘۙ۠ۦۘۡ۬ۤ۬ۥۛ"
            goto L_0x0055
        L_0x034a:
            android.view.View r35 = r54.getRightView()
            java.lang.String r2 = "۠ۡۖۘۥۚ۬ۜۜۘۘۡۘۧۘۖۥۧۥ۫۬"
            goto L_0x0055
        L_0x0352:
            java.lang.String r2 = "ۘۗۛۙۗۖۘۙۖۜۢ۬۫ۘ۫ۙۥۦۥۜۖۛ۬ۦۙۢۢۥ"
            r37 = r35
            goto L_0x0055
        L_0x0358:
            r37.bringToFront()
            java.lang.String r2 = "ۤۥۨۘ۟ۖۦۨۦ۟ۧ۠ۚۗۗ۠ۦۜۨۘۗۖۡۦۚۧۥۘۖ"
            goto L_0x0055
        L_0x035f:
            r0 = r49
            r1 = r54
            r1.f1407b = r0
            java.lang.String r2 = "ۚۤۖۛۙۨۚ۟ۥ۟۠۠ۗۢۦۘ"
            goto L_0x0055
        L_0x0369:
            r51 = 263345343(0xfb254bf, float:1.7584798E-29)
            java.lang.String r2 = "ۢۗۙ۟ۚ۫۠ۦۘۢۜۖۘ۟۟۫ۘۙۖۘۥۙ۟"
        L_0x036e:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -41097379: goto L_0x0868;
                case 1071680059: goto L_0x0384;
                case 1611529184: goto L_0x0378;
                case 2013389884: goto L_0x0387;
                default: goto L_0x0377;
            }
        L_0x0377:
            goto L_0x036e
        L_0x0378:
            r0 = r54
            boolean r2 = r0.f1420o
            if (r2 != 0) goto L_0x0381
            java.lang.String r2 = "ۢ۫ۘۘ۟ۛۛۘۤۖۖۛۥۙۥۥ۟ۦۘ"
            goto L_0x036e
        L_0x0381:
            java.lang.String r2 = "۬ۡۙ۠۟۟۬ۡ۟ۤۤۛۦۜ۬ۛۨۘ"
            goto L_0x036e
        L_0x0384:
            java.lang.String r2 = "۟۫ۦ۠۬ۥۙۧۘۘ۟ۛ۟ۛۨ"
            goto L_0x036e
        L_0x0387:
            java.lang.String r2 = "ۡۜۛۤۙۘۦۜۦۘۨ۠ۜ۟ۥۧۘ"
            goto L_0x0055
        L_0x038b:
            r51 = 1809802602(0x6bdf656a, float:5.4013874E26)
            java.lang.String r2 = "ۧۡ۠ۥۧۨۨۘۧۘۛ۠ۗۙۖۥۚۥۢۗۙۥۘۘۛۜۥ۠ۥۘ"
        L_0x0390:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -2012620808: goto L_0x03a1;
                case -920017960: goto L_0x03af;
                case -197800176: goto L_0x03ac;
                case 1327665038: goto L_0x039a;
                default: goto L_0x0399;
            }
        L_0x0399:
            goto L_0x0390
        L_0x039a:
            java.lang.String r2 = "ۦۖۧۜۨۡۤۜۛۙ۫ۦۘۧۤۢ۟ۦۖۛۚۨۡ۫ۛ۬ۙۨۘ"
            goto L_0x0055
        L_0x039e:
            java.lang.String r2 = "ۦ۟ۢۗ۫ۡۧۥۨۘۛۗۜۘۗۤۛۛ۫ۛ۠۟ۚۡۦۧۘۖۙۡۘ"
            goto L_0x0390
        L_0x03a1:
            r0 = r54
            com.obwhatsapp.youbasha.ui.views.t r2 = r0.f1407b
            r0 = r49
            if (r2 == r0) goto L_0x039e
            java.lang.String r2 = "ۧۨۖۘۜۨۖۖۘۨۘۙۦ۟۬ۡۘۛۜۥ"
            goto L_0x0390
        L_0x03ac:
            java.lang.String r2 = "۟ۧۜۘۗۨۥۘۡ۬۟ۡۖۧ۫ۙۜۘ۫ۘۜ۠ۨۘۢ۠ۡ"
            goto L_0x0390
        L_0x03af:
            java.lang.String r2 = "ۡ۬ۜۘۢۛۗۨ۟ۚ۠ۙۥۧ۟ۜۤ۫۠ۘۚۨۘ"
            goto L_0x0055
        L_0x03b3:
            r0 = r54
            com.obwhatsapp.youbasha.ui.views.t r2 = r0.f1407b
            int r34 = r2.ordinal()
            java.lang.String r2 = "ۡۙۦۘۤۖ۠ۨۡۡۘۦۢۘۘۥۧۗ"
            goto L_0x0055
        L_0x03bf:
            r51 = 2030149914(0x7901a11a, float:4.2067114E34)
            java.lang.String r2 = "ۥۤۜ۫ۛۥۘۥ۬ۚ۫ۚۘۚۧۤۦۦۤۜۙ"
        L_0x03c4:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -115464996: goto L_0x086c;
                case 1514834252: goto L_0x03d9;
                case 1676020186: goto L_0x03d4;
                case 1733663132: goto L_0x03ce;
                default: goto L_0x03cd;
            }
        L_0x03cd:
            goto L_0x03c4
        L_0x03ce:
            java.lang.String r2 = "ۚ۬ۜۛ۬۠ۘۧۖۜۧۥۨ۠ۡ۟ۧۖۤۙۡۥۙۙ"
            goto L_0x03c4
        L_0x03d1:
            java.lang.String r2 = "ۘۜۚۤۡۜۘۜ۟ۤ۟ۘۦۨۗۗۧ۠۬"
            goto L_0x03c4
        L_0x03d4:
            if (r34 == 0) goto L_0x03d1
            java.lang.String r2 = "ۥۜۨۘۥۨۨۘۗۖۧۘۜۨۧۘۖۨ۟"
            goto L_0x03c4
        L_0x03d9:
            java.lang.String r2 = "ۜۢۜۚ۟ۜ۫ۖۡۘۖۛ۟ۗۗۥ"
            goto L_0x0055
        L_0x03dd:
            r51 = 1850584252(0x6e4dacbc, float:1.5913313E28)
            java.lang.String r2 = "۬ۘۙۘ۠ۖ۟ۛ۟ۡۙۤۗ۬ۖ"
        L_0x03e2:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -708351125: goto L_0x03f3;
                case 203976853: goto L_0x03fb;
                case 343983077: goto L_0x03ec;
                case 1311867523: goto L_0x03fe;
                default: goto L_0x03eb;
            }
        L_0x03eb:
            goto L_0x03e2
        L_0x03ec:
            java.lang.String r2 = "ۗۥۜۡۡۧۘۚ۬ۧۥۙ۬ۗۗۦۘۙۦۗۚۖ۫"
            goto L_0x0055
        L_0x03f0:
            java.lang.String r2 = "ۦۨۤ۬ۧ۬ۜۡۢۖ۟ۧ۟۠ۦۘۤۚ۟۬ۡۡۚۖۖۜۨۙ"
            goto L_0x03e2
        L_0x03f3:
            r2 = 1
            r0 = r34
            if (r0 == r2) goto L_0x03f0
            java.lang.String r2 = "ۙۡۥۘۜۨۙ۟ۨۨ۟ۥۨۧۚ۠ۡ۠ۦۤۗ۫"
            goto L_0x03e2
        L_0x03fb:
            java.lang.String r2 = "ۥۢۚۨ۬ۗۢۡۨۢۦۘۙۗۡۘ۫ۜۦ۠۠"
            goto L_0x03e2
        L_0x03fe:
            java.lang.String r2 = "۬ۗۖۘ۬ۤۦۚۡۧۘۙۛ۬ۛۖۚۡ۠ۥۨۥۤۗ۠ۖ"
            goto L_0x0055
        L_0x0402:
            r33 = 0
            java.lang.String r2 = "ۢۦۨۘۨۢۘۘۖۦۚۦۧۖۛۤ۟۠۬ۦۧ۫"
            goto L_0x0055
        L_0x0408:
            java.lang.String r2 = "ۖۡ۟ۗۖ۬ۚ۟ۖۙۢۤۡۡ۫ۢۜۧۡۨۛۨۨ۠"
            r32 = r33
            goto L_0x0055
        L_0x040e:
            r51 = 1334307685(0x4f87eb65, float:4.560702E9)
            java.lang.String r2 = "ۨ۠۠۫ۢۘۘۙ۠ۜۛۘ۬ۦۨۛۦۥۘۤۤۡۘۛ۬ۧۢۙۨ"
        L_0x0413:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1643036511: goto L_0x043d;
                case 422521386: goto L_0x041d;
                case 536066606: goto L_0x0424;
                case 1434632970: goto L_0x0870;
                default: goto L_0x041c;
            }
        L_0x041c:
            goto L_0x0413
        L_0x041d:
            java.lang.String r2 = "ۤۤۧۗۘۢ۬ۨۘۚۚۦۡۗۦ۠ۦۧۤۜۦۥۘۨ"
            goto L_0x0055
        L_0x0421:
            java.lang.String r2 = "ۨ۬ۚۤۛۦۘۙۖۘۘۦۚ۠۠ۥۤ"
            goto L_0x0413
        L_0x0424:
            r0 = r54
            int r2 = r0.mCurrentOffset
            int r2 = r2 + r42
            int r2 = java.lang.Math.abs(r2)
            android.view.View r52 = r54.getRightView()
            int r52 = r52.getMeasuredWidth()
            r0 = r52
            if (r2 <= r0) goto L_0x0421
            java.lang.String r2 = "۠ۢۘۧ۠۬ۖ۠۠ۘۘۙ۟۠ۥ"
            goto L_0x0413
        L_0x043d:
            java.lang.String r2 = "ۧ۠ۨۛ۠ۨۘۡۨۥۘۚۘ۠۫۬ۙ۬ۡۘ"
            goto L_0x0413
        L_0x0440:
            android.view.View r2 = r54.getRightView()
            int r2 = r2.getMeasuredWidth()
            int r0 = -r2
            r31 = r0
            java.lang.String r2 = "ۗ۟ۛ۟ۖۧۘۧۘ۟۠۬۟ۦۢۚ۠ۛۖۘۖۧۦۘ۟ۜۥۘۙۘۨ"
            goto L_0x0055
        L_0x044f:
            java.lang.String r2 = "۟ۛۖۧۛۛ۠ۘ۫۠ۛۡۖۜۘۖۚۦۤۥۗ"
            r32 = r31
            goto L_0x0055
        L_0x0455:
            r51 = -188627499(0xfffffffff4c1c5d5, float:-1.2281809E32)
            java.lang.String r2 = "ۨ۟۬ۨۜۛۤۘۤۨۦۘۥ۫ۗ۫ۡۡۧۡۖۡۘۜۘ"
        L_0x045a:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -853540901: goto L_0x0483;
                case -769074555: goto L_0x0480;
                case 227646022: goto L_0x0870;
                case 242232620: goto L_0x0464;
                default: goto L_0x0463;
            }
        L_0x0463:
            goto L_0x045a
        L_0x0464:
            r0 = r54
            int r2 = r0.mCurrentOffset
            int r2 = r2 + r42
            int r2 = java.lang.Math.abs(r2)
            android.view.View r52 = r54.getLeftView()
            int r52 = r52.getMeasuredWidth()
            r0 = r52
            if (r2 <= r0) goto L_0x047d
            java.lang.String r2 = "ۥۗ۟ۚ۠ۨ۬۟ۦۘۙۖۡۨۨۖۘۡۤ۟"
            goto L_0x045a
        L_0x047d:
            java.lang.String r2 = "ۚۤۢ۬ۘۘۙۨۥۤۖۧۗۢۦۦۢۡۘ۠۬ۚ"
            goto L_0x045a
        L_0x0480:
            java.lang.String r2 = "۠ۗۛۙ۬ۜۡۥۚۦۘ۠۬ۦۘۖۗۗۛ۟ۙۖۤ"
            goto L_0x045a
        L_0x0483:
            java.lang.String r2 = "ۢ۬ۗۙۦۧۘۤ۬ۛۧۚۙۥۨۘ۬ۢۚ"
            goto L_0x0055
        L_0x0487:
            android.view.View r2 = r54.getLeftView()
            int r30 = r2.getMeasuredWidth()
            java.lang.String r2 = "ۤۡۚۗۖۢ۠۠۫۫ۨۥۘ۬۟ۚۚۡۨ"
            goto L_0x0055
        L_0x0493:
            java.lang.String r2 = "ۜۖ۠۬۟ۢ۬ۛۢۛۗۦۢۤۛ۫ۘۨ۬ۨۘۘ۟۫ۡ"
            r32 = r30
            goto L_0x0055
        L_0x0499:
            r0 = r54
            int r2 = r0.mCurrentOffset
            int r29 = r2 + r42
            java.lang.String r2 = "ۘۜۢ۫ۖ۫۬ۖۗۥۡۥۘۧۡۘۧۨۤۨ۫ۥۘ"
            goto L_0x0055
        L_0x04a3:
            java.lang.String r2 = "ۘ۟ۢ۠۠ۘۖ۫ۨۘ۠ۗۙۙۧۙۨۚۨۘۧۨۘ"
            r32 = r29
            goto L_0x0055
        L_0x04a9:
            r0 = r32
            r1 = r54
            r1.mCurrentOffset = r0
            java.lang.String r2 = "۬ۚۗ۟ۥۘۤ۠۟ۡۜۤۦۤۚۗۨۗ۟۫ۡۘ"
            goto L_0x0055
        L_0x04b3:
            android.view.ViewParent r28 = r54.getParent()
            java.lang.String r2 = "ۢۘۦۘۨۛۚۨ۠ۚ۬ۛۥۘ۟ۗۛ"
            goto L_0x0055
        L_0x04bb:
            r51 = 843408450(0x32456442, float:1.1489705E-8)
            java.lang.String r2 = "ۚ۫ۨۙ۬ۧۗ۬۬۟ۤۨۘۚۘۜۘ۬ۦۘ۬ۗۘ"
        L_0x04c0:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -439675204: goto L_0x04d2;
                case 222818931: goto L_0x04d5;
                case 1066757422: goto L_0x0878;
                case 1856010554: goto L_0x04ca;
                default: goto L_0x04c9;
            }
        L_0x04c9:
            goto L_0x04c0
        L_0x04ca:
            if (r28 == 0) goto L_0x04cf
            java.lang.String r2 = "ۥۜۚ۟ۧۜۘ۟ۥۖۘۢ۠ۚۨۙ"
            goto L_0x04c0
        L_0x04cf:
            java.lang.String r2 = "ۜۢۘۘۢ۬۟ۖۦۘۗۨۦۥۤۥۜ۬ۢ۟۟ۨۘۤۧۖۘۡۤ۬"
            goto L_0x04c0
        L_0x04d2:
            java.lang.String r2 = "ۤۧۥۢۧ۫ۖ۠ۦۤۧ۟ۢۖۚ۠ۜۙۡۛۜۘ"
            goto L_0x04c0
        L_0x04d5:
            java.lang.String r2 = "ۖۜ۠۟۬۠ۖ۬ۘۨۨ۠ۛ۠ۛۥۨۤۜۡۘۙۦ۬ۤۤ"
            goto L_0x0055
        L_0x04d9:
            r2 = 1
            r0 = r28
            r0.requestDisallowInterceptTouchEvent(r2)
            java.lang.String r2 = "ۙ۫ۢ۟ۨۜۧ۠ۨۧ۫ۧ۟ۘ"
            goto L_0x0055
        L_0x04e3:
            r0 = r54
            com.obwhatsapp.youbasha.ui.views.u r0 = r0.f1408c
            r27 = r0
            java.lang.String r2 = "ۘۜۨۧۢۜۘ۫ۗۧۘۙۦۘ۬ۖۛۘ۬ۡ"
            goto L_0x0055
        L_0x04ed:
            r0 = r27
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r0 = r0.f1516b
            r26 = r0
            java.lang.String r2 = "ۡۜ۠ۡ۟ۦ۠ۨۗۜۜۘۨ۠ۤۜ۠ۖۘ۟ۜۦ۟ۤ۬"
            goto L_0x0055
        L_0x04f7:
            android.view.View r25 = r26.getLeftView()
            java.lang.String r2 = "ۗۜۜۥۙۛۥ۫۫۬ۡۨۖۡۡۘ۫ۡۡ"
            goto L_0x0055
        L_0x04ff:
            android.view.View r24 = r26.getRightView()
            java.lang.String r2 = "ۢۤۥۙۘۘۨۚۦۘ۬ۡۡ۬۠۬۟ۛ۬ۗ۬ۛۖۘۚۘۥ"
            goto L_0x0055
        L_0x0507:
            com.obwhatsapp.youbasha.ui.views.t r2 = r26.getCurrentDragEdge()
            int r23 = r2.ordinal()
            java.lang.String r2 = "ۘۙۖۘ۠ۦۗۘ۬ۡۖۘۚۢۧۥۘۚ۫ۡۤ۫ۥۘ"
            goto L_0x0055
        L_0x0513:
            r51 = -1893922892(0xffffffff8f1d07b4, float:-7.742181E-30)
            java.lang.String r2 = "ۚۜۘۘۤ۫۫ۡ۬ۦۜۤۨۘۖۖۗ"
        L_0x0518:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1548381557: goto L_0x052e;
                case 1306975826: goto L_0x0529;
                case 1487030586: goto L_0x0531;
                case 2010079045: goto L_0x0522;
                default: goto L_0x0521;
            }
        L_0x0521:
            goto L_0x0518
        L_0x0522:
            java.lang.String r2 = "ۥ۠ۖ۫ۦۘۘۗۥۤۨۛۤۥۛ۬"
            goto L_0x0055
        L_0x0526:
            java.lang.String r2 = "۟ۜۗۢۗۦۘۚۢۡۜۡۖۘۗۨۡ"
            goto L_0x0518
        L_0x0529:
            if (r23 == 0) goto L_0x0526
            java.lang.String r2 = "۠ۚۥۘۨۡ۠ۘۨۧۘۖ۫۬ۢ۠۫ۥ۠۫"
            goto L_0x0518
        L_0x052e:
            java.lang.String r2 = "ۛۙ۠ۘۘۚ۟ۧۖۘۢۦۢۦۤۨ"
            goto L_0x0518
        L_0x0531:
            java.lang.String r2 = "۠ۖۘۙۜۨۘۦۚ۫۠ۤۢۙ۫ۛۖۙۗ۬۬ۙ"
            goto L_0x0055
        L_0x0535:
            r51 = -1737596787(0xffffffff986e608d, float:-3.0809525E-24)
            java.lang.String r2 = "ۤ۠ۦۘ۫ۖ۬ۤۗۡۘۥ۟ۨۘۡۚۢۘۧۙ"
        L_0x053a:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1701888768: goto L_0x087c;
                case -828849854: goto L_0x0544;
                case 340319813: goto L_0x054a;
                case 551412886: goto L_0x0552;
                default: goto L_0x0543;
            }
        L_0x0543:
            goto L_0x053a
        L_0x0544:
            java.lang.String r2 = "ۜۗ۠ۧۥۛۨۗۚۡۘۜۘۚ۟ۧۛۦۖۢۛۥۘ"
            goto L_0x053a
        L_0x0547:
            java.lang.String r2 = "ۘۥۖۖۥۘۙ۟ۘۘۛۖۛ۫۫ۥۘ"
            goto L_0x053a
        L_0x054a:
            r2 = 1
            r0 = r23
            if (r0 == r2) goto L_0x0547
            java.lang.String r2 = "ۜۡۧ۫ۨۦۡۢۖۘۤۧۖۘ۠ۧۙۤ۫ۨۘ۟ۡۥۘ۟ۨۗۡ۫ۘ"
            goto L_0x053a
        L_0x0552:
            java.lang.String r2 = "۠ۛۦۘ۬ۡۘۘۘۤۢۗۥۦ۬ۘۧۘ۠ۡۘ"
            goto L_0x0055
        L_0x0556:
            r51 = -1970745520(0xffffffff8a88cf50, float:-1.3174306E-32)
            java.lang.String r2 = "ۤۧۥۘۤۛ۠ۡۧۦۘ۬ۙۖۥۧۘ"
        L_0x055b:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -592193354: goto L_0x056d;
                case -402915116: goto L_0x0570;
                case 393593544: goto L_0x0565;
                case 1504654975: goto L_0x0884;
                default: goto L_0x0564;
            }
        L_0x0564:
            goto L_0x055b
        L_0x0565:
            if (r24 == 0) goto L_0x056a
            java.lang.String r2 = "ۢۚۨ۠ۜ۟۬ۤۡۘۥۢۚۜۗۚۧۢۥ"
            goto L_0x055b
        L_0x056a:
            java.lang.String r2 = "ۖ۫ۧۨۨۧۘۗۡۚۤ۫ۙۗۜۙ"
            goto L_0x055b
        L_0x056d:
            java.lang.String r2 = "ۛۨۘۘۤۤۘۘۢ۟ۗ۠ۨۧۗ۬ۧۥۘۨۘۖۛ۬ۢ۠ۛۖۘ۟"
            goto L_0x055b
        L_0x0570:
            java.lang.String r2 = "ۡۨۖۘۘ۠۫۟۬ۦۧ۠ۙ۟۬۬ۙۜ۬ۛۤۙۚۦۙ"
            goto L_0x0055
        L_0x0574:
            int r2 = r24.getMeasuredWidth()
            int r0 = -r2
            r22 = r0
            java.lang.String r2 = "۠ۖۥ۬ۦۥۨۢۖۘۘۙۧۤۚ۟ۤ۬ۢ۠ۙۥ"
            goto L_0x0055
        L_0x057f:
            r0 = r22
            r1 = r27
            r1.f1515a = r0
            java.lang.String r2 = "۟ۚۥۘۜۨ۟ۥ۫ۧۥ۠ۘۧۙۖۧۥ۠ۖ۠ۨۤۥ۠ۘۙۥ"
            goto L_0x0055
        L_0x0589:
            r0 = r26
            int r2 = r0.mCurrentOffset
            r0 = r22
            int r21 = java.lang.Math.max(r2, r0)
            java.lang.String r2 = "ۡۖۨۥ۫ۢۥۥۦۥۧۘۚۘۦۘۘ۬۟ۜۤ۬"
            goto L_0x0055
        L_0x0597:
            r19 = 0
            java.lang.String r2 = "ۥۦۗۨۤ۫۬۟۬۫ۡۗۗۘۧۧۨ۠ۤ"
            goto L_0x0055
        L_0x059d:
            java.lang.String r2 = "ۡۨۘۦۡۤۙۘۖۘۦۛۙۥۨۨ۫ۖۡۜ۠ۨ"
            r20 = r21
            goto L_0x0055
        L_0x05a3:
            java.lang.String r2 = "ۚۡ۟ۖۜۗۚۘۘۖۙۥۤۙۖۤ۫ۧ۟ۖ۟۟ۘۚۡۗۦۘ"
            r18 = r19
            goto L_0x0055
        L_0x05a9:
            r51 = -764049606(0xffffffffd275873a, float:-2.63633928E11)
            java.lang.String r2 = "۠ۥۛ۬ۤۜۘۗۥۘۘۙ۠ۡۘۛۖۘۘ"
        L_0x05ae:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -402771509: goto L_0x05bf;
                case 250380518: goto L_0x05b8;
                case 1124592055: goto L_0x05c4;
                case 1604738106: goto L_0x0884;
                default: goto L_0x05b7;
            }
        L_0x05b7:
            goto L_0x05ae
        L_0x05b8:
            java.lang.String r2 = "ۘ۬۫ۙۘۡ۫ۛۨۙ۟۠ۖۦۨۨۦۜۘۨۜ۫ۥۙۡۘ"
            goto L_0x0055
        L_0x05bc:
            java.lang.String r2 = "ۗۡۗۖ۠ۥۘۜ۫ۨۘۡۗۢ۠ۡۘ۟۠ۜۗۛ۫"
            goto L_0x05ae
        L_0x05bf:
            if (r25 == 0) goto L_0x05bc
            java.lang.String r2 = "ۖ۠۟ۚۡۖۤۗۤۡۜۙ۟ۖۗۢۡۥ"
            goto L_0x05ae
        L_0x05c4:
            java.lang.String r2 = "ۜ۫ۤۥۦۦۘۙۡۘۤۡۜۛۥۘۡۧۙ"
            goto L_0x05ae
        L_0x05c7:
            int r2 = r25.getMeasuredWidth()
            r0 = r27
            r0.f1515a = r2
            java.lang.String r2 = "۠ۨۢۥۨۦۘۧ۠ۨۘ۠ۘ۟ۜۜۡۘ"
            goto L_0x0055
        L_0x05d3:
            r0 = r26
            int r2 = r0.mCurrentOffset
            r16 = 0
            r0 = r16
            int r16 = java.lang.Math.max(r2, r0)
            java.lang.String r2 = "۟ۛۧۢۘۘۘ۟ۗۘۘۢۚۜۘۚۗۜۛۤۡۖۦۛۛۢۥ"
            goto L_0x0055
        L_0x05e3:
            r0 = r27
            int r0 = r0.f1515a
            r17 = r0
            java.lang.String r2 = "ۛ۟۟ۛۤۡۙۦۖۘۤۜۙۧۡ۠ۗۖۘۢ۟ۘ"
            goto L_0x0055
        L_0x05ed:
            java.lang.String r2 = "ۛۧۨ۟ۦۗۖۗ۬ۥ۫ۜۘۙ۠ۚۥۖۡۥۙۥۘۚۗ"
            r15 = r16
            goto L_0x0055
        L_0x05f3:
            java.lang.String r2 = "ۖۨۡۛۥۨۘۧۚ۫۬۟ۤۡۨۨ"
            r18 = r17
            goto L_0x0055
        L_0x05f9:
            java.lang.String r2 = "۟ۙۘۛۚۨۘۜۜۨۘۡۚۛ۬ۖۨۤۛۥ۟ۛۡۘۤۛۥۘ"
            r20 = r15
            goto L_0x0055
        L_0x05ff:
            r0 = r20
            r1 = r18
            int r2 = java.lang.Math.min(r0, r1)
            r0 = r26
            r0.mCurrentOffset = r2
            java.lang.String r2 = "۬ۡۙۛۤۧۗۦۥۦۨۦۘ۟ۖ۟ۚۘۛۚۚ۠ۡۙ"
            goto L_0x0055
        L_0x060f:
            com.obwhatsapp.youbasha.ui.views.w r2 = com.obwhatsapp.youbasha.ui.views.w.f1522a
            r0 = r54
            r0.setStatus(r2)
            java.lang.String r2 = "ۛۖۤۙۛ۫ۦ۟ۦۢۦۨۘ۟ۙۘۘۡ۠ۖۤۢ۫ۘ۠ۘۘ"
            goto L_0x0055
        L_0x061a:
            r0 = r54
            com.obwhatsapp.youbasha.ui.views.u r2 = r0.f1408c
            r0 = r54
            int r0 = r0.mCurrentOffset
            r51 = r0
            r0 = r51
            r2.a(r0)
            java.lang.String r2 = "ۖ۬ۦۜۦۡۤۧۦۜ۫ۡۘۙۡۢۢۥۧۨۡۘ"
            goto L_0x0055
        L_0x062d:
            android.view.ViewParent r14 = r54.getParent()
            java.lang.String r2 = "ۢۛۤۡۢۜۗۜۨۢۚۜۢ۫ۡۘۢۢۤۚ۫ۤۤۢ"
            goto L_0x0055
        L_0x0635:
            r51 = -810907722(0xffffffffcfaa87b6, float:-5.7220413E9)
            java.lang.String r2 = "ۛۥۢۥۨۜۚۦ۠ۘ۫ۖۦۦۛۥ۬"
        L_0x063a:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case 304644968: goto L_0x064c;
                case 1043622019: goto L_0x0888;
                case 1255564516: goto L_0x0644;
                case 1512273637: goto L_0x064f;
                default: goto L_0x0643;
            }
        L_0x0643:
            goto L_0x063a
        L_0x0644:
            if (r14 == 0) goto L_0x0649
            java.lang.String r2 = "ۨۙۨۘ۫ۘۜۡۨۗۘۙۙ۫۫ۡۘۧۥۚۚۨۢۙۛۡۘ"
            goto L_0x063a
        L_0x0649:
            java.lang.String r2 = "ۖ۟ۦۚۚۜۛۡۖۥۖ۫۟۟ۧۘۙۡ۟ۤۜ"
            goto L_0x063a
        L_0x064c:
            java.lang.String r2 = "ۢۢۢۤۤۜۘۢۜۥۘ۟ۚ۟ۦۡۧ"
            goto L_0x063a
        L_0x064f:
            java.lang.String r2 = "ۙۨۡۨۢۤۚۤۦۘۧۖۚۥۜۦ۬ۥۨ"
            goto L_0x0055
        L_0x0653:
            r2 = 0
            r14.requestDisallowInterceptTouchEvent(r2)
            java.lang.String r2 = "۫۬ۖۘۡۡ۠ۜۥۡۗۧ۬ۤ۬ۦۢ۠ۤ"
            goto L_0x0055
        L_0x065b:
            r51 = 754013632(0x2cf155c0, float:6.859152E-12)
            java.lang.String r2 = "ۜۘۥۘۚۖۥۘ۟ۗۦ۟ۢ۫ۜ"
        L_0x0660:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1137046907: goto L_0x066a;
                case 751216292: goto L_0x0671;
                case 1518607179: goto L_0x0894;
                case 1705788253: goto L_0x067c;
                default: goto L_0x0669;
            }
        L_0x0669:
            goto L_0x0660
        L_0x066a:
            java.lang.String r2 = "۬۟۫ۛ۬ۜۦۖۖۛۨ۠۬۠ۥۖۥۢۘۥۤۤۘۘۜۘ"
            goto L_0x0055
        L_0x066e:
            java.lang.String r2 = "ۛۖۛۧۜۢۖۜۦۗۦۘۖۧۖۖۨ۬"
            goto L_0x0660
        L_0x0671:
            r0 = r54
            com.obwhatsapp.youbasha.ui.views.t r2 = r0.f1407b
            r0 = r49
            if (r2 == r0) goto L_0x066e
            java.lang.String r2 = "ۛ۬ۥۚۨۤۙۗ۬ۙۘۙ۬ۦۨۘۧۨ۫ۗۨۖۗ۠ۙ"
            goto L_0x0660
        L_0x067c:
            java.lang.String r2 = "ۡۧۘۥ۠ۤ۟ۗۢ۫ۖۗ۫ۗۨۘۡۛۥۨۨۛ"
            goto L_0x0660
        L_0x067f:
            r0 = r54
            com.obwhatsapp.youbasha.ui.views.u r13 = r0.f1408c
            java.lang.String r2 = "ۙۢۥۘۦۚۨۖۖۡۘۤ۠ۜۘۛۥ۟ۜۛ۫ۥۥ۠۬ۤۦ"
            goto L_0x0055
        L_0x0687:
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r12 = r13.f1516b
            java.lang.String r2 = "۬ۢ۬ۖۤ۫۫ۖۧۘۛ۫ۢۖۜۘۚ۫ۛۛۦۜۖۢۤۨ۟ۥ"
            goto L_0x0055
        L_0x068d:
            r51 = 2073947866(0x7b9deeda, float:1.6400702E36)
            java.lang.String r2 = "ۨۨۖۘ۫۬ۤۤۧ۠ۗۖ۠ۡۜۨۤ۠ۜۥۡۡ۫۠ۙۢۛ"
        L_0x0692:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -775277280: goto L_0x069c;
                case 35303281: goto L_0x06ac;
                case 1073189290: goto L_0x06a3;
                case 1890823815: goto L_0x06af;
                default: goto L_0x069b;
            }
        L_0x069b:
            goto L_0x0692
        L_0x069c:
            java.lang.String r2 = "ۥ۬ۖۘۖۥۥ۟ۘۛۡۗۖۘۛۥ۠۠ۖۙ"
            goto L_0x0055
        L_0x06a0:
            java.lang.String r2 = "۠۬ۘۖۦۧۥ۬۬۠ۙۖۙۗۙ۫ۜۘ۫ۛۖۘ۬ۘۧ"
            goto L_0x0692
        L_0x06a3:
            android.view.View r2 = r12.getMainView()
            if (r2 != 0) goto L_0x06a0
            java.lang.String r2 = "ۖۛۡۘۡ۟ۖۗ۬۫ۢۜۘ۫ۙۜۦ۟ۚۛۘ۟"
            goto L_0x0692
        L_0x06ac:
            java.lang.String r2 = "ۗۦۙۧ۬۠۫ۚۥۘۨۥۥۦۜۧۗۙۛ"
            goto L_0x0692
        L_0x06af:
            java.lang.String r2 = "ۜۨۦۜۚۢۙۨۜۚ۬ۖۘۦۡۛ۠ۖۦ"
            goto L_0x0055
        L_0x06b3:
            r51 = 1822721354(0x6ca4854a, float:1.5911462E27)
            java.lang.String r2 = "ۨۥ۟۟ۨۗۜۜ۬ۜۘۖۧ۫ۡ۬۬ۦۘۡۨۦ"
        L_0x06b8:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -501186111: goto L_0x0894;
                case 382294439: goto L_0x06d3;
                case 404327921: goto L_0x06d0;
                case 732667264: goto L_0x06c2;
                default: goto L_0x06c1;
            }
        L_0x06c1:
            goto L_0x06b8
        L_0x06c2:
            com.obwhatsapp.youbasha.ui.views.t r2 = r12.getCurrentDragEdge()
            r0 = r49
            if (r2 == r0) goto L_0x06cd
            java.lang.String r2 = "ۡ۟ۡ۫ۢۦۘ۬۟ۙ۫ۛۨۘۜ۟ۤ۫ۤۤ۫ۘۡۦ۠ۥ"
            goto L_0x06b8
        L_0x06cd:
            java.lang.String r2 = "ۥۙۧ۬ۜۗۛۘۧۢۜ۟ۗۘۛ"
            goto L_0x06b8
        L_0x06d0:
            java.lang.String r2 = "ۙ۠ۙۦۚۜ۟ۖۧ۬ۤ۟ۡۢۛ"
            goto L_0x06b8
        L_0x06d3:
            java.lang.String r2 = "ۧۚۜ۫ۢۨۘۚۖۖۗۥۢۤۥۘۘۥۘۘ۬ۗۨۘۜۗۧ"
            goto L_0x0055
        L_0x06d7:
            r51 = -64524720(0xfffffffffc276e50, float:-3.477404E36)
            java.lang.String r2 = "ۥۛۡۘۦۗۛۚۖ۟ۢۗۦۘۙ۟ۧ۫۠۬ۙ۠ۢۙۚۛۥۨۥ"
        L_0x06dc:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -2044203248: goto L_0x06ed;
                case -898041123: goto L_0x06f4;
                case -93766618: goto L_0x088c;
                case 1855677845: goto L_0x06e6;
                default: goto L_0x06e5;
            }
        L_0x06e5:
            goto L_0x06dc
        L_0x06e6:
            java.lang.String r2 = "ۜۥۧۚۢۨۘۛۚۥۖ۬ۘۘۙۥۢ۠۟ۨۢۙۜۖۨ۫ۢ۠ۡۘ"
            goto L_0x0055
        L_0x06ea:
            java.lang.String r2 = "ۦۘۙۦ۬ۤۢۡۦۘۢۚۢۥ۠۬ۛۨۨۘ۬۟ۨۦ۟ۘ"
            goto L_0x06dc
        L_0x06ed:
            boolean r2 = r12.f1421p
            if (r2 == 0) goto L_0x06ea
            java.lang.String r2 = "ۥۙۦ۟ۥۛۘۜ۠ۨ۫ۡۦۜۢۡۖۘۦۛۚۜۚۢۨۧۥۘ"
            goto L_0x06dc
        L_0x06f4:
            java.lang.String r2 = "ۤۡ۬۬ۘۥۥۧۡ۟ۘۥۦۡۗ"
            goto L_0x06dc
        L_0x06f7:
            r11 = 1048576000(0x3e800000, float:0.25)
            java.lang.String r2 = "ۙۤۘۢ۬ۜ۬ۘ۫ۥۨۥۙۙ۠۫ۗ۬ۧۜۛ"
            goto L_0x0055
        L_0x06fd:
            java.lang.String r2 = "ۜ۠ۡۘۧۦۢۜۛۦۘۛۛۖ۠ۡ۫ۘۚۖ"
            r10 = r11
            goto L_0x0055
        L_0x0702:
            r9 = 1061158912(0x3f400000, float:0.75)
            java.lang.String r2 = "ۡۡۛ۫ۢۦۘۤۙۦۘۖۙ۠ۚۦۥۘ۠ۧ۟ۥۧ۬ۨۧۧ۬ۘۖ"
            goto L_0x0055
        L_0x0708:
            java.lang.String r2 = "ۨۘۤۢ۟ۙۧۙ۠ۥۦۘ۟ۛۥۧ۠ۗۧۨ"
            r10 = r9
            goto L_0x0055
        L_0x070d:
            int r8 = r12.mCurrentOffset
            java.lang.String r2 = "۫ۨۚ۠ۥۦۘۙۙۥۘۘۘۨۘۨۜ۠ۛۨ۬ۨۡۖ"
            goto L_0x0055
        L_0x0713:
            int r7 = r13.f1515a
            java.lang.String r2 = "ۧۤۥۙ۟ۜ۫ۨ۫ۜ۫ۤۜۙۚۘۡۙ"
            goto L_0x0055
        L_0x0719:
            r51 = 1836881032(0x6d7c9488, float:4.8856116E27)
            java.lang.String r2 = "ۖۛۦۘۚۙۨۘۤۤۗۥۢۖ۬۟ۡ۠۬۠ۛۡۡ"
        L_0x071e:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -307316859: goto L_0x074d;
                case 96554897: goto L_0x074a;
                case 103158975: goto L_0x0728;
                case 556371557: goto L_0x072f;
                default: goto L_0x0727;
            }
        L_0x0727:
            goto L_0x071e
        L_0x0728:
            java.lang.String r2 = "ۡۖۡۧۥۙۡۛۦۘۚۚۘۤ۫ۛۦۖۧۘ"
            goto L_0x0055
        L_0x072c:
            java.lang.String r2 = "۠۟ۜۗۛۧۧ۟ۡۤۖۢۚۥۘۘۜ۠ۜۘۧۖۨۘ"
            goto L_0x071e
        L_0x072f:
            int r2 = r8 + 0
            float r2 = (float) r2
            r52 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r52
            int r52 = r7 + 0
            r0 = r52
            float r0 = (float) r0
            r52 = r0
            float r2 = r2 / r52
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x072c
            java.lang.String r2 = "۬ۗ۫ۡ۟ۢۗۖۧۦ۠ۨۡۗۛۘۦۨۘ"
            goto L_0x071e
        L_0x074a:
            java.lang.String r2 = "ۧۘۜۘۨۢۦۗۚۗ۫ۥۚۗۨۨۤۢۗ"
            goto L_0x071e
        L_0x074d:
            java.lang.String r2 = "ۤۨۥۘۜۥۧۘۗۡۧۘۧۧۨۖ۠ۦۘ۫ۙۘۘۘۡ۬ۖۘۡۘ۬ۨۡۘ"
            goto L_0x0055
        L_0x0751:
            r13.b()
            java.lang.String r2 = "ۗۚۜۘۥۥۘ۫ۘۢۘۖۖ۬ۤۡۘۚۢۙۜۢۦۛۜۤ"
            goto L_0x0055
        L_0x0758:
            com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow r2 = r13.f1516b
            r51 = 0
            r0 = r48
            r1 = r51
            r2.smoothScrollTo(r0, r1)
            java.lang.String r2 = "ۢۦۧۘۢۖۘۘ۠۠ۗۗۢۥۨۥۘۘۜۢ۫ۢۙۡۨۖ"
            goto L_0x0055
        L_0x0767:
            r2 = 0
            r0 = r54
            r0.f1424s = r2
            java.lang.String r2 = "ۚۢۘۘۡۨۡۚ۟ۨۘۙ۠ۦۚۦۙ"
            goto L_0x0055
        L_0x0770:
            r2 = 0
            r0 = r54
            r0.f1422q = r2
            java.lang.String r2 = "ۛ۟ۙۘ۟ۨۘۡۥ۠ۨ۠ۡۘ۬۬۟"
            goto L_0x0055
        L_0x0779:
            r2 = 0
            r0 = r54
            r0.f1420o = r2
            java.lang.String r2 = "ۢۙۥۘ۫ۘۨ۠ۗ۠ۡۢۘۙۜ۟ۢۚۜۧۢۜۡۦۨۨۚۦ"
            goto L_0x0055
        L_0x0782:
            r2 = 1
            r0 = r54
            r0.B = r2
            java.lang.String r2 = "ۚۢۢ۠۬ۘ۬ۛۖۘ۠ۙۡۗ۫ۡۘ"
            goto L_0x0055
        L_0x078b:
            r51 = -1016094329(0xffffffffc36fa187, float:-239.63097)
            java.lang.String r2 = "ۖۗۜۖۖۖۨۜۨۘ۬۟ۨۘۨۢۘ"
        L_0x0790:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1027941379: goto L_0x089c;
                case 312727515: goto L_0x07a1;
                case 423340779: goto L_0x07aa;
                case 533900678: goto L_0x079a;
                default: goto L_0x0799;
            }
        L_0x0799:
            goto L_0x0790
        L_0x079a:
            java.lang.String r2 = "ۜۦۘۛۛ۠۠ۜۘۘۛۥۨۤۧۨ"
            goto L_0x0055
        L_0x079e:
            java.lang.String r2 = "۬ۡۦۛۗۘۧۢۛۨۛۧۥۛۧۥۛۨۨۦۘ"
            goto L_0x0790
        L_0x07a1:
            r0 = r54
            android.view.View r2 = r0.f1411f
            if (r2 != 0) goto L_0x079e
            java.lang.String r2 = "ۧ۠ۖۥۨۡۙۨۡۘۦۘۥۗۡۗۚۦۙ"
            goto L_0x0790
        L_0x07aa:
            java.lang.String r2 = "ۦۚۢۜۡۛ۠ۖۦۘۧ۟ۚۗۜۘ"
            goto L_0x0790
        L_0x07ad:
            r4 = 0
        L_0x07ae:
            return r4
        L_0x07af:
            float r2 = r55.getX()
            int r6 = (int) r2
            java.lang.String r2 = "ۧ۬ۚۢ۬ۡۘۗ۫ۖۘۧۛۖۤ۫ۖۘۤۜ۫ۖ۠۬"
            goto L_0x0055
        L_0x07b8:
            r0 = r54
            r0.f1422q = r6
            java.lang.String r2 = "۟۠ۨۘۤۛۦۖۖ۫ۚۗۛۛ۠ۡۥۘۥۨۦۨ"
            goto L_0x0055
        L_0x07c0:
            r0 = r54
            r0.f1424s = r6
            java.lang.String r2 = "ۢۧۜۜ۟ۧۜۜۜۡ۬۟۬۬ۡۘۧۖۘۜۥ۠ۤۡۗۘ۬ۜ"
            goto L_0x0055
        L_0x07c8:
            r2 = 0
            r0 = r54
            r0.B = r2
            java.lang.String r2 = "ۦۖۧۜۨۡۤۜۛۙ۫ۦۘۧۤۢ۟ۦۖۛۚۨۡ۫ۛ۬ۙۨۘ"
            goto L_0x0055
        L_0x07d1:
            java.lang.String r2 = "۬ۦۦۖۘۨۨۗۧۨۨۤۦ۫ۦ۠۠ۘۘۖۜۖۢ۟ۤ"
            r4 = r5
            goto L_0x0055
        L_0x07d6:
            r51 = 258663982(0xf6ae62e, float:1.1581422E-29)
            java.lang.String r2 = "ۦ۬ۧۦۧۧۗۜۦۘۨۦۥۘۙۖۡ"
        L_0x07db:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -758511943: goto L_0x07ec;
                case 1039372638: goto L_0x07e5;
                case 1595353915: goto L_0x080c;
                case 1619930450: goto L_0x07f5;
                default: goto L_0x07e4;
            }
        L_0x07e4:
            goto L_0x07db
        L_0x07e5:
            java.lang.String r2 = "۟ۡۨۘۜۨۤۨۗۖۨ۠۬ۡۛۜۘۛۜۤۗۨۤ"
            goto L_0x0055
        L_0x07e9:
            java.lang.String r2 = "ۡ۬۟۟۠ۗ۠ۧۤۘۢۡۖۚۘۘ۟ۘۜۘ"
            goto L_0x07db
        L_0x07ec:
            boolean r2 = super.onTouchEvent(r55)
            if (r2 != 0) goto L_0x07e9
            java.lang.String r2 = "ۨۧ۬۠۫ۥۘۧۘۧۘۛۤۖ۟ۤۨۦۦ۫ۡۛ۫ۢۢۢ۟۠ۖ"
            goto L_0x07db
        L_0x07f5:
            java.lang.String r2 = "ۦۘۧۘۤۨۖۘۤۧۚۡۜۥۧۛۡۛۙۥۘۧ۬ۗ"
            goto L_0x07db
        L_0x07f8:
            java.lang.String r2 = "۫ۚۦۢۗۨۘۗ۬ۧ۫ۖۥۘ۠ۗۡۘۙۢۧ۟ۡۤ۟ۤۥ"
            r4 = r5
            goto L_0x0055
        L_0x07fd:
            r51 = 1323861365(0x4ee88575, float:1.95053018E9)
            java.lang.String r2 = "ۚۘۦۛ۬ۡۚۜۘۦۛۚ۠ۗ۫ۦ۫ۨۢۤۦۥۥۖ۫ۡ"
        L_0x0802:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -1087472037: goto L_0x0813;
                case -193227047: goto L_0x081f;
                case 622827558: goto L_0x080c;
                case 1308914694: goto L_0x081c;
                default: goto L_0x080b;
            }
        L_0x080b:
            goto L_0x0802
        L_0x080c:
            java.lang.String r2 = "ۦۦۚۖۘۥۘ۫ۜ۟۫۠ۢۥۜۘ۫ۛۨۘۘۖۖ"
            goto L_0x0055
        L_0x0810:
            java.lang.String r2 = "ۨۥۘۘ۠ۗ۫ۧۛۡۘۦ۟۫۬ۦۘۢ۠۟ۚۚ۬ۜۖ"
            goto L_0x0802
        L_0x0813:
            r0 = r54
            boolean r2 = r0.f1420o
            if (r2 != 0) goto L_0x0810
            java.lang.String r2 = "ۜ۟۫ۗ۫ۡ۟۬۫ۘ۟ۢۖۦ۟ۥۤ۟"
            goto L_0x0802
        L_0x081c:
            java.lang.String r2 = "ۙ۫ۖۢۧۜۘۗۜ۟ۘۙۥۧۘۤۛۥۘۤۨۖۘۛۘۙ"
            goto L_0x0802
        L_0x081f:
            java.lang.String r2 = "ۜ۠ۢ۫ۚۜۘۚۥۚ۫۫ۘۘۘۤۨۜ۟۠ۚۥۤ"
            goto L_0x0055
        L_0x0823:
            r51 = 1801820105(0x6b6597c9, float:2.775608E26)
            java.lang.String r2 = "ۗۖۛۧۗۖۘۢۨۚۨۨ۬ۖ۬ۤ"
        L_0x0828:
            int r52 = r2.hashCode()
            r52 = r52 ^ r51
            switch(r52) {
                case -859496511: goto L_0x0839;
                case -364906485: goto L_0x0842;
                case 78585557: goto L_0x0832;
                case 1375246332: goto L_0x08a4;
                default: goto L_0x0831;
            }
        L_0x0831:
            goto L_0x0828
        L_0x0832:
            java.lang.String r2 = "ۙۦۜۘۡۛۤۡۗۢۧ۟ۚۙۖۦۚۤۡ۬۠ۥ"
            goto L_0x0055
        L_0x0836:
            java.lang.String r2 = "ۤۛۧۢ۟ۙ۟۫۫ۚۚ۟۠ۤۛۥۧۘۗۗۦۦۗۨ۠ۥۖ"
            goto L_0x0828
        L_0x0839:
            int r2 = r55.getAction()
            if (r2 != 0) goto L_0x0836
            java.lang.String r2 = "ۢۘ۬۬ۦۦۘۧۖۘۡۢۢ۬ۖۢۨۙۥۘ"
            goto L_0x0828
        L_0x0842:
            java.lang.String r2 = "ۢۡ۟ۡ۟ۥۘۦۡۜۘ۫۟ۛ۬ۖۜۘۗۜۦۘ"
            goto L_0x0828
        L_0x0845:
            java.lang.String r2 = "ۘۚ۬ۤۛۦۘۢ۫ۡۤ۟ۧۨ۟ۛۢۤۤ"
            r4 = r5
            goto L_0x0055
        L_0x084a:
            r3 = 0
            java.lang.String r2 = "۠۟ۖۘۡۡۨۘۙۚۜۧۚۡۢ۬ۙ۠ۖۘ"
            goto L_0x0055
        L_0x084f:
            java.lang.String r2 = "ۦۦۚۖۘۥۘ۫ۜ۟۫۠ۢۥۜۘ۫ۛۨۘۘۖۖ"
            r4 = r3
            goto L_0x0055
        L_0x0854:
            java.lang.String r2 = "ۗ۬ۥ۬ۙۙۙ۟۠ۡۛۤۖۖۙۥۜۘۘۤ۫"
            goto L_0x0055
        L_0x0858:
            java.lang.String r2 = "ۖ۠ۘۘۡ۠ۙۛۨۛۨ۠ۦۡۧۦ۬ۢۡۛۙۨۘۥۜۧۘ۫۬ۨۘ"
            goto L_0x0055
        L_0x085c:
            java.lang.String r2 = "ۛۖۦۘ۬ۨۧۘۖۧۡۜۘ۠ۚۦۖۚۚۖۘ"
            goto L_0x0055
        L_0x0860:
            java.lang.String r2 = "ۘۗۛۙۗۖۘۙۖۜۢ۬۫ۘ۫ۙۥۦۥۜۖۛ۬ۦۙۢۢۥ"
            goto L_0x0055
        L_0x0864:
            java.lang.String r2 = "ۚۤۖۛۙۨۚ۟ۥ۟۠۠ۗۢۦۘ"
            goto L_0x0055
        L_0x0868:
            java.lang.String r2 = "ۡ۬ۜۘۢۛۗۨ۟ۚ۠ۙۥۧ۟ۜۤ۫۠ۘۚۨۘ"
            goto L_0x0055
        L_0x086c:
            java.lang.String r2 = "ۜ۠ۧۤۡۜۘۖۨۖ۫ۙۜۘۨۗۧۢۦۖ"
            goto L_0x0055
        L_0x0870:
            java.lang.String r2 = "ۜۧۡۦۤۛۜ۟ۗۙ۫ۦ۫ۤ۫ۛ۬ۖ۫ۤۛۜۜۚۡ"
            goto L_0x0055
        L_0x0874:
            java.lang.String r2 = "ۘ۟ۢ۠۠ۘۖ۫ۨۘ۠ۗۙۙۧۙۨۚۨۘۧۨۘ"
            goto L_0x0055
        L_0x0878:
            java.lang.String r2 = "ۙ۫ۢ۟ۨۜۧ۠ۨۧ۫ۧ۟ۘ"
            goto L_0x0055
        L_0x087c:
            java.lang.String r2 = "ۥۨۢ۫ۛۦۛۘۘۘۥۦۘۜ۬ۜۡۘۜۧ۠ۜ۫ۜۗ"
            goto L_0x0055
        L_0x0880:
            java.lang.String r2 = "۟ۙۘۛۚۨۘۜۜۨۘۡۚۛ۬ۖۨۤۛۥ۟ۛۡۘۤۛۥۘ"
            goto L_0x0055
        L_0x0884:
            java.lang.String r2 = "۬ۡۙۛۤۧۗۦۥۦۨۦۘ۟ۖ۟ۚۘۛۚۚ۠ۡۙ"
            goto L_0x0055
        L_0x0888:
            java.lang.String r2 = "۫۬ۖۘۡۡ۠ۜۥۡۗۧ۬ۤ۬ۦۢ۠ۤ"
            goto L_0x0055
        L_0x088c:
            java.lang.String r2 = "ۗۥ۟۠ۖۨۘۧۢۗۤۗۥۡ۬"
            goto L_0x0055
        L_0x0890:
            java.lang.String r2 = "ۨۘۤۢ۟ۙۧۙ۠ۥۦۘ۟ۛۥۧ۠ۗۧۨ"
            goto L_0x0055
        L_0x0894:
            java.lang.String r2 = "ۢۦۧۘۢۖۘۘ۠۠ۗۗۢۥۨۥۘۘۜۢ۫ۢۙۡۨۖ"
            goto L_0x0055
        L_0x0898:
            java.lang.String r2 = "۟ۨ۫ۗۨۛۧ۫ۖۘۙۥۚۨۡۨ۬ۤۚۡۛ۠"
            goto L_0x0055
        L_0x089c:
            java.lang.String r2 = "۠ۖۦۘۖ۠ۜۘ۠۬ۜۘ۠ۗۦ۬ۧۜۘ"
            goto L_0x0055
        L_0x08a0:
            java.lang.String r2 = "ۢۧۜۜ۟ۧۜۜۜۡ۬۟۬۬ۡۘۧۖۘۜۥ۠ۤۡۗۘ۬ۜ"
            goto L_0x0055
        L_0x08a4:
            java.lang.String r2 = "ۜۨۘۜۤۘ۬ۧۗۛۚۧۨ۬ۜۘۗۜۘ۠۫ۗۤۖۥ"
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoSwipeableConvRow.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void openMenu() {
        u uVar = null;
        String str = "ۚۙ۟ۤۚۖ۬ۜ۫ۛۜۘ۫ۗۢۦۨۡۨۨ";
        while (true) {
            switch ((str.hashCode() ^ 240) ^ 1716615775) {
                case -1990185831:
                    uVar.b();
                    str = "ۡۢ۬ۦۙ۫۟ۢۦۘۧۨۙۚۖ";
                    break;
                case -1659707254:
                    str = "ۥۘۜۘ۠ۥۙۥۖۛۢۨۘۛ۬ۢۖۗۚ";
                    break;
                case 229576878:
                    String str2 = "۫ۖۘۡۚۡۢ۠ۖۚۛ۬ۛۡۧۘ۠۟ۙۨۙۘۘۚ۫۠ۥۖۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 636051303) {
                            case -1912504118:
                                str = "۟۠۟ۧۙۨۙۚۨ۟ۙۥۘ۫۟ۧۖۖۜۖ۠ۥ";
                                continue;
                            case -1610716019:
                                if (uVar == null) {
                                    str2 = "ۜۖ۠ۖ۟ۥۘۢۙۢۦۧۤۤۙۦۘۜۤۢۙۨۚۧۡۘ";
                                    break;
                                } else {
                                    str2 = "ۥۗۘۘۖ۟ۗۗۧۢ۟ۘۢۛۤ۫ۖۚۗۥ۬ۖۘ";
                                    break;
                                }
                            case 683962250:
                                str2 = "ۙۘۥۙۙۡۦۖ۬۫ۛ۫ۙۦ۟ۥۘۙۥۤ";
                                break;
                            case 793441707:
                                str = "ۡۢ۬ۦۙ۫۟ۢۦۘۧۨۙۚۖ";
                                continue;
                        }
                    }
                    break;
                case 1091004762:
                    uVar = this.f1408c;
                    str = "ۦۛۙۗ۠۫ۦۢۧ۠ۨ۫۟ۛۤۚۗۤۜۨۘۘ";
                    break;
                case 1703749597:
                    return;
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        String str = "ۡ۫ۥۧۧۦۜۖۦ۟ۧ۬ۦۨۘۘ۠۫";
        while (true) {
            switch ((str.hashCode() ^ 808) ^ 1847238944) {
                case -2007276456:
                    str = "۬ۢۗۜ۬ۡ۠ۛۤۦۗۡۘۚۘۛۙۢۦۘۗۨۦ";
                    break;
                case -1342877674:
                    str = "ۥ۫ۦۘۛۥۡۜ۠ۗ۠ۙ۠۫ۗ۬ۜ۠ۙۘۤۙۚۨۡۖۧۘ";
                    break;
                case -734853705:
                    return;
                case 506532881:
                    super.setOnClickListener(onClickListener);
                    str = "ۚۤۦۘۗۥۗۚۖۜۘۧۘۢۘۨ۬ۡۨۘۢۧۨۛ۫ۛۖ۬ۘۘ";
                    break;
            }
        }
    }

    public void setSwipeRowData(Object obj) {
        String str = "ۗ۠ۨۘۘ۠ۥۧۦ۬۠۫ۜۜۙ۫ۡۖۘ۬۠ۨۘۙۦۘۘۨۨۖ";
        while (true) {
            switch ((str.hashCode() ^ 511) ^ -811707269) {
                case -1796490741:
                case -1650054789:
                    return;
                case -1283148836:
                    this.f1412g.setOnClickListener(new r(this, 2));
                    str = "ۦۜ۬ۚۥۖ۟۫ۧۤۖۧۤۙۡ";
                    break;
                case -1053700545:
                    str = "ۡۤۜۘۚ۠ۤۚۙۜۘۨ۠ۘۘ۟ۜۚۨۗۦۥ۬ۡۘ";
                    break;
                case -581770589:
                    this.f1413h.setOnClickListener(new r(this, 1));
                    str = "ۘۙۤۜۗۛ۟ۧ۠ۗۥ۬۬ۡۥۘۨۖۘۤۤۗ";
                    break;
                case 66312923:
                    this.f1415j.setOnClickListener(new r(this, 4));
                    str = "ۢۚۘ۠ۡۤۜۚۥۘۚۨۚۢۙۜۘۙۡ۠ۗۚۢۤۘۥ";
                    break;
                case 659003024:
                    this.f1431z = obj;
                    str = "ۧۢۤۦۥۙۙۧۜۘ۟۫ۡۨۙۜۘ";
                    break;
                case 842169945:
                    this.f1414i.setOnClickListener(new r(this, 3));
                    str = "ۥۛۧۧۤ۟ۦۗۚ۫ۥۖ۠ۨ۫";
                    break;
                case 1363795692:
                    str = "ۜ۫۟ۛۤۗۗۖۗۤۧ۫ۖۦۜۘۡۢ";
                    break;
                case 1663657134:
                    String str2 = "ۘۨ۬ۙۡۗ۫ۡۢۡۤۤ۬ۘۜۘۙۨ۫ۦ۟ۘ۫ۧۛۡ۠۟";
                    while (true) {
                        switch (str2.hashCode() ^ -1206220495) {
                            case -2077576123:
                                if (obj != null) {
                                    str2 = "ۙ۟ۗ۟ۨۦۖۙۚۥ۠ۢ۠۫۫ۨۨۜ۬۠";
                                    break;
                                } else {
                                    str2 = "ۖۧۥۘۨۗۧۡۜۨۥ۟۬۟ۥۛۦۨۡۘۗۨۜۘ";
                                    break;
                                }
                            case 697173981:
                                str = "ۜۢ۬ۛۡۨۚۦ۫ۘ۫ۦۧۙۦۘ";
                                continue;
                            case 774279827:
                                str2 = "ۙ۬۠۬۬ۜۢۨۛۦ۠ۥۦۘۖ";
                                break;
                            case 2047966830:
                                str = "ۨۗۖۘۨۛۛۚۨۛۚۜۘۚۡۖ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public final void smoothScrollTo(w wVar, int i2) {
        String str = "ۢۦۖ۫۬ۡۘ۫۫ۦۗۦۖ۟";
        v vVar = null;
        int i3 = 0;
        int i4 = 0;
        v vVar2 = null;
        g gVar = null;
        while (true) {
            switch ((str.hashCode() ^ 480) ^ -442155423) {
                case -2135772567:
                    str = "۫ۦۧۜۙۘۖۙۥۦۡۘۤ۫ۘۜۥۖۦ۠ۡۖۨۘ۫ۗ۫";
                    break;
                case -2064561153:
                    gVar = this.f1430y;
                    str = "ۥۖۙ۟ۘۦۘ۠ۦۦۘ۫ۗۗۦۘ۬O۠ۚۖۘۗۗۡۘ";
                    break;
                case -1686177520:
                    i3 = (int) this.f1411f.getY();
                    str = "ۡۖ۠ۜۙۗۤۢ۠ۙۛ۬۟ۛۡۘ۠ۗۙ۬ۘۧۢۜۥ";
                    break;
                case -1402827937:
                    vVar2.f1521e.removeCallbacks(vVar2);
                    str = "۫ۚۥۦۤۖۘۢۤۡۤۜۜ۫ۧۢ۟ۡ";
                    break;
                case -688525468:
                    return;
                case -399051941:
                    str = "۬ۧۧۛۡۤۜ۠ۤۗ۟ۦۛۘ۠۫ۨۜۦۛۗۤۨۘ";
                    break;
                case -255325815:
                    str = "ۦ۬ۤۧ۠ۛۤۚۥۦۙۦۚۚۡ۟ۜۘ۫ۡۧۖۡۖۘ";
                    vVar2 = this.f1429x;
                    break;
                case -50591351:
                    str = "ۦۖۜۘ۠ۖۢۖ۬ۙۦۛۢۚۤۢۘۨۘۦۤۧ";
                    vVar = this.f1429x;
                    break;
                case 348653153:
                    vVar2.f1517a.forceFinished(true);
                    str = "۟۠ۘۘۥۨۧۘۙۛۨۙۚۢۢۘۖۘۖۥۜۘۥۤۨۘۦ۬۬۫۫ۢ";
                    break;
                case 658842307:
                    vVar.f1521e.postDelayed(vVar, vVar.f1520d);
                    str = "ۜۘۜۧۤ۠ۖۦۖۘ۠ۛۘۦۘۦۘ۫ۖۧۜۤ۬۟۫ۥ";
                    break;
                case 729643918:
                    vVar.f1517a.startScroll(i4, i3, i2 - i4, 0, 200);
                    str = "۫ۢۦۖۦۦۗۥۜۘۦ۠ۧۙ۟";
                    break;
                case 745828743:
                    this.f1429x = new v(this, wVar, gVar, (long) 0);
                    str = "ۘ۬۫ۗۡۖۧۧۗۗۛۦۛۨ۠ۚۦۚ۠ۜۨ";
                    break;
                case 866925996:
                    str = "ۧۚۨۗۛۚ۫ۤۘۘۙۤۥۢۜۨۘ۠ۛ۫";
                    i4 = this.mCurrentOffset;
                    break;
                case 957713661:
                    String str2 = "ۚۗۥ۬ۜۤۘۛ۟ۛۨۘۥۦۘۨ۠ۦۗۨۜۘۘۨۘۘۖۢ";
                    while (true) {
                        switch (str2.hashCode() ^ -385576174) {
                            case -1877357942:
                                str2 = "ۥۦۜۘۙۥۖۛۛ۫ۧۢ۬۫ۗۦۘۤۘ۠۬۠ۘۘۥۡۨ";
                                break;
                            case -1736298737:
                                str = "ۧۘۡۘۥۡۧۤۙۜۖ۟ۖۘۚ۫ۘۘ";
                                continue;
                            case -1575491543:
                                if (vVar2 == null) {
                                    str2 = "ۚۜۙۡۡ۠ۙۦۤۚۢۙ۬ۜۙ";
                                    break;
                                } else {
                                    str2 = "ۙ۫ۙۙ۟ۡۛۗۥۘ۟ۘ۬ۗ۫ۦۘۥۙۨۘۗۚۧۖۤۘ۟ۧۨۘ";
                                    break;
                                }
                            case -1179352844:
                                str = "۫ۚۥۦۤۖۘۢۤۡۤۜۜ۫ۧۢ۟ۡ";
                                continue;
                        }
                    }
                    break;
                case 1743752821:
                    str = "ۧۖۤۧۙۗۙۡۦۗۜۘۘۡۤۤ۠ۧۡۘۥۨۡۧۦۡۘ";
                    break;
            }
        }
    }
}
